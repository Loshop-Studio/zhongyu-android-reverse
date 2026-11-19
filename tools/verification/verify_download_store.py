"""Exercise original Room, OkDownload and FileDownloader stores across separate Android processes."""
import argparse
from hashlib import sha256
import json
import os
from pathlib import Path
import re
import sqlite3
import subprocess
import sys
import tempfile
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]
sys.path.insert(0,str(ROOT/'tools'))
from download_store import decode

HOST = 'local.zy.downloadroom'
APPS = ('在线专栏','中育管控桌面','优课畅学','随身答','中育云笔记')
SEGMENT_APPS = {'新测评': 's1', '随身答': 'r1', '领创平板管理-2025.9.1': 'linspirer'}
TOTAL, PART = 9007199254740993, 4294967303


def run(*args, data=None):
    return subprocess.run(args,input=data,stdout=subprocess.PIPE,check=True).stdout


def install_input(adb, apk):
    adb('shell','pm','clear',HOST)
    adb('shell','run-as',HOST,'mkdir','-p','files')
    adb('shell','-T',f"run-as {HOST} sh -c 'cat > files/target.apk'",data=apk.read_bytes())


def phase_report(adb, name, probe, phase, *extra):
    log=adb('shell','am','instrument','-w','-r','-e','phase',phase,*extra,HOST+'/.'+probe).decode()
    if 'INSTRUMENTATION_CODE: -1' not in log: raise RuntimeError(f'{name} {phase}\n{log}')
    return {'phase': phase, **json.loads(adb('exec-out','run-as',HOST,'cat','files/report.json'))}


def segmented_store(adb, name, ns, dest):
    apk=ROOT/'中育apk'/(name+'.apk')
    install_input(adb,apk)
    phases=[phase_report(adb,name,'BreakpointStoreProbe',p,'-e','namespace',ns) for p in ('write','reopen')]
    assert phases[0]['pid']!=phases[1]['pid']
    assert {k:v for k,v in phases[0].items() if k not in ('pid','phase')}=={k:v for k,v in phases[1].items() if k not in ('pid','phase')}
    family='filedownloader' if ns=='linspirer' else 'okdownload'
    filename='filedownloader.db' if ns=='linspirer' else 'okdownload-breakpoint.db'
    path=dest/name/filename
    path.parent.mkdir(exist_ok=True)
    path.write_bytes(adb('exec-out','run-as',HOST,'cat','databases/'+filename))
    decoded=decode(path,family)
    assert decoded==json.loads(run(sys.executable,ROOT/'tools/read-data.py',path,'--type',family))
    if family=='okdownload':
        assert decoded['user_version']==3 and decoded['dirty_ids']==[72]
        assert [b['current_offset'] for b in decoded['block']]==[31,75,13]
        assert decoded['block'][1]['next_file_offset']==4294967475
        assert decoded['response_filenames'][0]['filename']=='final.pdf'
    else:
        assert decoded['user_version']==4 and decoded['filedownloader'][0]['sofar']==99
        assert [r['downloaded_in_connection'] for r in decoded['connections']]==[31,75]
        assert decoded['connections'][1]['endOffset']==-1
    print(name,family,decoded['user_version'],flush=True)
    return {'app':name,'family':family,'apk_sha256':sha256(apk.read_bytes()).hexdigest(),
            'database_sha256':sha256(path.read_bytes()).hexdigest(),'phases':phases,'decoded':decoded}


def main():
    cli=argparse.ArgumentParser(description=__doc__)
    cli.add_argument('serial')
    cli.add_argument('output',type=Path)
    cli.add_argument('--app',choices=sorted(set(APPS)|set(SEGMENT_APPS)))
    args=cli.parse_args()
    if not re.fullmatch(r'emulator-\d+',args.serial): cli.error('Supply a disposable Android emulator')
    args.output.mkdir(parents=True,exist_ok=True)
    sdk=Path(os.environ['ANDROID_HOME'])
    bt=sdk/'build-tools/35.0.0'
    platform=sdk/'platforms/android-35/android.jar'
    def adb(*cmd,data=None): return run(sdk/'platform-tools/adb','-s',args.serial,*cmd,data=data)
    with tempfile.TemporaryDirectory() as tmp:
        d=Path(tmp)
        manifest=d/'AndroidManifest.xml'
        manifest.write_text(f'<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="{HOST}"><uses-sdk android:minSdkVersion="26" android:targetSdkVersion="29"/><application android:debuggable="true"/><instrumentation android:name=".DownloadRoomProbe" android:targetPackage="{HOST}"/><instrumentation android:name=".BreakpointStoreProbe" android:targetPackage="{HOST}"/></manifest>')
        run('javac','--release','8','-cp',platform,'-d',d,*[Path(__file__).with_name(f+'.java') for f in ('DownloadRoomProbe','BreakpointStoreProbe')])
        run(bt/'d8','--lib',platform,'--min-api','26','--output',d,*sorted((d/'local/zy/downloadroom').glob('*.class')))
        apk=d/'probe.apk'
        run(bt/'aapt2','link','-I',platform,'--manifest',manifest,'-o',apk)
        with ZipFile(apk,'a') as z:z.write(d/'classes.dex','classes.dex')
        run(bt/'zipalign','-f','4',apk,d/'aligned.apk')
        run(bt/'apksigner','sign','--ks',ROOT/'.work/build/debug.jks','--ks-pass','pass:android','--out',d/'signed.apk',d/'aligned.apk')
        adb('install','-r',d/'signed.apk')
        combined=[]
        for name in APPS:
            if args.app and args.app!=name: continue
            origin=ROOT/'中育apk'/(name+'.apk')
            install_input(adb, origin)
            phases=[phase_report(adb,name,'DownloadRoomProbe',phase) for phase in ('write','reopen')]
            assert phases[0]['pid']!=phases[1]['pid']
            dbfile=args.output/name/'download.db'
            dbfile.parent.mkdir(exist_ok=True)
            dbfile.write_bytes(adb('exec-out','run-as',HOST,'cat','databases/download.db'))
            decoded=decode(dbfile,'download-room')
            rows=decoded['download']
            assert decoded['upload_ids']==[] and len(rows)==2
            assert [[r[k] for k in ('id','totalSize','downloadSize','verifyCode','flag','flagName')] for r in rows]==[
                [1,TOTAL,TOTAL,'local-check',1,'DOWNLOAD_SUCCESS'],[2,123456789012,PART,None,0,'DOWNLOADING']]
            assert rows[0]['downloadUrl']==rows[1]['downloadUrl'] and rows[0]['localPath']!=rows[1]['localPath']
            cli_result=json.loads(run(sys.executable,ROOT/'tools/read-data.py',dbfile,'--type','download-room'))
            assert cli_result==decoded
            phases.append(phase_report(adb,name,'DownloadRoomProbe','files'))
            combined.append({'app':name,'family':'download-room','apk_sha256':sha256(origin.read_bytes()).hexdigest(),
                          'database_sha256':sha256(dbfile.read_bytes()).hexdigest(),'phases':phases,'decoded':decoded})
            print(name,decoded['user_version'],decoded['room_identity'],flush=True)
        # Independently preserve future integer flags and ID-only upload rows in a copy.
        if combined:
            scratch=d/'expanded.db'
            scratch.write_bytes(dbfile.read_bytes())
            with sqlite3.connect(scratch) as sql:
                sql.execute("UPDATE download SET flag=8 WHERE id=2")
                sql.execute("INSERT INTO upload(id) VALUES (37)")
            future=decode(scratch,'download-room')
            assert (future['download'][1]['flag'],future['download'][1]['flagName'],future['upload_ids'])==(8,None,[37])
        for name,ns in SEGMENT_APPS.items():
            if not args.app or args.app==name: combined.append(segmented_store(adb,name,ns,args.output))
        (args.output/'verification.json').write_text(json.dumps(combined,ensure_ascii=False,indent=2)+'\n')


if __name__=='__main__':
    main()

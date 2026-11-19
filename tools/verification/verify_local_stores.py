"""Compare original APK serializers with local JSON and Protobuf decoders on synthetic files."""
import argparse
import hashlib
import json
import os
from pathlib import Path
import subprocess
import sys
import tempfile

ROOT = Path(__file__).resolve().parents[2]
SCHEMAS = ROOT / 'tools/schemas'
OUT = ROOT / 'reports/evidence/local-stores'
PREFS = 'androidx.datastore.preferences.core.PreferencesFileSerializer'
STUDY = 'com.zykj.study.provide.SettingsSerializer'
OTA_STUDY = 'com.zykj.lib.ota.provide.UpdateSettingsSerializer'
OTA_LAUNCHER = 'com.zykj.huiwei.launcher.providers.UpdateSettingsSerializer'
STUDENT = 'com.zykj.huiwei.launcher.providers.StudentInfoSerializer'
# A future varint field on the outer message tests each serializer's preservation policy.
EXTRA = bytes.fromhex('f8 07 53')
DRAFTS = {
    'localAnswer.bin': {'q-example':['甲、乙','line\n二','<tag> & "text"',''],'q-empty':[]},
    'localCorrectResult.bin': {'q-example':2,'q-zero':0},
    'Correct_NeedRevise.bin': [{'questionId':9007199254740993,'uuid':'local-a','needRevise':True},
                               {'questionId':42,'uuid':'local-b','needRevise':False}],
}
PAGE='cachePageIndex: 11 cachePagePositionOffset: 0.375'
PROFILE='id: 9007199254740993 studentNumber: "LOCAL-07" classId: 17 className: "合成班" enterSchoolYear: "2025" gradeName: "测试年级"'
VALUES = '''
preferences {key:"bool" value {boolean:false}}
preferences {key:"float" value {float_value:0.375}}
preferences {key:"int" value {integer:-7}}
preferences {key:"long" value {long_value:9007199254740993}}
preferences {key:"text" value {string_value:"本地样本"}}
preferences {key:"set" value {string_set {strings:"甲" strings:"甲" strings:"乙"}}}
preferences {key:"double" value {double_value:1.125}}
preferences {key:"bytes" value {bytes_value:"\\000\\177\\377"}}
'''

def run(*args, data=None):
    process=subprocess.run(args, input=data, stdout=subprocess.PIPE)
    if process.returncode:
        sys.stderr.buffer.write(process.stdout)
        process.check_returncode()
    return process.stdout

def proto(operation, schema, message, data):
    return run('protoc','-I'+str(SCHEMAS),f'--{operation}={message}',schema,data=data)

def sha(data):
    return hashlib.sha256(data).hexdigest()

def main():
    parser=argparse.ArgumentParser(description=__doc__)
    parser.add_argument('serial',help='Disposable Android emulator')
    serial=parser.parse_args().serial
    if not serial.startswith('emulator-'): parser.error('Supply an emulator serial')
    sdk=Path(os.environ['ANDROID_HOME']); jdk=Path(os.environ['JAVA_HOME'])/'bin'
    os.environ['PATH']=str(jdk)+os.pathsep+os.environ['PATH']
    def adb(*args): return run(sdk/'platform-tools/adb','-s',serial,*args)
    report=[]
    with tempfile.TemporaryDirectory(prefix='zy-local-stores-') as temp:
        work=Path(temp); remote='/data/local/tmp/'+work.name
        platform=sdk/'platforms/android-35/android.jar'
        run(jdk/'javac','--release','8','-d',work,Path(__file__).with_name('LocalStoresProbe.java'))
        run(sdk/'build-tools/35.0.0/d8','--min-api','26','--lib',platform,'--output',work/'probe.jar',work/'LocalStoresProbe.class')
        adb('shell','mkdir',remote)
        try:
            adb('push',work/'probe.jar',remote+'/')
            cases={'新测评':['evaluation'],'优课畅学':[STUDY,PREFS,OTA_STUDY],'中育管控桌面':[STUDENT,PREFS,OTA_LAUNCHER],'随身答':[PREFS]}
            for app, serializers in cases.items():
                apk=ROOT/'中育apk'/(app+'.apk')
                adb('push',apk,remote+'/target.apk')
                for serializer in serializers:
                    row={'app':app,'apk_sha256':sha(apk.read_bytes()),'entry':serializer}
                    folder=work/app/serializer.split('.')[-1];folder.mkdir(parents=True)
                    remote_case=remote+'/'+str(len(report))
                    adb('shell','mkdir',remote_case)
                    if serializer=='evaluation':
                        host=folder/'host';host.mkdir()
                        for name,value in DRAFTS.items():
                            (host/name).write_text(json.dumps(value,ensure_ascii=False,indent=2)+'\n')
                        adb('push',host,remote_case+'/')
                    else:
                        if serializer==PREFS: spec=('PreferenceMap.proto','PreferenceMap',VALUES,'types.preferences_pb')
                        elif serializer in (OTA_STUDY,OTA_LAUNCHER): spec=('UpdateSetting.proto','UpdateSetting','ignoreVersionCode: 8107','updateSettings.pb')
                        elif serializer==STUDY: spec=('LocalStudy.proto','StudyPageSettings',PAGE,'settings.pb')
                        else: spec=('LocalStudy.proto','LauncherStudentInfo',PROFILE,'studentInfo.pb')
                        schema,message,fields,name=spec
                        initial=proto('encode',schema,message,fields.encode())+EXTRA
                        (folder/'input.pb').write_bytes(initial);adb('push',folder/'input.pb',remote_case+'/')
                    invoke=[sdk/'platform-tools/adb','-s',serial,'shell',f'CLASSPATH={remote}/probe.jar:{remote}/target.apk',
                            'app_process','/system/bin','LocalStoresProbe',serializer,remote_case]
                    process=subprocess.run(invoke,stdout=subprocess.PIPE,stderr=subprocess.STDOUT)
                    log=process.stdout.decode().strip()
                    if process.returncode:
                        missing='Field ignoreVersionCode_ for t3.a not found.'
                        if serializer!=OTA_STUDY or missing not in log:
                            raise RuntimeError(log)
                        # The message info names a member that is absent from this
                        # particular DEX. Record the vendor result without repair.
                        row.update(file=name,input_sha256=sha(initial),
                                   status='original-reader-error',native=next(line for line in log.splitlines() if missing in line))
                        report.append(row);print(app,serializer,row['native'],flush=True)
                        continue
                    target=OUT/app;target.mkdir(parents=True,exist_ok=True)
                    if serializer=='evaluation':
                        samples={}
                        for name,value in DRAFTS.items():
                            raw=adb('exec-out','cat',remote_case+'/'+name)
                            assert json.loads(raw)==value
                            dest=target/name;dest.write_bytes(raw)
                            local=json.loads(run(sys.executable,ROOT/'tools/read-data.py',dest))
                            assert local==value
                            samples[name]={'bytes':len(raw),'sha256':sha(raw)}
                        row['files']=samples
                    else:
                        raw=adb('exec-out','cat',remote_case+'/native.pb')
                        expected=fields.replace('strings:"甲" strings:"甲"','strings:"甲"') if serializer==PREFS else fields
                        retained=serializer!=PREFS
                        canonical=proto('encode',schema,message,expected.encode())+(EXTRA if retained else b'')
                        dest=target/name;dest.write_bytes(raw)
                        decoded=run(sys.executable,ROOT/'tools/read-data.py',dest,'--app',app)
                        assert decoded==proto('decode',schema,message,canonical), (app,serializer,decoded)
                        row.update(file=name,bytes=len(raw),sha256=sha(raw),input_sha256=sha(initial),
                                   retained_future_field=retained,decoded=decoded.decode())
                    row['native']=log
                    report.append(row);print(app,serializer,log,flush=True)
        finally: adb('shell','rm','-r',remote)
    (OUT/'native.json').write_text(json.dumps(report,ensure_ascii=False,indent=2)+'\n')

if __name__=='__main__':
    main()

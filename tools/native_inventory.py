"""Deduplicate ELF analysis by payload digest and record ABI-specific dependencies."""
import json,re,subprocess,tempfile
from hashlib import sha256
from pathlib import Path
from zipfile import ZipFile
from chromium_datapack import DataPack, TBS_PACKS
ROOT=Path(__file__).resolve().parents[1]
roles={'libobjectbox-jni.so':'ObjectBox 的 JNI 桥','libjniPdfium.so':'PDFium 的 JNI 桥','libmodpdfium.so':'PDF 解析与渲染','libmp3lame.so':'MP3 编码','libijkplayer.so':'IJK 播放器','libijkffmpeg.so':'IJK 的 FFmpeg 媒体组件','libtensorflowlite.so':'TensorFlow Lite 推断','libopencv_java4.so':'OpenCV Java 桥','libanswer_sheet.so':'答题卡原生模块','libimage_processing_util_jni.so':'图像处理 JNI','libdatastore_shared_counter.so':'DataStore 进程间计数','libc++_shared.so':'Android NDK C++ 运行时','libmarsxlog.so':'Mars Xlog 日志','libBugly_Native.so':'Bugly 原生崩溃采集'}
all_libs={}
with tempfile.TemporaryDirectory() as tmp:
 path=Path(tmp)/'lib.so'
 for apk in sorted((ROOT/'中育apk').glob('*.apk')):
    rows=[]
    with ZipFile(apk) as z:
      for member in z.namelist():
        if not(member.startswith('lib/') and member.endswith('.so')):continue
        blob=z.read(member);digest=sha256(blob).hexdigest()
        if not blob.startswith(b'\x7fELF'):
            if Path(member).name in TBS_PACKS:
                pack=DataPack(blob)
                rows.append(dict(member=member,size=len(blob),sha256=digest,format='Chromium DataPack v5',
                                 resource_count=len(pack.entries),alias_count=len(pack.aliases)))
                continue
            kind='ZIP/JAR' if blob.startswith(b'PK\x03\x04') else 'JSON' if blob.lstrip().startswith((b'{',b'[')) else 'text' if all(c in b'\r\n\t' or 32<=c<127 for c in blob[:160]) else 'binary data'
            rows.append(dict(member=member,size=len(blob),sha256=digest,format=kind))
            continue
        if digest not in all_libs:
            path.write_bytes(blob)
            output=subprocess.check_output(['readelf','-W','-h','-d','-n','-S','--dyn-syms',str(path)],text=True,errors='replace',stderr=subprocess.DEVNULL)
            machine=re.search(r'^\s*Machine:\s*(.+)$',output,re.M)
            exports=[line for line in output.splitlines() if re.match(r'\s*\d+:',line) and ' FUNC ' in line and ' UND ' not in line and (' GLOBAL ' in line or ' WEAK ' in line)]
            bid=re.search(r'Build ID: (\w+)',output)
            all_libs[digest]=dict(machine=machine[1].strip() if machine else None,build_id=bid[1] if bid else None,
              needed=re.findall(r'\(NEEDED\)\s+Shared library: \[([^\]]+)\]',output),symbols=len(exports),
              static_jni_exports=sum(' Java_' in line for line in exports),jni_onload=any(' JNI_OnLoad' in line for line in exports),
              has_debug_info=' .debug_info ' in output)
        rows.append(dict(member=member,size=len(blob),format='ELF',sha256=digest,role=roles.get(Path(member).name),**all_libs[digest]))
    folder=ROOT/'reports/apps'/apk.stem
    (folder/'native.json').write_text(json.dumps(rows,ensure_ascii=False,indent=1)+'\n')
 print('unique ELF payloads',len(all_libs))

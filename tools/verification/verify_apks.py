"""Check rebuilt class identities, resource payloads and signatures against every input."""
from pathlib import Path
from hashlib import sha256
from zipfile import ZipFile
import json
import os
import re
import struct
import subprocess

root=Path(__file__).resolve().parents[2]
jdk=os.environ.get('JAVA_HOME','/home/jdz/dev/jdk-21.0.13+9')
sdk=Path(os.environ.get('ANDROID_HOME','/home/jdz/dev/android-sdk'))
env=dict(os.environ,JAVA_HOME=jdk,PATH=jdk+'/bin:'+os.environ['PATH'])
def u32(b,p):return struct.unpack_from('<I',b,p)[0]
def table(d):
    string_count,string_offset,type_count,type_offset=struct.unpack_from('<IIII',d,56)
    def string(i):
        pos=u32(d,string_offset+4*i)
        while d[pos]&128:pos+=1
        pos+=1
        return d[pos:d.index(0,pos)]
    types=[string(u32(d,type_offset+i*4)) for i in range(type_count)]
    n,at=struct.unpack_from('<II',d,96)
    return {types[u32(d,at+i*32)] for i in range(n)}
def keep(name):
    return not (name.endswith('/') or re.fullmatch(r'META-INF/(?:[^/]+\.(?:SF|RSA|DSA|EC)|MANIFEST\.MF)',name,re.I))
rows=[]
for original in sorted((root/'中育apk').glob('*.apk')):
    rebuilt=root/'dist'/original.name
    cmd=[str(sdk/'build-tools/35.0.0/apksigner'),'verify','--verbose',str(rebuilt)]
    verify=subprocess.run(cmd,env=env,capture_output=True,text=True)
    with ZipFile(original) as a, ZipFile(rebuilt) as b:
        aa={f for f in a.namelist() if keep(f)};bb={f for f in b.namelist() if keep(f)}
        dex=sorted(f for f in aa if re.fullmatch(r'classes\d*\.dex',f))
        diffs=[f for f in sorted((aa&bb)-set(dex)) if a.read(f)!=b.read(f)]
        classes={}
        for f in dex:
            old=table(a.read(f));new=table(b.read(f))
            classes[f]={'original':len(old),'rebuilt':len(new),'different_descriptors':len(old^new)}
        rows.append(dict(app=original.stem,original_sha256=sha256(original.read_bytes()).hexdigest(),
           rebuilt_sha256=sha256(rebuilt.read_bytes()).hexdigest(),missing=sorted(aa-bb),extra=sorted(bb-aa),
           changed_non_dex_payloads=diffs,classes=classes,signature_status=verify.returncode,
           schemes=[line for line in verify.stdout.splitlines() if line.startswith('Verified using') and line.endswith('true')]))
p=root/'reports/evidence/build-verification.json';p.write_text(json.dumps(rows,ensure_ascii=False,indent=2)+'\n')
for r in rows:print(r['app'],r['signature_status'],len(r['missing']),len(r['extra']),len(r['changed_non_dex_payloads']),sum(v['different_descriptors'] for v in r['classes'].values()))

if any(r['signature_status'] or r['missing'] or r['extra'] or r['changed_non_dex_payloads'] or any(c['different_descriptors'] for c in r['classes'].values()) for r in rows):
    raise SystemExit(1)

"""Suggest stripped class names only for unambiguous, exact cross-APK fingerprints."""
from pathlib import Path
from collections import defaultdict
from hashlib import sha256
import json,re

root=Path(__file__).resolve().parents[1]
paths=sorted((root/'android').glob('*/apktool.yml'))
named=defaultdict(lambda:defaultdict(set))
stripped=defaultdict(dict)
for meta in paths:
    app=meta.parent.name
    for dex in meta.parent.glob('smali*'):
        for f in dex.rglob('*.smali'):
            cls=f.relative_to(dex).as_posix()[:-6]
            if '$' in f.stem:continue
            short=len(f.stem)<=3 and bool(re.fullmatch('[a-zA-Z]+',f.stem))
            known=cls.startswith(('com/zykj/','com/friday/','com/zhongyukejiao/','com/linspirer/')) and not short and 'databinding/' not in cls
            if not (short or known):continue
            data=f.read_bytes()
            literals=sorted(set(re.findall(rb'const-string(?:/jumbo)? [vp]\d+, "([^"\n]{5,180})"',data)))
            invokes=sorted(set(re.findall(rb'invoke-[^\n]+?, (L(?:java|android)/[^;]+;->[\w$<>]+)\(',data)))
            if len(literals)<3 or len(invokes)<3:continue
            shape=(str(data.count(b'\n.method ')).encode(),str(len(literals)).encode(),*literals,b'--framework--',*invokes)
            fp=sha256(b'\0'.join(shape)).hexdigest()
            if known:named[fp][cls].add(app)
            if short:stripped[app][cls]=(fp,len(literals),len(invokes),str(f.relative_to(root)))
for meta in paths:
    app=meta.parent.name;rows=[]
    for cls,(fp,nl,ni,relative) in stripped[app].items():
        matches=named.get(fp,{})
        if len(matches)!=1:continue
        stable,apps=next(iter(matches.items()));others=sorted(apps-{app})
        if not others:continue
        rows.append(dict(dex_class=cls,candidate=stable,reference_apps=others,sha256=fp,distinct_literals=nl,framework_calls=ni,source=relative))
    (root/'reports/apps'/app/'shared-symbols.json').write_text(json.dumps(rows,ensure_ascii=False,indent=1)+'\n')
    print(app,len(rows),flush=True)

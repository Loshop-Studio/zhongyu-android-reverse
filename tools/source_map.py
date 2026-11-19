"""Recover Kotlin inline source mappings and annotate matching decompiled classes."""
from pathlib import Path
import re,json
from collections import defaultdict

ROOT=Path(__file__).resolve().parents[1]
source_pattern=re.compile(rb'SMAP\\n([^"\\]+)\\nKotlin\\n.*?\+ 1 ([^"\\]+)\\n([A-Za-z_$][\w/$]+)\\n')
source_decl=re.compile(rb'^\.source "([^"]+)"',re.M)
owned=('com/friday/','com/zykj/','com/linspirer/','com/zhongyukejiao/','com/android/launcher3/','com/android/hccontrol/')
for app in sorted((ROOT/'android').glob('*/apktool.yml')):
    project=app.parent; dest=ROOT/'reports/apps'/project.name
    mapping={}; notes={}; modules=defaultdict(list)
    for d in project.glob('smali*'):
        for f in d.rglob('*.smali'):
            raw=f.read_bytes()
            path=f.relative_to(d).as_posix()[:-6]
            match=source_pattern.search(raw)
            meta=source_decl.search(raw)
            name=meta.group(1).decode('utf-8',errors='replace') if meta else ''
            record={'dex':d.name}
            if name not in ('','SourceFile','Unknown Source','Unknown',''):record['source_file']=name
            if match:
                record['smap_file']=match[2].decode(errors='replace')
                record['smap_owner']=match[3].decode(errors='replace')
            if len(record)>1:mapping[path]=record
            if not path.startswith(owned):continue
            note=re.search(rb'^# RE note (.+)$',raw,re.M)
            parts=path.rpartition('/')
            if note:notes[path.split('/')[-1]]=note[1].decode()
            if '$' in parts[2] or re.fullmatch(r'R|[a-z]{1,3}|BuildConfig',parts[2]) or 'databinding' in parts[0]:continue
            methods=[m.decode(errors='replace') for m in re.findall(rb'(?m)^\.method (?:[^\n]* )?(\w+)\(',raw) if len(m)>4 and not m.startswith((b'access',b'copy',b'getClass',b'component',b'hashCode',b'toString',b'equals'))]
            if len(methods):
                modules[parts[0]].append((parts[2],methods[:7],f.relative_to(ROOT).as_posix()))
    (dest/'kotlin-sources.json').write_text(json.dumps(mapping,ensure_ascii=False,indent=1))
    with (dest/'business-modules.md').open('w') as w:
        w.write('# '+project.name+' 业务代码导航\n\n每个表格对应一个保留业务命名空间的包，方法来自 DEX 的类定义。点击类名可查看参与编译的实现。生成绑定、单字母类及第三方库另见完整包索引。\n')
        for pkg,rows in sorted(modules.items()):
            w.write('\n## '+pkg.replace('/','.')+'\n\n| 类 | 方法摘录 |\n|---|---|\n')
            for cls,methods,path in sorted(rows):
                w.write('| ['+cls+'](../../../'+path+') | '+'、'.join('`'+m+'`' for m in methods)+' |\n')
    java=ROOT/'sources'/project.name/'java'; changed=0
    for f in java.glob('com/**/*.java'):
        rel=f.relative_to(java).as_posix()
        if not rel.startswith(owned):continue
        note=notes.get(f.stem)
        if not note:continue
        data=f.read_text()
        if '// RE note ' in data:continue
        pos=data.find('\n',data.find('package '))
        if pos<0:continue
        # For semantic notes require a raw package match. JADX may renumber a package.
        folder=re.sub(r'/p\d+([A-Za-z][\w]*)/',r'/\1/',rel)[:-5]
        if not any((d/(folder+'.smali')).is_file() for d in project.glob('smali*')):continue
        raw_file=next(d/(folder+'.smali') for d in project.glob('smali*') if (d/(folder+'.smali')).is_file())
        m=re.search(rb'^# RE note (.+)$',raw_file.read_bytes(),re.M)
        if m:
            f.write_text(data[:pos]+'\n\n// RE note '+m[1].decode()+data[pos:]);changed+=1
    print(project.name,'SMAP/source rows',len(mapping),'annotated Java classes',changed,flush=True)

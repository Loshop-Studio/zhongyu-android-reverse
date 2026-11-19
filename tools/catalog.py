"""Index the manifest, compiled packages, storage calls and concrete schemas for each APK."""
from smali_sql import statements
from pathlib import Path
from collections import Counter, defaultdict
from hashlib import sha256
from zipfile import ZipFile
import json
import re
import xml.etree.ElementTree as ET

ROOT = Path(__file__).resolve().parents[1]
OUT = ROOT / 'reports'
A = '{http://schemas.android.com/apk/res/android}'
OWNED = ('com/zykj/', 'com/friday/', 'com/zhongyukejiao/', 'com/linspirer/', 'com/android/launcher3/', 'com/android/hccontrol/')
TYPES = {
    '偏好设置': (b'Landroid/content/SharedPreferences;', b'->getSharedPreferences('),
    'SQLite': (b'Landroid/database/sqlite/SQLiteDatabase;->', b'Landroidx/sqlite/db/SupportSQLiteDatabase;->'),
    'ObjectBox': (b'Lio/objectbox/Box;->', b'Lio/objectbox/BoxStore;->'),
    'DataStore': (b'Landroidx/datastore/core/DataStore;',),
    'JSON': (b'Lcom/google/gson/Gson;->', b'Lorg/json/JSONObject;->', b'Lcom/alibaba/fastjson/JSON;->'),
    'Protobuf': (b'Lcom/google/protobuf/AbstractMessageLite;->writeTo', b'Lcom/google/protobuf/CodedInputStream;->', b'Lcom/google/protobuf/GeneratedMessage'),
    'Java 对象流': (b'Ljava/io/ObjectInputStream;->readObject', b'Ljava/io/ObjectOutputStream;->writeObject'),
    'ZIP': (b'Ljava/util/zip/ZipFile;->', b'Ljava/util/zip/ZipOutputStream;->', b'Ljava/util/zip/ZipInputStream;->'),
    '文件流': (b'Ljava/io/FileInputStream;->', b'Ljava/io/FileOutputStream;->'),
    '位图': (b'Landroid/graphics/Bitmap;->compress', b'Landroid/graphics/BitmapFactory;->decodeFile'),
    'WebView': (b'Landroid/webkit/WebView;->loadUrl', b'Landroid/webkit/WebView;->loadData'),
}
# Only name an alias when a retained debug string, schema or call site supports it.
NOTES = {
    'LocalAnswerManager':'读取和写入 localAnswer.bin。Gson TypeToken 为 Map<String,List<String>>。',
    'LocalCorrectResultManager':'localCorrectResult.bin 以 JSON 保存 Map<String,Integer>。',
    'CorrectCommitManager':'Correct_NeedRevise.bin 的根节点是 NeedReviseData 数组。',
    'FileValidateUtils':'对资源文件中的字节计算摘要，供文件完整性校验。',
    'BoardDataFactory$Companion':'组装 Sketch 的 BoardHead、BoardBody 与独立 Header。buildHead 设置所写版本。',
    'VersionParseFactory$Companion':'按头部版本选择动作解析器，兼容 V1 的 Any 列表。',
    'GraphTaskParseVersion5':'把第 5 版动作记录和图元快照转为可回放的绘图任务。',
    'LocalAnswerManager$readLocalAnswer$1':'Gson 用此 TypeToken 保留答案映射的泛型实参。',
    'CommonLoginRequestHelper':'领创普通登录的客户端请求入口。服务端验权需单独验证。',
    'InitLoginHelper':'初次登录请求的客户端编排入口。',
    'PageControl':'管理 Blackboard 页面编辑状态及页面快照。',
    'ActionRecord':'将 Sketch 原生画板事件封装为动作消息并持久化。',
}
def dump(p,obj):
    p.write_text(json.dumps(obj,ensure_ascii=False,indent=2)+'\n')
def safe_link(s):
    return s.replace(' ','%20').replace('(','%28').replace(')','%29')
def process(f):
    name=f.stem
    project=ROOT/'android'/name
    folder=OUT/'apps'/name
    folder.mkdir(parents=True,exist_ok=True)
    root=ET.parse(OUT/'evidence/manifests'/f'{name}.xml').getroot()
    app=root.find('application')
    components=[(x.tag,x.get(A+'name','')) for x in app if x.tag in ('activity','activity-alias','service','provider','receiver')]
    index=defaultdict(lambda:{'classes':0,'methods':0,'storage':Counter(),'sample':[]})
    locations=defaultdict(list); sql={}; entities={}; bins=defaultdict(set)
    comments=0
    for dex in sorted(project.glob('smali*')):
        for p in sorted(dex.rglob('*.smali')):
            cls=p.relative_to(dex).as_posix()[:-6]
            pkg=cls.rpartition('/')[0].replace('/','.') or '(default)'
            entry=index[pkg]
            data=p.read_bytes()
            entry['classes']+=1
            entry['methods']+=data.count(b'\n.method ')
            if '$' not in p.stem and len(entry['sample'])<4:entry['sample'].append(p.stem)
            storage=[k for k,patterns in TYPES.items() if any(v in data for v in patterns)]
            entry['storage'].update(storage)
            for k in storage:locations[k].append(cls)
            for st in statements(data):
                sql.setdefault(st,[]).append(cls)
            for n in re.findall(rb'const-string(?:/jumbo)? [vp]\d+, "([^"\n ]{0,110}\.bin)"',data):
                bins[n.decode(errors='replace')].add(cls)
            if b'Lio/objectbox/EntityInfo;' in data and b'Lio/objectbox/Property;' in data and p.stem.endswith('_'):
                fields=re.findall(rb'const-string(?:/jumbo)? [vp]\d+, "([a-zA-Z_$][a-zA-Z_0-9$]*)"',data)
                entities[cls]=list(dict.fromkeys(v.decode() for v in fields))
            note=NOTES.get(p.stem) if cls.startswith(OWNED) else None
            if p.stem=='ProtoFileUtils$Companion' and '/sketch/' in cls:note='将 actions.bin 和 header.bin 作为两种独立的 Protobuf 消息读写。'
            if p.stem=='ProtoFileUtils' and b'loadDataToList' in data:note='用 SimpleBoardData 读取和保存路径列表，坐标与画笔在各 Path 中。'
            if not note and cls.startswith(OWNED) and storage:
                note='本类字节码直接引用的读写或显示接口包括'+'、'.join(storage)+'。'
            if note:
                comments+=1
                if b'# RE note ' not in data:
                    p.write_bytes(('# RE note '+note+'\n').encode()+data)
    with ZipFile(f) as z:
        assets=[n for n in z.namelist() if n.startswith('assets/') and not n.endswith('/')]
        schemas=[n for n in z.namelist() if n.endswith('.proto') and not n.startswith('google/')]
        libs=sorted(n for n in z.namelist() if n.startswith('lib/') and n.endswith('.so'))
        dexes=[n for n in z.namelist() if re.fullmatch(r'classes\d*\.dex',n)]
    dump(folder/'storage.json',{'calls':locations,'objectbox_entity_metadata':entities,'sqlite_ddl':sql,'bin_literals':{k:sorted(v) for k,v in bins.items()},'protobuf_files':schemas,'assets':assets,'native_libraries':libs})
    dump(folder/'packages.json',index)
    with (folder/'modules.md').open('w') as w:
        w.write('# '+name+' 模块索引\n\n包名保留 DEX 中的位置。类数包含内部类。读写标签取自本包直接引用的 API，同一类可以同时出现多种标签。\n\n| 包 | 类 / 方法 | 类示例 | 直接证据 |\n|---|---:|---|---|\n')
        for pkg,e in sorted(index.items()):
            w.write('| '+pkg+f" | {e['classes']} / {e['methods']} | "+', '.join(e['sample'])+' | '+'、'.join(e['storage'])+' |\n')
    rea=json.loads((OUT/'evidence/rea'/f'{name}.json').read_text())
    assert rea['subject']['digest']['sha256']==sha256(f.read_bytes()).hexdigest()
    md=[f'# {name}','',f"包名 `{root.get('package')}`，版本 `{root.get(A+'versionName')}`（{root.get(A+'versionCode')}）。{len(dexes)} 个 DEX，{len(index)} 个包，{sum(v['classes'] for v in index.values())} 个类。",'',
        f"REA 证据编号 `{rea['evidence_id']}`。输入 SHA-256 为 `{rea['subject']['digest']['sha256']}`。",'',
        '[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)','',
        '## Android 组件','','| 类型 | 实现 |','|---|---|',*[f'| {kind} | `{cls}` |' for kind,cls in components],'','## 文件与数据','']
    if bins: md+=['| BIN 文件名或后缀 | 引用位置之一 |','|---|---|',*[f'| `{n}` | `{sorted(c)[0]}` |' for n,c in sorted(bins.items())],'']
    md += [f'包内有 {len(schemas)} 个应用 Protobuf 定义、{len(entities)} 个直接识别的 ObjectBox 元数据类、{len(sql)} 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 {len(assets)} 个 assets 条目。','',
        '## 代码与构建','',f'反汇编工程中有 {comments} 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/{name}/names.jobf`。Gradle 任务 `:{name}:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。','']
    profile_path=ROOT/'dist/dex-metadata/android-11'/(name+'.dm')
    if profile_path.is_file():
        md += [f'本包附有匹配重编 DEX 的 Android 11 性能配置，已随 APK 安装并经系统读回编译状态。[配套 DM](../../../dist/dex-metadata/android-11/{name}.dm) · [校验值与规则记录](../../evidence/art-profiles.json)','']
    ui_file=folder/'resource-files.json'
    if ui_file.exists():
        ui=json.loads(ui_file.read_text())
        md += [f"本包的资源表有 {ui['entries']:,} 条文件及配置记录，其中 {ui['changed_paths']:,} 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 {len(ui['activity_references'])} 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)",'']
    report=folder/'README.md'
    reading_notes=report.read_text().partition('\n## 阅读入口\n')[2] if report.exists() else ''
    report.write_text('\n'.join(md)+('\n## 阅读入口\n'+reading_notes if reading_notes else ''))
    print(name,len(index),len(entities),len(sql),comments,flush=True)
if __name__=='__main__':
    for apk in sorted((ROOT/'中育apk').glob('*.apk')):process(apk)

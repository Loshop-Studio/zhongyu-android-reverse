"""Annotate concrete storage operations at the calling method and write a per-app index."""
import re
from pathlib import Path
from collections import Counter

ROOT = Path(__file__).resolve().parents[1]
OWNED = ("com/friday", "com/zykj", "com/zhongyukejiao", "com/linspirer", "com/android/launcher3")
INVOKE = re.compile(r"^\s*invoke-[^\n]*?\}, L([^;]+);->([^\s(]+)\(", re.M)
METHOD = re.compile(r"^\.method ([^\n]+)\n[\s\S]*?^\.end method\b", re.M)
RULES = {
    "com/google/gson/Gson": {"fromJson":"读取 JSON","toJson":"写入 JSON"},
    "android/content/SharedPreferences": {"getString":"读取字符串偏好","getStringSet":"读取字符串集合偏好","getInt":"读取整数偏好","getBoolean":"读取布尔偏好","getLong":"读取长整数偏好","getFloat":"读取浮点偏好"},
    "android/content/SharedPreferences$Editor":{"putString":"保存字符串偏好","putStringSet":"保存字符串集合偏好","putBoolean":"保存布尔偏好","putInt":"保存整数偏好","putLong":"保存长整数偏好","putFloat":"保存浮点偏好"},
    "android/database/sqlite/SQLiteDatabase":{"query":"查询 SQLite","rawQuery":"执行 SQLite 查询","insert":"插入 SQLite 记录","update":"更新 SQLite 记录","delete":"删除 SQLite 记录","execSQL":"执行 SQLite 语句"},
    "androidx/sqlite/db/SupportSQLiteDatabase":{"execSQL":"执行 SQLite 语句","query":"查询 SQLite"},
    "io/objectbox/Box":{"get":"读取 ObjectBox 实体","put":"写入 ObjectBox 实体","remove":"删除 ObjectBox 实体","getAll":"枚举 ObjectBox 实体"},
    "java/io/ObjectInputStream":{"readObject":"读取 Java 序列化对象"},
    "java/io/ObjectOutputStream":{"writeObject":"写入 Java 序列化对象"},
    "java/util/zip/ZipInputStream":{"getNextEntry":"顺序读取 ZIP 成员"},
    "java/util/zip/ZipOutputStream":{"putNextEntry":"创建 ZIP 成员"},
    "android/graphics/Bitmap":{"compress":"编码位图"},
    "android/graphics/BitmapFactory":{"decodeFile":"解码本地图片","decodeStream":"从数据流解码图片"},
}
def inspect(app):
    project=ROOT/"android"/app
    out=ROOT/"reports/apps"/app/"data-operations.md"
    rows=[]
    for dex in sorted(project.glob("smali*")):
        for ns in OWNED:
            for p in sorted((dex/ns).rglob("*.smali")):
                s=p.read_text()
                if not any(k in s for k in RULES):
                    continue
                def method(m):
                    signature=m[1].rsplit(" ",1)[-1]
                    direct=[]
                    for owner, target in INVOKE.findall(m[0]):
                        action=RULES.get(owner,{}).get(target)
                        if action:
                            pair=(action,owner.rpartition("/")[2]+"."+target)
                            if pair not in direct:direct.append(pair)
                    if not direct:return m[0]
                    desc="、".join(action+"（"+target+"）" for action,target in direct)
                    rows.append((p.relative_to(dex).as_posix()[:-6],signature,desc,p.relative_to(ROOT).as_posix()))
                    return "# RE I/O "+desc+"。\n"+m[0]
                s=re.sub(r"^# RE I/O [^\n]*\n","",s,flags=re.M)
                old=p.read_text()
                new=METHOD.sub(method,s)
                if new!=old:p.write_text(new)
    with out.open("w") as w:
        w.write("# "+app+" 数据操作\n\n方法签名保留 DEX 类型。每行列出方法内直接调用的存储或编解码接口。\n\n| 实现 | 方法 | 操作 |\n|---|---|---|\n")
        for cls,sig,desc,path in rows:
            w.write(f"| [{cls}](../../../{path}) | `{sig}` | {desc} |\n")
    print(app,len(rows),flush=True)
if __name__=="__main__":
    for apk in sorted((ROOT/"中育apk").glob("*.apk")):inspect(apk.stem)

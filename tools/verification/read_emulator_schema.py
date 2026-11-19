"""Capture SQLite catalogs from the project's disposable, offline Android emulator."""
import json
import shlex
import subprocess
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
SERIAL = sys.argv[1]
def adb(*args):
    return subprocess.run(["adb","-s",SERIAL,*args],capture_output=True,text=True,timeout=30)
def shell(*args):
    return adb("shell",shlex.join(args))

if not SERIAL.startswith("emulator-") or adb("emu","avd","name").stdout.splitlines()[0]!="zy_app_compat":
    sys.exit("Expected the offline project AVD zy_app_compat")
if shell("id","-u").stdout.strip()!="0":
    sys.exit("Catalog inspection requires the root shell of this disposable userdebug AVD")
for app in json.loads((ROOT/"reports/evidence/emulator-compat.json").read_text())["apps"]:
    directory=f"/data/user/0/{app['package']}/databases"
    paths=shell("find",directory,"-maxdepth","1","-type","f").stdout.splitlines()
    entries=[]
    for path in sorted(paths):
        if not path.startswith(directory+"/") or path.endswith(("-wal","-shm","-journal")):
            continue
        q="SELECT type,hex(name),hex(tbl_name),hex(sql) FROM sqlite_master WHERE type IN ('table','index','view') AND sql IS NOT NULL ORDER BY type,name;"
        res=shell("sqlite3","-batch","-readonly",path,q)
        if res.returncode:
            entries.append({"file":Path(path).name,"catalog_read":False})
            continue
        def unhex(s):return bytes.fromhex(s).decode()
        objects=[]
        for row in res.stdout.splitlines():
            typ,name,table,sql=row.split("|")
            objects.append(dict(type=typ,name=unhex(name),table=unhex(table),sql=unhex(sql)))
        version=shell("sqlite3","-batch","-readonly",path,"PRAGMA user_version;")
        entries.append(dict(file=Path(path).name,user_version=int(version.stdout.strip()),objects=objects))
    dest=ROOT/"reports/apps"/app["app"]/"emulator-sqlite.json"
    dest.write_text(json.dumps(dict(package=app["package"],databases=entries),ensure_ascii=False,indent=2)+"\n")
    print(app["app"],len(entries),sum(len(e.get("objects",[])) for e in entries),flush=True)

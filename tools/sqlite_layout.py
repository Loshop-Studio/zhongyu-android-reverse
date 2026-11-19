"""Recover columns, keys and indexes from individual DEX SQL constants using local SQLite."""
import json
import re
import sqlite3
from collections import defaultdict
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
CREATE_TABLE = re.compile(r"^CREATE\s+(?:VIRTUAL\s+)?TABLE\b", re.I)

def describe(db, name):
    columns = [
        {"name": col, "type": typ, "not_null": bool(required), "default": default, "primary_key_order": pk, "hidden": hidden}
        for _, col, typ, required, default, pk, hidden in db.execute("SELECT * FROM pragma_table_xinfo(?)", (name,))
    ]
    refs = [dict(zip(("group", "position", "target", "local_column", "target_column", "on_update", "on_delete", "match"), row))
            for row in db.execute("SELECT * FROM pragma_foreign_key_list(?)", (name,))]
    return {"table": name, "columns": columns, "foreign_keys": refs}

def inspect(ddl):
    tables = defaultdict(list)
    indexes = []
    unresolved = []
    for statement, owners in ddl.items():
        if not CREATE_TABLE.match(statement):
            indexes.append((statement, owners))
            continue
        with sqlite3.connect(":memory:") as db:
            try:
                db.execute(statement)
                names = [r[0] for r in db.execute("SELECT name FROM sqlite_schema WHERE type='table' AND name NOT LIKE 'sqlite_%' ORDER BY rowid")]
                if not names:
                    raise ValueError("no table created")
                # Use the declared table itself. Virtual module shadow tables belong to SQLite.
                name = names[0]
                data = describe(db, name)
                data.update(sql=statement, owners=owners)
                tables[name].append(data)
            except (ValueError, sqlite3.Error) as error:
                unresolved.append(dict(sql=statement, owners=owners, reason=str(error)))
    recovered = []
    for statement, owners in indexes:
        errors = set()
        for variants in tables.values():
            for variant in variants:
                with sqlite3.connect(":memory:") as db:
                    try:
                        db.execute(variant["sql"])
                        db.execute(statement)
                        row = db.execute("SELECT name,tbl_name FROM sqlite_schema WHERE type='index' AND sql IS NOT NULL ORDER BY rowid DESC LIMIT 1").fetchone()
                        if not row:
                            continue
                        index, table = row
                        keys = [{"column": col, "descending": bool(desc), "collation": coll}
                                for _, _, col, desc, coll, key in db.execute("SELECT * FROM pragma_index_xinfo(?)",(index,)) if key]
                        recovered.append(dict(index=index, table=table, keys=keys, sql=statement, owners=owners))
                        break
                    except sqlite3.Error as error:
                        errors.add(str(error))
            else:
                continue
            break
        else:
            unresolved.append(dict(sql=statement, owners=owners, reason=sorted(errors)[:3] or ["no matching standalone CREATE TABLE"]))
    return dict(tables=dict(sorted(tables.items())), indexes=recovered, unresolved=unresolved)


def with_recorded_schemas(ddl, recorded):
    """Supplement literal DDL with table definitions read back from Android SQLite."""
    ddl = dict(ddl)
    owners = {"migration": "androidx/work/impl/WorkDatabase_AutoMigration_13_14_Impl",
              "okgo": "d7/c", "history": "com/loc/ef",
              "tbs-audio": "libtbs.audio_base.jar.so!com/tencent/smtt/audio/core/db/DBManager"}
    partial = {"okgo": "CREATE TABLE IF NOT EXISTS ", "history": "CREATE TABLE IF NOT EXISTS hist"}
    cases = []
    for kind, data in recorded.get("cases", {}).items():
        if kind in partial:
            ddl.pop(partial[kind])
        tables = [row for row in data["objects"] if row["type"] == "table"]
        for row in tables:
            ddl[row["sql"]] = sorted(set(ddl.get(row["sql"], [])) | {owners[kind]})
        cases.append({"case": kind, "tables": [row["name"] for row in tables]})
    result = inspect(ddl)
    if cases:
        result["android_schema_evidence"] = {
            "file": "../../evidence/sqlite-dynamic.json", "apk_sha256": recorded["apk_sha256"], "cases": cases}
    return result


if __name__ == "__main__":
    recorded = json.loads((ROOT/"reports/evidence/sqlite-dynamic.json").read_bytes())["apps"]
    for p in sorted((ROOT/"reports/apps").glob("*/storage.json")):
        result = with_recorded_schemas(json.loads(p.read_text())["sqlite_ddl"], recorded.get(p.parent.name, {}))
        (p.parent/"sqlite-layout.json").write_text(json.dumps(result, ensure_ascii=False, indent=2)+"\n")
        print(p.parent.name,len(result["tables"]),len(result["indexes"]),len(result["unresolved"]))

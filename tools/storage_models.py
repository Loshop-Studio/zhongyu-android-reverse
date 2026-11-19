"""Index first-party DEX data fields and explicit Gson serialized names, without example values."""
from pathlib import Path
import re
import json

ROOT = Path(__file__).resolve().parents[1]
NAMESPACES = ("com/friday/", "com/zykj/", "com/zhongyukejiao/", "com/linspirer/", "com/android/launcher3/")
CLASS_KIND = re.compile(r"(?:^|/)(?:beans?|models?|entity|entities|dao|dto)(?:/|$)", re.I)
DATA_SUFFIX = re.compile(r"(?:Entity|Bean|Data|Model|Dto)$")
FIELD = re.compile(r"^\.field ([^:\n]+):([^\s=]+)[^\n]*\n((?:\s*\.annotation[^\n]*\n[\s\S]*?\.end annotation\n)*)", re.M)
SERIALIZED = re.compile(r'\.annotation runtime Lcom/google/gson/annotations/SerializedName;\s+value = "([^"\n]+)"')
SIGNATURE = re.compile(r'\.annotation system Ldalvik/annotation/Signature;\s+value = \{([^}]+)\}', re.S)
PRIMITIVE = {"I":"int","J":"long","F":"float","D":"double","B":"byte","S":"short","C":"char","Z":"boolean"}

def type_name(desc):
    if desc.startswith("["):
        return type_name(desc[1:]) + "[]"
    return PRIMITIVE.get(desc,desc.removeprefix("L").removesuffix(";").replace("/", "."))

def collect(project):
    result = {}
    for dex in project.glob("smali*"):
        for ns in NAMESPACES:
            for file in (dex/ns).rglob("*.smali"):
                path = file.relative_to(dex).as_posix().removesuffix(".smali")
                if "$" in file.stem or not (CLASS_KIND.search(path) or DATA_SUFFIX.search(file.stem)):
                    continue
                data=file.read_text()
                fields=[]
                for flags, desc, annotations in FIELD.findall(data):
                    parts=flags.split()
                    if "static" in parts or "synthetic" in parts or "transient" in parts:
                        continue
                    field={"field":parts[-1], "type":type_name(desc)}
                    name=SERIALIZED.search(annotations)
                    if name:
                        field["gson_serialized_name"]=name[1]
                    signature=SIGNATURE.search(annotations)
                    if signature:
                        field["generic_descriptor"]="".join(re.findall(r'"([^"]*)"',signature[1]))
                    fields.append(field)
                if fields:
                    result[path.replace("/",".")]={"smali":file.relative_to(ROOT).as_posix(), "fields":fields}
    return dict(sorted(result.items()))

if __name__ == "__main__":
    for apk in sorted((ROOT/"中育apk").glob("*.apk")):
        result=collect(ROOT/"android"/apk.stem)
        dest=ROOT/"reports/apps"/apk.stem/"storage-models.json"
        dest.write_text(json.dumps(result, ensure_ascii=False, indent=2)+"\n")
        print(apk.stem,len(result),sum(len(v["fields"]) for v in result.values()))

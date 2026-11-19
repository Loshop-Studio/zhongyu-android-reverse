"""Exercise dynamic SQLite schema builders in the original Android packages."""
import argparse
import hashlib
import json
import os
from pathlib import Path
import re
import shlex
import subprocess
import tempfile
import uuid
from zipfile import ZipFile

ROOT = Path(__file__).resolve().parents[2]
MIGRATION = "androidx/work/impl/WorkDatabase_AutoMigration_13_14_Impl"
MIGRATION_INDEX = "index_WorkSpec_period_start_time"


def verify(serial):
    if not serial.startswith("emulator-"):
        raise ValueError("Select an Android emulator")
    sdk = Path(os.environ.get("ANDROID_HOME", "/home/jdz/dev/android-sdk"))
    jdk = Path(os.environ.get("JAVA_HOME", "/home/jdz/dev/jdk-21.0.13+9"))
    env = dict(os.environ, PATH=str(jdk/"bin") + os.pathsep + os.environ["PATH"])

    def run(*args):
        p = subprocess.run(args, env=env, capture_output=True, timeout=120)
        if p.returncode:
            raise RuntimeError((p.stdout+p.stderr).decode(errors="replace")[-2200:])
        return p.stdout.decode()

    adb = [sdk/"platform-tools/adb", "-s", serial]
    platform = sdk/"platforms/android-35/android.jar"
    result = {}
    with tempfile.TemporaryDirectory(prefix="zy-schema-") as tmp:
        root = Path(tmp)
        run(jdk/"bin/javac", "--release", "8", "-cp", platform, "-d", root,
            ROOT/"tools/verification/SqlSchemaProbe.java")
        run(sdk/"build-tools/35.0.0/d8", "--min-api", "26", "--lib", platform, "--output",
            root/"probe.jar", root/"SqlSchemaProbe.class")
        remote = "/data/local/tmp/zy-schema-"+uuid.uuid4().hex[:16]
        run(*adb, "shell", "mkdir", remote)
        try:
            run(*adb, "push", root/"probe.jar", remote+"/probe.jar")
            for apk in sorted((ROOT/"中育apk").glob("*.apk")):
                appdir = ROOT/"android"/apk.stem
                cases = {}
                classpath = remote+"/probe.jar:"+remote+"/source.apk"
                if (next(appdir.glob("smali*/"+MIGRATION+".smali"), None)):
                    cases["migration"] = []
                if apk.stem == "中育云笔记":
                    cases["okgo"] = []
                if apk.stem == "优课畅学":
                    # TBS stores the helper as JVM bytecode and its DBUtils dependency as DEX.
                    with ZipFile(apk) as source:
                        for short, original in (("audio", "audio_base"), ("core", "tbs_jars_fusion_dex")):
                            jar = root/(short+".jar")
                            jar.write_bytes(source.read("lib/armeabi-v7a/libtbs."+original+".jar.so"))
                            if short == "audio":
                                dex = root/"audio-dex.jar"
                                run(sdk/"build-tools/35.0.0/d8", "--min-api", "26", "--lib", platform, "--output", dex, jar)
                                jar = dex
                            run(*adb, "push", jar, remote+"/"+short+".jar")
                    cases["tbs-audio"] = []
                if apk.stem.startswith("领创"):
                    code = next(appdir.glob("smali*/com/loc/ef.smali")).read_text()
                    match = re.search(r'"(CREATE TABLE IF NOT EXISTS hist)".{1,600}?->k:Ljava/lang/String;.{1,600}?const-string \w+, "( \(feature [^"]+)"', code, re.S)
                    if not match:
                        raise ValueError("Missing the history table's DEX literals")
                    cases["history"] = list(match.groups())
                if not cases:
                    continue
                run(*adb, "push", apk, remote+"/source.apk")
                entry = {"apk_sha256": hashlib.sha256(apk.read_bytes()).hexdigest(), "cases": {}}
                for name, params in cases.items():
                    case_classpath = classpath+":"+remote+"/audio.jar:"+remote+"/core.jar" if name == "tbs-audio" else classpath
                    command = ["env", "CLASSPATH="+case_classpath,
                               "app_process", "/system/bin", "SqlSchemaProbe", name, *params]
                    log = run(*adb, "shell", shlex.join(command))
                    data = json.loads(next(line for line in log.splitlines() if line.startswith("{")))
                    objects = {obj["name"] for obj in data["objects"]}
                    if name == "okgo":
                        assert objects == {"cache", "cookie", "download", "upload"}
                    elif name == "tbs-audio":
                        assert data["database"] == "tbs_audio.db" and objects == {"TBS_AUDIO_LAST_LIST"}
                        assert data["migrated_row"] == {"ID": 1, "ORIGIN_URL": "local:lesson", "AUDIO_SRC": "local:audio",
                            "TITLE": "本地试听", "ARTIST": "示例", "LAST_PLAY_TIME": 12345, "VALID": 1, "TOTAL_TIME": 9876,
                            "BUSINESS_ID": None, "COVER_URL": None, "EXTRA_MSG": None, "EXTRA_PARMS": None,
                            "REDIRECT_URL": None, "TYPE": None}
                    elif name == "migration":
                        assert objects == {"WorkSpec", MIGRATION_INDEX, "index_WorkSpec_schedule_requested_at"}
                        assert len(data["statements"]) == 6
                    else:
                        assert objects == {"hist"+data["table_suffix"]}
                        assert data["table_suffix"] == "2.0.201501131131".replace(".", "")
                    entry["cases"][name] = data
                result[apk.stem] = entry
        finally:
            run(*adb, "shell", "rm", "-r", remote)
    return {"android": run(*adb, "shell", "getprop", "ro.build.version.release").strip(), "apps": result}


if __name__ == "__main__":
    cli = argparse.ArgumentParser(description=__doc__)
    cli.add_argument("serial")
    cli.add_argument("output", type=Path)
    args = cli.parse_args()
    args.output.write_text(json.dumps(verify(args.serial), ensure_ascii=False, indent=2)+"\n")

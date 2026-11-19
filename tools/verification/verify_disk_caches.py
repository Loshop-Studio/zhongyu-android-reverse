#!/usr/bin/env python3
"""Generate synthetic disk-cache snapshots with original APKs in a disposable emulator."""
import argparse
import hashlib
import json
import os
from pathlib import Path
import subprocess
import sys
import tempfile

ROOT = Path(__file__).resolve().parents[2]
sys.path.insert(0, str(ROOT / "tools"))
from disk_cache import decode

CACHES = {"glide": ("领创平板管理-2025.9.1", 1, 1),
          "coil": ("中育云笔记", 3, 2), "okhttp": ("在线专栏", 201105, 2)}


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("serial", help="Disposable Android emulator")
    args = parser.parse_args()
    if not args.serial.startswith("emulator-"):
        parser.error("Supply an emulator serial")
    sdk = Path(os.environ["ANDROID_HOME"])
    out = ROOT / "reports/evidence/disk-cache"
    out.mkdir(exist_ok=True)
    platform = sdk / "platforms/android-35/android.jar"

    def run(*cmd):
        return subprocess.run(cmd, stdout=subprocess.PIPE, check=True).stdout

    def adb(*cmd):
        return run(sdk / "platform-tools/adb", "-s", args.serial, *cmd)

    report = []
    with tempfile.TemporaryDirectory(prefix="zy-cache-") as local:
        tmp = Path(local)
        remote = "/data/local/tmp/" + tmp.name
        run("javac", "--release", "8", "-d", tmp, Path(__file__).with_name("DiskCacheProbe.java"))
        run(sdk / "build-tools/35.0.0/d8", "--lib", platform, "--min-api", "26",
            "--output", tmp / "probe.jar", tmp / "DiskCacheProbe.class")
        adb("shell", "mkdir", remote)
        try:
            adb("push", tmp / "probe.jar", remote + "/")
            for family, (app, version, count) in CACHES.items():
                apk = ROOT / "中育apk" / (app + ".apk")
                adb("push", apk, remote + "/original.apk")
                adb("shell", "mkdir", remote + "/" + family)
                log = adb("shell", f"cd {remote} && CLASSPATH=probe.jar:original.apk "
                          f"app_process /system/bin DiskCacheProbe {family} {remote}/{family}").decode()
                assert "committed and reopened" in log, log
                adb("pull", remote + "/" + family, tmp / family)
                path = tmp / family / "journal"
                parsed = decode(path)
                key = "classroom_image"
                if family == "coil":
                    key = hashlib.sha256(key.encode()).hexdigest()
                assert (parsed["app_version"], parsed["value_count"]) == (version, count)
                assert parsed["pending_keys"] == [] and not parsed["incomplete_tail"]
                assert len(parsed["entries"]) == 1 and parsed["entries"][0]["key"] == key
                assert parsed["events"]["READ"] and parsed["events"]["REMOVE"]
                slots = parsed["entries"][0]["slots"]
                expected = [b"local synthetic metadata"] if count == 2 else []
                expected.append(b"locally generated image-cache fixture")
                for slot, data in zip(slots, expected, strict=True):
                    assert slot["file_bytes"] == slot["recorded_bytes"] == len(data)
                    assert (path.parent / slot["name"]).read_bytes() == data
                target = out / family
                target.mkdir(exist_ok=True)
                for item in path.parent.iterdir():
                    (target / item.name).write_bytes(item.read_bytes())
                report.append({"app": app, "cache": family, "apk_sha256": hashlib.sha256(apk.read_bytes()).hexdigest(),
                               "native": log.strip(), "decoded": parsed})
                print(f"{app} {family}: app version {version}, {count} slot(s), contents match.", flush=True)
        finally:
            adb("shell", "rm", "-r", remote)
    (out / "native.json").write_text(json.dumps(report, ensure_ascii=False, indent=2) + "\n")


if __name__ == "__main__":
    main()

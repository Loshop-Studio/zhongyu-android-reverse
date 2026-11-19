# Zhongyu Android reverse engineering

This repository contains the ten Zhongyu applications in the input set, including the Zhongyu management desktop. Each application has an editable Apktool module, decoded resources, JADX reading sources and an independent module report. The Gradle build assembles the smali and signs the resulting APK with a locally generated debug key. JADX recovery gaps link to the corresponding smali methods.

| Application report | Build sources | Reading sources |
| --- | --- | --- |
| [中育云笔记](reports/apps/中育云笔记/README.md) | [Apktool](android/中育云笔记/) | [Java and resources](sources/中育云笔记/) |
| [中育管控桌面](reports/apps/中育管控桌面/README.md) | [Apktool](android/中育管控桌面/) | [Java and resources](sources/中育管控桌面/) |
| [优课畅学](reports/apps/优课畅学/README.md) | [Apktool](android/优课畅学/) | [Java and resources](sources/优课畅学/) |
| [在线专栏](reports/apps/在线专栏/README.md) | [Apktool](android/在线专栏/) | [Java and resources](sources/在线专栏/) |
| [新测评](reports/apps/新测评/README.md) | [Apktool](android/新测评/) | [Java and resources](sources/新测评/) |
| [网阅联考](reports/apps/网阅联考/README.md) | [Apktool](android/网阅联考/) | [Java and resources](sources/网阅联考/) |
| [选课](reports/apps/选课/README.md) | [Apktool](android/选课/) | [Java and resources](sources/选课/) |
| [错题本](reports/apps/错题本/README.md) | [Apktool](android/错题本/) | [Java and resources](sources/错题本/) |
| [问卷调查](reports/apps/问卷调查/README.md) | [Apktool](android/问卷调查/) | [Java and resources](sources/问卷调查/) |
| [随身答](reports/apps/随身答/README.md) | [Apktool](android/随身答/) | [Java and resources](sources/随身答/) |

See the [original project guide](README.zh-CN.md), the [board format study](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/画板与存储.md), and the [Linspirer and Zhongyu API report](https://github.com/Loshop-Studio/linspirer-android-reverse/blob/main/reports/领创与中育接口.md).

## Build an APK

On Linux, install Bash, Python 3, util-linux for `flock`, JDK 21 and Android SDK Build Tools 35.0.0. Set `JAVA_HOME` and `ANDROID_HOME` to these installations. The Gradle wrapper and Apktool are included. Run from the repository root.

```sh
cd android
./gradlew assembleDebug
```

To build one application, run `./gradlew ':中育云笔记:assembleDebug'` from `android/`. Outputs appear in `dist/` at the repository root.

## APK downloads and verification

The [APK release](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) contains two ZIPs. `original-apks.zip` holds the inputs under `中育apk/`. `rebuilt-apks.zip` holds the debug-signed outputs from the original reconstruction under `dist/`. The [verification record](reports/evidence/build-verification.json) provides both SHA-256 values per application. Fresh local builds use the debug identity generated on the build machine.

To compare a local build with the source APKs, run from the repository root after building.

```sh
gh release download recovered-apks-v1 --repo Loshop-Studio/zhongyu-android-reverse --pattern original-apks.zip
unzip original-apks.zip
python3 tools/verification/verify_apks.py
```

## Related repositories

- [Zhongyu applications](https://github.com/Loshop-Studio/zhongyu-android-reverse)
- [Linspirer client](https://github.com/Loshop-Studio/linspirer-android-reverse)
- [Board formats and Flutter editor](https://github.com/Loshop-Studio/zhongyu-board-codec)

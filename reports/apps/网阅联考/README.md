# 网阅联考

包名 `com.zykj.insight`，版本 `1.0.0`（1）。2 个 DEX，651 个包，15770 个类。

REA 证据编号 `ev_919e6b60546d68f31f0cbda9e5f3a6d8773703a0daa9c8b10702e857bf7117e2`。输入 SHA-256 为 `179f7fdc30cc9aef61b9d1f78b1cf09d30c4872acb98a7ae5697ea7026ad4999`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.zykj.insight.ui.MainActivity` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity4MainProcess` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity` |
| provider | `com.blankj.utilcode.util.UtilsFileProvider` |
| service | `com.blankj.utilcode.util.MessengerUtils$ServerService` |
| provider | `com.xuexiang.xui.XUIInitProvider` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity` |
| provider | `androidx.startup.InitializationProvider` |
| activity | `com.zykj.message.UnInstallActivity` |
| activity | `com.zykj.message.UnLoginActivity` |
| service | `com.zykj.message.KillSelfService` |
| receiver | `androidx.profileinstaller.ProfileInstallReceiver` |

## 文件与数据

| BIN 文件名或后缀 | 引用位置之一 |
|---|---|
| `DebugProbesKt.bin` | `kotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer` |

包内有 0 个应用 Protobuf 定义、0 个直接识别的 ObjectBox 元数据类、6 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 2 个 assets 条目。

## 代码与构建

反汇编工程中有 9 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/网阅联考/names.jobf`。Gradle 任务 `:网阅联考:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包附有匹配重编 DEX 的 Android 11 性能配置，已随 APK 安装并经系统读回编译状态。[配套 DM](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) · [校验值与规则记录](../../evidence/art-profiles.json)

本包的资源表有 811 条文件及配置记录，其中 718 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 4 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.zykj.insight.ui.MainActivity.onCreate`。[方法证据](rea-method.json)

业务代码分为 insight.bean、insight.network 与 insight.ui。主界面从消息客户端取得配套服务信息；本包的数据库与 WebView 调用位置见存储索引。

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/网阅联考/java/) · [资源和清单](../../../sources/网阅联考/resources/) · [smali 编译工程](../../../android/网阅联考/)

本包 Java 阅读源有 801 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)

JADX 在本包报告 37 个错误。涉及错误的方法应对照 smali 查看分支和异常处理。

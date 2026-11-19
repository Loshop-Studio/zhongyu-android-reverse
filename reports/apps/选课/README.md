# 选课

包名 `com.zykj.curricula`，版本 `1.0.8`（8）。1 个 DEX，133 个包，2397 个类。

REA 证据编号 `ev_3e3b353741e456c18772437d172f6931571db476b8e9564ddbdb1a9959c3ebb3`。输入 SHA-256 为 `765cd06135eb47fa90bc0acbdc1c6c1360e6045a1b56bc5601edcf0049233568`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.zykj.curricula.MainActivity` |
| activity | `com.zykj.message.UnInstallActivity` |
| activity | `com.zykj.message.UnLoginActivity` |
| service | `com.zykj.message.KillSelfService` |

## 文件与数据

包内有 0 个应用 Protobuf 定义、0 个直接识别的 ObjectBox 元数据类、0 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 0 个 assets 条目。

## 代码与构建

反汇编工程中有 3 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/选课/names.jobf`。Gradle 任务 `:选课:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包的资源表有 428 条文件及配置记录，其中 271 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 3 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.zykj.curricula.MainActivity.onCreate`。[方法证据](rea-method.json)

MainActivity 的恢复流程通过配套用户中心取得会话，再初始化 WebView。模拟器实际进入 UnInstallActivity；真实选课页面及课表数据取决于配套环境。

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/选课/java/) · [资源和清单](../../../sources/选课/resources/) · [smali 编译工程](../../../android/选课/)

本包的 JADX 日志没有反编译错误汇总。
本包 Java 阅读源有 76 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)


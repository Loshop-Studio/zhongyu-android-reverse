# 问卷调查

包名 `com.zykj.satisfaction`，版本 `1.0.5`（8）。1 个 DEX，199 个包，1837 个类。

REA 证据编号 `ev_80e4aaed37a40dc3cae862b6b332433871a5551a301108870ed1fdc61fc8a7d9`。输入 SHA-256 为 `02326056adda51ed9dcae1fc6cc81d2817e6942899fd8b5c97e0808cae991edc`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.zykj.satisfaction.MainActivity` |
| activity | `com.zykj.message.UnInstallActivity` |
| activity | `com.zykj.message.UnLoginActivity` |
| provider | `androidx.core.content.FileProvider` |
| provider | `com.xuexiang.xui.XUIInitProvider` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity` |
| service | `com.zykj.message.KillSelfService` |

## 文件与数据

包内有 0 个应用 Protobuf 定义、0 个直接识别的 ObjectBox 元数据类、0 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 0 个 assets 条目。

## 代码与构建

反汇编工程中有 2 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/问卷调查/names.jobf`。Gradle 任务 `:问卷调查:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包的资源表有 802 条文件及配置记录，其中 274 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 5 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.zykj.satisfaction.MainActivity.onCreate`。[方法证据](rea-method.json)

MainActivity 承载问卷 WebView。独立启动时跳转到 UnInstallActivity；业务问卷、选项及作答流程需要配套服务提供。

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/问卷调查/java/) · [资源和清单](../../../sources/问卷调查/resources/) · [smali 编译工程](../../../android/问卷调查/)

本包 Java 阅读源有 212 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)

JADX 在本包报告 7 个错误。涉及错误的方法应对照 smali 查看分支和异常处理。

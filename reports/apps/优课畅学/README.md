# 优课畅学

包名 `com.zhongyukejiao.learningexpert`，版本 `1.1.3`（10103）。5 个 DEX，1218 个包，42885 个类。

REA 证据编号 `ev_7995f390cdbffb7fb44c64bc6b80f87e3c1e9699e4576437caa83a104e557351`。输入 SHA-256 为 `82cbb938b320313add4b7e1d3dab60d82eb536b8f45184698d30dcd85011fe6e`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.zykj.study.ui.MainActivity` |
| activity | `com.zykj.message.UnInstallActivity` |
| activity | `com.zykj.message.UnLoginActivity` |
| activity | `com.zykj.study.ui.SuperPlayerActivity` |
| activity | `com.tencent.bugly.beta.ui.BetaActivity` |
| provider | `androidx.core.content.FileProvider` |
| provider | `com.zykj.lib.ota.provide.OTAProvider` |
| activity | `com.zykj.view.ui.crop.EzyCropActivity` |
| activity | `com.zykj.view.ui.camera.EzyCameraActivity` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity4MainProcess` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity` |
| provider | `com.blankj.utilcode.util.UtilsFileProvider` |
| service | `com.blankj.utilcode.util.MessengerUtils$ServerService` |
| provider | `com.xuexiang.xui.XUIInitProvider` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity` |
| provider | `com.canhub.cropper.CropFileProvider` |
| activity | `com.canhub.cropper.CropImageActivity` |
| service | `androidx.camera.core.impl.MetadataHolderService` |
| service | `androidx.work.multiprocess.RemoteWorkManagerService` |
| provider | `androidx.startup.InitializationProvider` |
| service | `androidx.work.impl.background.systemalarm.SystemAlarmService` |
| service | `androidx.work.impl.background.systemjob.SystemJobService` |
| service | `androidx.work.impl.foreground.SystemForegroundService` |
| receiver | `androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver` |
| receiver | `androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy` |
| receiver | `androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy` |
| receiver | `androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy` |
| receiver | `androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy` |
| receiver | `androidx.work.impl.background.systemalarm.RescheduleReceiver` |
| receiver | `androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver` |
| receiver | `androidx.work.impl.diagnostics.DiagnosticsReceiver` |
| service | `androidx.room.MultiInstanceInvalidationService` |
| receiver | `androidx.profileinstaller.ProfileInstallReceiver` |
| service | `com.zykj.message.KillSelfService` |
| activity | `com.zykj.policy.ui.PolicyDetailActivity` |

该版本附带 UpdateSetting.proto。原包的 t3.a 消息描述引用 ignoreVersionCode_，实际类缺少这个成员；Android 上从 updateSettings.pb 读入字段 1 时返回字段缺失异常。[与中育管控桌面的实测对照](../../evidence/local-stores/native.json)

## 文件与数据

PDF 阅读器把页索引和总页数保存在 `study.db` 的 `PdfEntity` 表，按完整路径查找。读取和保存页码的协程方法已从原指令还原，并在 Android 上与原方法对照了 13 组输入。原翻页回调写入后，新进程读回了同名但不同目录的两本讲义，各自停在第 8/12 页和第 1/3 页。[本包生成的数据库](../../evidence/pdf-progress/优课畅学/study.db) · [字段、路径匹配与解码方法](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#云笔记和优课畅学的-pdf-阅读进度)

TBS 含 50 个独立成员，其中 3 个 DataPack 可按资源 ID 读取。包内音频播放历史的原 SQLite 帮助类已实际建表并迁移样本行。[嵌套容器、资源读法和音频历史字段](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#优课畅学的-tbs-资源和音频历史库)

本包的 settings.pb 使用 int32 页码和 float 页内偏移。两个字段经原生 SettingsSerializer 读写后，测试保存的外层未知字段也保留。AndroidX 偏好映射另有序列化规则。[本包实测样本](../../evidence/local-stores/优课畅学/) · [本地存储对照](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#新测评草稿与应用-datastore)

| BIN 文件名或后缀 | 引用位置之一 |
|---|---|
| `/actions.bin` | `com/zykj/sketch/utils/ProtoFileUtils$Companion` |
| `_audio.bin` | `com/zykj/blackboard/core/record/dataRecorder/AudioRecord` |
| `_command.bin` | `com/zykj/blackboard/core/record/dataRecorder/CommandRecord` |
| `_file.bin` | `com/zykj/blackboard/core/record/dataRecorder/FileSourceRecord` |
| `_geometry.bin` | `com/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord` |
| `_matrix.bin` | `com/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord` |
| `_text.bin` | `com/zykj/blackboard/core/record/dataRecorder/TextSourceRecord` |
| `_touch.bin` | `com/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord` |
| `actions.bin` | `com/zykj/merge/sketch/view/MergeSketchPlayView` |
| `deviceId.bin` | `e5/h` |
| `header.bin` | `com/zykj/blackboard/core/data/SourceLoad` |
| `page_router.bin` | `com/zykj/blackboard/core/data/SourceLoad` |
| `router.bin` | `com/zykj/blackboard/core/data/SourceLoad` |
| `snapshot.bin` | `com/zykj/blackboard/core/edit/BasePageControl` |

包内有 29 个应用 Protobuf 定义、24 个直接识别的 ObjectBox 元数据类、37 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 14 个 assets 条目。

本包的 Room 下载库按网址和本地路径查询，完成记录还会与本地文件的 Base64 MD5 核对。原包写入和跨进程重开均已验证。[本包生成的数据库](../../evidence/download-stores/优课畅学/download.db) · [读法和跨应用差异](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#下载任务和断点文件)

本包的 Sketch 录制器从 V1 笔记恢复了含两种图形的底图。录制器和播放器从 V2 至 V5 的网页导出件均恢复普通笔迹、矩形和椭圆各一笔。[跨版本读取结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-矩形和椭圆的跨版本写回)

## 代码与构建

反汇编工程中有 327 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/优课畅学/names.jobf`。Gradle 任务 `:优课畅学:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包附有匹配重编 DEX 的 Android 11 性能配置，已随 APK 安装并经系统读回编译状态。[配套 DM](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) · [校验值与规则记录](../../evidence/art-profiles.json)

本包的资源表有 1,942 条文件及配置记录，其中 1,703 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 8 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.zykj.study.ui.MainActivity.initView`。[方法证据](rea-method.json)

MainActivity 和 SuperPlayerActivity 分别提供学习主页与播放器入口。课程、学科、教材目录与搜索历史可从数据库建表语句追到读写类，板书模型随包分发。

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/优课畅学/java/) · [资源和清单](../../../sources/优课畅学/resources/) · [smali 编译工程](../../../android/优课畅学/) · [ObjectBox 完整模型](objectbox-model.json)

本包 Java 阅读源有 1,910 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)

JADX 在本包报告 84 个错误。涉及错误的方法应对照 smali 查看分支和异常处理。

# 随身答

包名 `com.zykj.student.dialogue`，版本 `1.1.4`（10104）。5 个 DEX，1224 个包，43967 个类。

REA 证据编号 `ev_925925fe221fdc3d9decd95e5f40cffe965a176bef0458cfea9f3f9f45836d4f`。输入 SHA-256 为 `c9005f3b15d3af3db6cd34184aad31825cff3a24917bfe0d3011bd6c59567045`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.zykj.student.dialogue.ui.MainActivity` |
| provider | `androidx.core.content.FileProvider` |
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
| service | `androidx.work.multiprocess.RemoteWorkManagerService` |
| service | `androidx.room.MultiInstanceInvalidationService` |
| receiver | `androidx.profileinstaller.ProfileInstallReceiver` |
| service | `com.taobao.sophix.aidl.DownloadService` |
| provider | `com.liulishuo.okdownload.OkDownloadProvider` |
| activity | `com.zykj.message.UnInstallActivity` |
| activity | `com.zykj.message.UnLoginActivity` |
| service | `com.zykj.message.KillSelfService` |

## 文件与数据

本包的 AndroidX PreferencesFileSerializer 与优课畅学及中育管控桌面分别读回相同的八种偏好值。测试记录了字符串集合去重和未知字段的实际行为。[本包样本](../../evidence/local-stores/随身答/) · [逐应用核对](../../evidence/local-stores/native.json)

| BIN 文件名或后缀 | 引用位置之一 |
|---|---|
| `/actions.bin` | `com/zykj/sketch/utils/ProtoFileUtils$Companion` |
| `DebugProbesKt.bin` | `kotlinx/coroutines/debug/internal/AgentPremain$DebugProbesTransformer` |
| `_audio.bin` | `com/zykj/blackboard/core/record/dataRecorder/AudioRecord` |
| `_command.bin` | `com/zykj/blackboard/core/record/dataRecorder/CommandRecord` |
| `_file.bin` | `o5/o` |
| `_geometry.bin` | `o5/p` |
| `_matrix.bin` | `o5/q` |
| `_text.bin` | `o5/r` |
| `_touch.bin` | `o5/s` |
| `actions.bin` | `com/zykj/merge/sketch/view/MergeSketchPlayView` |
| `header.bin` | `c5/b` |
| `page_router.bin` | `c5/b` |
| `router.bin` | `c5/b` |
| `snapshot.bin` | `com/zykj/blackboard/core/edit/BasePageControl` |

包内有 25 个应用 Protobuf 定义、24 个直接识别的 ObjectBox 元数据类、37 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 3 个 assets 条目。

本包同时包含 Room 下载记录和 OkDownload 分段库。两套原写入器均已验证。分段库用 64 位整数写入偏移，原模型在重开时通过 32 位接口读取。[本包生成的数据库](../../evidence/download-stores/随身答/okdownload-breakpoint.db) · [读法和跨应用差异](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#下载任务和断点文件)

本包的 Sketch 录制器从 V1 笔记恢复了含两种图形的底图。录制器和播放器从 V2 至 V5 的网页导出件均恢复普通笔迹、矩形和椭圆各一笔。[跨版本读取结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-矩形和椭圆的跨版本写回)

## 代码与构建

反汇编工程中有 257 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/随身答/names.jobf`。Gradle 任务 `:随身答:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包附有匹配重编 DEX 的 Android 11 性能配置，已随 APK 安装并经系统读回编译状态。[配套 DM](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) · [校验值与规则记录](../../evidence/art-profiles.json)

本包的资源表有 1,593 条文件及配置记录，其中 1,352 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 7 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.zykj.student.dialogue.ui.MainActivity.onCreate`。[方法证据](rea-method.json)

student.dialogue 下分为请求与响应模型、网络和界面模块。包内同时携带上传任务持久化代码、Blackboard 数据模型与 Sketch 协议。

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/随身答/java/) · [资源和清单](../../../sources/随身答/resources/) · [smali 编译工程](../../../android/随身答/) · [ObjectBox 完整模型](objectbox-model.json)

本包 Java 阅读源有 1,984 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)

JADX 在本包报告 77 个错误。涉及错误的方法应对照 smali 查看分支和异常处理。

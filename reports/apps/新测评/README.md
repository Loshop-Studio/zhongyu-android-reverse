# 新测评

包名 `com.zykj.evaluation`，版本 `2.4.8`（20408）。5 个 DEX，1194 个包，43215 个类。

REA 证据编号 `ev_afdc14e3d0388ea39a908035efd3ae60731b0f4906f8a82a30098193fa9c55ea`。输入 SHA-256 为 `99e07683d3983242510b7f3d41bb280bb3f4672bb655c9c3f7a5137d45f9c149`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.zykj.evaluation.ui.MainActivity` |
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

该包的选择题识别模型为 TFLite FlatBuffer，输入 28 × 28 单通道浮点图、输出两个分数。可从 [张量及运算清单](../../evidence/answer-sheet/model.json) 查看权重类型与常量摘要。[离线推理结果](../../evidence/answer-sheet/inference.json)

## 文件与数据

本包已在 Android ART 上写出并重读 localAnswer.bin、localCorrectResult.bin、Correct_NeedRevise.bin。测试比较了非 ASCII 字符、空列表、整数 0 和超过 JavaScript 安全整数范围的题号。[原包生成样本](../../evidence/local-stores/新测评/) · [逐文件核对](../../evidence/local-stores/native.json)

| BIN 文件名或后缀 | 引用位置之一 |
|---|---|
| `.bin` | `com/zykj/view/simpleBoard/SimpleBoardView` |
| `/actions.bin` | `com/zykj/sketch/utils/ProtoFileUtils$Companion` |
| `Correct_NeedRevise.bin` | `com/zykj/evaluation/utils/CorrectCommitManager` |
| `DebugProbesKt.bin` | `kotlinx/coroutines/debug/internal/AgentPremain$DebugProbesTransformer` |
| `_audio.bin` | `com/zykj/blackboard/core/record/dataRecorder/AudioRecord` |
| `_command.bin` | `com/zykj/blackboard/core/record/dataRecorder/CommandRecord` |
| `_file.bin` | `y4/o` |
| `_geometry.bin` | `y4/p` |
| `_matrix.bin` | `y4/q` |
| `_text.bin` | `y4/r` |
| `_touch.bin` | `y4/s` |
| `actions.bin` | `com/zykj/merge/sketch/view/MergeSketchPlayView` |
| `header.bin` | `com/zykj/merge/sketch/view/MergeSketchPlayView` |
| `localAnswer.bin` | `com/zykj/evaluation/utils/LocalAnswerManager` |
| `localCorrectResult.bin` | `com/zykj/evaluation/utils/LocalCorrectResultManager` |
| `page_router.bin` | `com/zykj/blackboard/core/edit/BoardControl` |
| `router.bin` | `m4/b` |
| `snapshot.bin` | `com/zykj/blackboard/core/edit/BasePageControl` |

包内有 25 个应用 Protobuf 定义、24 个直接识别的 ObjectBox 元数据类、32 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 4 个 assets 条目。

本包的 OkDownload 数据库存放分段进度、响应文件名及脏任务 ID。原包 32 位游标读法与 SQLite 存储的大文件位置差异已在 Android 11 验证。[本包生成的数据库](../../evidence/download-stores/新测评/okdownload-breakpoint.db) · [读法和跨应用差异](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#下载任务和断点文件)

本包的 Sketch 录制器从 V1 笔记恢复了含两种图形的底图。录制器和播放器从 V2 至 V5 的网页导出件均恢复普通笔迹、矩形和椭圆各一笔。[跨版本读取结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-矩形和椭圆的跨版本写回)

## 代码与构建

反汇编工程中有 278 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/新测评/names.jobf`。Gradle 任务 `:新测评:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包附有匹配重编 DEX 的 Android 11 性能配置，已随 APK 安装并经系统读回编译状态。[配套 DM](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) · [校验值与规则记录](../../evidence/art-profiles.json)

本包的资源表有 1,576 条文件及配置记录，其中 1,341 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 7 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.zykj.evaluation.ui.MainActivity.onResume`。[方法证据](rea-method.json)

从测评主界面可沿答题、批改和提交管理类追到本地文件。答题内容、批改结果与订正清单分别写入三种 JSON 结构，另外还有独立的 Protobuf 简笔板。

在本包的 SimpleBoardView 中，橡皮按触点到相邻采样点之间线段的距离整笔擦除。原 View 的 17 组触摸试验覆盖虚线、单点、重叠笔迹、缩放和半径边界。本包重新打开网页擦除后的 BIN，留下的四笔及其绘制结果与在原版直接擦除相同。[画板实现与文件](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#simpleboard-整笔擦除) · [双原包回读](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/simple-eraser/comparison.json)

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/新测评/java/) · [资源和清单](../../../sources/新测评/resources/) · [smali 编译工程](../../../android/新测评/) · [ObjectBox 完整模型](objectbox-model.json)

本包 Java 阅读源有 1,985 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)

JADX 在本包报告 75 个错误。涉及错误的方法应对照 smali 查看分支和异常处理。

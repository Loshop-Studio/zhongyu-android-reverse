# 错题本

包名 `com.zykj.mistake`，版本 `1.2.5`（10205）。4 个 DEX，983 个包，23001 个类。

REA 证据编号 `ev_dc57cb6291601bb6ed13c4981e73dc733dca04b4000cab5fd2f54405162037bf`。输入 SHA-256 为 `d88208c20bcb0693c68d53073c70ed2bebe8ef733dbfd3893db5676c1849e7da`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.zykj.mistake.activity.MistakeCreateActivity` |
| activity | `com.zykj.mistake.activity.MistakeCreateOrEditActivity` |
| activity | `com.zykj.mistake.activity.SketchActivity` |
| activity | `com.zykj.mistake.activity.SketchPlayerActivity` |
| activity | `com.zykj.mistake.activity.MistakeDetailActivity` |
| activity | `com.zykj.mistake.activity.MistakeListActivity` |
| activity | `com.zykj.mistake.activity.LegacyMistakeActivity` |
| activity | `com.zykj.mistake.activity.MainActivity` |
| service | `com.zykj.mistake.service.UploadIntentService` |
| service | `com.zykj.mistake.service.UploadFolderIntentService` |
| provider | `androidx.core.content.FileProvider` |
| activity | `com.zykj.view.ui.crop.EzyCropActivity` |
| activity | `com.zykj.view.ui.camera.EzyCameraActivity` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity4MainProcess` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity` |
| provider | `com.blankj.utilcode.util.UtilsFileProvider` |
| service | `com.blankj.utilcode.util.MessengerUtils$ServerService` |
| provider | `com.canhub.cropper.CropFileProvider` |
| activity | `com.canhub.cropper.CropImageActivity` |
| service | `androidx.camera.core.impl.MetadataHolderService` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity` |
| provider | `androidx.startup.InitializationProvider` |
| receiver | `androidx.profileinstaller.ProfileInstallReceiver` |
| activity | `com.zykj.message.UnInstallActivity` |
| activity | `com.zykj.message.UnLoginActivity` |
| service | `com.zykj.message.KillSelfService` |

## 文件与数据

本包的目录遍历器、ZIP 打包器与清单加载器已在 Android 11 上共同验证。原 ZIP 和已解包的笔记目录均可在 Flutter 中打开。经过网页编辑后，错题本原 ZIP 分支读回 20 个相同文件。[原生包](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/native-note-bundle.zip) · [原生回读结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/art/note-bundle-restore.txt)

| BIN 文件名或后缀 | 引用位置之一 |
|---|---|
| `.bin` | `com/zykj/mistake/feature/collection/component/j` |
| `/actions.bin` | `com/zykj/mistake/utils/h` |
| `_audio.bin` | `com/zykj/blackboard/core/record/dataRecorder/AudioRecord` |
| `_command.bin` | `com/zykj/blackboard/core/record/dataRecorder/CommandRecord` |
| `_file.bin` | `com/zykj/blackboard/core/record/dataRecorder/FileSourceRecord` |
| `_geometry.bin` | `com/zykj/blackboard/core/record/dataRecorder/GeometrySourceRecord` |
| `_matrix.bin` | `com/zykj/blackboard/core/record/dataRecorder/MatrixSourceRecord` |
| `_text.bin` | `com/zykj/blackboard/core/record/dataRecorder/TextSourceRecord` |
| `_touch.bin` | `com/zykj/blackboard/core/record/dataRecorder/TouchSourceRecord` |
| `actions.bin` | `com/zykj/merge/sketch/view/MergeSketchPlayView` |
| `header.bin` | `com/zykj/blackboard/core/data/SourceLoad` |
| `page_router.bin` | `com/zykj/blackboard/core/data/SourceLoad` |
| `remote_draft.bin` | `com/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel$downloadDraftStroke$4` |
| `router.bin` | `com/zykj/blackboard/core/data/SourceLoad` |
| `snapshot.bin` | `com/zykj/blackboard/core/edit/BasePageControl` |

包内有 25 个应用 Protobuf 定义、24 个直接识别的 ObjectBox 元数据类、1 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 4 个 assets 条目。

本包的 Sketch 录制器保存静态图文页时，可以把既有图片和笔迹压在一条触摸记录的完整快照里。网页恢复此快照后续写，本包重开编辑件能读回两笔和一张图。[样本和原生核对](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-静态笔记与-jpeg-预览)

本包的 Sketch 录制器从 V1 笔记恢复了含两种图形的底图。录制器和播放器从 V2 至 V5 的网页导出件均恢复普通笔迹、矩形和椭圆各一笔。[跨版本读取结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-矩形和椭圆的跨版本写回)

## 代码与构建

反汇编工程中有 293 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/错题本/names.jobf`。Gradle 任务 `:错题本:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包附有匹配重编 DEX 的 Android 11 性能配置，已随 APK 安装并经系统读回编译状态。[配套 DM](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) · [校验值与规则记录](../../evidence/art-profiles.json)

本包的资源表有 1,824 条文件及配置记录，其中 1,587 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 22 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.zykj.mistake.activity.MainActivity.onCreate`。[方法证据](rea-method.json)

可从错题创建、编辑、详情和列表进入画板，另有 SketchPlayerActivity 回放与后台上传服务。该包保留了 SimpleBoard 读写器、Sketch 动作消息与 Blackboard 多文件读取器，已用于网页回写互操作验证。

在本包的 SimpleBoardView 中，橡皮按触点到相邻采样点之间线段的距离整笔擦除。原 View 的 17 组触摸试验覆盖虚线、单点、重叠笔迹、缩放和半径边界。本包重新打开网页擦除后的 BIN，留下的四笔及其绘制结果与在原版直接擦除相同。[画板实现与文件](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#simpleboard-整笔擦除) · [双原包回读](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/simple-eraser/comparison.json)

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/错题本/java/) · [资源和清单](../../../sources/错题本/resources/) · [smali 编译工程](../../../android/错题本/) · [ObjectBox 完整模型](objectbox-model.json)

本包 Java 阅读源有 1,642 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)

JADX 在本包报告 73 个错误。涉及错误的方法应对照 smali 查看分支和异常处理。

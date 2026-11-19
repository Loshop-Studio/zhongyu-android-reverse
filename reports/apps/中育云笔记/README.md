# 中育云笔记

包名 `com.friday.cloudsnote`，版本 `1.13.5`（11305）。6 个 DEX，1594 个包，44769 个类。

REA 证据编号 `ev_c5c85fc1cc1e40c9b47cdc03ac88c31d535c44df55f05ad3f378e92c6905c788`。输入 SHA-256 为 `577454c536e7828151cdc6674cd2c0161dcea577f75b8ec31ec198f013bb3464`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.friday.cloudsnote.view.MainActivity` |
| activity | `com.friday.paint.view.NoteActivity` |
| activity | `com.friday.paint.view.six.NewNoteActivity` |
| activity | `com.zykj.view.ui.crop.EzyCropActivity` |
| activity | `com.zykj.view.ui.camera.EzyCameraActivity` |
| activity | `com.friday.login.view.LoginActivity` |
| activity | `com.friday.main.view.DBActivity` |
| activity | `com.friday.main.view.HomeActivity` |
| activity | `com.friday.main.view.FolderMoveActivity` |
| activity | `com.friday.main.view.SearchActivity` |
| activity | `com.friday.main.view.FullScreenPreviewActivity` |
| activity | `com.theartofdev.edmodo.cropper.CropImageActivity` |
| activity | `com.friday.document.view.share.ShareSearchActivity` |
| activity | `com.friday.document.view.TeacherOnlyActivity` |
| activity | `com.friday.document.view.viewer.ImagePreviewActivity` |
| activity | `com.friday.document.view.viewer.MicroClassPlayActivity` |
| activity | `com.friday.document.view.viewer.TxtEditActivity` |
| activity | `com.friday.document.view.viewer.VideoPlayerActivity` |
| activity | `com.friday.document.view.viewer.PdfViewerActivity` |
| receiver | `com.friday.document.receiver.AliMessageReceiver` |
| service | `org.eclipse.paho.android.service.MqttService` |
| service | `com.friday.lecture.service.MyMqttService` |
| service | `com.friday.common.activity.PusherService` |
| service | `com.friday.lecture.floatwindow.FloatWindowService` |
| service | `com.friday.lecture.floatwindow.StudentDemoService` |
| activity | `com.zykj.cloudhelper.activity.NoteManagerActivity` |
| activity | `com.friday.common.camera.CameraActivity` |
| activity | `com.friday.common.activity.RequestScreenCastActivity` |
| provider | `androidx.core.content.FileProvider` |
| provider | `com.luck.picture.lib.basic.PictureFileProvider` |
| service | `com.luck.picture.lib.service.ForegroundService` |
| activity | `com.luck.picture.lib.basic.PictureSelectorSupporterActivity` |
| activity | `com.luck.picture.lib.basic.PictureSelectorTransparentActivity` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity4MainProcess` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity` |
| provider | `com.blankj.utilcode.util.UtilsFileProvider` |
| service | `com.blankj.utilcode.util.MessengerUtils$ServerService` |
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
| service | `com.taobao.sophix.aidl.DownloadService` |
| service | `com.alibaba.sdk.android.push.channel.KeepChannelService` |
| service | `com.alibaba.sdk.android.push.huawei.HuaweiPushMessageService` |
| activity | `com.zykj.message.UnInstallActivity` |
| activity | `com.zykj.message.UnLoginActivity` |
| service | `com.zykj.message.KillSelfService` |
| activity | `com.zykj.policy.ui.PolicyDetailActivity` |
| service | `org.android.agoo.accs.AgooService` |
| service | `com.aliyun.ams.emas.push.AgooInnerService` |
| service | `com.aliyun.ams.emas.push.MsgService` |
| activity | `com.aliyun.ams.emas.push.NotificationActivity` |
| receiver | `com.huawei.hms.support.api.push.PushMsgReceiver` |
| receiver | `com.huawei.hms.support.api.push.PushReceiver` |
| service | `com.huawei.hms.support.api.push.service.HmsMsgService` |
| provider | `com.huawei.hms.support.api.push.PushProvider` |
| activity | `com.huawei.hms.support.api.push.TransActivity` |
| service | `com.taobao.accs.ChannelService` |
| service | `com.taobao.accs.ChannelService$KernelService` |
| service | `com.taobao.accs.internal.AccsJobService` |
| service | `com.taobao.accs.data.MsgDistributeService` |
| receiver | `com.taobao.accs.EventReceiver` |
| receiver | `com.taobao.accs.ServiceReceiver` |
| provider | `com.huawei.hms.aaid.InitProvider` |
| provider | `com.huawei.agconnect.core.provider.AGConnectInitializeProvider` |
| service | `com.huawei.agconnect.core.ServiceDiscovery` |
| activity | `com.huawei.hms.activity.BridgeActivity` |
| activity | `com.huawei.hms.activity.EnableServiceActivity` |

## 文件与数据

PDF 阅读器把页索引和总页数保存在 `FRIDAY_NOTE_DB` 的 `PdfEntity` 表，按完整路径查找。读取和保存页码的协程方法已从原指令还原，并在 Android 上与原方法对照了 13 组输入。原翻页回调写入后，新进程读回了同名但不同目录的两本讲义，各自停在第 8/12 页和第 1/3 页。[本包生成的数据库](../../evidence/pdf-progress/中育云笔记/FRIDAY_NOTE_DB) · [字段、路径匹配与解码方法](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#云笔记和优课畅学的-pdf-阅读进度)

| BIN 文件名或后缀 | 引用位置之一 |
|---|---|
| `.bin` | `com/friday/paint/viewmodel/NoteViewModel$handleResource$2` |
| `/actions.bin` | `com/zykj/sketch/utils/ProtoFileUtils$Companion` |
| `/deviceId/deviceId.bin` | `k2/o` |
| `_audio.bin` | `com/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1` |
| `_command.bin` | `com/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1` |
| `_file.bin` | `com/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1` |
| `_geometry.bin` | `ja/p` |
| `_matrix.bin` | `com/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1` |
| `_text.bin` | `com/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1` |
| `_touch.bin` | `com/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1` |
| `actions.bin` | `com/friday/paint/viewmodel/NoteViewModel$handleResource$2` |
| `header.bin` | `com/friday/paint/viewmodel/NoteViewModel$handleResource$2` |
| `page_router.bin` | `com/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1` |
| `router.bin` | `com/friday/document/repair/CommandImageRepairer` |
| `snapshot.bin` | `com/friday/common/helper/NotePageOrder` |

包内有 25 个应用 Protobuf 定义、24 个直接识别的 ObjectBox 元数据类、48 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 12 个 assets 条目。

新版页式画板由 NewPaintFragment 处理页面路由、命令和快照。原包的九个 Blackboard 消息读取器均已成功读回 Flutter 网页的图文页，重新序列化后各字段一致。旧笔记的 NoteViewModel 使用 actions.bin，其独立 Sketch 读取器在本包运行时报告缺少 makeExtensionsImmutable。两条存储路径的兼容结果应分别使用。[页式逐字段结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/art/page-variants.json) · [旧 Sketch 读取记录](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/art/variants.json)

云笔记的 32 位 ARM 原生 ObjectBox 库已在模拟器中写出并重开 page_mdb。另用原生 BIN 转 MDB 入口导入 Flutter 导出的兼容副本，取得一笔 16 个坐标点、文字、两个几何图元和一条图片引用。主机可从实体样本库解出 24 张实体表及测试行，包括页面对标题的关联、中文文字和命令字节。[原生回读](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/art/cloud-store-android.txt) · [主机解析](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/evidence/board/page_mdb/decoded.json)

旧编辑器的 `index.json` 保留原设备上的页面顺序和重复位置，`res.json` 记录各资源的设备路径和服务端地址。原包已解包并读回网页编辑后的多页样本，另用本包生成的 Room 数据库核对了旧编辑器和新版列表处理删除标记的差异。[两份清单、数据库解码命令及原包结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#云笔记的页序和资源清单)

旧侧栏用 Coil 加载页面目录的 JPEG。原侧栏绑定网页编辑件后，640 × 480 位图中的每个 RGB 像素均与导出 JPEG 的解码结果一致。[样本和原生核对](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-静态笔记与-jpeg-预览)

本包的 Room 下载库按网址和本地路径查询，完成记录还会与本地文件的 Base64 MD5 核对。原包写入和跨进程重开均已验证。[本包生成的数据库](../../evidence/download-stores/中育云笔记/download.db) · [读法和跨应用差异](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#下载任务和断点文件)

本包旧 Sketch 的动作工厂未实现矩形和椭圆模式。在 Android 11 单独调用旧读取器打开 V2 对照时，包内 protobuf 类缺少 `makeExtensionsImmutable()`；新版 Blackboard 的验证记录另见对应章节。[跨版本读取结果](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#sketch-矩形和椭圆的跨版本写回)

## 代码与构建

反汇编工程中有 280 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/中育云笔记/names.jobf`。Gradle 任务 `:中育云笔记:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包附有匹配重编 DEX 的 Android 11 性能配置，已随 APK 安装并经系统读回编译状态。[配套 DM](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) · [校验值与规则记录](../../evidence/art-profiles.json)

本包的资源表有 2,581 条文件及配置记录，其中 2,341 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 26 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.friday.cloudsnote.view.MainActivity.onCreate`。[方法证据](rea-method.json)

从 HomeActivity 进入文件夹、搜索或文档预览；NoteActivity 与 NewNoteActivity 对应两套笔记编辑入口。PDF 阅读状态、素材和分享缓存可在 Room 建表语句中定位。

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/中育云笔记/java/) · [资源和清单](../../../sources/中育云笔记/resources/) · [smali 编译工程](../../../android/中育云笔记/) · [ObjectBox 完整模型](objectbox-model.json)

本包 Java 阅读源有 1,978 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)

JADX 在本包报告 104 个错误。涉及错误的方法应对照 smali 查看分支和异常处理。

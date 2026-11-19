# 中育管控桌面

包名 `com.zykj.manage`，版本 `1.0.34`（10034）。4 个 DEX，988 个包，39191 个类。

REA 证据编号 `ev_ffb080c2b3e43ca62fbeb66ffb99a7a016b3ebafea65df5d8a91c31fdc7e35f4`。输入 SHA-256 为 `e0b46dee805fe516503ac7d2b8e1b7d585de43063a012f8056e3bbd1018a9949`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.zykj.huiwei.launcher.ui.activity.CrashActivity` |
| activity | `com.zykj.huiwei.launcher.ui.MainActivity` |
| receiver | `com.zykj.huiwei.launcher.receiver.LogoutReceiver` |
| provider | `com.zykj.huiwei.launcher.GalleryFileProvider` |
| service | `com.zykj.huiwei.launcher.server.MyService` |
| service | `com.zykj.huiwei.launcher.server.MyFloatingToolService` |
| activity | `com.zykj.huiwei.launcher.ui.activity.FileActivity` |
| activity | `com.zykj.gallery.ui.share.ShareActivity` |
| activity | `com.zykj.gallery.ui.activity.GalleryActivity` |
| service | `cn.com.techvision.launchercore.internal.LauncherService` |
| provider | `androidx.core.content.FileProvider` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity4MainProcess` |
| activity | `com.blankj.utilcode.util.UtilsTransActivity` |
| provider | `com.blankj.utilcode.util.UtilsFileProvider` |
| service | `com.blankj.utilcode.util.MessengerUtils$ServerService` |
| activity | `com.lljjcoder.style.citylist.CityListSelectActivity` |
| activity | `com.lljjcoder.style.citythreelist.ProvinceActivity` |
| activity | `com.lljjcoder.style.citythreelist.CityActivity` |
| activity | `com.lljjcoder.style.citythreelist.AreaActivity` |
| provider | `com.xuexiang.xui.XUIInitProvider` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity` |
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
| service | `androidx.work.multiprocess.RemoteWorkManagerService` |
| service | `androidx.room.MultiInstanceInvalidationService` |
| receiver | `androidx.profileinstaller.ProfileInstallReceiver` |
| activity | `com.zykj.message.server.TransferActivity` |
| activity | `com.zykj.policy.ui.PolicyDetailActivity` |

原包 UpdateSettingsSerializer 在 Android 上重读了 updateSettings.pb 的 int32 更新提示版本号及未知字段 127。[原包读写记录](../../evidence/local-stores/native.json) · [REA 方法](../../evidence/local-stores/rea/update-read.json)

## 文件与数据

本包自带的 StudentInfoSerializer 和 AndroidX PreferencesFileSerializer 已用合成学籍记录及八种偏好值分别读写。学籍记录的 64 位 ID 未丢失精度。[本包实测样本](../../evidence/local-stores/中育管控桌面/) · [恢复字段](../../../tools/schemas/LocalStudy.proto)

| BIN 文件名或后缀 | 引用位置之一 |
|---|---|
| `DebugProbesKt.bin` | `kotlinx/coroutines/debug/internal/AgentPremain$DebugProbesTransformer` |

包内有 0 个应用 Protobuf 定义、0 个直接识别的 ObjectBox 元数据类、27 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 5 个 assets 条目。

桌面附带两份城市目录。原包分别核对了天气地点索引与省、市、区县三级选择器。[文件布局及用法](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#随包资产和管控桌面的两份城市表) · [Android 读回记录](../../evidence/city-catalog/verification.json)

本包的 Room 下载库按网址和本地路径查询，完成记录还会与本地文件的 Base64 MD5 核对。原包写入和跨进程重开均已验证。[本包生成的数据库](../../evidence/download-stores/中育管控桌面/download.db) · [读法和跨应用差异](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#下载任务和断点文件)

## 代码与构建

反汇编工程中有 85 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/中育管控桌面/names.jobf`。Gradle 任务 `:中育管控桌面:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包附有匹配重编 DEX 的 Android 11 性能配置，已随 APK 安装并经系统读回编译状态。[配套 DM](https://github.com/Loshop-Studio/zhongyu-android-reverse/releases/tag/recovered-apks-v1) · [校验值与规则记录](../../evidence/art-profiles.json)

本包的资源表有 1,534 条文件及配置记录，其中 1,304 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 9 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.zykj.huiwei.launcher.ui.MainActivity.onResume`。[方法证据](rea-method.json)

MainActivity、FileActivity 与 GalleryActivity 负责桌面、文件和相册。TransferActivity 位于跨应用消息模块，PolicyDetailActivity 展示策略详情。

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/中育管控桌面/java/) · [资源和清单](../../../sources/中育管控桌面/resources/) · [smali 编译工程](../../../android/中育管控桌面/)

本包 Java 阅读源有 1,864 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)

JADX 在本包报告 47 个错误。涉及错误的方法应对照 smali 查看分支和异常处理。

# 在线专栏

包名 `com.zykj.subscriber`，版本 `1.3.4`（1304）。2 个 DEX，626 个包，8945 个类。

REA 证据编号 `ev_b443fd26e651f9b271a76cdc94d09a67ed0e4933a8c4bcb5821a2adfd3b85acb`。输入 SHA-256 为 `b571a8d19d808d3200b26689036145a1d0924c0170db035a2233725030b8ccce`。

[逐包模块清单](modules.md) · [类、方法数量和调用分类](packages.json) · [存储证据和 schema 清单](storage.json)

## Android 组件

| 类型 | 实现 |
|---|---|
| activity | `com.zykj.subscriber.MainActivity` |
| activity | `com.zykj.subscriber.FileActivity` |
| provider | `androidx.core.content.FileProvider` |
| provider | `com.xuexiang.xui.XUIInitProvider` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.PreviewActivity` |
| activity | `com.xuexiang.xui.widget.imageview.preview.ui.VideoPlayerActivity` |
| service | `androidx.work.multiprocess.RemoteWorkManagerService` |
| provider | `androidx.work.impl.WorkManagerInitializer` |
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
| activity | `com.zykj.message.UnInstallActivity` |
| activity | `com.zykj.message.UnLoginActivity` |
| service | `com.zykj.message.KillSelfService` |
| service | `com.alibaba.sdk.android.push.channel.KeepChannelService` |
| service | `org.android.agoo.accs.AgooService` |
| service | `com.aliyun.ams.emas.push.AgooInnerService` |
| service | `com.aliyun.ams.emas.push.MsgService` |
| activity | `com.aliyun.ams.emas.push.NotificationActivity` |
| service | `com.taobao.accs.ChannelService` |
| service | `com.taobao.accs.ChannelService$KernelService` |
| service | `com.taobao.accs.internal.AccsJobService` |
| service | `com.taobao.accs.data.MsgDistributeService` |
| receiver | `com.taobao.accs.EventReceiver` |
| receiver | `com.taobao.accs.ServiceReceiver` |

## 文件与数据

包内有 0 个应用 Protobuf 定义、0 个直接识别的 ObjectBox 元数据类、30 条去重的静态 SQLite 建表或建索引语句。存储证据文件列出对应字段、语句、类位置及 2 个 assets 条目。

本包的 Room 下载库按网址和本地路径查询，完成记录还会与本地文件的 Base64 MD5 核对。原包写入和跨进程重开均已验证。[本包生成的数据库](../../evidence/download-stores/在线专栏/download.db) · [读法和跨应用差异](https://github.com/Loshop-Studio/zhongyu-board-codec/blob/main/reports/%E7%94%BB%E6%9D%BF%E4%B8%8E%E5%AD%98%E5%82%A8.md#下载任务和断点文件)

## 代码与构建

反汇编工程中有 12 个类附有读写行为或模块职责注释。原始短名称与反编译别名的对应表位于 `sources/在线专栏/names.jobf`。Gradle 任务 `:在线专栏:assembleDebug` 从 smali 重建 DEX。编辑解码后的资源或清单会触发 AAPT2 重编，产物随 assets 和本机库一起打包签名。

本包的资源表有 917 条文件及配置记录，其中 810 条的 APK 路径与解码后的源文件路径不同。清单中声明的 Activity 有 4 处指令直接加载可识别的布局 ID，已在参与编译的 smali 中注释。[原包文件名、布局 ID 与引用方法](resource-files.json)

## 阅读入口

REA 单方法复核覆盖 `com.zykj.subscriber.MainActivity.onCreate`。[方法证据](rea-method.json)

MainActivity、FileActivity、下载记录与推送组件是本包主要入口。在独立模拟器启动 MainActivity，实际跳转到缺少配套应用的提示页。

[业务类与方法](business-modules.md) · [方法级读写操作和代码注释](data-operations.md) · [业务模型字段与 Gson 显式键名](storage-models.json) · [SQLite 字段与外键](sqlite-layout.json) · [离线安装生成的实际数据库结构](emulator-sqlite.json) · [本机库和 ABI](native.json) · [Kotlin 源文件线索](kotlin-sources.json) · [跨版本候选名称](shared-symbols.json) · [Java 阅读源](../../../sources/在线专栏/java/) · [资源和清单](../../../sources/在线专栏/resources/) · [smali 编译工程](../../../android/在线专栏/)

本包 Java 阅读源有 316 个反编译占位位置，分别链接到原 DEX 中有指令的方法体。[Java 占位行与原 DEX 指令对照](java-fallbacks.md)

JADX 在本包报告 4 个错误。涉及错误的方法应对照 smali 查看分支和异常处理。

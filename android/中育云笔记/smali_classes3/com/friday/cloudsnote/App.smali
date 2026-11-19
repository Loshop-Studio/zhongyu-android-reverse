.class public final Lcom/friday/cloudsnote/App;
.super Lw1/i;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/CameraXConfig$Provider;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw1/i;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final initBugly()V
    .locals 2

    .line 1
    const-string v0, "88e0391f9c"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/crashreport/CrashReport;->initCrashReport(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final initCloudChannel(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/alibaba/sdk/android/push/noonesdk/PushServiceFactory;->init(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/alibaba/sdk/android/push/noonesdk/PushServiceFactory;->getCloudPushService()Lcom/alibaba/sdk/android/push/CloudPushService;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-interface {v0, v1}, Lcom/alibaba/sdk/android/push/CloudPushService;->setLogLevel(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lcom/friday/cloudsnote/App$a;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/friday/cloudsnote/App$a;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, p1, v1}, Lcom/alibaba/sdk/android/push/CloudPushService;->register(Landroid/content/Context;Lcom/alibaba/sdk/android/push/CommonCallback;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final initHelper()V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/blankj/utilcode/util/Utils;->init(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/cloudsnote/App;->initLogHelper()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/friday/cloudsnote/App;->initTalkingData()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/friday/cloudsnote/App;->initBugly()V

    .line 11
    .line 12
    .line 13
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v1, 0x1a

    .line 16
    .line 17
    if-lt v0, v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    const-string v1, "camera"

    .line 21
    .line 22
    const-string v2, "\u76f8\u673a"

    .line 23
    .line 24
    invoke-static {v1, v2, v0}, Lcom/blankj/utilcode/util/j;->a(Ljava/lang/String;Ljava/lang/CharSequence;I)Landroid/app/NotificationChannel;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-class v1, Landroid/app/NotificationManager;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Landroid/app/NotificationManager;

    .line 35
    .line 36
    invoke-static {v1, v0}, Lcom/blankj/utilcode/util/g;->a(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method private final initLogHelper()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/LogUtils;->getConfig()Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "cloudsnote"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/LogUtils$Config;->setGlobalTag(Ljava/lang/String;)Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/blankj/utilcode/util/LogUtils;->getConfig()Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/LogUtils$Config;->setLog2FileSwitch(Z)Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/blankj/utilcode/util/LogUtils;->getConfig()Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x7

    .line 23
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/LogUtils$Config;->setSaveDays(I)Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final initRouter(Lcom/friday/cloudsnote/App;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/alibaba/android/arouter/launcher/ARouter;->init(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final initStrictMode()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/StrictMode$VmPolicy$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/StrictMode$VmPolicy$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/os/StrictMode$VmPolicy$Builder;->detectFileUriExposure()Landroid/os/StrictMode$VmPolicy$Builder;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final initTalkingData()V
    .locals 2

    .line 1
    const-string v0, "4B7557A05810477FA563E2397CBCFB3C"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {p0, v0, v1, v1}, Lcom/tendcloud/tenddata/TalkingDataSDK;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Lcom/tendcloud/tenddata/TalkingDataSDK;->setReportUncaughtExceptions(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final isMainProcess(Landroid/content/Context;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Lcom/blankj/utilcode/util/ProcessUtils;->getCurrentProcessName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lme/weishu/reflection/Reflection;->b(Landroid/content/Context;)I

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public getCameraXConfig()Landroidx/camera/core/CameraXConfig;
    .locals 2

    .line 1
    invoke-static {}, Landroidx/camera/camera2/Camera2Config;->defaultConfig()Landroidx/camera/core/CameraXConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/camera/core/CameraXConfig$Builder;->fromConfig(Landroidx/camera/core/CameraXConfig;)Landroidx/camera/core/CameraXConfig$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x6

    .line 10
    invoke-virtual {v0, v1}, Landroidx/camera/core/CameraXConfig$Builder;->setMinimumLoggingLevel(I)Landroidx/camera/core/CameraXConfig$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroidx/camera/core/CameraXConfig$Builder;->build()Landroidx/camera/core/CameraXConfig;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "build(...)"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lw1/i;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p0}, Lcom/friday/cloudsnote/App;->isMainProcess(Landroid/content/Context;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p0}, Lcom/friday/cloudsnote/App;->initRouter(Lcom/friday/cloudsnote/App;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/friday/cloudsnote/App;->initHelper()V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/friday/cloudsnote/App;->initStrictMode()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lcom/zykj/message/client/MessageClient;->e(Landroid/app/Application;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p0}, Lcom/friday/cloudsnote/App;->initCloudChannel(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lb7/a;->h()Lb7/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, p0}, Lb7/a;->k(Landroid/app/Application;)Lb7/a;

    .line 32
    .line 33
    .line 34
    sget-object v0, Lf2/d;->a:Lf2/d;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Lf2/d;->b(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lna/d;->a:Lna/d;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Lna/d;->g(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, Ly7/b;->f(Landroid/app/Application;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public onTerminate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lg2/a;->a:Lg2/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lg2/a;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/zykj/message/client/MessageClient;->c:Lcom/zykj/message/client/MessageClient;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient;->n()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

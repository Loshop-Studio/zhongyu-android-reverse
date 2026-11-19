.class public final Lcom/zykj/subscriber/application/MyApplication;
.super Landroid/app/Application;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig$Builder;

    invoke-direct {v0}, Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig$Builder;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig$Builder;->application(Landroid/app/Application;)Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig$Builder;

    move-result-object v0

    const-string v1, "333433497"

    .line 3
    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig$Builder;->appKey(Ljava/lang/String;)Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig$Builder;

    move-result-object v0

    const-string v1, "af2e50cc50d14195a13e794879e099a9"

    .line 4
    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig$Builder;->appSecret(Ljava/lang/String;)Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig$Builder;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig$Builder;->build()Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig;

    move-result-object v0

    .line 6
    invoke-static {v0}, Lcom/alibaba/sdk/android/push/noonesdk/PushServiceFactory;->init(Lcom/alibaba/sdk/android/push/noonesdk/PushInitConfig;)V

    .line 7
    invoke-static {}, Lcom/alibaba/sdk/android/push/noonesdk/PushServiceFactory;->getCloudPushService()Lcom/alibaba/sdk/android/push/CloudPushService;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/zykj/subscriber/application/MyApplication$a;

    invoke-direct {v2}, Lcom/zykj/subscriber/application/MyApplication$a;-><init>()V

    invoke-interface {v0, v1, v2}, Lcom/alibaba/sdk/android/push/CloudPushService;->register(Landroid/content/Context;Lcom/alibaba/sdk/android/push/CommonCallback;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    invoke-direct {p0}, Lcom/zykj/subscriber/application/MyApplication;->a()V

    .line 3
    sget-object v0, Lz1/b;->a:Lz1/b;

    invoke-virtual {v0, p0}, Lz1/b;->h(Landroid/app/Application;)V

    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->setLogEnabled(Z)V

    const/4 v0, 0x1

    .line 5
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigure;->setProcessEvent(Z)V

    const-string v1, "5ee035c9978eea085d11e556"

    const-string v2, "Browser"

    const/4 v3, 0x0

    .line 6
    invoke-static {p0, v1, v2, v0, v3}, Lcom/umeng/commonsdk/UMConfigure;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    sget-object v0, Lcom/umeng/analytics/MobclickAgent$PageMode;->AUTO:Lcom/umeng/analytics/MobclickAgent$PageMode;

    invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->setPageCollectionMode(Lcom/umeng/analytics/MobclickAgent$PageMode;)V

    return-void
.end method

.method public onTerminate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 2
    sget-object v0, Lz1/b;->a:Lz1/b;

    invoke-virtual {v0}, Lz1/b;->i()V

    return-void
.end method

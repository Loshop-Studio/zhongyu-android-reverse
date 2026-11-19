.class public Lcom/zykj/study/MyApplication;
.super Lcom/zykj/study/Hilt_MyApplication;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field public clientCodeLiveData:Lcom/zykj/study/bean/ClientCodeLiveData;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final messageServerListener:Lcom/zykj/study/MyApplication$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/Hilt_MyApplication;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/study/MyApplication$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/zykj/study/MyApplication$a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/study/MyApplication;->messageServerListener:Lcom/zykj/study/MyApplication$a;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lcom/zykj/study/MyApplication;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/MyApplication;->onCreate$lambda$0(Lcom/zykj/study/MyApplication;)V

    return-void
.end method

.method private final initX5()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Lcom/tencent/smtt/sdk/QbSdk;->initX5Environment(Landroid/content/Context;Lcom/tencent/smtt/sdk/QbSdk$PreInitCallback;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method private static final onCreate$lambda$0(Lcom/zykj/study/MyApplication;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/tencent/smtt/sdk/QbSdk;->preinstallStaticTbs(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/multidex/MultiDex;->install(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lme/weishu/reflection/Reflection;->b(Landroid/content/Context;)I

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final getClientCodeLiveData()Lcom/zykj/study/bean/ClientCodeLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/MyApplication;->clientCodeLiveData:Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "clientCodeLiveData"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public onCreate()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/zykj/study/Hilt_MyApplication;->onCreate()V

    .line 2
    .line 3
    .line 4
    const-string v0, "fbf15e0de7"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p0, v0, v1}, Lcom/tencent/bugly/crashreport/CrashReport;->initCrashReport(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lk1/b;->g(Landroid/app/Application;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/MyApplication;->getClientCodeLiveData()Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Le5/h;->a:Le5/h;

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    invoke-virtual {v1, v2, v2}, Le5/h;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lcom/zykj/study/utils/AppContext;->a:Lcom/zykj/study/utils/AppContext;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lcom/zykj/study/utils/AppContext;->c(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lcom/zykj/utils/AppUtils;->a:Lcom/zykj/utils/AppUtils;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Lcom/zykj/utils/AppUtils;->b(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Ljava/lang/Thread;

    .line 39
    .line 40
    new-instance v1, Lm4/b;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lm4/b;-><init>(Lcom/zykj/study/MyApplication;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 49
    .line 50
    .line 51
    sget-object v0, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Lcom/zykj/message/client/MessageClient;->e(Landroid/app/Application;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient;->g()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, p0, Lcom/zykj/study/MyApplication;->messageServerListener:Lcom/zykj/study/MyApplication$a;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->i(Lb4/a;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-direct {p0}, Lcom/zykj/study/MyApplication;->initX5()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public onTerminate()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient;->g()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/study/MyApplication;->messageServerListener:Lcom/zykj/study/MyApplication$a;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->l(Lb4/a;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient;->k()V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setClientCodeLiveData(Lcom/zykj/study/bean/ClientCodeLiveData;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/MyApplication;->clientCodeLiveData:Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 7
    .line 8
    return-void
.end method

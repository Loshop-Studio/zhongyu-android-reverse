.class public final Lcom/zykj/student/dialogue/App;
.super Lg6/j;
.source "SourceFile"

# interfaces
.implements Landroidx/work/Configuration$Provider;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016J\u0008\u0010\u0017\u001a\u00020\u0016H\u0002J\u0008\u0010\u0018\u001a\u00020\u0016H\u0002J\u0008\u0010\u0019\u001a\u00020\u0016H\u0002J\u0008\u0010\u001a\u001a\u00020\u0016H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u000c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/App;",
        "Landroid/app/Application;",
        "Landroidx/work/Configuration$Provider;",
        "<init>",
        "()V",
        "ossTaskManger",
        "Lcom/zykj/student/dialogue/upload/OssTaskManger;",
        "getOssTaskManger",
        "()Lcom/zykj/student/dialogue/upload/OssTaskManger;",
        "setOssTaskManger",
        "(Lcom/zykj/student/dialogue/upload/OssTaskManger;)V",
        "workerFactory",
        "Landroidx/hilt/work/HiltWorkerFactory;",
        "getWorkerFactory",
        "()Landroidx/hilt/work/HiltWorkerFactory;",
        "setWorkerFactory",
        "(Landroidx/hilt/work/HiltWorkerFactory;)V",
        "workManagerConfiguration",
        "Landroidx/work/Configuration;",
        "getWorkManagerConfiguration",
        "()Landroidx/work/Configuration;",
        "onCreate",
        "",
        "initBugly",
        "initMessageClient",
        "reflectComposeValue",
        "initLogHelper",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field public ossTaskManger:Lcom/zykj/student/dialogue/upload/OssTaskManger;

.field public workerFactory:Landroidx/hilt/work/HiltWorkerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lg6/j;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final initBugly()V
    .locals 2

    .line 1
    const-string v0, "7e6d1d7c64"

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

.method private final initLogHelper()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/LogUtils;->getConfig()Lcom/blankj/utilcode/util/LogUtils$Config;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "StudentDialogue"

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

.method private final initMessageClient()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/zykj/message/client/MessageClient;->g(Landroid/app/Application;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final reflectComposeValue()V
    .locals 3

    .line 1
    const-string v0, "androidx.compose.material3.tokens.NavigationDrawerTokens"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/ReflectUtils;->reflect(Ljava/lang/String;)Lcom/blankj/utilcode/util/ReflectUtils;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "ContainerWidth"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/ReflectUtils;->field(Ljava/lang/String;Ljava/lang/Object;)Lcom/blankj/utilcode/util/ReflectUtils;

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final getOssTaskManger()Lcom/zykj/student/dialogue/upload/OssTaskManger;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/App;->ossTaskManger:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "ossTaskManger"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public getWorkManagerConfiguration()Landroidx/work/Configuration;
    .locals 2

    .line 1
    new-instance v0, Landroidx/work/Configuration$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/work/Configuration$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/App;->getWorkerFactory()Landroidx/hilt/work/HiltWorkerFactory;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Landroidx/work/Configuration$Builder;->setWorkerFactory(Landroidx/work/WorkerFactory;)Landroidx/work/Configuration$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-virtual {v0, v1}, Landroidx/work/Configuration$Builder;->setMinimumLoggingLevel(I)Landroidx/work/Configuration$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroidx/work/Configuration$Builder;->build()Landroidx/work/Configuration;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public final getWorkerFactory()Landroidx/hilt/work/HiltWorkerFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/App;->workerFactory:Landroidx/hilt/work/HiltWorkerFactory;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "workerFactory"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Lg6/j;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/student/dialogue/App;->reflectComposeValue()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/student/dialogue/App;->initMessageClient()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/student/dialogue/App;->initLogHelper()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/zykj/student/dialogue/App;->initBugly()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setOssTaskManger(Lcom/zykj/student/dialogue/upload/OssTaskManger;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/student/dialogue/App;->ossTaskManger:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 7
    .line 8
    return-void
.end method

.method public final setWorkerFactory(Landroidx/hilt/work/HiltWorkerFactory;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/student/dialogue/App;->workerFactory:Landroidx/hilt/work/HiltWorkerFactory;

    .line 7
    .line 8
    return-void
.end method

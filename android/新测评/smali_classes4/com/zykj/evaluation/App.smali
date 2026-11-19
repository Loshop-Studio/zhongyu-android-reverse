.class public final Lcom/zykj/evaluation/App;
.super Lk5/j;
.source "SourceFile"

# interfaces
.implements Landroidx/work/Configuration$Provider;
.implements Lcoil3/l$a;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0005J\u000f\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0005J\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/evaluation/App;",
        "Landroid/app/Application;",
        "Landroidx/work/Configuration$Provider;",
        "Lcoil3/l$a;",
        "<init>",
        "()V",
        "",
        "initMessageClient",
        "reflectComposeValue",
        "initLogHelper",
        "onCreate",
        "Landroid/content/Context;",
        "Lcoil3/PlatformContext;",
        "context",
        "Lcoil3/e;",
        "newImageLoader",
        "(Landroid/content/Context;)Lcoil3/e;",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "getOssTaskManger",
        "()Lcom/zykj/evaluation/upload/OssTaskManger;",
        "setOssTaskManger",
        "(Lcom/zykj/evaluation/upload/OssTaskManger;)V",
        "Landroidx/hilt/work/HiltWorkerFactory;",
        "workerFactory",
        "Landroidx/hilt/work/HiltWorkerFactory;",
        "getWorkerFactory",
        "()Landroidx/hilt/work/HiltWorkerFactory;",
        "setWorkerFactory",
        "(Landroidx/hilt/work/HiltWorkerFactory;)V",
        "Landroidx/work/Configuration;",
        "getWorkManagerConfiguration",
        "()Landroidx/work/Configuration;",
        "workManagerConfiguration",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 App.kt\ncom/zykj/evaluation/App\n+ 2 ImageLoader.kt\ncoil3/ImageLoader$Builder\n*L\n1#1,109:1\n124#2:110\n*S KotlinDebug\n*F\n+ 1 App.kt\ncom/zykj/evaluation/App\n*L\n86#1:110\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field public ossTaskManger:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public workerFactory:Landroidx/hilt/work/HiltWorkerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk5/j;-><init>()V

    .line 2
    .line 3
    .line 4
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
    const-string v1, "NewEvaluation"

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
    invoke-virtual {v0, p0}, Lcom/zykj/message/client/MessageClient;->m(Landroid/app/Application;)V

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
.method public final getOssTaskManger()Lcom/zykj/evaluation/upload/OssTaskManger;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/App;->ossTaskManger:Lcom/zykj/evaluation/upload/OssTaskManger;

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
    invoke-virtual {p0}, Lcom/zykj/evaluation/App;->getWorkerFactory()Landroidx/hilt/work/HiltWorkerFactory;

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
    iget-object v0, p0, Lcom/zykj/evaluation/App;->workerFactory:Landroidx/hilt/work/HiltWorkerFactory;

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

.method public newImageLoader(Landroid/content/Context;)Lcoil3/e;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcoil3/e$a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcoil3/e$a;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lcoil3/a$a;

    .line 12
    .line 13
    invoke-direct {p1}, Lcoil3/a$a;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/zykj/evaluation/App$a;->a:Lcom/zykj/evaluation/App$a;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lcoil3/a$a;->h(Lcoil3/intercept/a;)Lcoil3/a$a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcoil3/a$a;->p()Lcoil3/a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Lcoil3/e$a;->h(Lcoil3/a;)Lcoil3/e$a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcoil3/e$a;->d()Lcoil3/e;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lk5/j;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/evaluation/App;->reflectComposeValue()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/evaluation/App;->initMessageClient()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/webkit/WebView;->enableSlowWholeDocumentDraw()V

    .line 15
    .line 16
    .line 17
    const-string v1, "9ad4d192c3"

    .line 18
    .line 19
    invoke-static {p0, v1, v0}, Lcom/tencent/bugly/crashreport/CrashReport;->initCrashReport(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/zykj/evaluation/App;->initLogHelper()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setOssTaskManger(Lcom/zykj/evaluation/upload/OssTaskManger;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/evaluation/App;->ossTaskManger:Lcom/zykj/evaluation/upload/OssTaskManger;

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
    iput-object p1, p0, Lcom/zykj/evaluation/App;->workerFactory:Landroidx/hilt/work/HiltWorkerFactory;

    .line 7
    .line 8
    return-void
.end method

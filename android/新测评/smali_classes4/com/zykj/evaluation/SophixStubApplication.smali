.class public final Lcom/zykj/evaluation/SophixStubApplication;
.super Lcom/taobao/sophix/SophixApplication;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/SophixStubApplication$RealApplicationStub;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0008\u0010\u0008\u001a\u00020\u0005H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/zykj/evaluation/SophixStubApplication;",
        "Lcom/taobao/sophix/SophixApplication;",
        "<init>",
        "()V",
        "attachBaseContext",
        "",
        "base",
        "Landroid/content/Context;",
        "initSophix",
        "RealApplicationStub",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/taobao/sophix/SophixApplication;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(IILjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/evaluation/SophixStubApplication;->initSophix$lambda$0(IILjava/lang/String;I)V

    return-void
.end method

.method private final initSophix()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/taobao/sophix/SophixManager;->getInstance()Lcom/taobao/sophix/SophixManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/taobao/sophix/SophixManager;->setContext(Landroid/app/Application;)Lcom/taobao/sophix/SophixManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/taobao/sophix/SophixManager;->setAppVersion(Ljava/lang/String;)Lcom/taobao/sophix/SophixManager;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "42783d554a54402d9f860b33b14255eb"

    .line 29
    .line 30
    const-string v2, "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCTnOfA7kTVEJt1COo8SkRSfqbKa3P4keRduGuku4nrI+JGvXUehjCmqdBpH1oRg7QjVEM0gfXu3lEujEh959p+bcnIGCfb7tMGrK5yWet6/4XvAw+DME6WvKNi93+BZdVq+lyvH03igDXAXsmW4gl/XNt5P29T2ledyjNS8FuvPO/1hpX17N7xBiz7Bf3/E1zTsmNOgiVY/ND5DKuH3RvQpIhagYS78atKWZwouNlCsB9J39aAFTH+yMu6zt9CgSVl+PTfKzjeWTx9561G2R0HOUINmVuJeOAHIVezWoN5AGkeI2YaFivBy3c5+2e2BJIkMSM9EFXcdwMg1aNXC8nLAgMBAAECggEAfTe6+NSmmz9tQEiBuwcdEgXSIyAnzpKj8ETDO4jDJC7agjuxIGWg26Bt5N7tnrHkm5udLuuX3jvFDgF+dR+7H0iuxQiIt27OoHjXurVApqQfz3L/M8BEymXXC9r71J63/fnHqd6aSSuNbVR7GX1BpUL2AtKm87DiZj3ib9bpT6rM5MjZ6126FUPycaW5TKQrBUkGYMxLZhs+ys9kCEGklPaiNkY/mRN8Y73nPRzDs3w1Vd7puP3QcwrbBn5yHsagNhfBvvtZ+b1qXrBhMFwKOkruk3E3baHl5eJrKtLBPw+uRU+tV2jiGxmgnrKK/JH1pmJHV9DSXff4tkWsoM9OsQKBgQDSZPT3APmCF1bKJuHumM6eP8sezPcCKZuIz+JOYVGee/PxWy6jhcZ0wGshE3onHLhfRm2qzgoMyRtgmx55A4MeaZL9NPUDbcQfUd3ICgr0ZKiM2VjIMaI6DhN5HyuUrv8vnBkpHnXc9nphBIZvomTb2eqWy3+/Ek1QBNxp/nOw7wKBgQCznCDKYRUeVwvhMiIvrXPC2oER5mLFTzuvHW57zUSsQqIib6bFU/T64eQwanYpZxIv5p5jUnMiQjcE6LzWuhD55U9XEr7DwqSfWYDNMBJq87cUkW1P2d9OuyeiFZQ18YmV4D7ZjP/G6lq7A3rpJImgWenycvILYUOAe5rBuFG85QKBgQCbFKVoCATh+jgT69MvXt010knzWxtbMbYegzUJlzxlOHKYXiCjkfC1kDum9sdcWxQfzjb55sOLpxUSAWTVyFv2p9Ub5NQRAfDFMT/rulNWz3dZ0r9ZWRR9/HAoIGysPM2Gl2YIZBZ2mAuexYoecTIsx5TeMAPqoB/yspKRYmh+awKBgC6wSyXQjrjQT9o+OfzCzfC89Ag/JzW7HvyqXen4tf1BZPwmoedxp6D/z112jzi7/lJNVKbk6+Df7YVtKol23KrZHQK5cLVah4iUr5KnCGKc79583zl+nTnOFMNhcKGFJAq9vBi5OlPu3571jKHGSbBRLytDDgA/TFi9yMDKtRSxAoGAeWM814Sdu+MApxfOGfCN+y35rDXtj0ZrIx6YOgU0ZbfDWCHUyEbHIZ7oTgN9+WhAXzhZjZrHHF05ZJztX/D0OKMFF2JjFg7MXKWGHFABYwnlVv4079NQO7y6H4JkBDUa/GcSwuh9Wt+W1/LkNijzP6Na2GKboWhZfL2LlMZsXlI="

    .line 31
    .line 32
    const-string v4, "333899825-1"

    .line 33
    .line 34
    invoke-virtual {v0, v4, v1, v2}, Lcom/taobao/sophix/SophixManager;->setSecretMetaData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/taobao/sophix/SophixManager;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, v3}, Lcom/taobao/sophix/SophixManager;->setEnableDebug(Z)Lcom/taobao/sophix/SophixManager;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v1, Lk5/k;

    .line 43
    .line 44
    invoke-direct {v1}, Lk5/k;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/taobao/sophix/SophixManager;->setPatchLoadStatusStub(Lcom/taobao/sophix/listener/PatchLoadStatusListener;)Lcom/taobao/sophix/SophixManager;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lcom/taobao/sophix/SophixManager;->initialize()V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/taobao/sophix/SophixManager;->getInstance()Lcom/taobao/sophix/SophixManager;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lcom/taobao/sophix/SophixManager;->queryAndLoadNewPatch()V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private static final initSophix$lambda$0(IILjava/lang/String;I)V
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    const-string p2, "Sophix"

    .line 3
    .line 4
    if-eq p1, p0, :cond_1

    .line 5
    .line 6
    const/16 p0, 0xc

    .line 7
    .line 8
    if-eq p1, p0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "sophix preload patch success. restart app to make effect."

    .line 12
    .line 13
    invoke-static {p2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const-string p0, "sophix load patch success!"

    .line 18
    .line 19
    invoke-static {p2, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
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
    invoke-static {p0}, Landroidx/multidex/MultiDex;->install(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/evaluation/SophixStubApplication;->initSophix()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

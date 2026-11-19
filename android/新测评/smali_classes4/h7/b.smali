.class public interface abstract Lh7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J.\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0003\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0003\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n\u00c0\u0006\u0003"
    }
    d2 = {
        "Lh7/b;",
        "",
        "",
        "packageName",
        "",
        "version",
        "appType",
        "Lcom/zykj/evaluation/version/VersionResp;",
        "b",
        "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
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


# direct methods
.method public static synthetic a(Lh7/b;Ljava/lang/String;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_3

    .line 2
    .line 3
    and-int/lit8 p6, p5, 0x1

    .line 4
    .line 5
    if-eqz p6, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p6, "getAppPackageName(...)"

    .line 12
    .line 13
    invoke-static {p1, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 17
    .line 18
    if-eqz p6, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionCode()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 25
    .line 26
    if-eqz p5, :cond_2

    .line 27
    .line 28
    sget-object p3, Lh7/a$a;->b:Lh7/a$a;

    .line 29
    .line 30
    invoke-virtual {p3}, Lh7/a;->a()I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    :cond_2
    invoke-interface {p0, p1, p2, p3, p4}, Lh7/b;->b(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 40
    .line 41
    const-string p1, "Super calls with default arguments not supported in this target, function: checkVersion"

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0
.end method


# virtual methods
.method public abstract b(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lu9/t;
            value = "packageName"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lu9/t;
            value = "version"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lu9/t;
            value = "appType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zykj/evaluation/version/VersionResp;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lu9/f;
        value = "/api/services/app/AppStore/CheckUpdateAsync"
    .end annotation
.end method

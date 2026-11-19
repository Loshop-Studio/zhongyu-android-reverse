.class public abstract Lcom/zykj/mistake/base/BasePresenter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::",
        "Li4/b;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\'\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/zykj/mistake/base/BasePresenter;",
        "Li4/b;",
        "V",
        "<init>",
        "()V",
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


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ls5/a;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/zykj/mistake/base/BasePresenter;->a:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Lq5/e;La/a;)V
    .locals 1

    .line 1
    const-string v0, "observable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, p1, p2, v0}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b(Lq5/e;La/a;Z)V
    .locals 2

    .line 1
    const-string v0, "observable"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-interface {v0, v1}, Li4/b;->d(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v0, Li4/a;

    .line 17
    .line 18
    invoke-direct {v0, p0, p2, p3}, Li4/a;-><init>(Lcom/zykj/mistake/base/BasePresenter;La/a;Z)V

    .line 19
    .line 20
    .line 21
    sget-object p2, Lc6/f;->a:Lq5/j;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Lq5/e;->d(Lq5/j;)Lio/reactivex/internal/operators/observable/j;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {}, Lr5/b;->a()Lr5/e;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Lq5/e;->a(Lr5/e;)Lio/reactivex/internal/operators/observable/f;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, v0}, Lq5/e;->b(Lq5/g;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/mistake/base/BasePresenter;->b:Ls5/a;

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    new-instance p1, Ls5/a;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-direct {p1, p2}, Ls5/a;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lcom/zykj/mistake/base/BasePresenter;->b:Ls5/a;

    .line 49
    .line 50
    :cond_1
    iget-object p1, p0, Lcom/zykj/mistake/base/BasePresenter;->b:Ls5/a;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ls5/a;->a(Ls5/b;)Z

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method

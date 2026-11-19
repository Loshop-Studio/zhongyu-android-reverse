.class public final Lcom/zykj/mistake/presenter/MistakeListPresenter;
.super Lcom/zykj/mistake/base/BasePresenter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/base/BasePresenter<",
        "Lcom/zykj/mistake/activity/MistakeListActivity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/zykj/mistake/presenter/MistakeListPresenter;",
        "Lcom/zykj/mistake/base/BasePresenter;",
        "Lcom/zykj/mistake/activity/MistakeListActivity;",
        "",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BasePresenter;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final c(JLjava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "tag"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "oldTag"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/mistake/entity/req/CreateTagReq;

    .line 12
    .line 13
    invoke-direct {v0, p3, p1, p2}, Lcom/zykj/mistake/entity/req/CreateTagReq;-><init>(Ljava/lang/String;J)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 17
    .line 18
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1, v0}, Lcom/zykj/mistake/network/b;->h(Lcom/zykj/mistake/entity/req/CreateTagReq;)Lq5/e;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lb5/c;

    .line 27
    .line 28
    const/4 v7, 0x2

    .line 29
    move-object v4, p0

    .line 30
    move-wide v2, p1

    .line 31
    move-object v5, p3

    .line 32
    move-object v6, p4

    .line 33
    invoke-direct/range {v1 .. v7}, Lb5/c;-><init>(JLcom/zykj/mistake/base/BasePresenter;Ljava/lang/String;Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0, v1}, Lcom/zykj/mistake/base/BasePresenter;->a(Lq5/e;La/a;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final d(Lcom/zykj/mistake/entity/req/MistakeListReq;Z)V
    .locals 1

    .line 1
    const-string v0, "req"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 7
    .line 8
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Lcom/zykj/mistake/network/b;->e(Lcom/zykj/mistake/entity/req/MistakeListReq;)Lq5/e;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, Lb5/e;

    .line 17
    .line 18
    invoke-direct {v0, p0, p2}, Lb5/e;-><init>(Lcom/zykj/mistake/presenter/MistakeListPresenter;Z)V

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p0, p1, v0, p2}, Lcom/zykj/mistake/base/BasePresenter;->b(Lq5/e;La/a;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

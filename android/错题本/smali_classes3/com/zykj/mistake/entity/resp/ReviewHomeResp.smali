.class public final Lcom/zykj/mistake/entity/resp/ReviewHomeResp;
.super Lcom/zykj/mistake/network/ApiResp;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/ReviewHomeResp;",
        "Lcom/zykj/mistake/network/ApiResp;",
        "<init>",
        "()V",
        "result",
        "Lcom/zykj/mistake/entity/resp/ReviewHomeResult;",
        "getResult",
        "()Lcom/zykj/mistake/entity/resp/ReviewHomeResult;",
        "setResult",
        "(Lcom/zykj/mistake/entity/resp/ReviewHomeResult;)V",
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
.field private result:Lcom/zykj/mistake/entity/resp/ReviewHomeResult;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/network/ApiResp;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;

    .line 5
    .line 6
    const/16 v8, 0x7f

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    invoke-direct/range {v0 .. v9}, Lcom/zykj/mistake/entity/resp/ReviewHomeResult;-><init>(IZLcom/zykj/mistake/entity/resp/ReviewPracticeMode;Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;Lcom/zykj/mistake/entity/resp/ReviewPracticeMode;Lcom/zykj/mistake/entity/resp/ReviewPerformance;ILkotlin/jvm/internal/e;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/zykj/mistake/entity/resp/ReviewHomeResp;->result:Lcom/zykj/mistake/entity/resp/ReviewHomeResult;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final getResult()Lcom/zykj/mistake/entity/resp/ReviewHomeResult;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/ReviewHomeResp;->result:Lcom/zykj/mistake/entity/resp/ReviewHomeResult;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setResult(Lcom/zykj/mistake/entity/resp/ReviewHomeResult;)V
    .locals 1
    .param p1    # Lcom/zykj/mistake/entity/resp/ReviewHomeResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/ReviewHomeResp;->result:Lcom/zykj/mistake/entity/resp/ReviewHomeResult;

    .line 7
    .line 8
    return-void
.end method

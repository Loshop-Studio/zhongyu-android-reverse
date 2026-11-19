.class public final Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;
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
        "Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;",
        "Lcom/zykj/mistake/network/ApiResp;",
        "<init>",
        "()V",
        "result",
        "Lcom/zykj/mistake/entity/resp/SubmitReviewResult;",
        "getResult",
        "()Lcom/zykj/mistake/entity/resp/SubmitReviewResult;",
        "setResult",
        "(Lcom/zykj/mistake/entity/resp/SubmitReviewResult;)V",
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
.field private result:Lcom/zykj/mistake/entity/resp/SubmitReviewResult;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 19

    .line 1
    invoke-direct/range {p0 .. p0}, Lcom/zykj/mistake/network/ApiResp;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    .line 5
    .line 6
    const/16 v17, 0x7fff

    .line 7
    .line 8
    const/16 v18, 0x0

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v12, 0x0

    .line 22
    const/4 v13, 0x0

    .line 23
    const/4 v14, 0x0

    .line 24
    const/4 v15, 0x0

    .line 25
    const/16 v16, 0x0

    .line 26
    .line 27
    invoke-direct/range {v0 .. v18}, Lcom/zykj/mistake/entity/resp/SubmitReviewResult;-><init>(JIIILjava/lang/String;Ljava/lang/String;ZZZZZZZZLcom/zykj/mistake/entity/resp/ReviewResultSummary;ILkotlin/jvm/internal/e;)V

    .line 28
    .line 29
    .line 30
    move-object v1, v0

    .line 31
    move-object/from16 v0, p0

    .line 32
    .line 33
    iput-object v1, v0, Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;->result:Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final getResult()Lcom/zykj/mistake/entity/resp/SubmitReviewResult;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;->result:Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setResult(Lcom/zykj/mistake/entity/resp/SubmitReviewResult;)V
    .locals 1
    .param p1    # Lcom/zykj/mistake/entity/resp/SubmitReviewResult;
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
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;->result:Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    .line 7
    .line 8
    return-void
.end method

.class public final Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000e\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;",
        "",
        "sessionId",
        "",
        "itemId",
        "",
        "isCorrect",
        "",
        "<init>",
        "(JIZ)V",
        "getSessionId",
        "()J",
        "getItemId",
        "()I",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
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
.field public static final $stable:I


# instance fields
.field private final isCorrect:Z

.field private final itemId:I

.field private final sessionId:J


# direct methods
.method public constructor <init>(JIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->sessionId:J

    .line 5
    .line 6
    iput p3, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->itemId:I

    .line 7
    .line 8
    iput-boolean p4, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->isCorrect:Z

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;JIZILjava/lang/Object;)Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-wide p1, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->sessionId:J

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p3, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->itemId:I

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-boolean p4, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->isCorrect:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->copy(JIZ)Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->sessionId:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->itemId:I

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->isCorrect:Z

    return v0
.end method

.method public final copy(JIZ)Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;-><init>(JIZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;

    iget-wide v3, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->sessionId:J

    iget-wide v5, p1, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->sessionId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->itemId:I

    iget v3, p1, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->itemId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->isCorrect:Z

    iget-boolean p1, p1, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->isCorrect:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getItemId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->itemId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSessionId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->sessionId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->sessionId:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->itemId:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->isCorrect:Z

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v0

    .line 23
    return v1
.end method

.method public final isCorrect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->isCorrect:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-wide v0, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->sessionId:J

    iget v2, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->itemId:I

    iget-boolean v3, p0, Lcom/zykj/mistake/entity/req/SubmitReviewResultReq;->isCorrect:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "SubmitReviewResultReq(sessionId="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", itemId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isCorrect="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

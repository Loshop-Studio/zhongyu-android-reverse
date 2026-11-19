.class public final Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0018\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001BM\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010 \u001a\u00020\u000b2\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006%"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;",
        "",
        "sessionId",
        "",
        "mode",
        "",
        "totalCount",
        "needStrengthenCount",
        "consolidatingCount",
        "masteredCount",
        "hasQuestion",
        "",
        "<init>",
        "(JIIIIIZ)V",
        "getSessionId",
        "()J",
        "getMode",
        "()I",
        "getTotalCount",
        "getNeedStrengthenCount",
        "getConsolidatingCount",
        "getMasteredCount",
        "getHasQuestion",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
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
.field private final consolidatingCount:I

.field private final hasQuestion:Z

.field private final masteredCount:I

.field private final mode:I

.field private final needStrengthenCount:I

.field private final sessionId:J

.field private final totalCount:I


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0x7f

    const/4 v10, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;-><init>(JIIIIIZILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(JIIIIIZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->sessionId:J

    .line 4
    iput p3, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->mode:I

    .line 5
    iput p4, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->totalCount:I

    .line 6
    iput p5, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->needStrengthenCount:I

    .line 7
    iput p6, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->consolidatingCount:I

    .line 8
    iput p7, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->masteredCount:I

    .line 9
    iput-boolean p8, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->hasQuestion:Z

    return-void
.end method

.method public synthetic constructor <init>(JIIIIIZILkotlin/jvm/internal/e;)V
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    move v3, p2

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    move v4, p2

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    move v5, p2

    goto :goto_2

    :cond_3
    move v5, p5

    :goto_2
    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    move v6, p2

    goto :goto_3

    :cond_4
    move v6, p6

    :goto_3
    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    move v7, p2

    goto :goto_4

    :cond_5
    move/from16 v7, p7

    :goto_4
    and-int/lit8 p1, p9, 0x40

    if-eqz p1, :cond_6

    move v8, p2

    :goto_5
    move-object v0, p0

    goto :goto_6

    :cond_6
    move/from16 v8, p8

    goto :goto_5

    .line 10
    :goto_6
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;-><init>(JIIIIIZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;JIIIIIZILjava/lang/Object;)Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->sessionId:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->mode:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget p4, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->totalCount:I

    :cond_2
    move v4, p4

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget p5, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->needStrengthenCount:I

    :cond_3
    move v5, p5

    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    iget p6, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->consolidatingCount:I

    :cond_4
    move v6, p6

    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->masteredCount:I

    move v7, p1

    goto :goto_0

    :cond_5
    move/from16 v7, p7

    :goto_0
    and-int/lit8 p1, p9, 0x40

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->hasQuestion:Z

    move v8, p1

    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_6
    move/from16 v8, p8

    goto :goto_1

    :goto_2
    invoke-virtual/range {v0 .. v8}, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->copy(JIIIIIZ)Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->sessionId:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->mode:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->totalCount:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->needStrengthenCount:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->consolidatingCount:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->masteredCount:I

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->hasQuestion:Z

    return v0
.end method

.method public final copy(JIIIIIZ)Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;-><init>(JIIIIIZ)V

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
    instance-of v1, p1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;

    iget-wide v3, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->sessionId:J

    iget-wide v5, p1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->sessionId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->mode:I

    iget v3, p1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->mode:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->totalCount:I

    iget v3, p1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->totalCount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->needStrengthenCount:I

    iget v3, p1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->needStrengthenCount:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->consolidatingCount:I

    iget v3, p1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->consolidatingCount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->masteredCount:I

    iget v3, p1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->masteredCount:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->hasQuestion:Z

    iget-boolean p1, p1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->hasQuestion:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getConsolidatingCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->consolidatingCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getHasQuestion()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->hasQuestion:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getMasteredCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->masteredCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->mode:I

    .line 2
    .line 3
    return v0
.end method

.method public final getNeedStrengthenCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->needStrengthenCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSessionId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->sessionId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTotalCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->totalCount:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->sessionId:J

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
    iget v2, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->mode:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->totalCount:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->needStrengthenCount:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->consolidatingCount:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->masteredCount:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v1, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->hasQuestion:Z

    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    add-int/2addr v1, v0

    .line 47
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->sessionId:J

    iget v2, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->mode:I

    iget v3, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->totalCount:I

    iget v4, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->needStrengthenCount:I

    iget v5, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->consolidatingCount:I

    iget v6, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->masteredCount:I

    iget-boolean v7, p0, Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;->hasQuestion:Z

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "StartReviewSessionResult(sessionId="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", mode="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", totalCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", needStrengthenCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", consolidatingCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", masteredCount="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", hasQuestion="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

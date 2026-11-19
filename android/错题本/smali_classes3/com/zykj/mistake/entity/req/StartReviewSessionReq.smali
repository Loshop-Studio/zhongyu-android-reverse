.class public final Lcom/zykj/mistake/entity/req/StartReviewSessionReq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/req/StartReviewSessionReq;",
        "",
        "mode",
        "",
        "<init>",
        "(I)V",
        "getMode",
        "()I",
        "component1",
        "copy",
        "equals",
        "",
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
.field private final mode:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;->mode:I

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/mistake/entity/req/StartReviewSessionReq;IILjava/lang/Object;)Lcom/zykj/mistake/entity/req/StartReviewSessionReq;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget p1, p0, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;->mode:I

    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;->copy(I)Lcom/zykj/mistake/entity/req/StartReviewSessionReq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;->mode:I

    return v0
.end method

.method public final copy(I)Lcom/zykj/mistake/entity/req/StartReviewSessionReq;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;

    invoke-direct {v0, p1}, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;-><init>(I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;

    iget v1, p0, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;->mode:I

    iget p1, p1, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;->mode:I

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;->mode:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;->mode:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/StartReviewSessionReq;->mode:I

    .line 2
    .line 3
    const-string v1, "StartReviewSessionReq(mode="

    .line 4
    .line 5
    const-string v2, ")"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroid/support/v4/media/f;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

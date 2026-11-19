.class public final Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;",
        "",
        "collectionId",
        "",
        "sortType",
        "sortDirection",
        "skipCount",
        "maxResultCount",
        "<init>",
        "(IIIII)V",
        "getCollectionId",
        "()I",
        "getSortType",
        "getSortDirection",
        "getSkipCount",
        "getMaxResultCount",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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
.field private final collectionId:I

.field private final maxResultCount:I

.field private final skipCount:I

.field private final sortDirection:I

.field private final sortType:I


# direct methods
.method public constructor <init>(IIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->collectionId:I

    .line 3
    iput p2, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortType:I

    .line 4
    iput p3, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortDirection:I

    .line 5
    iput p4, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->skipCount:I

    .line 6
    iput p5, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->maxResultCount:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    const/4 p3, 0x1

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    const/16 p5, 0x14

    :cond_3
    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 7
    invoke-direct/range {p1 .. p6}, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;-><init>(IIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;IIIIIILjava/lang/Object;)Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->collectionId:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortType:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortDirection:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->skipCount:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->maxResultCount:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->copy(IIIII)Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->collectionId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortType:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortDirection:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->skipCount:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->maxResultCount:I

    return v0
.end method

.method public final copy(IIIII)Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;-><init>(IIIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;

    iget v1, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->collectionId:I

    iget v3, p1, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->collectionId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortType:I

    iget v3, p1, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortDirection:I

    iget v3, p1, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortDirection:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->skipCount:I

    iget v3, p1, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->skipCount:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->maxResultCount:I

    iget p1, p1, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->maxResultCount:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCollectionId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->collectionId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMaxResultCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->maxResultCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSkipCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->skipCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSortDirection()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortDirection:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSortType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortType:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->collectionId:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget v2, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortType:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortDirection:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->skipCount:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v1, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->maxResultCount:I

    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    add-int/2addr v1, v0

    .line 35
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->collectionId:I

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortType:I

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->sortDirection:I

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->skipCount:I

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/mistake/entity/req/GetCollectionItemsReq;->maxResultCount:I

    .line 10
    .line 11
    const-string v5, ", sortType="

    .line 12
    .line 13
    const-string v6, ", sortDirection="

    .line 14
    .line 15
    const-string v7, "GetCollectionItemsReq(collectionId="

    .line 16
    .line 17
    invoke-static {v7, v5, v0, v6, v1}, Landroid/support/v4/media/f;->x(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, ", skipCount="

    .line 22
    .line 23
    const-string v5, ", maxResultCount="

    .line 24
    .line 25
    invoke-static {v0, v2, v1, v3, v5}, Landroidx/compose/material3/c;->w(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    invoke-static {v0, v1, v4}, Landroid/support/v4/media/f;->o(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

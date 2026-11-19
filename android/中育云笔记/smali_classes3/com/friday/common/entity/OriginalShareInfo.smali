.class public final Lcom/friday/common/entity/OriginalShareInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final shareFileList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/friday/common/entity/OriginalShareInfoChild;",
            ">;"
        }
    .end annotation
.end field

.field private final totalCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/friday/common/entity/OriginalShareInfoChild;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "shareFileList"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lcom/friday/common/entity/OriginalShareInfo;->totalCount:I

    .line 10
    .line 11
    iput-object p2, p0, Lcom/friday/common/entity/OriginalShareInfo;->shareFileList:Ljava/util/List;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/OriginalShareInfo;ILjava/util/List;ILjava/lang/Object;)Lcom/friday/common/entity/OriginalShareInfo;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/friday/common/entity/OriginalShareInfo;->totalCount:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/friday/common/entity/OriginalShareInfo;->shareFileList:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/entity/OriginalShareInfo;->copy(ILjava/util/List;)Lcom/friday/common/entity/OriginalShareInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/friday/common/entity/OriginalShareInfo;->totalCount:I

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/friday/common/entity/OriginalShareInfoChild;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfo;->shareFileList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/util/List;)Lcom/friday/common/entity/OriginalShareInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/friday/common/entity/OriginalShareInfoChild;",
            ">;)",
            "Lcom/friday/common/entity/OriginalShareInfo;"
        }
    .end annotation

    const-string v0, "shareFileList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/common/entity/OriginalShareInfo;

    invoke-direct {v0, p1, p2}, Lcom/friday/common/entity/OriginalShareInfo;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/OriginalShareInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/OriginalShareInfo;

    iget v1, p0, Lcom/friday/common/entity/OriginalShareInfo;->totalCount:I

    iget v3, p1, Lcom/friday/common/entity/OriginalShareInfo;->totalCount:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfo;->shareFileList:Ljava/util/List;

    iget-object p1, p1, Lcom/friday/common/entity/OriginalShareInfo;->shareFileList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getShareFileList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/friday/common/entity/OriginalShareInfoChild;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OriginalShareInfo;->shareFileList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTotalCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/common/entity/OriginalShareInfo;->totalCount:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/friday/common/entity/OriginalShareInfo;->totalCount:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfo;->shareFileList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/friday/common/entity/OriginalShareInfo;->totalCount:I

    iget-object v1, p0, Lcom/friday/common/entity/OriginalShareInfo;->shareFileList:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OriginalShareInfo(totalCount="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", shareFileList="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/zykj/study/data/CatalogEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation build Landroidx/room/Entity;
    tableName = "catalog"
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final courseId:I

.field private final id:I
    .annotation build Landroidx/room/PrimaryKey;
    .end annotation
.end field

.field private final isLeaf:Z

.field private final parentId:I

.field private final progress:I

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;ZII)V
    .locals 1

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/study/data/CatalogEntity;->id:I

    .line 3
    iput p2, p0, Lcom/zykj/study/data/CatalogEntity;->courseId:I

    .line 4
    iput-object p3, p0, Lcom/zykj/study/data/CatalogEntity;->title:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Lcom/zykj/study/data/CatalogEntity;->isLeaf:Z

    .line 6
    iput p5, p0, Lcom/zykj/study/data/CatalogEntity;->progress:I

    .line 7
    iput p6, p0, Lcom/zykj/study/data/CatalogEntity;->parentId:I

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;ZIIILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 8
    const-string p3, ""

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    const/4 p8, 0x0

    if-eqz p3, :cond_1

    move v4, p8

    goto :goto_0

    :cond_1
    move v4, p4

    :goto_0
    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    move v5, p8

    goto :goto_1

    :cond_2
    move v5, p5

    :goto_1
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    move v6, p8

    :goto_2
    move-object v0, p0

    move v1, p1

    move v2, p2

    goto :goto_3

    :cond_3
    move v6, p6

    goto :goto_2

    .line 9
    :goto_3
    invoke-direct/range {v0 .. v6}, Lcom/zykj/study/data/CatalogEntity;-><init>(IILjava/lang/String;ZII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/data/CatalogEntity;IILjava/lang/String;ZIIILjava/lang/Object;)Lcom/zykj/study/data/CatalogEntity;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/zykj/study/data/CatalogEntity;->id:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/zykj/study/data/CatalogEntity;->courseId:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/zykj/study/data/CatalogEntity;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/zykj/study/data/CatalogEntity;->isLeaf:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/zykj/study/data/CatalogEntity;->progress:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lcom/zykj/study/data/CatalogEntity;->parentId:I

    :cond_5
    move p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/zykj/study/data/CatalogEntity;->copy(IILjava/lang/String;ZII)Lcom/zykj/study/data/CatalogEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->id:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->courseId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/data/CatalogEntity;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/data/CatalogEntity;->isLeaf:Z

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->progress:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->parentId:I

    return v0
.end method

.method public final copy(IILjava/lang/String;ZII)Lcom/zykj/study/data/CatalogEntity;
    .locals 8

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/data/CatalogEntity;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/data/CatalogEntity;-><init>(IILjava/lang/String;ZII)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/data/CatalogEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/data/CatalogEntity;

    iget v1, p0, Lcom/zykj/study/data/CatalogEntity;->id:I

    iget v3, p1, Lcom/zykj/study/data/CatalogEntity;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/data/CatalogEntity;->courseId:I

    iget v3, p1, Lcom/zykj/study/data/CatalogEntity;->courseId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/data/CatalogEntity;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/data/CatalogEntity;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/study/data/CatalogEntity;->isLeaf:Z

    iget-boolean v3, p1, Lcom/zykj/study/data/CatalogEntity;->isLeaf:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/zykj/study/data/CatalogEntity;->progress:I

    iget v3, p1, Lcom/zykj/study/data/CatalogEntity;->progress:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/study/data/CatalogEntity;->parentId:I

    iget p1, p1, Lcom/zykj/study/data/CatalogEntity;->parentId:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getCourseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->courseId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getParentId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->parentId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->progress:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/CatalogEntity;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/data/CatalogEntity;->courseId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/data/CatalogEntity;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/data/CatalogEntity;->isLeaf:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/data/CatalogEntity;->progress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/data/CatalogEntity;->parentId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isLeaf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/data/CatalogEntity;->isLeaf:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lcom/zykj/study/data/CatalogEntity;->id:I

    iget v1, p0, Lcom/zykj/study/data/CatalogEntity;->courseId:I

    iget-object v2, p0, Lcom/zykj/study/data/CatalogEntity;->title:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/zykj/study/data/CatalogEntity;->isLeaf:Z

    iget v4, p0, Lcom/zykj/study/data/CatalogEntity;->progress:I

    iget v5, p0, Lcom/zykj/study/data/CatalogEntity;->parentId:I

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "CatalogEntity(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", courseId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isLeaf="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", progress="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", parentId="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

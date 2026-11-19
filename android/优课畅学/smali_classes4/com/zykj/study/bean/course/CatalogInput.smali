.class public final Lcom/zykj/study/bean/course/CatalogInput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final courseId:I

.field private final isLeaf:Z

.field private final parentId:I

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IZ)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/zykj/study/bean/course/CatalogInput;->courseId:I

    .line 3
    iput-object p2, p0, Lcom/zykj/study/bean/course/CatalogInput;->title:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/zykj/study/bean/course/CatalogInput;->parentId:I

    .line 5
    iput-boolean p4, p0, Lcom/zykj/study/bean/course/CatalogInput;->isLeaf:Z

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IZILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move p4, v0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/zykj/study/bean/course/CatalogInput;-><init>(ILjava/lang/String;IZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/course/CatalogInput;ILjava/lang/String;IZILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogInput;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/course/CatalogInput;->courseId:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/course/CatalogInput;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/zykj/study/bean/course/CatalogInput;->parentId:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/zykj/study/bean/course/CatalogInput;->isLeaf:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/study/bean/course/CatalogInput;->copy(ILjava/lang/String;IZ)Lcom/zykj/study/bean/course/CatalogInput;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->courseId:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->parentId:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->isLeaf:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;IZ)Lcom/zykj/study/bean/course/CatalogInput;
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/study/bean/course/CatalogInput;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/study/bean/course/CatalogInput;-><init>(ILjava/lang/String;IZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/course/CatalogInput;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/course/CatalogInput;

    iget v1, p0, Lcom/zykj/study/bean/course/CatalogInput;->courseId:I

    iget v3, p1, Lcom/zykj/study/bean/course/CatalogInput;->courseId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogInput;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/course/CatalogInput;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/bean/course/CatalogInput;->parentId:I

    iget v3, p1, Lcom/zykj/study/bean/course/CatalogInput;->parentId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogInput;->isLeaf:Z

    iget-boolean p1, p1, Lcom/zykj/study/bean/course/CatalogInput;->isLeaf:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCourseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->courseId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getParentId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->parentId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->courseId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogInput;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/course/CatalogInput;->parentId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogInput;->isLeaf:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isLeaf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->isLeaf:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogInput;->courseId:I

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogInput;->title:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/study/bean/course/CatalogInput;->parentId:I

    iget-boolean v3, p0, Lcom/zykj/study/bean/course/CatalogInput;->isLeaf:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "CatalogInput(courseId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", parentId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", isLeaf="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

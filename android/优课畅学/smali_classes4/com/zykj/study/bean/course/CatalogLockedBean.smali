.class public final Lcom/zykj/study/bean/course/CatalogLockedBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final children:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogLockedBean;",
            ">;"
        }
    .end annotation
.end field

.field private final id:J

.field private final isLeaf:Z

.field private final locked:I

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;ZILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogLockedBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->id:J

    .line 10
    .line 11
    iput-object p3, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->title:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p4, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf:Z

    .line 14
    .line 15
    iput p5, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->locked:I

    .line 16
    .line 17
    iput-object p6, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->children:Ljava/util/List;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/course/CatalogLockedBean;JLjava/lang/String;ZILjava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogLockedBean;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->title:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget-boolean p4, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf:Z

    :cond_2
    move v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget p5, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->locked:I

    :cond_3
    move v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->children:Ljava/util/List;

    :cond_4
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/zykj/study/bean/course/CatalogLockedBean;->copy(JLjava/lang/String;ZILjava/util/List;)Lcom/zykj/study/bean/course/CatalogLockedBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->locked:I

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogLockedBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->children:Ljava/util/List;

    return-object v0
.end method

.method public final copy(JLjava/lang/String;ZILjava/util/List;)Lcom/zykj/study/bean/course/CatalogLockedBean;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogLockedBean;",
            ">;)",
            "Lcom/zykj/study/bean/course/CatalogLockedBean;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/course/CatalogLockedBean;

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/bean/course/CatalogLockedBean;-><init>(JLjava/lang/String;ZILjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/course/CatalogLockedBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/course/CatalogLockedBean;

    iget-wide v3, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->id:J

    iget-wide v5, p1, Lcom/zykj/study/bean/course/CatalogLockedBean;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/course/CatalogLockedBean;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->locked:I

    iget v3, p1, Lcom/zykj/study/bean/course/CatalogLockedBean;->locked:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->children:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/study/bean/course/CatalogLockedBean;->children:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getChildren()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogLockedBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->children:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLocked()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->locked:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->locked:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->children:Ljava/util/List;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final isLeaf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->id:J

    iget-object v2, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->title:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->isLeaf:Z

    iget v4, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->locked:I

    iget-object v5, p0, Lcom/zykj/study/bean/course/CatalogLockedBean;->children:Ljava/util/List;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "CatalogLockedBean(id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isLeaf="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", locked="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", children="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

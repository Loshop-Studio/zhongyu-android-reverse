.class public final Lcom/zykj/study/bean/course/CatalogBean;
.super Lr0/a;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final childNode:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lr0/b;",
            ">;"
        }
    .end annotation
.end field

.field private final children:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;"
        }
    .end annotation
.end field

.field private final id:I

.field private final isChild:Z

.field private final isLeaf:Z

.field private final locked:I

.field private final parentId:I

.field private final progress:I

.field private final sort:I

.field private final status:Lcom/zykj/study/bean/course/StudyStatus;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZII)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;",
            "Ljava/util/List<",
            "Lr0/b;",
            ">;I",
            "Lcom/zykj/study/bean/course/StudyStatus;",
            "ZII)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lr0/a;-><init>()V

    .line 6
    iput p1, p0, Lcom/zykj/study/bean/course/CatalogBean;->id:I

    .line 7
    iput-object p2, p0, Lcom/zykj/study/bean/course/CatalogBean;->title:Ljava/lang/String;

    .line 8
    iput-boolean p3, p0, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf:Z

    .line 9
    iput p4, p0, Lcom/zykj/study/bean/course/CatalogBean;->progress:I

    .line 10
    iput-object p5, p0, Lcom/zykj/study/bean/course/CatalogBean;->children:Ljava/util/List;

    .line 11
    iput-object p6, p0, Lcom/zykj/study/bean/course/CatalogBean;->childNode:Ljava/util/List;

    .line 12
    iput p7, p0, Lcom/zykj/study/bean/course/CatalogBean;->sort:I

    .line 13
    iput-object p8, p0, Lcom/zykj/study/bean/course/CatalogBean;->status:Lcom/zykj/study/bean/course/StudyStatus;

    .line 14
    iput-boolean p9, p0, Lcom/zykj/study/bean/course/CatalogBean;->isChild:Z

    .line 15
    iput p10, p0, Lcom/zykj/study/bean/course/CatalogBean;->parentId:I

    .line 16
    iput p11, p0, Lcom/zykj/study/bean/course/CatalogBean;->locked:I

    const/4 p1, 0x0

    .line 17
    invoke-virtual {p0, p1}, Lr0/a;->setExpanded(Z)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILkotlin/jvm/internal/n;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 1
    const-string v1, ""

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move/from16 v5, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move v6, v2

    goto :goto_2

    :cond_2
    move/from16 v6, p4

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v8, v1

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_4

    .line 3
    sget-object v0, Lcom/zykj/study/bean/course/StudyStatus;->NOT_COMPLETE:Lcom/zykj/study/bean/course/StudyStatus;

    move-object v10, v0

    :goto_4
    move-object v2, p0

    move v3, p1

    move-object/from16 v7, p5

    move/from16 v9, p7

    move/from16 v11, p9

    move/from16 v12, p10

    move/from16 v13, p11

    goto :goto_5

    :cond_4
    move-object/from16 v10, p8

    goto :goto_4

    .line 4
    :goto_5
    invoke-direct/range {v2 .. v13}, Lcom/zykj/study/bean/course/CatalogBean;-><init>(ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/course/CatalogBean;->id:I

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/course/CatalogBean;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-boolean p3, p0, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf:Z

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p4, p0, Lcom/zykj/study/bean/course/CatalogBean;->progress:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lcom/zykj/study/bean/course/CatalogBean;->children:Ljava/util/List;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/zykj/study/bean/course/CatalogBean;->childNode:Ljava/util/List;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p7, p0, Lcom/zykj/study/bean/course/CatalogBean;->sort:I

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-object p8, p0, Lcom/zykj/study/bean/course/CatalogBean;->status:Lcom/zykj/study/bean/course/StudyStatus;

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-boolean p9, p0, Lcom/zykj/study/bean/course/CatalogBean;->isChild:Z

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget p10, p0, Lcom/zykj/study/bean/course/CatalogBean;->parentId:I

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget p11, p0, Lcom/zykj/study/bean/course/CatalogBean;->locked:I

    :cond_a
    move p12, p10

    move p13, p11

    move-object p10, p8

    move p11, p9

    move-object p8, p6

    move p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/zykj/study/bean/course/CatalogBean;->copy(ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZII)Lcom/zykj/study/bean/course/CatalogBean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->id:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->parentId:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->locked:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf:Z

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->progress:I

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->children:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lr0/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->childNode:Ljava/util/List;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->sort:I

    return v0
.end method

.method public final component8()Lcom/zykj/study/bean/course/StudyStatus;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->status:Lcom/zykj/study/bean/course/StudyStatus;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->isChild:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZII)Lcom/zykj/study/bean/course/CatalogBean;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "ZI",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;",
            "Ljava/util/List<",
            "Lr0/b;",
            ">;I",
            "Lcom/zykj/study/bean/course/StudyStatus;",
            "ZII)",
            "Lcom/zykj/study/bean/course/CatalogBean;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/course/CatalogBean;

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/zykj/study/bean/course/CatalogBean;-><init>(ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZII)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/course/CatalogBean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/course/CatalogBean;

    iget v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->id:I

    iget v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->progress:I

    iget v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->progress:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->children:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->children:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->childNode:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->childNode:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->sort:I

    iget v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->sort:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->status:Lcom/zykj/study/bean/course/StudyStatus;

    iget-object v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->status:Lcom/zykj/study/bean/course/StudyStatus;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->isChild:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->isChild:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->parentId:I

    iget v3, p1, Lcom/zykj/study/bean/course/CatalogBean;->parentId:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->locked:I

    iget p1, p1, Lcom/zykj/study/bean/course/CatalogBean;->locked:I

    if-eq v1, p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public getChildNode()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lr0/b;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->childNode:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getChildren()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->children:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getLocked()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->locked:I

    .line 2
    .line 3
    return v0
.end method

.method public final getParentId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->parentId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getProgress()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->progress:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSort()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->sort:I

    .line 2
    .line 3
    return v0
.end method

.method public final getStatus()Lcom/zykj/study/bean/course/StudyStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->status:Lcom/zykj/study/bean/course/StudyStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->progress:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->children:Ljava/util/List;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->childNode:Ljava/util/List;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->sort:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->status:Lcom/zykj/study/bean/course/StudyStatus;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->isChild:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->parentId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->locked:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isChild()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->isChild:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isLeaf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget v0, p0, Lcom/zykj/study/bean/course/CatalogBean;->id:I

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogBean;->title:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/zykj/study/bean/course/CatalogBean;->isLeaf:Z

    iget v3, p0, Lcom/zykj/study/bean/course/CatalogBean;->progress:I

    iget-object v4, p0, Lcom/zykj/study/bean/course/CatalogBean;->children:Ljava/util/List;

    iget-object v5, p0, Lcom/zykj/study/bean/course/CatalogBean;->childNode:Ljava/util/List;

    iget v6, p0, Lcom/zykj/study/bean/course/CatalogBean;->sort:I

    iget-object v7, p0, Lcom/zykj/study/bean/course/CatalogBean;->status:Lcom/zykj/study/bean/course/StudyStatus;

    iget-boolean v8, p0, Lcom/zykj/study/bean/course/CatalogBean;->isChild:Z

    iget v9, p0, Lcom/zykj/study/bean/course/CatalogBean;->parentId:I

    iget v10, p0, Lcom/zykj/study/bean/course/CatalogBean;->locked:I

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "CatalogBean(id="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isLeaf="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", progress="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", children="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", childNode="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sort="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isChild="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", parentId="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", locked="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

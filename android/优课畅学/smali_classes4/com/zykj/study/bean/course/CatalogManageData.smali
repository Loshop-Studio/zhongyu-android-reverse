.class public final Lcom/zykj/study/bean/course/CatalogManageData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final id:J

.field private final isExpanded:Z

.field private final isLeaf:Z

.field private final isLockable:Z

.field private final isRoot:Z

.field private final isUnlock:Z

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLjava/lang/String;ZZZZZ)V
    .locals 1

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->id:J

    .line 3
    iput-object p3, p0, Lcom/zykj/study/bean/course/CatalogManageData;->name:Ljava/lang/String;

    .line 4
    iput-boolean p4, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLeaf:Z

    .line 5
    iput-boolean p5, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock:Z

    .line 6
    iput-boolean p6, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLockable:Z

    .line 7
    iput-boolean p7, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded:Z

    .line 8
    iput-boolean p8, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isRoot:Z

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/String;ZZZZZILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p10, p9, 0x10

    const/4 v0, 0x1

    if-eqz p10, :cond_0

    move p6, v0

    :cond_0
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_1

    const/4 p7, 0x0

    :cond_1
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_2

    move p9, v0

    :goto_0
    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move-object p4, p3

    move-wide p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move p9, p8

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/zykj/study/bean/course/CatalogManageData;-><init>(JLjava/lang/String;ZZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/course/CatalogManageData;JLjava/lang/String;ZZZZZILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogManageData;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->id:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/zykj/study/bean/course/CatalogManageData;->name:Ljava/lang/String;

    :cond_1
    move-object v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-boolean p4, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLeaf:Z

    :cond_2
    move v4, p4

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget-boolean p5, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock:Z

    :cond_3
    move v5, p5

    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    iget-boolean p6, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLockable:Z

    :cond_4
    move v6, p6

    and-int/lit8 p1, p9, 0x20

    if-eqz p1, :cond_5

    iget-boolean p1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded:Z

    move v7, p1

    goto :goto_0

    :cond_5
    move/from16 v7, p7

    :goto_0
    and-int/lit8 p1, p9, 0x40

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isRoot:Z

    move v8, p1

    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_6
    move/from16 v8, p8

    goto :goto_1

    :goto_2
    invoke-virtual/range {v0 .. v8}, Lcom/zykj/study/bean/course/CatalogManageData;->copy(JLjava/lang/String;ZZZZZ)Lcom/zykj/study/bean/course/CatalogManageData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->id:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLeaf:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLockable:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isRoot:Z

    return v0
.end method

.method public final copy(JLjava/lang/String;ZZZZZ)Lcom/zykj/study/bean/course/CatalogManageData;
    .locals 10

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/course/CatalogManageData;

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/zykj/study/bean/course/CatalogManageData;-><init>(JLjava/lang/String;ZZZZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/course/CatalogManageData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/course/CatalogManageData;

    iget-wide v3, p0, Lcom/zykj/study/bean/course/CatalogManageData;->id:J

    iget-wide v5, p1, Lcom/zykj/study/bean/course/CatalogManageData;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/course/CatalogManageData;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLeaf:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/course/CatalogManageData;->isLeaf:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLockable:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/course/CatalogManageData;->isLockable:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded:Z

    iget-boolean v3, p1, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isRoot:Z

    iget-boolean p1, p1, Lcom/zykj/study/bean/course/CatalogManageData;->isRoot:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLeaf:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLockable:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isRoot:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isExpanded()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isLeaf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLeaf:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isLockable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLockable:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isRoot()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isRoot:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isUnlock()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Lcom/zykj/study/bean/course/CatalogManageData;->id:J

    iget-object v2, p0, Lcom/zykj/study/bean/course/CatalogManageData;->name:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLeaf:Z

    iget-boolean v4, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isUnlock:Z

    iget-boolean v5, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isLockable:Z

    iget-boolean v6, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isExpanded:Z

    iget-boolean v7, p0, Lcom/zykj/study/bean/course/CatalogManageData;->isRoot:Z

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "CatalogManageData(id="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isLeaf="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isUnlock="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLockable="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isExpanded="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isRoot="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

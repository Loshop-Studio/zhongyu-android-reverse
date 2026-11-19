.class public final Lcom/zykj/blackboard/bean/MoveActionConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private horizontalTranslate:Z

.field private isMoveActionEnable:Z

.field private maxHeightTimes:I

.field private maxWidthTimes:I

.field private rotate:Z

.field private scale:Z

.field private verticalTranslate:Z


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/zykj/blackboard/bean/MoveActionConfig;-><init>(ZZZZZIIILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(ZZZZZII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    .line 4
    iput-boolean p2, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    .line 5
    iput-boolean p3, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    .line 6
    iput-boolean p4, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    .line 7
    iput-boolean p5, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    .line 8
    iput p6, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    .line 9
    iput p7, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    return-void
.end method

.method public synthetic constructor <init>(ZZZZZIIILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    const/4 v0, 0x1

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move p8, v0

    :goto_0
    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/zykj/blackboard/bean/MoveActionConfig;-><init>(ZZZZZII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/blackboard/bean/MoveActionConfig;ZZZZZIIILjava/lang/Object;)Lcom/zykj/blackboard/bean/MoveActionConfig;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-boolean p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-boolean p2, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-boolean p4, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-boolean p5, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/zykj/blackboard/bean/MoveActionConfig;->copy(ZZZZZII)Lcom/zykj/blackboard/bean/MoveActionConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    return v0
.end method

.method public final copy(ZZZZZII)Lcom/zykj/blackboard/bean/MoveActionConfig;
    .locals 8

    new-instance v0, Lcom/zykj/blackboard/bean/MoveActionConfig;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/zykj/blackboard/bean/MoveActionConfig;-><init>(ZZZZZII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/blackboard/bean/MoveActionConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/blackboard/bean/MoveActionConfig;

    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    iget-boolean v3, p1, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    iget-boolean v3, p1, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    iget-boolean v3, p1, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    iget-boolean v3, p1, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    iget-boolean v3, p1, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    iget v3, p1, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    iget p1, p1, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getHorizontalTranslate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getMaxHeightTimes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMaxWidthTimes()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRotate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getScale()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getVerticalTranslate()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    if-eqz v2, :cond_2

    move v2, v1

    :cond_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    if-eqz v2, :cond_3

    move v2, v1

    :cond_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isMoveActionEnable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    .line 2
    .line 3
    return v0
.end method

.method public final set(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)V
    .locals 1

    .line 1
    const-string v0, "moveConfigEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->isEnable()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getVerticalTranslate()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getHorizontalTranslate()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iput-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getScale()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iput-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getRotate()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput-boolean v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getMaxWidthTimes()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getMaxHeightTimes()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    .line 47
    .line 48
    return-void
.end method

.method public final setHorizontalTranslate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxHeightTimes(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxWidthTimes(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    .line 2
    .line 3
    return-void
.end method

.method public final setMoveActionEnable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setRotate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setScale(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setVerticalTranslate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MoveActionConfig(isMoveActionEnable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->isMoveActionEnable:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", verticalTranslate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->verticalTranslate:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", horizontalTranslate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->horizontalTranslate:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", scale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->scale:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", rotate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->rotate:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxWidthTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxWidthTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxHeightTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/bean/MoveActionConfig;->maxHeightTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

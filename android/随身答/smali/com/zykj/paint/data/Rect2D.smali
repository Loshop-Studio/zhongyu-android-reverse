.class public Lcom/zykj/paint/data/Rect2D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private height:D

.field public maxX:D

.field public maxY:D

.field public minX:D

.field public minY:D

.field private width:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(DDDD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 4
    iput-wide p3, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 5
    iput-wide p5, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 6
    iput-wide p7, p0, Lcom/zykj/paint/data/Rect2D;->maxY:D

    sub-double/2addr p5, p1

    .line 7
    iput-wide p5, p0, Lcom/zykj/paint/data/Rect2D;->width:D

    sub-double/2addr p7, p3

    .line 8
    iput-wide p7, p0, Lcom/zykj/paint/data/Rect2D;->height:D

    return-void
.end method

.method public static nestPoint(Lcom/zykj/paint/data/Rect2D;Lcom/zykj/paint/data/Vector2D;)Lcom/zykj/paint/data/Rect2D;
    .locals 14

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/zykj/paint/data/Rect2D;

    .line 4
    .line 5
    iget-wide v1, p1, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 6
    .line 7
    iget-wide v3, p1, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 8
    .line 9
    move-wide v5, v1

    .line 10
    move-wide v7, v3

    .line 11
    invoke-direct/range {v0 .. v8}, Lcom/zykj/paint/data/Rect2D;-><init>(DDDD)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance v1, Lcom/zykj/paint/data/Rect2D;

    .line 16
    .line 17
    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 18
    .line 19
    iget-wide v4, p1, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 20
    .line 21
    cmpg-double v0, v2, v4

    .line 22
    .line 23
    if-gez v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-wide v2, v4

    .line 27
    :goto_0
    iget-wide v6, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 28
    .line 29
    iget-wide v8, p1, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 30
    .line 31
    cmpg-double p1, v6, v8

    .line 32
    .line 33
    if-gez p1, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    move-wide v6, v8

    .line 37
    :goto_1
    iget-wide v10, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 38
    .line 39
    cmpl-double p1, v10, v4

    .line 40
    .line 41
    if-lez p1, :cond_3

    .line 42
    .line 43
    move-wide v4, v10

    .line 44
    :cond_3
    iget-wide p0, p0, Lcom/zykj/paint/data/Rect2D;->maxY:D

    .line 45
    .line 46
    cmpl-double v0, p0, v8

    .line 47
    .line 48
    if-lez v0, :cond_4

    .line 49
    .line 50
    move-wide v8, v6

    .line 51
    move-wide v6, v4

    .line 52
    move-wide v4, v8

    .line 53
    move-wide v8, p0

    .line 54
    goto :goto_2

    .line 55
    :cond_4
    move-wide v12, v6

    .line 56
    move-wide v6, v4

    .line 57
    move-wide v4, v12

    .line 58
    :goto_2
    invoke-direct/range {v1 .. v9}, Lcom/zykj/paint/data/Rect2D;-><init>(DDDD)V

    .line 59
    .line 60
    .line 61
    return-object v1
.end method

.method public static nestRect(Lcom/zykj/paint/data/Rect2D;Lcom/zykj/paint/data/Rect2D;)Lcom/zykj/paint/data/Rect2D;
    .locals 10

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_1
    new-instance v0, Lcom/zykj/paint/data/Rect2D;

    .line 8
    .line 9
    iget-wide v1, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 10
    .line 11
    iget-wide v3, p1, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 12
    .line 13
    cmpg-double v5, v1, v3

    .line 14
    .line 15
    if-gez v5, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    move-wide v1, v3

    .line 19
    :goto_0
    iget-wide v3, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 20
    .line 21
    iget-wide v5, p1, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 22
    .line 23
    cmpg-double v7, v3, v5

    .line 24
    .line 25
    if-gez v7, :cond_3

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    move-wide v3, v5

    .line 29
    :goto_1
    iget-wide v5, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 30
    .line 31
    iget-wide v7, p1, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 32
    .line 33
    cmpl-double v9, v5, v7

    .line 34
    .line 35
    if-lez v9, :cond_4

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_4
    move-wide v5, v7

    .line 39
    :goto_2
    iget-wide v7, p0, Lcom/zykj/paint/data/Rect2D;->maxY:D

    .line 40
    .line 41
    iget-wide p0, p1, Lcom/zykj/paint/data/Rect2D;->maxY:D

    .line 42
    .line 43
    cmpl-double v9, v7, p0

    .line 44
    .line 45
    if-lez v9, :cond_5

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_5
    move-wide v7, p0

    .line 49
    :goto_3
    invoke-direct/range {v0 .. v8}, Lcom/zykj/paint/data/Rect2D;-><init>(DDDD)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public static scaleRect(Lcom/zykj/paint/data/Rect2D;D)Lcom/zykj/paint/data/Rect2D;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/data/Rect2D;->getWidth()D

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 8
    .line 9
    mul-double/2addr v1, v3

    .line 10
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 11
    .line 12
    sub-double v5, p1, v5

    .line 13
    .line 14
    mul-double/2addr v1, v5

    .line 15
    invoke-virtual {v0}, Lcom/zykj/paint/data/Rect2D;->getHeight()D

    .line 16
    .line 17
    .line 18
    move-result-wide v5

    .line 19
    mul-double/2addr v5, v3

    .line 20
    mul-double v5, v5, p1

    .line 21
    .line 22
    new-instance v7, Lcom/zykj/paint/data/Rect2D;

    .line 23
    .line 24
    iget-wide v3, v0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 25
    .line 26
    sub-double v8, v3, v1

    .line 27
    .line 28
    iget-wide v3, v0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 29
    .line 30
    sub-double v10, v3, v5

    .line 31
    .line 32
    iget-wide v3, v0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 33
    .line 34
    add-double v12, v3, v1

    .line 35
    .line 36
    iget-wide v0, v0, Lcom/zykj/paint/data/Rect2D;->maxY:D

    .line 37
    .line 38
    add-double v14, v0, v5

    .line 39
    .line 40
    invoke-direct/range {v7 .. v15}, Lcom/zykj/paint/data/Rect2D;-><init>(DDDD)V

    .line 41
    .line 42
    .line 43
    return-object v7
.end method


# virtual methods
.method public ToRectF()Landroid/graphics/RectF;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 4
    .line 5
    double-to-float v1, v1

    .line 6
    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 7
    .line 8
    double-to-float v2, v2

    .line 9
    invoke-virtual {p0}, Lcom/zykj/paint/data/Rect2D;->getWidth()D

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    double-to-float v3, v3

    .line 14
    invoke-virtual {p0}, Lcom/zykj/paint/data/Rect2D;->getHeight()D

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    double-to-float v4, v4

    .line 19
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public getHeight()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->height:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public getMiddle()Lcom/zykj/paint/data/Vector2D;
    .locals 5

    .line 1
    new-instance v0, Lcom/zykj/paint/data/Vector2D;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/paint/data/Vector2D;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 7
    .line 8
    iget-wide v3, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 9
    .line 10
    add-double/2addr v1, v3

    .line 11
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 12
    .line 13
    mul-double/2addr v1, v3

    .line 14
    iput-wide v1, v0, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 15
    .line 16
    iget-wide v1, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 17
    .line 18
    add-double/2addr v1, v1

    .line 19
    mul-double/2addr v1, v3

    .line 20
    iput-wide v1, v0, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 21
    .line 22
    return-object v0
.end method

.method public getWidth()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->width:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public isInBox(Lcom/zykj/paint/data/Vector2D;)Z
    .locals 4

    .line 1
    iget-wide v0, p1, Lcom/zykj/paint/data/Vector2D;->x:D

    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    cmpg-double v2, v0, v2

    if-ltz v2, :cond_1

    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_1

    iget-wide v0, p1, Lcom/zykj/paint/data/Vector2D;->y:D

    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    cmpg-double p1, v0, v2

    if-ltz p1, :cond_1

    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->maxY:D

    cmpl-double p1, v0, v2

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public isInBox(Lcom/zykj/paint/data/Vector2D;D)Z
    .locals 4

    .line 2
    iget-wide v0, p1, Lcom/zykj/paint/data/Vector2D;->x:D

    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    sub-double/2addr v2, p2

    cmpg-double v2, v0, v2

    if-ltz v2, :cond_1

    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    sub-double/2addr v2, p2

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_1

    iget-wide v0, p1, Lcom/zykj/paint/data/Vector2D;->y:D

    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    add-double/2addr v2, p2

    cmpg-double p1, v0, v2

    if-ltz p1, :cond_1

    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->maxY:D

    add-double/2addr v2, p2

    cmpl-double p1, v0, v2

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public isRectCross(Lcom/zykj/paint/data/Rect2D;)Z
    .locals 4

    .line 1
    iget-wide v0, p1, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 4
    .line 5
    cmpg-double v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    iget-wide v0, p1, Lcom/zykj/paint/data/Rect2D;->maxY:D

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 12
    .line 13
    cmpg-double v0, v0, v2

    .line 14
    .line 15
    if-ltz v0, :cond_1

    .line 16
    .line 17
    iget-wide v0, p1, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 20
    .line 21
    cmpl-double v0, v0, v2

    .line 22
    .line 23
    if-gtz v0, :cond_1

    .line 24
    .line 25
    iget-wide v0, p1, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 26
    .line 27
    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->maxY:D

    .line 28
    .line 29
    cmpl-double p1, v0, v2

    .line 30
    .line 31
    if-lez p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public move(Lcom/zykj/paint/data/Vector2D;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 2
    .line 3
    iget-wide v2, p1, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 4
    .line 5
    add-double/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 7
    .line 8
    iget-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 9
    .line 10
    add-double/2addr v0, v2

    .line 11
    iput-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 12
    .line 13
    iget-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 14
    .line 15
    iget-wide v2, p1, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 16
    .line 17
    add-double/2addr v0, v2

    .line 18
    iput-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 19
    .line 20
    iget-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->maxY:D

    .line 21
    .line 22
    add-double/2addr v0, v2

    .line 23
    iput-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->maxY:D

    .line 24
    .line 25
    return-void
.end method

.method public setMiddle(Lcom/zykj/paint/data/Vector2D;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->maxX:D

    .line 4
    .line 5
    add-double/2addr v0, v2

    .line 6
    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    .line 7
    .line 8
    mul-double/2addr v0, v2

    .line 9
    iput-wide v0, p1, Lcom/zykj/paint/data/Vector2D;->x:D

    .line 10
    .line 11
    iget-wide v0, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 12
    .line 13
    add-double/2addr v0, v0

    .line 14
    mul-double/2addr v0, v2

    .line 15
    iput-wide v0, p1, Lcom/zykj/paint/data/Vector2D;->y:D

    .line 16
    .line 17
    return-void
.end method

.method public toRect()Landroid/graphics/Rect;
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/zykj/paint/data/Rect2D;->minX:D

    .line 4
    .line 5
    double-to-int v1, v1

    .line 6
    iget-wide v2, p0, Lcom/zykj/paint/data/Rect2D;->minY:D

    .line 7
    .line 8
    double-to-int v2, v2

    .line 9
    invoke-virtual {p0}, Lcom/zykj/paint/data/Rect2D;->getWidth()D

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    double-to-int v3, v3

    .line 14
    invoke-virtual {p0}, Lcom/zykj/paint/data/Rect2D;->getHeight()D

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    double-to-int v4, v4

    .line 19
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.class public Lcom/zykj/paint/record/model/GraphSnapShot;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "GraphSnapShot"


# instance fields
.field public bitmap:Landroid/graphics/Bitmap;

.field public center:[F

.field public graphId:I

.field public isSelect:Z

.field public mCanvas:Landroid/graphics/Canvas;

.field public markerCenter:[F

.field public matrix:Landroid/graphics/Matrix;

.field public midMatrix:Landroid/graphics/Matrix;

.field public origin:[F

.field public paint:Landroid/graphics/Paint;

.field public sketchBitmap:Landroid/graphics/Bitmap;

.field public sketchMatrix:Landroid/graphics/Matrix;

.field public sketchView:Lcom/zykj/paint/SketchSyncView;

.field public snapShotPaint:Landroid/graphics/Paint;

.field private temp:D


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->isSelect:Z

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Matrix;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    new-array v1, v0, [F

    .line 16
    .line 17
    iput-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->center:[F

    .line 18
    .line 19
    new-array v0, v0, [F

    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->markerCenter:[F

    .line 22
    .line 23
    new-instance v0, Landroid/graphics/Matrix;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->midMatrix:Landroid/graphics/Matrix;

    .line 29
    .line 30
    new-instance v0, Landroid/graphics/Matrix;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 36
    .line 37
    const-string v0, "GraphSnapShot"

    .line 38
    .line 39
    invoke-static {v0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    new-instance v0, Landroid/graphics/Paint;

    .line 43
    .line 44
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 59
    .line 60
    const-string v2, "#3399FF"

    .line 61
    .line 62
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 70
    .line 71
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 72
    .line 73
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 77
    .line 78
    sget-object v3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 84
    .line 85
    sget-object v4, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 91
    .line 92
    const/high16 v5, 0x40400000    # 3.0f

    .line 93
    .line 94
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 95
    .line 96
    .line 97
    new-instance v0, Landroid/graphics/Paint;

    .line 98
    .line 99
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 113
    .line 114
    const-string v1, "#27C69A"

    .line 115
    .line 116
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 124
    .line 125
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 129
    .line 130
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 134
    .line 135
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->snapShotPaint:Landroid/graphics/Paint;

    .line 139
    .line 140
    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 141
    .line 142
    .line 143
    return-void
.end method


# virtual methods
.method public calculateDegree(FFFF)D
    .locals 6

    .line 1
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->origin:[F

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/zykj/paint/record/model/GraphSnapShot;->calculateDegree([FFFFF)D

    move-result-wide p1

    return-wide p1
.end method

.method public calculateDegree([FFFFF)D
    .locals 0

    .line 2
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/paint/record/model/GraphSnapShot;->roughCalculate([FFFFF)[D

    move-result-object p1

    const/4 p2, 0x1

    .line 3
    aget-wide p2, p1, p2

    const-wide/16 p4, 0x0

    cmpl-double p2, p2, p4

    const/4 p3, 0x0

    if-lez p2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    aget-wide p4, p1, p3

    neg-double p4, p4

    aput-wide p4, p1, p3

    .line 5
    :goto_0
    aget-wide p2, p1, p3

    return-wide p2
.end method

.method public delByLines(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public exactCalculateDegree(FFFF)D
    .locals 6

    .line 9
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->center:[F

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/zykj/paint/record/model/GraphSnapShot;->exactCalculateDegree([FFFFF)D

    move-result-wide p1

    return-wide p1
.end method

.method public exactCalculateDegree([FFFFF)D
    .locals 7

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/paint/record/model/GraphSnapShot;->roughCalculate([FFFFF)[D

    move-result-object p1

    move-object p2, p0

    const/4 p3, 0x1

    .line 2
    aget-wide p3, p1, p3

    const-wide/16 v0, 0x0

    cmpg-double p3, p3, v0

    const-wide p4, 0x4076800000000000L    # 360.0

    const-wide v0, 0x4056800000000000L    # 90.0

    const/4 v2, 0x0

    if-gez p3, :cond_2

    .line 3
    aget-wide v3, p1, v2

    cmpl-double p3, v3, v0

    if-lez p3, :cond_0

    iget-wide v0, p2, Lcom/zykj/paint/record/model/GraphSnapShot;->temp:D

    const-wide v5, -0x3fa9800000000000L    # -90.0

    cmpg-double p3, v0, v5

    if-ltz p3, :cond_1

    :cond_0
    iget-wide v0, p2, Lcom/zykj/paint/record/model/GraphSnapShot;->temp:D

    const-wide v5, -0x3f99800000000000L    # -180.0

    cmpg-double p3, v0, v5

    if-gez p3, :cond_6

    :cond_1
    sub-double/2addr v3, p4

    .line 4
    aput-wide v3, p1, v2

    goto :goto_0

    .line 5
    :cond_2
    aget-wide v3, p1, v2

    cmpl-double p3, v3, v0

    if-lez p3, :cond_3

    iget-wide v5, p2, Lcom/zykj/paint/record/model/GraphSnapShot;->temp:D

    cmpl-double p3, v5, v0

    if-gtz p3, :cond_4

    :cond_3
    iget-wide v0, p2, Lcom/zykj/paint/record/model/GraphSnapShot;->temp:D

    const-wide v5, 0x4066800000000000L    # 180.0

    cmpl-double p3, v0, v5

    if-lez p3, :cond_5

    :cond_4
    sub-double/2addr p4, v3

    .line 6
    aput-wide p4, p1, v2

    goto :goto_0

    :cond_5
    neg-double p3, v3

    .line 7
    aput-wide p3, p1, v2

    .line 8
    :cond_6
    :goto_0
    aget-wide p3, p1, v2

    iput-wide p3, p2, Lcom/zykj/paint/record/model/GraphSnapShot;->temp:D

    return-wide p3
.end method

.method public getActionMode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 2
    .line 3
    iget v0, v0, Lcom/zykj/paint/SketchSyncView;->actionMode:I

    .line 4
    .line 5
    return v0
.end method

.method public getPointsLength(FFFF)D
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 4
    .line 5
    .line 6
    sub-float/2addr p1, p3

    .line 7
    sub-float/2addr p2, p4

    .line 8
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/paint/record/model/GraphSnapShot;->getVectorLength(Landroid/graphics/PointF;)D

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    return-wide p1
.end method

.method public getVectorLength(Landroid/graphics/PointF;)D
    .locals 2

    .line 1
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 2
    .line 3
    mul-float/2addr v0, v0

    .line 4
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 5
    .line 6
    mul-float/2addr p1, p1

    .line 7
    add-float/2addr v0, p1

    .line 8
    float-to-double v0, v0

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public invertPoints(FF)[F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0, p1, p2}, Lcom/zykj/paint/record/model/GraphSnapShot;->invertPoints(Landroid/graphics/Matrix;FF)[F

    move-result-object p1

    return-object p1
.end method

.method public invertPoints(Landroid/graphics/Matrix;FF)[F
    .locals 3

    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [F

    .line 3
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 5
    new-array p1, v0, [F

    const/4 v0, 0x0

    aput p2, p1, v0

    const/4 p2, 0x1

    aput p3, p1, p2

    invoke-virtual {v2, v1, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    return-object v1
.end method

.method public isInGraphRect(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0, p1, p2}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(Landroid/graphics/Bitmap;FF)Z

    move-result p1

    return p1
.end method

.method public isInGraphRect(Landroid/graphics/Bitmap;FF)Z
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;FF)Z

    move-result p1

    return p1
.end method

.method public isInGraphRect(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;FF)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 3
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 6
    invoke-virtual {p0, v1, p3, p4}, Lcom/zykj/paint/record/model/GraphSnapShot;->invertPoints(Landroid/graphics/Matrix;FF)[F

    move-result-object p2

    .line 7
    new-instance p3, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p4

    int-to-float p4, p4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    const/4 v1, 0x0

    invoke-direct {p3, v1, v1, p4, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 8
    aget p1, p2, v0

    const/4 p4, 0x1

    aget p2, p2, p4

    invoke-virtual {p3, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method public isSelect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->isSelect:Z

    .line 2
    .line 3
    return v0
.end method

.method public mapPointF(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    new-array v2, v1, [F

    .line 8
    .line 9
    iget v3, p1, Landroid/graphics/PointF;->x:F

    .line 10
    .line 11
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 12
    .line 13
    new-array v1, v1, [F

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    aput v3, v1, v4

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    aput p1, v1, v3

    .line 20
    .line 21
    invoke-virtual {p2, v2, v1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 22
    .line 23
    .line 24
    aget p1, v2, v4

    .line 25
    .line 26
    aget p2, v2, v3

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public mapPoints(FF)[F
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [F

    .line 3
    .line 4
    new-instance v2, Landroid/graphics/Matrix;

    .line 5
    .line 6
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v3, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 12
    .line 13
    .line 14
    new-array v0, v0, [F

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput p1, v0, v3

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    aput p2, v0, p1

    .line 21
    .line 22
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 23
    .line 24
    .line 25
    return-object v1
.end method

.method public release()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public reset()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->temp:D

    .line 4
    .line 5
    return-void
.end method

.method public roughCalculate([FFFFF)[D
    .locals 8

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/graphics/PointF;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aget v3, p1, v2

    .line 13
    .line 14
    sub-float/2addr p2, v3

    .line 15
    const/4 v3, 0x1

    .line 16
    aget v4, p1, v3

    .line 17
    .line 18
    sub-float/2addr p3, v4

    .line 19
    invoke-virtual {v0, p2, p3}, Landroid/graphics/PointF;->set(FF)V

    .line 20
    .line 21
    .line 22
    aget p2, p1, v2

    .line 23
    .line 24
    sub-float/2addr p4, p2

    .line 25
    aget p1, p1, v3

    .line 26
    .line 27
    sub-float/2addr p5, p1

    .line 28
    invoke-virtual {v1, p4, p5}, Landroid/graphics/PointF;->set(FF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/zykj/paint/record/model/GraphSnapShot;->getVectorLength(Landroid/graphics/PointF;)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    invoke-virtual {p0, v1}, Lcom/zykj/paint/record/model/GraphSnapShot;->getVectorLength(Landroid/graphics/PointF;)D

    .line 36
    .line 37
    .line 38
    move-result-wide p3

    .line 39
    iget p5, v0, Landroid/graphics/PointF;->x:F

    .line 40
    .line 41
    iget v4, v1, Landroid/graphics/PointF;->x:F

    .line 42
    .line 43
    mul-float/2addr p5, v4

    .line 44
    iget v4, v0, Landroid/graphics/PointF;->y:F

    .line 45
    .line 46
    iget v5, v1, Landroid/graphics/PointF;->y:F

    .line 47
    .line 48
    mul-float/2addr v4, v5

    .line 49
    add-float/2addr p5, v4

    .line 50
    float-to-double v4, p5

    .line 51
    mul-double v6, p1, p3

    .line 52
    .line 53
    div-double/2addr v4, v6

    .line 54
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 55
    .line 56
    cmpl-double p5, v4, v6

    .line 57
    .line 58
    if-lez p5, :cond_0

    .line 59
    .line 60
    move-wide v4, v6

    .line 61
    :cond_0
    invoke-static {v4, v5}, Ljava/lang/Math;->acos(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide v4

    .line 65
    const-wide v6, 0x4066800000000000L    # 180.0

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    mul-double/2addr v4, v6

    .line 71
    const-wide v6, 0x400921fb54442d18L    # Math.PI

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    div-double/2addr v4, v6

    .line 77
    iget p5, v0, Landroid/graphics/PointF;->x:F

    .line 78
    .line 79
    float-to-double v6, p5

    .line 80
    div-double/2addr v6, p1

    .line 81
    double-to-float p5, v6

    .line 82
    iput p5, v0, Landroid/graphics/PointF;->x:F

    .line 83
    .line 84
    iget p5, v0, Landroid/graphics/PointF;->y:F

    .line 85
    .line 86
    float-to-double v6, p5

    .line 87
    div-double/2addr v6, p1

    .line 88
    double-to-float p1, v6

    .line 89
    iput p1, v0, Landroid/graphics/PointF;->y:F

    .line 90
    .line 91
    iget p1, v1, Landroid/graphics/PointF;->x:F

    .line 92
    .line 93
    float-to-double p1, p1

    .line 94
    div-double/2addr p1, p3

    .line 95
    double-to-float p1, p1

    .line 96
    iput p1, v1, Landroid/graphics/PointF;->x:F

    .line 97
    .line 98
    iget p1, v1, Landroid/graphics/PointF;->y:F

    .line 99
    .line 100
    float-to-double p1, p1

    .line 101
    div-double/2addr p1, p3

    .line 102
    double-to-float p1, p1

    .line 103
    iput p1, v1, Landroid/graphics/PointF;->y:F

    .line 104
    .line 105
    new-instance p1, Landroid/graphics/PointF;

    .line 106
    .line 107
    iget p2, v1, Landroid/graphics/PointF;->y:F

    .line 108
    .line 109
    iget p3, v1, Landroid/graphics/PointF;->x:F

    .line 110
    .line 111
    neg-float p3, p3

    .line 112
    invoke-direct {p1, p2, p3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 113
    .line 114
    .line 115
    iget p2, v0, Landroid/graphics/PointF;->x:F

    .line 116
    .line 117
    iget p3, p1, Landroid/graphics/PointF;->x:F

    .line 118
    .line 119
    mul-float/2addr p2, p3

    .line 120
    iget p3, v0, Landroid/graphics/PointF;->y:F

    .line 121
    .line 122
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 123
    .line 124
    mul-float/2addr p3, p1

    .line 125
    add-float/2addr p2, p3

    .line 126
    float-to-double p1, p2

    .line 127
    const/4 p3, 0x2

    .line 128
    new-array p3, p3, [D

    .line 129
    .line 130
    aput-wide v4, p3, v2

    .line 131
    .line 132
    aput-wide p1, p3, v3

    .line 133
    .line 134
    return-object p3
.end method

.method public setGraphMiddle(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int v0, p1, v0

    .line 8
    .line 9
    div-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    iget-object v1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    sub-int v1, p2, v1

    .line 19
    .line 20
    div-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    int-to-float v1, v1

    .line 23
    iget-object v2, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 24
    .line 25
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 29
    .line 30
    div-int/lit8 p1, p1, 0x2

    .line 31
    .line 32
    int-to-float p1, p1

    .line 33
    div-int/lit8 p2, p2, 0x2

    .line 34
    .line 35
    int-to-float p2, p2

    .line 36
    const/high16 v1, 0x3f800000    # 1.0f

    .line 37
    .line 38
    invoke-virtual {v0, v1, v1, p1, p2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public setSelect(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/paint/record/model/GraphSnapShot;->isSelect:Z

    .line 2
    .line 3
    return-void
.end method

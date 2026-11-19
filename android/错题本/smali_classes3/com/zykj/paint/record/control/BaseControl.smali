.class public Lcom/zykj/paint/record/control/BaseControl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public actionMode:I

.field protected anchorX:F

.field protected anchorY:F

.field protected blackPaint:Landroid/graphics/Paint;

.field protected downMatrix:Landroid/graphics/Matrix;

.field protected mDefaultSize:I

.field protected mStrokeColor:I

.field protected midPoint:Landroid/graphics/PointF;

.field protected moveMatrix:Landroid/graphics/Matrix;

.field protected oldDistance:F

.field protected oldRotation:F


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 6
    .line 7
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 8
    .line 9
    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput v1, p0, Lcom/zykj/paint/record/control/BaseControl;->oldDistance:F

    .line 12
    .line 13
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->oldRotation:F

    .line 14
    .line 15
    new-instance v0, Landroid/graphics/PointF;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 21
    .line 22
    new-instance v0, Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 28
    .line 29
    new-instance v0, Landroid/graphics/Matrix;

    .line 30
    .line 31
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 35
    .line 36
    const/high16 v0, -0x1000000

    .line 37
    .line 38
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->mStrokeColor:I

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iput v1, p0, Lcom/zykj/paint/record/control/BaseControl;->mDefaultSize:I

    .line 42
    .line 43
    new-instance v1, Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->blackPaint:Landroid/graphics/Paint;

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->blackPaint:Landroid/graphics/Paint;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->blackPaint:Landroid/graphics/Paint;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->blackPaint:Landroid/graphics/Paint;

    .line 65
    .line 66
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->blackPaint:Landroid/graphics/Paint;

    .line 72
    .line 73
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->blackPaint:Landroid/graphics/Paint;

    .line 79
    .line 80
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->blackPaint:Landroid/graphics/Paint;

    .line 86
    .line 87
    const/high16 v1, 0x40400000    # 3.0f

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 90
    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public getBitmapPoints(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)[F
    .locals 7

    const/16 v0, 0x8

    .line 2
    new-array v1, v0, [F

    .line 3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    .line 4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    .line 5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    new-array v0, v0, [F

    const/4 v5, 0x0

    const/4 v6, 0x0

    aput v6, v0, v5

    const/4 v5, 0x1

    aput v6, v0, v5

    const/4 v5, 0x2

    aput v2, v0, v5

    const/4 v2, 0x3

    aput v6, v0, v2

    const/4 v2, 0x4

    aput v6, v0, v2

    const/4 v2, 0x5

    aput v3, v0, v2

    const/4 v2, 0x6

    aput v4, v0, v2

    const/4 v2, 0x7

    aput p1, v0, v2

    .line 6
    invoke-virtual {p2, v1, v0}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    return-object v1
.end method

.method public getBitmapPoints(Lcom/zykj/paint/record/model/GraphSnapShot;)[F
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->bitmap:Landroid/graphics/Bitmap;

    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    invoke-virtual {p0, v0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getBitmapPoints(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)[F

    move-result-object p1

    return-object p1
.end method

.method public getDistance(Landroid/view/MotionEvent;)F
    .locals 7

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    sub-float/2addr v0, p1

    float-to-double v1, v1

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 3
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    float-to-double v5, v0

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    add-double/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method public getDistance(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)F
    .locals 5

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    sub-float/2addr v3, p1

    const/4 p1, 0x2

    .line 6
    new-array v4, p1, [F

    .line 7
    new-array p1, p1, [F

    aput v1, p1, v0

    aput v3, p1, v2

    invoke-virtual {p2, v4, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 8
    aget p1, v4, v0

    .line 9
    aget p2, v4, v2

    float-to-double v0, p1

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 10
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    float-to-double p1, p2

    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    add-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    return p1
.end method

.method public getRotation(Landroid/view/MotionEvent;)F
    .locals 5

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    float-to-double v3, v1

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    sub-float/2addr v0, p1

    float-to-double v0, v0

    .line 3
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float p1, v0

    return p1
.end method

.method public getRotation(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)F
    .locals 7

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    sub-float/2addr v1, v3

    float-to-double v3, v1

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    sub-float/2addr v1, p1

    float-to-double v5, v1

    const/4 p1, 0x2

    .line 7
    new-array v1, p1, [F

    double-to-float v3, v3

    double-to-float v4, v5

    .line 8
    new-array p1, p1, [F

    aput v3, p1, v0

    aput v4, p1, v2

    invoke-virtual {p2, v1, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 9
    aget p1, v1, v0

    float-to-double p1, p1

    .line 10
    aget v0, v1, v2

    float-to-double v0, v0

    .line 11
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    .line 12
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    double-to-float p1, p1

    return p1
.end method

.method public midPoint(Landroid/view/MotionEvent;)Landroid/graphics/PointF;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    add-float/2addr v4, v2

    .line 3
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v4, v1

    div-float/2addr p1, v1

    .line 4
    invoke-virtual {v0, v4, p1}, Landroid/graphics/PointF;->set(FF)V

    return-object v0
.end method

.method public midPoint(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)Landroid/graphics/PointF;
    .locals 7

    .line 5
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    add-float/2addr v4, v2

    .line 7
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    add-float/2addr p1, v2

    const/4 v2, 0x2

    .line 8
    new-array v5, v2, [F

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v4, v6

    div-float/2addr p1, v6

    .line 9
    new-array v2, v2, [F

    aput v4, v2, v1

    aput p1, v2, v3

    invoke-virtual {p2, v5, v2}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 10
    aget p1, v5, v1

    .line 11
    aget p2, v5, v3

    .line 12
    invoke-virtual {v0, p1, p2}, Landroid/graphics/PointF;->set(FF)V

    return-object v0
.end method

.method public tempDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

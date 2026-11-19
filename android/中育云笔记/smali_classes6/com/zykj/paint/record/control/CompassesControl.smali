.class public Lcom/zykj/paint/record/control/CompassesControl;
.super Lcom/zykj/paint/record/control/BaseControl;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/record/control/ISketchControl;


# static fields
.field public static final DRAG:I = 0x1

.field public static final NONE:I = 0x0

.field public static final ROTATE:I = 0x2

.field private static final TAG:Ljava/lang/String; = "CompassesControl"

.field public static final VARY:I = 0x3

.field public static final ZOOM:I = 0x4


# instance fields
.field private compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

.field private degree:D

.field private downDegree:D

.field protected mode:I


# direct methods
.method public constructor <init>(Lcom/zykj/paint/record/model/GraphSnapShot;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/BaseControl;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->mode:I

    .line 6
    .line 7
    check-cast p1, Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 10
    .line 11
    return-void
.end method

.method private circleCheck(Lcom/zykj/paint/record/model/GraphSnapShot;FF)Z
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getBitmapPoints(Lcom/zykj/paint/record/model/GraphSnapShot;)[F

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x2

    .line 6
    aget v0, p1, v0

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    aget p1, p1, v1

    .line 10
    .line 11
    sub-float/2addr p2, v0

    .line 12
    float-to-double v0, p2

    .line 13
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    sub-float/2addr p3, p1

    .line 20
    float-to-double p1, p3

    .line 21
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    add-double/2addr v0, p1

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    double-to-int p1, p1

    .line 31
    const/16 p2, 0x28

    .line 32
    .line 33
    if-ge p1, p2, :cond_0

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    return p1

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    return p1
.end method

.method private isTouchInGraph(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lcom/zykj/paint/record/control/CompassesControl;->pointCheck(Lcom/zykj/paint/record/model/GraphSnapShot;FF)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method private pointCheck(Lcom/zykj/paint/record/model/GraphSnapShot;FF)Z
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/paint/record/control/BaseControl;->getBitmapPoints(Lcom/zykj/paint/record/model/GraphSnapShot;)[F

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    aget v2, v0, v1

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    aget v4, v0, v3

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    aget v5, v0, v5

    .line 13
    .line 14
    const/4 v6, 0x3

    .line 15
    aget v6, v0, v6

    .line 16
    .line 17
    const/4 v7, 0x4

    .line 18
    aget v7, v0, v7

    .line 19
    .line 20
    const/4 v8, 0x5

    .line 21
    aget v8, v0, v8

    .line 22
    .line 23
    const/4 v9, 0x6

    .line 24
    aget v9, v0, v9

    .line 25
    .line 26
    const/4 v10, 0x7

    .line 27
    aget v0, v0, v10

    .line 28
    .line 29
    sub-float v10, v2, v5

    .line 30
    .line 31
    float-to-double v10, v10

    .line 32
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 33
    .line 34
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 35
    .line 36
    .line 37
    move-result-wide v10

    .line 38
    sub-float v14, v4, v6

    .line 39
    .line 40
    float-to-double v14, v14

    .line 41
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 42
    .line 43
    .line 44
    move-result-wide v14

    .line 45
    add-double/2addr v10, v14

    .line 46
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 47
    .line 48
    .line 49
    move-result-wide v10

    .line 50
    double-to-float v10, v10

    .line 51
    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    .line 52
    .line 53
    .line 54
    move-result-wide v14

    .line 55
    add-double/2addr v14, v12

    .line 56
    float-to-double v10, v10

    .line 57
    mul-double/2addr v14, v10

    .line 58
    sub-float v2, p2, v2

    .line 59
    .line 60
    float-to-double v10, v2

    .line 61
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 62
    .line 63
    .line 64
    move-result-wide v10

    .line 65
    sub-float v2, p3, v4

    .line 66
    .line 67
    move/from16 p1, v1

    .line 68
    .line 69
    float-to-double v1, v2

    .line 70
    invoke-static {v1, v2, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 71
    .line 72
    .line 73
    move-result-wide v1

    .line 74
    add-double/2addr v10, v1

    .line 75
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    sub-float v4, p2, v5

    .line 80
    .line 81
    float-to-double v4, v4

    .line 82
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    sub-float v6, p3, v6

    .line 87
    .line 88
    float-to-double v10, v6

    .line 89
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 90
    .line 91
    .line 92
    move-result-wide v10

    .line 93
    add-double/2addr v4, v10

    .line 94
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    add-double/2addr v1, v4

    .line 99
    sub-float v4, p2, v7

    .line 100
    .line 101
    float-to-double v4, v4

    .line 102
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 103
    .line 104
    .line 105
    move-result-wide v4

    .line 106
    sub-float v6, p3, v8

    .line 107
    .line 108
    float-to-double v6, v6

    .line 109
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 110
    .line 111
    .line 112
    move-result-wide v6

    .line 113
    add-double/2addr v4, v6

    .line 114
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    add-double/2addr v1, v4

    .line 119
    sub-float v4, p2, v9

    .line 120
    .line 121
    float-to-double v4, v4

    .line 122
    invoke-static {v4, v5, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 123
    .line 124
    .line 125
    move-result-wide v4

    .line 126
    sub-float v0, p3, v0

    .line 127
    .line 128
    float-to-double v6, v0

    .line 129
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 130
    .line 131
    .line 132
    move-result-wide v6

    .line 133
    add-double/2addr v4, v6

    .line 134
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 135
    .line 136
    .line 137
    move-result-wide v4

    .line 138
    add-double/2addr v1, v4

    .line 139
    cmpl-double v0, v14, v1

    .line 140
    .line 141
    if-ltz v0, :cond_0

    .line 142
    .line 143
    return v3

    .line 144
    :cond_0
    return p1
.end method


# virtual methods
.method public cleanAll()V
    .locals 0

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 1
    iget v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->mode:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "downDegree,degree--->["

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-wide v1, p0, Lcom/zykj/paint/record/control/CompassesControl;->downDegree:D

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, ","

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-wide v1, p0, Lcom/zykj/paint/record/control/CompassesControl;->degree:D

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "]"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "CompassesControl"

    .line 41
    .line 42
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 46
    .line 47
    iget-object v1, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->center:[F

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    aget v2, v1, v2

    .line 51
    .line 52
    iget v3, v0, Lcom/zykj/paint/record/model/CompassSnapShot;->radius:F

    .line 53
    .line 54
    sub-float v5, v2, v3

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    aget v1, v1, v4

    .line 58
    .line 59
    sub-float v6, v1, v3

    .line 60
    .line 61
    add-float v7, v2, v3

    .line 62
    .line 63
    add-float v8, v1, v3

    .line 64
    .line 65
    iget-wide v1, p0, Lcom/zykj/paint/record/control/CompassesControl;->downDegree:D

    .line 66
    .line 67
    double-to-float v9, v1

    .line 68
    iget-wide v1, p0, Lcom/zykj/paint/record/control/CompassesControl;->degree:D

    .line 69
    .line 70
    double-to-float v10, v1

    .line 71
    const/4 v11, 0x0

    .line 72
    iget-object v12, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 73
    .line 74
    move-object v4, p1

    .line 75
    invoke-virtual/range {v4 .. v12}, Landroid/graphics/Canvas;->drawArc(FFFFFFZLandroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    return-void
.end method

.method public getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public hasDraw()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public touchDown(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/paint/record/model/CompassSnapShot;->setDownMatrix()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 28
    .line 29
    iget v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 30
    .line 31
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(FF)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    iget-object p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 40
    .line 41
    iget v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 42
    .line 43
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 44
    .line 45
    invoke-virtual {p1, v0, v1}, Lcom/zykj/paint/record/model/CompassSnapShot;->getCompassMode(FF)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iput p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->mode:I

    .line 50
    .line 51
    :cond_0
    iget p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->mode:I

    .line 52
    .line 53
    const/4 v0, 0x2

    .line 54
    if-ne p1, v0, :cond_1

    .line 55
    .line 56
    iget-wide v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->degree:D

    .line 57
    .line 58
    iput-wide v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->downDegree:D

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v0, "mode--->"

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->mode:I

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string v0, "CompassesControl"

    .line 80
    .line 81
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public touchMove(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->mode:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 15
    .line 16
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 17
    .line 18
    iget v3, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {v0, v1, v3, v4, p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->exactCalculateDegree(FFFF)D

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    neg-double v0, v0

    .line 33
    iget-object p1, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 34
    .line 35
    double-to-float v3, v0

    .line 36
    iget-object v4, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 37
    .line 38
    iget-object v4, v4, Lcom/zykj/paint/record/model/GraphSnapShot;->center:[F

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    aget v5, v4, v5

    .line 42
    .line 43
    aget v2, v4, v2

    .line 44
    .line 45
    invoke-virtual {p1, v3, v5, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 51
    .line 52
    iget-object v2, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 55
    .line 56
    .line 57
    iget-wide v2, p0, Lcom/zykj/paint/record/control/CompassesControl;->downDegree:D

    .line 58
    .line 59
    add-double/2addr v2, v0

    .line 60
    iput-wide v2, p0, Lcom/zykj/paint/record/control/CompassesControl;->degree:D

    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    if-ne v0, v2, :cond_1

    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 66
    .line 67
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 79
    .line 80
    sub-float/2addr v1, v2

    .line 81
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 86
    .line 87
    sub-float/2addr p1, v2

    .line 88
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 92
    .line 93
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 94
    .line 95
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_1
    const/4 v1, 0x3

    .line 102
    if-ne v0, v1, :cond_2

    .line 103
    .line 104
    iget-object v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 105
    .line 106
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 107
    .line 108
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/zykj/paint/record/model/CompassSnapShot;->onGraphChange(FFFF)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_2
    const/4 v1, 0x4

    .line 123
    if-ne v0, v1, :cond_3

    .line 124
    .line 125
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 126
    .line 127
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getDistance(Landroid/view/MotionEvent;)F

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    iget v0, p0, Lcom/zykj/paint/record/control/BaseControl;->oldDistance:F

    .line 137
    .line 138
    div-float/2addr p1, v0

    .line 139
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 140
    .line 141
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 142
    .line 143
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 144
    .line 145
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 146
    .line 147
    invoke-virtual {v0, p1, p1, v2, v1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 151
    .line 152
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 153
    .line 154
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 157
    .line 158
    .line 159
    :cond_3
    return-void
.end method

.method public touchPointerDown(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/record/model/CompassSnapShot;->setDownMatrix()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 9
    .line 10
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(FF)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/zykj/paint/record/control/CompassesControl;->compassSnapShot:Lcom/zykj/paint/record/model/CompassSnapShot;

    .line 21
    .line 22
    iget-object v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    iput v0, p0, Lcom/zykj/paint/record/control/CompassesControl;->mode:I

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getDistance(Landroid/view/MotionEvent;)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->oldDistance:F

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getRotation(Landroid/view/MotionEvent;)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->oldRotation:F

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->midPoint(Landroid/view/MotionEvent;)Landroid/graphics/PointF;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 47
    .line 48
    return-void
.end method

.method public touchPointerUp(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->mode:I

    .line 3
    .line 4
    return-void
.end method

.method public touchUp(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/zykj/paint/record/control/CompassesControl;->mode:I

    .line 3
    .line 4
    return-void
.end method

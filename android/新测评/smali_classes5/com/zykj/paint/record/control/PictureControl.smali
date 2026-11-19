.class public Lcom/zykj/paint/record/control/PictureControl;
.super Lcom/zykj/paint/record/control/BaseControl;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/record/control/ISketchControl;


# static fields
.field public static final DRAG:I = 0x1

.field public static final DRAW:I = 0x5

.field public static final NONE:I = 0x0

.field public static final ROTATE:I = 0x2

.field private static final TAG:Ljava/lang/String; = "PictureControl"

.field public static final VARY:I = 0x3

.field public static final ZOOM:I = 0x4


# instance fields
.field private degree:D

.field private downDegree:D

.field private mapMatrix:Landroid/graphics/Matrix;

.field public mode:I

.field public pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/record/model/GraphSnapShot;Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/BaseControl;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/paint/record/control/PictureControl;->mode:I

    .line 6
    .line 7
    check-cast p1, Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/paint/record/control/PictureControl;->mapMatrix:Landroid/graphics/Matrix;

    .line 12
    .line 13
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

.method private getActionMode()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/record/model/GraphSnapShot;->getActionMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 8
    .line 9
    return-void
.end method

.method private isTouchInGraph(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1, p2}, Lcom/zykj/paint/record/control/PictureControl;->pointCheck(Lcom/zykj/paint/record/model/GraphSnapShot;FF)Z

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
    .locals 0

    return-void
.end method

.method public getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasDraw()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public tempDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public touchDown(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/PictureControl;->getActionMode()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "actionMode="

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "PictureControl"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 39
    .line 40
    new-instance p1, Landroid/graphics/Matrix;

    .line 41
    .line 42
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 53
    .line 54
    iget-object v2, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;

    .line 55
    .line 56
    iget v3, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 57
    .line 58
    iget v4, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 59
    .line 60
    invoke-virtual {v0, v2, p1, v3, v4}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;FF)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eqz p1, :cond_0

    .line 65
    .line 66
    new-instance p1, Landroid/graphics/Matrix;

    .line 67
    .line 68
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 72
    .line 73
    iget-object v0, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    iput p1, p0, Lcom/zykj/paint/record/control/PictureControl;->mode:I

    .line 85
    .line 86
    const-string p1, "[mode]---->>>DRAG"

    .line 87
    .line 88
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    :cond_0
    return-void
.end method

.method public touchMove(Landroid/view/MotionEvent;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/PictureControl;->getActionMode()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lcom/zykj/paint/record/control/PictureControl;->mode:I

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 25
    .line 26
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 27
    .line 28
    iget v4, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {v0, v1, v4, v5, p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->exactCalculateDegree(FFFF)D

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    neg-double v0, v0

    .line 43
    iget-object p1, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 44
    .line 45
    double-to-float v4, v0

    .line 46
    iget-object v5, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 47
    .line 48
    iget-object v5, v5, Lcom/zykj/paint/record/model/GraphSnapShot;->center:[F

    .line 49
    .line 50
    aget v6, v5, v2

    .line 51
    .line 52
    aget v3, v5, v3

    .line 53
    .line 54
    invoke-virtual {p1, v4, v6, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 58
    .line 59
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 60
    .line 61
    iget-object v3, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 62
    .line 63
    invoke-virtual {p1, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 64
    .line 65
    .line 66
    iget-wide v3, p0, Lcom/zykj/paint/record/control/PictureControl;->downDegree:D

    .line 67
    .line 68
    add-double/2addr v3, v0

    .line 69
    iput-wide v3, p0, Lcom/zykj/paint/record/control/PictureControl;->degree:D

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_0
    if-ne v0, v3, :cond_1

    .line 74
    .line 75
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 76
    .line 77
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    iget v3, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 89
    .line 90
    sub-float/2addr v1, v3

    .line 91
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iget v3, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 96
    .line 97
    sub-float/2addr p1, v3

    .line 98
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 102
    .line 103
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 104
    .line 105
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    const/4 v1, 0x3

    .line 112
    if-ne v0, v1, :cond_2

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    const/4 v1, 0x4

    .line 116
    if-ne v0, v1, :cond_3

    .line 117
    .line 118
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 119
    .line 120
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getRotation(Landroid/view/MotionEvent;)F

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->oldRotation:F

    .line 130
    .line 131
    sub-float/2addr v0, v1

    .line 132
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 133
    .line 134
    iget-object v3, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 135
    .line 136
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 137
    .line 138
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 139
    .line 140
    invoke-virtual {v1, v0, v4, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getDistance(Landroid/view/MotionEvent;)F

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->oldDistance:F

    .line 148
    .line 149
    div-float/2addr v0, v1

    .line 150
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 151
    .line 152
    iget-object v3, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 153
    .line 154
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 155
    .line 156
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 157
    .line 158
    invoke-virtual {v1, v0, v0, v4, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->midPoint(Landroid/view/MotionEvent;)Landroid/graphics/PointF;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 166
    .line 167
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 168
    .line 169
    iget-object v3, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 170
    .line 171
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 172
    .line 173
    sub-float/2addr v1, v4

    .line 174
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 175
    .line 176
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 177
    .line 178
    sub-float/2addr p1, v3

    .line 179
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 183
    .line 184
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 185
    .line 186
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 187
    .line 188
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 189
    .line 190
    .line 191
    :cond_3
    :goto_0
    invoke-static {}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    const/16 v0, 0x9

    .line 196
    .line 197
    new-array v1, v0, [F

    .line 198
    .line 199
    new-instance v3, Landroid/graphics/Matrix;

    .line 200
    .line 201
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/PictureControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    iget-object v4, v4, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 209
    .line 210
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/PictureControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    iget-object v4, v4, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 218
    .line 219
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 223
    .line 224
    .line 225
    :goto_1
    if-ge v2, v0, :cond_4

    .line 226
    .line 227
    aget v3, v1, v2

    .line 228
    .line 229
    invoke-virtual {p1, v3}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->addValues(F)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 230
    .line 231
    .line 232
    add-int/lit8 v2, v2, 0x1

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_4
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/PictureControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    iget v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->graphId:I

    .line 244
    .line 245
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->build()Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-static {p1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/PictureControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 264
    .line 265
    invoke-virtual {p1, v0}, Lcom/zykj/paint/SketchSyncView;->addMatrixAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)V

    .line 266
    .line 267
    .line 268
    return-void
.end method

.method public touchPointerDown(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/PictureControl;->getActionMode()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "[touchPointerDown]actionMode="

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "PictureControl"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    new-instance v0, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 34
    .line 35
    iget-object v2, v2, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchMatrix:Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 41
    .line 42
    iget-object v3, v2, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchBitmap:Landroid/graphics/Bitmap;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-virtual {v2, v3, v0, v4, v5}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;FF)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    new-instance v0, Landroid/graphics/Matrix;

    .line 59
    .line 60
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 64
    .line 65
    iget-object v2, v2, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 68
    .line 69
    .line 70
    iget-object v2, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x4

    .line 76
    iput v0, p0, Lcom/zykj/paint/record/control/PictureControl;->mode:I

    .line 77
    .line 78
    const-string v0, "[mode]---->>>ZOOM"

    .line 79
    .line 80
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getDistance(Landroid/view/MotionEvent;)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->oldDistance:F

    .line 88
    .line 89
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getRotation(Landroid/view/MotionEvent;)F

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->oldRotation:F

    .line 94
    .line 95
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->midPoint(Landroid/view/MotionEvent;)Landroid/graphics/PointF;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 100
    .line 101
    :cond_0
    return-void
.end method

.method public touchPointerUp(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/PictureControl;->getActionMode()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/paint/record/model/PictureSnapShot;->updateMatrix(Landroid/graphics/Matrix;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/zykj/paint/record/control/PictureControl;->mode:I

    .line 12
    .line 13
    return-void
.end method

.method public touchUp(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/PictureControl;->getActionMode()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/zykj/paint/record/control/PictureControl;->pictureSnapShot:Lcom/zykj/paint/record/model/PictureSnapShot;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/paint/record/model/PictureSnapShot;->updateMatrix(Landroid/graphics/Matrix;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/zykj/paint/record/control/PictureControl;->mode:I

    .line 12
    .line 13
    return-void
.end method

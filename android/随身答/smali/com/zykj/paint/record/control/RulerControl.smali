.class public Lcom/zykj/paint/record/control/RulerControl;
.super Lcom/zykj/paint/record/control/BaseControl;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/record/control/ISketchControl;


# static fields
.field public static final DRAG:I = 0x1

.field public static final DRAW:I = 0x5

.field public static final NONE:I = 0x0

.field public static final ROTATE:I = 0x2

.field private static final TAG:Ljava/lang/String; = "RulerControl"

.field public static final VARY:I = 0x3

.field public static final ZOOM:I = 0x4


# instance fields
.field private mPath:Landroid/graphics/Path;

.field protected mode:I

.field private rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;


# direct methods
.method public constructor <init>(Lcom/zykj/paint/record/model/GraphSnapShot;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/BaseControl;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mPath:Landroid/graphics/Path;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

    .line 13
    .line 14
    check-cast p1, Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public cleanAll()V
    .locals 0

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mPath:Landroid/graphics/Path;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 9
    .line 10
    iget-object v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->paint:Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 13
    .line 14
    .line 15
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
    .locals 4

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
    move-result v0

    .line 11
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 23
    .line 24
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 25
    .line 26
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Lcom/zykj/paint/record/model/RulerSnapShot;->isInDrawGraphRect(FF)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x1

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x5

    .line 36
    iput v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

    .line 37
    .line 38
    new-instance v0, Landroid/graphics/Path;

    .line 39
    .line 40
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mPath:Landroid/graphics/Path;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {v0, v2, p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->invertPoints(FF)[F

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    aget p1, p1, v2

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    invoke-virtual {v0, p1, v3}, Lcom/zykj/paint/record/model/GraphSnapShot;->mapPoints(FF)[F

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mPath:Landroid/graphics/Path;

    .line 70
    .line 71
    aget v2, p1, v2

    .line 72
    .line 73
    aget p1, p1, v1

    .line 74
    .line 75
    invoke-virtual {v0, v2, p1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    iget-object p1, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 80
    .line 81
    iget v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 82
    .line 83
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 84
    .line 85
    invoke-virtual {p1, v0, v2}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(FF)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    iput v1, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

    .line 92
    .line 93
    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string/jumbo v0, "touchDown mode--->"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string v0, "RulerControl"

    .line 114
    .line 115
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public touchMove(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 14
    .line 15
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 16
    .line 17
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->exactCalculateDegree(FFFF)D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    neg-double v0, v0

    .line 32
    iget-object p1, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 33
    .line 34
    double-to-float v0, v0

    .line 35
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 36
    .line 37
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 38
    .line 39
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 40
    .line 41
    invoke-virtual {p1, v0, v2, v1}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    const/4 v1, 0x1

    .line 55
    if-ne v0, v1, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 58
    .line 59
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 71
    .line 72
    sub-float/2addr v1, v2

    .line 73
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 78
    .line 79
    sub-float/2addr p1, v2

    .line 80
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_1
    const/4 v2, 0x3

    .line 94
    if-ne v0, v2, :cond_2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    const/4 v2, 0x4

    .line 98
    if-ne v0, v2, :cond_3

    .line 99
    .line 100
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 101
    .line 102
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getRotation(Landroid/view/MotionEvent;)F

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->oldRotation:F

    .line 112
    .line 113
    sub-float/2addr v0, v1

    .line 114
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 115
    .line 116
    iget-object v2, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 117
    .line 118
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 119
    .line 120
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 121
    .line 122
    invoke-virtual {v1, v0, v3, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getDistance(Landroid/view/MotionEvent;)F

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->oldDistance:F

    .line 130
    .line 131
    div-float/2addr p1, v1

    .line 132
    iget-object v1, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 133
    .line 134
    invoke-virtual {v1, p1, v0}, Lcom/zykj/paint/record/model/RulerSnapShot;->setScaleMatrix(FF)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 138
    .line 139
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 140
    .line 141
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 142
    .line 143
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_3
    const/4 v2, 0x5

    .line 148
    if-ne v0, v2, :cond_4

    .line 149
    .line 150
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 157
    .line 158
    .line 159
    move-result p1

    .line 160
    invoke-virtual {v0, v2, p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->invertPoints(FF)[F

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 165
    .line 166
    const/4 v2, 0x0

    .line 167
    aget p1, p1, v2

    .line 168
    .line 169
    const/4 v3, 0x0

    .line 170
    invoke-virtual {v0, p1, v3}, Lcom/zykj/paint/record/model/GraphSnapShot;->mapPoints(FF)[F

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mPath:Landroid/graphics/Path;

    .line 175
    .line 176
    aget v2, p1, v2

    .line 177
    .line 178
    aget p1, p1, v1

    .line 179
    .line 180
    invoke-virtual {v0, v2, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 181
    .line 182
    .line 183
    :cond_4
    :goto_0
    return-void
.end method

.method public touchPointerDown(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/zykj/paint/record/model/GraphSnapShot;->isInGraphRect(FF)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/paint/record/control/RulerControl;->rulerSnapShot:Lcom/zykj/paint/record/model/RulerSnapShot;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/paint/record/model/RulerSnapShot;->setDownScale()V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    iput v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

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
    new-instance p1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string/jumbo v0, "touchPointerDown mode--->"

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget v0, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const-string v0, "RulerControl"

    .line 69
    .line 70
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public touchPointerUp(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

    .line 3
    .line 4
    return-void
.end method

.method public touchUp(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/zykj/paint/record/control/RulerControl;->mode:I

    .line 3
    .line 4
    return-void
.end method

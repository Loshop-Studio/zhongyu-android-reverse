.class public Lcom/zykj/paint/record/control/MapControl;
.super Lcom/zykj/paint/record/control/BaseControl;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/record/control/ISketchControl;


# static fields
.field public static final DRAG:I = 0x1

.field public static final NONE:I = 0x0

.field public static final ROTATE:I = 0x2

.field private static final TAG:Ljava/lang/String; = "MapControl"

.field public static final VARY:I = 0x3

.field public static final ZOOM:I = 0x4


# instance fields
.field private degree:D

.field private downDegree:D

.field private isMultiFinger:Z

.field private mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

.field public mode:I

.field private final sketchControls:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/paint/record/control/ISketchControl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/paint/record/model/MapSnapShot;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/paint/record/model/MapSnapShot;",
            "Ljava/util/ArrayList<",
            "Lcom/zykj/paint/record/control/ISketchControl;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/control/BaseControl;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/paint/record/control/MapControl;->mode:I

    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/zykj/paint/record/control/MapControl;->sketchControls:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public cleanAll()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/paint/record/model/MapSnapShot;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

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
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

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
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    iput p1, p0, Lcom/zykj/paint/record/control/MapControl;->mode:I

    .line 32
    .line 33
    return-void
.end method

.method public touchMove(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

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
    const-string v0, "touchMove"

    .line 10
    .line 11
    const-string v1, "MapControl"

    .line 12
    .line 13
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "actionMode="

    .line 19
    .line 20
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    iget v0, p0, Lcom/zykj/paint/record/control/MapControl;->mode:I

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    if-ne v0, v1, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 54
    .line 55
    sub-float/2addr v1, v2

    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 61
    .line 62
    sub-float/2addr p1, v2

    .line 63
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 67
    .line 68
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 69
    .line 70
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 v1, 0x3

    .line 77
    if-ne v0, v1, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const/4 v1, 0x4

    .line 81
    if-ne v0, v1, :cond_2

    .line 82
    .line 83
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 84
    .line 85
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getDistance(Landroid/view/MotionEvent;)F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->oldDistance:F

    .line 95
    .line 96
    div-float/2addr v0, v1

    .line 97
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 98
    .line 99
    iget-object v2, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 100
    .line 101
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 102
    .line 103
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 104
    .line 105
    invoke-virtual {v1, v0, v0, v3, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->midPoint(Landroid/view/MotionEvent;)Landroid/graphics/PointF;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 113
    .line 114
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 115
    .line 116
    iget-object v2, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 117
    .line 118
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 119
    .line 120
    sub-float/2addr v1, v3

    .line 121
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 122
    .line 123
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 124
    .line 125
    sub-float/2addr p1, v2

    .line 126
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 130
    .line 131
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 132
    .line 133
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 134
    .line 135
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    :goto_0
    invoke-static {}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    const/16 v0, 0x9

    .line 143
    .line 144
    new-array v1, v0, [F

    .line 145
    .line 146
    new-instance v2, Landroid/graphics/Matrix;

    .line 147
    .line 148
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    iget-object v3, v3, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 156
    .line 157
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 161
    .line 162
    .line 163
    const/4 v2, 0x0

    .line 164
    :goto_1
    if-ge v2, v0, :cond_3

    .line 165
    .line 166
    aget v3, v1, v2

    .line 167
    .line 168
    invoke-virtual {p1, v3}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->addValues(F)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 169
    .line 170
    .line 171
    add-int/lit8 v2, v2, 0x1

    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_3
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    iget v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->graphId:I

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->build()Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-static {p1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 203
    .line 204
    invoke-virtual {p1, v0}, Lcom/zykj/paint/SketchSyncView;->addMatrixAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)V

    .line 205
    .line 206
    .line 207
    return-void
.end method

.method public touchPointerDown(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

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
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    iput v0, p0, Lcom/zykj/paint/record/control/MapControl;->mode:I

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getDistance(Landroid/view/MotionEvent;)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->oldDistance:F

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getRotation(Landroid/view/MotionEvent;)F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, Lcom/zykj/paint/record/control/BaseControl;->oldRotation:F

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->midPoint(Landroid/view/MotionEvent;)Landroid/graphics/PointF;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 50
    .line 51
    return-void
.end method

.method public touchPointerUp(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->getActionMode()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 8
    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v0, "[touchPointerUp]-----actionMode="

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "MapControl"

    .line 26
    .line 27
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/16 v1, 0x9

    .line 35
    .line 36
    new-array v2, v1, [F

    .line 37
    .line 38
    new-instance v3, Landroid/graphics/Matrix;

    .line 39
    .line 40
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v4, v4, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    move v4, v3

    .line 57
    :goto_0
    if-ge v4, v1, :cond_0

    .line 58
    .line 59
    aget v5, v2, v4

    .line 60
    .line 61
    invoke-virtual {p1, v5}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->addValues(F)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 62
    .line 63
    .line 64
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const/4 v2, -0x1

    .line 72
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->build()Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {v1, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 91
    .line 92
    invoke-virtual {p1, v1}, Lcom/zykj/paint/SketchSyncView;->addMatrixAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)V

    .line 93
    .line 94
    .line 95
    iput v3, p0, Lcom/zykj/paint/record/control/MapControl;->mode:I

    .line 96
    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 102
    .line 103
    iget-object v3, p0, Lcom/zykj/paint/record/control/MapControl;->sketchControls:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {p1, v3}, Lcom/zykj/paint/record/model/MapSnapShot;->updateMatrix(Ljava/util/ArrayList;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/zykj/paint/SketchSyncView;->updateSnapshot()V

    .line 115
    .line 116
    .line 117
    new-instance p1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v3, "[touchPointerUp]\u7ed8\u5236\u6301\u7eed\u65f6\u95f4------->>>>["

    .line 120
    .line 121
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    sub-long/2addr v3, v1

    .line 129
    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v1, "ms]"

    .line 133
    .line 134
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public touchUp(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/paint/record/model/GraphSnapShot;->getActionMode()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 8
    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v0, "-----actionMode="

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "MapControl"

    .line 26
    .line 27
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/16 v1, 0x9

    .line 35
    .line 36
    new-array v2, v1, [F

    .line 37
    .line 38
    new-instance v3, Landroid/graphics/Matrix;

    .line 39
    .line 40
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    iget-object v4, v4, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 53
    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    move v4, v3

    .line 57
    :goto_0
    if-ge v4, v1, :cond_0

    .line 58
    .line 59
    aget v5, v2, v4

    .line 60
    .line 61
    invoke-virtual {p1, v5}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->addValues(F)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 62
    .line 63
    .line 64
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const/4 v2, -0x1

    .line 72
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->build()Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {v1, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 91
    .line 92
    invoke-virtual {p1, v1}, Lcom/zykj/paint/SketchSyncView;->addMatrixAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)V

    .line 93
    .line 94
    .line 95
    iput v3, p0, Lcom/zykj/paint/record/control/MapControl;->mode:I

    .line 96
    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 102
    .line 103
    iget-object v3, p0, Lcom/zykj/paint/record/control/MapControl;->sketchControls:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {p1, v3}, Lcom/zykj/paint/record/model/MapSnapShot;->updateMatrix(Ljava/util/ArrayList;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v3, "\u66f4\u65b0\u56fe\u7247\u6d88\u8017------->>>>["

    .line 111
    .line 112
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 116
    .line 117
    .line 118
    move-result-wide v3

    .line 119
    sub-long/2addr v3, v1

    .line 120
    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v3, "ms]"

    .line 124
    .line 125
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/zykj/paint/SketchSyncView;->updateSnapshot()V

    .line 142
    .line 143
    .line 144
    new-instance p1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v4, "\u7ed8\u5236\u6301\u7eed\u65f6\u95f4------->>>>["

    .line 147
    .line 148
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 152
    .line 153
    .line 154
    move-result-wide v4

    .line 155
    sub-long/2addr v4, v1

    .line 156
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 167
    .line 168
    .line 169
    return-void
.end method

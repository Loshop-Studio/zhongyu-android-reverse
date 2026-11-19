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
    const-string/jumbo v0, "touchMove"

    .line 10
    .line 11
    .line 12
    const-string v1, "MapControl"

    .line 13
    .line 14
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "actionMode="

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    iget v0, p0, Lcom/zykj/paint/record/control/MapControl;->mode:I

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    if-ne v0, v1, :cond_0

    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorX:F

    .line 58
    .line 59
    sub-float/2addr v1, v2

    .line 60
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iget v2, p0, Lcom/zykj/paint/record/control/BaseControl;->anchorY:F

    .line 65
    .line 66
    sub-float/2addr p1, v2

    .line 67
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 71
    .line 72
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    const/4 v1, 0x3

    .line 81
    if-ne v0, v1, :cond_1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    const/4 v1, 0x4

    .line 85
    if-ne v0, v1, :cond_2

    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 88
    .line 89
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->downMatrix:Landroid/graphics/Matrix;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->getDistance(Landroid/view/MotionEvent;)F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget v1, p0, Lcom/zykj/paint/record/control/BaseControl;->oldDistance:F

    .line 99
    .line 100
    div-float/2addr v0, v1

    .line 101
    iget-object v1, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 102
    .line 103
    iget-object v2, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 104
    .line 105
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 106
    .line 107
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 108
    .line 109
    invoke-virtual {v1, v0, v0, v3, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, p1}, Lcom/zykj/paint/record/control/BaseControl;->midPoint(Landroid/view/MotionEvent;)Landroid/graphics/PointF;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 117
    .line 118
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 119
    .line 120
    iget-object v2, p0, Lcom/zykj/paint/record/control/BaseControl;->midPoint:Landroid/graphics/PointF;

    .line 121
    .line 122
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 123
    .line 124
    sub-float/2addr v1, v3

    .line 125
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 126
    .line 127
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 128
    .line 129
    sub-float/2addr p1, v2

    .line 130
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 134
    .line 135
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 136
    .line 137
    iget-object v0, p0, Lcom/zykj/paint/record/control/BaseControl;->moveMatrix:Landroid/graphics/Matrix;

    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 140
    .line 141
    .line 142
    :cond_2
    :goto_0
    invoke-static {}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    const/16 v0, 0x9

    .line 147
    .line 148
    new-array v1, v0, [F

    .line 149
    .line 150
    new-instance v2, Landroid/graphics/Matrix;

    .line 151
    .line 152
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    iget-object v3, v3, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 160
    .line 161
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 165
    .line 166
    .line 167
    const/4 v2, 0x0

    .line 168
    :goto_1
    if-ge v2, v0, :cond_3

    .line 169
    .line 170
    aget v3, v1, v2

    .line 171
    .line 172
    invoke-virtual {p1, v3}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->addValues(F)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 173
    .line 174
    .line 175
    add-int/lit8 v2, v2, 0x1

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_3
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    iget v1, v1, Lcom/zykj/paint/record/model/GraphSnapShot;->graphId:I

    .line 187
    .line 188
    invoke-virtual {v0, v1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->build()Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-static {p1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 207
    .line 208
    invoke-virtual {p1, v0}, Lcom/zykj/paint/SketchSyncView;->addMatrixAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)V

    .line 209
    .line 210
    .line 211
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
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "[touchPointerUp]-----actionMode="

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "MapControl"

    .line 29
    .line 30
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/16 v1, 0x9

    .line 38
    .line 39
    new-array v2, v1, [F

    .line 40
    .line 41
    new-instance v3, Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v4, v4, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 56
    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    move v4, v3

    .line 60
    :goto_0
    if-ge v4, v1, :cond_0

    .line 61
    .line 62
    aget v5, v2, v4

    .line 63
    .line 64
    invoke-virtual {p1, v5}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->addValues(F)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 65
    .line 66
    .line 67
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const/4 v2, -0x1

    .line 75
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->build()Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v1, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Lcom/zykj/paint/SketchSyncView;->addMatrixAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)V

    .line 96
    .line 97
    .line 98
    iput v3, p0, Lcom/zykj/paint/record/control/MapControl;->mode:I

    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v1

    .line 104
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 105
    .line 106
    iget-object v3, p0, Lcom/zykj/paint/record/control/MapControl;->sketchControls:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p1, v3}, Lcom/zykj/paint/record/model/MapSnapShot;->updateMatrix(Ljava/util/ArrayList;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/zykj/paint/SketchSyncView;->updateSnapshot()V

    .line 118
    .line 119
    .line 120
    new-instance p1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v3, "[touchPointerUp]\u7ed8\u5236\u6301\u7eed\u65f6\u95f4------->>>>["

    .line 126
    .line 127
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 131
    .line 132
    .line 133
    move-result-wide v3

    .line 134
    sub-long/2addr v3, v1

    .line 135
    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string/jumbo v1, "ms]"

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
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
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "-----actionMode="

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/paint/record/control/BaseControl;->actionMode:I

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string v0, "MapControl"

    .line 29
    .line 30
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/zykj/paint/Actions$EzyMatrixData;->newBuilder()Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/16 v1, 0x9

    .line 38
    .line 39
    new-array v2, v1, [F

    .line 40
    .line 41
    new-instance v3, Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v4, v4, Lcom/zykj/paint/record/model/GraphSnapShot;->matrix:Landroid/graphics/Matrix;

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 56
    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    move v4, v3

    .line 60
    :goto_0
    if-ge v4, v1, :cond_0

    .line 61
    .line 62
    aget v5, v2, v4

    .line 63
    .line 64
    invoke-virtual {p1, v5}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->addValues(F)Lcom/zykj/paint/Actions$EzyMatrixData$Builder;

    .line 65
    .line 66
    .line 67
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-static {}, Lcom/zykj/paint/Actions$EzyAction;->newBuilder()Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const/4 v2, -0x1

    .line 75
    invoke-virtual {v1, v2}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setGraphId(I)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyMatrixData$Builder;->build()Lcom/zykj/paint/Actions$EzyMatrixData;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Lcom/google/protobuf/Any;->pack(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Any;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v1, p1}, Lcom/zykj/paint/Actions$EzyAction$Builder;->setData(Lcom/google/protobuf/Any;)Lcom/zykj/paint/Actions$EzyAction$Builder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Lcom/zykj/paint/SketchSyncView;->addMatrixAction(Lcom/zykj/paint/Actions$EzyAction$Builder;)V

    .line 96
    .line 97
    .line 98
    iput v3, p0, Lcom/zykj/paint/record/control/MapControl;->mode:I

    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v1

    .line 104
    iget-object p1, p0, Lcom/zykj/paint/record/control/MapControl;->mapSnapShot:Lcom/zykj/paint/record/model/MapSnapShot;

    .line 105
    .line 106
    iget-object v3, p0, Lcom/zykj/paint/record/control/MapControl;->sketchControls:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p1, v3}, Lcom/zykj/paint/record/model/MapSnapShot;->updateMatrix(Ljava/util/ArrayList;)V

    .line 109
    .line 110
    .line 111
    new-instance p1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string/jumbo v3, "\u66f4\u65b0\u56fe\u7247\u6d88\u8017------->>>>["

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 123
    .line 124
    .line 125
    move-result-wide v3

    .line 126
    sub-long/2addr v3, v1

    .line 127
    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string/jumbo v3, "ms]"

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/zykj/paint/record/control/MapControl;->getGraphSnapShot()Lcom/zykj/paint/record/model/GraphSnapShot;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p1, p1, Lcom/zykj/paint/record/model/GraphSnapShot;->sketchView:Lcom/zykj/paint/SketchSyncView;

    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/zykj/paint/SketchSyncView;->updateSnapshot()V

    .line 150
    .line 151
    .line 152
    new-instance p1, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const-string/jumbo v4, "\u7ed8\u5236\u6301\u7eed\u65f6\u95f4------->>>>["

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 164
    .line 165
    .line 166
    move-result-wide v4

    .line 167
    sub-long/2addr v4, v1

    .line 168
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    return-void
.end method

.class public final Lcom/zykj/blackboard/core/action/GeometryAction;
.super Lcom/zykj/blackboard/core/action/MoveAction;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/GeometryAction$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/GeometryAction;",
        "Lcom/zykj/blackboard/core/action/MoveAction;",
        "<init>",
        "()V",
        "",
        "x",
        "y",
        "Landroid/graphics/PointF;",
        "getRenderPointF",
        "(FF)Landroid/graphics/PointF;",
        "Ld6/s;",
        "reset",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "event",
        "singleTouchDown",
        "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V",
        "singleTouchMove",
        "singleTouchUp",
        "singleTouchCancel",
        "firstX",
        "F",
        "firstY",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/Paint;",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private firstX:F

.field private firstY:F

.field private final paint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/MoveAction;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    const/high16 v1, -0x1000000

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 12
    .line 13
    .line 14
    const/high16 v1, 0x40400000    # 3.0f

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 34
    .line 35
    .line 36
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->paint:Landroid/graphics/Paint;

    .line 42
    .line 43
    return-void
.end method

.method private final getRenderPointF(FF)Landroid/graphics/PointF;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method


# virtual methods
.method public reset()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 3
    .line 4
    iput v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->paint:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getGeometryStrokeColor()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->paint:Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getGeometryStrokeWidth()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public singleTouchCancel(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public singleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/GeometryAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 21
    .line 22
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 23
    .line 24
    iput p1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 25
    .line 26
    return-void
.end method

.method public singleTouchMove(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 6
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/GeometryAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getGeometryMinSize()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/high16 v0, 0x428c0000    # 70.0f

    .line 30
    .line 31
    :goto_0
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 32
    .line 33
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 34
    .line 35
    sub-float/2addr v1, v2

    .line 36
    cmpg-float v1, v1, v0

    .line 37
    .line 38
    if-ltz v1, :cond_7

    .line 39
    .line 40
    iget v1, p1, Landroid/graphics/PointF;->y:F

    .line 41
    .line 42
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 43
    .line 44
    sub-float/2addr v1, v2

    .line 45
    cmpg-float v0, v1, v0

    .line 46
    .line 47
    if-gez v0, :cond_1

    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    new-instance v0, Landroid/graphics/Path;

    .line 52
    .line 53
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v2, 0x0

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getGeometryActionEnum()Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object v1, v2

    .line 69
    :goto_1
    if-nez v1, :cond_3

    .line 70
    .line 71
    const/4 v1, -0x1

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    sget-object v3, Lcom/zykj/blackboard/core/action/GeometryAction$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    aget v1, v3, v1

    .line 80
    .line 81
    :goto_2
    const/4 v3, 0x1

    .line 82
    if-eq v1, v3, :cond_6

    .line 83
    .line 84
    const/4 v3, 0x2

    .line 85
    if-eq v1, v3, :cond_5

    .line 86
    .line 87
    const/4 v4, 0x3

    .line 88
    if-eq v1, v4, :cond_4

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 92
    .line 93
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 94
    .line 95
    add-float/2addr v1, v4

    .line 96
    int-to-float v3, v3

    .line 97
    div-float/2addr v1, v3

    .line 98
    iget v3, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 99
    .line 100
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 101
    .line 102
    .line 103
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 104
    .line 105
    iget v3, p1, Landroid/graphics/PointF;->y:F

    .line 106
    .line 107
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 108
    .line 109
    .line 110
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 111
    .line 112
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 113
    .line 114
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 122
    .line 123
    iget v3, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 124
    .line 125
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 126
    .line 127
    .line 128
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 129
    .line 130
    iget v3, p1, Landroid/graphics/PointF;->y:F

    .line 131
    .line 132
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 133
    .line 134
    .line 135
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 136
    .line 137
    iget v3, p1, Landroid/graphics/PointF;->y:F

    .line 138
    .line 139
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 140
    .line 141
    .line 142
    iget p1, p1, Landroid/graphics/PointF;->x:F

    .line 143
    .line 144
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 145
    .line 146
    invoke-virtual {v0, p1, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_6
    new-instance v1, Landroid/graphics/RectF;

    .line 154
    .line 155
    iget v3, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 156
    .line 157
    iget v4, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 158
    .line 159
    iget v5, p1, Landroid/graphics/PointF;->x:F

    .line 160
    .line 161
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 162
    .line 163
    invoke-direct {v1, v3, v4, v5, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 164
    .line 165
    .line 166
    sget-object p1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 167
    .line 168
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 169
    .line 170
    .line 171
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-eqz p1, :cond_8

    .line 176
    .line 177
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->paint:Landroid/graphics/Paint;

    .line 178
    .line 179
    invoke-interface {p1, v0, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_7
    :goto_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 190
    .line 191
    .line 192
    :cond_8
    return-void
.end method

.method public singleTouchUp(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 11
    .param p1    # Lcom/zykj/board/EzyTouchEvent$TouchEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/GeometryAction;->getRenderPointF(FF)Landroid/graphics/PointF;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getGeometryMinSize()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/high16 v0, 0x428c0000    # 70.0f

    .line 39
    .line 40
    :goto_0
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 41
    .line 42
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 43
    .line 44
    sub-float/2addr v1, v2

    .line 45
    cmpg-float v1, v1, v0

    .line 46
    .line 47
    if-ltz v1, :cond_e

    .line 48
    .line 49
    iget v1, p1, Landroid/graphics/PointF;->y:F

    .line 50
    .line 51
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 52
    .line 53
    sub-float/2addr v1, v2

    .line 54
    cmpg-float v0, v1, v0

    .line 55
    .line 56
    if-gez v0, :cond_2

    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-static {v0}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    :cond_3
    new-instance v0, Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 81
    .line 82
    .line 83
    :cond_4
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 84
    .line 85
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 86
    .line 87
    sub-float/2addr v1, v2

    .line 88
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    iget v1, p1, Landroid/graphics/PointF;->y:F

    .line 97
    .line 98
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 99
    .line 100
    sub-float/2addr v1, v2

    .line 101
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const/4 v1, 0x0

    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getGeometryActionEnum()Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    goto :goto_1

    .line 121
    :cond_5
    move-object v0, v1

    .line 122
    :goto_1
    sget-object v2, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->OVAL:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 123
    .line 124
    const/4 v5, 0x1

    .line 125
    if-ne v0, v2, :cond_6

    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    move v7, v0

    .line 129
    goto :goto_2

    .line 130
    :cond_6
    move v7, v5

    .line 131
    :goto_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    if-eqz v0, :cond_7

    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getGeometryActionEnum()Lcom/zykj/blackboard/core/action/GeometryActionEnum;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    :cond_7
    if-nez v1, :cond_8

    .line 142
    .line 143
    const/4 v0, -0x1

    .line 144
    goto :goto_3

    .line 145
    :cond_8
    sget-object v0, Lcom/zykj/blackboard/core/action/GeometryAction$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    aget v0, v0, v1

    .line 152
    .line 153
    :goto_3
    if-eq v0, v5, :cond_b

    .line 154
    .line 155
    const/4 v1, 0x2

    .line 156
    const/4 v2, 0x0

    .line 157
    if-eq v0, v1, :cond_a

    .line 158
    .line 159
    const/4 v5, 0x3

    .line 160
    if-eq v0, v5, :cond_9

    .line 161
    .line 162
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 163
    .line 164
    :goto_4
    move-object v8, v0

    .line 165
    goto :goto_5

    .line 166
    :cond_9
    new-instance v0, Landroid/graphics/PointF;

    .line 167
    .line 168
    int-to-float v1, v1

    .line 169
    div-float v1, v3, v1

    .line 170
    .line 171
    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 172
    .line 173
    .line 174
    new-instance v1, Landroid/graphics/PointF;

    .line 175
    .line 176
    invoke-direct {v1, v2, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 177
    .line 178
    .line 179
    new-instance v2, Landroid/graphics/PointF;

    .line 180
    .line 181
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 182
    .line 183
    .line 184
    filled-new-array {v0, v1, v2}, [Landroid/graphics/PointF;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    goto :goto_4

    .line 193
    :cond_a
    new-instance v0, Landroid/graphics/PointF;

    .line 194
    .line 195
    invoke-direct {v0, v2, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 196
    .line 197
    .line 198
    new-instance v1, Landroid/graphics/PointF;

    .line 199
    .line 200
    invoke-direct {v1, v3, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 201
    .line 202
    .line 203
    new-instance v5, Landroid/graphics/PointF;

    .line 204
    .line 205
    invoke-direct {v5, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 206
    .line 207
    .line 208
    new-instance v6, Landroid/graphics/PointF;

    .line 209
    .line 210
    invoke-direct {v6, v2, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 211
    .line 212
    .line 213
    filled-new-array {v0, v1, v5, v6}, [Landroid/graphics/PointF;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    goto :goto_4

    .line 222
    :cond_b
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :goto_5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getListener()Lcom/zykj/blackboard/core/action/IActionListener;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    if-eqz v2, :cond_f

    .line 230
    .line 231
    iget v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstX:F

    .line 232
    .line 233
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 234
    .line 235
    cmpl-float v5, v0, v1

    .line 236
    .line 237
    if-lez v5, :cond_c

    .line 238
    .line 239
    move v5, v1

    .line 240
    goto :goto_6

    .line 241
    :cond_c
    move v5, v0

    .line 242
    :goto_6
    iget v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->firstY:F

    .line 243
    .line 244
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 245
    .line 246
    cmpl-float v1, v0, p1

    .line 247
    .line 248
    if-lez v1, :cond_d

    .line 249
    .line 250
    move v6, p1

    .line 251
    goto :goto_7

    .line 252
    :cond_d
    move v6, v0

    .line 253
    :goto_7
    iget-object v9, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->paint:Landroid/graphics/Paint;

    .line 254
    .line 255
    new-instance v10, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;

    .line 256
    .line 257
    invoke-direct {v10, p0}, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;-><init>(Lcom/zykj/blackboard/core/action/GeometryAction;)V

    .line 258
    .line 259
    .line 260
    invoke-interface/range {v2 .. v10}, Lcom/zykj/blackboard/core/action/IActionListener;->geometryGraphEvent(FFFFILjava/util/List;Landroid/graphics/Paint;Lr6/c;)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :cond_e
    :goto_8
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    if-eqz p1, :cond_f

    .line 269
    .line 270
    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    .line 271
    .line 272
    .line 273
    :cond_f
    return-void
.end method

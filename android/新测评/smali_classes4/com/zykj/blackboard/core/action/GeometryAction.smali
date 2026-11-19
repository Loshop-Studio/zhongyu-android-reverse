.class public final Lcom/zykj/blackboard/core/action/GeometryAction;
.super Lcom/zykj/blackboard/core/action/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/GeometryAction$a;
    }
.end annotation


# instance fields
.field public p:F

.field public q:F

.field public final r:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/b;-><init>()V

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
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->r:Landroid/graphics/Paint;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/GeometryAction;->v(FF)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

    .line 21
    .line 22
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 23
    .line 24
    iput p1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

    .line 25
    .line 26
    return-void
.end method

.method public G(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 6

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/GeometryAction;->v(FF)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

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
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    sget-object v3, Lcom/zykj/blackboard/core/action/GeometryAction$a;->a:[I

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
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

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
    iget v3, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

    .line 99
    .line 100
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 101
    .line 102
    .line 103
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

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
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

    .line 122
    .line 123
    iget v3, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

    .line 124
    .line 125
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 126
    .line 127
    .line 128
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

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
    iget v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

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
    iget v3, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

    .line 156
    .line 157
    iget v4, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-eqz p1, :cond_8

    .line 176
    .line 177
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->r:Landroid/graphics/Paint;

    .line 178
    .line 179
    invoke-interface {p1, v0, v1, v2}, Lk4/c;->A(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_7
    :goto_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    invoke-interface {p1}, Lk4/c;->d()V

    .line 190
    .line 191
    .line 192
    :cond_8
    return-void
.end method

.method public H(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 11

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Lk4/c;->d()V

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
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/GeometryAction;->v(FF)Landroid/graphics/PointF;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

    .line 43
    .line 44
    sub-float/2addr v1, v2

    .line 45
    cmpg-float v1, v1, v0

    .line 46
    .line 47
    if-ltz v1, :cond_c

    .line 48
    .line 49
    iget v1, p1, Landroid/graphics/PointF;->y:F

    .line 50
    .line 51
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

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
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-static {v0}, Le5/m;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

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
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

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
    iget v2, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    sget-object v2, Lcom/zykj/blackboard/core/action/GeometryActionEnum;->a:Lcom/zykj/blackboard/core/action/GeometryActionEnum;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

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
    sget-object v0, Lcom/zykj/blackboard/core/action/GeometryAction$a;->a:[I

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
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    :goto_4
    move-object v8, v0

    .line 167
    goto :goto_5

    .line 168
    :cond_9
    new-instance v0, Landroid/graphics/PointF;

    .line 169
    .line 170
    int-to-float v1, v1

    .line 171
    div-float v1, v3, v1

    .line 172
    .line 173
    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 174
    .line 175
    .line 176
    new-instance v1, Landroid/graphics/PointF;

    .line 177
    .line 178
    invoke-direct {v1, v2, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 179
    .line 180
    .line 181
    new-instance v2, Landroid/graphics/PointF;

    .line 182
    .line 183
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 184
    .line 185
    .line 186
    filled-new-array {v0, v1, v2}, [Landroid/graphics/PointF;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    goto :goto_4

    .line 195
    :cond_a
    new-instance v0, Landroid/graphics/PointF;

    .line 196
    .line 197
    invoke-direct {v0, v2, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 198
    .line 199
    .line 200
    new-instance v1, Landroid/graphics/PointF;

    .line 201
    .line 202
    invoke-direct {v1, v3, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 203
    .line 204
    .line 205
    new-instance v5, Landroid/graphics/PointF;

    .line 206
    .line 207
    invoke-direct {v5, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 208
    .line 209
    .line 210
    new-instance v6, Landroid/graphics/PointF;

    .line 211
    .line 212
    invoke-direct {v6, v2, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 213
    .line 214
    .line 215
    filled-new-array {v0, v1, v5, v6}, [Landroid/graphics/PointF;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    goto :goto_4

    .line 224
    :cond_b
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_4

    .line 229
    :goto_5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lg4/b;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    if-eqz v2, :cond_d

    .line 234
    .line 235
    iget v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

    .line 236
    .line 237
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 238
    .line 239
    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    iget v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

    .line 244
    .line 245
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 246
    .line 247
    invoke-static {v0, p1}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    iget-object v9, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->r:Landroid/graphics/Paint;

    .line 252
    .line 253
    new-instance v10, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;

    .line 254
    .line 255
    invoke-direct {v10, p0}, Lcom/zykj/blackboard/core/action/GeometryAction$singleTouchUp$1;-><init>(Lcom/zykj/blackboard/core/action/GeometryAction;)V

    .line 256
    .line 257
    .line 258
    invoke-interface/range {v2 .. v10}, Lg4/b;->r(FFFFILjava/util/List;Landroid/graphics/Paint;Lkotlin/jvm/functions/Function1;)V

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :cond_c
    :goto_6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    if-eqz p1, :cond_d

    .line 267
    .line 268
    invoke-interface {p1}, Lk4/c;->d()V

    .line 269
    .line 270
    .line 271
    :cond_d
    return-void
.end method

.method public I()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->p:F

    .line 3
    .line 4
    iput v0, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->q:F

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->r:Landroid/graphics/Paint;

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
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/GeometryAction;->r:Landroid/graphics/Paint;

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

.method public final v(FF)Landroid/graphics/PointF;
    .locals 2

    .line 1
    sget-object v0, Le5/n;->a:Le5/n;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lj4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lj4/a;->b()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Le5/n;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

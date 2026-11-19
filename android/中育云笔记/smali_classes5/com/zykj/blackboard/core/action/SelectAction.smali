.class public final Lcom/zykj/blackboard/core/action/SelectAction;
.super Lcom/zykj/blackboard/core/action/b;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:Landroid/graphics/Matrix;

.field public C:Landroid/graphics/Matrix;

.field public D:Landroid/graphics/RectF;

.field public E:Ljava/util/ArrayList;

.field public F:Ljava/util/ArrayList;

.field public final p:Ljava/util/List;

.field public q:J

.field public r:Z

.field public final s:F

.field public t:Z

.field public u:F

.field public v:F

.field public w:Landroid/graphics/Path;

.field public x:Landroid/graphics/Paint;

.field public y:Landroid/graphics/Paint;

.field public final z:F


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->p:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->q:J

    .line 16
    .line 17
    const/high16 v0, 0x41a00000    # 20.0f

    .line 18
    .line 19
    iput v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->s:F

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->t:Z

    .line 23
    .line 24
    new-instance v1, Landroid/graphics/Path;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->w:Landroid/graphics/Path;

    .line 30
    .line 31
    new-instance v1, Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->x:Landroid/graphics/Paint;

    .line 37
    .line 38
    new-instance v1, Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->y:Landroid/graphics/Paint;

    .line 44
    .line 45
    const/high16 v1, 0x42480000    # 50.0f

    .line 46
    .line 47
    iput v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->z:F

    .line 48
    .line 49
    const/4 v1, -0x1

    .line 50
    iput v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->A:I

    .line 51
    .line 52
    new-instance v1, Landroid/graphics/Matrix;

    .line 53
    .line 54
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->B:Landroid/graphics/Matrix;

    .line 58
    .line 59
    new-instance v1, Landroid/graphics/Matrix;

    .line 60
    .line 61
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 65
    .line 66
    new-instance v1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 72
    .line 73
    new-instance v1, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->x:Landroid/graphics/Paint;

    .line 81
    .line 82
    const/high16 v2, -0x1000000

    .line 83
    .line 84
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->x:Landroid/graphics/Paint;

    .line 88
    .line 89
    const/high16 v2, 0x40400000    # 3.0f

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 92
    .line 93
    .line 94
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->x:Landroid/graphics/Paint;

    .line 95
    .line 96
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 97
    .line 98
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->x:Landroid/graphics/Paint;

    .line 102
    .line 103
    new-instance v4, Landroid/graphics/DashPathEffect;

    .line 104
    .line 105
    const/4 v5, 0x2

    .line 106
    new-array v5, v5, [F

    .line 107
    .line 108
    fill-array-data v5, :array_0

    .line 109
    .line 110
    .line 111
    const/4 v6, 0x0

    .line 112
    invoke-direct {v4, v5, v6}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->x:Landroid/graphics/Paint;

    .line 119
    .line 120
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->x:Landroid/graphics/Paint;

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->y:Landroid/graphics/Paint;

    .line 129
    .line 130
    const v4, -0xb8680d

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->y:Landroid/graphics/Paint;

    .line 137
    .line 138
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->y:Landroid/graphics/Paint;

    .line 142
    .line 143
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->y:Landroid/graphics/Paint;

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->y:Landroid/graphics/Paint;

    .line 152
    .line 153
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 154
    .line 155
    .line 156
    sget-object v0, Lna/i;->a:Lna/i;

    .line 157
    .line 158
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    .line 159
    .line 160
    new-instance v2, Lcom/zykj/blackboard/core/action/SelectAction$1;

    .line 161
    .line 162
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/action/SelectAction$1;-><init>(Lcom/zykj/blackboard/core/action/SelectAction;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1, v2}, Lna/i;->c(Lcom/zykj/blackboard/utils/EventKey;Lhd/a;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :array_0
    .array-data 4
        0x41f00000    # 30.0f
        0x41700000    # 15.0f
    .end array-data
.end method

.method public static final synthetic I(Lcom/zykj/blackboard/core/action/SelectAction;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-void
.end method

.method private final v(FF)Landroid/graphics/PointF;
    .locals 2

    .line 1
    sget-object v0, Lna/o;->a:Lna/o;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method


# virtual methods
.method public E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 8
    .line 9
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Lv9/c;->g()V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Lv9/c;->e()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "SelectAction"

    .line 15
    .line 16
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Down: X---> "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v2, ", Y---> "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->r:Z

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->v(FF)Landroid/graphics/PointF;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 71
    .line 72
    iput v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 73
    .line 74
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 75
    .line 76
    iput p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 77
    .line 78
    new-instance p1, Landroid/graphics/PointF;

    .line 79
    .line 80
    iget v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 81
    .line 82
    iget v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 83
    .line 84
    invoke-direct {p1, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->T(Landroid/graphics/PointF;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->t:Z

    .line 92
    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-eqz p1, :cond_0

    .line 100
    .line 101
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-interface {p1, v0}, Lv9/c;->x(Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    iput-wide v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->q:J

    .line 111
    .line 112
    return-void

    .line 113
    :cond_1
    const/4 p1, 0x0

    .line 114
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_2

    .line 121
    .line 122
    invoke-interface {p1}, Lv9/c;->e()V

    .line 123
    .line 124
    .line 125
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public G(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 11

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "Move: X---> "

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, ", Y---> "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/action/SelectAction;->U(FF)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x1

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    iput-boolean v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->r:Z

    .line 58
    .line 59
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->t:Z

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v1, "currentTranslationType: "

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->A:I

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "currentTranslationType"

    .line 83
    .line 84
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    iget v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->A:I

    .line 88
    .line 89
    sget-object v1, Lcom/zykj/blackboard/enums/TranslationType;->d:Lcom/zykj/blackboard/enums/TranslationType;

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-ne v0, v1, :cond_1

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->P(FF)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    sget-object v1, Lcom/zykj/blackboard/enums/TranslationType;->g:Lcom/zykj/blackboard/enums/TranslationType;

    .line 110
    .line 111
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-ne v0, v1, :cond_2

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->Q(FF)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    sget-object v1, Lcom/zykj/blackboard/enums/TranslationType;->f:Lcom/zykj/blackboard/enums/TranslationType;

    .line 130
    .line 131
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-ne v0, v1, :cond_3

    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->S(FF)V

    .line 146
    .line 147
    .line 148
    :cond_3
    :goto_0
    new-instance p1, Landroid/graphics/Matrix;

    .line 149
    .line 150
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->B:Landroid/graphics/Matrix;

    .line 168
    .line 169
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v0}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_4

    .line 195
    .line 196
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-interface {v0, v1, p1}, Lv9/c;->k(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 199
    .line 200
    .line 201
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 202
    .line 203
    .line 204
    move-result-wide v0

    .line 205
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->p:Ljava/util/List;

    .line 206
    .line 207
    invoke-static {p1, v0, v1}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    iput-wide v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->q:J

    .line 215
    .line 216
    return-void

    .line 217
    :cond_5
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->w:Landroid/graphics/Path;

    .line 218
    .line 219
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-eqz v0, :cond_6

    .line 227
    .line 228
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    if-eqz v0, :cond_6

    .line 233
    .line 234
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    const/4 v3, 0x2

    .line 243
    new-array v3, v3, [F

    .line 244
    .line 245
    const/4 v4, 0x0

    .line 246
    aput v2, v3, v4

    .line 247
    .line 248
    aput p1, v3, v1

    .line 249
    .line 250
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 251
    .line 252
    .line 253
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/SelectAction;->w:Landroid/graphics/Path;

    .line 254
    .line 255
    iget v6, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 256
    .line 257
    iget v7, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 258
    .line 259
    aget v8, v3, v4

    .line 260
    .line 261
    aget v9, v3, v1

    .line 262
    .line 263
    sget-object v10, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 264
    .line 265
    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 266
    .line 267
    .line 268
    :cond_6
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->w:Landroid/graphics/Path;

    .line 269
    .line 270
    invoke-virtual {p1}, Landroid/graphics/Path;->close()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    if-eqz p1, :cond_7

    .line 278
    .line 279
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->w:Landroid/graphics/Path;

    .line 280
    .line 281
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->x:Landroid/graphics/Paint;

    .line 282
    .line 283
    const/4 v2, 0x0

    .line 284
    invoke-interface {p1, v0, v1, v2}, Lv9/c;->B(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 285
    .line 286
    .line 287
    :cond_7
    return-void
.end method

.method public H(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 7

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "  Up: X---> "

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, ", Y---> "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->t:Z

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_10

    .line 46
    .line 47
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->r:Z

    .line 48
    .line 49
    if-nez v0, :cond_9

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-interface {v0, v2, v1}, Lv9/c;->z(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    iget v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->A:I

    .line 63
    .line 64
    sget-object v2, Lcom/zykj/blackboard/enums/TranslationType;->e:Lcom/zykj/blackboard/enums/TranslationType;

    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ne v0, v2, :cond_5

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-interface {p1, v0}, Lv9/c;->p(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    invoke-interface {p1}, Lv9/c;->e()V

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    invoke-interface {p1, v0, v2, v3}, Lr9/b;->o(Ljava/util/List;J)V

    .line 105
    .line 106
    .line 107
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    invoke-interface {p1}, Lr9/b;->l()V

    .line 114
    .line 115
    .line 116
    :cond_4
    iput-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 117
    .line 118
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->M(FF)Lba/c;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-eqz p1, :cond_f

    .line 142
    .line 143
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    if-eqz v1, :cond_6

    .line 161
    .line 162
    invoke-virtual {v1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    if-nez v1, :cond_7

    .line 167
    .line 168
    :cond_6
    new-instance v1, Landroid/graphics/Matrix;

    .line 169
    .line 170
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 171
    .line 172
    .line 173
    :cond_7
    invoke-interface {p1, v1}, Lba/c;->j(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    if-eqz p1, :cond_8

    .line 185
    .line 186
    invoke-interface {p1}, Lv9/c;->e()V

    .line 187
    .line 188
    .line 189
    :cond_8
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->R(Ljava/util/List;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_9
    iget v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->A:I

    .line 196
    .line 197
    sget-object v1, Lcom/zykj/blackboard/enums/TranslationType;->d:Lcom/zykj/blackboard/enums/TranslationType;

    .line 198
    .line 199
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-ne v0, v1, :cond_a

    .line 204
    .line 205
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->P(FF)V

    .line 214
    .line 215
    .line 216
    goto :goto_0

    .line 217
    :cond_a
    sget-object v1, Lcom/zykj/blackboard/enums/TranslationType;->g:Lcom/zykj/blackboard/enums/TranslationType;

    .line 218
    .line 219
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-ne v0, v1, :cond_b

    .line 224
    .line 225
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->Q(FF)V

    .line 234
    .line 235
    .line 236
    goto :goto_0

    .line 237
    :cond_b
    sget-object v1, Lcom/zykj/blackboard/enums/TranslationType;->f:Lcom/zykj/blackboard/enums/TranslationType;

    .line 238
    .line 239
    invoke-virtual {v1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-ne v0, v1, :cond_c

    .line 244
    .line 245
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->S(FF)V

    .line 254
    .line 255
    .line 256
    :cond_c
    :goto_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 257
    .line 258
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->B:Landroid/graphics/Matrix;

    .line 259
    .line 260
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 261
    .line 262
    .line 263
    new-instance p1, Landroid/graphics/Matrix;

    .line 264
    .line 265
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 280
    .line 281
    .line 282
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->B:Landroid/graphics/Matrix;

    .line 283
    .line 284
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-static {v0}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 303
    .line 304
    .line 305
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-eqz v0, :cond_d

    .line 310
    .line 311
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-interface {v0, v1, p1}, Lv9/c;->z(Ljava/util/List;Landroid/graphics/Matrix;)V

    .line 314
    .line 315
    .line 316
    :cond_d
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-eqz v0, :cond_e

    .line 321
    .line 322
    invoke-interface {v0}, Lr9/b;->l()V

    .line 323
    .line 324
    .line 325
    :cond_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 326
    .line 327
    .line 328
    move-result-wide v0

    .line 329
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->p:Ljava/util/List;

    .line 330
    .line 331
    invoke-static {p1, v0, v1}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    iput-wide v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->q:J

    .line 339
    .line 340
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    if-eqz p1, :cond_f

    .line 345
    .line 346
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 347
    .line 348
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->p:Ljava/util/List;

    .line 349
    .line 350
    invoke-interface {p1, v0, v1}, Lr9/b;->c(Ljava/util/List;Ljava/util/List;)V

    .line 351
    .line 352
    .line 353
    :cond_f
    return-void

    .line 354
    :cond_10
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 355
    .line 356
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 357
    .line 358
    .line 359
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->r:Z

    .line 360
    .line 361
    const/4 v2, -0x1

    .line 362
    const/4 v3, 0x1

    .line 363
    if-nez v0, :cond_16

    .line 364
    .line 365
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-eqz v0, :cond_11

    .line 370
    .line 371
    invoke-interface {v0}, Lv9/c;->n()Lba/c;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    if-eqz v0, :cond_11

    .line 376
    .line 377
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    :cond_11
    move-object v0, v1

    .line 382
    check-cast v0, Ljava/util/Collection;

    .line 383
    .line 384
    if-eqz v0, :cond_1b

    .line 385
    .line 386
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-eqz v0, :cond_12

    .line 391
    .line 392
    goto/16 :goto_3

    .line 393
    .line 394
    :cond_12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    sub-int/2addr v0, v3

    .line 399
    :goto_1
    if-ge v2, v0, :cond_1b

    .line 400
    .line 401
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    check-cast v3, Lba/c;

    .line 406
    .line 407
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    const/4 v6, 0x0

    .line 416
    invoke-interface {v3, v4, v5, v6}, Lba/c;->isInRect(FFF)Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-eqz v3, :cond_15

    .line 421
    .line 422
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 423
    .line 424
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 432
    .line 433
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    check-cast v0, Lba/c;

    .line 438
    .line 439
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    if-eqz v1, :cond_13

    .line 444
    .line 445
    invoke-virtual {v1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    if-nez v1, :cond_14

    .line 450
    .line 451
    :cond_13
    new-instance v1, Landroid/graphics/Matrix;

    .line 452
    .line 453
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 454
    .line 455
    .line 456
    :cond_14
    invoke-interface {v0, v1}, Lba/c;->j(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    goto/16 :goto_3

    .line 464
    .line 465
    :cond_15
    add-int/lit8 v0, v0, -0x1

    .line 466
    .line 467
    goto :goto_1

    .line 468
    :cond_16
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 473
    .line 474
    .line 475
    move-result p1

    .line 476
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->v(FF)Landroid/graphics/PointF;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    iget v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 481
    .line 482
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 483
    .line 484
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    iget v4, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 489
    .line 490
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 491
    .line 492
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    iget v5, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 497
    .line 498
    iget v6, p1, Landroid/graphics/PointF;->x:F

    .line 499
    .line 500
    invoke-static {v5, v6}, Ljava/lang/Math;->max(FF)F

    .line 501
    .line 502
    .line 503
    move-result v5

    .line 504
    iget v6, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 505
    .line 506
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 507
    .line 508
    invoke-static {v6, p1}, Ljava/lang/Math;->max(FF)F

    .line 509
    .line 510
    .line 511
    move-result p1

    .line 512
    new-instance v6, Landroid/graphics/RectF;

    .line 513
    .line 514
    invoke-direct {v6, v0, v4, v5, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    if-eqz p1, :cond_17

    .line 522
    .line 523
    invoke-interface {p1}, Lv9/c;->n()Lba/c;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    if-eqz p1, :cond_17

    .line 528
    .line 529
    invoke-interface {p1}, Lba/c;->f()Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    :cond_17
    if-eqz v1, :cond_1b

    .line 534
    .line 535
    move-object p1, v1

    .line 536
    check-cast p1, Ljava/util/Collection;

    .line 537
    .line 538
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 539
    .line 540
    .line 541
    move-result p1

    .line 542
    xor-int/2addr p1, v3

    .line 543
    if-ne p1, v3, :cond_1b

    .line 544
    .line 545
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 546
    .line 547
    .line 548
    move-result p1

    .line 549
    sub-int/2addr p1, v3

    .line 550
    :goto_2
    if-ge v2, p1, :cond_1b

    .line 551
    .line 552
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    check-cast v0, Lba/c;

    .line 557
    .line 558
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    if-eqz v3, :cond_18

    .line 563
    .line 564
    invoke-virtual {v3}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    if-nez v3, :cond_19

    .line 569
    .line 570
    :cond_18
    new-instance v3, Landroid/graphics/Matrix;

    .line 571
    .line 572
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 573
    .line 574
    .line 575
    :cond_19
    invoke-interface {v0, v3}, Lba/c;->j(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v6, v0}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    .line 580
    .line 581
    .line 582
    move-result v3

    .line 583
    if-eqz v3, :cond_1a

    .line 584
    .line 585
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 586
    .line 587
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 595
    .line 596
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    :cond_1a
    add-int/lit8 p1, p1, -0x1

    .line 600
    .line 601
    goto :goto_2

    .line 602
    :cond_1b
    :goto_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 603
    .line 604
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->R(Ljava/util/List;)V

    .line 605
    .line 606
    .line 607
    return-void
.end method

.method public final J(FF)F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v1, p1, v0

    .line 3
    .line 4
    if-lez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-wide v1, 0x4066800000000000L    # 180.0

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    double-to-float v1, v1

    .line 18
    :goto_0
    cmpl-float v0, p2, v0

    .line 19
    .line 20
    if-lez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, -0x1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    :goto_1
    div-float/2addr p2, p1

    .line 26
    float-to-double p1, p2

    .line 27
    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    double-to-float p1, p1

    .line 32
    int-to-float p2, v0

    .line 33
    mul-float/2addr v1, p2

    .line 34
    add-float/2addr v1, p1

    .line 35
    return v1
.end method

.method public final K(FFFFFFFF)F
    .locals 0

    .line 1
    sub-float/2addr p3, p1

    .line 2
    sub-float/2addr p4, p2

    .line 3
    invoke-virtual {p0, p3, p4}, Lcom/zykj/blackboard/core/action/SelectAction;->J(FF)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sub-float/2addr p7, p5

    .line 8
    sub-float/2addr p8, p6

    .line 9
    invoke-virtual {p0, p7, p8}, Lcom/zykj/blackboard/core/action/SelectAction;->J(FF)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    sub-float/2addr p1, p2

    .line 14
    mul-float/2addr p7, p7

    .line 15
    mul-float/2addr p8, p8

    .line 16
    add-float/2addr p7, p8

    .line 17
    float-to-double p2, p7

    .line 18
    invoke-static {p2, p3}, Ljava/lang/Math;->sqrt(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    double-to-float p2, p2

    .line 23
    float-to-double p3, p1

    .line 24
    invoke-static {p3, p4}, Ljava/lang/Math;->cos(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p3

    .line 28
    double-to-float p1, p3

    .line 29
    mul-float/2addr p1, p2

    .line 30
    return p1
.end method

.method public final L(Landroid/graphics/RectF;Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/graphics/RectF;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p2, p1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final M(FF)Lba/c;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lv9/c;->n()Lba/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    :goto_0
    move-object v2, v0

    .line 21
    check-cast v2, Ljava/util/Collection;

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/lit8 v2, v2, -0x1

    .line 37
    .line 38
    :goto_1
    const/4 v3, -0x1

    .line 39
    if-ge v3, v2, :cond_3

    .line 40
    .line 41
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lba/c;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-interface {v3, p1, p2, v4}, Lba/c;->isInRect(FFF)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lba/c;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_2
    return-object v1
.end method

.method public final N()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->E:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->F:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P(FF)V
    .locals 3

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/SelectAction;->v(FF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object p2, Lna/o;->a:Lna/o;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-virtual {p2, v0, v1, v2}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 32
    .line 33
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    sub-float/2addr v0, v1

    .line 36
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 37
    .line 38
    iget v1, p2, Landroid/graphics/PointF;->y:F

    .line 39
    .line 40
    sub-float/2addr p1, v1

    .line 41
    invoke-virtual {p0, v0, p1}, Lcom/zykj/blackboard/core/action/SelectAction;->J(FF)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 46
    .line 47
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 48
    .line 49
    sub-float/2addr v0, v1

    .line 50
    iget v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 51
    .line 52
    iget v2, p2, Landroid/graphics/PointF;->y:F

    .line 53
    .line 54
    sub-float/2addr v1, v2

    .line 55
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/action/SelectAction;->J(FF)F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    sub-float/2addr p1, v0

    .line 60
    float-to-double v0, p1

    .line 61
    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    double-to-float p1, v0

    .line 66
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->B:Landroid/graphics/Matrix;

    .line 67
    .line 68
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 69
    .line 70
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 71
    .line 72
    invoke-virtual {v0, p1, v1, p2}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final Q(FF)V
    .locals 10

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/SelectAction;->v(FF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object p2, Lna/o;->a:Lna/o;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 26
    .line 27
    invoke-virtual {p2, v0, v1, v2}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 37
    .line 38
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 39
    .line 40
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 44
    .line 45
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 46
    .line 47
    invoke-virtual {p2, v1, v2, v3}, Lna/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 52
    .line 53
    iget v3, v0, Landroid/graphics/PointF;->y:F

    .line 54
    .line 55
    iget v4, p2, Landroid/graphics/PointF;->x:F

    .line 56
    .line 57
    iget v5, p2, Landroid/graphics/PointF;->y:F

    .line 58
    .line 59
    iget v6, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 60
    .line 61
    iget v7, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 62
    .line 63
    iget v8, p1, Landroid/graphics/PointF;->x:F

    .line 64
    .line 65
    iget v9, p1, Landroid/graphics/PointF;->y:F

    .line 66
    .line 67
    move-object v1, p0

    .line 68
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/blackboard/core/action/SelectAction;->K(FFFFFFFF)F

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 73
    .line 74
    iget v3, p2, Landroid/graphics/PointF;->x:F

    .line 75
    .line 76
    sub-float/2addr v2, v3

    .line 77
    float-to-double v2, v2

    .line 78
    const/4 v4, 0x2

    .line 79
    int-to-double v5, v4

    .line 80
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    double-to-float v2, v2

    .line 85
    iget v3, v0, Landroid/graphics/PointF;->y:F

    .line 86
    .line 87
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 88
    .line 89
    sub-float/2addr v3, p2

    .line 90
    float-to-double v7, v3

    .line 91
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    double-to-float p2, v7

    .line 96
    add-float/2addr v2, p2

    .line 97
    float-to-double v2, v2

    .line 98
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    double-to-float p2, v2

    .line 103
    iget v2, v1, Lcom/zykj/blackboard/core/action/SelectAction;->z:F

    .line 104
    .line 105
    const/16 v3, 0xa

    .line 106
    .line 107
    int-to-float v3, v3

    .line 108
    add-float/2addr v2, v3

    .line 109
    float-to-double v2, v2

    .line 110
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 111
    .line 112
    .line 113
    move-result-wide v2

    .line 114
    double-to-float v2, v2

    .line 115
    int-to-float v3, v4

    .line 116
    mul-float/2addr v2, v3

    .line 117
    float-to-double v2, v2

    .line 118
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 119
    .line 120
    .line 121
    move-result-wide v2

    .line 122
    double-to-float v2, v2

    .line 123
    add-float/2addr p1, p2

    .line 124
    cmpl-float v2, p1, v2

    .line 125
    .line 126
    if-lez v2, :cond_0

    .line 127
    .line 128
    div-float/2addr p1, p2

    .line 129
    iget-object p2, v1, Lcom/zykj/blackboard/core/action/SelectAction;->B:Landroid/graphics/Matrix;

    .line 130
    .line 131
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 132
    .line 133
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 134
    .line 135
    invoke-virtual {p2, p1, p1, v2, v0}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 136
    .line 137
    .line 138
    :cond_0
    return-void
.end method

.method public final R(Ljava/util/List;)V
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-virtual {p0, v1, v0}, Lcom/zykj/blackboard/core/action/SelectAction;->L(Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    iget p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->z:F

    .line 35
    .line 36
    const/16 v1, 0xa

    .line 37
    .line 38
    int-to-float v1, v1

    .line 39
    add-float/2addr p1, v1

    .line 40
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    sub-float/2addr p1, v2

    .line 45
    iget v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->z:F

    .line 46
    .line 47
    add-float/2addr v2, v1

    .line 48
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    sub-float/2addr v2, v1

    .line 53
    const/4 v1, 0x0

    .line 54
    cmpl-float v3, p1, v1

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    if-lez v3, :cond_1

    .line 58
    .line 59
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 60
    .line 61
    int-to-float v5, v4

    .line 62
    div-float/2addr p1, v5

    .line 63
    sub-float/2addr v3, p1

    .line 64
    iput v3, v0, Landroid/graphics/RectF;->left:F

    .line 65
    .line 66
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 67
    .line 68
    add-float/2addr v3, p1

    .line 69
    iput v3, v0, Landroid/graphics/RectF;->right:F

    .line 70
    .line 71
    :cond_1
    cmpl-float p1, v2, v1

    .line 72
    .line 73
    if-lez p1, :cond_2

    .line 74
    .line 75
    iget p1, v0, Landroid/graphics/RectF;->top:F

    .line 76
    .line 77
    int-to-float v1, v4

    .line 78
    div-float/2addr v2, v1

    .line 79
    sub-float/2addr p1, v2

    .line 80
    iput p1, v0, Landroid/graphics/RectF;->top:F

    .line 81
    .line 82
    iget p1, v0, Landroid/graphics/RectF;->bottom:F

    .line 83
    .line 84
    add-float/2addr p1, v2

    .line 85
    iput p1, v0, Landroid/graphics/RectF;->bottom:F

    .line 86
    .line 87
    :cond_2
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 96
    .line 97
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/SelectAction;->B:Landroid/graphics/Matrix;

    .line 101
    .line 102
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/SelectAction;->y:Landroid/graphics/Paint;

    .line 103
    .line 104
    iget v5, p0, Lcom/zykj/blackboard/core/action/SelectAction;->z:F

    .line 105
    .line 106
    const/4 v6, 0x1

    .line 107
    invoke-interface/range {v1 .. v6}, Lv9/c;->y(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/Paint;FZ)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_3
    const/4 p1, 0x0

    .line 112
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    invoke-interface {p1}, Lv9/c;->e()V

    .line 121
    .line 122
    .line 123
    :cond_4
    return-void
.end method

.method public final S(FF)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/SelectAction;->v(FF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->B:Landroid/graphics/Matrix;

    .line 6
    .line 7
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 8
    .line 9
    iget v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 10
    .line 11
    sub-float/2addr v0, v1

    .line 12
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 13
    .line 14
    iget v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 15
    .line 16
    sub-float/2addr p1, v1

    .line 17
    invoke-virtual {p2, v0, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final T(Landroid/graphics/PointF;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->z:F

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    int-to-float v2, v2

    .line 11
    div-float/2addr v0, v2

    .line 12
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 13
    .line 14
    const/high16 v3, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    div-float/2addr v0, v2

    .line 21
    new-instance v2, Landroid/graphics/RectF;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget v3, v3, Landroid/graphics/RectF;->left:F

    .line 29
    .line 30
    sub-float/2addr v3, v0

    .line 31
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget v4, v4, Landroid/graphics/RectF;->top:F

    .line 37
    .line 38
    sub-float/2addr v4, v0

    .line 39
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 40
    .line 41
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget v5, v5, Landroid/graphics/RectF;->left:F

    .line 45
    .line 46
    add-float/2addr v5, v0

    .line 47
    iget-object v6, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 48
    .line 49
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    add-float/2addr v6, v0

    .line 55
    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 56
    .line 57
    .line 58
    new-instance v3, Landroid/graphics/RectF;

    .line 59
    .line 60
    iget-object v4, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 61
    .line 62
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget v4, v4, Landroid/graphics/RectF;->right:F

    .line 66
    .line 67
    sub-float/2addr v4, v0

    .line 68
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 69
    .line 70
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget v5, v5, Landroid/graphics/RectF;->top:F

    .line 74
    .line 75
    sub-float/2addr v5, v0

    .line 76
    iget-object v6, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 77
    .line 78
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget v6, v6, Landroid/graphics/RectF;->right:F

    .line 82
    .line 83
    add-float/2addr v6, v0

    .line 84
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 85
    .line 86
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget v7, v7, Landroid/graphics/RectF;->top:F

    .line 90
    .line 91
    add-float/2addr v7, v0

    .line 92
    invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 93
    .line 94
    .line 95
    new-instance v4, Landroid/graphics/RectF;

    .line 96
    .line 97
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 98
    .line 99
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget v5, v5, Landroid/graphics/RectF;->right:F

    .line 103
    .line 104
    sub-float/2addr v5, v0

    .line 105
    iget-object v6, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 106
    .line 107
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget v6, v6, Landroid/graphics/RectF;->bottom:F

    .line 111
    .line 112
    sub-float/2addr v6, v0

    .line 113
    iget-object v7, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 114
    .line 115
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget v7, v7, Landroid/graphics/RectF;->right:F

    .line 119
    .line 120
    add-float/2addr v7, v0

    .line 121
    iget-object v8, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 122
    .line 123
    invoke-static {v8}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    .line 127
    .line 128
    add-float/2addr v8, v0

    .line 129
    invoke-direct {v4, v5, v6, v7, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lna/o;->a:Lna/o;

    .line 133
    .line 134
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 135
    .line 136
    invoke-virtual {v0, v2, v5, p1}, Lna/o;->c(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    const/4 v5, 0x1

    .line 141
    if-eqz v2, :cond_1

    .line 142
    .line 143
    sget-object p1, Lcom/zykj/blackboard/enums/TranslationType;->d:Lcom/zykj/blackboard/enums/TranslationType;

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    iput p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->A:I

    .line 150
    .line 151
    return v5

    .line 152
    :cond_1
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 153
    .line 154
    invoke-virtual {v0, v3, v2, p1}, Lna/o;->c(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_2

    .line 159
    .line 160
    sget-object p1, Lcom/zykj/blackboard/enums/TranslationType;->e:Lcom/zykj/blackboard/enums/TranslationType;

    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    iput p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->A:I

    .line 167
    .line 168
    return v5

    .line 169
    :cond_2
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 170
    .line 171
    invoke-virtual {v0, v4, v2, p1}, Lna/o;->c(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_3

    .line 176
    .line 177
    sget-object p1, Lcom/zykj/blackboard/enums/TranslationType;->g:Lcom/zykj/blackboard/enums/TranslationType;

    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    iput p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->A:I

    .line 184
    .line 185
    return v5

    .line 186
    :cond_3
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->D:Landroid/graphics/RectF;

    .line 187
    .line 188
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/SelectAction;->C:Landroid/graphics/Matrix;

    .line 192
    .line 193
    invoke-virtual {v0, v2, v3, p1}, Lna/o;->c(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-eqz p1, :cond_4

    .line 198
    .line 199
    sget-object p1, Lcom/zykj/blackboard/enums/TranslationType;->f:Lcom/zykj/blackboard/enums/TranslationType;

    .line 200
    .line 201
    invoke-virtual {p1}, Lcom/zykj/blackboard/enums/TranslationType;->c()I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    iput p1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->A:I

    .line 206
    .line 207
    return v5

    .line 208
    :cond_4
    return v1
.end method

.method public final U(FF)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/SelectAction;->v(FF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 6
    .line 7
    iget v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 8
    .line 9
    sub-float/2addr p2, v0

    .line 10
    float-to-double v0, p2

    .line 11
    const/4 p2, 0x2

    .line 12
    int-to-double v2, p2

    .line 13
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    double-to-float p2, v0

    .line 18
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 19
    .line 20
    iget v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 21
    .line 22
    sub-float/2addr p1, v0

    .line 23
    float-to-double v0, p1

    .line 24
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    double-to-float p1, v0

    .line 29
    add-float/2addr p2, p1

    .line 30
    float-to-double p1, p2

    .line 31
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    double-to-float p1, p1

    .line 36
    iget p2, p0, Lcom/zykj/blackboard/core/action/SelectAction;->s:F

    .line 37
    .line 38
    cmpl-float p1, p1, p2

    .line 39
    .line 40
    if-lez p1, :cond_0

    .line 41
    .line 42
    const/4 p1, 0x1

    .line 43
    return p1

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    return p1
.end method

.method public V()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->x:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-interface {v0}, Lv9/c;->c()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const v3, -0x333334

    .line 14
    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/high16 v2, -0x1000000

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v3

    .line 22
    :goto_0
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/SelectAction;->y:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-interface {v0}, Lv9/c;->c()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    const v3, -0xb8680d

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->B:Landroid/graphics/Matrix;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->w:Landroid/graphics/Path;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->p:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    iput v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->u:F

    .line 56
    .line 57
    iput v0, p0, Lcom/zykj/blackboard/core/action/SelectAction;->v:F

    .line 58
    .line 59
    return-void
.end method

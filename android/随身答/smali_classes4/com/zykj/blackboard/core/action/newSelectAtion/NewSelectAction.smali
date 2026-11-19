.class public final Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;
.super Lcom/zykj/blackboard/core/action/b;
.source "SourceFile"


# instance fields
.field public A:Ljava/util/ArrayList;

.field public B:Z

.field public final p:I

.field public q:J

.field public r:F

.field public s:F

.field public t:Z

.field public final u:F

.field public v:Z

.field public w:F

.field public x:F

.field public y:Ly4/d;

.field public z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/b;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1f4

    .line 5
    .line 6
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->p:I

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->t:Z

    .line 10
    .line 11
    const/high16 v1, 0x41a00000    # 20.0f

    .line 12
    .line 13
    iput v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->u:F

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v:Z

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 30
    .line 31
    sget-object v0, Lu5/i;->a:Lu5/i;

    .line 32
    .line 33
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->a:Lcom/zykj/blackboard/utils/EventKey;

    .line 34
    .line 35
    new-instance v2, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;

    .line 36
    .line 37
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction$1;-><init>(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Lu5/i;->c(Lcom/zykj/blackboard/utils/EventKey;Lkotlin/jvm/functions/Function0;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static final synthetic I(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Ly4/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method private final N(Landroid/graphics/RectF;Landroid/graphics/RectF;)V
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

.method private final S(FF)Z
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v(FF)Landroid/graphics/PointF;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget p2, p1, Landroid/graphics/PointF;->x:F

    .line 6
    .line 7
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->w:F

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
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->x:F

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
    iget p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->u:F

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

.method private final v(FF)Landroid/graphics/PointF;
    .locals 2

    .line 1
    sget-object v0, Lu5/o;->a:Lu5/o;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lz4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lu5/o;->d(FFLandroid/graphics/Matrix;)Landroid/graphics/PointF;

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "functionManager"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    invoke-virtual {p1}, Ly4/d;->j()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()La5/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, La5/c;->e()V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()La5/c;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-interface {p1}, La5/c;->d()V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    const-string v2, "Down: X---> "

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
    const/4 v0, 0x1

    .line 43
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->t:Z

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v(FF)Landroid/graphics/PointF;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 58
    .line 59
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->w:F

    .line 60
    .line 61
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 62
    .line 63
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->x:F

    .line 64
    .line 65
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    const-string v1, "functionManager"

    .line 69
    .line 70
    if-nez p1, :cond_0

    .line 71
    .line 72
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    move-object p1, v0

    .line 76
    :cond_0
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->w:F

    .line 77
    .line 78
    iget v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->x:F

    .line 79
    .line 80
    invoke-virtual {p1, v2, v3}, Ly4/d;->k(FF)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 84
    .line 85
    if-nez p1, :cond_1

    .line 86
    .line 87
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    move-object p1, v0

    .line 91
    :cond_1
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->w:F

    .line 92
    .line 93
    iget v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->x:F

    .line 94
    .line 95
    invoke-virtual {p1, v2, v3}, Ly4/d;->i(FF)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v:Z

    .line 100
    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 104
    .line 105
    if-nez p1, :cond_2

    .line 106
    .line 107
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    move-object v0, p1

    .line 112
    :goto_0
    invoke-virtual {v0}, Ly4/d;->h()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 117
    .line 118
    if-nez p1, :cond_4

    .line 119
    .line 120
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    move-object v0, p1

    .line 125
    :goto_1
    invoke-virtual {v0}, Ly4/d;->j()V

    .line 126
    .line 127
    .line 128
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
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->S(FF)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    iput-boolean v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->t:Z

    .line 58
    .line 59
    :cond_0
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v:Z

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->t:Z

    .line 65
    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v(FF)Landroid/graphics/PointF;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->B:Z

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    const-string v3, "functionManager"

    .line 84
    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 88
    .line 89
    if-nez v0, :cond_1

    .line 90
    .line 91
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    move-object v0, v1

    .line 95
    :cond_1
    iget v4, p1, Landroid/graphics/PointF;->x:F

    .line 96
    .line 97
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 98
    .line 99
    invoke-virtual {v0, v4, v5}, Ly4/d;->d(FF)V

    .line 100
    .line 101
    .line 102
    iput-boolean v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->B:Z

    .line 103
    .line 104
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 105
    .line 106
    if-nez v0, :cond_3

    .line 107
    .line 108
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    move-object v1, v0

    .line 113
    :goto_0
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 114
    .line 115
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 116
    .line 117
    invoke-virtual {v1, v0, p1}, Ly4/d;->e(FF)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lz4/a;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    invoke-virtual {v0}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_5

    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    const/4 v4, 0x2

    .line 142
    new-array v4, v4, [F

    .line 143
    .line 144
    aput v3, v4, v1

    .line 145
    .line 146
    aput p1, v4, v2

    .line 147
    .line 148
    invoke-virtual {v0, v4}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()La5/c;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-eqz p1, :cond_5

    .line 156
    .line 157
    iget v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->w:F

    .line 158
    .line 159
    iget v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->x:F

    .line 160
    .line 161
    aget v1, v4, v1

    .line 162
    .line 163
    aget v2, v4, v2

    .line 164
    .line 165
    invoke-interface {p1, v0, v3, v1, v2}, La5/c;->F(FFFF)V

    .line 166
    .line 167
    .line 168
    :cond_5
    return-void
.end method

.method public H(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 6

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v:Z

    .line 43
    .line 44
    if-eqz v0, :cond_6

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v(FF)Landroid/graphics/PointF;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-boolean v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->t:Z

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    const-string v3, "functionManager"

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 66
    .line 67
    iget v4, v0, Landroid/graphics/PointF;->y:F

    .line 68
    .line 69
    invoke-virtual {p0, v1, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->R(FF)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 76
    .line 77
    if-nez v1, :cond_0

    .line 78
    .line 79
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    move-object v1, v2

    .line 83
    :cond_0
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 84
    .line 85
    iget v5, v0, Landroid/graphics/PointF;->y:F

    .line 86
    .line 87
    invoke-virtual {v1, v4, v5}, Ly4/d;->b(FF)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_8

    .line 92
    .line 93
    :cond_1
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 94
    .line 95
    if-nez v1, :cond_2

    .line 96
    .line 97
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    move-object v1, v2

    .line 101
    :cond_2
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 102
    .line 103
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 104
    .line 105
    invoke-virtual {v1, v4, v0}, Ly4/d;->a(FF)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_8

    .line 110
    .line 111
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 112
    .line 113
    if-nez v0, :cond_3

    .line 114
    .line 115
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    move-object v2, v0

    .line 120
    :goto_0
    invoke-virtual {v2}, Ly4/d;->j()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->O(FF)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 135
    .line 136
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->Q(Ljava/util/List;Ljava/util/List;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_4
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 143
    .line 144
    if-nez v1, :cond_5

    .line 145
    .line 146
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_5
    move-object v2, v1

    .line 151
    :goto_1
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 152
    .line 153
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 154
    .line 155
    invoke-virtual {v2, v1, v0}, Ly4/d;->c(FF)V

    .line 156
    .line 157
    .line 158
    const/4 v0, 0x0

    .line 159
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->B:Z

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_6
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->t:Z

    .line 163
    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->O(FF)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v(FF)Landroid/graphics/PointF;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->w:F

    .line 191
    .line 192
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 193
    .line 194
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->x:F

    .line 199
    .line 200
    iget v3, v0, Landroid/graphics/PointF;->y:F

    .line 201
    .line 202
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    iget v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->w:F

    .line 207
    .line 208
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 209
    .line 210
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    iget v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->x:F

    .line 215
    .line 216
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 217
    .line 218
    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    new-instance v4, Landroid/graphics/RectF;

    .line 223
    .line 224
    invoke-direct {v4, v1, v2, v3, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, v4}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->P(Landroid/graphics/RectF;)V

    .line 228
    .line 229
    .line 230
    :goto_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 231
    .line 232
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->Q(Ljava/util/List;Ljava/util/List;)V

    .line 235
    .line 236
    .line 237
    :cond_8
    :goto_3
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->t:Z

    .line 238
    .line 239
    if-eqz v0, :cond_9

    .line 240
    .line 241
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    invoke-direct {p0, v0, p1}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->v(FF)Landroid/graphics/PointF;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 254
    .line 255
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->r:F

    .line 256
    .line 257
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 258
    .line 259
    iput p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->s:F

    .line 260
    .line 261
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 262
    .line 263
    .line 264
    move-result-wide v0

    .line 265
    iput-wide v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->q:J

    .line 266
    .line 267
    :cond_9
    return-void
.end method

.method public final L(Landroid/graphics/RectF;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lv4/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lv4/b;->J()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/high16 v0, 0x42100000    # 36.0f

    .line 13
    .line 14
    :goto_0
    const/4 v1, 0x2

    .line 15
    int-to-float v1, v1

    .line 16
    mul-float/2addr v0, v1

    .line 17
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    sub-float v2, v0, v2

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    sub-float/2addr v0, v3

    .line 28
    const/4 v3, 0x0

    .line 29
    cmpl-float v4, v2, v3

    .line 30
    .line 31
    if-lez v4, :cond_1

    .line 32
    .line 33
    iget v4, p1, Landroid/graphics/RectF;->left:F

    .line 34
    .line 35
    div-float/2addr v2, v1

    .line 36
    sub-float/2addr v4, v2

    .line 37
    iput v4, p1, Landroid/graphics/RectF;->left:F

    .line 38
    .line 39
    iget v4, p1, Landroid/graphics/RectF;->right:F

    .line 40
    .line 41
    add-float/2addr v4, v2

    .line 42
    iput v4, p1, Landroid/graphics/RectF;->right:F

    .line 43
    .line 44
    :cond_1
    cmpl-float v2, v0, v3

    .line 45
    .line 46
    if-lez v2, :cond_2

    .line 47
    .line 48
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 49
    .line 50
    div-float/2addr v0, v1

    .line 51
    sub-float/2addr v2, v0

    .line 52
    iput v2, p1, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 55
    .line 56
    add-float/2addr v1, v0

    .line 57
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public final M(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 4

    .line 1
    invoke-static {p2}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lv4/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lv4/b;->J()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 v0, 0x42100000    # 36.0f

    .line 17
    .line 18
    :goto_0
    const/4 v1, 0x2

    .line 19
    int-to-float v1, v1

    .line 20
    mul-float/2addr v0, v1

    .line 21
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sub-float/2addr v2, v3

    .line 30
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    sub-float/2addr p2, v0

    .line 39
    const/4 v0, 0x0

    .line 40
    cmpl-float v3, v2, v0

    .line 41
    .line 42
    if-lez v3, :cond_1

    .line 43
    .line 44
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 45
    .line 46
    div-float/2addr v2, v1

    .line 47
    sub-float/2addr v3, v2

    .line 48
    iput v3, p1, Landroid/graphics/RectF;->left:F

    .line 49
    .line 50
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 51
    .line 52
    add-float/2addr v3, v2

    .line 53
    iput v3, p1, Landroid/graphics/RectF;->right:F

    .line 54
    .line 55
    :cond_1
    cmpl-float v0, p2, v0

    .line 56
    .line 57
    if-lez v0, :cond_2

    .line 58
    .line 59
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 60
    .line 61
    div-float/2addr p2, v1

    .line 62
    sub-float/2addr v0, p2

    .line 63
    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 64
    .line 65
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 66
    .line 67
    add-float/2addr v0, p2

    .line 68
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 69
    .line 70
    :cond_2
    return-void
.end method

.method public final O(FF)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lv4/b;

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
    invoke-virtual {v0}, Lv4/b;->K()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()La5/c;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v2}, La5/c;->m()Lg5/c;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v2}, Lg5/c;->e()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    if-eqz v1, :cond_7

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    add-int/lit8 v2, v2, -0x1

    .line 54
    .line 55
    :goto_1
    const/4 v3, -0x1

    .line 56
    if-ge v3, v2, :cond_7

    .line 57
    .line 58
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lg5/c;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-interface {v3, p1, p2, v4}, Lg5/c;->isInRect(FFF)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_6

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-static {v3}, Lq5/a;->a(Lg5/c;)Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lz4/a;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-eqz p2, :cond_4

    .line 96
    .line 97
    invoke-virtual {p2}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    if-nez p2, :cond_5

    .line 102
    .line 103
    :cond_4
    new-instance p2, Landroid/graphics/Matrix;

    .line 104
    .line 105
    invoke-direct {p2}, Landroid/graphics/Matrix;-><init>()V

    .line 106
    .line 107
    .line 108
    :cond_5
    invoke-interface {v3, p2}, Lg5/c;->i(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_6
    :goto_2
    add-int/lit8 v2, v2, -0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_7
    :goto_3
    return-void
.end method

.method public final P(Landroid/graphics/RectF;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lv4/b;

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
    invoke-virtual {v0}, Lv4/b;->L()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()La5/c;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v2}, La5/c;->m()Lg5/c;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v2}, Lg5/c;->e()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_1
    if-eqz v1, :cond_7

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    add-int/lit8 v2, v2, -0x1

    .line 44
    .line 45
    :goto_1
    const/4 v3, -0x1

    .line 46
    if-ge v3, v2, :cond_7

    .line 47
    .line 48
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lg5/c;

    .line 53
    .line 54
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lg5/c;

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lz4/a;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    invoke-virtual {v5}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    if-nez v5, :cond_4

    .line 71
    .line 72
    :cond_3
    new-instance v5, Landroid/graphics/Matrix;

    .line 73
    .line 74
    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-interface {v4, v5}, Lg5/c;->i(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {p1, v4}, Landroid/graphics/RectF;->contains(Landroid/graphics/RectF;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_6

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    invoke-static {v3}, Lq5/a;->a(Lg5/c;)Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-interface {v0, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-nez v5, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    iget-object v5, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :cond_6
    :goto_2
    add-int/lit8 v2, v2, -0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_7
    :goto_3
    return-void
.end method

.method public final Q(Ljava/util/List;Ljava/util/List;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/graphics/RectF;

    .line 21
    .line 22
    invoke-direct {p0, v1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->N(Landroid/graphics/RectF;Landroid/graphics/RectF;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_a

    .line 31
    .line 32
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 33
    .line 34
    const-string v1, "functionManager"

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-nez p2, :cond_1

    .line 38
    .line 39
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    move-object p2, v2

    .line 43
    :cond_1
    invoke-virtual {p2, p1}, Ly4/d;->g(Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    iget-object p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 47
    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object p2, v2

    .line 54
    :cond_2
    invoke-virtual {p2, p1}, Ly4/d;->l(Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    check-cast p2, Lg5/c;

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/4 v3, 0x1

    .line 68
    if-ne p1, v3, :cond_7

    .line 69
    .line 70
    instance-of p1, p2, Lh5/b;

    .line 71
    .line 72
    if-nez p1, :cond_3

    .line 73
    .line 74
    instance-of p1, p2, Lh5/d;

    .line 75
    .line 76
    if-nez p1, :cond_3

    .line 77
    .line 78
    instance-of p1, p2, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 79
    .line 80
    if-eqz p1, :cond_7

    .line 81
    .line 82
    :cond_3
    new-instance p1, Landroid/graphics/RectF;

    .line 83
    .line 84
    invoke-interface {p2}, Lg5/c;->f()Landroid/graphics/RectF;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 89
    .line 90
    .line 91
    new-instance v0, Landroid/graphics/Matrix;

    .line 92
    .line 93
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {p2}, Lg5/c;->b()Landroid/graphics/Matrix;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lz4/a;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    if-eqz v3, :cond_4

    .line 108
    .line 109
    invoke-virtual {v3}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    if-eqz v3, :cond_4

    .line 114
    .line 115
    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 116
    .line 117
    .line 118
    :cond_4
    instance-of v3, p2, Lh5/b;

    .line 119
    .line 120
    if-eqz v3, :cond_5

    .line 121
    .line 122
    check-cast p2, Lh5/b;

    .line 123
    .line 124
    invoke-virtual {p2}, Lh5/b;->H()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    check-cast p2, Landroid/graphics/PointF;

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    move-object p2, v2

    .line 136
    :goto_1
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->M(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V

    .line 137
    .line 138
    .line 139
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 140
    .line 141
    if-nez v3, :cond_6

    .line 142
    .line 143
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    move-object v3, v2

    .line 147
    :cond_6
    invoke-virtual {v3, p1, v0, p2}, Ly4/d;->n(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_7
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->L(Landroid/graphics/RectF;)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 155
    .line 156
    if-nez p1, :cond_8

    .line 157
    .line 158
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    move-object p1, v2

    .line 162
    :cond_8
    invoke-virtual {p1, v0}, Ly4/d;->m(Landroid/graphics/RectF;)V

    .line 163
    .line 164
    .line 165
    :goto_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 166
    .line 167
    if-nez p1, :cond_9

    .line 168
    .line 169
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_9
    move-object v2, p1

    .line 174
    :goto_3
    invoke-virtual {v2}, Ly4/d;->o()V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()La5/c;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-eqz p1, :cond_b

    .line 183
    .line 184
    invoke-interface {p1}, La5/c;->d()V

    .line 185
    .line 186
    .line 187
    :cond_b
    return-void
.end method

.method public final R(FF)Z
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->t:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->r:F

    .line 11
    .line 12
    sub-float/2addr p1, v2

    .line 13
    float-to-double v4, p1

    .line 14
    const/4 p1, 0x2

    .line 15
    int-to-double v6, p1

    .line 16
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    double-to-float p1, v4

    .line 21
    iget v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->s:F

    .line 22
    .line 23
    sub-float/2addr p2, v2

    .line 24
    float-to-double v4, p2

    .line 25
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    double-to-float p2, v4

    .line 30
    add-float/2addr p1, p2

    .line 31
    float-to-double p1, p1

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    double-to-float p1, p1

    .line 37
    iget-wide v4, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->q:J

    .line 38
    .line 39
    sub-long/2addr v0, v4

    .line 40
    iget p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->p:I

    .line 41
    .line 42
    int-to-long v4, p2

    .line 43
    cmp-long p2, v0, v4

    .line 44
    .line 45
    if-gez p2, :cond_0

    .line 46
    .line 47
    iget p2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->u:F

    .line 48
    .line 49
    cmpg-float p1, p1, p2

    .line 50
    .line 51
    if-gez p1, :cond_0

    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    return p1

    .line 55
    :cond_0
    return v3
.end method

.method public final T(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "functionManager"

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    invoke-virtual {v0, p1}, Ly4/d;->f(Landroid/view/MotionEvent;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public U()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->w:F

    .line 3
    .line 4
    iput v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->x:F

    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final V(Ljava/util/List;)V
    .locals 5

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->U()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-string v0, "functionManager"

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move-object v0, v1

    .line 20
    :cond_0
    invoke-virtual {v0}, Ly4/d;->j()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()La5/c;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, La5/c;->m()Lg5/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Lg5/c;->e()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_1
    if-eqz v1, :cond_5

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v2, 0x1

    .line 46
    xor-int/2addr v0, v2

    .line 47
    if-ne v0, v2, :cond_5

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    sub-int/2addr v0, v2

    .line 54
    :goto_0
    const/4 v2, -0x1

    .line 55
    if-ge v2, v0, :cond_5

    .line 56
    .line 57
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    check-cast v2, Lg5/c;

    .line 62
    .line 63
    invoke-interface {v2}, Lg5/c;->getId()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Lg5/c;

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lz4/a;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    invoke-virtual {v4}, Lz4/a;->b()Landroid/graphics/Matrix;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    if-nez v4, :cond_3

    .line 101
    .line 102
    :cond_2
    new-instance v4, Landroid/graphics/Matrix;

    .line 103
    .line 104
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 105
    .line 106
    .line 107
    :cond_3
    invoke-interface {v3, v4}, Lg5/c;->i(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    :cond_4
    add-int/lit8 v0, v0, -0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->z:Ljava/util/ArrayList;

    .line 118
    .line 119
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->A:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->Q(Ljava/util/List;Ljava/util/List;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public k(Lw4/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->k(Lw4/b;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ly4/d;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ly4/d;-><init>(Lw4/b;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;->y:Ly4/d;

    .line 15
    .line 16
    return-void
.end method

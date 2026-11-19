.class public final Lcom/zykj/blackboard/core/action/EraseWritingAction;
.super Lcom/zykj/blackboard/core/action/b;
.source "SourceFile"


# instance fields
.field public p:Landroid/graphics/Paint;

.field public final q:Landroid/graphics/Path;

.field public r:F

.field public final s:Ljava/util/HashMap;

.field public final t:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 3

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
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    .line 13
    .line 14
    const/high16 v1, -0x10000

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    .line 18
    .line 19
    const/high16 v1, 0x41a00000    # 20.0f

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->p:Landroid/graphics/Paint;

    .line 25
    .line 26
    new-instance v0, Landroid/graphics/Path;

    .line 27
    .line 28
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->q:Landroid/graphics/Path;

    .line 32
    .line 33
    const/high16 v0, 0x42200000    # 40.0f

    .line 34
    .line 35
    iput v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->r:F

    .line 36
    .line 37
    new-instance v0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->s:Ljava/util/HashMap;

    .line 43
    .line 44
    new-instance v0, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->t:Ljava/util/HashMap;

    .line 50
    .line 51
    sget-object v0, Lna/i;->a:Lna/i;

    .line 52
    .line 53
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->e:Lcom/zykj/blackboard/utils/EventKey;

    .line 54
    .line 55
    new-instance v2, Lcom/zykj/blackboard/core/action/EraseWritingAction$1;

    .line 56
    .line 57
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/action/EraseWritingAction$1;-><init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, v2}, Lna/i;->c(Lcom/zykj/blackboard/utils/EventKey;Lhd/a;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static final synthetic I(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->M(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic J(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->N(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic K(Lcom/zykj/blackboard/core/action/EraseWritingAction;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->s:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;-><init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public G(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchMove$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchMove$1;-><init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public H(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;-><init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->L()V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->q:Landroid/graphics/Path;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->q:Landroid/graphics/Path;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->p:Landroid/graphics/Paint;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v2, 0x0

    .line 44
    :goto_0
    invoke-interface {p1, v0, v1, v2}, Lv9/c;->B(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Lv9/c;->g()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public final L()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->t:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "deleteCommandMap.keys"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->t:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast v3, Ljava/util/List;

    .line 46
    .line 47
    const-string v4, "it"

    .line 48
    .line 49
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    invoke-interface {v2, v3, v4, v5}, Lr9/b;->o(Ljava/util/List;J)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->t:Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-interface {v0}, Lr9/b;->l()V

    .line 75
    .line 76
    .line 77
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->t:Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final M(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->P(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ljava/util/Collection;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->t:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Lv9/c;->n()Lba/c;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-interface {v0, p1}, Lba/c;->k(Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v1, "EraseWritingAction:deleteGraph -> graphList: "

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    move-object v1, p1

    .line 53
    check-cast v1, Ljava/lang/Iterable;

    .line 54
    .line 55
    new-instance v2, Ljava/util/ArrayList;

    .line 56
    .line 57
    const/16 v3, 0xa

    .line 58
    .line 59
    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lba/c;

    .line 81
    .line 82
    invoke-interface {v3}, Lba/c;->getId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->S(Ljava/util/List;)Landroid/graphics/RectF;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 109
    .line 110
    const/high16 v1, 0x40800000    # 4.0f

    .line 111
    .line 112
    sub-float/2addr v0, v1

    .line 113
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 114
    .line 115
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 116
    .line 117
    sub-float/2addr v0, v1

    .line 118
    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 119
    .line 120
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 121
    .line 122
    add-float/2addr v0, v1

    .line 123
    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 124
    .line 125
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 126
    .line 127
    add-float/2addr v0, v1

    .line 128
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 129
    .line 130
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->Q(Landroid/graphics/RectF;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    if-eqz v1, :cond_2

    .line 139
    .line 140
    invoke-interface {v1, p1, v0}, Lv9/c;->m(Landroid/graphics/RectF;Ljava/util/List;)V

    .line 141
    .line 142
    .line 143
    :cond_2
    return-void
.end method

.method public final N(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->q:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->q:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-static {v2}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget v3, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->r:F

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v2, 0x0

    .line 42
    :goto_0
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 43
    .line 44
    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->q:Landroid/graphics/Path;

    .line 54
    .line 55
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->p:Landroid/graphics/Paint;

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const/4 v2, 0x0

    .line 69
    :goto_1
    invoke-interface {p1, v0, v1, v2}, Lv9/c;->B(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    return-void
.end method

.method public final O(Ljava/util/List;FFF)V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_4

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lba/c;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-interface {v3}, Lv9/c;->n()Lba/c;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-interface {v3}, Lba/c;->f()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    add-int/lit8 v4, v4, -0x1

    .line 48
    .line 49
    :goto_1
    const/4 v5, -0x1

    .line 50
    if-ge v5, v4, :cond_0

    .line 51
    .line 52
    invoke-interface {v2}, Lba/c;->getParent()Lba/c;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    invoke-interface {v5}, Lba/c;->getId()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    goto :goto_2

    .line 63
    :cond_1
    const/4 v5, 0x0

    .line 64
    :goto_2
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Lba/c;

    .line 69
    .line 70
    invoke-interface {v6}, Lba/c;->getId()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Lba/c;

    .line 86
    .line 87
    invoke-interface {v5}, Lba/c;->d()Landroid/graphics/RectF;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-interface {v2}, Lba/c;->d()Landroid/graphics/RectF;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-static {v5, v6}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_3

    .line 100
    .line 101
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Lba/c;

    .line 106
    .line 107
    invoke-interface {v5}, Lba/c;->d()Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    new-instance v6, Landroid/graphics/RectF;

    .line 112
    .line 113
    sub-float v7, p2, p4

    .line 114
    .line 115
    sub-float v8, p3, p4

    .line 116
    .line 117
    add-float v9, p2, p4

    .line 118
    .line 119
    add-float v10, p3, p4

    .line 120
    .line 121
    invoke-direct {v6, v7, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 122
    .line 123
    .line 124
    invoke-static {v5, v6}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_3

    .line 129
    .line 130
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    :cond_3
    add-int/lit8 v4, v4, -0x1

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    invoke-interface {p1, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final P(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x2

    .line 15
    new-array v3, v3, [F

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    aput v1, v3, v4

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    aput v2, v3, v1

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 36
    .line 37
    .line 38
    :cond_0
    new-instance v2, Landroid/graphics/RectF;

    .line 39
    .line 40
    aget v4, v3, v4

    .line 41
    .line 42
    iget v5, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->r:F

    .line 43
    .line 44
    sub-float v6, v4, v5

    .line 45
    .line 46
    aget v1, v3, v1

    .line 47
    .line 48
    sub-float v3, v1, v5

    .line 49
    .line 50
    add-float/2addr v4, v5

    .line 51
    add-float/2addr v1, v5

    .line 52
    invoke-direct {v2, v6, v3, v4, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-static {v1}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    iget v3, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->r:F

    .line 74
    .line 75
    invoke-virtual {v1, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const/4 v1, 0x0

    .line 81
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-interface {v3}, Lv9/c;->n()Lba/c;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    if-eqz v3, :cond_4

    .line 92
    .line 93
    invoke-interface {v3}, Lba/c;->f()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    check-cast v3, Ljava/lang/Iterable;

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Lba/c;

    .line 116
    .line 117
    invoke-virtual {p0, v4}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->R(Lba/c;)Landroid/graphics/RectF;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-static {v5, v2}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_2

    .line 126
    .line 127
    invoke-interface {v4}, Lba/c;->f()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Ljava/lang/Iterable;

    .line 132
    .line 133
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_2

    .line 142
    .line 143
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    check-cast v5, Lba/c;

    .line 148
    .line 149
    invoke-virtual {p0, v5}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->R(Lba/c;)Landroid/graphics/RectF;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-static {v6, v2}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_3

    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    invoke-interface {v5, v6, v7, v1}, Lba/c;->q(FFF)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_3

    .line 172
    .line 173
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    invoke-virtual {p0, v0, v2, p1, v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->O(Ljava/util/List;FFF)V

    .line 186
    .line 187
    .line 188
    return-object v0
.end method

.method public final Q(Landroid/graphics/RectF;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {v1}, Lv9/c;->n()Lba/c;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Lba/c;->f()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    check-cast v1, Ljava/lang/Iterable;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lba/c;

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->R(Lba/c;)Landroid/graphics/RectF;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {p1, v3}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0, v2}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->R(Lba/c;)Landroid/graphics/RectF;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {p1, v3}, Landroid/graphics/RectF;->intersects(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_0

    .line 61
    .line 62
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    return-object v0
.end method

.method public final R(Lba/c;)Landroid/graphics/RectF;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->s:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-interface {p1}, Lba/c;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    instance-of v0, p1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    new-instance v0, Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-interface {p1}, Lba/c;->g()Landroid/graphics/RectF;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lba/c;->b()Landroid/graphics/Matrix;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 54
    .line 55
    .line 56
    move-object v1, p1

    .line 57
    check-cast v1, Lcom/zykj/blackboard/core/graph/group/GroupGraph;

    .line 58
    .line 59
    invoke-virtual {v1}, Lba/a;->t()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lba/c;

    .line 78
    .line 79
    const-string v3, "childGraph"

    .line 80
    .line 81
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v2}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->R(Lba/c;)Landroid/graphics/RectF;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v0, v2}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->s:Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-interface {p1}, Lba/c;->getId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    instance-of v0, p1, Lea/c;

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->s:Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-interface {p1}, Lba/c;->getId()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const/4 v2, 0x0

    .line 124
    :goto_1
    invoke-interface {p1, v2}, Lba/c;->j(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->s:Ljava/util/HashMap;

    .line 132
    .line 133
    invoke-interface {p1}, Lba/c;->getId()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    check-cast p1, Landroid/graphics/RectF;

    .line 145
    .line 146
    return-object p1
.end method

.method public final S(Ljava/util/List;)Landroid/graphics/RectF;
    .locals 3

    .line 1
    const-string v0, "deleteGraphList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lba/c;

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->R(Lba/c;)Landroid/graphics/RectF;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->R(Lba/c;)Landroid/graphics/RectF;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object v0
.end method

.method public T()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->q:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lq9/b;->p()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/high16 v0, 0x42200000    # 40.0f

    .line 18
    .line 19
    :goto_0
    iput v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction;->r:F

    .line 20
    .line 21
    return-void
.end method

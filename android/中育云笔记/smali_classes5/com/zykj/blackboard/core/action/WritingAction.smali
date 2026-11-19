.class public final Lcom/zykj/blackboard/core/action/WritingAction;
.super Lcom/zykj/blackboard/core/action/BaseWriteAction;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lna/i;->a:Lna/i;

    .line 5
    .line 6
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->f:Lcom/zykj/blackboard/utils/EventKey;

    .line 7
    .line 8
    new-instance v2, Lcom/zykj/blackboard/core/action/WritingAction$1;

    .line 9
    .line 10
    invoke-direct {v2, p0}, Lcom/zykj/blackboard/core/action/WritingAction$1;-><init>(Lcom/zykj/blackboard/core/action/WritingAction;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lna/i;->c(Lcom/zykj/blackboard/utils/EventKey;Lhd/a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public Q(Ljava/lang/String;)Lba/a;
    .locals 9

    .line 1
    const-string v0, "graphId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lea/b;

    .line 7
    .line 8
    sget-object v0, Lna/l;->a:Lna/l;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v2}, Lna/l;->d(Ljava/util/List;)Landroid/graphics/RectF;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/16 v7, 0x1c

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v2, p1

    .line 25
    invoke-direct/range {v1 .. v8}, Lea/b;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lga/d;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/n;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1, p1}, Lea/c;->Q(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, Lna/l;->c(Ljava/util/List;)Landroid/graphics/Path;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p1}, Lea/c;->M(Landroid/graphics/Path;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Landroid/graphics/Paint;

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->W()Landroid/graphics/Paint;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->X()F

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Y()F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v1, p1, v0, v2}, Lea/c;->L(Landroid/graphics/Paint;FF)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Lea/c;->v()V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method

.method public T()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public a0(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z()Landroid/graphics/Path;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z()Landroid/graphics/Path;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z()Landroid/graphics/Path;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->h0(F)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->i0(F)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z()Landroid/graphics/Path;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->W()Landroid/graphics/Paint;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_0

    .line 83
    .line 84
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const/4 v2, 0x0

    .line 90
    :goto_0
    invoke-interface {p1, v0, v1, v2}, Lv9/c;->B(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    return-void
.end method

.method public b0(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 7

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z()Landroid/graphics/Path;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->U()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->V()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->U()F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    add-float/2addr v3, v4

    .line 34
    const/4 v4, 0x2

    .line 35
    int-to-float v4, v4

    .line 36
    div-float/2addr v3, v4

    .line 37
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->V()F

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    add-float/2addr v5, v6

    .line 46
    div-float/2addr v5, v4

    .line 47
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->h0(F)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->i0(F)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z()Landroid/graphics/Path;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->W()Landroid/graphics/Paint;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_0

    .line 83
    .line 84
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const/4 v2, 0x0

    .line 90
    :goto_0
    invoke-interface {p1, v0, v1, v2}, Lv9/c;->B(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    return-void
.end method

.method public c0(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 7

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z()Landroid/graphics/Path;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->U()F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->V()F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->U()F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    add-float/2addr v3, v4

    .line 34
    const/4 v4, 0x2

    .line 35
    int-to-float v4, v4

    .line 36
    div-float/2addr v3, v4

    .line 37
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->V()F

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    add-float/2addr v5, v6

    .line 46
    div-float/2addr v5, v4

    .line 47
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z()Landroid/graphics/Path;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z()Landroid/graphics/Path;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->W()Landroid/graphics/Paint;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->i()Lu9/a;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    invoke-virtual {v2}, Lu9/a;->b()Landroid/graphics/Matrix;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    const/4 v2, 0x0

    .line 91
    :goto_0
    invoke-interface {p1, v0, v1, v2}, Lv9/c;->B(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-void
.end method

.method public d0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->W()Landroid/graphics/Paint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lq9/b;->A()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 v1, -0x1000000

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Lq9/b;->D()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/high16 v1, 0x40400000    # 3.0f

    .line 33
    .line 34
    :goto_1
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 35
    .line 36
    .line 37
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    .line 41
    .line 42
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 45
    .line 46
    .line 47
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const/4 v3, 0x0

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    invoke-virtual {v2}, Lq9/b;->N()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-ne v2, v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2}, Lq9/b;->B()F

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    const/high16 v2, 0x41f00000    # 30.0f

    .line 84
    .line 85
    :goto_2
    invoke-virtual {p0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->j0(F)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {v2}, Lq9/b;->C()F

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    const/high16 v2, 0x41700000    # 15.0f

    .line 100
    .line 101
    :goto_3
    invoke-virtual {p0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->k0(F)V

    .line 102
    .line 103
    .line 104
    new-instance v2, Landroid/graphics/DashPathEffect;

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->X()F

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Y()F

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    const/4 v6, 0x2

    .line 115
    new-array v6, v6, [F

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    aput v4, v6, v7

    .line 119
    .line 120
    aput v5, v6, v1

    .line 121
    .line 122
    invoke-direct {v2, v6, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_4
    const/high16 v1, 0x3f800000    # 1.0f

    .line 130
    .line 131
    invoke-virtual {p0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->j0(F)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v3}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->k0(F)V

    .line 135
    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 139
    .line 140
    .line 141
    return-void
.end method

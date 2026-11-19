.class public final Lcom/zykj/blackboard/core/action/CursorAction;
.super Lcom/zykj/blackboard/core/action/b;
.source "SourceFile"


# instance fields
.field public final p:Landroid/graphics/Paint;

.field public q:F

.field public final r:Landroid/graphics/Path;

.field public final s:Landroid/graphics/PointF;

.field public final t:Ljava/util/ArrayList;


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
    const/high16 v1, 0x41a00000    # 20.0f

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

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
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

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
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->p:Landroid/graphics/Paint;

    .line 32
    .line 33
    const/high16 v0, 0x42480000    # 50.0f

    .line 34
    .line 35
    iput v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->q:F

    .line 36
    .line 37
    new-instance v0, Landroid/graphics/Path;

    .line 38
    .line 39
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->r:Landroid/graphics/Path;

    .line 43
    .line 44
    new-instance v0, Landroid/graphics/PointF;

    .line 45
    .line 46
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->s:Landroid/graphics/PointF;

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->t:Ljava/util/ArrayList;

    .line 57
    .line 58
    return-void
.end method

.method public static final synthetic I(Lcom/zykj/blackboard/core/action/CursorAction;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->t:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->p:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K(Lcom/zykj/blackboard/core/action/CursorAction;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->q:F

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic L(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/Path;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->r:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic M(Lcom/zykj/blackboard/core/action/CursorAction;)Landroid/graphics/PointF;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->s:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object p0
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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Lv9/c;->e()V

    .line 13
    .line 14
    .line 15
    :cond_0
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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/CursorAction;->O()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/CursorAction;->N(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/CursorAction;->N(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public H(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/action/CursorAction;->N(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Lv9/c;->e()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->t:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction;->p:Landroid/graphics/Paint;

    .line 27
    .line 28
    const/high16 v2, 0x3f800000    # 1.0f

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v1, v2, v3}, Lna/m;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {p1, v0, v1}, Lr9/b;->f(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final N(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/CursorAction$handleTouch$1;-><init>(Lcom/zykj/blackboard/core/action/CursorAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final O()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lq9/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction;->p:Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {v0}, Lq9/b;->m()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/CursorAction;->p:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v0}, Lq9/b;->o()F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lq9/b;->n()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->q:F

    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public P()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->r:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/CursorAction;->t:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.class public final Lrb/i;
.super Lrb/e;
.source "SourceFile"


# instance fields
.field public final o:Lqb/c;

.field public final p:Landroid/graphics/Matrix;

.field public final q:Lqb/b;

.field public r:F

.field public s:F

.field public final t:Landroid/graphics/Path;

.field public final u:Ljava/util/ArrayList;

.field public final v:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(Lqb/c;Landroid/graphics/Matrix;Lqb/b;)V
    .locals 1

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "drawControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2, p3}, Lrb/e;-><init>(Lqb/c;Landroid/graphics/Matrix;Lqb/b;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lrb/i;->o:Lqb/c;

    .line 20
    .line 21
    iput-object p2, p0, Lrb/i;->p:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lrb/i;->q:Lqb/b;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/Path;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 31
    .line 32
    new-instance p1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lrb/i;->u:Ljava/util/ArrayList;

    .line 38
    .line 39
    new-instance p1, Landroid/graphics/PointF;

    .line 40
    .line 41
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lrb/i;->v:Landroid/graphics/PointF;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public A(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/i;->v:Landroid/graphics/PointF;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lrb/i;->p:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lrb/i;->v:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lrb/i;->u:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 37
    .line 38
    iget v1, p0, Lrb/i;->r:F

    .line 39
    .line 40
    iget v2, p0, Lrb/i;->s:F

    .line 41
    .line 42
    iget v3, p1, Landroid/graphics/PointF;->x:F

    .line 43
    .line 44
    add-float/2addr v3, v1

    .line 45
    const/4 v4, 0x2

    .line 46
    int-to-float v4, v4

    .line 47
    div-float/2addr v3, v4

    .line 48
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 49
    .line 50
    add-float/2addr v5, v2

    .line 51
    div-float/2addr v5, v4

    .line 52
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 53
    .line 54
    .line 55
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 56
    .line 57
    iput v0, p0, Lrb/i;->r:F

    .line 58
    .line 59
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 60
    .line 61
    iput p1, p0, Lrb/i;->s:F

    .line 62
    .line 63
    iget-object p1, p0, Lrb/i;->q:Lqb/b;

    .line 64
    .line 65
    iget-object v0, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lqb/b;->k(Landroid/graphics/Path;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public B(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/i;->v:Landroid/graphics/PointF;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lrb/i;->p:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lrb/i;->v:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lrb/i;->u:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 37
    .line 38
    iget v1, p0, Lrb/i;->r:F

    .line 39
    .line 40
    iget v2, p0, Lrb/i;->s:F

    .line 41
    .line 42
    iget v3, p1, Landroid/graphics/PointF;->x:F

    .line 43
    .line 44
    add-float/2addr v3, v1

    .line 45
    const/4 v4, 0x2

    .line 46
    int-to-float v4, v4

    .line 47
    div-float/2addr v3, v4

    .line 48
    iget v5, p1, Landroid/graphics/PointF;->y:F

    .line 49
    .line 50
    add-float/2addr v5, v2

    .line 51
    div-float/2addr v5, v4

    .line 52
    invoke-virtual {v0, v1, v2, v3, v5}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 56
    .line 57
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 58
    .line 59
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 60
    .line 61
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lrb/i;->q:Lqb/b;

    .line 65
    .line 66
    iget-object v0, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 67
    .line 68
    iget-object v1, p0, Lrb/i;->u:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1, v0, v1}, Lqb/b;->m(Landroid/graphics/Path;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public y(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lrb/i;->q:Lqb/b;

    .line 7
    .line 8
    invoke-virtual {p1}, Lqb/b;->l()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public z(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrb/i;->v:Landroid/graphics/PointF;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lrb/i;->p:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lna/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lrb/i;->v:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lrb/i;->u:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lrb/i;->u:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 47
    .line 48
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 49
    .line 50
    iget v2, p1, Landroid/graphics/PointF;->y:F

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 56
    .line 57
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 58
    .line 59
    iget v2, p1, Landroid/graphics/PointF;->y:F

    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 62
    .line 63
    .line 64
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 65
    .line 66
    iput v0, p0, Lrb/i;->r:F

    .line 67
    .line 68
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 69
    .line 70
    iput p1, p0, Lrb/i;->s:F

    .line 71
    .line 72
    iget-object p1, p0, Lrb/i;->q:Lqb/b;

    .line 73
    .line 74
    iget-object v0, p0, Lrb/i;->t:Landroid/graphics/Path;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Lqb/b;->k(Landroid/graphics/Path;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

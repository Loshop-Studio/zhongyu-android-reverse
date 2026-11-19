.class public final Lw5/f;
.super Lw5/e;
.source "SourceFile"


# instance fields
.field public final o:Lv5/c;

.field public final p:Landroid/graphics/Matrix;

.field public final q:Lv5/b;

.field public final r:Landroid/graphics/PointF;

.field public final s:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(Lv5/c;Landroid/graphics/Matrix;Lv5/b;)V
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
    invoke-direct {p0, p1, p2, p3}, Lw5/e;-><init>(Lv5/c;Landroid/graphics/Matrix;Lv5/b;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lw5/f;->o:Lv5/c;

    .line 20
    .line 21
    iput-object p2, p0, Lw5/f;->p:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lw5/f;->q:Lv5/b;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lw5/f;->r:Landroid/graphics/PointF;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/PointF;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lw5/f;->s:Landroid/graphics/PointF;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public A(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lw5/f;->z(Landroid/view/MotionEvent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public B(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw5/f;->s:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lw5/f;->p:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lw5/f;->s:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lw5/f;->r:Landroid/graphics/PointF;

    .line 32
    .line 33
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 36
    .line 37
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lw5/f;->q:Lv5/b;

    .line 41
    .line 42
    iget-object v0, p0, Lw5/f;->r:Landroid/graphics/PointF;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lv5/b;->j(Landroid/graphics/PointF;)V

    .line 45
    .line 46
    .line 47
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
    invoke-virtual {p0, p1}, Lw5/f;->B(Landroid/view/MotionEvent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public z(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw5/f;->s:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lw5/f;->p:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lw5/f;->s:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lw5/f;->r:Landroid/graphics/PointF;

    .line 32
    .line 33
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 36
    .line 37
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lw5/f;->q:Lv5/b;

    .line 41
    .line 42
    iget-object v0, p0, Lw5/f;->r:Landroid/graphics/PointF;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lv5/b;->i(Landroid/graphics/PointF;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

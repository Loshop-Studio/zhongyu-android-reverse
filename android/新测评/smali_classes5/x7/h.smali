.class public final Lx7/h;
.super Lx7/e;
.source "SourceFile"


# instance fields
.field public final o:Lw7/c;

.field public final p:Landroid/graphics/Matrix;

.field public final q:Lw7/b;

.field public final r:Landroid/graphics/PointF;

.field public final s:Landroid/graphics/Matrix;

.field public final t:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lw7/c;Landroid/graphics/Matrix;Lw7/b;)V
    .locals 1

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "drawControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2, p3}, Lx7/e;-><init>(Lw7/c;Landroid/graphics/Matrix;Lw7/b;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lx7/h;->o:Lw7/c;

    .line 20
    .line 21
    iput-object p2, p0, Lx7/h;->p:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lx7/h;->q:Lw7/b;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lx7/h;->r:Landroid/graphics/PointF;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lx7/h;->s:Landroid/graphics/Matrix;

    .line 38
    .line 39
    new-instance p1, Landroid/graphics/Matrix;

    .line 40
    .line 41
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lx7/h;->t:Landroid/graphics/Matrix;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public A(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx7/h;->r:Landroid/graphics/PointF;

    .line 7
    .line 8
    const/high16 v1, -0x40800000    # -1.0f

    .line 9
    .line 10
    invoke-virtual {v0, v1, v1}, Landroid/graphics/PointF;->equals(FF)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lx7/h;->r:Landroid/graphics/PointF;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 23
    .line 24
    iget-object v0, p0, Lx7/h;->r:Landroid/graphics/PointF;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iput p1, v0, Landroid/graphics/PointF;->y:F

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-object v0, p0, Lx7/h;->t:Landroid/graphics/Matrix;

    .line 34
    .line 35
    iget-object v1, p0, Lx7/h;->s:Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lx7/h;->t:Landroid/graphics/Matrix;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v2, p0, Lx7/h;->r:Landroid/graphics/PointF;

    .line 47
    .line 48
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 49
    .line 50
    sub-float/2addr v1, v2

    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iget-object v2, p0, Lx7/h;->r:Landroid/graphics/PointF;

    .line 56
    .line 57
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 58
    .line 59
    sub-float/2addr p1, v2

    .line 60
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lx7/h;->q:Lw7/b;

    .line 64
    .line 65
    iget-object v0, p0, Lx7/h;->t:Landroid/graphics/Matrix;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lw7/b;->k(Landroid/graphics/Matrix;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public B(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public v(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lx7/e;->v(Landroid/view/MotionEvent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lx7/e;->p(Landroid/view/MotionEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lx7/h;->r:Landroid/graphics/PointF;

    .line 13
    .line 14
    const/high16 v0, -0x40800000    # -1.0f

    .line 15
    .line 16
    invoke-virtual {p1, v0, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public y(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public z(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx7/h;->r:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lx7/h;->s:Landroid/graphics/Matrix;

    .line 20
    .line 21
    iget-object v0, p0, Lx7/h;->p:Landroid/graphics/Matrix;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

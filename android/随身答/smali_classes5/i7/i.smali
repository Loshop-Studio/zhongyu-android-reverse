.class public final Li7/i;
.super Li7/e;
.source "SourceFile"


# instance fields
.field public final o:Landroid/graphics/Matrix;

.field public final p:Lcom/zykj/view/simpleBoard/a;

.field public final q:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V
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
    invoke-direct {p0, p1, p2, p3}, Li7/e;-><init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Li7/i;->o:Landroid/graphics/Matrix;

    .line 20
    .line 21
    iput-object p3, p0, Li7/i;->p:Lcom/zykj/view/simpleBoard/a;

    .line 22
    .line 23
    new-instance p1, Landroid/graphics/PointF;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Li7/i;->q:Landroid/graphics/PointF;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public A(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li7/i;->p:Lcom/zykj/view/simpleBoard/a;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Li7/i;->C(Landroid/view/MotionEvent;)Landroid/graphics/PointF;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/a;->G(Landroid/graphics/PointF;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public B(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li7/i;->p:Lcom/zykj/view/simpleBoard/a;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Li7/i;->C(Landroid/view/MotionEvent;)Landroid/graphics/PointF;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/a;->F(Landroid/graphics/PointF;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final C(Landroid/view/MotionEvent;)Landroid/graphics/PointF;
    .locals 2

    .line 1
    iget-object v0, p0, Li7/i;->q:Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Li7/i;->o:Landroid/graphics/Matrix;

    .line 15
    .line 16
    invoke-static {p1}, Lu5/n;->b(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Li7/i;->q:Landroid/graphics/PointF;

    .line 21
    .line 22
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public y(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Li7/i;->p:Lcom/zykj/view/simpleBoard/a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/a;->D()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public z(Landroid/view/MotionEvent;)V
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li7/i;->p:Lcom/zykj/view/simpleBoard/a;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Li7/i;->C(Landroid/view/MotionEvent;)Landroid/graphics/PointF;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Landroid/graphics/PointF;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-direct {v2, v3, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lcom/zykj/view/simpleBoard/a;->E(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

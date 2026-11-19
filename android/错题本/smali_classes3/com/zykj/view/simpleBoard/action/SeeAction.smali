.class public final Lcom/zykj/view/simpleBoard/action/SeeAction;
.super Lcom/zykj/view/simpleBoard/action/BaseAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0014\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/zykj/view/simpleBoard/action/SeeAction;",
        "Lcom/zykj/view/simpleBoard/action/BaseAction;",
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "boardConfig",
        "Landroid/graphics/Matrix;",
        "cameraMatrix",
        "Lcom/zykj/view/simpleBoard/DrawControl;",
        "drawControl",
        "<init>",
        "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V",
        "Landroid/view/MotionEvent;",
        "event",
        "Ld6/s;",
        "singleTouchDown",
        "(Landroid/view/MotionEvent;)V",
        "singleTouchMove",
        "singleTouchUp",
        "singleTouchCancel",
        "onTouchPointerUp",
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "Landroid/graphics/Matrix;",
        "Lcom/zykj/view/simpleBoard/DrawControl;",
        "Landroid/graphics/PointF;",
        "firstPointF",
        "Landroid/graphics/PointF;",
        "originMatrix",
        "tempMatrix",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final boardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cameraMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final drawControl:Lcom/zykj/view/simpleBoard/DrawControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final firstPointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final originMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempMatrix:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V
    .locals 1
    .param p1    # Lcom/zykj/view/simpleBoard/SimpleBoardConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/view/simpleBoard/DrawControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "drawControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/simpleBoard/action/BaseAction;-><init>(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->boardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->firstPointF:Landroid/graphics/PointF;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/Matrix;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->originMatrix:Landroid/graphics/Matrix;

    .line 38
    .line 39
    new-instance p1, Landroid/graphics/Matrix;

    .line 40
    .line 41
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public onTouchPointerUp(Landroid/view/MotionEvent;)V
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchPointerUp(Landroid/view/MotionEvent;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->onTouchDown(Landroid/view/MotionEvent;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->firstPointF:Landroid/graphics/PointF;

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

.method public singleTouchCancel(Landroid/view/MotionEvent;)V
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public singleTouchDown(Landroid/view/MotionEvent;)V
    .locals 2
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->firstPointF:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->originMatrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public singleTouchMove(Landroid/view/MotionEvent;)V
    .locals 3
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->firstPointF:Landroid/graphics/PointF;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->firstPointF:Landroid/graphics/PointF;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->firstPointF:Landroid/graphics/PointF;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->originMatrix:Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->firstPointF:Landroid/graphics/PointF;

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
    iget-object v2, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->firstPointF:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/SeeAction;->tempMatrix:Landroid/graphics/Matrix;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/DrawControl;->handleCameraMatrix(Landroid/graphics/Matrix;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public singleTouchUp(Landroid/view/MotionEvent;)V
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

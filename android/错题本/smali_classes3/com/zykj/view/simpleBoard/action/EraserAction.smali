.class public final Lcom/zykj/view/simpleBoard/action/EraserAction;
.super Lcom/zykj/view/simpleBoard/action/BaseAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/zykj/view/simpleBoard/action/EraserAction;",
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
        "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;",
        "Landroid/graphics/Matrix;",
        "Lcom/zykj/view/simpleBoard/DrawControl;",
        "Landroid/graphics/PointF;",
        "lastPointF",
        "Landroid/graphics/PointF;",
        "tempPointF",
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

.field private final lastPointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempPointF:Landroid/graphics/PointF;
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
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->boardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->lastPointF:Landroid/graphics/PointF;

    .line 31
    .line 32
    new-instance p1, Landroid/graphics/PointF;

    .line 33
    .line 34
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->tempPointF:Landroid/graphics/PointF;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public singleTouchCancel(Landroid/view/MotionEvent;)V
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
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/action/EraserAction;->singleTouchUp(Landroid/view/MotionEvent;)V

    .line 7
    .line 8
    .line 9
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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->tempPointF:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->tempPointF:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->lastPointF:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->lastPointF:Landroid/graphics/PointF;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/DrawControl;->handleEraser(Landroid/graphics/PointF;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public singleTouchMove(Landroid/view/MotionEvent;)V
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
    invoke-virtual {p0, p1}, Lcom/zykj/view/simpleBoard/action/EraserAction;->singleTouchDown(Landroid/view/MotionEvent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public singleTouchUp(Landroid/view/MotionEvent;)V
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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->tempPointF:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->tempPointF:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->lastPointF:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/EraserAction;->lastPointF:Landroid/graphics/PointF;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/DrawControl;->handleEraserEnd(Landroid/graphics/PointF;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

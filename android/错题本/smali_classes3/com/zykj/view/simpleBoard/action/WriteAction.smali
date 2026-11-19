.class public final Lcom/zykj/view/simpleBoard/action/WriteAction;
.super Lcom/zykj/view/simpleBoard/action/BaseAction;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\u0008\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/view/simpleBoard/action/WriteAction;",
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
        "",
        "mLastX",
        "F",
        "mLastY",
        "Landroid/graphics/Path;",
        "tempPath",
        "Landroid/graphics/Path;",
        "Ljava/util/ArrayList;",
        "Landroid/graphics/PointF;",
        "Lkotlin/collections/ArrayList;",
        "tempPointFList",
        "Ljava/util/ArrayList;",
        "tempPointF",
        "Landroid/graphics/PointF;",
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

.field private mLastX:F

.field private mLastY:F

.field private final tempPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempPointF:Landroid/graphics/PointF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final tempPointFList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

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
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->boardConfig:Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/Path;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

    .line 31
    .line 32
    new-instance p1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointFList:Ljava/util/ArrayList;

    .line 38
    .line 39
    new-instance p1, Landroid/graphics/PointF;

    .line 40
    .line 41
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointF:Landroid/graphics/PointF;

    .line 45
    .line 46
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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/DrawControl;->handleWritePathCancel()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public singleTouchDown(Landroid/view/MotionEvent;)V
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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointF:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointF:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointFList:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointFList:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

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
    iput v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->mLastX:F

    .line 67
    .line 68
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 69
    .line 70
    iput p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->mLastY:F

    .line 71
    .line 72
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/DrawControl;->handleWritePath(Landroid/graphics/Path;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public singleTouchMove(Landroid/view/MotionEvent;)V
    .locals 6
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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointF:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointF:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointFList:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

    .line 37
    .line 38
    iget v1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->mLastX:F

    .line 39
    .line 40
    iget v2, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->mLastY:F

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
    iput v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->mLastX:F

    .line 58
    .line 59
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 60
    .line 61
    iput p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->mLastY:F

    .line 62
    .line 63
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 64
    .line 65
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/zykj/view/simpleBoard/DrawControl;->handleWritePath(Landroid/graphics/Path;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public singleTouchUp(Landroid/view/MotionEvent;)V
    .locals 6
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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointF:Landroid/graphics/PointF;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->cameraMatrix:Landroid/graphics/Matrix;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointF:Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/sketch/core/graph/GraphExtKt;->mapPoint(Landroid/graphics/Matrix;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointFList:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

    .line 37
    .line 38
    iget v1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->mLastX:F

    .line 39
    .line 40
    iget v2, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->mLastY:F

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
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

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
    iget-object p1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->drawControl:Lcom/zykj/view/simpleBoard/DrawControl;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPath:Landroid/graphics/Path;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/zykj/view/simpleBoard/action/WriteAction;->tempPointFList:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1, v0, v1}, Lcom/zykj/view/simpleBoard/DrawControl;->handleWritePathEnd(Landroid/graphics/Path;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

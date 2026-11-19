.class public final Lcom/zykj/blackboard/core/play/CursorMoveThread;
.super Lcom/zykj/blackboard/core/execute/EventPlayThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/blackboard/core/execute/EventPlayThread<",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        ">;"
    }
.end annotation


# instance fields
.field private final paint:Landroid/graphics/Paint;

.field private path:Landroid/graphics/Path;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/execute/EventPlayThread;-><init>()V

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
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->paint:Landroid/graphics/Paint;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->path:Landroid/graphics/Path;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final getPath()Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->path:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public handle(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 5

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->path:Landroid/graphics/Path;

    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 4
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    move-result v1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    move-result p1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Lcom/zykj/blackboard/utils/MatrixExtKt;->invert(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    :cond_1
    iget-object v3, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->paint:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRadius(F)F

    move-result v2

    .line 7
    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 8
    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->paint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getAdapterMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1, v0, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic handle(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/play/CursorMoveThread;->handle(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    return-void
.end method

.method public needHandle(Lcom/zykj/board/EzyTouchEvent$TouchEvent;J)Z
    .locals 4

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->getStartPlayTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    cmp-long p1, v0, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic needHandle(Ljava/lang/Object;J)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/play/CursorMoveThread;->needHandle(Lcom/zykj/board/EzyTouchEvent$TouchEvent;J)Z

    move-result p1

    return p1
.end method

.method public final setPath(Landroid/graphics/Path;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->path:Landroid/graphics/Path;

    .line 2
    .line 3
    return-void
.end method

.method public final setTouchInfo(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;J)V
    .locals 3

    .line 1
    const-string v0, "touchInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->paint:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->j()Lcom/zykj/board/EzyPaint$Paint;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "touchInfo.paint"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->path:Landroid/graphics/Path;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "touchInfo.touchEventList"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->setListIterator(Ljava/util/ListIterator;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->getTouchEventList()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->initStartPlayTime(J)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p2, p3}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->seekTo(J)V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void
.end method

.method public shutdown()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->shutdown()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CursorMoveThread;->path:Landroid/graphics/Path;

    .line 6
    .line 7
    return-void
.end method

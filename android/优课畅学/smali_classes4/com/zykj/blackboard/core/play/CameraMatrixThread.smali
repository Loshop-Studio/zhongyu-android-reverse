.class public final Lcom/zykj/blackboard/core/play/CameraMatrixThread;
.super Lcom/zykj/blackboard/core/execute/EventPlayThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/blackboard/core/execute/EventPlayThread<",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        ">;"
    }
.end annotation


# instance fields
.field private matrixList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/execute/EventPlayThread;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public handle(Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 2

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CameraMatrixThread;->matrixList:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 3
    invoke-static {v0}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->cameraChangeEnd(Landroid/graphics/Matrix;)V

    return-void

    .line 5
    :cond_0
    invoke-static {v0}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->cameraChangeStart()V

    return-void

    .line 7
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->cameraChanging(Landroid/graphics/Matrix;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic handle(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/play/CameraMatrixThread;->handle(Lcom/zykj/board/EzyMatrix$Matrix;)V

    return-void
.end method

.method public needHandle(Lcom/zykj/board/EzyMatrix$Matrix;J)Z
    .locals 4

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

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
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/play/CameraMatrixThread;->needHandle(Lcom/zykj/board/EzyMatrix$Matrix;J)Z

    move-result p1

    return p1
.end method

.method public final setMatrixInfo(Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V
    .locals 2

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "info.matrixList"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CameraMatrixThread;->matrixList:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->setListIterator(Ljava/util/ListIterator;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->initStartPlayTime(J)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p2, p3}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->seekTo(J)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

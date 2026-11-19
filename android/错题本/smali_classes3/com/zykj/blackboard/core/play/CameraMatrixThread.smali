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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/play/CameraMatrixThread;",
        "Lcom/zykj/blackboard/core/execute/EventPlayThread;",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "<init>",
        "()V",
        "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;",
        "info",
        "",
        "skipTime",
        "Ld6/s;",
        "setMatrixInfo",
        "(Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V",
        "handle",
        "(Lcom/zykj/board/EzyMatrix$Matrix;)V",
        "currentTime",
        "",
        "needHandle",
        "(Lcom/zykj/board/EzyMatrix$Matrix;J)Z",
        "",
        "matrixList",
        "Ljava/util/List;",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
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

    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    .param p1    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CameraMatrixThread;->matrixList:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 3
    invoke-static {v0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    .line 4
    invoke-virtual {p1, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->cameraChangeEnd(Landroid/graphics/Matrix;)V

    return-void

    .line 6
    :cond_0
    invoke-static {v0}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyMatrix$Matrix;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->cameraChangeStart()V

    return-void

    .line 9
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
    .param p1    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "info"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

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

.class public final Lcom/zykj/blackboard/core/play/GraphMatrixThread;
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
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J+\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0018j\u0008\u0012\u0004\u0012\u00020\u0006`\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001aR&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0018j\u0008\u0012\u0004\u0012\u00020\u001b`\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/play/GraphMatrixThread;",
        "Lcom/zykj/blackboard/core/execute/EventPlayThread;",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "<init>",
        "()V",
        "",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;",
        "graphIdList",
        "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;",
        "info",
        "",
        "skipTime",
        "Ld6/s;",
        "setMatrixInfo",
        "(Ljava/util/List;Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V",
        "handle",
        "(Lcom/zykj/board/EzyMatrix$Matrix;)V",
        "currentTime",
        "",
        "needHandle",
        "(Lcom/zykj/board/EzyMatrix$Matrix;J)Z",
        "",
        "matrixList",
        "Ljava/util/List;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "Ljava/util/ArrayList;",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "graphList",
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
.field private graphIdList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private graphList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

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
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/execute/EventPlayThread;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->graphIdList:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->graphList:Ljava/util/ArrayList;

    .line 17
    .line 18
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->matrixList:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 3
    invoke-static {v0}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    invoke-virtual {p1, v0}, Lcom/zykj/board/EzyMatrix$Matrix;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->graphList:Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->translationStart(Ljava/util/List;)V

    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->graphList:Ljava/util/ArrayList;

    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->translation(Ljava/util/List;Landroid/graphics/Matrix;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic handle(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->handle(Lcom/zykj/board/EzyMatrix$Matrix;)V

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->needHandle(Lcom/zykj/board/EzyMatrix$Matrix;J)Z

    move-result p1

    return p1
.end method

.method public final setMatrixInfo(Ljava/util/List;Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;",
            ">;",
            "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;",
            "J)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "info"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->graphIdList:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->graphIdList:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->graphIdList:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    :cond_0
    :goto_0
    if-ge v1, v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    check-cast v2, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    invoke-interface {v3}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getGraphId()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v4, "it.graphId"

    .line 55
    .line 56
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v3, v2}, Lcom/zykj/blackboard/core/graph/IGraph;->findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    iget-object v3, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->graphList:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {p2}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v0, "info.matrixList"

    .line 76
    .line 77
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-nez p1, :cond_2

    .line 85
    .line 86
    invoke-virtual {p2}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/GraphMatrixThread;->matrixList:Ljava/util/List;

    .line 91
    .line 92
    invoke-virtual {p2}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->setListIterator(Ljava/util/ListIterator;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;->getMatrixList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lkotlin/collections/t;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 117
    .line 118
    .line 119
    move-result-wide p1

    .line 120
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->initStartPlayTime(J)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p3, p4}, Lcom/zykj/blackboard/core/execute/EventPlayThread;->seekTo(J)V

    .line 124
    .line 125
    .line 126
    :cond_2
    return-void
.end method

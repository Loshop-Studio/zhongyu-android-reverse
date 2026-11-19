.class public final Lcom/zykj/blackboard/core/edit/HistoryControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;

.field public static final LIST_SIZE:I = 0xa


# instance fields
.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

.field private final historyList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/edit/HistoryData;",
            ">;"
        }
    .end annotation
.end field

.field private final listenerList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/listener/WithdrawListener;",
            ">;"
        }
    .end annotation
.end field

.field private final recycleList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/edit/HistoryData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/blackboard/core/edit/HistoryControl;->Companion:Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/control/GraphControl;)V
    .locals 1

    .line 1
    const-string v0, "graphControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->listenerList:Ljava/util/ArrayList;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final addWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->listenerList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final clearHistoryList()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->listenerList:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x1

    .line 36
    if-le v2, v3, :cond_0

    .line 37
    .line 38
    move v2, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const/4 v2, 0x0

    .line 41
    :goto_1
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    xor-int/2addr v3, v4

    .line 48
    invoke-interface {v1, v2, v3}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-void
.end method

.method public final clearHistoryListWithoutCurrent()V
    .locals 5

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {v0}, Li7/a0;->N(Ljava/util/List;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->listenerList:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 38
    .line 39
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-le v3, v1, :cond_1

    .line 46
    .line 47
    move v3, v1

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const/4 v3, 0x0

    .line 50
    :goto_2
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    xor-int/2addr v4, v1

    .line 57
    invoke-interface {v2, v3, v4}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    return-void
.end method

.method public final recover()Lcom/zykj/blackboard/core/edit/HistoryData;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {v0}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/zykj/blackboard/core/edit/HistoryData;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getRootGraph()Lcom/zykj/blackboard/core/graph/Graph;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->copy()Lcom/zykj/blackboard/core/graph/Graph;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->init(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getBackgroundColor()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundColor(I)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->listenerList:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 82
    .line 83
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    const/4 v4, 0x1

    .line 90
    if-le v3, v4, :cond_1

    .line 91
    .line 92
    move v3, v4

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    const/4 v3, 0x0

    .line 95
    :goto_1
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    xor-int/2addr v4, v5

    .line 102
    invoke-interface {v2, v3, v4}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    return-object v0
.end method

.method public final removeWithdrawListener(Lcom/zykj/blackboard/listener/WithdrawListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->listenerList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final saveSnapshot(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 2

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "backgroundLineConfig"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v1, Lcom/zykj/blackboard/core/edit/HistoryData;

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/zykj/blackboard/core/graph/IGraph;->copy()Lcom/zykj/blackboard/core/graph/Graph;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-direct {v1, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/HistoryData;-><init>(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/16 p2, 0xb

    .line 32
    .line 33
    if-le p1, p2, :cond_0

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {p1}, Li7/a0;->M(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->listenerList:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 63
    .line 64
    iget-object p3, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result p3

    .line 70
    const/4 v0, 0x1

    .line 71
    if-le p3, v0, :cond_1

    .line 72
    .line 73
    move p3, v0

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    const/4 p3, 0x0

    .line 76
    :goto_2
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    xor-int/2addr v0, v1

    .line 83
    invoke-interface {p2, p3, v0}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    return-void
.end method

.method public final withDraw()Lcom/zykj/blackboard/core/edit/HistoryData;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-gt v0, v2, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {v0}, Li7/f0;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/blackboard/core/edit/HistoryData;

    .line 19
    .line 20
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {v0}, Li7/f0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lcom/zykj/blackboard/core/edit/HistoryData;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getRootGraph()Lcom/zykj/blackboard/core/graph/Graph;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3}, Lcom/zykj/blackboard/core/graph/IGraph;->copy()Lcom/zykj/blackboard/core/graph/Graph;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1, v3}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->init(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getBackgroundColor()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {v1, v3}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundColor(I)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/HistoryData;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v1, v3}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->listenerList:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_2

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 93
    .line 94
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-le v4, v2, :cond_1

    .line 101
    .line 102
    move v4, v2

    .line 103
    goto :goto_1

    .line 104
    :cond_1
    const/4 v4, 0x0

    .line 105
    :goto_1
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    xor-int/2addr v5, v2

    .line 112
    invoke-interface {v3, v4, v5}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    return-object v0

    .line 117
    :cond_3
    return-object v1
.end method

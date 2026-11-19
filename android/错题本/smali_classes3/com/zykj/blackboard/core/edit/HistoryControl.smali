.class public final Lcom/zykj/blackboard/core/edit/HistoryControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001cj\u0008\u0012\u0004\u0012\u00020\u000f`\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001cj\u0008\u0012\u0004\u0012\u00020\u000f`\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001fR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u001cj\u0008\u0012\u0004\u0012\u00020\u0016`\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/edit/HistoryControl;",
        "",
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "graphControl",
        "<init>",
        "(Lcom/zykj/blackboard/core/canvas/control/GraphControl;)V",
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "rootGraph",
        "",
        "backgroundColor",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "backgroundLineConfig",
        "Ld6/s;",
        "saveSnapshot",
        "(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V",
        "Lcom/zykj/blackboard/core/edit/HistoryData;",
        "withDraw",
        "()Lcom/zykj/blackboard/core/edit/HistoryData;",
        "recover",
        "clearHistoryList",
        "()V",
        "clearHistoryListWithoutCurrent",
        "Lcom/zykj/blackboard/listener/WithdrawListener;",
        "listener",
        "addWithdrawListener",
        "(Lcom/zykj/blackboard/listener/WithdrawListener;)V",
        "removeWithdrawListener",
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "historyList",
        "Ljava/util/ArrayList;",
        "recycleList",
        "listenerList",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final LIST_SIZE:I = 0xa


# instance fields
.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final historyList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/zykj/blackboard/core/edit/HistoryData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/blackboard/core/edit/HistoryControl;->Companion:Lcom/zykj/blackboard/core/edit/HistoryControl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/canvas/control/GraphControl;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/canvas/control/GraphControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graphControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/blackboard/listener/WithdrawListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .locals 8

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
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v3, v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    check-cast v4, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 28
    .line 29
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    const/4 v6, 0x1

    .line 36
    if-le v5, v6, :cond_0

    .line 37
    .line 38
    move v5, v6

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v5, v2

    .line 41
    :goto_1
    iget-object v7, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    xor-int/2addr v6, v7

    .line 48
    invoke-interface {v4, v5, v6}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-void
.end method

.method public final clearHistoryListWithoutCurrent()V
    .locals 8

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
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 12
    .line 13
    const-string v2, "<this>"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->listenerList:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    move v4, v1

    .line 41
    :goto_1
    if-ge v4, v3, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    check-cast v5, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 50
    .line 51
    iget-object v6, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-le v6, v2, :cond_2

    .line 58
    .line 59
    move v6, v2

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move v6, v1

    .line 62
    :goto_2
    iget-object v7, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    xor-int/2addr v7, v2

    .line 69
    invoke-interface {v5, v6, v7}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    return-void
.end method

.method public final recover()Lcom/zykj/blackboard/core/edit/HistoryData;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

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
    invoke-static {v0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v3, 0x0

    .line 72
    move v4, v3

    .line 73
    :goto_0
    if-ge v4, v2, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    check-cast v5, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 82
    .line 83
    iget-object v6, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    const/4 v7, 0x1

    .line 90
    if-le v6, v7, :cond_1

    .line 91
    .line 92
    move v6, v7

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    move v6, v3

    .line 95
    :goto_1
    iget-object v8, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    xor-int/2addr v7, v8

    .line 102
    invoke-interface {v5, v6, v7}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

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
    .param p1    # Lcom/zykj/blackboard/listener/WithdrawListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .locals 5
    .param p1    # Lcom/zykj/blackboard/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "backgroundLineConfig"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {p1}, Lkotlin/collections/y;->a0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    const/4 p3, 0x0

    .line 53
    move v0, p3

    .line 54
    :goto_1
    if-ge v0, p2, :cond_2

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    add-int/lit8 v0, v0, 0x1

    .line 61
    .line 62
    check-cast v1, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 63
    .line 64
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    const/4 v3, 0x1

    .line 71
    if-le v2, v3, :cond_1

    .line 72
    .line 73
    move v2, v3

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    move v2, p3

    .line 76
    :goto_2
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    xor-int/2addr v3, v4

    .line 83
    invoke-interface {v1, v2, v3}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    return-void
.end method

.method public final withDraw()Lcom/zykj/blackboard/core/edit/HistoryData;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

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
    invoke-static {v0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-static {v0}, Lkotlin/collections/t;->p0(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    const/4 v4, 0x0

    .line 83
    move v5, v4

    .line 84
    :goto_0
    if-ge v5, v3, :cond_2

    .line 85
    .line 86
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    add-int/lit8 v5, v5, 0x1

    .line 91
    .line 92
    check-cast v6, Lcom/zykj/blackboard/listener/WithdrawListener;

    .line 93
    .line 94
    iget-object v7, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->historyList:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-le v7, v2, :cond_1

    .line 101
    .line 102
    move v7, v2

    .line 103
    goto :goto_1

    .line 104
    :cond_1
    move v7, v4

    .line 105
    :goto_1
    iget-object v8, p0, Lcom/zykj/blackboard/core/edit/HistoryControl;->recycleList:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    xor-int/2addr v8, v2

    .line 112
    invoke-interface {v6, v7, v8}, Lcom/zykj/blackboard/listener/WithdrawListener;->onWithdraw(ZZ)V

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

.class public final Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/execute/CommandExecute;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/zykj/blackboard/core/execute/CommandExecute<",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;",
        "Lcom/zykj/blackboard/core/execute/CommandExecute;",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "sourceLoader",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "graphControl",
        "<init>",
        "(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V",
        "data",
        "Ld6/s;",
        "execute",
        "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;)V",
        "",
        "skipTime",
        "Lcom/zykj/blackboard/core/execute/PlayThread;",
        "asyncExecute",
        "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;J)Lcom/zykj/blackboard/core/execute/PlayThread;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
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
.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/loader/SourceLoader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphControl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 0
    .param p1    # Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string p2, "data"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic asyncExecute(Ljava/lang/Object;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1
.end method

.method public execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;)V
    .locals 4
    .param p1    # Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;->getGraphDataList()Ljava/util/List;

    move-result-object p1

    const-string v1, "data.graphDataList"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 5
    iget-object v2, p0, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-interface {v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->rootGraph()Lcom/zykj/blackboard/core/graph/IGraph;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getGraphId()Ljava/lang/String;

    move-result-object v1

    const-string v3, "it.graphId"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Lcom/zykj/blackboard/core/graph/IGraph;->findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-interface {p1, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->delete(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic execute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;)V

    return-void
.end method

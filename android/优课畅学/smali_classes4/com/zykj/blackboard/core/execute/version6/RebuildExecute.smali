.class public final Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/execute/CommandExecute;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/zykj/blackboard/core/execute/CommandExecute<",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;",
        ">;"
    }
.end annotation


# instance fields
.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

.field private final sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "graphControl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 0

    const-string p2, "data"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic asyncExecute(Ljava/lang/Object;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1
.end method

.method public execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    iget-object v1, p0, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->j()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v2

    const-string v3, "data.snapshot"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/zykj/blackboard/utils/GraphUtils;->buildGraph(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/blackboard/core/graph/Graph;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-interface {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->init(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->getBackgroundColor()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->updateBackgroundColor(I)V

    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->g()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    move-result-object p1

    const-string v1, "data.backgroundLineConfig"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toConfig(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 6
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    :cond_0
    return-void
.end method

.method public bridge synthetic execute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

    return-void
.end method

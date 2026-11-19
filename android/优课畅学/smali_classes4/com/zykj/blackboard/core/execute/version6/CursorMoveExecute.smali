.class public final Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/execute/CommandExecute;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/zykj/blackboard/core/execute/CommandExecute<",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;",
        ">;"
    }
.end annotation


# instance fields
.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

.field private final matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

.field private final sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrixAdapter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "graphControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 3

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 3
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->g()Ljava/lang/String;

    move-result-object v1

    const-string v2, "data.sourceFileName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->h()I

    move-result p1

    invoke-interface {v0, v1, p1}, Lcom/zykj/blackboard/core/loader/SourceLoader;->getTouchCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/blackboard/core/play/CursorMoveThread;

    invoke-direct {v0}, Lcom/zykj/blackboard/core/play/CursorMoveThread;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->setGraphControl(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->setSourceLoader(Lcom/zykj/blackboard/core/loader/SourceLoader;)V

    .line 7
    iget-object v1, p0, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V

    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/play/CursorMoveThread;->setTouchInfo(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;J)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic asyncExecute(Ljava/lang/Object;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1
.end method

.method public execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->selectCancel()V

    return-void
.end method

.method public bridge synthetic execute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;)V

    return-void
.end method

.class public final Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/execute/CommandExecute;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/zykj/blackboard/core/execute/CommandExecute<",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0015R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;",
        "Lcom/zykj/blackboard/core/execute/CommandExecute;",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "sourceLoader",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "graphControl",
        "<init>",
        "(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V",
        "data",
        "Ld6/s;",
        "execute",
        "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V",
        "",
        "skipTime",
        "Lcom/zykj/blackboard/core/execute/PlayThread;",
        "asyncExecute",
        "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;J)Lcom/zykj/blackboard/core/execute/PlayThread;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
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

.field private final matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/loader/SourceLoader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
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
    const-string v0, "matrixAdapter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "graphControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 3
    .param p1    # Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->getSourceFileName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "data.sourceFileName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->getSourceId()I

    move-result p1

    invoke-interface {v0, v1, p1}, Lcom/zykj/blackboard/core/loader/SourceLoader;->getMatrixCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    new-instance v0, Lcom/zykj/blackboard/core/play/CameraMatrixThread;

    invoke-direct {v0}, Lcom/zykj/blackboard/core/play/CameraMatrixThread;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->setGraphControl(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->setSourceLoader(Lcom/zykj/blackboard/core/loader/SourceLoader;)V

    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V

    .line 7
    invoke-virtual {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/play/CameraMatrixThread;->setMatrixInfo(Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic asyncExecute(Ljava/lang/Object;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1
.end method

.method public execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V
    .locals 2
    .param p1    # Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->getLastMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object p1

    const-string v1, "data.lastMatrix"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->setCameraMatrix(Landroid/graphics/Matrix;)V

    .line 3
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    invoke-interface {p1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    return-void
.end method

.method public bridge synthetic execute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V

    return-void
.end method

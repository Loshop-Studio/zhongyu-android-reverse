.class public final Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;
.super Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0011\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103\u00a8\u00064"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;",
        "Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "sourceLoader",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "graphControl",
        "<init>",
        "(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V",
        "",
        "async",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;",
        "command",
        "",
        "skipTime",
        "Lcom/zykj/blackboard/core/execute/PlayThread;",
        "executeCommand",
        "(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "Ld6/s;",
        "(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V",
        "Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;",
        "graphDataExecute",
        "Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;",
        "Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;",
        "graphRemoveExecute",
        "Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;",
        "Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;",
        "graphMatrixExecute",
        "Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;",
        "Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;",
        "cameraMatrixExecute",
        "Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;",
        "Lcom/zykj/blackboard/core/execute/version6/CameraExecute;",
        "cameraExecute",
        "Lcom/zykj/blackboard/core/execute/version6/CameraExecute;",
        "Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;",
        "configExecute",
        "Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;",
        "Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;",
        "graphChangeExecute",
        "Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;",
        "Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;",
        "recordStopExecute",
        "Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;",
        "Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;",
        "cursorMoveExecute",
        "Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;",
        "Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;",
        "rebuildExecute",
        "Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;",
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
.field private final cameraExecute:Lcom/zykj/blackboard/core/execute/version6/CameraExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cameraMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final configExecute:Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cursorMoveExecute:Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final graphChangeExecute:Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final graphDataExecute:Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final graphMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final graphRemoveExecute:Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rebuildExecute:Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final recordStopExecute:Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;
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
    invoke-direct {p0}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;

    .line 20
    .line 21
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;-><init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphDataExecute:Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;

    .line 25
    .line 26
    new-instance v0, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;

    .line 27
    .line 28
    invoke-direct {v0, p1, p3}, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;-><init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphRemoveExecute:Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;

    .line 32
    .line 33
    new-instance v0, Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;

    .line 34
    .line 35
    invoke-direct {v0, p1, p3}, Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;-><init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;

    .line 39
    .line 40
    new-instance v0, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;

    .line 41
    .line 42
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;-><init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cameraMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;

    .line 46
    .line 47
    new-instance v0, Lcom/zykj/blackboard/core/execute/version6/CameraExecute;

    .line 48
    .line 49
    invoke-direct {v0, p2, p3}, Lcom/zykj/blackboard/core/execute/version6/CameraExecute;-><init>(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cameraExecute:Lcom/zykj/blackboard/core/execute/version6/CameraExecute;

    .line 53
    .line 54
    new-instance v0, Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;

    .line 55
    .line 56
    invoke-direct {v0, p1, p3}, Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;-><init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->configExecute:Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;

    .line 60
    .line 61
    new-instance v0, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;

    .line 62
    .line 63
    invoke-direct {v0, p1, p3}, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;-><init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphChangeExecute:Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;

    .line 67
    .line 68
    new-instance v0, Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;

    .line 69
    .line 70
    invoke-direct {v0, p1, p3}, Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;-><init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->recordStopExecute:Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;

    .line 74
    .line 75
    new-instance v0, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;

    .line 76
    .line 77
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;-><init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cursorMoveExecute:Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;

    .line 81
    .line 82
    new-instance p2, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;

    .line 83
    .line 84
    invoke-direct {p2, p1, p3}, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;-><init>(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 85
    .line 86
    .line 87
    iput-object p2, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->rebuildExecute:Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public executeCommand(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;
    .locals 2
    .param p2    # Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "command"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const-string v1, "data"

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 2
    :pswitch_0
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    move-result-object p2

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->rebuildExecute:Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->rebuildExecute:Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

    goto/16 :goto_1

    .line 5
    :pswitch_1
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;

    move-result-object p2

    if-eqz p1, :cond_2

    .line 6
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cursorMoveExecute:Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cursorMoveExecute:Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;)V

    goto/16 :goto_1

    .line 8
    :pswitch_2
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/google/protobuf/Any;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/Any;

    move-result-object p2

    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->recordStopExecute:Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;->asyncExecute(Lcom/google/protobuf/Any;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1

    .line 10
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->recordStopExecute:Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;->execute(Lcom/google/protobuf/Any;)V

    goto/16 :goto_1

    .line 11
    :pswitch_3
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object p2

    if-eqz p1, :cond_4

    .line 12
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphChangeExecute:Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1

    .line 13
    :cond_4
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphChangeExecute:Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    goto/16 :goto_1

    .line 14
    :pswitch_4
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;

    move-result-object p2

    if-eqz p1, :cond_5

    .line 15
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->configExecute:Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1

    .line 16
    :cond_5
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->configExecute:Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;)V

    goto/16 :goto_1

    .line 17
    :pswitch_5
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    move-result-object p2

    if-eqz p1, :cond_6

    .line 18
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cameraMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1

    .line 19
    :cond_6
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cameraMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V

    goto/16 :goto_1

    .line 20
    :pswitch_6
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;

    move-result-object p2

    if-eqz p1, :cond_7

    .line 21
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cameraExecute:Lcom/zykj/blackboard/core/execute/version6/CameraExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/CameraExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1

    .line 22
    :cond_7
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cameraExecute:Lcom/zykj/blackboard/core/execute/version6/CameraExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/CameraExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;)V

    goto :goto_1

    .line 23
    :pswitch_7
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    move-result-object p2

    if-eqz p1, :cond_8

    .line 24
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1

    .line 25
    :cond_8
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V

    goto :goto_1

    .line 26
    :pswitch_8
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;

    move-result-object p2

    if-eqz p1, :cond_9

    .line 27
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphRemoveExecute:Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    goto :goto_1

    .line 28
    :cond_9
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphRemoveExecute:Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;)V

    goto :goto_1

    .line 29
    :pswitch_9
    invoke-virtual {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getData()Lcom/google/protobuf/ByteString;

    move-result-object p2

    invoke-static {p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object p2

    if-eqz p1, :cond_a

    .line 30
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphDataExecute:Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    move-result-object p1

    return-object p1

    .line 31
    :cond_a
    iget-object p1, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphDataExecute:Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)V

    :goto_1
    const/4 p1, 0x0

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public executeCommand(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 2
    .param p1    # Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    move-result-object v0

    sget-object v1, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const-string v1, "data"

    packed-switch v0, :pswitch_data_0

    return-void

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;

    move-result-object p1

    .line 34
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->rebuildExecute:Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/RebuildExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$REBUILD;)V

    return-void

    .line 35
    :pswitch_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;

    move-result-object p1

    .line 36
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cursorMoveExecute:Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/CursorMoveExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CursorMove;)V

    return-void

    .line 37
    :pswitch_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/protobuf/Any;->parseFrom([B)Lcom/google/protobuf/Any;

    move-result-object p1

    .line 38
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->recordStopExecute:Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/RecordStopExecute;->execute(Lcom/google/protobuf/Any;)V

    return-void

    .line 39
    :pswitch_3
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;

    move-result-object p1

    .line 40
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphChangeExecute:Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V

    return-void

    .line 41
    :pswitch_4
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;

    move-result-object p1

    .line 42
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->configExecute:Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/ConfigExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;)V

    return-void

    .line 43
    :pswitch_5
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    move-result-object p1

    .line 44
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cameraMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/CameraMatrixExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V

    return-void

    .line 45
    :pswitch_6
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;

    move-result-object p1

    .line 46
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->cameraExecute:Lcom/zykj/blackboard/core/execute/version6/CameraExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/CameraExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;)V

    return-void

    .line 47
    :pswitch_7
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    move-result-object p1

    .line 48
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphMatrixExecute:Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V

    return-void

    .line 49
    :pswitch_8
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;

    move-result-object p1

    .line 50
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphRemoveExecute:Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/GraphRemoveExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphRemove;)V

    return-void

    .line 51
    :pswitch_9
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object p1

    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object p1

    .line 52
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/version6/CommandExecuteFactory6;->graphDataExecute:Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public abstract Lcom/zykj/blackboard/core/play/BasePlayPageControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/play/IPlayPageControl;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u000f\u001a\u00020\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\nH\u0004\u00a2\u0006\u0004\u0008\u001c\u0010\u0012J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\'\u001a\u0004\u0008(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010*\u001a\u0004\u0008+\u0010,R\"\u0010-\u001a\u00020\u00088\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\"\u0004\u00081\u0010\u000cR\"\u00102\u001a\u00020\u00088\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u00082\u0010.\u001a\u0004\u00083\u00100\"\u0004\u00084\u0010\u000cR\u001a\u00106\u001a\u0002058\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109R\u001a\u0010;\u001a\u00020:8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R\u001a\u0010@\u001a\u00020?8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010CR\u001a\u0010E\u001a\u00020D8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010HR\"\u0010J\u001a\u00020I8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008J\u0010K\u001a\u0004\u0008L\u0010M\"\u0004\u0008N\u0010OR\u001a\u0010Q\u001a\u00020P8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008Q\u0010R\u001a\u0004\u0008S\u0010TR\u001a\u0010V\u001a\u00020U8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u001a\u0004\u0008X\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\"\u0010^\u001a\u00020]8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010a\"\u0004\u0008b\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\"\u0010k\u001a\u00020j8\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008k\u0010l\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010qR\u001c\u0010t\u001a\n s*\u0004\u0018\u00010r0r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010u\u00a8\u0006v"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/play/BasePlayPageControl;",
        "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
        "Lcom/zykj/blackboard/core/play/IPlayControl;",
        "playControl",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "renderLayer",
        "<init>",
        "(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V",
        "",
        "pageName",
        "Ld6/s;",
        "loadPath",
        "(Ljava/lang/String;)V",
        "Lkotlin/Function0;",
        "callBack",
        "show",
        "(Lr6/a;)V",
        "hide",
        "()V",
        "Lcom/zykj/blackboard/enums/PlayStatus;",
        "status",
        "()Lcom/zykj/blackboard/enums/PlayStatus;",
        "Lcom/zykj/blackboard/listener/PlayStatusListener;",
        "listener",
        "addPlayActionListener",
        "(Lcom/zykj/blackboard/listener/PlayStatusListener;)V",
        "removePlayActionListener",
        "release",
        "initExecute",
        "Lcom/zykj/blackboard/bean/MoveActionConfig;",
        "moveActionConfig",
        "Lcom/zykj/board/EzyHeader$MoveConfig;",
        "moveConfig",
        "copyMoveConfig",
        "(Lcom/zykj/blackboard/bean/MoveActionConfig;Lcom/zykj/board/EzyHeader$MoveConfig;)V",
        "",
        "isPlay",
        "setSeeActionIsPlay",
        "(Z)V",
        "Lcom/zykj/blackboard/core/play/IPlayControl;",
        "getPlayControl",
        "()Lcom/zykj/blackboard/core/play/IPlayControl;",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "getRenderLayer",
        "()Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "mPageDirPath",
        "Ljava/lang/String;",
        "getMPageDirPath",
        "()Ljava/lang/String;",
        "setMPageDirPath",
        "mPageDirName",
        "getMPageDirName",
        "setMPageDirName",
        "Lcom/zykj/blackboard/core/loader/CacheSourceLoader;",
        "cacheSourceLoad",
        "Lcom/zykj/blackboard/core/loader/CacheSourceLoader;",
        "getCacheSourceLoad",
        "()Lcom/zykj/blackboard/core/loader/CacheSourceLoader;",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "getMatrixAdapter",
        "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "boardConfig",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "getBoardConfig",
        "()Lcom/zykj/blackboard/bean/BoardConfig;",
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "graphControl",
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "getGraphControl",
        "()Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "Lcom/zykj/blackboard/bean/PlaySpeed;",
        "playSpeed",
        "Lcom/zykj/blackboard/bean/PlaySpeed;",
        "getPlaySpeed",
        "()Lcom/zykj/blackboard/bean/PlaySpeed;",
        "setPlaySpeed",
        "(Lcom/zykj/blackboard/bean/PlaySpeed;)V",
        "Lcom/zykj/blackboard/core/play/CommandThread;",
        "commandThread",
        "Lcom/zykj/blackboard/core/play/CommandThread;",
        "getCommandThread",
        "()Lcom/zykj/blackboard/core/play/CommandThread;",
        "Lcom/zykj/blackboard/core/play/AudioCommandThread;",
        "audioCommandThread",
        "Lcom/zykj/blackboard/core/play/AudioCommandThread;",
        "getAudioCommandThread",
        "()Lcom/zykj/blackboard/core/play/AudioCommandThread;",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "execute",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "",
        "totalDuration",
        "J",
        "getTotalDuration",
        "()J",
        "setTotalDuration",
        "(J)V",
        "",
        "lastBackgroundColor",
        "I",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "lastBackgroundLineConfig",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "Lcom/zykj/blackboard/core/action/ActionManager;",
        "actionManager",
        "Lcom/zykj/blackboard/core/action/ActionManager;",
        "getActionManager",
        "()Lcom/zykj/blackboard/core/action/ActionManager;",
        "setActionManager",
        "(Lcom/zykj/blackboard/core/action/ActionManager;)V",
        "Lcom/zykj/blackboard/listener/PlayStatusListener;",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "executor",
        "Ljava/util/concurrent/ExecutorService;",
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
.field private actionManager:Lcom/zykj/blackboard/core/action/ActionManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final audioCommandThread:Lcom/zykj/blackboard/core/play/AudioCommandThread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cacheSourceLoad:Lcom/zykj/blackboard/core/loader/CacheSourceLoader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final commandThread:Lcom/zykj/blackboard/core/play/CommandThread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private execute:Ljava/util/concurrent/ScheduledExecutorService;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final executor:Ljava/util/concurrent/ExecutorService;

.field private final graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private lastBackgroundColor:I

.field private lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final listener:Lcom/zykj/blackboard/listener/PlayStatusListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mPageDirName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mPageDirPath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final playControl:Lcom/zykj/blackboard/core/play/IPlayControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private totalDuration:J


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
    .locals 13
    .param p1    # Lcom/zykj/blackboard/core/play/IPlayControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "playControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "renderLayer"

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
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->playControl:Lcom/zykj/blackboard/core/play/IPlayControl;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirPath:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirName:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v4, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 25
    .line 26
    invoke-direct {v4}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v4, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->cacheSourceLoad:Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 30
    .line 31
    new-instance v3, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 32
    .line 33
    invoke-direct {v3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v3, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 37
    .line 38
    new-instance v2, Lcom/zykj/blackboard/bean/BoardConfig;

    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p2}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-direct {v2, p1, v0}, Lcom/zykj/blackboard/bean/BoardConfig;-><init>(II)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Lcom/zykj/board/EzyModeEnum$ModeEnum;->ACTION_SEE:Lcom/zykj/board/EzyModeEnum$ModeEnum;

    .line 60
    .line 61
    invoke-virtual {v2, p1}, Lcom/zykj/blackboard/bean/BoardConfig;->setMode(Lcom/zykj/board/EzyModeEnum$ModeEnum;)V

    .line 62
    .line 63
    .line 64
    iput-object v2, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 65
    .line 66
    new-instance v1, Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 67
    .line 68
    invoke-direct {v1, v3, p2, v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;-><init>(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 72
    .line 73
    new-instance p1, Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 74
    .line 75
    invoke-direct {p1}, Lcom/zykj/blackboard/bean/PlaySpeed;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 79
    .line 80
    new-instance p1, Lcom/zykj/blackboard/core/play/CommandThread;

    .line 81
    .line 82
    invoke-direct {p1}, Lcom/zykj/blackboard/core/play/CommandThread;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->commandThread:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 86
    .line 87
    new-instance p2, Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 88
    .line 89
    invoke-direct {p2}, Lcom/zykj/blackboard/core/play/AudioCommandThread;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->audioCommandThread:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 93
    .line 94
    const/4 v0, 0x1

    .line 95
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v5, "newScheduledThreadPool(1)"

    .line 100
    .line 101
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 105
    .line 106
    new-instance v6, Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 107
    .line 108
    const/16 v11, 0xf

    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    invoke-direct/range {v6 .. v12}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;-><init>(IFLcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;FILkotlin/jvm/internal/e;)V

    .line 116
    .line 117
    .line 118
    iput-object v6, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 119
    .line 120
    new-instance v0, Lcom/zykj/blackboard/core/action/ActionManager;

    .line 121
    .line 122
    const/16 v7, 0x30

    .line 123
    .line 124
    const/4 v8, 0x0

    .line 125
    const/4 v5, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    invoke-direct/range {v0 .. v8}, Lcom/zykj/blackboard/core/action/ActionManager;-><init>(Lcom/zykj/blackboard/core/canvas/control/GraphControl;Lcom/zykj/blackboard/bean/BoardConfig;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/record/SourceRouterRecord;Lcom/zykj/blackboard/core/edit/HistoryControl;ILkotlin/jvm/internal/e;)V

    .line 128
    .line 129
    .line 130
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 131
    .line 132
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/execute/PlayThread;->setPlaySpeed(Lcom/zykj/blackboard/bean/PlaySpeed;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 138
    .line 139
    invoke-virtual {p2, p1}, Lcom/zykj/blackboard/core/execute/PlayThread;->setPlaySpeed(Lcom/zykj/blackboard/bean/PlaySpeed;)V

    .line 140
    .line 141
    .line 142
    new-instance p1, Lcom/zykj/blackboard/core/play/BasePlayPageControl$1;

    .line 143
    .line 144
    invoke-direct {p1, p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl$1;-><init>(Lcom/zykj/blackboard/core/play/BasePlayPageControl;)V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->listener:Lcom/zykj/blackboard/listener/PlayStatusListener;

    .line 148
    .line 149
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->executor:Ljava/util/concurrent/ExecutorService;

    .line 154
    .line 155
    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Lr6/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->show$lambda-4(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Lr6/a;)V

    return-void
.end method

.method public static final synthetic access$setSeeActionIsPlay(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->setSeeActionIsPlay(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final copyMoveConfig(Lcom/zykj/blackboard/bean/MoveActionConfig;Lcom/zykj/board/EzyHeader$MoveConfig;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->getIsEnable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMoveActionEnable(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->getVerticalTranslate()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setVerticalTranslate(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->getHorizontalTranslate()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setHorizontalTranslate(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->getScale()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setScale(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->getRotate()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setRotate(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxWidthTimes()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxWidthTimes(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxHeightTimes()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMaxHeightTimes(I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private final setSeeActionIsPlay(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/SeeAction;->setPlay(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private static final show$lambda-4(Lcom/zykj/blackboard/core/play/BasePlayPageControl;Lr6/a;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callBack"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "playThread = "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, " show"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lcom/zykj/blackboard/utils/GraphUtils;->INSTANCE:Lcom/zykj/blackboard/utils/GraphUtils;

    .line 44
    .line 45
    new-instance v1, Ljava/io/File;

    .line 46
    .line 47
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirPath:Ljava/lang/String;

    .line 48
    .line 49
    const-string v3, "snapshot.bin"

    .line 50
    .line 51
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "File(mPageDirPath, BaseP\u2026T_FILE_NAME).absolutePath"

    .line 59
    .line 60
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/GraphUtils;->snapshotGraphToGraph(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz v1, :cond_0

    .line 68
    .line 69
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 70
    .line 71
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->getCameraMatrix()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    const-string v4, "this.cameraMatrix"

    .line 76
    .line 77
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v3}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toMatrix(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->setCameraMatrix(Landroid/graphics/Matrix;)V

    .line 85
    .line 86
    .line 87
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->cacheSourceLoad:Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->getGraphSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const-string v3, "this.graphSnapshot"

    .line 94
    .line 95
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v2, v1}, Lcom/zykj/blackboard/utils/GraphUtils;->buildGraph(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_0

    .line 103
    .line 104
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 105
    .line 106
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->init(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 107
    .line 108
    .line 109
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 110
    .line 111
    iget v1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->lastBackgroundColor:I

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundColor(I)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 117
    .line 118
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->updateBackgroundMatrix()V

    .line 126
    .line 127
    .line 128
    iget-object p0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reDrawFixView()V

    .line 131
    .line 132
    .line 133
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    return-void
.end method


# virtual methods
.method public addPlayActionListener(Lcom/zykj/blackboard/listener/PlayStatusListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/listener/PlayStatusListener;
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->commandThread:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlayListener()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->audioCommandThread:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCacheSourceLoad()Lcom/zykj/blackboard/core/loader/CacheSourceLoader;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->cacheSourceLoad:Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->commandThread:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMPageDirName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMPageDirPath()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlayControl()Lcom/zykj/blackboard/core/play/IPlayControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->playControl:Lcom/zykj/blackboard/core/play/IPlayControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRenderLayer()Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTotalDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->totalDuration:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hide()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final initExecute()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "{\n            Executors.\u2026edThreadPool(2)\n        }"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    move-object v2, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "{\n            execute.sh\u2026edThreadPool(2)\n        }"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    iput-object v2, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->commandThread:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 39
    .line 40
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 41
    .line 42
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    const-wide/16 v6, 0x10

    .line 45
    .line 46
    invoke-interface/range {v2 .. v8}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 50
    .line 51
    iget-object v5, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->audioCommandThread:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 52
    .line 53
    const-wide/16 v6, 0x0

    .line 54
    .line 55
    move-object v10, v8

    .line 56
    const-wide/16 v8, 0x10

    .line 57
    .line 58
    invoke-interface/range {v4 .. v10}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public loadPath(Ljava/lang/String;)V
    .locals 13
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const-string v0, "pageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->playControl:Lcom/zykj/blackboard/core/play/IPlayControl;

    .line 9
    .line 10
    invoke-interface {v1}, Lcom/zykj/blackboard/core/play/IPlayControl;->getRootPath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "File(playControl.getRoot\u2026), pageName).absolutePath"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirPath:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirName:Ljava/lang/String;

    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->cacheSourceLoad:Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->initPath(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lcom/zykj/blackboard/core/data/SourceLoad;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceLoad;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirPath:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/SourceLoad;->getHeader(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Header;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-string v1, " supportLastVersion=6"

    .line 48
    .line 49
    const-string v2, "version="

    .line 50
    .line 51
    const/4 v3, 0x6

    .line 52
    if-gt v0, v3, :cond_4

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-lt v0, v3, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDuration()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->totalDuration:J

    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x1

    .line 76
    const-wide/16 v4, 0x0

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    check-cast v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 81
    .line 82
    iget-wide v6, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->totalDuration:J

    .line 83
    .line 84
    cmp-long v1, v6, v4

    .line 85
    .line 86
    if-lez v1, :cond_0

    .line 87
    .line 88
    move v1, v3

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move v1, v2

    .line 91
    :goto_0
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/SeeAction;->setPlay(Z)V

    .line 92
    .line 93
    .line 94
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;->getRenderRect()Landroid/graphics/Rect;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    iget-wide v10, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->totalDuration:J

    .line 119
    .line 120
    cmp-long v0, v10, v4

    .line 121
    .line 122
    if-lez v0, :cond_2

    .line 123
    .line 124
    move v10, v3

    .line 125
    goto :goto_1

    .line 126
    :cond_2
    move v10, v2

    .line 127
    :goto_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxWidthTimes()I

    .line 132
    .line 133
    .line 134
    move-result v11

    .line 135
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;->getMaxHeightTimes()I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    invoke-static/range {v6 .. v12}, Lcom/zykj/blackboard/core/edit/PageControlExtKt;->getScreenMatrix(IIIIZII)Landroid/graphics/Matrix;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v1, v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->setScreenMatrix(Landroid/graphics/Matrix;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->commandThread:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/play/CommandThread;->setVersion(I)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundColor()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->setDefaultBackgroundColor(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundColor()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iput v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->lastBackgroundColor:I

    .line 173
    .line 174
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 175
    .line 176
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getDefaultBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const-string v2, "header.defaultBackgroundLineConfig"

    .line 181
    .line 182
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toConfig(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->setDefaultBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getLastBackgroundLineConfig()Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    const-string v1, "header.lastBackgroundLineConfig"

    .line 197
    .line 198
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v0}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toConfig(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 206
    .line 207
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 208
    .line 209
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getMoveConfig()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    const-string v2, "header.moveConfig"

    .line 222
    .line 223
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-direct {p0, v0, v1}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->copyMoveConfig(Lcom/zykj/blackboard/bean/MoveActionConfig;Lcom/zykj/board/EzyHeader$MoveConfig;)V

    .line 227
    .line 228
    .line 229
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 230
    .line 231
    new-instance v1, Landroid/graphics/RectF;

    .line 232
    .line 233
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getWidth()I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    int-to-float v2, v2

    .line 238
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getHeight()I

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    int-to-float p1, p1

    .line 243
    const/4 v3, 0x0

    .line 244
    invoke-direct {v1, v3, v3, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->setOldPageRectF(Landroid/graphics/RectF;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_3
    new-instance v0, Lcom/zykj/blackboard/exception/LowVersionException;

    .line 252
    .line 253
    new-instance v3, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/exception/LowVersionException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw v0

    .line 276
    :cond_4
    new-instance v0, Lcom/zykj/blackboard/exception/HighVersionException;

    .line 277
    .line 278
    new-instance v3, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Header;->getVersion()I

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/exception/HighVersionException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v0
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->commandThread:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/CommandThread;->shutdown()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->audioCommandThread:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->shutdown()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->graphControl:Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->release()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->cacheSourceLoad:Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/loader/CacheSourceLoader;->release()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public removePlayActionListener(Lcom/zykj/blackboard/listener/PlayStatusListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/listener/PlayStatusListener;
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
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->commandThread:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlayListener()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setActionManager(Lcom/zykj/blackboard/core/action/ActionManager;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/action/ActionManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->actionManager:Lcom/zykj/blackboard/core/action/ActionManager;

    .line 7
    .line 8
    return-void
.end method

.method public final setMPageDirName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setMPageDirPath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->mPageDirPath:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setPlaySpeed(Lcom/zykj/blackboard/bean/PlaySpeed;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/bean/PlaySpeed;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 7
    .line 8
    return-void
.end method

.method public final setTotalDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->totalDuration:J

    .line 2
    .line 3
    return-void
.end method

.method public show(Lr6/a;)V
    .locals 3
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callBack"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->executor:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/blackboard/core/play/f;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, v2, p0, p1}, Lcom/zykj/blackboard/core/play/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public status()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->commandThread:Lcom/zykj/blackboard/core/play/CommandThread;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getStatus()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

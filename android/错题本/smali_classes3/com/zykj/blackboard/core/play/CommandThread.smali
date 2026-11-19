# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/blackboard/core/play/CommandThread;
.super Lcom/zykj/blackboard/core/execute/PlayThread;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0003J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008 \u0010\u0003J\u000f\u0010!\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\"\u0010\u0003J\u0015\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&R\u0016\u0010\'\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010(R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0016\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010+R\u001c\u00102\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u001c\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u0001048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0016\u00107\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u0010(R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010;\u00a8\u0006<"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/play/CommandThread;",
        "Lcom/zykj/blackboard/core/execute/PlayThread;",
        "<init>",
        "()V",
        "",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;",
        "iterator",
        "",
        "readCommand",
        "(Ljava/util/ListIterator;)Z",
        "fastReadCommandAndPause",
        "next",
        "isNeedPlay",
        "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z",
        "loadNextCommandIterator",
        "()Z",
        "",
        "seekTime",
        "Ld6/s;",
        "fastLoading",
        "(J)V",
        "run",
        "",
        "path",
        "setPageRootPath",
        "(Ljava/lang/String;)V",
        "seekTo",
        "totalDuration",
        "setMaxPlayTime",
        "startPlay",
        "pausePlay",
        "resumePlay",
        "stopPlay",
        "shutdown",
        "reset",
        "",
        "version",
        "setVersion",
        "(I)V",
        "playTime",
        "J",
        "nextCommandTime",
        "commandIterator",
        "Ljava/util/ListIterator;",
        "pageRootPath",
        "Ljava/lang/String;",
        "Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;",
        "fileSourceIterator",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "execute",
        "Ljava/util/concurrent/ExecutorService;",
        "",
        "threadList",
        "Ljava/util/List;",
        "maxDuration",
        "Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;",
        "commandExecuteFactory",
        "Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;",
        "I",
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
.field private commandExecuteFactory:Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private commandIterator:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final execute:Ljava/util/concurrent/ExecutorService;

.field private fileSourceIterator:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maxDuration:J

.field private nextCommandTime:J

.field private pageRootPath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private playTime:J

.field private threadList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/execute/PlayThread;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private version:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->pageRootPath:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->execute:Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    iput v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->version:I

    .line 23
    .line 24
    return-void
.end method

.method public static final synthetic access$getCommandExecuteFactory$p(Lcom/zykj/blackboard/core/play/CommandThread;)Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandExecuteFactory:Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getThreadList$p(Lcom/zykj/blackboard/core/play/CommandThread;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method private final fastLoading(J)V
    .locals 3

    .line 1
    const-string v0, "\u5373\u5c06\u5feb\u8fdb"

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandIterator:Ljava/util/ListIterator;

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/play/CommandThread;->fastReadCommandAndPause(Ljava/util/ListIterator;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/blackboard/core/play/CommandThread;->loadNextCommandIterator()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const-string v0, "\u88c5\u8f7d\u4e86\u4e0b\u4e00\u4e2a \u547d\u4ee4\u96c6\u5408"

    .line 23
    .line 24
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "\u5feb\u8fdb\u7ed3\u675f nextCommandTime = "

    .line 33
    .line 34
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-wide v1, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const-wide/16 v0, 0x1

    .line 52
    .line 53
    cmp-long v0, v0, p1

    .line 54
    .line 55
    if-gtz v0, :cond_1

    .line 56
    .line 57
    iget-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->maxDuration:J

    .line 58
    .line 59
    cmp-long p1, p1, v0

    .line 60
    .line 61
    if-gez p1, :cond_1

    .line 62
    .line 63
    sget-object p1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_PAUSE:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    sget-object p1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 67
    .line 68
    :goto_1
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/execute/PlayThread;->setPlayStatus(Lcom/zykj/blackboard/enums/PlayStatus;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method private final fastReadCommandAndPause(Ljava/util/ListIterator;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ListIterator<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_8

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 16
    .line 17
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const-string v4, "  next.delayTime = "

    .line 27
    .line 28
    if-gez v2, :cond_2

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "\u5feb\u8fdb\u65f6\uff0c\u65f6\u95f4\u6ca1\u5230,\u5feb\u8fdb\u5373\u5c06\u7ed3\u675f nextCommandTime = "

    .line 33
    .line 34
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-wide v5, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 38
    .line 39
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_1
    return v3

    .line 71
    :cond_2
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/play/CommandThread;->isNeedPlay(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_5

    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getIsPlay()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_5

    .line 82
    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v5, "\u5feb\u8fdb\u5230\u9700\u8981\u64ad\u653e\u7684\u6307\u4ee4 nextCommandTime = "

    .line 86
    .line 87
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-wide v5, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 91
    .line 92
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 99
    .line 100
    .line 101
    move-result-wide v4

    .line 102
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 110
    .line 111
    invoke-virtual {v4, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    invoke-interface {v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->isDraw()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_4

    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    if-eqz v2, :cond_3

    .line 131
    .line 132
    invoke-interface {v2, v3}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->isDraw(Z)V

    .line 133
    .line 134
    .line 135
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-eqz v2, :cond_4

    .line 140
    .line 141
    invoke-interface {v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 142
    .line 143
    .line 144
    :cond_4
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandExecuteFactory:Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 145
    .line 146
    if-eqz v2, :cond_6

    .line 147
    .line 148
    iget-wide v3, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 149
    .line 150
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 151
    .line 152
    .line 153
    move-result-wide v5

    .line 154
    sub-long/2addr v3, v5

    .line 155
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    if-eqz v2, :cond_6

    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    const-string v4, "\u5373\u5c06\u5f02\u6b65\u6267\u884c\u64ad\u653e\u6307\u4ee4 "

    .line 170
    .line 171
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 176
    .line 177
    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setPlaySpeed(Lcom/zykj/blackboard/bean/PlaySpeed;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/execute/PlayThread;->getFinishListener()Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    new-instance v4, Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;

    .line 192
    .line 193
    invoke-direct {v4, p0, v2, v1}, Lcom/zykj/blackboard/core/play/CommandThread$fastReadCommandAndPause$1$1;-><init>(Lcom/zykj/blackboard/core/play/CommandThread;Lcom/zykj/blackboard/core/execute/PlayThread;Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/execute/PlayThread;->pausePlay()V

    .line 200
    .line 201
    .line 202
    iget-object v3, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    iget-object v3, p0, Lcom/zykj/blackboard/core/play/CommandThread;->execute:Ljava/util/concurrent/ExecutorService;

    .line 208
    .line 209
    invoke-interface {v3, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_5
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandExecuteFactory:Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 214
    .line 215
    if-eqz v2, :cond_6

    .line 216
    .line 217
    invoke-virtual {v2, v1}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 218
    .line 219
    .line 220
    :cond_6
    :goto_1
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getIsPlay()Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_7

    .line 225
    .line 226
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 227
    .line 228
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 229
    .line 230
    .line 231
    move-result-wide v4

    .line 232
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDuration()J

    .line 233
    .line 234
    .line 235
    move-result-wide v6

    .line 236
    add-long/2addr v6, v4

    .line 237
    sub-long/2addr v2, v6

    .line 238
    iput-wide v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 239
    .line 240
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    const-string v2, "\u5feb\u8fdb\u4e2d nextCommandTime = "

    .line 243
    .line 244
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 248
    .line 249
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 257
    .line 258
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_8
    const-string p1, "\u5feb\u8fdb\u4e2d \u6ca1\u6709\u547d\u4ee4\u5566\uff01\uff01\uff01\uff0c\u8d76\u5feb\u53bb\u88c5\u8f7d\u4e0b\u4e2a\u6307\u4ee4\u96c6\u5408"

    .line 264
    .line 265
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 266
    .line 267
    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return v0
.end method

.method private final isNeedPlay(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDuration()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    cmp-long v0, v2, v4

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDuration()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    add-long/2addr v6, v4

    .line 34
    cmp-long p1, v2, v6

    .line 35
    .line 36
    if-gez p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_1
    return v1
.end method

.method private final loadNextCommandIterator()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->fileSourceIterator:Ljava/util/ListIterator;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 17
    .line 18
    new-instance v1, Ljava/io/File;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->pageRootPath:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Ljava/io/FileInputStream;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lcom/zykj/board/EzyCommand$CommandSource;->parseFrom(Ljava/io/InputStream;)Lcom/zykj/board/EzyCommand$CommandSource;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource;->getCommandInfoList()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v3}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iput-object v3, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandIterator:Ljava/util/ListIterator;

    .line 47
    .line 48
    new-instance v3, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v4, "\u547d\u4ee4\u6587\u4ef6\u540d="

    .line 51
    .line 52
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, "  \u547d\u4ee4\u957f\u5ea6="

    .line 63
    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource;->getCommandInfoList()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x1

    .line 91
    return v0

    .line 92
    :cond_0
    return v1
.end method

.method private final readCommand(Ljava/util/ListIterator;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ListIterator<",
            "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_9

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getIsPlay()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_7

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-interface {v3}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->isDraw()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-interface {v3, v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->isDraw(Z)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {v2}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 52
    .line 53
    .line 54
    :cond_2
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    cmp-long v2, v2, v4

    .line 61
    .line 62
    if-gez v2, :cond_4

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_3
    return v0

    .line 74
    :cond_4
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/play/CommandThread;->isNeedPlay(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandExecuteFactory:Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 81
    .line 82
    if-eqz v2, :cond_6

    .line 83
    .line 84
    iget-wide v3, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    sub-long/2addr v3, v5

    .line 91
    invoke-virtual {v2, v1, v3, v4}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->asyncExecute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-eqz v2, :cond_6

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setPlaySpeed(Lcom/zykj/blackboard/bean/PlaySpeed;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/execute/PlayThread;->getFinishListener()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    new-instance v4, Lcom/zykj/blackboard/core/play/CommandThread$readCommand$1$1;

    .line 109
    .line 110
    invoke-direct {v4, p0, v2, v1}, Lcom/zykj/blackboard/core/play/CommandThread$readCommand$1$1;-><init>(Lcom/zykj/blackboard/core/play/CommandThread;Lcom/zykj/blackboard/core/execute/PlayThread;Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/execute/PlayThread;->startPlay()V

    .line 117
    .line 118
    .line 119
    iget-object v3, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    iget-object v3, p0, Lcom/zykj/blackboard/core/play/CommandThread;->execute:Ljava/util/concurrent/ExecutorService;

    .line 125
    .line 126
    invoke-interface {v3, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandExecuteFactory:Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 131
    .line 132
    if-eqz v2, :cond_6

    .line 133
    .line 134
    invoke-virtual {v2, v1}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 135
    .line 136
    .line 137
    :cond_6
    :goto_1
    iget-wide v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDelayTime()J

    .line 140
    .line 141
    .line 142
    move-result-wide v4

    .line 143
    invoke-virtual {v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->getDuration()J

    .line 144
    .line 145
    .line 146
    move-result-wide v6

    .line 147
    add-long/2addr v6, v4

    .line 148
    sub-long/2addr v2, v6

    .line 149
    iput-wide v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-eqz v2, :cond_8

    .line 158
    .line 159
    invoke-interface {v2, v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->isDraw(Z)V

    .line 160
    .line 161
    .line 162
    :cond_8
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandExecuteFactory:Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 163
    .line 164
    if-eqz v2, :cond_0

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_9
    return v2
.end method


# virtual methods
.method public pausePlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->pausePlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->pausePlay()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public reset()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->reset()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->playTime:J

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->shutdown()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public resumePlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->resumePlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->resumePlay()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandExecuteFactory:Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getSourceLoader()Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget-object v3, Lcom/zykj/blackboard/core/execute/CommandFactory;->INSTANCE:Lcom/zykj/blackboard/core/execute/CommandFactory;

    .line 24
    .line 25
    iget v4, p0, Lcom/zykj/blackboard/core/play/CommandThread;->version:I

    .line 26
    .line 27
    invoke-virtual {v3, v4, v0, v2, v1}, Lcom/zykj/blackboard/core/execute/CommandFactory;->createCommandFactory(ILcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandExecuteFactory:Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 32
    .line 33
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlayStatus()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_PAUSE:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 38
    .line 39
    if-ne v0, v1, :cond_1

    .line 40
    .line 41
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlayStatus()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 48
    .line 49
    if-ne v0, v1, :cond_2

    .line 50
    .line 51
    const-wide/16 v0, 0x0

    .line 52
    .line 53
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->playTime:J

    .line 54
    .line 55
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandIterator:Ljava/util/ListIterator;

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/play/CommandThread;->readCommand(Ljava/util/ListIterator;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlayStatus()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_START:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 71
    .line 72
    if-eq v0, v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlayStatus()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_RESUME:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 79
    .line 80
    if-ne v0, v1, :cond_4

    .line 81
    .line 82
    :cond_3
    invoke-direct {p0}, Lcom/zykj/blackboard/core/play/CommandThread;->loadNextCommandIterator()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    :cond_4
    iget-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    const/16 v3, 0x10

    .line 95
    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/PlaySpeed;->getPlayIncrement()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    goto :goto_0

    .line 103
    :cond_5
    move v2, v3

    .line 104
    :goto_0
    int-to-long v4, v2

    .line 105
    add-long/2addr v0, v4

    .line 106
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 107
    .line 108
    iget-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->playTime:J

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/PlaySpeed;->getPlayIncrement()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    goto :goto_1

    .line 121
    :cond_6
    move v2, v3

    .line 122
    :goto_1
    int-to-long v4, v2

    .line 123
    add-long/2addr v0, v4

    .line 124
    iput-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->playTime:J

    .line 125
    .line 126
    iget-wide v4, p0, Lcom/zykj/blackboard/core/play/CommandThread;->maxDuration:J

    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-eqz v2, :cond_7

    .line 133
    .line 134
    invoke-virtual {v2}, Lcom/zykj/blackboard/bean/PlaySpeed;->getPlayIncrement()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    :cond_7
    int-to-long v2, v3

    .line 139
    add-long/2addr v4, v2

    .line 140
    cmp-long v0, v0, v4

    .line 141
    .line 142
    if-lez v0, :cond_a

    .line 143
    .line 144
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/CommandThread;->stopPlay()V

    .line 145
    .line 146
    .line 147
    iget-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->maxDuration:J

    .line 148
    .line 149
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->notifyProgress(J)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    if-eqz v0, :cond_8

    .line 157
    .line 158
    const/4 v1, 0x1

    .line 159
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->isDraw(Z)V

    .line 160
    .line 161
    .line 162
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_9

    .line 167
    .line 168
    invoke-interface {v0}, Lcom/zykj/blackboard/core/canvas/control/IGraphControl;->reDrawFixView()V

    .line 169
    .line 170
    .line 171
    :cond_9
    :goto_2
    return-void

    .line 172
    :cond_a
    iget-wide v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->playTime:J

    .line 173
    .line 174
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->notifyProgress(J)V

    .line 175
    .line 176
    .line 177
    return-void
.end method

.method public final seekTo(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/play/CommandThread;->playTime:J

    .line 2
    .line 3
    iput-wide p1, p0, Lcom/zykj/blackboard/core/play/CommandThread;->nextCommandTime:J

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->fileSourceIterator:Ljava/util/ListIterator;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->shutdown()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-wide/16 v0, 0x32

    .line 42
    .line 43
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Lcom/zykj/blackboard/core/play/CommandThread;->loadNextCommandIterator()Z

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/play/CommandThread;->fastLoading(J)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final setMaxPlayTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/play/CommandThread;->maxDuration:J

    .line 2
    .line 3
    return-void
.end method

.method public final setPageRootPath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getRouter(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->getCommandRecordList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->fileSourceIterator:Ljava/util/ListIterator;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/CommandThread;->pageRootPath:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/zykj/blackboard/core/play/CommandThread;->loadNextCommandIterator()Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final setVersion(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/play/CommandThread;->version:I

    .line 2
    .line 3
    return-void
.end method

.method public shutdown()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->shutdown()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/execute/PlayThread;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    monitor-exit v0

    .line 32
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->execute:Ljava/util/concurrent/ExecutorService;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->fileSourceIterator:Ljava/util/ListIterator;

    .line 39
    .line 40
    iput-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->commandIterator:Ljava/util/ListIterator;

    .line 41
    .line 42
    return-void

    .line 43
    :goto_1
    monitor-exit v0

    .line 44
    throw v1
.end method

.method public startPlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->startPlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->startPlay()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public stopPlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/execute/PlayThread;->stopPlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/CommandThread;->threadList:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/zykj/blackboard/core/execute/PlayThread;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/execute/PlayThread;->stopPlay()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

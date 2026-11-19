.class public final Lcom/zykj/blackboard/core/play/PlayPageControl;
.super Lcom/zykj/blackboard/core/play/BasePlayPageControl;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ9\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u0014H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008$\u0010#J\u000f\u0010%\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0019\u0010)\u001a\u00020\t2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008+\u0010\u000eJ#\u0010.\u001a\u00020\t2\u0008\u0010,\u001a\u0004\u0018\u00010\u00192\u0008\u0010-\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0004\u0008.\u0010/J#\u00100\u001a\u00020\t2\u0008\u0010,\u001a\u0004\u0018\u00010\u00192\u0008\u0010-\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0004\u00080\u0010/J\u000f\u00101\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u00081\u00102J\u000f\u00103\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u00083\u00102J\u000f\u00105\u001a\u000204H\u0016\u00a2\u0006\u0004\u00085\u00106J\u000f\u00107\u001a\u000204H\u0016\u00a2\u0006\u0004\u00087\u00106J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010<\u001a\u00020\t2\u0006\u00109\u001a\u000208H\u0016\u00a2\u0006\u0004\u0008<\u0010;J\u0011\u0010>\u001a\u0004\u0018\u00010=H\u0016\u00a2\u0006\u0004\u0008>\u0010?R#\u0010F\u001a\n A*\u0004\u0018\u00010@0@8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010E\u00a8\u0006G"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/play/PlayPageControl;",
        "Lcom/zykj/blackboard/core/play/BasePlayPageControl;",
        "Lcom/zykj/blackboard/core/play/IPlayControl;",
        "playControl",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "renderLayer",
        "<init>",
        "(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "callBack",
        "initCommandThread",
        "(Lr6/a;)V",
        "start",
        "()V",
        "resume",
        "pause",
        "",
        "skip",
        "onSuccess",
        "Lkotlin/Function1;",
        "",
        "onError",
        "seekTo",
        "(JLr6/a;Lr6/c;)V",
        "",
        "rate",
        "setRate",
        "(F)V",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)V",
        "",
        "getPageDirPath",
        "()Ljava/lang/String;",
        "getPageDirName",
        "getDuration",
        "()J",
        "Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "listener",
        "setAreaMoveListener",
        "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V",
        "areaMoveStart",
        "horizontalProgress",
        "verticalProgress",
        "areaMoving",
        "(Ljava/lang/Float;Ljava/lang/Float;)V",
        "areaMoveEnd",
        "getMoveVerticalProgress",
        "()F",
        "getMoveHorizontalProgress",
        "",
        "getMoveMaxWidthTimes",
        "()I",
        "getMoveMaxHeightTimes",
        "",
        "isEnable",
        "setTranslateEnable",
        "(Z)V",
        "setScaleEnable",
        "Landroid/graphics/Bitmap;",
        "getCurrentScreenShot",
        "()Landroid/graphics/Bitmap;",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "singleExecutor$delegate",
        "Ld6/e;",
        "getSingleExecutor",
        "()Ljava/util/concurrent/ExecutorService;",
        "singleExecutor",
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
.field private final singleExecutor$delegate:Ld6/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
    .locals 1
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
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;-><init>(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lcom/zykj/blackboard/core/play/PlayPageControl$singleExecutor$2;->INSTANCE:Lcom/zykj/blackboard/core/play/PlayPageControl$singleExecutor$2;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl;->singleExecutor$delegate:Ld6/e;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic b(Lcom/zykj/blackboard/core/play/PlayPageControl;Lr6/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayPageControl;->initCommandThread$lambda-0(Lcom/zykj/blackboard/core/play/PlayPageControl;Lr6/a;)V

    return-void
.end method

.method private final getSingleExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayPageControl;->singleExecutor$delegate:Ld6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    return-object v0
.end method

.method private final initCommandThread(Lr6/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/play/PlayPageControl;->getSingleExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/blackboard/core/play/f;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v1, v2, p0, p1}, Lcom/zykj/blackboard/core/play/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final initCommandThread$lambda-0(Lcom/zykj/blackboard/core/play/PlayPageControl;Lr6/a;)V
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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->status()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "playThread = "

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, " initCommandThread"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/CommandThread;->reset()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->reset()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->resetCamera()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reset()V

    .line 77
    .line 78
    .line 79
    const-wide/16 v0, 0x32

    .line 80
    .line 81
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setGraphControl(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCacheSourceLoad()Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setSourceLoader(Lcom/zykj/blackboard/core/loader/SourceLoader;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMPageDirPath()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/play/CommandThread;->setPageRootPath(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getTotalDuration()J

    .line 133
    .line 134
    .line 135
    move-result-wide v3

    .line 136
    invoke-virtual {v2, v3, v4}, Lcom/zykj/blackboard/core/play/CommandThread;->setMaxPlayTime(J)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setGraphControl(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCacheSourceLoad()Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setSourceLoader(Lcom/zykj/blackboard/core/loader/SourceLoader;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMPageDirPath()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->setPageRootPath(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getTotalDuration()J

    .line 177
    .line 178
    .line 179
    move-result-wide v3

    .line 180
    invoke-virtual {v2, v3, v4}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->setMaxPlayTime(J)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->initExecute()V

    .line 187
    .line 188
    .line 189
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_0
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    return-void
.end method


# virtual methods
.method public areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/SeeAction;->areaMovEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public areaMoveStart()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/SeeAction;->areaMoveStart()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/zykj/blackboard/core/action/SeeAction;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public getCurrentScreenShot()Landroid/graphics/Bitmap;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->screenshot()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getDuration()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getTotalDuration()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public getMoveHorizontalProgress()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/SeeAction;->getHorizontalProgress()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
.end method

.method public getMoveMaxHeightTimes()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxHeightTimes()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public getMoveMaxWidthTimes()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/MoveActionConfig;->getMaxWidthTimes()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public getMoveVerticalProgress()F
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getCurrentAction()Lcom/zykj/blackboard/core/action/ITouchAction;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "MoveProgress"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    instance-of v1, v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Lcom/zykj/blackboard/core/action/SeeAction;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/SeeAction;->getVerticalProgress()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public getPageDirName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMPageDirName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getPageDirPath()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMPageDirPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)V
    .locals 1
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/ActionManager;->handleTouchEvent(Landroid/view/MotionEvent;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public pause()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->status()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_START:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->status()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_RESUME:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/CommandThread;->pausePlay()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->pausePlay()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public resume()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->status()Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_PAUSE:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/CommandThread;->resumePlay()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->resumePlay()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->initExecute()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public seekTo(JLr6/a;Lr6/c;)V
    .locals 7
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lr6/a;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onError"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;

    .line 12
    .line 13
    move-object v2, p0

    .line 14
    move-wide v3, p1

    .line 15
    move-object v5, p3

    .line 16
    move-object v6, p4

    .line 17
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;JLr6/a;Lr6/c;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/play/PlayPageControl;->initCommandThread(Lr6/a;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/listener/IAreaMoveListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/action/ActionManager;->setMAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setRate(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/PlaySpeed;->setRate(F)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->setRate(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setScaleEnable(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMoveActionEnable(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setHorizontalTranslate(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setVerticalTranslate(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setScale(Z)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setTranslateEnable(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getActionManager()Lcom/zykj/blackboard/core/action/ActionManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/ActionManager;->getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lcom/zykj/blackboard/bean/MoveActionConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setMoveActionEnable(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setHorizontalTranslate(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/bean/MoveActionConfig;->setVerticalTranslate(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/play/PlayPageControl$start$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/blackboard/core/play/PlayPageControl$start$1;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/play/PlayPageControl;->initCommandThread(Lr6/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

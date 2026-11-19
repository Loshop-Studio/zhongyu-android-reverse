.class public final Lcom/zykj/blackboard/core/play/PlayPageControl;
.super Lcom/zykj/blackboard/core/play/BasePlayPageControl;
.source "SourceFile"


# instance fields
.field private final singleExecutor$delegate:Lh7/d;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
    .locals 1

    .line 1
    const-string v0, "playControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "renderLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {p1}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl;->singleExecutor$delegate:Lh7/d;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic b(Lcom/zykj/blackboard/core/play/PlayPageControl;Lx7/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/play/PlayPageControl;->initCommandThread$lambda-0(Lcom/zykj/blackboard/core/play/PlayPageControl;Lx7/a;)V

    return-void
.end method

.method private final getSingleExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayPageControl;->singleExecutor$delegate:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

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

.method private final initCommandThread(Lx7/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
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
    new-instance v1, Lcom/zykj/blackboard/core/play/j;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/zykj/blackboard/core/play/j;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;Lx7/a;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final initCommandThread$lambda-0(Lcom/zykj/blackboard/core/play/PlayPageControl;Lx7/a;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callBack"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "playThread = "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, " initCommandThread"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/CommandThread;->reset()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->reset()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->resetCamera()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->reset()V

    .line 80
    .line 81
    .line 82
    const-wide/16 v0, 0x32

    .line 83
    .line 84
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setGraphControl(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCacheSourceLoad()Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setSourceLoader(Lcom/zykj/blackboard/core/loader/SourceLoader;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMPageDirPath()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/play/CommandThread;->setPageRootPath(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCommandThread()Lcom/zykj/blackboard/core/play/CommandThread;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getTotalDuration()J

    .line 136
    .line 137
    .line 138
    move-result-wide v3

    .line 139
    invoke-virtual {v2, v3, v4}, Lcom/zykj/blackboard/core/play/CommandThread;->setMaxPlayTime(J)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setGraphControl(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getCacheSourceLoad()Lcom/zykj/blackboard/core/loader/CacheSourceLoader;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/execute/PlayThread;->setSourceLoader(Lcom/zykj/blackboard/core/loader/SourceLoader;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getMPageDirPath()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->setPageRootPath(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getAudioCommandThread()Lcom/zykj/blackboard/core/play/AudioCommandThread;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->getTotalDuration()J

    .line 180
    .line 181
    .line 182
    move-result-wide v3

    .line 183
    invoke-virtual {v2, v3, v4}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->setMaxPlayTime(J)V

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/BasePlayPageControl;->initExecute()V

    .line 190
    .line 191
    .line 192
    invoke-interface {p1}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_0
    invoke-interface {p1}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    return-void
.end method


# virtual methods
.method public areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
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

    .line 1
    const-string v0, "motionEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public seekTo(JLx7/a;Lx7/l;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lx7/a;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onError"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;-><init>(Lcom/zykj/blackboard/core/play/PlayPageControl;JLx7/a;Lx7/l;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/play/PlayPageControl;->initCommandThread(Lx7/a;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setAreaMoveListener(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V
    .locals 1

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
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/play/PlayPageControl;->initCommandThread(Lx7/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

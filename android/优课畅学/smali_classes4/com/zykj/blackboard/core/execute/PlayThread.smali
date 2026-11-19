.class public abstract Lcom/zykj/blackboard/core/execute/PlayThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private finishListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/execute/PlayFinishListener;",
            ">;"
        }
    .end annotation
.end field

.field private graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

.field private matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

.field private playListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/listener/PlayStatusListener;",
            ">;"
        }
    .end annotation
.end field

.field private playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

.field private playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

.field private sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->finishListener:Ljava/util/List;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v1, "PlayThread "

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final getFinishListener()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/execute/PlayFinishListener;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->finishListener:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlayListener()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/listener/PlayStatusListener;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlayStatus()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSourceLoader()Lcom/zykj/blackboard/core/loader/SourceLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStatus()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final notifyFinish(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->finishListener:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/blackboard/core/execute/PlayFinishListener;

    .line 18
    .line 19
    invoke-interface {v1, p0, p1}, Lcom/zykj/blackboard/core/execute/PlayFinishListener;->finish(Lcom/zykj/blackboard/core/execute/PlayThread;Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final notifyProgress(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/zykj/blackboard/listener/PlayStatusListener;

    .line 18
    .line 19
    invoke-interface {v1, p1, p2}, Lcom/zykj/blackboard/listener/PlayStatusListener;->onProgress(J)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public pausePlay()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_PAUSE:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/zykj/blackboard/listener/PlayStatusListener;

    .line 22
    .line 23
    invoke-interface {v1}, Lcom/zykj/blackboard/listener/PlayStatusListener;->onPlayPause()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

.method public resumePlay()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_RESUME:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/zykj/blackboard/listener/PlayStatusListener;

    .line 22
    .line 23
    invoke-interface {v1}, Lcom/zykj/blackboard/listener/PlayStatusListener;->onPlayResume()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final setFinishListener(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/execute/PlayFinishListener;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->finishListener:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setGraphControl(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    return-void
.end method

.method public final setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayListener(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/listener/PlayStatusListener;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public final setPlaySpeed(Lcom/zykj/blackboard/bean/PlaySpeed;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayStatus(Lcom/zykj/blackboard/enums/PlayStatus;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 7
    .line 8
    return-void
.end method

.method public final setSourceLoader(Lcom/zykj/blackboard/core/loader/SourceLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 2
    .line 3
    return-void
.end method

.method public shutdown()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/zykj/blackboard/listener/PlayStatusListener;

    .line 22
    .line 23
    invoke-interface {v1}, Lcom/zykj/blackboard/listener/PlayStatusListener;->onPlayEnd()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public startPlay()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_START:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/zykj/blackboard/listener/PlayStatusListener;

    .line 22
    .line 23
    invoke-interface {v1}, Lcom/zykj/blackboard/listener/PlayStatusListener;->onPlayStart()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public stopPlay()V
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/PlayStatus;->RECORD_END:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/zykj/blackboard/listener/PlayStatusListener;

    .line 22
    .line 23
    invoke-interface {v1}, Lcom/zykj/blackboard/listener/PlayStatusListener;->onPlayEnd()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.class public abstract Lcom/zykj/blackboard/core/execute/PlayThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J\u000f\u0010\u0008\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0003J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R\"\u0010+\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010\u000b\"\u0004\u0008.\u0010/R$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R(\u00109\u001a\u0008\u0012\u0004\u0012\u000208078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<\"\u0004\u0008=\u0010>R(\u0010@\u001a\u0008\u0012\u0004\u0012\u00020?078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u0010:\u001a\u0004\u0008A\u0010<\"\u0004\u0008B\u0010>\u00a8\u0006C"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/execute/PlayThread;",
        "Ljava/lang/Thread;",
        "<init>",
        "()V",
        "Ld6/s;",
        "startPlay",
        "resumePlay",
        "pausePlay",
        "stopPlay",
        "Lcom/zykj/blackboard/enums/PlayStatus;",
        "getStatus",
        "()Lcom/zykj/blackboard/enums/PlayStatus;",
        "reset",
        "shutdown",
        "",
        "playTime",
        "notifyProgress",
        "(J)V",
        "",
        "isCompleted",
        "notifyFinish",
        "(Z)V",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "graphControl",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "getGraphControl",
        "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "setGraphControl",
        "(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "sourceLoader",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "getSourceLoader",
        "()Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "setSourceLoader",
        "(Lcom/zykj/blackboard/core/loader/SourceLoader;)V",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "getMatrixAdapter",
        "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "setMatrixAdapter",
        "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V",
        "playStatus",
        "Lcom/zykj/blackboard/enums/PlayStatus;",
        "getPlayStatus",
        "setPlayStatus",
        "(Lcom/zykj/blackboard/enums/PlayStatus;)V",
        "Lcom/zykj/blackboard/bean/PlaySpeed;",
        "playSpeed",
        "Lcom/zykj/blackboard/bean/PlaySpeed;",
        "getPlaySpeed",
        "()Lcom/zykj/blackboard/bean/PlaySpeed;",
        "setPlaySpeed",
        "(Lcom/zykj/blackboard/bean/PlaySpeed;)V",
        "",
        "Lcom/zykj/blackboard/listener/PlayStatusListener;",
        "playListener",
        "Ljava/util/List;",
        "getPlayListener",
        "()Ljava/util/List;",
        "setPlayListener",
        "(Ljava/util/List;)V",
        "Lcom/zykj/blackboard/core/execute/PlayFinishListener;",
        "finishListener",
        "getFinishListener",
        "setFinishListener",
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
.field private finishListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/execute/PlayFinishListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private playListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/listener/PlayStatusListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private playStatus:Lcom/zykj/blackboard/enums/PlayStatus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


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
    const-string v1, "PlayThread "

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

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
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->finishListener:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playListener:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaySpeed()Lcom/zykj/blackboard/bean/PlaySpeed;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlayStatus()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSourceLoader()Lcom/zykj/blackboard/core/loader/SourceLoader;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStatus()Lcom/zykj/blackboard/enums/PlayStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->graphControl:Lcom/zykj/blackboard/core/canvas/control/IGraphControl;

    .line 2
    .line 3
    return-void
.end method

.method public final setMatrixAdapter(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->matrixAdapter:Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayListener(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/blackboard/bean/PlaySpeed;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playSpeed:Lcom/zykj/blackboard/bean/PlaySpeed;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayStatus(Lcom/zykj/blackboard/enums/PlayStatus;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/enums/PlayStatus;
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
    iput-object p1, p0, Lcom/zykj/blackboard/core/execute/PlayThread;->playStatus:Lcom/zykj/blackboard/enums/PlayStatus;

    .line 7
    .line 8
    return-void
.end method

.method public final setSourceLoader(Lcom/zykj/blackboard/core/loader/SourceLoader;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/core/loader/SourceLoader;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

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

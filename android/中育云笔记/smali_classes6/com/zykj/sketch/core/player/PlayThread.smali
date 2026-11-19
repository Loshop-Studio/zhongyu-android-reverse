.class public abstract Lcom/zykj/sketch/core/player/PlayThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field private playStatus:Lcom/zykj/sketch/core/data/PlayStatus;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStatus()Lcom/zykj/sketch/core/data/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public pausePlay()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_PAUSE:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

.method public reset()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

.method public resumePlay()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_RESUME:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

.method public final setPlayStatus(Lcom/zykj/sketch/core/data/PlayStatus;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 7
    .line 8
    return-void
.end method

.method public shutdown()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

.method public startPlay()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_START:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

.method public stopPlay()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

.method public waitPlay()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_WAIT:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 4
    .line 5
    return-void
.end method

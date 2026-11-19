.class public abstract Lcom/zykj/sketch/core/player/PlayThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0016J\u0008\u0010\u000c\u001a\u00020\u000bH\u0016J\u0008\u0010\r\u001a\u00020\u000bH\u0016J\u0008\u0010\u000e\u001a\u00020\u000bH\u0016J\u0008\u0010\u000f\u001a\u00020\u000bH\u0016J\u0008\u0010\u0010\u001a\u00020\u000bH\u0016J\u0008\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/zykj/sketch/core/player/PlayThread;",
        "Ljava/lang/Thread;",
        "()V",
        "playStatus",
        "Lcom/zykj/sketch/core/data/PlayStatus;",
        "getPlayStatus",
        "()Lcom/zykj/sketch/core/data/PlayStatus;",
        "setPlayStatus",
        "(Lcom/zykj/sketch/core/data/PlayStatus;)V",
        "getStatus",
        "pausePlay",
        "",
        "reset",
        "resumePlay",
        "shutdown",
        "startPlay",
        "stopPlay",
        "waitPlay",
        "sketch_release"
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

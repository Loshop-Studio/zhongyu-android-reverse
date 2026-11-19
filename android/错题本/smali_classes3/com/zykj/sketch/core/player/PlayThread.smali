.class public abstract Lcom/zykj/sketch/core/player/PlayThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J\u000f\u0010\u0008\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u0003R\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u000c\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/zykj/sketch/core/player/PlayThread;",
        "Ljava/lang/Thread;",
        "<init>",
        "()V",
        "Ld6/s;",
        "startPlay",
        "resumePlay",
        "pausePlay",
        "waitPlay",
        "stopPlay",
        "Lcom/zykj/sketch/core/data/PlayStatus;",
        "getStatus",
        "()Lcom/zykj/sketch/core/data/PlayStatus;",
        "reset",
        "shutdown",
        "playStatus",
        "Lcom/zykj/sketch/core/data/PlayStatus;",
        "getPlayStatus",
        "setPlayStatus",
        "(Lcom/zykj/sketch/core/data/PlayStatus;)V",
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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


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
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PlayThread;->playStatus:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStatus()Lcom/zykj/sketch/core/data/PlayStatus;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

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
    .param p1    # Lcom/zykj/sketch/core/data/PlayStatus;
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

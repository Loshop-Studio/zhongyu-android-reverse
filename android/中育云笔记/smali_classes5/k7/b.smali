.class public abstract Lk7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltv/danmaku/ijk/media/player/IMediaPlayer$OnPreparedListener;
.implements Ltv/danmaku/ijk/media/player/IMediaPlayer$OnCompletionListener;
.implements Ltv/danmaku/ijk/media/player/IMediaPlayer$OnBufferingUpdateListener;
.implements Ltv/danmaku/ijk/media/player/IMediaPlayer$OnSeekCompleteListener;
.implements Ltv/danmaku/ijk/media/player/IMediaPlayer$OnErrorListener;
.implements Ltv/danmaku/ijk/media/player/IMediaPlayer$OnVideoSizeChangedListener;
.implements Ltv/danmaku/ijk/media/player/IMediaPlayer$OnInfoListener;
.implements Lcom/shuyu/gsyvideoplayer/cache/ICacheManager$ICacheAvailableListener;
.implements Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoViewBridge;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7/b$i;
    }
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Lk7/b$i;

.field public c:Landroid/os/Handler;

.field public d:Ljava/lang/ref/WeakReference;

.field public e:Ljava/lang/ref/WeakReference;

.field public f:Lcom/shuyu/gsyvideoplayer/player/IPlayerInitSuccessListener;

.field public g:Ljava/util/List;

.field public h:Ljava/lang/String;

.field public i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

.field public j:Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:Z

.field public s:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lk7/b;->h:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lk7/b;->k:I

    .line 10
    .line 11
    iput v0, p0, Lk7/b;->l:I

    .line 12
    .line 13
    const/16 v1, -0x16

    .line 14
    .line 15
    iput v1, p0, Lk7/b;->n:I

    .line 16
    .line 17
    const/16 v1, 0x1f40

    .line 18
    .line 19
    iput v1, p0, Lk7/b;->p:I

    .line 20
    .line 21
    iput-boolean v0, p0, Lk7/b;->q:Z

    .line 22
    .line 23
    new-instance v0, Lk7/b$h;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lk7/b$h;-><init>(Lk7/b;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lk7/b;->s:Ljava/lang/Runnable;

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic a(Lk7/b;Landroid/os/Message;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk7/b;->j(Landroid/os/Message;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lk7/b;Landroid/os/Message;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk7/b;->k(Landroid/os/Message;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    const-string v0, "cancelTimeOutBuffer"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/shuyu/gsyvideoplayer/utils/Debuger;->printfError(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lk7/b;->r:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 11
    .line 12
    iget-object v1, p0, Lk7/b;->s:Ljava/lang/Runnable;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public cachePreview(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk7/b;->f()Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lk7/b;->f()Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1, p2, p3}, Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;->cachePreview(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public clearCache(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lk7/b;->e(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, Lk7/b;->e(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public e(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->j:Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;->clearCache(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Lk7/b;->f()Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lk7/b;->f()Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, p1, p2, p3}, Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;->clearCache(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public f()Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/cache/CacheFactory;->getCacheManager()Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g()Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/shuyu/gsyvideoplayer/player/PlayerFactory;->getPlayManager()Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getBufferedPercentage()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->getBufferedPercentage()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getCurrentPosition()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->getCurrentPosition()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public getCurrentVideoHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lk7/b;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public getCurrentVideoWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lk7/b;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public getDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->getDuration()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public getLastState()I
    .locals 1

    .line 1
    iget v0, p0, Lk7/b;->m:I

    .line 2
    .line 3
    return v0
.end method

.method public getNetSpeed()J
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->getNetSpeed()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    return-wide v0
.end method

.method public getPlayPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lk7/b;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public getPlayTag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPlayer()Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRotateInfoFlag()I
    .locals 1

    .line 1
    const/16 v0, 0x2711

    .line 2
    .line 3
    return v0
.end method

.method public getVideoHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->getVideoHeight()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getVideoSarDen()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->getVideoSarDen()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getVideoSarNum()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->getVideoSarNum()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getVideoWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->getVideoWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public h()V
    .locals 2

    .line 1
    new-instance v0, Lk7/b$i;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p0, v1}, Lk7/b$i;-><init>(Lk7/b;Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lk7/b;->b:Lk7/b$i;

    .line 11
    .line 12
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 18
    .line 19
    return-void
.end method

.method public i(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lk7/b;->a:Landroid/content/Context;

    .line 6
    .line 7
    return-void
.end method

.method public isCacheFile()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->j:Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;->hadCached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public isPlaying()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->isPlaying()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public isSurfaceSupportLockCanvas()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->isSurfaceSupportLockCanvas()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public final j(Landroid/os/Message;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iput v0, p0, Lk7/b;->k:I

    .line 3
    .line 4
    iput v0, p0, Lk7/b;->l:I

    .line 5
    .line 6
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->release()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lk7/b;->g()Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 21
    .line 22
    invoke-virtual {p0}, Lk7/b;->f()Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lk7/b;->j:Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-interface {v0, p0}, Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;->setCacheAvailableListener(Lcom/shuyu/gsyvideoplayer/cache/ICacheManager$ICacheAvailableListener;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 34
    .line 35
    instance-of v1, v0, Lcom/shuyu/gsyvideoplayer/player/BasePlayerManager;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    check-cast v0, Lcom/shuyu/gsyvideoplayer/player/BasePlayerManager;

    .line 40
    .line 41
    iget-object v1, p0, Lk7/b;->f:Lcom/shuyu/gsyvideoplayer/player/IPlayerInitSuccessListener;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/shuyu/gsyvideoplayer/player/BasePlayerManager;->setPlayerInitSuccessListener(Lcom/shuyu/gsyvideoplayer/player/IPlayerInitSuccessListener;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 47
    .line 48
    iget-object v1, p0, Lk7/b;->a:Landroid/content/Context;

    .line 49
    .line 50
    iget-object v2, p0, Lk7/b;->g:Ljava/util/List;

    .line 51
    .line 52
    iget-object v3, p0, Lk7/b;->j:Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;

    .line 53
    .line 54
    invoke-interface {v0, v1, p1, v2, v3}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->initVideoPlayer(Landroid/content/Context;Landroid/os/Message;Ljava/util/List;Lcom/shuyu/gsyvideoplayer/cache/ICacheManager;)V

    .line 55
    .line 56
    .line 57
    iget-boolean p1, p0, Lk7/b;->q:Z

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lk7/b;->m(Z)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 63
    .line 64
    invoke-interface {p1}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->getMediaPlayer()Ltv/danmaku/ijk/media/player/IMediaPlayer;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1, p0}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->setOnCompletionListener(Ltv/danmaku/ijk/media/player/IMediaPlayer$OnCompletionListener;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, p0}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->setOnBufferingUpdateListener(Ltv/danmaku/ijk/media/player/IMediaPlayer$OnBufferingUpdateListener;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    invoke-interface {p1, v0}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->setScreenOnWhilePlaying(Z)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, p0}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->setOnPreparedListener(Ltv/danmaku/ijk/media/player/IMediaPlayer$OnPreparedListener;)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p1, p0}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->setOnSeekCompleteListener(Ltv/danmaku/ijk/media/player/IMediaPlayer$OnSeekCompleteListener;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, p0}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->setOnErrorListener(Ltv/danmaku/ijk/media/player/IMediaPlayer$OnErrorListener;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, p0}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->setOnInfoListener(Ltv/danmaku/ijk/media/player/IMediaPlayer$OnInfoListener;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1, p0}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->setOnVideoSizeChangedListener(Ltv/danmaku/ijk/media/player/IMediaPlayer$OnVideoSizeChangedListener;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final k(Landroid/os/Message;)V
    .locals 0

    .line 1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->releaseSurface()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public l(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->b:Lk7/b$i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public lastListener()Ll7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ll7/a;

    .line 12
    .line 13
    return-object v0
.end method

.method public listener()Ll7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->d:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ll7/a;

    .line 12
    .line 13
    return-object v0
.end method

.method public m(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lk7/b;->q:Z

    .line 2
    .line 3
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->setNeedMute(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final n(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->showDisplay(Landroid/os/Message;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public o()V
    .locals 4

    .line 1
    const-string v0, "startTimeOutBuffer"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/shuyu/gsyvideoplayer/utils/Debuger;->printfError(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 7
    .line 8
    iget-object v1, p0, Lk7/b;->s:Ljava/lang/Runnable;

    .line 9
    .line 10
    iget v2, p0, Lk7/b;->p:I

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onBufferingUpdate(Ltv/danmaku/ijk/media/player/IMediaPlayer;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lk7/b$c;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lk7/b$c;-><init>(Lk7/b;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onCacheAvailable(Ljava/io/File;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lk7/b;->o:I

    .line 2
    .line 3
    return-void
.end method

.method public onCompletion(Ltv/danmaku/ijk/media/player/IMediaPlayer;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lk7/b$b;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lk7/b$b;-><init>(Lk7/b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onError(Ltv/danmaku/ijk/media/player/IMediaPlayer;II)Z
    .locals 1

    .line 1
    iget-object p1, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lk7/b$e;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2, p3}, Lk7/b$e;-><init>(Lk7/b;II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1
.end method

.method public onInfo(Ltv/danmaku/ijk/media/player/IMediaPlayer;II)Z
    .locals 1

    .line 1
    iget-object p1, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lk7/b$f;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2, p3}, Lk7/b$f;-><init>(Lk7/b;II)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public onPrepared(Ltv/danmaku/ijk/media/player/IMediaPlayer;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lk7/b$a;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lk7/b$a;-><init>(Lk7/b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onSeekComplete(Ltv/danmaku/ijk/media/player/IMediaPlayer;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lk7/b$d;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lk7/b$d;-><init>(Lk7/b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onVideoSizeChanged(Ltv/danmaku/ijk/media/player/IMediaPlayer;IIII)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->getVideoWidth()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iput p2, p0, Lk7/b;->k:I

    .line 6
    .line 7
    invoke-interface {p1}, Ltv/danmaku/ijk/media/player/IMediaPlayer;->getVideoHeight()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Lk7/b;->l:I

    .line 12
    .line 13
    iget-object p1, p0, Lk7/b;->c:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance p2, Lk7/b$g;

    .line 16
    .line 17
    invoke-direct {p2, p0}, Lk7/b$g;-><init>(Lk7/b;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->pause()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public prepare(Ljava/io/BufferedInputStream;Ljava/util/Map;ZFZLjava/io/File;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    .line 8
    invoke-virtual/range {v0 .. v7}, Lk7/b;->prepare(Ljava/io/BufferedInputStream;Ljava/util/Map;ZFZLjava/io/File;Ljava/lang/String;)V

    return-void
.end method

.method public prepare(Ljava/io/BufferedInputStream;Ljava/util/Map;ZFZLjava/io/File;Ljava/lang/String;)V
    .locals 10

    if-nez p1, :cond_0

    return-void

    .line 9
    :cond_0
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x0

    .line 10
    iput v1, v0, Landroid/os/Message;->what:I

    .line 11
    new-instance v2, Lm7/a;

    const/4 v9, 0x0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v2 .. v9}, Lm7/a;-><init>(Ljava/io/BufferedInputStream;Ljava/util/Map;ZFZLjava/io/File;Ljava/lang/String;)V

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 12
    invoke-virtual {p0, v0}, Lk7/b;->l(Landroid/os/Message;)V

    return-void
.end method

.method public prepare(Ljava/lang/String;Ljava/util/Map;ZFZLjava/io/File;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move-object v6, p6

    .line 1
    invoke-virtual/range {v0 .. v7}, Lk7/b;->prepare(Ljava/lang/String;Ljava/util/Map;ZFZLjava/io/File;Ljava/lang/String;)V

    return-void
.end method

.method public prepare(Ljava/lang/String;Ljava/util/Map;ZFZLjava/io/File;Ljava/lang/String;)V
    .locals 10

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/4 v1, 0x0

    .line 4
    iput v1, v0, Landroid/os/Message;->what:I

    .line 5
    new-instance v2, Lm7/a;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v2 .. v9}, Lm7/a;-><init>(Ljava/lang/String;Ljava/util/Map;ZFZLjava/io/File;Ljava/lang/String;)V

    .line 6
    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    invoke-virtual {p0, v0}, Lk7/b;->l(Landroid/os/Message;)V

    return-void
.end method

.method public releaseMediaPlayer()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Message;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    iput v1, v0, Landroid/os/Message;->what:I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lk7/b;->l(Landroid/os/Message;)V

    .line 10
    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    iput-object v0, p0, Lk7/b;->h:Ljava/lang/String;

    .line 15
    .line 16
    const/16 v0, -0x16

    .line 17
    .line 18
    iput v0, p0, Lk7/b;->n:I

    .line 19
    .line 20
    return-void
.end method

.method public releaseSurface(Landroid/view/Surface;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Message;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    iput v1, v0, Landroid/os/Message;->what:I

    .line 8
    .line 9
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lk7/b;->l(Landroid/os/Message;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public seekTo(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->seekTo(J)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setCurrentVideoHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk7/b;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public setCurrentVideoWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk7/b;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public setDisplay(Landroid/view/Surface;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Message;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput v1, v0, Landroid/os/Message;->what:I

    .line 8
    .line 9
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lk7/b;->n(Landroid/os/Message;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setLastListener(Ll7/a;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lk7/b;->e:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lk7/b;->e:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    return-void
.end method

.method public setLastState(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk7/b;->m:I

    .line 2
    .line 3
    return-void
.end method

.method public setListener(Ll7/a;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lk7/b;->d:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lk7/b;->d:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    return-void
.end method

.method public setPlayPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk7/b;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public setPlayTag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk7/b;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSpeed(FZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->setSpeed(FZ)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setSpeedPlaying(FZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->setSpeedPlaying(FZ)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->start()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public stop()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/b;->i:Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/player/IPlayerManager;->stop()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

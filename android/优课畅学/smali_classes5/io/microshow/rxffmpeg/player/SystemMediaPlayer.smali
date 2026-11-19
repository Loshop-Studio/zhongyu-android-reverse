.class public abstract Lio/microshow/rxffmpeg/player/SystemMediaPlayer;
.super Lio/microshow/rxffmpeg/player/BaseMediaPlayer;
.source "SourceFile"


# instance fields
.field private mCompositeDisposable:Lv6/a;

.field public mMediaPlayer:Landroid/media/MediaPlayer;

.field private mTimeUpdateDisposable:Lv6/b;

.field protected path:Ljava/lang/String;

.field public volumePercent:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->volumePercent:I

    .line 6
    .line 7
    new-instance v0, Landroid/media/MediaPlayer;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 13
    .line 14
    new-instance v0, Lv6/a;

    .line 15
    .line 16
    invoke-direct {v0}, Lv6/a;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mCompositeDisposable:Lv6/a;

    .line 20
    .line 21
    return-void
.end method

.method private cancelTimeUpdateDisposable()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mTimeUpdateDisposable:Lv6/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lv6/b;->isDisposed()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mTimeUpdateDisposable:Lv6/b;

    .line 12
    .line 13
    invoke-interface {v0}, Lv6/b;->dispose()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method


# virtual methods
.method public getDuration()I
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getMuteSolo()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getVolume()I
    .locals 1

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->volumePercent:I

    .line 2
    .line 3
    return v0
.end method

.method public isLooping()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isLooping()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isPlaying()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->cancelTimeUpdateDisposable()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public prepare()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public release()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->setOnPreparedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnPreparedListener;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->setOnVideoSizeChangedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->setOnLoadingListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->setOnTimeUpdateListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->setOnErrorListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnErrorListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->setOnCompleteListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->cancelTimeUpdateDisposable()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mCompositeDisposable:Lv6/a;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v1}, Lv6/a;->d()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mCompositeDisposable:Lv6/a;

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public repeatPlay()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->path:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->isLooping()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0, v1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->play(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public resume()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->start()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public seekTo(I)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 8
    .line 9
    int-to-long v1, p1

    .line 10
    const/4 p1, 0x3

    .line 11
    invoke-static {v0, v1, v2, p1}, Lio/microshow/rxffmpeg/player/a;->a(Landroid/media/MediaPlayer;JI)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setDataSource(Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->path:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setLooping(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMuteSolo(I)V
    .locals 0

    return-void
.end method

.method public setOnCompleteListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnCompleteListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    new-instance v1, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$4;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$4;-><init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setOnErrorListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnErrorListener;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnErrorListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnErrorListener;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    new-instance v1, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$3;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$3;-><init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;Lio/microshow/rxffmpeg/player/IMediaPlayer$OnErrorListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setOnLoadingListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnLoadingListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setOnPreparedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnPreparedListener;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnPreparedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnPreparedListener;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    new-instance v1, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$1;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$1;-><init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;Lio/microshow/rxffmpeg/player/IMediaPlayer$OnPreparedListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setOnTimeUpdateListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnTimeUpdateListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    new-instance v0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$5;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$5;-><init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setOnVideoSizeChangedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnVideoSizeChangedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 5
    .line 6
    new-instance v1, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$2;

    .line 7
    .line 8
    invoke-direct {v1, p0, p1}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$2;-><init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setSurface(Landroid/view/Surface;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setVolume(I)V
    .locals 2

    .line 1
    iput p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->volumePercent:I

    .line 2
    .line 3
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 4
    .line 5
    int-to-float p1, p1

    .line 6
    const/high16 v1, 0x42c80000    # 100.0f

    .line 7
    .line 8
    div-float/2addr p1, v1

    .line 9
    invoke-virtual {v0, p1, p1}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->startTimeUpdateDisposable()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public startTimeUpdateDisposable()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->cancelTimeUpdateDisposable()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0xc8

    .line 5
    .line 6
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    invoke-static {v0, v1, v2}, Ls6/b;->e(JLjava/util/concurrent/TimeUnit;)Ls6/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {}, Lg7/a;->b()Ls6/f;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ls6/b;->l(Ls6/f;)Ls6/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {}, Lu6/a;->a()Ls6/f;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ls6/b;->f(Ls6/f;)Ls6/b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$6;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$6;-><init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ls6/b;->h(Lx6/c;)Lv6/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mTimeUpdateDisposable:Lv6/b;

    .line 38
    .line 39
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mCompositeDisposable:Lv6/a;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lv6/a;->b(Lv6/b;)Z

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public stop()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

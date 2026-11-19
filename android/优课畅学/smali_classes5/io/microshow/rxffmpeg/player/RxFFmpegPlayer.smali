.class public abstract Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;
.super Lio/microshow/rxffmpeg/player/BaseMediaPlayer;
.source "SourceFile"


# instance fields
.field protected looping:Z

.field private mCompositeDisposable:Lv6/a;

.field protected mDuration:I

.field private mTimeDisposable:Lv6/b;

.field protected path:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "rxffmpeg-core"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rxffmpeg-player"

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mDuration:I

    .line 6
    .line 7
    new-instance v0, Lv6/a;

    .line 8
    .line 9
    invoke-direct {v0}, Lv6/a;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mCompositeDisposable:Lv6/a;

    .line 13
    .line 14
    return-void
.end method

.method private cancelTimeDisposable()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mTimeDisposable:Lv6/b;

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
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mTimeDisposable:Lv6/b;

    .line 12
    .line 13
    invoke-interface {v0}, Lv6/b;->dispose()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private native nativeGetMuteSolo()I
.end method

.method private native nativeGetVolume()I
.end method

.method private native nativeIsPlaying()Z
.end method

.method private native nativePause()V
.end method

.method private native nativePrepare(Ljava/lang/String;)V
.end method

.method private native nativeRelease()V
.end method

.method private native nativeResume()V
.end method

.method private native nativeSeekTo(I)V
.end method

.method private native nativeSetMuteSolo(I)V
.end method

.method private native nativeSetSurface(Landroid/view/Surface;)V
.end method

.method private native nativeSetVolume(I)V
.end method

.method private native nativeStart()V
.end method

.method private native nativeStop()V
.end method


# virtual methods
.method public getDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mDuration:I

    .line 2
    .line 3
    return v0
.end method

.method public getMuteSolo()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeGetMuteSolo()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public getVolume()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeGetVolume()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public isLooping()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->looping:Z

    .line 2
    .line 3
    return v0
.end method

.method public isPlaying()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeIsPlaying()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public onCompletionNative()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->mOnCompletionListener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;->onCompletion(Lio/microshow/rxffmpeg/player/IMediaPlayer;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->isLooping()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-wide/16 v0, 0x1f4

    .line 15
    .line 16
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Ls6/b;->n(JLjava/util/concurrent/TimeUnit;)Ls6/b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {}, Lg7/a;->b()Ls6/f;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ls6/b;->l(Ls6/f;)Ls6/b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {}, Lu6/a;->a()Ls6/f;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ls6/b;->f(Ls6/f;)Ls6/b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer$1;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer$1;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ls6/b;->h(Lx6/c;)Lv6/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mTimeDisposable:Lv6/b;

    .line 48
    .line 49
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mCompositeDisposable:Lv6/a;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lv6/a;->b(Lv6/b;)Z

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method public onErrorNative(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->mOnErrorListener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnErrorListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0, p1, p2}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnErrorListener;->onError(Lio/microshow/rxffmpeg/player/IMediaPlayer;ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onLoadingNative(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->mOnLoadingListener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0, p1}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;->onLoading(Lio/microshow/rxffmpeg/player/IMediaPlayer;Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onPreparedNative()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->mOnPreparedListener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnPreparedListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnPreparedListener;->onPrepared(Lio/microshow/rxffmpeg/player/IMediaPlayer;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onTimeUpdateNative(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->mOnTimeUpdateListener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mDuration:I

    .line 6
    .line 7
    invoke-interface {v0, p0, p1, p2}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;->onTimeUpdate(Lio/microshow/rxffmpeg/player/IMediaPlayer;II)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public onVideoSizeChangedNative(IIF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->mOnVideoSizeChangedListener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p0, p1, p2, p3}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;->onVideoSizeChanged(Lio/microshow/rxffmpeg/player/IMediaPlayer;IIF)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public pause()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativePause()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public prepare()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->path:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->path:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0, v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativePrepare(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public release()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnPreparedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnPreparedListener;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnVideoSizeChangedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnLoadingListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnTimeUpdateListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnErrorListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnErrorListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnCompleteListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mCompositeDisposable:Lv6/a;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Lv6/a;->d()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->mCompositeDisposable:Lv6/a;

    .line 28
    .line 29
    :cond_0
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeRelease()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public repeatPlay()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->path:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->looping:Z

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->play(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public resume()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeResume()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public seekTo(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeSeekTo(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setDataSource(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setLooping(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->looping:Z

    .line 2
    .line 3
    return-void
.end method

.method public setMuteSolo(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeSetMuteSolo(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setSurface(Landroid/view/Surface;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeSetSurface(Landroid/view/Surface;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public setVolume(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeSetVolume(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->path:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeStart()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public stop()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->cancelTimeDisposable()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeStop()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

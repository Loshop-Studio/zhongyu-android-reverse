.class public abstract Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;
.super Lio/microshow/rxffmpeg/player/a;
.source "SourceFile"


# instance fields
.field public e:Ljava/lang/String;

.field public f:I

.field public g:Z


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
.method public a()I
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

.method public b()I
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

.method public c(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeSetVolume(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativeSetMuteSolo(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->g:Z

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lio/microshow/rxffmpeg/player/a;->e(Ljava/lang/String;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getDuration()I
    .locals 1

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->f:I

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

.method public pause()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayer;->nativePause()V

    .line 2
    .line 3
    .line 4
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

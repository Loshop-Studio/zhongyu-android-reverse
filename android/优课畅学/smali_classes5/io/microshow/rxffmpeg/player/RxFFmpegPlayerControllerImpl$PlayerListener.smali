.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$PlayerListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;
.implements Lio/microshow/rxffmpeg/player/IMediaPlayer$OnErrorListener;
.implements Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;
.implements Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PlayerListener"
.end annotation


# instance fields
.field private mWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$PlayerListener;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onCompletion(Lio/microshow/rxffmpeg/player/IMediaPlayer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$PlayerListener;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->onCompletion(Lio/microshow/rxffmpeg/player/IMediaPlayer;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public onError(Lio/microshow/rxffmpeg/player/IMediaPlayer;ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$PlayerListener;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->onError(Lio/microshow/rxffmpeg/player/IMediaPlayer;ILjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public onLoading(Lio/microshow/rxffmpeg/player/IMediaPlayer;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$PlayerListener;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->onLoading(Lio/microshow/rxffmpeg/player/IMediaPlayer;Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public onTimeUpdate(Lio/microshow/rxffmpeg/player/IMediaPlayer;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$PlayerListener;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->onTimeUpdate(Lio/microshow/rxffmpeg/player/IMediaPlayer;II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$VideoSizeChangedListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "VideoSizeChangedListener"
.end annotation


# instance fields
.field private mWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)V
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
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$VideoSizeChangedListener;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public onVideoSizeChanged(Lio/microshow/rxffmpeg/player/IMediaPlayer;IIF)V
    .locals 0

    .line 1
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$VideoSizeChangedListener;->mWeakReference:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {p1, p2, p3, p4}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->access$400(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;IIF)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

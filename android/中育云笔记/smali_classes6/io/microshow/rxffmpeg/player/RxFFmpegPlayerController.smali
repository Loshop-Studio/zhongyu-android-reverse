.class public abstract Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

.field public d:Lio/microshow/rxffmpeg/player/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->getLayoutId()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->c()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public abstract b()V
.end method

.method public abstract c()V
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract getLayoutId()I
.end method

.method public setPlayerView(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->c:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 4
    .line 5
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->i:Lio/microshow/rxffmpeg/player/a;

    .line 6
    .line 7
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->d:Lio/microshow/rxffmpeg/player/a;

    .line 8
    .line 9
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->b()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

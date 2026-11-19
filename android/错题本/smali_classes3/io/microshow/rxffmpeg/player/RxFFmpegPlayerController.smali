.class public abstract Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->getLayoutId()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->b()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b()V
.end method

.method public abstract getLayoutId()I
.end method

.method public setPlayerView(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 5
    .line 6
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->a()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    throw p1
.end method

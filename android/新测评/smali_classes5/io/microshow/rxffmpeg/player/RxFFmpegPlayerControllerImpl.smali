.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;
.super Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$PlayerListener;
    }
.end annotation


# instance fields
.field private isSeeking:Z

.field private mBottomPanel:Landroid/view/View;

.field public mPosition:I

.field private mProgressBar:Landroid/widget/ProgressBar;

.field private mProgressView:Landroid/widget/SeekBar;

.field private mTimeView:Landroid/widget/TextView;

.field private muteImage:Landroid/widget/ImageView;

.field private playBtn:Landroid/widget/ImageView;

.field private repeatPlay:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->isSeeking:Z

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic access$000(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->repeatPlay:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->isSeeking:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$102(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->isSeeking:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$200(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mBottomPanel:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mTimeView:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/widget/SeekBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mProgressView:Landroid/widget/SeekBar;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/widget/ProgressBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mProgressBar:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lio/microshow/rxffmpeg/R$layout;->rxffmpeg_player_controller:I

    .line 2
    .line 3
    return v0
.end method

.method public initListener()V
    .locals 2

    .line 1
    new-instance v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$PlayerListener;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$PlayerListener;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnLoadingListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnTimeUpdateListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnErrorListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnErrorListener;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnCompleteListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mProgressView:Landroid/widget/SeekBar;

    .line 27
    .line 28
    new-instance v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public initView()V
    .locals 2

    .line 1
    sget v0, Lio/microshow/rxffmpeg/R$id;->bottomPanel:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mBottomPanel:Landroid/view/View;

    .line 8
    .line 9
    sget v0, Lio/microshow/rxffmpeg/R$id;->progress_view:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/widget/SeekBar;

    .line 16
    .line 17
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mProgressView:Landroid/widget/SeekBar;

    .line 18
    .line 19
    sget v0, Lio/microshow/rxffmpeg/R$id;->time_view:I

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/widget/TextView;

    .line 26
    .line 27
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mTimeView:Landroid/widget/TextView;

    .line 28
    .line 29
    sget v0, Lio/microshow/rxffmpeg/R$id;->progressBar:I

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Landroid/widget/ProgressBar;

    .line 36
    .line 37
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mProgressBar:Landroid/widget/ProgressBar;

    .line 38
    .line 39
    sget v0, Lio/microshow/rxffmpeg/R$id;->iv_play:I

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroid/widget/ImageView;

    .line 46
    .line 47
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->playBtn:Landroid/widget/ImageView;

    .line 48
    .line 49
    sget v0, Lio/microshow/rxffmpeg/R$id;->repeatPlay:I

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->repeatPlay:Landroid/view/View;

    .line 56
    .line 57
    new-instance v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$1;

    .line 58
    .line 59
    invoke-direct {v1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$1;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    .line 64
    .line 65
    sget v0, Lio/microshow/rxffmpeg/R$id;->iv_fullscreen:I

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$2;

    .line 72
    .line 73
    invoke-direct {v1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$2;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    sget v0, Lio/microshow/rxffmpeg/R$id;->iv_mute:I

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Landroid/widget/ImageView;

    .line 86
    .line 87
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->muteImage:Landroid/widget/ImageView;

    .line 88
    .line 89
    new-instance v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$3;

    .line 90
    .line 91
    invoke-direct {v1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$3;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->playBtn:Landroid/widget/ImageView;

    .line 98
    .line 99
    new-instance v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$4;

    .line 100
    .line 101
    invoke-direct {v1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$4;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public onCompletion(Lio/microshow/rxffmpeg/player/IMediaPlayer;)V
    .locals 0

    .line 1
    new-instance p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$6;

    .line 2
    .line 3
    invoke-direct {p1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$6;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onError(Lio/microshow/rxffmpeg/player/IMediaPlayer;ILjava/lang/String;)V
    .locals 0

    .line 1
    new-instance p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$7;

    .line 2
    .line 3
    invoke-direct {p1, p0, p2, p3}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$7;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;ILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onLoading(Lio/microshow/rxffmpeg/player/IMediaPlayer;Z)V
    .locals 0

    .line 1
    new-instance p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$9;

    .line 2
    .line 3
    invoke-direct {p1, p0, p2}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$9;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->playBtn:Landroid/widget/ImageView;

    .line 2
    .line 3
    sget v1, Lio/microshow/rxffmpeg/R$mipmap;->rxffmpeg_player_start:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->playBtn:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/high16 v1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->playBtn:Landroid/widget/ImageView;

    .line 2
    .line 3
    sget v1, Lio/microshow/rxffmpeg/R$mipmap;->rxffmpeg_player_pause:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->playBtn:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/high16 v1, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayerView:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->muteImage:Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->getVolume()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    sget v0, Lio/microshow/rxffmpeg/R$mipmap;->rxffmpeg_player_mute:I

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget v0, Lio/microshow/rxffmpeg/R$mipmap;->rxffmpeg_player_unmute:I

    .line 39
    .line 40
    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public onTimeUpdate(Lio/microshow/rxffmpeg/player/IMediaPlayer;II)V
    .locals 0

    .line 1
    new-instance p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;

    .line 2
    .line 3
    invoke-direct {p1, p0, p3, p2}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$8;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public switchMute()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayerView:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->getVolume()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayerView:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 12
    .line 13
    const/16 v1, 0x64

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->setVolume(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->muteImage:Landroid/widget/ImageView;

    .line 19
    .line 20
    sget v1, Lio/microshow/rxffmpeg/R$mipmap;->rxffmpeg_player_unmute:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayerView:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->setVolume(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->muteImage:Landroid/widget/ImageView;

    .line 33
    .line 34
    sget v1, Lio/microshow/rxffmpeg/R$mipmap;->rxffmpeg_player_mute:I

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

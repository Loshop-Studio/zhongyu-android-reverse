.class public Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$VideoSizeChangedListener;,
        Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;
    }
.end annotation


# static fields
.field public static final MODE_FULL_SCREEN:I = 0x1

.field public static final MODE_NORMAL:I


# instance fields
.field private mContainer:Landroid/widget/FrameLayout;

.field private mContext:Landroid/content/Context;

.field private mCurrentMode:I

.field private mMeasureHelper:Lio/microshow/rxffmpeg/player/MeasureHelper;

.field public mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

.field private mPlayerController:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

.field public mPlayerCoreType:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

.field private mTextureView:Landroid/view/TextureView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    sget-object p2, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;->PCT_RXFFMPEG_PLAYER:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    iput-object p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerCoreType:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    const/4 p2, 0x0

    .line 4
    iput p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mCurrentMode:I

    .line 5
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContext:Landroid/content/Context;

    .line 6
    new-instance p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$1;

    invoke-direct {p1, p0, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$1;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;Landroid/view/View;)V

    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mMeasureHelper:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 7
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->initContainer()V

    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setKeepScreenOn(Z)V

    return-void
.end method

.method public static synthetic access$000(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)I
    .locals 0

    .line 1
    iget p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mCurrentMode:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$100(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)Lio/microshow/rxffmpeg/player/MeasureHelper;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mMeasureHelper:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)Landroid/view/TextureView;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mTextureView:Landroid/view/TextureView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;IIF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->updateVideoLayoutParams(IIF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private addTextureView()V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mTextureView:Landroid/view/TextureView;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    const/16 v2, 0x11

    .line 12
    .line 13
    invoke-direct {v0, v1, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 17
    .line 18
    iget-object v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mTextureView:Landroid/view/TextureView;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-virtual {v1, v2, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private initContainer()V
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/FrameLayout;

    .line 2
    .line 3
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContext:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 9
    .line 10
    const/high16 v1, -0x1000000

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private initPlayer()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mTextureView:Landroid/view/TextureView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/microshow/rxffmpeg/player/ScaleTextureView;

    .line 6
    .line 7
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContext:Landroid/content/Context;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lio/microshow/rxffmpeg/player/ScaleTextureView;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mTextureView:Landroid/view/TextureView;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerCoreType:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    .line 15
    .line 16
    sget-object v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;->PCT_SYSTEM_MEDIA_PLAYER:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    .line 17
    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    new-instance v0, Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl;

    .line 21
    .line 22
    invoke-direct {v0}, Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    new-instance v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;

    .line 29
    .line 30
    invoke-direct {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerImpl;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 34
    .line 35
    :goto_0
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 36
    .line 37
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mTextureView:Landroid/view/TextureView;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setTextureView(Landroid/view/TextureView;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 43
    .line 44
    new-instance v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$VideoSizeChangedListener;

    .line 45
    .line 46
    invoke-direct {v1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$VideoSizeChangedListener;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnVideoSizeChangedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method private updateVideoLayoutParams(IIF)V
    .locals 1

    .line 1
    new-instance v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;-><init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;IIF)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public enterFullScreen()Z
    .locals 4

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mCurrentMode:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContext:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {v0, v2}, Lio/microshow/rxffmpeg/player/Helper;->setFullScreen(Landroid/content/Context;Z)Landroid/view/ViewGroup;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-virtual {v0, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 31
    .line 32
    .line 33
    iput v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mCurrentMode:I

    .line 34
    .line 35
    return v2
.end method

.method public exitFullScreen()Z
    .locals 3

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mCurrentMode:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContext:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v0, v2}, Lio/microshow/rxffmpeg/player/Helper;->setFullScreen(Landroid/content/Context;Z)Landroid/view/ViewGroup;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 28
    .line 29
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    iput v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mCurrentMode:I

    .line 33
    .line 34
    :cond_1
    return v2
.end method

.method public getContainerView()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMuteSolo()I
    .locals 3

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->getMuteSolo()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v0, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 14
    .line 15
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->getMuteSolo()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_0
    return v1
.end method

.method public getTextureView()Landroid/view/TextureView;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mTextureView:Landroid/view/TextureView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVolume()I
    .locals 3

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->getVolume()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, -0x1

    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->getVolume()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_0
    return v1
.end method

.method public isFullScreenModel()Z
    .locals 2

    .line 1
    iget v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mCurrentMode:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public isLooping()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->isLooping()Z

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
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->isPlaying()Z

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

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mMeasureHelper:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mTextureView:Landroid/view/TextureView;

    .line 9
    .line 10
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lio/microshow/rxffmpeg/player/MeasureHelper;->setVideoLayoutParams(Landroid/view/TextureView;Landroid/widget/FrameLayout;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mMeasureHelper:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1, p2, v0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->doMeasure(II)[I

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 p2, 0x0

    .line 19
    aget p2, p1, p2

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    aget p1, p1, v0

    .line 23
    .line 24
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->pause()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerController:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->onPause()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public play(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lio/microshow/rxffmpeg/player/Helper;->isFastClick()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->play(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerController:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->onResume()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->release()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public repeatPlay()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->repeatPlay()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->resume()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerController:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->onResume()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setController(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->initPlayer()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->setFitModel(Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;)V

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 8
    .line 9
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerController:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerController:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->setPlayerView(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 20
    .line 21
    const/4 p2, -0x1

    .line 22
    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 26
    .line 27
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerController:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;

    .line 28
    .line 29
    invoke-virtual {p2, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->addTextureView()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setFitModel(Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mMeasureHelper:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lio/microshow/rxffmpeg/player/MeasureHelper;->setFitModel(Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mMeasureHelper:Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 11
    .line 12
    invoke-virtual {p1}, Lio/microshow/rxffmpeg/player/MeasureHelper;->setDefaultVideoLayoutParams()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public setMuteSolo(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->setMuteSolo(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setOnCompleteListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->setOnCompleteListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setPlayerBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mContainer:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setTextureViewEnabledTouch(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mTextureView:Landroid/view/TextureView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lio/microshow/rxffmpeg/player/ScaleTextureView;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lio/microshow/rxffmpeg/player/ScaleTextureView;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lio/microshow/rxffmpeg/player/ScaleTextureView;->setEnabledTouch(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setVolume(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->setVolume(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public switchPlayerCore(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerCoreType:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    .line 2
    .line 3
    return-void
.end method

.method public switchScreen()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->isFullScreenModel()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->exitFullScreen()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->enterFullScreen()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

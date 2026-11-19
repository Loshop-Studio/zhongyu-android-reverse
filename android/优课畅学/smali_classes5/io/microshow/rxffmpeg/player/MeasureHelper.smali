.class public Lio/microshow/rxffmpeg/player/MeasureHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;,
        Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;
    }
.end annotation


# instance fields
.field private mFitModel:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

.field private mMeasuredHeight:I

.field private mMeasuredWidth:I

.field private mVideoSizeInfo:Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;

.field private mWeakView:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_DEFAULT:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 5
    .line 6
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mFitModel:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mWeakView:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public doMeasure(II)[I
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mFitModel:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 2
    .line 3
    sget-object v1, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_DEFAULT:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v1, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_FULL_SCREEN_HEIGHT:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    :cond_0
    iget p2, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mMeasuredHeight:I

    .line 12
    .line 13
    :cond_1
    filled-new-array {p1, p2}, [I

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public getFitModel()Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mFitModel:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVideoSizeInfo()Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mVideoSizeInfo:Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mWeakView:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public isFullScreen()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setDefaultVideoLayoutParams()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/Helper;->getScreenWidth(Landroid/content/Context;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    mul-int/lit8 v2, v0, 0x9

    .line 21
    .line 22
    div-int/lit8 v2, v2, 0x10

    .line 23
    .line 24
    new-instance v3, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;

    .line 25
    .line 26
    int-to-float v4, v0

    .line 27
    int-to-float v5, v2

    .line 28
    div-float/2addr v4, v5

    .line 29
    invoke-direct {v3, v0, v2, v4}, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;-><init>(IIF)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v3}, Lio/microshow/rxffmpeg/player/MeasureHelper;->setVideoSizeInfo(Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->getTextureView()Landroid/view/TextureView;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->getContainerView()Landroid/widget/FrameLayout;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p0, v0, v1}, Lio/microshow/rxffmpeg/player/MeasureHelper;->setVideoLayoutParams(Landroid/view/TextureView;Landroid/widget/FrameLayout;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public setFitModel(Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mFitModel:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 2
    .line 3
    return-void
.end method

.method public setVideoLayoutParams(Landroid/view/TextureView;Landroid/widget/FrameLayout;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    if-eqz p2, :cond_7

    .line 4
    .line 5
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getVideoSizeInfo()Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getVideoSizeInfo()Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getVideoSizeInfo()Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getVideoSizeInfo()Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;->getDar()F

    .line 34
    .line 35
    .line 36
    int-to-float v2, v0

    .line 37
    int-to-float v3, v1

    .line 38
    div-float/2addr v2, v3

    .line 39
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getView()Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3}, Lio/microshow/rxffmpeg/player/Helper;->getScreenWidth(Landroid/content/Context;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->isFullScreen()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getView()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/Helper;->getScreenHeight(Landroid/content/Context;)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    :goto_0
    int-to-float v0, v3

    .line 70
    mul-float/2addr v0, v2

    .line 71
    float-to-int v0, v0

    .line 72
    move v6, v3

    .line 73
    move v3, v0

    .line 74
    move v0, v6

    .line 75
    goto :goto_2

    .line 76
    :cond_1
    iget-object v4, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mFitModel:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 77
    .line 78
    sget-object v5, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_FULL_SCREEN_WIDTH:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 79
    .line 80
    if-ne v4, v5, :cond_2

    .line 81
    .line 82
    :goto_1
    int-to-float v0, v3

    .line 83
    div-float/2addr v0, v2

    .line 84
    float-to-int v0, v0

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    sget-object v5, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_FULL_SCREEN_HEIGHT:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 87
    .line 88
    if-ne v4, v5, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getView()Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/Helper;->getFullScreenHeight(Landroid/content/Context;)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    goto :goto_0

    .line 103
    :cond_3
    sget-object v5, Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;->FM_WH_16X9:Lio/microshow/rxffmpeg/player/MeasureHelper$FitModel;

    .line 104
    .line 105
    if-ne v4, v5, :cond_4

    .line 106
    .line 107
    mul-int/lit8 v3, v3, 0x9

    .line 108
    .line 109
    div-int/lit8 v3, v3, 0x10

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    if-le v0, v1, :cond_5

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    if-ge v0, v1, :cond_6

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_6
    move v0, v3

    .line 119
    :goto_2
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 120
    .line 121
    invoke-direct {v1, v3, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 122
    .line 123
    .line 124
    const/16 v2, 0x11

    .line 125
    .line 126
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 127
    .line 128
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    .line 130
    .line 131
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 132
    .line 133
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getView()Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1}, Lio/microshow/rxffmpeg/player/Helper;->getScreenWidth(Landroid/content/Context;)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-direct {p1, v1, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 149
    .line 150
    .line 151
    iput v0, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mMeasuredHeight:I

    .line 152
    .line 153
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/player/MeasureHelper;->getView()Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 158
    .line 159
    .line 160
    :cond_7
    :goto_3
    return-void
.end method

.method public setVideoSizeInfo(Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/MeasureHelper;->mVideoSizeInfo:Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;

    .line 2
    .line 3
    return-void
.end method

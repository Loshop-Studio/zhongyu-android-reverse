.class public Lcom/tencent/rtmp/TXVodPlayer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/basic/b/b;
.implements Lcom/tencent/liteav/network/g;


# static fields
.field public static final PLAYER_TYPE_EXO:I = 0x1

.field public static final PLAYER_TYPE_FFPLAY:I = 0x0

.field public static final TAG:Ljava/lang/String; = "TXVodPlayer"


# instance fields
.field private mAutoPlay:Z

.field private mBitrateIndex:I

.field private mConfig:Lcom/tencent/rtmp/TXVodPlayConfig;

.field private mContext:Landroid/content/Context;

.field private mEnableHWDec:Z

.field private mIsGainAudioFocus:Z

.field private mIsGetPlayInfo:Z

.field private mListener:Lcom/tencent/rtmp/ITXLivePlayListener;

.field private mLoop:Z

.field private mMirror:Z

.field private mMute:Z

.field private mNetApi:Lcom/tencent/liteav/network/f;

.field private mNewListener:Lcom/tencent/rtmp/ITXVodPlayListener;

.field private mPlayUrl:Ljava/lang/String;

.field private mPlayer:Lcom/tencent/liteav/g;

.field private mRate:F

.field private mRenderMode:I

.field private mRenderRotation:I

.field private mSnapshotRunning:Z

.field protected mStartTime:F

.field private mSurface:Landroid/view/Surface;

.field private mTXCloudVideoView:Lcom/tencent/rtmp/ui/TXCloudVideoView;

.field private mTextureView:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

.field private mToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mEnableHWDec:Z

    .line 6
    .line 7
    const-string v1, ""

    .line 8
    .line 9
    iput-object v1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayUrl:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mMute:Z

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mIsGainAudioFocus:Z

    .line 15
    .line 16
    iput-boolean v1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mAutoPlay:Z

    .line 17
    .line 18
    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    iput v1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mRate:F

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mSnapshotRunning:Z

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mListener:Lcom/tencent/rtmp/ITXLivePlayListener;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNewListener:Lcom/tencent/rtmp/ITXVodPlayListener;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mContext:Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {p1}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->setAppContext(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/tencent/liteav/basic/log/TXCLog;->init()Z

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public static synthetic access$002(Lcom/tencent/rtmp/TXVodPlayer;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mSnapshotRunning:Z

    .line 2
    .line 3
    return p1
.end method

.method private checkPlayUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "TXVodPlayer"

    .line 2
    .line 3
    const-string v1, "http"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    :try_start_0
    const-string v1, "UTF-8"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    array-length v3, v1

    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    :goto_0
    array-length v4, v1

    .line 25
    if-ge v3, v4, :cond_4

    .line 26
    .line 27
    aget-byte v4, v1, v3

    .line 28
    .line 29
    if-gez v4, :cond_0

    .line 30
    .line 31
    add-int/lit16 v4, v4, 0x100

    .line 32
    .line 33
    :cond_0
    const/16 v5, 0x20

    .line 34
    .line 35
    const/16 v6, 0x25

    .line 36
    .line 37
    if-le v4, v5, :cond_2

    .line 38
    .line 39
    const/16 v5, 0x7f

    .line 40
    .line 41
    if-ge v4, v5, :cond_2

    .line 42
    .line 43
    const/16 v5, 0x22

    .line 44
    .line 45
    if-eq v4, v5, :cond_2

    .line 46
    .line 47
    if-eq v4, v6, :cond_2

    .line 48
    .line 49
    const/16 v5, 0x3c

    .line 50
    .line 51
    if-eq v4, v5, :cond_2

    .line 52
    .line 53
    const/16 v5, 0x3e

    .line 54
    .line 55
    if-eq v4, v5, :cond_2

    .line 56
    .line 57
    const/16 v5, 0x5b

    .line 58
    .line 59
    if-eq v4, v5, :cond_2

    .line 60
    .line 61
    const/16 v5, 0x7d

    .line 62
    .line 63
    if-eq v4, v5, :cond_2

    .line 64
    .line 65
    const/16 v5, 0x5c

    .line 66
    .line 67
    if-eq v4, v5, :cond_2

    .line 68
    .line 69
    const/16 v5, 0x5d

    .line 70
    .line 71
    if-eq v4, v5, :cond_2

    .line 72
    .line 73
    const/16 v5, 0x5e

    .line 74
    .line 75
    if-eq v4, v5, :cond_2

    .line 76
    .line 77
    const/16 v5, 0x60

    .line 78
    .line 79
    if-eq v4, v5, :cond_2

    .line 80
    .line 81
    const/16 v5, 0x7b

    .line 82
    .line 83
    if-eq v4, v5, :cond_2

    .line 84
    .line 85
    const/16 v5, 0x7c

    .line 86
    .line 87
    if-ne v4, v5, :cond_1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    int-to-char v4, v4

    .line 91
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catch_0
    move-exception v1

    .line 96
    goto :goto_3

    .line 97
    :cond_2
    :goto_1
    if-ne v4, v6, :cond_3

    .line 98
    .line 99
    const-string v1, "URL has been transcoded"

    .line 100
    .line 101
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :cond_3
    const-string v5, "%%%02X"

    .line 106
    .line 107
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 129
    goto :goto_4

    .line 130
    :goto_3
    const-string v2, "get utf-8 string failed."

    .line 131
    .line 132
    invoke-static {v0, v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    return-object p1
.end method

.method private isAVCDecBlacklistDevices()Z
    .locals 2

    .line 1
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "HUAWEI"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "Che2-TL00"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method private postBitmapToMainThread(Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lcom/tencent/rtmp/TXVodPlayer$1;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/rtmp/TXVodPlayer$1;-><init>(Lcom/tencent/rtmp/TXVodPlayer;Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;Landroid/graphics/Bitmap;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public enableHardwareDecode(Z)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/rtmp/TXVodPlayer;->isAVCDecBlacklistDevices()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "enableHardwareDecode failed, MANUFACTURER = "

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, ", MODEL"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "HardwareDecode"

    .line 39
    .line 40
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return p1

    .line 45
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mEnableHWDec:Z

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/tencent/rtmp/TXVodPlayer;->updateConfig()V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    return p1
.end method

.method public getBitrateIndex()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->o()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getBufferDuration()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->j()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getCurrentPlaybackTime()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->h()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getDuration()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->k()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->n()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getPlayableDuration()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->l()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public getSupportedBitrates()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/rtmp/TXBitrateItem;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->p()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->m()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public isLoop()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mLoop:Z

    .line 2
    .line 3
    return v0
.end method

.method public isPlaying()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public onNetFailed(Lcom/tencent/liteav/network/f;Ljava/lang/String;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNetApi:Lcom/tencent/liteav/network/f;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mIsGetPlayInfo:Z

    .line 8
    .line 9
    new-instance p1, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "EVT_ID"

    .line 15
    .line 16
    const/16 v1, 0x7da

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    const-string v0, "EVT_TIME"

    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    const-string v0, "EVT_MSG"

    .line 31
    .line 32
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string p2, "EVT_PARAM1"

    .line 36
    .line 37
    invoke-virtual {p1, p2, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/16 p2, -0x902

    .line 41
    .line 42
    invoke-virtual {p0, p2, p1}, Lcom/tencent/rtmp/TXVodPlayer;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public onNetSuccess(Lcom/tencent/liteav/network/f;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNetApi:Lcom/tencent/liteav/network/f;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/liteav/network/f;->a()Lcom/tencent/liteav/network/i;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mIsGetPlayInfo:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/tencent/liteav/network/i;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/tencent/rtmp/TXVodPlayer;->startPlay(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mIsGetPlayInfo:Z

    .line 23
    .line 24
    new-instance v0, Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v1, "EVT_ID"

    .line 30
    .line 31
    const/16 v2, 0x7da

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    const-string v1, "EVT_TIME"

    .line 37
    .line 38
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {v0, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 43
    .line 44
    .line 45
    const-string v1, "EVT_MSG"

    .line 46
    .line 47
    const-string v3, "Requested file information successfully"

    .line 48
    .line 49
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v1, "EVT_PLAY_URL"

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/tencent/liteav/network/i;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v1, "EVT_PLAY_COVER_URL"

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/tencent/liteav/network/i;->b()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, "EVT_PLAY_NAME"

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/tencent/liteav/network/i;->f()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v1, "EVT_PLAY_DESCRIPTION"

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/tencent/liteav/network/i;->g()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v0, v1, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/tencent/liteav/network/i;->d()Lcom/tencent/liteav/network/j;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/tencent/liteav/network/i;->d()Lcom/tencent/liteav/network/j;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Lcom/tencent/liteav/network/j;->c()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    const-string v1, "EVT_PLAY_DURATION"

    .line 103
    .line 104
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-virtual {p0, v2, v0}, Lcom/tencent/rtmp/TXVodPlayer;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public onNotifyEvent(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    const/16 v0, 0x3a99

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_2

    .line 5
    .line 6
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mTXCloudVideoView:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, p2, v1, v0}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->setLogText(Landroid/os/Bundle;Landroid/os/Bundle;I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mListener:Lcom/tencent/rtmp/ITXLivePlayListener;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-interface {p1, p2}, Lcom/tencent/rtmp/ITXLivePlayListener;->onNetStatus(Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNewListener:Lcom/tencent/rtmp/ITXVodPlayListener;

    .line 22
    .line 23
    if-eqz p1, :cond_5

    .line 24
    .line 25
    invoke-interface {p1, p0, p2}, Lcom/tencent/rtmp/ITXVodPlayListener;->onNetStatus(Lcom/tencent/rtmp/TXVodPlayer;Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mTXCloudVideoView:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0, v1, p2, p1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->setLogText(Landroid/os/Bundle;Landroid/os/Bundle;I)V

    .line 34
    .line 35
    .line 36
    :cond_3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mListener:Lcom/tencent/rtmp/ITXLivePlayListener;

    .line 37
    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    invoke-interface {v0, p1, p2}, Lcom/tencent/rtmp/ITXLivePlayListener;->onPlayEvent(ILandroid/os/Bundle;)V

    .line 41
    .line 42
    .line 43
    :cond_4
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNewListener:Lcom/tencent/rtmp/ITXVodPlayListener;

    .line 44
    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    invoke-interface {v0, p0, p1, p2}, Lcom/tencent/rtmp/ITXVodPlayListener;->onPlayEvent(Lcom/tencent/rtmp/TXVodPlayer;ILandroid/os/Bundle;)V

    .line 48
    .line 49
    .line 50
    :cond_5
    return-void
.end method

.method public pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public seek(F)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->a(F)V

    :cond_0
    return-void
.end method

.method public seek(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->e(I)V

    :cond_0
    return-void
.end method

.method public setAutoPlay(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mAutoPlay:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->e(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setBitrateIndex(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->f(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mBitrateIndex:I

    .line 9
    .line 10
    return-void
.end method

.method public setConfig(Lcom/tencent/rtmp/TXVodPlayConfig;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mConfig:Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 6
    .line 7
    invoke-direct {p1}, Lcom/tencent/rtmp/TXVodPlayConfig;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mConfig:Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/tencent/liteav/i;->q()Lcom/tencent/liteav/d;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    new-instance p1, Lcom/tencent/liteav/d;

    .line 23
    .line 24
    invoke-direct {p1}, Lcom/tencent/liteav/d;-><init>()V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mConfig:Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 28
    .line 29
    iget v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->mConnectRetryCount:I

    .line 30
    .line 31
    iput v1, p1, Lcom/tencent/liteav/d;->e:I

    .line 32
    .line 33
    iget v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->mConnectRetryInterval:I

    .line 34
    .line 35
    iput v1, p1, Lcom/tencent/liteav/d;->f:I

    .line 36
    .line 37
    iget v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->mTimeout:I

    .line 38
    .line 39
    iput v1, p1, Lcom/tencent/liteav/d;->r:I

    .line 40
    .line 41
    iget-boolean v1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mEnableHWDec:Z

    .line 42
    .line 43
    iput-boolean v1, p1, Lcom/tencent/liteav/d;->h:Z

    .line 44
    .line 45
    iget-object v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->mCacheFolderPath:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v1, p1, Lcom/tencent/liteav/d;->n:Ljava/lang/String;

    .line 48
    .line 49
    iget v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->mMaxCacheItems:I

    .line 50
    .line 51
    iput v1, p1, Lcom/tencent/liteav/d;->o:I

    .line 52
    .line 53
    iget v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->mPlayerType:I

    .line 54
    .line 55
    iput v1, p1, Lcom/tencent/liteav/d;->p:I

    .line 56
    .line 57
    iget-object v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->mHeaders:Ljava/util/Map;

    .line 58
    .line 59
    iput-object v1, p1, Lcom/tencent/liteav/d;->q:Ljava/util/Map;

    .line 60
    .line 61
    iget-boolean v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->enableAccurateSeek:Z

    .line 62
    .line 63
    iput-boolean v1, p1, Lcom/tencent/liteav/d;->s:Z

    .line 64
    .line 65
    iget-boolean v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->autoRotate:Z

    .line 66
    .line 67
    iput-boolean v1, p1, Lcom/tencent/liteav/d;->t:Z

    .line 68
    .line 69
    iget-boolean v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->smoothSwitchBitrate:Z

    .line 70
    .line 71
    iput-boolean v1, p1, Lcom/tencent/liteav/d;->u:Z

    .line 72
    .line 73
    iget-object v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->cacheMp4ExtName:Ljava/lang/String;

    .line 74
    .line 75
    iput-object v1, p1, Lcom/tencent/liteav/d;->v:Ljava/lang/String;

    .line 76
    .line 77
    iget v1, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->progressInterval:I

    .line 78
    .line 79
    iput v1, p1, Lcom/tencent/liteav/d;->w:I

    .line 80
    .line 81
    iget v0, v0, Lcom/tencent/rtmp/TXVodPlayConfig;->maxBufferSize:I

    .line 82
    .line 83
    iput v0, p1, Lcom/tencent/liteav/d;->x:I

    .line 84
    .line 85
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/d;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    return-void
.end method

.method public setLoop(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mLoop:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->f(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setMirror(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->g(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mMirror:Z

    .line 9
    .line 10
    return-void
.end method

.method public setMute(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mMute:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->b(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setPlayListener(Lcom/tencent/rtmp/ITXLivePlayListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mListener:Lcom/tencent/rtmp/ITXLivePlayListener;

    .line 2
    .line 3
    return-void
.end method

.method public setPlayerView(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)V
    .locals 1

    .line 4
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mTextureView:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    .line 5
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)V

    :cond_0
    return-void
.end method

.method public setPlayerView(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mTXCloudVideoView:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 2
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    :cond_0
    return-void
.end method

.method public setRate(F)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mRate:F

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->b(F)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setRenderMode(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mRenderMode:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->a(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setRenderRotation(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mRenderRotation:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->b(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setRequestAudioFocus(Z)Z
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mIsGainAudioFocus:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->d(Z)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x1

    .line 13
    return p1
.end method

.method public setStartTime(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mStartTime:F

    .line 2
    .line 3
    return-void
.end method

.method public setSurface(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mSurface:Landroid/view/Surface;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->a(Landroid/view/Surface;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mToken:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setVodListener(Lcom/tencent/rtmp/ITXVodPlayListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNewListener:Lcom/tencent/rtmp/ITXVodPlayListener;

    .line 2
    .line 3
    return-void
.end method

.method public snapshot(Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mSnapshotRunning:Z

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mSnapshotRunning:Z

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/tencent/liteav/g;->d()Landroid/view/TextureView;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-object v0, v1

    .line 22
    :goto_0
    if-eqz v0, :cond_4

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/TextureView;->getBitmap()Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->getTransform(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    iget-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mMirror:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    const/high16 v0, -0x40800000    # -1.0f

    .line 39
    .line 40
    const/high16 v1, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-virtual {v7, v0, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    const/4 v8, 0x1

    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 61
    .line 62
    .line 63
    move-object v2, v0

    .line 64
    :cond_3
    invoke-direct {p0, p1, v2}, Lcom/tencent/rtmp/TXVodPlayer;->postBitmapToMainThread(Lcom/tencent/rtmp/TXLivePlayer$ITXSnapshotListener;Landroid/graphics/Bitmap;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_4
    const/4 p1, 0x0

    .line 69
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mSnapshotRunning:Z

    .line 70
    .line 71
    :cond_5
    :goto_1
    return-void
.end method

.method public startPlay(Lcom/tencent/rtmp/TXPlayerAuthBuilder;)I
    .locals 8

    .line 43
    new-instance v0, Lcom/tencent/liteav/network/f;

    invoke-direct {v0}, Lcom/tencent/liteav/network/f;-><init>()V

    iput-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNetApi:Lcom/tencent/liteav/network/f;

    .line 44
    iget-boolean v1, p1, Lcom/tencent/rtmp/TXPlayerAuthBuilder;->isHttps:Z

    invoke-virtual {v0, v1}, Lcom/tencent/liteav/network/f;->a(Z)V

    .line 45
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNetApi:Lcom/tencent/liteav/network/f;

    invoke-virtual {v0, p0}, Lcom/tencent/liteav/network/f;->a(Lcom/tencent/liteav/network/g;)V

    .line 46
    iget-object v1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNetApi:Lcom/tencent/liteav/network/f;

    iget v2, p1, Lcom/tencent/rtmp/TXPlayerAuthBuilder;->appId:I

    iget-object v3, p1, Lcom/tencent/rtmp/TXPlayerAuthBuilder;->fileId:Ljava/lang/String;

    iget-object v4, p1, Lcom/tencent/rtmp/TXPlayerAuthBuilder;->timeout:Ljava/lang/String;

    iget-object v5, p1, Lcom/tencent/rtmp/TXPlayerAuthBuilder;->us:Ljava/lang/String;

    iget v6, p1, Lcom/tencent/rtmp/TXPlayerAuthBuilder;->exper:I

    iget-object v7, p1, Lcom/tencent/rtmp/TXPlayerAuthBuilder;->sign:Ljava/lang/String;

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/liteav/network/f;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)I

    move-result p1

    return p1
.end method

.method public startPlay(Ljava/lang/String;)I
    .locals 4

    if-eqz p1, :cond_6

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->initCrashReport(Landroid/content/Context;)V

    .line 3
    iget v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mBitrateIndex:I

    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v1}, Lcom/tencent/rtmp/TXVodPlayer;->stopPlay(Z)I

    .line 5
    iput v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mBitrateIndex:I

    .line 6
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mToken:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 7
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 10
    array-length v2, v0

    if-lez v2, :cond_1

    .line 11
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aget-object v0, v0, v2

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "voddrm.token."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tencent/rtmp/TXVodPlayer;->mToken:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    :cond_1
    invoke-direct {p0, p1}, Lcom/tencent/rtmp/TXVodPlayer;->checkPlayUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayUrl:Ljava/lang/String;

    .line 15
    const-string p1, "TXVodPlayer"

    const-string v0, "==========================================================================================================================================================="

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=====  StartPlay url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayUrl:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " SDKVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getSDKID()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " , "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCCommonUtil;->getSDKVersionStr()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "    ======"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    if-nez p1, :cond_2

    .line 21
    new-instance p1, Lcom/tencent/liteav/g;

    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mContext:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/tencent/liteav/g;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 22
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/rtmp/TXVodPlayer;->updateConfig()V

    .line 23
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mTXCloudVideoView:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    if-eqz p1, :cond_3

    .line 24
    invoke-virtual {p1}, Lcom/tencent/rtmp/ui/TXCloudVideoView;->clearLog()V

    .line 25
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mTXCloudVideoView:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 26
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mTXCloudVideoView:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->a(Lcom/tencent/rtmp/ui/TXCloudVideoView;)V

    goto :goto_0

    .line 27
    :cond_3
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mSurface:Landroid/view/Surface;

    if-eqz p1, :cond_4

    .line 28
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->a(Landroid/view/Surface;)V

    goto :goto_0

    .line 29
    :cond_4
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mTextureView:Lcom/tencent/liteav/txcvodplayer/TextureRenderView;

    if-eqz p1, :cond_5

    .line 30
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->a(Lcom/tencent/liteav/txcvodplayer/TextureRenderView;)V

    .line 31
    :cond_5
    :goto_0
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mBitrateIndex:I

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->f(I)V

    .line 32
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    invoke-virtual {p1, p0}, Lcom/tencent/liteav/i;->a(Lcom/tencent/liteav/basic/b/b;)V

    .line 33
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mIsGainAudioFocus:Z

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->d(Z)Z

    .line 34
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mAutoPlay:Z

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->e(Z)V

    .line 35
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mStartTime:F

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->c(F)V

    .line 36
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayUrl:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/g;->a(Ljava/lang/String;I)I

    .line 37
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mMute:Z

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->b(Z)V

    .line 38
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mRate:F

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->b(F)V

    .line 39
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mRenderRotation:I

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->b(I)V

    .line 40
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mRenderMode:I

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->a(I)V

    .line 41
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    iget-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mLoop:Z

    invoke-virtual {p1, v0}, Lcom/tencent/liteav/g;->f(Z)V

    .line 42
    iget-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mMirror:Z

    invoke-virtual {p0, p1}, Lcom/tencent/rtmp/TXVodPlayer;->setMirror(Z)V

    return v1

    :cond_6
    :goto_1
    const/4 p1, -0x1

    return p1
.end method

.method public stopPlay(Z)I
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mTXCloudVideoView:Lcom/tencent/rtmp/ui/TXCloudVideoView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayer:Lcom/tencent/liteav/g;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/g;->a(Z)I

    .line 17
    .line 18
    .line 19
    :cond_1
    const-string p1, ""

    .line 20
    .line 21
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mPlayUrl:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNetApi:Lcom/tencent/liteav/network/f;

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v0}, Lcom/tencent/liteav/network/f;->a(Lcom/tencent/liteav/network/g;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mNetApi:Lcom/tencent/liteav/network/f;

    .line 32
    .line 33
    :cond_2
    const/4 p1, 0x0

    .line 34
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mBitrateIndex:I

    .line 35
    .line 36
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayer;->mIsGetPlayInfo:Z

    .line 37
    .line 38
    return p1
.end method

.method public updateConfig()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/rtmp/TXVodPlayer;->mConfig:Lcom/tencent/rtmp/TXVodPlayConfig;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/tencent/rtmp/TXVodPlayer;->setConfig(Lcom/tencent/rtmp/TXVodPlayConfig;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

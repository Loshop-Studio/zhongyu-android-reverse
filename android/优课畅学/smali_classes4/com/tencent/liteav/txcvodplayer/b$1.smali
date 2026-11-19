.class Lcom/tencent/liteav/txcvodplayer/b$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/txcvodplayer/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/txcvodplayer/b;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b;->a(Lcom/tencent/liteav/txcvodplayer/b;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b;->a(Lcom/tencent/liteav/txcvodplayer/b;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    instance-of p1, p1, Lcom/tencent/ijk/media/player/IjkMediaPlayer;

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b;->a(Lcom/tencent/liteav/txcvodplayer/b;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/tencent/ijk/media/player/IjkMediaPlayer;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b;->a(Lcom/tencent/liteav/txcvodplayer/b;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    instance-of p1, p1, Lcom/tencent/ijk/media/player/MediaPlayerProxy;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b;->a(Lcom/tencent/liteav/txcvodplayer/b;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lcom/tencent/ijk/media/player/MediaPlayerProxy;

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/tencent/ijk/media/player/MediaPlayerProxy;->getInternalMediaPlayer()Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    instance-of v1, p1, Lcom/tencent/ijk/media/player/IjkMediaPlayer;

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    check-cast p1, Lcom/tencent/ijk/media/player/IjkMediaPlayer;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const/4 p1, 0x0

    .line 67
    :goto_0
    if-nez p1, :cond_4

    .line 68
    .line 69
    :goto_1
    return-void

    .line 70
    :cond_4
    invoke-virtual {p1}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->getRate()F

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {p1}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->getAVDiff()F

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    const/high16 v3, 0x3f000000    # 0.5f

    .line 83
    .line 84
    cmpl-float v2, v2, v3

    .line 85
    .line 86
    if-lez v2, :cond_5

    .line 87
    .line 88
    const/high16 v2, 0x3f800000    # 1.0f

    .line 89
    .line 90
    cmpl-float v2, v1, v2

    .line 91
    .line 92
    if-lez v2, :cond_5

    .line 93
    .line 94
    float-to-double v1, v1

    .line 95
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 96
    .line 97
    sub-double v3, v1, v3

    .line 98
    .line 99
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 100
    .line 101
    div-double/2addr v3, v5

    .line 102
    const-wide/high16 v5, 0x3fd0000000000000L    # 0.25

    .line 103
    .line 104
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(DD)D

    .line 105
    .line 106
    .line 107
    move-result-wide v3

    .line 108
    sub-double/2addr v1, v3

    .line 109
    double-to-float v1, v1

    .line 110
    invoke-virtual {p1, v1}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->setRate(F)V

    .line 111
    .line 112
    .line 113
    new-instance p1, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    .line 117
    .line 118
    const-string v2, "downside rate "

    .line 119
    .line 120
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    const-string v1, "RateHelper"

    .line 131
    .line 132
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 136
    .line 137
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b;->b(Lcom/tencent/liteav/txcvodplayer/b;)Landroid/os/Handler;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 145
    .line 146
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b;->b(Lcom/tencent/liteav/txcvodplayer/b;)Landroid/os/Handler;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    const-wide/16 v1, 0xbb8

    .line 151
    .line 152
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_5
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 157
    .line 158
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b;->b(Lcom/tencent/liteav/txcvodplayer/b;)Landroid/os/Handler;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/b$1;->a:Lcom/tencent/liteav/txcvodplayer/b;

    .line 166
    .line 167
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/b;->b(Lcom/tencent/liteav/txcvodplayer/b;)Landroid/os/Handler;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    const-wide/16 v1, 0x1f4

    .line 172
    .line 173
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 174
    .line 175
    .line 176
    return-void
.end method

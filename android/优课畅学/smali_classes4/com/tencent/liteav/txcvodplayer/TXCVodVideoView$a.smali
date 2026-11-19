.class Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    const/16 p2, 0x1f4

    .line 5
    .line 6
    iput p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;->b:I

    .line 7
    .line 8
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;->a:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$a;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    iget v1, p1, Landroid/os/Message;->what:I

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :pswitch_0
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getCurrentPosition()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    int-to-long v1, p1

    .line 31
    new-instance p1, Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getBufferDuration()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    int-to-long v3, v3

    .line 41
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getDuration()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    int-to-long v5, v5

    .line 46
    const-wide/16 v7, 0x3e8

    .line 47
    .line 48
    div-long v9, v1, v7

    .line 49
    .line 50
    long-to-int v9, v9

    .line 51
    const-string v10, "EVT_PLAY_PROGRESS"

    .line 52
    .line 53
    invoke-virtual {p1, v10, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    div-long v9, v5, v7

    .line 57
    .line 58
    long-to-int v9, v9

    .line 59
    const-string v10, "EVT_PLAY_DURATION"

    .line 60
    .line 61
    invoke-virtual {p1, v10, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    div-long v7, v3, v7

    .line 65
    .line 66
    long-to-int v7, v7

    .line 67
    const-string v8, "EVT_PLAYABLE_DURATION"

    .line 68
    .line 69
    invoke-virtual {p1, v8, v7}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    const-string v7, "EVT_PLAY_PROGRESS_MS"

    .line 73
    .line 74
    long-to-int v1, v1

    .line 75
    invoke-virtual {p1, v7, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    const-string v1, "EVT_PLAY_DURATION_MS"

    .line 79
    .line 80
    long-to-int v2, v5

    .line 81
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 82
    .line 83
    .line 84
    const-string v1, "EVT_PLAYABLE_DURATION_MS"

    .line 85
    .line 86
    long-to-int v2, v3

    .line 87
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/e;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const/16 v2, 0x7d5

    .line 95
    .line 96
    invoke-interface {v1, v2, p1}, Lcom/tencent/liteav/txcvodplayer/e;->a(ILandroid/os/Bundle;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->v(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-eqz p1, :cond_3

    .line 104
    .line 105
    const/16 p1, 0x67

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/d;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget v1, v1, Lcom/tencent/liteav/txcvodplayer/d;->l:I

    .line 115
    .line 116
    if-gtz v1, :cond_1

    .line 117
    .line 118
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/d;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const/16 v2, 0x1f4

    .line 123
    .line 124
    iput v2, v1, Lcom/tencent/liteav/txcvodplayer/d;->l:I

    .line 125
    .line 126
    :cond_1
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->s(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/d;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget v0, v0, Lcom/tencent/liteav/txcvodplayer/d;->l:I

    .line 131
    .line 132
    int-to-long v0, v0

    .line 133
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_1
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->t(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V

    .line 138
    .line 139
    .line 140
    const-string p1, "VOD network reconnected"

    .line 141
    .line 142
    const-string v1, "reconnect"

    .line 143
    .line 144
    const/16 v2, 0x837

    .line 145
    .line 146
    invoke-static {v0, v2, p1, v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_2
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 151
    .line 152
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/e;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-interface {v0, v1, p1}, Lcom/tencent/liteav/txcvodplayer/e;->a(ILandroid/os/Bundle;)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :pswitch_3
    invoke-virtual {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->getUnwrappedMediaPlayer()Lcom/tencent/ijk/media/player/IMediaPlayer;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-nez p1, :cond_2

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_2
    check-cast p1, Lcom/tencent/ijk/media/player/IjkMediaPlayer;

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->getVideoOutputFramesPerSecond()F

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {p1}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->getVideoDecodeFramesPerSecond()F

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-virtual {p1}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->getVideoCachedBytes()J

    .line 182
    .line 183
    .line 184
    move-result-wide v3

    .line 185
    invoke-virtual {p1}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->getAudioCachedBytes()J

    .line 186
    .line 187
    .line 188
    move-result-wide v5

    .line 189
    add-long/2addr v3, v5

    .line 190
    invoke-virtual {p1}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->getBitRate()J

    .line 191
    .line 192
    .line 193
    move-result-wide v5

    .line 194
    invoke-virtual {p1}, Lcom/tencent/ijk/media/player/IjkMediaPlayer;->getTcpSpeed()J

    .line 195
    .line 196
    .line 197
    move-result-wide v7

    .line 198
    new-instance p1, Landroid/os/Bundle;

    .line 199
    .line 200
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 201
    .line 202
    .line 203
    const-string v9, "fps"

    .line 204
    .line 205
    invoke-virtual {p1, v9, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 206
    .line 207
    .line 208
    const-string v1, "dps"

    .line 209
    .line 210
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 211
    .line 212
    .line 213
    const-string v1, "cachedBytes"

    .line 214
    .line 215
    invoke-virtual {p1, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 216
    .line 217
    .line 218
    const-string v1, "bitRate"

    .line 219
    .line 220
    invoke-virtual {p1, v1, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 221
    .line 222
    .line 223
    const-string v1, "tcpSpeed"

    .line 224
    .line 225
    invoke-virtual {p1, v1, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 226
    .line 227
    .line 228
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->x(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/e;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v0, p1}, Lcom/tencent/liteav/txcvodplayer/e;->a(Landroid/os/Bundle;)V

    .line 233
    .line 234
    .line 235
    const/16 p1, 0x64

    .line 236
    .line 237
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 238
    .line 239
    .line 240
    const-wide/16 v0, 0x1f4

    .line 241
    .line 242
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 243
    .line 244
    .line 245
    :cond_3
    :goto_0
    return-void

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

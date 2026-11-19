.class Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ijk/media/player/IMediaPlayer$OnVideoSizeChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onVideoSizeChanged(Lcom/tencent/ijk/media/player/IMediaPlayer;IIII)V
    .locals 0

    .line 1
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    invoke-static {p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    const/16 p5, 0x10

    .line 8
    .line 9
    if-eq p4, p3, :cond_0

    .line 10
    .line 11
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 12
    .line 13
    invoke-static {p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    sub-int/2addr p4, p3

    .line 18
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-gt p3, p5, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 25
    .line 26
    invoke-static {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    if-eq p3, p2, :cond_2

    .line 31
    .line 32
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 33
    .line 34
    invoke-static {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    sub-int/2addr p3, p2

    .line 39
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-le p2, p5, :cond_2

    .line 44
    .line 45
    :cond_1
    const/4 p2, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    const/4 p2, 0x0

    .line 48
    :goto_0
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 49
    .line 50
    invoke-interface {p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoWidth()I

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    invoke-static {p3, p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 55
    .line 56
    .line 57
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 58
    .line 59
    invoke-interface {p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoHeight()I

    .line 60
    .line 61
    .line 62
    move-result p4

    .line 63
    invoke-static {p3, p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 64
    .line 65
    .line 66
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 67
    .line 68
    invoke-interface {p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoSarNum()I

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    invoke-static {p3, p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 73
    .line 74
    .line 75
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 76
    .line 77
    invoke-interface {p1}, Lcom/tencent/ijk/media/player/IMediaPlayer;->getVideoSarDen()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-static {p3, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 85
    .line 86
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 93
    .line 94
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 101
    .line 102
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/a;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 109
    .line 110
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/a;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 115
    .line 116
    invoke-static {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 121
    .line 122
    invoke-static {p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 123
    .line 124
    .line 125
    move-result p4

    .line 126
    invoke-interface {p1, p3, p4}, Lcom/tencent/liteav/txcvodplayer/a;->setVideoSize(II)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 130
    .line 131
    invoke-static {p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/a;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 136
    .line 137
    invoke-static {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->d(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 142
    .line 143
    invoke-static {p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->e(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 144
    .line 145
    .line 146
    move-result p4

    .line 147
    invoke-interface {p1, p3, p4}, Lcom/tencent/liteav/txcvodplayer/a;->setVideoSampleAspectRatio(II)V

    .line 148
    .line 149
    .line 150
    :cond_3
    iget-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 153
    .line 154
    .line 155
    :cond_4
    if-eqz p2, :cond_5

    .line 156
    .line 157
    new-instance p1, Landroid/os/Message;

    .line 158
    .line 159
    invoke-direct {p1}, Landroid/os/Message;-><init>()V

    .line 160
    .line 161
    .line 162
    const/16 p2, 0x65

    .line 163
    .line 164
    iput p2, p1, Landroid/os/Message;->what:I

    .line 165
    .line 166
    const/16 p2, 0x7d9

    .line 167
    .line 168
    iput p2, p1, Landroid/os/Message;->arg1:I

    .line 169
    .line 170
    new-instance p2, Landroid/os/Bundle;

    .line 171
    .line 172
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 173
    .line 174
    .line 175
    new-instance p3, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string p4, "Resolution change:"

    .line 181
    .line 182
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 186
    .line 187
    invoke-static {p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 188
    .line 189
    .line 190
    move-result p4

    .line 191
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string p4, "*"

    .line 195
    .line 196
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    iget-object p4, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 200
    .line 201
    invoke-static {p4}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 202
    .line 203
    .line 204
    move-result p4

    .line 205
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    const-string p4, "description"

    .line 213
    .line 214
    invoke-virtual {p2, p4, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 218
    .line 219
    invoke-static {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->c(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 220
    .line 221
    .line 222
    move-result p3

    .line 223
    const-string p4, "EVT_PARAM1"

    .line 224
    .line 225
    invoke-virtual {p2, p4, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 226
    .line 227
    .line 228
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 229
    .line 230
    invoke-static {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->b(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 231
    .line 232
    .line 233
    move-result p3

    .line 234
    const-string p4, "EVT_PARAM2"

    .line 235
    .line 236
    invoke-virtual {p2, p4, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 240
    .line 241
    .line 242
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 243
    .line 244
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    if-eqz p2, :cond_5

    .line 249
    .line 250
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$9;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 251
    .line 252
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->f(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/os/Handler;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 257
    .line 258
    .line 259
    :cond_5
    return-void
.end method

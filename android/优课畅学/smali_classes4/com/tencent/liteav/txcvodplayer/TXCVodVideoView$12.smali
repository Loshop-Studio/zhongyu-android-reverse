.class Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ijk/media/player/IMediaPlayer$OnInfoListener;


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
    iput-object p1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onInfo(Lcom/tencent/ijk/media/player/IMediaPlayer;II)Z
    .locals 4

    .line 1
    const/4 p1, 0x1

    .line 2
    const/4 v0, 0x3

    .line 3
    if-eq p2, v0, :cond_7

    .line 4
    .line 5
    const/16 v1, 0x271b

    .line 6
    .line 7
    if-eq p2, v1, :cond_6

    .line 8
    .line 9
    const/16 v1, 0x385

    .line 10
    .line 11
    if-eq p2, v1, :cond_5

    .line 12
    .line 13
    const/16 v1, 0x386

    .line 14
    .line 15
    if-eq p2, v1, :cond_4

    .line 16
    .line 17
    const/16 v1, 0x2711

    .line 18
    .line 19
    if-eq p2, v1, :cond_2

    .line 20
    .line 21
    const/16 v1, 0x2712

    .line 22
    .line 23
    if-eq p2, v1, :cond_1

    .line 24
    .line 25
    packed-switch p2, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    packed-switch p2, :pswitch_data_1

    .line 29
    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :pswitch_0
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 34
    .line 35
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const-string p3, "MEDIA_INFO_METADATA_UPDATE:"

    .line 40
    .line 41
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_0

    .line 45
    .line 46
    :pswitch_1
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 47
    .line 48
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    const-string p3, "MEDIA_INFO_NOT_SEEKABLE:"

    .line 53
    .line 54
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :pswitch_2
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 60
    .line 61
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const-string p3, "MEDIA_INFO_BAD_INTERLEAVING:"

    .line 66
    .line 67
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :pswitch_3
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 73
    .line 74
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v1, "MEDIA_INFO_NETWORK_BANDWIDTH: "

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_0

    .line 99
    .line 100
    :pswitch_4
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 101
    .line 102
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    const-string v2, "MEDIA_INFO_BUFFERING_END: eof "

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {p2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 127
    .line 128
    const-string v1, "Buffer ended"

    .line 129
    .line 130
    const-string v2, "loading end"

    .line 131
    .line 132
    const/16 v3, 0x7de

    .line 133
    .line 134
    invoke-static {p2, v3, v1, v2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    if-eqz p3, :cond_0

    .line 138
    .line 139
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 140
    .line 141
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/net/Uri;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    if-eqz p2, :cond_0

    .line 146
    .line 147
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 148
    .line 149
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/net/Uri;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    if-eqz p2, :cond_0

    .line 158
    .line 159
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 160
    .line 161
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->n(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Landroid/net/Uri;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    const-string p3, "m3u8"

    .line 170
    .line 171
    invoke-virtual {p2, p3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-eqz p2, :cond_0

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_0
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 180
    .line 181
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->j(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-ne p2, v0, :cond_9

    .line 186
    .line 187
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 188
    .line 189
    const-string p3, "Playback started"

    .line 190
    .line 191
    const-string v0, "playing"

    .line 192
    .line 193
    const/16 v1, 0x7d4

    .line 194
    .line 195
    invoke-static {p2, v1, p3, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :pswitch_5
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 201
    .line 202
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    const-string p3, "MEDIA_INFO_BUFFERING_START:"

    .line 207
    .line 208
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 212
    .line 213
    const-string p3, "Buffer started"

    .line 214
    .line 215
    const-string v0, "loading start"

    .line 216
    .line 217
    const/16 v1, 0x7d7

    .line 218
    .line 219
    invoke-static {p2, v1, p3, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :pswitch_6
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 225
    .line 226
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    const-string p3, "MEDIA_INFO_VIDEO_TRACK_LAGGING:"

    .line 231
    .line 232
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_1
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 238
    .line 239
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    const-string p3, "MEDIA_INFO_AUDIO_RENDERING_START:"

    .line 244
    .line 245
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :cond_2
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 251
    .line 252
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    .line 261
    const-string v1, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: "

    .line 262
    .line 263
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-static {p2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 277
    .line 278
    invoke-static {p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->h(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 279
    .line 280
    .line 281
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 282
    .line 283
    iget-boolean p3, p2, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a:Z

    .line 284
    .line 285
    if-eqz p3, :cond_3

    .line 286
    .line 287
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 288
    .line 289
    .line 290
    move-result p2

    .line 291
    if-lez p2, :cond_3

    .line 292
    .line 293
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 294
    .line 295
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 296
    .line 297
    .line 298
    move-result p3

    .line 299
    invoke-static {p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->i(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;I)I

    .line 300
    .line 301
    .line 302
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 303
    .line 304
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/a;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    if-eqz p2, :cond_3

    .line 309
    .line 310
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 311
    .line 312
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Lcom/tencent/liteav/txcvodplayer/a;

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    iget-object p3, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 317
    .line 318
    invoke-static {p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->p(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 319
    .line 320
    .line 321
    move-result p3

    .line 322
    invoke-interface {p2, p3}, Lcom/tencent/liteav/txcvodplayer/a;->setVideoRotation(I)V

    .line 323
    .line 324
    .line 325
    :cond_3
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 326
    .line 327
    new-instance p3, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 330
    .line 331
    .line 332
    const-string v0, "Video angle "

    .line 333
    .line 334
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    iget-object v0, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 338
    .line 339
    invoke-static {v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 340
    .line 341
    .line 342
    move-result v0

    .line 343
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p3

    .line 350
    new-instance v0, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    const-string v1, "rotation "

    .line 356
    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    iget-object v1, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 361
    .line 362
    invoke-static {v1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->o(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)I

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    const/16 v1, 0x7db

    .line 374
    .line 375
    invoke-static {p2, v1, p3, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    goto :goto_0

    .line 379
    :cond_4
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 380
    .line 381
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    const-string p3, "MEDIA_INFO_SUBTITLE_TIMED_OUT:"

    .line 386
    .line 387
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    goto :goto_0

    .line 391
    :cond_5
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 392
    .line 393
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p2

    .line 397
    const-string p3, "MEDIA_INFO_UNSUPPORTED_SUBTITLE:"

    .line 398
    .line 399
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    goto :goto_0

    .line 403
    :cond_6
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 404
    .line 405
    const-string p3, "Video data received"

    .line 406
    .line 407
    const-string v0, "first video packet"

    .line 408
    .line 409
    const/16 v1, 0x7e1

    .line 410
    .line 411
    invoke-static {p2, v1, p3, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    goto :goto_0

    .line 415
    :cond_7
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 416
    .line 417
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->k(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p2

    .line 421
    const-string p3, "MEDIA_INFO_VIDEO_RENDERING_START:"

    .line 422
    .line 423
    invoke-static {p2, p3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 427
    .line 428
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->l(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)Z

    .line 429
    .line 430
    .line 431
    move-result p2

    .line 432
    if-nez p2, :cond_8

    .line 433
    .line 434
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 435
    .line 436
    const-string p3, "VOD displayed the first frame"

    .line 437
    .line 438
    const-string v0, "render start"

    .line 439
    .line 440
    const/16 v1, 0x7d3

    .line 441
    .line 442
    invoke-static {p2, v1, p3, v0}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;ILjava/lang/String;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    :cond_8
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 446
    .line 447
    invoke-static {p2}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->m(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;)F

    .line 448
    .line 449
    .line 450
    move-result p3

    .line 451
    invoke-virtual {p2, p3}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->setRate(F)V

    .line 452
    .line 453
    .line 454
    iget-object p2, p0, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView$12;->a:Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;

    .line 455
    .line 456
    invoke-static {p2, p1}, Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;->a(Lcom/tencent/liteav/txcvodplayer/TXCVodVideoView;Z)Z

    .line 457
    .line 458
    .line 459
    :cond_9
    :goto_0
    return p1

    .line 460
    nop

    .line 461
    :pswitch_data_0
    .packed-switch 0x2bc
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    :pswitch_data_1
    .packed-switch 0x320
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;
.super Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$AudioTrackThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;


# direct methods
.method public constructor <init>(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$AudioTrackThread;-><init>(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$100(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x2

    .line 10
    if-ne v0, v2, :cond_0

    .line 11
    .line 12
    move v7, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v7, v1

    .line 15
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$200(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    if-ne v0, v4, :cond_1

    .line 24
    .line 25
    move v8, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v8, v3

    .line 28
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$300(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0, v7, v8}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    new-instance v4, Landroid/media/AudioTrack;

    .line 39
    .line 40
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 41
    .line 42
    invoke-static {v0}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$300(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    const/4 v10, 0x1

    .line 47
    const/4 v5, 0x3

    .line 48
    invoke-direct/range {v4 .. v10}, Landroid/media/AudioTrack;-><init>(IIIIII)V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$400()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v5, "create audio track, samplerate:"

    .line 61
    .line 62
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v5, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 66
    .line 67
    invoke-static {v5}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$300(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v5, ", channels:"

    .line 75
    .line 76
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v5, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 80
    .line 81
    invoke-static {v5}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$100(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v5, ", bits:"

    .line 89
    .line 90
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object v5, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 94
    .line 95
    invoke-static {v5}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$200(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v5, " mMinBufferLength:"

    .line 103
    .line 104
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 115
    .line 116
    .line 117
    :try_start_1
    invoke-virtual {v4}, Landroid/media/AudioTrack;->play()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 121
    .line 122
    invoke-static {v0, v2}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$502(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;Z)Z

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 126
    .line 127
    invoke-static {v0}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$600(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-object v2, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 132
    .line 133
    invoke-static {v2}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$700(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->setAudioMode(Landroid/content/Context;I)V

    .line 138
    .line 139
    .line 140
    const/4 v0, 0x0

    .line 141
    const/16 v1, 0x64

    .line 142
    .line 143
    move v2, v0

    .line 144
    :catch_0
    :goto_2
    iget-boolean v5, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$AudioTrackThread;->mIsLooping:Z

    .line 145
    .line 146
    if-eqz v5, :cond_6

    .line 147
    .line 148
    iget-object v5, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 149
    .line 150
    invoke-static {v5}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$800(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)[B

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    if-eqz v5, :cond_5

    .line 155
    .line 156
    array-length v6, v5

    .line 157
    if-lez v6, :cond_5

    .line 158
    .line 159
    iget-object v6, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 160
    .line 161
    invoke-static {v6}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$300(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    iget-object v7, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 166
    .line 167
    invoke-static {v7}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$100(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    const-wide/16 v8, 0x0

    .line 172
    .line 173
    invoke-static {v5, v8, v9, v6, v7}, Lcom/tencent/liteav/audio/TXCAudioEngine;->onCorePlayPcmData([BJII)V

    .line 174
    .line 175
    .line 176
    iget-object v6, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 177
    .line 178
    invoke-static {v6}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$900(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-eqz v6, :cond_2

    .line 183
    .line 184
    invoke-static {v5, v0}, Ljava/util/Arrays;->fill([BB)V

    .line 185
    .line 186
    .line 187
    :cond_2
    if-eqz v1, :cond_4

    .line 188
    .line 189
    const/16 v6, 0x320

    .line 190
    .line 191
    if-ge v2, v6, :cond_4

    .line 192
    .line 193
    array-length v7, v5

    .line 194
    div-int/2addr v7, v3

    .line 195
    new-array v8, v7, [S

    .line 196
    .line 197
    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    sget-object v10, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 202
    .line 203
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    invoke-virtual {v9, v8}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    .line 212
    .line 213
    .line 214
    move v9, v0

    .line 215
    :goto_3
    if-ge v9, v7, :cond_3

    .line 216
    .line 217
    aget-short v10, v8, v9

    .line 218
    .line 219
    div-int/2addr v10, v1

    .line 220
    int-to-short v10, v10

    .line 221
    aput-short v10, v8, v9

    .line 222
    .line 223
    add-int/lit8 v9, v9, 0x1

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_3
    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 231
    .line 232
    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    invoke-virtual {v7, v8}, Ljava/nio/ShortBuffer;->put([S)Ljava/nio/ShortBuffer;

    .line 241
    .line 242
    .line 243
    array-length v7, v5

    .line 244
    iget-object v8, p0, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer$1;->this$0:Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;

    .line 245
    .line 246
    invoke-static {v8}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$300(Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;)I

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    mul-int/2addr v8, v3

    .line 251
    div-int/lit16 v8, v8, 0x3e8

    .line 252
    .line 253
    div-int/2addr v7, v8

    .line 254
    add-int/2addr v2, v7

    .line 255
    rsub-int v7, v2, 0x320

    .line 256
    .line 257
    mul-int/2addr v1, v7

    .line 258
    div-int/2addr v1, v6

    .line 259
    :cond_4
    array-length v6, v5

    .line 260
    invoke-virtual {v4, v5, v0, v6}, Landroid/media/AudioTrack;->write([BII)I

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_5
    const-wide/16 v5, 0x5

    .line 265
    .line 266
    :try_start_2
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_6
    :try_start_3
    invoke-virtual {v4}, Landroid/media/AudioTrack;->pause()V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4}, Landroid/media/AudioTrack;->flush()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4}, Landroid/media/AudioTrack;->stop()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4}, Landroid/media/AudioTrack;->release()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :catch_1
    move-exception v0

    .line 284
    invoke-static {}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$400()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    const-string v2, "stop AudioTrack failed."

    .line 289
    .line 290
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    :goto_4
    invoke-static {}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$400()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    const-string v1, "mult-player thread stop finish!"

    .line 298
    .line 299
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :catch_2
    move-exception v0

    .line 304
    invoke-static {}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$400()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    const-string v2, "start play failed."

    .line 309
    .line 310
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :catch_3
    move-exception v0

    .line 315
    invoke-static {}, Lcom/tencent/liteav/audio/impl/Play/TXCMultAudioTrackPlayer;->access$400()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    const-string v2, "create AudioTrack failed."

    .line 320
    .line 321
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    return-void
.end method

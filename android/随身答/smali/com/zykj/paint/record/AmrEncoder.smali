# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public Lcom/zykj/paint/record/AmrEncoder;
.super Lcom/zykj/paint/record/AudioEncoder;
.source "SourceFile"


# static fields
.field private static header:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/paint/record/AmrEncoder;->header:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        0x23t
        0x21t
        0x41t
        0x4dt
        0x52t
        0xat
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/AudioEncoder;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/paint/record/AudioEncoder;->destinationFile:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public encode(Ljava/lang/String;)V
    .locals 23
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "audio/3gpp"

    .line 6
    .line 7
    :try_start_0
    invoke-static {v2}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Landroid/media/MediaFormat;

    .line 12
    .line 13
    invoke-direct {v4}, Landroid/media/MediaFormat;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string/jumbo v5, "mime"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v5, v2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string/jumbo v2, "sample-rate"

    .line 23
    .line 24
    .line 25
    iget v5, v1, Lcom/zykj/paint/record/AudioEncoder;->SAMPLE_RATE:I

    .line 26
    .line 27
    invoke-virtual {v4, v2, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    const-string v2, "channel-count"

    .line 31
    .line 32
    iget v5, v1, Lcom/zykj/paint/record/AudioEncoder;->CHANNEL_COUNT:I

    .line 33
    .line 34
    invoke-virtual {v4, v2, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    const-string v2, "bitrate"

    .line 38
    .line 39
    iget v5, v1, Lcom/zykj/paint/record/AudioEncoder;->BIT_RATE:I

    .line 40
    .line 41
    invoke-virtual {v4, v2, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-virtual {v3, v4, v5, v5, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 47
    .line 48
    .line 49
    new-instance v4, Ljava/io/File;

    .line 50
    .line 51
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    new-instance v10, Ljava/io/FileInputStream;

    .line 55
    .line 56
    invoke-direct {v10, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 57
    .line 58
    .line 59
    new-instance v4, Ljava/io/File;

    .line 60
    .line 61
    iget-object v5, v1, Lcom/zykj/paint/record/AudioEncoder;->destinationFile:Ljava/lang/String;

    .line 62
    .line 63
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    new-instance v11, Ljava/io/FileOutputStream;

    .line 67
    .line 68
    invoke-direct {v11, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 69
    .line 70
    .line 71
    sget-object v4, Lcom/zykj/paint/record/AmrEncoder;->header:[B

    .line 72
    .line 73
    invoke-virtual {v11, v4}, Ljava/io/FileOutputStream;->write([B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Landroid/media/MediaCodec;->start()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    invoke-virtual {v3}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    const v4, 0x15888

    .line 88
    .line 89
    .line 90
    new-array v14, v4, [B

    .line 91
    .line 92
    new-instance v15, Landroid/media/MediaCodec$BufferInfo;

    .line 93
    .line 94
    invoke-direct {v15}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 95
    .line 96
    .line 97
    const-wide/16 v5, 0x0

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    :goto_0
    move/from16 v16, v7

    .line 101
    .line 102
    const/4 v7, 0x0

    .line 103
    :goto_1
    const-wide/16 v8, 0x0

    .line 104
    .line 105
    const/4 v4, -0x1

    .line 106
    if-eq v7, v4, :cond_2

    .line 107
    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    invoke-virtual {v3, v8, v9}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-ltz v7, :cond_1

    .line 115
    .line 116
    aget-object v8, v12, v7

    .line 117
    .line 118
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8}, Ljava/nio/Buffer;->limit()I

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-virtual {v10, v14, v4, v9}, Ljava/io/FileInputStream;->read([BII)I

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    const/4 v4, -0x1

    .line 131
    if-ne v9, v4, :cond_0

    .line 132
    .line 133
    move v4, v7

    .line 134
    double-to-long v7, v5

    .line 135
    const/4 v9, 0x4

    .line 136
    move-wide/from16 v18, v5

    .line 137
    .line 138
    const/4 v5, 0x0

    .line 139
    const/4 v6, 0x0

    .line 140
    move-object/from16 v20, v13

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    move-wide/from16 v21, v18

    .line 145
    .line 146
    move-object/from16 v19, v12

    .line 147
    .line 148
    move-wide/from16 v12, v21

    .line 149
    .line 150
    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 151
    .line 152
    .line 153
    move-wide v5, v12

    .line 154
    move/from16 v2, v17

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :catch_0
    move-exception v0

    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :cond_0
    move v4, v7

    .line 161
    move-object/from16 v19, v12

    .line 162
    .line 163
    move-object/from16 v20, v13

    .line 164
    .line 165
    move-wide v12, v5

    .line 166
    const/4 v5, 0x0

    .line 167
    add-int v16, v16, v9

    .line 168
    .line 169
    invoke-virtual {v8, v14, v5, v9}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 170
    .line 171
    .line 172
    double-to-long v7, v12

    .line 173
    move v6, v9

    .line 174
    const/4 v9, 0x0

    .line 175
    move/from16 v17, v5

    .line 176
    .line 177
    const/4 v5, 0x0

    .line 178
    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 179
    .line 180
    .line 181
    div-int/lit8 v5, v16, 0x2

    .line 182
    .line 183
    int-to-long v5, v5

    .line 184
    const-wide/32 v7, 0xf4240

    .line 185
    .line 186
    .line 187
    mul-long/2addr v5, v7

    .line 188
    iget v7, v1, Lcom/zykj/paint/record/AudioEncoder;->SAMPLE_RATE:I

    .line 189
    .line 190
    int-to-long v7, v7

    .line 191
    div-long/2addr v5, v7

    .line 192
    long-to-double v5, v5

    .line 193
    :goto_2
    move v7, v4

    .line 194
    :goto_3
    move-object/from16 v12, v19

    .line 195
    .line 196
    move-object/from16 v13, v20

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_1
    move v4, v7

    .line 200
    move-object/from16 v19, v12

    .line 201
    .line 202
    move-object/from16 v20, v13

    .line 203
    .line 204
    move-wide v12, v5

    .line 205
    goto :goto_3

    .line 206
    :cond_2
    move-object/from16 v19, v12

    .line 207
    .line 208
    move-object/from16 v20, v13

    .line 209
    .line 210
    move-wide v12, v5

    .line 211
    const/4 v5, 0x0

    .line 212
    move v4, v5

    .line 213
    :goto_4
    const/4 v6, -0x1

    .line 214
    if-eq v4, v6, :cond_4

    .line 215
    .line 216
    invoke-virtual {v3, v15, v8, v9}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-ltz v4, :cond_3

    .line 221
    .line 222
    aget-object v7, v20, v4

    .line 223
    .line 224
    iget v6, v15, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 225
    .line 226
    invoke-virtual {v7, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 227
    .line 228
    .line 229
    iget v6, v15, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 230
    .line 231
    iget v8, v15, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 232
    .line 233
    add-int/2addr v6, v8

    .line 234
    invoke-virtual {v7, v6}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 235
    .line 236
    .line 237
    iget v6, v15, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 238
    .line 239
    new-array v8, v6, [B

    .line 240
    .line 241
    invoke-virtual {v7, v8, v5, v6}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 242
    .line 243
    .line 244
    iget v6, v15, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 245
    .line 246
    invoke-virtual {v11, v8, v5, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v4, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 250
    .line 251
    .line 252
    :cond_3
    const-wide/16 v8, 0x0

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_4
    iget v4, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 256
    .line 257
    const/4 v6, 0x4

    .line 258
    if-ne v4, v6, :cond_6

    .line 259
    .line 260
    invoke-virtual {v10}, Ljava/io/FileInputStream;->close()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->close()V

    .line 267
    .line 268
    .line 269
    new-instance v2, Ljava/io/File;

    .line 270
    .line 271
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_5

    .line 279
    .line 280
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    .line 282
    .line 283
    :cond_5
    return-void

    .line 284
    :cond_6
    move-wide v5, v12

    .line 285
    move/from16 v7, v16

    .line 286
    .line 287
    move-object/from16 v12, v19

    .line 288
    .line 289
    move-object/from16 v13, v20

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 294
    .line 295
    .line 296
    return-void
.end method

.method public init(III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/zykj/paint/record/AudioEncoder;->init(III)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

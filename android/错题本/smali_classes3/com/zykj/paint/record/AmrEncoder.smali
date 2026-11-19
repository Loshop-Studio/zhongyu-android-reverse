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
    const-string v5, "mime"

    .line 17
    .line 18
    invoke-virtual {v4, v5, v2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v2, "sample-rate"

    .line 22
    .line 23
    iget v5, v1, Lcom/zykj/paint/record/AudioEncoder;->SAMPLE_RATE:I

    .line 24
    .line 25
    invoke-virtual {v4, v2, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    const-string v2, "channel-count"

    .line 29
    .line 30
    iget v5, v1, Lcom/zykj/paint/record/AudioEncoder;->CHANNEL_COUNT:I

    .line 31
    .line 32
    invoke-virtual {v4, v2, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    const-string v2, "bitrate"

    .line 36
    .line 37
    iget v5, v1, Lcom/zykj/paint/record/AudioEncoder;->BIT_RATE:I

    .line 38
    .line 39
    invoke-virtual {v4, v2, v5}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-virtual {v3, v4, v5, v5, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 45
    .line 46
    .line 47
    new-instance v4, Ljava/io/File;

    .line 48
    .line 49
    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v10, Ljava/io/FileInputStream;

    .line 53
    .line 54
    invoke-direct {v10, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 55
    .line 56
    .line 57
    new-instance v4, Ljava/io/File;

    .line 58
    .line 59
    iget-object v5, v1, Lcom/zykj/paint/record/AudioEncoder;->destinationFile:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v11, Ljava/io/FileOutputStream;

    .line 65
    .line 66
    invoke-direct {v11, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 67
    .line 68
    .line 69
    sget-object v4, Lcom/zykj/paint/record/AmrEncoder;->header:[B

    .line 70
    .line 71
    invoke-virtual {v11, v4}, Ljava/io/FileOutputStream;->write([B)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Landroid/media/MediaCodec;->start()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    invoke-virtual {v3}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    const v4, 0x15888

    .line 86
    .line 87
    .line 88
    new-array v14, v4, [B

    .line 89
    .line 90
    new-instance v15, Landroid/media/MediaCodec$BufferInfo;

    .line 91
    .line 92
    invoke-direct {v15}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 93
    .line 94
    .line 95
    const-wide/16 v5, 0x0

    .line 96
    .line 97
    const/4 v7, 0x0

    .line 98
    :goto_0
    move/from16 v16, v7

    .line 99
    .line 100
    const/4 v7, 0x0

    .line 101
    :goto_1
    const-wide/16 v8, 0x0

    .line 102
    .line 103
    const/4 v4, -0x1

    .line 104
    if-eq v7, v4, :cond_2

    .line 105
    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    invoke-virtual {v3, v8, v9}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-ltz v7, :cond_1

    .line 113
    .line 114
    aget-object v8, v12, v7

    .line 115
    .line 116
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v8}, Ljava/nio/Buffer;->limit()I

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    const/4 v4, 0x0

    .line 124
    invoke-virtual {v10, v14, v4, v9}, Ljava/io/FileInputStream;->read([BII)I

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    const/4 v4, -0x1

    .line 129
    if-ne v9, v4, :cond_0

    .line 130
    .line 131
    move v4, v7

    .line 132
    double-to-long v7, v5

    .line 133
    const/4 v9, 0x4

    .line 134
    move-wide/from16 v18, v5

    .line 135
    .line 136
    const/4 v5, 0x0

    .line 137
    const/4 v6, 0x0

    .line 138
    move-object/from16 v20, v13

    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    move-wide/from16 v21, v18

    .line 143
    .line 144
    move-object/from16 v19, v12

    .line 145
    .line 146
    move-wide/from16 v12, v21

    .line 147
    .line 148
    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 149
    .line 150
    .line 151
    move-wide v5, v12

    .line 152
    move/from16 v2, v17

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :catch_0
    move-exception v0

    .line 156
    goto/16 :goto_5

    .line 157
    .line 158
    :cond_0
    move v4, v7

    .line 159
    move-object/from16 v19, v12

    .line 160
    .line 161
    move-object/from16 v20, v13

    .line 162
    .line 163
    move-wide v12, v5

    .line 164
    const/4 v5, 0x0

    .line 165
    add-int v16, v16, v9

    .line 166
    .line 167
    invoke-virtual {v8, v14, v5, v9}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 168
    .line 169
    .line 170
    double-to-long v7, v12

    .line 171
    move v6, v9

    .line 172
    const/4 v9, 0x0

    .line 173
    move/from16 v17, v5

    .line 174
    .line 175
    const/4 v5, 0x0

    .line 176
    invoke-virtual/range {v3 .. v9}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 177
    .line 178
    .line 179
    div-int/lit8 v5, v16, 0x2

    .line 180
    .line 181
    int-to-long v5, v5

    .line 182
    const-wide/32 v7, 0xf4240

    .line 183
    .line 184
    .line 185
    mul-long/2addr v5, v7

    .line 186
    iget v7, v1, Lcom/zykj/paint/record/AudioEncoder;->SAMPLE_RATE:I

    .line 187
    .line 188
    int-to-long v7, v7

    .line 189
    div-long/2addr v5, v7

    .line 190
    long-to-double v5, v5

    .line 191
    :goto_2
    move v7, v4

    .line 192
    :goto_3
    move-object/from16 v12, v19

    .line 193
    .line 194
    move-object/from16 v13, v20

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_1
    move v4, v7

    .line 198
    move-object/from16 v19, v12

    .line 199
    .line 200
    move-object/from16 v20, v13

    .line 201
    .line 202
    move-wide v12, v5

    .line 203
    goto :goto_3

    .line 204
    :cond_2
    move-object/from16 v19, v12

    .line 205
    .line 206
    move-object/from16 v20, v13

    .line 207
    .line 208
    move-wide v12, v5

    .line 209
    const/4 v5, 0x0

    .line 210
    move v4, v5

    .line 211
    :goto_4
    const/4 v6, -0x1

    .line 212
    if-eq v4, v6, :cond_4

    .line 213
    .line 214
    invoke-virtual {v3, v15, v8, v9}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-ltz v4, :cond_3

    .line 219
    .line 220
    aget-object v7, v20, v4

    .line 221
    .line 222
    iget v6, v15, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 223
    .line 224
    invoke-virtual {v7, v6}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 225
    .line 226
    .line 227
    iget v6, v15, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 228
    .line 229
    iget v8, v15, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 230
    .line 231
    add-int/2addr v6, v8

    .line 232
    invoke-virtual {v7, v6}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 233
    .line 234
    .line 235
    iget v6, v15, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 236
    .line 237
    new-array v8, v6, [B

    .line 238
    .line 239
    invoke-virtual {v7, v8, v5, v6}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 240
    .line 241
    .line 242
    iget v6, v15, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 243
    .line 244
    invoke-virtual {v11, v8, v5, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v4, v5}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 248
    .line 249
    .line 250
    :cond_3
    const-wide/16 v8, 0x0

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_4
    iget v4, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 254
    .line 255
    const/4 v6, 0x4

    .line 256
    if-ne v4, v6, :cond_6

    .line 257
    .line 258
    invoke-virtual {v10}, Ljava/io/FileInputStream;->close()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v11}, Ljava/io/OutputStream;->flush()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->close()V

    .line 265
    .line 266
    .line 267
    new-instance v2, Ljava/io/File;

    .line 268
    .line 269
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_5

    .line 277
    .line 278
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    .line 280
    .line 281
    :cond_5
    return-void

    .line 282
    :cond_6
    move-wide v5, v12

    .line 283
    move/from16 v7, v16

    .line 284
    .line 285
    move-object/from16 v12, v19

    .line 286
    .line 287
    move-object/from16 v13, v20

    .line 288
    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 292
    .line 293
    .line 294
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

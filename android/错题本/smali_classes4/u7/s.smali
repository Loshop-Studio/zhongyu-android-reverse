.class public final Lu7/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final d:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lokio/BufferedSource;

.field public final b:Lu7/r;

.field public final c:Lu7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lu7/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "getLogger(Http2::class.java.name)"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lu7/s;->d:Ljava/util/logging/Logger;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lokio/BufferedSource;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lu7/s;->a:Lokio/BufferedSource;

    .line 10
    .line 11
    new-instance v0, Lu7/r;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lu7/r;-><init>(Lokio/BufferedSource;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lu7/s;->b:Lu7/r;

    .line 17
    .line 18
    new-instance p1, Lu7/c;

    .line 19
    .line 20
    invoke-direct {p1, v0}, Lu7/c;-><init>(Lu7/r;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lu7/s;->c:Lu7/c;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(ZLcom/zykj/mistake/feature/collection/component/n;)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    iget-object v3, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 7
    .line 8
    const-wide/16 v4, 0x9

    .line 9
    .line 10
    invoke-interface {v3, v4, v5}, Lokio/BufferedSource;->require(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    iget-object v3, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 14
    .line 15
    invoke-static {v3}, Lp7/c;->r(Lokio/BufferedSource;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v4, 0x4000

    .line 20
    .line 21
    if-gt v3, v4, :cond_2e

    .line 22
    .line 23
    iget-object v5, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 24
    .line 25
    invoke-interface {v5}, Lokio/BufferedSource;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    and-int/lit16 v5, v5, 0xff

    .line 30
    .line 31
    iget-object v6, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 32
    .line 33
    invoke-interface {v6}, Lokio/BufferedSource;->readByte()B

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    and-int/lit16 v7, v6, 0xff

    .line 38
    .line 39
    iget-object v8, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 40
    .line 41
    invoke-interface {v8}, Lokio/BufferedSource;->readInt()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    const v9, 0x7fffffff

    .line 46
    .line 47
    .line 48
    and-int/2addr v9, v8

    .line 49
    sget-object v10, Lu7/s;->d:Ljava/util/logging/Logger;

    .line 50
    .line 51
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 52
    .line 53
    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    const/4 v12, 0x1

    .line 58
    if-eqz v11, :cond_0

    .line 59
    .line 60
    invoke-static {v12, v9, v3, v5, v7}, Lu7/f;->a(ZIIII)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    const/4 v10, 0x4

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    if-ne v5, v10, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 74
    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v3, "Expected a SETTINGS frame but was "

    .line 78
    .line 79
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    sget-object v3, Lu7/f;->b:[Ljava/lang/String;

    .line 83
    .line 84
    array-length v4, v3

    .line 85
    if-ge v5, v4, :cond_2

    .line 86
    .line 87
    aget-object v3, v3, v5

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    const-string v3, "0x%02x"

    .line 91
    .line 92
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v3, v4}, Lp7/c;->g(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_3
    :goto_1
    const/4 v13, 0x5

    .line 116
    const/4 v14, 0x3

    .line 117
    const/4 v15, 0x2

    .line 118
    const/16 v11, 0x8

    .line 119
    .line 120
    move/from16 v16, v5

    .line 121
    .line 122
    const-wide/16 v4, 0x0

    .line 123
    .line 124
    packed-switch v16, :pswitch_data_0

    .line 125
    .line 126
    .line 127
    iget-object v0, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 128
    .line 129
    int-to-long v2, v3

    .line 130
    invoke-interface {v0, v2, v3}, Lokio/BufferedSource;->skip(J)V

    .line 131
    .line 132
    .line 133
    return v12

    .line 134
    :pswitch_0
    if-ne v3, v10, :cond_7

    .line 135
    .line 136
    iget-object v2, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 137
    .line 138
    invoke-interface {v2}, Lokio/BufferedSource;->readInt()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    const-wide/32 v6, 0x7fffffff

    .line 143
    .line 144
    .line 145
    int-to-long v2, v2

    .line 146
    and-long/2addr v2, v6

    .line 147
    cmp-long v4, v2, v4

    .line 148
    .line 149
    if-eqz v4, :cond_6

    .line 150
    .line 151
    if-nez v9, :cond_4

    .line 152
    .line 153
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 154
    .line 155
    move-object v4, v0

    .line 156
    check-cast v4, Lu7/o;

    .line 157
    .line 158
    monitor-enter v4

    .line 159
    :try_start_1
    iget-wide v5, v4, Lu7/o;->u:J

    .line 160
    .line 161
    add-long/2addr v5, v2

    .line 162
    iput-wide v5, v4, Lu7/o;->u:J

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    .line 166
    .line 167
    monitor-exit v4

    .line 168
    return v12

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    monitor-exit v4

    .line 171
    throw v0

    .line 172
    :cond_4
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Lu7/o;

    .line 175
    .line 176
    invoke-virtual {v0, v9}, Lu7/o;->c(I)Lu7/w;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    if-eqz v5, :cond_28

    .line 181
    .line 182
    monitor-enter v5

    .line 183
    :try_start_2
    iget-wide v6, v5, Lu7/w;->f:J

    .line 184
    .line 185
    add-long/2addr v6, v2

    .line 186
    iput-wide v6, v5, Lu7/w;->f:J

    .line 187
    .line 188
    if-lez v4, :cond_5

    .line 189
    .line 190
    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 191
    .line 192
    .line 193
    :cond_5
    monitor-exit v5

    .line 194
    return v12

    .line 195
    :catchall_1
    move-exception v0

    .line 196
    monitor-exit v5

    .line 197
    throw v0

    .line 198
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 199
    .line 200
    const-string v2, "windowSizeIncrement was 0"

    .line 201
    .line 202
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v0

    .line 206
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 207
    .line 208
    const-string v2, "TYPE_WINDOW_UPDATE length !=4: "

    .line 209
    .line 210
    invoke-static {v3, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw v0

    .line 218
    :pswitch_1
    if-lt v3, v11, :cond_e

    .line 219
    .line 220
    if-nez v9, :cond_d

    .line 221
    .line 222
    iget-object v4, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 223
    .line 224
    invoke-interface {v4}, Lokio/BufferedSource;->readInt()I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    iget-object v5, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 229
    .line 230
    invoke-interface {v5}, Lokio/BufferedSource;->readInt()I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    sub-int/2addr v3, v11

    .line 235
    sget-object v6, Lokhttp3/internal/http2/ErrorCode;->Companion:Lu7/a;

    .line 236
    .line 237
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {}, Lokhttp3/internal/http2/ErrorCode;->values()[Lokhttp3/internal/http2/ErrorCode;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    array-length v7, v6

    .line 245
    move v8, v2

    .line 246
    :goto_2
    if-ge v8, v7, :cond_9

    .line 247
    .line 248
    aget-object v9, v6, v8

    .line 249
    .line 250
    invoke-virtual {v9}, Lokhttp3/internal/http2/ErrorCode;->getHttpCode()I

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    if-ne v10, v5, :cond_8

    .line 255
    .line 256
    move-object v11, v9

    .line 257
    goto :goto_3

    .line 258
    :cond_8
    add-int/lit8 v8, v8, 0x1

    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_9
    const/4 v11, 0x0

    .line 262
    :goto_3
    if-eqz v11, :cond_c

    .line 263
    .line 264
    sget-object v5, Lokio/ByteString;->EMPTY:Lokio/ByteString;

    .line 265
    .line 266
    if-lez v3, :cond_a

    .line 267
    .line 268
    iget-object v5, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 269
    .line 270
    int-to-long v6, v3

    .line 271
    invoke-interface {v5, v6, v7}, Lokio/BufferedSource;->readByteString(J)Lokio/ByteString;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    :cond_a
    const-string v3, "debugData"

    .line 276
    .line 277
    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5}, Lokio/ByteString;->size()I

    .line 281
    .line 282
    .line 283
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v3, Lu7/o;

    .line 286
    .line 287
    monitor-enter v3

    .line 288
    :try_start_3
    iget-object v5, v3, Lu7/o;->b:Ljava/util/LinkedHashMap;

    .line 289
    .line 290
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    new-array v6, v2, [Lu7/w;

    .line 295
    .line 296
    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    iput-boolean v12, v3, Lu7/o;->f:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 301
    .line 302
    monitor-exit v3

    .line 303
    check-cast v5, [Lu7/w;

    .line 304
    .line 305
    array-length v3, v5

    .line 306
    :goto_4
    if-ge v2, v3, :cond_28

    .line 307
    .line 308
    aget-object v6, v5, v2

    .line 309
    .line 310
    iget v7, v6, Lu7/w;->a:I

    .line 311
    .line 312
    if-le v7, v4, :cond_b

    .line 313
    .line 314
    invoke-virtual {v6}, Lu7/w;->g()Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    if-eqz v7, :cond_b

    .line 319
    .line 320
    sget-object v7, Lokhttp3/internal/http2/ErrorCode;->REFUSED_STREAM:Lokhttp3/internal/http2/ErrorCode;

    .line 321
    .line 322
    invoke-virtual {v6, v7}, Lu7/w;->j(Lokhttp3/internal/http2/ErrorCode;)V

    .line 323
    .line 324
    .line 325
    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v7, Lu7/o;

    .line 328
    .line 329
    iget v6, v6, Lu7/w;->a:I

    .line 330
    .line 331
    invoke-virtual {v7, v6}, Lu7/o;->d(I)Lu7/w;

    .line 332
    .line 333
    .line 334
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 335
    .line 336
    goto :goto_4

    .line 337
    :catchall_2
    move-exception v0

    .line 338
    monitor-exit v3

    .line 339
    throw v0

    .line 340
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 341
    .line 342
    const-string v2, "TYPE_GOAWAY unexpected error code: "

    .line 343
    .line 344
    invoke-static {v5, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw v0

    .line 352
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 353
    .line 354
    const-string v2, "TYPE_GOAWAY streamId != 0"

    .line 355
    .line 356
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    throw v0

    .line 360
    :cond_e
    new-instance v0, Ljava/io/IOException;

    .line 361
    .line 362
    const-string v2, "TYPE_GOAWAY length < 8: "

    .line 363
    .line 364
    invoke-static {v3, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    throw v0

    .line 372
    :pswitch_2
    if-ne v3, v11, :cond_15

    .line 373
    .line 374
    if-nez v9, :cond_14

    .line 375
    .line 376
    iget-object v3, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 377
    .line 378
    invoke-interface {v3}, Lokio/BufferedSource;->readInt()I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    iget-object v7, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 383
    .line 384
    invoke-interface {v7}, Lokio/BufferedSource;->readInt()I

    .line 385
    .line 386
    .line 387
    move-result v7

    .line 388
    and-int/2addr v6, v12

    .line 389
    if-eqz v6, :cond_f

    .line 390
    .line 391
    move v2, v12

    .line 392
    :cond_f
    if-eqz v2, :cond_13

    .line 393
    .line 394
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 395
    .line 396
    move-object v2, v0

    .line 397
    check-cast v2, Lu7/o;

    .line 398
    .line 399
    monitor-enter v2

    .line 400
    const-wide/16 v4, 0x1

    .line 401
    .line 402
    if-eq v3, v12, :cond_12

    .line 403
    .line 404
    if-eq v3, v15, :cond_11

    .line 405
    .line 406
    if-eq v3, v14, :cond_10

    .line 407
    .line 408
    goto :goto_5

    .line 409
    :cond_10
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 410
    .line 411
    .line 412
    goto :goto_5

    .line 413
    :catchall_3
    move-exception v0

    .line 414
    goto :goto_6

    .line 415
    :cond_11
    iget-wide v6, v2, Lu7/o;->n:J

    .line 416
    .line 417
    add-long/2addr v6, v4

    .line 418
    iput-wide v6, v2, Lu7/o;->n:J

    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_12
    iget-wide v6, v2, Lu7/o;->l:J

    .line 422
    .line 423
    add-long/2addr v6, v4

    .line 424
    iput-wide v6, v2, Lu7/o;->l:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 425
    .line 426
    :goto_5
    monitor-exit v2

    .line 427
    return v12

    .line 428
    :goto_6
    monitor-exit v2

    .line 429
    throw v0

    .line 430
    :cond_13
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v2, Lu7/o;

    .line 433
    .line 434
    iget-object v2, v2, Lu7/o;->h:Lr7/b;

    .line 435
    .line 436
    new-instance v6, Ljava/lang/StringBuilder;

    .line 437
    .line 438
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 439
    .line 440
    .line 441
    iget-object v8, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v8, Lu7/o;

    .line 444
    .line 445
    iget-object v8, v8, Lu7/o;->c:Ljava/lang/String;

    .line 446
    .line 447
    const-string v9, " ping"

    .line 448
    .line 449
    invoke-static {v6, v8, v9}, Landroid/support/v4/media/f;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v0, Lu7/o;

    .line 456
    .line 457
    new-instance v8, Lu7/j;

    .line 458
    .line 459
    invoke-direct {v8, v6, v0, v3, v7}, Lu7/j;-><init>(Ljava/lang/String;Lu7/o;II)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v8, v4, v5}, Lr7/b;->b(Lr7/a;J)V

    .line 463
    .line 464
    .line 465
    return v12

    .line 466
    :cond_14
    new-instance v0, Ljava/io/IOException;

    .line 467
    .line 468
    const-string v2, "TYPE_PING streamId != 0"

    .line 469
    .line 470
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    throw v0

    .line 474
    :cond_15
    new-instance v0, Ljava/io/IOException;

    .line 475
    .line 476
    const-string v2, "TYPE_PING length != 8: "

    .line 477
    .line 478
    invoke-static {v3, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    throw v0

    .line 486
    :pswitch_3
    invoke-virtual {v1, v0, v3, v7, v9}, Lu7/s;->e(Lcom/zykj/mistake/feature/collection/component/n;III)V

    .line 487
    .line 488
    .line 489
    return v12

    .line 490
    :pswitch_4
    iget-object v7, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 491
    .line 492
    if-nez v9, :cond_24

    .line 493
    .line 494
    and-int/2addr v6, v12

    .line 495
    if-eqz v6, :cond_17

    .line 496
    .line 497
    if-nez v3, :cond_16

    .line 498
    .line 499
    goto/16 :goto_b

    .line 500
    .line 501
    :cond_16
    new-instance v0, Ljava/io/IOException;

    .line 502
    .line 503
    const-string v2, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 504
    .line 505
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    throw v0

    .line 509
    :cond_17
    rem-int/lit8 v6, v3, 0x6

    .line 510
    .line 511
    if-nez v6, :cond_23

    .line 512
    .line 513
    new-instance v6, Lu7/b0;

    .line 514
    .line 515
    invoke-direct {v6}, Lu7/b0;-><init>()V

    .line 516
    .line 517
    .line 518
    invoke-static {v2, v3}, Lkotlin/collections/u;->N(II)Lx6/f;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    const/4 v3, 0x6

    .line 523
    invoke-static {v2, v3}, Lkotlin/collections/u;->J(Lx6/f;I)Lx6/d;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    iget v3, v2, Lx6/d;->a:I

    .line 528
    .line 529
    iget v8, v2, Lx6/d;->b:I

    .line 530
    .line 531
    iget v2, v2, Lx6/d;->c:I

    .line 532
    .line 533
    if-lez v2, :cond_18

    .line 534
    .line 535
    if-le v3, v8, :cond_19

    .line 536
    .line 537
    :cond_18
    if-gez v2, :cond_22

    .line 538
    .line 539
    if-gt v8, v3, :cond_22

    .line 540
    .line 541
    :cond_19
    :goto_7
    invoke-interface {v7}, Lokio/BufferedSource;->readShort()S

    .line 542
    .line 543
    .line 544
    move-result v9

    .line 545
    sget-object v11, Lp7/c;->a:[B

    .line 546
    .line 547
    const v11, 0xffff

    .line 548
    .line 549
    .line 550
    and-int/2addr v9, v11

    .line 551
    invoke-interface {v7}, Lokio/BufferedSource;->readInt()I

    .line 552
    .line 553
    .line 554
    move-result v11

    .line 555
    if-eq v9, v15, :cond_1f

    .line 556
    .line 557
    if-eq v9, v14, :cond_1e

    .line 558
    .line 559
    if-eq v9, v10, :cond_1c

    .line 560
    .line 561
    if-eq v9, v13, :cond_1a

    .line 562
    .line 563
    goto :goto_8

    .line 564
    :cond_1a
    const/16 v14, 0x4000

    .line 565
    .line 566
    if-lt v11, v14, :cond_1b

    .line 567
    .line 568
    const v14, 0xffffff

    .line 569
    .line 570
    .line 571
    if-gt v11, v14, :cond_1b

    .line 572
    .line 573
    goto :goto_8

    .line 574
    :cond_1b
    new-instance v0, Ljava/io/IOException;

    .line 575
    .line 576
    const-string v2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    .line 577
    .line 578
    invoke-static {v11, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    throw v0

    .line 586
    :cond_1c
    if-ltz v11, :cond_1d

    .line 587
    .line 588
    const/4 v9, 0x7

    .line 589
    goto :goto_8

    .line 590
    :cond_1d
    new-instance v0, Ljava/io/IOException;

    .line 591
    .line 592
    const-string v2, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 593
    .line 594
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    throw v0

    .line 598
    :cond_1e
    move v9, v10

    .line 599
    goto :goto_8

    .line 600
    :cond_1f
    if-eqz v11, :cond_21

    .line 601
    .line 602
    if-ne v11, v12, :cond_20

    .line 603
    .line 604
    goto :goto_8

    .line 605
    :cond_20
    new-instance v0, Ljava/io/IOException;

    .line 606
    .line 607
    const-string v2, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 608
    .line 609
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    throw v0

    .line 613
    :cond_21
    :goto_8
    invoke-virtual {v6, v9, v11}, Lu7/b0;->c(II)V

    .line 614
    .line 615
    .line 616
    if-eq v3, v8, :cond_22

    .line 617
    .line 618
    add-int/2addr v3, v2

    .line 619
    const/4 v14, 0x3

    .line 620
    goto :goto_7

    .line 621
    :cond_22
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v2, Lu7/o;

    .line 624
    .line 625
    iget-object v3, v2, Lu7/o;->h:Lr7/b;

    .line 626
    .line 627
    new-instance v7, Ljava/lang/StringBuilder;

    .line 628
    .line 629
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 630
    .line 631
    .line 632
    iget-object v2, v2, Lu7/o;->c:Ljava/lang/String;

    .line 633
    .line 634
    const-string v8, " applyAndAckSettings"

    .line 635
    .line 636
    invoke-static {v7, v2, v8}, Landroid/support/v4/media/f;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    new-instance v7, Lu7/i;

    .line 641
    .line 642
    invoke-direct {v7, v15, v2, v0, v6}, Lu7/i;-><init>(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v3, v7, v4, v5}, Lr7/b;->b(Lr7/a;J)V

    .line 646
    .line 647
    .line 648
    return v12

    .line 649
    :cond_23
    new-instance v0, Ljava/io/IOException;

    .line 650
    .line 651
    const-string v2, "TYPE_SETTINGS length % 6 != 0: "

    .line 652
    .line 653
    invoke-static {v3, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    throw v0

    .line 661
    :cond_24
    new-instance v0, Ljava/io/IOException;

    .line 662
    .line 663
    const-string v2, "TYPE_SETTINGS streamId != 0"

    .line 664
    .line 665
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    throw v0

    .line 669
    :pswitch_5
    if-ne v3, v10, :cond_2b

    .line 670
    .line 671
    if-eqz v9, :cond_2a

    .line 672
    .line 673
    iget-object v3, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 674
    .line 675
    invoke-interface {v3}, Lokio/BufferedSource;->readInt()I

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    sget-object v6, Lokhttp3/internal/http2/ErrorCode;->Companion:Lu7/a;

    .line 680
    .line 681
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    invoke-static {}, Lokhttp3/internal/http2/ErrorCode;->values()[Lokhttp3/internal/http2/ErrorCode;

    .line 685
    .line 686
    .line 687
    move-result-object v6

    .line 688
    array-length v7, v6

    .line 689
    :goto_9
    if-ge v2, v7, :cond_26

    .line 690
    .line 691
    aget-object v10, v6, v2

    .line 692
    .line 693
    invoke-virtual {v10}, Lokhttp3/internal/http2/ErrorCode;->getHttpCode()I

    .line 694
    .line 695
    .line 696
    move-result v11

    .line 697
    if-ne v11, v3, :cond_25

    .line 698
    .line 699
    move-object v11, v10

    .line 700
    goto :goto_a

    .line 701
    :cond_25
    add-int/lit8 v2, v2, 0x1

    .line 702
    .line 703
    goto :goto_9

    .line 704
    :cond_26
    const/4 v11, 0x0

    .line 705
    :goto_a
    if-eqz v11, :cond_29

    .line 706
    .line 707
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v0, Lu7/o;

    .line 710
    .line 711
    if-eqz v9, :cond_27

    .line 712
    .line 713
    and-int/lit8 v2, v8, 0x1

    .line 714
    .line 715
    if-nez v2, :cond_27

    .line 716
    .line 717
    iget-object v2, v0, Lu7/o;->i:Lr7/b;

    .line 718
    .line 719
    new-instance v3, Ljava/lang/StringBuilder;

    .line 720
    .line 721
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 722
    .line 723
    .line 724
    iget-object v6, v0, Lu7/o;->c:Ljava/lang/String;

    .line 725
    .line 726
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    const/16 v6, 0x5b

    .line 730
    .line 731
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    const-string v6, "] onReset"

    .line 738
    .line 739
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    new-instance v6, Lu7/m;

    .line 747
    .line 748
    invoke-direct {v6, v3, v0, v9, v11}, Lu7/m;-><init>(Ljava/lang/String;Lu7/o;ILokhttp3/internal/http2/ErrorCode;)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v2, v6, v4, v5}, Lr7/b;->b(Lr7/a;J)V

    .line 752
    .line 753
    .line 754
    return v12

    .line 755
    :cond_27
    invoke-virtual {v0, v9}, Lu7/o;->d(I)Lu7/w;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    if-eqz v0, :cond_28

    .line 760
    .line 761
    invoke-virtual {v0, v11}, Lu7/w;->j(Lokhttp3/internal/http2/ErrorCode;)V

    .line 762
    .line 763
    .line 764
    :cond_28
    :goto_b
    return v12

    .line 765
    :cond_29
    new-instance v0, Ljava/io/IOException;

    .line 766
    .line 767
    const-string v2, "TYPE_RST_STREAM unexpected error code: "

    .line 768
    .line 769
    invoke-static {v3, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    throw v0

    .line 777
    :cond_2a
    new-instance v0, Ljava/io/IOException;

    .line 778
    .line 779
    const-string v2, "TYPE_RST_STREAM streamId == 0"

    .line 780
    .line 781
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    throw v0

    .line 785
    :cond_2b
    new-instance v0, Ljava/io/IOException;

    .line 786
    .line 787
    const-string v2, "TYPE_RST_STREAM length: "

    .line 788
    .line 789
    const-string v4, " != 4"

    .line 790
    .line 791
    invoke-static {v3, v2, v4}, Landroid/support/v4/media/f;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    throw v0

    .line 799
    :pswitch_6
    if-ne v3, v13, :cond_2d

    .line 800
    .line 801
    if-eqz v9, :cond_2c

    .line 802
    .line 803
    iget-object v0, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 804
    .line 805
    invoke-interface {v0}, Lokio/BufferedSource;->readInt()I

    .line 806
    .line 807
    .line 808
    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    .line 809
    .line 810
    .line 811
    return v12

    .line 812
    :cond_2c
    new-instance v0, Ljava/io/IOException;

    .line 813
    .line 814
    const-string v2, "TYPE_PRIORITY streamId == 0"

    .line 815
    .line 816
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    throw v0

    .line 820
    :cond_2d
    new-instance v0, Ljava/io/IOException;

    .line 821
    .line 822
    const-string v2, "TYPE_PRIORITY length: "

    .line 823
    .line 824
    const-string v4, " != 5"

    .line 825
    .line 826
    invoke-static {v3, v2, v4}, Landroid/support/v4/media/f;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    throw v0

    .line 834
    :pswitch_7
    invoke-virtual {v1, v0, v3, v7, v9}, Lu7/s;->d(Lcom/zykj/mistake/feature/collection/component/n;III)V

    .line 835
    .line 836
    .line 837
    return v12

    .line 838
    :pswitch_8
    invoke-virtual {v1, v0, v3, v7, v9}, Lu7/s;->b(Lcom/zykj/mistake/feature/collection/component/n;III)V

    .line 839
    .line 840
    .line 841
    return v12

    .line 842
    :cond_2e
    new-instance v0, Ljava/io/IOException;

    .line 843
    .line 844
    const-string v2, "FRAME_SIZE_ERROR: "

    .line 845
    .line 846
    invoke-static {v3, v2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    throw v0

    .line 854
    :catch_0
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lcom/zykj/mistake/feature/collection/component/n;III)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v5, p4

    .line 8
    .line 9
    if-eqz v5, :cond_e

    .line 10
    .line 11
    and-int/lit8 v3, v2, 0x1

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    move v8, v6

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v8, 0x0

    .line 19
    :goto_0
    and-int/lit8 v3, v2, 0x20

    .line 20
    .line 21
    if-nez v3, :cond_d

    .line 22
    .line 23
    and-int/lit8 v3, v2, 0x8

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    iget-object v3, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 28
    .line 29
    invoke-interface {v3}, Lokio/BufferedSource;->readByte()B

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    sget-object v7, Lp7/c;->a:[B

    .line 34
    .line 35
    and-int/lit16 v3, v3, 0xff

    .line 36
    .line 37
    move v9, v3

    .line 38
    :goto_1
    move/from16 v3, p2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const/4 v9, 0x0

    .line 42
    goto :goto_1

    .line 43
    :goto_2
    invoke-static {v3, v2, v9}, Lu7/q;->a(III)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    iget-object v2, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 48
    .line 49
    const-string v3, "source"

    .line 50
    .line 51
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Lu7/o;

    .line 57
    .line 58
    const-wide/16 v10, 0x0

    .line 59
    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    and-int/lit8 v12, v5, 0x1

    .line 63
    .line 64
    if-nez v12, :cond_2

    .line 65
    .line 66
    new-instance v6, Lokio/Buffer;

    .line 67
    .line 68
    invoke-direct {v6}, Lokio/Buffer;-><init>()V

    .line 69
    .line 70
    .line 71
    int-to-long v12, v7

    .line 72
    invoke-interface {v2, v12, v13}, Lokio/BufferedSource;->require(J)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2, v6, v12, v13}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 76
    .line 77
    .line 78
    iget-object v0, v3, Lu7/o;->i:Lr7/b;

    .line 79
    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    iget-object v4, v3, Lu7/o;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const/16 v4, 0x5b

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v4, "] onData"

    .line 99
    .line 100
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    move-object v4, v3

    .line 108
    move-object v3, v2

    .line 109
    new-instance v2, Lu7/k;

    .line 110
    .line 111
    invoke-direct/range {v2 .. v8}, Lu7/k;-><init>(Ljava/lang/String;Lu7/o;ILokio/Buffer;IZ)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2, v10, v11}, Lr7/b;->b(Lr7/a;J)V

    .line 115
    .line 116
    .line 117
    goto/16 :goto_9

    .line 118
    .line 119
    :cond_2
    invoke-virtual {v3, v5}, Lu7/o;->c(I)Lu7/w;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    if-nez v3, :cond_3

    .line 124
    .line 125
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v3, Lu7/o;

    .line 128
    .line 129
    sget-object v4, Lokhttp3/internal/http2/ErrorCode;->PROTOCOL_ERROR:Lokhttp3/internal/http2/ErrorCode;

    .line 130
    .line 131
    invoke-virtual {v3, v5, v4}, Lu7/o;->h(ILokhttp3/internal/http2/ErrorCode;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, v0, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lu7/o;

    .line 137
    .line 138
    int-to-long v3, v7

    .line 139
    invoke-virtual {v0, v3, v4}, Lu7/o;->f(J)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v2, v3, v4}, Lokio/BufferedSource;->skip(J)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_9

    .line 146
    .line 147
    :cond_3
    sget-object v0, Lp7/c;->a:[B

    .line 148
    .line 149
    iget-object v0, v3, Lu7/w;->i:Lu7/u;

    .line 150
    .line 151
    int-to-long v12, v7

    .line 152
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-wide v14, v12

    .line 156
    :goto_3
    cmp-long v5, v14, v10

    .line 157
    .line 158
    if-lez v5, :cond_b

    .line 159
    .line 160
    iget-object v5, v0, Lu7/u;->f:Lu7/w;

    .line 161
    .line 162
    monitor-enter v5

    .line 163
    :try_start_0
    iget-boolean v7, v0, Lu7/u;->b:Z

    .line 164
    .line 165
    iget-object v4, v0, Lu7/u;->d:Lokio/Buffer;

    .line 166
    .line 167
    invoke-virtual {v4}, Lokio/Buffer;->size()J

    .line 168
    .line 169
    .line 170
    move-result-wide v16

    .line 171
    add-long v16, v14, v16

    .line 172
    .line 173
    move-wide/from16 p2, v10

    .line 174
    .line 175
    iget-wide v10, v0, Lu7/u;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 176
    .line 177
    cmp-long v4, v16, v10

    .line 178
    .line 179
    if-lez v4, :cond_4

    .line 180
    .line 181
    move v4, v6

    .line 182
    goto :goto_4

    .line 183
    :cond_4
    const/4 v4, 0x0

    .line 184
    :goto_4
    monitor-exit v5

    .line 185
    if-eqz v4, :cond_5

    .line 186
    .line 187
    invoke-interface {v2, v14, v15}, Lokio/BufferedSource;->skip(J)V

    .line 188
    .line 189
    .line 190
    iget-object v0, v0, Lu7/u;->f:Lu7/w;

    .line 191
    .line 192
    sget-object v2, Lokhttp3/internal/http2/ErrorCode;->FLOW_CONTROL_ERROR:Lokhttp3/internal/http2/ErrorCode;

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Lu7/w;->e(Lokhttp3/internal/http2/ErrorCode;)V

    .line 195
    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_5
    if-eqz v7, :cond_6

    .line 199
    .line 200
    invoke-interface {v2, v14, v15}, Lokio/BufferedSource;->skip(J)V

    .line 201
    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_6
    iget-object v4, v0, Lu7/u;->c:Lokio/Buffer;

    .line 205
    .line 206
    invoke-interface {v2, v4, v14, v15}, Lokio/Source;->read(Lokio/Buffer;J)J

    .line 207
    .line 208
    .line 209
    move-result-wide v4

    .line 210
    const-wide/16 v10, -0x1

    .line 211
    .line 212
    cmp-long v7, v4, v10

    .line 213
    .line 214
    if-eqz v7, :cond_a

    .line 215
    .line 216
    sub-long/2addr v14, v4

    .line 217
    iget-object v4, v0, Lu7/u;->f:Lu7/w;

    .line 218
    .line 219
    monitor-enter v4

    .line 220
    :try_start_1
    iget-boolean v5, v0, Lu7/u;->e:Z

    .line 221
    .line 222
    if-eqz v5, :cond_7

    .line 223
    .line 224
    iget-object v5, v0, Lu7/u;->c:Lokio/Buffer;

    .line 225
    .line 226
    invoke-virtual {v5}, Lokio/Buffer;->clear()V

    .line 227
    .line 228
    .line 229
    goto :goto_6

    .line 230
    :catchall_0
    move-exception v0

    .line 231
    goto :goto_7

    .line 232
    :cond_7
    iget-object v5, v0, Lu7/u;->d:Lokio/Buffer;

    .line 233
    .line 234
    invoke-virtual {v5}, Lokio/Buffer;->size()J

    .line 235
    .line 236
    .line 237
    move-result-wide v10

    .line 238
    cmp-long v5, v10, p2

    .line 239
    .line 240
    if-nez v5, :cond_8

    .line 241
    .line 242
    move v5, v6

    .line 243
    goto :goto_5

    .line 244
    :cond_8
    const/4 v5, 0x0

    .line 245
    :goto_5
    iget-object v7, v0, Lu7/u;->d:Lokio/Buffer;

    .line 246
    .line 247
    iget-object v10, v0, Lu7/u;->c:Lokio/Buffer;

    .line 248
    .line 249
    invoke-virtual {v7, v10}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 250
    .line 251
    .line 252
    if-eqz v5, :cond_9

    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 255
    .line 256
    .line 257
    :cond_9
    :goto_6
    monitor-exit v4

    .line 258
    move-wide/from16 v10, p2

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :goto_7
    monitor-exit v4

    .line 262
    throw v0

    .line 263
    :cond_a
    new-instance v0, Ljava/io/EOFException;

    .line 264
    .line 265
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 266
    .line 267
    .line 268
    throw v0

    .line 269
    :catchall_1
    move-exception v0

    .line 270
    monitor-exit v5

    .line 271
    throw v0

    .line 272
    :cond_b
    iget-object v0, v0, Lu7/u;->f:Lu7/w;

    .line 273
    .line 274
    sget-object v2, Lp7/c;->a:[B

    .line 275
    .line 276
    iget-object v0, v0, Lu7/w;->b:Lu7/o;

    .line 277
    .line 278
    invoke-virtual {v0, v12, v13}, Lu7/o;->f(J)V

    .line 279
    .line 280
    .line 281
    :goto_8
    if-eqz v8, :cond_c

    .line 282
    .line 283
    sget-object v0, Lp7/c;->b:Lokhttp3/q;

    .line 284
    .line 285
    invoke-virtual {v3, v0, v6}, Lu7/w;->i(Lokhttp3/q;Z)V

    .line 286
    .line 287
    .line 288
    :cond_c
    :goto_9
    iget-object v0, v1, Lu7/s;->a:Lokio/BufferedSource;

    .line 289
    .line 290
    int-to-long v2, v9

    .line 291
    invoke-interface {v0, v2, v3}, Lokio/BufferedSource;->skip(J)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 296
    .line 297
    const-string v2, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 298
    .line 299
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw v0

    .line 303
    :cond_e
    new-instance v0, Ljava/io/IOException;

    .line 304
    .line 305
    const-string v2, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    .line 306
    .line 307
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v0
.end method

.method public final c(IIII)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lu7/s;->b:Lu7/r;

    .line 2
    .line 3
    iput p1, v0, Lu7/r;->e:I

    .line 4
    .line 5
    iput p1, v0, Lu7/r;->b:I

    .line 6
    .line 7
    iput p2, v0, Lu7/r;->f:I

    .line 8
    .line 9
    iput p3, v0, Lu7/r;->c:I

    .line 10
    .line 11
    iput p4, v0, Lu7/r;->d:I

    .line 12
    .line 13
    iget-object p1, p0, Lu7/s;->c:Lu7/c;

    .line 14
    .line 15
    iget-object p2, p1, Lu7/c;->c:Lokio/BufferedSource;

    .line 16
    .line 17
    iget-object p3, p1, Lu7/c;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-interface {p2}, Lokio/BufferedSource;->exhausted()Z

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    if-nez p4, :cond_c

    .line 24
    .line 25
    invoke-interface {p2}, Lokio/BufferedSource;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    sget-object v0, Lp7/c;->a:[B

    .line 30
    .line 31
    and-int/lit16 v0, p4, 0xff

    .line 32
    .line 33
    const/16 v1, 0x80

    .line 34
    .line 35
    if-eq v0, v1, :cond_b

    .line 36
    .line 37
    and-int/lit16 v2, p4, 0x80

    .line 38
    .line 39
    if-ne v2, v1, :cond_3

    .line 40
    .line 41
    const/16 p4, 0x7f

    .line 42
    .line 43
    invoke-virtual {p1, v0, p4}, Lu7/c;->e(II)I

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    add-int/lit8 v0, p4, -0x1

    .line 48
    .line 49
    if-ltz v0, :cond_1

    .line 50
    .line 51
    sget-object v1, Lu7/e;->a:[Lu7/b;

    .line 52
    .line 53
    array-length v2, v1

    .line 54
    add-int/lit8 v2, v2, -0x1

    .line 55
    .line 56
    if-gt v0, v2, :cond_1

    .line 57
    .line 58
    aget-object p4, v1, v0

    .line 59
    .line 60
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    sget-object v1, Lu7/e;->a:[Lu7/b;

    .line 65
    .line 66
    array-length v1, v1

    .line 67
    sub-int/2addr v0, v1

    .line 68
    iget v1, p1, Lu7/c;->e:I

    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    add-int/2addr v1, v0

    .line 73
    if-ltz v1, :cond_2

    .line 74
    .line 75
    iget-object v0, p1, Lu7/c;->d:[Lu7/b;

    .line 76
    .line 77
    array-length v2, v0

    .line 78
    if-ge v1, v2, :cond_2

    .line 79
    .line 80
    aget-object p4, v0, v1

    .line 81
    .line 82
    invoke-static {p4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 90
    .line 91
    const-string p2, "Header index too large "

    .line 92
    .line 93
    invoke-static {p4, p2}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_3
    const/16 v1, 0x40

    .line 102
    .line 103
    if-ne v0, v1, :cond_4

    .line 104
    .line 105
    sget-object p4, Lu7/e;->a:[Lu7/b;

    .line 106
    .line 107
    invoke-virtual {p1}, Lu7/c;->d()Lokio/ByteString;

    .line 108
    .line 109
    .line 110
    move-result-object p4

    .line 111
    invoke-static {p4}, Lu7/e;->a(Lokio/ByteString;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Lu7/c;->d()Lokio/ByteString;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v1, Lu7/b;

    .line 119
    .line 120
    invoke-direct {v1, p4, v0}, Lu7/b;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v1}, Lu7/c;->c(Lu7/b;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    and-int/lit8 v2, p4, 0x40

    .line 128
    .line 129
    if-ne v2, v1, :cond_5

    .line 130
    .line 131
    const/16 p4, 0x3f

    .line 132
    .line 133
    invoke-virtual {p1, v0, p4}, Lu7/c;->e(II)I

    .line 134
    .line 135
    .line 136
    move-result p4

    .line 137
    add-int/lit8 p4, p4, -0x1

    .line 138
    .line 139
    invoke-virtual {p1, p4}, Lu7/c;->b(I)Lokio/ByteString;

    .line 140
    .line 141
    .line 142
    move-result-object p4

    .line 143
    invoke-virtual {p1}, Lu7/c;->d()Lokio/ByteString;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    new-instance v1, Lu7/b;

    .line 148
    .line 149
    invoke-direct {v1, p4, v0}, Lu7/b;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v1}, Lu7/c;->c(Lu7/b;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_5
    and-int/lit8 p4, p4, 0x20

    .line 158
    .line 159
    const/16 v1, 0x20

    .line 160
    .line 161
    if-ne p4, v1, :cond_8

    .line 162
    .line 163
    const/16 p4, 0x1f

    .line 164
    .line 165
    invoke-virtual {p1, v0, p4}, Lu7/c;->e(II)I

    .line 166
    .line 167
    .line 168
    move-result p4

    .line 169
    iput p4, p1, Lu7/c;->a:I

    .line 170
    .line 171
    if-ltz p4, :cond_7

    .line 172
    .line 173
    const/16 v0, 0x1000

    .line 174
    .line 175
    if-gt p4, v0, :cond_7

    .line 176
    .line 177
    iget v0, p1, Lu7/c;->g:I

    .line 178
    .line 179
    if-ge p4, v0, :cond_0

    .line 180
    .line 181
    if-nez p4, :cond_6

    .line 182
    .line 183
    iget-object p4, p1, Lu7/c;->d:[Lu7/b;

    .line 184
    .line 185
    const/4 v0, 0x0

    .line 186
    invoke-static {p4, v0}, Lkotlin/collections/q;->P([Ljava/lang/Object;Le7/r;)V

    .line 187
    .line 188
    .line 189
    iget-object p4, p1, Lu7/c;->d:[Lu7/b;

    .line 190
    .line 191
    array-length p4, p4

    .line 192
    add-int/lit8 p4, p4, -0x1

    .line 193
    .line 194
    iput p4, p1, Lu7/c;->e:I

    .line 195
    .line 196
    const/4 p4, 0x0

    .line 197
    iput p4, p1, Lu7/c;->f:I

    .line 198
    .line 199
    iput p4, p1, Lu7/c;->g:I

    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_6
    sub-int/2addr v0, p4

    .line 204
    invoke-virtual {p1, v0}, Lu7/c;->a(I)I

    .line 205
    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_7
    new-instance p2, Ljava/io/IOException;

    .line 210
    .line 211
    new-instance p3, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string p4, "Invalid dynamic table size update "

    .line 214
    .line 215
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    iget p1, p1, Lu7/c;->a:I

    .line 219
    .line 220
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p2

    .line 231
    :cond_8
    const/16 p4, 0x10

    .line 232
    .line 233
    if-eq v0, p4, :cond_a

    .line 234
    .line 235
    if-nez v0, :cond_9

    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_9
    const/16 p4, 0xf

    .line 239
    .line 240
    invoke-virtual {p1, v0, p4}, Lu7/c;->e(II)I

    .line 241
    .line 242
    .line 243
    move-result p4

    .line 244
    add-int/lit8 p4, p4, -0x1

    .line 245
    .line 246
    invoke-virtual {p1, p4}, Lu7/c;->b(I)Lokio/ByteString;

    .line 247
    .line 248
    .line 249
    move-result-object p4

    .line 250
    invoke-virtual {p1}, Lu7/c;->d()Lokio/ByteString;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    new-instance v1, Lu7/b;

    .line 255
    .line 256
    invoke-direct {v1, p4, v0}, Lu7/b;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_a
    :goto_1
    sget-object p4, Lu7/e;->a:[Lu7/b;

    .line 265
    .line 266
    invoke-virtual {p1}, Lu7/c;->d()Lokio/ByteString;

    .line 267
    .line 268
    .line 269
    move-result-object p4

    .line 270
    invoke-static {p4}, Lu7/e;->a(Lokio/ByteString;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Lu7/c;->d()Lokio/ByteString;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    new-instance v1, Lu7/b;

    .line 278
    .line 279
    invoke-direct {v1, p4, v0}, Lu7/b;-><init>(Lokio/ByteString;Lokio/ByteString;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    goto/16 :goto_0

    .line 286
    .line 287
    :cond_b
    new-instance p1, Ljava/io/IOException;

    .line 288
    .line 289
    const-string p2, "index == 0"

    .line 290
    .line 291
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw p1

    .line 295
    :cond_c
    invoke-static {p3}, Lkotlin/collections/t;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-virtual {p3}, Ljava/util/ArrayList;->clear()V

    .line 300
    .line 301
    .line 302
    return-object p1
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/s;->a:Lokio/BufferedSource;

    .line 2
    .line 3
    invoke-interface {v0}, Lokio/Source;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Lcom/zykj/mistake/feature/collection/component/n;III)V
    .locals 9

    .line 1
    if-eqz p4, :cond_8

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v7, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v7, v1

    .line 12
    :goto_0
    and-int/lit8 v0, p3, 0x8

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lu7/s;->a:Lokio/BufferedSource;

    .line 17
    .line 18
    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget-object v1, Lp7/c;->a:[B

    .line 23
    .line 24
    and-int/lit16 v1, v0, 0xff

    .line 25
    .line 26
    :cond_1
    and-int/lit8 v0, p3, 0x20

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lu7/s;->a:Lokio/BufferedSource;

    .line 31
    .line 32
    invoke-interface {v0}, Lokio/BufferedSource;->readInt()I

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    .line 36
    .line 37
    .line 38
    sget-object v0, Lp7/c;->a:[B

    .line 39
    .line 40
    add-int/lit8 p2, p2, -0x5

    .line 41
    .line 42
    :cond_2
    invoke-static {p2, p3, v1}, Lu7/q;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p0, p2, v1, p3, p4}, Lu7/s;->c(IIII)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const-string p3, "headerBlock"

    .line 51
    .line 52
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p1, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v5, p1

    .line 58
    check-cast v5, Lu7/o;

    .line 59
    .line 60
    const-wide/16 v0, 0x0

    .line 61
    .line 62
    const/16 p1, 0x5b

    .line 63
    .line 64
    if-eqz p4, :cond_3

    .line 65
    .line 66
    and-int/lit8 p3, p4, 0x1

    .line 67
    .line 68
    if-nez p3, :cond_3

    .line 69
    .line 70
    iget-object p3, v5, Lu7/o;->i:Lr7/b;

    .line 71
    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-object v3, v5, Lu7/o;->c:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p1, "] onHeaders"

    .line 89
    .line 90
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    new-instance v3, Lu7/l;

    .line 98
    .line 99
    move v6, p4

    .line 100
    move v8, v7

    .line 101
    move-object v7, p2

    .line 102
    invoke-direct/range {v3 .. v8}, Lu7/l;-><init>(Ljava/lang/String;Lu7/o;ILjava/util/List;Z)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p3, v3, v0, v1}, Lr7/b;->b(Lr7/a;J)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    move v4, p4

    .line 110
    monitor-enter v5

    .line 111
    :try_start_0
    invoke-virtual {v5, v4}, Lu7/o;->c(I)Lu7/w;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    if-nez p3, :cond_7

    .line 116
    .line 117
    iget-boolean p3, v5, Lu7/o;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    if-eqz p3, :cond_4

    .line 120
    .line 121
    monitor-exit v5

    .line 122
    return-void

    .line 123
    :cond_4
    :try_start_1
    iget p3, v5, Lu7/o;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    if-gt v4, p3, :cond_5

    .line 126
    .line 127
    monitor-exit v5

    .line 128
    return-void

    .line 129
    :cond_5
    :try_start_2
    rem-int/lit8 p4, v4, 0x2

    .line 130
    .line 131
    iget p3, v5, Lu7/o;->e:I

    .line 132
    .line 133
    rem-int/lit8 p3, p3, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    .line 135
    if-ne p4, p3, :cond_6

    .line 136
    .line 137
    monitor-exit v5

    .line 138
    return-void

    .line 139
    :cond_6
    :try_start_3
    invoke-static {p2}, Lp7/c;->t(Ljava/util/List;)Lokhttp3/q;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    new-instance v3, Lu7/w;

    .line 144
    .line 145
    const/4 v6, 0x0

    .line 146
    invoke-direct/range {v3 .. v8}, Lu7/w;-><init>(ILu7/o;ZZLokhttp3/q;)V

    .line 147
    .line 148
    .line 149
    iput v4, v5, Lu7/o;->d:I

    .line 150
    .line 151
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    iget-object p3, v5, Lu7/o;->b:Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    invoke-interface {p3, p2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    iget-object p2, v5, Lu7/o;->g:Lr7/c;

    .line 161
    .line 162
    invoke-virtual {p2}, Lr7/c;->e()Lr7/b;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    new-instance p3, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    iget-object p4, v5, Lu7/o;->c:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p1, "] onStream"

    .line 183
    .line 184
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance p3, Lu7/i;

    .line 192
    .line 193
    invoke-direct {p3, v2, p1, v5, v3}, Lu7/i;-><init>(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2, p3, v0, v1}, Lr7/b;->b(Lr7/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 197
    .line 198
    .line 199
    monitor-exit v5

    .line 200
    return-void

    .line 201
    :catchall_0
    move-exception v0

    .line 202
    move-object p1, v0

    .line 203
    goto :goto_1

    .line 204
    :cond_7
    monitor-exit v5

    .line 205
    invoke-static {p2}, Lp7/c;->t(Ljava/util/List;)Lokhttp3/q;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    invoke-virtual {p3, p1, v7}, Lu7/w;->i(Lokhttp3/q;Z)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :goto_1
    monitor-exit v5

    .line 214
    throw p1

    .line 215
    :cond_8
    new-instance p1, Ljava/io/IOException;

    .line 216
    .line 217
    const-string p2, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 218
    .line 219
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw p1
.end method

.method public final e(Lcom/zykj/mistake/feature/collection/component/n;III)V
    .locals 9

    .line 1
    if-eqz p4, :cond_2

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x8

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lu7/s;->a:Lokio/BufferedSource;

    .line 8
    .line 9
    invoke-interface {v0}, Lokio/BufferedSource;->readByte()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Lp7/c;->a:[B

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-object v1, p0, Lu7/s;->a:Lokio/BufferedSource;

    .line 20
    .line 21
    invoke-interface {v1}, Lokio/BufferedSource;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const v2, 0x7fffffff

    .line 26
    .line 27
    .line 28
    and-int v6, v1, v2

    .line 29
    .line 30
    add-int/lit8 p2, p2, -0x4

    .line 31
    .line 32
    invoke-static {p2, p3, v0}, Lu7/q;->a(III)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-virtual {p0, p2, v0, p3, p4}, Lu7/s;->c(IIII)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const-string p2, "requestHeaders"

    .line 41
    .line 42
    invoke-static {v7, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, Lcom/zykj/mistake/feature/collection/component/n;->c:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v5, p1

    .line 48
    check-cast v5, Lu7/o;

    .line 49
    .line 50
    monitor-enter v5

    .line 51
    :try_start_0
    iget-object p1, v5, Lu7/o;->y:Ljava/util/LinkedHashSet;

    .line 52
    .line 53
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    sget-object p1, Lokhttp3/internal/http2/ErrorCode;->PROTOCOL_ERROR:Lokhttp3/internal/http2/ErrorCode;

    .line 64
    .line 65
    invoke-virtual {v5, v6, p1}, Lu7/o;->h(ILokhttp3/internal/http2/ErrorCode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit v5

    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    move-object p1, v0

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    :try_start_1
    iget-object p1, v5, Lu7/o;->y:Ljava/util/LinkedHashSet;

    .line 74
    .line 75
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    .line 82
    monitor-exit v5

    .line 83
    iget-object p1, v5, Lu7/o;->i:Lr7/b;

    .line 84
    .line 85
    new-instance p2, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    iget-object p3, v5, Lu7/o;->c:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const/16 p3, 0x5b

    .line 96
    .line 97
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p3, "] onRequest"

    .line 104
    .line 105
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    new-instance v3, Lu7/l;

    .line 113
    .line 114
    const/4 v8, 0x1

    .line 115
    invoke-direct/range {v3 .. v8}, Lu7/l;-><init>(Ljava/lang/String;Lu7/o;ILjava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    const-wide/16 p2, 0x0

    .line 119
    .line 120
    invoke-virtual {p1, v3, p2, p3}, Lr7/b;->b(Lr7/a;J)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :goto_1
    monitor-exit v5

    .line 125
    throw p1

    .line 126
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 127
    .line 128
    const-string p2, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 129
    .line 130
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p1
.end method

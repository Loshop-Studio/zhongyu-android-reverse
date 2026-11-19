.class public final Lq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit2/m;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcoil3/r;Lw1/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lq/d;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq/d;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lp7/b;)V
    .locals 8

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 6
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-wide/16 v3, 0x3c

    move-object v7, p1

    .line 8
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lq/d;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ls/f;Lq/a;Lt/f;Lcoil3/size/Scale;)Lq/b;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Ls/f;->i:Lcoil3/request/CachePolicy;

    .line 8
    .line 9
    iget-object v4, v0, Ls/f;->q:Lcoil3/size/Precision;

    .line 10
    .line 11
    invoke-virtual {v3}, Lcoil3/request/CachePolicy;->getReadEnabled()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    move-object/from16 v3, p0

    .line 18
    .line 19
    const/16 v16, 0x0

    .line 20
    .line 21
    goto/16 :goto_15

    .line 22
    .line 23
    :cond_0
    move-object/from16 v3, p0

    .line 24
    .line 25
    iget-object v6, v3, Lq/d;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v6, Lcoil3/r;

    .line 28
    .line 29
    invoke-virtual {v6}, Lcoil3/r;->d()Lq/e;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    if-eqz v6, :cond_8

    .line 34
    .line 35
    iget-object v7, v6, Lq/e;->c:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v7

    .line 38
    :try_start_0
    iget-object v8, v6, Lq/e;->a:Lq/i;

    .line 39
    .line 40
    invoke-interface {v8, v1}, Lq/i;->b(Lq/a;)Lq/b;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    const/4 v9, 0x0

    .line 45
    if-nez v8, :cond_5

    .line 46
    .line 47
    iget-object v8, v6, Lq/e;->b:Ld2/c;

    .line 48
    .line 49
    iget-object v10, v8, Ld2/c;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v10, Ljava/util/LinkedHashMap;

    .line 52
    .line 53
    invoke-virtual {v10, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    check-cast v10, Ljava/util/ArrayList;

    .line 58
    .line 59
    const/4 v11, 0x0

    .line 60
    if-nez v10, :cond_1

    .line 61
    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    :goto_0
    move-object v8, v11

    .line 65
    goto :goto_4

    .line 66
    :cond_1
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    move v13, v9

    .line 71
    :goto_1
    if-ge v13, v12, :cond_4

    .line 72
    .line 73
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v14

    .line 77
    check-cast v14, Lq/h;

    .line 78
    .line 79
    iget-object v15, v14, Lq/h;->a:Ljava/lang/ref/WeakReference;

    .line 80
    .line 81
    invoke-virtual {v15}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v15

    .line 85
    check-cast v15, Lcoil3/k;

    .line 86
    .line 87
    if-eqz v15, :cond_2

    .line 88
    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    new-instance v5, Lq/b;

    .line 92
    .line 93
    iget-object v14, v14, Lq/h;->b:Ljava/util/Map;

    .line 94
    .line 95
    invoke-direct {v5, v15, v14}, Lq/b;-><init>(Lcoil3/k;Ljava/util/Map;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    const/16 v16, 0x0

    .line 100
    .line 101
    move-object v5, v11

    .line 102
    :goto_2
    if-eqz v5, :cond_3

    .line 103
    .line 104
    move-object v11, v5

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    add-int/lit8 v13, v13, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    const/16 v16, 0x0

    .line 110
    .line 111
    :goto_3
    invoke-virtual {v8}, Ld2/c;->c()V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    goto :goto_6

    .line 117
    :cond_5
    const/16 v16, 0x0

    .line 118
    .line 119
    :goto_4
    if-eqz v8, :cond_7

    .line 120
    .line 121
    iget-object v5, v8, Lq/b;->a:Lcoil3/k;

    .line 122
    .line 123
    invoke-interface {v5}, Lcoil3/k;->a()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-nez v5, :cond_7

    .line 128
    .line 129
    iget-object v5, v6, Lq/e;->c:Ljava/lang/Object;

    .line 130
    .line 131
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    :try_start_1
    iget-object v10, v6, Lq/e;->a:Lq/i;

    .line 133
    .line 134
    invoke-interface {v10, v1}, Lq/i;->a(Lq/a;)Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    iget-object v6, v6, Lq/e;->b:Ld2/c;

    .line 139
    .line 140
    iget-object v6, v6, Ld2/c;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 143
    .line 144
    invoke-virtual {v6, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    if-eqz v6, :cond_6

    .line 149
    .line 150
    const/4 v9, 0x1

    .line 151
    :cond_6
    :try_start_2
    monitor-exit v5

    .line 152
    goto :goto_5

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    monitor-exit v5

    .line 155
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 156
    :cond_7
    :goto_5
    monitor-exit v7

    .line 157
    goto :goto_7

    .line 158
    :goto_6
    monitor-exit v7

    .line 159
    throw v0

    .line 160
    :cond_8
    const/16 v16, 0x0

    .line 161
    .line 162
    move-object/from16 v8, v16

    .line 163
    .line 164
    :goto_7
    if-eqz v8, :cond_20

    .line 165
    .line 166
    iget-object v5, v8, Lq/b;->a:Lcoil3/k;

    .line 167
    .line 168
    instance-of v6, v5, Lcoil3/a;

    .line 169
    .line 170
    if-eqz v6, :cond_9

    .line 171
    .line 172
    move-object v6, v5

    .line 173
    check-cast v6, Lcoil3/a;

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_9
    move-object/from16 v6, v16

    .line 177
    .line 178
    :goto_8
    const/4 v7, 0x1

    .line 179
    if-nez v6, :cond_a

    .line 180
    .line 181
    move v6, v7

    .line 182
    goto :goto_9

    .line 183
    :cond_a
    iget-object v6, v6, Lcoil3/a;->a:Landroid/graphics/Bitmap;

    .line 184
    .line 185
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    if-nez v6, :cond_b

    .line 190
    .line 191
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 192
    .line 193
    :cond_b
    invoke-static {v0, v6}, Lw1/a;->b(Ls/f;Landroid/graphics/Bitmap$Config;)Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    :goto_9
    if-nez v6, :cond_d

    .line 198
    .line 199
    :cond_c
    const/4 v7, 0x0

    .line 200
    goto/16 :goto_14

    .line 201
    .line 202
    :cond_d
    iget-object v1, v1, Lq/a;->b:Ljava/util/Map;

    .line 203
    .line 204
    const-string v6, "coil#size"

    .line 205
    .line 206
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Ljava/lang/String;

    .line 211
    .line 212
    if-eqz v1, :cond_e

    .line 213
    .line 214
    invoke-virtual {v2}, Lt/f;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_c

    .line 223
    .line 224
    goto/16 :goto_14

    .line 225
    .line 226
    :cond_e
    iget-object v1, v8, Lq/b;->b:Ljava/util/Map;

    .line 227
    .line 228
    const-string v6, "coil#is_sampled"

    .line 229
    .line 230
    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    instance-of v6, v1, Ljava/lang/Boolean;

    .line 235
    .line 236
    if-eqz v6, :cond_f

    .line 237
    .line 238
    check-cast v1, Ljava/lang/Boolean;

    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_f
    move-object/from16 v1, v16

    .line 242
    .line 243
    :goto_a
    if-eqz v1, :cond_10

    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    goto :goto_b

    .line 250
    :cond_10
    const/4 v1, 0x0

    .line 251
    :goto_b
    if-nez v1, :cond_11

    .line 252
    .line 253
    sget-object v1, Lt/f;->c:Lt/f;

    .line 254
    .line 255
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_1f

    .line 260
    .line 261
    sget-object v1, Lcoil3/size/Precision;->INEXACT:Lcoil3/size/Precision;

    .line 262
    .line 263
    if-ne v4, v1, :cond_11

    .line 264
    .line 265
    goto/16 :goto_14

    .line 266
    .line 267
    :cond_11
    invoke-interface {v5}, Lcoil3/k;->getWidth()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-interface {v5}, Lcoil3/k;->getHeight()I

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    instance-of v5, v5, Lcoil3/a;

    .line 276
    .line 277
    if-eqz v5, :cond_12

    .line 278
    .line 279
    sget-object v5, Ls/g;->b:Lo2/a;

    .line 280
    .line 281
    invoke-static {v0, v5}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    check-cast v0, Lt/f;

    .line 286
    .line 287
    goto :goto_c

    .line 288
    :cond_12
    sget-object v0, Lt/f;->c:Lt/f;

    .line 289
    .line 290
    :goto_c
    iget-object v5, v2, Lt/f;->a:Lt/c;

    .line 291
    .line 292
    instance-of v10, v5, Lt/a;

    .line 293
    .line 294
    const v11, 0x7fffffff

    .line 295
    .line 296
    .line 297
    if-eqz v10, :cond_13

    .line 298
    .line 299
    check-cast v5, Lt/a;

    .line 300
    .line 301
    iget v5, v5, Lt/a;->a:I

    .line 302
    .line 303
    goto :goto_d

    .line 304
    :cond_13
    move v5, v11

    .line 305
    :goto_d
    iget-object v10, v0, Lt/f;->a:Lt/c;

    .line 306
    .line 307
    instance-of v12, v10, Lt/a;

    .line 308
    .line 309
    if-eqz v12, :cond_14

    .line 310
    .line 311
    check-cast v10, Lt/a;

    .line 312
    .line 313
    iget v10, v10, Lt/a;->a:I

    .line 314
    .line 315
    goto :goto_e

    .line 316
    :cond_14
    move v10, v11

    .line 317
    :goto_e
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    iget-object v2, v2, Lt/f;->b:Lt/c;

    .line 322
    .line 323
    instance-of v10, v2, Lt/a;

    .line 324
    .line 325
    if-eqz v10, :cond_15

    .line 326
    .line 327
    check-cast v2, Lt/a;

    .line 328
    .line 329
    iget v2, v2, Lt/a;->a:I

    .line 330
    .line 331
    goto :goto_f

    .line 332
    :cond_15
    move v2, v11

    .line 333
    :goto_f
    iget-object v0, v0, Lt/f;->b:Lt/c;

    .line 334
    .line 335
    instance-of v10, v0, Lt/a;

    .line 336
    .line 337
    if-eqz v10, :cond_16

    .line 338
    .line 339
    check-cast v0, Lt/a;

    .line 340
    .line 341
    iget v0, v0, Lt/a;->a:I

    .line 342
    .line 343
    goto :goto_10

    .line 344
    :cond_16
    move v0, v11

    .line 345
    :goto_10
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 346
    .line 347
    .line 348
    move-result v0

    .line 349
    int-to-double v12, v5

    .line 350
    int-to-double v14, v1

    .line 351
    div-double/2addr v12, v14

    .line 352
    int-to-double v14, v0

    .line 353
    int-to-double v9, v6

    .line 354
    div-double/2addr v14, v9

    .line 355
    if-eq v5, v11, :cond_17

    .line 356
    .line 357
    if-eq v0, v11, :cond_17

    .line 358
    .line 359
    move-object/from16 v9, p4

    .line 360
    .line 361
    goto :goto_11

    .line 362
    :cond_17
    sget-object v9, Lcoil3/size/Scale;->FIT:Lcoil3/size/Scale;

    .line 363
    .line 364
    :goto_11
    sget-object v10, Lq/c;->a:[I

    .line 365
    .line 366
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 367
    .line 368
    .line 369
    move-result v9

    .line 370
    aget v9, v10, v9

    .line 371
    .line 372
    const/4 v10, 0x2

    .line 373
    if-eq v9, v7, :cond_1a

    .line 374
    .line 375
    if-ne v9, v10, :cond_19

    .line 376
    .line 377
    cmpg-double v9, v12, v14

    .line 378
    .line 379
    if-gez v9, :cond_18

    .line 380
    .line 381
    sub-int/2addr v5, v1

    .line 382
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    goto :goto_13

    .line 387
    :cond_18
    sub-int/2addr v0, v6

    .line 388
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    :goto_12
    move-wide v12, v14

    .line 393
    goto :goto_13

    .line 394
    :cond_19
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 395
    .line 396
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 397
    .line 398
    .line 399
    throw v0

    .line 400
    :cond_1a
    cmpl-double v9, v12, v14

    .line 401
    .line 402
    if-lez v9, :cond_1b

    .line 403
    .line 404
    sub-int/2addr v5, v1

    .line 405
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    goto :goto_13

    .line 410
    :cond_1b
    sub-int/2addr v0, v6

    .line 411
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    goto :goto_12

    .line 416
    :goto_13
    if-gt v0, v7, :cond_1c

    .line 417
    .line 418
    goto :goto_14

    .line 419
    :cond_1c
    sget-object v0, Lq/c;->b:[I

    .line 420
    .line 421
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    aget v0, v0, v1

    .line 426
    .line 427
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 428
    .line 429
    if-eq v0, v7, :cond_1e

    .line 430
    .line 431
    if-ne v0, v10, :cond_1d

    .line 432
    .line 433
    cmpg-double v0, v12, v4

    .line 434
    .line 435
    if-gtz v0, :cond_c

    .line 436
    .line 437
    goto :goto_14

    .line 438
    :cond_1d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 439
    .line 440
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 441
    .line 442
    .line 443
    throw v0

    .line 444
    :cond_1e
    cmpg-double v0, v12, v4

    .line 445
    .line 446
    if-nez v0, :cond_c

    .line 447
    .line 448
    :cond_1f
    :goto_14
    if-eqz v7, :cond_20

    .line 449
    .line 450
    return-object v8

    .line 451
    :cond_20
    :goto_15
    return-object v16
.end method

.method public b(Ls/f;Ljava/lang/Object;Ls/l;Lcoil3/h;)Lq/a;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p4, p1, Ls/f;->d:Ljava/util/Map;

    .line 5
    .line 6
    iget-object v0, p0, Lq/d;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcoil3/r;

    .line 9
    .line 10
    iget-object v0, v0, Lcoil3/r;->d:Lcoil3/d;

    .line 11
    .line 12
    iget-object v0, v0, Lcoil3/d;->c:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    const/4 v3, 0x0

    .line 20
    if-ge v2, v1, :cond_1

    .line 21
    .line 22
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lkotlin/Pair;

    .line 27
    .line 28
    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Lo/c;

    .line 33
    .line 34
    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ly6/c;

    .line 39
    .line 40
    check-cast v4, Lkotlin/jvm/internal/d;

    .line 41
    .line 42
    invoke-virtual {v4, p2}, Lkotlin/jvm/internal/d;->f(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    const-string v4, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>"

    .line 49
    .line 50
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v5, p2, p3}, Lo/c;->a(Ljava/lang/Object;Ls/l;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move-object v4, v3

    .line 64
    :goto_1
    if-nez v4, :cond_2

    .line 65
    .line 66
    return-object v3

    .line 67
    :cond_2
    sget-object p2, Ls/g;->a:Lo2/a;

    .line 68
    .line 69
    invoke-static {p1, p2}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_3

    .line 80
    .line 81
    invoke-static {p4}, Lkotlin/collections/e0;->L(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p2, p3, Ls/l;->b:Lt/f;

    .line 86
    .line 87
    invoke-virtual {p2}, Lt/f;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    const-string p3, "coil#size"

    .line 92
    .line 93
    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    new-instance p2, Lq/a;

    .line 97
    .line 98
    invoke-direct {p2, v4, p1}, Lq/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 99
    .line 100
    .line 101
    return-object p2

    .line 102
    :cond_3
    new-instance p1, Lq/a;

    .line 103
    .line 104
    invoke-direct {p1, v4, p4}, Lq/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    return-object p1
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lokhttp3/m0;

    .line 2
    .line 3
    iget-object v0, p0, Lq/d;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lretrofit2/m;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lretrofit2/m;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

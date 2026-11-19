.class public final Lcom/tencent/bugly/proguard/z0;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le0/a;Ljava/lang/Runnable;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/bugly/proguard/z0;->a:I

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    invoke-direct {p0, p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/tencent/bugly/proguard/z0;->a:I

    iput-object p1, p0, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lcom/tencent/bugly/proguard/z0;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ln1/a;

    .line 12
    .line 13
    iget-object v3, v0, Ln1/a;->g:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v3

    .line 16
    :try_start_0
    iget-object v0, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ln1/a;

    .line 19
    .line 20
    iget v0, v0, Ln1/a;->e:I

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    new-instance v4, Lb0/a;

    .line 34
    .line 35
    const/16 v5, 0xf

    .line 36
    .line 37
    invoke-direct {v4, v1, v5}, Lb0/a;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    iget-object v5, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, Ln1/a;

    .line 43
    .line 44
    iget v5, v5, Ln1/a;->e:I

    .line 45
    .line 46
    mul-int/lit16 v5, v5, 0x3e8

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x64

    .line 49
    .line 50
    int-to-long v5, v5

    .line 51
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_0
    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    const/16 v0, -0x13

    .line 60
    .line 61
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_1
    iget-object v0, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ln1/a;

    .line 67
    .line 68
    invoke-virtual {v0}, Ln1/a;->c()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    iget-object v0, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ln1/a;

    .line 77
    .line 78
    iget-object v3, v0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 79
    .line 80
    if-eqz v3, :cond_1

    .line 81
    .line 82
    invoke-virtual {v0}, Ln1/a;->c()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    iget-object v0, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Ln1/a;

    .line 91
    .line 92
    iget-object v3, v0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 93
    .line 94
    iget-object v4, v0, Ln1/a;->c:[S

    .line 95
    .line 96
    iget v0, v0, Ln1/a;->b:I

    .line 97
    .line 98
    invoke-virtual {v3, v4, v2, v0}, Landroid/media/AudioRecord;->read([SII)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-lez v0, :cond_1

    .line 103
    .line 104
    iget-object v3, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, Ln1/a;

    .line 107
    .line 108
    iget-object v4, v3, Ln1/a;->d:Ln1/c;

    .line 109
    .line 110
    iget-object v3, v3, Ln1/a;->c:[S

    .line 111
    .line 112
    iget-object v4, v4, Ln1/c;->d:Ljava/util/List;

    .line 113
    .line 114
    new-instance v5, Ln1/b;

    .line 115
    .line 116
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3}, [S->clone()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, [S

    .line 124
    .line 125
    iput-object v3, v5, Ln1/b;->a:[S

    .line 126
    .line 127
    iput v0, v5, Ln1/b;->b:I

    .line 128
    .line 129
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    iget-object v3, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v3, Ln1/a;

    .line 135
    .line 136
    iget-object v3, v3, Ln1/a;->c:[S

    .line 137
    .line 138
    if-nez v3, :cond_2

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_2
    move v4, v2

    .line 142
    move v5, v4

    .line 143
    :goto_2
    if-ge v4, v0, :cond_3

    .line 144
    .line 145
    aget-short v6, v3, v4

    .line 146
    .line 147
    mul-int/2addr v6, v6

    .line 148
    add-int/2addr v5, v6

    .line 149
    add-int/lit8 v4, v4, 0x1

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_3
    if-lez v0, :cond_4

    .line 153
    .line 154
    div-int/2addr v5, v0

    .line 155
    int-to-double v3, v5

    .line 156
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 157
    .line 158
    .line 159
    :cond_4
    :goto_3
    sget-object v0, Ln1/a;->h:Lcom/stormdzh/lame4android/PCMFormat;

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    iget-object v0, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Ln1/a;

    .line 165
    .line 166
    invoke-virtual {v0}, Ln1/a;->a()V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :goto_4
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    throw v0

    .line 172
    :pswitch_0
    iget-object v0, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Lr6/a;

    .line 175
    .line 176
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :pswitch_1
    const/16 v0, 0x9

    .line 181
    .line 182
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 183
    .line 184
    .line 185
    iget-object v0, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Le0/a;

    .line 188
    .line 189
    iget-boolean v0, v0, Le0/a;->b:Z

    .line 190
    .line 191
    if-eqz v0, :cond_6

    .line 192
    .line 193
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 194
    .line 195
    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 211
    .line 212
    .line 213
    :cond_6
    :try_start_2
    invoke-super {v1}, Ljava/lang/Thread;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 214
    .line 215
    .line 216
    goto :goto_5

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    const-string v2, "GlideExecutor"

    .line 219
    .line 220
    const/4 v3, 0x6

    .line 221
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_7

    .line 226
    .line 227
    const-string v3, "Request threw uncaught throwable"

    .line 228
    .line 229
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 230
    .line 231
    .line 232
    :cond_7
    :goto_5
    return-void

    .line 233
    :pswitch_2
    iget-object v0, v1, Lcom/tencent/bugly/proguard/z0;->b:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lcom/tencent/bugly/proguard/at;

    .line 236
    .line 237
    invoke-static {v0}, Lcom/tencent/bugly/proguard/at;->b(Lcom/tencent/bugly/proguard/at;)Landroid/content/Context;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    const-string v4, "local_crash_lock"

    .line 242
    .line 243
    invoke-static {v3, v4}, Lcom/tencent/bugly/proguard/ap;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-nez v3, :cond_8

    .line 248
    .line 249
    const-string v0, "Failed to lock file for uploading local crash."

    .line 250
    .line 251
    new-array v2, v2, [Ljava/lang/Object;

    .line 252
    .line 253
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto/16 :goto_c

    .line 257
    .line 258
    :cond_8
    invoke-static {}, Lcom/tencent/bugly/proguard/ag$a;->a()Lcom/tencent/bugly/proguard/ag;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-static {}, Lcom/tencent/bugly/proguard/ag;->a()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    if-eqz v5, :cond_c

    .line 267
    .line 268
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 269
    .line 270
    .line 271
    move-result v6

    .line 272
    if-eqz v6, :cond_9

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_9
    const-string v6, "sla load local data list size:%s"

    .line 276
    .line 277
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    invoke-static {v6, v7}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    new-instance v7, Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 299
    .line 300
    .line 301
    :cond_a
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    if-eqz v8, :cond_b

    .line 306
    .line 307
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    check-cast v8, Lcom/tencent/bugly/proguard/ag$b;

    .line 312
    .line 313
    iget-wide v9, v8, Lcom/tencent/bugly/proguard/ag$b;->b:J

    .line 314
    .line 315
    invoke-static {}, Lcom/tencent/bugly/proguard/ap;->b()J

    .line 316
    .line 317
    .line 318
    move-result-wide v11

    .line 319
    const-wide/32 v13, 0x240c8400

    .line 320
    .line 321
    .line 322
    sub-long/2addr v11, v13

    .line 323
    cmp-long v9, v9, v11

    .line 324
    .line 325
    if-gez v9, :cond_a

    .line 326
    .line 327
    const-string v9, "sla local data is expired:%s"

    .line 328
    .line 329
    iget-object v10, v8, Lcom/tencent/bugly/proguard/ag$b;->c:Ljava/lang/String;

    .line 330
    .line 331
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    invoke-static {v9, v10}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    .line 342
    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_b
    invoke-static {v7}, Lcom/tencent/bugly/proguard/ag;->d(Ljava/util/List;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v3, v5}, Lcom/tencent/bugly/proguard/ag;->b(Ljava/util/List;)V

    .line 349
    .line 350
    .line 351
    goto :goto_8

    .line 352
    :cond_c
    :goto_7
    const-string v3, "sla local data is null"

    .line 353
    .line 354
    new-array v5, v2, [Ljava/lang/Object;

    .line 355
    .line 356
    invoke-static {v3, v5}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    :goto_8
    invoke-static {}, Lcom/tencent/bugly/proguard/as;->a()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    if-eqz v3, :cond_f

    .line 364
    .line 365
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    if-lez v5, :cond_f

    .line 370
    .line 371
    const-string v5, "Size of crash list: %s"

    .line 372
    .line 373
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 374
    .line 375
    .line 376
    move-result v6

    .line 377
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v6

    .line 385
    invoke-static {v5, v6}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    int-to-long v6, v5

    .line 393
    const-wide/16 v8, 0x14

    .line 394
    .line 395
    cmp-long v6, v6, v8

    .line 396
    .line 397
    if-lez v6, :cond_e

    .line 398
    .line 399
    new-instance v6, Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 402
    .line 403
    .line 404
    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 405
    .line 406
    .line 407
    :goto_9
    int-to-long v10, v2

    .line 408
    cmp-long v7, v10, v8

    .line 409
    .line 410
    if-gez v7, :cond_d

    .line 411
    .line 412
    add-int/lit8 v7, v5, -0x1

    .line 413
    .line 414
    sub-int/2addr v7, v2

    .line 415
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    add-int/lit8 v2, v2, 0x1

    .line 423
    .line 424
    goto :goto_9

    .line 425
    :cond_d
    move-object v11, v6

    .line 426
    goto :goto_a

    .line 427
    :cond_e
    move-object v11, v3

    .line 428
    :goto_a
    iget-object v10, v0, Lcom/tencent/bugly/proguard/at;->s:Lcom/tencent/bugly/proguard/as;

    .line 429
    .line 430
    const/4 v15, 0x0

    .line 431
    const/16 v16, 0x0

    .line 432
    .line 433
    const-wide/16 v12, 0x0

    .line 434
    .line 435
    const/4 v14, 0x0

    .line 436
    invoke-virtual/range {v10 .. v16}, Lcom/tencent/bugly/proguard/as;->a(Ljava/util/List;JZZZ)V

    .line 437
    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_f
    const-string v3, "no crash need to be uploaded at this start"

    .line 441
    .line 442
    new-array v2, v2, [Ljava/lang/Object;

    .line 443
    .line 444
    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    :goto_b
    invoke-static {v0}, Lcom/tencent/bugly/proguard/at;->b(Lcom/tencent/bugly/proguard/at;)Landroid/content/Context;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-static {v0, v4}, Lcom/tencent/bugly/proguard/ap;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 452
    .line 453
    .line 454
    :goto_c
    return-void

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

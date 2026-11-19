.class public final Lq7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/s;)Lokhttp3/i0;
    .locals 30

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ls7/e;

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Ls7/e;->e:Lokhttp3/c0;

    .line 9
    .line 10
    const-string v1, "request"

    .line 11
    .line 12
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroid/support/v4/media/h;

    .line 16
    .line 17
    const/16 v3, 0x19

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-direct {v1, v3, v2, v4, v5}, Landroid/support/v4/media/h;-><init>(ILjava/lang/Object;ZLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v6, v2, Lokhttp3/c0;->f:Lokhttp3/c;

    .line 25
    .line 26
    if-nez v6, :cond_1a

    .line 27
    .line 28
    sget v6, Lokhttp3/c;->n:I

    .line 29
    .line 30
    iget-object v6, v2, Lokhttp3/c0;->c:Lokhttp3/q;

    .line 31
    .line 32
    invoke-virtual {v6}, Lokhttp3/q;->size()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const/4 v8, 0x1

    .line 37
    move v10, v4

    .line 38
    move v13, v10

    .line 39
    move v14, v13

    .line 40
    move/from16 v17, v14

    .line 41
    .line 42
    move/from16 v18, v17

    .line 43
    .line 44
    move/from16 v19, v18

    .line 45
    .line 46
    move/from16 v22, v19

    .line 47
    .line 48
    move/from16 v23, v22

    .line 49
    .line 50
    move/from16 v24, v23

    .line 51
    .line 52
    move-object v12, v5

    .line 53
    move v11, v8

    .line 54
    const/4 v15, -0x1

    .line 55
    const/16 v16, -0x1

    .line 56
    .line 57
    const/16 v20, -0x1

    .line 58
    .line 59
    const/16 v21, -0x1

    .line 60
    .line 61
    :goto_0
    if-ge v10, v7, :cond_18

    .line 62
    .line 63
    invoke-virtual {v6, v10}, Lokhttp3/q;->b(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v6, v10}, Lokhttp3/q;->e(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    const-string v5, "Cache-Control"

    .line 72
    .line 73
    invoke-static {v3, v5, v8}, Lkotlin/text/w;->v(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_1

    .line 78
    .line 79
    if-eqz v12, :cond_0

    .line 80
    .line 81
    :goto_1
    const/4 v11, 0x0

    .line 82
    goto :goto_2

    .line 83
    :cond_0
    move-object v12, v4

    .line 84
    goto :goto_2

    .line 85
    :cond_1
    const-string v5, "Pragma"

    .line 86
    .line 87
    invoke-static {v3, v5, v8}, Lkotlin/text/w;->v(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_17

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :goto_2
    const/4 v3, 0x0

    .line 95
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-ge v3, v5, :cond_17

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    move/from16 v25, v8

    .line 106
    .line 107
    move v8, v3

    .line 108
    :goto_4
    if-ge v8, v5, :cond_3

    .line 109
    .line 110
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    move-object/from16 v27, v1

    .line 115
    .line 116
    const-string v1, "=,;"

    .line 117
    .line 118
    invoke-static {v1, v9}, Lkotlin/text/p;->G(Ljava/lang/CharSequence;C)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_2

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 126
    .line 127
    move-object/from16 v1, v27

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_3
    move-object/from16 v27, v1

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    :goto_5
    invoke-virtual {v4, v3, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const-string v3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 141
    .line 142
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eq v8, v5, :cond_4

    .line 158
    .line 159
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    const/16 v9, 0x2c

    .line 164
    .line 165
    if-eq v5, v9, :cond_4

    .line 166
    .line 167
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    const/16 v9, 0x3b

    .line 172
    .line 173
    if-ne v5, v9, :cond_5

    .line 174
    .line 175
    :cond_4
    move-object/from16 v29, v6

    .line 176
    .line 177
    goto/16 :goto_a

    .line 178
    .line 179
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 180
    .line 181
    sget-object v5, Lp7/c;->a:[B

    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    :goto_6
    if-ge v8, v5, :cond_7

    .line 188
    .line 189
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    move/from16 v28, v5

    .line 194
    .line 195
    const/16 v5, 0x20

    .line 196
    .line 197
    if-eq v9, v5, :cond_6

    .line 198
    .line 199
    const/16 v5, 0x9

    .line 200
    .line 201
    if-eq v9, v5, :cond_6

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 205
    .line 206
    move/from16 v5, v28

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    :goto_7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    if-ge v8, v5, :cond_8

    .line 218
    .line 219
    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    const/16 v9, 0x22

    .line 224
    .line 225
    if-ne v5, v9, :cond_8

    .line 226
    .line 227
    add-int/lit8 v8, v8, 0x1

    .line 228
    .line 229
    const/4 v5, 0x4

    .line 230
    invoke-static {v4, v9, v8, v5}, Lkotlin/text/p;->M(Ljava/lang/CharSequence;CII)I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    invoke-virtual {v4, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    add-int/lit8 v5, v5, 0x1

    .line 242
    .line 243
    move v3, v5

    .line 244
    move-object/from16 v29, v6

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_8
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    move v9, v8

    .line 252
    :goto_8
    if-ge v9, v5, :cond_a

    .line 253
    .line 254
    move/from16 v28, v5

    .line 255
    .line 256
    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    move-object/from16 v29, v6

    .line 261
    .line 262
    const-string v6, ",;"

    .line 263
    .line 264
    invoke-static {v6, v5}, Lkotlin/text/p;->G(Ljava/lang/CharSequence;C)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_9

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_9
    add-int/lit8 v9, v9, 0x1

    .line 272
    .line 273
    move/from16 v5, v28

    .line 274
    .line 275
    move-object/from16 v6, v29

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_a
    move-object/from16 v29, v6

    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    :goto_9
    invoke-virtual {v4, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v5}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v3

    .line 299
    move-object v8, v3

    .line 300
    move v3, v9

    .line 301
    goto :goto_b

    .line 302
    :goto_a
    add-int/lit8 v8, v8, 0x1

    .line 303
    .line 304
    move v3, v8

    .line 305
    const/4 v8, 0x0

    .line 306
    :goto_b
    const-string v5, "no-cache"

    .line 307
    .line 308
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-eqz v5, :cond_c

    .line 313
    .line 314
    move/from16 v8, v25

    .line 315
    .line 316
    move v13, v8

    .line 317
    :cond_b
    :goto_c
    move-object/from16 v1, v27

    .line 318
    .line 319
    move-object/from16 v6, v29

    .line 320
    .line 321
    goto/16 :goto_3

    .line 322
    .line 323
    :cond_c
    const-string v5, "no-store"

    .line 324
    .line 325
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    if-eqz v5, :cond_d

    .line 330
    .line 331
    move/from16 v8, v25

    .line 332
    .line 333
    move v14, v8

    .line 334
    goto :goto_c

    .line 335
    :cond_d
    const-string v5, "max-age"

    .line 336
    .line 337
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    if-eqz v5, :cond_e

    .line 342
    .line 343
    const/4 v5, -0x1

    .line 344
    invoke-static {v5, v8}, Lp7/c;->w(ILjava/lang/String;)I

    .line 345
    .line 346
    .line 347
    move-result v15

    .line 348
    :goto_d
    move/from16 v8, v25

    .line 349
    .line 350
    goto :goto_c

    .line 351
    :cond_e
    const/4 v5, -0x1

    .line 352
    const-string v6, "s-maxage"

    .line 353
    .line 354
    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    if-eqz v6, :cond_f

    .line 359
    .line 360
    invoke-static {v5, v8}, Lp7/c;->w(ILjava/lang/String;)I

    .line 361
    .line 362
    .line 363
    move-result v16

    .line 364
    goto :goto_d

    .line 365
    :cond_f
    const-string v5, "private"

    .line 366
    .line 367
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    if-eqz v5, :cond_10

    .line 372
    .line 373
    move/from16 v8, v25

    .line 374
    .line 375
    move/from16 v17, v8

    .line 376
    .line 377
    goto :goto_c

    .line 378
    :cond_10
    const-string v5, "public"

    .line 379
    .line 380
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-eqz v5, :cond_11

    .line 385
    .line 386
    move/from16 v8, v25

    .line 387
    .line 388
    move/from16 v18, v8

    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_11
    const-string v5, "must-revalidate"

    .line 392
    .line 393
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    if-eqz v5, :cond_12

    .line 398
    .line 399
    move/from16 v8, v25

    .line 400
    .line 401
    move/from16 v19, v8

    .line 402
    .line 403
    goto :goto_c

    .line 404
    :cond_12
    const-string v5, "max-stale"

    .line 405
    .line 406
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    if-eqz v5, :cond_13

    .line 411
    .line 412
    const v1, 0x7fffffff

    .line 413
    .line 414
    .line 415
    invoke-static {v1, v8}, Lp7/c;->w(ILjava/lang/String;)I

    .line 416
    .line 417
    .line 418
    move-result v20

    .line 419
    goto :goto_d

    .line 420
    :cond_13
    const-string v5, "min-fresh"

    .line 421
    .line 422
    invoke-virtual {v5, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    if-eqz v5, :cond_14

    .line 427
    .line 428
    const/4 v5, -0x1

    .line 429
    invoke-static {v5, v8}, Lp7/c;->w(ILjava/lang/String;)I

    .line 430
    .line 431
    .line 432
    move-result v21

    .line 433
    goto :goto_d

    .line 434
    :cond_14
    const/4 v5, -0x1

    .line 435
    const-string v6, "only-if-cached"

    .line 436
    .line 437
    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    if-eqz v6, :cond_15

    .line 442
    .line 443
    move/from16 v8, v25

    .line 444
    .line 445
    move/from16 v22, v8

    .line 446
    .line 447
    goto/16 :goto_c

    .line 448
    .line 449
    :cond_15
    const-string v6, "no-transform"

    .line 450
    .line 451
    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 452
    .line 453
    .line 454
    move-result v6

    .line 455
    if-eqz v6, :cond_16

    .line 456
    .line 457
    move/from16 v8, v25

    .line 458
    .line 459
    move/from16 v23, v8

    .line 460
    .line 461
    goto/16 :goto_c

    .line 462
    .line 463
    :cond_16
    const-string v6, "immutable"

    .line 464
    .line 465
    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    move/from16 v8, v25

    .line 470
    .line 471
    if-eqz v1, :cond_b

    .line 472
    .line 473
    move/from16 v24, v8

    .line 474
    .line 475
    goto/16 :goto_c

    .line 476
    .line 477
    :cond_17
    move-object/from16 v27, v1

    .line 478
    .line 479
    move-object/from16 v29, v6

    .line 480
    .line 481
    move/from16 v25, v8

    .line 482
    .line 483
    const/4 v5, -0x1

    .line 484
    add-int/lit8 v10, v10, 0x1

    .line 485
    .line 486
    move/from16 v8, v25

    .line 487
    .line 488
    move-object/from16 v1, v27

    .line 489
    .line 490
    move-object/from16 v6, v29

    .line 491
    .line 492
    const/16 v3, 0x19

    .line 493
    .line 494
    const/4 v4, 0x0

    .line 495
    const/4 v5, 0x0

    .line 496
    goto/16 :goto_0

    .line 497
    .line 498
    :cond_18
    move-object/from16 v27, v1

    .line 499
    .line 500
    if-nez v11, :cond_19

    .line 501
    .line 502
    const/16 v25, 0x0

    .line 503
    .line 504
    goto :goto_e

    .line 505
    :cond_19
    move-object/from16 v25, v12

    .line 506
    .line 507
    :goto_e
    new-instance v12, Lokhttp3/c;

    .line 508
    .line 509
    invoke-direct/range {v12 .. v25}, Lokhttp3/c;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 510
    .line 511
    .line 512
    iput-object v12, v2, Lokhttp3/c0;->f:Lokhttp3/c;

    .line 513
    .line 514
    move-object v6, v12

    .line 515
    goto :goto_f

    .line 516
    :cond_1a
    move-object/from16 v27, v1

    .line 517
    .line 518
    :goto_f
    iget-boolean v1, v6, Lokhttp3/c;->j:Z

    .line 519
    .line 520
    if-eqz v1, :cond_1b

    .line 521
    .line 522
    new-instance v1, Landroid/support/v4/media/h;

    .line 523
    .line 524
    const/4 v3, 0x0

    .line 525
    const/4 v4, 0x0

    .line 526
    const/16 v5, 0x19

    .line 527
    .line 528
    invoke-direct {v1, v5, v4, v3, v4}, Landroid/support/v4/media/h;-><init>(ILjava/lang/Object;ZLjava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    goto :goto_10

    .line 532
    :cond_1b
    const/4 v3, 0x0

    .line 533
    move-object/from16 v1, v27

    .line 534
    .line 535
    :goto_10
    iget-object v4, v1, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v4, Lokhttp3/c0;

    .line 538
    .line 539
    iget-object v1, v1, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v1, Lokhttp3/i0;

    .line 542
    .line 543
    if-nez v4, :cond_1c

    .line 544
    .line 545
    if-nez v1, :cond_1c

    .line 546
    .line 547
    new-instance v0, Lkotlin/jvm/internal/o;

    .line 548
    .line 549
    const/4 v1, 0x2

    .line 550
    invoke-direct {v0, v1, v3}, Lkotlin/jvm/internal/o;-><init>(IZ)V

    .line 551
    .line 552
    .line 553
    sget-object v3, Lokhttp3/Protocol;->HTTP_1_1:Lokhttp3/Protocol;

    .line 554
    .line 555
    const-string v1, "protocol"

    .line 556
    .line 557
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    sget-object v8, Lp7/c;->c:Lokhttp3/k0;

    .line 561
    .line 562
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 563
    .line 564
    .line 565
    move-result-wide v14

    .line 566
    invoke-virtual {v0}, Lkotlin/jvm/internal/o;->f()Lokhttp3/q;

    .line 567
    .line 568
    .line 569
    move-result-object v7

    .line 570
    new-instance v1, Lokhttp3/i0;

    .line 571
    .line 572
    const-string v4, "Unsatisfiable Request (only-if-cached)"

    .line 573
    .line 574
    const/16 v5, 0x1f8

    .line 575
    .line 576
    const/4 v6, 0x0

    .line 577
    const/4 v9, 0x0

    .line 578
    const/4 v10, 0x0

    .line 579
    const/4 v11, 0x0

    .line 580
    const-wide/16 v12, -0x1

    .line 581
    .line 582
    const/16 v16, 0x0

    .line 583
    .line 584
    invoke-direct/range {v1 .. v16}, Lokhttp3/i0;-><init>(Lokhttp3/c0;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/p;Lokhttp3/q;Lokhttp3/m0;Lokhttp3/i0;Lokhttp3/i0;Lokhttp3/i0;JJLokhttp3/internal/connection/d;)V

    .line 585
    .line 586
    .line 587
    return-object v1

    .line 588
    :cond_1c
    const-string v2, "cacheResponse"

    .line 589
    .line 590
    if-nez v4, :cond_1d

    .line 591
    .line 592
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-static {v1}, Lq7/a;->a(Lokhttp3/i0;)Lokhttp3/i0;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    invoke-static {v2, v1}, Lokhttp3/h0;->b(Ljava/lang/String;Lokhttp3/i0;)V

    .line 604
    .line 605
    .line 606
    iput-object v1, v0, Lokhttp3/h0;->i:Lokhttp3/i0;

    .line 607
    .line 608
    invoke-virtual {v0}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    return-object v0

    .line 613
    :cond_1d
    invoke-virtual {v0, v4}, Ls7/e;->b(Lokhttp3/c0;)Lokhttp3/i0;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    const-string v3, "networkResponse"

    .line 618
    .line 619
    if-eqz v1, :cond_28

    .line 620
    .line 621
    iget v4, v0, Lokhttp3/i0;->d:I

    .line 622
    .line 623
    const/16 v5, 0x130

    .line 624
    .line 625
    if-ne v4, v5, :cond_27

    .line 626
    .line 627
    invoke-virtual {v1}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 628
    .line 629
    .line 630
    move-result-object v4

    .line 631
    iget-object v5, v1, Lokhttp3/i0;->f:Lokhttp3/q;

    .line 632
    .line 633
    iget-object v6, v0, Lokhttp3/i0;->f:Lokhttp3/q;

    .line 634
    .line 635
    new-instance v7, Ljava/util/ArrayList;

    .line 636
    .line 637
    const/16 v8, 0x14

    .line 638
    .line 639
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v5}, Lokhttp3/q;->size()I

    .line 643
    .line 644
    .line 645
    move-result v8

    .line 646
    const/4 v9, 0x0

    .line 647
    :goto_11
    const-string v10, "value"

    .line 648
    .line 649
    const-string v11, "name"

    .line 650
    .line 651
    const-string v12, "Content-Type"

    .line 652
    .line 653
    const-string v13, "Content-Encoding"

    .line 654
    .line 655
    const-string v14, "Content-Length"

    .line 656
    .line 657
    if-ge v9, v8, :cond_23

    .line 658
    .line 659
    invoke-virtual {v5, v9}, Lokhttp3/q;->b(I)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v15

    .line 663
    move/from16 p1, v8

    .line 664
    .line 665
    invoke-virtual {v5, v9}, Lokhttp3/q;->e(I)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v8

    .line 669
    move-object/from16 v16, v5

    .line 670
    .line 671
    const-string v5, "Warning"

    .line 672
    .line 673
    invoke-virtual {v5, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 674
    .line 675
    .line 676
    move-result v5

    .line 677
    if-eqz v5, :cond_1e

    .line 678
    .line 679
    const-string v5, "1"

    .line 680
    .line 681
    move/from16 v17, v9

    .line 682
    .line 683
    const/4 v9, 0x0

    .line 684
    invoke-static {v8, v5, v9}, Lkotlin/text/w;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 685
    .line 686
    .line 687
    move-result v5

    .line 688
    if-eqz v5, :cond_1f

    .line 689
    .line 690
    goto :goto_13

    .line 691
    :cond_1e
    move/from16 v17, v9

    .line 692
    .line 693
    :cond_1f
    invoke-virtual {v14, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 694
    .line 695
    .line 696
    move-result v5

    .line 697
    if-nez v5, :cond_21

    .line 698
    .line 699
    invoke-virtual {v13, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 700
    .line 701
    .line 702
    move-result v5

    .line 703
    if-nez v5, :cond_21

    .line 704
    .line 705
    invoke-virtual {v12, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 706
    .line 707
    .line 708
    move-result v5

    .line 709
    if-eqz v5, :cond_20

    .line 710
    .line 711
    goto :goto_12

    .line 712
    :cond_20
    invoke-static {v15}, Lq7/a;->b(Ljava/lang/String;)Z

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    if-eqz v5, :cond_21

    .line 717
    .line 718
    invoke-virtual {v6, v15}, Lokhttp3/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    if-nez v5, :cond_22

    .line 723
    .line 724
    :cond_21
    :goto_12
    invoke-static {v15, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    invoke-static {v8}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 734
    .line 735
    .line 736
    move-result-object v5

    .line 737
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v5

    .line 741
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    :cond_22
    :goto_13
    add-int/lit8 v9, v17, 0x1

    .line 745
    .line 746
    move/from16 v8, p1

    .line 747
    .line 748
    move-object/from16 v5, v16

    .line 749
    .line 750
    goto :goto_11

    .line 751
    :cond_23
    invoke-virtual {v6}, Lokhttp3/q;->size()I

    .line 752
    .line 753
    .line 754
    move-result v5

    .line 755
    const/4 v8, 0x0

    .line 756
    :goto_14
    if-ge v8, v5, :cond_26

    .line 757
    .line 758
    invoke-virtual {v6, v8}, Lokhttp3/q;->b(I)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v9

    .line 762
    invoke-virtual {v14, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 763
    .line 764
    .line 765
    move-result v15

    .line 766
    if-nez v15, :cond_25

    .line 767
    .line 768
    invoke-virtual {v13, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 769
    .line 770
    .line 771
    move-result v15

    .line 772
    if-nez v15, :cond_25

    .line 773
    .line 774
    invoke-virtual {v12, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 775
    .line 776
    .line 777
    move-result v15

    .line 778
    if-eqz v15, :cond_24

    .line 779
    .line 780
    goto :goto_15

    .line 781
    :cond_24
    invoke-static {v9}, Lq7/a;->b(Ljava/lang/String;)Z

    .line 782
    .line 783
    .line 784
    move-result v15

    .line 785
    if-eqz v15, :cond_25

    .line 786
    .line 787
    invoke-virtual {v6, v8}, Lokhttp3/q;->e(I)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v15

    .line 791
    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 792
    .line 793
    .line 794
    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 798
    .line 799
    .line 800
    invoke-static {v15}, Lkotlin/text/p;->k0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 801
    .line 802
    .line 803
    move-result-object v9

    .line 804
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v9

    .line 808
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    :cond_25
    :goto_15
    add-int/lit8 v8, v8, 0x1

    .line 812
    .line 813
    goto :goto_14

    .line 814
    :cond_26
    new-instance v5, Lokhttp3/q;

    .line 815
    .line 816
    const/4 v9, 0x0

    .line 817
    new-array v6, v9, [Ljava/lang/String;

    .line 818
    .line 819
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v6

    .line 823
    check-cast v6, [Ljava/lang/String;

    .line 824
    .line 825
    invoke-direct {v5, v6}, Lokhttp3/q;-><init>([Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v5}, Lokhttp3/q;->c()Lkotlin/jvm/internal/o;

    .line 829
    .line 830
    .line 831
    move-result-object v5

    .line 832
    iput-object v5, v4, Lokhttp3/h0;->f:Lkotlin/jvm/internal/o;

    .line 833
    .line 834
    iget-wide v5, v0, Lokhttp3/i0;->k:J

    .line 835
    .line 836
    iput-wide v5, v4, Lokhttp3/h0;->k:J

    .line 837
    .line 838
    iget-wide v5, v0, Lokhttp3/i0;->l:J

    .line 839
    .line 840
    iput-wide v5, v4, Lokhttp3/h0;->l:J

    .line 841
    .line 842
    invoke-static {v1}, Lq7/a;->a(Lokhttp3/i0;)Lokhttp3/i0;

    .line 843
    .line 844
    .line 845
    move-result-object v1

    .line 846
    invoke-static {v2, v1}, Lokhttp3/h0;->b(Ljava/lang/String;Lokhttp3/i0;)V

    .line 847
    .line 848
    .line 849
    iput-object v1, v4, Lokhttp3/h0;->i:Lokhttp3/i0;

    .line 850
    .line 851
    invoke-static {v0}, Lq7/a;->a(Lokhttp3/i0;)Lokhttp3/i0;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    invoke-static {v3, v1}, Lokhttp3/h0;->b(Ljava/lang/String;Lokhttp3/i0;)V

    .line 856
    .line 857
    .line 858
    iput-object v1, v4, Lokhttp3/h0;->h:Lokhttp3/i0;

    .line 859
    .line 860
    invoke-virtual {v4}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 861
    .line 862
    .line 863
    iget-object v0, v0, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 864
    .line 865
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v0}, Lokhttp3/m0;->close()V

    .line 869
    .line 870
    .line 871
    const/16 v26, 0x0

    .line 872
    .line 873
    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    throw v26

    .line 877
    :cond_27
    iget-object v4, v1, Lokhttp3/i0;->g:Lokhttp3/m0;

    .line 878
    .line 879
    if-eqz v4, :cond_28

    .line 880
    .line 881
    invoke-static {v4}, Lp7/c;->c(Ljava/io/Closeable;)V

    .line 882
    .line 883
    .line 884
    :cond_28
    invoke-virtual {v0}, Lokhttp3/i0;->c()Lokhttp3/h0;

    .line 885
    .line 886
    .line 887
    move-result-object v4

    .line 888
    invoke-static {v1}, Lq7/a;->a(Lokhttp3/i0;)Lokhttp3/i0;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    invoke-static {v2, v1}, Lokhttp3/h0;->b(Ljava/lang/String;Lokhttp3/i0;)V

    .line 893
    .line 894
    .line 895
    iput-object v1, v4, Lokhttp3/h0;->i:Lokhttp3/i0;

    .line 896
    .line 897
    invoke-static {v0}, Lq7/a;->a(Lokhttp3/i0;)Lokhttp3/i0;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-static {v3, v0}, Lokhttp3/h0;->b(Ljava/lang/String;Lokhttp3/i0;)V

    .line 902
    .line 903
    .line 904
    iput-object v0, v4, Lokhttp3/h0;->h:Lokhttp3/i0;

    .line 905
    .line 906
    invoke-virtual {v4}, Lokhttp3/h0;->a()Lokhttp3/i0;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    return-object v0
.end method

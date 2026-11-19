.class public abstract Lcoil3/compose/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm/a;Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)V
    .locals 14

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    move/from16 v0, p8

    .line 4
    .line 5
    const v1, 0x49b4d5f6    # 1481406.8f

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p7

    .line 9
    .line 10
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v13

    .line 14
    and-int/lit8 v3, v0, 0x6

    .line 15
    .line 16
    const/4 v4, 0x4

    .line 17
    const/4 v5, 0x2

    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-interface {v13, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    move v3, v4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v3, v5

    .line 29
    :goto_0
    or-int/2addr v3, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v3, v0

    .line 32
    :goto_1
    and-int/lit8 v7, v0, 0x30

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    if-nez v7, :cond_3

    .line 36
    .line 37
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    const/16 v7, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v7, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v3, v7

    .line 49
    :cond_3
    and-int/lit16 v7, v0, 0x180

    .line 50
    .line 51
    if-nez v7, :cond_5

    .line 52
    .line 53
    invoke-interface {v13, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_4

    .line 58
    .line 59
    const/16 v7, 0x100

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/16 v7, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v3, v7

    .line 65
    :cond_5
    and-int/lit16 v7, v0, 0xc00

    .line 66
    .line 67
    if-nez v7, :cond_7

    .line 68
    .line 69
    move-object/from16 v7, p2

    .line 70
    .line 71
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_6

    .line 76
    .line 77
    const/16 v9, 0x800

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/16 v9, 0x400

    .line 81
    .line 82
    :goto_4
    or-int/2addr v3, v9

    .line 83
    goto :goto_5

    .line 84
    :cond_7
    move-object/from16 v7, p2

    .line 85
    .line 86
    :goto_5
    and-int/lit16 v9, v0, 0x6000

    .line 87
    .line 88
    if-nez v9, :cond_9

    .line 89
    .line 90
    move-object/from16 v9, p3

    .line 91
    .line 92
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-eqz v10, :cond_8

    .line 97
    .line 98
    const/16 v10, 0x4000

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_8
    const/16 v10, 0x2000

    .line 102
    .line 103
    :goto_6
    or-int/2addr v3, v10

    .line 104
    goto :goto_7

    .line 105
    :cond_9
    move-object/from16 v9, p3

    .line 106
    .line 107
    :goto_7
    const/high16 v10, 0x30000

    .line 108
    .line 109
    and-int/2addr v10, v0

    .line 110
    if-nez v10, :cond_b

    .line 111
    .line 112
    move-object/from16 v10, p4

    .line 113
    .line 114
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    if-eqz v11, :cond_a

    .line 119
    .line 120
    const/high16 v11, 0x20000

    .line 121
    .line 122
    goto :goto_8

    .line 123
    :cond_a
    const/high16 v11, 0x10000

    .line 124
    .line 125
    :goto_8
    or-int/2addr v3, v11

    .line 126
    goto :goto_9

    .line 127
    :cond_b
    move-object/from16 v10, p4

    .line 128
    .line 129
    :goto_9
    const/high16 v11, 0x180000

    .line 130
    .line 131
    and-int/2addr v11, v0

    .line 132
    if-nez v11, :cond_d

    .line 133
    .line 134
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    if-eqz v11, :cond_c

    .line 139
    .line 140
    const/high16 v11, 0x100000

    .line 141
    .line 142
    goto :goto_a

    .line 143
    :cond_c
    const/high16 v11, 0x80000

    .line 144
    .line 145
    :goto_a
    or-int/2addr v3, v11

    .line 146
    :cond_d
    const/high16 v11, 0xc00000

    .line 147
    .line 148
    and-int/2addr v11, v0

    .line 149
    if-nez v11, :cond_f

    .line 150
    .line 151
    const/high16 v11, 0x3f800000    # 1.0f

    .line 152
    .line 153
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 154
    .line 155
    .line 156
    move-result v11

    .line 157
    if-eqz v11, :cond_e

    .line 158
    .line 159
    const/high16 v11, 0x800000

    .line 160
    .line 161
    goto :goto_b

    .line 162
    :cond_e
    const/high16 v11, 0x400000

    .line 163
    .line 164
    :goto_b
    or-int/2addr v3, v11

    .line 165
    :cond_f
    const/high16 v11, 0x6000000

    .line 166
    .line 167
    and-int/2addr v11, v0

    .line 168
    if-nez v11, :cond_11

    .line 169
    .line 170
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-eqz v8, :cond_10

    .line 175
    .line 176
    const/high16 v8, 0x4000000

    .line 177
    .line 178
    goto :goto_c

    .line 179
    :cond_10
    const/high16 v8, 0x2000000

    .line 180
    .line 181
    :goto_c
    or-int/2addr v3, v8

    .line 182
    :cond_11
    const/high16 v8, 0x30000000

    .line 183
    .line 184
    and-int/2addr v8, v0

    .line 185
    if-nez v8, :cond_13

    .line 186
    .line 187
    move/from16 v8, p6

    .line 188
    .line 189
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-eqz v11, :cond_12

    .line 194
    .line 195
    const/high16 v11, 0x20000000

    .line 196
    .line 197
    goto :goto_d

    .line 198
    :cond_12
    const/high16 v11, 0x10000000

    .line 199
    .line 200
    :goto_d
    or-int/2addr v3, v11

    .line 201
    goto :goto_e

    .line 202
    :cond_13
    move/from16 v8, p6

    .line 203
    .line 204
    :goto_e
    and-int/lit8 v11, p9, 0x6

    .line 205
    .line 206
    if-nez v11, :cond_15

    .line 207
    .line 208
    const/4 v11, 0x1

    .line 209
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    if-eqz v11, :cond_14

    .line 214
    .line 215
    goto :goto_f

    .line 216
    :cond_14
    move v4, v5

    .line 217
    :goto_f
    or-int v4, p9, v4

    .line 218
    .line 219
    goto :goto_10

    .line 220
    :cond_15
    move/from16 v4, p9

    .line 221
    .line 222
    :goto_10
    const v11, 0x12492493

    .line 223
    .line 224
    .line 225
    and-int/2addr v11, v3

    .line 226
    const v12, 0x12492492

    .line 227
    .line 228
    .line 229
    if-ne v11, v12, :cond_17

    .line 230
    .line 231
    and-int/lit8 v11, v4, 0x3

    .line 232
    .line 233
    if-ne v11, v5, :cond_17

    .line 234
    .line 235
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-nez v5, :cond_16

    .line 240
    .line 241
    goto :goto_11

    .line 242
    :cond_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_15

    .line 246
    .line 247
    :cond_17
    :goto_11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-eqz v5, :cond_18

    .line 252
    .line 253
    const-string v5, "coil3.compose.AsyncImage (AsyncImage.kt:152)"

    .line 254
    .line 255
    invoke-static {v1, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 256
    .line 257
    .line 258
    :cond_18
    iget-object v1, p0, Lm/a;->a:Ljava/lang/Object;

    .line 259
    .line 260
    shr-int/lit8 v3, v3, 0xf

    .line 261
    .line 262
    and-int/lit8 v3, v3, 0x70

    .line 263
    .line 264
    sget v4, Lm/e;->b:I

    .line 265
    .line 266
    const v4, -0x13a0feae

    .line 267
    .line 268
    .line 269
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 270
    .line 271
    .line 272
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    if-eqz v5, :cond_19

    .line 277
    .line 278
    const/4 v5, -0x1

    .line 279
    const-string v11, "coil3.compose.internal.requestOfWithSizeResolver (utils.kt:61)"

    .line 280
    .line 281
    invoke-static {v4, v3, v5, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 282
    .line 283
    .line 284
    :cond_19
    instance-of v4, v1, Ls/f;

    .line 285
    .line 286
    if-eqz v4, :cond_1f

    .line 287
    .line 288
    const v4, -0x3c2286e8

    .line 289
    .line 290
    .line 291
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 292
    .line 293
    .line 294
    check-cast v1, Ls/f;

    .line 295
    .line 296
    iget-object v4, v1, Ls/f;->s:Ls/e;

    .line 297
    .line 298
    iget-object v4, v4, Ls/e;->i:Lt/g;

    .line 299
    .line 300
    if-eqz v4, :cond_1b

    .line 301
    .line 302
    const v3, -0x3c21ea74

    .line 303
    .line 304
    .line 305
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 309
    .line 310
    .line 311
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 312
    .line 313
    .line 314
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 315
    .line 316
    .line 317
    move-result v3

    .line 318
    if-eqz v3, :cond_1a

    .line 319
    .line 320
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 321
    .line 322
    .line 323
    :cond_1a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 324
    .line 325
    .line 326
    :goto_12
    move-object v4, v1

    .line 327
    goto/16 :goto_13

    .line 328
    .line 329
    :cond_1b
    const v4, -0x3c212e46

    .line 330
    .line 331
    .line 332
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 333
    .line 334
    .line 335
    shr-int/lit8 v3, v3, 0x3

    .line 336
    .line 337
    and-int/lit8 v3, v3, 0xe

    .line 338
    .line 339
    invoke-static {v6, v13, v3}, Lm/e;->b(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lt/g;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    or-int/2addr v4, v5

    .line 352
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    if-nez v4, :cond_1c

    .line 357
    .line 358
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 359
    .line 360
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    if-ne v5, v4, :cond_1d

    .line 365
    .line 366
    :cond_1c
    invoke-static {v1}, Ls/f;->a(Ls/f;)Ls/c;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    iput-object v3, v1, Ls/c;->n:Lt/g;

    .line 371
    .line 372
    invoke-virtual {v1}, Ls/c;->a()Ls/f;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_1d
    move-object v1, v5

    .line 380
    check-cast v1, Ls/f;

    .line 381
    .line 382
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 383
    .line 384
    .line 385
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 386
    .line 387
    .line 388
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 389
    .line 390
    .line 391
    move-result v3

    .line 392
    if-eqz v3, :cond_1e

    .line 393
    .line 394
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 395
    .line 396
    .line 397
    :cond_1e
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 398
    .line 399
    .line 400
    goto :goto_12

    .line 401
    :cond_1f
    const v4, -0x3c1d3dce

    .line 402
    .line 403
    .line 404
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 405
    .line 406
    .line 407
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    check-cast v4, Landroid/content/Context;

    .line 416
    .line 417
    shr-int/lit8 v3, v3, 0x3

    .line 418
    .line 419
    and-int/lit8 v3, v3, 0xe

    .line 420
    .line 421
    invoke-static {v6, v13, v3}, Lm/e;->b(Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Lt/g;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v11

    .line 433
    or-int/2addr v5, v11

    .line 434
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v11

    .line 438
    or-int/2addr v5, v11

    .line 439
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v11

    .line 443
    if-nez v5, :cond_20

    .line 444
    .line 445
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 446
    .line 447
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v5

    .line 451
    if-ne v11, v5, :cond_21

    .line 452
    .line 453
    :cond_20
    new-instance v5, Ls/c;

    .line 454
    .line 455
    invoke-direct {v5, v4}, Ls/c;-><init>(Landroid/content/Context;)V

    .line 456
    .line 457
    .line 458
    iput-object v1, v5, Ls/c;->c:Ljava/lang/Object;

    .line 459
    .line 460
    iput-object v3, v5, Ls/c;->n:Lt/g;

    .line 461
    .line 462
    invoke-virtual {v5}, Ls/c;->a()Ls/f;

    .line 463
    .line 464
    .line 465
    move-result-object v11

    .line 466
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    :cond_21
    move-object v1, v11

    .line 470
    check-cast v1, Ls/f;

    .line 471
    .line 472
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 473
    .line 474
    .line 475
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    if-eqz v3, :cond_22

    .line 480
    .line 481
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 482
    .line 483
    .line 484
    :cond_22
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 485
    .line 486
    .line 487
    goto/16 :goto_12

    .line 488
    .line 489
    :goto_13
    invoke-static {v4}, Lm/e;->f(Ls/f;)V

    .line 490
    .line 491
    .line 492
    iget-object v5, p0, Lm/a;->c:Lcoil3/n;

    .line 493
    .line 494
    iget-object v6, p0, Lm/a;->b:Lcoil3/compose/c;

    .line 495
    .line 496
    invoke-static {v13}, Lm/e;->a(Landroidx/compose/runtime/Composer;)Lcoil3/compose/j;

    .line 497
    .line 498
    .line 499
    move-result-object v12

    .line 500
    new-instance v3, Lcoil3/compose/internal/ContentPainterElement;

    .line 501
    .line 502
    move-object v11, v9

    .line 503
    move v9, v8

    .line 504
    move-object v8, v11

    .line 505
    move-object/from16 v11, p5

    .line 506
    .line 507
    invoke-direct/range {v3 .. v12}, Lcoil3/compose/internal/ContentPainterElement;-><init>(Ls/f;Lcoil3/n;Lcoil3/compose/c;Lr6/c;Lr6/c;ILandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Lcoil3/compose/j;)V

    .line 508
    .line 509
    .line 510
    invoke-interface {p1, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    const/4 v3, 0x0

    .line 515
    invoke-static {v13, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 516
    .line 517
    .line 518
    move-result v3

    .line 519
    invoke-static {v13, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 528
    .line 529
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 530
    .line 531
    .line 532
    move-result-object v6

    .line 533
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 534
    .line 535
    .line 536
    move-result-object v7

    .line 537
    if-nez v7, :cond_23

    .line 538
    .line 539
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 540
    .line 541
    .line 542
    :cond_23
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 543
    .line 544
    .line 545
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 546
    .line 547
    .line 548
    move-result v7

    .line 549
    if-eqz v7, :cond_24

    .line 550
    .line 551
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 552
    .line 553
    .line 554
    goto :goto_14

    .line 555
    :cond_24
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 556
    .line 557
    .line 558
    :goto_14
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 559
    .line 560
    .line 561
    move-result-object v6

    .line 562
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lr6/e;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    sget-object v8, Lm/d;->a:Lm/d;

    .line 567
    .line 568
    invoke-static {v6, v8, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lr6/e;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    invoke-static {v6, v4, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    invoke-static {v6, v1, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lr6/e;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 590
    .line 591
    .line 592
    move-result v4

    .line 593
    if-nez v4, :cond_25

    .line 594
    .line 595
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v4

    .line 599
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    if-nez v4, :cond_26

    .line 608
    .line 609
    :cond_25
    invoke-static {v3, v6, v3, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 610
    .line 611
    .line 612
    :cond_26
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 613
    .line 614
    .line 615
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    if-eqz v1, :cond_27

    .line 620
    .line 621
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 622
    .line 623
    .line 624
    :cond_27
    :goto_15
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 625
    .line 626
    .line 627
    move-result-object v10

    .line 628
    if-eqz v10, :cond_28

    .line 629
    .line 630
    new-instance v0, Lcoil3/compose/a;

    .line 631
    .line 632
    move-object v1, p0

    .line 633
    move-object v2, p1

    .line 634
    move-object/from16 v3, p2

    .line 635
    .line 636
    move-object/from16 v4, p3

    .line 637
    .line 638
    move-object/from16 v5, p4

    .line 639
    .line 640
    move-object/from16 v6, p5

    .line 641
    .line 642
    move/from16 v7, p6

    .line 643
    .line 644
    move/from16 v8, p8

    .line 645
    .line 646
    move/from16 v9, p9

    .line 647
    .line 648
    invoke-direct/range {v0 .. v9}, Lcoil3/compose/a;-><init>(Lm/a;Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;III)V

    .line 649
    .line 650
    .line 651
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 652
    .line 653
    .line 654
    :cond_28
    return-void
.end method

.method public static final b(Ljava/lang/Object;Lcoil3/n;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    sget-object v2, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultFilterQuality-f-v9h1I()I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const v2, -0x4341a0ac

    .line 24
    .line 25
    .line 26
    const-string v3, "coil3.compose.AsyncImage (AsyncImage.kt:72)"

    .line 27
    .line 28
    const/16 v4, 0x30

    .line 29
    .line 30
    invoke-static {v2, v1, v4, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    shr-int/lit8 v2, v1, 0x3

    .line 34
    .line 35
    new-instance v3, Lm/a;

    .line 36
    .line 37
    sget-object v4, Lcoil3/compose/m;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 38
    .line 39
    move-object/from16 v10, p5

    .line 40
    .line 41
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lcoil3/compose/c;

    .line 46
    .line 47
    invoke-direct {v3, p0, v4, p1}, Lm/a;-><init>(Ljava/lang/Object;Lcoil3/compose/c;Lcoil3/n;)V

    .line 48
    .line 49
    .line 50
    sget p0, Lm/e;->b:I

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    sget-object p0, Lcoil3/compose/AsyncImagePainter;->q:Landroidx/navigation/a;

    .line 58
    .line 59
    :goto_0
    move-object v5, p0

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    :goto_1
    new-instance p0, Landroidx/navigation/d;

    .line 62
    .line 63
    const/16 p1, 0x12

    .line 64
    .line 65
    invoke-direct {p0, p1, v0, v0}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_2
    and-int/lit8 p0, v1, 0x70

    .line 70
    .line 71
    and-int/lit16 p1, v2, 0x380

    .line 72
    .line 73
    or-int/2addr p0, p1

    .line 74
    const/high16 p1, 0x180000

    .line 75
    .line 76
    or-int v11, p0, p1

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    move-object v4, p2

    .line 81
    move-object/from16 v8, p4

    .line 82
    .line 83
    invoke-static/range {v3 .. v12}, Lcoil3/compose/b;->a(Lm/a;Landroidx/compose/ui/Modifier;Lr6/c;Lr6/c;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)V

    .line 84
    .line 85
    .line 86
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 93
    .line 94
    .line 95
    :cond_3
    return-void
.end method

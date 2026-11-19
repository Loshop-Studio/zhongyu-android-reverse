.class public abstract Ln6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/navigation/NavController;ZZZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Ln6/d;->g(Landroidx/navigation/NavController;ZZZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Ln6/d;->e(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Ln6/d;->f(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/navigation/NavController;ZZZLandroidx/compose/runtime/Composer;II)V
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move/from16 v5, p5

    .line 8
    .line 9
    const-string v0, "navController"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const v0, -0x2f9a455d

    .line 15
    .line 16
    .line 17
    move-object/from16 v4, p4

    .line 18
    .line 19
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    and-int/lit8 v6, v5, 0x6

    .line 24
    .line 25
    if-nez v6, :cond_1

    .line 26
    .line 27
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    const/4 v6, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v6, 0x2

    .line 36
    :goto_0
    or-int/2addr v6, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v6, v5

    .line 39
    :goto_1
    and-int/lit8 v7, v5, 0x30

    .line 40
    .line 41
    if-nez v7, :cond_3

    .line 42
    .line 43
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    const/16 v7, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v7, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v6, v7

    .line 55
    :cond_3
    and-int/lit16 v7, v5, 0x180

    .line 56
    .line 57
    if-nez v7, :cond_5

    .line 58
    .line 59
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_4

    .line 64
    .line 65
    const/16 v7, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v7, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v6, v7

    .line 71
    :cond_5
    and-int/lit8 v7, p6, 0x8

    .line 72
    .line 73
    if-eqz v7, :cond_7

    .line 74
    .line 75
    or-int/lit16 v6, v6, 0xc00

    .line 76
    .line 77
    :cond_6
    move/from16 v8, p3

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_7
    and-int/lit16 v8, v5, 0xc00

    .line 81
    .line 82
    if-nez v8, :cond_6

    .line 83
    .line 84
    move/from16 v8, p3

    .line 85
    .line 86
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_8

    .line 91
    .line 92
    const/16 v9, 0x800

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_8
    const/16 v9, 0x400

    .line 96
    .line 97
    :goto_4
    or-int/2addr v6, v9

    .line 98
    :goto_5
    and-int/lit16 v9, v6, 0x493

    .line 99
    .line 100
    const/16 v10, 0x492

    .line 101
    .line 102
    const/4 v12, 0x0

    .line 103
    if-eq v9, v10, :cond_9

    .line 104
    .line 105
    const/4 v9, 0x1

    .line 106
    goto :goto_6

    .line 107
    :cond_9
    move v9, v12

    .line 108
    :goto_6
    and-int/lit8 v10, v6, 0x1

    .line 109
    .line 110
    invoke-interface {v4, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_27

    .line 115
    .line 116
    if-eqz v7, :cond_a

    .line 117
    .line 118
    move/from16 v31, v12

    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_a
    move/from16 v31, v8

    .line 122
    .line 123
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_b

    .line 128
    .line 129
    const/4 v7, -0x1

    .line 130
    const-string v8, "com.zykj.evaluation.ui.guide.normal.submitDialog.SubmitConfirmPage (SubmitConfirmPage.kt:27)"

    .line 131
    .line 132
    invoke-static {v0, v6, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_b
    if-eqz v31, :cond_c

    .line 136
    .line 137
    const v0, 0x7f1201af

    .line 138
    .line 139
    .line 140
    goto :goto_8

    .line 141
    :cond_c
    const v0, 0x7f1201ae

    .line 142
    .line 143
    .line 144
    :goto_8
    if-eqz v31, :cond_d

    .line 145
    .line 146
    const v6, 0x7f1201ab

    .line 147
    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_d
    if-eqz v2, :cond_e

    .line 151
    .line 152
    const v6, 0x7f1201aa

    .line 153
    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_e
    if-eqz v3, :cond_f

    .line 157
    .line 158
    const v6, 0x7f1201ad

    .line 159
    .line 160
    .line 161
    goto :goto_9

    .line 162
    :cond_f
    const v6, 0x7f1201ac

    .line 163
    .line 164
    .line 165
    :goto_9
    if-eqz v31, :cond_10

    .line 166
    .line 167
    const v7, 0x7f1201a9

    .line 168
    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_10
    const v7, 0x7f1201a8

    .line 172
    .line 173
    .line 174
    :goto_a
    if-eqz v31, :cond_11

    .line 175
    .line 176
    const v8, 0x7f1201a7

    .line 177
    .line 178
    .line 179
    goto :goto_b

    .line 180
    :cond_11
    const v8, 0x7f1201a6

    .line 181
    .line 182
    .line 183
    :goto_b
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 184
    .line 185
    const/16 v10, 0xbd

    .line 186
    .line 187
    int-to-float v10, v10

    .line 188
    const/16 v13, 0x258

    .line 189
    .line 190
    int-to-float v13, v13

    .line 191
    div-float/2addr v10, v13

    .line 192
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    iget v15, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 201
    .line 202
    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 203
    .line 204
    invoke-static {v15, v14}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    int-to-float v14, v14

    .line 209
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 214
    .line 215
    .line 216
    move-result-object v15

    .line 217
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 218
    .line 219
    div-float/2addr v14, v15

    .line 220
    mul-float/2addr v10, v14

    .line 221
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    const/16 v14, 0x6c

    .line 226
    .line 227
    int-to-float v14, v14

    .line 228
    div-float/2addr v14, v13

    .line 229
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 230
    .line 231
    .line 232
    move-result-object v15

    .line 233
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 234
    .line 235
    .line 236
    move-result-object v15

    .line 237
    iget v11, v15, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 238
    .line 239
    iget v15, v15, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 240
    .line 241
    invoke-static {v11, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 242
    .line 243
    .line 244
    move-result v11

    .line 245
    int-to-float v11, v11

    .line 246
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 247
    .line 248
    .line 249
    move-result-object v15

    .line 250
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 251
    .line 252
    .line 253
    move-result-object v15

    .line 254
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 255
    .line 256
    div-float/2addr v11, v15

    .line 257
    mul-float/2addr v14, v11

    .line 258
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    invoke-static {v9, v10, v11}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    const/4 v11, 0x3

    .line 267
    int-to-float v11, v11

    .line 268
    div-float v32, v11, v13

    .line 269
    .line 270
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    iget v14, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 279
    .line 280
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 281
    .line 282
    invoke-static {v14, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 283
    .line 284
    .line 285
    move-result v11

    .line 286
    int-to-float v11, v11

    .line 287
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 288
    .line 289
    .line 290
    move-result-object v14

    .line 291
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 292
    .line 293
    .line 294
    move-result-object v14

    .line 295
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 296
    .line 297
    div-float/2addr v11, v14

    .line 298
    mul-float v11, v11, v32

    .line 299
    .line 300
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    invoke-static {v11}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    invoke-static {v10, v11}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 309
    .line 310
    .line 311
    move-result-object v14

    .line 312
    sget-object v33, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 313
    .line 314
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 315
    .line 316
    .line 317
    move-result-wide v15

    .line 318
    const/16 v18, 0x2

    .line 319
    .line 320
    const/16 v19, 0x0

    .line 321
    .line 322
    const/16 v17, 0x0

    .line 323
    .line 324
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 325
    .line 326
    .line 327
    move-result-object v10

    .line 328
    const/16 v11, 0x9

    .line 329
    .line 330
    int-to-float v14, v11

    .line 331
    div-float v34, v14, v13

    .line 332
    .line 333
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 334
    .line 335
    .line 336
    move-result-object v14

    .line 337
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 338
    .line 339
    .line 340
    move-result-object v14

    .line 341
    iget v15, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 342
    .line 343
    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 344
    .line 345
    invoke-static {v15, v14}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 346
    .line 347
    .line 348
    move-result v14

    .line 349
    int-to-float v14, v14

    .line 350
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 351
    .line 352
    .line 353
    move-result-object v15

    .line 354
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 355
    .line 356
    .line 357
    move-result-object v15

    .line 358
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 359
    .line 360
    div-float/2addr v14, v15

    .line 361
    mul-float v14, v14, v34

    .line 362
    .line 363
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 364
    .line 365
    .line 366
    move-result v14

    .line 367
    invoke-static {v10, v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    sget-object v35, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 372
    .line 373
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 374
    .line 375
    .line 376
    move-result-object v14

    .line 377
    sget-object v36, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 378
    .line 379
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 380
    .line 381
    .line 382
    move-result-object v15

    .line 383
    move/from16 p3, v11

    .line 384
    .line 385
    const/16 v11, 0x30

    .line 386
    .line 387
    invoke-static {v15, v14, v4, v11}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 388
    .line 389
    .line 390
    move-result-object v11

    .line 391
    invoke-static {v4, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 392
    .line 393
    .line 394
    move-result v14

    .line 395
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 396
    .line 397
    .line 398
    move-result-object v15

    .line 399
    invoke-static {v4, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 400
    .line 401
    .line 402
    move-result-object v10

    .line 403
    sget-object v37, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 404
    .line 405
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 406
    .line 407
    .line 408
    move-result-object v12

    .line 409
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 410
    .line 411
    .line 412
    move-result-object v17

    .line 413
    if-nez v17, :cond_12

    .line 414
    .line 415
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 416
    .line 417
    .line 418
    :cond_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 419
    .line 420
    .line 421
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 422
    .line 423
    .line 424
    move-result v17

    .line 425
    if-eqz v17, :cond_13

    .line 426
    .line 427
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 428
    .line 429
    .line 430
    goto :goto_c

    .line 431
    :cond_13
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 432
    .line 433
    .line 434
    :goto_c
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 435
    .line 436
    .line 437
    move-result-object v12

    .line 438
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    invoke-static {v12, v11, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-static {v12, v15, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 457
    .line 458
    .line 459
    move-result v11

    .line 460
    if-nez v11, :cond_14

    .line 461
    .line 462
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v11

    .line 466
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v15

    .line 470
    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v11

    .line 474
    if-nez v11, :cond_15

    .line 475
    .line 476
    :cond_14
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 477
    .line 478
    .line 479
    move-result-object v11

    .line 480
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 484
    .line 485
    .line 486
    move-result-object v11

    .line 487
    invoke-interface {v12, v11, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 488
    .line 489
    .line 490
    :cond_15
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    invoke-static {v12, v10, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 495
    .line 496
    .line 497
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 498
    .line 499
    const/4 v10, 0x0

    .line 500
    invoke-static {v0, v4, v10}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    const-wide v38, 0xff4f5561L

    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    move v11, v8

    .line 510
    move-object v14, v9

    .line 511
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 512
    .line 513
    .line 514
    move-result-wide v8

    .line 515
    invoke-static/range {p3 .. p3}, Lo5/e;->k(I)J

    .line 516
    .line 517
    .line 518
    move-result-wide v15

    .line 519
    const/16 v29, 0x0

    .line 520
    .line 521
    const v30, 0x1fff2

    .line 522
    .line 523
    .line 524
    move v12, v7

    .line 525
    const/4 v7, 0x0

    .line 526
    move/from16 v17, v12

    .line 527
    .line 528
    const/4 v12, 0x0

    .line 529
    move/from16 v18, v13

    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    move-object/from16 v19, v14

    .line 533
    .line 534
    const/4 v14, 0x0

    .line 535
    move/from16 v21, v10

    .line 536
    .line 537
    move/from16 v20, v11

    .line 538
    .line 539
    move-wide v10, v15

    .line 540
    const-wide/16 v15, 0x0

    .line 541
    .line 542
    move/from16 v22, v17

    .line 543
    .line 544
    const/16 v17, 0x0

    .line 545
    .line 546
    move/from16 v23, v18

    .line 547
    .line 548
    const/16 v18, 0x0

    .line 549
    .line 550
    move-object/from16 v25, v19

    .line 551
    .line 552
    move/from16 v24, v20

    .line 553
    .line 554
    const-wide/16 v19, 0x0

    .line 555
    .line 556
    move/from16 v26, v21

    .line 557
    .line 558
    const/16 v21, 0x0

    .line 559
    .line 560
    move/from16 v27, v22

    .line 561
    .line 562
    const/16 v22, 0x0

    .line 563
    .line 564
    move/from16 v28, v23

    .line 565
    .line 566
    const/16 v23, 0x0

    .line 567
    .line 568
    move/from16 v40, v24

    .line 569
    .line 570
    const/16 v24, 0x0

    .line 571
    .line 572
    move-object/from16 v41, v25

    .line 573
    .line 574
    const/16 v25, 0x0

    .line 575
    .line 576
    move/from16 v42, v26

    .line 577
    .line 578
    const/16 v26, 0x0

    .line 579
    .line 580
    move/from16 v43, v28

    .line 581
    .line 582
    const/16 v28, 0xd80

    .line 583
    .line 584
    move/from16 p3, v6

    .line 585
    .line 586
    move-object v6, v0

    .line 587
    move/from16 v0, p3

    .line 588
    .line 589
    move/from16 p3, v27

    .line 590
    .line 591
    move-object/from16 v27, v4

    .line 592
    .line 593
    move/from16 v4, p3

    .line 594
    .line 595
    move-object/from16 p3, v2

    .line 596
    .line 597
    move/from16 v2, v40

    .line 598
    .line 599
    move/from16 v3, v42

    .line 600
    .line 601
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v6, v27

    .line 605
    .line 606
    const/16 v17, 0x2

    .line 607
    .line 608
    const/high16 v15, 0x3f800000    # 1.0f

    .line 609
    .line 610
    const/16 v16, 0x0

    .line 611
    .line 612
    move-object/from16 v13, p3

    .line 613
    .line 614
    move-object/from16 v14, v41

    .line 615
    .line 616
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 617
    .line 618
    .line 619
    move-result-object v7

    .line 620
    move-object/from16 v40, v13

    .line 621
    .line 622
    invoke-static {v7, v6, v3}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 623
    .line 624
    .line 625
    invoke-static {v0, v6, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 630
    .line 631
    .line 632
    move-result-wide v8

    .line 633
    const/4 v7, 0x7

    .line 634
    invoke-static {v7}, Lo5/e;->k(I)J

    .line 635
    .line 636
    .line 637
    move-result-wide v10

    .line 638
    const/4 v7, 0x0

    .line 639
    const/4 v13, 0x0

    .line 640
    const/4 v14, 0x0

    .line 641
    const-wide/16 v15, 0x0

    .line 642
    .line 643
    const/16 v17, 0x0

    .line 644
    .line 645
    move-object v6, v0

    .line 646
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 647
    .line 648
    .line 649
    move-object/from16 v6, v27

    .line 650
    .line 651
    const/16 v17, 0x2

    .line 652
    .line 653
    const/high16 v15, 0x3f800000    # 1.0f

    .line 654
    .line 655
    const/16 v16, 0x0

    .line 656
    .line 657
    move-object/from16 v13, v40

    .line 658
    .line 659
    move-object/from16 v14, v41

    .line 660
    .line 661
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-static {v0, v6, v3}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 666
    .line 667
    .line 668
    const/4 v0, 0x0

    .line 669
    const/4 v8, 0x1

    .line 670
    invoke-static {v14, v0, v8, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 671
    .line 672
    .line 673
    move-result-object v9

    .line 674
    const/16 v8, 0x14

    .line 675
    .line 676
    int-to-float v8, v8

    .line 677
    div-float v8, v8, v43

    .line 678
    .line 679
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 680
    .line 681
    .line 682
    move-result-object v10

    .line 683
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 684
    .line 685
    .line 686
    move-result-object v10

    .line 687
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 688
    .line 689
    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 690
    .line 691
    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 692
    .line 693
    .line 694
    move-result v10

    .line 695
    int-to-float v10, v10

    .line 696
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 697
    .line 698
    .line 699
    move-result-object v11

    .line 700
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 701
    .line 702
    .line 703
    move-result-object v11

    .line 704
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 705
    .line 706
    div-float/2addr v10, v11

    .line 707
    mul-float/2addr v8, v10

    .line 708
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 709
    .line 710
    .line 711
    move-result v8

    .line 712
    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 713
    .line 714
    .line 715
    move-result-object v8

    .line 716
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 717
    .line 718
    .line 719
    move-result-object v9

    .line 720
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 721
    .line 722
    .line 723
    move-result-object v10

    .line 724
    invoke-static {v9, v10, v6, v3}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 725
    .line 726
    .line 727
    move-result-object v9

    .line 728
    invoke-static {v6, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 729
    .line 730
    .line 731
    move-result v10

    .line 732
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 733
    .line 734
    .line 735
    move-result-object v11

    .line 736
    invoke-static {v6, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 737
    .line 738
    .line 739
    move-result-object v8

    .line 740
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 741
    .line 742
    .line 743
    move-result-object v12

    .line 744
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 745
    .line 746
    .line 747
    move-result-object v13

    .line 748
    if-nez v13, :cond_16

    .line 749
    .line 750
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 751
    .line 752
    .line 753
    :cond_16
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 754
    .line 755
    .line 756
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 757
    .line 758
    .line 759
    move-result v13

    .line 760
    if-eqz v13, :cond_17

    .line 761
    .line 762
    invoke-interface {v6, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 763
    .line 764
    .line 765
    goto :goto_d

    .line 766
    :cond_17
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 767
    .line 768
    .line 769
    :goto_d
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 770
    .line 771
    .line 772
    move-result-object v12

    .line 773
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 774
    .line 775
    .line 776
    move-result-object v13

    .line 777
    invoke-static {v12, v9, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 781
    .line 782
    .line 783
    move-result-object v9

    .line 784
    invoke-static {v12, v11, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 788
    .line 789
    .line 790
    move-result-object v9

    .line 791
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 792
    .line 793
    .line 794
    move-result v11

    .line 795
    if-nez v11, :cond_18

    .line 796
    .line 797
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v11

    .line 801
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 802
    .line 803
    .line 804
    move-result-object v13

    .line 805
    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-result v11

    .line 809
    if-nez v11, :cond_19

    .line 810
    .line 811
    :cond_18
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 812
    .line 813
    .line 814
    move-result-object v11

    .line 815
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 819
    .line 820
    .line 821
    move-result-object v10

    .line 822
    invoke-interface {v12, v10, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 823
    .line 824
    .line 825
    :cond_19
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 826
    .line 827
    .line 828
    move-result-object v9

    .line 829
    invoke-static {v12, v8, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 830
    .line 831
    .line 832
    sget-object v13, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 833
    .line 834
    const/16 v17, 0x2

    .line 835
    .line 836
    const/16 v18, 0x0

    .line 837
    .line 838
    const/high16 v15, 0x3f800000    # 1.0f

    .line 839
    .line 840
    const/16 v16, 0x0

    .line 841
    .line 842
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 843
    .line 844
    .line 845
    move-result-object v8

    .line 846
    move-object/from16 v36, v13

    .line 847
    .line 848
    move-object v9, v14

    .line 849
    const/4 v10, 0x1

    .line 850
    invoke-static {v8, v0, v10, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 851
    .line 852
    .line 853
    move-result-object v8

    .line 854
    int-to-float v11, v10

    .line 855
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 856
    .line 857
    .line 858
    move-result v10

    .line 859
    const-wide v38, 0xff48a0f8L

    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 865
    .line 866
    .line 867
    move-result-wide v11

    .line 868
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 869
    .line 870
    .line 871
    move-result-object v13

    .line 872
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 873
    .line 874
    .line 875
    move-result-object v13

    .line 876
    iget v14, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 877
    .line 878
    iget v13, v13, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 879
    .line 880
    invoke-static {v14, v13}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 881
    .line 882
    .line 883
    move-result v13

    .line 884
    int-to-float v13, v13

    .line 885
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 886
    .line 887
    .line 888
    move-result-object v14

    .line 889
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 890
    .line 891
    .line 892
    move-result-object v14

    .line 893
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 894
    .line 895
    div-float/2addr v13, v14

    .line 896
    mul-float v13, v13, v32

    .line 897
    .line 898
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 899
    .line 900
    .line 901
    move-result v13

    .line 902
    invoke-static {v13}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 903
    .line 904
    .line 905
    move-result-object v13

    .line 906
    invoke-static {v8, v10, v11, v12, v13}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 907
    .line 908
    .line 909
    move-result-object v8

    .line 910
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 911
    .line 912
    .line 913
    move-result v10

    .line 914
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object v11

    .line 918
    if-nez v10, :cond_1a

    .line 919
    .line 920
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 921
    .line 922
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v10

    .line 926
    if-ne v11, v10, :cond_1b

    .line 927
    .line 928
    :cond_1a
    new-instance v11, Ln6/a;

    .line 929
    .line 930
    invoke-direct {v11, v1}, Ln6/a;-><init>(Landroidx/navigation/NavController;)V

    .line 931
    .line 932
    .line 933
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    :cond_1b
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 937
    .line 938
    const/4 v10, 0x1

    .line 939
    invoke-static {v8, v3, v11, v10, v7}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 940
    .line 941
    .line 942
    move-result-object v8

    .line 943
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 944
    .line 945
    .line 946
    move-result-object v10

    .line 947
    invoke-static {v10, v3}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 948
    .line 949
    .line 950
    move-result-object v10

    .line 951
    invoke-static {v6, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 952
    .line 953
    .line 954
    move-result v11

    .line 955
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 956
    .line 957
    .line 958
    move-result-object v12

    .line 959
    invoke-static {v6, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 960
    .line 961
    .line 962
    move-result-object v8

    .line 963
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 964
    .line 965
    .line 966
    move-result-object v13

    .line 967
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 968
    .line 969
    .line 970
    move-result-object v14

    .line 971
    if-nez v14, :cond_1c

    .line 972
    .line 973
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 974
    .line 975
    .line 976
    :cond_1c
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 977
    .line 978
    .line 979
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 980
    .line 981
    .line 982
    move-result v14

    .line 983
    if-eqz v14, :cond_1d

    .line 984
    .line 985
    invoke-interface {v6, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 986
    .line 987
    .line 988
    goto :goto_e

    .line 989
    :cond_1d
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 990
    .line 991
    .line 992
    :goto_e
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 993
    .line 994
    .line 995
    move-result-object v13

    .line 996
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 997
    .line 998
    .line 999
    move-result-object v14

    .line 1000
    invoke-static {v13, v10, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v10

    .line 1007
    invoke-static {v13, v12, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v10

    .line 1014
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1015
    .line 1016
    .line 1017
    move-result v12

    .line 1018
    if-nez v12, :cond_1e

    .line 1019
    .line 1020
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v12

    .line 1024
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v14

    .line 1028
    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v12

    .line 1032
    if-nez v12, :cond_1f

    .line 1033
    .line 1034
    :cond_1e
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v12

    .line 1038
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1039
    .line 1040
    .line 1041
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v11

    .line 1045
    invoke-interface {v13, v11, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1046
    .line 1047
    .line 1048
    :cond_1f
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v10

    .line 1052
    invoke-static {v13, v8, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1053
    .line 1054
    .line 1055
    sget-object v8, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1056
    .line 1057
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v10

    .line 1061
    invoke-interface {v8, v9, v10}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v10

    .line 1065
    invoke-static {v4, v6, v3}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v4

    .line 1069
    move-object v11, v8

    .line 1070
    move-object v14, v9

    .line 1071
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1072
    .line 1073
    .line 1074
    move-result-wide v8

    .line 1075
    const/4 v12, 0x6

    .line 1076
    move-object v15, v7

    .line 1077
    move-object v7, v10

    .line 1078
    move-object v13, v11

    .line 1079
    invoke-static {v12}, Lo5/e;->k(I)J

    .line 1080
    .line 1081
    .line 1082
    move-result-wide v10

    .line 1083
    const/16 v29, 0x0

    .line 1084
    .line 1085
    const v30, 0x1fff0

    .line 1086
    .line 1087
    .line 1088
    move/from16 v16, v12

    .line 1089
    .line 1090
    const/4 v12, 0x0

    .line 1091
    move-object/from16 v17, v13

    .line 1092
    .line 1093
    const/4 v13, 0x0

    .line 1094
    move-object/from16 v41, v14

    .line 1095
    .line 1096
    const/4 v14, 0x0

    .line 1097
    move-object/from16 v18, v15

    .line 1098
    .line 1099
    move/from16 v19, v16

    .line 1100
    .line 1101
    const-wide/16 v15, 0x0

    .line 1102
    .line 1103
    move-object/from16 v20, v17

    .line 1104
    .line 1105
    const/16 v17, 0x0

    .line 1106
    .line 1107
    move-object/from16 v21, v18

    .line 1108
    .line 1109
    const/16 v18, 0x0

    .line 1110
    .line 1111
    move/from16 v23, v19

    .line 1112
    .line 1113
    move-object/from16 v22, v20

    .line 1114
    .line 1115
    const-wide/16 v19, 0x0

    .line 1116
    .line 1117
    move-object/from16 v24, v21

    .line 1118
    .line 1119
    const/16 v21, 0x0

    .line 1120
    .line 1121
    move-object/from16 v25, v22

    .line 1122
    .line 1123
    const/16 v22, 0x0

    .line 1124
    .line 1125
    move/from16 v26, v23

    .line 1126
    .line 1127
    const/16 v23, 0x0

    .line 1128
    .line 1129
    move-object/from16 v27, v24

    .line 1130
    .line 1131
    const/16 v24, 0x0

    .line 1132
    .line 1133
    move-object/from16 v28, v25

    .line 1134
    .line 1135
    const/16 v25, 0x0

    .line 1136
    .line 1137
    move/from16 v40, v26

    .line 1138
    .line 1139
    const/16 v26, 0x0

    .line 1140
    .line 1141
    move-object/from16 v42, v28

    .line 1142
    .line 1143
    const/16 v28, 0xd80

    .line 1144
    .line 1145
    move-object/from16 v3, v27

    .line 1146
    .line 1147
    move/from16 v0, v40

    .line 1148
    .line 1149
    move-object/from16 v44, v42

    .line 1150
    .line 1151
    move-object/from16 v27, v6

    .line 1152
    .line 1153
    move-object v6, v4

    .line 1154
    move-object/from16 v4, v41

    .line 1155
    .line 1156
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1157
    .line 1158
    .line 1159
    move-object/from16 v6, v27

    .line 1160
    .line 1161
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1162
    .line 1163
    .line 1164
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v7

    .line 1168
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v7

    .line 1172
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1173
    .line 1174
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1175
    .line 1176
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 1177
    .line 1178
    .line 1179
    move-result v7

    .line 1180
    int-to-float v7, v7

    .line 1181
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v8

    .line 1185
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v8

    .line 1189
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 1190
    .line 1191
    div-float/2addr v7, v8

    .line 1192
    mul-float v34, v34, v7

    .line 1193
    .line 1194
    invoke-static/range {v34 .. v34}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1195
    .line 1196
    .line 1197
    move-result v7

    .line 1198
    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v7

    .line 1202
    invoke-static {v7, v6, v0}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1203
    .line 1204
    .line 1205
    const/16 v17, 0x2

    .line 1206
    .line 1207
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1208
    .line 1209
    const/16 v16, 0x0

    .line 1210
    .line 1211
    move-object v14, v4

    .line 1212
    move-object/from16 v13, v36

    .line 1213
    .line 1214
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v4

    .line 1218
    const/4 v7, 0x0

    .line 1219
    const/4 v10, 0x1

    .line 1220
    invoke-static {v4, v7, v10, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v4

    .line 1224
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1225
    .line 1226
    .line 1227
    move-result-wide v7

    .line 1228
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v9

    .line 1232
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v9

    .line 1236
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1237
    .line 1238
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1239
    .line 1240
    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 1241
    .line 1242
    .line 1243
    move-result v9

    .line 1244
    int-to-float v9, v9

    .line 1245
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v10

    .line 1249
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v10

    .line 1253
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 1254
    .line 1255
    div-float/2addr v9, v10

    .line 1256
    mul-float v32, v32, v9

    .line 1257
    .line 1258
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1259
    .line 1260
    .line 1261
    move-result v9

    .line 1262
    invoke-static {v9}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v9

    .line 1266
    invoke-static {v4, v7, v8, v9}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v4

    .line 1270
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v7

    .line 1274
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v8

    .line 1278
    if-nez v7, :cond_20

    .line 1279
    .line 1280
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1281
    .line 1282
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v7

    .line 1286
    if-ne v8, v7, :cond_21

    .line 1287
    .line 1288
    :cond_20
    new-instance v8, Ln6/b;

    .line 1289
    .line 1290
    invoke-direct {v8, v1}, Ln6/b;-><init>(Landroidx/navigation/NavController;)V

    .line 1291
    .line 1292
    .line 1293
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1294
    .line 1295
    .line 1296
    :cond_21
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 1297
    .line 1298
    const/4 v7, 0x0

    .line 1299
    const/4 v10, 0x1

    .line 1300
    invoke-static {v4, v7, v8, v10, v3}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v4

    .line 1308
    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v4

    .line 1312
    invoke-static {v6, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1313
    .line 1314
    .line 1315
    move-result v8

    .line 1316
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v7

    .line 1320
    invoke-static {v6, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v3

    .line 1324
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v9

    .line 1328
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v10

    .line 1332
    if-nez v10, :cond_22

    .line 1333
    .line 1334
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1335
    .line 1336
    .line 1337
    :cond_22
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1338
    .line 1339
    .line 1340
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1341
    .line 1342
    .line 1343
    move-result v10

    .line 1344
    if-eqz v10, :cond_23

    .line 1345
    .line 1346
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 1347
    .line 1348
    .line 1349
    goto :goto_f

    .line 1350
    :cond_23
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1351
    .line 1352
    .line 1353
    :goto_f
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v9

    .line 1357
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v10

    .line 1361
    invoke-static {v9, v4, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v4

    .line 1368
    invoke-static {v9, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v4

    .line 1375
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v7

    .line 1379
    if-nez v7, :cond_24

    .line 1380
    .line 1381
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v7

    .line 1385
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v10

    .line 1389
    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    move-result v7

    .line 1393
    if-nez v7, :cond_25

    .line 1394
    .line 1395
    :cond_24
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v7

    .line 1399
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1400
    .line 1401
    .line 1402
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v7

    .line 1406
    invoke-interface {v9, v7, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1407
    .line 1408
    .line 1409
    :cond_25
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v4

    .line 1413
    invoke-static {v9, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v3

    .line 1420
    move-object/from16 v11, v44

    .line 1421
    .line 1422
    invoke-interface {v11, v14, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v7

    .line 1426
    const/4 v10, 0x0

    .line 1427
    invoke-static {v2, v6, v10}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v2

    .line 1431
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 1432
    .line 1433
    .line 1434
    move-result-wide v8

    .line 1435
    invoke-static {v0}, Lo5/e;->k(I)J

    .line 1436
    .line 1437
    .line 1438
    move-result-wide v10

    .line 1439
    const/16 v29, 0x0

    .line 1440
    .line 1441
    const v30, 0x1fff0

    .line 1442
    .line 1443
    .line 1444
    const/4 v12, 0x0

    .line 1445
    const/4 v13, 0x0

    .line 1446
    const/4 v14, 0x0

    .line 1447
    const-wide/16 v15, 0x0

    .line 1448
    .line 1449
    const/16 v17, 0x0

    .line 1450
    .line 1451
    const/16 v18, 0x0

    .line 1452
    .line 1453
    const-wide/16 v19, 0x0

    .line 1454
    .line 1455
    const/16 v21, 0x0

    .line 1456
    .line 1457
    const/16 v22, 0x0

    .line 1458
    .line 1459
    const/16 v23, 0x0

    .line 1460
    .line 1461
    const/16 v24, 0x0

    .line 1462
    .line 1463
    const/16 v25, 0x0

    .line 1464
    .line 1465
    const/16 v26, 0x0

    .line 1466
    .line 1467
    const/16 v28, 0xd80

    .line 1468
    .line 1469
    move-object/from16 v27, v6

    .line 1470
    .line 1471
    move-object v6, v2

    .line 1472
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1473
    .line 1474
    .line 1475
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1476
    .line 1477
    .line 1478
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1479
    .line 1480
    .line 1481
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1482
    .line 1483
    .line 1484
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1485
    .line 1486
    .line 1487
    move-result v0

    .line 1488
    if-eqz v0, :cond_26

    .line 1489
    .line 1490
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1491
    .line 1492
    .line 1493
    :cond_26
    move/from16 v4, v31

    .line 1494
    .line 1495
    goto :goto_10

    .line 1496
    :cond_27
    move-object/from16 v27, v4

    .line 1497
    .line 1498
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1499
    .line 1500
    .line 1501
    move v4, v8

    .line 1502
    :goto_10
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v7

    .line 1506
    if-eqz v7, :cond_28

    .line 1507
    .line 1508
    new-instance v0, Ln6/c;

    .line 1509
    .line 1510
    move/from16 v2, p1

    .line 1511
    .line 1512
    move/from16 v3, p2

    .line 1513
    .line 1514
    move/from16 v6, p6

    .line 1515
    .line 1516
    invoke-direct/range {v0 .. v6}, Ln6/c;-><init>(Landroidx/navigation/NavController;ZZZII)V

    .line 1517
    .line 1518
    .line 1519
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1520
    .line 1521
    .line 1522
    :cond_28
    return-void
.end method

.method public static final e(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getPreviousBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v1, "SUBMIT_RESULT"

    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final f(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final g(Landroidx/navigation/NavController;ZZZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    .line 1
    or-int/lit8 p4, p4, 0x1

    .line 2
    .line 3
    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    move-object v0, p0

    .line 8
    move v1, p1

    .line 9
    move v2, p2

    .line 10
    move v3, p3

    .line 11
    move v6, p5

    .line 12
    move-object v4, p6

    .line 13
    invoke-static/range {v0 .. v6}, Ln6/d;->d(Landroidx/navigation/NavController;ZZZLandroidx/compose/runtime/Composer;II)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method

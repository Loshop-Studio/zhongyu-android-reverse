.class public abstract Li6/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-static {p0, p1, p2, p4, p3}, Li6/k0;->y(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final B(Landroidx/compose/ui/Modifier;Li6/b;Lkotlin/jvm/functions/Function3;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 44

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v0, p4

    .line 8
    .line 9
    move/from16 v1, p7

    .line 10
    .line 11
    const-string v5, "groupState"

    .line 12
    .line 13
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v5, "onClickOpenBoard"

    .line 17
    .line 18
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v5, "failedUuidsSet"

    .line 22
    .line 23
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v5, "onClickQuestionDescription"

    .line 27
    .line 28
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v5, 0x7577df20

    .line 32
    .line 33
    .line 34
    move-object/from16 v6, p6

    .line 35
    .line 36
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    and-int/lit8 v6, p8, 0x1

    .line 41
    .line 42
    const/4 v15, 0x4

    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    or-int/lit8 v7, v1, 0x6

    .line 46
    .line 47
    move v8, v7

    .line 48
    move-object/from16 v7, p0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    and-int/lit8 v7, v1, 0x6

    .line 52
    .line 53
    if-nez v7, :cond_2

    .line 54
    .line 55
    move-object/from16 v7, p0

    .line 56
    .line 57
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_1

    .line 62
    .line 63
    move v8, v15

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 v8, 0x2

    .line 66
    :goto_0
    or-int/2addr v8, v1

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object/from16 v7, p0

    .line 69
    .line 70
    move v8, v1

    .line 71
    :goto_1
    and-int/lit8 v9, v1, 0x30

    .line 72
    .line 73
    if-nez v9, :cond_4

    .line 74
    .line 75
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    const/16 v9, 0x20

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    const/16 v9, 0x10

    .line 85
    .line 86
    :goto_2
    or-int/2addr v8, v9

    .line 87
    :cond_4
    and-int/lit16 v9, v1, 0x180

    .line 88
    .line 89
    const/16 v11, 0x100

    .line 90
    .line 91
    if-nez v9, :cond_6

    .line 92
    .line 93
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-eqz v9, :cond_5

    .line 98
    .line 99
    move v9, v11

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    const/16 v9, 0x80

    .line 102
    .line 103
    :goto_3
    or-int/2addr v8, v9

    .line 104
    :cond_6
    and-int/lit16 v9, v1, 0xc00

    .line 105
    .line 106
    if-nez v9, :cond_8

    .line 107
    .line 108
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    if-eqz v9, :cond_7

    .line 113
    .line 114
    const/16 v9, 0x800

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_7
    const/16 v9, 0x400

    .line 118
    .line 119
    :goto_4
    or-int/2addr v8, v9

    .line 120
    :cond_8
    and-int/lit16 v9, v1, 0x6000

    .line 121
    .line 122
    const/16 v12, 0x4000

    .line 123
    .line 124
    if-nez v9, :cond_a

    .line 125
    .line 126
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eqz v9, :cond_9

    .line 131
    .line 132
    move v9, v12

    .line 133
    goto :goto_5

    .line 134
    :cond_9
    const/16 v9, 0x2000

    .line 135
    .line 136
    :goto_5
    or-int/2addr v8, v9

    .line 137
    :cond_a
    const/high16 v9, 0x30000

    .line 138
    .line 139
    and-int/2addr v9, v1

    .line 140
    if-nez v9, :cond_d

    .line 141
    .line 142
    and-int/lit8 v9, p8, 0x20

    .line 143
    .line 144
    if-nez v9, :cond_b

    .line 145
    .line 146
    move-object/from16 v9, p5

    .line 147
    .line 148
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v13

    .line 152
    if-eqz v13, :cond_c

    .line 153
    .line 154
    const/high16 v13, 0x20000

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_b
    move-object/from16 v9, p5

    .line 158
    .line 159
    :cond_c
    const/high16 v13, 0x10000

    .line 160
    .line 161
    :goto_6
    or-int/2addr v8, v13

    .line 162
    :goto_7
    move/from16 v16, v8

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_d
    move-object/from16 v9, p5

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :goto_8
    const v8, 0x12493

    .line 169
    .line 170
    .line 171
    and-int v8, v16, v8

    .line 172
    .line 173
    const v13, 0x12492

    .line 174
    .line 175
    .line 176
    const/4 v4, 0x0

    .line 177
    if-eq v8, v13, :cond_e

    .line 178
    .line 179
    const/4 v8, 0x1

    .line 180
    goto :goto_9

    .line 181
    :cond_e
    move v8, v4

    .line 182
    :goto_9
    and-int/lit8 v13, v16, 0x1

    .line 183
    .line 184
    invoke-interface {v10, v8, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-eqz v8, :cond_30

    .line 189
    .line 190
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 191
    .line 192
    .line 193
    and-int/lit8 v8, v1, 0x1

    .line 194
    .line 195
    const v17, -0x70001

    .line 196
    .line 197
    .line 198
    if-eqz v8, :cond_11

    .line 199
    .line 200
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    if-eqz v8, :cond_f

    .line 205
    .line 206
    goto :goto_a

    .line 207
    :cond_f
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 208
    .line 209
    .line 210
    and-int/lit8 v6, p8, 0x20

    .line 211
    .line 212
    if-eqz v6, :cond_10

    .line 213
    .line 214
    and-int v16, v16, v17

    .line 215
    .line 216
    :cond_10
    move-object v6, v7

    .line 217
    move/from16 v7, v16

    .line 218
    .line 219
    goto/16 :goto_e

    .line 220
    .line 221
    :cond_11
    :goto_a
    if-eqz v6, :cond_12

    .line 222
    .line 223
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 224
    .line 225
    move-object/from16 v18, v6

    .line 226
    .line 227
    goto :goto_b

    .line 228
    :cond_12
    move-object/from16 v18, v7

    .line 229
    .line 230
    :goto_b
    and-int/lit8 v6, p8, 0x20

    .line 231
    .line 232
    if-eqz v6, :cond_14

    .line 233
    .line 234
    const v6, 0x70b323c8

    .line 235
    .line 236
    .line 237
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 238
    .line 239
    .line 240
    sget-object v6, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 241
    .line 242
    sget v7, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 243
    .line 244
    invoke-virtual {v6, v10, v7}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    if-eqz v7, :cond_15

    .line 249
    .line 250
    invoke-static {v7, v10, v4}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 251
    .line 252
    .line 253
    move-result-object v9

    .line 254
    const v6, 0x671a9c9b

    .line 255
    .line 256
    .line 257
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 258
    .line 259
    .line 260
    instance-of v6, v7, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 261
    .line 262
    if-eqz v6, :cond_13

    .line 263
    .line 264
    move-object v6, v7

    .line 265
    check-cast v6, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 266
    .line 267
    invoke-interface {v6}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    :goto_c
    move v8, v12

    .line 272
    goto :goto_d

    .line 273
    :cond_13
    sget-object v6, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 274
    .line 275
    goto :goto_c

    .line 276
    :goto_d
    const v12, 0x9048

    .line 277
    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    move-object/from16 v27, v10

    .line 281
    .line 282
    move-object v10, v6

    .line 283
    const-class v6, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 284
    .line 285
    move/from16 v19, v8

    .line 286
    .line 287
    const/4 v8, 0x0

    .line 288
    move-object/from16 v11, v27

    .line 289
    .line 290
    invoke-static/range {v6 .. v13}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    move-object v10, v11

    .line 295
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 296
    .line 297
    .line 298
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 299
    .line 300
    .line 301
    check-cast v6, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    .line 302
    .line 303
    and-int v16, v16, v17

    .line 304
    .line 305
    move-object v9, v6

    .line 306
    :cond_14
    move/from16 v7, v16

    .line 307
    .line 308
    move-object/from16 v6, v18

    .line 309
    .line 310
    goto :goto_e

    .line 311
    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 312
    .line 313
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 314
    .line 315
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v0

    .line 319
    :goto_e
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 320
    .line 321
    .line 322
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 323
    .line 324
    .line 325
    move-result v8

    .line 326
    if-eqz v8, :cond_16

    .line 327
    .line 328
    const/4 v8, -0x1

    .line 329
    const-string v11, "com.zykj.evaluation.ui.guide.noStem.GroupView (NoStemQuestionViews.kt:40)"

    .line 330
    .line 331
    invoke-static {v5, v7, v8, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 332
    .line 333
    .line 334
    :cond_16
    int-to-float v5, v15

    .line 335
    const/16 v8, 0x258

    .line 336
    .line 337
    int-to-float v8, v8

    .line 338
    div-float/2addr v5, v8

    .line 339
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 340
    .line 341
    .line 342
    move-result-object v11

    .line 343
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 348
    .line 349
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 350
    .line 351
    invoke-static {v12, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 352
    .line 353
    .line 354
    move-result v11

    .line 355
    int-to-float v11, v11

    .line 356
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 365
    .line 366
    div-float/2addr v11, v12

    .line 367
    mul-float/2addr v5, v11

    .line 368
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-static {v6, v5}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 377
    .line 378
    .line 379
    move-result-object v15

    .line 380
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 381
    .line 382
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 383
    .line 384
    .line 385
    move-result-wide v16

    .line 386
    const/16 v19, 0x2

    .line 387
    .line 388
    const/16 v20, 0x0

    .line 389
    .line 390
    const/16 v18, 0x0

    .line 391
    .line 392
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    const/4 v11, 0x5

    .line 397
    int-to-float v11, v11

    .line 398
    div-float v32, v11, v8

    .line 399
    .line 400
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 401
    .line 402
    .line 403
    move-result-object v11

    .line 404
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 405
    .line 406
    .line 407
    move-result-object v11

    .line 408
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 409
    .line 410
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 411
    .line 412
    invoke-static {v12, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 413
    .line 414
    .line 415
    move-result v11

    .line 416
    int-to-float v11, v11

    .line 417
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 418
    .line 419
    .line 420
    move-result-object v12

    .line 421
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 422
    .line 423
    .line 424
    move-result-object v12

    .line 425
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 426
    .line 427
    div-float/2addr v11, v12

    .line 428
    mul-float v11, v11, v32

    .line 429
    .line 430
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 431
    .line 432
    .line 433
    move-result v11

    .line 434
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 435
    .line 436
    .line 437
    move-result-object v12

    .line 438
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 439
    .line 440
    .line 441
    move-result-object v12

    .line 442
    iget v13, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 443
    .line 444
    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 445
    .line 446
    invoke-static {v13, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 447
    .line 448
    .line 449
    move-result v12

    .line 450
    int-to-float v12, v12

    .line 451
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 452
    .line 453
    .line 454
    move-result-object v13

    .line 455
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 456
    .line 457
    .line 458
    move-result-object v13

    .line 459
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 460
    .line 461
    div-float/2addr v12, v13

    .line 462
    mul-float v12, v12, v32

    .line 463
    .line 464
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 465
    .line 466
    .line 467
    move-result v12

    .line 468
    const/4 v13, 0x2

    .line 469
    int-to-float v13, v13

    .line 470
    div-float/2addr v13, v8

    .line 471
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 472
    .line 473
    .line 474
    move-result-object v15

    .line 475
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 476
    .line 477
    .line 478
    move-result-object v15

    .line 479
    iget v14, v15, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 480
    .line 481
    iget v15, v15, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 482
    .line 483
    invoke-static {v14, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 484
    .line 485
    .line 486
    move-result v14

    .line 487
    int-to-float v14, v14

    .line 488
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 489
    .line 490
    .line 491
    move-result-object v15

    .line 492
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 493
    .line 494
    .line 495
    move-result-object v15

    .line 496
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 497
    .line 498
    div-float/2addr v14, v15

    .line 499
    mul-float/2addr v13, v14

    .line 500
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 501
    .line 502
    .line 503
    move-result v13

    .line 504
    const/16 v14, 0x9

    .line 505
    .line 506
    int-to-float v14, v14

    .line 507
    div-float/2addr v14, v8

    .line 508
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 509
    .line 510
    .line 511
    move-result-object v15

    .line 512
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 513
    .line 514
    .line 515
    move-result-object v15

    .line 516
    iget v4, v15, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 517
    .line 518
    iget v15, v15, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 519
    .line 520
    invoke-static {v4, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    int-to-float v4, v4

    .line 525
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 526
    .line 527
    .line 528
    move-result-object v15

    .line 529
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 530
    .line 531
    .line 532
    move-result-object v15

    .line 533
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 534
    .line 535
    div-float/2addr v4, v15

    .line 536
    mul-float/2addr v4, v14

    .line 537
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 538
    .line 539
    .line 540
    move-result v4

    .line 541
    invoke-static {v5, v13, v11, v4, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 546
    .line 547
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 548
    .line 549
    .line 550
    move-result-object v11

    .line 551
    sget-object v34, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 552
    .line 553
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 554
    .line 555
    .line 556
    move-result-object v12

    .line 557
    const/4 v13, 0x0

    .line 558
    invoke-static {v11, v12, v10, v13}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 559
    .line 560
    .line 561
    move-result-object v11

    .line 562
    invoke-static {v10, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 563
    .line 564
    .line 565
    move-result v12

    .line 566
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 567
    .line 568
    .line 569
    move-result-object v13

    .line 570
    invoke-static {v10, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 571
    .line 572
    .line 573
    move-result-object v4

    .line 574
    sget-object v35, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 575
    .line 576
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 577
    .line 578
    .line 579
    move-result-object v15

    .line 580
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 581
    .line 582
    .line 583
    move-result-object v16

    .line 584
    if-nez v16, :cond_17

    .line 585
    .line 586
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 587
    .line 588
    .line 589
    :cond_17
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 590
    .line 591
    .line 592
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 593
    .line 594
    .line 595
    move-result v16

    .line 596
    if-eqz v16, :cond_18

    .line 597
    .line 598
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 599
    .line 600
    .line 601
    goto :goto_f

    .line 602
    :cond_18
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 603
    .line 604
    .line 605
    :goto_f
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 606
    .line 607
    .line 608
    move-result-object v15

    .line 609
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-static {v15, v11, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 617
    .line 618
    .line 619
    move-result-object v1

    .line 620
    invoke-static {v15, v13, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 628
    .line 629
    .line 630
    move-result v11

    .line 631
    if-nez v11, :cond_19

    .line 632
    .line 633
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v11

    .line 637
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 638
    .line 639
    .line 640
    move-result-object v13

    .line 641
    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v11

    .line 645
    if-nez v11, :cond_1a

    .line 646
    .line 647
    :cond_19
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 648
    .line 649
    .line 650
    move-result-object v11

    .line 651
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 655
    .line 656
    .line 657
    move-result-object v11

    .line 658
    invoke-interface {v15, v11, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 659
    .line 660
    .line 661
    :cond_1a
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    invoke-static {v15, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 666
    .line 667
    .line 668
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 669
    .line 670
    sget-object v15, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 671
    .line 672
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    iget v4, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 681
    .line 682
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 683
    .line 684
    invoke-static {v4, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 685
    .line 686
    .line 687
    move-result v1

    .line 688
    int-to-float v1, v1

    .line 689
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 698
    .line 699
    div-float/2addr v1, v4

    .line 700
    mul-float/2addr v14, v1

    .line 701
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 702
    .line 703
    .line 704
    move-result v16

    .line 705
    const/16 v20, 0xe

    .line 706
    .line 707
    const/16 v21, 0x0

    .line 708
    .line 709
    const/16 v17, 0x0

    .line 710
    .line 711
    const/16 v18, 0x0

    .line 712
    .line 713
    const/16 v19, 0x0

    .line 714
    .line 715
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    move-object v4, v15

    .line 720
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getBottom()Landroidx/compose/ui/Alignment$Vertical;

    .line 721
    .line 722
    .line 723
    move-result-object v11

    .line 724
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 725
    .line 726
    .line 727
    move-result-object v5

    .line 728
    const/16 v12, 0x30

    .line 729
    .line 730
    invoke-static {v5, v11, v10, v12}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 731
    .line 732
    .line 733
    move-result-object v5

    .line 734
    const/4 v13, 0x0

    .line 735
    invoke-static {v10, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 736
    .line 737
    .line 738
    move-result v11

    .line 739
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 740
    .line 741
    .line 742
    move-result-object v12

    .line 743
    invoke-static {v10, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 744
    .line 745
    .line 746
    move-result-object v1

    .line 747
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 748
    .line 749
    .line 750
    move-result-object v13

    .line 751
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 752
    .line 753
    .line 754
    move-result-object v14

    .line 755
    if-nez v14, :cond_1b

    .line 756
    .line 757
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 758
    .line 759
    .line 760
    :cond_1b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 761
    .line 762
    .line 763
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 764
    .line 765
    .line 766
    move-result v14

    .line 767
    if-eqz v14, :cond_1c

    .line 768
    .line 769
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 770
    .line 771
    .line 772
    goto :goto_10

    .line 773
    :cond_1c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 774
    .line 775
    .line 776
    :goto_10
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 777
    .line 778
    .line 779
    move-result-object v13

    .line 780
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 781
    .line 782
    .line 783
    move-result-object v14

    .line 784
    invoke-static {v13, v5, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 788
    .line 789
    .line 790
    move-result-object v5

    .line 791
    invoke-static {v13, v12, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 795
    .line 796
    .line 797
    move-result-object v5

    .line 798
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 799
    .line 800
    .line 801
    move-result v12

    .line 802
    if-nez v12, :cond_1d

    .line 803
    .line 804
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v12

    .line 808
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 809
    .line 810
    .line 811
    move-result-object v14

    .line 812
    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v12

    .line 816
    if-nez v12, :cond_1e

    .line 817
    .line 818
    :cond_1d
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 819
    .line 820
    .line 821
    move-result-object v12

    .line 822
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 823
    .line 824
    .line 825
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 826
    .line 827
    .line 828
    move-result-object v11

    .line 829
    invoke-interface {v13, v11, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 830
    .line 831
    .line 832
    :cond_1e
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 833
    .line 834
    .line 835
    move-result-object v5

    .line 836
    invoke-static {v13, v1, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 837
    .line 838
    .line 839
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 840
    .line 841
    const/16 v1, 0x113

    .line 842
    .line 843
    int-to-float v1, v1

    .line 844
    div-float/2addr v1, v8

    .line 845
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 846
    .line 847
    .line 848
    move-result-object v5

    .line 849
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 850
    .line 851
    .line 852
    move-result-object v5

    .line 853
    iget v8, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 854
    .line 855
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 856
    .line 857
    invoke-static {v8, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 858
    .line 859
    .line 860
    move-result v5

    .line 861
    int-to-float v5, v5

    .line 862
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 863
    .line 864
    .line 865
    move-result-object v8

    .line 866
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 867
    .line 868
    .line 869
    move-result-object v8

    .line 870
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 871
    .line 872
    div-float/2addr v5, v8

    .line 873
    mul-float/2addr v1, v5

    .line 874
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 875
    .line 876
    .line 877
    move-result v1

    .line 878
    const/4 v5, 0x0

    .line 879
    const/4 v8, 0x0

    .line 880
    const/4 v11, 0x1

    .line 881
    invoke-static {v4, v5, v1, v11, v8}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 882
    .line 883
    .line 884
    move-result-object v1

    .line 885
    move-object/from16 v18, v6

    .line 886
    .line 887
    invoke-virtual {v2}, Li6/b;->f()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v6

    .line 891
    move-object v12, v8

    .line 892
    move-object v5, v9

    .line 893
    invoke-static {}, Ld7/a;->a()J

    .line 894
    .line 895
    .line 896
    move-result-wide v8

    .line 897
    const/16 v13, 0x8

    .line 898
    .line 899
    invoke-static {v13}, Lo5/e;->k(I)J

    .line 900
    .line 901
    .line 902
    move-result-wide v13

    .line 903
    sget-object v36, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 904
    .line 905
    move-object/from16 v27, v10

    .line 906
    .line 907
    move-wide/from16 v42, v13

    .line 908
    .line 909
    move v14, v11

    .line 910
    move-wide/from16 v10, v42

    .line 911
    .line 912
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    .line 913
    .line 914
    .line 915
    move-result-object v13

    .line 916
    sget-object v37, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 917
    .line 918
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 919
    .line 920
    .line 921
    move-result v21

    .line 922
    const/16 v29, 0xc30

    .line 923
    .line 924
    const v30, 0x1d7d0

    .line 925
    .line 926
    .line 927
    move-object v15, v12

    .line 928
    const/4 v12, 0x0

    .line 929
    move/from16 v16, v14

    .line 930
    .line 931
    const/4 v14, 0x0

    .line 932
    move-object/from16 v17, v15

    .line 933
    .line 934
    move/from16 v19, v16

    .line 935
    .line 936
    const-wide/16 v15, 0x0

    .line 937
    .line 938
    move-object/from16 v20, v17

    .line 939
    .line 940
    const/16 v17, 0x0

    .line 941
    .line 942
    move-object/from16 v22, v18

    .line 943
    .line 944
    const/16 v18, 0x0

    .line 945
    .line 946
    move/from16 v24, v19

    .line 947
    .line 948
    move-object/from16 v23, v20

    .line 949
    .line 950
    const-wide/16 v19, 0x0

    .line 951
    .line 952
    move-object/from16 v25, v22

    .line 953
    .line 954
    const/16 v22, 0x0

    .line 955
    .line 956
    move-object/from16 v26, v23

    .line 957
    .line 958
    const/16 v23, 0x1

    .line 959
    .line 960
    move/from16 v28, v24

    .line 961
    .line 962
    const/16 v24, 0x0

    .line 963
    .line 964
    move-object/from16 v38, v25

    .line 965
    .line 966
    const/16 v25, 0x0

    .line 967
    .line 968
    move-object/from16 v39, v26

    .line 969
    .line 970
    const/16 v26, 0x0

    .line 971
    .line 972
    move/from16 v40, v28

    .line 973
    .line 974
    const v28, 0x30db0

    .line 975
    .line 976
    .line 977
    move-object/from16 v41, v5

    .line 978
    .line 979
    move v5, v7

    .line 980
    move-object/from16 v3, v39

    .line 981
    .line 982
    move-object v7, v1

    .line 983
    move/from16 v1, v40

    .line 984
    .line 985
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v2}, Li6/b;->d()Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v6

    .line 992
    invoke-static {}, Ld7/a;->a()J

    .line 993
    .line 994
    .line 995
    move-result-wide v8

    .line 996
    const/16 v39, 0x7

    .line 997
    .line 998
    invoke-static/range {v39 .. v39}, Lo5/e;->k(I)J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v10

    .line 1002
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v13

    .line 1006
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 1007
    .line 1008
    .line 1009
    move-result v21

    .line 1010
    const v30, 0x1d7d2

    .line 1011
    .line 1012
    .line 1013
    const/4 v7, 0x0

    .line 1014
    const v28, 0x30d80

    .line 1015
    .line 1016
    .line 1017
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1018
    .line 1019
    .line 1020
    move-object/from16 v10, v27

    .line 1021
    .line 1022
    invoke-virtual {v2}, Li6/b;->c()Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v6

    .line 1026
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 1027
    .line 1028
    .line 1029
    move-result v6

    .line 1030
    const/4 v7, 0x6

    .line 1031
    if-lez v6, :cond_26

    .line 1032
    .line 1033
    const v6, -0x20311352

    .line 1034
    .line 1035
    .line 1036
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1037
    .line 1038
    .line 1039
    const v6, 0xe000

    .line 1040
    .line 1041
    .line 1042
    and-int/2addr v6, v5

    .line 1043
    const/16 v8, 0x4000

    .line 1044
    .line 1045
    if-ne v6, v8, :cond_1f

    .line 1046
    .line 1047
    move v14, v1

    .line 1048
    goto :goto_11

    .line 1049
    :cond_1f
    const/4 v14, 0x0

    .line 1050
    :goto_11
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v6

    .line 1054
    or-int/2addr v6, v14

    .line 1055
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v8

    .line 1059
    if-nez v6, :cond_20

    .line 1060
    .line 1061
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1062
    .line 1063
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v6

    .line 1067
    if-ne v8, v6, :cond_21

    .line 1068
    .line 1069
    :cond_20
    new-instance v8, Li6/m;

    .line 1070
    .line 1071
    invoke-direct {v8, v0, v2}, Li6/m;-><init>(Lkotlin/jvm/functions/Function1;Li6/b;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1075
    .line 1076
    .line 1077
    :cond_21
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 1078
    .line 1079
    const/4 v6, 0x0

    .line 1080
    invoke-static {v4, v6, v8, v1, v3}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v3

    .line 1084
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v8

    .line 1088
    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v8

    .line 1092
    invoke-static {v10, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1093
    .line 1094
    .line 1095
    move-result v9

    .line 1096
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v11

    .line 1100
    invoke-static {v10, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v3

    .line 1104
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v12

    .line 1108
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v13

    .line 1112
    if-nez v13, :cond_22

    .line 1113
    .line 1114
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1115
    .line 1116
    .line 1117
    :cond_22
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1118
    .line 1119
    .line 1120
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1121
    .line 1122
    .line 1123
    move-result v13

    .line 1124
    if-eqz v13, :cond_23

    .line 1125
    .line 1126
    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 1127
    .line 1128
    .line 1129
    goto :goto_12

    .line 1130
    :cond_23
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1131
    .line 1132
    .line 1133
    :goto_12
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v12

    .line 1137
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v13

    .line 1141
    invoke-static {v12, v8, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v8

    .line 1148
    invoke-static {v12, v11, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v8

    .line 1155
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1156
    .line 1157
    .line 1158
    move-result v11

    .line 1159
    if-nez v11, :cond_24

    .line 1160
    .line 1161
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v11

    .line 1165
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v13

    .line 1169
    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v11

    .line 1173
    if-nez v11, :cond_25

    .line 1174
    .line 1175
    :cond_24
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v11

    .line 1179
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1180
    .line 1181
    .line 1182
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v9

    .line 1186
    invoke-interface {v12, v9, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1187
    .line 1188
    .line 1189
    :cond_25
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v8

    .line 1193
    invoke-static {v12, v3, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1194
    .line 1195
    .line 1196
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1197
    .line 1198
    const v3, 0x7f12017b

    .line 1199
    .line 1200
    .line 1201
    invoke-static {v3, v10, v7}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v3

    .line 1205
    invoke-static {}, Ld7/a;->i()J

    .line 1206
    .line 1207
    .line 1208
    move-result-wide v8

    .line 1209
    invoke-static/range {v39 .. v39}, Lo5/e;->k(I)J

    .line 1210
    .line 1211
    .line 1212
    move-result-wide v11

    .line 1213
    const/16 v29, 0x0

    .line 1214
    .line 1215
    const v30, 0x1fff2

    .line 1216
    .line 1217
    .line 1218
    move v13, v7

    .line 1219
    const/4 v7, 0x0

    .line 1220
    move-object/from16 v27, v10

    .line 1221
    .line 1222
    move-wide v10, v11

    .line 1223
    const/4 v12, 0x0

    .line 1224
    move v14, v13

    .line 1225
    const/4 v13, 0x0

    .line 1226
    move v15, v14

    .line 1227
    const/4 v14, 0x0

    .line 1228
    move/from16 v17, v15

    .line 1229
    .line 1230
    const-wide/16 v15, 0x0

    .line 1231
    .line 1232
    move/from16 v18, v17

    .line 1233
    .line 1234
    const/16 v17, 0x0

    .line 1235
    .line 1236
    move/from16 v19, v18

    .line 1237
    .line 1238
    const/16 v18, 0x0

    .line 1239
    .line 1240
    move/from16 v21, v19

    .line 1241
    .line 1242
    const-wide/16 v19, 0x0

    .line 1243
    .line 1244
    move/from16 v22, v21

    .line 1245
    .line 1246
    const/16 v21, 0x0

    .line 1247
    .line 1248
    move/from16 v23, v22

    .line 1249
    .line 1250
    const/16 v22, 0x0

    .line 1251
    .line 1252
    move/from16 v24, v23

    .line 1253
    .line 1254
    const/16 v23, 0x0

    .line 1255
    .line 1256
    move/from16 v25, v24

    .line 1257
    .line 1258
    const/16 v24, 0x0

    .line 1259
    .line 1260
    move/from16 v26, v25

    .line 1261
    .line 1262
    const/16 v25, 0x0

    .line 1263
    .line 1264
    move/from16 v28, v26

    .line 1265
    .line 1266
    const/16 v26, 0x0

    .line 1267
    .line 1268
    move/from16 v31, v28

    .line 1269
    .line 1270
    const/16 v28, 0xd80

    .line 1271
    .line 1272
    move/from16 v33, v6

    .line 1273
    .line 1274
    move-object v6, v3

    .line 1275
    move/from16 v3, v31

    .line 1276
    .line 1277
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1278
    .line 1279
    .line 1280
    move-object/from16 v10, v27

    .line 1281
    .line 1282
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1283
    .line 1284
    .line 1285
    :goto_13
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1286
    .line 1287
    .line 1288
    goto :goto_14

    .line 1289
    :cond_26
    move v3, v7

    .line 1290
    const/16 v33, 0x0

    .line 1291
    .line 1292
    const v6, -0x20581ac4

    .line 1293
    .line 1294
    .line 1295
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1296
    .line 1297
    .line 1298
    goto :goto_13

    .line 1299
    :goto_14
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1300
    .line 1301
    .line 1302
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v6

    .line 1306
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v6

    .line 1310
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1311
    .line 1312
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1313
    .line 1314
    invoke-static {v7, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 1315
    .line 1316
    .line 1317
    move-result v6

    .line 1318
    int-to-float v6, v6

    .line 1319
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v7

    .line 1323
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v7

    .line 1327
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 1328
    .line 1329
    div-float/2addr v6, v7

    .line 1330
    mul-float v32, v32, v6

    .line 1331
    .line 1332
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1333
    .line 1334
    .line 1335
    move-result v6

    .line 1336
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v4

    .line 1340
    invoke-static {v4, v10, v3}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1341
    .line 1342
    .line 1343
    const v3, -0x288e7156

    .line 1344
    .line 1345
    .line 1346
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v2}, Li6/b;->e()Ljava/util/List;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v3

    .line 1353
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v3

    .line 1357
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1358
    .line 1359
    .line 1360
    move-result v4

    .line 1361
    if-eqz v4, :cond_2e

    .line 1362
    .line 1363
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v4

    .line 1367
    check-cast v4, Li6/l;

    .line 1368
    .line 1369
    move-object/from16 v13, v41

    .line 1370
    .line 1371
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1372
    .line 1373
    .line 1374
    move-result v6

    .line 1375
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1376
    .line 1377
    .line 1378
    move-result v7

    .line 1379
    or-int/2addr v6, v7

    .line 1380
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v7

    .line 1384
    if-nez v6, :cond_27

    .line 1385
    .line 1386
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1387
    .line 1388
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v6

    .line 1392
    if-ne v7, v6, :cond_28

    .line 1393
    .line 1394
    :cond_27
    new-instance v7, Li6/x;

    .line 1395
    .line 1396
    invoke-direct {v7, v13, v4}, Li6/x;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;)V

    .line 1397
    .line 1398
    .line 1399
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1400
    .line 1401
    .line 1402
    :cond_28
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1403
    .line 1404
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1405
    .line 1406
    .line 1407
    move-result v6

    .line 1408
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v8

    .line 1412
    or-int/2addr v6, v8

    .line 1413
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v8

    .line 1417
    if-nez v6, :cond_29

    .line 1418
    .line 1419
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1420
    .line 1421
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v6

    .line 1425
    if-ne v8, v6, :cond_2a

    .line 1426
    .line 1427
    :cond_29
    new-instance v8, Li6/c0;

    .line 1428
    .line 1429
    invoke-direct {v8, v13, v4}, Li6/c0;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;)V

    .line 1430
    .line 1431
    .line 1432
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1433
    .line 1434
    .line 1435
    :cond_2a
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 1436
    .line 1437
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1438
    .line 1439
    .line 1440
    move-result v6

    .line 1441
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1442
    .line 1443
    .line 1444
    move-result v9

    .line 1445
    or-int/2addr v6, v9

    .line 1446
    and-int/lit16 v9, v5, 0x380

    .line 1447
    .line 1448
    const/16 v14, 0x100

    .line 1449
    .line 1450
    if-ne v9, v14, :cond_2b

    .line 1451
    .line 1452
    move v9, v1

    .line 1453
    goto :goto_16

    .line 1454
    :cond_2b
    move/from16 v9, v33

    .line 1455
    .line 1456
    :goto_16
    or-int/2addr v6, v9

    .line 1457
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v9

    .line 1461
    if-nez v6, :cond_2d

    .line 1462
    .line 1463
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1464
    .line 1465
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v6

    .line 1469
    if-ne v9, v6, :cond_2c

    .line 1470
    .line 1471
    goto :goto_17

    .line 1472
    :cond_2c
    move-object/from16 v15, p2

    .line 1473
    .line 1474
    goto :goto_18

    .line 1475
    :cond_2d
    :goto_17
    new-instance v9, Li6/d0;

    .line 1476
    .line 1477
    move-object/from16 v15, p2

    .line 1478
    .line 1479
    invoke-direct {v9, v13, v4, v15}, Li6/d0;-><init>(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Lkotlin/jvm/functions/Function3;)V

    .line 1480
    .line 1481
    .line 1482
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1483
    .line 1484
    .line 1485
    :goto_18
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 1486
    .line 1487
    shr-int/lit8 v6, v5, 0x3

    .line 1488
    .line 1489
    and-int/lit16 v11, v6, 0x380

    .line 1490
    .line 1491
    const/4 v12, 0x1

    .line 1492
    move/from16 v16, v5

    .line 1493
    .line 1494
    move-object v5, v4

    .line 1495
    const/4 v4, 0x0

    .line 1496
    move-object/from16 v6, p3

    .line 1497
    .line 1498
    invoke-static/range {v4 .. v12}, Li6/k0;->R(Landroidx/compose/ui/Modifier;Li6/l;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 1499
    .line 1500
    .line 1501
    move-object/from16 v41, v13

    .line 1502
    .line 1503
    move/from16 v5, v16

    .line 1504
    .line 1505
    goto/16 :goto_15

    .line 1506
    .line 1507
    :cond_2e
    move-object/from16 v15, p2

    .line 1508
    .line 1509
    move-object/from16 v27, v10

    .line 1510
    .line 1511
    move-object/from16 v13, v41

    .line 1512
    .line 1513
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1514
    .line 1515
    .line 1516
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1517
    .line 1518
    .line 1519
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1520
    .line 1521
    .line 1522
    move-result v1

    .line 1523
    if-eqz v1, :cond_2f

    .line 1524
    .line 1525
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1526
    .line 1527
    .line 1528
    :cond_2f
    move-object v6, v13

    .line 1529
    move-object/from16 v1, v38

    .line 1530
    .line 1531
    goto :goto_19

    .line 1532
    :cond_30
    move-object v15, v3

    .line 1533
    move-object/from16 v27, v10

    .line 1534
    .line 1535
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1536
    .line 1537
    .line 1538
    move-object v1, v7

    .line 1539
    move-object v6, v9

    .line 1540
    :goto_19
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v9

    .line 1544
    if-eqz v9, :cond_31

    .line 1545
    .line 1546
    new-instance v0, Li6/e0;

    .line 1547
    .line 1548
    move-object/from16 v4, p3

    .line 1549
    .line 1550
    move-object/from16 v5, p4

    .line 1551
    .line 1552
    move/from16 v7, p7

    .line 1553
    .line 1554
    move/from16 v8, p8

    .line 1555
    .line 1556
    move-object v3, v15

    .line 1557
    invoke-direct/range {v0 .. v8}, Li6/e0;-><init>(Landroidx/compose/ui/Modifier;Li6/b;Lkotlin/jvm/functions/Function3;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;II)V

    .line 1558
    .line 1559
    .line 1560
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1561
    .line 1562
    .line 1563
    :cond_31
    return-void
.end method

.method public static final C(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Z)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-virtual {p1}, Li6/l;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, v0, v1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->Y(JZ)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final D(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Li6/l;->i()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;->c0(Ljava/lang/String;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final E(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Lkotlin/jvm/functions/Function3;Z)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->p()Lg7/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Li6/l;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p1}, Li6/l;->i()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0, v0, v1, v2}, Lg7/e;->l(JLjava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1}, Li6/l;->i()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-interface {p2, p1, p0, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method

.method public static final F(Lkotlin/jvm/functions/Function1;Li6/b;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p1}, Li6/b;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final G(Landroidx/compose/ui/Modifier;Li6/b;Lkotlin/jvm/functions/Function3;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    .line 1
    or-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v8

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-object v6, p5

    .line 13
    move/from16 v9, p7

    .line 14
    .line 15
    move-object/from16 v7, p8

    .line 16
    .line 17
    invoke-static/range {v1 .. v9}, Li6/k0;->B(Landroidx/compose/ui/Modifier;Li6/b;Lkotlin/jvm/functions/Function3;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Landroidx/compose/runtime/Composer;II)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method

.method public static final H(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v15, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move/from16 v2, p4

    .line 8
    .line 9
    const v3, -0x6956391a

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p3

    .line 13
    .line 14
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v11

    .line 18
    and-int/lit8 v4, v2, 0x6

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v4, v5

    .line 32
    :goto_0
    or-int/2addr v4, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v4, v2

    .line 35
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 36
    .line 37
    if-nez v6, :cond_3

    .line 38
    .line 39
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    const/16 v6, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v6, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v4, v6

    .line 51
    :cond_3
    and-int/lit16 v6, v2, 0x180

    .line 52
    .line 53
    const/16 v7, 0x100

    .line 54
    .line 55
    if-nez v6, :cond_5

    .line 56
    .line 57
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    move v6, v7

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v6, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v4, v6

    .line 68
    :cond_5
    and-int/lit16 v6, v4, 0x93

    .line 69
    .line 70
    const/16 v8, 0x92

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x1

    .line 74
    if-eq v6, v8, :cond_6

    .line 75
    .line 76
    move v6, v10

    .line 77
    goto :goto_4

    .line 78
    :cond_6
    move v6, v9

    .line 79
    :goto_4
    and-int/lit8 v8, v4, 0x1

    .line 80
    .line 81
    invoke-interface {v11, v6, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_10

    .line 86
    .line 87
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_7

    .line 92
    .line 93
    const/4 v6, -0x1

    .line 94
    const-string v8, "com.zykj.evaluation.ui.guide.noStem.HandQuestionView (NoStemQuestionViews.kt:315)"

    .line 95
    .line 96
    invoke-static {v3, v4, v6, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_7
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 100
    .line 101
    const/16 v6, 0x60

    .line 102
    .line 103
    int-to-float v6, v6

    .line 104
    const/16 v8, 0x258

    .line 105
    .line 106
    int-to-float v8, v8

    .line 107
    div-float/2addr v6, v8

    .line 108
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    iget v13, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 117
    .line 118
    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 119
    .line 120
    invoke-static {v13, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    int-to-float v12, v12

    .line 125
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 134
    .line 135
    div-float/2addr v12, v13

    .line 136
    mul-float/2addr v6, v12

    .line 137
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    const/4 v12, 0x0

    .line 142
    const/4 v13, 0x0

    .line 143
    invoke-static {v3, v12, v6, v10, v13}, Landroidx/compose/foundation/layout/SizeKt;->defaultMinSize-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 144
    .line 145
    .line 146
    move-result-object v16

    .line 147
    int-to-float v6, v10

    .line 148
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 149
    .line 150
    .line 151
    move-result v17

    .line 152
    if-eqz v15, :cond_8

    .line 153
    .line 154
    const-wide v18, 0xffff3b30L

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    :goto_5
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v18

    .line 163
    goto :goto_6

    .line 164
    :cond_8
    const-wide v18, 0xffdcdee0L

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :goto_6
    int-to-float v5, v5

    .line 171
    div-float/2addr v5, v8

    .line 172
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 181
    .line 182
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 183
    .line 184
    invoke-static {v8, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    int-to-float v6, v6

    .line 189
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 198
    .line 199
    div-float/2addr v6, v8

    .line 200
    mul-float/2addr v6, v5

    .line 201
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    invoke-static {v6}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 206
    .line 207
    .line 208
    move-result-object v20

    .line 209
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 218
    .line 219
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 220
    .line 221
    invoke-static {v8, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    int-to-float v6, v6

    .line 226
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 235
    .line 236
    div-float/2addr v6, v8

    .line 237
    mul-float/2addr v6, v5

    .line 238
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 239
    .line 240
    .line 241
    move-result v21

    .line 242
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 251
    .line 252
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 253
    .line 254
    invoke-static {v8, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    int-to-float v6, v6

    .line 259
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 268
    .line 269
    div-float/2addr v6, v8

    .line 270
    mul-float/2addr v6, v5

    .line 271
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 272
    .line 273
    .line 274
    move-result v22

    .line 275
    invoke-static/range {v16 .. v22}, LDashedBorderKt;->d(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;FF)Landroidx/compose/ui/Modifier;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    iget v14, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 288
    .line 289
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 290
    .line 291
    invoke-static {v14, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    int-to-float v8, v8

    .line 296
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 301
    .line 302
    .line 303
    move-result-object v14

    .line 304
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 305
    .line 306
    div-float/2addr v8, v14

    .line 307
    mul-float/2addr v5, v8

    .line 308
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    and-int/lit16 v6, v4, 0x380

    .line 317
    .line 318
    if-ne v6, v7, :cond_9

    .line 319
    .line 320
    move v6, v10

    .line 321
    goto :goto_7

    .line 322
    :cond_9
    move v6, v9

    .line 323
    :goto_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    if-nez v6, :cond_a

    .line 328
    .line 329
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 330
    .line 331
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    if-ne v7, v6, :cond_b

    .line 336
    .line 337
    :cond_a
    new-instance v7, Li6/r;

    .line 338
    .line 339
    invoke-direct {v7, v1}, Li6/r;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 346
    .line 347
    invoke-static {v5, v9, v7, v10, v13}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 352
    .line 353
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    invoke-static {v11, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 366
    .line 367
    .line 368
    move-result-object v8

    .line 369
    invoke-static {v11, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 374
    .line 375
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 376
    .line 377
    .line 378
    move-result-object v14

    .line 379
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 380
    .line 381
    .line 382
    move-result-object v16

    .line 383
    if-nez v16, :cond_c

    .line 384
    .line 385
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 386
    .line 387
    .line 388
    :cond_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 389
    .line 390
    .line 391
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 392
    .line 393
    .line 394
    move-result v16

    .line 395
    if-eqz v16, :cond_d

    .line 396
    .line 397
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 398
    .line 399
    .line 400
    goto :goto_8

    .line 401
    :cond_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 402
    .line 403
    .line 404
    :goto_8
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 405
    .line 406
    .line 407
    move-result-object v14

    .line 408
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 409
    .line 410
    .line 411
    move-result-object v10

    .line 412
    invoke-static {v14, v6, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 416
    .line 417
    .line 418
    move-result-object v6

    .line 419
    invoke-static {v14, v8, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 427
    .line 428
    .line 429
    move-result v8

    .line 430
    if-nez v8, :cond_e

    .line 431
    .line 432
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v8

    .line 436
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v8

    .line 444
    if-nez v8, :cond_f

    .line 445
    .line 446
    :cond_e
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 454
    .line 455
    .line 456
    move-result-object v7

    .line 457
    invoke-interface {v14, v7, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 458
    .line 459
    .line 460
    :cond_f
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    invoke-static {v14, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 465
    .line 466
    .line 467
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 468
    .line 469
    const/4 v5, 0x1

    .line 470
    invoke-static {v3, v12, v5, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    sget-object v5, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 475
    .line 476
    invoke-virtual {v5}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFillWidth()Landroidx/compose/ui/layout/ContentScale;

    .line 477
    .line 478
    .line 479
    move-result-object v6

    .line 480
    and-int/lit8 v4, v4, 0xe

    .line 481
    .line 482
    const v5, 0x1801b0

    .line 483
    .line 484
    .line 485
    or-int v12, v4, v5

    .line 486
    .line 487
    const/4 v13, 0x0

    .line 488
    const/16 v14, 0x7b8

    .line 489
    .line 490
    const/4 v1, 0x0

    .line 491
    move-object v2, v3

    .line 492
    const/4 v3, 0x0

    .line 493
    const/4 v4, 0x0

    .line 494
    const/4 v5, 0x0

    .line 495
    const/4 v7, 0x0

    .line 496
    const/4 v8, 0x0

    .line 497
    const/4 v9, 0x0

    .line 498
    const/4 v10, 0x0

    .line 499
    invoke-static/range {v0 .. v14}, Lcoil3/compose/c;->a(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;III)V

    .line 500
    .line 501
    .line 502
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 503
    .line 504
    .line 505
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-eqz v1, :cond_11

    .line 510
    .line 511
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 512
    .line 513
    .line 514
    goto :goto_9

    .line 515
    :cond_10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 516
    .line 517
    .line 518
    :cond_11
    :goto_9
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    if-eqz v1, :cond_12

    .line 523
    .line 524
    new-instance v2, Li6/s;

    .line 525
    .line 526
    move-object/from16 v3, p2

    .line 527
    .line 528
    move/from16 v4, p4

    .line 529
    .line 530
    invoke-direct {v2, v0, v15, v3, v4}, Li6/s;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;I)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 534
    .line 535
    .line 536
    :cond_12
    return-void
.end method

.method public static final I(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final J(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-static {p0, p1, p2, p4, p3}, Li6/k0;->H(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final K(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const v0, 0x565c58

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    and-int/lit8 p3, p4, 0x6

    .line 9
    .line 10
    if-nez p3, :cond_1

    .line 11
    .line 12
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    const/4 p3, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p3, 0x2

    .line 21
    :goto_0
    or-int/2addr p3, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p3, p4

    .line 24
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v8, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr p3, v1

    .line 40
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 41
    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    invoke-interface {v8, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    const/16 v1, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v1, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr p3, v1

    .line 56
    :cond_5
    and-int/lit16 v1, p3, 0x93

    .line 57
    .line 58
    const/16 v2, 0x92

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    if-eq v1, v2, :cond_6

    .line 62
    .line 63
    move v1, v3

    .line 64
    goto :goto_4

    .line 65
    :cond_6
    const/4 v1, 0x0

    .line 66
    :goto_4
    and-int/lit8 v2, p3, 0x1

    .line 67
    .line 68
    invoke-interface {v8, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_8

    .line 73
    .line 74
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_7

    .line 79
    .line 80
    const/4 v1, -0x1

    .line 81
    const-string v2, "com.zykj.evaluation.ui.guide.noStem.MultiQuestionView (NoStemQuestionViews.kt:242)"

    .line 82
    .line 83
    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_7
    sget-object p3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-static {p3, v0, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    sget-object p3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 95
    .line 96
    const/4 v0, 0x5

    .line 97
    int-to-float v0, v0

    .line 98
    const/16 v2, 0x258

    .line 99
    .line 100
    int-to-float v2, v2

    .line 101
    div-float/2addr v0, v2

    .line 102
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget v4, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 111
    .line 112
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 113
    .line 114
    invoke-static {v4, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    int-to-float v2, v2

    .line 119
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 128
    .line 129
    div-float/2addr v2, v4

    .line 130
    mul-float/2addr v2, v0

    .line 131
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {p3, v2}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 148
    .line 149
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 150
    .line 151
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    int-to-float v4, v4

    .line 156
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 165
    .line 166
    div-float/2addr v4, v5

    .line 167
    mul-float/2addr v0, v4

    .line 168
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-virtual {p3, v0}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    new-instance v0, Li6/v;

    .line 177
    .line 178
    invoke-direct {v0, p0, p1, p2}, Li6/v;-><init>(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 179
    .line 180
    .line 181
    const/16 v4, 0x36

    .line 182
    .line 183
    const v5, -0x3f9e69ed

    .line 184
    .line 185
    .line 186
    invoke-static {v5, v3, v0, v8, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    const v9, 0x1801b6

    .line 191
    .line 192
    .line 193
    const/16 v10, 0x38

    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    const/4 v5, 0x0

    .line 197
    const/4 v6, 0x0

    .line 198
    move-object v3, p3

    .line 199
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 203
    .line 204
    .line 205
    move-result p3

    .line 206
    if-eqz p3, :cond_9

    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_8
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 213
    .line 214
    .line 215
    :cond_9
    :goto_5
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    if-eqz p3, :cond_a

    .line 220
    .line 221
    new-instance v0, Li6/w;

    .line 222
    .line 223
    invoke-direct {v0, p0, p1, p2, p4}, Li6/w;-><init>(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)V

    .line 224
    .line 225
    .line 226
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    :cond_a
    return-void
.end method

.method public static final L(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 3

    .line 1
    const-string v0, "$this$FlowRow"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    and-int/lit8 p3, p5, 0x11

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eq p3, v0, :cond_0

    .line 12
    .line 13
    const/4 p3, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p3, v1

    .line 16
    :goto_0
    and-int/lit8 v0, p5, 0x1

    .line 17
    .line 18
    invoke-interface {p4, p3, v0}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-eqz p3, :cond_5

    .line 23
    .line 24
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_1

    .line 29
    .line 30
    const/4 p3, -0x1

    .line 31
    const-string v0, "com.zykj.evaluation.ui.guide.noStem.MultiQuestionView.<anonymous> (NoStemQuestionViews.kt:248)"

    .line 32
    .line 33
    const v2, -0x3f9e69ed

    .line 34
    .line 35
    .line 36
    invoke-static {v2, p5, p3, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-eqz p3, :cond_4

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    check-cast p3, Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p5

    .line 59
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    or-int/2addr v0, v2

    .line 68
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-ne v2, v0, :cond_3

    .line 81
    .line 82
    :cond_2
    new-instance v2, Li6/z;

    .line 83
    .line 84
    invoke-direct {v2, p2, p3}, Li6/z;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 91
    .line 92
    invoke-static {p3, p5, v2, p4, v1}, Li6/k0;->O(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_6

    .line 101
    .line 102
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 107
    .line 108
    .line 109
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0
.end method

.method public static final M(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final N(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-static {p0, p1, p2, p4, p3}, Li6/k0;->K(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final O(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v15, p4

    .line 8
    .line 9
    const v3, -0x1843f79a

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p3

    .line 13
    .line 14
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v12

    .line 18
    and-int/lit8 v4, v15, 0x6

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v4, v5

    .line 32
    :goto_0
    or-int/2addr v4, v15

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v4, v15

    .line 35
    :goto_1
    and-int/lit8 v6, v15, 0x30

    .line 36
    .line 37
    if-nez v6, :cond_3

    .line 38
    .line 39
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    const/16 v6, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v6, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v4, v6

    .line 51
    :cond_3
    and-int/lit16 v6, v15, 0x180

    .line 52
    .line 53
    if-nez v6, :cond_5

    .line 54
    .line 55
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_4

    .line 60
    .line 61
    const/16 v6, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v6, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v4, v6

    .line 67
    :cond_5
    and-int/lit16 v6, v4, 0x93

    .line 68
    .line 69
    const/16 v7, 0x92

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x1

    .line 73
    if-eq v6, v7, :cond_6

    .line 74
    .line 75
    move v6, v9

    .line 76
    goto :goto_4

    .line 77
    :cond_6
    move v6, v8

    .line 78
    :goto_4
    and-int/lit8 v7, v4, 0x1

    .line 79
    .line 80
    invoke-interface {v12, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_9

    .line 85
    .line 86
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-eqz v6, :cond_7

    .line 91
    .line 92
    const/4 v6, -0x1

    .line 93
    const-string v7, "com.zykj.evaluation.ui.guide.noStem.OptionView (NoStemQuestionViews.kt:261)"

    .line 94
    .line 95
    invoke-static {v3, v4, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_7
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 99
    .line 100
    const/16 v6, 0x29

    .line 101
    .line 102
    int-to-float v6, v6

    .line 103
    const/16 v7, 0x258

    .line 104
    .line 105
    int-to-float v7, v7

    .line 106
    div-float/2addr v6, v7

    .line 107
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 116
    .line 117
    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 118
    .line 119
    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    int-to-float v10, v10

    .line 124
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 129
    .line 130
    .line 131
    move-result-object v11

    .line 132
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 133
    .line 134
    div-float/2addr v10, v11

    .line 135
    mul-float/2addr v6, v10

    .line 136
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    const/16 v10, 0x13

    .line 141
    .line 142
    int-to-float v10, v10

    .line 143
    div-float/2addr v10, v7

    .line 144
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    iget v13, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 153
    .line 154
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 155
    .line 156
    invoke-static {v13, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    int-to-float v11, v11

    .line 161
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 170
    .line 171
    div-float/2addr v11, v13

    .line 172
    mul-float/2addr v10, v11

    .line 173
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 174
    .line 175
    .line 176
    move-result v10

    .line 177
    invoke-static {v3, v6, v10}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    int-to-float v5, v5

    .line 182
    div-float/2addr v5, v7

    .line 183
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    iget v10, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 192
    .line 193
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 194
    .line 195
    invoke-static {v10, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    int-to-float v6, v6

    .line 200
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 209
    .line 210
    div-float/2addr v6, v10

    .line 211
    mul-float/2addr v5, v6

    .line 212
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    sget-object v16, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    .line 221
    .line 222
    if-eqz v1, :cond_8

    .line 223
    .line 224
    invoke-static {}, Ld7/a;->i()J

    .line 225
    .line 226
    .line 227
    move-result-wide v10

    .line 228
    :goto_5
    move-wide/from16 v17, v10

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_8
    const-wide v10, 0xffebedf0L

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 237
    .line 238
    .line 239
    move-result-wide v10

    .line 240
    goto :goto_5

    .line 241
    :goto_6
    sget v6, Landroidx/compose/material3/ButtonDefaults;->$stable:I

    .line 242
    .line 243
    shl-int/lit8 v26, v6, 0xc

    .line 244
    .line 245
    const/16 v27, 0xe

    .line 246
    .line 247
    const-wide/16 v19, 0x0

    .line 248
    .line 249
    const-wide/16 v21, 0x0

    .line 250
    .line 251
    const-wide/16 v23, 0x0

    .line 252
    .line 253
    move-object/from16 v25, v12

    .line 254
    .line 255
    invoke-virtual/range {v16 .. v27}, Landroidx/compose/material3/ButtonDefaults;->buttonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    int-to-float v8, v8

    .line 260
    div-float/2addr v8, v7

    .line 261
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    iget v10, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 270
    .line 271
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 272
    .line 273
    invoke-static {v10, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    int-to-float v7, v7

    .line 278
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 283
    .line 284
    .line 285
    move-result-object v10

    .line 286
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 287
    .line 288
    div-float/2addr v7, v10

    .line 289
    mul-float/2addr v8, v7

    .line 290
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    invoke-static {v7}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    new-instance v8, Li6/a0;

    .line 299
    .line 300
    invoke-direct {v8, v1, v0}, Li6/a0;-><init>(ZLjava/lang/String;)V

    .line 301
    .line 302
    .line 303
    const/16 v10, 0x36

    .line 304
    .line 305
    const v11, 0x34bd9276

    .line 306
    .line 307
    .line 308
    invoke-static {v11, v9, v8, v12, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 309
    .line 310
    .line 311
    move-result-object v11

    .line 312
    shr-int/lit8 v4, v4, 0x6

    .line 313
    .line 314
    and-int/lit8 v4, v4, 0xe

    .line 315
    .line 316
    const v8, 0x30c00030

    .line 317
    .line 318
    .line 319
    or-int v13, v4, v8

    .line 320
    .line 321
    const/16 v14, 0x164

    .line 322
    .line 323
    const/4 v4, 0x0

    .line 324
    move-object v9, v7

    .line 325
    const/4 v7, 0x0

    .line 326
    const/4 v8, 0x0

    .line 327
    const/4 v10, 0x0

    .line 328
    invoke-static/range {v2 .. v14}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 329
    .line 330
    .line 331
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    if-eqz v3, :cond_a

    .line 336
    .line 337
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 338
    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_9
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 342
    .line 343
    .line 344
    :cond_a
    :goto_7
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    if-eqz v3, :cond_b

    .line 349
    .line 350
    new-instance v4, Li6/b0;

    .line 351
    .line 352
    invoke-direct {v4, v0, v1, v2, v15}, Li6/b0;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;I)V

    .line 353
    .line 354
    .line 355
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 356
    .line 357
    .line 358
    :cond_b
    return-void
.end method

.method public static final P(ZLjava/lang/String;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 25

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    const-string v2, "$this$Button"

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    and-int/lit8 v2, v1, 0x11

    .line 13
    .line 14
    const/16 v3, 0x10

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    move v2, v5

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v4

    .line 23
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 24
    .line 25
    invoke-interface {v0, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_7

    .line 30
    .line 31
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    const/4 v2, -0x1

    .line 38
    const-string v3, "com.zykj.evaluation.ui.guide.noStem.OptionView.<anonymous> (NoStemQuestionViews.kt:269)"

    .line 39
    .line 40
    const v6, 0x34bd9276

    .line 41
    .line 42
    .line 43
    invoke-static {v6, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-static {v1, v2, v5, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 55
    .line 56
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-static {v0, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v0, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 77
    .line 78
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    if-nez v9, :cond_2

    .line 87
    .line 88
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_3

    .line 99
    .line 100
    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 105
    .line 106
    .line 107
    :goto_1
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-static {v8, v5, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-static {v8, v6, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-nez v6, :cond_4

    .line 134
    .line 135
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-nez v6, :cond_5

    .line 148
    .line 149
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-interface {v8, v4, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 161
    .line 162
    .line 163
    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v8, v2, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    sget-object v2, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 171
    .line 172
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-interface {v2, v1, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    if-eqz p0, :cond_6

    .line 181
    .line 182
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 183
    .line 184
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 185
    .line 186
    .line 187
    move-result-wide v2

    .line 188
    goto :goto_2

    .line 189
    :cond_6
    const-wide v2, 0xff646566L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 195
    .line 196
    .line 197
    move-result-wide v2

    .line 198
    :goto_2
    const/4 v4, 0x7

    .line 199
    invoke-static {v4}, Lo5/e;->k(I)J

    .line 200
    .line 201
    .line 202
    move-result-wide v4

    .line 203
    const/16 v23, 0x0

    .line 204
    .line 205
    const v24, 0x1fff0

    .line 206
    .line 207
    .line 208
    const/4 v6, 0x0

    .line 209
    const/4 v7, 0x0

    .line 210
    const/4 v8, 0x0

    .line 211
    const-wide/16 v9, 0x0

    .line 212
    .line 213
    const/4 v11, 0x0

    .line 214
    const/4 v12, 0x0

    .line 215
    const-wide/16 v13, 0x0

    .line 216
    .line 217
    const/4 v15, 0x0

    .line 218
    const/16 v16, 0x0

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const/16 v18, 0x0

    .line 223
    .line 224
    const/16 v19, 0x0

    .line 225
    .line 226
    const/16 v20, 0x0

    .line 227
    .line 228
    const/16 v22, 0xc00

    .line 229
    .line 230
    move-object/from16 v21, v0

    .line 231
    .line 232
    move-object/from16 v0, p1

    .line 233
    .line 234
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 235
    .line 236
    .line 237
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 238
    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_8

    .line 245
    .line 246
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_7
    invoke-interface/range {p3 .. p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 251
    .line 252
    .line 253
    :cond_8
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0
.end method

.method public static final Q(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-static {p0, p1, p2, p4, p3}, Li6/k0;->O(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final R(Landroidx/compose/ui/Modifier;Li6/l;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 41

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v6, p5

    .line 10
    .line 11
    move/from16 v7, p7

    .line 12
    .line 13
    const-string v0, "question"

    .line 14
    .line 15
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "failedUuidsSet"

    .line 19
    .line 20
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "onClickHelp"

    .line 24
    .line 25
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "onClickChangeAnswer"

    .line 29
    .line 30
    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "onClickOpenBoard"

    .line 34
    .line 35
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const v0, -0x29a8b39

    .line 39
    .line 40
    .line 41
    move-object/from16 v1, p6

    .line 42
    .line 43
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 44
    .line 45
    .line 46
    move-result-object v14

    .line 47
    and-int/lit8 v1, p8, 0x1

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    or-int/lit8 v9, v7, 0x6

    .line 52
    .line 53
    move v10, v9

    .line 54
    move-object/from16 v9, p0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    and-int/lit8 v9, v7, 0x6

    .line 58
    .line 59
    if-nez v9, :cond_2

    .line 60
    .line 61
    move-object/from16 v9, p0

    .line 62
    .line 63
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_1

    .line 68
    .line 69
    const/4 v10, 0x4

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const/4 v10, 0x2

    .line 72
    :goto_0
    or-int/2addr v10, v7

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move-object/from16 v9, p0

    .line 75
    .line 76
    move v10, v7

    .line 77
    :goto_1
    and-int/lit8 v11, v7, 0x30

    .line 78
    .line 79
    if-nez v11, :cond_4

    .line 80
    .line 81
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v11

    .line 85
    if-eqz v11, :cond_3

    .line 86
    .line 87
    const/16 v11, 0x20

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    const/16 v11, 0x10

    .line 91
    .line 92
    :goto_2
    or-int/2addr v10, v11

    .line 93
    :cond_4
    and-int/lit16 v11, v7, 0x180

    .line 94
    .line 95
    if-nez v11, :cond_6

    .line 96
    .line 97
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    if-eqz v11, :cond_5

    .line 102
    .line 103
    const/16 v11, 0x100

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    const/16 v11, 0x80

    .line 107
    .line 108
    :goto_3
    or-int/2addr v10, v11

    .line 109
    :cond_6
    and-int/lit16 v11, v7, 0xc00

    .line 110
    .line 111
    if-nez v11, :cond_8

    .line 112
    .line 113
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-eqz v11, :cond_7

    .line 118
    .line 119
    const/16 v11, 0x800

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_7
    const/16 v11, 0x400

    .line 123
    .line 124
    :goto_4
    or-int/2addr v10, v11

    .line 125
    :cond_8
    and-int/lit16 v11, v7, 0x6000

    .line 126
    .line 127
    if-nez v11, :cond_a

    .line 128
    .line 129
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    if-eqz v11, :cond_9

    .line 134
    .line 135
    const/16 v11, 0x4000

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_9
    const/16 v11, 0x2000

    .line 139
    .line 140
    :goto_5
    or-int/2addr v10, v11

    .line 141
    :cond_a
    const/high16 v11, 0x30000

    .line 142
    .line 143
    and-int/2addr v11, v7

    .line 144
    if-nez v11, :cond_c

    .line 145
    .line 146
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    if-eqz v11, :cond_b

    .line 151
    .line 152
    const/high16 v11, 0x20000

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_b
    const/high16 v11, 0x10000

    .line 156
    .line 157
    :goto_6
    or-int/2addr v10, v11

    .line 158
    :cond_c
    const v11, 0x12493

    .line 159
    .line 160
    .line 161
    and-int/2addr v11, v10

    .line 162
    const v8, 0x12492

    .line 163
    .line 164
    .line 165
    const/4 v15, 0x0

    .line 166
    if-eq v11, v8, :cond_d

    .line 167
    .line 168
    const/4 v8, 0x1

    .line 169
    goto :goto_7

    .line 170
    :cond_d
    move v8, v15

    .line 171
    :goto_7
    and-int/lit8 v11, v10, 0x1

    .line 172
    .line 173
    invoke-interface {v14, v8, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-eqz v8, :cond_34

    .line 178
    .line 179
    if-eqz v1, :cond_e

    .line 180
    .line 181
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 182
    .line 183
    move-object/from16 v18, v1

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_e
    move-object/from16 v18, v9

    .line 187
    .line 188
    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_f

    .line 193
    .line 194
    const/4 v1, -0x1

    .line 195
    const-string v8, "com.zykj.evaluation.ui.guide.noStem.QuestionView (NoStemQuestionViews.kt:115)"

    .line 196
    .line 197
    invoke-static {v0, v10, v1, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_f
    const/4 v0, 0x5

    .line 201
    int-to-float v0, v0

    .line 202
    const/16 v1, 0x258

    .line 203
    .line 204
    int-to-float v1, v1

    .line 205
    div-float/2addr v0, v1

    .line 206
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 215
    .line 216
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 217
    .line 218
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    int-to-float v8, v8

    .line 223
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 232
    .line 233
    div-float/2addr v8, v9

    .line 234
    mul-float/2addr v8, v0

    .line 235
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 236
    .line 237
    .line 238
    move-result v22

    .line 239
    const/16 v23, 0x7

    .line 240
    .line 241
    const/16 v24, 0x0

    .line 242
    .line 243
    const/16 v19, 0x0

    .line 244
    .line 245
    const/16 v20, 0x0

    .line 246
    .line 247
    const/16 v21, 0x0

    .line 248
    .line 249
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    move-object/from16 v33, v18

    .line 254
    .line 255
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 256
    .line 257
    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    sget-object v34, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 262
    .line 263
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-static {v9, v11, v14, v15}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    invoke-static {v14, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    invoke-static {v14, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    sget-object v35, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 284
    .line 285
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 286
    .line 287
    .line 288
    move-result-object v15

    .line 289
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 290
    .line 291
    .line 292
    move-result-object v20

    .line 293
    if-nez v20, :cond_10

    .line 294
    .line 295
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 296
    .line 297
    .line 298
    :cond_10
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 299
    .line 300
    .line 301
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 302
    .line 303
    .line 304
    move-result v20

    .line 305
    if-eqz v20, :cond_11

    .line 306
    .line 307
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 308
    .line 309
    .line 310
    goto :goto_9

    .line 311
    :cond_11
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 312
    .line 313
    .line 314
    :goto_9
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 315
    .line 316
    .line 317
    move-result-object v15

    .line 318
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 319
    .line 320
    .line 321
    move-result-object v12

    .line 322
    invoke-static {v15, v9, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    invoke-static {v15, v13, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 337
    .line 338
    .line 339
    move-result v12

    .line 340
    if-nez v12, :cond_12

    .line 341
    .line 342
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v12

    .line 346
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v13

    .line 350
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v12

    .line 354
    if-nez v12, :cond_13

    .line 355
    .line 356
    :cond_12
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    invoke-interface {v15, v11, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 368
    .line 369
    .line 370
    :cond_13
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 371
    .line 372
    .line 373
    move-result-object v9

    .line 374
    invoke-static {v15, v8, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 375
    .line 376
    .line 377
    sget-object v36, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 378
    .line 379
    invoke-virtual {v2}, Li6/l;->c()Z

    .line 380
    .line 381
    .line 382
    move-result v8

    .line 383
    const/16 v9, 0x11

    .line 384
    .line 385
    if-eqz v8, :cond_17

    .line 386
    .line 387
    const v8, 0x25ddb947

    .line 388
    .line 389
    .line 390
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 391
    .line 392
    .line 393
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 394
    .line 395
    int-to-float v12, v9

    .line 396
    div-float/2addr v12, v1

    .line 397
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 398
    .line 399
    .line 400
    move-result-object v13

    .line 401
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 402
    .line 403
    .line 404
    move-result-object v13

    .line 405
    iget v15, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 406
    .line 407
    iget v13, v13, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 408
    .line 409
    invoke-static {v15, v13}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 410
    .line 411
    .line 412
    move-result v13

    .line 413
    int-to-float v13, v13

    .line 414
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 415
    .line 416
    .line 417
    move-result-object v15

    .line 418
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 419
    .line 420
    .line 421
    move-result-object v15

    .line 422
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 423
    .line 424
    div-float/2addr v13, v15

    .line 425
    mul-float/2addr v13, v12

    .line 426
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 427
    .line 428
    .line 429
    move-result v13

    .line 430
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 431
    .line 432
    .line 433
    move-result-object v15

    .line 434
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 435
    .line 436
    .line 437
    move-result-object v15

    .line 438
    iget v9, v15, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 439
    .line 440
    iget v15, v15, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 441
    .line 442
    invoke-static {v9, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 443
    .line 444
    .line 445
    move-result v9

    .line 446
    int-to-float v9, v9

    .line 447
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 448
    .line 449
    .line 450
    move-result-object v15

    .line 451
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 452
    .line 453
    .line 454
    move-result-object v15

    .line 455
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 456
    .line 457
    div-float/2addr v9, v15

    .line 458
    mul-float/2addr v12, v9

    .line 459
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 460
    .line 461
    .line 462
    move-result v9

    .line 463
    invoke-static {v8, v13, v9}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    and-int/lit16 v8, v10, 0x1c00

    .line 468
    .line 469
    const/16 v12, 0x800

    .line 470
    .line 471
    if-ne v8, v12, :cond_14

    .line 472
    .line 473
    const/4 v8, 0x1

    .line 474
    goto :goto_a

    .line 475
    :cond_14
    const/4 v8, 0x0

    .line 476
    :goto_a
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v12

    .line 480
    or-int/2addr v8, v12

    .line 481
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v12

    .line 485
    if-nez v8, :cond_15

    .line 486
    .line 487
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 488
    .line 489
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v8

    .line 493
    if-ne v12, v8, :cond_16

    .line 494
    .line 495
    :cond_15
    new-instance v12, Li6/f0;

    .line 496
    .line 497
    invoke-direct {v12, v4, v2}, Li6/f0;-><init>(Lkotlin/jvm/functions/Function1;Li6/l;)V

    .line 498
    .line 499
    .line 500
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    :cond_16
    move-object v8, v12

    .line 504
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 505
    .line 506
    new-instance v12, Li6/g0;

    .line 507
    .line 508
    invoke-direct {v12, v2}, Li6/g0;-><init>(Li6/l;)V

    .line 509
    .line 510
    .line 511
    const/16 v13, 0x36

    .line 512
    .line 513
    const v15, -0x58815d15

    .line 514
    .line 515
    .line 516
    const/4 v11, 0x1

    .line 517
    invoke-static {v15, v11, v12, v14, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 518
    .line 519
    .line 520
    move-result-object v13

    .line 521
    const v15, 0x30030

    .line 522
    .line 523
    .line 524
    const/high16 v12, 0x20000

    .line 525
    .line 526
    const/16 v16, 0x1c

    .line 527
    .line 528
    move/from16 v20, v10

    .line 529
    .line 530
    const/4 v10, 0x0

    .line 531
    move/from16 v21, v11

    .line 532
    .line 533
    const/4 v11, 0x0

    .line 534
    move/from16 v22, v12

    .line 535
    .line 536
    const/4 v12, 0x0

    .line 537
    move/from16 v23, v0

    .line 538
    .line 539
    move/from16 v37, v20

    .line 540
    .line 541
    move/from16 v39, v21

    .line 542
    .line 543
    const/16 v0, 0x11

    .line 544
    .line 545
    invoke-static/range {v8 .. v16}, Landroidx/compose/material3/IconButtonKt;->IconButton(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 546
    .line 547
    .line 548
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 549
    .line 550
    .line 551
    const/4 v9, 0x6

    .line 552
    goto :goto_b

    .line 553
    :cond_17
    move/from16 v23, v0

    .line 554
    .line 555
    move v0, v9

    .line 556
    move/from16 v37, v10

    .line 557
    .line 558
    const/16 v39, 0x1

    .line 559
    .line 560
    const v8, 0x25e5b45f

    .line 561
    .line 562
    .line 563
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 564
    .line 565
    .line 566
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 567
    .line 568
    int-to-float v9, v0

    .line 569
    div-float/2addr v9, v1

    .line 570
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 571
    .line 572
    .line 573
    move-result-object v10

    .line 574
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 575
    .line 576
    .line 577
    move-result-object v10

    .line 578
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 579
    .line 580
    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 581
    .line 582
    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 583
    .line 584
    .line 585
    move-result v10

    .line 586
    int-to-float v10, v10

    .line 587
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 588
    .line 589
    .line 590
    move-result-object v11

    .line 591
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 592
    .line 593
    .line 594
    move-result-object v11

    .line 595
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 596
    .line 597
    div-float/2addr v10, v11

    .line 598
    mul-float/2addr v9, v10

    .line 599
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 600
    .line 601
    .line 602
    move-result v9

    .line 603
    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 604
    .line 605
    .line 606
    move-result-object v8

    .line 607
    const/4 v9, 0x6

    .line 608
    invoke-static {v8, v14, v9}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 609
    .line 610
    .line 611
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 612
    .line 613
    .line 614
    :goto_b
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 615
    .line 616
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 617
    .line 618
    .line 619
    move-result-object v10

    .line 620
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 621
    .line 622
    .line 623
    move-result-object v10

    .line 624
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 625
    .line 626
    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 627
    .line 628
    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 629
    .line 630
    .line 631
    move-result v10

    .line 632
    int-to-float v10, v10

    .line 633
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 634
    .line 635
    .line 636
    move-result-object v11

    .line 637
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 638
    .line 639
    .line 640
    move-result-object v11

    .line 641
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 642
    .line 643
    div-float/2addr v10, v11

    .line 644
    mul-float v10, v10, v23

    .line 645
    .line 646
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 647
    .line 648
    .line 649
    move-result v10

    .line 650
    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 651
    .line 652
    .line 653
    move-result-object v10

    .line 654
    invoke-static {v10, v14, v9}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 655
    .line 656
    .line 657
    const/16 v10, 0x26

    .line 658
    .line 659
    int-to-float v10, v10

    .line 660
    div-float/2addr v10, v1

    .line 661
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 662
    .line 663
    .line 664
    move-result-object v11

    .line 665
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 666
    .line 667
    .line 668
    move-result-object v11

    .line 669
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 670
    .line 671
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 672
    .line 673
    invoke-static {v12, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 674
    .line 675
    .line 676
    move-result v11

    .line 677
    int-to-float v11, v11

    .line 678
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 679
    .line 680
    .line 681
    move-result-object v12

    .line 682
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 683
    .line 684
    .line 685
    move-result-object v12

    .line 686
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 687
    .line 688
    div-float/2addr v11, v12

    .line 689
    mul-float/2addr v10, v11

    .line 690
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 691
    .line 692
    .line 693
    move-result v10

    .line 694
    int-to-float v0, v0

    .line 695
    div-float/2addr v0, v1

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
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 705
    .line 706
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 707
    .line 708
    invoke-static {v12, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 709
    .line 710
    .line 711
    move-result v11

    .line 712
    int-to-float v11, v11

    .line 713
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 714
    .line 715
    .line 716
    move-result-object v12

    .line 717
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 718
    .line 719
    .line 720
    move-result-object v12

    .line 721
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 722
    .line 723
    div-float/2addr v11, v12

    .line 724
    mul-float/2addr v0, v11

    .line 725
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    invoke-static {v8, v10, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 734
    .line 735
    .line 736
    move-result-object v10

    .line 737
    const/4 v11, 0x0

    .line 738
    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 739
    .line 740
    .line 741
    move-result-object v10

    .line 742
    invoke-static {v14, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 743
    .line 744
    .line 745
    move-result v12

    .line 746
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 747
    .line 748
    .line 749
    move-result-object v11

    .line 750
    invoke-static {v14, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 755
    .line 756
    .line 757
    move-result-object v13

    .line 758
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 759
    .line 760
    .line 761
    move-result-object v15

    .line 762
    if-nez v15, :cond_18

    .line 763
    .line 764
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 765
    .line 766
    .line 767
    :cond_18
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 768
    .line 769
    .line 770
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 771
    .line 772
    .line 773
    move-result v15

    .line 774
    if-eqz v15, :cond_19

    .line 775
    .line 776
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 777
    .line 778
    .line 779
    goto :goto_c

    .line 780
    :cond_19
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 781
    .line 782
    .line 783
    :goto_c
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 784
    .line 785
    .line 786
    move-result-object v13

    .line 787
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 788
    .line 789
    .line 790
    move-result-object v15

    .line 791
    invoke-static {v13, v10, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 795
    .line 796
    .line 797
    move-result-object v10

    .line 798
    invoke-static {v13, v11, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 802
    .line 803
    .line 804
    move-result-object v10

    .line 805
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 806
    .line 807
    .line 808
    move-result v11

    .line 809
    if-nez v11, :cond_1a

    .line 810
    .line 811
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v11

    .line 815
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 816
    .line 817
    .line 818
    move-result-object v15

    .line 819
    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v11

    .line 823
    if-nez v11, :cond_1b

    .line 824
    .line 825
    :cond_1a
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 826
    .line 827
    .line 828
    move-result-object v11

    .line 829
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 833
    .line 834
    .line 835
    move-result-object v11

    .line 836
    invoke-interface {v13, v11, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 837
    .line 838
    .line 839
    :cond_1b
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 840
    .line 841
    .line 842
    move-result-object v10

    .line 843
    invoke-static {v13, v0, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 844
    .line 845
    .line 846
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 847
    .line 848
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    .line 849
    .line 850
    .line 851
    move-result-object v10

    .line 852
    invoke-interface {v0, v8, v10}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    move-object/from16 v22, v8

    .line 857
    .line 858
    invoke-virtual {v2}, Li6/l;->h()Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v8

    .line 862
    invoke-static {}, Ld7/a;->a()J

    .line 863
    .line 864
    .line 865
    move-result-wide v10

    .line 866
    const/16 v12, 0x8

    .line 867
    .line 868
    invoke-static {v12}, Lo5/e;->k(I)J

    .line 869
    .line 870
    .line 871
    move-result-wide v12

    .line 872
    const/16 v31, 0x0

    .line 873
    .line 874
    const v32, 0x1fff0

    .line 875
    .line 876
    .line 877
    move-object/from16 v29, v14

    .line 878
    .line 879
    const/4 v14, 0x0

    .line 880
    const/4 v15, 0x0

    .line 881
    const/16 v16, 0x0

    .line 882
    .line 883
    const-wide/16 v17, 0x0

    .line 884
    .line 885
    const/16 v19, 0x0

    .line 886
    .line 887
    const/16 v20, 0x0

    .line 888
    .line 889
    move-object/from16 v23, v22

    .line 890
    .line 891
    const-wide/16 v21, 0x0

    .line 892
    .line 893
    move-object/from16 v24, v23

    .line 894
    .line 895
    const/16 v23, 0x0

    .line 896
    .line 897
    move-object/from16 v25, v24

    .line 898
    .line 899
    const/16 v24, 0x0

    .line 900
    .line 901
    move-object/from16 v26, v25

    .line 902
    .line 903
    const/16 v25, 0x0

    .line 904
    .line 905
    move-object/from16 v27, v26

    .line 906
    .line 907
    const/16 v26, 0x0

    .line 908
    .line 909
    move-object/from16 v28, v27

    .line 910
    .line 911
    const/16 v27, 0x0

    .line 912
    .line 913
    move-object/from16 v30, v28

    .line 914
    .line 915
    const/16 v28, 0x0

    .line 916
    .line 917
    move-object/from16 v38, v30

    .line 918
    .line 919
    const/16 v30, 0xd80

    .line 920
    .line 921
    move/from16 v40, v9

    .line 922
    .line 923
    move-object v9, v0

    .line 924
    move-object/from16 v0, v38

    .line 925
    .line 926
    move/from16 v38, v1

    .line 927
    .line 928
    move/from16 v1, v40

    .line 929
    .line 930
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 931
    .line 932
    .line 933
    move-object/from16 v14, v29

    .line 934
    .line 935
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 936
    .line 937
    .line 938
    const/4 v8, 0x2

    .line 939
    int-to-float v8, v8

    .line 940
    div-float v8, v8, v38

    .line 941
    .line 942
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 943
    .line 944
    .line 945
    move-result-object v9

    .line 946
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 947
    .line 948
    .line 949
    move-result-object v9

    .line 950
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 951
    .line 952
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 953
    .line 954
    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 955
    .line 956
    .line 957
    move-result v9

    .line 958
    int-to-float v9, v9

    .line 959
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 960
    .line 961
    .line 962
    move-result-object v10

    .line 963
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 964
    .line 965
    .line 966
    move-result-object v10

    .line 967
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 968
    .line 969
    div-float/2addr v9, v10

    .line 970
    mul-float/2addr v8, v9

    .line 971
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 972
    .line 973
    .line 974
    move-result v8

    .line 975
    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 976
    .line 977
    .line 978
    move-result-object v8

    .line 979
    invoke-static {v8, v14, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 980
    .line 981
    .line 982
    const/16 v25, 0x2

    .line 983
    .line 984
    const/16 v26, 0x0

    .line 985
    .line 986
    const/high16 v23, 0x3f800000    # 1.0f

    .line 987
    .line 988
    move-object/from16 v22, v0

    .line 989
    .line 990
    move-object/from16 v21, v36

    .line 991
    .line 992
    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    const/4 v11, 0x0

    .line 1001
    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    invoke-static {v14, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1006
    .line 1007
    .line 1008
    move-result v8

    .line 1009
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v9

    .line 1013
    invoke-static {v14, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v10

    .line 1021
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v11

    .line 1025
    if-nez v11, :cond_1c

    .line 1026
    .line 1027
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1028
    .line 1029
    .line 1030
    :cond_1c
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1031
    .line 1032
    .line 1033
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1034
    .line 1035
    .line 1036
    move-result v11

    .line 1037
    if-eqz v11, :cond_1d

    .line 1038
    .line 1039
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 1040
    .line 1041
    .line 1042
    goto :goto_d

    .line 1043
    :cond_1d
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1044
    .line 1045
    .line 1046
    :goto_d
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v10

    .line 1050
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v11

    .line 1054
    invoke-static {v10, v1, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v1

    .line 1061
    invoke-static {v10, v9, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1069
    .line 1070
    .line 1071
    move-result v9

    .line 1072
    if-nez v9, :cond_1e

    .line 1073
    .line 1074
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v9

    .line 1078
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v11

    .line 1082
    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v9

    .line 1086
    if-nez v9, :cond_1f

    .line 1087
    .line 1088
    :cond_1e
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v9

    .line 1092
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1093
    .line 1094
    .line 1095
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v8

    .line 1099
    invoke-interface {v10, v8, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1100
    .line 1101
    .line 1102
    :cond_1f
    invoke-virtual/range {v35 .. v35}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    invoke-static {v10, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v2}, Li6/l;->g()I

    .line 1110
    .line 1111
    .line 1112
    move-result v0

    .line 1113
    sget-object v1, Li6/p0$e;->b:Li6/p0$e;

    .line 1114
    .line 1115
    invoke-virtual {v1}, Li6/p0;->a()I

    .line 1116
    .line 1117
    .line 1118
    move-result v1

    .line 1119
    const v8, 0xe000

    .line 1120
    .line 1121
    .line 1122
    if-eq v0, v1, :cond_20

    .line 1123
    .line 1124
    sget-object v1, Li6/p0$b;->b:Li6/p0$b;

    .line 1125
    .line 1126
    invoke-virtual {v1}, Li6/p0;->a()I

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    if-ne v0, v1, :cond_21

    .line 1131
    .line 1132
    :cond_20
    const/16 v10, 0x4000

    .line 1133
    .line 1134
    goto/16 :goto_14

    .line 1135
    .line 1136
    :cond_21
    sget-object v1, Li6/p0$d;->b:Li6/p0$d;

    .line 1137
    .line 1138
    invoke-virtual {v1}, Li6/p0;->a()I

    .line 1139
    .line 1140
    .line 1141
    move-result v1

    .line 1142
    if-ne v0, v1, :cond_25

    .line 1143
    .line 1144
    const v0, 0x7a80e04b

    .line 1145
    .line 1146
    .line 1147
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v2}, Li6/l;->e()Ljava/util/List;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    invoke-virtual {v2}, Li6/l;->d()Ljava/util/List;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v1

    .line 1158
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1159
    .line 1160
    .line 1161
    move-result v9

    .line 1162
    and-int v8, v37, v8

    .line 1163
    .line 1164
    const/16 v10, 0x4000

    .line 1165
    .line 1166
    if-ne v8, v10, :cond_22

    .line 1167
    .line 1168
    move/from16 v15, v39

    .line 1169
    .line 1170
    goto :goto_e

    .line 1171
    :cond_22
    const/4 v15, 0x0

    .line 1172
    :goto_e
    or-int v8, v9, v15

    .line 1173
    .line 1174
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v9

    .line 1178
    if-nez v8, :cond_23

    .line 1179
    .line 1180
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1181
    .line 1182
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v8

    .line 1186
    if-ne v9, v8, :cond_24

    .line 1187
    .line 1188
    :cond_23
    new-instance v9, Li6/i0;

    .line 1189
    .line 1190
    invoke-direct {v9, v5, v2}, Li6/i0;-><init>(Lkotlin/jvm/functions/Function1;Li6/l;)V

    .line 1191
    .line 1192
    .line 1193
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1194
    .line 1195
    .line 1196
    :cond_24
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 1197
    .line 1198
    const/4 v11, 0x0

    .line 1199
    invoke-static {v0, v1, v9, v14, v11}, Li6/k0;->K(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 1200
    .line 1201
    .line 1202
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1203
    .line 1204
    .line 1205
    goto/16 :goto_16

    .line 1206
    .line 1207
    :cond_25
    sget-object v1, Li6/p0$a;->b:Li6/p0$a;

    .line 1208
    .line 1209
    invoke-virtual {v1}, Li6/p0;->a()I

    .line 1210
    .line 1211
    .line 1212
    move-result v1

    .line 1213
    const/high16 v8, 0x70000

    .line 1214
    .line 1215
    const-string v9, ""

    .line 1216
    .line 1217
    if-ne v0, v1, :cond_2a

    .line 1218
    .line 1219
    const v0, 0x7a8cbfa0

    .line 1220
    .line 1221
    .line 1222
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v2}, Li6/l;->d()Ljava/util/List;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v0

    .line 1233
    check-cast v0, Ljava/lang/String;

    .line 1234
    .line 1235
    if-nez v0, :cond_26

    .line 1236
    .line 1237
    goto :goto_f

    .line 1238
    :cond_26
    move-object v9, v0

    .line 1239
    :goto_f
    invoke-virtual {v2}, Li6/l;->i()Ljava/lang/String;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    and-int v1, v37, v8

    .line 1248
    .line 1249
    const/high16 v12, 0x20000

    .line 1250
    .line 1251
    if-ne v1, v12, :cond_27

    .line 1252
    .line 1253
    move/from16 v15, v39

    .line 1254
    .line 1255
    goto :goto_10

    .line 1256
    :cond_27
    const/4 v15, 0x0

    .line 1257
    :goto_10
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    if-nez v15, :cond_28

    .line 1262
    .line 1263
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1264
    .line 1265
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v8

    .line 1269
    if-ne v1, v8, :cond_29

    .line 1270
    .line 1271
    :cond_28
    new-instance v1, Li6/j0;

    .line 1272
    .line 1273
    invoke-direct {v1, v6}, Li6/j0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 1274
    .line 1275
    .line 1276
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1277
    .line 1278
    .line 1279
    :cond_29
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 1280
    .line 1281
    const/4 v11, 0x0

    .line 1282
    invoke-static {v9, v0, v1, v14, v11}, Li6/k0;->y(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 1283
    .line 1284
    .line 1285
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1286
    .line 1287
    .line 1288
    goto/16 :goto_16

    .line 1289
    .line 1290
    :cond_2a
    const/high16 v12, 0x20000

    .line 1291
    .line 1292
    sget-object v1, Li6/p0$c$a;->b:Li6/p0$c$a;

    .line 1293
    .line 1294
    invoke-virtual {v1}, Li6/p0;->a()I

    .line 1295
    .line 1296
    .line 1297
    move-result v1

    .line 1298
    if-ne v0, v1, :cond_2f

    .line 1299
    .line 1300
    const v0, 0x7a924d63

    .line 1301
    .line 1302
    .line 1303
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v2}, Li6/l;->d()Ljava/util/List;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v0

    .line 1314
    check-cast v0, Ljava/lang/String;

    .line 1315
    .line 1316
    if-nez v0, :cond_2b

    .line 1317
    .line 1318
    goto :goto_11

    .line 1319
    :cond_2b
    move-object v9, v0

    .line 1320
    :goto_11
    invoke-virtual {v2}, Li6/l;->i()Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1325
    .line 1326
    .line 1327
    move-result v0

    .line 1328
    and-int v1, v37, v8

    .line 1329
    .line 1330
    if-ne v1, v12, :cond_2c

    .line 1331
    .line 1332
    move/from16 v15, v39

    .line 1333
    .line 1334
    goto :goto_12

    .line 1335
    :cond_2c
    const/4 v15, 0x0

    .line 1336
    :goto_12
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v1

    .line 1340
    if-nez v15, :cond_2d

    .line 1341
    .line 1342
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1343
    .line 1344
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v8

    .line 1348
    if-ne v1, v8, :cond_2e

    .line 1349
    .line 1350
    :cond_2d
    new-instance v1, Li6/n;

    .line 1351
    .line 1352
    invoke-direct {v1, v6}, Li6/n;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 1353
    .line 1354
    .line 1355
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1356
    .line 1357
    .line 1358
    :cond_2e
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 1359
    .line 1360
    const/4 v11, 0x0

    .line 1361
    invoke-static {v9, v0, v1, v14, v11}, Li6/k0;->H(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 1362
    .line 1363
    .line 1364
    :goto_13
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1365
    .line 1366
    .line 1367
    goto :goto_16

    .line 1368
    :cond_2f
    const v0, 0x7a26e15c

    .line 1369
    .line 1370
    .line 1371
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1372
    .line 1373
    .line 1374
    goto :goto_13

    .line 1375
    :goto_14
    const v0, 0x7a7845b8

    .line 1376
    .line 1377
    .line 1378
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v2}, Li6/l;->e()Ljava/util/List;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v0

    .line 1385
    invoke-virtual {v2}, Li6/l;->d()Ljava/util/List;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v1

    .line 1389
    and-int v8, v37, v8

    .line 1390
    .line 1391
    if-ne v8, v10, :cond_30

    .line 1392
    .line 1393
    move/from16 v15, v39

    .line 1394
    .line 1395
    goto :goto_15

    .line 1396
    :cond_30
    const/4 v15, 0x0

    .line 1397
    :goto_15
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v8

    .line 1401
    if-nez v15, :cond_31

    .line 1402
    .line 1403
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1404
    .line 1405
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v9

    .line 1409
    if-ne v8, v9, :cond_32

    .line 1410
    .line 1411
    :cond_31
    new-instance v8, Li6/h0;

    .line 1412
    .line 1413
    invoke-direct {v8, v5}, Li6/h0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 1414
    .line 1415
    .line 1416
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1417
    .line 1418
    .line 1419
    :cond_32
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 1420
    .line 1421
    const/4 v11, 0x0

    .line 1422
    invoke-static {v0, v1, v8, v14, v11}, Li6/k0;->Z(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 1423
    .line 1424
    .line 1425
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1426
    .line 1427
    .line 1428
    :goto_16
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1429
    .line 1430
    .line 1431
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1432
    .line 1433
    .line 1434
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1435
    .line 1436
    .line 1437
    move-result v0

    .line 1438
    if-eqz v0, :cond_33

    .line 1439
    .line 1440
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1441
    .line 1442
    .line 1443
    :cond_33
    move-object/from16 v1, v33

    .line 1444
    .line 1445
    goto :goto_17

    .line 1446
    :cond_34
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1447
    .line 1448
    .line 1449
    move-object v1, v9

    .line 1450
    :goto_17
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v9

    .line 1454
    if-eqz v9, :cond_35

    .line 1455
    .line 1456
    new-instance v0, Li6/o;

    .line 1457
    .line 1458
    move/from16 v8, p8

    .line 1459
    .line 1460
    invoke-direct/range {v0 .. v8}, Li6/o;-><init>(Landroidx/compose/ui/Modifier;Li6/l;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    .line 1461
    .line 1462
    .line 1463
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1464
    .line 1465
    .line 1466
    :cond_35
    return-void
.end method

.method public static final S(Lkotlin/jvm/functions/Function1;Li6/l;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p1}, Li6/l;->j()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    xor-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final T(Li6/l;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 13

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    const-string v1, "com.zykj.evaluation.ui.guide.noStem.QuestionView.<anonymous>.<anonymous> (NoStemQuestionViews.kt:127)"

    .line 26
    .line 27
    const v3, -0x58815d15

    .line 28
    .line 29
    .line 30
    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    sget-object p2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 34
    .line 35
    const/16 v0, 0xb

    .line 36
    .line 37
    int-to-float v0, v0

    .line 38
    const/16 v1, 0x258

    .line 39
    .line 40
    int-to-float v1, v1

    .line 41
    div-float/2addr v0, v1

    .line 42
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget v3, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 51
    .line 52
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 53
    .line 54
    invoke-static {v3, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    int-to-float v1, v1

    .line 59
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 68
    .line 69
    div-float/2addr v1, v3

    .line 70
    mul-float/2addr v0, v1

    .line 71
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {p0}, Li6/l;->j()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_2

    .line 84
    .line 85
    const p0, 0x7f0800da

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    const p0, 0x7f0800d9

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-static {p0, p1, v2}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    const/16 v11, 0x1b0

    .line 97
    .line 98
    const/16 v12, 0x78

    .line 99
    .line 100
    const/4 v4, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    const/4 v8, 0x0

    .line 104
    const/4 v9, 0x0

    .line 105
    move-object v10, p1

    .line 106
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 107
    .line 108
    .line 109
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-eqz p0, :cond_4

    .line 114
    .line 115
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    move-object v10, p1

    .line 120
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 121
    .line 122
    .line 123
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0
.end method

.method public static final U(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "option"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final V(Lkotlin/jvm/functions/Function1;Li6/l;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Li6/l;->d()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->sort(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final W(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final X(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final Y(Landroidx/compose/ui/Modifier;Li6/l;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    .line 1
    or-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v8

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-object v6, p5

    .line 13
    move/from16 v9, p7

    .line 14
    .line 15
    move-object/from16 v7, p8

    .line 16
    .line 17
    invoke-static/range {v1 .. v9}, Li6/k0;->R(Landroidx/compose/ui/Modifier;Li6/l;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method

.method public static final Z(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const v0, -0x6c930b54

    .line 2
    .line 3
    .line 4
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v8

    .line 8
    and-int/lit8 p3, p4, 0x6

    .line 9
    .line 10
    if-nez p3, :cond_1

    .line 11
    .line 12
    invoke-interface {v8, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    const/4 p3, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p3, 0x2

    .line 21
    :goto_0
    or-int/2addr p3, p4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p3, p4

    .line 24
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v8, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr p3, v1

    .line 40
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 41
    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    invoke-interface {v8, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    const/16 v1, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v1, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr p3, v1

    .line 56
    :cond_5
    and-int/lit16 v1, p3, 0x93

    .line 57
    .line 58
    const/16 v2, 0x92

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    if-eq v1, v2, :cond_6

    .line 62
    .line 63
    move v1, v3

    .line 64
    goto :goto_4

    .line 65
    :cond_6
    const/4 v1, 0x0

    .line 66
    :goto_4
    and-int/lit8 v2, p3, 0x1

    .line 67
    .line 68
    invoke-interface {v8, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_8

    .line 73
    .line 74
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_7

    .line 79
    .line 80
    const/4 v1, -0x1

    .line 81
    const-string v2, "com.zykj.evaluation.ui.guide.noStem.SingleQuestionView (NoStemQuestionViews.kt:218)"

    .line 82
    .line 83
    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_7
    sget-object p3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-static {p3, v0, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    sget-object p3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 95
    .line 96
    const/4 v0, 0x5

    .line 97
    int-to-float v0, v0

    .line 98
    const/16 v2, 0x258

    .line 99
    .line 100
    int-to-float v2, v2

    .line 101
    div-float/2addr v0, v2

    .line 102
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget v4, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 111
    .line 112
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 113
    .line 114
    invoke-static {v4, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    int-to-float v2, v2

    .line 119
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 128
    .line 129
    div-float/2addr v2, v4

    .line 130
    mul-float/2addr v2, v0

    .line 131
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {p3, v2}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 148
    .line 149
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 150
    .line 151
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    int-to-float v4, v4

    .line 156
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 165
    .line 166
    div-float/2addr v4, v5

    .line 167
    mul-float/2addr v0, v4

    .line 168
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-virtual {p3, v0}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    new-instance v0, Li6/p;

    .line 177
    .line 178
    invoke-direct {v0, p0, p1, p2}, Li6/p;-><init>(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V

    .line 179
    .line 180
    .line 181
    const/16 v4, 0x36

    .line 182
    .line 183
    const v5, -0x2b370daf

    .line 184
    .line 185
    .line 186
    invoke-static {v5, v3, v0, v8, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    const v9, 0x1801b6

    .line 191
    .line 192
    .line 193
    const/16 v10, 0x38

    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    const/4 v5, 0x0

    .line 197
    const/4 v6, 0x0

    .line 198
    move-object v3, p3

    .line 199
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 203
    .line 204
    .line 205
    move-result p3

    .line 206
    if-eqz p3, :cond_9

    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_8
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 213
    .line 214
    .line 215
    :cond_9
    :goto_5
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    if-eqz p3, :cond_a

    .line 220
    .line 221
    new-instance v0, Li6/q;

    .line 222
    .line 223
    invoke-direct {v0, p0, p1, p2, p4}, Li6/q;-><init>(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;I)V

    .line 224
    .line 225
    .line 226
    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    :cond_a
    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li6/k0;->U(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final a0(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 3

    .line 1
    const-string v0, "$this$FlowRow"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    and-int/lit8 p3, p5, 0x11

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eq p3, v0, :cond_0

    .line 12
    .line 13
    const/4 p3, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p3, v1

    .line 16
    :goto_0
    and-int/lit8 v0, p5, 0x1

    .line 17
    .line 18
    invoke-interface {p4, p3, v0}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-eqz p3, :cond_5

    .line 23
    .line 24
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_1

    .line 29
    .line 30
    const/4 p3, -0x1

    .line 31
    const-string v0, "com.zykj.evaluation.ui.guide.noStem.SingleQuestionView.<anonymous> (NoStemQuestionViews.kt:224)"

    .line 32
    .line 33
    const v2, -0x2b370daf

    .line 34
    .line 35
    .line 36
    invoke-static {v2, p5, p3, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-eqz p3, :cond_4

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    check-cast p3, Ljava/lang/String;

    .line 54
    .line 55
    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p5

    .line 59
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    or-int/2addr v0, v2

    .line 68
    invoke-interface {p4, p5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    or-int/2addr v0, v2

    .line 73
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-ne v2, v0, :cond_3

    .line 86
    .line 87
    :cond_2
    new-instance v2, Li6/y;

    .line 88
    .line 89
    invoke-direct {v2, p2, p3, p5}, Li6/y;-><init>(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 96
    .line 97
    invoke-static {p3, p5, v2, p4, v1}, Li6/k0;->O(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_6

    .line 106
    .line 107
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 112
    .line 113
    .line 114
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Li6/l;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li6/k0;->S(Lkotlin/jvm/functions/Function1;Li6/l;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b0(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Li6/l;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li6/k0;->V(Lkotlin/jvm/functions/Function1;Li6/l;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c0(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-static {p0, p1, p2, p4, p3}, Li6/k0;->Z(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Li6/k0;->c0(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Li6/b;Lkotlin/jvm/functions/Function3;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Li6/k0;->G(Landroidx/compose/ui/Modifier;Li6/b;Lkotlin/jvm/functions/Function3;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li6/k0;->C(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Li6/k0;->W(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Li6/l;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li6/k0;->T(Li6/l;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Lkotlin/jvm/functions/Function3;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Li6/k0;->E(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Lkotlin/jvm/functions/Function3;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Li6/k0;->Q(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Li6/k0;->a0(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Li6/k0;->I(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Li6/k0;->N(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(ZLjava/lang/String;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Li6/k0;->P(ZLjava/lang/String;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Li6/k0;->X(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li6/k0;->M(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Li6/k0;->J(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Li6/k0;->L(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li6/k0;->D(Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;Li6/l;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Li6/k0;->z(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Landroidx/compose/ui/Modifier;Li6/l;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Li6/k0;->Y(Landroidx/compose/ui/Modifier;Li6/l;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Li6/k0;->b0(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Li6/k0;->A(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lkotlin/jvm/functions/Function1;Li6/b;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li6/k0;->F(Lkotlin/jvm/functions/Function1;Li6/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final y(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v15, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move/from16 v2, p4

    .line 8
    .line 9
    const v3, -0x2b9ed191

    .line 10
    .line 11
    .line 12
    move-object/from16 v4, p3

    .line 13
    .line 14
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v11

    .line 18
    and-int/lit8 v4, v2, 0x6

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v4, v5

    .line 32
    :goto_0
    or-int/2addr v4, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v4, v2

    .line 35
    :goto_1
    and-int/lit8 v6, v2, 0x30

    .line 36
    .line 37
    if-nez v6, :cond_3

    .line 38
    .line 39
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    const/16 v6, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v6, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v4, v6

    .line 51
    :cond_3
    and-int/lit16 v6, v2, 0x180

    .line 52
    .line 53
    const/16 v7, 0x100

    .line 54
    .line 55
    if-nez v6, :cond_5

    .line 56
    .line 57
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    move v6, v7

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v6, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v4, v6

    .line 68
    :cond_5
    and-int/lit16 v6, v4, 0x93

    .line 69
    .line 70
    const/16 v8, 0x92

    .line 71
    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x1

    .line 74
    if-eq v6, v8, :cond_6

    .line 75
    .line 76
    move v6, v10

    .line 77
    goto :goto_4

    .line 78
    :cond_6
    move v6, v9

    .line 79
    :goto_4
    and-int/lit8 v8, v4, 0x1

    .line 80
    .line 81
    invoke-interface {v11, v6, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_10

    .line 86
    .line 87
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_7

    .line 92
    .line 93
    const/4 v6, -0x1

    .line 94
    const-string v8, "com.zykj.evaluation.ui.guide.noStem.BlankQuestionView (NoStemQuestionViews.kt:285)"

    .line 95
    .line 96
    invoke-static {v3, v4, v6, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_7
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 100
    .line 101
    const/16 v6, 0x26

    .line 102
    .line 103
    int-to-float v6, v6

    .line 104
    const/16 v8, 0x258

    .line 105
    .line 106
    int-to-float v8, v8

    .line 107
    div-float/2addr v6, v8

    .line 108
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    iget v13, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 117
    .line 118
    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 119
    .line 120
    invoke-static {v13, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    int-to-float v12, v12

    .line 125
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 134
    .line 135
    div-float/2addr v12, v13

    .line 136
    mul-float/2addr v6, v12

    .line 137
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 142
    .line 143
    .line 144
    move-result-object v16

    .line 145
    int-to-float v6, v10

    .line 146
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 147
    .line 148
    .line 149
    move-result v17

    .line 150
    if-eqz v15, :cond_8

    .line 151
    .line 152
    const-wide v12, 0xffff3b30L

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    :goto_5
    invoke-static {v12, v13}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v12

    .line 161
    move-wide/from16 v18, v12

    .line 162
    .line 163
    goto :goto_6

    .line 164
    :cond_8
    const-wide v12, 0xffdcdee0L

    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :goto_6
    int-to-float v5, v5

    .line 171
    div-float/2addr v5, v8

    .line 172
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 181
    .line 182
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 183
    .line 184
    invoke-static {v8, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    int-to-float v6, v6

    .line 189
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 198
    .line 199
    div-float/2addr v6, v8

    .line 200
    mul-float/2addr v6, v5

    .line 201
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    invoke-static {v6}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 206
    .line 207
    .line 208
    move-result-object v20

    .line 209
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 218
    .line 219
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 220
    .line 221
    invoke-static {v8, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    int-to-float v6, v6

    .line 226
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 235
    .line 236
    div-float/2addr v6, v8

    .line 237
    mul-float/2addr v6, v5

    .line 238
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 239
    .line 240
    .line 241
    move-result v21

    .line 242
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 251
    .line 252
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 253
    .line 254
    invoke-static {v8, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    int-to-float v6, v6

    .line 259
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 268
    .line 269
    div-float/2addr v6, v8

    .line 270
    mul-float/2addr v6, v5

    .line 271
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 272
    .line 273
    .line 274
    move-result v22

    .line 275
    invoke-static/range {v16 .. v22}, LDashedBorderKt;->d(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;FF)Landroidx/compose/ui/Modifier;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    iget v12, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 288
    .line 289
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 290
    .line 291
    invoke-static {v12, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    int-to-float v8, v8

    .line 296
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 301
    .line 302
    .line 303
    move-result-object v12

    .line 304
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 305
    .line 306
    div-float/2addr v8, v12

    .line 307
    mul-float/2addr v5, v8

    .line 308
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    and-int/lit16 v6, v4, 0x380

    .line 317
    .line 318
    if-ne v6, v7, :cond_9

    .line 319
    .line 320
    move v6, v10

    .line 321
    goto :goto_7

    .line 322
    :cond_9
    move v6, v9

    .line 323
    :goto_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    if-nez v6, :cond_a

    .line 328
    .line 329
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 330
    .line 331
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    if-ne v7, v6, :cond_b

    .line 336
    .line 337
    :cond_a
    new-instance v7, Li6/t;

    .line 338
    .line 339
    invoke-direct {v7, v1}, Li6/t;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 340
    .line 341
    .line 342
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 346
    .line 347
    const/4 v6, 0x0

    .line 348
    invoke-static {v5, v9, v7, v10, v6}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 353
    .line 354
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    invoke-static {v11, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 367
    .line 368
    .line 369
    move-result-object v9

    .line 370
    invoke-static {v11, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 375
    .line 376
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 377
    .line 378
    .line 379
    move-result-object v13

    .line 380
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 381
    .line 382
    .line 383
    move-result-object v14

    .line 384
    if-nez v14, :cond_c

    .line 385
    .line 386
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 387
    .line 388
    .line 389
    :cond_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 390
    .line 391
    .line 392
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 393
    .line 394
    .line 395
    move-result v14

    .line 396
    if-eqz v14, :cond_d

    .line 397
    .line 398
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 399
    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 403
    .line 404
    .line 405
    :goto_8
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 406
    .line 407
    .line 408
    move-result-object v13

    .line 409
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 410
    .line 411
    .line 412
    move-result-object v14

    .line 413
    invoke-static {v13, v7, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-static {v13, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 428
    .line 429
    .line 430
    move-result v9

    .line 431
    if-nez v9, :cond_e

    .line 432
    .line 433
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 438
    .line 439
    .line 440
    move-result-object v14

    .line 441
    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    if-nez v9, :cond_f

    .line 446
    .line 447
    :cond_e
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object v9

    .line 451
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 455
    .line 456
    .line 457
    move-result-object v8

    .line 458
    invoke-interface {v13, v8, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 459
    .line 460
    .line 461
    :cond_f
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 462
    .line 463
    .line 464
    move-result-object v7

    .line 465
    invoke-static {v13, v5, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 466
    .line 467
    .line 468
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 469
    .line 470
    const/4 v5, 0x0

    .line 471
    invoke-static {v3, v5, v10, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    sget-object v5, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 476
    .line 477
    invoke-virtual {v5}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    .line 478
    .line 479
    .line 480
    move-result-object v6

    .line 481
    and-int/lit8 v4, v4, 0xe

    .line 482
    .line 483
    const v5, 0x1801b0

    .line 484
    .line 485
    .line 486
    or-int v12, v4, v5

    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const/16 v14, 0x7b8

    .line 490
    .line 491
    const/4 v1, 0x0

    .line 492
    move-object v2, v3

    .line 493
    const/4 v3, 0x0

    .line 494
    const/4 v4, 0x0

    .line 495
    const/4 v5, 0x0

    .line 496
    const/4 v7, 0x0

    .line 497
    const/4 v8, 0x0

    .line 498
    const/4 v9, 0x0

    .line 499
    const/4 v10, 0x0

    .line 500
    invoke-static/range {v0 .. v14}, Lcoil3/compose/c;->a(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;III)V

    .line 501
    .line 502
    .line 503
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 504
    .line 505
    .line 506
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    if-eqz v1, :cond_11

    .line 511
    .line 512
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 513
    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 517
    .line 518
    .line 519
    :cond_11
    :goto_9
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    if-eqz v1, :cond_12

    .line 524
    .line 525
    new-instance v2, Li6/u;

    .line 526
    .line 527
    move-object/from16 v3, p2

    .line 528
    .line 529
    move/from16 v4, p4

    .line 530
    .line 531
    invoke-direct {v2, v0, v15, v3, v4}, Li6/u;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;I)V

    .line 532
    .line 533
    .line 534
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 535
    .line 536
    .line 537
    :cond_12
    return-void
.end method

.method public static final z(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

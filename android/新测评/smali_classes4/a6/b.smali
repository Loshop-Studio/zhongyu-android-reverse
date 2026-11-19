.class public abstract La6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, La6/b;->c(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    .line 1
    move-object/from16 v3, p3

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move-object/from16 v6, p5

    .line 6
    .line 7
    move/from16 v0, p9

    .line 8
    .line 9
    const-string v1, "navController"

    .line 10
    .line 11
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "onClickToAsk"

    .line 15
    .line 16
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "requestPermission"

    .line 20
    .line 21
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const v1, 0x39d7472a

    .line 25
    .line 26
    .line 27
    move-object/from16 v2, p8

    .line 28
    .line 29
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 30
    .line 31
    .line 32
    move-result-object v12

    .line 33
    and-int/lit8 v2, v0, 0x6

    .line 34
    .line 35
    move-wide/from16 v7, p0

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    invoke-interface {v12, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v2, 0x2

    .line 48
    :goto_0
    or-int/2addr v2, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v2, v0

    .line 51
    :goto_1
    and-int/lit8 v4, v0, 0x30

    .line 52
    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    move-object/from16 v4, p2

    .line 56
    .line 57
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_2

    .line 62
    .line 63
    const/16 v9, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/16 v9, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v2, v9

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move-object/from16 v4, p2

    .line 71
    .line 72
    :goto_3
    and-int/lit16 v9, v0, 0x180

    .line 73
    .line 74
    if-nez v9, :cond_5

    .line 75
    .line 76
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-eqz v9, :cond_4

    .line 81
    .line 82
    const/16 v9, 0x100

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_4
    const/16 v9, 0x80

    .line 86
    .line 87
    :goto_4
    or-int/2addr v2, v9

    .line 88
    :cond_5
    and-int/lit16 v9, v0, 0xc00

    .line 89
    .line 90
    if-nez v9, :cond_7

    .line 91
    .line 92
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-eqz v9, :cond_6

    .line 97
    .line 98
    const/16 v9, 0x800

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_6
    const/16 v9, 0x400

    .line 102
    .line 103
    :goto_5
    or-int/2addr v2, v9

    .line 104
    :cond_7
    and-int/lit16 v9, v0, 0x6000

    .line 105
    .line 106
    if-nez v9, :cond_9

    .line 107
    .line 108
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    if-eqz v9, :cond_8

    .line 113
    .line 114
    const/16 v9, 0x4000

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_8
    const/16 v9, 0x2000

    .line 118
    .line 119
    :goto_6
    or-int/2addr v2, v9

    .line 120
    :cond_9
    const/high16 v9, 0x30000

    .line 121
    .line 122
    and-int/2addr v9, v0

    .line 123
    if-nez v9, :cond_c

    .line 124
    .line 125
    and-int/lit8 v9, p10, 0x20

    .line 126
    .line 127
    if-nez v9, :cond_a

    .line 128
    .line 129
    move-object/from16 v9, p6

    .line 130
    .line 131
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    if-eqz v10, :cond_b

    .line 136
    .line 137
    const/high16 v10, 0x20000

    .line 138
    .line 139
    goto :goto_7

    .line 140
    :cond_a
    move-object/from16 v9, p6

    .line 141
    .line 142
    :cond_b
    const/high16 v10, 0x10000

    .line 143
    .line 144
    :goto_7
    or-int/2addr v2, v10

    .line 145
    goto :goto_8

    .line 146
    :cond_c
    move-object/from16 v9, p6

    .line 147
    .line 148
    :goto_8
    const/high16 v10, 0x180000

    .line 149
    .line 150
    and-int/2addr v10, v0

    .line 151
    if-nez v10, :cond_e

    .line 152
    .line 153
    and-int/lit8 v10, p10, 0x40

    .line 154
    .line 155
    move-object/from16 v15, p7

    .line 156
    .line 157
    if-nez v10, :cond_d

    .line 158
    .line 159
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-eqz v10, :cond_d

    .line 164
    .line 165
    const/high16 v10, 0x100000

    .line 166
    .line 167
    goto :goto_9

    .line 168
    :cond_d
    const/high16 v10, 0x80000

    .line 169
    .line 170
    :goto_9
    or-int/2addr v2, v10

    .line 171
    goto :goto_a

    .line 172
    :cond_e
    move-object/from16 v15, p7

    .line 173
    .line 174
    :goto_a
    const v10, 0x92493

    .line 175
    .line 176
    .line 177
    and-int/2addr v10, v2

    .line 178
    const v11, 0x92492

    .line 179
    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    if-eq v10, v11, :cond_f

    .line 183
    .line 184
    const/4 v10, 0x1

    .line 185
    goto :goto_b

    .line 186
    :cond_f
    move v10, v13

    .line 187
    :goto_b
    and-int/lit8 v11, v2, 0x1

    .line 188
    .line 189
    invoke-interface {v12, v10, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eqz v10, :cond_1c

    .line 194
    .line 195
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 196
    .line 197
    .line 198
    and-int/lit8 v10, v0, 0x1

    .line 199
    .line 200
    const v16, -0x380001

    .line 201
    .line 202
    .line 203
    const v17, -0x70001

    .line 204
    .line 205
    .line 206
    if-eqz v10, :cond_13

    .line 207
    .line 208
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    if-eqz v10, :cond_10

    .line 213
    .line 214
    goto :goto_c

    .line 215
    :cond_10
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 216
    .line 217
    .line 218
    and-int/lit8 v10, p10, 0x20

    .line 219
    .line 220
    if-eqz v10, :cond_11

    .line 221
    .line 222
    and-int v2, v2, v17

    .line 223
    .line 224
    :cond_11
    and-int/lit8 v10, p10, 0x40

    .line 225
    .line 226
    if-eqz v10, :cond_12

    .line 227
    .line 228
    and-int v2, v2, v16

    .line 229
    .line 230
    :cond_12
    move-object v5, v15

    .line 231
    goto/16 :goto_12

    .line 232
    .line 233
    :cond_13
    :goto_c
    and-int/lit8 v10, p10, 0x20

    .line 234
    .line 235
    const v11, 0x671a9c9b

    .line 236
    .line 237
    .line 238
    const-string v14, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 239
    .line 240
    const v1, 0x70b323c8

    .line 241
    .line 242
    .line 243
    if-eqz v10, :cond_16

    .line 244
    .line 245
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 246
    .line 247
    .line 248
    sget-object v9, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 249
    .line 250
    sget v10, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 251
    .line 252
    invoke-virtual {v9, v12, v10}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    if-eqz v9, :cond_15

    .line 257
    .line 258
    invoke-static {v9, v12, v13}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 263
    .line 264
    .line 265
    instance-of v11, v9, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 266
    .line 267
    if-eqz v11, :cond_14

    .line 268
    .line 269
    move-object v11, v9

    .line 270
    check-cast v11, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 271
    .line 272
    invoke-interface {v11}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 273
    .line 274
    .line 275
    move-result-object v11

    .line 276
    :goto_d
    move/from16 v18, v13

    .line 277
    .line 278
    goto :goto_e

    .line 279
    :cond_14
    sget-object v11, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 280
    .line 281
    goto :goto_d

    .line 282
    :goto_e
    const v13, 0x9048

    .line 283
    .line 284
    .line 285
    move-object/from16 v19, v14

    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const-class v7, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;

    .line 289
    .line 290
    move-object v8, v9

    .line 291
    const/4 v9, 0x0

    .line 292
    move/from16 v0, v18

    .line 293
    .line 294
    move-object/from16 v1, v19

    .line 295
    .line 296
    invoke-static/range {v7 .. v14}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 301
    .line 302
    .line 303
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 304
    .line 305
    .line 306
    check-cast v7, Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;

    .line 307
    .line 308
    and-int v2, v2, v17

    .line 309
    .line 310
    move/from16 v17, v2

    .line 311
    .line 312
    move-object v2, v7

    .line 313
    goto :goto_f

    .line 314
    :cond_15
    move-object v1, v14

    .line 315
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 316
    .line 317
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    throw v0

    .line 321
    :cond_16
    move v0, v13

    .line 322
    move-object v1, v14

    .line 323
    move/from16 v17, v2

    .line 324
    .line 325
    move-object v2, v9

    .line 326
    :goto_f
    and-int/lit8 v7, p10, 0x40

    .line 327
    .line 328
    if-eqz v7, :cond_19

    .line 329
    .line 330
    const v7, 0x70b323c8

    .line 331
    .line 332
    .line 333
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 334
    .line 335
    .line 336
    sget-object v7, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 337
    .line 338
    sget v8, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 339
    .line 340
    invoke-virtual {v7, v12, v8}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 341
    .line 342
    .line 343
    move-result-object v8

    .line 344
    if-eqz v8, :cond_18

    .line 345
    .line 346
    invoke-static {v8, v12, v0}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    const v0, 0x671a9c9b

    .line 351
    .line 352
    .line 353
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 354
    .line 355
    .line 356
    instance-of v0, v8, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 357
    .line 358
    if-eqz v0, :cond_17

    .line 359
    .line 360
    move-object v0, v8

    .line 361
    check-cast v0, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 362
    .line 363
    invoke-interface {v0}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    :goto_10
    move-object v11, v0

    .line 368
    goto :goto_11

    .line 369
    :cond_17
    sget-object v0, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 370
    .line 371
    goto :goto_10

    .line 372
    :goto_11
    const v13, 0x9048

    .line 373
    .line 374
    .line 375
    const/4 v14, 0x0

    .line 376
    const-class v7, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;

    .line 377
    .line 378
    const/4 v9, 0x0

    .line 379
    invoke-static/range {v7 .. v14}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 384
    .line 385
    .line 386
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 387
    .line 388
    .line 389
    check-cast v0, Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;

    .line 390
    .line 391
    and-int v1, v17, v16

    .line 392
    .line 393
    move-object v5, v0

    .line 394
    move-object v9, v2

    .line 395
    move v2, v1

    .line 396
    goto :goto_12

    .line 397
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 398
    .line 399
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    throw v0

    .line 403
    :cond_19
    move-object v9, v2

    .line 404
    move-object v5, v15

    .line 405
    move/from16 v2, v17

    .line 406
    .line 407
    :goto_12
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 408
    .line 409
    .line 410
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-eqz v0, :cond_1a

    .line 415
    .line 416
    const/4 v0, -0x1

    .line 417
    const-string v1, "com.zykj.evaluation.ui.detail.revising.RevisingDetailPage (RevisingDetailPage.kt:21)"

    .line 418
    .line 419
    const v7, 0x39d7472a

    .line 420
    .line 421
    .line 422
    invoke-static {v7, v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 423
    .line 424
    .line 425
    :cond_1a
    and-int/lit16 v0, v2, 0x3fe

    .line 426
    .line 427
    shr-int/lit8 v1, v2, 0x6

    .line 428
    .line 429
    and-int/lit16 v7, v1, 0x1c00

    .line 430
    .line 431
    or-int/2addr v0, v7

    .line 432
    const v7, 0xe000

    .line 433
    .line 434
    .line 435
    and-int/2addr v1, v7

    .line 436
    or-int v15, v0, v1

    .line 437
    .line 438
    shr-int/lit8 v0, v2, 0x9

    .line 439
    .line 440
    and-int/lit8 v16, v0, 0x7e

    .line 441
    .line 442
    const/16 v17, 0x13e0

    .line 443
    .line 444
    const/4 v6, 0x0

    .line 445
    const/4 v7, 0x0

    .line 446
    const/4 v8, 0x0

    .line 447
    move-object v4, v9

    .line 448
    const/4 v9, 0x0

    .line 449
    const/4 v10, 0x0

    .line 450
    const/4 v13, 0x0

    .line 451
    move-wide/from16 v0, p0

    .line 452
    .line 453
    move-object/from16 v2, p2

    .line 454
    .line 455
    move-object/from16 v11, p4

    .line 456
    .line 457
    move-object v14, v12

    .line 458
    move-object/from16 v12, p5

    .line 459
    .line 460
    invoke-static/range {v0 .. v17}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->m0(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    .line 461
    .line 462
    .line 463
    move-object v12, v14

    .line 464
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    if-eqz v0, :cond_1b

    .line 469
    .line 470
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 471
    .line 472
    .line 473
    :cond_1b
    move-object v7, v4

    .line 474
    move-object v8, v5

    .line 475
    goto :goto_13

    .line 476
    :cond_1c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 477
    .line 478
    .line 479
    move-object v7, v9

    .line 480
    move-object v8, v15

    .line 481
    :goto_13
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 482
    .line 483
    .line 484
    move-result-object v11

    .line 485
    if-eqz v11, :cond_1d

    .line 486
    .line 487
    new-instance v0, La6/a;

    .line 488
    .line 489
    move-wide/from16 v1, p0

    .line 490
    .line 491
    move-object/from16 v3, p2

    .line 492
    .line 493
    move-object/from16 v4, p3

    .line 494
    .line 495
    move-object/from16 v5, p4

    .line 496
    .line 497
    move-object/from16 v6, p5

    .line 498
    .line 499
    move/from16 v9, p9

    .line 500
    .line 501
    move/from16 v10, p10

    .line 502
    .line 503
    invoke-direct/range {v0 .. v10}, La6/a;-><init>(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;II)V

    .line 504
    .line 505
    .line 506
    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 507
    .line 508
    .line 509
    :cond_1d
    return-void
.end method

.method public static final c(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 12

    .line 1
    or-int/lit8 v0, p8, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v10

    .line 7
    move-wide v1, p0

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object/from16 v5, p4

    .line 11
    .line 12
    move-object/from16 v6, p5

    .line 13
    .line 14
    move-object/from16 v7, p6

    .line 15
    .line 16
    move-object/from16 v8, p7

    .line 17
    .line 18
    move/from16 v11, p9

    .line 19
    .line 20
    move-object/from16 v9, p10

    .line 21
    .line 22
    invoke-static/range {v1 .. v11}, La6/b;->b(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;Landroidx/compose/runtime/Composer;II)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0
.end method

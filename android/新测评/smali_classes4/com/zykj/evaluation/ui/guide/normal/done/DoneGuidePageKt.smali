.class public abstract Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuidePageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/navigation/NavController;JZLcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuidePageKt;->e(Landroidx/navigation/NavController;JZLcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/navigation/NavController;JZJ)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuidePageKt;->d(Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/navigation/NavController;JZJ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/navigation/NavController;JZLcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v9, p6

    .line 4
    .line 5
    const-string v1, "navController"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v1, -0x24de737d

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p5

    .line 14
    .line 15
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v15

    .line 19
    and-int/lit8 v2, v9, 0x6

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x2

    .line 32
    :goto_0
    or-int/2addr v2, v9

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v9

    .line 35
    :goto_1
    and-int/lit8 v3, p7, 0x2

    .line 36
    .line 37
    const/16 v4, 0x20

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    or-int/lit8 v2, v2, 0x30

    .line 42
    .line 43
    :cond_2
    move-wide/from16 v5, p1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v5, v9, 0x30

    .line 47
    .line 48
    if-nez v5, :cond_2

    .line 49
    .line 50
    move-wide/from16 v5, p1

    .line 51
    .line 52
    invoke-interface {v15, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    move v7, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/16 v7, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v2, v7

    .line 63
    :goto_3
    and-int/lit8 v7, p7, 0x4

    .line 64
    .line 65
    const/16 v8, 0x100

    .line 66
    .line 67
    if-eqz v7, :cond_6

    .line 68
    .line 69
    or-int/lit16 v2, v2, 0x180

    .line 70
    .line 71
    :cond_5
    move/from16 v10, p3

    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_6
    and-int/lit16 v10, v9, 0x180

    .line 75
    .line 76
    if-nez v10, :cond_5

    .line 77
    .line 78
    move/from16 v10, p3

    .line 79
    .line 80
    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_7

    .line 85
    .line 86
    move v11, v8

    .line 87
    goto :goto_4

    .line 88
    :cond_7
    const/16 v11, 0x80

    .line 89
    .line 90
    :goto_4
    or-int/2addr v2, v11

    .line 91
    :goto_5
    and-int/lit16 v11, v9, 0xc00

    .line 92
    .line 93
    if-nez v11, :cond_a

    .line 94
    .line 95
    and-int/lit8 v11, p7, 0x8

    .line 96
    .line 97
    if-nez v11, :cond_8

    .line 98
    .line 99
    move-object/from16 v11, p4

    .line 100
    .line 101
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    if-eqz v12, :cond_9

    .line 106
    .line 107
    const/16 v12, 0x800

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_8
    move-object/from16 v11, p4

    .line 111
    .line 112
    :cond_9
    const/16 v12, 0x400

    .line 113
    .line 114
    :goto_6
    or-int/2addr v2, v12

    .line 115
    goto :goto_7

    .line 116
    :cond_a
    move-object/from16 v11, p4

    .line 117
    .line 118
    :goto_7
    and-int/lit16 v12, v2, 0x493

    .line 119
    .line 120
    const/16 v13, 0x492

    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/16 v18, 0x1

    .line 124
    .line 125
    if-eq v12, v13, :cond_b

    .line 126
    .line 127
    move/from16 v12, v18

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_b
    move v12, v14

    .line 131
    :goto_8
    and-int/lit8 v13, v2, 0x1

    .line 132
    .line 133
    invoke-interface {v15, v12, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-eqz v12, :cond_1d

    .line 138
    .line 139
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 140
    .line 141
    .line 142
    and-int/lit8 v12, v9, 0x1

    .line 143
    .line 144
    if-eqz v12, :cond_e

    .line 145
    .line 146
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    if-eqz v12, :cond_c

    .line 151
    .line 152
    goto :goto_a

    .line 153
    :cond_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 154
    .line 155
    .line 156
    and-int/lit8 v3, p7, 0x8

    .line 157
    .line 158
    if-eqz v3, :cond_d

    .line 159
    .line 160
    and-int/lit16 v2, v2, -0x1c01

    .line 161
    .line 162
    :cond_d
    move-object v3, v11

    .line 163
    move v7, v14

    .line 164
    :goto_9
    move v11, v2

    .line 165
    goto :goto_e

    .line 166
    :cond_e
    :goto_a
    if-eqz v3, :cond_f

    .line 167
    .line 168
    const-wide/32 v5, 0x15ce31

    .line 169
    .line 170
    .line 171
    :cond_f
    if-eqz v7, :cond_10

    .line 172
    .line 173
    move v3, v14

    .line 174
    goto :goto_b

    .line 175
    :cond_10
    move v3, v10

    .line 176
    :goto_b
    and-int/lit8 v7, p7, 0x8

    .line 177
    .line 178
    if-eqz v7, :cond_13

    .line 179
    .line 180
    const v7, 0x70b323c8

    .line 181
    .line 182
    .line 183
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 184
    .line 185
    .line 186
    sget-object v7, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 187
    .line 188
    sget v10, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 189
    .line 190
    invoke-virtual {v7, v15, v10}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    if-eqz v11, :cond_12

    .line 195
    .line 196
    invoke-static {v11, v15, v14}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    const v7, 0x671a9c9b

    .line 201
    .line 202
    .line 203
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 204
    .line 205
    .line 206
    instance-of v7, v11, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 207
    .line 208
    if-eqz v7, :cond_11

    .line 209
    .line 210
    move-object v7, v11

    .line 211
    check-cast v7, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 212
    .line 213
    invoke-interface {v7}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    goto :goto_c

    .line 218
    :cond_11
    sget-object v7, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 219
    .line 220
    :goto_c
    const v16, 0x9048

    .line 221
    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const-class v10, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    .line 226
    .line 227
    const/4 v12, 0x0

    .line 228
    move/from16 v19, v14

    .line 229
    .line 230
    move-object v14, v7

    .line 231
    move/from16 v7, v19

    .line 232
    .line 233
    invoke-static/range {v10 .. v17}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 238
    .line 239
    .line 240
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 241
    .line 242
    .line 243
    check-cast v10, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    .line 244
    .line 245
    and-int/lit16 v2, v2, -0x1c01

    .line 246
    .line 247
    move-object v11, v10

    .line 248
    :goto_d
    move v10, v3

    .line 249
    move-object v3, v11

    .line 250
    goto :goto_9

    .line 251
    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 252
    .line 253
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 254
    .line 255
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw v0

    .line 259
    :cond_13
    move v7, v14

    .line 260
    goto :goto_d

    .line 261
    :goto_e
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 262
    .line 263
    .line 264
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_14

    .line 269
    .line 270
    const/4 v2, -0x1

    .line 271
    const-string v12, "com.zykj.evaluation.ui.guide.normal.done.DoneGuidePage (DoneGuidePage.kt:17)"

    .line 272
    .line 273
    invoke-static {v1, v11, v2, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :cond_14
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 277
    .line 278
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    and-int/lit16 v12, v11, 0x380

    .line 283
    .line 284
    if-ne v12, v8, :cond_15

    .line 285
    .line 286
    move/from16 v14, v18

    .line 287
    .line 288
    goto :goto_f

    .line 289
    :cond_15
    move v14, v7

    .line 290
    :goto_f
    or-int/2addr v2, v14

    .line 291
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    if-nez v2, :cond_16

    .line 296
    .line 297
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 298
    .line 299
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    if-ne v13, v2, :cond_17

    .line 304
    .line 305
    :cond_16
    new-instance v13, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuidePageKt$DoneGuidePage$1$1;

    .line 306
    .line 307
    const/4 v2, 0x0

    .line 308
    invoke-direct {v13, v3, v10, v2}, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuidePageKt$DoneGuidePage$1$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;ZLkotlin/coroutines/Continuation;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v15, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_17
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 315
    .line 316
    const/4 v2, 0x6

    .line 317
    invoke-static {v1, v13, v15, v2}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    or-int/2addr v1, v2

    .line 329
    and-int/lit8 v2, v11, 0x70

    .line 330
    .line 331
    if-ne v2, v4, :cond_18

    .line 332
    .line 333
    move/from16 v14, v18

    .line 334
    .line 335
    goto :goto_10

    .line 336
    :cond_18
    move v14, v7

    .line 337
    :goto_10
    or-int/2addr v1, v14

    .line 338
    if-ne v12, v8, :cond_19

    .line 339
    .line 340
    move/from16 v14, v18

    .line 341
    .line 342
    goto :goto_11

    .line 343
    :cond_19
    move v14, v7

    .line 344
    :goto_11
    or-int/2addr v1, v14

    .line 345
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    if-nez v1, :cond_1b

    .line 350
    .line 351
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 352
    .line 353
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    if-ne v2, v1, :cond_1a

    .line 358
    .line 359
    goto :goto_12

    .line 360
    :cond_1a
    move-object v1, v3

    .line 361
    move-wide v3, v5

    .line 362
    goto :goto_13

    .line 363
    :cond_1b
    :goto_12
    new-instance v0, Ll6/a;

    .line 364
    .line 365
    move-object/from16 v2, p0

    .line 366
    .line 367
    move-object v1, v3

    .line 368
    move-wide v3, v5

    .line 369
    move v5, v10

    .line 370
    invoke-direct/range {v0 .. v5}, Ll6/a;-><init>(Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/navigation/NavController;JZ)V

    .line 371
    .line 372
    .line 373
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    move-object v2, v0

    .line 377
    :goto_13
    move-object v5, v2

    .line 378
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 379
    .line 380
    and-int/lit8 v0, v11, 0x7e

    .line 381
    .line 382
    shr-int/lit8 v2, v11, 0x3

    .line 383
    .line 384
    and-int/lit16 v2, v2, 0x380

    .line 385
    .line 386
    or-int v7, v0, v2

    .line 387
    .line 388
    const/16 v8, 0x8

    .line 389
    .line 390
    move-wide/from16 v19, v3

    .line 391
    .line 392
    move-object v3, v1

    .line 393
    move-wide/from16 v1, v19

    .line 394
    .line 395
    const/4 v4, 0x0

    .line 396
    move-object/from16 v0, p0

    .line 397
    .line 398
    move-object v6, v15

    .line 399
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->g(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 400
    .line 401
    .line 402
    move-object v1, v3

    .line 403
    move-wide/from16 v3, v19

    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    if-eqz v0, :cond_1c

    .line 410
    .line 411
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 412
    .line 413
    .line 414
    :cond_1c
    move-object v5, v1

    .line 415
    move-wide v2, v3

    .line 416
    :goto_14
    move v4, v10

    .line 417
    goto :goto_15

    .line 418
    :cond_1d
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 419
    .line 420
    .line 421
    move-wide v2, v5

    .line 422
    move-object v5, v11

    .line 423
    goto :goto_14

    .line 424
    :goto_15
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    if-eqz v8, :cond_1e

    .line 429
    .line 430
    new-instance v0, Ll6/b;

    .line 431
    .line 432
    move-object/from16 v1, p0

    .line 433
    .line 434
    move/from16 v7, p7

    .line 435
    .line 436
    move v6, v9

    .line 437
    invoke-direct/range {v0 .. v7}, Ll6/b;-><init>(Landroidx/navigation/NavController;JZLcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;II)V

    .line 438
    .line 439
    .line 440
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 441
    .line 442
    .line 443
    :cond_1e
    return-void
.end method

.method public static final d(Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/navigation/NavController;JZJ)Lkotlin/Unit;
    .locals 6

    .line 1
    invoke-virtual {p0, p5, p6}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->N(J)Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lg7/b;->a()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object p5

    .line 11
    const-string p6, "KEY_DETAIL_BUNDLE"

    .line 12
    .line 13
    invoke-virtual {p5, p6, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string p5, "DETAIL_DONE/"

    .line 22
    .line 23
    invoke-virtual {p0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p2, "/"

    .line 30
    .line 31
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v4, 0x6

    .line 42
    const/4 v5, 0x0

    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    move-object v0, p1

    .line 46
    invoke-static/range {v0 .. v5}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0
.end method

.method public static final e(Landroidx/navigation/NavController;JZLcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    .line 1
    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuidePageKt;->c(Landroidx/navigation/NavController;JZLcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

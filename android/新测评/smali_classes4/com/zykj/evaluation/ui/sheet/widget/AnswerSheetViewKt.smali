.class public abstract Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic A(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->X(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->E(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final C(Landroidx/compose/ui/Modifier;Lv6/w;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v8, p3

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    move/from16 v9, p8

    .line 10
    .line 11
    const-string v3, "answerSheetType"

    .line 12
    .line 13
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v3, "requestPermission"

    .line 17
    .line 18
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v3, "onSuccess"

    .line 22
    .line 23
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v3, "onFailed"

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v3, 0x38b2a059

    .line 32
    .line 33
    .line 34
    move-object/from16 v4, p7

    .line 35
    .line 36
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 37
    .line 38
    .line 39
    move-result-object v13

    .line 40
    and-int/lit8 v4, p9, 0x1

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    or-int/lit8 v5, v9, 0x6

    .line 45
    .line 46
    move v6, v5

    .line 47
    move-object/from16 v5, p0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    and-int/lit8 v5, v9, 0x6

    .line 51
    .line 52
    if-nez v5, :cond_2

    .line 53
    .line 54
    move-object/from16 v5, p0

    .line 55
    .line 56
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    const/4 v6, 0x4

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 v6, 0x2

    .line 65
    :goto_0
    or-int/2addr v6, v9

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move-object/from16 v5, p0

    .line 68
    .line 69
    move v6, v9

    .line 70
    :goto_1
    and-int/lit8 v7, v9, 0x30

    .line 71
    .line 72
    if-nez v7, :cond_4

    .line 73
    .line 74
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    const/16 v7, 0x20

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    const/16 v7, 0x10

    .line 84
    .line 85
    :goto_2
    or-int/2addr v6, v7

    .line 86
    :cond_4
    and-int/lit8 v7, p9, 0x4

    .line 87
    .line 88
    if-eqz v7, :cond_6

    .line 89
    .line 90
    or-int/lit16 v6, v6, 0x180

    .line 91
    .line 92
    :cond_5
    move/from16 v11, p2

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    and-int/lit16 v11, v9, 0x180

    .line 96
    .line 97
    if-nez v11, :cond_5

    .line 98
    .line 99
    move/from16 v11, p2

    .line 100
    .line 101
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    if-eqz v12, :cond_7

    .line 106
    .line 107
    const/16 v12, 0x100

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_7
    const/16 v12, 0x80

    .line 111
    .line 112
    :goto_3
    or-int/2addr v6, v12

    .line 113
    :goto_4
    and-int/lit16 v12, v9, 0xc00

    .line 114
    .line 115
    if-nez v12, :cond_9

    .line 116
    .line 117
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    if-eqz v12, :cond_8

    .line 122
    .line 123
    const/16 v12, 0x800

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_8
    const/16 v12, 0x400

    .line 127
    .line 128
    :goto_5
    or-int/2addr v6, v12

    .line 129
    :cond_9
    and-int/lit16 v12, v9, 0x6000

    .line 130
    .line 131
    if-nez v12, :cond_b

    .line 132
    .line 133
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v12

    .line 137
    if-eqz v12, :cond_a

    .line 138
    .line 139
    const/16 v12, 0x4000

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_a
    const/16 v12, 0x2000

    .line 143
    .line 144
    :goto_6
    or-int/2addr v6, v12

    .line 145
    :cond_b
    const/high16 v12, 0x30000

    .line 146
    .line 147
    and-int/2addr v12, v9

    .line 148
    if-nez v12, :cond_d

    .line 149
    .line 150
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-eqz v12, :cond_c

    .line 155
    .line 156
    const/high16 v12, 0x20000

    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_c
    const/high16 v12, 0x10000

    .line 160
    .line 161
    :goto_7
    or-int/2addr v6, v12

    .line 162
    :cond_d
    const/high16 v12, 0x180000

    .line 163
    .line 164
    and-int/2addr v12, v9

    .line 165
    if-nez v12, :cond_10

    .line 166
    .line 167
    and-int/lit8 v12, p9, 0x40

    .line 168
    .line 169
    if-nez v12, :cond_e

    .line 170
    .line 171
    move-object/from16 v12, p6

    .line 172
    .line 173
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-eqz v14, :cond_f

    .line 178
    .line 179
    const/high16 v14, 0x100000

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_e
    move-object/from16 v12, p6

    .line 183
    .line 184
    :cond_f
    const/high16 v14, 0x80000

    .line 185
    .line 186
    :goto_8
    or-int/2addr v6, v14

    .line 187
    goto :goto_9

    .line 188
    :cond_10
    move-object/from16 v12, p6

    .line 189
    .line 190
    :goto_9
    const v14, 0x92493

    .line 191
    .line 192
    .line 193
    and-int/2addr v14, v6

    .line 194
    const v15, 0x92492

    .line 195
    .line 196
    .line 197
    const/16 v16, 0x0

    .line 198
    .line 199
    const/16 v17, 0x1

    .line 200
    .line 201
    if-eq v14, v15, :cond_11

    .line 202
    .line 203
    move/from16 v14, v17

    .line 204
    .line 205
    goto :goto_a

    .line 206
    :cond_11
    move/from16 v14, v16

    .line 207
    .line 208
    :goto_a
    and-int/lit8 v15, v6, 0x1

    .line 209
    .line 210
    invoke-interface {v13, v14, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-eqz v14, :cond_22

    .line 215
    .line 216
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 217
    .line 218
    .line 219
    and-int/lit8 v14, v9, 0x1

    .line 220
    .line 221
    const v15, -0x380001

    .line 222
    .line 223
    .line 224
    if-eqz v14, :cond_14

    .line 225
    .line 226
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    if-eqz v14, :cond_12

    .line 231
    .line 232
    goto :goto_b

    .line 233
    :cond_12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 234
    .line 235
    .line 236
    and-int/lit8 v4, p9, 0x40

    .line 237
    .line 238
    if-eqz v4, :cond_13

    .line 239
    .line 240
    and-int/2addr v6, v15

    .line 241
    :cond_13
    move v14, v6

    .line 242
    move-object v4, v12

    .line 243
    move v12, v11

    .line 244
    move-object v11, v5

    .line 245
    goto :goto_d

    .line 246
    :cond_14
    :goto_b
    if-eqz v4, :cond_15

    .line 247
    .line 248
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 249
    .line 250
    goto :goto_c

    .line 251
    :cond_15
    move-object v4, v5

    .line 252
    :goto_c
    if-eqz v7, :cond_16

    .line 253
    .line 254
    move/from16 v11, v16

    .line 255
    .line 256
    :cond_16
    and-int/lit8 v5, p9, 0x40

    .line 257
    .line 258
    if-eqz v5, :cond_17

    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    check-cast v5, Landroidx/lifecycle/LifecycleOwner;

    .line 269
    .line 270
    and-int/2addr v6, v15

    .line 271
    move v14, v6

    .line 272
    move v12, v11

    .line 273
    move-object v11, v4

    .line 274
    move-object v4, v5

    .line 275
    goto :goto_d

    .line 276
    :cond_17
    move v14, v11

    .line 277
    move-object v11, v4

    .line 278
    move-object v4, v12

    .line 279
    move v12, v14

    .line 280
    move v14, v6

    .line 281
    :goto_d
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 282
    .line 283
    .line 284
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    if-eqz v5, :cond_18

    .line 289
    .line 290
    const/4 v5, -0x1

    .line 291
    const-string v6, "com.zykj.evaluation.ui.sheet.widget.AnswerSheetView (AnswerSheetView.kt:31)"

    .line 292
    .line 293
    invoke-static {v3, v14, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 294
    .line 295
    .line 296
    :cond_18
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    move-object v5, v3

    .line 305
    check-cast v5, Landroid/content/Context;

    .line 306
    .line 307
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 312
    .line 313
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    if-ne v3, v6, :cond_19

    .line 318
    .line 319
    new-instance v18, Lb7/l;

    .line 320
    .line 321
    const/16 v26, 0x7f

    .line 322
    .line 323
    const/16 v27, 0x0

    .line 324
    .line 325
    const/16 v19, 0x0

    .line 326
    .line 327
    const/16 v20, 0x0

    .line 328
    .line 329
    const/16 v21, 0x0

    .line 330
    .line 331
    const/16 v22, 0x0

    .line 332
    .line 333
    const/16 v23, 0x0

    .line 334
    .line 335
    const/16 v24, 0x0

    .line 336
    .line 337
    const/16 v25, 0x0

    .line 338
    .line 339
    invoke-direct/range {v18 .. v27}, Lb7/l;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v3, v18

    .line 343
    .line 344
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :cond_19
    move-object v6, v3

    .line 348
    check-cast v6, Lb7/l;

    .line 349
    .line 350
    new-instance v7, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 351
    .line 352
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 353
    .line 354
    .line 355
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v10

    .line 363
    if-ne v3, v10, :cond_1a

    .line 364
    .line 365
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 366
    .line 367
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    :cond_1a
    check-cast v3, Ljava/lang/Boolean;

    .line 371
    .line 372
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 373
    .line 374
    .line 375
    move-result v3

    .line 376
    iput-boolean v3, v7, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 377
    .line 378
    new-instance v3, Lb7/m;

    .line 379
    .line 380
    invoke-direct/range {v3 .. v8}, Lb7/m;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;)V

    .line 381
    .line 382
    .line 383
    shr-int/lit8 v5, v14, 0x12

    .line 384
    .line 385
    and-int/lit8 v5, v5, 0xe

    .line 386
    .line 387
    invoke-static {v4, v3, v13, v5}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 388
    .line 389
    .line 390
    instance-of v3, v2, Lv6/w$c;

    .line 391
    .line 392
    if-eqz v3, :cond_1b

    .line 393
    .line 394
    const v3, -0x29734849

    .line 395
    .line 396
    .line 397
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 398
    .line 399
    .line 400
    new-instance v10, Lb7/x;

    .line 401
    .line 402
    invoke-direct {v10, v6, v0, v1, v7}, Lb7/x;-><init>(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 403
    .line 404
    .line 405
    shl-int/lit8 v3, v14, 0x3

    .line 406
    .line 407
    and-int/lit8 v14, v3, 0x70

    .line 408
    .line 409
    const/4 v15, 0x4

    .line 410
    move v3, v12

    .line 411
    const/4 v12, 0x0

    .line 412
    invoke-static/range {v10 .. v15}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->AndroidViewBinding(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 413
    .line 414
    .line 415
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 416
    .line 417
    .line 418
    goto :goto_e

    .line 419
    :cond_1b
    move v3, v12

    .line 420
    instance-of v5, v2, Lv6/w$d;

    .line 421
    .line 422
    if-eqz v5, :cond_1c

    .line 423
    .line 424
    const v5, -0x4dedaed

    .line 425
    .line 426
    .line 427
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 428
    .line 429
    .line 430
    new-instance v10, Lb7/g0;

    .line 431
    .line 432
    invoke-direct {v10, v6, v0, v1, v7}, Lb7/g0;-><init>(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 433
    .line 434
    .line 435
    shl-int/lit8 v5, v14, 0x3

    .line 436
    .line 437
    and-int/lit8 v14, v5, 0x70

    .line 438
    .line 439
    const/4 v15, 0x4

    .line 440
    const/4 v12, 0x0

    .line 441
    invoke-static/range {v10 .. v15}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->AndroidViewBinding(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 442
    .line 443
    .line 444
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 445
    .line 446
    .line 447
    goto :goto_e

    .line 448
    :cond_1c
    instance-of v5, v2, Lv6/w$a;

    .line 449
    .line 450
    if-eqz v5, :cond_20

    .line 451
    .line 452
    const v5, -0x4c62006

    .line 453
    .line 454
    .line 455
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 456
    .line 457
    .line 458
    new-instance v10, Lb7/h0;

    .line 459
    .line 460
    invoke-direct {v10, v6, v0, v1, v7}, Lb7/h0;-><init>(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v5

    .line 467
    and-int/lit16 v7, v14, 0x380

    .line 468
    .line 469
    const/16 v8, 0x100

    .line 470
    .line 471
    if-ne v7, v8, :cond_1d

    .line 472
    .line 473
    move/from16 v16, v17

    .line 474
    .line 475
    :cond_1d
    or-int v5, v5, v16

    .line 476
    .line 477
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    if-nez v5, :cond_1e

    .line 482
    .line 483
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    if-ne v7, v5, :cond_1f

    .line 488
    .line 489
    :cond_1e
    new-instance v7, Lb7/i0;

    .line 490
    .line 491
    invoke-direct {v7, v6, v3}, Lb7/i0;-><init>(Lb7/l;I)V

    .line 492
    .line 493
    .line 494
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    :cond_1f
    move-object v12, v7

    .line 498
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 499
    .line 500
    shl-int/lit8 v5, v14, 0x3

    .line 501
    .line 502
    and-int/lit8 v14, v5, 0x70

    .line 503
    .line 504
    const/4 v15, 0x0

    .line 505
    invoke-static/range {v10 .. v15}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->AndroidViewBinding(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 506
    .line 507
    .line 508
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 509
    .line 510
    .line 511
    goto :goto_e

    .line 512
    :cond_20
    const v5, -0x4aea263

    .line 513
    .line 514
    .line 515
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 516
    .line 517
    .line 518
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 519
    .line 520
    .line 521
    :goto_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 522
    .line 523
    .line 524
    move-result v5

    .line 525
    if-eqz v5, :cond_21

    .line 526
    .line 527
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 528
    .line 529
    .line 530
    :cond_21
    move-object v7, v4

    .line 531
    goto :goto_f

    .line 532
    :cond_22
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 533
    .line 534
    .line 535
    move v3, v11

    .line 536
    move-object v7, v12

    .line 537
    move-object v11, v5

    .line 538
    :goto_f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 539
    .line 540
    .line 541
    move-result-object v10

    .line 542
    if-eqz v10, :cond_23

    .line 543
    .line 544
    new-instance v0, Lb7/j0;

    .line 545
    .line 546
    move-object/from16 v4, p3

    .line 547
    .line 548
    move-object/from16 v5, p4

    .line 549
    .line 550
    move-object v6, v1

    .line 551
    move v8, v9

    .line 552
    move-object v1, v11

    .line 553
    move/from16 v9, p9

    .line 554
    .line 555
    invoke-direct/range {v0 .. v9}, Lb7/j0;-><init>(Landroidx/compose/ui/Modifier;Lv6/w;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;II)V

    .line 556
    .line 557
    .line 558
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 559
    .line 560
    .line 561
    :cond_23
    return-void
.end method

.method public static final D(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;
    .locals 1

    .line 1
    const-string v0, "inflater"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parent"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p4, p5, p6}, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    new-instance p5, Lb7/y;

    .line 16
    .line 17
    invoke-direct {p5, p4}, Lb7/y;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p5}, Lb7/l;->r(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    new-instance p5, Lb7/z;

    .line 24
    .line 25
    invoke-direct {p5, p4}, Lb7/z;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p5}, Lb7/l;->t(Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    new-instance p5, Lb7/a0;

    .line 32
    .line 33
    invoke-direct {p5, p4}, Lb7/a0;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p5}, Lb7/l;->v(Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    .line 39
    new-instance p5, Lb7/b0;

    .line 40
    .line 41
    invoke-direct {p5, p4}, Lb7/b0;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p5}, Lb7/l;->w(Lkotlin/jvm/functions/Function2;)V

    .line 45
    .line 46
    .line 47
    new-instance p5, Lb7/c0;

    .line 48
    .line 49
    invoke-direct {p5, p4}, Lb7/c0;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p5}, Lb7/l;->u(Lkotlin/jvm/functions/Function0;)V

    .line 53
    .line 54
    .line 55
    new-instance p5, Lb7/d0;

    .line 56
    .line 57
    invoke-direct {p5, p4}, Lb7/d0;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p5}, Lb7/l;->x(Lkotlin/jvm/functions/Function0;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p4, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;->b:Lcom/zykj/camera/view/AnswerSheetView;

    .line 64
    .line 65
    new-instance p5, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt$a;

    .line 66
    .line 67
    invoke-direct {p5, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt$a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p5}, Lg5/f;->setDelegate(Lg5/f$d;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p4, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;->b:Lcom/zykj/camera/view/AnswerSheetView;

    .line 74
    .line 75
    new-instance p1, Lb7/e0;

    .line 76
    .line 77
    invoke-direct {p1, p3}, Lb7/e0;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lg5/f;->setOnLightStatusListener(Lg5/d;)V

    .line 81
    .line 82
    .line 83
    return-object p4
.end method

.method public static final E(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;->b:Lcom/zykj/camera/view/AnswerSheetView;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg5/f;->i()V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final F(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;->b:Lcom/zykj/camera/view/AnswerSheetView;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg5/f;->o()V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final G(Lkotlin/jvm/internal/Ref$BooleanRef;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final H(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Lg5/f$d;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;->b:Lcom/zykj/camera/view/AnswerSheetView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lg5/f;->setDelegate(Lg5/f$d;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final I(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Lg5/d;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;->b:Lcom/zykj/camera/view/AnswerSheetView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lg5/f;->setOnLightStatusListener(Lg5/d;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final J(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;->b:Lcom/zykj/camera/view/AnswerSheetView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg5/f;->l(Z)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final K(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;ZLjava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "tip"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;->b:Lcom/zykj/camera/view/AnswerSheetView;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Lg5/f;->m(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final L(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;
    .locals 1

    .line 1
    const-string v0, "inflater"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parent"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p4, p5, p6}, Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    new-instance p5, Lb7/p;

    .line 16
    .line 17
    invoke-direct {p5, p4}, Lb7/p;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p5}, Lb7/l;->r(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    new-instance p5, Lb7/q;

    .line 24
    .line 25
    invoke-direct {p5, p4}, Lb7/q;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p5}, Lb7/l;->t(Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    new-instance p5, Lb7/r;

    .line 32
    .line 33
    invoke-direct {p5, p4}, Lb7/r;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p5}, Lb7/l;->v(Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    .line 39
    new-instance p5, Lb7/s;

    .line 40
    .line 41
    invoke-direct {p5, p4}, Lb7/s;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p5}, Lb7/l;->w(Lkotlin/jvm/functions/Function2;)V

    .line 45
    .line 46
    .line 47
    new-instance p5, Lb7/t;

    .line 48
    .line 49
    invoke-direct {p5, p4}, Lb7/t;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p5}, Lb7/l;->u(Lkotlin/jvm/functions/Function0;)V

    .line 53
    .line 54
    .line 55
    new-instance p5, Lb7/u;

    .line 56
    .line 57
    invoke-direct {p5, p4}, Lb7/u;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p5}, Lb7/l;->x(Lkotlin/jvm/functions/Function0;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p4, Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;->b:Lcom/zykj/camera/view/AnswerSheetTrebleView;

    .line 64
    .line 65
    new-instance p5, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt$b;

    .line 66
    .line 67
    invoke-direct {p5, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt$b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p5}, Lg5/f;->setDelegate(Lg5/f$d;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p4, Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;->b:Lcom/zykj/camera/view/AnswerSheetTrebleView;

    .line 74
    .line 75
    new-instance p1, Lb7/v;

    .line 76
    .line 77
    invoke-direct {p1, p3}, Lb7/v;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lg5/f;->setOnLightStatusListener(Lg5/d;)V

    .line 81
    .line 82
    .line 83
    return-object p4
.end method

.method public static final M(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Lg5/f$d;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;->b:Lcom/zykj/camera/view/AnswerSheetTrebleView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lg5/f;->setDelegate(Lg5/f$d;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final N(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Lg5/d;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;->b:Lcom/zykj/camera/view/AnswerSheetTrebleView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lg5/f;->setOnLightStatusListener(Lg5/d;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final O(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;->b:Lcom/zykj/camera/view/AnswerSheetTrebleView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg5/f;->l(Z)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final P(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;ZLjava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "tip"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;->b:Lcom/zykj/camera/view/AnswerSheetTrebleView;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Lg5/f;->m(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final Q(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;->b:Lcom/zykj/camera/view/AnswerSheetTrebleView;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg5/f;->i()V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final R(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;->b:Lcom/zykj/camera/view/AnswerSheetTrebleView;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg5/f;->o()V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final S(Lkotlin/jvm/internal/Ref$BooleanRef;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final T(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;
    .locals 1

    .line 1
    const-string v0, "inflater"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parent"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p4, p5, p6}, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    new-instance p5, Lb7/k0;

    .line 16
    .line 17
    invoke-direct {p5, p4}, Lb7/k0;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p5}, Lb7/l;->v(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    new-instance p5, Lb7/l0;

    .line 24
    .line 25
    invoke-direct {p5, p4}, Lb7/l0;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p5}, Lb7/l;->w(Lkotlin/jvm/functions/Function2;)V

    .line 29
    .line 30
    .line 31
    new-instance p5, Lb7/m0;

    .line 32
    .line 33
    invoke-direct {p5, p4}, Lb7/m0;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p5}, Lb7/l;->u(Lkotlin/jvm/functions/Function0;)V

    .line 37
    .line 38
    .line 39
    new-instance p5, Lb7/n0;

    .line 40
    .line 41
    invoke-direct {p5, p4}, Lb7/n0;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p5}, Lb7/l;->x(Lkotlin/jvm/functions/Function0;)V

    .line 45
    .line 46
    .line 47
    new-instance p5, Lb7/n;

    .line 48
    .line 49
    invoke-direct {p5, p4}, Lb7/n;-><init>(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p5}, Lb7/l;->s(Lkotlin/jvm/functions/Function1;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p4, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;->b:Lcom/zykj/camera/view/AnswerSheetCompositionView;

    .line 56
    .line 57
    new-instance p5, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt$c;

    .line 58
    .line 59
    invoke-direct {p5, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt$c;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p5}, Lg5/f;->setDelegate(Lg5/f$d;)V

    .line 63
    .line 64
    .line 65
    iget-object p0, p4, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;->b:Lcom/zykj/camera/view/AnswerSheetCompositionView;

    .line 66
    .line 67
    new-instance p1, Lb7/o;

    .line 68
    .line 69
    invoke-direct {p1, p3}, Lb7/o;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lg5/f;->setOnLightStatusListener(Lg5/d;)V

    .line 73
    .line 74
    .line 75
    return-object p4
.end method

.method public static final U(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;->b:Lcom/zykj/camera/view/AnswerSheetCompositionView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg5/f;->l(Z)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final V(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;ZLjava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "tip"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;->b:Lcom/zykj/camera/view/AnswerSheetCompositionView;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Lg5/f;->m(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final W(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;->b:Lcom/zykj/camera/view/AnswerSheetCompositionView;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg5/f;->i()V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final X(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;->b:Lcom/zykj/camera/view/AnswerSheetCompositionView;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg5/f;->o()V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final Y(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;I)Lkotlin/Unit;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;->b:Lcom/zykj/camera/view/AnswerSheetCompositionView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/camera/view/AnswerSheetCompositionView;->setIndex(I)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final Z(Lkotlin/jvm/internal/Ref$BooleanRef;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic a(Landroidx/lifecycle/Lifecycle$Event;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->e0(Landroidx/lifecycle/Lifecycle$Event;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final a0(Lb7/l;ILcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "$this$AndroidViewBinding"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lb7/l;->o()Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->W(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b0(Landroidx/compose/ui/Modifier;Lv6/w;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 11

    .line 1
    or-int/lit8 v0, p7, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v9

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move v3, p2

    .line 10
    move-object v4, p3

    .line 11
    move-object v5, p4

    .line 12
    move-object/from16 v6, p5

    .line 13
    .line 14
    move-object/from16 v7, p6

    .line 15
    .line 16
    move/from16 v10, p8

    .line 17
    .line 18
    move-object/from16 v8, p9

    .line 19
    .line 20
    invoke-static/range {v1 .. v10}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->C(Landroidx/compose/ui/Modifier;Lv6/w;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/runtime/Composer;II)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;ZLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->V(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;ZLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c0(Landroidx/lifecycle/LifecycleOwner;Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 1

    .line 1
    const-string v0, "$this$DisposableEffect"

    .line 2
    .line 3
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p5, Lb7/w;

    .line 7
    .line 8
    invoke-direct {p5, p1, p2, p3, p4}, Lb7/w;-><init>(Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p5}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt$AnswerSheetView$lambda$5$$inlined$onDispose$1;

    .line 19
    .line 20
    invoke-direct {p1, p0, p5}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt$AnswerSheetView$lambda$5$$inlined$onDispose$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/LifecycleEventObserver;)V

    .line 21
    .line 22
    .line 23
    return-object p1
.end method

.method public static synthetic d(Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->d0(Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    return-void
.end method

.method public static final d0(Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p4, "event"

    .line 7
    .line 8
    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p4, "android.permission.CAMERA"

    .line 12
    .line 13
    invoke-virtual {p0, p4}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_2

    .line 18
    .line 19
    sget-object p0, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    .line 20
    .line 21
    if-ne p5, p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lb7/l;->p()Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-boolean p1, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    sget-object p0, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    .line 38
    .line 39
    if-ne p5, p0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p1}, Lb7/l;->q()Lkotlin/jvm/functions/Function0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    new-instance p0, Lb7/f0;

    .line 50
    .line 51
    invoke-direct {p0, p5, p1, p2}, Lb7/f0;-><init>(Landroidx/lifecycle/Lifecycle$Event;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static synthetic e(Lb7/l;ILcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->a0(Lb7/l;ILcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e0(Landroidx/lifecycle/Lifecycle$Event;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;)Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lb7/l;->p()Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-boolean p1, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p2, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    .line 20
    .line 21
    if-ne p0, p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lb7/l;->q()Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Lg5/d;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->N(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Lg5/d;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Lg5/d;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->I(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Lg5/d;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->O(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/internal/Ref$BooleanRef;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->S(Lkotlin/jvm/internal/Ref$BooleanRef;Z)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->J(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->R(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/internal/Ref$BooleanRef;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->Z(Lkotlin/jvm/internal/Ref$BooleanRef;Z)V

    return-void
.end method

.method public static synthetic m(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->L(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->F(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->Q(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Landroidx/compose/ui/Modifier;Lv6/w;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->b0(Landroidx/compose/ui/Modifier;Lv6/w;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->D(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/internal/Ref$BooleanRef;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->G(Lkotlin/jvm/internal/Ref$BooleanRef;Z)V

    return-void
.end method

.method public static synthetic s(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;ZLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->K(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;ZLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Lg5/f$d;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->M(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;Lg5/f$d;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Lg5/f$d;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->H(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCommonBinding;Lg5/f$d;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->T(Lb7/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->U(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->Y(Lcom/zykj/evaluation/databinding/ViewAnswerSheetCompositionBinding;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;ZLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->P(Lcom/zykj/evaluation/databinding/ViewAnswerSheetTrebleBinding;ZLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Landroidx/lifecycle/LifecycleOwner;Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->c0(Landroidx/lifecycle/LifecycleOwner;Landroid/content/Context;Lb7/l;Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p0

    return-object p0
.end method

.class public abstract Lcom/zykj/mistake/feature/notebook/detail/x3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move/from16 v6, p3

    .line 6
    .line 7
    const-string v1, "state"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v7, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->l0:Lcom/zykj/mistake/feature/notebook/detail/l3;

    .line 13
    .line 14
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 15
    .line 16
    const-string v2, "onIntent"

    .line 17
    .line 18
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const v2, -0x79374385

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p2

    .line 25
    .line 26
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 27
    .line 28
    .line 29
    move-result-object v12

    .line 30
    and-int/lit8 v3, v6, 0x6

    .line 31
    .line 32
    const/4 v9, 0x2

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v3, v9

    .line 44
    :goto_0
    or-int/2addr v3, v6

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v3, v6

    .line 47
    :goto_1
    and-int/lit8 v5, v6, 0x30

    .line 48
    .line 49
    const/16 v10, 0x20

    .line 50
    .line 51
    if-nez v5, :cond_3

    .line 52
    .line 53
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    move v5, v10

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v5, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v3, v5

    .line 64
    :cond_3
    move v11, v3

    .line 65
    and-int/lit8 v3, v11, 0x13

    .line 66
    .line 67
    const/16 v5, 0x12

    .line 68
    .line 69
    const/4 v14, 0x0

    .line 70
    if-eq v3, v5, :cond_4

    .line 71
    .line 72
    const/4 v3, 0x1

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    move v3, v14

    .line 75
    :goto_3
    and-int/lit8 v5, v11, 0x1

    .line 76
    .line 77
    invoke-interface {v12, v3, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_60

    .line 82
    .line 83
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    const/4 v3, -0x1

    .line 90
    const-string v5, "com.zykj.mistake.feature.notebook.detail.MistakeDetailNewScreen (MistakeDetailNewScreen.kt:67)"

    .line 91
    .line 92
    invoke-static {v2, v11, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 100
    .line 101
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    const/4 v5, 0x0

    .line 106
    if-ne v2, v3, :cond_6

    .line 107
    .line 108
    invoke-static {v5, v5, v9, v5}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    check-cast v2, Landroidx/compose/runtime/MutableState;

    .line 116
    .line 117
    and-int/lit8 v3, v11, 0x70

    .line 118
    .line 119
    if-ne v3, v10, :cond_7

    .line 120
    .line 121
    const/16 v16, 0x1

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    move/from16 v16, v14

    .line 125
    .line 126
    :goto_4
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    if-nez v16, :cond_8

    .line 131
    .line 132
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    if-ne v5, v8, :cond_9

    .line 137
    .line 138
    :cond_8
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 139
    .line 140
    invoke-direct {v5, v4, v14}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_9
    check-cast v5, Lr6/a;

    .line 147
    .line 148
    const/16 v8, 0x186

    .line 149
    .line 150
    invoke-static {v5, v12, v8, v14}, Lcom/zykj/mistake/utils/e;->c(Lr6/a;Landroidx/compose/runtime/Composer;II)Lr6/a;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    iget-object v5, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    .line 155
    .line 156
    iget v9, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 159
    .line 160
    .line 161
    move-result v15

    .line 162
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 163
    .line 164
    .line 165
    move-result v15

    .line 166
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    or-int/2addr v5, v15

    .line 171
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    or-int/2addr v5, v9

    .line 176
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    if-nez v5, :cond_a

    .line 181
    .line 182
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-ne v9, v5, :cond_b

    .line 187
    .line 188
    :cond_a
    new-instance v9, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 189
    .line 190
    invoke-direct {v9}, Lcom/zykj/mistake/feature/notebook/detail/a5;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_b
    check-cast v9, Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 197
    .line 198
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    if-ne v5, v15, :cond_c

    .line 207
    .line 208
    sget-object v5, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 209
    .line 210
    invoke-static {v5, v12}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lh6/h;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/v;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_c
    check-cast v5, Lkotlinx/coroutines/v;

    .line 218
    .line 219
    iget-boolean v15, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->z:Z

    .line 220
    .line 221
    if-nez v15, :cond_e

    .line 222
    .line 223
    sget-object v15, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->REVIEW_RECOMMEND:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 224
    .line 225
    if-ne v1, v15, :cond_d

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_d
    move-object v1, v2

    .line 229
    move v2, v14

    .line 230
    goto :goto_6

    .line 231
    :cond_e
    :goto_5
    move-object v1, v2

    .line 232
    const/4 v2, 0x1

    .line 233
    :goto_6
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 234
    .line 235
    .line 236
    move-result v15

    .line 237
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v19

    .line 241
    or-int v15, v15, v19

    .line 242
    .line 243
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v19

    .line 247
    or-int v15, v15, v19

    .line 248
    .line 249
    if-ne v3, v10, :cond_f

    .line 250
    .line 251
    const/16 v19, 0x1

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_f
    move/from16 v19, v14

    .line 255
    .line 256
    :goto_7
    or-int v15, v15, v19

    .line 257
    .line 258
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    if-nez v15, :cond_10

    .line 263
    .line 264
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v15

    .line 268
    if-ne v13, v15, :cond_11

    .line 269
    .line 270
    :cond_10
    new-instance v13, Lcom/zykj/mistake/feature/notebook/detail/t3;

    .line 271
    .line 272
    invoke-direct {v13, v2, v5, v4, v9}, Lcom/zykj/mistake/feature/notebook/detail/t3;-><init>(ZLkotlinx/coroutines/v;Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/a5;)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    :cond_11
    check-cast v13, Lr6/c;

    .line 279
    .line 280
    iget-object v15, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->N:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$DraftNavigation;

    .line 281
    .line 282
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 287
    .line 288
    .line 289
    move-result v20

    .line 290
    or-int v5, v5, v20

    .line 291
    .line 292
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v20

    .line 296
    or-int v5, v5, v20

    .line 297
    .line 298
    if-ne v3, v10, :cond_12

    .line 299
    .line 300
    const/16 v20, 0x1

    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_12
    move/from16 v20, v14

    .line 304
    .line 305
    :goto_8
    or-int v5, v5, v20

    .line 306
    .line 307
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    if-nez v5, :cond_14

    .line 312
    .line 313
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    if-ne v10, v5, :cond_13

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_13
    move-object/from16 v26, v1

    .line 321
    .line 322
    move-object v1, v0

    .line 323
    move-object v0, v10

    .line 324
    move-object/from16 v10, v26

    .line 325
    .line 326
    move/from16 v26, v3

    .line 327
    .line 328
    move-object v3, v9

    .line 329
    const/4 v9, 0x0

    .line 330
    goto :goto_a

    .line 331
    :cond_14
    :goto_9
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;

    .line 332
    .line 333
    const/4 v5, 0x0

    .line 334
    move-object v10, v1

    .line 335
    move/from16 v26, v3

    .line 336
    .line 337
    move-object v3, v9

    .line 338
    const/4 v9, 0x0

    .line 339
    move-object/from16 v1, p0

    .line 340
    .line 341
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewScreenKt$MistakeDetailNewScreen$1$1;-><init>(Lcom/zykj/mistake/feature/notebook/detail/m3;ZLcom/zykj/mistake/feature/notebook/detail/a5;Lr6/c;Lh6/c;)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :goto_a
    check-cast v0, Lr6/e;

    .line 348
    .line 349
    invoke-static {v15, v0, v12, v14}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    const/16 v4, 0xa

    .line 361
    .line 362
    if-nez v0, :cond_15

    .line 363
    .line 364
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-ne v2, v0, :cond_16

    .line 369
    .line 370
    :cond_15
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 371
    .line 372
    invoke-direct {v2, v13, v4}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :cond_16
    check-cast v2, Lr6/a;

    .line 379
    .line 380
    const/4 v0, 0x1

    .line 381
    invoke-static {v14, v2, v12, v14, v0}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 382
    .line 383
    .line 384
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 385
    .line 386
    const/4 v15, 0x0

    .line 387
    invoke-static {v2, v15, v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 388
    .line 389
    .line 390
    move-result-object v27

    .line 391
    const-wide v21, 0xfff7f8faL

    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    invoke-static/range {v21 .. v22}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 397
    .line 398
    .line 399
    move-result-wide v28

    .line 400
    const/16 v31, 0x2

    .line 401
    .line 402
    const/16 v32, 0x0

    .line 403
    .line 404
    const/16 v30, 0x0

    .line 405
    .line 406
    invoke-static/range {v27 .. v32}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 411
    .line 412
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    invoke-static {v12, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 421
    .line 422
    .line 423
    move-result v9

    .line 424
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 425
    .line 426
    .line 427
    move-result-object v14

    .line 428
    invoke-static {v12, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 433
    .line 434
    move-object/from16 v34, v3

    .line 435
    .line 436
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 441
    .line 442
    .line 443
    move-result-object v27

    .line 444
    if-nez v27, :cond_17

    .line 445
    .line 446
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 447
    .line 448
    .line 449
    :cond_17
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 450
    .line 451
    .line 452
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 453
    .line 454
    .line 455
    move-result v27

    .line 456
    if-eqz v27, :cond_18

    .line 457
    .line 458
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 459
    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_18
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 463
    .line 464
    .line 465
    :goto_b
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-static {v15, v3, v4, v3, v14}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 474
    .line 475
    .line 476
    move-result v14

    .line 477
    if-nez v14, :cond_19

    .line 478
    .line 479
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v14

    .line 483
    move-object/from16 v27, v5

    .line 484
    .line 485
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v5

    .line 493
    if-nez v5, :cond_1a

    .line 494
    .line 495
    goto :goto_c

    .line 496
    :cond_19
    move-object/from16 v27, v5

    .line 497
    .line 498
    :goto_c
    invoke-static {v9, v3, v9, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 499
    .line 500
    .line 501
    :cond_1a
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 502
    .line 503
    .line 504
    move-result-object v4

    .line 505
    invoke-static {v3, v0, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 506
    .line 507
    .line 508
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 509
    .line 510
    const/4 v0, 0x0

    .line 511
    const/4 v3, 0x1

    .line 512
    const/4 v9, 0x0

    .line 513
    invoke-static {v2, v0, v3, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 518
    .line 519
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 524
    .line 525
    .line 526
    move-result-object v5

    .line 527
    const/4 v9, 0x0

    .line 528
    invoke-static {v3, v5, v12, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-static {v12, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 537
    .line 538
    .line 539
    move-result-object v9

    .line 540
    invoke-static {v12, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 545
    .line 546
    .line 547
    move-result-object v14

    .line 548
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 549
    .line 550
    .line 551
    move-result-object v28

    .line 552
    if-nez v28, :cond_1b

    .line 553
    .line 554
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 555
    .line 556
    .line 557
    :cond_1b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 558
    .line 559
    .line 560
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 561
    .line 562
    .line 563
    move-result v28

    .line 564
    if-eqz v28, :cond_1c

    .line 565
    .line 566
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 567
    .line 568
    .line 569
    goto :goto_d

    .line 570
    :cond_1c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 571
    .line 572
    .line 573
    :goto_d
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 574
    .line 575
    .line 576
    move-result-object v14

    .line 577
    invoke-static {v15, v14, v3, v14, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 582
    .line 583
    .line 584
    move-result v9

    .line 585
    if-nez v9, :cond_1d

    .line 586
    .line 587
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v9

    .line 591
    move-object/from16 v28, v0

    .line 592
    .line 593
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-nez v0, :cond_1e

    .line 602
    .line 603
    goto :goto_e

    .line 604
    :cond_1d
    move-object/from16 v28, v0

    .line 605
    .line 606
    :goto_e
    invoke-static {v5, v14, v5, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 607
    .line 608
    .line 609
    :cond_1e
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-static {v14, v4, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 614
    .line 615
    .line 616
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 617
    .line 618
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    if-ne v0, v3, :cond_1f

    .line 627
    .line 628
    new-instance v0, Landroidx/navigation/i;

    .line 629
    .line 630
    const/16 v3, 0xa

    .line 631
    .line 632
    invoke-direct {v0, v10, v3}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 633
    .line 634
    .line 635
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    :cond_1f
    check-cast v0, Lr6/c;

    .line 639
    .line 640
    const/16 v9, 0xe

    .line 641
    .line 642
    and-int/lit8 v5, v11, 0xe

    .line 643
    .line 644
    or-int/lit16 v3, v5, 0x180

    .line 645
    .line 646
    invoke-static {v1, v13, v0, v12, v3}, Lcom/zykj/mistake/feature/notebook/detail/s4;->c(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 647
    .line 648
    .line 649
    const/4 v0, 0x0

    .line 650
    const/4 v3, 0x0

    .line 651
    invoke-static {v0, v12, v3}, Ly4/g;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 652
    .line 653
    .line 654
    const/4 v4, 0x0

    .line 655
    const/4 v11, 0x1

    .line 656
    invoke-static {v2, v4, v11, v0}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 657
    .line 658
    .line 659
    move-result-object v35

    .line 660
    invoke-static/range {v21 .. v22}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 661
    .line 662
    .line 663
    move-result-wide v36

    .line 664
    const/16 v39, 0x2

    .line 665
    .line 666
    const/16 v40, 0x0

    .line 667
    .line 668
    const/16 v38, 0x0

    .line 669
    .line 670
    invoke-static/range {v35 .. v40}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 679
    .line 680
    .line 681
    move-result-object v11

    .line 682
    invoke-static {v4, v11, v12, v3}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 683
    .line 684
    .line 685
    move-result-object v4

    .line 686
    invoke-static {v12, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 687
    .line 688
    .line 689
    move-result v11

    .line 690
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 691
    .line 692
    .line 693
    move-result-object v3

    .line 694
    invoke-static {v12, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 699
    .line 700
    .line 701
    move-result-object v14

    .line 702
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 703
    .line 704
    .line 705
    move-result-object v21

    .line 706
    if-nez v21, :cond_20

    .line 707
    .line 708
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 709
    .line 710
    .line 711
    :cond_20
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 712
    .line 713
    .line 714
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 715
    .line 716
    .line 717
    move-result v21

    .line 718
    if-eqz v21, :cond_21

    .line 719
    .line 720
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 721
    .line 722
    .line 723
    goto :goto_f

    .line 724
    :cond_21
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 725
    .line 726
    .line 727
    :goto_f
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 728
    .line 729
    .line 730
    move-result-object v14

    .line 731
    invoke-static {v15, v14, v4, v14, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 732
    .line 733
    .line 734
    move-result-object v3

    .line 735
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 736
    .line 737
    .line 738
    move-result v4

    .line 739
    if-nez v4, :cond_22

    .line 740
    .line 741
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 746
    .line 747
    .line 748
    move-result-object v9

    .line 749
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v4

    .line 753
    if-nez v4, :cond_23

    .line 754
    .line 755
    :cond_22
    invoke-static {v11, v14, v11, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 756
    .line 757
    .line 758
    :cond_23
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    invoke-static {v14, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 763
    .line 764
    .line 765
    sget-object v27, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 766
    .line 767
    sget v29, Lcom/zykj/mistake/feature/notebook/detail/t4;->m:F

    .line 768
    .line 769
    const/16 v31, 0x2

    .line 770
    .line 771
    const/16 v32, 0x0

    .line 772
    .line 773
    const/16 v30, 0x0

    .line 774
    .line 775
    move-object/from16 v28, v2

    .line 776
    .line 777
    invoke-static/range {v27 .. v32}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    const/4 v9, 0x0

    .line 782
    const/4 v11, 0x0

    .line 783
    const/4 v14, 0x1

    .line 784
    invoke-static {v0, v9, v14, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    move-object v0, v1

    .line 789
    move-object v4, v12

    .line 790
    move-object v2, v13

    .line 791
    move-object/from16 v1, v34

    .line 792
    .line 793
    move-object/from16 v12, p1

    .line 794
    .line 795
    invoke-static/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/g0;->b(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 796
    .line 797
    .line 798
    sget v29, Lcom/zykj/mistake/feature/notebook/detail/t4;->n:F

    .line 799
    .line 800
    invoke-static/range {v27 .. v32}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 801
    .line 802
    .line 803
    move-result-object v1

    .line 804
    move-object/from16 v3, v28

    .line 805
    .line 806
    invoke-static {v1, v9, v14, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 807
    .line 808
    .line 809
    move-result-object v1

    .line 810
    invoke-static {v0, v2, v1, v4, v5}, Lcom/zykj/mistake/feature/notebook/detail/t;->g(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 811
    .line 812
    .line 813
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 814
    .line 815
    .line 816
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 817
    .line 818
    .line 819
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->r:Z

    .line 820
    .line 821
    if-eqz v1, :cond_2d

    .line 822
    .line 823
    const v1, -0x24e0fd0a

    .line 824
    .line 825
    .line 826
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 827
    .line 828
    .line 829
    invoke-static {v3, v9, v14, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 830
    .line 831
    .line 832
    move-result-object v27

    .line 833
    move/from16 v1, v26

    .line 834
    .line 835
    const/16 v5, 0x20

    .line 836
    .line 837
    if-ne v1, v5, :cond_24

    .line 838
    .line 839
    const/4 v5, 0x1

    .line 840
    goto :goto_10

    .line 841
    :cond_24
    const/4 v5, 0x0

    .line 842
    :goto_10
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v9

    .line 846
    const/16 v13, 0xb

    .line 847
    .line 848
    if-nez v5, :cond_25

    .line 849
    .line 850
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v5

    .line 854
    if-ne v9, v5, :cond_26

    .line 855
    .line 856
    :cond_25
    new-instance v9, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 857
    .line 858
    invoke-direct {v9, v12, v13}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 859
    .line 860
    .line 861
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 862
    .line 863
    .line 864
    :cond_26
    move-object/from16 v31, v9

    .line 865
    .line 866
    check-cast v31, Lr6/a;

    .line 867
    .line 868
    const/16 v32, 0x7

    .line 869
    .line 870
    const/16 v33, 0x0

    .line 871
    .line 872
    const/16 v28, 0x0

    .line 873
    .line 874
    const/16 v29, 0x0

    .line 875
    .line 876
    const/16 v30, 0x0

    .line 877
    .line 878
    invoke-static/range {v27 .. v33}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 879
    .line 880
    .line 881
    move-result-object v5

    .line 882
    const/4 v9, 0x0

    .line 883
    invoke-static {v5, v4, v9}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 884
    .line 885
    .line 886
    invoke-interface {v10}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v5

    .line 890
    check-cast v5, Landroidx/compose/ui/geometry/Rect;

    .line 891
    .line 892
    if-nez v5, :cond_27

    .line 893
    .line 894
    const v3, -0x773b5148

    .line 895
    .line 896
    .line 897
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 898
    .line 899
    .line 900
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 901
    .line 902
    .line 903
    const/4 v5, 0x0

    .line 904
    goto :goto_12

    .line 905
    :cond_27
    const v9, -0x773b5147

    .line 906
    .line 907
    .line 908
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 909
    .line 910
    .line 911
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v9

    .line 915
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v10

    .line 919
    if-nez v9, :cond_28

    .line 920
    .line 921
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object v9

    .line 925
    if-ne v10, v9, :cond_29

    .line 926
    .line 927
    :cond_28
    new-instance v10, Landroidx/navigation/i;

    .line 928
    .line 929
    invoke-direct {v10, v5, v13}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 930
    .line 931
    .line 932
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    :cond_29
    check-cast v10, Lr6/c;

    .line 936
    .line 937
    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/OffsetKt;->offset(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 938
    .line 939
    .line 940
    move-result-object v3

    .line 941
    const/16 v5, 0x20

    .line 942
    .line 943
    if-ne v1, v5, :cond_2a

    .line 944
    .line 945
    const/4 v5, 0x1

    .line 946
    goto :goto_11

    .line 947
    :cond_2a
    const/4 v5, 0x0

    .line 948
    :goto_11
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v9

    .line 952
    if-nez v5, :cond_2b

    .line 953
    .line 954
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v5

    .line 958
    if-ne v9, v5, :cond_2c

    .line 959
    .line 960
    :cond_2b
    new-instance v9, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 961
    .line 962
    const/16 v5, 0xc

    .line 963
    .line 964
    invoke-direct {v9, v12, v5}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 965
    .line 966
    .line 967
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    :cond_2c
    check-cast v9, Lr6/a;

    .line 971
    .line 972
    const/4 v5, 0x0

    .line 973
    invoke-static {v3, v8, v9, v4, v5}, Lcom/zykj/mistake/feature/notebook/detail/s4;->b(Landroidx/compose/ui/Modifier;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 974
    .line 975
    .line 976
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 977
    .line 978
    .line 979
    :goto_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 980
    .line 981
    .line 982
    goto :goto_13

    .line 983
    :cond_2d
    move/from16 v1, v26

    .line 984
    .line 985
    const/4 v5, 0x0

    .line 986
    const v3, -0x779fa99f

    .line 987
    .line 988
    .line 989
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 990
    .line 991
    .line 992
    goto :goto_12

    .line 993
    :goto_13
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 994
    .line 995
    .line 996
    iget-boolean v3, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->T:Z

    .line 997
    .line 998
    const v8, -0x6481c39

    .line 999
    .line 1000
    .line 1001
    if-eqz v3, :cond_3c

    .line 1002
    .line 1003
    const v3, -0x5dae57e

    .line 1004
    .line 1005
    .line 1006
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1007
    .line 1008
    .line 1009
    move v3, v8

    .line 1010
    iget-object v8, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->U:Ljava/util/List;

    .line 1011
    .line 1012
    iget-object v9, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->X:Ljava/util/Set;

    .line 1013
    .line 1014
    iget-boolean v10, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->Y:Z

    .line 1015
    .line 1016
    move-object v13, v9

    .line 1017
    check-cast v13, Ljava/util/Collection;

    .line 1018
    .line 1019
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 1020
    .line 1021
    .line 1022
    move-result v13

    .line 1023
    if-eqz v13, :cond_2f

    .line 1024
    .line 1025
    iget-object v13, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->X:Ljava/util/Set;

    .line 1026
    .line 1027
    iget-object v14, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->W:Ljava/util/Set;

    .line 1028
    .line 1029
    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v13

    .line 1033
    if-nez v13, :cond_2e

    .line 1034
    .line 1035
    goto :goto_14

    .line 1036
    :cond_2e
    move-object/from16 v23, v11

    .line 1037
    .line 1038
    move v11, v5

    .line 1039
    goto :goto_15

    .line 1040
    :cond_2f
    :goto_14
    move-object/from16 v23, v11

    .line 1041
    .line 1042
    const/4 v11, 0x1

    .line 1043
    :goto_15
    sget-object v13, Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;->EDIT_JOINED:Lcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;

    .line 1044
    .line 1045
    const/16 v14, 0x20

    .line 1046
    .line 1047
    if-ne v1, v14, :cond_30

    .line 1048
    .line 1049
    const/4 v14, 0x1

    .line 1050
    goto :goto_16

    .line 1051
    :cond_30
    move v14, v5

    .line 1052
    :goto_16
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v15

    .line 1056
    if-nez v14, :cond_31

    .line 1057
    .line 1058
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v14

    .line 1062
    if-ne v15, v14, :cond_32

    .line 1063
    .line 1064
    :cond_31
    new-instance v15, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 1065
    .line 1066
    const/16 v14, 0x1d

    .line 1067
    .line 1068
    invoke-direct {v15, v12, v14}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 1069
    .line 1070
    .line 1071
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1072
    .line 1073
    .line 1074
    :cond_32
    check-cast v15, Lr6/c;

    .line 1075
    .line 1076
    const/16 v14, 0x20

    .line 1077
    .line 1078
    if-ne v1, v14, :cond_33

    .line 1079
    .line 1080
    const/4 v14, 0x1

    .line 1081
    goto :goto_17

    .line 1082
    :cond_33
    move v14, v5

    .line 1083
    :goto_17
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v3

    .line 1087
    if-nez v14, :cond_35

    .line 1088
    .line 1089
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v14

    .line 1093
    if-ne v3, v14, :cond_34

    .line 1094
    .line 1095
    goto :goto_18

    .line 1096
    :cond_34
    const/16 v14, 0xd

    .line 1097
    .line 1098
    goto :goto_19

    .line 1099
    :cond_35
    :goto_18
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1100
    .line 1101
    const/16 v14, 0xd

    .line 1102
    .line 1103
    invoke-direct {v3, v12, v14}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1104
    .line 1105
    .line 1106
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1107
    .line 1108
    .line 1109
    :goto_19
    check-cast v3, Lr6/a;

    .line 1110
    .line 1111
    const/16 v5, 0x20

    .line 1112
    .line 1113
    if-ne v1, v5, :cond_36

    .line 1114
    .line 1115
    const/4 v5, 0x1

    .line 1116
    goto :goto_1a

    .line 1117
    :cond_36
    const/4 v5, 0x0

    .line 1118
    :goto_1a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v14

    .line 1122
    if-nez v5, :cond_37

    .line 1123
    .line 1124
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v5

    .line 1128
    if-ne v14, v5, :cond_38

    .line 1129
    .line 1130
    :cond_37
    new-instance v14, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1131
    .line 1132
    const/16 v5, 0xe

    .line 1133
    .line 1134
    invoke-direct {v14, v12, v5}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1135
    .line 1136
    .line 1137
    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1138
    .line 1139
    .line 1140
    :cond_38
    check-cast v14, Lr6/a;

    .line 1141
    .line 1142
    const/16 v5, 0x20

    .line 1143
    .line 1144
    if-ne v1, v5, :cond_39

    .line 1145
    .line 1146
    const/16 v20, 0x1

    .line 1147
    .line 1148
    goto :goto_1b

    .line 1149
    :cond_39
    const/16 v20, 0x0

    .line 1150
    .line 1151
    :goto_1b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v5

    .line 1155
    move-object/from16 p2, v3

    .line 1156
    .line 1157
    if-nez v20, :cond_3b

    .line 1158
    .line 1159
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v3

    .line 1163
    if-ne v5, v3, :cond_3a

    .line 1164
    .line 1165
    goto :goto_1c

    .line 1166
    :cond_3a
    const/4 v3, 0x1

    .line 1167
    goto :goto_1d

    .line 1168
    :cond_3b
    :goto_1c
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1169
    .line 1170
    const/4 v3, 0x1

    .line 1171
    invoke-direct {v5, v12, v3}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1172
    .line 1173
    .line 1174
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1175
    .line 1176
    .line 1177
    :goto_1d
    check-cast v5, Lr6/a;

    .line 1178
    .line 1179
    const/16 v19, 0xd

    .line 1180
    .line 1181
    const/16 v18, 0x6000

    .line 1182
    .line 1183
    move-object/from16 v17, v4

    .line 1184
    .line 1185
    move-object/from16 v16, v5

    .line 1186
    .line 1187
    move-object v4, v12

    .line 1188
    move-object v12, v13

    .line 1189
    move-object v13, v15

    .line 1190
    move-object/from16 v29, v23

    .line 1191
    .line 1192
    const v3, -0x6481c39

    .line 1193
    .line 1194
    .line 1195
    const/16 v5, 0x20

    .line 1196
    .line 1197
    move-object v15, v14

    .line 1198
    move-object/from16 v14, p2

    .line 1199
    .line 1200
    invoke-static/range {v8 .. v18}, Lcom/zykj/mistake/feature/notebook/list/j;->d(Ljava/util/List;Ljava/util/Set;ZZLcom/zykj/mistake/feature/notebook/list/JoinCollectionDialogMode;Lr6/c;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 1201
    .line 1202
    .line 1203
    move-object/from16 v12, v17

    .line 1204
    .line 1205
    :goto_1e
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1206
    .line 1207
    .line 1208
    goto :goto_1f

    .line 1209
    :cond_3c
    move-object v3, v12

    .line 1210
    move-object v12, v4

    .line 1211
    move-object v4, v3

    .line 1212
    move v3, v8

    .line 1213
    move-object/from16 v29, v11

    .line 1214
    .line 1215
    const/16 v5, 0x20

    .line 1216
    .line 1217
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1218
    .line 1219
    .line 1220
    goto :goto_1e

    .line 1221
    :goto_1f
    iget-boolean v8, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b0:Z

    .line 1222
    .line 1223
    if-eqz v8, :cond_47

    .line 1224
    .line 1225
    const v8, -0x5ce18f0

    .line 1226
    .line 1227
    .line 1228
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1229
    .line 1230
    .line 1231
    iget-object v8, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->U:Ljava/util/List;

    .line 1232
    .line 1233
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 1234
    .line 1235
    .line 1236
    move-result v8

    .line 1237
    if-nez v8, :cond_3d

    .line 1238
    .line 1239
    const-string v8, "\u521b\u5efa\u65b0\u9519\u9898\u96c6"

    .line 1240
    .line 1241
    goto :goto_20

    .line 1242
    :cond_3d
    const-string v8, "\u8fd8\u6ca1\u6709\u521b\u5efa\u8fc7\u4efb\u4f55\u9519\u9898\u96c6\uff0c\u5148\u521b\u5efa\u4e00\u4e2a\u5427"

    .line 1243
    .line 1244
    :goto_20
    iget-object v9, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->c0:Ljava/lang/String;

    .line 1245
    .line 1246
    iget-object v10, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d0:Ljava/lang/String;

    .line 1247
    .line 1248
    iget-boolean v13, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->e0:Z

    .line 1249
    .line 1250
    const/16 v11, 0x14

    .line 1251
    .line 1252
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v14

    .line 1256
    if-ne v1, v5, :cond_3e

    .line 1257
    .line 1258
    const/4 v11, 0x1

    .line 1259
    goto :goto_21

    .line 1260
    :cond_3e
    const/4 v11, 0x0

    .line 1261
    :goto_21
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v15

    .line 1265
    if-nez v11, :cond_3f

    .line 1266
    .line 1267
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v11

    .line 1271
    if-ne v15, v11, :cond_40

    .line 1272
    .line 1273
    :cond_3f
    new-instance v15, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 1274
    .line 1275
    const/16 v11, 0x1c

    .line 1276
    .line 1277
    invoke-direct {v15, v4, v11}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 1278
    .line 1279
    .line 1280
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1281
    .line 1282
    .line 1283
    :cond_40
    move-object/from16 v18, v15

    .line 1284
    .line 1285
    check-cast v18, Lr6/c;

    .line 1286
    .line 1287
    if-ne v1, v5, :cond_41

    .line 1288
    .line 1289
    const/4 v11, 0x1

    .line 1290
    goto :goto_22

    .line 1291
    :cond_41
    const/4 v11, 0x0

    .line 1292
    :goto_22
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v15

    .line 1296
    if-nez v11, :cond_42

    .line 1297
    .line 1298
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v11

    .line 1302
    if-ne v15, v11, :cond_43

    .line 1303
    .line 1304
    :cond_42
    new-instance v15, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1305
    .line 1306
    const/4 v11, 0x2

    .line 1307
    invoke-direct {v15, v4, v11}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1308
    .line 1309
    .line 1310
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1311
    .line 1312
    .line 1313
    :cond_43
    move-object/from16 v19, v15

    .line 1314
    .line 1315
    check-cast v19, Lr6/a;

    .line 1316
    .line 1317
    if-ne v1, v5, :cond_44

    .line 1318
    .line 1319
    const/4 v11, 0x1

    .line 1320
    goto :goto_23

    .line 1321
    :cond_44
    const/4 v11, 0x0

    .line 1322
    :goto_23
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v15

    .line 1326
    if-nez v11, :cond_45

    .line 1327
    .line 1328
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v11

    .line 1332
    if-ne v15, v11, :cond_46

    .line 1333
    .line 1334
    :cond_45
    new-instance v15, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1335
    .line 1336
    const/4 v11, 0x3

    .line 1337
    invoke-direct {v15, v4, v11}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1338
    .line 1339
    .line 1340
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1341
    .line 1342
    .line 1343
    :cond_46
    move-object/from16 v20, v15

    .line 1344
    .line 1345
    check-cast v20, Lr6/a;

    .line 1346
    .line 1347
    const/16 v23, 0x0

    .line 1348
    .line 1349
    const/16 v24, 0x380

    .line 1350
    .line 1351
    const-string v11, "\u521b\u5efa"

    .line 1352
    .line 1353
    move-object/from16 v17, v12

    .line 1354
    .line 1355
    const-string v12, "\u521b\u5efa\u4e2d..."

    .line 1356
    .line 1357
    const/4 v15, 0x0

    .line 1358
    const/16 v16, 0x0

    .line 1359
    .line 1360
    move-object/from16 v21, v17

    .line 1361
    .line 1362
    const/16 v17, 0x0

    .line 1363
    .line 1364
    const v22, 0x186c00

    .line 1365
    .line 1366
    .line 1367
    invoke-static/range {v8 .. v24}, Lcom/zykj/mistake/feature/collection/component/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;III)V

    .line 1368
    .line 1369
    .line 1370
    move-object/from16 v12, v21

    .line 1371
    .line 1372
    :goto_24
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1373
    .line 1374
    .line 1375
    goto :goto_25

    .line 1376
    :cond_47
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1377
    .line 1378
    .line 1379
    goto :goto_24

    .line 1380
    :goto_25
    iget-boolean v8, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g0:Z

    .line 1381
    .line 1382
    if-eqz v8, :cond_4b

    .line 1383
    .line 1384
    const v8, -0x5c2ba54

    .line 1385
    .line 1386
    .line 1387
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1388
    .line 1389
    .line 1390
    if-ne v1, v5, :cond_48

    .line 1391
    .line 1392
    const/4 v13, 0x1

    .line 1393
    goto :goto_26

    .line 1394
    :cond_48
    const/4 v13, 0x0

    .line 1395
    :goto_26
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v1

    .line 1399
    if-nez v13, :cond_49

    .line 1400
    .line 1401
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v5

    .line 1405
    if-ne v1, v5, :cond_4a

    .line 1406
    .line 1407
    :cond_49
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1408
    .line 1409
    const/4 v5, 0x4

    .line 1410
    invoke-direct {v1, v4, v5}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1411
    .line 1412
    .line 1413
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1414
    .line 1415
    .line 1416
    :cond_4a
    check-cast v1, Lr6/a;

    .line 1417
    .line 1418
    const/4 v9, 0x0

    .line 1419
    invoke-static {v1, v12, v9}, Lcom/zykj/mistake/feature/notebook/list/j;->e(Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 1420
    .line 1421
    .line 1422
    :goto_27
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1423
    .line 1424
    .line 1425
    goto :goto_28

    .line 1426
    :cond_4b
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1427
    .line 1428
    .line 1429
    goto :goto_27

    .line 1430
    :goto_28
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->h0:Z

    .line 1431
    .line 1432
    if-eqz v1, :cond_55

    .line 1433
    .line 1434
    const v1, -0x5bf8721

    .line 1435
    .line 1436
    .line 1437
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1438
    .line 1439
    .line 1440
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->f:Ljava/lang/String;

    .line 1441
    .line 1442
    const/16 v5, 0x5f

    .line 1443
    .line 1444
    invoke-static {v5, v1, v1}, Lkotlin/text/p;->e0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v1

    .line 1448
    invoke-static {v1}, Lkotlin/text/w;->D(Ljava/lang/String;)Ljava/lang/Integer;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v1

    .line 1452
    if-eqz v1, :cond_4c

    .line 1453
    .line 1454
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1455
    .line 1456
    .line 1457
    move-result v14

    .line 1458
    goto :goto_29

    .line 1459
    :cond_4c
    const/4 v14, 0x0

    .line 1460
    :goto_29
    if-gtz v14, :cond_4d

    .line 1461
    .line 1462
    const/4 v8, 0x1

    .line 1463
    goto :goto_2a

    .line 1464
    :cond_4d
    const/4 v8, 0x0

    .line 1465
    :goto_2a
    iget v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->m0:I

    .line 1466
    .line 1467
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v5

    .line 1471
    if-lez v1, :cond_4e

    .line 1472
    .line 1473
    const/4 v13, 0x1

    .line 1474
    goto :goto_2b

    .line 1475
    :cond_4e
    const/4 v13, 0x0

    .line 1476
    :goto_2b
    if-eqz v13, :cond_4f

    .line 1477
    .line 1478
    goto :goto_2c

    .line 1479
    :cond_4f
    move-object/from16 v5, v29

    .line 1480
    .line 1481
    :goto_2c
    if-eqz v5, :cond_50

    .line 1482
    .line 1483
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1484
    .line 1485
    .line 1486
    move-result v1

    .line 1487
    :goto_2d
    move v9, v1

    .line 1488
    goto :goto_2e

    .line 1489
    :cond_50
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->R:Ljava/util/List;

    .line 1490
    .line 1491
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1492
    .line 1493
    .line 1494
    move-result v1

    .line 1495
    goto :goto_2d

    .line 1496
    :goto_2e
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 1497
    .line 1498
    .line 1499
    move-result v1

    .line 1500
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v5

    .line 1504
    if-nez v1, :cond_51

    .line 1505
    .line 1506
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v1

    .line 1510
    if-ne v5, v1, :cond_52

    .line 1511
    .line 1512
    :cond_51
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1513
    .line 1514
    const/4 v1, 0x5

    .line 1515
    invoke-direct {v5, v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1516
    .line 1517
    .line 1518
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1519
    .line 1520
    .line 1521
    :cond_52
    move-object v10, v5

    .line 1522
    check-cast v10, Lr6/a;

    .line 1523
    .line 1524
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 1525
    .line 1526
    .line 1527
    move-result v1

    .line 1528
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v5

    .line 1532
    if-nez v1, :cond_53

    .line 1533
    .line 1534
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v1

    .line 1538
    if-ne v5, v1, :cond_54

    .line 1539
    .line 1540
    :cond_53
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1541
    .line 1542
    const/4 v1, 0x6

    .line 1543
    invoke-direct {v5, v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1544
    .line 1545
    .line 1546
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1547
    .line 1548
    .line 1549
    :cond_54
    move-object v11, v5

    .line 1550
    check-cast v11, Lr6/a;

    .line 1551
    .line 1552
    const/4 v13, 0x0

    .line 1553
    invoke-static/range {v7 .. v13}, Lcom/zykj/mistake/feature/notebook/detail/x3;->k(Lcom/zykj/mistake/feature/notebook/detail/l3;ZILr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 1554
    .line 1555
    .line 1556
    :goto_2f
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1557
    .line 1558
    .line 1559
    goto :goto_30

    .line 1560
    :cond_55
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1561
    .line 1562
    .line 1563
    goto :goto_2f

    .line 1564
    :goto_30
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->i0:Z

    .line 1565
    .line 1566
    if-eqz v1, :cond_5a

    .line 1567
    .line 1568
    const v1, -0x5b7ac3f

    .line 1569
    .line 1570
    .line 1571
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1572
    .line 1573
    .line 1574
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 1575
    .line 1576
    .line 1577
    move-result v1

    .line 1578
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v5

    .line 1582
    if-nez v1, :cond_56

    .line 1583
    .line 1584
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v1

    .line 1588
    if-ne v5, v1, :cond_57

    .line 1589
    .line 1590
    :cond_56
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1591
    .line 1592
    const/4 v1, 0x7

    .line 1593
    invoke-direct {v5, v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1594
    .line 1595
    .line 1596
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1597
    .line 1598
    .line 1599
    :cond_57
    check-cast v5, Lr6/a;

    .line 1600
    .line 1601
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 1602
    .line 1603
    .line 1604
    move-result v1

    .line 1605
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v8

    .line 1609
    if-nez v1, :cond_58

    .line 1610
    .line 1611
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v1

    .line 1615
    if-ne v8, v1, :cond_59

    .line 1616
    .line 1617
    :cond_58
    new-instance v8, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1618
    .line 1619
    const/16 v1, 0x8

    .line 1620
    .line 1621
    invoke-direct {v8, v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1622
    .line 1623
    .line 1624
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1625
    .line 1626
    .line 1627
    :cond_59
    check-cast v8, Lr6/a;

    .line 1628
    .line 1629
    const/4 v9, 0x0

    .line 1630
    invoke-static {v7, v5, v8, v12, v9}, Lcom/zykj/mistake/feature/notebook/detail/x3;->e(Lcom/zykj/mistake/feature/notebook/detail/l3;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 1631
    .line 1632
    .line 1633
    :goto_31
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1634
    .line 1635
    .line 1636
    goto :goto_32

    .line 1637
    :cond_5a
    const/4 v9, 0x0

    .line 1638
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1639
    .line 1640
    .line 1641
    goto :goto_31

    .line 1642
    :goto_32
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->j0:Z

    .line 1643
    .line 1644
    if-eqz v1, :cond_5f

    .line 1645
    .line 1646
    const v1, -0x5b2850d

    .line 1647
    .line 1648
    .line 1649
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1650
    .line 1651
    .line 1652
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->g:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 1653
    .line 1654
    sget-object v3, Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;->POOL:Lcom/zykj/mistake/feature/review/ReviewContract$PracticeScene;

    .line 1655
    .line 1656
    if-ne v1, v3, :cond_5b

    .line 1657
    .line 1658
    const-string v5, "\u5df2\u5b8c\u6210\u7ec3\u4e60\uff01"

    .line 1659
    .line 1660
    goto :goto_33

    .line 1661
    :cond_5b
    const-string v5, "\u5df2\u7ec3\u5b8c\u5168\u90e8\u63a8\u8350\u7ec3\u4e60\uff01"

    .line 1662
    .line 1663
    :goto_33
    if-eq v1, v3, :cond_5c

    .line 1664
    .line 1665
    const/4 v8, 0x1

    .line 1666
    goto :goto_34

    .line 1667
    :cond_5c
    move v8, v9

    .line 1668
    :goto_34
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 1669
    .line 1670
    .line 1671
    move-result v1

    .line 1672
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v3

    .line 1676
    if-nez v1, :cond_5d

    .line 1677
    .line 1678
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v1

    .line 1682
    if-ne v3, v1, :cond_5e

    .line 1683
    .line 1684
    :cond_5d
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 1685
    .line 1686
    const/16 v1, 0x9

    .line 1687
    .line 1688
    invoke-direct {v3, v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 1689
    .line 1690
    .line 1691
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1692
    .line 1693
    .line 1694
    :cond_5e
    move-object v10, v3

    .line 1695
    check-cast v10, Lr6/a;

    .line 1696
    .line 1697
    move-object/from16 v17, v12

    .line 1698
    .line 1699
    const/4 v12, 0x0

    .line 1700
    move-object v9, v7

    .line 1701
    move-object/from16 v11, v17

    .line 1702
    .line 1703
    move-object v7, v5

    .line 1704
    invoke-static/range {v7 .. v12}, Lcom/zykj/mistake/feature/notebook/detail/x3;->f(Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/l3;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 1705
    .line 1706
    .line 1707
    move-object v12, v11

    .line 1708
    :goto_35
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1709
    .line 1710
    .line 1711
    goto :goto_36

    .line 1712
    :cond_5f
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1713
    .line 1714
    .line 1715
    goto :goto_35

    .line 1716
    :goto_36
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1717
    .line 1718
    .line 1719
    move-result v1

    .line 1720
    if-eqz v1, :cond_61

    .line 1721
    .line 1722
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1723
    .line 1724
    .line 1725
    goto :goto_37

    .line 1726
    :cond_60
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1727
    .line 1728
    .line 1729
    :cond_61
    :goto_37
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v1

    .line 1733
    if-eqz v1, :cond_62

    .line 1734
    .line 1735
    new-instance v2, Landroidx/navigation/compose/b;

    .line 1736
    .line 1737
    const/16 v14, 0xd

    .line 1738
    .line 1739
    invoke-direct {v2, v6, v14, v0, v4}, Landroidx/navigation/compose/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 1740
    .line 1741
    .line 1742
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1743
    .line 1744
    .line 1745
    :cond_62
    return-void
.end method

.method public static final b(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    .line 1
    move-wide/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v7, p6

    .line 4
    .line 5
    move/from16 v8, p8

    .line 6
    .line 7
    const v0, 0x13c6398c

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p7

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    and-int/lit8 v4, v8, 0x6

    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    move-object/from16 v9, p0

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    move v4, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v4, 0x2

    .line 32
    :goto_0
    or-int/2addr v4, v8

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v4, v8

    .line 35
    :goto_1
    and-int/lit8 v6, v8, 0x30

    .line 36
    .line 37
    if-nez v6, :cond_3

    .line 38
    .line 39
    invoke-interface {v1, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

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
    and-int/lit16 v6, v8, 0x180

    .line 52
    .line 53
    move-wide/from16 v11, p3

    .line 54
    .line 55
    if-nez v6, :cond_5

    .line 56
    .line 57
    invoke-interface {v1, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    const/16 v6, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v6, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v4, v6

    .line 69
    :cond_5
    and-int/lit16 v6, v8, 0xc00

    .line 70
    .line 71
    if-nez v6, :cond_7

    .line 72
    .line 73
    move-object/from16 v6, p5

    .line 74
    .line 75
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    if-eqz v13, :cond_6

    .line 80
    .line 81
    const/16 v13, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v13, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v4, v13

    .line 87
    goto :goto_5

    .line 88
    :cond_7
    move-object/from16 v6, p5

    .line 89
    .line 90
    :goto_5
    and-int/lit16 v13, v8, 0x6000

    .line 91
    .line 92
    if-nez v13, :cond_9

    .line 93
    .line 94
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v13

    .line 98
    if-eqz v13, :cond_8

    .line 99
    .line 100
    const/16 v13, 0x4000

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_8
    const/16 v13, 0x2000

    .line 104
    .line 105
    :goto_6
    or-int/2addr v4, v13

    .line 106
    :cond_9
    and-int/lit16 v13, v4, 0x2493

    .line 107
    .line 108
    const/16 v14, 0x2492

    .line 109
    .line 110
    const/4 v15, 0x0

    .line 111
    if-eq v13, v14, :cond_a

    .line 112
    .line 113
    const/4 v13, 0x1

    .line 114
    goto :goto_7

    .line 115
    :cond_a
    move v13, v15

    .line 116
    :goto_7
    and-int/lit8 v14, v4, 0x1

    .line 117
    .line 118
    invoke-interface {v1, v13, v14}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    if-eqz v13, :cond_10

    .line 123
    .line 124
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    if-eqz v13, :cond_b

    .line 129
    .line 130
    const/4 v13, -0x1

    .line 131
    const-string v14, "com.zykj.mistake.feature.notebook.detail.ReviewDialogButton (MistakeDetailNewScreen.kt:655)"

    .line 132
    .line 133
    invoke-static {v0, v4, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_b
    int-to-float v0, v5

    .line 137
    invoke-static {v0, v7, v2, v3}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    const/16 v18, 0x7

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    const/4 v14, 0x0

    .line 146
    move v0, v15

    .line 147
    const/4 v15, 0x0

    .line 148
    const/16 v16, 0x0

    .line 149
    .line 150
    move-object/from16 v17, v6

    .line 151
    .line 152
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 157
    .line 158
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-static {v1, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    invoke-static {v1, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 179
    .line 180
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 181
    .line 182
    .line 183
    move-result-object v15

    .line 184
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 185
    .line 186
    .line 187
    move-result-object v16

    .line 188
    if-nez v16, :cond_c

    .line 189
    .line 190
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 191
    .line 192
    .line 193
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 194
    .line 195
    .line 196
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 197
    .line 198
    .line 199
    move-result v16

    .line 200
    if-eqz v16, :cond_d

    .line 201
    .line 202
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 203
    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 207
    .line 208
    .line 209
    :goto_8
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    invoke-static {v14, v15, v6, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    if-nez v13, :cond_e

    .line 222
    .line 223
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v13

    .line 227
    const/16 p7, 0x10

    .line 228
    .line 229
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    invoke-static {v13, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    if-nez v10, :cond_f

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_e
    const/16 p7, 0x10

    .line 241
    .line 242
    :goto_9
    invoke-static {v0, v15, v0, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 243
    .line 244
    .line 245
    :cond_f
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v15, v5, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 253
    .line 254
    invoke-static/range {p7 .. p7}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 255
    .line 256
    .line 257
    move-result-wide v13

    .line 258
    and-int/lit8 v0, v4, 0xe

    .line 259
    .line 260
    or-int/lit16 v0, v0, 0xc00

    .line 261
    .line 262
    and-int/lit16 v4, v4, 0x380

    .line 263
    .line 264
    or-int v31, v0, v4

    .line 265
    .line 266
    const/16 v32, 0x0

    .line 267
    .line 268
    const v33, 0x1fff2

    .line 269
    .line 270
    .line 271
    const/4 v10, 0x0

    .line 272
    const/4 v15, 0x0

    .line 273
    const/16 v16, 0x0

    .line 274
    .line 275
    const/16 v17, 0x0

    .line 276
    .line 277
    const-wide/16 v18, 0x0

    .line 278
    .line 279
    const/16 v20, 0x0

    .line 280
    .line 281
    const/16 v21, 0x0

    .line 282
    .line 283
    const-wide/16 v22, 0x0

    .line 284
    .line 285
    const/16 v24, 0x0

    .line 286
    .line 287
    const/16 v25, 0x0

    .line 288
    .line 289
    const/16 v26, 0x0

    .line 290
    .line 291
    const/16 v27, 0x0

    .line 292
    .line 293
    const/16 v28, 0x0

    .line 294
    .line 295
    const/16 v29, 0x0

    .line 296
    .line 297
    move-object/from16 v30, v1

    .line 298
    .line 299
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 300
    .line 301
    .line 302
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 303
    .line 304
    .line 305
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-eqz v0, :cond_11

    .line 310
    .line 311
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 312
    .line 313
    .line 314
    goto :goto_a

    .line 315
    :cond_10
    move-object/from16 v30, v1

    .line 316
    .line 317
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 318
    .line 319
    .line 320
    :cond_11
    :goto_a
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    if-eqz v9, :cond_12

    .line 325
    .line 326
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/l0;

    .line 327
    .line 328
    move-object/from16 v1, p0

    .line 329
    .line 330
    move-wide/from16 v4, p3

    .line 331
    .line 332
    move-object/from16 v6, p5

    .line 333
    .line 334
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/l0;-><init>(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;I)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 338
    .line 339
    .line 340
    :cond_12
    return-void
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const v0, -0x9c0c7c9

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    move v2, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    :goto_0
    and-int/lit8 v3, p1, 0x1

    .line 15
    .line 16
    invoke-interface {p0, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    const-string v3, "com.zykj.mistake.feature.notebook.detail.ReviewMetricDivider (MistakeDetailNewScreen.kt:638)"

    .line 30
    .line 31
    invoke-static {v0, p1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 35
    .line 36
    const/16 v0, 0x16

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    const/16 v9, 0xd

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v8, 0x0

    .line 49
    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    int-to-float v1, v1

    .line 54
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const/16 v1, 0x24

    .line 63
    .line 64
    int-to-float v1, v1

    .line 65
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-wide v0, 0xffe5e5e5L

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    const/4 v6, 0x2

    .line 83
    const/4 v7, 0x0

    .line 84
    const/4 v5, 0x0

    .line 85
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/4 v1, 0x6

    .line 90
    invoke-static {v0, p0, v1}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_1
    invoke-interface {p0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-eqz p0, :cond_4

    .line 111
    .line 112
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/x;

    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    invoke-direct {v0, p1, v1}, Lcom/zykj/mistake/feature/notebook/detail/x;-><init>(II)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    return-void
.end method

.method public static final d(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v1, p3

    .line 6
    .line 7
    const v3, 0x3b829ed9

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    and-int/lit8 v5, v1, 0x6

    .line 17
    .line 18
    if-nez v5, :cond_1

    .line 19
    .line 20
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x2

    .line 29
    :goto_0
    or-int/2addr v5, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v5, v1

    .line 32
    :goto_1
    and-int/lit8 v6, v1, 0x30

    .line 33
    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    const/16 v6, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v6, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v5, v6

    .line 48
    :cond_3
    and-int/lit8 v6, v5, 0x13

    .line 49
    .line 50
    const/16 v7, 0x12

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x1

    .line 54
    if-eq v6, v7, :cond_4

    .line 55
    .line 56
    move v6, v9

    .line 57
    goto :goto_3

    .line 58
    :cond_4
    move v6, v8

    .line 59
    :goto_3
    and-int/lit8 v7, v5, 0x1

    .line 60
    .line 61
    invoke-interface {v4, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_b

    .line 66
    .line 67
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v6, :cond_5

    .line 72
    .line 73
    const/4 v6, -0x1

    .line 74
    const-string v7, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeChangeSummary (MistakeDetailNewScreen.kt:457)"

    .line 75
    .line 76
    invoke-static {v3, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    iget v3, v0, Lcom/zykj/mistake/feature/notebook/detail/l3;->d:I

    .line 80
    .line 81
    iget v6, v0, Lcom/zykj/mistake/feature/notebook/detail/l3;->e:I

    .line 82
    .line 83
    if-gtz v3, :cond_7

    .line 84
    .line 85
    if-gtz v6, :cond_7

    .line 86
    .line 87
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_6

    .line 92
    .line 93
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 94
    .line 95
    .line 96
    :cond_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-eqz v3, :cond_d

    .line 101
    .line 102
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/q3;

    .line 103
    .line 104
    const/4 v5, 0x1

    .line 105
    invoke-direct {v4, v0, v2, v1, v5}, Lcom/zykj/mistake/feature/notebook/detail/q3;-><init>(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;II)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_7
    new-instance v7, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 113
    .line 114
    const/4 v10, 0x0

    .line 115
    invoke-direct {v7, v8, v9, v10}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 116
    .line 117
    .line 118
    const-wide v8, 0xff1576ffL

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    if-lez v3, :cond_8

    .line 124
    .line 125
    new-instance v10, Landroidx/compose/ui/text/SpanStyle;

    .line 126
    .line 127
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v11

    .line 131
    const v31, 0xfffe

    .line 132
    .line 133
    .line 134
    const/16 v32, 0x0

    .line 135
    .line 136
    const-wide/16 v13, 0x0

    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    const/16 v18, 0x0

    .line 144
    .line 145
    const/16 v19, 0x0

    .line 146
    .line 147
    const-wide/16 v20, 0x0

    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    const/16 v23, 0x0

    .line 152
    .line 153
    const/16 v24, 0x0

    .line 154
    .line 155
    const-wide/16 v25, 0x0

    .line 156
    .line 157
    const/16 v27, 0x0

    .line 158
    .line 159
    const/16 v28, 0x0

    .line 160
    .line 161
    const/16 v29, 0x0

    .line 162
    .line 163
    const/16 v30, 0x0

    .line 164
    .line 165
    invoke-direct/range {v10 .. v32}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7, v10}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    :try_start_0
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-virtual {v7, v11}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v10}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 180
    .line 181
    .line 182
    const-string v10, " \u9898\u590d\u4e60\u8fdb\u5ea6\u63d0\u5347"

    .line 183
    .line 184
    invoke-virtual {v7, v10}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :catchall_0
    move-exception v0

    .line 189
    invoke-virtual {v7, v10}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :cond_8
    :goto_4
    if-lez v6, :cond_a

    .line 194
    .line 195
    if-lez v3, :cond_9

    .line 196
    .line 197
    const-string v3, "\uff0c"

    .line 198
    .line 199
    invoke-virtual {v7, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_9
    new-instance v10, Landroidx/compose/ui/text/SpanStyle;

    .line 203
    .line 204
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 205
    .line 206
    .line 207
    move-result-wide v11

    .line 208
    const v31, 0xfffe

    .line 209
    .line 210
    .line 211
    const/16 v32, 0x0

    .line 212
    .line 213
    const-wide/16 v13, 0x0

    .line 214
    .line 215
    const/4 v15, 0x0

    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    const/16 v18, 0x0

    .line 221
    .line 222
    const/16 v19, 0x0

    .line 223
    .line 224
    const-wide/16 v20, 0x0

    .line 225
    .line 226
    const/16 v22, 0x0

    .line 227
    .line 228
    const/16 v23, 0x0

    .line 229
    .line 230
    const/16 v24, 0x0

    .line 231
    .line 232
    const-wide/16 v25, 0x0

    .line 233
    .line 234
    const/16 v27, 0x0

    .line 235
    .line 236
    const/16 v28, 0x0

    .line 237
    .line 238
    const/16 v29, 0x0

    .line 239
    .line 240
    const/16 v30, 0x0

    .line 241
    .line 242
    invoke-direct/range {v10 .. v32}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v7, v10}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    :try_start_1
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {v7, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 254
    .line 255
    .line 256
    invoke-virtual {v7, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 257
    .line 258
    .line 259
    const-string v3, " \u9898\u8fdb\u5165\u5df2\u638c\u63e1"

    .line 260
    .line 261
    invoke-virtual {v7, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :catchall_1
    move-exception v0

    .line 266
    invoke-virtual {v7, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :cond_a
    :goto_5
    invoke-virtual {v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    const-wide v6, 0xff666666L

    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 280
    .line 281
    .line 282
    move-result-wide v6

    .line 283
    const/16 v8, 0xc

    .line 284
    .line 285
    invoke-static {v8}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 286
    .line 287
    .line 288
    move-result-wide v8

    .line 289
    and-int/lit8 v5, v5, 0x70

    .line 290
    .line 291
    or-int/lit16 v5, v5, 0xd80

    .line 292
    .line 293
    const/16 v25, 0x0

    .line 294
    .line 295
    const v26, 0x3fff0

    .line 296
    .line 297
    .line 298
    move-object v1, v3

    .line 299
    move-object/from16 v23, v4

    .line 300
    .line 301
    move-wide v3, v6

    .line 302
    const/4 v7, 0x0

    .line 303
    move/from16 v24, v5

    .line 304
    .line 305
    move-wide v5, v8

    .line 306
    const/4 v8, 0x0

    .line 307
    const/4 v9, 0x0

    .line 308
    const-wide/16 v10, 0x0

    .line 309
    .line 310
    const/4 v12, 0x0

    .line 311
    const/4 v13, 0x0

    .line 312
    const-wide/16 v14, 0x0

    .line 313
    .line 314
    const/16 v16, 0x0

    .line 315
    .line 316
    const/16 v17, 0x0

    .line 317
    .line 318
    const/16 v18, 0x0

    .line 319
    .line 320
    const/16 v19, 0x0

    .line 321
    .line 322
    const/16 v20, 0x0

    .line 323
    .line 324
    const/16 v21, 0x0

    .line 325
    .line 326
    const/16 v22, 0x0

    .line 327
    .line 328
    invoke-static/range {v1 .. v26}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 329
    .line 330
    .line 331
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-eqz v1, :cond_c

    .line 336
    .line 337
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_b
    move-object/from16 v23, v4

    .line 342
    .line 343
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 344
    .line 345
    .line 346
    :cond_c
    :goto_6
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    if-eqz v1, :cond_d

    .line 351
    .line 352
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/q3;

    .line 353
    .line 354
    const/4 v4, 0x2

    .line 355
    move/from16 v5, p3

    .line 356
    .line 357
    invoke-direct {v3, v0, v2, v5, v4}, Lcom/zykj/mistake/feature/notebook/detail/q3;-><init>(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;II)V

    .line 358
    .line 359
    .line 360
    invoke-interface {v1, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 361
    .line 362
    .line 363
    :cond_d
    return-void
.end method

.method public static final e(Lcom/zykj/mistake/feature/notebook/detail/l3;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    .line 1
    move/from16 v1, p4

    .line 2
    .line 3
    const v0, 0x7e84de32

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v10

    .line 12
    and-int/lit8 v2, v1, 0x6

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v10, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x2

    .line 25
    :goto_0
    or-int/2addr v2, v1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v2, v1

    .line 28
    :goto_1
    and-int/lit8 v3, v1, 0x30

    .line 29
    .line 30
    if-nez v3, :cond_3

    .line 31
    .line 32
    invoke-interface {v10, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    const/16 v3, 0x20

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v3, 0x10

    .line 42
    .line 43
    :goto_2
    or-int/2addr v2, v3

    .line 44
    :cond_3
    and-int/lit16 v3, v1, 0x180

    .line 45
    .line 46
    if-nez v3, :cond_5

    .line 47
    .line 48
    invoke-interface {v10, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    const/16 v3, 0x100

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    const/16 v3, 0x80

    .line 58
    .line 59
    :goto_3
    or-int/2addr v2, v3

    .line 60
    :cond_5
    and-int/lit16 v3, v2, 0x93

    .line 61
    .line 62
    const/16 v4, 0x92

    .line 63
    .line 64
    if-eq v3, v4, :cond_6

    .line 65
    .line 66
    const/4 v3, 0x1

    .line 67
    goto :goto_4

    .line 68
    :cond_6
    const/4 v3, 0x0

    .line 69
    :goto_4
    and-int/lit8 v4, v2, 0x1

    .line 70
    .line 71
    invoke-interface {v10, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_8

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_7

    .line 82
    .line 83
    const/4 v3, -0x1

    .line 84
    const-string v4, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeExitDialog (MistakeDetailNewScreen.kt:324)"

    .line 85
    .line 86
    invoke-static {v0, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_7
    shl-int/lit8 v0, v2, 0x3

    .line 90
    .line 91
    and-int/lit8 v3, v0, 0x70

    .line 92
    .line 93
    const v4, 0x30186

    .line 94
    .line 95
    .line 96
    or-int/2addr v3, v4

    .line 97
    and-int/lit16 v0, v0, 0x1c00

    .line 98
    .line 99
    or-int/2addr v0, v3

    .line 100
    shl-int/lit8 v3, v2, 0xf

    .line 101
    .line 102
    const/high16 v4, 0x380000

    .line 103
    .line 104
    and-int/2addr v3, v4

    .line 105
    or-int/2addr v0, v3

    .line 106
    shl-int/lit8 v2, v2, 0x12

    .line 107
    .line 108
    const/high16 v3, 0x1c00000

    .line 109
    .line 110
    and-int/2addr v2, v3

    .line 111
    or-int v11, v0, v2

    .line 112
    .line 113
    const/16 v12, 0x10

    .line 114
    .line 115
    const-string v2, "\u9000\u51fa\u7ec3\u4e60"

    .line 116
    .line 117
    const-string v4, "\u9000\u51fa"

    .line 118
    .line 119
    const/4 v6, 0x0

    .line 120
    const-string v7, "\u53d6\u6d88"

    .line 121
    .line 122
    move-object v9, p1

    .line 123
    move-object v3, p0

    .line 124
    move-object v8, p1

    .line 125
    move-object v5, p2

    .line 126
    invoke-static/range {v2 .. v12}, Lcom/zykj/mistake/feature/notebook/detail/x3;->l(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/l3;Ljava/lang/String;Lr6/a;ZLjava/lang/String;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 127
    .line 128
    .line 129
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_9

    .line 134
    .line 135
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 140
    .line 141
    .line 142
    :cond_9
    :goto_5
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    if-eqz v6, :cond_a

    .line 147
    .line 148
    new-instance v0, Landroidx/lifecycle/compose/g;

    .line 149
    .line 150
    const/16 v2, 0xb

    .line 151
    .line 152
    move-object v3, p0

    .line 153
    move-object v4, p1

    .line 154
    move-object v5, p2

    .line 155
    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/compose/g;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 159
    .line 160
    .line 161
    :cond_a
    return-void
.end method

.method public static final f(Ljava/lang/String;ZLcom/zykj/mistake/feature/notebook/detail/l3;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    .line 1
    move/from16 v5, p5

    .line 2
    .line 3
    const v0, 0x36844d2f

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p4

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v14

    .line 12
    and-int/lit8 v1, v5, 0x6

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    move-object/from16 v1, p0

    .line 17
    .line 18
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v2, 0x2

    .line 27
    :goto_0
    or-int/2addr v2, v5

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object/from16 v1, p0

    .line 30
    .line 31
    move v2, v5

    .line 32
    :goto_1
    and-int/lit8 v3, v5, 0x30

    .line 33
    .line 34
    move/from16 v10, p1

    .line 35
    .line 36
    if-nez v3, :cond_3

    .line 37
    .line 38
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    const/16 v3, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v2, v3

    .line 50
    :cond_3
    and-int/lit16 v3, v5, 0x180

    .line 51
    .line 52
    if-nez v3, :cond_5

    .line 53
    .line 54
    move-object/from16 v3, p2

    .line 55
    .line 56
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    const/16 v4, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v4, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v2, v4

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move-object/from16 v3, p2

    .line 70
    .line 71
    :goto_4
    and-int/lit16 v4, v5, 0xc00

    .line 72
    .line 73
    if-nez v4, :cond_7

    .line 74
    .line 75
    move-object/from16 v4, p3

    .line 76
    .line 77
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_6

    .line 82
    .line 83
    const/16 v6, 0x800

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    const/16 v6, 0x400

    .line 87
    .line 88
    :goto_5
    or-int/2addr v2, v6

    .line 89
    goto :goto_6

    .line 90
    :cond_7
    move-object/from16 v4, p3

    .line 91
    .line 92
    :goto_6
    and-int/lit16 v6, v2, 0x493

    .line 93
    .line 94
    const/16 v7, 0x492

    .line 95
    .line 96
    if-eq v6, v7, :cond_8

    .line 97
    .line 98
    const/4 v6, 0x1

    .line 99
    goto :goto_7

    .line 100
    :cond_8
    const/4 v6, 0x0

    .line 101
    :goto_7
    and-int/lit8 v7, v2, 0x1

    .line 102
    .line 103
    invoke-interface {v14, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-eqz v6, :cond_a

    .line 108
    .line 109
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_9

    .line 114
    .line 115
    const/4 v6, -0x1

    .line 116
    const-string v7, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeFinishedDialog (MistakeDetailNewScreen.kt:342)"

    .line 117
    .line 118
    invoke-static {v0, v2, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_9
    and-int/lit8 v0, v2, 0xe

    .line 122
    .line 123
    or-int/lit16 v0, v0, 0x180

    .line 124
    .line 125
    shr-int/lit8 v6, v2, 0x3

    .line 126
    .line 127
    and-int/lit8 v6, v6, 0x70

    .line 128
    .line 129
    or-int/2addr v0, v6

    .line 130
    and-int/lit16 v6, v2, 0x1c00

    .line 131
    .line 132
    or-int/2addr v0, v6

    .line 133
    shl-int/lit8 v2, v2, 0x9

    .line 134
    .line 135
    const v6, 0xe000

    .line 136
    .line 137
    .line 138
    and-int/2addr v2, v6

    .line 139
    or-int v15, v0, v2

    .line 140
    .line 141
    const/16 v16, 0xe0

    .line 142
    .line 143
    const-string v8, "\u7ed3\u675f\u7ec3\u4e60"

    .line 144
    .line 145
    const/4 v11, 0x0

    .line 146
    const/4 v12, 0x0

    .line 147
    const/4 v13, 0x0

    .line 148
    move-object v6, v1

    .line 149
    move-object v7, v3

    .line 150
    move-object v9, v4

    .line 151
    invoke-static/range {v6 .. v16}, Lcom/zykj/mistake/feature/notebook/detail/x3;->l(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/l3;Ljava/lang/String;Lr6/a;ZLjava/lang/String;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 152
    .line 153
    .line 154
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_b

    .line 159
    .line 160
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 161
    .line 162
    .line 163
    goto :goto_8

    .line 164
    :cond_a
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 165
    .line 166
    .line 167
    :cond_b
    :goto_8
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    if-eqz v7, :cond_c

    .line 172
    .line 173
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/p3;

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    move-object/from16 v1, p0

    .line 177
    .line 178
    move/from16 v2, p1

    .line 179
    .line 180
    move-object/from16 v3, p2

    .line 181
    .line 182
    move-object/from16 v4, p3

    .line 183
    .line 184
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/p3;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Lr6/a;II)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 188
    .line 189
    .line 190
    :cond_c
    return-void
.end method

.method public static final g(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    .line 1
    const v0, 0x4971cefc    # 990447.75f

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    and-int/lit8 v1, p3, 0x6

    .line 9
    .line 10
    const/4 v2, 0x4

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    invoke-interface {p2, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x2

    .line 22
    :goto_0
    or-int/2addr v1, p3

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v1, p3

    .line 25
    :goto_1
    and-int/lit8 v3, p3, 0x30

    .line 26
    .line 27
    if-nez v3, :cond_3

    .line 28
    .line 29
    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v3, 0x10

    .line 39
    .line 40
    :goto_2
    or-int/2addr v1, v3

    .line 41
    :cond_3
    and-int/lit8 v3, v1, 0x13

    .line 42
    .line 43
    const/16 v4, 0x12

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x1

    .line 47
    if-eq v3, v4, :cond_4

    .line 48
    .line 49
    move v3, v6

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    move v3, v5

    .line 52
    :goto_3
    and-int/lit8 v4, v1, 0x1

    .line 53
    .line 54
    invoke-interface {p2, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_9

    .line 59
    .line 60
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    const/4 v3, -0x1

    .line 67
    const-string v4, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeGauge (MistakeDetailNewScreen.kt:485)"

    .line 68
    .line 69
    invoke-static {v0, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    and-int/lit8 v0, v1, 0xe

    .line 73
    .line 74
    if-ne v0, v2, :cond_6

    .line 75
    .line 76
    move v5, v6

    .line 77
    :cond_6
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-nez v5, :cond_7

    .line 82
    .line 83
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 84
    .line 85
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-ne v0, v2, :cond_8

    .line 90
    .line 91
    :cond_7
    new-instance v0, Landroidx/navigation/i;

    .line 92
    .line 93
    const/16 v2, 0x9

    .line 94
    .line 95
    invoke-direct {v0, p0, v2}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_8
    check-cast v0, Lr6/c;

    .line 102
    .line 103
    shr-int/lit8 v1, v1, 0x3

    .line 104
    .line 105
    and-int/lit8 v1, v1, 0xe

    .line 106
    .line 107
    invoke-static {p1, v0, p2, v1}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 108
    .line 109
    .line 110
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_a

    .line 115
    .line 116
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_9
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 121
    .line 122
    .line 123
    :cond_a
    :goto_4
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    if-eqz p2, :cond_b

    .line 128
    .line 129
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/q3;

    .line 130
    .line 131
    const/4 v1, 0x0

    .line 132
    invoke-direct {v0, p0, p1, p3, v1}, Lcom/zykj/mistake/feature/notebook/detail/q3;-><init>(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;II)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 136
    .line 137
    .line 138
    :cond_b
    return-void
.end method

.method public static final h(FFLandroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/drawscope/Stroke;FJJII)V
    .locals 24

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    mul-float v0, v0, p4

    .line 4
    .line 5
    sub-float v1, p0, p4

    .line 6
    .line 7
    sub-float v2, p1, p4

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-long v3, v1

    .line 14
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    int-to-long v1, v1

    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    shl-long/2addr v3, v5

    .line 22
    const-wide v6, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr v1, v6

    .line 28
    or-long/2addr v1, v3

    .line 29
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v14

    .line 33
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    int-to-long v1, v1

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    int-to-long v3, v3

    .line 43
    shl-long/2addr v1, v5

    .line 44
    and-long/2addr v3, v6

    .line 45
    or-long/2addr v1, v3

    .line 46
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v16

    .line 50
    const/16 v22, 0x340

    .line 51
    .line 52
    const/16 v23, 0x0

    .line 53
    .line 54
    const/high16 v11, 0x43120000    # 146.0f

    .line 55
    .line 56
    const/high16 v12, 0x43780000    # 248.0f

    .line 57
    .line 58
    const/4 v13, 0x0

    .line 59
    const/16 v18, 0x0

    .line 60
    .line 61
    const/16 v20, 0x0

    .line 62
    .line 63
    const/16 v21, 0x0

    .line 64
    .line 65
    move-object/from16 v8, p2

    .line 66
    .line 67
    move-object/from16 v19, p3

    .line 68
    .line 69
    move-wide/from16 v9, p5

    .line 70
    .line 71
    invoke-static/range {v8 .. v23}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawArc-yD3GUKo$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move/from16 v1, p10

    .line 75
    .line 76
    int-to-float v1, v1

    .line 77
    const/high16 v2, 0x3f800000    # 1.0f

    .line 78
    .line 79
    cmpg-float v3, v1, v2

    .line 80
    .line 81
    if-gez v3, :cond_0

    .line 82
    .line 83
    move v1, v2

    .line 84
    :cond_0
    if-gez p9, :cond_1

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move/from16 v3, p9

    .line 89
    .line 90
    :goto_0
    int-to-float v3, v3

    .line 91
    div-float/2addr v3, v1

    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-static {v3, v1, v2}, Lkotlin/collections/u;->l(FFF)F

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    mul-float/2addr v12, v2

    .line 98
    cmpl-float v1, v12, v1

    .line 99
    .line 100
    if-lez v1, :cond_2

    .line 101
    .line 102
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    int-to-long v1, v1

    .line 107
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    int-to-long v3, v0

    .line 112
    shl-long v0, v1, v5

    .line 113
    .line 114
    and-long v2, v3, v6

    .line 115
    .line 116
    or-long/2addr v0, v2

    .line 117
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v16

    .line 121
    const/16 v22, 0x340

    .line 122
    .line 123
    const/16 v23, 0x0

    .line 124
    .line 125
    const/4 v13, 0x0

    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    const/16 v20, 0x0

    .line 129
    .line 130
    const/16 v21, 0x0

    .line 131
    .line 132
    move-object/from16 v8, p2

    .line 133
    .line 134
    move-object/from16 v19, p3

    .line 135
    .line 136
    move-wide/from16 v9, p7

    .line 137
    .line 138
    invoke-static/range {v8 .. v23}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawArc-yD3GUKo$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_2
    return-void
.end method

.method public static final i(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 39

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p5

    .line 4
    .line 5
    move/from16 v7, p7

    .line 6
    .line 7
    const v0, 0x319eaeea

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p6

    .line 11
    .line 12
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    and-int/lit8 v4, v7, 0x6

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    invoke-interface {v3, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v4, 0x2

    .line 29
    :goto_0
    or-int/2addr v4, v7

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v4, v7

    .line 32
    :goto_1
    and-int/lit8 v8, v7, 0x30

    .line 33
    .line 34
    if-nez v8, :cond_3

    .line 35
    .line 36
    move-object/from16 v8, p2

    .line 37
    .line 38
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eqz v9, :cond_2

    .line 43
    .line 44
    const/16 v9, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v9, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v4, v9

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move-object/from16 v8, p2

    .line 52
    .line 53
    :goto_3
    and-int/lit16 v9, v7, 0x180

    .line 54
    .line 55
    if-nez v9, :cond_5

    .line 56
    .line 57
    move-object/from16 v9, p3

    .line 58
    .line 59
    invoke-interface {v3, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-eqz v10, :cond_4

    .line 64
    .line 65
    const/16 v10, 0x100

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    const/16 v10, 0x80

    .line 69
    .line 70
    :goto_4
    or-int/2addr v4, v10

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    move-object/from16 v9, p3

    .line 73
    .line 74
    :goto_5
    and-int/lit16 v10, v7, 0xc00

    .line 75
    .line 76
    if-nez v10, :cond_7

    .line 77
    .line 78
    move-object/from16 v10, p4

    .line 79
    .line 80
    invoke-interface {v3, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-eqz v11, :cond_6

    .line 85
    .line 86
    const/16 v11, 0x800

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_6
    const/16 v11, 0x400

    .line 90
    .line 91
    :goto_6
    or-int/2addr v4, v11

    .line 92
    goto :goto_7

    .line 93
    :cond_7
    move-object/from16 v10, p4

    .line 94
    .line 95
    :goto_7
    and-int/lit16 v11, v7, 0x6000

    .line 96
    .line 97
    if-nez v11, :cond_9

    .line 98
    .line 99
    invoke-interface {v3, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v11

    .line 103
    if-eqz v11, :cond_8

    .line 104
    .line 105
    const/16 v11, 0x4000

    .line 106
    .line 107
    goto :goto_8

    .line 108
    :cond_8
    const/16 v11, 0x2000

    .line 109
    .line 110
    :goto_8
    or-int/2addr v4, v11

    .line 111
    :cond_9
    and-int/lit16 v11, v4, 0x2493

    .line 112
    .line 113
    const/16 v12, 0x2492

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    if-eq v11, v12, :cond_a

    .line 117
    .line 118
    const/4 v11, 0x1

    .line 119
    goto :goto_9

    .line 120
    :cond_a
    move v11, v13

    .line 121
    :goto_9
    and-int/lit8 v12, v4, 0x1

    .line 122
    .line 123
    invoke-interface {v3, v11, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-eqz v11, :cond_19

    .line 128
    .line 129
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    if-eqz v11, :cond_b

    .line 134
    .line 135
    const/4 v11, -0x1

    .line 136
    const-string v12, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeMetric (MistakeDetailNewScreen.kt:595)"

    .line 137
    .line 138
    invoke-static {v0, v4, v11, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_b
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 142
    .line 143
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    sget-object v33, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 148
    .line 149
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    const/16 v14, 0x30

    .line 154
    .line 155
    invoke-static {v12, v11, v3, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    invoke-static {v3, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    invoke-static {v3, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 172
    .line 173
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 174
    .line 175
    .line 176
    move-result-object v14

    .line 177
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 178
    .line 179
    .line 180
    move-result-object v18

    .line 181
    if-nez v18, :cond_c

    .line 182
    .line 183
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 184
    .line 185
    .line 186
    :cond_c
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 187
    .line 188
    .line 189
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 190
    .line 191
    .line 192
    move-result v18

    .line 193
    if-eqz v18, :cond_d

    .line 194
    .line 195
    invoke-interface {v3, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 196
    .line 197
    .line 198
    goto :goto_a

    .line 199
    :cond_d
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 200
    .line 201
    .line 202
    :goto_a
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 203
    .line 204
    .line 205
    move-result-object v14

    .line 206
    invoke-static {v13, v14, v11, v14, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 211
    .line 212
    .line 213
    move-result v15

    .line 214
    if-nez v15, :cond_e

    .line 215
    .line 216
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v15

    .line 220
    move-object/from16 v34, v0

    .line 221
    .line 222
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_f

    .line 231
    .line 232
    goto :goto_b

    .line 233
    :cond_e
    move-object/from16 v34, v0

    .line 234
    .line 235
    :goto_b
    invoke-static {v12, v14, v12, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 236
    .line 237
    .line 238
    :cond_f
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {v14, v5, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 243
    .line 244
    .line 245
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 246
    .line 247
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 252
    .line 253
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    const/16 v12, 0x30

    .line 258
    .line 259
    invoke-static {v11, v0, v3, v12}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    const/4 v11, 0x0

    .line 264
    invoke-static {v3, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 265
    .line 266
    .line 267
    move-result v12

    .line 268
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    invoke-static {v3, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 273
    .line 274
    .line 275
    move-result-object v14

    .line 276
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 277
    .line 278
    .line 279
    move-result-object v15

    .line 280
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 281
    .line 282
    .line 283
    move-result-object v17

    .line 284
    if-nez v17, :cond_10

    .line 285
    .line 286
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 287
    .line 288
    .line 289
    :cond_10
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 290
    .line 291
    .line 292
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 293
    .line 294
    .line 295
    move-result v17

    .line 296
    if-eqz v17, :cond_11

    .line 297
    .line 298
    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 299
    .line 300
    .line 301
    goto :goto_c

    .line 302
    :cond_11
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 303
    .line 304
    .line 305
    :goto_c
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 306
    .line 307
    .line 308
    move-result-object v15

    .line 309
    invoke-static {v13, v15, v0, v15, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    if-nez v11, :cond_12

    .line 318
    .line 319
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    move/from16 v35, v4

    .line 324
    .line 325
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    if-nez v4, :cond_13

    .line 334
    .line 335
    goto :goto_d

    .line 336
    :cond_12
    move/from16 v35, v4

    .line 337
    .line 338
    :goto_d
    invoke-static {v12, v15, v12, v0}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 339
    .line 340
    .line 341
    :cond_13
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {v15, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 346
    .line 347
    .line 348
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 349
    .line 350
    const/16 v4, 0x8

    .line 351
    .line 352
    int-to-float v4, v4

    .line 353
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 354
    .line 355
    .line 356
    move-result v4

    .line 357
    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    const/16 v11, 0x32

    .line 362
    .line 363
    invoke-static {v11}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape(I)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    invoke-static {v4, v1, v2, v11}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    const/4 v11, 0x0

    .line 372
    invoke-static {v4, v3, v11}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 373
    .line 374
    .line 375
    const-wide v14, 0xff666666L

    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    invoke-static {v14, v15}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 381
    .line 382
    .line 383
    move-result-wide v14

    .line 384
    const/16 v4, 0xc

    .line 385
    .line 386
    move-object/from16 v16, v13

    .line 387
    .line 388
    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 389
    .line 390
    .line 391
    move-result-wide v12

    .line 392
    move/from16 v36, v4

    .line 393
    .line 394
    const/4 v4, 0x6

    .line 395
    int-to-float v4, v4

    .line 396
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 397
    .line 398
    .line 399
    move-result v19

    .line 400
    const/16 v23, 0xe

    .line 401
    .line 402
    const/16 v24, 0x0

    .line 403
    .line 404
    const/16 v20, 0x0

    .line 405
    .line 406
    const/16 v21, 0x0

    .line 407
    .line 408
    const/16 v22, 0x0

    .line 409
    .line 410
    move-object/from16 v18, v5

    .line 411
    .line 412
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    move-object/from16 v37, v18

    .line 417
    .line 418
    shr-int/lit8 v17, v35, 0x3

    .line 419
    .line 420
    and-int/lit8 v11, v17, 0xe

    .line 421
    .line 422
    or-int/lit16 v11, v11, 0xdb0

    .line 423
    .line 424
    const/16 v31, 0x0

    .line 425
    .line 426
    const v32, 0x1fff0

    .line 427
    .line 428
    .line 429
    move/from16 v30, v11

    .line 430
    .line 431
    move-wide v10, v14

    .line 432
    const/4 v14, 0x0

    .line 433
    const/4 v15, 0x0

    .line 434
    move-object/from16 v17, v16

    .line 435
    .line 436
    const/16 v16, 0x0

    .line 437
    .line 438
    move-object/from16 v19, v17

    .line 439
    .line 440
    const/16 v20, 0x0

    .line 441
    .line 442
    const-wide/16 v17, 0x0

    .line 443
    .line 444
    move-object/from16 v21, v19

    .line 445
    .line 446
    const/16 v19, 0x0

    .line 447
    .line 448
    move/from16 v22, v20

    .line 449
    .line 450
    const/16 v20, 0x0

    .line 451
    .line 452
    move-object/from16 v23, v21

    .line 453
    .line 454
    move/from16 v24, v22

    .line 455
    .line 456
    const-wide/16 v21, 0x0

    .line 457
    .line 458
    move-object/from16 v25, v23

    .line 459
    .line 460
    const/16 v23, 0x0

    .line 461
    .line 462
    move/from16 v26, v24

    .line 463
    .line 464
    const/16 v24, 0x0

    .line 465
    .line 466
    move-object/from16 v27, v25

    .line 467
    .line 468
    const/16 v25, 0x0

    .line 469
    .line 470
    move/from16 v28, v26

    .line 471
    .line 472
    const/16 v26, 0x0

    .line 473
    .line 474
    move-object/from16 v29, v27

    .line 475
    .line 476
    const/16 v27, 0x0

    .line 477
    .line 478
    move/from16 v38, v28

    .line 479
    .line 480
    const/16 v28, 0x0

    .line 481
    .line 482
    move-object/from16 v9, v29

    .line 483
    .line 484
    move-object/from16 v29, v3

    .line 485
    .line 486
    move-object v3, v9

    .line 487
    move-object v9, v5

    .line 488
    move/from16 v5, v38

    .line 489
    .line 490
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 491
    .line 492
    .line 493
    move-object/from16 v8, v29

    .line 494
    .line 495
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 496
    .line 497
    .line 498
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 499
    .line 500
    .line 501
    move-result v20

    .line 502
    const/16 v23, 0xd

    .line 503
    .line 504
    const/16 v24, 0x0

    .line 505
    .line 506
    const/16 v19, 0x0

    .line 507
    .line 508
    const/16 v21, 0x0

    .line 509
    .line 510
    const/16 v22, 0x0

    .line 511
    .line 512
    move-object/from16 v18, v37

    .line 513
    .line 514
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    move-object/from16 v9, v18

    .line 519
    .line 520
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 521
    .line 522
    .line 523
    move-result-object v10

    .line 524
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 525
    .line 526
    .line 527
    move-result-object v11

    .line 528
    invoke-static {v10, v11, v8, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 529
    .line 530
    .line 531
    move-result-object v10

    .line 532
    invoke-static {v8, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 533
    .line 534
    .line 535
    move-result v5

    .line 536
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 537
    .line 538
    .line 539
    move-result-object v11

    .line 540
    invoke-static {v8, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 541
    .line 542
    .line 543
    move-result-object v4

    .line 544
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 545
    .line 546
    .line 547
    move-result-object v12

    .line 548
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 549
    .line 550
    .line 551
    move-result-object v13

    .line 552
    if-nez v13, :cond_14

    .line 553
    .line 554
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 555
    .line 556
    .line 557
    :cond_14
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 558
    .line 559
    .line 560
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 561
    .line 562
    .line 563
    move-result v13

    .line 564
    if-eqz v13, :cond_15

    .line 565
    .line 566
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 567
    .line 568
    .line 569
    goto :goto_e

    .line 570
    :cond_15
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 571
    .line 572
    .line 573
    :goto_e
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 574
    .line 575
    .line 576
    move-result-object v12

    .line 577
    invoke-static {v3, v12, v10, v12, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 578
    .line 579
    .line 580
    move-result-object v10

    .line 581
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 582
    .line 583
    .line 584
    move-result v11

    .line 585
    if-nez v11, :cond_16

    .line 586
    .line 587
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v11

    .line 591
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 592
    .line 593
    .line 594
    move-result-object v13

    .line 595
    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v11

    .line 599
    if-nez v11, :cond_17

    .line 600
    .line 601
    :cond_16
    invoke-static {v5, v12, v5, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 602
    .line 603
    .line 604
    :cond_17
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    invoke-static {v12, v4, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 609
    .line 610
    .line 611
    const-wide v3, 0xff15171aL

    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 617
    .line 618
    .line 619
    move-result-wide v10

    .line 620
    const/16 v3, 0x1c

    .line 621
    .line 622
    invoke-static {v3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 623
    .line 624
    .line 625
    move-result-wide v12

    .line 626
    sget-object v3, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 627
    .line 628
    invoke-virtual {v3}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 629
    .line 630
    .line 631
    move-result-object v15

    .line 632
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    invoke-interface {v0, v9, v3}, Landroidx/compose/foundation/layout/RowScope;->alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    shr-int/lit8 v4, v35, 0x6

    .line 641
    .line 642
    and-int/lit8 v4, v4, 0xe

    .line 643
    .line 644
    const v5, 0x30d80

    .line 645
    .line 646
    .line 647
    or-int v30, v4, v5

    .line 648
    .line 649
    const/16 v31, 0x0

    .line 650
    .line 651
    const v32, 0x1ffd0

    .line 652
    .line 653
    .line 654
    const/4 v14, 0x0

    .line 655
    const/16 v16, 0x0

    .line 656
    .line 657
    const-wide/16 v17, 0x0

    .line 658
    .line 659
    const/16 v19, 0x0

    .line 660
    .line 661
    const/16 v20, 0x0

    .line 662
    .line 663
    const-wide/16 v21, 0x0

    .line 664
    .line 665
    const/16 v23, 0x0

    .line 666
    .line 667
    const/16 v24, 0x0

    .line 668
    .line 669
    const/16 v25, 0x0

    .line 670
    .line 671
    const/16 v26, 0x0

    .line 672
    .line 673
    const/16 v27, 0x0

    .line 674
    .line 675
    const/16 v28, 0x0

    .line 676
    .line 677
    move-object/from16 v29, v9

    .line 678
    .line 679
    move-object v9, v3

    .line 680
    move-object/from16 v3, v29

    .line 681
    .line 682
    move-object/from16 v29, v8

    .line 683
    .line 684
    move-object/from16 v8, p3

    .line 685
    .line 686
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 687
    .line 688
    .line 689
    move-object/from16 v8, v29

    .line 690
    .line 691
    invoke-static/range {p4 .. p4}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-nez v4, :cond_18

    .line 696
    .line 697
    const v4, -0x6d63b22f

    .line 698
    .line 699
    .line 700
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 701
    .line 702
    .line 703
    const-wide v4, 0xff999999L

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 709
    .line 710
    .line 711
    move-result-wide v10

    .line 712
    invoke-static/range {v36 .. v36}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 713
    .line 714
    .line 715
    move-result-wide v12

    .line 716
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 717
    .line 718
    .line 719
    move-result-object v4

    .line 720
    invoke-interface {v0, v3, v4}, Landroidx/compose/foundation/layout/RowScope;->alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;

    .line 721
    .line 722
    .line 723
    move-result-object v14

    .line 724
    const/4 v0, 0x4

    .line 725
    int-to-float v0, v0

    .line 726
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 727
    .line 728
    .line 729
    move-result v15

    .line 730
    const/16 v19, 0xe

    .line 731
    .line 732
    const/16 v20, 0x0

    .line 733
    .line 734
    const/16 v16, 0x0

    .line 735
    .line 736
    const/16 v17, 0x0

    .line 737
    .line 738
    const/16 v18, 0x0

    .line 739
    .line 740
    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 741
    .line 742
    .line 743
    move-result-object v9

    .line 744
    shr-int/lit8 v0, v35, 0x9

    .line 745
    .line 746
    and-int/lit8 v0, v0, 0xe

    .line 747
    .line 748
    or-int/lit16 v0, v0, 0xd80

    .line 749
    .line 750
    const/16 v31, 0x0

    .line 751
    .line 752
    const v32, 0x1fff0

    .line 753
    .line 754
    .line 755
    const/4 v14, 0x0

    .line 756
    const/4 v15, 0x0

    .line 757
    const/16 v16, 0x0

    .line 758
    .line 759
    const-wide/16 v17, 0x0

    .line 760
    .line 761
    const/16 v19, 0x0

    .line 762
    .line 763
    const-wide/16 v21, 0x0

    .line 764
    .line 765
    const/16 v23, 0x0

    .line 766
    .line 767
    const/16 v24, 0x0

    .line 768
    .line 769
    const/16 v25, 0x0

    .line 770
    .line 771
    const/16 v26, 0x0

    .line 772
    .line 773
    const/16 v27, 0x0

    .line 774
    .line 775
    const/16 v28, 0x0

    .line 776
    .line 777
    move/from16 v30, v0

    .line 778
    .line 779
    move-object/from16 v29, v8

    .line 780
    .line 781
    move-object/from16 v8, p4

    .line 782
    .line 783
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 784
    .line 785
    .line 786
    move-object/from16 v8, v29

    .line 787
    .line 788
    :goto_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 789
    .line 790
    .line 791
    goto :goto_10

    .line 792
    :cond_18
    const v0, -0x6ecb2499

    .line 793
    .line 794
    .line 795
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 796
    .line 797
    .line 798
    goto :goto_f

    .line 799
    :goto_10
    invoke-static {v8}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    if-eqz v0, :cond_1a

    .line 804
    .line 805
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 806
    .line 807
    .line 808
    goto :goto_11

    .line 809
    :cond_19
    move-object v8, v3

    .line 810
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 811
    .line 812
    .line 813
    :cond_1a
    :goto_11
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 814
    .line 815
    .line 816
    move-result-object v8

    .line 817
    if-eqz v8, :cond_1b

    .line 818
    .line 819
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/r3;

    .line 820
    .line 821
    move-object/from16 v3, p2

    .line 822
    .line 823
    move-object/from16 v4, p3

    .line 824
    .line 825
    move-object/from16 v5, p4

    .line 826
    .line 827
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/r3;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;I)V

    .line 828
    .line 829
    .line 830
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 831
    .line 832
    .line 833
    :cond_1b
    return-void
.end method

.method public static final j(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x1e60f68d

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v10

    .line 16
    and-int/lit8 v4, v2, 0x6

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v4, 0x2

    .line 29
    :goto_0
    or-int/2addr v4, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v4, v2

    .line 32
    :goto_1
    and-int/lit8 v5, v2, 0x30

    .line 33
    .line 34
    if-nez v5, :cond_3

    .line 35
    .line 36
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    const/16 v5, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v5, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v4, v5

    .line 48
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 49
    .line 50
    const/16 v6, 0x12

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    if-eq v5, v6, :cond_4

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move v5, v12

    .line 58
    :goto_3
    and-int/lit8 v6, v4, 0x1

    .line 59
    .line 60
    invoke-interface {v10, v5, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_a

    .line 65
    .line 66
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_5

    .line 71
    .line 72
    const/4 v5, -0x1

    .line 73
    const-string v6, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeMetricRow (MistakeDetailNewScreen.kt:557)"

    .line 74
    .line 75
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 79
    .line 80
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 85
    .line 86
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const/4 v5, 0x6

    .line 91
    invoke-static {v3, v4, v10, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v10, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-static {v10, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 108
    .line 109
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    if-nez v9, :cond_6

    .line 118
    .line 119
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 120
    .line 121
    .line 122
    :cond_6
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 123
    .line 124
    .line 125
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eqz v9, :cond_7

    .line 130
    .line 131
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 136
    .line 137
    .line 138
    :goto_4
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-static {v7, v8, v3, v8, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-nez v5, :cond_8

    .line 151
    .line 152
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-nez v5, :cond_9

    .line 165
    .line 166
    :cond_8
    invoke-static {v4, v8, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 167
    .line 168
    .line 169
    :cond_9
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v8, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 174
    .line 175
    .line 176
    sget-object v13, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 177
    .line 178
    const-wide v3, 0xff5a9dffL

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 184
    .line 185
    .line 186
    move-result-wide v4

    .line 187
    iget v3, v0, Lcom/zykj/mistake/feature/notebook/detail/l3;->a:I

    .line 188
    .line 189
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    iget v3, v0, Lcom/zykj/mistake/feature/notebook/detail/l3;->f:I

    .line 194
    .line 195
    const-string v6, " / "

    .line 196
    .line 197
    invoke-static {v3, v6}, Landroid/support/v4/media/f;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    sget-object v14, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 202
    .line 203
    const/16 v17, 0x2

    .line 204
    .line 205
    const/16 v18, 0x0

    .line 206
    .line 207
    const/high16 v15, 0x3f800000    # 1.0f

    .line 208
    .line 209
    const/16 v16, 0x0

    .line 210
    .line 211
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    const/16 v11, 0x36

    .line 216
    .line 217
    const-string v6, "\u672c\u6b21\u7d2f\u8ba1\u7ec3\u4e60\u9898\u6570"

    .line 218
    .line 219
    invoke-static/range {v4 .. v11}, Lcom/zykj/mistake/feature/notebook/detail/x3;->i(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 220
    .line 221
    .line 222
    invoke-static {v10, v12}, Lcom/zykj/mistake/feature/notebook/detail/x3;->c(Landroidx/compose/runtime/Composer;I)V

    .line 223
    .line 224
    .line 225
    const-wide v3, 0xff61d7bbL

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 231
    .line 232
    .line 233
    move-result-wide v4

    .line 234
    iget v3, v0, Lcom/zykj/mistake/feature/notebook/detail/l3;->b:I

    .line 235
    .line 236
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    const/16 v11, 0xc36

    .line 245
    .line 246
    const-string v6, "\u6b63\u786e\u9898\u6570"

    .line 247
    .line 248
    const-string v8, ""

    .line 249
    .line 250
    invoke-static/range {v4 .. v11}, Lcom/zykj/mistake/feature/notebook/detail/x3;->i(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 251
    .line 252
    .line 253
    invoke-static {v10, v12}, Lcom/zykj/mistake/feature/notebook/detail/x3;->c(Landroidx/compose/runtime/Composer;I)V

    .line 254
    .line 255
    .line 256
    const-wide v3, 0xffff7875L

    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 262
    .line 263
    .line 264
    move-result-wide v4

    .line 265
    iget v3, v0, Lcom/zykj/mistake/feature/notebook/detail/l3;->c:I

    .line 266
    .line 267
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    const-string v6, "\u9519\u8bef\u9898\u6570"

    .line 276
    .line 277
    const-string v8, ""

    .line 278
    .line 279
    invoke-static/range {v4 .. v11}, Lcom/zykj/mistake/feature/notebook/detail/x3;->i(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 283
    .line 284
    .line 285
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    if-eqz v3, :cond_b

    .line 290
    .line 291
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 292
    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 296
    .line 297
    .line 298
    :cond_b
    :goto_5
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    if-eqz v3, :cond_c

    .line 303
    .line 304
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/q3;

    .line 305
    .line 306
    const/4 v5, 0x3

    .line 307
    invoke-direct {v4, v0, v1, v2, v5}, Lcom/zykj/mistake/feature/notebook/detail/q3;-><init>(Lcom/zykj/mistake/feature/notebook/detail/l3;Landroidx/compose/ui/Modifier;II)V

    .line 308
    .line 309
    .line 310
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 311
    .line 312
    .line 313
    :cond_c
    return-void
.end method

.method public static final k(Lcom/zykj/mistake/feature/notebook/detail/l3;ZILr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    .line 1
    move/from16 v6, p6

    .line 2
    .line 3
    const v0, -0x3692cc74

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p5

    .line 7
    .line 8
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v10

    .line 12
    and-int/lit8 v1, v6, 0x6

    .line 13
    .line 14
    move-object/from16 v14, p0

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x2

    .line 27
    :goto_0
    or-int/2addr v1, v6

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, v6

    .line 30
    :goto_1
    and-int/lit8 v2, v6, 0x30

    .line 31
    .line 32
    move/from16 v12, p1

    .line 33
    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    const/16 v2, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v2, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v1, v2

    .line 48
    :cond_3
    and-int/lit16 v2, v6, 0x180

    .line 49
    .line 50
    move/from16 v13, p2

    .line 51
    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    const/16 v2, 0x100

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v2, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr v1, v2

    .line 66
    :cond_5
    and-int/lit16 v2, v6, 0xc00

    .line 67
    .line 68
    move-object/from16 v15, p3

    .line 69
    .line 70
    if-nez v2, :cond_7

    .line 71
    .line 72
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    const/16 v2, 0x800

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_6
    const/16 v2, 0x400

    .line 82
    .line 83
    :goto_4
    or-int/2addr v1, v2

    .line 84
    :cond_7
    and-int/lit16 v2, v6, 0x6000

    .line 85
    .line 86
    move-object/from16 v5, p4

    .line 87
    .line 88
    if-nez v2, :cond_9

    .line 89
    .line 90
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_8

    .line 95
    .line 96
    const/16 v2, 0x4000

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_8
    const/16 v2, 0x2000

    .line 100
    .line 101
    :goto_5
    or-int/2addr v1, v2

    .line 102
    :cond_9
    and-int/lit16 v2, v1, 0x2493

    .line 103
    .line 104
    const/16 v3, 0x2492

    .line 105
    .line 106
    const/4 v4, 0x1

    .line 107
    if-eq v2, v3, :cond_a

    .line 108
    .line 109
    move v2, v4

    .line 110
    goto :goto_6

    .line 111
    :cond_a
    const/4 v2, 0x0

    .line 112
    :goto_6
    and-int/lit8 v3, v1, 0x1

    .line 113
    .line 114
    invoke-interface {v10, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_d

    .line 119
    .line 120
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_b

    .line 125
    .line 126
    const/4 v2, -0x1

    .line 127
    const-string v3, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeRoundCompleteDialog (MistakeDetailNewScreen.kt:237)"

    .line 128
    .line 129
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 137
    .line 138
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    if-ne v0, v1, :cond_c

    .line 143
    .line 144
    new-instance v0, Lcom/zykj/view/board/play/b;

    .line 145
    .line 146
    const/16 v1, 0x8

    .line 147
    .line 148
    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_c
    move-object v7, v0

    .line 155
    check-cast v7, Lr6/a;

    .line 156
    .line 157
    new-instance v11, Lcom/zykj/mistake/feature/notebook/detail/p3;

    .line 158
    .line 159
    move-object/from16 v16, v5

    .line 160
    .line 161
    invoke-direct/range {v11 .. v16}, Lcom/zykj/mistake/feature/notebook/detail/p3;-><init>(ZILcom/zykj/mistake/feature/notebook/detail/l3;Lr6/a;Lr6/a;)V

    .line 162
    .line 163
    .line 164
    const/16 v0, 0x36

    .line 165
    .line 166
    const v1, 0x20f85815

    .line 167
    .line 168
    .line 169
    invoke-static {v1, v4, v11, v10, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    const/16 v11, 0x186

    .line 174
    .line 175
    const/4 v12, 0x2

    .line 176
    const/4 v8, 0x0

    .line 177
    invoke-static/range {v7 .. v12}, Landroidx/compose/ui/window/AndroidDialog_androidKt;->Dialog(Lr6/a;Landroidx/compose/ui/window/DialogProperties;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    .line 178
    .line 179
    .line 180
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_e

    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 187
    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 191
    .line 192
    .line 193
    :cond_e
    :goto_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    if-eqz v7, :cond_f

    .line 198
    .line 199
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/u3;

    .line 200
    .line 201
    move-object/from16 v1, p0

    .line 202
    .line 203
    move/from16 v2, p1

    .line 204
    .line 205
    move/from16 v3, p2

    .line 206
    .line 207
    move-object/from16 v4, p3

    .line 208
    .line 209
    move-object/from16 v5, p4

    .line 210
    .line 211
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/u3;-><init>(Lcom/zykj/mistake/feature/notebook/detail/l3;ZILr6/a;Lr6/a;I)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 215
    .line 216
    .line 217
    :cond_f
    return-void
.end method

.method public static final l(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/l3;Ljava/lang/String;Lr6/a;ZLjava/lang/String;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0x27d6a267

    move-object/from16 v1, p8

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v2, v9

    :goto_1
    and-int/lit8 v3, v9, 0x30

    move-object/from16 v12, p1

    if-nez v3, :cond_3

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v9, 0x180

    move-object/from16 v15, p2

    if-nez v3, :cond_5

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v9, 0xc00

    if-nez v3, :cond_7

    move-object/from16 v3, p3

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v2, v5

    goto :goto_5

    :cond_7
    move-object/from16 v3, p3

    :goto_5
    and-int/lit8 v5, v10, 0x10

    if-eqz v5, :cond_9

    or-int/lit16 v2, v2, 0x6000

    :cond_8
    move/from16 v6, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v6, v9, 0x6000

    if-nez v6, :cond_8

    move/from16 v6, p4

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v7

    if-eqz v7, :cond_a

    const/16 v7, 0x4000

    goto :goto_6

    :cond_a
    const/16 v7, 0x2000

    :goto_6
    or-int/2addr v2, v7

    :goto_7
    and-int/lit8 v7, v10, 0x20

    const/high16 v8, 0x30000

    if-eqz v7, :cond_c

    or-int/2addr v2, v8

    :cond_b
    move-object/from16 v8, p5

    goto :goto_9

    :cond_c
    and-int/2addr v8, v9

    if-nez v8, :cond_b

    move-object/from16 v8, p5

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/high16 v11, 0x20000

    goto :goto_8

    :cond_d
    const/high16 v11, 0x10000

    :goto_8
    or-int/2addr v2, v11

    :goto_9
    and-int/lit8 v11, v10, 0x40

    const/high16 v13, 0x180000

    if-eqz v11, :cond_f

    or-int/2addr v2, v13

    :cond_e
    move-object/from16 v13, p6

    goto :goto_b

    :cond_f
    and-int/2addr v13, v9

    if-nez v13, :cond_e

    move-object/from16 v13, p6

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x100000

    goto :goto_a

    :cond_10
    const/high16 v14, 0x80000

    :goto_a
    or-int/2addr v2, v14

    :goto_b
    and-int/lit16 v14, v10, 0x80

    const/high16 v16, 0xc00000

    if-eqz v14, :cond_11

    or-int v2, v2, v16

    move-object/from16 v0, p7

    goto :goto_d

    :cond_11
    and-int v16, v9, v16

    move-object/from16 v0, p7

    if-nez v16, :cond_13

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x800000

    goto :goto_c

    :cond_12
    const/high16 v17, 0x400000

    :goto_c
    or-int v2, v2, v17

    :cond_13
    :goto_d
    const v17, 0x492493

    and-int v0, v2, v17

    const v1, 0x492492

    const/16 v17, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_14

    move v0, v3

    goto :goto_e

    :cond_14
    move/from16 v0, v17

    :goto_e
    and-int/lit8 v1, v2, 0x1

    invoke-interface {v4, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_1c

    if-eqz v5, :cond_15

    goto :goto_f

    :cond_15
    move/from16 v17, v6

    :goto_f
    const/4 v0, 0x0

    if-eqz v7, :cond_16

    move-object v13, v0

    goto :goto_10

    :cond_16
    move-object v13, v8

    :goto_10
    if-eqz v11, :cond_17

    move/from16 v19, v14

    move-object v14, v0

    move/from16 v0, v19

    goto :goto_11

    :cond_17
    move v0, v14

    move-object/from16 v14, p6

    :goto_11
    if-eqz v0, :cond_19

    .line 2
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .line 3
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_18

    .line 4
    new-instance v0, Lcom/zykj/view/board/play/b;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lcom/zykj/view/board/play/b;-><init>(I)V

    .line 5
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 6
    :cond_18
    check-cast v0, Lr6/a;

    move-object v1, v0

    goto :goto_12

    :cond_19
    move-object/from16 v1, p7

    :goto_12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1a

    const/4 v0, -0x1

    const-string v5, "com.zykj.mistake.feature.notebook.detail.ReviewPracticeSummaryDialog (MistakeDetailNewScreen.kt:362)"

    const v6, -0x27d6a267

    invoke-static {v6, v2, v0, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 7
    :cond_1a
    new-instance v11, Lcom/zykj/mistake/feature/notebook/detail/v3;

    move-object/from16 v18, p0

    move-object/from16 v16, p3

    invoke-direct/range {v11 .. v18}, Lcom/zykj/mistake/feature/notebook/detail/v3;-><init>(Lcom/zykj/mistake/feature/notebook/detail/l3;Ljava/lang/String;Lr6/a;Ljava/lang/String;Lr6/a;ZLjava/lang/String;)V

    const/16 v0, 0x36

    const v5, 0x14d98b0

    invoke-static {v5, v3, v11, v4, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    shr-int/lit8 v0, v2, 0x15

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v5, v0, 0x180

    const/4 v6, 0x2

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/window/AndroidDialog_androidKt;->Dialog(Lr6/a;Landroidx/compose/ui/window/DialogProperties;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1b
    move-object v8, v1

    move-object v6, v13

    move-object v7, v14

    move/from16 v5, v17

    goto :goto_13

    .line 8
    :cond_1c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v7, p6

    move v5, v6

    move-object v6, v8

    move-object/from16 v8, p7

    .line 9
    :goto_13
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_1d

    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/w3;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v10}, Lcom/zykj/mistake/feature/notebook/detail/w3;-><init>(Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/l3;Ljava/lang/String;Lr6/a;ZLjava/lang/String;Lr6/a;Lr6/a;II)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_1d
    return-void
.end method

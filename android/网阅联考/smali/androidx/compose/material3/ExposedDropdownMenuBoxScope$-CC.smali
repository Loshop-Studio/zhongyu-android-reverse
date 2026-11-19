.class public abstract synthetic Landroidx/compose/material3/ExposedDropdownMenuBoxScope$-CC;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/compose/material3/ExposedDropdownMenuBoxScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    .line 1
    move-object/from16 v6, p2

    .line 2
    .line 3
    move-object/from16 v14, p4

    .line 4
    .line 5
    move/from16 v15, p6

    .line 6
    .line 7
    const-string v0, "onDismissRequest"

    .line 8
    .line 9
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "content"

    .line 13
    .line 14
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, -0x62dd813c

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p5

    .line 21
    .line 22
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    and-int/lit8 v1, p7, 0x1

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    or-int/lit8 v1, v15, 0x6

    .line 32
    .line 33
    move/from16 v4, p1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    and-int/lit8 v1, v15, 0xe

    .line 37
    .line 38
    move/from16 v4, p1

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v1, v2

    .line 51
    :goto_0
    or-int/2addr v1, v15

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v1, v15

    .line 54
    :goto_1
    and-int/lit8 v3, p7, 0x2

    .line 55
    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    or-int/lit8 v1, v1, 0x30

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    and-int/lit8 v3, v15, 0x70

    .line 62
    .line 63
    if-nez v3, :cond_5

    .line 64
    .line 65
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    const/16 v3, 0x20

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    const/16 v3, 0x10

    .line 75
    .line 76
    :goto_2
    or-int/2addr v1, v3

    .line 77
    :cond_5
    :goto_3
    and-int/lit8 v3, p7, 0x4

    .line 78
    .line 79
    if-eqz v3, :cond_6

    .line 80
    .line 81
    or-int/lit16 v1, v1, 0x180

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_6
    and-int/lit16 v7, v15, 0x380

    .line 85
    .line 86
    if-nez v7, :cond_8

    .line 87
    .line 88
    move-object/from16 v7, p3

    .line 89
    .line 90
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    if-eqz v8, :cond_7

    .line 95
    .line 96
    const/16 v8, 0x100

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_7
    const/16 v8, 0x80

    .line 100
    .line 101
    :goto_4
    or-int/2addr v1, v8

    .line 102
    goto :goto_6

    .line 103
    :cond_8
    :goto_5
    move-object/from16 v7, p3

    .line 104
    .line 105
    :goto_6
    and-int/lit8 v8, p7, 0x8

    .line 106
    .line 107
    if-eqz v8, :cond_9

    .line 108
    .line 109
    or-int/lit16 v1, v1, 0xc00

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_9
    and-int/lit16 v8, v15, 0x1c00

    .line 113
    .line 114
    if-nez v8, :cond_b

    .line 115
    .line 116
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_a

    .line 121
    .line 122
    const/16 v8, 0x800

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_a
    const/16 v8, 0x400

    .line 126
    .line 127
    :goto_7
    or-int/2addr v1, v8

    .line 128
    :cond_b
    :goto_8
    and-int/lit8 v8, p7, 0x10

    .line 129
    .line 130
    if-eqz v8, :cond_c

    .line 131
    .line 132
    or-int/lit16 v1, v1, 0x6000

    .line 133
    .line 134
    move-object/from16 v13, p0

    .line 135
    .line 136
    goto :goto_a

    .line 137
    :cond_c
    const v8, 0xe000

    .line 138
    .line 139
    .line 140
    and-int/2addr v8, v15

    .line 141
    move-object/from16 v13, p0

    .line 142
    .line 143
    if-nez v8, :cond_e

    .line 144
    .line 145
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    if-eqz v8, :cond_d

    .line 150
    .line 151
    const/16 v8, 0x4000

    .line 152
    .line 153
    goto :goto_9

    .line 154
    :cond_d
    const/16 v8, 0x2000

    .line 155
    .line 156
    :goto_9
    or-int/2addr v1, v8

    .line 157
    :cond_e
    :goto_a
    const v8, 0xb6db

    .line 158
    .line 159
    .line 160
    and-int/2addr v8, v1

    .line 161
    const/16 v9, 0x2492

    .line 162
    .line 163
    if-ne v8, v9, :cond_10

    .line 164
    .line 165
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-nez v8, :cond_f

    .line 170
    .line 171
    goto :goto_b

    .line 172
    :cond_f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 173
    .line 174
    .line 175
    move-object v4, v7

    .line 176
    move-object v7, v5

    .line 177
    goto/16 :goto_f

    .line 178
    .line 179
    :cond_10
    :goto_b
    if-eqz v3, :cond_11

    .line 180
    .line 181
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 182
    .line 183
    move-object/from16 v16, v3

    .line 184
    .line 185
    goto :goto_c

    .line 186
    :cond_11
    move-object/from16 v16, v7

    .line 187
    .line 188
    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-eqz v3, :cond_12

    .line 193
    .line 194
    const/4 v3, -0x1

    .line 195
    const-string v7, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:242)"

    .line 196
    .line 197
    invoke-static {v0, v1, v3, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_12
    const v0, -0x1d58f75c

    .line 201
    .line 202
    .line 203
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 211
    .line 212
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    if-ne v3, v8, :cond_13

    .line 217
    .line 218
    new-instance v3, Landroidx/compose/animation/core/MutableTransitionState;

    .line 219
    .line 220
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-direct {v3, v8}, Landroidx/compose/animation/core/MutableTransitionState;-><init>(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_13
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 229
    .line 230
    .line 231
    move-object v8, v3

    .line 232
    check-cast v8, Landroidx/compose/animation/core/MutableTransitionState;

    .line 233
    .line 234
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v8, v3}, Landroidx/compose/animation/core/MutableTransitionState;->setTargetState(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v8}, Landroidx/compose/animation/core/MutableTransitionState;->getCurrentState()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    check-cast v3, Ljava/lang/Boolean;

    .line 246
    .line 247
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-nez v3, :cond_15

    .line 252
    .line 253
    invoke-virtual {v8}, Landroidx/compose/animation/core/MutableTransitionState;->getTargetState()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    check-cast v3, Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_14

    .line 264
    .line 265
    goto :goto_d

    .line 266
    :cond_14
    move-object v7, v5

    .line 267
    goto/16 :goto_e

    .line 268
    .line 269
    :cond_15
    :goto_d
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 270
    .line 271
    .line 272
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    if-ne v0, v3, :cond_16

    .line 281
    .line 282
    sget-object v0, Landroidx/compose/ui/graphics/TransformOrigin;->Companion:Landroidx/compose/ui/graphics/TransformOrigin$Companion;

    .line 283
    .line 284
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/TransformOrigin$Companion;->getCenter-SzJe1aQ()J

    .line 285
    .line 286
    .line 287
    move-result-wide v9

    .line 288
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/TransformOrigin;->box-impl(J)Landroidx/compose/ui/graphics/TransformOrigin;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    const/4 v3, 0x0

    .line 293
    invoke-static {v0, v3, v2, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_16
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 301
    .line 302
    .line 303
    move-object v9, v0

    .line 304
    check-cast v9, Landroidx/compose/runtime/MutableState;

    .line 305
    .line 306
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    move-object/from16 v20, v0

    .line 315
    .line 316
    check-cast v20, Landroidx/compose/ui/unit/Density;

    .line 317
    .line 318
    sget-object v0, Landroidx/compose/ui/unit/DpOffset;->Companion:Landroidx/compose/ui/unit/DpOffset$Companion;

    .line 319
    .line 320
    invoke-virtual {v0}, Landroidx/compose/ui/unit/DpOffset$Companion;->getZero-RKDOV3M()J

    .line 321
    .line 322
    .line 323
    move-result-wide v18

    .line 324
    const v0, 0x44faf204

    .line 325
    .line 326
    .line 327
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    if-nez v0, :cond_17

    .line 339
    .line 340
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    if-ne v2, v0, :cond_18

    .line 345
    .line 346
    :cond_17
    new-instance v2, Landroidx/compose/material3/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1;

    .line 347
    .line 348
    invoke-direct {v2, v9}, Landroidx/compose/material3/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_18
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 355
    .line 356
    .line 357
    move-object/from16 v21, v2

    .line 358
    .line 359
    check-cast v21, Lkotlin/jvm/functions/Function2;

    .line 360
    .line 361
    const/16 v22, 0x0

    .line 362
    .line 363
    new-instance v2, Landroidx/compose/material3/DropdownMenuPositionProvider;

    .line 364
    .line 365
    move-object/from16 v17, v2

    .line 366
    .line 367
    invoke-direct/range {v17 .. v22}, Landroidx/compose/material3/DropdownMenuPositionProvider;-><init>(JLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 368
    .line 369
    .line 370
    new-instance v0, Landroidx/compose/material3/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1;

    .line 371
    .line 372
    move-object v7, v0

    .line 373
    move-object/from16 v10, p0

    .line 374
    .line 375
    move-object/from16 v11, v16

    .line 376
    .line 377
    move-object/from16 v12, p4

    .line 378
    .line 379
    move v13, v1

    .line 380
    invoke-direct/range {v7 .. v13}, Landroidx/compose/material3/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1;-><init>(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/material3/ExposedDropdownMenuBoxScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;I)V

    .line 381
    .line 382
    .line 383
    const v3, 0x178ba0de

    .line 384
    .line 385
    .line 386
    const/4 v7, 0x1

    .line 387
    invoke-static {v5, v3, v7, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    shr-int/lit8 v0, v1, 0x3

    .line 392
    .line 393
    and-int/lit8 v0, v0, 0xe

    .line 394
    .line 395
    or-int/lit16 v7, v0, 0x180

    .line 396
    .line 397
    const/4 v8, 0x0

    .line 398
    move-object/from16 v0, p2

    .line 399
    .line 400
    move-object v1, v2

    .line 401
    move-object v2, v3

    .line 402
    move-object v3, v5

    .line 403
    move v4, v7

    .line 404
    move-object v7, v5

    .line 405
    move v5, v8

    .line 406
    invoke-static/range {v0 .. v5}, Landroidx/compose/material3/internal/ExposedDropdownMenuPopupKt;->ExposedDropdownMenuPopup(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 407
    .line 408
    .line 409
    :goto_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_19

    .line 414
    .line 415
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 416
    .line 417
    .line 418
    :cond_19
    move-object/from16 v4, v16

    .line 419
    .line 420
    :goto_f
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    if-nez v8, :cond_1a

    .line 425
    .line 426
    goto :goto_10

    .line 427
    :cond_1a
    new-instance v9, Landroidx/compose/material3/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2;

    .line 428
    .line 429
    move-object v0, v9

    .line 430
    move-object/from16 v1, p0

    .line 431
    .line 432
    move/from16 v2, p1

    .line 433
    .line 434
    move-object/from16 v3, p2

    .line 435
    .line 436
    move-object/from16 v5, p4

    .line 437
    .line 438
    move/from16 v6, p6

    .line 439
    .line 440
    move/from16 v7, p7

    .line 441
    .line 442
    invoke-direct/range {v0 .. v7}, Landroidx/compose/material3/ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2;-><init>(Landroidx/compose/material3/ExposedDropdownMenuBoxScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;II)V

    .line 443
    .line 444
    .line 445
    invoke-interface {v8, v9}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 446
    .line 447
    .line 448
    :goto_10
    return-void
.end method

.method public static synthetic b(Landroidx/compose/material3/ExposedDropdownMenuBoxScope;Landroidx/compose/ui/Modifier;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    const/4 p4, 0x1

    .line 4
    and-int/2addr p3, p4

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    move p2, p4

    .line 8
    :cond_0
    invoke-interface {p0, p1, p2}, Landroidx/compose/material3/ExposedDropdownMenuBoxScope;->exposedDropdownSize(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: exposedDropdownSize"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

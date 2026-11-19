.class public abstract Ly4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V
    .locals 30

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v0, p6

    .line 6
    .line 7
    const-string v2, "onClick"

    .line 8
    .line 9
    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v2, 0x3e9e18e6    # 0.3087837f

    .line 13
    .line 14
    .line 15
    move-object/from16 v3, p5

    .line 16
    .line 17
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v10

    .line 21
    and-int/lit8 v3, v0, 0x6

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v3, v4

    .line 35
    :goto_0
    or-int/2addr v3, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v3, v0

    .line 38
    :goto_1
    and-int/lit8 v6, v0, 0x30

    .line 39
    .line 40
    move-object/from16 v9, p1

    .line 41
    .line 42
    if-nez v6, :cond_3

    .line 43
    .line 44
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    const/16 v6, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v6, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v3, v6

    .line 56
    :cond_3
    and-int/lit8 v6, p7, 0x4

    .line 57
    .line 58
    if-eqz v6, :cond_5

    .line 59
    .line 60
    or-int/lit16 v3, v3, 0x180

    .line 61
    .line 62
    :cond_4
    move/from16 v7, p2

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_5
    and-int/lit16 v7, v0, 0x180

    .line 66
    .line 67
    if-nez v7, :cond_4

    .line 68
    .line 69
    move/from16 v7, p2

    .line 70
    .line 71
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_6

    .line 76
    .line 77
    const/16 v8, 0x100

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_6
    const/16 v8, 0x80

    .line 81
    .line 82
    :goto_3
    or-int/2addr v3, v8

    .line 83
    :goto_4
    and-int/lit8 v8, p7, 0x8

    .line 84
    .line 85
    if-eqz v8, :cond_8

    .line 86
    .line 87
    or-int/lit16 v3, v3, 0xc00

    .line 88
    .line 89
    :cond_7
    move/from16 v11, p3

    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_8
    and-int/lit16 v11, v0, 0xc00

    .line 93
    .line 94
    if-nez v11, :cond_7

    .line 95
    .line 96
    move/from16 v11, p3

    .line 97
    .line 98
    invoke-interface {v10, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    if-eqz v12, :cond_9

    .line 103
    .line 104
    const/16 v12, 0x800

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_9
    const/16 v12, 0x400

    .line 108
    .line 109
    :goto_5
    or-int/2addr v3, v12

    .line 110
    :goto_6
    and-int/lit16 v12, v0, 0x6000

    .line 111
    .line 112
    if-nez v12, :cond_b

    .line 113
    .line 114
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    if-eqz v12, :cond_a

    .line 119
    .line 120
    const/16 v12, 0x4000

    .line 121
    .line 122
    goto :goto_7

    .line 123
    :cond_a
    const/16 v12, 0x2000

    .line 124
    .line 125
    :goto_7
    or-int/2addr v3, v12

    .line 126
    :cond_b
    move v13, v3

    .line 127
    and-int/lit16 v3, v13, 0x2493

    .line 128
    .line 129
    const/16 v12, 0x2492

    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const/4 v15, 0x1

    .line 133
    if-eq v3, v12, :cond_c

    .line 134
    .line 135
    move v3, v15

    .line 136
    goto :goto_8

    .line 137
    :cond_c
    move v3, v14

    .line 138
    :goto_8
    and-int/lit8 v12, v13, 0x1

    .line 139
    .line 140
    invoke-interface {v10, v3, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_16

    .line 145
    .line 146
    if-eqz v6, :cond_d

    .line 147
    .line 148
    const/high16 v3, 0x3f800000    # 1.0f

    .line 149
    .line 150
    move/from16 v28, v3

    .line 151
    .line 152
    goto :goto_9

    .line 153
    :cond_d
    move/from16 v28, v7

    .line 154
    .line 155
    :goto_9
    if-eqz v8, :cond_e

    .line 156
    .line 157
    move v3, v15

    .line 158
    goto :goto_a

    .line 159
    :cond_e
    move v3, v11

    .line 160
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-eqz v6, :cond_f

    .line 165
    .line 166
    const/4 v6, -0x1

    .line 167
    const-string v7, "com.zykj.mistake.platform.compose.TopBarAction (TopBarAction.kt:27)"

    .line 168
    .line 169
    invoke-static {v2, v13, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_f
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 173
    .line 174
    const/16 v12, 0x30

    .line 175
    .line 176
    int-to-float v2, v12

    .line 177
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    const/4 v6, 0x0

    .line 182
    const/4 v7, 0x0

    .line 183
    invoke-static {v11, v2, v6, v4, v7}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    if-eqz v3, :cond_10

    .line 188
    .line 189
    move/from16 v4, v28

    .line 190
    .line 191
    goto :goto_b

    .line 192
    :cond_10
    const v4, 0x3eb33333    # 0.35f

    .line 193
    .line 194
    .line 195
    :goto_b
    invoke-static {v2, v4}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const/4 v7, 0x6

    .line 200
    const/4 v8, 0x0

    .line 201
    const/4 v4, 0x0

    .line 202
    const/4 v5, 0x0

    .line 203
    move-object/from16 v6, p4

    .line 204
    .line 205
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    move/from16 v29, v3

    .line 210
    .line 211
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 212
    .line 213
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 218
    .line 219
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-static {v4, v3, v10, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-static {v10, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-static {v10, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 240
    .line 241
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    if-nez v8, :cond_11

    .line 250
    .line 251
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 252
    .line 253
    .line 254
    :cond_11
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 255
    .line 256
    .line 257
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-eqz v8, :cond_12

    .line 262
    .line 263
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 264
    .line 265
    .line 266
    goto :goto_c

    .line 267
    :cond_12
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 268
    .line 269
    .line 270
    :goto_c
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-static {v6, v7, v3, v7, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    if-nez v5, :cond_13

    .line 283
    .line 284
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    if-nez v5, :cond_14

    .line 297
    .line 298
    :cond_13
    invoke-static {v4, v7, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 299
    .line 300
    .line 301
    :cond_14
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-static {v7, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 306
    .line 307
    .line 308
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 309
    .line 310
    and-int/lit8 v2, v13, 0xe

    .line 311
    .line 312
    invoke-static {v1, v10, v2}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    const/16 v2, 0x14

    .line 317
    .line 318
    int-to-float v2, v2

    .line 319
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    and-int/lit8 v2, v13, 0x70

    .line 328
    .line 329
    or-int/lit16 v11, v2, 0x180

    .line 330
    .line 331
    const/16 v12, 0x78

    .line 332
    .line 333
    const/4 v6, 0x0

    .line 334
    const/4 v7, 0x0

    .line 335
    const/4 v8, 0x0

    .line 336
    const/4 v9, 0x0

    .line 337
    move-object/from16 v4, p1

    .line 338
    .line 339
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v24, v10

    .line 343
    .line 344
    const-wide v2, 0xff15171aL

    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 350
    .line 351
    .line 352
    move-result-wide v5

    .line 353
    const/16 v2, 0xa

    .line 354
    .line 355
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 356
    .line 357
    .line 358
    move-result-wide v7

    .line 359
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 360
    .line 361
    .line 362
    move-result-wide v16

    .line 363
    sget-object v2, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 364
    .line 365
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    sget-object v3, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 370
    .line 371
    invoke-virtual {v3}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 372
    .line 373
    .line 374
    move-result v18

    .line 375
    invoke-static {v2}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 376
    .line 377
    .line 378
    move-result-object v15

    .line 379
    shr-int/lit8 v2, v13, 0x3

    .line 380
    .line 381
    and-int/lit8 v2, v2, 0xe

    .line 382
    .line 383
    or-int/lit16 v2, v2, 0xd80

    .line 384
    .line 385
    const/16 v26, 0xc36

    .line 386
    .line 387
    const v27, 0x1d1f2

    .line 388
    .line 389
    .line 390
    const/4 v4, 0x0

    .line 391
    const/4 v10, 0x0

    .line 392
    const/4 v11, 0x0

    .line 393
    const-wide/16 v12, 0x0

    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    const/16 v19, 0x0

    .line 397
    .line 398
    const/16 v20, 0x2

    .line 399
    .line 400
    const/16 v21, 0x0

    .line 401
    .line 402
    const/16 v22, 0x0

    .line 403
    .line 404
    const/16 v23, 0x0

    .line 405
    .line 406
    move-object/from16 v3, p1

    .line 407
    .line 408
    move/from16 v25, v2

    .line 409
    .line 410
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 411
    .line 412
    .line 413
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 414
    .line 415
    .line 416
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    if-eqz v2, :cond_15

    .line 421
    .line 422
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 423
    .line 424
    .line 425
    :cond_15
    move/from16 v3, v28

    .line 426
    .line 427
    move/from16 v4, v29

    .line 428
    .line 429
    goto :goto_d

    .line 430
    :cond_16
    move-object/from16 v24, v10

    .line 431
    .line 432
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 433
    .line 434
    .line 435
    move v3, v7

    .line 436
    move v4, v11

    .line 437
    :goto_d
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    if-eqz v9, :cond_17

    .line 442
    .line 443
    new-instance v0, Lcom/zykj/mistake/feature/notebook/list/f1;

    .line 444
    .line 445
    const/4 v8, 0x1

    .line 446
    move-object/from16 v2, p1

    .line 447
    .line 448
    move-object/from16 v5, p4

    .line 449
    .line 450
    move/from16 v6, p6

    .line 451
    .line 452
    move/from16 v7, p7

    .line 453
    .line 454
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/list/f1;-><init>(ILjava/lang/String;FZLr6/a;III)V

    .line 455
    .line 456
    .line 457
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 458
    .line 459
    .line 460
    :cond_17
    return-void
.end method

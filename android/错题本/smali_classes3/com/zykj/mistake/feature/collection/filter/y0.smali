.class public abstract Lcom/zykj/mistake/feature/collection/filter/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/mistake/feature/collection/filter/s0;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 60

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
    const v3, -0x22f79ff4

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
    move-result-object v11

    .line 16
    and-int/lit8 v4, v2, 0x6

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    const/16 v14, 0x20

    .line 35
    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    move v5, v14

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v5, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v4, v5

    .line 49
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 50
    .line 51
    const/16 v6, 0x12

    .line 52
    .line 53
    const/4 v15, 0x1

    .line 54
    const/4 v7, 0x0

    .line 55
    if-eq v5, v6, :cond_4

    .line 56
    .line 57
    move v5, v15

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move v5, v7

    .line 60
    :goto_3
    and-int/lit8 v8, v4, 0x1

    .line 61
    .line 62
    invoke-interface {v11, v5, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_19

    .line 67
    .line 68
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    const/4 v5, -0x1

    .line 75
    const-string v8, "com.zykj.mistake.feature.collection.filter.FilterResultActionBar (MistakeCollectionFilterResultScreen.kt:288)"

    .line 76
    .line 77
    invoke-static {v3, v4, v5, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    invoke-static {v3, v5, v15, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    const/16 v9, 0x36

    .line 89
    .line 90
    int-to-float v9, v9

    .line 91
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 96
    .line 97
    .line 98
    move-result-object v16

    .line 99
    const-wide v9, 0xfff5f7faL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v17

    .line 108
    const/16 v20, 0x2

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const/16 v19, 0x0

    .line 113
    .line 114
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 115
    .line 116
    .line 117
    move-result-object v22

    .line 118
    const/16 v5, 0x18

    .line 119
    .line 120
    int-to-float v5, v5

    .line 121
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 122
    .line 123
    .line 124
    move-result v23

    .line 125
    int-to-float v5, v6

    .line 126
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 127
    .line 128
    .line 129
    move-result v25

    .line 130
    const/16 v27, 0xa

    .line 131
    .line 132
    const/16 v28, 0x0

    .line 133
    .line 134
    const/16 v24, 0x0

    .line 135
    .line 136
    const/16 v26, 0x0

    .line 137
    .line 138
    invoke-static/range {v22 .. v28}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 143
    .line 144
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 149
    .line 150
    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    const/16 v10, 0x30

    .line 155
    .line 156
    invoke-static {v9, v6, v11, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-static {v11, v7}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 161
    .line 162
    .line 163
    move-result v9

    .line 164
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    invoke-static {v11, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 173
    .line 174
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 179
    .line 180
    .line 181
    move-result-object v16

    .line 182
    if-nez v16, :cond_6

    .line 183
    .line 184
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 185
    .line 186
    .line 187
    :cond_6
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 188
    .line 189
    .line 190
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 191
    .line 192
    .line 193
    move-result v16

    .line 194
    if-eqz v16, :cond_7

    .line 195
    .line 196
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 201
    .line 202
    .line 203
    :goto_4
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-static {v13, v8, v6, v8, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    if-nez v12, :cond_8

    .line 216
    .line 217
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    if-nez v10, :cond_9

    .line 230
    .line 231
    :cond_8
    invoke-static {v9, v8, v9, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 232
    .line 233
    .line 234
    :cond_9
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-static {v8, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 239
    .line 240
    .line 241
    sget-object v30, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/filter/s0;->c()Z

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-eqz v5, :cond_a

    .line 248
    .line 249
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_mistake_selected:I

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_a
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_mistake_unselected:I

    .line 253
    .line 254
    :goto_5
    invoke-static {v5, v11, v7}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-virtual {v0}, Lcom/zykj/mistake/feature/collection/filter/s0;->c()Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-eqz v6, :cond_b

    .line 263
    .line 264
    const-string v6, "\u53d6\u6d88\u5168\u9009"

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_b
    const-string v6, "\u5168\u9009"

    .line 268
    .line 269
    :goto_6
    const/16 v8, 0x14

    .line 270
    .line 271
    int-to-float v8, v8

    .line 272
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 277
    .line 278
    .line 279
    move-result-object v17

    .line 280
    and-int/lit8 v4, v4, 0x70

    .line 281
    .line 282
    if-ne v4, v14, :cond_c

    .line 283
    .line 284
    move v8, v15

    .line 285
    goto :goto_7

    .line 286
    :cond_c
    move v8, v7

    .line 287
    :goto_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    if-nez v8, :cond_d

    .line 292
    .line 293
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 294
    .line 295
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    if-ne v9, v8, :cond_e

    .line 300
    .line 301
    :cond_d
    new-instance v9, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 302
    .line 303
    const/4 v8, 0x5

    .line 304
    invoke-direct {v9, v1, v8}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 305
    .line 306
    .line 307
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :cond_e
    move-object/from16 v21, v9

    .line 311
    .line 312
    check-cast v21, Lr6/a;

    .line 313
    .line 314
    const/16 v22, 0x7

    .line 315
    .line 316
    const/16 v23, 0x0

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
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    const/4 v12, 0x0

    .line 329
    const/16 v13, 0x78

    .line 330
    .line 331
    move v9, v7

    .line 332
    const/4 v7, 0x0

    .line 333
    move v10, v4

    .line 334
    move-object v4, v5

    .line 335
    move-object v5, v6

    .line 336
    move-object v6, v8

    .line 337
    const/4 v8, 0x0

    .line 338
    move/from16 v17, v9

    .line 339
    .line 340
    const/4 v9, 0x0

    .line 341
    move/from16 v18, v10

    .line 342
    .line 343
    const/4 v10, 0x0

    .line 344
    move/from16 v15, v18

    .line 345
    .line 346
    invoke-static/range {v4 .. v13}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 347
    .line 348
    .line 349
    const-wide v32, 0xff15171aL

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 355
    .line 356
    .line 357
    move-result-wide v6

    .line 358
    const/16 v4, 0xd

    .line 359
    .line 360
    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 361
    .line 362
    .line 363
    move-result-wide v8

    .line 364
    const/16 v4, 0x8

    .line 365
    .line 366
    int-to-float v4, v4

    .line 367
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 368
    .line 369
    .line 370
    move-result v17

    .line 371
    const/16 v21, 0xe

    .line 372
    .line 373
    const/16 v22, 0x0

    .line 374
    .line 375
    const/16 v18, 0x0

    .line 376
    .line 377
    const/16 v19, 0x0

    .line 378
    .line 379
    const/16 v20, 0x0

    .line 380
    .line 381
    move-object/from16 v16, v3

    .line 382
    .line 383
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 384
    .line 385
    .line 386
    move-result-object v23

    .line 387
    if-ne v15, v14, :cond_f

    .line 388
    .line 389
    const/4 v4, 0x1

    .line 390
    goto :goto_8

    .line 391
    :cond_f
    const/4 v4, 0x0

    .line 392
    :goto_8
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    if-nez v4, :cond_10

    .line 397
    .line 398
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 399
    .line 400
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    if-ne v5, v4, :cond_11

    .line 405
    .line 406
    :cond_10
    new-instance v5, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 407
    .line 408
    const/4 v4, 0x6

    .line 409
    invoke-direct {v5, v1, v4}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 410
    .line 411
    .line 412
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    :cond_11
    move-object/from16 v27, v5

    .line 416
    .line 417
    check-cast v27, Lr6/a;

    .line 418
    .line 419
    const/16 v28, 0x7

    .line 420
    .line 421
    const/16 v29, 0x0

    .line 422
    .line 423
    const/16 v24, 0x0

    .line 424
    .line 425
    const/16 v25, 0x0

    .line 426
    .line 427
    const/16 v26, 0x0

    .line 428
    .line 429
    invoke-static/range {v23 .. v29}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    const/16 v27, 0x0

    .line 434
    .line 435
    const v28, 0x1fff0

    .line 436
    .line 437
    .line 438
    const-string v4, "\u5168\u9009"

    .line 439
    .line 440
    const/4 v10, 0x0

    .line 441
    move-object/from16 v25, v11

    .line 442
    .line 443
    const/4 v11, 0x0

    .line 444
    const/4 v12, 0x0

    .line 445
    move/from16 v16, v14

    .line 446
    .line 447
    const-wide/16 v13, 0x0

    .line 448
    .line 449
    move/from16 v18, v15

    .line 450
    .line 451
    const/4 v15, 0x0

    .line 452
    move/from16 v17, v16

    .line 453
    .line 454
    const/16 v16, 0x0

    .line 455
    .line 456
    move/from16 v20, v17

    .line 457
    .line 458
    move/from16 v19, v18

    .line 459
    .line 460
    const-wide/16 v17, 0x0

    .line 461
    .line 462
    move/from16 v21, v19

    .line 463
    .line 464
    const/16 v19, 0x0

    .line 465
    .line 466
    move/from16 v22, v20

    .line 467
    .line 468
    const/16 v20, 0x0

    .line 469
    .line 470
    move/from16 v23, v21

    .line 471
    .line 472
    const/16 v21, 0x0

    .line 473
    .line 474
    move/from16 v24, v22

    .line 475
    .line 476
    const/16 v22, 0x0

    .line 477
    .line 478
    move/from16 v26, v23

    .line 479
    .line 480
    const/16 v23, 0x0

    .line 481
    .line 482
    move/from16 v29, v24

    .line 483
    .line 484
    const/16 v24, 0x0

    .line 485
    .line 486
    move/from16 v34, v26

    .line 487
    .line 488
    const/16 v26, 0xd86

    .line 489
    .line 490
    move-object/from16 v35, v3

    .line 491
    .line 492
    move/from16 v36, v34

    .line 493
    .line 494
    const/4 v3, 0x1

    .line 495
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 496
    .line 497
    .line 498
    new-instance v4, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 499
    .line 500
    const/4 v5, 0x0

    .line 501
    const/4 v6, 0x0

    .line 502
    invoke-direct {v4, v6, v3, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 503
    .line 504
    .line 505
    const-string v5, " \u5171\u7b5b\u9009\u51fa "

    .line 506
    .line 507
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    new-instance v37, Landroidx/compose/ui/text/SpanStyle;

    .line 511
    .line 512
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 513
    .line 514
    .line 515
    move-result-wide v38

    .line 516
    sget-object v5, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 517
    .line 518
    invoke-virtual {v5}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 519
    .line 520
    .line 521
    move-result-object v42

    .line 522
    const v58, 0xfffa

    .line 523
    .line 524
    .line 525
    const/16 v59, 0x0

    .line 526
    .line 527
    const-wide/16 v40, 0x0

    .line 528
    .line 529
    const/16 v43, 0x0

    .line 530
    .line 531
    const/16 v44, 0x0

    .line 532
    .line 533
    const/16 v45, 0x0

    .line 534
    .line 535
    const/16 v46, 0x0

    .line 536
    .line 537
    const-wide/16 v47, 0x0

    .line 538
    .line 539
    const/16 v49, 0x0

    .line 540
    .line 541
    const/16 v50, 0x0

    .line 542
    .line 543
    const/16 v51, 0x0

    .line 544
    .line 545
    const-wide/16 v52, 0x0

    .line 546
    .line 547
    const/16 v54, 0x0

    .line 548
    .line 549
    const/16 v55, 0x0

    .line 550
    .line 551
    const/16 v56, 0x0

    .line 552
    .line 553
    const/16 v57, 0x0

    .line 554
    .line 555
    invoke-direct/range {v37 .. v59}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 556
    .line 557
    .line 558
    move-object/from16 v7, v37

    .line 559
    .line 560
    invoke-virtual {v4, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 561
    .line 562
    .line 563
    move-result v7

    .line 564
    :try_start_0
    iget v8, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->h:I

    .line 565
    .line 566
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v8

    .line 570
    invoke-virtual {v4, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 571
    .line 572
    .line 573
    invoke-virtual {v4, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 574
    .line 575
    .line 576
    const-string v7, " \u9053\u9519\u9898\uff0c\u5df2\u9009 "

    .line 577
    .line 578
    invoke-virtual {v4, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    new-instance v37, Landroidx/compose/ui/text/SpanStyle;

    .line 582
    .line 583
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 584
    .line 585
    .line 586
    move-result-wide v38

    .line 587
    invoke-virtual {v5}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 588
    .line 589
    .line 590
    move-result-object v42

    .line 591
    const v58, 0xfffa

    .line 592
    .line 593
    .line 594
    const/16 v59, 0x0

    .line 595
    .line 596
    const-wide/16 v40, 0x0

    .line 597
    .line 598
    const/16 v43, 0x0

    .line 599
    .line 600
    const/16 v44, 0x0

    .line 601
    .line 602
    const/16 v45, 0x0

    .line 603
    .line 604
    const/16 v46, 0x0

    .line 605
    .line 606
    const-wide/16 v47, 0x0

    .line 607
    .line 608
    const/16 v49, 0x0

    .line 609
    .line 610
    const/16 v50, 0x0

    .line 611
    .line 612
    const/16 v51, 0x0

    .line 613
    .line 614
    const-wide/16 v52, 0x0

    .line 615
    .line 616
    const/16 v54, 0x0

    .line 617
    .line 618
    const/16 v55, 0x0

    .line 619
    .line 620
    const/16 v56, 0x0

    .line 621
    .line 622
    const/16 v57, 0x0

    .line 623
    .line 624
    invoke-direct/range {v37 .. v59}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 625
    .line 626
    .line 627
    move-object/from16 v5, v37

    .line 628
    .line 629
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 630
    .line 631
    .line 632
    move-result v5

    .line 633
    :try_start_1
    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 634
    .line 635
    invoke-interface {v7}, Ljava/util/Set;->size()I

    .line 636
    .line 637
    .line 638
    move-result v7

    .line 639
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v7

    .line 643
    invoke-virtual {v4, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 644
    .line 645
    .line 646
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 647
    .line 648
    .line 649
    const-string v5, " \u9053"

    .line 650
    .line 651
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 655
    .line 656
    .line 657
    move-result-object v4

    .line 658
    const-wide v7, 0xff666666L

    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 664
    .line 665
    .line 666
    move-result-wide v7

    .line 667
    const/16 v5, 0xc

    .line 668
    .line 669
    move/from16 v31, v6

    .line 670
    .line 671
    move-wide v6, v7

    .line 672
    invoke-static {v5}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 673
    .line 674
    .line 675
    move-result-wide v8

    .line 676
    int-to-float v5, v5

    .line 677
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 678
    .line 679
    .line 680
    move-result v17

    .line 681
    const/16 v21, 0xe

    .line 682
    .line 683
    const/16 v22, 0x0

    .line 684
    .line 685
    const/16 v18, 0x0

    .line 686
    .line 687
    const/16 v19, 0x0

    .line 688
    .line 689
    const/16 v20, 0x0

    .line 690
    .line 691
    move-object/from16 v16, v35

    .line 692
    .line 693
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    const/16 v28, 0x0

    .line 698
    .line 699
    const v29, 0x3fff0

    .line 700
    .line 701
    .line 702
    const/4 v10, 0x0

    .line 703
    const/4 v11, 0x0

    .line 704
    const/4 v12, 0x0

    .line 705
    const-wide/16 v13, 0x0

    .line 706
    .line 707
    const/4 v15, 0x0

    .line 708
    const/16 v16, 0x0

    .line 709
    .line 710
    const-wide/16 v17, 0x0

    .line 711
    .line 712
    const/16 v19, 0x0

    .line 713
    .line 714
    const/16 v20, 0x0

    .line 715
    .line 716
    const/16 v21, 0x0

    .line 717
    .line 718
    const/16 v22, 0x0

    .line 719
    .line 720
    const/16 v23, 0x0

    .line 721
    .line 722
    const/16 v24, 0x0

    .line 723
    .line 724
    move-object/from16 v26, v25

    .line 725
    .line 726
    const/16 v25, 0x0

    .line 727
    .line 728
    const/16 v27, 0xdb0

    .line 729
    .line 730
    move/from16 v3, v31

    .line 731
    .line 732
    invoke-static/range {v4 .. v29}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 733
    .line 734
    .line 735
    move-object/from16 v11, v26

    .line 736
    .line 737
    const/16 v20, 0x2

    .line 738
    .line 739
    const/16 v21, 0x0

    .line 740
    .line 741
    const/high16 v18, 0x3f800000    # 1.0f

    .line 742
    .line 743
    move-object/from16 v16, v30

    .line 744
    .line 745
    move-object/from16 v17, v35

    .line 746
    .line 747
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    move-object/from16 v5, v17

    .line 752
    .line 753
    invoke-static {v4, v11, v3}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 754
    .line 755
    .line 756
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_sort_by_time:I

    .line 757
    .line 758
    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->k:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 759
    .line 760
    sget-object v7, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;->TIME:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SortType;

    .line 761
    .line 762
    if-ne v6, v7, :cond_12

    .line 763
    .line 764
    const-string v6, "\u6309\u52a0\u5165\u65f6\u95f4\u6392\u5e8f"

    .line 765
    .line 766
    :goto_9
    move/from16 v15, v36

    .line 767
    .line 768
    const/16 v7, 0x20

    .line 769
    .line 770
    goto :goto_a

    .line 771
    :cond_12
    const-string v6, "\u6309\u79d1\u76ee\u6392\u5e8f"

    .line 772
    .line 773
    goto :goto_9

    .line 774
    :goto_a
    if-ne v15, v7, :cond_13

    .line 775
    .line 776
    const/4 v8, 0x1

    .line 777
    goto :goto_b

    .line 778
    :cond_13
    move v8, v3

    .line 779
    :goto_b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v9

    .line 783
    if-nez v8, :cond_14

    .line 784
    .line 785
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 786
    .line 787
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v8

    .line 791
    if-ne v9, v8, :cond_15

    .line 792
    .line 793
    :cond_14
    new-instance v9, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 794
    .line 795
    const/4 v8, 0x7

    .line 796
    invoke-direct {v9, v1, v8}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 797
    .line 798
    .line 799
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    :cond_15
    check-cast v9, Lr6/a;

    .line 803
    .line 804
    invoke-static {v4, v6, v9, v11, v3}, Lcom/zykj/mistake/feature/collection/filter/y0;->c(ILjava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 805
    .line 806
    .line 807
    const/16 v4, 0x1c

    .line 808
    .line 809
    int-to-float v4, v4

    .line 810
    const/4 v6, 0x6

    .line 811
    invoke-static {v4, v5, v11, v6}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 812
    .line 813
    .line 814
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_filter:I

    .line 815
    .line 816
    if-ne v15, v7, :cond_16

    .line 817
    .line 818
    const/4 v15, 0x1

    .line 819
    goto :goto_c

    .line 820
    :cond_16
    move v15, v3

    .line 821
    :goto_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v3

    .line 825
    if-nez v15, :cond_17

    .line 826
    .line 827
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 828
    .line 829
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v5

    .line 833
    if-ne v3, v5, :cond_18

    .line 834
    .line 835
    :cond_17
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 836
    .line 837
    const/16 v5, 0x8

    .line 838
    .line 839
    invoke-direct {v3, v1, v5}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 840
    .line 841
    .line 842
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    :cond_18
    check-cast v3, Lr6/a;

    .line 846
    .line 847
    const-string v5, "\u7b5b\u9009"

    .line 848
    .line 849
    const/16 v6, 0x30

    .line 850
    .line 851
    invoke-static {v4, v5, v3, v11, v6}, Lcom/zykj/mistake/feature/collection/filter/y0;->c(ILjava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 852
    .line 853
    .line 854
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 855
    .line 856
    .line 857
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 858
    .line 859
    .line 860
    move-result v3

    .line 861
    if-eqz v3, :cond_1a

    .line 862
    .line 863
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 864
    .line 865
    .line 866
    goto :goto_d

    .line 867
    :catchall_0
    move-exception v0

    .line 868
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 869
    .line 870
    .line 871
    throw v0

    .line 872
    :catchall_1
    move-exception v0

    .line 873
    invoke-virtual {v4, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 874
    .line 875
    .line 876
    throw v0

    .line 877
    :cond_19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 878
    .line 879
    .line 880
    :cond_1a
    :goto_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 881
    .line 882
    .line 883
    move-result-object v3

    .line 884
    if-eqz v3, :cond_1b

    .line 885
    .line 886
    new-instance v4, Lcom/zykj/mistake/feature/collection/filter/v0;

    .line 887
    .line 888
    const/4 v5, 0x2

    .line 889
    invoke-direct {v4, v0, v1, v2, v5}, Lcom/zykj/mistake/feature/collection/filter/v0;-><init>(Lcom/zykj/mistake/feature/collection/filter/s0;Lr6/c;II)V

    .line 890
    .line 891
    .line 892
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 893
    .line 894
    .line 895
    :cond_1b
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const v2, 0x1237b22c

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v10

    .line 14
    and-int/lit8 v3, v1, 0x6

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v3, v4

    .line 28
    :goto_0
    or-int/2addr v3, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v3, v1

    .line 31
    :goto_1
    and-int/lit8 v5, v3, 0x3

    .line 32
    .line 33
    const/4 v13, 0x0

    .line 34
    if-eq v5, v4, :cond_2

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move v4, v13

    .line 39
    :goto_2
    and-int/lit8 v5, v3, 0x1

    .line 40
    .line 41
    invoke-interface {v10, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_c

    .line 46
    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    const/4 v4, -0x1

    .line 54
    const-string v5, "com.zykj.mistake.feature.collection.filter.FilterResultEmptyContent (MistakeCollectionFilterResultScreen.kt:191)"

    .line 55
    .line 56
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 60
    .line 61
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-static {v10, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v10, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 82
    .line 83
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    if-nez v9, :cond_4

    .line 92
    .line 93
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 97
    .line 98
    .line 99
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-eqz v9, :cond_5

    .line 104
    .line 105
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 110
    .line 111
    .line 112
    :goto_3
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    invoke-static {v7, v8, v3, v8, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-nez v5, :cond_6

    .line 125
    .line 126
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-nez v5, :cond_7

    .line 139
    .line 140
    :cond_6
    invoke-static {v4, v8, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v8, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 148
    .line 149
    .line 150
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 151
    .line 152
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    sget-object v14, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 157
    .line 158
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 159
    .line 160
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    const/16 v4, 0x30

    .line 165
    .line 166
    invoke-static {v3, v2, v10, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-static {v10, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-static {v10, v14}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    if-nez v8, :cond_8

    .line 191
    .line 192
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 193
    .line 194
    .line 195
    :cond_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 196
    .line 197
    .line 198
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    if-eqz v8, :cond_9

    .line 203
    .line 204
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 209
    .line 210
    .line 211
    :goto_4
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-static {v7, v6, v2, v6, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_a

    .line 224
    .line 225
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    if-nez v4, :cond_b

    .line 238
    .line 239
    :cond_a
    invoke-static {v3, v6, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 240
    .line 241
    .line 242
    :cond_b
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-static {v6, v5, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 247
    .line 248
    .line 249
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 250
    .line 251
    sget v2, Lcom/zykj/mistake/R$drawable;->ic_no_data:I

    .line 252
    .line 253
    invoke-static {v2, v10, v13}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    const/16 v2, 0x64

    .line 258
    .line 259
    int-to-float v2, v2

    .line 260
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    const/16 v11, 0x1b0

    .line 269
    .line 270
    const/16 v12, 0x78

    .line 271
    .line 272
    const-string v4, "\u6682\u65e0\u7b26\u5408\u6761\u4ef6\u7684\u9519\u9898"

    .line 273
    .line 274
    const/4 v6, 0x0

    .line 275
    const/4 v7, 0x0

    .line 276
    const/4 v8, 0x0

    .line 277
    const/4 v9, 0x0

    .line 278
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 279
    .line 280
    .line 281
    move-object/from16 v24, v10

    .line 282
    .line 283
    const-wide v2, 0xff666666L

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 289
    .line 290
    .line 291
    move-result-wide v5

    .line 292
    const/16 v2, 0xc

    .line 293
    .line 294
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 295
    .line 296
    .line 297
    move-result-wide v7

    .line 298
    const/16 v2, 0x12

    .line 299
    .line 300
    int-to-float v2, v2

    .line 301
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 302
    .line 303
    .line 304
    move-result v16

    .line 305
    const/16 v19, 0xd

    .line 306
    .line 307
    const/16 v20, 0x0

    .line 308
    .line 309
    const/4 v15, 0x0

    .line 310
    const/16 v17, 0x0

    .line 311
    .line 312
    const/16 v18, 0x0

    .line 313
    .line 314
    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    const/16 v26, 0x0

    .line 319
    .line 320
    const v27, 0x1fff0

    .line 321
    .line 322
    .line 323
    const-string v3, "\u6682\u65e0\u7b26\u5408\u6761\u4ef6\u7684\u9519\u9898"

    .line 324
    .line 325
    const/4 v10, 0x0

    .line 326
    const/4 v11, 0x0

    .line 327
    move v2, v13

    .line 328
    const-wide/16 v12, 0x0

    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const/4 v15, 0x0

    .line 332
    const-wide/16 v16, 0x0

    .line 333
    .line 334
    const/16 v18, 0x0

    .line 335
    .line 336
    const/16 v19, 0x0

    .line 337
    .line 338
    const/16 v20, 0x0

    .line 339
    .line 340
    const/16 v21, 0x0

    .line 341
    .line 342
    const/16 v22, 0x0

    .line 343
    .line 344
    const/16 v23, 0x0

    .line 345
    .line 346
    const/16 v25, 0xdb6

    .line 347
    .line 348
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 349
    .line 350
    .line 351
    invoke-static/range {v24 .. v24}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    if-eqz v3, :cond_d

    .line 356
    .line 357
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 358
    .line 359
    .line 360
    goto :goto_5

    .line 361
    :cond_c
    move-object/from16 v24, v10

    .line 362
    .line 363
    move v2, v13

    .line 364
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 365
    .line 366
    .line 367
    :cond_d
    :goto_5
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    if-eqz v3, :cond_e

    .line 372
    .line 373
    new-instance v4, Lcom/zykj/mistake/feature/collection/filter/w0;

    .line 374
    .line 375
    invoke-direct {v4, v0, v1, v2}, Lcom/zykj/mistake/feature/collection/filter/w0;-><init>(Landroidx/compose/ui/Modifier;II)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 379
    .line 380
    .line 381
    :cond_e
    return-void
.end method

.method public static final c(ILjava/lang/String;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    move/from16 v11, p4

    .line 8
    .line 9
    const v2, -0x7f85f114

    .line 10
    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v9

    .line 18
    and-int/lit8 v3, v11, 0x6

    .line 19
    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v3, 0x2

    .line 31
    :goto_0
    or-int/2addr v3, v11

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v3, v11

    .line 34
    :goto_1
    and-int/lit8 v4, v11, 0x30

    .line 35
    .line 36
    if-nez v4, :cond_3

    .line 37
    .line 38
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const/16 v4, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v4, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v3, v4

    .line 50
    :cond_3
    and-int/lit16 v4, v11, 0x180

    .line 51
    .line 52
    if-nez v4, :cond_5

    .line 53
    .line 54
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_4

    .line 59
    .line 60
    const/16 v4, 0x100

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v4, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr v3, v4

    .line 66
    :cond_5
    move v12, v3

    .line 67
    and-int/lit16 v3, v12, 0x93

    .line 68
    .line 69
    const/16 v4, 0x92

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    if-eq v3, v4, :cond_6

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    goto :goto_4

    .line 76
    :cond_6
    move v3, v10

    .line 77
    :goto_4
    and-int/lit8 v4, v12, 0x1

    .line 78
    .line 79
    invoke-interface {v9, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_c

    .line 84
    .line 85
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_7

    .line 90
    .line 91
    const/4 v3, -0x1

    .line 92
    const-string v4, "com.zykj.mistake.feature.collection.filter.FilterResultIconAction (MistakeCollectionFilterResultScreen.kt:503)"

    .line 93
    .line 94
    invoke-static {v2, v12, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_7
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 98
    .line 99
    const/4 v7, 0x7

    .line 100
    const/4 v8, 0x0

    .line 101
    const/4 v3, 0x0

    .line 102
    const/4 v4, 0x0

    .line 103
    const/4 v5, 0x0

    .line 104
    move-object v2, v13

    .line 105
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 110
    .line 111
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 116
    .line 117
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    const/16 v5, 0x30

    .line 122
    .line 123
    invoke-static {v4, v2, v9, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-static {v9, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-static {v9, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 140
    .line 141
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    if-nez v8, :cond_8

    .line 150
    .line 151
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 152
    .line 153
    .line 154
    :cond_8
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 155
    .line 156
    .line 157
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-eqz v8, :cond_9

    .line 162
    .line 163
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_9
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 168
    .line 169
    .line 170
    :goto_5
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-static {v6, v7, v2, v7, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-nez v5, :cond_a

    .line 183
    .line 184
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    if-nez v5, :cond_b

    .line 197
    .line 198
    :cond_a
    invoke-static {v4, v7, v4, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 199
    .line 200
    .line 201
    :cond_b
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-static {v7, v3, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 206
    .line 207
    .line 208
    sget-object v2, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 209
    .line 210
    and-int/lit8 v2, v12, 0xe

    .line 211
    .line 212
    invoke-static {v0, v9, v2}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    const/16 v3, 0x14

    .line 217
    .line 218
    int-to-float v3, v3

    .line 219
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    invoke-static {v13, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    and-int/lit8 v4, v12, 0x70

    .line 228
    .line 229
    or-int/lit16 v4, v4, 0x180

    .line 230
    .line 231
    const/16 v10, 0x78

    .line 232
    .line 233
    move-object/from16 v22, v9

    .line 234
    .line 235
    move v9, v4

    .line 236
    const/4 v4, 0x0

    .line 237
    const/4 v5, 0x0

    .line 238
    const/4 v6, 0x0

    .line 239
    const/4 v7, 0x0

    .line 240
    move-object v8, v2

    .line 241
    move-object v2, v1

    .line 242
    move-object v1, v8

    .line 243
    move-object/from16 v8, v22

    .line 244
    .line 245
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 246
    .line 247
    .line 248
    const-wide v1, 0xff666666L

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v3

    .line 257
    const/16 v1, 0xd

    .line 258
    .line 259
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 260
    .line 261
    .line 262
    move-result-wide v5

    .line 263
    const/4 v1, 0x6

    .line 264
    int-to-float v1, v1

    .line 265
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 266
    .line 267
    .line 268
    move-result v14

    .line 269
    const/16 v18, 0xe

    .line 270
    .line 271
    const/16 v19, 0x0

    .line 272
    .line 273
    const/4 v15, 0x0

    .line 274
    const/16 v16, 0x0

    .line 275
    .line 276
    const/16 v17, 0x0

    .line 277
    .line 278
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    shr-int/lit8 v1, v12, 0x3

    .line 283
    .line 284
    and-int/lit8 v1, v1, 0xe

    .line 285
    .line 286
    or-int/lit16 v1, v1, 0xdb0

    .line 287
    .line 288
    const/16 v24, 0x0

    .line 289
    .line 290
    const v25, 0x1fff0

    .line 291
    .line 292
    .line 293
    const/4 v8, 0x0

    .line 294
    const/4 v9, 0x0

    .line 295
    const-wide/16 v10, 0x0

    .line 296
    .line 297
    const/4 v12, 0x0

    .line 298
    const/4 v13, 0x0

    .line 299
    const-wide/16 v14, 0x0

    .line 300
    .line 301
    const/16 v16, 0x0

    .line 302
    .line 303
    const/16 v17, 0x0

    .line 304
    .line 305
    const/16 v18, 0x0

    .line 306
    .line 307
    const/16 v19, 0x0

    .line 308
    .line 309
    const/16 v20, 0x0

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    move/from16 v23, v1

    .line 314
    .line 315
    move-object/from16 v1, p1

    .line 316
    .line 317
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 318
    .line 319
    .line 320
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 321
    .line 322
    .line 323
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_d

    .line 328
    .line 329
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 330
    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_c
    move-object/from16 v22, v9

    .line 334
    .line 335
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 336
    .line 337
    .line 338
    :cond_d
    :goto_6
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    if-eqz v2, :cond_e

    .line 343
    .line 344
    new-instance v3, Landroidx/lifecycle/compose/c;

    .line 345
    .line 346
    move-object/from16 v6, p2

    .line 347
    .line 348
    move/from16 v11, p4

    .line 349
    .line 350
    invoke-direct {v3, v0, v1, v6, v11}, Landroidx/lifecycle/compose/c;-><init>(ILjava/lang/String;Lr6/a;I)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 354
    .line 355
    .line 356
    :cond_e
    return-void
.end method

.method public static final d(IILcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    .line 1
    move/from16 v6, p5

    .line 2
    .line 3
    const v0, 0x30155f13

    .line 4
    .line 5
    .line 6
    move-object/from16 v3, p4

    .line 7
    .line 8
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v10

    .line 12
    and-int/lit8 v3, v6, 0x6

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    invoke-interface {v10, p0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v3, 0x2

    .line 25
    :goto_0
    or-int/2addr v3, v6

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v3, v6

    .line 28
    :goto_1
    and-int/lit8 v4, v6, 0x30

    .line 29
    .line 30
    if-nez v4, :cond_3

    .line 31
    .line 32
    invoke-interface {v10, p1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    const/16 v4, 0x20

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    const/16 v4, 0x10

    .line 42
    .line 43
    :goto_2
    or-int/2addr v3, v4

    .line 44
    :cond_3
    and-int/lit16 v4, v6, 0x180

    .line 45
    .line 46
    if-nez v4, :cond_5

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    const/16 v4, 0x100

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    const/16 v4, 0x80

    .line 62
    .line 63
    :goto_3
    or-int/2addr v3, v4

    .line 64
    :cond_5
    and-int/lit16 v4, v6, 0xc00

    .line 65
    .line 66
    if-nez v4, :cond_7

    .line 67
    .line 68
    move-object/from16 v4, p3

    .line 69
    .line 70
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_6

    .line 75
    .line 76
    const/16 v5, 0x800

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_6
    const/16 v5, 0x400

    .line 80
    .line 81
    :goto_4
    or-int/2addr v3, v5

    .line 82
    :goto_5
    move v7, v3

    .line 83
    goto :goto_6

    .line 84
    :cond_7
    move-object/from16 v4, p3

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :goto_6
    and-int/lit16 v3, v7, 0x493

    .line 88
    .line 89
    const/16 v5, 0x492

    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    const/4 v9, 0x1

    .line 93
    if-eq v3, v5, :cond_8

    .line 94
    .line 95
    move v3, v9

    .line 96
    goto :goto_7

    .line 97
    :cond_8
    move v3, v8

    .line 98
    :goto_7
    and-int/lit8 v5, v7, 0x1

    .line 99
    .line 100
    invoke-interface {v10, v3, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_b

    .line 105
    .line 106
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_9

    .line 111
    .line 112
    const/4 v3, -0x1

    .line 113
    const-string v5, "com.zykj.mistake.feature.collection.filter.FilterResultOverLimitDialog (MistakeCollectionFilterResultScreen.kt:424)"

    .line 114
    .line 115
    invoke-static {v0, v7, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_9
    sub-int v0, p0, p1

    .line 119
    .line 120
    if-gez v0, :cond_a

    .line 121
    .line 122
    move v5, v8

    .line 123
    goto :goto_8

    .line 124
    :cond_a
    move v5, v0

    .line 125
    :goto_8
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/t0;

    .line 126
    .line 127
    move v3, p0

    .line 128
    move-object v2, p2

    .line 129
    move-object v1, v4

    .line 130
    move v4, p1

    .line 131
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/filter/t0;-><init>(Lr6/a;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;III)V

    .line 132
    .line 133
    .line 134
    const/16 v1, 0x36

    .line 135
    .line 136
    const v2, 0x4a24b59c    # 2698599.0f

    .line 137
    .line 138
    .line 139
    invoke-static {v2, v9, v0, v10, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    shr-int/lit8 v0, v7, 0x9

    .line 144
    .line 145
    and-int/lit8 v0, v0, 0xe

    .line 146
    .line 147
    or-int/lit16 v11, v0, 0x180

    .line 148
    .line 149
    const/4 v12, 0x2

    .line 150
    const/4 v8, 0x0

    .line 151
    move-object/from16 v7, p3

    .line 152
    .line 153
    invoke-static/range {v7 .. v12}, Landroidx/compose/ui/window/AndroidDialog_androidKt;->Dialog(Lr6/a;Landroidx/compose/ui/window/DialogProperties;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    .line 154
    .line 155
    .line 156
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_c

    .line 161
    .line 162
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 163
    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 167
    .line 168
    .line 169
    :cond_c
    :goto_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    if-eqz v7, :cond_d

    .line 174
    .line 175
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/t0;

    .line 176
    .line 177
    move v1, p0

    .line 178
    move v2, p1

    .line 179
    move-object v3, p2

    .line 180
    move-object/from16 v4, p3

    .line 181
    .line 182
    move v5, v6

    .line 183
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/filter/t0;-><init>(IILcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;Lr6/a;I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 187
    .line 188
    .line 189
    :cond_d
    return-void
.end method

.method public static final e(Lcom/zykj/mistake/feature/collection/filter/s0;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 69

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
    const v3, -0x1f6ac6b0

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
    move-result-object v11

    .line 16
    and-int/lit8 v4, v2, 0x6

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    const/16 v14, 0x10

    .line 35
    .line 36
    const/16 v15, 0x20

    .line 37
    .line 38
    if-nez v5, :cond_3

    .line 39
    .line 40
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    move v5, v15

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v5, v14

    .line 49
    :goto_2
    or-int/2addr v4, v5

    .line 50
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 51
    .line 52
    const/16 v6, 0x12

    .line 53
    .line 54
    const/4 v7, 0x1

    .line 55
    const/4 v8, 0x0

    .line 56
    if-eq v5, v6, :cond_4

    .line 57
    .line 58
    move v5, v7

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move v5, v8

    .line 61
    :goto_3
    and-int/lit8 v6, v4, 0x1

    .line 62
    .line 63
    invoke-interface {v11, v5, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1a

    .line 68
    .line 69
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_5

    .line 74
    .line 75
    const/4 v5, -0x1

    .line 76
    const-string v6, "com.zykj.mistake.feature.collection.filter.FilterResultTitleBar (MistakeCollectionFilterResultScreen.kt:216)"

    .line 77
    .line 78
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    invoke-static {v3, v5, v7, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const/16 v9, 0x30

    .line 90
    .line 91
    int-to-float v10, v9

    .line 92
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 97
    .line 98
    .line 99
    move-result-object v16

    .line 100
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 101
    .line 102
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 103
    .line 104
    .line 105
    move-result-wide v17

    .line 106
    const/16 v20, 0x2

    .line 107
    .line 108
    const/16 v21, 0x0

    .line 109
    .line 110
    const/16 v19, 0x0

    .line 111
    .line 112
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 113
    .line 114
    .line 115
    move-result-object v22

    .line 116
    int-to-float v5, v14

    .line 117
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 118
    .line 119
    .line 120
    move-result v23

    .line 121
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 122
    .line 123
    .line 124
    move-result v25

    .line 125
    const/16 v27, 0xa

    .line 126
    .line 127
    const/16 v28, 0x0

    .line 128
    .line 129
    const/16 v24, 0x0

    .line 130
    .line 131
    const/16 v26, 0x0

    .line 132
    .line 133
    invoke-static/range {v22 .. v28}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    sget-object v30, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 138
    .line 139
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    sget-object v31, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 144
    .line 145
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    invoke-static {v13, v12, v11, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    invoke-static {v11, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-static {v11, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    move/from16 v16, v14

    .line 166
    .line 167
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 168
    .line 169
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 174
    .line 175
    .line 176
    move-result-object v18

    .line 177
    if-nez v18, :cond_6

    .line 178
    .line 179
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 180
    .line 181
    .line 182
    :cond_6
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 183
    .line 184
    .line 185
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 186
    .line 187
    .line 188
    move-result v18

    .line 189
    if-eqz v18, :cond_7

    .line 190
    .line 191
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 196
    .line 197
    .line 198
    :goto_4
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-static {v14, v7, v12, v7, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    if-nez v12, :cond_8

    .line 211
    .line 212
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    if-nez v9, :cond_9

    .line 225
    .line 226
    :cond_8
    invoke-static {v13, v7, v13, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 227
    .line 228
    .line 229
    :cond_9
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-static {v7, v10, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 234
    .line 235
    .line 236
    sget-object v32, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 237
    .line 238
    const/16 v6, 0x1c

    .line 239
    .line 240
    int-to-float v6, v6

    .line 241
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 246
    .line 247
    .line 248
    move-result-object v19

    .line 249
    and-int/lit8 v4, v4, 0x70

    .line 250
    .line 251
    if-ne v4, v15, :cond_a

    .line 252
    .line 253
    const/4 v6, 0x1

    .line 254
    goto :goto_5

    .line 255
    :cond_a
    move v6, v8

    .line 256
    :goto_5
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    if-nez v6, :cond_b

    .line 261
    .line 262
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 263
    .line 264
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    if-ne v7, v6, :cond_c

    .line 269
    .line 270
    :cond_b
    new-instance v7, Lcom/zykj/mistake/feature/ask/h0;

    .line 271
    .line 272
    const/16 v6, 0x1d

    .line 273
    .line 274
    invoke-direct {v7, v1, v6}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :cond_c
    move-object/from16 v23, v7

    .line 281
    .line 282
    check-cast v23, Lr6/a;

    .line 283
    .line 284
    const/16 v24, 0x7

    .line 285
    .line 286
    const/16 v25, 0x0

    .line 287
    .line 288
    const/16 v20, 0x0

    .line 289
    .line 290
    const/16 v21, 0x0

    .line 291
    .line 292
    const/16 v22, 0x0

    .line 293
    .line 294
    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-static {v11, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    invoke-static {v11, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 319
    .line 320
    .line 321
    move-result-object v12

    .line 322
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 323
    .line 324
    .line 325
    move-result-object v13

    .line 326
    if-nez v13, :cond_d

    .line 327
    .line 328
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 329
    .line 330
    .line 331
    :cond_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 332
    .line 333
    .line 334
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 335
    .line 336
    .line 337
    move-result v13

    .line 338
    if-eqz v13, :cond_e

    .line 339
    .line 340
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 341
    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 345
    .line 346
    .line 347
    :goto_6
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    invoke-static {v14, v12, v7, v12, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 352
    .line 353
    .line 354
    move-result-object v7

    .line 355
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 356
    .line 357
    .line 358
    move-result v10

    .line 359
    if-nez v10, :cond_f

    .line 360
    .line 361
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v10

    .line 365
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v13

    .line 369
    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    if-nez v10, :cond_10

    .line 374
    .line 375
    :cond_f
    invoke-static {v9, v12, v9, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 376
    .line 377
    .line 378
    :cond_10
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-static {v12, v6, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 383
    .line 384
    .line 385
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 386
    .line 387
    sget v6, Lcom/zykj/mistake/R$drawable;->ic_black_back:I

    .line 388
    .line 389
    invoke-static {v6, v11, v8}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    const/16 v12, 0x1b0

    .line 402
    .line 403
    const/16 v13, 0x78

    .line 404
    .line 405
    move v7, v4

    .line 406
    move-object v4, v6

    .line 407
    move-object v6, v5

    .line 408
    const-string v5, "\u8fd4\u56de"

    .line 409
    .line 410
    move v9, v7

    .line 411
    const/4 v7, 0x0

    .line 412
    move v10, v8

    .line 413
    const/4 v8, 0x0

    .line 414
    move/from16 v19, v9

    .line 415
    .line 416
    const/4 v9, 0x0

    .line 417
    move/from16 v20, v10

    .line 418
    .line 419
    const/4 v10, 0x0

    .line 420
    move-object/from16 p2, v14

    .line 421
    .line 422
    move/from16 v34, v19

    .line 423
    .line 424
    move/from16 v14, v20

    .line 425
    .line 426
    invoke-static/range {v4 .. v13}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 427
    .line 428
    .line 429
    move-object/from16 v25, v11

    .line 430
    .line 431
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 432
    .line 433
    .line 434
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->b:Ljava/lang/String;

    .line 435
    .line 436
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 437
    .line 438
    iget v6, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    .line 439
    .line 440
    iget v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    .line 441
    .line 442
    const-wide v35, 0xff15171aL

    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    move v8, v6

    .line 448
    move v9, v7

    .line 449
    invoke-static/range {v35 .. v36}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 450
    .line 451
    .line 452
    move-result-wide v6

    .line 453
    new-instance v37, Landroidx/compose/ui/text/TextStyle;

    .line 454
    .line 455
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 456
    .line 457
    .line 458
    move-result-wide v40

    .line 459
    new-instance v10, Landroidx/compose/ui/text/PlatformTextStyle;

    .line 460
    .line 461
    invoke-direct {v10, v14}, Landroidx/compose/ui/text/PlatformTextStyle;-><init>(Z)V

    .line 462
    .line 463
    .line 464
    const v67, 0xf7fffd

    .line 465
    .line 466
    .line 467
    const/16 v68, 0x0

    .line 468
    .line 469
    const-wide/16 v38, 0x0

    .line 470
    .line 471
    const/16 v42, 0x0

    .line 472
    .line 473
    const/16 v43, 0x0

    .line 474
    .line 475
    const/16 v44, 0x0

    .line 476
    .line 477
    const/16 v45, 0x0

    .line 478
    .line 479
    const/16 v46, 0x0

    .line 480
    .line 481
    const-wide/16 v47, 0x0

    .line 482
    .line 483
    const/16 v49, 0x0

    .line 484
    .line 485
    const/16 v50, 0x0

    .line 486
    .line 487
    const/16 v51, 0x0

    .line 488
    .line 489
    const-wide/16 v52, 0x0

    .line 490
    .line 491
    const/16 v54, 0x0

    .line 492
    .line 493
    const/16 v55, 0x0

    .line 494
    .line 495
    const/16 v56, 0x0

    .line 496
    .line 497
    const/16 v57, 0x0

    .line 498
    .line 499
    const/16 v58, 0x0

    .line 500
    .line 501
    const-wide/16 v59, 0x0

    .line 502
    .line 503
    const/16 v61, 0x0

    .line 504
    .line 505
    const/16 v63, 0x0

    .line 506
    .line 507
    const/16 v64, 0x0

    .line 508
    .line 509
    const/16 v65, 0x0

    .line 510
    .line 511
    const/16 v66, 0x0

    .line 512
    .line 513
    move-object/from16 v62, v10

    .line 514
    .line 515
    invoke-direct/range {v37 .. v68}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    .line 516
    .line 517
    .line 518
    const/16 v27, 0xc00

    .line 519
    .line 520
    const v28, 0xdffa

    .line 521
    .line 522
    .line 523
    move-object v10, v5

    .line 524
    const/4 v5, 0x0

    .line 525
    move v11, v8

    .line 526
    move v12, v9

    .line 527
    const-wide/16 v8, 0x0

    .line 528
    .line 529
    move-object v13, v10

    .line 530
    const/4 v10, 0x0

    .line 531
    move/from16 v16, v11

    .line 532
    .line 533
    const/4 v11, 0x0

    .line 534
    move/from16 v17, v12

    .line 535
    .line 536
    const/4 v12, 0x0

    .line 537
    move-object/from16 v18, v13

    .line 538
    .line 539
    const-wide/16 v13, 0x0

    .line 540
    .line 541
    move/from16 v19, v15

    .line 542
    .line 543
    const/4 v15, 0x0

    .line 544
    move/from16 v21, v16

    .line 545
    .line 546
    const/16 v16, 0x0

    .line 547
    .line 548
    move/from16 v23, v17

    .line 549
    .line 550
    move-object/from16 v22, v18

    .line 551
    .line 552
    const-wide/16 v17, 0x0

    .line 553
    .line 554
    move/from16 v24, v19

    .line 555
    .line 556
    const/16 v19, 0x0

    .line 557
    .line 558
    move/from16 v26, v20

    .line 559
    .line 560
    const/16 v20, 0x0

    .line 561
    .line 562
    move/from16 v29, v21

    .line 563
    .line 564
    const/16 v21, 0x1

    .line 565
    .line 566
    move-object/from16 v38, v22

    .line 567
    .line 568
    const/16 v22, 0x0

    .line 569
    .line 570
    move/from16 v39, v23

    .line 571
    .line 572
    const/16 v23, 0x0

    .line 573
    .line 574
    move/from16 v40, v26

    .line 575
    .line 576
    const/16 v26, 0x180

    .line 577
    .line 578
    move-object/from16 v41, p2

    .line 579
    .line 580
    move-object/from16 p2, v3

    .line 581
    .line 582
    move-object/from16 v24, v37

    .line 583
    .line 584
    move/from16 v3, v39

    .line 585
    .line 586
    move/from16 v0, v40

    .line 587
    .line 588
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 589
    .line 590
    .line 591
    new-instance v4, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 592
    .line 593
    const/4 v5, 0x0

    .line 594
    const/4 v6, 0x1

    .line 595
    invoke-direct {v4, v0, v6, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 596
    .line 597
    .line 598
    const-string v5, "\uff08 "

    .line 599
    .line 600
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    new-instance v42, Landroidx/compose/ui/text/SpanStyle;

    .line 604
    .line 605
    invoke-interface/range {v38 .. v38}, Ljava/util/Set;->size()I

    .line 606
    .line 607
    .line 608
    move-result v5

    .line 609
    add-int v5, v5, v29

    .line 610
    .line 611
    if-le v5, v3, :cond_11

    .line 612
    .line 613
    const-wide v7, 0xffff3b30L

    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 619
    .line 620
    .line 621
    move-result-wide v7

    .line 622
    :goto_7
    move-wide/from16 v43, v7

    .line 623
    .line 624
    goto :goto_8

    .line 625
    :cond_11
    invoke-static/range {v35 .. v36}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 626
    .line 627
    .line 628
    move-result-wide v7

    .line 629
    goto :goto_7

    .line 630
    :goto_8
    const v63, 0xfffe

    .line 631
    .line 632
    .line 633
    const/16 v64, 0x0

    .line 634
    .line 635
    const-wide/16 v45, 0x0

    .line 636
    .line 637
    const/16 v47, 0x0

    .line 638
    .line 639
    const/16 v48, 0x0

    .line 640
    .line 641
    const/16 v49, 0x0

    .line 642
    .line 643
    const/16 v50, 0x0

    .line 644
    .line 645
    const/16 v51, 0x0

    .line 646
    .line 647
    const-wide/16 v52, 0x0

    .line 648
    .line 649
    const/16 v54, 0x0

    .line 650
    .line 651
    const/16 v55, 0x0

    .line 652
    .line 653
    const/16 v56, 0x0

    .line 654
    .line 655
    const-wide/16 v57, 0x0

    .line 656
    .line 657
    const/16 v59, 0x0

    .line 658
    .line 659
    const/16 v60, 0x0

    .line 660
    .line 661
    const/16 v61, 0x0

    .line 662
    .line 663
    const/16 v62, 0x0

    .line 664
    .line 665
    invoke-direct/range {v42 .. v64}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 666
    .line 667
    .line 668
    move-object/from16 v5, v42

    .line 669
    .line 670
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 671
    .line 672
    .line 673
    move-result v5

    .line 674
    :try_start_0
    invoke-interface/range {v38 .. v38}, Ljava/util/Set;->size()I

    .line 675
    .line 676
    .line 677
    move-result v7

    .line 678
    add-int v7, v7, v29

    .line 679
    .line 680
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v7

    .line 684
    invoke-virtual {v4, v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 685
    .line 686
    .line 687
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 688
    .line 689
    .line 690
    const-string v5, "/"

    .line 691
    .line 692
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 693
    .line 694
    .line 695
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v3

    .line 699
    invoke-virtual {v4, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    const-string v3, "\uff09"

    .line 703
    .line 704
    invoke-virtual {v4, v3}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v4}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 708
    .line 709
    .line 710
    move-result-object v4

    .line 711
    move/from16 v33, v6

    .line 712
    .line 713
    invoke-static/range {v35 .. v36}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 714
    .line 715
    .line 716
    move-result-wide v6

    .line 717
    const/16 v3, 0xd

    .line 718
    .line 719
    invoke-static {v3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 720
    .line 721
    .line 722
    move-result-wide v8

    .line 723
    const/4 v3, 0x6

    .line 724
    int-to-float v3, v3

    .line 725
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 726
    .line 727
    .line 728
    move-result v17

    .line 729
    const/16 v21, 0xe

    .line 730
    .line 731
    const/16 v22, 0x0

    .line 732
    .line 733
    const/16 v18, 0x0

    .line 734
    .line 735
    const/16 v19, 0x0

    .line 736
    .line 737
    const/16 v20, 0x0

    .line 738
    .line 739
    move-object/from16 v16, p2

    .line 740
    .line 741
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    move-object/from16 v3, v16

    .line 746
    .line 747
    const/16 v28, 0x0

    .line 748
    .line 749
    const v29, 0x3fff0

    .line 750
    .line 751
    .line 752
    const/4 v10, 0x0

    .line 753
    const/4 v11, 0x0

    .line 754
    const/4 v12, 0x0

    .line 755
    const-wide/16 v13, 0x0

    .line 756
    .line 757
    const/4 v15, 0x0

    .line 758
    const/16 v16, 0x0

    .line 759
    .line 760
    const-wide/16 v17, 0x0

    .line 761
    .line 762
    const/16 v19, 0x0

    .line 763
    .line 764
    const/16 v20, 0x0

    .line 765
    .line 766
    const/16 v21, 0x0

    .line 767
    .line 768
    const/16 v22, 0x0

    .line 769
    .line 770
    const/16 v23, 0x0

    .line 771
    .line 772
    const/16 v24, 0x0

    .line 773
    .line 774
    move-object/from16 v26, v25

    .line 775
    .line 776
    const/16 v25, 0x0

    .line 777
    .line 778
    const/16 v27, 0xdb0

    .line 779
    .line 780
    invoke-static/range {v4 .. v29}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 781
    .line 782
    .line 783
    move-object/from16 v11, v26

    .line 784
    .line 785
    const/16 v20, 0x2

    .line 786
    .line 787
    const/16 v21, 0x0

    .line 788
    .line 789
    const/high16 v18, 0x3f800000    # 1.0f

    .line 790
    .line 791
    move-object/from16 v17, v3

    .line 792
    .line 793
    move-object/from16 v16, v32

    .line 794
    .line 795
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 796
    .line 797
    .line 798
    move-result-object v3

    .line 799
    move-object/from16 v4, v17

    .line 800
    .line 801
    invoke-static {v3, v11, v0}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 802
    .line 803
    .line 804
    const/16 v3, 0x3a

    .line 805
    .line 806
    int-to-float v3, v3

    .line 807
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 808
    .line 809
    .line 810
    move-result v3

    .line 811
    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 812
    .line 813
    .line 814
    move-result-object v3

    .line 815
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/mistake/feature/collection/filter/s0;->b()Z

    .line 816
    .line 817
    .line 818
    move-result v5

    .line 819
    if-eqz v5, :cond_12

    .line 820
    .line 821
    const/high16 v5, 0x3f800000    # 1.0f

    .line 822
    .line 823
    goto :goto_9

    .line 824
    :cond_12
    const v5, 0x3eb33333    # 0.35f

    .line 825
    .line 826
    .line 827
    :goto_9
    invoke-static {v3, v5}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 828
    .line 829
    .line 830
    move-result-object v12

    .line 831
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/mistake/feature/collection/filter/s0;->b()Z

    .line 832
    .line 833
    .line 834
    move-result v13

    .line 835
    move/from16 v7, v34

    .line 836
    .line 837
    const/16 v3, 0x20

    .line 838
    .line 839
    if-ne v7, v3, :cond_13

    .line 840
    .line 841
    move/from16 v7, v33

    .line 842
    .line 843
    goto :goto_a

    .line 844
    :cond_13
    move v7, v0

    .line 845
    :goto_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v3

    .line 849
    if-nez v7, :cond_14

    .line 850
    .line 851
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 852
    .line 853
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v5

    .line 857
    if-ne v3, v5, :cond_15

    .line 858
    .line 859
    :cond_14
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 860
    .line 861
    invoke-direct {v3, v1, v0}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 862
    .line 863
    .line 864
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    :cond_15
    move-object/from16 v16, v3

    .line 868
    .line 869
    check-cast v16, Lr6/a;

    .line 870
    .line 871
    const/16 v17, 0x6

    .line 872
    .line 873
    const/16 v18, 0x0

    .line 874
    .line 875
    const/4 v14, 0x0

    .line 876
    const/4 v15, 0x0

    .line 877
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 882
    .line 883
    .line 884
    move-result-object v5

    .line 885
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 886
    .line 887
    .line 888
    move-result-object v6

    .line 889
    const/16 v7, 0x30

    .line 890
    .line 891
    invoke-static {v6, v5, v11, v7}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 892
    .line 893
    .line 894
    move-result-object v5

    .line 895
    invoke-static {v11, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 896
    .line 897
    .line 898
    move-result v6

    .line 899
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 900
    .line 901
    .line 902
    move-result-object v7

    .line 903
    invoke-static {v11, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 904
    .line 905
    .line 906
    move-result-object v3

    .line 907
    invoke-virtual/range {v41 .. v41}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 908
    .line 909
    .line 910
    move-result-object v8

    .line 911
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 912
    .line 913
    .line 914
    move-result-object v9

    .line 915
    if-nez v9, :cond_16

    .line 916
    .line 917
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 918
    .line 919
    .line 920
    :cond_16
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 921
    .line 922
    .line 923
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 924
    .line 925
    .line 926
    move-result v9

    .line 927
    if-eqz v9, :cond_17

    .line 928
    .line 929
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 930
    .line 931
    .line 932
    goto :goto_b

    .line 933
    :cond_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 934
    .line 935
    .line 936
    :goto_b
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 937
    .line 938
    .line 939
    move-result-object v8

    .line 940
    move-object/from16 v9, v41

    .line 941
    .line 942
    invoke-static {v9, v8, v5, v8, v7}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 943
    .line 944
    .line 945
    move-result-object v5

    .line 946
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 947
    .line 948
    .line 949
    move-result v7

    .line 950
    if-nez v7, :cond_18

    .line 951
    .line 952
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 953
    .line 954
    .line 955
    move-result-object v7

    .line 956
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 957
    .line 958
    .line 959
    move-result-object v10

    .line 960
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    move-result v7

    .line 964
    if-nez v7, :cond_19

    .line 965
    .line 966
    :cond_18
    invoke-static {v6, v8, v6, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 967
    .line 968
    .line 969
    :cond_19
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 970
    .line 971
    .line 972
    move-result-object v5

    .line 973
    invoke-static {v8, v3, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 974
    .line 975
    .line 976
    sget-object v3, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 977
    .line 978
    sget v3, Lcom/zykj/mistake/R$drawable;->ic_add_mistake_collection:I

    .line 979
    .line 980
    invoke-static {v3, v11, v0}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 981
    .line 982
    .line 983
    move-result-object v3

    .line 984
    const/16 v5, 0x14

    .line 985
    .line 986
    int-to-float v5, v5

    .line 987
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 988
    .line 989
    .line 990
    move-result v5

    .line 991
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 992
    .line 993
    .line 994
    move-result-object v6

    .line 995
    const/16 v12, 0x1b0

    .line 996
    .line 997
    const/16 v13, 0x78

    .line 998
    .line 999
    const-string v5, "\u52a0\u5165\u9519\u9898\u96c6"

    .line 1000
    .line 1001
    const/4 v7, 0x0

    .line 1002
    const/4 v8, 0x0

    .line 1003
    const/4 v9, 0x0

    .line 1004
    const/4 v10, 0x0

    .line 1005
    move-object v4, v3

    .line 1006
    invoke-static/range {v4 .. v13}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 1007
    .line 1008
    .line 1009
    move-object/from16 v25, v11

    .line 1010
    .line 1011
    invoke-static/range {v35 .. v36}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1012
    .line 1013
    .line 1014
    move-result-wide v6

    .line 1015
    const/16 v3, 0xa

    .line 1016
    .line 1017
    invoke-static {v3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 1018
    .line 1019
    .line 1020
    move-result-wide v8

    .line 1021
    const/16 v27, 0xc00

    .line 1022
    .line 1023
    const v28, 0x1dff2

    .line 1024
    .line 1025
    .line 1026
    const-string v4, "\u52a0\u5165\u9519\u9898\u96c6"

    .line 1027
    .line 1028
    const/4 v5, 0x0

    .line 1029
    const/4 v11, 0x0

    .line 1030
    const/4 v12, 0x0

    .line 1031
    const-wide/16 v13, 0x0

    .line 1032
    .line 1033
    const/4 v15, 0x0

    .line 1034
    const/16 v16, 0x0

    .line 1035
    .line 1036
    const-wide/16 v17, 0x0

    .line 1037
    .line 1038
    const/16 v19, 0x0

    .line 1039
    .line 1040
    const/16 v20, 0x0

    .line 1041
    .line 1042
    const/16 v21, 0x1

    .line 1043
    .line 1044
    const/16 v22, 0x0

    .line 1045
    .line 1046
    const/16 v23, 0x0

    .line 1047
    .line 1048
    const/16 v24, 0x0

    .line 1049
    .line 1050
    const/16 v26, 0xd86

    .line 1051
    .line 1052
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1053
    .line 1054
    .line 1055
    invoke-static/range {v25 .. v25}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v3

    .line 1059
    if-eqz v3, :cond_1b

    .line 1060
    .line 1061
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1062
    .line 1063
    .line 1064
    goto :goto_c

    .line 1065
    :catchall_0
    move-exception v0

    .line 1066
    invoke-virtual {v4, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 1067
    .line 1068
    .line 1069
    throw v0

    .line 1070
    :cond_1a
    move v0, v8

    .line 1071
    move-object/from16 v25, v11

    .line 1072
    .line 1073
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1074
    .line 1075
    .line 1076
    :cond_1b
    :goto_c
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v3

    .line 1080
    if-eqz v3, :cond_1c

    .line 1081
    .line 1082
    new-instance v4, Lcom/zykj/mistake/feature/collection/filter/v0;

    .line 1083
    .line 1084
    move-object/from16 v5, p0

    .line 1085
    .line 1086
    invoke-direct {v4, v5, v1, v2, v0}, Lcom/zykj/mistake/feature/collection/filter/v0;-><init>(Lcom/zykj/mistake/feature/collection/filter/s0;Lr6/c;II)V

    .line 1087
    .line 1088
    .line 1089
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1090
    .line 1091
    .line 1092
    :cond_1c
    return-void
.end method

.method public static final f(Lcom/zykj/mistake/feature/collection/filter/s0;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v3, "state"

    .line 6
    .line 7
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->g:Ljava/util/List;

    .line 11
    .line 12
    const-string v3, "onIntent"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v3, 0x715cf301

    .line 18
    .line 19
    .line 20
    move-object/from16 v5, p2

    .line 21
    .line 22
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v11

    .line 26
    and-int/lit8 v5, p3, 0x6

    .line 27
    .line 28
    if-nez v5, :cond_1

    .line 29
    .line 30
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    const/4 v5, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v5, 0x2

    .line 39
    :goto_0
    or-int v5, p3, v5

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move/from16 v5, p3

    .line 43
    .line 44
    :goto_1
    and-int/lit8 v7, p3, 0x30

    .line 45
    .line 46
    if-nez v7, :cond_3

    .line 47
    .line 48
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_2

    .line 53
    .line 54
    const/16 v7, 0x20

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v7, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v5, v7

    .line 60
    :cond_3
    and-int/lit8 v7, v5, 0x13

    .line 61
    .line 62
    const/16 v10, 0x12

    .line 63
    .line 64
    const/4 v12, 0x1

    .line 65
    const/4 v13, 0x0

    .line 66
    if-eq v7, v10, :cond_4

    .line 67
    .line 68
    move v7, v12

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move v7, v13

    .line 71
    :goto_3
    and-int/lit8 v10, v5, 0x1

    .line 72
    .line 73
    invoke-interface {v11, v7, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_25

    .line 78
    .line 79
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eqz v7, :cond_5

    .line 84
    .line 85
    const/4 v7, -0x1

    .line 86
    const-string v10, "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultScreen (MistakeCollectionFilterResultScreen.kt:58)"

    .line 87
    .line 88
    invoke-static {v3, v5, v7, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 92
    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v10, 0x0

    .line 95
    invoke-static {v3, v7, v12, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    const-wide v15, 0xfff5f7faL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 105
    .line 106
    .line 107
    move-result-wide v15

    .line 108
    const/16 v18, 0x2

    .line 109
    .line 110
    const/16 v19, 0x0

    .line 111
    .line 112
    const/16 v17, 0x0

    .line 113
    .line 114
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 115
    .line 116
    .line 117
    move-result-object v14

    .line 118
    sget-object v15, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 119
    .line 120
    invoke-virtual {v15}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-static {v11, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-static {v11, v14}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 141
    .line 142
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 147
    .line 148
    .line 149
    move-result-object v20

    .line 150
    if-nez v20, :cond_6

    .line 151
    .line 152
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 153
    .line 154
    .line 155
    :cond_6
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 156
    .line 157
    .line 158
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 159
    .line 160
    .line 161
    move-result v20

    .line 162
    if-eqz v20, :cond_7

    .line 163
    .line 164
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 169
    .line 170
    .line 171
    :goto_4
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-static {v13, v7, v6, v7, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    if-nez v8, :cond_8

    .line 184
    .line 185
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v10

    .line 193
    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-nez v8, :cond_9

    .line 198
    .line 199
    :cond_8
    invoke-static {v9, v7, v9, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 200
    .line 201
    .line 202
    :cond_9
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-static {v7, v14, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 207
    .line 208
    .line 209
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 210
    .line 211
    const/4 v7, 0x0

    .line 212
    const/4 v8, 0x0

    .line 213
    invoke-static {v3, v7, v12, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 218
    .line 219
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-virtual {v15}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    const/4 v10, 0x0

    .line 228
    invoke-static {v7, v8, v11, v10}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-static {v11, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    invoke-static {v11, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 245
    .line 246
    .line 247
    move-result-object v14

    .line 248
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 249
    .line 250
    .line 251
    move-result-object v15

    .line 252
    if-nez v15, :cond_a

    .line 253
    .line 254
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 255
    .line 256
    .line 257
    :cond_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 258
    .line 259
    .line 260
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 261
    .line 262
    .line 263
    move-result v15

    .line 264
    if-eqz v15, :cond_b

    .line 265
    .line 266
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 271
    .line 272
    .line 273
    :goto_5
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 274
    .line 275
    .line 276
    move-result-object v14

    .line 277
    invoke-static {v13, v14, v7, v14, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    if-nez v10, :cond_c

    .line 286
    .line 287
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 292
    .line 293
    .line 294
    move-result-object v15

    .line 295
    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v10

    .line 299
    if-nez v10, :cond_d

    .line 300
    .line 301
    :cond_c
    invoke-static {v8, v14, v8, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 302
    .line 303
    .line 304
    :cond_d
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    invoke-static {v14, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 309
    .line 310
    .line 311
    sget-object v21, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 312
    .line 313
    and-int/lit8 v7, v5, 0x70

    .line 314
    .line 315
    and-int/lit8 v5, v5, 0x7e

    .line 316
    .line 317
    invoke-static {v0, v1, v11, v5}, Lcom/zykj/mistake/feature/collection/filter/y0;->e(Lcom/zykj/mistake/feature/collection/filter/s0;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 318
    .line 319
    .line 320
    const/4 v8, 0x0

    .line 321
    const/4 v10, 0x0

    .line 322
    invoke-static {v8, v11, v10}, Ly4/g;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 323
    .line 324
    .line 325
    invoke-static {v0, v1, v11, v5}, Lcom/zykj/mistake/feature/collection/filter/y0;->a(Lcom/zykj/mistake/feature/collection/filter/s0;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 326
    .line 327
    .line 328
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-eqz v5, :cond_e

    .line 333
    .line 334
    iget-boolean v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->q:Z

    .line 335
    .line 336
    if-nez v5, :cond_e

    .line 337
    .line 338
    iget-boolean v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    .line 339
    .line 340
    if-nez v5, :cond_e

    .line 341
    .line 342
    const v4, 0x50b7ca6

    .line 343
    .line 344
    .line 345
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 346
    .line 347
    .line 348
    const/4 v4, 0x0

    .line 349
    invoke-static {v3, v4, v12, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 350
    .line 351
    .line 352
    move-result-object v22

    .line 353
    const/16 v25, 0x2

    .line 354
    .line 355
    const/16 v26, 0x0

    .line 356
    .line 357
    const/high16 v23, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/16 v24, 0x0

    .line 360
    .line 361
    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    const/4 v10, 0x0

    .line 366
    invoke-static {v3, v11, v10}, Lcom/zykj/mistake/feature/collection/filter/y0;->b(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 367
    .line 368
    .line 369
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 370
    .line 371
    .line 372
    move-object/from16 v27, v6

    .line 373
    .line 374
    move/from16 v28, v7

    .line 375
    .line 376
    const/4 v2, 0x0

    .line 377
    const/4 v3, 0x0

    .line 378
    goto/16 :goto_10

    .line 379
    .line 380
    :cond_e
    const v3, 0x50f0e2e

    .line 381
    .line 382
    .line 383
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 384
    .line 385
    .line 386
    iget-boolean v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->n:Z

    .line 387
    .line 388
    move-object v3, v6

    .line 389
    iget-boolean v6, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->o:Z

    .line 390
    .line 391
    iget-boolean v8, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->p:Z

    .line 392
    .line 393
    new-instance v9, Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 396
    .line 397
    .line 398
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v13

    .line 406
    if-eqz v13, :cond_11

    .line 407
    .line 408
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v13

    .line 412
    move-object v14, v13

    .line 413
    check-cast v14, Lp4/b;

    .line 414
    .line 415
    iget-object v15, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->j:Ljava/util/Set;

    .line 416
    .line 417
    iget v12, v14, Lp4/b;->c:I

    .line 418
    .line 419
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object v12

    .line 423
    invoke-interface {v15, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v12

    .line 427
    if-nez v12, :cond_10

    .line 428
    .line 429
    iget-boolean v12, v14, Lp4/b;->n:Z

    .line 430
    .line 431
    if-eqz v12, :cond_f

    .line 432
    .line 433
    goto :goto_8

    .line 434
    :cond_f
    :goto_7
    const/4 v12, 0x1

    .line 435
    goto :goto_6

    .line 436
    :cond_10
    :goto_8
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    goto :goto_7

    .line 440
    :cond_11
    new-instance v10, Ljava/util/ArrayList;

    .line 441
    .line 442
    const/16 v12, 0xa

    .line 443
    .line 444
    invoke-static {v9, v12}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 445
    .line 446
    .line 447
    move-result v13

    .line 448
    invoke-direct {v10, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 452
    .line 453
    .line 454
    move-result v13

    .line 455
    const/4 v14, 0x0

    .line 456
    :goto_9
    if-ge v14, v13, :cond_12

    .line 457
    .line 458
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v15

    .line 462
    add-int/lit8 v14, v14, 0x1

    .line 463
    .line 464
    check-cast v15, Lp4/b;

    .line 465
    .line 466
    iget-object v15, v15, Lp4/b;->a:Ljava/lang/String;

    .line 467
    .line 468
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    goto :goto_9

    .line 472
    :cond_12
    invoke-static {v10}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 473
    .line 474
    .line 475
    move-result-object v10

    .line 476
    new-instance v9, Ljava/util/ArrayList;

    .line 477
    .line 478
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 479
    .line 480
    .line 481
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 482
    .line 483
    .line 484
    move-result-object v13

    .line 485
    :cond_13
    :goto_a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 486
    .line 487
    .line 488
    move-result v14

    .line 489
    if-eqz v14, :cond_14

    .line 490
    .line 491
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v14

    .line 495
    move-object v15, v14

    .line 496
    check-cast v15, Lp4/b;

    .line 497
    .line 498
    iget-boolean v15, v15, Lp4/b;->n:Z

    .line 499
    .line 500
    if-eqz v15, :cond_13

    .line 501
    .line 502
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    goto :goto_a

    .line 506
    :cond_14
    new-instance v13, Ljava/util/ArrayList;

    .line 507
    .line 508
    invoke-static {v9, v12}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 509
    .line 510
    .line 511
    move-result v12

    .line 512
    invoke-direct {v13, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 516
    .line 517
    .line 518
    move-result v12

    .line 519
    const/4 v14, 0x0

    .line 520
    :goto_b
    if-ge v14, v12, :cond_15

    .line 521
    .line 522
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v15

    .line 526
    add-int/lit8 v14, v14, 0x1

    .line 527
    .line 528
    check-cast v15, Lp4/b;

    .line 529
    .line 530
    iget-object v15, v15, Lp4/b;->a:Ljava/lang/String;

    .line 531
    .line 532
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    goto :goto_b

    .line 536
    :cond_15
    invoke-static {v13}, Lkotlin/collections/t;->H0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 537
    .line 538
    .line 539
    move-result-object v9

    .line 540
    const/16 v12, 0x10

    .line 541
    .line 542
    int-to-float v12, v12

    .line 543
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 544
    .line 545
    .line 546
    move-result v13

    .line 547
    const/4 v14, 0x0

    .line 548
    int-to-float v15, v14

    .line 549
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 550
    .line 551
    .line 552
    move-result v15

    .line 553
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 554
    .line 555
    .line 556
    move-result v14

    .line 557
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 558
    .line 559
    .line 560
    move-result v12

    .line 561
    invoke-static {v13, v15, v14, v12}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4(FFFF)Landroidx/compose/foundation/layout/PaddingValues;

    .line 562
    .line 563
    .line 564
    move-result-object v12

    .line 565
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 566
    .line 567
    move-object/from16 v17, v3

    .line 568
    .line 569
    const/4 v3, 0x1

    .line 570
    const/4 v14, 0x0

    .line 571
    const/4 v15, 0x0

    .line 572
    invoke-static {v13, v14, v3, v15}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 573
    .line 574
    .line 575
    move-result-object v22

    .line 576
    const/16 v25, 0x2

    .line 577
    .line 578
    const/16 v26, 0x0

    .line 579
    .line 580
    const/high16 v23, 0x3f800000    # 1.0f

    .line 581
    .line 582
    const/16 v24, 0x0

    .line 583
    .line 584
    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 585
    .line 586
    .line 587
    move-result-object v13

    .line 588
    const/16 v3, 0x20

    .line 589
    .line 590
    if-ne v7, v3, :cond_16

    .line 591
    .line 592
    const/4 v3, 0x1

    .line 593
    goto :goto_c

    .line 594
    :cond_16
    const/4 v3, 0x0

    .line 595
    :goto_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v14

    .line 599
    if-nez v3, :cond_17

    .line 600
    .line 601
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 602
    .line 603
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    if-ne v14, v3, :cond_18

    .line 608
    .line 609
    :cond_17
    new-instance v14, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 610
    .line 611
    const/4 v3, 0x1

    .line 612
    invoke-direct {v14, v1, v3}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 613
    .line 614
    .line 615
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    :cond_18
    check-cast v14, Lr6/a;

    .line 619
    .line 620
    const/16 v3, 0x20

    .line 621
    .line 622
    if-ne v7, v3, :cond_19

    .line 623
    .line 624
    const/4 v3, 0x1

    .line 625
    goto :goto_d

    .line 626
    :cond_19
    const/4 v3, 0x0

    .line 627
    :goto_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object v15

    .line 631
    if-nez v3, :cond_1a

    .line 632
    .line 633
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 634
    .line 635
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    if-ne v15, v3, :cond_1b

    .line 640
    .line 641
    :cond_1a
    new-instance v15, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 642
    .line 643
    const/4 v3, 0x2

    .line 644
    invoke-direct {v15, v1, v3}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 645
    .line 646
    .line 647
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    :cond_1b
    check-cast v15, Lr6/a;

    .line 651
    .line 652
    const/16 v3, 0x20

    .line 653
    .line 654
    if-ne v7, v3, :cond_1c

    .line 655
    .line 656
    const/16 v16, 0x1

    .line 657
    .line 658
    goto :goto_e

    .line 659
    :cond_1c
    const/16 v16, 0x0

    .line 660
    .line 661
    :goto_e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    if-nez v16, :cond_1d

    .line 666
    .line 667
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 668
    .line 669
    move-object/from16 v22, v4

    .line 670
    .line 671
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    if-ne v3, v4, :cond_1e

    .line 676
    .line 677
    goto :goto_f

    .line 678
    :cond_1d
    move-object/from16 v22, v4

    .line 679
    .line 680
    :goto_f
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 681
    .line 682
    const/16 v4, 0x10

    .line 683
    .line 684
    invoke-direct {v3, v1, v4}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 685
    .line 686
    .line 687
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    :cond_1e
    check-cast v3, Lr6/c;

    .line 691
    .line 692
    const/4 v4, 0x0

    .line 693
    const/16 v19, 0x0

    .line 694
    .line 695
    const/16 v16, 0x0

    .line 696
    .line 697
    const/16 v20, 0x1000

    .line 698
    .line 699
    move-object/from16 v23, v17

    .line 700
    .line 701
    move-object/from16 v17, v11

    .line 702
    .line 703
    move-object v11, v9

    .line 704
    const/4 v9, 0x1

    .line 705
    move-object/from16 v24, v16

    .line 706
    .line 707
    const/16 v16, 0x0

    .line 708
    .line 709
    const/16 v25, 0x0

    .line 710
    .line 711
    const/high16 v18, 0x6030000

    .line 712
    .line 713
    move/from16 v28, v7

    .line 714
    .line 715
    move v7, v8

    .line 716
    move-object v8, v13

    .line 717
    move-object v13, v14

    .line 718
    move-object v14, v15

    .line 719
    move-object/from16 v4, v22

    .line 720
    .line 721
    move-object/from16 v27, v23

    .line 722
    .line 723
    move-object/from16 v2, v24

    .line 724
    .line 725
    move-object v15, v3

    .line 726
    move/from16 v3, v25

    .line 727
    .line 728
    invoke-static/range {v4 .. v20}, Lcom/zykj/mistake/feature/collection/component/o;->b(Ljava/util/List;ZZZLandroidx/compose/ui/Modifier;ZLjava/util/Set;Ljava/util/Set;Landroidx/compose/foundation/layout/PaddingValues;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 729
    .line 730
    .line 731
    move-object/from16 v11, v17

    .line 732
    .line 733
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 734
    .line 735
    .line 736
    :goto_10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 737
    .line 738
    .line 739
    iget-boolean v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->l:Z

    .line 740
    .line 741
    const/16 v4, 0xb4

    .line 742
    .line 743
    const/4 v14, 0x6

    .line 744
    invoke-static {v4, v3, v2, v14, v2}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 745
    .line 746
    .line 747
    move-result-object v6

    .line 748
    const/4 v7, 0x2

    .line 749
    const/4 v8, 0x0

    .line 750
    invoke-static {v6, v8, v7, v2}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 751
    .line 752
    .line 753
    move-result-object v6

    .line 754
    invoke-static {v4, v3, v2, v14, v2}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 755
    .line 756
    .line 757
    move-result-object v4

    .line 758
    invoke-static {v4, v8, v7, v2}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 759
    .line 760
    .line 761
    move-result-object v8

    .line 762
    new-instance v4, Lcom/zykj/mistake/feature/collection/detail/e1;

    .line 763
    .line 764
    const/4 v7, 0x1

    .line 765
    invoke-direct {v4, v1, v7}, Lcom/zykj/mistake/feature/collection/detail/e1;-><init>(Lr6/c;I)V

    .line 766
    .line 767
    .line 768
    const v7, 0xf28025f

    .line 769
    .line 770
    .line 771
    const/16 v15, 0x36

    .line 772
    .line 773
    const/4 v9, 0x1

    .line 774
    invoke-static {v7, v9, v4, v11, v15}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 775
    .line 776
    .line 777
    move-result-object v10

    .line 778
    const v12, 0x30d80

    .line 779
    .line 780
    .line 781
    const/16 v13, 0x12

    .line 782
    .line 783
    move-object v7, v6

    .line 784
    const/4 v6, 0x0

    .line 785
    const/4 v9, 0x0

    .line 786
    invoke-static/range {v5 .. v13}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 787
    .line 788
    .line 789
    iget-boolean v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->l:Z

    .line 790
    .line 791
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 792
    .line 793
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 794
    .line 795
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenterEnd()Landroidx/compose/ui/Alignment;

    .line 796
    .line 797
    .line 798
    move-result-object v6

    .line 799
    move-object/from16 v7, v27

    .line 800
    .line 801
    invoke-interface {v7, v4, v6}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 802
    .line 803
    .line 804
    move-result-object v6

    .line 805
    const/16 v4, 0xdc

    .line 806
    .line 807
    invoke-static {v4, v3, v2, v14, v2}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 808
    .line 809
    .line 810
    move-result-object v7

    .line 811
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v8

    .line 815
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 816
    .line 817
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v9

    .line 821
    if-ne v8, v9, :cond_1f

    .line 822
    .line 823
    new-instance v8, Lcom/zykj/mistake/feature/collection/component/j;

    .line 824
    .line 825
    const/4 v9, 0x1

    .line 826
    invoke-direct {v8, v9}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 827
    .line 828
    .line 829
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 830
    .line 831
    .line 832
    :cond_1f
    check-cast v8, Lr6/c;

    .line 833
    .line 834
    invoke-static {v7, v8}, Landroidx/compose/animation/EnterExitTransitionKt;->slideInHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/EnterTransition;

    .line 835
    .line 836
    .line 837
    move-result-object v7

    .line 838
    invoke-static {v4, v3, v2, v14, v2}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v8

    .line 850
    if-ne v4, v8, :cond_20

    .line 851
    .line 852
    new-instance v4, Lcom/zykj/mistake/feature/collection/component/j;

    .line 853
    .line 854
    const/4 v8, 0x1

    .line 855
    invoke-direct {v4, v8}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 856
    .line 857
    .line 858
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    :cond_20
    check-cast v4, Lr6/c;

    .line 862
    .line 863
    invoke-static {v2, v4}, Landroidx/compose/animation/EnterExitTransitionKt;->slideOutHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/ExitTransition;

    .line 864
    .line 865
    .line 866
    move-result-object v8

    .line 867
    new-instance v2, Landroidx/navigation/serialization/c;

    .line 868
    .line 869
    const/4 v4, 0x2

    .line 870
    invoke-direct {v2, v4, v0, v1}, Landroidx/navigation/serialization/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    const v4, 0x15a78e96

    .line 874
    .line 875
    .line 876
    const/4 v14, 0x1

    .line 877
    invoke-static {v4, v14, v2, v11, v15}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 878
    .line 879
    .line 880
    move-result-object v10

    .line 881
    const v12, 0x30d80

    .line 882
    .line 883
    .line 884
    const/16 v13, 0x10

    .line 885
    .line 886
    const/4 v9, 0x0

    .line 887
    invoke-static/range {v5 .. v13}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 888
    .line 889
    .line 890
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 891
    .line 892
    .line 893
    iget-boolean v2, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->G:Z

    .line 894
    .line 895
    if-eqz v2, :cond_24

    .line 896
    .line 897
    const v2, 0x2ffa8d60

    .line 898
    .line 899
    .line 900
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 901
    .line 902
    .line 903
    iget v5, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->d:I

    .line 904
    .line 905
    iget v6, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->c:I

    .line 906
    .line 907
    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/filter/s0;->H:Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;

    .line 908
    .line 909
    move/from16 v2, v28

    .line 910
    .line 911
    const/16 v4, 0x20

    .line 912
    .line 913
    if-ne v2, v4, :cond_21

    .line 914
    .line 915
    move v12, v14

    .line 916
    goto :goto_11

    .line 917
    :cond_21
    move v12, v3

    .line 918
    :goto_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    if-nez v12, :cond_22

    .line 923
    .line 924
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v3

    .line 928
    if-ne v2, v3, :cond_23

    .line 929
    .line 930
    :cond_22
    new-instance v2, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 931
    .line 932
    const/4 v3, 0x4

    .line 933
    invoke-direct {v2, v1, v3}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 934
    .line 935
    .line 936
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 937
    .line 938
    .line 939
    :cond_23
    move-object v8, v2

    .line 940
    check-cast v8, Lr6/a;

    .line 941
    .line 942
    const/4 v10, 0x0

    .line 943
    move-object v9, v11

    .line 944
    invoke-static/range {v5 .. v10}, Lcom/zykj/mistake/feature/collection/filter/y0;->d(IILcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultContract$SourceType;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 945
    .line 946
    .line 947
    :goto_12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 948
    .line 949
    .line 950
    goto :goto_13

    .line 951
    :cond_24
    const v2, 0x2f758ba1

    .line 952
    .line 953
    .line 954
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 955
    .line 956
    .line 957
    goto :goto_12

    .line 958
    :goto_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 959
    .line 960
    .line 961
    move-result v2

    .line 962
    if-eqz v2, :cond_26

    .line 963
    .line 964
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 965
    .line 966
    .line 967
    goto :goto_14

    .line 968
    :cond_25
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 969
    .line 970
    .line 971
    :cond_26
    :goto_14
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    if-eqz v2, :cond_27

    .line 976
    .line 977
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/v0;

    .line 978
    .line 979
    const/4 v4, 0x1

    .line 980
    move/from16 v5, p3

    .line 981
    .line 982
    invoke-direct {v3, v0, v1, v5, v4}, Lcom/zykj/mistake/feature/collection/filter/v0;-><init>(Lcom/zykj/mistake/feature/collection/filter/s0;Lr6/c;II)V

    .line 983
    .line 984
    .line 985
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 986
    .line 987
    .line 988
    :cond_27
    return-void
.end method

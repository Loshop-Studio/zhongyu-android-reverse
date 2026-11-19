.class public abstract Lcom/zykj/mistake/feature/home/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/mistake/feature/home/HomeTab;ZLr6/c;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const-string v0, "onSelectTab"

    .line 8
    .line 9
    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v0, -0x6397c622

    .line 13
    .line 14
    .line 15
    move-object/from16 v2, p3

    .line 16
    .line 17
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v11

    .line 21
    and-int/lit8 v2, v4, 0x6

    .line 22
    .line 23
    const/4 v5, -0x1

    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    move v2, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    :goto_0
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v2, 0x2

    .line 43
    :goto_1
    or-int/2addr v2, v4

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v2, v4

    .line 46
    :goto_2
    and-int/lit8 v6, p5, 0x2

    .line 47
    .line 48
    if-eqz v6, :cond_4

    .line 49
    .line 50
    or-int/lit8 v2, v2, 0x30

    .line 51
    .line 52
    :cond_3
    move/from16 v8, p1

    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_4
    and-int/lit8 v8, v4, 0x30

    .line 56
    .line 57
    if-nez v8, :cond_3

    .line 58
    .line 59
    move/from16 v8, p1

    .line 60
    .line 61
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-eqz v9, :cond_5

    .line 66
    .line 67
    const/16 v9, 0x20

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_5
    const/16 v9, 0x10

    .line 71
    .line 72
    :goto_3
    or-int/2addr v2, v9

    .line 73
    :goto_4
    and-int/lit16 v9, v4, 0x180

    .line 74
    .line 75
    if-nez v9, :cond_7

    .line 76
    .line 77
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_6

    .line 82
    .line 83
    const/16 v9, 0x100

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    const/16 v9, 0x80

    .line 87
    .line 88
    :goto_5
    or-int/2addr v2, v9

    .line 89
    :cond_7
    and-int/lit16 v9, v2, 0x93

    .line 90
    .line 91
    const/16 v10, 0x92

    .line 92
    .line 93
    const/4 v14, 0x0

    .line 94
    const/4 v15, 0x1

    .line 95
    if-eq v9, v10, :cond_8

    .line 96
    .line 97
    move v9, v15

    .line 98
    goto :goto_6

    .line 99
    :cond_8
    move v9, v14

    .line 100
    :goto_6
    and-int/lit8 v10, v2, 0x1

    .line 101
    .line 102
    invoke-interface {v11, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-eqz v9, :cond_27

    .line 107
    .line 108
    if-eqz v6, :cond_9

    .line 109
    .line 110
    move v8, v15

    .line 111
    :cond_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_a

    .line 116
    .line 117
    const-string v6, "com.zykj.mistake.feature.home.MainHomeBottomBar (HomeBottomBar.kt:29)"

    .line 118
    .line 119
    invoke-static {v0, v2, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_a
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    const/4 v6, 0x0

    .line 126
    invoke-static {v0, v5, v15, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 127
    .line 128
    .line 129
    move-result-object v16

    .line 130
    sget-object v9, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 131
    .line 132
    invoke-virtual {v9}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 133
    .line 134
    .line 135
    move-result-wide v17

    .line 136
    const/16 v20, 0x2

    .line 137
    .line 138
    const/16 v21, 0x0

    .line 139
    .line 140
    const/16 v19, 0x0

    .line 141
    .line 142
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    sget-object v10, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 147
    .line 148
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    sget-object v16, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 153
    .line 154
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-static {v12, v7, v11, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-static {v11, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 167
    .line 168
    .line 169
    move-result-object v13

    .line 170
    invoke-static {v11, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 175
    .line 176
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 181
    .line 182
    .line 183
    move-result-object v17

    .line 184
    if-nez v17, :cond_b

    .line 185
    .line 186
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 187
    .line 188
    .line 189
    :cond_b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 190
    .line 191
    .line 192
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 193
    .line 194
    .line 195
    move-result v17

    .line 196
    if-eqz v17, :cond_c

    .line 197
    .line 198
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 199
    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 203
    .line 204
    .line 205
    :goto_7
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-static {v14, v5, v7, v5, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    if-nez v13, :cond_d

    .line 218
    .line 219
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-nez v6, :cond_e

    .line 232
    .line 233
    :cond_d
    invoke-static {v12, v5, v12, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 234
    .line 235
    .line 236
    :cond_e
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    invoke-static {v5, v9, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 241
    .line 242
    .line 243
    sget-object v5, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 244
    .line 245
    const/4 v5, 0x0

    .line 246
    const/4 v6, 0x0

    .line 247
    invoke-static {v0, v6, v15, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    .line 252
    .line 253
    double-to-float v5, v5

    .line 254
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 259
    .line 260
    .line 261
    move-result-object v22

    .line 262
    const-wide v5, 0xffebedf0L

    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 268
    .line 269
    .line 270
    move-result-wide v23

    .line 271
    const/16 v26, 0x2

    .line 272
    .line 273
    const/16 v27, 0x0

    .line 274
    .line 275
    const/16 v25, 0x0

    .line 276
    .line 277
    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    const/4 v9, 0x0

    .line 290
    invoke-static {v6, v7, v11, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    invoke-static {v11, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 299
    .line 300
    .line 301
    move-result-object v9

    .line 302
    invoke-static {v11, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 307
    .line 308
    .line 309
    move-result-object v12

    .line 310
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 311
    .line 312
    .line 313
    move-result-object v13

    .line 314
    if-nez v13, :cond_f

    .line 315
    .line 316
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 317
    .line 318
    .line 319
    :cond_f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 320
    .line 321
    .line 322
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 323
    .line 324
    .line 325
    move-result v13

    .line 326
    if-eqz v13, :cond_10

    .line 327
    .line 328
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 329
    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 333
    .line 334
    .line 335
    :goto_8
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 336
    .line 337
    .line 338
    move-result-object v12

    .line 339
    invoke-static {v14, v12, v6, v12, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 344
    .line 345
    .line 346
    move-result v9

    .line 347
    if-nez v9, :cond_11

    .line 348
    .line 349
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v9

    .line 361
    if-nez v9, :cond_12

    .line 362
    .line 363
    :cond_11
    invoke-static {v7, v12, v7, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 364
    .line 365
    .line 366
    :cond_12
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    invoke-static {v12, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 371
    .line 372
    .line 373
    move-object/from16 v5, v16

    .line 374
    .line 375
    sget-object v16, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 376
    .line 377
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 378
    .line 379
    .line 380
    const/4 v6, 0x0

    .line 381
    const/4 v7, 0x0

    .line 382
    invoke-static {v0, v7, v15, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    const/16 v7, 0x34

    .line 387
    .line 388
    int-to-float v7, v7

    .line 389
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    const/4 v13, 0x0

    .line 406
    invoke-static {v7, v5, v11, v13}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    invoke-static {v11, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 411
    .line 412
    .line 413
    move-result v7

    .line 414
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    invoke-static {v11, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 423
    .line 424
    .line 425
    move-result-object v10

    .line 426
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 427
    .line 428
    .line 429
    move-result-object v12

    .line 430
    if-nez v12, :cond_13

    .line 431
    .line 432
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 433
    .line 434
    .line 435
    :cond_13
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 436
    .line 437
    .line 438
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 439
    .line 440
    .line 441
    move-result v12

    .line 442
    if-eqz v12, :cond_14

    .line 443
    .line 444
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 445
    .line 446
    .line 447
    goto :goto_9

    .line 448
    :cond_14
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 449
    .line 450
    .line 451
    :goto_9
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 452
    .line 453
    .line 454
    move-result-object v10

    .line 455
    invoke-static {v14, v10, v5, v10, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 460
    .line 461
    .line 462
    move-result v9

    .line 463
    if-nez v9, :cond_15

    .line 464
    .line 465
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v9

    .line 469
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 470
    .line 471
    .line 472
    move-result-object v12

    .line 473
    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v9

    .line 477
    if-nez v9, :cond_16

    .line 478
    .line 479
    :cond_15
    invoke-static {v7, v10, v7, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 480
    .line 481
    .line 482
    :cond_16
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    invoke-static {v10, v6, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 487
    .line 488
    .line 489
    sget-object v5, Lcom/zykj/mistake/feature/home/HomeTab;->REVIEW:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 490
    .line 491
    if-ne v1, v5, :cond_17

    .line 492
    .line 493
    sget v6, Lcom/zykj/mistake/R$drawable;->ic_review_selected:I

    .line 494
    .line 495
    goto :goto_a

    .line 496
    :cond_17
    sget v6, Lcom/zykj/mistake/R$drawable;->ic_review_normal:I

    .line 497
    .line 498
    :goto_a
    if-ne v1, v5, :cond_18

    .line 499
    .line 500
    move v7, v15

    .line 501
    goto :goto_b

    .line 502
    :cond_18
    move v7, v13

    .line 503
    :goto_b
    and-int/lit16 v14, v2, 0x380

    .line 504
    .line 505
    const/16 v5, 0x100

    .line 506
    .line 507
    if-ne v14, v5, :cond_19

    .line 508
    .line 509
    move v9, v15

    .line 510
    goto :goto_c

    .line 511
    :cond_19
    move v9, v13

    .line 512
    :goto_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    if-nez v9, :cond_1a

    .line 517
    .line 518
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 519
    .line 520
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v9

    .line 524
    if-ne v5, v9, :cond_1b

    .line 525
    .line 526
    :cond_1a
    new-instance v5, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 527
    .line 528
    const/16 v9, 0x10

    .line 529
    .line 530
    invoke-direct {v5, v3, v9}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    :cond_1b
    move-object v9, v5

    .line 537
    check-cast v9, Lr6/a;

    .line 538
    .line 539
    const/16 v20, 0x2

    .line 540
    .line 541
    const/16 v21, 0x0

    .line 542
    .line 543
    const/high16 v18, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/16 v19, 0x0

    .line 546
    .line 547
    move-object/from16 v17, v0

    .line 548
    .line 549
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 550
    .line 551
    .line 552
    move-result-object v10

    .line 553
    shl-int/lit8 v0, v2, 0x6

    .line 554
    .line 555
    and-int/lit16 v0, v0, 0x1c00

    .line 556
    .line 557
    or-int/lit8 v12, v0, 0x30

    .line 558
    .line 559
    move v5, v6

    .line 560
    const-string v6, "\u590d\u4e60"

    .line 561
    .line 562
    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/home/b;->b(ILjava/lang/String;ZZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 563
    .line 564
    .line 565
    sget-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->MISTAKE_NOTEBOOK:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 566
    .line 567
    if-ne v1, v0, :cond_1c

    .line 568
    .line 569
    sget v2, Lcom/zykj/mistake/R$drawable;->ic_mistake_notebnook_selected:I

    .line 570
    .line 571
    :goto_d
    move v5, v2

    .line 572
    goto :goto_e

    .line 573
    :cond_1c
    sget v2, Lcom/zykj/mistake/R$drawable;->ic_mistake_notebook_normal:I

    .line 574
    .line 575
    goto :goto_d

    .line 576
    :goto_e
    if-ne v1, v0, :cond_1d

    .line 577
    .line 578
    move v7, v15

    .line 579
    :goto_f
    const/16 v0, 0x100

    .line 580
    .line 581
    goto :goto_10

    .line 582
    :cond_1d
    move v7, v13

    .line 583
    goto :goto_f

    .line 584
    :goto_10
    if-ne v14, v0, :cond_1e

    .line 585
    .line 586
    move v9, v15

    .line 587
    goto :goto_11

    .line 588
    :cond_1e
    move v9, v13

    .line 589
    :goto_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    if-nez v9, :cond_1f

    .line 594
    .line 595
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 596
    .line 597
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    if-ne v0, v2, :cond_20

    .line 602
    .line 603
    :cond_1f
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 604
    .line 605
    const/16 v2, 0x11

    .line 606
    .line 607
    invoke-direct {v0, v3, v2}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 608
    .line 609
    .line 610
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    :cond_20
    move-object v9, v0

    .line 614
    check-cast v9, Lr6/a;

    .line 615
    .line 616
    const/16 v20, 0x2

    .line 617
    .line 618
    const/16 v21, 0x0

    .line 619
    .line 620
    const/high16 v18, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/16 v19, 0x0

    .line 623
    .line 624
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 625
    .line 626
    .line 627
    move-result-object v10

    .line 628
    const-string v6, "\u9519\u9898"

    .line 629
    .line 630
    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/home/b;->b(ILjava/lang/String;ZZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 631
    .line 632
    .line 633
    sget-object v0, Lcom/zykj/mistake/feature/home/HomeTab;->MISTAKE_COLLECTION:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 634
    .line 635
    if-ne v1, v0, :cond_21

    .line 636
    .line 637
    sget v2, Lcom/zykj/mistake/R$drawable;->ic_mistake_collection_selected:I

    .line 638
    .line 639
    :goto_12
    move v5, v2

    .line 640
    goto :goto_13

    .line 641
    :cond_21
    sget v2, Lcom/zykj/mistake/R$drawable;->ic_mistake_collection_normal:I

    .line 642
    .line 643
    goto :goto_12

    .line 644
    :goto_13
    if-ne v1, v0, :cond_22

    .line 645
    .line 646
    move v7, v15

    .line 647
    :goto_14
    const/16 v0, 0x100

    .line 648
    .line 649
    goto :goto_15

    .line 650
    :cond_22
    move v7, v13

    .line 651
    goto :goto_14

    .line 652
    :goto_15
    if-ne v14, v0, :cond_23

    .line 653
    .line 654
    move v14, v15

    .line 655
    goto :goto_16

    .line 656
    :cond_23
    move v14, v13

    .line 657
    :goto_16
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    if-nez v14, :cond_24

    .line 662
    .line 663
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 664
    .line 665
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    if-ne v0, v2, :cond_25

    .line 670
    .line 671
    :cond_24
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 672
    .line 673
    const/16 v2, 0x12

    .line 674
    .line 675
    invoke-direct {v0, v3, v2}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 676
    .line 677
    .line 678
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    :cond_25
    move-object v9, v0

    .line 682
    check-cast v9, Lr6/a;

    .line 683
    .line 684
    const/16 v20, 0x2

    .line 685
    .line 686
    const/16 v21, 0x0

    .line 687
    .line 688
    const/high16 v18, 0x3f800000    # 1.0f

    .line 689
    .line 690
    const/16 v19, 0x0

    .line 691
    .line 692
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 693
    .line 694
    .line 695
    move-result-object v10

    .line 696
    const-string v6, "\u9519\u9898\u96c6"

    .line 697
    .line 698
    invoke-static/range {v5 .. v12}, Lcom/zykj/mistake/feature/home/b;->b(ILjava/lang/String;ZZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 699
    .line 700
    .line 701
    invoke-static {v11}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    if-eqz v0, :cond_26

    .line 706
    .line 707
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 708
    .line 709
    .line 710
    :cond_26
    :goto_17
    move v2, v8

    .line 711
    goto :goto_18

    .line 712
    :cond_27
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 713
    .line 714
    .line 715
    goto :goto_17

    .line 716
    :goto_18
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 717
    .line 718
    .line 719
    move-result-object v6

    .line 720
    if-eqz v6, :cond_28

    .line 721
    .line 722
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/c1;

    .line 723
    .line 724
    move/from16 v5, p5

    .line 725
    .line 726
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/collection/detail/c1;-><init>(Lcom/zykj/mistake/feature/home/HomeTab;ZLr6/c;II)V

    .line 727
    .line 728
    .line 729
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 730
    .line 731
    .line 732
    :cond_28
    return-void
.end method

.method public static final b(ILjava/lang/String;ZZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v6, p5

    .line 6
    .line 7
    move/from16 v7, p7

    .line 8
    .line 9
    const v0, 0x8062ecc

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p6

    .line 13
    .line 14
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v15

    .line 18
    and-int/lit8 v2, v7, 0x6

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x2

    .line 31
    :goto_0
    or-int/2addr v2, v7

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v7

    .line 34
    :goto_1
    and-int/lit8 v4, v7, 0x30

    .line 35
    .line 36
    move-object/from16 v8, p1

    .line 37
    .line 38
    if-nez v4, :cond_3

    .line 39
    .line 40
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    const/16 v4, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v4, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v2, v4

    .line 52
    :cond_3
    and-int/lit16 v4, v7, 0x180

    .line 53
    .line 54
    if-nez v4, :cond_5

    .line 55
    .line 56
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    :cond_5
    and-int/lit16 v4, v7, 0xc00

    .line 69
    .line 70
    if-nez v4, :cond_7

    .line 71
    .line 72
    move/from16 v4, p3

    .line 73
    .line 74
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_6

    .line 79
    .line 80
    const/16 v5, 0x800

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    const/16 v5, 0x400

    .line 84
    .line 85
    :goto_4
    or-int/2addr v2, v5

    .line 86
    goto :goto_5

    .line 87
    :cond_7
    move/from16 v4, p3

    .line 88
    .line 89
    :goto_5
    and-int/lit16 v5, v7, 0x6000

    .line 90
    .line 91
    if-nez v5, :cond_9

    .line 92
    .line 93
    move-object/from16 v5, p4

    .line 94
    .line 95
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-eqz v9, :cond_8

    .line 100
    .line 101
    const/16 v9, 0x4000

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/16 v9, 0x2000

    .line 105
    .line 106
    :goto_6
    or-int/2addr v2, v9

    .line 107
    goto :goto_7

    .line 108
    :cond_9
    move-object/from16 v5, p4

    .line 109
    .line 110
    :goto_7
    const/high16 v9, 0x30000

    .line 111
    .line 112
    and-int/2addr v9, v7

    .line 113
    if-nez v9, :cond_b

    .line 114
    .line 115
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_a

    .line 120
    .line 121
    const/high16 v9, 0x20000

    .line 122
    .line 123
    goto :goto_8

    .line 124
    :cond_a
    const/high16 v9, 0x10000

    .line 125
    .line 126
    :goto_8
    or-int/2addr v2, v9

    .line 127
    :cond_b
    const v9, 0x12493

    .line 128
    .line 129
    .line 130
    and-int/2addr v9, v2

    .line 131
    const v10, 0x12492

    .line 132
    .line 133
    .line 134
    const/4 v11, 0x0

    .line 135
    const/4 v12, 0x1

    .line 136
    if-eq v9, v10, :cond_c

    .line 137
    .line 138
    move v9, v12

    .line 139
    goto :goto_9

    .line 140
    :cond_c
    move v9, v11

    .line 141
    :goto_9
    and-int/lit8 v10, v2, 0x1

    .line 142
    .line 143
    invoke-interface {v15, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_14

    .line 148
    .line 149
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    if-eqz v9, :cond_d

    .line 154
    .line 155
    const/4 v9, -0x1

    .line 156
    const-string v10, "com.zykj.mistake.feature.home.MainHomeTabItem (HomeBottomBar.kt:94)"

    .line 157
    .line 158
    invoke-static {v0, v2, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_d
    if-eqz v3, :cond_e

    .line 162
    .line 163
    const-wide v9, 0xff1576ffL

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    :goto_a
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 169
    .line 170
    .line 171
    move-result-wide v9

    .line 172
    move-wide/from16 v23, v9

    .line 173
    .line 174
    goto :goto_b

    .line 175
    :cond_e
    const-wide v9, 0xff15171aL

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    goto :goto_a

    .line 181
    :goto_b
    const/4 v0, 0x0

    .line 182
    const/4 v9, 0x0

    .line 183
    invoke-static {v6, v0, v12, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 184
    .line 185
    .line 186
    move-result-object v16

    .line 187
    const/16 v21, 0x6

    .line 188
    .line 189
    const/16 v22, 0x0

    .line 190
    .line 191
    const/16 v18, 0x0

    .line 192
    .line 193
    const/16 v19, 0x0

    .line 194
    .line 195
    move/from16 v17, v4

    .line 196
    .line 197
    move-object/from16 v20, v5

    .line 198
    .line 199
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 204
    .line 205
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 210
    .line 211
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    const/16 v9, 0x30

    .line 216
    .line 217
    invoke-static {v5, v4, v15, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-static {v15, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-static {v15, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 234
    .line 235
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 240
    .line 241
    .line 242
    move-result-object v12

    .line 243
    if-nez v12, :cond_f

    .line 244
    .line 245
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 246
    .line 247
    .line 248
    :cond_f
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 249
    .line 250
    .line 251
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    if-eqz v12, :cond_10

    .line 256
    .line 257
    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 258
    .line 259
    .line 260
    goto :goto_c

    .line 261
    :cond_10
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 262
    .line 263
    .line 264
    :goto_c
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    invoke-static {v10, v11, v4, v11, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    if-nez v9, :cond_11

    .line 277
    .line 278
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v9

    .line 282
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    move-result-object v12

    .line 286
    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    if-nez v9, :cond_12

    .line 291
    .line 292
    :cond_11
    invoke-static {v5, v11, v5, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 293
    .line 294
    .line 295
    :cond_12
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-static {v11, v0, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 300
    .line 301
    .line 302
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 303
    .line 304
    and-int/lit8 v0, v2, 0xe

    .line 305
    .line 306
    invoke-static {v1, v15, v0}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    sget-object v16, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 311
    .line 312
    const/4 v4, 0x5

    .line 313
    int-to-float v4, v4

    .line 314
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 315
    .line 316
    .line 317
    move-result v18

    .line 318
    const/16 v21, 0xd

    .line 319
    .line 320
    const/16 v22, 0x0

    .line 321
    .line 322
    const/16 v17, 0x0

    .line 323
    .line 324
    const/16 v19, 0x0

    .line 325
    .line 326
    const/16 v20, 0x0

    .line 327
    .line 328
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    move-object/from16 v5, v16

    .line 333
    .line 334
    const/16 v9, 0x18

    .line 335
    .line 336
    int-to-float v9, v9

    .line 337
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 342
    .line 343
    .line 344
    move-result-object v10

    .line 345
    and-int/lit8 v4, v2, 0x70

    .line 346
    .line 347
    or-int/lit16 v4, v4, 0x180

    .line 348
    .line 349
    const/16 v17, 0x78

    .line 350
    .line 351
    const/4 v11, 0x0

    .line 352
    const/4 v12, 0x0

    .line 353
    const/4 v13, 0x0

    .line 354
    const/4 v14, 0x0

    .line 355
    move/from16 v16, v4

    .line 356
    .line 357
    move-object v9, v8

    .line 358
    move-object v8, v0

    .line 359
    invoke-static/range {v8 .. v17}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 360
    .line 361
    .line 362
    move-object/from16 v29, v15

    .line 363
    .line 364
    const/16 v0, 0xa

    .line 365
    .line 366
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 367
    .line 368
    .line 369
    move-result-wide v15

    .line 370
    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 371
    .line 372
    if-eqz v3, :cond_13

    .line 373
    .line 374
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    goto :goto_d

    .line 379
    :cond_13
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getNormal()Landroidx/compose/ui/text/font/FontWeight;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    :goto_d
    const/4 v4, 0x3

    .line 384
    int-to-float v8, v4

    .line 385
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    const/16 v13, 0xd

    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    const/4 v9, 0x0

    .line 393
    const/4 v11, 0x0

    .line 394
    const/4 v12, 0x0

    .line 395
    move-object v8, v5

    .line 396
    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 397
    .line 398
    .line 399
    move-result-object v9

    .line 400
    shr-int/2addr v2, v4

    .line 401
    and-int/lit8 v2, v2, 0xe

    .line 402
    .line 403
    or-int/lit16 v2, v2, 0xc30

    .line 404
    .line 405
    const/16 v31, 0x0

    .line 406
    .line 407
    const v32, 0x1ffd0

    .line 408
    .line 409
    .line 410
    move-wide v12, v15

    .line 411
    const/16 v16, 0x0

    .line 412
    .line 413
    const-wide/16 v17, 0x0

    .line 414
    .line 415
    const/16 v19, 0x0

    .line 416
    .line 417
    const/16 v20, 0x0

    .line 418
    .line 419
    const-wide/16 v21, 0x0

    .line 420
    .line 421
    move-wide/from16 v10, v23

    .line 422
    .line 423
    const/16 v23, 0x0

    .line 424
    .line 425
    const/16 v24, 0x0

    .line 426
    .line 427
    const/16 v25, 0x0

    .line 428
    .line 429
    const/16 v26, 0x0

    .line 430
    .line 431
    const/16 v27, 0x0

    .line 432
    .line 433
    const/16 v28, 0x0

    .line 434
    .line 435
    move-object/from16 v8, p1

    .line 436
    .line 437
    move-object v15, v0

    .line 438
    move/from16 v30, v2

    .line 439
    .line 440
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 441
    .line 442
    .line 443
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 444
    .line 445
    .line 446
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    if-eqz v0, :cond_15

    .line 451
    .line 452
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 453
    .line 454
    .line 455
    goto :goto_e

    .line 456
    :cond_14
    move-object/from16 v29, v15

    .line 457
    .line 458
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 459
    .line 460
    .line 461
    :cond_15
    :goto_e
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    if-eqz v8, :cond_16

    .line 466
    .line 467
    new-instance v0, Lcom/zykj/mistake/feature/home/a;

    .line 468
    .line 469
    move-object/from16 v2, p1

    .line 470
    .line 471
    move/from16 v4, p3

    .line 472
    .line 473
    move-object/from16 v5, p4

    .line 474
    .line 475
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/home/a;-><init>(ILjava/lang/String;ZZLr6/a;Landroidx/compose/ui/Modifier;I)V

    .line 476
    .line 477
    .line 478
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 479
    .line 480
    .line 481
    :cond_16
    return-void
.end method

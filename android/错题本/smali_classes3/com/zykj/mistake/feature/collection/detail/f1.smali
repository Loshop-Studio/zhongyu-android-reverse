.class public abstract Lcom/zykj/mistake/feature/collection/detail/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/mistake/feature/collection/detail/z0;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v5, p2

    .line 6
    .line 7
    move/from16 v1, p4

    .line 8
    .line 9
    const v0, -0x754a27ba

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p3

    .line 13
    .line 14
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    and-int/lit8 v6, v1, 0x6

    .line 19
    .line 20
    if-nez v6, :cond_1

    .line 21
    .line 22
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    const/4 v6, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v6, 0x2

    .line 31
    :goto_0
    or-int/2addr v6, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v6, v1

    .line 34
    :goto_1
    and-int/lit8 v7, v1, 0x30

    .line 35
    .line 36
    if-nez v7, :cond_3

    .line 37
    .line 38
    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    const/16 v7, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v7, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v6, v7

    .line 50
    :cond_3
    and-int/lit16 v7, v1, 0x180

    .line 51
    .line 52
    const/16 v9, 0x100

    .line 53
    .line 54
    if-nez v7, :cond_5

    .line 55
    .line 56
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_4

    .line 61
    .line 62
    move v7, v9

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v7, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v6, v7

    .line 67
    :cond_5
    and-int/lit16 v7, v6, 0x93

    .line 68
    .line 69
    const/16 v10, 0x92

    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    const/4 v12, 0x1

    .line 73
    if-eq v7, v10, :cond_6

    .line 74
    .line 75
    move v7, v12

    .line 76
    goto :goto_4

    .line 77
    :cond_6
    move v7, v11

    .line 78
    :goto_4
    and-int/lit8 v10, v6, 0x1

    .line 79
    .line 80
    invoke-interface {v2, v7, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_1d

    .line 85
    .line 86
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_7

    .line 91
    .line 92
    const/4 v7, -0x1

    .line 93
    const-string v10, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContent (MistakeCollectionDetailScreen.kt:405)"

    .line 94
    .line 95
    invoke-static {v0, v6, v7, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_7
    and-int/lit16 v0, v6, 0x380

    .line 99
    .line 100
    if-ne v0, v9, :cond_8

    .line 101
    .line 102
    move v7, v12

    .line 103
    goto :goto_5

    .line 104
    :cond_8
    move v7, v11

    .line 105
    :goto_5
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    if-nez v7, :cond_9

    .line 110
    .line 111
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 112
    .line 113
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    if-ne v10, v7, :cond_a

    .line 118
    .line 119
    :cond_9
    new-instance v10, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 120
    .line 121
    invoke-direct {v10, v5, v11}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_a
    check-cast v10, Lr6/c;

    .line 128
    .line 129
    invoke-static {v2, v10}, Lcom/zykj/mistake/utils/e;->d(Landroidx/compose/runtime/Composer;Lr6/c;)Lr6/c;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    const/4 v10, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    invoke-static {v4, v10, v12, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    const-wide v15, 0xfff5f7faL

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static/range {v15 .. v16}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 145
    .line 146
    .line 147
    move-result-wide v15

    .line 148
    const/16 v18, 0x2

    .line 149
    .line 150
    const/16 v19, 0x0

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    sget-object v15, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 159
    .line 160
    invoke-virtual {v15}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 161
    .line 162
    .line 163
    move-result-object v15

    .line 164
    invoke-static {v15, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 165
    .line 166
    .line 167
    move-result-object v15

    .line 168
    invoke-static {v2, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-static {v2, v14}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 181
    .line 182
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 187
    .line 188
    .line 189
    move-result-object v19

    .line 190
    if-nez v19, :cond_b

    .line 191
    .line 192
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 193
    .line 194
    .line 195
    :cond_b
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 196
    .line 197
    .line 198
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 199
    .line 200
    .line 201
    move-result v19

    .line 202
    if-eqz v19, :cond_c

    .line 203
    .line 204
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 205
    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 209
    .line 210
    .line 211
    :goto_6
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    invoke-static {v9, v10, v15, v10, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 220
    .line 221
    .line 222
    move-result v15

    .line 223
    if-nez v15, :cond_d

    .line 224
    .line 225
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v15

    .line 229
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v12

    .line 237
    if-nez v12, :cond_e

    .line 238
    .line 239
    :cond_d
    invoke-static {v8, v10, v8, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 240
    .line 241
    .line 242
    :cond_e
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    invoke-static {v10, v14, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 247
    .line 248
    .line 249
    sget-object v8, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 250
    .line 251
    iget-object v8, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    if-eqz v8, :cond_f

    .line 258
    .line 259
    iget-boolean v8, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    .line 260
    .line 261
    if-nez v8, :cond_f

    .line 262
    .line 263
    const v0, -0x71786f94

    .line 264
    .line 265
    .line 266
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 267
    .line 268
    .line 269
    and-int/lit8 v0, v6, 0xe

    .line 270
    .line 271
    invoke-static {v3, v2, v0}, Lcom/zykj/mistake/feature/collection/detail/f1;->b(Lcom/zykj/mistake/feature/collection/detail/z0;Landroidx/compose/runtime/Composer;I)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 275
    .line 276
    .line 277
    move-object v0, v2

    .line 278
    goto/16 :goto_c

    .line 279
    .line 280
    :cond_f
    iget-object v6, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 281
    .line 282
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-nez v6, :cond_1c

    .line 287
    .line 288
    const v6, -0x71763d19

    .line 289
    .line 290
    .line 291
    invoke-interface {v2, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 292
    .line 293
    .line 294
    iget-object v6, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 295
    .line 296
    iget-boolean v8, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->j:Z

    .line 297
    .line 298
    move v9, v8

    .line 299
    iget-boolean v8, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->k:Z

    .line 300
    .line 301
    move v10, v9

    .line 302
    iget-boolean v9, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->l:Z

    .line 303
    .line 304
    iget-boolean v11, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 305
    .line 306
    iget-object v12, v3, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 307
    .line 308
    sget-object v14, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 309
    .line 310
    const/4 v1, 0x1

    .line 311
    const/4 v15, 0x0

    .line 312
    invoke-static {v14, v15, v1, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 313
    .line 314
    .line 315
    move-result-object v13

    .line 316
    const/16 v14, 0x100

    .line 317
    .line 318
    if-ne v0, v14, :cond_10

    .line 319
    .line 320
    move v14, v1

    .line 321
    goto :goto_7

    .line 322
    :cond_10
    const/4 v14, 0x0

    .line 323
    :goto_7
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v15

    .line 327
    if-nez v14, :cond_11

    .line 328
    .line 329
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 330
    .line 331
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v14

    .line 335
    if-ne v15, v14, :cond_12

    .line 336
    .line 337
    :cond_11
    new-instance v15, Lcom/zykj/mistake/feature/ask/h0;

    .line 338
    .line 339
    const/4 v14, 0x7

    .line 340
    invoke-direct {v15, v5, v14}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 341
    .line 342
    .line 343
    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    :cond_12
    check-cast v15, Lr6/a;

    .line 347
    .line 348
    const/16 v14, 0x100

    .line 349
    .line 350
    if-ne v0, v14, :cond_13

    .line 351
    .line 352
    move v14, v1

    .line 353
    goto :goto_8

    .line 354
    :cond_13
    const/4 v14, 0x0

    .line 355
    :goto_8
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    if-nez v14, :cond_14

    .line 360
    .line 361
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 362
    .line 363
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v14

    .line 367
    if-ne v1, v14, :cond_15

    .line 368
    .line 369
    :cond_14
    new-instance v1, Lcom/zykj/mistake/feature/ask/h0;

    .line 370
    .line 371
    const/16 v14, 0x10

    .line 372
    .line 373
    invoke-direct {v1, v5, v14}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 374
    .line 375
    .line 376
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    :cond_15
    check-cast v1, Lr6/a;

    .line 380
    .line 381
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v14

    .line 385
    move-object/from16 p3, v1

    .line 386
    .line 387
    const/16 v1, 0x100

    .line 388
    .line 389
    if-ne v0, v1, :cond_16

    .line 390
    .line 391
    const/4 v1, 0x1

    .line 392
    goto :goto_9

    .line 393
    :cond_16
    const/4 v1, 0x0

    .line 394
    :goto_9
    or-int/2addr v1, v14

    .line 395
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v14

    .line 399
    or-int/2addr v1, v14

    .line 400
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v14

    .line 404
    move/from16 v18, v1

    .line 405
    .line 406
    if-nez v18, :cond_17

    .line 407
    .line 408
    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 409
    .line 410
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    if-ne v14, v1, :cond_18

    .line 415
    .line 416
    :cond_17
    new-instance v14, Landroidx/lifecycle/i;

    .line 417
    .line 418
    const/4 v1, 0x6

    .line 419
    invoke-direct {v14, v3, v5, v7, v1}, Landroidx/lifecycle/i;-><init>(Ljava/lang/Object;Lr6/c;Ld6/d;I)V

    .line 420
    .line 421
    .line 422
    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    :cond_18
    check-cast v14, Lr6/c;

    .line 426
    .line 427
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    const/16 v7, 0x100

    .line 432
    .line 433
    if-ne v0, v7, :cond_19

    .line 434
    .line 435
    const/16 v16, 0x1

    .line 436
    .line 437
    goto :goto_a

    .line 438
    :cond_19
    const/16 v16, 0x0

    .line 439
    .line 440
    :goto_a
    or-int v0, v1, v16

    .line 441
    .line 442
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    if-nez v0, :cond_1a

    .line 447
    .line 448
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 449
    .line 450
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    if-ne v1, v0, :cond_1b

    .line 455
    .line 456
    :cond_1a
    new-instance v1, Landroidx/navigation/d;

    .line 457
    .line 458
    const/4 v0, 0x6

    .line 459
    invoke-direct {v1, v0, v3, v5}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    :cond_1b
    move-object/from16 v18, v1

    .line 466
    .line 467
    check-cast v18, Lr6/c;

    .line 468
    .line 469
    const/16 v21, 0x0

    .line 470
    .line 471
    const/16 v22, 0x180

    .line 472
    .line 473
    move v7, v10

    .line 474
    move-object v10, v13

    .line 475
    const/4 v13, 0x0

    .line 476
    move-object/from16 v17, v14

    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    const/16 v20, 0x6000

    .line 480
    .line 481
    move-object/from16 v16, p3

    .line 482
    .line 483
    move-object/from16 v19, v2

    .line 484
    .line 485
    invoke-static/range {v6 .. v22}, Lcom/zykj/mistake/feature/collection/component/o;->b(Ljava/util/List;ZZZLandroidx/compose/ui/Modifier;ZLjava/util/Set;Ljava/util/Set;Landroidx/compose/foundation/layout/PaddingValues;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 486
    .line 487
    .line 488
    move-object/from16 v0, v19

    .line 489
    .line 490
    :goto_b
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 491
    .line 492
    .line 493
    goto :goto_c

    .line 494
    :cond_1c
    move-object v0, v2

    .line 495
    const v1, -0x72898d6a

    .line 496
    .line 497
    .line 498
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 499
    .line 500
    .line 501
    goto :goto_b

    .line 502
    :goto_c
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 503
    .line 504
    .line 505
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-eqz v1, :cond_1e

    .line 510
    .line 511
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 512
    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_1d
    move-object v0, v2

    .line 516
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 517
    .line 518
    .line 519
    :cond_1e
    :goto_d
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 520
    .line 521
    .line 522
    move-result-object v6

    .line 523
    if-eqz v6, :cond_1f

    .line 524
    .line 525
    new-instance v0, Landroidx/lifecycle/compose/g;

    .line 526
    .line 527
    const/4 v2, 0x5

    .line 528
    move/from16 v1, p4

    .line 529
    .line 530
    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/compose/g;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 534
    .line 535
    .line 536
    :cond_1f
    return-void
.end method

.method public static final b(Lcom/zykj/mistake/feature/collection/detail/z0;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    const v1, -0x26dfeb33

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p1

    .line 7
    .line 8
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v9

    .line 12
    and-int/lit8 v2, v0, 0x1

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v4, v3

    .line 20
    :goto_0
    invoke-interface {v9, v4, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_6

    .line 25
    .line 26
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    const-string v4, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailEmptyContent (MistakeCollectionDetailScreen.kt:449)"

    .line 34
    .line 35
    invoke-static {v1, v0, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 45
    .line 46
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 47
    .line 48
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/16 v4, 0x30

    .line 53
    .line 54
    invoke-static {v2, v1, v9, v4}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v9, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v9, v12}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 71
    .line 72
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    if-nez v8, :cond_2

    .line 81
    .line 82
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 83
    .line 84
    .line 85
    :cond_2
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-eqz v8, :cond_3

    .line 93
    .line 94
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 99
    .line 100
    .line 101
    :goto_1
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-static {v6, v7, v1, v7, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_4

    .line 114
    .line 115
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_5

    .line 128
    .line 129
    :cond_4
    invoke-static {v2, v7, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 130
    .line 131
    .line 132
    :cond_5
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v7, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 137
    .line 138
    .line 139
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 140
    .line 141
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_no_data:I

    .line 142
    .line 143
    invoke-static {v1, v9, v3}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const/16 v1, 0x64

    .line 148
    .line 149
    int-to-float v1, v1

    .line 150
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    const/16 v10, 0x1b0

    .line 159
    .line 160
    const/16 v11, 0x78

    .line 161
    .line 162
    const-string v3, "\u6682\u65e0\u7b26\u5408\u6761\u4ef6\u7684\u9519\u9898"

    .line 163
    .line 164
    const/4 v5, 0x0

    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    const/4 v8, 0x0

    .line 168
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 169
    .line 170
    .line 171
    move-object/from16 v23, v9

    .line 172
    .line 173
    const-wide v1, 0xff666666L

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 179
    .line 180
    .line 181
    move-result-wide v4

    .line 182
    const/16 v1, 0xc

    .line 183
    .line 184
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v6

    .line 188
    const/16 v1, 0x12

    .line 189
    .line 190
    int-to-float v1, v1

    .line 191
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    const/16 v15, 0xd

    .line 196
    .line 197
    const/16 v16, 0x0

    .line 198
    .line 199
    const/4 v11, 0x0

    .line 200
    const/4 v13, 0x0

    .line 201
    const/4 v14, 0x0

    .line 202
    move-object v10, v12

    .line 203
    move v12, v1

    .line 204
    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    const/16 v25, 0x0

    .line 209
    .line 210
    const v26, 0x1fff0

    .line 211
    .line 212
    .line 213
    const-string v2, "\u6682\u65e0\u4efb\u4f55\u9519\u9898"

    .line 214
    .line 215
    const/4 v9, 0x0

    .line 216
    const/4 v10, 0x0

    .line 217
    const-wide/16 v11, 0x0

    .line 218
    .line 219
    const/4 v13, 0x0

    .line 220
    const/4 v14, 0x0

    .line 221
    const-wide/16 v15, 0x0

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    const/16 v19, 0x0

    .line 228
    .line 229
    const/16 v20, 0x0

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const/16 v24, 0xdb6

    .line 236
    .line 237
    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 238
    .line 239
    .line 240
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 241
    .line 242
    .line 243
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    if-eqz v1, :cond_7

    .line 248
    .line 249
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 250
    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_6
    move-object/from16 v23, v9

    .line 254
    .line 255
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 256
    .line 257
    .line 258
    :cond_7
    :goto_2
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    if-eqz v1, :cond_8

    .line 263
    .line 264
    new-instance v2, Landroidx/navigation/compose/d;

    .line 265
    .line 266
    const/4 v3, 0x3

    .line 267
    move-object/from16 v4, p0

    .line 268
    .line 269
    invoke-direct {v2, v4, v0, v3}, Landroidx/navigation/compose/d;-><init>(Ljava/lang/Object;II)V

    .line 270
    .line 271
    .line 272
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 273
    .line 274
    .line 275
    :cond_8
    return-void
.end method

.method public static final c(Lcom/zykj/mistake/feature/collection/detail/z0;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 26

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
    const-string v3, "onIntent"

    .line 11
    .line 12
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const v3, 0x6496935a

    .line 16
    .line 17
    .line 18
    move-object/from16 v4, p2

    .line 19
    .line 20
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    and-int/lit8 v4, p3, 0x6

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v4, 0x2

    .line 37
    :goto_0
    or-int v4, p3, v4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move/from16 v4, p3

    .line 41
    .line 42
    :goto_1
    and-int/lit8 v6, p3, 0x30

    .line 43
    .line 44
    if-nez v6, :cond_3

    .line 45
    .line 46
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    const/16 v6, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v6, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v4, v6

    .line 58
    :cond_3
    and-int/lit8 v6, v4, 0x13

    .line 59
    .line 60
    const/16 v7, 0x12

    .line 61
    .line 62
    const/4 v14, 0x1

    .line 63
    const/4 v15, 0x0

    .line 64
    if-eq v6, v7, :cond_4

    .line 65
    .line 66
    move v6, v14

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move v6, v15

    .line 69
    :goto_3
    and-int/lit8 v7, v4, 0x1

    .line 70
    .line 71
    invoke-interface {v10, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_22

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_5

    .line 82
    .line 83
    const/4 v6, -0x1

    .line 84
    const-string v7, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailScreen (MistakeCollectionDetailScreen.kt:64)"

    .line 85
    .line 86
    invoke-static {v3, v4, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    iget-boolean v3, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->e:Z

    .line 90
    .line 91
    if-eqz v3, :cond_6

    .line 92
    .line 93
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->a:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-lez v3, :cond_6

    .line 100
    .line 101
    move v3, v4

    .line 102
    move v4, v14

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    move v3, v4

    .line 105
    move v4, v15

    .line 106
    :goto_4
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    invoke-static {v6, v7, v14, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 111
    .line 112
    .line 113
    move-result-object v16

    .line 114
    const-wide v11, 0xfff5f7faL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v17

    .line 123
    const/16 v20, 0x2

    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    sget-object v22, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 134
    .line 135
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    invoke-static {v11, v15}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    invoke-static {v10, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-static {v10, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 156
    .line 157
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 162
    .line 163
    .line 164
    move-result-object v16

    .line 165
    if-nez v16, :cond_7

    .line 166
    .line 167
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 168
    .line 169
    .line 170
    :cond_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 171
    .line 172
    .line 173
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 174
    .line 175
    .line 176
    move-result v16

    .line 177
    if-eqz v16, :cond_8

    .line 178
    .line 179
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 184
    .line 185
    .line 186
    :goto_5
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 187
    .line 188
    .line 189
    move-result-object v15

    .line 190
    invoke-static {v5, v15, v11, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    if-nez v13, :cond_9

    .line 199
    .line 200
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v13

    .line 204
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-nez v7, :cond_a

    .line 213
    .line 214
    :cond_9
    invoke-static {v12, v15, v12, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 215
    .line 216
    .line 217
    :cond_a
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    invoke-static {v15, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 222
    .line 223
    .line 224
    sget-object v13, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 225
    .line 226
    const/4 v7, 0x0

    .line 227
    invoke-static {v6, v7, v14, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 232
    .line 233
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    const/4 v12, 0x0

    .line 242
    invoke-static {v7, v11, v10, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-static {v10, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    invoke-static {v10, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 255
    .line 256
    .line 257
    move-result-object v9

    .line 258
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 259
    .line 260
    .line 261
    move-result-object v15

    .line 262
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 263
    .line 264
    .line 265
    move-result-object v16

    .line 266
    if-nez v16, :cond_b

    .line 267
    .line 268
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 269
    .line 270
    .line 271
    :cond_b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 272
    .line 273
    .line 274
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 275
    .line 276
    .line 277
    move-result v16

    .line 278
    if-eqz v16, :cond_c

    .line 279
    .line 280
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 285
    .line 286
    .line 287
    :goto_6
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 288
    .line 289
    .line 290
    move-result-object v15

    .line 291
    invoke-static {v5, v15, v7, v15, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 296
    .line 297
    .line 298
    move-result v12

    .line 299
    if-nez v12, :cond_d

    .line 300
    .line 301
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    if-nez v12, :cond_e

    .line 314
    .line 315
    :cond_d
    invoke-static {v11, v15, v11, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 316
    .line 317
    .line 318
    :cond_e
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    invoke-static {v15, v9, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 323
    .line 324
    .line 325
    sget-object v16, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 326
    .line 327
    and-int/lit8 v5, v3, 0xe

    .line 328
    .line 329
    and-int/lit8 v14, v3, 0x70

    .line 330
    .line 331
    and-int/lit8 v7, v3, 0x7e

    .line 332
    .line 333
    invoke-static {v0, v1, v10, v7}, Lcom/zykj/mistake/feature/collection/detail/f1;->d(Lcom/zykj/mistake/feature/collection/detail/z0;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 334
    .line 335
    .line 336
    const/4 v12, 0x0

    .line 337
    invoke-static {v8, v10, v12}, Ly4/g;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 338
    .line 339
    .line 340
    const/16 v20, 0x2

    .line 341
    .line 342
    const/16 v21, 0x0

    .line 343
    .line 344
    const/high16 v18, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/16 v19, 0x0

    .line 347
    .line 348
    move-object/from16 v17, v6

    .line 349
    .line 350
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    move-object/from16 v15, v17

    .line 355
    .line 356
    shl-int/lit8 v3, v3, 0x3

    .line 357
    .line 358
    and-int/lit16 v3, v3, 0x380

    .line 359
    .line 360
    or-int/2addr v3, v5

    .line 361
    invoke-static {v0, v6, v1, v10, v3}, Lcom/zykj/mistake/feature/collection/detail/f1;->a(Lcom/zykj/mistake/feature/collection/detail/z0;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 362
    .line 363
    .line 364
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 365
    .line 366
    .line 367
    const/16 v3, 0xb4

    .line 368
    .line 369
    const/4 v5, 0x6

    .line 370
    const/4 v12, 0x0

    .line 371
    invoke-static {v3, v12, v8, v5, v8}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    const/4 v7, 0x2

    .line 376
    const/4 v9, 0x0

    .line 377
    invoke-static {v6, v9, v7, v8}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    invoke-static {v3, v12, v8, v5, v8}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    invoke-static {v3, v9, v7, v8}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/e1;

    .line 390
    .line 391
    const/4 v9, 0x0

    .line 392
    invoke-direct {v3, v1, v9}, Lcom/zykj/mistake/feature/collection/detail/e1;-><init>(Lr6/c;I)V

    .line 393
    .line 394
    .line 395
    const v9, -0x2218c048

    .line 396
    .line 397
    .line 398
    const/16 v11, 0x36

    .line 399
    .line 400
    const/4 v12, 0x1

    .line 401
    invoke-static {v9, v12, v3, v10, v11}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    move v3, v11

    .line 406
    const v11, 0x30d80

    .line 407
    .line 408
    .line 409
    const/16 v12, 0x12

    .line 410
    .line 411
    move/from16 v16, v5

    .line 412
    .line 413
    const/4 v5, 0x0

    .line 414
    move-object/from16 v17, v8

    .line 415
    .line 416
    const/4 v8, 0x0

    .line 417
    move/from16 v2, v16

    .line 418
    .line 419
    move-object/from16 v3, v17

    .line 420
    .line 421
    invoke-static/range {v4 .. v12}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Alignment$Companion;->getCenterEnd()Landroidx/compose/ui/Alignment;

    .line 425
    .line 426
    .line 427
    move-result-object v5

    .line 428
    invoke-interface {v13, v15, v5}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    const/16 v6, 0xdc

    .line 433
    .line 434
    const/4 v12, 0x0

    .line 435
    invoke-static {v6, v12, v3, v2, v3}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 444
    .line 445
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v9

    .line 449
    if-ne v8, v9, :cond_f

    .line 450
    .line 451
    new-instance v8, Lcom/zykj/mistake/feature/collection/component/j;

    .line 452
    .line 453
    const/4 v9, 0x1

    .line 454
    invoke-direct {v8, v9}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 455
    .line 456
    .line 457
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    :cond_f
    check-cast v8, Lr6/c;

    .line 461
    .line 462
    invoke-static {v7, v8}, Landroidx/compose/animation/EnterExitTransitionKt;->slideInHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/EnterTransition;

    .line 463
    .line 464
    .line 465
    move-result-object v7

    .line 466
    const/4 v13, 0x0

    .line 467
    invoke-static {v6, v13, v3, v2, v3}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    if-ne v3, v6, :cond_10

    .line 480
    .line 481
    new-instance v3, Lcom/zykj/mistake/feature/collection/component/j;

    .line 482
    .line 483
    const/4 v6, 0x1

    .line 484
    invoke-direct {v3, v6}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 485
    .line 486
    .line 487
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    :cond_10
    check-cast v3, Lr6/c;

    .line 491
    .line 492
    invoke-static {v2, v3}, Landroidx/compose/animation/EnterExitTransitionKt;->slideOutHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/ExitTransition;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    new-instance v3, Landroidx/navigation/serialization/c;

    .line 497
    .line 498
    const/4 v6, 0x1

    .line 499
    invoke-direct {v3, v6, v0, v1}, Landroidx/navigation/serialization/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    const v6, -0x4619d991

    .line 503
    .line 504
    .line 505
    const/16 v8, 0x36

    .line 506
    .line 507
    const/4 v15, 0x1

    .line 508
    invoke-static {v6, v15, v3, v10, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 509
    .line 510
    .line 511
    move-result-object v9

    .line 512
    const v11, 0x30d80

    .line 513
    .line 514
    .line 515
    const/16 v12, 0x10

    .line 516
    .line 517
    const/4 v8, 0x0

    .line 518
    move-object v6, v7

    .line 519
    move-object v7, v2

    .line 520
    invoke-static/range {v4 .. v12}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 521
    .line 522
    .line 523
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 524
    .line 525
    .line 526
    iget-boolean v2, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->C:Z

    .line 527
    .line 528
    const v3, -0x71855bf8

    .line 529
    .line 530
    .line 531
    if-eqz v2, :cond_1a

    .line 532
    .line 533
    const v2, -0x710b1615

    .line 534
    .line 535
    .line 536
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 537
    .line 538
    .line 539
    iget-object v5, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->D:Ljava/lang/String;

    .line 540
    .line 541
    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->E:Ljava/lang/String;

    .line 542
    .line 543
    iget-boolean v9, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->F:Z

    .line 544
    .line 545
    const/16 v2, 0x20

    .line 546
    .line 547
    if-ne v14, v2, :cond_11

    .line 548
    .line 549
    move v12, v15

    .line 550
    goto :goto_7

    .line 551
    :cond_11
    move v12, v13

    .line 552
    :goto_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    if-nez v12, :cond_12

    .line 557
    .line 558
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    if-ne v2, v4, :cond_13

    .line 563
    .line 564
    :cond_12
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/a1;

    .line 565
    .line 566
    const/4 v4, 0x7

    .line 567
    invoke-direct {v2, v1, v4}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 568
    .line 569
    .line 570
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    :cond_13
    check-cast v2, Lr6/c;

    .line 574
    .line 575
    const/16 v4, 0x20

    .line 576
    .line 577
    if-ne v14, v4, :cond_14

    .line 578
    .line 579
    move v12, v15

    .line 580
    goto :goto_8

    .line 581
    :cond_14
    move v12, v13

    .line 582
    :goto_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    if-nez v12, :cond_15

    .line 587
    .line 588
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v7

    .line 592
    if-ne v4, v7, :cond_16

    .line 593
    .line 594
    :cond_15
    new-instance v4, Lcom/zykj/mistake/feature/ask/h0;

    .line 595
    .line 596
    const/16 v7, 0x12

    .line 597
    .line 598
    invoke-direct {v4, v1, v7}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 599
    .line 600
    .line 601
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    :cond_16
    check-cast v4, Lr6/a;

    .line 605
    .line 606
    const/16 v7, 0x20

    .line 607
    .line 608
    if-ne v14, v7, :cond_17

    .line 609
    .line 610
    move v12, v15

    .line 611
    goto :goto_9

    .line 612
    :cond_17
    move v12, v13

    .line 613
    :goto_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v8

    .line 617
    if-nez v12, :cond_18

    .line 618
    .line 619
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v11

    .line 623
    if-ne v8, v11, :cond_19

    .line 624
    .line 625
    :cond_18
    new-instance v8, Lcom/zykj/mistake/feature/ask/h0;

    .line 626
    .line 627
    const/16 v11, 0x13

    .line 628
    .line 629
    invoke-direct {v8, v1, v11}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 630
    .line 631
    .line 632
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    :cond_19
    move-object/from16 v16, v8

    .line 636
    .line 637
    check-cast v16, Lr6/a;

    .line 638
    .line 639
    const/16 v19, 0x0

    .line 640
    .line 641
    const/16 v20, 0x3c0

    .line 642
    .line 643
    move/from16 v24, v15

    .line 644
    .line 645
    move-object v15, v4

    .line 646
    const-string v4, "\u7f16\u8f91\u9519\u9898\u96c6\u540d\u79f0"

    .line 647
    .line 648
    move v8, v7

    .line 649
    const-string v7, "\u786e\u8ba4"

    .line 650
    .line 651
    move v11, v8

    .line 652
    const-string v8, "\u786e\u8ba4\u4e2d..."

    .line 653
    .line 654
    move-object/from16 v17, v10

    .line 655
    .line 656
    const/4 v10, 0x0

    .line 657
    move v12, v11

    .line 658
    const/4 v11, 0x0

    .line 659
    move/from16 v18, v12

    .line 660
    .line 661
    const/4 v12, 0x0

    .line 662
    move/from16 v23, v13

    .line 663
    .line 664
    const/4 v13, 0x0

    .line 665
    move/from16 v22, v18

    .line 666
    .line 667
    const/16 v18, 0x6c06

    .line 668
    .line 669
    move/from16 v25, v14

    .line 670
    .line 671
    move-object v14, v2

    .line 672
    move/from16 v2, v25

    .line 673
    .line 674
    invoke-static/range {v4 .. v20}, Lcom/zykj/mistake/feature/collection/component/f;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;III)V

    .line 675
    .line 676
    .line 677
    move-object/from16 v10, v17

    .line 678
    .line 679
    :goto_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 680
    .line 681
    .line 682
    goto :goto_b

    .line 683
    :cond_1a
    move/from16 v23, v13

    .line 684
    .line 685
    move v2, v14

    .line 686
    move/from16 v24, v15

    .line 687
    .line 688
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 689
    .line 690
    .line 691
    goto :goto_a

    .line 692
    :goto_b
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->J:Z

    .line 693
    .line 694
    if-eqz v4, :cond_21

    .line 695
    .line 696
    const v3, -0x7101ea13

    .line 697
    .line 698
    .line 699
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 700
    .line 701
    .line 702
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 703
    .line 704
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 705
    .line 706
    .line 707
    move-result v4

    .line 708
    iget-boolean v5, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    .line 709
    .line 710
    const/16 v12, 0x20

    .line 711
    .line 712
    if-ne v2, v12, :cond_1b

    .line 713
    .line 714
    move/from16 v14, v24

    .line 715
    .line 716
    goto :goto_c

    .line 717
    :cond_1b
    move/from16 v14, v23

    .line 718
    .line 719
    :goto_c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v3

    .line 723
    if-nez v14, :cond_1c

    .line 724
    .line 725
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v6

    .line 729
    if-ne v3, v6, :cond_1d

    .line 730
    .line 731
    :cond_1c
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    .line 732
    .line 733
    const/16 v6, 0x14

    .line 734
    .line 735
    invoke-direct {v3, v1, v6}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 736
    .line 737
    .line 738
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    :cond_1d
    move-object v6, v3

    .line 742
    check-cast v6, Lr6/a;

    .line 743
    .line 744
    if-ne v2, v12, :cond_1e

    .line 745
    .line 746
    move/from16 v14, v24

    .line 747
    .line 748
    goto :goto_d

    .line 749
    :cond_1e
    move/from16 v14, v23

    .line 750
    .line 751
    :goto_d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    if-nez v14, :cond_1f

    .line 756
    .line 757
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v3

    .line 761
    if-ne v2, v3, :cond_20

    .line 762
    .line 763
    :cond_1f
    new-instance v2, Lcom/zykj/mistake/feature/ask/h0;

    .line 764
    .line 765
    const/16 v3, 0x15

    .line 766
    .line 767
    invoke-direct {v2, v1, v3}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 768
    .line 769
    .line 770
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    :cond_20
    move-object v7, v2

    .line 774
    check-cast v7, Lr6/a;

    .line 775
    .line 776
    const/4 v9, 0x0

    .line 777
    move-object v8, v10

    .line 778
    invoke-static/range {v4 .. v9}, Lcom/zykj/mistake/feature/collection/detail/f1;->e(IZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 779
    .line 780
    .line 781
    :goto_e
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 782
    .line 783
    .line 784
    goto :goto_f

    .line 785
    :cond_21
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 786
    .line 787
    .line 788
    goto :goto_e

    .line 789
    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 790
    .line 791
    .line 792
    move-result v2

    .line 793
    if-eqz v2, :cond_23

    .line 794
    .line 795
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 796
    .line 797
    .line 798
    goto :goto_10

    .line 799
    :cond_22
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 800
    .line 801
    .line 802
    :cond_23
    :goto_10
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    if-eqz v2, :cond_24

    .line 807
    .line 808
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/d1;

    .line 809
    .line 810
    const/4 v4, 0x1

    .line 811
    move/from16 v5, p3

    .line 812
    .line 813
    invoke-direct {v3, v0, v1, v5, v4}, Lcom/zykj/mistake/feature/collection/detail/d1;-><init>(Lcom/zykj/mistake/feature/collection/detail/z0;Lr6/c;II)V

    .line 814
    .line 815
    .line 816
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 817
    .line 818
    .line 819
    :cond_24
    return-void
.end method

.method public static final d(Lcom/zykj/mistake/feature/collection/detail/z0;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 69

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v3, -0xf43a0f7

    .line 6
    .line 7
    .line 8
    move-object/from16 v4, p2

    .line 9
    .line 10
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v9

    .line 14
    and-int/lit8 v4, p3, 0x6

    .line 15
    .line 16
    if-nez v4, :cond_1

    .line 17
    .line 18
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v4, 0x2

    .line 27
    :goto_0
    or-int v4, p3, v4

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move/from16 v4, p3

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v5, p3, 0x30

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
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    and-int/lit8 v10, v4, 0x1

    .line 62
    .line 63
    invoke-interface {v9, v5, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_3a

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
    const-string v10, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailTitleBar (MistakeCollectionDetailScreen.kt:195)"

    .line 77
    .line 78
    invoke-static {v3, v4, v5, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v10, 0x0

    .line 85
    invoke-static {v3, v5, v7, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const/16 v11, 0x2c

    .line 90
    .line 91
    int-to-float v11, v11

    .line 92
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 93
    .line 94
    .line 95
    move-result v12

    .line 96
    invoke-static {v5, v12}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

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
    move-result-object v12

    .line 137
    sget-object v16, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 138
    .line 139
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    sget-object v17, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 144
    .line 145
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    move/from16 v18, v14

    .line 150
    .line 151
    const/16 v14, 0x30

    .line 152
    .line 153
    invoke-static {v6, v13, v9, v14}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-static {v9, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    invoke-static {v9, v12}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 166
    .line 167
    .line 168
    move-result-object v12

    .line 169
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 170
    .line 171
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 176
    .line 177
    .line 178
    move-result-object v22

    .line 179
    if-nez v22, :cond_6

    .line 180
    .line 181
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 182
    .line 183
    .line 184
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 185
    .line 186
    .line 187
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 188
    .line 189
    .line 190
    move-result v22

    .line 191
    if-eqz v22, :cond_7

    .line 192
    .line 193
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 198
    .line 199
    .line 200
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-static {v14, v10, v6, v10, v7}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-nez v7, :cond_8

    .line 213
    .line 214
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-nez v7, :cond_9

    .line 227
    .line 228
    :cond_8
    invoke-static {v13, v10, v13, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 229
    .line 230
    .line 231
    :cond_9
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-static {v10, v12, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 236
    .line 237
    .line 238
    sget-object v30, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 239
    .line 240
    const/16 v6, 0x1c

    .line 241
    .line 242
    int-to-float v6, v6

    .line 243
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 248
    .line 249
    .line 250
    move-result-object v23

    .line 251
    and-int/lit8 v4, v4, 0x70

    .line 252
    .line 253
    if-ne v4, v15, :cond_a

    .line 254
    .line 255
    const/4 v6, 0x1

    .line 256
    goto :goto_5

    .line 257
    :cond_a
    const/4 v6, 0x0

    .line 258
    :goto_5
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    const/16 v8, 0x8

    .line 263
    .line 264
    if-nez v6, :cond_b

    .line 265
    .line 266
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 267
    .line 268
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    if-ne v7, v6, :cond_c

    .line 273
    .line 274
    :cond_b
    new-instance v7, Lcom/zykj/mistake/feature/ask/h0;

    .line 275
    .line 276
    invoke-direct {v7, v1, v8}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_c
    move-object/from16 v27, v7

    .line 283
    .line 284
    check-cast v27, Lr6/a;

    .line 285
    .line 286
    const/16 v28, 0x7

    .line 287
    .line 288
    const/16 v29, 0x0

    .line 289
    .line 290
    const/16 v24, 0x0

    .line 291
    .line 292
    const/16 v25, 0x0

    .line 293
    .line 294
    const/16 v26, 0x0

    .line 295
    .line 296
    invoke-static/range {v23 .. v29}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    const/4 v10, 0x0

    .line 305
    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    invoke-static {v9, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    invoke-static {v9, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 322
    .line 323
    .line 324
    move-result-object v13

    .line 325
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 326
    .line 327
    .line 328
    move-result-object v23

    .line 329
    if-nez v23, :cond_d

    .line 330
    .line 331
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 332
    .line 333
    .line 334
    :cond_d
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 335
    .line 336
    .line 337
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 338
    .line 339
    .line 340
    move-result v23

    .line 341
    if-eqz v23, :cond_e

    .line 342
    .line 343
    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 344
    .line 345
    .line 346
    goto :goto_6

    .line 347
    :cond_e
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 348
    .line 349
    .line 350
    :goto_6
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 351
    .line 352
    .line 353
    move-result-object v13

    .line 354
    invoke-static {v14, v13, v7, v13, v10}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 359
    .line 360
    .line 361
    move-result v10

    .line 362
    if-nez v10, :cond_f

    .line 363
    .line 364
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    if-nez v8, :cond_10

    .line 377
    .line 378
    :cond_f
    invoke-static {v12, v13, v12, v7}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 379
    .line 380
    .line 381
    :cond_10
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-static {v13, v6, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 386
    .line 387
    .line 388
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 389
    .line 390
    sget v6, Lcom/zykj/mistake/R$drawable;->ic_black_back:I

    .line 391
    .line 392
    const/4 v10, 0x0

    .line 393
    invoke-static {v6, v9, v10}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 398
    .line 399
    .line 400
    move-result v5

    .line 401
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    const/16 v12, 0x1b0

    .line 406
    .line 407
    const/16 v13, 0x78

    .line 408
    .line 409
    move v7, v4

    .line 410
    move-object v4, v6

    .line 411
    move-object v6, v5

    .line 412
    const-string v5, "\u8fd4\u56de"

    .line 413
    .line 414
    move v8, v7

    .line 415
    const/4 v7, 0x0

    .line 416
    move/from16 v22, v8

    .line 417
    .line 418
    const/4 v8, 0x0

    .line 419
    move-object/from16 v25, v9

    .line 420
    .line 421
    const/4 v9, 0x0

    .line 422
    move/from16 v24, v10

    .line 423
    .line 424
    const/4 v10, 0x0

    .line 425
    move/from16 v19, v11

    .line 426
    .line 427
    move/from16 v32, v22

    .line 428
    .line 429
    move/from16 v15, v24

    .line 430
    .line 431
    move-object/from16 v11, v25

    .line 432
    .line 433
    invoke-static/range {v4 .. v13}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 434
    .line 435
    .line 436
    move-object v9, v11

    .line 437
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 438
    .line 439
    .line 440
    new-instance v34, Landroidx/compose/ui/text/TextStyle;

    .line 441
    .line 442
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 443
    .line 444
    .line 445
    move-result-wide v37

    .line 446
    new-instance v4, Landroidx/compose/ui/text/PlatformTextStyle;

    .line 447
    .line 448
    invoke-direct {v4, v15}, Landroidx/compose/ui/text/PlatformTextStyle;-><init>(Z)V

    .line 449
    .line 450
    .line 451
    const v64, 0xf7fffd

    .line 452
    .line 453
    .line 454
    const/16 v65, 0x0

    .line 455
    .line 456
    const-wide/16 v35, 0x0

    .line 457
    .line 458
    const/16 v39, 0x0

    .line 459
    .line 460
    const/16 v40, 0x0

    .line 461
    .line 462
    const/16 v41, 0x0

    .line 463
    .line 464
    const/16 v42, 0x0

    .line 465
    .line 466
    const/16 v43, 0x0

    .line 467
    .line 468
    const-wide/16 v44, 0x0

    .line 469
    .line 470
    const/16 v46, 0x0

    .line 471
    .line 472
    const/16 v47, 0x0

    .line 473
    .line 474
    const/16 v48, 0x0

    .line 475
    .line 476
    const-wide/16 v49, 0x0

    .line 477
    .line 478
    const/16 v51, 0x0

    .line 479
    .line 480
    const/16 v52, 0x0

    .line 481
    .line 482
    const/16 v53, 0x0

    .line 483
    .line 484
    const/16 v54, 0x0

    .line 485
    .line 486
    const/16 v55, 0x0

    .line 487
    .line 488
    const-wide/16 v56, 0x0

    .line 489
    .line 490
    const/16 v58, 0x0

    .line 491
    .line 492
    const/16 v60, 0x0

    .line 493
    .line 494
    const/16 v61, 0x0

    .line 495
    .line 496
    const/16 v62, 0x0

    .line 497
    .line 498
    const/16 v63, 0x0

    .line 499
    .line 500
    move-object/from16 v59, v4

    .line 501
    .line 502
    invoke-direct/range {v34 .. v65}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    .line 503
    .line 504
    .line 505
    new-instance v35, Landroidx/compose/ui/text/TextStyle;

    .line 506
    .line 507
    const/16 v4, 0xd

    .line 508
    .line 509
    invoke-static {v4}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 510
    .line 511
    .line 512
    move-result-wide v38

    .line 513
    new-instance v5, Landroidx/compose/ui/text/PlatformTextStyle;

    .line 514
    .line 515
    invoke-direct {v5, v15}, Landroidx/compose/ui/text/PlatformTextStyle;-><init>(Z)V

    .line 516
    .line 517
    .line 518
    const v65, 0xf7fffd

    .line 519
    .line 520
    .line 521
    const/16 v66, 0x0

    .line 522
    .line 523
    const-wide/16 v36, 0x0

    .line 524
    .line 525
    const/16 v44, 0x0

    .line 526
    .line 527
    const-wide/16 v45, 0x0

    .line 528
    .line 529
    const/16 v49, 0x0

    .line 530
    .line 531
    const-wide/16 v50, 0x0

    .line 532
    .line 533
    const/16 v54, 0x0

    .line 534
    .line 535
    const/16 v56, 0x0

    .line 536
    .line 537
    const-wide/16 v57, 0x0

    .line 538
    .line 539
    const/16 v59, 0x0

    .line 540
    .line 541
    const/16 v61, 0x0

    .line 542
    .line 543
    const/16 v63, 0x0

    .line 544
    .line 545
    const/16 v64, 0x0

    .line 546
    .line 547
    move-object/from16 v60, v5

    .line 548
    .line 549
    invoke-direct/range {v35 .. v66}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    .line 550
    .line 551
    .line 552
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 553
    .line 554
    .line 555
    move-result v5

    .line 556
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 557
    .line 558
    .line 559
    move-result-object v5

    .line 560
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 561
    .line 562
    .line 563
    move-result-object v6

    .line 564
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 565
    .line 566
    .line 567
    move-result-object v7

    .line 568
    const/16 v8, 0x30

    .line 569
    .line 570
    invoke-static {v7, v6, v9, v8}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 571
    .line 572
    .line 573
    move-result-object v6

    .line 574
    invoke-static {v9, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 575
    .line 576
    .line 577
    move-result v7

    .line 578
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 579
    .line 580
    .line 581
    move-result-object v8

    .line 582
    invoke-static {v9, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 587
    .line 588
    .line 589
    move-result-object v10

    .line 590
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 591
    .line 592
    .line 593
    move-result-object v11

    .line 594
    if-nez v11, :cond_11

    .line 595
    .line 596
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 597
    .line 598
    .line 599
    :cond_11
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 600
    .line 601
    .line 602
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 603
    .line 604
    .line 605
    move-result v11

    .line 606
    if-eqz v11, :cond_12

    .line 607
    .line 608
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 609
    .line 610
    .line 611
    goto :goto_7

    .line 612
    :cond_12
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 613
    .line 614
    .line 615
    :goto_7
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 616
    .line 617
    .line 618
    move-result-object v10

    .line 619
    invoke-static {v14, v10, v6, v10, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 620
    .line 621
    .line 622
    move-result-object v6

    .line 623
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 624
    .line 625
    .line 626
    move-result v8

    .line 627
    if-nez v8, :cond_13

    .line 628
    .line 629
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 634
    .line 635
    .line 636
    move-result-object v11

    .line 637
    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v8

    .line 641
    if-nez v8, :cond_14

    .line 642
    .line 643
    :cond_13
    invoke-static {v7, v10, v7, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 644
    .line 645
    .line 646
    :cond_14
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 647
    .line 648
    .line 649
    move-result-object v6

    .line 650
    invoke-static {v10, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 651
    .line 652
    .line 653
    move v5, v4

    .line 654
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->b:Ljava/lang/String;

    .line 655
    .line 656
    iget-object v6, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->H:Ljava/util/Set;

    .line 657
    .line 658
    iget-object v7, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->d:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 659
    .line 660
    iget v8, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->c:I

    .line 661
    .line 662
    iget-boolean v10, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->I:Z

    .line 663
    .line 664
    iget-boolean v11, v0, Lcom/zykj/mistake/feature/collection/detail/z0;->G:Z

    .line 665
    .line 666
    const-wide v36, 0xff15171aL

    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    move-object v12, v6

    .line 672
    move-object v13, v7

    .line 673
    invoke-static/range {v36 .. v37}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 674
    .line 675
    .line 676
    move-result-wide v6

    .line 677
    const/16 v27, 0xc00

    .line 678
    .line 679
    const v28, 0xdffa

    .line 680
    .line 681
    .line 682
    move v14, v5

    .line 683
    const/4 v5, 0x0

    .line 684
    move/from16 v16, v8

    .line 685
    .line 686
    move-object/from16 v25, v9

    .line 687
    .line 688
    const-wide/16 v8, 0x0

    .line 689
    .line 690
    move/from16 v17, v10

    .line 691
    .line 692
    const/4 v10, 0x0

    .line 693
    move/from16 v18, v11

    .line 694
    .line 695
    const/4 v11, 0x0

    .line 696
    move-object/from16 v19, v12

    .line 697
    .line 698
    const/4 v12, 0x0

    .line 699
    move-object/from16 v20, v13

    .line 700
    .line 701
    move/from16 v21, v14

    .line 702
    .line 703
    const-wide/16 v13, 0x0

    .line 704
    .line 705
    move/from16 v22, v15

    .line 706
    .line 707
    const/4 v15, 0x0

    .line 708
    move/from16 v23, v16

    .line 709
    .line 710
    const/16 v16, 0x0

    .line 711
    .line 712
    move/from16 v24, v17

    .line 713
    .line 714
    move/from16 v26, v18

    .line 715
    .line 716
    const-wide/16 v17, 0x0

    .line 717
    .line 718
    move-object/from16 v29, v19

    .line 719
    .line 720
    const/16 v19, 0x0

    .line 721
    .line 722
    move-object/from16 v38, v20

    .line 723
    .line 724
    const/16 v20, 0x0

    .line 725
    .line 726
    move/from16 v39, v21

    .line 727
    .line 728
    const/16 v21, 0x1

    .line 729
    .line 730
    move/from16 v40, v22

    .line 731
    .line 732
    const/16 v22, 0x0

    .line 733
    .line 734
    move/from16 v41, v23

    .line 735
    .line 736
    const/16 v23, 0x0

    .line 737
    .line 738
    move/from16 v42, v26

    .line 739
    .line 740
    const/16 v26, 0x180

    .line 741
    .line 742
    move-object/from16 p2, v3

    .line 743
    .line 744
    move-object/from16 v3, v38

    .line 745
    .line 746
    move/from16 v0, v40

    .line 747
    .line 748
    move/from16 v2, v41

    .line 749
    .line 750
    move/from16 v38, v24

    .line 751
    .line 752
    move-object/from16 v24, v34

    .line 753
    .line 754
    move-object/from16 v34, v29

    .line 755
    .line 756
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 757
    .line 758
    .line 759
    move-object/from16 v9, v25

    .line 760
    .line 761
    const/4 v4, 0x6

    .line 762
    if-eqz v42, :cond_16

    .line 763
    .line 764
    const v5, -0x68fe66bd

    .line 765
    .line 766
    .line 767
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 768
    .line 769
    .line 770
    move-object/from16 v6, v34

    .line 771
    .line 772
    check-cast v6, Ljava/util/Collection;

    .line 773
    .line 774
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 775
    .line 776
    .line 777
    move-result v5

    .line 778
    if-nez v5, :cond_15

    .line 779
    .line 780
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 781
    .line 782
    const/4 v6, 0x0

    .line 783
    const/4 v7, 0x1

    .line 784
    invoke-direct {v5, v0, v7, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 785
    .line 786
    .line 787
    const-string v6, " \u5df2\u9009\u62e9 "

    .line 788
    .line 789
    invoke-virtual {v5, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    new-instance v43, Landroidx/compose/ui/text/SpanStyle;

    .line 793
    .line 794
    invoke-static/range {v36 .. v37}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 795
    .line 796
    .line 797
    move-result-wide v44

    .line 798
    const v64, 0xfffe

    .line 799
    .line 800
    .line 801
    const/16 v65, 0x0

    .line 802
    .line 803
    const-wide/16 v46, 0x0

    .line 804
    .line 805
    const/16 v48, 0x0

    .line 806
    .line 807
    const/16 v49, 0x0

    .line 808
    .line 809
    const/16 v50, 0x0

    .line 810
    .line 811
    const/16 v51, 0x0

    .line 812
    .line 813
    const/16 v52, 0x0

    .line 814
    .line 815
    const-wide/16 v53, 0x0

    .line 816
    .line 817
    const/16 v55, 0x0

    .line 818
    .line 819
    const/16 v56, 0x0

    .line 820
    .line 821
    const/16 v57, 0x0

    .line 822
    .line 823
    const-wide/16 v58, 0x0

    .line 824
    .line 825
    const/16 v60, 0x0

    .line 826
    .line 827
    const/16 v61, 0x0

    .line 828
    .line 829
    const/16 v62, 0x0

    .line 830
    .line 831
    const/16 v63, 0x0

    .line 832
    .line 833
    invoke-direct/range {v43 .. v65}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 834
    .line 835
    .line 836
    move-object/from16 v6, v43

    .line 837
    .line 838
    invoke-virtual {v5, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 839
    .line 840
    .line 841
    move-result v6

    .line 842
    :try_start_0
    invoke-interface/range {v34 .. v34}, Ljava/util/Set;->size()I

    .line 843
    .line 844
    .line 845
    move-result v8

    .line 846
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v8

    .line 850
    invoke-virtual {v5, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 851
    .line 852
    .line 853
    invoke-virtual {v5, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 854
    .line 855
    .line 856
    const-string v6, " \u9053"

    .line 857
    .line 858
    invoke-virtual {v5, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 862
    .line 863
    .line 864
    move-result-object v5

    .line 865
    goto :goto_8

    .line 866
    :catchall_0
    move-exception v0

    .line 867
    invoke-virtual {v5, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 868
    .line 869
    .line 870
    throw v0

    .line 871
    :cond_15
    const/4 v6, 0x0

    .line 872
    const/4 v7, 0x1

    .line 873
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 874
    .line 875
    invoke-direct {v5, v0, v7, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 876
    .line 877
    .line 878
    const-string v6, " \u672a\u9009\u62e9"

    .line 879
    .line 880
    invoke-virtual {v5, v6}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 884
    .line 885
    .line 886
    move-result-object v5

    .line 887
    :goto_8
    const-wide v10, 0xff999999L

    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 893
    .line 894
    .line 895
    move-result-wide v10

    .line 896
    const/16 v6, 0x8

    .line 897
    .line 898
    int-to-float v6, v6

    .line 899
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 900
    .line 901
    .line 902
    move-result v17

    .line 903
    const/16 v21, 0xe

    .line 904
    .line 905
    const/16 v22, 0x0

    .line 906
    .line 907
    const/16 v18, 0x0

    .line 908
    .line 909
    const/16 v19, 0x0

    .line 910
    .line 911
    const/16 v20, 0x0

    .line 912
    .line 913
    move-object/from16 v16, p2

    .line 914
    .line 915
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 916
    .line 917
    .line 918
    move-result-object v6

    .line 919
    move-object/from16 v31, v16

    .line 920
    .line 921
    const/16 v28, 0x0

    .line 922
    .line 923
    const v29, 0x1fff8

    .line 924
    .line 925
    .line 926
    move-object/from16 v25, v9

    .line 927
    .line 928
    const-wide/16 v8, 0x0

    .line 929
    .line 930
    move/from16 v19, v7

    .line 931
    .line 932
    move-wide/from16 v67, v10

    .line 933
    .line 934
    move v11, v4

    .line 935
    move-object v4, v5

    .line 936
    move-object v5, v6

    .line 937
    move-wide/from16 v6, v67

    .line 938
    .line 939
    const/4 v10, 0x0

    .line 940
    move v12, v11

    .line 941
    const/4 v11, 0x0

    .line 942
    move v13, v12

    .line 943
    const/4 v12, 0x0

    .line 944
    move v15, v13

    .line 945
    const-wide/16 v13, 0x0

    .line 946
    .line 947
    move/from16 v16, v15

    .line 948
    .line 949
    const/4 v15, 0x0

    .line 950
    move/from16 v17, v16

    .line 951
    .line 952
    const/16 v16, 0x0

    .line 953
    .line 954
    move/from16 v20, v17

    .line 955
    .line 956
    const-wide/16 v17, 0x0

    .line 957
    .line 958
    move/from16 v21, v19

    .line 959
    .line 960
    const/16 v19, 0x0

    .line 961
    .line 962
    move/from16 v22, v20

    .line 963
    .line 964
    const/16 v20, 0x0

    .line 965
    .line 966
    move/from16 v23, v21

    .line 967
    .line 968
    const/16 v21, 0x0

    .line 969
    .line 970
    move/from16 v24, v22

    .line 971
    .line 972
    const/16 v22, 0x0

    .line 973
    .line 974
    move/from16 v26, v23

    .line 975
    .line 976
    const/16 v23, 0x0

    .line 977
    .line 978
    move/from16 v27, v24

    .line 979
    .line 980
    const/16 v24, 0x0

    .line 981
    .line 982
    move/from16 v33, v27

    .line 983
    .line 984
    const/16 v27, 0x1b0

    .line 985
    .line 986
    move/from16 v0, v33

    .line 987
    .line 988
    move/from16 v33, v26

    .line 989
    .line 990
    move-object/from16 v26, v25

    .line 991
    .line 992
    move-object/from16 v25, v35

    .line 993
    .line 994
    invoke-static/range {v4 .. v29}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 995
    .line 996
    .line 997
    move-object/from16 v9, v26

    .line 998
    .line 999
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1000
    .line 1001
    .line 1002
    goto :goto_9

    .line 1003
    :cond_16
    move-object/from16 v31, p2

    .line 1004
    .line 1005
    move v0, v4

    .line 1006
    const/16 v33, 0x1

    .line 1007
    .line 1008
    const v4, -0x68f3a628

    .line 1009
    .line 1010
    .line 1011
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1012
    .line 1013
    .line 1014
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    const-string v5, "\uff08 "

    .line 1017
    .line 1018
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    const-string v5, "/100\uff09"

    .line 1025
    .line 1026
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v4

    .line 1033
    invoke-static/range {v36 .. v37}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1034
    .line 1035
    .line 1036
    move-result-wide v6

    .line 1037
    int-to-float v5, v0

    .line 1038
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1039
    .line 1040
    .line 1041
    move-result v17

    .line 1042
    const/16 v21, 0xe

    .line 1043
    .line 1044
    const/16 v22, 0x0

    .line 1045
    .line 1046
    const/16 v18, 0x0

    .line 1047
    .line 1048
    const/16 v19, 0x0

    .line 1049
    .line 1050
    const/16 v20, 0x0

    .line 1051
    .line 1052
    move-object/from16 v16, v31

    .line 1053
    .line 1054
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v5

    .line 1058
    const/16 v27, 0x0

    .line 1059
    .line 1060
    const v28, 0xfff8

    .line 1061
    .line 1062
    .line 1063
    move-object/from16 v25, v9

    .line 1064
    .line 1065
    const-wide/16 v8, 0x0

    .line 1066
    .line 1067
    const/4 v10, 0x0

    .line 1068
    const/4 v11, 0x0

    .line 1069
    const/4 v12, 0x0

    .line 1070
    const-wide/16 v13, 0x0

    .line 1071
    .line 1072
    const/4 v15, 0x0

    .line 1073
    const/16 v16, 0x0

    .line 1074
    .line 1075
    const-wide/16 v17, 0x0

    .line 1076
    .line 1077
    const/16 v19, 0x0

    .line 1078
    .line 1079
    const/16 v20, 0x0

    .line 1080
    .line 1081
    const/16 v21, 0x0

    .line 1082
    .line 1083
    const/16 v22, 0x0

    .line 1084
    .line 1085
    const/16 v23, 0x0

    .line 1086
    .line 1087
    const/16 v26, 0x1b0

    .line 1088
    .line 1089
    move-object/from16 v24, v35

    .line 1090
    .line 1091
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1092
    .line 1093
    .line 1094
    move-object/from16 v9, v25

    .line 1095
    .line 1096
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1097
    .line 1098
    .line 1099
    :goto_9
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1100
    .line 1101
    .line 1102
    sget-object v14, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->EXISTING:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 1103
    .line 1104
    const v15, -0x60622ccb

    .line 1105
    .line 1106
    .line 1107
    const/16 v4, 0xc

    .line 1108
    .line 1109
    if-ne v3, v14, :cond_1a

    .line 1110
    .line 1111
    if-nez v42, :cond_1a

    .line 1112
    .line 1113
    const v5, -0x5fb1bb9d

    .line 1114
    .line 1115
    .line 1116
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1117
    .line 1118
    .line 1119
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_black_edit:I

    .line 1120
    .line 1121
    const/4 v10, 0x0

    .line 1122
    invoke-static {v5, v9, v10}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v5

    .line 1126
    int-to-float v6, v4

    .line 1127
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1128
    .line 1129
    .line 1130
    move-result v17

    .line 1131
    const/16 v21, 0xe

    .line 1132
    .line 1133
    const/16 v22, 0x0

    .line 1134
    .line 1135
    const/16 v18, 0x0

    .line 1136
    .line 1137
    const/16 v19, 0x0

    .line 1138
    .line 1139
    const/16 v20, 0x0

    .line 1140
    .line 1141
    move-object/from16 v16, v31

    .line 1142
    .line 1143
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v6

    .line 1147
    const/16 v7, 0x12

    .line 1148
    .line 1149
    int-to-float v7, v7

    .line 1150
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1151
    .line 1152
    .line 1153
    move-result v7

    .line 1154
    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v17

    .line 1158
    move/from16 v6, v32

    .line 1159
    .line 1160
    const/16 v7, 0x20

    .line 1161
    .line 1162
    if-ne v6, v7, :cond_17

    .line 1163
    .line 1164
    move/from16 v7, v33

    .line 1165
    .line 1166
    goto :goto_a

    .line 1167
    :cond_17
    const/4 v7, 0x0

    .line 1168
    :goto_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v8

    .line 1172
    if-nez v7, :cond_18

    .line 1173
    .line 1174
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1175
    .line 1176
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v7

    .line 1180
    if-ne v8, v7, :cond_19

    .line 1181
    .line 1182
    :cond_18
    new-instance v8, Lcom/zykj/mistake/feature/ask/h0;

    .line 1183
    .line 1184
    const/16 v7, 0x9

    .line 1185
    .line 1186
    invoke-direct {v8, v1, v7}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 1187
    .line 1188
    .line 1189
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1190
    .line 1191
    .line 1192
    :cond_19
    move-object/from16 v21, v8

    .line 1193
    .line 1194
    check-cast v21, Lr6/a;

    .line 1195
    .line 1196
    const/16 v22, 0x7

    .line 1197
    .line 1198
    const/16 v23, 0x0

    .line 1199
    .line 1200
    const/16 v18, 0x0

    .line 1201
    .line 1202
    const/16 v19, 0x0

    .line 1203
    .line 1204
    const/16 v20, 0x0

    .line 1205
    .line 1206
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v7

    .line 1210
    const/16 v12, 0x30

    .line 1211
    .line 1212
    const/16 v13, 0x78

    .line 1213
    .line 1214
    move v8, v4

    .line 1215
    move-object v4, v5

    .line 1216
    const-string v5, "\u7f16\u8f91\u9519\u9898\u96c6"

    .line 1217
    .line 1218
    move/from16 v32, v6

    .line 1219
    .line 1220
    move-object v6, v7

    .line 1221
    const/4 v7, 0x0

    .line 1222
    move v10, v8

    .line 1223
    const/4 v8, 0x0

    .line 1224
    move-object/from16 v25, v9

    .line 1225
    .line 1226
    const/4 v9, 0x0

    .line 1227
    move v11, v10

    .line 1228
    const/4 v10, 0x0

    .line 1229
    move-object/from16 v11, v25

    .line 1230
    .line 1231
    move/from16 v0, v32

    .line 1232
    .line 1233
    invoke-static/range {v4 .. v13}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 1234
    .line 1235
    .line 1236
    move-object v9, v11

    .line 1237
    :goto_b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1238
    .line 1239
    .line 1240
    goto :goto_c

    .line 1241
    :cond_1a
    move-object/from16 v16, v31

    .line 1242
    .line 1243
    move/from16 v0, v32

    .line 1244
    .line 1245
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1246
    .line 1247
    .line 1248
    goto :goto_b

    .line 1249
    :goto_c
    const/16 v20, 0x2

    .line 1250
    .line 1251
    const/16 v21, 0x0

    .line 1252
    .line 1253
    const/high16 v18, 0x3f800000    # 1.0f

    .line 1254
    .line 1255
    const/16 v19, 0x0

    .line 1256
    .line 1257
    move-object/from16 v17, v16

    .line 1258
    .line 1259
    move-object/from16 v16, v30

    .line 1260
    .line 1261
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v4

    .line 1265
    move-object/from16 v12, v17

    .line 1266
    .line 1267
    const/4 v10, 0x0

    .line 1268
    invoke-static {v4, v9, v10}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1269
    .line 1270
    .line 1271
    sget-object v4, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;->CREATED:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$EntryMode;

    .line 1272
    .line 1273
    if-ne v3, v4, :cond_1e

    .line 1274
    .line 1275
    const v2, -0x5faa3bea

    .line 1276
    .line 1277
    .line 1278
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1279
    .line 1280
    .line 1281
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_new_mistake:I

    .line 1282
    .line 1283
    const/16 v7, 0x20

    .line 1284
    .line 1285
    if-ne v0, v7, :cond_1b

    .line 1286
    .line 1287
    move/from16 v7, v33

    .line 1288
    .line 1289
    goto :goto_d

    .line 1290
    :cond_1b
    const/4 v7, 0x0

    .line 1291
    :goto_d
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    if-nez v7, :cond_1c

    .line 1296
    .line 1297
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1298
    .line 1299
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v2

    .line 1303
    if-ne v0, v2, :cond_1d

    .line 1304
    .line 1305
    :cond_1c
    new-instance v0, Lcom/zykj/mistake/feature/ask/h0;

    .line 1306
    .line 1307
    const/16 v2, 0xa

    .line 1308
    .line 1309
    invoke-direct {v0, v1, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 1310
    .line 1311
    .line 1312
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1313
    .line 1314
    .line 1315
    :cond_1d
    move-object v8, v0

    .line 1316
    check-cast v8, Lr6/a;

    .line 1317
    .line 1318
    const/16 v10, 0x30

    .line 1319
    .line 1320
    const/16 v11, 0xc

    .line 1321
    .line 1322
    const-string v5, "\u52a0\u9898"

    .line 1323
    .line 1324
    const/4 v6, 0x0

    .line 1325
    const/4 v7, 0x0

    .line 1326
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1327
    .line 1328
    .line 1329
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1330
    .line 1331
    .line 1332
    move-object/from16 v2, p0

    .line 1333
    .line 1334
    goto/16 :goto_1f

    .line 1335
    .line 1336
    :cond_1e
    if-ne v3, v14, :cond_39

    .line 1337
    .line 1338
    const v3, -0x5fa4c5a5

    .line 1339
    .line 1340
    .line 1341
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1342
    .line 1343
    .line 1344
    const/high16 v3, 0x3f800000    # 1.0f

    .line 1345
    .line 1346
    if-eqz v42, :cond_28

    .line 1347
    .line 1348
    const v2, -0x5fa4cda3

    .line 1349
    .line 1350
    .line 1351
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1352
    .line 1353
    .line 1354
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_black_delete:I

    .line 1355
    .line 1356
    if-eqz v38, :cond_1f

    .line 1357
    .line 1358
    const-string v2, "\u5220\u9664\u4e2d..."

    .line 1359
    .line 1360
    :goto_e
    move-object v5, v2

    .line 1361
    goto :goto_f

    .line 1362
    :cond_1f
    const-string v2, "\u5220\u9664"

    .line 1363
    .line 1364
    goto :goto_e

    .line 1365
    :goto_f
    move-object/from16 v6, v34

    .line 1366
    .line 1367
    check-cast v6, Ljava/util/Collection;

    .line 1368
    .line 1369
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 1370
    .line 1371
    .line 1372
    move-result v2

    .line 1373
    if-nez v2, :cond_20

    .line 1374
    .line 1375
    if-nez v38, :cond_20

    .line 1376
    .line 1377
    :goto_10
    move v6, v3

    .line 1378
    goto :goto_11

    .line 1379
    :cond_20
    const v3, 0x3eb33333    # 0.35f

    .line 1380
    .line 1381
    .line 1382
    goto :goto_10

    .line 1383
    :goto_11
    move-object/from16 v2, v34

    .line 1384
    .line 1385
    check-cast v2, Ljava/util/Collection;

    .line 1386
    .line 1387
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1388
    .line 1389
    .line 1390
    move-result v2

    .line 1391
    if-nez v2, :cond_21

    .line 1392
    .line 1393
    if-nez v38, :cond_21

    .line 1394
    .line 1395
    move/from16 v7, v33

    .line 1396
    .line 1397
    :goto_12
    const/16 v2, 0x20

    .line 1398
    .line 1399
    goto :goto_13

    .line 1400
    :cond_21
    const/4 v7, 0x0

    .line 1401
    goto :goto_12

    .line 1402
    :goto_13
    if-ne v0, v2, :cond_22

    .line 1403
    .line 1404
    move/from16 v2, v33

    .line 1405
    .line 1406
    goto :goto_14

    .line 1407
    :cond_22
    const/4 v2, 0x0

    .line 1408
    :goto_14
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v3

    .line 1412
    if-nez v2, :cond_23

    .line 1413
    .line 1414
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1415
    .line 1416
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v2

    .line 1420
    if-ne v3, v2, :cond_24

    .line 1421
    .line 1422
    :cond_23
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    .line 1423
    .line 1424
    const/16 v2, 0xb

    .line 1425
    .line 1426
    invoke-direct {v3, v1, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 1427
    .line 1428
    .line 1429
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1430
    .line 1431
    .line 1432
    :cond_24
    move-object v8, v3

    .line 1433
    check-cast v8, Lr6/a;

    .line 1434
    .line 1435
    const/4 v10, 0x0

    .line 1436
    const/4 v11, 0x0

    .line 1437
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1438
    .line 1439
    .line 1440
    const/16 v13, 0xc

    .line 1441
    .line 1442
    int-to-float v2, v13

    .line 1443
    const/4 v15, 0x6

    .line 1444
    invoke-static {v2, v12, v9, v15}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 1445
    .line 1446
    .line 1447
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_mistake_cancel:I

    .line 1448
    .line 1449
    const/16 v7, 0x20

    .line 1450
    .line 1451
    if-ne v0, v7, :cond_25

    .line 1452
    .line 1453
    move/from16 v7, v33

    .line 1454
    .line 1455
    goto :goto_15

    .line 1456
    :cond_25
    const/4 v7, 0x0

    .line 1457
    :goto_15
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v0

    .line 1461
    if-nez v7, :cond_26

    .line 1462
    .line 1463
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1464
    .line 1465
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v2

    .line 1469
    if-ne v0, v2, :cond_27

    .line 1470
    .line 1471
    :cond_26
    new-instance v0, Lcom/zykj/mistake/feature/ask/h0;

    .line 1472
    .line 1473
    invoke-direct {v0, v1, v13}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 1474
    .line 1475
    .line 1476
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1477
    .line 1478
    .line 1479
    :cond_27
    move-object v8, v0

    .line 1480
    check-cast v8, Lr6/a;

    .line 1481
    .line 1482
    const/16 v10, 0x30

    .line 1483
    .line 1484
    const/16 v11, 0xc

    .line 1485
    .line 1486
    const-string v5, "\u53d6\u6d88"

    .line 1487
    .line 1488
    const/4 v6, 0x0

    .line 1489
    const/4 v7, 0x0

    .line 1490
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1491
    .line 1492
    .line 1493
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1494
    .line 1495
    .line 1496
    move-object/from16 v2, p0

    .line 1497
    .line 1498
    goto/16 :goto_1e

    .line 1499
    .line 1500
    :cond_28
    const/16 v13, 0xc

    .line 1501
    .line 1502
    if-gtz v2, :cond_2d

    .line 1503
    .line 1504
    move-object/from16 v2, p0

    .line 1505
    .line 1506
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->g:Ljava/util/List;

    .line 1507
    .line 1508
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1509
    .line 1510
    .line 1511
    move-result v4

    .line 1512
    if-nez v4, :cond_29

    .line 1513
    .line 1514
    goto :goto_17

    .line 1515
    :cond_29
    const v3, -0x5f991682

    .line 1516
    .line 1517
    .line 1518
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1519
    .line 1520
    .line 1521
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_new_mistake:I

    .line 1522
    .line 1523
    const/16 v7, 0x20

    .line 1524
    .line 1525
    if-ne v0, v7, :cond_2a

    .line 1526
    .line 1527
    move/from16 v7, v33

    .line 1528
    .line 1529
    goto :goto_16

    .line 1530
    :cond_2a
    const/4 v7, 0x0

    .line 1531
    :goto_16
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v0

    .line 1535
    if-nez v7, :cond_2b

    .line 1536
    .line 1537
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1538
    .line 1539
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v3

    .line 1543
    if-ne v0, v3, :cond_2c

    .line 1544
    .line 1545
    :cond_2b
    new-instance v0, Lcom/zykj/mistake/feature/ask/h0;

    .line 1546
    .line 1547
    const/16 v14, 0xd

    .line 1548
    .line 1549
    invoke-direct {v0, v1, v14}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 1550
    .line 1551
    .line 1552
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1553
    .line 1554
    .line 1555
    :cond_2c
    move-object v8, v0

    .line 1556
    check-cast v8, Lr6/a;

    .line 1557
    .line 1558
    const/16 v10, 0x30

    .line 1559
    .line 1560
    const/16 v11, 0xc

    .line 1561
    .line 1562
    const-string v5, "\u52a0\u9898"

    .line 1563
    .line 1564
    const/4 v6, 0x0

    .line 1565
    const/4 v7, 0x0

    .line 1566
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1567
    .line 1568
    .line 1569
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1570
    .line 1571
    .line 1572
    goto/16 :goto_1e

    .line 1573
    .line 1574
    :cond_2d
    move-object/from16 v2, p0

    .line 1575
    .line 1576
    :goto_17
    const v4, -0x5f94ece2

    .line 1577
    .line 1578
    .line 1579
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1580
    .line 1581
    .line 1582
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_practice_switch:I

    .line 1583
    .line 1584
    iget-boolean v5, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->h:Z

    .line 1585
    .line 1586
    if-eqz v5, :cond_2e

    .line 1587
    .line 1588
    const-string v6, "\u7ec3\u4e60: \u5f00"

    .line 1589
    .line 1590
    goto :goto_18

    .line 1591
    :cond_2e
    const-string v6, "\u7ec3\u4e60: \u5173"

    .line 1592
    .line 1593
    :goto_18
    if-eqz v5, :cond_2f

    .line 1594
    .line 1595
    :goto_19
    const/16 v7, 0x20

    .line 1596
    .line 1597
    goto :goto_1a

    .line 1598
    :cond_2f
    const/high16 v3, 0x3f000000    # 0.5f

    .line 1599
    .line 1600
    goto :goto_19

    .line 1601
    :goto_1a
    if-ne v0, v7, :cond_30

    .line 1602
    .line 1603
    move/from16 v7, v33

    .line 1604
    .line 1605
    goto :goto_1b

    .line 1606
    :cond_30
    const/4 v7, 0x0

    .line 1607
    :goto_1b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v5

    .line 1611
    if-nez v7, :cond_31

    .line 1612
    .line 1613
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1614
    .line 1615
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v7

    .line 1619
    if-ne v5, v7, :cond_32

    .line 1620
    .line 1621
    :cond_31
    new-instance v5, Lcom/zykj/mistake/feature/ask/h0;

    .line 1622
    .line 1623
    const/16 v7, 0xe

    .line 1624
    .line 1625
    invoke-direct {v5, v1, v7}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 1626
    .line 1627
    .line 1628
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1629
    .line 1630
    .line 1631
    :cond_32
    move-object v8, v5

    .line 1632
    check-cast v8, Lr6/a;

    .line 1633
    .line 1634
    const/4 v10, 0x0

    .line 1635
    const/16 v11, 0x8

    .line 1636
    .line 1637
    const/4 v7, 0x0

    .line 1638
    move-object v5, v6

    .line 1639
    move v6, v3

    .line 1640
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1641
    .line 1642
    .line 1643
    int-to-float v3, v13

    .line 1644
    const/4 v15, 0x6

    .line 1645
    invoke-static {v3, v12, v9, v15}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 1646
    .line 1647
    .line 1648
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_new_mistake:I

    .line 1649
    .line 1650
    const/16 v7, 0x20

    .line 1651
    .line 1652
    if-ne v0, v7, :cond_33

    .line 1653
    .line 1654
    move/from16 v7, v33

    .line 1655
    .line 1656
    goto :goto_1c

    .line 1657
    :cond_33
    const/4 v7, 0x0

    .line 1658
    :goto_1c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v5

    .line 1662
    if-nez v7, :cond_34

    .line 1663
    .line 1664
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1665
    .line 1666
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v6

    .line 1670
    if-ne v5, v6, :cond_35

    .line 1671
    .line 1672
    :cond_34
    new-instance v5, Lcom/zykj/mistake/feature/ask/h0;

    .line 1673
    .line 1674
    const/16 v6, 0xf

    .line 1675
    .line 1676
    invoke-direct {v5, v1, v6}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 1677
    .line 1678
    .line 1679
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1680
    .line 1681
    .line 1682
    :cond_35
    move-object v8, v5

    .line 1683
    check-cast v8, Lr6/a;

    .line 1684
    .line 1685
    const/16 v10, 0x30

    .line 1686
    .line 1687
    const/16 v11, 0xc

    .line 1688
    .line 1689
    const-string v5, "\u52a0\u9898"

    .line 1690
    .line 1691
    const/4 v6, 0x0

    .line 1692
    const/4 v7, 0x0

    .line 1693
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1694
    .line 1695
    .line 1696
    const/4 v15, 0x6

    .line 1697
    invoke-static {v3, v12, v9, v15}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 1698
    .line 1699
    .line 1700
    sget v4, Lcom/zykj/mistake/R$drawable;->ic_black_delete:I

    .line 1701
    .line 1702
    const/16 v7, 0x20

    .line 1703
    .line 1704
    if-ne v0, v7, :cond_36

    .line 1705
    .line 1706
    move/from16 v7, v33

    .line 1707
    .line 1708
    goto :goto_1d

    .line 1709
    :cond_36
    const/4 v7, 0x0

    .line 1710
    :goto_1d
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v0

    .line 1714
    if-nez v7, :cond_37

    .line 1715
    .line 1716
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1717
    .line 1718
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v3

    .line 1722
    if-ne v0, v3, :cond_38

    .line 1723
    .line 1724
    :cond_37
    new-instance v0, Lcom/zykj/mistake/feature/ask/h0;

    .line 1725
    .line 1726
    const/16 v3, 0x11

    .line 1727
    .line 1728
    invoke-direct {v0, v1, v3}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 1729
    .line 1730
    .line 1731
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1732
    .line 1733
    .line 1734
    :cond_38
    move-object v8, v0

    .line 1735
    check-cast v8, Lr6/a;

    .line 1736
    .line 1737
    const/16 v10, 0x30

    .line 1738
    .line 1739
    const/16 v11, 0xc

    .line 1740
    .line 1741
    const-string v5, "\u5220\u9898"

    .line 1742
    .line 1743
    const/4 v6, 0x0

    .line 1744
    const/4 v7, 0x0

    .line 1745
    invoke-static/range {v4 .. v11}, Ly4/f;->a(ILjava/lang/String;FZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 1746
    .line 1747
    .line 1748
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1749
    .line 1750
    .line 1751
    :goto_1e
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1752
    .line 1753
    .line 1754
    goto :goto_1f

    .line 1755
    :cond_39
    move-object/from16 v2, p0

    .line 1756
    .line 1757
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1758
    .line 1759
    .line 1760
    goto :goto_1e

    .line 1761
    :goto_1f
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1762
    .line 1763
    .line 1764
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1765
    .line 1766
    .line 1767
    move-result v0

    .line 1768
    if-eqz v0, :cond_3b

    .line 1769
    .line 1770
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1771
    .line 1772
    .line 1773
    goto :goto_20

    .line 1774
    :cond_3a
    move-object v2, v0

    .line 1775
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1776
    .line 1777
    .line 1778
    :cond_3b
    :goto_20
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v0

    .line 1782
    if-eqz v0, :cond_3c

    .line 1783
    .line 1784
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/d1;

    .line 1785
    .line 1786
    move/from16 v4, p3

    .line 1787
    .line 1788
    const/4 v10, 0x0

    .line 1789
    invoke-direct {v3, v2, v1, v4, v10}, Lcom/zykj/mistake/feature/collection/detail/d1;-><init>(Lcom/zykj/mistake/feature/collection/detail/z0;Lr6/c;II)V

    .line 1790
    .line 1791
    .line 1792
    invoke-interface {v0, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1793
    .line 1794
    .line 1795
    :cond_3c
    return-void
.end method

.method public static final e(IZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    .line 1
    const v0, 0x7e068a30

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    and-int/lit8 p4, p5, 0x6

    .line 9
    .line 10
    if-nez p4, :cond_1

    .line 11
    .line 12
    invoke-interface {v4, p0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    if-eqz p4, :cond_0

    .line 17
    .line 18
    const/4 p4, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p4, 0x2

    .line 21
    :goto_0
    or-int/2addr p4, p5

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p4, p5

    .line 24
    :goto_1
    and-int/lit8 v1, p5, 0x30

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v4, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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
    or-int/2addr p4, v1

    .line 40
    :cond_3
    and-int/lit16 v1, p5, 0x180

    .line 41
    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

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
    or-int/2addr p4, v1

    .line 56
    :cond_5
    and-int/lit16 v1, p5, 0xc00

    .line 57
    .line 58
    if-nez v1, :cond_7

    .line 59
    .line 60
    invoke-interface {v4, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_6

    .line 65
    .line 66
    const/16 v1, 0x800

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_6
    const/16 v1, 0x400

    .line 70
    .line 71
    :goto_4
    or-int/2addr p4, v1

    .line 72
    :cond_7
    and-int/lit16 v1, p4, 0x493

    .line 73
    .line 74
    const/16 v2, 0x492

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    if-eq v1, v2, :cond_8

    .line 78
    .line 79
    move v1, v3

    .line 80
    goto :goto_5

    .line 81
    :cond_8
    const/4 v1, 0x0

    .line 82
    :goto_5
    and-int/lit8 v2, p4, 0x1

    .line 83
    .line 84
    invoke-interface {v4, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_a

    .line 89
    .line 90
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_9

    .line 95
    .line 96
    const/4 v1, -0x1

    .line 97
    const-string v2, "com.zykj.mistake.feature.collection.detail.RemoveMistakeConfirmDialog (MistakeCollectionDetailScreen.kt:328)"

    .line 98
    .line 99
    invoke-static {v0, p4, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    :cond_9
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/b1;

    .line 103
    .line 104
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/zykj/mistake/feature/collection/detail/b1;-><init>(IZLr6/a;Lr6/a;)V

    .line 105
    .line 106
    .line 107
    const/16 v1, 0x36

    .line 108
    .line 109
    const v2, -0x5daf72c7

    .line 110
    .line 111
    .line 112
    invoke-static {v2, v3, v0, v4, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    shr-int/lit8 p4, p4, 0x6

    .line 117
    .line 118
    and-int/lit8 p4, p4, 0xe

    .line 119
    .line 120
    or-int/lit16 v5, p4, 0x180

    .line 121
    .line 122
    const/4 v6, 0x2

    .line 123
    const/4 v2, 0x0

    .line 124
    move-object v1, p2

    .line 125
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/window/AndroidDialog_androidKt;->Dialog(Lr6/a;Landroidx/compose/ui/window/DialogProperties;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_b

    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 135
    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_a
    move-object v1, p2

    .line 139
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 140
    .line 141
    .line 142
    :cond_b
    :goto_6
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-eqz v0, :cond_c

    .line 147
    .line 148
    move p2, p1

    .line 149
    move p1, p0

    .line 150
    new-instance p0, Lcom/zykj/mistake/feature/collection/detail/c1;

    .line 151
    .line 152
    move-object p4, p3

    .line 153
    move-object p3, v1

    .line 154
    invoke-direct/range {p0 .. p5}, Lcom/zykj/mistake/feature/collection/detail/c1;-><init>(IZLr6/a;Lr6/a;I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {v0, p0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 158
    .line 159
    .line 160
    :cond_c
    return-void
.end method

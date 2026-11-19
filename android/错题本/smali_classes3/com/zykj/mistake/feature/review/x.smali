.class public final synthetic Lcom/zykj/mistake/feature/review/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/io/Serializable;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/feature/review/x;->a:I

    iput-object p2, p0, Lcom/zykj/mistake/feature/review/x;->b:Ljava/io/Serializable;

    iput-object p3, p0, Lcom/zykj/mistake/feature/review/x;->c:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/review/x;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/feature/review/x;->a:I

    .line 4
    .line 5
    sget-object v2, Ld6/s;->a:Ld6/s;

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, Lcom/zykj/mistake/feature/review/x;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, v0, Lcom/zykj/mistake/feature/review/x;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v7, v0, Lcom/zykj/mistake/feature/review/x;->b:Ljava/io/Serializable;

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v7, Ljava/util/ArrayList;

    .line 20
    .line 21
    check-cast v6, Ljava/util/List;

    .line 22
    .line 23
    check-cast v5, Lr6/e;

    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, Landroidx/compose/foundation/layout/FlowRowScope;

    .line 28
    .line 29
    move-object/from16 v13, p2

    .line 30
    .line 31
    check-cast v13, Landroidx/compose/runtime/Composer;

    .line 32
    .line 33
    move-object/from16 v9, p3

    .line 34
    .line 35
    check-cast v9, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    const-string v10, "$this$FlowRow"

    .line 42
    .line 43
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    and-int/lit8 v1, v9, 0x11

    .line 47
    .line 48
    const/16 v10, 0x10

    .line 49
    .line 50
    if-eq v1, v10, :cond_0

    .line 51
    .line 52
    move v1, v4

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v1, v8

    .line 55
    :goto_0
    and-int/lit8 v10, v9, 0x1

    .line 56
    .line 57
    invoke-interface {v13, v1, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_8

    .line 62
    .line 63
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    const v1, 0x466399c7

    .line 70
    .line 71
    .line 72
    const-string v10, "com.zykj.mistake.main.drawer.TagSection.<anonymous> (MistakeTagEditorPanel.kt:231)"

    .line 73
    .line 74
    invoke-static {v1, v9, v3, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    move v3, v8

    .line 82
    :goto_1
    if-ge v3, v1, :cond_7

    .line 83
    .line 84
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    check-cast v9, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 91
    .line 92
    if-eqz v6, :cond_3

    .line 93
    .line 94
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-eqz v10, :cond_3

    .line 99
    .line 100
    :cond_2
    move v10, v8

    .line 101
    goto :goto_2

    .line 102
    :cond_3
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    :cond_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v11

    .line 110
    if-eqz v11, :cond_2

    .line 111
    .line 112
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 117
    .line 118
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 119
    .line 120
    .line 121
    move-result-wide v14

    .line 122
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 123
    .line 124
    .line 125
    move-result-wide v16

    .line 126
    cmp-long v12, v14, v16

    .line 127
    .line 128
    if-nez v12, :cond_4

    .line 129
    .line 130
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-ne v11, v12, :cond_4

    .line 139
    .line 140
    move v10, v4

    .line 141
    :goto_2
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    or-int/2addr v12, v14

    .line 154
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    if-nez v12, :cond_5

    .line 159
    .line 160
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 161
    .line 162
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    if-ne v14, v12, :cond_6

    .line 167
    .line 168
    :cond_5
    new-instance v14, Lcom/zykj/mistake/main/drawer/h;

    .line 169
    .line 170
    invoke-direct {v14, v5, v9, v8}, Lcom/zykj/mistake/main/drawer/h;-><init>(Lr6/e;Lcom/zykj/mistake/entity/resp/CustomTagInfo;I)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_6
    check-cast v14, Lr6/a;

    .line 177
    .line 178
    move-object v9, v11

    .line 179
    move-object v11, v14

    .line 180
    const/4 v14, 0x0

    .line 181
    const/16 v15, 0x8

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    invoke-static/range {v9 .. v15}, Lcom/zykj/mistake/main/drawer/l;->d(Ljava/lang/String;ZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_9

    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_8
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 199
    .line 200
    .line 201
    :cond_9
    :goto_3
    return-object v2

    .line 202
    :pswitch_0
    move-object v9, v7

    .line 203
    check-cast v9, Ljava/lang/String;

    .line 204
    .line 205
    check-cast v6, Ljava/lang/String;

    .line 206
    .line 207
    check-cast v5, Ljava/lang/String;

    .line 208
    .line 209
    move-object/from16 v1, p1

    .line 210
    .line 211
    check-cast v1, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    .line 212
    .line 213
    move-object/from16 v7, p2

    .line 214
    .line 215
    check-cast v7, Landroidx/compose/runtime/Composer;

    .line 216
    .line 217
    move-object/from16 v10, p3

    .line 218
    .line 219
    check-cast v10, Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    const-string v11, "$this$BoxWithConstraints"

    .line 226
    .line 227
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    and-int/lit8 v11, v10, 0x6

    .line 231
    .line 232
    if-nez v11, :cond_b

    .line 233
    .line 234
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    if-eqz v11, :cond_a

    .line 239
    .line 240
    const/4 v11, 0x4

    .line 241
    goto :goto_4

    .line 242
    :cond_a
    const/4 v11, 0x2

    .line 243
    :goto_4
    or-int/2addr v10, v11

    .line 244
    :cond_b
    and-int/lit8 v11, v10, 0x13

    .line 245
    .line 246
    const/16 v12, 0x12

    .line 247
    .line 248
    if-eq v11, v12, :cond_c

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_c
    move v4, v8

    .line 252
    :goto_5
    and-int/lit8 v11, v10, 0x1

    .line 253
    .line 254
    invoke-interface {v7, v4, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-eqz v4, :cond_16

    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    if-eqz v4, :cond_d

    .line 265
    .line 266
    const v4, -0x2ab2fa80

    .line 267
    .line 268
    .line 269
    const-string v11, "com.zykj.mistake.feature.review.RecentMetricCell.<anonymous> (ReviewScreen.kt:421)"

    .line 270
    .line 271
    invoke-static {v4, v10, v3, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 272
    .line 273
    .line 274
    :cond_d
    invoke-interface {v1}, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;->getMaxHeight-D9Ej5fM()F

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    const v4, 0x3e6147ae    # 0.22f

    .line 279
    .line 280
    .line 281
    mul-float/2addr v3, v4

    .line 282
    const/high16 v4, 0x41200000    # 10.0f

    .line 283
    .line 284
    const/high16 v10, 0x41400000    # 12.0f

    .line 285
    .line 286
    invoke-static {v3, v4, v10}, Lkotlin/collections/u;->l(FFF)F

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    invoke-static {v3}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    .line 291
    .line 292
    .line 293
    move-result-wide v13

    .line 294
    invoke-interface {v1}, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;->getMaxHeight-D9Ej5fM()F

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    const v3, 0x3ed70a3d    # 0.42f

    .line 299
    .line 300
    .line 301
    mul-float/2addr v1, v3

    .line 302
    const/high16 v3, 0x41800000    # 16.0f

    .line 303
    .line 304
    const/high16 v4, 0x41b00000    # 22.0f

    .line 305
    .line 306
    invoke-static {v1, v3, v4}, Lkotlin/collections/u;->l(FFF)F

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    .line 311
    .line 312
    .line 313
    move-result-wide v3

    .line 314
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 315
    .line 316
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 317
    .line 318
    .line 319
    move-result-object v10

    .line 320
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 321
    .line 322
    sget-object v34, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 323
    .line 324
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 325
    .line 326
    .line 327
    move-result-object v12

    .line 328
    const/16 v15, 0x30

    .line 329
    .line 330
    invoke-static {v12, v10, v7, v15}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 331
    .line 332
    .line 333
    move-result-object v10

    .line 334
    invoke-static {v7, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 335
    .line 336
    .line 337
    move-result v12

    .line 338
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 339
    .line 340
    .line 341
    move-result-object v15

    .line 342
    invoke-static {v7, v11}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 347
    .line 348
    move-object/from16 p1, v1

    .line 349
    .line 350
    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 355
    .line 356
    .line 357
    move-result-object v16

    .line 358
    if-nez v16, :cond_e

    .line 359
    .line 360
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 361
    .line 362
    .line 363
    :cond_e
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 364
    .line 365
    .line 366
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 367
    .line 368
    .line 369
    move-result v16

    .line 370
    if-eqz v16, :cond_f

    .line 371
    .line 372
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 373
    .line 374
    .line 375
    goto :goto_6

    .line 376
    :cond_f
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 377
    .line 378
    .line 379
    :goto_6
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-static {v0, v1, v10, v1, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 388
    .line 389
    .line 390
    move-result v15

    .line 391
    if-nez v15, :cond_10

    .line 392
    .line 393
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v15

    .line 397
    move-object/from16 v35, v2

    .line 398
    .line 399
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-nez v2, :cond_11

    .line 408
    .line 409
    goto :goto_7

    .line 410
    :cond_10
    move-object/from16 v35, v2

    .line 411
    .line 412
    :goto_7
    invoke-static {v12, v1, v12, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 413
    .line 414
    .line 415
    :cond_11
    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    invoke-static {v1, v8, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 420
    .line 421
    .line 422
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 423
    .line 424
    const-wide v1, 0xff15171aL

    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    move-object v8, v11

    .line 430
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 431
    .line 432
    .line 433
    move-result-wide v11

    .line 434
    const/16 v32, 0xc00

    .line 435
    .line 436
    const v33, 0x1dbf2

    .line 437
    .line 438
    .line 439
    const/4 v10, 0x0

    .line 440
    const/4 v15, 0x0

    .line 441
    const/16 v16, 0x0

    .line 442
    .line 443
    const/16 v17, 0x0

    .line 444
    .line 445
    const-wide/16 v18, 0x0

    .line 446
    .line 447
    const/16 v20, 0x0

    .line 448
    .line 449
    const/16 v21, 0x0

    .line 450
    .line 451
    const/16 v24, 0x0

    .line 452
    .line 453
    const/16 v25, 0x0

    .line 454
    .line 455
    const/16 v26, 0x1

    .line 456
    .line 457
    const/16 v27, 0x0

    .line 458
    .line 459
    const/16 v28, 0x0

    .line 460
    .line 461
    const/16 v29, 0x0

    .line 462
    .line 463
    const/16 v31, 0x180

    .line 464
    .line 465
    move-wide/from16 v22, v13

    .line 466
    .line 467
    move-object/from16 v30, v7

    .line 468
    .line 469
    invoke-static/range {v9 .. v33}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 470
    .line 471
    .line 472
    move-wide/from16 v36, v13

    .line 473
    .line 474
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 475
    .line 476
    .line 477
    move-result-object v9

    .line 478
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 479
    .line 480
    .line 481
    move-result-object v10

    .line 482
    const/4 v11, 0x0

    .line 483
    invoke-static {v9, v10, v7, v11}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 484
    .line 485
    .line 486
    move-result-object v9

    .line 487
    invoke-static {v7, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 492
    .line 493
    .line 494
    move-result-object v11

    .line 495
    invoke-static {v7, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 496
    .line 497
    .line 498
    move-result-object v12

    .line 499
    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 500
    .line 501
    .line 502
    move-result-object v13

    .line 503
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 504
    .line 505
    .line 506
    move-result-object v14

    .line 507
    if-nez v14, :cond_12

    .line 508
    .line 509
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 510
    .line 511
    .line 512
    :cond_12
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 513
    .line 514
    .line 515
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 516
    .line 517
    .line 518
    move-result v14

    .line 519
    if-eqz v14, :cond_13

    .line 520
    .line 521
    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 522
    .line 523
    .line 524
    goto :goto_8

    .line 525
    :cond_13
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 526
    .line 527
    .line 528
    :goto_8
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 529
    .line 530
    .line 531
    move-result-object v13

    .line 532
    invoke-static {v0, v13, v9, v13, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 533
    .line 534
    .line 535
    move-result-object v9

    .line 536
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 537
    .line 538
    .line 539
    move-result v11

    .line 540
    if-nez v11, :cond_14

    .line 541
    .line 542
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v11

    .line 546
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 547
    .line 548
    .line 549
    move-result-object v14

    .line 550
    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v11

    .line 554
    if-nez v11, :cond_15

    .line 555
    .line 556
    :cond_14
    invoke-static {v10, v13, v10, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 557
    .line 558
    .line 559
    :cond_15
    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-static {v13, v12, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 564
    .line 565
    .line 566
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 567
    .line 568
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 569
    .line 570
    .line 571
    move-result-wide v12

    .line 572
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 573
    .line 574
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 575
    .line 576
    .line 577
    move-result-object v17

    .line 578
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    invoke-interface {v0, v8, v1}, Landroidx/compose/foundation/layout/RowScope;->alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;

    .line 583
    .line 584
    .line 585
    move-result-object v11

    .line 586
    const/16 v33, 0xc00

    .line 587
    .line 588
    const v34, 0x1dbd0

    .line 589
    .line 590
    .line 591
    const/16 v16, 0x0

    .line 592
    .line 593
    const/16 v18, 0x0

    .line 594
    .line 595
    const-wide/16 v19, 0x0

    .line 596
    .line 597
    const/16 v21, 0x0

    .line 598
    .line 599
    const/16 v22, 0x0

    .line 600
    .line 601
    const/16 v25, 0x0

    .line 602
    .line 603
    const/16 v26, 0x0

    .line 604
    .line 605
    const/16 v27, 0x1

    .line 606
    .line 607
    const/16 v28, 0x0

    .line 608
    .line 609
    const/16 v29, 0x0

    .line 610
    .line 611
    const/16 v30, 0x0

    .line 612
    .line 613
    const v32, 0x30180

    .line 614
    .line 615
    .line 616
    move-wide/from16 v23, v3

    .line 617
    .line 618
    move-wide v14, v3

    .line 619
    move-object v10, v6

    .line 620
    move-object/from16 v31, v7

    .line 621
    .line 622
    invoke-static/range {v10 .. v34}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 623
    .line 624
    .line 625
    const-wide v1, 0xff666666L

    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 631
    .line 632
    .line 633
    move-result-wide v12

    .line 634
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 635
    .line 636
    .line 637
    move-result-object v1

    .line 638
    invoke-interface {v0, v8, v1}, Landroidx/compose/foundation/layout/RowScope;->alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;

    .line 639
    .line 640
    .line 641
    move-result-object v14

    .line 642
    const/4 v0, 0x3

    .line 643
    int-to-float v0, v0

    .line 644
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 645
    .line 646
    .line 647
    move-result v15

    .line 648
    const/16 v19, 0xe

    .line 649
    .line 650
    const/16 v20, 0x0

    .line 651
    .line 652
    const/16 v16, 0x0

    .line 653
    .line 654
    const/16 v17, 0x0

    .line 655
    .line 656
    const/16 v18, 0x0

    .line 657
    .line 658
    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 659
    .line 660
    .line 661
    move-result-object v11

    .line 662
    const v34, 0x1dbf0

    .line 663
    .line 664
    .line 665
    const/16 v16, 0x0

    .line 666
    .line 667
    const/16 v17, 0x0

    .line 668
    .line 669
    const/16 v18, 0x0

    .line 670
    .line 671
    const-wide/16 v19, 0x0

    .line 672
    .line 673
    const/16 v32, 0x180

    .line 674
    .line 675
    move-wide/from16 v23, v36

    .line 676
    .line 677
    move-object v10, v5

    .line 678
    move-wide/from16 v14, v36

    .line 679
    .line 680
    invoke-static/range {v10 .. v34}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 681
    .line 682
    .line 683
    invoke-static/range {v31 .. v31}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    if-eqz v0, :cond_17

    .line 688
    .line 689
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 690
    .line 691
    .line 692
    goto :goto_9

    .line 693
    :cond_16
    move-object/from16 v35, v2

    .line 694
    .line 695
    move-object/from16 v31, v7

    .line 696
    .line 697
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 698
    .line 699
    .line 700
    :cond_17
    :goto_9
    return-object v35

    .line 701
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

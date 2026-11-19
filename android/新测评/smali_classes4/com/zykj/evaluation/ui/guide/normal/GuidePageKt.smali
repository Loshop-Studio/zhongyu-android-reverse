.class public abstract Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/navigation/NavController;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->i(Landroidx/navigation/NavController;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->j(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->f(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lj6/p;Ljava/util/List;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->h(Lj6/p;Ljava/util/List;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 39

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move/from16 v0, p6

    .line 10
    .line 11
    const-string v1, "questionStateList"

    .line 12
    .line 13
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "groups"

    .line 17
    .line 18
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "onClickQuestionDescription"

    .line 22
    .line 23
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "onClickToDetail"

    .line 27
    .line 28
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v1, -0x5b16bc9a

    .line 32
    .line 33
    .line 34
    move-object/from16 v6, p5

    .line 35
    .line 36
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    and-int/lit8 v6, p7, 0x1

    .line 41
    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    or-int/lit8 v7, v0, 0x6

    .line 45
    .line 46
    move v9, v7

    .line 47
    move-object/from16 v7, p0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    and-int/lit8 v7, v0, 0x6

    .line 51
    .line 52
    if-nez v7, :cond_2

    .line 53
    .line 54
    move-object/from16 v7, p0

    .line 55
    .line 56
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_1

    .line 61
    .line 62
    const/4 v9, 0x4

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 v9, 0x2

    .line 65
    :goto_0
    or-int/2addr v9, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move-object/from16 v7, p0

    .line 68
    .line 69
    move v9, v0

    .line 70
    :goto_1
    and-int/lit8 v10, v0, 0x30

    .line 71
    .line 72
    if-nez v10, :cond_4

    .line 73
    .line 74
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-eqz v10, :cond_3

    .line 79
    .line 80
    const/16 v10, 0x20

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    const/16 v10, 0x10

    .line 84
    .line 85
    :goto_2
    or-int/2addr v9, v10

    .line 86
    :cond_4
    and-int/lit16 v10, v0, 0x180

    .line 87
    .line 88
    if-nez v10, :cond_6

    .line 89
    .line 90
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-eqz v10, :cond_5

    .line 95
    .line 96
    const/16 v10, 0x100

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    const/16 v10, 0x80

    .line 100
    .line 101
    :goto_3
    or-int/2addr v9, v10

    .line 102
    :cond_6
    and-int/lit16 v10, v0, 0xc00

    .line 103
    .line 104
    if-nez v10, :cond_8

    .line 105
    .line 106
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-eqz v10, :cond_7

    .line 111
    .line 112
    const/16 v10, 0x800

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_7
    const/16 v10, 0x400

    .line 116
    .line 117
    :goto_4
    or-int/2addr v9, v10

    .line 118
    :cond_8
    and-int/lit16 v10, v0, 0x6000

    .line 119
    .line 120
    if-nez v10, :cond_a

    .line 121
    .line 122
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_9

    .line 127
    .line 128
    const/16 v10, 0x4000

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_9
    const/16 v10, 0x2000

    .line 132
    .line 133
    :goto_5
    or-int/2addr v9, v10

    .line 134
    :cond_a
    move v13, v9

    .line 135
    and-int/lit16 v9, v13, 0x2493

    .line 136
    .line 137
    const/16 v10, 0x2492

    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/4 v15, 0x1

    .line 141
    if-eq v9, v10, :cond_b

    .line 142
    .line 143
    move v9, v15

    .line 144
    goto :goto_6

    .line 145
    :cond_b
    move v9, v14

    .line 146
    :goto_6
    and-int/lit8 v10, v13, 0x1

    .line 147
    .line 148
    invoke-interface {v8, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    if-eqz v9, :cond_1d

    .line 153
    .line 154
    if-eqz v6, :cond_c

    .line 155
    .line 156
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 157
    .line 158
    move-object/from16 v16, v6

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_c
    move-object/from16 v16, v7

    .line 162
    .line 163
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_d

    .line 168
    .line 169
    const/4 v6, -0x1

    .line 170
    const-string v7, "com.zykj.evaluation.ui.guide.normal.GuideContentView (GuidePage.kt:84)"

    .line 171
    .line 172
    invoke-static {v1, v13, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    :cond_d
    invoke-static {v14, v8, v14, v15}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const/16 v6, 0x9

    .line 180
    .line 181
    int-to-float v6, v6

    .line 182
    const/16 v7, 0x258

    .line 183
    .line 184
    int-to-float v7, v7

    .line 185
    div-float v24, v6, v7

    .line 186
    .line 187
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    iget v9, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 196
    .line 197
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 198
    .line 199
    invoke-static {v9, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    int-to-float v6, v6

    .line 204
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 213
    .line 214
    div-float/2addr v6, v9

    .line 215
    mul-float v6, v6, v24

    .line 216
    .line 217
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 218
    .line 219
    .line 220
    move-result v17

    .line 221
    const/16 v21, 0xe

    .line 222
    .line 223
    const/16 v22, 0x0

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
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 232
    .line 233
    .line 234
    move-result-object v25

    .line 235
    move-object/from16 v31, v16

    .line 236
    .line 237
    sget-object v6, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 238
    .line 239
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v26

    .line 243
    const/16 v29, 0x2

    .line 244
    .line 245
    const/16 v30, 0x0

    .line 246
    .line 247
    const/16 v28, 0x0

    .line 248
    .line 249
    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 254
    .line 255
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    invoke-static {v10, v14}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    invoke-static {v8, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 264
    .line 265
    .line 266
    move-result v16

    .line 267
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    invoke-static {v8, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    sget-object v25, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 276
    .line 277
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 282
    .line 283
    .line 284
    move-result-object v17

    .line 285
    if-nez v17, :cond_e

    .line 286
    .line 287
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 288
    .line 289
    .line 290
    :cond_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 291
    .line 292
    .line 293
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 294
    .line 295
    .line 296
    move-result v17

    .line 297
    if-eqz v17, :cond_f

    .line 298
    .line 299
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 300
    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 304
    .line 305
    .line 306
    :goto_8
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 307
    .line 308
    .line 309
    move-result-object v12

    .line 310
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 311
    .line 312
    .line 313
    move-result-object v15

    .line 314
    invoke-static {v12, v10, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    invoke-static {v12, v11, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 325
    .line 326
    .line 327
    move-result-object v10

    .line 328
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    if-nez v11, :cond_10

    .line 333
    .line 334
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v11

    .line 338
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v15

    .line 342
    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    if-nez v11, :cond_11

    .line 347
    .line 348
    :cond_10
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    invoke-interface {v12, v11, v10}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 360
    .line 361
    .line 362
    :cond_11
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    invoke-static {v12, v6, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 367
    .line 368
    .line 369
    sget-object v11, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 370
    .line 371
    sget-object v17, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 372
    .line 373
    const/16 v22, 0xe

    .line 374
    .line 375
    const/16 v23, 0x0

    .line 376
    .line 377
    const/16 v19, 0x0

    .line 378
    .line 379
    const/16 v20, 0x0

    .line 380
    .line 381
    const/16 v21, 0x0

    .line 382
    .line 383
    move-object/from16 v18, v1

    .line 384
    .line 385
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    iget v10, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 398
    .line 399
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 400
    .line 401
    invoke-static {v10, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 402
    .line 403
    .line 404
    move-result v6

    .line 405
    int-to-float v6, v6

    .line 406
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 407
    .line 408
    .line 409
    move-result-object v10

    .line 410
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 411
    .line 412
    .line 413
    move-result-object v10

    .line 414
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 415
    .line 416
    div-float/2addr v6, v10

    .line 417
    mul-float v6, v6, v24

    .line 418
    .line 419
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 420
    .line 421
    .line 422
    move-result v6

    .line 423
    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    sget-object v6, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 428
    .line 429
    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    invoke-static {v6, v9, v8, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    invoke-static {v8, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    invoke-static {v8, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 454
    .line 455
    .line 456
    move-result-object v12

    .line 457
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 458
    .line 459
    .line 460
    move-result-object v15

    .line 461
    if-nez v15, :cond_12

    .line 462
    .line 463
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 464
    .line 465
    .line 466
    :cond_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 467
    .line 468
    .line 469
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 470
    .line 471
    .line 472
    move-result v15

    .line 473
    if-eqz v15, :cond_13

    .line 474
    .line 475
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 476
    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_13
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 480
    .line 481
    .line 482
    :goto_9
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 483
    .line 484
    .line 485
    move-result-object v12

    .line 486
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 487
    .line 488
    .line 489
    move-result-object v15

    .line 490
    invoke-static {v12, v6, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    invoke-static {v12, v10, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 501
    .line 502
    .line 503
    move-result-object v6

    .line 504
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    if-nez v10, :cond_14

    .line 509
    .line 510
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v10

    .line 514
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v15

    .line 518
    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v10

    .line 522
    if-nez v10, :cond_15

    .line 523
    .line 524
    :cond_14
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v10

    .line 528
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    invoke-interface {v12, v9, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 536
    .line 537
    .line 538
    :cond_15
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 539
    .line 540
    .line 541
    move-result-object v6

    .line 542
    invoke-static {v12, v1, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 543
    .line 544
    .line 545
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 546
    .line 547
    const v1, 0x78ce3c6c

    .line 548
    .line 549
    .line 550
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 551
    .line 552
    .line 553
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    const/4 v9, 0x5

    .line 562
    const/4 v10, 0x6

    .line 563
    if-eqz v6, :cond_16

    .line 564
    .line 565
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    check-cast v6, Lj6/c;

    .line 570
    .line 571
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 572
    .line 573
    int-to-float v9, v9

    .line 574
    div-float/2addr v9, v7

    .line 575
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 576
    .line 577
    .line 578
    move-result-object v15

    .line 579
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 580
    .line 581
    .line 582
    move-result-object v15

    .line 583
    iget v14, v15, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 584
    .line 585
    iget v15, v15, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 586
    .line 587
    invoke-static {v14, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 588
    .line 589
    .line 590
    move-result v14

    .line 591
    int-to-float v14, v14

    .line 592
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 593
    .line 594
    .line 595
    move-result-object v15

    .line 596
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 597
    .line 598
    .line 599
    move-result-object v15

    .line 600
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 601
    .line 602
    div-float/2addr v14, v15

    .line 603
    mul-float/2addr v9, v14

    .line 604
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 605
    .line 606
    .line 607
    move-result v9

    .line 608
    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 609
    .line 610
    .line 611
    move-result-object v9

    .line 612
    invoke-static {v9, v8, v10}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 613
    .line 614
    .line 615
    const/4 v9, 0x0

    .line 616
    const/4 v14, 0x0

    .line 617
    const/4 v15, 0x1

    .line 618
    invoke-static {v12, v9, v15, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 619
    .line 620
    .line 621
    move-result-object v9

    .line 622
    shr-int/lit8 v12, v13, 0x3

    .line 623
    .line 624
    and-int/lit16 v14, v12, 0x380

    .line 625
    .line 626
    or-int/2addr v10, v14

    .line 627
    and-int/lit16 v12, v12, 0x1c00

    .line 628
    .line 629
    or-int/2addr v10, v12

    .line 630
    move-object v4, v9

    .line 631
    move v9, v10

    .line 632
    const/4 v10, 0x0

    .line 633
    move/from16 v29, v7

    .line 634
    .line 635
    move-object v7, v5

    .line 636
    move-object v5, v6

    .line 637
    move-object/from16 v6, p3

    .line 638
    .line 639
    invoke-static/range {v4 .. v10}, Lj6/o;->g(Landroidx/compose/ui/Modifier;Lj6/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 640
    .line 641
    .line 642
    move-object/from16 v4, p3

    .line 643
    .line 644
    move-object/from16 v5, p4

    .line 645
    .line 646
    move/from16 v7, v29

    .line 647
    .line 648
    const/4 v14, 0x0

    .line 649
    goto :goto_a

    .line 650
    :cond_16
    move/from16 v29, v7

    .line 651
    .line 652
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 653
    .line 654
    .line 655
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 656
    .line 657
    .line 658
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 659
    .line 660
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 661
    .line 662
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getTopEnd()Landroidx/compose/ui/Alignment;

    .line 663
    .line 664
    .line 665
    move-result-object v5

    .line 666
    invoke-interface {v11, v1, v5}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 667
    .line 668
    .line 669
    move-result-object v17

    .line 670
    const/16 v1, 0xe

    .line 671
    .line 672
    int-to-float v1, v1

    .line 673
    div-float v1, v1, v29

    .line 674
    .line 675
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 676
    .line 677
    .line 678
    move-result-object v5

    .line 679
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 680
    .line 681
    .line 682
    move-result-object v5

    .line 683
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 684
    .line 685
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 686
    .line 687
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 688
    .line 689
    .line 690
    move-result v5

    .line 691
    int-to-float v5, v5

    .line 692
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 693
    .line 694
    .line 695
    move-result-object v6

    .line 696
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 697
    .line 698
    .line 699
    move-result-object v6

    .line 700
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 701
    .line 702
    div-float/2addr v5, v6

    .line 703
    mul-float/2addr v1, v5

    .line 704
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 705
    .line 706
    .line 707
    move-result v19

    .line 708
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    iget v5, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 717
    .line 718
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 719
    .line 720
    invoke-static {v5, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 721
    .line 722
    .line 723
    move-result v1

    .line 724
    int-to-float v1, v1

    .line 725
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 726
    .line 727
    .line 728
    move-result-object v5

    .line 729
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 734
    .line 735
    div-float/2addr v1, v5

    .line 736
    mul-float v24, v24, v1

    .line 737
    .line 738
    invoke-static/range {v24 .. v24}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 739
    .line 740
    .line 741
    move-result v20

    .line 742
    const/16 v22, 0x9

    .line 743
    .line 744
    const/16 v23, 0x0

    .line 745
    .line 746
    const/16 v18, 0x0

    .line 747
    .line 748
    const/16 v21, 0x0

    .line 749
    .line 750
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 755
    .line 756
    .line 757
    move-result-object v4

    .line 758
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 759
    .line 760
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 761
    .line 762
    .line 763
    move-result-object v5

    .line 764
    const/16 v6, 0x30

    .line 765
    .line 766
    invoke-static {v5, v4, v8, v6}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 767
    .line 768
    .line 769
    move-result-object v4

    .line 770
    const/4 v5, 0x0

    .line 771
    invoke-static {v8, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 772
    .line 773
    .line 774
    move-result v6

    .line 775
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    invoke-static {v8, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 784
    .line 785
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 786
    .line 787
    .line 788
    move-result-object v11

    .line 789
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 790
    .line 791
    .line 792
    move-result-object v12

    .line 793
    if-nez v12, :cond_17

    .line 794
    .line 795
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 796
    .line 797
    .line 798
    :cond_17
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 799
    .line 800
    .line 801
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 802
    .line 803
    .line 804
    move-result v12

    .line 805
    if-eqz v12, :cond_18

    .line 806
    .line 807
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 808
    .line 809
    .line 810
    goto :goto_b

    .line 811
    :cond_18
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 812
    .line 813
    .line 814
    :goto_b
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 815
    .line 816
    .line 817
    move-result-object v11

    .line 818
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 819
    .line 820
    .line 821
    move-result-object v12

    .line 822
    invoke-static {v11, v4, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 826
    .line 827
    .line 828
    move-result-object v4

    .line 829
    invoke-static {v11, v5, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 833
    .line 834
    .line 835
    move-result-object v4

    .line 836
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 837
    .line 838
    .line 839
    move-result v5

    .line 840
    if-nez v5, :cond_19

    .line 841
    .line 842
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v5

    .line 846
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 847
    .line 848
    .line 849
    move-result-object v12

    .line 850
    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    move-result v5

    .line 854
    if-nez v5, :cond_1a

    .line 855
    .line 856
    :cond_19
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 857
    .line 858
    .line 859
    move-result-object v5

    .line 860
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 861
    .line 862
    .line 863
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 864
    .line 865
    .line 866
    move-result-object v5

    .line 867
    invoke-interface {v11, v5, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 868
    .line 869
    .line 870
    :cond_1a
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 871
    .line 872
    .line 873
    move-result-object v4

    .line 874
    invoke-static {v11, v1, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 875
    .line 876
    .line 877
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 878
    .line 879
    const v1, -0x3ef1d599

    .line 880
    .line 881
    .line 882
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 883
    .line 884
    .line 885
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 890
    .line 891
    .line 892
    move-result v4

    .line 893
    if-eqz v4, :cond_1b

    .line 894
    .line 895
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v4

    .line 899
    check-cast v4, Lj6/q;

    .line 900
    .line 901
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 902
    .line 903
    int-to-float v6, v9

    .line 904
    div-float v6, v6, v29

    .line 905
    .line 906
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 907
    .line 908
    .line 909
    move-result-object v7

    .line 910
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 911
    .line 912
    .line 913
    move-result-object v7

    .line 914
    iget v11, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 915
    .line 916
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 917
    .line 918
    invoke-static {v11, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 919
    .line 920
    .line 921
    move-result v7

    .line 922
    int-to-float v7, v7

    .line 923
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 924
    .line 925
    .line 926
    move-result-object v11

    .line 927
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 928
    .line 929
    .line 930
    move-result-object v11

    .line 931
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 932
    .line 933
    div-float/2addr v7, v11

    .line 934
    mul-float/2addr v6, v7

    .line 935
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 936
    .line 937
    .line 938
    move-result v6

    .line 939
    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 940
    .line 941
    .line 942
    move-result-object v6

    .line 943
    invoke-static {v6, v8, v10}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 944
    .line 945
    .line 946
    const/16 v6, 0xb

    .line 947
    .line 948
    int-to-float v6, v6

    .line 949
    div-float v6, v6, v29

    .line 950
    .line 951
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 952
    .line 953
    .line 954
    move-result-object v7

    .line 955
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 956
    .line 957
    .line 958
    move-result-object v7

    .line 959
    iget v11, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 960
    .line 961
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 962
    .line 963
    invoke-static {v11, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 964
    .line 965
    .line 966
    move-result v7

    .line 967
    int-to-float v7, v7

    .line 968
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 969
    .line 970
    .line 971
    move-result-object v11

    .line 972
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 973
    .line 974
    .line 975
    move-result-object v11

    .line 976
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 977
    .line 978
    div-float/2addr v7, v11

    .line 979
    mul-float/2addr v6, v7

    .line 980
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 981
    .line 982
    .line 983
    move-result v6

    .line 984
    const/4 v7, 0x7

    .line 985
    int-to-float v7, v7

    .line 986
    div-float v7, v7, v29

    .line 987
    .line 988
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 989
    .line 990
    .line 991
    move-result-object v11

    .line 992
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 993
    .line 994
    .line 995
    move-result-object v11

    .line 996
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 997
    .line 998
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 999
    .line 1000
    invoke-static {v12, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 1001
    .line 1002
    .line 1003
    move-result v11

    .line 1004
    int-to-float v11, v11

    .line 1005
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v12

    .line 1009
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v12

    .line 1013
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 1014
    .line 1015
    div-float/2addr v11, v12

    .line 1016
    mul-float/2addr v7, v11

    .line 1017
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1018
    .line 1019
    .line 1020
    move-result v7

    .line 1021
    invoke-static {v5, v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v6

    .line 1025
    invoke-virtual {v4}, Lj6/q;->a()J

    .line 1026
    .line 1027
    .line 1028
    move-result-wide v11

    .line 1029
    const/4 v7, 0x4

    .line 1030
    int-to-float v13, v7

    .line 1031
    div-float v13, v13, v29

    .line 1032
    .line 1033
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v14

    .line 1037
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v14

    .line 1041
    iget v15, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1042
    .line 1043
    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1044
    .line 1045
    invoke-static {v15, v14}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 1046
    .line 1047
    .line 1048
    move-result v14

    .line 1049
    int-to-float v14, v14

    .line 1050
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v15

    .line 1054
    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v15

    .line 1058
    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    .line 1059
    .line 1060
    div-float/2addr v14, v15

    .line 1061
    mul-float/2addr v14, v13

    .line 1062
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1063
    .line 1064
    .line 1065
    move-result v14

    .line 1066
    invoke-static {v14}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v14

    .line 1070
    invoke-static {v6, v11, v12, v14}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v6

    .line 1074
    const/4 v15, 0x1

    .line 1075
    int-to-float v11, v15

    .line 1076
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1077
    .line 1078
    .line 1079
    move-result v11

    .line 1080
    invoke-virtual {v4}, Lj6/q;->c()J

    .line 1081
    .line 1082
    .line 1083
    move-result-wide v9

    .line 1084
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v14

    .line 1088
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v14

    .line 1092
    iget v7, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1093
    .line 1094
    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1095
    .line 1096
    invoke-static {v7, v14}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 1097
    .line 1098
    .line 1099
    move-result v7

    .line 1100
    int-to-float v7, v7

    .line 1101
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v14

    .line 1105
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v14

    .line 1109
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 1110
    .line 1111
    div-float/2addr v7, v14

    .line 1112
    mul-float/2addr v13, v7

    .line 1113
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1114
    .line 1115
    .line 1116
    move-result v7

    .line 1117
    invoke-static {v7}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v7

    .line 1121
    invoke-static {v6, v11, v9, v10, v7}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v6

    .line 1125
    const/4 v7, 0x0

    .line 1126
    invoke-static {v6, v8, v7}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1127
    .line 1128
    .line 1129
    const/4 v6, 0x2

    .line 1130
    int-to-float v9, v6

    .line 1131
    div-float v9, v9, v29

    .line 1132
    .line 1133
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v10

    .line 1137
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v10

    .line 1141
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1142
    .line 1143
    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1144
    .line 1145
    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 1146
    .line 1147
    .line 1148
    move-result v10

    .line 1149
    int-to-float v10, v10

    .line 1150
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v11

    .line 1154
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v11

    .line 1158
    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    .line 1159
    .line 1160
    div-float/2addr v10, v11

    .line 1161
    mul-float/2addr v9, v10

    .line 1162
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1163
    .line 1164
    .line 1165
    move-result v9

    .line 1166
    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v5

    .line 1170
    const/4 v12, 0x6

    .line 1171
    invoke-static {v5, v8, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v4}, Lj6/q;->b()Ljava/lang/String;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v4

    .line 1178
    move-object/from16 v25, v8

    .line 1179
    .line 1180
    invoke-static {v12}, Lo5/e;->k(I)J

    .line 1181
    .line 1182
    .line 1183
    move-result-wide v8

    .line 1184
    const-wide v10, 0xff555555L

    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1190
    .line 1191
    .line 1192
    move-result-wide v10

    .line 1193
    const/16 v27, 0x0

    .line 1194
    .line 1195
    const v28, 0x1fff2

    .line 1196
    .line 1197
    .line 1198
    const/4 v5, 0x0

    .line 1199
    move/from16 v16, v7

    .line 1200
    .line 1201
    move-wide/from16 v37, v10

    .line 1202
    .line 1203
    move v11, v6

    .line 1204
    move-wide/from16 v6, v37

    .line 1205
    .line 1206
    const/4 v10, 0x0

    .line 1207
    move v13, v11

    .line 1208
    const/4 v11, 0x0

    .line 1209
    move v14, v12

    .line 1210
    const/4 v12, 0x0

    .line 1211
    move/from16 v17, v13

    .line 1212
    .line 1213
    move/from16 v18, v14

    .line 1214
    .line 1215
    const-wide/16 v13, 0x0

    .line 1216
    .line 1217
    move/from16 v19, v15

    .line 1218
    .line 1219
    const/4 v15, 0x0

    .line 1220
    move/from16 v20, v16

    .line 1221
    .line 1222
    const/16 v16, 0x0

    .line 1223
    .line 1224
    move/from16 v21, v17

    .line 1225
    .line 1226
    move/from16 v22, v18

    .line 1227
    .line 1228
    const-wide/16 v17, 0x0

    .line 1229
    .line 1230
    move/from16 v23, v19

    .line 1231
    .line 1232
    const/16 v19, 0x0

    .line 1233
    .line 1234
    move/from16 v24, v20

    .line 1235
    .line 1236
    const/16 v20, 0x0

    .line 1237
    .line 1238
    move/from16 v30, v21

    .line 1239
    .line 1240
    const/16 v21, 0x0

    .line 1241
    .line 1242
    move/from16 v32, v22

    .line 1243
    .line 1244
    const/16 v22, 0x0

    .line 1245
    .line 1246
    move/from16 v33, v23

    .line 1247
    .line 1248
    const/16 v23, 0x0

    .line 1249
    .line 1250
    move/from16 v34, v24

    .line 1251
    .line 1252
    const/16 v24, 0x0

    .line 1253
    .line 1254
    const/16 v35, 0x4

    .line 1255
    .line 1256
    const/16 v26, 0xd80

    .line 1257
    .line 1258
    move/from16 v36, v33

    .line 1259
    .line 1260
    move/from16 v33, v32

    .line 1261
    .line 1262
    move/from16 v32, v30

    .line 1263
    .line 1264
    const/16 v30, 0x5

    .line 1265
    .line 1266
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1267
    .line 1268
    .line 1269
    move-object/from16 v8, v25

    .line 1270
    .line 1271
    move/from16 v9, v30

    .line 1272
    .line 1273
    move/from16 v10, v33

    .line 1274
    .line 1275
    goto/16 :goto_c

    .line 1276
    .line 1277
    :cond_1b
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1278
    .line 1279
    .line 1280
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1281
    .line 1282
    .line 1283
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1284
    .line 1285
    .line 1286
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1287
    .line 1288
    .line 1289
    move-result v1

    .line 1290
    if-eqz v1, :cond_1c

    .line 1291
    .line 1292
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1293
    .line 1294
    .line 1295
    :cond_1c
    move-object/from16 v1, v31

    .line 1296
    .line 1297
    goto :goto_d

    .line 1298
    :cond_1d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1299
    .line 1300
    .line 1301
    move-object v1, v7

    .line 1302
    :goto_d
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v8

    .line 1306
    if-eqz v8, :cond_1e

    .line 1307
    .line 1308
    new-instance v0, Lj6/g;

    .line 1309
    .line 1310
    move-object/from16 v4, p3

    .line 1311
    .line 1312
    move-object/from16 v5, p4

    .line 1313
    .line 1314
    move/from16 v6, p6

    .line 1315
    .line 1316
    move/from16 v7, p7

    .line 1317
    .line 1318
    invoke-direct/range {v0 .. v7}, Lj6/g;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    .line 1319
    .line 1320
    .line 1321
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1322
    .line 1323
    .line 1324
    :cond_1e
    return-void
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    .line 1
    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->e(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final g(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v1, p3

    .line 6
    .line 7
    move-object/from16 v9, p5

    .line 8
    .line 9
    move/from16 v10, p7

    .line 10
    .line 11
    const-string v2, "navController"

    .line 12
    .line 13
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "viewModel"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v2, "onClickToDetail"

    .line 22
    .line 23
    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const v2, 0x45629b36

    .line 27
    .line 28
    .line 29
    move-object/from16 v3, p6

    .line 30
    .line 31
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    and-int/lit8 v3, v10, 0x6

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    const/4 v3, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v3, 0x2

    .line 48
    :goto_0
    or-int/2addr v3, v10

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v3, v10

    .line 51
    :goto_1
    and-int/lit8 v5, v10, 0x30

    .line 52
    .line 53
    const/16 v6, 0x20

    .line 54
    .line 55
    if-nez v5, :cond_3

    .line 56
    .line 57
    invoke-interface {v4, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    move v5, v6

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const/16 v5, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v3, v5

    .line 68
    :cond_3
    and-int/lit16 v5, v10, 0x180

    .line 69
    .line 70
    if-nez v5, :cond_5

    .line 71
    .line 72
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    const/16 v5, 0x100

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    const/16 v5, 0x80

    .line 82
    .line 83
    :goto_3
    or-int/2addr v3, v5

    .line 84
    :cond_5
    and-int/lit8 v5, p8, 0x8

    .line 85
    .line 86
    if-eqz v5, :cond_7

    .line 87
    .line 88
    or-int/lit16 v3, v3, 0xc00

    .line 89
    .line 90
    :cond_6
    move-object/from16 v11, p4

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_7
    and-int/lit16 v11, v10, 0xc00

    .line 94
    .line 95
    if-nez v11, :cond_6

    .line 96
    .line 97
    move-object/from16 v11, p4

    .line 98
    .line 99
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    if-eqz v12, :cond_8

    .line 104
    .line 105
    const/16 v12, 0x800

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_8
    const/16 v12, 0x400

    .line 109
    .line 110
    :goto_4
    or-int/2addr v3, v12

    .line 111
    :goto_5
    and-int/lit16 v12, v10, 0x6000

    .line 112
    .line 113
    if-nez v12, :cond_a

    .line 114
    .line 115
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v12

    .line 119
    if-eqz v12, :cond_9

    .line 120
    .line 121
    const/16 v12, 0x4000

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_9
    const/16 v12, 0x2000

    .line 125
    .line 126
    :goto_6
    or-int/2addr v3, v12

    .line 127
    :cond_a
    and-int/lit16 v12, v3, 0x2493

    .line 128
    .line 129
    const/16 v13, 0x2492

    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const/4 v15, 0x1

    .line 133
    if-eq v12, v13, :cond_b

    .line 134
    .line 135
    move v12, v15

    .line 136
    goto :goto_7

    .line 137
    :cond_b
    move v12, v14

    .line 138
    :goto_7
    and-int/lit8 v13, v3, 0x1

    .line 139
    .line 140
    invoke-interface {v4, v12, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    if-eqz v12, :cond_12

    .line 145
    .line 146
    const/4 v12, 0x0

    .line 147
    if-eqz v5, :cond_c

    .line 148
    .line 149
    move-object v11, v12

    .line 150
    :cond_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-eqz v5, :cond_d

    .line 155
    .line 156
    const/4 v5, -0x1

    .line 157
    const-string v13, "com.zykj.evaluation.ui.guide.normal.GuidePage (GuidePage.kt:42)"

    .line 158
    .line 159
    invoke-static {v2, v3, v5, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_d
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 163
    .line 164
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    and-int/lit8 v13, v3, 0x70

    .line 169
    .line 170
    if-ne v13, v6, :cond_e

    .line 171
    .line 172
    move v14, v15

    .line 173
    :cond_e
    or-int/2addr v5, v14

    .line 174
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    if-nez v5, :cond_f

    .line 179
    .line 180
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 181
    .line 182
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-ne v6, v5, :cond_10

    .line 187
    .line 188
    :cond_f
    new-instance v6, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt$GuidePage$1$1;

    .line 189
    .line 190
    invoke-direct {v6, v1, v7, v8, v12}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt$GuidePage$1$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;JLkotlin/coroutines/Continuation;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_10
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 197
    .line 198
    const/4 v5, 0x6

    .line 199
    invoke-static {v2, v6, v4, v5}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->Q()Lj6/p;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->R()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    new-instance v6, Lj6/d;

    .line 211
    .line 212
    invoke-direct {v6, v2, v5, v0, v9}, Lj6/d;-><init>(Lj6/p;Ljava/util/List;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;)V

    .line 213
    .line 214
    .line 215
    const/16 v2, 0x36

    .line 216
    .line 217
    const v5, -0x34ff5d35    # -8430283.0f

    .line 218
    .line 219
    .line 220
    invoke-static {v5, v15, v6, v4, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    and-int/lit8 v5, v3, 0xe

    .line 225
    .line 226
    or-int/lit16 v5, v5, 0xc00

    .line 227
    .line 228
    shr-int/lit8 v3, v3, 0x3

    .line 229
    .line 230
    and-int/lit8 v6, v3, 0x70

    .line 231
    .line 232
    or-int/2addr v5, v6

    .line 233
    and-int/lit16 v3, v3, 0x380

    .line 234
    .line 235
    or-int/2addr v5, v3

    .line 236
    const/4 v6, 0x0

    .line 237
    move-object v3, v2

    .line 238
    move-object v2, v11

    .line 239
    invoke-static/range {v0 .. v6}, Lr6/m;->i(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 240
    .line 241
    .line 242
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_11

    .line 247
    .line 248
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 249
    .line 250
    .line 251
    :cond_11
    move-object v5, v2

    .line 252
    goto :goto_8

    .line 253
    :cond_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 254
    .line 255
    .line 256
    move-object v5, v11

    .line 257
    :goto_8
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    if-eqz v11, :cond_13

    .line 262
    .line 263
    new-instance v0, Lj6/e;

    .line 264
    .line 265
    move-object/from16 v1, p0

    .line 266
    .line 267
    move-object/from16 v4, p3

    .line 268
    .line 269
    move-wide v2, v7

    .line 270
    move-object v6, v9

    .line 271
    move v7, v10

    .line 272
    move/from16 v8, p8

    .line 273
    .line 274
    invoke-direct/range {v0 .. v8}, Lj6/e;-><init>(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;II)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 278
    .line 279
    .line 280
    :cond_13
    return-void
.end method

.method public static final h(Lj6/p;Ljava/util/List;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    .line 1
    const-string v2, "$this$GuideView"

    .line 2
    .line 3
    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    and-int/lit8 v2, p6, 0x6

    .line 7
    .line 8
    if-nez v2, :cond_1

    .line 9
    .line 10
    invoke-interface {p5, p4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x2

    .line 19
    :goto_0
    or-int/2addr v2, p6

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v2, p6

    .line 22
    :goto_1
    and-int/lit8 v3, v2, 0x13

    .line 23
    .line 24
    const/16 v4, 0x12

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-eq v3, v4, :cond_2

    .line 28
    .line 29
    move v3, v5

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    const/4 v3, 0x0

    .line 32
    :goto_2
    and-int/lit8 v4, v2, 0x1

    .line 33
    .line 34
    invoke-interface {p5, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_6

    .line 39
    .line 40
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    const/4 v3, -0x1

    .line 47
    const-string v4, "com.zykj.evaluation.ui.guide.normal.GuidePage.<anonymous> (GuidePage.kt:55)"

    .line 48
    .line 49
    const v6, -0x34ff5d35    # -8430283.0f

    .line 50
    .line 51
    .line 52
    invoke-static {v6, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-static {v2, v3, v5, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const/4 v5, 0x2

    .line 64
    const/4 v6, 0x0

    .line 65
    const/high16 v3, 0x3f800000    # 1.0f

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    move-object v1, p4

    .line 69
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {p0}, Lj6/p;->c()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-interface {p5, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-nez v3, :cond_4

    .line 86
    .line 87
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 88
    .line 89
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    if-ne v4, v3, :cond_5

    .line 94
    .line 95
    :cond_4
    new-instance v4, Lj6/f;

    .line 96
    .line 97
    invoke-direct {v4, p2}, Lj6/f;-><init>(Landroidx/navigation/NavController;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    move-object v3, v4

    .line 104
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    const/4 v7, 0x0

    .line 108
    move-object v4, p3

    .line 109
    move-object v5, p5

    .line 110
    move-object v0, v1

    .line 111
    move-object v1, p1

    .line 112
    invoke-static/range {v0 .. v7}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->e(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 113
    .line 114
    .line 115
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_7

    .line 120
    .line 121
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 126
    .line 127
    .line 128
    :cond_7
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 129
    .line 130
    return-object v0
.end method

.method public static final i(Landroidx/navigation/NavController;Ljava/lang/String;)Lkotlin/Unit;
    .locals 8

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lg7/b;->a()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "DESCRIPTION_KEY_CONTENT"

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v6, 0x6

    .line 16
    const/4 v7, 0x0

    .line 17
    const-string v3, "DESCRIPTION/\u5927\u9898\u8bf4\u660e"

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    move-object v2, p0

    .line 22
    invoke-static/range {v2 .. v7}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0
.end method

.method public static final j(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    .line 1
    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v8

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->g(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

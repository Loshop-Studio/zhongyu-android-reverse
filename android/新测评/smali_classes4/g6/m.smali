.class public abstract Lg6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJZLkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, Lg6/m;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJZLkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;FLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lg6/m;->l(Ljava/util/List;FLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function2;Lw5/b;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lg6/m;->m(Lkotlin/jvm/functions/Function2;Lw5/b;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lg6/m;->k(Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;JLandroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lg6/m;->h(Ljava/lang/String;JLandroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lg6/m;->n(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-wide/from16 v5, p4

    .line 4
    .line 5
    move/from16 v7, p6

    .line 6
    .line 7
    move-object/from16 v8, p7

    .line 8
    .line 9
    move/from16 v0, p9

    .line 10
    .line 11
    const-string v1, "option"

    .line 12
    .line 13
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "onClickItem"

    .line 17
    .line 18
    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const v1, 0x26b3a3ca

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p8

    .line 25
    .line 26
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 27
    .line 28
    .line 29
    move-result-object v15

    .line 30
    and-int/lit8 v3, p10, 0x1

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    or-int/lit8 v9, v0, 0x6

    .line 35
    .line 36
    move v10, v9

    .line 37
    move-object/from16 v9, p0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    and-int/lit8 v9, v0, 0x6

    .line 41
    .line 42
    if-nez v9, :cond_2

    .line 43
    .line 44
    move-object/from16 v9, p0

    .line 45
    .line 46
    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-eqz v10, :cond_1

    .line 51
    .line 52
    const/4 v10, 0x4

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v10, 0x2

    .line 55
    :goto_0
    or-int/2addr v10, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object/from16 v9, p0

    .line 58
    .line 59
    move v10, v0

    .line 60
    :goto_1
    and-int/lit8 v11, v0, 0x30

    .line 61
    .line 62
    if-nez v11, :cond_4

    .line 63
    .line 64
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-eqz v11, :cond_3

    .line 69
    .line 70
    const/16 v11, 0x20

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    const/16 v11, 0x10

    .line 74
    .line 75
    :goto_2
    or-int/2addr v10, v11

    .line 76
    :cond_4
    and-int/lit16 v11, v0, 0x180

    .line 77
    .line 78
    if-nez v11, :cond_6

    .line 79
    .line 80
    move-wide/from16 v11, p2

    .line 81
    .line 82
    invoke-interface {v15, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    if-eqz v13, :cond_5

    .line 87
    .line 88
    const/16 v13, 0x100

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_5
    const/16 v13, 0x80

    .line 92
    .line 93
    :goto_3
    or-int/2addr v10, v13

    .line 94
    goto :goto_4

    .line 95
    :cond_6
    move-wide/from16 v11, p2

    .line 96
    .line 97
    :goto_4
    and-int/lit16 v13, v0, 0xc00

    .line 98
    .line 99
    if-nez v13, :cond_8

    .line 100
    .line 101
    invoke-interface {v15, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    if-eqz v13, :cond_7

    .line 106
    .line 107
    const/16 v13, 0x800

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_7
    const/16 v13, 0x400

    .line 111
    .line 112
    :goto_5
    or-int/2addr v10, v13

    .line 113
    :cond_8
    and-int/lit16 v13, v0, 0x6000

    .line 114
    .line 115
    if-nez v13, :cond_a

    .line 116
    .line 117
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    if-eqz v13, :cond_9

    .line 122
    .line 123
    const/16 v13, 0x4000

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_9
    const/16 v13, 0x2000

    .line 127
    .line 128
    :goto_6
    or-int/2addr v10, v13

    .line 129
    :cond_a
    const/high16 v13, 0x30000

    .line 130
    .line 131
    and-int/2addr v13, v0

    .line 132
    if-nez v13, :cond_c

    .line 133
    .line 134
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    if-eqz v13, :cond_b

    .line 139
    .line 140
    const/high16 v13, 0x20000

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_b
    const/high16 v13, 0x10000

    .line 144
    .line 145
    :goto_7
    or-int/2addr v10, v13

    .line 146
    :cond_c
    const v13, 0x12493

    .line 147
    .line 148
    .line 149
    and-int/2addr v13, v10

    .line 150
    const v14, 0x12492

    .line 151
    .line 152
    .line 153
    const/4 v12, 0x0

    .line 154
    if-eq v13, v14, :cond_d

    .line 155
    .line 156
    const/4 v13, 0x1

    .line 157
    goto :goto_8

    .line 158
    :cond_d
    move v13, v12

    .line 159
    :goto_8
    and-int/lit8 v14, v10, 0x1

    .line 160
    .line 161
    invoke-interface {v15, v13, v14}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    if-eqz v13, :cond_16

    .line 166
    .line 167
    if-eqz v3, :cond_e

    .line 168
    .line 169
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 170
    .line 171
    goto :goto_9

    .line 172
    :cond_e
    move-object v3, v9

    .line 173
    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    if-eqz v9, :cond_f

    .line 178
    .line 179
    const/4 v9, -0x1

    .line 180
    const-string v13, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionItem (ChoiceQuestionView.kt:62)"

    .line 181
    .line 182
    invoke-static {v1, v10, v9, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :cond_f
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 186
    .line 187
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-static {v9, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    invoke-static {v15, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 200
    .line 201
    .line 202
    move-result-object v14

    .line 203
    invoke-static {v15, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 208
    .line 209
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 214
    .line 215
    .line 216
    move-result-object v18

    .line 217
    if-nez v18, :cond_10

    .line 218
    .line 219
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 220
    .line 221
    .line 222
    :cond_10
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 223
    .line 224
    .line 225
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 226
    .line 227
    .line 228
    move-result v18

    .line 229
    if-eqz v18, :cond_11

    .line 230
    .line 231
    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 232
    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_11
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 236
    .line 237
    .line 238
    :goto_a
    invoke-static {v15}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-static {v12, v9, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-static {v12, v14, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    if-nez v9, :cond_12

    .line 265
    .line 266
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v14

    .line 274
    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    if-nez v9, :cond_13

    .line 279
    .line 280
    :cond_12
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    invoke-interface {v12, v9, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 292
    .line 293
    .line 294
    :cond_13
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-static {v12, v11, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 299
    .line 300
    .line 301
    sget-object v4, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 302
    .line 303
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 304
    .line 305
    const/16 v11, 0x29

    .line 306
    .line 307
    int-to-float v11, v11

    .line 308
    const/16 v12, 0x258

    .line 309
    .line 310
    int-to-float v12, v12

    .line 311
    div-float/2addr v11, v12

    .line 312
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 313
    .line 314
    .line 315
    move-result-object v13

    .line 316
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 317
    .line 318
    .line 319
    move-result-object v13

    .line 320
    iget v14, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 321
    .line 322
    iget v13, v13, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 323
    .line 324
    invoke-static {v14, v13}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 325
    .line 326
    .line 327
    move-result v13

    .line 328
    int-to-float v13, v13

    .line 329
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 330
    .line 331
    .line 332
    move-result-object v14

    .line 333
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 334
    .line 335
    .line 336
    move-result-object v14

    .line 337
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 338
    .line 339
    div-float/2addr v13, v14

    .line 340
    mul-float/2addr v11, v13

    .line 341
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    const/16 v13, 0x13

    .line 346
    .line 347
    int-to-float v13, v13

    .line 348
    div-float/2addr v13, v12

    .line 349
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 350
    .line 351
    .line 352
    move-result-object v14

    .line 353
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 354
    .line 355
    .line 356
    move-result-object v14

    .line 357
    iget v0, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 358
    .line 359
    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 360
    .line 361
    invoke-static {v0, v14}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    int-to-float v0, v0

    .line 366
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 367
    .line 368
    .line 369
    move-result-object v14

    .line 370
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 371
    .line 372
    .line 373
    move-result-object v14

    .line 374
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 375
    .line 376
    div-float/2addr v0, v14

    .line 377
    mul-float/2addr v13, v0

    .line 378
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    invoke-static {v9, v11, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getBottomStart()Landroidx/compose/ui/Alignment;

    .line 387
    .line 388
    .line 389
    move-result-object v11

    .line 390
    invoke-interface {v4, v0, v11}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    const/4 v11, 0x2

    .line 395
    int-to-float v11, v11

    .line 396
    div-float/2addr v11, v12

    .line 397
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 398
    .line 399
    .line 400
    move-result-object v13

    .line 401
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 402
    .line 403
    .line 404
    move-result-object v13

    .line 405
    iget v14, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 406
    .line 407
    iget v13, v13, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 408
    .line 409
    invoke-static {v14, v13}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 410
    .line 411
    .line 412
    move-result v13

    .line 413
    int-to-float v13, v13

    .line 414
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 415
    .line 416
    .line 417
    move-result-object v14

    .line 418
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 419
    .line 420
    .line 421
    move-result-object v14

    .line 422
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 423
    .line 424
    div-float/2addr v13, v14

    .line 425
    mul-float/2addr v11, v13

    .line 426
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 427
    .line 428
    .line 429
    move-result v11

    .line 430
    invoke-static {v11}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 431
    .line 432
    .line 433
    move-result-object v21

    .line 434
    move-object v11, v9

    .line 435
    sget-object v9, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    .line 436
    .line 437
    shr-int/lit8 v13, v10, 0x6

    .line 438
    .line 439
    and-int/lit8 v13, v13, 0xe

    .line 440
    .line 441
    sget v14, Landroidx/compose/material3/ButtonDefaults;->$stable:I

    .line 442
    .line 443
    shl-int/lit8 v14, v14, 0xc

    .line 444
    .line 445
    or-int v19, v13, v14

    .line 446
    .line 447
    const/16 v20, 0xe

    .line 448
    .line 449
    move v14, v12

    .line 450
    const-wide/16 v12, 0x0

    .line 451
    .line 452
    move/from16 v16, v14

    .line 453
    .line 454
    move-object/from16 v18, v15

    .line 455
    .line 456
    const-wide/16 v14, 0x0

    .line 457
    .line 458
    move/from16 v22, v16

    .line 459
    .line 460
    const/16 v23, 0x0

    .line 461
    .line 462
    const-wide/16 v16, 0x0

    .line 463
    .line 464
    move-object/from16 p0, v0

    .line 465
    .line 466
    move-object/from16 p8, v1

    .line 467
    .line 468
    move-object/from16 v24, v3

    .line 469
    .line 470
    move-object v0, v11

    .line 471
    move/from16 v1, v23

    .line 472
    .line 473
    const/4 v3, 0x1

    .line 474
    move/from16 v23, v22

    .line 475
    .line 476
    move/from16 v22, v10

    .line 477
    .line 478
    move-wide/from16 v10, p2

    .line 479
    .line 480
    invoke-virtual/range {v9 .. v20}, Landroidx/compose/material3/ButtonDefaults;->buttonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;

    .line 481
    .line 482
    .line 483
    move-result-object v12

    .line 484
    move-object/from16 v15, v18

    .line 485
    .line 486
    int-to-float v1, v1

    .line 487
    div-float v1, v1, v23

    .line 488
    .line 489
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 490
    .line 491
    .line 492
    move-result-object v9

    .line 493
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 494
    .line 495
    .line 496
    move-result-object v9

    .line 497
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 498
    .line 499
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 500
    .line 501
    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 502
    .line 503
    .line 504
    move-result v9

    .line 505
    int-to-float v9, v9

    .line 506
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 507
    .line 508
    .line 509
    move-result-object v10

    .line 510
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 511
    .line 512
    .line 513
    move-result-object v10

    .line 514
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 515
    .line 516
    div-float/2addr v9, v10

    .line 517
    mul-float/2addr v1, v9

    .line 518
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 519
    .line 520
    .line 521
    move-result v1

    .line 522
    invoke-static {v1}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    new-instance v9, Lg6/k;

    .line 527
    .line 528
    invoke-direct {v9, v2, v5, v6}, Lg6/k;-><init>(Ljava/lang/String;J)V

    .line 529
    .line 530
    .line 531
    const/16 v10, 0x36

    .line 532
    .line 533
    const v11, -0x4ca3b96c

    .line 534
    .line 535
    .line 536
    invoke-static {v11, v3, v9, v15, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 537
    .line 538
    .line 539
    move-result-object v17

    .line 540
    shr-int/lit8 v3, v22, 0xf

    .line 541
    .line 542
    and-int/lit8 v3, v3, 0xe

    .line 543
    .line 544
    const/high16 v9, 0x30c00000

    .line 545
    .line 546
    or-int v19, v3, v9

    .line 547
    .line 548
    const/16 v20, 0x164

    .line 549
    .line 550
    const/4 v10, 0x0

    .line 551
    const/4 v13, 0x0

    .line 552
    const/4 v14, 0x0

    .line 553
    const/16 v16, 0x0

    .line 554
    .line 555
    move-object/from16 v9, p0

    .line 556
    .line 557
    move-object/from16 v11, v21

    .line 558
    .line 559
    move-object v15, v1

    .line 560
    invoke-static/range {v8 .. v20}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v15, v18

    .line 564
    .line 565
    if-eqz v7, :cond_14

    .line 566
    .line 567
    const v1, -0xaa0834e

    .line 568
    .line 569
    .line 570
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 571
    .line 572
    .line 573
    const v1, 0x7f0800f8

    .line 574
    .line 575
    .line 576
    const/4 v3, 0x6

    .line 577
    invoke-static {v1, v15, v3}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 578
    .line 579
    .line 580
    move-result-object v8

    .line 581
    const/16 v1, 0x9

    .line 582
    .line 583
    int-to-float v1, v1

    .line 584
    div-float v1, v1, v23

    .line 585
    .line 586
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    iget v9, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 595
    .line 596
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 597
    .line 598
    invoke-static {v9, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    int-to-float v3, v3

    .line 603
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 604
    .line 605
    .line 606
    move-result-object v9

    .line 607
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 608
    .line 609
    .line 610
    move-result-object v9

    .line 611
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 612
    .line 613
    div-float/2addr v3, v9

    .line 614
    mul-float/2addr v1, v3

    .line 615
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/ui/Alignment$Companion;->getTopEnd()Landroidx/compose/ui/Alignment;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-interface {v4, v0, v1}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 628
    .line 629
    .line 630
    move-result-object v10

    .line 631
    const/16 v16, 0x30

    .line 632
    .line 633
    const/16 v17, 0x78

    .line 634
    .line 635
    const/4 v9, 0x0

    .line 636
    const/4 v11, 0x0

    .line 637
    const/4 v12, 0x0

    .line 638
    const/4 v13, 0x0

    .line 639
    const/4 v14, 0x0

    .line 640
    invoke-static/range {v8 .. v17}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 641
    .line 642
    .line 643
    :goto_b
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 644
    .line 645
    .line 646
    goto :goto_c

    .line 647
    :cond_14
    const v0, -0xacc1122

    .line 648
    .line 649
    .line 650
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 651
    .line 652
    .line 653
    goto :goto_b

    .line 654
    :goto_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 655
    .line 656
    .line 657
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    if-eqz v0, :cond_15

    .line 662
    .line 663
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 664
    .line 665
    .line 666
    :cond_15
    move-object/from16 v1, v24

    .line 667
    .line 668
    goto :goto_d

    .line 669
    :cond_16
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 670
    .line 671
    .line 672
    move-object v1, v9

    .line 673
    :goto_d
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 674
    .line 675
    .line 676
    move-result-object v11

    .line 677
    if-eqz v11, :cond_17

    .line 678
    .line 679
    new-instance v0, Lg6/l;

    .line 680
    .line 681
    move-wide/from16 v3, p2

    .line 682
    .line 683
    move-object/from16 v8, p7

    .line 684
    .line 685
    move/from16 v9, p9

    .line 686
    .line 687
    move/from16 v10, p10

    .line 688
    .line 689
    invoke-direct/range {v0 .. v10}, Lg6/l;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJZLkotlin/jvm/functions/Function0;II)V

    .line 690
    .line 691
    .line 692
    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 693
    .line 694
    .line 695
    :cond_17
    return-void
.end method

.method public static final h(Ljava/lang/String;JLandroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 25

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move/from16 v1, p5

    .line 4
    .line 5
    const-string v2, "$this$Button"

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    and-int/lit8 v2, v1, 0x11

    .line 13
    .line 14
    const/16 v3, 0x10

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    move v2, v5

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v4

    .line 23
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 24
    .line 25
    invoke-interface {v0, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_6

    .line 30
    .line 31
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    const/4 v2, -0x1

    .line 38
    const-string v3, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionItem.<anonymous>.<anonymous> (ChoiceQuestionView.kt:73)"

    .line 39
    .line 40
    const v6, -0x4ca3b96c

    .line 41
    .line 42
    .line 43
    invoke-static {v6, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-static {v1, v2, v5, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 55
    .line 56
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-static {v0, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v0, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 77
    .line 78
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    if-nez v9, :cond_2

    .line 87
    .line 88
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 89
    .line 90
    .line 91
    :cond_2
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_3

    .line 99
    .line 100
    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 105
    .line 106
    .line 107
    :goto_1
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-static {v8, v5, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-static {v8, v6, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-nez v6, :cond_4

    .line 134
    .line 135
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-nez v6, :cond_5

    .line 148
    .line 149
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-interface {v8, v4, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 161
    .line 162
    .line 163
    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    invoke-static {v8, v2, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    sget-object v2, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 171
    .line 172
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-interface {v2, v1, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    const/4 v2, 0x7

    .line 181
    invoke-static {v2}, Lo5/e;->k(I)J

    .line 182
    .line 183
    .line 184
    move-result-wide v4

    .line 185
    const/16 v23, 0x0

    .line 186
    .line 187
    const v24, 0x1fff0

    .line 188
    .line 189
    .line 190
    const/4 v6, 0x0

    .line 191
    const/4 v7, 0x0

    .line 192
    const/4 v8, 0x0

    .line 193
    const-wide/16 v9, 0x0

    .line 194
    .line 195
    const/4 v11, 0x0

    .line 196
    const/4 v12, 0x0

    .line 197
    const-wide/16 v13, 0x0

    .line 198
    .line 199
    const/4 v15, 0x0

    .line 200
    const/16 v16, 0x0

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const/16 v18, 0x0

    .line 205
    .line 206
    const/16 v19, 0x0

    .line 207
    .line 208
    const/16 v20, 0x0

    .line 209
    .line 210
    const/16 v22, 0xc00

    .line 211
    .line 212
    move-wide/from16 v2, p1

    .line 213
    .line 214
    move-object/from16 v21, v0

    .line 215
    .line 216
    move-object/from16 v0, p0

    .line 217
    .line 218
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 219
    .line 220
    .line 221
    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 222
    .line 223
    .line 224
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    if-eqz v0, :cond_7

    .line 229
    .line 230
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_6
    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 235
    .line 236
    .line 237
    :cond_7
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJZLkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 12

    .line 1
    or-int/lit8 v0, p8, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v10

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-wide v3, p2

    .line 10
    move-wide/from16 v5, p4

    .line 11
    .line 12
    move/from16 v7, p6

    .line 13
    .line 14
    move-object/from16 v8, p7

    .line 15
    .line 16
    move/from16 v11, p9

    .line 17
    .line 18
    move-object/from16 v9, p10

    .line 19
    .line 20
    invoke-static/range {v1 .. v11}, Lg6/m;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final j(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    .line 1
    const-string v0, "number"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "options"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onClickItem"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v0, 0x3f7c90e7

    .line 17
    .line 18
    .line 19
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    and-int/lit8 p3, p4, 0x6

    .line 24
    .line 25
    if-nez p3, :cond_1

    .line 26
    .line 27
    invoke-interface {v4, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    const/4 p3, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p3, 0x2

    .line 36
    :goto_0
    or-int/2addr p3, p4

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move p3, p4

    .line 39
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 40
    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    invoke-interface {v4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    const/16 v1, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v1, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr p3, v1

    .line 55
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 56
    .line 57
    if-nez v1, :cond_5

    .line 58
    .line 59
    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    const/16 v1, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v1, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr p3, v1

    .line 71
    :cond_5
    and-int/lit16 v1, p3, 0x93

    .line 72
    .line 73
    const/16 v2, 0x92

    .line 74
    .line 75
    const/4 v3, 0x1

    .line 76
    if-eq v1, v2, :cond_6

    .line 77
    .line 78
    move v1, v3

    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/4 v1, 0x0

    .line 81
    :goto_4
    and-int/lit8 v2, p3, 0x1

    .line 82
    .line 83
    invoke-interface {v4, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_8

    .line 88
    .line 89
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_7

    .line 94
    .line 95
    const/4 v1, -0x1

    .line 96
    const-string v2, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionView (ChoiceQuestionView.kt:26)"

    .line 97
    .line 98
    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    new-instance v0, Lg6/g;

    .line 102
    .line 103
    invoke-direct {v0, p1, p2}, Lg6/g;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;)V

    .line 104
    .line 105
    .line 106
    const/16 v1, 0x36

    .line 107
    .line 108
    const v2, 0x5883fb92

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v3, v0, v4, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    shl-int/lit8 p3, p3, 0x3

    .line 116
    .line 117
    and-int/lit8 p3, p3, 0x70

    .line 118
    .line 119
    or-int/lit16 v5, p3, 0x180

    .line 120
    .line 121
    const/4 v6, 0x1

    .line 122
    const/4 v1, 0x0

    .line 123
    move-object v2, p0

    .line 124
    invoke-static/range {v1 .. v6}, Lf6/f;->j(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 125
    .line 126
    .line 127
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_9

    .line 132
    .line 133
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_8
    move-object v2, p0

    .line 138
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 139
    .line 140
    .line 141
    :cond_9
    :goto_5
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_a

    .line 146
    .line 147
    new-instance p3, Lg6/h;

    .line 148
    .line 149
    invoke-direct {p3, v2, p1, p2, p4}, Lg6/h;-><init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p0, p3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    :cond_a
    return-void
.end method

.method public static final k(Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    .line 1
    const-string v1, "$this$NumberWithContent"

    .line 2
    .line 3
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    and-int/lit8 v1, p4, 0x11

    .line 7
    .line 8
    const/16 v2, 0x10

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    move v1, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    and-int/lit8 v2, p4, 0x1

    .line 17
    .line 18
    invoke-interface {p3, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    const/4 v1, -0x1

    .line 31
    const-string v2, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionView.<anonymous> (ChoiceQuestionView.kt:30)"

    .line 32
    .line 33
    const v4, 0x5883fb92

    .line 34
    .line 35
    .line 36
    invoke-static {v4, p4, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/16 v0, 0x2b

    .line 40
    .line 41
    int-to-float v0, v0

    .line 42
    const/16 v1, 0x258

    .line 43
    .line 44
    int-to-float v1, v1

    .line 45
    div-float/2addr v0, v1

    .line 46
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget v4, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 55
    .line 56
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 57
    .line 58
    invoke-static {v4, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    int-to-float v2, v2

    .line 63
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 72
    .line 73
    div-float/2addr v2, v4

    .line 74
    mul-float/2addr v0, v2

    .line 75
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v2, 0x3

    .line 80
    int-to-float v2, v2

    .line 81
    div-float/2addr v2, v1

    .line 82
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 91
    .line 92
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 93
    .line 94
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    int-to-float v4, v4

    .line 99
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 108
    .line 109
    div-float/2addr v4, v5

    .line 110
    mul-float/2addr v2, v4

    .line 111
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 116
    .line 117
    const/4 v5, 0x6

    .line 118
    int-to-float v5, v5

    .line 119
    mul-float v6, v0, v5

    .line 120
    .line 121
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    mul-float/2addr v5, v2

    .line 126
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    add-float/2addr v6, v5

    .line 131
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    const/4 v6, 0x0

    .line 136
    const/4 v8, 0x0

    .line 137
    invoke-static {v4, v8, v5, v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 142
    .line 143
    invoke-virtual {v5, v2}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    int-to-float v6, v3

    .line 148
    div-float/2addr v6, v1

    .line 149
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    iget v8, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 158
    .line 159
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 160
    .line 161
    invoke-static {v8, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    int-to-float v1, v1

    .line 166
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 175
    .line 176
    div-float/2addr v1, v8

    .line 177
    mul-float/2addr v6, v1

    .line 178
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-virtual {v5, v1}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    new-instance v5, Lg6/i;

    .line 187
    .line 188
    invoke-direct {v5, p0, v0, p1}, Lg6/i;-><init>(Ljava/util/List;FLkotlin/jvm/functions/Function2;)V

    .line 189
    .line 190
    .line 191
    const/16 v0, 0x36

    .line 192
    .line 193
    const v6, 0x11aff24d

    .line 194
    .line 195
    .line 196
    invoke-static {v6, v3, v5, p3, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    const v8, 0x1801b6

    .line 201
    .line 202
    .line 203
    const/16 v9, 0x38

    .line 204
    .line 205
    const/4 v3, 0x0

    .line 206
    move-object v0, v4

    .line 207
    const/4 v4, 0x0

    .line 208
    const/4 v5, 0x0

    .line 209
    move-object v7, v2

    .line 210
    move-object v2, v1

    .line 211
    move-object v1, v7

    .line 212
    move-object v7, p3

    .line 213
    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 214
    .line 215
    .line 216
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_3

    .line 221
    .line 222
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_2
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 227
    .line 228
    .line 229
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 230
    .line 231
    return-object v0
.end method

.method public static final l(Ljava/util/List;FLkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v9, p4

    .line 4
    .line 5
    move/from16 v1, p5

    .line 6
    .line 7
    const-string v2, "$this$FlowRow"

    .line 8
    .line 9
    move-object/from16 v3, p3

    .line 10
    .line 11
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    and-int/lit8 v2, v1, 0x11

    .line 15
    .line 16
    const/16 v3, 0x10

    .line 17
    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x0

    .line 23
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 24
    .line 25
    invoke-interface {v9, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_5

    .line 30
    .line 31
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    const/4 v2, -0x1

    .line 38
    const-string v3, "com.zykj.evaluation.ui.detail.widget.question.ChoiceQuestionView.<anonymous>.<anonymous> (ChoiceQuestionView.kt:37)"

    .line 39
    .line 40
    const v4, 0x11aff24d

    .line 41
    .line 42
    .line 43
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v12

    .line 50
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lw5/b;

    .line 61
    .line 62
    invoke-virtual {v1}, Lw5/b;->c()Lw5/a;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    instance-of v2, v2, Lw5/a$a;

    .line 67
    .line 68
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 69
    .line 70
    const/16 v4, 0x18

    .line 71
    .line 72
    int-to-float v4, v4

    .line 73
    const/16 v5, 0x258

    .line 74
    .line 75
    int-to-float v5, v5

    .line 76
    div-float/2addr v4, v5

    .line 77
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 86
    .line 87
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 88
    .line 89
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    int-to-float v5, v5

    .line 94
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 103
    .line 104
    div-float/2addr v5, v6

    .line 105
    mul-float/2addr v4, v5

    .line 106
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    move/from16 v13, p1

    .line 111
    .line 112
    invoke-static {v3, v13, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v1}, Lw5/b;->d()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v1}, Lw5/b;->c()Lw5/a;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v5}, Lw5/a;->a()J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    invoke-virtual {v1}, Lw5/b;->c()Lw5/a;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-virtual {v7}, Lw5/a;->b()J

    .line 133
    .line 134
    .line 135
    move-result-wide v7

    .line 136
    move-object v10, v4

    .line 137
    move-wide v15, v7

    .line 138
    move-object v8, v3

    .line 139
    move-wide v3, v5

    .line 140
    move-wide v5, v15

    .line 141
    invoke-virtual {v1}, Lw5/b;->e()Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v11

    .line 149
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    or-int/2addr v11, v14

    .line 154
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 155
    .line 156
    .line 157
    move-result v14

    .line 158
    or-int/2addr v11, v14

    .line 159
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    if-nez v11, :cond_2

    .line 164
    .line 165
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 166
    .line 167
    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    if-ne v14, v11, :cond_3

    .line 172
    .line 173
    :cond_2
    new-instance v14, Lg6/j;

    .line 174
    .line 175
    invoke-direct {v14, v0, v1, v2}, Lg6/j;-><init>(Lkotlin/jvm/functions/Function2;Lw5/b;Z)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v9, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_3
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 182
    .line 183
    move-object v2, v10

    .line 184
    const/4 v10, 0x6

    .line 185
    const/4 v11, 0x0

    .line 186
    move-object v1, v8

    .line 187
    move-object v8, v14

    .line 188
    invoke-static/range {v1 .. v11}, Lg6/m;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 189
    .line 190
    .line 191
    move-object/from16 v9, p4

    .line 192
    .line 193
    goto/16 :goto_1

    .line 194
    .line 195
    :cond_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_6

    .line 200
    .line 201
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_5
    invoke-interface/range {p4 .. p4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 206
    .line 207
    .line 208
    :cond_6
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 209
    .line 210
    return-object v0
.end method

.method public static final m(Lkotlin/jvm/functions/Function2;Lw5/b;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lw5/b;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method public static final n(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    invoke-static {p0, p1, p2, p4, p3}, Lg6/m;->j(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

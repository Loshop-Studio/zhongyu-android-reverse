.class public abstract Lb7/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lb7/s0;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lb7/s0;->j(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lb7/s0;->i(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lb7/s0;->f(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "onClick"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const v2, 0x554f4583

    .line 16
    .line 17
    .line 18
    move-object/from16 v3, p2

    .line 19
    .line 20
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    and-int/lit8 v4, p3, 0x6

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    if-nez v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v4, v5

    .line 38
    :goto_0
    or-int v4, p3, v4

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move/from16 v4, p3

    .line 42
    .line 43
    :goto_1
    and-int/lit8 v6, p3, 0x30

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    if-nez v6, :cond_3

    .line 48
    .line 49
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    move v6, v7

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v6, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v4, v6

    .line 60
    :cond_3
    and-int/lit8 v6, v4, 0x13

    .line 61
    .line 62
    const/16 v8, 0x12

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    const/4 v10, 0x1

    .line 66
    if-eq v6, v8, :cond_4

    .line 67
    .line 68
    move v6, v10

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move v6, v9

    .line 71
    :goto_3
    and-int/lit8 v8, v4, 0x1

    .line 72
    .line 73
    invoke-interface {v3, v6, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_d

    .line 78
    .line 79
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_5

    .line 84
    .line 85
    const/4 v6, -0x1

    .line 86
    const-string v8, "com.zykj.evaluation.ui.sheet.widget.NormalButtonView (CommonView.kt:26)"

    .line 87
    .line 88
    invoke-static {v2, v4, v6, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 92
    .line 93
    const/16 v6, 0x2d

    .line 94
    .line 95
    int-to-float v6, v6

    .line 96
    const/16 v8, 0x258

    .line 97
    .line 98
    int-to-float v8, v8

    .line 99
    div-float/2addr v6, v8

    .line 100
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 109
    .line 110
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 111
    .line 112
    invoke-static {v12, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    int-to-float v11, v11

    .line 117
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 126
    .line 127
    div-float/2addr v11, v12

    .line 128
    mul-float/2addr v6, v11

    .line 129
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    const/16 v11, 0x14

    .line 134
    .line 135
    int-to-float v11, v11

    .line 136
    div-float/2addr v11, v8

    .line 137
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    iget v13, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 146
    .line 147
    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 148
    .line 149
    invoke-static {v13, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 150
    .line 151
    .line 152
    move-result v12

    .line 153
    int-to-float v12, v12

    .line 154
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 163
    .line 164
    div-float/2addr v12, v13

    .line 165
    mul-float/2addr v11, v12

    .line 166
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    invoke-static {v2, v6, v11}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    int-to-float v11, v10

    .line 175
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    const-wide v12, 0xff48a0f8L

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    invoke-static {v12, v13}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 185
    .line 186
    .line 187
    move-result-wide v14

    .line 188
    int-to-float v5, v5

    .line 189
    div-float/2addr v5, v8

    .line 190
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    move-wide/from16 v16, v12

    .line 199
    .line 200
    iget v12, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 201
    .line 202
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 203
    .line 204
    invoke-static {v12, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    int-to-float v8, v8

    .line 209
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 218
    .line 219
    div-float/2addr v8, v12

    .line 220
    mul-float/2addr v5, v8

    .line 221
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-static {v6, v11, v14, v15, v5}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    and-int/lit8 v6, v4, 0x70

    .line 234
    .line 235
    if-ne v6, v7, :cond_6

    .line 236
    .line 237
    move v6, v10

    .line 238
    goto :goto_4

    .line 239
    :cond_6
    move v6, v9

    .line 240
    :goto_4
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    if-nez v6, :cond_7

    .line 245
    .line 246
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 247
    .line 248
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    if-ne v7, v6, :cond_8

    .line 253
    .line 254
    :cond_7
    new-instance v7, Lb7/q0;

    .line 255
    .line 256
    invoke-direct {v7, v1}, Lb7/q0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 263
    .line 264
    const/4 v6, 0x0

    .line 265
    invoke-static {v5, v9, v7, v10, v6}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 270
    .line 271
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    invoke-static {v3, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    invoke-static {v3, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 292
    .line 293
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 298
    .line 299
    .line 300
    move-result-object v12

    .line 301
    if-nez v12, :cond_9

    .line 302
    .line 303
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 304
    .line 305
    .line 306
    :cond_9
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 307
    .line 308
    .line 309
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    if-eqz v12, :cond_a

    .line 314
    .line 315
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 316
    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_a
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 320
    .line 321
    .line 322
    :goto_5
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    invoke-static {v11, v7, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    invoke-static {v11, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    if-nez v9, :cond_b

    .line 349
    .line 350
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v12

    .line 358
    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    if-nez v9, :cond_c

    .line 363
    .line 364
    :cond_b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    invoke-interface {v11, v8, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 376
    .line 377
    .line 378
    :cond_c
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    invoke-static {v11, v5, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 383
    .line 384
    .line 385
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 386
    .line 387
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-interface {v5, v2, v6}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    new-instance v18, Landroidx/compose/ui/text/TextStyle;

    .line 396
    .line 397
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 398
    .line 399
    .line 400
    move-result-wide v19

    .line 401
    const/4 v5, 0x6

    .line 402
    invoke-static {v5}, Lo5/e;->k(I)J

    .line 403
    .line 404
    .line 405
    move-result-wide v21

    .line 406
    const v48, 0xfffffc

    .line 407
    .line 408
    .line 409
    const/16 v49, 0x0

    .line 410
    .line 411
    const/16 v23, 0x0

    .line 412
    .line 413
    const/16 v24, 0x0

    .line 414
    .line 415
    const/16 v25, 0x0

    .line 416
    .line 417
    const/16 v26, 0x0

    .line 418
    .line 419
    const/16 v27, 0x0

    .line 420
    .line 421
    const-wide/16 v28, 0x0

    .line 422
    .line 423
    const/16 v30, 0x0

    .line 424
    .line 425
    const/16 v31, 0x0

    .line 426
    .line 427
    const/16 v32, 0x0

    .line 428
    .line 429
    const-wide/16 v33, 0x0

    .line 430
    .line 431
    const/16 v35, 0x0

    .line 432
    .line 433
    const/16 v36, 0x0

    .line 434
    .line 435
    const/16 v37, 0x0

    .line 436
    .line 437
    const/16 v38, 0x0

    .line 438
    .line 439
    const/16 v39, 0x0

    .line 440
    .line 441
    const-wide/16 v40, 0x0

    .line 442
    .line 443
    const/16 v42, 0x0

    .line 444
    .line 445
    const/16 v43, 0x0

    .line 446
    .line 447
    const/16 v44, 0x0

    .line 448
    .line 449
    const/16 v45, 0x0

    .line 450
    .line 451
    const/16 v46, 0x0

    .line 452
    .line 453
    const/16 v47, 0x0

    .line 454
    .line 455
    invoke-direct/range {v18 .. v49}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 456
    .line 457
    .line 458
    and-int/lit8 v22, v4, 0xe

    .line 459
    .line 460
    const/high16 v23, 0x180000

    .line 461
    .line 462
    const v24, 0xfffc

    .line 463
    .line 464
    .line 465
    move-object v1, v2

    .line 466
    move-object/from16 v21, v3

    .line 467
    .line 468
    const-wide/16 v2, 0x0

    .line 469
    .line 470
    const-wide/16 v4, 0x0

    .line 471
    .line 472
    const/4 v6, 0x0

    .line 473
    const/4 v7, 0x0

    .line 474
    const/4 v8, 0x0

    .line 475
    const-wide/16 v9, 0x0

    .line 476
    .line 477
    const/4 v11, 0x0

    .line 478
    const/4 v12, 0x0

    .line 479
    const-wide/16 v13, 0x0

    .line 480
    .line 481
    const/4 v15, 0x0

    .line 482
    const/16 v16, 0x0

    .line 483
    .line 484
    const/16 v17, 0x0

    .line 485
    .line 486
    move-object/from16 v20, v18

    .line 487
    .line 488
    const/16 v18, 0x0

    .line 489
    .line 490
    const/16 v19, 0x0

    .line 491
    .line 492
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 493
    .line 494
    .line 495
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 496
    .line 497
    .line 498
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    if-eqz v1, :cond_e

    .line 503
    .line 504
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 505
    .line 506
    .line 507
    goto :goto_6

    .line 508
    :cond_d
    move-object/from16 v21, v3

    .line 509
    .line 510
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 511
    .line 512
    .line 513
    :cond_e
    :goto_6
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    if-eqz v1, :cond_f

    .line 518
    .line 519
    new-instance v2, Lb7/r0;

    .line 520
    .line 521
    move-object/from16 v3, p1

    .line 522
    .line 523
    move/from16 v4, p3

    .line 524
    .line 525
    invoke-direct {v2, v0, v3, v4}, Lb7/r0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;I)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 529
    .line 530
    .line 531
    :cond_f
    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final g(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p0, p1, p3, p2}, Lb7/s0;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final h(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "name"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "onClick"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const v2, 0x1083b28d

    .line 16
    .line 17
    .line 18
    move-object/from16 v3, p2

    .line 19
    .line 20
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    and-int/lit8 v4, p3, 0x6

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    if-nez v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v4, v5

    .line 38
    :goto_0
    or-int v4, p3, v4

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move/from16 v4, p3

    .line 42
    .line 43
    :goto_1
    and-int/lit8 v6, p3, 0x30

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    if-nez v6, :cond_3

    .line 48
    .line 49
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    move v6, v7

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v6, 0x10

    .line 58
    .line 59
    :goto_2
    or-int/2addr v4, v6

    .line 60
    :cond_3
    and-int/lit8 v6, v4, 0x13

    .line 61
    .line 62
    const/16 v8, 0x12

    .line 63
    .line 64
    const/4 v9, 0x1

    .line 65
    const/4 v10, 0x0

    .line 66
    if-eq v6, v8, :cond_4

    .line 67
    .line 68
    move v6, v9

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    move v6, v10

    .line 71
    :goto_3
    and-int/lit8 v8, v4, 0x1

    .line 72
    .line 73
    invoke-interface {v3, v6, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_d

    .line 78
    .line 79
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_5

    .line 84
    .line 85
    const/4 v6, -0x1

    .line 86
    const-string v8, "com.zykj.evaluation.ui.sheet.widget.SpecialButtonView (CommonView.kt:57)"

    .line 87
    .line 88
    invoke-static {v2, v4, v6, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 92
    .line 93
    const/16 v6, 0x2d

    .line 94
    .line 95
    int-to-float v6, v6

    .line 96
    const/16 v8, 0x258

    .line 97
    .line 98
    int-to-float v8, v8

    .line 99
    div-float/2addr v6, v8

    .line 100
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    iget v12, v11, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 109
    .line 110
    iget v11, v11, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 111
    .line 112
    invoke-static {v12, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    int-to-float v11, v11

    .line 117
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 126
    .line 127
    div-float/2addr v11, v12

    .line 128
    mul-float/2addr v6, v11

    .line 129
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    const/16 v11, 0x14

    .line 134
    .line 135
    int-to-float v11, v11

    .line 136
    div-float/2addr v11, v8

    .line 137
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    iget v13, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 146
    .line 147
    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 148
    .line 149
    invoke-static {v13, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 150
    .line 151
    .line 152
    move-result v12

    .line 153
    int-to-float v12, v12

    .line 154
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object v13

    .line 158
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 163
    .line 164
    div-float/2addr v12, v13

    .line 165
    mul-float/2addr v11, v12

    .line 166
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    invoke-static {v2, v6, v11}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    const-wide v11, 0xff48a0f8L

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 180
    .line 181
    .line 182
    move-result-wide v11

    .line 183
    int-to-float v5, v5

    .line 184
    div-float/2addr v5, v8

    .line 185
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    iget v13, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 194
    .line 195
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 196
    .line 197
    invoke-static {v13, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    int-to-float v8, v8

    .line 202
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 203
    .line 204
    .line 205
    move-result-object v13

    .line 206
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 211
    .line 212
    div-float/2addr v8, v13

    .line 213
    mul-float/2addr v5, v8

    .line 214
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-static {v6, v11, v12, v5}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    and-int/lit8 v6, v4, 0x70

    .line 227
    .line 228
    if-ne v6, v7, :cond_6

    .line 229
    .line 230
    move v6, v9

    .line 231
    goto :goto_4

    .line 232
    :cond_6
    move v6, v10

    .line 233
    :goto_4
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    if-nez v6, :cond_7

    .line 238
    .line 239
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 240
    .line 241
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    if-ne v7, v6, :cond_8

    .line 246
    .line 247
    :cond_7
    new-instance v7, Lb7/o0;

    .line 248
    .line 249
    invoke-direct {v7, v1}, Lb7/o0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v3, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 256
    .line 257
    const/4 v6, 0x0

    .line 258
    invoke-static {v5, v10, v7, v9, v6}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 263
    .line 264
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-static {v3, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    invoke-static {v3, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 285
    .line 286
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    if-nez v12, :cond_9

    .line 295
    .line 296
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 297
    .line 298
    .line 299
    :cond_9
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 300
    .line 301
    .line 302
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 303
    .line 304
    .line 305
    move-result v12

    .line 306
    if-eqz v12, :cond_a

    .line 307
    .line 308
    invoke-interface {v3, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_a
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 313
    .line 314
    .line 315
    :goto_5
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 316
    .line 317
    .line 318
    move-result-object v11

    .line 319
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 320
    .line 321
    .line 322
    move-result-object v12

    .line 323
    invoke-static {v11, v7, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    invoke-static {v11, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    if-nez v9, :cond_b

    .line 342
    .line 343
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v9

    .line 347
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v9

    .line 355
    if-nez v9, :cond_c

    .line 356
    .line 357
    :cond_b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 358
    .line 359
    .line 360
    move-result-object v9

    .line 361
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    invoke-interface {v11, v8, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 369
    .line 370
    .line 371
    :cond_c
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    invoke-static {v11, v5, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 376
    .line 377
    .line 378
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 379
    .line 380
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 381
    .line 382
    .line 383
    move-result-object v6

    .line 384
    invoke-interface {v5, v2, v6}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    new-instance v20, Landroidx/compose/ui/text/TextStyle;

    .line 389
    .line 390
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 391
    .line 392
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 393
    .line 394
    .line 395
    move-result-wide v6

    .line 396
    const/4 v5, 0x6

    .line 397
    invoke-static {v5}, Lo5/e;->k(I)J

    .line 398
    .line 399
    .line 400
    move-result-wide v8

    .line 401
    const v35, 0xfffffc

    .line 402
    .line 403
    .line 404
    const/16 v36, 0x0

    .line 405
    .line 406
    const/4 v10, 0x0

    .line 407
    const/4 v11, 0x0

    .line 408
    const/4 v12, 0x0

    .line 409
    const/4 v13, 0x0

    .line 410
    const/4 v14, 0x0

    .line 411
    const-wide/16 v15, 0x0

    .line 412
    .line 413
    const/16 v17, 0x0

    .line 414
    .line 415
    const/16 v18, 0x0

    .line 416
    .line 417
    const/16 v19, 0x0

    .line 418
    .line 419
    move-object/from16 v5, v20

    .line 420
    .line 421
    const-wide/16 v20, 0x0

    .line 422
    .line 423
    const/16 v22, 0x0

    .line 424
    .line 425
    const/16 v23, 0x0

    .line 426
    .line 427
    const/16 v24, 0x0

    .line 428
    .line 429
    const/16 v25, 0x0

    .line 430
    .line 431
    const/16 v26, 0x0

    .line 432
    .line 433
    const-wide/16 v27, 0x0

    .line 434
    .line 435
    const/16 v29, 0x0

    .line 436
    .line 437
    const/16 v30, 0x0

    .line 438
    .line 439
    const/16 v31, 0x0

    .line 440
    .line 441
    const/16 v32, 0x0

    .line 442
    .line 443
    const/16 v33, 0x0

    .line 444
    .line 445
    const/16 v34, 0x0

    .line 446
    .line 447
    invoke-direct/range {v5 .. v36}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 448
    .line 449
    .line 450
    and-int/lit8 v22, v4, 0xe

    .line 451
    .line 452
    const/high16 v23, 0x180000

    .line 453
    .line 454
    const v24, 0xfffc

    .line 455
    .line 456
    .line 457
    move-object v1, v2

    .line 458
    move-object/from16 v21, v3

    .line 459
    .line 460
    const-wide/16 v2, 0x0

    .line 461
    .line 462
    move-object/from16 v20, v5

    .line 463
    .line 464
    const-wide/16 v4, 0x0

    .line 465
    .line 466
    const/4 v6, 0x0

    .line 467
    const/4 v7, 0x0

    .line 468
    const/4 v8, 0x0

    .line 469
    const-wide/16 v9, 0x0

    .line 470
    .line 471
    const-wide/16 v13, 0x0

    .line 472
    .line 473
    const/4 v15, 0x0

    .line 474
    const/16 v16, 0x0

    .line 475
    .line 476
    const/16 v17, 0x0

    .line 477
    .line 478
    const/16 v18, 0x0

    .line 479
    .line 480
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 481
    .line 482
    .line 483
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 484
    .line 485
    .line 486
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 487
    .line 488
    .line 489
    move-result v1

    .line 490
    if-eqz v1, :cond_e

    .line 491
    .line 492
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 493
    .line 494
    .line 495
    goto :goto_6

    .line 496
    :cond_d
    move-object/from16 v21, v3

    .line 497
    .line 498
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 499
    .line 500
    .line 501
    :cond_e
    :goto_6
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    if-eqz v1, :cond_f

    .line 506
    .line 507
    new-instance v2, Lb7/p0;

    .line 508
    .line 509
    move-object/from16 v3, p1

    .line 510
    .line 511
    move/from16 v4, p3

    .line 512
    .line 513
    invoke-direct {v2, v0, v3, v4}, Lb7/p0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;I)V

    .line 514
    .line 515
    .line 516
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 517
    .line 518
    .line 519
    :cond_f
    return-void
.end method

.method public static final i(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final j(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-static {p0, p1, p3, p2}, Lb7/s0;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.class public abstract Lz5/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
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

.method public static final B(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
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

.method public static final C(Ljava/lang/String;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    invoke-static {p0, p1, p4, p2, p3}, Lz5/i0;->z(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final D(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 45

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const v0, 0xdfc709d

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p3

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v12

    .line 16
    and-int/lit8 v1, p5, 0x1

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    or-int/lit8 v5, v4, 0x6

    .line 21
    .line 22
    move v6, v5

    .line 23
    move-object/from16 v5, p0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v5, v4, 0x6

    .line 27
    .line 28
    if-nez v5, :cond_2

    .line 29
    .line 30
    move-object/from16 v5, p0

    .line 31
    .line 32
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    const/4 v6, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v6, 0x2

    .line 41
    :goto_0
    or-int/2addr v6, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object/from16 v5, p0

    .line 44
    .line 45
    move v6, v4

    .line 46
    :goto_1
    and-int/lit8 v7, v4, 0x30

    .line 47
    .line 48
    if-nez v7, :cond_4

    .line 49
    .line 50
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_3

    .line 55
    .line 56
    const/16 v7, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const/16 v7, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v6, v7

    .line 62
    :cond_4
    and-int/lit16 v7, v4, 0x180

    .line 63
    .line 64
    if-nez v7, :cond_6

    .line 65
    .line 66
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_5

    .line 71
    .line 72
    const/16 v7, 0x100

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    const/16 v7, 0x80

    .line 76
    .line 77
    :goto_3
    or-int/2addr v6, v7

    .line 78
    :cond_6
    and-int/lit16 v7, v6, 0x93

    .line 79
    .line 80
    const/16 v8, 0x92

    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    const/4 v10, 0x1

    .line 84
    if-eq v7, v8, :cond_7

    .line 85
    .line 86
    move v7, v10

    .line 87
    goto :goto_4

    .line 88
    :cond_7
    move v7, v9

    .line 89
    :goto_4
    and-int/lit8 v8, v6, 0x1

    .line 90
    .line 91
    invoke-interface {v12, v7, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_f

    .line 96
    .line 97
    if-eqz v1, :cond_8

    .line 98
    .line 99
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    move-object v1, v5

    .line 103
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_9

    .line 108
    .line 109
    const/4 v5, -0x1

    .line 110
    const-string v7, "com.zykj.evaluation.ui.detail.mistake.TagView (MistakeMainView.kt:359)"

    .line 111
    .line 112
    invoke-static {v0, v6, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_9
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 116
    .line 117
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 122
    .line 123
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-static {v5, v6, v12, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v12, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-static {v12, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 144
    .line 145
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    if-nez v13, :cond_a

    .line 154
    .line 155
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 156
    .line 157
    .line 158
    :cond_a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 159
    .line 160
    .line 161
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    if-eqz v13, :cond_b

    .line 166
    .line 167
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 168
    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 172
    .line 173
    .line 174
    :goto_6
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    invoke-static {v11, v5, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-static {v11, v7, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-nez v7, :cond_c

    .line 201
    .line 202
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    invoke-static {v7, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-nez v7, :cond_d

    .line 215
    .line 216
    :cond_c
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-interface {v11, v6, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 228
    .line 229
    .line 230
    :cond_d
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-static {v11, v8, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 235
    .line 236
    .line 237
    sget-object v5, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 238
    .line 239
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 240
    .line 241
    const/16 v6, 0x1e

    .line 242
    .line 243
    int-to-float v6, v6

    .line 244
    const/16 v7, 0x258

    .line 245
    .line 246
    int-to-float v7, v7

    .line 247
    div-float/2addr v6, v7

    .line 248
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 257
    .line 258
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 259
    .line 260
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    int-to-float v8, v8

    .line 265
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 274
    .line 275
    div-float/2addr v8, v9

    .line 276
    mul-float/2addr v6, v8

    .line 277
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 282
    .line 283
    .line 284
    move-result-object v13

    .line 285
    const/16 v6, 0xa

    .line 286
    .line 287
    int-to-float v6, v6

    .line 288
    div-float/2addr v6, v7

    .line 289
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 298
    .line 299
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 300
    .line 301
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    int-to-float v8, v8

    .line 306
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 315
    .line 316
    div-float/2addr v8, v9

    .line 317
    mul-float/2addr v6, v8

    .line 318
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 319
    .line 320
    .line 321
    move-result v15

    .line 322
    const/16 v18, 0xd

    .line 323
    .line 324
    const/16 v19, 0x0

    .line 325
    .line 326
    const/4 v14, 0x0

    .line 327
    const/16 v16, 0x0

    .line 328
    .line 329
    const/16 v17, 0x0

    .line 330
    .line 331
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    const/16 v8, 0x8

    .line 336
    .line 337
    invoke-static {v8}, Lo5/e;->k(I)J

    .line 338
    .line 339
    .line 340
    move-result-wide v16

    .line 341
    const-wide v8, 0xff5a5a5aL

    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 347
    .line 348
    .line 349
    move-result-wide v14

    .line 350
    new-instance v13, Landroidx/compose/ui/text/TextStyle;

    .line 351
    .line 352
    const v43, 0xfffffc

    .line 353
    .line 354
    .line 355
    const/16 v44, 0x0

    .line 356
    .line 357
    const/16 v18, 0x0

    .line 358
    .line 359
    const/16 v20, 0x0

    .line 360
    .line 361
    const/16 v21, 0x0

    .line 362
    .line 363
    const/16 v22, 0x0

    .line 364
    .line 365
    const-wide/16 v23, 0x0

    .line 366
    .line 367
    const/16 v25, 0x0

    .line 368
    .line 369
    const/16 v26, 0x0

    .line 370
    .line 371
    const/16 v27, 0x0

    .line 372
    .line 373
    const-wide/16 v28, 0x0

    .line 374
    .line 375
    const/16 v30, 0x0

    .line 376
    .line 377
    const/16 v31, 0x0

    .line 378
    .line 379
    const/16 v32, 0x0

    .line 380
    .line 381
    const/16 v33, 0x0

    .line 382
    .line 383
    const/16 v34, 0x0

    .line 384
    .line 385
    const-wide/16 v35, 0x0

    .line 386
    .line 387
    const/16 v37, 0x0

    .line 388
    .line 389
    const/16 v38, 0x0

    .line 390
    .line 391
    const/16 v39, 0x0

    .line 392
    .line 393
    const/16 v40, 0x0

    .line 394
    .line 395
    const/16 v41, 0x0

    .line 396
    .line 397
    const/16 v42, 0x0

    .line 398
    .line 399
    invoke-direct/range {v13 .. v44}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 400
    .line 401
    .line 402
    const/16 v28, 0x0

    .line 403
    .line 404
    const v29, 0xfffc

    .line 405
    .line 406
    .line 407
    move-object v8, v5

    .line 408
    const-string v5, "\u6807\u7b7e\uff1a"

    .line 409
    .line 410
    move v11, v7

    .line 411
    move-object v9, v8

    .line 412
    const-wide/16 v7, 0x0

    .line 413
    .line 414
    move-object v14, v9

    .line 415
    move v15, v10

    .line 416
    const-wide/16 v9, 0x0

    .line 417
    .line 418
    move/from16 v16, v11

    .line 419
    .line 420
    const/4 v11, 0x0

    .line 421
    move-object/from16 v26, v12

    .line 422
    .line 423
    const/4 v12, 0x0

    .line 424
    move-object/from16 v25, v13

    .line 425
    .line 426
    const/4 v13, 0x0

    .line 427
    move-object/from16 v17, v14

    .line 428
    .line 429
    move/from16 v18, v15

    .line 430
    .line 431
    const-wide/16 v14, 0x0

    .line 432
    .line 433
    move/from16 v19, v16

    .line 434
    .line 435
    const/16 v16, 0x0

    .line 436
    .line 437
    move-object/from16 v20, v17

    .line 438
    .line 439
    const/16 v17, 0x0

    .line 440
    .line 441
    move/from16 v22, v18

    .line 442
    .line 443
    move/from16 v21, v19

    .line 444
    .line 445
    const-wide/16 v18, 0x0

    .line 446
    .line 447
    move-object/from16 v23, v20

    .line 448
    .line 449
    const/16 v20, 0x0

    .line 450
    .line 451
    move/from16 v24, v21

    .line 452
    .line 453
    const/16 v21, 0x0

    .line 454
    .line 455
    move/from16 v27, v22

    .line 456
    .line 457
    const/16 v22, 0x0

    .line 458
    .line 459
    move-object/from16 v30, v23

    .line 460
    .line 461
    const/16 v23, 0x0

    .line 462
    .line 463
    move/from16 v31, v24

    .line 464
    .line 465
    const/16 v24, 0x0

    .line 466
    .line 467
    move/from16 v32, v27

    .line 468
    .line 469
    const/16 v27, 0x36

    .line 470
    .line 471
    move-object/from16 v33, v1

    .line 472
    .line 473
    move-object/from16 v1, v30

    .line 474
    .line 475
    move/from16 v4, v32

    .line 476
    .line 477
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 478
    .line 479
    .line 480
    move-object/from16 v12, v26

    .line 481
    .line 482
    const/4 v5, 0x0

    .line 483
    const/4 v6, 0x0

    .line 484
    invoke-static {v1, v5, v4, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    const/4 v1, 0x3

    .line 489
    int-to-float v1, v1

    .line 490
    div-float v1, v1, v31

    .line 491
    .line 492
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 497
    .line 498
    .line 499
    move-result-object v6

    .line 500
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 501
    .line 502
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 503
    .line 504
    invoke-static {v7, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 505
    .line 506
    .line 507
    move-result v6

    .line 508
    int-to-float v6, v6

    .line 509
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 514
    .line 515
    .line 516
    move-result-object v7

    .line 517
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 518
    .line 519
    div-float/2addr v6, v7

    .line 520
    mul-float/2addr v6, v1

    .line 521
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    invoke-virtual {v0, v6}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 526
    .line 527
    .line 528
    move-result-object v6

    .line 529
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 530
    .line 531
    .line 532
    move-result-object v7

    .line 533
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 534
    .line 535
    .line 536
    move-result-object v7

    .line 537
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 538
    .line 539
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 540
    .line 541
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 542
    .line 543
    .line 544
    move-result v7

    .line 545
    int-to-float v7, v7

    .line 546
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 551
    .line 552
    .line 553
    move-result-object v8

    .line 554
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 555
    .line 556
    div-float/2addr v7, v8

    .line 557
    mul-float/2addr v1, v7

    .line 558
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 559
    .line 560
    .line 561
    move-result v1

    .line 562
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    new-instance v0, Lz5/t;

    .line 567
    .line 568
    invoke-direct {v0, v2, v3}, Lz5/t;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 569
    .line 570
    .line 571
    const/16 v1, 0x36

    .line 572
    .line 573
    const v8, -0x4f832dcc

    .line 574
    .line 575
    .line 576
    invoke-static {v8, v4, v0, v12, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    const v13, 0x1801b6

    .line 581
    .line 582
    .line 583
    const/16 v14, 0x38

    .line 584
    .line 585
    const/4 v8, 0x0

    .line 586
    const/4 v9, 0x0

    .line 587
    const/4 v10, 0x0

    .line 588
    invoke-static/range {v5 .. v14}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 589
    .line 590
    .line 591
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 592
    .line 593
    .line 594
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    if-eqz v0, :cond_e

    .line 599
    .line 600
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 601
    .line 602
    .line 603
    :cond_e
    move-object/from16 v1, v33

    .line 604
    .line 605
    goto :goto_7

    .line 606
    :cond_f
    move-object/from16 v26, v12

    .line 607
    .line 608
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 609
    .line 610
    .line 611
    move-object v1, v5

    .line 612
    :goto_7
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 613
    .line 614
    .line 615
    move-result-object v6

    .line 616
    if-eqz v6, :cond_10

    .line 617
    .line 618
    new-instance v0, Lz5/u;

    .line 619
    .line 620
    move/from16 v4, p4

    .line 621
    .line 622
    move/from16 v5, p5

    .line 623
    .line 624
    invoke-direct/range {v0 .. v5}, Lz5/u;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;II)V

    .line 625
    .line 626
    .line 627
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 628
    .line 629
    .line 630
    :cond_10
    return-void
.end method

.method public static final E(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 3

    .line 1
    const-string v0, "$this$FlowRow"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    and-int/lit8 p2, p4, 0x11

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eq p2, v0, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p2, v1

    .line 16
    :goto_0
    and-int/lit8 v0, p4, 0x1

    .line 17
    .line 18
    invoke-interface {p3, p2, v0}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_5

    .line 23
    .line 24
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    const/4 p2, -0x1

    .line 31
    const-string v0, "com.zykj.evaluation.ui.detail.mistake.TagView.<anonymous>.<anonymous> (MistakeMainView.kt:377)"

    .line 32
    .line 33
    const v2, -0x4f832dcc

    .line 34
    .line 35
    .line 36
    invoke-static {v2, p4, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_4

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    .line 54
    .line 55
    invoke-virtual {p2}, Lcom/zykj/evaluation/ui/detail/mistake/TagData;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    or-int/2addr v0, v2

    .line 68
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-ne v2, v0, :cond_3

    .line 81
    .line 82
    :cond_2
    new-instance v2, Lz5/v;

    .line 83
    .line 84
    invoke-direct {v2, p1, p2}, Lz5/v;-><init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/mistake/TagData;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 91
    .line 92
    invoke-static {p4, v2, p3, v1, v1}, Lz5/i0;->z(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_6

    .line 101
    .line 102
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 107
    .line 108
    .line 109
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0
.end method

.method public static final F(Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/mistake/TagData;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final G(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move v5, p4

    .line 11
    move-object v3, p5

    .line 12
    invoke-static/range {v0 .. v5}, Lz5/i0;->D(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final H(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 66

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    const v3, 0x196aed8c

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p3

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v11

    .line 16
    and-int/lit8 v4, p5, 0x1

    .line 17
    .line 18
    const/4 v14, 0x2

    .line 19
    const/4 v15, 0x4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    or-int/lit8 v5, v2, 0x6

    .line 23
    .line 24
    move v6, v5

    .line 25
    move-object/from16 v5, p0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    and-int/lit8 v5, v2, 0x6

    .line 29
    .line 30
    if-nez v5, :cond_2

    .line 31
    .line 32
    move-object/from16 v5, p0

    .line 33
    .line 34
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    move v6, v15

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v6, v14

    .line 43
    :goto_0
    or-int/2addr v6, v2

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object/from16 v5, p0

    .line 46
    .line 47
    move v6, v2

    .line 48
    :goto_1
    and-int/lit8 v7, v2, 0x30

    .line 49
    .line 50
    if-nez v7, :cond_4

    .line 51
    .line 52
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_3

    .line 57
    .line 58
    const/16 v7, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    const/16 v7, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v6, v7

    .line 64
    :cond_4
    and-int/lit16 v7, v2, 0x180

    .line 65
    .line 66
    if-nez v7, :cond_6

    .line 67
    .line 68
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_5

    .line 73
    .line 74
    const/16 v7, 0x100

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    const/16 v7, 0x80

    .line 78
    .line 79
    :goto_3
    or-int/2addr v6, v7

    .line 80
    :cond_6
    and-int/lit16 v7, v6, 0x93

    .line 81
    .line 82
    const/16 v9, 0x92

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    const/4 v12, 0x1

    .line 86
    if-eq v7, v9, :cond_7

    .line 87
    .line 88
    move v7, v12

    .line 89
    goto :goto_4

    .line 90
    :cond_7
    move v7, v10

    .line 91
    :goto_4
    and-int/lit8 v9, v6, 0x1

    .line 92
    .line 93
    invoke-interface {v11, v7, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-eqz v7, :cond_12

    .line 98
    .line 99
    if-eqz v4, :cond_8

    .line 100
    .line 101
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_8
    move-object v4, v5

    .line 105
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_9

    .line 110
    .line 111
    const/4 v5, -0x1

    .line 112
    const-string v7, "com.zykj.evaluation.ui.detail.mistake.TitleView (MistakeMainView.kt:184)"

    .line 113
    .line 114
    invoke-static {v3, v6, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_9
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 118
    .line 119
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 124
    .line 125
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const/16 v7, 0x30

    .line 130
    .line 131
    invoke-static {v5, v3, v11, v7}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-static {v11, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-static {v11, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 148
    .line 149
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 154
    .line 155
    .line 156
    move-result-object v16

    .line 157
    if-nez v16, :cond_a

    .line 158
    .line 159
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 160
    .line 161
    .line 162
    :cond_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 163
    .line 164
    .line 165
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 166
    .line 167
    .line 168
    move-result v16

    .line 169
    if-eqz v16, :cond_b

    .line 170
    .line 171
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 172
    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 176
    .line 177
    .line 178
    :goto_6
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-static {v8, v3, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    invoke-static {v8, v7, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    if-nez v7, :cond_c

    .line 205
    .line 206
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-nez v7, :cond_d

    .line 219
    .line 220
    :cond_c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-interface {v8, v5, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 232
    .line 233
    .line 234
    :cond_d
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-static {v8, v9, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 239
    .line 240
    .line 241
    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 242
    .line 243
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 244
    .line 245
    const/4 v5, 0x6

    .line 246
    int-to-float v5, v5

    .line 247
    const/16 v7, 0x258

    .line 248
    .line 249
    int-to-float v7, v7

    .line 250
    div-float/2addr v5, v7

    .line 251
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 260
    .line 261
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 262
    .line 263
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    int-to-float v8, v8

    .line 268
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 273
    .line 274
    .line 275
    move-result-object v9

    .line 276
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 277
    .line 278
    div-float/2addr v8, v9

    .line 279
    mul-float/2addr v5, v8

    .line 280
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    const/high16 v8, 0x7f0f0000

    .line 289
    .line 290
    const/4 v9, 0x6

    .line 291
    invoke-static {v8, v11, v9}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 292
    .line 293
    .line 294
    move-result-object v8

    .line 295
    move v9, v12

    .line 296
    const/16 v12, 0x1b0

    .line 297
    .line 298
    const/16 v13, 0x78

    .line 299
    .line 300
    move v10, v6

    .line 301
    move-object v6, v5

    .line 302
    const/4 v5, 0x0

    .line 303
    move/from16 v17, v7

    .line 304
    .line 305
    const/4 v7, 0x0

    .line 306
    move-object/from16 v18, v4

    .line 307
    .line 308
    move-object v4, v8

    .line 309
    const/4 v8, 0x0

    .line 310
    move/from16 v19, v9

    .line 311
    .line 312
    const/4 v9, 0x0

    .line 313
    move/from16 v20, v10

    .line 314
    .line 315
    const/4 v10, 0x0

    .line 316
    move/from16 v32, v17

    .line 317
    .line 318
    move-object/from16 v31, v18

    .line 319
    .line 320
    move/from16 v30, v20

    .line 321
    .line 322
    const/16 v29, 0x0

    .line 323
    .line 324
    invoke-static/range {v4 .. v13}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 325
    .line 326
    .line 327
    int-to-float v4, v15

    .line 328
    div-float v4, v4, v32

    .line 329
    .line 330
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 339
    .line 340
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 341
    .line 342
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    int-to-float v5, v5

    .line 347
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 356
    .line 357
    div-float/2addr v5, v6

    .line 358
    mul-float/2addr v4, v5

    .line 359
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    const/4 v5, 0x6

    .line 368
    invoke-static {v4, v11, v5}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 369
    .line 370
    .line 371
    const/16 v4, 0x1e

    .line 372
    .line 373
    int-to-float v4, v4

    .line 374
    div-float v4, v4, v32

    .line 375
    .line 376
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 385
    .line 386
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 387
    .line 388
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    int-to-float v5, v5

    .line 393
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 402
    .line 403
    div-float/2addr v5, v6

    .line 404
    mul-float/2addr v4, v5

    .line 405
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    const/16 v4, 0x8

    .line 414
    .line 415
    invoke-static {v4}, Lo5/e;->k(I)J

    .line 416
    .line 417
    .line 418
    move-result-wide v37

    .line 419
    const-wide v6, 0xff5a5a5aL

    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 425
    .line 426
    .line 427
    move-result-wide v35

    .line 428
    new-instance v34, Landroidx/compose/ui/text/TextStyle;

    .line 429
    .line 430
    const v64, 0xfffffc

    .line 431
    .line 432
    .line 433
    const/16 v65, 0x0

    .line 434
    .line 435
    const/16 v39, 0x0

    .line 436
    .line 437
    const/16 v40, 0x0

    .line 438
    .line 439
    const/16 v41, 0x0

    .line 440
    .line 441
    const/16 v42, 0x0

    .line 442
    .line 443
    const/16 v43, 0x0

    .line 444
    .line 445
    const-wide/16 v44, 0x0

    .line 446
    .line 447
    const/16 v46, 0x0

    .line 448
    .line 449
    const/16 v47, 0x0

    .line 450
    .line 451
    const/16 v48, 0x0

    .line 452
    .line 453
    const-wide/16 v49, 0x0

    .line 454
    .line 455
    const/16 v51, 0x0

    .line 456
    .line 457
    const/16 v52, 0x0

    .line 458
    .line 459
    const/16 v53, 0x0

    .line 460
    .line 461
    const/16 v54, 0x0

    .line 462
    .line 463
    const/16 v55, 0x0

    .line 464
    .line 465
    const-wide/16 v56, 0x0

    .line 466
    .line 467
    const/16 v58, 0x0

    .line 468
    .line 469
    const/16 v59, 0x0

    .line 470
    .line 471
    const/16 v60, 0x0

    .line 472
    .line 473
    const/16 v61, 0x0

    .line 474
    .line 475
    const/16 v62, 0x0

    .line 476
    .line 477
    const/16 v63, 0x0

    .line 478
    .line 479
    invoke-direct/range {v34 .. v65}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 480
    .line 481
    .line 482
    const/16 v27, 0x0

    .line 483
    .line 484
    const v28, 0xfffc

    .line 485
    .line 486
    .line 487
    const-wide/16 v6, 0x0

    .line 488
    .line 489
    const-wide/16 v8, 0x0

    .line 490
    .line 491
    move-object/from16 v16, v11

    .line 492
    .line 493
    const/4 v11, 0x0

    .line 494
    const/4 v12, 0x0

    .line 495
    move v4, v14

    .line 496
    const-wide/16 v13, 0x0

    .line 497
    .line 498
    const/4 v15, 0x0

    .line 499
    move-object/from16 v25, v16

    .line 500
    .line 501
    const/16 v16, 0x0

    .line 502
    .line 503
    const-wide/16 v17, 0x0

    .line 504
    .line 505
    const/16 v19, 0x0

    .line 506
    .line 507
    const/16 v20, 0x0

    .line 508
    .line 509
    const/16 v21, 0x0

    .line 510
    .line 511
    const/16 v22, 0x0

    .line 512
    .line 513
    const/16 v23, 0x0

    .line 514
    .line 515
    const/16 v26, 0x36

    .line 516
    .line 517
    move/from16 v24, v4

    .line 518
    .line 519
    const-string v4, "\u6807\u9898\uff1a"

    .line 520
    .line 521
    move/from16 v2, v24

    .line 522
    .line 523
    move-object/from16 v24, v34

    .line 524
    .line 525
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 526
    .line 527
    .line 528
    move-object/from16 v11, v25

    .line 529
    .line 530
    const/16 v4, 0x126

    .line 531
    .line 532
    int-to-float v4, v4

    .line 533
    div-float v4, v4, v32

    .line 534
    .line 535
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 544
    .line 545
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 546
    .line 547
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 548
    .line 549
    .line 550
    move-result v5

    .line 551
    int-to-float v5, v5

    .line 552
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 553
    .line 554
    .line 555
    move-result-object v6

    .line 556
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 557
    .line 558
    .line 559
    move-result-object v6

    .line 560
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 561
    .line 562
    div-float/2addr v5, v6

    .line 563
    mul-float/2addr v4, v5

    .line 564
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    const/16 v4, 0x18

    .line 573
    .line 574
    int-to-float v4, v4

    .line 575
    div-float v4, v4, v32

    .line 576
    .line 577
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 578
    .line 579
    .line 580
    move-result-object v5

    .line 581
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 586
    .line 587
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 588
    .line 589
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 590
    .line 591
    .line 592
    move-result v5

    .line 593
    int-to-float v5, v5

    .line 594
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 595
    .line 596
    .line 597
    move-result-object v6

    .line 598
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 599
    .line 600
    .line 601
    move-result-object v6

    .line 602
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 603
    .line 604
    div-float/2addr v5, v6

    .line 605
    mul-float/2addr v4, v5

    .line 606
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 607
    .line 608
    .line 609
    move-result v4

    .line 610
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 611
    .line 612
    .line 613
    move-result-object v3

    .line 614
    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 615
    .line 616
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 617
    .line 618
    .line 619
    move-result-wide v4

    .line 620
    const/4 v6, 0x3

    .line 621
    int-to-float v6, v6

    .line 622
    div-float v6, v6, v32

    .line 623
    .line 624
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 625
    .line 626
    .line 627
    move-result-object v7

    .line 628
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 633
    .line 634
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 635
    .line 636
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 637
    .line 638
    .line 639
    move-result v7

    .line 640
    int-to-float v7, v7

    .line 641
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 642
    .line 643
    .line 644
    move-result-object v8

    .line 645
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 646
    .line 647
    .line 648
    move-result-object v8

    .line 649
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 650
    .line 651
    div-float/2addr v7, v8

    .line 652
    mul-float/2addr v7, v6

    .line 653
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 654
    .line 655
    .line 656
    move-result v7

    .line 657
    invoke-static {v7}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 658
    .line 659
    .line 660
    move-result-object v7

    .line 661
    invoke-static {v3, v4, v5, v7}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    const/4 v9, 0x1

    .line 666
    int-to-float v4, v9

    .line 667
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 668
    .line 669
    .line 670
    move-result v4

    .line 671
    const-wide v7, 0xffccccccL

    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 677
    .line 678
    .line 679
    move-result-wide v7

    .line 680
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 685
    .line 686
    .line 687
    move-result-object v5

    .line 688
    iget v10, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 689
    .line 690
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 691
    .line 692
    invoke-static {v10, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 693
    .line 694
    .line 695
    move-result v5

    .line 696
    int-to-float v5, v5

    .line 697
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 698
    .line 699
    .line 700
    move-result-object v10

    .line 701
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 702
    .line 703
    .line 704
    move-result-object v10

    .line 705
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 706
    .line 707
    div-float/2addr v5, v10

    .line 708
    mul-float/2addr v6, v5

    .line 709
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 710
    .line 711
    .line 712
    move-result v5

    .line 713
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 714
    .line 715
    .line 716
    move-result-object v5

    .line 717
    invoke-static {v3, v4, v7, v8, v5}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    const/16 v4, 0x8

    .line 722
    .line 723
    int-to-float v4, v4

    .line 724
    div-float v4, v4, v32

    .line 725
    .line 726
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 727
    .line 728
    .line 729
    move-result-object v5

    .line 730
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 731
    .line 732
    .line 733
    move-result-object v5

    .line 734
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 735
    .line 736
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 737
    .line 738
    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 739
    .line 740
    .line 741
    move-result v5

    .line 742
    int-to-float v5, v5

    .line 743
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 744
    .line 745
    .line 746
    move-result-object v6

    .line 747
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 748
    .line 749
    .line 750
    move-result-object v6

    .line 751
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 752
    .line 753
    div-float/2addr v5, v6

    .line 754
    mul-float/2addr v4, v5

    .line 755
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 756
    .line 757
    .line 758
    move-result v4

    .line 759
    const/4 v5, 0x0

    .line 760
    const/4 v6, 0x0

    .line 761
    invoke-static {v3, v4, v5, v2, v6}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    const/16 v3, 0x8

    .line 766
    .line 767
    invoke-static {v3}, Lo5/e;->k(I)J

    .line 768
    .line 769
    .line 770
    move-result-wide v36

    .line 771
    const-wide v3, 0xff5a5a5aL

    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 777
    .line 778
    .line 779
    move-result-wide v34

    .line 780
    new-instance v33, Landroidx/compose/ui/text/TextStyle;

    .line 781
    .line 782
    const v63, 0xfffffc

    .line 783
    .line 784
    .line 785
    const/16 v64, 0x0

    .line 786
    .line 787
    const/16 v38, 0x0

    .line 788
    .line 789
    const-wide/16 v43, 0x0

    .line 790
    .line 791
    const/16 v45, 0x0

    .line 792
    .line 793
    const-wide/16 v48, 0x0

    .line 794
    .line 795
    const/16 v50, 0x0

    .line 796
    .line 797
    const/16 v53, 0x0

    .line 798
    .line 799
    const-wide/16 v55, 0x0

    .line 800
    .line 801
    const/16 v57, 0x0

    .line 802
    .line 803
    const/16 v60, 0x0

    .line 804
    .line 805
    const/16 v62, 0x0

    .line 806
    .line 807
    invoke-direct/range {v33 .. v64}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 808
    .line 809
    .line 810
    new-instance v14, Landroidx/compose/ui/graphics/SolidColor;

    .line 811
    .line 812
    invoke-static {}, Ld7/a;->i()J

    .line 813
    .line 814
    .line 815
    move-result-wide v3

    .line 816
    const/4 v5, 0x0

    .line 817
    invoke-direct {v14, v3, v4, v5}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 818
    .line 819
    .line 820
    move/from16 v10, v30

    .line 821
    .line 822
    and-int/lit16 v3, v10, 0x380

    .line 823
    .line 824
    const/16 v4, 0x100

    .line 825
    .line 826
    if-ne v3, v4, :cond_e

    .line 827
    .line 828
    move/from16 v29, v9

    .line 829
    .line 830
    :cond_e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v3

    .line 834
    if-nez v29, :cond_f

    .line 835
    .line 836
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 837
    .line 838
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v4

    .line 842
    if-ne v3, v4, :cond_10

    .line 843
    .line 844
    :cond_f
    new-instance v3, Lz5/z;

    .line 845
    .line 846
    invoke-direct {v3, v1}, Lz5/z;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 847
    .line 848
    .line 849
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 850
    .line 851
    .line 852
    :cond_10
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 853
    .line 854
    new-instance v4, Lz5/a0;

    .line 855
    .line 856
    invoke-direct {v4, v0}, Lz5/a0;-><init>(Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    const/16 v5, 0x36

    .line 860
    .line 861
    const v6, -0xca60af5

    .line 862
    .line 863
    .line 864
    invoke-static {v6, v9, v4, v11, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 865
    .line 866
    .line 867
    move-result-object v15

    .line 868
    shr-int/lit8 v4, v10, 0x3

    .line 869
    .line 870
    and-int/lit8 v4, v4, 0xe

    .line 871
    .line 872
    const/high16 v5, 0x6000000

    .line 873
    .line 874
    or-int v17, v4, v5

    .line 875
    .line 876
    const v18, 0x36000

    .line 877
    .line 878
    .line 879
    const/16 v19, 0x3ed8

    .line 880
    .line 881
    move-object v1, v3

    .line 882
    const/4 v3, 0x0

    .line 883
    const/4 v4, 0x0

    .line 884
    const/4 v6, 0x0

    .line 885
    const/4 v7, 0x0

    .line 886
    const/4 v8, 0x1

    .line 887
    const/4 v9, 0x0

    .line 888
    const/4 v10, 0x0

    .line 889
    move-object/from16 v16, v11

    .line 890
    .line 891
    const/4 v11, 0x0

    .line 892
    const/4 v12, 0x0

    .line 893
    const/4 v13, 0x0

    .line 894
    move-object/from16 v5, v33

    .line 895
    .line 896
    invoke-static/range {v0 .. v19}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    .line 897
    .line 898
    .line 899
    move-object/from16 v11, v16

    .line 900
    .line 901
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 902
    .line 903
    .line 904
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 905
    .line 906
    .line 907
    move-result v0

    .line 908
    if-eqz v0, :cond_11

    .line 909
    .line 910
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 911
    .line 912
    .line 913
    :cond_11
    move-object/from16 v1, v31

    .line 914
    .line 915
    goto :goto_7

    .line 916
    :cond_12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 917
    .line 918
    .line 919
    move-object v1, v5

    .line 920
    :goto_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 921
    .line 922
    .line 923
    move-result-object v6

    .line 924
    if-eqz v6, :cond_13

    .line 925
    .line 926
    new-instance v0, Lz5/b0;

    .line 927
    .line 928
    move-object/from16 v2, p1

    .line 929
    .line 930
    move-object/from16 v3, p2

    .line 931
    .line 932
    move/from16 v4, p4

    .line 933
    .line 934
    move/from16 v5, p5

    .line 935
    .line 936
    invoke-direct/range {v0 .. v5}, Lz5/b0;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V

    .line 937
    .line 938
    .line 939
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 940
    .line 941
    .line 942
    :cond_13
    return-void
.end method

.method public static final I(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 35

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "innerTextField"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    and-int/lit8 v2, p3, 0x6

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v2, 0x2

    .line 23
    :goto_0
    or-int v2, p3, v2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move/from16 v2, p3

    .line 27
    .line 28
    :goto_1
    and-int/lit8 v3, v2, 0x13

    .line 29
    .line 30
    const/16 v4, 0x12

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x1

    .line 34
    if-eq v3, v4, :cond_2

    .line 35
    .line 36
    move v3, v6

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move v3, v5

    .line 39
    :goto_2
    and-int/lit8 v4, v2, 0x1

    .line 40
    .line 41
    invoke-interface {v1, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_9

    .line 46
    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    const/4 v3, -0x1

    .line 54
    const-string v4, "com.zykj.evaluation.ui.detail.mistake.TitleView.<anonymous>.<anonymous> (MistakeMainView.kt:228)"

    .line 55
    .line 56
    const v7, -0xca60af5

    .line 57
    .line 58
    .line 59
    invoke-static {v7, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    const/4 v7, 0x0

    .line 66
    invoke-static {v3, v4, v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 71
    .line 72
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {v1, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-static {v1, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 93
    .line 94
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    if-nez v9, :cond_4

    .line 103
    .line 104
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 105
    .line 106
    .line 107
    :cond_4
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 108
    .line 109
    .line 110
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_5

    .line 115
    .line 116
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 121
    .line 122
    .line 123
    :goto_3
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    invoke-static {v8, v4, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-static {v8, v6, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-nez v6, :cond_6

    .line 150
    .line 151
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-nez v6, :cond_7

    .line 164
    .line 165
    :cond_6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    invoke-interface {v8, v5, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-static {v8, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 184
    .line 185
    .line 186
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 187
    .line 188
    and-int/lit8 v2, v2, 0xe

    .line 189
    .line 190
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    invoke-interface/range {p0 .. p0}, Ljava/lang/CharSequence;->length()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_8

    .line 202
    .line 203
    const v0, -0x6eefa6a4

    .line 204
    .line 205
    .line 206
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 207
    .line 208
    .line 209
    const v0, 0x7f120103

    .line 210
    .line 211
    .line 212
    const/4 v2, 0x6

    .line 213
    invoke-static {v0, v1, v2}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const/16 v2, 0x8

    .line 218
    .line 219
    invoke-static {v2}, Lo5/e;->k(I)J

    .line 220
    .line 221
    .line 222
    move-result-wide v6

    .line 223
    const-wide v2, 0xffccccccL

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 229
    .line 230
    .line 231
    move-result-wide v4

    .line 232
    new-instance v3, Landroidx/compose/ui/text/TextStyle;

    .line 233
    .line 234
    const v33, 0xfffffc

    .line 235
    .line 236
    .line 237
    const/16 v34, 0x0

    .line 238
    .line 239
    const/4 v8, 0x0

    .line 240
    const/4 v9, 0x0

    .line 241
    const/4 v10, 0x0

    .line 242
    const/4 v11, 0x0

    .line 243
    const/4 v12, 0x0

    .line 244
    const-wide/16 v13, 0x0

    .line 245
    .line 246
    const/4 v15, 0x0

    .line 247
    const/16 v16, 0x0

    .line 248
    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    const-wide/16 v18, 0x0

    .line 252
    .line 253
    const/16 v20, 0x0

    .line 254
    .line 255
    const/16 v21, 0x0

    .line 256
    .line 257
    const/16 v22, 0x0

    .line 258
    .line 259
    const/16 v23, 0x0

    .line 260
    .line 261
    const/16 v24, 0x0

    .line 262
    .line 263
    const-wide/16 v25, 0x0

    .line 264
    .line 265
    const/16 v27, 0x0

    .line 266
    .line 267
    const/16 v28, 0x0

    .line 268
    .line 269
    const/16 v29, 0x0

    .line 270
    .line 271
    const/16 v30, 0x0

    .line 272
    .line 273
    const/16 v31, 0x0

    .line 274
    .line 275
    const/16 v32, 0x0

    .line 276
    .line 277
    invoke-direct/range {v3 .. v34}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 278
    .line 279
    .line 280
    const v24, 0xfffe

    .line 281
    .line 282
    .line 283
    const/4 v1, 0x0

    .line 284
    move-object/from16 v20, v3

    .line 285
    .line 286
    const-wide/16 v2, 0x0

    .line 287
    .line 288
    const-wide/16 v4, 0x0

    .line 289
    .line 290
    const/4 v6, 0x0

    .line 291
    const/4 v7, 0x0

    .line 292
    const-wide/16 v9, 0x0

    .line 293
    .line 294
    const/4 v15, 0x0

    .line 295
    const/16 v16, 0x0

    .line 296
    .line 297
    const/16 v17, 0x0

    .line 298
    .line 299
    const/16 v18, 0x0

    .line 300
    .line 301
    const/16 v19, 0x0

    .line 302
    .line 303
    const/16 v22, 0x0

    .line 304
    .line 305
    move-object/from16 v21, p2

    .line 306
    .line 307
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 308
    .line 309
    .line 310
    move-object/from16 v1, v21

    .line 311
    .line 312
    :goto_4
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 313
    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_8
    const v0, -0x6f5d7023

    .line 317
    .line 318
    .line 319
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 320
    .line 321
    .line 322
    goto :goto_4

    .line 323
    :goto_5
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 324
    .line 325
    .line 326
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    if-eqz v0, :cond_a

    .line 331
    .line 332
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 333
    .line 334
    .line 335
    goto :goto_6

    .line 336
    :cond_9
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 337
    .line 338
    .line 339
    :cond_a
    :goto_6
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 340
    .line 341
    return-object v0
.end method

.method public static final J(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "substring(...)"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0
.end method

.method public static final K(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move v5, p4

    .line 11
    move-object v3, p5

    .line 12
    invoke-static/range {v0 .. v5}, Lz5/i0;->H(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final L(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 70

    .line 1
    move/from16 v5, p4

    .line 2
    .line 3
    move/from16 v7, p7

    .line 4
    .line 5
    const v0, -0x7d7b62ba

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p6

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v13

    .line 14
    and-int/lit8 v1, p8, 0x1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    or-int/lit8 v3, v7, 0x6

    .line 19
    .line 20
    move v4, v3

    .line 21
    move-object/from16 v3, p0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 v3, v7, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_2

    .line 27
    .line 28
    move-object/from16 v3, p0

    .line 29
    .line 30
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v4, 0x2

    .line 39
    :goto_0
    or-int/2addr v4, v7

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object/from16 v3, p0

    .line 42
    .line 43
    move v4, v7

    .line 44
    :goto_1
    and-int/lit8 v6, v7, 0x30

    .line 45
    .line 46
    if-nez v6, :cond_4

    .line 47
    .line 48
    move-object/from16 v6, p1

    .line 49
    .line 50
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_3

    .line 55
    .line 56
    const/16 v8, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const/16 v8, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v4, v8

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    move-object/from16 v6, p1

    .line 64
    .line 65
    :goto_3
    and-int/lit16 v8, v7, 0x180

    .line 66
    .line 67
    if-nez v8, :cond_6

    .line 68
    .line 69
    move-wide/from16 v8, p2

    .line 70
    .line 71
    invoke-interface {v13, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-eqz v10, :cond_5

    .line 76
    .line 77
    const/16 v10, 0x100

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_5
    const/16 v10, 0x80

    .line 81
    .line 82
    :goto_4
    or-int/2addr v4, v10

    .line 83
    goto :goto_5

    .line 84
    :cond_6
    move-wide/from16 v8, p2

    .line 85
    .line 86
    :goto_5
    and-int/lit16 v10, v7, 0xc00

    .line 87
    .line 88
    if-nez v10, :cond_8

    .line 89
    .line 90
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-eqz v10, :cond_7

    .line 95
    .line 96
    const/16 v10, 0x800

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :cond_7
    const/16 v10, 0x400

    .line 100
    .line 101
    :goto_6
    or-int/2addr v4, v10

    .line 102
    :cond_8
    and-int/lit16 v10, v7, 0x6000

    .line 103
    .line 104
    if-nez v10, :cond_a

    .line 105
    .line 106
    move-object/from16 v10, p5

    .line 107
    .line 108
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v11

    .line 112
    if-eqz v11, :cond_9

    .line 113
    .line 114
    const/16 v11, 0x4000

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_9
    const/16 v11, 0x2000

    .line 118
    .line 119
    :goto_7
    or-int/2addr v4, v11

    .line 120
    goto :goto_8

    .line 121
    :cond_a
    move-object/from16 v10, p5

    .line 122
    .line 123
    :goto_8
    and-int/lit16 v11, v4, 0x2493

    .line 124
    .line 125
    const/16 v12, 0x2492

    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    if-eq v11, v12, :cond_b

    .line 129
    .line 130
    const/4 v11, 0x1

    .line 131
    goto :goto_9

    .line 132
    :cond_b
    move v11, v14

    .line 133
    :goto_9
    and-int/lit8 v12, v4, 0x1

    .line 134
    .line 135
    invoke-interface {v13, v11, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-eqz v11, :cond_1b

    .line 140
    .line 141
    if-eqz v1, :cond_c

    .line 142
    .line 143
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 144
    .line 145
    goto :goto_a

    .line 146
    :cond_c
    move-object v1, v3

    .line 147
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_d

    .line 152
    .line 153
    const/4 v3, -0x1

    .line 154
    const-string v11, "com.zykj.evaluation.ui.detail.mistake.TopicView (MistakeMainView.kt:123)"

    .line 155
    .line 156
    invoke-static {v0, v4, v3, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_d
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 160
    .line 161
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    sget-object v33, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 166
    .line 167
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    invoke-static {v3, v11, v13, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-static {v13, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-static {v13, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 184
    .line 185
    .line 186
    move-result-object v15

    .line 187
    sget-object v34, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 188
    .line 189
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 194
    .line 195
    .line 196
    move-result-object v16

    .line 197
    if-nez v16, :cond_e

    .line 198
    .line 199
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 200
    .line 201
    .line 202
    :cond_e
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 203
    .line 204
    .line 205
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 206
    .line 207
    .line 208
    move-result v16

    .line 209
    if-eqz v16, :cond_f

    .line 210
    .line 211
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 212
    .line 213
    .line 214
    goto :goto_b

    .line 215
    :cond_f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 216
    .line 217
    .line 218
    :goto_b
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 223
    .line 224
    .line 225
    move-result-object v14

    .line 226
    invoke-static {v2, v3, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-static {v2, v12, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    if-nez v12, :cond_10

    .line 245
    .line 246
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v12

    .line 250
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v14

    .line 254
    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v12

    .line 258
    if-nez v12, :cond_11

    .line 259
    .line 260
    :cond_10
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    invoke-interface {v2, v11, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 272
    .line 273
    .line 274
    :cond_11
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-static {v2, v15, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 279
    .line 280
    .line 281
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 282
    .line 283
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 288
    .line 289
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    const/16 v11, 0x30

    .line 294
    .line 295
    invoke-static {v0, v2, v13, v11}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const/4 v2, 0x0

    .line 300
    invoke-static {v13, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 305
    .line 306
    .line 307
    move-result-object v12

    .line 308
    invoke-static {v13, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 309
    .line 310
    .line 311
    move-result-object v14

    .line 312
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 313
    .line 314
    .line 315
    move-result-object v15

    .line 316
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 317
    .line 318
    .line 319
    move-result-object v16

    .line 320
    if-nez v16, :cond_12

    .line 321
    .line 322
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 323
    .line 324
    .line 325
    :cond_12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 326
    .line 327
    .line 328
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 329
    .line 330
    .line 331
    move-result v16

    .line 332
    if-eqz v16, :cond_13

    .line 333
    .line 334
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 335
    .line 336
    .line 337
    goto :goto_c

    .line 338
    :cond_13
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 339
    .line 340
    .line 341
    :goto_c
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 342
    .line 343
    .line 344
    move-result-object v15

    .line 345
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-static {v15, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v15, v12, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-nez v2, :cond_14

    .line 368
    .line 369
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 374
    .line 375
    .line 376
    move-result-object v12

    .line 377
    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    if-nez v2, :cond_15

    .line 382
    .line 383
    :cond_14
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    invoke-interface {v15, v2, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 395
    .line 396
    .line 397
    :cond_15
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-static {v15, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 402
    .line 403
    .line 404
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 405
    .line 406
    const/4 v0, 0x6

    .line 407
    int-to-float v2, v0

    .line 408
    const/16 v11, 0x258

    .line 409
    .line 410
    int-to-float v11, v11

    .line 411
    div-float/2addr v2, v11

    .line 412
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 413
    .line 414
    .line 415
    move-result-object v12

    .line 416
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 417
    .line 418
    .line 419
    move-result-object v12

    .line 420
    iget v14, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 421
    .line 422
    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 423
    .line 424
    invoke-static {v14, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 425
    .line 426
    .line 427
    move-result v12

    .line 428
    int-to-float v12, v12

    .line 429
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 430
    .line 431
    .line 432
    move-result-object v14

    .line 433
    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 434
    .line 435
    .line 436
    move-result-object v14

    .line 437
    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    .line 438
    .line 439
    div-float/2addr v12, v14

    .line 440
    mul-float/2addr v2, v12

    .line 441
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    const/high16 v12, 0x7f0f0000

    .line 450
    .line 451
    invoke-static {v12, v13, v0}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 452
    .line 453
    .line 454
    move-result-object v12

    .line 455
    const/4 v14, 0x0

    .line 456
    const/16 v16, 0x1b0

    .line 457
    .line 458
    const/16 v17, 0x78

    .line 459
    .line 460
    const/4 v9, 0x0

    .line 461
    move v8, v11

    .line 462
    const/4 v11, 0x0

    .line 463
    move v15, v8

    .line 464
    move-object v8, v12

    .line 465
    const/4 v12, 0x0

    .line 466
    move-object/from16 v29, v13

    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    move/from16 v18, v14

    .line 470
    .line 471
    const/4 v14, 0x0

    .line 472
    move-object v10, v2

    .line 473
    move v2, v15

    .line 474
    move-object/from16 v15, v29

    .line 475
    .line 476
    invoke-static/range {v8 .. v17}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 477
    .line 478
    .line 479
    move-object v13, v15

    .line 480
    const/4 v8, 0x4

    .line 481
    int-to-float v8, v8

    .line 482
    div-float/2addr v8, v2

    .line 483
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 484
    .line 485
    .line 486
    move-result-object v9

    .line 487
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 492
    .line 493
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 494
    .line 495
    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 496
    .line 497
    .line 498
    move-result v9

    .line 499
    int-to-float v9, v9

    .line 500
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 501
    .line 502
    .line 503
    move-result-object v10

    .line 504
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 509
    .line 510
    div-float/2addr v9, v10

    .line 511
    mul-float/2addr v8, v9

    .line 512
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    invoke-static {v8, v13, v0}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 521
    .line 522
    .line 523
    const/16 v8, 0x1e

    .line 524
    .line 525
    int-to-float v8, v8

    .line 526
    div-float/2addr v8, v2

    .line 527
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 528
    .line 529
    .line 530
    move-result-object v9

    .line 531
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 532
    .line 533
    .line 534
    move-result-object v9

    .line 535
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 536
    .line 537
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 538
    .line 539
    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 540
    .line 541
    .line 542
    move-result v9

    .line 543
    int-to-float v9, v9

    .line 544
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 545
    .line 546
    .line 547
    move-result-object v10

    .line 548
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 553
    .line 554
    div-float/2addr v9, v10

    .line 555
    mul-float/2addr v8, v9

    .line 556
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 557
    .line 558
    .line 559
    move-result v8

    .line 560
    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 561
    .line 562
    .line 563
    move-result-object v9

    .line 564
    const/16 v8, 0x8

    .line 565
    .line 566
    invoke-static {v8}, Lo5/e;->k(I)J

    .line 567
    .line 568
    .line 569
    move-result-wide v39

    .line 570
    const-wide v68, 0xff5a5a5aL

    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    invoke-static/range {v68 .. v69}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 576
    .line 577
    .line 578
    move-result-wide v37

    .line 579
    new-instance v28, Landroidx/compose/ui/text/TextStyle;

    .line 580
    .line 581
    const v66, 0xfffffc

    .line 582
    .line 583
    .line 584
    const/16 v67, 0x0

    .line 585
    .line 586
    const/16 v41, 0x0

    .line 587
    .line 588
    const/16 v42, 0x0

    .line 589
    .line 590
    const/16 v43, 0x0

    .line 591
    .line 592
    const/16 v44, 0x0

    .line 593
    .line 594
    const/16 v45, 0x0

    .line 595
    .line 596
    const-wide/16 v46, 0x0

    .line 597
    .line 598
    const/16 v48, 0x0

    .line 599
    .line 600
    const/16 v49, 0x0

    .line 601
    .line 602
    const/16 v50, 0x0

    .line 603
    .line 604
    const-wide/16 v51, 0x0

    .line 605
    .line 606
    const/16 v53, 0x0

    .line 607
    .line 608
    const/16 v54, 0x0

    .line 609
    .line 610
    const/16 v55, 0x0

    .line 611
    .line 612
    const/16 v56, 0x0

    .line 613
    .line 614
    const/16 v57, 0x0

    .line 615
    .line 616
    const-wide/16 v58, 0x0

    .line 617
    .line 618
    const/16 v60, 0x0

    .line 619
    .line 620
    const/16 v61, 0x0

    .line 621
    .line 622
    const/16 v62, 0x0

    .line 623
    .line 624
    const/16 v63, 0x0

    .line 625
    .line 626
    const/16 v64, 0x0

    .line 627
    .line 628
    const/16 v65, 0x0

    .line 629
    .line 630
    move-object/from16 v36, v28

    .line 631
    .line 632
    invoke-direct/range {v36 .. v67}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 633
    .line 634
    .line 635
    const/16 v31, 0x0

    .line 636
    .line 637
    const v32, 0xfffc

    .line 638
    .line 639
    .line 640
    const-string v8, "\u79d1\u76ee\uff1a"

    .line 641
    .line 642
    const-wide/16 v10, 0x0

    .line 643
    .line 644
    move-object/from16 v29, v13

    .line 645
    .line 646
    const-wide/16 v12, 0x0

    .line 647
    .line 648
    const/4 v15, 0x0

    .line 649
    const/16 v16, 0x0

    .line 650
    .line 651
    const-wide/16 v17, 0x0

    .line 652
    .line 653
    const/16 v19, 0x0

    .line 654
    .line 655
    const/16 v20, 0x0

    .line 656
    .line 657
    const-wide/16 v21, 0x0

    .line 658
    .line 659
    const/16 v23, 0x0

    .line 660
    .line 661
    const/16 v24, 0x0

    .line 662
    .line 663
    const/16 v25, 0x0

    .line 664
    .line 665
    const/16 v26, 0x0

    .line 666
    .line 667
    const/16 v27, 0x0

    .line 668
    .line 669
    const/16 v30, 0x36

    .line 670
    .line 671
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 672
    .line 673
    .line 674
    and-int/lit16 v8, v4, 0x3f0

    .line 675
    .line 676
    shr-int/lit8 v4, v4, 0x3

    .line 677
    .line 678
    and-int/lit16 v4, v4, 0x1c00

    .line 679
    .line 680
    or-int v14, v8, v4

    .line 681
    .line 682
    const/4 v15, 0x1

    .line 683
    const/4 v8, 0x0

    .line 684
    move-wide/from16 v10, p2

    .line 685
    .line 686
    move-object/from16 v12, p5

    .line 687
    .line 688
    move-object v9, v6

    .line 689
    move-object/from16 v13, v29

    .line 690
    .line 691
    invoke-static/range {v8 .. v15}, Le7/b0;->e(Landroidx/compose/ui/Modifier;Ljava/util/List;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 692
    .line 693
    .line 694
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 695
    .line 696
    .line 697
    const/4 v4, 0x5

    .line 698
    int-to-float v4, v4

    .line 699
    div-float/2addr v4, v2

    .line 700
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 701
    .line 702
    .line 703
    move-result-object v6

    .line 704
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 705
    .line 706
    .line 707
    move-result-object v6

    .line 708
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 709
    .line 710
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 711
    .line 712
    invoke-static {v8, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 713
    .line 714
    .line 715
    move-result v6

    .line 716
    int-to-float v6, v6

    .line 717
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 718
    .line 719
    .line 720
    move-result-object v8

    .line 721
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 722
    .line 723
    .line 724
    move-result-object v8

    .line 725
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 726
    .line 727
    div-float/2addr v6, v8

    .line 728
    mul-float/2addr v4, v6

    .line 729
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 730
    .line 731
    .line 732
    move-result v4

    .line 733
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 734
    .line 735
    .line 736
    move-result-object v4

    .line 737
    invoke-static {v4, v13, v0}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 738
    .line 739
    .line 740
    const/16 v0, 0xa

    .line 741
    .line 742
    int-to-float v0, v0

    .line 743
    div-float/2addr v0, v2

    .line 744
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 745
    .line 746
    .line 747
    move-result-object v4

    .line 748
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    iget v6, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 753
    .line 754
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 755
    .line 756
    invoke-static {v6, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 757
    .line 758
    .line 759
    move-result v4

    .line 760
    int-to-float v4, v4

    .line 761
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 762
    .line 763
    .line 764
    move-result-object v6

    .line 765
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 766
    .line 767
    .line 768
    move-result-object v6

    .line 769
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 770
    .line 771
    div-float/2addr v4, v6

    .line 772
    mul-float/2addr v0, v4

    .line 773
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 782
    .line 783
    .line 784
    move-result-object v4

    .line 785
    const/4 v14, 0x0

    .line 786
    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    invoke-static {v13, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 791
    .line 792
    .line 793
    move-result v6

    .line 794
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 795
    .line 796
    .line 797
    move-result-object v8

    .line 798
    invoke-static {v13, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 803
    .line 804
    .line 805
    move-result-object v9

    .line 806
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 807
    .line 808
    .line 809
    move-result-object v10

    .line 810
    if-nez v10, :cond_16

    .line 811
    .line 812
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 813
    .line 814
    .line 815
    :cond_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 816
    .line 817
    .line 818
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 819
    .line 820
    .line 821
    move-result v10

    .line 822
    if-eqz v10, :cond_17

    .line 823
    .line 824
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 825
    .line 826
    .line 827
    goto :goto_d

    .line 828
    :cond_17
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 829
    .line 830
    .line 831
    :goto_d
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 832
    .line 833
    .line 834
    move-result-object v9

    .line 835
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 836
    .line 837
    .line 838
    move-result-object v10

    .line 839
    invoke-static {v9, v4, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 840
    .line 841
    .line 842
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    invoke-static {v9, v8, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 850
    .line 851
    .line 852
    move-result-object v4

    .line 853
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 854
    .line 855
    .line 856
    move-result v8

    .line 857
    if-nez v8, :cond_18

    .line 858
    .line 859
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v8

    .line 863
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 864
    .line 865
    .line 866
    move-result-object v10

    .line 867
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 868
    .line 869
    .line 870
    move-result v8

    .line 871
    if-nez v8, :cond_19

    .line 872
    .line 873
    :cond_18
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 874
    .line 875
    .line 876
    move-result-object v8

    .line 877
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 881
    .line 882
    .line 883
    move-result-object v6

    .line 884
    invoke-interface {v9, v6, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 885
    .line 886
    .line 887
    :cond_19
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 888
    .line 889
    .line 890
    move-result-object v4

    .line 891
    invoke-static {v9, v0, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 892
    .line 893
    .line 894
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 895
    .line 896
    if-eqz v5, :cond_1a

    .line 897
    .line 898
    const v0, 0x36ec0ed9

    .line 899
    .line 900
    .line 901
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 902
    .line 903
    .line 904
    const/16 v0, 0x28

    .line 905
    .line 906
    int-to-float v0, v0

    .line 907
    div-float/2addr v0, v2

    .line 908
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    iget v4, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 917
    .line 918
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 919
    .line 920
    invoke-static {v4, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 921
    .line 922
    .line 923
    move-result v2

    .line 924
    int-to-float v2, v2

    .line 925
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 926
    .line 927
    .line 928
    move-result-object v4

    .line 929
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 930
    .line 931
    .line 932
    move-result-object v4

    .line 933
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 934
    .line 935
    div-float/2addr v2, v4

    .line 936
    mul-float/2addr v0, v2

    .line 937
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 938
    .line 939
    .line 940
    move-result v18

    .line 941
    const/16 v22, 0xe

    .line 942
    .line 943
    const/16 v23, 0x0

    .line 944
    .line 945
    const/16 v19, 0x0

    .line 946
    .line 947
    const/16 v20, 0x0

    .line 948
    .line 949
    const/16 v21, 0x0

    .line 950
    .line 951
    move-object/from16 v17, v3

    .line 952
    .line 953
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 954
    .line 955
    .line 956
    move-result-object v9

    .line 957
    const/4 v0, 0x7

    .line 958
    invoke-static {v0}, Lo5/e;->k(I)J

    .line 959
    .line 960
    .line 961
    move-result-wide v17

    .line 962
    invoke-static/range {v68 .. v69}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 963
    .line 964
    .line 965
    move-result-wide v15

    .line 966
    new-instance v28, Landroidx/compose/ui/text/TextStyle;

    .line 967
    .line 968
    const v44, 0xfffffc

    .line 969
    .line 970
    .line 971
    const/16 v45, 0x0

    .line 972
    .line 973
    const/16 v19, 0x0

    .line 974
    .line 975
    const/16 v20, 0x0

    .line 976
    .line 977
    const/16 v21, 0x0

    .line 978
    .line 979
    const/16 v22, 0x0

    .line 980
    .line 981
    const-wide/16 v24, 0x0

    .line 982
    .line 983
    const/16 v26, 0x0

    .line 984
    .line 985
    const/16 v27, 0x0

    .line 986
    .line 987
    move-object/from16 v14, v28

    .line 988
    .line 989
    const/16 v28, 0x0

    .line 990
    .line 991
    const-wide/16 v29, 0x0

    .line 992
    .line 993
    const/16 v31, 0x0

    .line 994
    .line 995
    const/16 v32, 0x0

    .line 996
    .line 997
    const/16 v33, 0x0

    .line 998
    .line 999
    const/16 v34, 0x0

    .line 1000
    .line 1001
    const/16 v35, 0x0

    .line 1002
    .line 1003
    const-wide/16 v36, 0x0

    .line 1004
    .line 1005
    const/16 v38, 0x0

    .line 1006
    .line 1007
    const/16 v39, 0x0

    .line 1008
    .line 1009
    const/16 v40, 0x0

    .line 1010
    .line 1011
    const/16 v41, 0x0

    .line 1012
    .line 1013
    const/16 v42, 0x0

    .line 1014
    .line 1015
    const/16 v43, 0x0

    .line 1016
    .line 1017
    invoke-direct/range {v14 .. v45}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1018
    .line 1019
    .line 1020
    const/16 v31, 0x0

    .line 1021
    .line 1022
    const v32, 0xfffc

    .line 1023
    .line 1024
    .line 1025
    const-string v8, "\u79d1\u76ee\u53d8\u66f4\u540e\u5c06\u79fb\u52a8\u9519\u9898\u81f3\u76ee\u6807\u79d1\u76ee\u6587\u4ef6\u5939\u4e0b"

    .line 1026
    .line 1027
    const-wide/16 v10, 0x0

    .line 1028
    .line 1029
    move-object/from16 v29, v13

    .line 1030
    .line 1031
    const-wide/16 v12, 0x0

    .line 1032
    .line 1033
    move-object/from16 v28, v14

    .line 1034
    .line 1035
    const/4 v14, 0x0

    .line 1036
    const/4 v15, 0x0

    .line 1037
    const/16 v16, 0x0

    .line 1038
    .line 1039
    const-wide/16 v17, 0x0

    .line 1040
    .line 1041
    const-wide/16 v21, 0x0

    .line 1042
    .line 1043
    const/16 v23, 0x0

    .line 1044
    .line 1045
    const/16 v24, 0x0

    .line 1046
    .line 1047
    const/16 v25, 0x0

    .line 1048
    .line 1049
    const/16 v26, 0x0

    .line 1050
    .line 1051
    const/16 v30, 0x36

    .line 1052
    .line 1053
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1054
    .line 1055
    .line 1056
    move-object/from16 v13, v29

    .line 1057
    .line 1058
    :goto_e
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_f

    .line 1062
    :cond_1a
    const v0, 0x369d5420

    .line 1063
    .line 1064
    .line 1065
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1066
    .line 1067
    .line 1068
    goto :goto_e

    .line 1069
    :goto_f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1070
    .line 1071
    .line 1072
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1073
    .line 1074
    .line 1075
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1076
    .line 1077
    .line 1078
    move-result v0

    .line 1079
    if-eqz v0, :cond_1c

    .line 1080
    .line 1081
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1082
    .line 1083
    .line 1084
    goto :goto_10

    .line 1085
    :cond_1b
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1086
    .line 1087
    .line 1088
    move-object v1, v3

    .line 1089
    :cond_1c
    :goto_10
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v9

    .line 1093
    if-eqz v9, :cond_1d

    .line 1094
    .line 1095
    new-instance v0, Lz5/c0;

    .line 1096
    .line 1097
    move-object/from16 v2, p1

    .line 1098
    .line 1099
    move-wide/from16 v3, p2

    .line 1100
    .line 1101
    move-object/from16 v6, p5

    .line 1102
    .line 1103
    move/from16 v8, p8

    .line 1104
    .line 1105
    invoke-direct/range {v0 .. v8}, Lz5/c0;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLkotlin/jvm/functions/Function1;II)V

    .line 1106
    .line 1107
    .line 1108
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 1109
    .line 1110
    .line 1111
    :cond_1d
    return-void
.end method

.method public static final M(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    .line 1
    or-int/lit8 v0, p6, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v8

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-wide v3, p2

    .line 10
    move v5, p4

    .line 11
    move-object v6, p5

    .line 12
    move/from16 v9, p7

    .line 13
    .line 14
    move-object/from16 v7, p8

    .line 15
    .line 16
    invoke-static/range {v1 .. v9}, Lz5/i0;->L(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lz5/i0;->r(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lz5/i0;->A(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz5/i0;->J(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lz5/i0;->B(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/mistake/TagData;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz5/i0;->F(Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/mistake/TagData;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lz5/i0;->C(Ljava/lang/String;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lz5/i0;->I(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz5/i0;->x(Lkotlin/jvm/functions/Function1;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lz5/i0;->E(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/FlowRowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lz5/i0;->y(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz5/i0;->v(Lkotlin/jvm/functions/Function1;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lz5/i0;->M(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lz5/f;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz5/i0;->w(Lkotlin/jvm/functions/Function1;Lz5/f;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p19}, Lz5/i0;->t(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lz5/i0;->G(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lz5/i0;->K(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 43

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const v0, -0x143da33

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p3

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    and-int/lit8 v5, p5, 0x1

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    or-int/lit8 v6, v4, 0x6

    .line 21
    .line 22
    move v7, v6

    .line 23
    move-object/from16 v6, p0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    and-int/lit8 v6, v4, 0x6

    .line 27
    .line 28
    if-nez v6, :cond_2

    .line 29
    .line 30
    move-object/from16 v6, p0

    .line 31
    .line 32
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_1

    .line 37
    .line 38
    const/4 v7, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v7, 0x2

    .line 41
    :goto_0
    or-int/2addr v7, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object/from16 v6, p0

    .line 44
    .line 45
    move v7, v4

    .line 46
    :goto_1
    and-int/lit8 v8, v4, 0x30

    .line 47
    .line 48
    if-nez v8, :cond_4

    .line 49
    .line 50
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_3

    .line 55
    .line 56
    const/16 v8, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    const/16 v8, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v7, v8

    .line 62
    :cond_4
    and-int/lit16 v8, v4, 0x180

    .line 63
    .line 64
    if-nez v8, :cond_6

    .line 65
    .line 66
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    if-eqz v8, :cond_5

    .line 71
    .line 72
    const/16 v8, 0x100

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_5
    const/16 v8, 0x80

    .line 76
    .line 77
    :goto_3
    or-int/2addr v7, v8

    .line 78
    :cond_6
    and-int/lit16 v8, v7, 0x93

    .line 79
    .line 80
    const/16 v9, 0x92

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    const/4 v11, 0x1

    .line 84
    if-eq v8, v9, :cond_7

    .line 85
    .line 86
    move v8, v11

    .line 87
    goto :goto_4

    .line 88
    :cond_7
    move v8, v10

    .line 89
    :goto_4
    and-int/lit8 v9, v7, 0x1

    .line 90
    .line 91
    invoke-interface {v1, v8, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_17

    .line 96
    .line 97
    if-eqz v5, :cond_8

    .line 98
    .line 99
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    move-object v5, v6

    .line 103
    :goto_5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-eqz v6, :cond_9

    .line 108
    .line 109
    const/4 v6, -0x1

    .line 110
    const-string v8, "com.zykj.evaluation.ui.detail.mistake.MainButtonView (MistakeMainView.kt:451)"

    .line 111
    .line 112
    invoke-static {v0, v7, v6, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_9
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 116
    .line 117
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sget-object v30, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 122
    .line 123
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-static {v0, v6, v1, v10}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v1, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-static {v1, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    sget-object v31, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 144
    .line 145
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    if-nez v12, :cond_a

    .line 154
    .line 155
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 156
    .line 157
    .line 158
    :cond_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 159
    .line 160
    .line 161
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    if-eqz v12, :cond_b

    .line 166
    .line 167
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 168
    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 172
    .line 173
    .line 174
    :goto_6
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    invoke-static {v9, v0, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v9, v7, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-nez v7, :cond_c

    .line 201
    .line 202
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-nez v7, :cond_d

    .line 215
    .line 216
    :cond_c
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-interface {v9, v6, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 228
    .line 229
    .line 230
    :cond_d
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v9, v8, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 235
    .line 236
    .line 237
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 238
    .line 239
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 240
    .line 241
    const/16 v6, 0x51

    .line 242
    .line 243
    int-to-float v6, v6

    .line 244
    const/16 v7, 0x258

    .line 245
    .line 246
    int-to-float v7, v7

    .line 247
    div-float v32, v6, v7

    .line 248
    .line 249
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    iget v8, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 258
    .line 259
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 260
    .line 261
    invoke-static {v8, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    int-to-float v6, v6

    .line 266
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 275
    .line 276
    div-float/2addr v6, v8

    .line 277
    mul-float v6, v6, v32

    .line 278
    .line 279
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    const/16 v8, 0x18

    .line 284
    .line 285
    int-to-float v8, v8

    .line 286
    div-float v33, v8, v7

    .line 287
    .line 288
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 297
    .line 298
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 299
    .line 300
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    int-to-float v8, v8

    .line 305
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 314
    .line 315
    div-float/2addr v8, v9

    .line 316
    mul-float v8, v8, v33

    .line 317
    .line 318
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    invoke-static {v0, v6, v8}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 323
    .line 324
    .line 325
    move-result-object v6

    .line 326
    const-wide v8, 0xffccccccL

    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 332
    .line 333
    .line 334
    move-result-wide v8

    .line 335
    const/16 v12, 0xc

    .line 336
    .line 337
    int-to-float v12, v12

    .line 338
    div-float v34, v12, v7

    .line 339
    .line 340
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 341
    .line 342
    .line 343
    move-result-object v12

    .line 344
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 345
    .line 346
    .line 347
    move-result-object v12

    .line 348
    iget v13, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 349
    .line 350
    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 351
    .line 352
    invoke-static {v13, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 353
    .line 354
    .line 355
    move-result v12

    .line 356
    int-to-float v12, v12

    .line 357
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 358
    .line 359
    .line 360
    move-result-object v13

    .line 361
    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 362
    .line 363
    .line 364
    move-result-object v13

    .line 365
    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    .line 366
    .line 367
    div-float/2addr v12, v13

    .line 368
    mul-float v12, v12, v34

    .line 369
    .line 370
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 371
    .line 372
    .line 373
    move-result v12

    .line 374
    invoke-static {v12}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 375
    .line 376
    .line 377
    move-result-object v12

    .line 378
    invoke-static {v6, v8, v9, v12}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    const/4 v8, 0x0

    .line 383
    invoke-static {v6, v10, v2, v11, v8}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 384
    .line 385
    .line 386
    move-result-object v6

    .line 387
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 388
    .line 389
    .line 390
    move-result-object v9

    .line 391
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 392
    .line 393
    .line 394
    move-result-object v9

    .line 395
    invoke-static {v1, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 396
    .line 397
    .line 398
    move-result v12

    .line 399
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 400
    .line 401
    .line 402
    move-result-object v13

    .line 403
    invoke-static {v1, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 408
    .line 409
    .line 410
    move-result-object v14

    .line 411
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 412
    .line 413
    .line 414
    move-result-object v15

    .line 415
    if-nez v15, :cond_e

    .line 416
    .line 417
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 418
    .line 419
    .line 420
    :cond_e
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 421
    .line 422
    .line 423
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 424
    .line 425
    .line 426
    move-result v15

    .line 427
    if-eqz v15, :cond_f

    .line 428
    .line 429
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 430
    .line 431
    .line 432
    goto :goto_7

    .line 433
    :cond_f
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 434
    .line 435
    .line 436
    :goto_7
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 437
    .line 438
    .line 439
    move-result-object v14

    .line 440
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 441
    .line 442
    .line 443
    move-result-object v15

    .line 444
    invoke-static {v14, v9, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 448
    .line 449
    .line 450
    move-result-object v9

    .line 451
    invoke-static {v14, v13, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 459
    .line 460
    .line 461
    move-result v13

    .line 462
    if-nez v13, :cond_10

    .line 463
    .line 464
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v13

    .line 468
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v15

    .line 472
    invoke-static {v13, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v13

    .line 476
    if-nez v13, :cond_11

    .line 477
    .line 478
    :cond_10
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object v13

    .line 482
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v12

    .line 489
    invoke-interface {v14, v12, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 490
    .line 491
    .line 492
    :cond_11
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 493
    .line 494
    .line 495
    move-result-object v9

    .line 496
    invoke-static {v14, v6, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 497
    .line 498
    .line 499
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 500
    .line 501
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 502
    .line 503
    .line 504
    move-result-object v9

    .line 505
    invoke-interface {v6, v0, v9}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 506
    .line 507
    .line 508
    move-result-object v9

    .line 509
    const-wide v12, 0xff5a5a5aL

    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    invoke-static {v12, v13}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 515
    .line 516
    .line 517
    move-result-wide v12

    .line 518
    const/16 v35, 0x7

    .line 519
    .line 520
    move-object v14, v6

    .line 521
    move-object v6, v9

    .line 522
    move v15, v10

    .line 523
    invoke-static/range {v35 .. v35}, Lo5/e;->k(I)J

    .line 524
    .line 525
    .line 526
    move-result-wide v9

    .line 527
    const/16 v28, 0x0

    .line 528
    .line 529
    const v29, 0x1fff0

    .line 530
    .line 531
    .line 532
    move-object/from16 v16, v5

    .line 533
    .line 534
    const-string v5, "\u53d6\u6d88"

    .line 535
    .line 536
    move/from16 v17, v11

    .line 537
    .line 538
    const/4 v11, 0x0

    .line 539
    move-object/from16 v18, v8

    .line 540
    .line 541
    move-wide/from16 v41, v12

    .line 542
    .line 543
    move v13, v7

    .line 544
    move-wide/from16 v7, v41

    .line 545
    .line 546
    const/4 v12, 0x0

    .line 547
    move/from16 v19, v13

    .line 548
    .line 549
    const/4 v13, 0x0

    .line 550
    move-object/from16 v20, v14

    .line 551
    .line 552
    move/from16 v21, v15

    .line 553
    .line 554
    const-wide/16 v14, 0x0

    .line 555
    .line 556
    move-object/from16 v22, v16

    .line 557
    .line 558
    const/16 v16, 0x0

    .line 559
    .line 560
    move/from16 v23, v17

    .line 561
    .line 562
    const/16 v17, 0x0

    .line 563
    .line 564
    move-object/from16 v25, v18

    .line 565
    .line 566
    move/from16 v24, v19

    .line 567
    .line 568
    const-wide/16 v18, 0x0

    .line 569
    .line 570
    move-object/from16 v26, v20

    .line 571
    .line 572
    const/16 v20, 0x0

    .line 573
    .line 574
    move/from16 v27, v21

    .line 575
    .line 576
    const/16 v21, 0x0

    .line 577
    .line 578
    move-object/from16 v36, v22

    .line 579
    .line 580
    const/16 v22, 0x0

    .line 581
    .line 582
    move/from16 v37, v23

    .line 583
    .line 584
    const/16 v23, 0x0

    .line 585
    .line 586
    move/from16 v38, v24

    .line 587
    .line 588
    const/16 v24, 0x0

    .line 589
    .line 590
    move-object/from16 v39, v25

    .line 591
    .line 592
    const/16 v25, 0x0

    .line 593
    .line 594
    move/from16 v40, v27

    .line 595
    .line 596
    const/16 v27, 0xd86

    .line 597
    .line 598
    move-object/from16 v2, v26

    .line 599
    .line 600
    move-object/from16 v26, v1

    .line 601
    .line 602
    move/from16 v1, v37

    .line 603
    .line 604
    move-object/from16 v37, v2

    .line 605
    .line 606
    move-object/from16 v2, v39

    .line 607
    .line 608
    move/from16 v4, v40

    .line 609
    .line 610
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 611
    .line 612
    .line 613
    move-object/from16 v5, v26

    .line 614
    .line 615
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 616
    .line 617
    .line 618
    const/16 v6, 0x16

    .line 619
    .line 620
    int-to-float v6, v6

    .line 621
    div-float v6, v6, v38

    .line 622
    .line 623
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 624
    .line 625
    .line 626
    move-result-object v7

    .line 627
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 628
    .line 629
    .line 630
    move-result-object v7

    .line 631
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 632
    .line 633
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 634
    .line 635
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 636
    .line 637
    .line 638
    move-result v7

    .line 639
    int-to-float v7, v7

    .line 640
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 641
    .line 642
    .line 643
    move-result-object v8

    .line 644
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 645
    .line 646
    .line 647
    move-result-object v8

    .line 648
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 649
    .line 650
    div-float/2addr v7, v8

    .line 651
    mul-float/2addr v6, v7

    .line 652
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 653
    .line 654
    .line 655
    move-result v6

    .line 656
    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 657
    .line 658
    .line 659
    move-result-object v6

    .line 660
    const/4 v7, 0x6

    .line 661
    invoke-static {v6, v5, v7}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 662
    .line 663
    .line 664
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 665
    .line 666
    .line 667
    move-result-object v6

    .line 668
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 669
    .line 670
    .line 671
    move-result-object v6

    .line 672
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 673
    .line 674
    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 675
    .line 676
    invoke-static {v7, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 677
    .line 678
    .line 679
    move-result v6

    .line 680
    int-to-float v6, v6

    .line 681
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 682
    .line 683
    .line 684
    move-result-object v7

    .line 685
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 690
    .line 691
    div-float/2addr v6, v7

    .line 692
    mul-float v32, v32, v6

    .line 693
    .line 694
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 695
    .line 696
    .line 697
    move-result v6

    .line 698
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 699
    .line 700
    .line 701
    move-result-object v7

    .line 702
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 703
    .line 704
    .line 705
    move-result-object v7

    .line 706
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 707
    .line 708
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 709
    .line 710
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 711
    .line 712
    .line 713
    move-result v7

    .line 714
    int-to-float v7, v7

    .line 715
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 716
    .line 717
    .line 718
    move-result-object v8

    .line 719
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 720
    .line 721
    .line 722
    move-result-object v8

    .line 723
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 724
    .line 725
    div-float/2addr v7, v8

    .line 726
    mul-float v33, v33, v7

    .line 727
    .line 728
    invoke-static/range {v33 .. v33}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 729
    .line 730
    .line 731
    move-result v7

    .line 732
    invoke-static {v0, v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 733
    .line 734
    .line 735
    move-result-object v6

    .line 736
    invoke-static {}, Ld7/a;->i()J

    .line 737
    .line 738
    .line 739
    move-result-wide v7

    .line 740
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 741
    .line 742
    .line 743
    move-result-object v9

    .line 744
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 745
    .line 746
    .line 747
    move-result-object v9

    .line 748
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 749
    .line 750
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 751
    .line 752
    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 753
    .line 754
    .line 755
    move-result v9

    .line 756
    int-to-float v9, v9

    .line 757
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 758
    .line 759
    .line 760
    move-result-object v10

    .line 761
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 762
    .line 763
    .line 764
    move-result-object v10

    .line 765
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 766
    .line 767
    div-float/2addr v9, v10

    .line 768
    mul-float v34, v34, v9

    .line 769
    .line 770
    invoke-static/range {v34 .. v34}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 771
    .line 772
    .line 773
    move-result v9

    .line 774
    invoke-static {v9}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 775
    .line 776
    .line 777
    move-result-object v9

    .line 778
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 779
    .line 780
    .line 781
    move-result-object v6

    .line 782
    invoke-static {v6, v4, v3, v1, v2}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 787
    .line 788
    .line 789
    move-result-object v2

    .line 790
    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    invoke-static {v5, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 795
    .line 796
    .line 797
    move-result v4

    .line 798
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 799
    .line 800
    .line 801
    move-result-object v6

    .line 802
    invoke-static {v5, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 807
    .line 808
    .line 809
    move-result-object v7

    .line 810
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 811
    .line 812
    .line 813
    move-result-object v8

    .line 814
    if-nez v8, :cond_12

    .line 815
    .line 816
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 817
    .line 818
    .line 819
    :cond_12
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 820
    .line 821
    .line 822
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 823
    .line 824
    .line 825
    move-result v8

    .line 826
    if-eqz v8, :cond_13

    .line 827
    .line 828
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 829
    .line 830
    .line 831
    goto :goto_8

    .line 832
    :cond_13
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 833
    .line 834
    .line 835
    :goto_8
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 836
    .line 837
    .line 838
    move-result-object v7

    .line 839
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 840
    .line 841
    .line 842
    move-result-object v8

    .line 843
    invoke-static {v7, v2, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    invoke-static {v7, v6, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 858
    .line 859
    .line 860
    move-result v6

    .line 861
    if-nez v6, :cond_14

    .line 862
    .line 863
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v6

    .line 867
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 868
    .line 869
    .line 870
    move-result-object v8

    .line 871
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    move-result v6

    .line 875
    if-nez v6, :cond_15

    .line 876
    .line 877
    :cond_14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 878
    .line 879
    .line 880
    move-result-object v6

    .line 881
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 885
    .line 886
    .line 887
    move-result-object v4

    .line 888
    invoke-interface {v7, v4, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 889
    .line 890
    .line 891
    :cond_15
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual/range {v30 .. v30}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 899
    .line 900
    .line 901
    move-result-object v1

    .line 902
    move-object/from16 v14, v37

    .line 903
    .line 904
    invoke-interface {v14, v0, v1}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 905
    .line 906
    .line 907
    move-result-object v6

    .line 908
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 909
    .line 910
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 911
    .line 912
    .line 913
    move-result-wide v7

    .line 914
    invoke-static/range {v35 .. v35}, Lo5/e;->k(I)J

    .line 915
    .line 916
    .line 917
    move-result-wide v9

    .line 918
    const/16 v28, 0x0

    .line 919
    .line 920
    const v29, 0x1fff0

    .line 921
    .line 922
    .line 923
    move-object/from16 v26, v5

    .line 924
    .line 925
    const-string v5, "\u786e\u8ba4"

    .line 926
    .line 927
    const/4 v11, 0x0

    .line 928
    const/4 v12, 0x0

    .line 929
    const/4 v13, 0x0

    .line 930
    const-wide/16 v14, 0x0

    .line 931
    .line 932
    const/16 v16, 0x0

    .line 933
    .line 934
    const/16 v17, 0x0

    .line 935
    .line 936
    const-wide/16 v18, 0x0

    .line 937
    .line 938
    const/16 v20, 0x0

    .line 939
    .line 940
    const/16 v21, 0x0

    .line 941
    .line 942
    const/16 v22, 0x0

    .line 943
    .line 944
    const/16 v23, 0x0

    .line 945
    .line 946
    const/16 v24, 0x0

    .line 947
    .line 948
    const/16 v25, 0x0

    .line 949
    .line 950
    const/16 v27, 0xd86

    .line 951
    .line 952
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 953
    .line 954
    .line 955
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 956
    .line 957
    .line 958
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 959
    .line 960
    .line 961
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 962
    .line 963
    .line 964
    move-result v0

    .line 965
    if-eqz v0, :cond_16

    .line 966
    .line 967
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 968
    .line 969
    .line 970
    :cond_16
    move-object/from16 v1, v36

    .line 971
    .line 972
    goto :goto_9

    .line 973
    :cond_17
    move-object/from16 v26, v1

    .line 974
    .line 975
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 976
    .line 977
    .line 978
    move-object v1, v6

    .line 979
    :goto_9
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 980
    .line 981
    .line 982
    move-result-object v6

    .line 983
    if-eqz v6, :cond_18

    .line 984
    .line 985
    new-instance v0, Lz5/d0;

    .line 986
    .line 987
    move-object/from16 v2, p1

    .line 988
    .line 989
    move/from16 v4, p4

    .line 990
    .line 991
    move/from16 v5, p5

    .line 992
    .line 993
    invoke-direct/range {v0 .. v5}, Lz5/d0;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    .line 994
    .line 995
    .line 996
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 997
    .line 998
    .line 999
    :cond_18
    return-void
.end method

.method public static final r(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move v5, p4

    .line 11
    move-object v3, p5

    .line 12
    invoke-static/range {v0 .. v5}, Lz5/i0;->q(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final s(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 28

    move-object/from16 v1, p1

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v12, p8

    move-object/from16 v5, p9

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v0, p12

    move-object/from16 v2, p13

    move-object/from16 v3, p14

    move/from16 v4, p16

    move/from16 v6, p17

    const-string v7, "topicList"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "title"

    invoke-static {v9, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "stemList"

    invoke-static {v10, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onClickStem"

    invoke-static {v11, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "selectedTagList"

    invoke-static {v12, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onTopicSelected"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onTitleChange"

    invoke-static {v13, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onClickTag"

    invoke-static {v14, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onClickCancel"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onClickConfirm"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onClickDeleteStem"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v7, 0x106ec5f1

    move-object/from16 v8, p15

    .line 1
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    and-int/lit8 v15, p18, 0x1

    if-eqz v15, :cond_0

    or-int/lit8 v17, v4, 0x6

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v17, v4, 0x6

    move-object/from16 v7, p0

    if-nez v17, :cond_2

    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1

    const/16 v17, 0x4

    goto :goto_0

    :cond_1
    const/16 v17, 0x2

    :goto_0
    or-int v17, v4, v17

    goto :goto_1

    :cond_2
    move/from16 v17, v4

    :goto_1
    and-int/lit8 v18, v4, 0x30

    const/16 v19, 0x10

    const/16 v20, 0x20

    if-nez v18, :cond_4

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_3

    move/from16 v18, v20

    goto :goto_2

    :cond_3
    move/from16 v18, v19

    :goto_2
    or-int v17, v17, v18

    :cond_4
    and-int/lit16 v1, v4, 0x180

    const/16 v18, 0x80

    const/16 v21, 0x100

    if-nez v1, :cond_6

    move-wide/from16 v1, p2

    invoke-interface {v8, v1, v2}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v22

    if-eqz v22, :cond_5

    move/from16 v22, v21

    goto :goto_3

    :cond_5
    move/from16 v22, v18

    :goto_3
    or-int v17, v17, v22

    goto :goto_4

    :cond_6
    move-wide/from16 v1, p2

    :goto_4
    and-int/lit16 v1, v4, 0xc00

    const/16 v22, 0x800

    if-nez v1, :cond_8

    move/from16 v1, p4

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v23

    if-eqz v23, :cond_7

    move/from16 v23, v22

    goto :goto_5

    :cond_7
    const/16 v23, 0x400

    :goto_5
    or-int v17, v17, v23

    goto :goto_6

    :cond_8
    move/from16 v1, p4

    :goto_6
    and-int/lit16 v2, v4, 0x6000

    if-nez v2, :cond_a

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/16 v2, 0x4000

    goto :goto_7

    :cond_9
    const/16 v2, 0x2000

    :goto_7
    or-int v17, v17, v2

    :cond_a
    const/high16 v2, 0x30000

    and-int/2addr v2, v4

    if-nez v2, :cond_c

    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/high16 v2, 0x20000

    goto :goto_8

    :cond_b
    const/high16 v2, 0x10000

    :goto_8
    or-int v17, v17, v2

    :cond_c
    const/high16 v2, 0x180000

    and-int/2addr v2, v4

    if-nez v2, :cond_e

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v2, 0x80000

    :goto_9
    or-int v17, v17, v2

    :cond_e
    const/high16 v2, 0xc00000

    and-int/2addr v2, v4

    if-nez v2, :cond_10

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    const/high16 v2, 0x800000

    goto :goto_a

    :cond_f
    const/high16 v2, 0x400000

    :goto_a
    or-int v17, v17, v2

    :cond_10
    const/high16 v2, 0x6000000

    and-int/2addr v2, v4

    if-nez v2, :cond_12

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    const/high16 v2, 0x4000000

    goto :goto_b

    :cond_11
    const/high16 v2, 0x2000000

    :goto_b
    or-int v17, v17, v2

    :cond_12
    const/high16 v2, 0x30000000

    and-int/2addr v2, v4

    if-nez v2, :cond_14

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    const/high16 v2, 0x20000000

    goto :goto_c

    :cond_13
    const/high16 v2, 0x10000000

    :goto_c
    or-int v17, v17, v2

    :cond_14
    move/from16 v2, v17

    and-int/lit8 v17, v6, 0x6

    if-nez v17, :cond_16

    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    const/16 v17, 0x4

    goto :goto_d

    :cond_15
    const/16 v17, 0x2

    :goto_d
    or-int v17, v6, v17

    goto :goto_e

    :cond_16
    move/from16 v17, v6

    :goto_e
    and-int/lit8 v24, v6, 0x30

    if-nez v24, :cond_18

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_17

    move/from16 v19, v20

    :cond_17
    or-int v17, v17, v19

    :cond_18
    and-int/lit16 v0, v6, 0x180

    if-nez v0, :cond_1a

    move-object/from16 v0, p13

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_19

    move/from16 v18, v21

    :cond_19
    or-int v17, v17, v18

    goto :goto_f

    :cond_1a
    move-object/from16 v0, p13

    :goto_f
    and-int/lit16 v0, v6, 0xc00

    if-nez v0, :cond_1c

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_10

    :cond_1b
    const/16 v22, 0x400

    :goto_10
    or-int v17, v17, v22

    :cond_1c
    move/from16 v0, v17

    const v17, 0x12492493

    and-int v1, v2, v17

    const v3, 0x12492492

    if-ne v1, v3, :cond_1e

    and-int/lit16 v1, v0, 0x493

    const/16 v3, 0x492

    if-eq v1, v3, :cond_1d

    goto :goto_11

    :cond_1d
    const/4 v1, 0x0

    goto :goto_12

    :cond_1e
    :goto_11
    const/4 v1, 0x1

    :goto_12
    and-int/lit8 v3, v2, 0x1

    invoke-interface {v8, v1, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_2a

    if-eqz v15, :cond_1f

    .line 2
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_13

    :cond_1f
    move-object v1, v7

    :goto_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_20

    const-string v3, "com.zykj.evaluation.ui.detail.mistake.MainContent (MistakeMainView.kt:63)"

    const v7, 0x106ec5f1

    invoke-static {v7, v2, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 3
    :cond_20
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v7

    .line 4
    sget-object v22, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v15

    const/4 v9, 0x0

    .line 5
    invoke-static {v7, v15, v8, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v7

    .line 6
    invoke-static {v8, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v15

    .line 7
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v9

    move/from16 v24, v0

    .line 8
    invoke-static {v8, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 9
    sget-object v25, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 p0, v1

    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    .line 10
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v16

    if-nez v16, :cond_21

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 11
    :cond_21
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v16

    if-eqz v16, :cond_22

    .line 13
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_14

    .line 14
    :cond_22
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 15
    :goto_14
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v1

    move-object/from16 v26, v3

    .line 16
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v1, v7, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 17
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v1, v9, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 18
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    .line 19
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-nez v7, :cond_23

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_24

    .line 20
    :cond_23
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 21
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v7, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 22
    :cond_24
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v1, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    sget-object v9, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    shl-int/lit8 v0, v24, 0x3

    and-int/lit16 v0, v0, 0x380

    const/4 v1, 0x6

    or-int/lit8 v19, v0, 0x6

    const/16 v20, 0x2

    .line 24
    const-string v15, "\u6dfb\u52a0\u9519\u9898"

    const/16 v16, 0x0

    move-object/from16 v17, p12

    move-object/from16 v18, v8

    invoke-static/range {v15 .. v20}, Le7/s0;->c(Ljava/lang/String;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v3, v18

    .line 25
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    .line 26
    invoke-static {v10, v0, v8, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v15, 0x73

    int-to-float v15, v15

    const/16 v1, 0x258

    int-to-float v1, v1

    div-float/2addr v15, v1

    .line 27
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 28
    iget v7, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v7, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-float v0, v0

    .line 29
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v7

    mul-float/2addr v15, v0

    .line 30
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    move/from16 v17, v1

    const/4 v1, 0x2

    const/4 v7, 0x0

    const/4 v15, 0x0

    .line 31
    invoke-static {v8, v0, v15, v1, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 32
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v1

    .line 33
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v7

    const/4 v8, 0x0

    .line 34
    invoke-static {v1, v7, v3, v8}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    .line 35
    invoke-static {v3, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v7

    .line 36
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v8

    .line 37
    invoke-static {v3, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 38
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    .line 39
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v18

    if-nez v18, :cond_25

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 40
    :cond_25
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 41
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v18

    if-eqz v18, :cond_26

    .line 42
    invoke-interface {v3, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_15

    .line 43
    :cond_26
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 44
    :goto_15
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v15

    .line 45
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v15, v1, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 46
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v15, v8, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 47
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 48
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v4

    if-nez v4, :cond_27

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_28

    .line 49
    :cond_27
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 50
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v15, v4, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 51
    :cond_28
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v15, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    const/16 v0, 0x1e

    int-to-float v0, v0

    div-float v15, v0, v17

    .line 52
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 53
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-float v0, v0

    .line 54
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    mul-float/2addr v0, v15

    .line 55
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 56
    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v3, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    and-int/lit16 v0, v2, 0x1ff0

    shr-int/lit8 v4, v2, 0xc

    const v7, 0xe000

    and-int/2addr v7, v4

    or-int/2addr v7, v0

    const/4 v8, 0x1

    const/4 v0, 0x0

    move-object/from16 v16, p0

    move v13, v1

    move-object v6, v3

    move-object/from16 p0, v9

    move/from16 v18, v17

    move/from16 v11, v24

    const/4 v12, 0x4

    move-object/from16 v1, p1

    move/from16 v17, v2

    move v9, v4

    move-wide/from16 v2, p2

    move/from16 v4, p4

    .line 57
    invoke-static/range {v0 .. v8}, Lz5/i0;->L(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v6

    const/16 v0, 0xa

    int-to-float v0, v0

    div-float v7, v0, v18

    .line 58
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 59
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-float v0, v0

    .line 60
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    mul-float/2addr v0, v7

    .line 61
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 62
    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v3, v13}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    shr-int/lit8 v0, v17, 0x9

    and-int/lit8 v0, v0, 0x70

    shr-int/lit8 v1, v17, 0x15

    and-int/lit16 v1, v1, 0x380

    or-int v4, v0, v1

    const/4 v5, 0x1

    const/4 v0, 0x0

    move-object/from16 v1, p5

    move-object/from16 v2, p10

    .line 63
    invoke-static/range {v0 .. v5}, Lz5/i0;->H(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v0, v12

    div-float v8, v0, v18

    .line 64
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 65
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-float v0, v0

    .line 66
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    mul-float/2addr v0, v8

    .line 67
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 68
    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v3, v13}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 69
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 70
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-float v0, v0

    .line 71
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    mul-float/2addr v0, v7

    .line 72
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 73
    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    and-int/lit8 v1, v9, 0x70

    or-int/2addr v1, v13

    and-int/lit16 v2, v9, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v2, v11, 0x1c00

    or-int v5, v1, v2

    const/4 v6, 0x0

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    move-object v4, v3

    move-object/from16 v3, p14

    .line 74
    invoke-static/range {v0 .. v6}, Lz5/i0;->u(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v4

    .line 75
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 76
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-float v0, v0

    .line 77
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    mul-float/2addr v8, v0

    .line 78
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 79
    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v3, v13}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/16 v0, 0x15e

    int-to-float v0, v0

    div-float v0, v0, v18

    .line 80
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 81
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    int-to-float v1, v1

    .line 82
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    mul-float/2addr v0, v1

    .line 83
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 84
    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 85
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 86
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    int-to-float v1, v1

    .line 87
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    mul-float/2addr v7, v1

    .line 88
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 89
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shr-int/lit8 v1, v17, 0x12

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v13

    shl-int/lit8 v2, v11, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int v4, v1, v2

    const/4 v5, 0x0

    move-object/from16 v1, p8

    move-object v2, v14

    .line 90
    invoke-static/range {v0 .. v5}, Lz5/i0;->D(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v1, v13

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v12, 0x0

    move-object/from16 v9, p0

    move v6, v1

    move/from16 v0, v24

    .line 91
    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v8, 0x0

    invoke-static {v1, v3, v8}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 92
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v1

    invoke-interface {v9, v10, v1}, Landroidx/compose/foundation/layout/ColumnScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit16 v4, v0, 0x3f0

    move-object/from16 v2, p13

    move-object v0, v1

    move-object/from16 v1, p12

    .line 93
    invoke-static/range {v0 .. v5}, Lz5/i0;->q(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 94
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 95
    iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-float v0, v0

    .line 96
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    mul-float/2addr v15, v0

    .line 97
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 98
    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v3, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 99
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 100
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 101
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_29
    move-object/from16 v1, v16

    goto :goto_16

    :cond_2a
    move-object v3, v8

    .line 102
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v1, v7

    .line 103
    :goto_16
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_2b

    move-object v2, v0

    new-instance v0, Lz5/s;

    move-wide/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v27, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v18}, Lz5/s;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;III)V

    move-object/from16 v2, v27

    invoke-interface {v2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2b
    return-void
.end method

.method public static final t(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 20

    .line 1
    or-int/lit8 v0, p15, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v17

    .line 7
    invoke-static/range {p16 .. p16}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 8
    .line 9
    .line 10
    move-result v18

    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    move-wide/from16 v3, p2

    .line 16
    .line 17
    move/from16 v5, p4

    .line 18
    .line 19
    move-object/from16 v6, p5

    .line 20
    .line 21
    move-object/from16 v7, p6

    .line 22
    .line 23
    move-object/from16 v8, p7

    .line 24
    .line 25
    move-object/from16 v9, p8

    .line 26
    .line 27
    move-object/from16 v10, p9

    .line 28
    .line 29
    move-object/from16 v11, p10

    .line 30
    .line 31
    move-object/from16 v12, p11

    .line 32
    .line 33
    move-object/from16 v13, p12

    .line 34
    .line 35
    move-object/from16 v14, p13

    .line 36
    .line 37
    move-object/from16 v15, p14

    .line 38
    .line 39
    move/from16 v19, p17

    .line 40
    .line 41
    move-object/from16 v16, p18

    .line 42
    .line 43
    invoke-static/range {v1 .. v19}, Lz5/i0;->s(Landroidx/compose/ui/Modifier;Ljava/util/List;JZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 47
    .line 48
    return-object v0
.end method

.method public static final u(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 65

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const v0, -0x6bf2afbb

    move-object/from16 v1, p4

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_4

    move-object/from16 v8, p1

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    const/16 v9, 0x20

    goto :goto_2

    :cond_3
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v7, v9

    goto :goto_3

    :cond_4
    move-object/from16 v8, p1

    :goto_3
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_6

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v7, v9

    :cond_6
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_8

    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x800

    goto :goto_5

    :cond_7
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v7, v9

    :cond_8
    and-int/lit16 v9, v7, 0x493

    const/16 v12, 0x492

    const/4 v14, 0x0

    if-eq v9, v12, :cond_9

    const/4 v9, 0x1

    goto :goto_6

    :cond_9
    move v9, v14

    :goto_6
    and-int/lit8 v12, v7, 0x1

    invoke-interface {v13, v9, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v9

    if-eqz v9, :cond_2e

    if-eqz v1, :cond_a

    .line 2
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_7

    :cond_a
    move-object v1, v6

    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_b

    const/4 v6, -0x1

    const-string v9, "com.zykj.evaluation.ui.detail.mistake.StemView (MistakeMainView.kt:264)"

    invoke-static {v0, v7, v6, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 3
    :cond_b
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v6

    .line 4
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v12

    .line 5
    invoke-static {v6, v12, v13, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v6

    .line 6
    invoke-static {v13, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v12

    .line 7
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v10

    .line 8
    invoke-static {v13, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    .line 9
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    .line 10
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v19

    if-nez v19, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 11
    :cond_c
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v19

    if-eqz v19, :cond_d

    .line 13
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_8

    .line 14
    :cond_d
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 15
    :goto_8
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v15

    .line 16
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v15, v6, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 17
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v15, v10, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 18
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    .line 19
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-nez v6, :cond_e

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    .line 20
    :cond_e
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 21
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v15, v6, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 22
    :cond_f
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v15, v11, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 24
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v2

    .line 25
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 26
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v0

    const/16 v9, 0x30

    .line 27
    invoke-static {v0, v2, v13, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v0

    .line 28
    invoke-static {v13, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v2

    .line 29
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v10

    .line 30
    invoke-static {v13, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    .line 31
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v12

    .line 32
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v15

    if-nez v15, :cond_10

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 33
    :cond_10
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 34
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v15

    if-eqz v15, :cond_11

    .line 35
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_9

    .line 36
    :cond_11
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 37
    :goto_9
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v12

    .line 38
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v15

    invoke-static {v12, v0, v15}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 39
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v12, v10, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 40
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .line 41
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v10

    if-nez v10, :cond_12

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_13

    .line 42
    :cond_12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 43
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v12, v2, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 44
    :cond_13
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v12, v11, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 45
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    const/16 v0, 0x1e

    int-to-float v0, v0

    const/16 v2, 0x258

    int-to-float v2, v2

    div-float/2addr v0, v2

    .line 46
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    .line 47
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v10

    int-to-float v10, v10

    .line 48
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v10, v11

    mul-float/2addr v10, v0

    .line 49
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    .line 50
    invoke-static {v6, v10}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v10, 0x8

    .line 51
    invoke-static {v10}, Lo5/e;->k(I)J

    move-result-wide v34

    const-wide v11, 0xff5a5a5aL

    .line 52
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v32

    .line 53
    new-instance v26, Landroidx/compose/ui/text/TextStyle;

    const v61, 0xfffffc

    const/16 v62, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-wide/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const-wide/16 v53, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    move-object/from16 v31, v26

    invoke-direct/range {v31 .. v62}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v29, 0x0

    const v30, 0xfffc

    move v11, v7

    move-object v7, v6

    .line 54
    const-string v6, "\u9898\u5e72\uff1a"

    move v12, v9

    const-wide/16 v8, 0x0

    move/from16 v17, v10

    move v15, v11

    const-wide/16 v10, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v27, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/16 v22, 0x800

    const-wide/16 v15, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    const/16 v24, 0x1

    const/16 v18, 0x0

    move/from16 v25, v19

    move/from16 v28, v20

    const-wide/16 v19, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v36, v28

    const/16 v28, 0x36

    move/from16 p0, v0

    move/from16 v63, v31

    move/from16 v0, v36

    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v27

    const v6, -0x415852f7

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 55
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    move v14, v0

    :goto_a
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_28

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v22, v14, 0x1

    if-gez v14, :cond_14

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_14
    check-cast v6, Lz5/f;

    .line 56
    sget-object v23, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/16 v9, 0x3c

    int-to-float v9, v9

    div-float/2addr v9, v2

    .line 57
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    .line 58
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v10

    int-to-float v10, v10

    .line 59
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v10, v11

    mul-float/2addr v10, v9

    .line 60
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v26

    .line 61
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    .line 62
    iget v11, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v11, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v10

    int-to-float v10, v10

    .line 63
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    iget v11, v11, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v10, v11

    mul-float/2addr v9, v10

    .line 64
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v27

    const/16 v28, 0x3

    const/16 v29, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    .line 65
    invoke-static/range {v23 .. v29}, Landroidx/compose/foundation/layout/SizeKt;->sizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v10, v23

    .line 66
    sget-object v23, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v11

    .line 67
    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v11

    .line 68
    invoke-static {v13, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v12

    .line 69
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v15

    .line 70
    invoke-static {v13, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 71
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    .line 72
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v17

    if-nez v17, :cond_15

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 73
    :cond_15
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 74
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v17

    if-eqz v17, :cond_16

    .line 75
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_b

    .line 76
    :cond_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 77
    :goto_b
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .line 78
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v8, v11, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 79
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v8, v15, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 80
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    .line 81
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v11

    if-nez v11, :cond_17

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_18

    .line 82
    :cond_17
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 83
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v8, v11, v7}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 84
    :cond_18
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v8, v9, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 85
    sget-object v7, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 86
    invoke-virtual {v6}, Lz5/f;->c()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_24

    const v8, -0x438aa5e3

    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 87
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v8

    invoke-interface {v7, v10, v8}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 88
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v11

    .line 89
    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v11

    .line 90
    invoke-static {v13, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v12

    .line 91
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v15

    .line 92
    invoke-static {v13, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    .line 93
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    .line 94
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v18

    if-nez v18, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 95
    :cond_19
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 96
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v18

    if-eqz v18, :cond_1a

    .line 97
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_c

    .line 98
    :cond_1a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 99
    :goto_c
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    .line 100
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v0, v11, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 101
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v0, v15, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 102
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    .line 103
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v11

    if-nez v11, :cond_1b

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1c

    .line 104
    :cond_1b
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v0, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 105
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v0, v11, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 106
    :cond_1c
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v0, v8, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Alignment$Companion;->getBottomStart()Landroidx/compose/ui/Alignment;

    move-result-object v0

    invoke-interface {v7, v10, v0}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v31

    const/4 v0, 0x5

    int-to-float v0, v0

    div-float/2addr v0, v2

    .line 108
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    .line 109
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v8

    int-to-float v8, v8

    .line 110
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v8, v9

    mul-float/2addr v8, v0

    .line 111
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v33

    .line 112
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    .line 113
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v8

    int-to-float v8, v8

    .line 114
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v8, v9

    mul-float/2addr v0, v8

    .line 115
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v34

    const/16 v36, 0x9

    const/16 v37, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    .line 116
    invoke-static/range {v31 .. v37}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v8, 0x1

    int-to-float v9, v8

    .line 117
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v9

    const-wide v11, 0xffccccccL

    .line 118
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v11

    const/4 v15, 0x2

    int-to-float v8, v15

    div-float/2addr v8, v2

    .line 119
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v15

    move-object/from16 v31, v1

    .line 120
    iget v1, v15, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v15, v15, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v1, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    int-to-float v1, v1

    .line 121
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v15

    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v15

    mul-float/2addr v1, v8

    .line 122
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 123
    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    .line 124
    invoke-static {v0, v9, v11, v12, v1}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 125
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 126
    iget v9, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v9, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    int-to-float v1, v1

    .line 127
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v9

    mul-float/2addr v8, v1

    .line 128
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 129
    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v1, v63

    and-int/lit16 v8, v1, 0x380

    const/16 v9, 0x100

    if-ne v8, v9, :cond_1d

    const/4 v8, 0x1

    goto :goto_d

    :cond_1d
    const/4 v8, 0x0

    .line 130
    :goto_d
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v11

    or-int/2addr v8, v11

    .line 131
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_1e

    .line 132
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v11, v8, :cond_1f

    .line 133
    :cond_1e
    new-instance v11, Lz5/e0;

    invoke-direct {v11, v3, v14}, Lz5/e0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    .line 134
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 135
    :cond_1f
    check-cast v11, Lkotlin/jvm/functions/Function0;

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x1

    invoke-static {v0, v12, v11, v14, v8}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v11, v6

    .line 136
    invoke-virtual {v11}, Lz5/f;->c()Ljava/lang/String;

    move-result-object v6

    const/16 v19, 0x0

    const/16 v20, 0x7f8

    move-object v12, v7

    const/4 v7, 0x0

    move/from16 v64, v9

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v27, v13

    const/4 v13, 0x0

    move/from16 v24, v14

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v25, v16

    const/16 v16, 0x0

    move-object/from16 v26, v18

    const/16 v18, 0x30

    move/from16 v24, v2

    move-object v3, v8

    move-object/from16 v5, v17

    move-object/from16 v2, v26

    move-object/from16 v17, v27

    move-object v8, v0

    move-object/from16 v0, v25

    .line 137
    invoke-static/range {v6 .. v20}, Lcoil3/compose/c;->a(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v17

    .line 138
    invoke-virtual {v0}, Lz5/f;->e()Z

    move-result v6

    if-nez v6, :cond_23

    const v6, 0x630f417b

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/16 v6, 0xb

    int-to-float v6, v6

    div-float v6, v6, v24

    .line 139
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    .line 140
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v7

    int-to-float v7, v7

    .line 141
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v7, v8

    mul-float/2addr v7, v6

    .line 142
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 143
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    .line 144
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v8

    int-to-float v8, v8

    .line 145
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v8, v9

    mul-float/2addr v6, v8

    .line 146
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 147
    invoke-static {v2, v7, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 148
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Alignment$Companion;->getTopEnd()Landroidx/compose/ui/Alignment;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit16 v6, v1, 0x1c00

    const/16 v7, 0x800

    if-ne v6, v7, :cond_20

    const/4 v14, 0x1

    goto :goto_e

    :cond_20
    const/4 v14, 0x0

    .line 149
    :goto_e
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v6, v14

    .line 150
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_21

    .line 151
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v8, v6, :cond_22

    .line 152
    :cond_21
    new-instance v8, Lz5/f0;

    invoke-direct {v8, v4, v0}, Lz5/f0;-><init>(Lkotlin/jvm/functions/Function1;Lz5/f;)V

    .line 153
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 154
    :cond_22
    check-cast v8, Lkotlin/jvm/functions/Function0;

    const/4 v0, 0x1

    const/4 v12, 0x0

    invoke-static {v5, v12, v8, v0, v3}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v3, 0x7f0800f2

    const/4 v5, 0x6

    .line 155
    invoke-static {v3, v13, v5}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v6

    const/16 v14, 0x30

    const/16 v15, 0x78

    move/from16 v16, v7

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 156
    invoke-static/range {v6 .. v15}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 157
    :goto_f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_10

    :cond_23
    const/4 v0, 0x1

    const/4 v5, 0x6

    const/16 v16, 0x800

    const v3, 0x627b9b09

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    goto :goto_f

    .line 158
    :goto_10
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 159
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v64, 0x100

    goto/16 :goto_14

    :cond_24
    move-object/from16 v31, v1

    move/from16 v24, v2

    move-object v2, v10

    move/from16 v1, v63

    const/4 v0, 0x1

    const/4 v3, 0x0

    const/4 v5, 0x6

    const/16 v16, 0x800

    const v6, -0x4371c03d

    .line 160
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v6, 0x0

    .line 161
    invoke-static {v2, v6, v0, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v32

    const/4 v6, 0x5

    int-to-float v6, v6

    div-float v6, v6, v24

    .line 162
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    .line 163
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v7

    int-to-float v7, v7

    .line 164
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v7, v8

    mul-float/2addr v7, v6

    .line 165
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v34

    .line 166
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    .line 167
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v7

    int-to-float v7, v7

    .line 168
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v7, v8

    mul-float/2addr v6, v7

    .line 169
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v35

    const/16 v37, 0x9

    const/16 v38, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    .line 170
    invoke-static/range {v32 .. v38}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    and-int/lit16 v7, v1, 0x380

    const/16 v8, 0x100

    if-ne v7, v8, :cond_25

    move v7, v0

    goto :goto_11

    :cond_25
    const/4 v7, 0x0

    .line 171
    :goto_11
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v9

    or-int/2addr v7, v9

    .line 172
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_27

    .line 173
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v9, v7, :cond_26

    goto :goto_12

    :cond_26
    move-object/from16 v7, p2

    goto :goto_13

    .line 174
    :cond_27
    :goto_12
    new-instance v9, Lz5/g0;

    move-object/from16 v7, p2

    invoke-direct {v9, v7, v14}, Lz5/g0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    .line 175
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 176
    :goto_13
    check-cast v9, Lkotlin/jvm/functions/Function0;

    const/4 v12, 0x0

    invoke-static {v6, v12, v9, v0, v3}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v6, 0x7f0800d8

    .line 177
    invoke-static {v6, v13, v5}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v6

    const/16 v14, 0x30

    const/16 v15, 0x78

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v64, v8

    move-object v8, v3

    .line 178
    invoke-static/range {v6 .. v15}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 179
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 180
    :goto_14
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    int-to-float v3, v5

    div-float v3, v3, v24

    .line 181
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    .line 182
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v7, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v6

    int-to-float v6, v6

    .line 183
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v6, v7

    mul-float/2addr v3, v6

    .line 184
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 185
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v13, v5}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v63, v1

    move/from16 v14, v22

    move/from16 v2, v24

    move-object/from16 v1, v31

    const/4 v0, 0x0

    goto/16 :goto_a

    :cond_28
    move-object/from16 v31, v1

    move/from16 v24, v2

    const/4 v5, 0x6

    .line 186
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 187
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 188
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v0, 0x5

    int-to-float v1, v0

    div-float v1, v1, v24

    .line 189
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 190
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    int-to-float v2, v2

    .line 191
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v2, v3

    mul-float/2addr v1, v2

    .line 192
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 193
    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v13, v5}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 194
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 195
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    int-to-float v1, v1

    .line 196
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v2

    mul-float v1, v1, p0

    .line 197
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 198
    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v2, v6

    .line 199
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v3

    .line 200
    sget-object v6, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v6

    const/16 v12, 0x30

    .line 201
    invoke-static {v6, v3, v13, v12}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    const/4 v12, 0x0

    .line 202
    invoke-static {v13, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v6

    .line 203
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v7

    .line 204
    invoke-static {v13, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 205
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v9

    .line 206
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v10

    if-nez v10, :cond_29

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 207
    :cond_29
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 208
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v10

    if-eqz v10, :cond_2a

    .line 209
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_15

    .line 210
    :cond_2a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 211
    :goto_15
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .line 212
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v10

    invoke-static {v9, v3, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 213
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v7, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 214
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    .line 215
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-nez v7, :cond_2b

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2c

    .line 216
    :cond_2b
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 217
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v9, v6, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 218
    :cond_2c
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v3

    invoke-static {v9, v1, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 219
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    const/16 v1, 0x8

    int-to-float v1, v1

    div-float v1, v1, v24

    .line 220
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 221
    iget v6, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v6, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    int-to-float v3, v3

    .line 222
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v3, v6

    mul-float/2addr v3, v1

    .line 223
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 224
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    .line 225
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v7, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v6

    int-to-float v6, v6

    .line 226
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v6, v7

    mul-float/2addr v1, v6

    .line 227
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 228
    invoke-static {v2, v3, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const v1, 0x7f080107

    .line 229
    invoke-static {v1, v13, v5}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v6

    const/16 v14, 0x1b0

    const/16 v15, 0x78

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v17, v0

    .line 230
    invoke-static/range {v6 .. v15}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    const/4 v15, 0x2

    int-to-float v0, v15

    div-float v0, v0, v24

    .line 231
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 232
    iget v3, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v3, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    int-to-float v1, v1

    .line 233
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v1, v3

    mul-float/2addr v0, v1

    .line 234
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 235
    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v13, v5}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v0, 0x7f120036

    .line 236
    invoke-static {v0, v13, v5}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    .line 237
    invoke-static/range {v17 .. v17}, Lo5/e;->k(I)J

    move-result-wide v10

    const-wide v0, 0xff888888L

    .line 238
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v8

    const/16 v29, 0x0

    const v30, 0x1fff2

    move-object/from16 v27, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0xd80

    .line 239
    invoke-static/range {v6 .. v30}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v27

    .line 240
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 241
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 242
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2d
    move-object/from16 v1, v31

    goto :goto_16

    .line 243
    :cond_2e
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v1, v6

    .line 244
    :goto_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v7

    if-eqz v7, :cond_2f

    new-instance v0, Lz5/h0;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lz5/h0;-><init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_2f
    return-void
.end method

.method public static final v(Lkotlin/jvm/functions/Function1;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final w(Lkotlin/jvm/functions/Function1;Lz5/f;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final x(Lkotlin/jvm/functions/Function1;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final y(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    .line 1
    or-int/lit8 p4, p4, 0x1

    .line 2
    .line 3
    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v5

    .line 7
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move-object v3, p3

    .line 11
    move v6, p5

    .line 12
    move-object v4, p6

    .line 13
    invoke-static/range {v0 .. v6}, Lz5/i0;->u(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final z(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v0, p1

    const v3, 0x49987205

    move-object/from16 v4, p2

    .line 1
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    and-int/lit8 v4, p4, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v6, p3, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, p3, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int v7, p3, v7

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move/from16 v7, p3

    :goto_1
    and-int/lit8 v8, p3, 0x30

    if-nez v8, :cond_4

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit8 v8, v7, 0x13

    const/16 v10, 0x12

    const/4 v12, 0x0

    if-eq v8, v10, :cond_5

    const/4 v8, 0x1

    goto :goto_3

    :cond_5
    move v8, v12

    :goto_3
    and-int/lit8 v10, v7, 0x1

    invoke-interface {v11, v8, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v8

    if-eqz v8, :cond_17

    const/4 v8, 0x0

    if-eqz v4, :cond_6

    move-object v4, v8

    goto :goto_4

    :cond_6
    move-object v4, v6

    .line 2
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v6

    if-eqz v6, :cond_7

    const/4 v6, -0x1

    const-string v10, "com.zykj.evaluation.ui.detail.mistake.TagItemView (MistakeMainView.kt:394)"

    invoke-static {v3, v7, v6, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 3
    :cond_7
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/16 v6, 0x1d

    int-to-float v6, v6

    const/16 v10, 0x258

    int-to-float v10, v10

    div-float/2addr v6, v10

    .line 4
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v14

    .line 5
    iget v15, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v15, v14}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v14

    int-to-float v14, v14

    .line 6
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v15

    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v14, v15

    mul-float/2addr v6, v14

    .line 7
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 8
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 9
    sget-object v29, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v14

    .line 10
    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v14

    .line 11
    invoke-static {v11, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v15

    .line 12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v9

    .line 13
    invoke-static {v11, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 14
    sget-object v16, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    .line 15
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v18

    if-nez v18, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 16
    :cond_8
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v18

    if-eqz v18, :cond_9

    .line 18
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_5

    .line 19
    :cond_9
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 20
    :goto_5
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v13

    .line 21
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v13, v14, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 22
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v12

    invoke-static {v13, v9, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    .line 24
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v12

    if-nez v12, :cond_a

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    .line 25
    :cond_a
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 26
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v13, v12, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 27
    :cond_b
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v13, v6, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    const/4 v9, 0x5

    const/16 v12, 0x18

    if-eqz v4, :cond_13

    const v14, -0x508c1047

    .line 29
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    int-to-float v12, v12

    div-float/2addr v12, v10

    .line 30
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v14

    .line 31
    iget v15, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v15, v14}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v14

    int-to-float v14, v14

    .line 32
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v15

    iget v15, v15, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v14, v15

    mul-float/2addr v12, v14

    .line 33
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    .line 34
    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v19

    int-to-float v9, v9

    div-float/2addr v9, v10

    .line 35
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v12

    .line 36
    iget v14, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v14, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v12

    int-to-float v12, v12

    .line 37
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v14

    invoke-virtual {v14}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v14

    iget v14, v14, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v12, v14

    mul-float/2addr v9, v12

    .line 38
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v22

    const/16 v24, 0xb

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    .line 39
    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const v12, 0x4d4797f3    # 2.0928901E8f

    .line 40
    invoke-static {v12}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    move-result-wide v14

    const/4 v12, 0x3

    int-to-float v12, v12

    div-float/2addr v12, v10

    .line 41
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    .line 42
    iget v5, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v13, v13, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v5, v13}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    int-to-float v5, v5

    .line 43
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v5, v13

    mul-float/2addr v12, v5

    .line 44
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 45
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v5

    .line 46
    invoke-static {v9, v14, v15, v5}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 47
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Alignment$Companion;->getBottomStart()Landroidx/compose/ui/Alignment;

    move-result-object v9

    invoke-interface {v6, v5, v9}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v9, 0xd

    int-to-float v9, v9

    div-float/2addr v9, v10

    .line 48
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v12

    .line 49
    iget v13, v12, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v12, v12, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v13, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v12

    int-to-float v12, v12

    .line 50
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    iget v13, v13, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v12, v13

    mul-float/2addr v9, v12

    .line 51
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v9

    const/4 v12, 0x0

    const/4 v13, 0x2

    .line 52
    invoke-static {v5, v9, v12, v13, v8}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 53
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v9

    const/4 v12, 0x0

    .line 54
    invoke-static {v9, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v9

    .line 55
    invoke-static {v11, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v13

    .line 56
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v14

    .line 57
    invoke-static {v11, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 58
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    .line 59
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v18

    if-nez v18, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 60
    :cond_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 61
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v18

    if-eqz v18, :cond_d

    .line 62
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_6

    .line 63
    :cond_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 64
    :goto_6
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v15

    .line 65
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v15, v9, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 66
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v15, v14, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 67
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    .line 68
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v9

    if-nez v9, :cond_e

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    .line 69
    :cond_e
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 70
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v15, v9, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 71
    :cond_f
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v15, v5, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 72
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v5

    invoke-interface {v6, v3, v5}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide v8, 0xff4797f3L

    .line 73
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v8

    const/4 v13, 0x7

    .line 74
    invoke-static {v13}, Lo5/e;->k(I)J

    move-result-wide v13

    and-int/lit8 v15, v7, 0xe

    or-int/lit16 v15, v15, 0xd80

    const/16 v27, 0x0

    const v28, 0x1fff0

    move/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v21, v6

    move/from16 v20, v7

    move-wide v6, v8

    move-wide v8, v13

    const-wide/16 v13, 0x0

    move/from16 v26, v15

    const/4 v15, 0x0

    move/from16 v22, v16

    const/16 v16, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    const-wide/16 v17, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move/from16 v31, v20

    const/16 v20, 0x0

    move-object/from16 v32, v21

    const/16 v21, 0x0

    move/from16 v33, v22

    const/16 v22, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move-object/from16 v1, v32

    const/16 v2, 0x20

    .line 75
    invoke-static/range {v4 .. v28}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object v14, v4

    move-object/from16 v11, v25

    .line 76
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    const/16 v4, 0xb

    int-to-float v4, v4

    div-float v4, v4, v33

    .line 77
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    .line 78
    iget v6, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v6, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    int-to-float v5, v5

    .line 79
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v5, v6

    mul-float/2addr v5, v4

    .line 80
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 81
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    .line 82
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v6, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v7, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v6

    int-to-float v6, v6

    .line 83
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v6, v7

    mul-float/2addr v4, v6

    .line 84
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 85
    invoke-static {v3, v5, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 86
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Alignment$Companion;->getTopEnd()Landroidx/compose/ui/Alignment;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit8 v3, v31, 0x70

    if-ne v3, v2, :cond_10

    const/4 v12, 0x1

    goto :goto_7

    :cond_10
    const/4 v12, 0x0

    .line 87
    :goto_7
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v12, :cond_11

    .line 88
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_12

    .line 89
    :cond_11
    new-instance v2, Lz5/w;

    invoke-direct {v2, v0}, Lz5/w;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 90
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 91
    :cond_12
    check-cast v2, Lkotlin/jvm/functions/Function0;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v12, 0x0

    invoke-static {v1, v12, v2, v5, v4}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v1, 0x7f0800f2

    const/4 v7, 0x6

    .line 92
    invoke-static {v1, v11, v7}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v4

    const/16 v12, 0x30

    const/16 v13, 0x78

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 93
    invoke-static/range {v4 .. v13}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 94
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_9

    :cond_13
    move-object v14, v4

    move-object v1, v6

    move/from16 v31, v7

    move-object v4, v8

    move/from16 v33, v10

    const/16 v2, 0x20

    const/4 v5, 0x1

    const/4 v7, 0x6

    const v6, -0x507c4d12

    .line 95
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/16 v6, 0x2a

    int-to-float v6, v6

    div-float v6, v6, v33

    .line 96
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    .line 97
    iget v10, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v10, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v8

    int-to-float v8, v8

    .line 98
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v8, v10

    mul-float/2addr v6, v8

    .line 99
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    int-to-float v8, v12

    div-float v8, v8, v33

    .line 100
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    .line 101
    iget v12, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v12, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v10

    int-to-float v10, v10

    .line 102
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v12

    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v10, v12

    mul-float/2addr v8, v10

    .line 103
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 104
    invoke-static {v3, v6, v8}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 105
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Alignment$Companion;->getBottomStart()Landroidx/compose/ui/Alignment;

    move-result-object v6

    invoke-interface {v1, v3, v6}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    int-to-float v1, v9

    div-float v1, v1, v33

    .line 106
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 107
    iget v6, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v6, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    int-to-float v3, v3

    .line 108
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v3, v6

    mul-float/2addr v1, v3

    .line 109
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v18

    const/16 v20, 0xb

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    .line 110
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit8 v3, v31, 0x70

    if-ne v3, v2, :cond_14

    move v12, v5

    goto :goto_8

    :cond_14
    const/4 v12, 0x0

    .line 111
    :goto_8
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v12, :cond_15

    .line 112
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_16

    .line 113
    :cond_15
    new-instance v2, Lz5/x;

    invoke-direct {v2, v0}, Lz5/x;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 114
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 115
    :cond_16
    check-cast v2, Lkotlin/jvm/functions/Function0;

    const/4 v12, 0x0

    invoke-static {v1, v12, v2, v5, v4}, Lg7/i;->g(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v1, 0x7f0800f5

    .line 116
    invoke-static {v1, v11, v7}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v4

    const/16 v12, 0x30

    const/16 v13, 0x78

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 117
    invoke-static/range {v4 .. v13}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 118
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 119
    :goto_9
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 120
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_a

    .line 121
    :cond_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v14, v6

    .line 122
    :cond_18
    :goto_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_19

    new-instance v2, Lz5/y;

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct {v2, v14, v0, v3, v4}, Lz5/y;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;II)V

    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_19
    return-void
.end method

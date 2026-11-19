.class public abstract Lv6/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lb7/w0;Lv6/k0;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lv6/j0;->n(Lb7/w0;Lv6/k0;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lv6/j0;->r(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lv6/j0;->m(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lv6/j0;->k(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/k0;Lb7/w0;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lv6/j0;->o(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/k0;Lb7/w0;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lv6/j0;->t(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lv6/j0;->q(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lv6/j0;->p(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lv6/j0;->s(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 18

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
    move/from16 v5, p5

    .line 8
    .line 9
    const v0, -0xf7988d2

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p4

    .line 13
    .line 14
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    and-int/lit8 v6, p6, 0x1

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    or-int/lit8 v7, v5, 0x6

    .line 23
    .line 24
    move v8, v7

    .line 25
    move-object/from16 v7, p0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    and-int/lit8 v7, v5, 0x6

    .line 29
    .line 30
    if-nez v7, :cond_2

    .line 31
    .line 32
    move-object/from16 v7, p0

    .line 33
    .line 34
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    if-eqz v8, :cond_1

    .line 39
    .line 40
    const/4 v8, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v8, 0x2

    .line 43
    :goto_0
    or-int/2addr v8, v5

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object/from16 v7, p0

    .line 46
    .line 47
    move v8, v5

    .line 48
    :goto_1
    and-int/lit8 v9, v5, 0x30

    .line 49
    .line 50
    if-nez v9, :cond_4

    .line 51
    .line 52
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-eqz v9, :cond_3

    .line 57
    .line 58
    const/16 v9, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    const/16 v9, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v8, v9

    .line 64
    :cond_4
    and-int/lit16 v9, v5, 0x180

    .line 65
    .line 66
    if-nez v9, :cond_6

    .line 67
    .line 68
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_5

    .line 73
    .line 74
    const/16 v9, 0x100

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    const/16 v9, 0x80

    .line 78
    .line 79
    :goto_3
    or-int/2addr v8, v9

    .line 80
    :cond_6
    and-int/lit16 v9, v5, 0xc00

    .line 81
    .line 82
    if-nez v9, :cond_8

    .line 83
    .line 84
    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v9, :cond_7

    .line 89
    .line 90
    const/16 v9, 0x800

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_7
    const/16 v9, 0x400

    .line 94
    .line 95
    :goto_4
    or-int/2addr v8, v9

    .line 96
    :cond_8
    and-int/lit16 v9, v8, 0x493

    .line 97
    .line 98
    const/16 v10, 0x492

    .line 99
    .line 100
    const/4 v11, 0x0

    .line 101
    if-eq v9, v10, :cond_9

    .line 102
    .line 103
    const/4 v9, 0x1

    .line 104
    goto :goto_5

    .line 105
    :cond_9
    move v9, v11

    .line 106
    :goto_5
    and-int/lit8 v10, v8, 0x1

    .line 107
    .line 108
    invoke-interface {v1, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    if-eqz v9, :cond_10

    .line 113
    .line 114
    if-eqz v6, :cond_a

    .line 115
    .line 116
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 117
    .line 118
    move-object v12, v6

    .line 119
    goto :goto_6

    .line 120
    :cond_a
    move-object v12, v7

    .line 121
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-eqz v6, :cond_b

    .line 126
    .line 127
    const/4 v6, -0x1

    .line 128
    const-string v7, "com.zykj.evaluation.ui.sheet.ManualPointBottomView (ManualPointPage.kt:113)"

    .line 129
    .line 130
    invoke-static {v0, v8, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_b
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 136
    .line 137
    .line 138
    move-result-wide v13

    .line 139
    const/16 v16, 0x2

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    const/4 v15, 0x0

    .line 144
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 149
    .line 150
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 155
    .line 156
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getEnd()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    const/16 v9, 0x36

    .line 161
    .line 162
    invoke-static {v7, v6, v1, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-static {v1, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-static {v1, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 179
    .line 180
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    if-nez v13, :cond_c

    .line 189
    .line 190
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 191
    .line 192
    .line 193
    :cond_c
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 194
    .line 195
    .line 196
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 197
    .line 198
    .line 199
    move-result v13

    .line 200
    if-eqz v13, :cond_d

    .line 201
    .line 202
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 203
    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_d
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 207
    .line 208
    .line 209
    :goto_7
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    invoke-static {v11, v6, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-static {v11, v9, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-nez v9, :cond_e

    .line 236
    .line 237
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v13

    .line 245
    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    if-nez v9, :cond_f

    .line 250
    .line 251
    :cond_e
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    invoke-interface {v11, v7, v6}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 263
    .line 264
    .line 265
    :cond_f
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    invoke-static {v11, v0, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 270
    .line 271
    .line 272
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 273
    .line 274
    const v0, 0x7f120182

    .line 275
    .line 276
    .line 277
    const/4 v6, 0x6

    .line 278
    invoke-static {v0, v1, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    and-int/lit8 v7, v8, 0x70

    .line 283
    .line 284
    invoke-static {v0, v2, v1, v7}, Lb7/s0;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 285
    .line 286
    .line 287
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 288
    .line 289
    const/4 v7, 0x5

    .line 290
    int-to-float v7, v7

    .line 291
    const/16 v9, 0x258

    .line 292
    .line 293
    int-to-float v9, v9

    .line 294
    div-float/2addr v7, v9

    .line 295
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 304
    .line 305
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 306
    .line 307
    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    int-to-float v9, v9

    .line 312
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 313
    .line 314
    .line 315
    move-result-object v10

    .line 316
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 317
    .line 318
    .line 319
    move-result-object v10

    .line 320
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 321
    .line 322
    div-float/2addr v9, v10

    .line 323
    mul-float/2addr v9, v7

    .line 324
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    invoke-static {v9, v1, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 333
    .line 334
    .line 335
    const v9, 0x7f12017e

    .line 336
    .line 337
    .line 338
    invoke-static {v9, v1, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    shr-int/lit8 v10, v8, 0x3

    .line 343
    .line 344
    and-int/lit8 v10, v10, 0x70

    .line 345
    .line 346
    invoke-static {v9, v3, v1, v10}, Lb7/s0;->e(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 347
    .line 348
    .line 349
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 354
    .line 355
    .line 356
    move-result-object v9

    .line 357
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 358
    .line 359
    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 360
    .line 361
    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 362
    .line 363
    .line 364
    move-result v9

    .line 365
    int-to-float v9, v9

    .line 366
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 367
    .line 368
    .line 369
    move-result-object v10

    .line 370
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 371
    .line 372
    .line 373
    move-result-object v10

    .line 374
    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    .line 375
    .line 376
    div-float/2addr v9, v10

    .line 377
    mul-float/2addr v9, v7

    .line 378
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 379
    .line 380
    .line 381
    move-result v9

    .line 382
    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    invoke-static {v9, v1, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 387
    .line 388
    .line 389
    const v9, 0x7f120040

    .line 390
    .line 391
    .line 392
    invoke-static {v9, v1, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v9

    .line 396
    shr-int/2addr v8, v6

    .line 397
    and-int/lit8 v8, v8, 0x70

    .line 398
    .line 399
    invoke-static {v9, v4, v1, v8}, Lb7/s0;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 400
    .line 401
    .line 402
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 403
    .line 404
    .line 405
    move-result-object v8

    .line 406
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 411
    .line 412
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 413
    .line 414
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 415
    .line 416
    .line 417
    move-result v8

    .line 418
    int-to-float v8, v8

    .line 419
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 420
    .line 421
    .line 422
    move-result-object v9

    .line 423
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 424
    .line 425
    .line 426
    move-result-object v9

    .line 427
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 428
    .line 429
    div-float/2addr v8, v9

    .line 430
    mul-float/2addr v7, v8

    .line 431
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 432
    .line 433
    .line 434
    move-result v7

    .line 435
    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-static {v0, v1, v6}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 443
    .line 444
    .line 445
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-eqz v0, :cond_11

    .line 450
    .line 451
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 452
    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_10
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 456
    .line 457
    .line 458
    move-object v12, v7

    .line 459
    :cond_11
    :goto_8
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    if-eqz v7, :cond_12

    .line 464
    .line 465
    new-instance v0, Lv6/i0;

    .line 466
    .line 467
    move/from16 v6, p6

    .line 468
    .line 469
    move-object v1, v12

    .line 470
    invoke-direct/range {v0 .. v6}, Lv6/i0;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V

    .line 471
    .line 472
    .line 473
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 474
    .line 475
    .line 476
    :cond_12
    return-void
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    invoke-static/range {v0 .. v6}, Lv6/j0;->j(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final l(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    .line 1
    const-string v0, "navController"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "viewModel"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x5c3b77c4

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    and-int/lit8 p2, p3, 0x6

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    const/4 p2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p2, 0x2

    .line 31
    :goto_0
    or-int/2addr p2, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p2, p3

    .line 34
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v1, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p2, v1

    .line 50
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 51
    .line 52
    const/16 v2, 0x12

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x1

    .line 56
    if-eq v1, v2, :cond_4

    .line 57
    .line 58
    move v1, v4

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move v1, v3

    .line 61
    :goto_3
    and-int/lit8 v2, p2, 0x1

    .line 62
    .line 63
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_b

    .line 68
    .line 69
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_5

    .line 74
    .line 75
    const/4 v1, -0x1

    .line 76
    const-string v2, "com.zykj.evaluation.ui.sheet.ManualPointPage (ManualPointPage.kt:38)"

    .line 77
    .line 78
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/evaluation/base/BaseViewModel;->b()Ll5/c;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->C()Lv6/k0;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-nez v0, :cond_6

    .line 98
    .line 99
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 100
    .line 101
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-ne v1, v0, :cond_7

    .line 106
    .line 107
    :cond_6
    new-instance v1, Lv6/a0;

    .line 108
    .line 109
    invoke-direct {v1, p0}, Lv6/a0;-><init>(Landroidx/navigation/NavController;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_7
    move-object v10, v1

    .line 116
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 117
    .line 118
    invoke-static {v3, v10, v5, v3, v4}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 126
    .line 127
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    if-ne v0, v2, :cond_8

    .line 132
    .line 133
    new-instance v0, Lb7/w0;

    .line 134
    .line 135
    const/4 v2, 0x0

    .line 136
    invoke-direct {v0, v2, v4, v2}, Lb7/w0;-><init>(Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_8
    move-object v7, v0

    .line 143
    check-cast v7, Lb7/w0;

    .line 144
    .line 145
    invoke-virtual {p2}, Ll5/c;->c()Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-nez v0, :cond_9

    .line 158
    .line 159
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v2, v0, :cond_a

    .line 164
    .line 165
    :cond_9
    new-instance v2, Lv6/b0;

    .line 166
    .line 167
    invoke-direct {v2, p1}, Lv6/b0;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_a
    move-object v3, v2

    .line 174
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 175
    .line 176
    new-instance v6, Lv6/c0;

    .line 177
    .line 178
    move-object v11, p0

    .line 179
    move-object v9, p1

    .line 180
    invoke-direct/range {v6 .. v11}, Lv6/c0;-><init>(Lb7/w0;Lv6/k0;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)V

    .line 181
    .line 182
    .line 183
    const/16 p0, 0x36

    .line 184
    .line 185
    const p1, 0x34f993e3

    .line 186
    .line 187
    .line 188
    invoke-static {p1, v4, v6, v5, p0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    const/16 v6, 0xc00

    .line 193
    .line 194
    const/4 v7, 0x2

    .line 195
    const/4 v2, 0x0

    .line 196
    move v1, p2

    .line 197
    invoke-static/range {v1 .. v7}, Le7/h;->d(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 198
    .line 199
    .line 200
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    if-eqz p0, :cond_c

    .line 205
    .line 206
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_b
    move-object v11, p0

    .line 211
    move-object v9, p1

    .line 212
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 213
    .line 214
    .line 215
    :cond_c
    :goto_4
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    if-eqz p0, :cond_d

    .line 220
    .line 221
    new-instance p1, Lv6/d0;

    .line 222
    .line 223
    invoke-direct {p1, v11, v9, p3}, Lv6/d0;-><init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;I)V

    .line 224
    .line 225
    .line 226
    invoke-interface {p0, p1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    :cond_d
    return-void
.end method

.method public static final m(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getPreviousBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const-string p0, "ANSWER_SHEET_KEY_BACK"

    .line 19
    .line 20
    const-string v1, "ANSWER_SHEET_KEY_BACK_RE_TAKE_PHOTO"

    .line 21
    .line 22
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0
.end method

.method public static final n(Lb7/w0;Lv6/k0;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 19

    .line 1
    move-object/from16 v7, p1

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    move-object/from16 v9, p3

    .line 6
    .line 7
    move-object/from16 v10, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    move/from16 v0, p7

    .line 12
    .line 13
    const-string v1, "$this$BoxWithLoadState"

    .line 14
    .line 15
    move-object/from16 v2, p5

    .line 16
    .line 17
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    and-int/lit8 v1, v0, 0x11

    .line 21
    .line 22
    const/16 v2, 0x10

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v11, 0x1

    .line 26
    if-eq v1, v2, :cond_0

    .line 27
    .line 28
    move v1, v11

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v1, v3

    .line 31
    :goto_0
    and-int/lit8 v2, v0, 0x1

    .line 32
    .line 33
    invoke-interface {v4, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_c

    .line 38
    .line 39
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v1, -0x1

    .line 46
    const-string v2, "com.zykj.evaluation.ui.sheet.ManualPointPage.<anonymous> (ManualPointPage.kt:63)"

    .line 47
    .line 48
    const v5, 0x34f993e3

    .line 49
    .line 50
    .line 51
    invoke-static {v5, v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 55
    .line 56
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 63
    .line 64
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v0, v1, v4, v3}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v4, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v4, v12}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 85
    .line 86
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 91
    .line 92
    .line 93
    move-result-object v13

    .line 94
    if-nez v13, :cond_2

    .line 95
    .line 96
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 100
    .line 101
    .line 102
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    if-eqz v13, :cond_3

    .line 107
    .line 108
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 113
    .line 114
    .line 115
    :goto_1
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 120
    .line 121
    .line 122
    move-result-object v13

    .line 123
    invoke-static {v6, v0, v13}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v6, v2, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_4

    .line 142
    .line 143
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    if-nez v2, :cond_5

    .line 156
    .line 157
    :cond_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {v6, v1, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v6, v3, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 176
    .line 177
    .line 178
    sget-object v13, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    const/4 v1, 0x0

    .line 182
    invoke-static {v12, v0, v11, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 183
    .line 184
    .line 185
    move-result-object v14

    .line 186
    const/16 v17, 0x2

    .line 187
    .line 188
    const/16 v18, 0x0

    .line 189
    .line 190
    const/high16 v15, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    move v3, v0

    .line 199
    move-object v0, v2

    .line 200
    invoke-virtual {v7}, Lv6/k0;->c()Landroid/graphics/Bitmap;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    move v5, v3

    .line 205
    invoke-virtual {v7}, Lv6/k0;->d()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    move v6, v5

    .line 210
    const/4 v5, 0x0

    .line 211
    move v13, v6

    .line 212
    const/4 v6, 0x0

    .line 213
    move v14, v13

    .line 214
    move-object v13, v1

    .line 215
    move-object/from16 v1, p0

    .line 216
    .line 217
    invoke-static/range {v0 .. v6}, Lb7/b1;->e(Landroidx/compose/ui/Modifier;Lb7/w0;Landroid/graphics/Bitmap;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    .line 218
    .line 219
    .line 220
    invoke-static {v12, v14, v11, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    const/16 v2, 0x1e

    .line 225
    .line 226
    int-to-float v2, v2

    .line 227
    const/16 v3, 0x258

    .line 228
    .line 229
    int-to-float v3, v3

    .line 230
    div-float/2addr v2, v3

    .line 231
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    iget v5, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 240
    .line 241
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 242
    .line 243
    invoke-static {v5, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    int-to-float v3, v3

    .line 248
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 257
    .line 258
    div-float/2addr v3, v5

    .line 259
    mul-float/2addr v2, v3

    .line 260
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    if-nez v2, :cond_6

    .line 277
    .line 278
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 279
    .line 280
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    if-ne v3, v2, :cond_7

    .line 285
    .line 286
    :cond_6
    new-instance v3, Lv6/e0;

    .line 287
    .line 288
    invoke-direct {v3, v8}, Lv6/e0;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 295
    .line 296
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    if-nez v2, :cond_8

    .line 305
    .line 306
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 307
    .line 308
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    if-ne v5, v2, :cond_9

    .line 313
    .line 314
    :cond_8
    new-instance v5, Lv6/f0;

    .line 315
    .line 316
    invoke-direct {v5, v9}, Lv6/f0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    :cond_9
    move-object v2, v5

    .line 323
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 324
    .line 325
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    or-int/2addr v5, v6

    .line 334
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    or-int/2addr v5, v6

    .line 339
    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    or-int/2addr v5, v6

    .line 344
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    if-nez v5, :cond_a

    .line 349
    .line 350
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 351
    .line 352
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    if-ne v6, v5, :cond_b

    .line 357
    .line 358
    :cond_a
    new-instance v6, Lv6/g0;

    .line 359
    .line 360
    invoke-direct {v6, v8, v7, v1, v10}, Lv6/g0;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/k0;Lb7/w0;Landroidx/navigation/NavController;)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 367
    .line 368
    const/4 v5, 0x6

    .line 369
    move-object v1, v3

    .line 370
    move-object v3, v6

    .line 371
    const/4 v6, 0x0

    .line 372
    invoke-static/range {v0 .. v6}, Lv6/j0;->j(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 373
    .line 374
    .line 375
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 376
    .line 377
    .line 378
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-eqz v0, :cond_d

    .line 383
    .line 384
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 385
    .line 386
    .line 387
    goto :goto_2

    .line 388
    :cond_c
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 389
    .line 390
    .line 391
    :cond_d
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 392
    .line 393
    return-object v0
.end method

.method public static final o(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/k0;Lb7/w0;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 2

    .line 1
    new-instance v0, Lb7/c1;

    .line 2
    .line 3
    invoke-virtual {p1}, Lv6/k0;->c()Landroid/graphics/Bitmap;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p2}, Lb7/w0;->c()Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ljava/util/List;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, v1, p1, p2}, Lb7/c1;-><init>(ZLandroid/graphics/Bitmap;Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lv6/h0;

    .line 22
    .line 23
    invoke-direct {p1, p3}, Lv6/h0;-><init>(Landroidx/navigation/NavController;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->G(Lb7/c1;Lkotlin/jvm/functions/Function0;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method

.method public static final p(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final q(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->O()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 5
    .line 6
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x7f120068

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getString(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/zykj/base/utils/XToastUtils;->info(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method

.method public static final r(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
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

.method public static final s(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    invoke-static {p0, p1, p3, p2}, Lv6/j0;->l(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final t(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/base/BaseViewModel;->c()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

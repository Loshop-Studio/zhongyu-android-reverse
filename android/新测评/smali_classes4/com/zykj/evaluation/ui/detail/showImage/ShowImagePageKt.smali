.class public abstract Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->h(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->m(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->p(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavController;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->j(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavController;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->i(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/navigation/NavController;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->k(Landroidx/navigation/NavController;)Z

    move-result p0

    return p0
.end method

.method public static final g(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    move/from16 v8, p4

    .line 8
    .line 9
    const-string v1, "examUrl"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "commentUrl"

    .line 15
    .line 16
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v1, "navController"

    .line 20
    .line 21
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const v1, 0x128e2df

    .line 25
    .line 26
    .line 27
    move-object/from16 v2, p3

    .line 28
    .line 29
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 30
    .line 31
    .line 32
    move-result-object v12

    .line 33
    and-int/lit8 v2, v8, 0x6

    .line 34
    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    const/4 v2, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v2, 0x2

    .line 46
    :goto_0
    or-int/2addr v2, v8

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v2, v8

    .line 49
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 50
    .line 51
    if-nez v3, :cond_3

    .line 52
    .line 53
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    const/16 v3, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v3, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr v2, v3

    .line 65
    :cond_3
    and-int/lit16 v3, v8, 0x180

    .line 66
    .line 67
    if-nez v3, :cond_5

    .line 68
    .line 69
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    const/16 v3, 0x100

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    const/16 v3, 0x80

    .line 79
    .line 80
    :goto_3
    or-int/2addr v2, v3

    .line 81
    :cond_5
    move v15, v2

    .line 82
    and-int/lit16 v2, v15, 0x93

    .line 83
    .line 84
    const/16 v3, 0x92

    .line 85
    .line 86
    const/4 v4, 0x1

    .line 87
    const/4 v5, 0x0

    .line 88
    if-eq v2, v3, :cond_6

    .line 89
    .line 90
    move v2, v4

    .line 91
    goto :goto_4

    .line 92
    :cond_6
    move v2, v5

    .line 93
    :goto_4
    and-int/lit8 v3, v15, 0x1

    .line 94
    .line 95
    invoke-interface {v12, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_1a

    .line 100
    .line 101
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-eqz v2, :cond_7

    .line 106
    .line 107
    const/4 v2, -0x1

    .line 108
    const-string v3, "com.zykj.evaluation.ui.detail.showImage.ShowImagePage (ShowImagePage.kt:65)"

    .line 109
    .line 110
    invoke-static {v1, v15, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_7
    invoke-static {v5, v12, v5, v4}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 114
    .line 115
    .line 116
    move-result-object v17

    .line 117
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    if-nez v1, :cond_8

    .line 126
    .line 127
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 128
    .line 129
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-ne v2, v1, :cond_9

    .line 134
    .line 135
    :cond_8
    new-instance v2, Lb6/a;

    .line 136
    .line 137
    invoke-direct {v2, v7}, Lb6/a;-><init>(Landroidx/navigation/NavController;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 144
    .line 145
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-nez v1, :cond_a

    .line 154
    .line 155
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 156
    .line 157
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-ne v3, v1, :cond_b

    .line 162
    .line 163
    :cond_a
    new-instance v3, Lb6/b;

    .line 164
    .line 165
    invoke-direct {v3, v2}, Lb6/b;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 172
    .line 173
    const/4 v1, 0x6

    .line 174
    invoke-static {v4, v3, v12, v1, v5}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 175
    .line 176
    .line 177
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 178
    .line 179
    const/4 v3, 0x0

    .line 180
    const/4 v9, 0x0

    .line 181
    invoke-static {v1, v3, v4, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 182
    .line 183
    .line 184
    move-result-object v10

    .line 185
    invoke-static {v10}, Landroidx/compose/foundation/layout/WindowInsetsPadding_androidKt;->statusBarsPadding(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 186
    .line 187
    .line 188
    move-result-object v10

    .line 189
    sget-object v23, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 190
    .line 191
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    sget-object v24, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 196
    .line 197
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 198
    .line 199
    .line 200
    move-result-object v13

    .line 201
    invoke-static {v11, v13, v12, v5}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    invoke-static {v12, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    invoke-static {v12, v10}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    sget-object v25, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 218
    .line 219
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 224
    .line 225
    .line 226
    move-result-object v16

    .line 227
    if-nez v16, :cond_c

    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 230
    .line 231
    .line 232
    :cond_c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 236
    .line 237
    .line 238
    move-result v16

    .line 239
    if-eqz v16, :cond_d

    .line 240
    .line 241
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 246
    .line 247
    .line 248
    :goto_5
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-static {v9, v11, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-static {v9, v14, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    if-nez v11, :cond_e

    .line 275
    .line 276
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v14

    .line 284
    invoke-static {v11, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    if-nez v11, :cond_f

    .line 289
    .line 290
    :cond_e
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    invoke-interface {v9, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    invoke-interface {v9, v11, v5}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 302
    .line 303
    .line 304
    :cond_f
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    invoke-static {v9, v10, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 309
    .line 310
    .line 311
    sget-object v5, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 312
    .line 313
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v9

    .line 321
    if-nez v5, :cond_10

    .line 322
    .line 323
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 324
    .line 325
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    if-ne v9, v5, :cond_11

    .line 330
    .line 331
    :cond_10
    new-instance v9, Lb6/c;

    .line 332
    .line 333
    invoke-direct {v9, v2}, Lb6/c;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_11
    move-object v11, v9

    .line 340
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 341
    .line 342
    const/4 v13, 0x0

    .line 343
    const/4 v14, 0x3

    .line 344
    const/4 v9, 0x0

    .line 345
    const/4 v10, 0x0

    .line 346
    const/4 v2, 0x0

    .line 347
    invoke-static/range {v9 .. v14}, Le7/s0;->c(Ljava/lang/String;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 348
    .line 349
    .line 350
    invoke-static {v1, v3, v4, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    const/4 v9, 0x3

    .line 355
    const/4 v10, 0x0

    .line 356
    invoke-static {v5, v2, v10, v9, v2}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    invoke-static {v5}, Landroidx/compose/foundation/layout/WindowInsetsPadding_androidKt;->statusBarsPadding(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 361
    .line 362
    .line 363
    move-result-object v16

    .line 364
    const/16 v21, 0xe

    .line 365
    .line 366
    const/16 v22, 0x0

    .line 367
    .line 368
    const/16 v18, 0x0

    .line 369
    .line 370
    const/16 v19, 0x0

    .line 371
    .line 372
    const/16 v20, 0x0

    .line 373
    .line 374
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 379
    .line 380
    .line 381
    move-result-object v11

    .line 382
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 383
    .line 384
    .line 385
    move-result-object v13

    .line 386
    invoke-static {v11, v13, v12, v10}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 387
    .line 388
    .line 389
    move-result-object v11

    .line 390
    invoke-static {v12, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 391
    .line 392
    .line 393
    move-result v13

    .line 394
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 395
    .line 396
    .line 397
    move-result-object v10

    .line 398
    invoke-static {v12, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 403
    .line 404
    .line 405
    move-result-object v14

    .line 406
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 407
    .line 408
    .line 409
    move-result-object v16

    .line 410
    if-nez v16, :cond_12

    .line 411
    .line 412
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 413
    .line 414
    .line 415
    :cond_12
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 416
    .line 417
    .line 418
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 419
    .line 420
    .line 421
    move-result v16

    .line 422
    if-eqz v16, :cond_13

    .line 423
    .line 424
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 425
    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_13
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 429
    .line 430
    .line 431
    :goto_6
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 432
    .line 433
    .line 434
    move-result-object v14

    .line 435
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 436
    .line 437
    .line 438
    move-result-object v9

    .line 439
    invoke-static {v14, v11, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 443
    .line 444
    .line 445
    move-result-object v9

    .line 446
    invoke-static {v14, v10, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 450
    .line 451
    .line 452
    move-result-object v9

    .line 453
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 454
    .line 455
    .line 456
    move-result v10

    .line 457
    if-nez v10, :cond_14

    .line 458
    .line 459
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v10

    .line 463
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v11

    .line 467
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v10

    .line 471
    if-nez v10, :cond_15

    .line 472
    .line 473
    :cond_14
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v10

    .line 477
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object v10

    .line 484
    invoke-interface {v14, v10, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 485
    .line 486
    .line 487
    :cond_15
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 488
    .line 489
    .line 490
    move-result-object v9

    .line 491
    invoke-static {v14, v5, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v1, v3, v4, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 499
    .line 500
    .line 501
    move-result-object v9

    .line 502
    const/4 v10, 0x0

    .line 503
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 504
    .line 505
    .line 506
    move-result-object v9

    .line 507
    invoke-static {v12, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 508
    .line 509
    .line 510
    move-result v11

    .line 511
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 512
    .line 513
    .line 514
    move-result-object v13

    .line 515
    invoke-static {v12, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 520
    .line 521
    .line 522
    move-result-object v14

    .line 523
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 524
    .line 525
    .line 526
    move-result-object v16

    .line 527
    if-nez v16, :cond_16

    .line 528
    .line 529
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 530
    .line 531
    .line 532
    :cond_16
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 533
    .line 534
    .line 535
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 536
    .line 537
    .line 538
    move-result v16

    .line 539
    if-eqz v16, :cond_17

    .line 540
    .line 541
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 542
    .line 543
    .line 544
    goto :goto_7

    .line 545
    :cond_17
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 546
    .line 547
    .line 548
    :goto_7
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 549
    .line 550
    .line 551
    move-result-object v14

    .line 552
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 553
    .line 554
    .line 555
    move-result-object v10

    .line 556
    invoke-static {v14, v9, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 560
    .line 561
    .line 562
    move-result-object v9

    .line 563
    invoke-static {v14, v13, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 567
    .line 568
    .line 569
    move-result-object v9

    .line 570
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 571
    .line 572
    .line 573
    move-result v10

    .line 574
    if-nez v10, :cond_18

    .line 575
    .line 576
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v10

    .line 580
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 581
    .line 582
    .line 583
    move-result-object v13

    .line 584
    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v10

    .line 588
    if-nez v10, :cond_19

    .line 589
    .line 590
    :cond_18
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 591
    .line 592
    .line 593
    move-result-object v10

    .line 594
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 598
    .line 599
    .line 600
    move-result-object v10

    .line 601
    invoke-interface {v14, v10, v9}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 602
    .line 603
    .line 604
    :cond_19
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 605
    .line 606
    .line 607
    move-result-object v9

    .line 608
    invoke-static {v14, v5, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 609
    .line 610
    .line 611
    sget-object v5, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 612
    .line 613
    invoke-static {v1, v3, v4, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 614
    .line 615
    .line 616
    move-result-object v11

    .line 617
    move v5, v4

    .line 618
    const/4 v4, 0x4

    .line 619
    move v9, v5

    .line 620
    const/4 v5, 0x0

    .line 621
    move-object v10, v1

    .line 622
    const-string v1, "\\"

    .line 623
    .line 624
    move-object v13, v2

    .line 625
    const-string v2, "/"

    .line 626
    .line 627
    move v14, v3

    .line 628
    const/4 v3, 0x0

    .line 629
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    sget-object v2, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 634
    .line 635
    invoke-virtual {v2}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFillWidth()Landroidx/compose/ui/layout/ContentScale;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    invoke-virtual/range {v24 .. v24}, Landroidx/compose/ui/Alignment$Companion;->getTopCenter()Landroidx/compose/ui/Alignment;

    .line 640
    .line 641
    .line 642
    move-result-object v3

    .line 643
    const/16 v22, 0x0

    .line 644
    .line 645
    const/16 v23, 0x798

    .line 646
    .line 647
    move-object v4, v10

    .line 648
    const/4 v10, 0x0

    .line 649
    move-object/from16 v20, v12

    .line 650
    .line 651
    const/4 v12, 0x0

    .line 652
    move-object v5, v13

    .line 653
    const/4 v13, 0x0

    .line 654
    const/16 v16, 0x0

    .line 655
    .line 656
    const/16 v17, 0x0

    .line 657
    .line 658
    const/16 v18, 0x0

    .line 659
    .line 660
    const/16 v19, 0x0

    .line 661
    .line 662
    const v21, 0x1b01b0

    .line 663
    .line 664
    .line 665
    move/from16 p3, v9

    .line 666
    .line 667
    move-object v9, v1

    .line 668
    move/from16 v1, p3

    .line 669
    .line 670
    move/from16 p3, v15

    .line 671
    .line 672
    move-object v15, v2

    .line 673
    move/from16 v2, p3

    .line 674
    .line 675
    move/from16 p3, v14

    .line 676
    .line 677
    move-object v14, v3

    .line 678
    move/from16 v3, p3

    .line 679
    .line 680
    const/16 p3, 0x3

    .line 681
    .line 682
    invoke-static/range {v9 .. v23}, Lcoil3/compose/c;->a(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;III)V

    .line 683
    .line 684
    .line 685
    move-object/from16 v12, v20

    .line 686
    .line 687
    invoke-static {v4, v3, v1, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    shr-int/lit8 v2, v2, 0x3

    .line 692
    .line 693
    and-int/lit8 v2, v2, 0xe

    .line 694
    .line 695
    or-int/lit8 v2, v2, 0x30

    .line 696
    .line 697
    const/4 v10, 0x0

    .line 698
    invoke-static {v6, v1, v12, v2, v10}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->l(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 699
    .line 700
    .line 701
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 702
    .line 703
    .line 704
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 705
    .line 706
    .line 707
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 708
    .line 709
    .line 710
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 711
    .line 712
    .line 713
    move-result v1

    .line 714
    if-eqz v1, :cond_1b

    .line 715
    .line 716
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 717
    .line 718
    .line 719
    goto :goto_8

    .line 720
    :cond_1a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 721
    .line 722
    .line 723
    :cond_1b
    :goto_8
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    if-eqz v1, :cond_1c

    .line 728
    .line 729
    new-instance v2, Lb6/d;

    .line 730
    .line 731
    invoke-direct {v2, v0, v6, v7, v8}, Lb6/d;-><init>(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavController;I)V

    .line 732
    .line 733
    .line 734
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 735
    .line 736
    .line 737
    :cond_1c
    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
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

.method public static final j(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavController;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->g(Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Landroidx/navigation/NavController;)Z
    .locals 3

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
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v1, "NEED_NOT_REFRESH"

    .line 14
    .line 15
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public static final l(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v6, p3

    .line 4
    .line 5
    move/from16 v7, p4

    .line 6
    .line 7
    const v1, 0x4014450b

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p2

    .line 11
    .line 12
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v8

    .line 16
    and-int/lit8 v2, v6, 0x6

    .line 17
    .line 18
    const/4 v9, 0x2

    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v9

    .line 30
    :goto_0
    or-int/2addr v2, v6

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v2, v6

    .line 33
    :goto_1
    and-int/lit8 v3, v7, 0x2

    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    or-int/lit8 v2, v2, 0x30

    .line 38
    .line 39
    :cond_2
    move-object/from16 v4, p1

    .line 40
    .line 41
    :goto_2
    move v10, v2

    .line 42
    goto :goto_4

    .line 43
    :cond_3
    and-int/lit8 v4, v6, 0x30

    .line 44
    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    move-object/from16 v4, p1

    .line 48
    .line 49
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-eqz v5, :cond_4

    .line 54
    .line 55
    const/16 v5, 0x20

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_4
    const/16 v5, 0x10

    .line 59
    .line 60
    :goto_3
    or-int/2addr v2, v5

    .line 61
    goto :goto_2

    .line 62
    :goto_4
    and-int/lit8 v2, v10, 0x13

    .line 63
    .line 64
    const/16 v5, 0x12

    .line 65
    .line 66
    const/4 v11, 0x0

    .line 67
    if-eq v2, v5, :cond_5

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    goto :goto_5

    .line 71
    :cond_5
    move v2, v11

    .line 72
    :goto_5
    and-int/lit8 v5, v10, 0x1

    .line 73
    .line 74
    invoke-interface {v8, v2, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_10

    .line 79
    .line 80
    if-eqz v3, :cond_6

    .line 81
    .line 82
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 83
    .line 84
    move-object v12, v2

    .line 85
    goto :goto_6

    .line 86
    :cond_6
    move-object v12, v4

    .line 87
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_7

    .line 92
    .line 93
    const/4 v2, -0x1

    .line 94
    const-string v3, "com.zykj.evaluation.ui.detail.showImage.TransparentCommentImage (ShowImagePage.kt:35)"

    .line 95
    .line 96
    invoke-static {v1, v10, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_7
    const/4 v4, 0x4

    .line 100
    const/4 v5, 0x0

    .line 101
    const-string v1, "\\"

    .line 102
    .line 103
    const-string v2, "/"

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_9

    .line 115
    .line 116
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_8

    .line 121
    .line 122
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 123
    .line 124
    .line 125
    :cond_8
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-eqz v1, :cond_11

    .line 130
    .line 131
    new-instance v2, Lb6/e;

    .line 132
    .line 133
    invoke-direct {v2, v0, v12, v6, v7}, Lb6/e;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    .line 134
    .line 135
    .line 136
    :goto_7
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_9
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    const/4 v4, 0x0

    .line 149
    if-nez v2, :cond_a

    .line 150
    .line 151
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 152
    .line 153
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-ne v3, v2, :cond_b

    .line 158
    .line 159
    :cond_a
    invoke-static {v4, v4, v9, v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_b
    check-cast v3, Landroidx/compose/runtime/MutableState;

    .line 167
    .line 168
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    or-int/2addr v2, v5

    .line 177
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    if-nez v2, :cond_c

    .line 182
    .line 183
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 184
    .line 185
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    if-ne v5, v2, :cond_d

    .line 190
    .line 191
    :cond_c
    new-instance v5, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;

    .line 192
    .line 193
    invoke-direct {v5, v1, v3, v4}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;-><init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_d
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 200
    .line 201
    invoke-static {v1, v5, v8, v11}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 202
    .line 203
    .line 204
    invoke-static {v3}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->n(Landroidx/compose/runtime/MutableState;)Landroid/graphics/Bitmap;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-nez v1, :cond_e

    .line 209
    .line 210
    const v1, -0x927ae9e

    .line 211
    .line 212
    .line 213
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 217
    .line 218
    .line 219
    move-object/from16 v16, v8

    .line 220
    .line 221
    move-object v10, v12

    .line 222
    goto :goto_8

    .line 223
    :cond_e
    const v2, -0x927ae9d

    .line 224
    .line 225
    .line 226
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 227
    .line 228
    .line 229
    invoke-static {v1}, Landroidx/compose/ui/graphics/AndroidImageBitmap_androidKt;->asImageBitmap(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/ImageBitmap;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    sget-object v2, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 234
    .line 235
    invoke-virtual {v2}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFillWidth()Landroidx/compose/ui/layout/ContentScale;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 240
    .line 241
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopCenter()Landroidx/compose/ui/Alignment;

    .line 242
    .line 243
    .line 244
    move-result-object v11

    .line 245
    shl-int/lit8 v3, v10, 0x3

    .line 246
    .line 247
    and-int/lit16 v3, v3, 0x380

    .line 248
    .line 249
    or-int/lit16 v3, v3, 0x6c30

    .line 250
    .line 251
    const/16 v18, 0xe0

    .line 252
    .line 253
    const/4 v9, 0x0

    .line 254
    const/4 v13, 0x0

    .line 255
    const/4 v14, 0x0

    .line 256
    const/4 v15, 0x0

    .line 257
    move/from16 v17, v3

    .line 258
    .line 259
    move-object/from16 v16, v8

    .line 260
    .line 261
    move-object v10, v12

    .line 262
    move-object v8, v1

    .line 263
    move-object v12, v2

    .line 264
    invoke-static/range {v8 .. v18}, Landroidx/compose/foundation/ImageKt;->Image-5h-nEew(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V

    .line 265
    .line 266
    .line 267
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 268
    .line 269
    .line 270
    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-eqz v1, :cond_f

    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 277
    .line 278
    .line 279
    :cond_f
    move-object v4, v10

    .line 280
    goto :goto_9

    .line 281
    :cond_10
    move-object/from16 v16, v8

    .line 282
    .line 283
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 284
    .line 285
    .line 286
    :goto_9
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    if-eqz v1, :cond_11

    .line 291
    .line 292
    new-instance v2, Lb6/f;

    .line 293
    .line 294
    invoke-direct {v2, v0, v4, v6, v7}, Lb6/f;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_7

    .line 298
    .line 299
    :cond_11
    return-void
.end method

.method public static final m(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->l(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final n(Landroidx/compose/runtime/MutableState;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/graphics/Bitmap;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final o(Landroidx/compose/runtime/MutableState;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final p(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->l(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic q(Landroidx/compose/runtime/MutableState;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->o(Landroidx/compose/runtime/MutableState;Landroid/graphics/Bitmap;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

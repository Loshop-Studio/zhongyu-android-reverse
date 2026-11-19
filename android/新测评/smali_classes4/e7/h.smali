.class public abstract Le7/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Le7/h;->e(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Le7/h;->f(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Le7/h;->h(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    .line 1
    move/from16 v1, p0

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
    const-string v0, "onLoadingDismiss"

    .line 10
    .line 11
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "content"

    .line 15
    .line 16
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, -0x7adc21ca

    .line 20
    .line 21
    .line 22
    move-object/from16 v2, p4

    .line 23
    .line 24
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    and-int/lit8 v2, v5, 0x6

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v2, 0x2

    .line 41
    :goto_0
    or-int/2addr v2, v5

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v2, v5

    .line 44
    :goto_1
    and-int/lit8 v6, p6, 0x2

    .line 45
    .line 46
    if-eqz v6, :cond_3

    .line 47
    .line 48
    or-int/lit8 v2, v2, 0x30

    .line 49
    .line 50
    :cond_2
    move-object/from16 v7, p1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    and-int/lit8 v7, v5, 0x30

    .line 54
    .line 55
    if-nez v7, :cond_2

    .line 56
    .line 57
    move-object/from16 v7, p1

    .line 58
    .line 59
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_4

    .line 64
    .line 65
    const/16 v8, 0x20

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    const/16 v8, 0x10

    .line 69
    .line 70
    :goto_2
    or-int/2addr v2, v8

    .line 71
    :goto_3
    and-int/lit16 v8, v5, 0x180

    .line 72
    .line 73
    const/16 v10, 0x100

    .line 74
    .line 75
    if-nez v8, :cond_6

    .line 76
    .line 77
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_5

    .line 82
    .line 83
    move v8, v10

    .line 84
    goto :goto_4

    .line 85
    :cond_5
    const/16 v8, 0x80

    .line 86
    .line 87
    :goto_4
    or-int/2addr v2, v8

    .line 88
    :cond_6
    and-int/lit16 v8, v5, 0xc00

    .line 89
    .line 90
    if-nez v8, :cond_8

    .line 91
    .line 92
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    if-eqz v8, :cond_7

    .line 97
    .line 98
    const/16 v8, 0x800

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_7
    const/16 v8, 0x400

    .line 102
    .line 103
    :goto_5
    or-int/2addr v2, v8

    .line 104
    :cond_8
    and-int/lit16 v8, v2, 0x493

    .line 105
    .line 106
    const/16 v11, 0x492

    .line 107
    .line 108
    const/4 v13, 0x0

    .line 109
    if-eq v8, v11, :cond_9

    .line 110
    .line 111
    const/4 v8, 0x1

    .line 112
    goto :goto_6

    .line 113
    :cond_9
    move v8, v13

    .line 114
    :goto_6
    and-int/lit8 v11, v2, 0x1

    .line 115
    .line 116
    invoke-interface {v9, v8, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-eqz v8, :cond_15

    .line 121
    .line 122
    if-eqz v6, :cond_a

    .line 123
    .line 124
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 125
    .line 126
    move-object v14, v6

    .line 127
    goto :goto_7

    .line 128
    :cond_a
    move-object v14, v7

    .line 129
    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_b

    .line 134
    .line 135
    const/4 v6, -0x1

    .line 136
    const-string v7, "com.zykj.evaluation.ui.widget.BoxWithLoadState (BoxWithLoadState.kt:23)"

    .line 137
    .line 138
    invoke-static {v0, v2, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 139
    .line 140
    .line 141
    :cond_b
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 142
    .line 143
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-static {v9, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    invoke-static {v9, v14}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 164
    .line 165
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 170
    .line 171
    .line 172
    move-result-object v16

    .line 173
    if-nez v16, :cond_c

    .line 174
    .line 175
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 176
    .line 177
    .line 178
    :cond_c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 179
    .line 180
    .line 181
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 182
    .line 183
    .line 184
    move-result v16

    .line 185
    if-eqz v16, :cond_d

    .line 186
    .line 187
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 188
    .line 189
    .line 190
    goto :goto_8

    .line 191
    :cond_d
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 192
    .line 193
    .line 194
    :goto_8
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 195
    .line 196
    .line 197
    move-result-object v15

    .line 198
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    invoke-static {v15, v0, v12}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v15, v7, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-nez v7, :cond_e

    .line 221
    .line 222
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    if-nez v7, :cond_f

    .line 235
    .line 236
    :cond_e
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-interface {v15, v6, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 248
    .line 249
    .line 250
    :cond_f
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v15, v8, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 258
    .line 259
    shr-int/lit8 v6, v2, 0x6

    .line 260
    .line 261
    and-int/lit8 v6, v6, 0x70

    .line 262
    .line 263
    const/4 v7, 0x6

    .line 264
    or-int/2addr v6, v7

    .line 265
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    invoke-interface {v4, v0, v9, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    if-eqz v1, :cond_13

    .line 273
    .line 274
    const v0, -0x2fa94f20

    .line 275
    .line 276
    .line 277
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 278
    .line 279
    .line 280
    and-int/lit16 v0, v2, 0x380

    .line 281
    .line 282
    if-ne v0, v10, :cond_10

    .line 283
    .line 284
    const/4 v12, 0x1

    .line 285
    goto :goto_9

    .line 286
    :cond_10
    move v12, v13

    .line 287
    :goto_9
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-nez v12, :cond_11

    .line 292
    .line 293
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 294
    .line 295
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    if-ne v0, v2, :cond_12

    .line 300
    .line 301
    :cond_11
    new-instance v0, Le7/f;

    .line 302
    .line 303
    invoke-direct {v0, v3}, Le7/f;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 304
    .line 305
    .line 306
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    :cond_12
    move-object v6, v0

    .line 310
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 311
    .line 312
    new-instance v15, Landroidx/compose/ui/window/DialogProperties;

    .line 313
    .line 314
    const/16 v21, 0xf

    .line 315
    .line 316
    const/16 v22, 0x0

    .line 317
    .line 318
    const/16 v16, 0x0

    .line 319
    .line 320
    const/16 v17, 0x0

    .line 321
    .line 322
    const/16 v18, 0x0

    .line 323
    .line 324
    const/16 v19, 0x0

    .line 325
    .line 326
    const/16 v20, 0x0

    .line 327
    .line 328
    invoke-direct/range {v15 .. v22}, Landroidx/compose/ui/window/DialogProperties;-><init>(ZZLandroidx/compose/ui/window/SecureFlagPolicy;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Le7/p;->a:Le7/p;

    .line 332
    .line 333
    invoke-virtual {v0}, Le7/p;->c()Lkotlin/jvm/functions/Function2;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    const/16 v10, 0x1b0

    .line 338
    .line 339
    const/4 v11, 0x0

    .line 340
    move-object v7, v15

    .line 341
    invoke-static/range {v6 .. v11}, Landroidx/compose/ui/window/AndroidDialog_androidKt;->Dialog(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 342
    .line 343
    .line 344
    :goto_a
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 345
    .line 346
    .line 347
    goto :goto_b

    .line 348
    :cond_13
    const v0, -0x2fb7639a

    .line 349
    .line 350
    .line 351
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 352
    .line 353
    .line 354
    goto :goto_a

    .line 355
    :goto_b
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 356
    .line 357
    .line 358
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_14

    .line 363
    .line 364
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 365
    .line 366
    .line 367
    :cond_14
    move-object v2, v14

    .line 368
    goto :goto_c

    .line 369
    :cond_15
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 370
    .line 371
    .line 372
    move-object v2, v7

    .line 373
    :goto_c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    if-eqz v7, :cond_16

    .line 378
    .line 379
    new-instance v0, Le7/g;

    .line 380
    .line 381
    move/from16 v6, p6

    .line 382
    .line 383
    invoke-direct/range {v0 .. v6}, Le7/g;-><init>(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;II)V

    .line 384
    .line 385
    .line 386
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 387
    .line 388
    .line 389
    :cond_16
    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
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

.method public static final f(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    move v0, p0

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
    invoke-static/range {v0 .. v6}, Le7/h;->d(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    const v2, 0x5a54bc5b

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
    move-result-object v13

    .line 14
    and-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    or-int/lit8 v5, v0, 0x6

    .line 20
    .line 21
    move v6, v5

    .line 22
    move-object/from16 v5, p0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    and-int/lit8 v5, v0, 0x6

    .line 26
    .line 27
    if-nez v5, :cond_2

    .line 28
    .line 29
    move-object/from16 v5, p0

    .line 30
    .line 31
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v6, v4

    .line 40
    :goto_0
    or-int/2addr v6, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object/from16 v5, p0

    .line 43
    .line 44
    move v6, v0

    .line 45
    :goto_1
    and-int/lit8 v7, v6, 0x3

    .line 46
    .line 47
    if-eq v7, v4, :cond_3

    .line 48
    .line 49
    const/4 v7, 0x1

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    const/4 v7, 0x0

    .line 52
    :goto_2
    and-int/lit8 v8, v6, 0x1

    .line 53
    .line 54
    invoke-interface {v13, v7, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_6

    .line 59
    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move-object v3, v5

    .line 66
    :goto_3
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_5

    .line 71
    .line 72
    const/4 v5, -0x1

    .line 73
    const-string v7, "com.zykj.evaluation.ui.widget.LoadingView (BoxWithLoadState.kt:48)"

    .line 74
    .line 75
    invoke-static {v2, v6, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    invoke-static {}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->getCircleShape()Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 83
    .line 84
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    int-to-float v4, v4

    .line 89
    const/16 v7, 0x258

    .line 90
    .line 91
    int-to-float v7, v7

    .line 92
    div-float/2addr v4, v7

    .line 93
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 102
    .line 103
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 104
    .line 105
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    int-to-float v8, v8

    .line 110
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 119
    .line 120
    div-float/2addr v8, v9

    .line 121
    mul-float/2addr v4, v8

    .line 122
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    const/16 v4, 0x28

    .line 127
    .line 128
    int-to-float v4, v4

    .line 129
    div-float/2addr v4, v7

    .line 130
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 139
    .line 140
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 141
    .line 142
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    int-to-float v8, v8

    .line 147
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 156
    .line 157
    div-float/2addr v8, v9

    .line 158
    mul-float/2addr v4, v8

    .line 159
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    const/4 v8, 0x5

    .line 168
    int-to-float v8, v8

    .line 169
    div-float/2addr v8, v7

    .line 170
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    iget v9, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 179
    .line 180
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 181
    .line 182
    invoke-static {v9, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    int-to-float v7, v7

    .line 187
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 196
    .line 197
    div-float/2addr v7, v9

    .line 198
    mul-float/2addr v8, v7

    .line 199
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    sget-object v7, Le7/p;->a:Le7/p;

    .line 208
    .line 209
    invoke-virtual {v7}, Le7/p;->d()Lkotlin/jvm/functions/Function2;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    const v14, 0xc30180

    .line 214
    .line 215
    .line 216
    const/16 v15, 0x58

    .line 217
    .line 218
    const-wide/16 v7, 0x0

    .line 219
    .line 220
    const/4 v9, 0x0

    .line 221
    const/4 v11, 0x0

    .line 222
    move-object/from16 v16, v4

    .line 223
    .line 224
    move-object v4, v2

    .line 225
    move-object v2, v3

    .line 226
    move-object/from16 v3, v16

    .line 227
    .line 228
    invoke-static/range {v3 .. v15}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 229
    .line 230
    .line 231
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eqz v3, :cond_7

    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_6
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 242
    .line 243
    .line 244
    move-object v2, v5

    .line 245
    :cond_7
    :goto_4
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    if-eqz v3, :cond_8

    .line 250
    .line 251
    new-instance v4, Le7/e;

    .line 252
    .line 253
    invoke-direct {v4, v2, v0, v1}, Le7/e;-><init>(Landroidx/compose/ui/Modifier;II)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 257
    .line 258
    .line 259
    :cond_8
    return-void
.end method

.method public static final h(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p3, p1, p2}, Le7/h;->g(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

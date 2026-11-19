.class public abstract Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;->g(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;->i(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;->h(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;->k(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;JJ)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;->j(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;JJ)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v9, p5

    .line 4
    .line 5
    const-string v1, "navController"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v1, 0x1154dea1

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p4

    .line 14
    .line 15
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v15

    .line 19
    and-int/lit8 v2, v9, 0x6

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x2

    .line 32
    :goto_0
    or-int/2addr v2, v9

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v9

    .line 35
    :goto_1
    and-int/lit8 v3, p6, 0x2

    .line 36
    .line 37
    const/16 v4, 0x20

    .line 38
    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    or-int/lit8 v2, v2, 0x30

    .line 42
    .line 43
    :cond_2
    move-wide/from16 v5, p1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    and-int/lit8 v5, v9, 0x30

    .line 47
    .line 48
    if-nez v5, :cond_2

    .line 49
    .line 50
    move-wide/from16 v5, p1

    .line 51
    .line 52
    invoke-interface {v15, v5, v6}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_4

    .line 57
    .line 58
    move v7, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_4
    const/16 v7, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr v2, v7

    .line 63
    :goto_3
    and-int/lit16 v7, v9, 0x180

    .line 64
    .line 65
    if-nez v7, :cond_7

    .line 66
    .line 67
    and-int/lit8 v7, p6, 0x4

    .line 68
    .line 69
    if-nez v7, :cond_5

    .line 70
    .line 71
    move-object/from16 v7, p3

    .line 72
    .line 73
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_6

    .line 78
    .line 79
    const/16 v8, 0x100

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    move-object/from16 v7, p3

    .line 83
    .line 84
    :cond_6
    const/16 v8, 0x80

    .line 85
    .line 86
    :goto_4
    or-int/2addr v2, v8

    .line 87
    goto :goto_5

    .line 88
    :cond_7
    move-object/from16 v7, p3

    .line 89
    .line 90
    :goto_5
    and-int/lit16 v8, v2, 0x93

    .line 91
    .line 92
    const/16 v10, 0x92

    .line 93
    .line 94
    const/4 v11, 0x0

    .line 95
    const/16 v18, 0x1

    .line 96
    .line 97
    if-eq v8, v10, :cond_8

    .line 98
    .line 99
    move/from16 v8, v18

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_8
    move v8, v11

    .line 103
    :goto_6
    and-int/lit8 v10, v2, 0x1

    .line 104
    .line 105
    invoke-interface {v15, v8, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz v8, :cond_18

    .line 110
    .line 111
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 112
    .line 113
    .line 114
    and-int/lit8 v8, v9, 0x1

    .line 115
    .line 116
    if-eqz v8, :cond_b

    .line 117
    .line 118
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_9

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_9
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 126
    .line 127
    .line 128
    and-int/lit8 v3, p6, 0x4

    .line 129
    .line 130
    if-eqz v3, :cond_a

    .line 131
    .line 132
    and-int/lit16 v2, v2, -0x381

    .line 133
    .line 134
    :cond_a
    move-object v3, v7

    .line 135
    move v7, v11

    .line 136
    goto :goto_a

    .line 137
    :cond_b
    :goto_7
    if-eqz v3, :cond_c

    .line 138
    .line 139
    const-wide/32 v5, 0x1614ea

    .line 140
    .line 141
    .line 142
    :cond_c
    and-int/lit8 v3, p6, 0x4

    .line 143
    .line 144
    if-eqz v3, :cond_a

    .line 145
    .line 146
    const v3, 0x70b323c8

    .line 147
    .line 148
    .line 149
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 150
    .line 151
    .line 152
    sget-object v3, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 153
    .line 154
    sget v7, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 155
    .line 156
    invoke-virtual {v3, v15, v7}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-eqz v3, :cond_e

    .line 161
    .line 162
    invoke-static {v3, v15, v11}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    const v7, 0x671a9c9b

    .line 167
    .line 168
    .line 169
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 170
    .line 171
    .line 172
    instance-of v7, v3, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 173
    .line 174
    if-eqz v7, :cond_d

    .line 175
    .line 176
    move-object v7, v3

    .line 177
    check-cast v7, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 178
    .line 179
    invoke-interface {v7}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    :goto_8
    move-object v14, v7

    .line 184
    goto :goto_9

    .line 185
    :cond_d
    sget-object v7, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 186
    .line 187
    goto :goto_8

    .line 188
    :goto_9
    const v16, 0x9048

    .line 189
    .line 190
    .line 191
    const/16 v17, 0x0

    .line 192
    .line 193
    const-class v10, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    .line 194
    .line 195
    const/4 v12, 0x0

    .line 196
    move/from16 v19, v11

    .line 197
    .line 198
    move-object v11, v3

    .line 199
    move/from16 v3, v19

    .line 200
    .line 201
    invoke-static/range {v10 .. v17}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 206
    .line 207
    .line 208
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 209
    .line 210
    .line 211
    check-cast v7, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    .line 212
    .line 213
    and-int/lit16 v2, v2, -0x381

    .line 214
    .line 215
    move-object/from16 v19, v7

    .line 216
    .line 217
    move v7, v3

    .line 218
    move-object/from16 v3, v19

    .line 219
    .line 220
    goto :goto_a

    .line 221
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 222
    .line 223
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 224
    .line 225
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v0

    .line 229
    :goto_a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 230
    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 233
    .line 234
    .line 235
    move-result v8

    .line 236
    if-eqz v8, :cond_f

    .line 237
    .line 238
    const/4 v8, -0x1

    .line 239
    const-string v10, "com.zykj.evaluation.ui.guide.normal.toCorrectSelf.ToCorrectSelfGuidePage (ToCorrectSelfGuidePage.kt:22)"

    .line 240
    .line 241
    invoke-static {v1, v2, v8, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_f
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 245
    .line 246
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    or-int/2addr v8, v10

    .line 255
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    if-nez v8, :cond_10

    .line 260
    .line 261
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 262
    .line 263
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    if-ne v10, v8, :cond_11

    .line 268
    .line 269
    :cond_10
    new-instance v10, Lp6/a;

    .line 270
    .line 271
    invoke-direct {v10, v0, v3}, Lp6/a;-><init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :cond_11
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 278
    .line 279
    const/4 v8, 0x6

    .line 280
    invoke-static {v1, v10, v15, v8}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 281
    .line 282
    .line 283
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v8

    .line 291
    or-int/2addr v1, v8

    .line 292
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    if-nez v1, :cond_12

    .line 297
    .line 298
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 299
    .line 300
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    if-ne v8, v1, :cond_13

    .line 305
    .line 306
    :cond_12
    new-instance v8, Lp6/b;

    .line 307
    .line 308
    invoke-direct {v8, v3, v0}, Lp6/b;-><init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;)V

    .line 309
    .line 310
    .line 311
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_13
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 315
    .line 316
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    or-int/2addr v1, v10

    .line 325
    and-int/lit8 v10, v2, 0x70

    .line 326
    .line 327
    if-ne v10, v4, :cond_14

    .line 328
    .line 329
    move/from16 v11, v18

    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_14
    move v11, v7

    .line 333
    :goto_b
    or-int/2addr v1, v11

    .line 334
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    if-nez v1, :cond_15

    .line 339
    .line 340
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 341
    .line 342
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    if-ne v4, v1, :cond_16

    .line 347
    .line 348
    :cond_15
    new-instance v4, Lp6/c;

    .line 349
    .line 350
    invoke-direct {v4, v3, v0, v5, v6}, Lp6/c;-><init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;J)V

    .line 351
    .line 352
    .line 353
    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    :cond_16
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 357
    .line 358
    and-int/lit16 v7, v2, 0x3fe

    .line 359
    .line 360
    move-wide v1, v5

    .line 361
    move-object v5, v4

    .line 362
    move-object v4, v8

    .line 363
    const/4 v8, 0x0

    .line 364
    move-object v6, v15

    .line 365
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->g(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 366
    .line 367
    .line 368
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_17

    .line 373
    .line 374
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 375
    .line 376
    .line 377
    :cond_17
    move-object v4, v3

    .line 378
    move-wide v2, v1

    .line 379
    goto :goto_c

    .line 380
    :cond_18
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 381
    .line 382
    .line 383
    move-wide v2, v5

    .line 384
    move-object v4, v7

    .line 385
    :goto_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    if-eqz v7, :cond_19

    .line 390
    .line 391
    new-instance v0, Lp6/d;

    .line 392
    .line 393
    move-object/from16 v1, p0

    .line 394
    .line 395
    move/from16 v6, p6

    .line 396
    .line 397
    move v5, v9

    .line 398
    invoke-direct/range {v0 .. v6}, Lp6/d;-><init>(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;II)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 402
    .line 403
    .line 404
    :cond_19
    return-void
.end method

.method public static final g(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 2

    .line 1
    const-string v0, "$this$DisposableEffect"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getCurrentBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p2, v0

    .line 19
    :goto_0
    new-instance v1, Lp6/e;

    .line 20
    .line 21
    invoke-direct {v1, p1, p0, p2}, Lp6/e;-><init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;)V

    .line 22
    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    const-string p1, "SUBMIT_CORRECT_SELF"

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Landroidx/lifecycle/SavedStateHandle;->getLiveData(Ljava/lang/String;)Landroidx/lifecycle/MutableLiveData;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getCurrentBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    new-instance p0, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt$ToCorrectSelfGuidePage$lambda$3$lambda$2$$inlined$onDispose$1;

    .line 45
    .line 46
    invoke-direct {p0, v0, v1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt$ToCorrectSelfGuidePage$lambda$3$lambda$2$$inlined$onDispose$1;-><init>(Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/Observer;)V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method public static final h(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;->c0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    const-string p0, "SUBMIT_CORRECT_SELF"

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p2, p0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public static final i(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->Q()Lj6/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lj6/p;->d()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "SUBMIT_CORRECT_SELF/"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v6, 0x6

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    move-object v2, p1

    .line 31
    invoke-static/range {v2 .. v7}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final j(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;JJ)Lkotlin/Unit;
    .locals 6

    .line 1
    invoke-virtual {p0, p4, p5}, Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;->N(J)Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lg7/b;->a()Landroid/os/Bundle;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    const-string p5, "KEY_DETAIL_BUNDLE"

    .line 12
    .line 13
    invoke-virtual {p4, p5, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    new-instance p0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string p4, "DETAIL_TO_CORRECT_SELF/"

    .line 22
    .line 23
    invoke-virtual {p0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v4, 0x6

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v0, p1

    .line 38
    invoke-static/range {v0 .. v5}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0
.end method

.method public static final k(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    .line 1
    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;->f(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

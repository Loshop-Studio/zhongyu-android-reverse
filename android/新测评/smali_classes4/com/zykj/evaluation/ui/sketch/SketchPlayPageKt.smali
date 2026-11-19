.class public abstract Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JJLjava/lang/String;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->i(JJLjava/lang/String;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Landroidx/navigation/NavController;F)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->j(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Landroidx/navigation/NavController;F)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->n(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Lc7/c;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->l(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Lc7/c;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->m(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc7/k;Lc7/c;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->o(Lc7/k;Lc7/c;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->k(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h(JJLjava/lang/String;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    .line 1
    move-object/from16 v6, p4

    .line 2
    .line 3
    move-object/from16 v8, p5

    .line 4
    .line 5
    move/from16 v9, p8

    .line 6
    .line 7
    const-string v0, "url"

    .line 8
    .line 9
    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "navController"

    .line 13
    .line 14
    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, -0x71f339e7

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p7

    .line 21
    .line 22
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v15

    .line 26
    and-int/lit8 v1, v9, 0x6

    .line 27
    .line 28
    move-wide/from16 v3, p0

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    invoke-interface {v15, v3, v4}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v1, 0x2

    .line 41
    :goto_0
    or-int/2addr v1, v9

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v1, v9

    .line 44
    :goto_1
    and-int/lit8 v5, v9, 0x30

    .line 45
    .line 46
    move-wide/from16 v10, p2

    .line 47
    .line 48
    if-nez v5, :cond_3

    .line 49
    .line 50
    invoke-interface {v15, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    const/16 v5, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/16 v5, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v1, v5

    .line 62
    :cond_3
    and-int/lit16 v5, v9, 0x180

    .line 63
    .line 64
    const/16 v12, 0x100

    .line 65
    .line 66
    if-nez v5, :cond_5

    .line 67
    .line 68
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    move v5, v12

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    const/16 v5, 0x80

    .line 77
    .line 78
    :goto_3
    or-int/2addr v1, v5

    .line 79
    :cond_5
    and-int/lit16 v5, v9, 0xc00

    .line 80
    .line 81
    if-nez v5, :cond_7

    .line 82
    .line 83
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_6

    .line 88
    .line 89
    const/16 v5, 0x800

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_6
    const/16 v5, 0x400

    .line 93
    .line 94
    :goto_4
    or-int/2addr v1, v5

    .line 95
    :cond_7
    and-int/lit16 v5, v9, 0x6000

    .line 96
    .line 97
    if-nez v5, :cond_a

    .line 98
    .line 99
    and-int/lit8 v5, p9, 0x10

    .line 100
    .line 101
    if-nez v5, :cond_8

    .line 102
    .line 103
    move-object/from16 v5, p6

    .line 104
    .line 105
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    if-eqz v13, :cond_9

    .line 110
    .line 111
    const/16 v13, 0x4000

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_8
    move-object/from16 v5, p6

    .line 115
    .line 116
    :cond_9
    const/16 v13, 0x2000

    .line 117
    .line 118
    :goto_5
    or-int/2addr v1, v13

    .line 119
    goto :goto_6

    .line 120
    :cond_a
    move-object/from16 v5, p6

    .line 121
    .line 122
    :goto_6
    and-int/lit16 v13, v1, 0x2493

    .line 123
    .line 124
    const/16 v14, 0x2492

    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v2, 0x1

    .line 128
    if-eq v13, v14, :cond_b

    .line 129
    .line 130
    move v13, v2

    .line 131
    goto :goto_7

    .line 132
    :cond_b
    move v13, v7

    .line 133
    :goto_7
    and-int/lit8 v14, v1, 0x1

    .line 134
    .line 135
    invoke-interface {v15, v13, v14}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-eqz v13, :cond_1d

    .line 140
    .line 141
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 142
    .line 143
    .line 144
    and-int/lit8 v13, v9, 0x1

    .line 145
    .line 146
    const v18, -0xe001

    .line 147
    .line 148
    .line 149
    if-eqz v13, :cond_e

    .line 150
    .line 151
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v13, :cond_c

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_c
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 159
    .line 160
    .line 161
    and-int/lit8 v13, p9, 0x10

    .line 162
    .line 163
    if-eqz v13, :cond_d

    .line 164
    .line 165
    and-int v1, v1, v18

    .line 166
    .line 167
    move-object v11, v5

    .line 168
    move v5, v1

    .line 169
    move-object v1, v11

    .line 170
    move v11, v12

    .line 171
    goto :goto_b

    .line 172
    :cond_d
    move v11, v12

    .line 173
    goto :goto_a

    .line 174
    :cond_e
    :goto_8
    and-int/lit8 v13, p9, 0x10

    .line 175
    .line 176
    if-eqz v13, :cond_d

    .line 177
    .line 178
    const v5, 0x70b323c8

    .line 179
    .line 180
    .line 181
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 182
    .line 183
    .line 184
    sget-object v5, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 185
    .line 186
    sget v13, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 187
    .line 188
    invoke-virtual {v5, v15, v13}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    if-eqz v5, :cond_10

    .line 193
    .line 194
    invoke-static {v5, v15, v7}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 195
    .line 196
    .line 197
    move-result-object v13

    .line 198
    const v14, 0x671a9c9b

    .line 199
    .line 200
    .line 201
    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 202
    .line 203
    .line 204
    instance-of v14, v5, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 205
    .line 206
    if-eqz v14, :cond_f

    .line 207
    .line 208
    move-object v14, v5

    .line 209
    check-cast v14, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 210
    .line 211
    invoke-interface {v14}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 212
    .line 213
    .line 214
    move-result-object v14

    .line 215
    goto :goto_9

    .line 216
    :cond_f
    sget-object v14, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 217
    .line 218
    :goto_9
    const v16, 0x9048

    .line 219
    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const-class v10, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 224
    .line 225
    move v11, v12

    .line 226
    const/4 v12, 0x0

    .line 227
    move/from16 v19, v11

    .line 228
    .line 229
    move-object v11, v5

    .line 230
    move/from16 v5, v19

    .line 231
    .line 232
    invoke-static/range {v10 .. v17}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 233
    .line 234
    .line 235
    move-result-object v10

    .line 236
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 237
    .line 238
    .line 239
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 240
    .line 241
    .line 242
    check-cast v10, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 243
    .line 244
    and-int v1, v1, v18

    .line 245
    .line 246
    move v11, v5

    .line 247
    move v5, v1

    .line 248
    move-object v1, v10

    .line 249
    goto :goto_b

    .line 250
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 251
    .line 252
    const-string v1, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 253
    .line 254
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :goto_a
    move-object/from16 v19, v5

    .line 259
    .line 260
    move v5, v1

    .line 261
    move-object/from16 v1, v19

    .line 262
    .line 263
    :goto_b
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 264
    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    if-eqz v10, :cond_11

    .line 271
    .line 272
    const/4 v10, -0x1

    .line 273
    const-string v12, "com.zykj.evaluation.ui.sketch.SketchPlayPage (SketchPlayPage.kt:20)"

    .line 274
    .line 275
    invoke-static {v0, v5, v10, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :cond_11
    sget-object v10, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 279
    .line 280
    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    and-int/lit8 v12, v5, 0xe

    .line 285
    .line 286
    const/4 v13, 0x4

    .line 287
    if-ne v12, v13, :cond_12

    .line 288
    .line 289
    move v12, v2

    .line 290
    goto :goto_c

    .line 291
    :cond_12
    move v12, v7

    .line 292
    :goto_c
    or-int/2addr v0, v12

    .line 293
    and-int/lit8 v12, v5, 0x70

    .line 294
    .line 295
    const/16 v13, 0x20

    .line 296
    .line 297
    if-ne v12, v13, :cond_13

    .line 298
    .line 299
    move v12, v2

    .line 300
    goto :goto_d

    .line 301
    :cond_13
    move v12, v7

    .line 302
    :goto_d
    or-int/2addr v0, v12

    .line 303
    and-int/lit16 v5, v5, 0x380

    .line 304
    .line 305
    if-ne v5, v11, :cond_14

    .line 306
    .line 307
    move v5, v2

    .line 308
    goto :goto_e

    .line 309
    :cond_14
    move v5, v7

    .line 310
    :goto_e
    or-int/2addr v0, v5

    .line 311
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    if-nez v0, :cond_16

    .line 316
    .line 317
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 318
    .line 319
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    if-ne v5, v0, :cond_15

    .line 324
    .line 325
    goto :goto_f

    .line 326
    :cond_15
    move-object v13, v1

    .line 327
    move v12, v2

    .line 328
    move v11, v7

    .line 329
    goto :goto_10

    .line 330
    :cond_16
    :goto_f
    new-instance v0, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt$SketchPlayPage$1$1;

    .line 331
    .line 332
    move v5, v7

    .line 333
    const/4 v7, 0x0

    .line 334
    move v12, v2

    .line 335
    move-wide v2, v3

    .line 336
    move v11, v5

    .line 337
    move-wide/from16 v4, p2

    .line 338
    .line 339
    invoke-direct/range {v0 .. v7}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt$SketchPlayPage$1$1;-><init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 340
    .line 341
    .line 342
    move-object v13, v1

    .line 343
    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    move-object v5, v0

    .line 347
    :goto_10
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 348
    .line 349
    const/4 v0, 0x6

    .line 350
    invoke-static {v10, v5, v15, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v13}, Lcom/zykj/evaluation/base/BaseViewModel;->b()Ll5/c;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v13}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;->s()Lc7/k;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 366
    .line 367
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    if-ne v2, v4, :cond_17

    .line 372
    .line 373
    new-instance v2, Lc7/c;

    .line 374
    .line 375
    new-instance v4, Lc7/d;

    .line 376
    .line 377
    invoke-direct {v4, v13, v8}, Lc7/d;-><init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Landroidx/navigation/NavController;)V

    .line 378
    .line 379
    .line 380
    const/4 v5, 0x0

    .line 381
    invoke-direct {v2, v5, v4, v12, v5}, Lc7/c;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 382
    .line 383
    .line 384
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :cond_17
    check-cast v2, Lc7/c;

    .line 388
    .line 389
    invoke-interface {v15, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    or-int/2addr v4, v5

    .line 398
    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    or-int/2addr v4, v5

    .line 403
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    if-nez v4, :cond_18

    .line 408
    .line 409
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    if-ne v5, v4, :cond_19

    .line 414
    .line 415
    :cond_18
    new-instance v5, Lc7/e;

    .line 416
    .line 417
    invoke-direct {v5, v13, v2, v8}, Lc7/e;-><init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Lc7/c;Landroidx/navigation/NavController;)V

    .line 418
    .line 419
    .line 420
    invoke-interface {v15, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    :cond_19
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 424
    .line 425
    invoke-static {v11, v5, v15, v11, v12}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 426
    .line 427
    .line 428
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 429
    .line 430
    invoke-static {v4}, Landroidx/compose/foundation/layout/WindowInsetsPadding_androidKt;->statusBarsPadding(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    invoke-virtual {v0}, Ll5/c;->c()Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    invoke-interface {v15, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v5

    .line 442
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    if-nez v5, :cond_1a

    .line 447
    .line 448
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    if-ne v6, v3, :cond_1b

    .line 453
    .line 454
    :cond_1a
    new-instance v6, Lc7/f;

    .line 455
    .line 456
    invoke-direct {v6, v13}, Lc7/f;-><init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    :cond_1b
    move-object v3, v6

    .line 463
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 464
    .line 465
    new-instance v5, Lc7/g;

    .line 466
    .line 467
    invoke-direct {v5, v1, v2}, Lc7/g;-><init>(Lc7/k;Lc7/c;)V

    .line 468
    .line 469
    .line 470
    const/16 v1, 0x36

    .line 471
    .line 472
    const v2, -0x5982f7e6

    .line 473
    .line 474
    .line 475
    invoke-static {v2, v12, v5, v15, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    const/16 v6, 0xc00

    .line 480
    .line 481
    const/4 v7, 0x0

    .line 482
    move-object v2, v4

    .line 483
    move-object v5, v15

    .line 484
    move-object v4, v1

    .line 485
    move v1, v0

    .line 486
    invoke-static/range {v1 .. v7}, Le7/h;->d(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 487
    .line 488
    .line 489
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_1c

    .line 494
    .line 495
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 496
    .line 497
    .line 498
    :cond_1c
    move-object v7, v13

    .line 499
    goto :goto_11

    .line 500
    :cond_1d
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 501
    .line 502
    .line 503
    move-object v7, v5

    .line 504
    :goto_11
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    if-eqz v10, :cond_1e

    .line 509
    .line 510
    new-instance v0, Lc7/h;

    .line 511
    .line 512
    move-wide/from16 v1, p0

    .line 513
    .line 514
    move-wide/from16 v3, p2

    .line 515
    .line 516
    move-object/from16 v5, p4

    .line 517
    .line 518
    move-object v6, v8

    .line 519
    move v8, v9

    .line 520
    move/from16 v9, p9

    .line 521
    .line 522
    invoke-direct/range {v0 .. v9}, Lc7/h;-><init>(JJLjava/lang/String;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;II)V

    .line 523
    .line 524
    .line 525
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 526
    .line 527
    .line 528
    :cond_1e
    return-void
.end method

.method public static final i(JJLjava/lang/String;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 11

    .line 1
    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v9

    move-wide v1, p0

    move-wide v3, p2

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lcom/zykj/evaluation/ui/sketch/SketchPlayPageKt;->h(JJLjava/lang/String;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Landroidx/navigation/NavController;F)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v0, Lc7/i;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lc7/i;-><init>(Landroidx/navigation/NavController;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2, v0}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;->w(Ljava/lang/Float;Lkotlin/jvm/functions/Function0;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final k(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final l(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Lc7/c;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lc7/c;->f()Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/Float;

    .line 10
    .line 11
    new-instance v0, Lc7/j;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Lc7/j;-><init>(Landroidx/navigation/NavController;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;->w(Ljava/lang/Float;Lkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0
.end method

.method public static final m(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final n(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;)Lkotlin/Unit;
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

.method public static final o(Lc7/k;Lc7/c;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 8

    .line 1
    const-string v0, "$this$BoxWithLoadState"

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
    if-eq p2, v0, :cond_0

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p2, 0x0

    .line 15
    :goto_0
    and-int/lit8 v0, p4, 0x1

    .line 16
    .line 17
    invoke-interface {p3, p2, v0}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_2

    .line 22
    .line 23
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    const/4 p2, -0x1

    .line 30
    const-string v0, "com.zykj.evaluation.ui.sketch.SketchPlayPage.<anonymous> (SketchPlayPage.kt:58)"

    .line 31
    .line 32
    const v1, -0x5982f7e6

    .line 33
    .line 34
    .line 35
    invoke-static {v1, p4, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Lc7/k;->b()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v7, 0x1

    .line 44
    const/4 v2, 0x0

    .line 45
    move-object v4, p1

    .line 46
    move-object v5, p3

    .line 47
    invoke-static/range {v2 .. v7}, Lc7/r;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc7/c;Landroidx/compose/runtime/Composer;II)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object v5, p3

    .line 61
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0
.end method

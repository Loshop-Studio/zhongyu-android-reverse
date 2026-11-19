.class public abstract Lcom/zykj/mistake/feature/notebook/detail/r4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move/from16 v9, p3

    .line 6
    .line 7
    const-string v0, "backStackEntry"

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "shellViewModel"

    .line 13
    .line 14
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, 0x3db1d53a

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p2

    .line 21
    .line 22
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    and-int/lit8 v2, v9, 0x6

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x2

    .line 39
    :goto_0
    or-int/2addr v2, v9

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v2, v9

    .line 42
    :goto_1
    and-int/lit8 v3, v9, 0x30

    .line 43
    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    const/16 v3, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v3, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v2, v3

    .line 58
    :cond_3
    move v10, v2

    .line 59
    and-int/lit8 v2, v10, 0x13

    .line 60
    .line 61
    const/16 v3, 0x12

    .line 62
    .line 63
    if-eq v2, v3, :cond_4

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/4 v2, 0x0

    .line 68
    :goto_3
    and-int/lit8 v3, v10, 0x1

    .line 69
    .line 70
    invoke-interface {v5, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_10

    .line 75
    .line 76
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    const/4 v2, -0x1

    .line 83
    const-string v3, "com.zykj.mistake.feature.notebook.detail.MistakeDetailRoute (MistakeDetailRoute.kt:25)"

    .line 84
    .line 85
    invoke-static {v0, v10, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    const-class v0, Lu4/g;

    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v1, v0}, Landroidx/navigation/NavBackStackEntryKt;->toRoute(Landroidx/navigation/NavBackStackEntry;Ly6/c;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    move-object v13, v0

    .line 99
    check-cast v13, Lu4/g;

    .line 100
    .line 101
    and-int/lit8 v14, v10, 0xe

    .line 102
    .line 103
    invoke-interface {v1}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    const-class v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 108
    .line 109
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    shl-int/lit8 v2, v14, 0x3

    .line 114
    .line 115
    and-int/lit8 v6, v2, 0x70

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v2, 0x0

    .line 119
    const/4 v3, 0x0

    .line 120
    invoke-static/range {v0 .. v7}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ly6/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 125
    .line 126
    sget-object v1, Lz4/f;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 127
    .line 128
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    move-object v15, v1

    .line 133
    check-cast v15, Lz4/e;

    .line 134
    .line 135
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Landroid/content/Context;

    .line 144
    .line 145
    invoke-virtual/range {p0 .. p0}, Landroidx/navigation/NavBackStackEntry;->getId()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    if-nez v3, :cond_6

    .line 158
    .line 159
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 160
    .line 161
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    if-ne v4, v3, :cond_9

    .line 166
    .line 167
    :cond_6
    sget-object v3, Lcom/zykj/mistake/utils/e;->a:Lcom/zykj/mistake/utils/e;

    .line 168
    .line 169
    monitor-enter v3

    .line 170
    :try_start_0
    const-string v4, "context"

    .line 171
    .line 172
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const-string v4, "ownerId"

    .line 176
    .line 177
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    sget-object v4, Lcom/zykj/mistake/utils/e;->b:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_7

    .line 187
    .line 188
    sget-object v4, Lcom/zykj/mistake/utils/e;->c:Lcoil3/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    .line 190
    if-eqz v4, :cond_7

    .line 191
    .line 192
    monitor-exit v3

    .line 193
    const/4 v11, 0x0

    .line 194
    goto :goto_4

    .line 195
    :catchall_0
    move-exception v0

    .line 196
    goto/16 :goto_7

    .line 197
    .line 198
    :cond_7
    :try_start_1
    sget-object v4, Lcom/zykj/mistake/utils/e;->c:Lcoil3/r;

    .line 199
    .line 200
    if-eqz v4, :cond_8

    .line 201
    .line 202
    invoke-virtual {v4}, Lcoil3/r;->d()Lq/e;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    if-eqz v4, :cond_8

    .line 207
    .line 208
    invoke-virtual {v4}, Lq/e;->a()V

    .line 209
    .line 210
    .line 211
    :cond_8
    new-instance v4, Lb0/g;

    .line 212
    .line 213
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    const-string v7, "getApplicationContext(...)"

    .line 218
    .line 219
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-direct {v4, v6}, Lb0/g;-><init>(Landroid/content/Context;)V

    .line 223
    .line 224
    .line 225
    sget-object v6, Lcoil3/request/CachePolicy;->DISABLED:Lcoil3/request/CachePolicy;

    .line 226
    .line 227
    iget-object v7, v4, Lb0/g;->c:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v7, Ls/d;

    .line 230
    .line 231
    const/4 v11, 0x0

    .line 232
    const/16 v12, 0x3fdf

    .line 233
    .line 234
    invoke-static {v7, v6, v11, v12}, Ls/d;->a(Ls/d;Lcoil3/request/CachePolicy;Lcoil3/j;I)Ls/d;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    iput-object v6, v4, Lb0/g;->c:Ljava/lang/Object;

    .line 239
    .line 240
    invoke-virtual {v4}, Lb0/g;->b()Lcoil3/r;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    sput-object v2, Lcom/zykj/mistake/utils/e;->b:Ljava/lang/String;

    .line 245
    .line 246
    sput-object v4, Lcom/zykj/mistake/utils/e;->c:Lcoil3/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 247
    .line 248
    monitor-exit v3

    .line 249
    const/4 v11, 0x1

    .line 250
    :goto_4
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :cond_9
    move-object v11, v4

    .line 258
    check-cast v11, Ljava/lang/Boolean;

    .line 259
    .line 260
    move v12, v14

    .line 261
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 262
    .line 263
    .line 264
    move-result v14

    .line 265
    move-object v3, v1

    .line 266
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->f:Lkotlinx/coroutines/flow/a0;

    .line 267
    .line 268
    const/4 v6, 0x0

    .line 269
    const/4 v7, 0x7

    .line 270
    move-object v4, v2

    .line 271
    const/4 v2, 0x0

    .line 272
    move-object/from16 v16, v3

    .line 273
    .line 274
    const/4 v3, 0x0

    .line 275
    move-object/from16 v17, v4

    .line 276
    .line 277
    const/4 v4, 0x0

    .line 278
    move/from16 p2, v10

    .line 279
    .line 280
    move-object/from16 v10, v16

    .line 281
    .line 282
    move/from16 v16, v12

    .line 283
    .line 284
    move-object/from16 v12, v17

    .line 285
    .line 286
    invoke-static/range {v1 .. v7}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-interface {v5, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    or-int/2addr v2, v3

    .line 299
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    or-int/2addr v2, v3

    .line 304
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    or-int/2addr v2, v3

    .line 309
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    if-nez v2, :cond_a

    .line 314
    .line 315
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 316
    .line 317
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    if-ne v3, v2, :cond_b

    .line 322
    .line 323
    :cond_a
    move-object/from16 v17, v13

    .line 324
    .line 325
    goto :goto_5

    .line 326
    :cond_b
    move-object v6, v0

    .line 327
    move-object v4, v13

    .line 328
    move/from16 v2, v16

    .line 329
    .line 330
    move-object/from16 v0, p0

    .line 331
    .line 332
    move-object v13, v3

    .line 333
    move-object v3, v15

    .line 334
    goto :goto_6

    .line 335
    :goto_5
    new-instance v13, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;

    .line 336
    .line 337
    const/16 v18, 0x0

    .line 338
    .line 339
    move-object v3, v15

    .line 340
    move/from16 v2, v16

    .line 341
    .line 342
    move-object/from16 v16, v0

    .line 343
    .line 344
    move-object v15, v10

    .line 345
    move-object/from16 v0, p0

    .line 346
    .line 347
    invoke-direct/range {v13 .. v18}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$1$1;-><init>(ZLandroid/content/Context;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lu4/g;Lh6/c;)V

    .line 348
    .line 349
    .line 350
    move-object/from16 v6, v16

    .line 351
    .line 352
    move-object/from16 v4, v17

    .line 353
    .line 354
    invoke-interface {v5, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    :goto_6
    check-cast v13, Lr6/e;

    .line 358
    .line 359
    const/4 v7, 0x0

    .line 360
    invoke-static {v12, v11, v13, v5, v7}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v5, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v7

    .line 367
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v10

    .line 371
    or-int/2addr v7, v10

    .line 372
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v10

    .line 376
    or-int/2addr v7, v10

    .line 377
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    if-nez v7, :cond_c

    .line 382
    .line 383
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 384
    .line 385
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    if-ne v10, v7, :cond_d

    .line 390
    .line 391
    :cond_c
    new-instance v10, Landroidx/lifecycle/i;

    .line 392
    .line 393
    const/16 v7, 0xb

    .line 394
    .line 395
    invoke-direct {v10, v0, v12, v7, v4}, Landroidx/lifecycle/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    invoke-interface {v5, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    :cond_d
    check-cast v10, Lr6/c;

    .line 402
    .line 403
    invoke-static {v0, v12, v10, v5, v2}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 404
    .line 405
    .line 406
    shr-int/lit8 v2, p2, 0x3

    .line 407
    .line 408
    and-int/lit8 v2, v2, 0xe

    .line 409
    .line 410
    invoke-static {v8, v6, v5, v2}, Lcom/zykj/mistake/feature/notebook/detail/e;->a(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 411
    .line 412
    .line 413
    and-int/lit8 v2, p2, 0x70

    .line 414
    .line 415
    invoke-static {v6, v8, v3, v5, v2}, Lcom/zykj/mistake/feature/notebook/detail/k0;->a(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Lz4/e;Landroidx/compose/runtime/Composer;I)V

    .line 416
    .line 417
    .line 418
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 423
    .line 424
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    if-nez v2, :cond_e

    .line 433
    .line 434
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 435
    .line 436
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    if-ne v3, v2, :cond_f

    .line 441
    .line 442
    :cond_e
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$3$1;

    .line 443
    .line 444
    invoke-direct {v3, v6}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailRouteKt$MistakeDetailRoute$3$1;-><init>(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    :cond_f
    check-cast v3, Ly6/e;

    .line 451
    .line 452
    check-cast v3, Lr6/c;

    .line 453
    .line 454
    const/4 v7, 0x0

    .line 455
    invoke-static {v1, v3, v5, v7}, Lcom/zykj/mistake/feature/notebook/detail/x3;->a(Lcom/zykj/mistake/feature/notebook/detail/m3;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 456
    .line 457
    .line 458
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    if-eqz v1, :cond_11

    .line 463
    .line 464
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 465
    .line 466
    .line 467
    goto :goto_8

    .line 468
    :goto_7
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 469
    throw v0

    .line 470
    :cond_10
    move-object v0, v1

    .line 471
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 472
    .line 473
    .line 474
    :cond_11
    :goto_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    if-eqz v1, :cond_12

    .line 479
    .line 480
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/b;

    .line 481
    .line 482
    const/4 v3, 0x2

    .line 483
    invoke-direct {v2, v0, v8, v9, v3}, Lcom/zykj/mistake/feature/collection/detail/b;-><init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/main/MainShellViewModel;II)V

    .line 484
    .line 485
    .line 486
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 487
    .line 488
    .line 489
    :cond_12
    return-void
.end method

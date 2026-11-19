.class public abstract Lcom/zykj/mistake/feature/home/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "shellViewModel"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v0, -0x2d012683

    .line 9
    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 14
    .line 15
    .line 16
    move-result-object v13

    .line 17
    and-int/lit8 v2, p2, 0x6

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v2, v3

    .line 31
    :goto_0
    or-int v2, p2, v2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move/from16 v2, p2

    .line 35
    .line 36
    :goto_1
    and-int/lit8 v4, v2, 0x3

    .line 37
    .line 38
    if-eq v4, v3, :cond_2

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/4 v4, 0x0

    .line 43
    :goto_2
    and-int/lit8 v8, v2, 0x1

    .line 44
    .line 45
    invoke-interface {v13, v4, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_2f

    .line 50
    .line 51
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    const/4 v4, -0x1

    .line 58
    const-string v8, "com.zykj.mistake.feature.home.HomeRoute (HomeRoute.kt:38)"

    .line 59
    .line 60
    invoke-static {v0, v2, v4, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_3
    sget-object v0, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 64
    .line 65
    const/4 v4, 0x6

    .line 66
    invoke-virtual {v0, v13, v4}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    const-string v8, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 71
    .line 72
    if-eqz v9, :cond_2e

    .line 73
    .line 74
    instance-of v10, v9, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 75
    .line 76
    if-eqz v10, :cond_4

    .line 77
    .line 78
    move-object v10, v9

    .line 79
    check-cast v10, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 80
    .line 81
    invoke-interface {v10}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    :goto_3
    move-object v12, v10

    .line 86
    goto :goto_4

    .line 87
    :cond_4
    sget-object v10, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :goto_4
    const-class v10, Lcom/zykj/mistake/feature/home/MainHomeViewModel;

    .line 91
    .line 92
    invoke-static {v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    const/4 v15, 0x0

    .line 97
    move-object v11, v8

    .line 98
    move-object v8, v10

    .line 99
    const/4 v10, 0x0

    .line 100
    move-object v14, v11

    .line 101
    const/4 v11, 0x0

    .line 102
    move-object/from16 v16, v14

    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    move-object/from16 v3, v16

    .line 106
    .line 107
    invoke-static/range {v8 .. v15}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ly6/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, Lcom/zykj/mistake/feature/home/MainHomeViewModel;

    .line 112
    .line 113
    invoke-virtual {v0, v13, v4}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    if-eqz v9, :cond_2d

    .line 118
    .line 119
    instance-of v10, v9, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 120
    .line 121
    if-eqz v10, :cond_5

    .line 122
    .line 123
    move-object v10, v9

    .line 124
    check-cast v10, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 125
    .line 126
    invoke-interface {v10}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    :goto_5
    move-object v12, v10

    .line 131
    goto :goto_6

    .line 132
    :cond_5
    sget-object v10, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :goto_6
    const-class v10, Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 136
    .line 137
    invoke-static {v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    const/4 v15, 0x0

    .line 142
    move-object v11, v8

    .line 143
    move-object v8, v10

    .line 144
    const/4 v10, 0x0

    .line 145
    move-object/from16 v16, v11

    .line 146
    .line 147
    const/4 v11, 0x0

    .line 148
    move-object/from16 v6, v16

    .line 149
    .line 150
    invoke-static/range {v8 .. v15}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ly6/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    check-cast v8, Lcom/zykj/mistake/feature/review/ReviewViewModel;

    .line 155
    .line 156
    invoke-virtual {v0, v13, v4}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    if-eqz v9, :cond_2c

    .line 161
    .line 162
    instance-of v10, v9, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 163
    .line 164
    if-eqz v10, :cond_6

    .line 165
    .line 166
    move-object v10, v9

    .line 167
    check-cast v10, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 168
    .line 169
    invoke-interface {v10}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    :goto_7
    move-object v12, v10

    .line 174
    goto :goto_8

    .line 175
    :cond_6
    sget-object v10, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :goto_8
    const-class v10, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 179
    .line 180
    invoke-static {v10}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    const/4 v15, 0x0

    .line 185
    move-object v11, v8

    .line 186
    move-object v8, v10

    .line 187
    const/4 v10, 0x0

    .line 188
    move-object/from16 v16, v11

    .line 189
    .line 190
    const/4 v11, 0x0

    .line 191
    move-object/from16 v5, v16

    .line 192
    .line 193
    invoke-static/range {v8 .. v15}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ly6/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    check-cast v8, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 198
    .line 199
    invoke-virtual {v0, v13, v4}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    if-eqz v9, :cond_2b

    .line 204
    .line 205
    instance-of v0, v9, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 206
    .line 207
    if-eqz v0, :cond_7

    .line 208
    .line 209
    move-object v0, v9

    .line 210
    check-cast v0, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 211
    .line 212
    invoke-interface {v0}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    :goto_9
    move-object v12, v0

    .line 217
    goto :goto_a

    .line 218
    :cond_7
    sget-object v0, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 219
    .line 220
    goto :goto_9

    .line 221
    :goto_a
    const-class v0, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 222
    .line 223
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const/4 v15, 0x0

    .line 228
    const/4 v10, 0x0

    .line 229
    const/4 v11, 0x0

    .line 230
    move-object/from16 v26, v8

    .line 231
    .line 232
    move-object v8, v0

    .line 233
    move-object/from16 v0, v26

    .line 234
    .line 235
    invoke-static/range {v8 .. v15}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ly6/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    check-cast v3, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;

    .line 240
    .line 241
    sget-object v8, Lz4/h;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 242
    .line 243
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    move-object v15, v8

    .line 248
    check-cast v15, Lz4/g;

    .line 249
    .line 250
    sget-object v8, Lt4/d;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 251
    .line 252
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    check-cast v8, Lt4/e;

    .line 257
    .line 258
    invoke-static {}, Landroidx/lifecycle/compose/LocalLifecycleOwnerKt;->getLocalLifecycleOwner()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    check-cast v9, Landroidx/lifecycle/LifecycleOwner;

    .line 267
    .line 268
    move-object v10, v8

    .line 269
    iget-object v8, v6, Lcom/zykj/mistake/feature/home/MainHomeViewModel;->b:Lkotlinx/coroutines/flow/a0;

    .line 270
    .line 271
    move-object v12, v13

    .line 272
    const/4 v13, 0x0

    .line 273
    const/4 v14, 0x7

    .line 274
    move-object v11, v9

    .line 275
    const/4 v9, 0x0

    .line 276
    move-object/from16 v16, v10

    .line 277
    .line 278
    const/4 v10, 0x0

    .line 279
    move-object/from16 v17, v11

    .line 280
    .line 281
    const/4 v11, 0x0

    .line 282
    move-object/from16 v7, v16

    .line 283
    .line 284
    move-object/from16 v4, v17

    .line 285
    .line 286
    invoke-static/range {v8 .. v14}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    move-object v9, v8

    .line 291
    move-object v13, v12

    .line 292
    iget-object v8, v5, Lcom/zykj/mistake/feature/review/ReviewViewModel;->c:Lkotlinx/coroutines/flow/a0;

    .line 293
    .line 294
    const/4 v13, 0x0

    .line 295
    move-object v10, v9

    .line 296
    const/4 v9, 0x0

    .line 297
    move-object v11, v10

    .line 298
    const/4 v10, 0x0

    .line 299
    move-object/from16 v17, v11

    .line 300
    .line 301
    const/4 v11, 0x0

    .line 302
    move-object/from16 v18, v17

    .line 303
    .line 304
    invoke-static/range {v8 .. v14}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    move-object v9, v8

    .line 309
    move-object v13, v12

    .line 310
    iget-object v8, v0, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->e:Lkotlinx/coroutines/flow/a0;

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    move-object v10, v9

    .line 314
    const/4 v9, 0x0

    .line 315
    move-object v11, v10

    .line 316
    const/4 v10, 0x0

    .line 317
    move-object/from16 v17, v11

    .line 318
    .line 319
    const/4 v11, 0x0

    .line 320
    move-object/from16 v19, v17

    .line 321
    .line 322
    invoke-static/range {v8 .. v14}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 323
    .line 324
    .line 325
    move-result-object v17

    .line 326
    move-object v13, v12

    .line 327
    iget-object v8, v3, Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;->c:Lkotlinx/coroutines/flow/a0;

    .line 328
    .line 329
    const/4 v13, 0x0

    .line 330
    invoke-static/range {v8 .. v14}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    move-object v13, v12

    .line 335
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v9

    .line 339
    check-cast v9, Lcom/zykj/mistake/feature/home/o;

    .line 340
    .line 341
    iget-object v9, v9, Lcom/zykj/mistake/feature/home/o;->a:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 342
    .line 343
    const/4 v10, 0x0

    .line 344
    invoke-static {v9, v13, v10}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    filled-new-array {v4, v0, v3, v5, v1}, [Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v12

    .line 356
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v14

    .line 360
    or-int/2addr v12, v14

    .line 361
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v14

    .line 365
    or-int/2addr v12, v14

    .line 366
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v14

    .line 370
    or-int/2addr v12, v14

    .line 371
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v14

    .line 375
    or-int/2addr v12, v14

    .line 376
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v14

    .line 380
    or-int/2addr v12, v14

    .line 381
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v14

    .line 385
    if-nez v12, :cond_8

    .line 386
    .line 387
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 388
    .line 389
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v12

    .line 393
    if-ne v14, v12, :cond_9

    .line 394
    .line 395
    :cond_8
    move v12, v2

    .line 396
    move-object v2, v0

    .line 397
    goto :goto_b

    .line 398
    :cond_9
    move v12, v2

    .line 399
    move-object v9, v6

    .line 400
    move-object v2, v0

    .line 401
    move-object v0, v14

    .line 402
    const/4 v14, 0x1

    .line 403
    goto :goto_c

    .line 404
    :goto_b
    new-instance v0, Lcom/zykj/mistake/feature/home/c;

    .line 405
    .line 406
    move-object v14, v3

    .line 407
    move-object v3, v1

    .line 408
    move-object v1, v4

    .line 409
    move-object v4, v14

    .line 410
    move-object v14, v9

    .line 411
    move-object v9, v6

    .line 412
    move-object v6, v14

    .line 413
    const/4 v14, 0x1

    .line 414
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/home/c;-><init>(Landroidx/lifecycle/LifecycleOwner;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Landroidx/compose/runtime/State;)V

    .line 415
    .line 416
    .line 417
    move-object v1, v3

    .line 418
    move-object v3, v4

    .line 419
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    :goto_c
    check-cast v0, Lr6/c;

    .line 423
    .line 424
    invoke-static {v11, v0, v13, v10}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect([Ljava/lang/Object;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 425
    .line 426
    .line 427
    and-int/lit8 v0, v12, 0xe

    .line 428
    .line 429
    invoke-static {v1, v2, v3, v13, v0}, Lcom/zykj/mistake/feature/home/k;->a(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 430
    .line 431
    .line 432
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    or-int/2addr v0, v4

    .line 441
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    const/4 v6, 0x0

    .line 446
    if-nez v0, :cond_a

    .line 447
    .line 448
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 449
    .line 450
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    if-ne v4, v0, :cond_b

    .line 455
    .line 456
    :cond_a
    new-instance v4, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$2$1;

    .line 457
    .line 458
    invoke-direct {v4, v7, v2, v6}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$2$1;-><init>(Lt4/e;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 459
    .line 460
    .line 461
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    :cond_b
    check-cast v4, Lr6/e;

    .line 465
    .line 466
    invoke-static {v2, v7, v4, v13, v10}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 467
    .line 468
    .line 469
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    or-int/2addr v0, v4

    .line 478
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    if-nez v0, :cond_c

    .line 483
    .line 484
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 485
    .line 486
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    if-ne v4, v0, :cond_d

    .line 491
    .line 492
    :cond_c
    new-instance v4, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$3$1;

    .line 493
    .line 494
    invoke-direct {v4, v7, v2, v6}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$3$1;-><init>(Lt4/e;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lh6/c;)V

    .line 495
    .line 496
    .line 497
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    :cond_d
    check-cast v4, Lr6/e;

    .line 501
    .line 502
    invoke-static {v2, v7, v4, v13, v10}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 503
    .line 504
    .line 505
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    or-int/2addr v0, v4

    .line 514
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    if-nez v0, :cond_e

    .line 519
    .line 520
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 521
    .line 522
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    if-ne v4, v0, :cond_f

    .line 527
    .line 528
    :cond_e
    new-instance v4, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$4$1;

    .line 529
    .line 530
    invoke-direct {v4, v7, v1, v6}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$4$1;-><init>(Lt4/e;Lcom/zykj/mistake/main/MainShellViewModel;Lh6/c;)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 534
    .line 535
    .line 536
    :cond_f
    check-cast v4, Lr6/e;

    .line 537
    .line 538
    invoke-static {v3, v7, v4, v13, v10}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 539
    .line 540
    .line 541
    filled-new-array {v1, v2, v3, v5}, [Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v7

    .line 545
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v4

    .line 553
    or-int/2addr v0, v4

    .line 554
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    or-int/2addr v0, v4

    .line 559
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v4

    .line 563
    or-int/2addr v0, v4

    .line 564
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    if-nez v0, :cond_11

    .line 569
    .line 570
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 571
    .line 572
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    if-ne v4, v0, :cond_10

    .line 577
    .line 578
    goto :goto_d

    .line 579
    :cond_10
    move-object v11, v2

    .line 580
    goto :goto_e

    .line 581
    :cond_11
    :goto_d
    new-instance v0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;

    .line 582
    .line 583
    move-object/from16 v16, v5

    .line 584
    .line 585
    const/4 v5, 0x0

    .line 586
    move-object/from16 v4, v16

    .line 587
    .line 588
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$5$1;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Lh6/c;)V

    .line 589
    .line 590
    .line 591
    move-object v11, v2

    .line 592
    move-object v5, v4

    .line 593
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    move-object v4, v0

    .line 597
    :goto_e
    check-cast v4, Lr6/e;

    .line 598
    .line 599
    invoke-static {v7, v4, v13, v10}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect([Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 600
    .line 601
    .line 602
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    check-cast v0, Lcom/zykj/mistake/feature/home/o;

    .line 607
    .line 608
    iget-object v7, v0, Lcom/zykj/mistake/feature/home/o;->a:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 609
    .line 610
    move-object/from16 v4, v18

    .line 611
    .line 612
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    or-int/2addr v0, v2

    .line 621
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    or-int/2addr v0, v2

    .line 626
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    or-int/2addr v0, v2

    .line 631
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    if-nez v0, :cond_12

    .line 636
    .line 637
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 638
    .line 639
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    if-ne v2, v0, :cond_13

    .line 644
    .line 645
    :cond_12
    new-instance v0, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;

    .line 646
    .line 647
    move-object/from16 v16, v5

    .line 648
    .line 649
    const/4 v5, 0x0

    .line 650
    move-object v2, v3

    .line 651
    move-object/from16 v3, v16

    .line 652
    .line 653
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$6$1;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/feature/review/ReviewViewModel;Landroidx/compose/runtime/State;Lh6/c;)V

    .line 654
    .line 655
    .line 656
    move-object v5, v3

    .line 657
    move-object v3, v2

    .line 658
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    move-object v2, v0

    .line 662
    :cond_13
    check-cast v2, Lr6/e;

    .line 663
    .line 664
    invoke-static {v7, v2, v13, v10}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 665
    .line 666
    .line 667
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    check-cast v0, Lcom/zykj/mistake/feature/review/i;

    .line 672
    .line 673
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/review/i;->u:Z

    .line 674
    .line 675
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    move-object/from16 v2, v19

    .line 680
    .line 681
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    move-result v7

    .line 685
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    move-result v16

    .line 689
    or-int v7, v7, v16

    .line 690
    .line 691
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v14

    .line 695
    if-nez v7, :cond_14

    .line 696
    .line 697
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 698
    .line 699
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v7

    .line 703
    if-ne v14, v7, :cond_15

    .line 704
    .line 705
    :cond_14
    new-instance v14, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$7$1;

    .line 706
    .line 707
    invoke-direct {v14, v9, v2, v6}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$7$1;-><init>(Lcom/zykj/mistake/feature/home/MainHomeViewModel;Landroidx/compose/runtime/State;Lh6/c;)V

    .line 708
    .line 709
    .line 710
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    :cond_15
    check-cast v14, Lr6/e;

    .line 714
    .line 715
    invoke-static {v0, v14, v13, v10}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 716
    .line 717
    .line 718
    const/4 v0, 0x3

    .line 719
    shl-int/lit8 v7, v12, 0x3

    .line 720
    .line 721
    and-int/lit8 v7, v7, 0x70

    .line 722
    .line 723
    invoke-static {v11, v1, v15, v13, v7}, Lcom/zykj/mistake/feature/notebook/list/m1;->a(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Lz4/g;Landroidx/compose/runtime/Composer;I)V

    .line 724
    .line 725
    .line 726
    invoke-static {v3, v1, v13, v7}, Lcom/zykj/mistake/feature/collection/list/a;->a(Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 727
    .line 728
    .line 729
    invoke-static {v5, v13, v10}, Lcom/zykj/mistake/feature/review/j;->a(Lcom/zykj/mistake/feature/review/ReviewViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 730
    .line 731
    .line 732
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 733
    .line 734
    const/4 v12, 0x0

    .line 735
    const/4 v14, 0x1

    .line 736
    invoke-static {v7, v12, v14, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 737
    .line 738
    .line 739
    move-result-object v20

    .line 740
    const-wide v14, 0xfff5f7faL

    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    invoke-static {v14, v15}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 746
    .line 747
    .line 748
    move-result-wide v21

    .line 749
    const/16 v24, 0x2

    .line 750
    .line 751
    const/16 v25, 0x0

    .line 752
    .line 753
    const/16 v23, 0x0

    .line 754
    .line 755
    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 756
    .line 757
    .line 758
    move-result-object v6

    .line 759
    sget-object v12, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 760
    .line 761
    invoke-virtual {v12}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 762
    .line 763
    .line 764
    move-result-object v12

    .line 765
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 766
    .line 767
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 768
    .line 769
    .line 770
    move-result-object v15

    .line 771
    invoke-static {v12, v15, v13, v10}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 772
    .line 773
    .line 774
    move-result-object v12

    .line 775
    invoke-static {v13, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 776
    .line 777
    .line 778
    move-result v15

    .line 779
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-static {v13, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 784
    .line 785
    .line 786
    move-result-object v6

    .line 787
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 788
    .line 789
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 794
    .line 795
    .line 796
    move-result-object v18

    .line 797
    if-nez v18, :cond_16

    .line 798
    .line 799
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 800
    .line 801
    .line 802
    :cond_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 803
    .line 804
    .line 805
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 806
    .line 807
    .line 808
    move-result v18

    .line 809
    if-eqz v18, :cond_17

    .line 810
    .line 811
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 812
    .line 813
    .line 814
    goto :goto_f

    .line 815
    :cond_17
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 816
    .line 817
    .line 818
    :goto_f
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    invoke-static {v10, v1, v12, v1, v0}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 827
    .line 828
    .line 829
    move-result v12

    .line 830
    if-nez v12, :cond_18

    .line 831
    .line 832
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v12

    .line 836
    move-object/from16 v19, v2

    .line 837
    .line 838
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    if-nez v2, :cond_19

    .line 847
    .line 848
    goto :goto_10

    .line 849
    :cond_18
    move-object/from16 v19, v2

    .line 850
    .line 851
    :goto_10
    invoke-static {v15, v1, v15, v0}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 852
    .line 853
    .line 854
    :cond_19
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    invoke-static {v1, v6, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 859
    .line 860
    .line 861
    sget-object v20, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 862
    .line 863
    const v0, -0x44707b04

    .line 864
    .line 865
    .line 866
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 867
    .line 868
    .line 869
    invoke-interface {v4}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    check-cast v0, Lcom/zykj/mistake/feature/home/o;

    .line 874
    .line 875
    iget-boolean v0, v0, Lcom/zykj/mistake/feature/home/o;->b:Z

    .line 876
    .line 877
    if-nez v0, :cond_1b

    .line 878
    .line 879
    const v0, -0x44706159

    .line 880
    .line 881
    .line 882
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 883
    .line 884
    .line 885
    const/16 v24, 0x2

    .line 886
    .line 887
    const/16 v25, 0x0

    .line 888
    .line 889
    const/high16 v22, 0x3f800000    # 1.0f

    .line 890
    .line 891
    const/16 v23, 0x0

    .line 892
    .line 893
    move-object/from16 v21, v7

    .line 894
    .line 895
    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    const/4 v10, 0x0

    .line 900
    invoke-static {v0, v13, v10}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 901
    .line 902
    .line 903
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v0

    .line 907
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 908
    .line 909
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v1

    .line 913
    if-ne v0, v1, :cond_1a

    .line 914
    .line 915
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 916
    .line 917
    const/4 v1, 0x3

    .line 918
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 919
    .line 920
    .line 921
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 922
    .line 923
    .line 924
    :cond_1a
    move-object v3, v0

    .line 925
    check-cast v3, Lr6/c;

    .line 926
    .line 927
    const/16 v5, 0x1b6

    .line 928
    .line 929
    const/4 v6, 0x0

    .line 930
    const/4 v1, 0x0

    .line 931
    const/4 v2, 0x0

    .line 932
    move-object/from16 v0, p0

    .line 933
    .line 934
    move-object v4, v13

    .line 935
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/home/b;->a(Lcom/zykj/mistake/feature/home/HomeTab;ZLr6/c;Landroidx/compose/runtime/Composer;II)V

    .line 936
    .line 937
    .line 938
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 939
    .line 940
    .line 941
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 942
    .line 943
    .line 944
    goto/16 :goto_13

    .line 945
    .line 946
    :cond_1b
    move-object/from16 v0, p0

    .line 947
    .line 948
    move-object/from16 v21, v7

    .line 949
    .line 950
    const v1, -0x44de1c31

    .line 951
    .line 952
    .line 953
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 954
    .line 955
    .line 956
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 957
    .line 958
    .line 959
    const/16 v24, 0x2

    .line 960
    .line 961
    const/16 v25, 0x0

    .line 962
    .line 963
    const/high16 v22, 0x3f800000    # 1.0f

    .line 964
    .line 965
    const/16 v23, 0x0

    .line 966
    .line 967
    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 972
    .line 973
    .line 974
    move-result-object v2

    .line 975
    const/4 v6, 0x0

    .line 976
    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    invoke-static {v13, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 981
    .line 982
    .line 983
    move-result v7

    .line 984
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 985
    .line 986
    .line 987
    move-result-object v6

    .line 988
    invoke-static {v13, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 989
    .line 990
    .line 991
    move-result-object v1

    .line 992
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 993
    .line 994
    .line 995
    move-result-object v12

    .line 996
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 997
    .line 998
    .line 999
    move-result-object v14

    .line 1000
    if-nez v14, :cond_1c

    .line 1001
    .line 1002
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1003
    .line 1004
    .line 1005
    :cond_1c
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1006
    .line 1007
    .line 1008
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1009
    .line 1010
    .line 1011
    move-result v14

    .line 1012
    if-eqz v14, :cond_1d

    .line 1013
    .line 1014
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1015
    .line 1016
    .line 1017
    goto :goto_11

    .line 1018
    :cond_1d
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1019
    .line 1020
    .line 1021
    :goto_11
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v12

    .line 1025
    invoke-static {v10, v12, v2, v12, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1030
    .line 1031
    .line 1032
    move-result v6

    .line 1033
    if-nez v6, :cond_1e

    .line 1034
    .line 1035
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v6

    .line 1039
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v14

    .line 1043
    invoke-static {v6, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v6

    .line 1047
    if-nez v6, :cond_1f

    .line 1048
    .line 1049
    :cond_1e
    invoke-static {v7, v12, v7, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1050
    .line 1051
    .line 1052
    :cond_1f
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    invoke-static {v12, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1057
    .line 1058
    .line 1059
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1060
    .line 1061
    invoke-interface {v4}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    check-cast v1, Lcom/zykj/mistake/feature/home/o;

    .line 1066
    .line 1067
    iget-object v1, v1, Lcom/zykj/mistake/feature/home/o;->a:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 1068
    .line 1069
    sget-object v2, Lcom/zykj/mistake/feature/home/i;->a:[I

    .line 1070
    .line 1071
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1072
    .line 1073
    .line 1074
    move-result v1

    .line 1075
    aget v1, v2, v1

    .line 1076
    .line 1077
    const/4 v14, 0x1

    .line 1078
    if-eq v1, v14, :cond_26

    .line 1079
    .line 1080
    const/4 v2, 0x2

    .line 1081
    if-eq v1, v2, :cond_23

    .line 1082
    .line 1083
    const/4 v2, 0x3

    .line 1084
    if-ne v1, v2, :cond_22

    .line 1085
    .line 1086
    const v1, 0x15d8668d

    .line 1087
    .line 1088
    .line 1089
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1090
    .line 1091
    .line 1092
    invoke-interface {v8}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/v;

    .line 1097
    .line 1098
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v2

    .line 1102
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v5

    .line 1106
    if-nez v2, :cond_20

    .line 1107
    .line 1108
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1109
    .line 1110
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    if-ne v5, v2, :cond_21

    .line 1115
    .line 1116
    :cond_20
    new-instance v5, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$8$2$3$1;

    .line 1117
    .line 1118
    invoke-direct {v5, v3}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$8$2$3$1;-><init>(Ljava/lang/Object;)V

    .line 1119
    .line 1120
    .line 1121
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1122
    .line 1123
    .line 1124
    :cond_21
    check-cast v5, Ly6/e;

    .line 1125
    .line 1126
    check-cast v5, Lr6/c;

    .line 1127
    .line 1128
    const/4 v10, 0x0

    .line 1129
    invoke-static {v1, v5, v13, v10}, Lcom/zykj/mistake/feature/collection/list/c0;->e(Lcom/zykj/mistake/feature/collection/list/v;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 1130
    .line 1131
    .line 1132
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1133
    .line 1134
    .line 1135
    goto :goto_12

    .line 1136
    :cond_22
    const v0, 0x15d832c7

    .line 1137
    .line 1138
    .line 1139
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1140
    .line 1141
    .line 1142
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1143
    .line 1144
    .line 1145
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 1146
    .line 1147
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 1148
    .line 1149
    .line 1150
    throw v0

    .line 1151
    :cond_23
    const v1, 0x15d84ee7

    .line 1152
    .line 1153
    .line 1154
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1155
    .line 1156
    .line 1157
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v1

    .line 1161
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 1162
    .line 1163
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v2

    .line 1167
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v3

    .line 1171
    if-nez v2, :cond_24

    .line 1172
    .line 1173
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1174
    .line 1175
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v2

    .line 1179
    if-ne v3, v2, :cond_25

    .line 1180
    .line 1181
    :cond_24
    new-instance v3, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$8$2$2$1;

    .line 1182
    .line 1183
    invoke-direct {v3, v11}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$8$2$2$1;-><init>(Ljava/lang/Object;)V

    .line 1184
    .line 1185
    .line 1186
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1187
    .line 1188
    .line 1189
    :cond_25
    check-cast v3, Ly6/e;

    .line 1190
    .line 1191
    check-cast v3, Lr6/c;

    .line 1192
    .line 1193
    const/4 v10, 0x0

    .line 1194
    invoke-static {v1, v3, v13, v10}, Lcom/zykj/mistake/feature/notebook/list/i1;->e(Lcom/zykj/mistake/feature/notebook/list/e1;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 1195
    .line 1196
    .line 1197
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1198
    .line 1199
    .line 1200
    goto :goto_12

    .line 1201
    :cond_26
    const v1, 0x15d8391a

    .line 1202
    .line 1203
    .line 1204
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1205
    .line 1206
    .line 1207
    invoke-interface/range {v19 .. v19}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v1

    .line 1211
    check-cast v1, Lcom/zykj/mistake/feature/review/i;

    .line 1212
    .line 1213
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v2

    .line 1217
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v3

    .line 1221
    if-nez v2, :cond_27

    .line 1222
    .line 1223
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1224
    .line 1225
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v2

    .line 1229
    if-ne v3, v2, :cond_28

    .line 1230
    .line 1231
    :cond_27
    new-instance v3, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$8$2$1$1;

    .line 1232
    .line 1233
    invoke-direct {v3, v5}, Lcom/zykj/mistake/feature/home/HomeRouteKt$HomeRoute$8$2$1$1;-><init>(Ljava/lang/Object;)V

    .line 1234
    .line 1235
    .line 1236
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1237
    .line 1238
    .line 1239
    :cond_28
    check-cast v3, Ly6/e;

    .line 1240
    .line 1241
    check-cast v3, Lr6/c;

    .line 1242
    .line 1243
    const/4 v10, 0x0

    .line 1244
    invoke-static {v1, v3, v13, v10}, Lcom/zykj/mistake/feature/review/y;->f(Lcom/zykj/mistake/feature/review/i;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 1245
    .line 1246
    .line 1247
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1248
    .line 1249
    .line 1250
    :goto_12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1251
    .line 1252
    .line 1253
    invoke-interface {v4}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v1

    .line 1257
    check-cast v1, Lcom/zykj/mistake/feature/home/o;

    .line 1258
    .line 1259
    iget-object v1, v1, Lcom/zykj/mistake/feature/home/o;->a:Lcom/zykj/mistake/feature/home/HomeTab;

    .line 1260
    .line 1261
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1262
    .line 1263
    .line 1264
    move-result v2

    .line 1265
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v3

    .line 1269
    if-nez v2, :cond_29

    .line 1270
    .line 1271
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1272
    .line 1273
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v2

    .line 1277
    if-ne v3, v2, :cond_2a

    .line 1278
    .line 1279
    :cond_29
    new-instance v3, Landroidx/navigation/i;

    .line 1280
    .line 1281
    const/4 v2, 0x6

    .line 1282
    invoke-direct {v3, v9, v2}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 1283
    .line 1284
    .line 1285
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1286
    .line 1287
    .line 1288
    :cond_2a
    check-cast v3, Lr6/c;

    .line 1289
    .line 1290
    const/4 v5, 0x0

    .line 1291
    const/4 v6, 0x2

    .line 1292
    const/4 v2, 0x0

    .line 1293
    move-object v4, v13

    .line 1294
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/home/b;->a(Lcom/zykj/mistake/feature/home/HomeTab;ZLr6/c;Landroidx/compose/runtime/Composer;II)V

    .line 1295
    .line 1296
    .line 1297
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1298
    .line 1299
    .line 1300
    :goto_13
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1301
    .line 1302
    .line 1303
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1304
    .line 1305
    .line 1306
    move-result v1

    .line 1307
    if-eqz v1, :cond_30

    .line 1308
    .line 1309
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1310
    .line 1311
    .line 1312
    goto :goto_14

    .line 1313
    :cond_2b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1314
    .line 1315
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1316
    .line 1317
    .line 1318
    throw v0

    .line 1319
    :cond_2c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1320
    .line 1321
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1322
    .line 1323
    .line 1324
    throw v0

    .line 1325
    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1326
    .line 1327
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1328
    .line 1329
    .line 1330
    throw v0

    .line 1331
    :cond_2e
    move-object v3, v8

    .line 1332
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1333
    .line 1334
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1335
    .line 1336
    .line 1337
    throw v0

    .line 1338
    :cond_2f
    move-object v0, v1

    .line 1339
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1340
    .line 1341
    .line 1342
    :cond_30
    :goto_14
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v1

    .line 1346
    if-eqz v1, :cond_31

    .line 1347
    .line 1348
    new-instance v2, Lcom/zykj/mistake/feature/home/d;

    .line 1349
    .line 1350
    move/from16 v7, p2

    .line 1351
    .line 1352
    const/4 v10, 0x0

    .line 1353
    invoke-direct {v2, v0, v7, v10}, Lcom/zykj/mistake/feature/home/d;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;II)V

    .line 1354
    .line 1355
    .line 1356
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1357
    .line 1358
    .line 1359
    :cond_31
    return-void
.end method

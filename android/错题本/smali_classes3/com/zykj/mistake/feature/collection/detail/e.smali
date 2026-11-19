.class public abstract Lcom/zykj/mistake/feature/collection/detail/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    .line 1
    const-string v0, "backStackEntry"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "shellViewModel"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, -0x1f76a27

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
    const/4 v9, 0x0

    .line 55
    if-eq v1, v2, :cond_4

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move v1, v9

    .line 60
    :goto_3
    and-int/lit8 v2, p2, 0x1

    .line 61
    .line 62
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_12

    .line 67
    .line 68
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    const/4 v1, -0x1

    .line 75
    const-string v2, "com.zykj.mistake.feature.collection.detail.CollectionDetailRoute (CollectionDetailRoute.kt:19)"

    .line 76
    .line 77
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    const-class v0, Lu4/c;

    .line 81
    .line 82
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {p0, v0}, Landroidx/navigation/NavBackStackEntryKt;->toRoute(Landroidx/navigation/NavBackStackEntry;Ly6/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lu4/c;

    .line 91
    .line 92
    and-int/lit8 v1, p2, 0xe

    .line 93
    .line 94
    move-object v6, v5

    .line 95
    invoke-interface {p0}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    const-class v2, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 100
    .line 101
    invoke-static {v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    shl-int/lit8 v1, v1, 0x3

    .line 106
    .line 107
    and-int/lit8 v7, v1, 0x70

    .line 108
    .line 109
    const/4 v8, 0x0

    .line 110
    const/4 v3, 0x0

    .line 111
    const/4 v4, 0x0

    .line 112
    move-object v1, v2

    .line 113
    move-object v2, p0

    .line 114
    invoke-static/range {v1 .. v8}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ly6/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    move-object v8, v2

    .line 119
    check-cast p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 120
    .line 121
    sget-object v1, Lz4/d;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 122
    .line 123
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    move-object v10, v1

    .line 128
    check-cast v10, Lz4/c;

    .line 129
    .line 130
    sget-object v1, Lt4/d;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 131
    .line 132
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    move-object v11, v1

    .line 137
    check-cast v11, Lt4/e;

    .line 138
    .line 139
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->d:Lkotlinx/coroutines/flow/a0;

    .line 140
    .line 141
    move-object v5, v6

    .line 142
    const/4 v6, 0x0

    .line 143
    const/4 v7, 0x7

    .line 144
    const/4 v2, 0x0

    .line 145
    invoke-static/range {v1 .. v7}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    move-object v6, v5

    .line 150
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    or-int/2addr v2, v3

    .line 159
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    if-nez v2, :cond_6

    .line 164
    .line 165
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 166
    .line 167
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    if-ne v3, v2, :cond_7

    .line 172
    .line 173
    :cond_6
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;

    .line 174
    .line 175
    invoke-direct {v3, p0, v0, v4}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$1$1;-><init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lu4/c;Lh6/c;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_7
    check-cast v3, Lr6/e;

    .line 182
    .line 183
    invoke-static {v0, v3, v6, v9}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    or-int/2addr v0, v2

    .line 195
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    if-nez v0, :cond_8

    .line 200
    .line 201
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 202
    .line 203
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-ne v2, v0, :cond_9

    .line 208
    .line 209
    :cond_8
    new-instance v2, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$2$1;

    .line 210
    .line 211
    invoke-direct {v2, v8, p0, v4}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$2$1;-><init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lh6/c;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_9
    check-cast v2, Lr6/e;

    .line 218
    .line 219
    shl-int/lit8 v0, p2, 0x3

    .line 220
    .line 221
    and-int/lit8 v3, v0, 0x70

    .line 222
    .line 223
    invoke-static {p0, v8, v2, v6, v3}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 224
    .line 225
    .line 226
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    or-int/2addr v2, v5

    .line 235
    invoke-interface {v6, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    or-int/2addr v2, v5

    .line 240
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    if-nez v2, :cond_a

    .line 245
    .line 246
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 247
    .line 248
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    if-ne v5, v2, :cond_b

    .line 253
    .line 254
    :cond_a
    new-instance v5, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;

    .line 255
    .line 256
    invoke-direct {v5, v8, p0, v11, v4}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$3$1;-><init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lt4/e;Lh6/c;)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_b
    check-cast v5, Lr6/e;

    .line 263
    .line 264
    invoke-static {p0, v8, v5, v6, v3}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 265
    .line 266
    .line 267
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    or-int/2addr v2, v5

    .line 276
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    if-nez v2, :cond_c

    .line 281
    .line 282
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 283
    .line 284
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    if-ne v5, v2, :cond_d

    .line 289
    .line 290
    :cond_c
    new-instance v5, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$4$1;

    .line 291
    .line 292
    invoke-direct {v5, v8, p0, v4}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$4$1;-><init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lh6/c;)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_d
    check-cast v5, Lr6/e;

    .line 299
    .line 300
    invoke-static {p0, v8, v5, v6, v3}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    or-int/2addr v2, v5

    .line 312
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v5

    .line 316
    if-nez v2, :cond_e

    .line 317
    .line 318
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 319
    .line 320
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    if-ne v5, v2, :cond_f

    .line 325
    .line 326
    :cond_e
    new-instance v5, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$5$1;

    .line 327
    .line 328
    invoke-direct {v5, v8, p0, v4}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$5$1;-><init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lh6/c;)V

    .line 329
    .line 330
    .line 331
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    :cond_f
    check-cast v5, Lr6/e;

    .line 335
    .line 336
    invoke-static {p0, v8, v5, v6, v3}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 337
    .line 338
    .line 339
    shr-int/lit8 p2, p2, 0x3

    .line 340
    .line 341
    and-int/lit8 p2, p2, 0xe

    .line 342
    .line 343
    invoke-static {p1, p0, v6, p2}, Lcom/zykj/mistake/feature/collection/detail/a;->b(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 344
    .line 345
    .line 346
    and-int/lit16 p2, v0, 0x380

    .line 347
    .line 348
    invoke-static {p0, v10, p1, v6, p2}, Lcom/zykj/mistake/feature/collection/detail/a;->a(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Lz4/c;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object p2

    .line 355
    check-cast p2, Lcom/zykj/mistake/feature/collection/detail/z0;

    .line 356
    .line 357
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    if-nez v0, :cond_10

    .line 366
    .line 367
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 368
    .line 369
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    if-ne v1, v0, :cond_11

    .line 374
    .line 375
    :cond_10
    new-instance v1, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$6$1;

    .line 376
    .line 377
    invoke-direct {v1, p0}, Lcom/zykj/mistake/feature/collection/detail/CollectionDetailRouteKt$CollectionDetailRoute$6$1;-><init>(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_11
    check-cast v1, Ly6/e;

    .line 384
    .line 385
    check-cast v1, Lr6/c;

    .line 386
    .line 387
    invoke-static {p2, v1, v6, v9}, Lcom/zykj/mistake/feature/collection/detail/f1;->c(Lcom/zykj/mistake/feature/collection/detail/z0;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 388
    .line 389
    .line 390
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 391
    .line 392
    .line 393
    move-result p0

    .line 394
    if-eqz p0, :cond_13

    .line 395
    .line 396
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 397
    .line 398
    .line 399
    goto :goto_4

    .line 400
    :cond_12
    move-object v8, p0

    .line 401
    move-object v6, v5

    .line 402
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 403
    .line 404
    .line 405
    :cond_13
    :goto_4
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    if-eqz p0, :cond_14

    .line 410
    .line 411
    new-instance p2, Lcom/zykj/mistake/feature/collection/detail/b;

    .line 412
    .line 413
    const/4 v0, 0x0

    .line 414
    invoke-direct {p2, v8, p1, p3, v0}, Lcom/zykj/mistake/feature/collection/detail/b;-><init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/main/MainShellViewModel;II)V

    .line 415
    .line 416
    .line 417
    invoke-interface {p0, p2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 418
    .line 419
    .line 420
    :cond_14
    return-void
.end method

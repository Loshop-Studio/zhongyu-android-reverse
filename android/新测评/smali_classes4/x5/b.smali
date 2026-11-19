.class public abstract Lx5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lx5/b;->c(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 21

    .line 1
    move-object/from16 v3, p3

    .line 2
    .line 3
    move/from16 v0, p7

    .line 4
    .line 5
    const-string v1, "navController"

    .line 6
    .line 7
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v1, -0x6accbdb9

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p6

    .line 14
    .line 15
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v9

    .line 19
    and-int/lit8 v2, v0, 0x6

    .line 20
    .line 21
    move-wide/from16 v12, p0

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v9, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x2

    .line 34
    :goto_0
    or-int/2addr v2, v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v2, v0

    .line 37
    :goto_1
    and-int/lit8 v4, v0, 0x30

    .line 38
    .line 39
    move-object/from16 v14, p2

    .line 40
    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    invoke-interface {v9, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    const/16 v4, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v4, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v2, v4

    .line 55
    :cond_3
    and-int/lit16 v4, v0, 0x180

    .line 56
    .line 57
    if-nez v4, :cond_5

    .line 58
    .line 59
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    const/16 v4, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v4, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v2, v4

    .line 71
    :cond_5
    and-int/lit16 v4, v0, 0xc00

    .line 72
    .line 73
    if-nez v4, :cond_8

    .line 74
    .line 75
    and-int/lit8 v4, p8, 0x8

    .line 76
    .line 77
    if-nez v4, :cond_6

    .line 78
    .line 79
    move-object/from16 v4, p4

    .line 80
    .line 81
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_7

    .line 86
    .line 87
    const/16 v5, 0x800

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_6
    move-object/from16 v4, p4

    .line 91
    .line 92
    :cond_7
    const/16 v5, 0x400

    .line 93
    .line 94
    :goto_4
    or-int/2addr v2, v5

    .line 95
    goto :goto_5

    .line 96
    :cond_8
    move-object/from16 v4, p4

    .line 97
    .line 98
    :goto_5
    and-int/lit16 v5, v0, 0x6000

    .line 99
    .line 100
    if-nez v5, :cond_a

    .line 101
    .line 102
    and-int/lit8 v5, p8, 0x10

    .line 103
    .line 104
    move-object/from16 v15, p5

    .line 105
    .line 106
    if-nez v5, :cond_9

    .line 107
    .line 108
    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_9

    .line 113
    .line 114
    const/16 v5, 0x4000

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_9
    const/16 v5, 0x2000

    .line 118
    .line 119
    :goto_6
    or-int/2addr v2, v5

    .line 120
    goto :goto_7

    .line 121
    :cond_a
    move-object/from16 v15, p5

    .line 122
    .line 123
    :goto_7
    and-int/lit16 v5, v2, 0x2493

    .line 124
    .line 125
    const/16 v6, 0x2492

    .line 126
    .line 127
    const/4 v7, 0x0

    .line 128
    if-eq v5, v6, :cond_b

    .line 129
    .line 130
    const/4 v5, 0x1

    .line 131
    goto :goto_8

    .line 132
    :cond_b
    move v5, v7

    .line 133
    :goto_8
    and-int/lit8 v6, v2, 0x1

    .line 134
    .line 135
    invoke-interface {v9, v5, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_18

    .line 140
    .line 141
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 142
    .line 143
    .line 144
    and-int/lit8 v5, v0, 0x1

    .line 145
    .line 146
    const v16, -0xe001

    .line 147
    .line 148
    .line 149
    if-eqz v5, :cond_f

    .line 150
    .line 151
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_c

    .line 156
    .line 157
    goto :goto_9

    .line 158
    :cond_c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 159
    .line 160
    .line 161
    and-int/lit8 v5, p8, 0x8

    .line 162
    .line 163
    if-eqz v5, :cond_d

    .line 164
    .line 165
    and-int/lit16 v2, v2, -0x1c01

    .line 166
    .line 167
    :cond_d
    and-int/lit8 v5, p8, 0x10

    .line 168
    .line 169
    if-eqz v5, :cond_e

    .line 170
    .line 171
    and-int v2, v2, v16

    .line 172
    .line 173
    :cond_e
    move-object v5, v15

    .line 174
    goto/16 :goto_10

    .line 175
    .line 176
    :cond_f
    :goto_9
    and-int/lit8 v5, p8, 0x8

    .line 177
    .line 178
    const v6, 0x671a9c9b

    .line 179
    .line 180
    .line 181
    const-string v8, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 182
    .line 183
    const v10, 0x70b323c8

    .line 184
    .line 185
    .line 186
    if-eqz v5, :cond_12

    .line 187
    .line 188
    invoke-interface {v9, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 189
    .line 190
    .line 191
    sget-object v4, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 192
    .line 193
    sget v5, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 194
    .line 195
    invoke-virtual {v4, v9, v5}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    if-eqz v5, :cond_11

    .line 200
    .line 201
    move v4, v7

    .line 202
    invoke-static {v5, v9, v4}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 207
    .line 208
    .line 209
    instance-of v11, v5, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 210
    .line 211
    if-eqz v11, :cond_10

    .line 212
    .line 213
    move-object v11, v5

    .line 214
    check-cast v11, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 215
    .line 216
    invoke-interface {v11}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    :goto_a
    move/from16 v17, v10

    .line 221
    .line 222
    goto :goto_b

    .line 223
    :cond_10
    sget-object v11, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 224
    .line 225
    goto :goto_a

    .line 226
    :goto_b
    const v10, 0x9048

    .line 227
    .line 228
    .line 229
    move-object/from16 v18, v8

    .line 230
    .line 231
    move-object v8, v11

    .line 232
    const/4 v11, 0x0

    .line 233
    move/from16 v19, v4

    .line 234
    .line 235
    const-class v4, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;

    .line 236
    .line 237
    move/from16 v20, v6

    .line 238
    .line 239
    const/4 v6, 0x0

    .line 240
    move/from16 v0, v17

    .line 241
    .line 242
    move-object/from16 v1, v18

    .line 243
    .line 244
    invoke-static/range {v4 .. v11}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 249
    .line 250
    .line 251
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 252
    .line 253
    .line 254
    check-cast v4, Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;

    .line 255
    .line 256
    and-int/lit16 v2, v2, -0x1c01

    .line 257
    .line 258
    :goto_c
    move/from16 v17, v2

    .line 259
    .line 260
    move-object v2, v4

    .line 261
    goto :goto_d

    .line 262
    :cond_11
    move-object v1, v8

    .line 263
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 264
    .line 265
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    throw v0

    .line 269
    :cond_12
    move-object v1, v8

    .line 270
    move v0, v10

    .line 271
    goto :goto_c

    .line 272
    :goto_d
    and-int/lit8 v4, p8, 0x10

    .line 273
    .line 274
    if-eqz v4, :cond_15

    .line 275
    .line 276
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 277
    .line 278
    .line 279
    sget-object v0, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 280
    .line 281
    sget v4, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 282
    .line 283
    invoke-virtual {v0, v9, v4}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    if-eqz v5, :cond_14

    .line 288
    .line 289
    const/4 v4, 0x0

    .line 290
    invoke-static {v5, v9, v4}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    const v0, 0x671a9c9b

    .line 295
    .line 296
    .line 297
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 298
    .line 299
    .line 300
    instance-of v0, v5, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 301
    .line 302
    if-eqz v0, :cond_13

    .line 303
    .line 304
    move-object v0, v5

    .line 305
    check-cast v0, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 306
    .line 307
    invoke-interface {v0}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    :goto_e
    move-object v8, v0

    .line 312
    goto :goto_f

    .line 313
    :cond_13
    sget-object v0, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 314
    .line 315
    goto :goto_e

    .line 316
    :goto_f
    const v10, 0x9048

    .line 317
    .line 318
    .line 319
    const/4 v11, 0x0

    .line 320
    const-class v4, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;

    .line 321
    .line 322
    const/4 v6, 0x0

    .line 323
    invoke-static/range {v4 .. v11}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 328
    .line 329
    .line 330
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 331
    .line 332
    .line 333
    check-cast v0, Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;

    .line 334
    .line 335
    and-int v1, v17, v16

    .line 336
    .line 337
    move-object v5, v0

    .line 338
    move-object v4, v2

    .line 339
    move v2, v1

    .line 340
    goto :goto_10

    .line 341
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 342
    .line 343
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v0

    .line 347
    :cond_15
    move-object v4, v2

    .line 348
    move-object v5, v15

    .line 349
    move/from16 v2, v17

    .line 350
    .line 351
    :goto_10
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 352
    .line 353
    .line 354
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_16

    .line 359
    .line 360
    const/4 v0, -0x1

    .line 361
    const-string v1, "com.zykj.evaluation.ui.detail.correcting.CorrectingDetailPage (CorrectingDetailPage.kt:19)"

    .line 362
    .line 363
    const v6, -0x6accbdb9

    .line 364
    .line 365
    .line 366
    invoke-static {v6, v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 367
    .line 368
    .line 369
    :cond_16
    const v0, 0xfffe

    .line 370
    .line 371
    .line 372
    and-int v15, v2, v0

    .line 373
    .line 374
    const/16 v16, 0x0

    .line 375
    .line 376
    const/16 v17, 0x1fe0

    .line 377
    .line 378
    const/4 v6, 0x0

    .line 379
    const/4 v7, 0x0

    .line 380
    const/4 v8, 0x0

    .line 381
    move-object v14, v9

    .line 382
    const/4 v9, 0x0

    .line 383
    const/4 v10, 0x0

    .line 384
    const/4 v11, 0x0

    .line 385
    const/4 v12, 0x0

    .line 386
    const/4 v13, 0x0

    .line 387
    move-wide/from16 v0, p0

    .line 388
    .line 389
    move-object/from16 v2, p2

    .line 390
    .line 391
    invoke-static/range {v0 .. v17}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->m0(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    .line 392
    .line 393
    .line 394
    move-object v9, v14

    .line 395
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-eqz v0, :cond_17

    .line 400
    .line 401
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 402
    .line 403
    .line 404
    :cond_17
    move-object v6, v5

    .line 405
    :goto_11
    move-object v5, v4

    .line 406
    goto :goto_12

    .line 407
    :cond_18
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 408
    .line 409
    .line 410
    move-object v6, v15

    .line 411
    goto :goto_11

    .line 412
    :goto_12
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    if-eqz v9, :cond_19

    .line 417
    .line 418
    new-instance v0, Lx5/a;

    .line 419
    .line 420
    move-wide/from16 v1, p0

    .line 421
    .line 422
    move-object/from16 v3, p2

    .line 423
    .line 424
    move-object/from16 v4, p3

    .line 425
    .line 426
    move/from16 v7, p7

    .line 427
    .line 428
    move/from16 v8, p8

    .line 429
    .line 430
    invoke-direct/range {v0 .. v8}, Lx5/a;-><init>(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;II)V

    .line 431
    .line 432
    .line 433
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 434
    .line 435
    .line 436
    :cond_19
    return-void
.end method

.method public static final c(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    move-wide v1, p0

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    move-object v6, p5

    .line 12
    move/from16 v9, p7

    .line 13
    .line 14
    move-object/from16 v7, p8

    .line 15
    .line 16
    invoke-static/range {v1 .. v9}, Lx5/b;->b(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;Landroidx/compose/runtime/Composer;II)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0
.end method

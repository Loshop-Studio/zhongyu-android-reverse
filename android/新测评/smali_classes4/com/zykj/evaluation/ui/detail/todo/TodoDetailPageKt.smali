# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public abstract Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JLcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;Landroidx/navigation/NavController;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->k(JLcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;Landroidx/navigation/NavController;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->n(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->o(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->m(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->s(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->r(Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->j(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->l(Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 22

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move/from16 v4, p8

    .line 8
    .line 9
    const-string v5, "navController"

    .line 10
    .line 11
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v5, "onClickOpenBoard"

    .line 15
    .line 16
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v5, -0x65f991

    .line 20
    .line 21
    .line 22
    move-object/from16 v6, p7

    .line 23
    .line 24
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v11

    .line 28
    and-int/lit8 v6, v4, 0x6

    .line 29
    .line 30
    if-nez v6, :cond_1

    .line 31
    .line 32
    invoke-interface {v11, v0, v1}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    const/4 v6, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v6, 0x2

    .line 41
    :goto_0
    or-int/2addr v6, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v6, v4

    .line 44
    :goto_1
    and-int/lit8 v7, v4, 0x30

    .line 45
    .line 46
    if-nez v7, :cond_3

    .line 47
    .line 48
    move-object/from16 v7, p2

    .line 49
    .line 50
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_2

    .line 55
    .line 56
    const/16 v8, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/16 v8, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v6, v8

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move-object/from16 v7, p2

    .line 64
    .line 65
    :goto_3
    and-int/lit16 v8, v4, 0x180

    .line 66
    .line 67
    if-nez v8, :cond_5

    .line 68
    .line 69
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_4

    .line 74
    .line 75
    const/16 v8, 0x100

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    const/16 v8, 0x80

    .line 79
    .line 80
    :goto_4
    or-int/2addr v6, v8

    .line 81
    :cond_5
    and-int/lit16 v8, v4, 0xc00

    .line 82
    .line 83
    const/16 v9, 0x800

    .line 84
    .line 85
    if-nez v8, :cond_7

    .line 86
    .line 87
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_6

    .line 92
    .line 93
    move v8, v9

    .line 94
    goto :goto_5

    .line 95
    :cond_6
    const/16 v8, 0x400

    .line 96
    .line 97
    :goto_5
    or-int/2addr v6, v8

    .line 98
    :cond_7
    and-int/lit16 v8, v4, 0x6000

    .line 99
    .line 100
    if-nez v8, :cond_a

    .line 101
    .line 102
    and-int/lit8 v8, p9, 0x10

    .line 103
    .line 104
    if-nez v8, :cond_8

    .line 105
    .line 106
    move-object/from16 v8, p5

    .line 107
    .line 108
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    if-eqz v10, :cond_9

    .line 113
    .line 114
    const/16 v10, 0x4000

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_8
    move-object/from16 v8, p5

    .line 118
    .line 119
    :cond_9
    const/16 v10, 0x2000

    .line 120
    .line 121
    :goto_6
    or-int/2addr v6, v10

    .line 122
    goto :goto_7

    .line 123
    :cond_a
    move-object/from16 v8, p5

    .line 124
    .line 125
    :goto_7
    const/high16 v10, 0x30000

    .line 126
    .line 127
    and-int/2addr v10, v4

    .line 128
    if-nez v10, :cond_d

    .line 129
    .line 130
    and-int/lit8 v10, p9, 0x20

    .line 131
    .line 132
    if-nez v10, :cond_b

    .line 133
    .line 134
    move-object/from16 v10, p6

    .line 135
    .line 136
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    if-eqz v12, :cond_c

    .line 141
    .line 142
    const/high16 v12, 0x20000

    .line 143
    .line 144
    goto :goto_8

    .line 145
    :cond_b
    move-object/from16 v10, p6

    .line 146
    .line 147
    :cond_c
    const/high16 v12, 0x10000

    .line 148
    .line 149
    :goto_8
    or-int/2addr v6, v12

    .line 150
    :goto_9
    move/from16 v16, v6

    .line 151
    .line 152
    goto :goto_a

    .line 153
    :cond_d
    move-object/from16 v10, p6

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :goto_a
    const v6, 0x12493

    .line 157
    .line 158
    .line 159
    and-int v6, v16, v6

    .line 160
    .line 161
    const v12, 0x12492

    .line 162
    .line 163
    .line 164
    const/4 v13, 0x0

    .line 165
    const/16 v17, 0x1

    .line 166
    .line 167
    if-eq v6, v12, :cond_e

    .line 168
    .line 169
    move/from16 v6, v17

    .line 170
    .line 171
    goto :goto_b

    .line 172
    :cond_e
    move v6, v13

    .line 173
    :goto_b
    and-int/lit8 v12, v16, 0x1

    .line 174
    .line 175
    invoke-interface {v11, v6, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    if-eqz v6, :cond_27

    .line 180
    .line 181
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 182
    .line 183
    .line 184
    and-int/lit8 v6, v4, 0x1

    .line 185
    .line 186
    const v18, -0x70001

    .line 187
    .line 188
    .line 189
    const v19, -0xe001

    .line 190
    .line 191
    .line 192
    if-eqz v6, :cond_12

    .line 193
    .line 194
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-eqz v6, :cond_f

    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 202
    .line 203
    .line 204
    and-int/lit8 v6, p9, 0x10

    .line 205
    .line 206
    if-eqz v6, :cond_10

    .line 207
    .line 208
    and-int v16, v16, v19

    .line 209
    .line 210
    :cond_10
    and-int/lit8 v6, p9, 0x20

    .line 211
    .line 212
    if-eqz v6, :cond_11

    .line 213
    .line 214
    and-int v16, v16, v18

    .line 215
    .line 216
    :cond_11
    move-object v5, v10

    .line 217
    move/from16 v21, v13

    .line 218
    .line 219
    move/from16 v7, v16

    .line 220
    .line 221
    goto/16 :goto_12

    .line 222
    .line 223
    :cond_12
    :goto_c
    and-int/lit8 v6, p9, 0x10

    .line 224
    .line 225
    const v12, 0x671a9c9b

    .line 226
    .line 227
    .line 228
    const-string v15, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 229
    .line 230
    const v14, 0x70b323c8

    .line 231
    .line 232
    .line 233
    if-eqz v6, :cond_15

    .line 234
    .line 235
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 236
    .line 237
    .line 238
    sget-object v6, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 239
    .line 240
    sget v8, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 241
    .line 242
    invoke-virtual {v6, v11, v8}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    if-eqz v6, :cond_14

    .line 247
    .line 248
    move v8, v9

    .line 249
    invoke-static {v6, v11, v13}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 254
    .line 255
    .line 256
    instance-of v8, v6, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 257
    .line 258
    if-eqz v8, :cond_13

    .line 259
    .line 260
    move-object v8, v6

    .line 261
    check-cast v8, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 262
    .line 263
    invoke-interface {v8}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    :goto_d
    move/from16 v20, v12

    .line 268
    .line 269
    goto :goto_e

    .line 270
    :cond_13
    sget-object v8, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 271
    .line 272
    goto :goto_d

    .line 273
    :goto_e
    const v12, 0x9048

    .line 274
    .line 275
    .line 276
    move/from16 v21, v13

    .line 277
    .line 278
    const/4 v13, 0x0

    .line 279
    move-object v7, v6

    .line 280
    const-class v6, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 281
    .line 282
    move-object v10, v8

    .line 283
    const/4 v8, 0x0

    .line 284
    move/from16 v5, v21

    .line 285
    .line 286
    invoke-static/range {v6 .. v13}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 291
    .line 292
    .line 293
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 294
    .line 295
    .line 296
    check-cast v6, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;

    .line 297
    .line 298
    and-int v16, v16, v19

    .line 299
    .line 300
    move/from16 v19, v16

    .line 301
    .line 302
    move-object/from16 v16, v6

    .line 303
    .line 304
    goto :goto_f

    .line 305
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 306
    .line 307
    invoke-direct {v0, v15}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :cond_15
    move v5, v13

    .line 312
    move/from16 v19, v16

    .line 313
    .line 314
    move-object/from16 v16, v8

    .line 315
    .line 316
    :goto_f
    and-int/lit8 v6, p9, 0x20

    .line 317
    .line 318
    if-eqz v6, :cond_18

    .line 319
    .line 320
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 321
    .line 322
    .line 323
    sget-object v6, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 324
    .line 325
    sget v7, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    .line 326
    .line 327
    invoke-virtual {v6, v11, v7}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    if-eqz v7, :cond_17

    .line 332
    .line 333
    invoke-static {v7, v11, v5}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 334
    .line 335
    .line 336
    move-result-object v9

    .line 337
    const v6, 0x671a9c9b

    .line 338
    .line 339
    .line 340
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 341
    .line 342
    .line 343
    instance-of v6, v7, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 344
    .line 345
    if-eqz v6, :cond_16

    .line 346
    .line 347
    move-object v6, v7

    .line 348
    check-cast v6, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 349
    .line 350
    invoke-interface {v6}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    :goto_10
    move-object v10, v6

    .line 355
    goto :goto_11

    .line 356
    :cond_16
    sget-object v6, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 357
    .line 358
    goto :goto_10

    .line 359
    :goto_11
    const v12, 0x9048

    .line 360
    .line 361
    .line 362
    const/4 v13, 0x0

    .line 363
    const-class v6, Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;

    .line 364
    .line 365
    const/4 v8, 0x0

    .line 366
    invoke-static/range {v6 .. v13}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 367
    .line 368
    .line 369
    move-result-object v6

    .line 370
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 371
    .line 372
    .line 373
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 374
    .line 375
    .line 376
    check-cast v6, Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;

    .line 377
    .line 378
    and-int v7, v19, v18

    .line 379
    .line 380
    move/from16 v21, v5

    .line 381
    .line 382
    move-object v5, v6

    .line 383
    move-object/from16 v8, v16

    .line 384
    .line 385
    goto :goto_12

    .line 386
    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 387
    .line 388
    invoke-direct {v0, v15}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v0

    .line 392
    :cond_18
    move/from16 v21, v5

    .line 393
    .line 394
    move-object/from16 v8, v16

    .line 395
    .line 396
    move/from16 v7, v19

    .line 397
    .line 398
    move-object/from16 v5, p6

    .line 399
    .line 400
    :goto_12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 401
    .line 402
    .line 403
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    if-eqz v6, :cond_19

    .line 408
    .line 409
    const/4 v6, -0x1

    .line 410
    const-string v9, "com.zykj.evaluation.ui.detail.todo.TodoDetailPage (TodoDetailPage.kt:31)"

    .line 411
    .line 412
    const v10, -0x65f991

    .line 413
    .line 414
    .line 415
    invoke-static {v10, v7, v6, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 416
    .line 417
    .line 418
    :cond_19
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 419
    .line 420
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v9

    .line 424
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    or-int/2addr v9, v10

    .line 429
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v10

    .line 433
    if-nez v9, :cond_1a

    .line 434
    .line 435
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 436
    .line 437
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    if-ne v10, v9, :cond_1b

    .line 442
    .line 443
    :cond_1a
    new-instance v10, Le6/a;

    .line 444
    .line 445
    invoke-direct {v10, v3, v8}, Le6/a;-><init>(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)V

    .line 446
    .line 447
    .line 448
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    :cond_1b
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 452
    .line 453
    const/4 v9, 0x6

    .line 454
    invoke-static {v6, v10, v11, v9}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    .line 455
    .line 456
    .line 457
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 462
    .line 463
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v10

    .line 467
    if-ne v6, v10, :cond_1c

    .line 468
    .line 469
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 470
    .line 471
    const/4 v10, 0x0

    .line 472
    const/4 v12, 0x2

    .line 473
    invoke-static {v6, v10, v12, v10}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :cond_1c
    check-cast v6, Landroidx/compose/runtime/MutableState;

    .line 481
    .line 482
    and-int/lit16 v10, v7, 0x1c00

    .line 483
    .line 484
    const/16 v12, 0x800

    .line 485
    .line 486
    if-ne v10, v12, :cond_1d

    .line 487
    .line 488
    move/from16 v13, v17

    .line 489
    .line 490
    goto :goto_13

    .line 491
    :cond_1d
    move/from16 v13, v21

    .line 492
    .line 493
    :goto_13
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    or-int/2addr v10, v13

    .line 498
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v12

    .line 502
    if-nez v10, :cond_1e

    .line 503
    .line 504
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    if-ne v12, v10, :cond_1f

    .line 509
    .line 510
    :cond_1e
    new-instance v12, Le6/b;

    .line 511
    .line 512
    invoke-direct {v12, v2, v8, v6}, Le6/b;-><init>(Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/compose/runtime/MutableState;)V

    .line 513
    .line 514
    .line 515
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    :cond_1f
    check-cast v12, Lkotlin/jvm/functions/Function4;

    .line 519
    .line 520
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v10

    .line 524
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v13

    .line 528
    if-nez v10, :cond_20

    .line 529
    .line 530
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v10

    .line 534
    if-ne v13, v10, :cond_21

    .line 535
    .line 536
    :cond_20
    new-instance v13, Le6/c;

    .line 537
    .line 538
    invoke-direct {v13, v8}, Le6/c;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;)V

    .line 539
    .line 540
    .line 541
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    :cond_21
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 545
    .line 546
    and-int/lit8 v10, v7, 0xe

    .line 547
    .line 548
    const/4 v14, 0x4

    .line 549
    if-ne v10, v14, :cond_22

    .line 550
    .line 551
    move/from16 v21, v17

    .line 552
    .line 553
    :cond_22
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v10

    .line 557
    or-int v10, v21, v10

    .line 558
    .line 559
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v14

    .line 563
    or-int/2addr v10, v14

    .line 564
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v14

    .line 568
    if-nez v10, :cond_23

    .line 569
    .line 570
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v10

    .line 574
    if-ne v14, v10, :cond_24

    .line 575
    .line 576
    :cond_23
    new-instance v14, Le6/d;

    .line 577
    .line 578
    invoke-direct {v14, v0, v1, v5, v3}, Le6/d;-><init>(JLcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;Landroidx/navigation/NavController;)V

    .line 579
    .line 580
    .line 581
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    :cond_24
    move-object v10, v14

    .line 585
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 586
    .line 587
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v14

    .line 591
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v9

    .line 595
    if-ne v14, v9, :cond_25

    .line 596
    .line 597
    new-instance v14, Le6/e;

    .line 598
    .line 599
    invoke-direct {v14, v6}, Le6/e;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 600
    .line 601
    .line 602
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    :cond_25
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 606
    .line 607
    and-int/lit16 v6, v7, 0x3fe

    .line 608
    .line 609
    shr-int/lit8 v7, v7, 0x3

    .line 610
    .line 611
    and-int/lit16 v9, v7, 0x1c00

    .line 612
    .line 613
    or-int/2addr v6, v9

    .line 614
    const v9, 0xe000

    .line 615
    .line 616
    .line 617
    and-int/2addr v7, v9

    .line 618
    or-int v15, v6, v7

    .line 619
    .line 620
    const/16 v16, 0x180

    .line 621
    .line 622
    const/16 v17, 0xd80

    .line 623
    .line 624
    move-object v4, v8

    .line 625
    const/4 v8, 0x0

    .line 626
    const/4 v9, 0x0

    .line 627
    move-object v7, v13

    .line 628
    move-object v13, v14

    .line 629
    move-object v14, v11

    .line 630
    const/4 v11, 0x0

    .line 631
    move-object v6, v12

    .line 632
    const/4 v12, 0x0

    .line 633
    move-object/from16 v2, p2

    .line 634
    .line 635
    invoke-static/range {v0 .. v17}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->m0(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    .line 636
    .line 637
    .line 638
    move-object v11, v14

    .line 639
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    if-eqz v0, :cond_26

    .line 644
    .line 645
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 646
    .line 647
    .line 648
    :cond_26
    move-object v6, v4

    .line 649
    move-object v7, v5

    .line 650
    goto :goto_14

    .line 651
    :cond_27
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 652
    .line 653
    .line 654
    move-object/from16 v7, p6

    .line 655
    .line 656
    move-object v6, v8

    .line 657
    :goto_14
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 658
    .line 659
    .line 660
    move-result-object v10

    .line 661
    if-eqz v10, :cond_28

    .line 662
    .line 663
    new-instance v0, Le6/f;

    .line 664
    .line 665
    move-wide/from16 v1, p0

    .line 666
    .line 667
    move-object/from16 v3, p2

    .line 668
    .line 669
    move-object/from16 v4, p3

    .line 670
    .line 671
    move-object/from16 v5, p4

    .line 672
    .line 673
    move/from16 v8, p8

    .line 674
    .line 675
    move/from16 v9, p9

    .line 676
    .line 677
    invoke-direct/range {v0 .. v9}, Le6/f;-><init>(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;II)V

    .line 678
    .line 679
    .line 680
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 681
    .line 682
    .line 683
    :cond_28
    return-void
.end method

.method public static final j(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "uuid"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localAnswer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->N0(Ljava/lang/String;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

# RE I/O 写入 JSON（Gson.toJson）。
.method public static final k(JLcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;Landroidx/navigation/NavController;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 16

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    const-string v1, "uuid"

    .line 4
    .line 5
    move-object/from16 v11, p4

    .line 6
    .line 7
    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "path"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lg7/b;->a()Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v15, Lcom/google/gson/Gson;

    .line 20
    .line 21
    invoke-direct {v15}, Lcom/google/gson/Gson;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;

    .line 25
    .line 26
    invoke-virtual/range {p2 .. p2}, Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;->r()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    new-instance v6, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, "/"

    .line 43
    .line 44
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, ".webp"

    .line 51
    .line 52
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v12

    .line 59
    const/16 v13, 0x3c

    .line 60
    .line 61
    const/4 v14, 0x0

    .line 62
    const/4 v6, 0x0

    .line 63
    const-wide/16 v7, 0x0

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v10, 0x0

    .line 67
    move-wide/from16 v3, p0

    .line 68
    .line 69
    invoke-direct/range {v2 .. v14}, Lcom/zykj/evaluation/bean/bundle/AnswerSheetBundle;-><init>(JILjava/lang/String;JIZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v15, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v2, "ANSWER_SHEET_KEY_BUNDLE"

    .line 77
    .line 78
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 v7, 0x6

    .line 82
    const/4 v8, 0x0

    .line 83
    const-string v4, "ANSWER_SHEET_COMPOSITION"

    .line 84
    .line 85
    const/4 v5, 0x0

    .line 86
    move-object/from16 v3, p3

    .line 87
    .line 88
    invoke-static/range {v3 .. v8}, Landroidx/navigation/NavController;->navigate$default(Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 92
    .line 93
    return-object v0
.end method

.method public static final l(Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->q(Landroidx/compose/runtime/MutableState;Z)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final m(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 11

    .line 1
    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v9

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->i(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toDo/TodoGuideViewModel;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final n(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;
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
    new-instance v1, Le6/h;

    .line 20
    .line 21
    invoke-direct {v1, p1, p2}, Le6/h;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/lifecycle/SavedStateHandle;)V

    .line 22
    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    const-string p1, "ANSWER_SHEET_RESULT_ANSWER_DATA"

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
    new-instance p0, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt$TodoDetailPage$lambda$3$lambda$2$$inlined$onDispose$1;

    .line 45
    .line 46
    invoke-direct {p0, v0, v1}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt$TodoDetailPage$lambda$3$lambda$2$$inlined$onDispose$1;-><init>(Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/Observer;)V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public static final o(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/google/gson/Gson;

    .line 4
    .line 5
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 6
    .line 7
    .line 8
    const-class v1, Lcom/zykj/evaluation/bean/bundle/AnswerData;

    .line 9
    .line 10
    invoke-virtual {v0, p2, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Lcom/zykj/evaluation/bean/bundle/AnswerData;

    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/zykj/evaluation/bean/bundle/AnswerData;->getUuid()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p2}, Lcom/zykj/evaluation/bean/bundle/AnswerData;->getAnswerPath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p0, v0, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->N0(Ljava/lang/String;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const-string p0, "ANSWER_SHEET_RESULT_ANSWER_DATA"

    .line 34
    .line 35
    const/4 p2, 0x0

    .line 36
    invoke-virtual {p1, p0, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public static final p(Landroidx/compose/runtime/MutableState;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final q(Landroidx/compose/runtime/MutableState;Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final r(Lkotlin/jvm/functions/Function6;Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "uuid"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "stemSketchPath"

    .line 12
    .line 13
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p5

    .line 20
    move-object v0, p1

    .line 21
    move-object p1, p3

    .line 22
    move-object p3, p5

    .line 23
    new-instance p5, Le6/g;

    .line 24
    .line 25
    invoke-direct {p5, v0, p1}, Le6/g;-><init>(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailPageKt;->p(Landroidx/compose/runtime/MutableState;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    move-object v1, p6

    .line 37
    move-object p6, p2

    .line 38
    move-object p2, p4

    .line 39
    move-object p4, v1

    .line 40
    invoke-interface/range {p0 .. p6}, Lkotlin/jvm/functions/Function6;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0
.end method

.method public static final s(Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const-string p2, ""

    .line 4
    .line 5
    :cond_0
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/todo/TodoDetailViewModel;->N0(Ljava/lang/String;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

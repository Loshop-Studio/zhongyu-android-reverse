.class public final synthetic Lcom/zykj/mistake/feature/collection/list/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ld6/d;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ld6/d;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/zykj/mistake/feature/collection/list/y;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/list/y;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/list/y;->e:Ljava/lang/Object;

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/list/y;->c:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/list/y;->d:Ld6/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/feature/collection/list/y;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/list/y;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lr6/a;

    .line 11
    .line 12
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/list/y;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lcom/zykj/mistake/main/a1;

    .line 15
    .line 16
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/list/y;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 19
    .line 20
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/list/y;->d:Ld6/d;

    .line 21
    .line 22
    check-cast v4, Lr6/e;

    .line 23
    .line 24
    move-object/from16 v5, p1

    .line 25
    .line 26
    check-cast v5, Landroidx/compose/foundation/layout/FlowRowScope;

    .line 27
    .line 28
    move-object/from16 v10, p2

    .line 29
    .line 30
    check-cast v10, Landroidx/compose/runtime/Composer;

    .line 31
    .line 32
    move-object/from16 v6, p3

    .line 33
    .line 34
    check-cast v6, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const-string v7, "$this$FlowRow"

    .line 41
    .line 42
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    and-int/lit8 v5, v6, 0x11

    .line 46
    .line 47
    const/16 v7, 0x10

    .line 48
    .line 49
    const/4 v13, 0x1

    .line 50
    const/4 v14, 0x0

    .line 51
    if-eq v5, v7, :cond_0

    .line 52
    .line 53
    move v5, v13

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v5, v14

    .line 56
    :goto_0
    and-int/lit8 v7, v6, 0x1

    .line 57
    .line 58
    invoke-interface {v10, v5, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_a

    .line 63
    .line 64
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    const/4 v5, -0x1

    .line 71
    const-string v7, "com.zykj.mistake.main.drawer.MistakeTagEditorPanel.<anonymous>.<anonymous>.<anonymous> (MistakeTagEditorPanel.kt:159)"

    .line 72
    .line 73
    const v8, 0x70074a40

    .line 74
    .line 75
    .line 76
    invoke-static {v8, v6, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    invoke-static {v1, v10, v14}, Lcom/zykj/mistake/main/drawer/l;->c(Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 80
    .line 81
    .line 82
    iget-object v1, v2, Lcom/zykj/mistake/main/a1;->b:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_9

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 99
    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_3

    .line 107
    .line 108
    :cond_2
    move v7, v14

    .line 109
    goto :goto_2

    .line 110
    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_2

    .line 119
    .line 120
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    check-cast v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 125
    .line 126
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 127
    .line 128
    .line 129
    move-result-wide v7

    .line 130
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 131
    .line 132
    .line 133
    move-result-wide v11

    .line 134
    cmp-long v7, v7, v11

    .line 135
    .line 136
    if-nez v7, :cond_4

    .line 137
    .line 138
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-ne v6, v7, :cond_4

    .line 147
    .line 148
    move v7, v13

    .line 149
    :goto_2
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    or-int/2addr v5, v8

    .line 162
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    if-nez v5, :cond_5

    .line 167
    .line 168
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 169
    .line 170
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    if-ne v8, v5, :cond_6

    .line 175
    .line 176
    :cond_5
    new-instance v8, Landroidx/navigation/e;

    .line 177
    .line 178
    const/16 v5, 0x13

    .line 179
    .line 180
    invoke-direct {v8, v5, v3, v2}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    check-cast v8, Lr6/a;

    .line 187
    .line 188
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    or-int/2addr v5, v9

    .line 197
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    if-nez v5, :cond_7

    .line 202
    .line 203
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 204
    .line 205
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    if-ne v9, v5, :cond_8

    .line 210
    .line 211
    :cond_7
    new-instance v9, Lcom/zykj/mistake/main/drawer/h;

    .line 212
    .line 213
    const/4 v5, 0x1

    .line 214
    invoke-direct {v9, v4, v2, v5}, Lcom/zykj/mistake/main/drawer/h;-><init>(Lr6/e;Lcom/zykj/mistake/entity/resp/CustomTagInfo;I)V

    .line 215
    .line 216
    .line 217
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_8
    check-cast v9, Lr6/a;

    .line 221
    .line 222
    const/4 v11, 0x0

    .line 223
    const/4 v12, 0x0

    .line 224
    invoke-static/range {v6 .. v12}, Lcom/zykj/mistake/main/drawer/l;->d(Ljava/lang/String;ZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-eqz v1, :cond_b

    .line 234
    .line 235
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 240
    .line 241
    .line 242
    :cond_b
    :goto_3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 243
    .line 244
    return-object v1

    .line 245
    :pswitch_0
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/list/y;->b:Ljava/lang/Object;

    .line 246
    .line 247
    move-object v4, v1

    .line 248
    check-cast v4, Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 249
    .line 250
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/list/y;->e:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 253
    .line 254
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/list/y;->c:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v2, Lr6/c;

    .line 257
    .line 258
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/list/y;->d:Ld6/d;

    .line 259
    .line 260
    check-cast v3, Lr6/c;

    .line 261
    .line 262
    move-object/from16 v5, p1

    .line 263
    .line 264
    check-cast v5, Landroidx/compose/foundation/layout/BoxScope;

    .line 265
    .line 266
    move-object/from16 v13, p2

    .line 267
    .line 268
    check-cast v13, Landroidx/compose/runtime/Composer;

    .line 269
    .line 270
    move-object/from16 v6, p3

    .line 271
    .line 272
    check-cast v6, Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    const-string v7, "$this$PullToRefreshBox"

    .line 279
    .line 280
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    and-int/lit8 v5, v6, 0x11

    .line 284
    .line 285
    const/4 v7, 0x1

    .line 286
    const/16 v8, 0x10

    .line 287
    .line 288
    if-eq v5, v8, :cond_c

    .line 289
    .line 290
    move v5, v7

    .line 291
    goto :goto_4

    .line 292
    :cond_c
    const/4 v5, 0x0

    .line 293
    :goto_4
    and-int/lit8 v9, v6, 0x1

    .line 294
    .line 295
    invoke-interface {v13, v5, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 296
    .line 297
    .line 298
    move-result v5

    .line 299
    if-eqz v5, :cond_10

    .line 300
    .line 301
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    if-eqz v5, :cond_d

    .line 306
    .line 307
    const/4 v5, -0x1

    .line 308
    const-string v9, "com.zykj.mistake.feature.notebook.list.MistakeNotebookGrid.<anonymous> (MistakeNotebookScreen.kt:223)"

    .line 309
    .line 310
    const v10, 0x1594eefe

    .line 311
    .line 312
    .line 313
    invoke-static {v10, v6, v5, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 314
    .line 315
    .line 316
    :cond_d
    new-instance v5, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;

    .line 317
    .line 318
    const/4 v6, 0x3

    .line 319
    invoke-direct {v5, v6}, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;-><init>(I)V

    .line 320
    .line 321
    .line 322
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 323
    .line 324
    const/4 v9, 0x0

    .line 325
    const/4 v10, 0x0

    .line 326
    invoke-static {v6, v9, v7, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    int-to-float v7, v8

    .line 331
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    invoke-static {v7}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-0680j_4(F)Landroidx/compose/foundation/layout/PaddingValues;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 340
    .line 341
    const/16 v9, 0xc

    .line 342
    .line 343
    int-to-float v9, v9

    .line 344
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 345
    .line 346
    .line 347
    move-result v10

    .line 348
    invoke-virtual {v8, v10}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 349
    .line 350
    .line 351
    move-result-object v10

    .line 352
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 353
    .line 354
    .line 355
    move-result v9

    .line 356
    invoke-virtual {v8, v9}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    or-int/2addr v9, v11

    .line 369
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v11

    .line 373
    or-int/2addr v9, v11

    .line 374
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v11

    .line 378
    if-nez v9, :cond_e

    .line 379
    .line 380
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 381
    .line 382
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    if-ne v11, v9, :cond_f

    .line 387
    .line 388
    :cond_e
    new-instance v11, Landroidx/lifecycle/i;

    .line 389
    .line 390
    const/16 v9, 0xc

    .line 391
    .line 392
    invoke-direct {v11, v1, v2, v3, v9}, Landroidx/lifecycle/i;-><init>(Ljava/lang/Object;Lr6/c;Ld6/d;I)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    :cond_f
    move-object v12, v11

    .line 399
    check-cast v12, Lr6/c;

    .line 400
    .line 401
    const/4 v15, 0x0

    .line 402
    const/16 v16, 0x390

    .line 403
    .line 404
    move-object v3, v6

    .line 405
    const/4 v6, 0x0

    .line 406
    const/4 v9, 0x0

    .line 407
    move-object v2, v5

    .line 408
    move-object v5, v7

    .line 409
    move-object v7, v8

    .line 410
    move-object v8, v10

    .line 411
    const/4 v10, 0x0

    .line 412
    const/4 v11, 0x0

    .line 413
    const v14, 0x1b0c30

    .line 414
    .line 415
    .line 416
    invoke-static/range {v2 .. v16}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 417
    .line 418
    .line 419
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-eqz v1, :cond_11

    .line 424
    .line 425
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 426
    .line 427
    .line 428
    goto :goto_5

    .line 429
    :cond_10
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 430
    .line 431
    .line 432
    :cond_11
    :goto_5
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 433
    .line 434
    return-object v1

    .line 435
    :pswitch_1
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/list/y;->b:Ljava/lang/Object;

    .line 436
    .line 437
    move-object v4, v1

    .line 438
    check-cast v4, Landroidx/compose/foundation/lazy/grid/LazyGridState;

    .line 439
    .line 440
    iget-object v1, v0, Lcom/zykj/mistake/feature/collection/list/y;->e:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/v;

    .line 443
    .line 444
    iget-object v2, v0, Lcom/zykj/mistake/feature/collection/list/y;->c:Ljava/lang/Object;

    .line 445
    .line 446
    check-cast v2, Lr6/c;

    .line 447
    .line 448
    iget-object v3, v0, Lcom/zykj/mistake/feature/collection/list/y;->d:Ld6/d;

    .line 449
    .line 450
    check-cast v3, Lr6/c;

    .line 451
    .line 452
    move-object/from16 v5, p1

    .line 453
    .line 454
    check-cast v5, Landroidx/compose/foundation/layout/BoxScope;

    .line 455
    .line 456
    move-object/from16 v13, p2

    .line 457
    .line 458
    check-cast v13, Landroidx/compose/runtime/Composer;

    .line 459
    .line 460
    move-object/from16 v6, p3

    .line 461
    .line 462
    check-cast v6, Ljava/lang/Integer;

    .line 463
    .line 464
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    const-string v7, "$this$PullToRefreshBox"

    .line 469
    .line 470
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    and-int/lit8 v5, v6, 0x11

    .line 474
    .line 475
    const/4 v7, 0x1

    .line 476
    const/16 v8, 0x10

    .line 477
    .line 478
    if-eq v5, v8, :cond_12

    .line 479
    .line 480
    move v5, v7

    .line 481
    goto :goto_6

    .line 482
    :cond_12
    const/4 v5, 0x0

    .line 483
    :goto_6
    and-int/lit8 v9, v6, 0x1

    .line 484
    .line 485
    invoke-interface {v13, v5, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    if-eqz v5, :cond_16

    .line 490
    .line 491
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    if-eqz v5, :cond_13

    .line 496
    .line 497
    const/4 v5, -0x1

    .line 498
    const-string v9, "com.zykj.mistake.feature.collection.list.MistakeCollectionListContent.<anonymous> (MistakeCollectionScreen.kt:218)"

    .line 499
    .line 500
    const v10, 0x35f6151

    .line 501
    .line 502
    .line 503
    invoke-static {v10, v6, v5, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 504
    .line 505
    .line 506
    :cond_13
    new-instance v5, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;

    .line 507
    .line 508
    const/4 v6, 0x3

    .line 509
    invoke-direct {v5, v6}, Landroidx/compose/foundation/lazy/grid/GridCells$Fixed;-><init>(I)V

    .line 510
    .line 511
    .line 512
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 513
    .line 514
    const/4 v9, 0x0

    .line 515
    const/4 v10, 0x0

    .line 516
    invoke-static {v6, v9, v7, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 517
    .line 518
    .line 519
    move-result-object v14

    .line 520
    const-wide v6, 0xfff5f7faL

    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 526
    .line 527
    .line 528
    move-result-wide v15

    .line 529
    const/16 v18, 0x2

    .line 530
    .line 531
    const/16 v19, 0x0

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    const/16 v7, 0x12

    .line 540
    .line 541
    int-to-float v7, v7

    .line 542
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 543
    .line 544
    .line 545
    move-result v9

    .line 546
    int-to-float v8, v8

    .line 547
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 548
    .line 549
    .line 550
    move-result v10

    .line 551
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 552
    .line 553
    .line 554
    move-result v7

    .line 555
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 556
    .line 557
    .line 558
    move-result v8

    .line 559
    invoke-static {v9, v10, v7, v8}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4(FFFF)Landroidx/compose/foundation/layout/PaddingValues;

    .line 560
    .line 561
    .line 562
    move-result-object v7

    .line 563
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 564
    .line 565
    const/16 v9, 0xe

    .line 566
    .line 567
    int-to-float v9, v9

    .line 568
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 569
    .line 570
    .line 571
    move-result v10

    .line 572
    invoke-virtual {v8, v10}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 573
    .line 574
    .line 575
    move-result-object v10

    .line 576
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 577
    .line 578
    .line 579
    move-result v9

    .line 580
    invoke-virtual {v8, v9}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v9

    .line 588
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v11

    .line 592
    or-int/2addr v9, v11

    .line 593
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v11

    .line 597
    or-int/2addr v9, v11

    .line 598
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v11

    .line 602
    if-nez v9, :cond_14

    .line 603
    .line 604
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 605
    .line 606
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v9

    .line 610
    if-ne v11, v9, :cond_15

    .line 611
    .line 612
    :cond_14
    new-instance v11, Landroidx/lifecycle/i;

    .line 613
    .line 614
    const/4 v9, 0x7

    .line 615
    invoke-direct {v11, v1, v2, v3, v9}, Landroidx/lifecycle/i;-><init>(Ljava/lang/Object;Lr6/c;Ld6/d;I)V

    .line 616
    .line 617
    .line 618
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 619
    .line 620
    .line 621
    :cond_15
    move-object v12, v11

    .line 622
    check-cast v12, Lr6/c;

    .line 623
    .line 624
    const/4 v15, 0x0

    .line 625
    const/16 v16, 0x390

    .line 626
    .line 627
    move-object v3, v6

    .line 628
    const/4 v6, 0x0

    .line 629
    const/4 v9, 0x0

    .line 630
    move-object v2, v5

    .line 631
    move-object v5, v7

    .line 632
    move-object v7, v8

    .line 633
    move-object v8, v10

    .line 634
    const/4 v10, 0x0

    .line 635
    const/4 v11, 0x0

    .line 636
    const v14, 0x1b0c30

    .line 637
    .line 638
    .line 639
    invoke-static/range {v2 .. v16}, Landroidx/compose/foundation/lazy/grid/LazyGridDslKt;->LazyVerticalGrid(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 640
    .line 641
    .line 642
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    if-eqz v1, :cond_17

    .line 647
    .line 648
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 649
    .line 650
    .line 651
    goto :goto_7

    .line 652
    :cond_16
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 653
    .line 654
    .line 655
    :cond_17
    :goto_7
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 656
    .line 657
    return-object v1

    .line 658
    nop

    .line 659
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

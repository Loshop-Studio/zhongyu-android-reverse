.class public final synthetic Landroidx/navigation/serialization/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/serialization/b;->a:I

    iput-object p1, p0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/sync/a;Lh7/b;)V
    .locals 0

    .line 2
    const/16 p2, 0x8

    iput p2, p0, Landroidx/navigation/serialization/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/navigation/serialization/b;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lkotlinx/coroutines/sync/b;

    .line 11
    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Throwable;

    .line 15
    .line 16
    move-object/from16 v2, p2

    .line 17
    .line 18
    check-cast v2, Ld6/s;

    .line 19
    .line 20
    move-object/from16 v2, p3

    .line 21
    .line 22
    check-cast v2, Lh6/h;

    .line 23
    .line 24
    invoke-virtual {v1}, Lkotlinx/coroutines/sync/b;->c()V

    .line 25
    .line 26
    .line 27
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lkotlinx/coroutines/sync/a;

    .line 33
    .line 34
    move-object/from16 v2, p1

    .line 35
    .line 36
    check-cast v2, Ljava/lang/Throwable;

    .line 37
    .line 38
    move-object/from16 v2, p2

    .line 39
    .line 40
    check-cast v2, Ld6/s;

    .line 41
    .line 42
    move-object/from16 v2, p3

    .line 43
    .line 44
    check-cast v2, Lh6/h;

    .line 45
    .line 46
    sget-object v2, Lkotlinx/coroutines/sync/a;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v3}, Lkotlinx/coroutines/sync/a;->g(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_1
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;

    .line 61
    .line 62
    move-object/from16 v2, p1

    .line 63
    .line 64
    check-cast v2, Lcom/zykj/blackboard/core/edit/IBoardControl;

    .line 65
    .line 66
    move-object/from16 v3, p2

    .line 67
    .line 68
    check-cast v3, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    move-object/from16 v4, p3

    .line 75
    .line 76
    check-cast v4, Ljava/lang/Long;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    invoke-static {v1, v2, v3, v4, v5}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->B(Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Ld6/s;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    return-object v1

    .line 87
    :pswitch_2
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, Ljava/util/List;

    .line 90
    .line 91
    move-object/from16 v2, p1

    .line 92
    .line 93
    check-cast v2, Landroidx/compose/foundation/layout/FlowRowScope;

    .line 94
    .line 95
    move-object/from16 v9, p2

    .line 96
    .line 97
    check-cast v9, Landroidx/compose/runtime/Composer;

    .line 98
    .line 99
    move-object/from16 v3, p3

    .line 100
    .line 101
    check-cast v3, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    const-string v4, "$this$FlowRow"

    .line 108
    .line 109
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    and-int/lit8 v2, v3, 0x11

    .line 113
    .line 114
    const/16 v4, 0x10

    .line 115
    .line 116
    if-eq v2, v4, :cond_0

    .line 117
    .line 118
    const/4 v2, 0x1

    .line 119
    goto :goto_0

    .line 120
    :cond_0
    const/4 v2, 0x0

    .line 121
    :goto_0
    and-int/lit8 v4, v3, 0x1

    .line 122
    .line 123
    invoke-interface {v9, v2, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_3

    .line 128
    .line 129
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_1

    .line 134
    .line 135
    const/4 v2, -0x1

    .line 136
    const-string v4, "com.zykj.mistake.main.drawer.NotebookFilterSection.<anonymous> (MistakeNotebookFilterPanel.kt:248)"

    .line 137
    .line 138
    const v5, -0x1acd20d7

    .line 139
    .line 140
    .line 141
    invoke-static {v5, v3, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Lcom/zykj/mistake/main/drawer/m;

    .line 159
    .line 160
    iget-object v3, v2, Lcom/zykj/mistake/main/drawer/m;->a:Ljava/lang/String;

    .line 161
    .line 162
    iget-boolean v4, v2, Lcom/zykj/mistake/main/drawer/m;->b:Z

    .line 163
    .line 164
    iget-boolean v5, v2, Lcom/zykj/mistake/main/drawer/m;->c:Z

    .line 165
    .line 166
    iget-boolean v6, v2, Lcom/zykj/mistake/main/drawer/m;->d:Z

    .line 167
    .line 168
    iget-boolean v7, v2, Lcom/zykj/mistake/main/drawer/m;->e:Z

    .line 169
    .line 170
    iget-object v8, v2, Lcom/zykj/mistake/main/drawer/m;->f:Lr6/a;

    .line 171
    .line 172
    const/4 v10, 0x0

    .line 173
    invoke-static/range {v3 .. v10}, Lcom/zykj/mistake/main/drawer/g;->c(Ljava/lang/String;ZZZZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_4

    .line 182
    .line 183
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_3
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 188
    .line 189
    .line 190
    :cond_4
    :goto_2
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 191
    .line 192
    return-object v1

    .line 193
    :pswitch_3
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 194
    .line 195
    move-object v6, v1

    .line 196
    check-cast v6, Lr6/a;

    .line 197
    .line 198
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, Landroidx/compose/animation/AnimatedVisibilityScope;

    .line 201
    .line 202
    move-object/from16 v9, p2

    .line 203
    .line 204
    check-cast v9, Landroidx/compose/runtime/Composer;

    .line 205
    .line 206
    move-object/from16 v2, p3

    .line 207
    .line 208
    check-cast v2, Ljava/lang/Integer;

    .line 209
    .line 210
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    const-string v3, "$this$AnimatedVisibility"

    .line 215
    .line 216
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-eqz v1, :cond_5

    .line 224
    .line 225
    const/4 v1, -0x1

    .line 226
    const-string v3, "com.zykj.mistake.main.drawer.MainEndDrawerHost.<anonymous>.<anonymous> (MainEndDrawerHost.kt:50)"

    .line 227
    .line 228
    const v4, 0x3585ed6

    .line 229
    .line 230
    .line 231
    invoke-static {v4, v2, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_5
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 235
    .line 236
    const/4 v2, 0x1

    .line 237
    const/4 v3, 0x0

    .line 238
    const/4 v4, 0x0

    .line 239
    invoke-static {v1, v4, v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 244
    .line 245
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 246
    .line 247
    .line 248
    move-result-wide v11

    .line 249
    const/16 v17, 0xe

    .line 250
    .line 251
    const/16 v18, 0x0

    .line 252
    .line 253
    const v13, 0x3eb33333    # 0.35f

    .line 254
    .line 255
    .line 256
    const/4 v14, 0x0

    .line 257
    const/4 v15, 0x0

    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    invoke-static/range {v11 .. v18}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 261
    .line 262
    .line 263
    move-result-wide v11

    .line 264
    const/4 v14, 0x2

    .line 265
    const/4 v15, 0x0

    .line 266
    const/4 v13, 0x0

    .line 267
    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    const/4 v7, 0x7

    .line 272
    const/4 v8, 0x0

    .line 273
    const/4 v3, 0x0

    .line 274
    const/4 v4, 0x0

    .line 275
    const/4 v5, 0x0

    .line 276
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    const/4 v2, 0x0

    .line 281
    invoke-static {v1, v9, v2}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 282
    .line 283
    .line 284
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_6

    .line 289
    .line 290
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 291
    .line 292
    .line 293
    :cond_6
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 294
    .line 295
    return-object v1

    .line 296
    :pswitch_4
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v1, Lcom/zykj/mistake/feature/notebook/list/e1;

    .line 299
    .line 300
    move-object/from16 v2, p1

    .line 301
    .line 302
    check-cast v2, Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;

    .line 303
    .line 304
    move-object/from16 v3, p2

    .line 305
    .line 306
    check-cast v3, Landroidx/compose/runtime/Composer;

    .line 307
    .line 308
    move-object/from16 v4, p3

    .line 309
    .line 310
    check-cast v4, Ljava/lang/Integer;

    .line 311
    .line 312
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v4

    .line 316
    const-string v5, "$this$item"

    .line 317
    .line 318
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    and-int/lit8 v2, v4, 0x11

    .line 322
    .line 323
    const/16 v5, 0x10

    .line 324
    .line 325
    const/4 v6, 0x1

    .line 326
    if-eq v2, v5, :cond_7

    .line 327
    .line 328
    move v2, v6

    .line 329
    goto :goto_3

    .line 330
    :cond_7
    const/4 v2, 0x0

    .line 331
    :goto_3
    and-int/lit8 v5, v4, 0x1

    .line 332
    .line 333
    invoke-interface {v3, v2, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    if-eqz v2, :cond_a

    .line 338
    .line 339
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_8

    .line 344
    .line 345
    const/4 v2, -0x1

    .line 346
    const-string v5, "com.zykj.mistake.feature.notebook.list.MistakeNotebookGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MistakeNotebookScreen.kt:255)"

    .line 347
    .line 348
    const v7, 0x794f5a8d

    .line 349
    .line 350
    .line 351
    invoke-static {v7, v4, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 352
    .line 353
    .line 354
    :cond_8
    iget-boolean v1, v1, Lcom/zykj/mistake/feature/notebook/list/e1;->f:Z

    .line 355
    .line 356
    if-eqz v1, :cond_9

    .line 357
    .line 358
    const-string/jumbo v1, "\u52a0\u8f7d\u4e2d..."

    .line 359
    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_9
    const-string/jumbo v1, "\u6ca1\u6709\u66f4\u591a\u4e86"

    .line 363
    .line 364
    .line 365
    :goto_4
    const-wide v4, 0xff999999L

    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 371
    .line 372
    .line 373
    move-result-wide v4

    .line 374
    const/16 v2, 0xa

    .line 375
    .line 376
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 377
    .line 378
    .line 379
    move-result-wide v7

    .line 380
    sget-object v2, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 381
    .line 382
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 387
    .line 388
    const/4 v10, 0x0

    .line 389
    const/4 v11, 0x0

    .line 390
    invoke-static {v9, v10, v6, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 391
    .line 392
    .line 393
    move-result-object v9

    .line 394
    const/4 v12, 0x4

    .line 395
    int-to-float v12, v12

    .line 396
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 397
    .line 398
    .line 399
    move-result v12

    .line 400
    invoke-static {v9, v10, v12, v6, v11}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 401
    .line 402
    .line 403
    move-result-object v6

    .line 404
    invoke-static {v2}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 405
    .line 406
    .line 407
    move-result-object v15

    .line 408
    const/16 v26, 0x0

    .line 409
    .line 410
    const v27, 0x1fdf0

    .line 411
    .line 412
    .line 413
    const/4 v9, 0x0

    .line 414
    const/4 v10, 0x0

    .line 415
    const-wide/16 v12, 0x0

    .line 416
    .line 417
    const/4 v14, 0x0

    .line 418
    const-wide/16 v16, 0x0

    .line 419
    .line 420
    const/16 v18, 0x0

    .line 421
    .line 422
    const/16 v19, 0x0

    .line 423
    .line 424
    const/16 v20, 0x0

    .line 425
    .line 426
    const/16 v21, 0x0

    .line 427
    .line 428
    const/16 v22, 0x0

    .line 429
    .line 430
    const/16 v23, 0x0

    .line 431
    .line 432
    const/16 v25, 0xdb0

    .line 433
    .line 434
    move-wide/from16 v29, v4

    .line 435
    .line 436
    move-object v4, v6

    .line 437
    move-wide/from16 v5, v29

    .line 438
    .line 439
    move-object/from16 v24, v3

    .line 440
    .line 441
    move-object v3, v1

    .line 442
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 443
    .line 444
    .line 445
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 446
    .line 447
    .line 448
    move-result v1

    .line 449
    if-eqz v1, :cond_b

    .line 450
    .line 451
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 452
    .line 453
    .line 454
    goto :goto_5

    .line 455
    :cond_a
    move-object/from16 v24, v3

    .line 456
    .line 457
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 458
    .line 459
    .line 460
    :cond_b
    :goto_5
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 461
    .line 462
    return-object v1

    .line 463
    :pswitch_5
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;

    .line 466
    .line 467
    move-object/from16 v2, p1

    .line 468
    .line 469
    check-cast v2, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;

    .line 470
    .line 471
    move-object/from16 v6, p2

    .line 472
    .line 473
    check-cast v6, Ljava/lang/String;

    .line 474
    .line 475
    move-object/from16 v9, p3

    .line 476
    .line 477
    check-cast v9, Ljava/util/List;

    .line 478
    .line 479
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/o1;

    .line 480
    .line 481
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getTopicId()J

    .line 482
    .line 483
    .line 484
    move-result-wide v4

    .line 485
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getTitle()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v7

    .line 489
    invoke-virtual {v2}, Lcom/zykj/mistake/entity/req/CreateOrUpdateMistakeReq;->getStemShoot()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v8

    .line 493
    invoke-direct/range {v3 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/o1;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewViewModel;->t(Lcom/zykj/mistake/feature/notebook/detail/i3;)V

    .line 497
    .line 498
    .line 499
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 500
    .line 501
    return-object v1

    .line 502
    :pswitch_6
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v1, Ljava/util/ArrayList;

    .line 505
    .line 506
    move-object/from16 v2, p1

    .line 507
    .line 508
    check-cast v2, Landroidx/compose/foundation/layout/FlowRowScope;

    .line 509
    .line 510
    move-object/from16 v8, p2

    .line 511
    .line 512
    check-cast v8, Landroidx/compose/runtime/Composer;

    .line 513
    .line 514
    move-object/from16 v3, p3

    .line 515
    .line 516
    check-cast v3, Ljava/lang/Integer;

    .line 517
    .line 518
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    const-string v4, "$this$FlowRow"

    .line 523
    .line 524
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    and-int/lit8 v2, v3, 0x11

    .line 528
    .line 529
    const/16 v4, 0x10

    .line 530
    .line 531
    const/4 v5, 0x0

    .line 532
    if-eq v2, v4, :cond_c

    .line 533
    .line 534
    const/4 v2, 0x1

    .line 535
    goto :goto_6

    .line 536
    :cond_c
    move v2, v5

    .line 537
    :goto_6
    and-int/lit8 v4, v3, 0x1

    .line 538
    .line 539
    invoke-interface {v8, v2, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 540
    .line 541
    .line 542
    move-result v2

    .line 543
    if-eqz v2, :cond_f

    .line 544
    .line 545
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 546
    .line 547
    .line 548
    move-result v2

    .line 549
    if-eqz v2, :cond_d

    .line 550
    .line 551
    const/4 v2, -0x1

    .line 552
    const-string v4, "com.zykj.mistake.feature.collection.filter.FilterSection.<anonymous> (MistakeCollectionFilterPanel.kt:271)"

    .line 553
    .line 554
    const v6, -0x438a4703

    .line 555
    .line 556
    .line 557
    invoke-static {v6, v3, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 558
    .line 559
    .line 560
    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    :goto_7
    if-ge v5, v2, :cond_e

    .line 565
    .line 566
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    add-int/lit8 v10, v5, 0x1

    .line 571
    .line 572
    check-cast v3, Lcom/zykj/mistake/feature/collection/filter/c;

    .line 573
    .line 574
    iget-object v4, v3, Lcom/zykj/mistake/feature/collection/filter/c;->a:Ljava/lang/String;

    .line 575
    .line 576
    move-object v5, v4

    .line 577
    iget-boolean v4, v3, Lcom/zykj/mistake/feature/collection/filter/c;->b:Z

    .line 578
    .line 579
    move-object v6, v5

    .line 580
    iget-boolean v5, v3, Lcom/zykj/mistake/feature/collection/filter/c;->c:Z

    .line 581
    .line 582
    move-object v7, v6

    .line 583
    iget-boolean v6, v3, Lcom/zykj/mistake/feature/collection/filter/c;->d:Z

    .line 584
    .line 585
    iget-object v3, v3, Lcom/zykj/mistake/feature/collection/filter/c;->e:Lr6/a;

    .line 586
    .line 587
    const/4 v9, 0x0

    .line 588
    move-object/from16 v29, v7

    .line 589
    .line 590
    move-object v7, v3

    .line 591
    move-object/from16 v3, v29

    .line 592
    .line 593
    invoke-static/range {v3 .. v9}, Lcom/zykj/mistake/feature/collection/filter/i;->b(Ljava/lang/String;ZZZLr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 594
    .line 595
    .line 596
    move v5, v10

    .line 597
    goto :goto_7

    .line 598
    :cond_e
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    if-eqz v1, :cond_10

    .line 603
    .line 604
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 605
    .line 606
    .line 607
    goto :goto_8

    .line 608
    :cond_f
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 609
    .line 610
    .line 611
    :cond_10
    :goto_8
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 612
    .line 613
    return-object v1

    .line 614
    :pswitch_7
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v1, Lcom/zykj/mistake/feature/ask/c0;

    .line 617
    .line 618
    move-object/from16 v2, p1

    .line 619
    .line 620
    check-cast v2, Landroidx/compose/foundation/layout/FlowRowScope;

    .line 621
    .line 622
    move-object/from16 v3, p2

    .line 623
    .line 624
    check-cast v3, Landroidx/compose/runtime/Composer;

    .line 625
    .line 626
    move-object/from16 v4, p3

    .line 627
    .line 628
    check-cast v4, Ljava/lang/Integer;

    .line 629
    .line 630
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 631
    .line 632
    .line 633
    move-result v4

    .line 634
    const-string v5, "$this$FlowRow"

    .line 635
    .line 636
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    and-int/lit8 v2, v4, 0x11

    .line 640
    .line 641
    const/16 v5, 0x10

    .line 642
    .line 643
    const/4 v6, 0x0

    .line 644
    const/4 v7, 0x1

    .line 645
    if-eq v2, v5, :cond_11

    .line 646
    .line 647
    move v2, v7

    .line 648
    goto :goto_9

    .line 649
    :cond_11
    move v2, v6

    .line 650
    :goto_9
    and-int/lit8 v5, v4, 0x1

    .line 651
    .line 652
    invoke-interface {v3, v2, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 653
    .line 654
    .line 655
    move-result v2

    .line 656
    if-eqz v2, :cond_18

    .line 657
    .line 658
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    if-eqz v2, :cond_12

    .line 663
    .line 664
    const/4 v2, -0x1

    .line 665
    const-string v5, "com.zykj.mistake.feature.ask.TextAnswerMaterialPreview.<anonymous>.<anonymous> (MistakeAskMaterialScreen.kt:383)"

    .line 666
    .line 667
    const v8, -0xdbb45c1

    .line 668
    .line 669
    .line 670
    invoke-static {v8, v4, v2, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 671
    .line 672
    .line 673
    :cond_12
    iget-object v2, v1, Lcom/zykj/mistake/feature/ask/c0;->b:Ljava/util/List;

    .line 674
    .line 675
    iget-boolean v4, v1, Lcom/zykj/mistake/feature/ask/c0;->e:Z

    .line 676
    .line 677
    iget-object v1, v1, Lcom/zykj/mistake/feature/ask/c0;->c:Ljava/util/List;

    .line 678
    .line 679
    invoke-interface {v2, v1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    if-eqz v5, :cond_13

    .line 684
    .line 685
    invoke-interface {v1, v2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    if-eqz v1, :cond_13

    .line 690
    .line 691
    move v1, v7

    .line 692
    goto :goto_a

    .line 693
    :cond_13
    move v1, v6

    .line 694
    :goto_a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 699
    .line 700
    .line 701
    move-result v5

    .line 702
    if-eqz v5, :cond_17

    .line 703
    .line 704
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v5

    .line 708
    check-cast v5, Ljava/lang/String;

    .line 709
    .line 710
    if-eqz v4, :cond_14

    .line 711
    .line 712
    sget-object v6, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 713
    .line 714
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 715
    .line 716
    .line 717
    move-result-wide v6

    .line 718
    goto :goto_c

    .line 719
    :cond_14
    sget-wide v6, Lcom/zykj/mistake/feature/ask/o0;->h:J

    .line 720
    .line 721
    :goto_c
    const/16 v8, 0xe

    .line 722
    .line 723
    invoke-static {v8}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 724
    .line 725
    .line 726
    move-result-wide v8

    .line 727
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 728
    .line 729
    if-nez v4, :cond_15

    .line 730
    .line 731
    sget-wide v11, Lcom/zykj/mistake/feature/ask/o0;->g:J

    .line 732
    .line 733
    goto :goto_d

    .line 734
    :cond_15
    if-eqz v1, :cond_16

    .line 735
    .line 736
    sget-wide v11, Lcom/zykj/mistake/feature/ask/o0;->i:J

    .line 737
    .line 738
    goto :goto_d

    .line 739
    :cond_16
    sget-wide v11, Lcom/zykj/mistake/feature/ask/o0;->j:J

    .line 740
    .line 741
    :goto_d
    const/4 v13, 0x3

    .line 742
    int-to-float v13, v13

    .line 743
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 744
    .line 745
    .line 746
    move-result v13

    .line 747
    invoke-static {v13}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 748
    .line 749
    .line 750
    move-result-object v13

    .line 751
    invoke-static {v10, v11, v12, v13}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 752
    .line 753
    .line 754
    move-result-object v10

    .line 755
    const/16 v11, 0xc

    .line 756
    .line 757
    int-to-float v11, v11

    .line 758
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 759
    .line 760
    .line 761
    move-result v11

    .line 762
    const/4 v12, 0x7

    .line 763
    int-to-float v12, v12

    .line 764
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 765
    .line 766
    .line 767
    move-result v12

    .line 768
    invoke-static {v10, v11, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 769
    .line 770
    .line 771
    move-result-object v10

    .line 772
    const/16 v26, 0xc00

    .line 773
    .line 774
    const v27, 0x1dff0

    .line 775
    .line 776
    .line 777
    move-object/from16 v24, v3

    .line 778
    .line 779
    move-object v3, v5

    .line 780
    move-wide v5, v6

    .line 781
    move-wide v7, v8

    .line 782
    const/4 v9, 0x0

    .line 783
    move v11, v4

    .line 784
    move-object v4, v10

    .line 785
    const/4 v10, 0x0

    .line 786
    move v12, v11

    .line 787
    const/4 v11, 0x0

    .line 788
    move v14, v12

    .line 789
    const-wide/16 v12, 0x0

    .line 790
    .line 791
    move v15, v14

    .line 792
    const/4 v14, 0x0

    .line 793
    move/from16 v16, v15

    .line 794
    .line 795
    const/4 v15, 0x0

    .line 796
    move/from16 v18, v16

    .line 797
    .line 798
    const-wide/16 v16, 0x0

    .line 799
    .line 800
    move/from16 v19, v18

    .line 801
    .line 802
    const/16 v18, 0x0

    .line 803
    .line 804
    move/from16 v20, v19

    .line 805
    .line 806
    const/16 v19, 0x0

    .line 807
    .line 808
    move/from16 v21, v20

    .line 809
    .line 810
    const/16 v20, 0x1

    .line 811
    .line 812
    move/from16 v22, v21

    .line 813
    .line 814
    const/16 v21, 0x0

    .line 815
    .line 816
    move/from16 v23, v22

    .line 817
    .line 818
    const/16 v22, 0x0

    .line 819
    .line 820
    move/from16 v25, v23

    .line 821
    .line 822
    const/16 v23, 0x0

    .line 823
    .line 824
    move/from16 v28, v25

    .line 825
    .line 826
    const/16 v25, 0xc00

    .line 827
    .line 828
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 829
    .line 830
    .line 831
    move-object/from16 v3, v24

    .line 832
    .line 833
    move/from16 v4, v28

    .line 834
    .line 835
    goto/16 :goto_b

    .line 836
    .line 837
    :cond_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 838
    .line 839
    .line 840
    move-result v1

    .line 841
    if-eqz v1, :cond_19

    .line 842
    .line 843
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 844
    .line 845
    .line 846
    goto :goto_e

    .line 847
    :cond_18
    move-object/from16 v24, v3

    .line 848
    .line 849
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 850
    .line 851
    .line 852
    :cond_19
    :goto_e
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 853
    .line 854
    return-object v1

    .line 855
    :pswitch_8
    iget-object v1, v0, Landroidx/navigation/serialization/b;->b:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v1, Landroidx/navigation/serialization/RouteBuilder;

    .line 858
    .line 859
    move-object/from16 v2, p1

    .line 860
    .line 861
    check-cast v2, Ljava/lang/Integer;

    .line 862
    .line 863
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 864
    .line 865
    .line 866
    move-result v2

    .line 867
    move-object/from16 v3, p2

    .line 868
    .line 869
    check-cast v3, Ljava/lang/String;

    .line 870
    .line 871
    move-object/from16 v4, p3

    .line 872
    .line 873
    check-cast v4, Landroidx/navigation/NavType;

    .line 874
    .line 875
    invoke-static {v1, v2, v3, v4}, Landroidx/navigation/serialization/RouteSerializerKt;->d(Landroidx/navigation/serialization/RouteBuilder;ILjava/lang/String;Landroidx/navigation/NavType;)Ld6/s;

    .line 876
    .line 877
    .line 878
    move-result-object v1

    .line 879
    return-object v1

    .line 880
    nop

    .line 881
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

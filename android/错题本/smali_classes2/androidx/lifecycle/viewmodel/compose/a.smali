.class public final synthetic Landroidx/lifecycle/viewmodel/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/lifecycle/viewmodel/compose/a;->a:I

    iput-object p1, p0, Landroidx/lifecycle/viewmodel/compose/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 62

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Landroidx/lifecycle/viewmodel/compose/a;->a:I

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const-string v3, "$this$DelimitedRangesSequence"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v7, v1, Landroidx/lifecycle/viewmodel/compose/a;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v7, Lkotlinx/coroutines/flow/internal/SafeCollector;

    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    move-object/from16 v2, p2

    .line 27
    .line 28
    check-cast v2, Lh6/f;

    .line 29
    .line 30
    invoke-interface {v2}, Lh6/f;->getKey()Lh6/g;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v4, v7, Lkotlinx/coroutines/flow/internal/SafeCollector;->collectContext:Lh6/h;

    .line 35
    .line 36
    invoke-interface {v4, v3}, Lh6/h;->get(Lh6/g;)Lh6/f;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    sget-object v6, Lkotlinx/coroutines/v0;->a:Lkotlinx/coroutines/v0;

    .line 41
    .line 42
    if-eq v3, v6, :cond_1

    .line 43
    .line 44
    if-eq v2, v4, :cond_0

    .line 45
    .line 46
    const/high16 v0, -0x80000000

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    move-object v8, v4

    .line 53
    check-cast v8, Lkotlinx/coroutines/w0;

    .line 54
    .line 55
    check-cast v2, Lkotlinx/coroutines/w0;

    .line 56
    .line 57
    :goto_0
    if-nez v2, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    if-ne v2, v8, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    instance-of v3, v2, Le7/o;

    .line 64
    .line 65
    if-nez v3, :cond_5

    .line 66
    .line 67
    :goto_1
    move-object v5, v2

    .line 68
    :goto_2
    if-ne v5, v8, :cond_4

    .line 69
    .line 70
    if-nez v8, :cond_0

    .line 71
    .line 72
    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0

    .line 77
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v3, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    .line 82
    .line 83
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v3, ", expected child of "

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v3, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v0

    .line 114
    :cond_5
    check-cast v2, Le7/o;

    .line 115
    .line 116
    sget-object v3, Lkotlinx/coroutines/c1;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 117
    .line 118
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Lkotlinx/coroutines/j;

    .line 123
    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    invoke-interface {v2}, Lkotlinx/coroutines/j;->getParent()Lkotlinx/coroutines/w0;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    goto :goto_0

    .line 131
    :cond_6
    move-object v2, v5

    .line 132
    goto :goto_0

    .line 133
    :pswitch_0
    check-cast v7, Ljava/util/List;

    .line 134
    .line 135
    move-object/from16 v10, p1

    .line 136
    .line 137
    check-cast v10, Ljava/lang/CharSequence;

    .line 138
    .line 139
    move-object/from16 v0, p2

    .line 140
    .line 141
    check-cast v0, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-ne v3, v6, :cond_9

    .line 155
    .line 156
    invoke-static {v7}, Lkotlin/collections/t;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v10, v3, v0, v4, v2}, Lkotlin/text/p;->N(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-gez v0, :cond_8

    .line 167
    .line 168
    :cond_7
    move-object v2, v5

    .line 169
    goto/16 :goto_9

    .line 170
    .line 171
    :cond_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    new-instance v2, Lkotlin/Pair;

    .line 176
    .line 177
    invoke-direct {v2, v0, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    goto/16 :goto_9

    .line 181
    .line 182
    :cond_9
    new-instance v2, Lx6/f;

    .line 183
    .line 184
    if-gez v0, :cond_a

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_a
    move v4, v0

    .line 188
    :goto_4
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    invoke-direct {v2, v4, v0, v6}, Lx6/d;-><init>(III)V

    .line 193
    .line 194
    .line 195
    instance-of v0, v10, Ljava/lang/String;

    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    iget v3, v2, Lx6/d;->c:I

    .line 199
    .line 200
    iget v2, v2, Lx6/d;->b:I

    .line 201
    .line 202
    if-eqz v0, :cond_10

    .line 203
    .line 204
    if-lez v3, :cond_b

    .line 205
    .line 206
    if-le v4, v2, :cond_c

    .line 207
    .line 208
    :cond_b
    if-gez v3, :cond_7

    .line 209
    .line 210
    if-gt v2, v4, :cond_7

    .line 211
    .line 212
    :cond_c
    move v15, v4

    .line 213
    :goto_5
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-eqz v4, :cond_e

    .line 222
    .line 223
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    move-object v11, v4

    .line 228
    check-cast v11, Ljava/lang/String;

    .line 229
    .line 230
    move-object v14, v10

    .line 231
    check-cast v14, Ljava/lang/String;

    .line 232
    .line 233
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 234
    .line 235
    .line 236
    move-result v16

    .line 237
    const/4 v12, 0x0

    .line 238
    invoke-static/range {v11 .. v16}, Lkotlin/text/w;->x(Ljava/lang/String;IZLjava/lang/String;II)Z

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    if-eqz v6, :cond_d

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_e
    move-object v4, v5

    .line 246
    :goto_6
    check-cast v4, Ljava/lang/String;

    .line 247
    .line 248
    if-eqz v4, :cond_f

    .line 249
    .line 250
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    new-instance v2, Lkotlin/Pair;

    .line 255
    .line 256
    invoke-direct {v2, v0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_f
    if-eq v15, v2, :cond_7

    .line 261
    .line 262
    add-int/2addr v15, v3

    .line 263
    goto :goto_5

    .line 264
    :cond_10
    if-lez v3, :cond_11

    .line 265
    .line 266
    if-le v4, v2, :cond_12

    .line 267
    .line 268
    :cond_11
    if-gez v3, :cond_7

    .line 269
    .line 270
    if-gt v2, v4, :cond_7

    .line 271
    .line 272
    :cond_12
    move v11, v4

    .line 273
    :goto_7
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    :cond_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_14

    .line 282
    .line 283
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    move-object v8, v4

    .line 288
    check-cast v8, Ljava/lang/String;

    .line 289
    .line 290
    const/4 v9, 0x0

    .line 291
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    invoke-static/range {v8 .. v13}, Lkotlin/text/p;->U(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    if-eqz v6, :cond_13

    .line 300
    .line 301
    goto :goto_8

    .line 302
    :cond_14
    move-object v4, v5

    .line 303
    :goto_8
    check-cast v4, Ljava/lang/String;

    .line 304
    .line 305
    if-eqz v4, :cond_15

    .line 306
    .line 307
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    new-instance v2, Lkotlin/Pair;

    .line 312
    .line 313
    invoke-direct {v2, v0, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_15
    if-eq v11, v2, :cond_7

    .line 318
    .line 319
    add-int/2addr v11, v3

    .line 320
    goto :goto_7

    .line 321
    :goto_9
    if-eqz v2, :cond_16

    .line 322
    .line 323
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    check-cast v2, Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    new-instance v5, Lkotlin/Pair;

    .line 342
    .line 343
    invoke-direct {v5, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    :cond_16
    return-object v5

    .line 347
    :pswitch_1
    check-cast v7, [C

    .line 348
    .line 349
    move-object/from16 v0, p1

    .line 350
    .line 351
    check-cast v0, Ljava/lang/CharSequence;

    .line 352
    .line 353
    move-object/from16 v2, p2

    .line 354
    .line 355
    check-cast v2, Ljava/lang/Integer;

    .line 356
    .line 357
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-static {v0, v7, v2, v4}, Lkotlin/text/p;->O(Ljava/lang/CharSequence;[CIZ)I

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-gez v0, :cond_17

    .line 369
    .line 370
    goto :goto_a

    .line 371
    :cond_17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    new-instance v5, Lkotlin/Pair;

    .line 380
    .line 381
    invoke-direct {v5, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    :goto_a
    return-object v5

    .line 385
    :pswitch_2
    move-object v10, v7

    .line 386
    check-cast v10, Lr6/a;

    .line 387
    .line 388
    move-object/from16 v0, p1

    .line 389
    .line 390
    check-cast v0, Landroidx/compose/runtime/Composer;

    .line 391
    .line 392
    move-object/from16 v3, p2

    .line 393
    .line 394
    check-cast v3, Ljava/lang/Integer;

    .line 395
    .line 396
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    and-int/lit8 v7, v3, 0x3

    .line 401
    .line 402
    const/4 v8, 0x2

    .line 403
    if-eq v7, v8, :cond_18

    .line 404
    .line 405
    move v7, v6

    .line 406
    goto :goto_b

    .line 407
    :cond_18
    move v7, v4

    .line 408
    :goto_b
    and-int/lit8 v8, v3, 0x1

    .line 409
    .line 410
    invoke-interface {v0, v7, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 411
    .line 412
    .line 413
    move-result v7

    .line 414
    if-eqz v7, :cond_22

    .line 415
    .line 416
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-eqz v7, :cond_19

    .line 421
    .line 422
    const/4 v7, -0x1

    .line 423
    const-string v8, "com.zykj.mistake.feature.notebook.list.NotebookCollectionLimitDialog.<anonymous> (MistakeJoinCollectionDialog.kt:229)"

    .line 424
    .line 425
    const v9, 0x3cc284b7

    .line 426
    .line 427
    .line 428
    invoke-static {v9, v3, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 429
    .line 430
    .line 431
    :cond_19
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 432
    .line 433
    const/16 v7, 0x1ae

    .line 434
    .line 435
    int-to-float v7, v7

    .line 436
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    sget-object v37, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 445
    .line 446
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 447
    .line 448
    .line 449
    move-result-wide v8

    .line 450
    int-to-float v2, v2

    .line 451
    invoke-static {v2, v7, v8, v9}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    const/16 v8, 0x2c

    .line 456
    .line 457
    int-to-float v8, v8

    .line 458
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 459
    .line 460
    .line 461
    move-result v8

    .line 462
    const/16 v9, 0x1e

    .line 463
    .line 464
    int-to-float v9, v9

    .line 465
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 466
    .line 467
    .line 468
    move-result v9

    .line 469
    invoke-static {v7, v8, v9}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 470
    .line 471
    .line 472
    move-result-object v7

    .line 473
    sget-object v38, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 474
    .line 475
    invoke-virtual/range {v38 .. v38}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 476
    .line 477
    .line 478
    move-result-object v8

    .line 479
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 480
    .line 481
    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 482
    .line 483
    .line 484
    move-result-object v9

    .line 485
    const/16 v11, 0x30

    .line 486
    .line 487
    invoke-static {v9, v8, v0, v11}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 488
    .line 489
    .line 490
    move-result-object v8

    .line 491
    invoke-static {v0, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 492
    .line 493
    .line 494
    move-result v9

    .line 495
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 496
    .line 497
    .line 498
    move-result-object v11

    .line 499
    invoke-static {v0, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 500
    .line 501
    .line 502
    move-result-object v7

    .line 503
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 504
    .line 505
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 506
    .line 507
    .line 508
    move-result-object v13

    .line 509
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 510
    .line 511
    .line 512
    move-result-object v14

    .line 513
    if-nez v14, :cond_1a

    .line 514
    .line 515
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 516
    .line 517
    .line 518
    :cond_1a
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 519
    .line 520
    .line 521
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 522
    .line 523
    .line 524
    move-result v14

    .line 525
    if-eqz v14, :cond_1b

    .line 526
    .line 527
    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 528
    .line 529
    .line 530
    goto :goto_c

    .line 531
    :cond_1b
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 532
    .line 533
    .line 534
    :goto_c
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 535
    .line 536
    .line 537
    move-result-object v13

    .line 538
    invoke-static {v12, v13, v8, v13, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 539
    .line 540
    .line 541
    move-result-object v8

    .line 542
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 543
    .line 544
    .line 545
    move-result v11

    .line 546
    if-nez v11, :cond_1c

    .line 547
    .line 548
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v11

    .line 552
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 553
    .line 554
    .line 555
    move-result-object v14

    .line 556
    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v11

    .line 560
    if-nez v11, :cond_1d

    .line 561
    .line 562
    :cond_1c
    invoke-static {v9, v13, v9, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 563
    .line 564
    .line 565
    :cond_1d
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 566
    .line 567
    .line 568
    move-result-object v8

    .line 569
    invoke-static {v13, v7, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 570
    .line 571
    .line 572
    sget-object v7, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 573
    .line 574
    const-wide v7, 0xff15171aL

    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 580
    .line 581
    .line 582
    move-result-wide v13

    .line 583
    const/16 v7, 0x12

    .line 584
    .line 585
    invoke-static {v7}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 586
    .line 587
    .line 588
    move-result-wide v15

    .line 589
    sget-object v7, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 590
    .line 591
    invoke-virtual {v7}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 592
    .line 593
    .line 594
    move-result-object v18

    .line 595
    const/16 v34, 0x0

    .line 596
    .line 597
    const v35, 0x1ffd2

    .line 598
    .line 599
    .line 600
    const-string/jumbo v11, "\u8d85\u51fa\u63d0\u793a"

    .line 601
    .line 602
    .line 603
    move-object v7, v12

    .line 604
    const/4 v12, 0x0

    .line 605
    const/16 v17, 0x0

    .line 606
    .line 607
    const/16 v19, 0x0

    .line 608
    .line 609
    const-wide/16 v20, 0x0

    .line 610
    .line 611
    const/16 v22, 0x0

    .line 612
    .line 613
    const/16 v23, 0x0

    .line 614
    .line 615
    const-wide/16 v24, 0x0

    .line 616
    .line 617
    const/16 v26, 0x0

    .line 618
    .line 619
    const/16 v27, 0x0

    .line 620
    .line 621
    const/16 v28, 0x0

    .line 622
    .line 623
    const/16 v29, 0x0

    .line 624
    .line 625
    const/16 v30, 0x0

    .line 626
    .line 627
    const/16 v31, 0x0

    .line 628
    .line 629
    const v33, 0x30d86

    .line 630
    .line 631
    .line 632
    move-object/from16 v32, v0

    .line 633
    .line 634
    move-object v0, v7

    .line 635
    invoke-static/range {v11 .. v35}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 636
    .line 637
    .line 638
    new-instance v7, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 639
    .line 640
    invoke-direct {v7, v4, v6, v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 641
    .line 642
    .line 643
    const-string/jumbo v8, "\u5355\u9519\u9898\u96c6\u6700\u591a\u5305\u542b "

    .line 644
    .line 645
    .line 646
    invoke-virtual {v7, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    new-instance v39, Landroidx/compose/ui/text/SpanStyle;

    .line 650
    .line 651
    const-wide v8, 0xffff3b30L

    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 657
    .line 658
    .line 659
    move-result-wide v40

    .line 660
    const v60, 0xfffe

    .line 661
    .line 662
    .line 663
    const/16 v61, 0x0

    .line 664
    .line 665
    const-wide/16 v42, 0x0

    .line 666
    .line 667
    const/16 v44, 0x0

    .line 668
    .line 669
    const/16 v45, 0x0

    .line 670
    .line 671
    const/16 v46, 0x0

    .line 672
    .line 673
    const/16 v47, 0x0

    .line 674
    .line 675
    const/16 v48, 0x0

    .line 676
    .line 677
    const-wide/16 v49, 0x0

    .line 678
    .line 679
    const/16 v51, 0x0

    .line 680
    .line 681
    const/16 v52, 0x0

    .line 682
    .line 683
    const/16 v53, 0x0

    .line 684
    .line 685
    const-wide/16 v54, 0x0

    .line 686
    .line 687
    const/16 v56, 0x0

    .line 688
    .line 689
    const/16 v57, 0x0

    .line 690
    .line 691
    const/16 v58, 0x0

    .line 692
    .line 693
    const/16 v59, 0x0

    .line 694
    .line 695
    invoke-direct/range {v39 .. v61}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 696
    .line 697
    .line 698
    move-object/from16 v8, v39

    .line 699
    .line 700
    invoke-virtual {v7, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 701
    .line 702
    .line 703
    move-result v8

    .line 704
    :try_start_0
    const-string v9, "100"

    .line 705
    .line 706
    invoke-virtual {v7, v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 707
    .line 708
    .line 709
    invoke-virtual {v7, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 710
    .line 711
    .line 712
    const-string v8, " \u9053\u9519\u9898\uff0c\u8bf7\u53d6\u6d88\u540e\u91cd\u8bd5"

    .line 713
    .line 714
    invoke-virtual {v7, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v7}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 718
    .line 719
    .line 720
    move-result-object v7

    .line 721
    const-wide v8, 0xff666666L

    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 727
    .line 728
    .line 729
    move-result-wide v8

    .line 730
    const/16 v11, 0xe

    .line 731
    .line 732
    invoke-static {v11}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 733
    .line 734
    .line 735
    move-result-wide v18

    .line 736
    const/16 v11, 0x18

    .line 737
    .line 738
    int-to-float v11, v11

    .line 739
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 740
    .line 741
    .line 742
    move-result v13

    .line 743
    const/16 v16, 0xd

    .line 744
    .line 745
    const/16 v17, 0x0

    .line 746
    .line 747
    const/4 v12, 0x0

    .line 748
    const/4 v14, 0x0

    .line 749
    const/4 v15, 0x0

    .line 750
    move-object v11, v3

    .line 751
    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 752
    .line 753
    .line 754
    move-result-object v12

    .line 755
    sget-object v11, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 756
    .line 757
    invoke-virtual {v11}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 758
    .line 759
    .line 760
    move-result v11

    .line 761
    const/16 v13, 0x14

    .line 762
    .line 763
    invoke-static {v13}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 764
    .line 765
    .line 766
    move-result-wide v24

    .line 767
    invoke-static {v11}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 768
    .line 769
    .line 770
    move-result-object v23

    .line 771
    const/16 v35, 0x6

    .line 772
    .line 773
    const v36, 0x3f9f0

    .line 774
    .line 775
    .line 776
    move-wide/from16 v15, v18

    .line 777
    .line 778
    const/16 v18, 0x0

    .line 779
    .line 780
    const/16 v19, 0x0

    .line 781
    .line 782
    const-wide/16 v20, 0x0

    .line 783
    .line 784
    const/16 v22, 0x0

    .line 785
    .line 786
    const/16 v26, 0x0

    .line 787
    .line 788
    const/16 v27, 0x0

    .line 789
    .line 790
    const/16 v28, 0x0

    .line 791
    .line 792
    const/16 v29, 0x0

    .line 793
    .line 794
    const/16 v30, 0x0

    .line 795
    .line 796
    const/16 v31, 0x0

    .line 797
    .line 798
    move-object/from16 v33, v32

    .line 799
    .line 800
    const/16 v32, 0x0

    .line 801
    .line 802
    const/16 v34, 0xdb0

    .line 803
    .line 804
    move-object v11, v7

    .line 805
    move-wide v13, v8

    .line 806
    invoke-static/range {v11 .. v36}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 807
    .line 808
    .line 809
    move-object/from16 v13, v33

    .line 810
    .line 811
    const/16 v7, 0x1c

    .line 812
    .line 813
    int-to-float v7, v7

    .line 814
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 815
    .line 816
    .line 817
    move-result v7

    .line 818
    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 819
    .line 820
    .line 821
    move-result-object v7

    .line 822
    const/4 v8, 0x6

    .line 823
    invoke-static {v7, v13, v8}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 824
    .line 825
    .line 826
    const/4 v7, 0x0

    .line 827
    invoke-static {v3, v7, v6, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 828
    .line 829
    .line 830
    move-result-object v3

    .line 831
    const/16 v5, 0x2e

    .line 832
    .line 833
    int-to-float v5, v5

    .line 834
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 835
    .line 836
    .line 837
    move-result v5

    .line 838
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 839
    .line 840
    .line 841
    move-result-object v3

    .line 842
    const-wide v5, 0xff1576ffL

    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 848
    .line 849
    .line 850
    move-result-wide v5

    .line 851
    invoke-static {v2, v3, v5, v6}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 852
    .line 853
    .line 854
    move-result-object v6

    .line 855
    const/4 v11, 0x7

    .line 856
    const/4 v12, 0x0

    .line 857
    const/4 v7, 0x0

    .line 858
    const/4 v8, 0x0

    .line 859
    const/4 v9, 0x0

    .line 860
    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    invoke-virtual/range {v38 .. v38}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 865
    .line 866
    .line 867
    move-result-object v3

    .line 868
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 869
    .line 870
    .line 871
    move-result-object v3

    .line 872
    invoke-static {v13, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 873
    .line 874
    .line 875
    move-result v4

    .line 876
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 877
    .line 878
    .line 879
    move-result-object v5

    .line 880
    invoke-static {v13, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 885
    .line 886
    .line 887
    move-result-object v6

    .line 888
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 889
    .line 890
    .line 891
    move-result-object v7

    .line 892
    if-nez v7, :cond_1e

    .line 893
    .line 894
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 895
    .line 896
    .line 897
    :cond_1e
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 898
    .line 899
    .line 900
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 901
    .line 902
    .line 903
    move-result v7

    .line 904
    if-eqz v7, :cond_1f

    .line 905
    .line 906
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 907
    .line 908
    .line 909
    goto :goto_d

    .line 910
    :cond_1f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 911
    .line 912
    .line 913
    :goto_d
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 914
    .line 915
    .line 916
    move-result-object v6

    .line 917
    invoke-static {v0, v6, v3, v6, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 918
    .line 919
    .line 920
    move-result-object v3

    .line 921
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 922
    .line 923
    .line 924
    move-result v5

    .line 925
    if-nez v5, :cond_20

    .line 926
    .line 927
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v5

    .line 931
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 932
    .line 933
    .line 934
    move-result-object v7

    .line 935
    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v5

    .line 939
    if-nez v5, :cond_21

    .line 940
    .line 941
    :cond_20
    invoke-static {v4, v6, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 942
    .line 943
    .line 944
    :cond_21
    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    invoke-static {v6, v2, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 949
    .line 950
    .line 951
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 952
    .line 953
    invoke-virtual/range {v37 .. v37}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 954
    .line 955
    .line 956
    move-result-wide v2

    .line 957
    const/16 v0, 0x10

    .line 958
    .line 959
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 960
    .line 961
    .line 962
    move-result-wide v15

    .line 963
    const/16 v34, 0x0

    .line 964
    .line 965
    const v35, 0x1fff2

    .line 966
    .line 967
    .line 968
    const-string/jumbo v11, "\u786e\u8ba4"

    .line 969
    .line 970
    .line 971
    const/4 v12, 0x0

    .line 972
    const/16 v17, 0x0

    .line 973
    .line 974
    const/16 v18, 0x0

    .line 975
    .line 976
    const/16 v19, 0x0

    .line 977
    .line 978
    const-wide/16 v20, 0x0

    .line 979
    .line 980
    const/16 v22, 0x0

    .line 981
    .line 982
    const/16 v23, 0x0

    .line 983
    .line 984
    const-wide/16 v24, 0x0

    .line 985
    .line 986
    const/16 v26, 0x0

    .line 987
    .line 988
    const/16 v27, 0x0

    .line 989
    .line 990
    const/16 v28, 0x0

    .line 991
    .line 992
    const/16 v29, 0x0

    .line 993
    .line 994
    const/16 v30, 0x0

    .line 995
    .line 996
    const/16 v31, 0x0

    .line 997
    .line 998
    const/16 v33, 0xd86

    .line 999
    .line 1000
    move-object/from16 v32, v13

    .line 1001
    .line 1002
    move-wide v13, v2

    .line 1003
    invoke-static/range {v11 .. v35}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 1004
    .line 1005
    .line 1006
    invoke-static/range {v32 .. v32}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    if-eqz v0, :cond_23

    .line 1011
    .line 1012
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_e

    .line 1016
    :catchall_0
    move-exception v0

    .line 1017
    invoke-virtual {v7, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 1018
    .line 1019
    .line 1020
    throw v0

    .line 1021
    :cond_22
    move-object/from16 v32, v0

    .line 1022
    .line 1023
    invoke-interface/range {v32 .. v32}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1024
    .line 1025
    .line 1026
    :cond_23
    :goto_e
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 1027
    .line 1028
    return-object v0

    .line 1029
    :pswitch_3
    check-cast v7, Landroidx/compose/runtime/saveable/Saver;

    .line 1030
    .line 1031
    move-object/from16 v0, p1

    .line 1032
    .line 1033
    check-cast v0, Landroidx/compose/runtime/saveable/SaverScope;

    .line 1034
    .line 1035
    move-object/from16 v2, p2

    .line 1036
    .line 1037
    check-cast v2, Landroidx/compose/runtime/MutableState;

    .line 1038
    .line 1039
    invoke-static {v7, v0, v2}, Landroidx/lifecycle/viewmodel/compose/SavedStateHandleSaverKt;->b(Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/runtime/MutableState;)Landroidx/compose/runtime/MutableState;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    return-object v0

    .line 1044
    nop

    .line 1045
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

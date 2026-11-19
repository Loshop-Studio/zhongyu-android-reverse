.class public final synthetic Landroidx/navigation/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavBackStackEntry;Ljava/util/List;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Landroidx/navigation/compose/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/a;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Landroidx/navigation/compose/a;->b:Z

    iput-object p2, p0, Landroidx/navigation/compose/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/list/e;Lp4/b;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Landroidx/navigation/compose/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/compose/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/navigation/compose/a;->d:Ljava/lang/Object;

    iput-boolean p3, p0, Landroidx/navigation/compose/a;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/navigation/compose/a;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Landroidx/navigation/compose/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v13, v1

    .line 11
    check-cast v13, Lcom/zykj/mistake/feature/notebook/list/e;

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/navigation/compose/a;->d:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v11, v1

    .line 16
    check-cast v11, Lp4/b;

    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, Landroidx/compose/ui/draw/CacheDrawScope;

    .line 21
    .line 22
    const-string v2, "$this$drawWithCache"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/16 v2, 0x18

    .line 28
    .line 29
    int-to-float v2, v2

    .line 30
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    const/16 v2, 0x8

    .line 39
    .line 40
    int-to-float v2, v2

    .line 41
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/16 v2, 0x28

    .line 50
    .line 51
    int-to-float v2, v2

    .line 52
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    const/16 v2, 0x48

    .line 61
    .line 62
    int-to-float v2, v2

    .line 63
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/high16 v3, 0x40000000    # 2.0f

    .line 72
    .line 73
    div-float v5, v10, v3

    .line 74
    .line 75
    iget-object v6, v13, Lcom/zykj/mistake/feature/notebook/list/e;->a:Landroid/graphics/Paint;

    .line 76
    .line 77
    add-float v7, v4, v5

    .line 78
    .line 79
    invoke-static {v6, v7}, Lcom/zykj/mistake/feature/notebook/list/d;->b(Landroid/graphics/Paint;F)F

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    iget-object v6, v13, Lcom/zykj/mistake/feature/notebook/list/e;->c:Landroid/graphics/Paint;

    .line 84
    .line 85
    add-float v7, v9, v5

    .line 86
    .line 87
    invoke-static {v6, v7}, Lcom/zykj/mistake/feature/notebook/list/d;->b(Landroid/graphics/Paint;F)F

    .line 88
    .line 89
    .line 90
    move-result v25

    .line 91
    iget-object v7, v13, Lcom/zykj/mistake/feature/notebook/list/e;->d:Landroid/graphics/Paint;

    .line 92
    .line 93
    add-float/2addr v5, v2

    .line 94
    invoke-static {v7, v5}, Lcom/zykj/mistake/feature/notebook/list/d;->b(Landroid/graphics/Paint;F)F

    .line 95
    .line 96
    .line 97
    move-result v18

    .line 98
    iget-object v8, v13, Lcom/zykj/mistake/feature/notebook/list/e;->f:Landroid/graphics/Paint;

    .line 99
    .line 100
    invoke-static {v8, v5}, Lcom/zykj/mistake/feature/notebook/list/d;->b(Landroid/graphics/Paint;F)F

    .line 101
    .line 102
    .line 103
    move-result v23

    .line 104
    iget-object v5, v13, Lcom/zykj/mistake/feature/notebook/list/e;->a:Landroid/graphics/Paint;

    .line 105
    .line 106
    iget-object v14, v11, Lp4/b;->f:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v15, v11, Lp4/b;->p:Ljava/util/List;

    .line 109
    .line 110
    invoke-virtual {v5, v14}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    const/4 v14, 0x6

    .line 115
    int-to-float v14, v14

    .line 116
    move/from16 p1, v3

    .line 117
    .line 118
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    add-float/2addr v3, v5

    .line 127
    const/4 v5, 0x1

    .line 128
    move/from16 v16, v3

    .line 129
    .line 130
    int-to-float v3, v5

    .line 131
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    invoke-interface {v1, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    add-float v5, v5, v16

    .line 140
    .line 141
    move/from16 v19, v3

    .line 142
    .line 143
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    add-float/2addr v3, v5

    .line 152
    iget-object v5, v11, Lp4/b;->g:Ljava/lang/String;

    .line 153
    .line 154
    move/from16 v20, v3

    .line 155
    .line 156
    iget-object v3, v13, Lcom/zykj/mistake/feature/notebook/list/e;->b:Landroid/graphics/Paint;

    .line 157
    .line 158
    invoke-virtual {v1}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 159
    .line 160
    .line 161
    move-result-wide v21

    .line 162
    const/16 v24, 0x20

    .line 163
    .line 164
    move/from16 v27, v12

    .line 165
    .line 166
    move-object/from16 v26, v13

    .line 167
    .line 168
    shr-long v12, v21, v24

    .line 169
    .line 170
    long-to-int v12, v12

    .line 171
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    sub-float v12, v12, v20

    .line 176
    .line 177
    const/4 v13, 0x0

    .line 178
    cmpg-float v21, v12, v13

    .line 179
    .line 180
    if-gez v21, :cond_0

    .line 181
    .line 182
    move v12, v13

    .line 183
    :cond_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v21

    .line 187
    move/from16 v22, v13

    .line 188
    .line 189
    const-string v28, ""

    .line 190
    .line 191
    const/16 v29, -0x1

    .line 192
    .line 193
    if-nez v21, :cond_1

    .line 194
    .line 195
    :goto_0
    move/from16 v30, v4

    .line 196
    .line 197
    move/from16 v31, v9

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_1
    cmpg-float v21, v12, v22

    .line 201
    .line 202
    if-gtz v21, :cond_2

    .line 203
    .line 204
    :goto_1
    move/from16 v30, v4

    .line 205
    .line 206
    move/from16 v31, v9

    .line 207
    .line 208
    move-object/from16 v5, v28

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_2
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 212
    .line 213
    .line 214
    move-result v21

    .line 215
    cmpg-float v21, v21, v12

    .line 216
    .line 217
    if-gtz v21, :cond_3

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_3
    const-string/jumbo v13, "\u2026"

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3, v13}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 224
    .line 225
    .line 226
    move-result v30

    .line 227
    cmpl-float v31, v30, v12

    .line 228
    .line 229
    if-lez v31, :cond_4

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_4
    sub-float v12, v12, v30

    .line 233
    .line 234
    move/from16 v30, v4

    .line 235
    .line 236
    move/from16 v31, v9

    .line 237
    .line 238
    const/4 v4, 0x0

    .line 239
    const/4 v9, 0x1

    .line 240
    invoke-virtual {v3, v5, v9, v12, v4}, Landroid/graphics/Paint;->breakText(Ljava/lang/String;ZF[F)I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    invoke-static {v3, v5}, Lkotlin/text/p;->i0(ILjava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    add-int/lit8 v4, v4, -0x1

    .line 253
    .line 254
    if-ltz v4, :cond_7

    .line 255
    .line 256
    :goto_2
    add-int/lit8 v5, v4, -0x1

    .line 257
    .line 258
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 259
    .line 260
    .line 261
    move-result v9

    .line 262
    invoke-static {v9}, Ly1/a;->o(C)Z

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    if-nez v9, :cond_5

    .line 267
    .line 268
    const/4 v5, 0x0

    .line 269
    const/16 v17, 0x1

    .line 270
    .line 271
    add-int/lit8 v4, v4, 0x1

    .line 272
    .line 273
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    goto :goto_4

    .line 278
    :cond_5
    if-gez v5, :cond_6

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_6
    move v4, v5

    .line 282
    goto :goto_2

    .line 283
    :cond_7
    :goto_3
    move-object/from16 v3, v28

    .line 284
    .line 285
    :goto_4
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-static {v3, v13}, Landroid/support/v4/media/f;->C(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v5

    .line 293
    :goto_5
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    invoke-interface {v1, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    invoke-virtual {v1}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 310
    .line 311
    .line 312
    move-result-wide v12

    .line 313
    shr-long v12, v12, v24

    .line 314
    .line 315
    long-to-int v9, v12

    .line 316
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 317
    .line 318
    .line 319
    move-result v9

    .line 320
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    if-eqz v12, :cond_8

    .line 325
    .line 326
    const/16 v21, 0x0

    .line 327
    .line 328
    invoke-static/range {v21 .. v21}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v15

    .line 332
    :cond_8
    invoke-static {}, Lkotlin/collections/u;->q()Lkotlin/collections/builders/ListBuilder;

    .line 333
    .line 334
    .line 335
    move-result-object v12

    .line 336
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    move/from16 v34, v22

    .line 341
    .line 342
    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v14

    .line 346
    if-eqz v14, :cond_18

    .line 347
    .line 348
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v14

    .line 352
    check-cast v14, Lp4/i;

    .line 353
    .line 354
    sub-float v15, v9, v34

    .line 355
    .line 356
    cmpg-float v32, v15, v22

    .line 357
    .line 358
    if-lez v32, :cond_18

    .line 359
    .line 360
    move/from16 v39, v3

    .line 361
    .line 362
    if-eqz v14, :cond_9

    .line 363
    .line 364
    iget-object v3, v14, Lp4/i;->a:Ljava/lang/String;

    .line 365
    .line 366
    if-nez v3, :cond_a

    .line 367
    .line 368
    :cond_9
    const-string/jumbo v3, "\u6682\u65e0\u6807\u7b7e"

    .line 369
    .line 370
    .line 371
    :cond_a
    if-eqz v14, :cond_b

    .line 372
    .line 373
    iget-object v14, v14, Lp4/i;->b:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_b
    const/4 v14, 0x0

    .line 377
    :goto_7
    if-nez v14, :cond_c

    .line 378
    .line 379
    move/from16 v14, v29

    .line 380
    .line 381
    move/from16 v29, v4

    .line 382
    .line 383
    move v4, v14

    .line 384
    goto :goto_8

    .line 385
    :cond_c
    sget-object v32, Lcom/zykj/mistake/feature/notebook/list/c;->a:[I

    .line 386
    .line 387
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 388
    .line 389
    .line 390
    move-result v14

    .line 391
    aget v14, v32, v14

    .line 392
    .line 393
    move/from16 v41, v29

    .line 394
    .line 395
    move/from16 v29, v4

    .line 396
    .line 397
    move/from16 v4, v41

    .line 398
    .line 399
    :goto_8
    if-eq v14, v4, :cond_11

    .line 400
    .line 401
    const/4 v4, 0x1

    .line 402
    if-eq v14, v4, :cond_10

    .line 403
    .line 404
    const/4 v4, 0x2

    .line 405
    if-eq v14, v4, :cond_f

    .line 406
    .line 407
    const/4 v4, 0x3

    .line 408
    if-eq v14, v4, :cond_e

    .line 409
    .line 410
    const/4 v4, 0x4

    .line 411
    if-ne v14, v4, :cond_d

    .line 412
    .line 413
    const-wide v32, 0xffeff6ffL

    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 419
    .line 420
    .line 421
    move-result-wide v32

    .line 422
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 423
    .line 424
    .line 425
    move-result-object v4

    .line 426
    const-wide v32, 0xff1576ffL

    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 432
    .line 433
    .line 434
    move-result-wide v32

    .line 435
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 436
    .line 437
    .line 438
    move-result-object v14

    .line 439
    move-object/from16 v40, v5

    .line 440
    .line 441
    new-instance v5, Lkotlin/Pair;

    .line 442
    .line 443
    invoke-direct {v5, v4, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    goto/16 :goto_a

    .line 447
    .line 448
    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 449
    .line 450
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 451
    .line 452
    .line 453
    throw v1

    .line 454
    :cond_e
    move-object/from16 v40, v5

    .line 455
    .line 456
    const-wide v4, 0xfffff6ebL

    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 462
    .line 463
    .line 464
    move-result-wide v4

    .line 465
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    const-wide v32, 0xffff9a2bL

    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 475
    .line 476
    .line 477
    move-result-wide v32

    .line 478
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    new-instance v14, Lkotlin/Pair;

    .line 483
    .line 484
    invoke-direct {v14, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    :goto_9
    move-object v5, v14

    .line 488
    goto :goto_a

    .line 489
    :cond_f
    move-object/from16 v40, v5

    .line 490
    .line 491
    const-wide v4, 0xffeffff9L

    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 497
    .line 498
    .line 499
    move-result-wide v4

    .line 500
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    const-wide v32, 0xff20b486L

    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 510
    .line 511
    .line 512
    move-result-wide v32

    .line 513
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    new-instance v14, Lkotlin/Pair;

    .line 518
    .line 519
    invoke-direct {v14, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    goto :goto_9

    .line 523
    :cond_10
    move-object/from16 v40, v5

    .line 524
    .line 525
    const-wide v4, 0xfffff0f0L

    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 531
    .line 532
    .line 533
    move-result-wide v4

    .line 534
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    const-wide v32, 0xffff5e5eL

    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 544
    .line 545
    .line 546
    move-result-wide v32

    .line 547
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    new-instance v14, Lkotlin/Pair;

    .line 552
    .line 553
    invoke-direct {v14, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    goto :goto_9

    .line 557
    :cond_11
    move-object/from16 v40, v5

    .line 558
    .line 559
    const-wide v4, 0xfff5f5f5L

    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 565
    .line 566
    .line 567
    move-result-wide v4

    .line 568
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    const-wide v32, 0xff666666L

    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 578
    .line 579
    .line 580
    move-result-wide v32

    .line 581
    invoke-static/range {v32 .. v33}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    new-instance v14, Lkotlin/Pair;

    .line 586
    .line 587
    invoke-direct {v14, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    goto :goto_9

    .line 591
    :goto_a
    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 592
    .line 593
    .line 594
    move-result v4

    .line 595
    mul-float v14, v39, p1

    .line 596
    .line 597
    add-float/2addr v4, v14

    .line 598
    cmpl-float v32, v4, v15

    .line 599
    .line 600
    if-lez v32, :cond_12

    .line 601
    .line 602
    move/from16 v35, v15

    .line 603
    .line 604
    goto :goto_b

    .line 605
    :cond_12
    move/from16 v35, v4

    .line 606
    .line 607
    :goto_b
    sub-float v4, v35, v14

    .line 608
    .line 609
    cmpg-float v14, v4, v22

    .line 610
    .line 611
    if-gez v14, :cond_13

    .line 612
    .line 613
    move/from16 v4, v22

    .line 614
    .line 615
    :cond_13
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 616
    .line 617
    .line 618
    move-result v14

    .line 619
    if-nez v14, :cond_14

    .line 620
    .line 621
    :goto_c
    move-object/from16 v33, v3

    .line 622
    .line 623
    move-object/from16 v17, v5

    .line 624
    .line 625
    :goto_d
    const/4 v5, 0x1

    .line 626
    const/4 v14, 0x0

    .line 627
    goto :goto_e

    .line 628
    :cond_14
    cmpg-float v14, v4, v22

    .line 629
    .line 630
    if-gtz v14, :cond_15

    .line 631
    .line 632
    move-object/from16 v17, v5

    .line 633
    .line 634
    move-object/from16 v33, v28

    .line 635
    .line 636
    goto :goto_d

    .line 637
    :cond_15
    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 638
    .line 639
    .line 640
    move-result v14

    .line 641
    cmpg-float v14, v14, v4

    .line 642
    .line 643
    if-gtz v14, :cond_16

    .line 644
    .line 645
    goto :goto_c

    .line 646
    :cond_16
    move-object/from16 v17, v5

    .line 647
    .line 648
    const/4 v5, 0x1

    .line 649
    const/4 v14, 0x0

    .line 650
    invoke-virtual {v6, v3, v5, v4, v14}, Landroid/graphics/Paint;->breakText(Ljava/lang/String;ZF[F)I

    .line 651
    .line 652
    .line 653
    move-result v4

    .line 654
    invoke-static {v4, v3}, Lkotlin/text/p;->i0(ILjava/lang/String;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    move-object/from16 v33, v3

    .line 659
    .line 660
    :goto_e
    new-instance v32, Lcom/zykj/mistake/feature/notebook/list/l1;

    .line 661
    .line 662
    invoke-virtual/range {v17 .. v17}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    check-cast v3, Landroidx/compose/ui/graphics/Color;

    .line 667
    .line 668
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 669
    .line 670
    .line 671
    move-result-wide v36

    .line 672
    invoke-virtual/range {v17 .. v17}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    check-cast v3, Landroidx/compose/ui/graphics/Color;

    .line 677
    .line 678
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 679
    .line 680
    .line 681
    move-result-wide v3

    .line 682
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    .line 683
    .line 684
    .line 685
    move-result v38

    .line 686
    invoke-direct/range {v32 .. v38}, Lcom/zykj/mistake/feature/notebook/list/l1;-><init>(Ljava/lang/String;FFJI)V

    .line 687
    .line 688
    .line 689
    move-object/from16 v3, v32

    .line 690
    .line 691
    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    add-float v3, v35, v29

    .line 695
    .line 696
    add-float v34, v3, v34

    .line 697
    .line 698
    cmpg-float v3, v35, v15

    .line 699
    .line 700
    if-nez v3, :cond_17

    .line 701
    .line 702
    goto :goto_f

    .line 703
    :cond_17
    move/from16 v4, v29

    .line 704
    .line 705
    move/from16 v3, v39

    .line 706
    .line 707
    move-object/from16 v5, v40

    .line 708
    .line 709
    const/16 v29, -0x1

    .line 710
    .line 711
    goto/16 :goto_6

    .line 712
    .line 713
    :cond_18
    move/from16 v39, v3

    .line 714
    .line 715
    move-object/from16 v40, v5

    .line 716
    .line 717
    :goto_f
    invoke-virtual {v12}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 718
    .line 719
    .line 720
    move-result-object v5

    .line 721
    iget v3, v11, Lp4/b;->q:I

    .line 722
    .line 723
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v3

    .line 727
    iget v4, v11, Lp4/b;->r:I

    .line 728
    .line 729
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v4

    .line 733
    const/16 v6, 0xc

    .line 734
    .line 735
    int-to-float v6, v6

    .line 736
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 737
    .line 738
    .line 739
    move-result v9

    .line 740
    invoke-interface {v1, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 741
    .line 742
    .line 743
    move-result v9

    .line 744
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 745
    .line 746
    .line 747
    move-result v12

    .line 748
    invoke-interface {v1, v12}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 749
    .line 750
    .line 751
    move-result v12

    .line 752
    add-float v17, v12, v9

    .line 753
    .line 754
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 755
    .line 756
    .line 757
    move-result v7

    .line 758
    add-float v7, v7, v17

    .line 759
    .line 760
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 761
    .line 762
    .line 763
    move-result v6

    .line 764
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 765
    .line 766
    .line 767
    move-result v6

    .line 768
    add-float/2addr v6, v7

    .line 769
    add-float v7, v6, v9

    .line 770
    .line 771
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 772
    .line 773
    .line 774
    move-result v12

    .line 775
    invoke-interface {v1, v12}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 776
    .line 777
    .line 778
    move-result v12

    .line 779
    add-float/2addr v12, v7

    .line 780
    invoke-virtual {v1}, Landroidx/compose/ui/draw/CacheDrawScope;->getSize-NH-jbRc()J

    .line 781
    .line 782
    .line 783
    move-result-wide v13

    .line 784
    shr-long v13, v13, v24

    .line 785
    .line 786
    long-to-int v7, v13

    .line 787
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 788
    .line 789
    .line 790
    move-result v7

    .line 791
    iget-object v13, v11, Lp4/b;->s:Ljava/lang/String;

    .line 792
    .line 793
    invoke-virtual {v8, v13}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 794
    .line 795
    .line 796
    move-result v8

    .line 797
    sub-float/2addr v7, v8

    .line 798
    cmpg-float v8, v7, v22

    .line 799
    .line 800
    if-gez v8, :cond_19

    .line 801
    .line 802
    :goto_10
    move/from16 v7, p1

    .line 803
    .line 804
    goto :goto_11

    .line 805
    :cond_19
    move/from16 v22, v7

    .line 806
    .line 807
    goto :goto_10

    .line 808
    :goto_11
    invoke-static {v10, v9, v7, v2}, Landroidx/collection/a;->a(FFFF)F

    .line 809
    .line 810
    .line 811
    move-result v2

    .line 812
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 813
    .line 814
    .line 815
    move-result v7

    .line 816
    invoke-interface {v1, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 817
    .line 818
    .line 819
    move-result v7

    .line 820
    move v8, v6

    .line 821
    move v6, v2

    .line 822
    new-instance v2, Lcom/zykj/mistake/feature/notebook/list/b;

    .line 823
    .line 824
    iget-boolean v9, v0, Landroidx/navigation/compose/a;->b:Z

    .line 825
    .line 826
    move/from16 v13, v16

    .line 827
    .line 828
    move-object/from16 v16, v3

    .line 829
    .line 830
    move v3, v13

    .line 831
    move-object/from16 v19, v4

    .line 832
    .line 833
    move/from16 v21, v9

    .line 834
    .line 835
    move/from16 v15, v20

    .line 836
    .line 837
    move-object/from16 v13, v26

    .line 838
    .line 839
    move/from16 v4, v30

    .line 840
    .line 841
    move/from16 v9, v31

    .line 842
    .line 843
    move/from16 v24, v39

    .line 844
    .line 845
    move-object/from16 v14, v40

    .line 846
    .line 847
    move/from16 v20, v12

    .line 848
    .line 849
    move/from16 v12, v27

    .line 850
    .line 851
    invoke-direct/range {v2 .. v25}, Lcom/zykj/mistake/feature/notebook/list/b;-><init>(FFLjava/util/List;FFFFFLp4/b;FLcom/zykj/mistake/feature/notebook/list/e;Ljava/lang/String;FLjava/lang/String;FFLjava/lang/String;FZFFFF)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v1, v2}, Landroidx/compose/ui/draw/CacheDrawScope;->onDrawBehind(Lr6/c;)Landroidx/compose/ui/draw/DrawResult;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    return-object v1

    .line 859
    :pswitch_0
    iget-object v1, v0, Landroidx/navigation/compose/a;->c:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v1, Landroidx/navigation/NavBackStackEntry;

    .line 862
    .line 863
    iget-object v2, v0, Landroidx/navigation/compose/a;->d:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast v2, Ljava/util/List;

    .line 866
    .line 867
    move-object/from16 v3, p1

    .line 868
    .line 869
    check-cast v3, Landroidx/compose/runtime/DisposableEffectScope;

    .line 870
    .line 871
    iget-boolean v4, v0, Landroidx/navigation/compose/a;->b:Z

    .line 872
    .line 873
    invoke-static {v1, v4, v2, v3}, Landroidx/navigation/compose/DialogHostKt;->a(Landroidx/navigation/NavBackStackEntry;ZLjava/util/List;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    return-object v1

    .line 878
    nop

    .line 879
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

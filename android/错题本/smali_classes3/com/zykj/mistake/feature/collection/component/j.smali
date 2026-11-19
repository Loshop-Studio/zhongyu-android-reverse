.class public final synthetic Lcom/zykj/mistake/feature/collection/component/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/feature/collection/component/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/feature/collection/component/j;->a:I

    .line 4
    .line 5
    const-string v5, "$this$Canvas"

    .line 6
    .line 7
    const-string v6, "$this$item"

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const-string v10, "context"

    .line 11
    .line 12
    const-string v11, "$this$drawBehind"

    .line 13
    .line 14
    const/4 v12, 0x4

    .line 15
    const-wide v13, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const/16 v15, 0x20

    .line 21
    .line 22
    const-wide v16, 0xffbfc3c9L

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/high16 v18, 0x40000000    # 2.0f

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    sget-object v19, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    const-wide v20, 0xffccccccL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    const/4 v8, 0x1

    .line 40
    const-string v9, "it"

    .line 41
    .line 42
    packed-switch v1, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    move-object/from16 v1, p1

    .line 46
    .line 47
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;

    .line 48
    .line 49
    const-string v2, "response"

    .line 50
    .line 51
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResp;->getResult()Lcom/zykj/mistake/entity/resp/MistakeCollectionListResult;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeCollectionListResult;->getItems()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    new-instance v2, Ljava/util/ArrayList;

    .line 63
    .line 64
    const/16 v3, 0xa

    .line 65
    .line 66
    invoke-static {v1, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    .line 72
    .line 73
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;

    .line 88
    .line 89
    new-instance v4, Lcom/zykj/mistake/data/c;

    .line 90
    .line 91
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getId()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/MistakeCollectionResp;->getItemCount()I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    const/4 v8, 0x0

    .line 108
    const/16 v9, 0x18

    .line 109
    .line 110
    invoke-direct/range {v4 .. v9}, Lcom/zykj/mistake/data/c;-><init>(Ljava/lang/String;Ljava/lang/String;IZI)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_0
    return-object v2

    .line 118
    :pswitch_0
    move-object/from16 v1, p1

    .line 119
    .line 120
    check-cast v1, Lcom/zykj/mistake/network/ApiResp;

    .line 121
    .line 122
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v1

    .line 126
    :pswitch_1
    move-object/from16 v1, p1

    .line 127
    .line 128
    check-cast v1, Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;

    .line 129
    .line 130
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;->getMaxLineSpan()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-static {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridSpanKt;->GridItemSpan(I)J

    .line 138
    .line 139
    .line 140
    move-result-wide v1

    .line 141
    invoke-static {v1, v2}, Landroidx/compose/foundation/lazy/grid/GridItemSpan;->box-impl(J)Landroidx/compose/foundation/lazy/grid/GridItemSpan;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    return-object v1

    .line 146
    :pswitch_2
    move-object/from16 v1, p1

    .line 147
    .line 148
    check-cast v1, Lp4/b;

    .line 149
    .line 150
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-object v1, v1, Lp4/b;->a:Ljava/lang/String;

    .line 154
    .line 155
    return-object v1

    .line 156
    :pswitch_3
    move-object/from16 v1, p1

    .line 157
    .line 158
    check-cast v1, Lp4/i;

    .line 159
    .line 160
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-object v1, v1, Lp4/i;->a:Ljava/lang/String;

    .line 164
    .line 165
    return-object v1

    .line 166
    :pswitch_4
    move-object/from16 v1, p1

    .line 167
    .line 168
    check-cast v1, Ljava/io/File;

    .line 169
    .line 170
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_1

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    const-string v2, "getName(...)"

    .line 184
    .line 185
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    const-string v2, ".bin"

    .line 189
    .line 190
    invoke-static {v1, v2, v3}, Lkotlin/text/w;->u(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_1

    .line 195
    .line 196
    move v3, v8

    .line 197
    :cond_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    return-object v1

    .line 202
    :pswitch_5
    move-object/from16 v1, p1

    .line 203
    .line 204
    check-cast v1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 205
    .line 206
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-static {}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->Path()Landroidx/compose/ui/graphics/Path;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 214
    .line 215
    .line 216
    move-result-wide v4

    .line 217
    shr-long/2addr v4, v15

    .line 218
    long-to-int v4, v4

    .line 219
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    div-float v4, v4, v18

    .line 224
    .line 225
    invoke-interface {v3, v4, v2}, Landroidx/compose/ui/graphics/Path;->moveTo(FF)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 229
    .line 230
    .line 231
    move-result-wide v4

    .line 232
    shr-long/2addr v4, v15

    .line 233
    long-to-int v4, v4

    .line 234
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 239
    .line 240
    .line 241
    move-result-wide v5

    .line 242
    and-long/2addr v5, v13

    .line 243
    long-to-int v5, v5

    .line 244
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    invoke-interface {v3, v4, v5}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 252
    .line 253
    .line 254
    move-result-wide v4

    .line 255
    and-long/2addr v4, v13

    .line 256
    long-to-int v4, v4

    .line 257
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    invoke-interface {v3, v2, v4}, Landroidx/compose/ui/graphics/Path;->lineTo(FF)V

    .line 262
    .line 263
    .line 264
    invoke-interface {v3}, Landroidx/compose/ui/graphics/Path;->close()V

    .line 265
    .line 266
    .line 267
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 268
    .line 269
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 270
    .line 271
    .line 272
    move-result-wide v4

    .line 273
    const/16 v10, 0x3c

    .line 274
    .line 275
    const/4 v11, 0x0

    .line 276
    const/4 v6, 0x0

    .line 277
    const/4 v7, 0x0

    .line 278
    const/4 v8, 0x0

    .line 279
    const/4 v9, 0x0

    .line 280
    move-object v2, v1

    .line 281
    invoke-static/range {v2 .. v11}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawPath-LG529CI$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    return-object v19

    .line 285
    :pswitch_6
    move-object/from16 v1, p1

    .line 286
    .line 287
    check-cast v1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 288
    .line 289
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    .line 293
    .line 294
    double-to-float v3, v3

    .line 295
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 300
    .line 301
    .line 302
    move-result v27

    .line 303
    const-wide v3, 0xff999999L

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 309
    .line 310
    .line 311
    move-result-wide v21

    .line 312
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 313
    .line 314
    .line 315
    move-result-wide v5

    .line 316
    shr-long/2addr v5, v15

    .line 317
    long-to-int v5, v5

    .line 318
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    div-float v5, v5, v18

    .line 323
    .line 324
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    int-to-long v5, v5

    .line 329
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 330
    .line 331
    .line 332
    move-result v7

    .line 333
    int-to-long v7, v7

    .line 334
    shl-long/2addr v5, v15

    .line 335
    and-long/2addr v7, v13

    .line 336
    or-long/2addr v5, v7

    .line 337
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 338
    .line 339
    .line 340
    move-result-wide v23

    .line 341
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 342
    .line 343
    .line 344
    move-result-wide v5

    .line 345
    shr-long/2addr v5, v15

    .line 346
    long-to-int v5, v5

    .line 347
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    div-float v5, v5, v18

    .line 352
    .line 353
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 354
    .line 355
    .line 356
    move-result-wide v6

    .line 357
    and-long/2addr v6, v13

    .line 358
    long-to-int v6, v6

    .line 359
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    int-to-long v7, v5

    .line 368
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    int-to-long v5, v5

    .line 373
    shl-long/2addr v7, v15

    .line 374
    and-long/2addr v5, v13

    .line 375
    or-long/2addr v5, v7

    .line 376
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 377
    .line 378
    .line 379
    move-result-wide v25

    .line 380
    const/16 v33, 0x1f0

    .line 381
    .line 382
    const/16 v34, 0x0

    .line 383
    .line 384
    const/16 v28, 0x0

    .line 385
    .line 386
    const/16 v29, 0x0

    .line 387
    .line 388
    const/16 v30, 0x0

    .line 389
    .line 390
    const/16 v31, 0x0

    .line 391
    .line 392
    const/16 v32, 0x0

    .line 393
    .line 394
    move-object/from16 v20, v1

    .line 395
    .line 396
    invoke-static/range {v20 .. v34}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 400
    .line 401
    .line 402
    move-result-wide v21

    .line 403
    invoke-interface/range {v20 .. v20}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 404
    .line 405
    .line 406
    move-result-wide v3

    .line 407
    and-long/2addr v3, v13

    .line 408
    long-to-int v1, v3

    .line 409
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    div-float v1, v1, v18

    .line 414
    .line 415
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    int-to-long v2, v2

    .line 420
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    int-to-long v4, v1

    .line 425
    shl-long v1, v2, v15

    .line 426
    .line 427
    and-long v3, v4, v13

    .line 428
    .line 429
    or-long/2addr v1, v3

    .line 430
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 431
    .line 432
    .line 433
    move-result-wide v23

    .line 434
    invoke-interface/range {v20 .. v20}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 435
    .line 436
    .line 437
    move-result-wide v1

    .line 438
    shr-long/2addr v1, v15

    .line 439
    long-to-int v1, v1

    .line 440
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    invoke-interface/range {v20 .. v20}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 445
    .line 446
    .line 447
    move-result-wide v2

    .line 448
    and-long/2addr v2, v13

    .line 449
    long-to-int v2, v2

    .line 450
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    div-float v2, v2, v18

    .line 455
    .line 456
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    int-to-long v3, v1

    .line 461
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    int-to-long v1, v1

    .line 466
    shl-long/2addr v3, v15

    .line 467
    and-long/2addr v1, v13

    .line 468
    or-long/2addr v1, v3

    .line 469
    invoke-static {v1, v2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 470
    .line 471
    .line 472
    move-result-wide v25

    .line 473
    invoke-static/range {v20 .. v34}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    return-object v19

    .line 477
    :pswitch_7
    move-object/from16 v1, p1

    .line 478
    .line 479
    check-cast v1, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;

    .line 480
    .line 481
    new-instance v2, Lcom/zykj/mistake/data/c;

    .line 482
    .line 483
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;->getResult()Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;->getId()I

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;->getResult()Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;->getName()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    const/4 v6, 0x0

    .line 504
    const/16 v7, 0x18

    .line 505
    .line 506
    const/4 v5, 0x0

    .line 507
    invoke-direct/range {v2 .. v7}, Lcom/zykj/mistake/data/c;-><init>(Ljava/lang/String;Ljava/lang/String;IZI)V

    .line 508
    .line 509
    .line 510
    return-object v2

    .line 511
    :pswitch_8
    move-object/from16 v1, p1

    .line 512
    .line 513
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 514
    .line 515
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    return-object v1

    .line 523
    :pswitch_9
    move-object/from16 v1, p1

    .line 524
    .line 525
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 526
    .line 527
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    return-object v1

    .line 535
    :pswitch_a
    move-object/from16 v1, p1

    .line 536
    .line 537
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 538
    .line 539
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingComments()Ljava/util/ArrayList;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    return-object v1

    .line 547
    :pswitch_b
    move-object/from16 v1, p1

    .line 548
    .line 549
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 550
    .line 551
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getRevisingAnswers()Ljava/util/ArrayList;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    return-object v1

    .line 559
    :pswitch_c
    move-object/from16 v1, p1

    .line 560
    .line 561
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 562
    .line 563
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamComments()Ljava/util/ArrayList;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    return-object v1

    .line 571
    :pswitch_d
    move-object/from16 v1, p1

    .line 572
    .line 573
    check-cast v1, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;

    .line 574
    .line 575
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/MistakeDetail$AnswerListBean;->getExamAnswers()Ljava/util/ArrayList;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    return-object v1

    .line 583
    :pswitch_e
    move-object/from16 v1, p1

    .line 584
    .line 585
    check-cast v1, Lcom/zykj/mistake/network/ApiResp;

    .line 586
    .line 587
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    return-object v1

    .line 591
    :pswitch_f
    move-object/from16 v1, p1

    .line 592
    .line 593
    check-cast v1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 594
    .line 595
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 599
    .line 600
    .line 601
    move-result-wide v21

    .line 602
    new-instance v23, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 603
    .line 604
    int-to-float v2, v8

    .line 605
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 610
    .line 611
    .line 612
    move-result v24

    .line 613
    const/16 v29, 0x1e

    .line 614
    .line 615
    const/16 v30, 0x0

    .line 616
    .line 617
    const/16 v25, 0x0

    .line 618
    .line 619
    const/16 v26, 0x0

    .line 620
    .line 621
    const/16 v27, 0x0

    .line 622
    .line 623
    const/16 v28, 0x0

    .line 624
    .line 625
    invoke-direct/range {v23 .. v30}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/e;)V

    .line 626
    .line 627
    .line 628
    int-to-float v2, v12

    .line 629
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 634
    .line 635
    .line 636
    move-result v3

    .line 637
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 638
    .line 639
    .line 640
    move-result v2

    .line 641
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 646
    .line 647
    .line 648
    move-result v3

    .line 649
    int-to-long v3, v3

    .line 650
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    int-to-long v5, v2

    .line 655
    shl-long v2, v3, v15

    .line 656
    .line 657
    and-long v4, v5, v13

    .line 658
    .line 659
    or-long/2addr v2, v4

    .line 660
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/CornerRadius;->constructor-impl(J)J

    .line 661
    .line 662
    .line 663
    move-result-wide v27

    .line 664
    const/16 v33, 0xe6

    .line 665
    .line 666
    const/16 v34, 0x0

    .line 667
    .line 668
    move-object/from16 v29, v23

    .line 669
    .line 670
    const-wide/16 v23, 0x0

    .line 671
    .line 672
    const-wide/16 v25, 0x0

    .line 673
    .line 674
    const/16 v30, 0x0

    .line 675
    .line 676
    const/16 v31, 0x0

    .line 677
    .line 678
    const/16 v32, 0x0

    .line 679
    .line 680
    move-object/from16 v20, v1

    .line 681
    .line 682
    invoke-static/range {v20 .. v34}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    return-object v19

    .line 686
    :pswitch_10
    move-object/from16 v1, p1

    .line 687
    .line 688
    check-cast v1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 689
    .line 690
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 694
    .line 695
    .line 696
    move-result-wide v36

    .line 697
    new-instance v20, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 698
    .line 699
    int-to-float v3, v8

    .line 700
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 701
    .line 702
    .line 703
    move-result v5

    .line 704
    invoke-interface {v1, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 705
    .line 706
    .line 707
    move-result v21

    .line 708
    const/16 v26, 0x1e

    .line 709
    .line 710
    const/16 v27, 0x0

    .line 711
    .line 712
    const/16 v22, 0x0

    .line 713
    .line 714
    const/16 v23, 0x0

    .line 715
    .line 716
    const/16 v24, 0x0

    .line 717
    .line 718
    const/16 v25, 0x0

    .line 719
    .line 720
    invoke-direct/range {v20 .. v27}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/e;)V

    .line 721
    .line 722
    .line 723
    int-to-float v5, v12

    .line 724
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 725
    .line 726
    .line 727
    move-result v6

    .line 728
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 733
    .line 734
    .line 735
    move-result v5

    .line 736
    invoke-interface {v1, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 737
    .line 738
    .line 739
    move-result v5

    .line 740
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 741
    .line 742
    .line 743
    move-result v6

    .line 744
    int-to-long v6, v6

    .line 745
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 746
    .line 747
    .line 748
    move-result v5

    .line 749
    int-to-long v8, v5

    .line 750
    shl-long v5, v6, v15

    .line 751
    .line 752
    and-long v7, v8, v13

    .line 753
    .line 754
    or-long/2addr v5, v7

    .line 755
    invoke-static {v5, v6}, Landroidx/compose/ui/geometry/CornerRadius;->constructor-impl(J)J

    .line 756
    .line 757
    .line 758
    move-result-wide v42

    .line 759
    const/16 v48, 0xe6

    .line 760
    .line 761
    const/16 v49, 0x0

    .line 762
    .line 763
    const-wide/16 v38, 0x0

    .line 764
    .line 765
    const-wide/16 v40, 0x0

    .line 766
    .line 767
    const/16 v45, 0x0

    .line 768
    .line 769
    const/16 v46, 0x0

    .line 770
    .line 771
    const/16 v47, 0x0

    .line 772
    .line 773
    move-object/from16 v35, v1

    .line 774
    .line 775
    move-object/from16 v44, v20

    .line 776
    .line 777
    invoke-static/range {v35 .. v49}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 781
    .line 782
    .line 783
    move-result-wide v5

    .line 784
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 785
    .line 786
    .line 787
    move-result-wide v7

    .line 788
    shr-long/2addr v7, v15

    .line 789
    long-to-int v7, v7

    .line 790
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 791
    .line 792
    .line 793
    move-result v7

    .line 794
    int-to-float v4, v4

    .line 795
    div-float/2addr v7, v4

    .line 796
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 797
    .line 798
    .line 799
    move-result v7

    .line 800
    int-to-long v7, v7

    .line 801
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 802
    .line 803
    .line 804
    move-result v2

    .line 805
    int-to-long v9, v2

    .line 806
    shl-long/2addr v7, v15

    .line 807
    and-long/2addr v9, v13

    .line 808
    or-long/2addr v7, v9

    .line 809
    invoke-static {v7, v8}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 810
    .line 811
    .line 812
    move-result-wide v7

    .line 813
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 814
    .line 815
    .line 816
    move-result-wide v9

    .line 817
    shr-long/2addr v9, v15

    .line 818
    long-to-int v2, v9

    .line 819
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    div-float/2addr v2, v4

    .line 824
    invoke-interface {v1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 825
    .line 826
    .line 827
    move-result-wide v9

    .line 828
    and-long/2addr v9, v13

    .line 829
    long-to-int v4, v9

    .line 830
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 831
    .line 832
    .line 833
    move-result v4

    .line 834
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 835
    .line 836
    .line 837
    move-result v2

    .line 838
    int-to-long v9, v2

    .line 839
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 840
    .line 841
    .line 842
    move-result v2

    .line 843
    int-to-long v11, v2

    .line 844
    shl-long/2addr v9, v15

    .line 845
    and-long/2addr v11, v13

    .line 846
    or-long/2addr v9, v11

    .line 847
    invoke-static {v9, v10}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 848
    .line 849
    .line 850
    move-result-wide v9

    .line 851
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 852
    .line 853
    .line 854
    move-result v2

    .line 855
    invoke-interface {v1, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 856
    .line 857
    .line 858
    move-result v2

    .line 859
    const/16 v15, 0x1f0

    .line 860
    .line 861
    const/16 v16, 0x0

    .line 862
    .line 863
    move-wide v3, v5

    .line 864
    move-wide v5, v7

    .line 865
    move-wide v7, v9

    .line 866
    const/4 v10, 0x0

    .line 867
    const/4 v11, 0x0

    .line 868
    const/4 v12, 0x0

    .line 869
    const/4 v13, 0x0

    .line 870
    const/4 v14, 0x0

    .line 871
    move v9, v2

    .line 872
    move-object v2, v1

    .line 873
    invoke-static/range {v2 .. v16}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    return-object v19

    .line 877
    :pswitch_11
    move-object/from16 v1, p1

    .line 878
    .line 879
    check-cast v1, Landroid/content/Context;

    .line 880
    .line 881
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    new-instance v2, Landroid/widget/FrameLayout;

    .line 885
    .line 886
    invoke-direct {v2, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 887
    .line 888
    .line 889
    const v1, 0x3c23d70a    # 0.01f

    .line 890
    .line 891
    .line 892
    invoke-virtual {v2, v1}, Landroid/view/View;->setAlpha(F)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 896
    .line 897
    .line 898
    return-object v2

    .line 899
    :pswitch_12
    move-object/from16 v5, p1

    .line 900
    .line 901
    check-cast v5, Landroid/content/Context;

    .line 902
    .line 903
    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    new-instance v4, Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 907
    .line 908
    const/4 v8, 0x6

    .line 909
    const/4 v9, 0x0

    .line 910
    const/4 v6, 0x0

    .line 911
    const/4 v7, 0x0

    .line 912
    invoke-direct/range {v4 .. v9}, Lcom/zykj/view/simpleBoard/SimpleBoardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v4}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 916
    .line 917
    .line 918
    move-result-object v1

    .line 919
    invoke-virtual {v1, v3}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setEnableControl(Z)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v4}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    const/high16 v2, 0x3f800000    # 1.0f

    .line 927
    .line 928
    invoke-virtual {v1, v2}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setMinScaleTime(F)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v4}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->getSimpleBoardConfig()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 936
    .line 937
    invoke-virtual {v1, v2}, Lcom/zykj/view/simpleBoard/SimpleBoardConfig;->setMaxScaleTime(F)V

    .line 938
    .line 939
    .line 940
    return-object v4

    .line 941
    :pswitch_13
    move-object/from16 v1, p1

    .line 942
    .line 943
    check-cast v1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 944
    .line 945
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    invoke-static/range {v20 .. v21}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 949
    .line 950
    .line 951
    move-result-wide v21

    .line 952
    new-instance v23, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 953
    .line 954
    int-to-float v5, v8

    .line 955
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 956
    .line 957
    .line 958
    move-result v5

    .line 959
    invoke-interface {v1, v5}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 960
    .line 961
    .line 962
    move-result v24

    .line 963
    sget-object v5, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 964
    .line 965
    int-to-float v6, v12

    .line 966
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 967
    .line 968
    .line 969
    move-result v9

    .line 970
    invoke-interface {v1, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 971
    .line 972
    .line 973
    move-result v9

    .line 974
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 975
    .line 976
    .line 977
    move-result v6

    .line 978
    invoke-interface {v1, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 979
    .line 980
    .line 981
    move-result v6

    .line 982
    new-array v10, v4, [F

    .line 983
    .line 984
    aput v9, v10, v3

    .line 985
    .line 986
    aput v6, v10, v8

    .line 987
    .line 988
    invoke-static {v5, v10, v2, v4, v7}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 989
    .line 990
    .line 991
    move-result-object v28

    .line 992
    const/16 v29, 0xe

    .line 993
    .line 994
    const/16 v30, 0x0

    .line 995
    .line 996
    const/16 v25, 0x0

    .line 997
    .line 998
    const/16 v26, 0x0

    .line 999
    .line 1000
    const/16 v27, 0x0

    .line 1001
    .line 1002
    invoke-direct/range {v23 .. v30}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/e;)V

    .line 1003
    .line 1004
    .line 1005
    const/16 v33, 0xee

    .line 1006
    .line 1007
    const/16 v34, 0x0

    .line 1008
    .line 1009
    move-object/from16 v29, v23

    .line 1010
    .line 1011
    const-wide/16 v23, 0x0

    .line 1012
    .line 1013
    const-wide/16 v25, 0x0

    .line 1014
    .line 1015
    const-wide/16 v27, 0x0

    .line 1016
    .line 1017
    const/16 v30, 0x0

    .line 1018
    .line 1019
    const/16 v31, 0x0

    .line 1020
    .line 1021
    const/16 v32, 0x0

    .line 1022
    .line 1023
    move-object/from16 v20, v1

    .line 1024
    .line 1025
    invoke-static/range {v20 .. v34}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 1026
    .line 1027
    .line 1028
    return-object v19

    .line 1029
    :pswitch_14
    move-object/from16 v1, p1

    .line 1030
    .line 1031
    check-cast v1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 1032
    .line 1033
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    invoke-static/range {v20 .. v21}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1037
    .line 1038
    .line 1039
    move-result-wide v5

    .line 1040
    int-to-float v9, v12

    .line 1041
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1042
    .line 1043
    .line 1044
    move-result v10

    .line 1045
    invoke-interface {v1, v10}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 1046
    .line 1047
    .line 1048
    move-result v10

    .line 1049
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1050
    .line 1051
    .line 1052
    move-result v11

    .line 1053
    int-to-long v11, v11

    .line 1054
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1055
    .line 1056
    .line 1057
    move-result v10

    .line 1058
    move-wide/from16 v16, v13

    .line 1059
    .line 1060
    int-to-long v13, v10

    .line 1061
    shl-long v10, v11, v15

    .line 1062
    .line 1063
    and-long v12, v13, v16

    .line 1064
    .line 1065
    or-long/2addr v10, v12

    .line 1066
    invoke-static {v10, v11}, Landroidx/compose/ui/geometry/CornerRadius;->constructor-impl(J)J

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v10

    .line 1070
    new-instance v20, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 1071
    .line 1072
    int-to-float v12, v8

    .line 1073
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1074
    .line 1075
    .line 1076
    move-result v12

    .line 1077
    invoke-interface {v1, v12}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 1078
    .line 1079
    .line 1080
    move-result v21

    .line 1081
    sget-object v12, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 1082
    .line 1083
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1084
    .line 1085
    .line 1086
    move-result v13

    .line 1087
    invoke-interface {v1, v13}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 1088
    .line 1089
    .line 1090
    move-result v13

    .line 1091
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1092
    .line 1093
    .line 1094
    move-result v9

    .line 1095
    invoke-interface {v1, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 1096
    .line 1097
    .line 1098
    move-result v9

    .line 1099
    new-array v14, v4, [F

    .line 1100
    .line 1101
    aput v13, v14, v3

    .line 1102
    .line 1103
    aput v9, v14, v8

    .line 1104
    .line 1105
    invoke-static {v12, v14, v2, v4, v7}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v25

    .line 1109
    const/16 v26, 0xe

    .line 1110
    .line 1111
    const/16 v27, 0x0

    .line 1112
    .line 1113
    const/16 v22, 0x0

    .line 1114
    .line 1115
    const/16 v23, 0x0

    .line 1116
    .line 1117
    const/16 v24, 0x0

    .line 1118
    .line 1119
    invoke-direct/range {v20 .. v27}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/e;)V

    .line 1120
    .line 1121
    .line 1122
    const/16 v15, 0xe6

    .line 1123
    .line 1124
    const/16 v16, 0x0

    .line 1125
    .line 1126
    move-wide v3, v5

    .line 1127
    const-wide/16 v5, 0x0

    .line 1128
    .line 1129
    const-wide/16 v7, 0x0

    .line 1130
    .line 1131
    const/4 v12, 0x0

    .line 1132
    const/4 v13, 0x0

    .line 1133
    const/4 v14, 0x0

    .line 1134
    move-object v2, v1

    .line 1135
    move-wide v9, v10

    .line 1136
    move-object/from16 v11, v20

    .line 1137
    .line 1138
    invoke-static/range {v2 .. v16}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 1139
    .line 1140
    .line 1141
    return-object v19

    .line 1142
    :pswitch_15
    move-object/from16 v1, p1

    .line 1143
    .line 1144
    check-cast v1, Landroid/content/Context;

    .line 1145
    .line 1146
    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1147
    .line 1148
    .line 1149
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/d;

    .line 1150
    .line 1151
    invoke-direct {v2, v1}, Lcom/zykj/mistake/feature/notebook/detail/d;-><init>(Landroid/content/Context;)V

    .line 1152
    .line 1153
    .line 1154
    return-object v2

    .line 1155
    :pswitch_16
    move v1, v3

    .line 1156
    move-object/from16 v3, p1

    .line 1157
    .line 1158
    check-cast v3, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;

    .line 1159
    .line 1160
    const-string v5, "$this$drawWithContent"

    .line 1161
    .line 1162
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1163
    .line 1164
    .line 1165
    invoke-interface {v3}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    .line 1166
    .line 1167
    .line 1168
    invoke-static/range {v20 .. v21}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v5

    .line 1172
    new-instance v20, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 1173
    .line 1174
    int-to-float v9, v8

    .line 1175
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1176
    .line 1177
    .line 1178
    move-result v9

    .line 1179
    invoke-interface {v3, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 1180
    .line 1181
    .line 1182
    move-result v21

    .line 1183
    sget-object v9, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 1184
    .line 1185
    int-to-float v10, v12

    .line 1186
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1187
    .line 1188
    .line 1189
    move-result v11

    .line 1190
    invoke-interface {v3, v11}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 1191
    .line 1192
    .line 1193
    move-result v11

    .line 1194
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1195
    .line 1196
    .line 1197
    move-result v10

    .line 1198
    invoke-interface {v3, v10}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 1199
    .line 1200
    .line 1201
    move-result v10

    .line 1202
    new-array v12, v4, [F

    .line 1203
    .line 1204
    aput v11, v12, v1

    .line 1205
    .line 1206
    aput v10, v12, v8

    .line 1207
    .line 1208
    invoke-static {v9, v12, v2, v4, v7}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v25

    .line 1212
    const/16 v26, 0xe

    .line 1213
    .line 1214
    const/16 v27, 0x0

    .line 1215
    .line 1216
    const/16 v22, 0x0

    .line 1217
    .line 1218
    const/16 v23, 0x0

    .line 1219
    .line 1220
    const/16 v24, 0x0

    .line 1221
    .line 1222
    invoke-direct/range {v20 .. v27}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/e;)V

    .line 1223
    .line 1224
    .line 1225
    const/16 v16, 0xee

    .line 1226
    .line 1227
    const/16 v17, 0x0

    .line 1228
    .line 1229
    move-wide v4, v5

    .line 1230
    const-wide/16 v6, 0x0

    .line 1231
    .line 1232
    const-wide/16 v8, 0x0

    .line 1233
    .line 1234
    const-wide/16 v10, 0x0

    .line 1235
    .line 1236
    const/4 v13, 0x0

    .line 1237
    const/4 v14, 0x0

    .line 1238
    const/4 v15, 0x0

    .line 1239
    move-object/from16 v12, v20

    .line 1240
    .line 1241
    invoke-static/range {v3 .. v17}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 1242
    .line 1243
    .line 1244
    return-object v19

    .line 1245
    :pswitch_17
    move-object/from16 v1, p1

    .line 1246
    .line 1247
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/o0;

    .line 1248
    .line 1249
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1250
    .line 1251
    .line 1252
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/o0;->f:Ljava/util/List;

    .line 1253
    .line 1254
    return-object v1

    .line 1255
    :pswitch_18
    move-object/from16 v1, p1

    .line 1256
    .line 1257
    check-cast v1, Lcom/zykj/mistake/feature/notebook/detail/o0;

    .line 1258
    .line 1259
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    iget-object v1, v1, Lcom/zykj/mistake/feature/notebook/detail/o0;->d:Ljava/util/List;

    .line 1263
    .line 1264
    return-object v1

    .line 1265
    :pswitch_19
    move-object/from16 v1, p1

    .line 1266
    .line 1267
    check-cast v1, Lcom/zykj/mistake/feature/home/HomeTab;

    .line 1268
    .line 1269
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1270
    .line 1271
    .line 1272
    return-object v19

    .line 1273
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1274
    .line 1275
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/b;

    .line 1276
    .line 1277
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    iget-object v1, v1, Lcom/zykj/mistake/feature/collection/list/b;->a:Ljava/lang/String;

    .line 1281
    .line 1282
    return-object v1

    .line 1283
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1284
    .line 1285
    check-cast v1, Ljava/lang/Integer;

    .line 1286
    .line 1287
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1288
    .line 1289
    .line 1290
    return-object v1

    .line 1291
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1292
    .line 1293
    check-cast v1, Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;

    .line 1294
    .line 1295
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;->getMaxLineSpan()I

    .line 1299
    .line 1300
    .line 1301
    move-result v1

    .line 1302
    invoke-static {v1}, Landroidx/compose/foundation/lazy/grid/LazyGridSpanKt;->GridItemSpan(I)J

    .line 1303
    .line 1304
    .line 1305
    move-result-wide v1

    .line 1306
    invoke-static {v1, v2}, Landroidx/compose/foundation/lazy/grid/GridItemSpan;->box-impl(J)Landroidx/compose/foundation/lazy/grid/GridItemSpan;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v1

    .line 1310
    return-object v1

    .line 1311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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

.class public final synthetic Lcom/zykj/mistake/feature/notebook/list/k1;
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
    iput p1, p0, Lcom/zykj/mistake/feature/notebook/list/k1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/zykj/mistake/feature/notebook/list/k1;->a:I

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const-string v3, "state"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    const-string v6, "draft"

    .line 11
    .line 12
    sget-object v7, Ld6/s;->a:Ld6/s;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const-string v9, "it"

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Landroidx/compose/ui/layout/Placeable$PlacementScope;

    .line 23
    .line 24
    return-object v7

    .line 25
    :pswitch_0
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v7

    .line 33
    :pswitch_1
    return-object p1

    .line 34
    :pswitch_2
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, Lh6/f;

    .line 37
    .line 38
    instance-of v2, v1, Lkotlinx/coroutines/r;

    .line 39
    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    move-object v8, v1

    .line 43
    check-cast v8, Lkotlinx/coroutines/r;

    .line 44
    .line 45
    :cond_0
    return-object v8

    .line 46
    :pswitch_3
    move-object/from16 v1, p1

    .line 47
    .line 48
    check-cast v1, Ly6/c;

    .line 49
    .line 50
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Ly1/a;->s(Ly6/c;)Li7/b;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    invoke-static {v1}, Lm7/y0;->h(Ly6/c;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    new-instance v2, Li7/c;

    .line 66
    .line 67
    invoke-direct {v2, v1}, Li7/c;-><init>(Ly6/c;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v2, v8

    .line 72
    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    .line 73
    .line 74
    invoke-static {v2}, Lkotlin/collections/u;->v(Li7/b;)Li7/b;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    :cond_3
    return-object v8

    .line 79
    :pswitch_4
    move-object/from16 v1, p1

    .line 80
    .line 81
    check-cast v1, Ly6/c;

    .line 82
    .line 83
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Ly1/a;->s(Ly6/c;)Li7/b;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    invoke-static {v1}, Lm7/y0;->h(Ly6/c;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    new-instance v8, Li7/c;

    .line 99
    .line 100
    invoke-direct {v8, v1}, Li7/c;-><init>(Ly6/c;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    move-object v8, v2

    .line 105
    :cond_5
    :goto_1
    return-object v8

    .line 106
    :pswitch_5
    move-object/from16 v1, p1

    .line 107
    .line 108
    check-cast v1, Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v1}, Lcom/zykj/view/dialog/TextEditDialog;->e(Ljava/lang/String;)Ld6/s;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    return-object v1

    .line 115
    :pswitch_6
    move-object/from16 v1, p1

    .line 116
    .line 117
    check-cast v1, Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v1}, Lcom/zykj/view/dialog/TextEditDialog;->c(Ljava/lang/String;)Ld6/s;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    return-object v1

    .line 124
    :pswitch_7
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, Ljava/lang/Throwable;

    .line 127
    .line 128
    invoke-static {v1}, Lcom/zykj/view/board/play/SketchPlayFragment$initView$4;->b(Ljava/lang/Throwable;)Ld6/s;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    return-object v1

    .line 133
    :pswitch_8
    move-object/from16 v1, p1

    .line 134
    .line 135
    check-cast v1, Ljava/lang/Long;

    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 138
    .line 139
    .line 140
    move-result-wide v1

    .line 141
    invoke-static {v1, v2}, Lcom/zykj/view/board/play/PlayActionListener;->e(J)Ld6/s;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    return-object v1

    .line 146
    :pswitch_9
    move-object/from16 v1, p1

    .line 147
    .line 148
    check-cast v1, Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v1}, Lcom/zykj/view/board/evaluation/BlackboardEvaluationFragment;->y(Ljava/lang/String;)Ld6/s;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    return-object v1

    .line 155
    :pswitch_a
    move-object/from16 v1, p1

    .line 156
    .line 157
    check-cast v1, Ljava/lang/Throwable;

    .line 158
    .line 159
    invoke-static {v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$4;->a(Ljava/lang/Throwable;)Ld6/s;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    return-object v1

    .line 164
    :pswitch_b
    move-object/from16 v1, p1

    .line 165
    .line 166
    check-cast v1, Ljava/lang/Throwable;

    .line 167
    .line 168
    invoke-static {v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment$initView$3;->a(Ljava/lang/Throwable;)Ld6/s;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    return-object v1

    .line 173
    :pswitch_c
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, Ljava/lang/Throwable;

    .line 176
    .line 177
    invoke-static {v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->s(Ljava/lang/Throwable;)Ld6/s;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    return-object v1

    .line 182
    :pswitch_d
    move-object/from16 v1, p1

    .line 183
    .line 184
    check-cast v1, Ljava/lang/Throwable;

    .line 185
    .line 186
    invoke-static {v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->j(Ljava/lang/Throwable;)Ld6/s;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    return-object v1

    .line 191
    :pswitch_e
    move-object/from16 v1, p1

    .line 192
    .line 193
    check-cast v1, Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v1}, Lcom/zykj/view/board/board/DialogKt;->d(Ljava/lang/String;)Ld6/s;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    return-object v1

    .line 200
    :pswitch_f
    move-object/from16 v9, p1

    .line 201
    .line 202
    check-cast v9, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    .line 203
    .line 204
    const-string v1, "$this$drawBehind"

    .line 205
    .line 206
    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 210
    .line 211
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 212
    .line 213
    .line 214
    move-result-wide v10

    .line 215
    const/4 v1, 0x4

    .line 216
    int-to-float v1, v1

    .line 217
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    invoke-interface {v9, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    invoke-interface {v9, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    int-to-long v12, v2

    .line 238
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    int-to-long v2, v2

    .line 243
    const/16 v6, 0x20

    .line 244
    .line 245
    shl-long/2addr v12, v6

    .line 246
    const-wide v24, 0xffffffffL

    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    and-long v2, v2, v24

    .line 252
    .line 253
    or-long/2addr v2, v12

    .line 254
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/CornerRadius;->constructor-impl(J)J

    .line 255
    .line 256
    .line 257
    move-result-wide v16

    .line 258
    const/16 v22, 0xf6

    .line 259
    .line 260
    const/16 v23, 0x0

    .line 261
    .line 262
    const-wide/16 v12, 0x0

    .line 263
    .line 264
    const-wide/16 v14, 0x0

    .line 265
    .line 266
    const/16 v18, 0x0

    .line 267
    .line 268
    const/16 v19, 0x0

    .line 269
    .line 270
    const/16 v20, 0x0

    .line 271
    .line 272
    const/16 v21, 0x0

    .line 273
    .line 274
    invoke-static/range {v9 .. v23}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    const-wide v2, 0xffccccccL

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 283
    .line 284
    .line 285
    move-result-wide v2

    .line 286
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    invoke-interface {v9, v10}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    invoke-interface {v9, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 303
    .line 304
    .line 305
    move-result v10

    .line 306
    int-to-long v10, v10

    .line 307
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    int-to-long v12, v1

    .line 312
    shl-long/2addr v10, v6

    .line 313
    and-long v12, v12, v24

    .line 314
    .line 315
    or-long/2addr v10, v12

    .line 316
    invoke-static {v10, v11}, Landroidx/compose/ui/geometry/CornerRadius;->constructor-impl(J)J

    .line 317
    .line 318
    .line 319
    move-result-wide v15

    .line 320
    new-instance v17, Landroidx/compose/ui/graphics/drawscope/Stroke;

    .line 321
    .line 322
    int-to-float v1, v5

    .line 323
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    invoke-interface {v9, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 328
    .line 329
    .line 330
    move-result v18

    .line 331
    sget-object v1, Landroidx/compose/ui/graphics/PathEffect;->Companion:Landroidx/compose/ui/graphics/PathEffect$Companion;

    .line 332
    .line 333
    const/4 v6, 0x3

    .line 334
    int-to-float v6, v6

    .line 335
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 336
    .line 337
    .line 338
    move-result v10

    .line 339
    invoke-interface {v9, v10}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    invoke-interface {v9, v6}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 348
    .line 349
    .line 350
    move-result v6

    .line 351
    const/4 v11, 0x2

    .line 352
    new-array v12, v11, [F

    .line 353
    .line 354
    aput v10, v12, v4

    .line 355
    .line 356
    aput v6, v12, v5

    .line 357
    .line 358
    const/4 v4, 0x0

    .line 359
    invoke-static {v1, v12, v4, v11, v8}, Landroidx/compose/ui/graphics/PathEffect$Companion;->dashPathEffect$default(Landroidx/compose/ui/graphics/PathEffect$Companion;[FFILjava/lang/Object;)Landroidx/compose/ui/graphics/PathEffect;

    .line 360
    .line 361
    .line 362
    move-result-object v22

    .line 363
    const/16 v23, 0xe

    .line 364
    .line 365
    const/16 v24, 0x0

    .line 366
    .line 367
    const/16 v20, 0x0

    .line 368
    .line 369
    invoke-direct/range {v17 .. v24}, Landroidx/compose/ui/graphics/drawscope/Stroke;-><init>(FFIILandroidx/compose/ui/graphics/PathEffect;ILkotlin/jvm/internal/e;)V

    .line 370
    .line 371
    .line 372
    const/16 v21, 0xe6

    .line 373
    .line 374
    const/16 v22, 0x0

    .line 375
    .line 376
    const-wide/16 v11, 0x0

    .line 377
    .line 378
    const-wide/16 v13, 0x0

    .line 379
    .line 380
    const/16 v18, 0x0

    .line 381
    .line 382
    const/16 v19, 0x0

    .line 383
    .line 384
    move-object v8, v9

    .line 385
    move-wide v9, v2

    .line 386
    invoke-static/range {v8 .. v22}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRoundRect-u-Aw5IA$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    return-object v7

    .line 390
    :pswitch_10
    move-object/from16 v1, p1

    .line 391
    .line 392
    check-cast v1, Lcom/zykj/mistake/main/p;

    .line 393
    .line 394
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    iget-boolean v2, v1, Lcom/zykj/mistake/main/p;->k:Z

    .line 398
    .line 399
    xor-int/lit8 v34, v2, 0x1

    .line 400
    .line 401
    const/16 v35, 0x0

    .line 402
    .line 403
    const/16 v36, 0xbff

    .line 404
    .line 405
    const/16 v24, 0x0

    .line 406
    .line 407
    const/16 v25, 0x0

    .line 408
    .line 409
    const/16 v26, 0x0

    .line 410
    .line 411
    const/16 v27, 0x0

    .line 412
    .line 413
    const/16 v28, 0x0

    .line 414
    .line 415
    const/16 v29, 0x0

    .line 416
    .line 417
    const/16 v30, 0x0

    .line 418
    .line 419
    const/16 v31, 0x0

    .line 420
    .line 421
    const/16 v32, 0x0

    .line 422
    .line 423
    const/16 v33, 0x0

    .line 424
    .line 425
    move-object/from16 v23, v1

    .line 426
    .line 427
    invoke-static/range {v23 .. v36}, Lcom/zykj/mistake/main/p;->a(Lcom/zykj/mistake/main/p;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;I)Lcom/zykj/mistake/main/p;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    return-object v1

    .line 432
    :pswitch_11
    move-object/from16 v2, p1

    .line 433
    .line 434
    check-cast v2, Lcom/zykj/mistake/main/p;

    .line 435
    .line 436
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    sget-object v9, Lkotlin/collections/EmptySet;->INSTANCE:Lkotlin/collections/EmptySet;

    .line 440
    .line 441
    const/4 v14, 0x0

    .line 442
    const/16 v15, 0xfbf

    .line 443
    .line 444
    const/4 v3, 0x0

    .line 445
    const/4 v4, 0x0

    .line 446
    const/4 v5, 0x0

    .line 447
    const/4 v6, 0x0

    .line 448
    const/4 v7, 0x0

    .line 449
    const/4 v8, 0x0

    .line 450
    const/4 v10, 0x0

    .line 451
    const/4 v11, 0x0

    .line 452
    const/4 v12, 0x0

    .line 453
    const/4 v13, 0x0

    .line 454
    invoke-static/range {v2 .. v15}, Lcom/zykj/mistake/main/p;->a(Lcom/zykj/mistake/main/p;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;I)Lcom/zykj/mistake/main/p;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    return-object v1

    .line 459
    :pswitch_12
    move-object/from16 v2, p1

    .line 460
    .line 461
    check-cast v2, Lcom/zykj/mistake/main/p;

    .line 462
    .line 463
    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    sget-object v14, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 467
    .line 468
    const/16 v15, 0x3ff

    .line 469
    .line 470
    const/4 v3, 0x0

    .line 471
    const/4 v4, 0x0

    .line 472
    const/4 v5, 0x0

    .line 473
    const/4 v6, 0x0

    .line 474
    const/4 v7, 0x0

    .line 475
    const/4 v8, 0x0

    .line 476
    const/4 v9, 0x0

    .line 477
    const/4 v10, 0x0

    .line 478
    const/4 v11, 0x0

    .line 479
    const/4 v12, 0x0

    .line 480
    const/4 v13, 0x0

    .line 481
    invoke-static/range {v2 .. v15}, Lcom/zykj/mistake/main/p;->a(Lcom/zykj/mistake/main/p;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;I)Lcom/zykj/mistake/main/p;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    return-object v1

    .line 486
    :pswitch_13
    move-object/from16 v1, p1

    .line 487
    .line 488
    check-cast v1, Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 489
    .line 490
    const-string v2, "$this$graphicsLayer"

    .line 491
    .line 492
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    const v2, 0x3c23d70a    # 0.01f

    .line 496
    .line 497
    .line 498
    invoke-interface {v1, v2}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->setAlpha(F)V

    .line 499
    .line 500
    .line 501
    const v2, -0x39e3c000    # -10000.0f

    .line 502
    .line 503
    .line 504
    invoke-interface {v1, v2}, Landroidx/compose/ui/graphics/GraphicsLayerScope;->setTranslationX(F)V

    .line 505
    .line 506
    .line 507
    return-object v7

    .line 508
    :pswitch_14
    move-object/from16 v8, p1

    .line 509
    .line 510
    check-cast v8, Lcom/zykj/mistake/main/p;

    .line 511
    .line 512
    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    const/16 v20, 0x0

    .line 516
    .line 517
    const/16 v21, 0xfc3

    .line 518
    .line 519
    const/4 v9, 0x0

    .line 520
    const/4 v10, 0x0

    .line 521
    const/4 v11, 0x0

    .line 522
    const/4 v12, 0x0

    .line 523
    const/4 v13, 0x0

    .line 524
    const/4 v14, 0x0

    .line 525
    const/4 v15, 0x0

    .line 526
    const/16 v16, 0x0

    .line 527
    .line 528
    const/16 v17, 0x0

    .line 529
    .line 530
    const/16 v18, 0x0

    .line 531
    .line 532
    const/16 v19, 0x0

    .line 533
    .line 534
    invoke-static/range {v8 .. v21}, Lcom/zykj/mistake/main/p;->a(Lcom/zykj/mistake/main/p;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;I)Lcom/zykj/mistake/main/p;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    return-object v1

    .line 539
    :pswitch_15
    move-object/from16 v1, p1

    .line 540
    .line 541
    check-cast v1, Lcom/zykj/mistake/main/a1;

    .line 542
    .line 543
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    new-instance v9, Lcom/zykj/mistake/main/a;

    .line 547
    .line 548
    const/4 v13, 0x0

    .line 549
    const/16 v14, 0x1f

    .line 550
    .line 551
    const-wide/16 v10, 0x0

    .line 552
    .line 553
    const/4 v12, 0x0

    .line 554
    invoke-direct/range {v9 .. v14}, Lcom/zykj/mistake/main/a;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    .line 555
    .line 556
    .line 557
    invoke-static {v1, v8, v9, v2}, Lcom/zykj/mistake/main/a1;->a(Lcom/zykj/mistake/main/a1;Ljava/util/List;Lcom/zykj/mistake/main/a;I)Lcom/zykj/mistake/main/a1;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    return-object v1

    .line 562
    :pswitch_16
    move-object/from16 v1, p1

    .line 563
    .line 564
    check-cast v1, Lcom/zykj/mistake/main/a1;

    .line 565
    .line 566
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    iget-object v3, v1, Lcom/zykj/mistake/main/a1;->d:Lcom/zykj/mistake/main/a;

    .line 570
    .line 571
    if-eqz v3, :cond_6

    .line 572
    .line 573
    const/16 v5, 0xf

    .line 574
    .line 575
    invoke-static {v3, v8, v8, v4, v5}, Lcom/zykj/mistake/main/a;->a(Lcom/zykj/mistake/main/a;Ljava/lang/String;Ljava/lang/String;ZI)Lcom/zykj/mistake/main/a;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    goto :goto_2

    .line 580
    :cond_6
    move-object v3, v8

    .line 581
    :goto_2
    invoke-static {v1, v8, v3, v2}, Lcom/zykj/mistake/main/a1;->a(Lcom/zykj/mistake/main/a1;Ljava/util/List;Lcom/zykj/mistake/main/a;I)Lcom/zykj/mistake/main/a1;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    return-object v1

    .line 586
    :pswitch_17
    move-object/from16 v1, p1

    .line 587
    .line 588
    check-cast v1, Lcom/zykj/mistake/main/a1;

    .line 589
    .line 590
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    iget-object v3, v1, Lcom/zykj/mistake/main/a1;->d:Lcom/zykj/mistake/main/a;

    .line 594
    .line 595
    if-eqz v3, :cond_7

    .line 596
    .line 597
    const-string v5, "\u81ea\u5b9a\u4e49\u6807\u7b7e\u4e0d\u53ef\u91cd\u590d"

    .line 598
    .line 599
    invoke-static {v3, v8, v5, v4, v2}, Lcom/zykj/mistake/main/a;->a(Lcom/zykj/mistake/main/a;Ljava/lang/String;Ljava/lang/String;ZI)Lcom/zykj/mistake/main/a;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    goto :goto_3

    .line 604
    :cond_7
    move-object v3, v8

    .line 605
    :goto_3
    invoke-static {v1, v8, v3, v2}, Lcom/zykj/mistake/main/a1;->a(Lcom/zykj/mistake/main/a1;Ljava/util/List;Lcom/zykj/mistake/main/a;I)Lcom/zykj/mistake/main/a1;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    return-object v1

    .line 610
    :pswitch_18
    move-object/from16 v1, p1

    .line 611
    .line 612
    check-cast v1, Lcom/zykj/mistake/entity/resp/ReviewHomeResp;

    .line 613
    .line 614
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/ReviewHomeResp;->getResult()Lcom/zykj/mistake/entity/resp/ReviewHomeResult;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    return-object v1

    .line 622
    :pswitch_19
    move-object/from16 v1, p1

    .line 623
    .line 624
    check-cast v1, Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;

    .line 625
    .line 626
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/SubmitReviewResultResp;->getResult()Lcom/zykj/mistake/entity/resp/SubmitReviewResult;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    return-object v1

    .line 634
    :pswitch_1a
    move-object/from16 v1, p1

    .line 635
    .line 636
    check-cast v1, Lcom/zykj/mistake/entity/resp/StartReviewSessionResp;

    .line 637
    .line 638
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/StartReviewSessionResp;->getResult()Lcom/zykj/mistake/entity/resp/StartReviewSessionResult;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    return-object v1

    .line 646
    :pswitch_1b
    move-object/from16 v1, p1

    .line 647
    .line 648
    check-cast v1, Lcom/zykj/mistake/entity/resp/GetNextReviewQuestionResp;

    .line 649
    .line 650
    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/GetNextReviewQuestionResp;->getResult()Lcom/zykj/mistake/entity/resp/NextReviewQuestionResult;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    return-object v1

    .line 658
    :pswitch_1c
    move-object/from16 v1, p1

    .line 659
    .line 660
    check-cast v1, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;

    .line 661
    .line 662
    new-instance v2, Lcom/zykj/mistake/data/c;

    .line 663
    .line 664
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;->getResult()Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;->getId()I

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResp;->getResult()Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    invoke-virtual {v1}, Lcom/zykj/mistake/entity/resp/CreateOrUpdateCollectionResult;->getName()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v4

    .line 684
    const/4 v6, 0x0

    .line 685
    const/16 v7, 0x18

    .line 686
    .line 687
    const/4 v5, 0x0

    .line 688
    invoke-direct/range {v2 .. v7}, Lcom/zykj/mistake/data/c;-><init>(Ljava/lang/String;Ljava/lang/String;IZI)V

    .line 689
    .line 690
    .line 691
    return-object v2

    .line 692
    nop

    .line 693
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

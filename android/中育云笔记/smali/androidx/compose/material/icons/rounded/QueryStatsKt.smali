.class public final Landroidx/compose/material/icons/rounded/QueryStatsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _queryStats:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getQueryStats(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/QueryStatsKt;->_queryStats:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v2, "Rounded.QueryStats"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 42
    .line 43
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x4193c28f    # 18.47f

    .line 71
    .line 72
    .line 73
    const v2, 0x419f0a3d    # 19.88f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3f30a3d7    # 0.69f

    .line 80
    .line 81
    .line 82
    const v18, -0x3fd5c28f    # -2.66f

    .line 83
    .line 84
    .line 85
    const v13, 0x3ef5c28f    # 0.48f

    .line 86
    .line 87
    .line 88
    const v14, -0x40bae148    # -0.77f

    .line 89
    .line 90
    .line 91
    const/high16 v15, 0x3f400000    # 0.75f

    .line 92
    .line 93
    const v16, -0x402a3d71    # -1.67f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x3f81eb85    # -3.97f

    .line 100
    .line 101
    .line 102
    const v18, -0x3f79999a    # -4.2f

    .line 103
    .line 104
    .line 105
    const v13, -0x41fae148    # -0.13f

    .line 106
    .line 107
    .line 108
    const v14, -0x3ff66666    # -2.15f

    .line 109
    .line 110
    .line 111
    const v15, -0x40147ae1    # -1.84f

    .line 112
    .line 113
    .line 114
    const v16, -0x3f81eb85    # -3.97f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v17, -0x3f5f5c29    # -5.02f

    .line 121
    .line 122
    .line 123
    const v18, 0x408f0a3d    # 4.47f

    .line 124
    .line 125
    .line 126
    const v13, -0x3fd1eb85    # -2.72f

    .line 127
    .line 128
    .line 129
    const v14, -0x41666666    # -0.3f

    .line 130
    .line 131
    .line 132
    const v15, -0x3f5f5c29    # -5.02f

    .line 133
    .line 134
    .line 135
    const v16, 0x3fe7ae14    # 1.81f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, 0x408fae14    # 4.49f

    .line 142
    .line 143
    .line 144
    const/high16 v18, 0x40900000    # 4.5f

    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const v14, 0x401f5c29    # 2.49f

    .line 148
    .line 149
    .line 150
    const v15, 0x4000a3d7    # 2.01f

    .line 151
    .line 152
    .line 153
    const/high16 v16, 0x40900000    # 4.5f

    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v17, 0x4018f5c3    # 2.39f

    .line 159
    .line 160
    .line 161
    const v18, -0x40cccccd    # -0.7f

    .line 162
    .line 163
    .line 164
    const v13, 0x3f6147ae    # 0.88f

    .line 165
    .line 166
    .line 167
    const/4 v14, 0x0

    .line 168
    const v15, 0x3fd9999a    # 1.7f

    .line 169
    .line 170
    .line 171
    const v16, -0x417ae148    # -0.26f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x401a3d71    # 2.41f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x3fb5c28f    # 1.42f

    .line 184
    .line 185
    .line 186
    const/16 v18, 0x0

    .line 187
    .line 188
    const v13, 0x3ec7ae14    # 0.39f

    .line 189
    .line 190
    .line 191
    const v14, 0x3ec7ae14    # 0.39f

    .line 192
    .line 193
    .line 194
    const v15, 0x3f83d70a    # 1.03f

    .line 195
    .line 196
    .line 197
    const v16, 0x3ec7ae14    # 0.39f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/4 v0, 0x0

    .line 204
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    const v18, -0x404a3d71    # -1.42f

    .line 210
    .line 211
    .line 212
    const v14, -0x413851ec    # -0.39f

    .line 213
    .line 214
    .line 215
    const v15, 0x3ec7ae14    # 0.39f

    .line 216
    .line 217
    .line 218
    const v16, -0x407c28f6    # -1.03f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, 0x4193c28f    # 18.47f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x4180a3d7    # 16.08f

    .line 234
    .line 235
    .line 236
    const v2, 0x4194a3d7    # 18.58f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 243
    .line 244
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 245
    .line 246
    const v13, -0x404f5c29    # -1.38f

    .line 247
    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 251
    .line 252
    const v16, -0x4070a3d7    # -1.12f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const/high16 v17, 0x40200000    # 2.5f

    .line 259
    .line 260
    const/4 v13, 0x0

    .line 261
    const v14, -0x404f5c29    # -1.38f

    .line 262
    .line 263
    .line 264
    const v15, 0x3f8f5c29    # 1.12f

    .line 265
    .line 266
    .line 267
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x3f8f5c29    # 1.12f

    .line 273
    .line 274
    .line 275
    const/high16 v2, 0x40200000    # 2.5f

    .line 276
    .line 277
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x4180a3d7    # 16.08f

    .line 281
    .line 282
    .line 283
    const v18, 0x4194a3d7    # 18.58f

    .line 284
    .line 285
    .line 286
    const v13, 0x4194a3d7    # 18.58f

    .line 287
    .line 288
    .line 289
    const v14, 0x418bae14    # 17.46f

    .line 290
    .line 291
    .line 292
    const v15, 0x418bae14    # 17.46f

    .line 293
    .line 294
    .line 295
    const v16, 0x4194a3d7    # 18.58f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x412147ae    # 10.08f

    .line 305
    .line 306
    .line 307
    const v2, 0x417b851f    # 15.72f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, -0x3ff9999a    # -2.1f

    .line 314
    .line 315
    .line 316
    const v18, 0x3ee66666    # 0.45f

    .line 317
    .line 318
    .line 319
    const v13, -0x40c28f5c    # -0.74f

    .line 320
    .line 321
    .line 322
    const v14, 0x3ca3d70a    # 0.02f

    .line 323
    .line 324
    .line 325
    const v15, -0x40466666    # -1.45f

    .line 326
    .line 327
    .line 328
    const v16, 0x3e3851ec    # 0.18f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, -0x40f33333    # -0.55f

    .line 335
    .line 336
    .line 337
    const v2, -0x40ab851f    # -0.83f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v0, -0x3fbae148    # -3.08f

    .line 344
    .line 345
    .line 346
    const v2, 0x40a051ec    # 5.01f

    .line 347
    .line 348
    .line 349
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v17, -0x4031eb85    # -1.61f

    .line 353
    .line 354
    .line 355
    const v18, 0x3e051eb8    # 0.13f

    .line 356
    .line 357
    .line 358
    const v13, -0x4147ae14    # -0.36f

    .line 359
    .line 360
    .line 361
    const v14, 0x3f147ae1    # 0.58f

    .line 362
    .line 363
    .line 364
    const v15, -0x406a3d71    # -1.17f

    .line 365
    .line 366
    .line 367
    const v16, 0x3f23d70a    # 0.64f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, -0x3ff851ec    # -2.12f

    .line 374
    .line 375
    .line 376
    const v2, -0x3fe1eb85    # -2.47f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, -0x3fbc28f6    # -3.06f

    .line 383
    .line 384
    .line 385
    const v2, 0x409ccccd    # 4.9f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x4047ae14    # -1.44f

    .line 392
    .line 393
    .line 394
    const v18, 0x3e8f5c29    # 0.28f

    .line 395
    .line 396
    .line 397
    const v13, -0x416147ae    # -0.31f

    .line 398
    .line 399
    .line 400
    const v14, 0x3efae148    # 0.49f

    .line 401
    .line 402
    .line 403
    const v15, -0x4087ae14    # -0.97f

    .line 404
    .line 405
    .line 406
    const v16, 0x3f1eb852    # 0.62f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/4 v0, 0x0

    .line 413
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, -0x417ae148    # -0.26f

    .line 417
    .line 418
    .line 419
    const v18, -0x40547ae1    # -1.34f

    .line 420
    .line 421
    .line 422
    const v13, -0x4128f5c3    # -0.42f

    .line 423
    .line 424
    .line 425
    const v14, -0x416147ae    # -0.31f

    .line 426
    .line 427
    .line 428
    const v15, -0x40f5c28f    # -0.54f

    .line 429
    .line 430
    .line 431
    const v16, -0x409c28f6    # -0.89f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x4071eb85    # 3.78f

    .line 438
    .line 439
    .line 440
    const v2, -0x3f3e6666    # -6.05f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, 0x3fce147b    # 1.61f

    .line 447
    .line 448
    .line 449
    const v18, -0x420a3d71    # -0.12f

    .line 450
    .line 451
    .line 452
    const v13, 0x3eb851ec    # 0.36f

    .line 453
    .line 454
    .line 455
    const v14, -0x40ee147b    # -0.57f

    .line 456
    .line 457
    .line 458
    const v15, 0x3f95c28f    # 1.17f

    .line 459
    .line 460
    .line 461
    const v16, -0x40deb852    # -0.63f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v0, 0x41100000    # 9.0f

    .line 468
    .line 469
    const/high16 v2, 0x41480000    # 12.5f

    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x404b851f    # 3.18f

    .line 475
    .line 476
    .line 477
    const v2, -0x3f5a8f5c    # -5.17f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x3fd70a3d    # 1.68f

    .line 484
    .line 485
    .line 486
    const v18, -0x430a3d71    # -0.03f

    .line 487
    .line 488
    .line 489
    const v13, 0x3ec28f5c    # 0.38f

    .line 490
    .line 491
    .line 492
    const v14, -0x40e147ae    # -0.62f

    .line 493
    .line 494
    .line 495
    const v15, 0x3fa3d70a    # 1.28f

    .line 496
    .line 497
    .line 498
    const v16, -0x40dc28f6    # -0.64f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x412147ae    # 10.08f

    .line 505
    .line 506
    .line 507
    const v2, 0x417b851f    # 15.72f

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x412947ae    # 10.58f

    .line 517
    .line 518
    .line 519
    const v2, 0x41927ae1    # 18.31f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, -0x3ffccccd    # -2.05f

    .line 526
    .line 527
    .line 528
    const v18, -0x41051eb8    # -0.49f

    .line 529
    .line 530
    .line 531
    const v13, -0x40dc28f6    # -0.64f

    .line 532
    .line 533
    .line 534
    const v14, -0x4170a3d7    # -0.28f

    .line 535
    .line 536
    .line 537
    const v15, -0x4055c28f    # -1.33f

    .line 538
    .line 539
    .line 540
    const v16, -0x4119999a    # -0.45f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v0, 0x41a66666    # 20.8f

    .line 547
    .line 548
    .line 549
    const v2, 0x4039999a    # 2.9f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v17, 0x3fb70a3d    # 1.43f

    .line 556
    .line 557
    .line 558
    const v18, -0x4175c28f    # -0.27f

    .line 559
    .line 560
    .line 561
    const v13, 0x3e9eb852    # 0.31f

    .line 562
    .line 563
    .line 564
    const v14, -0x41051eb8    # -0.49f

    .line 565
    .line 566
    .line 567
    const v15, 0x3f7851ec    # 0.97f

    .line 568
    .line 569
    .line 570
    const v16, -0x40e3d70a    # -0.61f

    .line 571
    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/4 v0, 0x0

    .line 577
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, 0x3e851eb8    # 0.26f

    .line 581
    .line 582
    .line 583
    const v18, 0x3fab851f    # 1.34f

    .line 584
    .line 585
    .line 586
    const v13, 0x3edc28f6    # 0.43f

    .line 587
    .line 588
    .line 589
    const v14, 0x3e9eb852    # 0.31f

    .line 590
    .line 591
    .line 592
    const v15, 0x3f0a3d71    # 0.54f

    .line 593
    .line 594
    .line 595
    const v16, 0x3f666666    # 0.9f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, 0x412947ae    # 10.58f

    .line 602
    .line 603
    .line 604
    const v2, 0x41927ae1    # 18.31f

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    const/16 v16, 0x3800

    .line 618
    .line 619
    const/16 v17, 0x0

    .line 620
    .line 621
    const/high16 v6, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/high16 v8, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/4 v7, 0x0

    .line 626
    const/high16 v9, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/high16 v12, 0x3f800000    # 1.0f

    .line 629
    .line 630
    const/4 v13, 0x0

    .line 631
    const/4 v14, 0x0

    .line 632
    const/4 v15, 0x0

    .line 633
    const-string v4, ""

    .line 634
    .line 635
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    sput-object v0, Landroidx/compose/material/icons/rounded/QueryStatsKt;->_queryStats:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 644
    .line 645
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/WavingHandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wavingHand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWavingHand(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WavingHandKt;->_wavingHand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WavingHand"

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
    const v0, 0x411ccccd    # 9.8f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c23d71    # 6.07f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, 0x3f35c28f    # 0.71f

    .line 82
    .line 83
    .line 84
    const v13, -0x41b33333    # -0.2f

    .line 85
    .line 86
    .line 87
    const v14, 0x3e4ccccd    # 0.2f

    .line 88
    .line 89
    .line 90
    const v15, -0x41b33333    # -0.2f

    .line 91
    .line 92
    .line 93
    const v16, 0x3f028f5c    # 0.51f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v17, 0x3e8f5c29    # 0.28f

    .line 104
    .line 105
    .line 106
    const v18, 0x407ae148    # 3.92f

    .line 107
    .line 108
    .line 109
    const v13, 0x3f88f5c3    # 1.07f

    .line 110
    .line 111
    .line 112
    const v14, 0x3f88f5c3    # 1.07f

    .line 113
    .line 114
    .line 115
    const v15, 0x3f947ae1    # 1.16f

    .line 116
    .line 117
    .line 118
    const/high16 v16, 0x40300000    # 2.75f

    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v17, 0x3d4ccccd    # 0.05f

    .line 124
    .line 125
    .line 126
    const v18, 0x3f266666    # 0.65f

    .line 127
    .line 128
    .line 129
    const v13, -0x41e66666    # -0.15f

    .line 130
    .line 131
    .line 132
    const v14, 0x3e4ccccd    # 0.2f

    .line 133
    .line 134
    .line 135
    const v15, -0x420a3d71    # -0.12f

    .line 136
    .line 137
    .line 138
    const v16, 0x3ef0a3d7    # 0.47f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, 0x3f428f5c    # 0.76f

    .line 145
    .line 146
    .line 147
    const v18, -0x42b33333    # -0.05f

    .line 148
    .line 149
    .line 150
    const v13, 0x3e6147ae    # 0.22f

    .line 151
    .line 152
    .line 153
    const v14, 0x3e6147ae    # 0.22f

    .line 154
    .line 155
    .line 156
    const v15, 0x3f11eb85    # 0.57f

    .line 157
    .line 158
    .line 159
    const v16, 0x3e428f5c    # 0.19f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, -0x42dc28f6    # -0.04f

    .line 166
    .line 167
    .line 168
    const v18, -0x3f64cccd    # -4.85f

    .line 169
    .line 170
    .line 171
    const v13, 0x3f88f5c3    # 1.07f

    .line 172
    .line 173
    .line 174
    const v14, -0x4048f5c3    # -1.43f

    .line 175
    .line 176
    .line 177
    const v15, 0x3f87ae14    # 1.06f

    .line 178
    .line 179
    .line 180
    const v16, -0x3fa47ae1    # -3.43f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x40f3d70a    # 7.62f

    .line 187
    .line 188
    .line 189
    const v2, -0x3f0c28f6    # -7.62f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, 0x3fe28f5c    # 1.77f

    .line 196
    .line 197
    .line 198
    const/16 v18, 0x0

    .line 199
    .line 200
    const v13, 0x3efae148    # 0.49f

    .line 201
    .line 202
    .line 203
    const v14, -0x41051eb8    # -0.49f

    .line 204
    .line 205
    .line 206
    const v15, 0x3fa3d70a    # 1.28f

    .line 207
    .line 208
    .line 209
    const v16, -0x41051eb8    # -0.49f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x3fe28f5c    # 1.77f

    .line 216
    .line 217
    .line 218
    const v2, 0x3fa3d70a    # 1.28f

    .line 219
    .line 220
    .line 221
    const v4, 0x3efae148    # 0.49f

    .line 222
    .line 223
    .line 224
    const/4 v6, 0x0

    .line 225
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, -0x3f5bd70a    # -5.13f

    .line 229
    .line 230
    .line 231
    const v2, 0x40a428f6    # 5.13f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const v18, 0x3f35c28f    # 0.71f

    .line 240
    .line 241
    .line 242
    const v13, -0x41b33333    # -0.2f

    .line 243
    .line 244
    .line 245
    const v14, 0x3e4ccccd    # 0.2f

    .line 246
    .line 247
    .line 248
    const v15, -0x41b33333    # -0.2f

    .line 249
    .line 250
    .line 251
    const v16, 0x3f028f5c    # 0.51f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x3f35c28f    # 0.71f

    .line 258
    .line 259
    .line 260
    const v2, 0x3e4ccccd    # 0.2f

    .line 261
    .line 262
    .line 263
    const v4, 0x3f028f5c    # 0.51f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v4, v2, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, -0x3f2eb852    # -6.54f

    .line 270
    .line 271
    .line 272
    const v2, 0x40d147ae    # 6.54f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x3fe28f5c    # 1.77f

    .line 279
    .line 280
    .line 281
    const/16 v18, 0x0

    .line 282
    .line 283
    const v13, 0x3efae148    # 0.49f

    .line 284
    .line 285
    .line 286
    const v14, -0x41051eb8    # -0.49f

    .line 287
    .line 288
    .line 289
    const v15, 0x3fa3d70a    # 1.28f

    .line 290
    .line 291
    .line 292
    const v16, -0x41051eb8    # -0.49f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x3fe28f5c    # 1.77f

    .line 299
    .line 300
    .line 301
    const v2, 0x3fa3d70a    # 1.28f

    .line 302
    .line 303
    .line 304
    const v4, 0x3efae148    # 0.49f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, -0x3f2eb852    # -6.54f

    .line 311
    .line 312
    .line 313
    const v2, 0x40d147ae    # 6.54f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/16 v17, 0x0

    .line 320
    .line 321
    const v18, 0x3f35c28f    # 0.71f

    .line 322
    .line 323
    .line 324
    const v13, -0x41b33333    # -0.2f

    .line 325
    .line 326
    .line 327
    const v14, 0x3e4ccccd    # 0.2f

    .line 328
    .line 329
    .line 330
    const v15, -0x41b33333    # -0.2f

    .line 331
    .line 332
    .line 333
    const v16, 0x3f028f5c    # 0.51f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x3f35c28f    # 0.71f

    .line 340
    .line 341
    .line 342
    const v2, 0x3e4ccccd    # 0.2f

    .line 343
    .line 344
    .line 345
    const v4, 0x3f028f5c    # 0.51f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v4, v2, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, 0x40af5c29    # 5.48f

    .line 352
    .line 353
    .line 354
    const v2, -0x3f50a3d7    # -5.48f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x3fe28f5c    # 1.77f

    .line 361
    .line 362
    .line 363
    const/16 v18, 0x0

    .line 364
    .line 365
    const v13, 0x3efae148    # 0.49f

    .line 366
    .line 367
    .line 368
    const v14, -0x41051eb8    # -0.49f

    .line 369
    .line 370
    .line 371
    const v15, 0x3fa3d70a    # 1.28f

    .line 372
    .line 373
    .line 374
    const v16, -0x41051eb8    # -0.49f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x3fe28f5c    # 1.77f

    .line 381
    .line 382
    .line 383
    const v2, 0x3fa3d70a    # 1.28f

    .line 384
    .line 385
    .line 386
    const v4, 0x3efae148    # 0.49f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v0, -0x3f39eb85    # -6.19f

    .line 393
    .line 394
    .line 395
    const v2, 0x40c6147b    # 6.19f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/16 v17, 0x0

    .line 402
    .line 403
    const v18, 0x3f35c28f    # 0.71f

    .line 404
    .line 405
    .line 406
    const v13, -0x41b33333    # -0.2f

    .line 407
    .line 408
    .line 409
    const v14, 0x3e4ccccd    # 0.2f

    .line 410
    .line 411
    .line 412
    const v15, -0x41b33333    # -0.2f

    .line 413
    .line 414
    .line 415
    const v16, 0x3f028f5c    # 0.51f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x3f35c28f    # 0.71f

    .line 422
    .line 423
    .line 424
    const/16 v18, 0x0

    .line 425
    .line 426
    const v13, 0x3e4ccccd    # 0.2f

    .line 427
    .line 428
    .line 429
    const v15, 0x3f028f5c    # 0.51f

    .line 430
    .line 431
    .line 432
    const v16, 0x3e4ccccd    # 0.2f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x40823d71    # 4.07f

    .line 439
    .line 440
    .line 441
    const v2, -0x3f7dc28f    # -4.07f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x3fe28f5c    # 1.77f

    .line 448
    .line 449
    .line 450
    const v13, 0x3efae148    # 0.49f

    .line 451
    .line 452
    .line 453
    const v14, -0x41051eb8    # -0.49f

    .line 454
    .line 455
    .line 456
    const v15, 0x3fa3d70a    # 1.28f

    .line 457
    .line 458
    .line 459
    const v16, -0x41051eb8    # -0.49f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/16 v17, 0x0

    .line 466
    .line 467
    const v18, 0x3fe28f5c    # 1.77f

    .line 468
    .line 469
    .line 470
    const v14, 0x3efae148    # 0.49f

    .line 471
    .line 472
    .line 473
    const v15, 0x3efae148    # 0.49f

    .line 474
    .line 475
    .line 476
    const v16, 0x3fa3d70a    # 1.28f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, -0x3f1dc28f    # -7.07f

    .line 483
    .line 484
    .line 485
    const v2, 0x40e23d71    # 7.07f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, -0x3ec547ae    # -11.67f

    .line 492
    .line 493
    .line 494
    const/16 v18, 0x0

    .line 495
    .line 496
    const v13, -0x3fb1eb85    # -3.22f

    .line 497
    .line 498
    .line 499
    const v14, 0x404e147b    # 3.22f

    .line 500
    .line 501
    .line 502
    const v15, -0x3ef8cccd    # -8.45f

    .line 503
    .line 504
    .line 505
    const v16, 0x404e147b    # 3.22f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, -0x3ef8cccd    # -8.45f

    .line 512
    .line 513
    .line 514
    const v2, -0x3ec547ae    # -11.67f

    .line 515
    .line 516
    .line 517
    const/4 v4, 0x0

    .line 518
    const v6, -0x3fb1eb85    # -3.22f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x40933333    # 4.6f

    .line 525
    .line 526
    .line 527
    const v2, -0x3f6ccccd    # -4.6f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x3fe28f5c    # 1.77f

    .line 534
    .line 535
    .line 536
    const v13, 0x3efae148    # 0.49f

    .line 537
    .line 538
    .line 539
    const v14, -0x41051eb8    # -0.49f

    .line 540
    .line 541
    .line 542
    const v15, 0x3fa3d70a    # 1.28f

    .line 543
    .line 544
    .line 545
    const v16, -0x41051eb8    # -0.49f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/16 v17, 0x0

    .line 552
    .line 553
    const v18, 0x3fe28f5c    # 1.77f

    .line 554
    .line 555
    .line 556
    const v14, 0x3efae148    # 0.49f

    .line 557
    .line 558
    .line 559
    const v15, 0x3efae148    # 0.49f

    .line 560
    .line 561
    .line 562
    const v16, 0x3fa3d70a    # 1.28f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, 0x411ccccd    # 9.8f

    .line 569
    .line 570
    .line 571
    const v2, 0x40c23d71    # 6.07f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v0, 0x40e00000    # 7.0f

    .line 581
    .line 582
    const v2, 0x3fe66666    # 1.8f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v17, -0x40c00000    # -0.75f

    .line 589
    .line 590
    const/high16 v18, -0x40c00000    # -0.75f

    .line 591
    .line 592
    const/4 v13, 0x0

    .line 593
    const v14, -0x412e147b    # -0.41f

    .line 594
    .line 595
    .line 596
    const v15, -0x4151eb85    # -0.34f

    .line 597
    .line 598
    .line 599
    const/high16 v16, -0x40c00000    # -0.75f

    .line 600
    .line 601
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v17, -0x421eb852    # -0.11f

    .line 605
    .line 606
    .line 607
    const v18, 0x3c23d70a    # 0.01f

    .line 608
    .line 609
    .line 610
    const v13, -0x42dc28f6    # -0.04f

    .line 611
    .line 612
    .line 613
    const/4 v14, 0x0

    .line 614
    const v15, -0x4270a3d7    # -0.07f

    .line 615
    .line 616
    .line 617
    const/16 v16, 0x0

    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v17, -0x3f5d70a4    # -5.08f

    .line 623
    .line 624
    .line 625
    const v18, 0x40a28f5c    # 5.08f

    .line 626
    .line 627
    .line 628
    const v13, -0x3fd7ae14    # -2.63f

    .line 629
    .line 630
    .line 631
    const v14, 0x3ec28f5c    # 0.38f

    .line 632
    .line 633
    .line 634
    const v15, -0x3f69999a    # -4.7f

    .line 635
    .line 636
    .line 637
    const v16, 0x401d70a4    # 2.46f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, -0x43dc28f6    # -0.01f

    .line 644
    .line 645
    .line 646
    const v18, 0x3de147ae    # 0.11f

    .line 647
    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    const v14, 0x3cf5c28f    # 0.03f

    .line 651
    .line 652
    .line 653
    const v15, -0x43dc28f6    # -0.01f

    .line 654
    .line 655
    .line 656
    const v16, 0x3d8f5c29    # 0.07f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v17, 0x3fe66666    # 1.8f

    .line 663
    .line 664
    .line 665
    const/high16 v18, 0x40e00000    # 7.0f

    .line 666
    .line 667
    const v13, 0x3f866666    # 1.05f

    .line 668
    .line 669
    .line 670
    const v14, 0x40d51eb8    # 6.66f

    .line 671
    .line 672
    .line 673
    const v15, 0x3fb1eb85    # 1.39f

    .line 674
    .line 675
    .line 676
    const/high16 v16, 0x40e00000    # 7.0f

    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v17, 0x3f3d70a4    # 0.74f

    .line 682
    .line 683
    .line 684
    const v18, -0x40dc28f6    # -0.64f

    .line 685
    .line 686
    .line 687
    const v13, 0x3ec28f5c    # 0.38f

    .line 688
    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    const v15, 0x3f30a3d7    # 0.69f

    .line 692
    .line 693
    .line 694
    const v16, -0x4170a3d7    # -0.28f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v17, 0x4073d70a    # 3.81f

    .line 701
    .line 702
    .line 703
    const v18, -0x3f8c28f6    # -3.81f

    .line 704
    .line 705
    .line 706
    const v13, 0x3e8f5c29    # 0.28f

    .line 707
    .line 708
    .line 709
    const v14, -0x4003d70a    # -1.97f

    .line 710
    .line 711
    .line 712
    const v15, 0x3feb851f    # 1.84f

    .line 713
    .line 714
    .line 715
    const v16, -0x3f9e147b    # -3.53f

    .line 716
    .line 717
    .line 718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v17, 0x40e00000    # 7.0f

    .line 722
    .line 723
    const v18, 0x3fe66666    # 1.8f

    .line 724
    .line 725
    .line 726
    const v13, 0x40d70a3d    # 6.72f

    .line 727
    .line 728
    .line 729
    const v14, 0x401f5c29    # 2.49f

    .line 730
    .line 731
    .line 732
    const/high16 v15, 0x40e00000    # 7.0f

    .line 733
    .line 734
    const v16, 0x400b851f    # 2.18f

    .line 735
    .line 736
    .line 737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v0, 0x41880000    # 17.0f

    .line 744
    .line 745
    const v2, 0x41b1999a    # 22.2f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v17, 0x3f400000    # 0.75f

    .line 752
    .line 753
    const/high16 v18, 0x3f400000    # 0.75f

    .line 754
    .line 755
    const/4 v13, 0x0

    .line 756
    const v14, 0x3ed1eb85    # 0.41f

    .line 757
    .line 758
    .line 759
    const v15, 0x3eae147b    # 0.34f

    .line 760
    .line 761
    .line 762
    const/high16 v16, 0x3f400000    # 0.75f

    .line 763
    .line 764
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v17, 0x3de147ae    # 0.11f

    .line 768
    .line 769
    .line 770
    const v18, -0x43dc28f6    # -0.01f

    .line 771
    .line 772
    .line 773
    const v13, 0x3d23d70a    # 0.04f

    .line 774
    .line 775
    .line 776
    const/4 v14, 0x0

    .line 777
    const v15, 0x3d8f5c29    # 0.07f

    .line 778
    .line 779
    .line 780
    const/16 v16, 0x0

    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v17, 0x40a28f5c    # 5.08f

    .line 786
    .line 787
    .line 788
    const v18, -0x3f5d70a4    # -5.08f

    .line 789
    .line 790
    .line 791
    const v13, 0x402851ec    # 2.63f

    .line 792
    .line 793
    .line 794
    const v14, -0x413d70a4    # -0.38f

    .line 795
    .line 796
    .line 797
    const v15, 0x40966666    # 4.7f

    .line 798
    .line 799
    .line 800
    const v16, -0x3fe28f5c    # -2.46f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v17, 0x3c23d70a    # 0.01f

    .line 807
    .line 808
    .line 809
    const v18, -0x421eb852    # -0.11f

    .line 810
    .line 811
    .line 812
    const/4 v13, 0x0

    .line 813
    const v14, -0x430a3d71    # -0.03f

    .line 814
    .line 815
    .line 816
    const v15, 0x3c23d70a    # 0.01f

    .line 817
    .line 818
    .line 819
    const v16, -0x4270a3d7    # -0.07f

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v17, -0x40c00000    # -0.75f

    .line 826
    .line 827
    const/high16 v18, -0x40c00000    # -0.75f

    .line 828
    .line 829
    const v14, -0x412e147b    # -0.41f

    .line 830
    .line 831
    .line 832
    const v15, -0x4151eb85    # -0.34f

    .line 833
    .line 834
    .line 835
    const/high16 v16, -0x40c00000    # -0.75f

    .line 836
    .line 837
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const v17, -0x40c28f5c    # -0.74f

    .line 841
    .line 842
    .line 843
    const v18, 0x3f23d70a    # 0.64f

    .line 844
    .line 845
    .line 846
    const v13, -0x413d70a4    # -0.38f

    .line 847
    .line 848
    .line 849
    const/4 v14, 0x0

    .line 850
    const v15, -0x40cf5c29    # -0.69f

    .line 851
    .line 852
    .line 853
    const v16, 0x3e8f5c29    # 0.28f

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v17, -0x3f8c28f6    # -3.81f

    .line 860
    .line 861
    .line 862
    const v18, 0x4073d70a    # 3.81f

    .line 863
    .line 864
    .line 865
    const v13, -0x4170a3d7    # -0.28f

    .line 866
    .line 867
    .line 868
    const v14, 0x3ffc28f6    # 1.97f

    .line 869
    .line 870
    .line 871
    const v15, -0x40147ae1    # -1.84f

    .line 872
    .line 873
    .line 874
    const v16, 0x4061eb85    # 3.53f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/high16 v17, 0x41880000    # 17.0f

    .line 881
    .line 882
    const v18, 0x41b1999a    # 22.2f

    .line 883
    .line 884
    .line 885
    const v13, 0x418a3d71    # 17.28f

    .line 886
    .line 887
    .line 888
    const v14, 0x41ac147b    # 21.51f

    .line 889
    .line 890
    .line 891
    const/high16 v15, 0x41880000    # 17.0f

    .line 892
    .line 893
    const v16, 0x41ae8f5c    # 21.82f

    .line 894
    .line 895
    .line 896
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 903
    .line 904
    .line 905
    move-result-object v2

    .line 906
    const/16 v16, 0x3800

    .line 907
    .line 908
    const/16 v17, 0x0

    .line 909
    .line 910
    const/high16 v6, 0x3f800000    # 1.0f

    .line 911
    .line 912
    const/high16 v8, 0x3f800000    # 1.0f

    .line 913
    .line 914
    const/4 v7, 0x0

    .line 915
    const/high16 v9, 0x3f800000    # 1.0f

    .line 916
    .line 917
    const/high16 v12, 0x3f800000    # 1.0f

    .line 918
    .line 919
    const/4 v13, 0x0

    .line 920
    const/4 v14, 0x0

    .line 921
    const/4 v15, 0x0

    .line 922
    const-string v4, ""

    .line 923
    .line 924
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    sput-object v0, Landroidx/compose/material/icons/rounded/WavingHandKt;->_wavingHand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 933
    .line 934
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    return-object v0
.end method

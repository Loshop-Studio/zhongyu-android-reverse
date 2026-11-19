.class public final Landroidx/compose/material/icons/rounded/AllInclusiveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _allInclusive:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAllInclusive(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AllInclusiveKt;->_allInclusive:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AllInclusive"

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
    const v0, 0x41a1c28f    # 20.22f

    .line 71
    .line 72
    .line 73
    const v2, 0x40db851f    # 6.86f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f53851f    # -5.39f

    .line 80
    .line 81
    .line 82
    const v18, 0x3fa51eb8    # 1.29f

    .line 83
    .line 84
    .line 85
    const/high16 v13, -0x40000000    # -2.0f

    .line 86
    .line 87
    const v14, -0x40e66666    # -0.6f

    .line 88
    .line 89
    .line 90
    const v15, -0x3f7e147b    # -4.06f

    .line 91
    .line 92
    .line 93
    const v16, -0x42dc28f6    # -0.04f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x412a8f5c    # 10.66f

    .line 100
    .line 101
    .line 102
    const/high16 v2, 0x41400000    # 12.0f

    .line 103
    .line 104
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v0, 0x4127ae14    # 10.48f

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, 0x3c23d70a    # 0.01f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x40f9999a    # 7.8f

    .line 120
    .line 121
    .line 122
    const v2, 0x41663d71    # 14.39f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v17, -0x3fb851ec    # -3.12f

    .line 129
    .line 130
    .line 131
    const v18, 0x3f6b851f    # 0.92f

    .line 132
    .line 133
    .line 134
    const v13, -0x40b0a3d7    # -0.81f

    .line 135
    .line 136
    .line 137
    const v14, 0x3f4f5c29    # 0.81f

    .line 138
    .line 139
    .line 140
    const v15, -0x40066666    # -1.95f

    .line 141
    .line 142
    .line 143
    const v16, 0x3f933333    # 1.15f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, -0x3fdb851f    # -2.57f

    .line 150
    .line 151
    .line 152
    const v18, -0x3fe0a3d7    # -2.49f

    .line 153
    .line 154
    .line 155
    const/high16 v13, -0x40600000    # -1.25f

    .line 156
    .line 157
    const/high16 v14, -0x41800000    # -0.25f

    .line 158
    .line 159
    const v15, -0x3fee147b    # -2.28f

    .line 160
    .line 161
    .line 162
    const/high16 v16, -0x40600000    # -1.25f

    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, 0x40528f5c    # 3.29f

    .line 168
    .line 169
    .line 170
    const v18, -0x3f79999a    # -4.2f

    .line 171
    .line 172
    .line 173
    const v13, -0x40fae148    # -0.52f

    .line 174
    .line 175
    .line 176
    const v14, -0x3ff147ae    # -2.23f

    .line 177
    .line 178
    .line 179
    const v15, 0x3f947ae1    # 1.16f

    .line 180
    .line 181
    .line 182
    const v16, -0x3f79999a    # -4.2f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, 0x401c28f6    # 2.44f

    .line 189
    .line 190
    .line 191
    const v18, 0x3f83d70a    # 1.03f

    .line 192
    .line 193
    .line 194
    const v13, 0x3f68f5c3    # 0.91f

    .line 195
    .line 196
    .line 197
    const/4 v14, 0x0

    .line 198
    const v15, 0x3fe147ae    # 1.76f

    .line 199
    .line 200
    .line 201
    const v16, 0x3eb33333    # 0.35f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x3ef0a3d7    # 0.47f

    .line 208
    .line 209
    .line 210
    const v2, 0x3ed1eb85    # 0.41f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x3faa3d71    # 1.33f

    .line 217
    .line 218
    .line 219
    const/16 v18, 0x0

    .line 220
    .line 221
    const v13, 0x3ec28f5c    # 0.38f

    .line 222
    .line 223
    .line 224
    const v14, 0x3eae147b    # 0.34f

    .line 225
    .line 226
    .line 227
    const v15, 0x3f733333    # 0.95f

    .line 228
    .line 229
    .line 230
    const v16, 0x3eae147b    # 0.34f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/16 v17, 0x0

    .line 237
    .line 238
    const/high16 v18, -0x40400000    # -1.5f

    .line 239
    .line 240
    const v13, 0x3ee66666    # 0.45f

    .line 241
    .line 242
    .line 243
    const v14, -0x41333333    # -0.4f

    .line 244
    .line 245
    .line 246
    const v15, 0x3ee66666    # 0.45f

    .line 247
    .line 248
    .line 249
    const v16, -0x40733333    # -1.1f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, -0x4147ae14    # -0.36f

    .line 256
    .line 257
    .line 258
    const v2, -0x4128f5c3    # -0.42f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, 0x40accccd    # 5.4f

    .line 265
    .line 266
    .line 267
    const v18, 0x40d3d70a    # 6.62f

    .line 268
    .line 269
    .line 270
    const v13, 0x41033333    # 8.2f

    .line 271
    .line 272
    .line 273
    const v14, 0x40e5c28f    # 7.18f

    .line 274
    .line 275
    .line 276
    const v15, 0x40dae148    # 6.84f

    .line 277
    .line 278
    .line 279
    const v16, 0x40d3d70a    # 6.62f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/16 v17, 0x0

    .line 286
    .line 287
    const/high16 v18, 0x41400000    # 12.0f

    .line 288
    .line 289
    const v13, 0x401ae148    # 2.42f

    .line 290
    .line 291
    .line 292
    const v14, 0x40d3d70a    # 6.62f

    .line 293
    .line 294
    .line 295
    const/4 v15, 0x0

    .line 296
    const v16, 0x4110a3d7    # 9.04f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x401ae148    # 2.42f

    .line 303
    .line 304
    .line 305
    const v2, 0x40accccd    # 5.4f

    .line 306
    .line 307
    .line 308
    const v4, 0x40ac28f6    # 5.38f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v17, 0x407147ae    # 3.77f

    .line 315
    .line 316
    .line 317
    const v18, -0x403c28f6    # -1.53f

    .line 318
    .line 319
    .line 320
    const v13, 0x3fb851ec    # 1.44f

    .line 321
    .line 322
    .line 323
    const/4 v14, 0x0

    .line 324
    const v15, 0x40333333    # 2.8f

    .line 325
    .line 326
    .line 327
    const v16, -0x40f0a3d7    # -0.56f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x40351eb8    # 2.83f

    .line 334
    .line 335
    .line 336
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 337
    .line 338
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x3c23d70a    # 0.01f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x415851ec    # 13.52f

    .line 348
    .line 349
    .line 350
    const/high16 v2, 0x41400000    # 12.0f

    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, -0x43dc28f6    # -0.01f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v0, 0x402c28f6    # 2.69f

    .line 362
    .line 363
    .line 364
    const v2, -0x3fe70a3d    # -2.39f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x4047ae14    # 3.12f

    .line 371
    .line 372
    .line 373
    const v18, -0x40947ae1    # -0.92f

    .line 374
    .line 375
    .line 376
    const v13, 0x3f4f5c29    # 0.81f

    .line 377
    .line 378
    .line 379
    const v14, -0x40b0a3d7    # -0.81f

    .line 380
    .line 381
    .line 382
    const v15, 0x3ff9999a    # 1.95f

    .line 383
    .line 384
    .line 385
    const v16, -0x406ccccd    # -1.15f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x40247ae1    # 2.57f

    .line 392
    .line 393
    .line 394
    const v18, 0x401f5c29    # 2.49f

    .line 395
    .line 396
    .line 397
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 398
    .line 399
    const/high16 v14, 0x3e800000    # 0.25f

    .line 400
    .line 401
    const v15, 0x4011eb85    # 2.28f

    .line 402
    .line 403
    .line 404
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, -0x3fad70a4    # -3.29f

    .line 410
    .line 411
    .line 412
    const v18, 0x40866666    # 4.2f

    .line 413
    .line 414
    .line 415
    const v13, 0x3f051eb8    # 0.52f

    .line 416
    .line 417
    .line 418
    const v14, 0x400eb852    # 2.23f

    .line 419
    .line 420
    .line 421
    const v15, -0x406b851f    # -1.16f

    .line 422
    .line 423
    .line 424
    const v16, 0x40866666    # 4.2f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x3fe3d70a    # -2.44f

    .line 431
    .line 432
    .line 433
    const v18, -0x407c28f6    # -1.03f

    .line 434
    .line 435
    .line 436
    const v13, -0x4099999a    # -0.9f

    .line 437
    .line 438
    .line 439
    const/4 v14, 0x0

    .line 440
    const v15, -0x401eb852    # -1.76f

    .line 441
    .line 442
    .line 443
    const v16, -0x414ccccd    # -0.35f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v0, -0x410a3d71    # -0.48f

    .line 450
    .line 451
    .line 452
    const v2, -0x4128f5c3    # -0.42f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, -0x4055c28f    # -1.33f

    .line 459
    .line 460
    .line 461
    const/16 v18, 0x0

    .line 462
    .line 463
    const v13, -0x413d70a4    # -0.38f

    .line 464
    .line 465
    .line 466
    const v14, -0x4151eb85    # -0.34f

    .line 467
    .line 468
    .line 469
    const v15, -0x408ccccd    # -0.95f

    .line 470
    .line 471
    .line 472
    const v16, -0x4151eb85    # -0.34f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/16 v17, 0x0

    .line 479
    .line 480
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 481
    .line 482
    const v13, -0x4119999a    # -0.45f

    .line 483
    .line 484
    .line 485
    const v14, 0x3ecccccd    # 0.4f

    .line 486
    .line 487
    .line 488
    const v15, -0x4119999a    # -0.45f

    .line 489
    .line 490
    .line 491
    const v16, 0x3f8ccccd    # 1.1f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v0, 0x3ed70a3d    # 0.42f

    .line 498
    .line 499
    .line 500
    const v2, 0x3ebd70a4    # 0.37f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x40747ae1    # 3.82f

    .line 507
    .line 508
    .line 509
    const v18, 0x3fc8f5c3    # 1.57f

    .line 510
    .line 511
    .line 512
    const v13, 0x3f828f5c    # 1.02f

    .line 513
    .line 514
    .line 515
    const v14, 0x3f8147ae    # 1.01f

    .line 516
    .line 517
    .line 518
    const v15, 0x4017ae14    # 2.37f

    .line 519
    .line 520
    .line 521
    const v16, 0x3fc8f5c3    # 1.57f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, 0x40aa8f5c    # 5.33f

    .line 528
    .line 529
    .line 530
    const/high16 v18, -0x3f380000    # -6.25f

    .line 531
    .line 532
    const v13, 0x405147ae    # 3.27f

    .line 533
    .line 534
    .line 535
    const/4 v14, 0x0

    .line 536
    const v15, 0x40bb851f    # 5.86f

    .line 537
    .line 538
    .line 539
    const v16, -0x3fc66666    # -2.9f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, -0x3f933333    # -3.7f

    .line 546
    .line 547
    .line 548
    const v18, -0x3f77ae14    # -4.26f

    .line 549
    .line 550
    .line 551
    const v13, -0x41666666    # -0.3f

    .line 552
    .line 553
    .line 554
    const v14, -0x400147ae    # -1.99f

    .line 555
    .line 556
    .line 557
    const v15, -0x401d70a4    # -1.77f

    .line 558
    .line 559
    .line 560
    const v16, -0x3f93d70a    # -3.69f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    const/16 v16, 0x3800

    .line 574
    .line 575
    const/16 v17, 0x0

    .line 576
    .line 577
    const/high16 v6, 0x3f800000    # 1.0f

    .line 578
    .line 579
    const/high16 v8, 0x3f800000    # 1.0f

    .line 580
    .line 581
    const/4 v7, 0x0

    .line 582
    const/high16 v9, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/high16 v12, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/4 v13, 0x0

    .line 587
    const/4 v14, 0x0

    .line 588
    const/4 v15, 0x0

    .line 589
    const-string v4, ""

    .line 590
    .line 591
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    sput-object v0, Landroidx/compose/material/icons/rounded/AllInclusiveKt;->_allInclusive:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 600
    .line 601
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    return-object v0
.end method

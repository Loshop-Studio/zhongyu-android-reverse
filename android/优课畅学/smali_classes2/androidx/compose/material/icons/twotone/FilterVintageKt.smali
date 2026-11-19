.class public final Landroidx/compose/material/icons/twotone/FilterVintageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filterVintage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilterVintage(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FilterVintageKt;->_filterVintage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FilterVintage"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x40f3851f    # 7.61f

    .line 71
    .line 72
    .line 73
    const v6, 0x4195851f    # 18.69f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v26, 0x3f0a3d71    # 0.54f

    .line 82
    .line 83
    .line 84
    const v21, -0x40cccccd    # -0.7f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, -0x404e147b    # -1.39f

    .line 90
    .line 91
    .line 92
    const v24, 0x3e428f5c    # 0.19f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, -0x40f5c28f    # -0.54f

    .line 101
    .line 102
    .line 103
    const v26, 0x3ebd70a4    # 0.37f

    .line 104
    .line 105
    .line 106
    const v21, -0x41dc28f6    # -0.16f

    .line 107
    .line 108
    .line 109
    const v22, 0x3db851ec    # 0.09f

    .line 110
    .line 111
    .line 112
    const v23, -0x415c28f6    # -0.32f

    .line 113
    .line 114
    .line 115
    const v24, 0x3e570a3d    # 0.21f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, -0x406f5c29    # -1.13f

    .line 122
    .line 123
    .line 124
    const v6, 0x3f666666    # 0.9f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v25, 0x3f3851ec    # 0.72f

    .line 131
    .line 132
    .line 133
    const v26, 0x3f9eb852    # 1.24f

    .line 134
    .line 135
    .line 136
    const v21, 0x3e9eb852    # 0.31f

    .line 137
    .line 138
    .line 139
    const v22, 0x3eb851ec    # 0.36f

    .line 140
    .line 141
    .line 142
    const v23, 0x3f0f5c29    # 0.56f

    .line 143
    .line 144
    .line 145
    const v24, 0x3f47ae14    # 0.78f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, -0x40fae148    # -0.52f

    .line 152
    .line 153
    .line 154
    const v6, 0x3fb0a3d7    # 1.38f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v25, 0x3f147ae1    # 0.58f

    .line 161
    .line 162
    .line 163
    const v26, -0x4175c28f    # -0.27f

    .line 164
    .line 165
    .line 166
    const v21, 0x3e6147ae    # 0.22f

    .line 167
    .line 168
    .line 169
    const v22, -0x425c28f6    # -0.08f

    .line 170
    .line 171
    .line 172
    const v23, 0x3ed1eb85    # 0.41f

    .line 173
    .line 174
    .line 175
    const v24, -0x41d1eb85    # -0.17f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, 0x3fe3d70a    # 1.78f

    .line 182
    .line 183
    .line 184
    const v26, -0x3ff47ae1    # -2.18f

    .line 185
    .line 186
    .line 187
    const v21, 0x3f570a3d    # 0.84f

    .line 188
    .line 189
    .line 190
    const v22, -0x41051eb8    # -0.49f

    .line 191
    .line 192
    .line 193
    const v23, 0x3fbc28f6    # 1.47f

    .line 194
    .line 195
    .line 196
    const v24, -0x405d70a4    # -1.27f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v25, -0x40b5c28f    # -0.79f

    .line 203
    .line 204
    .line 205
    const v26, -0x425c28f6    # -0.08f

    .line 206
    .line 207
    .line 208
    const v21, -0x417ae148    # -0.26f

    .line 209
    .line 210
    .line 211
    const v22, -0x428a3d71    # -0.06f

    .line 212
    .line 213
    .line 214
    const v23, -0x40fae148    # -0.52f

    .line 215
    .line 216
    .line 217
    const v24, -0x425c28f6    # -0.08f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v4, 0x41890a3d    # 17.13f

    .line 227
    .line 228
    .line 229
    const v6, 0x415deb85    # 13.87f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, -0x404f5c29    # -1.38f

    .line 236
    .line 237
    .line 238
    const v6, -0x40fae148    # -0.52f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v25, -0x40cccccd    # -0.7f

    .line 245
    .line 246
    .line 247
    const v26, 0x3f9ae148    # 1.21f

    .line 248
    .line 249
    .line 250
    const v21, -0x41dc28f6    # -0.16f

    .line 251
    .line 252
    .line 253
    const v22, 0x3ee66666    # 0.45f

    .line 254
    .line 255
    .line 256
    const v23, -0x41333333    # -0.4f

    .line 257
    .line 258
    .line 259
    const v24, 0x3f59999a    # 0.85f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v4, 0x3f75c28f    # 0.96f

    .line 266
    .line 267
    .line 268
    const v6, 0x3f933333    # 1.15f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v25, 0x3efae148    # 0.49f

    .line 275
    .line 276
    .line 277
    const v26, 0x3eae147b    # 0.34f

    .line 278
    .line 279
    .line 280
    const v21, 0x3e19999a    # 0.15f

    .line 281
    .line 282
    .line 283
    const v22, 0x3df5c28f    # 0.12f

    .line 284
    .line 285
    .line 286
    const v23, 0x3e9eb852    # 0.31f

    .line 287
    .line 288
    .line 289
    const v24, 0x3e75c28f    # 0.24f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v25, 0x3ffeb852    # 1.99f

    .line 296
    .line 297
    .line 298
    const v26, 0x3f0a3d71    # 0.54f

    .line 299
    .line 300
    .line 301
    const v21, 0x3f1c28f6    # 0.61f

    .line 302
    .line 303
    .line 304
    const v22, 0x3eb33333    # 0.35f

    .line 305
    .line 306
    .line 307
    const v23, 0x3fa66666    # 1.3f

    .line 308
    .line 309
    .line 310
    const v24, 0x3f0a3d71    # 0.54f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v25, 0x3f4ccccd    # 0.8f

    .line 317
    .line 318
    .line 319
    const v26, -0x425c28f6    # -0.08f

    .line 320
    .line 321
    .line 322
    const v21, 0x3e8a3d71    # 0.27f

    .line 323
    .line 324
    .line 325
    const/16 v22, 0x0

    .line 326
    .line 327
    const v23, 0x3f07ae14    # 0.53f

    .line 328
    .line 329
    .line 330
    const v24, -0x430a3d71    # -0.03f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v25, -0x401c28f6    # -1.78f

    .line 337
    .line 338
    .line 339
    const v26, -0x3ff47ae1    # -2.18f

    .line 340
    .line 341
    .line 342
    const v21, -0x416147ae    # -0.31f

    .line 343
    .line 344
    .line 345
    const v22, -0x40970a3d    # -0.91f

    .line 346
    .line 347
    .line 348
    const v23, -0x408f5c29    # -0.94f

    .line 349
    .line 350
    .line 351
    const v24, -0x4027ae14    # -1.69f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v25, -0x40ee147b    # -0.57f

    .line 358
    .line 359
    .line 360
    const v26, -0x4175c28f    # -0.27f

    .line 361
    .line 362
    .line 363
    const v21, -0x41dc28f6    # -0.16f

    .line 364
    .line 365
    .line 366
    const v22, -0x42333333    # -0.1f

    .line 367
    .line 368
    .line 369
    const v23, -0x414ccccd    # -0.35f

    .line 370
    .line 371
    .line 372
    const v24, -0x41bd70a4    # -0.19f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v4, 0x41300000    # 11.0f

    .line 382
    .line 383
    const/high16 v6, 0x40c00000    # 6.0f

    .line 384
    .line 385
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v25, 0x3d4ccccd    # 0.05f

    .line 389
    .line 390
    .line 391
    const v26, 0x3f2147ae    # 0.63f

    .line 392
    .line 393
    .line 394
    const/16 v21, 0x0

    .line 395
    .line 396
    const v22, 0x3e428f5c    # 0.19f

    .line 397
    .line 398
    .line 399
    const v23, 0x3ca3d70a    # 0.02f

    .line 400
    .line 401
    .line 402
    const v24, 0x3ed1eb85    # 0.41f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v4, 0x3fb851ec    # 1.44f

    .line 409
    .line 410
    .line 411
    const v6, 0x3e6b851f    # 0.23f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v25, 0x3f3851ec    # 0.72f

    .line 418
    .line 419
    .line 420
    const v26, -0x4270a3d7    # -0.07f

    .line 421
    .line 422
    .line 423
    const v21, 0x3e75c28f    # 0.24f

    .line 424
    .line 425
    .line 426
    const v22, -0x42dc28f6    # -0.04f

    .line 427
    .line 428
    .line 429
    const v23, 0x3ef5c28f    # 0.48f

    .line 430
    .line 431
    .line 432
    const v24, -0x4270a3d7    # -0.07f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x3ef5c28f    # 0.48f

    .line 439
    .line 440
    .line 441
    const v6, 0x3f35c28f    # 0.71f

    .line 442
    .line 443
    .line 444
    const v7, 0x3d8f5c29    # 0.07f

    .line 445
    .line 446
    .line 447
    const v8, 0x3cf5c28f    # 0.03f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v4, -0x4047ae14    # -1.44f

    .line 454
    .line 455
    .line 456
    const v6, 0x3e6b851f    # 0.23f

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v25, 0x3d75c28f    # 0.06f

    .line 463
    .line 464
    .line 465
    const v26, -0x40deb852    # -0.63f

    .line 466
    .line 467
    .line 468
    const v21, 0x3d23d70a    # 0.04f

    .line 469
    .line 470
    .line 471
    const v22, -0x419eb852    # -0.22f

    .line 472
    .line 473
    .line 474
    const v23, 0x3d75c28f    # 0.06f

    .line 475
    .line 476
    .line 477
    const v24, -0x411eb852    # -0.44f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v25, -0x40800000    # -1.0f

    .line 484
    .line 485
    const v26, -0x3fd7ae14    # -2.63f

    .line 486
    .line 487
    .line 488
    const/16 v21, 0x0

    .line 489
    .line 490
    const v22, -0x40851eb8    # -0.98f

    .line 491
    .line 492
    .line 493
    const v23, -0x41428f5c    # -0.37f

    .line 494
    .line 495
    .line 496
    const v24, -0x400b851f    # -1.91f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v26, 0x402851ec    # 2.63f

    .line 503
    .line 504
    .line 505
    const v21, -0x40deb852    # -0.63f

    .line 506
    .line 507
    .line 508
    const v22, 0x3f3851ec    # 0.72f

    .line 509
    .line 510
    .line 511
    const/high16 v23, -0x40800000    # -1.0f

    .line 512
    .line 513
    const v24, 0x3fd33333    # 1.65f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v4, 0x414b5c29    # 12.71f

    .line 523
    .line 524
    .line 525
    const v6, 0x417ee148    # 15.93f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v25, -0x40ca3d71    # -0.71f

    .line 532
    .line 533
    .line 534
    const v26, 0x3d8f5c29    # 0.07f

    .line 535
    .line 536
    .line 537
    const v21, -0x41947ae1    # -0.23f

    .line 538
    .line 539
    .line 540
    const v22, 0x3d23d70a    # 0.04f

    .line 541
    .line 542
    .line 543
    const v23, -0x410f5c29    # -0.47f

    .line 544
    .line 545
    .line 546
    const v24, 0x3d8f5c29    # 0.07f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v25, -0x40c7ae14    # -0.72f

    .line 553
    .line 554
    .line 555
    const v26, -0x4270a3d7    # -0.07f

    .line 556
    .line 557
    .line 558
    const/high16 v21, -0x41800000    # -0.25f

    .line 559
    .line 560
    const/16 v22, 0x0

    .line 561
    .line 562
    const v23, -0x41051eb8    # -0.49f

    .line 563
    .line 564
    .line 565
    const v24, -0x430a3d71    # -0.03f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v4, -0x419eb852    # -0.22f

    .line 572
    .line 573
    .line 574
    const v6, 0x3fb5c28f    # 1.42f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v25, -0x428a3d71    # -0.06f

    .line 581
    .line 582
    .line 583
    const v26, 0x3f266666    # 0.65f

    .line 584
    .line 585
    .line 586
    const v21, -0x42dc28f6    # -0.04f

    .line 587
    .line 588
    .line 589
    const v22, 0x3e75c28f    # 0.24f

    .line 590
    .line 591
    .line 592
    const v23, -0x428a3d71    # -0.06f

    .line 593
    .line 594
    .line 595
    const v24, 0x3ee66666    # 0.45f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v25, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const v26, 0x402851ec    # 2.63f

    .line 604
    .line 605
    .line 606
    const/16 v21, 0x0

    .line 607
    .line 608
    const v22, 0x3f7ae148    # 0.98f

    .line 609
    .line 610
    .line 611
    const v23, 0x3ebd70a4    # 0.37f

    .line 612
    .line 613
    .line 614
    const v24, 0x3ff47ae1    # 1.91f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v26, -0x3fd7ae14    # -2.63f

    .line 621
    .line 622
    .line 623
    const v21, 0x3f2147ae    # 0.63f

    .line 624
    .line 625
    .line 626
    const v22, -0x40c7ae14    # -0.72f

    .line 627
    .line 628
    .line 629
    const/high16 v23, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const v24, -0x402b851f    # -1.66f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v25, -0x42b33333    # -0.05f

    .line 638
    .line 639
    .line 640
    const v26, -0x40deb852    # -0.63f

    .line 641
    .line 642
    .line 643
    const/16 v21, 0x0

    .line 644
    .line 645
    const v22, -0x41bd70a4    # -0.19f

    .line 646
    .line 647
    .line 648
    const v23, -0x435c28f6    # -0.02f

    .line 649
    .line 650
    .line 651
    const v24, -0x412e147b    # -0.41f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v4, -0x418a3d71    # -0.24f

    .line 658
    .line 659
    .line 660
    const v6, -0x4047ae14    # -1.44f

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v4, 0x4121eb85    # 10.12f

    .line 670
    .line 671
    .line 672
    const v6, 0x40dbd70a    # 6.87f

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v4, 0x3f051eb8    # 0.52f

    .line 679
    .line 680
    .line 681
    const v6, 0x3fb0a3d7    # 1.38f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v25, 0x3f333333    # 0.7f

    .line 688
    .line 689
    .line 690
    const v26, -0x40666666    # -1.2f

    .line 691
    .line 692
    .line 693
    const v21, 0x3e23d70a    # 0.16f

    .line 694
    .line 695
    .line 696
    const v22, -0x411eb852    # -0.44f

    .line 697
    .line 698
    .line 699
    const v23, 0x3ecccccd    # 0.4f

    .line 700
    .line 701
    .line 702
    const v24, -0x40a66666    # -0.85f

    .line 703
    .line 704
    .line 705
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v4, 0x40f9999a    # 7.8f

    .line 709
    .line 710
    .line 711
    const v6, 0x4107d70a    # 8.49f

    .line 712
    .line 713
    .line 714
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v25, -0x41051eb8    # -0.49f

    .line 718
    .line 719
    .line 720
    const v26, -0x414ccccd    # -0.35f

    .line 721
    .line 722
    .line 723
    const v21, -0x41d1eb85    # -0.17f

    .line 724
    .line 725
    .line 726
    const v22, -0x41e66666    # -0.15f

    .line 727
    .line 728
    .line 729
    const v23, -0x4151eb85    # -0.34f

    .line 730
    .line 731
    .line 732
    const v24, -0x4175c28f    # -0.27f

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v25, -0x40000000    # -2.0f

    .line 739
    .line 740
    const v26, -0x40f5c28f    # -0.54f

    .line 741
    .line 742
    .line 743
    const v21, -0x40e147ae    # -0.62f

    .line 744
    .line 745
    .line 746
    const v22, -0x4147ae14    # -0.36f

    .line 747
    .line 748
    .line 749
    const v23, -0x4059999a    # -1.3f

    .line 750
    .line 751
    .line 752
    const v24, -0x40f5c28f    # -0.54f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v25, -0x40b0a3d7    # -0.81f

    .line 759
    .line 760
    .line 761
    const v26, 0x3da3d70a    # 0.08f

    .line 762
    .line 763
    .line 764
    const v21, -0x4175c28f    # -0.27f

    .line 765
    .line 766
    .line 767
    const/16 v22, 0x0

    .line 768
    .line 769
    const v23, -0x40f5c28f    # -0.54f

    .line 770
    .line 771
    .line 772
    const v24, 0x3cf5c28f    # 0.03f

    .line 773
    .line 774
    .line 775
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v25, 0x3fe51eb8    # 1.79f

    .line 779
    .line 780
    .line 781
    const v26, 0x400b851f    # 2.18f

    .line 782
    .line 783
    .line 784
    const v21, 0x3e99999a    # 0.3f

    .line 785
    .line 786
    .line 787
    const v22, 0x3f68f5c3    # 0.91f

    .line 788
    .line 789
    .line 790
    const v23, 0x3f6e147b    # 0.93f

    .line 791
    .line 792
    .line 793
    const v24, 0x3fd70a3d    # 1.68f

    .line 794
    .line 795
    .line 796
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const v25, 0x3f147ae1    # 0.58f

    .line 800
    .line 801
    .line 802
    const v26, 0x3e851eb8    # 0.26f

    .line 803
    .line 804
    .line 805
    const v21, 0x3e2e147b    # 0.17f

    .line 806
    .line 807
    .line 808
    const v22, 0x3db851ec    # 0.09f

    .line 809
    .line 810
    .line 811
    const v23, 0x3eb851ec    # 0.36f

    .line 812
    .line 813
    .line 814
    const v24, 0x3e3851ec    # 0.18f

    .line 815
    .line 816
    .line 817
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const v4, 0x415dc28f    # 13.86f

    .line 824
    .line 825
    .line 826
    const v6, 0x40dbd70a    # 6.87f

    .line 827
    .line 828
    .line 829
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v25, -0x40eb851f    # -0.58f

    .line 833
    .line 834
    .line 835
    const v26, 0x3e8a3d71    # 0.27f

    .line 836
    .line 837
    .line 838
    const v21, -0x419eb852    # -0.22f

    .line 839
    .line 840
    .line 841
    const v22, 0x3da3d70a    # 0.08f

    .line 842
    .line 843
    .line 844
    const v23, -0x412e147b    # -0.41f

    .line 845
    .line 846
    .line 847
    const v24, 0x3e2e147b    # 0.17f

    .line 848
    .line 849
    .line 850
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const v25, -0x401c28f6    # -1.78f

    .line 854
    .line 855
    .line 856
    const v26, 0x400b851f    # 2.18f

    .line 857
    .line 858
    .line 859
    const v21, -0x40a8f5c3    # -0.84f

    .line 860
    .line 861
    .line 862
    const v22, 0x3efae148    # 0.49f

    .line 863
    .line 864
    .line 865
    const v23, -0x4043d70a    # -1.47f

    .line 866
    .line 867
    .line 868
    const v24, 0x3fa28f5c    # 1.27f

    .line 869
    .line 870
    .line 871
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const v25, 0x3f4a3d71    # 0.79f

    .line 875
    .line 876
    .line 877
    const v26, 0x3da3d70a    # 0.08f

    .line 878
    .line 879
    .line 880
    const v21, 0x3e851eb8    # 0.26f

    .line 881
    .line 882
    .line 883
    const v22, 0x3d4ccccd    # 0.05f

    .line 884
    .line 885
    .line 886
    const v23, 0x3f051eb8    # 0.52f

    .line 887
    .line 888
    .line 889
    const v24, 0x3da3d70a    # 0.08f

    .line 890
    .line 891
    .line 892
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/high16 v25, 0x40000000    # 2.0f

    .line 896
    .line 897
    const v26, -0x40f5c28f    # -0.54f

    .line 898
    .line 899
    .line 900
    const v21, 0x3f333333    # 0.7f

    .line 901
    .line 902
    .line 903
    const/16 v22, 0x0

    .line 904
    .line 905
    const v23, 0x3fb1eb85    # 1.39f

    .line 906
    .line 907
    .line 908
    const v24, -0x41bd70a4    # -0.19f

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    const v25, 0x3f0a3d71    # 0.54f

    .line 915
    .line 916
    .line 917
    const v26, -0x41428f5c    # -0.37f

    .line 918
    .line 919
    .line 920
    const v21, 0x3e23d70a    # 0.16f

    .line 921
    .line 922
    .line 923
    const v22, -0x4247ae14    # -0.09f

    .line 924
    .line 925
    .line 926
    const v23, 0x3ea3d70a    # 0.32f

    .line 927
    .line 928
    .line 929
    const v24, -0x41a8f5c3    # -0.21f

    .line 930
    .line 931
    .line 932
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v4, -0x409c28f6    # -0.89f

    .line 936
    .line 937
    .line 938
    const v6, 0x3f90a3d7    # 1.13f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v25, -0x40c7ae14    # -0.72f

    .line 945
    .line 946
    .line 947
    const v26, -0x406147ae    # -1.24f

    .line 948
    .line 949
    .line 950
    const v21, -0x416147ae    # -0.31f

    .line 951
    .line 952
    .line 953
    const v22, -0x4147ae14    # -0.36f

    .line 954
    .line 955
    .line 956
    const v23, -0x40f0a3d7    # -0.56f

    .line 957
    .line 958
    .line 959
    const v24, -0x40b851ec    # -0.78f

    .line 960
    .line 961
    .line 962
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v4, 0x3f028f5c    # 0.51f

    .line 966
    .line 967
    .line 968
    const v6, -0x404f5c29    # -1.38f

    .line 969
    .line 970
    .line 971
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    const/16 v16, 0x3800

    .line 982
    .line 983
    const/16 v17, 0x0

    .line 984
    .line 985
    const v6, 0x3e99999a    # 0.3f

    .line 986
    .line 987
    .line 988
    const v8, 0x3e99999a    # 0.3f

    .line 989
    .line 990
    .line 991
    const/4 v7, 0x0

    .line 992
    const/high16 v9, 0x3f800000    # 1.0f

    .line 993
    .line 994
    const/high16 v12, 0x3f800000    # 1.0f

    .line 995
    .line 996
    const/4 v13, 0x0

    .line 997
    const/4 v14, 0x0

    .line 998
    const/4 v15, 0x0

    .line 999
    const-string v4, ""

    .line 1000
    .line 1001
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1002
    .line 1003
    .line 1004
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1005
    .line 1006
    .line 1007
    move-result v3

    .line 1008
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1009
    .line 1010
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1011
    .line 1012
    .line 1013
    move-result-wide v6

    .line 1014
    const/4 v0, 0x0

    .line 1015
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1019
    .line 1020
    .line 1021
    move-result v10

    .line 1022
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1023
    .line 1024
    .line 1025
    move-result v11

    .line 1026
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1027
    .line 1028
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1029
    .line 1030
    .line 1031
    const v0, 0x4195999a    # 18.7f

    .line 1032
    .line 1033
    .line 1034
    const v2, 0x41466666    # 12.4f

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1038
    .line 1039
    .line 1040
    const v17, -0x40a3d70a    # -0.86f

    .line 1041
    .line 1042
    .line 1043
    const v18, -0x41333333    # -0.4f

    .line 1044
    .line 1045
    .line 1046
    const v13, -0x4170a3d7    # -0.28f

    .line 1047
    .line 1048
    .line 1049
    const v14, -0x41dc28f6    # -0.16f

    .line 1050
    .line 1051
    .line 1052
    const v15, -0x40ee147b    # -0.57f

    .line 1053
    .line 1054
    .line 1055
    const v16, -0x416b851f    # -0.29f

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1059
    .line 1060
    .line 1061
    const v17, 0x3f5c28f6    # 0.86f

    .line 1062
    .line 1063
    .line 1064
    const v13, 0x3e947ae1    # 0.29f

    .line 1065
    .line 1066
    .line 1067
    const v14, -0x421eb852    # -0.11f

    .line 1068
    .line 1069
    .line 1070
    const v15, 0x3f147ae1    # 0.58f

    .line 1071
    .line 1072
    .line 1073
    const v16, -0x418a3d71    # -0.24f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const/high16 v17, 0x40400000    # 3.0f

    .line 1080
    .line 1081
    const v18, -0x3f59eb85    # -5.19f

    .line 1082
    .line 1083
    .line 1084
    const v13, 0x3ff5c28f    # 1.92f

    .line 1085
    .line 1086
    .line 1087
    const v14, -0x4071eb85    # -1.11f

    .line 1088
    .line 1089
    .line 1090
    const v15, 0x403f5c29    # 2.99f

    .line 1091
    .line 1092
    .line 1093
    const v16, -0x3fb851ec    # -3.12f

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const v17, -0x3fbf5c29    # -3.01f

    .line 1100
    .line 1101
    .line 1102
    const v18, -0x40b33333    # -0.8f

    .line 1103
    .line 1104
    .line 1105
    const v13, -0x40970a3d    # -0.91f

    .line 1106
    .line 1107
    .line 1108
    const v14, -0x40fae148    # -0.52f

    .line 1109
    .line 1110
    .line 1111
    const v15, -0x40066666    # -1.95f

    .line 1112
    .line 1113
    .line 1114
    const v16, -0x40b33333    # -0.8f

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const v17, -0x3fc0a3d7    # -2.99f

    .line 1121
    .line 1122
    .line 1123
    const v18, 0x3f4ccccd    # 0.8f

    .line 1124
    .line 1125
    .line 1126
    const v13, -0x407d70a4    # -1.02f

    .line 1127
    .line 1128
    .line 1129
    const/4 v14, 0x0

    .line 1130
    const v15, -0x3ffccccd    # -2.05f

    .line 1131
    .line 1132
    .line 1133
    const v16, 0x3e851eb8    # 0.26f

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const v17, -0x40b851ec    # -0.78f

    .line 1140
    .line 1141
    .line 1142
    const v18, 0x3f0a3d71    # 0.54f

    .line 1143
    .line 1144
    .line 1145
    const v13, -0x4170a3d7    # -0.28f

    .line 1146
    .line 1147
    .line 1148
    const v14, 0x3e23d70a    # 0.16f

    .line 1149
    .line 1150
    .line 1151
    const v15, -0x40f5c28f    # -0.54f

    .line 1152
    .line 1153
    .line 1154
    const v16, 0x3eb33333    # 0.35f

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1158
    .line 1159
    .line 1160
    const v17, 0x3da3d70a    # 0.08f

    .line 1161
    .line 1162
    .line 1163
    const v18, -0x408ccccd    # -0.95f

    .line 1164
    .line 1165
    .line 1166
    const v13, 0x3d4ccccd    # 0.05f

    .line 1167
    .line 1168
    .line 1169
    const v14, -0x416147ae    # -0.31f

    .line 1170
    .line 1171
    .line 1172
    const v15, 0x3da3d70a    # 0.08f

    .line 1173
    .line 1174
    .line 1175
    const v16, -0x40deb852    # -0.63f

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1179
    .line 1180
    .line 1181
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 1182
    .line 1183
    const v18, -0x3f59eb85    # -5.19f

    .line 1184
    .line 1185
    .line 1186
    const/4 v13, 0x0

    .line 1187
    const v14, -0x3ff1eb85    # -2.22f

    .line 1188
    .line 1189
    .line 1190
    const v15, -0x40651eb8    # -1.21f

    .line 1191
    .line 1192
    .line 1193
    const v16, -0x3f7b3333    # -4.15f

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1197
    .line 1198
    .line 1199
    const/high16 v17, 0x41100000    # 9.0f

    .line 1200
    .line 1201
    const/high16 v18, 0x40c00000    # 6.0f

    .line 1202
    .line 1203
    const v13, 0x41235c29    # 10.21f

    .line 1204
    .line 1205
    .line 1206
    const v14, 0x3feccccd    # 1.85f

    .line 1207
    .line 1208
    .line 1209
    const/high16 v15, 0x41100000    # 9.0f

    .line 1210
    .line 1211
    const v16, 0x4071eb85    # 3.78f

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1215
    .line 1216
    .line 1217
    const v17, 0x3da3d70a    # 0.08f

    .line 1218
    .line 1219
    .line 1220
    const v18, 0x3f733333    # 0.95f

    .line 1221
    .line 1222
    .line 1223
    const/4 v13, 0x0

    .line 1224
    const v14, 0x3ea3d70a    # 0.32f

    .line 1225
    .line 1226
    .line 1227
    const v15, 0x3cf5c28f    # 0.03f

    .line 1228
    .line 1229
    .line 1230
    const v16, 0x3f23d70a    # 0.64f

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1234
    .line 1235
    .line 1236
    const v17, -0x40b851ec    # -0.78f

    .line 1237
    .line 1238
    .line 1239
    const v18, -0x40f33333    # -0.55f

    .line 1240
    .line 1241
    .line 1242
    const v13, -0x418a3d71    # -0.24f

    .line 1243
    .line 1244
    .line 1245
    const v14, -0x41b33333    # -0.2f

    .line 1246
    .line 1247
    .line 1248
    const/high16 v15, -0x41000000    # -0.5f

    .line 1249
    .line 1250
    const v16, -0x413851ec    # -0.39f

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1254
    .line 1255
    .line 1256
    const v17, -0x3fc0a3d7    # -2.99f

    .line 1257
    .line 1258
    .line 1259
    const v18, -0x40b33333    # -0.8f

    .line 1260
    .line 1261
    .line 1262
    const v13, -0x408f5c29    # -0.94f

    .line 1263
    .line 1264
    .line 1265
    const v14, -0x40f5c28f    # -0.54f

    .line 1266
    .line 1267
    .line 1268
    const v15, -0x4003d70a    # -1.97f

    .line 1269
    .line 1270
    .line 1271
    const v16, -0x40b33333    # -0.8f

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1275
    .line 1276
    .line 1277
    const v17, -0x3fbf5c29    # -3.01f

    .line 1278
    .line 1279
    .line 1280
    const v18, 0x3f4ccccd    # 0.8f

    .line 1281
    .line 1282
    .line 1283
    const v13, -0x4079999a    # -1.05f

    .line 1284
    .line 1285
    .line 1286
    const/4 v14, 0x0

    .line 1287
    const v15, -0x3ff9999a    # -2.1f

    .line 1288
    .line 1289
    .line 1290
    const v16, 0x3e8f5c29    # 0.28f

    .line 1291
    .line 1292
    .line 1293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1294
    .line 1295
    .line 1296
    const/high16 v17, 0x40400000    # 3.0f

    .line 1297
    .line 1298
    const v18, 0x40a6147b    # 5.19f

    .line 1299
    .line 1300
    .line 1301
    const/4 v13, 0x0

    .line 1302
    const v14, 0x40047ae1    # 2.07f

    .line 1303
    .line 1304
    .line 1305
    const v15, 0x3f88f5c3    # 1.07f

    .line 1306
    .line 1307
    .line 1308
    const v16, 0x40828f5c    # 4.08f

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1312
    .line 1313
    .line 1314
    const v17, 0x3f5c28f6    # 0.86f

    .line 1315
    .line 1316
    .line 1317
    const v18, 0x3ecccccd    # 0.4f

    .line 1318
    .line 1319
    .line 1320
    const v13, 0x3e8f5c29    # 0.28f

    .line 1321
    .line 1322
    .line 1323
    const v14, 0x3e23d70a    # 0.16f

    .line 1324
    .line 1325
    .line 1326
    const v15, 0x3f11eb85    # 0.57f

    .line 1327
    .line 1328
    .line 1329
    const v16, 0x3e947ae1    # 0.29f

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1333
    .line 1334
    .line 1335
    const v17, -0x40a3d70a    # -0.86f

    .line 1336
    .line 1337
    .line 1338
    const v13, -0x416b851f    # -0.29f

    .line 1339
    .line 1340
    .line 1341
    const v14, 0x3de147ae    # 0.11f

    .line 1342
    .line 1343
    .line 1344
    const v15, -0x40eb851f    # -0.58f

    .line 1345
    .line 1346
    .line 1347
    const v16, 0x3e75c28f    # 0.24f

    .line 1348
    .line 1349
    .line 1350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1351
    .line 1352
    .line 1353
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 1354
    .line 1355
    const v18, 0x40a6147b    # 5.19f

    .line 1356
    .line 1357
    .line 1358
    const v13, -0x400a3d71    # -1.92f

    .line 1359
    .line 1360
    .line 1361
    const v14, 0x3f8e147b    # 1.11f

    .line 1362
    .line 1363
    .line 1364
    const v15, -0x3fc0a3d7    # -2.99f

    .line 1365
    .line 1366
    .line 1367
    const v16, 0x4047ae14    # 3.12f

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1371
    .line 1372
    .line 1373
    const v17, 0x4040a3d7    # 3.01f

    .line 1374
    .line 1375
    .line 1376
    const v18, 0x3f4ccccd    # 0.8f

    .line 1377
    .line 1378
    .line 1379
    const v13, 0x3f68f5c3    # 0.91f

    .line 1380
    .line 1381
    .line 1382
    const v14, 0x3f051eb8    # 0.52f

    .line 1383
    .line 1384
    .line 1385
    const v15, 0x3ff9999a    # 1.95f

    .line 1386
    .line 1387
    .line 1388
    const v16, 0x3f4ccccd    # 0.8f

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1392
    .line 1393
    .line 1394
    const v17, 0x403f5c29    # 2.99f

    .line 1395
    .line 1396
    .line 1397
    const v18, -0x40b33333    # -0.8f

    .line 1398
    .line 1399
    .line 1400
    const v13, 0x3f828f5c    # 1.02f

    .line 1401
    .line 1402
    .line 1403
    const/4 v14, 0x0

    .line 1404
    const v15, 0x40033333    # 2.05f

    .line 1405
    .line 1406
    .line 1407
    const v16, -0x417ae148    # -0.26f

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1411
    .line 1412
    .line 1413
    const v17, 0x3f47ae14    # 0.78f

    .line 1414
    .line 1415
    .line 1416
    const v18, -0x40f5c28f    # -0.54f

    .line 1417
    .line 1418
    .line 1419
    const v13, 0x3e8f5c29    # 0.28f

    .line 1420
    .line 1421
    .line 1422
    const v14, -0x41dc28f6    # -0.16f

    .line 1423
    .line 1424
    .line 1425
    const v15, 0x3f0a3d71    # 0.54f

    .line 1426
    .line 1427
    .line 1428
    const v16, -0x414ccccd    # -0.35f

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1432
    .line 1433
    .line 1434
    const v17, -0x425c28f6    # -0.08f

    .line 1435
    .line 1436
    .line 1437
    const v18, 0x3f75c28f    # 0.96f

    .line 1438
    .line 1439
    .line 1440
    const v13, -0x42b33333    # -0.05f

    .line 1441
    .line 1442
    .line 1443
    const v14, 0x3ea3d70a    # 0.32f

    .line 1444
    .line 1445
    .line 1446
    const v15, -0x425c28f6    # -0.08f

    .line 1447
    .line 1448
    .line 1449
    const v16, 0x3f23d70a    # 0.64f

    .line 1450
    .line 1451
    .line 1452
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1453
    .line 1454
    .line 1455
    const/high16 v17, 0x40400000    # 3.0f

    .line 1456
    .line 1457
    const v18, 0x40a6147b    # 5.19f

    .line 1458
    .line 1459
    .line 1460
    const/4 v13, 0x0

    .line 1461
    const v14, 0x400e147b    # 2.22f

    .line 1462
    .line 1463
    .line 1464
    const v15, 0x3f9ae148    # 1.21f

    .line 1465
    .line 1466
    .line 1467
    const v16, 0x4084cccd    # 4.15f

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1471
    .line 1472
    .line 1473
    const v18, -0x3f59eb85    # -5.19f

    .line 1474
    .line 1475
    .line 1476
    const v13, 0x3fe51eb8    # 1.79f

    .line 1477
    .line 1478
    .line 1479
    const v14, -0x407ae148    # -1.04f

    .line 1480
    .line 1481
    .line 1482
    const/high16 v15, 0x40400000    # 3.0f

    .line 1483
    .line 1484
    const v16, -0x3fc1eb85    # -2.97f

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1488
    .line 1489
    .line 1490
    const v17, -0x425c28f6    # -0.08f

    .line 1491
    .line 1492
    .line 1493
    const v18, -0x408ccccd    # -0.95f

    .line 1494
    .line 1495
    .line 1496
    const/4 v13, 0x0

    .line 1497
    const v14, -0x415c28f6    # -0.32f

    .line 1498
    .line 1499
    .line 1500
    const v15, -0x430a3d71    # -0.03f

    .line 1501
    .line 1502
    .line 1503
    const v16, -0x40dc28f6    # -0.64f

    .line 1504
    .line 1505
    .line 1506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1507
    .line 1508
    .line 1509
    const v17, 0x3f47ae14    # 0.78f

    .line 1510
    .line 1511
    .line 1512
    const v18, 0x3f0a3d71    # 0.54f

    .line 1513
    .line 1514
    .line 1515
    const v13, 0x3e75c28f    # 0.24f

    .line 1516
    .line 1517
    .line 1518
    const v14, 0x3e4ccccd    # 0.2f

    .line 1519
    .line 1520
    .line 1521
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1522
    .line 1523
    const v16, 0x3ec28f5c    # 0.38f

    .line 1524
    .line 1525
    .line 1526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1527
    .line 1528
    .line 1529
    const v17, 0x403f5c29    # 2.99f

    .line 1530
    .line 1531
    .line 1532
    const v18, 0x3f4ccccd    # 0.8f

    .line 1533
    .line 1534
    .line 1535
    const v13, 0x3f70a3d7    # 0.94f

    .line 1536
    .line 1537
    .line 1538
    const v14, 0x3f0a3d71    # 0.54f

    .line 1539
    .line 1540
    .line 1541
    const v15, 0x3ffc28f6    # 1.97f

    .line 1542
    .line 1543
    .line 1544
    const v16, 0x3f4ccccd    # 0.8f

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1548
    .line 1549
    .line 1550
    const v17, 0x4040a3d7    # 3.01f

    .line 1551
    .line 1552
    .line 1553
    const v18, -0x40b33333    # -0.8f

    .line 1554
    .line 1555
    .line 1556
    const v13, 0x3f866666    # 1.05f

    .line 1557
    .line 1558
    .line 1559
    const/4 v14, 0x0

    .line 1560
    const v15, 0x40066666    # 2.1f

    .line 1561
    .line 1562
    .line 1563
    const v16, -0x4170a3d7    # -0.28f

    .line 1564
    .line 1565
    .line 1566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1567
    .line 1568
    .line 1569
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 1570
    .line 1571
    const v18, -0x3f59eb85    # -5.19f

    .line 1572
    .line 1573
    .line 1574
    const v13, -0x43dc28f6    # -0.01f

    .line 1575
    .line 1576
    .line 1577
    const v14, -0x3ffb851f    # -2.07f

    .line 1578
    .line 1579
    .line 1580
    const v15, -0x4075c28f    # -1.08f

    .line 1581
    .line 1582
    .line 1583
    const v16, -0x3f7d70a4    # -4.08f

    .line 1584
    .line 1585
    .line 1586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1590
    .line 1591
    .line 1592
    const v0, 0x409051ec    # 4.51f

    .line 1593
    .line 1594
    .line 1595
    const v2, 0x40f5c28f    # 7.68f

    .line 1596
    .line 1597
    .line 1598
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1599
    .line 1600
    .line 1601
    const v17, 0x3f4ccccd    # 0.8f

    .line 1602
    .line 1603
    .line 1604
    const v18, -0x425c28f6    # -0.08f

    .line 1605
    .line 1606
    .line 1607
    const v13, 0x3e851eb8    # 0.26f

    .line 1608
    .line 1609
    .line 1610
    const v14, -0x428a3d71    # -0.06f

    .line 1611
    .line 1612
    .line 1613
    const v15, 0x3f07ae14    # 0.53f

    .line 1614
    .line 1615
    .line 1616
    const v16, -0x425c28f6    # -0.08f

    .line 1617
    .line 1618
    .line 1619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1620
    .line 1621
    .line 1622
    const v17, 0x3ffeb852    # 1.99f

    .line 1623
    .line 1624
    .line 1625
    const v18, 0x3f0a3d71    # 0.54f

    .line 1626
    .line 1627
    .line 1628
    const v13, 0x3f30a3d7    # 0.69f

    .line 1629
    .line 1630
    .line 1631
    const/4 v14, 0x0

    .line 1632
    const v15, 0x3fb0a3d7    # 1.38f

    .line 1633
    .line 1634
    .line 1635
    const v16, 0x3e3851ec    # 0.18f

    .line 1636
    .line 1637
    .line 1638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1639
    .line 1640
    .line 1641
    const v17, 0x3efae148    # 0.49f

    .line 1642
    .line 1643
    .line 1644
    const v18, 0x3eb33333    # 0.35f

    .line 1645
    .line 1646
    .line 1647
    const v13, 0x3e19999a    # 0.15f

    .line 1648
    .line 1649
    .line 1650
    const v14, 0x3db851ec    # 0.09f

    .line 1651
    .line 1652
    .line 1653
    const v15, 0x3ea3d70a    # 0.32f

    .line 1654
    .line 1655
    .line 1656
    const v16, 0x3e4ccccd    # 0.2f

    .line 1657
    .line 1658
    .line 1659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1660
    .line 1661
    .line 1662
    const v0, 0x3f75c28f    # 0.96f

    .line 1663
    .line 1664
    .line 1665
    const v2, 0x3f933333    # 1.15f

    .line 1666
    .line 1667
    .line 1668
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1669
    .line 1670
    .line 1671
    const v17, -0x40cccccd    # -0.7f

    .line 1672
    .line 1673
    .line 1674
    const v18, 0x3f99999a    # 1.2f

    .line 1675
    .line 1676
    .line 1677
    const v13, -0x41666666    # -0.3f

    .line 1678
    .line 1679
    .line 1680
    const v14, 0x3eb851ec    # 0.36f

    .line 1681
    .line 1682
    .line 1683
    const v15, -0x40f851ec    # -0.53f

    .line 1684
    .line 1685
    .line 1686
    const v16, 0x3f428f5c    # 0.76f

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1690
    .line 1691
    .line 1692
    const v0, -0x404f5c29    # -1.38f

    .line 1693
    .line 1694
    .line 1695
    const v2, -0x40fae148    # -0.52f

    .line 1696
    .line 1697
    .line 1698
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1699
    .line 1700
    .line 1701
    const v17, -0x40f0a3d7    # -0.56f

    .line 1702
    .line 1703
    .line 1704
    const v18, -0x4175c28f    # -0.27f

    .line 1705
    .line 1706
    .line 1707
    const v13, -0x41a8f5c3    # -0.21f

    .line 1708
    .line 1709
    .line 1710
    const v14, -0x4247ae14    # -0.09f

    .line 1711
    .line 1712
    .line 1713
    const v15, -0x41333333    # -0.4f

    .line 1714
    .line 1715
    .line 1716
    const v16, -0x41c7ae14    # -0.18f

    .line 1717
    .line 1718
    .line 1719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1720
    .line 1721
    .line 1722
    const v17, -0x401ae148    # -1.79f

    .line 1723
    .line 1724
    .line 1725
    const v18, -0x3ff47ae1    # -2.18f

    .line 1726
    .line 1727
    .line 1728
    const v13, -0x40a147ae    # -0.87f

    .line 1729
    .line 1730
    .line 1731
    const/high16 v14, -0x41000000    # -0.5f

    .line 1732
    .line 1733
    const v15, -0x404147ae    # -1.49f

    .line 1734
    .line 1735
    .line 1736
    const v16, -0x405d70a4    # -1.27f

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1743
    .line 1744
    .line 1745
    const v0, 0x40fae148    # 7.84f

    .line 1746
    .line 1747
    .line 1748
    const v2, 0x4177851f    # 15.47f

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1752
    .line 1753
    .line 1754
    const v17, -0x40f5c28f    # -0.54f

    .line 1755
    .line 1756
    .line 1757
    const v18, 0x3ebd70a4    # 0.37f

    .line 1758
    .line 1759
    .line 1760
    const v13, -0x41a8f5c3    # -0.21f

    .line 1761
    .line 1762
    .line 1763
    const v14, 0x3e2e147b    # 0.17f

    .line 1764
    .line 1765
    .line 1766
    const v15, -0x413d70a4    # -0.38f

    .line 1767
    .line 1768
    .line 1769
    const v16, 0x3e947ae1    # 0.29f

    .line 1770
    .line 1771
    .line 1772
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1773
    .line 1774
    .line 1775
    const/high16 v17, -0x40000000    # -2.0f

    .line 1776
    .line 1777
    const v18, 0x3f0a3d71    # 0.54f

    .line 1778
    .line 1779
    .line 1780
    const v13, -0x40e3d70a    # -0.61f

    .line 1781
    .line 1782
    .line 1783
    const v14, 0x3eb33333    # 0.35f

    .line 1784
    .line 1785
    .line 1786
    const v15, -0x4059999a    # -1.3f

    .line 1787
    .line 1788
    .line 1789
    const v16, 0x3f0a3d71    # 0.54f

    .line 1790
    .line 1791
    .line 1792
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1793
    .line 1794
    .line 1795
    const v17, -0x40b5c28f    # -0.79f

    .line 1796
    .line 1797
    .line 1798
    const v18, -0x425c28f6    # -0.08f

    .line 1799
    .line 1800
    .line 1801
    const v13, -0x4175c28f    # -0.27f

    .line 1802
    .line 1803
    .line 1804
    const/4 v14, 0x0

    .line 1805
    const v15, -0x40f851ec    # -0.53f

    .line 1806
    .line 1807
    .line 1808
    const v16, -0x430a3d71    # -0.03f

    .line 1809
    .line 1810
    .line 1811
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1812
    .line 1813
    .line 1814
    const v17, 0x3fe3d70a    # 1.78f

    .line 1815
    .line 1816
    .line 1817
    const v18, -0x3ff47ae1    # -2.18f

    .line 1818
    .line 1819
    .line 1820
    const v13, 0x3e9eb852    # 0.31f

    .line 1821
    .line 1822
    .line 1823
    const v14, -0x40970a3d    # -0.91f

    .line 1824
    .line 1825
    .line 1826
    const v15, 0x3f70a3d7    # 0.94f

    .line 1827
    .line 1828
    .line 1829
    const v16, -0x4027ae14    # -1.69f

    .line 1830
    .line 1831
    .line 1832
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1833
    .line 1834
    .line 1835
    const v17, 0x3f147ae1    # 0.58f

    .line 1836
    .line 1837
    .line 1838
    const v18, -0x4175c28f    # -0.27f

    .line 1839
    .line 1840
    .line 1841
    const v13, 0x3e2e147b    # 0.17f

    .line 1842
    .line 1843
    .line 1844
    const v14, -0x42333333    # -0.1f

    .line 1845
    .line 1846
    .line 1847
    const v15, 0x3eb851ec    # 0.36f

    .line 1848
    .line 1849
    .line 1850
    const v16, -0x41c7ae14    # -0.18f

    .line 1851
    .line 1852
    .line 1853
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1854
    .line 1855
    .line 1856
    const v0, -0x40fae148    # -0.52f

    .line 1857
    .line 1858
    .line 1859
    const v2, 0x3fb0a3d7    # 1.38f

    .line 1860
    .line 1861
    .line 1862
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1863
    .line 1864
    .line 1865
    const v17, 0x3f3851ec    # 0.72f

    .line 1866
    .line 1867
    .line 1868
    const v18, 0x3f9eb852    # 1.24f

    .line 1869
    .line 1870
    .line 1871
    const v13, 0x3e23d70a    # 0.16f

    .line 1872
    .line 1873
    .line 1874
    const v14, 0x3eeb851f    # 0.46f

    .line 1875
    .line 1876
    .line 1877
    const v15, 0x3ed1eb85    # 0.41f

    .line 1878
    .line 1879
    .line 1880
    const v16, 0x3f6147ae    # 0.88f

    .line 1881
    .line 1882
    .line 1883
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1884
    .line 1885
    .line 1886
    const v0, -0x406f5c29    # -1.13f

    .line 1887
    .line 1888
    .line 1889
    const v2, 0x3f666666    # 0.9f

    .line 1890
    .line 1891
    .line 1892
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1893
    .line 1894
    .line 1895
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1896
    .line 1897
    .line 1898
    const v0, 0x4057ae14    # 3.37f

    .line 1899
    .line 1900
    .line 1901
    const/high16 v2, 0x41400000    # 12.0f

    .line 1902
    .line 1903
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1904
    .line 1905
    .line 1906
    const/high16 v17, 0x3f800000    # 1.0f

    .line 1907
    .line 1908
    const v18, 0x402851ec    # 2.63f

    .line 1909
    .line 1910
    .line 1911
    const v13, 0x3f2147ae    # 0.63f

    .line 1912
    .line 1913
    .line 1914
    const v14, 0x3f3851ec    # 0.72f

    .line 1915
    .line 1916
    .line 1917
    const/high16 v15, 0x3f800000    # 1.0f

    .line 1918
    .line 1919
    const v16, 0x3fd47ae1    # 1.66f

    .line 1920
    .line 1921
    .line 1922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1923
    .line 1924
    .line 1925
    const v17, -0x42b33333    # -0.05f

    .line 1926
    .line 1927
    .line 1928
    const v18, 0x3f2147ae    # 0.63f

    .line 1929
    .line 1930
    .line 1931
    const/4 v13, 0x0

    .line 1932
    const v14, 0x3e428f5c    # 0.19f

    .line 1933
    .line 1934
    .line 1935
    const v15, -0x435c28f6    # -0.02f

    .line 1936
    .line 1937
    .line 1938
    const v16, 0x3ed1eb85    # 0.41f

    .line 1939
    .line 1940
    .line 1941
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1942
    .line 1943
    .line 1944
    const v0, -0x41947ae1    # -0.23f

    .line 1945
    .line 1946
    .line 1947
    const v2, 0x3fb851ec    # 1.44f

    .line 1948
    .line 1949
    .line 1950
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1951
    .line 1952
    .line 1953
    const/high16 v17, 0x41400000    # 12.0f

    .line 1954
    .line 1955
    const/high16 v18, 0x41000000    # 8.0f

    .line 1956
    .line 1957
    const v13, 0x4147ae14    # 12.48f

    .line 1958
    .line 1959
    .line 1960
    const v14, 0x41007ae1    # 8.03f

    .line 1961
    .line 1962
    .line 1963
    const v15, 0x4143d70a    # 12.24f

    .line 1964
    .line 1965
    .line 1966
    const/high16 v16, 0x41000000    # 8.0f

    .line 1967
    .line 1968
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1969
    .line 1970
    .line 1971
    const v0, -0x410a3d71    # -0.48f

    .line 1972
    .line 1973
    .line 1974
    const v2, -0x40ca3d71    # -0.71f

    .line 1975
    .line 1976
    .line 1977
    const v4, 0x3d8f5c29    # 0.07f

    .line 1978
    .line 1979
    .line 1980
    const v6, 0x3cf5c28f    # 0.03f

    .line 1981
    .line 1982
    .line 1983
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1984
    .line 1985
    .line 1986
    const v0, -0x41947ae1    # -0.23f

    .line 1987
    .line 1988
    .line 1989
    const v2, -0x4047ae14    # -1.44f

    .line 1990
    .line 1991
    .line 1992
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1993
    .line 1994
    .line 1995
    const/high16 v17, 0x41300000    # 11.0f

    .line 1996
    .line 1997
    const/high16 v18, 0x40c00000    # 6.0f

    .line 1998
    .line 1999
    const v13, 0x413051ec    # 11.02f

    .line 2000
    .line 2001
    .line 2002
    const v14, 0x40cd1eb8    # 6.41f

    .line 2003
    .line 2004
    .line 2005
    const/high16 v15, 0x41300000    # 11.0f

    .line 2006
    .line 2007
    const v16, 0x40c6147b    # 6.19f

    .line 2008
    .line 2009
    .line 2010
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2011
    .line 2012
    .line 2013
    const/high16 v17, 0x3f800000    # 1.0f

    .line 2014
    .line 2015
    const v18, -0x3fd7ae14    # -2.63f

    .line 2016
    .line 2017
    .line 2018
    const/4 v13, 0x0

    .line 2019
    const v14, -0x40851eb8    # -0.98f

    .line 2020
    .line 2021
    .line 2022
    const v15, 0x3ebd70a4    # 0.37f

    .line 2023
    .line 2024
    .line 2025
    const v16, -0x400b851f    # -1.91f

    .line 2026
    .line 2027
    .line 2028
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2029
    .line 2030
    .line 2031
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2032
    .line 2033
    .line 2034
    const v0, 0x41a50a3d    # 20.63f

    .line 2035
    .line 2036
    .line 2037
    const/high16 v2, 0x41400000    # 12.0f

    .line 2038
    .line 2039
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2040
    .line 2041
    .line 2042
    const/high16 v17, -0x40800000    # -1.0f

    .line 2043
    .line 2044
    const v13, -0x40deb852    # -0.63f

    .line 2045
    .line 2046
    .line 2047
    const v14, -0x40c7ae14    # -0.72f

    .line 2048
    .line 2049
    .line 2050
    const/high16 v15, -0x40800000    # -1.0f

    .line 2051
    .line 2052
    const v16, -0x402b851f    # -1.66f

    .line 2053
    .line 2054
    .line 2055
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2056
    .line 2057
    .line 2058
    const v17, 0x3d75c28f    # 0.06f

    .line 2059
    .line 2060
    .line 2061
    const v18, -0x40d9999a    # -0.65f

    .line 2062
    .line 2063
    .line 2064
    const/4 v13, 0x0

    .line 2065
    const v14, -0x41b33333    # -0.2f

    .line 2066
    .line 2067
    .line 2068
    const v15, 0x3ca3d70a    # 0.02f

    .line 2069
    .line 2070
    .line 2071
    const v16, -0x412e147b    # -0.41f

    .line 2072
    .line 2073
    .line 2074
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2075
    .line 2076
    .line 2077
    const v0, 0x3e6147ae    # 0.22f

    .line 2078
    .line 2079
    .line 2080
    const v2, -0x404a3d71    # -1.42f

    .line 2081
    .line 2082
    .line 2083
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2084
    .line 2085
    .line 2086
    const v17, 0x3f3851ec    # 0.72f

    .line 2087
    .line 2088
    .line 2089
    const v18, 0x3d8f5c29    # 0.07f

    .line 2090
    .line 2091
    .line 2092
    const v13, 0x3e6b851f    # 0.23f

    .line 2093
    .line 2094
    .line 2095
    const v14, 0x3d23d70a    # 0.04f

    .line 2096
    .line 2097
    .line 2098
    const v15, 0x3ef0a3d7    # 0.47f

    .line 2099
    .line 2100
    .line 2101
    const v16, 0x3d8f5c29    # 0.07f

    .line 2102
    .line 2103
    .line 2104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2105
    .line 2106
    .line 2107
    const v17, 0x3f35c28f    # 0.71f

    .line 2108
    .line 2109
    .line 2110
    const v18, -0x4270a3d7    # -0.07f

    .line 2111
    .line 2112
    .line 2113
    const v13, 0x3e75c28f    # 0.24f

    .line 2114
    .line 2115
    .line 2116
    const/4 v14, 0x0

    .line 2117
    const v15, 0x3ef5c28f    # 0.48f

    .line 2118
    .line 2119
    .line 2120
    const v16, -0x430a3d71    # -0.03f

    .line 2121
    .line 2122
    .line 2123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2124
    .line 2125
    .line 2126
    const v0, 0x3fb851ec    # 1.44f

    .line 2127
    .line 2128
    .line 2129
    const v2, 0x3e6b851f    # 0.23f

    .line 2130
    .line 2131
    .line 2132
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2133
    .line 2134
    .line 2135
    const v17, 0x3d75c28f    # 0.06f

    .line 2136
    .line 2137
    .line 2138
    const v18, 0x3f2147ae    # 0.63f

    .line 2139
    .line 2140
    .line 2141
    const v13, 0x3d23d70a    # 0.04f

    .line 2142
    .line 2143
    .line 2144
    const v14, 0x3e6147ae    # 0.22f

    .line 2145
    .line 2146
    .line 2147
    const v15, 0x3d75c28f    # 0.06f

    .line 2148
    .line 2149
    .line 2150
    const v16, 0x3ee147ae    # 0.44f

    .line 2151
    .line 2152
    .line 2153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2154
    .line 2155
    .line 2156
    const/high16 v17, -0x40800000    # -1.0f

    .line 2157
    .line 2158
    const v18, 0x402851ec    # 2.63f

    .line 2159
    .line 2160
    .line 2161
    const/4 v13, 0x0

    .line 2162
    const v14, 0x3f7ae148    # 0.98f

    .line 2163
    .line 2164
    .line 2165
    const v15, -0x41428f5c    # -0.37f

    .line 2166
    .line 2167
    .line 2168
    const v16, 0x3ff47ae1    # 1.91f

    .line 2169
    .line 2170
    .line 2171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2172
    .line 2173
    .line 2174
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2175
    .line 2176
    .line 2177
    const/high16 v0, 0x41600000    # 14.0f

    .line 2178
    .line 2179
    const/high16 v2, 0x41400000    # 12.0f

    .line 2180
    .line 2181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2182
    .line 2183
    .line 2184
    const/high16 v17, -0x40000000    # -2.0f

    .line 2185
    .line 2186
    const/high16 v18, -0x40000000    # -2.0f

    .line 2187
    .line 2188
    const v13, -0x40733333    # -1.1f

    .line 2189
    .line 2190
    .line 2191
    const/4 v14, 0x0

    .line 2192
    const/high16 v15, -0x40000000    # -2.0f

    .line 2193
    .line 2194
    const v16, -0x4099999a    # -0.9f

    .line 2195
    .line 2196
    .line 2197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2198
    .line 2199
    .line 2200
    const/high16 v0, -0x40000000    # -2.0f

    .line 2201
    .line 2202
    const v2, 0x3f666666    # 0.9f

    .line 2203
    .line 2204
    .line 2205
    const/high16 v4, 0x40000000    # 2.0f

    .line 2206
    .line 2207
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2208
    .line 2209
    .line 2210
    const v0, 0x3f666666    # 0.9f

    .line 2211
    .line 2212
    .line 2213
    const/high16 v2, 0x40000000    # 2.0f

    .line 2214
    .line 2215
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2216
    .line 2217
    .line 2218
    const v0, -0x4099999a    # -0.9f

    .line 2219
    .line 2220
    .line 2221
    const/high16 v2, -0x40000000    # -2.0f

    .line 2222
    .line 2223
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2224
    .line 2225
    .line 2226
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2227
    .line 2228
    .line 2229
    const v0, 0x418147ae    # 16.16f

    .line 2230
    .line 2231
    .line 2232
    const v2, 0x410851ec    # 8.52f

    .line 2233
    .line 2234
    .line 2235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2236
    .line 2237
    .line 2238
    const v17, 0x3f0a3d71    # 0.54f

    .line 2239
    .line 2240
    .line 2241
    const v18, -0x41428f5c    # -0.37f

    .line 2242
    .line 2243
    .line 2244
    const v13, 0x3e570a3d    # 0.21f

    .line 2245
    .line 2246
    .line 2247
    const v14, -0x41d1eb85    # -0.17f

    .line 2248
    .line 2249
    .line 2250
    const v15, 0x3ec28f5c    # 0.38f

    .line 2251
    .line 2252
    .line 2253
    const v16, -0x416b851f    # -0.29f

    .line 2254
    .line 2255
    .line 2256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2257
    .line 2258
    .line 2259
    const/high16 v17, 0x40000000    # 2.0f

    .line 2260
    .line 2261
    const v18, -0x40f5c28f    # -0.54f

    .line 2262
    .line 2263
    .line 2264
    const v13, 0x3f1c28f6    # 0.61f

    .line 2265
    .line 2266
    .line 2267
    const v14, -0x414ccccd    # -0.35f

    .line 2268
    .line 2269
    .line 2270
    const v15, 0x3fa66666    # 1.3f

    .line 2271
    .line 2272
    .line 2273
    const v16, -0x40f5c28f    # -0.54f

    .line 2274
    .line 2275
    .line 2276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2277
    .line 2278
    .line 2279
    const v17, 0x3f4a3d71    # 0.79f

    .line 2280
    .line 2281
    .line 2282
    const v18, 0x3da3d70a    # 0.08f

    .line 2283
    .line 2284
    .line 2285
    const v13, 0x3e8a3d71    # 0.27f

    .line 2286
    .line 2287
    .line 2288
    const/4 v14, 0x0

    .line 2289
    const v15, 0x3f07ae14    # 0.53f

    .line 2290
    .line 2291
    .line 2292
    const v16, 0x3cf5c28f    # 0.03f

    .line 2293
    .line 2294
    .line 2295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2296
    .line 2297
    .line 2298
    const v17, -0x401c28f6    # -1.78f

    .line 2299
    .line 2300
    .line 2301
    const v18, 0x400b851f    # 2.18f

    .line 2302
    .line 2303
    .line 2304
    const v13, -0x416147ae    # -0.31f

    .line 2305
    .line 2306
    .line 2307
    const v14, 0x3f68f5c3    # 0.91f

    .line 2308
    .line 2309
    .line 2310
    const v15, -0x408f5c29    # -0.94f

    .line 2311
    .line 2312
    .line 2313
    const v16, 0x3fd851ec    # 1.69f

    .line 2314
    .line 2315
    .line 2316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2317
    .line 2318
    .line 2319
    const v17, -0x40eb851f    # -0.58f

    .line 2320
    .line 2321
    .line 2322
    const v18, 0x3e8a3d71    # 0.27f

    .line 2323
    .line 2324
    .line 2325
    const v13, -0x41d1eb85    # -0.17f

    .line 2326
    .line 2327
    .line 2328
    const v14, 0x3dcccccd    # 0.1f

    .line 2329
    .line 2330
    .line 2331
    const v15, -0x4147ae14    # -0.36f

    .line 2332
    .line 2333
    .line 2334
    const v16, 0x3e3851ec    # 0.18f

    .line 2335
    .line 2336
    .line 2337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2338
    .line 2339
    .line 2340
    const v0, 0x3f051eb8    # 0.52f

    .line 2341
    .line 2342
    .line 2343
    const v2, -0x404f5c29    # -1.38f

    .line 2344
    .line 2345
    .line 2346
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2347
    .line 2348
    .line 2349
    const v17, -0x40c7ae14    # -0.72f

    .line 2350
    .line 2351
    .line 2352
    const v18, -0x406147ae    # -1.24f

    .line 2353
    .line 2354
    .line 2355
    const v14, -0x41147ae1    # -0.46f

    .line 2356
    .line 2357
    .line 2358
    const v15, -0x412e147b    # -0.41f

    .line 2359
    .line 2360
    .line 2361
    const v16, -0x40a147ae    # -0.87f

    .line 2362
    .line 2363
    .line 2364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2365
    .line 2366
    .line 2367
    const v0, -0x4099999a    # -0.9f

    .line 2368
    .line 2369
    .line 2370
    const v2, 0x3f90a3d7    # 1.13f

    .line 2371
    .line 2372
    .line 2373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2374
    .line 2375
    .line 2376
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2377
    .line 2378
    .line 2379
    const v0, 0x41831eb8    # 16.39f

    .line 2380
    .line 2381
    .line 2382
    const v2, 0x4195851f    # 18.69f

    .line 2383
    .line 2384
    .line 2385
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2386
    .line 2387
    .line 2388
    const v17, -0x400147ae    # -1.99f

    .line 2389
    .line 2390
    .line 2391
    const v18, -0x40f5c28f    # -0.54f

    .line 2392
    .line 2393
    .line 2394
    const v13, -0x40cf5c29    # -0.69f

    .line 2395
    .line 2396
    .line 2397
    const/4 v14, 0x0

    .line 2398
    const v15, -0x404f5c29    # -1.38f

    .line 2399
    .line 2400
    .line 2401
    const v16, -0x41c7ae14    # -0.18f

    .line 2402
    .line 2403
    .line 2404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2405
    .line 2406
    .line 2407
    const v17, -0x41051eb8    # -0.49f

    .line 2408
    .line 2409
    .line 2410
    const v18, -0x4151eb85    # -0.34f

    .line 2411
    .line 2412
    .line 2413
    const v13, -0x41c7ae14    # -0.18f

    .line 2414
    .line 2415
    .line 2416
    const v14, -0x42333333    # -0.1f

    .line 2417
    .line 2418
    .line 2419
    const v15, -0x4151eb85    # -0.34f

    .line 2420
    .line 2421
    .line 2422
    const v16, -0x419eb852    # -0.22f

    .line 2423
    .line 2424
    .line 2425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2426
    .line 2427
    .line 2428
    const v0, -0x406ccccd    # -1.15f

    .line 2429
    .line 2430
    .line 2431
    const v2, -0x408a3d71    # -0.96f

    .line 2432
    .line 2433
    .line 2434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2435
    .line 2436
    .line 2437
    const v17, 0x3f333333    # 0.7f

    .line 2438
    .line 2439
    .line 2440
    const v18, -0x40651eb8    # -1.21f

    .line 2441
    .line 2442
    .line 2443
    const v13, 0x3e99999a    # 0.3f

    .line 2444
    .line 2445
    .line 2446
    const v14, -0x4147ae14    # -0.36f

    .line 2447
    .line 2448
    .line 2449
    const v15, 0x3f0a3d71    # 0.54f

    .line 2450
    .line 2451
    .line 2452
    const v16, -0x40bd70a4    # -0.76f

    .line 2453
    .line 2454
    .line 2455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2456
    .line 2457
    .line 2458
    const v0, 0x3f051eb8    # 0.52f

    .line 2459
    .line 2460
    .line 2461
    const v2, 0x3fb0a3d7    # 1.38f

    .line 2462
    .line 2463
    .line 2464
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2465
    .line 2466
    .line 2467
    const v17, 0x3f11eb85    # 0.57f

    .line 2468
    .line 2469
    .line 2470
    const v18, 0x3e851eb8    # 0.26f

    .line 2471
    .line 2472
    .line 2473
    const v13, 0x3e6147ae    # 0.22f

    .line 2474
    .line 2475
    .line 2476
    const v14, 0x3da3d70a    # 0.08f

    .line 2477
    .line 2478
    .line 2479
    const v15, 0x3ed1eb85    # 0.41f

    .line 2480
    .line 2481
    .line 2482
    const v16, 0x3e2e147b    # 0.17f

    .line 2483
    .line 2484
    .line 2485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2486
    .line 2487
    .line 2488
    const v17, 0x3fe3d70a    # 1.78f

    .line 2489
    .line 2490
    .line 2491
    const v18, 0x400b851f    # 2.18f

    .line 2492
    .line 2493
    .line 2494
    const v13, 0x3f59999a    # 0.85f

    .line 2495
    .line 2496
    .line 2497
    const v14, 0x3efae148    # 0.49f

    .line 2498
    .line 2499
    .line 2500
    const v15, 0x3fbc28f6    # 1.47f

    .line 2501
    .line 2502
    .line 2503
    const v16, 0x3fa28f5c    # 1.27f

    .line 2504
    .line 2505
    .line 2506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2507
    .line 2508
    .line 2509
    const v17, -0x40b33333    # -0.8f

    .line 2510
    .line 2511
    .line 2512
    const v18, 0x3db851ec    # 0.09f

    .line 2513
    .line 2514
    .line 2515
    const v13, -0x4175c28f    # -0.27f

    .line 2516
    .line 2517
    .line 2518
    const v14, 0x3d8f5c29    # 0.07f

    .line 2519
    .line 2520
    .line 2521
    const v15, -0x40f5c28f    # -0.54f

    .line 2522
    .line 2523
    .line 2524
    const v16, 0x3db851ec    # 0.09f

    .line 2525
    .line 2526
    .line 2527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2528
    .line 2529
    .line 2530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 2531
    .line 2532
    .line 2533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v2

    .line 2537
    const/16 v16, 0x3800

    .line 2538
    .line 2539
    const/16 v17, 0x0

    .line 2540
    .line 2541
    const/high16 v6, 0x3f800000    # 1.0f

    .line 2542
    .line 2543
    const/high16 v8, 0x3f800000    # 1.0f

    .line 2544
    .line 2545
    const/4 v7, 0x0

    .line 2546
    const/high16 v12, 0x3f800000    # 1.0f

    .line 2547
    .line 2548
    const/4 v13, 0x0

    .line 2549
    const/4 v14, 0x0

    .line 2550
    const/4 v15, 0x0

    .line 2551
    const-string v4, ""

    .line 2552
    .line 2553
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v0

    .line 2557
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2558
    .line 2559
    .line 2560
    move-result-object v0

    .line 2561
    sput-object v0, Landroidx/compose/material/icons/twotone/FilterVintageKt;->_filterVintage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2562
    .line 2563
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2564
    .line 2565
    .line 2566
    return-object v0
.end method

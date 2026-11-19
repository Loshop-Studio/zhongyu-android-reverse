.class public final Landroidx/compose/material/icons/rounded/PoolKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pool:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPool(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Pool"

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
    const v4, 0x40c3851f    # 6.11f

    .line 71
    .line 72
    .line 73
    const v6, 0x40b1eb85    # 5.56f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41100000    # 9.0f

    .line 80
    .line 81
    const/high16 v26, 0x40e00000    # 7.0f

    .line 82
    .line 83
    const v21, 0x40e9999a    # 7.3f

    .line 84
    .line 85
    .line 86
    const v22, 0x40b66666    # 5.7f

    .line 87
    .line 88
    .line 89
    const v23, 0x41023d71    # 8.14f

    .line 90
    .line 91
    .line 92
    const v24, 0x40c47ae1    # 6.14f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v4, 0x3f800000    # 1.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, -0x3fb00000    # -3.25f

    .line 106
    .line 107
    const/high16 v6, 0x40500000    # 3.25f

    .line 108
    .line 109
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v25, 0x3f451eb8    # 0.77f

    .line 113
    .line 114
    .line 115
    const v26, 0x3ec7ae14    # 0.39f

    .line 116
    .line 117
    .line 118
    const v21, 0x3e9eb852    # 0.31f

    .line 119
    .line 120
    .line 121
    const v22, 0x3df5c28f    # 0.12f

    .line 122
    .line 123
    .line 124
    const v23, 0x3f0f5c29    # 0.56f

    .line 125
    .line 126
    .line 127
    const v24, 0x3e8a3d71    # 0.27f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, 0x3f933333    # 1.15f

    .line 134
    .line 135
    .line 136
    const v26, 0x3eb851ec    # 0.36f

    .line 137
    .line 138
    .line 139
    const v21, 0x3ebd70a4    # 0.37f

    .line 140
    .line 141
    .line 142
    const v22, 0x3e6b851f    # 0.23f

    .line 143
    .line 144
    .line 145
    const v23, 0x3f170a3d    # 0.59f

    .line 146
    .line 147
    .line 148
    const v24, 0x3eb851ec    # 0.36f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x3f47ae14    # 0.78f

    .line 155
    .line 156
    .line 157
    const v6, 0x3f933333    # 1.15f

    .line 158
    .line 159
    .line 160
    const v7, -0x41fae148    # -0.13f

    .line 161
    .line 162
    .line 163
    const v8, -0x4147ae14    # -0.36f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v25, 0x400c28f6    # 2.19f

    .line 170
    .line 171
    .line 172
    const v26, -0x40dc28f6    # -0.64f

    .line 173
    .line 174
    .line 175
    const v21, 0x3eeb851f    # 0.46f

    .line 176
    .line 177
    .line 178
    const v22, -0x4175c28f    # -0.27f

    .line 179
    .line 180
    .line 181
    const v23, 0x3f8a3d71    # 1.08f

    .line 182
    .line 183
    .line 184
    const v24, -0x40dc28f6    # -0.64f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, 0x400b851f    # 2.18f

    .line 191
    .line 192
    .line 193
    const v6, 0x3fdd70a4    # 1.73f

    .line 194
    .line 195
    .line 196
    const v7, 0x3f23d70a    # 0.64f

    .line 197
    .line 198
    .line 199
    const v8, 0x3ebd70a4    # 0.37f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v25, 0x3f933333    # 1.15f

    .line 206
    .line 207
    .line 208
    const v26, 0x3eb851ec    # 0.36f

    .line 209
    .line 210
    .line 211
    const v21, 0x3ebd70a4    # 0.37f

    .line 212
    .line 213
    .line 214
    const v22, 0x3e6147ae    # 0.22f

    .line 215
    .line 216
    .line 217
    const v23, 0x3f19999a    # 0.6f

    .line 218
    .line 219
    .line 220
    const v24, 0x3eb851ec    # 0.36f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v26, -0x4147ae14    # -0.36f

    .line 227
    .line 228
    .line 229
    const v21, 0x3f0ccccd    # 0.55f

    .line 230
    .line 231
    .line 232
    const/16 v22, 0x0

    .line 233
    .line 234
    const v23, 0x3f47ae14    # 0.78f

    .line 235
    .line 236
    .line 237
    const v24, -0x41fae148    # -0.13f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v25, 0x3ed1eb85    # 0.41f

    .line 244
    .line 245
    .line 246
    const v26, -0x41947ae1    # -0.23f

    .line 247
    .line 248
    .line 249
    const v21, 0x3df5c28f    # 0.12f

    .line 250
    .line 251
    .line 252
    const v22, -0x4270a3d7    # -0.07f

    .line 253
    .line 254
    .line 255
    const v23, 0x3e851eb8    # 0.26f

    .line 256
    .line 257
    .line 258
    const v24, -0x41e66666    # -0.15f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v4, 0x4127ae14    # 10.48f

    .line 265
    .line 266
    .line 267
    const/high16 v6, 0x40a00000    # 5.0f

    .line 268
    .line 269
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v25, 0x40c9999a    # 6.3f

    .line 273
    .line 274
    .line 275
    const v26, 0x40433333    # 3.05f

    .line 276
    .line 277
    .line 278
    const v21, 0x4113851f    # 9.22f

    .line 279
    .line 280
    .line 281
    const v22, 0x406f5c29    # 3.74f

    .line 282
    .line 283
    .line 284
    const v23, 0x4100a3d7    # 8.04f

    .line 285
    .line 286
    .line 287
    const v24, 0x404ccccd    # 3.2f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v25, 0x40a00000    # 5.0f

    .line 294
    .line 295
    const v26, 0x408851ec    # 4.26f

    .line 296
    .line 297
    .line 298
    const v21, 0x40b33333    # 5.6f

    .line 299
    .line 300
    .line 301
    const v22, 0x403f5c29    # 2.99f

    .line 302
    .line 303
    .line 304
    const/high16 v23, 0x40a00000    # 5.0f

    .line 305
    .line 306
    const v24, 0x4063d70a    # 3.56f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, 0x3db851ec    # 0.09f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v25, 0x3f8e147b    # 1.11f

    .line 319
    .line 320
    .line 321
    const v26, 0x3f9ae148    # 1.21f

    .line 322
    .line 323
    .line 324
    const/16 v21, 0x0

    .line 325
    .line 326
    const v22, 0x3f2147ae    # 0.63f

    .line 327
    .line 328
    .line 329
    const v23, 0x3efae148    # 0.49f

    .line 330
    .line 331
    .line 332
    const v24, 0x3f90a3d7    # 1.13f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v4, 0x41aacccd    # 21.35f

    .line 342
    .line 343
    .line 344
    const v6, 0x419747ae    # 18.91f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v25, -0x41000000    # -0.5f

    .line 351
    .line 352
    const v26, -0x4175c28f    # -0.27f

    .line 353
    .line 354
    .line 355
    const v21, -0x41d1eb85    # -0.17f

    .line 356
    .line 357
    .line 358
    const v22, -0x428a3d71    # -0.06f

    .line 359
    .line 360
    .line 361
    const v23, -0x415c28f6    # -0.32f

    .line 362
    .line 363
    .line 364
    const v24, -0x41e66666    # -0.15f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v25, -0x3ff47ae1    # -2.18f

    .line 371
    .line 372
    .line 373
    const v26, -0x40dc28f6    # -0.64f

    .line 374
    .line 375
    .line 376
    const v21, -0x4119999a    # -0.45f

    .line 377
    .line 378
    .line 379
    const v22, -0x4175c28f    # -0.27f

    .line 380
    .line 381
    .line 382
    const v23, -0x40770a3d    # -1.07f

    .line 383
    .line 384
    .line 385
    const v24, -0x40dc28f6    # -0.64f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v4, -0x3ff47ae1    # -2.18f

    .line 392
    .line 393
    .line 394
    const v6, -0x40228f5c    # -1.73f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v25, -0x406ccccd    # -1.15f

    .line 401
    .line 402
    .line 403
    const v26, 0x3eb851ec    # 0.36f

    .line 404
    .line 405
    .line 406
    const v21, -0x41428f5c    # -0.37f

    .line 407
    .line 408
    .line 409
    const v22, 0x3e6b851f    # 0.23f

    .line 410
    .line 411
    .line 412
    const v23, -0x40e66666    # -0.6f

    .line 413
    .line 414
    .line 415
    const v24, 0x3eb851ec    # 0.36f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v26, -0x4147ae14    # -0.36f

    .line 422
    .line 423
    .line 424
    const v21, -0x40f33333    # -0.55f

    .line 425
    .line 426
    .line 427
    const/16 v22, 0x0

    .line 428
    .line 429
    const v23, -0x40b851ec    # -0.78f

    .line 430
    .line 431
    .line 432
    const v24, -0x41f0a3d7    # -0.14f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v25, -0x3ff47ae1    # -2.18f

    .line 439
    .line 440
    .line 441
    const v26, -0x40dc28f6    # -0.64f

    .line 442
    .line 443
    .line 444
    const v21, -0x4119999a    # -0.45f

    .line 445
    .line 446
    .line 447
    const v22, -0x4175c28f    # -0.27f

    .line 448
    .line 449
    .line 450
    const v23, -0x40770a3d    # -1.07f

    .line 451
    .line 452
    .line 453
    const v24, -0x40dc28f6    # -0.64f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v4, -0x3ff3d70a    # -2.19f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v25, -0x406ccccd    # -1.15f

    .line 466
    .line 467
    .line 468
    const v26, 0x3eb851ec    # 0.36f

    .line 469
    .line 470
    .line 471
    const v21, -0x41428f5c    # -0.37f

    .line 472
    .line 473
    .line 474
    const v22, 0x3e6b851f    # 0.23f

    .line 475
    .line 476
    .line 477
    const v23, -0x40e8f5c3    # -0.59f

    .line 478
    .line 479
    .line 480
    const v24, 0x3eb851ec    # 0.36f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v4, -0x406ccccd    # -1.15f

    .line 487
    .line 488
    .line 489
    const v6, -0x40b851ec    # -0.78f

    .line 490
    .line 491
    .line 492
    const v7, -0x41fae148    # -0.13f

    .line 493
    .line 494
    .line 495
    const v8, -0x4147ae14    # -0.36f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v25, -0x3ff47ae1    # -2.18f

    .line 502
    .line 503
    .line 504
    const v26, -0x40dc28f6    # -0.64f

    .line 505
    .line 506
    .line 507
    const v21, -0x4119999a    # -0.45f

    .line 508
    .line 509
    .line 510
    const v22, -0x4175c28f    # -0.27f

    .line 511
    .line 512
    .line 513
    const v23, -0x40770a3d    # -1.07f

    .line 514
    .line 515
    .line 516
    const v24, -0x40dc28f6    # -0.64f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v4, -0x3ff3d70a    # -2.19f

    .line 523
    .line 524
    .line 525
    const v6, -0x40228f5c    # -1.73f

    .line 526
    .line 527
    .line 528
    const v7, 0x3f23d70a    # 0.64f

    .line 529
    .line 530
    .line 531
    const v8, 0x3ebd70a4    # 0.37f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v25, -0x41000000    # -0.5f

    .line 538
    .line 539
    const v26, 0x3e8a3d71    # 0.27f

    .line 540
    .line 541
    .line 542
    const v21, -0x41c7ae14    # -0.18f

    .line 543
    .line 544
    .line 545
    const v22, 0x3de147ae    # 0.11f

    .line 546
    .line 547
    .line 548
    const v23, -0x41570a3d    # -0.33f

    .line 549
    .line 550
    .line 551
    const v24, 0x3e4ccccd    # 0.2f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v25, -0x40d9999a    # -0.65f

    .line 558
    .line 559
    .line 560
    const v26, 0x3f59999a    # 0.85f

    .line 561
    .line 562
    .line 563
    const v21, -0x413d70a4    # -0.38f

    .line 564
    .line 565
    .line 566
    const v22, 0x3e051eb8    # 0.13f

    .line 567
    .line 568
    .line 569
    const v23, -0x40d9999a    # -0.65f

    .line 570
    .line 571
    .line 572
    const v24, 0x3ee66666    # 0.45f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v4, 0x3df5c28f    # 0.12f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v25, 0x3fa66666    # 1.3f

    .line 585
    .line 586
    .line 587
    const v26, 0x3f68f5c3    # 0.91f

    .line 588
    .line 589
    .line 590
    const/16 v21, 0x0

    .line 591
    .line 592
    const v22, 0x3f2b851f    # 0.67f

    .line 593
    .line 594
    .line 595
    const v23, 0x3f28f5c3    # 0.66f

    .line 596
    .line 597
    .line 598
    const v24, 0x3f90a3d7    # 1.13f

    .line 599
    .line 600
    .line 601
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v25, 0x3f63d70a    # 0.89f

    .line 605
    .line 606
    .line 607
    const v26, -0x411eb852    # -0.44f

    .line 608
    .line 609
    .line 610
    const v21, 0x3ebd70a4    # 0.37f

    .line 611
    .line 612
    .line 613
    const v22, -0x41fae148    # -0.13f

    .line 614
    .line 615
    .line 616
    const v23, 0x3f266666    # 0.65f

    .line 617
    .line 618
    .line 619
    const v24, -0x41666666    # -0.3f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v25, 0x3f933333    # 1.15f

    .line 626
    .line 627
    .line 628
    const v26, -0x414ccccd    # -0.35f

    .line 629
    .line 630
    .line 631
    const v22, -0x419eb852    # -0.22f

    .line 632
    .line 633
    .line 634
    const v23, 0x3f19999a    # 0.6f

    .line 635
    .line 636
    .line 637
    const v24, -0x414ccccd    # -0.35f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v26, 0x3eb851ec    # 0.36f

    .line 644
    .line 645
    .line 646
    const v21, 0x3f0ccccd    # 0.55f

    .line 647
    .line 648
    .line 649
    const/16 v22, 0x0

    .line 650
    .line 651
    const v23, 0x3f47ae14    # 0.78f

    .line 652
    .line 653
    .line 654
    const v24, 0x3e051eb8    # 0.13f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v25, 0x400b851f    # 2.18f

    .line 661
    .line 662
    .line 663
    const v26, 0x3f23d70a    # 0.64f

    .line 664
    .line 665
    .line 666
    const v21, 0x3ee66666    # 0.45f

    .line 667
    .line 668
    .line 669
    const v22, 0x3e8a3d71    # 0.27f

    .line 670
    .line 671
    .line 672
    const v23, 0x3f88f5c3    # 1.07f

    .line 673
    .line 674
    .line 675
    const v24, 0x3f23d70a    # 0.64f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v4, 0x400c28f6    # 2.19f

    .line 682
    .line 683
    .line 684
    const v6, -0x40dc28f6    # -0.64f

    .line 685
    .line 686
    .line 687
    const v7, -0x41428f5c    # -0.37f

    .line 688
    .line 689
    .line 690
    const v8, 0x3fdd70a4    # 1.73f

    .line 691
    .line 692
    .line 693
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const v25, 0x3f933333    # 1.15f

    .line 697
    .line 698
    .line 699
    const v26, -0x4147ae14    # -0.36f

    .line 700
    .line 701
    .line 702
    const v21, 0x3ebd70a4    # 0.37f

    .line 703
    .line 704
    .line 705
    const v22, -0x41947ae1    # -0.23f

    .line 706
    .line 707
    .line 708
    const v23, 0x3f170a3d    # 0.59f

    .line 709
    .line 710
    .line 711
    const v24, -0x4147ae14    # -0.36f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v26, 0x3eb851ec    # 0.36f

    .line 718
    .line 719
    .line 720
    const v21, 0x3f0ccccd    # 0.55f

    .line 721
    .line 722
    .line 723
    const/16 v22, 0x0

    .line 724
    .line 725
    const v23, 0x3f47ae14    # 0.78f

    .line 726
    .line 727
    .line 728
    const v24, 0x3e0f5c29    # 0.14f

    .line 729
    .line 730
    .line 731
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v25, 0x400b851f    # 2.18f

    .line 735
    .line 736
    .line 737
    const v26, 0x3f23d70a    # 0.64f

    .line 738
    .line 739
    .line 740
    const v21, 0x3ee66666    # 0.45f

    .line 741
    .line 742
    .line 743
    const v22, 0x3e8a3d71    # 0.27f

    .line 744
    .line 745
    .line 746
    const v23, 0x3f88f5c3    # 1.07f

    .line 747
    .line 748
    .line 749
    const v24, 0x3f23d70a    # 0.64f

    .line 750
    .line 751
    .line 752
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v4, 0x3fdc28f6    # 1.72f

    .line 756
    .line 757
    .line 758
    const v8, 0x400b851f    # 2.18f

    .line 759
    .line 760
    .line 761
    invoke-virtual {v2, v4, v7, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const v25, 0x3f933333    # 1.15f

    .line 765
    .line 766
    .line 767
    const v26, -0x4147ae14    # -0.36f

    .line 768
    .line 769
    .line 770
    const v21, 0x3ebd70a4    # 0.37f

    .line 771
    .line 772
    .line 773
    const v22, -0x41947ae1    # -0.23f

    .line 774
    .line 775
    .line 776
    const v23, 0x3f170a3d    # 0.59f

    .line 777
    .line 778
    .line 779
    const v24, -0x4147ae14    # -0.36f

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v26, 0x3eb851ec    # 0.36f

    .line 786
    .line 787
    .line 788
    const v21, 0x3f0ccccd    # 0.55f

    .line 789
    .line 790
    .line 791
    const/16 v22, 0x0

    .line 792
    .line 793
    const v23, 0x3f47ae14    # 0.78f

    .line 794
    .line 795
    .line 796
    const v24, 0x3e0f5c29    # 0.14f

    .line 797
    .line 798
    .line 799
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v25, 0x3f6147ae    # 0.88f

    .line 803
    .line 804
    .line 805
    const v26, 0x3ee147ae    # 0.44f

    .line 806
    .line 807
    .line 808
    const v21, 0x3e6b851f    # 0.23f

    .line 809
    .line 810
    .line 811
    const v22, 0x3e0f5c29    # 0.14f

    .line 812
    .line 813
    .line 814
    const v23, 0x3f028f5c    # 0.51f

    .line 815
    .line 816
    .line 817
    const v24, 0x3e9eb852    # 0.31f

    .line 818
    .line 819
    .line 820
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const v25, 0x3fa66666    # 1.3f

    .line 824
    .line 825
    .line 826
    const v26, -0x40970a3d    # -0.91f

    .line 827
    .line 828
    .line 829
    const v21, 0x3f2147ae    # 0.63f

    .line 830
    .line 831
    .line 832
    const v22, 0x3e6147ae    # 0.22f

    .line 833
    .line 834
    .line 835
    const v23, 0x3fa66666    # 1.3f

    .line 836
    .line 837
    .line 838
    const v24, -0x418a3d71    # -0.24f

    .line 839
    .line 840
    .line 841
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const v4, -0x420a3d71    # -0.12f

    .line 845
    .line 846
    .line 847
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const v25, -0x40d9999a    # -0.65f

    .line 851
    .line 852
    .line 853
    const v26, -0x40a3d70a    # -0.86f

    .line 854
    .line 855
    .line 856
    const/16 v21, 0x0

    .line 857
    .line 858
    const v22, -0x412e147b    # -0.41f

    .line 859
    .line 860
    .line 861
    const v23, -0x4175c28f    # -0.27f

    .line 862
    .line 863
    .line 864
    const v24, -0x40c51eb8    # -0.73f

    .line 865
    .line 866
    .line 867
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v4, 0x40470a3d    # 3.11f

    .line 874
    .line 875
    .line 876
    const v6, 0x4182cccd    # 16.35f

    .line 877
    .line 878
    .line 879
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const v25, 0x3f8b851f    # 1.09f

    .line 883
    .line 884
    .line 885
    const v26, -0x41051eb8    # -0.49f

    .line 886
    .line 887
    .line 888
    const v21, 0x3ef0a3d7    # 0.47f

    .line 889
    .line 890
    .line 891
    const v22, -0x41fae148    # -0.13f

    .line 892
    .line 893
    .line 894
    const v23, 0x3f4f5c29    # 0.81f

    .line 895
    .line 896
    .line 897
    const v24, -0x41570a3d    # -0.33f

    .line 898
    .line 899
    .line 900
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const v25, 0x3f933333    # 1.15f

    .line 904
    .line 905
    .line 906
    const v26, -0x4147ae14    # -0.36f

    .line 907
    .line 908
    .line 909
    const v21, 0x3ebd70a4    # 0.37f

    .line 910
    .line 911
    .line 912
    const v22, -0x41947ae1    # -0.23f

    .line 913
    .line 914
    .line 915
    const v23, 0x3f19999a    # 0.6f

    .line 916
    .line 917
    .line 918
    const v24, -0x4147ae14    # -0.36f

    .line 919
    .line 920
    .line 921
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v26, 0x3eb851ec    # 0.36f

    .line 925
    .line 926
    .line 927
    const v21, 0x3f0ccccd    # 0.55f

    .line 928
    .line 929
    .line 930
    const/16 v22, 0x0

    .line 931
    .line 932
    const v23, 0x3f47ae14    # 0.78f

    .line 933
    .line 934
    .line 935
    const v24, 0x3e0f5c29    # 0.14f

    .line 936
    .line 937
    .line 938
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v25, 0x400b851f    # 2.18f

    .line 942
    .line 943
    .line 944
    const v26, 0x3f23d70a    # 0.64f

    .line 945
    .line 946
    .line 947
    const v21, 0x3ee66666    # 0.45f

    .line 948
    .line 949
    .line 950
    const v22, 0x3e8a3d71    # 0.27f

    .line 951
    .line 952
    .line 953
    const v23, 0x3f88f5c3    # 1.07f

    .line 954
    .line 955
    .line 956
    const v24, 0x3f23d70a    # 0.64f

    .line 957
    .line 958
    .line 959
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const v4, -0x40dc28f6    # -0.64f

    .line 963
    .line 964
    .line 965
    const v6, -0x41428f5c    # -0.37f

    .line 966
    .line 967
    .line 968
    const v7, 0x400b851f    # 2.18f

    .line 969
    .line 970
    .line 971
    const v8, 0x3fdd70a4    # 1.73f

    .line 972
    .line 973
    .line 974
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const v25, 0x3f933333    # 1.15f

    .line 978
    .line 979
    .line 980
    const v26, -0x4147ae14    # -0.36f

    .line 981
    .line 982
    .line 983
    const v21, 0x3ebd70a4    # 0.37f

    .line 984
    .line 985
    .line 986
    const v22, -0x41947ae1    # -0.23f

    .line 987
    .line 988
    .line 989
    const v23, 0x3f170a3d    # 0.59f

    .line 990
    .line 991
    .line 992
    const v24, -0x4147ae14    # -0.36f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const v26, 0x3eb851ec    # 0.36f

    .line 999
    .line 1000
    .line 1001
    const v21, 0x3f0ccccd    # 0.55f

    .line 1002
    .line 1003
    .line 1004
    const/16 v22, 0x0

    .line 1005
    .line 1006
    const v23, 0x3f47ae14    # 0.78f

    .line 1007
    .line 1008
    .line 1009
    const v24, 0x3e0f5c29    # 0.14f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v25, 0x400b851f    # 2.18f

    .line 1016
    .line 1017
    .line 1018
    const v26, 0x3f23d70a    # 0.64f

    .line 1019
    .line 1020
    .line 1021
    const v21, 0x3ee66666    # 0.45f

    .line 1022
    .line 1023
    .line 1024
    const v22, 0x3e8a3d71    # 0.27f

    .line 1025
    .line 1026
    .line 1027
    const v23, 0x3f88f5c3    # 1.07f

    .line 1028
    .line 1029
    .line 1030
    const v24, 0x3f23d70a    # 0.64f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const v25, 0x3f933333    # 1.15f

    .line 1040
    .line 1041
    .line 1042
    const v26, -0x4147ae14    # -0.36f

    .line 1043
    .line 1044
    .line 1045
    const v21, 0x3ebd70a4    # 0.37f

    .line 1046
    .line 1047
    .line 1048
    const v22, -0x41947ae1    # -0.23f

    .line 1049
    .line 1050
    .line 1051
    const v23, 0x3f170a3d    # 0.59f

    .line 1052
    .line 1053
    .line 1054
    const v24, -0x4147ae14    # -0.36f

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    const v26, 0x3eb851ec    # 0.36f

    .line 1061
    .line 1062
    .line 1063
    const v21, 0x3f0ccccd    # 0.55f

    .line 1064
    .line 1065
    .line 1066
    const/16 v22, 0x0

    .line 1067
    .line 1068
    const v23, 0x3f47ae14    # 0.78f

    .line 1069
    .line 1070
    .line 1071
    const v24, 0x3e0f5c29    # 0.14f

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const v25, 0x3f59999a    # 0.85f

    .line 1078
    .line 1079
    .line 1080
    const v26, 0x3edc28f6    # 0.43f

    .line 1081
    .line 1082
    .line 1083
    const v21, 0x3e6b851f    # 0.23f

    .line 1084
    .line 1085
    .line 1086
    const v22, 0x3e0f5c29    # 0.14f

    .line 1087
    .line 1088
    .line 1089
    const/high16 v23, 0x3f000000    # 0.5f

    .line 1090
    .line 1091
    const v24, 0x3e99999a    # 0.3f

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1095
    .line 1096
    .line 1097
    const v25, 0x3fa7ae14    # 1.31f

    .line 1098
    .line 1099
    .line 1100
    const v26, -0x40970a3d    # -0.91f

    .line 1101
    .line 1102
    .line 1103
    const v21, 0x3f2147ae    # 0.63f

    .line 1104
    .line 1105
    .line 1106
    const v22, 0x3e6b851f    # 0.23f

    .line 1107
    .line 1108
    .line 1109
    const v23, 0x3fa7ae14    # 1.31f

    .line 1110
    .line 1111
    .line 1112
    const v24, -0x418a3d71    # -0.24f

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1116
    .line 1117
    .line 1118
    const v4, -0x420a3d71    # -0.12f

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1122
    .line 1123
    .line 1124
    const v25, -0x40dc28f6    # -0.64f

    .line 1125
    .line 1126
    .line 1127
    const v26, -0x40a3d70a    # -0.86f

    .line 1128
    .line 1129
    .line 1130
    const/16 v21, 0x0

    .line 1131
    .line 1132
    const v22, -0x41333333    # -0.4f

    .line 1133
    .line 1134
    .line 1135
    const v23, -0x4175c28f    # -0.27f

    .line 1136
    .line 1137
    .line 1138
    const v24, -0x40c7ae14    # -0.72f

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1142
    .line 1143
    .line 1144
    const v25, -0x40fd70a4    # -0.51f

    .line 1145
    .line 1146
    .line 1147
    const v26, -0x417ae148    # -0.26f

    .line 1148
    .line 1149
    .line 1150
    const v21, -0x41d1eb85    # -0.17f

    .line 1151
    .line 1152
    .line 1153
    const v22, -0x428a3d71    # -0.06f

    .line 1154
    .line 1155
    .line 1156
    const v23, -0x415c28f6    # -0.32f

    .line 1157
    .line 1158
    .line 1159
    const v24, -0x41e66666    # -0.15f

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    const v25, -0x3ff47ae1    # -2.18f

    .line 1166
    .line 1167
    .line 1168
    const v26, -0x40dc28f6    # -0.64f

    .line 1169
    .line 1170
    .line 1171
    const v21, -0x4119999a    # -0.45f

    .line 1172
    .line 1173
    .line 1174
    const v22, -0x4175c28f    # -0.27f

    .line 1175
    .line 1176
    .line 1177
    const v23, -0x40770a3d    # -1.07f

    .line 1178
    .line 1179
    .line 1180
    const v24, -0x40dc28f6    # -0.64f

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1184
    .line 1185
    .line 1186
    const v4, -0x3ff47ae1    # -2.18f

    .line 1187
    .line 1188
    .line 1189
    const v6, -0x40228f5c    # -1.73f

    .line 1190
    .line 1191
    .line 1192
    const v7, 0x3f23d70a    # 0.64f

    .line 1193
    .line 1194
    .line 1195
    const v8, 0x3ebd70a4    # 0.37f

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1199
    .line 1200
    .line 1201
    const v25, -0x406ccccd    # -1.15f

    .line 1202
    .line 1203
    .line 1204
    const v26, 0x3eb851ec    # 0.36f

    .line 1205
    .line 1206
    .line 1207
    const v21, -0x41428f5c    # -0.37f

    .line 1208
    .line 1209
    .line 1210
    const v22, 0x3e6b851f    # 0.23f

    .line 1211
    .line 1212
    .line 1213
    const v23, -0x40e66666    # -0.6f

    .line 1214
    .line 1215
    .line 1216
    const v24, 0x3eb851ec    # 0.36f

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1220
    .line 1221
    .line 1222
    const v4, -0x41f0a3d7    # -0.14f

    .line 1223
    .line 1224
    .line 1225
    const v6, -0x406ccccd    # -1.15f

    .line 1226
    .line 1227
    .line 1228
    const v7, -0x40b851ec    # -0.78f

    .line 1229
    .line 1230
    .line 1231
    const v8, -0x4147ae14    # -0.36f

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v2, v7, v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1235
    .line 1236
    .line 1237
    const v25, -0x3ff47ae1    # -2.18f

    .line 1238
    .line 1239
    .line 1240
    const v26, -0x40dc28f6    # -0.64f

    .line 1241
    .line 1242
    .line 1243
    const v21, -0x4119999a    # -0.45f

    .line 1244
    .line 1245
    .line 1246
    const v22, -0x4175c28f    # -0.27f

    .line 1247
    .line 1248
    .line 1249
    const v23, -0x40770a3d    # -1.07f

    .line 1250
    .line 1251
    .line 1252
    const v24, -0x40dc28f6    # -0.64f

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1256
    .line 1257
    .line 1258
    const v4, -0x3ff47ae1    # -2.18f

    .line 1259
    .line 1260
    .line 1261
    const v6, -0x40228f5c    # -1.73f

    .line 1262
    .line 1263
    .line 1264
    const v7, 0x3f23d70a    # 0.64f

    .line 1265
    .line 1266
    .line 1267
    const v8, 0x3ebd70a4    # 0.37f

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1271
    .line 1272
    .line 1273
    const v25, -0x406ccccd    # -1.15f

    .line 1274
    .line 1275
    .line 1276
    const v26, 0x3eb851ec    # 0.36f

    .line 1277
    .line 1278
    .line 1279
    const v21, -0x41428f5c    # -0.37f

    .line 1280
    .line 1281
    .line 1282
    const v22, 0x3e6b851f    # 0.23f

    .line 1283
    .line 1284
    .line 1285
    const v23, -0x40e8f5c3    # -0.59f

    .line 1286
    .line 1287
    .line 1288
    const v24, 0x3eb851ec    # 0.36f

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1292
    .line 1293
    .line 1294
    const v26, -0x4147ae14    # -0.36f

    .line 1295
    .line 1296
    .line 1297
    const v21, -0x40f33333    # -0.55f

    .line 1298
    .line 1299
    .line 1300
    const/16 v22, 0x0

    .line 1301
    .line 1302
    const v23, -0x40b851ec    # -0.78f

    .line 1303
    .line 1304
    .line 1305
    const v24, -0x41f0a3d7    # -0.14f

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1309
    .line 1310
    .line 1311
    const v25, -0x3ff47ae1    # -2.18f

    .line 1312
    .line 1313
    .line 1314
    const v26, -0x40dc28f6    # -0.64f

    .line 1315
    .line 1316
    .line 1317
    const v21, -0x4119999a    # -0.45f

    .line 1318
    .line 1319
    .line 1320
    const v22, -0x4175c28f    # -0.27f

    .line 1321
    .line 1322
    .line 1323
    const v23, -0x40770a3d    # -1.07f

    .line 1324
    .line 1325
    .line 1326
    const v24, -0x40dc28f6    # -0.64f

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1333
    .line 1334
    .line 1335
    const/high16 v25, -0x41000000    # -0.5f

    .line 1336
    .line 1337
    const v26, 0x3e8a3d71    # 0.27f

    .line 1338
    .line 1339
    .line 1340
    const v21, -0x41c7ae14    # -0.18f

    .line 1341
    .line 1342
    .line 1343
    const v22, 0x3de147ae    # 0.11f

    .line 1344
    .line 1345
    .line 1346
    const v23, -0x41570a3d    # -0.33f

    .line 1347
    .line 1348
    .line 1349
    const v24, 0x3e4ccccd    # 0.2f

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1353
    .line 1354
    .line 1355
    const v25, -0x40d9999a    # -0.65f

    .line 1356
    .line 1357
    .line 1358
    const v26, 0x3f59999a    # 0.85f

    .line 1359
    .line 1360
    .line 1361
    const v21, -0x413d70a4    # -0.38f

    .line 1362
    .line 1363
    .line 1364
    const v22, 0x3e051eb8    # 0.13f

    .line 1365
    .line 1366
    .line 1367
    const v23, -0x40d9999a    # -0.65f

    .line 1368
    .line 1369
    .line 1370
    const v24, 0x3ee66666    # 0.45f

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1374
    .line 1375
    .line 1376
    const v4, 0x3e6b851f    # 0.23f

    .line 1377
    .line 1378
    .line 1379
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1380
    .line 1381
    .line 1382
    const v25, 0x3f8e147b    # 1.11f

    .line 1383
    .line 1384
    .line 1385
    const v26, 0x3f5c28f6    # 0.86f

    .line 1386
    .line 1387
    .line 1388
    const/16 v21, 0x0

    .line 1389
    .line 1390
    const v22, 0x3f147ae1    # 0.58f

    .line 1391
    .line 1392
    .line 1393
    const v23, 0x3f0ccccd    # 0.55f

    .line 1394
    .line 1395
    .line 1396
    const v24, 0x3f828f5c    # 1.02f

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    const/16 v16, 0x3800

    .line 1410
    .line 1411
    const/16 v17, 0x0

    .line 1412
    .line 1413
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1414
    .line 1415
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1416
    .line 1417
    const/4 v7, 0x0

    .line 1418
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1419
    .line 1420
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1421
    .line 1422
    const/4 v13, 0x0

    .line 1423
    const/4 v14, 0x0

    .line 1424
    const/4 v15, 0x0

    .line 1425
    const-string v4, ""

    .line 1426
    .line 1427
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1428
    .line 1429
    .line 1430
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1431
    .line 1432
    .line 1433
    move-result v3

    .line 1434
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1435
    .line 1436
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1437
    .line 1438
    .line 1439
    move-result-wide v6

    .line 1440
    const/4 v0, 0x0

    .line 1441
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1442
    .line 1443
    .line 1444
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1445
    .line 1446
    .line 1447
    move-result v10

    .line 1448
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1449
    .line 1450
    .line 1451
    move-result v11

    .line 1452
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1453
    .line 1454
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1455
    .line 1456
    .line 1457
    const/high16 v0, 0x41840000    # 16.5f

    .line 1458
    .line 1459
    const/high16 v2, 0x40b00000    # 5.5f

    .line 1460
    .line 1461
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1462
    .line 1463
    .line 1464
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 1465
    .line 1466
    const/4 v2, 0x0

    .line 1467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1468
    .line 1469
    .line 1470
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1471
    .line 1472
    const/16 v19, 0x0

    .line 1473
    .line 1474
    const/high16 v13, 0x40200000    # 2.5f

    .line 1475
    .line 1476
    const/high16 v14, 0x40200000    # 2.5f

    .line 1477
    .line 1478
    const/16 v16, 0x1

    .line 1479
    .line 1480
    const/16 v17, 0x1

    .line 1481
    .line 1482
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1483
    .line 1484
    .line 1485
    const/high16 v18, -0x3f600000    # -5.0f

    .line 1486
    .line 1487
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v2

    .line 1494
    const/16 v16, 0x3800

    .line 1495
    .line 1496
    const/16 v17, 0x0

    .line 1497
    .line 1498
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1499
    .line 1500
    const/4 v7, 0x0

    .line 1501
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1502
    .line 1503
    const/4 v13, 0x0

    .line 1504
    const/4 v14, 0x0

    .line 1505
    const-string v4, ""

    .line 1506
    .line 1507
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v0

    .line 1511
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    sput-object v0, Landroidx/compose/material/icons/rounded/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1516
    .line 1517
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1518
    .line 1519
    .line 1520
    return-object v0
.end method

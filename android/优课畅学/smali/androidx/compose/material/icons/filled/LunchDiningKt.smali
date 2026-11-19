.class public final Landroidx/compose/material/icons/filled/LunchDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLunchDining(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/LunchDiningKt;->_lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.LunchDining"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Landroidx/compose/ui/graphics/PathFillType;->Companion:Landroidx/compose/ui/graphics/PathFillType$Companion;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 44
    .line 45
    sget-object v18, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 46
    .line 47
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 53
    .line 54
    .line 55
    sget-object v19, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 56
    .line 57
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    sget-object v20, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 62
    .line 63
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 68
    .line 69
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const/high16 v4, 0x41200000    # 10.0f

    .line 73
    .line 74
    const/high16 v6, 0x41b00000    # 22.0f

    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v26, -0x3ee028f6    # -9.99f

    .line 80
    .line 81
    .line 82
    const/high16 v27, -0x3f400000    # -6.0f

    .line 83
    .line 84
    const v22, 0x3ea3d70a    # 0.32f

    .line 85
    .line 86
    .line 87
    const v23, -0x3fae147b    # -3.28f

    .line 88
    .line 89
    .line 90
    const v24, -0x3f770a3d    # -4.28f

    .line 91
    .line 92
    .line 93
    const/high16 v25, -0x3f400000    # -6.0f

    .line 94
    .line 95
    move-object/from16 v21, v2

    .line 96
    .line 97
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v26, 0x400147ae    # 2.02f

    .line 101
    .line 102
    .line 103
    const/high16 v27, 0x41200000    # 10.0f

    .line 104
    .line 105
    const v22, 0x40c9999a    # 6.3f

    .line 106
    .line 107
    .line 108
    const/high16 v23, 0x40800000    # 4.0f

    .line 109
    .line 110
    const v24, 0x3fd9999a    # 1.7f

    .line 111
    .line 112
    .line 113
    const v25, 0x40d70a3d    # 6.72f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v4, 0x41b00000    # 22.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const/16 v16, 0x3800

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/high16 v6, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/high16 v8, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    const/high16 v9, 0x3f800000    # 1.0f

    .line 141
    .line 142
    const/high16 v12, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/4 v13, 0x0

    .line 145
    const/4 v14, 0x0

    .line 146
    const/4 v15, 0x0

    .line 147
    const-string v4, ""

    .line 148
    .line 149
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 157
    .line 158
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 159
    .line 160
    .line 161
    move-result-wide v6

    .line 162
    const/4 v2, 0x0

    .line 163
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const v4, 0x40ab3333    # 5.35f

    .line 180
    .line 181
    .line 182
    const/high16 v6, 0x41580000    # 13.5f

    .line 183
    .line 184
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v26, 0x3f933333    # 1.15f

    .line 188
    .line 189
    .line 190
    const v27, 0x3eb851ec    # 0.36f

    .line 191
    .line 192
    .line 193
    const v22, 0x3f0ccccd    # 0.55f

    .line 194
    .line 195
    .line 196
    const/16 v23, 0x0

    .line 197
    .line 198
    const v24, 0x3f47ae14    # 0.78f

    .line 199
    .line 200
    .line 201
    const v25, 0x3e0f5c29    # 0.14f

    .line 202
    .line 203
    .line 204
    move-object/from16 v21, v2

    .line 205
    .line 206
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v26, 0x400b851f    # 2.18f

    .line 210
    .line 211
    .line 212
    const v27, 0x3f23d70a    # 0.64f

    .line 213
    .line 214
    .line 215
    const v22, 0x3ee66666    # 0.45f

    .line 216
    .line 217
    .line 218
    const v23, 0x3e8a3d71    # 0.27f

    .line 219
    .line 220
    .line 221
    const v24, 0x3f88f5c3    # 1.07f

    .line 222
    .line 223
    .line 224
    const v25, 0x3f23d70a    # 0.64f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v4, 0x400b851f    # 2.18f

    .line 231
    .line 232
    .line 233
    const v6, -0x40dc28f6    # -0.64f

    .line 234
    .line 235
    .line 236
    const v7, 0x3fdd70a4    # 1.73f

    .line 237
    .line 238
    .line 239
    const v8, -0x41428f5c    # -0.37f

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v26, 0x3f933333    # 1.15f

    .line 246
    .line 247
    .line 248
    const v27, -0x4147ae14    # -0.36f

    .line 249
    .line 250
    .line 251
    const v22, 0x3ebd70a4    # 0.37f

    .line 252
    .line 253
    .line 254
    const v23, -0x41947ae1    # -0.23f

    .line 255
    .line 256
    .line 257
    const v24, 0x3f170a3d    # 0.59f

    .line 258
    .line 259
    .line 260
    const v25, -0x4147ae14    # -0.36f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v27, 0x3eb851ec    # 0.36f

    .line 267
    .line 268
    .line 269
    const v22, 0x3f0ccccd    # 0.55f

    .line 270
    .line 271
    .line 272
    const/16 v23, 0x0

    .line 273
    .line 274
    const v24, 0x3f47ae14    # 0.78f

    .line 275
    .line 276
    .line 277
    const v25, 0x3e0f5c29    # 0.14f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const v26, 0x400b851f    # 2.18f

    .line 284
    .line 285
    .line 286
    const v27, 0x3f23d70a    # 0.64f

    .line 287
    .line 288
    .line 289
    const v22, 0x3ee66666    # 0.45f

    .line 290
    .line 291
    .line 292
    const v23, 0x3e8a3d71    # 0.27f

    .line 293
    .line 294
    .line 295
    const v24, 0x3f88f5c3    # 1.07f

    .line 296
    .line 297
    .line 298
    const v25, 0x3f23d70a    # 0.64f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v27, -0x40dc28f6    # -0.64f

    .line 305
    .line 306
    .line 307
    const v22, 0x3f8e147b    # 1.11f

    .line 308
    .line 309
    .line 310
    const/16 v23, 0x0

    .line 311
    .line 312
    const v24, 0x3fdd70a4    # 1.73f

    .line 313
    .line 314
    .line 315
    const v25, -0x41428f5c    # -0.37f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v26, 0x3f933333    # 1.15f

    .line 322
    .line 323
    .line 324
    const v27, -0x4147ae14    # -0.36f

    .line 325
    .line 326
    .line 327
    const v22, 0x3ebd70a4    # 0.37f

    .line 328
    .line 329
    .line 330
    const v23, -0x41947ae1    # -0.23f

    .line 331
    .line 332
    .line 333
    const v24, 0x3f170a3d    # 0.59f

    .line 334
    .line 335
    .line 336
    const v25, -0x4147ae14    # -0.36f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v27, 0x3eb851ec    # 0.36f

    .line 343
    .line 344
    .line 345
    const v22, 0x3f0ccccd    # 0.55f

    .line 346
    .line 347
    .line 348
    const/16 v23, 0x0

    .line 349
    .line 350
    const v24, 0x3f47ae14    # 0.78f

    .line 351
    .line 352
    .line 353
    const v25, 0x3e0f5c29    # 0.14f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v26, 0x400ae148    # 2.17f

    .line 360
    .line 361
    .line 362
    const v27, 0x3f23d70a    # 0.64f

    .line 363
    .line 364
    .line 365
    const v22, 0x3ee66666    # 0.45f

    .line 366
    .line 367
    .line 368
    const v23, 0x3e8a3d71    # 0.27f

    .line 369
    .line 370
    .line 371
    const v24, 0x3f88f5c3    # 1.07f

    .line 372
    .line 373
    .line 374
    const v25, 0x3f2147ae    # 0.63f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, -0x40028f5c    # -1.98f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v26, -0x406b851f    # -1.16f

    .line 387
    .line 388
    .line 389
    const v27, -0x413d70a4    # -0.38f

    .line 390
    .line 391
    .line 392
    const/16 v22, 0x0

    .line 393
    .line 394
    const/16 v23, 0x0

    .line 395
    .line 396
    const v24, -0x40b5c28f    # -0.79f

    .line 397
    .line 398
    .line 399
    const v25, -0x41dc28f6    # -0.16f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v26, -0x3ff47ae1    # -2.18f

    .line 406
    .line 407
    .line 408
    const v27, -0x40dc28f6    # -0.64f

    .line 409
    .line 410
    .line 411
    const v22, -0x4119999a    # -0.45f

    .line 412
    .line 413
    .line 414
    const v23, -0x4175c28f    # -0.27f

    .line 415
    .line 416
    .line 417
    const v24, -0x40770a3d    # -1.07f

    .line 418
    .line 419
    .line 420
    const v25, -0x40dc28f6    # -0.64f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v27, 0x3f23d70a    # 0.64f

    .line 427
    .line 428
    .line 429
    const v22, -0x4071eb85    # -1.11f

    .line 430
    .line 431
    .line 432
    const/16 v23, 0x0

    .line 433
    .line 434
    const v24, -0x40228f5c    # -1.73f

    .line 435
    .line 436
    .line 437
    const v25, 0x3ebd70a4    # 0.37f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v26, -0x406ccccd    # -1.15f

    .line 444
    .line 445
    .line 446
    const v27, 0x3eb851ec    # 0.36f

    .line 447
    .line 448
    .line 449
    const v22, -0x41428f5c    # -0.37f

    .line 450
    .line 451
    .line 452
    const v23, 0x3e6b851f    # 0.23f

    .line 453
    .line 454
    .line 455
    const v24, -0x40e66666    # -0.6f

    .line 456
    .line 457
    .line 458
    const v25, 0x3eb851ec    # 0.36f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v4, -0x406ccccd    # -1.15f

    .line 465
    .line 466
    .line 467
    const v6, -0x4147ae14    # -0.36f

    .line 468
    .line 469
    .line 470
    const v7, -0x40b851ec    # -0.78f

    .line 471
    .line 472
    .line 473
    const v8, -0x41f0a3d7    # -0.14f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v26, -0x3ff47ae1    # -2.18f

    .line 480
    .line 481
    .line 482
    const v27, -0x40dc28f6    # -0.64f

    .line 483
    .line 484
    .line 485
    const v22, -0x4119999a    # -0.45f

    .line 486
    .line 487
    .line 488
    const v23, -0x4175c28f    # -0.27f

    .line 489
    .line 490
    .line 491
    const v24, -0x40770a3d    # -1.07f

    .line 492
    .line 493
    .line 494
    const v25, -0x40dc28f6    # -0.64f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v4, -0x3ff47ae1    # -2.18f

    .line 501
    .line 502
    .line 503
    const v6, 0x3f23d70a    # 0.64f

    .line 504
    .line 505
    .line 506
    const v7, -0x40228f5c    # -1.73f

    .line 507
    .line 508
    .line 509
    const v8, 0x3ebd70a4    # 0.37f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v26, -0x406ccccd    # -1.15f

    .line 516
    .line 517
    .line 518
    const v27, 0x3eb851ec    # 0.36f

    .line 519
    .line 520
    .line 521
    const v22, -0x41428f5c    # -0.37f

    .line 522
    .line 523
    .line 524
    const v23, 0x3e6b851f    # 0.23f

    .line 525
    .line 526
    .line 527
    const v24, -0x40e8f5c3    # -0.59f

    .line 528
    .line 529
    .line 530
    const v25, 0x3eb851ec    # 0.36f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v27, -0x4147ae14    # -0.36f

    .line 537
    .line 538
    .line 539
    const v22, -0x40f33333    # -0.55f

    .line 540
    .line 541
    .line 542
    const/16 v23, 0x0

    .line 543
    .line 544
    const v24, -0x40b851ec    # -0.78f

    .line 545
    .line 546
    .line 547
    const v25, -0x41f0a3d7    # -0.14f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v26, -0x3ff47ae1    # -2.18f

    .line 554
    .line 555
    .line 556
    const v27, -0x40dc28f6    # -0.64f

    .line 557
    .line 558
    .line 559
    const v22, -0x4119999a    # -0.45f

    .line 560
    .line 561
    .line 562
    const v23, -0x4175c28f    # -0.27f

    .line 563
    .line 564
    .line 565
    const v24, -0x40770a3d    # -1.07f

    .line 566
    .line 567
    .line 568
    const v25, -0x40dc28f6    # -0.64f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v27, 0x3f23d70a    # 0.64f

    .line 575
    .line 576
    .line 577
    const v22, -0x4071eb85    # -1.11f

    .line 578
    .line 579
    .line 580
    const/16 v23, 0x0

    .line 581
    .line 582
    const v24, -0x40228f5c    # -1.73f

    .line 583
    .line 584
    .line 585
    const v25, 0x3ebd70a4    # 0.37f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v26, 0x40000000    # 2.0f

    .line 592
    .line 593
    const/high16 v27, 0x41480000    # 12.5f

    .line 594
    .line 595
    const v22, 0x4031eb85    # 2.78f

    .line 596
    .line 597
    .line 598
    const v23, 0x4145eb85    # 12.37f

    .line 599
    .line 600
    .line 601
    const v24, 0x4023d70a    # 2.56f

    .line 602
    .line 603
    .line 604
    const/high16 v25, 0x41480000    # 12.5f

    .line 605
    .line 606
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v4, 0x40000000    # 2.0f

    .line 610
    .line 611
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v26, 0x400d70a4    # 2.21f

    .line 615
    .line 616
    .line 617
    const v27, -0x40dc28f6    # -0.64f

    .line 618
    .line 619
    .line 620
    const v22, 0x3f8e147b    # 1.11f

    .line 621
    .line 622
    .line 623
    const/16 v23, 0x0

    .line 624
    .line 625
    const v24, 0x3fdd70a4    # 1.73f

    .line 626
    .line 627
    .line 628
    const v25, -0x41428f5c    # -0.37f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v26, 0x40ab3333    # 5.35f

    .line 635
    .line 636
    .line 637
    const/high16 v27, 0x41580000    # 13.5f

    .line 638
    .line 639
    const v22, 0x40928f5c    # 4.58f

    .line 640
    .line 641
    .line 642
    const v23, 0x415a147b    # 13.63f

    .line 643
    .line 644
    .line 645
    const v24, 0x4099999a    # 4.8f

    .line 646
    .line 647
    .line 648
    const/high16 v25, 0x41580000    # 13.5f

    .line 649
    .line 650
    invoke-virtual/range {v21 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    const/high16 v6, 0x3f800000    # 1.0f

    .line 661
    .line 662
    const/high16 v8, 0x3f800000    # 1.0f

    .line 663
    .line 664
    const/4 v7, 0x0

    .line 665
    const-string v4, ""

    .line 666
    .line 667
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 675
    .line 676
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 677
    .line 678
    .line 679
    move-result-wide v6

    .line 680
    const/4 v0, 0x0

    .line 681
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 685
    .line 686
    .line 687
    move-result v10

    .line 688
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 689
    .line 690
    .line 691
    move-result v11

    .line 692
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 695
    .line 696
    .line 697
    const/high16 v0, 0x41800000    # 16.0f

    .line 698
    .line 699
    const/high16 v2, 0x40000000    # 2.0f

    .line 700
    .line 701
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v0, 0x40000000    # 2.0f

    .line 705
    .line 706
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const/high16 v17, 0x40000000    # 2.0f

    .line 710
    .line 711
    const/high16 v18, 0x40000000    # 2.0f

    .line 712
    .line 713
    const v14, 0x3f8ccccd    # 1.1f

    .line 714
    .line 715
    .line 716
    const v15, 0x3f666666    # 0.9f

    .line 717
    .line 718
    .line 719
    const/high16 v16, 0x40000000    # 2.0f

    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const/high16 v0, 0x41800000    # 16.0f

    .line 725
    .line 726
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const/high16 v18, -0x40000000    # -2.0f

    .line 730
    .line 731
    const v13, 0x3f8ccccd    # 1.1f

    .line 732
    .line 733
    .line 734
    const/4 v14, 0x0

    .line 735
    const/high16 v15, 0x40000000    # 2.0f

    .line 736
    .line 737
    const v16, -0x4099999a    # -0.9f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const/high16 v0, -0x40000000    # -2.0f

    .line 744
    .line 745
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v0, 0x40000000    # 2.0f

    .line 749
    .line 750
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    const/16 v16, 0x3800

    .line 761
    .line 762
    const/16 v17, 0x0

    .line 763
    .line 764
    const/high16 v6, 0x3f800000    # 1.0f

    .line 765
    .line 766
    const/4 v7, 0x0

    .line 767
    const/high16 v12, 0x3f800000    # 1.0f

    .line 768
    .line 769
    const/4 v13, 0x0

    .line 770
    const/4 v15, 0x0

    .line 771
    const-string v4, ""

    .line 772
    .line 773
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    sput-object v0, Landroidx/compose/material/icons/filled/LunchDiningKt;->_lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 782
    .line 783
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    return-object v0
.end method

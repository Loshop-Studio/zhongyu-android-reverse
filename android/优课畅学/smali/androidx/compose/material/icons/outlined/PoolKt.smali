.class public final Landroidx/compose/material/icons/outlined/PoolKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pool:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPool(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Pool"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3fb00000    # -3.25f

    .line 78
    .line 79
    const/high16 v6, 0x40500000    # 3.25f

    .line 80
    .line 81
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, 0x3f451eb8    # 0.77f

    .line 85
    .line 86
    .line 87
    const v26, 0x3ec7ae14    # 0.39f

    .line 88
    .line 89
    .line 90
    const v21, 0x3e9eb852    # 0.31f

    .line 91
    .line 92
    .line 93
    const v22, 0x3df5c28f    # 0.12f

    .line 94
    .line 95
    .line 96
    const v23, 0x3f0f5c29    # 0.56f

    .line 97
    .line 98
    .line 99
    const v24, 0x3e8a3d71    # 0.27f

    .line 100
    .line 101
    .line 102
    move-object/from16 v20, v2

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, 0x3f933333    # 1.15f

    .line 108
    .line 109
    .line 110
    const v26, 0x3eb851ec    # 0.36f

    .line 111
    .line 112
    .line 113
    const v21, 0x3ebd70a4    # 0.37f

    .line 114
    .line 115
    .line 116
    const v22, 0x3e6b851f    # 0.23f

    .line 117
    .line 118
    .line 119
    const v23, 0x3f170a3d    # 0.59f

    .line 120
    .line 121
    .line 122
    const v24, 0x3eb851ec    # 0.36f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x3f47ae14    # 0.78f

    .line 129
    .line 130
    .line 131
    const v6, 0x3f933333    # 1.15f

    .line 132
    .line 133
    .line 134
    const v7, -0x41fae148    # -0.13f

    .line 135
    .line 136
    .line 137
    const v8, -0x4147ae14    # -0.36f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, 0x400c28f6    # 2.19f

    .line 144
    .line 145
    .line 146
    const v26, -0x40dc28f6    # -0.64f

    .line 147
    .line 148
    .line 149
    const v21, 0x3eeb851f    # 0.46f

    .line 150
    .line 151
    .line 152
    const v22, -0x4175c28f    # -0.27f

    .line 153
    .line 154
    .line 155
    const v23, 0x3f8a3d71    # 1.08f

    .line 156
    .line 157
    .line 158
    const v24, -0x40dc28f6    # -0.64f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, 0x400b851f    # 2.18f

    .line 165
    .line 166
    .line 167
    const v6, 0x3fdd70a4    # 1.73f

    .line 168
    .line 169
    .line 170
    const v7, 0x3f23d70a    # 0.64f

    .line 171
    .line 172
    .line 173
    const v8, 0x3ebd70a4    # 0.37f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v25, 0x3f933333    # 1.15f

    .line 180
    .line 181
    .line 182
    const v26, 0x3eb851ec    # 0.36f

    .line 183
    .line 184
    .line 185
    const v21, 0x3ebd70a4    # 0.37f

    .line 186
    .line 187
    .line 188
    const v22, 0x3e6147ae    # 0.22f

    .line 189
    .line 190
    .line 191
    const v23, 0x3f19999a    # 0.6f

    .line 192
    .line 193
    .line 194
    const v24, 0x3eb851ec    # 0.36f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v26, -0x4147ae14    # -0.36f

    .line 201
    .line 202
    .line 203
    const v21, 0x3f0ccccd    # 0.55f

    .line 204
    .line 205
    .line 206
    const/16 v22, 0x0

    .line 207
    .line 208
    const v23, 0x3f47ae14    # 0.78f

    .line 209
    .line 210
    .line 211
    const v24, -0x41fae148    # -0.13f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, 0x3ed1eb85    # 0.41f

    .line 218
    .line 219
    .line 220
    const v26, -0x41947ae1    # -0.23f

    .line 221
    .line 222
    .line 223
    const v21, 0x3df5c28f    # 0.12f

    .line 224
    .line 225
    .line 226
    const v22, -0x4270a3d7    # -0.07f

    .line 227
    .line 228
    .line 229
    const v23, 0x3e851eb8    # 0.26f

    .line 230
    .line 231
    .line 232
    const v24, -0x41e66666    # -0.15f

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x4127ae14    # 10.48f

    .line 239
    .line 240
    .line 241
    const/high16 v6, 0x40a00000    # 5.0f

    .line 242
    .line 243
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v25, 0x40a00000    # 5.0f

    .line 247
    .line 248
    const/high16 v26, 0x40400000    # 3.0f

    .line 249
    .line 250
    const v21, 0x410ee148    # 8.93f

    .line 251
    .line 252
    .line 253
    const v22, 0x405ccccd    # 3.45f

    .line 254
    .line 255
    .line 256
    const/high16 v23, 0x40f00000    # 7.5f

    .line 257
    .line 258
    const v24, 0x403f5c29    # 2.99f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v4, 0x40200000    # 2.5f

    .line 265
    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v25, 0x40800000    # 4.0f

    .line 270
    .line 271
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 272
    .line 273
    const v21, 0x3fe8f5c3    # 1.82f

    .line 274
    .line 275
    .line 276
    const v22, -0x43dc28f6    # -0.01f

    .line 277
    .line 278
    .line 279
    const v23, 0x4038f5c3    # 2.89f

    .line 280
    .line 281
    .line 282
    const v24, 0x3ec7ae14    # 0.39f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v4, 0x3f800000    # 1.0f

    .line 289
    .line 290
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x41b00000    # 22.0f

    .line 297
    .line 298
    const/high16 v6, 0x41840000    # 16.5f

    .line 299
    .line 300
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v4, -0x435c28f6    # -0.02f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, 0x3ca3d70a    # 0.02f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, 0x40ab3333    # 5.35f

    .line 319
    .line 320
    .line 321
    const/high16 v6, 0x41780000    # 15.5f

    .line 322
    .line 323
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x3f933333    # 1.15f

    .line 327
    .line 328
    .line 329
    const v26, 0x3eb851ec    # 0.36f

    .line 330
    .line 331
    .line 332
    const v21, 0x3f0ccccd    # 0.55f

    .line 333
    .line 334
    .line 335
    const/16 v22, 0x0

    .line 336
    .line 337
    const v23, 0x3f47ae14    # 0.78f

    .line 338
    .line 339
    .line 340
    const v24, 0x3e0f5c29    # 0.14f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v25, 0x400b851f    # 2.18f

    .line 347
    .line 348
    .line 349
    const v26, 0x3f23d70a    # 0.64f

    .line 350
    .line 351
    .line 352
    const v21, 0x3ee66666    # 0.45f

    .line 353
    .line 354
    .line 355
    const v22, 0x3e8a3d71    # 0.27f

    .line 356
    .line 357
    .line 358
    const v23, 0x3f88f5c3    # 1.07f

    .line 359
    .line 360
    .line 361
    const v24, 0x3f23d70a    # 0.64f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v4, -0x40dc28f6    # -0.64f

    .line 368
    .line 369
    .line 370
    const v6, -0x41428f5c    # -0.37f

    .line 371
    .line 372
    .line 373
    const v7, 0x400b851f    # 2.18f

    .line 374
    .line 375
    .line 376
    const v8, 0x3fdd70a4    # 1.73f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v25, 0x3f933333    # 1.15f

    .line 383
    .line 384
    .line 385
    const v26, -0x4147ae14    # -0.36f

    .line 386
    .line 387
    .line 388
    const v21, 0x3ebd70a4    # 0.37f

    .line 389
    .line 390
    .line 391
    const v22, -0x41947ae1    # -0.23f

    .line 392
    .line 393
    .line 394
    const v23, 0x3f170a3d    # 0.59f

    .line 395
    .line 396
    .line 397
    const v24, -0x4147ae14    # -0.36f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v26, 0x3eb851ec    # 0.36f

    .line 404
    .line 405
    .line 406
    const v21, 0x3f0ccccd    # 0.55f

    .line 407
    .line 408
    .line 409
    const/16 v22, 0x0

    .line 410
    .line 411
    const v23, 0x3f47ae14    # 0.78f

    .line 412
    .line 413
    .line 414
    const v24, 0x3e0f5c29    # 0.14f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v25, 0x400b851f    # 2.18f

    .line 421
    .line 422
    .line 423
    const v26, 0x3f23d70a    # 0.64f

    .line 424
    .line 425
    .line 426
    const v21, 0x3ee66666    # 0.45f

    .line 427
    .line 428
    .line 429
    const v22, 0x3e8a3d71    # 0.27f

    .line 430
    .line 431
    .line 432
    const v23, 0x3f88f5c3    # 1.07f

    .line 433
    .line 434
    .line 435
    const v24, 0x3f23d70a    # 0.64f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v8, v6, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v25, 0x3f933333    # 1.15f

    .line 445
    .line 446
    .line 447
    const v26, -0x4147ae14    # -0.36f

    .line 448
    .line 449
    .line 450
    const v21, 0x3ebd70a4    # 0.37f

    .line 451
    .line 452
    .line 453
    const v22, -0x41947ae1    # -0.23f

    .line 454
    .line 455
    .line 456
    const v23, 0x3f170a3d    # 0.59f

    .line 457
    .line 458
    .line 459
    const v24, -0x4147ae14    # -0.36f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v26, 0x3eb851ec    # 0.36f

    .line 466
    .line 467
    .line 468
    const v21, 0x3f0ccccd    # 0.55f

    .line 469
    .line 470
    .line 471
    const/16 v22, 0x0

    .line 472
    .line 473
    const v23, 0x3f47ae14    # 0.78f

    .line 474
    .line 475
    .line 476
    const v24, 0x3e0f5c29    # 0.14f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v25, 0x400a3d71    # 2.16f

    .line 483
    .line 484
    .line 485
    const v26, 0x3f23d70a    # 0.64f

    .line 486
    .line 487
    .line 488
    const v21, 0x3ee66666    # 0.45f

    .line 489
    .line 490
    .line 491
    const v22, 0x3e8a3d71    # 0.27f

    .line 492
    .line 493
    .line 494
    const v23, 0x3f87ae14    # 1.06f

    .line 495
    .line 496
    .line 497
    const v24, 0x3f2147ae    # 0.63f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v4, -0x40000000    # -2.0f

    .line 504
    .line 505
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v25, -0x406ccccd    # -1.15f

    .line 509
    .line 510
    .line 511
    const v26, -0x4147ae14    # -0.36f

    .line 512
    .line 513
    .line 514
    const v21, -0x40f33333    # -0.55f

    .line 515
    .line 516
    .line 517
    const/16 v22, 0x0

    .line 518
    .line 519
    const v23, -0x40b851ec    # -0.78f

    .line 520
    .line 521
    .line 522
    const v24, -0x41f0a3d7    # -0.14f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v25, -0x3ff47ae1    # -2.18f

    .line 529
    .line 530
    .line 531
    const v26, -0x40dc28f6    # -0.64f

    .line 532
    .line 533
    .line 534
    const v21, -0x4119999a    # -0.45f

    .line 535
    .line 536
    .line 537
    const v22, -0x4175c28f    # -0.27f

    .line 538
    .line 539
    .line 540
    const v23, -0x40770a3d    # -1.07f

    .line 541
    .line 542
    .line 543
    const v24, -0x40dc28f6    # -0.64f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v4, -0x3ff47ae1    # -2.18f

    .line 550
    .line 551
    .line 552
    const v6, -0x40228f5c    # -1.73f

    .line 553
    .line 554
    .line 555
    const v7, 0x3f23d70a    # 0.64f

    .line 556
    .line 557
    .line 558
    const v8, 0x3ebd70a4    # 0.37f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v25, -0x406ccccd    # -1.15f

    .line 565
    .line 566
    .line 567
    const v26, 0x3eb851ec    # 0.36f

    .line 568
    .line 569
    .line 570
    const v21, -0x41428f5c    # -0.37f

    .line 571
    .line 572
    .line 573
    const v22, 0x3e6b851f    # 0.23f

    .line 574
    .line 575
    .line 576
    const v23, -0x40e66666    # -0.6f

    .line 577
    .line 578
    .line 579
    const v24, 0x3eb851ec    # 0.36f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v4, -0x41f0a3d7    # -0.14f

    .line 586
    .line 587
    .line 588
    const v6, -0x406ccccd    # -1.15f

    .line 589
    .line 590
    .line 591
    const v7, -0x40b851ec    # -0.78f

    .line 592
    .line 593
    .line 594
    const v8, -0x4147ae14    # -0.36f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v2, v7, v4, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v25, -0x3ff47ae1    # -2.18f

    .line 601
    .line 602
    .line 603
    const v26, -0x40dc28f6    # -0.64f

    .line 604
    .line 605
    .line 606
    const v21, -0x4119999a    # -0.45f

    .line 607
    .line 608
    .line 609
    const v22, -0x4175c28f    # -0.27f

    .line 610
    .line 611
    .line 612
    const v23, -0x40770a3d    # -1.07f

    .line 613
    .line 614
    .line 615
    const v24, -0x40dc28f6    # -0.64f

    .line 616
    .line 617
    .line 618
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v4, -0x3ff47ae1    # -2.18f

    .line 622
    .line 623
    .line 624
    const v6, -0x40228f5c    # -1.73f

    .line 625
    .line 626
    .line 627
    const v7, 0x3f23d70a    # 0.64f

    .line 628
    .line 629
    .line 630
    const v8, 0x3ebd70a4    # 0.37f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v25, -0x406ccccd    # -1.15f

    .line 637
    .line 638
    .line 639
    const v26, 0x3eb851ec    # 0.36f

    .line 640
    .line 641
    .line 642
    const v21, -0x41428f5c    # -0.37f

    .line 643
    .line 644
    .line 645
    const v22, 0x3e6b851f    # 0.23f

    .line 646
    .line 647
    .line 648
    const v23, -0x40e8f5c3    # -0.59f

    .line 649
    .line 650
    .line 651
    const v24, 0x3eb851ec    # 0.36f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v26, -0x4147ae14    # -0.36f

    .line 658
    .line 659
    .line 660
    const v21, -0x40f33333    # -0.55f

    .line 661
    .line 662
    .line 663
    const/16 v22, 0x0

    .line 664
    .line 665
    const v23, -0x40b851ec    # -0.78f

    .line 666
    .line 667
    .line 668
    const v24, -0x41f0a3d7    # -0.14f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v25, -0x3ff47ae1    # -2.18f

    .line 675
    .line 676
    .line 677
    const v26, -0x40dc28f6    # -0.64f

    .line 678
    .line 679
    .line 680
    const v21, -0x4119999a    # -0.45f

    .line 681
    .line 682
    .line 683
    const v22, -0x4175c28f    # -0.27f

    .line 684
    .line 685
    .line 686
    const v23, -0x40770a3d    # -1.07f

    .line 687
    .line 688
    .line 689
    const v24, -0x40dc28f6    # -0.64f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v25, -0x406ccccd    # -1.15f

    .line 699
    .line 700
    .line 701
    const v26, 0x3eb851ec    # 0.36f

    .line 702
    .line 703
    .line 704
    const v21, -0x41428f5c    # -0.37f

    .line 705
    .line 706
    .line 707
    const v22, 0x3e6b851f    # 0.23f

    .line 708
    .line 709
    .line 710
    const v23, -0x40e8f5c3    # -0.59f

    .line 711
    .line 712
    .line 713
    const v24, 0x3eb851ec    # 0.36f

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v4, 0x40000000    # 2.0f

    .line 720
    .line 721
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v25, 0x400ccccd    # 2.2f

    .line 725
    .line 726
    .line 727
    const v26, -0x40dc28f6    # -0.64f

    .line 728
    .line 729
    .line 730
    const v21, 0x3f8e147b    # 1.11f

    .line 731
    .line 732
    .line 733
    const/16 v22, 0x0

    .line 734
    .line 735
    const v23, 0x3fdd70a4    # 1.73f

    .line 736
    .line 737
    .line 738
    const v24, -0x41428f5c    # -0.37f

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v25, 0x3f933333    # 1.15f

    .line 745
    .line 746
    .line 747
    const v26, -0x4147ae14    # -0.36f

    .line 748
    .line 749
    .line 750
    const v21, 0x3ebd70a4    # 0.37f

    .line 751
    .line 752
    .line 753
    const v22, -0x41947ae1    # -0.23f

    .line 754
    .line 755
    .line 756
    const v23, 0x3f19999a    # 0.6f

    .line 757
    .line 758
    .line 759
    const v24, -0x4147ae14    # -0.36f

    .line 760
    .line 761
    .line 762
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v4, 0x41955c29    # 18.67f

    .line 769
    .line 770
    .line 771
    const/high16 v6, 0x41900000    # 18.0f

    .line 772
    .line 773
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v25, -0x3ff47ae1    # -2.18f

    .line 777
    .line 778
    .line 779
    const v26, 0x3f23d70a    # 0.64f

    .line 780
    .line 781
    .line 782
    const v21, -0x4071eb85    # -1.11f

    .line 783
    .line 784
    .line 785
    const/16 v22, 0x0

    .line 786
    .line 787
    const v23, -0x40228f5c    # -1.73f

    .line 788
    .line 789
    .line 790
    const v24, 0x3ebd70a4    # 0.37f

    .line 791
    .line 792
    .line 793
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v25, -0x406ccccd    # -1.15f

    .line 797
    .line 798
    .line 799
    const v26, 0x3eb851ec    # 0.36f

    .line 800
    .line 801
    .line 802
    const v21, -0x41428f5c    # -0.37f

    .line 803
    .line 804
    .line 805
    const v22, 0x3e6b851f    # 0.23f

    .line 806
    .line 807
    .line 808
    const v23, -0x40e66666    # -0.6f

    .line 809
    .line 810
    .line 811
    const v24, 0x3eb851ec    # 0.36f

    .line 812
    .line 813
    .line 814
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v26, -0x4147ae14    # -0.36f

    .line 818
    .line 819
    .line 820
    const v21, -0x40f33333    # -0.55f

    .line 821
    .line 822
    .line 823
    const/16 v22, 0x0

    .line 824
    .line 825
    const v23, -0x40b851ec    # -0.78f

    .line 826
    .line 827
    .line 828
    const v24, -0x41f0a3d7    # -0.14f

    .line 829
    .line 830
    .line 831
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const v25, -0x3ff47ae1    # -2.18f

    .line 835
    .line 836
    .line 837
    const v26, -0x40dc28f6    # -0.64f

    .line 838
    .line 839
    .line 840
    const v21, -0x4119999a    # -0.45f

    .line 841
    .line 842
    .line 843
    const v22, -0x4175c28f    # -0.27f

    .line 844
    .line 845
    .line 846
    const v23, -0x40770a3d    # -1.07f

    .line 847
    .line 848
    .line 849
    const v24, -0x40dc28f6    # -0.64f

    .line 850
    .line 851
    .line 852
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const v4, -0x3ff3d70a    # -2.19f

    .line 856
    .line 857
    .line 858
    const v6, -0x40228f5c    # -1.73f

    .line 859
    .line 860
    .line 861
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v25, -0x406ccccd    # -1.15f

    .line 865
    .line 866
    .line 867
    const v26, 0x3eb851ec    # 0.36f

    .line 868
    .line 869
    .line 870
    const v21, -0x41428f5c    # -0.37f

    .line 871
    .line 872
    .line 873
    const v22, 0x3e6b851f    # 0.23f

    .line 874
    .line 875
    .line 876
    const v23, -0x40e8f5c3    # -0.59f

    .line 877
    .line 878
    .line 879
    const v24, 0x3eb851ec    # 0.36f

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const v4, -0x406ccccd    # -1.15f

    .line 886
    .line 887
    .line 888
    const v6, -0x40b851ec    # -0.78f

    .line 889
    .line 890
    .line 891
    const v7, -0x41fae148    # -0.13f

    .line 892
    .line 893
    .line 894
    const v8, -0x4147ae14    # -0.36f

    .line 895
    .line 896
    .line 897
    invoke-virtual {v2, v6, v7, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const v25, -0x3ff47ae1    # -2.18f

    .line 901
    .line 902
    .line 903
    const v26, -0x40dc28f6    # -0.64f

    .line 904
    .line 905
    .line 906
    const v21, -0x4119999a    # -0.45f

    .line 907
    .line 908
    .line 909
    const v22, -0x4175c28f    # -0.27f

    .line 910
    .line 911
    .line 912
    const v23, -0x40770a3d    # -1.07f

    .line 913
    .line 914
    .line 915
    const v24, -0x40dc28f6    # -0.64f

    .line 916
    .line 917
    .line 918
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v4, -0x3ff3d70a    # -2.19f

    .line 922
    .line 923
    .line 924
    const v6, -0x40228f5c    # -1.73f

    .line 925
    .line 926
    .line 927
    const v7, 0x3f23d70a    # 0.64f

    .line 928
    .line 929
    .line 930
    const v8, 0x3ebd70a4    # 0.37f

    .line 931
    .line 932
    .line 933
    invoke-virtual {v2, v6, v8, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v25, -0x406ccccd    # -1.15f

    .line 937
    .line 938
    .line 939
    const v26, 0x3eb851ec    # 0.36f

    .line 940
    .line 941
    .line 942
    const v21, -0x41428f5c    # -0.37f

    .line 943
    .line 944
    .line 945
    const v22, 0x3e6b851f    # 0.23f

    .line 946
    .line 947
    .line 948
    const v23, -0x40e8f5c3    # -0.59f

    .line 949
    .line 950
    .line 951
    const v24, 0x3eb851ec    # 0.36f

    .line 952
    .line 953
    .line 954
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const/high16 v4, 0x40000000    # 2.0f

    .line 958
    .line 959
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const v25, 0x400c28f6    # 2.19f

    .line 963
    .line 964
    .line 965
    const v26, -0x40dc28f6    # -0.64f

    .line 966
    .line 967
    .line 968
    const v21, 0x3f8e147b    # 1.11f

    .line 969
    .line 970
    .line 971
    const/16 v22, 0x0

    .line 972
    .line 973
    const v23, 0x3fdd70a4    # 1.73f

    .line 974
    .line 975
    .line 976
    const v24, -0x41428f5c    # -0.37f

    .line 977
    .line 978
    .line 979
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const v25, 0x3f933333    # 1.15f

    .line 983
    .line 984
    .line 985
    const v26, -0x4147ae14    # -0.36f

    .line 986
    .line 987
    .line 988
    const v21, 0x3ebd70a4    # 0.37f

    .line 989
    .line 990
    .line 991
    const v22, -0x41947ae1    # -0.23f

    .line 992
    .line 993
    .line 994
    const v23, 0x3f19999a    # 0.6f

    .line 995
    .line 996
    .line 997
    const v24, -0x4147ae14    # -0.36f

    .line 998
    .line 999
    .line 1000
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const v26, 0x3eb851ec    # 0.36f

    .line 1004
    .line 1005
    .line 1006
    const v21, 0x3f0ccccd    # 0.55f

    .line 1007
    .line 1008
    .line 1009
    const/16 v22, 0x0

    .line 1010
    .line 1011
    const v23, 0x3f47ae14    # 0.78f

    .line 1012
    .line 1013
    .line 1014
    const v24, 0x3e051eb8    # 0.13f

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const v25, 0x400b851f    # 2.18f

    .line 1021
    .line 1022
    .line 1023
    const v26, 0x3f23d70a    # 0.64f

    .line 1024
    .line 1025
    .line 1026
    const v21, 0x3ee66666    # 0.45f

    .line 1027
    .line 1028
    .line 1029
    const v22, 0x3e8a3d71    # 0.27f

    .line 1030
    .line 1031
    .line 1032
    const v23, 0x3f88f5c3    # 1.07f

    .line 1033
    .line 1034
    .line 1035
    const v24, 0x3f23d70a    # 0.64f

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const v4, 0x400c28f6    # 2.19f

    .line 1042
    .line 1043
    .line 1044
    const v6, -0x40dc28f6    # -0.64f

    .line 1045
    .line 1046
    .line 1047
    const v7, -0x41428f5c    # -0.37f

    .line 1048
    .line 1049
    .line 1050
    const v8, 0x3fdd70a4    # 1.73f

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v2, v8, v7, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const v25, 0x3f933333    # 1.15f

    .line 1057
    .line 1058
    .line 1059
    const v26, -0x4147ae14    # -0.36f

    .line 1060
    .line 1061
    .line 1062
    const v21, 0x3ebd70a4    # 0.37f

    .line 1063
    .line 1064
    .line 1065
    const v22, -0x41947ae1    # -0.23f

    .line 1066
    .line 1067
    .line 1068
    const v23, 0x3f170a3d    # 0.59f

    .line 1069
    .line 1070
    .line 1071
    const v24, -0x4147ae14    # -0.36f

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const v26, 0x3eb851ec    # 0.36f

    .line 1078
    .line 1079
    .line 1080
    const v21, 0x3f0ccccd    # 0.55f

    .line 1081
    .line 1082
    .line 1083
    const/16 v22, 0x0

    .line 1084
    .line 1085
    const v23, 0x3f47ae14    # 0.78f

    .line 1086
    .line 1087
    .line 1088
    const v24, 0x3e0f5c29    # 0.14f

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1092
    .line 1093
    .line 1094
    const v25, 0x400b851f    # 2.18f

    .line 1095
    .line 1096
    .line 1097
    const v26, 0x3f23d70a    # 0.64f

    .line 1098
    .line 1099
    .line 1100
    const v21, 0x3ee66666    # 0.45f

    .line 1101
    .line 1102
    .line 1103
    const v22, 0x3e8a3d71    # 0.27f

    .line 1104
    .line 1105
    .line 1106
    const v23, 0x3f88f5c3    # 1.07f

    .line 1107
    .line 1108
    .line 1109
    const v24, 0x3f23d70a    # 0.64f

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    const v4, 0x3fdc28f6    # 1.72f

    .line 1116
    .line 1117
    .line 1118
    const v8, 0x400b851f    # 2.18f

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v2, v4, v7, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1122
    .line 1123
    .line 1124
    const v25, 0x3f933333    # 1.15f

    .line 1125
    .line 1126
    .line 1127
    const v26, -0x4147ae14    # -0.36f

    .line 1128
    .line 1129
    .line 1130
    const v21, 0x3ebd70a4    # 0.37f

    .line 1131
    .line 1132
    .line 1133
    const v22, -0x41947ae1    # -0.23f

    .line 1134
    .line 1135
    .line 1136
    const v23, 0x3f170a3d    # 0.59f

    .line 1137
    .line 1138
    .line 1139
    const v24, -0x4147ae14    # -0.36f

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1143
    .line 1144
    .line 1145
    const v26, 0x3eb851ec    # 0.36f

    .line 1146
    .line 1147
    .line 1148
    const v21, 0x3f0ccccd    # 0.55f

    .line 1149
    .line 1150
    .line 1151
    const/16 v22, 0x0

    .line 1152
    .line 1153
    const v23, 0x3f47ae14    # 0.78f

    .line 1154
    .line 1155
    .line 1156
    const v24, 0x3e0f5c29    # 0.14f

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1160
    .line 1161
    .line 1162
    const v25, 0x400b851f    # 2.18f

    .line 1163
    .line 1164
    .line 1165
    const v26, 0x3f23d70a    # 0.64f

    .line 1166
    .line 1167
    .line 1168
    const v21, 0x3ee66666    # 0.45f

    .line 1169
    .line 1170
    .line 1171
    const v22, 0x3e8a3d71    # 0.27f

    .line 1172
    .line 1173
    .line 1174
    const v23, 0x3f88f5c3    # 1.07f

    .line 1175
    .line 1176
    .line 1177
    const v24, 0x3f23d70a    # 0.64f

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const/high16 v4, -0x40000000    # -2.0f

    .line 1184
    .line 1185
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1186
    .line 1187
    .line 1188
    const v25, -0x406ccccd    # -1.15f

    .line 1189
    .line 1190
    .line 1191
    const v26, -0x4147ae14    # -0.36f

    .line 1192
    .line 1193
    .line 1194
    const v21, -0x40f0a3d7    # -0.56f

    .line 1195
    .line 1196
    .line 1197
    const/16 v22, 0x0

    .line 1198
    .line 1199
    const v23, -0x40b851ec    # -0.78f

    .line 1200
    .line 1201
    .line 1202
    const v24, -0x41fae148    # -0.13f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    const v25, -0x3ff47ae1    # -2.18f

    .line 1209
    .line 1210
    .line 1211
    const v26, -0x40dc28f6    # -0.64f

    .line 1212
    .line 1213
    .line 1214
    const v21, -0x4119999a    # -0.45f

    .line 1215
    .line 1216
    .line 1217
    const v22, -0x4175c28f    # -0.27f

    .line 1218
    .line 1219
    .line 1220
    const v23, -0x40770a3d    # -1.07f

    .line 1221
    .line 1222
    .line 1223
    const v24, -0x40dc28f6    # -0.64f

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v2

    .line 1236
    const/16 v16, 0x3800

    .line 1237
    .line 1238
    const/16 v17, 0x0

    .line 1239
    .line 1240
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1241
    .line 1242
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1243
    .line 1244
    const/4 v7, 0x0

    .line 1245
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1246
    .line 1247
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1248
    .line 1249
    const/4 v13, 0x0

    .line 1250
    const/4 v14, 0x0

    .line 1251
    const/4 v15, 0x0

    .line 1252
    const-string v4, ""

    .line 1253
    .line 1254
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1255
    .line 1256
    .line 1257
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1258
    .line 1259
    .line 1260
    move-result v3

    .line 1261
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1262
    .line 1263
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1264
    .line 1265
    .line 1266
    move-result-wide v6

    .line 1267
    const/4 v0, 0x0

    .line 1268
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1272
    .line 1273
    .line 1274
    move-result v10

    .line 1275
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1276
    .line 1277
    .line 1278
    move-result v11

    .line 1279
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1280
    .line 1281
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1282
    .line 1283
    .line 1284
    const/high16 v0, 0x40b00000    # 5.5f

    .line 1285
    .line 1286
    const/high16 v2, 0x41840000    # 16.5f

    .line 1287
    .line 1288
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1289
    .line 1290
    .line 1291
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 1292
    .line 1293
    const/4 v2, 0x0

    .line 1294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1295
    .line 1296
    .line 1297
    const/high16 v18, 0x40a00000    # 5.0f

    .line 1298
    .line 1299
    const/16 v19, 0x0

    .line 1300
    .line 1301
    const/high16 v13, 0x40200000    # 2.5f

    .line 1302
    .line 1303
    const/high16 v14, 0x40200000    # 2.5f

    .line 1304
    .line 1305
    const/16 v16, 0x1

    .line 1306
    .line 1307
    const/16 v17, 0x1

    .line 1308
    .line 1309
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1310
    .line 1311
    .line 1312
    const/high16 v18, -0x3f600000    # -5.0f

    .line 1313
    .line 1314
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v2

    .line 1321
    const/16 v16, 0x3800

    .line 1322
    .line 1323
    const/16 v17, 0x0

    .line 1324
    .line 1325
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1326
    .line 1327
    const/4 v7, 0x0

    .line 1328
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1329
    .line 1330
    const/4 v13, 0x0

    .line 1331
    const/4 v14, 0x0

    .line 1332
    const-string v4, ""

    .line 1333
    .line 1334
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v0

    .line 1342
    sput-object v0, Landroidx/compose/material/icons/outlined/PoolKt;->_pool:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1343
    .line 1344
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1345
    .line 1346
    .line 1347
    return-object v0
.end method

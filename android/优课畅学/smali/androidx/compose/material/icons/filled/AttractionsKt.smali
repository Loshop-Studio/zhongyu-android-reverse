.class public final Landroidx/compose/material/icons/filled/AttractionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _attractions:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttractions(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/AttractionsKt;->_attractions:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Attractions"

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
    const v0, 0x4126e148    # 10.43f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41960000    # 18.75f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x41400000    # 12.0f

    .line 79
    .line 80
    const/high16 v18, 0x41900000    # 18.0f

    .line 81
    .line 82
    const v13, 0x412ccccd    # 10.8f

    .line 83
    .line 84
    .line 85
    const v14, 0x419251ec    # 18.29f

    .line 86
    .line 87
    .line 88
    const v15, 0x4135eb85    # 11.37f

    .line 89
    .line 90
    .line 91
    const/high16 v16, 0x41900000    # 18.0f

    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x3fc7ae14    # 1.56f

    .line 97
    .line 98
    .line 99
    const/high16 v18, 0x3f400000    # 0.75f

    .line 100
    .line 101
    const v13, 0x3f2147ae    # 0.63f

    .line 102
    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const v15, 0x3f9851ec    # 1.19f

    .line 106
    .line 107
    .line 108
    const v16, 0x3e947ae1    # 0.29f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x3f8f5c29    # 1.12f

    .line 115
    .line 116
    .line 117
    const v18, -0x4147ae14    # -0.36f

    .line 118
    .line 119
    .line 120
    const v13, 0x3ec7ae14    # 0.39f

    .line 121
    .line 122
    .line 123
    const v14, -0x4247ae14    # -0.09f

    .line 124
    .line 125
    .line 126
    const v15, 0x3f428f5c    # 0.76f

    .line 127
    .line 128
    .line 129
    const v16, -0x41a8f5c3    # -0.21f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, -0x404a3d71    # -1.42f

    .line 136
    .line 137
    .line 138
    const v2, -0x3fb47ae1    # -3.18f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, -0x405eb852    # -1.26f

    .line 145
    .line 146
    .line 147
    const v18, 0x3e6b851f    # 0.23f

    .line 148
    .line 149
    .line 150
    const v13, -0x413851ec    # -0.39f

    .line 151
    .line 152
    .line 153
    const v14, 0x3e19999a    # 0.15f

    .line 154
    .line 155
    .line 156
    const v15, -0x40ae147b    # -0.82f

    .line 157
    .line 158
    .line 159
    const v16, 0x3e6b851f    # 0.23f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v17, -0x4059999a    # -1.3f

    .line 166
    .line 167
    .line 168
    const/high16 v18, -0x41800000    # -0.25f

    .line 169
    .line 170
    const v13, -0x41147ae1    # -0.46f

    .line 171
    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    const v15, -0x4099999a    # -0.9f

    .line 175
    .line 176
    .line 177
    const v16, -0x4247ae14    # -0.09f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, -0x4048f5c3    # -1.43f

    .line 184
    .line 185
    .line 186
    const v2, 0x404c28f6    # 3.19f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, 0x4126e148    # 10.43f

    .line 193
    .line 194
    .line 195
    const/high16 v18, 0x41960000    # 18.75f

    .line 196
    .line 197
    const v13, 0x411a6666    # 9.65f

    .line 198
    .line 199
    .line 200
    const v14, 0x419451ec    # 18.54f

    .line 201
    .line 202
    .line 203
    const v15, 0x41207ae1    # 10.03f

    .line 204
    .line 205
    .line 206
    const v16, 0x41955c29    # 18.67f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, 0x40a4cccd    # 5.15f

    .line 216
    .line 217
    .line 218
    const/high16 v2, 0x41200000    # 10.0f

    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, -0x41800000    # -0.25f

    .line 224
    .line 225
    const v18, 0x3feccccd    # 1.85f

    .line 226
    .line 227
    .line 228
    const v13, -0x41dc28f6    # -0.16f

    .line 229
    .line 230
    .line 231
    const v14, 0x3f170a3d    # 0.59f

    .line 232
    .line 233
    .line 234
    const/high16 v15, -0x41800000    # -0.25f

    .line 235
    .line 236
    const v16, 0x3f9ae148    # 1.21f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, 0x3ea8f5c3    # 0.33f

    .line 243
    .line 244
    .line 245
    const v18, 0x4009999a    # 2.15f

    .line 246
    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const/high16 v14, 0x3f400000    # 0.75f

    .line 250
    .line 251
    const v15, 0x3df5c28f    # 0.12f

    .line 252
    .line 253
    .line 254
    const v16, 0x3fbc28f6    # 1.47f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x3fc7ae14    # 1.56f

    .line 261
    .line 262
    .line 263
    const v18, 0x3f7d70a4    # 0.99f

    .line 264
    .line 265
    .line 266
    const v13, 0x3f2147ae    # 0.63f

    .line 267
    .line 268
    .line 269
    const v14, 0x3d4ccccd    # 0.05f

    .line 270
    .line 271
    .line 272
    const v15, 0x3f9c28f6    # 1.22f

    .line 273
    .line 274
    .line 275
    const v16, 0x3ecccccd    # 0.4f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x3de147ae    # 0.11f

    .line 282
    .line 283
    .line 284
    const v18, 0x3fe51eb8    # 1.79f

    .line 285
    .line 286
    .line 287
    const v13, 0x3ea8f5c3    # 0.33f

    .line 288
    .line 289
    .line 290
    const v14, 0x3f11eb85    # 0.57f

    .line 291
    .line 292
    .line 293
    const v15, 0x3eb33333    # 0.35f

    .line 294
    .line 295
    .line 296
    const v16, 0x3f9d70a4    # 1.23f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x3f5eb852    # 0.87f

    .line 303
    .line 304
    .line 305
    const v18, 0x3f428f5c    # 0.76f

    .line 306
    .line 307
    .line 308
    const v13, 0x3e8a3d71    # 0.27f

    .line 309
    .line 310
    .line 311
    const v14, 0x3e8a3d71    # 0.27f

    .line 312
    .line 313
    .line 314
    const v15, 0x3f0f5c29    # 0.56f

    .line 315
    .line 316
    .line 317
    const v16, 0x3f07ae14    # 0.53f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x3fc28f5c    # 1.52f

    .line 324
    .line 325
    .line 326
    const v2, -0x3fa70a3d    # -3.39f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/4 v0, 0x0

    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, -0x40c00000    # -0.75f

    .line 337
    .line 338
    const v18, -0x3ff7ae14    # -2.13f

    .line 339
    .line 340
    .line 341
    const v13, -0x410f5c29    # -0.47f

    .line 342
    .line 343
    .line 344
    const v14, -0x40eb851f    # -0.58f

    .line 345
    .line 346
    .line 347
    const/high16 v15, -0x40c00000    # -0.75f

    .line 348
    .line 349
    const v16, -0x40570a3d    # -1.32f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, 0x405d70a4    # 3.46f

    .line 356
    .line 357
    .line 358
    const v18, -0x3fa5c28f    # -3.41f

    .line 359
    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const v14, -0x400e147b    # -1.89f

    .line 363
    .line 364
    .line 365
    const v15, 0x3fc66666    # 1.55f

    .line 366
    .line 367
    .line 368
    const v16, -0x3fa5c28f    # -3.41f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v18, 0x405a3d71    # 3.41f

    .line 375
    .line 376
    .line 377
    const v13, 0x3ff47ae1    # 1.91f

    .line 378
    .line 379
    .line 380
    const/4 v14, 0x0

    .line 381
    const v15, 0x405d70a4    # 3.46f

    .line 382
    .line 383
    .line 384
    const v16, 0x3fc3d70a    # 1.53f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x40b851ec    # -0.78f

    .line 391
    .line 392
    .line 393
    const v18, 0x400a3d71    # 2.16f

    .line 394
    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const v14, 0x3f51eb85    # 0.82f

    .line 398
    .line 399
    .line 400
    const v15, -0x416b851f    # -0.29f

    .line 401
    .line 402
    .line 403
    const v16, 0x3fc8f5c3    # 1.57f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 410
    .line 411
    const v2, 0x40566666    # 3.35f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, 0x3f666666    # 0.9f

    .line 418
    .line 419
    .line 420
    const v18, -0x40b5c28f    # -0.79f

    .line 421
    .line 422
    .line 423
    const v13, 0x3ea3d70a    # 0.32f

    .line 424
    .line 425
    .line 426
    const v14, -0x418a3d71    # -0.24f

    .line 427
    .line 428
    .line 429
    const v15, 0x3f1eb852    # 0.62f

    .line 430
    .line 431
    .line 432
    const/high16 v16, -0x41000000    # -0.5f

    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, 0x3df5c28f    # 0.12f

    .line 438
    .line 439
    .line 440
    const/high16 v18, -0x40200000    # -1.75f

    .line 441
    .line 442
    const v13, -0x419eb852    # -0.22f

    .line 443
    .line 444
    .line 445
    const v14, -0x40f33333    # -0.55f

    .line 446
    .line 447
    .line 448
    const v15, -0x41b33333    # -0.2f

    .line 449
    .line 450
    .line 451
    const v16, -0x40666666    # -1.2f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, 0x3fc28f5c    # 1.52f

    .line 458
    .line 459
    .line 460
    const v18, -0x40828f5c    # -0.99f

    .line 461
    .line 462
    .line 463
    const v13, 0x3ea8f5c3    # 0.33f

    .line 464
    .line 465
    .line 466
    const v14, -0x40ee147b    # -0.57f

    .line 467
    .line 468
    .line 469
    const v15, 0x3f666666    # 0.9f

    .line 470
    .line 471
    .line 472
    const v16, -0x40947ae1    # -0.92f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v17, 0x3eae147b    # 0.34f

    .line 479
    .line 480
    .line 481
    const v18, -0x3ff5c28f    # -2.16f

    .line 482
    .line 483
    .line 484
    const v13, 0x3e6147ae    # 0.22f

    .line 485
    .line 486
    .line 487
    const v14, -0x40d1eb85    # -0.68f

    .line 488
    .line 489
    .line 490
    const v15, 0x3eae147b    # 0.34f

    .line 491
    .line 492
    .line 493
    const v16, -0x404b851f    # -1.41f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, -0x41800000    # -0.25f

    .line 500
    .line 501
    const v18, -0x4011eb85    # -1.86f

    .line 502
    .line 503
    .line 504
    const/4 v13, 0x0

    .line 505
    const v14, -0x40dc28f6    # -0.64f

    .line 506
    .line 507
    .line 508
    const v15, -0x4247ae14    # -0.09f

    .line 509
    .line 510
    .line 511
    const v16, -0x405d70a4    # -1.27f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, -0x40333333    # -1.6f

    .line 518
    .line 519
    .line 520
    const/high16 v18, -0x40800000    # -1.0f

    .line 521
    .line 522
    const v13, -0x40dc28f6    # -0.64f

    .line 523
    .line 524
    .line 525
    const v14, -0x42dc28f6    # -0.04f

    .line 526
    .line 527
    .line 528
    const v15, -0x405eb852    # -1.26f

    .line 529
    .line 530
    .line 531
    const v16, -0x413851ec    # -0.39f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, -0x430a3d71    # -0.03f

    .line 538
    .line 539
    .line 540
    const v18, -0x40066666    # -1.95f

    .line 541
    .line 542
    .line 543
    const v13, -0x4147ae14    # -0.36f

    .line 544
    .line 545
    .line 546
    const v14, -0x40e147ae    # -0.62f

    .line 547
    .line 548
    .line 549
    const v15, -0x414ccccd    # -0.35f

    .line 550
    .line 551
    .line 552
    const v16, -0x4051eb85    # -1.36f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, -0x3fa3d70a    # -3.44f

    .line 559
    .line 560
    .line 561
    const v18, -0x3ffccccd    # -2.05f

    .line 562
    .line 563
    .line 564
    const v13, -0x40970a3d    # -0.91f

    .line 565
    .line 566
    .line 567
    const v14, -0x40851eb8    # -0.98f

    .line 568
    .line 569
    .line 570
    const v15, -0x3ff9999a    # -2.1f

    .line 571
    .line 572
    .line 573
    const v16, -0x40251eb8    # -1.71f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v17, 0x41400000    # 12.0f

    .line 580
    .line 581
    const/high16 v18, 0x40c00000    # 6.0f

    .line 582
    .line 583
    const v13, 0x41563d71    # 13.39f

    .line 584
    .line 585
    .line 586
    const v14, 0x40b33333    # 5.6f

    .line 587
    .line 588
    .line 589
    const v15, 0x414bd70a    # 12.74f

    .line 590
    .line 591
    .line 592
    const/high16 v16, 0x40c00000    # 6.0f

    .line 593
    .line 594
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, -0x402147ae    # -1.74f

    .line 598
    .line 599
    .line 600
    const v18, -0x407eb852    # -1.01f

    .line 601
    .line 602
    .line 603
    const v13, -0x40c28f5c    # -0.74f

    .line 604
    .line 605
    .line 606
    const/4 v14, 0x0

    .line 607
    const v15, -0x404e147b    # -1.39f

    .line 608
    .line 609
    .line 610
    const v16, -0x412e147b    # -0.41f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v17, 0x40da3d71    # 6.82f

    .line 617
    .line 618
    .line 619
    const v18, 0x40e0a3d7    # 7.02f

    .line 620
    .line 621
    .line 622
    const v13, 0x410eb852    # 8.92f

    .line 623
    .line 624
    .line 625
    const v14, 0x40aa8f5c    # 5.33f

    .line 626
    .line 627
    .line 628
    const v15, 0x40f75c29    # 7.73f

    .line 629
    .line 630
    .line 631
    const v16, 0x40c147ae    # 6.04f

    .line 632
    .line 633
    .line 634
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const v17, 0x40d9999a    # 6.8f

    .line 638
    .line 639
    .line 640
    const/high16 v18, 0x41100000    # 9.0f

    .line 641
    .line 642
    const v13, 0x40e4cccd    # 7.15f

    .line 643
    .line 644
    .line 645
    const v14, 0x40f3d70a    # 7.62f

    .line 646
    .line 647
    .line 648
    const v15, 0x40e570a4    # 7.17f

    .line 649
    .line 650
    .line 651
    const v16, 0x4105eb85    # 8.37f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v17, 0x40a4cccd    # 5.15f

    .line 658
    .line 659
    .line 660
    const/high16 v18, 0x41200000    # 10.0f

    .line 661
    .line 662
    const v13, 0x40ce6666    # 6.45f

    .line 663
    .line 664
    .line 665
    const v14, 0x4119eb85    # 9.62f

    .line 666
    .line 667
    .line 668
    const v15, 0x40b9eb85    # 5.81f

    .line 669
    .line 670
    .line 671
    const v16, 0x411f851f    # 9.97f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v0, 0x411947ae    # 9.58f

    .line 681
    .line 682
    .line 683
    const v2, 0x40766666    # 3.85f

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, 0x4055c28f    # 3.34f

    .line 690
    .line 691
    .line 692
    const/high16 v18, 0x40e00000    # 7.0f

    .line 693
    .line 694
    const v13, 0x40447ae1    # 3.07f

    .line 695
    .line 696
    .line 697
    const v14, 0x410fae14    # 8.98f

    .line 698
    .line 699
    .line 700
    const v15, 0x40351eb8    # 2.83f

    .line 701
    .line 702
    .line 703
    const v16, 0x40fc28f6    # 7.88f

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v17, 0x401f5c29    # 2.49f

    .line 710
    .line 711
    .line 712
    const v18, -0x40a66666    # -0.85f

    .line 713
    .line 714
    .line 715
    const v13, 0x3f028f5c    # 0.51f

    .line 716
    .line 717
    .line 718
    const v14, -0x409eb852    # -0.88f

    .line 719
    .line 720
    .line 721
    const v15, 0x3fca3d71    # 1.58f

    .line 722
    .line 723
    .line 724
    const v16, -0x40628f5c    # -1.23f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v17, 0x4085c28f    # 4.18f

    .line 731
    .line 732
    .line 733
    const v18, -0x3fe51eb8    # -2.42f

    .line 734
    .line 735
    .line 736
    const v13, 0x3f8e147b    # 1.11f

    .line 737
    .line 738
    .line 739
    const v14, -0x406a3d71    # -1.17f

    .line 740
    .line 741
    .line 742
    const v15, 0x4023d70a    # 2.56f

    .line 743
    .line 744
    .line 745
    const v16, -0x3ffe147b    # -2.03f

    .line 746
    .line 747
    .line 748
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v17, 0x41400000    # 12.0f

    .line 752
    .line 753
    const/high16 v18, 0x40000000    # 2.0f

    .line 754
    .line 755
    const v13, 0x41226666    # 10.15f

    .line 756
    .line 757
    .line 758
    const/high16 v14, 0x40300000    # 2.75f

    .line 759
    .line 760
    const v15, 0x412fd70a    # 10.99f

    .line 761
    .line 762
    .line 763
    const/high16 v16, 0x40000000    # 2.0f

    .line 764
    .line 765
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v17, 0x3ffd70a4    # 1.98f

    .line 769
    .line 770
    .line 771
    const v18, 0x3fdd70a4    # 1.73f

    .line 772
    .line 773
    .line 774
    const v13, 0x3f8147ae    # 1.01f

    .line 775
    .line 776
    .line 777
    const/4 v14, 0x0

    .line 778
    const v15, 0x3feccccd    # 1.85f

    .line 779
    .line 780
    .line 781
    const/high16 v16, 0x3f400000    # 0.75f

    .line 782
    .line 783
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v17, 0x4085c28f    # 4.18f

    .line 787
    .line 788
    .line 789
    const v18, 0x401ae148    # 2.42f

    .line 790
    .line 791
    .line 792
    const v13, 0x3fd0a3d7    # 1.63f

    .line 793
    .line 794
    .line 795
    const v14, 0x3ec7ae14    # 0.39f

    .line 796
    .line 797
    .line 798
    const v15, 0x40447ae1    # 3.07f

    .line 799
    .line 800
    .line 801
    const v16, 0x3f9eb852    # 1.24f

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const v17, 0x401f5c29    # 2.49f

    .line 808
    .line 809
    .line 810
    const v18, 0x3f59999a    # 0.85f

    .line 811
    .line 812
    .line 813
    const v13, 0x3f68f5c3    # 0.91f

    .line 814
    .line 815
    .line 816
    const v14, -0x413d70a4    # -0.38f

    .line 817
    .line 818
    .line 819
    const v15, 0x3ffeb852    # 1.99f

    .line 820
    .line 821
    .line 822
    const v16, -0x430a3d71    # -0.03f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v17, -0x40fd70a4    # -0.51f

    .line 829
    .line 830
    .line 831
    const v18, 0x40251eb8    # 2.58f

    .line 832
    .line 833
    .line 834
    const v13, 0x3f028f5c    # 0.51f

    .line 835
    .line 836
    .line 837
    const v14, 0x3f6147ae    # 0.88f

    .line 838
    .line 839
    .line 840
    const v15, 0x3e8a3d71    # 0.27f

    .line 841
    .line 842
    .line 843
    const v16, 0x3ffd70a4    # 1.98f

    .line 844
    .line 845
    .line 846
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const v17, 0x3eb33333    # 0.35f

    .line 850
    .line 851
    .line 852
    const v18, 0x401ae148    # 2.42f

    .line 853
    .line 854
    .line 855
    const v13, 0x3e6b851f    # 0.23f

    .line 856
    .line 857
    .line 858
    const v14, 0x3f451eb8    # 0.77f

    .line 859
    .line 860
    .line 861
    const v15, 0x3eb33333    # 0.35f

    .line 862
    .line 863
    .line 864
    const v16, 0x3fca3d71    # 1.58f

    .line 865
    .line 866
    .line 867
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const v0, -0x414ccccd    # -0.35f

    .line 871
    .line 872
    .line 873
    const v2, 0x401ae148    # 2.42f

    .line 874
    .line 875
    .line 876
    const v4, -0x420a3d71    # -0.12f

    .line 877
    .line 878
    .line 879
    const v6, 0x3fd33333    # 1.65f

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const v17, 0x3f028f5c    # 0.51f

    .line 886
    .line 887
    .line 888
    const v18, 0x40251eb8    # 2.58f

    .line 889
    .line 890
    .line 891
    const v13, 0x3f47ae14    # 0.78f

    .line 892
    .line 893
    .line 894
    const v14, 0x3f19999a    # 0.6f

    .line 895
    .line 896
    .line 897
    const v15, 0x3f828f5c    # 1.02f

    .line 898
    .line 899
    .line 900
    const v16, 0x3fd9999a    # 1.7f

    .line 901
    .line 902
    .line 903
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v17, -0x3fe0a3d7    # -2.49f

    .line 907
    .line 908
    .line 909
    const v18, 0x3f59999a    # 0.85f

    .line 910
    .line 911
    .line 912
    const v13, -0x40fd70a4    # -0.51f

    .line 913
    .line 914
    .line 915
    const v14, 0x3f6147ae    # 0.88f

    .line 916
    .line 917
    .line 918
    const v15, -0x4035c28f    # -1.58f

    .line 919
    .line 920
    .line 921
    const v16, 0x3f9d70a4    # 1.23f

    .line 922
    .line 923
    .line 924
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const v17, -0x40547ae1    # -1.34f

    .line 928
    .line 929
    .line 930
    const v18, 0x3f933333    # 1.15f

    .line 931
    .line 932
    .line 933
    const v13, -0x41333333    # -0.4f

    .line 934
    .line 935
    .line 936
    const v14, 0x3edc28f6    # 0.43f

    .line 937
    .line 938
    .line 939
    const v15, -0x40a66666    # -0.85f

    .line 940
    .line 941
    .line 942
    const v16, 0x3f4f5c29    # 0.81f

    .line 943
    .line 944
    .line 945
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 946
    .line 947
    .line 948
    const v0, 0x3fab851f    # 1.34f

    .line 949
    .line 950
    .line 951
    const/high16 v2, 0x40400000    # 3.0f

    .line 952
    .line 953
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v0, 0x41826666    # 16.3f

    .line 957
    .line 958
    .line 959
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const v0, -0x4087ae14    # -0.97f

    .line 963
    .line 964
    .line 965
    const v2, -0x3ff51eb8    # -2.17f

    .line 966
    .line 967
    .line 968
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v18, 0x3ee147ae    # 0.44f

    .line 972
    .line 973
    .line 974
    const v13, -0x4123d70a    # -0.43f

    .line 975
    .line 976
    .line 977
    const v14, 0x3e3851ec    # 0.18f

    .line 978
    .line 979
    .line 980
    const v15, -0x409eb852    # -0.88f

    .line 981
    .line 982
    .line 983
    const v16, 0x3ea8f5c3    # 0.33f

    .line 984
    .line 985
    .line 986
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const/high16 v17, 0x41400000    # 12.0f

    .line 990
    .line 991
    const/high16 v18, 0x41b00000    # 22.0f

    .line 992
    .line 993
    const v13, 0x415d999a    # 13.85f

    .line 994
    .line 995
    .line 996
    const/high16 v14, 0x41aa0000    # 21.25f

    .line 997
    .line 998
    const v15, 0x415028f6    # 13.01f

    .line 999
    .line 1000
    .line 1001
    const/high16 v16, 0x41b00000    # 22.0f

    .line 1002
    .line 1003
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    const v17, -0x40028f5c    # -1.98f

    .line 1007
    .line 1008
    .line 1009
    const v18, -0x40228f5c    # -1.73f

    .line 1010
    .line 1011
    .line 1012
    const v13, -0x407eb852    # -1.01f

    .line 1013
    .line 1014
    .line 1015
    const/4 v14, 0x0

    .line 1016
    const v15, -0x40133333    # -1.85f

    .line 1017
    .line 1018
    .line 1019
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1020
    .line 1021
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const v17, 0x410a3d71    # 8.64f

    .line 1025
    .line 1026
    .line 1027
    const v18, 0x419e7ae1    # 19.81f

    .line 1028
    .line 1029
    .line 1030
    const v13, 0x4118a3d7    # 9.54f

    .line 1031
    .line 1032
    .line 1033
    const v14, 0x41a13333    # 20.15f

    .line 1034
    .line 1035
    .line 1036
    const v15, 0x411147ae    # 9.08f

    .line 1037
    .line 1038
    .line 1039
    const/high16 v16, 0x41a00000    # 20.0f

    .line 1040
    .line 1041
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    const v0, 0x40f51eb8    # 7.66f

    .line 1045
    .line 1046
    .line 1047
    const/high16 v2, 0x41b00000    # 22.0f

    .line 1048
    .line 1049
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    const v0, 0x40b8f5c3    # 5.78f

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const v0, 0x3fae147b    # 1.36f

    .line 1059
    .line 1060
    .line 1061
    const v2, -0x3fbe147b    # -3.03f

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    const v17, -0x4059999a    # -1.3f

    .line 1068
    .line 1069
    .line 1070
    const v18, -0x4070a3d7    # -1.12f

    .line 1071
    .line 1072
    .line 1073
    const v13, -0x410f5c29    # -0.47f

    .line 1074
    .line 1075
    .line 1076
    const v14, -0x41570a3d    # -0.33f

    .line 1077
    .line 1078
    .line 1079
    const v15, -0x40970a3d    # -0.91f

    .line 1080
    .line 1081
    .line 1082
    const v16, -0x40ca3d71    # -0.71f

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    const v17, 0x4055c28f    # 3.34f

    .line 1089
    .line 1090
    .line 1091
    const/high16 v18, 0x41880000    # 17.0f

    .line 1092
    .line 1093
    const v13, 0x409d70a4    # 4.92f

    .line 1094
    .line 1095
    .line 1096
    const v14, 0x4191d70a    # 18.23f

    .line 1097
    .line 1098
    .line 1099
    const v15, 0x40766666    # 3.85f

    .line 1100
    .line 1101
    .line 1102
    const v16, 0x418f0a3d    # 17.88f

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1106
    .line 1107
    .line 1108
    const v17, 0x3f028f5c    # 0.51f

    .line 1109
    .line 1110
    .line 1111
    const v18, -0x3fdae148    # -2.58f

    .line 1112
    .line 1113
    .line 1114
    const v13, -0x40fd70a4    # -0.51f

    .line 1115
    .line 1116
    .line 1117
    const v14, -0x409eb852    # -0.88f

    .line 1118
    .line 1119
    .line 1120
    const v15, -0x4175c28f    # -0.27f

    .line 1121
    .line 1122
    .line 1123
    const v16, -0x40028f5c    # -1.98f

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1127
    .line 1128
    .line 1129
    const/high16 v17, 0x40600000    # 3.5f

    .line 1130
    .line 1131
    const/high16 v18, 0x41400000    # 12.0f

    .line 1132
    .line 1133
    const v13, 0x4067ae14    # 3.62f

    .line 1134
    .line 1135
    .line 1136
    const v14, 0x415a6666    # 13.65f

    .line 1137
    .line 1138
    .line 1139
    const/high16 v15, 0x40600000    # 3.5f

    .line 1140
    .line 1141
    const v16, 0x414d70a4    # 12.84f

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1145
    .line 1146
    .line 1147
    const v0, 0x4067ae14    # 3.62f

    .line 1148
    .line 1149
    .line 1150
    const v2, 0x4125999a    # 10.35f

    .line 1151
    .line 1152
    .line 1153
    const v4, 0x411947ae    # 9.58f

    .line 1154
    .line 1155
    .line 1156
    const v6, 0x40766666    # 3.85f

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v2

    .line 1169
    const/16 v16, 0x3800

    .line 1170
    .line 1171
    const/16 v17, 0x0

    .line 1172
    .line 1173
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1174
    .line 1175
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1176
    .line 1177
    const/4 v7, 0x0

    .line 1178
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1179
    .line 1180
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1181
    .line 1182
    const/4 v13, 0x0

    .line 1183
    const/4 v14, 0x0

    .line 1184
    const/4 v15, 0x0

    .line 1185
    const-string v4, ""

    .line 1186
    .line 1187
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    sput-object v0, Landroidx/compose/material/icons/filled/AttractionsKt;->_attractions:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1196
    .line 1197
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1198
    .line 1199
    .line 1200
    return-object v0
.end method

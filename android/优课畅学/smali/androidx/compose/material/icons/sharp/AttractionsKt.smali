.class public final Landroidx/compose/material/icons/sharp/AttractionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _attractions:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttractions(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/AttractionsKt;->_attractions:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Attractions"

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
    const v0, 0x41270a3d    # 10.44f

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
    const v17, 0x3fc8f5c3    # 1.57f

    .line 79
    .line 80
    .line 81
    const/high16 v18, -0x40c00000    # -0.75f

    .line 82
    .line 83
    const v13, 0x3ebd70a4    # 0.37f

    .line 84
    .line 85
    .line 86
    const v14, -0x41147ae1    # -0.46f

    .line 87
    .line 88
    .line 89
    const v15, 0x3f70a3d7    # 0.94f

    .line 90
    .line 91
    .line 92
    const/high16 v16, -0x40c00000    # -0.75f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, 0x3e947ae1    # 0.29f

    .line 98
    .line 99
    .line 100
    const v2, 0x3fc7ae14    # 1.56f

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x3f400000    # 0.75f

    .line 104
    .line 105
    const v6, 0x3f9851ec    # 1.19f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x3f8f5c29    # 1.12f

    .line 112
    .line 113
    .line 114
    const v18, -0x4147ae14    # -0.36f

    .line 115
    .line 116
    .line 117
    const v13, 0x3ec7ae14    # 0.39f

    .line 118
    .line 119
    .line 120
    const v14, -0x4247ae14    # -0.09f

    .line 121
    .line 122
    .line 123
    const v15, 0x3f428f5c    # 0.76f

    .line 124
    .line 125
    .line 126
    const v16, -0x41a8f5c3    # -0.21f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, -0x404a3d71    # -1.42f

    .line 133
    .line 134
    .line 135
    const v2, -0x3fb47ae1    # -3.18f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, -0x405eb852    # -1.26f

    .line 142
    .line 143
    .line 144
    const v18, 0x3e6b851f    # 0.23f

    .line 145
    .line 146
    .line 147
    const v13, -0x413851ec    # -0.39f

    .line 148
    .line 149
    .line 150
    const v14, 0x3e19999a    # 0.15f

    .line 151
    .line 152
    .line 153
    const v15, -0x40ae147b    # -0.82f

    .line 154
    .line 155
    .line 156
    const v16, 0x3e6b851f    # 0.23f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, -0x4059999a    # -1.3f

    .line 163
    .line 164
    .line 165
    const/high16 v18, -0x41800000    # -0.25f

    .line 166
    .line 167
    const v13, -0x41147ae1    # -0.46f

    .line 168
    .line 169
    .line 170
    const/4 v14, 0x0

    .line 171
    const v15, -0x4099999a    # -0.9f

    .line 172
    .line 173
    .line 174
    const v16, -0x4247ae14    # -0.09f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, -0x4048f5c3    # -1.43f

    .line 181
    .line 182
    .line 183
    const v2, 0x404c28f6    # 3.19f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x41270a3d    # 10.44f

    .line 190
    .line 191
    .line 192
    const/high16 v18, 0x41960000    # 18.75f

    .line 193
    .line 194
    const v13, 0x411a6666    # 9.65f

    .line 195
    .line 196
    .line 197
    const v14, 0x419451ec    # 18.54f

    .line 198
    .line 199
    .line 200
    const v15, 0x41207ae1    # 10.03f

    .line 201
    .line 202
    .line 203
    const v16, 0x41955c29    # 18.67f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v0, 0x40a51eb8    # 5.16f

    .line 213
    .line 214
    .line 215
    const/high16 v2, 0x41200000    # 10.0f

    .line 216
    .line 217
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v17, 0x409d1eb8    # 4.91f

    .line 221
    .line 222
    .line 223
    const v18, 0x413d999a    # 11.85f

    .line 224
    .line 225
    .line 226
    const/high16 v13, 0x40a00000    # 5.0f

    .line 227
    .line 228
    const v14, 0x412970a4    # 10.59f

    .line 229
    .line 230
    .line 231
    const v15, 0x409d1eb8    # 4.91f

    .line 232
    .line 233
    .line 234
    const v16, 0x41335c29    # 11.21f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x3ea8f5c3    # 0.33f

    .line 241
    .line 242
    .line 243
    const v18, 0x4009999a    # 2.15f

    .line 244
    .line 245
    .line 246
    const/4 v13, 0x0

    .line 247
    const/high16 v14, 0x3f400000    # 0.75f

    .line 248
    .line 249
    const v15, 0x3df5c28f    # 0.12f

    .line 250
    .line 251
    .line 252
    const v16, 0x3fbc28f6    # 1.47f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, 0x3fc7ae14    # 1.56f

    .line 259
    .line 260
    .line 261
    const v18, 0x3f7d70a4    # 0.99f

    .line 262
    .line 263
    .line 264
    const v13, 0x3f2147ae    # 0.63f

    .line 265
    .line 266
    .line 267
    const v14, 0x3d4ccccd    # 0.05f

    .line 268
    .line 269
    .line 270
    const v15, 0x3f9c28f6    # 1.22f

    .line 271
    .line 272
    .line 273
    const v16, 0x3ecccccd    # 0.4f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, 0x3de147ae    # 0.11f

    .line 280
    .line 281
    .line 282
    const v18, 0x3fe51eb8    # 1.79f

    .line 283
    .line 284
    .line 285
    const v13, 0x3ea8f5c3    # 0.33f

    .line 286
    .line 287
    .line 288
    const v14, 0x3f11eb85    # 0.57f

    .line 289
    .line 290
    .line 291
    const v15, 0x3eb33333    # 0.35f

    .line 292
    .line 293
    .line 294
    const v16, 0x3f9d70a4    # 1.23f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x3f5eb852    # 0.87f

    .line 301
    .line 302
    .line 303
    const v18, 0x3f428f5c    # 0.76f

    .line 304
    .line 305
    .line 306
    const v13, 0x3e8a3d71    # 0.27f

    .line 307
    .line 308
    .line 309
    const v14, 0x3e8a3d71    # 0.27f

    .line 310
    .line 311
    .line 312
    const v15, 0x3f0f5c29    # 0.56f

    .line 313
    .line 314
    .line 315
    const v16, 0x3f07ae14    # 0.53f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, 0x3fc28f5c    # 1.52f

    .line 322
    .line 323
    .line 324
    const v2, -0x3fa70a3d    # -3.39f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/4 v0, 0x0

    .line 331
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, -0x40c00000    # -0.75f

    .line 335
    .line 336
    const v18, -0x3ff7ae14    # -2.13f

    .line 337
    .line 338
    .line 339
    const v13, -0x410f5c29    # -0.47f

    .line 340
    .line 341
    .line 342
    const v14, -0x40eb851f    # -0.58f

    .line 343
    .line 344
    .line 345
    const/high16 v15, -0x40c00000    # -0.75f

    .line 346
    .line 347
    const v16, -0x40570a3d    # -1.32f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, 0x405d70a4    # 3.46f

    .line 354
    .line 355
    .line 356
    const v18, -0x3fa5c28f    # -3.41f

    .line 357
    .line 358
    .line 359
    const/4 v13, 0x0

    .line 360
    const v14, -0x400e147b    # -1.89f

    .line 361
    .line 362
    .line 363
    const v15, 0x3fc66666    # 1.55f

    .line 364
    .line 365
    .line 366
    const v16, -0x3fa5c28f    # -3.41f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v0, 0x3fc3d70a    # 1.53f

    .line 373
    .line 374
    .line 375
    const v2, 0x405a3d71    # 3.41f

    .line 376
    .line 377
    .line 378
    const v4, 0x405d70a4    # 3.46f

    .line 379
    .line 380
    .line 381
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, -0x40b851ec    # -0.78f

    .line 385
    .line 386
    .line 387
    const v18, 0x400a3d71    # 2.16f

    .line 388
    .line 389
    .line 390
    const v14, 0x3f51eb85    # 0.82f

    .line 391
    .line 392
    .line 393
    const v15, -0x416b851f    # -0.29f

    .line 394
    .line 395
    .line 396
    const v16, 0x3fc8f5c3    # 1.57f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 403
    .line 404
    const v2, 0x40566666    # 3.35f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x3f666666    # 0.9f

    .line 411
    .line 412
    .line 413
    const v18, -0x40b5c28f    # -0.79f

    .line 414
    .line 415
    .line 416
    const v13, 0x3ea3d70a    # 0.32f

    .line 417
    .line 418
    .line 419
    const v14, -0x418a3d71    # -0.24f

    .line 420
    .line 421
    .line 422
    const v15, 0x3f1eb852    # 0.62f

    .line 423
    .line 424
    .line 425
    const/high16 v16, -0x41000000    # -0.5f

    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x3df5c28f    # 0.12f

    .line 431
    .line 432
    .line 433
    const/high16 v18, -0x40200000    # -1.75f

    .line 434
    .line 435
    const v13, -0x419eb852    # -0.22f

    .line 436
    .line 437
    .line 438
    const v14, -0x40f33333    # -0.55f

    .line 439
    .line 440
    .line 441
    const v15, -0x41b33333    # -0.2f

    .line 442
    .line 443
    .line 444
    const v16, -0x40666666    # -1.2f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x3fc28f5c    # 1.52f

    .line 451
    .line 452
    .line 453
    const v18, -0x40828f5c    # -0.99f

    .line 454
    .line 455
    .line 456
    const v13, 0x3ea8f5c3    # 0.33f

    .line 457
    .line 458
    .line 459
    const v14, -0x40ee147b    # -0.57f

    .line 460
    .line 461
    .line 462
    const v15, 0x3f666666    # 0.9f

    .line 463
    .line 464
    .line 465
    const v16, -0x40947ae1    # -0.92f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x3eae147b    # 0.34f

    .line 472
    .line 473
    .line 474
    const v18, -0x3ff5c28f    # -2.16f

    .line 475
    .line 476
    .line 477
    const v13, 0x3e6147ae    # 0.22f

    .line 478
    .line 479
    .line 480
    const v14, -0x40d1eb85    # -0.68f

    .line 481
    .line 482
    .line 483
    const v15, 0x3eae147b    # 0.34f

    .line 484
    .line 485
    .line 486
    const v16, -0x404b851f    # -1.41f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v17, -0x41800000    # -0.25f

    .line 493
    .line 494
    const v18, -0x4011eb85    # -1.86f

    .line 495
    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const v14, -0x40dc28f6    # -0.64f

    .line 499
    .line 500
    .line 501
    const v15, -0x4247ae14    # -0.09f

    .line 502
    .line 503
    .line 504
    const v16, -0x405d70a4    # -1.27f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v17, -0x40333333    # -1.6f

    .line 511
    .line 512
    .line 513
    const/high16 v18, -0x40800000    # -1.0f

    .line 514
    .line 515
    const v13, -0x40dc28f6    # -0.64f

    .line 516
    .line 517
    .line 518
    const v14, -0x42dc28f6    # -0.04f

    .line 519
    .line 520
    .line 521
    const v15, -0x405eb852    # -1.26f

    .line 522
    .line 523
    .line 524
    const v16, -0x413851ec    # -0.39f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, -0x430a3d71    # -0.03f

    .line 531
    .line 532
    .line 533
    const v18, -0x40066666    # -1.95f

    .line 534
    .line 535
    .line 536
    const v13, -0x4147ae14    # -0.36f

    .line 537
    .line 538
    .line 539
    const v14, -0x40e147ae    # -0.62f

    .line 540
    .line 541
    .line 542
    const v15, -0x414ccccd    # -0.35f

    .line 543
    .line 544
    .line 545
    const v16, -0x4051eb85    # -1.36f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, -0x3fa3d70a    # -3.44f

    .line 552
    .line 553
    .line 554
    const v18, -0x3ffccccd    # -2.05f

    .line 555
    .line 556
    .line 557
    const v13, -0x40970a3d    # -0.91f

    .line 558
    .line 559
    .line 560
    const v14, -0x40851eb8    # -0.98f

    .line 561
    .line 562
    .line 563
    const v15, -0x3ff9999a    # -2.1f

    .line 564
    .line 565
    .line 566
    const v16, -0x40251eb8    # -1.71f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v17, 0x414028f6    # 12.01f

    .line 573
    .line 574
    .line 575
    const/high16 v18, 0x40c00000    # 6.0f

    .line 576
    .line 577
    const v13, 0x41566666    # 13.4f

    .line 578
    .line 579
    .line 580
    const v14, 0x40b33333    # 5.6f

    .line 581
    .line 582
    .line 583
    const v15, 0x414bd70a    # 12.74f

    .line 584
    .line 585
    .line 586
    const/high16 v16, 0x40c00000    # 6.0f

    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, -0x402147ae    # -1.74f

    .line 592
    .line 593
    .line 594
    const v2, -0x407eb852    # -1.01f

    .line 595
    .line 596
    .line 597
    const v4, -0x404e147b    # -1.39f

    .line 598
    .line 599
    .line 600
    const v6, -0x412e147b    # -0.41f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v17, 0x40da8f5c    # 6.83f

    .line 607
    .line 608
    .line 609
    const v18, 0x40e0a3d7    # 7.02f

    .line 610
    .line 611
    .line 612
    const v13, 0x410ee148    # 8.93f

    .line 613
    .line 614
    .line 615
    const v14, 0x40aa8f5c    # 5.33f

    .line 616
    .line 617
    .line 618
    const v15, 0x40f7ae14    # 7.74f

    .line 619
    .line 620
    .line 621
    const v16, 0x40c147ae    # 6.04f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v17, 0x40d9eb85    # 6.81f

    .line 628
    .line 629
    .line 630
    const/high16 v18, 0x41100000    # 9.0f

    .line 631
    .line 632
    const v13, 0x40e51eb8    # 7.16f

    .line 633
    .line 634
    .line 635
    const v14, 0x40f3d70a    # 7.62f

    .line 636
    .line 637
    .line 638
    const v15, 0x40e5c28f    # 7.18f

    .line 639
    .line 640
    .line 641
    const v16, 0x4105eb85    # 8.37f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v17, 0x40a51eb8    # 5.16f

    .line 648
    .line 649
    .line 650
    const/high16 v18, 0x41200000    # 10.0f

    .line 651
    .line 652
    const v13, 0x40ce6666    # 6.45f

    .line 653
    .line 654
    .line 655
    const v14, 0x4119eb85    # 9.62f

    .line 656
    .line 657
    .line 658
    const v15, 0x40ba3d71    # 5.82f

    .line 659
    .line 660
    .line 661
    const v16, 0x411f851f    # 9.97f

    .line 662
    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, 0x411947ae    # 9.58f

    .line 671
    .line 672
    .line 673
    const v2, 0x40770a3d    # 3.86f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v17, 0x40566666    # 3.35f

    .line 680
    .line 681
    .line 682
    const/high16 v18, 0x40e00000    # 7.0f

    .line 683
    .line 684
    const v13, 0x40451eb8    # 3.08f

    .line 685
    .line 686
    .line 687
    const v14, 0x410fae14    # 8.98f

    .line 688
    .line 689
    .line 690
    const v15, 0x4035c28f    # 2.84f

    .line 691
    .line 692
    .line 693
    const v16, 0x40fc28f6    # 7.88f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, 0x401f5c29    # 2.49f

    .line 700
    .line 701
    .line 702
    const v2, -0x40a66666    # -0.85f

    .line 703
    .line 704
    .line 705
    const v4, 0x3fca3d71    # 1.58f

    .line 706
    .line 707
    .line 708
    const v6, -0x40628f5c    # -1.23f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, 0x4085c28f    # 4.18f

    .line 715
    .line 716
    .line 717
    const v18, -0x3fe51eb8    # -2.42f

    .line 718
    .line 719
    .line 720
    const v13, 0x3f8e147b    # 1.11f

    .line 721
    .line 722
    .line 723
    const v14, -0x406a3d71    # -1.17f

    .line 724
    .line 725
    .line 726
    const v15, 0x4023d70a    # 2.56f

    .line 727
    .line 728
    .line 729
    const v16, -0x3ffe147b    # -2.03f

    .line 730
    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v17, 0x414028f6    # 12.01f

    .line 736
    .line 737
    .line 738
    const/high16 v18, 0x40000000    # 2.0f

    .line 739
    .line 740
    const v13, 0x41226666    # 10.15f

    .line 741
    .line 742
    .line 743
    const/high16 v14, 0x40300000    # 2.75f

    .line 744
    .line 745
    const v15, 0x412fd70a    # 10.99f

    .line 746
    .line 747
    .line 748
    const/high16 v16, 0x40000000    # 2.0f

    .line 749
    .line 750
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v0, 0x3ffd70a4    # 1.98f

    .line 754
    .line 755
    .line 756
    const v2, 0x3fdd70a4    # 1.73f

    .line 757
    .line 758
    .line 759
    const/high16 v4, 0x3f400000    # 0.75f

    .line 760
    .line 761
    const v6, 0x3feccccd    # 1.85f

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const v17, 0x4085c28f    # 4.18f

    .line 768
    .line 769
    .line 770
    const v18, 0x401ae148    # 2.42f

    .line 771
    .line 772
    .line 773
    const v13, 0x3fd0a3d7    # 1.63f

    .line 774
    .line 775
    .line 776
    const v14, 0x3ec7ae14    # 0.39f

    .line 777
    .line 778
    .line 779
    const v15, 0x40447ae1    # 3.07f

    .line 780
    .line 781
    .line 782
    const v16, 0x3f9eb852    # 1.24f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const v17, 0x401f5c29    # 2.49f

    .line 789
    .line 790
    .line 791
    const v18, 0x3f59999a    # 0.85f

    .line 792
    .line 793
    .line 794
    const v13, 0x3f68f5c3    # 0.91f

    .line 795
    .line 796
    .line 797
    const v14, -0x413d70a4    # -0.38f

    .line 798
    .line 799
    .line 800
    const v15, 0x3ffeb852    # 1.99f

    .line 801
    .line 802
    .line 803
    const v16, -0x430a3d71    # -0.03f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v17, -0x40fd70a4    # -0.51f

    .line 810
    .line 811
    .line 812
    const v18, 0x40251eb8    # 2.58f

    .line 813
    .line 814
    .line 815
    const v13, 0x3f028f5c    # 0.51f

    .line 816
    .line 817
    .line 818
    const v14, 0x3f6147ae    # 0.88f

    .line 819
    .line 820
    .line 821
    const v15, 0x3e8a3d71    # 0.27f

    .line 822
    .line 823
    .line 824
    const v16, 0x3ffd70a4    # 1.98f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v17, 0x3eb33333    # 0.35f

    .line 831
    .line 832
    .line 833
    const v18, 0x401ae148    # 2.42f

    .line 834
    .line 835
    .line 836
    const v13, 0x3e6b851f    # 0.23f

    .line 837
    .line 838
    .line 839
    const v14, 0x3f451eb8    # 0.77f

    .line 840
    .line 841
    .line 842
    const v15, 0x3eb33333    # 0.35f

    .line 843
    .line 844
    .line 845
    const v16, 0x3fca3d71    # 1.58f

    .line 846
    .line 847
    .line 848
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v0, -0x414ccccd    # -0.35f

    .line 852
    .line 853
    .line 854
    const v2, 0x401ae148    # 2.42f

    .line 855
    .line 856
    .line 857
    const v4, -0x420a3d71    # -0.12f

    .line 858
    .line 859
    .line 860
    const v6, 0x3fd33333    # 1.65f

    .line 861
    .line 862
    .line 863
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const v17, 0x3f028f5c    # 0.51f

    .line 867
    .line 868
    .line 869
    const v18, 0x40251eb8    # 2.58f

    .line 870
    .line 871
    .line 872
    const v13, 0x3f47ae14    # 0.78f

    .line 873
    .line 874
    .line 875
    const v14, 0x3f19999a    # 0.6f

    .line 876
    .line 877
    .line 878
    const v15, 0x3f828f5c    # 1.02f

    .line 879
    .line 880
    .line 881
    const v16, 0x3fd9999a    # 1.7f

    .line 882
    .line 883
    .line 884
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v0, -0x3fe0a3d7    # -2.49f

    .line 888
    .line 889
    .line 890
    const v2, 0x3f59999a    # 0.85f

    .line 891
    .line 892
    .line 893
    const v4, -0x4035c28f    # -1.58f

    .line 894
    .line 895
    .line 896
    const v6, 0x3f9d70a4    # 1.23f

    .line 897
    .line 898
    .line 899
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v17, -0x40547ae1    # -1.34f

    .line 903
    .line 904
    .line 905
    const v18, 0x3f933333    # 1.15f

    .line 906
    .line 907
    .line 908
    const v13, -0x41333333    # -0.4f

    .line 909
    .line 910
    .line 911
    const v14, 0x3edc28f6    # 0.43f

    .line 912
    .line 913
    .line 914
    const v15, -0x40a66666    # -0.85f

    .line 915
    .line 916
    .line 917
    const v16, 0x3f4f5c29    # 0.81f

    .line 918
    .line 919
    .line 920
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const v0, 0x3fab851f    # 1.34f

    .line 924
    .line 925
    .line 926
    const/high16 v2, 0x40400000    # 3.0f

    .line 927
    .line 928
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const v0, -0x4011eb85    # -1.86f

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const v0, -0x4087ae14    # -0.97f

    .line 938
    .line 939
    .line 940
    const v2, -0x3ff51eb8    # -2.17f

    .line 941
    .line 942
    .line 943
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const v18, 0x3ee147ae    # 0.44f

    .line 947
    .line 948
    .line 949
    const v13, -0x4123d70a    # -0.43f

    .line 950
    .line 951
    .line 952
    const v14, 0x3e3851ec    # 0.18f

    .line 953
    .line 954
    .line 955
    const v15, -0x409eb852    # -0.88f

    .line 956
    .line 957
    .line 958
    const v16, 0x3ea8f5c3    # 0.33f

    .line 959
    .line 960
    .line 961
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const v17, 0x414028f6    # 12.01f

    .line 965
    .line 966
    .line 967
    const/high16 v18, 0x41b00000    # 22.0f

    .line 968
    .line 969
    const v13, 0x415dc28f    # 13.86f

    .line 970
    .line 971
    .line 972
    const/high16 v14, 0x41aa0000    # 21.25f

    .line 973
    .line 974
    const v15, 0x415051ec    # 13.02f

    .line 975
    .line 976
    .line 977
    const/high16 v16, 0x41b00000    # 22.0f

    .line 978
    .line 979
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const/high16 v0, -0x40c00000    # -0.75f

    .line 983
    .line 984
    const v2, -0x40228f5c    # -1.73f

    .line 985
    .line 986
    .line 987
    const v4, -0x40028f5c    # -1.98f

    .line 988
    .line 989
    .line 990
    const v6, -0x40133333    # -1.85f

    .line 991
    .line 992
    .line 993
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    const v17, 0x410a6666    # 8.65f

    .line 997
    .line 998
    .line 999
    const v18, 0x419e7ae1    # 19.81f

    .line 1000
    .line 1001
    .line 1002
    const v13, 0x4118cccd    # 9.55f

    .line 1003
    .line 1004
    .line 1005
    const v14, 0x41a13333    # 20.15f

    .line 1006
    .line 1007
    .line 1008
    const v15, 0x411170a4    # 9.09f

    .line 1009
    .line 1010
    .line 1011
    const/high16 v16, 0x41a00000    # 20.0f

    .line 1012
    .line 1013
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    const v0, 0x40f51eb8    # 7.66f

    .line 1017
    .line 1018
    .line 1019
    const/high16 v2, 0x41b00000    # 22.0f

    .line 1020
    .line 1021
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const v0, 0x40b947ae    # 5.79f

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1028
    .line 1029
    .line 1030
    const v0, 0x3fae147b    # 1.36f

    .line 1031
    .line 1032
    .line 1033
    const v2, -0x3fbe147b    # -3.03f

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const v17, -0x4059999a    # -1.3f

    .line 1040
    .line 1041
    .line 1042
    const v18, -0x4070a3d7    # -1.12f

    .line 1043
    .line 1044
    .line 1045
    const v13, -0x410f5c29    # -0.47f

    .line 1046
    .line 1047
    .line 1048
    const v14, -0x41570a3d    # -0.33f

    .line 1049
    .line 1050
    .line 1051
    const v15, -0x40970a3d    # -0.91f

    .line 1052
    .line 1053
    .line 1054
    const v16, -0x40ca3d71    # -0.71f

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1058
    .line 1059
    .line 1060
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 1061
    .line 1062
    const v18, -0x40a66666    # -0.85f

    .line 1063
    .line 1064
    .line 1065
    const v13, -0x40947ae1    # -0.92f

    .line 1066
    .line 1067
    .line 1068
    const v14, 0x3ec28f5c    # 0.38f

    .line 1069
    .line 1070
    .line 1071
    const v15, -0x400147ae    # -1.99f

    .line 1072
    .line 1073
    .line 1074
    const v16, 0x3cf5c28f    # 0.03f

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1078
    .line 1079
    .line 1080
    const v0, 0x3f028f5c    # 0.51f

    .line 1081
    .line 1082
    .line 1083
    const v2, -0x3fdae148    # -2.58f

    .line 1084
    .line 1085
    .line 1086
    const v6, -0x4175c28f    # -0.27f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const v17, 0x4060a3d7    # 3.51f

    .line 1093
    .line 1094
    .line 1095
    const/high16 v18, 0x41400000    # 12.0f

    .line 1096
    .line 1097
    const v13, 0x4067ae14    # 3.62f

    .line 1098
    .line 1099
    .line 1100
    const v14, 0x415a6666    # 13.65f

    .line 1101
    .line 1102
    .line 1103
    const v15, 0x4060a3d7    # 3.51f

    .line 1104
    .line 1105
    .line 1106
    const v16, 0x414d70a4    # 12.84f

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const v0, 0x4067ae14    # 3.62f

    .line 1113
    .line 1114
    .line 1115
    const v2, 0x4125999a    # 10.35f

    .line 1116
    .line 1117
    .line 1118
    const v4, 0x411947ae    # 9.58f

    .line 1119
    .line 1120
    .line 1121
    const v6, 0x40770a3d    # 3.86f

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    const/16 v16, 0x3800

    .line 1135
    .line 1136
    const/16 v17, 0x0

    .line 1137
    .line 1138
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1139
    .line 1140
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1141
    .line 1142
    const/4 v7, 0x0

    .line 1143
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1144
    .line 1145
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1146
    .line 1147
    const/4 v13, 0x0

    .line 1148
    const/4 v14, 0x0

    .line 1149
    const/4 v15, 0x0

    .line 1150
    const-string v4, ""

    .line 1151
    .line 1152
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    sput-object v0, Landroidx/compose/material/icons/sharp/AttractionsKt;->_attractions:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1161
    .line 1162
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1163
    .line 1164
    .line 1165
    return-object v0
.end method

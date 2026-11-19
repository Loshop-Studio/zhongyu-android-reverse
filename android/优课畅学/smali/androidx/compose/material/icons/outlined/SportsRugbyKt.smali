.class public final Landroidx/compose/material/icons/outlined/SportsRugbyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsRugby:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsRugby(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SportsRugbyKt;->_sportsRugby:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SportsRugby"

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
    const v0, 0x41a3eb85    # 20.49f

    .line 71
    .line 72
    .line 73
    const v2, 0x4060a3d7    # 3.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f7ae148    # -4.16f

    .line 80
    .line 81
    .line 82
    const v18, -0x4087ae14    # -0.97f

    .line 83
    .line 84
    .line 85
    const v13, -0x40f0a3d7    # -0.56f

    .line 86
    .line 87
    .line 88
    const v14, -0x40f0a3d7    # -0.56f

    .line 89
    .line 90
    .line 91
    const v15, -0x3ff66666    # -2.15f

    .line 92
    .line 93
    .line 94
    const v16, -0x4087ae14    # -0.97f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x3ee051ec    # -9.98f

    .line 101
    .line 102
    .line 103
    const v18, 0x40728f5c    # 3.79f

    .line 104
    .line 105
    .line 106
    const v13, -0x3fbae148    # -3.08f

    .line 107
    .line 108
    .line 109
    const/4 v14, 0x0

    .line 110
    const v15, -0x3f1b3333    # -7.15f

    .line 111
    .line 112
    .line 113
    const v16, 0x3f75c28f    # 0.96f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x4060a3d7    # 3.51f

    .line 120
    .line 121
    .line 122
    const v18, 0x41a3eb85    # 20.49f

    .line 123
    .line 124
    .line 125
    const v13, 0x3fd47ae1    # 1.66f

    .line 126
    .line 127
    .line 128
    const v14, 0x41307ae1    # 11.03f

    .line 129
    .line 130
    .line 131
    const v15, 0x40066666    # 2.1f

    .line 132
    .line 133
    .line 134
    const v16, 0x41988f5c    # 19.07f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x40851eb8    # 4.16f

    .line 141
    .line 142
    .line 143
    const v18, 0x3f7851ec    # 0.97f

    .line 144
    .line 145
    .line 146
    const v13, 0x3f0f5c29    # 0.56f

    .line 147
    .line 148
    .line 149
    const v14, 0x3f0f5c29    # 0.56f

    .line 150
    .line 151
    .line 152
    const v15, 0x4009999a    # 2.15f

    .line 153
    .line 154
    .line 155
    const v16, 0x3f7851ec    # 0.97f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, 0x411fae14    # 9.98f

    .line 162
    .line 163
    .line 164
    const v18, -0x3f8d70a4    # -3.79f

    .line 165
    .line 166
    .line 167
    const v13, 0x40451eb8    # 3.08f

    .line 168
    .line 169
    .line 170
    const/4 v14, 0x0

    .line 171
    const v15, 0x40e4cccd    # 7.15f

    .line 172
    .line 173
    .line 174
    const v16, -0x408a3d71    # -0.96f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, 0x41a3eb85    # 20.49f

    .line 181
    .line 182
    .line 183
    const v18, 0x4060a3d7    # 3.51f

    .line 184
    .line 185
    .line 186
    const v13, 0x41b2b852    # 22.34f

    .line 187
    .line 188
    .line 189
    const v14, 0x414f851f    # 12.97f

    .line 190
    .line 191
    .line 192
    const v15, 0x41af3333    # 21.9f

    .line 193
    .line 194
    .line 195
    const v16, 0x409dc28f    # 4.93f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x40b6b852    # 5.71f

    .line 205
    .line 206
    .line 207
    const v2, 0x419251ec    # 18.29f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, 0x409bd70a    # 4.87f

    .line 214
    .line 215
    .line 216
    const v18, -0x3f09999a    # -7.7f

    .line 217
    .line 218
    .line 219
    const v13, 0x3f2147ae    # 0.63f

    .line 220
    .line 221
    .line 222
    const v14, -0x400e147b    # -1.89f

    .line 223
    .line 224
    .line 225
    const v15, 0x400a3d71    # 2.16f

    .line 226
    .line 227
    .line 228
    const v16, -0x3f6051ec    # -4.99f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v17, 0x40f66666    # 7.7f

    .line 235
    .line 236
    .line 237
    const v18, -0x3f63d70a    # -4.88f

    .line 238
    .line 239
    .line 240
    const v13, 0x402b851f    # 2.68f

    .line 241
    .line 242
    .line 243
    const v14, -0x3fd47ae1    # -2.68f

    .line 244
    .line 245
    .line 246
    const v15, 0x40b8f5c3    # 5.78f

    .line 247
    .line 248
    .line 249
    const v16, -0x3f78a3d7    # -4.23f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v17, -0x3f63d70a    # -4.88f

    .line 256
    .line 257
    .line 258
    const v18, 0x40f66666    # 7.7f

    .line 259
    .line 260
    .line 261
    const v13, -0x40deb852    # -0.63f

    .line 262
    .line 263
    .line 264
    const v14, 0x3ff1eb85    # 1.89f

    .line 265
    .line 266
    .line 267
    const v15, -0x3ff5c28f    # -2.16f

    .line 268
    .line 269
    .line 270
    const v16, 0x409fae14    # 4.99f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v17, 0x40b6b852    # 5.71f

    .line 277
    .line 278
    .line 279
    const v18, 0x419251ec    # 18.29f

    .line 280
    .line 281
    .line 282
    const v13, 0x412bd70a    # 10.74f

    .line 283
    .line 284
    .line 285
    const v14, 0x4180b852    # 16.09f

    .line 286
    .line 287
    .line 288
    const v15, 0x40f47ae1    # 7.64f

    .line 289
    .line 290
    .line 291
    const v16, 0x418d1eb8    # 17.64f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x40f851ec    # 7.76f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v17, 0x41007ae1    # 8.03f

    .line 307
    .line 308
    .line 309
    const v18, -0x3fb3d70a    # -3.19f

    .line 310
    .line 311
    .line 312
    const v13, 0x4028f5c3    # 2.64f

    .line 313
    .line 314
    .line 315
    const v14, -0x3fd70a3d    # -2.64f

    .line 316
    .line 317
    .line 318
    const v15, 0x40cae148    # 6.34f

    .line 319
    .line 320
    .line 321
    const v16, -0x3fb851ec    # -3.12f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, -0x3f2c7ae1    # -6.61f

    .line 328
    .line 329
    .line 330
    const v18, 0x4093851f    # 4.61f

    .line 331
    .line 332
    .line 333
    const v13, -0x3ffccccd    # -2.05f

    .line 334
    .line 335
    .line 336
    const v14, 0x3f70a3d7    # 0.94f

    .line 337
    .line 338
    .line 339
    const v15, -0x3f7147ae    # -4.46f

    .line 340
    .line 341
    .line 342
    const v16, 0x401d70a4    # 2.46f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, -0x3f6c7ae1    # -4.61f

    .line 349
    .line 350
    .line 351
    const v18, 0x40d428f6    # 6.63f

    .line 352
    .line 353
    .line 354
    const v13, -0x3ff5c28f    # -2.16f

    .line 355
    .line 356
    .line 357
    const v14, 0x400a3d71    # 2.16f

    .line 358
    .line 359
    .line 360
    const v15, -0x3f951eb8    # -3.67f

    .line 361
    .line 362
    .line 363
    const v16, 0x40928f5c    # 4.58f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, 0x40f851ec    # 7.76f

    .line 370
    .line 371
    .line 372
    const v18, 0x40f851ec    # 7.76f

    .line 373
    .line 374
    .line 375
    const v13, 0x40951eb8    # 4.66f

    .line 376
    .line 377
    .line 378
    const v14, 0x415547ae    # 13.33f

    .line 379
    .line 380
    .line 381
    const v15, 0x40ae147b    # 5.44f

    .line 382
    .line 383
    .line 384
    const v16, 0x41211eb8    # 10.07f

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v0, 0x4181eb85    # 16.24f

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, -0x3eff851f    # -8.03f

    .line 400
    .line 401
    .line 402
    const v18, 0x404c28f6    # 3.19f

    .line 403
    .line 404
    .line 405
    const v13, -0x3fd70a3d    # -2.64f

    .line 406
    .line 407
    .line 408
    const v14, 0x4028f5c3    # 2.64f

    .line 409
    .line 410
    .line 411
    const v15, -0x3f351eb8    # -6.34f

    .line 412
    .line 413
    .line 414
    const v16, 0x4047ae14    # 3.12f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, 0x40d3851f    # 6.61f

    .line 421
    .line 422
    .line 423
    const v18, -0x3f6c7ae1    # -4.61f

    .line 424
    .line 425
    .line 426
    const v13, 0x40033333    # 2.05f

    .line 427
    .line 428
    .line 429
    const v14, -0x408f5c29    # -0.94f

    .line 430
    .line 431
    .line 432
    const v15, 0x408eb852    # 4.46f

    .line 433
    .line 434
    .line 435
    const v16, -0x3fe28f5c    # -2.46f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, 0x4093d70a    # 4.62f

    .line 442
    .line 443
    .line 444
    const v18, -0x3f2bd70a    # -6.63f

    .line 445
    .line 446
    .line 447
    const v13, 0x400a3d71    # 2.16f

    .line 448
    .line 449
    .line 450
    const v14, -0x3ff5c28f    # -2.16f

    .line 451
    .line 452
    .line 453
    const v15, 0x406ae148    # 3.67f

    .line 454
    .line 455
    .line 456
    const v16, -0x3f6d70a4    # -4.58f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x4181eb85    # 16.24f

    .line 463
    .line 464
    .line 465
    const v18, 0x4181eb85    # 16.24f

    .line 466
    .line 467
    .line 468
    const v13, 0x419ab852    # 19.34f

    .line 469
    .line 470
    .line 471
    const v14, 0x412ab852    # 10.67f

    .line 472
    .line 473
    .line 474
    const v15, 0x41947ae1    # 18.56f

    .line 475
    .line 476
    .line 477
    const v16, 0x415ee148    # 13.93f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    const/16 v16, 0x3800

    .line 491
    .line 492
    const/16 v17, 0x0

    .line 493
    .line 494
    const/high16 v6, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/high16 v8, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/4 v7, 0x0

    .line 499
    const/high16 v9, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/high16 v12, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/4 v13, 0x0

    .line 504
    const/4 v14, 0x0

    .line 505
    const/4 v15, 0x0

    .line 506
    const-string v4, ""

    .line 507
    .line 508
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    sput-object v0, Landroidx/compose/material/icons/outlined/SportsRugbyKt;->_sportsRugby:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 517
    .line 518
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/DirtyLensKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirtyLens(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DirtyLens"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3fb51eb8    # -3.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, -0x406147ae    # -1.24f

    .line 84
    .line 85
    .line 86
    const v2, -0x40533333    # -1.35f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v17, 0x4161eb85    # 14.12f

    .line 93
    .line 94
    .line 95
    const/high16 v18, 0x40400000    # 3.0f

    .line 96
    .line 97
    const v13, 0x4173851f    # 15.22f

    .line 98
    .line 99
    .line 100
    const v14, 0x404f5c29    # 3.24f

    .line 101
    .line 102
    .line 103
    const v15, 0x416ae148    # 14.68f

    .line 104
    .line 105
    .line 106
    const/high16 v16, 0x40400000    # 3.0f

    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x411e147b    # 9.88f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x40428f5c    # -1.48f

    .line 118
    .line 119
    .line 120
    const v18, 0x3f266666    # 0.65f

    .line 121
    .line 122
    .line 123
    const v13, -0x40f0a3d7    # -0.56f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const v15, -0x40733333    # -1.1f

    .line 128
    .line 129
    .line 130
    const v16, 0x3e75c28f    # 0.24f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x40e570a4    # 7.17f

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x40a00000    # 5.0f

    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x40800000    # 4.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, 0x40000000    # 2.0f

    .line 150
    .line 151
    const/high16 v18, 0x40e00000    # 7.0f

    .line 152
    .line 153
    const v13, 0x4039999a    # 2.9f

    .line 154
    .line 155
    .line 156
    const/high16 v14, 0x40a00000    # 5.0f

    .line 157
    .line 158
    const/high16 v15, 0x40000000    # 2.0f

    .line 159
    .line 160
    const v16, 0x40bccccd    # 5.9f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41400000    # 12.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v18, 0x40000000    # 2.0f

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, 0x3f8ccccd    # 1.1f

    .line 175
    .line 176
    .line 177
    const v15, 0x3f666666    # 0.9f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x40000000    # 2.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x41800000    # 16.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v18, -0x40000000    # -2.0f

    .line 191
    .line 192
    const v13, 0x3f8ccccd    # 1.1f

    .line 193
    .line 194
    .line 195
    const/4 v14, 0x0

    .line 196
    const/high16 v15, 0x40000000    # 2.0f

    .line 197
    .line 198
    const v16, -0x4099999a    # -0.9f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x40e00000    # 7.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x41a00000    # 20.0f

    .line 210
    .line 211
    const/high16 v18, 0x40a00000    # 5.0f

    .line 212
    .line 213
    const/high16 v13, 0x41b00000    # 22.0f

    .line 214
    .line 215
    const v14, 0x40bccccd    # 5.9f

    .line 216
    .line 217
    .line 218
    const v15, 0x41a8cccd    # 21.1f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x40a00000    # 5.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x418547ae    # 16.66f

    .line 230
    .line 231
    .line 232
    const v2, 0x4184a3d7    # 16.58f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, -0x3f8c28f6    # -3.81f

    .line 239
    .line 240
    .line 241
    const v18, 0x3db851ec    # 0.09f

    .line 242
    .line 243
    .line 244
    const v13, -0x406e147b    # -1.14f

    .line 245
    .line 246
    .line 247
    const v14, 0x3fee147b    # 1.86f

    .line 248
    .line 249
    .line 250
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 251
    .line 252
    const v16, -0x407c28f6    # -1.03f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, 0x3e051eb8    # 0.13f

    .line 259
    .line 260
    .line 261
    const v18, 0x40151eb8    # 2.33f

    .line 262
    .line 263
    .line 264
    const v13, -0x413851ec    # -0.39f

    .line 265
    .line 266
    .line 267
    const v14, 0x3f11eb85    # 0.57f

    .line 268
    .line 269
    .line 270
    const v15, -0x4247ae14    # -0.09f

    .line 271
    .line 272
    .line 273
    const v16, 0x3fbeb852    # 1.49f

    .line 274
    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, -0x40a66666    # -0.85f

    .line 280
    .line 281
    .line 282
    const v18, 0x3f59999a    # 0.85f

    .line 283
    .line 284
    .line 285
    const/4 v13, 0x0

    .line 286
    const v14, 0x3ef0a3d7    # 0.47f

    .line 287
    .line 288
    .line 289
    const v15, -0x413d70a4    # -0.38f

    .line 290
    .line 291
    .line 292
    const v16, 0x3f59999a    # 0.85f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x40a3d70a    # -0.86f

    .line 299
    .line 300
    .line 301
    const v18, -0x40a66666    # -0.85f

    .line 302
    .line 303
    .line 304
    const v13, -0x410f5c29    # -0.47f

    .line 305
    .line 306
    .line 307
    const/4 v14, 0x0

    .line 308
    const v15, -0x40a3d70a    # -0.86f

    .line 309
    .line 310
    .line 311
    const v16, -0x413d70a4    # -0.38f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, -0x41dc28f6    # -0.16f

    .line 318
    .line 319
    .line 320
    const v18, -0x3fe47ae1    # -2.43f

    .line 321
    .line 322
    .line 323
    const v13, 0x3e0f5c29    # 0.14f

    .line 324
    .line 325
    .line 326
    const v14, -0x40851eb8    # -0.98f

    .line 327
    .line 328
    .line 329
    const v15, 0x3ed70a3d    # 0.42f

    .line 330
    .line 331
    .line 332
    const v16, -0x3ffccccd    # -2.05f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, -0x3fcccccd    # -2.8f

    .line 339
    .line 340
    .line 341
    const v18, 0x3faccccd    # 1.35f

    .line 342
    .line 343
    .line 344
    const v13, -0x409c28f6    # -0.89f

    .line 345
    .line 346
    .line 347
    const v14, -0x40e8f5c3    # -0.59f

    .line 348
    .line 349
    .line 350
    const v15, -0x405d70a4    # -1.27f

    .line 351
    .line 352
    .line 353
    const v16, 0x4003d70a    # 2.06f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v17, 0x3f000000    # 0.5f

    .line 360
    .line 361
    const v18, -0x3faeb852    # -3.27f

    .line 362
    .line 363
    .line 364
    const v13, -0x404e147b    # -1.39f

    .line 365
    .line 366
    .line 367
    const v14, -0x4070a3d7    # -1.12f

    .line 368
    .line 369
    .line 370
    const v15, 0x3f866666    # 1.05f

    .line 371
    .line 372
    .line 373
    const v16, -0x405ae148    # -1.29f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, -0x3fe66666    # -2.4f

    .line 380
    .line 381
    .line 382
    const v18, -0x406147ae    # -1.24f

    .line 383
    .line 384
    .line 385
    const v13, -0x419eb852    # -0.22f

    .line 386
    .line 387
    .line 388
    const v14, -0x40b5c28f    # -0.79f

    .line 389
    .line 390
    .line 391
    const v15, -0x3fee147b    # -2.28f

    .line 392
    .line 393
    .line 394
    const v16, 0x3eb851ec    # 0.36f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x3fc147ae    # 1.51f

    .line 401
    .line 402
    .line 403
    const v18, -0x404147ae    # -1.49f

    .line 404
    .line 405
    .line 406
    const v13, -0x425c28f6    # -0.08f

    .line 407
    .line 408
    .line 409
    const/high16 v14, -0x40800000    # -1.0f

    .line 410
    .line 411
    const v15, 0x3fbeb852    # 1.49f

    .line 412
    .line 413
    .line 414
    const v16, -0x40c28f5c    # -0.74f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, -0x41800000    # -0.25f

    .line 421
    .line 422
    const v18, -0x400b851f    # -1.91f

    .line 423
    .line 424
    .line 425
    const v13, 0x3cf5c28f    # 0.03f

    .line 426
    .line 427
    .line 428
    const/high16 v14, -0x40c00000    # -0.75f

    .line 429
    .line 430
    const v15, -0x407c28f6    # -1.03f

    .line 431
    .line 432
    .line 433
    const v16, -0x4079999a    # -1.05f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x3f68f5c3    # 0.91f

    .line 440
    .line 441
    .line 442
    const v18, -0x41bd70a4    # -0.19f

    .line 443
    .line 444
    .line 445
    const v13, 0x3e6147ae    # 0.22f

    .line 446
    .line 447
    .line 448
    const v14, -0x418a3d71    # -0.24f

    .line 449
    .line 450
    .line 451
    const v15, 0x3f35c28f    # 0.71f

    .line 452
    .line 453
    .line 454
    const v16, -0x417ae148    # -0.26f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x4020a3d7    # 2.51f

    .line 461
    .line 462
    .line 463
    const v18, 0x3f9851ec    # 1.19f

    .line 464
    .line 465
    .line 466
    const v13, 0x3f4a3d71    # 0.79f

    .line 467
    .line 468
    .line 469
    const v14, 0x3e8a3d71    # 0.27f

    .line 470
    .line 471
    .line 472
    const v15, 0x3fc66666    # 1.55f

    .line 473
    .line 474
    .line 475
    const v16, 0x3fe8f5c3    # 1.82f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/16 v17, 0x0

    .line 482
    .line 483
    const v18, -0x3fc8f5c3    # -2.86f

    .line 484
    .line 485
    .line 486
    const v13, 0x3f83d70a    # 1.03f

    .line 487
    .line 488
    .line 489
    const v14, -0x40d70a3d    # -0.66f

    .line 490
    .line 491
    .line 492
    const v15, -0x400f5c29    # -1.88f

    .line 493
    .line 494
    .line 495
    const v16, -0x3fe9999a    # -2.35f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, 0x4029999a    # 2.65f

    .line 502
    .line 503
    .line 504
    const v18, 0x401c28f6    # 2.44f

    .line 505
    .line 506
    .line 507
    const v13, 0x3fd1eb85    # 1.64f

    .line 508
    .line 509
    .line 510
    const v14, -0x411eb852    # -0.44f

    .line 511
    .line 512
    .line 513
    const v15, 0x3fa7ae14    # 1.31f

    .line 514
    .line 515
    .line 516
    const v16, 0x40051eb8    # 2.08f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x408d1eb8    # 4.41f

    .line 523
    .line 524
    .line 525
    const v18, -0x3feae148    # -2.33f

    .line 526
    .line 527
    .line 528
    const v13, 0x3ff851ec    # 1.94f

    .line 529
    .line 530
    .line 531
    const v14, 0x3f051eb8    # 0.52f

    .line 532
    .line 533
    .line 534
    const v15, 0x4029999a    # 2.65f

    .line 535
    .line 536
    .line 537
    const v16, -0x3f6e6666    # -4.55f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v17, -0x3fc9999a    # -2.85f

    .line 544
    .line 545
    .line 546
    const v18, 0x408051ec    # 4.01f

    .line 547
    .line 548
    .line 549
    const v13, 0x3feccccd    # 1.85f

    .line 550
    .line 551
    .line 552
    const v14, 0x40151eb8    # 2.33f

    .line 553
    .line 554
    .line 555
    const v15, -0x3fa47ae1    # -3.43f

    .line 556
    .line 557
    .line 558
    const v16, 0x401147ae    # 2.27f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, 0x4030a3d7    # 2.76f

    .line 565
    .line 566
    .line 567
    const v18, 0x3f07ae14    # 0.53f

    .line 568
    .line 569
    .line 570
    const v13, 0x3eae147b    # 0.34f

    .line 571
    .line 572
    .line 573
    const v14, 0x3f8147ae    # 1.01f

    .line 574
    .line 575
    .line 576
    const v15, 0x4009999a    # 2.15f

    .line 577
    .line 578
    .line 579
    const v16, -0x40666666    # -1.2f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v17, -0x3fbd70a4    # -3.04f

    .line 586
    .line 587
    .line 588
    const v18, 0x3fd47ae1    # 1.66f

    .line 589
    .line 590
    .line 591
    const v13, 0x3f23d70a    # 0.64f

    .line 592
    .line 593
    .line 594
    const v14, 0x3fea3d71    # 1.83f

    .line 595
    .line 596
    .line 597
    const v15, -0x3fba3d71    # -3.09f

    .line 598
    .line 599
    .line 600
    const v16, 0x3f51eb85    # 0.82f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v17, 0x418547ae    # 16.66f

    .line 607
    .line 608
    .line 609
    const v18, 0x4184a3d7    # 16.58f

    .line 610
    .line 611
    .line 612
    const v13, 0x417147ae    # 15.08f

    .line 613
    .line 614
    .line 615
    const v14, 0x4174a3d7    # 15.29f

    .line 616
    .line 617
    .line 618
    const v15, 0x418b70a4    # 17.43f

    .line 619
    .line 620
    .line 621
    const v16, 0x417028f6    # 15.01f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x41911eb8    # 18.14f

    .line 631
    .line 632
    .line 633
    const v2, 0x4190147b    # 18.01f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v17, -0x40a3d70a    # -0.86f

    .line 640
    .line 641
    .line 642
    const v18, -0x40a3d70a    # -0.86f

    .line 643
    .line 644
    .line 645
    const v13, -0x410f5c29    # -0.47f

    .line 646
    .line 647
    .line 648
    const/4 v14, 0x0

    .line 649
    const v15, -0x40a3d70a    # -0.86f

    .line 650
    .line 651
    .line 652
    const v16, -0x413d70a4    # -0.38f

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x3ec28f5c    # 0.38f

    .line 659
    .line 660
    .line 661
    const v2, 0x3f5c28f6    # 0.86f

    .line 662
    .line 663
    .line 664
    const v4, -0x40a3d70a    # -0.86f

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v17, 0x3f5c28f6    # 0.86f

    .line 671
    .line 672
    .line 673
    const v18, 0x3f5c28f6    # 0.86f

    .line 674
    .line 675
    .line 676
    const v13, 0x3ef0a3d7    # 0.47f

    .line 677
    .line 678
    .line 679
    const v15, 0x3f5c28f6    # 0.86f

    .line 680
    .line 681
    .line 682
    const v16, 0x3ec28f5c    # 0.38f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, 0x4194f5c3    # 18.62f

    .line 689
    .line 690
    .line 691
    const v2, 0x41911eb8    # 18.14f

    .line 692
    .line 693
    .line 694
    const v4, 0x4190147b    # 18.01f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const/16 v16, 0x3800

    .line 708
    .line 709
    const/16 v17, 0x0

    .line 710
    .line 711
    const/high16 v6, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/high16 v8, 0x3f800000    # 1.0f

    .line 714
    .line 715
    const/4 v7, 0x0

    .line 716
    const/high16 v9, 0x3f800000    # 1.0f

    .line 717
    .line 718
    const/high16 v12, 0x3f800000    # 1.0f

    .line 719
    .line 720
    const/4 v13, 0x0

    .line 721
    const/4 v15, 0x0

    .line 722
    const-string v4, ""

    .line 723
    .line 724
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    sput-object v0, Landroidx/compose/material/icons/rounded/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 733
    .line 734
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    return-object v0
.end method

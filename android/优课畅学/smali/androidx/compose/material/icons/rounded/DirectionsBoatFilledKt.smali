.class public final Landroidx/compose/material/icons/rounded/DirectionsBoatFilledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _directionsBoatFilled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsBoatFilled(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/DirectionsBoatFilledKt;->_directionsBoatFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.DirectionsBoatFilled"

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
    const/high16 v0, 0x41a80000    # 21.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3fa1eb85    # -3.47f

    .line 78
    .line 79
    .line 80
    const v18, -0x40851eb8    # -0.98f

    .line 81
    .line 82
    .line 83
    const v13, -0x4067ae14    # -1.19f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x3fe7ae14    # -2.38f

    .line 88
    .line 89
    .line 90
    const v16, -0x414ccccd    # -0.35f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x40770a3d    # -1.07f

    .line 97
    .line 98
    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    const v13, -0x41570a3d    # -0.33f

    .line 102
    .line 103
    .line 104
    const v14, -0x41bd70a4    # -0.19f

    .line 105
    .line 106
    .line 107
    const v15, -0x40c51eb8    # -0.73f

    .line 108
    .line 109
    .line 110
    const v16, -0x41bd70a4    # -0.19f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x3f223d71    # -6.93f

    .line 117
    .line 118
    .line 119
    const v13, -0x3ff51eb8    # -2.17f

    .line 120
    .line 121
    .line 122
    const v14, 0x3fa147ae    # 1.26f

    .line 123
    .line 124
    .line 125
    const v15, -0x3f67ae14    # -4.76f

    .line 126
    .line 127
    .line 128
    const v16, 0x3fa147ae    # 1.26f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v17, -0x40770a3d    # -1.07f

    .line 135
    .line 136
    .line 137
    const v13, -0x41570a3d    # -0.33f

    .line 138
    .line 139
    .line 140
    const v14, -0x41bd70a4    # -0.19f

    .line 141
    .line 142
    .line 143
    const v15, -0x40c51eb8    # -0.73f

    .line 144
    .line 145
    .line 146
    const v16, -0x41bd70a4    # -0.19f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, 0x40800000    # 4.0f

    .line 153
    .line 154
    const/high16 v18, 0x41a80000    # 21.0f

    .line 155
    .line 156
    const v13, 0x40cc28f6    # 6.38f

    .line 157
    .line 158
    .line 159
    const v14, 0x41a53333    # 20.65f

    .line 160
    .line 161
    .line 162
    const v15, 0x40a6147b    # 5.19f

    .line 163
    .line 164
    .line 165
    const/high16 v16, 0x41a80000    # 21.0f

    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x40400000    # 3.0f

    .line 171
    .line 172
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const/high16 v17, -0x40800000    # -1.0f

    .line 176
    .line 177
    const/high16 v18, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const v13, -0x40f33333    # -0.55f

    .line 180
    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    const/high16 v15, -0x40800000    # -1.0f

    .line 184
    .line 185
    const v16, 0x3ee66666    # 0.45f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const v14, 0x3f0ccccd    # 0.55f

    .line 199
    .line 200
    .line 201
    const v15, 0x3ee66666    # 0.45f

    .line 202
    .line 203
    .line 204
    const/high16 v16, 0x3f800000    # 1.0f

    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v0, 0x3f800000    # 1.0f

    .line 210
    .line 211
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v17, 0x40800000    # 4.0f

    .line 215
    .line 216
    const v18, -0x40828f5c    # -0.99f

    .line 217
    .line 218
    .line 219
    const v13, 0x3fb0a3d7    # 1.38f

    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const v15, 0x402f5c29    # 2.74f

    .line 224
    .line 225
    .line 226
    const v16, -0x414ccccd    # -0.35f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x41000000    # 8.0f

    .line 233
    .line 234
    const/16 v18, 0x0

    .line 235
    .line 236
    const v13, 0x402147ae    # 2.52f

    .line 237
    .line 238
    .line 239
    const v14, 0x3fa51eb8    # 1.29f

    .line 240
    .line 241
    .line 242
    const v15, 0x40af5c29    # 5.48f

    .line 243
    .line 244
    .line 245
    const v16, 0x3fa51eb8    # 1.29f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, 0x40800000    # 4.0f

    .line 252
    .line 253
    const v18, 0x3f7d70a4    # 0.99f

    .line 254
    .line 255
    .line 256
    const v13, 0x3fa147ae    # 1.26f

    .line 257
    .line 258
    .line 259
    const v14, 0x3f266666    # 0.65f

    .line 260
    .line 261
    .line 262
    const v15, 0x4027ae14    # 2.62f

    .line 263
    .line 264
    .line 265
    const v16, 0x3f7d70a4    # 0.99f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const/high16 v18, -0x40800000    # -1.0f

    .line 277
    .line 278
    const v13, 0x3f0ccccd    # 0.55f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const/high16 v15, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const v16, -0x4119999a    # -0.45f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/4 v0, 0x0

    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, -0x40800000    # -1.0f

    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const v14, -0x40f33333    # -0.55f

    .line 298
    .line 299
    .line 300
    const v15, -0x4119999a    # -0.45f

    .line 301
    .line 302
    .line 303
    const/high16 v16, -0x40800000    # -1.0f

    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x41a00000    # 20.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41980000    # 19.0f

    .line 317
    .line 318
    const v2, 0x407ccccd    # 3.95f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v0, 0x40800000    # 4.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x40551eb8    # 3.33f

    .line 330
    .line 331
    .line 332
    const v18, -0x4055c28f    # -1.33f

    .line 333
    .line 334
    .line 335
    const v13, 0x3fa28f5c    # 1.27f

    .line 336
    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    const v15, 0x401ae148    # 2.42f

    .line 340
    .line 341
    .line 342
    const v16, -0x40f33333    # -0.55f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3fab851f    # 1.34f

    .line 349
    .line 350
    .line 351
    const/16 v18, 0x0

    .line 352
    .line 353
    const v13, 0x3ec7ae14    # 0.39f

    .line 354
    .line 355
    .line 356
    const v14, -0x4151eb85    # -0.34f

    .line 357
    .line 358
    .line 359
    const v15, 0x3f733333    # 0.95f

    .line 360
    .line 361
    .line 362
    const v16, -0x4151eb85    # -0.34f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v17, 0x41400000    # 12.0f

    .line 369
    .line 370
    const/high16 v18, 0x41980000    # 19.0f

    .line 371
    .line 372
    const v13, 0x411947ae    # 9.58f

    .line 373
    .line 374
    .line 375
    const v14, 0x4193999a    # 18.45f

    .line 376
    .line 377
    .line 378
    const v15, 0x412bae14    # 10.73f

    .line 379
    .line 380
    .line 381
    const/high16 v16, 0x41980000    # 19.0f

    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v0, 0x40551eb8    # 3.33f

    .line 387
    .line 388
    .line 389
    const v2, -0x4055c28f    # -1.33f

    .line 390
    .line 391
    .line 392
    const v4, 0x401ae148    # 2.42f

    .line 393
    .line 394
    .line 395
    const v6, -0x40f33333    # -0.55f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, 0x3fab851f    # 1.34f

    .line 402
    .line 403
    .line 404
    const/16 v18, 0x0

    .line 405
    .line 406
    const v13, 0x3ec7ae14    # 0.39f

    .line 407
    .line 408
    .line 409
    const v14, -0x4151eb85    # -0.34f

    .line 410
    .line 411
    .line 412
    const v15, 0x3f733333    # 0.95f

    .line 413
    .line 414
    .line 415
    const v16, -0x4151eb85    # -0.34f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x41a00000    # 20.0f

    .line 422
    .line 423
    const/high16 v18, 0x41980000    # 19.0f

    .line 424
    .line 425
    const v13, 0x418ca3d7    # 17.58f

    .line 426
    .line 427
    .line 428
    const v14, 0x4193999a    # 18.45f

    .line 429
    .line 430
    .line 431
    const v15, 0x4195d70a    # 18.73f

    .line 432
    .line 433
    .line 434
    const/high16 v16, 0x41980000    # 19.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v0, 0x3d4ccccd    # 0.05f

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x3ff33333    # 1.9f

    .line 446
    .line 447
    .line 448
    const v2, -0x3f2a3d71    # -6.68f

    .line 449
    .line 450
    .line 451
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, -0x40d70a3d    # -0.66f

    .line 455
    .line 456
    .line 457
    const v18, -0x405c28f6    # -1.28f

    .line 458
    .line 459
    .line 460
    const v13, 0x3de147ae    # 0.11f

    .line 461
    .line 462
    .line 463
    const v14, -0x41428f5c    # -0.37f

    .line 464
    .line 465
    .line 466
    const v15, 0x3d23d70a    # 0.04f

    .line 467
    .line 468
    .line 469
    const v16, -0x407851ec    # -1.06f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x4129eb85    # 10.62f

    .line 476
    .line 477
    .line 478
    const/high16 v2, 0x41a00000    # 20.0f

    .line 479
    .line 480
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x40c00000    # 6.0f

    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const/high16 v17, -0x40000000    # -2.0f

    .line 489
    .line 490
    const/high16 v18, -0x40000000    # -2.0f

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const v14, -0x40733333    # -1.1f

    .line 494
    .line 495
    .line 496
    const v15, -0x4099999a    # -0.9f

    .line 497
    .line 498
    .line 499
    const/high16 v16, -0x40000000    # -2.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, 0x40000000    # 2.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, -0x40800000    # -1.0f

    .line 515
    .line 516
    const/high16 v18, -0x40800000    # -1.0f

    .line 517
    .line 518
    const v14, -0x40f33333    # -0.55f

    .line 519
    .line 520
    .line 521
    const v15, -0x4119999a    # -0.45f

    .line 522
    .line 523
    .line 524
    const/high16 v16, -0x40800000    # -1.0f

    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v0, -0x3f800000    # -4.0f

    .line 530
    .line 531
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v17, 0x41100000    # 9.0f

    .line 535
    .line 536
    const/high16 v18, 0x40000000    # 2.0f

    .line 537
    .line 538
    const v13, 0x41173333    # 9.45f

    .line 539
    .line 540
    .line 541
    const/high16 v14, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/high16 v15, 0x41100000    # 9.0f

    .line 544
    .line 545
    const v16, 0x3fb9999a    # 1.45f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, 0x40000000    # 2.0f

    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x40c00000    # 6.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v17, 0x40800000    # 4.0f

    .line 562
    .line 563
    const/high16 v18, 0x40c00000    # 6.0f

    .line 564
    .line 565
    const v13, 0x409ccccd    # 4.9f

    .line 566
    .line 567
    .line 568
    const/high16 v14, 0x40800000    # 4.0f

    .line 569
    .line 570
    const/high16 v15, 0x40800000    # 4.0f

    .line 571
    .line 572
    const v16, 0x409ccccd    # 4.9f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x4093d70a    # 4.62f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, -0x405ae148    # -1.29f

    .line 585
    .line 586
    .line 587
    const v2, 0x3ed70a3d    # 0.42f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v17, -0x40d70a3d    # -0.66f

    .line 594
    .line 595
    .line 596
    const v18, 0x3fa3d70a    # 1.28f

    .line 597
    .line 598
    .line 599
    const v13, -0x40deb852    # -0.63f

    .line 600
    .line 601
    .line 602
    const v14, 0x3e428f5c    # 0.19f

    .line 603
    .line 604
    .line 605
    const v15, -0x40b0a3d7    # -0.81f

    .line 606
    .line 607
    .line 608
    const v16, 0x3f570a3d    # 0.84f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, 0x41980000    # 19.0f

    .line 615
    .line 616
    const v2, 0x407ccccd    # 3.95f

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v0, 0x40c00000    # 6.0f

    .line 626
    .line 627
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/high16 v0, 0x41400000    # 12.0f

    .line 631
    .line 632
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, 0x407e147b    # 3.97f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, 0x4149eb85    # 12.62f

    .line 642
    .line 643
    .line 644
    const v2, 0x41033333    # 8.2f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v17, -0x40600000    # -1.25f

    .line 651
    .line 652
    const/16 v18, 0x0

    .line 653
    .line 654
    const v13, -0x412e147b    # -0.41f

    .line 655
    .line 656
    .line 657
    const v14, -0x41fae148    # -0.13f

    .line 658
    .line 659
    .line 660
    const v15, -0x40a8f5c3    # -0.84f

    .line 661
    .line 662
    .line 663
    const v16, -0x41fae148    # -0.13f

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v0, 0x411f851f    # 9.97f

    .line 670
    .line 671
    .line 672
    const/high16 v2, 0x40c00000    # 6.0f

    .line 673
    .line 674
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v0, 0x40c00000    # 6.0f

    .line 678
    .line 679
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    const/16 v16, 0x3800

    .line 690
    .line 691
    const/16 v17, 0x0

    .line 692
    .line 693
    const/high16 v6, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/high16 v8, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const/4 v7, 0x0

    .line 698
    const/high16 v9, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/high16 v12, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const/4 v13, 0x0

    .line 703
    const/4 v14, 0x0

    .line 704
    const/4 v15, 0x0

    .line 705
    const-string v4, ""

    .line 706
    .line 707
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    sput-object v0, Landroidx/compose/material/icons/rounded/DirectionsBoatFilledKt;->_directionsBoatFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 716
    .line 717
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    return-object v0
.end method

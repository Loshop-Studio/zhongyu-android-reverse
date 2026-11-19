.class public final Landroidx/compose/material/icons/rounded/HouseboatKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _houseboat:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHouseboat(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HouseboatKt;->_houseboat:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Houseboat"

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
    const/high16 v0, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const v2, 0x418ea3d7    # 17.83f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x40d47ae1    # -0.67f

    .line 79
    .line 80
    .line 81
    const v18, -0x408f5c29    # -0.94f

    .line 82
    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const v14, -0x4128f5c3    # -0.42f

    .line 86
    .line 87
    .line 88
    const v15, -0x4175c28f    # -0.27f

    .line 89
    .line 90
    .line 91
    const v16, -0x40b33333    # -0.8f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x41955c29    # 18.67f

    .line 98
    .line 99
    .line 100
    const/high16 v18, 0x41800000    # 16.0f

    .line 101
    .line 102
    const v13, 0x41a4f5c3    # 20.62f

    .line 103
    .line 104
    .line 105
    const v14, 0x4184f5c3    # 16.62f

    .line 106
    .line 107
    .line 108
    const v15, 0x41a1ae14    # 20.21f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x41800000    # 16.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x3faae148    # -3.33f

    .line 117
    .line 118
    .line 119
    const/high16 v18, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const v13, -0x400b851f    # -1.91f

    .line 122
    .line 123
    .line 124
    const/4 v14, 0x0

    .line 125
    const v15, -0x3ff70a3d    # -2.14f

    .line 126
    .line 127
    .line 128
    const/high16 v16, 0x3f800000    # 1.0f

    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, -0x3faa3d71    # -3.34f

    .line 134
    .line 135
    .line 136
    const/high16 v18, -0x40800000    # -1.0f

    .line 137
    .line 138
    const v13, -0x406147ae    # -1.24f

    .line 139
    .line 140
    .line 141
    const v15, -0x404e147b    # -1.39f

    .line 142
    .line 143
    .line 144
    const/high16 v16, -0x40800000    # -1.0f

    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, -0x3ff9999a    # -2.1f

    .line 150
    .line 151
    .line 152
    const v2, -0x3faa3d71    # -3.34f

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x3f800000    # 1.0f

    .line 156
    .line 157
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x3faae148    # -3.33f

    .line 161
    .line 162
    .line 163
    const v13, -0x4067ae14    # -1.19f

    .line 164
    .line 165
    .line 166
    const v15, -0x404a3d71    # -1.42f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v17, -0x3fd5c28f    # -2.66f

    .line 173
    .line 174
    .line 175
    const v18, 0x3f6147ae    # 0.88f

    .line 176
    .line 177
    .line 178
    const v13, -0x403ae148    # -1.54f

    .line 179
    .line 180
    .line 181
    const v15, -0x40066666    # -1.95f

    .line 182
    .line 183
    .line 184
    const v16, 0x3f1eb852    # 0.62f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x40000000    # 2.0f

    .line 191
    .line 192
    const v18, 0x418ea3d7    # 17.83f

    .line 193
    .line 194
    .line 195
    const v13, 0x401147ae    # 2.27f

    .line 196
    .line 197
    .line 198
    const v14, 0x41883d71    # 17.03f

    .line 199
    .line 200
    .line 201
    const/high16 v15, 0x40000000    # 2.0f

    .line 202
    .line 203
    const v16, 0x418b3333    # 17.4f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, 0x3faccccd    # 1.35f

    .line 210
    .line 211
    .line 212
    const v18, 0x3f733333    # 0.95f

    .line 213
    .line 214
    .line 215
    const/4 v13, 0x0

    .line 216
    const v14, 0x3f333333    # 0.7f

    .line 217
    .line 218
    .line 219
    const v15, 0x3f30a3d7    # 0.69f

    .line 220
    .line 221
    .line 222
    const v16, 0x3f9851ec    # 1.19f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x40000000    # 2.0f

    .line 229
    .line 230
    const v18, -0x40b851ec    # -0.78f

    .line 231
    .line 232
    .line 233
    const v13, 0x3f4ccccd    # 0.8f

    .line 234
    .line 235
    .line 236
    const v14, -0x416b851f    # -0.29f

    .line 237
    .line 238
    .line 239
    const v15, 0x3f970a3d    # 1.18f

    .line 240
    .line 241
    .line 242
    const v16, -0x40b851ec    # -0.78f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, 0x40551eb8    # 3.33f

    .line 249
    .line 250
    .line 251
    const/high16 v18, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const v13, 0x3f9851ec    # 1.19f

    .line 254
    .line 255
    .line 256
    const/4 v14, 0x0

    .line 257
    const v15, 0x3fb5c28f    # 1.42f

    .line 258
    .line 259
    .line 260
    const/high16 v16, 0x3f800000    # 1.0f

    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, 0x40547ae1    # 3.32f

    .line 266
    .line 267
    .line 268
    const/high16 v18, -0x40800000    # -1.0f

    .line 269
    .line 270
    const v13, 0x3ff9999a    # 1.95f

    .line 271
    .line 272
    .line 273
    const v15, 0x40051eb8    # 2.08f

    .line 274
    .line 275
    .line 276
    const/high16 v16, -0x40800000    # -1.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x3faf5c29    # 1.37f

    .line 282
    .line 283
    .line 284
    const v2, 0x40547ae1    # 3.32f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, 0x40551eb8    # 3.33f

    .line 291
    .line 292
    .line 293
    const v13, 0x3ff47ae1    # 1.91f

    .line 294
    .line 295
    .line 296
    const v15, 0x4008f5c3    # 2.14f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const/high16 v17, 0x40000000    # 2.0f

    .line 303
    .line 304
    const v18, 0x3f47ae14    # 0.78f

    .line 305
    .line 306
    .line 307
    const v13, 0x3f547ae1    # 0.83f

    .line 308
    .line 309
    .line 310
    const v15, 0x3f9ae148    # 1.21f

    .line 311
    .line 312
    .line 313
    const v16, 0x3efae148    # 0.49f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x41b00000    # 22.0f

    .line 320
    .line 321
    const v18, 0x418ea3d7    # 17.83f

    .line 322
    .line 323
    .line 324
    const v13, 0x41aa7ae1    # 21.31f

    .line 325
    .line 326
    .line 327
    const v14, 0x419828f6    # 19.02f

    .line 328
    .line 329
    .line 330
    const/high16 v15, 0x41b00000    # 22.0f

    .line 331
    .line 332
    const v16, 0x419428f6    # 18.52f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x419747ae    # 18.91f

    .line 342
    .line 343
    .line 344
    const v2, 0x411cf5c3    # 9.81f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, -0x419eb852    # -0.22f

    .line 351
    .line 352
    .line 353
    const v18, -0x404ccccd    # -1.4f

    .line 354
    .line 355
    .line 356
    const v13, 0x3ea8f5c3    # 0.33f

    .line 357
    .line 358
    .line 359
    const v14, -0x4119999a    # -0.45f

    .line 360
    .line 361
    .line 362
    const v15, 0x3e6b851f    # 0.23f

    .line 363
    .line 364
    .line 365
    const v16, -0x40770a3d    # -1.07f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, -0x3f70f5c3    # -4.47f

    .line 372
    .line 373
    .line 374
    const v2, -0x3f3ccccd    # -6.1f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, -0x4068f5c3    # -1.18f

    .line 381
    .line 382
    .line 383
    const/16 v18, 0x0

    .line 384
    .line 385
    const v13, -0x414ccccd    # -0.35f

    .line 386
    .line 387
    .line 388
    const v14, -0x417ae148    # -0.26f

    .line 389
    .line 390
    .line 391
    const v15, -0x40ab851f    # -0.83f

    .line 392
    .line 393
    .line 394
    const v16, -0x417ae148    # -0.26f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x408f0a3d    # 4.47f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v17, -0x419eb852    # -0.22f

    .line 407
    .line 408
    .line 409
    const v18, 0x3fb33333    # 1.4f

    .line 410
    .line 411
    .line 412
    const v13, -0x4119999a    # -0.45f

    .line 413
    .line 414
    .line 415
    const v14, 0x3ea8f5c3    # 0.33f

    .line 416
    .line 417
    .line 418
    const v15, -0x40f5c28f    # -0.54f

    .line 419
    .line 420
    .line 421
    const v16, 0x3f733333    # 0.95f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v17, 0x3fb33333    # 1.4f

    .line 428
    .line 429
    .line 430
    const v18, 0x3e6147ae    # 0.22f

    .line 431
    .line 432
    .line 433
    const v13, 0x3ea8f5c3    # 0.33f

    .line 434
    .line 435
    .line 436
    const v14, 0x3ee66666    # 0.45f

    .line 437
    .line 438
    .line 439
    const v15, 0x3f733333    # 0.95f

    .line 440
    .line 441
    .line 442
    const v16, 0x3f0a3d71    # 0.54f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, 0x40e00000    # 7.0f

    .line 449
    .line 450
    const v2, 0x411a6666    # 9.65f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x41500000    # 13.0f

    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x40b7ae14    # 5.74f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, -0x40ca3d71    # -0.71f

    .line 468
    .line 469
    .line 470
    const v18, -0x416b851f    # -0.29f

    .line 471
    .line 472
    .line 473
    const v13, -0x4175c28f    # -0.27f

    .line 474
    .line 475
    .line 476
    const/4 v14, 0x0

    .line 477
    const v15, -0x40fae148    # -0.52f

    .line 478
    .line 479
    .line 480
    const v16, -0x421eb852    # -0.11f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x40d70a3d    # -0.66f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, -0x404b851f    # -1.41f

    .line 493
    .line 494
    .line 495
    const/16 v18, 0x0

    .line 496
    .line 497
    const v13, -0x413851ec    # -0.39f

    .line 498
    .line 499
    .line 500
    const v14, -0x413851ec    # -0.39f

    .line 501
    .line 502
    .line 503
    const v15, -0x407d70a4    # -1.02f

    .line 504
    .line 505
    .line 506
    const v16, -0x413851ec    # -0.39f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/16 v17, 0x0

    .line 513
    .line 514
    const v18, 0x3fb47ae1    # 1.41f

    .line 515
    .line 516
    .line 517
    const v14, 0x3ec7ae14    # 0.39f

    .line 518
    .line 519
    .line 520
    const v15, -0x413851ec    # -0.39f

    .line 521
    .line 522
    .line 523
    const v16, 0x3f828f5c    # 1.02f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, 0x3f28f5c3    # 0.66f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x40b7ae14    # 5.74f

    .line 536
    .line 537
    .line 538
    const/high16 v18, 0x41700000    # 15.0f

    .line 539
    .line 540
    const v13, 0x4085c28f    # 4.18f

    .line 541
    .line 542
    .line 543
    const v14, 0x416ae148    # 14.68f

    .line 544
    .line 545
    .line 546
    const v15, 0x409e6666    # 4.95f

    .line 547
    .line 548
    .line 549
    const/high16 v16, 0x41700000    # 15.0f

    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v0, 0x414828f6    # 12.51f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, 0x4007ae14    # 2.12f

    .line 561
    .line 562
    .line 563
    const v18, -0x409eb852    # -0.88f

    .line 564
    .line 565
    .line 566
    const v13, 0x3f4ccccd    # 0.8f

    .line 567
    .line 568
    .line 569
    const/4 v14, 0x0

    .line 570
    const v15, 0x3fc7ae14    # 1.56f

    .line 571
    .line 572
    .line 573
    const v16, -0x415c28f6    # -0.32f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, 0x3f28f5c3    # 0.66f

    .line 580
    .line 581
    .line 582
    const v2, -0x40d70a3d    # -0.66f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/16 v17, 0x0

    .line 589
    .line 590
    const v18, -0x404b851f    # -1.41f

    .line 591
    .line 592
    .line 593
    const v13, 0x3ec7ae14    # 0.39f

    .line 594
    .line 595
    .line 596
    const v14, -0x413851ec    # -0.39f

    .line 597
    .line 598
    .line 599
    const v15, 0x3ec7ae14    # 0.39f

    .line 600
    .line 601
    .line 602
    const v16, -0x407d70a4    # -1.02f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v17, -0x404b851f    # -1.41f

    .line 609
    .line 610
    .line 611
    const/16 v18, 0x0

    .line 612
    .line 613
    const v13, -0x413851ec    # -0.39f

    .line 614
    .line 615
    .line 616
    const v15, -0x407d70a4    # -1.02f

    .line 617
    .line 618
    .line 619
    const v16, -0x413851ec    # -0.39f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v17, 0x4192147b    # 18.26f

    .line 629
    .line 630
    .line 631
    const/high16 v18, 0x41500000    # 13.0f

    .line 632
    .line 633
    const v13, 0x41963d71    # 18.78f

    .line 634
    .line 635
    .line 636
    const v14, 0x414e3d71    # 12.89f

    .line 637
    .line 638
    .line 639
    const v15, 0x419428f6    # 18.52f

    .line 640
    .line 641
    .line 642
    const/high16 v16, 0x41500000    # 13.0f

    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/high16 v0, 0x41880000    # 17.0f

    .line 648
    .line 649
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x411a6666    # 9.65f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v0, 0x3f028f5c    # 0.51f

    .line 659
    .line 660
    .line 661
    const v2, 0x3ebd70a4    # 0.37f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, 0x419747ae    # 18.91f

    .line 668
    .line 669
    .line 670
    const v18, 0x411cf5c3    # 9.81f

    .line 671
    .line 672
    .line 673
    const v13, 0x418fae14    # 17.96f

    .line 674
    .line 675
    .line 676
    const v14, 0x4125999a    # 10.35f

    .line 677
    .line 678
    .line 679
    const v15, 0x4194a3d7    # 18.58f

    .line 680
    .line 681
    .line 682
    const/high16 v16, 0x41240000    # 10.25f

    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v0, 0x41500000    # 13.0f

    .line 691
    .line 692
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const/high16 v0, -0x40000000    # -2.0f

    .line 696
    .line 697
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v0, 0x40000000    # 2.0f

    .line 704
    .line 705
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v0, 0x41500000    # 13.0f

    .line 709
    .line 710
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    const/16 v16, 0x3800

    .line 721
    .line 722
    const/16 v17, 0x0

    .line 723
    .line 724
    const/high16 v6, 0x3f800000    # 1.0f

    .line 725
    .line 726
    const/high16 v8, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/4 v7, 0x0

    .line 729
    const/high16 v9, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/high16 v12, 0x3f800000    # 1.0f

    .line 732
    .line 733
    const/4 v13, 0x0

    .line 734
    const/4 v14, 0x0

    .line 735
    const/4 v15, 0x0

    .line 736
    const-string v4, ""

    .line 737
    .line 738
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    sput-object v0, Landroidx/compose/material/icons/rounded/HouseboatKt;->_houseboat:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 747
    .line 748
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    return-object v0
.end method

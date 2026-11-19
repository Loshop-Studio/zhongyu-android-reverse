.class public final Landroidx/compose/material/icons/rounded/WaterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _water:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWater(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WaterKt;->_water:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Water"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const v2, 0x41afd70a    # 21.98f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x41b00000    # 22.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, 0x41afd70a    # 21.98f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v0, 0x41500000    # 13.0f

    .line 93
    .line 94
    const v2, 0x40ab3333    # 5.35f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x40551eb8    # 3.33f

    .line 101
    .line 102
    .line 103
    const/high16 v18, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const v13, 0x3f9851ec    # 1.19f

    .line 106
    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const v15, 0x3fb5c28f    # 1.42f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x3f800000    # 1.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v18, -0x40800000    # -1.0f

    .line 118
    .line 119
    const v13, 0x3ff9999a    # 1.95f

    .line 120
    .line 121
    .line 122
    const v15, 0x4005c28f    # 2.09f

    .line 123
    .line 124
    .line 125
    const/high16 v16, -0x40800000    # -1.0f

    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v18, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const v13, 0x3f9851ec    # 1.19f

    .line 133
    .line 134
    .line 135
    const v15, 0x3fb5c28f    # 1.42f

    .line 136
    .line 137
    .line 138
    const/high16 v16, 0x3f800000    # 1.0f

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v18, -0x40800000    # -1.0f

    .line 144
    .line 145
    const v13, 0x3ff9999a    # 1.95f

    .line 146
    .line 147
    .line 148
    const v15, 0x4005c28f    # 2.09f

    .line 149
    .line 150
    .line 151
    const/high16 v16, -0x40800000    # -1.0f

    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x4000a3d7    # 2.01f

    .line 157
    .line 158
    .line 159
    const v18, 0x3f4a3d71    # 0.79f

    .line 160
    .line 161
    .line 162
    const v13, 0x3f6e147b    # 0.93f

    .line 163
    .line 164
    .line 165
    const v15, 0x3f866666    # 1.05f

    .line 166
    .line 167
    .line 168
    const v16, 0x3ee66666    # 0.45f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x3fa66666    # 1.3f

    .line 175
    .line 176
    .line 177
    const v18, -0x40970a3d    # -0.91f

    .line 178
    .line 179
    .line 180
    const v13, 0x3f2147ae    # 0.63f

    .line 181
    .line 182
    .line 183
    const v14, 0x3e6147ae    # 0.22f

    .line 184
    .line 185
    .line 186
    const v15, 0x3fa66666    # 1.3f

    .line 187
    .line 188
    .line 189
    const v16, -0x418a3d71    # -0.24f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, -0x40dc28f6    # -0.64f

    .line 196
    .line 197
    .line 198
    const v18, -0x4087ae14    # -0.97f

    .line 199
    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    const v14, -0x40fae148    # -0.52f

    .line 203
    .line 204
    .line 205
    const v15, -0x41947ae1    # -0.23f

    .line 206
    .line 207
    .line 208
    const v16, -0x40ab851f    # -0.83f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x3fd3d70a    # -2.69f

    .line 215
    .line 216
    .line 217
    const v18, -0x4099999a    # -0.9f

    .line 218
    .line 219
    .line 220
    const v13, -0x40e66666    # -0.6f

    .line 221
    .line 222
    .line 223
    const v14, -0x419eb852    # -0.22f

    .line 224
    .line 225
    .line 226
    const v15, -0x406ccccd    # -1.15f

    .line 227
    .line 228
    .line 229
    const v16, -0x4099999a    # -0.9f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x3faae148    # -3.33f

    .line 236
    .line 237
    .line 238
    const/high16 v18, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const v13, -0x40066666    # -1.95f

    .line 241
    .line 242
    .line 243
    const/4 v14, 0x0

    .line 244
    const v15, -0x3ffa3d71    # -2.09f

    .line 245
    .line 246
    .line 247
    const/high16 v16, 0x3f800000    # 1.0f

    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v18, -0x40800000    # -1.0f

    .line 253
    .line 254
    const v13, -0x4067ae14    # -1.19f

    .line 255
    .line 256
    .line 257
    const v15, -0x404a3d71    # -1.42f

    .line 258
    .line 259
    .line 260
    const/high16 v16, -0x40800000    # -1.0f

    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v18, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const v13, -0x40066666    # -1.95f

    .line 268
    .line 269
    .line 270
    const v15, -0x3ffa3d71    # -2.09f

    .line 271
    .line 272
    .line 273
    const/high16 v16, 0x3f800000    # 1.0f

    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v18, -0x40800000    # -1.0f

    .line 279
    .line 280
    const v13, -0x4067ae14    # -1.19f

    .line 281
    .line 282
    .line 283
    const v15, -0x404a3d71    # -1.42f

    .line 284
    .line 285
    .line 286
    const/high16 v16, -0x40800000    # -1.0f

    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, -0x3fd47ae1    # -2.68f

    .line 292
    .line 293
    .line 294
    const v18, 0x3f68f5c3    # 0.91f

    .line 295
    .line 296
    .line 297
    const v13, -0x403ae148    # -1.54f

    .line 298
    .line 299
    .line 300
    const v15, -0x3ff7ae14    # -2.13f

    .line 301
    .line 302
    .line 303
    const v16, 0x3f35c28f    # 0.71f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v17, 0x40000000    # 2.0f

    .line 310
    .line 311
    const v18, 0x414e3d71    # 12.89f

    .line 312
    .line 313
    .line 314
    const v13, 0x400f5c29    # 2.24f

    .line 315
    .line 316
    .line 317
    const v14, 0x4140cccd    # 12.05f

    .line 318
    .line 319
    .line 320
    const/high16 v15, 0x40000000    # 2.0f

    .line 321
    .line 322
    const v16, 0x4145999a    # 12.35f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, 0x3fa51eb8    # 1.29f

    .line 329
    .line 330
    .line 331
    const v18, 0x3f68f5c3    # 0.91f

    .line 332
    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const v14, 0x3f2b851f    # 0.67f

    .line 336
    .line 337
    .line 338
    const v15, 0x3f28f5c3    # 0.66f

    .line 339
    .line 340
    .line 341
    const v16, 0x3f90a3d7    # 1.13f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, 0x40ab3333    # 5.35f

    .line 348
    .line 349
    .line 350
    const/high16 v18, 0x41500000    # 13.0f

    .line 351
    .line 352
    const v13, 0x408b3333    # 4.35f

    .line 353
    .line 354
    .line 355
    const v14, 0x41570a3d    # 13.44f

    .line 356
    .line 357
    .line 358
    const v15, 0x408c7ae1    # 4.39f

    .line 359
    .line 360
    .line 361
    const/high16 v16, 0x41500000    # 13.0f

    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x41955c29    # 18.67f

    .line 370
    .line 371
    .line 372
    const/high16 v2, 0x41700000    # 15.0f

    .line 373
    .line 374
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, -0x3faae148    # -3.33f

    .line 378
    .line 379
    .line 380
    const/high16 v18, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const v13, -0x40066666    # -1.95f

    .line 383
    .line 384
    .line 385
    const/4 v14, 0x0

    .line 386
    const v15, -0x3ffa3d71    # -2.09f

    .line 387
    .line 388
    .line 389
    const/high16 v16, 0x3f800000    # 1.0f

    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v18, -0x40800000    # -1.0f

    .line 395
    .line 396
    const v13, -0x4067ae14    # -1.19f

    .line 397
    .line 398
    .line 399
    const v15, -0x404a3d71    # -1.42f

    .line 400
    .line 401
    .line 402
    const/high16 v16, -0x40800000    # -1.0f

    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, -0x3faa3d71    # -3.34f

    .line 408
    .line 409
    .line 410
    const/high16 v18, 0x3f800000    # 1.0f

    .line 411
    .line 412
    const v13, -0x40066666    # -1.95f

    .line 413
    .line 414
    .line 415
    const v15, -0x3ff9999a    # -2.1f

    .line 416
    .line 417
    .line 418
    const/high16 v16, 0x3f800000    # 1.0f

    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x3faae148    # -3.33f

    .line 424
    .line 425
    .line 426
    const/high16 v18, -0x40800000    # -1.0f

    .line 427
    .line 428
    const v13, -0x406147ae    # -1.24f

    .line 429
    .line 430
    .line 431
    const v15, -0x404f5c29    # -1.38f

    .line 432
    .line 433
    .line 434
    const/high16 v16, -0x40800000    # -1.0f

    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, -0x3fd3d70a    # -2.69f

    .line 440
    .line 441
    .line 442
    const v18, 0x3f68f5c3    # 0.91f

    .line 443
    .line 444
    .line 445
    const v13, -0x403c28f6    # -1.53f

    .line 446
    .line 447
    .line 448
    const v15, -0x3ff66666    # -2.15f

    .line 449
    .line 450
    .line 451
    const v16, 0x3f35c28f    # 0.71f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x40000000    # 2.0f

    .line 458
    .line 459
    const v18, 0x41871eb8    # 16.89f

    .line 460
    .line 461
    .line 462
    const v13, 0x400f5c29    # 2.24f

    .line 463
    .line 464
    .line 465
    const v14, 0x41806666    # 16.05f

    .line 466
    .line 467
    .line 468
    const/high16 v15, 0x40000000    # 2.0f

    .line 469
    .line 470
    const v16, 0x4182e148    # 16.36f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v17, 0x3fa66666    # 1.3f

    .line 477
    .line 478
    .line 479
    const v18, 0x3f68f5c3    # 0.91f

    .line 480
    .line 481
    .line 482
    const/4 v13, 0x0

    .line 483
    const v14, 0x3f2b851f    # 0.67f

    .line 484
    .line 485
    .line 486
    const v15, 0x3f28f5c3    # 0.66f

    .line 487
    .line 488
    .line 489
    const v16, 0x3f90a3d7    # 1.13f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, 0x40aae148    # 5.34f

    .line 496
    .line 497
    .line 498
    const/high16 v18, 0x41880000    # 17.0f

    .line 499
    .line 500
    const v13, 0x408a3d71    # 4.32f

    .line 501
    .line 502
    .line 503
    const v14, 0x418b851f    # 17.44f

    .line 504
    .line 505
    .line 506
    const v15, 0x408c28f6    # 4.38f

    .line 507
    .line 508
    .line 509
    const/high16 v16, 0x41880000    # 17.0f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v17, 0x40551eb8    # 3.33f

    .line 515
    .line 516
    .line 517
    const/high16 v18, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const v13, 0x3f9eb852    # 1.24f

    .line 520
    .line 521
    .line 522
    const/4 v14, 0x0

    .line 523
    const v15, 0x3fb0a3d7    # 1.38f

    .line 524
    .line 525
    .line 526
    const/high16 v16, 0x3f800000    # 1.0f

    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x4055c28f    # 3.34f

    .line 532
    .line 533
    .line 534
    const/high16 v18, -0x40800000    # -1.0f

    .line 535
    .line 536
    const v13, 0x3ff9999a    # 1.95f

    .line 537
    .line 538
    .line 539
    const v15, 0x40066666    # 2.1f

    .line 540
    .line 541
    .line 542
    const/high16 v16, -0x40800000    # -1.0f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, 0x40551eb8    # 3.33f

    .line 548
    .line 549
    .line 550
    const/high16 v18, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const v13, 0x3f9851ec    # 1.19f

    .line 553
    .line 554
    .line 555
    const v15, 0x3fb5c28f    # 1.42f

    .line 556
    .line 557
    .line 558
    const/high16 v16, 0x3f800000    # 1.0f

    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v18, -0x40800000    # -1.0f

    .line 564
    .line 565
    const v13, 0x3ff851ec    # 1.94f

    .line 566
    .line 567
    .line 568
    const v15, 0x4005c28f    # 2.09f

    .line 569
    .line 570
    .line 571
    const/high16 v16, -0x40800000    # -1.0f

    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const v17, 0x4001eb85    # 2.03f

    .line 577
    .line 578
    .line 579
    const v18, 0x3f4ccccd    # 0.8f

    .line 580
    .line 581
    .line 582
    const v13, 0x3f70a3d7    # 0.94f

    .line 583
    .line 584
    .line 585
    const v15, 0x3f87ae14    # 1.06f

    .line 586
    .line 587
    .line 588
    const v16, 0x3eeb851f    # 0.46f

    .line 589
    .line 590
    .line 591
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v17, 0x3fa66666    # 1.3f

    .line 595
    .line 596
    .line 597
    const v18, -0x40970a3d    # -0.91f

    .line 598
    .line 599
    .line 600
    const v13, 0x3f2147ae    # 0.63f

    .line 601
    .line 602
    .line 603
    const v14, 0x3e6147ae    # 0.22f

    .line 604
    .line 605
    .line 606
    const v15, 0x3fa66666    # 1.3f

    .line 607
    .line 608
    .line 609
    const v16, -0x418a3d71    # -0.24f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, -0x40d9999a    # -0.65f

    .line 616
    .line 617
    .line 618
    const v18, -0x40851eb8    # -0.98f

    .line 619
    .line 620
    .line 621
    const/4 v13, 0x0

    .line 622
    const v14, -0x40f851ec    # -0.53f

    .line 623
    .line 624
    .line 625
    const v15, -0x418a3d71    # -0.24f

    .line 626
    .line 627
    .line 628
    const v16, -0x40ab851f    # -0.83f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, 0x41955c29    # 18.67f

    .line 635
    .line 636
    .line 637
    const/high16 v18, 0x41700000    # 15.0f

    .line 638
    .line 639
    const v13, 0x41a68f5c    # 20.82f

    .line 640
    .line 641
    .line 642
    const v14, 0x417b851f    # 15.72f

    .line 643
    .line 644
    .line 645
    const v15, 0x41a1ae14    # 20.21f

    .line 646
    .line 647
    .line 648
    const/high16 v16, 0x41700000    # 15.0f

    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v0, 0x41100000    # 9.0f

    .line 657
    .line 658
    const v2, 0x40ab3333    # 5.35f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v17, 0x40551eb8    # 3.33f

    .line 665
    .line 666
    .line 667
    const/high16 v18, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const v13, 0x3f9851ec    # 1.19f

    .line 670
    .line 671
    .line 672
    const/4 v14, 0x0

    .line 673
    const v15, 0x3fb5c28f    # 1.42f

    .line 674
    .line 675
    .line 676
    const/high16 v16, 0x3f800000    # 1.0f

    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v18, -0x40800000    # -1.0f

    .line 682
    .line 683
    const v13, 0x3ff9999a    # 1.95f

    .line 684
    .line 685
    .line 686
    const v15, 0x4005c28f    # 2.09f

    .line 687
    .line 688
    .line 689
    const/high16 v16, -0x40800000    # -1.0f

    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v18, 0x3f800000    # 1.0f

    .line 695
    .line 696
    const v13, 0x3f9851ec    # 1.19f

    .line 697
    .line 698
    .line 699
    const v15, 0x3fb5c28f    # 1.42f

    .line 700
    .line 701
    .line 702
    const/high16 v16, 0x3f800000    # 1.0f

    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v18, -0x40800000    # -1.0f

    .line 708
    .line 709
    const v13, 0x3ff9999a    # 1.95f

    .line 710
    .line 711
    .line 712
    const v15, 0x4005c28f    # 2.09f

    .line 713
    .line 714
    .line 715
    const/high16 v16, -0x40800000    # -1.0f

    .line 716
    .line 717
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v17, 0x4000a3d7    # 2.01f

    .line 721
    .line 722
    .line 723
    const v18, 0x3f4a3d71    # 0.79f

    .line 724
    .line 725
    .line 726
    const v13, 0x3f6e147b    # 0.93f

    .line 727
    .line 728
    .line 729
    const v15, 0x3f866666    # 1.05f

    .line 730
    .line 731
    .line 732
    const v16, 0x3ee66666    # 0.45f

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const v17, 0x3fa66666    # 1.3f

    .line 739
    .line 740
    .line 741
    const v18, -0x40970a3d    # -0.91f

    .line 742
    .line 743
    .line 744
    const v13, 0x3f2147ae    # 0.63f

    .line 745
    .line 746
    .line 747
    const v14, 0x3e6147ae    # 0.22f

    .line 748
    .line 749
    .line 750
    const v15, 0x3fa66666    # 1.3f

    .line 751
    .line 752
    .line 753
    const v16, -0x418a3d71    # -0.24f

    .line 754
    .line 755
    .line 756
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v17, -0x40dc28f6    # -0.64f

    .line 760
    .line 761
    .line 762
    const v18, -0x4087ae14    # -0.97f

    .line 763
    .line 764
    .line 765
    const/4 v13, 0x0

    .line 766
    const v14, -0x40fae148    # -0.52f

    .line 767
    .line 768
    .line 769
    const v15, -0x41947ae1    # -0.23f

    .line 770
    .line 771
    .line 772
    const v16, -0x40ab851f    # -0.83f

    .line 773
    .line 774
    .line 775
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v17, 0x41953333    # 18.65f

    .line 779
    .line 780
    .line 781
    const/high16 v18, 0x40e00000    # 7.0f

    .line 782
    .line 783
    const v13, 0x41a5eb85    # 20.74f

    .line 784
    .line 785
    .line 786
    const v14, 0x40f5c28f    # 7.68f

    .line 787
    .line 788
    .line 789
    const v15, 0x41a1851f    # 20.19f

    .line 790
    .line 791
    .line 792
    const/high16 v16, 0x40e00000    # 7.0f

    .line 793
    .line 794
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v17, -0x3faae148    # -3.33f

    .line 798
    .line 799
    .line 800
    const/high16 v18, 0x3f800000    # 1.0f

    .line 801
    .line 802
    const v13, -0x40066666    # -1.95f

    .line 803
    .line 804
    .line 805
    const/4 v14, 0x0

    .line 806
    const v15, -0x3ffa3d71    # -2.09f

    .line 807
    .line 808
    .line 809
    const/high16 v16, 0x3f800000    # 1.0f

    .line 810
    .line 811
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v18, -0x40800000    # -1.0f

    .line 815
    .line 816
    const v13, -0x4067ae14    # -1.19f

    .line 817
    .line 818
    .line 819
    const v15, -0x404a3d71    # -1.42f

    .line 820
    .line 821
    .line 822
    const/high16 v16, -0x40800000    # -1.0f

    .line 823
    .line 824
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 825
    .line 826
    .line 827
    const v17, 0x410a8f5c    # 8.66f

    .line 828
    .line 829
    .line 830
    const/high16 v18, 0x41000000    # 8.0f

    .line 831
    .line 832
    const v13, 0x4120a3d7    # 10.04f

    .line 833
    .line 834
    .line 835
    const/high16 v14, 0x40e00000    # 7.0f

    .line 836
    .line 837
    const v15, 0x411e6666    # 9.9f

    .line 838
    .line 839
    .line 840
    const/high16 v16, 0x41000000    # 8.0f

    .line 841
    .line 842
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v17, 0x40aa8f5c    # 5.33f

    .line 846
    .line 847
    .line 848
    const/high16 v18, 0x40e00000    # 7.0f

    .line 849
    .line 850
    const v13, 0x40ef0a3d    # 7.47f

    .line 851
    .line 852
    .line 853
    const/high16 v14, 0x41000000    # 8.0f

    .line 854
    .line 855
    const v15, 0x40e7ae14    # 7.24f

    .line 856
    .line 857
    .line 858
    const/high16 v16, 0x40e00000    # 7.0f

    .line 859
    .line 860
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v17, 0x4029999a    # 2.65f

    .line 864
    .line 865
    .line 866
    const v18, 0x40fd1eb8    # 7.91f

    .line 867
    .line 868
    .line 869
    const v13, 0x40728f5c    # 3.79f

    .line 870
    .line 871
    .line 872
    const/high16 v14, 0x40e00000    # 7.0f

    .line 873
    .line 874
    const v15, 0x404ccccd    # 3.2f

    .line 875
    .line 876
    .line 877
    const v16, 0x40f6b852    # 7.71f

    .line 878
    .line 879
    .line 880
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v17, 0x40000000    # 2.0f

    .line 884
    .line 885
    const v18, 0x410e3d71    # 8.89f

    .line 886
    .line 887
    .line 888
    const v13, 0x400f5c29    # 2.24f

    .line 889
    .line 890
    .line 891
    const v14, 0x4100cccd    # 8.05f

    .line 892
    .line 893
    .line 894
    const/high16 v15, 0x40000000    # 2.0f

    .line 895
    .line 896
    const v16, 0x4105999a    # 8.35f

    .line 897
    .line 898
    .line 899
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v17, 0x3fa51eb8    # 1.29f

    .line 903
    .line 904
    .line 905
    const v18, 0x3f68f5c3    # 0.91f

    .line 906
    .line 907
    .line 908
    const/4 v13, 0x0

    .line 909
    const v14, 0x3f2b851f    # 0.67f

    .line 910
    .line 911
    .line 912
    const v15, 0x3f28f5c3    # 0.66f

    .line 913
    .line 914
    .line 915
    const v16, 0x3f90a3d7    # 1.13f

    .line 916
    .line 917
    .line 918
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const v17, 0x40ab3333    # 5.35f

    .line 922
    .line 923
    .line 924
    const/high16 v18, 0x41100000    # 9.0f

    .line 925
    .line 926
    const v13, 0x408b3333    # 4.35f

    .line 927
    .line 928
    .line 929
    const v14, 0x41170a3d    # 9.44f

    .line 930
    .line 931
    .line 932
    const v15, 0x408c7ae1    # 4.39f

    .line 933
    .line 934
    .line 935
    const/high16 v16, 0x41100000    # 9.0f

    .line 936
    .line 937
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 938
    .line 939
    .line 940
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    const/16 v16, 0x3800

    .line 948
    .line 949
    const/16 v17, 0x0

    .line 950
    .line 951
    const/high16 v6, 0x3f800000    # 1.0f

    .line 952
    .line 953
    const/high16 v8, 0x3f800000    # 1.0f

    .line 954
    .line 955
    const/4 v7, 0x0

    .line 956
    const/high16 v9, 0x3f800000    # 1.0f

    .line 957
    .line 958
    const/high16 v12, 0x3f800000    # 1.0f

    .line 959
    .line 960
    const/4 v13, 0x0

    .line 961
    const/4 v14, 0x0

    .line 962
    const/4 v15, 0x0

    .line 963
    const-string v4, ""

    .line 964
    .line 965
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    sput-object v0, Landroidx/compose/material/icons/rounded/WaterKt;->_water:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 974
    .line 975
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/MapsUgcKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mapsUgc:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMapsUgc(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MapsUgcKt;->_mapsUgc:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MapsUgc"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, 0x40fa3d71    # 7.82f

    .line 78
    .line 79
    .line 80
    const v26, 0x411b851f    # 9.72f

    .line 81
    .line 82
    .line 83
    const v21, 0x409f0a3d    # 4.97f

    .line 84
    .line 85
    .line 86
    const/16 v22, 0x0

    .line 87
    .line 88
    const v23, 0x410e6666    # 8.9f

    .line 89
    .line 90
    .line 91
    const v24, 0x4091eb85    # 4.56f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3f2a8f5c    # -6.67f

    .line 100
    .line 101
    .line 102
    const v26, 0x40c66666    # 6.2f

    .line 103
    .line 104
    .line 105
    const v21, -0x40d1eb85    # -0.68f

    .line 106
    .line 107
    .line 108
    const v22, 0x404eb852    # 3.23f

    .line 109
    .line 110
    .line 111
    const v23, -0x3fa66666    # -3.4f

    .line 112
    .line 113
    .line 114
    const v24, 0x40b7ae14    # 5.74f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v25, -0x3f6d70a4    # -4.58f

    .line 121
    .line 122
    .line 123
    const v26, -0x40cccccd    # -0.7f

    .line 124
    .line 125
    .line 126
    const v21, -0x40347ae1    # -1.59f

    .line 127
    .line 128
    .line 129
    const v22, 0x3e6147ae    # 0.22f

    .line 130
    .line 131
    .line 132
    const v23, -0x3fb70a3d    # -3.14f

    .line 133
    .line 134
    .line 135
    const v24, -0x43dc28f6    # -0.01f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v25, -0x40a3d70a    # -0.86f

    .line 142
    .line 143
    .line 144
    const v26, -0x41bd70a4    # -0.19f

    .line 145
    .line 146
    .line 147
    const v21, -0x4175c28f    # -0.27f

    .line 148
    .line 149
    .line 150
    const v22, -0x41fae148    # -0.13f

    .line 151
    .line 152
    .line 153
    const v23, -0x40f0a3d7    # -0.56f

    .line 154
    .line 155
    .line 156
    const v24, -0x41bd70a4    # -0.19f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v25, -0x40f0a3d7    # -0.56f

    .line 163
    .line 164
    .line 165
    const v26, 0x3da3d70a    # 0.08f

    .line 166
    .line 167
    .line 168
    const v21, -0x41bd70a4    # -0.19f

    .line 169
    .line 170
    .line 171
    const/16 v22, 0x0

    .line 172
    .line 173
    const v23, -0x413d70a4    # -0.38f

    .line 174
    .line 175
    .line 176
    const v24, 0x3cf5c28f    # 0.03f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, -0x3fec28f6    # -2.31f

    .line 183
    .line 184
    .line 185
    const v6, 0x3f2e147b    # 0.68f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, -0x40deb852    # -0.63f

    .line 192
    .line 193
    .line 194
    const v26, -0x40deb852    # -0.63f

    .line 195
    .line 196
    .line 197
    const v21, -0x413d70a4    # -0.38f

    .line 198
    .line 199
    .line 200
    const v22, 0x3de147ae    # 0.11f

    .line 201
    .line 202
    .line 203
    const v23, -0x40c28f5c    # -0.74f

    .line 204
    .line 205
    .line 206
    const v24, -0x418a3d71    # -0.24f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x3f333333    # 0.7f

    .line 213
    .line 214
    .line 215
    const v6, -0x3fe70a3d    # -2.39f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, -0x41f0a3d7    # -0.14f

    .line 222
    .line 223
    .line 224
    const v26, -0x40533333    # -1.35f

    .line 225
    .line 226
    .line 227
    const v21, 0x3e051eb8    # 0.13f

    .line 228
    .line 229
    .line 230
    const v22, -0x4119999a    # -0.45f

    .line 231
    .line 232
    .line 233
    const v23, 0x3d8f5c29    # 0.07f

    .line 234
    .line 235
    .line 236
    const v24, -0x40947ae1    # -0.92f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v25, 0x40800000    # 4.0f

    .line 243
    .line 244
    const/high16 v26, 0x41400000    # 12.0f

    .line 245
    .line 246
    const v21, 0x408851ec    # 4.26f

    .line 247
    .line 248
    .line 249
    const v22, 0x416570a4    # 14.34f

    .line 250
    .line 251
    .line 252
    const/high16 v23, 0x40800000    # 4.0f

    .line 253
    .line 254
    const v24, 0x4152e148    # 13.18f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v25, 0x41400000    # 12.0f

    .line 261
    .line 262
    const/high16 v26, 0x40800000    # 4.0f

    .line 263
    .line 264
    const/high16 v21, 0x40800000    # 4.0f

    .line 265
    .line 266
    const v22, 0x40f2e148    # 7.59f

    .line 267
    .line 268
    .line 269
    const v23, 0x40f2e148    # 7.59f

    .line 270
    .line 271
    .line 272
    const/high16 v24, 0x40800000    # 4.0f

    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v4, 0x41400000    # 12.0f

    .line 278
    .line 279
    const/high16 v6, 0x40000000    # 2.0f

    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v25, 0x40000000    # 2.0f

    .line 285
    .line 286
    const/high16 v26, 0x41400000    # 12.0f

    .line 287
    .line 288
    const v21, 0x40cf5c29    # 6.48f

    .line 289
    .line 290
    .line 291
    const/high16 v22, 0x40000000    # 2.0f

    .line 292
    .line 293
    const/high16 v23, 0x40000000    # 2.0f

    .line 294
    .line 295
    const v24, 0x40cf5c29    # 6.48f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v25, 0x3f7851ec    # 0.97f

    .line 302
    .line 303
    .line 304
    const v26, 0x408947ae    # 4.29f

    .line 305
    .line 306
    .line 307
    const/16 v21, 0x0

    .line 308
    .line 309
    const v22, 0x3fc51eb8    # 1.54f

    .line 310
    .line 311
    .line 312
    const v23, 0x3eb851ec    # 0.36f

    .line 313
    .line 314
    .line 315
    const v24, 0x403eb852    # 2.98f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v4, 0x409eb852    # 4.96f

    .line 322
    .line 323
    .line 324
    const v6, -0x40451eb8    # -1.46f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v25, 0x4030a3d7    # 2.76f

    .line 331
    .line 332
    .line 333
    const v26, 0x41b3d70a    # 22.48f

    .line 334
    .line 335
    .line 336
    const v21, 0x3fa51eb8    # 1.29f

    .line 337
    .line 338
    .line 339
    const/high16 v22, 0x41b00000    # 22.0f

    .line 340
    .line 341
    const/high16 v23, 0x40000000    # 2.0f

    .line 342
    .line 343
    const v24, 0x41b5ae14    # 22.71f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v25, 0x40b28f5c    # 5.58f

    .line 353
    .line 354
    .line 355
    const v26, 0x3f63d70a    # 0.89f

    .line 356
    .line 357
    .line 358
    const v21, 0x3fd47ae1    # 1.66f

    .line 359
    .line 360
    .line 361
    const v22, 0x3f4a3d71    # 0.79f

    .line 362
    .line 363
    .line 364
    const v23, 0x4063d70a    # 3.56f

    .line 365
    .line 366
    .line 367
    const v24, 0x3f933333    # 1.15f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v25, 0x410a8f5c    # 8.66f

    .line 374
    .line 375
    .line 376
    const v26, -0x3ef147ae    # -8.92f

    .line 377
    .line 378
    .line 379
    const v21, 0x4091eb85    # 4.56f

    .line 380
    .line 381
    .line 382
    const v22, -0x40e8f5c3    # -0.59f

    .line 383
    .line 384
    .line 385
    const v23, 0x41035c29    # 8.21f

    .line 386
    .line 387
    .line 388
    const v24, -0x3f74cccd    # -4.35f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v25, 0x41400000    # 12.0f

    .line 395
    .line 396
    const/high16 v26, 0x40000000    # 2.0f

    .line 397
    .line 398
    const v21, 0x41b43d71    # 22.53f

    .line 399
    .line 400
    .line 401
    const v22, 0x40e0f5c3    # 7.03f

    .line 402
    .line 403
    .line 404
    const v23, 0x418ecccd    # 17.85f

    .line 405
    .line 406
    .line 407
    const/high16 v24, 0x40000000    # 2.0f

    .line 408
    .line 409
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v4, 0x41400000    # 12.0f

    .line 413
    .line 414
    const/high16 v6, 0x40000000    # 2.0f

    .line 415
    .line 416
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    const/16 v16, 0x3800

    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    const/high16 v6, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/high16 v8, 0x3f800000    # 1.0f

    .line 433
    .line 434
    const/4 v7, 0x0

    .line 435
    const/high16 v9, 0x3f800000    # 1.0f

    .line 436
    .line 437
    const/high16 v12, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/4 v13, 0x0

    .line 440
    const/4 v14, 0x0

    .line 441
    const/4 v15, 0x0

    .line 442
    const-string v4, ""

    .line 443
    .line 444
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 445
    .line 446
    .line 447
    sget-object v2, Landroidx/compose/ui/graphics/PathFillType;->Companion:Landroidx/compose/ui/graphics/PathFillType$Companion;

    .line 448
    .line 449
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/PathFillType$Companion;->getEvenOdd-Rg-k1Os()I

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 454
    .line 455
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 456
    .line 457
    .line 458
    move-result-wide v6

    .line 459
    const/4 v0, 0x0

    .line 460
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 464
    .line 465
    .line 466
    move-result v10

    .line 467
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 468
    .line 469
    .line 470
    move-result v11

    .line 471
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 474
    .line 475
    .line 476
    const/high16 v0, 0x41000000    # 8.0f

    .line 477
    .line 478
    const/high16 v2, 0x41400000    # 12.0f

    .line 479
    .line 480
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const/high16 v17, -0x40800000    # -1.0f

    .line 487
    .line 488
    const/high16 v18, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const v13, -0x40f33333    # -0.55f

    .line 491
    .line 492
    .line 493
    const/high16 v15, -0x40800000    # -1.0f

    .line 494
    .line 495
    const v16, 0x3ee66666    # 0.45f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v0, 0x40000000    # 2.0f

    .line 502
    .line 503
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v0, 0x41100000    # 9.0f

    .line 507
    .line 508
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/4 v0, 0x0

    .line 515
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const/high16 v17, 0x3f800000    # 1.0f

    .line 519
    .line 520
    const/4 v13, 0x0

    .line 521
    const v14, 0x3f0ccccd    # 0.55f

    .line 522
    .line 523
    .line 524
    const v15, 0x3ee66666    # 0.45f

    .line 525
    .line 526
    .line 527
    const/high16 v16, 0x3f800000    # 1.0f

    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const/high16 v0, 0x40000000    # 2.0f

    .line 533
    .line 534
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/4 v0, 0x0

    .line 544
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v18, -0x40800000    # -1.0f

    .line 548
    .line 549
    const v13, 0x3f0ccccd    # 0.55f

    .line 550
    .line 551
    .line 552
    const/4 v14, 0x0

    .line 553
    const/high16 v15, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const v16, -0x4119999a    # -0.45f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, -0x40000000    # -2.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x40000000    # 2.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/4 v0, 0x0

    .line 575
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, -0x40800000    # -1.0f

    .line 579
    .line 580
    const/4 v13, 0x0

    .line 581
    const v14, -0x40f33333    # -0.55f

    .line 582
    .line 583
    .line 584
    const v15, -0x4119999a    # -0.45f

    .line 585
    .line 586
    .line 587
    const/high16 v16, -0x40800000    # -1.0f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, -0x40000000    # -2.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41100000    # 9.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v17, 0x41400000    # 12.0f

    .line 603
    .line 604
    const/high16 v18, 0x41000000    # 8.0f

    .line 605
    .line 606
    const/high16 v13, 0x41500000    # 13.0f

    .line 607
    .line 608
    const v14, 0x41073333    # 8.45f

    .line 609
    .line 610
    .line 611
    const v15, 0x4148cccd    # 12.55f

    .line 612
    .line 613
    .line 614
    const/high16 v16, 0x41000000    # 8.0f

    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    const/16 v16, 0x3800

    .line 627
    .line 628
    const/16 v17, 0x0

    .line 629
    .line 630
    const/high16 v6, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const/4 v7, 0x0

    .line 633
    const/high16 v12, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/4 v13, 0x0

    .line 636
    const/4 v14, 0x0

    .line 637
    const/4 v15, 0x0

    .line 638
    const-string v4, ""

    .line 639
    .line 640
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    sput-object v0, Landroidx/compose/material/icons/rounded/MapsUgcKt;->_mapsUgc:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 649
    .line 650
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    return-object v0
.end method

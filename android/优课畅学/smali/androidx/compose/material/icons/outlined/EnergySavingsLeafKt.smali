.class public final Landroidx/compose/material/icons/outlined/EnergySavingsLeafKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _energySavingsLeaf:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEnergySavingsLeaf(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/EnergySavingsLeafKt;->_energySavingsLeaf:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.EnergySavingsLeaf"

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
    const/high16 v4, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x41400000    # 12.0f

    .line 78
    .line 79
    const/high16 v26, 0x40400000    # 3.0f

    .line 80
    .line 81
    const/high16 v21, 0x41400000    # 12.0f

    .line 82
    .line 83
    const/high16 v22, 0x40400000    # 3.0f

    .line 84
    .line 85
    const/high16 v23, 0x41400000    # 12.0f

    .line 86
    .line 87
    const/high16 v24, 0x40400000    # 3.0f

    .line 88
    .line 89
    move-object/from16 v20, v2

    .line 90
    .line 91
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v25, -0x3ef00000    # -9.0f

    .line 95
    .line 96
    const/high16 v26, 0x41100000    # 9.0f

    .line 97
    .line 98
    const v21, -0x3f666666    # -4.8f

    .line 99
    .line 100
    .line 101
    const/16 v22, 0x0

    .line 102
    .line 103
    const/high16 v23, -0x3ef00000    # -9.0f

    .line 104
    .line 105
    const v24, 0x40770a3d    # 3.86f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v25, 0x3ffc28f6    # 1.97f

    .line 112
    .line 113
    .line 114
    const v26, 0x40b3851f    # 5.61f

    .line 115
    .line 116
    .line 117
    const/16 v21, 0x0

    .line 118
    .line 119
    const v22, 0x4007ae14    # 2.12f

    .line 120
    .line 121
    .line 122
    const v23, 0x3f3d70a4    # 0.74f

    .line 123
    .line 124
    .line 125
    const v24, 0x40823d71    # 4.07f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x419cb852    # 19.59f

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x40400000    # 3.0f

    .line 135
    .line 136
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x408d1eb8    # 4.41f

    .line 140
    .line 141
    .line 142
    const/high16 v6, 0x41a80000    # 21.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v4, 0x3ffc28f6    # 1.97f

    .line 148
    .line 149
    .line 150
    const v6, -0x4003d70a    # -1.97f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const/high16 v25, 0x41400000    # 12.0f

    .line 157
    .line 158
    const/high16 v26, 0x41a80000    # 21.0f

    .line 159
    .line 160
    const v21, 0x40fdc28f    # 7.93f

    .line 161
    .line 162
    .line 163
    const v22, 0x41a2147b    # 20.26f

    .line 164
    .line 165
    .line 166
    const v23, 0x411e147b    # 9.88f

    .line 167
    .line 168
    .line 169
    const/high16 v24, 0x41a80000    # 21.0f

    .line 170
    .line 171
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v25, 0x40cb851f    # 6.36f

    .line 175
    .line 176
    .line 177
    const v26, -0x3fd70a3d    # -2.64f

    .line 178
    .line 179
    .line 180
    const v21, 0x40133333    # 2.3f

    .line 181
    .line 182
    .line 183
    const/16 v22, 0x0

    .line 184
    .line 185
    const v23, 0x4093851f    # 4.61f

    .line 186
    .line 187
    .line 188
    const v24, -0x409eb852    # -0.88f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v25, 0x41a80000    # 21.0f

    .line 195
    .line 196
    const/high16 v26, 0x41400000    # 12.0f

    .line 197
    .line 198
    const v21, 0x41a0f5c3    # 20.12f

    .line 199
    .line 200
    .line 201
    const v22, 0x4184e148    # 16.61f

    .line 202
    .line 203
    .line 204
    const/high16 v23, 0x41a80000    # 21.0f

    .line 205
    .line 206
    const v24, 0x4164cccd    # 14.3f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 213
    .line 214
    const/4 v6, 0x0

    .line 215
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x40400000    # 3.0f

    .line 219
    .line 220
    const/high16 v6, 0x41400000    # 12.0f

    .line 221
    .line 222
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x41980000    # 19.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v25, -0x3ffccccd    # -2.05f

    .line 234
    .line 235
    .line 236
    const v26, 0x409e6666    # 4.95f

    .line 237
    .line 238
    .line 239
    const/16 v21, 0x0

    .line 240
    .line 241
    const v22, 0x3fef5c29    # 1.87f

    .line 242
    .line 243
    .line 244
    const v23, -0x40c51eb8    # -0.73f

    .line 245
    .line 246
    .line 247
    const v24, 0x406851ec    # 3.63f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v25, 0x41400000    # 12.0f

    .line 254
    .line 255
    const/high16 v26, 0x41980000    # 19.0f

    .line 256
    .line 257
    const v21, 0x417a147b    # 15.63f

    .line 258
    .line 259
    .line 260
    const v22, 0x419228f6    # 18.27f

    .line 261
    .line 262
    .line 263
    const v23, 0x415deb85    # 13.87f

    .line 264
    .line 265
    .line 266
    const/high16 v24, 0x41980000    # 19.0f

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v25, -0x3f200000    # -7.0f

    .line 272
    .line 273
    const/high16 v26, -0x3f200000    # -7.0f

    .line 274
    .line 275
    const v21, -0x3f88f5c3    # -3.86f

    .line 276
    .line 277
    .line 278
    const/16 v22, 0x0

    .line 279
    .line 280
    const/high16 v23, -0x3f200000    # -7.0f

    .line 281
    .line 282
    const v24, -0x3fb70a3d    # -3.14f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v25, 0x40066666    # 2.1f

    .line 289
    .line 290
    .line 291
    const v26, -0x3f6051ec    # -4.99f

    .line 292
    .line 293
    .line 294
    const/16 v21, 0x0

    .line 295
    .line 296
    const v22, -0x400ccccd    # -1.9f

    .line 297
    .line 298
    .line 299
    const v23, 0x3f3d70a4    # 0.74f

    .line 300
    .line 301
    .line 302
    const v24, -0x3f947ae1    # -3.68f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v25, 0x41400000    # 12.0f

    .line 309
    .line 310
    const/high16 v26, 0x40a00000    # 5.0f

    .line 311
    .line 312
    const v21, 0x4106b852    # 8.42f

    .line 313
    .line 314
    .line 315
    const v22, 0x40b6b852    # 5.71f

    .line 316
    .line 317
    .line 318
    const v23, 0x41228f5c    # 10.16f

    .line 319
    .line 320
    .line 321
    const/high16 v24, 0x40a00000    # 5.0f

    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, 0x40e00000    # 7.0f

    .line 327
    .line 328
    const/4 v6, 0x0

    .line 329
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const/high16 v4, 0x41980000    # 19.0f

    .line 333
    .line 334
    const/high16 v6, 0x41400000    # 12.0f

    .line 335
    .line 336
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    const/16 v16, 0x3800

    .line 347
    .line 348
    const/16 v17, 0x0

    .line 349
    .line 350
    const/high16 v6, 0x3f800000    # 1.0f

    .line 351
    .line 352
    const/high16 v8, 0x3f800000    # 1.0f

    .line 353
    .line 354
    const/4 v7, 0x0

    .line 355
    const/high16 v9, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/high16 v12, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/4 v13, 0x0

    .line 360
    const/4 v14, 0x0

    .line 361
    const/4 v15, 0x0

    .line 362
    const-string v4, ""

    .line 363
    .line 364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 372
    .line 373
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 374
    .line 375
    .line 376
    move-result-wide v6

    .line 377
    const/4 v0, 0x0

    .line 378
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    const v0, 0x41075c29    # 8.46f

    .line 395
    .line 396
    .line 397
    const v2, 0x414a147b    # 12.63f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x4081999a    # 4.05f

    .line 404
    .line 405
    .line 406
    const v2, 0x3ecccccd    # 0.4f

    .line 407
    .line 408
    .line 409
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, -0x3fe3d70a    # -2.44f

    .line 413
    .line 414
    .line 415
    const v2, 0x40551eb8    # 3.33f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x3d23d70a    # 0.04f

    .line 422
    .line 423
    .line 424
    const v18, 0x3f051eb8    # 0.52f

    .line 425
    .line 426
    .line 427
    const v13, -0x421eb852    # -0.11f

    .line 428
    .line 429
    .line 430
    const v14, 0x3e23d70a    # 0.16f

    .line 431
    .line 432
    .line 433
    const v15, -0x42333333    # -0.1f

    .line 434
    .line 435
    .line 436
    const v16, 0x3ec28f5c    # 0.38f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x3f0f5c29    # 0.56f

    .line 443
    .line 444
    .line 445
    const v18, 0x3c23d70a    # 0.01f

    .line 446
    .line 447
    .line 448
    const v13, 0x3e19999a    # 0.15f

    .line 449
    .line 450
    .line 451
    const v14, 0x3e19999a    # 0.15f

    .line 452
    .line 453
    .line 454
    const v15, 0x3ecccccd    # 0.4f

    .line 455
    .line 456
    .line 457
    const v16, 0x3e23d70a    # 0.16f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x40a51eb8    # 5.16f

    .line 464
    .line 465
    .line 466
    const v2, -0x3f6bd70a    # -4.63f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, -0x41666666    # -0.3f

    .line 473
    .line 474
    .line 475
    const v18, -0x409c28f6    # -0.89f

    .line 476
    .line 477
    .line 478
    const v13, 0x3ea8f5c3    # 0.33f

    .line 479
    .line 480
    .line 481
    const v14, -0x41666666    # -0.3f

    .line 482
    .line 483
    .line 484
    const v15, 0x3e19999a    # 0.15f

    .line 485
    .line 486
    .line 487
    const v16, -0x40a66666    # -0.85f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, -0x3f7e6666    # -4.05f

    .line 494
    .line 495
    .line 496
    const v2, -0x41333333    # -0.4f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, 0x401c28f6    # 2.44f

    .line 503
    .line 504
    .line 505
    const v2, -0x3faae148    # -3.33f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, -0x42dc28f6    # -0.04f

    .line 512
    .line 513
    .line 514
    const v18, -0x40fae148    # -0.52f

    .line 515
    .line 516
    .line 517
    const v13, 0x3de147ae    # 0.11f

    .line 518
    .line 519
    .line 520
    const v14, -0x41dc28f6    # -0.16f

    .line 521
    .line 522
    .line 523
    const v15, 0x3dcccccd    # 0.1f

    .line 524
    .line 525
    .line 526
    const v16, -0x413d70a4    # -0.38f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, -0x40f0a3d7    # -0.56f

    .line 533
    .line 534
    .line 535
    const v18, -0x43dc28f6    # -0.01f

    .line 536
    .line 537
    .line 538
    const v13, -0x41e66666    # -0.15f

    .line 539
    .line 540
    .line 541
    const v14, -0x41e66666    # -0.15f

    .line 542
    .line 543
    .line 544
    const v15, -0x41333333    # -0.4f

    .line 545
    .line 546
    .line 547
    const v16, -0x41dc28f6    # -0.16f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, -0x3f5ae148    # -5.16f

    .line 554
    .line 555
    .line 556
    const v2, 0x409428f6    # 4.63f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v17, 0x41075c29    # 8.46f

    .line 563
    .line 564
    .line 565
    const v18, 0x414a147b    # 12.63f

    .line 566
    .line 567
    .line 568
    const v13, 0x40fae148    # 7.84f

    .line 569
    .line 570
    .line 571
    const v14, 0x4140a3d7    # 12.04f

    .line 572
    .line 573
    .line 574
    const v15, 0x410051ec    # 8.02f

    .line 575
    .line 576
    .line 577
    const v16, 0x414970a4    # 12.59f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    const/16 v16, 0x3800

    .line 591
    .line 592
    const/16 v17, 0x0

    .line 593
    .line 594
    const/high16 v6, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/4 v7, 0x0

    .line 597
    const/high16 v12, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v13, 0x0

    .line 600
    const/4 v14, 0x0

    .line 601
    const/4 v15, 0x0

    .line 602
    const-string v4, ""

    .line 603
    .line 604
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    sput-object v0, Landroidx/compose/material/icons/outlined/EnergySavingsLeafKt;->_energySavingsLeaf:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 613
    .line 614
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    return-object v0
.end method

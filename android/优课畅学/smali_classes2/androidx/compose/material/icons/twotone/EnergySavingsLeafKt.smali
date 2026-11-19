.class public final Landroidx/compose/material/icons/twotone/EnergySavingsLeafKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _energySavingsLeaf:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEnergySavingsLeaf(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EnergySavingsLeafKt;->_energySavingsLeaf:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.EnergySavingsLeaf"

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
    const v4, 0x40e33333    # 7.1f

    .line 71
    .line 72
    .line 73
    const v6, 0x40e051ec    # 7.01f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const/high16 v26, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v21, 0x40b7ae14    # 5.74f

    .line 84
    .line 85
    .line 86
    const v22, 0x41051eb8    # 8.32f

    .line 87
    .line 88
    .line 89
    const/high16 v23, 0x40a00000    # 5.0f

    .line 90
    .line 91
    const v24, 0x4121999a    # 10.1f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v25, 0x40e00000    # 7.0f

    .line 100
    .line 101
    const/high16 v26, 0x40e00000    # 7.0f

    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const v22, 0x40770a3d    # 3.86f

    .line 106
    .line 107
    .line 108
    const v23, 0x4048f5c3    # 3.14f

    .line 109
    .line 110
    .line 111
    const/high16 v24, 0x40e00000    # 7.0f

    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v25, 0x409e6666    # 4.95f

    .line 117
    .line 118
    .line 119
    const v26, -0x3ffccccd    # -2.05f

    .line 120
    .line 121
    .line 122
    const v21, 0x3fef5c29    # 1.87f

    .line 123
    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const v23, 0x406851ec    # 3.63f

    .line 128
    .line 129
    .line 130
    const v24, -0x40c51eb8    # -0.73f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, 0x41980000    # 19.0f

    .line 137
    .line 138
    const/high16 v26, 0x41400000    # 12.0f

    .line 139
    .line 140
    const v21, 0x419228f6    # 18.27f

    .line 141
    .line 142
    .line 143
    const v22, 0x417a147b    # 15.63f

    .line 144
    .line 145
    .line 146
    const/high16 v23, 0x41980000    # 19.0f

    .line 147
    .line 148
    const v24, 0x415deb85    # 13.87f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x40a00000    # 5.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, -0x3f200000    # -7.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v25, 0x40e33333    # 7.1f

    .line 165
    .line 166
    .line 167
    const v26, 0x40e051ec    # 7.01f

    .line 168
    .line 169
    .line 170
    const v21, 0x41228f5c    # 10.16f

    .line 171
    .line 172
    .line 173
    const/high16 v22, 0x40a00000    # 5.0f

    .line 174
    .line 175
    const v23, 0x4106b852    # 8.42f

    .line 176
    .line 177
    .line 178
    const v24, 0x40b6b852    # 5.71f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v4, 0x415e147b    # 13.88f

    .line 188
    .line 189
    .line 190
    const v6, 0x40e3d70a    # 7.12f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v25, 0x3d23d70a    # 0.04f

    .line 197
    .line 198
    .line 199
    const v26, 0x3f051eb8    # 0.52f

    .line 200
    .line 201
    .line 202
    const v21, 0x3e0f5c29    # 0.14f

    .line 203
    .line 204
    .line 205
    const v22, 0x3e0f5c29    # 0.14f

    .line 206
    .line 207
    .line 208
    const v23, 0x3e23d70a    # 0.16f

    .line 209
    .line 210
    .line 211
    const v24, 0x3eb851ec    # 0.36f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, 0x40551eb8    # 3.33f

    .line 218
    .line 219
    .line 220
    const v6, -0x3fe3d70a    # -2.44f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v4, 0x3ecccccd    # 0.4f

    .line 227
    .line 228
    .line 229
    const v6, 0x4081999a    # 4.05f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v25, 0x3e99999a    # 0.3f

    .line 236
    .line 237
    .line 238
    const v26, 0x3f63d70a    # 0.89f

    .line 239
    .line 240
    .line 241
    const v21, 0x3ee147ae    # 0.44f

    .line 242
    .line 243
    .line 244
    const v22, 0x3d23d70a    # 0.04f

    .line 245
    .line 246
    .line 247
    const v23, 0x3f2147ae    # 0.63f

    .line 248
    .line 249
    .line 250
    const v24, 0x3f170a3d    # 0.59f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v4, 0x409428f6    # 4.63f

    .line 257
    .line 258
    .line 259
    const v6, -0x3f5ae148    # -5.16f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v25, -0x40f0a3d7    # -0.56f

    .line 266
    .line 267
    .line 268
    const v26, -0x43dc28f6    # -0.01f

    .line 269
    .line 270
    .line 271
    const v21, -0x41dc28f6    # -0.16f

    .line 272
    .line 273
    .line 274
    const v22, 0x3e19999a    # 0.15f

    .line 275
    .line 276
    .line 277
    const v23, -0x412e147b    # -0.41f

    .line 278
    .line 279
    .line 280
    const v24, 0x3e0f5c29    # 0.14f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v25, -0x42dc28f6    # -0.04f

    .line 287
    .line 288
    .line 289
    const v26, -0x40fae148    # -0.52f

    .line 290
    .line 291
    .line 292
    const v21, -0x41f0a3d7    # -0.14f

    .line 293
    .line 294
    .line 295
    const v22, -0x41f0a3d7    # -0.14f

    .line 296
    .line 297
    .line 298
    const v23, -0x41dc28f6    # -0.16f

    .line 299
    .line 300
    .line 301
    const v24, -0x4147ae14    # -0.36f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v4, -0x3faae148    # -3.33f

    .line 308
    .line 309
    .line 310
    const v6, 0x401c28f6    # 2.44f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v4, -0x41333333    # -0.4f

    .line 317
    .line 318
    .line 319
    const v6, -0x3f7e6666    # -4.05f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v25, -0x41666666    # -0.3f

    .line 326
    .line 327
    .line 328
    const v26, -0x409c28f6    # -0.89f

    .line 329
    .line 330
    .line 331
    const v21, -0x411eb852    # -0.44f

    .line 332
    .line 333
    .line 334
    const v22, -0x42dc28f6    # -0.04f

    .line 335
    .line 336
    .line 337
    const v23, -0x40deb852    # -0.63f

    .line 338
    .line 339
    .line 340
    const v24, -0x40e8f5c3    # -0.59f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, -0x3f6bd70a    # -4.63f

    .line 347
    .line 348
    .line 349
    const v6, 0x40a51eb8    # 5.16f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v25, 0x415e147b    # 13.88f

    .line 356
    .line 357
    .line 358
    const v26, 0x40e3d70a    # 7.12f

    .line 359
    .line 360
    .line 361
    const v21, 0x4157ae14    # 13.48f

    .line 362
    .line 363
    .line 364
    const v22, 0x40deb852    # 6.96f

    .line 365
    .line 366
    .line 367
    const v23, 0x415bae14    # 13.73f

    .line 368
    .line 369
    .line 370
    const v24, 0x40df0a3d    # 6.97f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    const/16 v16, 0x3800

    .line 384
    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    const v6, 0x3e99999a    # 0.3f

    .line 388
    .line 389
    .line 390
    const v8, 0x3e99999a    # 0.3f

    .line 391
    .line 392
    .line 393
    const/4 v7, 0x0

    .line 394
    const/high16 v9, 0x3f800000    # 1.0f

    .line 395
    .line 396
    const/high16 v12, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/4 v13, 0x0

    .line 399
    const/4 v14, 0x0

    .line 400
    const/4 v15, 0x0

    .line 401
    const-string v4, ""

    .line 402
    .line 403
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 404
    .line 405
    .line 406
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 411
    .line 412
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 413
    .line 414
    .line 415
    move-result-wide v6

    .line 416
    const/4 v2, 0x0

    .line 417
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 421
    .line 422
    .line 423
    move-result v10

    .line 424
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 425
    .line 426
    .line 427
    move-result v11

    .line 428
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    const/high16 v4, 0x40400000    # 3.0f

    .line 434
    .line 435
    const/high16 v6, 0x41400000    # 12.0f

    .line 436
    .line 437
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const/high16 v25, 0x41400000    # 12.0f

    .line 441
    .line 442
    const/high16 v26, 0x40400000    # 3.0f

    .line 443
    .line 444
    const/high16 v21, 0x41400000    # 12.0f

    .line 445
    .line 446
    const/high16 v22, 0x40400000    # 3.0f

    .line 447
    .line 448
    const/high16 v23, 0x41400000    # 12.0f

    .line 449
    .line 450
    const/high16 v24, 0x40400000    # 3.0f

    .line 451
    .line 452
    move-object/from16 v20, v2

    .line 453
    .line 454
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v25, -0x3ef00000    # -9.0f

    .line 458
    .line 459
    const/high16 v26, 0x41100000    # 9.0f

    .line 460
    .line 461
    const v21, -0x3f666666    # -4.8f

    .line 462
    .line 463
    .line 464
    const/16 v22, 0x0

    .line 465
    .line 466
    const/high16 v23, -0x3ef00000    # -9.0f

    .line 467
    .line 468
    const v24, 0x40770a3d    # 3.86f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v25, 0x3ffc28f6    # 1.97f

    .line 475
    .line 476
    .line 477
    const v26, 0x40b3851f    # 5.61f

    .line 478
    .line 479
    .line 480
    const/16 v21, 0x0

    .line 481
    .line 482
    const v22, 0x4007ae14    # 2.12f

    .line 483
    .line 484
    .line 485
    const v23, 0x3f3d70a4    # 0.74f

    .line 486
    .line 487
    .line 488
    const v24, 0x40823d71    # 4.07f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v4, 0x419cb852    # 19.59f

    .line 495
    .line 496
    .line 497
    const/high16 v6, 0x40400000    # 3.0f

    .line 498
    .line 499
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v4, 0x408d1eb8    # 4.41f

    .line 503
    .line 504
    .line 505
    const/high16 v6, 0x41a80000    # 21.0f

    .line 506
    .line 507
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v4, 0x3ffc28f6    # 1.97f

    .line 511
    .line 512
    .line 513
    const v6, -0x4003d70a    # -1.97f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v25, 0x41400000    # 12.0f

    .line 520
    .line 521
    const/high16 v26, 0x41a80000    # 21.0f

    .line 522
    .line 523
    const v21, 0x40fdc28f    # 7.93f

    .line 524
    .line 525
    .line 526
    const v22, 0x41a2147b    # 20.26f

    .line 527
    .line 528
    .line 529
    const v23, 0x411e147b    # 9.88f

    .line 530
    .line 531
    .line 532
    const/high16 v24, 0x41a80000    # 21.0f

    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v25, 0x40cb851f    # 6.36f

    .line 538
    .line 539
    .line 540
    const v26, -0x3fd70a3d    # -2.64f

    .line 541
    .line 542
    .line 543
    const v21, 0x40133333    # 2.3f

    .line 544
    .line 545
    .line 546
    const/16 v22, 0x0

    .line 547
    .line 548
    const v23, 0x4093851f    # 4.61f

    .line 549
    .line 550
    .line 551
    const v24, -0x409eb852    # -0.88f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v25, 0x41a80000    # 21.0f

    .line 558
    .line 559
    const/high16 v26, 0x41400000    # 12.0f

    .line 560
    .line 561
    const v21, 0x41a0f5c3    # 20.12f

    .line 562
    .line 563
    .line 564
    const v22, 0x4184e148    # 16.61f

    .line 565
    .line 566
    .line 567
    const/high16 v23, 0x41a80000    # 21.0f

    .line 568
    .line 569
    const v24, 0x4164cccd    # 14.3f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v4, 0x40400000    # 3.0f

    .line 576
    .line 577
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v4, 0x41400000    # 12.0f

    .line 581
    .line 582
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v4, 0x41980000    # 19.0f

    .line 589
    .line 590
    const/high16 v6, 0x41400000    # 12.0f

    .line 591
    .line 592
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v25, -0x3ffccccd    # -2.05f

    .line 596
    .line 597
    .line 598
    const v26, 0x409e6666    # 4.95f

    .line 599
    .line 600
    .line 601
    const/16 v21, 0x0

    .line 602
    .line 603
    const v22, 0x3fef5c29    # 1.87f

    .line 604
    .line 605
    .line 606
    const v23, -0x40c51eb8    # -0.73f

    .line 607
    .line 608
    .line 609
    const v24, 0x406851ec    # 3.63f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v25, 0x41400000    # 12.0f

    .line 616
    .line 617
    const/high16 v26, 0x41980000    # 19.0f

    .line 618
    .line 619
    const v21, 0x417a147b    # 15.63f

    .line 620
    .line 621
    .line 622
    const v22, 0x419228f6    # 18.27f

    .line 623
    .line 624
    .line 625
    const v23, 0x415deb85    # 13.87f

    .line 626
    .line 627
    .line 628
    const/high16 v24, 0x41980000    # 19.0f

    .line 629
    .line 630
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v25, -0x3f200000    # -7.0f

    .line 634
    .line 635
    const/high16 v26, -0x3f200000    # -7.0f

    .line 636
    .line 637
    const v21, -0x3f88f5c3    # -3.86f

    .line 638
    .line 639
    .line 640
    const/16 v22, 0x0

    .line 641
    .line 642
    const/high16 v23, -0x3f200000    # -7.0f

    .line 643
    .line 644
    const v24, -0x3fb70a3d    # -3.14f

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v25, 0x40066666    # 2.1f

    .line 651
    .line 652
    .line 653
    const v26, -0x3f6051ec    # -4.99f

    .line 654
    .line 655
    .line 656
    const/16 v21, 0x0

    .line 657
    .line 658
    const v22, -0x400ccccd    # -1.9f

    .line 659
    .line 660
    .line 661
    const v23, 0x3f3d70a4    # 0.74f

    .line 662
    .line 663
    .line 664
    const v24, -0x3f947ae1    # -3.68f

    .line 665
    .line 666
    .line 667
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v25, 0x41400000    # 12.0f

    .line 671
    .line 672
    const/high16 v26, 0x40a00000    # 5.0f

    .line 673
    .line 674
    const v21, 0x4106b852    # 8.42f

    .line 675
    .line 676
    .line 677
    const v22, 0x40b6b852    # 5.71f

    .line 678
    .line 679
    .line 680
    const v23, 0x41228f5c    # 10.16f

    .line 681
    .line 682
    .line 683
    const/high16 v24, 0x40a00000    # 5.0f

    .line 684
    .line 685
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v4, 0x40e00000    # 7.0f

    .line 689
    .line 690
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v4, 0x41400000    # 12.0f

    .line 694
    .line 695
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    const/high16 v6, 0x3f800000    # 1.0f

    .line 706
    .line 707
    const/high16 v8, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v7, 0x0

    .line 710
    const-string v4, ""

    .line 711
    .line 712
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 713
    .line 714
    .line 715
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 720
    .line 721
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 722
    .line 723
    .line 724
    move-result-wide v6

    .line 725
    const/4 v0, 0x0

    .line 726
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 730
    .line 731
    .line 732
    move-result v10

    .line 733
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 734
    .line 735
    .line 736
    move-result v11

    .line 737
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 740
    .line 741
    .line 742
    const v0, 0x41075c29    # 8.46f

    .line 743
    .line 744
    .line 745
    const v2, 0x414a147b    # 12.63f

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const v0, 0x3ecccccd    # 0.4f

    .line 752
    .line 753
    .line 754
    const v2, 0x4081999a    # 4.05f

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v0, 0x40551eb8    # 3.33f

    .line 761
    .line 762
    .line 763
    const v2, -0x3fe3d70a    # -2.44f

    .line 764
    .line 765
    .line 766
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v17, 0x3d23d70a    # 0.04f

    .line 770
    .line 771
    .line 772
    const v18, 0x3f051eb8    # 0.52f

    .line 773
    .line 774
    .line 775
    const v13, -0x421eb852    # -0.11f

    .line 776
    .line 777
    .line 778
    const v14, 0x3e23d70a    # 0.16f

    .line 779
    .line 780
    .line 781
    const v15, -0x42333333    # -0.1f

    .line 782
    .line 783
    .line 784
    const v16, 0x3ec28f5c    # 0.38f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v17, 0x3f0f5c29    # 0.56f

    .line 791
    .line 792
    .line 793
    const v18, 0x3c23d70a    # 0.01f

    .line 794
    .line 795
    .line 796
    const v13, 0x3e19999a    # 0.15f

    .line 797
    .line 798
    .line 799
    const v14, 0x3e19999a    # 0.15f

    .line 800
    .line 801
    .line 802
    const v15, 0x3ecccccd    # 0.4f

    .line 803
    .line 804
    .line 805
    const v16, 0x3e23d70a    # 0.16f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v0, -0x3f6bd70a    # -4.63f

    .line 812
    .line 813
    .line 814
    const v2, 0x40a51eb8    # 5.16f

    .line 815
    .line 816
    .line 817
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const v17, -0x41666666    # -0.3f

    .line 821
    .line 822
    .line 823
    const v18, -0x409c28f6    # -0.89f

    .line 824
    .line 825
    .line 826
    const v13, 0x3ea8f5c3    # 0.33f

    .line 827
    .line 828
    .line 829
    const v14, -0x41666666    # -0.3f

    .line 830
    .line 831
    .line 832
    const v15, 0x3e19999a    # 0.15f

    .line 833
    .line 834
    .line 835
    const v16, -0x40a66666    # -0.85f

    .line 836
    .line 837
    .line 838
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v0, -0x41333333    # -0.4f

    .line 842
    .line 843
    .line 844
    const v2, -0x3f7e6666    # -4.05f

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const v0, -0x3faae148    # -3.33f

    .line 851
    .line 852
    .line 853
    const v2, 0x401c28f6    # 2.44f

    .line 854
    .line 855
    .line 856
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v17, -0x42dc28f6    # -0.04f

    .line 860
    .line 861
    .line 862
    const v18, -0x40fae148    # -0.52f

    .line 863
    .line 864
    .line 865
    const v13, 0x3de147ae    # 0.11f

    .line 866
    .line 867
    .line 868
    const v14, -0x41dc28f6    # -0.16f

    .line 869
    .line 870
    .line 871
    const v15, 0x3dcccccd    # 0.1f

    .line 872
    .line 873
    .line 874
    const v16, -0x413d70a4    # -0.38f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v17, -0x40f0a3d7    # -0.56f

    .line 881
    .line 882
    .line 883
    const v18, -0x43dc28f6    # -0.01f

    .line 884
    .line 885
    .line 886
    const v13, -0x41e66666    # -0.15f

    .line 887
    .line 888
    .line 889
    const v14, -0x41e66666    # -0.15f

    .line 890
    .line 891
    .line 892
    const v15, -0x41333333    # -0.4f

    .line 893
    .line 894
    .line 895
    const v16, -0x41dc28f6    # -0.16f

    .line 896
    .line 897
    .line 898
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const v0, 0x409428f6    # 4.63f

    .line 902
    .line 903
    .line 904
    const v2, -0x3f5ae148    # -5.16f

    .line 905
    .line 906
    .line 907
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const v17, 0x41075c29    # 8.46f

    .line 911
    .line 912
    .line 913
    const v18, 0x414a147b    # 12.63f

    .line 914
    .line 915
    .line 916
    const v13, 0x40fae148    # 7.84f

    .line 917
    .line 918
    .line 919
    const v14, 0x4140a3d7    # 12.04f

    .line 920
    .line 921
    .line 922
    const v15, 0x410051ec    # 8.02f

    .line 923
    .line 924
    .line 925
    const v16, 0x414970a4    # 12.59f

    .line 926
    .line 927
    .line 928
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    const/16 v16, 0x3800

    .line 939
    .line 940
    const/16 v17, 0x0

    .line 941
    .line 942
    const/high16 v6, 0x3f800000    # 1.0f

    .line 943
    .line 944
    const/4 v7, 0x0

    .line 945
    const/high16 v12, 0x3f800000    # 1.0f

    .line 946
    .line 947
    const/4 v13, 0x0

    .line 948
    const/4 v14, 0x0

    .line 949
    const/4 v15, 0x0

    .line 950
    const-string v4, ""

    .line 951
    .line 952
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    sput-object v0, Landroidx/compose/material/icons/twotone/EnergySavingsLeafKt;->_energySavingsLeaf:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 961
    .line 962
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    return-object v0
.end method

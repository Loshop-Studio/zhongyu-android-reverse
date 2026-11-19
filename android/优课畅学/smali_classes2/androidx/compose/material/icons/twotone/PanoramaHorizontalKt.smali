.class public final Landroidx/compose/material/icons/twotone/PanoramaHorizontalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaHorizontal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaHorizontal(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PanoramaHorizontalKt;->_panoramaHorizontal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PanoramaHorizontal"

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
    const v6, 0x40d147ae    # 6.54f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x412e8f5c    # 10.91f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const/high16 v25, 0x41000000    # 8.0f

    .line 85
    .line 86
    const v26, -0x406b851f    # -1.16f

    .line 87
    .line 88
    .line 89
    const v21, 0x40266666    # 2.6f

    .line 90
    .line 91
    .line 92
    const v22, -0x40bae148    # -0.77f

    .line 93
    .line 94
    .line 95
    const v23, 0x40a8f5c3    # 5.28f

    .line 96
    .line 97
    .line 98
    const v24, -0x406b851f    # -1.16f

    .line 99
    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x40accccd    # 5.4f

    .line 107
    .line 108
    .line 109
    const/high16 v6, 0x41000000    # 8.0f

    .line 110
    .line 111
    const v7, 0x3f947ae1    # 1.16f

    .line 112
    .line 113
    .line 114
    const v8, 0x3ec7ae14    # 0.39f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v4, v8, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, 0x40d147ae    # 6.54f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, -0x3f000000    # -8.0f

    .line 127
    .line 128
    const v26, 0x3f947ae1    # 1.16f

    .line 129
    .line 130
    .line 131
    const v21, -0x3fd9999a    # -2.6f

    .line 132
    .line 133
    .line 134
    const v22, 0x3f47ae14    # 0.78f

    .line 135
    .line 136
    .line 137
    const v23, -0x3f570a3d    # -5.28f

    .line 138
    .line 139
    .line 140
    const v24, 0x3f95c28f    # 1.17f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v26, -0x406b851f    # -1.16f

    .line 147
    .line 148
    .line 149
    const v21, -0x3fd1eb85    # -2.72f

    .line 150
    .line 151
    .line 152
    const/16 v22, 0x0

    .line 153
    .line 154
    const v23, -0x3f533333    # -5.4f

    .line 155
    .line 156
    .line 157
    const v24, -0x413851ec    # -0.39f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const/16 v16, 0x3800

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const v6, 0x3e99999a    # 0.3f

    .line 175
    .line 176
    .line 177
    const v8, 0x3e99999a    # 0.3f

    .line 178
    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    const/high16 v9, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v12, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    const-string v4, ""

    .line 189
    .line 190
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 191
    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    const/4 v0, 0x0

    .line 204
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const v0, 0x41ab70a4    # 21.43f

    .line 221
    .line 222
    .line 223
    const/high16 v2, 0x40800000    # 4.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, -0x416147ae    # -0.31f

    .line 229
    .line 230
    .line 231
    const v18, 0x3d75c28f    # 0.06f

    .line 232
    .line 233
    .line 234
    const v13, -0x42333333    # -0.1f

    .line 235
    .line 236
    .line 237
    const v15, -0x41b33333    # -0.2f

    .line 238
    .line 239
    .line 240
    const v16, 0x3ca3d70a    # 0.02f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v17, 0x41400000    # 12.0f

    .line 247
    .line 248
    const v18, 0x40b66666    # 5.7f

    .line 249
    .line 250
    .line 251
    const v13, 0x419170a4    # 18.18f

    .line 252
    .line 253
    .line 254
    const v14, 0x40a51eb8    # 5.16f

    .line 255
    .line 256
    .line 257
    const v15, 0x417170a4    # 15.09f

    .line 258
    .line 259
    .line 260
    const v16, 0x40b66666    # 5.7f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, -0x3eee147b    # -9.12f

    .line 267
    .line 268
    .line 269
    const v2, -0x402e147b    # -1.64f

    .line 270
    .line 271
    .line 272
    const v4, -0x3f3a3d71    # -6.18f

    .line 273
    .line 274
    .line 275
    const v6, -0x40f33333    # -0.55f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, 0x40247ae1    # 2.57f

    .line 282
    .line 283
    .line 284
    const/high16 v18, 0x40800000    # 4.0f

    .line 285
    .line 286
    const v13, 0x403147ae    # 2.77f

    .line 287
    .line 288
    .line 289
    const v14, 0x4080a3d7    # 4.02f

    .line 290
    .line 291
    .line 292
    const v15, 0x402a3d71    # 2.66f

    .line 293
    .line 294
    .line 295
    const/high16 v16, 0x40800000    # 4.0f

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, -0x40ee147b    # -0.57f

    .line 301
    .line 302
    .line 303
    const v18, 0x3f2147ae    # 0.63f

    .line 304
    .line 305
    .line 306
    const v13, -0x4151eb85    # -0.34f

    .line 307
    .line 308
    .line 309
    const/4 v14, 0x0

    .line 310
    const v15, -0x40ee147b    # -0.57f

    .line 311
    .line 312
    .line 313
    const v16, 0x3e6b851f    # 0.23f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x416c0000    # 14.75f

    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, 0x3f11eb85    # 0.57f

    .line 325
    .line 326
    .line 327
    const v18, 0x3f1eb852    # 0.62f

    .line 328
    .line 329
    .line 330
    const/4 v13, 0x0

    .line 331
    const v14, 0x3ec7ae14    # 0.39f

    .line 332
    .line 333
    .line 334
    const v15, 0x3e6b851f    # 0.23f

    .line 335
    .line 336
    .line 337
    const v16, 0x3f1eb852    # 0.62f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x3e9eb852    # 0.31f

    .line 344
    .line 345
    .line 346
    const v18, -0x428a3d71    # -0.06f

    .line 347
    .line 348
    .line 349
    const v13, 0x3dcccccd    # 0.1f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const v15, 0x3e4ccccd    # 0.2f

    .line 354
    .line 355
    .line 356
    const v16, -0x435c28f6    # -0.02f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v17, 0x4111eb85    # 9.12f

    .line 363
    .line 364
    .line 365
    const v18, -0x402e147b    # -1.64f

    .line 366
    .line 367
    .line 368
    const v13, 0x403c28f6    # 2.94f

    .line 369
    .line 370
    .line 371
    const v14, -0x40733333    # -1.1f

    .line 372
    .line 373
    .line 374
    const v15, 0x40c0f5c3    # 6.03f

    .line 375
    .line 376
    .line 377
    const v16, -0x402e147b    # -1.64f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v0, 0x4111eb85    # 9.12f

    .line 384
    .line 385
    .line 386
    const v2, 0x3fd1eb85    # 1.64f

    .line 387
    .line 388
    .line 389
    const v4, 0x40c5c28f    # 6.18f

    .line 390
    .line 391
    .line 392
    const v6, 0x3f0ccccd    # 0.55f

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v17, 0x3e9eb852    # 0.31f

    .line 399
    .line 400
    .line 401
    const v18, 0x3d75c28f    # 0.06f

    .line 402
    .line 403
    .line 404
    const v13, 0x3de147ae    # 0.11f

    .line 405
    .line 406
    .line 407
    const v14, 0x3d23d70a    # 0.04f

    .line 408
    .line 409
    .line 410
    const v15, 0x3e570a3d    # 0.21f

    .line 411
    .line 412
    .line 413
    const v16, 0x3d75c28f    # 0.06f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x3f11eb85    # 0.57f

    .line 420
    .line 421
    .line 422
    const v18, -0x40deb852    # -0.63f

    .line 423
    .line 424
    .line 425
    const v13, 0x3ea8f5c3    # 0.33f

    .line 426
    .line 427
    .line 428
    const/4 v14, 0x0

    .line 429
    const v15, 0x3f11eb85    # 0.57f

    .line 430
    .line 431
    .line 432
    const v16, -0x41947ae1    # -0.23f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, 0x409428f6    # 4.63f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, -0x40ee147b    # -0.57f

    .line 445
    .line 446
    .line 447
    const/4 v13, 0x0

    .line 448
    const v14, -0x41333333    # -0.4f

    .line 449
    .line 450
    .line 451
    const v15, -0x418a3d71    # -0.24f

    .line 452
    .line 453
    .line 454
    const v16, -0x40deb852    # -0.63f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v0, 0x41a00000    # 20.0f

    .line 464
    .line 465
    const v2, 0x418b999a    # 17.45f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, -0x3f000000    # -8.0f

    .line 472
    .line 473
    const v18, -0x406b851f    # -1.16f

    .line 474
    .line 475
    .line 476
    const v13, -0x3fd9999a    # -2.6f

    .line 477
    .line 478
    .line 479
    const v14, -0x40bae148    # -0.77f

    .line 480
    .line 481
    .line 482
    const v15, -0x3f570a3d    # -5.28f

    .line 483
    .line 484
    .line 485
    const v16, -0x406b851f    # -1.16f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, -0x3f533333    # -5.4f

    .line 492
    .line 493
    .line 494
    const/high16 v2, -0x3f000000    # -8.0f

    .line 495
    .line 496
    const v4, 0x3f947ae1    # 1.16f

    .line 497
    .line 498
    .line 499
    const v6, 0x3ec7ae14    # 0.39f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0, v6, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x40d147ae    # 6.54f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v17, 0x41000000    # 8.0f

    .line 512
    .line 513
    const v18, 0x3f947ae1    # 1.16f

    .line 514
    .line 515
    .line 516
    const v13, 0x40266666    # 2.6f

    .line 517
    .line 518
    .line 519
    const v14, 0x3f451eb8    # 0.77f

    .line 520
    .line 521
    .line 522
    const v15, 0x40a8f5c3    # 5.28f

    .line 523
    .line 524
    .line 525
    const v16, 0x3f947ae1    # 1.16f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v18, -0x406b851f    # -1.16f

    .line 532
    .line 533
    .line 534
    const v13, 0x402e147b    # 2.72f

    .line 535
    .line 536
    .line 537
    const v14, 0x3c23d70a    # 0.01f

    .line 538
    .line 539
    .line 540
    const v15, 0x40accccd    # 5.4f

    .line 541
    .line 542
    .line 543
    const v16, -0x413d70a4    # -0.38f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x412e8f5c    # 10.91f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    const/16 v16, 0x3800

    .line 563
    .line 564
    const/16 v17, 0x0

    .line 565
    .line 566
    const/high16 v6, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/high16 v8, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/4 v7, 0x0

    .line 571
    const/high16 v12, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v13, 0x0

    .line 574
    const/4 v14, 0x0

    .line 575
    const/4 v15, 0x0

    .line 576
    const-string v4, ""

    .line 577
    .line 578
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    sput-object v0, Landroidx/compose/material/icons/twotone/PanoramaHorizontalKt;->_panoramaHorizontal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 587
    .line 588
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    return-object v0
.end method

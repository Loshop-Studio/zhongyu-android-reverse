.class public final Landroidx/compose/material/icons/twotone/EcoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _eco:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEco(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/EcoKt;->_eco:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Eco"

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
    const v4, 0x40eeb852    # 7.46f

    .line 71
    .line 72
    .line 73
    const v6, 0x41175c29    # 9.46f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x40e0f5c3    # 7.03f

    .line 80
    .line 81
    .line 82
    const/high16 v26, 0x41800000    # 16.0f

    .line 83
    .line 84
    const v21, 0x40b5c28f    # 5.68f

    .line 85
    .line 86
    .line 87
    const/high16 v22, 0x41340000    # 11.25f

    .line 88
    .line 89
    const v23, 0x40b1999a    # 5.55f

    .line 90
    .line 91
    .line 92
    const v24, 0x4160a3d7    # 14.04f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, 0x40cbd70a    # 6.37f

    .line 101
    .line 102
    .line 103
    const/high16 v26, -0x3f400000    # -6.0f

    .line 104
    .line 105
    const v21, 0x3fc3d70a    # 1.53f

    .line 106
    .line 107
    .line 108
    const v22, -0x3fdd70a4    # -2.54f

    .line 109
    .line 110
    .line 111
    const v23, 0x406eb852    # 3.73f

    .line 112
    .line 113
    .line 114
    const v24, -0x3f6b851f    # -4.64f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v25, -0x3f63d70a    # -4.88f

    .line 121
    .line 122
    .line 123
    const v26, 0x40ea3d71    # 7.32f

    .line 124
    .line 125
    .line 126
    const v21, -0x3fef5c29    # -2.26f

    .line 127
    .line 128
    .line 129
    const v22, 0x3ff47ae1    # 1.91f

    .line 130
    .line 131
    .line 132
    const v23, -0x3f833333    # -3.95f

    .line 133
    .line 134
    .line 135
    const v24, 0x408e147b    # 4.44f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, 0x41300000    # 11.0f

    .line 142
    .line 143
    const/high16 v26, 0x41900000    # 18.0f

    .line 144
    .line 145
    const v21, 0x411451ec    # 9.27f

    .line 146
    .line 147
    .line 148
    const/high16 v22, 0x418e0000    # 17.75f

    .line 149
    .line 150
    const v23, 0x4121c28f    # 10.11f

    .line 151
    .line 152
    .line 153
    const/high16 v24, 0x41900000    # 18.0f

    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v25, 0x40628f5c    # 3.54f

    .line 159
    .line 160
    .line 161
    const v26, -0x40451eb8    # -1.46f

    .line 162
    .line 163
    .line 164
    const v21, 0x3fab851f    # 1.34f

    .line 165
    .line 166
    .line 167
    const/16 v22, 0x0

    .line 168
    .line 169
    const v23, 0x4025c28f    # 2.59f

    .line 170
    .line 171
    .line 172
    const v24, -0x40fae148    # -0.52f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v25, 0x4050a3d7    # 3.26f

    .line 179
    .line 180
    .line 181
    const v26, -0x3edab852    # -10.33f

    .line 182
    .line 183
    .line 184
    const v21, 0x3fdeb852    # 1.74f

    .line 185
    .line 186
    .line 187
    const v22, -0x402147ae    # -1.74f

    .line 188
    .line 189
    .line 190
    const v23, 0x4033d70a    # 2.81f

    .line 191
    .line 192
    .line 193
    const v24, -0x3f2dc28f    # -6.57f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v25, 0x40eeb852    # 7.46f

    .line 200
    .line 201
    .line 202
    const v26, 0x41175c29    # 9.46f

    .line 203
    .line 204
    .line 205
    const v21, 0x4160a3d7    # 14.04f

    .line 206
    .line 207
    .line 208
    const v22, 0x40d4cccd    # 6.65f

    .line 209
    .line 210
    .line 211
    const v23, 0x41135c29    # 9.21f

    .line 212
    .line 213
    .line 214
    const v24, 0x40f70a3d    # 7.72f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    const/16 v16, 0x3800

    .line 228
    .line 229
    const/16 v17, 0x0

    .line 230
    .line 231
    const v6, 0x3e99999a    # 0.3f

    .line 232
    .line 233
    .line 234
    const v8, 0x3e99999a    # 0.3f

    .line 235
    .line 236
    .line 237
    const/4 v7, 0x0

    .line 238
    const/high16 v9, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/high16 v12, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const-string v4, ""

    .line 246
    .line 247
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 248
    .line 249
    .line 250
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 255
    .line 256
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 257
    .line 258
    .line 259
    move-result-wide v6

    .line 260
    const/4 v0, 0x0

    .line 261
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 269
    .line 270
    .line 271
    move-result v11

    .line 272
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 275
    .line 276
    .line 277
    const v0, 0x4100cccd    # 8.05f

    .line 278
    .line 279
    .line 280
    const v2, 0x40c1999a    # 6.05f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const v18, 0x411e6666    # 9.9f

    .line 289
    .line 290
    .line 291
    const v13, -0x3fd147ae    # -2.73f

    .line 292
    .line 293
    .line 294
    const v14, 0x402eb852    # 2.73f

    .line 295
    .line 296
    .line 297
    const v15, -0x3fd147ae    # -2.73f

    .line 298
    .line 299
    .line 300
    const v16, 0x40e570a4    # 7.17f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v17, 0x41300000    # 11.0f

    .line 307
    .line 308
    const/high16 v18, 0x41a00000    # 20.0f

    .line 309
    .line 310
    const v13, 0x40ed70a4    # 7.42f

    .line 311
    .line 312
    .line 313
    const v14, 0x419a8f5c    # 19.32f

    .line 314
    .line 315
    .line 316
    const v15, 0x41135c29    # 9.21f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x41a00000    # 20.0f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x409e6666    # 4.95f

    .line 325
    .line 326
    .line 327
    const v2, -0x3ffccccd    # -2.05f

    .line 328
    .line 329
    .line 330
    const v4, 0x40651eb8    # 3.58f

    .line 331
    .line 332
    .line 333
    const v6, -0x40d1eb85    # -0.68f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v17, 0x41a00000    # 20.0f

    .line 340
    .line 341
    const/high16 v18, 0x40800000    # 4.0f

    .line 342
    .line 343
    const v13, 0x419b70a4    # 19.43f

    .line 344
    .line 345
    .line 346
    const v14, 0x4167851f    # 14.47f

    .line 347
    .line 348
    .line 349
    const/high16 v15, 0x41a00000    # 20.0f

    .line 350
    .line 351
    const/high16 v16, 0x40800000    # 4.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v0, 0x41187ae1    # 9.53f

    .line 357
    .line 358
    .line 359
    const v2, 0x40923d71    # 4.57f

    .line 360
    .line 361
    .line 362
    const v4, 0x4100cccd    # 8.05f

    .line 363
    .line 364
    .line 365
    const v6, 0x40c1999a    # 6.05f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x4168a3d7    # 14.54f

    .line 375
    .line 376
    .line 377
    const v2, 0x418451ec    # 16.54f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v17, 0x41300000    # 11.0f

    .line 384
    .line 385
    const/high16 v18, 0x41900000    # 18.0f

    .line 386
    .line 387
    const v13, 0x415970a4    # 13.59f

    .line 388
    .line 389
    .line 390
    const v14, 0x418bd70a    # 17.48f

    .line 391
    .line 392
    .line 393
    const v15, 0x414570a4    # 12.34f

    .line 394
    .line 395
    .line 396
    const/high16 v16, 0x41900000    # 18.0f

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, -0x3fe147ae    # -2.48f

    .line 402
    .line 403
    .line 404
    const v18, -0x40d1eb85    # -0.68f

    .line 405
    .line 406
    .line 407
    const v13, -0x409c28f6    # -0.89f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const v15, -0x40228f5c    # -1.73f

    .line 412
    .line 413
    .line 414
    const/high16 v16, -0x41800000    # -0.25f

    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x409c28f6    # 4.88f

    .line 420
    .line 421
    .line 422
    const v18, -0x3f15c28f    # -7.32f

    .line 423
    .line 424
    .line 425
    const v13, 0x3f6b851f    # 0.92f

    .line 426
    .line 427
    .line 428
    const v14, -0x3fc7ae14    # -2.88f

    .line 429
    .line 430
    .line 431
    const v15, 0x4027ae14    # 2.62f

    .line 432
    .line 433
    .line 434
    const v16, -0x3f52e148    # -5.41f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, -0x3f3428f6    # -6.37f

    .line 441
    .line 442
    .line 443
    const/high16 v18, 0x40c00000    # 6.0f

    .line 444
    .line 445
    const v13, -0x3fd7ae14    # -2.63f

    .line 446
    .line 447
    .line 448
    const v14, 0x3fae147b    # 1.36f

    .line 449
    .line 450
    .line 451
    const v15, -0x3f651eb8    # -4.84f

    .line 452
    .line 453
    .line 454
    const v16, 0x405d70a4    # 3.46f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x3ee147ae    # 0.44f

    .line 461
    .line 462
    .line 463
    const v18, -0x3f2eb852    # -6.54f

    .line 464
    .line 465
    .line 466
    const v13, -0x40428f5c    # -1.48f

    .line 467
    .line 468
    .line 469
    const v14, -0x40051eb8    # -1.96f

    .line 470
    .line 471
    .line 472
    const v15, -0x40533333    # -1.35f

    .line 473
    .line 474
    .line 475
    const/high16 v16, -0x3f680000    # -4.75f

    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, 0x418e6666    # 17.8f

    .line 481
    .line 482
    .line 483
    const v18, 0x40c66666    # 6.2f

    .line 484
    .line 485
    .line 486
    const v13, 0x41135c29    # 9.21f

    .line 487
    .line 488
    .line 489
    const v14, 0x40f70a3d    # 7.72f

    .line 490
    .line 491
    .line 492
    const v15, 0x4160a3d7    # 14.04f

    .line 493
    .line 494
    .line 495
    const v16, 0x40d4cccd    # 6.65f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, 0x4168a3d7    # 14.54f

    .line 502
    .line 503
    .line 504
    const v18, 0x418451ec    # 16.54f

    .line 505
    .line 506
    .line 507
    const v13, 0x418acccd    # 17.35f

    .line 508
    .line 509
    .line 510
    const v14, 0x411f5c29    # 9.96f

    .line 511
    .line 512
    .line 513
    const v15, 0x41823d71    # 16.28f

    .line 514
    .line 515
    .line 516
    const v16, 0x416ca3d7    # 14.79f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    const/16 v16, 0x3800

    .line 530
    .line 531
    const/16 v17, 0x0

    .line 532
    .line 533
    const/high16 v6, 0x3f800000    # 1.0f

    .line 534
    .line 535
    const/high16 v8, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/4 v7, 0x0

    .line 538
    const/high16 v12, 0x3f800000    # 1.0f

    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const/4 v14, 0x0

    .line 542
    const/4 v15, 0x0

    .line 543
    const-string v4, ""

    .line 544
    .line 545
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    sput-object v0, Landroidx/compose/material/icons/twotone/EcoKt;->_eco:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 554
    .line 555
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    return-object v0
.end method

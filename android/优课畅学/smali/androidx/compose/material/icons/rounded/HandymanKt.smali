.class public final Landroidx/compose/material/icons/rounded/HandymanKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _handyman:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHandyman(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HandymanKt;->_handyman:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Handyman"

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
    const v4, 0x41ad5c29    # 21.67f

    .line 71
    .line 72
    .line 73
    const v6, 0x41915c29    # 18.17f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3f68f5c3    # -4.72f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v25, -0x4035c28f    # -1.58f

    .line 86
    .line 87
    .line 88
    const v26, -0x40e8f5c3    # -0.59f

    .line 89
    .line 90
    .line 91
    const v21, -0x410a3d71    # -0.48f

    .line 92
    .line 93
    .line 94
    const v22, -0x410a3d71    # -0.48f

    .line 95
    .line 96
    .line 97
    const v23, -0x40828f5c    # -0.99f

    .line 98
    .line 99
    .line 100
    const v24, -0x40e8f5c3    # -0.59f

    .line 101
    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, -0x3fdd70a4    # -2.54f

    .line 109
    .line 110
    .line 111
    const v6, 0x40228f5c    # 2.54f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v25, 0x3f170a3d    # 0.59f

    .line 118
    .line 119
    .line 120
    const v26, 0x3fca3d71    # 1.58f

    .line 121
    .line 122
    .line 123
    const/16 v21, 0x0

    .line 124
    .line 125
    const v22, 0x3f170a3d    # 0.59f

    .line 126
    .line 127
    .line 128
    const v23, 0x3de147ae    # 0.11f

    .line 129
    .line 130
    .line 131
    const v24, 0x3f8e147b    # 1.11f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, 0x40970a3d    # 4.72f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, 0x3fb47ae1    # 1.41f

    .line 144
    .line 145
    .line 146
    const/16 v26, 0x0

    .line 147
    .line 148
    const v21, 0x3ec7ae14    # 0.39f

    .line 149
    .line 150
    .line 151
    const v22, 0x3ec7ae14    # 0.39f

    .line 152
    .line 153
    .line 154
    const v23, 0x3f828f5c    # 1.02f

    .line 155
    .line 156
    .line 157
    const v24, 0x3ec7ae14    # 0.39f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, -0x3ff851ec    # -2.12f

    .line 164
    .line 165
    .line 166
    const v6, 0x4007ae14    # 2.12f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v25, 0x41ad5c29    # 21.67f

    .line 173
    .line 174
    .line 175
    const v26, 0x41915c29    # 18.17f

    .line 176
    .line 177
    .line 178
    const v21, 0x41b07ae1    # 22.06f

    .line 179
    .line 180
    .line 181
    const v22, 0x4199999a    # 19.2f

    .line 182
    .line 183
    .line 184
    const v23, 0x41b07ae1    # 22.06f

    .line 185
    .line 186
    .line 187
    const v24, 0x41947ae1    # 18.56f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/16 v16, 0x3800

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const/high16 v6, 0x3f800000    # 1.0f

    .line 205
    .line 206
    const/high16 v8, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    const/high16 v9, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/high16 v12, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/4 v13, 0x0

    .line 214
    const/4 v14, 0x0

    .line 215
    const/4 v15, 0x0

    .line 216
    const-string v4, ""

    .line 217
    .line 218
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 219
    .line 220
    .line 221
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 226
    .line 227
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 228
    .line 229
    .line 230
    move-result-wide v6

    .line 231
    const/4 v0, 0x0

    .line 232
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    const v0, 0x4117d70a    # 9.49f

    .line 249
    .line 250
    .line 251
    const v2, 0x41850a3d    # 16.63f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, 0x3fb47ae1    # 1.41f

    .line 258
    .line 259
    .line 260
    const/16 v18, 0x0

    .line 261
    .line 262
    const v13, 0x3ec7ae14    # 0.39f

    .line 263
    .line 264
    .line 265
    const v14, 0x3ec7ae14    # 0.39f

    .line 266
    .line 267
    .line 268
    const v15, 0x3f828f5c    # 1.02f

    .line 269
    .line 270
    .line 271
    const v16, 0x3ec7ae14    # 0.39f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v0, -0x40ca3d71    # -0.71f

    .line 278
    .line 279
    .line 280
    const v2, 0x3f35c28f    # 0.71f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x4007ae14    # 2.12f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const v18, -0x3f7851ec    # -4.24f

    .line 295
    .line 296
    .line 297
    const v13, 0x3f95c28f    # 1.17f

    .line 298
    .line 299
    .line 300
    const v14, -0x406a3d71    # -1.17f

    .line 301
    .line 302
    .line 303
    const v15, 0x3f95c28f    # 1.17f

    .line 304
    .line 305
    .line 306
    const v16, -0x3fbb851f    # -3.07f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, -0x3fcae148    # -2.83f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x404b851f    # -1.41f

    .line 319
    .line 320
    .line 321
    const/16 v18, 0x0

    .line 322
    .line 323
    const v13, -0x413851ec    # -0.39f

    .line 324
    .line 325
    .line 326
    const v14, -0x413851ec    # -0.39f

    .line 327
    .line 328
    .line 329
    const v15, -0x407d70a4    # -1.02f

    .line 330
    .line 331
    .line 332
    const v16, -0x413851ec    # -0.39f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, -0x40ca3d71    # -0.71f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v0, 0x40000000    # 2.0f

    .line 345
    .line 346
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, -0x40651eb8    # -1.21f

    .line 350
    .line 351
    .line 352
    const/high16 v18, -0x41000000    # -0.5f

    .line 353
    .line 354
    const/4 v13, 0x0

    .line 355
    const v14, -0x40e147ae    # -0.62f

    .line 356
    .line 357
    .line 358
    const v15, -0x40bd70a4    # -0.76f

    .line 359
    .line 360
    .line 361
    const v16, -0x408ccccd    # -0.95f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, -0x3fdd70a4    # -2.54f

    .line 368
    .line 369
    .line 370
    const v2, 0x40228f5c    # 2.54f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, 0x3f000000    # 0.5f

    .line 377
    .line 378
    const v18, 0x3f9ae148    # 1.21f

    .line 379
    .line 380
    .line 381
    const v13, -0x4119999a    # -0.45f

    .line 382
    .line 383
    .line 384
    const v14, 0x3ee66666    # 0.45f

    .line 385
    .line 386
    .line 387
    const v15, -0x420a3d71    # -0.12f

    .line 388
    .line 389
    .line 390
    const v16, 0x3f9ae148    # 1.21f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x40228f5c    # 2.54f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, -0x40ca3d71    # -0.71f

    .line 403
    .line 404
    .line 405
    const v2, 0x3f35c28f    # 0.71f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/16 v17, 0x0

    .line 412
    .line 413
    const v18, 0x3fb47ae1    # 1.41f

    .line 414
    .line 415
    .line 416
    const v13, -0x413851ec    # -0.39f

    .line 417
    .line 418
    .line 419
    const v14, 0x3ec7ae14    # 0.39f

    .line 420
    .line 421
    .line 422
    const v15, -0x413851ec    # -0.39f

    .line 423
    .line 424
    .line 425
    const v16, 0x3f828f5c    # 1.02f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v0, 0x3eb33333    # 0.35f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, -0x3fc70a3d    # -2.89f

    .line 438
    .line 439
    .line 440
    const v2, 0x4038f5c3    # 2.89f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x40fb3333    # 7.85f

    .line 447
    .line 448
    .line 449
    const v2, 0x40cf5c29    # 6.48f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v0, -0x40800000    # -1.0f

    .line 456
    .line 457
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, -0x416b851f    # -0.29f

    .line 461
    .line 462
    .line 463
    const v18, -0x40ca3d71    # -0.71f

    .line 464
    .line 465
    .line 466
    const/4 v13, 0x0

    .line 467
    const v14, -0x4175c28f    # -0.27f

    .line 468
    .line 469
    .line 470
    const v15, -0x421eb852    # -0.11f

    .line 471
    .line 472
    .line 473
    const v16, -0x40fae148    # -0.52f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x40b147ae    # 5.54f

    .line 480
    .line 481
    .line 482
    const v2, 0x402f5c29    # 2.74f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, -0x404b851f    # -1.41f

    .line 489
    .line 490
    .line 491
    const/16 v18, 0x0

    .line 492
    .line 493
    const v13, -0x413851ec    # -0.39f

    .line 494
    .line 495
    .line 496
    const v14, -0x413851ec    # -0.39f

    .line 497
    .line 498
    .line 499
    const v15, -0x407d70a4    # -1.02f

    .line 500
    .line 501
    .line 502
    const v16, -0x413851ec    # -0.39f

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, 0x402d70a4    # 2.71f

    .line 509
    .line 510
    .line 511
    const v2, 0x40851eb8    # 4.16f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/16 v17, 0x0

    .line 518
    .line 519
    const v18, 0x3fb47ae1    # 1.41f

    .line 520
    .line 521
    .line 522
    const v14, 0x3ec7ae14    # 0.39f

    .line 523
    .line 524
    .line 525
    const v15, -0x413851ec    # -0.39f

    .line 526
    .line 527
    .line 528
    const v16, 0x3f828f5c    # 1.02f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v0, 0x40975c29    # 4.73f

    .line 535
    .line 536
    .line 537
    const v2, 0x40f33333    # 7.6f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v17, 0x3f35c28f    # 0.71f

    .line 544
    .line 545
    .line 546
    const v18, 0x3e947ae1    # 0.29f

    .line 547
    .line 548
    .line 549
    const v13, 0x3e428f5c    # 0.19f

    .line 550
    .line 551
    .line 552
    const v14, 0x3e428f5c    # 0.19f

    .line 553
    .line 554
    .line 555
    const v15, 0x3ee147ae    # 0.44f

    .line 556
    .line 557
    .line 558
    const v16, 0x3e947ae1    # 0.29f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v0, 0x3f800000    # 1.0f

    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x408428f6    # 4.13f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, -0x40a66666    # -0.85f

    .line 576
    .line 577
    .line 578
    const v2, 0x3f59999a    # 0.85f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x4106b852    # 8.42f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v17, -0x404b851f    # -1.41f

    .line 591
    .line 592
    .line 593
    const v18, 0x3f170a3d    # 0.59f

    .line 594
    .line 595
    .line 596
    const v13, -0x40f851ec    # -0.53f

    .line 597
    .line 598
    .line 599
    const/4 v14, 0x0

    .line 600
    const v15, -0x407ae148    # -1.04f

    .line 601
    .line 602
    .line 603
    const v16, 0x3e570a3d    # 0.21f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, 0x40970a3d    # 4.72f

    .line 610
    .line 611
    .line 612
    const v2, -0x3f68f5c3    # -4.72f

    .line 613
    .line 614
    .line 615
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/16 v17, 0x0

    .line 619
    .line 620
    const v18, 0x3fb47ae1    # 1.41f

    .line 621
    .line 622
    .line 623
    const v13, -0x413851ec    # -0.39f

    .line 624
    .line 625
    .line 626
    const v14, 0x3ec7ae14    # 0.39f

    .line 627
    .line 628
    .line 629
    const v15, -0x413851ec    # -0.39f

    .line 630
    .line 631
    .line 632
    const v16, 0x3f828f5c    # 1.02f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, 0x4007ae14    # 2.12f

    .line 639
    .line 640
    .line 641
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v17, 0x3fb47ae1    # 1.41f

    .line 645
    .line 646
    .line 647
    const/16 v18, 0x0

    .line 648
    .line 649
    const v13, 0x3ec7ae14    # 0.39f

    .line 650
    .line 651
    .line 652
    const v15, 0x3f828f5c    # 1.02f

    .line 653
    .line 654
    .line 655
    const v16, 0x3ec7ae14    # 0.39f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, 0x40970a3d    # 4.72f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, 0x3f170a3d    # 0.59f

    .line 668
    .line 669
    .line 670
    const v18, -0x404b851f    # -1.41f

    .line 671
    .line 672
    .line 673
    const v13, 0x3ec28f5c    # 0.38f

    .line 674
    .line 675
    .line 676
    const v14, -0x413d70a4    # -0.38f

    .line 677
    .line 678
    .line 679
    const v15, 0x3f170a3d    # 0.59f

    .line 680
    .line 681
    .line 682
    const v16, -0x409eb852    # -0.88f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, -0x405ae148    # -1.29f

    .line 689
    .line 690
    .line 691
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x40a4cccd    # 5.15f

    .line 695
    .line 696
    .line 697
    const v2, -0x3f5b3333    # -5.15f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, 0x4117d70a    # 9.49f

    .line 704
    .line 705
    .line 706
    const v2, 0x41850a3d    # 16.63f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    const/16 v16, 0x3800

    .line 720
    .line 721
    const/16 v17, 0x0

    .line 722
    .line 723
    const/high16 v6, 0x3f800000    # 1.0f

    .line 724
    .line 725
    const/4 v7, 0x0

    .line 726
    const/high16 v12, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/4 v13, 0x0

    .line 729
    const/4 v14, 0x0

    .line 730
    const/4 v15, 0x0

    .line 731
    const-string v4, ""

    .line 732
    .line 733
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    sput-object v0, Landroidx/compose/material/icons/rounded/HandymanKt;->_handyman:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 742
    .line 743
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 744
    .line 745
    .line 746
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/HiveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hive:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHive(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HiveKt;->_hive:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Hive"

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
    const v4, 0x416170a4    # 14.09f

    .line 71
    .line 72
    .line 73
    const v6, 0x40f051ec    # 7.51f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, -0x40000000    # -2.0f

    .line 80
    .line 81
    const v6, 0x3f99999a    # 1.2f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/16 v25, 0x0

    .line 88
    .line 89
    const v26, -0x407c28f6    # -1.03f

    .line 90
    .line 91
    .line 92
    const v21, 0x3e428f5c    # 0.19f

    .line 93
    .line 94
    .line 95
    const v22, -0x415c28f6    # -0.32f

    .line 96
    .line 97
    .line 98
    const v23, 0x3e428f5c    # 0.19f

    .line 99
    .line 100
    .line 101
    const v24, -0x40ca3d71    # -0.71f

    .line 102
    .line 103
    .line 104
    move-object/from16 v20, v2

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, -0x40666666    # -1.2f

    .line 110
    .line 111
    .line 112
    const/high16 v6, -0x40000000    # -2.0f

    .line 113
    .line 114
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v25, 0x4153ae14    # 13.23f

    .line 118
    .line 119
    .line 120
    const/high16 v26, 0x40000000    # 2.0f

    .line 121
    .line 122
    const v21, 0x415e8f5c    # 13.91f

    .line 123
    .line 124
    .line 125
    const v22, 0x400b851f    # 2.18f

    .line 126
    .line 127
    .line 128
    const v23, 0x415947ae    # 13.58f

    .line 129
    .line 130
    .line 131
    const/high16 v24, 0x40000000    # 2.0f

    .line 132
    .line 133
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, -0x3fe33333    # -2.45f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v25, -0x40a3d70a    # -0.86f

    .line 143
    .line 144
    .line 145
    const v26, 0x3efae148    # 0.49f

    .line 146
    .line 147
    .line 148
    const v21, -0x414ccccd    # -0.35f

    .line 149
    .line 150
    .line 151
    const/16 v22, 0x0

    .line 152
    .line 153
    const v23, -0x40d1eb85    # -0.68f

    .line 154
    .line 155
    .line 156
    const v24, 0x3e3851ec    # 0.18f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v4, 0x40000000    # 2.0f

    .line 163
    .line 164
    const v6, -0x40666666    # -1.2f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/16 v25, 0x0

    .line 171
    .line 172
    const v26, 0x3f83d70a    # 1.03f

    .line 173
    .line 174
    .line 175
    const v21, -0x41bd70a4    # -0.19f

    .line 176
    .line 177
    .line 178
    const v22, 0x3ea3d70a    # 0.32f

    .line 179
    .line 180
    .line 181
    const v23, -0x41bd70a4    # -0.19f

    .line 182
    .line 183
    .line 184
    const v24, 0x3f35c28f    # 0.71f

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v6, 0x3f99999a    # 1.2f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v25, 0x412c51ec    # 10.77f

    .line 197
    .line 198
    .line 199
    const/high16 v26, 0x41000000    # 8.0f

    .line 200
    .line 201
    const v21, 0x412170a4    # 10.09f

    .line 202
    .line 203
    .line 204
    const v22, 0x40fa3d71    # 7.82f

    .line 205
    .line 206
    .line 207
    const v23, 0x4126b852    # 10.42f

    .line 208
    .line 209
    .line 210
    const/high16 v24, 0x41000000    # 8.0f

    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, 0x401ccccd    # 2.45f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v25, 0x416170a4    # 14.09f

    .line 222
    .line 223
    .line 224
    const v26, 0x40f051ec    # 7.51f

    .line 225
    .line 226
    .line 227
    const v21, 0x415947ae    # 13.58f

    .line 228
    .line 229
    .line 230
    const/high16 v22, 0x41000000    # 8.0f

    .line 231
    .line 232
    const v23, 0x415e8f5c    # 13.91f

    .line 233
    .line 234
    .line 235
    const v24, 0x40fa3d71    # 7.82f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    const/16 v16, 0x3800

    .line 249
    .line 250
    const/16 v17, 0x0

    .line 251
    .line 252
    const/high16 v6, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/high16 v8, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/4 v7, 0x0

    .line 257
    const/high16 v9, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v12, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const/4 v14, 0x0

    .line 263
    const/4 v15, 0x0

    .line 264
    const-string v4, ""

    .line 265
    .line 266
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 267
    .line 268
    .line 269
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 274
    .line 275
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 276
    .line 277
    .line 278
    move-result-wide v6

    .line 279
    const/4 v2, 0x0

    .line 280
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const v4, 0x4117d70a    # 9.49f

    .line 297
    .line 298
    .line 299
    const v6, 0x411e8f5c    # 9.91f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x40000000    # 2.0f

    .line 306
    .line 307
    const v6, -0x40666666    # -1.2f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/16 v25, 0x0

    .line 314
    .line 315
    const v26, 0x3f83d70a    # 1.03f

    .line 316
    .line 317
    .line 318
    const v21, -0x41bd70a4    # -0.19f

    .line 319
    .line 320
    .line 321
    const v22, 0x3ea3d70a    # 0.32f

    .line 322
    .line 323
    .line 324
    const v23, -0x41bd70a4    # -0.19f

    .line 325
    .line 326
    .line 327
    const v24, 0x3f35c28f    # 0.71f

    .line 328
    .line 329
    .line 330
    move-object/from16 v20, v2

    .line 331
    .line 332
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v6, 0x3f99999a    # 1.2f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v25, 0x3f5c28f6    # 0.86f

    .line 342
    .line 343
    .line 344
    const v26, 0x3efae148    # 0.49f

    .line 345
    .line 346
    .line 347
    const v21, 0x3e3851ec    # 0.18f

    .line 348
    .line 349
    .line 350
    const v22, 0x3e99999a    # 0.3f

    .line 351
    .line 352
    .line 353
    const v23, 0x3f028f5c    # 0.51f

    .line 354
    .line 355
    .line 356
    const v24, 0x3efae148    # 0.49f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v4, 0x401d70a4    # 2.46f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v26, -0x41051eb8    # -0.49f

    .line 369
    .line 370
    .line 371
    const v21, 0x3eb33333    # 0.35f

    .line 372
    .line 373
    .line 374
    const/16 v22, 0x0

    .line 375
    .line 376
    const v23, 0x3f2e147b    # 0.68f

    .line 377
    .line 378
    .line 379
    const v24, -0x41c7ae14    # -0.18f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, -0x40000000    # -2.0f

    .line 386
    .line 387
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/16 v25, 0x0

    .line 391
    .line 392
    const v26, -0x407c28f6    # -1.03f

    .line 393
    .line 394
    .line 395
    const v21, 0x3e428f5c    # 0.19f

    .line 396
    .line 397
    .line 398
    const v22, -0x415c28f6    # -0.32f

    .line 399
    .line 400
    .line 401
    const v23, 0x3e428f5c    # 0.19f

    .line 402
    .line 403
    .line 404
    const v24, -0x40ca3d71    # -0.71f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v4, -0x40666666    # -1.2f

    .line 411
    .line 412
    .line 413
    const/high16 v6, -0x40000000    # -2.0f

    .line 414
    .line 415
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v25, 0x4153ae14    # 13.23f

    .line 419
    .line 420
    .line 421
    const/high16 v26, 0x41100000    # 9.0f

    .line 422
    .line 423
    const v21, 0x415e8f5c    # 13.91f

    .line 424
    .line 425
    .line 426
    const v22, 0x4112e148    # 9.18f

    .line 427
    .line 428
    .line 429
    const v23, 0x415947ae    # 13.58f

    .line 430
    .line 431
    .line 432
    const/high16 v24, 0x41100000    # 9.0f

    .line 433
    .line 434
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v4, -0x3fe28f5c    # -2.46f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v25, 0x411e8f5c    # 9.91f

    .line 444
    .line 445
    .line 446
    const v26, 0x4117d70a    # 9.49f

    .line 447
    .line 448
    .line 449
    const v21, 0x4126b852    # 10.42f

    .line 450
    .line 451
    .line 452
    const/high16 v22, 0x41100000    # 9.0f

    .line 453
    .line 454
    const v23, 0x412170a4    # 10.09f

    .line 455
    .line 456
    .line 457
    const v24, 0x4112e148    # 9.18f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    const/high16 v6, 0x3f800000    # 1.0f

    .line 471
    .line 472
    const/4 v7, 0x0

    .line 473
    const-string v4, ""

    .line 474
    .line 475
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 476
    .line 477
    .line 478
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 483
    .line 484
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 485
    .line 486
    .line 487
    move-result-wide v6

    .line 488
    const/4 v2, 0x0

    .line 489
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 493
    .line 494
    .line 495
    move-result v10

    .line 496
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 497
    .line 498
    .line 499
    move-result v11

    .line 500
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 503
    .line 504
    .line 505
    const v4, 0x4188147b    # 17.01f

    .line 506
    .line 507
    .line 508
    const v6, 0x413828f6    # 11.51f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v4, 0x401ccccd    # 2.45f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v25, 0x3f5c28f6    # 0.86f

    .line 521
    .line 522
    .line 523
    const v26, -0x41051eb8    # -0.49f

    .line 524
    .line 525
    .line 526
    const v21, 0x3eb33333    # 0.35f

    .line 527
    .line 528
    .line 529
    const/16 v22, 0x0

    .line 530
    .line 531
    const v23, 0x3f2e147b    # 0.68f

    .line 532
    .line 533
    .line 534
    const v24, -0x41c7ae14    # -0.18f

    .line 535
    .line 536
    .line 537
    move-object/from16 v20, v2

    .line 538
    .line 539
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v4, -0x40000000    # -2.0f

    .line 543
    .line 544
    const v6, 0x3f99999a    # 1.2f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/16 v25, 0x0

    .line 551
    .line 552
    const v26, -0x407c28f6    # -1.03f

    .line 553
    .line 554
    .line 555
    const v21, 0x3e428f5c    # 0.19f

    .line 556
    .line 557
    .line 558
    const v22, -0x415c28f6    # -0.32f

    .line 559
    .line 560
    .line 561
    const v23, 0x3e428f5c    # 0.19f

    .line 562
    .line 563
    .line 564
    const v24, -0x40ca3d71    # -0.71f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v4, -0x40666666    # -1.2f

    .line 571
    .line 572
    .line 573
    const/high16 v6, -0x40000000    # -2.0f

    .line 574
    .line 575
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v25, -0x40a3d70a    # -0.86f

    .line 579
    .line 580
    .line 581
    const v26, -0x41051eb8    # -0.49f

    .line 582
    .line 583
    .line 584
    const v21, -0x41c7ae14    # -0.18f

    .line 585
    .line 586
    .line 587
    const v22, -0x41666666    # -0.3f

    .line 588
    .line 589
    .line 590
    const v23, -0x40fd70a4    # -0.51f

    .line 591
    .line 592
    .line 593
    const v24, -0x41051eb8    # -0.49f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v4, -0x3fe33333    # -2.45f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v26, 0x3efae148    # 0.49f

    .line 606
    .line 607
    .line 608
    const v21, -0x414ccccd    # -0.35f

    .line 609
    .line 610
    .line 611
    const/16 v22, 0x0

    .line 612
    .line 613
    const v23, -0x40d1eb85    # -0.68f

    .line 614
    .line 615
    .line 616
    const v24, 0x3e3851ec    # 0.18f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v4, 0x40000000    # 2.0f

    .line 623
    .line 624
    const v6, -0x40666666    # -1.2f

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const/16 v25, 0x0

    .line 631
    .line 632
    const v26, 0x3f83d70a    # 1.03f

    .line 633
    .line 634
    .line 635
    const v21, -0x41bd70a4    # -0.19f

    .line 636
    .line 637
    .line 638
    const v22, 0x3ea3d70a    # 0.32f

    .line 639
    .line 640
    .line 641
    const v23, -0x41bd70a4    # -0.19f

    .line 642
    .line 643
    .line 644
    const v24, 0x3f35c28f    # 0.71f

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const v6, 0x3f99999a    # 1.2f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v25, 0x4188147b    # 17.01f

    .line 657
    .line 658
    .line 659
    const v26, 0x413828f6    # 11.51f

    .line 660
    .line 661
    .line 662
    const v21, 0x4182b852    # 16.34f

    .line 663
    .line 664
    .line 665
    const v22, 0x413547ae    # 11.33f

    .line 666
    .line 667
    .line 668
    const v23, 0x418547ae    # 16.66f

    .line 669
    .line 670
    .line 671
    const v24, 0x413828f6    # 11.51f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/high16 v6, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/4 v7, 0x0

    .line 687
    const-string v4, ""

    .line 688
    .line 689
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 690
    .line 691
    .line 692
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 697
    .line 698
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 699
    .line 700
    .line 701
    move-result-wide v6

    .line 702
    const/4 v2, 0x0

    .line 703
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 707
    .line 708
    .line 709
    move-result v10

    .line 710
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 711
    .line 712
    .line 713
    move-result v11

    .line 714
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 717
    .line 718
    .line 719
    const v4, 0x419bc28f    # 19.47f

    .line 720
    .line 721
    .line 722
    const v6, 0x414828f6    # 12.51f

    .line 723
    .line 724
    .line 725
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v4, -0x3fe28f5c    # -2.46f

    .line 729
    .line 730
    .line 731
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    const v25, -0x40a3d70a    # -0.86f

    .line 735
    .line 736
    .line 737
    const v26, 0x3efae148    # 0.49f

    .line 738
    .line 739
    .line 740
    const v21, -0x414ccccd    # -0.35f

    .line 741
    .line 742
    .line 743
    const/16 v22, 0x0

    .line 744
    .line 745
    const v23, -0x40d1eb85    # -0.68f

    .line 746
    .line 747
    .line 748
    const v24, 0x3e3851ec    # 0.18f

    .line 749
    .line 750
    .line 751
    move-object/from16 v20, v2

    .line 752
    .line 753
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v4, 0x40000000    # 2.0f

    .line 757
    .line 758
    const v6, -0x40666666    # -1.2f

    .line 759
    .line 760
    .line 761
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/16 v25, 0x0

    .line 765
    .line 766
    const v26, 0x3f83d70a    # 1.03f

    .line 767
    .line 768
    .line 769
    const v21, -0x41bd70a4    # -0.19f

    .line 770
    .line 771
    .line 772
    const v22, 0x3ea3d70a    # 0.32f

    .line 773
    .line 774
    .line 775
    const v23, -0x41bd70a4    # -0.19f

    .line 776
    .line 777
    .line 778
    const v24, 0x3f35c28f    # 0.71f

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const v6, 0x3f99999a    # 1.2f

    .line 785
    .line 786
    .line 787
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v25, 0x3f5c28f6    # 0.86f

    .line 791
    .line 792
    .line 793
    const v26, 0x3efae148    # 0.49f

    .line 794
    .line 795
    .line 796
    const v21, 0x3e3851ec    # 0.18f

    .line 797
    .line 798
    .line 799
    const v22, 0x3e99999a    # 0.3f

    .line 800
    .line 801
    .line 802
    const v23, 0x3f028f5c    # 0.51f

    .line 803
    .line 804
    .line 805
    const v24, 0x3efae148    # 0.49f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v4, 0x401d70a4    # 2.46f

    .line 812
    .line 813
    .line 814
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v26, -0x41051eb8    # -0.49f

    .line 818
    .line 819
    .line 820
    const v21, 0x3eb33333    # 0.35f

    .line 821
    .line 822
    .line 823
    const/16 v22, 0x0

    .line 824
    .line 825
    const v23, 0x3f2e147b    # 0.68f

    .line 826
    .line 827
    .line 828
    const v24, -0x41c7ae14    # -0.18f

    .line 829
    .line 830
    .line 831
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const/high16 v4, -0x40000000    # -2.0f

    .line 835
    .line 836
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const/16 v25, 0x0

    .line 840
    .line 841
    const v26, -0x407c28f6    # -1.03f

    .line 842
    .line 843
    .line 844
    const v21, 0x3e428f5c    # 0.19f

    .line 845
    .line 846
    .line 847
    const v22, -0x415c28f6    # -0.32f

    .line 848
    .line 849
    .line 850
    const v23, 0x3e428f5c    # 0.19f

    .line 851
    .line 852
    .line 853
    const v24, -0x40ca3d71    # -0.71f

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v4, -0x40666666    # -1.2f

    .line 860
    .line 861
    .line 862
    const/high16 v6, -0x40000000    # -2.0f

    .line 863
    .line 864
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const v25, 0x419bc28f    # 19.47f

    .line 868
    .line 869
    .line 870
    const v26, 0x414828f6    # 12.51f

    .line 871
    .line 872
    .line 873
    const v21, 0x41a13333    # 20.15f

    .line 874
    .line 875
    .line 876
    const v22, 0x414b3333    # 12.7f

    .line 877
    .line 878
    .line 879
    const v23, 0x419e8f5c    # 19.82f

    .line 880
    .line 881
    .line 882
    const v24, 0x414828f6    # 12.51f

    .line 883
    .line 884
    .line 885
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    const/high16 v6, 0x3f800000    # 1.0f

    .line 896
    .line 897
    const/4 v7, 0x0

    .line 898
    const-string v4, ""

    .line 899
    .line 900
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 901
    .line 902
    .line 903
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 904
    .line 905
    .line 906
    move-result v3

    .line 907
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 908
    .line 909
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 910
    .line 911
    .line 912
    move-result-wide v6

    .line 913
    const/4 v2, 0x0

    .line 914
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 918
    .line 919
    .line 920
    move-result v10

    .line 921
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 922
    .line 923
    .line 924
    move-result v11

    .line 925
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 928
    .line 929
    .line 930
    const v4, 0x40fae148    # 7.84f

    .line 931
    .line 932
    .line 933
    const v6, 0x41307ae1    # 11.03f

    .line 934
    .line 935
    .line 936
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const/high16 v4, -0x40000000    # -2.0f

    .line 940
    .line 941
    const v6, 0x3f99999a    # 1.2f

    .line 942
    .line 943
    .line 944
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const/16 v25, 0x0

    .line 948
    .line 949
    const v26, -0x407c28f6    # -1.03f

    .line 950
    .line 951
    .line 952
    const v21, 0x3e428f5c    # 0.19f

    .line 953
    .line 954
    .line 955
    const v22, -0x415c28f6    # -0.32f

    .line 956
    .line 957
    .line 958
    const v23, 0x3e428f5c    # 0.19f

    .line 959
    .line 960
    .line 961
    const v24, -0x40ca3d71    # -0.71f

    .line 962
    .line 963
    .line 964
    move-object/from16 v20, v2

    .line 965
    .line 966
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const v4, -0x40666666    # -1.2f

    .line 970
    .line 971
    .line 972
    const/high16 v6, -0x40000000    # -2.0f

    .line 973
    .line 974
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const v25, 0x40dfae14    # 6.99f

    .line 978
    .line 979
    .line 980
    const v26, 0x40b051ec    # 5.51f

    .line 981
    .line 982
    .line 983
    const v21, 0x40f51eb8    # 7.66f

    .line 984
    .line 985
    .line 986
    const v22, 0x40b66666    # 5.7f

    .line 987
    .line 988
    .line 989
    const v23, 0x40eae148    # 7.34f

    .line 990
    .line 991
    .line 992
    const v24, 0x40b051ec    # 5.51f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const v4, 0x4090f5c3    # 4.53f

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const v25, 0x406ae148    # 3.67f

    .line 1005
    .line 1006
    .line 1007
    const/high16 v26, 0x40c00000    # 6.0f

    .line 1008
    .line 1009
    const v21, 0x4085c28f    # 4.18f

    .line 1010
    .line 1011
    .line 1012
    const v22, 0x40b051ec    # 5.51f

    .line 1013
    .line 1014
    .line 1015
    const v23, 0x40766666    # 3.85f

    .line 1016
    .line 1017
    .line 1018
    const v24, 0x40b66666    # 5.7f

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const/high16 v4, 0x40000000    # 2.0f

    .line 1025
    .line 1026
    const v6, -0x40666666    # -1.2f

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1030
    .line 1031
    .line 1032
    const/16 v25, 0x0

    .line 1033
    .line 1034
    const v26, 0x3f83d70a    # 1.03f

    .line 1035
    .line 1036
    .line 1037
    const v21, -0x41bd70a4    # -0.19f

    .line 1038
    .line 1039
    .line 1040
    const v22, 0x3ea3d70a    # 0.32f

    .line 1041
    .line 1042
    .line 1043
    const v23, -0x41bd70a4    # -0.19f

    .line 1044
    .line 1045
    .line 1046
    const v24, 0x3f35c28f    # 0.71f

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1050
    .line 1051
    .line 1052
    const v6, 0x3f99999a    # 1.2f

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1056
    .line 1057
    .line 1058
    const v25, 0x3f5c28f6    # 0.86f

    .line 1059
    .line 1060
    .line 1061
    const v26, 0x3efae148    # 0.49f

    .line 1062
    .line 1063
    .line 1064
    const v21, 0x3e3851ec    # 0.18f

    .line 1065
    .line 1066
    .line 1067
    const v22, 0x3e99999a    # 0.3f

    .line 1068
    .line 1069
    .line 1070
    const v23, 0x3f028f5c    # 0.51f

    .line 1071
    .line 1072
    .line 1073
    const v24, 0x3efae148    # 0.49f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const v4, 0x401ccccd    # 2.45f

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const v25, 0x40fae148    # 7.84f

    .line 1086
    .line 1087
    .line 1088
    const v26, 0x41307ae1    # 11.03f

    .line 1089
    .line 1090
    .line 1091
    const v21, 0x40eae148    # 7.34f

    .line 1092
    .line 1093
    .line 1094
    const v22, 0x413828f6    # 11.51f

    .line 1095
    .line 1096
    .line 1097
    const v23, 0x40f51eb8    # 7.66f

    .line 1098
    .line 1099
    .line 1100
    const v24, 0x413547ae    # 11.33f

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v2

    .line 1113
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1114
    .line 1115
    const/4 v7, 0x0

    .line 1116
    const-string v4, ""

    .line 1117
    .line 1118
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1119
    .line 1120
    .line 1121
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1122
    .line 1123
    .line 1124
    move-result v3

    .line 1125
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1126
    .line 1127
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1128
    .line 1129
    .line 1130
    move-result-wide v6

    .line 1131
    const/4 v2, 0x0

    .line 1132
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1136
    .line 1137
    .line 1138
    move-result v10

    .line 1139
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1140
    .line 1141
    .line 1142
    move-result v11

    .line 1143
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1144
    .line 1145
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1146
    .line 1147
    .line 1148
    const v4, 0x40dfae14    # 6.99f

    .line 1149
    .line 1150
    .line 1151
    const v6, 0x414828f6    # 12.51f

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1155
    .line 1156
    .line 1157
    const v4, 0x4090f5c3    # 4.53f

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    const v25, -0x40a3d70a    # -0.86f

    .line 1164
    .line 1165
    .line 1166
    const v26, 0x3efae148    # 0.49f

    .line 1167
    .line 1168
    .line 1169
    const v21, -0x414ccccd    # -0.35f

    .line 1170
    .line 1171
    .line 1172
    const/16 v22, 0x0

    .line 1173
    .line 1174
    const v23, -0x40d1eb85    # -0.68f

    .line 1175
    .line 1176
    .line 1177
    const v24, 0x3e3851ec    # 0.18f

    .line 1178
    .line 1179
    .line 1180
    move-object/from16 v20, v2

    .line 1181
    .line 1182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1183
    .line 1184
    .line 1185
    const/high16 v4, 0x40000000    # 2.0f

    .line 1186
    .line 1187
    const v6, -0x40666666    # -1.2f

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1191
    .line 1192
    .line 1193
    const/16 v25, 0x0

    .line 1194
    .line 1195
    const v26, 0x3f83d70a    # 1.03f

    .line 1196
    .line 1197
    .line 1198
    const v21, -0x41bd70a4    # -0.19f

    .line 1199
    .line 1200
    .line 1201
    const v22, 0x3ea3d70a    # 0.32f

    .line 1202
    .line 1203
    .line 1204
    const v23, -0x41bd70a4    # -0.19f

    .line 1205
    .line 1206
    .line 1207
    const v24, 0x3f35c28f    # 0.71f

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1211
    .line 1212
    .line 1213
    const v6, 0x3f99999a    # 1.2f

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1217
    .line 1218
    .line 1219
    const v25, 0x3f5c28f6    # 0.86f

    .line 1220
    .line 1221
    .line 1222
    const v26, 0x3efae148    # 0.49f

    .line 1223
    .line 1224
    .line 1225
    const v21, 0x3e3851ec    # 0.18f

    .line 1226
    .line 1227
    .line 1228
    const v22, 0x3e99999a    # 0.3f

    .line 1229
    .line 1230
    .line 1231
    const v23, 0x3f028f5c    # 0.51f

    .line 1232
    .line 1233
    .line 1234
    const v24, 0x3efae148    # 0.49f

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1238
    .line 1239
    .line 1240
    const v4, 0x401d70a4    # 2.46f

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1244
    .line 1245
    .line 1246
    const v26, -0x41051eb8    # -0.49f

    .line 1247
    .line 1248
    .line 1249
    const v21, 0x3eb33333    # 0.35f

    .line 1250
    .line 1251
    .line 1252
    const/16 v22, 0x0

    .line 1253
    .line 1254
    const v23, 0x3f2e147b    # 0.68f

    .line 1255
    .line 1256
    .line 1257
    const v24, -0x41c7ae14    # -0.18f

    .line 1258
    .line 1259
    .line 1260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1261
    .line 1262
    .line 1263
    const/high16 v4, -0x40000000    # -2.0f

    .line 1264
    .line 1265
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1266
    .line 1267
    .line 1268
    const/16 v25, 0x0

    .line 1269
    .line 1270
    const v26, -0x407c28f6    # -1.03f

    .line 1271
    .line 1272
    .line 1273
    const v21, 0x3e428f5c    # 0.19f

    .line 1274
    .line 1275
    .line 1276
    const v22, -0x415c28f6    # -0.32f

    .line 1277
    .line 1278
    .line 1279
    const v23, 0x3e428f5c    # 0.19f

    .line 1280
    .line 1281
    .line 1282
    const v24, -0x40ca3d71    # -0.71f

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1286
    .line 1287
    .line 1288
    const v4, -0x40666666    # -1.2f

    .line 1289
    .line 1290
    .line 1291
    const/high16 v6, -0x40000000    # -2.0f

    .line 1292
    .line 1293
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1294
    .line 1295
    .line 1296
    const v25, 0x40dfae14    # 6.99f

    .line 1297
    .line 1298
    .line 1299
    const v26, 0x414828f6    # 12.51f

    .line 1300
    .line 1301
    .line 1302
    const v21, 0x40f51eb8    # 7.66f

    .line 1303
    .line 1304
    .line 1305
    const v22, 0x414b3333    # 12.7f

    .line 1306
    .line 1307
    .line 1308
    const v23, 0x40eae148    # 7.34f

    .line 1309
    .line 1310
    .line 1311
    const v24, 0x414828f6    # 12.51f

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1325
    .line 1326
    const/4 v7, 0x0

    .line 1327
    const-string v4, ""

    .line 1328
    .line 1329
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1330
    .line 1331
    .line 1332
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1333
    .line 1334
    .line 1335
    move-result v3

    .line 1336
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1337
    .line 1338
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1339
    .line 1340
    .line 1341
    move-result-wide v6

    .line 1342
    const/4 v0, 0x0

    .line 1343
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1347
    .line 1348
    .line 1349
    move-result v10

    .line 1350
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1351
    .line 1352
    .line 1353
    move-result v11

    .line 1354
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1355
    .line 1356
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1357
    .line 1358
    .line 1359
    const v0, 0x4183eb85    # 16.49f

    .line 1360
    .line 1361
    .line 1362
    const v2, 0x411e8f5c    # 9.91f

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1366
    .line 1367
    .line 1368
    const/high16 v0, 0x40000000    # 2.0f

    .line 1369
    .line 1370
    const v2, -0x40666666    # -1.2f

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1374
    .line 1375
    .line 1376
    const/16 v17, 0x0

    .line 1377
    .line 1378
    const v18, 0x3f83d70a    # 1.03f

    .line 1379
    .line 1380
    .line 1381
    const v13, -0x41bd70a4    # -0.19f

    .line 1382
    .line 1383
    .line 1384
    const v14, 0x3ea3d70a    # 0.32f

    .line 1385
    .line 1386
    .line 1387
    const v15, -0x41bd70a4    # -0.19f

    .line 1388
    .line 1389
    .line 1390
    const v16, 0x3f35c28f    # 0.71f

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1394
    .line 1395
    .line 1396
    const v2, 0x3f99999a    # 1.2f

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1400
    .line 1401
    .line 1402
    const v17, 0x3f5c28f6    # 0.86f

    .line 1403
    .line 1404
    .line 1405
    const v18, 0x3efae148    # 0.49f

    .line 1406
    .line 1407
    .line 1408
    const v13, 0x3e3851ec    # 0.18f

    .line 1409
    .line 1410
    .line 1411
    const v14, 0x3e99999a    # 0.3f

    .line 1412
    .line 1413
    .line 1414
    const v15, 0x3f028f5c    # 0.51f

    .line 1415
    .line 1416
    .line 1417
    const v16, 0x3efae148    # 0.49f

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1421
    .line 1422
    .line 1423
    const v0, 0x401d70a4    # 2.46f

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1427
    .line 1428
    .line 1429
    const v18, -0x41051eb8    # -0.49f

    .line 1430
    .line 1431
    .line 1432
    const v13, 0x3eb33333    # 0.35f

    .line 1433
    .line 1434
    .line 1435
    const/4 v14, 0x0

    .line 1436
    const v15, 0x3f2e147b    # 0.68f

    .line 1437
    .line 1438
    .line 1439
    const v16, -0x41c7ae14    # -0.18f

    .line 1440
    .line 1441
    .line 1442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1443
    .line 1444
    .line 1445
    const/high16 v0, -0x40000000    # -2.0f

    .line 1446
    .line 1447
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1448
    .line 1449
    .line 1450
    const/16 v17, 0x0

    .line 1451
    .line 1452
    const v18, -0x407c28f6    # -1.03f

    .line 1453
    .line 1454
    .line 1455
    const v13, 0x3e428f5c    # 0.19f

    .line 1456
    .line 1457
    .line 1458
    const v14, -0x415c28f6    # -0.32f

    .line 1459
    .line 1460
    .line 1461
    const v15, 0x3e428f5c    # 0.19f

    .line 1462
    .line 1463
    .line 1464
    const v16, -0x40ca3d71    # -0.71f

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1468
    .line 1469
    .line 1470
    const v0, -0x40666666    # -1.2f

    .line 1471
    .line 1472
    .line 1473
    const/high16 v2, -0x40000000    # -2.0f

    .line 1474
    .line 1475
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1476
    .line 1477
    .line 1478
    const v17, -0x40a3d70a    # -0.86f

    .line 1479
    .line 1480
    .line 1481
    const v18, -0x41051eb8    # -0.49f

    .line 1482
    .line 1483
    .line 1484
    const v13, -0x41c7ae14    # -0.18f

    .line 1485
    .line 1486
    .line 1487
    const v14, -0x41666666    # -0.3f

    .line 1488
    .line 1489
    .line 1490
    const v15, -0x40fd70a4    # -0.51f

    .line 1491
    .line 1492
    .line 1493
    const v16, -0x41051eb8    # -0.49f

    .line 1494
    .line 1495
    .line 1496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1497
    .line 1498
    .line 1499
    const v0, -0x3fe28f5c    # -2.46f

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1503
    .line 1504
    .line 1505
    const v17, 0x411e8f5c    # 9.91f

    .line 1506
    .line 1507
    .line 1508
    const v18, 0x4183eb85    # 16.49f

    .line 1509
    .line 1510
    .line 1511
    const v13, 0x4126b852    # 10.42f

    .line 1512
    .line 1513
    .line 1514
    const/high16 v14, 0x41800000    # 16.0f

    .line 1515
    .line 1516
    const v15, 0x412170a4    # 10.09f

    .line 1517
    .line 1518
    .line 1519
    const v16, 0x418170a4    # 16.18f

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v2

    .line 1532
    const/16 v16, 0x3800

    .line 1533
    .line 1534
    const/16 v17, 0x0

    .line 1535
    .line 1536
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1537
    .line 1538
    const/4 v7, 0x0

    .line 1539
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1540
    .line 1541
    const/4 v13, 0x0

    .line 1542
    const/4 v14, 0x0

    .line 1543
    const/4 v15, 0x0

    .line 1544
    const-string v4, ""

    .line 1545
    .line 1546
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v0

    .line 1554
    sput-object v0, Landroidx/compose/material/icons/rounded/HiveKt;->_hive:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1555
    .line 1556
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1557
    .line 1558
    .line 1559
    return-object v0
.end method

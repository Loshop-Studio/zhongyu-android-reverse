.class public final Landroidx/compose/material/icons/rounded/WatchOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _watchOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWatchOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WatchOffKt;->_watchOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WatchOff"

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
    const/high16 v4, 0x40e00000    # 7.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40a00000    # 5.0f

    .line 78
    .line 79
    const/high16 v26, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const v21, 0x4030a3d7    # 2.76f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40a00000    # 5.0f

    .line 87
    .line 88
    const v24, 0x400f5c29    # 2.24f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v25, -0x414ccccd    # -0.35f

    .line 97
    .line 98
    .line 99
    const v26, 0x3fe8f5c3    # 1.82f

    .line 100
    .line 101
    .line 102
    const/16 v21, 0x0

    .line 103
    .line 104
    const v22, 0x3f23d70a    # 0.64f

    .line 105
    .line 106
    .line 107
    const v23, -0x41fae148    # -0.13f

    .line 108
    .line 109
    .line 110
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 116
    .line 117
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v25, 0x41980000    # 19.0f

    .line 121
    .line 122
    const/high16 v26, 0x41400000    # 12.0f

    .line 123
    .line 124
    const v21, 0x4195851f    # 18.69f

    .line 125
    .line 126
    .line 127
    const v22, 0x416547ae    # 14.33f

    .line 128
    .line 129
    .line 130
    const/high16 v23, 0x41980000    # 19.0f

    .line 131
    .line 132
    const v24, 0x41533333    # 13.2f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v25, -0x3fd70a3d    # -2.64f

    .line 139
    .line 140
    .line 141
    const v26, -0x3f50f5c3    # -5.47f

    .line 142
    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    const v22, -0x3ff1eb85    # -2.22f

    .line 147
    .line 148
    .line 149
    const v23, -0x407c28f6    # -1.03f

    .line 150
    .line 151
    .line 152
    const v24, -0x3f79eb85    # -4.19f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, -0x4091eb85    # -0.93f

    .line 159
    .line 160
    .line 161
    const v6, -0x3fb9999a    # -3.1f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v25, 0x415828f6    # 13.51f

    .line 168
    .line 169
    .line 170
    const/high16 v26, 0x40000000    # 2.0f

    .line 171
    .line 172
    const v21, 0x4172b852    # 15.17f

    .line 173
    .line 174
    .line 175
    const v22, 0x40251eb8    # 2.58f

    .line 176
    .line 177
    .line 178
    const v23, 0x41666666    # 14.4f

    .line 179
    .line 180
    .line 181
    const/high16 v24, 0x40000000    # 2.0f

    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v4, -0x3fbeb852    # -3.02f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v25, 0x41091eb8    # 8.57f

    .line 193
    .line 194
    .line 195
    const v26, 0x405ae148    # 3.42f

    .line 196
    .line 197
    .line 198
    const v21, 0x4119999a    # 9.6f

    .line 199
    .line 200
    .line 201
    const/high16 v22, 0x40000000    # 2.0f

    .line 202
    .line 203
    const v23, 0x410d47ae    # 8.83f

    .line 204
    .line 205
    .line 206
    const v24, 0x40251eb8    # 2.58f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v4, 0x4100a3d7    # 8.04f

    .line 213
    .line 214
    .line 215
    const v6, 0x40a6b852    # 5.21f

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x4008f5c3    # 2.14f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v25, 0x41400000    # 12.0f

    .line 228
    .line 229
    const/high16 v26, 0x40e00000    # 7.0f

    .line 230
    .line 231
    const/high16 v21, 0x412c0000    # 10.75f

    .line 232
    .line 233
    const v22, 0x40e428f6    # 7.13f

    .line 234
    .line 235
    .line 236
    const v23, 0x4135c28f    # 11.36f

    .line 237
    .line 238
    .line 239
    const/high16 v24, 0x40e00000    # 7.0f

    .line 240
    .line 241
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    const/16 v16, 0x3800

    .line 252
    .line 253
    const/16 v17, 0x0

    .line 254
    .line 255
    const/high16 v6, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/high16 v8, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/4 v7, 0x0

    .line 260
    const/high16 v9, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const/high16 v12, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const/4 v13, 0x0

    .line 265
    const/4 v14, 0x0

    .line 266
    const/4 v15, 0x0

    .line 267
    const-string v4, ""

    .line 268
    .line 269
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 270
    .line 271
    .line 272
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 277
    .line 278
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 279
    .line 280
    .line 281
    move-result-wide v6

    .line 282
    const/4 v0, 0x0

    .line 283
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 291
    .line 292
    .line 293
    move-result v11

    .line 294
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 297
    .line 298
    .line 299
    const v0, 0x40066666    # 2.1f

    .line 300
    .line 301
    .line 302
    const v2, 0x4060a3d7    # 3.51f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/16 v17, 0x0

    .line 312
    .line 313
    const v18, 0x3fb47ae1    # 1.41f

    .line 314
    .line 315
    .line 316
    const v13, -0x413851ec    # -0.39f

    .line 317
    .line 318
    .line 319
    const v14, 0x3ec7ae14    # 0.39f

    .line 320
    .line 321
    .line 322
    const v15, -0x413851ec    # -0.39f

    .line 323
    .line 324
    .line 325
    const v16, 0x3f828f5c    # 1.02f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v0, 0x40700000    # 3.75f

    .line 332
    .line 333
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v17, 0x40a00000    # 5.0f

    .line 337
    .line 338
    const/high16 v18, 0x41400000    # 12.0f

    .line 339
    .line 340
    const v13, 0x40a9eb85    # 5.31f

    .line 341
    .line 342
    .line 343
    const v14, 0x411ab852    # 9.67f

    .line 344
    .line 345
    .line 346
    const/high16 v15, 0x40a00000    # 5.0f

    .line 347
    .line 348
    const v16, 0x412ccccd    # 10.8f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x4028f5c3    # 2.64f

    .line 355
    .line 356
    .line 357
    const v18, 0x40af0a3d    # 5.47f

    .line 358
    .line 359
    .line 360
    const/4 v13, 0x0

    .line 361
    const v14, 0x400e147b    # 2.22f

    .line 362
    .line 363
    .line 364
    const v15, 0x3f83d70a    # 1.03f

    .line 365
    .line 366
    .line 367
    const v16, 0x4086147b    # 4.19f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x3f6e147b    # 0.93f

    .line 374
    .line 375
    .line 376
    const v2, 0x40466666    # 3.1f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, 0x4127d70a    # 10.49f

    .line 383
    .line 384
    .line 385
    const/high16 v18, 0x41b00000    # 22.0f

    .line 386
    .line 387
    const v13, 0x410d47ae    # 8.83f

    .line 388
    .line 389
    .line 390
    const v14, 0x41ab5c29    # 21.42f

    .line 391
    .line 392
    .line 393
    const v15, 0x4119999a    # 9.6f

    .line 394
    .line 395
    .line 396
    const/high16 v16, 0x41b00000    # 22.0f

    .line 397
    .line 398
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v0, 0x404147ae    # 3.02f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, 0x3ff5c28f    # 1.92f

    .line 408
    .line 409
    .line 410
    const v18, -0x4048f5c3    # -1.43f

    .line 411
    .line 412
    .line 413
    const v13, 0x3f6147ae    # 0.88f

    .line 414
    .line 415
    .line 416
    const/4 v14, 0x0

    .line 417
    const v15, 0x3fd47ae1    # 1.66f

    .line 418
    .line 419
    .line 420
    const v16, -0x40eb851f    # -0.58f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x3f07ae14    # 0.53f

    .line 427
    .line 428
    .line 429
    const v2, -0x401c28f6    # -1.78f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x40470a3d    # 3.11f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, 0x3fb47ae1    # 1.41f

    .line 442
    .line 443
    .line 444
    const/16 v18, 0x0

    .line 445
    .line 446
    const v13, 0x3ec7ae14    # 0.39f

    .line 447
    .line 448
    .line 449
    const v14, 0x3ec7ae14    # 0.39f

    .line 450
    .line 451
    .line 452
    const v15, 0x3f828f5c    # 1.02f

    .line 453
    .line 454
    .line 455
    const v16, 0x3ec7ae14    # 0.39f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/4 v0, 0x0

    .line 462
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const/16 v17, 0x0

    .line 466
    .line 467
    const v18, -0x404b851f    # -1.41f

    .line 468
    .line 469
    .line 470
    const v14, -0x413851ec    # -0.39f

    .line 471
    .line 472
    .line 473
    const v15, 0x3ec7ae14    # 0.39f

    .line 474
    .line 475
    .line 476
    const v16, -0x407d70a4    # -1.02f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x4060a3d7    # 3.51f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, 0x40066666    # 2.1f

    .line 489
    .line 490
    .line 491
    const v18, 0x4060a3d7    # 3.51f

    .line 492
    .line 493
    .line 494
    const v13, 0x4047ae14    # 3.12f

    .line 495
    .line 496
    .line 497
    const v14, 0x4047ae14    # 3.12f

    .line 498
    .line 499
    .line 500
    const v15, 0x401f5c29    # 2.49f

    .line 501
    .line 502
    .line 503
    const v16, 0x4047ae14    # 3.12f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const/high16 v0, 0x41880000    # 17.0f

    .line 513
    .line 514
    const/high16 v2, 0x41400000    # 12.0f

    .line 515
    .line 516
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const/high16 v17, -0x3f600000    # -5.0f

    .line 520
    .line 521
    const/high16 v18, -0x3f600000    # -5.0f

    .line 522
    .line 523
    const v13, -0x3fcf5c29    # -2.76f

    .line 524
    .line 525
    .line 526
    const/4 v14, 0x0

    .line 527
    const/high16 v15, -0x3f600000    # -5.0f

    .line 528
    .line 529
    const v16, -0x3ff0a3d7    # -2.24f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x3eb33333    # 0.35f

    .line 536
    .line 537
    .line 538
    const v18, -0x40170a3d    # -1.82f

    .line 539
    .line 540
    .line 541
    const/4 v13, 0x0

    .line 542
    const v14, -0x40dc28f6    # -0.64f

    .line 543
    .line 544
    .line 545
    const v15, 0x3e051eb8    # 0.13f

    .line 546
    .line 547
    .line 548
    const/high16 v16, -0x40600000    # -1.25f

    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x40cf0a3d    # 6.47f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v17, 0x41400000    # 12.0f

    .line 560
    .line 561
    const/high16 v18, 0x41880000    # 17.0f

    .line 562
    .line 563
    const/high16 v13, 0x41540000    # 13.25f

    .line 564
    .line 565
    const v14, 0x4186f5c3    # 16.87f

    .line 566
    .line 567
    .line 568
    const v15, 0x414a3d71    # 12.64f

    .line 569
    .line 570
    .line 571
    const/high16 v16, 0x41880000    # 17.0f

    .line 572
    .line 573
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    const/16 v16, 0x3800

    .line 584
    .line 585
    const/16 v17, 0x0

    .line 586
    .line 587
    const/high16 v6, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/4 v7, 0x0

    .line 590
    const/high16 v12, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/4 v13, 0x0

    .line 593
    const/4 v14, 0x0

    .line 594
    const/4 v15, 0x0

    .line 595
    const-string v4, ""

    .line 596
    .line 597
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    sput-object v0, Landroidx/compose/material/icons/rounded/WatchOffKt;->_watchOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 606
    .line 607
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    return-object v0
.end method

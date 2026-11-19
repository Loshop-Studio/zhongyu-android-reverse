.class public final Landroidx/compose/material/icons/rounded/LunchDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLunchDining(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LunchDiningKt;->_lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LunchDining"

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
    const v4, 0x4057ae14    # 3.37f

    .line 71
    .line 72
    .line 73
    const v6, 0x41647ae1    # 14.28f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3ffeb852    # 1.99f

    .line 80
    .line 81
    .line 82
    const v26, -0x40b851ec    # -0.78f

    .line 83
    .line 84
    .line 85
    const v21, 0x3f4a3d71    # 0.79f

    .line 86
    .line 87
    .line 88
    const v22, -0x416b851f    # -0.29f

    .line 89
    .line 90
    .line 91
    const v23, 0x3f95c28f    # 1.17f

    .line 92
    .line 93
    .line 94
    const v24, -0x40b851ec    # -0.78f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, 0x40551eb8    # 3.33f

    .line 103
    .line 104
    .line 105
    const/high16 v26, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const v21, 0x3f9851ec    # 1.19f

    .line 108
    .line 109
    .line 110
    const/16 v22, 0x0

    .line 111
    .line 112
    const v23, 0x3fb5c28f    # 1.42f

    .line 113
    .line 114
    .line 115
    const/high16 v24, 0x3f800000    # 1.0f

    .line 116
    .line 117
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v26, -0x40800000    # -1.0f

    .line 121
    .line 122
    const v21, 0x3ff9999a    # 1.95f

    .line 123
    .line 124
    .line 125
    const v23, 0x4005c28f    # 2.09f

    .line 126
    .line 127
    .line 128
    const/high16 v24, -0x40800000    # -1.0f

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v26, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const v21, 0x3f9851ec    # 1.19f

    .line 136
    .line 137
    .line 138
    const v23, 0x3fb5c28f    # 1.42f

    .line 139
    .line 140
    .line 141
    const/high16 v24, 0x3f800000    # 1.0f

    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v26, -0x40800000    # -1.0f

    .line 147
    .line 148
    const v21, 0x3ff9999a    # 1.95f

    .line 149
    .line 150
    .line 151
    const v23, 0x4005c28f    # 2.09f

    .line 152
    .line 153
    .line 154
    const/high16 v24, -0x40800000    # -1.0f

    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x3ff70a3d    # 1.93f

    .line 160
    .line 161
    .line 162
    const v26, 0x3f428f5c    # 0.76f

    .line 163
    .line 164
    .line 165
    const v21, 0x3f4f5c29    # 0.81f

    .line 166
    .line 167
    .line 168
    const v23, 0x3f95c28f    # 1.17f

    .line 169
    .line 170
    .line 171
    const v24, 0x3eeb851f    # 0.46f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v25, 0x3fb1eb85    # 1.39f

    .line 178
    .line 179
    .line 180
    const v26, -0x408a3d71    # -0.96f

    .line 181
    .line 182
    .line 183
    const v21, 0x3f2b851f    # 0.67f

    .line 184
    .line 185
    .line 186
    const v22, 0x3e851eb8    # 0.26f

    .line 187
    .line 188
    .line 189
    const v23, 0x3fb1eb85    # 1.39f

    .line 190
    .line 191
    .line 192
    const/high16 v24, -0x41800000    # -0.25f

    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v25, -0x40cf5c29    # -0.69f

    .line 198
    .line 199
    .line 200
    const/16 v21, 0x0

    .line 201
    .line 202
    const v22, -0x4123d70a    # -0.43f

    .line 203
    .line 204
    .line 205
    const v23, -0x4170a3d7    # -0.28f

    .line 206
    .line 207
    .line 208
    const v24, -0x40b0a3d7    # -0.81f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v25, -0x3fd66666    # -2.65f

    .line 215
    .line 216
    .line 217
    const v26, -0x40ab851f    # -0.83f

    .line 218
    .line 219
    .line 220
    const v21, -0x4087ae14    # -0.97f

    .line 221
    .line 222
    .line 223
    const v22, -0x414ccccd    # -0.35f

    .line 224
    .line 225
    .line 226
    const v23, -0x4063d70a    # -1.22f

    .line 227
    .line 228
    .line 229
    const v24, -0x40ab851f    # -0.83f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v25, -0x3faae148    # -3.33f

    .line 236
    .line 237
    .line 238
    const/high16 v26, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const v21, -0x40066666    # -1.95f

    .line 241
    .line 242
    .line 243
    const/16 v22, 0x0

    .line 244
    .line 245
    const v23, -0x3ffa3d71    # -2.09f

    .line 246
    .line 247
    .line 248
    const/high16 v24, 0x3f800000    # 1.0f

    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v26, -0x40800000    # -1.0f

    .line 254
    .line 255
    const v21, -0x4067ae14    # -1.19f

    .line 256
    .line 257
    .line 258
    const v23, -0x404a3d71    # -1.42f

    .line 259
    .line 260
    .line 261
    const/high16 v24, -0x40800000    # -1.0f

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v26, 0x3f800000    # 1.0f

    .line 267
    .line 268
    const v21, -0x40066666    # -1.95f

    .line 269
    .line 270
    .line 271
    const v23, -0x3ffa3d71    # -2.09f

    .line 272
    .line 273
    .line 274
    const/high16 v24, 0x3f800000    # 1.0f

    .line 275
    .line 276
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v26, -0x40800000    # -1.0f

    .line 280
    .line 281
    const v21, -0x4067ae14    # -1.19f

    .line 282
    .line 283
    .line 284
    const v23, -0x404a3d71    # -1.42f

    .line 285
    .line 286
    .line 287
    const/high16 v24, -0x40800000    # -1.0f

    .line 288
    .line 289
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v25, -0x3fd47ae1    # -2.68f

    .line 293
    .line 294
    .line 295
    const v26, 0x3f63d70a    # 0.89f

    .line 296
    .line 297
    .line 298
    const v21, -0x4039999a    # -1.55f

    .line 299
    .line 300
    .line 301
    const v23, -0x40051eb8    # -1.96f

    .line 302
    .line 303
    .line 304
    const v24, 0x3f2147ae    # 0.63f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v25, -0x40d9999a    # -0.65f

    .line 311
    .line 312
    .line 313
    const v26, 0x3f70a3d7    # 0.94f

    .line 314
    .line 315
    .line 316
    const v21, -0x413851ec    # -0.39f

    .line 317
    .line 318
    .line 319
    const v22, 0x3e0f5c29    # 0.14f

    .line 320
    .line 321
    .line 322
    const v23, -0x40d9999a    # -0.65f

    .line 323
    .line 324
    .line 325
    const v24, 0x3f051eb8    # 0.52f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v25, 0x4057ae14    # 3.37f

    .line 332
    .line 333
    .line 334
    const v26, 0x41647ae1    # 14.28f

    .line 335
    .line 336
    .line 337
    const v21, 0x4000a3d7    # 2.01f

    .line 338
    .line 339
    .line 340
    const v22, 0x41607ae1    # 14.03f

    .line 341
    .line 342
    .line 343
    const v23, 0x402d70a4    # 2.71f

    .line 344
    .line 345
    .line 346
    const v24, 0x416851ec    # 14.52f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    const/16 v16, 0x3800

    .line 360
    .line 361
    const/16 v17, 0x0

    .line 362
    .line 363
    const/high16 v6, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/high16 v8, 0x3f800000    # 1.0f

    .line 366
    .line 367
    const/4 v7, 0x0

    .line 368
    const/high16 v9, 0x3f800000    # 1.0f

    .line 369
    .line 370
    const/high16 v12, 0x3f800000    # 1.0f

    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    const/4 v14, 0x0

    .line 374
    const/4 v15, 0x0

    .line 375
    const-string v4, ""

    .line 376
    .line 377
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 378
    .line 379
    .line 380
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 385
    .line 386
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 387
    .line 388
    .line 389
    move-result-wide v6

    .line 390
    const/4 v2, 0x0

    .line 391
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 395
    .line 396
    .line 397
    move-result v10

    .line 398
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 399
    .line 400
    .line 401
    move-result v11

    .line 402
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 405
    .line 406
    .line 407
    const/high16 v4, 0x40000000    # 2.0f

    .line 408
    .line 409
    const/high16 v6, 0x41980000    # 19.0f

    .line 410
    .line 411
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const/high16 v25, 0x40000000    # 2.0f

    .line 415
    .line 416
    const/high16 v26, 0x40000000    # 2.0f

    .line 417
    .line 418
    const/16 v21, 0x0

    .line 419
    .line 420
    const v22, 0x3f8ccccd    # 1.1f

    .line 421
    .line 422
    .line 423
    const v23, 0x3f666666    # 0.9f

    .line 424
    .line 425
    .line 426
    const/high16 v24, 0x40000000    # 2.0f

    .line 427
    .line 428
    move-object/from16 v20, v2

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v4, 0x41800000    # 16.0f

    .line 434
    .line 435
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v26, -0x40000000    # -2.0f

    .line 439
    .line 440
    const v21, 0x3f8ccccd    # 1.1f

    .line 441
    .line 442
    .line 443
    const/16 v22, 0x0

    .line 444
    .line 445
    const/high16 v23, 0x40000000    # 2.0f

    .line 446
    .line 447
    const v24, -0x4099999a    # -0.9f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v4, -0x40800000    # -1.0f

    .line 454
    .line 455
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v25, -0x40000000    # -2.0f

    .line 459
    .line 460
    const/16 v21, 0x0

    .line 461
    .line 462
    const v22, -0x40733333    # -1.1f

    .line 463
    .line 464
    .line 465
    const v23, -0x4099999a    # -0.9f

    .line 466
    .line 467
    .line 468
    const/high16 v24, -0x40000000    # -2.0f

    .line 469
    .line 470
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v4, 0x40800000    # 4.0f

    .line 474
    .line 475
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v26, 0x40000000    # 2.0f

    .line 479
    .line 480
    const v21, -0x40733333    # -1.1f

    .line 481
    .line 482
    .line 483
    const/16 v22, 0x0

    .line 484
    .line 485
    const/high16 v23, -0x40000000    # -2.0f

    .line 486
    .line 487
    const v24, 0x3f666666    # 0.9f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v4, 0x41980000    # 19.0f

    .line 494
    .line 495
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    const/high16 v6, 0x3f800000    # 1.0f

    .line 506
    .line 507
    const/4 v7, 0x0

    .line 508
    const-string v4, ""

    .line 509
    .line 510
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 511
    .line 512
    .line 513
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 518
    .line 519
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 520
    .line 521
    .line 522
    move-result-wide v6

    .line 523
    const/4 v0, 0x0

    .line 524
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 528
    .line 529
    .line 530
    move-result v10

    .line 531
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 532
    .line 533
    .line 534
    move-result v11

    .line 535
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x41100000    # 9.0f

    .line 541
    .line 542
    const/high16 v2, 0x41b00000    # 22.0f

    .line 543
    .line 544
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 548
    .line 549
    const/high16 v18, -0x3f400000    # -6.0f

    .line 550
    .line 551
    const v13, 0x3ca3d70a    # 0.02f

    .line 552
    .line 553
    .line 554
    const/high16 v14, -0x3f800000    # -4.0f

    .line 555
    .line 556
    const v15, -0x3f770a3d    # -4.28f

    .line 557
    .line 558
    .line 559
    const/high16 v16, -0x3f400000    # -6.0f

    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v17, 0x40000000    # 2.0f

    .line 565
    .line 566
    const/high16 v18, 0x41100000    # 9.0f

    .line 567
    .line 568
    const v13, 0x40c947ae    # 6.29f

    .line 569
    .line 570
    .line 571
    const/high16 v14, 0x40400000    # 3.0f

    .line 572
    .line 573
    const/high16 v15, 0x40000000    # 2.0f

    .line 574
    .line 575
    const/high16 v16, 0x40a00000    # 5.0f

    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/4 v0, 0x0

    .line 581
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const/high16 v17, 0x3f800000    # 1.0f

    .line 585
    .line 586
    const/high16 v18, 0x3f800000    # 1.0f

    .line 587
    .line 588
    const/4 v13, 0x0

    .line 589
    const v14, 0x3f0ccccd    # 0.55f

    .line 590
    .line 591
    .line 592
    const v15, 0x3ee66666    # 0.45f

    .line 593
    .line 594
    .line 595
    const/high16 v16, 0x3f800000    # 1.0f

    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v0, 0x41900000    # 18.0f

    .line 601
    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v17, 0x41b00000    # 22.0f

    .line 606
    .line 607
    const/high16 v18, 0x41100000    # 9.0f

    .line 608
    .line 609
    const v13, 0x41ac6666    # 21.55f

    .line 610
    .line 611
    .line 612
    const/high16 v14, 0x41200000    # 10.0f

    .line 613
    .line 614
    const/high16 v15, 0x41b00000    # 22.0f

    .line 615
    .line 616
    const v16, 0x4118cccd    # 9.55f

    .line 617
    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const/high16 v0, 0x41100000    # 9.0f

    .line 623
    .line 624
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    const/16 v16, 0x3800

    .line 638
    .line 639
    const/16 v17, 0x0

    .line 640
    .line 641
    const/high16 v6, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/4 v7, 0x0

    .line 644
    const/high16 v12, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v13, 0x0

    .line 647
    const/4 v14, 0x0

    .line 648
    const/4 v15, 0x0

    .line 649
    const-string v4, ""

    .line 650
    .line 651
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    sput-object v0, Landroidx/compose/material/icons/rounded/LunchDiningKt;->_lunchDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 660
    .line 661
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    return-object v0
.end method

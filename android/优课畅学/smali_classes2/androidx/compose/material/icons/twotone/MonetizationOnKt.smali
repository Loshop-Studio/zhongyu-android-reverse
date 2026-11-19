.class public final Landroidx/compose/material/icons/twotone/MonetizationOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _monetizationOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMonetizationOn(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MonetizationOnKt;->_monetizationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.MonetizationOn"

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
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

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
    const v4, 0x4065c28f    # 3.59f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f9a3d71    # -3.59f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f000000    # -8.0f

    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, 0x418aa3d7    # 17.33f

    .line 121
    .line 122
    .line 123
    const v6, 0x4153ae14    # 13.23f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x41980000    # 19.0f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v4, 0x412e6666    # 10.9f

    .line 135
    .line 136
    .line 137
    const/high16 v6, 0x41980000    # 19.0f

    .line 138
    .line 139
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, -0x4027ae14    # -1.69f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v25, -0x3fc8f5c3    # -2.86f

    .line 149
    .line 150
    .line 151
    const v26, -0x3fc1eb85    # -2.97f

    .line 152
    .line 153
    .line 154
    const/high16 v21, -0x40400000    # -1.5f

    .line 155
    .line 156
    const v22, -0x416147ae    # -0.31f

    .line 157
    .line 158
    .line 159
    const v23, -0x3fceb852    # -2.77f

    .line 160
    .line 161
    .line 162
    const v24, -0x405c28f6    # -1.28f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, 0x3fdae148    # 1.71f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v25, 0x40147ae1    # 2.32f

    .line 175
    .line 176
    .line 177
    const v26, 0x3fd1eb85    # 1.64f

    .line 178
    .line 179
    .line 180
    const v21, 0x3db851ec    # 0.09f

    .line 181
    .line 182
    .line 183
    const v22, 0x3f6b851f    # 0.92f

    .line 184
    .line 185
    .line 186
    const v23, 0x3f3851ec    # 0.72f

    .line 187
    .line 188
    .line 189
    const v24, 0x3fd1eb85    # 1.64f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v25, 0x40066666    # 2.1f

    .line 196
    .line 197
    .line 198
    const v26, -0x404e147b    # -1.39f

    .line 199
    .line 200
    .line 201
    const v21, 0x3fdae148    # 1.71f

    .line 202
    .line 203
    .line 204
    const/16 v22, 0x0

    .line 205
    .line 206
    const v23, 0x40066666    # 2.1f

    .line 207
    .line 208
    .line 209
    const v24, -0x40a3d70a    # -0.86f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v25, -0x3fea3d71    # -2.34f

    .line 216
    .line 217
    .line 218
    const v26, -0x4010a3d7    # -1.87f

    .line 219
    .line 220
    .line 221
    const/16 v21, 0x0

    .line 222
    .line 223
    const v22, -0x40c51eb8    # -0.73f

    .line 224
    .line 225
    .line 226
    const v23, -0x413851ec    # -0.39f

    .line 227
    .line 228
    .line 229
    const v24, -0x404b851f    # -1.41f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v25, -0x3f95c28f    # -3.66f

    .line 236
    .line 237
    .line 238
    const v26, -0x3fb28f5c    # -3.21f

    .line 239
    .line 240
    .line 241
    const v21, -0x3ff51eb8    # -2.17f

    .line 242
    .line 243
    .line 244
    const v22, -0x40f851ec    # -0.53f

    .line 245
    .line 246
    .line 247
    const v23, -0x3f95c28f    # -3.66f

    .line 248
    .line 249
    .line 250
    const v24, -0x404a3d71    # -1.42f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v25, 0x402e147b    # 2.72f

    .line 257
    .line 258
    .line 259
    const v26, -0x3fcc28f6    # -2.81f

    .line 260
    .line 261
    .line 262
    const/16 v21, 0x0

    .line 263
    .line 264
    const v22, -0x403eb852    # -1.51f

    .line 265
    .line 266
    .line 267
    const v23, 0x3f9c28f6    # 1.22f

    .line 268
    .line 269
    .line 270
    const v24, -0x3fe147ae    # -2.48f

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x412e3d71    # 10.89f

    .line 277
    .line 278
    .line 279
    const/high16 v6, 0x40a00000    # 5.0f

    .line 280
    .line 281
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v4, 0x4015c28f    # 2.34f

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v4, 0x3fdae148    # 1.71f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v25, 0x401f5c29    # 2.49f

    .line 297
    .line 298
    .line 299
    const v26, 0x403e147b    # 2.97f

    .line 300
    .line 301
    .line 302
    const v21, 0x3fd0a3d7    # 1.63f

    .line 303
    .line 304
    .line 305
    const v22, 0x3ec7ae14    # 0.39f

    .line 306
    .line 307
    .line 308
    const v23, 0x401c28f6    # 2.44f

    .line 309
    .line 310
    .line 311
    const v24, 0x3fd0a3d7    # 1.63f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v4, -0x40251eb8    # -1.71f

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v25, -0x4007ae14    # -1.94f

    .line 324
    .line 325
    .line 326
    const v26, -0x402e147b    # -1.64f

    .line 327
    .line 328
    .line 329
    const v21, -0x42dc28f6    # -0.04f

    .line 330
    .line 331
    .line 332
    const v22, -0x4087ae14    # -0.97f

    .line 333
    .line 334
    .line 335
    const v23, -0x40f0a3d7    # -0.56f

    .line 336
    .line 337
    .line 338
    const v24, -0x402e147b    # -1.64f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v25, -0x3ff9999a    # -2.1f

    .line 345
    .line 346
    .line 347
    const v26, 0x3fb70a3d    # 1.43f

    .line 348
    .line 349
    .line 350
    const v21, -0x405851ec    # -1.31f

    .line 351
    .line 352
    .line 353
    const/16 v22, 0x0

    .line 354
    .line 355
    const v23, -0x3ff9999a    # -2.1f

    .line 356
    .line 357
    .line 358
    const v24, 0x3f170a3d    # 0.59f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v25, 0x4015c28f    # 2.34f

    .line 365
    .line 366
    .line 367
    const v26, 0x3fd5c28f    # 1.67f

    .line 368
    .line 369
    .line 370
    const/16 v21, 0x0

    .line 371
    .line 372
    const v22, 0x3f3ae148    # 0.73f

    .line 373
    .line 374
    .line 375
    const v23, 0x3f11eb85    # 0.57f

    .line 376
    .line 377
    .line 378
    const v24, 0x3f9c28f6    # 1.22f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v25, 0x406a3d71    # 3.66f

    .line 385
    .line 386
    .line 387
    const v26, 0x405ae148    # 3.42f

    .line 388
    .line 389
    .line 390
    const v21, 0x3fe28f5c    # 1.77f

    .line 391
    .line 392
    .line 393
    const v22, 0x3eeb851f    # 0.46f

    .line 394
    .line 395
    .line 396
    const v23, 0x406a3d71    # 3.66f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v25, -0x3fd0a3d7    # -2.74f

    .line 403
    .line 404
    .line 405
    const v26, 0x403147ae    # 2.77f

    .line 406
    .line 407
    .line 408
    const v21, -0x43dc28f6    # -0.01f

    .line 409
    .line 410
    .line 411
    const v22, 0x3fcccccd    # 1.6f

    .line 412
    .line 413
    .line 414
    const v23, -0x40651eb8    # -1.21f

    .line 415
    .line 416
    .line 417
    const v24, 0x401eb852    # 2.48f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    const/16 v16, 0x3800

    .line 431
    .line 432
    const/16 v17, 0x0

    .line 433
    .line 434
    const v6, 0x3e99999a    # 0.3f

    .line 435
    .line 436
    .line 437
    const v8, 0x3e99999a    # 0.3f

    .line 438
    .line 439
    .line 440
    const/4 v7, 0x0

    .line 441
    const/high16 v9, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/high16 v12, 0x3f800000    # 1.0f

    .line 444
    .line 445
    const/4 v13, 0x0

    .line 446
    const/4 v14, 0x0

    .line 447
    const/4 v15, 0x0

    .line 448
    const-string v4, ""

    .line 449
    .line 450
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 451
    .line 452
    .line 453
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 458
    .line 459
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 460
    .line 461
    .line 462
    move-result-wide v6

    .line 463
    const/4 v0, 0x0

    .line 464
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 468
    .line 469
    .line 470
    move-result v10

    .line 471
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 472
    .line 473
    .line 474
    move-result v11

    .line 475
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 478
    .line 479
    .line 480
    const/high16 v0, 0x40000000    # 2.0f

    .line 481
    .line 482
    const/high16 v2, 0x41400000    # 12.0f

    .line 483
    .line 484
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v17, 0x40000000    # 2.0f

    .line 488
    .line 489
    const/high16 v18, 0x41400000    # 12.0f

    .line 490
    .line 491
    const v13, 0x40cf5c29    # 6.48f

    .line 492
    .line 493
    .line 494
    const/high16 v14, 0x40000000    # 2.0f

    .line 495
    .line 496
    const/high16 v15, 0x40000000    # 2.0f

    .line 497
    .line 498
    const v16, 0x40cf5c29    # 6.48f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v0, 0x408f5c29    # 4.48f

    .line 505
    .line 506
    .line 507
    const/high16 v2, 0x41200000    # 10.0f

    .line 508
    .line 509
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, -0x3f70a3d7    # -4.48f

    .line 513
    .line 514
    .line 515
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 516
    .line 517
    const/high16 v4, 0x41200000    # 10.0f

    .line 518
    .line 519
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x418c28f6    # 17.52f

    .line 523
    .line 524
    .line 525
    const/high16 v2, 0x40000000    # 2.0f

    .line 526
    .line 527
    const/high16 v4, 0x41400000    # 12.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v0, 0x41a00000    # 20.0f

    .line 536
    .line 537
    const/high16 v2, 0x41400000    # 12.0f

    .line 538
    .line 539
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, -0x3f000000    # -8.0f

    .line 543
    .line 544
    const/high16 v18, -0x3f000000    # -8.0f

    .line 545
    .line 546
    const v13, -0x3f72e148    # -4.41f

    .line 547
    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    const/high16 v15, -0x3f000000    # -8.0f

    .line 551
    .line 552
    const v16, -0x3f9a3d71    # -3.59f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x4065c28f    # 3.59f

    .line 559
    .line 560
    .line 561
    const/high16 v2, -0x3f000000    # -8.0f

    .line 562
    .line 563
    const/high16 v4, 0x41000000    # 8.0f

    .line 564
    .line 565
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v2, 0x41000000    # 8.0f

    .line 569
    .line 570
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, -0x3f9a3d71    # -3.59f

    .line 574
    .line 575
    .line 576
    const/high16 v2, -0x3f000000    # -8.0f

    .line 577
    .line 578
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, 0x4144f5c3    # 12.31f

    .line 585
    .line 586
    .line 587
    const v2, 0x41323d71    # 11.14f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v17, -0x3fea3d71    # -2.34f

    .line 594
    .line 595
    .line 596
    const v18, -0x402a3d71    # -1.67f

    .line 597
    .line 598
    .line 599
    const v13, -0x401d70a4    # -1.77f

    .line 600
    .line 601
    .line 602
    const v14, -0x4119999a    # -0.45f

    .line 603
    .line 604
    .line 605
    const v15, -0x3fea3d71    # -2.34f

    .line 606
    .line 607
    .line 608
    const v16, -0x408f5c29    # -0.94f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, 0x40066666    # 2.1f

    .line 615
    .line 616
    .line 617
    const v18, -0x4048f5c3    # -1.43f

    .line 618
    .line 619
    .line 620
    const/4 v13, 0x0

    .line 621
    const v14, -0x40a8f5c3    # -0.84f

    .line 622
    .line 623
    .line 624
    const v15, 0x3f4a3d71    # 0.79f

    .line 625
    .line 626
    .line 627
    const v16, -0x4048f5c3    # -1.43f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v17, 0x3ff851ec    # 1.94f

    .line 634
    .line 635
    .line 636
    const v18, 0x3fd1eb85    # 1.64f

    .line 637
    .line 638
    .line 639
    const v13, 0x3fb0a3d7    # 1.38f

    .line 640
    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const v15, 0x3ff33333    # 1.9f

    .line 644
    .line 645
    .line 646
    const v16, 0x3f28f5c3    # 0.66f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x3fdae148    # 1.71f

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 656
    .line 657
    .line 658
    const v17, -0x3fe0a3d7    # -2.49f

    .line 659
    .line 660
    .line 661
    const v18, -0x3fc1eb85    # -2.97f

    .line 662
    .line 663
    .line 664
    const v13, -0x42b33333    # -0.05f

    .line 665
    .line 666
    .line 667
    const v14, -0x40547ae1    # -1.34f

    .line 668
    .line 669
    .line 670
    const v15, -0x40a147ae    # -0.87f

    .line 671
    .line 672
    .line 673
    const v16, -0x3fdb851f    # -2.57f

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v0, 0x40a00000    # 5.0f

    .line 680
    .line 681
    const v2, 0x4153ae14    # 13.23f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v2, 0x412e6666    # 10.9f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, 0x3fd851ec    # 1.69f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v17, -0x3fd1eb85    # -2.72f

    .line 700
    .line 701
    .line 702
    const v18, 0x4033d70a    # 2.81f

    .line 703
    .line 704
    .line 705
    const v13, -0x403eb852    # -1.51f

    .line 706
    .line 707
    .line 708
    const v14, 0x3ea3d70a    # 0.32f

    .line 709
    .line 710
    .line 711
    const v15, -0x3fd1eb85    # -2.72f

    .line 712
    .line 713
    .line 714
    const v16, 0x3fa66666    # 1.3f

    .line 715
    .line 716
    .line 717
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v17, 0x406a3d71    # 3.66f

    .line 721
    .line 722
    .line 723
    const v18, 0x404d70a4    # 3.21f

    .line 724
    .line 725
    .line 726
    const/4 v13, 0x0

    .line 727
    const v14, 0x3fe51eb8    # 1.79f

    .line 728
    .line 729
    .line 730
    const v15, 0x3fbeb852    # 1.49f

    .line 731
    .line 732
    .line 733
    const v16, 0x402c28f6    # 2.69f

    .line 734
    .line 735
    .line 736
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v17, 0x4015c28f    # 2.34f

    .line 740
    .line 741
    .line 742
    const v18, 0x3fef5c29    # 1.87f

    .line 743
    .line 744
    .line 745
    const v13, 0x3ff9999a    # 1.95f

    .line 746
    .line 747
    .line 748
    const v14, 0x3eeb851f    # 0.46f

    .line 749
    .line 750
    .line 751
    const v15, 0x4015c28f    # 2.34f

    .line 752
    .line 753
    .line 754
    const v16, 0x3f933333    # 1.15f

    .line 755
    .line 756
    .line 757
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v17, -0x3ff9999a    # -2.1f

    .line 761
    .line 762
    .line 763
    const v18, 0x3fb1eb85    # 1.39f

    .line 764
    .line 765
    .line 766
    const/4 v13, 0x0

    .line 767
    const v14, 0x3f07ae14    # 0.53f

    .line 768
    .line 769
    .line 770
    const v15, -0x413851ec    # -0.39f

    .line 771
    .line 772
    .line 773
    const v16, 0x3fb1eb85    # 1.39f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v17, -0x3feb851f    # -2.32f

    .line 780
    .line 781
    .line 782
    const v18, -0x402e147b    # -1.64f

    .line 783
    .line 784
    .line 785
    const v13, -0x40333333    # -1.6f

    .line 786
    .line 787
    .line 788
    const/4 v14, 0x0

    .line 789
    const v15, -0x3ff147ae    # -2.23f

    .line 790
    .line 791
    .line 792
    const v16, -0x40c7ae14    # -0.72f

    .line 793
    .line 794
    .line 795
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    .line 798
    const v0, 0x4100a3d7    # 8.04f

    .line 799
    .line 800
    .line 801
    const v2, 0x416547ae    # 14.33f

    .line 802
    .line 803
    .line 804
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    const v17, 0x40370a3d    # 2.86f

    .line 808
    .line 809
    .line 810
    const v18, 0x403e147b    # 2.97f

    .line 811
    .line 812
    .line 813
    const v13, 0x3dcccccd    # 0.1f

    .line 814
    .line 815
    .line 816
    const v14, 0x3fd9999a    # 1.7f

    .line 817
    .line 818
    .line 819
    const v15, 0x3fae147b    # 1.36f

    .line 820
    .line 821
    .line 822
    const v16, 0x402a3d71    # 2.66f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v0, 0x412e6666    # 10.9f

    .line 829
    .line 830
    .line 831
    const/high16 v2, 0x41980000    # 19.0f

    .line 832
    .line 833
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v0, 0x4015c28f    # 2.34f

    .line 837
    .line 838
    .line 839
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const v0, -0x402a3d71    # -1.67f

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v17, 0x402eb852    # 2.73f

    .line 849
    .line 850
    .line 851
    const v18, -0x3fceb852    # -2.77f

    .line 852
    .line 853
    .line 854
    const v13, 0x3fc28f5c    # 1.52f

    .line 855
    .line 856
    .line 857
    const v14, -0x416b851f    # -0.29f

    .line 858
    .line 859
    .line 860
    const v15, 0x402e147b    # 2.72f

    .line 861
    .line 862
    .line 863
    const v16, -0x406b851f    # -1.16f

    .line 864
    .line 865
    .line 866
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v17, -0x3f95c28f    # -3.66f

    .line 870
    .line 871
    .line 872
    const v18, -0x3fa51eb8    # -3.42f

    .line 873
    .line 874
    .line 875
    const v13, -0x43dc28f6    # -0.01f

    .line 876
    .line 877
    .line 878
    const v14, -0x3ff33333    # -2.2f

    .line 879
    .line 880
    .line 881
    const v15, -0x400ccccd    # -1.9f

    .line 882
    .line 883
    .line 884
    const v16, -0x3fc28f5c    # -2.96f

    .line 885
    .line 886
    .line 887
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    const/16 v16, 0x3800

    .line 898
    .line 899
    const/16 v17, 0x0

    .line 900
    .line 901
    const/high16 v6, 0x3f800000    # 1.0f

    .line 902
    .line 903
    const/high16 v8, 0x3f800000    # 1.0f

    .line 904
    .line 905
    const/4 v7, 0x0

    .line 906
    const/high16 v12, 0x3f800000    # 1.0f

    .line 907
    .line 908
    const/4 v13, 0x0

    .line 909
    const/4 v14, 0x0

    .line 910
    const/4 v15, 0x0

    .line 911
    const-string v4, ""

    .line 912
    .line 913
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    sput-object v0, Landroidx/compose/material/icons/twotone/MonetizationOnKt;->_monetizationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 922
    .line 923
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/outlined/ColorLensKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _colorLens:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getColorLens(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ColorLensKt;->_colorLens:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ColorLens"

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
    const/high16 v4, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v26, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v21, 0x40cfae14    # 6.49f

    .line 82
    .line 83
    .line 84
    const/high16 v22, 0x41b00000    # 22.0f

    .line 85
    .line 86
    const/high16 v23, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v24, 0x418c147b    # 17.51f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x40cfae14    # 6.49f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40000000    # 2.0f

    .line 100
    .line 101
    const/high16 v7, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x408147ae    # 4.04f

    .line 107
    .line 108
    .line 109
    const/high16 v6, 0x41100000    # 9.0f

    .line 110
    .line 111
    const/high16 v7, 0x41200000    # 10.0f

    .line 112
    .line 113
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, -0x3f400000    # -6.0f

    .line 117
    .line 118
    const/high16 v26, 0x40c00000    # 6.0f

    .line 119
    .line 120
    const/16 v21, 0x0

    .line 121
    .line 122
    const v22, 0x4053d70a    # 3.31f

    .line 123
    .line 124
    .line 125
    const v23, -0x3fd3d70a    # -2.69f

    .line 126
    .line 127
    .line 128
    const/high16 v24, 0x40c00000    # 6.0f

    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, -0x401d70a4    # -1.77f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v25, -0x41000000    # -0.5f

    .line 140
    .line 141
    const/high16 v26, 0x3f000000    # 0.5f

    .line 142
    .line 143
    const v21, -0x4170a3d7    # -0.28f

    .line 144
    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const/high16 v23, -0x41000000    # -0.5f

    .line 149
    .line 150
    const v24, 0x3e6147ae    # 0.22f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v25, 0x3e051eb8    # 0.13f

    .line 157
    .line 158
    .line 159
    const v26, 0x3ea8f5c3    # 0.33f

    .line 160
    .line 161
    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    const v22, 0x3df5c28f    # 0.12f

    .line 165
    .line 166
    .line 167
    const v23, 0x3d4ccccd    # 0.05f

    .line 168
    .line 169
    .line 170
    const v24, 0x3e6b851f    # 0.23f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, 0x3f23d70a    # 0.64f

    .line 177
    .line 178
    .line 179
    const v26, 0x3fd5c28f    # 1.67f

    .line 180
    .line 181
    .line 182
    const v21, 0x3ed1eb85    # 0.41f

    .line 183
    .line 184
    .line 185
    const v22, 0x3ef0a3d7    # 0.47f

    .line 186
    .line 187
    .line 188
    const v23, 0x3f23d70a    # 0.64f

    .line 189
    .line 190
    .line 191
    const v24, 0x3f87ae14    # 1.06f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 198
    .line 199
    const/high16 v26, 0x40200000    # 2.5f

    .line 200
    .line 201
    const/16 v21, 0x0

    .line 202
    .line 203
    const v22, 0x3fb0a3d7    # 1.38f

    .line 204
    .line 205
    .line 206
    const v23, -0x4070a3d7    # -1.12f

    .line 207
    .line 208
    .line 209
    const/high16 v24, 0x40200000    # 2.5f

    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v4, 0x40800000    # 4.0f

    .line 218
    .line 219
    const/high16 v6, 0x41400000    # 12.0f

    .line 220
    .line 221
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v25, -0x3f000000    # -8.0f

    .line 225
    .line 226
    const/high16 v26, 0x41000000    # 8.0f

    .line 227
    .line 228
    const v21, -0x3f72e148    # -4.41f

    .line 229
    .line 230
    .line 231
    const/16 v22, 0x0

    .line 232
    .line 233
    const/high16 v23, -0x3f000000    # -8.0f

    .line 234
    .line 235
    const v24, 0x4065c28f    # 3.59f

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x4065c28f    # 3.59f

    .line 242
    .line 243
    .line 244
    const/high16 v6, 0x41000000    # 8.0f

    .line 245
    .line 246
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v25, 0x3f000000    # 0.5f

    .line 250
    .line 251
    const/high16 v26, -0x41000000    # -0.5f

    .line 252
    .line 253
    const v21, 0x3e8f5c29    # 0.28f

    .line 254
    .line 255
    .line 256
    const/high16 v23, 0x3f000000    # 0.5f

    .line 257
    .line 258
    const v24, -0x419eb852    # -0.22f

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v25, -0x41f0a3d7    # -0.14f

    .line 265
    .line 266
    .line 267
    const v26, -0x414ccccd    # -0.35f

    .line 268
    .line 269
    .line 270
    const/16 v21, 0x0

    .line 271
    .line 272
    const v22, -0x41dc28f6    # -0.16f

    .line 273
    .line 274
    .line 275
    const v23, -0x425c28f6    # -0.08f

    .line 276
    .line 277
    .line 278
    const v24, -0x4170a3d7    # -0.28f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v25, -0x40deb852    # -0.63f

    .line 285
    .line 286
    .line 287
    const v26, -0x402ccccd    # -1.65f

    .line 288
    .line 289
    .line 290
    const v21, -0x412e147b    # -0.41f

    .line 291
    .line 292
    .line 293
    const v22, -0x41147ae1    # -0.46f

    .line 294
    .line 295
    .line 296
    const v23, -0x40deb852    # -0.63f

    .line 297
    .line 298
    .line 299
    const v24, -0x4079999a    # -1.05f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v25, 0x40200000    # 2.5f

    .line 306
    .line 307
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 308
    .line 309
    const/16 v21, 0x0

    .line 310
    .line 311
    const v22, -0x404f5c29    # -1.38f

    .line 312
    .line 313
    .line 314
    const v23, 0x3f8f5c29    # 1.12f

    .line 315
    .line 316
    .line 317
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 318
    .line 319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x41800000    # 16.0f

    .line 323
    .line 324
    const/high16 v6, 0x41700000    # 15.0f

    .line 325
    .line 326
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v25, 0x40800000    # 4.0f

    .line 330
    .line 331
    const/high16 v26, -0x3f800000    # -4.0f

    .line 332
    .line 333
    const v21, 0x400d70a4    # 2.21f

    .line 334
    .line 335
    .line 336
    const/16 v22, 0x0

    .line 337
    .line 338
    const/high16 v23, 0x40800000    # 4.0f

    .line 339
    .line 340
    const v24, -0x401ae148    # -1.79f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v25, -0x3f000000    # -8.0f

    .line 347
    .line 348
    const/high16 v26, -0x3f200000    # -7.0f

    .line 349
    .line 350
    const/16 v21, 0x0

    .line 351
    .line 352
    const v22, -0x3f88f5c3    # -3.86f

    .line 353
    .line 354
    .line 355
    const v23, -0x3f9a3d71    # -3.59f

    .line 356
    .line 357
    .line 358
    const/high16 v24, -0x3f200000    # -7.0f

    .line 359
    .line 360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    const/16 v16, 0x3800

    .line 371
    .line 372
    const/16 v17, 0x0

    .line 373
    .line 374
    const/high16 v6, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/high16 v8, 0x3f800000    # 1.0f

    .line 377
    .line 378
    const/4 v7, 0x0

    .line 379
    const/high16 v9, 0x3f800000    # 1.0f

    .line 380
    .line 381
    const/high16 v12, 0x3f800000    # 1.0f

    .line 382
    .line 383
    const/4 v13, 0x0

    .line 384
    const/4 v14, 0x0

    .line 385
    const/4 v15, 0x0

    .line 386
    const-string v4, ""

    .line 387
    .line 388
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 389
    .line 390
    .line 391
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 392
    .line 393
    .line 394
    move-result v3

    .line 395
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 396
    .line 397
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 398
    .line 399
    .line 400
    move-result-wide v6

    .line 401
    const/4 v2, 0x0

    .line 402
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 410
    .line 411
    .line 412
    move-result v11

    .line 413
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 416
    .line 417
    .line 418
    const/high16 v4, 0x40d00000    # 6.5f

    .line 419
    .line 420
    const/high16 v6, 0x41380000    # 11.5f

    .line 421
    .line 422
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/4 v4, 0x0

    .line 426
    const/high16 v6, -0x40400000    # -1.5f

    .line 427
    .line 428
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v26, 0x40400000    # 3.0f

    .line 432
    .line 433
    const/16 v27, 0x0

    .line 434
    .line 435
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 436
    .line 437
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 438
    .line 439
    const/16 v23, 0x0

    .line 440
    .line 441
    const/16 v24, 0x1

    .line 442
    .line 443
    const/16 v25, 0x1

    .line 444
    .line 445
    move-object/from16 v20, v2

    .line 446
    .line 447
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 451
    .line 452
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    const/high16 v6, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/4 v7, 0x0

    .line 462
    const-string v4, ""

    .line 463
    .line 464
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 465
    .line 466
    .line 467
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 472
    .line 473
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 474
    .line 475
    .line 476
    move-result-wide v6

    .line 477
    const/4 v2, 0x0

    .line 478
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 482
    .line 483
    .line 484
    move-result v10

    .line 485
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 486
    .line 487
    .line 488
    move-result v11

    .line 489
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 492
    .line 493
    .line 494
    const/high16 v4, 0x41180000    # 9.5f

    .line 495
    .line 496
    const/high16 v6, 0x40f00000    # 7.5f

    .line 497
    .line 498
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/4 v4, 0x0

    .line 502
    const/high16 v6, -0x40400000    # -1.5f

    .line 503
    .line 504
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v26, 0x40400000    # 3.0f

    .line 508
    .line 509
    move-object/from16 v20, v2

    .line 510
    .line 511
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 515
    .line 516
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    const/high16 v6, 0x3f800000    # 1.0f

    .line 524
    .line 525
    const/4 v7, 0x0

    .line 526
    const-string v4, ""

    .line 527
    .line 528
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 529
    .line 530
    .line 531
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 536
    .line 537
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 538
    .line 539
    .line 540
    move-result-wide v6

    .line 541
    const/4 v2, 0x0

    .line 542
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 546
    .line 547
    .line 548
    move-result v10

    .line 549
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 550
    .line 551
    .line 552
    move-result v11

    .line 553
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 556
    .line 557
    .line 558
    const/high16 v4, 0x41680000    # 14.5f

    .line 559
    .line 560
    const/high16 v6, 0x40f00000    # 7.5f

    .line 561
    .line 562
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/4 v4, 0x0

    .line 566
    const/high16 v6, -0x40400000    # -1.5f

    .line 567
    .line 568
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v26, 0x40400000    # 3.0f

    .line 572
    .line 573
    move-object/from16 v20, v2

    .line 574
    .line 575
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 579
    .line 580
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    const/high16 v6, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/4 v7, 0x0

    .line 590
    const-string v4, ""

    .line 591
    .line 592
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 593
    .line 594
    .line 595
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 600
    .line 601
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 602
    .line 603
    .line 604
    move-result-wide v6

    .line 605
    const/4 v0, 0x0

    .line 606
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 610
    .line 611
    .line 612
    move-result v10

    .line 613
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 614
    .line 615
    .line 616
    move-result v11

    .line 617
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 620
    .line 621
    .line 622
    const/high16 v0, 0x418c0000    # 17.5f

    .line 623
    .line 624
    const/high16 v2, 0x41380000    # 11.5f

    .line 625
    .line 626
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/4 v0, 0x0

    .line 630
    const/high16 v2, -0x40400000    # -1.5f

    .line 631
    .line 632
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v18, 0x40400000    # 3.0f

    .line 636
    .line 637
    const/16 v19, 0x0

    .line 638
    .line 639
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 640
    .line 641
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 642
    .line 643
    const/16 v16, 0x1

    .line 644
    .line 645
    const/16 v17, 0x1

    .line 646
    .line 647
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 651
    .line 652
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    const/16 v16, 0x3800

    .line 660
    .line 661
    const/16 v17, 0x0

    .line 662
    .line 663
    const/high16 v6, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const/4 v7, 0x0

    .line 666
    const/high16 v12, 0x3f800000    # 1.0f

    .line 667
    .line 668
    const/4 v13, 0x0

    .line 669
    const/4 v14, 0x0

    .line 670
    const-string v4, ""

    .line 671
    .line 672
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    sput-object v0, Landroidx/compose/material/icons/outlined/ColorLensKt;->_colorLens:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 681
    .line 682
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    return-object v0
.end method

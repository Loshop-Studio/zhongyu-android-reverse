.class public final Landroidx/compose/material/icons/filled/SpatialAudioOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpatialAudioOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SpatialAudioOffKt;->_spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SpatialAudioOff"

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
    const/high16 v4, 0x41200000    # 10.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3f800000    # -4.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x41000000    # 8.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40800000    # 4.0f

    .line 88
    .line 89
    const/high16 v22, 0x40800000    # 4.0f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3f000000    # -8.0f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const v4, 0x41831eb8    # 16.39f

    .line 160
    .line 161
    .line 162
    const v6, 0x4178f5c3    # 15.56f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, 0x41200000    # 10.0f

    .line 169
    .line 170
    const/high16 v26, 0x41600000    # 14.0f

    .line 171
    .line 172
    const v21, 0x416b5c29    # 14.71f

    .line 173
    .line 174
    .line 175
    const v22, 0x416b3333    # 14.7f

    .line 176
    .line 177
    .line 178
    const v23, 0x41487ae1    # 12.53f

    .line 179
    .line 180
    .line 181
    const/high16 v24, 0x41600000    # 14.0f

    .line 182
    .line 183
    move-object/from16 v20, v2

    .line 184
    .line 185
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v25, -0x3f33851f    # -6.39f

    .line 189
    .line 190
    .line 191
    const v26, 0x3fc7ae14    # 1.56f

    .line 192
    .line 193
    .line 194
    const v21, -0x3fde147b    # -2.53f

    .line 195
    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    const v23, -0x3f6947ae    # -4.71f

    .line 200
    .line 201
    .line 202
    const v24, 0x3f333333    # 0.7f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v25, 0x40000000    # 2.0f

    .line 209
    .line 210
    const v26, 0x4191c28f    # 18.22f

    .line 211
    .line 212
    .line 213
    const v21, 0x40270a3d    # 2.61f

    .line 214
    .line 215
    .line 216
    const v22, 0x41808f5c    # 16.07f

    .line 217
    .line 218
    .line 219
    const/high16 v23, 0x40000000    # 2.0f

    .line 220
    .line 221
    const v24, 0x4188cccd    # 17.1f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v4, 0x41a80000    # 21.0f

    .line 228
    .line 229
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v4, 0x41800000    # 16.0f

    .line 233
    .line 234
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, -0x3fce147b    # -2.78f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v25, 0x41831eb8    # 16.39f

    .line 244
    .line 245
    .line 246
    const v26, 0x4178f5c3    # 15.56f

    .line 247
    .line 248
    .line 249
    const/high16 v21, 0x41900000    # 18.0f

    .line 250
    .line 251
    const v22, 0x4188cccd    # 17.1f

    .line 252
    .line 253
    .line 254
    const v23, 0x418b1eb8    # 17.39f

    .line 255
    .line 256
    .line 257
    const v24, 0x41808f5c    # 16.07f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const/high16 v6, 0x3f800000    # 1.0f

    .line 271
    .line 272
    const/4 v7, 0x0

    .line 273
    const-string v4, ""

    .line 274
    .line 275
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 276
    .line 277
    .line 278
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 283
    .line 284
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 285
    .line 286
    .line 287
    move-result-wide v6

    .line 288
    const/4 v2, 0x0

    .line 289
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 297
    .line 298
    .line 299
    move-result v11

    .line 300
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 303
    .line 304
    .line 305
    const v4, 0x41a2e148    # 20.36f

    .line 306
    .line 307
    .line 308
    const/high16 v6, 0x3f800000    # 1.0f

    .line 309
    .line 310
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v4, -0x404b851f    # -1.41f

    .line 314
    .line 315
    .line 316
    const v6, 0x3fb47ae1    # 1.41f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/16 v25, 0x0

    .line 323
    .line 324
    const v26, 0x411e6666    # 9.9f

    .line 325
    .line 326
    .line 327
    const v21, 0x402eb852    # 2.73f

    .line 328
    .line 329
    .line 330
    const v22, 0x402eb852    # 2.73f

    .line 331
    .line 332
    .line 333
    const v23, 0x402eb852    # 2.73f

    .line 334
    .line 335
    .line 336
    const v24, 0x40e570a4    # 7.17f

    .line 337
    .line 338
    .line 339
    move-object/from16 v20, v2

    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, 0x3fb47ae1    # 1.41f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v25, 0x41a2e148    # 20.36f

    .line 351
    .line 352
    .line 353
    const/high16 v26, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const v21, 0x41bf0a3d    # 23.88f

    .line 356
    .line 357
    .line 358
    const v22, 0x41235c29    # 10.21f

    .line 359
    .line 360
    .line 361
    const v23, 0x41bf0a3d    # 23.88f

    .line 362
    .line 363
    .line 364
    const v24, 0x409051ec    # 4.51f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    const/high16 v6, 0x3f800000    # 1.0f

    .line 378
    .line 379
    const/4 v7, 0x0

    .line 380
    const-string v4, ""

    .line 381
    .line 382
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 383
    .line 384
    .line 385
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 390
    .line 391
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 392
    .line 393
    .line 394
    move-result-wide v6

    .line 395
    const/4 v0, 0x0

    .line 396
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 400
    .line 401
    .line 402
    move-result v10

    .line 403
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 404
    .line 405
    .line 406
    move-result v11

    .line 407
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 410
    .line 411
    .line 412
    const v0, 0x412e6666    # 10.9f

    .line 413
    .line 414
    .line 415
    const v2, 0x418c51ec    # 17.54f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/16 v17, 0x0

    .line 422
    .line 423
    const v18, -0x3f1dc28f    # -7.07f

    .line 424
    .line 425
    .line 426
    const v13, 0x3ff9999a    # 1.95f

    .line 427
    .line 428
    .line 429
    const v14, -0x40066666    # -1.95f

    .line 430
    .line 431
    .line 432
    const v15, 0x3ff9999a    # 1.95f

    .line 433
    .line 434
    .line 435
    const v16, -0x3f5c28f6    # -5.12f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, -0x404b851f    # -1.41f

    .line 442
    .line 443
    .line 444
    const v2, 0x3fb47ae1    # 1.41f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v18, 0x4087ae14    # 4.24f

    .line 451
    .line 452
    .line 453
    const v13, 0x3f95c28f    # 1.17f

    .line 454
    .line 455
    .line 456
    const v14, 0x3f95c28f    # 1.17f

    .line 457
    .line 458
    .line 459
    const v15, 0x3f95c28f    # 1.17f

    .line 460
    .line 461
    .line 462
    const v16, 0x40447ae1    # 3.07f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x412e6666    # 10.9f

    .line 469
    .line 470
    .line 471
    const v2, 0x418c51ec    # 17.54f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    const/16 v16, 0x3800

    .line 485
    .line 486
    const/16 v17, 0x0

    .line 487
    .line 488
    const/high16 v6, 0x3f800000    # 1.0f

    .line 489
    .line 490
    const/4 v7, 0x0

    .line 491
    const/high16 v12, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/4 v13, 0x0

    .line 494
    const/4 v14, 0x0

    .line 495
    const/4 v15, 0x0

    .line 496
    const-string v4, ""

    .line 497
    .line 498
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    sput-object v0, Landroidx/compose/material/icons/filled/SpatialAudioOffKt;->_spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 507
    .line 508
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    return-object v0
.end method

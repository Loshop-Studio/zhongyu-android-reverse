.class public final Landroidx/compose/material/icons/rounded/FlipCameraAndroidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _flipCameraAndroid:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlipCameraAndroid(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FlipCameraAndroidKt;->_flipCameraAndroid:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FlipCameraAndroid"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x41100000    # 9.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v26, 0x40400000    # 3.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x3fd47ae1    # 1.66f

    .line 84
    .line 85
    .line 86
    const v23, 0x3fab851f    # 1.34f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40400000    # 3.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, -0x40547ae1    # -1.34f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40400000    # 3.0f

    .line 100
    .line 101
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 102
    .line 103
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x412570a4    # 10.34f

    .line 112
    .line 113
    .line 114
    const/high16 v6, 0x41400000    # 12.0f

    .line 115
    .line 116
    const/high16 v7, 0x41100000    # 9.0f

    .line 117
    .line 118
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const/16 v16, 0x3800

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    const/high16 v6, 0x3f800000    # 1.0f

    .line 133
    .line 134
    const/high16 v8, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/4 v7, 0x0

    .line 137
    const/high16 v9, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const/high16 v12, 0x3f800000    # 1.0f

    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    const/4 v14, 0x0

    .line 143
    const/4 v15, 0x0

    .line 144
    const-string v4, ""

    .line 145
    .line 146
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 147
    .line 148
    .line 149
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 154
    .line 155
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 156
    .line 157
    .line 158
    move-result-wide v6

    .line 159
    const/4 v2, 0x0

    .line 160
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const/high16 v4, 0x41000000    # 8.0f

    .line 177
    .line 178
    const/high16 v6, 0x41100000    # 9.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v25, -0x40800000    # -1.0f

    .line 187
    .line 188
    const/high16 v26, -0x40800000    # -1.0f

    .line 189
    .line 190
    const v22, -0x40f33333    # -0.55f

    .line 191
    .line 192
    .line 193
    const v23, -0x4119999a    # -0.45f

    .line 194
    .line 195
    .line 196
    const/high16 v24, -0x40800000    # -1.0f

    .line 197
    .line 198
    move-object/from16 v20, v2

    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, 0x40a2e148    # 5.09f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v25, 0x41400000    # 12.0f

    .line 210
    .line 211
    const/high16 v26, 0x40800000    # 4.0f

    .line 212
    .line 213
    const v21, 0x40cf0a3d    # 6.47f

    .line 214
    .line 215
    .line 216
    const v22, 0x40b3851f    # 5.61f

    .line 217
    .line 218
    .line 219
    const v23, 0x4110cccd    # 9.05f

    .line 220
    .line 221
    .line 222
    const/high16 v24, 0x40800000    # 4.0f

    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x40f147ae    # 7.54f

    .line 228
    .line 229
    .line 230
    const v26, 0x40ab851f    # 5.36f

    .line 231
    .line 232
    .line 233
    const v21, 0x405f5c29    # 3.49f

    .line 234
    .line 235
    .line 236
    const/16 v22, 0x0

    .line 237
    .line 238
    const v23, 0x40ce6666    # 6.45f

    .line 239
    .line 240
    .line 241
    const v24, 0x400f5c29    # 2.24f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v25, 0x41a3d70a    # 20.48f

    .line 248
    .line 249
    .line 250
    const/high16 v26, 0x41200000    # 10.0f

    .line 251
    .line 252
    const v21, 0x419d70a4    # 19.68f

    .line 253
    .line 254
    .line 255
    const/high16 v22, 0x411c0000    # 9.75f

    .line 256
    .line 257
    const v23, 0x41a08f5c    # 20.07f

    .line 258
    .line 259
    .line 260
    const/high16 v24, 0x41200000    # 10.0f

    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/4 v4, 0x0

    .line 266
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v25, 0x3f75c28f    # 0.96f

    .line 270
    .line 271
    .line 272
    const v26, -0x405851ec    # -1.31f

    .line 273
    .line 274
    .line 275
    const v21, 0x3f2e147b    # 0.68f

    .line 276
    .line 277
    .line 278
    const/16 v22, 0x0

    .line 279
    .line 280
    const v23, 0x3f970a3d    # 1.18f

    .line 281
    .line 282
    .line 283
    const v24, -0x40d47ae1    # -0.67f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v25, 0x41400000    # 12.0f

    .line 290
    .line 291
    const/high16 v26, 0x40000000    # 2.0f

    .line 292
    .line 293
    const v21, 0x41a08f5c    # 20.07f

    .line 294
    .line 295
    .line 296
    const v22, 0x409947ae    # 4.79f

    .line 297
    .line 298
    .line 299
    const v23, 0x4182e148    # 16.36f

    .line 300
    .line 301
    .line 302
    const/high16 v24, 0x40000000    # 2.0f

    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v25, 0x40800000    # 4.0f

    .line 308
    .line 309
    const v26, 0x40c051ec    # 6.01f

    .line 310
    .line 311
    .line 312
    const v21, 0x410bae14    # 8.73f

    .line 313
    .line 314
    .line 315
    const/high16 v22, 0x40000000    # 2.0f

    .line 316
    .line 317
    const v23, 0x40ba3d71    # 5.82f

    .line 318
    .line 319
    .line 320
    const v24, 0x40651eb8    # 3.58f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, 0x40a00000    # 5.0f

    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v25, -0x40800000    # -1.0f

    .line 332
    .line 333
    const/high16 v26, -0x40800000    # -1.0f

    .line 334
    .line 335
    const/16 v21, 0x0

    .line 336
    .line 337
    const v22, -0x40f33333    # -0.55f

    .line 338
    .line 339
    .line 340
    const v23, -0x4119999a    # -0.45f

    .line 341
    .line 342
    .line 343
    const/high16 v24, -0x40800000    # -1.0f

    .line 344
    .line 345
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/4 v4, 0x0

    .line 349
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v25, 0x40000000    # 2.0f

    .line 353
    .line 354
    const/high16 v26, 0x40a00000    # 5.0f

    .line 355
    .line 356
    const v21, 0x401ccccd    # 2.45f

    .line 357
    .line 358
    .line 359
    const/high16 v22, 0x40800000    # 4.0f

    .line 360
    .line 361
    const/high16 v23, 0x40000000    # 2.0f

    .line 362
    .line 363
    const v24, 0x408e6666    # 4.45f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v4, 0x40800000    # 4.0f

    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v25, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/high16 v26, 0x3f800000    # 1.0f

    .line 377
    .line 378
    const/16 v21, 0x0

    .line 379
    .line 380
    const v22, 0x3f0ccccd    # 0.55f

    .line 381
    .line 382
    .line 383
    const v23, 0x3ee66666    # 0.45f

    .line 384
    .line 385
    .line 386
    const/high16 v24, 0x3f800000    # 1.0f

    .line 387
    .line 388
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v25, 0x41000000    # 8.0f

    .line 395
    .line 396
    const/high16 v26, 0x41100000    # 9.0f

    .line 397
    .line 398
    const v21, 0x40f1999a    # 7.55f

    .line 399
    .line 400
    .line 401
    const/high16 v22, 0x41200000    # 10.0f

    .line 402
    .line 403
    const/high16 v23, 0x41000000    # 8.0f

    .line 404
    .line 405
    const v24, 0x4118cccd    # 9.55f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    const/high16 v6, 0x3f800000    # 1.0f

    .line 419
    .line 420
    const/4 v7, 0x0

    .line 421
    const-string v4, ""

    .line 422
    .line 423
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 424
    .line 425
    .line 426
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 427
    .line 428
    .line 429
    move-result v3

    .line 430
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 431
    .line 432
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 433
    .line 434
    .line 435
    move-result-wide v6

    .line 436
    const/4 v0, 0x0

    .line 437
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 441
    .line 442
    .line 443
    move-result v10

    .line 444
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 445
    .line 446
    .line 447
    move-result v11

    .line 448
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41700000    # 15.0f

    .line 454
    .line 455
    const/high16 v2, 0x41800000    # 16.0f

    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v17, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/high16 v18, 0x3f800000    # 1.0f

    .line 466
    .line 467
    const v14, 0x3f0ccccd    # 0.55f

    .line 468
    .line 469
    .line 470
    const v15, 0x3ee66666    # 0.45f

    .line 471
    .line 472
    .line 473
    const/high16 v16, 0x3f800000    # 1.0f

    .line 474
    .line 475
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x3ff47ae1    # 1.91f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v17, -0x3f22e148    # -6.91f

    .line 485
    .line 486
    .line 487
    const/high16 v18, 0x40800000    # 4.0f

    .line 488
    .line 489
    const v13, -0x404f5c29    # -1.38f

    .line 490
    .line 491
    .line 492
    const v14, 0x4018f5c3    # 2.39f

    .line 493
    .line 494
    .line 495
    const v15, -0x3f828f5c    # -3.96f

    .line 496
    .line 497
    .line 498
    const/high16 v16, 0x40800000    # 4.0f

    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v17, -0x3f0eb852    # -7.54f

    .line 504
    .line 505
    .line 506
    const v18, -0x3f547ae1    # -5.36f

    .line 507
    .line 508
    .line 509
    const v13, -0x3fa0a3d7    # -3.49f

    .line 510
    .line 511
    .line 512
    const/4 v14, 0x0

    .line 513
    const v15, -0x3f31999a    # -6.45f

    .line 514
    .line 515
    .line 516
    const v16, -0x3ff0a3d7    # -2.24f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x406147ae    # 3.52f

    .line 523
    .line 524
    .line 525
    const/high16 v18, 0x41600000    # 14.0f

    .line 526
    .line 527
    const v13, 0x408a3d71    # 4.32f

    .line 528
    .line 529
    .line 530
    const/high16 v14, 0x41640000    # 14.25f

    .line 531
    .line 532
    const v15, 0x407b851f    # 3.93f

    .line 533
    .line 534
    .line 535
    const/high16 v16, 0x41600000    # 14.0f

    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/4 v0, 0x0

    .line 541
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, -0x408a3d71    # -0.96f

    .line 545
    .line 546
    .line 547
    const v18, 0x3fa7ae14    # 1.31f

    .line 548
    .line 549
    .line 550
    const v13, -0x40d1eb85    # -0.68f

    .line 551
    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    const v15, -0x4068f5c3    # -1.18f

    .line 555
    .line 556
    .line 557
    const v16, 0x3f2b851f    # 0.67f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, 0x41400000    # 12.0f

    .line 564
    .line 565
    const/high16 v18, 0x41b00000    # 22.0f

    .line 566
    .line 567
    const v13, 0x407b851f    # 3.93f

    .line 568
    .line 569
    .line 570
    const v14, 0x4199ae14    # 19.21f

    .line 571
    .line 572
    .line 573
    const v15, 0x40f47ae1    # 7.64f

    .line 574
    .line 575
    .line 576
    const/high16 v16, 0x41b00000    # 22.0f

    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v17, 0x41000000    # 8.0f

    .line 582
    .line 583
    const v18, -0x3f7fae14    # -4.01f

    .line 584
    .line 585
    .line 586
    const v13, 0x405147ae    # 3.27f

    .line 587
    .line 588
    .line 589
    const/4 v14, 0x0

    .line 590
    const v15, 0x40c5c28f    # 6.18f

    .line 591
    .line 592
    .line 593
    const v16, -0x4035c28f    # -1.58f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v0, 0x41980000    # 19.0f

    .line 600
    .line 601
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v17, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/high16 v18, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/4 v13, 0x0

    .line 609
    const v14, 0x3f0ccccd    # 0.55f

    .line 610
    .line 611
    .line 612
    const v15, 0x3ee66666    # 0.45f

    .line 613
    .line 614
    .line 615
    const/high16 v16, 0x3f800000    # 1.0f

    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/4 v0, 0x0

    .line 621
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v18, -0x40800000    # -1.0f

    .line 625
    .line 626
    const v13, 0x3f0ccccd    # 0.55f

    .line 627
    .line 628
    .line 629
    const/4 v14, 0x0

    .line 630
    const/high16 v15, 0x3f800000    # 1.0f

    .line 631
    .line 632
    const v16, -0x4119999a    # -0.45f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v0, -0x3f800000    # -4.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v17, -0x40800000    # -1.0f

    .line 644
    .line 645
    const/4 v13, 0x0

    .line 646
    const v14, -0x40f33333    # -0.55f

    .line 647
    .line 648
    .line 649
    const v15, -0x4119999a    # -0.45f

    .line 650
    .line 651
    .line 652
    const/high16 v16, -0x40800000    # -1.0f

    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v17, 0x41800000    # 16.0f

    .line 661
    .line 662
    const/high16 v18, 0x41700000    # 15.0f

    .line 663
    .line 664
    const v13, 0x4183999a    # 16.45f

    .line 665
    .line 666
    .line 667
    const/high16 v14, 0x41600000    # 14.0f

    .line 668
    .line 669
    const/high16 v15, 0x41800000    # 16.0f

    .line 670
    .line 671
    const v16, 0x41673333    # 14.45f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/16 v16, 0x3800

    .line 685
    .line 686
    const/16 v17, 0x0

    .line 687
    .line 688
    const/high16 v6, 0x3f800000    # 1.0f

    .line 689
    .line 690
    const/4 v7, 0x0

    .line 691
    const/high16 v12, 0x3f800000    # 1.0f

    .line 692
    .line 693
    const/4 v13, 0x0

    .line 694
    const/4 v14, 0x0

    .line 695
    const/4 v15, 0x0

    .line 696
    const-string v4, ""

    .line 697
    .line 698
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    sput-object v0, Landroidx/compose/material/icons/rounded/FlipCameraAndroidKt;->_flipCameraAndroid:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 707
    .line 708
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    return-object v0
.end method

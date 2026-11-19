.class public final Landroidx/compose/material/icons/outlined/JoinInnerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _joinInner:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getJoinInner(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/JoinInnerKt;->_joinInner:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.JoinInner"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v26, 0x40c00000    # 6.0f

    .line 78
    .line 79
    const/16 v27, 0x0

    .line 80
    .line 81
    const/high16 v21, 0x40400000    # 3.0f

    .line 82
    .line 83
    const v22, 0x40b7ae14    # 5.74f

    .line 84
    .line 85
    .line 86
    const/16 v23, 0x0

    .line 87
    .line 88
    const/16 v24, 0x1

    .line 89
    .line 90
    const/16 v25, 0x0

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v26, -0x3f400000    # -6.0f

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const/16 v16, 0x3800

    .line 110
    .line 111
    const/16 v17, 0x0

    .line 112
    .line 113
    const/high16 v6, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const/high16 v8, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/high16 v9, 0x3f800000    # 1.0f

    .line 119
    .line 120
    const/high16 v12, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    const/4 v15, 0x0

    .line 125
    const-string v4, ""

    .line 126
    .line 127
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 128
    .line 129
    .line 130
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 135
    .line 136
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 137
    .line 138
    .line 139
    move-result-wide v6

    .line 140
    const/4 v2, 0x0

    .line 141
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 149
    .line 150
    .line 151
    move-result v11

    .line 152
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 155
    .line 156
    .line 157
    const v4, 0x4110a3d7    # 9.04f

    .line 158
    .line 159
    .line 160
    const v6, 0x4186f5c3    # 16.87f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v25, 0x41000000    # 8.0f

    .line 167
    .line 168
    const/high16 v26, 0x41880000    # 17.0f

    .line 169
    .line 170
    const v21, 0x410b5c29    # 8.71f

    .line 171
    .line 172
    .line 173
    const v22, 0x4187999a    # 16.95f

    .line 174
    .line 175
    .line 176
    const v23, 0x4105c28f    # 8.36f

    .line 177
    .line 178
    .line 179
    const/high16 v24, 0x41880000    # 17.0f

    .line 180
    .line 181
    move-object/from16 v20, v2

    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v25, -0x3f600000    # -5.0f

    .line 187
    .line 188
    const/high16 v26, -0x3f600000    # -5.0f

    .line 189
    .line 190
    const v21, -0x3fcf5c29    # -2.76f

    .line 191
    .line 192
    .line 193
    const/16 v22, 0x0

    .line 194
    .line 195
    const/high16 v23, -0x3f600000    # -5.0f

    .line 196
    .line 197
    const v24, -0x3ff0a3d7    # -2.24f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v4, 0x400f5c29    # 2.24f

    .line 204
    .line 205
    .line 206
    const/high16 v6, -0x3f600000    # -5.0f

    .line 207
    .line 208
    const/high16 v7, 0x40a00000    # 5.0f

    .line 209
    .line 210
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v25, 0x3f851eb8    # 1.04f

    .line 214
    .line 215
    .line 216
    const v26, 0x3e051eb8    # 0.13f

    .line 217
    .line 218
    .line 219
    const v21, 0x3eb851ec    # 0.36f

    .line 220
    .line 221
    .line 222
    const v23, 0x3f35c28f    # 0.71f

    .line 223
    .line 224
    .line 225
    const v24, 0x3d4ccccd    # 0.05f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v25, 0x3fbeb852    # 1.49f

    .line 232
    .line 233
    .line 234
    const v26, -0x402f5c29    # -1.63f

    .line 235
    .line 236
    .line 237
    const v21, 0x3ec7ae14    # 0.39f

    .line 238
    .line 239
    .line 240
    const v22, -0x40f0a3d7    # -0.56f

    .line 241
    .line 242
    .line 243
    const v23, 0x3f6147ae    # 0.88f

    .line 244
    .line 245
    .line 246
    const v24, -0x4070a3d7    # -1.12f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v25, 0x41000000    # 8.0f

    .line 253
    .line 254
    const/high16 v26, 0x40a00000    # 5.0f

    .line 255
    .line 256
    const/high16 v21, 0x411c0000    # 9.75f

    .line 257
    .line 258
    const v22, 0x40a6147b    # 5.19f

    .line 259
    .line 260
    .line 261
    const v23, 0x410e6666    # 8.9f

    .line 262
    .line 263
    .line 264
    const/high16 v24, 0x40a00000    # 5.0f

    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v25, -0x3f200000    # -7.0f

    .line 270
    .line 271
    const/high16 v26, 0x40e00000    # 7.0f

    .line 272
    .line 273
    const v21, -0x3f88f5c3    # -3.86f

    .line 274
    .line 275
    .line 276
    const/16 v22, 0x0

    .line 277
    .line 278
    const/high16 v23, -0x3f200000    # -7.0f

    .line 279
    .line 280
    const v24, 0x4048f5c3    # 3.14f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v4, 0x4048f5c3    # 3.14f

    .line 287
    .line 288
    .line 289
    const/high16 v6, 0x40e00000    # 7.0f

    .line 290
    .line 291
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v25, 0x4021eb85    # 2.53f

    .line 295
    .line 296
    .line 297
    const/high16 v26, -0x41000000    # -0.5f

    .line 298
    .line 299
    const v21, 0x3f666666    # 0.9f

    .line 300
    .line 301
    .line 302
    const/high16 v23, 0x3fe00000    # 1.75f

    .line 303
    .line 304
    const v24, -0x41bd70a4    # -0.19f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v25, 0x4110a3d7    # 9.04f

    .line 311
    .line 312
    .line 313
    const v26, 0x4186f5c3    # 16.87f

    .line 314
    .line 315
    .line 316
    const v21, 0x411eb852    # 9.92f

    .line 317
    .line 318
    .line 319
    const v22, 0x418feb85    # 17.99f

    .line 320
    .line 321
    .line 322
    const v23, 0x4116e148    # 9.43f

    .line 323
    .line 324
    .line 325
    const v24, 0x418b70a4    # 17.43f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    const/high16 v6, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    const-string v4, ""

    .line 342
    .line 343
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 344
    .line 345
    .line 346
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 351
    .line 352
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 353
    .line 354
    .line 355
    move-result-wide v6

    .line 356
    const/4 v0, 0x0

    .line 357
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    const/high16 v0, 0x41800000    # 16.0f

    .line 374
    .line 375
    const/high16 v2, 0x40a00000    # 5.0f

    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, -0x3fde147b    # -2.53f

    .line 381
    .line 382
    .line 383
    const/high16 v18, 0x3f000000    # 0.5f

    .line 384
    .line 385
    const v13, -0x4099999a    # -0.9f

    .line 386
    .line 387
    .line 388
    const/high16 v15, -0x40200000    # -1.75f

    .line 389
    .line 390
    const v16, 0x3e428f5c    # 0.19f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, 0x3fbeb852    # 1.49f

    .line 397
    .line 398
    .line 399
    const v18, 0x3fd0a3d7    # 1.63f

    .line 400
    .line 401
    .line 402
    const v13, 0x3f1c28f6    # 0.61f

    .line 403
    .line 404
    .line 405
    const v14, 0x3f028f5c    # 0.51f

    .line 406
    .line 407
    .line 408
    const v15, 0x3f8ccccd    # 1.1f

    .line 409
    .line 410
    .line 411
    const v16, 0x3f88f5c3    # 1.07f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v17, 0x41800000    # 16.0f

    .line 418
    .line 419
    const/high16 v18, 0x40e00000    # 7.0f

    .line 420
    .line 421
    const v13, 0x4174a3d7    # 15.29f

    .line 422
    .line 423
    .line 424
    const v14, 0x40e1999a    # 7.05f

    .line 425
    .line 426
    .line 427
    const v15, 0x417a3d71    # 15.64f

    .line 428
    .line 429
    .line 430
    const/high16 v16, 0x40e00000    # 7.0f

    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v17, 0x40a00000    # 5.0f

    .line 436
    .line 437
    const/high16 v18, 0x40a00000    # 5.0f

    .line 438
    .line 439
    const v13, 0x4030a3d7    # 2.76f

    .line 440
    .line 441
    .line 442
    const/4 v14, 0x0

    .line 443
    const/high16 v15, 0x40a00000    # 5.0f

    .line 444
    .line 445
    const v16, 0x400f5c29    # 2.24f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v0, -0x3ff0a3d7    # -2.24f

    .line 452
    .line 453
    .line 454
    const/high16 v2, -0x3f600000    # -5.0f

    .line 455
    .line 456
    const/high16 v4, 0x40a00000    # 5.0f

    .line 457
    .line 458
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v17, -0x407ae148    # -1.04f

    .line 462
    .line 463
    .line 464
    const v18, -0x41fae148    # -0.13f

    .line 465
    .line 466
    .line 467
    const v13, -0x4147ae14    # -0.36f

    .line 468
    .line 469
    .line 470
    const v15, -0x40ca3d71    # -0.71f

    .line 471
    .line 472
    .line 473
    const v16, -0x42b33333    # -0.05f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v17, -0x404147ae    # -1.49f

    .line 480
    .line 481
    .line 482
    const v18, 0x3fd0a3d7    # 1.63f

    .line 483
    .line 484
    .line 485
    const v13, -0x413851ec    # -0.39f

    .line 486
    .line 487
    .line 488
    const v14, 0x3f0f5c29    # 0.56f

    .line 489
    .line 490
    .line 491
    const v15, -0x409eb852    # -0.88f

    .line 492
    .line 493
    .line 494
    const v16, 0x3f8f5c29    # 1.12f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v17, 0x41800000    # 16.0f

    .line 501
    .line 502
    const/high16 v18, 0x41980000    # 19.0f

    .line 503
    .line 504
    const/high16 v13, 0x41640000    # 14.25f

    .line 505
    .line 506
    const v14, 0x41967ae1    # 18.81f

    .line 507
    .line 508
    .line 509
    const v15, 0x4171999a    # 15.1f

    .line 510
    .line 511
    .line 512
    const/high16 v16, 0x41980000    # 19.0f

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v17, 0x40e00000    # 7.0f

    .line 518
    .line 519
    const/high16 v18, -0x3f200000    # -7.0f

    .line 520
    .line 521
    const v13, 0x40770a3d    # 3.86f

    .line 522
    .line 523
    .line 524
    const/4 v14, 0x0

    .line 525
    const/high16 v15, 0x40e00000    # 7.0f

    .line 526
    .line 527
    const v16, -0x3fb70a3d    # -3.14f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v0, 0x419ee148    # 19.86f

    .line 534
    .line 535
    .line 536
    const/high16 v2, 0x41800000    # 16.0f

    .line 537
    .line 538
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    const/16 v16, 0x3800

    .line 549
    .line 550
    const/16 v17, 0x0

    .line 551
    .line 552
    const/high16 v6, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/4 v7, 0x0

    .line 555
    const/high16 v12, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/4 v13, 0x0

    .line 558
    const/4 v15, 0x0

    .line 559
    const-string v4, ""

    .line 560
    .line 561
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    sput-object v0, Landroidx/compose/material/icons/outlined/JoinInnerKt;->_joinInner:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 570
    .line 571
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    return-object v0
.end method

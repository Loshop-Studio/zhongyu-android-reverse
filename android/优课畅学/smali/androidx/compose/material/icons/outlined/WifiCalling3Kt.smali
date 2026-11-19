.class public final Landroidx/compose/material/icons/outlined/WifiCalling3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiCalling3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiCalling3(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/WifiCalling3Kt;->_wifiCalling3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.WifiCalling3"

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
    const/high16 v4, 0x40900000    # 4.5f

    .line 71
    .line 72
    const v6, 0x4183eb85    # 16.49f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, 0x4092e148    # 4.59f

    .line 79
    .line 80
    .line 81
    const v26, 0x3ff47ae1    # 1.91f

    .line 82
    .line 83
    .line 84
    const v21, 0x3fe51eb8    # 1.79f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, 0x405ae148    # 3.42f

    .line 90
    .line 91
    .line 92
    const v24, 0x3f3ae148    # 0.73f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, -0x407851ec    # -1.06f

    .line 101
    .line 102
    .line 103
    const v6, 0x3f87ae14    # 1.06f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v25, 0x4183eb85    # 16.49f

    .line 110
    .line 111
    .line 112
    const/high16 v26, 0x40400000    # 3.0f

    .line 113
    .line 114
    const v21, 0x41a5999a    # 20.7f

    .line 115
    .line 116
    .line 117
    const v22, 0x4079999a    # 3.9f

    .line 118
    .line 119
    .line 120
    const v23, 0x4195999a    # 18.7f

    .line 121
    .line 122
    .line 123
    const/high16 v24, 0x40400000    # 3.0f

    .line 124
    .line 125
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v25, -0x3f4ae148    # -5.66f

    .line 129
    .line 130
    .line 131
    const v26, 0x4015c28f    # 2.34f

    .line 132
    .line 133
    .line 134
    const v21, -0x3ff28f5c    # -2.21f

    .line 135
    .line 136
    .line 137
    const/16 v22, 0x0

    .line 138
    .line 139
    const v23, -0x3f7947ae    # -4.21f

    .line 140
    .line 141
    .line 142
    const v24, 0x3f666666    # 0.9f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x3f87ae14    # 1.06f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v25, 0x4183eb85    # 16.49f

    .line 155
    .line 156
    .line 157
    const/high16 v26, 0x40900000    # 4.5f

    .line 158
    .line 159
    const v21, 0x415147ae    # 13.08f

    .line 160
    .line 161
    .line 162
    const v22, 0x40a75c29    # 5.23f

    .line 163
    .line 164
    .line 165
    const v23, 0x416b3333    # 14.7f

    .line 166
    .line 167
    .line 168
    const/high16 v24, 0x40900000    # 4.5f

    .line 169
    .line 170
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    const/16 v16, 0x3800

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    .line 184
    const/high16 v6, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/high16 v8, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    const/high16 v9, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const/high16 v12, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    const/4 v14, 0x0

    .line 195
    const/4 v15, 0x0

    .line 196
    const-string v4, ""

    .line 197
    .line 198
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 199
    .line 200
    .line 201
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 206
    .line 207
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 208
    .line 209
    .line 210
    move-result-wide v6

    .line 211
    const/4 v2, 0x0

    .line 212
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 220
    .line 221
    .line 222
    move-result v11

    .line 223
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x40c00000    # 6.0f

    .line 229
    .line 230
    const v6, 0x4183eb85    # 16.49f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v25, -0x3f9d70a4    # -3.54f

    .line 237
    .line 238
    .line 239
    const v26, 0x3fbae148    # 1.46f

    .line 240
    .line 241
    .line 242
    const v21, -0x404f5c29    # -1.38f

    .line 243
    .line 244
    .line 245
    const/16 v22, 0x0

    .line 246
    .line 247
    const v23, -0x3fd7ae14    # -2.63f

    .line 248
    .line 249
    .line 250
    const v24, 0x3f0f5c29    # 0.56f

    .line 251
    .line 252
    .line 253
    move-object/from16 v20, v2

    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, 0x3f87ae14    # 1.06f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v25, 0x401e147b    # 2.47f

    .line 265
    .line 266
    .line 267
    const v26, -0x407c28f6    # -1.03f

    .line 268
    .line 269
    .line 270
    const v21, 0x3f2147ae    # 0.63f

    .line 271
    .line 272
    .line 273
    const v22, -0x40deb852    # -0.63f

    .line 274
    .line 275
    .line 276
    const v23, 0x3fc147ae    # 1.51f

    .line 277
    .line 278
    .line 279
    const v24, -0x407c28f6    # -1.03f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, 0x401e147b    # 2.47f

    .line 286
    .line 287
    .line 288
    const v6, 0x3f83d70a    # 1.03f

    .line 289
    .line 290
    .line 291
    const v7, 0x3feb851f    # 1.84f

    .line 292
    .line 293
    .line 294
    const v8, 0x3ec7ae14    # 0.39f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v4, -0x407851ec    # -1.06f

    .line 301
    .line 302
    .line 303
    const v6, 0x3f87ae14    # 1.06f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v25, 0x4183eb85    # 16.49f

    .line 310
    .line 311
    .line 312
    const/high16 v26, 0x40c00000    # 6.0f

    .line 313
    .line 314
    const v21, 0x4198f5c3    # 19.12f

    .line 315
    .line 316
    .line 317
    const v22, 0x40d1eb85    # 6.56f

    .line 318
    .line 319
    .line 320
    const v23, 0x418ef5c3    # 17.87f

    .line 321
    .line 322
    .line 323
    const/high16 v24, 0x40c00000    # 6.0f

    .line 324
    .line 325
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    const/high16 v6, 0x3f800000    # 1.0f

    .line 336
    .line 337
    const/high16 v8, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const/4 v7, 0x0

    .line 340
    const-string v4, ""

    .line 341
    .line 342
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 343
    .line 344
    .line 345
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 350
    .line 351
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 352
    .line 353
    .line 354
    move-result-wide v6

    .line 355
    const/4 v2, 0x0

    .line 356
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 360
    .line 361
    .line 362
    move-result v10

    .line 363
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 364
    .line 365
    .line 366
    move-result v11

    .line 367
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 370
    .line 371
    .line 372
    const/high16 v4, 0x41100000    # 9.0f

    .line 373
    .line 374
    const v6, 0x4183eb85    # 16.49f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v25, -0x404b851f    # -1.41f

    .line 381
    .line 382
    .line 383
    const v26, 0x3f170a3d    # 0.59f

    .line 384
    .line 385
    .line 386
    const v21, -0x40f33333    # -0.55f

    .line 387
    .line 388
    .line 389
    const/16 v22, 0x0

    .line 390
    .line 391
    const v23, -0x4079999a    # -1.05f

    .line 392
    .line 393
    .line 394
    const v24, 0x3e6147ae    # 0.22f

    .line 395
    .line 396
    .line 397
    move-object/from16 v20, v2

    .line 398
    .line 399
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v4, 0x41300000    # 11.0f

    .line 403
    .line 404
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v4, 0x3fb47ae1    # 1.41f

    .line 408
    .line 409
    .line 410
    const v6, -0x404b851f    # -1.41f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v25, 0x4183eb85    # 16.49f

    .line 417
    .line 418
    .line 419
    const/high16 v26, 0x41100000    # 9.0f

    .line 420
    .line 421
    const v21, 0x418c51ec    # 17.54f

    .line 422
    .line 423
    .line 424
    const v22, 0x4113851f    # 9.22f

    .line 425
    .line 426
    .line 427
    const v23, 0x418851ec    # 17.04f

    .line 428
    .line 429
    .line 430
    const/high16 v24, 0x41100000    # 9.0f

    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    const/high16 v6, 0x3f800000    # 1.0f

    .line 443
    .line 444
    const/4 v7, 0x0

    .line 445
    const-string v4, ""

    .line 446
    .line 447
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 448
    .line 449
    .line 450
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 455
    .line 456
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 457
    .line 458
    .line 459
    move-result-wide v6

    .line 460
    const/4 v0, 0x0

    .line 461
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 469
    .line 470
    .line 471
    move-result v11

    .line 472
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 475
    .line 476
    .line 477
    const v0, 0x41a1999a    # 20.2f

    .line 478
    .line 479
    .line 480
    const v2, 0x416deb85    # 14.87f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x3f951eb8    # -3.67f

    .line 487
    .line 488
    .line 489
    const v2, -0x40c51eb8    # -0.73f

    .line 490
    .line 491
    .line 492
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, -0x4099999a    # -0.9f

    .line 496
    .line 497
    .line 498
    const v18, 0x3e8a3d71    # 0.27f

    .line 499
    .line 500
    .line 501
    const/high16 v13, -0x41000000    # -0.5f

    .line 502
    .line 503
    const v14, -0x42333333    # -0.1f

    .line 504
    .line 505
    .line 506
    const v15, -0x40ab851f    # -0.83f

    .line 507
    .line 508
    .line 509
    const v16, 0x3e4ccccd    # 0.2f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x40200000    # 2.5f

    .line 516
    .line 517
    const v2, -0x3fdeb852    # -2.52f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, -0x3f400000    # -6.0f

    .line 524
    .line 525
    const/high16 v18, -0x3f400000    # -6.0f

    .line 526
    .line 527
    const/high16 v13, -0x3fe00000    # -2.5f

    .line 528
    .line 529
    const v14, -0x4048f5c3    # -1.43f

    .line 530
    .line 531
    .line 532
    const v15, -0x3f6dc28f    # -4.57f

    .line 533
    .line 534
    .line 535
    const/high16 v16, -0x3fa00000    # -3.5f

    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v17, 0x3e8a3d71    # 0.27f

    .line 544
    .line 545
    .line 546
    const v18, -0x4099999a    # -0.9f

    .line 547
    .line 548
    .line 549
    const v13, 0x3e6b851f    # 0.23f

    .line 550
    .line 551
    .line 552
    const v14, -0x418a3d71    # -0.24f

    .line 553
    .line 554
    .line 555
    const v15, 0x3ea8f5c3    # 0.33f

    .line 556
    .line 557
    .line 558
    const v16, -0x40ee147b    # -0.57f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v0, 0x4112147b    # 9.13f

    .line 565
    .line 566
    .line 567
    const v2, 0x40733333    # 3.8f

    .line 568
    .line 569
    .line 570
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v17, 0x41026666    # 8.15f

    .line 574
    .line 575
    .line 576
    const/high16 v18, 0x40400000    # 3.0f

    .line 577
    .line 578
    const v13, 0x4110a3d7    # 9.04f

    .line 579
    .line 580
    .line 581
    const v14, 0x4055c28f    # 3.34f

    .line 582
    .line 583
    .line 584
    const v15, 0x410a147b    # 8.63f

    .line 585
    .line 586
    .line 587
    const/high16 v16, 0x40400000    # 3.0f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x40800000    # 4.0f

    .line 593
    .line 594
    const/high16 v2, 0x40400000    # 3.0f

    .line 595
    .line 596
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const/high16 v17, 0x40400000    # 3.0f

    .line 600
    .line 601
    const v18, 0x4080f5c3    # 4.03f

    .line 602
    .line 603
    .line 604
    const v13, 0x405c28f6    # 3.44f

    .line 605
    .line 606
    .line 607
    const/high16 v14, 0x40400000    # 3.0f

    .line 608
    .line 609
    const v15, 0x403e147b    # 2.97f

    .line 610
    .line 611
    .line 612
    const v16, 0x405e147b    # 3.47f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v17, 0x40adc28f    # 5.43f

    .line 619
    .line 620
    .line 621
    const/high16 v18, 0x41400000    # 12.0f

    .line 622
    .line 623
    const v13, 0x404ae148    # 3.17f

    .line 624
    .line 625
    .line 626
    const v14, 0x40dd70a4    # 6.92f

    .line 627
    .line 628
    .line 629
    const v15, 0x4081999a    # 4.05f

    .line 630
    .line 631
    .line 632
    const v16, 0x411a147b    # 9.63f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, 0x40d23d71    # 6.57f

    .line 639
    .line 640
    .line 641
    const v18, 0x40d23d71    # 6.57f

    .line 642
    .line 643
    .line 644
    const v13, 0x3fca3d71    # 1.58f

    .line 645
    .line 646
    .line 647
    const v14, 0x402eb852    # 2.73f

    .line 648
    .line 649
    .line 650
    const v15, 0x40766666    # 3.85f

    .line 651
    .line 652
    .line 653
    const v16, 0x409fae14    # 4.99f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v17, 0x40ff0a3d    # 7.97f

    .line 660
    .line 661
    .line 662
    const v18, 0x401b851f    # 2.43f

    .line 663
    .line 664
    .line 665
    const v13, 0x4017ae14    # 2.37f

    .line 666
    .line 667
    .line 668
    const v14, 0x3faf5c29    # 1.37f

    .line 669
    .line 670
    .line 671
    const v15, 0x40a28f5c    # 5.08f

    .line 672
    .line 673
    .line 674
    const v16, 0x4010a3d7    # 2.26f

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v17, 0x3f83d70a    # 1.03f

    .line 681
    .line 682
    .line 683
    const/high16 v18, -0x40800000    # -1.0f

    .line 684
    .line 685
    const v13, 0x3f0ccccd    # 0.55f

    .line 686
    .line 687
    .line 688
    const v14, 0x3cf5c28f    # 0.03f

    .line 689
    .line 690
    .line 691
    const v15, 0x3f83d70a    # 1.03f

    .line 692
    .line 693
    .line 694
    const v16, -0x4123d70a    # -0.43f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, -0x3f7b3333    # -4.15f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v17, 0x41a1999a    # 20.2f

    .line 707
    .line 708
    .line 709
    const v18, 0x416deb85    # 14.87f

    .line 710
    .line 711
    .line 712
    const/high16 v13, 0x41a80000    # 21.0f

    .line 713
    .line 714
    const v14, 0x4175eb85    # 15.37f

    .line 715
    .line 716
    .line 717
    const v15, 0x41a547ae    # 20.66f

    .line 718
    .line 719
    .line 720
    const v16, 0x416f5c29    # 14.96f

    .line 721
    .line 722
    .line 723
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v0, 0x40a33333    # 5.1f

    .line 730
    .line 731
    .line 732
    const/high16 v2, 0x40a00000    # 5.0f

    .line 733
    .line 734
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v0, 0x400eb852    # 2.23f

    .line 738
    .line 739
    .line 740
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x40f9999a    # 7.8f

    .line 744
    .line 745
    .line 746
    const v2, 0x40eb3333    # 7.35f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v0, 0x40c570a4    # 6.17f

    .line 753
    .line 754
    .line 755
    const/high16 v2, 0x41100000    # 9.0f

    .line 756
    .line 757
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v17, 0x40a33333    # 5.1f

    .line 761
    .line 762
    .line 763
    const/high16 v18, 0x40a00000    # 5.0f

    .line 764
    .line 765
    const v13, 0x40b428f6    # 5.63f

    .line 766
    .line 767
    .line 768
    const v14, 0x40f66666    # 7.7f

    .line 769
    .line 770
    .line 771
    const v15, 0x40a8a3d7    # 5.27f

    .line 772
    .line 773
    .line 774
    const v16, 0x40cbd70a    # 6.37f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v0, 0x41973333    # 18.9f

    .line 784
    .line 785
    .line 786
    const/high16 v2, 0x41980000    # 19.0f

    .line 787
    .line 788
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v17, -0x3f800000    # -4.0f

    .line 792
    .line 793
    const v18, -0x40770a3d    # -1.07f

    .line 794
    .line 795
    .line 796
    const v13, -0x4050a3d7    # -1.37f

    .line 797
    .line 798
    .line 799
    const v14, -0x41c7ae14    # -0.18f

    .line 800
    .line 801
    .line 802
    const v15, -0x3fd33333    # -2.7f

    .line 803
    .line 804
    .line 805
    const v16, -0x40f851ec    # -0.53f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v0, 0x3fd33333    # 1.65f

    .line 812
    .line 813
    .line 814
    const v2, -0x402f5c29    # -1.63f

    .line 815
    .line 816
    .line 817
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const v0, 0x41855c29    # 16.67f

    .line 821
    .line 822
    .line 823
    const/high16 v2, 0x41980000    # 19.0f

    .line 824
    .line 825
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v0, 0x41973333    # 18.9f

    .line 829
    .line 830
    .line 831
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 835
    .line 836
    .line 837
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 838
    .line 839
    .line 840
    move-result-object v2

    .line 841
    const/16 v16, 0x3800

    .line 842
    .line 843
    const/16 v17, 0x0

    .line 844
    .line 845
    const/high16 v6, 0x3f800000    # 1.0f

    .line 846
    .line 847
    const/4 v7, 0x0

    .line 848
    const/high16 v12, 0x3f800000    # 1.0f

    .line 849
    .line 850
    const/4 v13, 0x0

    .line 851
    const/4 v14, 0x0

    .line 852
    const/4 v15, 0x0

    .line 853
    const-string v4, ""

    .line 854
    .line 855
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 856
    .line 857
    .line 858
    move-result-object v0

    .line 859
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    sput-object v0, Landroidx/compose/material/icons/outlined/WifiCalling3Kt;->_wifiCalling3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 864
    .line 865
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 866
    .line 867
    .line 868
    return-object v0
.end method

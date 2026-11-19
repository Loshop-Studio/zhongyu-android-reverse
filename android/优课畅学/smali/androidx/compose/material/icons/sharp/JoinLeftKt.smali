.class public final Landroidx/compose/material/icons/sharp/JoinLeftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _joinLeft:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getJoinLeft(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/JoinLeftKt;->_joinLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.JoinLeft"

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
    const/high16 v4, 0x40f00000    # 7.5f

    .line 158
    .line 159
    const/high16 v6, 0x41400000    # 12.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v25, 0x4041eb85    # 3.03f

    .line 165
    .line 166
    .line 167
    const/high16 v26, -0x3f300000    # -6.5f

    .line 168
    .line 169
    const/16 v21, 0x0

    .line 170
    .line 171
    const v22, -0x4087ae14    # -0.97f

    .line 172
    .line 173
    .line 174
    const v23, 0x3e6b851f    # 0.23f

    .line 175
    .line 176
    .line 177
    const v24, -0x3f7ae148    # -4.16f

    .line 178
    .line 179
    .line 180
    move-object/from16 v20, v2

    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v25, 0x41000000    # 8.0f

    .line 186
    .line 187
    const/high16 v26, 0x40a00000    # 5.0f

    .line 188
    .line 189
    const/high16 v21, 0x411c0000    # 9.75f

    .line 190
    .line 191
    const v22, 0x40a6147b    # 5.19f

    .line 192
    .line 193
    .line 194
    const v23, 0x410e6666    # 8.9f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x40a00000    # 5.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, -0x3f200000    # -7.0f

    .line 203
    .line 204
    const/high16 v26, 0x40e00000    # 7.0f

    .line 205
    .line 206
    const v21, -0x3f88f5c3    # -3.86f

    .line 207
    .line 208
    .line 209
    const/16 v22, 0x0

    .line 210
    .line 211
    const/high16 v23, -0x3f200000    # -7.0f

    .line 212
    .line 213
    const v24, 0x4048f5c3    # 3.14f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x4048f5c3    # 3.14f

    .line 220
    .line 221
    .line 222
    const/high16 v6, 0x40e00000    # 7.0f

    .line 223
    .line 224
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x4021eb85    # 2.53f

    .line 228
    .line 229
    .line 230
    const/high16 v26, -0x41000000    # -0.5f

    .line 231
    .line 232
    const v21, 0x3f666666    # 0.9f

    .line 233
    .line 234
    .line 235
    const/high16 v23, 0x3fe00000    # 1.75f

    .line 236
    .line 237
    const v24, -0x41bd70a4    # -0.19f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v25, 0x40f00000    # 7.5f

    .line 244
    .line 245
    const/high16 v26, 0x41400000    # 12.0f

    .line 246
    .line 247
    const v21, 0x40f75c29    # 7.73f

    .line 248
    .line 249
    .line 250
    const v22, 0x418147ae    # 16.16f

    .line 251
    .line 252
    .line 253
    const/high16 v23, 0x40f00000    # 7.5f

    .line 254
    .line 255
    const v24, 0x414f851f    # 12.97f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const/high16 v6, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    const-string v4, ""

    .line 272
    .line 273
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 274
    .line 275
    .line 276
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 281
    .line 282
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 283
    .line 284
    .line 285
    move-result-wide v6

    .line 286
    const/4 v0, 0x0

    .line 287
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x41800000    # 16.0f

    .line 304
    .line 305
    const/high16 v2, 0x40a00000    # 5.0f

    .line 306
    .line 307
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, -0x3fde147b    # -2.53f

    .line 311
    .line 312
    .line 313
    const/high16 v18, 0x3f000000    # 0.5f

    .line 314
    .line 315
    const v13, -0x4099999a    # -0.9f

    .line 316
    .line 317
    .line 318
    const/high16 v15, -0x40200000    # -1.75f

    .line 319
    .line 320
    const v16, 0x3e428f5c    # 0.19f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v17, 0x3fbeb852    # 1.49f

    .line 327
    .line 328
    .line 329
    const v18, 0x3fd0a3d7    # 1.63f

    .line 330
    .line 331
    .line 332
    const v13, 0x3f1c28f6    # 0.61f

    .line 333
    .line 334
    .line 335
    const v14, 0x3f028f5c    # 0.51f

    .line 336
    .line 337
    .line 338
    const v15, 0x3f8ccccd    # 1.1f

    .line 339
    .line 340
    .line 341
    const v16, 0x3f88f5c3    # 1.07f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x41800000    # 16.0f

    .line 348
    .line 349
    const/high16 v18, 0x40e00000    # 7.0f

    .line 350
    .line 351
    const v13, 0x4174a3d7    # 15.29f

    .line 352
    .line 353
    .line 354
    const v14, 0x40e1999a    # 7.05f

    .line 355
    .line 356
    .line 357
    const v15, 0x417a3d71    # 15.64f

    .line 358
    .line 359
    .line 360
    const/high16 v16, 0x40e00000    # 7.0f

    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v17, 0x40a00000    # 5.0f

    .line 366
    .line 367
    const/high16 v18, 0x40a00000    # 5.0f

    .line 368
    .line 369
    const v13, 0x4030a3d7    # 2.76f

    .line 370
    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const/high16 v15, 0x40a00000    # 5.0f

    .line 374
    .line 375
    const v16, 0x400f5c29    # 2.24f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, -0x3ff0a3d7    # -2.24f

    .line 382
    .line 383
    .line 384
    const/high16 v2, -0x3f600000    # -5.0f

    .line 385
    .line 386
    const/high16 v4, 0x40a00000    # 5.0f

    .line 387
    .line 388
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, -0x407ae148    # -1.04f

    .line 392
    .line 393
    .line 394
    const v18, -0x41fae148    # -0.13f

    .line 395
    .line 396
    .line 397
    const v13, -0x4147ae14    # -0.36f

    .line 398
    .line 399
    .line 400
    const v15, -0x40ca3d71    # -0.71f

    .line 401
    .line 402
    .line 403
    const v16, -0x42b33333    # -0.05f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, -0x404147ae    # -1.49f

    .line 410
    .line 411
    .line 412
    const v18, 0x3fd0a3d7    # 1.63f

    .line 413
    .line 414
    .line 415
    const v13, -0x413851ec    # -0.39f

    .line 416
    .line 417
    .line 418
    const v14, 0x3f0f5c29    # 0.56f

    .line 419
    .line 420
    .line 421
    const v15, -0x409eb852    # -0.88f

    .line 422
    .line 423
    .line 424
    const v16, 0x3f8f5c29    # 1.12f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x41800000    # 16.0f

    .line 431
    .line 432
    const/high16 v18, 0x41980000    # 19.0f

    .line 433
    .line 434
    const/high16 v13, 0x41640000    # 14.25f

    .line 435
    .line 436
    const v14, 0x41967ae1    # 18.81f

    .line 437
    .line 438
    .line 439
    const v15, 0x4171999a    # 15.1f

    .line 440
    .line 441
    .line 442
    const/high16 v16, 0x41980000    # 19.0f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x40e00000    # 7.0f

    .line 448
    .line 449
    const/high16 v18, -0x3f200000    # -7.0f

    .line 450
    .line 451
    const v13, 0x40770a3d    # 3.86f

    .line 452
    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const/high16 v15, 0x40e00000    # 7.0f

    .line 456
    .line 457
    const v16, -0x3fb70a3d    # -3.14f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x419ee148    # 19.86f

    .line 464
    .line 465
    .line 466
    const/high16 v2, 0x41800000    # 16.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    const/16 v16, 0x3800

    .line 479
    .line 480
    const/16 v17, 0x0

    .line 481
    .line 482
    const/high16 v6, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    const/high16 v12, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const/4 v13, 0x0

    .line 488
    const/4 v15, 0x0

    .line 489
    const-string v4, ""

    .line 490
    .line 491
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    sput-object v0, Landroidx/compose/material/icons/sharp/JoinLeftKt;->_joinLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 500
    .line 501
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    return-object v0
.end method

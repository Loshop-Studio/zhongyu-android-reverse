.class public final Landroidx/compose/material/icons/twotone/PrecisionManufacturingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _precisionManufacturing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPrecisionManufacturing(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PrecisionManufacturingKt;->_precisionManufacturing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PrecisionManufacturing"

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
    const v4, 0x40d6b852    # 6.71f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41200000    # 10.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x401d70a4    # 2.46f

    .line 79
    .line 80
    .line 81
    const/high16 v6, 0x41000000    # 8.0f

    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, 0x3ff851ec    # 1.94f

    .line 87
    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, -0x3f766666    # -4.3f

    .line 94
    .line 95
    .line 96
    const/high16 v6, -0x3f000000    # -8.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    const/16 v16, 0x3800

    .line 109
    .line 110
    const/16 v17, 0x0

    .line 111
    .line 112
    const v6, 0x3e99999a    # 0.3f

    .line 113
    .line 114
    .line 115
    const v8, 0x3e99999a    # 0.3f

    .line 116
    .line 117
    .line 118
    const/4 v7, 0x0

    .line 119
    const/high16 v9, 0x3f800000    # 1.0f

    .line 120
    .line 121
    const/high16 v12, 0x3f800000    # 1.0f

    .line 122
    .line 123
    const/4 v13, 0x0

    .line 124
    const/4 v14, 0x0

    .line 125
    const/4 v15, 0x0

    .line 126
    const-string v4, ""

    .line 127
    .line 128
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 136
    .line 137
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 138
    .line 139
    .line 140
    move-result-wide v6

    .line 141
    const/4 v2, 0x0

    .line 142
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x40e00000    # 7.0f

    .line 159
    .line 160
    const/high16 v6, 0x40c00000    # 6.0f

    .line 161
    .line 162
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v4, -0x40800000    # -1.0f

    .line 166
    .line 167
    const/4 v6, 0x0

    .line 168
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v26, 0x40000000    # 2.0f

    .line 172
    .line 173
    const/16 v27, 0x0

    .line 174
    .line 175
    const/high16 v21, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const/high16 v22, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/16 v23, 0x0

    .line 180
    .line 181
    const/16 v24, 0x1

    .line 182
    .line 183
    const/16 v25, 0x1

    .line 184
    .line 185
    move-object/from16 v20, v2

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v26, -0x40000000    # -2.0f

    .line 191
    .line 192
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const v6, 0x3e99999a    # 0.3f

    .line 200
    .line 201
    .line 202
    const/4 v7, 0x0

    .line 203
    const-string v4, ""

    .line 204
    .line 205
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 206
    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 213
    .line 214
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 215
    .line 216
    .line 217
    move-result-wide v6

    .line 218
    const/4 v0, 0x0

    .line 219
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const v0, 0x419f70a4    # 19.93f

    .line 236
    .line 237
    .line 238
    const v2, 0x4105999a    # 8.35f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, -0x3f99999a    # -3.6f

    .line 245
    .line 246
    .line 247
    const v2, 0x3fd70a3d    # 1.68f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v0, 0x41600000    # 14.0f

    .line 254
    .line 255
    const v2, 0x40f66666    # 7.7f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x40c9999a    # 6.3f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v0, 0x40151eb8    # 2.33f

    .line 268
    .line 269
    .line 270
    const v2, -0x3feae148    # -2.33f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x40666666    # 3.6f

    .line 277
    .line 278
    .line 279
    const v2, 0x3fd70a3d    # 1.68f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v17, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const v18, -0x4147ae14    # -0.36f

    .line 288
    .line 289
    .line 290
    const v13, 0x3ec28f5c    # 0.38f

    .line 291
    .line 292
    .line 293
    const v14, 0x3e3851ec    # 0.18f

    .line 294
    .line 295
    .line 296
    const v15, 0x3f51eb85    # 0.82f

    .line 297
    .line 298
    .line 299
    const v16, 0x3c23d70a    # 0.01f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, -0x4147ae14    # -0.36f

    .line 306
    .line 307
    .line 308
    const/high16 v18, -0x40800000    # -1.0f

    .line 309
    .line 310
    const v13, 0x3e3851ec    # 0.18f

    .line 311
    .line 312
    .line 313
    const v14, -0x413d70a4    # -0.38f

    .line 314
    .line 315
    .line 316
    const v15, 0x3c23d70a    # 0.01f

    .line 317
    .line 318
    .line 319
    const v16, -0x40ae147b    # -0.82f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v0, -0x3f851eb8    # -3.92f

    .line 326
    .line 327
    .line 328
    const v2, -0x4015c28f    # -1.83f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x406f5c29    # -1.13f

    .line 335
    .line 336
    .line 337
    const v18, 0x3e4ccccd    # 0.2f

    .line 338
    .line 339
    .line 340
    const v13, -0x413d70a4    # -0.38f

    .line 341
    .line 342
    .line 343
    const v14, -0x41c7ae14    # -0.18f

    .line 344
    .line 345
    .line 346
    const v15, -0x40ab851f    # -0.83f

    .line 347
    .line 348
    .line 349
    const v16, -0x42333333    # -0.1f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x415c7ae1    # 13.78f

    .line 356
    .line 357
    .line 358
    const v2, 0x408ccccd    # 4.4f

    .line 359
    .line 360
    .line 361
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x41500000    # 13.0f

    .line 365
    .line 366
    const/high16 v18, 0x40800000    # 4.0f

    .line 367
    .line 368
    const v13, 0x4159999a    # 13.6f

    .line 369
    .line 370
    .line 371
    const v14, 0x40851eb8    # 4.16f

    .line 372
    .line 373
    .line 374
    const v15, 0x41551eb8    # 13.32f

    .line 375
    .line 376
    .line 377
    const/high16 v16, 0x40800000    # 4.0f

    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, -0x40800000    # -1.0f

    .line 383
    .line 384
    const/high16 v18, 0x3f800000    # 1.0f

    .line 385
    .line 386
    const v13, -0x40f33333    # -0.55f

    .line 387
    .line 388
    .line 389
    const/4 v14, 0x0

    .line 390
    const/high16 v15, -0x40800000    # -1.0f

    .line 391
    .line 392
    const v16, 0x3ee66666    # 0.45f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, 0x3f800000    # 1.0f

    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, 0x410d1eb8    # 8.82f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const/high16 v17, 0x40c00000    # 6.0f

    .line 410
    .line 411
    const/high16 v18, 0x40800000    # 4.0f

    .line 412
    .line 413
    const v13, 0x41066666    # 8.4f

    .line 414
    .line 415
    .line 416
    const v14, 0x409ae148    # 4.84f

    .line 417
    .line 418
    .line 419
    const v15, 0x40e9999a    # 7.3f

    .line 420
    .line 421
    .line 422
    const/high16 v16, 0x40800000    # 4.0f

    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/high16 v17, 0x40400000    # 3.0f

    .line 428
    .line 429
    const/high16 v18, 0x40e00000    # 7.0f

    .line 430
    .line 431
    const v13, 0x408ae148    # 4.34f

    .line 432
    .line 433
    .line 434
    const/high16 v14, 0x40800000    # 4.0f

    .line 435
    .line 436
    const/high16 v15, 0x40400000    # 3.0f

    .line 437
    .line 438
    const v16, 0x40aae148    # 5.34f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3fbd70a4    # 1.48f

    .line 445
    .line 446
    .line 447
    const v18, 0x40251eb8    # 2.58f

    .line 448
    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const v14, 0x3f8ccccd    # 1.1f

    .line 452
    .line 453
    .line 454
    const v15, 0x3f19999a    # 0.6f

    .line 455
    .line 456
    .line 457
    const v16, 0x40033333    # 2.05f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x40e28f5c    # 7.08f

    .line 464
    .line 465
    .line 466
    const/high16 v2, 0x41900000    # 18.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, 0x40c00000    # 6.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, -0x40000000    # -2.0f

    .line 477
    .line 478
    const/high16 v18, 0x40000000    # 2.0f

    .line 479
    .line 480
    const v13, -0x40733333    # -1.1f

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    const/high16 v15, -0x40000000    # -2.0f

    .line 485
    .line 486
    const v16, 0x3f666666    # 0.9f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v0, 0x3f800000    # 1.0f

    .line 493
    .line 494
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x41500000    # 13.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, -0x40800000    # -1.0f

    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v18, -0x40000000    # -2.0f

    .line 508
    .line 509
    const/4 v13, 0x0

    .line 510
    const v14, -0x40733333    # -1.1f

    .line 511
    .line 512
    .line 513
    const v15, -0x4099999a    # -0.9f

    .line 514
    .line 515
    .line 516
    const/high16 v16, -0x40000000    # -2.0f

    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, -0x4030a3d7    # -1.62f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x41068f5c    # 8.41f

    .line 528
    .line 529
    .line 530
    const v2, 0x410c51ec    # 8.77f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v17, 0x410d1eb8    # 8.82f

    .line 537
    .line 538
    .line 539
    const/high16 v18, 0x41000000    # 8.0f

    .line 540
    .line 541
    const v13, 0x410947ae    # 8.58f

    .line 542
    .line 543
    .line 544
    const v14, 0x41087ae1    # 8.53f

    .line 545
    .line 546
    .line 547
    const v15, 0x410b851f    # 8.72f

    .line 548
    .line 549
    .line 550
    const v16, 0x41047ae1    # 8.28f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x41400000    # 12.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v0, 0x3f800000    # 1.0f

    .line 562
    .line 563
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v17, 0x3f800000    # 1.0f

    .line 567
    .line 568
    const/high16 v18, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/4 v13, 0x0

    .line 571
    const v14, 0x3f0ccccd    # 0.55f

    .line 572
    .line 573
    .line 574
    const v15, 0x3ee66666    # 0.45f

    .line 575
    .line 576
    .line 577
    const/high16 v16, 0x3f800000    # 1.0f

    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v17, 0x3f47ae14    # 0.78f

    .line 583
    .line 584
    .line 585
    const v18, -0x41333333    # -0.4f

    .line 586
    .line 587
    .line 588
    const v13, 0x3ea3d70a    # 0.32f

    .line 589
    .line 590
    .line 591
    const/4 v14, 0x0

    .line 592
    const v15, 0x3f19999a    # 0.6f

    .line 593
    .line 594
    .line 595
    const v16, -0x41dc28f6    # -0.16f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v0, 0x3fdeb852    # 1.74f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, 0x3f90a3d7    # 1.13f

    .line 608
    .line 609
    .line 610
    const v18, 0x3e4ccccd    # 0.2f

    .line 611
    .line 612
    .line 613
    const v13, 0x3e99999a    # 0.3f

    .line 614
    .line 615
    .line 616
    const v14, 0x3e99999a    # 0.3f

    .line 617
    .line 618
    .line 619
    const/high16 v15, 0x3f400000    # 0.75f

    .line 620
    .line 621
    const v16, 0x3ec28f5c    # 0.38f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, 0x407ae148    # 3.92f

    .line 628
    .line 629
    .line 630
    const v2, -0x4015c28f    # -1.83f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v17, 0x3eb851ec    # 0.36f

    .line 637
    .line 638
    .line 639
    const/high16 v18, -0x40800000    # -1.0f

    .line 640
    .line 641
    const v13, 0x3ec28f5c    # 0.38f

    .line 642
    .line 643
    .line 644
    const v14, -0x41c7ae14    # -0.18f

    .line 645
    .line 646
    .line 647
    const v15, 0x3f0a3d71    # 0.54f

    .line 648
    .line 649
    .line 650
    const v16, -0x40e147ae    # -0.62f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v17, 0x419f70a4    # 19.93f

    .line 657
    .line 658
    .line 659
    const v18, 0x4105999a    # 8.35f

    .line 660
    .line 661
    .line 662
    const/high16 v13, 0x41a60000    # 20.75f

    .line 663
    .line 664
    const v14, 0x410570a4    # 8.34f

    .line 665
    .line 666
    .line 667
    const v15, 0x41a27ae1    # 20.31f

    .line 668
    .line 669
    .line 670
    const v16, 0x4102b852    # 8.17f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v0, 0x41000000    # 8.0f

    .line 680
    .line 681
    const/high16 v2, 0x40c00000    # 6.0f

    .line 682
    .line 683
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v17, 0x40a00000    # 5.0f

    .line 687
    .line 688
    const/high16 v18, 0x40e00000    # 7.0f

    .line 689
    .line 690
    const v13, 0x40ae6666    # 5.45f

    .line 691
    .line 692
    .line 693
    const/high16 v14, 0x41000000    # 8.0f

    .line 694
    .line 695
    const/high16 v15, 0x40a00000    # 5.0f

    .line 696
    .line 697
    const v16, 0x40f1999a    # 7.55f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const/high16 v17, 0x3f800000    # 1.0f

    .line 704
    .line 705
    const/high16 v18, -0x40800000    # -1.0f

    .line 706
    .line 707
    const/4 v13, 0x0

    .line 708
    const v14, -0x40f33333    # -0.55f

    .line 709
    .line 710
    .line 711
    const v15, 0x3ee66666    # 0.45f

    .line 712
    .line 713
    .line 714
    const/high16 v16, -0x40800000    # -1.0f

    .line 715
    .line 716
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, 0x3ee66666    # 0.45f

    .line 720
    .line 721
    .line 722
    const/high16 v2, 0x3f800000    # 1.0f

    .line 723
    .line 724
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v17, 0x40c00000    # 6.0f

    .line 728
    .line 729
    const/high16 v18, 0x41000000    # 8.0f

    .line 730
    .line 731
    const/high16 v13, 0x40e00000    # 7.0f

    .line 732
    .line 733
    const v14, 0x40f1999a    # 7.55f

    .line 734
    .line 735
    .line 736
    const v15, 0x40d1999a    # 6.55f

    .line 737
    .line 738
    .line 739
    const/high16 v16, 0x41000000    # 8.0f

    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v0, 0x4131c28f    # 11.11f

    .line 748
    .line 749
    .line 750
    const/high16 v2, 0x41900000    # 18.0f

    .line 751
    .line 752
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const v0, 0x4112b852    # 9.17f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v0, -0x3fe28f5c    # -2.46f

    .line 762
    .line 763
    .line 764
    const/high16 v2, -0x3f000000    # -8.0f

    .line 765
    .line 766
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, 0x3dcccccd    # 0.1f

    .line 770
    .line 771
    .line 772
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v0, 0x4131c28f    # 11.11f

    .line 776
    .line 777
    .line 778
    const/high16 v2, 0x41900000    # 18.0f

    .line 779
    .line 780
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 787
    .line 788
    .line 789
    move-result-object v2

    .line 790
    const/16 v16, 0x3800

    .line 791
    .line 792
    const/16 v17, 0x0

    .line 793
    .line 794
    const/high16 v6, 0x3f800000    # 1.0f

    .line 795
    .line 796
    const/high16 v8, 0x3f800000    # 1.0f

    .line 797
    .line 798
    const/4 v7, 0x0

    .line 799
    const/high16 v12, 0x3f800000    # 1.0f

    .line 800
    .line 801
    const/4 v13, 0x0

    .line 802
    const/4 v14, 0x0

    .line 803
    const/4 v15, 0x0

    .line 804
    const-string v4, ""

    .line 805
    .line 806
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    sput-object v0, Landroidx/compose/material/icons/twotone/PrecisionManufacturingKt;->_precisionManufacturing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 815
    .line 816
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    return-object v0
.end method

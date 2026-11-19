.class public final Landroidx/compose/material/icons/twotone/FilterDramaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filterDrama:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilterDrama(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FilterDramaKt;->_filterDrama:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.FilterDrama"

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
    const/high16 v6, 0x41980000    # 19.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40400000    # -1.5f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, -0x41000000    # -0.5f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v25, 0x41400000    # 12.0f

    .line 88
    .line 89
    const/high16 v26, 0x40c00000    # 6.0f

    .line 90
    .line 91
    const/high16 v21, 0x418c0000    # 17.5f

    .line 92
    .line 93
    const v22, 0x4107851f    # 8.47f

    .line 94
    .line 95
    .line 96
    const v23, 0x41707ae1    # 15.03f

    .line 97
    .line 98
    .line 99
    const/high16 v24, 0x40c00000    # 6.0f

    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v25, -0x3f733333    # -4.4f

    .line 107
    .line 108
    .line 109
    const v26, 0x400e147b    # 2.22f

    .line 110
    .line 111
    .line 112
    const v21, -0x4019999a    # -1.8f

    .line 113
    .line 114
    .line 115
    const/16 v22, 0x0

    .line 116
    .line 117
    const v23, -0x3fa70a3d    # -3.39f

    .line 118
    .line 119
    .line 120
    const v24, 0x3f6147ae    # 0.88f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v25, 0x408ccccd    # 4.4f

    .line 127
    .line 128
    .line 129
    const v26, 0x40b8f5c3    # 5.78f

    .line 130
    .line 131
    .line 132
    const v21, 0x40228f5c    # 2.54f

    .line 133
    .line 134
    .line 135
    const v22, 0x3f333333    # 0.7f

    .line 136
    .line 137
    .line 138
    const v23, 0x408ccccd    # 4.4f

    .line 139
    .line 140
    .line 141
    const v24, 0x404147ae    # 3.02f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, -0x40000000    # -2.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, -0x3f800000    # -4.0f

    .line 153
    .line 154
    const/high16 v26, -0x3f800000    # -4.0f

    .line 155
    .line 156
    const/16 v21, 0x0

    .line 157
    .line 158
    const v22, -0x3ff28f5c    # -2.21f

    .line 159
    .line 160
    .line 161
    const v23, -0x401ae148    # -1.79f

    .line 162
    .line 163
    .line 164
    const/high16 v24, -0x3f800000    # -4.0f

    .line 165
    .line 166
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x3fe51eb8    # 1.79f

    .line 170
    .line 171
    .line 172
    const/high16 v6, -0x3f800000    # -4.0f

    .line 173
    .line 174
    const/high16 v7, 0x40800000    # 4.0f

    .line 175
    .line 176
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v6, 0x40800000    # 4.0f

    .line 180
    .line 181
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x41500000    # 13.0f

    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v25, 0x40400000    # 3.0f

    .line 190
    .line 191
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 192
    .line 193
    const v21, 0x3fd33333    # 1.65f

    .line 194
    .line 195
    .line 196
    const/16 v22, 0x0

    .line 197
    .line 198
    const/high16 v23, 0x40400000    # 3.0f

    .line 199
    .line 200
    const v24, -0x40533333    # -1.35f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v4, -0x40533333    # -1.35f

    .line 207
    .line 208
    .line 209
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 210
    .line 211
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    const/16 v16, 0x3800

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const v6, 0x3e99999a    # 0.3f

    .line 226
    .line 227
    .line 228
    const v8, 0x3e99999a    # 0.3f

    .line 229
    .line 230
    .line 231
    const/4 v7, 0x0

    .line 232
    const/high16 v9, 0x3f800000    # 1.0f

    .line 233
    .line 234
    const/high16 v12, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    const/4 v14, 0x0

    .line 238
    const/4 v15, 0x0

    .line 239
    const-string v4, ""

    .line 240
    .line 241
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 242
    .line 243
    .line 244
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 249
    .line 250
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 251
    .line 252
    .line 253
    move-result-wide v6

    .line 254
    const/4 v0, 0x0

    .line 255
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 263
    .line 264
    .line 265
    move-result v11

    .line 266
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    const v0, 0x419acccd    # 19.35f

    .line 272
    .line 273
    .line 274
    const v2, 0x4120a3d7    # 10.04f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v17, 0x41400000    # 12.0f

    .line 281
    .line 282
    const/high16 v18, 0x40800000    # 4.0f

    .line 283
    .line 284
    const v13, 0x41955c29    # 18.67f

    .line 285
    .line 286
    .line 287
    const v14, 0x40d2e148    # 6.59f

    .line 288
    .line 289
    .line 290
    const v15, 0x417a3d71    # 15.64f

    .line 291
    .line 292
    .line 293
    const/high16 v16, 0x40800000    # 4.0f

    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, 0x40ab851f    # 5.36f

    .line 299
    .line 300
    .line 301
    const v18, 0x4100a3d7    # 8.04f

    .line 302
    .line 303
    .line 304
    const v13, 0x4111c28f    # 9.11f

    .line 305
    .line 306
    .line 307
    const/high16 v14, 0x40800000    # 4.0f

    .line 308
    .line 309
    const v15, 0x40d3851f    # 6.61f

    .line 310
    .line 311
    .line 312
    const v16, 0x40b47ae1    # 5.64f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/16 v17, 0x0

    .line 319
    .line 320
    const/high16 v18, 0x41600000    # 14.0f

    .line 321
    .line 322
    const v13, 0x40166666    # 2.35f

    .line 323
    .line 324
    .line 325
    const v14, 0x4105c28f    # 8.36f

    .line 326
    .line 327
    .line 328
    const/4 v15, 0x0

    .line 329
    const v16, 0x412e6666    # 10.9f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x40c00000    # 6.0f

    .line 336
    .line 337
    const/high16 v18, 0x40c00000    # 6.0f

    .line 338
    .line 339
    const/4 v13, 0x0

    .line 340
    const v14, 0x4053d70a    # 3.31f

    .line 341
    .line 342
    .line 343
    const v15, 0x402c28f6    # 2.69f

    .line 344
    .line 345
    .line 346
    const/high16 v16, 0x40c00000    # 6.0f

    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v0, 0x41500000    # 13.0f

    .line 352
    .line 353
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const/high16 v17, 0x40a00000    # 5.0f

    .line 357
    .line 358
    const/high16 v18, -0x3f600000    # -5.0f

    .line 359
    .line 360
    const v13, 0x4030a3d7    # 2.76f

    .line 361
    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const/high16 v15, 0x40a00000    # 5.0f

    .line 365
    .line 366
    const v16, -0x3ff0a3d7    # -2.24f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x3f6b3333    # -4.65f

    .line 373
    .line 374
    .line 375
    const v18, -0x3f6147ae    # -4.96f

    .line 376
    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const v14, -0x3fd70a3d    # -2.64f

    .line 380
    .line 381
    .line 382
    const v15, -0x3ffccccd    # -2.05f

    .line 383
    .line 384
    .line 385
    const v16, -0x3f670a3d    # -4.78f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/high16 v0, 0x41900000    # 18.0f

    .line 395
    .line 396
    const/high16 v2, 0x41980000    # 19.0f

    .line 397
    .line 398
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const/high16 v0, 0x40c00000    # 6.0f

    .line 402
    .line 403
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v17, -0x3f800000    # -4.0f

    .line 407
    .line 408
    const/high16 v18, -0x3f800000    # -4.0f

    .line 409
    .line 410
    const v13, -0x3ff28f5c    # -2.21f

    .line 411
    .line 412
    .line 413
    const/4 v14, 0x0

    .line 414
    const/high16 v15, -0x3f800000    # -4.0f

    .line 415
    .line 416
    const v16, -0x401ae148    # -1.79f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x3fe51eb8    # 1.79f

    .line 423
    .line 424
    .line 425
    const/high16 v2, -0x3f800000    # -4.0f

    .line 426
    .line 427
    const/high16 v4, 0x40800000    # 4.0f

    .line 428
    .line 429
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const/high16 v2, 0x40800000    # 4.0f

    .line 433
    .line 434
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x40000000    # 2.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, -0x3f733333    # -4.4f

    .line 443
    .line 444
    .line 445
    const v18, -0x3f470a3d    # -5.78f

    .line 446
    .line 447
    .line 448
    const/4 v13, 0x0

    .line 449
    const v14, -0x3fcf5c29    # -2.76f

    .line 450
    .line 451
    .line 452
    const v15, -0x4011eb85    # -1.86f

    .line 453
    .line 454
    .line 455
    const v16, -0x3f5d70a4    # -5.08f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v17, 0x41400000    # 12.0f

    .line 462
    .line 463
    const/high16 v18, 0x40c00000    # 6.0f

    .line 464
    .line 465
    const v13, 0x4109c28f    # 8.61f

    .line 466
    .line 467
    .line 468
    const v14, 0x40dc28f6    # 6.88f

    .line 469
    .line 470
    .line 471
    const v15, 0x41233333    # 10.2f

    .line 472
    .line 473
    .line 474
    const/high16 v16, 0x40c00000    # 6.0f

    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, 0x40b00000    # 5.5f

    .line 480
    .line 481
    const/high16 v18, 0x40b00000    # 5.5f

    .line 482
    .line 483
    const v13, 0x4041eb85    # 3.03f

    .line 484
    .line 485
    .line 486
    const/4 v14, 0x0

    .line 487
    const/high16 v15, 0x40b00000    # 5.5f

    .line 488
    .line 489
    const v16, 0x401e147b    # 2.47f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x3f000000    # 0.5f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, 0x41980000    # 19.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v17, 0x40400000    # 3.0f

    .line 506
    .line 507
    const/high16 v18, 0x40400000    # 3.0f

    .line 508
    .line 509
    const v13, 0x3fd33333    # 1.65f

    .line 510
    .line 511
    .line 512
    const/high16 v15, 0x40400000    # 3.0f

    .line 513
    .line 514
    const v16, 0x3faccccd    # 1.35f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x40400000    # 3.0f

    .line 521
    .line 522
    const v2, -0x40533333    # -1.35f

    .line 523
    .line 524
    .line 525
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 526
    .line 527
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 534
    .line 535
    .line 536
    move-result-object v2

    .line 537
    const/16 v16, 0x3800

    .line 538
    .line 539
    const/16 v17, 0x0

    .line 540
    .line 541
    const/high16 v6, 0x3f800000    # 1.0f

    .line 542
    .line 543
    const/high16 v8, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/4 v7, 0x0

    .line 546
    const/high16 v12, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/4 v13, 0x0

    .line 549
    const/4 v15, 0x0

    .line 550
    const-string v4, ""

    .line 551
    .line 552
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    sput-object v0, Landroidx/compose/material/icons/twotone/FilterDramaKt;->_filterDrama:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 561
    .line 562
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    return-object v0
.end method

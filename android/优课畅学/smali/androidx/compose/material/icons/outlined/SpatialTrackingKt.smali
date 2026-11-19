.class public final Landroidx/compose/material/icons/outlined/SpatialTrackingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _spatialTracking:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpatialTracking(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SpatialTrackingKt;->_spatialTracking:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SpatialTracking"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40800000    # 4.0f

    .line 78
    .line 79
    const/high16 v26, -0x3f800000    # -4.0f

    .line 80
    .line 81
    const v21, 0x400d70a4    # 2.21f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40800000    # 4.0f

    .line 87
    .line 88
    const v24, -0x401ae148    # -1.79f

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
    const/high16 v25, -0x3f800000    # -4.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, -0x3ff28f5c    # -2.21f

    .line 101
    .line 102
    .line 103
    const v23, -0x401ae148    # -1.79f

    .line 104
    .line 105
    .line 106
    const/high16 v24, -0x3f800000    # -4.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x40d947ae    # 6.79f

    .line 112
    .line 113
    .line 114
    const/high16 v6, 0x41100000    # 9.0f

    .line 115
    .line 116
    const/high16 v7, 0x40c00000    # 6.0f

    .line 117
    .line 118
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41200000    # 10.0f

    .line 122
    .line 123
    const/high16 v26, 0x41500000    # 13.0f

    .line 124
    .line 125
    const/high16 v21, 0x40c00000    # 6.0f

    .line 126
    .line 127
    const v22, 0x41335c29    # 11.21f

    .line 128
    .line 129
    .line 130
    const v23, 0x40f947ae    # 7.79f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x41500000    # 13.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x40e00000    # 7.0f

    .line 142
    .line 143
    const/high16 v6, 0x41200000    # 10.0f

    .line 144
    .line 145
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v25, 0x40000000    # 2.0f

    .line 149
    .line 150
    const/high16 v26, 0x40000000    # 2.0f

    .line 151
    .line 152
    const v21, 0x3f8ccccd    # 1.1f

    .line 153
    .line 154
    .line 155
    const/16 v22, 0x0

    .line 156
    .line 157
    const/high16 v23, 0x40000000    # 2.0f

    .line 158
    .line 159
    const v24, 0x3f666666    # 0.9f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, -0x40000000    # -2.0f

    .line 166
    .line 167
    const/16 v21, 0x0

    .line 168
    .line 169
    const v22, 0x3f8ccccd    # 1.1f

    .line 170
    .line 171
    .line 172
    const v23, -0x4099999a    # -0.9f

    .line 173
    .line 174
    .line 175
    const/high16 v24, 0x40000000    # 2.0f

    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v4, -0x4099999a    # -0.9f

    .line 181
    .line 182
    .line 183
    const/high16 v6, -0x40000000    # -2.0f

    .line 184
    .line 185
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v25, 0x41200000    # 10.0f

    .line 189
    .line 190
    const/high16 v26, 0x40e00000    # 7.0f

    .line 191
    .line 192
    const/high16 v21, 0x41000000    # 8.0f

    .line 193
    .line 194
    const v22, 0x40fccccd    # 7.9f

    .line 195
    .line 196
    .line 197
    const v23, 0x410e6666    # 8.9f

    .line 198
    .line 199
    .line 200
    const/high16 v24, 0x40e00000    # 7.0f

    .line 201
    .line 202
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const/16 v16, 0x3800

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    const/high16 v6, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/high16 v8, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/4 v7, 0x0

    .line 221
    const/high16 v9, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v12, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    const-string v4, ""

    .line 229
    .line 230
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 240
    .line 241
    .line 242
    move-result-wide v6

    .line 243
    const/4 v2, 0x0

    .line 244
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 248
    .line 249
    .line 250
    move-result v10

    .line 251
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 252
    .line 253
    .line 254
    move-result v11

    .line 255
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    const v4, 0x41831eb8    # 16.39f

    .line 261
    .line 262
    .line 263
    const v6, 0x4178f5c3    # 15.56f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v26, 0x41600000    # 14.0f

    .line 270
    .line 271
    const v21, 0x416b5c29    # 14.71f

    .line 272
    .line 273
    .line 274
    const v22, 0x416b3333    # 14.7f

    .line 275
    .line 276
    .line 277
    const v23, 0x41487ae1    # 12.53f

    .line 278
    .line 279
    .line 280
    const/high16 v24, 0x41600000    # 14.0f

    .line 281
    .line 282
    move-object/from16 v20, v2

    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v25, -0x3f33851f    # -6.39f

    .line 288
    .line 289
    .line 290
    const v26, 0x3fc7ae14    # 1.56f

    .line 291
    .line 292
    .line 293
    const v21, -0x3fde147b    # -2.53f

    .line 294
    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const v23, -0x3f6947ae    # -4.71f

    .line 299
    .line 300
    .line 301
    const v24, 0x3f333333    # 0.7f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v25, 0x40000000    # 2.0f

    .line 308
    .line 309
    const v26, 0x4191c28f    # 18.22f

    .line 310
    .line 311
    .line 312
    const v21, 0x40270a3d    # 2.61f

    .line 313
    .line 314
    .line 315
    const v22, 0x41808f5c    # 16.07f

    .line 316
    .line 317
    .line 318
    const/high16 v23, 0x40000000    # 2.0f

    .line 319
    .line 320
    const v24, 0x4188cccd    # 17.1f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, 0x41a80000    # 21.0f

    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x41800000    # 16.0f

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, -0x3fce147b    # -2.78f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v25, 0x41831eb8    # 16.39f

    .line 343
    .line 344
    .line 345
    const v26, 0x4178f5c3    # 15.56f

    .line 346
    .line 347
    .line 348
    const/high16 v21, 0x41900000    # 18.0f

    .line 349
    .line 350
    const v22, 0x4188cccd    # 17.1f

    .line 351
    .line 352
    .line 353
    const v23, 0x418b1eb8    # 17.39f

    .line 354
    .line 355
    .line 356
    const v24, 0x41808f5c    # 16.07f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x41980000    # 19.0f

    .line 366
    .line 367
    const/high16 v6, 0x41800000    # 16.0f

    .line 368
    .line 369
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v4, 0x40800000    # 4.0f

    .line 373
    .line 374
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v4, -0x40b851ec    # -0.78f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, 0x3f051eb8    # 0.52f

    .line 384
    .line 385
    .line 386
    const v26, -0x409eb852    # -0.88f

    .line 387
    .line 388
    .line 389
    const/16 v21, 0x0

    .line 390
    .line 391
    const v22, -0x413d70a4    # -0.38f

    .line 392
    .line 393
    .line 394
    const v23, 0x3e4ccccd    # 0.2f

    .line 395
    .line 396
    .line 397
    const v24, -0x40c7ae14    # -0.72f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v25, 0x41200000    # 10.0f

    .line 404
    .line 405
    const/high16 v26, 0x41800000    # 16.0f

    .line 406
    .line 407
    const v21, 0x40b6b852    # 5.71f

    .line 408
    .line 409
    .line 410
    const v22, 0x4185d70a    # 16.73f

    .line 411
    .line 412
    .line 413
    const v23, 0x40f428f6    # 7.63f

    .line 414
    .line 415
    .line 416
    const/high16 v24, 0x41800000    # 16.0f

    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v25, 0x40af5c29    # 5.48f

    .line 422
    .line 423
    .line 424
    const v26, 0x3fab851f    # 1.34f

    .line 425
    .line 426
    .line 427
    const v21, 0x4017ae14    # 2.37f

    .line 428
    .line 429
    .line 430
    const/16 v22, 0x0

    .line 431
    .line 432
    const v23, 0x408947ae    # 4.29f

    .line 433
    .line 434
    .line 435
    const v24, 0x3f3ae148    # 0.73f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v25, 0x41800000    # 16.0f

    .line 442
    .line 443
    const v26, 0x4191c28f    # 18.22f

    .line 444
    .line 445
    .line 446
    const v21, 0x417ccccd    # 15.8f

    .line 447
    .line 448
    .line 449
    const/high16 v22, 0x418c0000    # 17.5f

    .line 450
    .line 451
    const/high16 v23, 0x41800000    # 16.0f

    .line 452
    .line 453
    const v24, 0x418eb852    # 17.84f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v4, 0x41980000    # 19.0f

    .line 460
    .line 461
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    const/high16 v6, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    const-string v4, ""

    .line 475
    .line 476
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 477
    .line 478
    .line 479
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 480
    .line 481
    .line 482
    move-result v3

    .line 483
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 484
    .line 485
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 486
    .line 487
    .line 488
    move-result-wide v6

    .line 489
    const/4 v2, 0x0

    .line 490
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 494
    .line 495
    .line 496
    move-result v10

    .line 497
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 498
    .line 499
    .line 500
    move-result v11

    .line 501
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 504
    .line 505
    .line 506
    const v4, 0x41a06666    # 20.05f

    .line 507
    .line 508
    .line 509
    const v6, 0x401a3d71    # 2.41f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v4, 0x41951eb8    # 18.64f

    .line 516
    .line 517
    .line 518
    const/high16 v6, 0x3f800000    # 1.0f

    .line 519
    .line 520
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/16 v25, 0x0

    .line 524
    .line 525
    const v26, 0x414bae14    # 12.73f

    .line 526
    .line 527
    .line 528
    const v21, -0x3f9f5c29    # -3.51f

    .line 529
    .line 530
    .line 531
    const v22, 0x4060a3d7    # 3.51f

    .line 532
    .line 533
    .line 534
    const v23, -0x3f9f5c29    # -3.51f

    .line 535
    .line 536
    .line 537
    const v24, 0x41135c29    # 9.21f

    .line 538
    .line 539
    .line 540
    move-object/from16 v20, v2

    .line 541
    .line 542
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v4, 0x3fb47ae1    # 1.41f

    .line 546
    .line 547
    .line 548
    const v6, -0x404b851f    # -1.41f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v25, 0x41a06666    # 20.05f

    .line 555
    .line 556
    .line 557
    const v26, 0x401a3d71    # 2.41f

    .line 558
    .line 559
    .line 560
    const v21, 0x418a8f5c    # 17.32f

    .line 561
    .line 562
    .line 563
    const v22, 0x411947ae    # 9.58f

    .line 564
    .line 565
    .line 566
    const v23, 0x418a8f5c    # 17.32f

    .line 567
    .line 568
    .line 569
    const v24, 0x40a47ae1    # 5.14f

    .line 570
    .line 571
    .line 572
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    const/high16 v6, 0x3f800000    # 1.0f

    .line 583
    .line 584
    const/4 v7, 0x0

    .line 585
    const-string v4, ""

    .line 586
    .line 587
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 588
    .line 589
    .line 590
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 595
    .line 596
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 597
    .line 598
    .line 599
    move-result-wide v6

    .line 600
    const/4 v0, 0x0

    .line 601
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 605
    .line 606
    .line 607
    move-result v10

    .line 608
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 609
    .line 610
    .line 611
    move-result v11

    .line 612
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    const v0, 0x41b70a3d    # 22.88f

    .line 618
    .line 619
    .line 620
    const v2, 0x40a7ae14    # 5.24f

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v0, -0x404b851f    # -1.41f

    .line 627
    .line 628
    .line 629
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/16 v17, 0x0

    .line 633
    .line 634
    const v18, 0x40e23d71    # 7.07f

    .line 635
    .line 636
    .line 637
    const v13, -0x40066666    # -1.95f

    .line 638
    .line 639
    .line 640
    const v14, 0x3ff9999a    # 1.95f

    .line 641
    .line 642
    .line 643
    const v15, -0x40066666    # -1.95f

    .line 644
    .line 645
    .line 646
    const v16, 0x40a3d70a    # 5.12f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v0, 0x3fb47ae1    # 1.41f

    .line 653
    .line 654
    .line 655
    const v2, -0x404b851f    # -1.41f

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v17, 0x41b70a3d    # 22.88f

    .line 662
    .line 663
    .line 664
    const v18, 0x40a7ae14    # 5.24f

    .line 665
    .line 666
    .line 667
    const v13, 0x41adae14    # 21.71f

    .line 668
    .line 669
    .line 670
    const v14, 0x41051eb8    # 8.32f

    .line 671
    .line 672
    .line 673
    const v15, 0x41adae14    # 21.71f

    .line 674
    .line 675
    .line 676
    const v16, 0x40cd1eb8    # 6.41f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    const/16 v16, 0x3800

    .line 690
    .line 691
    const/16 v17, 0x0

    .line 692
    .line 693
    const/high16 v6, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/4 v7, 0x0

    .line 696
    const/high16 v12, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const/4 v13, 0x0

    .line 699
    const/4 v14, 0x0

    .line 700
    const/4 v15, 0x0

    .line 701
    const-string v4, ""

    .line 702
    .line 703
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    sput-object v0, Landroidx/compose/material/icons/outlined/SpatialTrackingKt;->_spatialTracking:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 712
    .line 713
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 714
    .line 715
    .line 716
    return-object v0
.end method

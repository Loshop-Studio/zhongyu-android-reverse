.class public final Landroidx/compose/material/icons/rounded/SpatialAudioOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpatialAudioOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SpatialAudioOffKt;->_spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SpatialAudioOff"

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
    const/high16 v4, 0x40000000    # 2.0f

    .line 228
    .line 229
    const/high16 v6, 0x41980000    # 19.0f

    .line 230
    .line 231
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v26, 0x40000000    # 2.0f

    .line 235
    .line 236
    const/16 v21, 0x0

    .line 237
    .line 238
    const v22, 0x3f8ccccd    # 1.1f

    .line 239
    .line 240
    .line 241
    const v23, 0x3f666666    # 0.9f

    .line 242
    .line 243
    .line 244
    const/high16 v24, 0x40000000    # 2.0f

    .line 245
    .line 246
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v4, 0x41400000    # 12.0f

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v26, -0x40000000    # -2.0f

    .line 255
    .line 256
    const v21, 0x3f8ccccd    # 1.1f

    .line 257
    .line 258
    .line 259
    const/16 v22, 0x0

    .line 260
    .line 261
    const/high16 v23, 0x40000000    # 2.0f

    .line 262
    .line 263
    const v24, -0x4099999a    # -0.9f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, -0x40b851ec    # -0.78f

    .line 270
    .line 271
    .line 272
    const/4 v6, 0x0

    .line 273
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v25, 0x41831eb8    # 16.39f

    .line 277
    .line 278
    .line 279
    const v26, 0x4178f5c3    # 15.56f

    .line 280
    .line 281
    .line 282
    const/high16 v21, 0x41900000    # 18.0f

    .line 283
    .line 284
    const v22, 0x4188cccd    # 17.1f

    .line 285
    .line 286
    .line 287
    const v23, 0x418b1eb8    # 17.39f

    .line 288
    .line 289
    .line 290
    const v24, 0x41808f5c    # 16.07f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const/high16 v6, 0x3f800000    # 1.0f

    .line 304
    .line 305
    const/4 v7, 0x0

    .line 306
    const-string v4, ""

    .line 307
    .line 308
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 309
    .line 310
    .line 311
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 316
    .line 317
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 318
    .line 319
    .line 320
    move-result-wide v6

    .line 321
    const/4 v2, 0x0

    .line 322
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 330
    .line 331
    .line 332
    move-result v11

    .line 333
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 336
    .line 337
    .line 338
    const v4, 0x41a8e148    # 21.11f

    .line 339
    .line 340
    .line 341
    const v6, 0x3feccccd    # 1.85f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v25, -0x40400000    # -1.5f

    .line 348
    .line 349
    const v26, -0x4247ae14    # -0.09f

    .line 350
    .line 351
    .line 352
    const v21, -0x41428f5c    # -0.37f

    .line 353
    .line 354
    .line 355
    const v22, -0x410a3d71    # -0.48f

    .line 356
    .line 357
    .line 358
    const v23, -0x4075c28f    # -1.08f

    .line 359
    .line 360
    .line 361
    const v24, -0x40fae148    # -0.52f

    .line 362
    .line 363
    .line 364
    move-object/from16 v20, v2

    .line 365
    .line 366
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/4 v4, 0x0

    .line 370
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v25, -0x4247ae14    # -0.09f

    .line 374
    .line 375
    .line 376
    const v26, 0x3fa66666    # 1.3f

    .line 377
    .line 378
    .line 379
    const v21, -0x414ccccd    # -0.35f

    .line 380
    .line 381
    .line 382
    const v22, 0x3eb33333    # 0.35f

    .line 383
    .line 384
    .line 385
    const v23, -0x413851ec    # -0.39f

    .line 386
    .line 387
    .line 388
    const v24, 0x3f68f5c3    # 0.91f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const/16 v25, 0x0

    .line 395
    .line 396
    const v26, 0x4109c28f    # 8.61f

    .line 397
    .line 398
    .line 399
    const v21, 0x3f95c28f    # 1.17f

    .line 400
    .line 401
    .line 402
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 403
    .line 404
    const v23, 0x4028f5c3    # 2.64f

    .line 405
    .line 406
    .line 407
    const v24, 0x40a75c29    # 5.23f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v25, 0x3db851ec    # 0.09f

    .line 414
    .line 415
    .line 416
    const v26, 0x3fa66666    # 1.3f

    .line 417
    .line 418
    .line 419
    const v21, -0x41666666    # -0.3f

    .line 420
    .line 421
    .line 422
    const v22, 0x3ec7ae14    # 0.39f

    .line 423
    .line 424
    .line 425
    const v23, -0x417ae148    # -0.26f

    .line 426
    .line 427
    .line 428
    const v24, 0x3f733333    # 0.95f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 438
    .line 439
    const v26, -0x4247ae14    # -0.09f

    .line 440
    .line 441
    .line 442
    const v21, 0x3edc28f6    # 0.43f

    .line 443
    .line 444
    .line 445
    const v22, 0x3edc28f6    # 0.43f

    .line 446
    .line 447
    .line 448
    const v23, 0x3f90a3d7    # 1.13f

    .line 449
    .line 450
    .line 451
    const v24, 0x3ec28f5c    # 0.38f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v25, 0x41a8e148    # 21.11f

    .line 458
    .line 459
    .line 460
    const v26, 0x3feccccd    # 1.85f

    .line 461
    .line 462
    .line 463
    const v21, 0x41b4e148    # 22.61f

    .line 464
    .line 465
    .line 466
    const v22, 0x412f3333    # 10.95f

    .line 467
    .line 468
    .line 469
    const v23, 0x41c3ae14    # 24.46f

    .line 470
    .line 471
    .line 472
    const v24, 0x40c51eb8    # 6.16f

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    const/high16 v6, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const/4 v7, 0x0

    .line 488
    const-string v4, ""

    .line 489
    .line 490
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 491
    .line 492
    .line 493
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 498
    .line 499
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 500
    .line 501
    .line 502
    move-result-wide v6

    .line 503
    const/4 v0, 0x0

    .line 504
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 508
    .line 509
    .line 510
    move-result v10

    .line 511
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 512
    .line 513
    .line 514
    move-result v11

    .line 515
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 518
    .line 519
    .line 520
    const v0, 0x41927ae1    # 18.31f

    .line 521
    .line 522
    .line 523
    const v2, 0x409ae148    # 4.84f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, -0x4035c28f    # -1.58f

    .line 530
    .line 531
    .line 532
    const v18, -0x41a8f5c3    # -0.21f

    .line 533
    .line 534
    .line 535
    const v13, -0x41570a3d    # -0.33f

    .line 536
    .line 537
    .line 538
    const v14, -0x40ee147b    # -0.57f

    .line 539
    .line 540
    .line 541
    const v15, -0x4071eb85    # -1.11f

    .line 542
    .line 543
    .line 544
    const v16, -0x40d47ae1    # -0.67f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, -0x41fae148    # -0.13f

    .line 551
    .line 552
    .line 553
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 554
    .line 555
    const v14, 0x3ea8f5c3    # 0.33f

    .line 556
    .line 557
    .line 558
    const v15, -0x4147ae14    # -0.36f

    .line 559
    .line 560
    .line 561
    const v16, 0x3f570a3d    # 0.84f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v17, -0x43dc28f6    # -0.01f

    .line 568
    .line 569
    .line 570
    const v18, 0x403f5c29    # 2.99f

    .line 571
    .line 572
    .line 573
    const/high16 v13, 0x3e800000    # 0.25f

    .line 574
    .line 575
    const v14, 0x3ee147ae    # 0.44f

    .line 576
    .line 577
    .line 578
    const v15, 0x3f3d70a4    # 0.74f

    .line 579
    .line 580
    .line 581
    const v16, 0x3fd851ec    # 1.69f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, 0x3e0f5c29    # 0.14f

    .line 588
    .line 589
    .line 590
    const v18, 0x3f9c28f6    # 1.22f

    .line 591
    .line 592
    .line 593
    const v13, -0x41947ae1    # -0.23f

    .line 594
    .line 595
    .line 596
    const v14, 0x3ecccccd    # 0.4f

    .line 597
    .line 598
    .line 599
    const v15, -0x41bd70a4    # -0.19f

    .line 600
    .line 601
    .line 602
    const v16, 0x3f666666    # 0.9f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/4 v0, 0x0

    .line 609
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, 0x3fca3d71    # 1.58f

    .line 613
    .line 614
    .line 615
    const v18, -0x419eb852    # -0.22f

    .line 616
    .line 617
    .line 618
    const v13, 0x3ef0a3d7    # 0.47f

    .line 619
    .line 620
    .line 621
    const v14, 0x3ef0a3d7    # 0.47f

    .line 622
    .line 623
    .line 624
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 625
    .line 626
    const v16, 0x3eb33333    # 0.35f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v17, 0x41927ae1    # 18.31f

    .line 633
    .line 634
    .line 635
    const v18, 0x409ae148    # 4.84f

    .line 636
    .line 637
    .line 638
    const v13, 0x419bc28f    # 19.47f

    .line 639
    .line 640
    .line 641
    const v14, 0x40fc28f6    # 7.88f

    .line 642
    .line 643
    .line 644
    const v15, 0x41971eb8    # 18.89f

    .line 645
    .line 646
    .line 647
    const v16, 0x40bb3333    # 5.85f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    const/16 v16, 0x3800

    .line 661
    .line 662
    const/16 v17, 0x0

    .line 663
    .line 664
    const/high16 v6, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/4 v7, 0x0

    .line 667
    const/high16 v12, 0x3f800000    # 1.0f

    .line 668
    .line 669
    const/4 v13, 0x0

    .line 670
    const/4 v14, 0x0

    .line 671
    const/4 v15, 0x0

    .line 672
    const-string v4, ""

    .line 673
    .line 674
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    sput-object v0, Landroidx/compose/material/icons/rounded/SpatialAudioOffKt;->_spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 683
    .line 684
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    return-object v0
.end method

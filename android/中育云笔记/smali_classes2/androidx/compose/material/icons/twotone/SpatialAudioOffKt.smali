.class public final Landroidx/compose/material/icons/twotone/SpatialAudioOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpatialAudioOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SpatialAudioOffKt;->_spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SpatialAudioOff"

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
    const v4, 0x4177ae14    # 15.48f

    .line 71
    .line 72
    .line 73
    const v6, 0x418ab852    # 17.34f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41200000    # 10.0f

    .line 80
    .line 81
    const/high16 v26, 0x41800000    # 16.0f

    .line 82
    .line 83
    const v21, 0x4164a3d7    # 14.29f

    .line 84
    .line 85
    .line 86
    const v22, 0x4185d70a    # 16.73f

    .line 87
    .line 88
    .line 89
    const v23, 0x4145eb85    # 12.37f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x41800000    # 16.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x3f50a3d7    # -5.48f

    .line 100
    .line 101
    .line 102
    const v26, 0x3fab851f    # 1.34f

    .line 103
    .line 104
    .line 105
    const v21, -0x3fe851ec    # -2.37f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const v23, -0x3f76b852    # -4.29f

    .line 111
    .line 112
    .line 113
    const v24, 0x3f3ae148    # 0.73f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40800000    # 4.0f

    .line 120
    .line 121
    const v26, 0x4191c28f    # 18.22f

    .line 122
    .line 123
    .line 124
    const v21, 0x40866666    # 4.2f

    .line 125
    .line 126
    .line 127
    const/high16 v22, 0x418c0000    # 17.5f

    .line 128
    .line 129
    const/high16 v23, 0x40800000    # 4.0f

    .line 130
    .line 131
    const v24, 0x418eb852    # 17.84f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v4, 0x41980000    # 19.0f

    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x41400000    # 12.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v4, -0x40b851ec    # -0.78f

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v25, 0x4177ae14    # 15.48f

    .line 154
    .line 155
    .line 156
    const v26, 0x418ab852    # 17.34f

    .line 157
    .line 158
    .line 159
    const/high16 v21, 0x41800000    # 16.0f

    .line 160
    .line 161
    const v22, 0x418eb852    # 17.84f

    .line 162
    .line 163
    .line 164
    const v23, 0x417ccccd    # 15.8f

    .line 165
    .line 166
    .line 167
    const/high16 v24, 0x418c0000    # 17.5f

    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const/16 v16, 0x3800

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const v6, 0x3e99999a    # 0.3f

    .line 184
    .line 185
    .line 186
    const v8, 0x3e99999a    # 0.3f

    .line 187
    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    const/high16 v9, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/high16 v12, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    const/4 v15, 0x0

    .line 197
    const-string v4, ""

    .line 198
    .line 199
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 207
    .line 208
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 209
    .line 210
    .line 211
    move-result-wide v6

    .line 212
    const/4 v2, 0x0

    .line 213
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    const/high16 v4, 0x41100000    # 9.0f

    .line 230
    .line 231
    const/high16 v6, 0x41200000    # 10.0f

    .line 232
    .line 233
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/4 v4, 0x0

    .line 237
    const/high16 v6, -0x40000000    # -2.0f

    .line 238
    .line 239
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v26, 0x40800000    # 4.0f

    .line 243
    .line 244
    const/16 v27, 0x0

    .line 245
    .line 246
    const/high16 v21, 0x40000000    # 2.0f

    .line 247
    .line 248
    const/high16 v22, 0x40000000    # 2.0f

    .line 249
    .line 250
    const/16 v23, 0x0

    .line 251
    .line 252
    const/16 v24, 0x1

    .line 253
    .line 254
    const/16 v25, 0x1

    .line 255
    .line 256
    move-object/from16 v20, v2

    .line 257
    .line 258
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v26, -0x3f800000    # -4.0f

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const v6, 0x3e99999a    # 0.3f

    .line 271
    .line 272
    .line 273
    const/4 v7, 0x0

    .line 274
    const-string v4, ""

    .line 275
    .line 276
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 277
    .line 278
    .line 279
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 284
    .line 285
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    const/4 v2, 0x0

    .line 290
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 294
    .line 295
    .line 296
    move-result v10

    .line 297
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 304
    .line 305
    .line 306
    const/high16 v4, 0x41500000    # 13.0f

    .line 307
    .line 308
    const/high16 v6, 0x41200000    # 10.0f

    .line 309
    .line 310
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v25, 0x40800000    # 4.0f

    .line 314
    .line 315
    const v21, 0x400d70a4    # 2.21f

    .line 316
    .line 317
    .line 318
    const/16 v22, 0x0

    .line 319
    .line 320
    const/high16 v23, 0x40800000    # 4.0f

    .line 321
    .line 322
    const v24, -0x401ae148    # -1.79f

    .line 323
    .line 324
    .line 325
    move-object/from16 v20, v2

    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v25, -0x3f800000    # -4.0f

    .line 331
    .line 332
    const/16 v21, 0x0

    .line 333
    .line 334
    const v22, -0x3ff28f5c    # -2.21f

    .line 335
    .line 336
    .line 337
    const v23, -0x401ae148    # -1.79f

    .line 338
    .line 339
    .line 340
    const/high16 v24, -0x3f800000    # -4.0f

    .line 341
    .line 342
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, 0x40d947ae    # 6.79f

    .line 346
    .line 347
    .line 348
    const/high16 v6, 0x40c00000    # 6.0f

    .line 349
    .line 350
    const/high16 v7, 0x41100000    # 9.0f

    .line 351
    .line 352
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/high16 v25, 0x41200000    # 10.0f

    .line 356
    .line 357
    const/high16 v26, 0x41500000    # 13.0f

    .line 358
    .line 359
    const/high16 v21, 0x40c00000    # 6.0f

    .line 360
    .line 361
    const v22, 0x41335c29    # 11.21f

    .line 362
    .line 363
    .line 364
    const v23, 0x40f947ae    # 7.79f

    .line 365
    .line 366
    .line 367
    const/high16 v24, 0x41500000    # 13.0f

    .line 368
    .line 369
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x40e00000    # 7.0f

    .line 376
    .line 377
    const/high16 v6, 0x41200000    # 10.0f

    .line 378
    .line 379
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v25, 0x40000000    # 2.0f

    .line 383
    .line 384
    const/high16 v26, 0x40000000    # 2.0f

    .line 385
    .line 386
    const v21, 0x3f8ccccd    # 1.1f

    .line 387
    .line 388
    .line 389
    const/16 v22, 0x0

    .line 390
    .line 391
    const/high16 v23, 0x40000000    # 2.0f

    .line 392
    .line 393
    const v24, 0x3f666666    # 0.9f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v25, -0x40000000    # -2.0f

    .line 400
    .line 401
    const/16 v21, 0x0

    .line 402
    .line 403
    const v22, 0x3f8ccccd    # 1.1f

    .line 404
    .line 405
    .line 406
    const v23, -0x4099999a    # -0.9f

    .line 407
    .line 408
    .line 409
    const/high16 v24, 0x40000000    # 2.0f

    .line 410
    .line 411
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v4, -0x4099999a    # -0.9f

    .line 415
    .line 416
    .line 417
    const/high16 v6, -0x40000000    # -2.0f

    .line 418
    .line 419
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const/high16 v25, 0x41200000    # 10.0f

    .line 423
    .line 424
    const/high16 v26, 0x40e00000    # 7.0f

    .line 425
    .line 426
    const/high16 v21, 0x41000000    # 8.0f

    .line 427
    .line 428
    const v22, 0x40fccccd    # 7.9f

    .line 429
    .line 430
    .line 431
    const v23, 0x410e6666    # 8.9f

    .line 432
    .line 433
    .line 434
    const/high16 v24, 0x40e00000    # 7.0f

    .line 435
    .line 436
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    const/high16 v6, 0x3f800000    # 1.0f

    .line 447
    .line 448
    const/high16 v8, 0x3f800000    # 1.0f

    .line 449
    .line 450
    const/4 v7, 0x0

    .line 451
    const-string v4, ""

    .line 452
    .line 453
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 454
    .line 455
    .line 456
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 461
    .line 462
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 463
    .line 464
    .line 465
    move-result-wide v6

    .line 466
    const/4 v2, 0x0

    .line 467
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 471
    .line 472
    .line 473
    move-result v10

    .line 474
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 475
    .line 476
    .line 477
    move-result v11

    .line 478
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 481
    .line 482
    .line 483
    const v4, 0x41831eb8    # 16.39f

    .line 484
    .line 485
    .line 486
    const v6, 0x4178f5c3    # 15.56f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v26, 0x41600000    # 14.0f

    .line 493
    .line 494
    const v21, 0x416b5c29    # 14.71f

    .line 495
    .line 496
    .line 497
    const v22, 0x416b3333    # 14.7f

    .line 498
    .line 499
    .line 500
    const v23, 0x41487ae1    # 12.53f

    .line 501
    .line 502
    .line 503
    const/high16 v24, 0x41600000    # 14.0f

    .line 504
    .line 505
    move-object/from16 v20, v2

    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v25, -0x3f33851f    # -6.39f

    .line 511
    .line 512
    .line 513
    const v26, 0x3fc7ae14    # 1.56f

    .line 514
    .line 515
    .line 516
    const v21, -0x3fde147b    # -2.53f

    .line 517
    .line 518
    .line 519
    const/16 v22, 0x0

    .line 520
    .line 521
    const v23, -0x3f6947ae    # -4.71f

    .line 522
    .line 523
    .line 524
    const v24, 0x3f333333    # 0.7f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const/high16 v25, 0x40000000    # 2.0f

    .line 531
    .line 532
    const v26, 0x4191c28f    # 18.22f

    .line 533
    .line 534
    .line 535
    const v21, 0x40270a3d    # 2.61f

    .line 536
    .line 537
    .line 538
    const v22, 0x41808f5c    # 16.07f

    .line 539
    .line 540
    .line 541
    const/high16 v23, 0x40000000    # 2.0f

    .line 542
    .line 543
    const v24, 0x4188cccd    # 17.1f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v4, 0x41a80000    # 21.0f

    .line 550
    .line 551
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v4, 0x41800000    # 16.0f

    .line 555
    .line 556
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v4, -0x3fce147b    # -2.78f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v25, 0x41831eb8    # 16.39f

    .line 566
    .line 567
    .line 568
    const v26, 0x4178f5c3    # 15.56f

    .line 569
    .line 570
    .line 571
    const/high16 v21, 0x41900000    # 18.0f

    .line 572
    .line 573
    const v22, 0x4188cccd    # 17.1f

    .line 574
    .line 575
    .line 576
    const v23, 0x418b1eb8    # 17.39f

    .line 577
    .line 578
    .line 579
    const v24, 0x41808f5c    # 16.07f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v4, 0x41800000    # 16.0f

    .line 589
    .line 590
    const/high16 v6, 0x41980000    # 19.0f

    .line 591
    .line 592
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v4, 0x40800000    # 4.0f

    .line 596
    .line 597
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v4, -0x40b851ec    # -0.78f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v25, 0x3f051eb8    # 0.52f

    .line 607
    .line 608
    .line 609
    const v26, -0x409eb852    # -0.88f

    .line 610
    .line 611
    .line 612
    const/16 v21, 0x0

    .line 613
    .line 614
    const v22, -0x413d70a4    # -0.38f

    .line 615
    .line 616
    .line 617
    const v23, 0x3e4ccccd    # 0.2f

    .line 618
    .line 619
    .line 620
    const v24, -0x40c7ae14    # -0.72f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v25, 0x41200000    # 10.0f

    .line 627
    .line 628
    const/high16 v26, 0x41800000    # 16.0f

    .line 629
    .line 630
    const v21, 0x40b6b852    # 5.71f

    .line 631
    .line 632
    .line 633
    const v22, 0x4185d70a    # 16.73f

    .line 634
    .line 635
    .line 636
    const v23, 0x40f428f6    # 7.63f

    .line 637
    .line 638
    .line 639
    const/high16 v24, 0x41800000    # 16.0f

    .line 640
    .line 641
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v25, 0x40af5c29    # 5.48f

    .line 645
    .line 646
    .line 647
    const v26, 0x3fab851f    # 1.34f

    .line 648
    .line 649
    .line 650
    const v21, 0x4017ae14    # 2.37f

    .line 651
    .line 652
    .line 653
    const/16 v22, 0x0

    .line 654
    .line 655
    const v23, 0x408947ae    # 4.29f

    .line 656
    .line 657
    .line 658
    const v24, 0x3f3ae148    # 0.73f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v25, 0x41800000    # 16.0f

    .line 665
    .line 666
    const v26, 0x4191c28f    # 18.22f

    .line 667
    .line 668
    .line 669
    const v21, 0x417ccccd    # 15.8f

    .line 670
    .line 671
    .line 672
    const/high16 v22, 0x418c0000    # 17.5f

    .line 673
    .line 674
    const/high16 v23, 0x41800000    # 16.0f

    .line 675
    .line 676
    const v24, 0x418eb852    # 17.84f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const/high16 v4, 0x41980000    # 19.0f

    .line 683
    .line 684
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    const/high16 v6, 0x3f800000    # 1.0f

    .line 695
    .line 696
    const/4 v7, 0x0

    .line 697
    const-string v4, ""

    .line 698
    .line 699
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 700
    .line 701
    .line 702
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 703
    .line 704
    .line 705
    move-result v3

    .line 706
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 707
    .line 708
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 709
    .line 710
    .line 711
    move-result-wide v6

    .line 712
    const/4 v2, 0x0

    .line 713
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 717
    .line 718
    .line 719
    move-result v10

    .line 720
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 721
    .line 722
    .line 723
    move-result v11

    .line 724
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 727
    .line 728
    .line 729
    const v4, 0x41a2e148    # 20.36f

    .line 730
    .line 731
    .line 732
    const/high16 v6, 0x3f800000    # 1.0f

    .line 733
    .line 734
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v4, -0x404b851f    # -1.41f

    .line 738
    .line 739
    .line 740
    const v6, 0x3fb47ae1    # 1.41f

    .line 741
    .line 742
    .line 743
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/16 v25, 0x0

    .line 747
    .line 748
    const v26, 0x411e6666    # 9.9f

    .line 749
    .line 750
    .line 751
    const v21, 0x402eb852    # 2.73f

    .line 752
    .line 753
    .line 754
    const v22, 0x402eb852    # 2.73f

    .line 755
    .line 756
    .line 757
    const v23, 0x402eb852    # 2.73f

    .line 758
    .line 759
    .line 760
    const v24, 0x40e570a4    # 7.17f

    .line 761
    .line 762
    .line 763
    move-object/from16 v20, v2

    .line 764
    .line 765
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v4, 0x3fb47ae1    # 1.41f

    .line 769
    .line 770
    .line 771
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const v25, 0x41a2e148    # 20.36f

    .line 775
    .line 776
    .line 777
    const/high16 v26, 0x3f800000    # 1.0f

    .line 778
    .line 779
    const v21, 0x41bf0a3d    # 23.88f

    .line 780
    .line 781
    .line 782
    const v22, 0x41235c29    # 10.21f

    .line 783
    .line 784
    .line 785
    const v23, 0x41bf0a3d    # 23.88f

    .line 786
    .line 787
    .line 788
    const v24, 0x409051ec    # 4.51f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    const/high16 v6, 0x3f800000    # 1.0f

    .line 802
    .line 803
    const/4 v7, 0x0

    .line 804
    const-string v4, ""

    .line 805
    .line 806
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 807
    .line 808
    .line 809
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 814
    .line 815
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 816
    .line 817
    .line 818
    move-result-wide v6

    .line 819
    const/4 v0, 0x0

    .line 820
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 821
    .line 822
    .line 823
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 824
    .line 825
    .line 826
    move-result v10

    .line 827
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 828
    .line 829
    .line 830
    move-result v11

    .line 831
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 834
    .line 835
    .line 836
    const v0, 0x412e6666    # 10.9f

    .line 837
    .line 838
    .line 839
    const v2, 0x418c51ec    # 17.54f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/16 v17, 0x0

    .line 846
    .line 847
    const v18, -0x3f1dc28f    # -7.07f

    .line 848
    .line 849
    .line 850
    const v13, 0x3ff9999a    # 1.95f

    .line 851
    .line 852
    .line 853
    const v14, -0x40066666    # -1.95f

    .line 854
    .line 855
    .line 856
    const v15, 0x3ff9999a    # 1.95f

    .line 857
    .line 858
    .line 859
    const v16, -0x3f5c28f6    # -5.12f

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v0, -0x404b851f    # -1.41f

    .line 866
    .line 867
    .line 868
    const v2, 0x3fb47ae1    # 1.41f

    .line 869
    .line 870
    .line 871
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const v18, 0x4087ae14    # 4.24f

    .line 875
    .line 876
    .line 877
    const v13, 0x3f95c28f    # 1.17f

    .line 878
    .line 879
    .line 880
    const v14, 0x3f95c28f    # 1.17f

    .line 881
    .line 882
    .line 883
    const v15, 0x3f95c28f    # 1.17f

    .line 884
    .line 885
    .line 886
    const v16, 0x40447ae1    # 3.07f

    .line 887
    .line 888
    .line 889
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v0, 0x412e6666    # 10.9f

    .line 893
    .line 894
    .line 895
    const v2, 0x418c51ec    # 17.54f

    .line 896
    .line 897
    .line 898
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    const/16 v16, 0x3800

    .line 909
    .line 910
    const/16 v17, 0x0

    .line 911
    .line 912
    const/high16 v6, 0x3f800000    # 1.0f

    .line 913
    .line 914
    const/4 v7, 0x0

    .line 915
    const/high16 v12, 0x3f800000    # 1.0f

    .line 916
    .line 917
    const/4 v13, 0x0

    .line 918
    const/4 v14, 0x0

    .line 919
    const/4 v15, 0x0

    .line 920
    const-string v4, ""

    .line 921
    .line 922
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    sput-object v0, Landroidx/compose/material/icons/twotone/SpatialAudioOffKt;->_spatialAudioOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 931
    .line 932
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    return-object v0
.end method

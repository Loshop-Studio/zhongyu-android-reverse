.class public final Landroidx/compose/material/icons/rounded/LinkedCameraKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _linkedCamera:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLinkedCamera(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LinkedCameraKt;->_linkedCamera:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LinkedCamera"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40a00000    # 5.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40200000    # 2.5f

    .line 88
    .line 89
    const/high16 v22, 0x40200000    # 2.5f

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
    const/high16 v26, -0x3f600000    # -5.0f

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
    const v4, 0x4184cccd    # 16.6f

    .line 160
    .line 161
    .line 162
    const v6, 0x4017ae14    # 2.37f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v25, 0x4080f5c3    # 4.03f

    .line 169
    .line 170
    .line 171
    const v26, 0x4080f5c3    # 4.03f

    .line 172
    .line 173
    .line 174
    const v21, 0x40066666    # 2.1f

    .line 175
    .line 176
    .line 177
    const v22, 0x3e8a3d71    # 0.27f

    .line 178
    .line 179
    .line 180
    const v23, 0x407147ae    # 3.77f

    .line 181
    .line 182
    .line 183
    const v24, 0x3ff70a3d    # 1.93f

    .line 184
    .line 185
    .line 186
    move-object/from16 v20, v2

    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v25, 0x41aa51ec    # 21.29f

    .line 192
    .line 193
    .line 194
    const/high16 v26, 0x40e00000    # 7.0f

    .line 195
    .line 196
    const v21, 0x41a55c29    # 20.67f

    .line 197
    .line 198
    .line 199
    const v22, 0x40d7ae14    # 6.74f

    .line 200
    .line 201
    .line 202
    const v23, 0x41a7999a    # 20.95f

    .line 203
    .line 204
    .line 205
    const/high16 v24, 0x40e00000    # 7.0f

    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/4 v4, 0x0

    .line 211
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v25, 0x3f28f5c3    # 0.66f

    .line 215
    .line 216
    .line 217
    const v26, -0x40c51eb8    # -0.73f

    .line 218
    .line 219
    .line 220
    const v21, 0x3ec7ae14    # 0.39f

    .line 221
    .line 222
    .line 223
    const/16 v22, 0x0

    .line 224
    .line 225
    const v23, 0x3f35c28f    # 0.71f

    .line 226
    .line 227
    .line 228
    const v24, -0x4151eb85    # -0.34f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, -0x3f58f5c3    # -5.22f

    .line 235
    .line 236
    .line 237
    const v26, -0x3f58f5c3    # -5.22f

    .line 238
    .line 239
    .line 240
    const v21, -0x41570a3d    # -0.33f

    .line 241
    .line 242
    .line 243
    const v22, -0x3fd1eb85    # -2.72f

    .line 244
    .line 245
    .line 246
    const/high16 v23, -0x3fe00000    # -2.5f

    .line 247
    .line 248
    const v24, -0x3f63851f    # -4.89f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v25, 0x41800000    # 16.0f

    .line 255
    .line 256
    const v26, 0x3fdae148    # 1.71f

    .line 257
    .line 258
    .line 259
    const v21, 0x4182b852    # 16.34f

    .line 260
    .line 261
    .line 262
    const/high16 v22, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const/high16 v23, 0x41800000    # 16.0f

    .line 265
    .line 266
    const v24, 0x3fa8f5c3    # 1.32f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, 0x4184cccd    # 16.6f

    .line 276
    .line 277
    .line 278
    const v26, 0x4017ae14    # 2.37f

    .line 279
    .line 280
    .line 281
    const/high16 v21, 0x41800000    # 16.0f

    .line 282
    .line 283
    const v22, 0x40033333    # 2.05f

    .line 284
    .line 285
    .line 286
    const v23, 0x4182147b    # 16.26f

    .line 287
    .line 288
    .line 289
    const v24, 0x40151eb8    # 2.33f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    const/high16 v6, 0x3f800000    # 1.0f

    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    const-string v4, ""

    .line 306
    .line 307
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 308
    .line 309
    .line 310
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 315
    .line 316
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 317
    .line 318
    .line 319
    move-result-wide v6

    .line 320
    const/4 v2, 0x0

    .line 321
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 325
    .line 326
    .line 327
    move-result v10

    .line 328
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 329
    .line 330
    .line 331
    move-result v11

    .line 332
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    const v4, 0x4199d70a    # 19.23f

    .line 338
    .line 339
    .line 340
    const v6, 0x40c6147b    # 6.19f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v25, 0x41867ae1    # 16.81f

    .line 347
    .line 348
    .line 349
    const v26, 0x407147ae    # 3.77f

    .line 350
    .line 351
    .line 352
    const v21, 0x419770a4    # 18.93f

    .line 353
    .line 354
    .line 355
    const/high16 v22, 0x40a00000    # 5.0f

    .line 356
    .line 357
    const/high16 v23, 0x41900000    # 18.0f

    .line 358
    .line 359
    const v24, 0x40823d71    # 4.07f

    .line 360
    .line 361
    .line 362
    move-object/from16 v20, v2

    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v25, 0x41800000    # 16.0f

    .line 368
    .line 369
    const v26, 0x408d70a4    # 4.42f

    .line 370
    .line 371
    .line 372
    const v21, 0x41833333    # 16.4f

    .line 373
    .line 374
    .line 375
    const v22, 0x406ae148    # 3.67f

    .line 376
    .line 377
    .line 378
    const/high16 v23, 0x41800000    # 16.0f

    .line 379
    .line 380
    const v24, 0x407f5c29    # 3.99f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/4 v4, 0x0

    .line 387
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v25, 0x3ef5c28f    # 0.48f

    .line 391
    .line 392
    .line 393
    const v26, 0x3f23d70a    # 0.64f

    .line 394
    .line 395
    .line 396
    const/16 v21, 0x0

    .line 397
    .line 398
    const v22, 0x3e947ae1    # 0.29f

    .line 399
    .line 400
    .line 401
    const v23, 0x3e428f5c    # 0.19f

    .line 402
    .line 403
    .line 404
    const v24, 0x3f11eb85    # 0.57f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v25, 0x3fbae148    # 1.46f

    .line 411
    .line 412
    .line 413
    const v26, 0x3fbae148    # 1.46f

    .line 414
    .line 415
    .line 416
    const v21, 0x3f3851ec    # 0.72f

    .line 417
    .line 418
    .line 419
    const v22, 0x3e3851ec    # 0.18f

    .line 420
    .line 421
    .line 422
    const v23, 0x3fa51eb8    # 1.29f

    .line 423
    .line 424
    .line 425
    const v24, 0x3f3d70a4    # 0.74f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v25, 0x4194a3d7    # 18.58f

    .line 432
    .line 433
    .line 434
    const/high16 v26, 0x40e00000    # 7.0f

    .line 435
    .line 436
    const v21, 0x4190147b    # 18.01f

    .line 437
    .line 438
    .line 439
    const v22, 0x40d9eb85    # 6.81f

    .line 440
    .line 441
    .line 442
    const v23, 0x41923d71    # 18.28f

    .line 443
    .line 444
    .line 445
    const/high16 v24, 0x40e00000    # 7.0f

    .line 446
    .line 447
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v25, 0x4199d70a    # 19.23f

    .line 454
    .line 455
    .line 456
    const v26, 0x40c6147b    # 6.19f

    .line 457
    .line 458
    .line 459
    const v21, 0x4198147b    # 19.01f

    .line 460
    .line 461
    .line 462
    const/high16 v22, 0x40e00000    # 7.0f

    .line 463
    .line 464
    const v23, 0x419aa3d7    # 19.33f

    .line 465
    .line 466
    .line 467
    const v24, 0x40d33333    # 6.6f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    const/high16 v6, 0x3f800000    # 1.0f

    .line 481
    .line 482
    const/4 v7, 0x0

    .line 483
    const-string v4, ""

    .line 484
    .line 485
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 486
    .line 487
    .line 488
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 493
    .line 494
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 495
    .line 496
    .line 497
    move-result-wide v6

    .line 498
    const/4 v0, 0x0

    .line 499
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 503
    .line 504
    .line 505
    move-result v10

    .line 506
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 507
    .line 508
    .line 509
    move-result v11

    .line 510
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 513
    .line 514
    .line 515
    const/high16 v0, 0x41000000    # 8.0f

    .line 516
    .line 517
    const/high16 v2, 0x41880000    # 17.0f

    .line 518
    .line 519
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const/high16 v17, -0x40000000    # -2.0f

    .line 523
    .line 524
    const/high16 v18, -0x40000000    # -2.0f

    .line 525
    .line 526
    const v14, -0x40733333    # -1.1f

    .line 527
    .line 528
    .line 529
    const v15, -0x4099999a    # -0.9f

    .line 530
    .line 531
    .line 532
    const/high16 v16, -0x40000000    # -2.0f

    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v0, 0x40800000    # 4.0f

    .line 538
    .line 539
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v17, -0x40800000    # -1.0f

    .line 543
    .line 544
    const/high16 v18, -0x40800000    # -1.0f

    .line 545
    .line 546
    const v14, -0x40f33333    # -0.55f

    .line 547
    .line 548
    .line 549
    const v15, -0x4119999a    # -0.45f

    .line 550
    .line 551
    .line 552
    const/high16 v16, -0x40800000    # -1.0f

    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v0, 0x411e147b    # 9.88f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, 0x41066666    # 8.4f

    .line 564
    .line 565
    .line 566
    const v18, 0x4069999a    # 3.65f

    .line 567
    .line 568
    .line 569
    const v13, 0x41151eb8    # 9.32f

    .line 570
    .line 571
    .line 572
    const/high16 v14, 0x40400000    # 3.0f

    .line 573
    .line 574
    const v15, 0x410c7ae1    # 8.78f

    .line 575
    .line 576
    .line 577
    const v16, 0x404f5c29    # 3.24f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v0, 0x40e570a4    # 7.17f

    .line 584
    .line 585
    .line 586
    const/high16 v2, 0x40a00000    # 5.0f

    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v0, 0x40800000    # 4.0f

    .line 592
    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v17, 0x40000000    # 2.0f

    .line 597
    .line 598
    const/high16 v18, 0x40e00000    # 7.0f

    .line 599
    .line 600
    const v13, 0x4039999a    # 2.9f

    .line 601
    .line 602
    .line 603
    const/high16 v14, 0x40a00000    # 5.0f

    .line 604
    .line 605
    const/high16 v15, 0x40000000    # 2.0f

    .line 606
    .line 607
    const v16, 0x40bccccd    # 5.9f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v0, 0x41400000    # 12.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v18, 0x40000000    # 2.0f

    .line 619
    .line 620
    const/4 v13, 0x0

    .line 621
    const v14, 0x3f8ccccd    # 1.1f

    .line 622
    .line 623
    .line 624
    const v15, 0x3f666666    # 0.9f

    .line 625
    .line 626
    .line 627
    const/high16 v16, 0x40000000    # 2.0f

    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v0, 0x41800000    # 16.0f

    .line 633
    .line 634
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    const/high16 v18, -0x40000000    # -2.0f

    .line 638
    .line 639
    const v13, 0x3f8ccccd    # 1.1f

    .line 640
    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    const/high16 v15, 0x40000000    # 2.0f

    .line 644
    .line 645
    const v16, -0x4099999a    # -0.9f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 652
    .line 653
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, -0x40000000    # -2.0f

    .line 657
    .line 658
    const/4 v13, 0x0

    .line 659
    const v14, -0x40733333    # -1.1f

    .line 660
    .line 661
    .line 662
    const v15, -0x4099999a    # -0.9f

    .line 663
    .line 664
    .line 665
    const/high16 v16, -0x40000000    # -2.0f

    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v0, 0x41880000    # 17.0f

    .line 671
    .line 672
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v0, 0x418c0000    # 17.5f

    .line 679
    .line 680
    const/high16 v2, 0x41400000    # 12.0f

    .line 681
    .line 682
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v17, -0x3f700000    # -4.5f

    .line 686
    .line 687
    const/high16 v18, -0x3f700000    # -4.5f

    .line 688
    .line 689
    const v13, -0x3fe147ae    # -2.48f

    .line 690
    .line 691
    .line 692
    const/4 v14, 0x0

    .line 693
    const/high16 v15, -0x3f700000    # -4.5f

    .line 694
    .line 695
    const v16, -0x3ffeb852    # -2.02f

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, 0x411851ec    # 9.52f

    .line 702
    .line 703
    .line 704
    const/high16 v2, 0x41080000    # 8.5f

    .line 705
    .line 706
    const/high16 v4, 0x41400000    # 12.0f

    .line 707
    .line 708
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v0, 0x400147ae    # 2.02f

    .line 712
    .line 713
    .line 714
    const/high16 v2, 0x40900000    # 4.5f

    .line 715
    .line 716
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const v0, 0x4167ae14    # 14.48f

    .line 720
    .line 721
    .line 722
    const/high16 v2, 0x418c0000    # 17.5f

    .line 723
    .line 724
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    const/16 v16, 0x3800

    .line 735
    .line 736
    const/16 v17, 0x0

    .line 737
    .line 738
    const/high16 v6, 0x3f800000    # 1.0f

    .line 739
    .line 740
    const/4 v7, 0x0

    .line 741
    const/high16 v12, 0x3f800000    # 1.0f

    .line 742
    .line 743
    const/4 v13, 0x0

    .line 744
    const/4 v15, 0x0

    .line 745
    const-string v4, ""

    .line 746
    .line 747
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    sput-object v0, Landroidx/compose/material/icons/rounded/LinkedCameraKt;->_linkedCamera:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 756
    .line 757
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    return-object v0
.end method

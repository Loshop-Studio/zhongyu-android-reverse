.class public final Landroidx/compose/material/icons/sharp/WifiLockKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiLock:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiLock(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/WifiLockKt;->_wifiLock:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.WifiLock"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const v6, 0x41afd70a    # 21.98f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x410fae14    # 8.98f

    .line 79
    .line 80
    .line 81
    const/high16 v6, 0x41c00000    # 24.0f

    .line 82
    .line 83
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v25, 0x41400000    # 12.0f

    .line 87
    .line 88
    const/high16 v26, 0x40800000    # 4.0f

    .line 89
    .line 90
    const v21, 0x41a770a4    # 20.93f

    .line 91
    .line 92
    .line 93
    const v22, 0x40bccccd    # 5.9f

    .line 94
    .line 95
    .line 96
    const v23, 0x4185851f    # 16.69f

    .line 97
    .line 98
    .line 99
    const/high16 v24, 0x40800000    # 4.0f

    .line 100
    .line 101
    move-object/from16 v20, v2

    .line 102
    .line 103
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/16 v25, 0x0

    .line 107
    .line 108
    const v26, 0x410fae14    # 8.98f

    .line 109
    .line 110
    .line 111
    const v21, 0x40e9eb85    # 7.31f

    .line 112
    .line 113
    .line 114
    const/high16 v22, 0x40800000    # 4.0f

    .line 115
    .line 116
    const v23, 0x40447ae1    # 3.07f

    .line 117
    .line 118
    .line 119
    const v24, 0x40bccccd    # 5.9f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, 0x40cb3333    # 6.35f

    .line 126
    .line 127
    .line 128
    const v6, 0x40cb851f    # 6.36f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x41400000    # 12.0f

    .line 135
    .line 136
    const/high16 v6, 0x41a80000    # 21.0f

    .line 137
    .line 138
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x40433333    # 3.05f

    .line 142
    .line 143
    .line 144
    const v6, -0x3fbccccd    # -3.05f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41700000    # 15.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v25, 0x3e6b851f    # 0.23f

    .line 156
    .line 157
    .line 158
    const v26, -0x405ae148    # -1.29f

    .line 159
    .line 160
    .line 161
    const/16 v21, 0x0

    .line 162
    .line 163
    const v22, -0x4119999a    # -0.45f

    .line 164
    .line 165
    .line 166
    const v23, 0x3db851ec    # 0.09f

    .line 167
    .line 168
    .line 169
    const v24, -0x409eb852    # -0.88f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v25, 0x407147ae    # 3.77f

    .line 176
    .line 177
    .line 178
    const v26, -0x3fd28f5c    # -2.71f

    .line 179
    .line 180
    .line 181
    const v21, 0x3f0a3d71    # 0.54f

    .line 182
    .line 183
    .line 184
    const v22, -0x40370a3d    # -1.57f

    .line 185
    .line 186
    .line 187
    const v23, 0x4000a3d7    # 2.01f

    .line 188
    .line 189
    .line 190
    const v24, -0x3fd28f5c    # -2.71f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v4, 0x41afd70a    # 21.98f

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    const/16 v16, 0x3800

    .line 210
    .line 211
    const/16 v17, 0x0

    .line 212
    .line 213
    const/high16 v6, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/high16 v8, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const/4 v7, 0x0

    .line 218
    const/high16 v9, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/high16 v12, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/4 v13, 0x0

    .line 223
    const/4 v14, 0x0

    .line 224
    const/4 v15, 0x0

    .line 225
    const-string v4, ""

    .line 226
    .line 227
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 228
    .line 229
    .line 230
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 235
    .line 236
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 237
    .line 238
    .line 239
    move-result-wide v6

    .line 240
    const/4 v0, 0x0

    .line 241
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const/high16 v0, 0x41b00000    # 22.0f

    .line 258
    .line 259
    const v2, 0x4171c28f    # 15.11f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, -0x402b851f    # -1.66f

    .line 266
    .line 267
    .line 268
    const v18, -0x3ffae148    # -2.08f

    .line 269
    .line 270
    .line 271
    const/high16 v14, -0x40800000    # -1.0f

    .line 272
    .line 273
    const v15, -0x40d1eb85    # -0.68f

    .line 274
    .line 275
    .line 276
    const v16, -0x400a3d71    # -1.92f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, -0x4147ae14    # -0.36f

    .line 283
    .line 284
    .line 285
    const v18, -0x435c28f6    # -0.02f

    .line 286
    .line 287
    .line 288
    const v13, -0x420a3d71    # -0.12f

    .line 289
    .line 290
    .line 291
    const v14, -0x435c28f6    # -0.02f

    .line 292
    .line 293
    .line 294
    const v15, -0x418a3d71    # -0.24f

    .line 295
    .line 296
    .line 297
    const v16, -0x435c28f6    # -0.02f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/4 v0, 0x0

    .line 304
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, -0x43dc28f6    # -0.01f

    .line 308
    .line 309
    .line 310
    const/16 v18, 0x0

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const/4 v14, 0x0

    .line 314
    const v15, -0x43dc28f6    # -0.01f

    .line 315
    .line 316
    .line 317
    const/16 v16, 0x0

    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v17, 0x41900000    # 18.0f

    .line 323
    .line 324
    const/high16 v18, 0x41700000    # 15.0f

    .line 325
    .line 326
    const v13, 0x41970a3d    # 18.88f

    .line 327
    .line 328
    .line 329
    const v14, 0x41507ae1    # 13.03f

    .line 330
    .line 331
    .line 332
    const/high16 v15, 0x41900000    # 18.0f

    .line 333
    .line 334
    const v16, 0x415e8f5c    # 13.91f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x3f800000    # 1.0f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, -0x40800000    # -1.0f

    .line 346
    .line 347
    const/16 v18, 0x0

    .line 348
    .line 349
    const v13, -0x40f33333    # -0.55f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const/high16 v15, -0x40800000    # -1.0f

    .line 354
    .line 355
    const/16 v16, 0x0

    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x40a00000    # 5.0f

    .line 361
    .line 362
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x40c00000    # 6.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v0, -0x3f600000    # -5.0f

    .line 371
    .line 372
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const v15, -0x4119999a    # -0.45f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x4171c28f    # 15.11f

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v0, 0x41800000    # 16.0f

    .line 392
    .line 393
    const/high16 v2, 0x41a80000    # 21.0f

    .line 394
    .line 395
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const/high16 v0, -0x40000000    # -2.0f

    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v0, -0x40800000    # -1.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v17, 0x3f800000    # 1.0f

    .line 409
    .line 410
    const/high16 v18, -0x40800000    # -1.0f

    .line 411
    .line 412
    const v14, -0x40f33333    # -0.55f

    .line 413
    .line 414
    .line 415
    const v15, 0x3ee66666    # 0.45f

    .line 416
    .line 417
    .line 418
    const/high16 v16, -0x40800000    # -1.0f

    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, 0x3ee66666    # 0.45f

    .line 424
    .line 425
    .line 426
    const/high16 v2, 0x3f800000    # 1.0f

    .line 427
    .line 428
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v0, 0x41800000    # 16.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    const/16 v16, 0x3800

    .line 444
    .line 445
    const/16 v17, 0x0

    .line 446
    .line 447
    const/high16 v6, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const/4 v7, 0x0

    .line 450
    const/high16 v12, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/4 v14, 0x0

    .line 453
    const/4 v15, 0x0

    .line 454
    const-string v4, ""

    .line 455
    .line 456
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    sput-object v0, Landroidx/compose/material/icons/sharp/WifiLockKt;->_wifiLock:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 465
    .line 466
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/WatchOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _watchOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWatchOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WatchOffKt;->_watchOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WatchOff"

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
    const v4, 0x415e3d71    # 13.89f

    .line 71
    .line 72
    .line 73
    const v6, 0x40a8a3d7    # 5.27f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v4, 0x40800000    # 4.0f

    .line 80
    .line 81
    const v6, 0x415828f6    # 13.51f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, -0x3fbeb852    # -3.02f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v4, 0x3fa28f5c    # 1.27f

    .line 94
    .line 95
    .line 96
    const v6, -0x413d70a4    # -0.38f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, 0x415e3d71    # 13.89f

    .line 103
    .line 104
    .line 105
    const v26, 0x40a8a3d7    # 5.27f

    .line 106
    .line 107
    .line 108
    const v21, 0x413ee148    # 11.93f

    .line 109
    .line 110
    .line 111
    const v22, 0x409851ec    # 4.76f

    .line 112
    .line 113
    .line 114
    const v23, 0x415570a4    # 13.34f

    .line 115
    .line 116
    .line 117
    const v24, 0x40a3851f    # 5.11f

    .line 118
    .line 119
    .line 120
    move-object/from16 v20, v2

    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const/16 v16, 0x3800

    .line 133
    .line 134
    const/16 v17, 0x0

    .line 135
    .line 136
    const v6, 0x3e99999a    # 0.3f

    .line 137
    .line 138
    .line 139
    const v8, 0x3e99999a    # 0.3f

    .line 140
    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    const/high16 v9, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const/high16 v12, 0x3f800000    # 1.0f

    .line 146
    .line 147
    const/4 v13, 0x0

    .line 148
    const/4 v14, 0x0

    .line 149
    const/4 v15, 0x0

    .line 150
    const-string v4, ""

    .line 151
    .line 152
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 153
    .line 154
    .line 155
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 160
    .line 161
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 162
    .line 163
    .line 164
    move-result-wide v6

    .line 165
    const/4 v2, 0x0

    .line 166
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const v4, 0x4121c28f    # 10.11f

    .line 183
    .line 184
    .line 185
    const v6, 0x4195d70a    # 18.73f

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x41a00000    # 20.0f

    .line 192
    .line 193
    const v6, 0x4127d70a    # 10.49f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, 0x404147ae    # 3.02f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v4, -0x405d70a4    # -1.27f

    .line 206
    .line 207
    .line 208
    const v6, 0x3ec28f5c    # 0.38f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v25, 0x4121c28f    # 10.11f

    .line 215
    .line 216
    .line 217
    const v26, 0x4195d70a    # 18.73f

    .line 218
    .line 219
    .line 220
    const v21, 0x41411eb8    # 12.07f

    .line 221
    .line 222
    .line 223
    const v22, 0x4199eb85    # 19.24f

    .line 224
    .line 225
    .line 226
    const v23, 0x412a8f5c    # 10.66f

    .line 227
    .line 228
    .line 229
    const v24, 0x41971eb8    # 18.89f

    .line 230
    .line 231
    .line 232
    move-object/from16 v20, v2

    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    const v6, 0x3e99999a    # 0.3f

    .line 245
    .line 246
    .line 247
    const/4 v7, 0x0

    .line 248
    const-string v4, ""

    .line 249
    .line 250
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 251
    .line 252
    .line 253
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 258
    .line 259
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 260
    .line 261
    .line 262
    move-result-wide v6

    .line 263
    const/4 v2, 0x0

    .line 264
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 272
    .line 273
    .line 274
    move-result v11

    .line 275
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 278
    .line 279
    .line 280
    const/high16 v4, 0x40e00000    # 7.0f

    .line 281
    .line 282
    const/high16 v6, 0x41400000    # 12.0f

    .line 283
    .line 284
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v25, 0x40a00000    # 5.0f

    .line 288
    .line 289
    const/high16 v26, 0x40a00000    # 5.0f

    .line 290
    .line 291
    const v21, 0x4030a3d7    # 2.76f

    .line 292
    .line 293
    .line 294
    const/16 v22, 0x0

    .line 295
    .line 296
    const/high16 v23, 0x40a00000    # 5.0f

    .line 297
    .line 298
    const v24, 0x400f5c29    # 2.24f

    .line 299
    .line 300
    .line 301
    move-object/from16 v20, v2

    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v25, -0x414ccccd    # -0.35f

    .line 307
    .line 308
    .line 309
    const v26, 0x3fe8f5c3    # 1.82f

    .line 310
    .line 311
    .line 312
    const/16 v21, 0x0

    .line 313
    .line 314
    const v22, 0x3f23d70a    # 0.64f

    .line 315
    .line 316
    .line 317
    const v23, -0x41fae148    # -0.13f

    .line 318
    .line 319
    .line 320
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 321
    .line 322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 326
    .line 327
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v25, 0x41980000    # 19.0f

    .line 331
    .line 332
    const/high16 v26, 0x41400000    # 12.0f

    .line 333
    .line 334
    const v21, 0x4195851f    # 18.69f

    .line 335
    .line 336
    .line 337
    const v22, 0x416547ae    # 14.33f

    .line 338
    .line 339
    .line 340
    const/high16 v23, 0x41980000    # 19.0f

    .line 341
    .line 342
    const v24, 0x41533333    # 13.2f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v25, -0x3fd70a3d    # -2.64f

    .line 349
    .line 350
    .line 351
    const v26, -0x3f50f5c3    # -5.47f

    .line 352
    .line 353
    .line 354
    const/16 v21, 0x0

    .line 355
    .line 356
    const v22, -0x3ff1eb85    # -2.22f

    .line 357
    .line 358
    .line 359
    const v23, -0x407c28f6    # -1.03f

    .line 360
    .line 361
    .line 362
    const v24, -0x3f79eb85    # -4.19f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/high16 v4, 0x41700000    # 15.0f

    .line 369
    .line 370
    const/high16 v6, 0x40000000    # 2.0f

    .line 371
    .line 372
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x41100000    # 9.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v4, 0x4100a3d7    # 8.04f

    .line 381
    .line 382
    .line 383
    const v6, 0x40a6b852    # 5.21f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v4, 0x4008f5c3    # 2.14f

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v25, 0x41400000    # 12.0f

    .line 396
    .line 397
    const/high16 v26, 0x40e00000    # 7.0f

    .line 398
    .line 399
    const/high16 v21, 0x412c0000    # 10.75f

    .line 400
    .line 401
    const v22, 0x40e428f6    # 7.13f

    .line 402
    .line 403
    .line 404
    const v23, 0x4135c28f    # 11.36f

    .line 405
    .line 406
    .line 407
    const/high16 v24, 0x40e00000    # 7.0f

    .line 408
    .line 409
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v4, 0x4127d70a    # 10.49f

    .line 416
    .line 417
    .line 418
    const/high16 v6, 0x40800000    # 4.0f

    .line 419
    .line 420
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v4, 0x404147ae    # 3.02f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v4, 0x3ec28f5c    # 0.38f

    .line 430
    .line 431
    .line 432
    const v6, 0x3fa28f5c    # 1.27f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v25, -0x3f8e147b    # -3.78f

    .line 439
    .line 440
    .line 441
    const/16 v26, 0x0

    .line 442
    .line 443
    const v21, -0x40f33333    # -0.55f

    .line 444
    .line 445
    .line 446
    const v22, -0x41dc28f6    # -0.16f

    .line 447
    .line 448
    .line 449
    const v23, -0x4003d70a    # -1.97f

    .line 450
    .line 451
    .line 452
    const v24, -0x40fd70a4    # -0.51f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v4, 0x4127d70a    # 10.49f

    .line 459
    .line 460
    .line 461
    const/high16 v6, 0x40800000    # 4.0f

    .line 462
    .line 463
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    const/high16 v6, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const/high16 v8, 0x3f800000    # 1.0f

    .line 476
    .line 477
    const/4 v7, 0x0

    .line 478
    const-string v4, ""

    .line 479
    .line 480
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 481
    .line 482
    .line 483
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 488
    .line 489
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 490
    .line 491
    .line 492
    move-result-wide v6

    .line 493
    const/4 v0, 0x0

    .line 494
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 498
    .line 499
    .line 500
    move-result v10

    .line 501
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 502
    .line 503
    .line 504
    move-result v11

    .line 505
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 508
    .line 509
    .line 510
    const v0, 0x4033d70a    # 2.81f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, 0x3fb1eb85    # 1.39f

    .line 517
    .line 518
    .line 519
    const v2, 0x40870a3d    # 4.22f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x408eb852    # 4.46f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v17, 0x40a00000    # 5.0f

    .line 532
    .line 533
    const/high16 v18, 0x41400000    # 12.0f

    .line 534
    .line 535
    const v13, 0x40a9eb85    # 5.31f

    .line 536
    .line 537
    .line 538
    const v14, 0x411ab852    # 9.67f

    .line 539
    .line 540
    .line 541
    const/high16 v15, 0x40a00000    # 5.0f

    .line 542
    .line 543
    const v16, 0x412ccccd    # 10.8f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x4028f5c3    # 2.64f

    .line 550
    .line 551
    .line 552
    const v18, 0x40af0a3d    # 5.47f

    .line 553
    .line 554
    .line 555
    const/4 v13, 0x0

    .line 556
    const v14, 0x400e147b    # 2.22f

    .line 557
    .line 558
    .line 559
    const v15, 0x3f83d70a    # 1.03f

    .line 560
    .line 561
    .line 562
    const v16, 0x4086147b    # 4.19f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v0, 0x41b00000    # 22.0f

    .line 569
    .line 570
    const/high16 v2, 0x41100000    # 9.0f

    .line 571
    .line 572
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v0, 0x40c00000    # 6.0f

    .line 576
    .line 577
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x3f75c28f    # 0.96f

    .line 581
    .line 582
    .line 583
    const v2, -0x3fb28f5c    # -3.21f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x40747ae1    # 3.82f

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, 0x3fb47ae1    # 1.41f

    .line 596
    .line 597
    .line 598
    const v2, -0x404b851f    # -1.41f

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, 0x4033d70a    # 2.81f

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v0, 0x41a00000    # 20.0f

    .line 614
    .line 615
    const v2, 0x415828f6    # 13.51f

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, -0x3fbeb852    # -3.02f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, -0x405d70a4    # -1.27f

    .line 628
    .line 629
    .line 630
    const v2, -0x413d70a4    # -0.38f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v17, 0x4071eb85    # 3.78f

    .line 637
    .line 638
    .line 639
    const/16 v18, 0x0

    .line 640
    .line 641
    const v13, 0x3f0ccccd    # 0.55f

    .line 642
    .line 643
    .line 644
    const v14, 0x3e19999a    # 0.15f

    .line 645
    .line 646
    .line 647
    const v15, 0x3ffc28f6    # 1.97f

    .line 648
    .line 649
    .line 650
    const v16, 0x3f028f5c    # 0.51f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v0, 0x41a00000    # 20.0f

    .line 657
    .line 658
    const v2, 0x415828f6    # 13.51f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v0, 0x41880000    # 17.0f

    .line 668
    .line 669
    const/high16 v2, 0x41400000    # 12.0f

    .line 670
    .line 671
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v17, -0x3f600000    # -5.0f

    .line 675
    .line 676
    const/high16 v18, -0x3f600000    # -5.0f

    .line 677
    .line 678
    const v13, -0x3fcf5c29    # -2.76f

    .line 679
    .line 680
    .line 681
    const/4 v14, 0x0

    .line 682
    const/high16 v15, -0x3f600000    # -5.0f

    .line 683
    .line 684
    const v16, -0x3ff0a3d7    # -2.24f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v17, 0x3eb33333    # 0.35f

    .line 691
    .line 692
    .line 693
    const v18, -0x40170a3d    # -1.82f

    .line 694
    .line 695
    .line 696
    const/4 v13, 0x0

    .line 697
    const v14, -0x40dc28f6    # -0.64f

    .line 698
    .line 699
    .line 700
    const v15, 0x3e051eb8    # 0.13f

    .line 701
    .line 702
    .line 703
    const/high16 v16, -0x40600000    # -1.25f

    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v0, 0x40cf0a3d    # 6.47f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const/high16 v17, 0x41400000    # 12.0f

    .line 715
    .line 716
    const/high16 v18, 0x41880000    # 17.0f

    .line 717
    .line 718
    const/high16 v13, 0x41540000    # 13.25f

    .line 719
    .line 720
    const v14, 0x4186f5c3    # 16.87f

    .line 721
    .line 722
    .line 723
    const v15, 0x414a3d71    # 12.64f

    .line 724
    .line 725
    .line 726
    const/high16 v16, 0x41880000    # 17.0f

    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    const/16 v16, 0x3800

    .line 739
    .line 740
    const/16 v17, 0x0

    .line 741
    .line 742
    const/high16 v6, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const/4 v7, 0x0

    .line 745
    const/high16 v12, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/4 v13, 0x0

    .line 748
    const/4 v14, 0x0

    .line 749
    const/4 v15, 0x0

    .line 750
    const-string v4, ""

    .line 751
    .line 752
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    sput-object v0, Landroidx/compose/material/icons/twotone/WatchOffKt;->_watchOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 761
    .line 762
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    return-object v0
.end method

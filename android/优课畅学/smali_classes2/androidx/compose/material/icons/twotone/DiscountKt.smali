.class public final Landroidx/compose/material/icons/twotone/DiscountKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _discount:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDiscount(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DiscountKt;->_discount:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Discount"

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
    const v4, 0x411ca3d7    # 9.79f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41980000    # 19.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x41335c29    # 11.21f

    .line 79
    .line 80
    .line 81
    const/high16 v6, 0x40000000    # 2.0f

    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const/high16 v4, 0x40a00000    # 5.0f

    .line 87
    .line 88
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const v4, 0x40c6b852    # 6.21f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v4, 0x41800000    # 16.0f

    .line 98
    .line 99
    const v6, 0x414ca3d7    # 12.79f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, 0x411ca3d7    # 9.79f

    .line 106
    .line 107
    .line 108
    const/high16 v6, 0x41980000    # 19.0f

    .line 109
    .line 110
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x40b00000    # 5.5f

    .line 117
    .line 118
    const/high16 v6, 0x40e80000    # 7.25f

    .line 119
    .line 120
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v25, 0x40c00000    # 6.0f

    .line 124
    .line 125
    const/high16 v26, 0x40880000    # 4.25f

    .line 126
    .line 127
    const v21, 0x40d1eb85    # 6.56f

    .line 128
    .line 129
    .line 130
    const/high16 v22, 0x40b00000    # 5.5f

    .line 131
    .line 132
    const/high16 v23, 0x40c00000    # 6.0f

    .line 133
    .line 134
    const v24, 0x409e147b    # 4.94f

    .line 135
    .line 136
    .line 137
    move-object/from16 v20, v2

    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, 0x40d1eb85    # 6.56f

    .line 143
    .line 144
    .line 145
    const/high16 v6, 0x40400000    # 3.0f

    .line 146
    .line 147
    const/high16 v7, 0x40e80000    # 7.25f

    .line 148
    .line 149
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x4063d70a    # 3.56f

    .line 153
    .line 154
    .line 155
    const/high16 v6, 0x40880000    # 4.25f

    .line 156
    .line 157
    const/high16 v7, 0x41080000    # 8.5f

    .line 158
    .line 159
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x40fe147b    # 7.94f

    .line 163
    .line 164
    .line 165
    const/high16 v6, 0x40b00000    # 5.5f

    .line 166
    .line 167
    const/high16 v7, 0x40e80000    # 7.25f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

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
    const/high16 v4, 0x41a80000    # 21.0f

    .line 230
    .line 231
    const v6, 0x414ca3d7    # 12.79f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x41335c29    # 11.21f

    .line 238
    .line 239
    .line 240
    const/high16 v6, 0x40400000    # 3.0f

    .line 241
    .line 242
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x40000000    # 2.0f

    .line 246
    .line 247
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v25, 0x3f170a3d    # 0.59f

    .line 251
    .line 252
    .line 253
    const v26, 0x3fb47ae1    # 1.41f

    .line 254
    .line 255
    .line 256
    const/16 v21, 0x0

    .line 257
    .line 258
    const v22, 0x3f07ae14    # 0.53f

    .line 259
    .line 260
    .line 261
    const v23, 0x3e570a3d    # 0.21f

    .line 262
    .line 263
    .line 264
    const v24, 0x3f851eb8    # 1.04f

    .line 265
    .line 266
    .line 267
    move-object/from16 v20, v2

    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v4, 0x40f947ae    # 7.79f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, 0x40351eb8    # 2.83f

    .line 279
    .line 280
    .line 281
    const/16 v26, 0x0

    .line 282
    .line 283
    const v21, 0x3f47ae14    # 0.78f

    .line 284
    .line 285
    .line 286
    const v22, 0x3f47ae14    # 0.78f

    .line 287
    .line 288
    .line 289
    const v23, 0x40033333    # 2.05f

    .line 290
    .line 291
    .line 292
    const v24, 0x3f47ae14    # 0.78f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, -0x3f3947ae    # -6.21f

    .line 299
    .line 300
    .line 301
    const v6, 0x40c6b852    # 6.21f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/16 v25, 0x0

    .line 308
    .line 309
    const v26, -0x3fcae148    # -2.83f

    .line 310
    .line 311
    .line 312
    const v22, -0x40b851ec    # -0.78f

    .line 313
    .line 314
    .line 315
    const v23, 0x3f47ae14    # 0.78f

    .line 316
    .line 317
    .line 318
    const v24, -0x3ffccccd    # -2.05f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v4, 0x41a80000    # 21.0f

    .line 325
    .line 326
    const v6, 0x414ca3d7    # 12.79f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    const/high16 v6, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/high16 v8, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/4 v7, 0x0

    .line 344
    const-string v4, ""

    .line 345
    .line 346
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 347
    .line 348
    .line 349
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 354
    .line 355
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 356
    .line 357
    .line 358
    move-result-wide v6

    .line 359
    const/4 v2, 0x0

    .line 360
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 364
    .line 365
    .line 366
    move-result v10

    .line 367
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 368
    .line 369
    .line 370
    move-result v11

    .line 371
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    const v4, 0x418b47ae    # 17.41f

    .line 377
    .line 378
    .line 379
    const v6, 0x4136147b    # 11.38f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v25, 0x3fb47ae1    # 1.41f

    .line 386
    .line 387
    .line 388
    const v26, 0x3f170a3d    # 0.59f

    .line 389
    .line 390
    .line 391
    const v21, 0x3ec7ae14    # 0.39f

    .line 392
    .line 393
    .line 394
    const v22, 0x3ec7ae14    # 0.39f

    .line 395
    .line 396
    .line 397
    const v23, 0x3f666666    # 0.9f

    .line 398
    .line 399
    .line 400
    const v24, 0x3f170a3d    # 0.59f

    .line 401
    .line 402
    .line 403
    move-object/from16 v20, v2

    .line 404
    .line 405
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v26, -0x40e8f5c3    # -0.59f

    .line 409
    .line 410
    .line 411
    const v21, 0x3f028f5c    # 0.51f

    .line 412
    .line 413
    .line 414
    const/16 v22, 0x0

    .line 415
    .line 416
    const v23, 0x3f828f5c    # 1.02f

    .line 417
    .line 418
    .line 419
    const v24, -0x41b33333    # -0.2f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v4, -0x3f3947ae    # -6.21f

    .line 426
    .line 427
    .line 428
    const v6, 0x40c6b852    # 6.21f

    .line 429
    .line 430
    .line 431
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const/16 v25, 0x0

    .line 435
    .line 436
    const v26, -0x3fcae148    # -2.83f

    .line 437
    .line 438
    .line 439
    const v21, 0x3f47ae14    # 0.78f

    .line 440
    .line 441
    .line 442
    const v22, -0x40b851ec    # -0.78f

    .line 443
    .line 444
    .line 445
    const v23, 0x3f47ae14    # 0.78f

    .line 446
    .line 447
    .line 448
    const v24, -0x3ffccccd    # -2.05f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v4, -0x3f06b852    # -7.79f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v25, 0x41335c29    # 11.21f

    .line 461
    .line 462
    .line 463
    const/16 v26, 0x0

    .line 464
    .line 465
    const/high16 v21, 0x41440000    # 12.25f

    .line 466
    .line 467
    const v22, 0x3e570a3d    # 0.21f

    .line 468
    .line 469
    .line 470
    const v23, 0x413bd70a    # 11.74f

    .line 471
    .line 472
    .line 473
    const/16 v24, 0x0

    .line 474
    .line 475
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v4, 0x40a00000    # 5.0f

    .line 479
    .line 480
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v25, 0x40400000    # 3.0f

    .line 484
    .line 485
    const/high16 v26, 0x40000000    # 2.0f

    .line 486
    .line 487
    const v21, 0x4079999a    # 3.9f

    .line 488
    .line 489
    .line 490
    const/16 v22, 0x0

    .line 491
    .line 492
    const/high16 v23, 0x40400000    # 3.0f

    .line 493
    .line 494
    const v24, 0x3f666666    # 0.9f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v4, 0x40c6b852    # 6.21f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v25, 0x3f170a3d    # 0.59f

    .line 507
    .line 508
    .line 509
    const v26, 0x3fb47ae1    # 1.41f

    .line 510
    .line 511
    .line 512
    const/16 v21, 0x0

    .line 513
    .line 514
    const v22, 0x3f07ae14    # 0.53f

    .line 515
    .line 516
    .line 517
    const v23, 0x3e570a3d    # 0.21f

    .line 518
    .line 519
    .line 520
    const v24, 0x3f851eb8    # 1.04f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v4, 0x418b47ae    # 17.41f

    .line 527
    .line 528
    .line 529
    const v6, 0x4136147b    # 11.38f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x40a00000    # 5.0f

    .line 539
    .line 540
    const/high16 v6, 0x40000000    # 2.0f

    .line 541
    .line 542
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v4, 0x40c6b852    # 6.21f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v4, 0x411ca3d7    # 9.79f

    .line 552
    .line 553
    .line 554
    const/high16 v6, 0x41980000    # 19.0f

    .line 555
    .line 556
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v4, 0x41800000    # 16.0f

    .line 560
    .line 561
    const v6, 0x414ca3d7    # 12.79f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v4, 0x41035c29    # 8.21f

    .line 568
    .line 569
    .line 570
    const/high16 v6, 0x40a00000    # 5.0f

    .line 571
    .line 572
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v4, 0x40000000    # 2.0f

    .line 576
    .line 577
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    const/high16 v6, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/4 v7, 0x0

    .line 590
    const-string v4, ""

    .line 591
    .line 592
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 593
    .line 594
    .line 595
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 600
    .line 601
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 602
    .line 603
    .line 604
    move-result-wide v6

    .line 605
    const/4 v0, 0x0

    .line 606
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 610
    .line 611
    .line 612
    move-result v10

    .line 613
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 614
    .line 615
    .line 616
    move-result v11

    .line 617
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 620
    .line 621
    .line 622
    const/high16 v0, 0x40880000    # 4.25f

    .line 623
    .line 624
    const/high16 v2, 0x40e80000    # 7.25f

    .line 625
    .line 626
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v0, -0x40600000    # -1.25f

    .line 630
    .line 631
    const/4 v2, 0x0

    .line 632
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const/high16 v18, 0x40200000    # 2.5f

    .line 636
    .line 637
    const/16 v19, 0x0

    .line 638
    .line 639
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 640
    .line 641
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 642
    .line 643
    const/16 v16, 0x1

    .line 644
    .line 645
    const/16 v17, 0x1

    .line 646
    .line 647
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 651
    .line 652
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    const/16 v16, 0x3800

    .line 660
    .line 661
    const/16 v17, 0x0

    .line 662
    .line 663
    const/high16 v6, 0x3f800000    # 1.0f

    .line 664
    .line 665
    const/4 v7, 0x0

    .line 666
    const/high16 v12, 0x3f800000    # 1.0f

    .line 667
    .line 668
    const/4 v13, 0x0

    .line 669
    const/4 v14, 0x0

    .line 670
    const-string v4, ""

    .line 671
    .line 672
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    sput-object v0, Landroidx/compose/material/icons/twotone/DiscountKt;->_discount:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 681
    .line 682
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    return-object v0
.end method

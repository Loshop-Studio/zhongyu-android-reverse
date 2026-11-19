.class public final Landroidx/compose/material/icons/twotone/SupportKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _support:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSupport(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SupportKt;->_support:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Support"

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
    const v4, 0x4124cccd    # 10.3f

    .line 71
    .line 72
    .line 73
    const v6, 0x40ea3d71    # 7.32f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x409147ae    # 4.54f

    .line 80
    .line 81
    .line 82
    const v6, 0x4112147b    # 9.13f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x409147ae    # 4.54f

    .line 89
    .line 90
    .line 91
    const v26, 0x4112147b    # 9.13f

    .line 92
    .line 93
    .line 94
    const v21, 0x40e0a3d7    # 7.02f

    .line 95
    .line 96
    .line 97
    const v22, 0x40ab3333    # 5.35f

    .line 98
    .line 99
    .line 100
    const v23, 0x40ab3333    # 5.35f

    .line 101
    .line 102
    .line 103
    const v24, 0x40e0a3d7    # 7.02f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x3f933333    # 1.15f

    .line 112
    .line 113
    .line 114
    const v6, 0x4031eb85    # 2.78f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v25, 0x4124cccd    # 10.3f

    .line 121
    .line 122
    .line 123
    const v26, 0x40ea3d71    # 7.32f

    .line 124
    .line 125
    .line 126
    const v21, 0x40fa8f5c    # 7.83f

    .line 127
    .line 128
    .line 129
    const v22, 0x410e6666    # 8.9f

    .line 130
    .line 131
    .line 132
    const v23, 0x410eb852    # 8.92f

    .line 133
    .line 134
    .line 135
    const v24, 0x40fa3d71    # 7.82f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    const/16 v16, 0x3800

    .line 149
    .line 150
    const/16 v17, 0x0

    .line 151
    .line 152
    const v6, 0x3e99999a    # 0.3f

    .line 153
    .line 154
    .line 155
    const v8, 0x3e99999a    # 0.3f

    .line 156
    .line 157
    .line 158
    const/4 v7, 0x0

    .line 159
    const/high16 v9, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const/high16 v12, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    const/4 v14, 0x0

    .line 165
    const/4 v15, 0x0

    .line 166
    const-string v4, ""

    .line 167
    .line 168
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 169
    .line 170
    .line 171
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 178
    .line 179
    .line 180
    move-result-wide v6

    .line 181
    const/4 v2, 0x0

    .line 182
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    const v4, 0x415b851f    # 13.72f

    .line 199
    .line 200
    .line 201
    const v6, 0x40ea3d71    # 7.32f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v4, -0x3fce147b    # -2.78f

    .line 208
    .line 209
    .line 210
    const v6, 0x3f933333    # 1.15f

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v25, 0x4092e148    # 4.59f

    .line 217
    .line 218
    .line 219
    const v26, 0x4092e148    # 4.59f

    .line 220
    .line 221
    .line 222
    const v21, 0x3f4f5c29    # 0.81f

    .line 223
    .line 224
    .line 225
    const v22, 0x40066666    # 2.1f

    .line 226
    .line 227
    .line 228
    const v23, 0x401eb852    # 2.48f

    .line 229
    .line 230
    .line 231
    const v24, 0x4071eb85    # 3.78f

    .line 232
    .line 233
    .line 234
    move-object/from16 v20, v2

    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v4, 0x3f95c28f    # 1.17f

    .line 240
    .line 241
    .line 242
    const v6, -0x3fce147b    # -2.78f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v25, 0x40ea3d71    # 7.32f

    .line 249
    .line 250
    .line 251
    const v26, 0x415b851f    # 13.72f

    .line 252
    .line 253
    .line 254
    const v21, 0x410e8f5c    # 8.91f

    .line 255
    .line 256
    .line 257
    const v22, 0x418170a4    # 16.18f

    .line 258
    .line 259
    .line 260
    const v23, 0x40fa8f5c    # 7.83f

    .line 261
    .line 262
    .line 263
    const v24, 0x417170a4    # 15.09f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    const v6, 0x3e99999a    # 0.3f

    .line 277
    .line 278
    .line 279
    const/4 v7, 0x0

    .line 280
    const-string v4, ""

    .line 281
    .line 282
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 283
    .line 284
    .line 285
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 290
    .line 291
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 292
    .line 293
    .line 294
    move-result-wide v6

    .line 295
    const/4 v2, 0x0

    .line 296
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 310
    .line 311
    .line 312
    const v4, 0x41855c29    # 16.67f

    .line 313
    .line 314
    .line 315
    const v6, 0x412451ec    # 10.27f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v4, -0x406ccccd    # -1.15f

    .line 322
    .line 323
    .line 324
    const v6, 0x4031eb85    # 2.78f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v25, -0x3f6d70a4    # -4.58f

    .line 331
    .line 332
    .line 333
    const v26, -0x3f6d70a4    # -4.58f

    .line 334
    .line 335
    .line 336
    const v21, -0x40b0a3d7    # -0.81f

    .line 337
    .line 338
    .line 339
    const v22, -0x3ff9999a    # -2.1f

    .line 340
    .line 341
    .line 342
    const v23, -0x3fe147ae    # -2.48f

    .line 343
    .line 344
    .line 345
    const v24, -0x3f8eb852    # -3.77f

    .line 346
    .line 347
    .line 348
    move-object/from16 v20, v2

    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v25, 0x41855c29    # 16.67f

    .line 357
    .line 358
    .line 359
    const v26, 0x412451ec    # 10.27f

    .line 360
    .line 361
    .line 362
    const v21, 0x417170a4    # 15.09f

    .line 363
    .line 364
    .line 365
    const v22, 0x40fa8f5c    # 7.83f

    .line 366
    .line 367
    .line 368
    const v23, 0x41815c29    # 16.17f

    .line 369
    .line 370
    .line 371
    const v24, 0x410e6666    # 8.9f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    const v6, 0x3e99999a    # 0.3f

    .line 385
    .line 386
    .line 387
    const/4 v7, 0x0

    .line 388
    const-string v4, ""

    .line 389
    .line 390
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 391
    .line 392
    .line 393
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 398
    .line 399
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 400
    .line 401
    .line 402
    move-result-wide v6

    .line 403
    const/4 v2, 0x0

    .line 404
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 408
    .line 409
    .line 410
    move-result v10

    .line 411
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 412
    .line 413
    .line 414
    move-result v11

    .line 415
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 418
    .line 419
    .line 420
    const v4, 0x415b5c29    # 13.71f

    .line 421
    .line 422
    .line 423
    const v6, 0x418570a4    # 16.68f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v25, -0x3fc33333    # -2.95f

    .line 430
    .line 431
    .line 432
    const v26, 0x403e147b    # 2.97f

    .line 433
    .line 434
    .line 435
    const/high16 v21, -0x41000000    # -0.5f

    .line 436
    .line 437
    const v22, 0x3faf5c29    # 1.37f

    .line 438
    .line 439
    .line 440
    const v23, -0x4035c28f    # -1.58f

    .line 441
    .line 442
    .line 443
    const v24, 0x401d70a4    # 2.46f

    .line 444
    .line 445
    .line 446
    move-object/from16 v20, v2

    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, 0x3f933333    # 1.15f

    .line 452
    .line 453
    .line 454
    const v6, 0x4031eb85    # 2.78f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v25, 0x40928f5c    # 4.58f

    .line 461
    .line 462
    .line 463
    const v26, -0x3f6d70a4    # -4.58f

    .line 464
    .line 465
    .line 466
    const v21, 0x40066666    # 2.1f

    .line 467
    .line 468
    .line 469
    const v22, -0x40b0a3d7    # -0.81f

    .line 470
    .line 471
    .line 472
    const v23, 0x407147ae    # 3.77f

    .line 473
    .line 474
    .line 475
    const v24, -0x3fe147ae    # -2.48f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v4, 0x415b5c29    # 13.71f

    .line 482
    .line 483
    .line 484
    const v6, 0x418570a4    # 16.68f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    const v6, 0x3e99999a    # 0.3f

    .line 498
    .line 499
    .line 500
    const/4 v7, 0x0

    .line 501
    const-string v4, ""

    .line 502
    .line 503
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 504
    .line 505
    .line 506
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 507
    .line 508
    .line 509
    move-result v3

    .line 510
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 511
    .line 512
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 513
    .line 514
    .line 515
    move-result-wide v6

    .line 516
    const/4 v0, 0x0

    .line 517
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 521
    .line 522
    .line 523
    move-result v10

    .line 524
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 525
    .line 526
    .line 527
    move-result v11

    .line 528
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 531
    .line 532
    .line 533
    const/high16 v0, 0x40000000    # 2.0f

    .line 534
    .line 535
    const/high16 v2, 0x41400000    # 12.0f

    .line 536
    .line 537
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, 0x40000000    # 2.0f

    .line 541
    .line 542
    const/high16 v18, 0x41400000    # 12.0f

    .line 543
    .line 544
    const v13, 0x40cf5c29    # 6.48f

    .line 545
    .line 546
    .line 547
    const/high16 v14, 0x40000000    # 2.0f

    .line 548
    .line 549
    const/high16 v15, 0x40000000    # 2.0f

    .line 550
    .line 551
    const v16, 0x40cf5c29    # 6.48f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v17, 0x41200000    # 10.0f

    .line 558
    .line 559
    const/high16 v18, 0x41200000    # 10.0f

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const v14, 0x40b0a3d7    # 5.52f

    .line 563
    .line 564
    .line 565
    const v15, 0x408f5c29    # 4.48f

    .line 566
    .line 567
    .line 568
    const/high16 v16, 0x41200000    # 10.0f

    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, -0x3f70a3d7    # -4.48f

    .line 574
    .line 575
    .line 576
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 577
    .line 578
    const/high16 v4, 0x41200000    # 10.0f

    .line 579
    .line 580
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v17, 0x41400000    # 12.0f

    .line 584
    .line 585
    const/high16 v18, 0x40000000    # 2.0f

    .line 586
    .line 587
    const/high16 v13, 0x41b00000    # 22.0f

    .line 588
    .line 589
    const v14, 0x40cf5c29    # 6.48f

    .line 590
    .line 591
    .line 592
    const v15, 0x418c28f6    # 17.52f

    .line 593
    .line 594
    .line 595
    const/high16 v16, 0x40000000    # 2.0f

    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x416deb85    # 14.87f

    .line 604
    .line 605
    .line 606
    const v2, 0x409147ae    # 4.54f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, 0x40928f5c    # 4.58f

    .line 613
    .line 614
    .line 615
    const v18, 0x40928f5c    # 4.58f

    .line 616
    .line 617
    .line 618
    const v13, 0x40066666    # 2.1f

    .line 619
    .line 620
    .line 621
    const v14, 0x3f4f5c29    # 0.81f

    .line 622
    .line 623
    .line 624
    const v15, 0x407147ae    # 3.77f

    .line 625
    .line 626
    .line 627
    const v16, 0x401eb852    # 2.48f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v0, -0x3fce147b    # -2.78f

    .line 634
    .line 635
    .line 636
    const v2, 0x3f933333    # 1.15f

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, -0x3fc33333    # -2.95f

    .line 643
    .line 644
    .line 645
    const v18, -0x3fc3d70a    # -2.94f

    .line 646
    .line 647
    .line 648
    const v13, -0x40fd70a4    # -0.51f

    .line 649
    .line 650
    .line 651
    const v14, -0x4051eb85    # -1.36f

    .line 652
    .line 653
    .line 654
    const v15, -0x4035c28f    # -1.58f

    .line 655
    .line 656
    .line 657
    const v16, -0x3fe3d70a    # -2.44f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v0, 0x416deb85    # 14.87f

    .line 664
    .line 665
    .line 666
    const v2, 0x409147ae    # 4.54f

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v0, 0x409147ae    # 4.54f

    .line 676
    .line 677
    .line 678
    const v2, 0x4112147b    # 9.13f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v0, 0x3f95c28f    # 1.17f

    .line 685
    .line 686
    .line 687
    const v2, 0x4031eb85    # 2.78f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v17, -0x3fc147ae    # -2.98f

    .line 694
    .line 695
    .line 696
    const v18, 0x403e147b    # 2.97f

    .line 697
    .line 698
    .line 699
    const v13, -0x404f5c29    # -1.38f

    .line 700
    .line 701
    .line 702
    const/high16 v14, 0x3f000000    # 0.5f

    .line 703
    .line 704
    const v15, -0x3fe1eb85    # -2.47f

    .line 705
    .line 706
    .line 707
    const v16, 0x3fcb851f    # 1.59f

    .line 708
    .line 709
    .line 710
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v0, 0x409147ae    # 4.54f

    .line 714
    .line 715
    .line 716
    const v2, 0x4112147b    # 9.13f

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v17, 0x4112147b    # 9.13f

    .line 723
    .line 724
    .line 725
    const v18, 0x409147ae    # 4.54f

    .line 726
    .line 727
    .line 728
    const v13, 0x40ab3333    # 5.35f

    .line 729
    .line 730
    .line 731
    const v14, 0x40e0a3d7    # 7.02f

    .line 732
    .line 733
    .line 734
    const v15, 0x40e0a3d7    # 7.02f

    .line 735
    .line 736
    .line 737
    const v16, 0x40ab3333    # 5.35f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const v0, 0x419bae14    # 19.46f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v17, -0x3f6d1eb8    # -4.59f

    .line 753
    .line 754
    .line 755
    const v18, -0x3f6d1eb8    # -4.59f

    .line 756
    .line 757
    .line 758
    const v13, -0x3ff9999a    # -2.1f

    .line 759
    .line 760
    .line 761
    const v14, -0x40b0a3d7    # -0.81f

    .line 762
    .line 763
    .line 764
    const v15, -0x3f8e147b    # -3.78f

    .line 765
    .line 766
    .line 767
    const v16, -0x3fe147ae    # -2.48f

    .line 768
    .line 769
    .line 770
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 771
    .line 772
    .line 773
    const v0, -0x406ccccd    # -1.15f

    .line 774
    .line 775
    .line 776
    const v2, 0x4031eb85    # 2.78f

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v17, 0x403e147b    # 2.97f

    .line 783
    .line 784
    .line 785
    const v18, 0x403d70a4    # 2.96f

    .line 786
    .line 787
    .line 788
    const v13, 0x3f028f5c    # 0.51f

    .line 789
    .line 790
    .line 791
    const v14, 0x3fb0a3d7    # 1.38f

    .line 792
    .line 793
    .line 794
    const v15, 0x3fcb851f    # 1.59f

    .line 795
    .line 796
    .line 797
    const v16, 0x401d70a4    # 2.46f

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v0, 0x419bae14    # 19.46f

    .line 804
    .line 805
    .line 806
    const v2, 0x4112147b    # 9.13f

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v0, 0x41100000    # 9.0f

    .line 816
    .line 817
    const/high16 v2, 0x41400000    # 12.0f

    .line 818
    .line 819
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v17, 0x40400000    # 3.0f

    .line 823
    .line 824
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 825
    .line 826
    const/4 v13, 0x0

    .line 827
    const v14, -0x402b851f    # -1.66f

    .line 828
    .line 829
    .line 830
    const v15, 0x3fab851f    # 1.34f

    .line 831
    .line 832
    .line 833
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 834
    .line 835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v0, 0x3fab851f    # 1.34f

    .line 839
    .line 840
    .line 841
    const/high16 v2, 0x40400000    # 3.0f

    .line 842
    .line 843
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v0, -0x40547ae1    # -1.34f

    .line 847
    .line 848
    .line 849
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 850
    .line 851
    const/high16 v4, 0x40400000    # 3.0f

    .line 852
    .line 853
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    const v0, 0x415a8f5c    # 13.66f

    .line 857
    .line 858
    .line 859
    const/high16 v2, 0x41100000    # 9.0f

    .line 860
    .line 861
    const/high16 v4, 0x41400000    # 12.0f

    .line 862
    .line 863
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v0, 0x416e147b    # 14.88f

    .line 870
    .line 871
    .line 872
    const v2, 0x419bae14    # 19.46f

    .line 873
    .line 874
    .line 875
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const v0, -0x406ccccd    # -1.15f

    .line 879
    .line 880
    .line 881
    const v2, -0x3fce147b    # -2.78f

    .line 882
    .line 883
    .line 884
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v17, 0x403ccccd    # 2.95f

    .line 888
    .line 889
    .line 890
    const v18, -0x3fc1eb85    # -2.97f

    .line 891
    .line 892
    .line 893
    const v13, 0x3faf5c29    # 1.37f

    .line 894
    .line 895
    .line 896
    const v14, -0x40fd70a4    # -0.51f

    .line 897
    .line 898
    .line 899
    const v15, 0x401ccccd    # 2.45f

    .line 900
    .line 901
    .line 902
    const v16, -0x40347ae1    # -1.59f

    .line 903
    .line 904
    .line 905
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const v0, 0x3f95c28f    # 1.17f

    .line 909
    .line 910
    .line 911
    const v2, 0x4031eb85    # 2.78f

    .line 912
    .line 913
    .line 914
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v17, 0x416e147b    # 14.88f

    .line 918
    .line 919
    .line 920
    const v18, 0x419bae14    # 19.46f

    .line 921
    .line 922
    .line 923
    const v13, 0x41953333    # 18.65f

    .line 924
    .line 925
    .line 926
    const v14, 0x4187d70a    # 16.98f

    .line 927
    .line 928
    .line 929
    const v15, 0x4187d70a    # 16.98f

    .line 930
    .line 931
    .line 932
    const v16, 0x41953333    # 18.65f

    .line 933
    .line 934
    .line 935
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 942
    .line 943
    .line 944
    move-result-object v2

    .line 945
    const/16 v16, 0x3800

    .line 946
    .line 947
    const/16 v17, 0x0

    .line 948
    .line 949
    const/high16 v6, 0x3f800000    # 1.0f

    .line 950
    .line 951
    const/high16 v8, 0x3f800000    # 1.0f

    .line 952
    .line 953
    const/4 v7, 0x0

    .line 954
    const/high16 v12, 0x3f800000    # 1.0f

    .line 955
    .line 956
    const/4 v13, 0x0

    .line 957
    const/4 v14, 0x0

    .line 958
    const/4 v15, 0x0

    .line 959
    const-string v4, ""

    .line 960
    .line 961
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 966
    .line 967
    .line 968
    move-result-object v0

    .line 969
    sput-object v0, Landroidx/compose/material/icons/twotone/SupportKt;->_support:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 970
    .line 971
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 972
    .line 973
    .line 974
    return-object v0
.end method

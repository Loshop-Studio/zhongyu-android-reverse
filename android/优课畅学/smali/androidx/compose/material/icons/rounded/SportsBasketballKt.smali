.class public final Landroidx/compose/material/icons/rounded/SportsBasketballKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsBasketball:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsBasketball(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SportsBasketballKt;->_sportsBasketball:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SportsBasketball"

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
    const v4, 0x4188b852    # 17.09f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41300000    # 11.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x409b851f    # 4.86f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, -0x403ae148    # -1.54f

    .line 85
    .line 86
    .line 87
    const v26, -0x3f733333    # -4.4f

    .line 88
    .line 89
    .line 90
    const v21, -0x41dc28f6    # -0.16f

    .line 91
    .line 92
    .line 93
    const v22, -0x4031eb85    # -1.61f

    .line 94
    .line 95
    .line 96
    const v23, -0x40ca3d71    # -0.71f

    .line 97
    .line 98
    .line 99
    const v24, -0x3fb8f5c3    # -3.11f

    .line 100
    .line 101
    .line 102
    move-object/from16 v20, v2

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, 0x4188b852    # 17.09f

    .line 108
    .line 109
    .line 110
    const/high16 v26, 0x41300000    # 11.0f

    .line 111
    .line 112
    const v21, 0x419570a4    # 18.68f

    .line 113
    .line 114
    .line 115
    const v22, 0x40edc28f    # 7.43f

    .line 116
    .line 117
    .line 118
    const v23, 0x418b5c29    # 17.42f

    .line 119
    .line 120
    .line 121
    const v24, 0x4110cccd    # 9.05f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const/16 v16, 0x3800

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/high16 v6, 0x3f800000    # 1.0f

    .line 139
    .line 140
    const/high16 v8, 0x3f800000    # 1.0f

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
    const v4, 0x40dd1eb8    # 6.91f

    .line 183
    .line 184
    .line 185
    const/high16 v6, 0x41300000    # 11.0f

    .line 186
    .line 187
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v25, 0x4065c28f    # 3.59f

    .line 191
    .line 192
    .line 193
    const v26, 0x40d33333    # 6.6f

    .line 194
    .line 195
    .line 196
    const v21, 0x40d28f5c    # 6.58f

    .line 197
    .line 198
    .line 199
    const v22, 0x4110cccd    # 9.05f

    .line 200
    .line 201
    .line 202
    const v23, 0x40aa3d71    # 5.32f

    .line 203
    .line 204
    .line 205
    const v24, 0x40edc28f    # 7.43f

    .line 206
    .line 207
    .line 208
    move-object/from16 v20, v2

    .line 209
    .line 210
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v25, 0x40033333    # 2.05f

    .line 214
    .line 215
    .line 216
    const/high16 v26, 0x41300000    # 11.0f

    .line 217
    .line 218
    const v21, 0x4030a3d7    # 2.76f

    .line 219
    .line 220
    .line 221
    const v22, 0x40fc7ae1    # 7.89f

    .line 222
    .line 223
    .line 224
    const v23, 0x400d70a4    # 2.21f

    .line 225
    .line 226
    .line 227
    const v24, 0x41163d71    # 9.39f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    const/high16 v6, 0x3f800000    # 1.0f

    .line 244
    .line 245
    const/4 v7, 0x0

    .line 246
    const-string v4, ""

    .line 247
    .line 248
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 249
    .line 250
    .line 251
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 256
    .line 257
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 258
    .line 259
    .line 260
    move-result-wide v6

    .line 261
    const/4 v2, 0x0

    .line 262
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    const v4, 0x41711eb8    # 15.07f

    .line 279
    .line 280
    .line 281
    const/high16 v6, 0x41300000    # 11.0f

    .line 282
    .line 283
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v25, 0x4081eb85    # 4.06f

    .line 287
    .line 288
    .line 289
    const/high16 v26, -0x3f400000    # -6.0f

    .line 290
    .line 291
    const v21, 0x3ea3d70a    # 0.32f

    .line 292
    .line 293
    .line 294
    const v22, -0x3fda3d71    # -2.59f

    .line 295
    .line 296
    .line 297
    const v23, 0x3ff0a3d7    # 1.88f

    .line 298
    .line 299
    .line 300
    const v24, -0x3f66b852    # -4.79f

    .line 301
    .line 302
    .line 303
    move-object/from16 v20, v2

    .line 304
    .line 305
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v25, -0x3f3bd70a    # -6.13f

    .line 309
    .line 310
    .line 311
    const v26, -0x3fc33333    # -2.95f

    .line 312
    .line 313
    .line 314
    const v21, -0x40333333    # -1.6f

    .line 315
    .line 316
    .line 317
    const v22, -0x402f5c29    # -1.63f

    .line 318
    .line 319
    .line 320
    const v23, -0x3f90a3d7    # -3.74f

    .line 321
    .line 322
    .line 323
    const v24, -0x3fd28f5c    # -2.71f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v4, 0x41300000    # 11.0f

    .line 330
    .line 331
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v4, 0x41711eb8    # 15.07f

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    const/high16 v6, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/4 v7, 0x0

    .line 350
    const-string v4, ""

    .line 351
    .line 352
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 353
    .line 354
    .line 355
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 360
    .line 361
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 362
    .line 363
    .line 364
    move-result-wide v6

    .line 365
    const/4 v2, 0x0

    .line 366
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 370
    .line 371
    .line 372
    move-result v10

    .line 373
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 374
    .line 375
    .line 376
    move-result v11

    .line 377
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 380
    .line 381
    .line 382
    const v4, 0x410ee148    # 8.93f

    .line 383
    .line 384
    .line 385
    const/high16 v6, 0x41300000    # 11.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v4, 0x41300000    # 11.0f

    .line 391
    .line 392
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v4, 0x40033333    # 2.05f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v25, 0x409bd70a    # 4.87f

    .line 402
    .line 403
    .line 404
    const/high16 v26, 0x40a00000    # 5.0f

    .line 405
    .line 406
    const v21, 0x4109c28f    # 8.61f

    .line 407
    .line 408
    .line 409
    const v22, 0x40128f5c    # 2.29f

    .line 410
    .line 411
    .line 412
    const v23, 0x40ceb852    # 6.46f

    .line 413
    .line 414
    .line 415
    const v24, 0x4057ae14    # 3.37f

    .line 416
    .line 417
    .line 418
    move-object/from16 v20, v2

    .line 419
    .line 420
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v25, 0x410ee148    # 8.93f

    .line 424
    .line 425
    .line 426
    const/high16 v26, 0x41300000    # 11.0f

    .line 427
    .line 428
    const v21, 0x40e1999a    # 7.05f

    .line 429
    .line 430
    .line 431
    const v22, 0x40c6b852    # 6.21f

    .line 432
    .line 433
    .line 434
    const v23, 0x4109c28f    # 8.61f

    .line 435
    .line 436
    .line 437
    const v24, 0x41068f5c    # 8.41f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    const/high16 v6, 0x3f800000    # 1.0f

    .line 451
    .line 452
    const/4 v7, 0x0

    .line 453
    const-string v4, ""

    .line 454
    .line 455
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 456
    .line 457
    .line 458
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 463
    .line 464
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 465
    .line 466
    .line 467
    move-result-wide v6

    .line 468
    const/4 v2, 0x0

    .line 469
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 473
    .line 474
    .line 475
    move-result v10

    .line 476
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 483
    .line 484
    .line 485
    const v4, 0x41711eb8    # 15.07f

    .line 486
    .line 487
    .line 488
    const/high16 v6, 0x41500000    # 13.0f

    .line 489
    .line 490
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v4, 0x41500000    # 13.0f

    .line 494
    .line 495
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v4, 0x410f3333    # 8.95f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v25, 0x40c428f6    # 6.13f

    .line 505
    .line 506
    .line 507
    const v26, -0x3fc33333    # -2.95f

    .line 508
    .line 509
    .line 510
    const v21, 0x4018f5c3    # 2.39f

    .line 511
    .line 512
    .line 513
    const v22, -0x418a3d71    # -0.24f

    .line 514
    .line 515
    .line 516
    const v23, 0x409147ae    # 4.54f

    .line 517
    .line 518
    .line 519
    const v24, -0x40570a3d    # -1.32f

    .line 520
    .line 521
    .line 522
    move-object/from16 v20, v2

    .line 523
    .line 524
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v25, 0x41711eb8    # 15.07f

    .line 528
    .line 529
    .line 530
    const/high16 v26, 0x41500000    # 13.0f

    .line 531
    .line 532
    const v21, 0x4187999a    # 16.95f

    .line 533
    .line 534
    .line 535
    const v22, 0x418e51ec    # 17.79f

    .line 536
    .line 537
    .line 538
    const v23, 0x41763d71    # 15.39f

    .line 539
    .line 540
    .line 541
    const v24, 0x417970a4    # 15.59f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    const/high16 v6, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    const-string v4, ""

    .line 558
    .line 559
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 560
    .line 561
    .line 562
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 567
    .line 568
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 569
    .line 570
    .line 571
    move-result-wide v6

    .line 572
    const/4 v2, 0x0

    .line 573
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 577
    .line 578
    .line 579
    move-result v10

    .line 580
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 581
    .line 582
    .line 583
    move-result v11

    .line 584
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 587
    .line 588
    .line 589
    const v4, 0x4065c28f    # 3.59f

    .line 590
    .line 591
    .line 592
    const v6, 0x418b3333    # 17.4f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v25, 0x40547ae1    # 3.32f

    .line 599
    .line 600
    .line 601
    const v26, -0x3f733333    # -4.4f

    .line 602
    .line 603
    .line 604
    const v21, 0x3fdc28f6    # 1.72f

    .line 605
    .line 606
    .line 607
    const v22, -0x40ab851f    # -0.83f

    .line 608
    .line 609
    .line 610
    const v23, 0x403f5c29    # 2.99f

    .line 611
    .line 612
    .line 613
    const v24, -0x3fe28f5c    # -2.46f

    .line 614
    .line 615
    .line 616
    move-object/from16 v20, v2

    .line 617
    .line 618
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v4, 0x40033333    # 2.05f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v25, 0x4065c28f    # 3.59f

    .line 628
    .line 629
    .line 630
    const v26, 0x418b3333    # 17.4f

    .line 631
    .line 632
    .line 633
    const v21, 0x400d70a4    # 2.21f

    .line 634
    .line 635
    .line 636
    const v22, 0x4169c28f    # 14.61f

    .line 637
    .line 638
    .line 639
    const v23, 0x4030a3d7    # 2.76f

    .line 640
    .line 641
    .line 642
    const v24, 0x4180e148    # 16.11f

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    const/high16 v6, 0x3f800000    # 1.0f

    .line 656
    .line 657
    const/4 v7, 0x0

    .line 658
    const-string v4, ""

    .line 659
    .line 660
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 661
    .line 662
    .line 663
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 664
    .line 665
    .line 666
    move-result v3

    .line 667
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 668
    .line 669
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 670
    .line 671
    .line 672
    move-result-wide v6

    .line 673
    const/4 v2, 0x0

    .line 674
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 678
    .line 679
    .line 680
    move-result v10

    .line 681
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 682
    .line 683
    .line 684
    move-result v11

    .line 685
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 688
    .line 689
    .line 690
    const v4, 0x4188b852    # 17.09f

    .line 691
    .line 692
    .line 693
    const/high16 v6, 0x41500000    # 13.0f

    .line 694
    .line 695
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v25, 0x40547ae1    # 3.32f

    .line 699
    .line 700
    .line 701
    const v26, 0x408ccccd    # 4.4f

    .line 702
    .line 703
    .line 704
    const v21, 0x3ea8f5c3    # 0.33f

    .line 705
    .line 706
    .line 707
    const v22, 0x3ff9999a    # 1.95f

    .line 708
    .line 709
    .line 710
    const v23, 0x3fcb851f    # 1.59f

    .line 711
    .line 712
    .line 713
    const v24, 0x40647ae1    # 3.57f

    .line 714
    .line 715
    .line 716
    move-object/from16 v20, v2

    .line 717
    .line 718
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const v25, 0x3fc51eb8    # 1.54f

    .line 722
    .line 723
    .line 724
    const v26, -0x3f733333    # -4.4f

    .line 725
    .line 726
    .line 727
    const v21, 0x3f547ae1    # 0.83f

    .line 728
    .line 729
    .line 730
    const v22, -0x405ae148    # -1.29f

    .line 731
    .line 732
    .line 733
    const v23, 0x3fb0a3d7    # 1.38f

    .line 734
    .line 735
    .line 736
    const v24, -0x3fcd70a4    # -2.79f

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    const/high16 v6, 0x3f800000    # 1.0f

    .line 753
    .line 754
    const/4 v7, 0x0

    .line 755
    const-string v4, ""

    .line 756
    .line 757
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 758
    .line 759
    .line 760
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 761
    .line 762
    .line 763
    move-result v3

    .line 764
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 765
    .line 766
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 767
    .line 768
    .line 769
    move-result-wide v6

    .line 770
    const/4 v0, 0x0

    .line 771
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 775
    .line 776
    .line 777
    move-result v10

    .line 778
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 779
    .line 780
    .line 781
    move-result v11

    .line 782
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 785
    .line 786
    .line 787
    const v0, 0x410ee148    # 8.93f

    .line 788
    .line 789
    .line 790
    const/high16 v2, 0x41500000    # 13.0f

    .line 791
    .line 792
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const v17, -0x3f7e147b    # -4.06f

    .line 796
    .line 797
    .line 798
    const/high16 v18, 0x40c00000    # 6.0f

    .line 799
    .line 800
    const v13, -0x415c28f6    # -0.32f

    .line 801
    .line 802
    .line 803
    const v14, 0x4025c28f    # 2.59f

    .line 804
    .line 805
    .line 806
    const v15, -0x400f5c29    # -1.88f

    .line 807
    .line 808
    .line 809
    const v16, 0x409947ae    # 4.79f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v17, 0x40c428f6    # 6.13f

    .line 816
    .line 817
    .line 818
    const v18, 0x403ccccd    # 2.95f

    .line 819
    .line 820
    .line 821
    const v13, 0x3fcccccd    # 1.6f

    .line 822
    .line 823
    .line 824
    const v14, 0x3fd0a3d7    # 1.63f

    .line 825
    .line 826
    .line 827
    const v15, 0x406f5c29    # 3.74f

    .line 828
    .line 829
    .line 830
    const v16, 0x402d70a4    # 2.71f

    .line 831
    .line 832
    .line 833
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const/high16 v0, 0x41500000    # 13.0f

    .line 837
    .line 838
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 839
    .line 840
    .line 841
    const v0, 0x410ee148    # 8.93f

    .line 842
    .line 843
    .line 844
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    const/16 v16, 0x3800

    .line 855
    .line 856
    const/16 v17, 0x0

    .line 857
    .line 858
    const/high16 v6, 0x3f800000    # 1.0f

    .line 859
    .line 860
    const/4 v7, 0x0

    .line 861
    const/high16 v12, 0x3f800000    # 1.0f

    .line 862
    .line 863
    const/4 v13, 0x0

    .line 864
    const/4 v14, 0x0

    .line 865
    const/4 v15, 0x0

    .line 866
    const-string v4, ""

    .line 867
    .line 868
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    sput-object v0, Landroidx/compose/material/icons/rounded/SportsBasketballKt;->_sportsBasketball:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 877
    .line 878
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 879
    .line 880
    .line 881
    return-object v0
.end method

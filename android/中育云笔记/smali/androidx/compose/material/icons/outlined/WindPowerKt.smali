.class public final Landroidx/compose/material/icons/outlined/WindPowerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _windPower:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWindPower(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/WindPowerKt;->_windPower:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.WindPower"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40c00000    # 6.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40000000    # 2.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, -0x3f400000    # -6.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const/16 v16, 0x3800

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const/high16 v6, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/high16 v8, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/high16 v9, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/high16 v12, 0x3f800000    # 1.0f

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const/4 v14, 0x0

    .line 114
    const/4 v15, 0x0

    .line 115
    const-string v4, ""

    .line 116
    .line 117
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 127
    .line 128
    .line 129
    move-result-wide v6

    .line 130
    const/4 v2, 0x0

    .line 131
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x40e00000    # 7.0f

    .line 148
    .line 149
    const/high16 v6, 0x3f800000    # 1.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x40a00000    # 5.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x40000000    # 2.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v4, -0x3f600000    # -5.0f

    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const/4 v7, 0x0

    .line 177
    const-string v4, ""

    .line 178
    .line 179
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 180
    .line 181
    .line 182
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 187
    .line 188
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 189
    .line 190
    .line 191
    move-result-wide v6

    .line 192
    const/4 v2, 0x0

    .line 193
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    const/high16 v4, 0x41980000    # 19.0f

    .line 210
    .line 211
    const/high16 v6, 0x40400000    # 3.0f

    .line 212
    .line 213
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v4, 0x40a00000    # 5.0f

    .line 217
    .line 218
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x40000000    # 2.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v4, -0x3f600000    # -5.0f

    .line 227
    .line 228
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    const/high16 v6, 0x3f800000    # 1.0f

    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    const-string v4, ""

    .line 242
    .line 243
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 244
    .line 245
    .line 246
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 251
    .line 252
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 253
    .line 254
    .line 255
    move-result-wide v6

    .line 256
    const/4 v0, 0x0

    .line 257
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 261
    .line 262
    .line 263
    move-result v10

    .line 264
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    const v0, 0x41b1ae14    # 22.21f

    .line 274
    .line 275
    .line 276
    const v2, 0x4194e148    # 18.61f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v0, -0x3fee147b    # -2.28f

    .line 283
    .line 284
    .line 285
    const v2, -0x3f7ccccd    # -4.1f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, -0x405eb852    # -1.26f

    .line 292
    .line 293
    .line 294
    const v18, -0x4087ae14    # -0.97f

    .line 295
    .line 296
    .line 297
    const v13, -0x4175c28f    # -0.27f

    .line 298
    .line 299
    .line 300
    const v14, -0x410a3d71    # -0.48f

    .line 301
    .line 302
    .line 303
    const v15, -0x40c51eb8    # -0.73f

    .line 304
    .line 305
    .line 306
    const v16, -0x40ab851f    # -0.83f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, -0x3fd3d70a    # -2.69f

    .line 313
    .line 314
    .line 315
    const v2, -0x40d47ae1    # -0.67f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, -0x41428f5c    # -0.37f

    .line 322
    .line 323
    .line 324
    const v18, -0x4055c28f    # -1.33f

    .line 325
    .line 326
    .line 327
    const v13, -0x435c28f6    # -0.02f

    .line 328
    .line 329
    .line 330
    const v14, -0x410f5c29    # -0.47f

    .line 331
    .line 332
    .line 333
    const v15, -0x41f0a3d7    # -0.14f

    .line 334
    .line 335
    .line 336
    const v16, -0x40947ae1    # -0.92f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x407d70a4    # 3.96f

    .line 343
    .line 344
    .line 345
    const v2, -0x3f2d1eb8    # -6.59f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, -0x40b851ec    # -0.78f

    .line 352
    .line 353
    .line 354
    const v18, -0x3fb7ae14    # -3.13f

    .line 355
    .line 356
    .line 357
    const v13, 0x3f266666    # 0.65f

    .line 358
    .line 359
    .line 360
    const v14, -0x4075c28f    # -1.08f

    .line 361
    .line 362
    .line 363
    const v15, 0x3e99999a    # 0.3f

    .line 364
    .line 365
    .line 366
    const v16, -0x3fe147ae    # -2.48f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x406a3d71    # -1.17f

    .line 373
    .line 374
    .line 375
    const v18, -0x415c28f6    # -0.32f

    .line 376
    .line 377
    .line 378
    const v13, -0x4147ae14    # -0.36f

    .line 379
    .line 380
    .line 381
    const v14, -0x419eb852    # -0.22f

    .line 382
    .line 383
    .line 384
    const v15, -0x40bae148    # -0.77f

    .line 385
    .line 386
    .line 387
    const v16, -0x415c28f6    # -0.32f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, -0x403851ec    # -1.56f

    .line 394
    .line 395
    .line 396
    const v18, 0x3f1eb852    # 0.62f

    .line 397
    .line 398
    .line 399
    const v13, -0x40f0a3d7    # -0.56f

    .line 400
    .line 401
    .line 402
    const/4 v14, 0x0

    .line 403
    const v15, -0x4070a3d7    # -1.12f

    .line 404
    .line 405
    .line 406
    const v16, 0x3e570a3d    # 0.21f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, -0x3fa47ae1    # -3.43f

    .line 413
    .line 414
    .line 415
    const v2, 0x404d70a4    # 3.21f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x41400000    # 12.0f

    .line 422
    .line 423
    const v18, 0x40d8f5c3    # 6.78f

    .line 424
    .line 425
    .line 426
    const v13, 0x4143ae14    # 12.23f

    .line 427
    .line 428
    .line 429
    const v14, 0x40b66666    # 5.7f

    .line 430
    .line 431
    .line 432
    const/high16 v15, 0x41400000    # 12.0f

    .line 433
    .line 434
    const v16, 0x40c75c29    # 6.23f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, 0x4059999a    # 3.4f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, -0x40628f5c    # -1.23f

    .line 447
    .line 448
    .line 449
    const v18, 0x3f51eb85    # 0.82f

    .line 450
    .line 451
    .line 452
    const v13, -0x410f5c29    # -0.47f

    .line 453
    .line 454
    .line 455
    const v14, 0x3e2e147b    # 0.17f

    .line 456
    .line 457
    .line 458
    const v15, -0x409c28f6    # -0.89f

    .line 459
    .line 460
    .line 461
    const v16, 0x3ee66666    # 0.45f

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v0, 0x4051eb85    # 3.28f

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v17, 0x3f800000    # 1.0f

    .line 474
    .line 475
    const v18, 0x41547ae1    # 13.28f

    .line 476
    .line 477
    .line 478
    const v13, 0x400147ae    # 2.02f

    .line 479
    .line 480
    .line 481
    const/high16 v14, 0x41300000    # 11.0f

    .line 482
    .line 483
    const/high16 v15, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const v16, 0x414051ec    # 12.02f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x3fd33333    # 1.65f

    .line 492
    .line 493
    .line 494
    const v18, 0x400c28f6    # 2.19f

    .line 495
    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const v14, 0x3f828f5c    # 1.02f

    .line 499
    .line 500
    .line 501
    const v15, 0x3f2b851f    # 0.67f

    .line 502
    .line 503
    .line 504
    const v16, 0x3ff47ae1    # 1.91f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v0, 0x409051ec    # 4.51f

    .line 511
    .line 512
    .line 513
    const v2, 0x3fa51eb8    # 1.29f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, 0x3f0ccccd    # 0.55f

    .line 520
    .line 521
    .line 522
    const v18, 0x3da3d70a    # 0.08f

    .line 523
    .line 524
    .line 525
    const v13, 0x3e3851ec    # 0.18f

    .line 526
    .line 527
    .line 528
    const v14, 0x3d4ccccd    # 0.05f

    .line 529
    .line 530
    .line 531
    const v15, 0x3ebd70a4    # 0.37f

    .line 532
    .line 533
    .line 534
    const v16, 0x3da3d70a    # 0.08f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x3f83d70a    # 1.03f

    .line 541
    .line 542
    .line 543
    const v18, -0x416b851f    # -0.29f

    .line 544
    .line 545
    .line 546
    const v13, 0x3eb851ec    # 0.36f

    .line 547
    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    const v15, 0x3f3851ec    # 0.72f

    .line 551
    .line 552
    .line 553
    const v16, -0x42333333    # -0.1f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x400f5c29    # 2.24f

    .line 560
    .line 561
    .line 562
    const v2, -0x40547ae1    # -1.34f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, 0x3f828f5c    # 1.02f

    .line 569
    .line 570
    .line 571
    const v18, 0x3f1c28f6    # 0.61f

    .line 572
    .line 573
    .line 574
    const v13, 0x3e947ae1    # 0.29f

    .line 575
    .line 576
    .line 577
    const v14, 0x3e851eb8    # 0.26f

    .line 578
    .line 579
    .line 580
    const v15, 0x3f2147ae    # 0.63f

    .line 581
    .line 582
    .line 583
    const v16, 0x3ef0a3d7    # 0.47f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v0, 0x41a80000    # 21.0f

    .line 590
    .line 591
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v17, -0x40000000    # -2.0f

    .line 595
    .line 596
    const/high16 v18, 0x40000000    # 2.0f

    .line 597
    .line 598
    const v13, -0x40733333    # -1.1f

    .line 599
    .line 600
    .line 601
    const/4 v14, 0x0

    .line 602
    const/high16 v15, -0x40000000    # -2.0f

    .line 603
    .line 604
    const v16, 0x3f666666    # 0.9f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x40c00000    # 6.0f

    .line 611
    .line 612
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const/high16 v18, -0x40000000    # -2.0f

    .line 616
    .line 617
    const/4 v13, 0x0

    .line 618
    const v14, -0x40733333    # -1.1f

    .line 619
    .line 620
    .line 621
    const v15, -0x4099999a    # -0.9f

    .line 622
    .line 623
    .line 624
    const/high16 v16, -0x40000000    # -2.0f

    .line 625
    .line 626
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v0, -0x3f770a3d    # -4.28f

    .line 630
    .line 631
    .line 632
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v0, 0x4093851f    # 4.61f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v17, 0x3fce147b    # 1.61f

    .line 642
    .line 643
    .line 644
    const v18, 0x3f2b851f    # 0.67f

    .line 645
    .line 646
    .line 647
    const v13, 0x3ee66666    # 0.45f

    .line 648
    .line 649
    .line 650
    const v14, 0x3ee66666    # 0.45f

    .line 651
    .line 652
    .line 653
    const v15, 0x3f83d70a    # 1.03f

    .line 654
    .line 655
    .line 656
    const v16, 0x3f2b851f    # 0.67f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v18, -0x40d47ae1    # -0.67f

    .line 663
    .line 664
    .line 665
    const v13, 0x3f147ae1    # 0.58f

    .line 666
    .line 667
    .line 668
    const/4 v14, 0x0

    .line 669
    const v15, 0x3f95c28f    # 1.17f

    .line 670
    .line 671
    .line 672
    const v16, -0x419eb852    # -0.22f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/4 v0, 0x0

    .line 679
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v17, 0x41b1ae14    # 22.21f

    .line 683
    .line 684
    .line 685
    const v18, 0x4194e148    # 18.61f

    .line 686
    .line 687
    .line 688
    const v13, 0x41b46666    # 22.55f

    .line 689
    .line 690
    .line 691
    const v14, 0x41a4e148    # 20.61f

    .line 692
    .line 693
    .line 694
    const v15, 0x41b5ae14    # 22.71f

    .line 695
    .line 696
    .line 697
    const/high16 v16, 0x419c0000    # 19.5f

    .line 698
    .line 699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, 0x416d70a4    # 14.84f

    .line 706
    .line 707
    .line 708
    const v2, 0x40f70a3d    # 7.72f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v0, 0x404ccccd    # 3.2f

    .line 715
    .line 716
    .line 717
    const v2, 0x4158cccd    # 13.55f

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v17, 0x40400000    # 3.0f

    .line 724
    .line 725
    const v18, 0x41547ae1    # 13.28f

    .line 726
    .line 727
    .line 728
    const v13, 0x40451eb8    # 3.08f

    .line 729
    .line 730
    .line 731
    const v14, 0x415851ec    # 13.52f

    .line 732
    .line 733
    .line 734
    const/high16 v15, 0x40400000    # 3.0f

    .line 735
    .line 736
    const v16, 0x41566666    # 13.4f

    .line 737
    .line 738
    .line 739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const v17, 0x4051eb85    # 3.28f

    .line 743
    .line 744
    .line 745
    const/high16 v18, 0x41500000    # 13.0f

    .line 746
    .line 747
    const/high16 v13, 0x40400000    # 3.0f

    .line 748
    .line 749
    const v14, 0x4152147b    # 13.13f

    .line 750
    .line 751
    .line 752
    const v15, 0x404851ec    # 3.13f

    .line 753
    .line 754
    .line 755
    const/high16 v16, 0x41500000    # 13.0f

    .line 756
    .line 757
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v0, 0x40d75c29    # 6.73f

    .line 761
    .line 762
    .line 763
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v17, 0x3cf5c28f    # 0.03f

    .line 767
    .line 768
    .line 769
    const v18, 0x3ee147ae    # 0.44f

    .line 770
    .line 771
    .line 772
    const/4 v13, 0x0

    .line 773
    const v14, 0x3e19999a    # 0.15f

    .line 774
    .line 775
    .line 776
    const v15, 0x3c23d70a    # 0.01f

    .line 777
    .line 778
    .line 779
    const v16, 0x3e99999a    # 0.3f

    .line 780
    .line 781
    .line 782
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v0, 0x416d70a4    # 14.84f

    .line 786
    .line 787
    .line 788
    const v2, 0x40f70a3d    # 7.72f

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const/high16 v0, 0x41500000    # 13.0f

    .line 798
    .line 799
    const/high16 v2, 0x41600000    # 14.0f

    .line 800
    .line 801
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const/high16 v17, -0x40800000    # -1.0f

    .line 805
    .line 806
    const/high16 v18, -0x40800000    # -1.0f

    .line 807
    .line 808
    const v13, -0x40f33333    # -0.55f

    .line 809
    .line 810
    .line 811
    const/4 v14, 0x0

    .line 812
    const/high16 v15, -0x40800000    # -1.0f

    .line 813
    .line 814
    const v16, -0x4119999a    # -0.45f

    .line 815
    .line 816
    .line 817
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 818
    .line 819
    .line 820
    const/high16 v17, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const/4 v13, 0x0

    .line 823
    const v14, -0x40f33333    # -0.55f

    .line 824
    .line 825
    .line 826
    const v15, 0x3ee66666    # 0.45f

    .line 827
    .line 828
    .line 829
    const/high16 v16, -0x40800000    # -1.0f

    .line 830
    .line 831
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const v0, 0x3ee66666    # 0.45f

    .line 835
    .line 836
    .line 837
    const/high16 v2, 0x3f800000    # 1.0f

    .line 838
    .line 839
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    const/high16 v17, 0x41500000    # 13.0f

    .line 843
    .line 844
    const/high16 v18, 0x41600000    # 14.0f

    .line 845
    .line 846
    const/high16 v13, 0x41600000    # 14.0f

    .line 847
    .line 848
    const v14, 0x4158cccd    # 13.55f

    .line 849
    .line 850
    .line 851
    const v15, 0x4158cccd    # 13.55f

    .line 852
    .line 853
    .line 854
    const/high16 v16, 0x41600000    # 14.0f

    .line 855
    .line 856
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    const v0, 0x41223d71    # 10.14f

    .line 863
    .line 864
    .line 865
    const/high16 v2, 0x41600000    # 14.0f

    .line 866
    .line 867
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const v0, 0x40d8f5c3    # 6.78f

    .line 871
    .line 872
    .line 873
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 874
    .line 875
    .line 876
    const v0, 0x405b851f    # 3.43f

    .line 877
    .line 878
    .line 879
    const v2, -0x3fb28f5c    # -3.21f

    .line 880
    .line 881
    .line 882
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const v17, 0x3eae147b    # 0.34f

    .line 886
    .line 887
    .line 888
    const v18, -0x42dc28f6    # -0.04f

    .line 889
    .line 890
    .line 891
    const v13, 0x3d4ccccd    # 0.05f

    .line 892
    .line 893
    .line 894
    const v14, -0x42b33333    # -0.05f

    .line 895
    .line 896
    .line 897
    const v15, 0x3e428f5c    # 0.19f

    .line 898
    .line 899
    .line 900
    const v16, -0x420a3d71    # -0.12f

    .line 901
    .line 902
    .line 903
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v17, 0x3dcccccd    # 0.1f

    .line 907
    .line 908
    .line 909
    const v18, 0x3ec28f5c    # 0.38f

    .line 910
    .line 911
    .line 912
    const v13, 0x3e051eb8    # 0.13f

    .line 913
    .line 914
    .line 915
    const v14, 0x3da3d70a    # 0.08f

    .line 916
    .line 917
    .line 918
    const v15, 0x3e3851ec    # 0.18f

    .line 919
    .line 920
    .line 921
    const/high16 v16, 0x3e800000    # 0.25f

    .line 922
    .line 923
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    const v0, -0x3f90a3d7    # -3.74f

    .line 927
    .line 928
    .line 929
    const v2, 0x40c7ae14    # 6.24f

    .line 930
    .line 931
    .line 932
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v0, 0x41223d71    # 10.14f

    .line 936
    .line 937
    .line 938
    const/high16 v2, 0x41600000    # 14.0f

    .line 939
    .line 940
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    const v0, 0x41a35c29    # 20.42f

    .line 947
    .line 948
    .line 949
    const v2, 0x419f5c29    # 19.92f

    .line 950
    .line 951
    .line 952
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const v17, -0x41333333    # -0.4f

    .line 956
    .line 957
    .line 958
    const/16 v18, 0x0

    .line 959
    .line 960
    const v13, -0x42b33333    # -0.05f

    .line 961
    .line 962
    .line 963
    const v14, 0x3d4ccccd    # 0.05f

    .line 964
    .line 965
    .line 966
    const v15, -0x418a3d71    # -0.24f

    .line 967
    .line 968
    .line 969
    const v16, 0x3e23d70a    # 0.16f

    .line 970
    .line 971
    .line 972
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 973
    .line 974
    .line 975
    const v0, -0x3f64cccd    # -4.85f

    .line 976
    .line 977
    .line 978
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const v17, 0x3e75c28f    # 0.24f

    .line 982
    .line 983
    .line 984
    const v18, -0x4170a3d7    # -0.28f

    .line 985
    .line 986
    .line 987
    const v13, 0x3da3d70a    # 0.08f

    .line 988
    .line 989
    .line 990
    const v14, -0x4247ae14    # -0.09f

    .line 991
    .line 992
    .line 993
    const v15, 0x3e23d70a    # 0.16f

    .line 994
    .line 995
    .line 996
    const v16, -0x41c7ae14    # -0.18f

    .line 997
    .line 998
    .line 999
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1000
    .line 1001
    .line 1002
    const v0, 0x4031eb85    # 2.78f

    .line 1003
    .line 1004
    .line 1005
    const v2, 0x3f30a3d7    # 0.69f

    .line 1006
    .line 1007
    .line 1008
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1009
    .line 1010
    .line 1011
    const v0, 0x4011eb85    # 2.28f

    .line 1012
    .line 1013
    .line 1014
    const v2, 0x40833333    # 4.1f

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    const v17, 0x41a35c29    # 20.42f

    .line 1021
    .line 1022
    .line 1023
    const v18, 0x419f5c29    # 19.92f

    .line 1024
    .line 1025
    .line 1026
    const v13, 0x41a43d71    # 20.53f

    .line 1027
    .line 1028
    .line 1029
    const v14, 0x419d851f    # 19.69f

    .line 1030
    .line 1031
    .line 1032
    const v15, 0x41a4147b    # 20.51f

    .line 1033
    .line 1034
    .line 1035
    const v16, 0x419ea3d7    # 19.83f

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    const/16 v16, 0x3800

    .line 1049
    .line 1050
    const/16 v17, 0x0

    .line 1051
    .line 1052
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1053
    .line 1054
    const/4 v7, 0x0

    .line 1055
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1056
    .line 1057
    const/4 v13, 0x0

    .line 1058
    const/4 v14, 0x0

    .line 1059
    const/4 v15, 0x0

    .line 1060
    const-string v4, ""

    .line 1061
    .line 1062
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    sput-object v0, Landroidx/compose/material/icons/outlined/WindPowerKt;->_windPower:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1071
    .line 1072
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1073
    .line 1074
    .line 1075
    return-object v0
.end method

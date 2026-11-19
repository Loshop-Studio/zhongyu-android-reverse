.class public final Landroidx/compose/material/icons/twotone/RemoveShoppingCartKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _removeShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRemoveShoppingCart(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RemoveShoppingCartKt;->_removeShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RemoveShoppingCart"

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
    const v4, 0x3f90a3d7    # 1.13f

    .line 71
    .line 72
    .line 73
    const v6, 0x3fb47ae1    # 1.41f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    const v6, 0x40228f5c    # 2.54f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v4, 0x408c7ae1    # 4.39f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v4, 0x400d70a4    # 2.21f

    .line 93
    .line 94
    .line 95
    const v6, 0x40951eb8    # 4.66f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, -0x40533333    # -1.35f

    .line 102
    .line 103
    .line 104
    const v6, 0x401ccccd    # 2.45f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v25, -0x41800000    # -0.25f

    .line 111
    .line 112
    const v26, 0x3f75c28f    # 0.96f

    .line 113
    .line 114
    .line 115
    const v21, -0x41dc28f6    # -0.16f

    .line 116
    .line 117
    .line 118
    const v22, 0x3e8f5c29    # 0.28f

    .line 119
    .line 120
    .line 121
    const/high16 v23, -0x41800000    # -0.25f

    .line 122
    .line 123
    const v24, 0x3f1c28f6    # 0.61f

    .line 124
    .line 125
    .line 126
    move-object/from16 v20, v2

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, 0x40000000    # 2.0f

    .line 132
    .line 133
    const/high16 v26, 0x40000000    # 2.0f

    .line 134
    .line 135
    const/16 v21, 0x0

    .line 136
    .line 137
    const v22, 0x3f8ccccd    # 1.1f

    .line 138
    .line 139
    .line 140
    const v23, 0x3f666666    # 0.9f

    .line 141
    .line 142
    .line 143
    const/high16 v24, 0x40000000    # 2.0f

    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, 0x40eeb852    # 7.46f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x3fb0a3d7    # 1.38f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v25, -0x40ab851f    # -0.83f

    .line 161
    .line 162
    .line 163
    const v26, 0x3fcf5c29    # 1.62f

    .line 164
    .line 165
    .line 166
    const/high16 v21, -0x41000000    # -0.5f

    .line 167
    .line 168
    const v22, 0x3eb851ec    # 0.36f

    .line 169
    .line 170
    .line 171
    const v23, -0x40ab851f    # -0.83f

    .line 172
    .line 173
    .line 174
    const v24, 0x3f733333    # 0.95f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v25, 0x3ffeb852    # 1.99f

    .line 181
    .line 182
    .line 183
    const/high16 v26, 0x40000000    # 2.0f

    .line 184
    .line 185
    const/16 v21, 0x0

    .line 186
    .line 187
    const v22, 0x3f8ccccd    # 1.1f

    .line 188
    .line 189
    .line 190
    const v23, 0x3f63d70a    # 0.89f

    .line 191
    .line 192
    .line 193
    const/high16 v24, 0x40000000    # 2.0f

    .line 194
    .line 195
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v25, 0x3fcf5c29    # 1.62f

    .line 199
    .line 200
    .line 201
    const v26, -0x40a8f5c3    # -0.84f

    .line 202
    .line 203
    .line 204
    const v21, 0x3f2b851f    # 0.67f

    .line 205
    .line 206
    .line 207
    const/16 v22, 0x0

    .line 208
    .line 209
    const v23, 0x3fa147ae    # 1.26f

    .line 210
    .line 211
    .line 212
    const v24, -0x41570a3d    # -0.33f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v4, 0x41abae14    # 21.46f

    .line 219
    .line 220
    .line 221
    const/high16 v6, 0x41c00000    # 24.0f

    .line 222
    .line 223
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v4, -0x404b851f    # -1.41f

    .line 227
    .line 228
    .line 229
    const v6, 0x3fb47ae1    # 1.41f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x3f90a3d7    # 1.13f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v4, 0x41700000    # 15.0f

    .line 245
    .line 246
    const/high16 v6, 0x40e00000    # 7.0f

    .line 247
    .line 248
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x3f8ccccd    # 1.1f

    .line 252
    .line 253
    .line 254
    const/high16 v6, -0x40000000    # -2.0f

    .line 255
    .line 256
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v4, 0x40170a3d    # 2.36f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v4, 0x40000000    # 2.0f

    .line 266
    .line 267
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x40e00000    # 7.0f

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const/16 v16, 0x3800

    .line 283
    .line 284
    const/16 v17, 0x0

    .line 285
    .line 286
    const/high16 v6, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const/high16 v8, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/4 v7, 0x0

    .line 291
    const/high16 v9, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/high16 v12, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    const/4 v14, 0x0

    .line 297
    const/4 v15, 0x0

    .line 298
    const-string v4, ""

    .line 299
    .line 300
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 301
    .line 302
    .line 303
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 308
    .line 309
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 310
    .line 311
    .line 312
    move-result-wide v6

    .line 313
    const/4 v2, 0x0

    .line 314
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    const v4, 0x41927ae1    # 18.31f

    .line 331
    .line 332
    .line 333
    const/high16 v6, 0x40c00000    # 6.0f

    .line 334
    .line 335
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, 0x4111eb85    # 9.12f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v4, 0x409fae14    # 4.99f

    .line 345
    .line 346
    .line 347
    const/high16 v6, 0x40a00000    # 5.0f

    .line 348
    .line 349
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v4, 0x3fb851ec    # 1.44f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    const v6, 0x3e99999a    # 0.3f

    .line 366
    .line 367
    .line 368
    const v8, 0x3e99999a    # 0.3f

    .line 369
    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    const-string v4, ""

    .line 373
    .line 374
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 375
    .line 376
    .line 377
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 382
    .line 383
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 384
    .line 385
    .line 386
    move-result-wide v6

    .line 387
    const/4 v0, 0x0

    .line 388
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 392
    .line 393
    .line 394
    move-result v10

    .line 395
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 396
    .line 397
    .line 398
    move-result v11

    .line 399
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 402
    .line 403
    .line 404
    const/high16 v0, 0x41a00000    # 20.0f

    .line 405
    .line 406
    const/high16 v2, 0x40800000    # 4.0f

    .line 407
    .line 408
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x40e3d70a    # 7.12f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v0, 0x40000000    # 2.0f

    .line 418
    .line 419
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x41130a3d    # 9.19f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, -0x3fcf5c29    # -2.76f

    .line 429
    .line 430
    .line 431
    const/high16 v2, 0x40a00000    # 5.0f

    .line 432
    .line 433
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, -0x4047ae14    # -1.44f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3ff851ec    # 1.94f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 449
    .line 450
    const v18, -0x4087ae14    # -0.97f

    .line 451
    .line 452
    .line 453
    const v13, 0x3f0a3d71    # 0.54f

    .line 454
    .line 455
    .line 456
    const v14, -0x41f0a3d7    # -0.14f

    .line 457
    .line 458
    .line 459
    const v15, 0x3f7d70a4    # 0.99f

    .line 460
    .line 461
    .line 462
    const v16, -0x41051eb8    # -0.49f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x40651eb8    # 3.58f

    .line 469
    .line 470
    .line 471
    const v2, -0x3f3051ec    # -6.49f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v17, 0x41a00000    # 20.0f

    .line 478
    .line 479
    const/high16 v18, 0x40800000    # 4.0f

    .line 480
    .line 481
    const/high16 v13, 0x41aa0000    # 21.25f

    .line 482
    .line 483
    const v14, 0x409a3d71    # 4.82f

    .line 484
    .line 485
    .line 486
    const v15, 0x41a6147b    # 20.76f

    .line 487
    .line 488
    .line 489
    const/high16 v16, 0x40800000    # 4.0f

    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x41900000    # 18.0f

    .line 498
    .line 499
    const/high16 v2, 0x40e00000    # 7.0f

    .line 500
    .line 501
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, -0x400147ae    # -1.99f

    .line 505
    .line 506
    .line 507
    const/high16 v18, 0x40000000    # 2.0f

    .line 508
    .line 509
    const v13, -0x40733333    # -1.1f

    .line 510
    .line 511
    .line 512
    const/4 v14, 0x0

    .line 513
    const v15, -0x400147ae    # -1.99f

    .line 514
    .line 515
    .line 516
    const v16, 0x3f666666    # 0.9f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v0, 0x40bccccd    # 5.9f

    .line 523
    .line 524
    .line 525
    const/high16 v2, 0x41b00000    # 22.0f

    .line 526
    .line 527
    const/high16 v4, 0x40e00000    # 7.0f

    .line 528
    .line 529
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, -0x4099999a    # -0.9f

    .line 533
    .line 534
    .line 535
    const/high16 v2, -0x40000000    # -2.0f

    .line 536
    .line 537
    const/high16 v4, 0x40000000    # 2.0f

    .line 538
    .line 539
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    const/16 v16, 0x3800

    .line 553
    .line 554
    const/16 v17, 0x0

    .line 555
    .line 556
    const/high16 v6, 0x3f800000    # 1.0f

    .line 557
    .line 558
    const/high16 v8, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/4 v7, 0x0

    .line 561
    const/high16 v12, 0x3f800000    # 1.0f

    .line 562
    .line 563
    const/4 v13, 0x0

    .line 564
    const/4 v15, 0x0

    .line 565
    const-string v4, ""

    .line 566
    .line 567
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    sput-object v0, Landroidx/compose/material/icons/twotone/RemoveShoppingCartKt;->_removeShoppingCart:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 576
    .line 577
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/ShoppingBasketKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _shoppingBasket:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShoppingBasket(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ShoppingBasketKt;->_shoppingBasket:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ShoppingBasket"

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
    const v6, 0x4053d70a    # 3.31f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x410028f6    # 8.01f

    .line 79
    .line 80
    .line 81
    const v6, 0x400ccccd    # 2.2f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41980000    # 19.0f

    .line 88
    .line 89
    const/high16 v6, 0x41940000    # 18.5f

    .line 90
    .line 91
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, -0x3f000000    # -8.0f

    .line 95
    .line 96
    const v6, 0x400ccccd    # 2.2f

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v4, 0x4053d70a    # 3.31f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x41880000    # 17.0f

    .line 112
    .line 113
    const/high16 v6, 0x41400000    # 12.0f

    .line 114
    .line 115
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v25, -0x40000000    # -2.0f

    .line 119
    .line 120
    const/high16 v26, -0x40000000    # -2.0f

    .line 121
    .line 122
    const v21, -0x40733333    # -1.1f

    .line 123
    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const/high16 v23, -0x40000000    # -2.0f

    .line 128
    .line 129
    const v24, -0x4099999a    # -0.9f

    .line 130
    .line 131
    .line 132
    move-object/from16 v20, v2

    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, 0x3f666666    # 0.9f

    .line 138
    .line 139
    .line 140
    const/high16 v6, -0x40000000    # -2.0f

    .line 141
    .line 142
    const/high16 v7, 0x40000000    # 2.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v6, 0x40000000    # 2.0f

    .line 148
    .line 149
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, -0x4099999a    # -0.9f

    .line 153
    .line 154
    .line 155
    const/high16 v6, -0x40000000    # -2.0f

    .line 156
    .line 157
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    const/16 v16, 0x3800

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const v6, 0x3e99999a    # 0.3f

    .line 172
    .line 173
    .line 174
    const v8, 0x3e99999a    # 0.3f

    .line 175
    .line 176
    .line 177
    const/4 v7, 0x0

    .line 178
    const/high16 v9, 0x3f800000    # 1.0f

    .line 179
    .line 180
    const/high16 v12, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    const/4 v14, 0x0

    .line 184
    const/4 v15, 0x0

    .line 185
    const-string v4, ""

    .line 186
    .line 187
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 188
    .line 189
    .line 190
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 195
    .line 196
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 197
    .line 198
    .line 199
    move-result-wide v6

    .line 200
    const/4 v0, 0x0

    .line 201
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x41b00000    # 22.0f

    .line 218
    .line 219
    const/high16 v2, 0x41100000    # 9.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v0, -0x3f66b852    # -4.79f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, -0x3f73d70a    # -4.38f

    .line 231
    .line 232
    .line 233
    const v2, -0x3f2e147b    # -6.56f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, -0x40ab851f    # -0.83f

    .line 240
    .line 241
    .line 242
    const v18, -0x4128f5c3    # -0.42f

    .line 243
    .line 244
    .line 245
    const v13, -0x41bd70a4    # -0.19f

    .line 246
    .line 247
    .line 248
    const v14, -0x4170a3d7    # -0.28f

    .line 249
    .line 250
    .line 251
    const v15, -0x40fd70a4    # -0.51f

    .line 252
    .line 253
    .line 254
    const v16, -0x4128f5c3    # -0.42f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v0, -0x40ab851f    # -0.83f

    .line 261
    .line 262
    .line 263
    const v2, 0x3edc28f6    # 0.43f

    .line 264
    .line 265
    .line 266
    const v4, -0x40dc28f6    # -0.64f

    .line 267
    .line 268
    .line 269
    const v6, 0x3e0f5c29    # 0.14f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, 0x40d947ae    # 6.79f

    .line 276
    .line 277
    .line 278
    const/high16 v2, 0x41100000    # 9.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v0, 0x40000000    # 2.0f

    .line 284
    .line 285
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const/high16 v17, -0x40800000    # -1.0f

    .line 289
    .line 290
    const/high16 v18, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const v13, -0x40f33333    # -0.55f

    .line 293
    .line 294
    .line 295
    const/4 v14, 0x0

    .line 296
    const/high16 v15, -0x40800000    # -1.0f

    .line 297
    .line 298
    const v16, 0x3ee66666    # 0.45f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, 0x3d23d70a    # 0.04f

    .line 305
    .line 306
    .line 307
    const v18, 0x3e8a3d71    # 0.27f

    .line 308
    .line 309
    .line 310
    const/4 v13, 0x0

    .line 311
    const v14, 0x3db851ec    # 0.09f

    .line 312
    .line 313
    .line 314
    const v15, 0x3c23d70a    # 0.01f

    .line 315
    .line 316
    .line 317
    const v16, 0x3e3851ec    # 0.18f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v0, 0x411451ec    # 9.27f

    .line 324
    .line 325
    .line 326
    const v2, 0x40228f5c    # 2.54f

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x3ff5c28f    # 1.92f

    .line 333
    .line 334
    .line 335
    const v18, 0x3fbae148    # 1.46f

    .line 336
    .line 337
    .line 338
    const v13, 0x3e6b851f    # 0.23f

    .line 339
    .line 340
    .line 341
    const v14, 0x3f570a3d    # 0.84f

    .line 342
    .line 343
    .line 344
    const/high16 v15, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const v16, 0x3fbae148    # 1.46f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x41500000    # 13.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x3ff70a3d    # 1.93f

    .line 358
    .line 359
    .line 360
    const v18, -0x40451eb8    # -1.46f

    .line 361
    .line 362
    .line 363
    const v13, 0x3f6b851f    # 0.92f

    .line 364
    .line 365
    .line 366
    const/4 v14, 0x0

    .line 367
    const v15, 0x3fd851ec    # 1.69f

    .line 368
    .line 369
    .line 370
    const v16, -0x40e147ae    # -0.62f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v0, -0x3eebae14    # -9.27f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v0, 0x41b80000    # 23.0f

    .line 383
    .line 384
    const/high16 v2, 0x41200000    # 10.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v17, -0x40800000    # -1.0f

    .line 390
    .line 391
    const/high16 v18, -0x40800000    # -1.0f

    .line 392
    .line 393
    const/4 v13, 0x0

    .line 394
    const v14, -0x40f33333    # -0.55f

    .line 395
    .line 396
    .line 397
    const v15, -0x4119999a    # -0.45f

    .line 398
    .line 399
    .line 400
    const/high16 v16, -0x40800000    # -1.0f

    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x4099999a    # 4.8f

    .line 409
    .line 410
    .line 411
    const/high16 v2, 0x41400000    # 12.0f

    .line 412
    .line 413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x416ccccd    # 14.8f

    .line 417
    .line 418
    .line 419
    const/high16 v2, 0x41100000    # 9.0f

    .line 420
    .line 421
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x41133333    # 9.2f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, 0x4099999a    # 4.8f

    .line 431
    .line 432
    .line 433
    const/high16 v2, 0x41400000    # 12.0f

    .line 434
    .line 435
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v0, 0x41980000    # 19.0f

    .line 442
    .line 443
    const/high16 v2, 0x41940000    # 18.5f

    .line 444
    .line 445
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v0, -0x3eb028f6    # -12.99f

    .line 449
    .line 450
    .line 451
    const v2, 0x3c23d70a    # 0.01f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v0, 0x41300000    # 11.0f

    .line 458
    .line 459
    const v2, 0x4053d70a    # 3.31f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x41a5999a    # 20.7f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x3ff33333    # -2.2f

    .line 472
    .line 473
    .line 474
    const/high16 v2, 0x41000000    # 8.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x41500000    # 13.0f

    .line 483
    .line 484
    const/high16 v2, 0x41400000    # 12.0f

    .line 485
    .line 486
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, -0x40000000    # -2.0f

    .line 490
    .line 491
    const/high16 v18, 0x40000000    # 2.0f

    .line 492
    .line 493
    const v13, -0x40733333    # -1.1f

    .line 494
    .line 495
    .line 496
    const/4 v14, 0x0

    .line 497
    const/high16 v15, -0x40000000    # -2.0f

    .line 498
    .line 499
    const v16, 0x3f666666    # 0.9f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v0, 0x3f666666    # 0.9f

    .line 506
    .line 507
    .line 508
    const/high16 v2, 0x40000000    # 2.0f

    .line 509
    .line 510
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v0, -0x4099999a    # -0.9f

    .line 514
    .line 515
    .line 516
    const/high16 v2, -0x40000000    # -2.0f

    .line 517
    .line 518
    const/high16 v4, 0x40000000    # 2.0f

    .line 519
    .line 520
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 530
    .line 531
    .line 532
    move-result-object v2

    .line 533
    const/16 v16, 0x3800

    .line 534
    .line 535
    const/16 v17, 0x0

    .line 536
    .line 537
    const/high16 v6, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/high16 v8, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v7, 0x0

    .line 542
    const/high16 v12, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    const/4 v15, 0x0

    .line 546
    const-string v4, ""

    .line 547
    .line 548
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    sput-object v0, Landroidx/compose/material/icons/twotone/ShoppingBasketKt;->_shoppingBasket:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 557
    .line 558
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    return-object v0
.end method

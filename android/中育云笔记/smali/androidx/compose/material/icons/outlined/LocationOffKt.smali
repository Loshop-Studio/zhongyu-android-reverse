.class public final Landroidx/compose/material/icons/outlined/LocationOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _locationOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocationOff(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/LocationOffKt;->_locationOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.LocationOff"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40a00000    # 5.0f

    .line 78
    .line 79
    const/high16 v18, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const v13, 0x4030a3d7    # 2.76f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x40a00000    # 5.0f

    .line 86
    .line 87
    const v16, 0x400f5c29    # 2.24f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v17, -0x40800000    # -1.0f

    .line 94
    .line 95
    const v18, 0x4067ae14    # 3.62f

    .line 96
    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const v14, 0x3f87ae14    # 1.06f

    .line 100
    .line 101
    .line 102
    const v15, -0x413851ec    # -0.39f

    .line 103
    .line 104
    .line 105
    const v16, 0x40147ae1    # 2.32f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x3fbeb852    # 1.49f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x41980000    # 19.0f

    .line 118
    .line 119
    const/high16 v18, 0x41100000    # 9.0f

    .line 120
    .line 121
    const v13, 0x4192f5c3    # 18.37f

    .line 122
    .line 123
    .line 124
    const v14, 0x4145c28f    # 12.36f

    .line 125
    .line 126
    .line 127
    const/high16 v15, 0x41980000    # 19.0f

    .line 128
    .line 129
    const v16, 0x41291eb8    # 10.57f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, -0x3f200000    # -7.0f

    .line 136
    .line 137
    const/high16 v18, -0x3f200000    # -7.0f

    .line 138
    .line 139
    const/4 v13, 0x0

    .line 140
    const v14, -0x3f8851ec    # -3.87f

    .line 141
    .line 142
    .line 143
    const v15, -0x3fb7ae14    # -3.13f

    .line 144
    .line 145
    .line 146
    const/high16 v16, -0x3f200000    # -7.0f

    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v17, -0x3f680000    # -4.75f

    .line 152
    .line 153
    const v18, 0x3fee147b    # 1.86f

    .line 154
    .line 155
    .line 156
    const v13, -0x40147ae1    # -1.84f

    .line 157
    .line 158
    .line 159
    const/4 v14, 0x0

    .line 160
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 161
    .line 162
    const v16, 0x3f35c28f    # 0.71f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x3fb70a3d    # 1.43f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v17, 0x41400000    # 12.0f

    .line 175
    .line 176
    const/high16 v18, 0x40800000    # 4.0f

    .line 177
    .line 178
    const v13, 0x4118f5c3    # 9.56f

    .line 179
    .line 180
    .line 181
    const/high16 v14, 0x40900000    # 4.5f

    .line 182
    .line 183
    const v15, 0x412b851f    # 10.72f

    .line 184
    .line 185
    .line 186
    const/high16 v16, 0x40800000    # 4.0f

    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v0, 0x40d00000    # 6.5f

    .line 195
    .line 196
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, -0x403851ec    # -1.56f

    .line 200
    .line 201
    .line 202
    const v18, 0x3f0f5c29    # 0.56f

    .line 203
    .line 204
    .line 205
    const v13, -0x40e8f5c3    # -0.59f

    .line 206
    .line 207
    .line 208
    const/4 v14, 0x0

    .line 209
    const v15, -0x406f5c29    # -1.13f

    .line 210
    .line 211
    .line 212
    const v16, 0x3e570a3d    # 0.21f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x40600000    # 3.5f

    .line 219
    .line 220
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, 0x3f0f5c29    # 0.56f

    .line 224
    .line 225
    .line 226
    const v18, -0x403851ec    # -1.56f

    .line 227
    .line 228
    .line 229
    const v13, 0x3eb33333    # 0.35f

    .line 230
    .line 231
    .line 232
    const v14, -0x4123d70a    # -0.43f

    .line 233
    .line 234
    .line 235
    const v15, 0x3f0f5c29    # 0.56f

    .line 236
    .line 237
    .line 238
    const v16, -0x4087ae14    # -0.97f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 245
    .line 246
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 247
    .line 248
    const/4 v13, 0x0

    .line 249
    const v14, -0x404f5c29    # -1.38f

    .line 250
    .line 251
    .line 252
    const v15, -0x4070a3d7    # -1.12f

    .line 253
    .line 254
    .line 255
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x40370a3d    # 2.86f

    .line 264
    .line 265
    .line 266
    const v2, 0x405a3d71    # 3.41f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x40000000    # 2.0f

    .line 273
    .line 274
    const v2, 0x4088a3d7    # 4.27f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x404b851f    # 3.18f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x40a00000    # 5.0f

    .line 287
    .line 288
    const/high16 v18, 0x41100000    # 9.0f

    .line 289
    .line 290
    const v13, 0x40a23d71    # 5.07f

    .line 291
    .line 292
    .line 293
    const v14, 0x40fe6666    # 7.95f

    .line 294
    .line 295
    .line 296
    const/high16 v15, 0x40a00000    # 5.0f

    .line 297
    .line 298
    const v16, 0x4107851f    # 8.47f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v17, 0x40e00000    # 7.0f

    .line 305
    .line 306
    const/high16 v18, 0x41500000    # 13.0f

    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const/high16 v14, 0x40a80000    # 5.25f

    .line 310
    .line 311
    const/high16 v15, 0x40e00000    # 7.0f

    .line 312
    .line 313
    const/high16 v16, 0x41500000    # 13.0f

    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x405851ec    # 3.38f

    .line 319
    .line 320
    .line 321
    const v2, -0x3f74cccd    # -4.35f

    .line 322
    .line 323
    .line 324
    const v4, 0x3fd5c28f    # 1.67f

    .line 325
    .line 326
    .line 327
    const v6, -0x40133333    # -1.85f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x4195d70a    # 18.73f

    .line 334
    .line 335
    .line 336
    const/high16 v2, 0x41a80000    # 21.0f

    .line 337
    .line 338
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x3fb47ae1    # 1.41f

    .line 342
    .line 343
    .line 344
    const v2, -0x404b851f    # -1.41f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x40370a3d    # 2.86f

    .line 351
    .line 352
    .line 353
    const v2, 0x405a3d71    # 3.41f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x41970a3d    # 18.88f

    .line 363
    .line 364
    .line 365
    const/high16 v2, 0x41400000    # 12.0f

    .line 366
    .line 367
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, -0x3f60a3d7    # -4.98f

    .line 371
    .line 372
    .line 373
    const v18, -0x3ee68f5c    # -9.59f

    .line 374
    .line 375
    .line 376
    const v13, -0x3fff5c29    # -2.01f

    .line 377
    .line 378
    .line 379
    const v14, -0x3fdae148    # -2.58f

    .line 380
    .line 381
    .line 382
    const v15, -0x3f666666    # -4.8f

    .line 383
    .line 384
    .line 385
    const v16, -0x3f2851ec    # -6.74f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x40dd70a4    # 6.92f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x4007ae14    # -1.94f

    .line 398
    .line 399
    .line 400
    const v18, 0x402ae148    # 2.67f

    .line 401
    .line 402
    .line 403
    const v13, -0x40d9999a    # -0.65f

    .line 404
    .line 405
    .line 406
    const v14, 0x3f7ae148    # 0.98f

    .line 407
    .line 408
    .line 409
    const v15, -0x4055c28f    # -1.33f

    .line 410
    .line 411
    .line 412
    const v16, 0x3ff1eb85    # 1.89f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    const/16 v16, 0x3800

    .line 426
    .line 427
    const/16 v17, 0x0

    .line 428
    .line 429
    const/high16 v6, 0x3f800000    # 1.0f

    .line 430
    .line 431
    const/high16 v8, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/4 v7, 0x0

    .line 434
    const/high16 v9, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/high16 v12, 0x3f800000    # 1.0f

    .line 437
    .line 438
    const/4 v13, 0x0

    .line 439
    const/4 v14, 0x0

    .line 440
    const/4 v15, 0x0

    .line 441
    const-string v4, ""

    .line 442
    .line 443
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    sput-object v0, Landroidx/compose/material/icons/outlined/LocationOffKt;->_locationOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 452
    .line 453
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    return-object v0
.end method

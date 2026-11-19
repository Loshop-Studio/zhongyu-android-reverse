.class public final Landroidx/compose/material/icons/rounded/FlipCameraIosKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _flipCameraIos:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlipCameraIos(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FlipCameraIosKt;->_flipCameraIos:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FlipCameraIos"

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3fb51eb8    # -3.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v0, -0x406147ae    # -1.24f

    .line 84
    .line 85
    .line 86
    const v2, -0x40533333    # -1.35f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const v17, 0x4161eb85    # 14.12f

    .line 93
    .line 94
    .line 95
    const/high16 v18, 0x40400000    # 3.0f

    .line 96
    .line 97
    const v13, 0x4173851f    # 15.22f

    .line 98
    .line 99
    .line 100
    const v14, 0x404f5c29    # 3.24f

    .line 101
    .line 102
    .line 103
    const v15, 0x416ae148    # 14.68f

    .line 104
    .line 105
    .line 106
    const/high16 v16, 0x40400000    # 3.0f

    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x411e147b    # 9.88f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x40428f5c    # -1.48f

    .line 118
    .line 119
    .line 120
    const v18, 0x3f266666    # 0.65f

    .line 121
    .line 122
    .line 123
    const v13, -0x40f0a3d7    # -0.56f

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const v15, -0x40733333    # -1.1f

    .line 128
    .line 129
    .line 130
    const v16, 0x3e75c28f    # 0.24f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v0, 0x40e570a4    # 7.17f

    .line 137
    .line 138
    .line 139
    const/high16 v2, 0x40a00000    # 5.0f

    .line 140
    .line 141
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const/high16 v0, 0x40800000    # 4.0f

    .line 145
    .line 146
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, 0x40000000    # 2.0f

    .line 150
    .line 151
    const/high16 v18, 0x40e00000    # 7.0f

    .line 152
    .line 153
    const v13, 0x4039999a    # 2.9f

    .line 154
    .line 155
    .line 156
    const/high16 v14, 0x40a00000    # 5.0f

    .line 157
    .line 158
    const/high16 v15, 0x40000000    # 2.0f

    .line 159
    .line 160
    const v16, 0x40bccccd    # 5.9f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v0, 0x41400000    # 12.0f

    .line 167
    .line 168
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v18, 0x40000000    # 2.0f

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, 0x3f8ccccd    # 1.1f

    .line 175
    .line 176
    .line 177
    const v15, 0x3f666666    # 0.9f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x40000000    # 2.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x41800000    # 16.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v18, -0x40000000    # -2.0f

    .line 191
    .line 192
    const v13, 0x3f8ccccd    # 1.1f

    .line 193
    .line 194
    .line 195
    const/4 v14, 0x0

    .line 196
    const/high16 v15, 0x40000000    # 2.0f

    .line 197
    .line 198
    const v16, -0x4099999a    # -0.9f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x40e00000    # 7.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x41a00000    # 20.0f

    .line 210
    .line 211
    const/high16 v18, 0x40a00000    # 5.0f

    .line 212
    .line 213
    const/high16 v13, 0x41b00000    # 22.0f

    .line 214
    .line 215
    const v14, 0x40bccccd    # 5.9f

    .line 216
    .line 217
    .line 218
    const v15, 0x41a8cccd    # 21.1f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x40a00000    # 5.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x415ab852    # 13.67f

    .line 230
    .line 231
    .line 232
    const v2, 0x418d999a    # 17.7f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x41400000    # 12.0f

    .line 239
    .line 240
    const/high16 v18, 0x41900000    # 18.0f

    .line 241
    .line 242
    const v13, 0x41526666    # 13.15f

    .line 243
    .line 244
    .line 245
    const v14, 0x418f1eb8    # 17.89f

    .line 246
    .line 247
    .line 248
    const v15, 0x414970a4    # 12.59f

    .line 249
    .line 250
    .line 251
    const/high16 v16, 0x41900000    # 18.0f

    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v17, -0x3f600000    # -5.0f

    .line 257
    .line 258
    const/high16 v18, -0x3f600000    # -5.0f

    .line 259
    .line 260
    const v13, -0x3fcf5c29    # -2.76f

    .line 261
    .line 262
    .line 263
    const/4 v14, 0x0

    .line 264
    const/high16 v15, -0x3f600000    # -5.0f

    .line 265
    .line 266
    const v16, -0x3ff0a3d7    # -2.24f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v0, 0x40a00000    # 5.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v0, 0x40200000    # 2.5f

    .line 278
    .line 279
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41200000    # 10.0f

    .line 285
    .line 286
    const/high16 v2, 0x41500000    # 13.0f

    .line 287
    .line 288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v0, 0x41000000    # 8.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v17, 0x40800000    # 4.0f

    .line 297
    .line 298
    const/high16 v18, 0x40800000    # 4.0f

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    const v14, 0x400d70a4    # 2.21f

    .line 302
    .line 303
    .line 304
    const v15, 0x3fe51eb8    # 1.79f

    .line 305
    .line 306
    .line 307
    const/high16 v16, 0x40800000    # 4.0f

    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, 0x3fa8f5c3    # 1.32f

    .line 313
    .line 314
    .line 315
    const v18, -0x41947ae1    # -0.23f

    .line 316
    .line 317
    .line 318
    const v13, 0x3eeb851f    # 0.46f

    .line 319
    .line 320
    .line 321
    const/4 v14, 0x0

    .line 322
    const v15, 0x3f68f5c3    # 0.91f

    .line 323
    .line 324
    .line 325
    const v16, -0x425c28f6    # -0.08f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x3f07ae14    # 0.53f

    .line 332
    .line 333
    .line 334
    const v18, 0x3de147ae    # 0.11f

    .line 335
    .line 336
    .line 337
    const v13, 0x3e428f5c    # 0.19f

    .line 338
    .line 339
    .line 340
    const v14, -0x4270a3d7    # -0.07f

    .line 341
    .line 342
    .line 343
    const v15, 0x3ec7ae14    # 0.39f

    .line 344
    .line 345
    .line 346
    const v16, -0x430a3d71    # -0.03f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v17, 0x415ab852    # 13.67f

    .line 353
    .line 354
    .line 355
    const v18, 0x418d999a    # 17.7f

    .line 356
    .line 357
    .line 358
    const v13, 0x4161c28f    # 14.11f

    .line 359
    .line 360
    .line 361
    const v14, 0x41891eb8    # 17.14f

    .line 362
    .line 363
    .line 364
    const v15, 0x416028f6    # 14.01f

    .line 365
    .line 366
    .line 367
    const v16, 0x418c8f5c    # 17.57f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v0, 0x41780000    # 15.5f

    .line 377
    .line 378
    const/high16 v2, 0x41840000    # 16.5f

    .line 379
    .line 380
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x41600000    # 14.0f

    .line 384
    .line 385
    const/high16 v2, 0x41500000    # 13.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x40000000    # 2.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v17, -0x3f800000    # -4.0f

    .line 396
    .line 397
    const/high16 v18, -0x3f800000    # -4.0f

    .line 398
    .line 399
    const/4 v13, 0x0

    .line 400
    const v14, -0x3ff28f5c    # -2.21f

    .line 401
    .line 402
    .line 403
    const v15, -0x401ae148    # -1.79f

    .line 404
    .line 405
    .line 406
    const/high16 v16, -0x3f800000    # -4.0f

    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, -0x40570a3d    # -1.32f

    .line 412
    .line 413
    .line 414
    const v18, 0x3e6b851f    # 0.23f

    .line 415
    .line 416
    .line 417
    const v13, -0x41147ae1    # -0.46f

    .line 418
    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const v15, -0x40970a3d    # -0.91f

    .line 422
    .line 423
    .line 424
    const v16, 0x3da3d70a    # 0.08f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x40f851ec    # -0.53f

    .line 431
    .line 432
    .line 433
    const v18, -0x421eb852    # -0.11f

    .line 434
    .line 435
    .line 436
    const v13, -0x41bd70a4    # -0.19f

    .line 437
    .line 438
    .line 439
    const v14, 0x3d8f5c29    # 0.07f

    .line 440
    .line 441
    .line 442
    const v15, -0x413851ec    # -0.39f

    .line 443
    .line 444
    .line 445
    const v16, 0x3cf5c28f    # 0.03f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x412547ae    # 10.33f

    .line 452
    .line 453
    .line 454
    const v18, 0x4104cccd    # 8.3f

    .line 455
    .line 456
    .line 457
    const v13, 0x411e3d71    # 9.89f

    .line 458
    .line 459
    .line 460
    const v14, 0x410dc28f    # 8.86f

    .line 461
    .line 462
    .line 463
    const v15, 0x411fd70a    # 9.99f

    .line 464
    .line 465
    .line 466
    const v16, 0x4106e148    # 8.43f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, 0x41400000    # 12.0f

    .line 473
    .line 474
    const/high16 v18, 0x41000000    # 8.0f

    .line 475
    .line 476
    const v13, 0x412d999a    # 10.85f

    .line 477
    .line 478
    .line 479
    const v14, 0x4101c28f    # 8.11f

    .line 480
    .line 481
    .line 482
    const v15, 0x41368f5c    # 11.41f

    .line 483
    .line 484
    .line 485
    const/high16 v16, 0x41000000    # 8.0f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, 0x40a00000    # 5.0f

    .line 491
    .line 492
    const/high16 v18, 0x40a00000    # 5.0f

    .line 493
    .line 494
    const v13, 0x4030a3d7    # 2.76f

    .line 495
    .line 496
    .line 497
    const/4 v14, 0x0

    .line 498
    const/high16 v15, 0x40a00000    # 5.0f

    .line 499
    .line 500
    const v16, 0x400f5c29    # 2.24f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, 0x41780000    # 15.5f

    .line 510
    .line 511
    const/high16 v2, 0x41840000    # 16.5f

    .line 512
    .line 513
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    const/16 v16, 0x3800

    .line 524
    .line 525
    const/16 v17, 0x0

    .line 526
    .line 527
    const/high16 v6, 0x3f800000    # 1.0f

    .line 528
    .line 529
    const/high16 v8, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/4 v7, 0x0

    .line 532
    const/high16 v9, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/high16 v12, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/4 v13, 0x0

    .line 537
    const/4 v15, 0x0

    .line 538
    const-string v4, ""

    .line 539
    .line 540
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    sput-object v0, Landroidx/compose/material/icons/rounded/FlipCameraIosKt;->_flipCameraIos:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 549
    .line 550
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    return-object v0
.end method

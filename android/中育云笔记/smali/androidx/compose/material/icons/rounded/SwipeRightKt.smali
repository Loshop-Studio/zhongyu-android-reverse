.class public final Landroidx/compose/material/icons/rounded/SwipeRightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipeRight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeRight(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SwipeRightKt;->_swipeRight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SwipeRight"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x3f800000    # 1.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x401a3d71    # 2.41f

    .line 78
    .line 79
    .line 80
    const v18, 0x40bd70a4    # 5.92f

    .line 81
    .line 82
    .line 83
    const v13, 0x40e6147b    # 7.19f

    .line 84
    .line 85
    .line 86
    const/high16 v14, 0x3f800000    # 1.0f

    .line 87
    .line 88
    const v15, 0x406ccccd    # 3.7f

    .line 89
    .line 90
    .line 91
    const v16, 0x4058f5c3    # 3.39f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x4045c28f    # 3.09f

    .line 98
    .line 99
    .line 100
    const/high16 v18, 0x40e00000    # 7.0f

    .line 101
    .line 102
    const v13, 0x400a3d71    # 2.16f

    .line 103
    .line 104
    .line 105
    const v14, 0x40cd1eb8    # 6.41f

    .line 106
    .line 107
    .line 108
    const v15, 0x4021eb85    # 2.53f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x40e00000    # 7.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, 0x3f28f5c3    # 0.66f

    .line 117
    .line 118
    .line 119
    const v18, -0x41333333    # -0.4f

    .line 120
    .line 121
    .line 122
    const v13, 0x3e8f5c29    # 0.28f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, 0x3f0a3d71    # 0.54f

    .line 127
    .line 128
    .line 129
    const v16, -0x41e66666    # -0.15f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, 0x41400000    # 12.0f

    .line 136
    .line 137
    const/high16 v18, 0x40200000    # 2.5f

    .line 138
    .line 139
    const v13, 0x40975c29    # 4.73f

    .line 140
    .line 141
    .line 142
    const v14, 0x4096147b    # 4.69f

    .line 143
    .line 144
    .line 145
    const v15, 0x40f28f5c    # 7.58f

    .line 146
    .line 147
    .line 148
    const/high16 v16, 0x40200000    # 2.5f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v17, 0x40fd1eb8    # 7.91f

    .line 154
    .line 155
    .line 156
    const/high16 v18, 0x40400000    # 3.0f

    .line 157
    .line 158
    const v13, 0x4041eb85    # 3.03f

    .line 159
    .line 160
    .line 161
    const/4 v14, 0x0

    .line 162
    const v15, 0x40b947ae    # 5.79f

    .line 163
    .line 164
    .line 165
    const v16, 0x3f91eb85    # 1.14f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v0, -0x3ff5c28f    # -2.16f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x41880000    # 17.0f

    .line 178
    .line 179
    const/high16 v18, 0x40c80000    # 6.25f

    .line 180
    .line 181
    const v13, 0x418ab852    # 17.34f

    .line 182
    .line 183
    .line 184
    const/high16 v14, 0x40b00000    # 5.5f

    .line 185
    .line 186
    const/high16 v15, 0x41880000    # 17.0f

    .line 187
    .line 188
    const v16, 0x40bae148    # 5.84f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v0, 0x418ab852    # 17.34f

    .line 195
    .line 196
    .line 197
    const/high16 v2, 0x418e0000    # 17.75f

    .line 198
    .line 199
    const/high16 v4, 0x40e00000    # 7.0f

    .line 200
    .line 201
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41a80000    # 21.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/high16 v18, -0x40800000    # -1.0f

    .line 212
    .line 213
    const v13, 0x3f0ccccd    # 0.55f

    .line 214
    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    const/high16 v15, 0x3f800000    # 1.0f

    .line 218
    .line 219
    const v16, -0x4119999a    # -0.45f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, 0x40300000    # 2.75f

    .line 226
    .line 227
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x41aa0000    # 21.25f

    .line 231
    .line 232
    const/high16 v18, 0x40000000    # 2.0f

    .line 233
    .line 234
    const/high16 v13, 0x41b00000    # 22.0f

    .line 235
    .line 236
    const v14, 0x4015c28f    # 2.34f

    .line 237
    .line 238
    .line 239
    const v15, 0x41ad47ae    # 21.66f

    .line 240
    .line 241
    .line 242
    const/high16 v16, 0x40000000    # 2.0f

    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, 0x4015c28f    # 2.34f

    .line 248
    .line 249
    .line 250
    const/high16 v2, 0x41a40000    # 20.5f

    .line 251
    .line 252
    const/high16 v4, 0x40300000    # 2.75f

    .line 253
    .line 254
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v0, 0x3fa28f5c    # 1.27f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, 0x41400000    # 12.0f

    .line 264
    .line 265
    const/high16 v18, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const v13, 0x419170a4    # 18.18f

    .line 268
    .line 269
    .line 270
    const v14, 0x400851ec    # 2.13f

    .line 271
    .line 272
    .line 273
    const v15, 0x4173851f    # 15.22f

    .line 274
    .line 275
    .line 276
    const/high16 v16, 0x3f800000    # 1.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x40a66666    # 5.2f

    .line 285
    .line 286
    .line 287
    const v2, 0x418b70a4    # 17.43f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, 0x3f9eb852    # 1.24f

    .line 294
    .line 295
    .line 296
    const v18, -0x40828f5c    # -0.99f

    .line 297
    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    const v14, -0x40d9999a    # -0.65f

    .line 301
    .line 302
    .line 303
    const v15, 0x3f19999a    # 0.6f

    .line 304
    .line 305
    .line 306
    const v16, -0x406f5c29    # -1.13f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const/high16 v0, 0x41200000    # 10.0f

    .line 313
    .line 314
    const v2, 0x4189eb85    # 17.24f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x40d00000    # 6.5f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x41380000    # 11.5f

    .line 326
    .line 327
    const/high16 v18, 0x40a00000    # 5.0f

    .line 328
    .line 329
    const/high16 v13, 0x41200000    # 10.0f

    .line 330
    .line 331
    const v14, 0x40b570a4    # 5.67f

    .line 332
    .line 333
    .line 334
    const v15, 0x412ab852    # 10.67f

    .line 335
    .line 336
    .line 337
    const/high16 v16, 0x40a00000    # 5.0f

    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x40b570a4    # 5.67f

    .line 343
    .line 344
    .line 345
    const/high16 v2, 0x41500000    # 13.0f

    .line 346
    .line 347
    const/high16 v4, 0x40d00000    # 6.5f

    .line 348
    .line 349
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x40c00000    # 6.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x3f68f5c3    # 0.91f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, 0x3f63d70a    # 0.89f

    .line 364
    .line 365
    .line 366
    const v18, 0x3e570a3d    # 0.21f

    .line 367
    .line 368
    .line 369
    const v13, 0x3e9eb852    # 0.31f

    .line 370
    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const v15, 0x3f1eb852    # 0.62f

    .line 374
    .line 375
    .line 376
    const v16, 0x3d8f5c29    # 0.07f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x4082e148    # 4.09f

    .line 383
    .line 384
    .line 385
    const v2, 0x40028f5c    # 2.04f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x3f8b851f    # 1.09f

    .line 392
    .line 393
    .line 394
    const v18, 0x40047ae1    # 2.07f

    .line 395
    .line 396
    .line 397
    const v13, 0x3f451eb8    # 0.77f

    .line 398
    .line 399
    .line 400
    const v14, 0x3ec28f5c    # 0.38f

    .line 401
    .line 402
    .line 403
    const v15, 0x3f9ae148    # 1.21f

    .line 404
    .line 405
    .line 406
    const v16, 0x3f9c28f6    # 1.22f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, -0x40deb852    # -0.63f

    .line 413
    .line 414
    .line 415
    const v2, 0x408eb852    # 4.46f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x418af5c3    # 17.37f

    .line 422
    .line 423
    .line 424
    const/high16 v18, 0x41b80000    # 23.0f

    .line 425
    .line 426
    const v13, 0x4199ae14    # 19.21f

    .line 427
    .line 428
    .line 429
    const v14, 0x41b228f6    # 22.27f

    .line 430
    .line 431
    .line 432
    const v15, 0x4192e148    # 18.36f

    .line 433
    .line 434
    .line 435
    const/high16 v16, 0x41b80000    # 23.0f

    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, -0x3f3ae148    # -6.16f

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, -0x402b851f    # -1.66f

    .line 447
    .line 448
    .line 449
    const v18, -0x40e8f5c3    # -0.59f

    .line 450
    .line 451
    .line 452
    const v13, -0x40f851ec    # -0.53f

    .line 453
    .line 454
    .line 455
    const/4 v14, 0x0

    .line 456
    const v15, -0x405ae148    # -1.29f

    .line 457
    .line 458
    .line 459
    const v16, -0x41a8f5c3    # -0.21f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, -0x3f7dc28f    # -4.07f

    .line 466
    .line 467
    .line 468
    const v2, -0x3f76b852    # -4.29f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x40a66666    # 5.2f

    .line 475
    .line 476
    .line 477
    const v18, 0x418b70a4    # 17.43f

    .line 478
    .line 479
    .line 480
    const v13, 0x40a9999a    # 5.3f

    .line 481
    .line 482
    .line 483
    const v14, 0x418f851f    # 17.94f

    .line 484
    .line 485
    .line 486
    const v15, 0x40a66666    # 5.2f

    .line 487
    .line 488
    .line 489
    const v16, 0x418d851f    # 17.69f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    const/16 v16, 0x3800

    .line 503
    .line 504
    const/16 v17, 0x0

    .line 505
    .line 506
    const/high16 v6, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const/high16 v8, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/4 v7, 0x0

    .line 511
    const/high16 v9, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const/high16 v12, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/4 v13, 0x0

    .line 516
    const/4 v14, 0x0

    .line 517
    const/4 v15, 0x0

    .line 518
    const-string v4, ""

    .line 519
    .line 520
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    sput-object v0, Landroidx/compose/material/icons/rounded/SwipeRightKt;->_swipeRight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 529
    .line 530
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    return-object v0
.end method

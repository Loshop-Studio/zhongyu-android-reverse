.class public final Landroidx/compose/material/icons/rounded/SwipeVerticalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipeVertical:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeVertical(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SwipeVerticalKt;->_swipeVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SwipeVertical"

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
    const/4 v0, 0x0

    .line 71
    const/high16 v2, 0x41400000    # 12.0f

    .line 72
    .line 73
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v17, 0x404147ae    # 3.02f

    .line 77
    .line 78
    .line 79
    const/high16 v18, 0x41080000    # 8.5f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x404e147b    # 3.22f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f90a3d7    # 1.13f

    .line 86
    .line 87
    .line 88
    const v16, 0x40c5c28f    # 6.18f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 95
    .line 96
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v17, 0x3f800000    # 1.0f

    .line 100
    .line 101
    const/high16 v18, 0x41aa0000    # 21.25f

    .line 102
    .line 103
    const v13, 0x3fab851f    # 1.34f

    .line 104
    .line 105
    .line 106
    const/high16 v14, 0x41a40000    # 20.5f

    .line 107
    .line 108
    const/high16 v15, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const v16, 0x41a6b852    # 20.84f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v0, 0x41b00000    # 22.0f

    .line 117
    .line 118
    const v2, 0x3fab851f    # 1.34f

    .line 119
    .line 120
    .line 121
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 122
    .line 123
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v0, 0x40a00000    # 5.0f

    .line 127
    .line 128
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v18, -0x40800000    # -1.0f

    .line 132
    .line 133
    const v13, 0x3f0ccccd    # 0.55f

    .line 134
    .line 135
    .line 136
    const/4 v14, 0x0

    .line 137
    const v16, -0x4119999a    # -0.45f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, -0x3fb00000    # -3.25f

    .line 144
    .line 145
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v17, 0x40a80000    # 5.25f

    .line 149
    .line 150
    const/high16 v18, 0x41880000    # 17.0f

    .line 151
    .line 152
    const/high16 v13, 0x40c00000    # 6.0f

    .line 153
    .line 154
    const v14, 0x418ab852    # 17.34f

    .line 155
    .line 156
    .line 157
    const v15, 0x40b51eb8    # 5.66f

    .line 158
    .line 159
    .line 160
    const/high16 v16, 0x41880000    # 17.0f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, -0x40c00000    # -0.75f

    .line 166
    .line 167
    const/high16 v18, 0x3f400000    # 0.75f

    .line 168
    .line 169
    const v13, -0x412e147b    # -0.41f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const/high16 v15, -0x40c00000    # -0.75f

    .line 174
    .line 175
    const v16, 0x3eae147b    # 0.34f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x400a3d71    # 2.16f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 188
    .line 189
    const v18, -0x3f02e148    # -7.91f

    .line 190
    .line 191
    .line 192
    const v13, -0x4011eb85    # -1.86f

    .line 193
    .line 194
    .line 195
    const v14, -0x3ff8f5c3    # -2.11f

    .line 196
    .line 197
    .line 198
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 199
    .line 200
    const v16, -0x3f63d70a    # -4.88f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v0, -0x3f46b852    # -5.79f

    .line 207
    .line 208
    .line 209
    const v2, -0x3f02e148    # -7.91f

    .line 210
    .line 211
    .line 212
    const/high16 v4, 0x40400000    # 3.0f

    .line 213
    .line 214
    const v6, 0x3f91eb85    # 1.14f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x400a3d71    # 2.16f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, 0x40a80000    # 5.25f

    .line 227
    .line 228
    const/high16 v18, 0x40e00000    # 7.0f

    .line 229
    .line 230
    const/high16 v13, 0x40900000    # 4.5f

    .line 231
    .line 232
    const v14, 0x40d51eb8    # 6.66f

    .line 233
    .line 234
    .line 235
    const v15, 0x409ae148    # 4.84f

    .line 236
    .line 237
    .line 238
    const/high16 v16, 0x40e00000    # 7.0f

    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x40c00000    # 6.0f

    .line 244
    .line 245
    const/high16 v18, 0x40c80000    # 6.25f

    .line 246
    .line 247
    const v13, 0x40b51eb8    # 5.66f

    .line 248
    .line 249
    .line 250
    const/high16 v14, 0x40e00000    # 7.0f

    .line 251
    .line 252
    const/high16 v15, 0x40c00000    # 6.0f

    .line 253
    .line 254
    const v16, 0x40d51eb8    # 6.66f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x40400000    # 3.0f

    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, -0x40800000    # -1.0f

    .line 266
    .line 267
    const/high16 v18, -0x40800000    # -1.0f

    .line 268
    .line 269
    const/4 v13, 0x0

    .line 270
    const v14, -0x40f33333    # -0.55f

    .line 271
    .line 272
    .line 273
    const v15, -0x4119999a    # -0.45f

    .line 274
    .line 275
    .line 276
    const/high16 v16, -0x40800000    # -1.0f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v0, 0x3fe00000    # 1.75f

    .line 282
    .line 283
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, 0x3f800000    # 1.0f

    .line 287
    .line 288
    const/high16 v18, 0x40300000    # 2.75f

    .line 289
    .line 290
    const v13, 0x3fab851f    # 1.34f

    .line 291
    .line 292
    .line 293
    const/high16 v14, 0x40000000    # 2.0f

    .line 294
    .line 295
    const/high16 v15, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const v16, 0x4015c28f    # 2.34f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x40600000    # 3.5f

    .line 304
    .line 305
    const v2, 0x3fab851f    # 1.34f

    .line 306
    .line 307
    .line 308
    const/high16 v4, 0x3fe00000    # 1.75f

    .line 309
    .line 310
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x3fa28f5c    # 1.27f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/16 v17, 0x0

    .line 320
    .line 321
    const/high16 v18, 0x41400000    # 12.0f

    .line 322
    .line 323
    const v13, 0x3f90a3d7    # 1.13f

    .line 324
    .line 325
    .line 326
    const v14, 0x40ba3d71    # 5.82f

    .line 327
    .line 328
    .line 329
    const/4 v15, 0x0

    .line 330
    const v16, 0x410c7ae1    # 8.78f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, 0x410d47ae    # 8.83f

    .line 340
    .line 341
    .line 342
    const v2, 0x4198cccd    # 19.1f

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3f3ae148    # 0.73f

    .line 349
    .line 350
    .line 351
    const v18, -0x404b851f    # -1.41f

    .line 352
    .line 353
    .line 354
    const v13, -0x417ae148    # -0.26f

    .line 355
    .line 356
    .line 357
    const v14, -0x40e66666    # -0.6f

    .line 358
    .line 359
    .line 360
    const v15, 0x3db851ec    # 0.09f

    .line 361
    .line 362
    .line 363
    const v16, -0x405c28f6    # -1.28f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x40651eb8    # 3.58f

    .line 370
    .line 371
    .line 372
    const v2, -0x40ca3d71    # -0.71f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x410ca3d7    # 8.79f

    .line 379
    .line 380
    .line 381
    const v2, 0x40e570a4    # 7.17f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, 0x3f428f5c    # 0.76f

    .line 388
    .line 389
    .line 390
    const v18, -0x40028f5c    # -1.98f

    .line 391
    .line 392
    .line 393
    const v13, -0x4151eb85    # -0.34f

    .line 394
    .line 395
    .line 396
    const v14, -0x40bd70a4    # -0.76f

    .line 397
    .line 398
    .line 399
    const/4 v15, 0x0

    .line 400
    const v16, -0x402e147b    # -1.64f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v17, 0x3ffd70a4    # 1.98f

    .line 407
    .line 408
    .line 409
    const v18, 0x3f428f5c    # 0.76f

    .line 410
    .line 411
    .line 412
    const v13, 0x3f428f5c    # 0.76f

    .line 413
    .line 414
    .line 415
    const v14, -0x4151eb85    # -0.34f

    .line 416
    .line 417
    .line 418
    const v15, 0x3fd1eb85    # 1.64f

    .line 419
    .line 420
    .line 421
    const/16 v16, 0x0

    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v0, 0x401b851f    # 2.43f

    .line 427
    .line 428
    .line 429
    const v2, 0x40afae14    # 5.49f

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v0, 0x3f570a3d    # 0.84f

    .line 436
    .line 437
    .line 438
    const v2, -0x41428f5c    # -0.37f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3f666666    # 0.9f

    .line 445
    .line 446
    .line 447
    const v18, -0x41d1eb85    # -0.17f

    .line 448
    .line 449
    .line 450
    const v13, 0x3e8f5c29    # 0.28f

    .line 451
    .line 452
    .line 453
    const v14, -0x41fae148    # -0.13f

    .line 454
    .line 455
    .line 456
    const v15, 0x3f170a3d    # 0.59f

    .line 457
    .line 458
    .line 459
    const v16, -0x41c7ae14    # -0.18f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x4091eb85    # 4.56f

    .line 466
    .line 467
    .line 468
    const v2, 0x3e570a3d    # 0.21f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x3fea3d71    # 1.83f

    .line 475
    .line 476
    .line 477
    const v18, 0x3fb9999a    # 1.45f

    .line 478
    .line 479
    .line 480
    const v13, 0x3f5c28f6    # 0.86f

    .line 481
    .line 482
    .line 483
    const v14, 0x3d23d70a    # 0.04f

    .line 484
    .line 485
    .line 486
    const v15, 0x3fcccccd    # 1.6f

    .line 487
    .line 488
    .line 489
    const v16, 0x3f2147ae    # 0.63f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v0, 0x3f9d70a4    # 1.23f

    .line 496
    .line 497
    .line 498
    const v2, 0x408a8f5c    # 4.33f

    .line 499
    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, -0x4071eb85    # -1.11f

    .line 505
    .line 506
    .line 507
    const v18, 0x4017ae14    # 2.37f

    .line 508
    .line 509
    .line 510
    const v13, 0x3e8a3d71    # 0.27f

    .line 511
    .line 512
    .line 513
    const v14, 0x3f75c28f    # 0.96f

    .line 514
    .line 515
    .line 516
    const v15, -0x41b33333    # -0.2f

    .line 517
    .line 518
    .line 519
    const v16, 0x3ffc28f6    # 1.97f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, -0x3f4bd70a    # -5.63f

    .line 526
    .line 527
    .line 528
    const v2, 0x401f5c29    # 2.49f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v17, -0x401eb852    # -1.76f

    .line 535
    .line 536
    .line 537
    const v18, 0x3e0f5c29    # 0.14f

    .line 538
    .line 539
    .line 540
    const v13, -0x410a3d71    # -0.48f

    .line 541
    .line 542
    .line 543
    const v14, 0x3e570a3d    # 0.21f

    .line 544
    .line 545
    .line 546
    const v15, -0x405eb852    # -1.26f

    .line 547
    .line 548
    .line 549
    const v16, 0x3ea8f5c3    # 0.33f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v0, -0x3f51999a    # -5.45f

    .line 556
    .line 557
    .line 558
    const v2, -0x3feeb852    # -2.27f

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const v17, 0x410d47ae    # 8.83f

    .line 565
    .line 566
    .line 567
    const v18, 0x4198cccd    # 19.1f

    .line 568
    .line 569
    .line 570
    const v13, 0x4112147b    # 9.13f

    .line 571
    .line 572
    .line 573
    const v14, 0x419c3d71    # 19.53f

    .line 574
    .line 575
    .line 576
    const v15, 0x410ee148    # 8.93f

    .line 577
    .line 578
    .line 579
    const v16, 0x419ab852    # 19.34f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    const/16 v16, 0x3800

    .line 593
    .line 594
    const/16 v17, 0x0

    .line 595
    .line 596
    const/high16 v6, 0x3f800000    # 1.0f

    .line 597
    .line 598
    const/high16 v8, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/4 v7, 0x0

    .line 601
    const/high16 v9, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/high16 v12, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    const/4 v14, 0x0

    .line 607
    const/4 v15, 0x0

    .line 608
    const-string v4, ""

    .line 609
    .line 610
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    sput-object v0, Landroidx/compose/material/icons/rounded/SwipeVerticalKt;->_swipeVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 619
    .line 620
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    return-object v0
.end method

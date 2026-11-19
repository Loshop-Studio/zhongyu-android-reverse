.class public final Landroidx/compose/material/icons/rounded/SwipeUpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipeUp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipeUp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SwipeUpKt;->_swipeUp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SwipeUp"

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
    const v0, 0x410d47ae    # 8.83f

    .line 71
    .line 72
    .line 73
    const v2, 0x4198cccd    # 19.1f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3f3ae148    # 0.73f

    .line 80
    .line 81
    .line 82
    const v18, -0x404b851f    # -1.41f

    .line 83
    .line 84
    .line 85
    const v13, -0x417ae148    # -0.26f

    .line 86
    .line 87
    .line 88
    const v14, -0x40e66666    # -0.6f

    .line 89
    .line 90
    .line 91
    const v15, 0x3db851ec    # 0.09f

    .line 92
    .line 93
    .line 94
    const v16, -0x405c28f6    # -1.28f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x40651eb8    # 3.58f

    .line 101
    .line 102
    .line 103
    const v2, -0x40ca3d71    # -0.71f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, 0x410ca3d7    # 8.79f

    .line 110
    .line 111
    .line 112
    const v2, 0x40e570a4    # 7.17f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x3f428f5c    # 0.76f

    .line 119
    .line 120
    .line 121
    const v18, -0x40028f5c    # -1.98f

    .line 122
    .line 123
    .line 124
    const v13, -0x4151eb85    # -0.34f

    .line 125
    .line 126
    .line 127
    const v14, -0x40bd70a4    # -0.76f

    .line 128
    .line 129
    .line 130
    const/4 v15, 0x0

    .line 131
    const v16, -0x402e147b    # -1.64f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, 0x3ffd70a4    # 1.98f

    .line 138
    .line 139
    .line 140
    const v18, 0x3f428f5c    # 0.76f

    .line 141
    .line 142
    .line 143
    const v13, 0x3f428f5c    # 0.76f

    .line 144
    .line 145
    .line 146
    const v14, -0x4151eb85    # -0.34f

    .line 147
    .line 148
    .line 149
    const v15, 0x3fd1eb85    # 1.64f

    .line 150
    .line 151
    .line 152
    const/16 v16, 0x0

    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, 0x401b851f    # 2.43f

    .line 158
    .line 159
    .line 160
    const v2, 0x40afae14    # 5.49f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x3f570a3d    # 0.84f

    .line 167
    .line 168
    .line 169
    const v2, -0x41428f5c    # -0.37f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, 0x3f666666    # 0.9f

    .line 176
    .line 177
    .line 178
    const v18, -0x41d1eb85    # -0.17f

    .line 179
    .line 180
    .line 181
    const v13, 0x3e8f5c29    # 0.28f

    .line 182
    .line 183
    .line 184
    const v14, -0x41fae148    # -0.13f

    .line 185
    .line 186
    .line 187
    const v15, 0x3f170a3d    # 0.59f

    .line 188
    .line 189
    .line 190
    const v16, -0x41c7ae14    # -0.18f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x4091eb85    # 4.56f

    .line 197
    .line 198
    .line 199
    const v2, 0x3e570a3d    # 0.21f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x3fea3d71    # 1.83f

    .line 206
    .line 207
    .line 208
    const v18, 0x3fb9999a    # 1.45f

    .line 209
    .line 210
    .line 211
    const v13, 0x3f5c28f6    # 0.86f

    .line 212
    .line 213
    .line 214
    const v14, 0x3d23d70a    # 0.04f

    .line 215
    .line 216
    .line 217
    const v15, 0x3fcccccd    # 1.6f

    .line 218
    .line 219
    .line 220
    const v16, 0x3f2147ae    # 0.63f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x3f9d70a4    # 1.23f

    .line 227
    .line 228
    .line 229
    const v2, 0x408a8f5c    # 4.33f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x4071eb85    # -1.11f

    .line 236
    .line 237
    .line 238
    const v18, 0x4017ae14    # 2.37f

    .line 239
    .line 240
    .line 241
    const v13, 0x3e8a3d71    # 0.27f

    .line 242
    .line 243
    .line 244
    const v14, 0x3f75c28f    # 0.96f

    .line 245
    .line 246
    .line 247
    const v15, -0x41b33333    # -0.2f

    .line 248
    .line 249
    .line 250
    const v16, 0x3ffc28f6    # 1.97f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, -0x3f4bd70a    # -5.63f

    .line 257
    .line 258
    .line 259
    const v2, 0x401f5c29    # 2.49f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, -0x401eb852    # -1.76f

    .line 266
    .line 267
    .line 268
    const v18, 0x3e0f5c29    # 0.14f

    .line 269
    .line 270
    .line 271
    const v13, -0x410a3d71    # -0.48f

    .line 272
    .line 273
    .line 274
    const v14, 0x3e570a3d    # 0.21f

    .line 275
    .line 276
    .line 277
    const v15, -0x405eb852    # -1.26f

    .line 278
    .line 279
    .line 280
    const v16, 0x3ea8f5c3    # 0.33f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, -0x3f51999a    # -5.45f

    .line 287
    .line 288
    .line 289
    const v2, -0x3feeb852    # -2.27f

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v17, 0x410d47ae    # 8.83f

    .line 296
    .line 297
    .line 298
    const v18, 0x4198cccd    # 19.1f

    .line 299
    .line 300
    .line 301
    const v13, 0x4112147b    # 9.13f

    .line 302
    .line 303
    .line 304
    const v14, 0x419c3d71    # 19.53f

    .line 305
    .line 306
    .line 307
    const v15, 0x410ee148    # 8.93f

    .line 308
    .line 309
    .line 310
    const v16, 0x419ab852    # 19.34f

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v0, 0x40d80000    # 6.75f

    .line 320
    .line 321
    const v2, 0x4156147b    # 13.38f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3db851ec    # 0.09f

    .line 328
    .line 329
    .line 330
    const v18, -0x408ccccd    # -0.95f

    .line 331
    .line 332
    .line 333
    const v13, 0x3e851eb8    # 0.26f

    .line 334
    .line 335
    .line 336
    const v14, -0x417ae148    # -0.26f

    .line 337
    .line 338
    .line 339
    const v15, 0x3e947ae1    # 0.29f

    .line 340
    .line 341
    .line 342
    const v16, -0x40d70a3d    # -0.66f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, 0x40a00000    # 5.0f

    .line 349
    .line 350
    const/high16 v18, 0x40d00000    # 6.5f

    .line 351
    .line 352
    const v13, 0x40b5c28f    # 5.68f

    .line 353
    .line 354
    .line 355
    const v14, 0x412bd70a    # 10.74f

    .line 356
    .line 357
    .line 358
    const/high16 v15, 0x40a00000    # 5.0f

    .line 359
    .line 360
    const v16, 0x410b3333    # 8.7f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, 0x3ea3d70a    # 0.32f

    .line 367
    .line 368
    .line 369
    const v18, -0x3fdc28f6    # -2.56f

    .line 370
    .line 371
    .line 372
    const/4 v13, 0x0

    .line 373
    const v14, -0x409eb852    # -0.88f

    .line 374
    .line 375
    .line 376
    const v15, 0x3de147ae    # 0.11f

    .line 377
    .line 378
    .line 379
    const v16, -0x402147ae    # -1.74f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, 0x3f8b851f    # 1.09f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x3f8a3d71    # 1.08f

    .line 392
    .line 393
    .line 394
    const v18, -0x435c28f6    # -0.02f

    .line 395
    .line 396
    .line 397
    const v13, 0x3e99999a    # 0.3f

    .line 398
    .line 399
    .line 400
    const v14, 0x3e99999a    # 0.3f

    .line 401
    .line 402
    .line 403
    const v15, 0x3f4a3d71    # 0.79f

    .line 404
    .line 405
    .line 406
    const v16, 0x3e947ae1    # 0.29f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, -0x42dc28f6    # -0.04f

    .line 413
    .line 414
    .line 415
    const v18, -0x40770a3d    # -1.07f

    .line 416
    .line 417
    .line 418
    const v13, 0x3e8f5c29    # 0.28f

    .line 419
    .line 420
    .line 421
    const v14, -0x41666666    # -0.3f

    .line 422
    .line 423
    .line 424
    const/high16 v15, 0x3e800000    # 0.25f

    .line 425
    .line 426
    const v16, -0x40b851ec    # -0.78f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x40a6b852    # 5.21f

    .line 433
    .line 434
    .line 435
    const v2, 0x3fdae148    # 1.71f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, -0x404b851f    # -1.41f

    .line 442
    .line 443
    .line 444
    const/16 v18, 0x0

    .line 445
    .line 446
    const v13, -0x413851ec    # -0.39f

    .line 447
    .line 448
    .line 449
    const v14, -0x413851ec    # -0.39f

    .line 450
    .line 451
    .line 452
    const v15, -0x407d70a4    # -1.02f

    .line 453
    .line 454
    .line 455
    const v16, -0x413851ec    # -0.39f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x3fc3d70a    # 1.53f

    .line 462
    .line 463
    .line 464
    const v2, 0x407e147b    # 3.97f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x3ca3d70a    # 0.02f

    .line 471
    .line 472
    .line 473
    const v18, 0x3f8a3d71    # 1.08f

    .line 474
    .line 475
    .line 476
    const v13, -0x41666666    # -0.3f

    .line 477
    .line 478
    .line 479
    const v14, 0x3e99999a    # 0.3f

    .line 480
    .line 481
    .line 482
    const v15, -0x416b851f    # -0.29f

    .line 483
    .line 484
    .line 485
    const v16, 0x3f4a3d71    # 0.79f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x3f88f5c3    # 1.07f

    .line 492
    .line 493
    .line 494
    const v18, -0x42dc28f6    # -0.04f

    .line 495
    .line 496
    .line 497
    const v13, 0x3e99999a    # 0.3f

    .line 498
    .line 499
    .line 500
    const v14, 0x3e8f5c29    # 0.28f

    .line 501
    .line 502
    .line 503
    const v15, 0x3f47ae14    # 0.78f

    .line 504
    .line 505
    .line 506
    const/high16 v16, 0x3e800000    # 0.25f

    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v0, 0x40733333    # 3.8f

    .line 512
    .line 513
    .line 514
    const v2, 0x40747ae1    # 3.82f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v17, 0x40600000    # 3.5f

    .line 521
    .line 522
    const/high16 v18, 0x40d00000    # 6.5f

    .line 523
    .line 524
    const v13, 0x40666666    # 3.6f

    .line 525
    .line 526
    .line 527
    const v14, 0x4095c28f    # 4.68f

    .line 528
    .line 529
    .line 530
    const/high16 v15, 0x40600000    # 3.5f

    .line 531
    .line 532
    const v16, 0x40b28f5c    # 5.58f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x4005c28f    # 2.09f

    .line 539
    .line 540
    .line 541
    const v18, 0x40d8a3d7    # 6.77f

    .line 542
    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    const v14, 0x4020a3d7    # 2.51f

    .line 546
    .line 547
    .line 548
    const v15, 0x3f451eb8    # 0.77f

    .line 549
    .line 550
    .line 551
    const v16, 0x409b3333    # 4.85f

    .line 552
    .line 553
    .line 554
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v17, 0x40d80000    # 6.75f

    .line 558
    .line 559
    const v18, 0x4156147b    # 13.38f

    .line 560
    .line 561
    .line 562
    const v13, 0x40bb851f    # 5.86f

    .line 563
    .line 564
    .line 565
    const v14, 0x415a8f5c    # 13.66f

    .line 566
    .line 567
    .line 568
    const v15, 0x40cd1eb8    # 6.41f

    .line 569
    .line 570
    .line 571
    const v16, 0x415b851f    # 13.72f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    const/16 v16, 0x3800

    .line 585
    .line 586
    const/16 v17, 0x0

    .line 587
    .line 588
    const/high16 v6, 0x3f800000    # 1.0f

    .line 589
    .line 590
    const/high16 v8, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/4 v7, 0x0

    .line 593
    const/high16 v9, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const/high16 v12, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v13, 0x0

    .line 598
    const/4 v14, 0x0

    .line 599
    const/4 v15, 0x0

    .line 600
    const-string v4, ""

    .line 601
    .line 602
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    sput-object v0, Landroidx/compose/material/icons/rounded/SwipeUpKt;->_swipeUp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 611
    .line 612
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/SailingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sailing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSailing(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SailingKt;->_sailing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Sailing"

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
    const/high16 v0, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v2, 0x41500000    # 13.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x4065c28f    # 3.59f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x40970a3d    # -0.91f

    .line 84
    .line 85
    .line 86
    const v18, -0x416b851f    # -0.29f

    .line 87
    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, -0x41051eb8    # -0.49f

    .line 91
    .line 92
    .line 93
    const v15, -0x40deb852    # -0.63f

    .line 94
    .line 95
    .line 96
    const v16, -0x40cf5c29    # -0.69f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3f2eb852    # -6.54f

    .line 103
    .line 104
    .line 105
    const v2, 0x41168f5c    # 9.41f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x3ed1eb85    # 0.41f

    .line 112
    .line 113
    .line 114
    const v18, 0x3f4a3d71    # 0.79f

    .line 115
    .line 116
    .line 117
    const v13, -0x41947ae1    # -0.23f

    .line 118
    .line 119
    .line 120
    const v14, 0x3ea8f5c3    # 0.33f

    .line 121
    .line 122
    .line 123
    const v15, 0x3c23d70a    # 0.01f

    .line 124
    .line 125
    .line 126
    const v16, 0x3f4a3d71    # 0.79f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v0, 0x40d147ae    # 6.54f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x41300000    # 11.0f

    .line 139
    .line 140
    const/high16 v18, 0x41500000    # 13.0f

    .line 141
    .line 142
    const v13, 0x412c7ae1    # 10.78f

    .line 143
    .line 144
    .line 145
    const/high16 v14, 0x41580000    # 13.5f

    .line 146
    .line 147
    const/high16 v15, 0x41300000    # 11.0f

    .line 148
    .line 149
    const v16, 0x41547ae1    # 13.28f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x41a7eb85    # 20.99f

    .line 159
    .line 160
    .line 161
    const v2, 0x414fae14    # 12.98f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, 0x41566666    # 13.4f

    .line 168
    .line 169
    .line 170
    const v18, 0x3f9d70a4    # 1.23f

    .line 171
    .line 172
    .line 173
    const v13, 0x41a5c28f    # 20.72f

    .line 174
    .line 175
    .line 176
    const v14, 0x40e23d71    # 7.07f

    .line 177
    .line 178
    .line 179
    const v15, 0x417e6666    # 15.9f

    .line 180
    .line 181
    .line 182
    const v16, 0x40147ae1    # 2.32f

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, -0x40d47ae1    # -0.67f

    .line 189
    .line 190
    .line 191
    const v18, 0x3f170a3d    # 0.59f

    .line 192
    .line 193
    .line 194
    const v13, -0x41428f5c    # -0.37f

    .line 195
    .line 196
    .line 197
    const v14, -0x41dc28f6    # -0.16f

    .line 198
    .line 199
    .line 200
    const v15, -0x40bae148    # -0.77f

    .line 201
    .line 202
    .line 203
    const v16, 0x3e4ccccd    # 0.2f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, 0x3f428f5c    # 0.76f

    .line 210
    .line 211
    .line 212
    const v18, 0x40b5c28f    # 5.68f

    .line 213
    .line 214
    .line 215
    const v13, 0x3e99999a    # 0.3f

    .line 216
    .line 217
    .line 218
    const v14, 0x3f90a3d7    # 1.13f

    .line 219
    .line 220
    .line 221
    const v15, 0x3f428f5c    # 0.76f

    .line 222
    .line 223
    .line 224
    const v16, 0x4051eb85    # 3.28f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, -0x40b851ec    # -0.78f

    .line 231
    .line 232
    .line 233
    const v18, 0x40ab3333    # 5.35f

    .line 234
    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    const v14, 0x401c28f6    # 2.44f

    .line 238
    .line 239
    .line 240
    const v15, -0x41051eb8    # -0.49f

    .line 241
    .line 242
    .line 243
    const v16, 0x408c7ae1    # 4.39f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x3ef5c28f    # 0.48f

    .line 250
    .line 251
    .line 252
    const v18, 0x3f266666    # 0.65f

    .line 253
    .line 254
    .line 255
    const v13, -0x42333333    # -0.1f

    .line 256
    .line 257
    .line 258
    const v14, 0x3ea3d70a    # 0.32f

    .line 259
    .line 260
    .line 261
    const v15, 0x3e0f5c29    # 0.14f

    .line 262
    .line 263
    .line 264
    const v16, 0x3f266666    # 0.65f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, 0x40e8f5c3    # 7.28f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v17, 0x41a7eb85    # 20.99f

    .line 277
    .line 278
    .line 279
    const v18, 0x414fae14    # 12.98f

    .line 280
    .line 281
    .line 282
    const v13, 0x41a6147b    # 20.76f

    .line 283
    .line 284
    .line 285
    const/high16 v14, 0x41580000    # 13.5f

    .line 286
    .line 287
    const/high16 v15, 0x41a80000    # 21.0f

    .line 288
    .line 289
    const v16, 0x415428f6    # 13.26f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, 0x41a4f5c3    # 20.62f

    .line 299
    .line 300
    .line 301
    const/high16 v2, 0x41700000    # 15.0f

    .line 302
    .line 303
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x405851ec    # 3.38f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v17, -0x40947ae1    # -0.92f

    .line 313
    .line 314
    .line 315
    const v18, 0x3fb5c28f    # 1.42f

    .line 316
    .line 317
    .line 318
    const v13, -0x40c51eb8    # -0.73f

    .line 319
    .line 320
    .line 321
    const/4 v14, 0x0

    .line 322
    const v15, -0x4063d70a    # -1.22f

    .line 323
    .line 324
    .line 325
    const v16, 0x3f428f5c    # 0.76f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x3fee147b    # 1.86f

    .line 332
    .line 333
    .line 334
    const v18, 0x4013d70a    # 2.31f

    .line 335
    .line 336
    .line 337
    const v13, 0x3edc28f6    # 0.43f

    .line 338
    .line 339
    .line 340
    const v14, 0x3f6b851f    # 0.92f

    .line 341
    .line 342
    .line 343
    const v15, 0x3f88f5c3    # 1.07f

    .line 344
    .line 345
    .line 346
    const v16, 0x3fdae148    # 1.71f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v17, 0x3f87ae14    # 1.06f

    .line 353
    .line 354
    .line 355
    const v18, -0x40deb852    # -0.63f

    .line 356
    .line 357
    .line 358
    const v13, 0x3ec28f5c    # 0.38f

    .line 359
    .line 360
    .line 361
    const v14, -0x41dc28f6    # -0.16f

    .line 362
    .line 363
    .line 364
    const v15, 0x3f3d70a4    # 0.74f

    .line 365
    .line 366
    .line 367
    const v16, -0x413d70a4    # -0.38f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v17, 0x3f9d70a4    # 1.23f

    .line 374
    .line 375
    .line 376
    const/16 v18, 0x0

    .line 377
    .line 378
    const v13, 0x3eb33333    # 0.35f

    .line 379
    .line 380
    .line 381
    const v14, -0x416b851f    # -0.29f

    .line 382
    .line 383
    .line 384
    const v15, 0x3f5eb852    # 0.87f

    .line 385
    .line 386
    .line 387
    const v16, -0x416b851f    # -0.29f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v17, 0x41100000    # 9.0f

    .line 394
    .line 395
    const/high16 v18, 0x41980000    # 19.0f

    .line 396
    .line 397
    const v13, 0x40e8f5c3    # 7.28f

    .line 398
    .line 399
    .line 400
    const v14, 0x41950a3d    # 18.63f

    .line 401
    .line 402
    .line 403
    const v15, 0x4101999a    # 8.1f

    .line 404
    .line 405
    .line 406
    const/high16 v16, 0x41980000    # 19.0f

    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v17, 0x4018f5c3    # 2.39f

    .line 412
    .line 413
    .line 414
    const v18, -0x40970a3d    # -0.91f

    .line 415
    .line 416
    .line 417
    const v13, 0x3f666666    # 0.9f

    .line 418
    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const v15, 0x3fdc28f6    # 1.72f

    .line 422
    .line 423
    .line 424
    const v16, -0x41428f5c    # -0.37f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, 0x3f9c28f6    # 1.22f

    .line 431
    .line 432
    .line 433
    const/16 v18, 0x0

    .line 434
    .line 435
    const v13, 0x3eb33333    # 0.35f

    .line 436
    .line 437
    .line 438
    const v14, -0x4170a3d7    # -0.28f

    .line 439
    .line 440
    .line 441
    const v15, 0x3f5eb852    # 0.87f

    .line 442
    .line 443
    .line 444
    const v16, -0x4170a3d7    # -0.28f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v17, 0x41700000    # 15.0f

    .line 451
    .line 452
    const/high16 v18, 0x41980000    # 19.0f

    .line 453
    .line 454
    const v13, 0x41547ae1    # 13.28f

    .line 455
    .line 456
    .line 457
    const v14, 0x41950a3d    # 18.63f

    .line 458
    .line 459
    .line 460
    const v15, 0x4161999a    # 14.1f

    .line 461
    .line 462
    .line 463
    const/high16 v16, 0x41980000    # 19.0f

    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x4018f5c3    # 2.39f

    .line 469
    .line 470
    .line 471
    const v18, -0x40970a3d    # -0.91f

    .line 472
    .line 473
    .line 474
    const v13, 0x3f666666    # 0.9f

    .line 475
    .line 476
    .line 477
    const/4 v14, 0x0

    .line 478
    const v15, 0x3fdc28f6    # 1.72f

    .line 479
    .line 480
    .line 481
    const v16, -0x41428f5c    # -0.37f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v17, 0x3f9d70a4    # 1.23f

    .line 488
    .line 489
    .line 490
    const/16 v18, 0x0

    .line 491
    .line 492
    const v13, 0x3eb33333    # 0.35f

    .line 493
    .line 494
    .line 495
    const v14, -0x416b851f    # -0.29f

    .line 496
    .line 497
    .line 498
    const v15, 0x3f5eb852    # 0.87f

    .line 499
    .line 500
    .line 501
    const v16, -0x4170a3d7    # -0.28f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, 0x3f87ae14    # 1.06f

    .line 508
    .line 509
    .line 510
    const v18, 0x3f2147ae    # 0.63f

    .line 511
    .line 512
    .line 513
    const v13, 0x3ea3d70a    # 0.32f

    .line 514
    .line 515
    .line 516
    const v14, 0x3e851eb8    # 0.26f

    .line 517
    .line 518
    .line 519
    const v15, 0x3f2b851f    # 0.67f

    .line 520
    .line 521
    .line 522
    const v16, 0x3ef5c28f    # 0.48f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x3fee147b    # 1.86f

    .line 529
    .line 530
    .line 531
    const v18, -0x3fec28f6    # -2.31f

    .line 532
    .line 533
    .line 534
    const v13, 0x3f4a3d71    # 0.79f

    .line 535
    .line 536
    .line 537
    const v14, -0x40e66666    # -0.6f

    .line 538
    .line 539
    .line 540
    const v15, 0x3fb70a3d    # 1.43f

    .line 541
    .line 542
    .line 543
    const v16, -0x404e147b    # -1.39f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x41a4f5c3    # 20.62f

    .line 550
    .line 551
    .line 552
    const/high16 v18, 0x41700000    # 15.0f

    .line 553
    .line 554
    const v13, 0x41aeb852    # 21.84f

    .line 555
    .line 556
    .line 557
    const v14, 0x417c28f6    # 15.76f

    .line 558
    .line 559
    .line 560
    const v15, 0x41aacccd    # 21.35f

    .line 561
    .line 562
    .line 563
    const/high16 v16, 0x41700000    # 15.0f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, 0x41b00000    # 22.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v17, -0x40800000    # -1.0f

    .line 577
    .line 578
    const/high16 v18, -0x40800000    # -1.0f

    .line 579
    .line 580
    const/4 v13, 0x0

    .line 581
    const v14, -0x40f33333    # -0.55f

    .line 582
    .line 583
    .line 584
    const v15, -0x4119999a    # -0.45f

    .line 585
    .line 586
    .line 587
    const/high16 v16, -0x40800000    # -1.0f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/4 v0, 0x0

    .line 593
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v17, -0x3fde147b    # -2.53f

    .line 597
    .line 598
    .line 599
    const v18, -0x40cccccd    # -0.7f

    .line 600
    .line 601
    .line 602
    const v13, -0x40a147ae    # -0.87f

    .line 603
    .line 604
    .line 605
    const/4 v14, 0x0

    .line 606
    const v15, -0x40228f5c    # -1.73f

    .line 607
    .line 608
    .line 609
    const v16, -0x418a3d71    # -0.24f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v17, -0x408f5c29    # -0.94f

    .line 616
    .line 617
    .line 618
    const/16 v18, 0x0

    .line 619
    .line 620
    const v13, -0x416b851f    # -0.29f

    .line 621
    .line 622
    .line 623
    const v14, -0x41dc28f6    # -0.16f

    .line 624
    .line 625
    .line 626
    const v15, -0x40d9999a    # -0.65f

    .line 627
    .line 628
    .line 629
    const v16, -0x41d1eb85    # -0.17f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v17, -0x3f5e147b    # -5.06f

    .line 636
    .line 637
    .line 638
    const v13, -0x40347ae1    # -1.59f

    .line 639
    .line 640
    .line 641
    const v14, 0x3f666666    # 0.9f

    .line 642
    .line 643
    .line 644
    const v15, -0x3fa1eb85    # -3.47f

    .line 645
    .line 646
    .line 647
    const v16, 0x3f666666    # 0.9f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v17, -0x408f5c29    # -0.94f

    .line 654
    .line 655
    .line 656
    const v13, -0x416b851f    # -0.29f

    .line 657
    .line 658
    .line 659
    const v14, -0x41dc28f6    # -0.16f

    .line 660
    .line 661
    .line 662
    const v15, -0x40d9999a    # -0.65f

    .line 663
    .line 664
    .line 665
    const v16, -0x41dc28f6    # -0.16f

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const v17, -0x3f5e147b    # -5.06f

    .line 672
    .line 673
    .line 674
    const v13, -0x40347ae1    # -1.59f

    .line 675
    .line 676
    .line 677
    const v14, 0x3f666666    # 0.9f

    .line 678
    .line 679
    .line 680
    const v15, -0x3fa1eb85    # -3.47f

    .line 681
    .line 682
    .line 683
    const v16, 0x3f666666    # 0.9f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, -0x408f5c29    # -0.94f

    .line 690
    .line 691
    .line 692
    const v13, -0x416b851f    # -0.29f

    .line 693
    .line 694
    .line 695
    const v14, -0x41dc28f6    # -0.16f

    .line 696
    .line 697
    .line 698
    const v15, -0x40d9999a    # -0.65f

    .line 699
    .line 700
    .line 701
    const v16, -0x41dc28f6    # -0.16f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v17, 0x40400000    # 3.0f

    .line 708
    .line 709
    const/high16 v18, 0x41a80000    # 21.0f

    .line 710
    .line 711
    const v13, 0x40975c29    # 4.73f

    .line 712
    .line 713
    .line 714
    const v14, 0x41a6147b    # 20.76f

    .line 715
    .line 716
    .line 717
    const v15, 0x4077ae14    # 3.87f

    .line 718
    .line 719
    .line 720
    const/high16 v16, 0x41a80000    # 21.0f

    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/high16 v17, -0x40800000    # -1.0f

    .line 729
    .line 730
    const/high16 v18, 0x3f800000    # 1.0f

    .line 731
    .line 732
    const v13, -0x40f33333    # -0.55f

    .line 733
    .line 734
    .line 735
    const/4 v14, 0x0

    .line 736
    const/high16 v15, -0x40800000    # -1.0f

    .line 737
    .line 738
    const v16, 0x3ee66666    # 0.45f

    .line 739
    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const/high16 v17, 0x3f800000    # 1.0f

    .line 745
    .line 746
    const/4 v13, 0x0

    .line 747
    const v14, 0x3f0ccccd    # 0.55f

    .line 748
    .line 749
    .line 750
    const v15, 0x3ee66666    # 0.45f

    .line 751
    .line 752
    .line 753
    const/high16 v16, 0x3f800000    # 1.0f

    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const v17, 0x40551eb8    # 3.33f

    .line 762
    .line 763
    .line 764
    const v18, -0x408f5c29    # -0.94f

    .line 765
    .line 766
    .line 767
    const v13, 0x3f933333    # 1.15f

    .line 768
    .line 769
    .line 770
    const/4 v14, 0x0

    .line 771
    const v15, 0x40133333    # 2.3f

    .line 772
    .line 773
    .line 774
    const v16, -0x416147ae    # -0.31f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, 0x40b28f5c    # 5.58f

    .line 781
    .line 782
    .line 783
    const v18, 0x3e0f5c29    # 0.14f

    .line 784
    .line 785
    .line 786
    const v13, 0x3fd47ae1    # 1.66f

    .line 787
    .line 788
    .line 789
    const v14, 0x3f8e147b    # 1.11f

    .line 790
    .line 791
    .line 792
    const v15, 0x4071eb85    # 3.78f

    .line 793
    .line 794
    .line 795
    const v16, 0x3f8147ae    # 1.01f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const v17, 0x40c2e148    # 6.09f

    .line 802
    .line 803
    .line 804
    const v18, 0x3d4ccccd    # 0.05f

    .line 805
    .line 806
    .line 807
    const v13, 0x3ff47ae1    # 1.91f

    .line 808
    .line 809
    .line 810
    const v14, 0x3f866666    # 1.05f

    .line 811
    .line 812
    .line 813
    const v15, 0x408570a4    # 4.17f

    .line 814
    .line 815
    .line 816
    const v16, 0x3f88f5c3    # 1.07f

    .line 817
    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v17, 0x40400000    # 3.0f

    .line 826
    .line 827
    const/high16 v18, 0x3f400000    # 0.75f

    .line 828
    .line 829
    const v13, 0x3f733333    # 0.95f

    .line 830
    .line 831
    .line 832
    const/high16 v14, 0x3f000000    # 0.5f

    .line 833
    .line 834
    const v15, 0x3ffc28f6    # 1.97f

    .line 835
    .line 836
    .line 837
    const/high16 v16, 0x3f400000    # 0.75f

    .line 838
    .line 839
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/high16 v17, 0x41b00000    # 22.0f

    .line 846
    .line 847
    const/high16 v18, 0x41b00000    # 22.0f

    .line 848
    .line 849
    const v13, 0x41ac6666    # 21.55f

    .line 850
    .line 851
    .line 852
    const/high16 v14, 0x41b80000    # 23.0f

    .line 853
    .line 854
    const/high16 v15, 0x41b00000    # 22.0f

    .line 855
    .line 856
    const v16, 0x41b46666    # 22.55f

    .line 857
    .line 858
    .line 859
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    const/16 v16, 0x3800

    .line 870
    .line 871
    const/16 v17, 0x0

    .line 872
    .line 873
    const/high16 v6, 0x3f800000    # 1.0f

    .line 874
    .line 875
    const/high16 v8, 0x3f800000    # 1.0f

    .line 876
    .line 877
    const/4 v7, 0x0

    .line 878
    const/high16 v9, 0x3f800000    # 1.0f

    .line 879
    .line 880
    const/high16 v12, 0x3f800000    # 1.0f

    .line 881
    .line 882
    const/4 v13, 0x0

    .line 883
    const/4 v14, 0x0

    .line 884
    const/4 v15, 0x0

    .line 885
    const-string v4, ""

    .line 886
    .line 887
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    sput-object v0, Landroidx/compose/material/icons/rounded/SailingKt;->_sailing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 896
    .line 897
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 898
    .line 899
    .line 900
    return-object v0
.end method

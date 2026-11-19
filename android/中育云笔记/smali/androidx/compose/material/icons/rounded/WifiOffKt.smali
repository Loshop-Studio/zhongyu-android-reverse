.class public final Landroidx/compose/material/icons/rounded/WifiOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WifiOffKt;->_wifiOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WifiOff"

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
    const v0, 0x41a07ae1    # 20.06f

    .line 71
    .line 72
    .line 73
    const v2, 0x41223d71    # 10.14f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3ff1eb85    # 1.89f

    .line 80
    .line 81
    .line 82
    const v18, -0x4247ae14    # -0.09f

    .line 83
    .line 84
    .line 85
    const v13, 0x3f0f5c29    # 0.56f

    .line 86
    .line 87
    .line 88
    const v14, 0x3eeb851f    # 0.46f

    .line 89
    .line 90
    .line 91
    const v15, 0x3fb0a3d7    # 1.38f

    .line 92
    .line 93
    .line 94
    const v16, 0x3ed70a3d    # 0.42f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x42333333    # -0.1f

    .line 101
    .line 102
    .line 103
    const v18, -0x3ff9999a    # -2.1f

    .line 104
    .line 105
    .line 106
    const v13, 0x3f170a3d    # 0.59f

    .line 107
    .line 108
    .line 109
    const v14, -0x40e8f5c3    # -0.59f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f0ccccd    # 0.55f

    .line 113
    .line 114
    .line 115
    const v16, -0x40370a3d    # -1.57f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, -0x3eb73333    # -12.55f

    .line 122
    .line 123
    .line 124
    const v18, -0x3faf5c29    # -3.26f

    .line 125
    .line 126
    .line 127
    const v13, -0x3f9a3d71    # -3.59f

    .line 128
    .line 129
    .line 130
    const v14, -0x3fc3d70a    # -2.94f

    .line 131
    .line 132
    .line 133
    const v15, -0x3efccccd    # -8.2f

    .line 134
    .line 135
    .line 136
    const v16, -0x3f7f0a3d    # -4.03f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v0, 0x4025c28f    # 2.59f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x4102b852    # 8.17f

    .line 149
    .line 150
    .line 151
    const v18, 0x40370a3d    # 2.86f

    .line 152
    .line 153
    .line 154
    const v13, 0x4038f5c3    # 2.89f

    .line 155
    .line 156
    .line 157
    const v14, -0x430a3d71    # -0.03f

    .line 158
    .line 159
    .line 160
    const v15, 0x40b9999a    # 5.8f

    .line 161
    .line 162
    .line 163
    const v16, 0x3f6b851f    # 0.92f

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, 0x418e51ec    # 17.79f

    .line 173
    .line 174
    .line 175
    const v2, 0x413f851f    # 11.97f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x3fdeb852    # -2.52f

    .line 182
    .line 183
    .line 184
    const v18, -0x4059999a    # -1.3f

    .line 185
    .line 186
    .line 187
    const v13, -0x40b851ec    # -0.78f

    .line 188
    .line 189
    .line 190
    const v14, -0x40ee147b    # -0.57f

    .line 191
    .line 192
    .line 193
    const v15, -0x402f5c29    # -1.63f

    .line 194
    .line 195
    .line 196
    const/high16 v16, -0x40800000    # -1.0f

    .line 197
    .line 198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x403ccccd    # 2.95f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, -0x4123d70a    # -0.43f

    .line 208
    .line 209
    .line 210
    const v18, -0x402ccccd    # -1.65f

    .line 211
    .line 212
    .line 213
    const v13, 0x3e75c28f    # 0.24f

    .line 214
    .line 215
    .line 216
    const v14, -0x40eb851f    # -0.58f

    .line 217
    .line 218
    .line 219
    const v15, 0x3dcccccd    # 0.1f

    .line 220
    .line 221
    .line 222
    const v16, -0x405d70a4    # -1.27f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x415f3333    # 13.95f

    .line 232
    .line 233
    .line 234
    const v2, 0x4181d70a    # 16.23f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, -0x3f85c28f    # -3.91f

    .line 241
    .line 242
    .line 243
    const/16 v18, 0x0

    .line 244
    .line 245
    const v13, -0x4063d70a    # -1.22f

    .line 246
    .line 247
    .line 248
    const v14, -0x40deb852    # -0.63f

    .line 249
    .line 250
    .line 251
    const v15, -0x3fd47ae1    # -2.68f

    .line 252
    .line 253
    .line 254
    const v16, -0x40deb852    # -0.63f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, -0x41947ae1    # -0.23f

    .line 261
    .line 262
    .line 263
    const v18, 0x3fcb851f    # 1.59f

    .line 264
    .line 265
    .line 266
    const v13, -0x40e8f5c3    # -0.59f

    .line 267
    .line 268
    .line 269
    const v14, 0x3e9eb852    # 0.31f

    .line 270
    .line 271
    .line 272
    const v15, -0x40cccccd    # -0.7f

    .line 273
    .line 274
    .line 275
    const v16, 0x3f8f5c29    # 1.12f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v0, 0x3fbc28f6    # 1.47f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, 0x3fb47ae1    # 1.41f

    .line 288
    .line 289
    .line 290
    const/16 v18, 0x0

    .line 291
    .line 292
    const v13, 0x3ec7ae14    # 0.39f

    .line 293
    .line 294
    .line 295
    const v14, 0x3ec7ae14    # 0.39f

    .line 296
    .line 297
    .line 298
    const v15, 0x3f828f5c    # 1.02f

    .line 299
    .line 300
    .line 301
    const v16, 0x3ec7ae14    # 0.39f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, -0x4043d70a    # -1.47f

    .line 308
    .line 309
    .line 310
    const v2, 0x3fbc28f6    # 1.47f

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const v17, -0x41a8f5c3    # -0.21f

    .line 317
    .line 318
    .line 319
    const v18, -0x40347ae1    # -1.59f

    .line 320
    .line 321
    .line 322
    const v13, 0x3efae148    # 0.49f

    .line 323
    .line 324
    .line 325
    const v14, -0x410f5c29    # -0.47f

    .line 326
    .line 327
    .line 328
    const v15, 0x3ec7ae14    # 0.39f

    .line 329
    .line 330
    .line 331
    const v16, -0x405c28f6    # -1.28f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x419d70a4    # 19.68f

    .line 341
    .line 342
    .line 343
    const v2, 0x418f3333    # 17.9f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v0, 0x4083d70a    # 4.12f

    .line 350
    .line 351
    .line 352
    const v2, 0x4015c28f    # 2.34f

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v17, -0x404b851f    # -1.41f

    .line 359
    .line 360
    .line 361
    const/16 v18, 0x0

    .line 362
    .line 363
    const v13, -0x413851ec    # -0.39f

    .line 364
    .line 365
    .line 366
    const v14, -0x413851ec    # -0.39f

    .line 367
    .line 368
    .line 369
    const v15, -0x407d70a4    # -1.02f

    .line 370
    .line 371
    .line 372
    const v16, -0x413851ec    # -0.39f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const v18, 0x3fb47ae1    # 1.41f

    .line 381
    .line 382
    .line 383
    const v14, 0x3ec7ae14    # 0.39f

    .line 384
    .line 385
    .line 386
    const v15, -0x413851ec    # -0.39f

    .line 387
    .line 388
    .line 389
    const v16, 0x3f828f5c    # 1.02f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x40a1999a    # 5.05f

    .line 396
    .line 397
    .line 398
    const v2, 0x40c33333    # 6.1f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x3fc70a3d    # -2.89f

    .line 405
    .line 406
    .line 407
    const v18, 0x3feccccd    # 1.85f

    .line 408
    .line 409
    .line 410
    const v13, -0x407eb852    # -1.01f

    .line 411
    .line 412
    .line 413
    const/high16 v14, 0x3f000000    # 0.5f

    .line 414
    .line 415
    const v15, -0x400147ae    # -1.99f

    .line 416
    .line 417
    .line 418
    const v16, 0x3f8e147b    # 1.11f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, -0x42333333    # -0.1f

    .line 425
    .line 426
    .line 427
    const v18, 0x40066666    # 2.1f

    .line 428
    .line 429
    .line 430
    const v13, -0x40d9999a    # -0.65f

    .line 431
    .line 432
    .line 433
    const v14, 0x3f07ae14    # 0.53f

    .line 434
    .line 435
    .line 436
    const v15, -0x40cf5c29    # -0.69f

    .line 437
    .line 438
    .line 439
    const v16, 0x3fc147ae    # 1.51f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, 0x3fef5c29    # 1.87f

    .line 446
    .line 447
    .line 448
    const v18, 0x3dcccccd    # 0.1f

    .line 449
    .line 450
    .line 451
    const v13, 0x3f028f5c    # 0.51f

    .line 452
    .line 453
    .line 454
    const v14, 0x3f028f5c    # 0.51f

    .line 455
    .line 456
    .line 457
    const v15, 0x3fa8f5c3    # 1.32f

    .line 458
    .line 459
    .line 460
    const v16, 0x3f0f5c29    # 0.56f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v17, 0x40500000    # 3.25f

    .line 467
    .line 468
    const v18, -0x4008f5c3    # -1.93f

    .line 469
    .line 470
    .line 471
    const/high16 v13, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const v14, -0x40ae147b    # -0.82f

    .line 474
    .line 475
    .line 476
    const v15, 0x40066666    # 2.1f

    .line 477
    .line 478
    .line 479
    const v16, -0x40451eb8    # -1.46f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x400eb852    # 2.23f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, -0x3fb3d70a    # -3.19f

    .line 492
    .line 493
    .line 494
    const v18, 0x3fc147ae    # 1.51f

    .line 495
    .line 496
    .line 497
    const v13, -0x406f5c29    # -1.13f

    .line 498
    .line 499
    .line 500
    const v14, 0x3e99999a    # 0.3f

    .line 501
    .line 502
    .line 503
    const v15, -0x3ff28f5c    # -2.21f

    .line 504
    .line 505
    .line 506
    const v16, 0x3f4ccccd    # 0.8f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, -0x41fae148    # -0.13f

    .line 513
    .line 514
    .line 515
    const v18, 0x40070a3d    # 2.11f

    .line 516
    .line 517
    .line 518
    const v13, -0x40cf5c29    # -0.69f

    .line 519
    .line 520
    .line 521
    const/high16 v14, 0x3f000000    # 0.5f

    .line 522
    .line 523
    const v15, -0x40c51eb8    # -0.73f

    .line 524
    .line 525
    .line 526
    const v16, 0x3fc147ae    # 1.51f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, 0x3c23d70a    # 0.01f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, 0x3fea3d71    # 1.83f

    .line 539
    .line 540
    .line 541
    const v18, 0x3e051eb8    # 0.13f

    .line 542
    .line 543
    .line 544
    const v13, 0x3efae148    # 0.49f

    .line 545
    .line 546
    .line 547
    const v14, 0x3efae148    # 0.49f

    .line 548
    .line 549
    .line 550
    const v15, 0x3fa147ae    # 1.26f

    .line 551
    .line 552
    .line 553
    const v16, 0x3f0a3d71    # 0.54f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, 0x407e147b    # 3.97f

    .line 560
    .line 561
    .line 562
    const v18, -0x405ae148    # -1.29f

    .line 563
    .line 564
    .line 565
    const v13, 0x3f9851ec    # 1.19f

    .line 566
    .line 567
    .line 568
    const v14, -0x40a8f5c3    # -0.84f

    .line 569
    .line 570
    .line 571
    const v15, 0x40251eb8    # 2.58f

    .line 572
    .line 573
    .line 574
    const v16, -0x405eb852    # -1.26f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x40cbd70a    # 6.37f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v17, 0x3fb47ae1    # 1.41f

    .line 587
    .line 588
    .line 589
    const/16 v18, 0x0

    .line 590
    .line 591
    const v13, 0x3ec7ae14    # 0.39f

    .line 592
    .line 593
    .line 594
    const v14, 0x3ec7ae14    # 0.39f

    .line 595
    .line 596
    .line 597
    const v15, 0x3f828f5c    # 1.02f

    .line 598
    .line 599
    .line 600
    const v16, 0x3ec7ae14    # 0.39f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/16 v17, 0x0

    .line 607
    .line 608
    const v18, -0x404e147b    # -1.39f

    .line 609
    .line 610
    .line 611
    const v14, -0x41428f5c    # -0.37f

    .line 612
    .line 613
    .line 614
    const v15, 0x3ec7ae14    # 0.39f

    .line 615
    .line 616
    .line 617
    const/high16 v16, -0x40800000    # -1.0f

    .line 618
    .line 619
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    const/16 v16, 0x3800

    .line 630
    .line 631
    const/16 v17, 0x0

    .line 632
    .line 633
    const/high16 v6, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/high16 v8, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/4 v7, 0x0

    .line 638
    const/high16 v9, 0x3f800000    # 1.0f

    .line 639
    .line 640
    const/high16 v12, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/4 v13, 0x0

    .line 643
    const/4 v14, 0x0

    .line 644
    const/4 v15, 0x0

    .line 645
    const-string v4, ""

    .line 646
    .line 647
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    sput-object v0, Landroidx/compose/material/icons/rounded/WifiOffKt;->_wifiOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 656
    .line 657
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    return-object v0
.end method

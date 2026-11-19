.class public final Landroidx/compose/material/icons/rounded/RocketLaunchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRocketLaunch(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/RocketLaunchKt;->_rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.RocketLaunch"

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
    const v0, 0x40cb3333    # 6.35f

    .line 71
    .line 72
    .line 73
    const v2, 0x41130a3d    # 9.19f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f9b851f    # -3.57f

    .line 80
    .line 81
    .line 82
    const v18, 0x40bc7ae1    # 5.89f

    .line 83
    .line 84
    .line 85
    const v13, -0x3ffd70a4    # -2.04f

    .line 86
    .line 87
    .line 88
    const v14, 0x40128f5c    # 2.29f

    .line 89
    .line 90
    .line 91
    const v15, -0x3fa3d70a    # -3.44f

    .line 92
    .line 93
    .line 94
    const v16, 0x40b28f5c    # 5.58f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, -0x3fef5c29    # -2.26f

    .line 101
    .line 102
    .line 103
    const v2, -0x4087ae14    # -0.97f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, -0x416147ae    # -0.31f

    .line 110
    .line 111
    .line 112
    const v18, -0x402f5c29    # -1.63f

    .line 113
    .line 114
    .line 115
    const v13, -0x40d9999a    # -0.65f

    .line 116
    .line 117
    .line 118
    const v14, -0x4170a3d7    # -0.28f

    .line 119
    .line 120
    .line 121
    const v15, -0x40b0a3d7    # -0.81f

    .line 122
    .line 123
    .line 124
    const v16, -0x406f5c29    # -1.13f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, -0x3fbf5c29    # -3.01f

    .line 131
    .line 132
    .line 133
    const v2, 0x4040a3d7    # 3.01f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, 0x3fe7ae14    # 1.81f

    .line 140
    .line 141
    .line 142
    const v18, -0x40f33333    # -0.55f

    .line 143
    .line 144
    .line 145
    const v13, 0x3ef0a3d7    # 0.47f

    .line 146
    .line 147
    .line 148
    const v14, -0x410f5c29    # -0.47f

    .line 149
    .line 150
    .line 151
    const v15, 0x3f933333    # 1.15f

    .line 152
    .line 153
    .line 154
    const v16, -0x40d1eb85    # -0.68f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v0, 0x40cb3333    # 6.35f

    .line 161
    .line 162
    .line 163
    const v2, 0x41130a3d    # 9.19f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x4184147b    # 16.51f

    .line 176
    .line 177
    .line 178
    const v2, 0x412ae148    # 10.68f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x3f8f5c29    # 1.12f

    .line 185
    .line 186
    .line 187
    const v18, 0x3e4ccccd    # 0.2f

    .line 188
    .line 189
    .line 190
    const v13, 0x3e99999a    # 0.3f

    .line 191
    .line 192
    .line 193
    const v14, 0x3e99999a    # 0.3f

    .line 194
    .line 195
    .line 196
    const v15, 0x3f3d70a4    # 0.74f

    .line 197
    .line 198
    .line 199
    const v16, 0x3ec28f5c    # 0.38f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x40a851ec    # 5.26f

    .line 206
    .line 207
    .line 208
    const v18, -0x3fa51eb8    # -3.42f

    .line 209
    .line 210
    .line 211
    const v13, 0x3f947ae1    # 1.16f

    .line 212
    .line 213
    .line 214
    const v14, -0x40f5c28f    # -0.54f

    .line 215
    .line 216
    .line 217
    const v15, 0x4069999a    # 3.65f

    .line 218
    .line 219
    .line 220
    const v16, -0x401851ec    # -1.81f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v17, 0x408b851f    # 4.36f

    .line 227
    .line 228
    .line 229
    const v18, -0x3ee11eb8    # -9.93f

    .line 230
    .line 231
    .line 232
    const v13, 0x4092e148    # 4.59f

    .line 233
    .line 234
    .line 235
    const v14, -0x3f6d1eb8    # -4.59f

    .line 236
    .line 237
    .line 238
    const v15, 0x409428f6    # 4.63f

    .line 239
    .line 240
    .line 241
    const v16, -0x3efab852    # -8.33f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v17, -0x40b5c28f    # -0.79f

    .line 248
    .line 249
    .line 250
    const v18, -0x40b5c28f    # -0.79f

    .line 251
    .line 252
    .line 253
    const v13, -0x4270a3d7    # -0.07f

    .line 254
    .line 255
    .line 256
    const v14, -0x41333333    # -0.4f

    .line 257
    .line 258
    .line 259
    const v15, -0x413851ec    # -0.39f

    .line 260
    .line 261
    .line 262
    const v16, -0x40c7ae14    # -0.72f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x3ee11eb8    # -9.93f

    .line 269
    .line 270
    .line 271
    const v18, 0x408b851f    # 4.36f

    .line 272
    .line 273
    .line 274
    const v13, -0x40333333    # -1.6f

    .line 275
    .line 276
    .line 277
    const v14, -0x4175c28f    # -0.27f

    .line 278
    .line 279
    .line 280
    const v15, -0x3f551eb8    # -5.34f

    .line 281
    .line 282
    .line 283
    const v16, -0x41947ae1    # -0.23f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x3fa51eb8    # -3.42f

    .line 290
    .line 291
    .line 292
    const v18, 0x40a851ec    # 5.26f

    .line 293
    .line 294
    .line 295
    const v13, -0x4031eb85    # -1.61f

    .line 296
    .line 297
    .line 298
    const v14, 0x3fce147b    # 1.61f

    .line 299
    .line 300
    .line 301
    const v15, -0x3fc851ec    # -2.87f

    .line 302
    .line 303
    .line 304
    const v16, 0x40833333    # 4.1f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x3e4ccccd    # 0.2f

    .line 311
    .line 312
    .line 313
    const v18, 0x3f8f5c29    # 1.12f

    .line 314
    .line 315
    .line 316
    const v13, -0x41c7ae14    # -0.18f

    .line 317
    .line 318
    .line 319
    const v14, 0x3ec28f5c    # 0.38f

    .line 320
    .line 321
    .line 322
    const v15, -0x4247ae14    # -0.09f

    .line 323
    .line 324
    .line 325
    const v16, 0x3f547ae1    # 0.83f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v0, 0x416cf5c3    # 14.81f

    .line 338
    .line 339
    .line 340
    const v2, 0x418d3333    # 17.65f

    .line 341
    .line 342
    .line 343
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, -0x3f43851f    # -5.89f

    .line 347
    .line 348
    .line 349
    const v18, 0x40647ae1    # 3.57f

    .line 350
    .line 351
    .line 352
    const v13, -0x3fed70a4    # -2.29f

    .line 353
    .line 354
    .line 355
    const v14, 0x40028f5c    # 2.04f

    .line 356
    .line 357
    .line 358
    const v15, -0x3f4d70a4    # -5.58f

    .line 359
    .line 360
    .line 361
    const v16, 0x405c28f6    # 3.44f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v0, 0x3f7851ec    # 0.97f

    .line 368
    .line 369
    .line 370
    const v2, 0x4010a3d7    # 2.26f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, 0x3fd0a3d7    # 1.63f

    .line 377
    .line 378
    .line 379
    const v18, 0x3e9eb852    # 0.31f

    .line 380
    .line 381
    .line 382
    const v13, 0x3e8f5c29    # 0.28f

    .line 383
    .line 384
    .line 385
    const v14, 0x3f266666    # 0.65f

    .line 386
    .line 387
    .line 388
    const v15, 0x3f90a3d7    # 1.13f

    .line 389
    .line 390
    .line 391
    const v16, 0x3f4f5c29    # 0.81f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, -0x3fbf5c29    # -3.01f

    .line 398
    .line 399
    .line 400
    const v2, 0x4040a3d7    # 3.01f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v17, 0x3f0ccccd    # 0.55f

    .line 407
    .line 408
    .line 409
    const v18, -0x401851ec    # -1.81f

    .line 410
    .line 411
    .line 412
    const v13, 0x3ef0a3d7    # 0.47f

    .line 413
    .line 414
    .line 415
    const v14, -0x410f5c29    # -0.47f

    .line 416
    .line 417
    .line 418
    const v15, 0x3f2e147b    # 0.68f

    .line 419
    .line 420
    .line 421
    const v16, -0x406ccccd    # -1.15f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const v0, 0x416cf5c3    # 14.81f

    .line 428
    .line 429
    .line 430
    const v2, 0x418d3333    # 17.65f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x410f0a3d    # 8.94f

    .line 443
    .line 444
    .line 445
    const v2, 0x418b47ae    # 17.41f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, -0x40ae147b    # -0.82f

    .line 452
    .line 453
    .line 454
    const v18, 0x402d70a4    # 2.71f

    .line 455
    .line 456
    .line 457
    const v13, 0x3e4ccccd    # 0.2f

    .line 458
    .line 459
    .line 460
    const v14, 0x3f87ae14    # 1.06f

    .line 461
    .line 462
    .line 463
    const v15, -0x41e66666    # -0.15f

    .line 464
    .line 465
    .line 466
    const v16, 0x40028f5c    # 2.04f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, -0x3f6947ae    # -4.71f

    .line 473
    .line 474
    .line 475
    const v18, 0x3fd1eb85    # 1.64f

    .line 476
    .line 477
    .line 478
    const v13, -0x40bae148    # -0.77f

    .line 479
    .line 480
    .line 481
    const v14, 0x3f451eb8    # 0.77f

    .line 482
    .line 483
    .line 484
    const v15, -0x3fb5c28f    # -3.16f

    .line 485
    .line 486
    .line 487
    const v16, 0x3fab851f    # 1.34f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, -0x406a3d71    # -1.17f

    .line 494
    .line 495
    .line 496
    const v18, -0x406a3d71    # -1.17f

    .line 497
    .line 498
    .line 499
    const v13, -0x40cf5c29    # -0.69f

    .line 500
    .line 501
    .line 502
    const v14, 0x3e051eb8    # 0.13f

    .line 503
    .line 504
    .line 505
    const v15, -0x4059999a    # -1.3f

    .line 506
    .line 507
    .line 508
    const v16, -0x410a3d71    # -0.48f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v17, 0x3fd1eb85    # 1.64f

    .line 515
    .line 516
    .line 517
    const v18, -0x3f6947ae    # -4.71f

    .line 518
    .line 519
    .line 520
    const v13, 0x3e99999a    # 0.3f

    .line 521
    .line 522
    .line 523
    const v14, -0x4039999a    # -1.55f

    .line 524
    .line 525
    .line 526
    const v15, 0x3f5c28f6    # 0.86f

    .line 527
    .line 528
    .line 529
    const v16, -0x3f83d70a    # -3.94f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const v17, 0x402d70a4    # 2.71f

    .line 536
    .line 537
    .line 538
    const v18, -0x40ae147b    # -0.82f

    .line 539
    .line 540
    .line 541
    const v13, 0x3f2b851f    # 0.67f

    .line 542
    .line 543
    .line 544
    const v14, -0x40d47ae1    # -0.67f

    .line 545
    .line 546
    .line 547
    const v15, 0x3fd33333    # 1.65f

    .line 548
    .line 549
    .line 550
    const v16, -0x407d70a4    # -1.02f

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, 0x410f0a3d    # 8.94f

    .line 557
    .line 558
    .line 559
    const v18, 0x418b47ae    # 17.41f

    .line 560
    .line 561
    .line 562
    const v13, 0x40f851ec    # 7.76f

    .line 563
    .line 564
    .line 565
    const v14, 0x41747ae1    # 15.28f

    .line 566
    .line 567
    .line 568
    const v15, 0x410b851f    # 8.72f

    .line 569
    .line 570
    .line 571
    const v16, 0x4181eb85    # 16.24f

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
    const/high16 v0, 0x41100000    # 9.0f

    .line 581
    .line 582
    const/high16 v2, 0x41500000    # 13.0f

    .line 583
    .line 584
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v17, 0x40000000    # 2.0f

    .line 588
    .line 589
    const/high16 v18, -0x40000000    # -2.0f

    .line 590
    .line 591
    const/4 v13, 0x0

    .line 592
    const v14, -0x40733333    # -1.1f

    .line 593
    .line 594
    .line 595
    const v15, 0x3f666666    # 0.9f

    .line 596
    .line 597
    .line 598
    const/high16 v16, -0x40000000    # -2.0f

    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x3f666666    # 0.9f

    .line 604
    .line 605
    .line 606
    const/high16 v2, 0x40000000    # 2.0f

    .line 607
    .line 608
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, -0x4099999a    # -0.9f

    .line 612
    .line 613
    .line 614
    const/high16 v2, -0x40000000    # -2.0f

    .line 615
    .line 616
    const/high16 v4, 0x40000000    # 2.0f

    .line 617
    .line 618
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v0, 0x4121999a    # 10.1f

    .line 622
    .line 623
    .line 624
    const/high16 v2, 0x41100000    # 9.0f

    .line 625
    .line 626
    const/high16 v4, 0x41500000    # 13.0f

    .line 627
    .line 628
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    const/16 v16, 0x3800

    .line 639
    .line 640
    const/16 v17, 0x0

    .line 641
    .line 642
    const/high16 v6, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const/high16 v8, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v7, 0x0

    .line 647
    const/high16 v9, 0x3f800000    # 1.0f

    .line 648
    .line 649
    const/high16 v12, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/4 v14, 0x0

    .line 652
    const/4 v15, 0x0

    .line 653
    const-string v4, ""

    .line 654
    .line 655
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    sput-object v0, Landroidx/compose/material/icons/rounded/RocketLaunchKt;->_rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 664
    .line 665
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    return-object v0
.end method

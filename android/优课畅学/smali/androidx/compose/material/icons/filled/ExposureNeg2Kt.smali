.class public final Landroidx/compose/material/icons/filled/ExposureNeg2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _exposureNeg2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExposureNeg2(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ExposureNeg2Kt;->_exposureNeg2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ExposureNeg2"

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
    const v0, 0x4170cccd    # 15.05f

    .line 71
    .line 72
    .line 73
    const v2, 0x418251ec    # 16.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40370a3d    # 2.86f

    .line 80
    .line 81
    .line 82
    const v2, -0x3fbb851f    # -3.07f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x3f851eb8    # 1.04f

    .line 89
    .line 90
    .line 91
    const v18, -0x4068f5c3    # -1.18f

    .line 92
    .line 93
    .line 94
    const v13, 0x3ec28f5c    # 0.38f

    .line 95
    .line 96
    .line 97
    const v14, -0x413851ec    # -0.39f

    .line 98
    .line 99
    .line 100
    const v15, 0x3f3851ec    # 0.72f

    .line 101
    .line 102
    .line 103
    const v16, -0x40b5c28f    # -0.79f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x3f51eb85    # 0.82f

    .line 110
    .line 111
    .line 112
    const v18, -0x406a3d71    # -1.17f

    .line 113
    .line 114
    .line 115
    const v13, 0x3ea3d70a    # 0.32f

    .line 116
    .line 117
    .line 118
    const v15, 0x3f170a3d    # 0.59f

    .line 119
    .line 120
    .line 121
    const v16, -0x40b851ec    # -0.78f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, 0x3f0a3d71    # 0.54f

    .line 128
    .line 129
    .line 130
    const v13, 0x3e6b851f    # 0.23f

    .line 131
    .line 132
    .line 133
    const v15, 0x3ed1eb85    # 0.41f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, -0x40b5c28f    # -0.79f

    .line 140
    .line 141
    .line 142
    const v2, -0x4068f5c3    # -1.18f

    .line 143
    .line 144
    .line 145
    const v4, 0x3e428f5c    # 0.19f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, -0x4175c28f    # -0.27f

    .line 152
    .line 153
    .line 154
    const v18, -0x40451eb8    # -1.46f

    .line 155
    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const v14, -0x40f851ec    # -0.53f

    .line 159
    .line 160
    .line 161
    const v15, -0x4247ae14    # -0.09f

    .line 162
    .line 163
    .line 164
    const v16, -0x407d70a4    # -1.02f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, -0x40b851ec    # -0.78f

    .line 171
    .line 172
    .line 173
    const v18, -0x4071eb85    # -1.11f

    .line 174
    .line 175
    .line 176
    const v13, -0x41c7ae14    # -0.18f

    .line 177
    .line 178
    .line 179
    const v14, -0x411eb852    # -0.44f

    .line 180
    .line 181
    .line 182
    const v15, -0x411eb852    # -0.44f

    .line 183
    .line 184
    .line 185
    const v16, -0x40b0a3d7    # -0.81f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, -0x405eb852    # -1.26f

    .line 192
    .line 193
    .line 194
    const v18, -0x40ca3d71    # -0.71f

    .line 195
    .line 196
    .line 197
    const v13, -0x4151eb85    # -0.34f

    .line 198
    .line 199
    .line 200
    const v14, -0x416147ae    # -0.31f

    .line 201
    .line 202
    .line 203
    const v15, -0x40bae148    # -0.77f

    .line 204
    .line 205
    .line 206
    const v16, -0x40f5c28f    # -0.54f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, -0x4023d70a    # -1.72f

    .line 213
    .line 214
    .line 215
    const v18, -0x418a3d71    # -0.24f

    .line 216
    .line 217
    .line 218
    const v13, -0x40fd70a4    # -0.51f

    .line 219
    .line 220
    .line 221
    const v14, -0x41dc28f6    # -0.16f

    .line 222
    .line 223
    .line 224
    const v15, -0x4075c28f    # -1.08f

    .line 225
    .line 226
    .line 227
    const v16, -0x418a3d71    # -0.24f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, -0x40133333    # -1.85f

    .line 234
    .line 235
    .line 236
    const v18, 0x3ea3d70a    # 0.32f

    .line 237
    .line 238
    .line 239
    const v13, -0x40cf5c29    # -0.69f

    .line 240
    .line 241
    .line 242
    const/4 v14, 0x0

    .line 243
    const v15, -0x405851ec    # -1.31f

    .line 244
    .line 245
    .line 246
    const v16, 0x3de147ae    # 0.11f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, -0x4051eb85    # -1.36f

    .line 253
    .line 254
    .line 255
    const v18, 0x3f6147ae    # 0.88f

    .line 256
    .line 257
    .line 258
    const v13, -0x40f5c28f    # -0.54f

    .line 259
    .line 260
    .line 261
    const v14, 0x3e570a3d    # 0.21f

    .line 262
    .line 263
    .line 264
    const/high16 v15, -0x40800000    # -1.0f

    .line 265
    .line 266
    const v16, 0x3f028f5c    # 0.51f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x40a8f5c3    # -0.84f

    .line 273
    .line 274
    .line 275
    const v18, 0x3fa66666    # 1.3f

    .line 276
    .line 277
    .line 278
    const v13, -0x41428f5c    # -0.37f

    .line 279
    .line 280
    .line 281
    const v14, 0x3ebd70a4    # 0.37f

    .line 282
    .line 283
    .line 284
    const v15, -0x40d9999a    # -0.65f

    .line 285
    .line 286
    .line 287
    const v16, 0x3f4ccccd    # 0.8f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x4170a3d7    # -0.28f

    .line 294
    .line 295
    .line 296
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 297
    .line 298
    const v13, -0x41c7ae14    # -0.18f

    .line 299
    .line 300
    .line 301
    const v14, 0x3ef0a3d7    # 0.47f

    .line 302
    .line 303
    .line 304
    const v15, -0x4175c28f    # -0.27f

    .line 305
    .line 306
    .line 307
    const v16, 0x3f7851ec    # 0.97f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x4008f5c3    # 2.14f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x3e051eb8    # 0.13f

    .line 320
    .line 321
    .line 322
    const v18, -0x40a147ae    # -0.87f

    .line 323
    .line 324
    .line 325
    const v13, 0x3c23d70a    # 0.01f

    .line 326
    .line 327
    .line 328
    const v14, -0x416147ae    # -0.31f

    .line 329
    .line 330
    .line 331
    const v15, 0x3d4ccccd    # 0.05f

    .line 332
    .line 333
    .line 334
    const v16, -0x40e66666    # -0.6f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, 0x3ecccccd    # 0.4f

    .line 341
    .line 342
    .line 343
    const/high16 v18, -0x40c00000    # -0.75f

    .line 344
    .line 345
    const v13, 0x3db851ec    # 0.09f

    .line 346
    .line 347
    .line 348
    const v14, -0x416b851f    # -0.29f

    .line 349
    .line 350
    .line 351
    const v15, 0x3e6b851f    # 0.23f

    .line 352
    .line 353
    .line 354
    const v16, -0x40f5c28f    # -0.54f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x3f2e147b    # 0.68f

    .line 361
    .line 362
    .line 363
    const v18, -0x41051eb8    # -0.49f

    .line 364
    .line 365
    .line 366
    const v13, 0x3e3851ec    # 0.18f

    .line 367
    .line 368
    .line 369
    const v14, -0x41a8f5c3    # -0.21f

    .line 370
    .line 371
    .line 372
    const v15, 0x3ed1eb85    # 0.41f

    .line 373
    .line 374
    .line 375
    const v16, -0x41428f5c    # -0.37f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x3f75c28f    # 0.96f

    .line 382
    .line 383
    .line 384
    const v18, -0x41c7ae14    # -0.18f

    .line 385
    .line 386
    .line 387
    const v13, 0x3e8a3d71    # 0.27f

    .line 388
    .line 389
    .line 390
    const v14, -0x420a3d71    # -0.12f

    .line 391
    .line 392
    .line 393
    const v15, 0x3f19999a    # 0.6f

    .line 394
    .line 395
    .line 396
    const v16, -0x41c7ae14    # -0.18f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v17, 0x3f4f5c29    # 0.81f

    .line 403
    .line 404
    .line 405
    const v18, 0x3e19999a    # 0.15f

    .line 406
    .line 407
    .line 408
    const v13, 0x3e9eb852    # 0.31f

    .line 409
    .line 410
    .line 411
    const/4 v14, 0x0

    .line 412
    const v15, 0x3f147ae1    # 0.58f

    .line 413
    .line 414
    .line 415
    const v16, 0x3d4ccccd    # 0.05f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x3f170a3d    # 0.59f

    .line 422
    .line 423
    .line 424
    const v18, 0x3edc28f6    # 0.43f

    .line 425
    .line 426
    .line 427
    const v13, 0x3e6b851f    # 0.23f

    .line 428
    .line 429
    .line 430
    const v14, 0x3dcccccd    # 0.1f

    .line 431
    .line 432
    .line 433
    const v15, 0x3edc28f6    # 0.43f

    .line 434
    .line 435
    .line 436
    const/high16 v16, 0x3e800000    # 0.25f

    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, 0x3ebd70a4    # 0.37f

    .line 442
    .line 443
    .line 444
    const v18, 0x3f266666    # 0.65f

    .line 445
    .line 446
    .line 447
    const v13, 0x3e23d70a    # 0.16f

    .line 448
    .line 449
    .line 450
    const v14, 0x3e3851ec    # 0.18f

    .line 451
    .line 452
    .line 453
    const v15, 0x3e8f5c29    # 0.28f

    .line 454
    .line 455
    .line 456
    const v16, 0x3ecccccd    # 0.4f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v17, 0x3e051eb8    # 0.13f

    .line 463
    .line 464
    .line 465
    const v18, 0x3f4f5c29    # 0.81f

    .line 466
    .line 467
    .line 468
    const v13, 0x3da3d70a    # 0.08f

    .line 469
    .line 470
    .line 471
    const/high16 v14, 0x3e800000    # 0.25f

    .line 472
    .line 473
    const v15, 0x3e051eb8    # 0.13f

    .line 474
    .line 475
    .line 476
    const v16, 0x3f051eb8    # 0.52f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, -0x425c28f6    # -0.08f

    .line 483
    .line 484
    .line 485
    const v18, 0x3f266666    # 0.65f

    .line 486
    .line 487
    .line 488
    const/4 v13, 0x0

    .line 489
    const v14, 0x3e6147ae    # 0.22f

    .line 490
    .line 491
    .line 492
    const v15, -0x430a3d71    # -0.03f

    .line 493
    .line 494
    .line 495
    const v16, 0x3edc28f6    # 0.43f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, -0x416b851f    # -0.29f

    .line 502
    .line 503
    .line 504
    const v18, 0x3f333333    # 0.7f

    .line 505
    .line 506
    .line 507
    const v13, -0x428a3d71    # -0.06f

    .line 508
    .line 509
    .line 510
    const v15, -0x41e66666    # -0.15f

    .line 511
    .line 512
    .line 513
    const v16, 0x3ee66666    # 0.45f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, -0x40f0a3d7    # -0.56f

    .line 520
    .line 521
    .line 522
    const v18, 0x3f547ae1    # 0.83f

    .line 523
    .line 524
    .line 525
    const v13, -0x41f0a3d7    # -0.14f

    .line 526
    .line 527
    .line 528
    const/high16 v14, 0x3e800000    # 0.25f

    .line 529
    .line 530
    const v15, -0x415c28f6    # -0.32f

    .line 531
    .line 532
    .line 533
    const v16, 0x3f07ae14    # 0.53f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, -0x409eb852    # -0.88f

    .line 540
    .line 541
    .line 542
    const v18, 0x3f83d70a    # 1.03f

    .line 543
    .line 544
    .line 545
    const v13, -0x41947ae1    # -0.23f

    .line 546
    .line 547
    .line 548
    const v14, 0x3e99999a    # 0.3f

    .line 549
    .line 550
    .line 551
    const v15, -0x40fae148    # -0.52f

    .line 552
    .line 553
    .line 554
    const v16, 0x3f266666    # 0.65f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, -0x3f7a8f5c    # -4.17f

    .line 561
    .line 562
    .line 563
    const v2, 0x4091999a    # 4.55f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v0, 0x41900000    # 18.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v0, 0x41a80000    # 21.0f

    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v0, -0x40251eb8    # -1.71f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, -0x3f41999a    # -5.95f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const/high16 v0, 0x41300000    # 11.0f

    .line 595
    .line 596
    const/high16 v2, 0x40000000    # 2.0f

    .line 597
    .line 598
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v0, 0x40000000    # 2.0f

    .line 602
    .line 603
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x41000000    # 8.0f

    .line 607
    .line 608
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v0, -0x40000000    # -2.0f

    .line 612
    .line 613
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v0, 0x40000000    # 2.0f

    .line 617
    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    const/16 v16, 0x3800

    .line 629
    .line 630
    const/16 v17, 0x0

    .line 631
    .line 632
    const/high16 v6, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/high16 v8, 0x3f800000    # 1.0f

    .line 635
    .line 636
    const/4 v7, 0x0

    .line 637
    const/high16 v9, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/high16 v12, 0x3f800000    # 1.0f

    .line 640
    .line 641
    const/4 v13, 0x0

    .line 642
    const/4 v14, 0x0

    .line 643
    const/4 v15, 0x0

    .line 644
    const-string v4, ""

    .line 645
    .line 646
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    sput-object v0, Landroidx/compose/material/icons/filled/ExposureNeg2Kt;->_exposureNeg2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 655
    .line 656
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    return-object v0
.end method

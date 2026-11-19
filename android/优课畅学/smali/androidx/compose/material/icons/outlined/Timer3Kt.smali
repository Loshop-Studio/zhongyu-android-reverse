.class public final Landroidx/compose/material/icons/outlined/Timer3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _timer3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimer3(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/Timer3Kt;->_timer3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Timer3"

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
    const v0, 0x4139c28f    # 11.61f

    .line 71
    .line 72
    .line 73
    const v2, 0x414f851f    # 12.97f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40e147ae    # -0.62f

    .line 80
    .line 81
    .line 82
    const v18, -0x40d9999a    # -0.65f

    .line 83
    .line 84
    .line 85
    const v13, -0x41dc28f6    # -0.16f

    .line 86
    .line 87
    .line 88
    const v14, -0x418a3d71    # -0.24f

    .line 89
    .line 90
    .line 91
    const v15, -0x4147ae14    # -0.36f

    .line 92
    .line 93
    .line 94
    const v16, -0x41147ae1    # -0.46f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x4091eb85    # -0.93f

    .line 101
    .line 102
    .line 103
    const v18, -0x410a3d71    # -0.48f

    .line 104
    .line 105
    .line 106
    const/high16 v13, -0x41800000    # -0.25f

    .line 107
    .line 108
    const v14, -0x41bd70a4    # -0.19f

    .line 109
    .line 110
    .line 111
    const v15, -0x40f0a3d7    # -0.56f

    .line 112
    .line 113
    .line 114
    const v16, -0x414ccccd    # -0.35f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v17, 0x3f4ccccd    # 0.8f

    .line 121
    .line 122
    .line 123
    const/high16 v18, -0x41000000    # -0.5f

    .line 124
    .line 125
    const v13, 0x3e99999a    # 0.3f

    .line 126
    .line 127
    .line 128
    const v14, -0x41f0a3d7    # -0.14f

    .line 129
    .line 130
    .line 131
    const v15, 0x3f11eb85    # 0.57f

    .line 132
    .line 133
    .line 134
    const v16, -0x41666666    # -0.3f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x3f11eb85    # 0.57f

    .line 141
    .line 142
    .line 143
    const v18, -0x40dc28f6    # -0.64f

    .line 144
    .line 145
    .line 146
    const v13, 0x3e6b851f    # 0.23f

    .line 147
    .line 148
    .line 149
    const v14, -0x41b33333    # -0.2f

    .line 150
    .line 151
    .line 152
    const v15, 0x3ed70a3d    # 0.42f

    .line 153
    .line 154
    .line 155
    const v16, -0x412e147b    # -0.41f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, 0x3eae147b    # 0.34f

    .line 162
    .line 163
    .line 164
    const v18, -0x40ca3d71    # -0.71f

    .line 165
    .line 166
    .line 167
    const v13, 0x3e19999a    # 0.15f

    .line 168
    .line 169
    .line 170
    const v14, -0x41947ae1    # -0.23f

    .line 171
    .line 172
    .line 173
    const v15, 0x3e8a3d71    # 0.27f

    .line 174
    .line 175
    .line 176
    const v16, -0x41147ae1    # -0.46f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, 0x3de147ae    # 0.11f

    .line 183
    .line 184
    .line 185
    const v18, -0x40c51eb8    # -0.73f

    .line 186
    .line 187
    .line 188
    const v13, 0x3da3d70a    # 0.08f

    .line 189
    .line 190
    .line 191
    const v14, -0x418a3d71    # -0.24f

    .line 192
    .line 193
    .line 194
    const v15, 0x3de147ae    # 0.11f

    .line 195
    .line 196
    .line 197
    const v16, -0x41051eb8    # -0.49f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, -0x4170a3d7    # -0.28f

    .line 204
    .line 205
    .line 206
    const v18, -0x40451eb8    # -1.46f

    .line 207
    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    const v14, -0x40f33333    # -0.55f

    .line 211
    .line 212
    .line 213
    const v15, -0x4247ae14    # -0.09f

    .line 214
    .line 215
    .line 216
    const v16, -0x407ae148    # -1.04f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x40b851ec    # -0.78f

    .line 223
    .line 224
    .line 225
    const v18, -0x407851ec    # -1.06f

    .line 226
    .line 227
    .line 228
    const v13, -0x41c7ae14    # -0.18f

    .line 229
    .line 230
    .line 231
    const v14, -0x4128f5c3    # -0.42f

    .line 232
    .line 233
    .line 234
    const v15, -0x411eb852    # -0.44f

    .line 235
    .line 236
    .line 237
    const v16, -0x40bae148    # -0.77f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, -0x40666666    # -1.2f

    .line 244
    .line 245
    .line 246
    const v18, -0x40dc28f6    # -0.64f

    .line 247
    .line 248
    .line 249
    const v13, -0x41570a3d    # -0.33f

    .line 250
    .line 251
    .line 252
    const v14, -0x4170a3d7    # -0.28f

    .line 253
    .line 254
    .line 255
    const v15, -0x40c51eb8    # -0.73f

    .line 256
    .line 257
    .line 258
    const/high16 v16, -0x41000000    # -0.5f

    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, -0x403c28f6    # -1.53f

    .line 264
    .line 265
    .line 266
    const v18, -0x41b33333    # -0.2f

    .line 267
    .line 268
    .line 269
    const v13, -0x4119999a    # -0.45f

    .line 270
    .line 271
    .line 272
    const v14, -0x41fae148    # -0.13f

    .line 273
    .line 274
    .line 275
    const v15, -0x4087ae14    # -0.97f

    .line 276
    .line 277
    .line 278
    const v16, -0x41b33333    # -0.2f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, -0x403d70a4    # -1.52f

    .line 285
    .line 286
    .line 287
    const v18, 0x3e75c28f    # 0.24f

    .line 288
    .line 289
    .line 290
    const v13, -0x40f33333    # -0.55f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const v15, -0x407851ec    # -1.06f

    .line 295
    .line 296
    .line 297
    const v16, 0x3da3d70a    # 0.08f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, -0x40666666    # -1.2f

    .line 304
    .line 305
    .line 306
    const v18, 0x3f30a3d7    # 0.69f

    .line 307
    .line 308
    .line 309
    const v13, -0x410f5c29    # -0.47f

    .line 310
    .line 311
    .line 312
    const v14, 0x3e2e147b    # 0.17f

    .line 313
    .line 314
    .line 315
    const v15, -0x40a147ae    # -0.87f

    .line 316
    .line 317
    .line 318
    const v16, 0x3ecccccd    # 0.4f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, -0x40b851ec    # -0.78f

    .line 325
    .line 326
    .line 327
    const v18, 0x3f83d70a    # 1.03f

    .line 328
    .line 329
    .line 330
    const v13, -0x41570a3d    # -0.33f

    .line 331
    .line 332
    .line 333
    const v14, 0x3e947ae1    # 0.29f

    .line 334
    .line 335
    .line 336
    const v15, -0x40e66666    # -0.6f

    .line 337
    .line 338
    .line 339
    const v16, 0x3f2147ae    # 0.63f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v17, -0x416b851f    # -0.29f

    .line 346
    .line 347
    .line 348
    const v18, 0x3fa51eb8    # 1.29f

    .line 349
    .line 350
    .line 351
    const v13, -0x41b33333    # -0.2f

    .line 352
    .line 353
    .line 354
    const v14, 0x3ec7ae14    # 0.39f

    .line 355
    .line 356
    .line 357
    const v15, -0x416b851f    # -0.29f

    .line 358
    .line 359
    .line 360
    const v16, 0x3f547ae1    # 0.83f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x3ffd70a4    # 1.98f

    .line 367
    .line 368
    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, 0x3e0f5c29    # 0.14f

    .line 373
    .line 374
    .line 375
    const v18, -0x40cf5c29    # -0.69f

    .line 376
    .line 377
    .line 378
    const/4 v13, 0x0

    .line 379
    const v14, -0x417ae148    # -0.26f

    .line 380
    .line 381
    .line 382
    const v15, 0x3d4ccccd    # 0.05f

    .line 383
    .line 384
    .line 385
    const v16, -0x41051eb8    # -0.49f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x3ec28f5c    # 0.38f

    .line 392
    .line 393
    .line 394
    const v18, -0x40fae148    # -0.52f

    .line 395
    .line 396
    .line 397
    const v13, 0x3db851ec    # 0.09f

    .line 398
    .line 399
    .line 400
    const v14, -0x41b33333    # -0.2f

    .line 401
    .line 402
    .line 403
    const v15, 0x3e6147ae    # 0.22f

    .line 404
    .line 405
    .line 406
    const v16, -0x413d70a4    # -0.38f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x3f147ae1    # 0.58f

    .line 413
    .line 414
    .line 415
    const v18, -0x41570a3d    # -0.33f

    .line 416
    .line 417
    .line 418
    const v13, 0x3e2e147b    # 0.17f

    .line 419
    .line 420
    .line 421
    const v14, -0x41f0a3d7    # -0.14f

    .line 422
    .line 423
    .line 424
    const v15, 0x3eb851ec    # 0.36f

    .line 425
    .line 426
    .line 427
    const/high16 v16, -0x41800000    # -0.25f

    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x3eeb851f    # 0.46f

    .line 433
    .line 434
    .line 435
    const v2, 0x3f3ae148    # 0.73f

    .line 436
    .line 437
    .line 438
    const v4, -0x420a3d71    # -0.12f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3fae147b    # 1.36f

    .line 445
    .line 446
    .line 447
    const v18, 0x3ef0a3d7    # 0.47f

    .line 448
    .line 449
    .line 450
    const v13, 0x3f1c28f6    # 0.61f

    .line 451
    .line 452
    .line 453
    const/4 v14, 0x0

    .line 454
    const v15, 0x3f87ae14    # 1.06f

    .line 455
    .line 456
    .line 457
    const v16, 0x3e23d70a    # 0.16f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, 0x3ee147ae    # 0.44f

    .line 464
    .line 465
    .line 466
    const v18, 0x3fa8f5c3    # 1.32f

    .line 467
    .line 468
    .line 469
    const v13, 0x3e99999a    # 0.3f

    .line 470
    .line 471
    .line 472
    const v14, 0x3e9eb852    # 0.31f

    .line 473
    .line 474
    .line 475
    const v15, 0x3ee147ae    # 0.44f

    .line 476
    .line 477
    .line 478
    const/high16 v16, 0x3f400000    # 0.75f

    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, -0x420a3d71    # -0.12f

    .line 484
    .line 485
    .line 486
    const v18, 0x3f3d70a4    # 0.74f

    .line 487
    .line 488
    .line 489
    const/4 v13, 0x0

    .line 490
    const v14, 0x3e8a3d71    # 0.27f

    .line 491
    .line 492
    .line 493
    const v15, -0x42dc28f6    # -0.04f

    .line 494
    .line 495
    .line 496
    const v16, 0x3f051eb8    # 0.52f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, -0x413d70a4    # -0.38f

    .line 503
    .line 504
    .line 505
    const v18, 0x3f11eb85    # 0.57f

    .line 506
    .line 507
    .line 508
    const v13, -0x425c28f6    # -0.08f

    .line 509
    .line 510
    .line 511
    const v14, 0x3e6147ae    # 0.22f

    .line 512
    .line 513
    .line 514
    const v15, -0x41a8f5c3    # -0.21f

    .line 515
    .line 516
    .line 517
    const v16, 0x3ed1eb85    # 0.41f

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, 0x3e8f5c29    # 0.28f

    .line 524
    .line 525
    .line 526
    const v2, 0x3ebd70a4    # 0.37f

    .line 527
    .line 528
    .line 529
    const v4, -0x40deb852    # -0.63f

    .line 530
    .line 531
    .line 532
    const v6, -0x413d70a4    # -0.38f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, -0x40f33333    # -0.55f

    .line 539
    .line 540
    .line 541
    const v2, -0x409c28f6    # -0.89f

    .line 542
    .line 543
    .line 544
    const v4, 0x3e051eb8    # 0.13f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x40d70a3d    # 6.72f

    .line 551
    .line 552
    .line 553
    const v2, 0x413170a4    # 11.09f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x3fc8f5c3    # 1.57f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v0, 0x40fccccd    # 7.9f

    .line 566
    .line 567
    .line 568
    const v2, 0x414a8f5c    # 12.66f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v17, 0x3f68f5c3    # 0.91f

    .line 575
    .line 576
    .line 577
    const v18, 0x3de147ae    # 0.11f

    .line 578
    .line 579
    .line 580
    const v13, 0x3eae147b    # 0.34f

    .line 581
    .line 582
    .line 583
    const/4 v14, 0x0

    .line 584
    const v15, 0x3f23d70a    # 0.64f

    .line 585
    .line 586
    .line 587
    const v16, 0x3d23d70a    # 0.04f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v17, 0x3f30a3d7    # 0.69f

    .line 594
    .line 595
    .line 596
    const v18, 0x3eb33333    # 0.35f

    .line 597
    .line 598
    .line 599
    const v13, 0x3e8a3d71    # 0.27f

    .line 600
    .line 601
    .line 602
    const v14, 0x3da3d70a    # 0.08f

    .line 603
    .line 604
    .line 605
    const/high16 v15, 0x3f000000    # 0.5f

    .line 606
    .line 607
    const v16, 0x3e428f5c    # 0.19f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, 0x3ee147ae    # 0.44f

    .line 614
    .line 615
    .line 616
    const v18, 0x3f1c28f6    # 0.61f

    .line 617
    .line 618
    .line 619
    const v13, 0x3e428f5c    # 0.19f

    .line 620
    .line 621
    .line 622
    const v14, 0x3e23d70a    # 0.16f

    .line 623
    .line 624
    .line 625
    const v15, 0x3eae147b    # 0.34f

    .line 626
    .line 627
    .line 628
    const v16, 0x3eb851ec    # 0.36f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v17, 0x3e23d70a    # 0.16f

    .line 635
    .line 636
    .line 637
    const v18, 0x3f5eb852    # 0.87f

    .line 638
    .line 639
    .line 640
    const v13, 0x3dcccccd    # 0.1f

    .line 641
    .line 642
    .line 643
    const v14, 0x3e75c28f    # 0.24f

    .line 644
    .line 645
    .line 646
    const v15, 0x3e23d70a    # 0.16f

    .line 647
    .line 648
    .line 649
    const v16, 0x3f0a3d71    # 0.54f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v17, -0x40f851ec    # -0.53f

    .line 656
    .line 657
    .line 658
    const v18, 0x3fb5c28f    # 1.42f

    .line 659
    .line 660
    .line 661
    const/4 v13, 0x0

    .line 662
    const v14, 0x3f1eb852    # 0.62f

    .line 663
    .line 664
    .line 665
    const v15, -0x41c7ae14    # -0.18f

    .line 666
    .line 667
    .line 668
    const v16, 0x3f8b851f    # 1.09f

    .line 669
    .line 670
    .line 671
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v17, -0x40466666    # -1.45f

    .line 675
    .line 676
    .line 677
    const v18, 0x3efae148    # 0.49f

    .line 678
    .line 679
    .line 680
    const v13, -0x414ccccd    # -0.35f

    .line 681
    .line 682
    .line 683
    const v14, 0x3ea8f5c3    # 0.33f

    .line 684
    .line 685
    .line 686
    const v15, -0x40a8f5c3    # -0.84f

    .line 687
    .line 688
    .line 689
    const v16, 0x3efae148    # 0.49f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v17, -0x40b33333    # -0.8f

    .line 696
    .line 697
    .line 698
    const v18, -0x41fae148    # -0.13f

    .line 699
    .line 700
    .line 701
    const v13, -0x416b851f    # -0.29f

    .line 702
    .line 703
    .line 704
    const/4 v14, 0x0

    .line 705
    const v15, -0x40f0a3d7    # -0.56f

    .line 706
    .line 707
    .line 708
    const v16, -0x42dc28f6    # -0.04f

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, -0x40e3d70a    # -0.61f

    .line 715
    .line 716
    .line 717
    const v18, -0x4147ae14    # -0.36f

    .line 718
    .line 719
    .line 720
    const v13, -0x418a3d71    # -0.24f

    .line 721
    .line 722
    .line 723
    const v14, -0x425c28f6    # -0.08f

    .line 724
    .line 725
    .line 726
    const v15, -0x411eb852    # -0.44f

    .line 727
    .line 728
    .line 729
    const v16, -0x41b33333    # -0.2f

    .line 730
    .line 731
    .line 732
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const v0, -0x40f0a3d7    # -0.56f

    .line 736
    .line 737
    .line 738
    const v2, -0x413851ec    # -0.39f

    .line 739
    .line 740
    .line 741
    const v4, -0x4151eb85    # -0.34f

    .line 742
    .line 743
    .line 744
    const v6, -0x41666666    # -0.3f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v17, -0x41f0a3d7    # -0.14f

    .line 751
    .line 752
    .line 753
    const v18, -0x40c7ae14    # -0.72f

    .line 754
    .line 755
    .line 756
    const v13, -0x4247ae14    # -0.09f

    .line 757
    .line 758
    .line 759
    const v14, -0x419eb852    # -0.22f

    .line 760
    .line 761
    .line 762
    const v15, -0x41f0a3d7    # -0.14f

    .line 763
    .line 764
    .line 765
    const v16, -0x41147ae1    # -0.46f

    .line 766
    .line 767
    .line 768
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v0, 0x4086147b    # 4.19f

    .line 772
    .line 773
    .line 774
    const v2, 0x416bd70a    # 14.74f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const v17, 0x3ea3d70a    # 0.32f

    .line 781
    .line 782
    .line 783
    const v18, 0x3fb9999a    # 1.45f

    .line 784
    .line 785
    .line 786
    const/4 v13, 0x0

    .line 787
    const v14, 0x3f0ccccd    # 0.55f

    .line 788
    .line 789
    .line 790
    const v15, 0x3de147ae    # 0.11f

    .line 791
    .line 792
    .line 793
    const v16, 0x3f83d70a    # 1.03f

    .line 794
    .line 795
    .line 796
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 797
    .line 798
    .line 799
    const v17, 0x3f5c28f6    # 0.86f

    .line 800
    .line 801
    .line 802
    const v18, 0x3f866666    # 1.05f

    .line 803
    .line 804
    .line 805
    const v13, 0x3e570a3d    # 0.21f

    .line 806
    .line 807
    .line 808
    const v14, 0x3ed70a3d    # 0.42f

    .line 809
    .line 810
    .line 811
    const/high16 v15, 0x3f000000    # 0.5f

    .line 812
    .line 813
    const v16, 0x3f451eb8    # 0.77f

    .line 814
    .line 815
    .line 816
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 817
    .line 818
    .line 819
    const v0, 0x3f9eb852    # 1.24f

    .line 820
    .line 821
    .line 822
    const v2, 0x3f2147ae    # 0.63f

    .line 823
    .line 824
    .line 825
    const v4, 0x3f451eb8    # 0.77f

    .line 826
    .line 827
    .line 828
    const v6, 0x3efae148    # 0.49f

    .line 829
    .line 830
    .line 831
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 832
    .line 833
    .line 834
    const v0, 0x3fbd70a4    # 1.48f

    .line 835
    .line 836
    .line 837
    const v2, 0x3e570a3d    # 0.21f

    .line 838
    .line 839
    .line 840
    const v4, 0x3f75c28f    # 0.96f

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v17, 0x3fca3d71    # 1.58f

    .line 847
    .line 848
    .line 849
    const v18, -0x41947ae1    # -0.23f

    .line 850
    .line 851
    .line 852
    const v13, 0x3f11eb85    # 0.57f

    .line 853
    .line 854
    .line 855
    const/4 v14, 0x0

    .line 856
    const v15, 0x3f8b851f    # 1.09f

    .line 857
    .line 858
    .line 859
    const v16, -0x425c28f6    # -0.08f

    .line 860
    .line 861
    .line 862
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const v0, 0x3fa147ae    # 1.26f

    .line 866
    .line 867
    .line 868
    const v2, -0x40d1eb85    # -0.68f

    .line 869
    .line 870
    .line 871
    const v4, -0x413d70a4    # -0.38f

    .line 872
    .line 873
    .line 874
    const v6, 0x3f68f5c3    # 0.91f

    .line 875
    .line 876
    .line 877
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v17, 0x3f570a3d    # 0.84f

    .line 881
    .line 882
    .line 883
    const v18, -0x40733333    # -1.1f

    .line 884
    .line 885
    .line 886
    const v13, 0x3eb851ec    # 0.36f

    .line 887
    .line 888
    .line 889
    const v14, -0x41666666    # -0.3f

    .line 890
    .line 891
    .line 892
    const v15, 0x3f23d70a    # 0.64f

    .line 893
    .line 894
    .line 895
    const v16, -0x40d70a3d    # -0.66f

    .line 896
    .line 897
    .line 898
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    const v17, 0x3e99999a    # 0.3f

    .line 902
    .line 903
    .line 904
    const v18, -0x40428f5c    # -1.48f

    .line 905
    .line 906
    .line 907
    const v13, 0x3e4ccccd    # 0.2f

    .line 908
    .line 909
    .line 910
    const v14, -0x4123d70a    # -0.43f

    .line 911
    .line 912
    .line 913
    const v15, 0x3e99999a    # 0.3f

    .line 914
    .line 915
    .line 916
    const v16, -0x4091eb85    # -0.93f

    .line 917
    .line 918
    .line 919
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const v17, -0x421eb852    # -0.11f

    .line 923
    .line 924
    .line 925
    const v18, -0x40a3d70a    # -0.86f

    .line 926
    .line 927
    .line 928
    const/4 v13, 0x0

    .line 929
    const v14, -0x416b851f    # -0.29f

    .line 930
    .line 931
    .line 932
    const v15, -0x42dc28f6    # -0.04f

    .line 933
    .line 934
    .line 935
    const v16, -0x40eb851f    # -0.58f

    .line 936
    .line 937
    .line 938
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    const v17, -0x414ccccd    # -0.35f

    .line 942
    .line 943
    .line 944
    const v18, -0x40bd70a4    # -0.76f

    .line 945
    .line 946
    .line 947
    const v13, -0x425c28f6    # -0.08f

    .line 948
    .line 949
    .line 950
    const/high16 v14, -0x41800000    # -0.25f

    .line 951
    .line 952
    const v15, -0x41bd70a4    # -0.19f

    .line 953
    .line 954
    .line 955
    const v16, -0x40fd70a4    # -0.51f

    .line 956
    .line 957
    .line 958
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const v0, 0x41a6f5c3    # 20.87f

    .line 965
    .line 966
    .line 967
    const v2, 0x4165eb85    # 14.37f

    .line 968
    .line 969
    .line 970
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const v17, -0x40deb852    # -0.63f

    .line 974
    .line 975
    .line 976
    const v18, -0x40c28f5c    # -0.74f

    .line 977
    .line 978
    .line 979
    const v13, -0x41f0a3d7    # -0.14f

    .line 980
    .line 981
    .line 982
    const v14, -0x4170a3d7    # -0.28f

    .line 983
    .line 984
    .line 985
    const v15, -0x414ccccd    # -0.35f

    .line 986
    .line 987
    .line 988
    const v16, -0x40f851ec    # -0.53f

    .line 989
    .line 990
    .line 991
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    const v17, -0x407eb852    # -1.01f

    .line 995
    .line 996
    .line 997
    const v18, -0x40f851ec    # -0.53f

    .line 998
    .line 999
    .line 1000
    const v13, -0x4170a3d7    # -0.28f

    .line 1001
    .line 1002
    .line 1003
    const v14, -0x41a8f5c3    # -0.21f

    .line 1004
    .line 1005
    .line 1006
    const v15, -0x40e3d70a    # -0.61f

    .line 1007
    .line 1008
    .line 1009
    const v16, -0x413851ec    # -0.39f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v0, -0x4175c28f    # -0.27f

    .line 1016
    .line 1017
    .line 1018
    const v2, -0x40533333    # -1.35f

    .line 1019
    .line 1020
    .line 1021
    const v6, -0x40a66666    # -0.85f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v17, -0x40a147ae    # -0.87f

    .line 1028
    .line 1029
    .line 1030
    const v18, -0x41947ae1    # -0.23f

    .line 1031
    .line 1032
    .line 1033
    const v13, -0x414ccccd    # -0.35f

    .line 1034
    .line 1035
    .line 1036
    const v14, -0x4270a3d7    # -0.07f

    .line 1037
    .line 1038
    .line 1039
    const v15, -0x40dc28f6    # -0.64f

    .line 1040
    .line 1041
    .line 1042
    const v16, -0x41e66666    # -0.15f

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const v17, -0x40f33333    # -0.55f

    .line 1049
    .line 1050
    .line 1051
    const/high16 v18, -0x41800000    # -0.25f

    .line 1052
    .line 1053
    const v13, -0x41947ae1    # -0.23f

    .line 1054
    .line 1055
    .line 1056
    const v14, -0x425c28f6    # -0.08f

    .line 1057
    .line 1058
    .line 1059
    const v15, -0x412e147b    # -0.41f

    .line 1060
    .line 1061
    .line 1062
    const v16, -0x41dc28f6    # -0.16f

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    const v0, -0x41bd70a4    # -0.19f

    .line 1069
    .line 1070
    .line 1071
    const v2, -0x4170a3d7    # -0.28f

    .line 1072
    .line 1073
    .line 1074
    const v4, -0x41666666    # -0.3f

    .line 1075
    .line 1076
    .line 1077
    const v6, -0x41947ae1    # -0.23f

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1081
    .line 1082
    .line 1083
    const v17, -0x425c28f6    # -0.08f

    .line 1084
    .line 1085
    .line 1086
    const v18, -0x413851ec    # -0.39f

    .line 1087
    .line 1088
    .line 1089
    const v13, -0x42b33333    # -0.05f

    .line 1090
    .line 1091
    .line 1092
    const v14, -0x421eb852    # -0.11f

    .line 1093
    .line 1094
    .line 1095
    const v15, -0x425c28f6    # -0.08f

    .line 1096
    .line 1097
    .line 1098
    const v16, -0x418a3d71    # -0.24f

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1102
    .line 1103
    .line 1104
    const v0, 0x3db851ec    # 0.09f

    .line 1105
    .line 1106
    .line 1107
    const v2, -0x412e147b    # -0.41f

    .line 1108
    .line 1109
    .line 1110
    const v4, -0x4170a3d7    # -0.28f

    .line 1111
    .line 1112
    .line 1113
    const v6, 0x3cf5c28f    # 0.03f

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    const/high16 v0, -0x41800000    # -0.25f

    .line 1120
    .line 1121
    const v2, 0x3e8a3d71    # 0.27f

    .line 1122
    .line 1123
    .line 1124
    const v4, -0x4151eb85    # -0.34f

    .line 1125
    .line 1126
    .line 1127
    const v6, 0x3e19999a    # 0.15f

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const v17, 0x3ee66666    # 0.45f

    .line 1134
    .line 1135
    .line 1136
    const v18, -0x418a3d71    # -0.24f

    .line 1137
    .line 1138
    .line 1139
    const v13, 0x3df5c28f    # 0.12f

    .line 1140
    .line 1141
    .line 1142
    const v14, -0x42333333    # -0.1f

    .line 1143
    .line 1144
    .line 1145
    const v15, 0x3e8a3d71    # 0.27f

    .line 1146
    .line 1147
    .line 1148
    const v16, -0x41c7ae14    # -0.18f

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const v0, 0x3ecccccd    # 0.4f

    .line 1155
    .line 1156
    .line 1157
    const v2, 0x3f23d70a    # 0.64f

    .line 1158
    .line 1159
    .line 1160
    const v4, -0x4247ae14    # -0.09f

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1164
    .line 1165
    .line 1166
    const v17, 0x3f28f5c3    # 0.66f

    .line 1167
    .line 1168
    .line 1169
    const v18, 0x3de147ae    # 0.11f

    .line 1170
    .line 1171
    .line 1172
    const/high16 v13, 0x3e800000    # 0.25f

    .line 1173
    .line 1174
    const/4 v14, 0x0

    .line 1175
    const v15, 0x3ef0a3d7    # 0.47f

    .line 1176
    .line 1177
    .line 1178
    const v16, 0x3d23d70a    # 0.04f

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1182
    .line 1183
    .line 1184
    const v0, 0x3e2e147b    # 0.17f

    .line 1185
    .line 1186
    .line 1187
    const v2, 0x3ef5c28f    # 0.48f

    .line 1188
    .line 1189
    .line 1190
    const v4, 0x3e947ae1    # 0.29f

    .line 1191
    .line 1192
    .line 1193
    const v6, 0x3eb33333    # 0.35f

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1197
    .line 1198
    .line 1199
    const v0, 0x3e851eb8    # 0.26f

    .line 1200
    .line 1201
    .line 1202
    const v2, 0x3ed70a3d    # 0.42f

    .line 1203
    .line 1204
    .line 1205
    const v6, 0x3e6147ae    # 0.22f

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const v17, 0x3dcccccd    # 0.1f

    .line 1212
    .line 1213
    .line 1214
    const v18, 0x3efae148    # 0.49f

    .line 1215
    .line 1216
    .line 1217
    const v13, 0x3d75c28f    # 0.06f

    .line 1218
    .line 1219
    .line 1220
    const v14, 0x3e23d70a    # 0.16f

    .line 1221
    .line 1222
    .line 1223
    const v15, 0x3dcccccd    # 0.1f

    .line 1224
    .line 1225
    .line 1226
    const v16, 0x3ea3d70a    # 0.32f

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1230
    .line 1231
    .line 1232
    const v0, 0x3ff9999a    # 1.95f

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    .line 1238
    const v17, -0x418a3d71    # -0.24f

    .line 1239
    .line 1240
    .line 1241
    const v18, -0x40747ae1    # -1.09f

    .line 1242
    .line 1243
    .line 1244
    const/4 v13, 0x0

    .line 1245
    const v14, -0x413851ec    # -0.39f

    .line 1246
    .line 1247
    .line 1248
    const v15, -0x425c28f6    # -0.08f

    .line 1249
    .line 1250
    .line 1251
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1252
    .line 1253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1254
    .line 1255
    .line 1256
    const v0, -0x40cf5c29    # -0.69f

    .line 1257
    .line 1258
    .line 1259
    const v2, -0x409eb852    # -0.88f

    .line 1260
    .line 1261
    .line 1262
    const v4, -0x413851ec    # -0.39f

    .line 1263
    .line 1264
    .line 1265
    const v6, -0x40deb852    # -0.63f

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1269
    .line 1270
    .line 1271
    const v17, -0x40747ae1    # -1.09f

    .line 1272
    .line 1273
    .line 1274
    const v18, -0x40e8f5c3    # -0.59f

    .line 1275
    .line 1276
    .line 1277
    const v13, -0x41666666    # -0.3f

    .line 1278
    .line 1279
    .line 1280
    const/high16 v14, -0x41800000    # -0.25f

    .line 1281
    .line 1282
    const v15, -0x40d70a3d    # -0.66f

    .line 1283
    .line 1284
    .line 1285
    const v16, -0x411eb852    # -0.44f

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1289
    .line 1290
    .line 1291
    const v17, -0x40451eb8    # -1.46f

    .line 1292
    .line 1293
    .line 1294
    const v18, -0x419eb852    # -0.22f

    .line 1295
    .line 1296
    .line 1297
    const v13, -0x4123d70a    # -0.43f

    .line 1298
    .line 1299
    .line 1300
    const v14, -0x41e66666    # -0.15f

    .line 1301
    .line 1302
    .line 1303
    const v15, -0x40947ae1    # -0.92f

    .line 1304
    .line 1305
    .line 1306
    const v16, -0x419eb852    # -0.22f

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1310
    .line 1311
    .line 1312
    const v17, -0x404e147b    # -1.39f

    .line 1313
    .line 1314
    .line 1315
    const v18, 0x3e570a3d    # 0.21f

    .line 1316
    .line 1317
    .line 1318
    const v13, -0x40fd70a4    # -0.51f

    .line 1319
    .line 1320
    .line 1321
    const/4 v14, 0x0

    .line 1322
    const v15, -0x40851eb8    # -0.98f

    .line 1323
    .line 1324
    .line 1325
    const v16, 0x3d8f5c29    # 0.07f

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1329
    .line 1330
    .line 1331
    const v0, 0x3ea8f5c3    # 0.33f

    .line 1332
    .line 1333
    .line 1334
    const v2, -0x407851ec    # -1.06f

    .line 1335
    .line 1336
    .line 1337
    const v4, 0x3f11eb85    # 0.57f

    .line 1338
    .line 1339
    .line 1340
    const v6, -0x40bae148    # -0.77f

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1344
    .line 1345
    .line 1346
    const v17, -0x40d47ae1    # -0.67f

    .line 1347
    .line 1348
    .line 1349
    const v18, 0x3f570a3d    # 0.84f

    .line 1350
    .line 1351
    .line 1352
    const v13, -0x416b851f    # -0.29f

    .line 1353
    .line 1354
    .line 1355
    const v14, 0x3e75c28f    # 0.24f

    .line 1356
    .line 1357
    .line 1358
    const v15, -0x40fd70a4    # -0.51f

    .line 1359
    .line 1360
    .line 1361
    const v16, 0x3f051eb8    # 0.52f

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1365
    .line 1366
    .line 1367
    const v0, 0x3f8147ae    # 1.01f

    .line 1368
    .line 1369
    .line 1370
    const v2, 0x3f266666    # 0.65f

    .line 1371
    .line 1372
    .line 1373
    const v4, -0x41947ae1    # -0.23f

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1377
    .line 1378
    .line 1379
    const v0, 0x3f2e147b    # 0.68f

    .line 1380
    .line 1381
    .line 1382
    const v2, 0x3e6b851f    # 0.23f

    .line 1383
    .line 1384
    .line 1385
    const v4, 0x3f75c28f    # 0.96f

    .line 1386
    .line 1387
    .line 1388
    const v6, 0x3da3d70a    # 0.08f

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1392
    .line 1393
    .line 1394
    const v0, 0x3f051eb8    # 0.52f

    .line 1395
    .line 1396
    .line 1397
    const v2, 0x3f23d70a    # 0.64f

    .line 1398
    .line 1399
    .line 1400
    const v4, 0x3ebd70a4    # 0.37f

    .line 1401
    .line 1402
    .line 1403
    const v6, 0x3f3ae148    # 0.73f

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v12, v4, v0, v2, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1407
    .line 1408
    .line 1409
    const v17, 0x3f7ae148    # 0.98f

    .line 1410
    .line 1411
    .line 1412
    const v18, 0x3f07ae14    # 0.53f

    .line 1413
    .line 1414
    .line 1415
    const v13, 0x3e8a3d71    # 0.27f

    .line 1416
    .line 1417
    .line 1418
    const v14, 0x3e570a3d    # 0.21f

    .line 1419
    .line 1420
    .line 1421
    const v15, 0x3f19999a    # 0.6f

    .line 1422
    .line 1423
    .line 1424
    const v16, 0x3ec28f5c    # 0.38f

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1428
    .line 1429
    .line 1430
    const v17, 0x3fa28f5c    # 1.27f

    .line 1431
    .line 1432
    .line 1433
    const v18, 0x3eb851ec    # 0.36f

    .line 1434
    .line 1435
    .line 1436
    const v13, 0x3ec28f5c    # 0.38f

    .line 1437
    .line 1438
    .line 1439
    const v14, 0x3e0f5c29    # 0.14f

    .line 1440
    .line 1441
    .line 1442
    const v15, 0x3f4f5c29    # 0.81f

    .line 1443
    .line 1444
    .line 1445
    const v16, 0x3e851eb8    # 0.26f

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1449
    .line 1450
    .line 1451
    const v17, 0x3f733333    # 0.95f

    .line 1452
    .line 1453
    .line 1454
    const v18, 0x3e851eb8    # 0.26f

    .line 1455
    .line 1456
    .line 1457
    const v13, 0x3ec7ae14    # 0.39f

    .line 1458
    .line 1459
    .line 1460
    const v14, 0x3da3d70a    # 0.08f

    .line 1461
    .line 1462
    .line 1463
    const v15, 0x3f35c28f    # 0.71f

    .line 1464
    .line 1465
    .line 1466
    const v16, 0x3e2e147b    # 0.17f

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1470
    .line 1471
    .line 1472
    const v0, 0x3edc28f6    # 0.43f

    .line 1473
    .line 1474
    .line 1475
    const v2, 0x3e428f5c    # 0.19f

    .line 1476
    .line 1477
    .line 1478
    const v4, 0x3f11eb85    # 0.57f

    .line 1479
    .line 1480
    .line 1481
    const v6, 0x3e947ae1    # 0.29f

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v12, v0, v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1485
    .line 1486
    .line 1487
    const v17, 0x3e8a3d71    # 0.27f

    .line 1488
    .line 1489
    .line 1490
    const v18, 0x3eae147b    # 0.34f

    .line 1491
    .line 1492
    .line 1493
    const v13, 0x3e051eb8    # 0.13f

    .line 1494
    .line 1495
    .line 1496
    const v14, 0x3dcccccd    # 0.1f

    .line 1497
    .line 1498
    .line 1499
    const v15, 0x3e6147ae    # 0.22f

    .line 1500
    .line 1501
    .line 1502
    const v16, 0x3e6147ae    # 0.22f

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1506
    .line 1507
    .line 1508
    const v17, 0x3d8f5c29    # 0.07f

    .line 1509
    .line 1510
    .line 1511
    const v18, 0x3ec7ae14    # 0.39f

    .line 1512
    .line 1513
    .line 1514
    const v13, 0x3d4ccccd    # 0.05f

    .line 1515
    .line 1516
    .line 1517
    const v14, 0x3df5c28f    # 0.12f

    .line 1518
    .line 1519
    .line 1520
    const v15, 0x3d8f5c29    # 0.07f

    .line 1521
    .line 1522
    .line 1523
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1524
    .line 1525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1526
    .line 1527
    .line 1528
    const v17, -0x41333333    # -0.4f

    .line 1529
    .line 1530
    .line 1531
    const v18, 0x3f451eb8    # 0.77f

    .line 1532
    .line 1533
    .line 1534
    const/4 v13, 0x0

    .line 1535
    const v14, 0x3ea3d70a    # 0.32f

    .line 1536
    .line 1537
    .line 1538
    const v15, -0x41fae148    # -0.13f

    .line 1539
    .line 1540
    .line 1541
    const v16, 0x3f11eb85    # 0.57f

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1545
    .line 1546
    .line 1547
    const v0, -0x40d70a3d    # -0.66f

    .line 1548
    .line 1549
    .line 1550
    const v2, -0x406a3d71    # -1.17f

    .line 1551
    .line 1552
    .line 1553
    const v4, 0x3e947ae1    # 0.29f

    .line 1554
    .line 1555
    .line 1556
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1557
    .line 1558
    .line 1559
    const v17, -0x40dc28f6    # -0.64f

    .line 1560
    .line 1561
    .line 1562
    const v18, -0x425c28f6    # -0.08f

    .line 1563
    .line 1564
    .line 1565
    const v13, -0x419eb852    # -0.22f

    .line 1566
    .line 1567
    .line 1568
    const/4 v14, 0x0

    .line 1569
    const v15, -0x4123d70a    # -0.43f

    .line 1570
    .line 1571
    .line 1572
    const v16, -0x435c28f6    # -0.02f

    .line 1573
    .line 1574
    .line 1575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1576
    .line 1577
    .line 1578
    const v17, -0x40f0a3d7    # -0.56f

    .line 1579
    .line 1580
    .line 1581
    const v18, -0x418a3d71    # -0.24f

    .line 1582
    .line 1583
    .line 1584
    const v13, -0x41a8f5c3    # -0.21f

    .line 1585
    .line 1586
    .line 1587
    const v14, -0x42b33333    # -0.05f

    .line 1588
    .line 1589
    .line 1590
    const v15, -0x41333333    # -0.4f

    .line 1591
    .line 1592
    .line 1593
    const v16, -0x41fae148    # -0.13f

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1597
    .line 1598
    .line 1599
    const v17, -0x412e147b    # -0.41f

    .line 1600
    .line 1601
    .line 1602
    const v18, -0x411eb852    # -0.44f

    .line 1603
    .line 1604
    .line 1605
    const v13, -0x41d1eb85    # -0.17f

    .line 1606
    .line 1607
    .line 1608
    const v14, -0x421eb852    # -0.11f

    .line 1609
    .line 1610
    .line 1611
    const v15, -0x41666666    # -0.3f

    .line 1612
    .line 1613
    .line 1614
    const v16, -0x417ae148    # -0.26f

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1618
    .line 1619
    .line 1620
    const v17, -0x41c7ae14    # -0.18f

    .line 1621
    .line 1622
    .line 1623
    const v18, -0x40d47ae1    # -0.67f

    .line 1624
    .line 1625
    .line 1626
    const v13, -0x421eb852    # -0.11f

    .line 1627
    .line 1628
    .line 1629
    const v14, -0x41c7ae14    # -0.18f

    .line 1630
    .line 1631
    .line 1632
    const v15, -0x41d1eb85    # -0.17f

    .line 1633
    .line 1634
    .line 1635
    const v16, -0x412e147b    # -0.41f

    .line 1636
    .line 1637
    .line 1638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1639
    .line 1640
    .line 1641
    const v0, -0x400e147b    # -1.89f

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1645
    .line 1646
    .line 1647
    const v17, 0x3e75c28f    # 0.24f

    .line 1648
    .line 1649
    .line 1650
    const v18, 0x3f866666    # 1.05f

    .line 1651
    .line 1652
    .line 1653
    const/4 v13, 0x0

    .line 1654
    const v14, 0x3eb851ec    # 0.36f

    .line 1655
    .line 1656
    .line 1657
    const v15, 0x3da3d70a    # 0.08f

    .line 1658
    .line 1659
    .line 1660
    const v16, 0x3f35c28f    # 0.71f

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1664
    .line 1665
    .line 1666
    const v0, 0x3f333333    # 0.7f

    .line 1667
    .line 1668
    .line 1669
    const v2, 0x3f6e147b    # 0.93f

    .line 1670
    .line 1671
    .line 1672
    const v4, 0x3f266666    # 0.65f

    .line 1673
    .line 1674
    .line 1675
    const v6, 0x3ec7ae14    # 0.39f

    .line 1676
    .line 1677
    .line 1678
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1679
    .line 1680
    .line 1681
    const v17, 0x3f933333    # 1.15f

    .line 1682
    .line 1683
    .line 1684
    const v18, 0x3f28f5c3    # 0.66f

    .line 1685
    .line 1686
    .line 1687
    const v13, 0x3e9eb852    # 0.31f

    .line 1688
    .line 1689
    .line 1690
    const v14, 0x3e8a3d71    # 0.27f

    .line 1691
    .line 1692
    .line 1693
    const v15, 0x3f30a3d7    # 0.69f

    .line 1694
    .line 1695
    .line 1696
    const v16, 0x3efae148    # 0.49f

    .line 1697
    .line 1698
    .line 1699
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1700
    .line 1701
    .line 1702
    const v17, 0x3fca3d71    # 1.58f

    .line 1703
    .line 1704
    .line 1705
    const/high16 v18, 0x3e800000    # 0.25f

    .line 1706
    .line 1707
    const v13, 0x3eeb851f    # 0.46f

    .line 1708
    .line 1709
    .line 1710
    const v14, 0x3e2e147b    # 0.17f

    .line 1711
    .line 1712
    .line 1713
    const v15, 0x3f7ae148    # 0.98f

    .line 1714
    .line 1715
    .line 1716
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1717
    .line 1718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1719
    .line 1720
    .line 1721
    const v17, 0x3fb851ec    # 1.44f

    .line 1722
    .line 1723
    .line 1724
    const v18, -0x41bd70a4    # -0.19f

    .line 1725
    .line 1726
    .line 1727
    const v13, 0x3f07ae14    # 0.53f

    .line 1728
    .line 1729
    .line 1730
    const/4 v14, 0x0

    .line 1731
    const v15, 0x3f8147ae    # 1.01f

    .line 1732
    .line 1733
    .line 1734
    const v16, -0x428a3d71    # -0.06f

    .line 1735
    .line 1736
    .line 1737
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1738
    .line 1739
    .line 1740
    const v17, 0x3f8e147b    # 1.11f

    .line 1741
    .line 1742
    .line 1743
    const v18, -0x40f5c28f    # -0.54f

    .line 1744
    .line 1745
    .line 1746
    const v13, 0x3edc28f6    # 0.43f

    .line 1747
    .line 1748
    .line 1749
    const v14, -0x41fae148    # -0.13f

    .line 1750
    .line 1751
    .line 1752
    const v15, 0x3f4ccccd    # 0.8f

    .line 1753
    .line 1754
    .line 1755
    const v16, -0x416147ae    # -0.31f

    .line 1756
    .line 1757
    .line 1758
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1759
    .line 1760
    .line 1761
    const v17, 0x3f35c28f    # 0.71f

    .line 1762
    .line 1763
    .line 1764
    const v18, -0x40ab851f    # -0.83f

    .line 1765
    .line 1766
    .line 1767
    const v13, 0x3e9eb852    # 0.31f

    .line 1768
    .line 1769
    .line 1770
    const v14, -0x41947ae1    # -0.23f

    .line 1771
    .line 1772
    .line 1773
    const v15, 0x3f0a3d71    # 0.54f

    .line 1774
    .line 1775
    .line 1776
    const v16, -0x40fd70a4    # -0.51f

    .line 1777
    .line 1778
    .line 1779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1780
    .line 1781
    .line 1782
    const/high16 v17, 0x3e800000    # 0.25f

    .line 1783
    .line 1784
    const v18, -0x407851ec    # -1.06f

    .line 1785
    .line 1786
    .line 1787
    const v13, 0x3e2e147b    # 0.17f

    .line 1788
    .line 1789
    .line 1790
    const v14, -0x415c28f6    # -0.32f

    .line 1791
    .line 1792
    .line 1793
    const/high16 v15, 0x3e800000    # 0.25f

    .line 1794
    .line 1795
    const v16, -0x40d47ae1    # -0.67f

    .line 1796
    .line 1797
    .line 1798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1799
    .line 1800
    .line 1801
    const v17, -0x418a3d71    # -0.24f

    .line 1802
    .line 1803
    .line 1804
    const v18, -0x407d70a4    # -1.02f

    .line 1805
    .line 1806
    .line 1807
    const v13, -0x435c28f6    # -0.02f

    .line 1808
    .line 1809
    .line 1810
    const v14, -0x41333333    # -0.4f

    .line 1811
    .line 1812
    .line 1813
    const v15, -0x4247ae14    # -0.09f

    .line 1814
    .line 1815
    .line 1816
    const v16, -0x40c28f5c    # -0.74f

    .line 1817
    .line 1818
    .line 1819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1820
    .line 1821
    .line 1822
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1823
    .line 1824
    .line 1825
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v2

    .line 1829
    const/16 v16, 0x3800

    .line 1830
    .line 1831
    const/16 v17, 0x0

    .line 1832
    .line 1833
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1834
    .line 1835
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1836
    .line 1837
    const/4 v7, 0x0

    .line 1838
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1839
    .line 1840
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1841
    .line 1842
    const/4 v13, 0x0

    .line 1843
    const/4 v14, 0x0

    .line 1844
    const/4 v15, 0x0

    .line 1845
    const-string v4, ""

    .line 1846
    .line 1847
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v0

    .line 1851
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v0

    .line 1855
    sput-object v0, Landroidx/compose/material/icons/outlined/Timer3Kt;->_timer3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1856
    .line 1857
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1858
    .line 1859
    .line 1860
    return-object v0
.end method

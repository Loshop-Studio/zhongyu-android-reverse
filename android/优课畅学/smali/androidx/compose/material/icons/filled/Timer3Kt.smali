.class public final Landroidx/compose/material/icons/filled/Timer3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _timer3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimer3(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/Timer3Kt;->_timer3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Timer3"

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
    const v17, 0x3f3ae148    # 0.73f

    .line 433
    .line 434
    .line 435
    const v18, -0x420a3d71    # -0.12f

    .line 436
    .line 437
    .line 438
    const v13, 0x3e6147ae    # 0.22f

    .line 439
    .line 440
    .line 441
    const v14, -0x425c28f6    # -0.08f

    .line 442
    .line 443
    .line 444
    const v15, 0x3eeb851f    # 0.46f

    .line 445
    .line 446
    .line 447
    const v16, -0x420a3d71    # -0.12f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x3fae147b    # 1.36f

    .line 454
    .line 455
    .line 456
    const v18, 0x3ef0a3d7    # 0.47f

    .line 457
    .line 458
    .line 459
    const v13, 0x3f1c28f6    # 0.61f

    .line 460
    .line 461
    .line 462
    const/4 v14, 0x0

    .line 463
    const v15, 0x3f87ae14    # 1.06f

    .line 464
    .line 465
    .line 466
    const v16, 0x3e23d70a    # 0.16f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x3ee147ae    # 0.44f

    .line 473
    .line 474
    .line 475
    const v18, 0x3fa8f5c3    # 1.32f

    .line 476
    .line 477
    .line 478
    const v13, 0x3e99999a    # 0.3f

    .line 479
    .line 480
    .line 481
    const v14, 0x3e9eb852    # 0.31f

    .line 482
    .line 483
    .line 484
    const v15, 0x3ee147ae    # 0.44f

    .line 485
    .line 486
    .line 487
    const/high16 v16, 0x3f400000    # 0.75f

    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, -0x420a3d71    # -0.12f

    .line 493
    .line 494
    .line 495
    const v18, 0x3f3d70a4    # 0.74f

    .line 496
    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const v14, 0x3e8a3d71    # 0.27f

    .line 500
    .line 501
    .line 502
    const v15, -0x42dc28f6    # -0.04f

    .line 503
    .line 504
    .line 505
    const v16, 0x3f051eb8    # 0.52f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, -0x413d70a4    # -0.38f

    .line 512
    .line 513
    .line 514
    const v18, 0x3f11eb85    # 0.57f

    .line 515
    .line 516
    .line 517
    const v13, -0x425c28f6    # -0.08f

    .line 518
    .line 519
    .line 520
    const v14, 0x3e6147ae    # 0.22f

    .line 521
    .line 522
    .line 523
    const v15, -0x41a8f5c3    # -0.21f

    .line 524
    .line 525
    .line 526
    const v16, 0x3ed1eb85    # 0.41f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, -0x40deb852    # -0.63f

    .line 533
    .line 534
    .line 535
    const v18, 0x3ebd70a4    # 0.37f

    .line 536
    .line 537
    .line 538
    const v13, -0x41d1eb85    # -0.17f

    .line 539
    .line 540
    .line 541
    const v14, 0x3e23d70a    # 0.16f

    .line 542
    .line 543
    .line 544
    const v15, -0x413d70a4    # -0.38f

    .line 545
    .line 546
    .line 547
    const v16, 0x3e8f5c29    # 0.28f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v17, -0x409c28f6    # -0.89f

    .line 554
    .line 555
    .line 556
    const v18, 0x3e051eb8    # 0.13f

    .line 557
    .line 558
    .line 559
    const/high16 v13, -0x41800000    # -0.25f

    .line 560
    .line 561
    const v14, 0x3db851ec    # 0.09f

    .line 562
    .line 563
    .line 564
    const v15, -0x40f33333    # -0.55f

    .line 565
    .line 566
    .line 567
    const v16, 0x3e051eb8    # 0.13f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x40d70a3d    # 6.72f

    .line 574
    .line 575
    .line 576
    const v2, 0x413170a4    # 11.09f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x3fc8f5c3    # 1.57f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v0, 0x40fccccd    # 7.9f

    .line 589
    .line 590
    .line 591
    const v2, 0x414a8f5c    # 12.66f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, 0x3f68f5c3    # 0.91f

    .line 598
    .line 599
    .line 600
    const v18, 0x3de147ae    # 0.11f

    .line 601
    .line 602
    .line 603
    const v13, 0x3eae147b    # 0.34f

    .line 604
    .line 605
    .line 606
    const/4 v14, 0x0

    .line 607
    const v15, 0x3f23d70a    # 0.64f

    .line 608
    .line 609
    .line 610
    const v16, 0x3d23d70a    # 0.04f

    .line 611
    .line 612
    .line 613
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v17, 0x3f30a3d7    # 0.69f

    .line 617
    .line 618
    .line 619
    const v18, 0x3eb33333    # 0.35f

    .line 620
    .line 621
    .line 622
    const v13, 0x3e8a3d71    # 0.27f

    .line 623
    .line 624
    .line 625
    const v14, 0x3da3d70a    # 0.08f

    .line 626
    .line 627
    .line 628
    const/high16 v15, 0x3f000000    # 0.5f

    .line 629
    .line 630
    const v16, 0x3e428f5c    # 0.19f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v17, 0x3ee147ae    # 0.44f

    .line 637
    .line 638
    .line 639
    const v18, 0x3f1c28f6    # 0.61f

    .line 640
    .line 641
    .line 642
    const v13, 0x3e428f5c    # 0.19f

    .line 643
    .line 644
    .line 645
    const v14, 0x3e23d70a    # 0.16f

    .line 646
    .line 647
    .line 648
    const v15, 0x3eae147b    # 0.34f

    .line 649
    .line 650
    .line 651
    const v16, 0x3eb851ec    # 0.36f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v17, 0x3e23d70a    # 0.16f

    .line 658
    .line 659
    .line 660
    const v18, 0x3f5eb852    # 0.87f

    .line 661
    .line 662
    .line 663
    const v13, 0x3dcccccd    # 0.1f

    .line 664
    .line 665
    .line 666
    const v14, 0x3e75c28f    # 0.24f

    .line 667
    .line 668
    .line 669
    const v15, 0x3e23d70a    # 0.16f

    .line 670
    .line 671
    .line 672
    const v16, 0x3f0a3d71    # 0.54f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v17, -0x40f851ec    # -0.53f

    .line 679
    .line 680
    .line 681
    const v18, 0x3fb5c28f    # 1.42f

    .line 682
    .line 683
    .line 684
    const/4 v13, 0x0

    .line 685
    const v14, 0x3f1eb852    # 0.62f

    .line 686
    .line 687
    .line 688
    const v15, -0x41c7ae14    # -0.18f

    .line 689
    .line 690
    .line 691
    const v16, 0x3f8b851f    # 1.09f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v17, -0x40466666    # -1.45f

    .line 698
    .line 699
    .line 700
    const v18, 0x3efae148    # 0.49f

    .line 701
    .line 702
    .line 703
    const v13, -0x414ccccd    # -0.35f

    .line 704
    .line 705
    .line 706
    const v14, 0x3ea8f5c3    # 0.33f

    .line 707
    .line 708
    .line 709
    const v15, -0x40a8f5c3    # -0.84f

    .line 710
    .line 711
    .line 712
    const v16, 0x3efae148    # 0.49f

    .line 713
    .line 714
    .line 715
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v17, -0x40b33333    # -0.8f

    .line 719
    .line 720
    .line 721
    const v18, -0x41fae148    # -0.13f

    .line 722
    .line 723
    .line 724
    const v13, -0x416b851f    # -0.29f

    .line 725
    .line 726
    .line 727
    const/4 v14, 0x0

    .line 728
    const v15, -0x40f0a3d7    # -0.56f

    .line 729
    .line 730
    .line 731
    const v16, -0x42dc28f6    # -0.04f

    .line 732
    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v17, -0x40e3d70a    # -0.61f

    .line 738
    .line 739
    .line 740
    const v18, -0x4147ae14    # -0.36f

    .line 741
    .line 742
    .line 743
    const v13, -0x418a3d71    # -0.24f

    .line 744
    .line 745
    .line 746
    const v14, -0x425c28f6    # -0.08f

    .line 747
    .line 748
    .line 749
    const v15, -0x411eb852    # -0.44f

    .line 750
    .line 751
    .line 752
    const v16, -0x41b33333    # -0.2f

    .line 753
    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v17, -0x413851ec    # -0.39f

    .line 759
    .line 760
    .line 761
    const v18, -0x40f0a3d7    # -0.56f

    .line 762
    .line 763
    .line 764
    const v13, -0x41d1eb85    # -0.17f

    .line 765
    .line 766
    .line 767
    const v14, -0x41dc28f6    # -0.16f

    .line 768
    .line 769
    .line 770
    const v15, -0x41666666    # -0.3f

    .line 771
    .line 772
    .line 773
    const v16, -0x4151eb85    # -0.34f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const v17, -0x41f0a3d7    # -0.14f

    .line 780
    .line 781
    .line 782
    const v18, -0x40c7ae14    # -0.72f

    .line 783
    .line 784
    .line 785
    const v13, -0x4247ae14    # -0.09f

    .line 786
    .line 787
    .line 788
    const v14, -0x419eb852    # -0.22f

    .line 789
    .line 790
    .line 791
    const v15, -0x41f0a3d7    # -0.14f

    .line 792
    .line 793
    .line 794
    const v16, -0x41147ae1    # -0.46f

    .line 795
    .line 796
    .line 797
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 798
    .line 799
    .line 800
    const v0, 0x4086147b    # 4.19f

    .line 801
    .line 802
    .line 803
    const v2, 0x416bd70a    # 14.74f

    .line 804
    .line 805
    .line 806
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v17, 0x3ea3d70a    # 0.32f

    .line 810
    .line 811
    .line 812
    const v18, 0x3fb9999a    # 1.45f

    .line 813
    .line 814
    .line 815
    const/4 v13, 0x0

    .line 816
    const v14, 0x3f0ccccd    # 0.55f

    .line 817
    .line 818
    .line 819
    const v15, 0x3de147ae    # 0.11f

    .line 820
    .line 821
    .line 822
    const v16, 0x3f83d70a    # 1.03f

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    const v17, 0x3f5c28f6    # 0.86f

    .line 829
    .line 830
    .line 831
    const v18, 0x3f866666    # 1.05f

    .line 832
    .line 833
    .line 834
    const v13, 0x3e570a3d    # 0.21f

    .line 835
    .line 836
    .line 837
    const v14, 0x3ed70a3d    # 0.42f

    .line 838
    .line 839
    .line 840
    const/high16 v15, 0x3f000000    # 0.5f

    .line 841
    .line 842
    const v16, 0x3f451eb8    # 0.77f

    .line 843
    .line 844
    .line 845
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v0, 0x3f9eb852    # 1.24f

    .line 849
    .line 850
    .line 851
    const v2, 0x3f2147ae    # 0.63f

    .line 852
    .line 853
    .line 854
    const v4, 0x3f451eb8    # 0.77f

    .line 855
    .line 856
    .line 857
    const v6, 0x3efae148    # 0.49f

    .line 858
    .line 859
    .line 860
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v0, 0x3fbd70a4    # 1.48f

    .line 864
    .line 865
    .line 866
    const v2, 0x3e570a3d    # 0.21f

    .line 867
    .line 868
    .line 869
    const v4, 0x3f75c28f    # 0.96f

    .line 870
    .line 871
    .line 872
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v17, 0x3fca3d71    # 1.58f

    .line 876
    .line 877
    .line 878
    const v18, -0x41947ae1    # -0.23f

    .line 879
    .line 880
    .line 881
    const v13, 0x3f11eb85    # 0.57f

    .line 882
    .line 883
    .line 884
    const/4 v14, 0x0

    .line 885
    const v15, 0x3f8b851f    # 1.09f

    .line 886
    .line 887
    .line 888
    const v16, -0x425c28f6    # -0.08f

    .line 889
    .line 890
    .line 891
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const v17, 0x3fa147ae    # 1.26f

    .line 895
    .line 896
    .line 897
    const v18, -0x40d1eb85    # -0.68f

    .line 898
    .line 899
    .line 900
    const v13, 0x3efae148    # 0.49f

    .line 901
    .line 902
    .line 903
    const v14, -0x41e66666    # -0.15f

    .line 904
    .line 905
    .line 906
    const v15, 0x3f68f5c3    # 0.91f

    .line 907
    .line 908
    .line 909
    const v16, -0x413d70a4    # -0.38f

    .line 910
    .line 911
    .line 912
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const v17, 0x3f570a3d    # 0.84f

    .line 916
    .line 917
    .line 918
    const v18, -0x40733333    # -1.1f

    .line 919
    .line 920
    .line 921
    const v13, 0x3eb851ec    # 0.36f

    .line 922
    .line 923
    .line 924
    const v14, -0x41666666    # -0.3f

    .line 925
    .line 926
    .line 927
    const v15, 0x3f23d70a    # 0.64f

    .line 928
    .line 929
    .line 930
    const v16, -0x40d70a3d    # -0.66f

    .line 931
    .line 932
    .line 933
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v17, 0x3e99999a    # 0.3f

    .line 937
    .line 938
    .line 939
    const v18, -0x40428f5c    # -1.48f

    .line 940
    .line 941
    .line 942
    const v13, 0x3e4ccccd    # 0.2f

    .line 943
    .line 944
    .line 945
    const v14, -0x4123d70a    # -0.43f

    .line 946
    .line 947
    .line 948
    const v15, 0x3e99999a    # 0.3f

    .line 949
    .line 950
    .line 951
    const v16, -0x4091eb85    # -0.93f

    .line 952
    .line 953
    .line 954
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 955
    .line 956
    .line 957
    const v17, -0x421eb852    # -0.11f

    .line 958
    .line 959
    .line 960
    const v18, -0x40a3d70a    # -0.86f

    .line 961
    .line 962
    .line 963
    const/4 v13, 0x0

    .line 964
    const v14, -0x416b851f    # -0.29f

    .line 965
    .line 966
    .line 967
    const v15, -0x42dc28f6    # -0.04f

    .line 968
    .line 969
    .line 970
    const v16, -0x40eb851f    # -0.58f

    .line 971
    .line 972
    .line 973
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const v17, -0x414ccccd    # -0.35f

    .line 977
    .line 978
    .line 979
    const v18, -0x40bd70a4    # -0.76f

    .line 980
    .line 981
    .line 982
    const v13, -0x425c28f6    # -0.08f

    .line 983
    .line 984
    .line 985
    const/high16 v14, -0x41800000    # -0.25f

    .line 986
    .line 987
    const v15, -0x41bd70a4    # -0.19f

    .line 988
    .line 989
    .line 990
    const v16, -0x40fd70a4    # -0.51f

    .line 991
    .line 992
    .line 993
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 997
    .line 998
    .line 999
    const v0, 0x41a6f5c3    # 20.87f

    .line 1000
    .line 1001
    .line 1002
    const v2, 0x4165eb85    # 14.37f

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1006
    .line 1007
    .line 1008
    const v17, -0x40deb852    # -0.63f

    .line 1009
    .line 1010
    .line 1011
    const v18, -0x40c28f5c    # -0.74f

    .line 1012
    .line 1013
    .line 1014
    const v13, -0x41f0a3d7    # -0.14f

    .line 1015
    .line 1016
    .line 1017
    const v14, -0x4170a3d7    # -0.28f

    .line 1018
    .line 1019
    .line 1020
    const v15, -0x414ccccd    # -0.35f

    .line 1021
    .line 1022
    .line 1023
    const v16, -0x40f851ec    # -0.53f

    .line 1024
    .line 1025
    .line 1026
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1027
    .line 1028
    .line 1029
    const v17, -0x407eb852    # -1.01f

    .line 1030
    .line 1031
    .line 1032
    const v18, -0x40f851ec    # -0.53f

    .line 1033
    .line 1034
    .line 1035
    const v13, -0x4170a3d7    # -0.28f

    .line 1036
    .line 1037
    .line 1038
    const v14, -0x41a8f5c3    # -0.21f

    .line 1039
    .line 1040
    .line 1041
    const v15, -0x40e3d70a    # -0.61f

    .line 1042
    .line 1043
    .line 1044
    const v16, -0x413851ec    # -0.39f

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1048
    .line 1049
    .line 1050
    const v0, -0x40533333    # -1.35f

    .line 1051
    .line 1052
    .line 1053
    const v2, -0x413d70a4    # -0.38f

    .line 1054
    .line 1055
    .line 1056
    const v4, -0x40a66666    # -0.85f

    .line 1057
    .line 1058
    .line 1059
    const v6, -0x4175c28f    # -0.27f

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    const v17, -0x40a147ae    # -0.87f

    .line 1066
    .line 1067
    .line 1068
    const v18, -0x41947ae1    # -0.23f

    .line 1069
    .line 1070
    .line 1071
    const v13, -0x414ccccd    # -0.35f

    .line 1072
    .line 1073
    .line 1074
    const v14, -0x4270a3d7    # -0.07f

    .line 1075
    .line 1076
    .line 1077
    const v15, -0x40dc28f6    # -0.64f

    .line 1078
    .line 1079
    .line 1080
    const v16, -0x41e66666    # -0.15f

    .line 1081
    .line 1082
    .line 1083
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1084
    .line 1085
    .line 1086
    const v17, -0x40f33333    # -0.55f

    .line 1087
    .line 1088
    .line 1089
    const/high16 v18, -0x41800000    # -0.25f

    .line 1090
    .line 1091
    const v13, -0x41947ae1    # -0.23f

    .line 1092
    .line 1093
    .line 1094
    const v14, -0x425c28f6    # -0.08f

    .line 1095
    .line 1096
    .line 1097
    const v15, -0x412e147b    # -0.41f

    .line 1098
    .line 1099
    .line 1100
    const v16, -0x41dc28f6    # -0.16f

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1104
    .line 1105
    .line 1106
    const v17, -0x4170a3d7    # -0.28f

    .line 1107
    .line 1108
    .line 1109
    const v18, -0x41666666    # -0.3f

    .line 1110
    .line 1111
    .line 1112
    const v13, -0x41f0a3d7    # -0.14f

    .line 1113
    .line 1114
    .line 1115
    const v14, -0x4247ae14    # -0.09f

    .line 1116
    .line 1117
    .line 1118
    const v15, -0x41947ae1    # -0.23f

    .line 1119
    .line 1120
    .line 1121
    const v16, -0x41bd70a4    # -0.19f

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1125
    .line 1126
    .line 1127
    const v17, -0x425c28f6    # -0.08f

    .line 1128
    .line 1129
    .line 1130
    const v18, -0x413851ec    # -0.39f

    .line 1131
    .line 1132
    .line 1133
    const v13, -0x42b33333    # -0.05f

    .line 1134
    .line 1135
    .line 1136
    const v14, -0x421eb852    # -0.11f

    .line 1137
    .line 1138
    .line 1139
    const v15, -0x425c28f6    # -0.08f

    .line 1140
    .line 1141
    .line 1142
    const v16, -0x418a3d71    # -0.24f

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1146
    .line 1147
    .line 1148
    const v0, 0x3db851ec    # 0.09f

    .line 1149
    .line 1150
    .line 1151
    const v2, -0x412e147b    # -0.41f

    .line 1152
    .line 1153
    .line 1154
    const v4, 0x3cf5c28f    # 0.03f

    .line 1155
    .line 1156
    .line 1157
    const v6, -0x4170a3d7    # -0.28f

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1161
    .line 1162
    .line 1163
    const v17, 0x3e8a3d71    # 0.27f

    .line 1164
    .line 1165
    .line 1166
    const v18, -0x4151eb85    # -0.34f

    .line 1167
    .line 1168
    .line 1169
    const v13, 0x3d75c28f    # 0.06f

    .line 1170
    .line 1171
    .line 1172
    const v14, -0x41fae148    # -0.13f

    .line 1173
    .line 1174
    .line 1175
    const v15, 0x3e19999a    # 0.15f

    .line 1176
    .line 1177
    .line 1178
    const/high16 v16, -0x41800000    # -0.25f

    .line 1179
    .line 1180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const v17, 0x3ee66666    # 0.45f

    .line 1184
    .line 1185
    .line 1186
    const v18, -0x418a3d71    # -0.24f

    .line 1187
    .line 1188
    .line 1189
    const v13, 0x3df5c28f    # 0.12f

    .line 1190
    .line 1191
    .line 1192
    const v14, -0x42333333    # -0.1f

    .line 1193
    .line 1194
    .line 1195
    const v15, 0x3e8a3d71    # 0.27f

    .line 1196
    .line 1197
    .line 1198
    const v16, -0x41c7ae14    # -0.18f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    const v0, 0x3ecccccd    # 0.4f

    .line 1205
    .line 1206
    .line 1207
    const v2, 0x3f23d70a    # 0.64f

    .line 1208
    .line 1209
    .line 1210
    const v4, -0x4247ae14    # -0.09f

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1214
    .line 1215
    .line 1216
    const v17, 0x3f28f5c3    # 0.66f

    .line 1217
    .line 1218
    .line 1219
    const v18, 0x3de147ae    # 0.11f

    .line 1220
    .line 1221
    .line 1222
    const/high16 v13, 0x3e800000    # 0.25f

    .line 1223
    .line 1224
    const/4 v14, 0x0

    .line 1225
    const v15, 0x3ef0a3d7    # 0.47f

    .line 1226
    .line 1227
    .line 1228
    const v16, 0x3d23d70a    # 0.04f

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1232
    .line 1233
    .line 1234
    const v17, 0x3ef5c28f    # 0.48f

    .line 1235
    .line 1236
    .line 1237
    const v18, 0x3e947ae1    # 0.29f

    .line 1238
    .line 1239
    .line 1240
    const v13, 0x3e428f5c    # 0.19f

    .line 1241
    .line 1242
    .line 1243
    const v14, 0x3d8f5c29    # 0.07f

    .line 1244
    .line 1245
    .line 1246
    const v15, 0x3eb33333    # 0.35f

    .line 1247
    .line 1248
    .line 1249
    const v16, 0x3e2e147b    # 0.17f

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1253
    .line 1254
    .line 1255
    const v17, 0x3e947ae1    # 0.29f

    .line 1256
    .line 1257
    .line 1258
    const v18, 0x3ed70a3d    # 0.42f

    .line 1259
    .line 1260
    .line 1261
    const v13, 0x3e051eb8    # 0.13f

    .line 1262
    .line 1263
    .line 1264
    const v14, 0x3df5c28f    # 0.12f

    .line 1265
    .line 1266
    .line 1267
    const v15, 0x3e6147ae    # 0.22f

    .line 1268
    .line 1269
    .line 1270
    const v16, 0x3e851eb8    # 0.26f

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1274
    .line 1275
    .line 1276
    const v17, 0x3dcccccd    # 0.1f

    .line 1277
    .line 1278
    .line 1279
    const v18, 0x3efae148    # 0.49f

    .line 1280
    .line 1281
    .line 1282
    const v13, 0x3d75c28f    # 0.06f

    .line 1283
    .line 1284
    .line 1285
    const v14, 0x3e23d70a    # 0.16f

    .line 1286
    .line 1287
    .line 1288
    const v15, 0x3dcccccd    # 0.1f

    .line 1289
    .line 1290
    .line 1291
    const v16, 0x3ea3d70a    # 0.32f

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1295
    .line 1296
    .line 1297
    const v0, 0x3ff9999a    # 1.95f

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1301
    .line 1302
    .line 1303
    const v17, -0x418a3d71    # -0.24f

    .line 1304
    .line 1305
    .line 1306
    const v18, -0x40747ae1    # -1.09f

    .line 1307
    .line 1308
    .line 1309
    const/4 v13, 0x0

    .line 1310
    const v14, -0x413851ec    # -0.39f

    .line 1311
    .line 1312
    .line 1313
    const v15, -0x425c28f6    # -0.08f

    .line 1314
    .line 1315
    .line 1316
    const/high16 v16, -0x40c00000    # -0.75f

    .line 1317
    .line 1318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1319
    .line 1320
    .line 1321
    const v17, -0x40cf5c29    # -0.69f

    .line 1322
    .line 1323
    .line 1324
    const v18, -0x409eb852    # -0.88f

    .line 1325
    .line 1326
    .line 1327
    const v13, -0x41dc28f6    # -0.16f

    .line 1328
    .line 1329
    .line 1330
    const v14, -0x4151eb85    # -0.34f

    .line 1331
    .line 1332
    .line 1333
    const v15, -0x413851ec    # -0.39f

    .line 1334
    .line 1335
    .line 1336
    const v16, -0x40deb852    # -0.63f

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1340
    .line 1341
    .line 1342
    const v17, -0x40747ae1    # -1.09f

    .line 1343
    .line 1344
    .line 1345
    const v18, -0x40e8f5c3    # -0.59f

    .line 1346
    .line 1347
    .line 1348
    const v13, -0x41666666    # -0.3f

    .line 1349
    .line 1350
    .line 1351
    const/high16 v14, -0x41800000    # -0.25f

    .line 1352
    .line 1353
    const v15, -0x40d70a3d    # -0.66f

    .line 1354
    .line 1355
    .line 1356
    const v16, -0x411eb852    # -0.44f

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1360
    .line 1361
    .line 1362
    const v17, -0x40451eb8    # -1.46f

    .line 1363
    .line 1364
    .line 1365
    const v18, -0x419eb852    # -0.22f

    .line 1366
    .line 1367
    .line 1368
    const v13, -0x4123d70a    # -0.43f

    .line 1369
    .line 1370
    .line 1371
    const v14, -0x41e66666    # -0.15f

    .line 1372
    .line 1373
    .line 1374
    const v15, -0x40947ae1    # -0.92f

    .line 1375
    .line 1376
    .line 1377
    const v16, -0x419eb852    # -0.22f

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1381
    .line 1382
    .line 1383
    const v17, -0x404e147b    # -1.39f

    .line 1384
    .line 1385
    .line 1386
    const v18, 0x3e570a3d    # 0.21f

    .line 1387
    .line 1388
    .line 1389
    const v13, -0x40fd70a4    # -0.51f

    .line 1390
    .line 1391
    .line 1392
    const/4 v14, 0x0

    .line 1393
    const v15, -0x40851eb8    # -0.98f

    .line 1394
    .line 1395
    .line 1396
    const v16, 0x3d8f5c29    # 0.07f

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1400
    .line 1401
    .line 1402
    const v17, -0x407851ec    # -1.06f

    .line 1403
    .line 1404
    .line 1405
    const v18, 0x3f11eb85    # 0.57f

    .line 1406
    .line 1407
    .line 1408
    const v13, -0x412e147b    # -0.41f

    .line 1409
    .line 1410
    .line 1411
    const v14, 0x3e0f5c29    # 0.14f

    .line 1412
    .line 1413
    .line 1414
    const v15, -0x40bae148    # -0.77f

    .line 1415
    .line 1416
    .line 1417
    const v16, 0x3ea8f5c3    # 0.33f

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1421
    .line 1422
    .line 1423
    const v17, -0x40d47ae1    # -0.67f

    .line 1424
    .line 1425
    .line 1426
    const v18, 0x3f570a3d    # 0.84f

    .line 1427
    .line 1428
    .line 1429
    const v13, -0x416b851f    # -0.29f

    .line 1430
    .line 1431
    .line 1432
    const v14, 0x3e75c28f    # 0.24f

    .line 1433
    .line 1434
    .line 1435
    const v15, -0x40fd70a4    # -0.51f

    .line 1436
    .line 1437
    .line 1438
    const v16, 0x3f051eb8    # 0.52f

    .line 1439
    .line 1440
    .line 1441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1442
    .line 1443
    .line 1444
    const v17, -0x41947ae1    # -0.23f

    .line 1445
    .line 1446
    .line 1447
    const v18, 0x3f8147ae    # 1.01f

    .line 1448
    .line 1449
    .line 1450
    const v13, -0x41dc28f6    # -0.16f

    .line 1451
    .line 1452
    .line 1453
    const v14, 0x3ea3d70a    # 0.32f

    .line 1454
    .line 1455
    .line 1456
    const v15, -0x41947ae1    # -0.23f

    .line 1457
    .line 1458
    .line 1459
    const v16, 0x3f266666    # 0.65f

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1463
    .line 1464
    .line 1465
    const v0, 0x3f2e147b    # 0.68f

    .line 1466
    .line 1467
    .line 1468
    const v2, 0x3e6b851f    # 0.23f

    .line 1469
    .line 1470
    .line 1471
    const v4, 0x3f75c28f    # 0.96f

    .line 1472
    .line 1473
    .line 1474
    const v6, 0x3da3d70a    # 0.08f

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1478
    .line 1479
    .line 1480
    const v17, 0x3f23d70a    # 0.64f

    .line 1481
    .line 1482
    .line 1483
    const v18, 0x3f3ae148    # 0.73f

    .line 1484
    .line 1485
    .line 1486
    const v13, 0x3e19999a    # 0.15f

    .line 1487
    .line 1488
    .line 1489
    const v14, 0x3e8f5c29    # 0.28f

    .line 1490
    .line 1491
    .line 1492
    const v15, 0x3ebd70a4    # 0.37f

    .line 1493
    .line 1494
    .line 1495
    const v16, 0x3f051eb8    # 0.52f

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1499
    .line 1500
    .line 1501
    const v17, 0x3f7ae148    # 0.98f

    .line 1502
    .line 1503
    .line 1504
    const v18, 0x3f07ae14    # 0.53f

    .line 1505
    .line 1506
    .line 1507
    const v13, 0x3e8a3d71    # 0.27f

    .line 1508
    .line 1509
    .line 1510
    const v14, 0x3e570a3d    # 0.21f

    .line 1511
    .line 1512
    .line 1513
    const v15, 0x3f19999a    # 0.6f

    .line 1514
    .line 1515
    .line 1516
    const v16, 0x3ec28f5c    # 0.38f

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1520
    .line 1521
    .line 1522
    const v17, 0x3fa28f5c    # 1.27f

    .line 1523
    .line 1524
    .line 1525
    const v18, 0x3eb851ec    # 0.36f

    .line 1526
    .line 1527
    .line 1528
    const v13, 0x3ec28f5c    # 0.38f

    .line 1529
    .line 1530
    .line 1531
    const v14, 0x3e0f5c29    # 0.14f

    .line 1532
    .line 1533
    .line 1534
    const v15, 0x3f4f5c29    # 0.81f

    .line 1535
    .line 1536
    .line 1537
    const v16, 0x3e851eb8    # 0.26f

    .line 1538
    .line 1539
    .line 1540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1541
    .line 1542
    .line 1543
    const v17, 0x3f733333    # 0.95f

    .line 1544
    .line 1545
    .line 1546
    const v18, 0x3e851eb8    # 0.26f

    .line 1547
    .line 1548
    .line 1549
    const v13, 0x3ec7ae14    # 0.39f

    .line 1550
    .line 1551
    .line 1552
    const v14, 0x3da3d70a    # 0.08f

    .line 1553
    .line 1554
    .line 1555
    const v15, 0x3f35c28f    # 0.71f

    .line 1556
    .line 1557
    .line 1558
    const v16, 0x3e2e147b    # 0.17f

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1562
    .line 1563
    .line 1564
    const v0, 0x3f11eb85    # 0.57f

    .line 1565
    .line 1566
    .line 1567
    const v2, 0x3e947ae1    # 0.29f

    .line 1568
    .line 1569
    .line 1570
    const v4, 0x3edc28f6    # 0.43f

    .line 1571
    .line 1572
    .line 1573
    const v6, 0x3e428f5c    # 0.19f

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1577
    .line 1578
    .line 1579
    const v17, 0x3e8a3d71    # 0.27f

    .line 1580
    .line 1581
    .line 1582
    const v18, 0x3eae147b    # 0.34f

    .line 1583
    .line 1584
    .line 1585
    const v13, 0x3e051eb8    # 0.13f

    .line 1586
    .line 1587
    .line 1588
    const v14, 0x3dcccccd    # 0.1f

    .line 1589
    .line 1590
    .line 1591
    const v15, 0x3e6147ae    # 0.22f

    .line 1592
    .line 1593
    .line 1594
    const v16, 0x3e6147ae    # 0.22f

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1598
    .line 1599
    .line 1600
    const v17, 0x3d8f5c29    # 0.07f

    .line 1601
    .line 1602
    .line 1603
    const v18, 0x3ec7ae14    # 0.39f

    .line 1604
    .line 1605
    .line 1606
    const v13, 0x3d4ccccd    # 0.05f

    .line 1607
    .line 1608
    .line 1609
    const v14, 0x3df5c28f    # 0.12f

    .line 1610
    .line 1611
    .line 1612
    const v15, 0x3d8f5c29    # 0.07f

    .line 1613
    .line 1614
    .line 1615
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1616
    .line 1617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1618
    .line 1619
    .line 1620
    const v17, -0x41333333    # -0.4f

    .line 1621
    .line 1622
    .line 1623
    const v18, 0x3f451eb8    # 0.77f

    .line 1624
    .line 1625
    .line 1626
    const/4 v13, 0x0

    .line 1627
    const v14, 0x3ea3d70a    # 0.32f

    .line 1628
    .line 1629
    .line 1630
    const v15, -0x41fae148    # -0.13f

    .line 1631
    .line 1632
    .line 1633
    const v16, 0x3f11eb85    # 0.57f

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1637
    .line 1638
    .line 1639
    const v17, -0x406a3d71    # -1.17f

    .line 1640
    .line 1641
    .line 1642
    const v18, 0x3e947ae1    # 0.29f

    .line 1643
    .line 1644
    .line 1645
    const v13, -0x4175c28f    # -0.27f

    .line 1646
    .line 1647
    .line 1648
    const v14, 0x3e4ccccd    # 0.2f

    .line 1649
    .line 1650
    .line 1651
    const v15, -0x40d70a3d    # -0.66f

    .line 1652
    .line 1653
    .line 1654
    const v16, 0x3e947ae1    # 0.29f

    .line 1655
    .line 1656
    .line 1657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1658
    .line 1659
    .line 1660
    const v17, -0x40dc28f6    # -0.64f

    .line 1661
    .line 1662
    .line 1663
    const v18, -0x425c28f6    # -0.08f

    .line 1664
    .line 1665
    .line 1666
    const v13, -0x419eb852    # -0.22f

    .line 1667
    .line 1668
    .line 1669
    const/4 v14, 0x0

    .line 1670
    const v15, -0x4123d70a    # -0.43f

    .line 1671
    .line 1672
    .line 1673
    const v16, -0x435c28f6    # -0.02f

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1677
    .line 1678
    .line 1679
    const v17, -0x40f0a3d7    # -0.56f

    .line 1680
    .line 1681
    .line 1682
    const v18, -0x418a3d71    # -0.24f

    .line 1683
    .line 1684
    .line 1685
    const v13, -0x41a8f5c3    # -0.21f

    .line 1686
    .line 1687
    .line 1688
    const v14, -0x42b33333    # -0.05f

    .line 1689
    .line 1690
    .line 1691
    const v15, -0x41333333    # -0.4f

    .line 1692
    .line 1693
    .line 1694
    const v16, -0x41fae148    # -0.13f

    .line 1695
    .line 1696
    .line 1697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1698
    .line 1699
    .line 1700
    const v17, -0x412e147b    # -0.41f

    .line 1701
    .line 1702
    .line 1703
    const v18, -0x411eb852    # -0.44f

    .line 1704
    .line 1705
    .line 1706
    const v13, -0x41d1eb85    # -0.17f

    .line 1707
    .line 1708
    .line 1709
    const v14, -0x421eb852    # -0.11f

    .line 1710
    .line 1711
    .line 1712
    const v15, -0x41666666    # -0.3f

    .line 1713
    .line 1714
    .line 1715
    const v16, -0x417ae148    # -0.26f

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1719
    .line 1720
    .line 1721
    const v17, -0x41c7ae14    # -0.18f

    .line 1722
    .line 1723
    .line 1724
    const v18, -0x40d47ae1    # -0.67f

    .line 1725
    .line 1726
    .line 1727
    const v13, -0x421eb852    # -0.11f

    .line 1728
    .line 1729
    .line 1730
    const v14, -0x41c7ae14    # -0.18f

    .line 1731
    .line 1732
    .line 1733
    const v15, -0x41d1eb85    # -0.17f

    .line 1734
    .line 1735
    .line 1736
    const v16, -0x412e147b    # -0.41f

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1740
    .line 1741
    .line 1742
    const v0, -0x400e147b    # -1.89f

    .line 1743
    .line 1744
    .line 1745
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1746
    .line 1747
    .line 1748
    const v17, 0x3e75c28f    # 0.24f

    .line 1749
    .line 1750
    .line 1751
    const v18, 0x3f866666    # 1.05f

    .line 1752
    .line 1753
    .line 1754
    const/4 v13, 0x0

    .line 1755
    const v14, 0x3eb851ec    # 0.36f

    .line 1756
    .line 1757
    .line 1758
    const v15, 0x3da3d70a    # 0.08f

    .line 1759
    .line 1760
    .line 1761
    const v16, 0x3f35c28f    # 0.71f

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1765
    .line 1766
    .line 1767
    const v17, 0x3f333333    # 0.7f

    .line 1768
    .line 1769
    .line 1770
    const v18, 0x3f6e147b    # 0.93f

    .line 1771
    .line 1772
    .line 1773
    const v13, 0x3e23d70a    # 0.16f

    .line 1774
    .line 1775
    .line 1776
    const v14, 0x3eae147b    # 0.34f

    .line 1777
    .line 1778
    .line 1779
    const v15, 0x3ec7ae14    # 0.39f

    .line 1780
    .line 1781
    .line 1782
    const v16, 0x3f266666    # 0.65f

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1786
    .line 1787
    .line 1788
    const v17, 0x3f933333    # 1.15f

    .line 1789
    .line 1790
    .line 1791
    const v18, 0x3f28f5c3    # 0.66f

    .line 1792
    .line 1793
    .line 1794
    const v13, 0x3e9eb852    # 0.31f

    .line 1795
    .line 1796
    .line 1797
    const v14, 0x3e8a3d71    # 0.27f

    .line 1798
    .line 1799
    .line 1800
    const v15, 0x3f30a3d7    # 0.69f

    .line 1801
    .line 1802
    .line 1803
    const v16, 0x3efae148    # 0.49f

    .line 1804
    .line 1805
    .line 1806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1807
    .line 1808
    .line 1809
    const v17, 0x3fca3d71    # 1.58f

    .line 1810
    .line 1811
    .line 1812
    const/high16 v18, 0x3e800000    # 0.25f

    .line 1813
    .line 1814
    const v13, 0x3eeb851f    # 0.46f

    .line 1815
    .line 1816
    .line 1817
    const v14, 0x3e2e147b    # 0.17f

    .line 1818
    .line 1819
    .line 1820
    const v15, 0x3f7ae148    # 0.98f

    .line 1821
    .line 1822
    .line 1823
    const/high16 v16, 0x3e800000    # 0.25f

    .line 1824
    .line 1825
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1826
    .line 1827
    .line 1828
    const v17, 0x3fb851ec    # 1.44f

    .line 1829
    .line 1830
    .line 1831
    const v18, -0x41bd70a4    # -0.19f

    .line 1832
    .line 1833
    .line 1834
    const v13, 0x3f07ae14    # 0.53f

    .line 1835
    .line 1836
    .line 1837
    const/4 v14, 0x0

    .line 1838
    const v15, 0x3f8147ae    # 1.01f

    .line 1839
    .line 1840
    .line 1841
    const v16, -0x428a3d71    # -0.06f

    .line 1842
    .line 1843
    .line 1844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1845
    .line 1846
    .line 1847
    const v17, 0x3f8e147b    # 1.11f

    .line 1848
    .line 1849
    .line 1850
    const v18, -0x40f5c28f    # -0.54f

    .line 1851
    .line 1852
    .line 1853
    const v13, 0x3edc28f6    # 0.43f

    .line 1854
    .line 1855
    .line 1856
    const v14, -0x41fae148    # -0.13f

    .line 1857
    .line 1858
    .line 1859
    const v15, 0x3f4ccccd    # 0.8f

    .line 1860
    .line 1861
    .line 1862
    const v16, -0x416147ae    # -0.31f

    .line 1863
    .line 1864
    .line 1865
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1866
    .line 1867
    .line 1868
    const v17, 0x3f35c28f    # 0.71f

    .line 1869
    .line 1870
    .line 1871
    const v18, -0x40ab851f    # -0.83f

    .line 1872
    .line 1873
    .line 1874
    const v13, 0x3e9eb852    # 0.31f

    .line 1875
    .line 1876
    .line 1877
    const v14, -0x41947ae1    # -0.23f

    .line 1878
    .line 1879
    .line 1880
    const v15, 0x3f0a3d71    # 0.54f

    .line 1881
    .line 1882
    .line 1883
    const v16, -0x40fd70a4    # -0.51f

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1887
    .line 1888
    .line 1889
    const/high16 v17, 0x3e800000    # 0.25f

    .line 1890
    .line 1891
    const v18, -0x407851ec    # -1.06f

    .line 1892
    .line 1893
    .line 1894
    const v13, 0x3e2e147b    # 0.17f

    .line 1895
    .line 1896
    .line 1897
    const v14, -0x415c28f6    # -0.32f

    .line 1898
    .line 1899
    .line 1900
    const/high16 v15, 0x3e800000    # 0.25f

    .line 1901
    .line 1902
    const v16, -0x40d47ae1    # -0.67f

    .line 1903
    .line 1904
    .line 1905
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1906
    .line 1907
    .line 1908
    const v17, -0x418a3d71    # -0.24f

    .line 1909
    .line 1910
    .line 1911
    const v18, -0x407d70a4    # -1.02f

    .line 1912
    .line 1913
    .line 1914
    const v13, -0x435c28f6    # -0.02f

    .line 1915
    .line 1916
    .line 1917
    const v14, -0x41333333    # -0.4f

    .line 1918
    .line 1919
    .line 1920
    const v15, -0x4247ae14    # -0.09f

    .line 1921
    .line 1922
    .line 1923
    const v16, -0x40c28f5c    # -0.74f

    .line 1924
    .line 1925
    .line 1926
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1927
    .line 1928
    .line 1929
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1930
    .line 1931
    .line 1932
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v2

    .line 1936
    const/16 v16, 0x3800

    .line 1937
    .line 1938
    const/16 v17, 0x0

    .line 1939
    .line 1940
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1941
    .line 1942
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1943
    .line 1944
    const/4 v7, 0x0

    .line 1945
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1946
    .line 1947
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1948
    .line 1949
    const/4 v13, 0x0

    .line 1950
    const/4 v14, 0x0

    .line 1951
    const/4 v15, 0x0

    .line 1952
    const-string v4, ""

    .line 1953
    .line 1954
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v0

    .line 1958
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v0

    .line 1962
    sput-object v0, Landroidx/compose/material/icons/filled/Timer3Kt;->_timer3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1963
    .line 1964
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1965
    .line 1966
    .line 1967
    return-object v0
.end method

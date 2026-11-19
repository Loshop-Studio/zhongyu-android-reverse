.class public final Landroidx/compose/material/icons/outlined/SettingsApplicationsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSettingsApplications(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SettingsApplicationsKt;->_settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SettingsApplications"

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
    const v0, 0x40c6b852    # 6.21f

    .line 71
    .line 72
    .line 73
    const v2, 0x415f851f    # 13.97f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x40047ae1    # 2.07f

    .line 80
    .line 81
    .line 82
    const v2, 0x3f99999a    # 1.2f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v17, 0x3ebd70a4    # 0.37f

    .line 89
    .line 90
    .line 91
    const v18, 0x3e051eb8    # 0.13f

    .line 92
    .line 93
    .line 94
    const v13, 0x3da3d70a    # 0.08f

    .line 95
    .line 96
    .line 97
    const v14, 0x3e051eb8    # 0.13f

    .line 98
    .line 99
    .line 100
    const v15, 0x3e6b851f    # 0.23f

    .line 101
    .line 102
    .line 103
    const v16, 0x3e3851ec    # 0.18f

    .line 104
    .line 105
    .line 106
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v0, -0x40e66666    # -0.6f

    .line 110
    .line 111
    .line 112
    const v2, 0x3fbeb852    # 1.49f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x3f8147ae    # 1.01f

    .line 119
    .line 120
    .line 121
    const v18, 0x3f170a3d    # 0.59f

    .line 122
    .line 123
    .line 124
    const v13, 0x3e9eb852    # 0.31f

    .line 125
    .line 126
    .line 127
    const v14, 0x3e75c28f    # 0.24f

    .line 128
    .line 129
    .line 130
    const v15, 0x3f23d70a    # 0.64f

    .line 131
    .line 132
    .line 133
    const v16, 0x3ee147ae    # 0.44f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x3fcb851f    # 1.59f

    .line 140
    .line 141
    .line 142
    const v2, 0x3e6147ae    # 0.22f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x3e99999a    # 0.3f

    .line 149
    .line 150
    .line 151
    const/high16 v18, 0x3e800000    # 0.25f

    .line 152
    .line 153
    const v13, 0x3cf5c28f    # 0.03f

    .line 154
    .line 155
    .line 156
    const v14, 0x3e0f5c29    # 0.14f

    .line 157
    .line 158
    .line 159
    const v15, 0x3e19999a    # 0.15f

    .line 160
    .line 161
    .line 162
    const/high16 v16, 0x3e800000    # 0.25f

    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x4019999a    # 2.4f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v18, -0x417ae148    # -0.26f

    .line 174
    .line 175
    .line 176
    const v13, 0x3e19999a    # 0.15f

    .line 177
    .line 178
    .line 179
    const/4 v14, 0x0

    .line 180
    const v15, 0x3e8a3d71    # 0.27f

    .line 181
    .line 182
    .line 183
    const v16, -0x421eb852    # -0.11f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, -0x40347ae1    # -1.59f

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, 0x3f8147ae    # 1.01f

    .line 196
    .line 197
    .line 198
    const v18, -0x40e8f5c3    # -0.59f

    .line 199
    .line 200
    .line 201
    const v13, 0x3eb851ec    # 0.36f

    .line 202
    .line 203
    .line 204
    const v14, -0x41e66666    # -0.15f

    .line 205
    .line 206
    .line 207
    const v15, 0x3f333333    # 0.7f

    .line 208
    .line 209
    .line 210
    const v16, -0x414ccccd    # -0.35f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x3f19999a    # 0.6f

    .line 217
    .line 218
    .line 219
    const v2, 0x3fbeb852    # 1.49f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v17, 0x3ebd70a4    # 0.37f

    .line 226
    .line 227
    .line 228
    const v18, -0x41fae148    # -0.13f

    .line 229
    .line 230
    .line 231
    const v13, 0x3e0f5c29    # 0.14f

    .line 232
    .line 233
    .line 234
    const v14, 0x3d4ccccd    # 0.05f

    .line 235
    .line 236
    .line 237
    const v15, 0x3e947ae1    # 0.29f

    .line 238
    .line 239
    .line 240
    const/16 v16, 0x0

    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v0, -0x3ffb851f    # -2.07f

    .line 246
    .line 247
    .line 248
    const v2, 0x3f99999a    # 1.2f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x4270a3d7    # -0.07f

    .line 255
    .line 256
    .line 257
    const v18, -0x413851ec    # -0.39f

    .line 258
    .line 259
    .line 260
    const v13, 0x3da3d70a    # 0.08f

    .line 261
    .line 262
    .line 263
    const v14, -0x41fae148    # -0.13f

    .line 264
    .line 265
    .line 266
    const v15, 0x3d23d70a    # 0.04f

    .line 267
    .line 268
    .line 269
    const v16, -0x416b851f    # -0.29f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v0, -0x40828f5c    # -0.99f

    .line 276
    .line 277
    .line 278
    const v2, -0x405d70a4    # -1.27f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x3d23d70a    # 0.04f

    .line 285
    .line 286
    .line 287
    const v18, -0x40eb851f    # -0.58f

    .line 288
    .line 289
    .line 290
    const v13, 0x3cf5c28f    # 0.03f

    .line 291
    .line 292
    .line 293
    const v14, -0x41bd70a4    # -0.19f

    .line 294
    .line 295
    .line 296
    const v16, -0x413851ec    # -0.39f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, -0x42dc28f6    # -0.04f

    .line 303
    .line 304
    .line 305
    const v18, -0x40e8f5c3    # -0.59f

    .line 306
    .line 307
    .line 308
    const/4 v13, 0x0

    .line 309
    const v14, -0x41b33333    # -0.2f

    .line 310
    .line 311
    .line 312
    const v15, -0x435c28f6    # -0.02f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x3fa28f5c    # 1.27f

    .line 319
    .line 320
    .line 321
    const v2, -0x40828f5c    # -0.99f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, 0x3d8f5c29    # 0.07f

    .line 328
    .line 329
    .line 330
    const v18, -0x413851ec    # -0.39f

    .line 331
    .line 332
    .line 333
    const v13, 0x3de147ae    # 0.11f

    .line 334
    .line 335
    .line 336
    const v14, -0x4247ae14    # -0.09f

    .line 337
    .line 338
    .line 339
    const v15, 0x3e19999a    # 0.15f

    .line 340
    .line 341
    .line 342
    const v16, -0x417ae148    # -0.26f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, -0x40666666    # -1.2f

    .line 349
    .line 350
    .line 351
    const v2, -0x3ffb851f    # -2.07f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, -0x41428f5c    # -0.37f

    .line 358
    .line 359
    .line 360
    const v18, -0x41fae148    # -0.13f

    .line 361
    .line 362
    .line 363
    const v13, -0x425c28f6    # -0.08f

    .line 364
    .line 365
    .line 366
    const v14, -0x41fae148    # -0.13f

    .line 367
    .line 368
    .line 369
    const v15, -0x41947ae1    # -0.23f

    .line 370
    .line 371
    .line 372
    const v16, -0x41c7ae14    # -0.18f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, -0x404147ae    # -1.49f

    .line 379
    .line 380
    .line 381
    const v2, 0x3f19999a    # 0.6f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v17, -0x407eb852    # -1.01f

    .line 388
    .line 389
    .line 390
    const v18, -0x40e8f5c3    # -0.59f

    .line 391
    .line 392
    .line 393
    const v13, -0x416147ae    # -0.31f

    .line 394
    .line 395
    .line 396
    const v14, -0x418a3d71    # -0.24f

    .line 397
    .line 398
    .line 399
    const v15, -0x40dc28f6    # -0.64f

    .line 400
    .line 401
    .line 402
    const v16, -0x411eb852    # -0.44f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, -0x419eb852    # -0.22f

    .line 409
    .line 410
    .line 411
    const v2, -0x40347ae1    # -1.59f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v17, -0x41666666    # -0.3f

    .line 418
    .line 419
    .line 420
    const/high16 v18, -0x41800000    # -0.25f

    .line 421
    .line 422
    const v13, -0x430a3d71    # -0.03f

    .line 423
    .line 424
    .line 425
    const v14, -0x41f0a3d7    # -0.14f

    .line 426
    .line 427
    .line 428
    const v15, -0x41e66666    # -0.15f

    .line 429
    .line 430
    .line 431
    const/high16 v16, -0x41800000    # -0.25f

    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, -0x3fe66666    # -2.4f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v18, 0x3e851eb8    # 0.26f

    .line 443
    .line 444
    .line 445
    const v13, -0x41e66666    # -0.15f

    .line 446
    .line 447
    .line 448
    const/4 v14, 0x0

    .line 449
    const v15, -0x4175c28f    # -0.27f

    .line 450
    .line 451
    .line 452
    const v16, 0x3de147ae    # 0.11f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v0, -0x419eb852    # -0.22f

    .line 459
    .line 460
    .line 461
    const v2, 0x3fcb851f    # 1.59f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v17, -0x407eb852    # -1.01f

    .line 468
    .line 469
    .line 470
    const v18, 0x3f147ae1    # 0.58f

    .line 471
    .line 472
    .line 473
    const v13, -0x4147ae14    # -0.36f

    .line 474
    .line 475
    .line 476
    const v14, 0x3e19999a    # 0.15f

    .line 477
    .line 478
    .line 479
    const v15, -0x40ca3d71    # -0.71f

    .line 480
    .line 481
    .line 482
    const v16, 0x3eae147b    # 0.34f

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v0, -0x404147ae    # -1.49f

    .line 489
    .line 490
    .line 491
    const v2, -0x40e66666    # -0.6f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v17, -0x41428f5c    # -0.37f

    .line 498
    .line 499
    .line 500
    const v18, 0x3e051eb8    # 0.13f

    .line 501
    .line 502
    .line 503
    const v13, -0x41f0a3d7    # -0.14f

    .line 504
    .line 505
    .line 506
    const v14, -0x42b33333    # -0.05f

    .line 507
    .line 508
    .line 509
    const v15, -0x416b851f    # -0.29f

    .line 510
    .line 511
    .line 512
    const/16 v16, 0x0

    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, -0x40666666    # -1.2f

    .line 518
    .line 519
    .line 520
    const v2, 0x40047ae1    # 2.07f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, 0x3d8f5c29    # 0.07f

    .line 527
    .line 528
    .line 529
    const v18, 0x3ec7ae14    # 0.39f

    .line 530
    .line 531
    .line 532
    const v13, -0x425c28f6    # -0.08f

    .line 533
    .line 534
    .line 535
    const v14, 0x3e051eb8    # 0.13f

    .line 536
    .line 537
    .line 538
    const v15, -0x42dc28f6    # -0.04f

    .line 539
    .line 540
    .line 541
    const v16, 0x3e947ae1    # 0.29f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x3f7d70a4    # 0.99f

    .line 548
    .line 549
    .line 550
    const v2, 0x3fa28f5c    # 1.27f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, -0x42b33333    # -0.05f

    .line 557
    .line 558
    .line 559
    const v18, 0x3f170a3d    # 0.59f

    .line 560
    .line 561
    .line 562
    const v13, -0x430a3d71    # -0.03f

    .line 563
    .line 564
    .line 565
    const v14, 0x3e4ccccd    # 0.2f

    .line 566
    .line 567
    .line 568
    const v15, -0x42b33333    # -0.05f

    .line 569
    .line 570
    .line 571
    const v16, 0x3ec7ae14    # 0.39f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v17, 0x3d23d70a    # 0.04f

    .line 578
    .line 579
    .line 580
    const/4 v13, 0x0

    .line 581
    const v15, 0x3ca3d70a    # 0.02f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v2, -0x405d70a4    # -1.27f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v17, -0x428a3d71    # -0.06f

    .line 594
    .line 595
    .line 596
    const v18, 0x3ec7ae14    # 0.39f

    .line 597
    .line 598
    .line 599
    const v13, -0x421eb852    # -0.11f

    .line 600
    .line 601
    .line 602
    const v14, 0x3dcccccd    # 0.1f

    .line 603
    .line 604
    .line 605
    const v15, -0x41f0a3d7    # -0.14f

    .line 606
    .line 607
    .line 608
    const v16, 0x3e851eb8    # 0.26f

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x41400000    # 12.0f

    .line 618
    .line 619
    const v2, 0x4124a3d7    # 10.29f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v17, 0x3fdae148    # 1.71f

    .line 626
    .line 627
    .line 628
    const v18, 0x3fdae148    # 1.71f

    .line 629
    .line 630
    .line 631
    const v13, 0x3f70a3d7    # 0.94f

    .line 632
    .line 633
    .line 634
    const/4 v14, 0x0

    .line 635
    const v15, 0x3fdae148    # 1.71f

    .line 636
    .line 637
    .line 638
    const v16, 0x3f451eb8    # 0.77f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, -0x40bae148    # -0.77f

    .line 645
    .line 646
    .line 647
    const v2, 0x3fdae148    # 1.71f

    .line 648
    .line 649
    .line 650
    const v4, -0x40251eb8    # -1.71f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v2, -0x40251eb8    # -1.71f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x3f451eb8    # 0.77f

    .line 663
    .line 664
    .line 665
    const v2, 0x3fdae148    # 1.71f

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const/high16 v0, 0x40400000    # 3.0f

    .line 675
    .line 676
    const/high16 v2, 0x41980000    # 19.0f

    .line 677
    .line 678
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v2, 0x40a00000    # 5.0f

    .line 682
    .line 683
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v17, -0x40000000    # -2.0f

    .line 687
    .line 688
    const/high16 v18, 0x40000000    # 2.0f

    .line 689
    .line 690
    const v13, -0x4071eb85    # -1.11f

    .line 691
    .line 692
    .line 693
    const/high16 v15, -0x40000000    # -2.0f

    .line 694
    .line 695
    const v16, 0x3f666666    # 0.9f

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v0, 0x41600000    # 14.0f

    .line 702
    .line 703
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v17, 0x40000000    # 2.0f

    .line 707
    .line 708
    const/4 v13, 0x0

    .line 709
    const v14, 0x3f8ccccd    # 1.1f

    .line 710
    .line 711
    .line 712
    const v15, 0x3f63d70a    # 0.89f

    .line 713
    .line 714
    .line 715
    const/high16 v16, 0x40000000    # 2.0f

    .line 716
    .line 717
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v18, -0x40000000    # -2.0f

    .line 724
    .line 725
    const v13, 0x3f8e147b    # 1.11f

    .line 726
    .line 727
    .line 728
    const/4 v14, 0x0

    .line 729
    const/high16 v15, 0x40000000    # 2.0f

    .line 730
    .line 731
    const v16, -0x4099999a    # -0.9f

    .line 732
    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, 0x41a80000    # 21.0f

    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v17, -0x40000000    # -2.0f

    .line 743
    .line 744
    const/4 v13, 0x0

    .line 745
    const v14, -0x40733333    # -1.1f

    .line 746
    .line 747
    .line 748
    const v15, -0x409c28f6    # -0.89f

    .line 749
    .line 750
    .line 751
    const/high16 v16, -0x40000000    # -2.0f

    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const/high16 v0, 0x41980000    # 19.0f

    .line 760
    .line 761
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 765
    .line 766
    .line 767
    const/high16 v0, 0x40a00000    # 5.0f

    .line 768
    .line 769
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v0, 0x41600000    # 14.0f

    .line 773
    .line 774
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    const/16 v16, 0x3800

    .line 788
    .line 789
    const/16 v17, 0x0

    .line 790
    .line 791
    const/high16 v6, 0x3f800000    # 1.0f

    .line 792
    .line 793
    const/high16 v8, 0x3f800000    # 1.0f

    .line 794
    .line 795
    const/4 v7, 0x0

    .line 796
    const/high16 v9, 0x3f800000    # 1.0f

    .line 797
    .line 798
    const/high16 v12, 0x3f800000    # 1.0f

    .line 799
    .line 800
    const/4 v14, 0x0

    .line 801
    const/4 v15, 0x0

    .line 802
    const-string v4, ""

    .line 803
    .line 804
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    sput-object v0, Landroidx/compose/material/icons/outlined/SettingsApplicationsKt;->_settingsApplications:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 813
    .line 814
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 815
    .line 816
    .line 817
    return-object v0
.end method

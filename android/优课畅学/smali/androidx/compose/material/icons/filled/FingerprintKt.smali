.class public final Landroidx/compose/material/icons/filled/FingerprintKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fingerprint:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFingerprint(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/FingerprintKt;->_fingerprint:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Fingerprint"

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
    const v0, 0x418e7ae1    # 17.81f

    .line 71
    .line 72
    .line 73
    const v2, 0x408f0a3d    # 4.47f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x41947ae1    # -0.23f

    .line 80
    .line 81
    .line 82
    const v18, -0x428a3d71    # -0.06f

    .line 83
    .line 84
    .line 85
    const v13, -0x425c28f6    # -0.08f

    .line 86
    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    const v15, -0x41dc28f6    # -0.16f

    .line 90
    .line 91
    .line 92
    const v16, -0x435c28f6    # -0.02f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x414028f6    # 12.01f

    .line 99
    .line 100
    .line 101
    const/high16 v18, 0x40400000    # 3.0f

    .line 102
    .line 103
    const v13, 0x417a8f5c    # 15.66f

    .line 104
    .line 105
    .line 106
    const v14, 0x405ae148    # 3.42f

    .line 107
    .line 108
    .line 109
    const/high16 v15, 0x41600000    # 14.0f

    .line 110
    .line 111
    const/high16 v16, 0x40400000    # 3.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v17, -0x3f4dc28f    # -5.57f

    .line 117
    .line 118
    .line 119
    const v18, 0x3fb47ae1    # 1.41f

    .line 120
    .line 121
    .line 122
    const v13, -0x40028f5c    # -1.98f

    .line 123
    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    const v15, -0x3f88f5c3    # -3.86f

    .line 127
    .line 128
    .line 129
    const v16, 0x3ef0a3d7    # 0.47f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v17, -0x40d1eb85    # -0.68f

    .line 136
    .line 137
    .line 138
    const v18, -0x41b33333    # -0.2f

    .line 139
    .line 140
    .line 141
    const v13, -0x418a3d71    # -0.24f

    .line 142
    .line 143
    .line 144
    const v14, 0x3e051eb8    # 0.13f

    .line 145
    .line 146
    .line 147
    const v15, -0x40f5c28f    # -0.54f

    .line 148
    .line 149
    .line 150
    const v16, 0x3d23d70a    # 0.04f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, 0x3e4ccccd    # 0.2f

    .line 157
    .line 158
    .line 159
    const v18, -0x40d1eb85    # -0.68f

    .line 160
    .line 161
    .line 162
    const v13, -0x41fae148    # -0.13f

    .line 163
    .line 164
    .line 165
    const v14, -0x418a3d71    # -0.24f

    .line 166
    .line 167
    .line 168
    const v15, -0x42dc28f6    # -0.04f

    .line 169
    .line 170
    .line 171
    const v16, -0x40f33333    # -0.55f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x414028f6    # 12.01f

    .line 178
    .line 179
    .line 180
    const/high16 v18, 0x40000000    # 2.0f

    .line 181
    .line 182
    const v13, 0x40fa3d71    # 7.82f

    .line 183
    .line 184
    .line 185
    const v14, 0x402147ae    # 2.52f

    .line 186
    .line 187
    .line 188
    const v15, 0x411dc28f    # 9.86f

    .line 189
    .line 190
    .line 191
    const/high16 v16, 0x40000000    # 2.0f

    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v17, 0x40c0f5c3    # 6.03f

    .line 197
    .line 198
    .line 199
    const v18, 0x3fc28f5c    # 1.52f

    .line 200
    .line 201
    .line 202
    const v13, 0x400851ec    # 2.13f

    .line 203
    .line 204
    .line 205
    const/4 v14, 0x0

    .line 206
    const v15, 0x407f5c29    # 3.99f

    .line 207
    .line 208
    .line 209
    const v16, 0x3ef0a3d7    # 0.47f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, 0x3e570a3d    # 0.21f

    .line 216
    .line 217
    .line 218
    const v18, 0x3f2b851f    # 0.67f

    .line 219
    .line 220
    .line 221
    const/high16 v13, 0x3e800000    # 0.25f

    .line 222
    .line 223
    const v14, 0x3e051eb8    # 0.13f

    .line 224
    .line 225
    .line 226
    const v15, 0x3eae147b    # 0.34f

    .line 227
    .line 228
    .line 229
    const v16, 0x3edc28f6    # 0.43f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x411eb852    # -0.44f

    .line 236
    .line 237
    .line 238
    const v18, 0x3e8f5c29    # 0.28f

    .line 239
    .line 240
    .line 241
    const v13, -0x4247ae14    # -0.09f

    .line 242
    .line 243
    .line 244
    const v14, 0x3e3851ec    # 0.18f

    .line 245
    .line 246
    .line 247
    const v15, -0x417ae148    # -0.26f

    .line 248
    .line 249
    .line 250
    const v16, 0x3e8f5c29    # 0.28f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x40600000    # 3.5f

    .line 260
    .line 261
    const v2, 0x411b851f    # 9.72f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, -0x416b851f    # -0.29f

    .line 268
    .line 269
    .line 270
    const v18, -0x4247ae14    # -0.09f

    .line 271
    .line 272
    .line 273
    const v13, -0x42333333    # -0.1f

    .line 274
    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const v15, -0x41b33333    # -0.2f

    .line 278
    .line 279
    .line 280
    const v16, -0x430a3d71    # -0.03f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, -0x420a3d71    # -0.12f

    .line 287
    .line 288
    .line 289
    const v18, -0x40cccccd    # -0.7f

    .line 290
    .line 291
    .line 292
    const v13, -0x41947ae1    # -0.23f

    .line 293
    .line 294
    .line 295
    const v14, -0x41dc28f6    # -0.16f

    .line 296
    .line 297
    .line 298
    const v15, -0x4170a3d7    # -0.28f

    .line 299
    .line 300
    .line 301
    const v16, -0x410f5c29    # -0.47f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v17, 0x40700000    # 3.75f

    .line 308
    .line 309
    const v18, -0x3faeb852    # -3.27f

    .line 310
    .line 311
    .line 312
    const v13, 0x3f7d70a4    # 0.99f

    .line 313
    .line 314
    .line 315
    const v14, -0x404ccccd    # -1.4f

    .line 316
    .line 317
    .line 318
    const/high16 v15, 0x40100000    # 2.25f

    .line 319
    .line 320
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x41893333    # 17.15f

    .line 326
    .line 327
    .line 328
    const v18, 0x40b4cccd    # 5.65f

    .line 329
    .line 330
    .line 331
    const v13, 0x411fae14    # 9.98f

    .line 332
    .line 333
    .line 334
    const v14, 0x408147ae    # 4.04f

    .line 335
    .line 336
    .line 337
    const/high16 v15, 0x41600000    # 14.0f

    .line 338
    .line 339
    const v16, 0x4080f5c3    # 4.03f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x40700000    # 3.75f

    .line 346
    .line 347
    const/high16 v18, 0x40500000    # 3.25f

    .line 348
    .line 349
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 350
    .line 351
    const v14, 0x3f451eb8    # 0.77f

    .line 352
    .line 353
    .line 354
    const v15, 0x4030a3d7    # 2.76f

    .line 355
    .line 356
    .line 357
    const v16, 0x3fee147b    # 1.86f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v17, -0x420a3d71    # -0.12f

    .line 364
    .line 365
    .line 366
    const v18, 0x3f333333    # 0.7f

    .line 367
    .line 368
    .line 369
    const v13, 0x3e23d70a    # 0.16f

    .line 370
    .line 371
    .line 372
    const v14, 0x3e6147ae    # 0.22f

    .line 373
    .line 374
    .line 375
    const v15, 0x3de147ae    # 0.11f

    .line 376
    .line 377
    .line 378
    const v16, 0x3f0a3d71    # 0.54f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v17, -0x40cccccd    # -0.7f

    .line 385
    .line 386
    .line 387
    const v18, -0x420a3d71    # -0.12f

    .line 388
    .line 389
    .line 390
    const v13, -0x41947ae1    # -0.23f

    .line 391
    .line 392
    .line 393
    const v14, 0x3e23d70a    # 0.16f

    .line 394
    .line 395
    .line 396
    const v15, -0x40f5c28f    # -0.54f

    .line 397
    .line 398
    .line 399
    const v16, 0x3de147ae    # 0.11f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, -0x3fa70a3d    # -3.39f

    .line 406
    .line 407
    .line 408
    const v18, -0x3fc3d70a    # -2.94f

    .line 409
    .line 410
    .line 411
    const v13, -0x4099999a    # -0.9f

    .line 412
    .line 413
    .line 414
    const v14, -0x405eb852    # -1.26f

    .line 415
    .line 416
    .line 417
    const v15, -0x3ffd70a4    # -2.04f

    .line 418
    .line 419
    .line 420
    const/high16 v16, -0x3ff00000    # -2.25f

    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v17, -0x3ee9999a    # -9.4f

    .line 426
    .line 427
    .line 428
    const v18, 0x3c23d70a    # 0.01f

    .line 429
    .line 430
    .line 431
    const v13, -0x3fc851ec    # -2.87f

    .line 432
    .line 433
    .line 434
    const v14, -0x4043d70a    # -1.47f

    .line 435
    .line 436
    .line 437
    const v15, -0x3f2eb852    # -6.54f

    .line 438
    .line 439
    .line 440
    const v16, -0x4043d70a    # -1.47f

    .line 441
    .line 442
    .line 443
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v17, -0x3fa66666    # -3.4f

    .line 447
    .line 448
    .line 449
    const v18, 0x403d70a4    # 2.96f

    .line 450
    .line 451
    .line 452
    const v13, -0x4051eb85    # -1.36f

    .line 453
    .line 454
    .line 455
    const v14, 0x3f333333    # 0.7f

    .line 456
    .line 457
    .line 458
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 459
    .line 460
    const v16, 0x3fd9999a    # 1.7f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, -0x413851ec    # -0.39f

    .line 467
    .line 468
    .line 469
    const v18, 0x3e570a3d    # 0.21f

    .line 470
    .line 471
    .line 472
    const v13, -0x425c28f6    # -0.08f

    .line 473
    .line 474
    .line 475
    const v14, 0x3e0f5c29    # 0.14f

    .line 476
    .line 477
    .line 478
    const v15, -0x41947ae1    # -0.23f

    .line 479
    .line 480
    .line 481
    const v16, 0x3e570a3d    # 0.21f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x411c0000    # 9.75f

    .line 491
    .line 492
    const v2, 0x41ae51ec    # 21.79f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, -0x414ccccd    # -0.35f

    .line 499
    .line 500
    .line 501
    const v18, -0x41e66666    # -0.15f

    .line 502
    .line 503
    .line 504
    const v13, -0x41fae148    # -0.13f

    .line 505
    .line 506
    .line 507
    const/4 v14, 0x0

    .line 508
    const v15, -0x417ae148    # -0.26f

    .line 509
    .line 510
    .line 511
    const v16, -0x42b33333    # -0.05f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v17, -0x3fff5c29    # -2.01f

    .line 518
    .line 519
    .line 520
    const v18, -0x3fd70a3d    # -2.64f

    .line 521
    .line 522
    .line 523
    const v13, -0x40a147ae    # -0.87f

    .line 524
    .line 525
    .line 526
    const v14, -0x40a147ae    # -0.87f

    .line 527
    .line 528
    .line 529
    const v15, -0x40547ae1    # -1.34f

    .line 530
    .line 531
    .line 532
    const v16, -0x4048f5c3    # -1.43f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v17, -0x4079999a    # -1.05f

    .line 539
    .line 540
    .line 541
    const v18, -0x3f751eb8    # -4.34f

    .line 542
    .line 543
    .line 544
    const v13, -0x40cf5c29    # -0.69f

    .line 545
    .line 546
    .line 547
    const v14, -0x40628f5c    # -1.23f

    .line 548
    .line 549
    .line 550
    const v15, -0x4079999a    # -1.05f

    .line 551
    .line 552
    .line 553
    const v16, -0x3fd147ae    # -2.73f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, 0x40b51eb8    # 5.66f

    .line 560
    .line 561
    .line 562
    const v18, -0x3f53851f    # -5.39f

    .line 563
    .line 564
    .line 565
    const/4 v13, 0x0

    .line 566
    const v14, -0x3fc1eb85    # -2.97f

    .line 567
    .line 568
    .line 569
    const v15, 0x40228f5c    # 2.54f

    .line 570
    .line 571
    .line 572
    const v16, -0x3f53851f    # -5.39f

    .line 573
    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x401ae148    # 2.42f

    .line 579
    .line 580
    .line 581
    const v2, 0x40ac7ae1    # 5.39f

    .line 582
    .line 583
    .line 584
    const v4, 0x40b51eb8    # 5.66f

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v17, -0x41000000    # -0.5f

    .line 591
    .line 592
    const/high16 v18, 0x3f000000    # 0.5f

    .line 593
    .line 594
    const v14, 0x3e8f5c29    # 0.28f

    .line 595
    .line 596
    .line 597
    const v15, -0x419eb852    # -0.22f

    .line 598
    .line 599
    .line 600
    const/high16 v16, 0x3f000000    # 0.5f

    .line 601
    .line 602
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, -0x419eb852    # -0.22f

    .line 606
    .line 607
    .line 608
    const/high16 v2, -0x41000000    # -0.5f

    .line 609
    .line 610
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, -0x3f6ae148    # -4.66f

    .line 614
    .line 615
    .line 616
    const v18, -0x3f73851f    # -4.39f

    .line 617
    .line 618
    .line 619
    const v14, -0x3fe51eb8    # -2.42f

    .line 620
    .line 621
    .line 622
    const v15, -0x3ffa3d71    # -2.09f

    .line 623
    .line 624
    .line 625
    const v16, -0x3f73851f    # -4.39f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v18, 0x408c7ae1    # 4.39f

    .line 632
    .line 633
    .line 634
    const v13, -0x3fdb851f    # -2.57f

    .line 635
    .line 636
    .line 637
    const/4 v14, 0x0

    .line 638
    const v15, -0x3f6ae148    # -4.66f

    .line 639
    .line 640
    .line 641
    const v16, 0x3ffc28f6    # 1.97f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const v17, 0x3f6e147b    # 0.93f

    .line 648
    .line 649
    .line 650
    const v18, 0x40766666    # 3.85f

    .line 651
    .line 652
    .line 653
    const/4 v13, 0x0

    .line 654
    const v14, 0x3fb851ec    # 1.44f

    .line 655
    .line 656
    .line 657
    const v15, 0x3ea3d70a    # 0.32f

    .line 658
    .line 659
    .line 660
    const v16, 0x403147ae    # 2.77f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v17, 0x3feccccd    # 1.85f

    .line 667
    .line 668
    .line 669
    const v18, 0x401ae148    # 2.42f

    .line 670
    .line 671
    .line 672
    const v13, 0x3f23d70a    # 0.64f

    .line 673
    .line 674
    .line 675
    const v14, 0x3f933333    # 1.15f

    .line 676
    .line 677
    .line 678
    const v15, 0x3f8a3d71    # 1.08f

    .line 679
    .line 680
    .line 681
    const v16, 0x3fd1eb85    # 1.64f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/16 v17, 0x0

    .line 688
    .line 689
    const v18, 0x3f35c28f    # 0.71f

    .line 690
    .line 691
    .line 692
    const v13, 0x3e428f5c    # 0.19f

    .line 693
    .line 694
    .line 695
    const v14, 0x3e4ccccd    # 0.2f

    .line 696
    .line 697
    .line 698
    const v15, 0x3e428f5c    # 0.19f

    .line 699
    .line 700
    .line 701
    const v16, 0x3f028f5c    # 0.51f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v17, -0x41428f5c    # -0.37f

    .line 708
    .line 709
    .line 710
    const v18, 0x3e19999a    # 0.15f

    .line 711
    .line 712
    .line 713
    const v13, -0x421eb852    # -0.11f

    .line 714
    .line 715
    .line 716
    const v14, 0x3dcccccd    # 0.1f

    .line 717
    .line 718
    .line 719
    const v15, -0x418a3d71    # -0.24f

    .line 720
    .line 721
    .line 722
    const v16, 0x3e19999a    # 0.15f

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, 0x41875c29    # 16.92f

    .line 732
    .line 733
    .line 734
    const v2, 0x419f851f    # 19.94f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v17, -0x3fb9999a    # -3.1f

    .line 741
    .line 742
    .line 743
    const v18, -0x409c28f6    # -0.89f

    .line 744
    .line 745
    .line 746
    const v13, -0x4067ae14    # -1.19f

    .line 747
    .line 748
    .line 749
    const/4 v14, 0x0

    .line 750
    const v15, -0x3ff0a3d7    # -2.24f

    .line 751
    .line 752
    .line 753
    const v16, -0x41666666    # -0.3f

    .line 754
    .line 755
    .line 756
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v17, -0x3fe7ae14    # -2.38f

    .line 760
    .line 761
    .line 762
    const v18, -0x3f73851f    # -4.39f

    .line 763
    .line 764
    .line 765
    const v13, -0x404147ae    # -1.49f

    .line 766
    .line 767
    .line 768
    const v14, -0x407eb852    # -1.01f

    .line 769
    .line 770
    .line 771
    const v15, -0x3fe7ae14    # -2.38f

    .line 772
    .line 773
    .line 774
    const v16, -0x3fd66666    # -2.65f

    .line 775
    .line 776
    .line 777
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v17, 0x3f000000    # 0.5f

    .line 781
    .line 782
    const/high16 v18, -0x41000000    # -0.5f

    .line 783
    .line 784
    const/4 v13, 0x0

    .line 785
    const v14, -0x4170a3d7    # -0.28f

    .line 786
    .line 787
    .line 788
    const v15, 0x3e6147ae    # 0.22f

    .line 789
    .line 790
    .line 791
    const/high16 v16, -0x41000000    # -0.5f

    .line 792
    .line 793
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 794
    .line 795
    .line 796
    const v0, 0x3e6147ae    # 0.22f

    .line 797
    .line 798
    .line 799
    const/high16 v2, 0x3f000000    # 0.5f

    .line 800
    .line 801
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v17, 0x3ff851ec    # 1.94f

    .line 805
    .line 806
    .line 807
    const v18, 0x4063d70a    # 3.56f

    .line 808
    .line 809
    .line 810
    const v14, 0x3fb47ae1    # 1.41f

    .line 811
    .line 812
    .line 813
    const v15, 0x3f3851ec    # 0.72f

    .line 814
    .line 815
    .line 816
    const v16, 0x402f5c29    # 2.74f

    .line 817
    .line 818
    .line 819
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v17, 0x40228f5c    # 2.54f

    .line 823
    .line 824
    .line 825
    const v18, 0x3f35c28f    # 0.71f

    .line 826
    .line 827
    .line 828
    const v13, 0x3f35c28f    # 0.71f

    .line 829
    .line 830
    .line 831
    const v14, 0x3ef5c28f    # 0.48f

    .line 832
    .line 833
    .line 834
    const v15, 0x3fc51eb8    # 1.54f

    .line 835
    .line 836
    .line 837
    const v16, 0x3f35c28f    # 0.71f

    .line 838
    .line 839
    .line 840
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    .line 843
    const v17, 0x3f851eb8    # 1.04f

    .line 844
    .line 845
    .line 846
    const v18, -0x42333333    # -0.1f

    .line 847
    .line 848
    .line 849
    const v13, 0x3e75c28f    # 0.24f

    .line 850
    .line 851
    .line 852
    const/4 v14, 0x0

    .line 853
    const v15, 0x3f23d70a    # 0.64f

    .line 854
    .line 855
    .line 856
    const v16, -0x430a3d71    # -0.03f

    .line 857
    .line 858
    .line 859
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    const v17, 0x3f147ae1    # 0.58f

    .line 863
    .line 864
    .line 865
    const v18, 0x3ed1eb85    # 0.41f

    .line 866
    .line 867
    .line 868
    const v13, 0x3e8a3d71    # 0.27f

    .line 869
    .line 870
    .line 871
    const v14, -0x42b33333    # -0.05f

    .line 872
    .line 873
    .line 874
    const v15, 0x3f07ae14    # 0.53f

    .line 875
    .line 876
    .line 877
    const v16, 0x3e051eb8    # 0.13f

    .line 878
    .line 879
    .line 880
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const v17, -0x412e147b    # -0.41f

    .line 884
    .line 885
    .line 886
    const v18, 0x3f147ae1    # 0.58f

    .line 887
    .line 888
    .line 889
    const v13, 0x3d4ccccd    # 0.05f

    .line 890
    .line 891
    .line 892
    const v14, 0x3e8a3d71    # 0.27f

    .line 893
    .line 894
    .line 895
    const v15, -0x41fae148    # -0.13f

    .line 896
    .line 897
    .line 898
    const v16, 0x3f07ae14    # 0.53f

    .line 899
    .line 900
    .line 901
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const v17, -0x40651eb8    # -1.21f

    .line 905
    .line 906
    .line 907
    const v18, 0x3df5c28f    # 0.12f

    .line 908
    .line 909
    .line 910
    const v13, -0x40ee147b    # -0.57f

    .line 911
    .line 912
    .line 913
    const v14, 0x3de147ae    # 0.11f

    .line 914
    .line 915
    .line 916
    const v15, -0x40770a3d    # -1.07f

    .line 917
    .line 918
    .line 919
    const v16, 0x3df5c28f    # 0.12f

    .line 920
    .line 921
    .line 922
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const v0, 0x416e8f5c    # 14.91f

    .line 929
    .line 930
    .line 931
    const/high16 v2, 0x41b00000    # 22.0f

    .line 932
    .line 933
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 934
    .line 935
    .line 936
    const v17, -0x41fae148    # -0.13f

    .line 937
    .line 938
    .line 939
    const v18, -0x435c28f6    # -0.02f

    .line 940
    .line 941
    .line 942
    const v13, -0x42dc28f6    # -0.04f

    .line 943
    .line 944
    .line 945
    const/4 v14, 0x0

    .line 946
    const v15, -0x4247ae14    # -0.09f

    .line 947
    .line 948
    .line 949
    const v16, -0x43dc28f6    # -0.01f

    .line 950
    .line 951
    .line 952
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const v17, -0x3f91eb85    # -3.72f

    .line 956
    .line 957
    .line 958
    const v18, -0x3ff9999a    # -2.1f

    .line 959
    .line 960
    .line 961
    const v13, -0x40347ae1    # -1.59f

    .line 962
    .line 963
    .line 964
    const v14, -0x411eb852    # -0.44f

    .line 965
    .line 966
    .line 967
    const v15, -0x3fd7ae14    # -2.63f

    .line 968
    .line 969
    .line 970
    const v16, -0x407c28f6    # -1.03f

    .line 971
    .line 972
    .line 973
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 974
    .line 975
    .line 976
    const v17, -0x3ff51eb8    # -2.17f

    .line 977
    .line 978
    .line 979
    const v18, -0x3f58f5c3    # -5.22f

    .line 980
    .line 981
    .line 982
    const v13, -0x404ccccd    # -1.4f

    .line 983
    .line 984
    .line 985
    const v14, -0x404e147b    # -1.39f

    .line 986
    .line 987
    .line 988
    const v15, -0x3ff51eb8    # -2.17f

    .line 989
    .line 990
    .line 991
    const v16, -0x3fb0a3d7    # -3.24f

    .line 992
    .line 993
    .line 994
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const v17, 0x40451eb8    # 3.08f

    .line 998
    .line 999
    .line 1000
    const v18, -0x3fc3d70a    # -2.94f

    .line 1001
    .line 1002
    .line 1003
    const/4 v13, 0x0

    .line 1004
    const v14, -0x4030a3d7    # -1.62f

    .line 1005
    .line 1006
    .line 1007
    const v15, 0x3fb0a3d7    # 1.38f

    .line 1008
    .line 1009
    .line 1010
    const v16, -0x3fc3d70a    # -2.94f

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    const v18, 0x403c28f6    # 2.94f

    .line 1017
    .line 1018
    .line 1019
    const v13, 0x3fd9999a    # 1.7f

    .line 1020
    .line 1021
    .line 1022
    const/4 v14, 0x0

    .line 1023
    const v15, 0x40451eb8    # 3.08f

    .line 1024
    .line 1025
    .line 1026
    const v16, 0x3fa8f5c3    # 1.32f

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1030
    .line 1031
    .line 1032
    const v17, 0x40051eb8    # 2.08f

    .line 1033
    .line 1034
    .line 1035
    const v18, 0x3ff851ec    # 1.94f

    .line 1036
    .line 1037
    .line 1038
    const/4 v13, 0x0

    .line 1039
    const v14, 0x3f88f5c3    # 1.07f

    .line 1040
    .line 1041
    .line 1042
    const v15, 0x3f6e147b    # 0.93f

    .line 1043
    .line 1044
    .line 1045
    const v16, 0x3ff851ec    # 1.94f

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1049
    .line 1050
    .line 1051
    const v0, -0x40a147ae    # -0.87f

    .line 1052
    .line 1053
    .line 1054
    const v2, -0x4007ae14    # -1.94f

    .line 1055
    .line 1056
    .line 1057
    const v4, 0x40051eb8    # 2.08f

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1061
    .line 1062
    .line 1063
    const/high16 v17, -0x3f180000    # -7.25f

    .line 1064
    .line 1065
    const v18, -0x3f2570a4    # -6.83f

    .line 1066
    .line 1067
    .line 1068
    const v14, -0x3f8eb852    # -3.77f

    .line 1069
    .line 1070
    .line 1071
    const/high16 v15, -0x3fb00000    # -3.25f

    .line 1072
    .line 1073
    const v16, -0x3f2570a4    # -6.83f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const v17, -0x3f2c7ae1    # -6.61f

    .line 1080
    .line 1081
    .line 1082
    const v18, 0x4080f5c3    # 4.03f

    .line 1083
    .line 1084
    .line 1085
    const v13, -0x3fca3d71    # -2.84f

    .line 1086
    .line 1087
    .line 1088
    const/4 v14, 0x0

    .line 1089
    const v15, -0x3f51eb85    # -5.44f

    .line 1090
    .line 1091
    .line 1092
    const v16, 0x3fca3d71    # 1.58f

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1096
    .line 1097
    .line 1098
    const v17, -0x40e8f5c3    # -0.59f

    .line 1099
    .line 1100
    .line 1101
    const v18, 0x40333333    # 2.8f

    .line 1102
    .line 1103
    .line 1104
    const v13, -0x413851ec    # -0.39f

    .line 1105
    .line 1106
    .line 1107
    const v14, 0x3f4f5c29    # 0.81f

    .line 1108
    .line 1109
    .line 1110
    const v15, -0x40e8f5c3    # -0.59f

    .line 1111
    .line 1112
    .line 1113
    const v16, 0x3fe147ae    # 1.76f

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    const v17, 0x3f2b851f    # 0.67f

    .line 1120
    .line 1121
    .line 1122
    const v18, 0x40670a3d    # 3.61f

    .line 1123
    .line 1124
    .line 1125
    const/4 v13, 0x0

    .line 1126
    const v14, 0x3f47ae14    # 0.78f

    .line 1127
    .line 1128
    .line 1129
    const v15, 0x3d8f5c29    # 0.07f

    .line 1130
    .line 1131
    .line 1132
    const v16, 0x4000a3d7    # 2.01f

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1136
    .line 1137
    .line 1138
    const v17, -0x416b851f    # -0.29f

    .line 1139
    .line 1140
    .line 1141
    const v18, 0x3f23d70a    # 0.64f

    .line 1142
    .line 1143
    .line 1144
    const v13, 0x3dcccccd    # 0.1f

    .line 1145
    .line 1146
    .line 1147
    const v14, 0x3e851eb8    # 0.26f

    .line 1148
    .line 1149
    .line 1150
    const v15, -0x430a3d71    # -0.03f

    .line 1151
    .line 1152
    .line 1153
    const v16, 0x3f0ccccd    # 0.55f

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1157
    .line 1158
    .line 1159
    const v17, -0x40dc28f6    # -0.64f

    .line 1160
    .line 1161
    .line 1162
    const v18, -0x416b851f    # -0.29f

    .line 1163
    .line 1164
    .line 1165
    const v13, -0x417ae148    # -0.26f

    .line 1166
    .line 1167
    .line 1168
    const v14, 0x3dcccccd    # 0.1f

    .line 1169
    .line 1170
    .line 1171
    const v15, -0x40f33333    # -0.55f

    .line 1172
    .line 1173
    .line 1174
    const v16, -0x42dc28f6    # -0.04f

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1178
    .line 1179
    .line 1180
    const v17, -0x40c51eb8    # -0.73f

    .line 1181
    .line 1182
    .line 1183
    const v18, -0x3f828f5c    # -3.96f

    .line 1184
    .line 1185
    .line 1186
    const v13, -0x41051eb8    # -0.49f

    .line 1187
    .line 1188
    .line 1189
    const v14, -0x405851ec    # -1.31f

    .line 1190
    .line 1191
    .line 1192
    const v15, -0x40c51eb8    # -0.73f

    .line 1193
    .line 1194
    .line 1195
    const v16, -0x3fd8f5c3    # -2.61f

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1199
    .line 1200
    .line 1201
    const v17, 0x3f2e147b    # 0.68f

    .line 1202
    .line 1203
    .line 1204
    const v18, -0x3fb0a3d7    # -3.24f

    .line 1205
    .line 1206
    .line 1207
    const/4 v13, 0x0

    .line 1208
    const v14, -0x40666666    # -1.2f

    .line 1209
    .line 1210
    .line 1211
    const v15, 0x3e6b851f    # 0.23f

    .line 1212
    .line 1213
    .line 1214
    const v16, -0x3fed70a4    # -2.29f

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1218
    .line 1219
    .line 1220
    const v17, 0x40f051ec    # 7.51f

    .line 1221
    .line 1222
    .line 1223
    const v18, -0x3f6ccccd    # -4.6f

    .line 1224
    .line 1225
    .line 1226
    const v13, 0x3faa3d71    # 1.33f

    .line 1227
    .line 1228
    .line 1229
    const v14, -0x3fcd70a4    # -2.79f

    .line 1230
    .line 1231
    .line 1232
    const v15, 0x4088f5c3    # 4.28f

    .line 1233
    .line 1234
    .line 1235
    const v16, -0x3f6ccccd    # -4.6f

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1239
    .line 1240
    .line 1241
    const/high16 v17, 0x41040000    # 8.25f

    .line 1242
    .line 1243
    const v18, 0x40fa8f5c    # 7.83f

    .line 1244
    .line 1245
    .line 1246
    const v13, 0x4091999a    # 4.55f

    .line 1247
    .line 1248
    .line 1249
    const/4 v14, 0x0

    .line 1250
    const/high16 v15, 0x41040000    # 8.25f

    .line 1251
    .line 1252
    const v16, 0x4060a3d7    # 3.51f

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1256
    .line 1257
    .line 1258
    const v17, -0x3fbae148    # -3.08f

    .line 1259
    .line 1260
    .line 1261
    const v18, 0x403c28f6    # 2.94f

    .line 1262
    .line 1263
    .line 1264
    const/4 v13, 0x0

    .line 1265
    const v14, 0x3fcf5c29    # 1.62f

    .line 1266
    .line 1267
    .line 1268
    const v15, -0x404f5c29    # -1.38f

    .line 1269
    .line 1270
    .line 1271
    const v16, 0x403c28f6    # 2.94f

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1275
    .line 1276
    .line 1277
    const v0, -0x40570a3d    # -1.32f

    .line 1278
    .line 1279
    .line 1280
    const v2, -0x3fc3d70a    # -2.94f

    .line 1281
    .line 1282
    .line 1283
    const v4, -0x3fbae148    # -3.08f

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1287
    .line 1288
    .line 1289
    const v17, -0x3ffae148    # -2.08f

    .line 1290
    .line 1291
    .line 1292
    const v18, -0x4007ae14    # -1.94f

    .line 1293
    .line 1294
    .line 1295
    const v14, -0x40770a3d    # -1.07f

    .line 1296
    .line 1297
    .line 1298
    const v15, -0x4091eb85    # -0.93f

    .line 1299
    .line 1300
    .line 1301
    const v16, -0x4007ae14    # -1.94f

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1305
    .line 1306
    .line 1307
    const v0, 0x3f5eb852    # 0.87f

    .line 1308
    .line 1309
    .line 1310
    const v2, 0x3ff851ec    # 1.94f

    .line 1311
    .line 1312
    .line 1313
    const v4, -0x3ffae148    # -2.08f

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1317
    .line 1318
    .line 1319
    const v17, 0x3fef5c29    # 1.87f

    .line 1320
    .line 1321
    .line 1322
    const v18, 0x409051ec    # 4.51f

    .line 1323
    .line 1324
    .line 1325
    const v14, 0x3fdae148    # 1.71f

    .line 1326
    .line 1327
    .line 1328
    const v15, 0x3f28f5c3    # 0.66f

    .line 1329
    .line 1330
    .line 1331
    const v16, 0x4053d70a    # 3.31f

    .line 1332
    .line 1333
    .line 1334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1335
    .line 1336
    .line 1337
    const v17, 0x405147ae    # 3.27f

    .line 1338
    .line 1339
    .line 1340
    const v18, 0x3feccccd    # 1.85f

    .line 1341
    .line 1342
    .line 1343
    const v13, 0x3f733333    # 0.95f

    .line 1344
    .line 1345
    .line 1346
    const v14, 0x3f70a3d7    # 0.94f

    .line 1347
    .line 1348
    .line 1349
    const v15, 0x3fee147b    # 1.86f

    .line 1350
    .line 1351
    .line 1352
    const v16, 0x3fbae148    # 1.46f

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1356
    .line 1357
    .line 1358
    const v17, 0x3eb33333    # 0.35f

    .line 1359
    .line 1360
    .line 1361
    const v18, 0x3f1c28f6    # 0.61f

    .line 1362
    .line 1363
    .line 1364
    const v13, 0x3e8a3d71    # 0.27f

    .line 1365
    .line 1366
    .line 1367
    const v14, 0x3d8f5c29    # 0.07f

    .line 1368
    .line 1369
    .line 1370
    const v15, 0x3ed70a3d    # 0.42f

    .line 1371
    .line 1372
    .line 1373
    const v16, 0x3eb33333    # 0.35f

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1377
    .line 1378
    .line 1379
    const v17, -0x410f5c29    # -0.47f

    .line 1380
    .line 1381
    .line 1382
    const v18, 0x3ec28f5c    # 0.38f

    .line 1383
    .line 1384
    .line 1385
    const v13, -0x42b33333    # -0.05f

    .line 1386
    .line 1387
    .line 1388
    const v14, 0x3e6b851f    # 0.23f

    .line 1389
    .line 1390
    .line 1391
    const v15, -0x417ae148    # -0.26f

    .line 1392
    .line 1393
    .line 1394
    const v16, 0x3ec28f5c    # 0.38f

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1401
    .line 1402
    .line 1403
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v2

    .line 1407
    const/16 v16, 0x3800

    .line 1408
    .line 1409
    const/16 v17, 0x0

    .line 1410
    .line 1411
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1412
    .line 1413
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1414
    .line 1415
    const/4 v7, 0x0

    .line 1416
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1417
    .line 1418
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1419
    .line 1420
    const/4 v13, 0x0

    .line 1421
    const/4 v14, 0x0

    .line 1422
    const/4 v15, 0x0

    .line 1423
    const-string v4, ""

    .line 1424
    .line 1425
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v0

    .line 1433
    sput-object v0, Landroidx/compose/material/icons/filled/FingerprintKt;->_fingerprint:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1434
    .line 1435
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1436
    .line 1437
    .line 1438
    return-object v0
.end method

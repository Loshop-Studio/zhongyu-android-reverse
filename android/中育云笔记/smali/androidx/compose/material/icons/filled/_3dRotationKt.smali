.class public final Landroidx/compose/material/icons/filled/_3dRotationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __3dRotation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_3dRotation(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/_3dRotationKt;->__3dRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled._3dRotation"

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
    const v0, 0x40f0a3d7    # 7.52f

    .line 71
    .line 72
    .line 73
    const v2, 0x41abd70a    # 21.48f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3fc66666    # 1.55f

    .line 80
    .line 81
    .line 82
    const/high16 v18, 0x41500000    # 13.0f

    .line 83
    .line 84
    const/high16 v13, 0x40880000    # 4.25f

    .line 85
    .line 86
    const v14, 0x419f851f    # 19.94f

    .line 87
    .line 88
    .line 89
    const v15, 0x3ff47ae1    # 1.91f

    .line 90
    .line 91
    .line 92
    const v16, 0x4186147b    # 16.76f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x3d4ccccd    # 0.05f

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x41500000    # 13.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, 0x41400000    # 12.0f

    .line 107
    .line 108
    const/high16 v18, 0x41c00000    # 24.0f

    .line 109
    .line 110
    const v13, 0x3f0f5c29    # 0.56f

    .line 111
    .line 112
    .line 113
    const v14, 0x419947ae    # 19.16f

    .line 114
    .line 115
    .line 116
    const v15, 0x40b6b852    # 5.71f

    .line 117
    .line 118
    .line 119
    const/high16 v16, 0x41c00000    # 24.0f

    .line 120
    .line 121
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x3f28f5c3    # 0.66f

    .line 125
    .line 126
    .line 127
    const v2, -0x430a3d71    # -0.03f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v0, -0x3f8c28f6    # -3.81f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x3fa8f5c3    # 1.32f

    .line 140
    .line 141
    .line 142
    const v2, -0x4055c28f    # -1.33f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x41068f5c    # 8.41f

    .line 152
    .line 153
    .line 154
    const v2, 0x416f5c29    # 14.96f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x40fae148    # -0.52f

    .line 161
    .line 162
    .line 163
    const v18, -0x425c28f6    # -0.08f

    .line 164
    .line 165
    .line 166
    const v13, -0x41bd70a4    # -0.19f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const v15, -0x41428f5c    # -0.37f

    .line 171
    .line 172
    .line 173
    const v16, -0x430a3d71    # -0.03f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, -0x41333333    # -0.4f

    .line 180
    .line 181
    .line 182
    const v18, -0x418a3d71    # -0.24f

    .line 183
    .line 184
    .line 185
    const v13, -0x41dc28f6    # -0.16f

    .line 186
    .line 187
    .line 188
    const v14, -0x428a3d71    # -0.06f

    .line 189
    .line 190
    .line 191
    const v15, -0x416b851f    # -0.29f

    .line 192
    .line 193
    .line 194
    const v16, -0x41fae148    # -0.13f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, -0x417ae148    # -0.26f

    .line 201
    .line 202
    .line 203
    const v18, -0x41428f5c    # -0.37f

    .line 204
    .line 205
    .line 206
    const v13, -0x421eb852    # -0.11f

    .line 207
    .line 208
    .line 209
    const v14, -0x42333333    # -0.1f

    .line 210
    .line 211
    .line 212
    const v15, -0x41b33333    # -0.2f

    .line 213
    .line 214
    .line 215
    const v16, -0x419eb852    # -0.22f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v17, -0x4247ae14    # -0.09f

    .line 222
    .line 223
    .line 224
    const v18, -0x410f5c29    # -0.47f

    .line 225
    .line 226
    .line 227
    const v13, -0x428a3d71    # -0.06f

    .line 228
    .line 229
    .line 230
    const v14, -0x41f0a3d7    # -0.14f

    .line 231
    .line 232
    .line 233
    const v15, -0x4247ae14    # -0.09f

    .line 234
    .line 235
    .line 236
    const v16, -0x41666666    # -0.3f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v0, -0x4059999a    # -1.3f

    .line 243
    .line 244
    .line 245
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, 0x3e570a3d    # 0.21f

    .line 249
    .line 250
    .line 251
    const v18, 0x3f733333    # 0.95f

    .line 252
    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    const v14, 0x3eb851ec    # 0.36f

    .line 256
    .line 257
    .line 258
    const v15, 0x3d8f5c29    # 0.07f

    .line 259
    .line 260
    .line 261
    const v16, 0x3f2e147b    # 0.68f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v17, 0x3f0f5c29    # 0.56f

    .line 268
    .line 269
    .line 270
    const v18, 0x3f30a3d7    # 0.69f

    .line 271
    .line 272
    .line 273
    const v13, 0x3e0f5c29    # 0.14f

    .line 274
    .line 275
    .line 276
    const v14, 0x3e8a3d71    # 0.27f

    .line 277
    .line 278
    .line 279
    const v15, 0x3ea8f5c3    # 0.33f

    .line 280
    .line 281
    .line 282
    const/high16 v16, 0x3f000000    # 0.5f

    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, 0x3f51eb85    # 0.82f

    .line 288
    .line 289
    .line 290
    const v18, 0x3ed1eb85    # 0.41f

    .line 291
    .line 292
    .line 293
    const v13, 0x3e75c28f    # 0.24f

    .line 294
    .line 295
    .line 296
    const v14, 0x3e3851ec    # 0.18f

    .line 297
    .line 298
    .line 299
    const v15, 0x3f028f5c    # 0.51f

    .line 300
    .line 301
    .line 302
    const v16, 0x3ea3d70a    # 0.32f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, 0x3f75c28f    # 0.96f

    .line 309
    .line 310
    .line 311
    const v18, 0x3e19999a    # 0.15f

    .line 312
    .line 313
    .line 314
    const v13, 0x3e99999a    # 0.3f

    .line 315
    .line 316
    .line 317
    const v14, 0x3dcccccd    # 0.1f

    .line 318
    .line 319
    .line 320
    const v15, 0x3f1eb852    # 0.62f

    .line 321
    .line 322
    .line 323
    const v16, 0x3e19999a    # 0.15f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x3f83d70a    # 1.03f

    .line 330
    .line 331
    .line 332
    const v18, -0x41e66666    # -0.15f

    .line 333
    .line 334
    .line 335
    const v13, 0x3ebd70a4    # 0.37f

    .line 336
    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    const v15, 0x3f3851ec    # 0.72f

    .line 340
    .line 341
    .line 342
    const v16, -0x42b33333    # -0.05f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v17, 0x3f547ae1    # 0.83f

    .line 349
    .line 350
    .line 351
    const v18, -0x411eb852    # -0.44f

    .line 352
    .line 353
    .line 354
    const v13, 0x3ea3d70a    # 0.32f

    .line 355
    .line 356
    .line 357
    const v14, -0x42333333    # -0.1f

    .line 358
    .line 359
    .line 360
    const v15, 0x3f19999a    # 0.6f

    .line 361
    .line 362
    .line 363
    const/high16 v16, -0x41800000    # -0.25f

    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v0, 0x3f0ccccd    # 0.55f

    .line 369
    .line 370
    .line 371
    const v2, -0x40c7ae14    # -0.72f

    .line 372
    .line 373
    .line 374
    const v4, 0x3ed70a3d    # 0.42f

    .line 375
    .line 376
    .line 377
    const v6, -0x4123d70a    # -0.43f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, 0x3e4ccccd    # 0.2f

    .line 384
    .line 385
    .line 386
    const v18, -0x4087ae14    # -0.97f

    .line 387
    .line 388
    .line 389
    const v13, 0x3e051eb8    # 0.13f

    .line 390
    .line 391
    .line 392
    const v14, -0x416b851f    # -0.29f

    .line 393
    .line 394
    .line 395
    const v15, 0x3e4ccccd    # 0.2f

    .line 396
    .line 397
    .line 398
    const v16, -0x40e3d70a    # -0.61f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x4270a3d7    # -0.07f

    .line 405
    .line 406
    .line 407
    const v18, -0x40f0a3d7    # -0.56f

    .line 408
    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const v14, -0x41bd70a4    # -0.19f

    .line 412
    .line 413
    .line 414
    const v15, -0x435c28f6    # -0.02f

    .line 415
    .line 416
    .line 417
    const v16, -0x413d70a4    # -0.38f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x41947ae1    # -0.23f

    .line 424
    .line 425
    .line 426
    const v18, -0x40fd70a4    # -0.51f

    .line 427
    .line 428
    .line 429
    const v13, -0x42b33333    # -0.05f

    .line 430
    .line 431
    .line 432
    const v14, -0x41c7ae14    # -0.18f

    .line 433
    .line 434
    .line 435
    const v15, -0x420a3d71    # -0.12f

    .line 436
    .line 437
    .line 438
    const v16, -0x414ccccd    # -0.35f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, -0x41333333    # -0.4f

    .line 445
    .line 446
    .line 447
    const v18, -0x4123d70a    # -0.43f

    .line 448
    .line 449
    .line 450
    const v13, -0x42333333    # -0.1f

    .line 451
    .line 452
    .line 453
    const v14, -0x41dc28f6    # -0.16f

    .line 454
    .line 455
    .line 456
    const v15, -0x418a3d71    # -0.24f

    .line 457
    .line 458
    .line 459
    const v16, -0x41666666    # -0.3f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, -0x40e3d70a    # -0.61f

    .line 466
    .line 467
    .line 468
    const v18, -0x416147ae    # -0.31f

    .line 469
    .line 470
    .line 471
    const v13, -0x41d1eb85    # -0.17f

    .line 472
    .line 473
    .line 474
    const v14, -0x41fae148    # -0.13f

    .line 475
    .line 476
    .line 477
    const v15, -0x41428f5c    # -0.37f

    .line 478
    .line 479
    .line 480
    const v16, -0x41947ae1    # -0.23f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v17, 0x3f051eb8    # 0.52f

    .line 487
    .line 488
    .line 489
    const v18, -0x41570a3d    # -0.33f

    .line 490
    .line 491
    .line 492
    const v13, 0x3e4ccccd    # 0.2f

    .line 493
    .line 494
    .line 495
    const v14, -0x4247ae14    # -0.09f

    .line 496
    .line 497
    .line 498
    const v15, 0x3ebd70a4    # 0.37f

    .line 499
    .line 500
    .line 501
    const v16, -0x41b33333    # -0.2f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, 0x3ebd70a4    # 0.37f

    .line 508
    .line 509
    .line 510
    const v18, -0x4128f5c3    # -0.42f

    .line 511
    .line 512
    .line 513
    const v13, 0x3e19999a    # 0.15f

    .line 514
    .line 515
    .line 516
    const v14, -0x41fae148    # -0.13f

    .line 517
    .line 518
    .line 519
    const v15, 0x3e8a3d71    # 0.27f

    .line 520
    .line 521
    .line 522
    const v16, -0x4175c28f    # -0.27f

    .line 523
    .line 524
    .line 525
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v17, 0x3e6147ae    # 0.22f

    .line 529
    .line 530
    .line 531
    const v18, -0x41147ae1    # -0.46f

    .line 532
    .line 533
    .line 534
    const v13, 0x3dcccccd    # 0.1f

    .line 535
    .line 536
    .line 537
    const v14, -0x41e66666    # -0.15f

    .line 538
    .line 539
    .line 540
    const v15, 0x3e2e147b    # 0.17f

    .line 541
    .line 542
    .line 543
    const v16, -0x41666666    # -0.3f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x3d8f5c29    # 0.07f

    .line 550
    .line 551
    .line 552
    const v18, -0x410a3d71    # -0.48f

    .line 553
    .line 554
    .line 555
    const v13, 0x3d4ccccd    # 0.05f

    .line 556
    .line 557
    .line 558
    const v14, -0x41dc28f6    # -0.16f

    .line 559
    .line 560
    .line 561
    const v15, 0x3d8f5c29    # 0.07f

    .line 562
    .line 563
    .line 564
    const v16, -0x415c28f6    # -0.32f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v17, -0x41c7ae14    # -0.18f

    .line 571
    .line 572
    .line 573
    const v18, -0x408a3d71    # -0.96f

    .line 574
    .line 575
    .line 576
    const/4 v13, 0x0

    .line 577
    const v14, -0x4147ae14    # -0.36f

    .line 578
    .line 579
    .line 580
    const v15, -0x428a3d71    # -0.06f

    .line 581
    .line 582
    .line 583
    const v16, -0x40d1eb85    # -0.68f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v17, -0x40fd70a4    # -0.51f

    .line 590
    .line 591
    .line 592
    const v18, -0x40cf5c29    # -0.69f

    .line 593
    .line 594
    .line 595
    const v13, -0x420a3d71    # -0.12f

    .line 596
    .line 597
    .line 598
    const v14, -0x4170a3d7    # -0.28f

    .line 599
    .line 600
    .line 601
    const v15, -0x416b851f    # -0.29f

    .line 602
    .line 603
    .line 604
    const v16, -0x40fd70a4    # -0.51f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v17, -0x40bae148    # -0.77f

    .line 611
    .line 612
    .line 613
    const v18, -0x4123d70a    # -0.43f

    .line 614
    .line 615
    .line 616
    const v13, -0x41b33333    # -0.2f

    .line 617
    .line 618
    .line 619
    const v14, -0x41bd70a4    # -0.19f

    .line 620
    .line 621
    .line 622
    const v15, -0x410f5c29    # -0.47f

    .line 623
    .line 624
    .line 625
    const v16, -0x41570a3d    # -0.33f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v17, 0x41063d71    # 8.39f

    .line 632
    .line 633
    .line 634
    const/high16 v18, 0x41000000    # 8.0f

    .line 635
    .line 636
    const v13, 0x4111999a    # 9.1f

    .line 637
    .line 638
    .line 639
    const v14, 0x4100cccd    # 8.05f

    .line 640
    .line 641
    .line 642
    const v15, 0x410c28f6    # 8.76f

    .line 643
    .line 644
    .line 645
    const/high16 v16, 0x41000000    # 8.0f

    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v17, -0x40800000    # -1.0f

    .line 651
    .line 652
    const v18, 0x3e23d70a    # 0.16f

    .line 653
    .line 654
    .line 655
    const v13, -0x4147ae14    # -0.36f

    .line 656
    .line 657
    .line 658
    const/4 v14, 0x0

    .line 659
    const v15, -0x40cf5c29    # -0.69f

    .line 660
    .line 661
    .line 662
    const v16, 0x3d4ccccd    # 0.05f

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v17, -0x40b5c28f    # -0.79f

    .line 669
    .line 670
    .line 671
    const v18, 0x3ee66666    # 0.45f

    .line 672
    .line 673
    .line 674
    const v13, -0x41666666    # -0.3f

    .line 675
    .line 676
    .line 677
    const v14, 0x3de147ae    # 0.11f

    .line 678
    .line 679
    .line 680
    const v15, -0x40ee147b    # -0.57f

    .line 681
    .line 682
    .line 683
    const v16, 0x3e851eb8    # 0.26f

    .line 684
    .line 685
    .line 686
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const v17, -0x40fd70a4    # -0.51f

    .line 690
    .line 691
    .line 692
    const v18, 0x3f2b851f    # 0.67f

    .line 693
    .line 694
    .line 695
    const v13, -0x41a8f5c3    # -0.21f

    .line 696
    .line 697
    .line 698
    const v14, 0x3e428f5c    # 0.19f

    .line 699
    .line 700
    .line 701
    const v15, -0x413d70a4    # -0.38f

    .line 702
    .line 703
    .line 704
    const v16, 0x3ed1eb85    # 0.41f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, -0x41c7ae14    # -0.18f

    .line 711
    .line 712
    .line 713
    const v18, 0x3f59999a    # 0.85f

    .line 714
    .line 715
    .line 716
    const v13, -0x420a3d71    # -0.12f

    .line 717
    .line 718
    .line 719
    const v14, 0x3e851eb8    # 0.26f

    .line 720
    .line 721
    .line 722
    const v15, -0x41c7ae14    # -0.18f

    .line 723
    .line 724
    .line 725
    const v16, 0x3f0a3d71    # 0.54f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, 0x3fa66666    # 1.3f

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v17, 0x3db851ec    # 0.09f

    .line 738
    .line 739
    .line 740
    const v18, -0x4119999a    # -0.45f

    .line 741
    .line 742
    .line 743
    const/4 v13, 0x0

    .line 744
    const v14, -0x41d1eb85    # -0.17f

    .line 745
    .line 746
    .line 747
    const v15, 0x3cf5c28f    # 0.03f

    .line 748
    .line 749
    .line 750
    const v16, -0x415c28f6    # -0.32f

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v0, 0x3e800000    # 0.25f

    .line 757
    .line 758
    const v2, -0x4151eb85    # -0.34f

    .line 759
    .line 760
    .line 761
    const v4, 0x3e0f5c29    # 0.14f

    .line 762
    .line 763
    .line 764
    const/high16 v6, -0x41800000    # -0.25f

    .line 765
    .line 766
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v17, 0x3ec28f5c    # 0.38f

    .line 770
    .line 771
    .line 772
    const v18, -0x419eb852    # -0.22f

    .line 773
    .line 774
    .line 775
    const v13, 0x3de147ae    # 0.11f

    .line 776
    .line 777
    .line 778
    const v14, -0x4247ae14    # -0.09f

    .line 779
    .line 780
    .line 781
    const v15, 0x3e6b851f    # 0.23f

    .line 782
    .line 783
    .line 784
    const v16, -0x41d1eb85    # -0.17f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v17, 0x3ef5c28f    # 0.48f

    .line 791
    .line 792
    .line 793
    const v18, -0x425c28f6    # -0.08f

    .line 794
    .line 795
    .line 796
    const v13, 0x3e19999a    # 0.15f

    .line 797
    .line 798
    .line 799
    const v14, -0x42b33333    # -0.05f

    .line 800
    .line 801
    .line 802
    const v15, 0x3e99999a    # 0.3f

    .line 803
    .line 804
    .line 805
    const v16, -0x425c28f6    # -0.08f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v17, 0x3f63d70a    # 0.89f

    .line 812
    .line 813
    .line 814
    const v18, 0x3e9eb852    # 0.31f

    .line 815
    .line 816
    .line 817
    const v13, 0x3ecccccd    # 0.4f

    .line 818
    .line 819
    .line 820
    const/4 v14, 0x0

    .line 821
    const v15, 0x3f333333    # 0.7f

    .line 822
    .line 823
    .line 824
    const v16, 0x3dcccccd    # 0.1f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v17, 0x3e947ae1    # 0.29f

    .line 831
    .line 832
    .line 833
    const v18, 0x3f5c28f6    # 0.86f

    .line 834
    .line 835
    .line 836
    const v13, 0x3e428f5c    # 0.19f

    .line 837
    .line 838
    .line 839
    const v14, 0x3e4ccccd    # 0.2f

    .line 840
    .line 841
    .line 842
    const v15, 0x3e947ae1    # 0.29f

    .line 843
    .line 844
    .line 845
    const v16, 0x3efae148    # 0.49f

    .line 846
    .line 847
    .line 848
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    .line 851
    const v17, -0x425c28f6    # -0.08f

    .line 852
    .line 853
    .line 854
    const v18, 0x3efae148    # 0.49f

    .line 855
    .line 856
    .line 857
    const/4 v13, 0x0

    .line 858
    const v14, 0x3e3851ec    # 0.18f

    .line 859
    .line 860
    .line 861
    const v15, -0x430a3d71    # -0.03f

    .line 862
    .line 863
    .line 864
    const v16, 0x3eae147b    # 0.34f

    .line 865
    .line 866
    .line 867
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const/high16 v17, -0x41800000    # -0.25f

    .line 871
    .line 872
    const v18, 0x3ebd70a4    # 0.37f

    .line 873
    .line 874
    .line 875
    const v13, -0x42b33333    # -0.05f

    .line 876
    .line 877
    .line 878
    const v14, 0x3e19999a    # 0.15f

    .line 879
    .line 880
    .line 881
    const v15, -0x41f0a3d7    # -0.14f

    .line 882
    .line 883
    .line 884
    const v16, 0x3e8a3d71    # 0.27f

    .line 885
    .line 886
    .line 887
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v17, -0x412e147b    # -0.41f

    .line 891
    .line 892
    .line 893
    const v18, 0x3e75c28f    # 0.24f

    .line 894
    .line 895
    .line 896
    const v13, -0x421eb852    # -0.11f

    .line 897
    .line 898
    .line 899
    const v14, 0x3dcccccd    # 0.1f

    .line 900
    .line 901
    .line 902
    const/high16 v15, -0x41800000    # -0.25f

    .line 903
    .line 904
    const v16, 0x3e3851ec    # 0.18f

    .line 905
    .line 906
    .line 907
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const v17, -0x40eb851f    # -0.58f

    .line 911
    .line 912
    .line 913
    const v18, 0x3db851ec    # 0.09f

    .line 914
    .line 915
    .line 916
    const v13, -0x41dc28f6    # -0.16f

    .line 917
    .line 918
    .line 919
    const v14, 0x3d75c28f    # 0.06f

    .line 920
    .line 921
    .line 922
    const v15, -0x4147ae14    # -0.36f

    .line 923
    .line 924
    .line 925
    const v16, 0x3db851ec    # 0.09f

    .line 926
    .line 927
    .line 928
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const/high16 v0, 0x40f00000    # 7.5f

    .line 932
    .line 933
    const v2, 0x41366666    # 11.4f

    .line 934
    .line 935
    .line 936
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 937
    .line 938
    .line 939
    const v0, 0x3f83d70a    # 1.03f

    .line 940
    .line 941
    .line 942
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const v0, 0x3f451eb8    # 0.77f

    .line 946
    .line 947
    .line 948
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const v17, 0x3f19999a    # 0.6f

    .line 952
    .line 953
    .line 954
    const v18, 0x3d8f5c29    # 0.07f

    .line 955
    .line 956
    .line 957
    const v13, 0x3e6147ae    # 0.22f

    .line 958
    .line 959
    .line 960
    const/4 v14, 0x0

    .line 961
    const v15, 0x3ed70a3d    # 0.42f

    .line 962
    .line 963
    .line 964
    const v16, 0x3ca3d70a    # 0.02f

    .line 965
    .line 966
    .line 967
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const v0, 0x3ee66666    # 0.45f

    .line 971
    .line 972
    .line 973
    const v2, 0x3e6b851f    # 0.23f

    .line 974
    .line 975
    .line 976
    const v4, 0x3ea8f5c3    # 0.33f

    .line 977
    .line 978
    .line 979
    const v6, 0x3e051eb8    # 0.13f

    .line 980
    .line 981
    .line 982
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 983
    .line 984
    .line 985
    const v17, 0x3e947ae1    # 0.29f

    .line 986
    .line 987
    .line 988
    const v18, 0x3ecccccd    # 0.4f

    .line 989
    .line 990
    .line 991
    const v13, 0x3df5c28f    # 0.12f

    .line 992
    .line 993
    .line 994
    const v14, 0x3de147ae    # 0.11f

    .line 995
    .line 996
    .line 997
    const v15, 0x3e6147ae    # 0.22f

    .line 998
    .line 999
    .line 1000
    const v16, 0x3e75c28f    # 0.24f

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    const v17, 0x3dcccccd    # 0.1f

    .line 1007
    .line 1008
    .line 1009
    const v18, 0x3f11eb85    # 0.57f

    .line 1010
    .line 1011
    .line 1012
    const v13, 0x3d8f5c29    # 0.07f

    .line 1013
    .line 1014
    .line 1015
    const v14, 0x3e23d70a    # 0.16f

    .line 1016
    .line 1017
    .line 1018
    const v15, 0x3dcccccd    # 0.1f

    .line 1019
    .line 1020
    .line 1021
    const v16, 0x3eb33333    # 0.35f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v17, -0x414ccccd    # -0.35f

    .line 1028
    .line 1029
    .line 1030
    const v18, 0x3f6e147b    # 0.93f

    .line 1031
    .line 1032
    .line 1033
    const/4 v13, 0x0

    .line 1034
    const v14, 0x3ed1eb85    # 0.41f

    .line 1035
    .line 1036
    .line 1037
    const v15, -0x420a3d71    # -0.12f

    .line 1038
    .line 1039
    .line 1040
    const v16, 0x3f3851ec    # 0.72f

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1044
    .line 1045
    .line 1046
    const v17, -0x408ccccd    # -0.95f

    .line 1047
    .line 1048
    .line 1049
    const v18, 0x3ea8f5c3    # 0.33f

    .line 1050
    .line 1051
    .line 1052
    const v13, -0x41947ae1    # -0.23f

    .line 1053
    .line 1054
    .line 1055
    const v14, 0x3e6b851f    # 0.23f

    .line 1056
    .line 1057
    .line 1058
    const v15, -0x40f33333    # -0.55f

    .line 1059
    .line 1060
    .line 1061
    const v16, 0x3ea8f5c3    # 0.33f

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const v0, 0x4187ae14    # 16.96f

    .line 1071
    .line 1072
    .line 1073
    const v2, 0x4110a3d7    # 9.04f

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const v17, -0x406e147b    # -1.14f

    .line 1080
    .line 1081
    .line 1082
    const v18, -0x40bae148    # -0.77f

    .line 1083
    .line 1084
    .line 1085
    const v13, -0x415c28f6    # -0.32f

    .line 1086
    .line 1087
    .line 1088
    const v14, -0x41570a3d    # -0.33f

    .line 1089
    .line 1090
    .line 1091
    const v15, -0x40cccccd    # -0.7f

    .line 1092
    .line 1093
    .line 1094
    const v16, -0x40e8f5c3    # -0.59f

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1098
    .line 1099
    .line 1100
    const v17, -0x40451eb8    # -1.46f

    .line 1101
    .line 1102
    .line 1103
    const v18, -0x4175c28f    # -0.27f

    .line 1104
    .line 1105
    .line 1106
    const v13, -0x4123d70a    # -0.43f

    .line 1107
    .line 1108
    .line 1109
    const v14, -0x41c7ae14    # -0.18f

    .line 1110
    .line 1111
    .line 1112
    const v15, -0x40947ae1    # -0.92f

    .line 1113
    .line 1114
    .line 1115
    const v16, -0x4175c28f    # -0.27f

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1119
    .line 1120
    .line 1121
    const/high16 v0, 0x41000000    # 8.0f

    .line 1122
    .line 1123
    const/high16 v2, 0x41400000    # 12.0f

    .line 1124
    .line 1125
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1129
    .line 1130
    .line 1131
    const v0, 0x40133333    # 2.3f

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1135
    .line 1136
    .line 1137
    const v17, 0x3fc147ae    # 1.51f

    .line 1138
    .line 1139
    .line 1140
    const v13, 0x3f0ccccd    # 0.55f

    .line 1141
    .line 1142
    .line 1143
    const/4 v14, 0x0

    .line 1144
    const v15, 0x3f87ae14    # 1.06f

    .line 1145
    .line 1146
    .line 1147
    const v16, -0x4247ae14    # -0.09f

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1151
    .line 1152
    .line 1153
    const v17, 0x3f947ae1    # 1.16f

    .line 1154
    .line 1155
    .line 1156
    const v18, -0x40bd70a4    # -0.76f

    .line 1157
    .line 1158
    .line 1159
    const v13, 0x3ee66666    # 0.45f

    .line 1160
    .line 1161
    .line 1162
    const v14, -0x41c7ae14    # -0.18f

    .line 1163
    .line 1164
    .line 1165
    const v15, 0x3f570a3d    # 0.84f

    .line 1166
    .line 1167
    .line 1168
    const v16, -0x4123d70a    # -0.43f

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1172
    .line 1173
    .line 1174
    const v17, 0x3f3d70a4    # 0.74f

    .line 1175
    .line 1176
    .line 1177
    const v18, -0x4067ae14    # -1.19f

    .line 1178
    .line 1179
    .line 1180
    const v13, 0x3ea3d70a    # 0.32f

    .line 1181
    .line 1182
    .line 1183
    const v14, -0x41570a3d    # -0.33f

    .line 1184
    .line 1185
    .line 1186
    const v15, 0x3f11eb85    # 0.57f

    .line 1187
    .line 1188
    .line 1189
    const v16, -0x40c51eb8    # -0.73f

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1193
    .line 1194
    .line 1195
    const v17, 0x3e851eb8    # 0.26f

    .line 1196
    .line 1197
    .line 1198
    const v18, -0x40370a3d    # -1.57f

    .line 1199
    .line 1200
    .line 1201
    const v13, 0x3e2e147b    # 0.17f

    .line 1202
    .line 1203
    .line 1204
    const v14, -0x410f5c29    # -0.47f

    .line 1205
    .line 1206
    .line 1207
    const v15, 0x3e851eb8    # 0.26f

    .line 1208
    .line 1209
    .line 1210
    const v16, -0x40828f5c    # -0.99f

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1214
    .line 1215
    .line 1216
    const v0, -0x41333333    # -0.4f

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1220
    .line 1221
    .line 1222
    const v17, -0x417ae148    # -0.26f

    .line 1223
    .line 1224
    .line 1225
    const/4 v13, 0x0

    .line 1226
    const v14, -0x40eb851f    # -0.58f

    .line 1227
    .line 1228
    .line 1229
    const v15, -0x4247ae14    # -0.09f

    .line 1230
    .line 1231
    .line 1232
    const v16, -0x40733333    # -1.1f

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1236
    .line 1237
    .line 1238
    const/high16 v17, -0x40c00000    # -0.75f

    .line 1239
    .line 1240
    const v18, -0x40666666    # -1.2f

    .line 1241
    .line 1242
    .line 1243
    const v13, -0x41c7ae14    # -0.18f

    .line 1244
    .line 1245
    .line 1246
    const v14, -0x410f5c29    # -0.47f

    .line 1247
    .line 1248
    .line 1249
    const v15, -0x4123d70a    # -0.43f

    .line 1250
    .line 1251
    .line 1252
    const v16, -0x40a147ae    # -0.87f

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1259
    .line 1260
    .line 1261
    const v0, 0x41848f5c    # 16.57f

    .line 1262
    .line 1263
    .line 1264
    const v2, 0x41433333    # 12.2f

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1268
    .line 1269
    .line 1270
    const v17, -0x41f0a3d7    # -0.14f

    .line 1271
    .line 1272
    .line 1273
    const v18, 0x3f90a3d7    # 1.13f

    .line 1274
    .line 1275
    .line 1276
    const/4 v13, 0x0

    .line 1277
    const v14, 0x3ed70a3d    # 0.42f

    .line 1278
    .line 1279
    .line 1280
    const v15, -0x42b33333    # -0.05f

    .line 1281
    .line 1282
    .line 1283
    const v16, 0x3f4a3d71    # 0.79f

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1287
    .line 1288
    .line 1289
    const v17, -0x4123d70a    # -0.43f

    .line 1290
    .line 1291
    .line 1292
    const v18, 0x3f59999a    # 0.85f

    .line 1293
    .line 1294
    .line 1295
    const v13, -0x42333333    # -0.1f

    .line 1296
    .line 1297
    .line 1298
    const v14, 0x3ea8f5c3    # 0.33f

    .line 1299
    .line 1300
    .line 1301
    const v15, -0x418a3d71    # -0.24f

    .line 1302
    .line 1303
    .line 1304
    const v16, 0x3f1eb852    # 0.62f

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1308
    .line 1309
    .line 1310
    const v17, -0x40ca3d71    # -0.71f

    .line 1311
    .line 1312
    .line 1313
    const v18, 0x3f07ae14    # 0.53f

    .line 1314
    .line 1315
    .line 1316
    const v13, -0x41bd70a4    # -0.19f

    .line 1317
    .line 1318
    .line 1319
    const v14, 0x3e6b851f    # 0.23f

    .line 1320
    .line 1321
    .line 1322
    const v15, -0x4123d70a    # -0.43f

    .line 1323
    .line 1324
    .line 1325
    const v16, 0x3ed1eb85    # 0.41f

    .line 1326
    .line 1327
    .line 1328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1329
    .line 1330
    .line 1331
    const v17, -0x40828f5c    # -0.99f

    .line 1332
    .line 1333
    .line 1334
    const v18, 0x3e3851ec    # 0.18f

    .line 1335
    .line 1336
    .line 1337
    const v13, -0x416b851f    # -0.29f

    .line 1338
    .line 1339
    .line 1340
    const v14, 0x3df5c28f    # 0.12f

    .line 1341
    .line 1342
    .line 1343
    const v15, -0x40e147ae    # -0.62f

    .line 1344
    .line 1345
    .line 1346
    const v16, 0x3e3851ec    # 0.18f

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1350
    .line 1351
    .line 1352
    const v0, -0x40970a3d    # -0.91f

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1356
    .line 1357
    .line 1358
    const v0, 0x41563d71    # 13.39f

    .line 1359
    .line 1360
    .line 1361
    const v2, 0x4111eb85    # 9.12f

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1365
    .line 1366
    .line 1367
    const v0, 0x3f7851ec    # 0.97f

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1371
    .line 1372
    .line 1373
    const v17, 0x3fd1eb85    # 1.64f

    .line 1374
    .line 1375
    .line 1376
    const v18, 0x3f30a3d7    # 0.69f

    .line 1377
    .line 1378
    .line 1379
    const v13, 0x3f3851ec    # 0.72f

    .line 1380
    .line 1381
    .line 1382
    const/4 v14, 0x0

    .line 1383
    const v15, 0x3fa28f5c    # 1.27f

    .line 1384
    .line 1385
    .line 1386
    const v16, 0x3e6b851f    # 0.23f

    .line 1387
    .line 1388
    .line 1389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1390
    .line 1391
    .line 1392
    const v17, 0x3f11eb85    # 0.57f

    .line 1393
    .line 1394
    .line 1395
    const v18, 0x3ffeb852    # 1.99f

    .line 1396
    .line 1397
    .line 1398
    const v13, 0x3ec28f5c    # 0.38f

    .line 1399
    .line 1400
    .line 1401
    const v14, 0x3eeb851f    # 0.46f

    .line 1402
    .line 1403
    .line 1404
    const v15, 0x3f11eb85    # 0.57f

    .line 1405
    .line 1406
    .line 1407
    const v16, 0x3f8f5c29    # 1.12f

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1411
    .line 1412
    .line 1413
    const v0, 0x3ecccccd    # 0.4f

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1417
    .line 1418
    .line 1419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1420
    .line 1421
    .line 1422
    const/4 v0, 0x0

    .line 1423
    const/high16 v2, 0x41400000    # 12.0f

    .line 1424
    .line 1425
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1426
    .line 1427
    .line 1428
    const v0, -0x40d70a3d    # -0.66f

    .line 1429
    .line 1430
    .line 1431
    const v2, 0x3cf5c28f    # 0.03f

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1435
    .line 1436
    .line 1437
    const v0, 0x4073d70a    # 3.81f

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1441
    .line 1442
    .line 1443
    const v0, 0x3faa3d71    # 1.33f

    .line 1444
    .line 1445
    .line 1446
    const v2, -0x4055c28f    # -1.33f

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1450
    .line 1451
    .line 1452
    const v17, 0x40beb852    # 5.96f

    .line 1453
    .line 1454
    .line 1455
    const v18, 0x4107ae14    # 8.48f

    .line 1456
    .line 1457
    .line 1458
    const v13, 0x405147ae    # 3.27f

    .line 1459
    .line 1460
    .line 1461
    const v14, 0x3fc66666    # 1.55f

    .line 1462
    .line 1463
    .line 1464
    const v15, 0x40b3851f    # 5.61f

    .line 1465
    .line 1466
    .line 1467
    const v16, 0x40970a3d    # 4.72f

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1471
    .line 1472
    .line 1473
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 1474
    .line 1475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1476
    .line 1477
    .line 1478
    const/high16 v17, 0x41400000    # 12.0f

    .line 1479
    .line 1480
    const/16 v18, 0x0

    .line 1481
    .line 1482
    const v13, 0x41bb851f    # 23.44f

    .line 1483
    .line 1484
    .line 1485
    const v14, 0x409ae148    # 4.84f

    .line 1486
    .line 1487
    .line 1488
    const v15, 0x419251ec    # 18.29f

    .line 1489
    .line 1490
    .line 1491
    const/16 v16, 0x0

    .line 1492
    .line 1493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1494
    .line 1495
    .line 1496
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v2

    .line 1503
    const/16 v16, 0x3800

    .line 1504
    .line 1505
    const/16 v17, 0x0

    .line 1506
    .line 1507
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1508
    .line 1509
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1510
    .line 1511
    const/4 v7, 0x0

    .line 1512
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1513
    .line 1514
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1515
    .line 1516
    const/4 v13, 0x0

    .line 1517
    const/4 v14, 0x0

    .line 1518
    const/4 v15, 0x0

    .line 1519
    const-string v4, ""

    .line 1520
    .line 1521
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    sput-object v0, Landroidx/compose/material/icons/filled/_3dRotationKt;->__3dRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1530
    .line 1531
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1532
    .line 1533
    .line 1534
    return-object v0
.end method

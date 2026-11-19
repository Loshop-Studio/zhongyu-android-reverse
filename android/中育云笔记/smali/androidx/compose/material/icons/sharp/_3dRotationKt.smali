.class public final Landroidx/compose/material/icons/sharp/_3dRotationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static __3dRotation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_3dRotation(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/_3dRotationKt;->__3dRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp._3dRotation"

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
    const v0, 0x40f0f5c3    # 7.53f

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
    const v17, 0x3fc7ae14    # 1.56f

    .line 80
    .line 81
    .line 82
    const/high16 v18, 0x41500000    # 13.0f

    .line 83
    .line 84
    const v13, 0x408851ec    # 4.26f

    .line 85
    .line 86
    .line 87
    const v14, 0x419f851f    # 19.94f

    .line 88
    .line 89
    .line 90
    const v15, 0x3ff5c28f    # 1.92f

    .line 91
    .line 92
    .line 93
    const v16, 0x4186147b    # 16.76f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x3d75c28f    # 0.06f

    .line 100
    .line 101
    .line 102
    const/high16 v2, 0x41500000    # 13.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v17, 0x413f3333    # 11.95f

    .line 108
    .line 109
    .line 110
    const/high16 v18, 0x41300000    # 11.0f

    .line 111
    .line 112
    const v13, 0x3f028f5c    # 0.51f

    .line 113
    .line 114
    .line 115
    const v14, 0x40c51eb8    # 6.16f

    .line 116
    .line 117
    .line 118
    const v15, 0x40b51eb8    # 5.66f

    .line 119
    .line 120
    .line 121
    const/high16 v16, 0x41300000    # 11.0f

    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v0, 0x3f28f5c3    # 0.66f

    .line 127
    .line 128
    .line 129
    const v2, -0x430a3d71    # -0.03f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v0, -0x3f8c28f6    # -3.81f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x3fa8f5c3    # 1.32f

    .line 142
    .line 143
    .line 144
    const v2, -0x4055c28f    # -1.33f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x4106b852    # 8.42f

    .line 154
    .line 155
    .line 156
    const v2, 0x416f5c29    # 14.96f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, -0x40fae148    # -0.52f

    .line 163
    .line 164
    .line 165
    const v18, -0x425c28f6    # -0.08f

    .line 166
    .line 167
    .line 168
    const v13, -0x41bd70a4    # -0.19f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const v15, -0x41428f5c    # -0.37f

    .line 173
    .line 174
    .line 175
    const v16, -0x430a3d71    # -0.03f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, -0x41333333    # -0.4f

    .line 182
    .line 183
    .line 184
    const v18, -0x418a3d71    # -0.24f

    .line 185
    .line 186
    .line 187
    const v13, -0x41dc28f6    # -0.16f

    .line 188
    .line 189
    .line 190
    const v14, -0x428a3d71    # -0.06f

    .line 191
    .line 192
    .line 193
    const v15, -0x416b851f    # -0.29f

    .line 194
    .line 195
    .line 196
    const v16, -0x41fae148    # -0.13f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, -0x417ae148    # -0.26f

    .line 203
    .line 204
    .line 205
    const v18, -0x41428f5c    # -0.37f

    .line 206
    .line 207
    .line 208
    const v13, -0x421eb852    # -0.11f

    .line 209
    .line 210
    .line 211
    const v14, -0x42333333    # -0.1f

    .line 212
    .line 213
    .line 214
    const v15, -0x41b33333    # -0.2f

    .line 215
    .line 216
    .line 217
    const v16, -0x419eb852    # -0.22f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, -0x4247ae14    # -0.09f

    .line 224
    .line 225
    .line 226
    const v18, -0x410f5c29    # -0.47f

    .line 227
    .line 228
    .line 229
    const v13, -0x428a3d71    # -0.06f

    .line 230
    .line 231
    .line 232
    const v14, -0x41f0a3d7    # -0.14f

    .line 233
    .line 234
    .line 235
    const v15, -0x4247ae14    # -0.09f

    .line 236
    .line 237
    .line 238
    const v16, -0x41666666    # -0.3f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, -0x4059999a    # -1.3f

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, 0x3e570a3d    # 0.21f

    .line 251
    .line 252
    .line 253
    const v18, 0x3f733333    # 0.95f

    .line 254
    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const v14, 0x3eb851ec    # 0.36f

    .line 258
    .line 259
    .line 260
    const v15, 0x3d8f5c29    # 0.07f

    .line 261
    .line 262
    .line 263
    const v16, 0x3f2e147b    # 0.68f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x3f0f5c29    # 0.56f

    .line 270
    .line 271
    .line 272
    const v18, 0x3f30a3d7    # 0.69f

    .line 273
    .line 274
    .line 275
    const v13, 0x3e0f5c29    # 0.14f

    .line 276
    .line 277
    .line 278
    const v14, 0x3e8a3d71    # 0.27f

    .line 279
    .line 280
    .line 281
    const v15, 0x3ea8f5c3    # 0.33f

    .line 282
    .line 283
    .line 284
    const/high16 v16, 0x3f000000    # 0.5f

    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x3f51eb85    # 0.82f

    .line 290
    .line 291
    .line 292
    const v18, 0x3ed1eb85    # 0.41f

    .line 293
    .line 294
    .line 295
    const v13, 0x3e75c28f    # 0.24f

    .line 296
    .line 297
    .line 298
    const v14, 0x3e3851ec    # 0.18f

    .line 299
    .line 300
    .line 301
    const v15, 0x3f028f5c    # 0.51f

    .line 302
    .line 303
    .line 304
    const v16, 0x3ea3d70a    # 0.32f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x3f75c28f    # 0.96f

    .line 311
    .line 312
    .line 313
    const v18, 0x3e19999a    # 0.15f

    .line 314
    .line 315
    .line 316
    const v13, 0x3e99999a    # 0.3f

    .line 317
    .line 318
    .line 319
    const v14, 0x3dcccccd    # 0.1f

    .line 320
    .line 321
    .line 322
    const v15, 0x3f1eb852    # 0.62f

    .line 323
    .line 324
    .line 325
    const v16, 0x3e19999a    # 0.15f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v17, 0x3f83d70a    # 1.03f

    .line 332
    .line 333
    .line 334
    const v18, -0x41e66666    # -0.15f

    .line 335
    .line 336
    .line 337
    const v13, 0x3ebd70a4    # 0.37f

    .line 338
    .line 339
    .line 340
    const/4 v14, 0x0

    .line 341
    const v15, 0x3f3851ec    # 0.72f

    .line 342
    .line 343
    .line 344
    const v16, -0x42b33333    # -0.05f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x3f547ae1    # 0.83f

    .line 351
    .line 352
    .line 353
    const v18, -0x411eb852    # -0.44f

    .line 354
    .line 355
    .line 356
    const v13, 0x3ea3d70a    # 0.32f

    .line 357
    .line 358
    .line 359
    const v14, -0x42333333    # -0.1f

    .line 360
    .line 361
    .line 362
    const v15, 0x3f19999a    # 0.6f

    .line 363
    .line 364
    .line 365
    const/high16 v16, -0x41800000    # -0.25f

    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x3f0ccccd    # 0.55f

    .line 371
    .line 372
    .line 373
    const v2, -0x40c7ae14    # -0.72f

    .line 374
    .line 375
    .line 376
    const v4, -0x4123d70a    # -0.43f

    .line 377
    .line 378
    .line 379
    const v6, 0x3ed70a3d    # 0.42f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, -0x40e3d70a    # -0.61f

    .line 386
    .line 387
    .line 388
    const v2, -0x4087ae14    # -0.97f

    .line 389
    .line 390
    .line 391
    const v4, 0x3e4ccccd    # 0.2f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x4270a3d7    # -0.07f

    .line 398
    .line 399
    .line 400
    const v18, -0x40f0a3d7    # -0.56f

    .line 401
    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, -0x41bd70a4    # -0.19f

    .line 405
    .line 406
    .line 407
    const v15, -0x435c28f6    # -0.02f

    .line 408
    .line 409
    .line 410
    const v16, -0x413d70a4    # -0.38f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, -0x41947ae1    # -0.23f

    .line 417
    .line 418
    .line 419
    const v18, -0x40fd70a4    # -0.51f

    .line 420
    .line 421
    .line 422
    const v13, -0x42b33333    # -0.05f

    .line 423
    .line 424
    .line 425
    const v14, -0x41c7ae14    # -0.18f

    .line 426
    .line 427
    .line 428
    const v15, -0x420a3d71    # -0.12f

    .line 429
    .line 430
    .line 431
    const v16, -0x414ccccd    # -0.35f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, -0x41333333    # -0.4f

    .line 438
    .line 439
    .line 440
    const v18, -0x4123d70a    # -0.43f

    .line 441
    .line 442
    .line 443
    const v13, -0x42333333    # -0.1f

    .line 444
    .line 445
    .line 446
    const v14, -0x41dc28f6    # -0.16f

    .line 447
    .line 448
    .line 449
    const v15, -0x418a3d71    # -0.24f

    .line 450
    .line 451
    .line 452
    const v16, -0x41666666    # -0.3f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, -0x40e3d70a    # -0.61f

    .line 459
    .line 460
    .line 461
    const v18, -0x416147ae    # -0.31f

    .line 462
    .line 463
    .line 464
    const v13, -0x41d1eb85    # -0.17f

    .line 465
    .line 466
    .line 467
    const v14, -0x41fae148    # -0.13f

    .line 468
    .line 469
    .line 470
    const v15, -0x41428f5c    # -0.37f

    .line 471
    .line 472
    .line 473
    const v16, -0x41947ae1    # -0.23f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v17, 0x3f051eb8    # 0.52f

    .line 480
    .line 481
    .line 482
    const v18, -0x41570a3d    # -0.33f

    .line 483
    .line 484
    .line 485
    const v13, 0x3e4ccccd    # 0.2f

    .line 486
    .line 487
    .line 488
    const v14, -0x4247ae14    # -0.09f

    .line 489
    .line 490
    .line 491
    const v15, 0x3ebd70a4    # 0.37f

    .line 492
    .line 493
    .line 494
    const v16, -0x41b33333    # -0.2f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, 0x3ebd70a4    # 0.37f

    .line 501
    .line 502
    .line 503
    const v18, -0x4128f5c3    # -0.42f

    .line 504
    .line 505
    .line 506
    const v13, 0x3e19999a    # 0.15f

    .line 507
    .line 508
    .line 509
    const v14, -0x41fae148    # -0.13f

    .line 510
    .line 511
    .line 512
    const v15, 0x3e8a3d71    # 0.27f

    .line 513
    .line 514
    .line 515
    const v16, -0x4175c28f    # -0.27f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, 0x3e6147ae    # 0.22f

    .line 522
    .line 523
    .line 524
    const v18, -0x41147ae1    # -0.46f

    .line 525
    .line 526
    .line 527
    const v13, 0x3dcccccd    # 0.1f

    .line 528
    .line 529
    .line 530
    const v14, -0x41e66666    # -0.15f

    .line 531
    .line 532
    .line 533
    const v15, 0x3e2e147b    # 0.17f

    .line 534
    .line 535
    .line 536
    const v16, -0x41666666    # -0.3f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, -0x415c28f6    # -0.32f

    .line 543
    .line 544
    .line 545
    const v2, -0x410a3d71    # -0.48f

    .line 546
    .line 547
    .line 548
    const v4, 0x3d8f5c29    # 0.07f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, -0x41c7ae14    # -0.18f

    .line 555
    .line 556
    .line 557
    const v18, -0x408a3d71    # -0.96f

    .line 558
    .line 559
    .line 560
    const/4 v13, 0x0

    .line 561
    const v14, -0x4147ae14    # -0.36f

    .line 562
    .line 563
    .line 564
    const v15, -0x428a3d71    # -0.06f

    .line 565
    .line 566
    .line 567
    const v16, -0x40d1eb85    # -0.68f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, -0x416b851f    # -0.29f

    .line 574
    .line 575
    .line 576
    const v2, -0x40cf5c29    # -0.69f

    .line 577
    .line 578
    .line 579
    const v4, -0x40fd70a4    # -0.51f

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12, v0, v4, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v17, -0x40bae148    # -0.77f

    .line 586
    .line 587
    .line 588
    const v18, -0x4123d70a    # -0.43f

    .line 589
    .line 590
    .line 591
    const v13, -0x41b33333    # -0.2f

    .line 592
    .line 593
    .line 594
    const v14, -0x41bd70a4    # -0.19f

    .line 595
    .line 596
    .line 597
    const v15, -0x410f5c29    # -0.47f

    .line 598
    .line 599
    .line 600
    const v16, -0x41570a3d    # -0.33f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v17, 0x41066666    # 8.4f

    .line 607
    .line 608
    .line 609
    const/high16 v18, 0x41000000    # 8.0f

    .line 610
    .line 611
    const v13, 0x4111c28f    # 9.11f

    .line 612
    .line 613
    .line 614
    const v14, 0x4100cccd    # 8.05f

    .line 615
    .line 616
    .line 617
    const v15, 0x410c51ec    # 8.77f

    .line 618
    .line 619
    .line 620
    const/high16 v16, 0x41000000    # 8.0f

    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, -0x40800000    # -1.0f

    .line 626
    .line 627
    const v18, 0x3e23d70a    # 0.16f

    .line 628
    .line 629
    .line 630
    const v13, -0x4147ae14    # -0.36f

    .line 631
    .line 632
    .line 633
    const/4 v14, 0x0

    .line 634
    const v15, -0x40cf5c29    # -0.69f

    .line 635
    .line 636
    .line 637
    const v16, 0x3d4ccccd    # 0.05f

    .line 638
    .line 639
    .line 640
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const v17, -0x40b5c28f    # -0.79f

    .line 644
    .line 645
    .line 646
    const v18, 0x3ee66666    # 0.45f

    .line 647
    .line 648
    .line 649
    const v13, -0x41666666    # -0.3f

    .line 650
    .line 651
    .line 652
    const v14, 0x3de147ae    # 0.11f

    .line 653
    .line 654
    .line 655
    const v15, -0x40ee147b    # -0.57f

    .line 656
    .line 657
    .line 658
    const v16, 0x3e851eb8    # 0.26f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v17, -0x40fd70a4    # -0.51f

    .line 665
    .line 666
    .line 667
    const v18, 0x3f2b851f    # 0.67f

    .line 668
    .line 669
    .line 670
    const v13, -0x41a8f5c3    # -0.21f

    .line 671
    .line 672
    .line 673
    const v14, 0x3e428f5c    # 0.19f

    .line 674
    .line 675
    .line 676
    const v15, -0x413d70a4    # -0.38f

    .line 677
    .line 678
    .line 679
    const v16, 0x3ed1eb85    # 0.41f

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v17, -0x41c7ae14    # -0.18f

    .line 686
    .line 687
    .line 688
    const v18, 0x3f59999a    # 0.85f

    .line 689
    .line 690
    .line 691
    const v13, -0x420a3d71    # -0.12f

    .line 692
    .line 693
    .line 694
    const v14, 0x3e851eb8    # 0.26f

    .line 695
    .line 696
    .line 697
    const v15, -0x41c7ae14    # -0.18f

    .line 698
    .line 699
    .line 700
    const v16, 0x3f0a3d71    # 0.54f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x3fa66666    # 1.3f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const v17, 0x3db851ec    # 0.09f

    .line 713
    .line 714
    .line 715
    const v18, -0x4119999a    # -0.45f

    .line 716
    .line 717
    .line 718
    const/4 v13, 0x0

    .line 719
    const v14, -0x41d1eb85    # -0.17f

    .line 720
    .line 721
    .line 722
    const v15, 0x3cf5c28f    # 0.03f

    .line 723
    .line 724
    .line 725
    const v16, -0x415c28f6    # -0.32f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v0, 0x3e800000    # 0.25f

    .line 732
    .line 733
    const v2, -0x4151eb85    # -0.34f

    .line 734
    .line 735
    .line 736
    const/high16 v4, -0x41800000    # -0.25f

    .line 737
    .line 738
    const v6, 0x3e0f5c29    # 0.14f

    .line 739
    .line 740
    .line 741
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v0, 0x3ec28f5c    # 0.38f

    .line 745
    .line 746
    .line 747
    const v2, -0x419eb852    # -0.22f

    .line 748
    .line 749
    .line 750
    const v4, 0x3e6b851f    # 0.23f

    .line 751
    .line 752
    .line 753
    const v6, -0x41d1eb85    # -0.17f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v0, 0x3e99999a    # 0.3f

    .line 760
    .line 761
    .line 762
    const v2, 0x3ef5c28f    # 0.48f

    .line 763
    .line 764
    .line 765
    const v4, -0x425c28f6    # -0.08f

    .line 766
    .line 767
    .line 768
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v17, 0x3f63d70a    # 0.89f

    .line 772
    .line 773
    .line 774
    const v18, 0x3e9eb852    # 0.31f

    .line 775
    .line 776
    .line 777
    const v13, 0x3ecccccd    # 0.4f

    .line 778
    .line 779
    .line 780
    const/4 v14, 0x0

    .line 781
    const v15, 0x3f333333    # 0.7f

    .line 782
    .line 783
    .line 784
    const v16, 0x3dcccccd    # 0.1f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const v17, 0x3e947ae1    # 0.29f

    .line 791
    .line 792
    .line 793
    const v18, 0x3f5c28f6    # 0.86f

    .line 794
    .line 795
    .line 796
    const v13, 0x3e428f5c    # 0.19f

    .line 797
    .line 798
    .line 799
    const v14, 0x3e4ccccd    # 0.2f

    .line 800
    .line 801
    .line 802
    const v15, 0x3e947ae1    # 0.29f

    .line 803
    .line 804
    .line 805
    const v16, 0x3efae148    # 0.49f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v17, -0x425c28f6    # -0.08f

    .line 812
    .line 813
    .line 814
    const v18, 0x3efae148    # 0.49f

    .line 815
    .line 816
    .line 817
    const/4 v13, 0x0

    .line 818
    const v14, 0x3e3851ec    # 0.18f

    .line 819
    .line 820
    .line 821
    const v15, -0x430a3d71    # -0.03f

    .line 822
    .line 823
    .line 824
    const v16, 0x3eae147b    # 0.34f

    .line 825
    .line 826
    .line 827
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v0, 0x3e8a3d71    # 0.27f

    .line 831
    .line 832
    .line 833
    const v2, 0x3ebd70a4    # 0.37f

    .line 834
    .line 835
    .line 836
    const/high16 v4, -0x41800000    # -0.25f

    .line 837
    .line 838
    const v6, -0x41f0a3d7    # -0.14f

    .line 839
    .line 840
    .line 841
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const v17, -0x412e147b    # -0.41f

    .line 845
    .line 846
    .line 847
    const v18, 0x3e75c28f    # 0.24f

    .line 848
    .line 849
    .line 850
    const v13, -0x421eb852    # -0.11f

    .line 851
    .line 852
    .line 853
    const v14, 0x3dcccccd    # 0.1f

    .line 854
    .line 855
    .line 856
    const/high16 v15, -0x41800000    # -0.25f

    .line 857
    .line 858
    const v16, 0x3e3851ec    # 0.18f

    .line 859
    .line 860
    .line 861
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 862
    .line 863
    .line 864
    const v17, -0x40eb851f    # -0.58f

    .line 865
    .line 866
    .line 867
    const v18, 0x3db851ec    # 0.09f

    .line 868
    .line 869
    .line 870
    const v13, -0x41dc28f6    # -0.16f

    .line 871
    .line 872
    .line 873
    const v14, 0x3d75c28f    # 0.06f

    .line 874
    .line 875
    .line 876
    const v15, -0x4147ae14    # -0.36f

    .line 877
    .line 878
    .line 879
    const v16, 0x3db851ec    # 0.09f

    .line 880
    .line 881
    .line 882
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const v0, -0x40bae148    # -0.77f

    .line 886
    .line 887
    .line 888
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v0, 0x3f83d70a    # 1.03f

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    .line 897
    const v0, 0x3f451eb8    # 0.77f

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 901
    .line 902
    .line 903
    const v17, 0x3f19999a    # 0.6f

    .line 904
    .line 905
    .line 906
    const v18, 0x3d8f5c29    # 0.07f

    .line 907
    .line 908
    .line 909
    const v13, 0x3e6147ae    # 0.22f

    .line 910
    .line 911
    .line 912
    const/4 v14, 0x0

    .line 913
    const v15, 0x3ed70a3d    # 0.42f

    .line 914
    .line 915
    .line 916
    const v16, 0x3ca3d70a    # 0.02f

    .line 917
    .line 918
    .line 919
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 920
    .line 921
    .line 922
    const v0, 0x3e051eb8    # 0.13f

    .line 923
    .line 924
    .line 925
    const v2, 0x3ee66666    # 0.45f

    .line 926
    .line 927
    .line 928
    const v4, 0x3e6b851f    # 0.23f

    .line 929
    .line 930
    .line 931
    const v6, 0x3ea8f5c3    # 0.33f

    .line 932
    .line 933
    .line 934
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    const v17, 0x3e947ae1    # 0.29f

    .line 938
    .line 939
    .line 940
    const v18, 0x3ecccccd    # 0.4f

    .line 941
    .line 942
    .line 943
    const v13, 0x3df5c28f    # 0.12f

    .line 944
    .line 945
    .line 946
    const v14, 0x3de147ae    # 0.11f

    .line 947
    .line 948
    .line 949
    const v15, 0x3e6147ae    # 0.22f

    .line 950
    .line 951
    .line 952
    const v16, 0x3e75c28f    # 0.24f

    .line 953
    .line 954
    .line 955
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    const v0, 0x3eb33333    # 0.35f

    .line 959
    .line 960
    .line 961
    const v2, 0x3f11eb85    # 0.57f

    .line 962
    .line 963
    .line 964
    const v4, 0x3dcccccd    # 0.1f

    .line 965
    .line 966
    .line 967
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const v17, -0x414ccccd    # -0.35f

    .line 971
    .line 972
    .line 973
    const v18, 0x3f6e147b    # 0.93f

    .line 974
    .line 975
    .line 976
    const/4 v13, 0x0

    .line 977
    const v14, 0x3ed1eb85    # 0.41f

    .line 978
    .line 979
    .line 980
    const v15, -0x420a3d71    # -0.12f

    .line 981
    .line 982
    .line 983
    const v16, 0x3f3851ec    # 0.72f

    .line 984
    .line 985
    .line 986
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    const v17, -0x408ccccd    # -0.95f

    .line 990
    .line 991
    .line 992
    const v18, 0x3ea8f5c3    # 0.33f

    .line 993
    .line 994
    .line 995
    const v13, -0x41947ae1    # -0.23f

    .line 996
    .line 997
    .line 998
    const v14, 0x3e6b851f    # 0.23f

    .line 999
    .line 1000
    .line 1001
    const v15, -0x40f33333    # -0.55f

    .line 1002
    .line 1003
    .line 1004
    const v16, 0x3ea8f5c3    # 0.33f

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const v0, 0x4187c28f    # 16.97f

    .line 1014
    .line 1015
    .line 1016
    const v2, 0x4110a3d7    # 9.04f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v17, -0x406e147b    # -1.14f

    .line 1023
    .line 1024
    .line 1025
    const v18, -0x40bae148    # -0.77f

    .line 1026
    .line 1027
    .line 1028
    const v13, -0x415c28f6    # -0.32f

    .line 1029
    .line 1030
    .line 1031
    const v14, -0x41570a3d    # -0.33f

    .line 1032
    .line 1033
    .line 1034
    const v15, -0x40cccccd    # -0.7f

    .line 1035
    .line 1036
    .line 1037
    const v16, -0x40e8f5c3    # -0.59f

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const v17, -0x4043d70a    # -1.47f

    .line 1044
    .line 1045
    .line 1046
    const v18, -0x4175c28f    # -0.27f

    .line 1047
    .line 1048
    .line 1049
    const v13, -0x411eb852    # -0.44f

    .line 1050
    .line 1051
    .line 1052
    const v14, -0x41c7ae14    # -0.18f

    .line 1053
    .line 1054
    .line 1055
    const v15, -0x4091eb85    # -0.93f

    .line 1056
    .line 1057
    .line 1058
    const v16, -0x4175c28f    # -0.27f

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const/high16 v0, 0x41400000    # 12.0f

    .line 1065
    .line 1066
    const/high16 v2, 0x41000000    # 8.0f

    .line 1067
    .line 1068
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1069
    .line 1070
    .line 1071
    const/high16 v0, 0x41000000    # 8.0f

    .line 1072
    .line 1073
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const v0, 0x40133333    # 2.3f

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1080
    .line 1081
    .line 1082
    const v17, 0x3fc147ae    # 1.51f

    .line 1083
    .line 1084
    .line 1085
    const v13, 0x3f0ccccd    # 0.55f

    .line 1086
    .line 1087
    .line 1088
    const/4 v14, 0x0

    .line 1089
    const v15, 0x3f87ae14    # 1.06f

    .line 1090
    .line 1091
    .line 1092
    const v16, -0x4247ae14    # -0.09f

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1096
    .line 1097
    .line 1098
    const v0, 0x3f947ae1    # 1.16f

    .line 1099
    .line 1100
    .line 1101
    const v2, -0x40bd70a4    # -0.76f

    .line 1102
    .line 1103
    .line 1104
    const v4, -0x4123d70a    # -0.43f

    .line 1105
    .line 1106
    .line 1107
    const v6, 0x3f570a3d    # 0.84f

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1111
    .line 1112
    .line 1113
    const v17, 0x3f3d70a4    # 0.74f

    .line 1114
    .line 1115
    .line 1116
    const v18, -0x4067ae14    # -1.19f

    .line 1117
    .line 1118
    .line 1119
    const v13, 0x3ea3d70a    # 0.32f

    .line 1120
    .line 1121
    .line 1122
    const v14, -0x41570a3d    # -0.33f

    .line 1123
    .line 1124
    .line 1125
    const v15, 0x3f11eb85    # 0.57f

    .line 1126
    .line 1127
    .line 1128
    const v16, -0x40c51eb8    # -0.73f

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1132
    .line 1133
    .line 1134
    const v17, 0x3e851eb8    # 0.26f

    .line 1135
    .line 1136
    .line 1137
    const v18, -0x40370a3d    # -1.57f

    .line 1138
    .line 1139
    .line 1140
    const v13, 0x3e2e147b    # 0.17f

    .line 1141
    .line 1142
    .line 1143
    const v14, -0x410f5c29    # -0.47f

    .line 1144
    .line 1145
    .line 1146
    const v15, 0x3e851eb8    # 0.26f

    .line 1147
    .line 1148
    .line 1149
    const v16, -0x40828f5c    # -0.99f

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1153
    .line 1154
    .line 1155
    const v0, -0x41333333    # -0.4f

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const v17, -0x417ae148    # -0.26f

    .line 1162
    .line 1163
    .line 1164
    const/4 v13, 0x0

    .line 1165
    const v14, -0x40eb851f    # -0.58f

    .line 1166
    .line 1167
    .line 1168
    const v15, -0x4247ae14    # -0.09f

    .line 1169
    .line 1170
    .line 1171
    const v16, -0x40733333    # -1.1f

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1175
    .line 1176
    .line 1177
    const v0, -0x40c28f5c    # -0.74f

    .line 1178
    .line 1179
    .line 1180
    const v2, -0x40666666    # -1.2f

    .line 1181
    .line 1182
    .line 1183
    const v4, -0x4128f5c3    # -0.42f

    .line 1184
    .line 1185
    .line 1186
    const v6, -0x40a147ae    # -0.87f

    .line 1187
    .line 1188
    .line 1189
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1193
    .line 1194
    .line 1195
    const v0, 0x4184a3d7    # 16.58f

    .line 1196
    .line 1197
    .line 1198
    const v2, 0x41433333    # 12.2f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    const v17, -0x41f0a3d7    # -0.14f

    .line 1205
    .line 1206
    .line 1207
    const v18, 0x3f90a3d7    # 1.13f

    .line 1208
    .line 1209
    .line 1210
    const v14, 0x3ed70a3d    # 0.42f

    .line 1211
    .line 1212
    .line 1213
    const v15, -0x42b33333    # -0.05f

    .line 1214
    .line 1215
    .line 1216
    const v16, 0x3f4a3d71    # 0.79f

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1220
    .line 1221
    .line 1222
    const v17, -0x4123d70a    # -0.43f

    .line 1223
    .line 1224
    .line 1225
    const v18, 0x3f59999a    # 0.85f

    .line 1226
    .line 1227
    .line 1228
    const v13, -0x42333333    # -0.1f

    .line 1229
    .line 1230
    .line 1231
    const v14, 0x3ea8f5c3    # 0.33f

    .line 1232
    .line 1233
    .line 1234
    const v15, -0x418a3d71    # -0.24f

    .line 1235
    .line 1236
    .line 1237
    const v16, 0x3f1eb852    # 0.62f

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1241
    .line 1242
    .line 1243
    const v17, -0x40ca3d71    # -0.71f

    .line 1244
    .line 1245
    .line 1246
    const v18, 0x3f07ae14    # 0.53f

    .line 1247
    .line 1248
    .line 1249
    const v13, -0x41bd70a4    # -0.19f

    .line 1250
    .line 1251
    .line 1252
    const v14, 0x3e6b851f    # 0.23f

    .line 1253
    .line 1254
    .line 1255
    const v15, -0x4123d70a    # -0.43f

    .line 1256
    .line 1257
    .line 1258
    const v16, 0x3ed1eb85    # 0.41f

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1262
    .line 1263
    .line 1264
    const v17, -0x40828f5c    # -0.99f

    .line 1265
    .line 1266
    .line 1267
    const v18, 0x3e3851ec    # 0.18f

    .line 1268
    .line 1269
    .line 1270
    const v13, -0x416b851f    # -0.29f

    .line 1271
    .line 1272
    .line 1273
    const v14, 0x3df5c28f    # 0.12f

    .line 1274
    .line 1275
    .line 1276
    const v15, -0x40e147ae    # -0.62f

    .line 1277
    .line 1278
    .line 1279
    const v16, 0x3e3851ec    # 0.18f

    .line 1280
    .line 1281
    .line 1282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1283
    .line 1284
    .line 1285
    const v0, -0x40970a3d    # -0.91f

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1289
    .line 1290
    .line 1291
    const v0, 0x41566666    # 13.4f

    .line 1292
    .line 1293
    .line 1294
    const v2, 0x4111eb85    # 9.12f

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1298
    .line 1299
    .line 1300
    const v0, 0x3f7851ec    # 0.97f

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1304
    .line 1305
    .line 1306
    const v17, 0x3fd1eb85    # 1.64f

    .line 1307
    .line 1308
    .line 1309
    const v18, 0x3f30a3d7    # 0.69f

    .line 1310
    .line 1311
    .line 1312
    const v13, 0x3f3851ec    # 0.72f

    .line 1313
    .line 1314
    .line 1315
    const/4 v14, 0x0

    .line 1316
    const v15, 0x3fa28f5c    # 1.27f

    .line 1317
    .line 1318
    .line 1319
    const v16, 0x3e6b851f    # 0.23f

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1323
    .line 1324
    .line 1325
    const v17, 0x3f11eb85    # 0.57f

    .line 1326
    .line 1327
    .line 1328
    const v18, 0x3ffeb852    # 1.99f

    .line 1329
    .line 1330
    .line 1331
    const v13, 0x3ec28f5c    # 0.38f

    .line 1332
    .line 1333
    .line 1334
    const v14, 0x3eeb851f    # 0.46f

    .line 1335
    .line 1336
    .line 1337
    const v15, 0x3f11eb85    # 0.57f

    .line 1338
    .line 1339
    .line 1340
    const v16, 0x3f8f5c29    # 1.12f

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1344
    .line 1345
    .line 1346
    const v0, 0x3ecccccd    # 0.4f

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1350
    .line 1351
    .line 1352
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1353
    .line 1354
    .line 1355
    const v0, 0x414028f6    # 12.01f

    .line 1356
    .line 1357
    .line 1358
    const/4 v2, 0x0

    .line 1359
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1360
    .line 1361
    .line 1362
    const v0, -0x40d70a3d    # -0.66f

    .line 1363
    .line 1364
    .line 1365
    const v2, 0x3cf5c28f    # 0.03f

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1369
    .line 1370
    .line 1371
    const v0, 0x4073d70a    # 3.81f

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1375
    .line 1376
    .line 1377
    const v0, 0x3faa3d71    # 1.33f

    .line 1378
    .line 1379
    .line 1380
    const v2, -0x4055c28f    # -1.33f

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1384
    .line 1385
    .line 1386
    const v17, 0x40beb852    # 5.96f

    .line 1387
    .line 1388
    .line 1389
    const v18, 0x4107ae14    # 8.48f

    .line 1390
    .line 1391
    .line 1392
    const v13, 0x405147ae    # 3.27f

    .line 1393
    .line 1394
    .line 1395
    const v14, 0x3fc66666    # 1.55f

    .line 1396
    .line 1397
    .line 1398
    const v15, 0x40b3851f    # 5.61f

    .line 1399
    .line 1400
    .line 1401
    const v16, 0x40970a3d    # 4.72f

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1405
    .line 1406
    .line 1407
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 1408
    .line 1409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1410
    .line 1411
    .line 1412
    const v17, 0x414028f6    # 12.01f

    .line 1413
    .line 1414
    .line 1415
    const/16 v18, 0x0

    .line 1416
    .line 1417
    const v13, 0x41bb999a    # 23.45f

    .line 1418
    .line 1419
    .line 1420
    const v14, 0x409ae148    # 4.84f

    .line 1421
    .line 1422
    .line 1423
    const v15, 0x41926666    # 18.3f

    .line 1424
    .line 1425
    .line 1426
    const/16 v16, 0x0

    .line 1427
    .line 1428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v2

    .line 1438
    const/16 v16, 0x3800

    .line 1439
    .line 1440
    const/16 v17, 0x0

    .line 1441
    .line 1442
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1443
    .line 1444
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1445
    .line 1446
    const/4 v7, 0x0

    .line 1447
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1448
    .line 1449
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1450
    .line 1451
    const/4 v13, 0x0

    .line 1452
    const/4 v14, 0x0

    .line 1453
    const/4 v15, 0x0

    .line 1454
    const-string v4, ""

    .line 1455
    .line 1456
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0

    .line 1464
    sput-object v0, Landroidx/compose/material/icons/sharp/_3dRotationKt;->__3dRotation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1465
    .line 1466
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1467
    .line 1468
    .line 1469
    return-object v0
.end method

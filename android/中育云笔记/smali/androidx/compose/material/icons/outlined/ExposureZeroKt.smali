.class public final Landroidx/compose/material/icons/outlined/ExposureZeroKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _exposureZero:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExposureZero(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ExposureZeroKt;->_exposureZero:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ExposureZero"

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
    const v0, 0x41811eb8    # 16.14f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41480000    # 12.5f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x41666666    # -0.3f

    .line 79
    .line 80
    .line 81
    const v18, 0x40233333    # 2.55f

    .line 82
    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const/high16 v14, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v15, -0x42333333    # -0.1f

    .line 88
    .line 89
    .line 90
    const v16, 0x3feccccd    # 1.85f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v0, -0x40ab851f    # -0.83f

    .line 97
    .line 98
    .line 99
    const v2, 0x3fd9999a    # 1.7f

    .line 100
    .line 101
    .line 102
    const v4, -0x410a3d71    # -0.48f

    .line 103
    .line 104
    .line 105
    const v6, 0x3fa28f5c    # 1.27f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, -0x4059999a    # -1.3f

    .line 112
    .line 113
    .line 114
    const v18, 0x3f733333    # 0.95f

    .line 115
    .line 116
    .line 117
    const v13, -0x4147ae14    # -0.36f

    .line 118
    .line 119
    .line 120
    const v14, 0x3ee147ae    # 0.44f

    .line 121
    .line 122
    .line 123
    const v15, -0x40b5c28f    # -0.79f

    .line 124
    .line 125
    .line 126
    const/high16 v16, 0x3f400000    # 0.75f

    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, -0x40770a3d    # -1.07f

    .line 132
    .line 133
    .line 134
    const v2, -0x40266666    # -1.7f

    .line 135
    .line 136
    .line 137
    const v4, 0x3e99999a    # 0.3f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, -0x4027ae14    # -1.69f

    .line 144
    .line 145
    .line 146
    const v18, -0x41666666    # -0.3f

    .line 147
    .line 148
    .line 149
    const v13, -0x40e147ae    # -0.62f

    .line 150
    .line 151
    .line 152
    const/4 v14, 0x0

    .line 153
    const v15, -0x4068f5c3    # -1.18f

    .line 154
    .line 155
    .line 156
    const v16, -0x42333333    # -0.1f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, -0x405851ec    # -1.31f

    .line 163
    .line 164
    .line 165
    const v18, -0x408ccccd    # -0.95f

    .line 166
    .line 167
    .line 168
    const v13, -0x40fd70a4    # -0.51f

    .line 169
    .line 170
    .line 171
    const v14, -0x41b33333    # -0.2f

    .line 172
    .line 173
    .line 174
    const v15, -0x408ccccd    # -0.95f

    .line 175
    .line 176
    .line 177
    const v16, -0x40fd70a4    # -0.51f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v0, -0x407eb852    # -1.01f

    .line 184
    .line 185
    .line 186
    const v2, -0x40a66666    # -0.85f

    .line 187
    .line 188
    .line 189
    const v4, -0x40266666    # -1.7f

    .line 190
    .line 191
    .line 192
    const v6, -0x40d9999a    # -0.65f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x41666666    # -0.3f

    .line 199
    .line 200
    .line 201
    const v18, -0x3fdccccd    # -2.55f

    .line 202
    .line 203
    .line 204
    const v13, -0x41b33333    # -0.2f

    .line 205
    .line 206
    .line 207
    const v14, -0x40cccccd    # -0.7f

    .line 208
    .line 209
    .line 210
    const v15, -0x41666666    # -0.3f

    .line 211
    .line 212
    .line 213
    const v16, -0x4039999a    # -1.55f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v0, -0x3ffd70a4    # -2.04f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v17, 0x3e99999a    # 0.3f

    .line 226
    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const/high16 v14, -0x40800000    # -1.0f

    .line 230
    .line 231
    const v15, 0x3dcccccd    # 0.1f

    .line 232
    .line 233
    .line 234
    const v16, -0x40133333    # -1.85f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x3f570a3d    # 0.84f

    .line 241
    .line 242
    .line 243
    const v18, -0x4027ae14    # -1.69f

    .line 244
    .line 245
    .line 246
    const v13, 0x3e4ccccd    # 0.2f

    .line 247
    .line 248
    .line 249
    const v14, -0x40cccccd    # -0.7f

    .line 250
    .line 251
    .line 252
    const v15, 0x3ef5c28f    # 0.48f

    .line 253
    .line 254
    .line 255
    const v16, -0x405eb852    # -1.26f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, 0x3fa7ae14    # 1.31f

    .line 262
    .line 263
    .line 264
    const v18, -0x4091eb85    # -0.93f

    .line 265
    .line 266
    .line 267
    const v13, 0x3eb851ec    # 0.36f

    .line 268
    .line 269
    .line 270
    const v14, -0x4123d70a    # -0.43f

    .line 271
    .line 272
    .line 273
    const v15, 0x3f4ccccd    # 0.8f

    .line 274
    .line 275
    .line 276
    const v16, -0x40c28f5c    # -0.74f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v17, 0x41400000    # 12.0f

    .line 283
    .line 284
    const/high16 v18, 0x40a00000    # 5.0f

    .line 285
    .line 286
    const v13, 0x412cf5c3    # 10.81f

    .line 287
    .line 288
    .line 289
    const v14, 0x40a33333    # 5.1f

    .line 290
    .line 291
    .line 292
    const v15, 0x4136147b    # 11.38f

    .line 293
    .line 294
    .line 295
    const/high16 v16, 0x40a00000    # 5.0f

    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, 0x3fd9999a    # 1.7f

    .line 301
    .line 302
    .line 303
    const v18, 0x3e947ae1    # 0.29f

    .line 304
    .line 305
    .line 306
    const v13, 0x3f2147ae    # 0.63f

    .line 307
    .line 308
    .line 309
    const/4 v14, 0x0

    .line 310
    const v15, 0x3f9851ec    # 1.19f

    .line 311
    .line 312
    .line 313
    const v16, 0x3dcccccd    # 0.1f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x3fa7ae14    # 1.31f

    .line 320
    .line 321
    .line 322
    const v18, 0x3f6e147b    # 0.93f

    .line 323
    .line 324
    .line 325
    const v13, 0x3f028f5c    # 0.51f

    .line 326
    .line 327
    .line 328
    const v14, 0x3e428f5c    # 0.19f

    .line 329
    .line 330
    .line 331
    const v15, 0x3f733333    # 0.95f

    .line 332
    .line 333
    .line 334
    const/high16 v16, 0x3f000000    # 0.5f

    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, 0x3f570a3d    # 0.84f

    .line 340
    .line 341
    .line 342
    const v18, 0x3fd851ec    # 1.69f

    .line 343
    .line 344
    .line 345
    const v13, 0x3eb851ec    # 0.36f

    .line 346
    .line 347
    .line 348
    const v14, 0x3edc28f6    # 0.43f

    .line 349
    .line 350
    .line 351
    const v15, 0x3f23d70a    # 0.64f

    .line 352
    .line 353
    .line 354
    const v16, 0x3f7d70a4    # 0.99f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x3e99999a    # 0.3f

    .line 361
    .line 362
    .line 363
    const v18, 0x40233333    # 2.55f

    .line 364
    .line 365
    .line 366
    const v13, 0x3e4ccccd    # 0.2f

    .line 367
    .line 368
    .line 369
    const v14, 0x3f333333    # 0.7f

    .line 370
    .line 371
    .line 372
    const v15, 0x3e99999a    # 0.3f

    .line 373
    .line 374
    .line 375
    const v16, 0x3fc51eb8    # 1.54f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x40028f5c    # 2.04f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, -0x43dc28f6    # -0.01f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x41607ae1    # 14.03f

    .line 397
    .line 398
    .line 399
    const v2, 0x41223d71    # 10.14f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, -0x41fae148    # -0.13f

    .line 406
    .line 407
    .line 408
    const v18, -0x4030a3d7    # -1.62f

    .line 409
    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const v14, -0x40dc28f6    # -0.64f

    .line 413
    .line 414
    .line 415
    const v15, -0x42b33333    # -0.05f

    .line 416
    .line 417
    .line 418
    const v16, -0x4068f5c3    # -1.18f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, -0x41333333    # -0.4f

    .line 425
    .line 426
    .line 427
    const v18, -0x407851ec    # -1.06f

    .line 428
    .line 429
    .line 430
    const v13, -0x4247ae14    # -0.09f

    .line 431
    .line 432
    .line 433
    const v14, -0x411eb852    # -0.44f

    .line 434
    .line 435
    .line 436
    const v15, -0x419eb852    # -0.22f

    .line 437
    .line 438
    .line 439
    const v16, -0x40b5c28f    # -0.79f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, -0x40dc28f6    # -0.64f

    .line 446
    .line 447
    .line 448
    const v18, -0x40eb851f    # -0.58f

    .line 449
    .line 450
    .line 451
    const v13, -0x41d1eb85    # -0.17f

    .line 452
    .line 453
    .line 454
    const v14, -0x4175c28f    # -0.27f

    .line 455
    .line 456
    .line 457
    const v15, -0x413851ec    # -0.39f

    .line 458
    .line 459
    .line 460
    const v16, -0x41147ae1    # -0.46f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, -0x40a3d70a    # -0.86f

    .line 467
    .line 468
    .line 469
    const v18, -0x41bd70a4    # -0.19f

    .line 470
    .line 471
    .line 472
    const/high16 v13, -0x41800000    # -0.25f

    .line 473
    .line 474
    const v14, -0x41fae148    # -0.13f

    .line 475
    .line 476
    .line 477
    const v15, -0x40f5c28f    # -0.54f

    .line 478
    .line 479
    .line 480
    const v16, -0x41bd70a4    # -0.19f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, -0x40a3d70a    # -0.86f

    .line 487
    .line 488
    .line 489
    const v2, 0x3e3851ec    # 0.18f

    .line 490
    .line 491
    .line 492
    const v4, -0x40e3d70a    # -0.61f

    .line 493
    .line 494
    .line 495
    const v6, 0x3d75c28f    # 0.06f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v0, 0x3e9eb852    # 0.31f

    .line 502
    .line 503
    .line 504
    const v2, 0x3f147ae1    # 0.58f

    .line 505
    .line 506
    .line 507
    const v4, -0x40dc28f6    # -0.64f

    .line 508
    .line 509
    .line 510
    const v6, -0x410f5c29    # -0.47f

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v0, -0x41333333    # -0.4f

    .line 517
    .line 518
    .line 519
    const v2, 0x3f87ae14    # 1.06f

    .line 520
    .line 521
    .line 522
    const v4, 0x3f1eb852    # 0.62f

    .line 523
    .line 524
    .line 525
    const v6, -0x416147ae    # -0.31f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x3f7ae148    # 0.98f

    .line 532
    .line 533
    .line 534
    const v2, 0x3fcf5c29    # 1.62f

    .line 535
    .line 536
    .line 537
    const v4, -0x41fae148    # -0.13f

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x402ae148    # 2.67f

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v17, 0x3e0f5c29    # 0.14f

    .line 550
    .line 551
    .line 552
    const v18, 0x3fcf5c29    # 1.62f

    .line 553
    .line 554
    .line 555
    const/4 v13, 0x0

    .line 556
    const v14, 0x3f23d70a    # 0.64f

    .line 557
    .line 558
    .line 559
    const v15, 0x3d4ccccd    # 0.05f

    .line 560
    .line 561
    .line 562
    const v16, 0x3f970a3d    # 1.18f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, 0x3ecccccd    # 0.4f

    .line 569
    .line 570
    .line 571
    const v18, 0x3f8b851f    # 1.09f

    .line 572
    .line 573
    .line 574
    const v13, 0x3db851ec    # 0.09f

    .line 575
    .line 576
    .line 577
    const v14, 0x3ee66666    # 0.45f

    .line 578
    .line 579
    .line 580
    const v15, 0x3e6b851f    # 0.23f

    .line 581
    .line 582
    .line 583
    const v16, 0x3f4f5c29    # 0.81f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x3f23d70a    # 0.64f

    .line 590
    .line 591
    .line 592
    const v2, 0x3f1c28f6    # 0.61f

    .line 593
    .line 594
    .line 595
    const v4, 0x3ec7ae14    # 0.39f

    .line 596
    .line 597
    .line 598
    const v6, 0x3ef5c28f    # 0.48f

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, 0x3f0a3d71    # 0.54f

    .line 605
    .line 606
    .line 607
    const v2, 0x3f5eb852    # 0.87f

    .line 608
    .line 609
    .line 610
    const v4, 0x3e428f5c    # 0.19f

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v0, -0x428a3d71    # -0.06f

    .line 617
    .line 618
    .line 619
    const v2, -0x41bd70a4    # -0.19f

    .line 620
    .line 621
    .line 622
    const v4, 0x3f5eb852    # 0.87f

    .line 623
    .line 624
    .line 625
    const v6, 0x3f1eb852    # 0.62f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, -0x41570a3d    # -0.33f

    .line 632
    .line 633
    .line 634
    const v2, 0x3f2147ae    # 0.63f

    .line 635
    .line 636
    .line 637
    const v4, -0x40e3d70a    # -0.61f

    .line 638
    .line 639
    .line 640
    const v6, 0x3eeb851f    # 0.46f

    .line 641
    .line 642
    .line 643
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, -0x40747ae1    # -1.09f

    .line 647
    .line 648
    .line 649
    const v2, 0x3ec7ae14    # 0.39f

    .line 650
    .line 651
    .line 652
    const v4, -0x40dc28f6    # -0.64f

    .line 653
    .line 654
    .line 655
    const v6, 0x3e99999a    # 0.3f

    .line 656
    .line 657
    .line 658
    invoke-virtual {v12, v6, v4, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, -0x40828f5c    # -0.99f

    .line 662
    .line 663
    .line 664
    const v2, -0x4030a3d7    # -1.62f

    .line 665
    .line 666
    .line 667
    const v4, 0x3e051eb8    # 0.13f

    .line 668
    .line 669
    .line 670
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v0, -0x3fd5c28f    # -2.66f

    .line 674
    .line 675
    .line 676
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v0, -0x43dc28f6    # -0.01f

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    const/16 v16, 0x3800

    .line 693
    .line 694
    const/16 v17, 0x0

    .line 695
    .line 696
    const/high16 v6, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const/high16 v8, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/4 v7, 0x0

    .line 701
    const/high16 v9, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/high16 v12, 0x3f800000    # 1.0f

    .line 704
    .line 705
    const/4 v13, 0x0

    .line 706
    const/4 v14, 0x0

    .line 707
    const/4 v15, 0x0

    .line 708
    const-string v4, ""

    .line 709
    .line 710
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    sput-object v0, Landroidx/compose/material/icons/outlined/ExposureZeroKt;->_exposureZero:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 719
    .line 720
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/StrikethroughSKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStrikethroughS(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/StrikethroughSKt;->_strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.StrikethroughS"

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
    const v0, 0x416970a4    # 14.59f

    .line 71
    .line 72
    .line 73
    const v2, 0x40f0a3d7    # 7.52f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x41e66666    # -0.15f

    .line 80
    .line 81
    .line 82
    const v18, -0x40a66666    # -0.85f

    .line 83
    .line 84
    .line 85
    const/4 v13, 0x0

    .line 86
    const v14, -0x416147ae    # -0.31f

    .line 87
    .line 88
    .line 89
    const v15, -0x42b33333    # -0.05f

    .line 90
    .line 91
    .line 92
    const v16, -0x40e8f5c3    # -0.59f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, -0x411eb852    # -0.44f

    .line 99
    .line 100
    .line 101
    const v18, -0x40d1eb85    # -0.68f

    .line 102
    .line 103
    .line 104
    const v13, -0x4247ae14    # -0.09f

    .line 105
    .line 106
    .line 107
    const v14, -0x4175c28f    # -0.27f

    .line 108
    .line 109
    .line 110
    const v15, -0x418a3d71    # -0.24f

    .line 111
    .line 112
    .line 113
    const v16, -0x41051eb8    # -0.49f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v17, -0x40c00000    # -0.75f

    .line 120
    .line 121
    const v18, -0x411eb852    # -0.44f

    .line 122
    .line 123
    .line 124
    const v13, -0x41b33333    # -0.2f

    .line 125
    .line 126
    .line 127
    const v14, -0x41bd70a4    # -0.19f

    .line 128
    .line 129
    .line 130
    const v15, -0x4119999a    # -0.45f

    .line 131
    .line 132
    .line 133
    const v16, -0x41570a3d    # -0.33f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, -0x407851ec    # -1.06f

    .line 140
    .line 141
    .line 142
    const v18, -0x41dc28f6    # -0.16f

    .line 143
    .line 144
    .line 145
    const v13, -0x41666666    # -0.3f

    .line 146
    .line 147
    .line 148
    const v14, -0x42333333    # -0.1f

    .line 149
    .line 150
    .line 151
    const v15, -0x40d70a3d    # -0.66f

    .line 152
    .line 153
    .line 154
    const v16, -0x41dc28f6    # -0.16f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x407c28f6    # -1.03f

    .line 161
    .line 162
    .line 163
    const v18, 0x3e051eb8    # 0.13f

    .line 164
    .line 165
    .line 166
    const v13, -0x413851ec    # -0.39f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const v15, -0x40c28f5c    # -0.74f

    .line 171
    .line 172
    .line 173
    const v16, 0x3d23d70a    # 0.04f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, 0x3e570a3d    # 0.21f

    .line 180
    .line 181
    .line 182
    const v2, -0x40c7ae14    # -0.72f

    .line 183
    .line 184
    .line 185
    const v4, 0x3eb851ec    # 0.36f

    .line 186
    .line 187
    .line 188
    const v6, -0x40f851ec    # -0.53f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x411eb852    # -0.44f

    .line 195
    .line 196
    .line 197
    const v18, 0x3f0ccccd    # 0.55f

    .line 198
    .line 199
    .line 200
    const v13, -0x41bd70a4    # -0.19f

    .line 201
    .line 202
    .line 203
    const v14, 0x3e23d70a    # 0.16f

    .line 204
    .line 205
    .line 206
    const v15, -0x4151eb85    # -0.34f

    .line 207
    .line 208
    .line 209
    const v16, 0x3eae147b    # 0.34f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v17, -0x41e66666    # -0.15f

    .line 216
    .line 217
    .line 218
    const v18, 0x3f28f5c3    # 0.66f

    .line 219
    .line 220
    .line 221
    const v13, -0x42333333    # -0.1f

    .line 222
    .line 223
    .line 224
    const v14, 0x3e570a3d    # 0.21f

    .line 225
    .line 226
    .line 227
    const v15, -0x41e66666    # -0.15f

    .line 228
    .line 229
    .line 230
    const v16, 0x3edc28f6    # 0.43f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, 0x3f3d70a4    # 0.74f

    .line 237
    .line 238
    .line 239
    const v18, 0x3f9ae148    # 1.21f

    .line 240
    .line 241
    .line 242
    const/4 v13, 0x0

    .line 243
    const v14, 0x3ef5c28f    # 0.48f

    .line 244
    .line 245
    .line 246
    const/high16 v15, 0x3e800000    # 0.25f

    .line 247
    .line 248
    const v16, 0x3f6147ae    # 0.88f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, 0x3fb47ae1    # 1.41f

    .line 255
    .line 256
    .line 257
    const v18, 0x3f333333    # 0.7f

    .line 258
    .line 259
    .line 260
    const v13, 0x3ec28f5c    # 0.38f

    .line 261
    .line 262
    .line 263
    const/high16 v14, 0x3e800000    # 0.25f

    .line 264
    .line 265
    const v15, 0x3f451eb8    # 0.77f

    .line 266
    .line 267
    .line 268
    const v16, 0x3ef5c28f    # 0.48f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v0, 0x40ec7ae1    # 7.39f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, -0x41e66666    # -0.15f

    .line 281
    .line 282
    .line 283
    const/high16 v18, -0x41800000    # -0.25f

    .line 284
    .line 285
    const v13, -0x42b33333    # -0.05f

    .line 286
    .line 287
    .line 288
    const v14, -0x425c28f6    # -0.08f

    .line 289
    .line 290
    .line 291
    const v15, -0x421eb852    # -0.11f

    .line 292
    .line 293
    .line 294
    const v16, -0x41d1eb85    # -0.17f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, -0x413851ec    # -0.39f

    .line 301
    .line 302
    .line 303
    const v18, -0x402a3d71    # -1.67f

    .line 304
    .line 305
    .line 306
    const v13, -0x417ae148    # -0.26f

    .line 307
    .line 308
    .line 309
    const v14, -0x410a3d71    # -0.48f

    .line 310
    .line 311
    .line 312
    const v15, -0x413851ec    # -0.39f

    .line 313
    .line 314
    .line 315
    const v16, -0x407c28f6    # -1.03f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x3ecccccd    # 0.4f

    .line 322
    .line 323
    .line 324
    const/4 v13, 0x0

    .line 325
    const v14, -0x40e3d70a    # -0.61f

    .line 326
    .line 327
    .line 328
    const v15, 0x3e051eb8    # 0.13f

    .line 329
    .line 330
    .line 331
    const v16, -0x406b851f    # -1.16f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x3f8e147b    # 1.11f

    .line 338
    .line 339
    .line 340
    const v18, -0x405ae148    # -1.29f

    .line 341
    .line 342
    .line 343
    const v13, 0x3e851eb8    # 0.26f

    .line 344
    .line 345
    .line 346
    const/high16 v14, -0x41000000    # -0.5f

    .line 347
    .line 348
    const v15, 0x3f2147ae    # 0.63f

    .line 349
    .line 350
    .line 351
    const v16, -0x4091eb85    # -0.93f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x3fd9999a    # 1.7f

    .line 358
    .line 359
    .line 360
    const v18, -0x40ab851f    # -0.83f

    .line 361
    .line 362
    .line 363
    const v13, 0x3ef5c28f    # 0.48f

    .line 364
    .line 365
    .line 366
    const v14, -0x414ccccd    # -0.35f

    .line 367
    .line 368
    .line 369
    const v15, 0x3f866666    # 1.05f

    .line 370
    .line 371
    .line 372
    const v16, -0x40deb852    # -0.63f

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, 0x400b851f    # 2.18f

    .line 379
    .line 380
    .line 381
    const v18, -0x416b851f    # -0.29f

    .line 382
    .line 383
    .line 384
    const v13, 0x3f28f5c3    # 0.66f

    .line 385
    .line 386
    .line 387
    const v14, -0x41bd70a4    # -0.19f

    .line 388
    .line 389
    .line 390
    const v15, 0x3fb1eb85    # 1.39f

    .line 391
    .line 392
    .line 393
    const v16, -0x416b851f    # -0.29f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v17, 0x400d70a4    # 2.21f

    .line 400
    .line 401
    .line 402
    const v18, 0x3eae147b    # 0.34f

    .line 403
    .line 404
    .line 405
    const v13, 0x3f4f5c29    # 0.81f

    .line 406
    .line 407
    .line 408
    const/4 v14, 0x0

    .line 409
    const v15, 0x3fc51eb8    # 1.54f

    .line 410
    .line 411
    .line 412
    const v16, 0x3de147ae    # 0.11f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, 0x3fd851ec    # 1.69f

    .line 419
    .line 420
    .line 421
    const v18, 0x3f70a3d7    # 0.94f

    .line 422
    .line 423
    .line 424
    const v13, 0x3f28f5c3    # 0.66f

    .line 425
    .line 426
    .line 427
    const v14, 0x3e6147ae    # 0.22f

    .line 428
    .line 429
    .line 430
    const v15, 0x3f9d70a4    # 1.23f

    .line 431
    .line 432
    .line 433
    const v16, 0x3f0a3d71    # 0.54f

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v17, 0x3f8a3d71    # 1.08f

    .line 440
    .line 441
    .line 442
    const v18, 0x3fb70a3d    # 1.43f

    .line 443
    .line 444
    .line 445
    const v13, 0x3ef0a3d7    # 0.47f

    .line 446
    .line 447
    .line 448
    const v14, 0x3ecccccd    # 0.4f

    .line 449
    .line 450
    .line 451
    const v15, 0x3f547ae1    # 0.83f

    .line 452
    .line 453
    .line 454
    const v16, 0x3f6147ae    # 0.88f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v0, 0x3f933333    # 1.15f

    .line 461
    .line 462
    .line 463
    const v2, 0x3fe7ae14    # 1.81f

    .line 464
    .line 465
    .line 466
    const v4, 0x3ec28f5c    # 0.38f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, -0x3fbf5c29    # -3.01f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x41200000    # 10.0f

    .line 479
    .line 480
    const/high16 v2, 0x41a00000    # 20.0f

    .line 481
    .line 482
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v0, 0x40800000    # 4.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, -0x40800000    # -1.0f

    .line 491
    .line 492
    const/high16 v18, 0x3f800000    # 1.0f

    .line 493
    .line 494
    const v13, -0x40f33333    # -0.55f

    .line 495
    .line 496
    .line 497
    const/4 v14, 0x0

    .line 498
    const/high16 v15, -0x40800000    # -1.0f

    .line 499
    .line 500
    const v16, 0x3ee66666    # 0.45f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x3ee66666    # 0.45f

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x3f800000    # 1.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x4109eb85    # 8.62f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, 0x3f0ccccd    # 0.55f

    .line 521
    .line 522
    .line 523
    const v18, 0x3e4ccccd    # 0.2f

    .line 524
    .line 525
    .line 526
    const v13, 0x3e3851ec    # 0.18f

    .line 527
    .line 528
    .line 529
    const v14, 0x3d8f5c29    # 0.07f

    .line 530
    .line 531
    .line 532
    const v15, 0x3ecccccd    # 0.4f

    .line 533
    .line 534
    .line 535
    const v16, 0x3e0f5c29    # 0.14f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x3f5eb852    # 0.87f

    .line 542
    .line 543
    .line 544
    const v18, 0x3f028f5c    # 0.51f

    .line 545
    .line 546
    .line 547
    const v13, 0x3ebd70a4    # 0.37f

    .line 548
    .line 549
    .line 550
    const v14, 0x3e2e147b    # 0.17f

    .line 551
    .line 552
    .line 553
    const v15, 0x3f28f5c3    # 0.66f

    .line 554
    .line 555
    .line 556
    const v16, 0x3eae147b    # 0.34f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, 0x3edc28f6    # 0.43f

    .line 563
    .line 564
    .line 565
    const v2, 0x3f11eb85    # 0.57f

    .line 566
    .line 567
    .line 568
    const v4, 0x3eb851ec    # 0.36f

    .line 569
    .line 570
    .line 571
    const v6, 0x3eb33333    # 0.35f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v17, 0x3de147ae    # 0.11f

    .line 578
    .line 579
    .line 580
    const v18, 0x3f30a3d7    # 0.69f

    .line 581
    .line 582
    .line 583
    const v13, 0x3d8f5c29    # 0.07f

    .line 584
    .line 585
    .line 586
    const v14, 0x3e4ccccd    # 0.2f

    .line 587
    .line 588
    .line 589
    const v15, 0x3de147ae    # 0.11f

    .line 590
    .line 591
    .line 592
    const v16, 0x3edc28f6    # 0.43f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, -0x41f0a3d7    # -0.14f

    .line 599
    .line 600
    .line 601
    const v18, 0x3f28f5c3    # 0.66f

    .line 602
    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const v14, 0x3e6b851f    # 0.23f

    .line 606
    .line 607
    .line 608
    const v15, -0x42b33333    # -0.05f

    .line 609
    .line 610
    .line 611
    const v16, 0x3ee66666    # 0.45f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, -0x4128f5c3    # -0.42f

    .line 618
    .line 619
    .line 620
    const v18, 0x3f07ae14    # 0.53f

    .line 621
    .line 622
    .line 623
    const v13, -0x4247ae14    # -0.09f

    .line 624
    .line 625
    .line 626
    const v14, 0x3e4ccccd    # 0.2f

    .line 627
    .line 628
    .line 629
    const v15, -0x41947ae1    # -0.23f

    .line 630
    .line 631
    .line 632
    const v16, 0x3ec28f5c    # 0.38f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v17, -0x40ca3d71    # -0.71f

    .line 639
    .line 640
    .line 641
    const v18, 0x3eb33333    # 0.35f

    .line 642
    .line 643
    .line 644
    const v13, -0x41bd70a4    # -0.19f

    .line 645
    .line 646
    .line 647
    const v14, 0x3e19999a    # 0.15f

    .line 648
    .line 649
    .line 650
    const v15, -0x4128f5c3    # -0.42f

    .line 651
    .line 652
    .line 653
    const v16, 0x3e851eb8    # 0.26f

    .line 654
    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v17, -0x407eb852    # -1.01f

    .line 660
    .line 661
    .line 662
    const v18, 0x3e051eb8    # 0.13f

    .line 663
    .line 664
    .line 665
    const v13, -0x416b851f    # -0.29f

    .line 666
    .line 667
    .line 668
    const v14, 0x3da3d70a    # 0.08f

    .line 669
    .line 670
    .line 671
    const v15, -0x40deb852    # -0.63f

    .line 672
    .line 673
    .line 674
    const v16, 0x3e051eb8    # 0.13f

    .line 675
    .line 676
    .line 677
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const v17, -0x4068f5c3    # -1.18f

    .line 681
    .line 682
    .line 683
    const v18, -0x41fae148    # -0.13f

    .line 684
    .line 685
    .line 686
    const v13, -0x4123d70a    # -0.43f

    .line 687
    .line 688
    .line 689
    const/4 v14, 0x0

    .line 690
    const v15, -0x40ab851f    # -0.83f

    .line 691
    .line 692
    .line 693
    const v16, -0x42dc28f6    # -0.04f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const v0, -0x40970a3d    # -0.91f

    .line 700
    .line 701
    .line 702
    const v2, -0x4128f5c3    # -0.42f

    .line 703
    .line 704
    .line 705
    const v4, -0x40d70a3d    # -0.66f

    .line 706
    .line 707
    .line 708
    const v6, -0x41947ae1    # -0.23f

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, -0x40e8f5c3    # -0.59f

    .line 715
    .line 716
    .line 717
    const/high16 v18, -0x40c00000    # -0.75f

    .line 718
    .line 719
    const/high16 v13, -0x41800000    # -0.25f

    .line 720
    .line 721
    const v14, -0x41bd70a4    # -0.19f

    .line 722
    .line 723
    .line 724
    const v15, -0x4119999a    # -0.45f

    .line 725
    .line 726
    .line 727
    const v16, -0x411eb852    # -0.44f

    .line 728
    .line 729
    .line 730
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v0, -0x40bd70a4    # -0.76f

    .line 734
    .line 735
    .line 736
    const v2, -0x40651eb8    # -1.21f

    .line 737
    .line 738
    .line 739
    const/high16 v4, -0x41800000    # -0.25f

    .line 740
    .line 741
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v0, 0x40cccccd    # 6.4f

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v17, 0x3e75c28f    # 0.24f

    .line 751
    .line 752
    .line 753
    const v18, 0x3fca3d71    # 1.58f

    .line 754
    .line 755
    .line 756
    const/4 v13, 0x0

    .line 757
    const v14, 0x3f0ccccd    # 0.55f

    .line 758
    .line 759
    .line 760
    const v15, 0x3da3d70a    # 0.08f

    .line 761
    .line 762
    .line 763
    const v16, 0x3f90a3d7    # 1.13f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v0, 0x3f59999a    # 0.85f

    .line 770
    .line 771
    .line 772
    const v2, 0x3f266666    # 0.65f

    .line 773
    .line 774
    .line 775
    const v4, 0x3f9ae148    # 1.21f

    .line 776
    .line 777
    .line 778
    const v6, 0x3ebd70a4    # 0.37f

    .line 779
    .line 780
    .line 781
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const v17, 0x3f7ae148    # 0.98f

    .line 785
    .line 786
    .line 787
    const v18, 0x3f6b851f    # 0.92f

    .line 788
    .line 789
    .line 790
    const v13, 0x3e8f5c29    # 0.28f

    .line 791
    .line 792
    .line 793
    const v14, 0x3eb33333    # 0.35f

    .line 794
    .line 795
    .line 796
    const v15, 0x3f19999a    # 0.6f

    .line 797
    .line 798
    .line 799
    const v16, 0x3f28f5c3    # 0.66f

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v17, 0x3f9c28f6    # 1.22f

    .line 806
    .line 807
    .line 808
    const v18, 0x3f266666    # 0.65f

    .line 809
    .line 810
    .line 811
    const v13, 0x3ebd70a4    # 0.37f

    .line 812
    .line 813
    .line 814
    const v14, 0x3e851eb8    # 0.26f

    .line 815
    .line 816
    .line 817
    const v15, 0x3f47ae14    # 0.78f

    .line 818
    .line 819
    .line 820
    const v16, 0x3ef5c28f    # 0.48f

    .line 821
    .line 822
    .line 823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v17, 0x3fb0a3d7    # 1.38f

    .line 827
    .line 828
    .line 829
    const v18, 0x3ec7ae14    # 0.39f

    .line 830
    .line 831
    .line 832
    const v13, 0x3ee147ae    # 0.44f

    .line 833
    .line 834
    .line 835
    const v14, 0x3e2e147b    # 0.17f

    .line 836
    .line 837
    .line 838
    const v15, 0x3f666666    # 0.9f

    .line 839
    .line 840
    .line 841
    const v16, 0x3e99999a    # 0.3f

    .line 842
    .line 843
    .line 844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    const v17, 0x3fb851ec    # 1.44f

    .line 848
    .line 849
    .line 850
    const v18, 0x3e051eb8    # 0.13f

    .line 851
    .line 852
    .line 853
    const v13, 0x3ef5c28f    # 0.48f

    .line 854
    .line 855
    .line 856
    const v14, 0x3da3d70a    # 0.08f

    .line 857
    .line 858
    .line 859
    const v15, 0x3f75c28f    # 0.96f

    .line 860
    .line 861
    .line 862
    const v16, 0x3e051eb8    # 0.13f

    .line 863
    .line 864
    .line 865
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const v17, 0x400b851f    # 2.18f

    .line 869
    .line 870
    .line 871
    const v18, -0x4170a3d7    # -0.28f

    .line 872
    .line 873
    .line 874
    const v13, 0x3f4ccccd    # 0.8f

    .line 875
    .line 876
    .line 877
    const/4 v14, 0x0

    .line 878
    const v15, 0x3fc3d70a    # 1.53f

    .line 879
    .line 880
    .line 881
    const v16, -0x4247ae14    # -0.09f

    .line 882
    .line 883
    .line 884
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    const v0, 0x3fd5c28f    # 1.67f

    .line 888
    .line 889
    .line 890
    const v2, -0x40b5c28f    # -0.79f

    .line 891
    .line 892
    .line 893
    const v6, -0x4119999a    # -0.45f

    .line 894
    .line 895
    .line 896
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 897
    .line 898
    .line 899
    const v17, 0x3f88f5c3    # 1.07f

    .line 900
    .line 901
    .line 902
    const v18, -0x405d70a4    # -1.27f

    .line 903
    .line 904
    .line 905
    const v13, 0x3eeb851f    # 0.46f

    .line 906
    .line 907
    .line 908
    const v14, -0x4151eb85    # -0.34f

    .line 909
    .line 910
    .line 911
    const v15, 0x3f51eb85    # 0.82f

    .line 912
    .line 913
    .line 914
    const v16, -0x40bae148    # -0.77f

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const v0, -0x40770a3d    # -1.07f

    .line 921
    .line 922
    .line 923
    const v2, -0x40251eb8    # -1.71f

    .line 924
    .line 925
    .line 926
    const v4, 0x3ec28f5c    # 0.38f

    .line 927
    .line 928
    .line 929
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const v17, -0x416147ae    # -0.31f

    .line 933
    .line 934
    .line 935
    const v18, -0x4031eb85    # -1.61f

    .line 936
    .line 937
    .line 938
    const/4 v13, 0x0

    .line 939
    const v14, -0x40e66666    # -0.6f

    .line 940
    .line 941
    .line 942
    const v15, -0x42333333    # -0.1f

    .line 943
    .line 944
    .line 945
    const v16, -0x406e147b    # -1.14f

    .line 946
    .line 947
    .line 948
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const v17, -0x41d1eb85    # -0.17f

    .line 952
    .line 953
    .line 954
    const v18, -0x41570a3d    # -0.33f

    .line 955
    .line 956
    .line 957
    const v13, -0x42b33333    # -0.05f

    .line 958
    .line 959
    .line 960
    const v14, -0x421eb852    # -0.11f

    .line 961
    .line 962
    .line 963
    const v15, -0x421eb852    # -0.11f

    .line 964
    .line 965
    .line 966
    const v16, -0x41947ae1    # -0.23f

    .line 967
    .line 968
    .line 969
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 970
    .line 971
    .line 972
    const/high16 v0, 0x41a00000    # 20.0f

    .line 973
    .line 974
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const/high16 v17, 0x3f800000    # 1.0f

    .line 978
    .line 979
    const/high16 v18, -0x40800000    # -1.0f

    .line 980
    .line 981
    const v13, 0x3f0ccccd    # 0.55f

    .line 982
    .line 983
    .line 984
    const/4 v14, 0x0

    .line 985
    const/high16 v15, 0x3f800000    # 1.0f

    .line 986
    .line 987
    const v16, -0x4119999a    # -0.45f

    .line 988
    .line 989
    .line 990
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const/high16 v0, 0x41300000    # 11.0f

    .line 994
    .line 995
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const/high16 v17, -0x40800000    # -1.0f

    .line 999
    .line 1000
    const/4 v13, 0x0

    .line 1001
    const v14, -0x40f33333    # -0.55f

    .line 1002
    .line 1003
    .line 1004
    const v15, -0x4119999a    # -0.45f

    .line 1005
    .line 1006
    .line 1007
    const/high16 v16, -0x40800000    # -1.0f

    .line 1008
    .line 1009
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v2

    .line 1019
    const/16 v16, 0x3800

    .line 1020
    .line 1021
    const/16 v17, 0x0

    .line 1022
    .line 1023
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1024
    .line 1025
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1026
    .line 1027
    const/4 v7, 0x0

    .line 1028
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1029
    .line 1030
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1031
    .line 1032
    const/4 v14, 0x0

    .line 1033
    const/4 v15, 0x0

    .line 1034
    const-string v4, ""

    .line 1035
    .line 1036
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    sput-object v0, Landroidx/compose/material/icons/rounded/StrikethroughSKt;->_strikethroughS:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1045
    .line 1046
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1047
    .line 1048
    .line 1049
    return-object v0
.end method

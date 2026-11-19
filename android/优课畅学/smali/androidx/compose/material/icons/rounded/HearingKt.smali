.class public final Landroidx/compose/material/icons/rounded/HearingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hearing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHearing(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/HearingKt;->_hearing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Hearing"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x40bd70a4    # -0.76f

    .line 78
    .line 79
    .line 80
    const v18, -0x41e66666    # -0.15f

    .line 81
    .line 82
    .line 83
    const v13, -0x416b851f    # -0.29f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x40f0a3d7    # -0.56f

    .line 88
    .line 89
    .line 90
    const v16, -0x428a3d71    # -0.06f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, -0x40251eb8    # -1.71f

    .line 97
    .line 98
    .line 99
    const v18, -0x3fe7ae14    # -2.38f

    .line 100
    .line 101
    .line 102
    const v13, -0x40ca3d71    # -0.71f

    .line 103
    .line 104
    .line 105
    const v14, -0x41428f5c    # -0.37f

    .line 106
    .line 107
    .line 108
    const v15, -0x40651eb8    # -1.21f

    .line 109
    .line 110
    .line 111
    const v16, -0x409eb852    # -0.88f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, -0x3fe70a3d    # -2.39f

    .line 118
    .line 119
    .line 120
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 121
    .line 122
    const v13, -0x40fd70a4    # -0.51f

    .line 123
    .line 124
    .line 125
    const v14, -0x403851ec    # -1.56f

    .line 126
    .line 127
    .line 128
    const v15, -0x4043d70a    # -1.47f

    .line 129
    .line 130
    .line 131
    const v16, -0x3fed70a4    # -2.29f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v17, -0x3feb851f    # -2.32f

    .line 138
    .line 139
    .line 140
    const v18, -0x3fde147b    # -2.53f

    .line 141
    .line 142
    .line 143
    const v13, -0x40b5c28f    # -0.79f

    .line 144
    .line 145
    .line 146
    const v14, -0x40e3d70a    # -0.61f

    .line 147
    .line 148
    .line 149
    const v15, -0x4031eb85    # -1.61f

    .line 150
    .line 151
    .line 152
    const v16, -0x406147ae    # -1.24f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v17, 0x41100000    # 9.0f

    .line 159
    .line 160
    const/high16 v18, 0x41100000    # 9.0f

    .line 161
    .line 162
    const v13, 0x4114a3d7    # 9.29f

    .line 163
    .line 164
    .line 165
    const v14, 0x412fae14    # 10.98f

    .line 166
    .line 167
    .line 168
    const/high16 v15, 0x41100000    # 9.0f

    .line 169
    .line 170
    const v16, 0x411ee148    # 9.93f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x40a00000    # 5.0f

    .line 177
    .line 178
    const/high16 v18, -0x3f600000    # -5.0f

    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const v14, -0x3fcccccd    # -2.8f

    .line 182
    .line 183
    .line 184
    const v15, 0x400ccccd    # 2.2f

    .line 185
    .line 186
    .line 187
    const/high16 v16, -0x3f600000    # -5.0f

    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, 0x409e6666    # 4.95f

    .line 193
    .line 194
    .line 195
    const v18, 0x4089eb85    # 4.31f

    .line 196
    .line 197
    .line 198
    const v13, 0x4023d70a    # 2.56f

    .line 199
    .line 200
    .line 201
    const/4 v14, 0x0

    .line 202
    const v15, 0x409428f6    # 4.63f

    .line 203
    .line 204
    .line 205
    const v16, 0x3feccccd    # 1.85f

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, 0x3f51eb85    # 0.82f

    .line 212
    .line 213
    .line 214
    const v18, 0x3f30a3d7    # 0.69f

    .line 215
    .line 216
    .line 217
    const v13, 0x3d75c28f    # 0.06f

    .line 218
    .line 219
    .line 220
    const v14, 0x3ecccccd    # 0.4f

    .line 221
    .line 222
    .line 223
    const v15, 0x3ed1eb85    # 0.41f

    .line 224
    .line 225
    .line 226
    const v16, 0x3f30a3d7    # 0.69f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v0, 0x3eae147b    # 0.34f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v17, 0x3f547ae1    # 0.83f

    .line 239
    .line 240
    .line 241
    const v18, -0x408f5c29    # -0.94f

    .line 242
    .line 243
    .line 244
    const/high16 v13, 0x3f000000    # 0.5f

    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    const v15, 0x3f63d70a    # 0.89f

    .line 248
    .line 249
    .line 250
    const v16, -0x411eb852    # -0.44f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v17, 0x41600000    # 14.0f

    .line 257
    .line 258
    const/high16 v18, 0x40000000    # 2.0f

    .line 259
    .line 260
    const v13, 0x41a3eb85    # 20.49f

    .line 261
    .line 262
    .line 263
    const v14, 0x4092e148    # 4.59f

    .line 264
    .line 265
    .line 266
    const v15, 0x418ce148    # 17.61f

    .line 267
    .line 268
    .line 269
    const/high16 v16, 0x40000000    # 2.0f

    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x3f200000    # -7.0f

    .line 275
    .line 276
    const/high16 v18, 0x40e00000    # 7.0f

    .line 277
    .line 278
    const v13, -0x3f847ae1    # -3.93f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const/high16 v15, -0x3f200000    # -7.0f

    .line 283
    .line 284
    const v16, 0x40447ae1    # 3.07f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, 0x3f88f5c3    # 1.07f

    .line 291
    .line 292
    .line 293
    const v18, 0x4079999a    # 3.9f

    .line 294
    .line 295
    .line 296
    const/4 v13, 0x0

    .line 297
    const v14, 0x3fa147ae    # 1.26f

    .line 298
    .line 299
    .line 300
    const v15, 0x3ec28f5c    # 0.38f

    .line 301
    .line 302
    .line 303
    const v16, 0x4029999a    # 2.65f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, 0x40366666    # 2.85f

    .line 310
    .line 311
    .line 312
    const v18, 0x4049999a    # 3.15f

    .line 313
    .line 314
    .line 315
    const v13, 0x3f68f5c3    # 0.91f

    .line 316
    .line 317
    .line 318
    const v14, 0x3fd33333    # 1.65f

    .line 319
    .line 320
    .line 321
    const v15, 0x3ffd70a4    # 1.98f

    .line 322
    .line 323
    .line 324
    const v16, 0x401eb852    # 2.48f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v17, 0x3fdae148    # 1.71f

    .line 331
    .line 332
    .line 333
    const v18, 0x40033333    # 2.05f

    .line 334
    .line 335
    .line 336
    const v13, 0x3f4f5c29    # 0.81f

    .line 337
    .line 338
    .line 339
    const v14, 0x3f1eb852    # 0.62f

    .line 340
    .line 341
    .line 342
    const v15, 0x3fb1eb85    # 1.39f

    .line 343
    .line 344
    .line 345
    const v16, 0x3f88f5c3    # 1.07f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v17, 0x402eb852    # 2.73f

    .line 352
    .line 353
    .line 354
    const v18, 0x40633333    # 3.55f

    .line 355
    .line 356
    .line 357
    const v13, 0x3f19999a    # 0.6f

    .line 358
    .line 359
    .line 360
    const v14, 0x3fe8f5c3    # 1.82f

    .line 361
    .line 362
    .line 363
    const v15, 0x3faf5c29    # 1.37f

    .line 364
    .line 365
    .line 366
    const v16, 0x4035c28f    # 2.84f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, 0x3fd1eb85    # 1.64f

    .line 373
    .line 374
    .line 375
    const v18, 0x3eb33333    # 0.35f

    .line 376
    .line 377
    .line 378
    const v13, 0x3f028f5c    # 0.51f

    .line 379
    .line 380
    .line 381
    const v14, 0x3e6b851f    # 0.23f

    .line 382
    .line 383
    .line 384
    const v15, 0x3f88f5c3    # 1.07f

    .line 385
    .line 386
    .line 387
    const v16, 0x3eb33333    # 0.35f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, 0x40770a3d    # 3.86f

    .line 394
    .line 395
    .line 396
    const v18, -0x3fc47ae1    # -2.93f

    .line 397
    .line 398
    .line 399
    const v13, 0x3feb851f    # 1.84f

    .line 400
    .line 401
    .line 402
    const/4 v14, 0x0

    .line 403
    const v15, 0x4058f5c3    # 3.39f

    .line 404
    .line 405
    .line 406
    const v16, -0x406147ae    # -1.24f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, -0x40b0a3d7    # -0.81f

    .line 413
    .line 414
    .line 415
    const v18, -0x40770a3d    # -1.07f

    .line 416
    .line 417
    .line 418
    const v13, 0x3e0f5c29    # 0.14f

    .line 419
    .line 420
    .line 421
    const v14, -0x40f5c28f    # -0.54f

    .line 422
    .line 423
    .line 424
    const/high16 v15, -0x41800000    # -0.25f

    .line 425
    .line 426
    const v16, -0x40770a3d    # -1.07f

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, -0x414ccccd    # -0.35f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v18, 0x3f2147ae    # 0.63f

    .line 439
    .line 440
    .line 441
    const v13, -0x413d70a4    # -0.38f

    .line 442
    .line 443
    .line 444
    const/4 v14, 0x0

    .line 445
    const v15, -0x40d1eb85    # -0.68f

    .line 446
    .line 447
    .line 448
    const v16, 0x3e8a3d71    # 0.27f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, -0x400e147b    # -1.89f

    .line 455
    .line 456
    .line 457
    const v18, 0x3faf5c29    # 1.37f

    .line 458
    .line 459
    .line 460
    const v13, -0x417ae148    # -0.26f

    .line 461
    .line 462
    .line 463
    const v14, 0x3f4a3d71    # 0.79f

    .line 464
    .line 465
    .line 466
    const v15, -0x407eb852    # -1.01f

    .line 467
    .line 468
    .line 469
    const v16, 0x3faf5c29    # 1.37f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x40df0a3d    # 6.97f

    .line 479
    .line 480
    .line 481
    const v2, 0x3ffc28f6    # 1.97f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v17, -0x40400000    # -1.5f

    .line 488
    .line 489
    const v18, 0x3d8f5c29    # 0.07f

    .line 490
    .line 491
    .line 492
    const v13, -0x4123d70a    # -0.43f

    .line 493
    .line 494
    .line 495
    const v14, -0x4123d70a    # -0.43f

    .line 496
    .line 497
    .line 498
    const v15, -0x4070a3d7    # -1.12f

    .line 499
    .line 500
    .line 501
    const v16, -0x413851ec    # -0.39f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v17, 0x40400000    # 3.0f

    .line 508
    .line 509
    const/high16 v18, 0x41100000    # 9.0f

    .line 510
    .line 511
    const v13, 0x407b851f    # 3.93f

    .line 512
    .line 513
    .line 514
    const v14, 0x407c28f6    # 3.94f

    .line 515
    .line 516
    .line 517
    const/high16 v15, 0x40400000    # 3.0f

    .line 518
    .line 519
    const v16, 0x40cb851f    # 6.36f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x401e147b    # 2.47f

    .line 526
    .line 527
    .line 528
    const v2, 0x40de6666    # 6.95f

    .line 529
    .line 530
    .line 531
    const v4, 0x3f6e147b    # 0.93f

    .line 532
    .line 533
    .line 534
    const v6, 0x40a1eb85    # 5.06f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x3fbeb852    # 1.49f

    .line 541
    .line 542
    .line 543
    const v18, 0x3da3d70a    # 0.08f

    .line 544
    .line 545
    .line 546
    const v13, 0x3ec28f5c    # 0.38f

    .line 547
    .line 548
    .line 549
    const v14, 0x3eeb851f    # 0.46f

    .line 550
    .line 551
    .line 552
    const v15, 0x3f88f5c3    # 1.07f

    .line 553
    .line 554
    .line 555
    const/high16 v16, 0x3f000000    # 0.5f

    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, 0x3d8f5c29    # 0.07f

    .line 561
    .line 562
    .line 563
    const v18, -0x40570a3d    # -1.32f

    .line 564
    .line 565
    .line 566
    const v13, 0x3eb851ec    # 0.36f

    .line 567
    .line 568
    .line 569
    const v14, -0x4147ae14    # -0.36f

    .line 570
    .line 571
    .line 572
    const v15, 0x3ec7ae14    # 0.39f

    .line 573
    .line 574
    .line 575
    const v16, -0x4091eb85    # -0.93f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const/high16 v17, 0x40a00000    # 5.0f

    .line 582
    .line 583
    const/high16 v18, 0x41100000    # 9.0f

    .line 584
    .line 585
    const v13, 0x40b8a3d7    # 5.77f

    .line 586
    .line 587
    .line 588
    const v14, 0x41528f5c    # 13.16f

    .line 589
    .line 590
    .line 591
    const/high16 v15, 0x40a00000    # 5.0f

    .line 592
    .line 593
    const v16, 0x4132b852    # 11.17f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, 0x40028f5c    # 2.04f

    .line 600
    .line 601
    .line 602
    const v2, -0x3f49999a    # -5.7f

    .line 603
    .line 604
    .line 605
    const v4, 0x3f451eb8    # 0.77f

    .line 606
    .line 607
    .line 608
    const v6, -0x3f7ae148    # -4.16f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, -0x4270a3d7    # -0.07f

    .line 615
    .line 616
    .line 617
    const v18, -0x4055c28f    # -1.33f

    .line 618
    .line 619
    .line 620
    const v13, 0x3ea8f5c3    # 0.33f

    .line 621
    .line 622
    .line 623
    const v14, -0x41333333    # -0.4f

    .line 624
    .line 625
    .line 626
    const v15, 0x3e947ae1    # 0.29f

    .line 627
    .line 628
    .line 629
    const v16, -0x4087ae14    # -0.97f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v0, 0x41380000    # 11.5f

    .line 639
    .line 640
    const/high16 v2, 0x41100000    # 9.0f

    .line 641
    .line 642
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v17, 0x40200000    # 2.5f

    .line 646
    .line 647
    const/high16 v18, 0x40200000    # 2.5f

    .line 648
    .line 649
    const/4 v13, 0x0

    .line 650
    const v14, 0x3fb0a3d7    # 1.38f

    .line 651
    .line 652
    .line 653
    const v15, 0x3f8f5c29    # 1.12f

    .line 654
    .line 655
    .line 656
    const/high16 v16, 0x40200000    # 2.5f

    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    const v0, -0x4070a3d7    # -1.12f

    .line 662
    .line 663
    .line 664
    const/high16 v2, 0x40200000    # 2.5f

    .line 665
    .line 666
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 667
    .line 668
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 672
    .line 673
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v0, 0x3f8f5c29    # 1.12f

    .line 677
    .line 678
    .line 679
    const/high16 v2, 0x40200000    # 2.5f

    .line 680
    .line 681
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    const/16 v16, 0x3800

    .line 692
    .line 693
    const/16 v17, 0x0

    .line 694
    .line 695
    const/high16 v6, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const/high16 v8, 0x3f800000    # 1.0f

    .line 698
    .line 699
    const/4 v7, 0x0

    .line 700
    const/high16 v9, 0x3f800000    # 1.0f

    .line 701
    .line 702
    const/high16 v12, 0x3f800000    # 1.0f

    .line 703
    .line 704
    const/4 v14, 0x0

    .line 705
    const/4 v15, 0x0

    .line 706
    const-string v4, ""

    .line 707
    .line 708
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    sput-object v0, Landroidx/compose/material/icons/rounded/HearingKt;->_hearing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 717
    .line 718
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    return-object v0
.end method

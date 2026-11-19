.class public final Landroidx/compose/material/icons/filled/PanoramaPhotosphereKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaPhotosphere:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaPhotosphere(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PanoramaPhotosphereKt;->_panoramaPhotosphere:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PanoramaPhotosphere"

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
    const v0, 0x41ab3333    # 21.4f

    .line 71
    .line 72
    .line 73
    const v2, 0x41351eb8    # 11.32f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, 0x403b851f    # 2.93f

    .line 80
    .line 81
    .line 82
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const v17, -0x3faae148    # -3.33f

    .line 86
    .line 87
    .line 88
    const v18, 0x3f95c28f    # 1.17f

    .line 89
    .line 90
    .line 91
    const v13, -0x42333333    # -0.1f

    .line 92
    .line 93
    .line 94
    const v14, 0x3d4ccccd    # 0.05f

    .line 95
    .line 96
    .line 97
    const v15, -0x3ff51eb8    # -2.17f

    .line 98
    .line 99
    .line 100
    const v16, 0x3f59999a    # 0.85f

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v17, -0x3f3dc28f    # -6.07f

    .line 107
    .line 108
    .line 109
    const v18, 0x3f3ae148    # 0.73f

    .line 110
    .line 111
    .line 112
    const v13, -0x408f5c29    # -0.94f

    .line 113
    .line 114
    .line 115
    const v14, 0x3e851eb8    # 0.26f

    .line 116
    .line 117
    .line 118
    const v15, -0x3f8a3d71    # -3.84f

    .line 119
    .line 120
    .line 121
    const v16, 0x3f3ae148    # 0.73f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, -0x3eed70a4    # -9.16f

    .line 128
    .line 129
    .line 130
    const v18, -0x4019999a    # -1.8f

    .line 131
    .line 132
    .line 133
    const v13, -0x3f933333    # -3.7f

    .line 134
    .line 135
    .line 136
    const/4 v14, 0x0

    .line 137
    const/high16 v15, -0x3f200000    # -7.0f

    .line 138
    .line 139
    const v16, -0x40cccccd    # -0.7f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, -0x418a3d71    # -0.24f

    .line 146
    .line 147
    .line 148
    const v18, -0x42333333    # -0.1f

    .line 149
    .line 150
    .line 151
    const v13, -0x425c28f6    # -0.08f

    .line 152
    .line 153
    .line 154
    const v14, -0x42dc28f6    # -0.04f

    .line 155
    .line 156
    .line 157
    const v15, -0x41dc28f6    # -0.16f

    .line 158
    .line 159
    .line 160
    const v16, -0x428a3d71    # -0.06f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x40266666    # 2.6f

    .line 167
    .line 168
    .line 169
    const v2, 0x411c28f6    # 9.76f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, 0x41966666    # 18.8f

    .line 176
    .line 177
    .line 178
    const/16 v18, 0x0

    .line 179
    .line 180
    const v13, 0x40c0a3d7    # 6.02f

    .line 181
    .line 182
    .line 183
    const v14, -0x3fca3d71    # -2.84f

    .line 184
    .line 185
    .line 186
    const v15, 0x4149999a    # 12.6f

    .line 187
    .line 188
    .line 189
    const v16, -0x3fc51eb8    # -2.92f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v0, 0x3fc7ae14    # 1.56f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x414028f6    # 12.01f

    .line 205
    .line 206
    .line 207
    const v2, 0x41a1999a    # 20.2f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, -0x3f32e148    # -6.41f

    .line 214
    .line 215
    .line 216
    const v18, -0x3fb851ec    # -3.12f

    .line 217
    .line 218
    .line 219
    const/high16 v13, -0x3fe00000    # -2.5f

    .line 220
    .line 221
    const/4 v14, 0x0

    .line 222
    const v15, -0x3f6428f6    # -4.87f

    .line 223
    .line 224
    .line 225
    const v16, -0x406ccccd    # -1.15f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, 0x414d1eb8    # 12.82f

    .line 232
    .line 233
    .line 234
    const v18, -0x43dc28f6    # -0.01f

    .line 235
    .line 236
    .line 237
    const v13, 0x4086147b    # 4.19f

    .line 238
    .line 239
    .line 240
    const v14, 0x3f9c28f6    # 1.22f

    .line 241
    .line 242
    .line 243
    const v15, 0x41091eb8    # 8.57f

    .line 244
    .line 245
    .line 246
    const v16, 0x3f9d70a4    # 1.23f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, -0x3f32e148    # -6.41f

    .line 253
    .line 254
    .line 255
    const v18, 0x404851ec    # 3.13f

    .line 256
    .line 257
    .line 258
    const v13, -0x403ae148    # -1.54f

    .line 259
    .line 260
    .line 261
    const v14, 0x3ffc28f6    # 1.97f

    .line 262
    .line 263
    .line 264
    const v15, -0x3f866666    # -3.9f

    .line 265
    .line 266
    .line 267
    const v16, 0x404851ec    # 3.13f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41400000    # 12.0f

    .line 277
    .line 278
    const v2, 0x40733333    # 3.8f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x40cd1eb8    # 6.41f

    .line 285
    .line 286
    .line 287
    const v18, 0x4047ae14    # 3.12f

    .line 288
    .line 289
    .line 290
    const v13, 0x40266666    # 2.6f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const v15, 0x409d1eb8    # 4.91f

    .line 295
    .line 296
    .line 297
    const v16, 0x3f9d70a4    # 1.23f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, -0x3eb2b852    # -12.83f

    .line 304
    .line 305
    .line 306
    const v18, 0x3c23d70a    # 0.01f

    .line 307
    .line 308
    .line 309
    const v13, -0x3f7ccccd    # -4.1f

    .line 310
    .line 311
    .line 312
    const v14, -0x4067ae14    # -1.19f

    .line 313
    .line 314
    .line 315
    const v15, -0x3ef851ec    # -8.48f

    .line 316
    .line 317
    .line 318
    const v16, -0x405eb852    # -1.26f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, 0x41400000    # 12.0f

    .line 325
    .line 326
    const v18, 0x40733333    # 3.8f

    .line 327
    .line 328
    .line 329
    const v13, 0x40e28f5c    # 7.08f

    .line 330
    .line 331
    .line 332
    const v14, 0x40a0f5c3    # 5.03f

    .line 333
    .line 334
    .line 335
    const v15, 0x41166666    # 9.4f

    .line 336
    .line 337
    .line 338
    const v16, 0x40733333    # 3.8f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, 0x41b3eb85    # 22.49f

    .line 348
    .line 349
    .line 350
    const v2, 0x410828f6    # 8.51f

    .line 351
    .line 352
    .line 353
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, -0x404ccccd    # -1.4f

    .line 357
    .line 358
    .line 359
    const v18, -0x40dc28f6    # -0.64f

    .line 360
    .line 361
    .line 362
    const v13, -0x410f5c29    # -0.47f

    .line 363
    .line 364
    .line 365
    const v14, -0x41947ae1    # -0.23f

    .line 366
    .line 367
    .line 368
    const v15, -0x4091eb85    # -0.93f

    .line 369
    .line 370
    .line 371
    const v16, -0x411eb852    # -0.44f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v17, 0x41400000    # 12.0f

    .line 378
    .line 379
    const/high16 v18, 0x40000000    # 2.0f

    .line 380
    .line 381
    const v13, 0x419c28f6    # 19.52f

    .line 382
    .line 383
    .line 384
    const v14, 0x408d1eb8    # 4.41f

    .line 385
    .line 386
    .line 387
    const v15, 0x41806666    # 16.05f

    .line 388
    .line 389
    .line 390
    const/high16 v16, 0x40000000    # 2.0f

    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v0, 0x4039999a    # 2.9f

    .line 396
    .line 397
    .line 398
    const v2, 0x40fc28f6    # 7.88f

    .line 399
    .line 400
    .line 401
    const v4, 0x408f0a3d    # 4.47f

    .line 402
    .line 403
    .line 404
    const v6, 0x408d1eb8    # 4.41f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, -0x404ccccd    # -1.4f

    .line 411
    .line 412
    .line 413
    const v18, 0x3f2147ae    # 0.63f

    .line 414
    .line 415
    .line 416
    const v13, -0x410f5c29    # -0.47f

    .line 417
    .line 418
    .line 419
    const v14, 0x3e4ccccd    # 0.2f

    .line 420
    .line 421
    .line 422
    const v15, -0x4091eb85    # -0.93f

    .line 423
    .line 424
    .line 425
    const v16, 0x3ed1eb85    # 0.41f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, -0x41000000    # -0.5f

    .line 432
    .line 433
    const v18, 0x3f547ae1    # 0.83f

    .line 434
    .line 435
    .line 436
    const v13, -0x416147ae    # -0.31f

    .line 437
    .line 438
    .line 439
    const v14, 0x3e19999a    # 0.15f

    .line 440
    .line 441
    .line 442
    const/high16 v15, -0x41000000    # -0.5f

    .line 443
    .line 444
    const v16, 0x3ef5c28f    # 0.48f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x40aa3d71    # 5.32f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, 0x3f028f5c    # 0.51f

    .line 457
    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const v14, 0x3eb33333    # 0.35f

    .line 461
    .line 462
    .line 463
    const v15, 0x3e428f5c    # 0.19f

    .line 464
    .line 465
    .line 466
    const v16, 0x3f2e147b    # 0.68f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x3fb1eb85    # 1.39f

    .line 473
    .line 474
    .line 475
    const v18, 0x3f23d70a    # 0.64f

    .line 476
    .line 477
    .line 478
    const v13, 0x3ef0a3d7    # 0.47f

    .line 479
    .line 480
    .line 481
    const v14, 0x3e6b851f    # 0.23f

    .line 482
    .line 483
    .line 484
    const v15, 0x3f6e147b    # 0.93f

    .line 485
    .line 486
    .line 487
    const v16, 0x3ee147ae    # 0.44f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v17, 0x4191999a    # 18.2f

    .line 494
    .line 495
    .line 496
    const/16 v18, 0x0

    .line 497
    .line 498
    const v13, 0x40633333    # 3.55f

    .line 499
    .line 500
    .line 501
    const v14, 0x40fa8f5c    # 7.83f

    .line 502
    .line 503
    .line 504
    const v15, 0x416a6666    # 14.65f

    .line 505
    .line 506
    .line 507
    const v16, 0x40fa3d71    # 7.82f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x3fb1eb85    # 1.39f

    .line 514
    .line 515
    .line 516
    const v18, -0x40deb852    # -0.63f

    .line 517
    .line 518
    .line 519
    const v13, 0x3ef0a3d7    # 0.47f

    .line 520
    .line 521
    .line 522
    const v14, -0x41b33333    # -0.2f

    .line 523
    .line 524
    .line 525
    const v15, 0x3f6e147b    # 0.93f

    .line 526
    .line 527
    .line 528
    const v16, -0x412e147b    # -0.41f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v17, 0x3f028f5c    # 0.51f

    .line 535
    .line 536
    .line 537
    const v18, -0x40a8f5c3    # -0.84f

    .line 538
    .line 539
    .line 540
    const v13, 0x3e9eb852    # 0.31f

    .line 541
    .line 542
    .line 543
    const v14, -0x41d1eb85    # -0.17f

    .line 544
    .line 545
    .line 546
    const v15, 0x3f028f5c    # 0.51f

    .line 547
    .line 548
    .line 549
    const v16, -0x41051eb8    # -0.49f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x41b80000    # 23.0f

    .line 556
    .line 557
    const v2, 0x411570a4    # 9.34f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v17, -0x40fd70a4    # -0.51f

    .line 564
    .line 565
    .line 566
    const v18, -0x40ab851f    # -0.83f

    .line 567
    .line 568
    .line 569
    const/4 v13, 0x0

    .line 570
    const v14, -0x414ccccd    # -0.35f

    .line 571
    .line 572
    .line 573
    const v15, -0x41bd70a4    # -0.19f

    .line 574
    .line 575
    .line 576
    const v16, -0x40d1eb85    # -0.68f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    const/16 v16, 0x3800

    .line 590
    .line 591
    const/16 v17, 0x0

    .line 592
    .line 593
    const/high16 v6, 0x3f800000    # 1.0f

    .line 594
    .line 595
    const/high16 v8, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v7, 0x0

    .line 598
    const/high16 v9, 0x3f800000    # 1.0f

    .line 599
    .line 600
    const/high16 v12, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/4 v14, 0x0

    .line 603
    const/4 v15, 0x0

    .line 604
    const-string v4, ""

    .line 605
    .line 606
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    sput-object v0, Landroidx/compose/material/icons/filled/PanoramaPhotosphereKt;->_panoramaPhotosphere:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 615
    .line 616
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    return-object v0
.end method

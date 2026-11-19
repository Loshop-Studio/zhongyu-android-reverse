.class public final Landroidx/compose/material/icons/sharp/SpaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _spa:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpa(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SpaKt;->_spa:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Spa"

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
    const v0, 0x4108cccd    # 8.55f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v17, -0x3f9e147b    # -3.53f

    .line 79
    .line 80
    .line 81
    const v18, -0x4031eb85    # -1.61f

    .line 82
    .line 83
    .line 84
    const v13, -0x40770a3d    # -1.07f

    .line 85
    .line 86
    .line 87
    const v14, -0x40ca3d71    # -0.71f

    .line 88
    .line 89
    .line 90
    const/high16 v15, -0x3ff00000    # -2.25f

    .line 91
    .line 92
    const v16, -0x405d70a4    # -1.27f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, 0x4061eb85    # 3.53f

    .line 99
    .line 100
    .line 101
    const v18, 0x3fce147b    # 1.61f

    .line 102
    .line 103
    .line 104
    const v13, 0x3fa3d70a    # 1.28f

    .line 105
    .line 106
    .line 107
    const v14, 0x3eae147b    # 0.34f

    .line 108
    .line 109
    .line 110
    const v15, 0x401d70a4    # 2.46f

    .line 111
    .line 112
    .line 113
    const v16, 0x3f666666    # 0.9f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, 0x4197d70a    # 18.98f

    .line 123
    .line 124
    .line 125
    const v2, 0x41263d71    # 10.39f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, -0x3f9b851f    # -3.57f

    .line 132
    .line 133
    .line 134
    const v18, 0x3fd1eb85    # 1.64f

    .line 135
    .line 136
    .line 137
    const v13, -0x405ae148    # -1.29f

    .line 138
    .line 139
    .line 140
    const v15, -0x3fe0a3d7    # -2.49f

    .line 141
    .line 142
    .line 143
    const v16, 0x3f68f5c3    # 0.91f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v17, 0x40647ae1    # 3.57f

    .line 150
    .line 151
    .line 152
    const v18, -0x402e147b    # -1.64f

    .line 153
    .line 154
    .line 155
    const v13, 0x3f8a3d71    # 1.08f

    .line 156
    .line 157
    .line 158
    const v14, -0x40c51eb8    # -0.73f

    .line 159
    .line 160
    .line 161
    const v15, 0x4011eb85    # 2.28f

    .line 162
    .line 163
    .line 164
    const v16, -0x4059999a    # -1.3f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x4177d70a    # 15.49f

    .line 174
    .line 175
    .line 176
    const v2, 0x411a147b    # 9.63f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v17, -0x3fa47ae1    # -3.43f

    .line 183
    .line 184
    .line 185
    const v18, -0x3f0bd70a    # -7.63f

    .line 186
    .line 187
    .line 188
    const v13, -0x41c7ae14    # -0.18f

    .line 189
    .line 190
    .line 191
    const v14, -0x3fcd70a4    # -2.79f

    .line 192
    .line 193
    .line 194
    const v15, -0x405851ec    # -1.31f

    .line 195
    .line 196
    .line 197
    const v16, -0x3f4fae14    # -5.51f

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v17, -0x3f9ccccd    # -3.55f

    .line 204
    .line 205
    .line 206
    const v18, 0x40f428f6    # 7.63f

    .line 207
    .line 208
    .line 209
    const v13, -0x3ff70a3d    # -2.14f

    .line 210
    .line 211
    .line 212
    const v14, 0x4008f5c3    # 2.14f

    .line 213
    .line 214
    .line 215
    const v15, -0x3fab851f    # -3.32f

    .line 216
    .line 217
    .line 218
    const v16, 0x409b851f    # 4.86f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, 0x405f5c29    # 3.49f

    .line 225
    .line 226
    .line 227
    const v18, 0x402851ec    # 2.63f

    .line 228
    .line 229
    .line 230
    const v13, 0x3fa3d70a    # 1.28f

    .line 231
    .line 232
    .line 233
    const v14, 0x3f2e147b    # 0.68f

    .line 234
    .line 235
    .line 236
    const v15, 0x401d70a4    # 2.46f

    .line 237
    .line 238
    .line 239
    const v16, 0x3fc7ae14    # 1.56f

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const v18, -0x3fd7ae14    # -2.63f

    .line 246
    .line 247
    .line 248
    const v13, 0x3f83d70a    # 1.03f

    .line 249
    .line 250
    .line 251
    const v14, -0x407851ec    # -1.06f

    .line 252
    .line 253
    .line 254
    const v15, 0x400d70a4    # 2.21f

    .line 255
    .line 256
    .line 257
    const v16, -0x4007ae14    # -1.94f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x410fd70a    # 8.99f

    .line 267
    .line 268
    .line 269
    const v2, 0x41447ae1    # 12.28f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, -0x4119999a    # -0.45f

    .line 276
    .line 277
    .line 278
    const v18, -0x416b851f    # -0.29f

    .line 279
    .line 280
    .line 281
    const v13, -0x41f0a3d7    # -0.14f

    .line 282
    .line 283
    .line 284
    const v14, -0x42333333    # -0.1f

    .line 285
    .line 286
    .line 287
    const v15, -0x41666666    # -0.3f

    .line 288
    .line 289
    .line 290
    const v16, -0x41bd70a4    # -0.19f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, 0x3ee66666    # 0.45f

    .line 297
    .line 298
    .line 299
    const v18, 0x3e947ae1    # 0.29f

    .line 300
    .line 301
    .line 302
    const v13, 0x3e19999a    # 0.15f

    .line 303
    .line 304
    .line 305
    const v14, 0x3de147ae    # 0.11f

    .line 306
    .line 307
    .line 308
    const v15, 0x3e9eb852    # 0.31f

    .line 309
    .line 310
    .line 311
    const v16, 0x3e428f5c    # 0.19f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x41768f5c    # 15.41f

    .line 321
    .line 322
    .line 323
    const v2, 0x41407ae1    # 12.03f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, -0x41333333    # -0.4f

    .line 330
    .line 331
    .line 332
    const v18, 0x3e851eb8    # 0.26f

    .line 333
    .line 334
    .line 335
    const v13, -0x41fae148    # -0.13f

    .line 336
    .line 337
    .line 338
    const v14, 0x3db851ec    # 0.09f

    .line 339
    .line 340
    .line 341
    const v15, -0x4175c28f    # -0.27f

    .line 342
    .line 343
    .line 344
    const v16, 0x3e23d70a    # 0.16f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x3ecccccd    # 0.4f

    .line 351
    .line 352
    .line 353
    const v18, -0x417ae148    # -0.26f

    .line 354
    .line 355
    .line 356
    const v13, 0x3e051eb8    # 0.13f

    .line 357
    .line 358
    .line 359
    const v14, -0x42333333    # -0.1f

    .line 360
    .line 361
    .line 362
    const v15, 0x3e8a3d71    # 0.27f

    .line 363
    .line 364
    .line 365
    const v16, -0x41d1eb85    # -0.17f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x41773333    # 15.45f

    .line 375
    .line 376
    .line 377
    const/high16 v2, 0x41400000    # 12.0f

    .line 378
    .line 379
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v17, 0x40000000    # 2.0f

    .line 383
    .line 384
    const/high16 v18, 0x41200000    # 10.0f

    .line 385
    .line 386
    const v13, 0x411d999a    # 9.85f

    .line 387
    .line 388
    .line 389
    const v14, 0x4142b852    # 12.17f

    .line 390
    .line 391
    .line 392
    const v15, 0x40c5c28f    # 6.18f

    .line 393
    .line 394
    .line 395
    const/high16 v16, 0x41200000    # 10.0f

    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, 0x41007ae1    # 8.03f

    .line 401
    .line 402
    .line 403
    const v18, 0x4137d70a    # 11.49f

    .line 404
    .line 405
    .line 406
    const/4 v13, 0x0

    .line 407
    const v14, 0x40aa3d71    # 5.32f

    .line 408
    .line 409
    .line 410
    const v15, 0x40570a3d    # 3.36f

    .line 411
    .line 412
    .line 413
    const v16, 0x411d1eb8    # 9.82f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v17, 0x3ffc28f6    # 1.97f

    .line 420
    .line 421
    .line 422
    const v18, 0x3f028f5c    # 0.51f

    .line 423
    .line 424
    .line 425
    const v13, 0x3f2147ae    # 0.63f

    .line 426
    .line 427
    .line 428
    const v14, 0x3e6b851f    # 0.23f

    .line 429
    .line 430
    .line 431
    const v15, 0x3fa51eb8    # 1.29f

    .line 432
    .line 433
    .line 434
    const v16, 0x3ecccccd    # 0.4f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v18, -0x40fd70a4    # -0.51f

    .line 441
    .line 442
    .line 443
    const v13, 0x3f2e147b    # 0.68f

    .line 444
    .line 445
    .line 446
    const v14, -0x420a3d71    # -0.12f

    .line 447
    .line 448
    .line 449
    const v15, 0x3faa3d71    # 1.33f

    .line 450
    .line 451
    .line 452
    const v16, -0x416b851f    # -0.29f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const/high16 v17, 0x41b00000    # 22.0f

    .line 459
    .line 460
    const/high16 v18, 0x41200000    # 10.0f

    .line 461
    .line 462
    const v13, 0x41951eb8    # 18.64f

    .line 463
    .line 464
    .line 465
    const v14, 0x419e8f5c    # 19.82f

    .line 466
    .line 467
    .line 468
    const/high16 v15, 0x41b00000    # 22.0f

    .line 469
    .line 470
    const v16, 0x41751eb8    # 15.32f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 477
    .line 478
    const v18, 0x40ae6666    # 5.45f

    .line 479
    .line 480
    .line 481
    const v13, -0x3f7a3d71    # -4.18f

    .line 482
    .line 483
    .line 484
    const/4 v14, 0x0

    .line 485
    const v15, -0x3f04cccd    # -7.85f

    .line 486
    .line 487
    .line 488
    const v16, 0x400ae148    # 2.17f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    const/16 v16, 0x3800

    .line 502
    .line 503
    const/16 v17, 0x0

    .line 504
    .line 505
    const/high16 v6, 0x3f800000    # 1.0f

    .line 506
    .line 507
    const/high16 v8, 0x3f800000    # 1.0f

    .line 508
    .line 509
    const/4 v7, 0x0

    .line 510
    const/high16 v9, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/high16 v12, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/4 v13, 0x0

    .line 515
    const/4 v15, 0x0

    .line 516
    const-string v4, ""

    .line 517
    .line 518
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    sput-object v0, Landroidx/compose/material/icons/sharp/SpaKt;->_spa:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 527
    .line 528
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    return-object v0
.end method

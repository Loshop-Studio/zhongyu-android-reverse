.class public final Landroidx/compose/material/icons/rounded/CameraKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _camera:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCamera(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CameraKt;->_camera:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Camera"

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
    const v0, 0x415cf5c3    # 13.81f

    .line 71
    .line 72
    .line 73
    const v2, 0x40370a3d    # 2.86f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x414ccccd    # -0.35f

    .line 80
    .line 81
    .line 82
    const v18, -0x40c28f5c    # -0.74f

    .line 83
    .line 84
    .line 85
    const v13, 0x3e2e147b    # 0.17f

    .line 86
    .line 87
    .line 88
    const v14, -0x41666666    # -0.3f

    .line 89
    .line 90
    .line 91
    const/4 v15, 0x0

    .line 92
    const v16, -0x40cccccd    # -0.7f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, -0x3f11eb85    # -7.44f

    .line 99
    .line 100
    .line 101
    const v18, 0x3fee147b    # 1.86f

    .line 102
    .line 103
    .line 104
    const v13, -0x3fd851ec    # -2.62f

    .line 105
    .line 106
    .line 107
    const v14, -0x41428f5c    # -0.37f

    .line 108
    .line 109
    .line 110
    const v15, -0x3f566666    # -5.3f

    .line 111
    .line 112
    .line 113
    const v16, 0x3e8f5c29    # 0.28f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, -0x420a3d71    # -0.12f

    .line 120
    .line 121
    .line 122
    const v18, 0x3f266666    # 0.65f

    .line 123
    .line 124
    .line 125
    const v13, -0x41bd70a4    # -0.19f

    .line 126
    .line 127
    .line 128
    const v14, 0x3e19999a    # 0.15f

    .line 129
    .line 130
    .line 131
    const/high16 v15, -0x41800000    # -0.25f

    .line 132
    .line 133
    const v16, 0x3edc28f6    # 0.43f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v0, 0x40a70a3d    # 5.22f

    .line 140
    .line 141
    .line 142
    const v2, 0x4040a3d7    # 3.01f

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x3f5eb852    # 0.87f

    .line 149
    .line 150
    .line 151
    const/16 v18, 0x0

    .line 152
    .line 153
    const v13, 0x3e428f5c    # 0.19f

    .line 154
    .line 155
    .line 156
    const v14, 0x3ea8f5c3    # 0.33f

    .line 157
    .line 158
    .line 159
    const v15, 0x3f2b851f    # 0.67f

    .line 160
    .line 161
    .line 162
    const v16, 0x3ea8f5c3    # 0.33f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x4080f5c3    # 4.03f

    .line 169
    .line 170
    .line 171
    const v2, -0x3f2051ec    # -6.99f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x41aa6666    # 21.3f

    .line 181
    .line 182
    .line 183
    const v2, 0x410547ae    # 8.33f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, -0x3f54cccd    # -5.35f

    .line 190
    .line 191
    .line 192
    const/high16 v18, -0x3f500000    # -5.5f

    .line 193
    .line 194
    const v13, -0x40851eb8    # -0.98f

    .line 195
    .line 196
    .line 197
    const v14, -0x3fe1eb85    # -2.47f

    .line 198
    .line 199
    .line 200
    const v15, -0x3fc51eb8    # -2.92f

    .line 201
    .line 202
    .line 203
    const v16, -0x3f7147ae    # -4.46f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, -0x40deb852    # -0.63f

    .line 210
    .line 211
    .line 212
    const v18, 0x3e6147ae    # 0.22f

    .line 213
    .line 214
    .line 215
    const v13, -0x41947ae1    # -0.23f

    .line 216
    .line 217
    .line 218
    const v14, -0x42333333    # -0.1f

    .line 219
    .line 220
    .line 221
    const/high16 v15, -0x41000000    # -0.5f

    .line 222
    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x40a6b852    # 5.21f

    .line 229
    .line 230
    .line 231
    const v2, -0x3fbf5c29    # -3.01f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x3ee147ae    # 0.44f

    .line 238
    .line 239
    .line 240
    const v18, 0x3f3d70a4    # 0.74f

    .line 241
    .line 242
    .line 243
    const v13, -0x41bd70a4    # -0.19f

    .line 244
    .line 245
    .line 246
    const v14, 0x3ea3d70a    # 0.32f

    .line 247
    .line 248
    .line 249
    const v15, 0x3d4ccccd    # 0.05f

    .line 250
    .line 251
    .line 252
    const v16, 0x3f3d70a4    # 0.74f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x410147ae    # 8.08f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, 0x3ef0a3d7    # 0.47f

    .line 265
    .line 266
    .line 267
    const v18, -0x40d47ae1    # -0.67f

    .line 268
    .line 269
    .line 270
    const v13, 0x3eb33333    # 0.35f

    .line 271
    .line 272
    .line 273
    const/4 v14, 0x0

    .line 274
    const v15, 0x3f19999a    # 0.6f

    .line 275
    .line 276
    .line 277
    const v16, -0x414ccccd    # -0.35f

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x41aaf5c3    # 21.37f

    .line 287
    .line 288
    .line 289
    const/high16 v2, 0x41200000    # 10.0f

    .line 290
    .line 291
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, -0x3f39999a    # -6.2f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, -0x4123d70a    # -0.43f

    .line 301
    .line 302
    .line 303
    const/high16 v18, 0x3f400000    # 0.75f

    .line 304
    .line 305
    const v13, -0x413d70a4    # -0.38f

    .line 306
    .line 307
    .line 308
    const v15, -0x40deb852    # -0.63f

    .line 309
    .line 310
    .line 311
    const v16, 0x3ed70a3d    # 0.42f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v0, 0x41980000    # 19.0f

    .line 318
    .line 319
    const v2, 0x41911eb8    # 18.14f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v17, 0x3f51eb85    # 0.82f

    .line 326
    .line 327
    .line 328
    const v18, 0x3da3d70a    # 0.08f

    .line 329
    .line 330
    .line 331
    const v13, 0x3e2e147b    # 0.17f

    .line 332
    .line 333
    .line 334
    const v14, 0x3e99999a    # 0.3f

    .line 335
    .line 336
    .line 337
    const v15, 0x3f19999a    # 0.6f

    .line 338
    .line 339
    .line 340
    const v16, 0x3eb33333    # 0.35f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v17, 0x40033333    # 2.05f

    .line 347
    .line 348
    .line 349
    const v18, -0x3f06b852    # -7.79f

    .line 350
    .line 351
    .line 352
    const v13, 0x3fdeb852    # 1.74f

    .line 353
    .line 354
    .line 355
    const v14, -0x3ff47ae1    # -2.18f

    .line 356
    .line 357
    .line 358
    const v15, 0x401eb852    # 2.48f

    .line 359
    .line 360
    .line 361
    const v16, -0x3f5f0a3d    # -5.03f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, -0x41000000    # -0.5f

    .line 368
    .line 369
    const v18, -0x4123d70a    # -0.43f

    .line 370
    .line 371
    .line 372
    const v13, -0x430a3d71    # -0.03f

    .line 373
    .line 374
    .line 375
    const/high16 v14, -0x41800000    # -0.25f

    .line 376
    .line 377
    const/high16 v15, -0x41800000    # -0.25f

    .line 378
    .line 379
    const v16, -0x4123d70a    # -0.43f

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x4085c28f    # 4.18f

    .line 389
    .line 390
    .line 391
    const v2, 0x40b947ae    # 5.79f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x3ffccccd    # -2.05f

    .line 398
    .line 399
    .line 400
    const v18, 0x40f947ae    # 7.79f

    .line 401
    .line 402
    .line 403
    const v13, -0x40228f5c    # -1.73f

    .line 404
    .line 405
    .line 406
    const v14, 0x400c28f6    # 2.19f

    .line 407
    .line 408
    .line 409
    const v15, -0x3fe147ae    # -2.48f

    .line 410
    .line 411
    .line 412
    const v16, 0x40a0a3d7    # 5.02f

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v17, 0x3f000000    # 0.5f

    .line 419
    .line 420
    const v18, 0x3ed70a3d    # 0.42f

    .line 421
    .line 422
    .line 423
    const v13, 0x3cf5c28f    # 0.03f

    .line 424
    .line 425
    .line 426
    const v14, 0x3e75c28f    # 0.24f

    .line 427
    .line 428
    .line 429
    const/high16 v15, 0x3e800000    # 0.25f

    .line 430
    .line 431
    const v16, 0x3ed70a3d    # 0.42f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, 0x40c66666    # 6.2f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x3edc28f6    # 0.43f

    .line 444
    .line 445
    .line 446
    const/high16 v18, -0x40c00000    # -0.75f

    .line 447
    .line 448
    const v13, 0x3ec28f5c    # 0.38f

    .line 449
    .line 450
    .line 451
    const/4 v14, 0x0

    .line 452
    const v15, 0x3f2147ae    # 0.63f

    .line 453
    .line 454
    .line 455
    const v16, -0x4128f5c3    # -0.42f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const/high16 v0, 0x40a00000    # 5.0f

    .line 462
    .line 463
    const v2, 0x40bbd70a    # 5.87f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, -0x40ae147b    # -0.82f

    .line 470
    .line 471
    .line 472
    const v18, -0x425c28f6    # -0.08f

    .line 473
    .line 474
    .line 475
    const v13, -0x41c7ae14    # -0.18f

    .line 476
    .line 477
    .line 478
    const v14, -0x41666666    # -0.3f

    .line 479
    .line 480
    .line 481
    const v15, -0x40e3d70a    # -0.61f

    .line 482
    .line 483
    .line 484
    const v16, -0x414ccccd    # -0.35f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x402ccccd    # 2.7f

    .line 494
    .line 495
    .line 496
    const v2, 0x417ab852    # 15.67f

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v17, 0x40ab3333    # 5.35f

    .line 503
    .line 504
    .line 505
    const/high16 v18, 0x40b00000    # 5.5f

    .line 506
    .line 507
    const v13, 0x3f7ae148    # 0.98f

    .line 508
    .line 509
    .line 510
    const v14, 0x401e147b    # 2.47f

    .line 511
    .line 512
    .line 513
    const v15, 0x403ae148    # 2.92f

    .line 514
    .line 515
    .line 516
    const v16, 0x408eb852    # 4.46f

    .line 517
    .line 518
    .line 519
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 520
    .line 521
    .line 522
    const v17, 0x3f2147ae    # 0.63f

    .line 523
    .line 524
    .line 525
    const v18, -0x419eb852    # -0.22f

    .line 526
    .line 527
    .line 528
    const v13, 0x3e6b851f    # 0.23f

    .line 529
    .line 530
    .line 531
    const v14, 0x3dcccccd    # 0.1f

    .line 532
    .line 533
    .line 534
    const/high16 v15, 0x3f000000    # 0.5f

    .line 535
    .line 536
    const/16 v16, 0x0

    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, -0x3f5947ae    # -5.21f

    .line 542
    .line 543
    .line 544
    const v2, 0x4040a3d7    # 3.01f

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v17, -0x4123d70a    # -0.43f

    .line 551
    .line 552
    .line 553
    const/high16 v18, -0x40c00000    # -0.75f

    .line 554
    .line 555
    const v13, 0x3e428f5c    # 0.19f

    .line 556
    .line 557
    .line 558
    const v14, -0x41570a3d    # -0.33f

    .line 559
    .line 560
    .line 561
    const v15, -0x42b33333    # -0.05f

    .line 562
    .line 563
    .line 564
    const/high16 v16, -0x40c00000    # -0.75f

    .line 565
    .line 566
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x404ae148    # 3.17f

    .line 570
    .line 571
    .line 572
    const v2, 0x416fd70a    # 14.99f

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, -0x410f5c29    # -0.47f

    .line 579
    .line 580
    .line 581
    const v18, 0x3f2e147b    # 0.68f

    .line 582
    .line 583
    .line 584
    const v13, -0x414ccccd    # -0.35f

    .line 585
    .line 586
    .line 587
    const v14, 0x3c23d70a    # 0.01f

    .line 588
    .line 589
    .line 590
    const v15, -0x40e66666    # -0.6f

    .line 591
    .line 592
    .line 593
    const v16, 0x3eb851ec    # 0.36f

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, 0x41287ae1    # 10.53f

    .line 603
    .line 604
    .line 605
    const v2, 0x41af1eb8    # 21.89f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, 0x40ee147b    # 7.44f

    .line 612
    .line 613
    .line 614
    const v18, -0x4011eb85    # -1.86f

    .line 615
    .line 616
    .line 617
    const v13, 0x4027ae14    # 2.62f

    .line 618
    .line 619
    .line 620
    const v14, 0x3ebd70a4    # 0.37f

    .line 621
    .line 622
    .line 623
    const v15, 0x40a9999a    # 5.3f

    .line 624
    .line 625
    .line 626
    const v16, -0x4170a3d7    # -0.28f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v17, 0x3e051eb8    # 0.13f

    .line 633
    .line 634
    .line 635
    const v18, -0x40d70a3d    # -0.66f

    .line 636
    .line 637
    .line 638
    const v13, 0x3e4ccccd    # 0.2f

    .line 639
    .line 640
    .line 641
    const v14, -0x41e66666    # -0.15f

    .line 642
    .line 643
    .line 644
    const v15, 0x3e851eb8    # 0.26f

    .line 645
    .line 646
    .line 647
    const v16, -0x411eb852    # -0.44f

    .line 648
    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, -0x3f58f5c3    # -5.22f

    .line 654
    .line 655
    .line 656
    const v2, -0x3fbf5c29    # -3.01f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v17, -0x40a147ae    # -0.87f

    .line 663
    .line 664
    .line 665
    const/16 v18, 0x0

    .line 666
    .line 667
    const v13, -0x41bd70a4    # -0.19f

    .line 668
    .line 669
    .line 670
    const v14, -0x41570a3d    # -0.33f

    .line 671
    .line 672
    .line 673
    const v15, -0x40d47ae1    # -0.67f

    .line 674
    .line 675
    .line 676
    const v16, -0x41570a3d    # -0.33f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v0, -0x3f7eb852    # -4.04f

    .line 683
    .line 684
    .line 685
    const v2, 0x40dfae14    # 6.99f

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const v17, 0x3eb33333    # 0.35f

    .line 692
    .line 693
    .line 694
    const/high16 v18, 0x3f400000    # 0.75f

    .line 695
    .line 696
    const v13, -0x41d1eb85    # -0.17f

    .line 697
    .line 698
    .line 699
    const v14, 0x3e99999a    # 0.3f

    .line 700
    .line 701
    .line 702
    const v15, 0x3c23d70a    # 0.01f

    .line 703
    .line 704
    .line 705
    const v16, 0x3f333333    # 0.7f

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    const/16 v16, 0x3800

    .line 719
    .line 720
    const/16 v17, 0x0

    .line 721
    .line 722
    const/high16 v6, 0x3f800000    # 1.0f

    .line 723
    .line 724
    const/high16 v8, 0x3f800000    # 1.0f

    .line 725
    .line 726
    const/4 v7, 0x0

    .line 727
    const/high16 v9, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/high16 v12, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/4 v13, 0x0

    .line 732
    const/4 v14, 0x0

    .line 733
    const/4 v15, 0x0

    .line 734
    const-string v4, ""

    .line 735
    .line 736
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    sput-object v0, Landroidx/compose/material/icons/rounded/CameraKt;->_camera:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 745
    .line 746
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    return-object v0
.end method

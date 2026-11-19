.class public final Landroidx/compose/material/icons/outlined/PsychologyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _psychology:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPsychology(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PsychologyKt;->_psychology:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Psychology"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x417d1eb8    # 15.82f

    .line 71
    .line 72
    .line 73
    const v6, 0x40e70a3d    # 7.22f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x3ecccccd    # 0.4f

    .line 80
    .line 81
    .line 82
    const/high16 v6, -0x40800000    # -1.0f

    .line 83
    .line 84
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v25, -0x40d47ae1    # -0.67f

    .line 88
    .line 89
    .line 90
    const v26, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v21, -0x41a8f5c3    # -0.21f

    .line 94
    .line 95
    .line 96
    const v22, -0x41dc28f6    # -0.16f

    .line 97
    .line 98
    .line 99
    const v23, -0x4123d70a    # -0.43f

    .line 100
    .line 101
    .line 102
    const v24, -0x416b851f    # -0.29f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, 0x40c570a4    # 6.17f

    .line 111
    .line 112
    .line 113
    const/high16 v6, 0x41600000    # 14.0f

    .line 114
    .line 115
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v25, 0x415ccccd    # 13.8f

    .line 119
    .line 120
    .line 121
    const/high16 v26, 0x40c00000    # 6.0f

    .line 122
    .line 123
    const v21, 0x415fae14    # 13.98f

    .line 124
    .line 125
    .line 126
    const v22, 0x40c23d71    # 6.07f

    .line 127
    .line 128
    .line 129
    const v23, 0x415e6666    # 13.9f

    .line 130
    .line 131
    .line 132
    const/high16 v24, 0x40c00000    # 6.0f

    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, -0x40333333    # -1.6f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v25, -0x41bd70a4    # -0.19f

    .line 144
    .line 145
    .line 146
    const v26, 0x3e2e147b    # 0.17f

    .line 147
    .line 148
    .line 149
    const v21, -0x42333333    # -0.1f

    .line 150
    .line 151
    .line 152
    const/16 v22, 0x0

    .line 153
    .line 154
    const v23, -0x41c7ae14    # -0.18f

    .line 155
    .line 156
    .line 157
    const v24, 0x3d8f5c29    # 0.07f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, -0x41e66666    # -0.15f

    .line 164
    .line 165
    .line 166
    const v6, 0x3f87ae14    # 1.06f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v25, -0x40d47ae1    # -0.67f

    .line 173
    .line 174
    .line 175
    const v26, 0x3ec7ae14    # 0.39f

    .line 176
    .line 177
    .line 178
    const v21, -0x418a3d71    # -0.24f

    .line 179
    .line 180
    .line 181
    const v22, 0x3dcccccd    # 0.1f

    .line 182
    .line 183
    .line 184
    const v23, -0x410f5c29    # -0.47f

    .line 185
    .line 186
    .line 187
    const v24, 0x3e6b851f    # 0.23f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v4, -0x41333333    # -0.4f

    .line 194
    .line 195
    .line 196
    const/high16 v6, -0x40800000    # -1.0f

    .line 197
    .line 198
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v25, -0x418a3d71    # -0.24f

    .line 202
    .line 203
    .line 204
    const v26, 0x3db851ec    # 0.09f

    .line 205
    .line 206
    .line 207
    const v21, -0x4247ae14    # -0.09f

    .line 208
    .line 209
    .line 210
    const v22, -0x430a3d71    # -0.03f

    .line 211
    .line 212
    .line 213
    const v23, -0x41b33333    # -0.2f

    .line 214
    .line 215
    .line 216
    const/16 v24, 0x0

    .line 217
    .line 218
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, 0x3fb0a3d7    # 1.38f

    .line 222
    .line 223
    .line 224
    const v6, -0x40b33333    # -0.8f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v25, 0x3d4ccccd    # 0.05f

    .line 231
    .line 232
    .line 233
    const v26, 0x3e851eb8    # 0.26f

    .line 234
    .line 235
    .line 236
    const v21, -0x42b33333    # -0.05f

    .line 237
    .line 238
    .line 239
    const v22, 0x3db851ec    # 0.09f

    .line 240
    .line 241
    .line 242
    const v23, -0x430a3d71    # -0.03f

    .line 243
    .line 244
    .line 245
    const v24, 0x3e4ccccd    # 0.2f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v4, 0x3f28f5c3    # 0.66f

    .line 252
    .line 253
    .line 254
    const v6, 0x3f59999a    # 0.85f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v25, 0x41200000    # 10.0f

    .line 261
    .line 262
    const/high16 v26, 0x41200000    # 10.0f

    .line 263
    .line 264
    const v21, 0x412051ec    # 10.02f

    .line 265
    .line 266
    .line 267
    const v22, 0x411bae14    # 9.73f

    .line 268
    .line 269
    .line 270
    const/high16 v23, 0x41200000    # 10.0f

    .line 271
    .line 272
    const v24, 0x411deb85    # 9.87f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v25, 0x3cf5c28f    # 0.03f

    .line 279
    .line 280
    .line 281
    const v26, 0x3ec7ae14    # 0.39f

    .line 282
    .line 283
    .line 284
    const/16 v21, 0x0

    .line 285
    .line 286
    const v22, 0x3e051eb8    # 0.13f

    .line 287
    .line 288
    .line 289
    const v23, 0x3c23d70a    # 0.01f

    .line 290
    .line 291
    .line 292
    const v24, 0x3e851eb8    # 0.26f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, -0x40a8f5c3    # -0.84f

    .line 299
    .line 300
    .line 301
    const v6, 0x3f28f5c3    # 0.66f

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v25, -0x42b33333    # -0.05f

    .line 308
    .line 309
    .line 310
    const/high16 v26, 0x3e800000    # 0.25f

    .line 311
    .line 312
    const v21, -0x425c28f6    # -0.08f

    .line 313
    .line 314
    .line 315
    const v22, 0x3d75c28f    # 0.06f

    .line 316
    .line 317
    .line 318
    const v23, -0x42333333    # -0.1f

    .line 319
    .line 320
    .line 321
    const v24, 0x3e2e147b    # 0.17f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, 0x3fb1eb85    # 1.39f

    .line 328
    .line 329
    .line 330
    const v6, 0x3f4ccccd    # 0.8f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v25, 0x3e800000    # 0.25f

    .line 337
    .line 338
    const v26, 0x3db851ec    # 0.09f

    .line 339
    .line 340
    .line 341
    const v21, 0x3d4ccccd    # 0.05f

    .line 342
    .line 343
    .line 344
    const v22, 0x3db851ec    # 0.09f

    .line 345
    .line 346
    .line 347
    const v23, 0x3e19999a    # 0.15f

    .line 348
    .line 349
    .line 350
    const v24, 0x3df5c28f    # 0.12f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v4, 0x3f7d70a4    # 0.99f

    .line 357
    .line 358
    .line 359
    const v6, -0x41333333    # -0.4f

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v25, 0x3f2e147b    # 0.68f

    .line 366
    .line 367
    .line 368
    const v26, 0x3ec7ae14    # 0.39f

    .line 369
    .line 370
    .line 371
    const v21, 0x3e570a3d    # 0.21f

    .line 372
    .line 373
    .line 374
    const v22, 0x3e23d70a    # 0.16f

    .line 375
    .line 376
    .line 377
    const v23, 0x3edc28f6    # 0.43f

    .line 378
    .line 379
    .line 380
    const v24, 0x3e947ae1    # 0.29f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const/high16 v4, 0x41400000    # 12.0f

    .line 387
    .line 388
    const v6, 0x415d47ae    # 13.83f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v25, 0x3e4ccccd    # 0.2f

    .line 395
    .line 396
    .line 397
    const v26, 0x3e2e147b    # 0.17f

    .line 398
    .line 399
    .line 400
    const v21, 0x3ca3d70a    # 0.02f

    .line 401
    .line 402
    .line 403
    const v22, 0x3dcccccd    # 0.1f

    .line 404
    .line 405
    .line 406
    const v23, 0x3dcccccd    # 0.1f

    .line 407
    .line 408
    .line 409
    const v24, 0x3e2e147b    # 0.17f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v4, 0x3fcccccd    # 1.6f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v26, -0x41d1eb85    # -0.17f

    .line 422
    .line 423
    .line 424
    const v21, 0x3dcccccd    # 0.1f

    .line 425
    .line 426
    .line 427
    const/16 v22, 0x0

    .line 428
    .line 429
    const v23, 0x3e3851ec    # 0.18f

    .line 430
    .line 431
    .line 432
    const v24, -0x4270a3d7    # -0.07f

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x3e19999a    # 0.15f

    .line 439
    .line 440
    .line 441
    const v6, -0x407851ec    # -1.06f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v25, 0x3f2b851f    # 0.67f

    .line 448
    .line 449
    .line 450
    const v26, -0x413851ec    # -0.39f

    .line 451
    .line 452
    .line 453
    const v21, 0x3e75c28f    # 0.24f

    .line 454
    .line 455
    .line 456
    const v22, -0x42333333    # -0.1f

    .line 457
    .line 458
    .line 459
    const v23, 0x3ef0a3d7    # 0.47f

    .line 460
    .line 461
    .line 462
    const v24, -0x41947ae1    # -0.23f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v4, 0x3f7d70a4    # 0.99f

    .line 469
    .line 470
    .line 471
    const v6, 0x3ecccccd    # 0.4f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v25, 0x3e75c28f    # 0.24f

    .line 478
    .line 479
    .line 480
    const v26, -0x4247ae14    # -0.09f

    .line 481
    .line 482
    .line 483
    const v21, 0x3db851ec    # 0.09f

    .line 484
    .line 485
    .line 486
    const v22, 0x3d23d70a    # 0.04f

    .line 487
    .line 488
    .line 489
    const v23, 0x3e4ccccd    # 0.2f

    .line 490
    .line 491
    .line 492
    const/16 v24, 0x0

    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v4, -0x404e147b    # -1.39f

    .line 498
    .line 499
    .line 500
    const v6, 0x3f4ccccd    # 0.8f

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v25, -0x42b33333    # -0.05f

    .line 507
    .line 508
    .line 509
    const/high16 v26, -0x41800000    # -0.25f

    .line 510
    .line 511
    const v21, 0x3d4ccccd    # 0.05f

    .line 512
    .line 513
    .line 514
    const v22, -0x4247ae14    # -0.09f

    .line 515
    .line 516
    .line 517
    const v23, 0x3cf5c28f    # 0.03f

    .line 518
    .line 519
    .line 520
    const v24, -0x41bd70a4    # -0.19f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v4, -0x40ab851f    # -0.83f

    .line 527
    .line 528
    .line 529
    const v6, -0x40d70a3d    # -0.66f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v25, 0x41800000    # 16.0f

    .line 536
    .line 537
    const/high16 v26, 0x41200000    # 10.0f

    .line 538
    .line 539
    const v21, 0x417fd70a    # 15.99f

    .line 540
    .line 541
    .line 542
    const v22, 0x412428f6    # 10.26f

    .line 543
    .line 544
    .line 545
    const/high16 v23, 0x41800000    # 16.0f

    .line 546
    .line 547
    const v24, 0x4122147b    # 10.13f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v25, -0x430a3d71    # -0.03f

    .line 554
    .line 555
    .line 556
    const v26, -0x413851ec    # -0.39f

    .line 557
    .line 558
    .line 559
    const/16 v21, 0x0

    .line 560
    .line 561
    const v22, -0x41f0a3d7    # -0.14f

    .line 562
    .line 563
    .line 564
    const v23, -0x43dc28f6    # -0.01f

    .line 565
    .line 566
    .line 567
    const v24, -0x4175c28f    # -0.27f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v4, -0x40d70a3d    # -0.66f

    .line 574
    .line 575
    .line 576
    const v6, 0x3f59999a    # 0.85f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v25, 0x3d4ccccd    # 0.05f

    .line 583
    .line 584
    .line 585
    const v26, -0x417ae148    # -0.26f

    .line 586
    .line 587
    .line 588
    const v21, 0x3da3d70a    # 0.08f

    .line 589
    .line 590
    .line 591
    const v22, -0x428a3d71    # -0.06f

    .line 592
    .line 593
    .line 594
    const v23, 0x3dcccccd    # 0.1f

    .line 595
    .line 596
    .line 597
    const v24, -0x41d1eb85    # -0.17f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v4, -0x404f5c29    # -1.38f

    .line 604
    .line 605
    .line 606
    const v6, -0x40b33333    # -0.8f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v25, 0x417d1eb8    # 15.82f

    .line 613
    .line 614
    .line 615
    const v26, 0x40e70a3d    # 7.22f

    .line 616
    .line 617
    .line 618
    const v21, 0x418028f6    # 16.02f

    .line 619
    .line 620
    .line 621
    const v22, 0x40e70a3d    # 7.22f

    .line 622
    .line 623
    .line 624
    const v23, 0x417e8f5c    # 15.91f

    .line 625
    .line 626
    .line 627
    const v24, 0x40e6147b    # 7.19f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v4, 0x4136e148    # 11.43f

    .line 637
    .line 638
    .line 639
    const/high16 v6, 0x41500000    # 13.0f

    .line 640
    .line 641
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v25, -0x4048f5c3    # -1.43f

    .line 645
    .line 646
    .line 647
    const v26, -0x4048f5c3    # -1.43f

    .line 648
    .line 649
    .line 650
    const v21, -0x40b5c28f    # -0.79f

    .line 651
    .line 652
    .line 653
    const/16 v22, 0x0

    .line 654
    .line 655
    const v23, -0x4048f5c3    # -1.43f

    .line 656
    .line 657
    .line 658
    const v24, -0x40dc28f6    # -0.64f

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v4, 0x41435c29    # 12.21f

    .line 665
    .line 666
    .line 667
    const v6, 0x41091eb8    # 8.57f

    .line 668
    .line 669
    .line 670
    const/high16 v7, 0x41500000    # 13.0f

    .line 671
    .line 672
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const v4, 0x3f23d70a    # 0.64f

    .line 676
    .line 677
    .line 678
    const v6, 0x3fb70a3d    # 1.43f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v4, 0x415ca3d7    # 13.79f

    .line 685
    .line 686
    .line 687
    const v6, 0x4136e148    # 11.43f

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    const/16 v16, 0x3800

    .line 701
    .line 702
    const/16 v17, 0x0

    .line 703
    .line 704
    const/high16 v6, 0x3f800000    # 1.0f

    .line 705
    .line 706
    const/high16 v8, 0x3f800000    # 1.0f

    .line 707
    .line 708
    const/4 v7, 0x0

    .line 709
    const/high16 v9, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/high16 v12, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/4 v13, 0x0

    .line 714
    const/4 v14, 0x0

    .line 715
    const/4 v15, 0x0

    .line 716
    const-string v4, ""

    .line 717
    .line 718
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 719
    .line 720
    .line 721
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 722
    .line 723
    .line 724
    move-result v3

    .line 725
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 726
    .line 727
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 728
    .line 729
    .line 730
    move-result-wide v6

    .line 731
    const/4 v0, 0x0

    .line 732
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 736
    .line 737
    .line 738
    move-result v10

    .line 739
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 740
    .line 741
    .line 742
    move-result v11

    .line 743
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 746
    .line 747
    .line 748
    const v0, 0x419f851f    # 19.94f

    .line 749
    .line 750
    .line 751
    const v2, 0x4110f5c3    # 9.06f

    .line 752
    .line 753
    .line 754
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const v17, -0x3f2f0a3d    # -6.53f

    .line 758
    .line 759
    .line 760
    const v18, -0x3f3e6666    # -6.05f

    .line 761
    .line 762
    .line 763
    const v13, -0x4123d70a    # -0.43f

    .line 764
    .line 765
    .line 766
    const v14, -0x3faeb852    # -3.27f

    .line 767
    .line 768
    .line 769
    const v15, -0x3fb147ae    # -3.23f

    .line 770
    .line 771
    .line 772
    const v16, -0x3f447ae1    # -5.86f

    .line 773
    .line 774
    .line 775
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const/high16 v17, 0x41500000    # 13.0f

    .line 779
    .line 780
    const/high16 v18, 0x40400000    # 3.0f

    .line 781
    .line 782
    const v13, 0x415451ec    # 13.27f

    .line 783
    .line 784
    .line 785
    const/high16 v14, 0x40400000    # 3.0f

    .line 786
    .line 787
    const v15, 0x41523d71    # 13.14f

    .line 788
    .line 789
    .line 790
    const/high16 v16, 0x40400000    # 3.0f

    .line 791
    .line 792
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const v17, 0x40c28f5c    # 6.08f

    .line 796
    .line 797
    .line 798
    const/high16 v18, 0x41100000    # 9.0f

    .line 799
    .line 800
    const v13, 0x4117851f    # 9.47f

    .line 801
    .line 802
    .line 803
    const v15, 0x40d23d71    # 6.57f

    .line 804
    .line 805
    .line 806
    const v16, 0x40b3851f    # 5.61f

    .line 807
    .line 808
    .line 809
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const v0, -0x4008f5c3    # -1.93f

    .line 813
    .line 814
    .line 815
    const v2, 0x405eb852    # 3.48f

    .line 816
    .line 817
    .line 818
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const/high16 v17, 0x40a00000    # 5.0f

    .line 822
    .line 823
    const/high16 v18, 0x41600000    # 14.0f

    .line 824
    .line 825
    const v13, 0x406f5c29    # 3.74f

    .line 826
    .line 827
    .line 828
    const v14, 0x41523d71    # 13.14f

    .line 829
    .line 830
    .line 831
    const v15, 0x40870a3d    # 4.22f

    .line 832
    .line 833
    .line 834
    const/high16 v16, 0x41600000    # 14.0f

    .line 835
    .line 836
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const/high16 v0, 0x3f800000    # 1.0f

    .line 840
    .line 841
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    .line 844
    const/high16 v0, 0x40000000    # 2.0f

    .line 845
    .line 846
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    const/high16 v17, 0x40000000    # 2.0f

    .line 850
    .line 851
    const/high16 v18, 0x40000000    # 2.0f

    .line 852
    .line 853
    const/4 v13, 0x0

    .line 854
    const v14, 0x3f8ccccd    # 1.1f

    .line 855
    .line 856
    .line 857
    const v15, 0x3f666666    # 0.9f

    .line 858
    .line 859
    .line 860
    const/high16 v16, 0x40000000    # 2.0f

    .line 861
    .line 862
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    .line 865
    const/high16 v0, 0x3f800000    # 1.0f

    .line 866
    .line 867
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const/high16 v0, 0x40400000    # 3.0f

    .line 871
    .line 872
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const/high16 v0, 0x40e00000    # 7.0f

    .line 876
    .line 877
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v0, -0x3f6a3d71    # -4.68f

    .line 881
    .line 882
    .line 883
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const v17, 0x419f851f    # 19.94f

    .line 887
    .line 888
    .line 889
    const v18, 0x4110f5c3    # 9.06f

    .line 890
    .line 891
    .line 892
    const v13, 0x4194f5c3    # 18.62f

    .line 893
    .line 894
    .line 895
    const v14, 0x41711eb8    # 15.07f

    .line 896
    .line 897
    .line 898
    const v15, 0x41a2cccd    # 20.35f

    .line 899
    .line 900
    .line 901
    const v16, 0x4143d70a    # 12.24f

    .line 902
    .line 903
    .line 904
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const v0, 0x416e3d71    # 14.89f

    .line 911
    .line 912
    .line 913
    const v2, 0x416a147b    # 14.63f

    .line 914
    .line 915
    .line 916
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    const v0, 0x4170cccd    # 15.05f

    .line 920
    .line 921
    .line 922
    const/high16 v2, 0x41600000    # 14.0f

    .line 923
    .line 924
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 925
    .line 926
    .line 927
    const/high16 v0, 0x41980000    # 19.0f

    .line 928
    .line 929
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 933
    .line 934
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 935
    .line 936
    .line 937
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 938
    .line 939
    .line 940
    const/high16 v0, 0x41000000    # 8.0f

    .line 941
    .line 942
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const/high16 v0, -0x3f800000    # -4.0f

    .line 946
    .line 947
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const v0, 0x40d66666    # 6.7f

    .line 951
    .line 952
    .line 953
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v0, 0x3faa3d71    # 1.33f

    .line 957
    .line 958
    .line 959
    const v2, -0x3feae148    # -2.33f

    .line 960
    .line 961
    .line 962
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const/high16 v17, 0x41500000    # 13.0f

    .line 966
    .line 967
    const/high16 v18, 0x40a00000    # 5.0f

    .line 968
    .line 969
    const v13, 0x41035c29    # 8.21f

    .line 970
    .line 971
    .line 972
    const v14, 0x40e1eb85    # 7.06f

    .line 973
    .line 974
    .line 975
    const v15, 0x4125999a    # 10.35f

    .line 976
    .line 977
    .line 978
    const/high16 v16, 0x40a00000    # 5.0f

    .line 979
    .line 980
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const/high16 v17, 0x40a00000    # 5.0f

    .line 984
    .line 985
    const v13, 0x4030a3d7    # 2.76f

    .line 986
    .line 987
    .line 988
    const/4 v14, 0x0

    .line 989
    const/high16 v15, 0x40a00000    # 5.0f

    .line 990
    .line 991
    const v16, 0x400f5c29    # 2.24f

    .line 992
    .line 993
    .line 994
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 995
    .line 996
    .line 997
    const v17, 0x416e3d71    # 14.89f

    .line 998
    .line 999
    .line 1000
    const v18, 0x416a147b    # 14.63f

    .line 1001
    .line 1002
    .line 1003
    const/high16 v13, 0x41900000    # 18.0f

    .line 1004
    .line 1005
    const v14, 0x414170a4    # 12.09f

    .line 1006
    .line 1007
    .line 1008
    const v15, 0x4185ae14    # 16.71f

    .line 1009
    .line 1010
    .line 1011
    const v16, 0x415e147b    # 13.88f

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v2

    .line 1024
    const/16 v16, 0x3800

    .line 1025
    .line 1026
    const/16 v17, 0x0

    .line 1027
    .line 1028
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1029
    .line 1030
    const/4 v7, 0x0

    .line 1031
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1032
    .line 1033
    const/4 v13, 0x0

    .line 1034
    const/4 v14, 0x0

    .line 1035
    const/4 v15, 0x0

    .line 1036
    const-string v4, ""

    .line 1037
    .line 1038
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v0

    .line 1042
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    sput-object v0, Landroidx/compose/material/icons/outlined/PsychologyKt;->_psychology:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1047
    .line 1048
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1049
    .line 1050
    .line 1051
    return-object v0
.end method

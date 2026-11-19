.class public final Landroidx/compose/material/icons/rounded/MediationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _mediation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMediation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MediationKt;->_mediation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Mediation"

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
    const/high16 v0, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v2, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, -0x3f5e147b    # -5.06f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x3f61eb85    # -4.94f

    .line 84
    .line 85
    .line 86
    const v18, 0x40e1999a    # 7.05f

    .line 87
    .line 88
    .line 89
    const v13, -0x4151eb85    # -0.34f

    .line 90
    .line 91
    .line 92
    const v14, 0x40466666    # 3.1f

    .line 93
    .line 94
    .line 95
    const v15, -0x3fef5c29    # -2.26f

    .line 96
    .line 97
    .line 98
    const v16, 0x40b70a3d    # 5.72f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v17, -0x3f9ccccd    # -3.55f

    .line 105
    .line 106
    .line 107
    const v18, 0x4039999a    # 2.9f

    .line 108
    .line 109
    .line 110
    const v13, -0x430a3d71    # -0.03f

    .line 111
    .line 112
    .line 113
    const v14, 0x3fe7ae14    # 1.81f

    .line 114
    .line 115
    .line 116
    const v15, -0x402b851f    # -1.66f

    .line 117
    .line 118
    .line 119
    const v16, 0x404eb852    # 3.23f

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, -0x3fe66666    # -2.4f

    .line 126
    .line 127
    .line 128
    const v18, -0x3fe66666    # -2.4f

    .line 129
    .line 130
    .line 131
    const v13, -0x40666666    # -1.2f

    .line 132
    .line 133
    .line 134
    const v14, -0x41a8f5c3    # -0.21f

    .line 135
    .line 136
    .line 137
    const v15, -0x3ff3d70a    # -2.19f

    .line 138
    .line 139
    .line 140
    const v16, -0x40666666    # -1.2f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x40a00000    # 5.0f

    .line 147
    .line 148
    const/high16 v18, 0x41880000    # 17.0f

    .line 149
    .line 150
    const v13, 0x3fdae148    # 1.71f

    .line 151
    .line 152
    .line 153
    const v14, 0x41953333    # 18.65f

    .line 154
    .line 155
    .line 156
    const v15, 0x404a3d71    # 3.16f

    .line 157
    .line 158
    .line 159
    const/high16 v16, 0x41880000    # 17.0f

    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v17, 0x40151eb8    # 2.33f

    .line 165
    .line 166
    .line 167
    const v18, 0x3f91eb85    # 1.14f

    .line 168
    .line 169
    .line 170
    const v13, 0x3f733333    # 0.95f

    .line 171
    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    const v15, 0x3fe3d70a    # 1.78f

    .line 175
    .line 176
    .line 177
    const v16, 0x3ee66666    # 0.45f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x40651eb8    # 3.58f

    .line 184
    .line 185
    .line 186
    const v18, -0x3f5b851f    # -5.14f

    .line 187
    .line 188
    .line 189
    const v13, 0x3ff33333    # 1.9f

    .line 190
    .line 191
    .line 192
    const v14, -0x407c28f6    # -1.03f

    .line 193
    .line 194
    .line 195
    const v15, 0x4050a3d7    # 3.26f

    .line 196
    .line 197
    .line 198
    const v16, -0x3fc5c28f    # -2.91f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, -0x3fb9999a    # -3.1f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, -0x3fa51eb8    # -3.42f

    .line 211
    .line 212
    .line 213
    const v18, 0x3ff851ec    # 1.94f

    .line 214
    .line 215
    .line 216
    const v13, -0x410a3d71    # -0.48f

    .line 217
    .line 218
    .line 219
    const v14, 0x3fab851f    # 1.34f

    .line 220
    .line 221
    .line 222
    const v15, -0x4011eb85    # -1.86f

    .line 223
    .line 224
    .line 225
    const v16, 0x400f5c29    # 2.24f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, -0x3fe9999a    # -2.35f

    .line 232
    .line 233
    .line 234
    const v18, -0x3fe7ae14    # -2.38f

    .line 235
    .line 236
    .line 237
    const v13, -0x4068f5c3    # -1.18f

    .line 238
    .line 239
    .line 240
    const v14, -0x41947ae1    # -0.23f

    .line 241
    .line 242
    .line 243
    const v15, -0x3ff7ae14    # -2.13f

    .line 244
    .line 245
    .line 246
    const v16, -0x40666666    # -1.2f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v17, 0x40a00000    # 5.0f

    .line 253
    .line 254
    const/high16 v18, 0x41100000    # 9.0f

    .line 255
    .line 256
    const v13, 0x3fd9999a    # 1.7f

    .line 257
    .line 258
    .line 259
    const v14, 0x412a8f5c    # 10.66f

    .line 260
    .line 261
    .line 262
    const v15, 0x404a3d71    # 3.16f

    .line 263
    .line 264
    .line 265
    const/high16 v16, 0x41100000    # 9.0f

    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x40347ae1    # 2.82f

    .line 271
    .line 272
    .line 273
    const/high16 v18, 0x40000000    # 2.0f

    .line 274
    .line 275
    const v13, 0x3fa66666    # 1.3f

    .line 276
    .line 277
    .line 278
    const/4 v14, 0x0

    .line 279
    const v15, 0x4019999a    # 2.4f

    .line 280
    .line 281
    .line 282
    const v16, 0x3f570a3d    # 0.84f

    .line 283
    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x40466666    # 3.1f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x40ea8f5c    # 7.33f

    .line 295
    .line 296
    .line 297
    const v18, 0x40bb851f    # 5.86f

    .line 298
    .line 299
    .line 300
    const v13, 0x4129999a    # 10.6f

    .line 301
    .line 302
    .line 303
    const v14, 0x410c51ec    # 8.77f

    .line 304
    .line 305
    .line 306
    const v15, 0x4113ae14    # 9.23f

    .line 307
    .line 308
    .line 309
    const v16, 0x40dccccd    # 6.9f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x3fcc28f6    # -2.81f

    .line 316
    .line 317
    .line 318
    const v18, 0x3f8ccccd    # 1.1f

    .line 319
    .line 320
    .line 321
    const v13, -0x40dc28f6    # -0.64f

    .line 322
    .line 323
    .line 324
    const v14, 0x3f4ccccd    # 0.8f

    .line 325
    .line 326
    .line 327
    const v15, -0x402a3d71    # -1.67f

    .line 328
    .line 329
    .line 330
    const v16, 0x3fa3d70a    # 1.28f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x40033333    # 2.05f

    .line 337
    .line 338
    .line 339
    const v18, 0x409147ae    # 4.54f

    .line 340
    .line 341
    .line 342
    const v13, 0x40528f5c    # 3.29f

    .line 343
    .line 344
    .line 345
    const v14, 0x40d8a3d7    # 6.77f

    .line 346
    .line 347
    .line 348
    const v15, 0x4010a3d7    # 2.26f

    .line 349
    .line 350
    .line 351
    const v16, 0x40b8a3d7    # 5.77f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v17, 0x40a00000    # 5.0f

    .line 358
    .line 359
    const/high16 v18, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const v13, 0x3fdc28f6    # 1.72f

    .line 362
    .line 363
    .line 364
    const v14, 0x4029999a    # 2.65f

    .line 365
    .line 366
    .line 367
    const v15, 0x404ae148    # 3.17f

    .line 368
    .line 369
    .line 370
    const/high16 v16, 0x3f800000    # 1.0f

    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, 0x403f5c29    # 2.99f

    .line 376
    .line 377
    .line 378
    const v18, 0x403ccccd    # 2.95f

    .line 379
    .line 380
    .line 381
    const v13, 0x3fd1eb85    # 1.64f

    .line 382
    .line 383
    .line 384
    const/4 v14, 0x0

    .line 385
    const v15, 0x403d70a4    # 2.96f

    .line 386
    .line 387
    .line 388
    const v16, 0x3fa7ae14    # 1.31f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, 0x409e147b    # 4.94f

    .line 395
    .line 396
    .line 397
    const v18, 0x40e1999a    # 7.05f

    .line 398
    .line 399
    .line 400
    const v13, 0x402b851f    # 2.68f

    .line 401
    .line 402
    .line 403
    const v14, 0x3faa3d71    # 1.33f

    .line 404
    .line 405
    .line 406
    const v15, 0x40933333    # 4.6f

    .line 407
    .line 408
    .line 409
    const v16, 0x407ccccd    # 3.95f

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41900000    # 18.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x41135c29    # 9.21f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v17, 0x3f59999a    # 0.85f

    .line 427
    .line 428
    .line 429
    const v18, -0x414ccccd    # -0.35f

    .line 430
    .line 431
    .line 432
    const/4 v13, 0x0

    .line 433
    const v14, -0x4119999a    # -0.45f

    .line 434
    .line 435
    .line 436
    const v15, 0x3f0a3d71    # 0.54f

    .line 437
    .line 438
    .line 439
    const v16, -0x40d47ae1    # -0.67f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x40328f5c    # 2.79f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/16 v17, 0x0

    .line 452
    .line 453
    const v18, 0x3f35c28f    # 0.71f

    .line 454
    .line 455
    .line 456
    const v13, 0x3e4ccccd    # 0.2f

    .line 457
    .line 458
    .line 459
    const v14, 0x3e4ccccd    # 0.2f

    .line 460
    .line 461
    .line 462
    const v15, 0x3e4ccccd    # 0.2f

    .line 463
    .line 464
    .line 465
    const v16, 0x3f028f5c    # 0.51f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, -0x3fcd70a4    # -2.79f

    .line 472
    .line 473
    .line 474
    const v2, 0x40328f5c    # 2.79f

    .line 475
    .line 476
    .line 477
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v17, 0x41900000    # 18.0f

    .line 481
    .line 482
    const v18, 0x416ca3d7    # 14.79f

    .line 483
    .line 484
    .line 485
    const v13, 0x419451ec    # 18.54f

    .line 486
    .line 487
    .line 488
    const v14, 0x41775c29    # 15.46f

    .line 489
    .line 490
    .line 491
    const/high16 v15, 0x41900000    # 18.0f

    .line 492
    .line 493
    const v16, 0x4173d70a    # 15.24f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v0, 0x41500000    # 13.0f

    .line 500
    .line 501
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    const/16 v16, 0x3800

    .line 512
    .line 513
    const/16 v17, 0x0

    .line 514
    .line 515
    const/high16 v6, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/high16 v8, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/4 v7, 0x0

    .line 520
    const/high16 v9, 0x3f800000    # 1.0f

    .line 521
    .line 522
    const/high16 v12, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/4 v13, 0x0

    .line 525
    const/4 v14, 0x0

    .line 526
    const/4 v15, 0x0

    .line 527
    const-string v4, ""

    .line 528
    .line 529
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    sput-object v0, Landroidx/compose/material/icons/rounded/MediationKt;->_mediation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 538
    .line 539
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    return-object v0
.end method

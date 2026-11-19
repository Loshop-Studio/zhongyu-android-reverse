.class public final Landroidx/compose/material/icons/outlined/PhoneMissedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhoneMissed(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PhoneMissedKt;->_phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PhoneMissed"

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
    const v0, 0x41bdae14    # 23.71f

    .line 71
    .line 72
    .line 73
    const v2, 0x41855c29    # 16.67f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v18, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v13, 0x41a547ae    # 20.66f

    .line 84
    .line 85
    .line 86
    const v14, 0x415c7ae1    # 13.78f

    .line 87
    .line 88
    .line 89
    const v15, 0x418451ec    # 16.54f

    .line 90
    .line 91
    .line 92
    const/high16 v16, 0x41400000    # 12.0f

    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v0, 0x415c7ae1    # 13.78f

    .line 98
    .line 99
    .line 100
    const v2, 0x3e947ae1    # 0.29f

    .line 101
    .line 102
    .line 103
    const v4, 0x41855c29    # 16.67f

    .line 104
    .line 105
    .line 106
    const v6, 0x4055c28f    # 3.34f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, -0x416b851f    # -0.29f

    .line 113
    .line 114
    .line 115
    const v18, 0x3f35c28f    # 0.71f

    .line 116
    .line 117
    .line 118
    const v13, -0x41c7ae14    # -0.18f

    .line 119
    .line 120
    .line 121
    const v14, 0x3e3851ec    # 0.18f

    .line 122
    .line 123
    .line 124
    const v15, -0x416b851f    # -0.29f

    .line 125
    .line 126
    .line 127
    const v16, 0x3edc28f6    # 0.43f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, 0x3e947ae1    # 0.29f

    .line 134
    .line 135
    .line 136
    const/4 v13, 0x0

    .line 137
    const v14, 0x3e8f5c29    # 0.28f

    .line 138
    .line 139
    .line 140
    const v15, 0x3de147ae    # 0.11f

    .line 141
    .line 142
    .line 143
    const v16, 0x3f07ae14    # 0.53f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x401eb852    # 2.48f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, 0x3f35c28f    # 0.71f

    .line 156
    .line 157
    .line 158
    const v18, 0x3e947ae1    # 0.29f

    .line 159
    .line 160
    .line 161
    const v13, 0x3e3851ec    # 0.18f

    .line 162
    .line 163
    .line 164
    const v14, 0x3e3851ec    # 0.18f

    .line 165
    .line 166
    .line 167
    const v15, 0x3edc28f6    # 0.43f

    .line 168
    .line 169
    .line 170
    const v16, 0x3e947ae1    # 0.29f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v17, 0x3f333333    # 0.7f

    .line 177
    .line 178
    .line 179
    const v18, -0x4170a3d7    # -0.28f

    .line 180
    .line 181
    .line 182
    const v13, 0x3e8a3d71    # 0.27f

    .line 183
    .line 184
    .line 185
    const/4 v14, 0x0

    .line 186
    const v15, 0x3f051eb8    # 0.52f

    .line 187
    .line 188
    .line 189
    const v16, -0x421eb852    # -0.11f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const v17, 0x402a3d71    # 2.66f

    .line 196
    .line 197
    .line 198
    const v18, -0x40133333    # -1.85f

    .line 199
    .line 200
    .line 201
    const v13, 0x3f4a3d71    # 0.79f

    .line 202
    .line 203
    .line 204
    const v14, -0x40c28f5c    # -0.74f

    .line 205
    .line 206
    .line 207
    const v15, 0x3fd851ec    # 1.69f

    .line 208
    .line 209
    .line 210
    const v16, -0x4051eb85    # -1.36f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x3f0f5c29    # 0.56f

    .line 217
    .line 218
    .line 219
    const v18, -0x4099999a    # -0.9f

    .line 220
    .line 221
    .line 222
    const v13, 0x3ea8f5c3    # 0.33f

    .line 223
    .line 224
    .line 225
    const v14, -0x41dc28f6    # -0.16f

    .line 226
    .line 227
    .line 228
    const v15, 0x3f0f5c29    # 0.56f

    .line 229
    .line 230
    .line 231
    const/high16 v16, -0x41000000    # -0.5f

    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v0, -0x3fb9999a    # -3.1f

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, 0x40933333    # 4.6f

    .line 243
    .line 244
    .line 245
    const v18, -0x40c51eb8    # -0.73f

    .line 246
    .line 247
    .line 248
    const v13, 0x3fb9999a    # 1.45f

    .line 249
    .line 250
    .line 251
    const v14, -0x410a3d71    # -0.48f

    .line 252
    .line 253
    .line 254
    const/high16 v15, 0x40400000    # 3.0f

    .line 255
    .line 256
    const v16, -0x40c51eb8    # -0.73f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x40933333    # 4.6f

    .line 263
    .line 264
    .line 265
    const v2, 0x3f3851ec    # 0.72f

    .line 266
    .line 267
    .line 268
    const v4, 0x4049999a    # 3.15f

    .line 269
    .line 270
    .line 271
    const/high16 v6, 0x3e800000    # 0.25f

    .line 272
    .line 273
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x40466666    # 3.1f

    .line 277
    .line 278
    .line 279
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3f0f5c29    # 0.56f

    .line 283
    .line 284
    .line 285
    const v18, 0x3f666666    # 0.9f

    .line 286
    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v14, 0x3ec7ae14    # 0.39f

    .line 290
    .line 291
    .line 292
    const v15, 0x3e6b851f    # 0.23f

    .line 293
    .line 294
    .line 295
    const v16, 0x3f3d70a4    # 0.74f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, 0x402ae148    # 2.67f

    .line 302
    .line 303
    .line 304
    const v18, 0x3feccccd    # 1.85f

    .line 305
    .line 306
    .line 307
    const v13, 0x3f7ae148    # 0.98f

    .line 308
    .line 309
    .line 310
    const v14, 0x3efae148    # 0.49f

    .line 311
    .line 312
    .line 313
    const v15, 0x3fef5c29    # 1.87f

    .line 314
    .line 315
    .line 316
    const v16, 0x3f8f5c29    # 1.12f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, 0x3f333333    # 0.7f

    .line 323
    .line 324
    .line 325
    const v18, 0x3e8f5c29    # 0.28f

    .line 326
    .line 327
    .line 328
    const v13, 0x3e3851ec    # 0.18f

    .line 329
    .line 330
    .line 331
    const v14, 0x3e3851ec    # 0.18f

    .line 332
    .line 333
    .line 334
    const v15, 0x3edc28f6    # 0.43f

    .line 335
    .line 336
    .line 337
    const v16, 0x3e8f5c29    # 0.28f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x3f35c28f    # 0.71f

    .line 344
    .line 345
    .line 346
    const v18, -0x416b851f    # -0.29f

    .line 347
    .line 348
    .line 349
    const v13, 0x3e8f5c29    # 0.28f

    .line 350
    .line 351
    .line 352
    const/4 v14, 0x0

    .line 353
    const v15, 0x3f07ae14    # 0.53f

    .line 354
    .line 355
    .line 356
    const v16, -0x421eb852    # -0.11f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, -0x3fe147ae    # -2.48f

    .line 363
    .line 364
    .line 365
    const v2, 0x401eb852    # 2.48f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, 0x3e947ae1    # 0.29f

    .line 372
    .line 373
    .line 374
    const v18, -0x40ca3d71    # -0.71f

    .line 375
    .line 376
    .line 377
    const v13, 0x3e3851ec    # 0.18f

    .line 378
    .line 379
    .line 380
    const v14, -0x41c7ae14    # -0.18f

    .line 381
    .line 382
    .line 383
    const v15, 0x3e947ae1    # 0.29f

    .line 384
    .line 385
    .line 386
    const v16, -0x4123d70a    # -0.43f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x41666666    # -0.3f

    .line 393
    .line 394
    .line 395
    const v18, -0x40cccccd    # -0.7f

    .line 396
    .line 397
    .line 398
    const/4 v13, 0x0

    .line 399
    const v14, -0x4170a3d7    # -0.28f

    .line 400
    .line 401
    .line 402
    const v15, -0x420a3d71    # -0.12f

    .line 403
    .line 404
    .line 405
    const v16, -0x40fae148    # -0.52f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v0, 0x40accccd    # 5.4f

    .line 415
    .line 416
    .line 417
    const v2, 0x4189d70a    # 17.23f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x4010a3d7    # -1.87f

    .line 424
    .line 425
    .line 426
    const v18, 0x3fa28f5c    # 1.27f

    .line 427
    .line 428
    .line 429
    const v13, -0x40d70a3d    # -0.66f

    .line 430
    .line 431
    .line 432
    const v14, 0x3ebd70a4    # 0.37f

    .line 433
    .line 434
    .line 435
    const v15, -0x405ae148    # -1.29f

    .line 436
    .line 437
    .line 438
    const v16, 0x3f4ccccd    # 0.8f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, -0x40770a3d    # -1.07f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, 0x403ccccd    # 2.95f

    .line 451
    .line 452
    .line 453
    const v18, -0x400ccccd    # -1.9f

    .line 454
    .line 455
    .line 456
    const v13, 0x3f68f5c3    # 0.91f

    .line 457
    .line 458
    .line 459
    const/high16 v14, -0x40c00000    # -0.75f

    .line 460
    .line 461
    const v15, 0x3ff33333    # 1.9f

    .line 462
    .line 463
    .line 464
    const v16, -0x404e147b    # -1.39f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x3fd9999a    # 1.7f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x41a3d70a    # 20.48f

    .line 480
    .line 481
    .line 482
    const v2, 0x4193eb85    # 18.49f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, -0x400f5c29    # -1.88f

    .line 489
    .line 490
    .line 491
    const v18, -0x405d70a4    # -1.27f

    .line 492
    .line 493
    .line 494
    const v13, -0x40e66666    # -0.6f

    .line 495
    .line 496
    .line 497
    const v14, -0x410a3d71    # -0.48f

    .line 498
    .line 499
    .line 500
    const v15, -0x4063d70a    # -1.22f

    .line 501
    .line 502
    .line 503
    const v16, -0x4099999a    # -0.9f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v0, -0x40266666    # -1.7f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v17, 0x403ccccd    # 2.95f

    .line 516
    .line 517
    .line 518
    const v18, 0x3ff33333    # 1.9f

    .line 519
    .line 520
    .line 521
    const v13, 0x3f866666    # 1.05f

    .line 522
    .line 523
    .line 524
    const v14, 0x3f028f5c    # 0.51f

    .line 525
    .line 526
    .line 527
    const v15, 0x4001eb85    # 2.03f

    .line 528
    .line 529
    .line 530
    const v16, 0x3f933333    # 1.15f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v0, 0x3f88f5c3    # 1.07f

    .line 537
    .line 538
    .line 539
    const v2, -0x40770a3d    # -1.07f

    .line 540
    .line 541
    .line 542
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, 0x40e00000    # 7.0f

    .line 549
    .line 550
    const v2, 0x40cdc28f    # 6.43f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x409e147b    # 4.94f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, 0x40e23d71    # 7.07f

    .line 563
    .line 564
    .line 565
    const v2, -0x3f1dc28f    # -7.07f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, -0x404b851f    # -1.41f

    .line 572
    .line 573
    .line 574
    const v2, -0x404a3d71    # -1.42f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, -0x3f4ae148    # -5.66f

    .line 581
    .line 582
    .line 583
    const v2, 0x40b51eb8    # 5.66f

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x41066666    # 8.4f

    .line 590
    .line 591
    .line 592
    const/high16 v2, 0x40a00000    # 5.0f

    .line 593
    .line 594
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x41300000    # 11.0f

    .line 598
    .line 599
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const/high16 v0, 0x40400000    # 3.0f

    .line 603
    .line 604
    const/high16 v2, 0x41300000    # 11.0f

    .line 605
    .line 606
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const/high16 v2, 0x40a00000    # 5.0f

    .line 610
    .line 611
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v0, 0x40c00000    # 6.0f

    .line 615
    .line 616
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const/high16 v0, 0x40000000    # 2.0f

    .line 620
    .line 621
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    const/16 v16, 0x3800

    .line 632
    .line 633
    const/16 v17, 0x0

    .line 634
    .line 635
    const/high16 v6, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/high16 v8, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/4 v7, 0x0

    .line 640
    const/high16 v9, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/high16 v12, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const/4 v13, 0x0

    .line 645
    const/4 v14, 0x0

    .line 646
    const/4 v15, 0x0

    .line 647
    const-string v4, ""

    .line 648
    .line 649
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    sput-object v0, Landroidx/compose/material/icons/outlined/PhoneMissedKt;->_phoneMissed:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 658
    .line 659
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    return-object v0
.end method

.method public static synthetic getPhoneMissed$annotations(Landroidx/compose/material/icons/Icons$Outlined;)V
    .locals 0
    .annotation runtime Lh7/a;
    .end annotation

    return-void
.end method

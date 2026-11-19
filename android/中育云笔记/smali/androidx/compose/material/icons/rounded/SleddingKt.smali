.class public final Landroidx/compose/material/icons/rounded/SleddingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sledding:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSledding(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SleddingKt;->_sledding:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Sledding"

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
    const/high16 v0, 0x40900000    # 4.5f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v18, 0x40000000    # 2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f8ccccd    # 1.1f

    .line 83
    .line 84
    .line 85
    const v15, -0x4099999a    # -0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x40000000    # 2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, -0x4099999a    # -0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, -0x40000000    # -2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v0, 0x3f666666    # 0.9f

    .line 102
    .line 103
    .line 104
    const/high16 v2, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v4, -0x40000000    # -2.0f

    .line 107
    .line 108
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v0, 0x4059999a    # 3.4f

    .line 112
    .line 113
    .line 114
    const/high16 v2, 0x40900000    # 4.5f

    .line 115
    .line 116
    const/high16 v4, 0x41600000    # 14.0f

    .line 117
    .line 118
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x41975c29    # 18.92f

    .line 125
    .line 126
    .line 127
    const v2, 0x4199eb85    # 19.24f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v17, -0x408ccccd    # -0.95f

    .line 134
    .line 135
    .line 136
    const v18, 0x3ef5c28f    # 0.48f

    .line 137
    .line 138
    .line 139
    const v13, -0x41fae148    # -0.13f

    .line 140
    .line 141
    .line 142
    const v14, 0x3ec7ae14    # 0.39f

    .line 143
    .line 144
    .line 145
    const v15, -0x40f33333    # -0.55f

    .line 146
    .line 147
    .line 148
    const v16, 0x3f1c28f6    # 0.61f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, -0x3fd8f5c3    # -2.61f

    .line 155
    .line 156
    .line 157
    const v2, -0x40a66666    # -0.85f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, 0x416e6666    # 14.9f

    .line 164
    .line 165
    .line 166
    const v2, 0x41a26666    # 20.3f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, 0x40547ae1    # 3.32f

    .line 173
    .line 174
    .line 175
    const v2, 0x3f8a3d71    # 1.08f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v17, 0x4049999a    # 3.15f

    .line 186
    .line 187
    .line 188
    const v18, -0x4031eb85    # -1.61f

    .line 189
    .line 190
    .line 191
    const v13, 0x3fa7ae14    # 1.31f

    .line 192
    .line 193
    .line 194
    const v14, 0x3edc28f6    # 0.43f

    .line 195
    .line 196
    .line 197
    const v15, 0x402e147b    # 2.72f

    .line 198
    .line 199
    .line 200
    const v16, -0x416b851f    # -0.29f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v17, -0x40770a3d    # -1.07f

    .line 207
    .line 208
    .line 209
    const v18, -0x3fc5c28f    # -2.91f

    .line 210
    .line 211
    .line 212
    const v13, 0x3eb851ec    # 0.36f

    .line 213
    .line 214
    .line 215
    const v14, -0x4070a3d7    # -1.12f

    .line 216
    .line 217
    .line 218
    const v15, -0x421eb852    # -0.11f

    .line 219
    .line 220
    .line 221
    const v16, -0x3feb851f    # -2.32f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, -0x41666666    # -0.3f

    .line 228
    .line 229
    .line 230
    const v18, -0x408ccccd    # -0.95f

    .line 231
    .line 232
    .line 233
    const v13, -0x415c28f6    # -0.32f

    .line 234
    .line 235
    .line 236
    const v14, -0x41b33333    # -0.2f

    .line 237
    .line 238
    .line 239
    const v15, -0x4119999a    # -0.45f

    .line 240
    .line 241
    .line 242
    const v16, -0x40e66666    # -0.6f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, 0x3f8f5c29    # 1.12f

    .line 249
    .line 250
    .line 251
    const v18, -0x416147ae    # -0.31f

    .line 252
    .line 253
    .line 254
    const v13, 0x3e4ccccd    # 0.2f

    .line 255
    .line 256
    .line 257
    const v14, -0x411eb852    # -0.44f

    .line 258
    .line 259
    .line 260
    const v15, 0x3f35c28f    # 0.71f

    .line 261
    .line 262
    .line 263
    const v16, -0x40ee147b    # -0.57f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v17, 0x3fd70a3d    # 1.68f

    .line 270
    .line 271
    .line 272
    const v18, 0x4093d70a    # 4.62f

    .line 273
    .line 274
    .line 275
    const v13, 0x3fc28f5c    # 1.52f

    .line 276
    .line 277
    .line 278
    const v14, 0x3f733333    # 0.95f

    .line 279
    .line 280
    .line 281
    const/high16 v15, 0x40100000    # 2.25f

    .line 282
    .line 283
    const v16, 0x40366666    # 2.85f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x3f5eb852    # -5.04f

    .line 290
    .line 291
    .line 292
    const v18, 0x40247ae1    # 2.57f

    .line 293
    .line 294
    .line 295
    const v13, -0x40d1eb85    # -0.68f

    .line 296
    .line 297
    .line 298
    const v14, 0x40066666    # 2.1f

    .line 299
    .line 300
    .line 301
    const v15, -0x3fc3d70a    # -2.94f

    .line 302
    .line 303
    .line 304
    const/high16 v16, 0x40500000    # 3.25f

    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x3fdeb852    # 1.74f

    .line 313
    .line 314
    .line 315
    const v2, 0x418ccccd    # 17.6f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, -0x40fae148    # -0.52f

    .line 322
    .line 323
    .line 324
    const v18, -0x4091eb85    # -0.93f

    .line 325
    .line 326
    .line 327
    const v13, -0x413851ec    # -0.39f

    .line 328
    .line 329
    .line 330
    const v14, -0x41fae148    # -0.13f

    .line 331
    .line 332
    .line 333
    const v15, -0x40deb852    # -0.63f

    .line 334
    .line 335
    .line 336
    const v16, -0x40f5c28f    # -0.54f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x3f733333    # 0.95f

    .line 343
    .line 344
    .line 345
    const/high16 v18, -0x41000000    # -0.5f

    .line 346
    .line 347
    const v13, 0x3df5c28f    # 0.12f

    .line 348
    .line 349
    .line 350
    const v14, -0x412e147b    # -0.41f

    .line 351
    .line 352
    .line 353
    const v15, 0x3f0ccccd    # 0.55f

    .line 354
    .line 355
    .line 356
    const v16, -0x40deb852    # -0.63f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, 0x404e147b    # 3.22f

    .line 363
    .line 364
    .line 365
    const v2, 0x3f866666    # 1.05f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v0, 0x3eeb851f    # 0.46f

    .line 372
    .line 373
    .line 374
    const v2, -0x4048f5c3    # -1.43f

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, -0x3fb3d70a    # -3.19f

    .line 381
    .line 382
    .line 383
    const v2, -0x407ae148    # -1.04f

    .line 384
    .line 385
    .line 386
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, -0x40fae148    # -0.52f

    .line 390
    .line 391
    .line 392
    const v18, -0x4091eb85    # -0.93f

    .line 393
    .line 394
    .line 395
    const v13, -0x413851ec    # -0.39f

    .line 396
    .line 397
    .line 398
    const v14, -0x41fae148    # -0.13f

    .line 399
    .line 400
    .line 401
    const v15, -0x40deb852    # -0.63f

    .line 402
    .line 403
    .line 404
    const v16, -0x40f5c28f    # -0.54f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, 0x3f733333    # 0.95f

    .line 411
    .line 412
    .line 413
    const/high16 v18, -0x41000000    # -0.5f

    .line 414
    .line 415
    const v13, 0x3df5c28f    # 0.12f

    .line 416
    .line 417
    .line 418
    const v14, -0x412e147b    # -0.41f

    .line 419
    .line 420
    .line 421
    const v15, 0x3f0ccccd    # 0.55f

    .line 422
    .line 423
    .line 424
    const v16, -0x40deb852    # -0.63f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v0, 0x40800000    # 4.0f

    .line 431
    .line 432
    const v2, 0x4159999a    # 13.6f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, -0x3fce147b    # -2.78f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3f9ae148    # 1.21f

    .line 445
    .line 446
    .line 447
    const v18, -0x40147ae1    # -1.84f

    .line 448
    .line 449
    .line 450
    const/4 v13, 0x0

    .line 451
    const v14, -0x40b33333    # -0.8f

    .line 452
    .line 453
    .line 454
    const v15, 0x3ef5c28f    # 0.48f

    .line 455
    .line 456
    .line 457
    const v16, -0x403d70a4    # -1.52f

    .line 458
    .line 459
    .line 460
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v17, 0x408851ec    # 4.26f

    .line 464
    .line 465
    .line 466
    const v18, -0x4015c28f    # -1.83f

    .line 467
    .line 468
    .line 469
    const/high16 v13, 0x3f400000    # 0.75f

    .line 470
    .line 471
    const v14, -0x415c28f6    # -0.32f

    .line 472
    .line 473
    .line 474
    const v15, 0x4083851f    # 4.11f

    .line 475
    .line 476
    .line 477
    const v16, -0x401eb852    # -1.76f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v17, 0x3faccccd    # 1.35f

    .line 484
    .line 485
    .line 486
    const v18, -0x42dc28f6    # -0.04f

    .line 487
    .line 488
    .line 489
    const v13, 0x3ed1eb85    # 0.41f

    .line 490
    .line 491
    .line 492
    const v14, -0x41c7ae14    # -0.18f

    .line 493
    .line 494
    .line 495
    const v15, 0x3f63d70a    # 0.89f

    .line 496
    .line 497
    .line 498
    const v16, -0x41a8f5c3    # -0.21f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x3f88f5c3    # 1.07f

    .line 505
    .line 506
    .line 507
    const v18, 0x4011eb85    # 2.28f

    .line 508
    .line 509
    .line 510
    const v13, 0x3f68f5c3    # 0.91f

    .line 511
    .line 512
    .line 513
    const v14, 0x3eae147b    # 0.34f

    .line 514
    .line 515
    .line 516
    const v15, 0x3faf5c29    # 1.37f

    .line 517
    .line 518
    .line 519
    const v16, 0x3fae147b    # 1.36f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x404ccccd    # 3.2f

    .line 526
    .line 527
    .line 528
    const v2, -0x407ae148    # -1.04f

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const/high16 v0, 0x41500000    # 13.0f

    .line 535
    .line 536
    const/high16 v2, 0x41440000    # 12.25f

    .line 537
    .line 538
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, 0x4008f5c3    # 2.14f

    .line 542
    .line 543
    .line 544
    const v18, 0x3f91eb85    # 1.14f

    .line 545
    .line 546
    .line 547
    const v13, 0x3f63d70a    # 0.89f

    .line 548
    .line 549
    .line 550
    const v14, -0x41e66666    # -0.15f

    .line 551
    .line 552
    .line 553
    const v15, 0x3fe147ae    # 1.76f

    .line 554
    .line 555
    .line 556
    const v16, 0x3ea3d70a    # 0.32f

    .line 557
    .line 558
    .line 559
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, 0x40051eb8    # 2.08f

    .line 563
    .line 564
    .line 565
    const v2, 0x409051ec    # 4.51f

    .line 566
    .line 567
    .line 568
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const v0, 0x3f9c28f6    # 1.22f

    .line 572
    .line 573
    .line 574
    const v2, 0x3ecccccd    # 0.4f

    .line 575
    .line 576
    .line 577
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v17, 0x41975c29    # 18.92f

    .line 581
    .line 582
    .line 583
    const v18, 0x4199eb85    # 19.24f

    .line 584
    .line 585
    .line 586
    const v13, 0x4196b852    # 18.84f

    .line 587
    .line 588
    .line 589
    const v14, 0x41935c29    # 18.42f

    .line 590
    .line 591
    .line 592
    const v15, 0x41986666    # 19.05f

    .line 593
    .line 594
    .line 595
    const v16, 0x4196b852    # 18.84f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v0, 0x41640000    # 14.25f

    .line 605
    .line 606
    const/high16 v2, 0x40c00000    # 6.0f

    .line 607
    .line 608
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v0, 0x3f8147ae    # 1.01f

    .line 612
    .line 613
    .line 614
    const v2, 0x3ea8f5c3    # 0.33f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v17, -0x420a3d71    # -0.12f

    .line 621
    .line 622
    .line 623
    const v18, -0x404ccccd    # -1.4f

    .line 624
    .line 625
    .line 626
    const v13, -0x419eb852    # -0.22f

    .line 627
    .line 628
    .line 629
    const v14, -0x4128f5c3    # -0.42f

    .line 630
    .line 631
    .line 632
    const v15, -0x4170a3d7    # -0.28f

    .line 633
    .line 634
    .line 635
    const v16, -0x40947ae1    # -0.92f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, 0x40fd70a4    # 7.92f

    .line 642
    .line 643
    .line 644
    const/high16 v2, 0x41200000    # 10.0f

    .line 645
    .line 646
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, 0x412d1eb8    # 10.82f

    .line 650
    .line 651
    .line 652
    const/high16 v2, 0x40c00000    # 6.0f

    .line 653
    .line 654
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, 0x41640000    # 14.25f

    .line 658
    .line 659
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v0, 0x419347ae    # 18.41f

    .line 666
    .line 667
    .line 668
    const v2, 0x415f0a3d    # 13.94f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v0, -0x3f2ae148    # -6.66f

    .line 675
    .line 676
    .line 677
    const v2, -0x3ff5c28f    # -2.16f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v0, -0x41147ae1    # -0.46f

    .line 684
    .line 685
    .line 686
    const v2, 0x3fb70a3d    # 1.43f

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v0, 0x40d51eb8    # 6.66f

    .line 693
    .line 694
    .line 695
    const v2, 0x400a3d71    # 2.16f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, 0x419347ae    # 18.41f

    .line 702
    .line 703
    .line 704
    const v2, 0x415f0a3d    # 13.94f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const v0, 0x41886666    # 17.05f

    .line 714
    .line 715
    .line 716
    const v2, 0x416a147b    # 14.63f

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v0, -0x4068f5c3    # -1.18f

    .line 723
    .line 724
    .line 725
    const v2, -0x3fdc28f6    # -2.56f

    .line 726
    .line 727
    .line 728
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v0, -0x3f81eb85    # -3.97f

    .line 732
    .line 733
    .line 734
    const v2, 0x3f63d70a    # 0.89f

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const v0, 0x41886666    # 17.05f

    .line 741
    .line 742
    .line 743
    const v2, 0x416a147b    # 14.63f

    .line 744
    .line 745
    .line 746
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    const/16 v16, 0x3800

    .line 757
    .line 758
    const/16 v17, 0x0

    .line 759
    .line 760
    const/high16 v6, 0x3f800000    # 1.0f

    .line 761
    .line 762
    const/high16 v8, 0x3f800000    # 1.0f

    .line 763
    .line 764
    const/4 v7, 0x0

    .line 765
    const/high16 v9, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/high16 v12, 0x3f800000    # 1.0f

    .line 768
    .line 769
    const/4 v13, 0x0

    .line 770
    const/4 v14, 0x0

    .line 771
    const/4 v15, 0x0

    .line 772
    const-string v4, ""

    .line 773
    .line 774
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    sput-object v0, Landroidx/compose/material/icons/rounded/SleddingKt;->_sledding:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 783
    .line 784
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 785
    .line 786
    .line 787
    return-object v0
.end method

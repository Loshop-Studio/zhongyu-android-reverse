.class public final Landroidx/compose/material/icons/rounded/FilterVintageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _filterVintage:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFilterVintage(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/FilterVintageKt;->_filterVintage:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.FilterVintage"

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
    const v0, 0x4195999a    # 18.7f

    .line 71
    .line 72
    .line 73
    const v2, 0x41466666    # 12.4f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x40a3d70a    # -0.86f

    .line 80
    .line 81
    .line 82
    const v18, -0x41333333    # -0.4f

    .line 83
    .line 84
    .line 85
    const v13, -0x4170a3d7    # -0.28f

    .line 86
    .line 87
    .line 88
    const v14, -0x41dc28f6    # -0.16f

    .line 89
    .line 90
    .line 91
    const v15, -0x40ee147b    # -0.57f

    .line 92
    .line 93
    .line 94
    const v16, -0x416b851f    # -0.29f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3f5c28f6    # 0.86f

    .line 101
    .line 102
    .line 103
    const v13, 0x3e947ae1    # 0.29f

    .line 104
    .line 105
    .line 106
    const v14, -0x421eb852    # -0.11f

    .line 107
    .line 108
    .line 109
    const v15, 0x3f147ae1    # 0.58f

    .line 110
    .line 111
    .line 112
    const v16, -0x418a3d71    # -0.24f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v17, 0x40400000    # 3.0f

    .line 119
    .line 120
    const v18, -0x3f59eb85    # -5.19f

    .line 121
    .line 122
    .line 123
    const v13, 0x3ff5c28f    # 1.92f

    .line 124
    .line 125
    .line 126
    const v14, -0x4071eb85    # -1.11f

    .line 127
    .line 128
    .line 129
    const v15, 0x403f5c29    # 2.99f

    .line 130
    .line 131
    .line 132
    const v16, -0x3fb851ec    # -3.12f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, -0x3f400000    # -6.0f

    .line 139
    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const v13, -0x401ae148    # -1.79f

    .line 143
    .line 144
    .line 145
    const v14, -0x407c28f6    # -1.03f

    .line 146
    .line 147
    .line 148
    const v15, -0x3f7dc28f    # -4.07f

    .line 149
    .line 150
    .line 151
    const v16, -0x4071eb85    # -1.11f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v17, -0x40b851ec    # -0.78f

    .line 158
    .line 159
    .line 160
    const v18, 0x3f0a3d71    # 0.54f

    .line 161
    .line 162
    .line 163
    const v13, -0x4170a3d7    # -0.28f

    .line 164
    .line 165
    .line 166
    const v14, 0x3e23d70a    # 0.16f

    .line 167
    .line 168
    .line 169
    const v15, -0x40f5c28f    # -0.54f

    .line 170
    .line 171
    .line 172
    const v16, 0x3eb33333    # 0.35f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, 0x3da3d70a    # 0.08f

    .line 179
    .line 180
    .line 181
    const v18, -0x408ccccd    # -0.95f

    .line 182
    .line 183
    .line 184
    const v13, 0x3d4ccccd    # 0.05f

    .line 185
    .line 186
    .line 187
    const v14, -0x416147ae    # -0.31f

    .line 188
    .line 189
    .line 190
    const v15, 0x3da3d70a    # 0.08f

    .line 191
    .line 192
    .line 193
    const v16, -0x40deb852    # -0.63f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 200
    .line 201
    const v18, -0x3f59eb85    # -5.19f

    .line 202
    .line 203
    .line 204
    const/4 v13, 0x0

    .line 205
    const v14, -0x3ff1eb85    # -2.22f

    .line 206
    .line 207
    .line 208
    const v15, -0x40651eb8    # -1.21f

    .line 209
    .line 210
    .line 211
    const v16, -0x3f7b3333    # -4.15f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x41100000    # 9.0f

    .line 218
    .line 219
    const/high16 v18, 0x40c00000    # 6.0f

    .line 220
    .line 221
    const v13, 0x41235c29    # 10.21f

    .line 222
    .line 223
    .line 224
    const v14, 0x3feccccd    # 1.85f

    .line 225
    .line 226
    .line 227
    const/high16 v15, 0x41100000    # 9.0f

    .line 228
    .line 229
    const v16, 0x4071eb85    # 3.78f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3da3d70a    # 0.08f

    .line 236
    .line 237
    .line 238
    const v18, 0x3f733333    # 0.95f

    .line 239
    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const v14, 0x3ea3d70a    # 0.32f

    .line 243
    .line 244
    .line 245
    const v15, 0x3cf5c28f    # 0.03f

    .line 246
    .line 247
    .line 248
    const v16, 0x3f23d70a    # 0.64f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v17, -0x40b851ec    # -0.78f

    .line 255
    .line 256
    .line 257
    const v18, -0x40f33333    # -0.55f

    .line 258
    .line 259
    .line 260
    const v13, -0x418a3d71    # -0.24f

    .line 261
    .line 262
    .line 263
    const v14, -0x41b33333    # -0.2f

    .line 264
    .line 265
    .line 266
    const/high16 v15, -0x41000000    # -0.5f

    .line 267
    .line 268
    const v16, -0x413851ec    # -0.39f

    .line 269
    .line 270
    .line 271
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/high16 v17, -0x3f400000    # -6.0f

    .line 275
    .line 276
    const/16 v18, 0x0

    .line 277
    .line 278
    const v13, -0x400a3d71    # -1.92f

    .line 279
    .line 280
    .line 281
    const v14, -0x4071eb85    # -1.11f

    .line 282
    .line 283
    .line 284
    const v15, -0x3f79999a    # -4.2f

    .line 285
    .line 286
    .line 287
    const v16, -0x407c28f6    # -1.03f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, 0x40400000    # 3.0f

    .line 294
    .line 295
    const v18, 0x40a6147b    # 5.19f

    .line 296
    .line 297
    .line 298
    const/4 v13, 0x0

    .line 299
    const v14, 0x40047ae1    # 2.07f

    .line 300
    .line 301
    .line 302
    const v15, 0x3f88f5c3    # 1.07f

    .line 303
    .line 304
    .line 305
    const v16, 0x40828f5c    # 4.08f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, 0x3f5c28f6    # 0.86f

    .line 312
    .line 313
    .line 314
    const v18, 0x3ecccccd    # 0.4f

    .line 315
    .line 316
    .line 317
    const v13, 0x3e8f5c29    # 0.28f

    .line 318
    .line 319
    .line 320
    const v14, 0x3e23d70a    # 0.16f

    .line 321
    .line 322
    .line 323
    const v15, 0x3f11eb85    # 0.57f

    .line 324
    .line 325
    .line 326
    const v16, 0x3e947ae1    # 0.29f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, -0x40a3d70a    # -0.86f

    .line 333
    .line 334
    .line 335
    const v13, -0x416b851f    # -0.29f

    .line 336
    .line 337
    .line 338
    const v14, 0x3de147ae    # 0.11f

    .line 339
    .line 340
    .line 341
    const v15, -0x40eb851f    # -0.58f

    .line 342
    .line 343
    .line 344
    const v16, 0x3e75c28f    # 0.24f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 351
    .line 352
    const v18, 0x40a6147b    # 5.19f

    .line 353
    .line 354
    .line 355
    const v13, -0x400a3d71    # -1.92f

    .line 356
    .line 357
    .line 358
    const v14, 0x3f8e147b    # 1.11f

    .line 359
    .line 360
    .line 361
    const v15, -0x3fc0a3d7    # -2.99f

    .line 362
    .line 363
    .line 364
    const v16, 0x4047ae14    # 3.12f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v17, 0x40c00000    # 6.0f

    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    const v13, 0x3fe51eb8    # 1.79f

    .line 375
    .line 376
    .line 377
    const v14, 0x3f83d70a    # 1.03f

    .line 378
    .line 379
    .line 380
    const v15, 0x40823d71    # 4.07f

    .line 381
    .line 382
    .line 383
    const v16, 0x3f8e147b    # 1.11f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v17, 0x3f47ae14    # 0.78f

    .line 390
    .line 391
    .line 392
    const v18, -0x40f5c28f    # -0.54f

    .line 393
    .line 394
    .line 395
    const v13, 0x3e8f5c29    # 0.28f

    .line 396
    .line 397
    .line 398
    const v14, -0x41dc28f6    # -0.16f

    .line 399
    .line 400
    .line 401
    const v15, 0x3f0a3d71    # 0.54f

    .line 402
    .line 403
    .line 404
    const v16, -0x414ccccd    # -0.35f

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, -0x425c28f6    # -0.08f

    .line 411
    .line 412
    .line 413
    const v18, 0x3f75c28f    # 0.96f

    .line 414
    .line 415
    .line 416
    const v13, -0x42b33333    # -0.05f

    .line 417
    .line 418
    .line 419
    const v14, 0x3ea3d70a    # 0.32f

    .line 420
    .line 421
    .line 422
    const v15, -0x425c28f6    # -0.08f

    .line 423
    .line 424
    .line 425
    const v16, 0x3f23d70a    # 0.64f

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x40400000    # 3.0f

    .line 432
    .line 433
    const v18, 0x40a6147b    # 5.19f

    .line 434
    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const v14, 0x400e147b    # 2.22f

    .line 438
    .line 439
    .line 440
    const v15, 0x3f9ae148    # 1.21f

    .line 441
    .line 442
    .line 443
    const v16, 0x4084cccd    # 4.15f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v18, -0x3f59eb85    # -5.19f

    .line 450
    .line 451
    .line 452
    const v13, 0x3fe51eb8    # 1.79f

    .line 453
    .line 454
    .line 455
    const v14, -0x407ae148    # -1.04f

    .line 456
    .line 457
    .line 458
    const/high16 v15, 0x40400000    # 3.0f

    .line 459
    .line 460
    const v16, -0x3fc1eb85    # -2.97f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, -0x425c28f6    # -0.08f

    .line 467
    .line 468
    .line 469
    const v18, -0x408ccccd    # -0.95f

    .line 470
    .line 471
    .line 472
    const/4 v13, 0x0

    .line 473
    const v14, -0x415c28f6    # -0.32f

    .line 474
    .line 475
    .line 476
    const v15, -0x430a3d71    # -0.03f

    .line 477
    .line 478
    .line 479
    const v16, -0x40dc28f6    # -0.64f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, 0x3f47ae14    # 0.78f

    .line 486
    .line 487
    .line 488
    const v18, 0x3f0a3d71    # 0.54f

    .line 489
    .line 490
    .line 491
    const v13, 0x3e75c28f    # 0.24f

    .line 492
    .line 493
    .line 494
    const v14, 0x3e4ccccd    # 0.2f

    .line 495
    .line 496
    .line 497
    const/high16 v15, 0x3f000000    # 0.5f

    .line 498
    .line 499
    const v16, 0x3ec28f5c    # 0.38f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v17, 0x40c00000    # 6.0f

    .line 506
    .line 507
    const/16 v18, 0x0

    .line 508
    .line 509
    const v13, 0x3ff5c28f    # 1.92f

    .line 510
    .line 511
    .line 512
    const v14, 0x3f8e147b    # 1.11f

    .line 513
    .line 514
    .line 515
    const v15, 0x40866666    # 4.2f

    .line 516
    .line 517
    .line 518
    const v16, 0x3f83d70a    # 1.03f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 525
    .line 526
    const v18, -0x3f59eb85    # -5.19f

    .line 527
    .line 528
    .line 529
    const v13, -0x43dc28f6    # -0.01f

    .line 530
    .line 531
    .line 532
    const v14, -0x3ffb851f    # -2.07f

    .line 533
    .line 534
    .line 535
    const v15, -0x4075c28f    # -1.08f

    .line 536
    .line 537
    .line 538
    const v16, -0x3f7d70a4    # -4.08f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, 0x41400000    # 12.0f

    .line 548
    .line 549
    const/high16 v2, 0x41800000    # 16.0f

    .line 550
    .line 551
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v17, -0x3f800000    # -4.0f

    .line 555
    .line 556
    const/high16 v18, -0x3f800000    # -4.0f

    .line 557
    .line 558
    const v13, -0x3ff28f5c    # -2.21f

    .line 559
    .line 560
    .line 561
    const/4 v14, 0x0

    .line 562
    const/high16 v15, -0x3f800000    # -4.0f

    .line 563
    .line 564
    const v16, -0x401ae148    # -1.79f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v0, 0x3fe51eb8    # 1.79f

    .line 571
    .line 572
    .line 573
    const/high16 v2, -0x3f800000    # -4.0f

    .line 574
    .line 575
    const/high16 v4, 0x40800000    # 4.0f

    .line 576
    .line 577
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v2, 0x40800000    # 4.0f

    .line 581
    .line 582
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, -0x401ae148    # -1.79f

    .line 586
    .line 587
    .line 588
    const/high16 v2, -0x3f800000    # -4.0f

    .line 589
    .line 590
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    const/16 v16, 0x3800

    .line 601
    .line 602
    const/16 v17, 0x0

    .line 603
    .line 604
    const/high16 v6, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/high16 v8, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/4 v7, 0x0

    .line 609
    const/high16 v9, 0x3f800000    # 1.0f

    .line 610
    .line 611
    const/high16 v12, 0x3f800000    # 1.0f

    .line 612
    .line 613
    const/4 v13, 0x0

    .line 614
    const/4 v15, 0x0

    .line 615
    const-string v4, ""

    .line 616
    .line 617
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    sput-object v0, Landroidx/compose/material/icons/rounded/FilterVintageKt;->_filterVintage:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 626
    .line 627
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    return-object v0
.end method

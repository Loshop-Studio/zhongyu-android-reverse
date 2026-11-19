.class public final Landroidx/compose/material/icons/rounded/NotListedLocationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _notListedLocation:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNotListedLocation(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/NotListedLocationKt;->_notListedLocation:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.NotListedLocation"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const v18, 0x41033333    # 8.2f

    .line 80
    .line 81
    .line 82
    const v13, -0x3f79999a    # -4.2f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const/high16 v15, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v16, 0x404e147b    # 3.22f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v17, 0x40eae148    # 7.34f

    .line 95
    .line 96
    .line 97
    const v18, 0x4133851f    # 11.22f

    .line 98
    .line 99
    .line 100
    const/4 v13, 0x0

    .line 101
    const v14, 0x404b851f    # 3.18f

    .line 102
    .line 103
    .line 104
    const v15, 0x401ccccd    # 2.45f

    .line 105
    .line 106
    .line 107
    const v16, 0x40dd70a4    # 6.92f

    .line 108
    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v17, 0x3faa3d71    # 1.33f

    .line 114
    .line 115
    .line 116
    const/16 v18, 0x0

    .line 117
    .line 118
    const v13, 0x3ec28f5c    # 0.38f

    .line 119
    .line 120
    .line 121
    const v14, 0x3ea8f5c3    # 0.33f

    .line 122
    .line 123
    .line 124
    const v15, 0x3f733333    # 0.95f

    .line 125
    .line 126
    .line 127
    const v16, 0x3ea8f5c3    # 0.33f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v17, 0x41a00000    # 20.0f

    .line 134
    .line 135
    const v18, 0x41233333    # 10.2f

    .line 136
    .line 137
    .line 138
    const v13, 0x418c6666    # 17.55f

    .line 139
    .line 140
    .line 141
    const v14, 0x4188f5c3    # 17.12f

    .line 142
    .line 143
    .line 144
    const/high16 v15, 0x41a00000    # 20.0f

    .line 145
    .line 146
    const v16, 0x4156147b    # 13.38f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, 0x41400000    # 12.0f

    .line 153
    .line 154
    const/high16 v18, 0x40000000    # 2.0f

    .line 155
    .line 156
    const/high16 v13, 0x41a00000    # 20.0f

    .line 157
    .line 158
    const v14, 0x40a70a3d    # 5.22f

    .line 159
    .line 160
    .line 161
    const v15, 0x4181999a    # 16.2f

    .line 162
    .line 163
    .line 164
    const/high16 v16, 0x40000000    # 2.0f

    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, 0x414028f6    # 12.01f

    .line 173
    .line 174
    .line 175
    const/high16 v2, 0x41800000    # 16.0f

    .line 176
    .line 177
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v17, -0x4079999a    # -1.05f

    .line 181
    .line 182
    .line 183
    const v18, -0x4079999a    # -1.05f

    .line 184
    .line 185
    .line 186
    const v13, -0x40e8f5c3    # -0.59f

    .line 187
    .line 188
    .line 189
    const/4 v14, 0x0

    .line 190
    const v15, -0x4079999a    # -1.05f

    .line 191
    .line 192
    .line 193
    const v16, -0x410f5c29    # -0.47f

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v17, 0x3f866666    # 1.05f

    .line 200
    .line 201
    .line 202
    const v18, -0x407ae148    # -1.04f

    .line 203
    .line 204
    .line 205
    const/4 v13, 0x0

    .line 206
    const v14, -0x40e8f5c3    # -0.59f

    .line 207
    .line 208
    .line 209
    const v15, 0x3ef0a3d7    # 0.47f

    .line 210
    .line 211
    .line 212
    const v16, -0x407ae148    # -1.04f

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v17, 0x3f851eb8    # 1.04f

    .line 219
    .line 220
    .line 221
    const v18, 0x3f851eb8    # 1.04f

    .line 222
    .line 223
    .line 224
    const v13, 0x3f170a3d    # 0.59f

    .line 225
    .line 226
    .line 227
    const/4 v14, 0x0

    .line 228
    const v15, 0x3f851eb8    # 1.04f

    .line 229
    .line 230
    .line 231
    const v16, 0x3ee66666    # 0.45f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, 0x414028f6    # 12.01f

    .line 238
    .line 239
    .line 240
    const/high16 v18, 0x41800000    # 16.0f

    .line 241
    .line 242
    const v13, 0x4150cccd    # 13.05f

    .line 243
    .line 244
    .line 245
    const v14, 0x41787ae1    # 15.53f

    .line 246
    .line 247
    .line 248
    const v15, 0x4149c28f    # 12.61f

    .line 249
    .line 250
    .line 251
    const/high16 v16, 0x41800000    # 16.0f

    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v0, 0x416851ec    # 14.52f

    .line 260
    .line 261
    .line 262
    const v2, 0x411d47ae    # 9.83f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v17, -0x403851ec    # -1.56f

    .line 269
    .line 270
    .line 271
    const v18, 0x3fe7ae14    # 1.81f

    .line 272
    .line 273
    .line 274
    const v13, -0x40deb852    # -0.63f

    .line 275
    .line 276
    .line 277
    const v14, 0x3f6e147b    # 0.93f

    .line 278
    .line 279
    .line 280
    const v15, -0x40628f5c    # -1.23f

    .line 281
    .line 282
    .line 283
    const v16, 0x3f9ae148    # 1.21f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x41dc28f6    # -0.16f

    .line 290
    .line 291
    .line 292
    const v18, 0x3efae148    # 0.49f

    .line 293
    .line 294
    .line 295
    const v13, -0x425c28f6    # -0.08f

    .line 296
    .line 297
    .line 298
    const v14, 0x3e0f5c29    # 0.14f

    .line 299
    .line 300
    .line 301
    const v15, -0x41fae148    # -0.13f

    .line 302
    .line 303
    .line 304
    const v16, 0x3e851eb8    # 0.26f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v17, -0x40c00000    # -0.75f

    .line 311
    .line 312
    const v18, 0x3f2e147b    # 0.68f

    .line 313
    .line 314
    .line 315
    const v13, -0x42b33333    # -0.05f

    .line 316
    .line 317
    .line 318
    const v14, 0x3ec7ae14    # 0.39f

    .line 319
    .line 320
    .line 321
    const v15, -0x4147ae14    # -0.36f

    .line 322
    .line 323
    .line 324
    const v16, 0x3f2e147b    # 0.68f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v0, -0x430a3d71    # -0.03f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v18, -0x40ae147b    # -0.82f

    .line 337
    .line 338
    .line 339
    const v13, -0x411eb852    # -0.44f

    .line 340
    .line 341
    .line 342
    const/4 v14, 0x0

    .line 343
    const v15, -0x40b5c28f    # -0.79f

    .line 344
    .line 345
    .line 346
    const v16, -0x413d70a4    # -0.38f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v17, 0x3e800000    # 0.25f

    .line 353
    .line 354
    const v18, -0x40a8f5c3    # -0.84f

    .line 355
    .line 356
    .line 357
    const v13, 0x3cf5c28f    # 0.03f

    .line 358
    .line 359
    .line 360
    const v14, -0x4175c28f    # -0.27f

    .line 361
    .line 362
    .line 363
    const v15, 0x3db851ec    # 0.09f

    .line 364
    .line 365
    .line 366
    const v16, -0x40ee147b    # -0.57f

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, 0x3fd0a3d7    # 1.63f

    .line 373
    .line 374
    .line 375
    const v18, -0x4019999a    # -1.8f

    .line 376
    .line 377
    .line 378
    const v13, 0x3ed1eb85    # 0.41f

    .line 379
    .line 380
    .line 381
    const v14, -0x40c51eb8    # -0.73f

    .line 382
    .line 383
    .line 384
    const v15, 0x3f970a3d    # 1.18f

    .line 385
    .line 386
    .line 387
    const v16, -0x406b851f    # -1.16f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, -0x406e147b    # -1.14f

    .line 394
    .line 395
    .line 396
    const v18, -0x4007ae14    # -1.94f

    .line 397
    .line 398
    .line 399
    const v13, 0x3ef5c28f    # 0.48f

    .line 400
    .line 401
    .line 402
    const v14, -0x40d1eb85    # -0.68f

    .line 403
    .line 404
    .line 405
    const v15, 0x3e570a3d    # 0.21f

    .line 406
    .line 407
    .line 408
    const v16, -0x4007ae14    # -1.94f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, -0x405eb852    # -1.26f

    .line 415
    .line 416
    .line 417
    const v18, 0x3f333333    # 0.7f

    .line 418
    .line 419
    .line 420
    const v13, -0x40e3d70a    # -0.61f

    .line 421
    .line 422
    .line 423
    const/4 v14, 0x0

    .line 424
    const v15, -0x407eb852    # -1.01f

    .line 425
    .line 426
    .line 427
    const v16, 0x3ea3d70a    # 0.32f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, -0x409c28f6    # -0.89f

    .line 434
    .line 435
    .line 436
    const/high16 v18, 0x3e800000    # 0.25f

    .line 437
    .line 438
    const v13, -0x41bd70a4    # -0.19f

    .line 439
    .line 440
    .line 441
    const v14, 0x3e947ae1    # 0.29f

    .line 442
    .line 443
    .line 444
    const v15, -0x40ee147b    # -0.57f

    .line 445
    .line 446
    .line 447
    const v16, 0x3ec7ae14    # 0.39f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, -0x4151eb85    # -0.34f

    .line 454
    .line 455
    .line 456
    const v18, -0x40770a3d    # -1.07f

    .line 457
    .line 458
    .line 459
    const v13, -0x4128f5c3    # -0.42f

    .line 460
    .line 461
    .line 462
    const v14, -0x41c7ae14    # -0.18f

    .line 463
    .line 464
    .line 465
    const v15, -0x40e66666    # -0.6f

    .line 466
    .line 467
    .line 468
    const v16, -0x40cccccd    # -0.7f

    .line 469
    .line 470
    .line 471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v17, 0x41400000    # 12.0f

    .line 475
    .line 476
    const/high16 v18, 0x40c00000    # 6.0f

    .line 477
    .line 478
    const v13, 0x41207ae1    # 10.03f

    .line 479
    .line 480
    .line 481
    const v14, 0x40d1999a    # 6.55f

    .line 482
    .line 483
    .line 484
    const v15, 0x412e147b    # 10.88f

    .line 485
    .line 486
    .line 487
    const/high16 v16, 0x40c00000    # 6.0f

    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x4020a3d7    # 2.51f

    .line 493
    .line 494
    .line 495
    const v18, 0x3fa147ae    # 1.26f

    .line 496
    .line 497
    .line 498
    const v13, 0x3f9d70a4    # 1.23f

    .line 499
    .line 500
    .line 501
    const/4 v14, 0x0

    .line 502
    const v15, 0x40051eb8    # 2.08f

    .line 503
    .line 504
    .line 505
    const v16, 0x3f0f5c29    # 0.56f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v17, 0x416851ec    # 14.52f

    .line 512
    .line 513
    .line 514
    const v18, 0x411d47ae    # 9.83f

    .line 515
    .line 516
    .line 517
    const v13, 0x416deb85    # 14.87f

    .line 518
    .line 519
    .line 520
    const v14, 0x40fbd70a    # 7.87f

    .line 521
    .line 522
    .line 523
    const v15, 0x417170a4    # 15.09f

    .line 524
    .line 525
    .line 526
    const v16, 0x410fd70a    # 8.99f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v2

    .line 539
    const/16 v16, 0x3800

    .line 540
    .line 541
    const/16 v17, 0x0

    .line 542
    .line 543
    const/high16 v6, 0x3f800000    # 1.0f

    .line 544
    .line 545
    const/high16 v8, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const/4 v7, 0x0

    .line 548
    const/high16 v9, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/high16 v12, 0x3f800000    # 1.0f

    .line 551
    .line 552
    const/4 v13, 0x0

    .line 553
    const/4 v14, 0x0

    .line 554
    const/4 v15, 0x0

    .line 555
    const-string v4, ""

    .line 556
    .line 557
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    sput-object v0, Landroidx/compose/material/icons/rounded/NotListedLocationKt;->_notListedLocation:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 566
    .line 567
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    return-object v0
.end method

.method public static synthetic getNotListedLocation$annotations(Landroidx/compose/material/icons/Icons$Rounded;)V
    .locals 0
    .annotation runtime Lh7/a;
    .end annotation

    return-void
.end method

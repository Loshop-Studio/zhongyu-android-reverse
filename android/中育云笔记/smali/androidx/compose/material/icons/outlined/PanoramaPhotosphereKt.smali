.class public final Landroidx/compose/material/icons/outlined/PanoramaPhotosphereKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaPhotosphere:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaPhotosphere(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/PanoramaPhotosphereKt;->_panoramaPhotosphere:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.PanoramaPhotosphere"

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
    const v0, 0x41af999a    # 21.95f

    .line 71
    .line 72
    .line 73
    const v2, 0x41026666    # 8.15f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x4091eb85    # -0.93f

    .line 80
    .line 81
    .line 82
    const v18, -0x41147ae1    # -0.46f

    .line 83
    .line 84
    .line 85
    const v13, -0x416b851f    # -0.29f

    .line 86
    .line 87
    .line 88
    const v14, -0x41dc28f6    # -0.16f

    .line 89
    .line 90
    .line 91
    const v15, -0x40e3d70a    # -0.61f

    .line 92
    .line 93
    .line 94
    const v16, -0x416147ae    # -0.31f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x41400000    # 12.0f

    .line 101
    .line 102
    const/high16 v18, 0x40000000    # 2.0f

    .line 103
    .line 104
    const v13, 0x419b3333    # 19.4f

    .line 105
    .line 106
    .line 107
    const v14, 0x408a8f5c    # 4.33f

    .line 108
    .line 109
    .line 110
    const v15, 0x417fae14    # 15.98f

    .line 111
    .line 112
    .line 113
    const/high16 v16, 0x40000000    # 2.0f

    .line 114
    .line 115
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v17, 0x403f5c29    # 2.99f

    .line 119
    .line 120
    .line 121
    const v18, 0x40f5c28f    # 7.68f

    .line 122
    .line 123
    .line 124
    const v13, 0x410051ec    # 8.02f

    .line 125
    .line 126
    .line 127
    const/high16 v14, 0x40000000    # 2.0f

    .line 128
    .line 129
    const v15, 0x40933333    # 4.6f

    .line 130
    .line 131
    .line 132
    const v16, 0x408a8f5c    # 4.33f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, -0x4091eb85    # -0.93f

    .line 139
    .line 140
    .line 141
    const v18, 0x3eeb851f    # 0.46f

    .line 142
    .line 143
    .line 144
    const v13, -0x41570a3d    # -0.33f

    .line 145
    .line 146
    .line 147
    const v14, 0x3e19999a    # 0.15f

    .line 148
    .line 149
    .line 150
    const v15, -0x40dc28f6    # -0.64f

    .line 151
    .line 152
    .line 153
    const v16, 0x3e99999a    # 0.3f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v17, 0x3f800000    # 1.0f

    .line 160
    .line 161
    const v18, 0x411e8f5c    # 9.91f

    .line 162
    .line 163
    .line 164
    const v13, 0x3fb47ae1    # 1.41f

    .line 165
    .line 166
    .line 167
    const/high16 v14, 0x41080000    # 8.5f

    .line 168
    .line 169
    const/high16 v15, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const v16, 0x4112b852    # 9.17f

    .line 172
    .line 173
    .line 174
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v0, 0x4085c28f    # 4.18f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x3f866666    # 1.05f

    .line 184
    .line 185
    .line 186
    const v18, 0x3fe28f5c    # 1.77f

    .line 187
    .line 188
    .line 189
    const/4 v13, 0x0

    .line 190
    const v14, 0x3f3d70a4    # 0.74f

    .line 191
    .line 192
    .line 193
    const v15, 0x3ed1eb85    # 0.41f

    .line 194
    .line 195
    .line 196
    const v16, 0x3fb47ae1    # 1.41f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, 0x3f6e147b    # 0.93f

    .line 203
    .line 204
    .line 205
    const v18, 0x3eeb851f    # 0.46f

    .line 206
    .line 207
    .line 208
    const v13, 0x3e947ae1    # 0.29f

    .line 209
    .line 210
    .line 211
    const v14, 0x3e23d70a    # 0.16f

    .line 212
    .line 213
    .line 214
    const v15, 0x3f1c28f6    # 0.61f

    .line 215
    .line 216
    .line 217
    const v16, 0x3e9eb852    # 0.31f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v17, 0x41400000    # 12.0f

    .line 224
    .line 225
    const/high16 v18, 0x41b00000    # 22.0f

    .line 226
    .line 227
    const v13, 0x40933333    # 4.6f

    .line 228
    .line 229
    .line 230
    const v14, 0x419d5c29    # 19.67f

    .line 231
    .line 232
    .line 233
    const v15, 0x410051ec    # 8.02f

    .line 234
    .line 235
    .line 236
    const/high16 v16, 0x41b00000    # 22.0f

    .line 237
    .line 238
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v17, 0x411028f6    # 9.01f

    .line 242
    .line 243
    .line 244
    const v18, -0x3f4a3d71    # -5.68f

    .line 245
    .line 246
    .line 247
    const v13, 0x407eb852    # 3.98f

    .line 248
    .line 249
    .line 250
    const/4 v14, 0x0

    .line 251
    const v15, 0x40eccccd    # 7.4f

    .line 252
    .line 253
    .line 254
    const v16, -0x3feae148    # -2.33f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v17, 0x3f6e147b    # 0.93f

    .line 261
    .line 262
    .line 263
    const v18, -0x41147ae1    # -0.46f

    .line 264
    .line 265
    .line 266
    const v13, 0x3ea8f5c3    # 0.33f

    .line 267
    .line 268
    .line 269
    const v14, -0x41e66666    # -0.15f

    .line 270
    .line 271
    .line 272
    const v15, 0x3f23d70a    # 0.64f

    .line 273
    .line 274
    .line 275
    const v16, -0x41666666    # -0.3f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v17, 0x41b80000    # 23.0f

    .line 282
    .line 283
    const v18, 0x416170a4    # 14.09f

    .line 284
    .line 285
    .line 286
    const v13, 0x41b4b852    # 22.59f

    .line 287
    .line 288
    .line 289
    const/high16 v14, 0x41780000    # 15.5f

    .line 290
    .line 291
    const/high16 v15, 0x41b80000    # 23.0f

    .line 292
    .line 293
    const v16, 0x416d47ae    # 14.83f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x411e8f5c    # 9.91f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v17, 0x41af999a    # 21.95f

    .line 306
    .line 307
    .line 308
    const v18, 0x41026666    # 8.15f

    .line 309
    .line 310
    .line 311
    const/high16 v13, 0x41b80000    # 23.0f

    .line 312
    .line 313
    const v14, 0x4112b852    # 9.17f

    .line 314
    .line 315
    .line 316
    const v15, 0x41b4b852    # 22.59f

    .line 317
    .line 318
    .line 319
    const/high16 v16, 0x41080000    # 8.5f

    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v0, 0x41a80000    # 21.0f

    .line 328
    .line 329
    const v2, 0x411e8f5c    # 9.91f

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x41a80000    # 21.0f

    .line 336
    .line 337
    const v18, 0x411e8f5c    # 9.91f

    .line 338
    .line 339
    .line 340
    const/high16 v13, 0x41a80000    # 21.0f

    .line 341
    .line 342
    const v14, 0x411e8f5c    # 9.91f

    .line 343
    .line 344
    .line 345
    const/high16 v15, 0x41a80000    # 21.0f

    .line 346
    .line 347
    const v16, 0x411e8f5c    # 9.91f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v0, 0x4086147b    # 4.19f

    .line 354
    .line 355
    .line 356
    const/4 v2, 0x0

    .line 357
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x41400000    # 12.0f

    .line 361
    .line 362
    const/high16 v18, 0x41800000    # 16.0f

    .line 363
    .line 364
    const v13, 0x41967ae1    # 18.81f

    .line 365
    .line 366
    .line 367
    const v14, 0x4174f5c3    # 15.31f

    .line 368
    .line 369
    .line 370
    const v15, 0x41787ae1    # 15.53f

    .line 371
    .line 372
    .line 373
    const/high16 v16, 0x41800000    # 16.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 379
    .line 380
    const v18, -0x400b851f    # -1.91f

    .line 381
    .line 382
    .line 383
    const v13, -0x3f9e147b    # -3.53f

    .line 384
    .line 385
    .line 386
    const/4 v14, 0x0

    .line 387
    const v15, -0x3f26147b    # -6.81f

    .line 388
    .line 389
    .line 390
    const v16, -0x40cccccd    # -0.7f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/16 v17, 0x0

    .line 397
    .line 398
    const/16 v18, 0x0

    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const/4 v15, 0x0

    .line 402
    const/16 v16, 0x0

    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, -0x3f7a3d71    # -4.18f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v17, 0x41400000    # 12.0f

    .line 414
    .line 415
    const/high16 v18, 0x41000000    # 8.0f

    .line 416
    .line 417
    const v13, 0x40a66666    # 5.2f

    .line 418
    .line 419
    .line 420
    const v14, 0x410b0a3d    # 8.69f

    .line 421
    .line 422
    .line 423
    const v15, 0x4107851f    # 8.47f

    .line 424
    .line 425
    .line 426
    const/high16 v16, 0x41000000    # 8.0f

    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x41a80000    # 21.0f

    .line 432
    .line 433
    const v18, 0x411e8f5c    # 9.91f

    .line 434
    .line 435
    .line 436
    const v13, 0x41787ae1    # 15.53f

    .line 437
    .line 438
    .line 439
    const/high16 v14, 0x41000000    # 8.0f

    .line 440
    .line 441
    const v15, 0x41967ae1    # 18.81f

    .line 442
    .line 443
    .line 444
    const v16, 0x410b3333    # 8.7f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x40800000    # 4.0f

    .line 454
    .line 455
    const/high16 v2, 0x41400000    # 12.0f

    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v17, 0x40be6666    # 5.95f

    .line 461
    .line 462
    .line 463
    const v18, 0x402b851f    # 2.68f

    .line 464
    .line 465
    .line 466
    const v13, 0x4017ae14    # 2.37f

    .line 467
    .line 468
    .line 469
    const/4 v14, 0x0

    .line 470
    const v15, 0x408fae14    # 4.49f

    .line 471
    .line 472
    .line 473
    const v16, 0x3f851eb8    # 1.04f

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, 0x41400000    # 12.0f

    .line 480
    .line 481
    const/high16 v18, 0x40c00000    # 6.0f

    .line 482
    .line 483
    const v13, 0x41815c29    # 16.17f

    .line 484
    .line 485
    .line 486
    const/high16 v14, 0x40c80000    # 6.25f

    .line 487
    .line 488
    const v15, 0x41626666    # 14.15f

    .line 489
    .line 490
    .line 491
    const/high16 v16, 0x40c00000    # 6.0f

    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x40c1999a    # 6.05f

    .line 497
    .line 498
    .line 499
    const v18, 0x40d5c28f    # 6.68f

    .line 500
    .line 501
    .line 502
    const v13, 0x411d999a    # 9.85f

    .line 503
    .line 504
    .line 505
    const/high16 v14, 0x40c00000    # 6.0f

    .line 506
    .line 507
    const v15, 0x40fa8f5c    # 7.83f

    .line 508
    .line 509
    .line 510
    const/high16 v16, 0x40c80000    # 6.25f

    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x41400000    # 12.0f

    .line 516
    .line 517
    const/high16 v18, 0x40800000    # 4.0f

    .line 518
    .line 519
    const v13, 0x40f051ec    # 7.51f

    .line 520
    .line 521
    .line 522
    const v14, 0x40a147ae    # 5.04f

    .line 523
    .line 524
    .line 525
    const v15, 0x411a147b    # 9.63f

    .line 526
    .line 527
    .line 528
    const/high16 v16, 0x40800000    # 4.0f

    .line 529
    .line 530
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v0, 0x41a00000    # 20.0f

    .line 537
    .line 538
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, -0x3f41999a    # -5.95f

    .line 542
    .line 543
    .line 544
    const v18, -0x3fd47ae1    # -2.68f

    .line 545
    .line 546
    .line 547
    const v13, -0x3fe851ec    # -2.37f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const v15, -0x3f7051ec    # -4.49f

    .line 552
    .line 553
    .line 554
    const v16, -0x407ae148    # -1.04f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v17, 0x41400000    # 12.0f

    .line 561
    .line 562
    const/high16 v18, 0x41900000    # 18.0f

    .line 563
    .line 564
    const v13, 0x40fa8f5c    # 7.83f

    .line 565
    .line 566
    .line 567
    const/high16 v14, 0x418e0000    # 17.75f

    .line 568
    .line 569
    const v15, 0x411d999a    # 9.85f

    .line 570
    .line 571
    .line 572
    const/high16 v16, 0x41900000    # 18.0f

    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, 0x40be6666    # 5.95f

    .line 578
    .line 579
    .line 580
    const v2, -0x40d1eb85    # -0.68f

    .line 581
    .line 582
    .line 583
    const v4, 0x408570a4    # 4.17f

    .line 584
    .line 585
    .line 586
    const/high16 v6, -0x41800000    # -0.25f

    .line 587
    .line 588
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v18, 0x41a00000    # 20.0f

    .line 592
    .line 593
    const v13, 0x4183eb85    # 16.49f

    .line 594
    .line 595
    .line 596
    const v14, 0x4197ae14    # 18.96f

    .line 597
    .line 598
    .line 599
    const v15, 0x4165eb85    # 14.37f

    .line 600
    .line 601
    .line 602
    const/high16 v16, 0x41a00000    # 20.0f

    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    const/16 v16, 0x3800

    .line 615
    .line 616
    const/16 v17, 0x0

    .line 617
    .line 618
    const/high16 v6, 0x3f800000    # 1.0f

    .line 619
    .line 620
    const/high16 v8, 0x3f800000    # 1.0f

    .line 621
    .line 622
    const/4 v7, 0x0

    .line 623
    const/high16 v9, 0x3f800000    # 1.0f

    .line 624
    .line 625
    const/high16 v12, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const/4 v13, 0x0

    .line 628
    const/4 v14, 0x0

    .line 629
    const/4 v15, 0x0

    .line 630
    const-string v4, ""

    .line 631
    .line 632
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    sput-object v0, Landroidx/compose/material/icons/outlined/PanoramaPhotosphereKt;->_panoramaPhotosphere:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 641
    .line 642
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    return-object v0
.end method

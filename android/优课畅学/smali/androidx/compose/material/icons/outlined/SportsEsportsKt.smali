.class public final Landroidx/compose/material/icons/outlined/SportsEsportsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsEsports:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsEsports(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SportsEsportsKt;->_sportsEsports:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SportsEsports"

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
    const v4, 0x41aca3d7    # 21.58f

    .line 71
    .line 72
    .line 73
    const v6, 0x4180b852    # 16.09f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3f0ae148    # -7.66f

    .line 80
    .line 81
    .line 82
    const v6, -0x40747ae1    # -1.09f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x41843d71    # 16.53f

    .line 89
    .line 90
    .line 91
    const/high16 v26, 0x40a00000    # 5.0f

    .line 92
    .line 93
    const v21, 0x41a1ae14    # 20.21f

    .line 94
    .line 95
    .line 96
    const v22, 0x40ceb852    # 6.46f

    .line 97
    .line 98
    .line 99
    const v23, 0x419428f6    # 18.52f

    .line 100
    .line 101
    .line 102
    const/high16 v24, 0x40a00000    # 5.0f

    .line 103
    .line 104
    move-object/from16 v20, v2

    .line 105
    .line 106
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, 0x40ef0a3d    # 7.47f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v25, 0x4060a3d7    # 3.51f

    .line 116
    .line 117
    .line 118
    const v26, 0x4106e148    # 8.43f

    .line 119
    .line 120
    .line 121
    const v21, 0x40af5c29    # 5.48f

    .line 122
    .line 123
    .line 124
    const/high16 v22, 0x40a00000    # 5.0f

    .line 125
    .line 126
    const v23, 0x40728f5c    # 3.79f

    .line 127
    .line 128
    .line 129
    const v24, 0x40ceb852    # 6.46f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v4, 0x40f51eb8    # 7.66f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v25, 0x409e147b    # 4.94f

    .line 142
    .line 143
    .line 144
    const/high16 v26, 0x41980000    # 19.0f

    .line 145
    .line 146
    const v21, 0x400ccccd    # 2.2f

    .line 147
    .line 148
    .line 149
    const v22, 0x418d0a3d    # 17.63f

    .line 150
    .line 151
    .line 152
    const v23, 0x4058f5c3    # 3.39f

    .line 153
    .line 154
    .line 155
    const/high16 v24, 0x41980000    # 19.0f

    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const/4 v4, 0x0

    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v25, 0x3fe66666    # 1.8f

    .line 165
    .line 166
    .line 167
    const/high16 v26, -0x40c00000    # -0.75f

    .line 168
    .line 169
    const v21, 0x3f2e147b    # 0.68f

    .line 170
    .line 171
    .line 172
    const/16 v22, 0x0

    .line 173
    .line 174
    const v23, 0x3fa8f5c3    # 1.32f

    .line 175
    .line 176
    .line 177
    const v24, -0x4175c28f    # -0.27f

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v4, 0x41800000    # 16.0f

    .line 184
    .line 185
    const/high16 v6, 0x41100000    # 9.0f

    .line 186
    .line 187
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x40c00000    # 6.0f

    .line 191
    .line 192
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v4, 0x40100000    # 2.25f

    .line 196
    .line 197
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v26, 0x3f400000    # 0.75f

    .line 201
    .line 202
    const v21, 0x3ef5c28f    # 0.48f

    .line 203
    .line 204
    .line 205
    const v22, 0x3ef5c28f    # 0.48f

    .line 206
    .line 207
    .line 208
    const v23, 0x3f90a3d7    # 1.13f

    .line 209
    .line 210
    .line 211
    const/high16 v24, 0x3f400000    # 0.75f

    .line 212
    .line 213
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/4 v4, 0x0

    .line 217
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v25, 0x41aca3d7    # 21.58f

    .line 221
    .line 222
    .line 223
    const v26, 0x4180b852    # 16.09f

    .line 224
    .line 225
    .line 226
    const v21, 0x41a4e148    # 20.61f

    .line 227
    .line 228
    .line 229
    const/high16 v22, 0x41980000    # 19.0f

    .line 230
    .line 231
    const v23, 0x41ae6666    # 21.8f

    .line 232
    .line 233
    .line 234
    const v24, 0x418d0a3d    # 17.63f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, 0x419bd70a    # 19.48f

    .line 244
    .line 245
    .line 246
    const v6, 0x41867ae1    # 16.81f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v25, 0x41987ae1    # 19.06f

    .line 253
    .line 254
    .line 255
    const/high16 v26, 0x41880000    # 17.0f

    .line 256
    .line 257
    const v21, 0x419b3333    # 19.4f

    .line 258
    .line 259
    .line 260
    const v22, 0x41873333    # 16.9f

    .line 261
    .line 262
    .line 263
    const v23, 0x419a28f6    # 19.27f

    .line 264
    .line 265
    .line 266
    const/high16 v24, 0x41880000    # 17.0f

    .line 267
    .line 268
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v25, -0x413851ec    # -0.39f

    .line 272
    .line 273
    .line 274
    const v26, -0x41dc28f6    # -0.16f

    .line 275
    .line 276
    .line 277
    const v21, -0x41e66666    # -0.15f

    .line 278
    .line 279
    .line 280
    const/16 v22, 0x0

    .line 281
    .line 282
    const v23, -0x416b851f    # -0.29f

    .line 283
    .line 284
    .line 285
    const v24, -0x428a3d71    # -0.06f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, 0x417d47ae    # 15.83f

    .line 292
    .line 293
    .line 294
    const/high16 v6, 0x41600000    # 14.0f

    .line 295
    .line 296
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v4, 0x4102b852    # 8.17f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v4, -0x3fca3d71    # -2.84f

    .line 306
    .line 307
    .line 308
    const v6, 0x4035c28f    # 2.84f

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, 0x409e147b    # 4.94f

    .line 315
    .line 316
    .line 317
    const/high16 v26, 0x41880000    # 17.0f

    .line 318
    .line 319
    const v21, 0x40a75c29    # 5.23f

    .line 320
    .line 321
    .line 322
    const v22, 0x4187851f    # 16.94f

    .line 323
    .line 324
    .line 325
    const v23, 0x40a2e148    # 5.09f

    .line 326
    .line 327
    .line 328
    const/high16 v24, 0x41880000    # 17.0f

    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v25, -0x4128f5c3    # -0.42f

    .line 334
    .line 335
    .line 336
    const v26, -0x41bd70a4    # -0.19f

    .line 337
    .line 338
    .line 339
    const v21, -0x41a8f5c3    # -0.21f

    .line 340
    .line 341
    .line 342
    const/16 v22, 0x0

    .line 343
    .line 344
    const v23, -0x4151eb85    # -0.34f

    .line 345
    .line 346
    .line 347
    const v24, -0x42333333    # -0.1f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v25, -0x41fae148    # -0.13f

    .line 354
    .line 355
    .line 356
    const v26, -0x411eb852    # -0.44f

    .line 357
    .line 358
    .line 359
    const v21, -0x425c28f6    # -0.08f

    .line 360
    .line 361
    .line 362
    const v22, -0x4247ae14    # -0.09f

    .line 363
    .line 364
    .line 365
    const v23, -0x41dc28f6    # -0.16f

    .line 366
    .line 367
    .line 368
    const v24, -0x41947ae1    # -0.23f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, 0x3f8b851f    # 1.09f

    .line 375
    .line 376
    .line 377
    const v6, -0x3f0ae148    # -7.66f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, 0x40ef0a3d    # 7.47f

    .line 384
    .line 385
    .line 386
    const/high16 v26, 0x40e00000    # 7.0f

    .line 387
    .line 388
    const v21, 0x40b428f6    # 5.63f

    .line 389
    .line 390
    .line 391
    const v22, 0x40f7ae14    # 7.74f

    .line 392
    .line 393
    .line 394
    const v23, 0x40cf5c29    # 6.48f

    .line 395
    .line 396
    .line 397
    const/high16 v24, 0x40e00000    # 7.0f

    .line 398
    .line 399
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v4, 0x4110f5c3    # 9.06f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v25, 0x3ffd70a4    # 1.98f

    .line 409
    .line 410
    .line 411
    const v26, 0x3fdc28f6    # 1.72f

    .line 412
    .line 413
    .line 414
    const v21, 0x3f7d70a4    # 0.99f

    .line 415
    .line 416
    .line 417
    const/16 v22, 0x0

    .line 418
    .line 419
    const v23, 0x3feb851f    # 1.84f

    .line 420
    .line 421
    .line 422
    const v24, 0x3f3d70a4    # 0.74f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v4, 0x3f8b851f    # 1.09f

    .line 429
    .line 430
    .line 431
    const v6, 0x40f51eb8    # 7.66f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v25, 0x419bd70a    # 19.48f

    .line 438
    .line 439
    .line 440
    const v26, 0x41867ae1    # 16.81f

    .line 441
    .line 442
    .line 443
    const v21, 0x419d0a3d    # 19.63f

    .line 444
    .line 445
    .line 446
    const v22, 0x4184a3d7    # 16.58f

    .line 447
    .line 448
    .line 449
    const v23, 0x419c6666    # 19.55f

    .line 450
    .line 451
    .line 452
    const v24, 0x4185c28f    # 16.72f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    const/16 v16, 0x3800

    .line 466
    .line 467
    const/16 v17, 0x0

    .line 468
    .line 469
    const/high16 v6, 0x3f800000    # 1.0f

    .line 470
    .line 471
    const/high16 v8, 0x3f800000    # 1.0f

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    const/high16 v9, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/high16 v12, 0x3f800000    # 1.0f

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const/4 v14, 0x0

    .line 480
    const/4 v15, 0x0

    .line 481
    const-string v4, ""

    .line 482
    .line 483
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 484
    .line 485
    .line 486
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 491
    .line 492
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 493
    .line 494
    .line 495
    move-result-wide v6

    .line 496
    const/4 v2, 0x0

    .line 497
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 501
    .line 502
    .line 503
    move-result v10

    .line 504
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 505
    .line 506
    .line 507
    move-result v11

    .line 508
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 511
    .line 512
    .line 513
    const/high16 v4, 0x41000000    # 8.0f

    .line 514
    .line 515
    const/high16 v6, 0x41100000    # 9.0f

    .line 516
    .line 517
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v4, -0x40800000    # -1.0f

    .line 521
    .line 522
    const/4 v6, 0x0

    .line 523
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v4, 0x40000000    # 2.0f

    .line 527
    .line 528
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v4, -0x40000000    # -2.0f

    .line 532
    .line 533
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x3f800000    # 1.0f

    .line 537
    .line 538
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v4, 0x40000000    # 2.0f

    .line 542
    .line 543
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v4, 0x3f800000    # 1.0f

    .line 550
    .line 551
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/high16 v4, -0x40000000    # -2.0f

    .line 555
    .line 556
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v4, 0x40000000    # 2.0f

    .line 560
    .line 561
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v4, -0x40800000    # -1.0f

    .line 565
    .line 566
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const/high16 v4, -0x40000000    # -2.0f

    .line 570
    .line 571
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const/high16 v6, 0x3f800000    # 1.0f

    .line 582
    .line 583
    const/4 v7, 0x0

    .line 584
    const-string v4, ""

    .line 585
    .line 586
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 587
    .line 588
    .line 589
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 594
    .line 595
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 596
    .line 597
    .line 598
    move-result-wide v6

    .line 599
    const/4 v2, 0x0

    .line 600
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 604
    .line 605
    .line 606
    move-result v10

    .line 607
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 608
    .line 609
    .line 610
    move-result v11

    .line 611
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 614
    .line 615
    .line 616
    const/high16 v4, 0x41880000    # 17.0f

    .line 617
    .line 618
    const/high16 v6, 0x41400000    # 12.0f

    .line 619
    .line 620
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v4, -0x40800000    # -1.0f

    .line 624
    .line 625
    const/4 v6, 0x0

    .line 626
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const/high16 v26, 0x40000000    # 2.0f

    .line 630
    .line 631
    const/16 v27, 0x0

    .line 632
    .line 633
    const/high16 v21, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/high16 v22, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/16 v23, 0x0

    .line 638
    .line 639
    const/16 v24, 0x1

    .line 640
    .line 641
    const/16 v25, 0x1

    .line 642
    .line 643
    move-object/from16 v20, v2

    .line 644
    .line 645
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v26, -0x40000000    # -2.0f

    .line 649
    .line 650
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    const/high16 v6, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/4 v7, 0x0

    .line 660
    const-string v4, ""

    .line 661
    .line 662
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 663
    .line 664
    .line 665
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 670
    .line 671
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 672
    .line 673
    .line 674
    move-result-wide v6

    .line 675
    const/4 v0, 0x0

    .line 676
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 680
    .line 681
    .line 682
    move-result v10

    .line 683
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 684
    .line 685
    .line 686
    move-result v11

    .line 687
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 690
    .line 691
    .line 692
    const/high16 v0, 0x41700000    # 15.0f

    .line 693
    .line 694
    const/high16 v2, 0x41100000    # 9.0f

    .line 695
    .line 696
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v0, -0x40800000    # -1.0f

    .line 700
    .line 701
    const/4 v2, 0x0

    .line 702
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v18, 0x40000000    # 2.0f

    .line 706
    .line 707
    const/16 v19, 0x0

    .line 708
    .line 709
    const/high16 v13, 0x3f800000    # 1.0f

    .line 710
    .line 711
    const/high16 v14, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/16 v16, 0x1

    .line 714
    .line 715
    const/16 v17, 0x1

    .line 716
    .line 717
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v18, -0x40000000    # -2.0f

    .line 721
    .line 722
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    const/16 v16, 0x3800

    .line 730
    .line 731
    const/16 v17, 0x0

    .line 732
    .line 733
    const/high16 v6, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/4 v7, 0x0

    .line 736
    const/high16 v12, 0x3f800000    # 1.0f

    .line 737
    .line 738
    const/4 v13, 0x0

    .line 739
    const/4 v14, 0x0

    .line 740
    const-string v4, ""

    .line 741
    .line 742
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    sput-object v0, Landroidx/compose/material/icons/outlined/SportsEsportsKt;->_sportsEsports:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 751
    .line 752
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    return-object v0
.end method

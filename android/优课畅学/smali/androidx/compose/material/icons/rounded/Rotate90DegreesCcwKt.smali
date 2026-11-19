.class public final Landroidx/compose/material/icons/rounded/Rotate90DegreesCcwKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rotate90DegreesCcw:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRotate90DegreesCcw(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Rotate90DegreesCcwKt;->_rotate90DegreesCcw:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Rotate90DegreesCcw"

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
    const v0, 0x40bdc28f    # 5.93f

    .line 71
    .line 72
    .line 73
    const v2, 0x40fa8f5c    # 7.83f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x3f966666    # -3.65f

    .line 80
    .line 81
    .line 82
    const v2, 0x406a3d71    # 3.66f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const v18, 0x40351eb8    # 2.83f

    .line 91
    .line 92
    .line 93
    const v13, -0x40b851ec    # -0.78f

    .line 94
    .line 95
    .line 96
    const v14, 0x3f47ae14    # 0.78f

    .line 97
    .line 98
    .line 99
    const v15, -0x40b851ec    # -0.78f

    .line 100
    .line 101
    .line 102
    const v16, 0x40033333    # 2.05f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, 0x406a3d71    # 3.66f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x40351eb8    # 2.83f

    .line 115
    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const v13, 0x3f47ae14    # 0.78f

    .line 120
    .line 121
    .line 122
    const v15, 0x40033333    # 2.05f

    .line 123
    .line 124
    .line 125
    const v16, 0x3f47ae14    # 0.78f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, -0x3f966666    # -3.65f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const v18, -0x3fcae148    # -2.83f

    .line 140
    .line 141
    .line 142
    const v14, -0x40b851ec    # -0.78f

    .line 143
    .line 144
    .line 145
    const v15, 0x3f47ae14    # 0.78f

    .line 146
    .line 147
    .line 148
    const v16, -0x3ffccccd    # -2.05f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x410c28f6    # 8.76f

    .line 155
    .line 156
    .line 157
    const v2, 0x40fa3d71    # 7.82f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, -0x3fcae148    # -2.83f

    .line 164
    .line 165
    .line 166
    const v18, 0x3c23d70a    # 0.01f

    .line 167
    .line 168
    .line 169
    const v13, -0x40b5c28f    # -0.79f

    .line 170
    .line 171
    .line 172
    const v15, -0x3ffccccd    # -2.05f

    .line 173
    .line 174
    .line 175
    const v16, -0x40b851ec    # -0.78f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v0, 0x41430a3d    # 12.19f

    .line 185
    .line 186
    .line 187
    const v2, 0x408ccccd    # 4.4f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 194
    .line 195
    const/high16 v2, 0x40100000    # 2.25f

    .line 196
    .line 197
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, 0x3fb5c28f    # 1.42f

    .line 201
    .line 202
    .line 203
    const/16 v18, 0x0

    .line 204
    .line 205
    const v13, 0x3ec7ae14    # 0.39f

    .line 206
    .line 207
    .line 208
    const v14, -0x413851ec    # -0.39f

    .line 209
    .line 210
    .line 211
    const v15, 0x3f828f5c    # 1.02f

    .line 212
    .line 213
    .line 214
    const v16, -0x413851ec    # -0.39f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x400f5c29    # 2.24f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    const v18, 0x3fb47ae1    # 1.41f

    .line 229
    .line 230
    .line 231
    const v14, 0x3ec7ae14    # 0.39f

    .line 232
    .line 233
    .line 234
    const v15, 0x3ec7ae14    # 0.39f

    .line 235
    .line 236
    .line 237
    const v16, 0x3f828f5c    # 1.02f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v0, -0x3ff00000    # -2.25f

    .line 244
    .line 245
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v17, -0x404a3d71    # -1.42f

    .line 249
    .line 250
    .line 251
    const/16 v18, 0x0

    .line 252
    .line 253
    const v13, -0x413851ec    # -0.39f

    .line 254
    .line 255
    .line 256
    const v15, -0x407d70a4    # -1.02f

    .line 257
    .line 258
    .line 259
    const v16, 0x3ec7ae14    # 0.39f

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x4159c28f    # 13.61f

    .line 266
    .line 267
    .line 268
    const v2, 0x408ccccd    # 4.4f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const/16 v17, 0x0

    .line 275
    .line 276
    const v18, -0x404a3d71    # -1.42f

    .line 277
    .line 278
    .line 279
    const v14, -0x413851ec    # -0.39f

    .line 280
    .line 281
    .line 282
    const v15, -0x413851ec    # -0.39f

    .line 283
    .line 284
    .line 285
    const v16, -0x407c28f6    # -1.03f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v0, 0x419ae148    # 19.36f

    .line 295
    .line 296
    .line 297
    const v2, 0x40d47ae1    # 6.64f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x41500000    # 13.0f

    .line 304
    .line 305
    const/high16 v18, 0x40800000    # 4.0f

    .line 306
    .line 307
    const v13, 0x418ce148    # 17.61f

    .line 308
    .line 309
    .line 310
    const v14, 0x409c28f6    # 4.88f

    .line 311
    .line 312
    .line 313
    const v15, 0x4174cccd    # 15.3f

    .line 314
    .line 315
    .line 316
    const/high16 v16, 0x40800000    # 4.0f

    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v0, -0x40ab851f    # -0.83f

    .line 322
    .line 323
    .line 324
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v17, -0x40251eb8    # -1.71f

    .line 328
    .line 329
    .line 330
    const v18, -0x40ca3d71    # -0.71f

    .line 331
    .line 332
    .line 333
    const/4 v13, 0x0

    .line 334
    const v14, -0x409c28f6    # -0.89f

    .line 335
    .line 336
    .line 337
    const v15, -0x4075c28f    # -1.08f

    .line 338
    .line 339
    .line 340
    const v16, -0x40547ae1    # -1.34f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v0, 0x4117851f    # 9.47f

    .line 347
    .line 348
    .line 349
    const v2, 0x408947ae    # 4.29f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const/16 v17, 0x0

    .line 356
    .line 357
    const v18, 0x3fb47ae1    # 1.41f

    .line 358
    .line 359
    .line 360
    const v13, -0x413851ec    # -0.39f

    .line 361
    .line 362
    .line 363
    const v14, 0x3ec7ae14    # 0.39f

    .line 364
    .line 365
    .line 366
    const v15, -0x413851ec    # -0.39f

    .line 367
    .line 368
    .line 369
    const v16, 0x3f828f5c    # 1.02f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x3fea3d71    # 1.83f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x3fd9999a    # 1.7f

    .line 382
    .line 383
    .line 384
    const v18, -0x40cccccd    # -0.7f

    .line 385
    .line 386
    .line 387
    const v13, 0x3f1eb852    # 0.62f

    .line 388
    .line 389
    .line 390
    const v14, 0x3f2147ae    # 0.63f

    .line 391
    .line 392
    .line 393
    const v15, 0x3fd9999a    # 1.7f

    .line 394
    .line 395
    .line 396
    const v16, 0x3e428f5c    # 0.19f

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v0, 0x41500000    # 13.0f

    .line 403
    .line 404
    const/high16 v2, 0x40c00000    # 6.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x40ae6666    # 5.45f

    .line 410
    .line 411
    .line 412
    const v18, 0x40270a3d    # 2.61f

    .line 413
    .line 414
    .line 415
    const v13, 0x400147ae    # 2.02f

    .line 416
    .line 417
    .line 418
    const/4 v14, 0x0

    .line 419
    const v15, 0x4080f5c3    # 4.03f

    .line 420
    .line 421
    .line 422
    const v16, 0x3f5c28f6    # 0.86f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    const v18, 0x410ca3d7    # 8.79f

    .line 431
    .line 432
    .line 433
    const v13, 0x40033333    # 2.05f

    .line 434
    .line 435
    .line 436
    const v14, 0x402147ae    # 2.52f

    .line 437
    .line 438
    .line 439
    const v15, 0x40033333    # 2.05f

    .line 440
    .line 441
    .line 442
    const v16, 0x40c8a3d7    # 6.27f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v17, 0x41500000    # 13.0f

    .line 449
    .line 450
    const/high16 v18, 0x41a00000    # 20.0f

    .line 451
    .line 452
    const v13, 0x41883d71    # 17.03f

    .line 453
    .line 454
    .line 455
    const v14, 0x41991eb8    # 19.14f

    .line 456
    .line 457
    .line 458
    const v15, 0x417051ec    # 15.02f

    .line 459
    .line 460
    .line 461
    const/high16 v16, 0x41a00000    # 20.0f

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, -0x3fed70a4    # -2.29f

    .line 467
    .line 468
    .line 469
    const v18, -0x413851ec    # -0.39f

    .line 470
    .line 471
    .line 472
    const v13, -0x40b851ec    # -0.78f

    .line 473
    .line 474
    .line 475
    const/4 v14, 0x0

    .line 476
    const v15, -0x4039999a    # -1.55f

    .line 477
    .line 478
    .line 479
    const v16, -0x41fae148    # -0.13f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, -0x407d70a4    # -1.02f

    .line 486
    .line 487
    .line 488
    const v18, 0x3e851eb8    # 0.26f

    .line 489
    .line 490
    .line 491
    const v13, -0x4147ae14    # -0.36f

    .line 492
    .line 493
    .line 494
    const v14, -0x420a3d71    # -0.12f

    .line 495
    .line 496
    .line 497
    const/high16 v15, -0x40c00000    # -0.75f

    .line 498
    .line 499
    const v16, -0x43dc28f6    # -0.01f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x3eae147b    # 0.34f

    .line 506
    .line 507
    .line 508
    const v18, 0x3fcf5c29    # 1.62f

    .line 509
    .line 510
    .line 511
    const/high16 v13, -0x41000000    # -0.5f

    .line 512
    .line 513
    const/high16 v14, 0x3f000000    # 0.5f

    .line 514
    .line 515
    const v15, -0x4151eb85    # -0.34f

    .line 516
    .line 517
    .line 518
    const v16, 0x3fb1eb85    # 1.39f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, 0x403e147b    # 2.97f

    .line 525
    .line 526
    .line 527
    const v18, 0x3f028f5c    # 0.51f

    .line 528
    .line 529
    .line 530
    const v13, 0x3f75c28f    # 0.96f

    .line 531
    .line 532
    .line 533
    const v14, 0x3eae147b    # 0.34f

    .line 534
    .line 535
    .line 536
    const v15, 0x3ffae148    # 1.96f

    .line 537
    .line 538
    .line 539
    const v16, 0x3f028f5c    # 0.51f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v17, 0x40cb851f    # 6.36f

    .line 546
    .line 547
    .line 548
    const v18, -0x3fd70a3d    # -2.64f

    .line 549
    .line 550
    .line 551
    const v13, 0x40133333    # 2.3f

    .line 552
    .line 553
    .line 554
    const/4 v14, 0x0

    .line 555
    const v15, 0x4093851f    # 4.61f

    .line 556
    .line 557
    .line 558
    const v16, -0x409eb852    # -0.88f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/16 v17, 0x0

    .line 565
    .line 566
    const v18, -0x3eb47ae1    # -12.72f

    .line 567
    .line 568
    .line 569
    const v13, 0x406147ae    # 3.52f

    .line 570
    .line 571
    .line 572
    const v14, -0x3f9f5c29    # -3.51f

    .line 573
    .line 574
    .line 575
    const v15, 0x406147ae    # 3.52f

    .line 576
    .line 577
    .line 578
    const v16, -0x3eeca3d7    # -9.21f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    const/16 v16, 0x3800

    .line 592
    .line 593
    const/16 v17, 0x0

    .line 594
    .line 595
    const/high16 v6, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/high16 v8, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v7, 0x0

    .line 600
    const/high16 v9, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const/high16 v12, 0x3f800000    # 1.0f

    .line 603
    .line 604
    const/4 v13, 0x0

    .line 605
    const/4 v14, 0x0

    .line 606
    const/4 v15, 0x0

    .line 607
    const-string v4, ""

    .line 608
    .line 609
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    sput-object v0, Landroidx/compose/material/icons/rounded/Rotate90DegreesCcwKt;->_rotate90DegreesCcw:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 618
    .line 619
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/GrassKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _grass:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGrass(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GrassKt;->_grass:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Grass"

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
    const v0, 0x417a3d71    # 15.64f

    .line 71
    .line 72
    .line 73
    const v2, 0x413051ec    # 11.02f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x4023d70a    # 2.56f

    .line 80
    .line 81
    .line 82
    const v18, -0x3f8ae148    # -3.83f

    .line 83
    .line 84
    .line 85
    const v13, 0x3f0ccccd    # 0.55f

    .line 86
    .line 87
    .line 88
    const v14, -0x4043d70a    # -1.47f

    .line 89
    .line 90
    .line 91
    const v15, 0x3fb70a3d    # 1.43f

    .line 92
    .line 93
    .line 94
    const v16, -0x3fce147b    # -2.78f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x41147ae1    # -0.46f

    .line 101
    .line 102
    .line 103
    const v18, -0x40a66666    # -0.85f

    .line 104
    .line 105
    .line 106
    const v13, 0x3ec28f5c    # 0.38f

    .line 107
    .line 108
    .line 109
    const v14, -0x4147ae14    # -0.36f

    .line 110
    .line 111
    .line 112
    const v15, 0x3d23d70a    # 0.04f

    .line 113
    .line 114
    .line 115
    const/high16 v16, -0x40800000    # -1.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v17, -0x3f4851ec    # -5.74f

    .line 121
    .line 122
    .line 123
    const v18, 0x40f6147b    # 7.69f

    .line 124
    .line 125
    .line 126
    const v13, -0x3fab851f    # -3.32f

    .line 127
    .line 128
    .line 129
    const v14, 0x3f7ae148    # 0.98f

    .line 130
    .line 131
    .line 132
    const/high16 v15, -0x3f480000    # -5.75f

    .line 133
    .line 134
    const v16, 0x4081999a    # 4.05f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/16 v17, 0x0

    .line 141
    .line 142
    const/16 v18, 0x0

    .line 143
    .line 144
    const/4 v13, 0x0

    .line 145
    const/4 v14, 0x0

    .line 146
    const/4 v15, 0x0

    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, 0x417a3d71    # 15.64f

    .line 153
    .line 154
    .line 155
    const v18, 0x413051ec    # 11.02f

    .line 156
    .line 157
    .line 158
    const v13, 0x414f3333    # 12.95f

    .line 159
    .line 160
    .line 161
    const/high16 v14, 0x414c0000    # 12.75f

    .line 162
    .line 163
    const v15, 0x41633333    # 14.2f

    .line 164
    .line 165
    .line 166
    const v16, 0x413b851f    # 11.72f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x4136b852    # 11.42f

    .line 176
    .line 177
    .line 178
    const v2, 0x410d999a    # 8.85f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, -0x3fc28f5c    # -2.96f

    .line 185
    .line 186
    .line 187
    const v18, -0x3f8851ec    # -3.87f

    .line 188
    .line 189
    .line 190
    const v13, -0x40e66666    # -0.6f

    .line 191
    .line 192
    .line 193
    const v14, -0x403851ec    # -1.56f

    .line 194
    .line 195
    .line 196
    const v15, -0x402f5c29    # -1.63f

    .line 197
    .line 198
    .line 199
    const v16, -0x3fc5c28f    # -2.91f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v17, 0x40f7ae14    # 7.74f

    .line 206
    .line 207
    .line 208
    const v18, 0x40b428f6    # 5.63f

    .line 209
    .line 210
    .line 211
    const v13, 0x4100a3d7    # 8.04f

    .line 212
    .line 213
    .line 214
    const v14, 0x4095c28f    # 4.68f

    .line 215
    .line 216
    .line 217
    const/high16 v15, 0x40f00000    # 7.5f

    .line 218
    .line 219
    const v16, 0x40a570a4    # 5.17f

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v17, 0x41100000    # 9.0f

    .line 226
    .line 227
    const v18, 0x412b5c29    # 10.71f

    .line 228
    .line 229
    .line 230
    const v13, 0x4108a3d7    # 8.54f

    .line 231
    .line 232
    .line 233
    const v14, 0x40e4cccd    # 7.15f

    .line 234
    .line 235
    .line 236
    const/high16 v15, 0x41100000    # 9.0f

    .line 237
    .line 238
    const v16, 0x410e147b    # 8.88f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, -0x42dc28f6    # -0.04f

    .line 245
    .line 246
    .line 247
    const v18, 0x3f1c28f6    # 0.61f

    .line 248
    .line 249
    .line 250
    const/4 v13, 0x0

    .line 251
    const v14, 0x3e570a3d    # 0.21f

    .line 252
    .line 253
    .line 254
    const v15, -0x430a3d71    # -0.03f

    .line 255
    .line 256
    .line 257
    const v16, 0x3ed1eb85    # 0.41f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v17, 0x3f9c28f6    # 1.22f

    .line 264
    .line 265
    .line 266
    const v18, 0x3f51eb85    # 0.82f

    .line 267
    .line 268
    .line 269
    const v13, 0x3edc28f6    # 0.43f

    .line 270
    .line 271
    .line 272
    const v14, 0x3e75c28f    # 0.24f

    .line 273
    .line 274
    .line 275
    const v15, 0x3f547ae1    # 0.83f

    .line 276
    .line 277
    .line 278
    const v16, 0x3f051eb8    # 0.52f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v17, 0x4136b852    # 11.42f

    .line 285
    .line 286
    .line 287
    const v18, 0x410d999a    # 8.85f

    .line 288
    .line 289
    .line 290
    const v13, 0x41263d71    # 10.39f

    .line 291
    .line 292
    .line 293
    const v14, 0x412f5c29    # 10.96f

    .line 294
    .line 295
    .line 296
    const v15, 0x412d47ae    # 10.83f

    .line 297
    .line 298
    .line 299
    const v16, 0x411d999a    # 9.85f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x41400000    # 12.0f

    .line 309
    .line 310
    const/high16 v2, 0x41a00000    # 20.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x40400000    # 3.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, -0x40800000    # -1.0f

    .line 321
    .line 322
    const/high16 v18, -0x40800000    # -1.0f

    .line 323
    .line 324
    const v13, -0x40f33333    # -0.55f

    .line 325
    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    const/high16 v15, -0x40800000    # -1.0f

    .line 329
    .line 330
    const v16, -0x4119999a    # -0.45f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v0, 0x3ee66666    # 0.45f

    .line 337
    .line 338
    .line 339
    const/high16 v2, 0x3f800000    # 1.0f

    .line 340
    .line 341
    const/high16 v4, -0x40800000    # -1.0f

    .line 342
    .line 343
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v0, 0x40980000    # 4.75f

    .line 347
    .line 348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, -0x3f800000    # -4.0f

    .line 352
    .line 353
    const v18, -0x3f5e147b    # -5.06f

    .line 354
    .line 355
    .line 356
    const v13, -0x40ee147b    # -0.57f

    .line 357
    .line 358
    .line 359
    const v14, -0x3ff3d70a    # -2.19f

    .line 360
    .line 361
    .line 362
    const v15, -0x3ffd70a4    # -2.04f

    .line 363
    .line 364
    .line 365
    const v16, -0x3f7f5c29    # -4.02f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/4 v0, 0x0

    .line 372
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x417ae148    # -0.26f

    .line 376
    .line 377
    .line 378
    const v18, -0x411eb852    # -0.44f

    .line 379
    .line 380
    .line 381
    const v13, -0x41dc28f6    # -0.16f

    .line 382
    .line 383
    .line 384
    const v14, -0x425c28f6    # -0.08f

    .line 385
    .line 386
    .line 387
    const v15, -0x417ae148    # -0.26f

    .line 388
    .line 389
    .line 390
    const/high16 v16, -0x41800000    # -0.25f

    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v17, 0x3efae148    # 0.49f

    .line 396
    .line 397
    .line 398
    const/high16 v18, -0x41000000    # -0.5f

    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const v14, -0x4175c28f    # -0.27f

    .line 402
    .line 403
    .line 404
    const v15, 0x3e6147ae    # 0.22f

    .line 405
    .line 406
    .line 407
    const v16, -0x41051eb8    # -0.49f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, 0x3ca3d70a    # 0.02f

    .line 414
    .line 415
    .line 416
    const/16 v18, 0x0

    .line 417
    .line 418
    const v13, 0x3c23d70a    # 0.01f

    .line 419
    .line 420
    .line 421
    const/4 v14, 0x0

    .line 422
    const v15, 0x3ca3d70a    # 0.02f

    .line 423
    .line 424
    .line 425
    const/16 v16, 0x0

    .line 426
    .line 427
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v17, 0x41400000    # 12.0f

    .line 431
    .line 432
    const/high16 v18, 0x41a00000    # 20.0f

    .line 433
    .line 434
    const v13, 0x4106b852    # 8.42f

    .line 435
    .line 436
    .line 437
    const/high16 v14, 0x41400000    # 12.0f

    .line 438
    .line 439
    const/high16 v15, 0x41400000    # 12.0f

    .line 440
    .line 441
    const v16, 0x417947ae    # 15.58f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x414f0a3d    # 12.94f

    .line 451
    .line 452
    .line 453
    const v2, 0x41a2147b    # 20.26f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v17, -0x3f800000    # -4.0f

    .line 463
    .line 464
    const v18, 0x40a1eb85    # 5.06f

    .line 465
    .line 466
    .line 467
    const v13, -0x40051eb8    # -1.96f

    .line 468
    .line 469
    .line 470
    const v14, 0x3f851eb8    # 1.04f

    .line 471
    .line 472
    .line 473
    const v15, -0x3fa3d70a    # -3.44f

    .line 474
    .line 475
    .line 476
    const v16, 0x4037ae14    # 2.87f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x41a80000    # 21.0f

    .line 483
    .line 484
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v17, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/high16 v18, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const v13, 0x3f0ccccd    # 0.55f

    .line 492
    .line 493
    .line 494
    const/4 v14, 0x0

    .line 495
    const/high16 v15, 0x3f800000    # 1.0f

    .line 496
    .line 497
    const v16, 0x3ee66666    # 0.45f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const v0, -0x4119999a    # -0.45f

    .line 504
    .line 505
    .line 506
    const/high16 v2, 0x3f800000    # 1.0f

    .line 507
    .line 508
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const/high16 v0, -0x3f600000    # -5.0f

    .line 512
    .line 513
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v0, -0x40000000    # -2.0f

    .line 517
    .line 518
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v17, -0x41b33333    # -0.2f

    .line 522
    .line 523
    .line 524
    const/high16 v18, -0x40000000    # -2.0f

    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    const v14, -0x40d1eb85    # -0.68f

    .line 528
    .line 529
    .line 530
    const v15, -0x4270a3d7    # -0.07f

    .line 531
    .line 532
    .line 533
    const v16, -0x40533333    # -1.35f

    .line 534
    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v17, -0x40d47ae1    # -0.67f

    .line 540
    .line 541
    .line 542
    const v18, -0x3ffb851f    # -2.07f

    .line 543
    .line 544
    .line 545
    const v13, -0x41e66666    # -0.15f

    .line 546
    .line 547
    .line 548
    const v14, -0x40c7ae14    # -0.72f

    .line 549
    .line 550
    .line 551
    const v15, -0x413d70a4    # -0.38f

    .line 552
    .line 553
    .line 554
    const v16, -0x404a3d71    # -1.42f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v17, 0x41a00000    # 20.0f

    .line 561
    .line 562
    const/high16 v18, 0x41400000    # 12.0f

    .line 563
    .line 564
    const v13, 0x416851ec    # 14.52f

    .line 565
    .line 566
    .line 567
    const v14, 0x415947ae    # 13.58f

    .line 568
    .line 569
    .line 570
    const v15, 0x41888f5c    # 17.07f

    .line 571
    .line 572
    .line 573
    const/high16 v16, 0x41400000    # 12.0f

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v17, 0x3ca3d70a    # 0.02f

    .line 579
    .line 580
    .line 581
    const/16 v18, 0x0

    .line 582
    .line 583
    const v13, 0x3c23d70a    # 0.01f

    .line 584
    .line 585
    .line 586
    const/4 v14, 0x0

    .line 587
    const v15, 0x3ca3d70a    # 0.02f

    .line 588
    .line 589
    .line 590
    const/16 v16, 0x0

    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v17, 0x3efae148    # 0.49f

    .line 596
    .line 597
    .line 598
    const/high16 v18, 0x3f000000    # 0.5f

    .line 599
    .line 600
    const v13, 0x3e8a3d71    # 0.27f

    .line 601
    .line 602
    .line 603
    const v15, 0x3efae148    # 0.49f

    .line 604
    .line 605
    .line 606
    const v16, 0x3e6b851f    # 0.23f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, 0x41a2147b    # 20.26f

    .line 613
    .line 614
    .line 615
    const v18, 0x414f0a3d    # 12.94f

    .line 616
    .line 617
    .line 618
    const v13, 0x41a428f6    # 20.52f

    .line 619
    .line 620
    .line 621
    const v14, 0x414b0a3d    # 12.69f

    .line 622
    .line 623
    .line 624
    const v15, 0x41a347ae    # 20.41f

    .line 625
    .line 626
    .line 627
    const v16, 0x414d999a    # 12.85f

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    const/16 v16, 0x3800

    .line 641
    .line 642
    const/16 v17, 0x0

    .line 643
    .line 644
    const/high16 v6, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/high16 v8, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const/4 v7, 0x0

    .line 649
    const/high16 v9, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const/high16 v12, 0x3f800000    # 1.0f

    .line 652
    .line 653
    const/4 v13, 0x0

    .line 654
    const/4 v14, 0x0

    .line 655
    const/4 v15, 0x0

    .line 656
    const-string v4, ""

    .line 657
    .line 658
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    sput-object v0, Landroidx/compose/material/icons/rounded/GrassKt;->_grass:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 667
    .line 668
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    return-object v0
.end method

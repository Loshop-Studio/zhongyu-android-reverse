.class public final Landroidx/compose/material/icons/outlined/DirtyLensKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirtyLens(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.DirtyLens"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, -0x3fb51eb8    # -3.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v4, 0x41700000    # 15.0f

    .line 84
    .line 85
    const/high16 v6, 0x40400000    # 3.0f

    .line 86
    .line 87
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41100000    # 9.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v4, 0x40e570a4    # 7.17f

    .line 96
    .line 97
    .line 98
    const/high16 v6, 0x40a00000    # 5.0f

    .line 99
    .line 100
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x40800000    # 4.0f

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v25, 0x40000000    # 2.0f

    .line 109
    .line 110
    const/high16 v26, 0x40e00000    # 7.0f

    .line 111
    .line 112
    const v21, 0x4039999a    # 2.9f

    .line 113
    .line 114
    .line 115
    const/high16 v22, 0x40a00000    # 5.0f

    .line 116
    .line 117
    const/high16 v23, 0x40000000    # 2.0f

    .line 118
    .line 119
    const v24, 0x40bccccd    # 5.9f

    .line 120
    .line 121
    .line 122
    move-object/from16 v20, v2

    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x41400000    # 12.0f

    .line 128
    .line 129
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v26, 0x40000000    # 2.0f

    .line 133
    .line 134
    const/16 v21, 0x0

    .line 135
    .line 136
    const v22, 0x3f8ccccd    # 1.1f

    .line 137
    .line 138
    .line 139
    const v23, 0x3f666666    # 0.9f

    .line 140
    .line 141
    .line 142
    const/high16 v24, 0x40000000    # 2.0f

    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v4, 0x41800000    # 16.0f

    .line 148
    .line 149
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v26, -0x40000000    # -2.0f

    .line 153
    .line 154
    const v21, 0x3f8ccccd    # 1.1f

    .line 155
    .line 156
    .line 157
    const/16 v22, 0x0

    .line 158
    .line 159
    const/high16 v23, 0x40000000    # 2.0f

    .line 160
    .line 161
    const v24, -0x4099999a    # -0.9f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x40e00000    # 7.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, 0x41a00000    # 20.0f

    .line 173
    .line 174
    const/high16 v26, 0x40a00000    # 5.0f

    .line 175
    .line 176
    const/high16 v21, 0x41b00000    # 22.0f

    .line 177
    .line 178
    const v22, 0x40bccccd    # 5.9f

    .line 179
    .line 180
    .line 181
    const v23, 0x41a8cccd    # 21.1f

    .line 182
    .line 183
    .line 184
    const/high16 v24, 0x40a00000    # 5.0f

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x41980000    # 19.0f

    .line 193
    .line 194
    const/high16 v6, 0x41a00000    # 20.0f

    .line 195
    .line 196
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v4, -0x3f1f5c29    # -7.02f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v25, -0x41fae148    # -0.13f

    .line 206
    .line 207
    .line 208
    const v26, -0x3feae148    # -2.33f

    .line 209
    .line 210
    .line 211
    const v21, -0x419eb852    # -0.22f

    .line 212
    .line 213
    .line 214
    const v22, -0x40a8f5c3    # -0.84f

    .line 215
    .line 216
    .line 217
    const v23, -0x40fae148    # -0.52f

    .line 218
    .line 219
    .line 220
    const v24, -0x401eb852    # -1.76f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v25, 0x4073d70a    # 3.81f

    .line 227
    .line 228
    .line 229
    const v26, -0x4247ae14    # -0.09f

    .line 230
    .line 231
    .line 232
    const v21, 0x3f4f5c29    # 0.81f

    .line 233
    .line 234
    .line 235
    const v22, -0x4070a3d7    # -1.12f

    .line 236
    .line 237
    .line 238
    const v23, 0x402ae148    # 2.67f

    .line 239
    .line 240
    .line 241
    const v24, 0x3fe28f5c    # 1.77f

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v25, -0x402e147b    # -1.64f

    .line 248
    .line 249
    .line 250
    const v26, -0x3ff851ec    # -2.12f

    .line 251
    .line 252
    .line 253
    const v21, 0x3f451eb8    # 0.77f

    .line 254
    .line 255
    .line 256
    const v22, -0x40370a3d    # -1.57f

    .line 257
    .line 258
    .line 259
    const v23, -0x4035c28f    # -1.58f

    .line 260
    .line 261
    .line 262
    const v24, -0x405ae148    # -1.29f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v25, 0x40428f5c    # 3.04f

    .line 269
    .line 270
    .line 271
    const v26, -0x402b851f    # -1.66f

    .line 272
    .line 273
    .line 274
    const v21, -0x42b33333    # -0.05f

    .line 275
    .line 276
    .line 277
    const v22, -0x40a8f5c3    # -0.84f

    .line 278
    .line 279
    .line 280
    const v23, 0x406b851f    # 3.68f

    .line 281
    .line 282
    .line 283
    const v24, 0x3e2e147b    # 0.17f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v25, -0x3fcf5c29    # -2.76f

    .line 290
    .line 291
    .line 292
    const v26, -0x40f851ec    # -0.53f

    .line 293
    .line 294
    .line 295
    const v21, -0x40e3d70a    # -0.61f

    .line 296
    .line 297
    .line 298
    const v22, -0x40228f5c    # -1.73f

    .line 299
    .line 300
    .line 301
    const v23, -0x3fe51eb8    # -2.42f

    .line 302
    .line 303
    .line 304
    const v24, 0x3ef5c28f    # 0.48f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v25, 0x40366666    # 2.85f

    .line 311
    .line 312
    .line 313
    const v26, -0x3f7fae14    # -4.01f

    .line 314
    .line 315
    .line 316
    const v21, -0x40eb851f    # -0.58f

    .line 317
    .line 318
    .line 319
    const v22, -0x402147ae    # -1.74f

    .line 320
    .line 321
    .line 322
    const v23, 0x40966666    # 4.7f

    .line 323
    .line 324
    .line 325
    const v24, -0x4028f5c3    # -1.68f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v25, -0x3f72e148    # -4.41f

    .line 332
    .line 333
    .line 334
    const v26, 0x40151eb8    # 2.33f

    .line 335
    .line 336
    .line 337
    const v21, -0x401eb852    # -1.76f

    .line 338
    .line 339
    .line 340
    const v22, -0x3ff1eb85    # -2.22f

    .line 341
    .line 342
    .line 343
    const v23, -0x3fe1eb85    # -2.47f

    .line 344
    .line 345
    .line 346
    const v24, 0x40366666    # 2.85f

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const v25, -0x3fd66666    # -2.65f

    .line 353
    .line 354
    .line 355
    const v26, -0x3fe3d70a    # -2.44f

    .line 356
    .line 357
    .line 358
    const v21, -0x40547ae1    # -1.34f

    .line 359
    .line 360
    .line 361
    const v22, -0x4147ae14    # -0.36f

    .line 362
    .line 363
    .line 364
    const v23, -0x407eb852    # -1.01f

    .line 365
    .line 366
    .line 367
    const v24, -0x3fc7ae14    # -2.88f

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/16 v25, 0x0

    .line 374
    .line 375
    const v26, 0x40370a3d    # 2.86f

    .line 376
    .line 377
    .line 378
    const v21, -0x400f5c29    # -1.88f

    .line 379
    .line 380
    .line 381
    const v22, 0x3f028f5c    # 0.51f

    .line 382
    .line 383
    .line 384
    const v23, 0x3f83d70a    # 1.03f

    .line 385
    .line 386
    .line 387
    const v24, 0x400ccccd    # 2.2f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v25, -0x3fdf5c29    # -2.51f

    .line 394
    .line 395
    .line 396
    const v26, -0x4067ae14    # -1.19f

    .line 397
    .line 398
    .line 399
    const v21, -0x408a3d71    # -0.96f

    .line 400
    .line 401
    .line 402
    const v22, 0x3f2147ae    # 0.63f

    .line 403
    .line 404
    .line 405
    const v23, -0x4023d70a    # -1.72f

    .line 406
    .line 407
    .line 408
    const v24, -0x40947ae1    # -0.92f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v25, -0x40970a3d    # -0.91f

    .line 415
    .line 416
    .line 417
    const v26, 0x3e428f5c    # 0.19f

    .line 418
    .line 419
    .line 420
    const v21, -0x41b33333    # -0.2f

    .line 421
    .line 422
    .line 423
    const v22, -0x4270a3d7    # -0.07f

    .line 424
    .line 425
    .line 426
    const v23, -0x40cf5c29    # -0.69f

    .line 427
    .line 428
    .line 429
    const v24, -0x42b33333    # -0.05f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const/high16 v25, 0x3e800000    # 0.25f

    .line 436
    .line 437
    const v26, 0x3ff47ae1    # 1.91f

    .line 438
    .line 439
    .line 440
    const v21, -0x40b851ec    # -0.78f

    .line 441
    .line 442
    .line 443
    const v22, 0x3f5c28f6    # 0.86f

    .line 444
    .line 445
    .line 446
    const v23, 0x3e8f5c29    # 0.28f

    .line 447
    .line 448
    .line 449
    const v24, 0x3f947ae1    # 1.16f

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v25, -0x403eb852    # -1.51f

    .line 456
    .line 457
    .line 458
    const v26, 0x3fbeb852    # 1.49f

    .line 459
    .line 460
    .line 461
    const v21, -0x435c28f6    # -0.02f

    .line 462
    .line 463
    .line 464
    const/high16 v22, 0x3f400000    # 0.75f

    .line 465
    .line 466
    const v23, -0x40347ae1    # -1.59f

    .line 467
    .line 468
    .line 469
    const v24, 0x3efae148    # 0.49f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v25, 0x4019999a    # 2.4f

    .line 476
    .line 477
    .line 478
    const v26, 0x3f9eb852    # 1.24f

    .line 479
    .line 480
    .line 481
    const v21, 0x3df5c28f    # 0.12f

    .line 482
    .line 483
    .line 484
    const v22, 0x3fcccccd    # 1.6f

    .line 485
    .line 486
    .line 487
    const v23, 0x400b851f    # 2.18f

    .line 488
    .line 489
    .line 490
    const v24, 0x3ee66666    # 0.45f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v25, -0x41000000    # -0.5f

    .line 497
    .line 498
    const v26, 0x405147ae    # 3.27f

    .line 499
    .line 500
    .line 501
    const v21, 0x3f0ccccd    # 0.55f

    .line 502
    .line 503
    .line 504
    const v22, 0x3ffd70a4    # 1.98f

    .line 505
    .line 506
    .line 507
    const v23, -0x400e147b    # -1.89f

    .line 508
    .line 509
    .line 510
    const v24, 0x4009999a    # 2.15f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const v25, 0x40333333    # 2.8f

    .line 517
    .line 518
    .line 519
    const v26, -0x40533333    # -1.35f

    .line 520
    .line 521
    .line 522
    const v21, 0x3fc3d70a    # 1.53f

    .line 523
    .line 524
    .line 525
    const v22, 0x3f35c28f    # 0.71f

    .line 526
    .line 527
    .line 528
    const v23, 0x3ff47ae1    # 1.91f

    .line 529
    .line 530
    .line 531
    const v24, -0x4007ae14    # -1.94f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v25, 0x3e23d70a    # 0.16f

    .line 538
    .line 539
    .line 540
    const v26, 0x401b851f    # 2.43f

    .line 541
    .line 542
    .line 543
    const v21, 0x3f147ae1    # 0.58f

    .line 544
    .line 545
    .line 546
    const v22, 0x3ec28f5c    # 0.38f

    .line 547
    .line 548
    .line 549
    const v23, 0x3e99999a    # 0.3f

    .line 550
    .line 551
    .line 552
    const v24, 0x3fb9999a    # 1.45f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v4, 0x40800000    # 4.0f

    .line 559
    .line 560
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v4, 0x40e00000    # 7.0f

    .line 564
    .line 565
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v4, 0x4081999a    # 4.05f

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v4, -0x40000000    # -2.0f

    .line 575
    .line 576
    const v6, 0x3fea3d71    # 1.83f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v4, 0x4087ae14    # 4.24f

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v4, 0x40000000    # 2.0f

    .line 589
    .line 590
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v4, 0x41a00000    # 20.0f

    .line 594
    .line 595
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v4, 0x41980000    # 19.0f

    .line 599
    .line 600
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    const/16 v16, 0x3800

    .line 611
    .line 612
    const/16 v17, 0x0

    .line 613
    .line 614
    const/high16 v6, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/high16 v8, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/4 v7, 0x0

    .line 619
    const/high16 v9, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/high16 v12, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/4 v13, 0x0

    .line 624
    const/4 v14, 0x0

    .line 625
    const/4 v15, 0x0

    .line 626
    const-string v4, ""

    .line 627
    .line 628
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 629
    .line 630
    .line 631
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 632
    .line 633
    .line 634
    move-result v3

    .line 635
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 636
    .line 637
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 638
    .line 639
    .line 640
    move-result-wide v6

    .line 641
    const/4 v0, 0x0

    .line 642
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 646
    .line 647
    .line 648
    move-result v10

    .line 649
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 650
    .line 651
    .line 652
    move-result v11

    .line 653
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 656
    .line 657
    .line 658
    const v0, 0x418a3d71    # 17.28f

    .line 659
    .line 660
    .line 661
    const v2, 0x41893333    # 17.15f

    .line 662
    .line 663
    .line 664
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, 0x3f5c28f6    # 0.86f

    .line 668
    .line 669
    .line 670
    const v18, 0x3f5c28f6    # 0.86f

    .line 671
    .line 672
    .line 673
    const v14, 0x3ef5c28f    # 0.48f

    .line 674
    .line 675
    .line 676
    const v15, 0x3ec7ae14    # 0.39f

    .line 677
    .line 678
    .line 679
    const v16, 0x3f5c28f6    # 0.86f

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const v18, -0x40a3d70a    # -0.86f

    .line 686
    .line 687
    .line 688
    const v13, 0x3ef5c28f    # 0.48f

    .line 689
    .line 690
    .line 691
    const/4 v14, 0x0

    .line 692
    const v15, 0x3f5c28f6    # 0.86f

    .line 693
    .line 694
    .line 695
    const v16, -0x413d70a4    # -0.38f

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, -0x413851ec    # -0.39f

    .line 702
    .line 703
    .line 704
    const v2, -0x40a3d70a    # -0.86f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, 0x418a3d71    # 17.28f

    .line 711
    .line 712
    .line 713
    const v18, 0x41893333    # 17.15f

    .line 714
    .line 715
    .line 716
    const v13, 0x418d47ae    # 17.66f

    .line 717
    .line 718
    .line 719
    const v14, 0x418251ec    # 16.29f

    .line 720
    .line 721
    .line 722
    const v15, 0x418a3d71    # 17.28f

    .line 723
    .line 724
    .line 725
    const v16, 0x41855c29    # 16.67f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    const/16 v16, 0x3800

    .line 739
    .line 740
    const/16 v17, 0x0

    .line 741
    .line 742
    const/high16 v6, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const/4 v7, 0x0

    .line 745
    const/high16 v12, 0x3f800000    # 1.0f

    .line 746
    .line 747
    const/4 v13, 0x0

    .line 748
    const/4 v14, 0x0

    .line 749
    const/4 v15, 0x0

    .line 750
    const-string v4, ""

    .line 751
    .line 752
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    sput-object v0, Landroidx/compose/material/icons/outlined/DirtyLensKt;->_dirtyLens:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 761
    .line 762
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    return-object v0
.end method

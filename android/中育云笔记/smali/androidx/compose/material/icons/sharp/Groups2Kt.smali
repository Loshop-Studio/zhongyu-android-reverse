.class public final Landroidx/compose/material/icons/sharp/Groups2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _groups2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGroups2(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/Groups2Kt;->_groups2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Groups2"

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
    const v4, 0x412451ec    # 10.27f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x405d70a4    # 3.46f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v25, 0x3fbd70a4    # 1.48f

    .line 85
    .line 86
    .line 87
    const/high16 v26, -0x40200000    # -1.75f

    .line 88
    .line 89
    const v21, 0x3f6e147b    # 0.93f

    .line 90
    .line 91
    .line 92
    const/16 v22, 0x0

    .line 93
    .line 94
    const v23, 0x3fd0a3d7    # 1.63f

    .line 95
    .line 96
    .line 97
    const v24, -0x40ab851f    # -0.83f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, -0x401ae148    # -1.79f

    .line 106
    .line 107
    .line 108
    const v6, -0x41666666    # -0.3f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v25, 0x41400000    # 12.0f

    .line 115
    .line 116
    const/high16 v26, 0x40c00000    # 6.0f

    .line 117
    .line 118
    const v21, 0x416ab852    # 14.67f

    .line 119
    .line 120
    .line 121
    const v22, 0x40e147ae    # 7.04f

    .line 122
    .line 123
    .line 124
    const v23, 0x41570a3d    # 13.44f

    .line 125
    .line 126
    .line 127
    const/high16 v24, 0x40c00000    # 6.0f

    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, 0x411170a4    # 9.09f

    .line 133
    .line 134
    .line 135
    const v6, 0x4107851f    # 8.47f

    .line 136
    .line 137
    .line 138
    const v7, 0x411547ae    # 9.33f

    .line 139
    .line 140
    .line 141
    const v8, 0x40e147ae    # 7.04f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v4, 0x3fe51eb8    # 1.79f

    .line 148
    .line 149
    .line 150
    const v6, -0x41666666    # -0.3f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v25, 0x412451ec    # 10.27f

    .line 157
    .line 158
    .line 159
    const/high16 v26, 0x41400000    # 12.0f

    .line 160
    .line 161
    const v21, 0x410a3d71    # 8.64f

    .line 162
    .line 163
    .line 164
    const v22, 0x4132b852    # 11.17f

    .line 165
    .line 166
    .line 167
    const v23, 0x411570a4    # 9.34f

    .line 168
    .line 169
    .line 170
    const/high16 v24, 0x41400000    # 12.0f

    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const/16 v16, 0x3800

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const/high16 v6, 0x3f800000    # 1.0f

    .line 187
    .line 188
    const/high16 v8, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const/high16 v9, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/high16 v12, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    const/4 v15, 0x0

    .line 198
    const-string v4, ""

    .line 199
    .line 200
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 201
    .line 202
    .line 203
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 208
    .line 209
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 210
    .line 211
    .line 212
    move-result-wide v6

    .line 213
    const/4 v2, 0x0

    .line 214
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    const v4, 0x3fd47ae1    # 1.66f

    .line 231
    .line 232
    .line 233
    const v6, 0x4131c28f    # 11.11f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v25, -0x42333333    # -0.1f

    .line 240
    .line 241
    .line 242
    const v26, 0x3f6147ae    # 0.88f

    .line 243
    .line 244
    .line 245
    const v21, -0x41fae148    # -0.13f

    .line 246
    .line 247
    .line 248
    const v22, 0x3e851eb8    # 0.26f

    .line 249
    .line 250
    .line 251
    const v23, -0x41c7ae14    # -0.18f

    .line 252
    .line 253
    .line 254
    const v24, 0x3f11eb85    # 0.57f

    .line 255
    .line 256
    .line 257
    move-object/from16 v20, v2

    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v25, 0x3fc3d70a    # 1.53f

    .line 263
    .line 264
    .line 265
    const/high16 v26, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const v21, 0x3e23d70a    # 0.16f

    .line 268
    .line 269
    .line 270
    const v22, 0x3f30a3d7    # 0.69f

    .line 271
    .line 272
    .line 273
    const v23, 0x3f428f5c    # 0.76f

    .line 274
    .line 275
    .line 276
    const v24, 0x3f83d70a    # 1.03f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v25, 0x3ff9999a    # 1.95f

    .line 283
    .line 284
    .line 285
    const/16 v26, 0x0

    .line 286
    .line 287
    const/16 v21, 0x0

    .line 288
    .line 289
    const/16 v22, 0x0

    .line 290
    .line 291
    const v23, 0x3fbeb852    # 1.49f

    .line 292
    .line 293
    .line 294
    const/16 v24, 0x0

    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v25, 0x3fc147ae    # 1.51f

    .line 300
    .line 301
    .line 302
    const v26, -0x405ae148    # -1.29f

    .line 303
    .line 304
    .line 305
    const v21, 0x3f547ae1    # 0.83f

    .line 306
    .line 307
    .line 308
    const v23, 0x3fc147ae    # 1.51f

    .line 309
    .line 310
    .line 311
    const v24, -0x40eb851f    # -0.58f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v25, -0x4270a3d7    # -0.07f

    .line 318
    .line 319
    .line 320
    const v26, -0x41333333    # -0.4f

    .line 321
    .line 322
    .line 323
    const/16 v21, 0x0

    .line 324
    .line 325
    const v22, -0x41f0a3d7    # -0.14f

    .line 326
    .line 327
    .line 328
    const v23, -0x430a3d71    # -0.03f

    .line 329
    .line 330
    .line 331
    const v24, -0x4175c28f    # -0.27f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v25, 0x3c23d70a    # 0.01f

    .line 338
    .line 339
    .line 340
    const v26, -0x425c28f6    # -0.08f

    .line 341
    .line 342
    .line 343
    const v21, -0x43dc28f6    # -0.01f

    .line 344
    .line 345
    .line 346
    const v22, -0x430a3d71    # -0.03f

    .line 347
    .line 348
    .line 349
    const v23, -0x43dc28f6    # -0.01f

    .line 350
    .line 351
    .line 352
    const v24, -0x42b33333    # -0.05f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v25, 0x3e0f5c29    # 0.14f

    .line 359
    .line 360
    .line 361
    const v26, -0x40f851ec    # -0.53f

    .line 362
    .line 363
    .line 364
    const v21, 0x3db851ec    # 0.09f

    .line 365
    .line 366
    .line 367
    const v22, -0x41dc28f6    # -0.16f

    .line 368
    .line 369
    .line 370
    const v23, 0x3e0f5c29    # 0.14f

    .line 371
    .line 372
    .line 373
    const v24, -0x4151eb85    # -0.34f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v25, -0x4147ae14    # -0.36f

    .line 380
    .line 381
    .line 382
    const v26, -0x40ae147b    # -0.82f

    .line 383
    .line 384
    .line 385
    const/16 v21, 0x0

    .line 386
    .line 387
    const v22, -0x416147ae    # -0.31f

    .line 388
    .line 389
    .line 390
    const v23, -0x41f0a3d7    # -0.14f

    .line 391
    .line 392
    .line 393
    const v24, -0x40e66666    # -0.6f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v25, -0x435c28f6    # -0.02f

    .line 400
    .line 401
    .line 402
    const v26, -0x42333333    # -0.1f

    .line 403
    .line 404
    .line 405
    const v21, -0x430a3d71    # -0.03f

    .line 406
    .line 407
    .line 408
    const v22, -0x430a3d71    # -0.03f

    .line 409
    .line 410
    .line 411
    const v23, -0x430a3d71    # -0.03f

    .line 412
    .line 413
    .line 414
    const v24, -0x428a3d71    # -0.06f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v25, 0x3c23d70a    # 0.01f

    .line 421
    .line 422
    .line 423
    const v26, -0x40d9999a    # -0.65f

    .line 424
    .line 425
    .line 426
    const v21, 0x3d8f5c29    # 0.07f

    .line 427
    .line 428
    .line 429
    const v22, -0x41b33333    # -0.2f

    .line 430
    .line 431
    .line 432
    const v23, 0x3d8f5c29    # 0.07f

    .line 433
    .line 434
    .line 435
    const v24, -0x4123d70a    # -0.43f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v25, 0x40a8a3d7    # 5.27f

    .line 442
    .line 443
    .line 444
    const v26, 0x4106147b    # 8.38f

    .line 445
    .line 446
    .line 447
    const v21, 0x40c33333    # 6.1f

    .line 448
    .line 449
    .line 450
    const v22, 0x410b0a3d    # 8.69f

    .line 451
    .line 452
    .line 453
    const v23, 0x40b6b852    # 5.71f

    .line 454
    .line 455
    .line 456
    const v24, 0x41066666    # 8.4f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const v25, -0x4270a3d7    # -0.07f

    .line 463
    .line 464
    .line 465
    const v26, -0x430a3d71    # -0.03f

    .line 466
    .line 467
    .line 468
    const v21, -0x430a3d71    # -0.03f

    .line 469
    .line 470
    .line 471
    const/16 v22, 0x0

    .line 472
    .line 473
    const v23, -0x42b33333    # -0.05f

    .line 474
    .line 475
    .line 476
    const v24, -0x43dc28f6    # -0.01f

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v25, 0x408bd70a    # 4.37f

    .line 483
    .line 484
    .line 485
    const/high16 v26, 0x41000000    # 8.0f

    .line 486
    .line 487
    const v21, 0x40a0f5c3    # 5.03f

    .line 488
    .line 489
    .line 490
    const v22, 0x41023d71    # 8.14f

    .line 491
    .line 492
    .line 493
    const v23, 0x40970a3d    # 4.72f

    .line 494
    .line 495
    .line 496
    const/high16 v24, 0x41000000    # 8.0f

    .line 497
    .line 498
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v25, 0x4067ae14    # 3.62f

    .line 502
    .line 503
    .line 504
    const v26, 0x410428f6    # 8.26f

    .line 505
    .line 506
    .line 507
    const v21, 0x40823d71    # 4.07f

    .line 508
    .line 509
    .line 510
    const/high16 v22, 0x41000000    # 8.0f

    .line 511
    .line 512
    const v23, 0x40733333    # 3.8f

    .line 513
    .line 514
    .line 515
    const v24, 0x4101999a    # 8.1f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v25, 0x4061eb85    # 3.53f

    .line 522
    .line 523
    .line 524
    const v26, 0x41047ae1    # 8.28f

    .line 525
    .line 526
    .line 527
    const v21, 0x4065c28f    # 3.59f

    .line 528
    .line 529
    .line 530
    const v22, 0x4104a3d7    # 8.29f

    .line 531
    .line 532
    .line 533
    const v23, 0x4063d70a    # 3.56f

    .line 534
    .line 535
    .line 536
    const v24, 0x4104a3d7    # 8.29f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v25, -0x41147ae1    # -0.46f

    .line 543
    .line 544
    .line 545
    const v26, -0x4247ae14    # -0.09f

    .line 546
    .line 547
    .line 548
    const v21, -0x41f0a3d7    # -0.14f

    .line 549
    .line 550
    .line 551
    const v22, -0x428a3d71    # -0.06f

    .line 552
    .line 553
    .line 554
    const v23, -0x41666666    # -0.3f

    .line 555
    .line 556
    .line 557
    const v24, -0x4247ae14    # -0.09f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v25, -0x406147ae    # -1.24f

    .line 564
    .line 565
    .line 566
    const v26, 0x3f8f5c29    # 1.12f

    .line 567
    .line 568
    .line 569
    const v21, -0x40d9999a    # -0.65f

    .line 570
    .line 571
    .line 572
    const/16 v22, 0x0

    .line 573
    .line 574
    const v23, -0x4068f5c3    # -1.18f

    .line 575
    .line 576
    .line 577
    const v24, 0x3efae148    # 0.49f

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const v25, -0x430a3d71    # -0.03f

    .line 584
    .line 585
    .line 586
    const v26, 0x3d75c28f    # 0.06f

    .line 587
    .line 588
    .line 589
    const/16 v21, 0x0

    .line 590
    .line 591
    const v22, 0x3ca3d70a    # 0.02f

    .line 592
    .line 593
    .line 594
    const v23, -0x43dc28f6    # -0.01f

    .line 595
    .line 596
    .line 597
    const v24, 0x3d23d70a    # 0.04f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v25, -0x412e147b    # -0.41f

    .line 604
    .line 605
    .line 606
    const v26, 0x3f866666    # 1.05f

    .line 607
    .line 608
    .line 609
    const v21, -0x416b851f    # -0.29f

    .line 610
    .line 611
    .line 612
    const v22, 0x3e851eb8    # 0.26f

    .line 613
    .line 614
    .line 615
    const v23, -0x41147ae1    # -0.46f

    .line 616
    .line 617
    .line 618
    const v24, 0x3f266666    # 0.65f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v25, 0x3e800000    # 0.25f

    .line 625
    .line 626
    const v26, 0x3f19999a    # 0.6f

    .line 627
    .line 628
    .line 629
    const v21, 0x3cf5c28f    # 0.03f

    .line 630
    .line 631
    .line 632
    const v22, 0x3e6147ae    # 0.22f

    .line 633
    .line 634
    .line 635
    const v23, 0x3df5c28f    # 0.12f

    .line 636
    .line 637
    .line 638
    const v24, 0x3edc28f6    # 0.43f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v25, 0x3fd47ae1    # 1.66f

    .line 645
    .line 646
    .line 647
    const v26, 0x4131c28f    # 11.11f

    .line 648
    .line 649
    .line 650
    const v21, 0x3fd5c28f    # 1.67f

    .line 651
    .line 652
    .line 653
    const v22, 0x4130a3d7    # 11.04f

    .line 654
    .line 655
    .line 656
    const v23, 0x3fd5c28f    # 1.67f

    .line 657
    .line 658
    .line 659
    const v24, 0x413147ae    # 11.08f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    const/high16 v6, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/4 v7, 0x0

    .line 675
    const-string v4, ""

    .line 676
    .line 677
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 678
    .line 679
    .line 680
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 685
    .line 686
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 687
    .line 688
    .line 689
    move-result-wide v6

    .line 690
    const/4 v2, 0x0

    .line 691
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 695
    .line 696
    .line 697
    move-result v10

    .line 698
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 699
    .line 700
    .line 701
    move-result v11

    .line 702
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 705
    .line 706
    .line 707
    const v4, 0x4181eb85    # 16.24f

    .line 708
    .line 709
    .line 710
    const v6, 0x415a6666    # 13.65f

    .line 711
    .line 712
    .line 713
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v25, -0x3f7851ec    # -4.24f

    .line 717
    .line 718
    .line 719
    const v26, -0x4099999a    # -0.9f

    .line 720
    .line 721
    .line 722
    const v21, -0x406a3d71    # -1.17f

    .line 723
    .line 724
    .line 725
    const v22, -0x40fae148    # -0.52f

    .line 726
    .line 727
    .line 728
    const v23, -0x3fd8f5c3    # -2.61f

    .line 729
    .line 730
    .line 731
    const v24, -0x4099999a    # -0.9f

    .line 732
    .line 733
    .line 734
    move-object/from16 v20, v2

    .line 735
    .line 736
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const v26, 0x3f666666    # 0.9f

    .line 740
    .line 741
    .line 742
    const v21, -0x402f5c29    # -1.63f

    .line 743
    .line 744
    .line 745
    const/16 v22, 0x0

    .line 746
    .line 747
    const v23, -0x3fbb851f    # -3.07f

    .line 748
    .line 749
    .line 750
    const v24, 0x3ec7ae14    # 0.39f

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v25, 0x40c00000    # 6.0f

    .line 757
    .line 758
    const v26, 0x41831eb8    # 16.39f

    .line 759
    .line 760
    .line 761
    const v21, 0x40d5c28f    # 6.68f

    .line 762
    .line 763
    .line 764
    const v22, 0x4162147b    # 14.13f

    .line 765
    .line 766
    .line 767
    const/high16 v23, 0x40c00000    # 6.0f

    .line 768
    .line 769
    const v24, 0x41735c29    # 15.21f

    .line 770
    .line 771
    .line 772
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const/high16 v4, 0x41900000    # 18.0f

    .line 776
    .line 777
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v4, 0x41400000    # 12.0f

    .line 781
    .line 782
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 783
    .line 784
    .line 785
    const v4, -0x4031eb85    # -1.61f

    .line 786
    .line 787
    .line 788
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v25, 0x4181eb85    # 16.24f

    .line 792
    .line 793
    .line 794
    const v26, 0x415a6666    # 13.65f

    .line 795
    .line 796
    .line 797
    const/high16 v21, 0x41900000    # 18.0f

    .line 798
    .line 799
    const v22, 0x41735c29    # 15.21f

    .line 800
    .line 801
    .line 802
    const v23, 0x418a8f5c    # 17.32f

    .line 803
    .line 804
    .line 805
    const v24, 0x4162147b    # 14.13f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    const/high16 v6, 0x3f800000    # 1.0f

    .line 819
    .line 820
    const/4 v7, 0x0

    .line 821
    const-string v4, ""

    .line 822
    .line 823
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 824
    .line 825
    .line 826
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 827
    .line 828
    .line 829
    move-result v3

    .line 830
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 831
    .line 832
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 833
    .line 834
    .line 835
    move-result-wide v6

    .line 836
    const/4 v2, 0x0

    .line 837
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 841
    .line 842
    .line 843
    move-result v10

    .line 844
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 845
    .line 846
    .line 847
    move-result v11

    .line 848
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 849
    .line 850
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 851
    .line 852
    .line 853
    const v4, 0x3f9c28f6    # 1.22f

    .line 854
    .line 855
    .line 856
    const v6, 0x416947ae    # 14.58f

    .line 857
    .line 858
    .line 859
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    const/16 v25, 0x0

    .line 863
    .line 864
    const v26, 0x418370a4    # 16.43f

    .line 865
    .line 866
    .line 867
    const v21, 0x3ef5c28f    # 0.48f

    .line 868
    .line 869
    .line 870
    const v22, 0x416e6666    # 14.9f

    .line 871
    .line 872
    .line 873
    const/16 v23, 0x0

    .line 874
    .line 875
    const v24, 0x4179eb85    # 15.62f

    .line 876
    .line 877
    .line 878
    move-object/from16 v20, v2

    .line 879
    .line 880
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 881
    .line 882
    .line 883
    const/high16 v4, 0x41900000    # 18.0f

    .line 884
    .line 885
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const/4 v4, 0x0

    .line 889
    const/high16 v6, 0x40900000    # 4.5f

    .line 890
    .line 891
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const v4, -0x4031eb85    # -1.61f

    .line 895
    .line 896
    .line 897
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const v25, 0x3f2147ae    # 0.63f

    .line 901
    .line 902
    .line 903
    const v26, -0x3fed70a4    # -2.29f

    .line 904
    .line 905
    .line 906
    const/16 v21, 0x0

    .line 907
    .line 908
    const v22, -0x40ab851f    # -0.83f

    .line 909
    .line 910
    .line 911
    const v23, 0x3e6b851f    # 0.23f

    .line 912
    .line 913
    .line 914
    const v24, -0x4031eb85    # -1.61f

    .line 915
    .line 916
    .line 917
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const/high16 v25, 0x40800000    # 4.0f

    .line 921
    .line 922
    const/high16 v26, 0x41600000    # 14.0f

    .line 923
    .line 924
    const v21, 0x409851ec    # 4.76f

    .line 925
    .line 926
    .line 927
    const v22, 0x4160a3d7    # 14.04f

    .line 928
    .line 929
    .line 930
    const v23, 0x408c7ae1    # 4.39f

    .line 931
    .line 932
    .line 933
    const/high16 v24, 0x41600000    # 14.0f

    .line 934
    .line 935
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const v25, 0x3f9c28f6    # 1.22f

    .line 939
    .line 940
    .line 941
    const v26, 0x416947ae    # 14.58f

    .line 942
    .line 943
    .line 944
    const v21, 0x4040a3d7    # 3.01f

    .line 945
    .line 946
    .line 947
    const/high16 v22, 0x41600000    # 14.0f

    .line 948
    .line 949
    const v23, 0x40047ae1    # 2.07f

    .line 950
    .line 951
    .line 952
    const v24, 0x41635c29    # 14.21f

    .line 953
    .line 954
    .line 955
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    const/high16 v6, 0x3f800000    # 1.0f

    .line 966
    .line 967
    const/4 v7, 0x0

    .line 968
    const-string v4, ""

    .line 969
    .line 970
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 971
    .line 972
    .line 973
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 974
    .line 975
    .line 976
    move-result v3

    .line 977
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 978
    .line 979
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 980
    .line 981
    .line 982
    move-result-wide v6

    .line 983
    const/4 v2, 0x0

    .line 984
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 988
    .line 989
    .line 990
    move-result v10

    .line 991
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 992
    .line 993
    .line 994
    move-result v11

    .line 995
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 998
    .line 999
    .line 1000
    const v4, 0x41b63d71    # 22.78f

    .line 1001
    .line 1002
    .line 1003
    const v6, 0x416947ae    # 14.58f

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    const/high16 v25, 0x41a00000    # 20.0f

    .line 1010
    .line 1011
    const/high16 v26, 0x41600000    # 14.0f

    .line 1012
    .line 1013
    const v21, 0x41af70a4    # 21.93f

    .line 1014
    .line 1015
    .line 1016
    const v22, 0x41635c29    # 14.21f

    .line 1017
    .line 1018
    .line 1019
    const v23, 0x41a7eb85    # 20.99f

    .line 1020
    .line 1021
    .line 1022
    const/high16 v24, 0x41600000    # 14.0f

    .line 1023
    .line 1024
    move-object/from16 v20, v2

    .line 1025
    .line 1026
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1027
    .line 1028
    .line 1029
    const v25, -0x406f5c29    # -1.13f

    .line 1030
    .line 1031
    .line 1032
    const v26, 0x3dcccccd    # 0.1f

    .line 1033
    .line 1034
    .line 1035
    const v21, -0x413851ec    # -0.39f

    .line 1036
    .line 1037
    .line 1038
    const/16 v22, 0x0

    .line 1039
    .line 1040
    const v23, -0x40bd70a4    # -0.76f

    .line 1041
    .line 1042
    .line 1043
    const v24, 0x3d23d70a    # 0.04f

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    .line 1049
    const v25, 0x3f2147ae    # 0.63f

    .line 1050
    .line 1051
    .line 1052
    const v26, 0x40128f5c    # 2.29f

    .line 1053
    .line 1054
    .line 1055
    const v21, 0x3ecccccd    # 0.4f

    .line 1056
    .line 1057
    .line 1058
    const v22, 0x3f2e147b    # 0.68f

    .line 1059
    .line 1060
    .line 1061
    const v23, 0x3f2147ae    # 0.63f

    .line 1062
    .line 1063
    .line 1064
    const v24, 0x3fbae148    # 1.46f

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    .line 1070
    const/high16 v4, 0x41900000    # 18.0f

    .line 1071
    .line 1072
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1073
    .line 1074
    .line 1075
    const/4 v4, 0x0

    .line 1076
    const/high16 v6, 0x40900000    # 4.5f

    .line 1077
    .line 1078
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1079
    .line 1080
    .line 1081
    const v4, -0x40370a3d    # -1.57f

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1085
    .line 1086
    .line 1087
    const v25, 0x41b63d71    # 22.78f

    .line 1088
    .line 1089
    .line 1090
    const v26, 0x416947ae    # 14.58f

    .line 1091
    .line 1092
    .line 1093
    const/high16 v21, 0x41c00000    # 24.0f

    .line 1094
    .line 1095
    const v22, 0x4179eb85    # 15.62f

    .line 1096
    .line 1097
    .line 1098
    const v23, 0x41bc28f6    # 23.52f

    .line 1099
    .line 1100
    .line 1101
    const v24, 0x416e6666    # 14.9f

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1115
    .line 1116
    const/4 v7, 0x0

    .line 1117
    const-string v4, ""

    .line 1118
    .line 1119
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1120
    .line 1121
    .line 1122
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1123
    .line 1124
    .line 1125
    move-result v3

    .line 1126
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1127
    .line 1128
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1129
    .line 1130
    .line 1131
    move-result-wide v6

    .line 1132
    const/4 v0, 0x0

    .line 1133
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1137
    .line 1138
    .line 1139
    move-result v10

    .line 1140
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1141
    .line 1142
    .line 1143
    move-result v11

    .line 1144
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1145
    .line 1146
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1147
    .line 1148
    .line 1149
    const/high16 v0, 0x41300000    # 11.0f

    .line 1150
    .line 1151
    const/high16 v2, 0x41b00000    # 22.0f

    .line 1152
    .line 1153
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1154
    .line 1155
    .line 1156
    const/high16 v0, -0x41000000    # -0.5f

    .line 1157
    .line 1158
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const/high16 v17, -0x40000000    # -2.0f

    .line 1162
    .line 1163
    const/high16 v18, -0x40000000    # -2.0f

    .line 1164
    .line 1165
    const v14, -0x40733333    # -1.1f

    .line 1166
    .line 1167
    .line 1168
    const v15, -0x4099999a    # -0.9f

    .line 1169
    .line 1170
    .line 1171
    const/high16 v16, -0x40000000    # -2.0f

    .line 1172
    .line 1173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1174
    .line 1175
    .line 1176
    const/high16 v0, -0x40000000    # -2.0f

    .line 1177
    .line 1178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1179
    .line 1180
    .line 1181
    const v17, -0x413851ec    # -0.39f

    .line 1182
    .line 1183
    .line 1184
    const v18, 0x3f4f5c29    # 0.81f

    .line 1185
    .line 1186
    .line 1187
    const v13, -0x4128f5c3    # -0.42f

    .line 1188
    .line 1189
    .line 1190
    const/4 v14, 0x0

    .line 1191
    const v15, -0x40d9999a    # -0.65f

    .line 1192
    .line 1193
    .line 1194
    const v16, 0x3ef5c28f    # 0.48f

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1198
    .line 1199
    .line 1200
    const v0, 0x3f333333    # 0.7f

    .line 1201
    .line 1202
    .line 1203
    const v2, 0x3f2147ae    # 0.63f

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1207
    .line 1208
    .line 1209
    const/high16 v17, 0x41900000    # 18.0f

    .line 1210
    .line 1211
    const/high16 v18, 0x41300000    # 11.0f

    .line 1212
    .line 1213
    const v13, 0x4190f5c3    # 18.12f

    .line 1214
    .line 1215
    .line 1216
    const/high16 v14, 0x41240000    # 10.25f

    .line 1217
    .line 1218
    const/high16 v15, 0x41900000    # 18.0f

    .line 1219
    .line 1220
    const v16, 0x4129c28f    # 10.61f

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1224
    .line 1225
    .line 1226
    const/high16 v17, 0x40000000    # 2.0f

    .line 1227
    .line 1228
    const/high16 v18, 0x40000000    # 2.0f

    .line 1229
    .line 1230
    const/4 v13, 0x0

    .line 1231
    const v14, 0x3f8ccccd    # 1.1f

    .line 1232
    .line 1233
    .line 1234
    const v15, 0x3f666666    # 0.9f

    .line 1235
    .line 1236
    .line 1237
    const/high16 v16, 0x40000000    # 2.0f

    .line 1238
    .line 1239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1240
    .line 1241
    .line 1242
    const v0, 0x4141999a    # 12.1f

    .line 1243
    .line 1244
    .line 1245
    const/high16 v2, 0x41300000    # 11.0f

    .line 1246
    .line 1247
    const/high16 v4, 0x41b00000    # 22.0f

    .line 1248
    .line 1249
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v2

    .line 1259
    const/16 v16, 0x3800

    .line 1260
    .line 1261
    const/16 v17, 0x0

    .line 1262
    .line 1263
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1264
    .line 1265
    const/4 v7, 0x0

    .line 1266
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1267
    .line 1268
    const/4 v14, 0x0

    .line 1269
    const/4 v15, 0x0

    .line 1270
    const-string v4, ""

    .line 1271
    .line 1272
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v0

    .line 1276
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    sput-object v0, Landroidx/compose/material/icons/sharp/Groups2Kt;->_groups2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1281
    .line 1282
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1283
    .line 1284
    .line 1285
    return-object v0
.end method

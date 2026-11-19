.class public final Landroidx/compose/material/icons/twotone/DarkModeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _darkMode:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDarkMode(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DarkModeKt;->_darkMode:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DarkMode"

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
    const v4, 0x40b051ec    # 5.51f

    .line 71
    .line 72
    .line 73
    const v6, 0x4115eb85    # 9.37f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x4111999a    # 9.1f

    .line 80
    .line 81
    .line 82
    const/high16 v26, 0x40f00000    # 7.5f

    .line 83
    .line 84
    const v21, 0x41130a3d    # 9.19f

    .line 85
    .line 86
    .line 87
    const v22, 0x40c4cccd    # 6.15f

    .line 88
    .line 89
    .line 90
    const v23, 0x4111999a    # 9.1f

    .line 91
    .line 92
    .line 93
    const v24, 0x40da3d71    # 6.82f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v25, 0x40eccccd    # 7.4f

    .line 102
    .line 103
    .line 104
    const v26, 0x40eccccd    # 7.4f

    .line 105
    .line 106
    .line 107
    const/16 v21, 0x0

    .line 108
    .line 109
    const v22, 0x40828f5c    # 4.08f

    .line 110
    .line 111
    .line 112
    const v23, 0x40547ae1    # 3.32f

    .line 113
    .line 114
    .line 115
    const v24, 0x40eccccd    # 7.4f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v25, 0x3ffeb852    # 1.99f

    .line 122
    .line 123
    .line 124
    const v26, -0x4175c28f    # -0.27f

    .line 125
    .line 126
    .line 127
    const v21, 0x3f2e147b    # 0.68f

    .line 128
    .line 129
    .line 130
    const/16 v22, 0x0

    .line 131
    .line 132
    const v23, 0x3faccccd    # 1.35f

    .line 133
    .line 134
    .line 135
    const v24, -0x4247ae14    # -0.09f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v25, 0x41400000    # 12.0f

    .line 142
    .line 143
    const/high16 v26, 0x41980000    # 19.0f

    .line 144
    .line 145
    const v21, 0x418b999a    # 17.45f

    .line 146
    .line 147
    .line 148
    const v22, 0x4189851f    # 17.19f

    .line 149
    .line 150
    .line 151
    const v23, 0x416ee148    # 14.93f

    .line 152
    .line 153
    .line 154
    const/high16 v24, 0x41980000    # 19.0f

    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, -0x3f200000    # -7.0f

    .line 160
    .line 161
    const/high16 v26, -0x3f200000    # -7.0f

    .line 162
    .line 163
    const v21, -0x3f88f5c3    # -3.86f

    .line 164
    .line 165
    .line 166
    const/16 v22, 0x0

    .line 167
    .line 168
    const/high16 v23, -0x3f200000    # -7.0f

    .line 169
    .line 170
    const v24, -0x3fb70a3d    # -3.14f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, 0x4115eb85    # 9.37f

    .line 177
    .line 178
    .line 179
    const v26, 0x40b051ec    # 5.51f

    .line 180
    .line 181
    .line 182
    const/high16 v21, 0x40a00000    # 5.0f

    .line 183
    .line 184
    const v22, 0x41111eb8    # 9.07f

    .line 185
    .line 186
    .line 187
    const v23, 0x40d9eb85    # 6.81f

    .line 188
    .line 189
    .line 190
    const v24, 0x40d1999a    # 6.55f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const/16 v16, 0x3800

    .line 204
    .line 205
    const/16 v17, 0x0

    .line 206
    .line 207
    const v6, 0x3e99999a    # 0.3f

    .line 208
    .line 209
    .line 210
    const v8, 0x3e99999a    # 0.3f

    .line 211
    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    const/high16 v9, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/high16 v12, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const-string v4, ""

    .line 222
    .line 223
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 224
    .line 225
    .line 226
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 231
    .line 232
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v6

    .line 236
    const/4 v0, 0x0

    .line 237
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    const v0, 0x40b051ec    # 5.51f

    .line 254
    .line 255
    .line 256
    const v2, 0x4115eb85    # 9.37f

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v17, 0x4111999a    # 9.1f

    .line 263
    .line 264
    .line 265
    const/high16 v18, 0x40f00000    # 7.5f

    .line 266
    .line 267
    const v13, 0x41130a3d    # 9.19f

    .line 268
    .line 269
    .line 270
    const v14, 0x40c4cccd    # 6.15f

    .line 271
    .line 272
    .line 273
    const v15, 0x4111999a    # 9.1f

    .line 274
    .line 275
    .line 276
    const v16, 0x40da3d71    # 6.82f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x40eccccd    # 7.4f

    .line 283
    .line 284
    .line 285
    const v18, 0x40eccccd    # 7.4f

    .line 286
    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v14, 0x40828f5c    # 4.08f

    .line 290
    .line 291
    .line 292
    const v15, 0x40547ae1    # 3.32f

    .line 293
    .line 294
    .line 295
    const v16, 0x40eccccd    # 7.4f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, 0x3ffeb852    # 1.99f

    .line 302
    .line 303
    .line 304
    const v18, -0x4175c28f    # -0.27f

    .line 305
    .line 306
    .line 307
    const v13, 0x3f2e147b    # 0.68f

    .line 308
    .line 309
    .line 310
    const/4 v14, 0x0

    .line 311
    const v15, 0x3faccccd    # 1.35f

    .line 312
    .line 313
    .line 314
    const v16, -0x4247ae14    # -0.09f

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v17, 0x41400000    # 12.0f

    .line 321
    .line 322
    const/high16 v18, 0x41980000    # 19.0f

    .line 323
    .line 324
    const v13, 0x418b999a    # 17.45f

    .line 325
    .line 326
    .line 327
    const v14, 0x4189851f    # 17.19f

    .line 328
    .line 329
    .line 330
    const v15, 0x416ee148    # 14.93f

    .line 331
    .line 332
    .line 333
    const/high16 v16, 0x41980000    # 19.0f

    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, -0x3f200000    # -7.0f

    .line 339
    .line 340
    const/high16 v18, -0x3f200000    # -7.0f

    .line 341
    .line 342
    const v13, -0x3f88f5c3    # -3.86f

    .line 343
    .line 344
    .line 345
    const/4 v14, 0x0

    .line 346
    const/high16 v15, -0x3f200000    # -7.0f

    .line 347
    .line 348
    const v16, -0x3fb70a3d    # -3.14f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, 0x4115eb85    # 9.37f

    .line 355
    .line 356
    .line 357
    const v18, 0x40b051ec    # 5.51f

    .line 358
    .line 359
    .line 360
    const/high16 v13, 0x40a00000    # 5.0f

    .line 361
    .line 362
    const v14, 0x41111eb8    # 9.07f

    .line 363
    .line 364
    .line 365
    const v15, 0x40d9eb85    # 6.81f

    .line 366
    .line 367
    .line 368
    const v16, 0x40d1999a    # 6.55f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x40400000    # 3.0f

    .line 378
    .line 379
    const/high16 v2, 0x41400000    # 12.0f

    .line 380
    .line 381
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/high16 v17, -0x3ef00000    # -9.0f

    .line 385
    .line 386
    const/high16 v18, 0x41100000    # 9.0f

    .line 387
    .line 388
    const v13, -0x3f60f5c3    # -4.97f

    .line 389
    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    const/high16 v15, -0x3ef00000    # -9.0f

    .line 393
    .line 394
    const v16, 0x4080f5c3    # 4.03f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x4080f5c3    # 4.03f

    .line 401
    .line 402
    .line 403
    const/high16 v2, 0x41100000    # 9.0f

    .line 404
    .line 405
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, -0x3f7f0a3d    # -4.03f

    .line 409
    .line 410
    .line 411
    const/high16 v2, -0x3ef00000    # -9.0f

    .line 412
    .line 413
    const/high16 v4, 0x41100000    # 9.0f

    .line 414
    .line 415
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const v17, -0x42333333    # -0.1f

    .line 419
    .line 420
    .line 421
    const v18, -0x4051eb85    # -1.36f

    .line 422
    .line 423
    .line 424
    const/4 v13, 0x0

    .line 425
    const v14, -0x41147ae1    # -0.46f

    .line 426
    .line 427
    .line 428
    const v15, -0x42dc28f6    # -0.04f

    .line 429
    .line 430
    .line 431
    const v16, -0x40947ae1    # -0.92f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v17, -0x3f733333    # -4.4f

    .line 438
    .line 439
    .line 440
    const v18, 0x4010a3d7    # 2.26f

    .line 441
    .line 442
    .line 443
    const v13, -0x40851eb8    # -0.98f

    .line 444
    .line 445
    .line 446
    const v14, 0x3faf5c29    # 1.37f

    .line 447
    .line 448
    .line 449
    const v15, -0x3fdae148    # -2.58f

    .line 450
    .line 451
    .line 452
    const v16, 0x4010a3d7    # 2.26f

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v17, -0x3f533333    # -5.4f

    .line 459
    .line 460
    .line 461
    const v18, -0x3f533333    # -5.4f

    .line 462
    .line 463
    .line 464
    const v13, -0x3fc147ae    # -2.98f

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const v15, -0x3f533333    # -5.4f

    .line 469
    .line 470
    .line 471
    const v16, -0x3fe51eb8    # -2.42f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v17, 0x4010a3d7    # 2.26f

    .line 478
    .line 479
    .line 480
    const v18, -0x3f733333    # -4.4f

    .line 481
    .line 482
    .line 483
    const/4 v13, 0x0

    .line 484
    const v14, -0x401851ec    # -1.81f

    .line 485
    .line 486
    .line 487
    const v15, 0x3f63d70a    # 0.89f

    .line 488
    .line 489
    .line 490
    const v16, -0x3fa51eb8    # -3.42f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v17, 0x41400000    # 12.0f

    .line 497
    .line 498
    const/high16 v18, 0x40400000    # 3.0f

    .line 499
    .line 500
    const v13, 0x414eb852    # 12.92f

    .line 501
    .line 502
    .line 503
    const v14, 0x40428f5c    # 3.04f

    .line 504
    .line 505
    .line 506
    const v15, 0x41475c29    # 12.46f

    .line 507
    .line 508
    .line 509
    const/high16 v16, 0x40400000    # 3.0f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x40400000    # 3.0f

    .line 515
    .line 516
    const/high16 v2, 0x41400000    # 12.0f

    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    const/16 v16, 0x3800

    .line 529
    .line 530
    const/16 v17, 0x0

    .line 531
    .line 532
    const/high16 v6, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/high16 v8, 0x3f800000    # 1.0f

    .line 535
    .line 536
    const/4 v7, 0x0

    .line 537
    const/high16 v12, 0x3f800000    # 1.0f

    .line 538
    .line 539
    const/4 v13, 0x0

    .line 540
    const/4 v14, 0x0

    .line 541
    const/4 v15, 0x0

    .line 542
    const-string v4, ""

    .line 543
    .line 544
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    sput-object v0, Landroidx/compose/material/icons/twotone/DarkModeKt;->_darkMode:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 553
    .line 554
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/PanoramaVerticalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaVertical:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaVertical(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PanoramaVerticalKt;->_panoramaVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PanoramaVertical"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const v6, 0x40d147ae    # 6.54f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, 0x3f947ae1    # 1.16f

    .line 79
    .line 80
    .line 81
    const/high16 v26, 0x41000000    # 8.0f

    .line 82
    .line 83
    const v21, 0x3f451eb8    # 0.77f

    .line 84
    .line 85
    .line 86
    const v22, 0x40266666    # 2.6f

    .line 87
    .line 88
    .line 89
    const v23, 0x3f947ae1    # 1.16f

    .line 90
    .line 91
    .line 92
    const v24, 0x40a8f5c3    # 5.28f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, -0x406b851f    # -1.16f

    .line 101
    .line 102
    .line 103
    const/16 v21, 0x0

    .line 104
    .line 105
    const v22, 0x402e147b    # 2.72f

    .line 106
    .line 107
    .line 108
    const v23, -0x413851ec    # -0.39f

    .line 109
    .line 110
    .line 111
    const v24, 0x40accccd    # 5.4f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x412e8f5c    # 10.91f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v26, -0x3f000000    # -8.0f

    .line 124
    .line 125
    const v21, -0x40bae148    # -0.77f

    .line 126
    .line 127
    .line 128
    const v22, -0x3fd9999a    # -2.6f

    .line 129
    .line 130
    .line 131
    const v23, -0x406b851f    # -1.16f

    .line 132
    .line 133
    .line 134
    const v24, -0x3f570a3d    # -5.28f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v25, 0x3f947ae1    # 1.16f

    .line 141
    .line 142
    .line 143
    const/16 v21, 0x0

    .line 144
    .line 145
    const v22, -0x3fd1eb85    # -2.72f

    .line 146
    .line 147
    .line 148
    const v23, 0x3ec7ae14    # 0.39f

    .line 149
    .line 150
    .line 151
    const v24, -0x3f533333    # -5.4f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, 0x40d147ae    # 6.54f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const/16 v16, 0x3800

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const v6, 0x3e99999a    # 0.3f

    .line 175
    .line 176
    .line 177
    const v8, 0x3e99999a    # 0.3f

    .line 178
    .line 179
    .line 180
    const/4 v7, 0x0

    .line 181
    const/high16 v9, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/high16 v12, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const/4 v14, 0x0

    .line 187
    const/4 v15, 0x0

    .line 188
    const-string v4, ""

    .line 189
    .line 190
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 191
    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 198
    .line 199
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    const/4 v0, 0x0

    .line 204
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 218
    .line 219
    .line 220
    const v0, 0x419f851f    # 19.94f

    .line 221
    .line 222
    .line 223
    const v2, 0x41a8f5c3    # 21.12f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, -0x402e147b    # -1.64f

    .line 230
    .line 231
    .line 232
    const v18, -0x3eee147b    # -9.12f

    .line 233
    .line 234
    .line 235
    const v13, -0x40733333    # -1.1f

    .line 236
    .line 237
    .line 238
    const v14, -0x3fc3d70a    # -2.94f

    .line 239
    .line 240
    .line 241
    const v15, -0x402e147b    # -1.64f

    .line 242
    .line 243
    .line 244
    const v16, -0x3f3f0a3d    # -6.03f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, 0x3fd1eb85    # 1.64f

    .line 251
    .line 252
    .line 253
    const/4 v13, 0x0

    .line 254
    const v14, -0x3fba3d71    # -3.09f

    .line 255
    .line 256
    .line 257
    const v15, 0x3f0ccccd    # 0.55f

    .line 258
    .line 259
    .line 260
    const v16, -0x3f3a3d71    # -6.18f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x3d75c28f    # 0.06f

    .line 267
    .line 268
    .line 269
    const v18, -0x416147ae    # -0.31f

    .line 270
    .line 271
    .line 272
    const v13, 0x3d23d70a    # 0.04f

    .line 273
    .line 274
    .line 275
    const v14, -0x421eb852    # -0.11f

    .line 276
    .line 277
    .line 278
    const v15, 0x3d75c28f    # 0.06f

    .line 279
    .line 280
    .line 281
    const v16, -0x419eb852    # -0.22f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const v17, -0x40deb852    # -0.63f

    .line 288
    .line 289
    .line 290
    const v18, -0x40ee147b    # -0.57f

    .line 291
    .line 292
    .line 293
    const/4 v13, 0x0

    .line 294
    const v14, -0x4151eb85    # -0.34f

    .line 295
    .line 296
    .line 297
    const v15, -0x41947ae1    # -0.23f

    .line 298
    .line 299
    .line 300
    const v16, -0x40ee147b    # -0.57f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x409428f6    # 4.63f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v18, 0x3f11eb85    # 0.57f

    .line 313
    .line 314
    .line 315
    const v13, -0x41333333    # -0.4f

    .line 316
    .line 317
    .line 318
    const/4 v14, 0x0

    .line 319
    const v15, -0x40deb852    # -0.63f

    .line 320
    .line 321
    .line 322
    const v16, 0x3e6b851f    # 0.23f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, 0x3d75c28f    # 0.06f

    .line 329
    .line 330
    .line 331
    const v18, 0x3e9eb852    # 0.31f

    .line 332
    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const v14, 0x3dcccccd    # 0.1f

    .line 336
    .line 337
    .line 338
    const v15, 0x3ca3d70a    # 0.02f

    .line 339
    .line 340
    .line 341
    const v16, 0x3e4ccccd    # 0.2f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v17, 0x40b6b852    # 5.71f

    .line 348
    .line 349
    .line 350
    const/high16 v18, 0x41400000    # 12.0f

    .line 351
    .line 352
    const v13, 0x40a51eb8    # 5.16f

    .line 353
    .line 354
    .line 355
    const v14, 0x40ba3d71    # 5.82f

    .line 356
    .line 357
    .line 358
    const v15, 0x40b6b852    # 5.71f

    .line 359
    .line 360
    .line 361
    const v16, 0x410e8f5c    # 8.91f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v17, -0x402e147b    # -1.64f

    .line 368
    .line 369
    .line 370
    const v18, 0x4111eb85    # 9.12f

    .line 371
    .line 372
    .line 373
    const/4 v13, 0x0

    .line 374
    const v14, 0x4045c28f    # 3.09f

    .line 375
    .line 376
    .line 377
    const v15, -0x40f33333    # -0.55f

    .line 378
    .line 379
    .line 380
    const v16, 0x40c5c28f    # 6.18f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, -0x4270a3d7    # -0.07f

    .line 387
    .line 388
    .line 389
    const v18, 0x3e9eb852    # 0.31f

    .line 390
    .line 391
    .line 392
    const v13, -0x42b33333    # -0.05f

    .line 393
    .line 394
    .line 395
    const v14, 0x3de147ae    # 0.11f

    .line 396
    .line 397
    .line 398
    const v15, -0x4270a3d7    # -0.07f

    .line 399
    .line 400
    .line 401
    const v16, 0x3e6147ae    # 0.22f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, 0x3f2147ae    # 0.63f

    .line 408
    .line 409
    .line 410
    const v18, 0x3f11eb85    # 0.57f

    .line 411
    .line 412
    .line 413
    const/4 v13, 0x0

    .line 414
    const v14, 0x3ea8f5c3    # 0.33f

    .line 415
    .line 416
    .line 417
    const v15, 0x3e6b851f    # 0.23f

    .line 418
    .line 419
    .line 420
    const v16, 0x3f11eb85    # 0.57f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const/high16 v0, 0x416c0000    # 14.75f

    .line 427
    .line 428
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v18, -0x40ee147b    # -0.57f

    .line 432
    .line 433
    .line 434
    const v13, 0x3ec7ae14    # 0.39f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const v15, 0x3f2147ae    # 0.63f

    .line 439
    .line 440
    .line 441
    const v16, -0x418a3d71    # -0.24f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, -0x4270a3d7    # -0.07f

    .line 448
    .line 449
    .line 450
    const v18, -0x416147ae    # -0.31f

    .line 451
    .line 452
    .line 453
    const v13, -0x43dc28f6    # -0.01f

    .line 454
    .line 455
    .line 456
    const v14, -0x42333333    # -0.1f

    .line 457
    .line 458
    .line 459
    const v15, -0x430a3d71    # -0.03f

    .line 460
    .line 461
    .line 462
    const v16, -0x41b33333    # -0.2f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x418b999a    # 17.45f

    .line 472
    .line 473
    .line 474
    const/high16 v2, 0x41a00000    # 20.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, 0x40d147ae    # 6.54f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, 0x3f947ae1    # 1.16f

    .line 486
    .line 487
    .line 488
    const/high16 v18, -0x3f000000    # -8.0f

    .line 489
    .line 490
    const v13, 0x3f451eb8    # 0.77f

    .line 491
    .line 492
    .line 493
    const v14, -0x3fd9999a    # -2.6f

    .line 494
    .line 495
    .line 496
    const v15, 0x3f947ae1    # 1.16f

    .line 497
    .line 498
    .line 499
    const v16, -0x3f570a3d    # -5.28f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, -0x406b851f    # -1.16f

    .line 506
    .line 507
    .line 508
    const/4 v13, 0x0

    .line 509
    const v14, -0x3fd1eb85    # -2.72f

    .line 510
    .line 511
    .line 512
    const v15, -0x413851ec    # -0.39f

    .line 513
    .line 514
    .line 515
    const v16, -0x3f533333    # -5.4f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x412e8f5c    # 10.91f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/high16 v18, 0x41000000    # 8.0f

    .line 528
    .line 529
    const v13, -0x40bae148    # -0.77f

    .line 530
    .line 531
    .line 532
    const v14, 0x40266666    # 2.6f

    .line 533
    .line 534
    .line 535
    const v15, -0x406b851f    # -1.16f

    .line 536
    .line 537
    .line 538
    const v16, 0x40a8f5c3    # 5.28f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, 0x3f947ae1    # 1.16f

    .line 545
    .line 546
    .line 547
    const/4 v13, 0x0

    .line 548
    const v14, 0x402e147b    # 2.72f

    .line 549
    .line 550
    .line 551
    const v15, 0x3ec7ae14    # 0.39f

    .line 552
    .line 553
    .line 554
    const v16, 0x40accccd    # 5.4f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    const/16 v16, 0x3800

    .line 568
    .line 569
    const/16 v17, 0x0

    .line 570
    .line 571
    const/high16 v6, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/high16 v8, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/4 v7, 0x0

    .line 576
    const/high16 v12, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v14, 0x0

    .line 579
    const/4 v15, 0x0

    .line 580
    const-string v4, ""

    .line 581
    .line 582
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    sput-object v0, Landroidx/compose/material/icons/twotone/PanoramaVerticalKt;->_panoramaVertical:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 591
    .line 592
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    return-object v0
.end method

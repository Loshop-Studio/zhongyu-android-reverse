.class public final Landroidx/compose/material/icons/rounded/Diversity2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _diversity2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDiversity2(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/Diversity2Kt;->_diversity2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Diversity2"

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
    const v4, 0x4173ae14    # 15.23f

    .line 71
    .line 72
    .line 73
    const v6, 0x412c51ec    # 10.77f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v25, -0x42dc28f6    # -0.04f

    .line 83
    .line 84
    .line 85
    const v26, -0x40466666    # -1.45f

    .line 86
    .line 87
    .line 88
    const v21, 0x3ecccccd    # 0.4f

    .line 89
    .line 90
    .line 91
    const v22, -0x41333333    # -0.4f

    .line 92
    .line 93
    .line 94
    const v23, 0x3ec7ae14    # 0.39f

    .line 95
    .line 96
    .line 97
    const v24, -0x40770a3d    # -1.07f

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
    const v25, 0x40e23d71    # 7.07f

    .line 106
    .line 107
    .line 108
    const v26, 0x410547ae    # 8.33f

    .line 109
    .line 110
    .line 111
    const v21, 0x4102b852    # 8.17f

    .line 112
    .line 113
    .line 114
    const v22, 0x4137851f    # 11.47f

    .line 115
    .line 116
    .line 117
    const v23, 0x40d4cccd    # 6.65f

    .line 118
    .line 119
    .line 120
    const v24, 0x411e6666    # 9.9f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v25, 0x410d999a    # 8.85f

    .line 127
    .line 128
    .line 129
    const/high16 v26, 0x40e00000    # 7.0f

    .line 130
    .line 131
    const v21, 0x40e947ae    # 7.29f

    .line 132
    .line 133
    .line 134
    const v22, 0x40f0a3d7    # 7.52f

    .line 135
    .line 136
    .line 137
    const v23, 0x410028f6    # 8.01f

    .line 138
    .line 139
    .line 140
    const/high16 v24, 0x40e00000    # 7.0f

    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v25, 0x402b851f    # 2.68f

    .line 146
    .line 147
    .line 148
    const/high16 v26, 0x40000000    # 2.0f

    .line 149
    .line 150
    const v21, 0x3f8e147b    # 1.11f

    .line 151
    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    const v23, 0x3fc51eb8    # 1.54f

    .line 156
    .line 157
    .line 158
    const v24, 0x3f266666    # 0.65f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, 0x3f6e147b    # 0.93f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v26, -0x40000000    # -2.0f

    .line 171
    .line 172
    const v21, 0x3f8f5c29    # 1.12f

    .line 173
    .line 174
    .line 175
    const v22, -0x405851ec    # -1.31f

    .line 176
    .line 177
    .line 178
    const v23, 0x3fc3d70a    # 1.53f

    .line 179
    .line 180
    .line 181
    const/high16 v24, -0x40000000    # -2.0f

    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v25, 0x3fe28f5c    # 1.77f

    .line 187
    .line 188
    .line 189
    const v26, 0x3fa8f5c3    # 1.32f

    .line 190
    .line 191
    .line 192
    const v21, 0x3f5eb852    # 0.87f

    .line 193
    .line 194
    .line 195
    const/16 v22, 0x0

    .line 196
    .line 197
    const v23, 0x3fc66666    # 1.55f

    .line 198
    .line 199
    .line 200
    const v24, 0x3f0a3d71    # 0.54f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v25, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const v26, -0x428a3d71    # -0.06f

    .line 209
    .line 210
    .line 211
    const v21, 0x3eb33333    # 0.35f

    .line 212
    .line 213
    .line 214
    const v22, -0x42dc28f6    # -0.04f

    .line 215
    .line 216
    .line 217
    const v23, 0x3f2e147b    # 0.68f

    .line 218
    .line 219
    .line 220
    const v24, -0x428a3d71    # -0.06f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v25, 0x3f83d70a    # 1.03f

    .line 227
    .line 228
    .line 229
    const v26, 0x3da3d70a    # 0.08f

    .line 230
    .line 231
    .line 232
    const v21, 0x3eb851ec    # 0.36f

    .line 233
    .line 234
    .line 235
    const/16 v22, 0x0

    .line 236
    .line 237
    const v23, 0x3f333333    # 0.7f

    .line 238
    .line 239
    .line 240
    const v24, 0x3cf5c28f    # 0.03f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v25, 0x41726666    # 15.15f

    .line 247
    .line 248
    .line 249
    const/high16 v26, 0x40a00000    # 5.0f

    .line 250
    .line 251
    const v21, 0x4195999a    # 18.7f

    .line 252
    .line 253
    .line 254
    const v22, 0x40cdc28f    # 6.43f

    .line 255
    .line 256
    .line 257
    const v23, 0x41890a3d    # 17.13f

    .line 258
    .line 259
    .line 260
    const/high16 v24, 0x40a00000    # 5.0f

    .line 261
    .line 262
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v25, -0x414ccccd    # -0.35f

    .line 266
    .line 267
    .line 268
    const v26, 0x3d23d70a    # 0.04f

    .line 269
    .line 270
    .line 271
    const v21, -0x420a3d71    # -0.12f

    .line 272
    .line 273
    .line 274
    const/16 v22, 0x0

    .line 275
    .line 276
    const v23, -0x41947ae1    # -0.23f

    .line 277
    .line 278
    .line 279
    const v24, 0x3cf5c28f    # 0.03f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v25, -0x41c7ae14    # -0.18f

    .line 286
    .line 287
    .line 288
    const v26, -0x3fe47ae1    # -2.43f

    .line 289
    .line 290
    .line 291
    const v21, 0x3e851eb8    # 0.26f

    .line 292
    .line 293
    .line 294
    const v22, -0x40ca3d71    # -0.71f

    .line 295
    .line 296
    .line 297
    const v23, 0x3e9eb852    # 0.31f

    .line 298
    .line 299
    .line 300
    const v24, -0x403c28f6    # -1.53f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const/high16 v25, 0x41480000    # 12.5f

    .line 307
    .line 308
    const v26, 0x3f851eb8    # 1.04f

    .line 309
    .line 310
    .line 311
    const v21, 0x41630a3d    # 14.19f

    .line 312
    .line 313
    .line 314
    const v22, 0x3fe66666    # 1.8f

    .line 315
    .line 316
    .line 317
    const v23, 0x41566666    # 13.4f

    .line 318
    .line 319
    .line 320
    const v24, 0x3f970a3d    # 1.18f

    .line 321
    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v25, 0x41100000    # 9.0f

    .line 327
    .line 328
    const/high16 v26, 0x40800000    # 4.0f

    .line 329
    .line 330
    const v21, 0x4129eb85    # 10.62f

    .line 331
    .line 332
    .line 333
    const v22, 0x3f3d70a4    # 0.74f

    .line 334
    .line 335
    .line 336
    const/high16 v23, 0x41100000    # 9.0f

    .line 337
    .line 338
    const v24, 0x400b851f    # 2.18f

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const v25, 0x3e4ccccd    # 0.2f

    .line 345
    .line 346
    .line 347
    const v26, 0x3f851eb8    # 1.04f

    .line 348
    .line 349
    .line 350
    const/16 v21, 0x0

    .line 351
    .line 352
    const v22, 0x3ebd70a4    # 0.37f

    .line 353
    .line 354
    .line 355
    const v23, 0x3da3d70a    # 0.08f

    .line 356
    .line 357
    .line 358
    const v24, 0x3f35c28f    # 0.71f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const v25, 0x410d999a    # 8.85f

    .line 365
    .line 366
    .line 367
    const/high16 v26, 0x40a00000    # 5.0f

    .line 368
    .line 369
    const v21, 0x411147ae    # 9.08f

    .line 370
    .line 371
    .line 372
    const v22, 0x40a0f5c3    # 5.03f

    .line 373
    .line 374
    .line 375
    const v23, 0x410f851f    # 8.97f

    .line 376
    .line 377
    .line 378
    const/high16 v24, 0x40a00000    # 5.0f

    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const/high16 v25, 0x40a00000    # 5.0f

    .line 384
    .line 385
    const v26, 0x410d999a    # 8.85f

    .line 386
    .line 387
    .line 388
    const v21, 0x40d6147b    # 6.69f

    .line 389
    .line 390
    .line 391
    const/high16 v22, 0x40a00000    # 5.0f

    .line 392
    .line 393
    const/high16 v23, 0x40a00000    # 5.0f

    .line 394
    .line 395
    const v24, 0x40d6147b    # 6.69f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v25, 0x408ccccd    # 4.4f

    .line 402
    .line 403
    .line 404
    const v26, 0x40cd1eb8    # 6.41f

    .line 405
    .line 406
    .line 407
    const/16 v21, 0x0

    .line 408
    .line 409
    const v22, 0x400eb852    # 2.23f

    .line 410
    .line 411
    .line 412
    const v23, 0x3fdd70a4    # 1.73f

    .line 413
    .line 414
    .line 415
    const v24, 0x408051ec    # 4.01f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v25, 0x412c51ec    # 10.77f

    .line 422
    .line 423
    .line 424
    const v26, 0x4173ae14    # 15.23f

    .line 425
    .line 426
    .line 427
    const v21, 0x411ca3d7    # 9.79f

    .line 428
    .line 429
    .line 430
    const v22, 0x4179eb85    # 15.62f

    .line 431
    .line 432
    .line 433
    const v23, 0x41266666    # 10.4f

    .line 434
    .line 435
    .line 436
    const v24, 0x4179999a    # 15.6f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    const/16 v16, 0x3800

    .line 450
    .line 451
    const/16 v17, 0x0

    .line 452
    .line 453
    const/high16 v6, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/high16 v8, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v7, 0x0

    .line 458
    const/high16 v9, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/high16 v12, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const/4 v14, 0x0

    .line 464
    const/4 v15, 0x0

    .line 465
    const-string v4, ""

    .line 466
    .line 467
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 468
    .line 469
    .line 470
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 475
    .line 476
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 477
    .line 478
    .line 479
    move-result-wide v6

    .line 480
    const/4 v2, 0x0

    .line 481
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 485
    .line 486
    .line 487
    move-result v10

    .line 488
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 489
    .line 490
    .line 491
    move-result v11

    .line 492
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 495
    .line 496
    .line 497
    const v4, 0x41bc28f6    # 23.52f

    .line 498
    .line 499
    .line 500
    const/high16 v6, 0x418a0000    # 17.25f

    .line 501
    .line 502
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v25, -0x3fff5c29    # -2.01f

    .line 506
    .line 507
    .line 508
    const v26, -0x4051eb85    # -1.36f

    .line 509
    .line 510
    .line 511
    const v21, -0x40f5c28f    # -0.54f

    .line 512
    .line 513
    .line 514
    const v22, -0x40a147ae    # -0.87f

    .line 515
    .line 516
    .line 517
    const v23, -0x405d70a4    # -1.27f

    .line 518
    .line 519
    .line 520
    const v24, -0x40628f5c    # -1.23f

    .line 521
    .line 522
    .line 523
    move-object/from16 v20, v2

    .line 524
    .line 525
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    const v25, 0x3e570a3d    # 0.21f

    .line 529
    .line 530
    .line 531
    const v26, -0x4170a3d7    # -0.28f

    .line 532
    .line 533
    .line 534
    const v21, 0x3d8f5c29    # 0.07f

    .line 535
    .line 536
    .line 537
    const v22, -0x42333333    # -0.1f

    .line 538
    .line 539
    .line 540
    const v23, 0x3e19999a    # 0.15f

    .line 541
    .line 542
    .line 543
    const v24, -0x41c7ae14    # -0.18f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v25, -0x404b851f    # -1.41f

    .line 550
    .line 551
    .line 552
    const v26, -0x3f57ae14    # -5.26f

    .line 553
    .line 554
    .line 555
    const v21, 0x3f8a3d71    # 1.08f

    .line 556
    .line 557
    .line 558
    const v22, -0x4010a3d7    # -1.87f

    .line 559
    .line 560
    .line 561
    const v23, 0x3eeb851f    # 0.46f

    .line 562
    .line 563
    .line 564
    const v24, -0x3f7a3d71    # -4.18f

    .line 565
    .line 566
    .line 567
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v25, -0x3f080000    # -7.75f

    .line 571
    .line 572
    const v26, 0x3f19999a    # 0.6f

    .line 573
    .line 574
    .line 575
    const v21, -0x4008f5c3    # -1.93f

    .line 576
    .line 577
    .line 578
    const v22, -0x4071eb85    # -1.11f

    .line 579
    .line 580
    .line 581
    const v23, -0x3f751eb8    # -4.34f

    .line 582
    .line 583
    .line 584
    const/high16 v24, -0x41000000    # -0.5f

    .line 585
    .line 586
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v25, -0x40d70a3d    # -0.66f

    .line 590
    .line 591
    .line 592
    const v26, 0x3f9ae148    # 1.21f

    .line 593
    .line 594
    .line 595
    const v21, -0x40fd70a4    # -0.51f

    .line 596
    .line 597
    .line 598
    const v22, 0x3e23d70a    # 0.16f

    .line 599
    .line 600
    .line 601
    const v23, -0x40b5c28f    # -0.79f

    .line 602
    .line 603
    .line 604
    const v24, 0x3f333333    # 0.7f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/4 v4, 0x0

    .line 611
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v25, 0x3fa3d70a    # 1.28f

    .line 615
    .line 616
    .line 617
    const v26, 0x3f30a3d7    # 0.69f

    .line 618
    .line 619
    .line 620
    const v21, 0x3e19999a    # 0.15f

    .line 621
    .line 622
    .line 623
    const v22, 0x3f0ccccd    # 0.55f

    .line 624
    .line 625
    .line 626
    const v23, 0x3f3ae148    # 0.73f

    .line 627
    .line 628
    .line 629
    const v24, 0x3f5eb852    # 0.87f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v25, 0x40d1999a    # 6.55f

    .line 636
    .line 637
    .line 638
    const v26, -0x4119999a    # -0.45f

    .line 639
    .line 640
    .line 641
    const v21, 0x4051eb85    # 3.28f

    .line 642
    .line 643
    .line 644
    const v22, -0x407851ec    # -1.06f

    .line 645
    .line 646
    .line 647
    const v23, 0x40accccd    # 5.4f

    .line 648
    .line 649
    .line 650
    const v24, -0x40333333    # -1.6f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v25, 0x3e851eb8    # 0.26f

    .line 657
    .line 658
    .line 659
    const v26, 0x400d70a4    # 2.21f

    .line 660
    .line 661
    .line 662
    const v21, 0x3f170a3d    # 0.59f

    .line 663
    .line 664
    .line 665
    const v22, 0x3f170a3d    # 0.59f

    .line 666
    .line 667
    .line 668
    const v23, 0x3f2e147b    # 0.68f

    .line 669
    .line 670
    .line 671
    const v24, 0x3fbd70a4    # 1.48f

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v25, -0x3fbb851f    # -3.07f

    .line 678
    .line 679
    .line 680
    const v26, 0x3fa8f5c3    # 1.32f

    .line 681
    .line 682
    .line 683
    const v21, -0x40f0a3d7    # -0.56f

    .line 684
    .line 685
    .line 686
    const v22, 0x3f75c28f    # 0.96f

    .line 687
    .line 688
    .line 689
    const v23, -0x4055c28f    # -1.33f

    .line 690
    .line 691
    .line 692
    const/high16 v24, 0x3f800000    # 1.0f

    .line 693
    .line 694
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v4, -0x410f5c29    # -0.47f

    .line 698
    .line 699
    .line 700
    const v6, 0x3f4f5c29    # 0.81f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v25, 0x3ec7ae14    # 0.39f

    .line 707
    .line 708
    .line 709
    const v26, 0x40547ae1    # 3.32f

    .line 710
    .line 711
    .line 712
    const v21, 0x3f147ae1    # 0.58f

    .line 713
    .line 714
    .line 715
    const v22, 0x3fcf5c29    # 1.62f

    .line 716
    .line 717
    .line 718
    const v23, 0x3f7851ec    # 0.97f

    .line 719
    .line 720
    .line 721
    const v24, 0x40151eb8    # 2.33f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const v25, -0x3fde147b    # -2.53f

    .line 728
    .line 729
    .line 730
    const v26, 0x3f2e147b    # 0.68f

    .line 731
    .line 732
    .line 733
    const v21, -0x40f851ec    # -0.53f

    .line 734
    .line 735
    .line 736
    const v22, 0x3f68f5c3    # 0.91f

    .line 737
    .line 738
    .line 739
    const v23, -0x4031eb85    # -1.61f

    .line 740
    .line 741
    .line 742
    const v24, 0x3f99999a    # 1.2f

    .line 743
    .line 744
    .line 745
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const v25, -0x41d1eb85    # -0.17f

    .line 749
    .line 750
    .line 751
    const v26, -0x41fae148    # -0.13f

    .line 752
    .line 753
    .line 754
    const v21, -0x428a3d71    # -0.06f

    .line 755
    .line 756
    .line 757
    const v22, -0x430a3d71    # -0.03f

    .line 758
    .line 759
    .line 760
    const v23, -0x421eb852    # -0.11f

    .line 761
    .line 762
    .line 763
    const v24, -0x4247ae14    # -0.09f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v25, -0x407c28f6    # -1.03f

    .line 770
    .line 771
    .line 772
    const v26, 0x3fdd70a4    # 1.73f

    .line 773
    .line 774
    .line 775
    const v21, -0x41666666    # -0.3f

    .line 776
    .line 777
    .line 778
    const v22, 0x3f2b851f    # 0.67f

    .line 779
    .line 780
    .line 781
    const v23, -0x40dc28f6    # -0.64f

    .line 782
    .line 783
    .line 784
    const v24, 0x3f9eb852    # 1.24f

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/16 v25, 0x0

    .line 791
    .line 792
    const v26, 0x3c23d70a    # 0.01f

    .line 793
    .line 794
    .line 795
    const/16 v21, 0x0

    .line 796
    .line 797
    const v22, 0x3c23d70a    # 0.01f

    .line 798
    .line 799
    .line 800
    const/16 v23, 0x0

    .line 801
    .line 802
    const v24, 0x3c23d70a    # 0.01f

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    const v25, 0x40aeb852    # 5.46f

    .line 809
    .line 810
    .line 811
    const v26, -0x405ae148    # -1.29f

    .line 812
    .line 813
    .line 814
    const v21, 0x3ff33333    # 1.9f

    .line 815
    .line 816
    .line 817
    const v22, 0x3f9eb852    # 1.24f

    .line 818
    .line 819
    .line 820
    const v23, 0x408ae148    # 4.34f

    .line 821
    .line 822
    .line 823
    const v24, 0x3f23d70a    # 0.64f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v25, 0x3e0f5c29    # 0.14f

    .line 830
    .line 831
    .line 832
    const v26, -0x415c28f6    # -0.32f

    .line 833
    .line 834
    .line 835
    const v21, 0x3d75c28f    # 0.06f

    .line 836
    .line 837
    .line 838
    const v22, -0x42333333    # -0.1f

    .line 839
    .line 840
    .line 841
    const v23, 0x3db851ec    # 0.09f

    .line 842
    .line 843
    .line 844
    const v24, -0x41a8f5c3    # -0.21f

    .line 845
    .line 846
    .line 847
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const v25, 0x3f4ccccd    # 0.8f

    .line 851
    .line 852
    .line 853
    const v26, 0x3f30a3d7    # 0.69f

    .line 854
    .line 855
    .line 856
    const v21, 0x3e6147ae    # 0.22f

    .line 857
    .line 858
    .line 859
    const v22, 0x3e8a3d71    # 0.27f

    .line 860
    .line 861
    .line 862
    const v23, 0x3ef5c28f    # 0.48f

    .line 863
    .line 864
    .line 865
    const v24, 0x3f028f5c    # 0.51f

    .line 866
    .line 867
    .line 868
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const v25, 0x4089eb85    # 4.31f

    .line 872
    .line 873
    .line 874
    const v26, -0x4039999a    # -1.55f

    .line 875
    .line 876
    .line 877
    const v21, 0x3fca3d71    # 1.58f

    .line 878
    .line 879
    .line 880
    const v22, 0x3f68f5c3    # 0.91f

    .line 881
    .line 882
    .line 883
    const v23, 0x4068f5c3    # 3.64f

    .line 884
    .line 885
    .line 886
    const v24, 0x3e6b851f    # 0.23f

    .line 887
    .line 888
    .line 889
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v25, 0x41bc28f6    # 23.52f

    .line 893
    .line 894
    .line 895
    const/high16 v26, 0x418a0000    # 17.25f

    .line 896
    .line 897
    const v21, 0x41c11eb8    # 24.14f

    .line 898
    .line 899
    .line 900
    const v22, 0x419828f6    # 19.02f

    .line 901
    .line 902
    .line 903
    const/high16 v23, 0x41c00000    # 24.0f

    .line 904
    .line 905
    const v24, 0x41903d71    # 18.03f

    .line 906
    .line 907
    .line 908
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 915
    .line 916
    .line 917
    move-result-object v2

    .line 918
    const/high16 v6, 0x3f800000    # 1.0f

    .line 919
    .line 920
    const/4 v7, 0x0

    .line 921
    const-string v4, ""

    .line 922
    .line 923
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 924
    .line 925
    .line 926
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 927
    .line 928
    .line 929
    move-result v3

    .line 930
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 931
    .line 932
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 933
    .line 934
    .line 935
    move-result-wide v6

    .line 936
    const/4 v0, 0x0

    .line 937
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 941
    .line 942
    .line 943
    move-result v10

    .line 944
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 945
    .line 946
    .line 947
    move-result v11

    .line 948
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 951
    .line 952
    .line 953
    const v0, 0x4141999a    # 12.1f

    .line 954
    .line 955
    .line 956
    const v2, 0x4170a3d7    # 15.04f

    .line 957
    .line 958
    .line 959
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const v17, -0x3fc70a3d    # -2.89f

    .line 963
    .line 964
    .line 965
    const v18, 0x40bccccd    # 5.9f

    .line 966
    .line 967
    .line 968
    const v13, -0x40c7ae14    # -0.72f

    .line 969
    .line 970
    .line 971
    const v14, 0x405851ec    # 3.38f

    .line 972
    .line 973
    .line 974
    const v15, -0x40570a3d    # -1.32f

    .line 975
    .line 976
    .line 977
    const v16, 0x40af5c29    # 5.48f

    .line 978
    .line 979
    .line 980
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const v17, -0x3ffd70a4    # -2.04f

    .line 984
    .line 985
    .line 986
    const v18, -0x409eb852    # -0.88f

    .line 987
    .line 988
    .line 989
    const v13, -0x40b0a3d7    # -0.81f

    .line 990
    .line 991
    .line 992
    const v14, 0x3e6147ae    # 0.22f

    .line 993
    .line 994
    .line 995
    const v15, -0x4030a3d7    # -1.62f

    .line 996
    .line 997
    .line 998
    const v16, -0x41e66666    # -0.15f

    .line 999
    .line 1000
    .line 1001
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const v17, 0x3ec7ae14    # 0.39f

    .line 1005
    .line 1006
    .line 1007
    const v18, -0x3fab851f    # -3.32f

    .line 1008
    .line 1009
    .line 1010
    const v13, -0x40f0a3d7    # -0.56f

    .line 1011
    .line 1012
    .line 1013
    const v14, -0x408a3d71    # -0.96f

    .line 1014
    .line 1015
    .line 1016
    const v15, -0x41b33333    # -0.2f

    .line 1017
    .line 1018
    .line 1019
    const v16, -0x402b851f    # -1.66f

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1023
    .line 1024
    .line 1025
    const v0, 0x40e33333    # 7.1f

    .line 1026
    .line 1027
    .line 1028
    const v2, 0x417ee148    # 15.93f

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1032
    .line 1033
    .line 1034
    const v17, -0x3fbb851f    # -3.07f

    .line 1035
    .line 1036
    .line 1037
    const v18, -0x40570a3d    # -1.32f

    .line 1038
    .line 1039
    .line 1040
    const v13, -0x40266666    # -1.7f

    .line 1041
    .line 1042
    .line 1043
    const v14, -0x416147ae    # -0.31f

    .line 1044
    .line 1045
    .line 1046
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 1047
    .line 1048
    const v16, -0x41570a3d    # -0.33f

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1052
    .line 1053
    .line 1054
    const v17, 0x3f2e147b    # 0.68f

    .line 1055
    .line 1056
    .line 1057
    const v18, -0x3fde147b    # -2.53f

    .line 1058
    .line 1059
    .line 1060
    const v13, -0x40f851ec    # -0.53f

    .line 1061
    .line 1062
    .line 1063
    const v14, -0x40970a3d    # -0.91f

    .line 1064
    .line 1065
    .line 1066
    const v15, -0x418a3d71    # -0.24f

    .line 1067
    .line 1068
    .line 1069
    const/high16 v16, -0x40000000    # -2.0f

    .line 1070
    .line 1071
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1072
    .line 1073
    .line 1074
    const v17, 0x3e947ae1    # 0.29f

    .line 1075
    .line 1076
    .line 1077
    const v18, -0x421eb852    # -0.11f

    .line 1078
    .line 1079
    .line 1080
    const v13, 0x3db851ec    # 0.09f

    .line 1081
    .line 1082
    .line 1083
    const v14, -0x42b33333    # -0.05f

    .line 1084
    .line 1085
    .line 1086
    const v15, 0x3e428f5c    # 0.19f

    .line 1087
    .line 1088
    .line 1089
    const v16, -0x425c28f6    # -0.08f

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const v17, -0x40d47ae1    # -0.67f

    .line 1096
    .line 1097
    .line 1098
    const v18, -0x4050a3d7    # -1.37f

    .line 1099
    .line 1100
    .line 1101
    const v13, -0x4175c28f    # -0.27f

    .line 1102
    .line 1103
    .line 1104
    const v14, -0x4128f5c3    # -0.42f

    .line 1105
    .line 1106
    .line 1107
    const/high16 v15, -0x41000000    # -0.5f

    .line 1108
    .line 1109
    const v16, -0x40a147ae    # -0.87f

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1113
    .line 1114
    .line 1115
    const v17, -0x40e66666    # -0.6f

    .line 1116
    .line 1117
    .line 1118
    const v18, -0x417ae148    # -0.26f

    .line 1119
    .line 1120
    .line 1121
    const v13, -0x418a3d71    # -0.24f

    .line 1122
    .line 1123
    .line 1124
    const v14, -0x421eb852    # -0.11f

    .line 1125
    .line 1126
    .line 1127
    const v15, -0x4147ae14    # -0.36f

    .line 1128
    .line 1129
    .line 1130
    const v16, -0x41dc28f6    # -0.16f

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1134
    .line 1135
    .line 1136
    const v17, -0x4048f5c3    # -1.43f

    .line 1137
    .line 1138
    .line 1139
    const v18, 0x40a8a3d7    # 5.27f

    .line 1140
    .line 1141
    .line 1142
    const v13, -0x400f5c29    # -1.88f

    .line 1143
    .line 1144
    .line 1145
    const v14, 0x3f88f5c3    # 1.07f

    .line 1146
    .line 1147
    .line 1148
    const v15, -0x3fdf5c29    # -2.51f

    .line 1149
    .line 1150
    .line 1151
    const v16, 0x4059999a    # 3.4f

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1155
    .line 1156
    .line 1157
    const v17, 0x3e570a3d    # 0.21f

    .line 1158
    .line 1159
    .line 1160
    const v18, 0x3e8f5c29    # 0.28f

    .line 1161
    .line 1162
    .line 1163
    const v13, 0x3d75c28f    # 0.06f

    .line 1164
    .line 1165
    .line 1166
    const v14, 0x3dcccccd    # 0.1f

    .line 1167
    .line 1168
    .line 1169
    const v15, 0x3e0f5c29    # 0.14f

    .line 1170
    .line 1171
    .line 1172
    const v16, 0x3e3851ec    # 0.18f

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1176
    .line 1177
    .line 1178
    const v17, -0x3fff5c29    # -2.01f

    .line 1179
    .line 1180
    .line 1181
    const v18, 0x3fae147b    # 1.36f

    .line 1182
    .line 1183
    .line 1184
    const/high16 v13, -0x40c00000    # -0.75f

    .line 1185
    .line 1186
    const v14, 0x3e051eb8    # 0.13f

    .line 1187
    .line 1188
    .line 1189
    const v15, -0x40428f5c    # -1.48f

    .line 1190
    .line 1191
    .line 1192
    const v16, 0x3efae148    # 0.49f

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1196
    .line 1197
    .line 1198
    const v17, -0x41666666    # -0.3f

    .line 1199
    .line 1200
    .line 1201
    const v18, 0x402851ec    # 2.63f

    .line 1202
    .line 1203
    .line 1204
    const v13, -0x410a3d71    # -0.48f

    .line 1205
    .line 1206
    .line 1207
    const v14, 0x3f47ae14    # 0.78f

    .line 1208
    .line 1209
    .line 1210
    const v15, -0x40e147ae    # -0.62f

    .line 1211
    .line 1212
    .line 1213
    const v16, 0x3fe28f5c    # 1.77f

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1217
    .line 1218
    .line 1219
    const v17, 0x4089eb85    # 4.31f

    .line 1220
    .line 1221
    .line 1222
    const v18, 0x3fc66666    # 1.55f

    .line 1223
    .line 1224
    .line 1225
    const v13, 0x3f2e147b    # 0.68f

    .line 1226
    .line 1227
    .line 1228
    const v14, 0x3fe3d70a    # 1.78f

    .line 1229
    .line 1230
    .line 1231
    const v15, 0x402f5c29    # 2.74f

    .line 1232
    .line 1233
    .line 1234
    const v16, 0x401d70a4    # 2.46f

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1238
    .line 1239
    .line 1240
    const v17, 0x3f4ccccd    # 0.8f

    .line 1241
    .line 1242
    .line 1243
    const v18, -0x40cf5c29    # -0.69f

    .line 1244
    .line 1245
    .line 1246
    const v13, 0x3ea3d70a    # 0.32f

    .line 1247
    .line 1248
    .line 1249
    const v14, -0x41c7ae14    # -0.18f

    .line 1250
    .line 1251
    .line 1252
    const v15, 0x3f147ae1    # 0.58f

    .line 1253
    .line 1254
    .line 1255
    const v16, -0x4128f5c3    # -0.42f

    .line 1256
    .line 1257
    .line 1258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1259
    .line 1260
    .line 1261
    const v17, 0x3e0f5c29    # 0.14f

    .line 1262
    .line 1263
    .line 1264
    const v18, 0x3ea3d70a    # 0.32f

    .line 1265
    .line 1266
    .line 1267
    const v13, 0x3d4ccccd    # 0.05f

    .line 1268
    .line 1269
    .line 1270
    const v14, 0x3de147ae    # 0.11f

    .line 1271
    .line 1272
    .line 1273
    const v15, 0x3da3d70a    # 0.08f

    .line 1274
    .line 1275
    .line 1276
    const v16, 0x3e6147ae    # 0.22f

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1280
    .line 1281
    .line 1282
    const v17, 0x40a851ec    # 5.26f

    .line 1283
    .line 1284
    .line 1285
    const v18, 0x3fb47ae1    # 1.41f

    .line 1286
    .line 1287
    .line 1288
    const v13, 0x3f8a3d71    # 1.08f

    .line 1289
    .line 1290
    .line 1291
    const v14, 0x3fef5c29    # 1.87f

    .line 1292
    .line 1293
    .line 1294
    const v15, 0x4058f5c3    # 3.39f

    .line 1295
    .line 1296
    .line 1297
    const v16, 0x401f5c29    # 2.49f

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1301
    .line 1302
    .line 1303
    const v17, 0x40570a3d    # 3.36f

    .line 1304
    .line 1305
    .line 1306
    const v18, -0x3f1fae14    # -7.01f

    .line 1307
    .line 1308
    .line 1309
    const v13, 0x3ff70a3d    # 1.93f

    .line 1310
    .line 1311
    .line 1312
    const v14, -0x4071eb85    # -1.11f

    .line 1313
    .line 1314
    .line 1315
    const v15, 0x40270a3d    # 2.61f

    .line 1316
    .line 1317
    .line 1318
    const v16, -0x3f9f5c29    # -3.51f

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1322
    .line 1323
    .line 1324
    const v17, -0x40c7ae14    # -0.72f

    .line 1325
    .line 1326
    .line 1327
    const v18, -0x406a3d71    # -1.17f

    .line 1328
    .line 1329
    .line 1330
    const v13, 0x3de147ae    # 0.11f

    .line 1331
    .line 1332
    .line 1333
    const v14, -0x40fae148    # -0.52f

    .line 1334
    .line 1335
    .line 1336
    const v15, -0x41a8f5c3    # -0.21f

    .line 1337
    .line 1338
    .line 1339
    const v16, -0x407ae148    # -1.04f

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1343
    .line 1344
    .line 1345
    const/4 v0, 0x0

    .line 1346
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1347
    .line 1348
    .line 1349
    const v17, 0x4141999a    # 12.1f

    .line 1350
    .line 1351
    .line 1352
    const v18, 0x4170a3d7    # 15.04f

    .line 1353
    .line 1354
    .line 1355
    const v13, 0x414c7ae1    # 12.78f

    .line 1356
    .line 1357
    .line 1358
    const v14, 0x41623d71    # 14.14f

    .line 1359
    .line 1360
    .line 1361
    const v15, 0x4143851f    # 12.22f

    .line 1362
    .line 1363
    .line 1364
    const v16, 0x4167ae14    # 14.48f

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v2

    .line 1377
    const/16 v16, 0x3800

    .line 1378
    .line 1379
    const/16 v17, 0x0

    .line 1380
    .line 1381
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1382
    .line 1383
    const/4 v7, 0x0

    .line 1384
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1385
    .line 1386
    const/4 v13, 0x0

    .line 1387
    const/4 v14, 0x0

    .line 1388
    const/4 v15, 0x0

    .line 1389
    const-string v4, ""

    .line 1390
    .line 1391
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v0

    .line 1395
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v0

    .line 1399
    sput-object v0, Landroidx/compose/material/icons/rounded/Diversity2Kt;->_diversity2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1400
    .line 1401
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1402
    .line 1403
    .line 1404
    return-object v0
.end method

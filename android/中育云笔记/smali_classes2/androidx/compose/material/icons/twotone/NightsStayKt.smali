.class public final Landroidx/compose/material/icons/twotone/NightsStayKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNightsStay(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/NightsStayKt;->_nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.NightsStay"

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
    const v4, 0x4101999a    # 8.1f

    .line 71
    .line 72
    .line 73
    const v6, 0x41626666    # 14.15f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41300000    # 11.0f

    .line 80
    .line 81
    const/high16 v26, 0x41900000    # 18.0f

    .line 82
    .line 83
    const v21, 0x411c51ec    # 9.77f

    .line 84
    .line 85
    .line 86
    const v22, 0x416a147b    # 14.63f

    .line 87
    .line 88
    .line 89
    const/high16 v23, 0x41300000    # 11.0f

    .line 90
    .line 91
    const v24, 0x41815c29    # 16.17f

    .line 92
    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, -0x410a3d71    # -0.48f

    .line 100
    .line 101
    .line 102
    const v26, 0x3fef5c29    # 1.87f

    .line 103
    .line 104
    .line 105
    const/16 v21, 0x0

    .line 106
    .line 107
    const v22, 0x3f2e147b    # 0.68f

    .line 108
    .line 109
    .line 110
    const v23, -0x41bd70a4    # -0.19f

    .line 111
    .line 112
    .line 113
    const v24, 0x3fa7ae14    # 1.31f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v25, 0x3fbd70a4    # 1.48f

    .line 120
    .line 121
    .line 122
    const v26, 0x3e0f5c29    # 0.14f

    .line 123
    .line 124
    .line 125
    const v21, 0x3ef5c28f    # 0.48f

    .line 126
    .line 127
    .line 128
    const v22, 0x3db851ec    # 0.09f

    .line 129
    .line 130
    .line 131
    const v23, 0x3f7851ec    # 0.97f

    .line 132
    .line 133
    .line 134
    const v24, 0x3e0f5c29    # 0.14f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v25, 0x408428f6    # 4.13f

    .line 141
    .line 142
    .line 143
    const v26, -0x406ccccd    # -1.15f

    .line 144
    .line 145
    .line 146
    const v21, 0x3fbd70a4    # 1.48f

    .line 147
    .line 148
    .line 149
    const/16 v22, 0x0

    .line 150
    .line 151
    const v23, 0x4039999a    # 2.9f

    .line 152
    .line 153
    .line 154
    const v24, -0x412e147b    # -0.41f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v25, -0x3f266666    # -6.8f

    .line 161
    .line 162
    .line 163
    const v26, -0x3f447ae1    # -5.86f

    .line 164
    .line 165
    .line 166
    const v21, -0x3fd851ec    # -2.62f

    .line 167
    .line 168
    .line 169
    const v22, -0x40947ae1    # -0.92f

    .line 170
    .line 171
    .line 172
    const v23, -0x3f58a3d7    # -5.23f

    .line 173
    .line 174
    .line 175
    const v24, -0x3fcb851f    # -2.82f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, 0x4104a3d7    # 8.29f

    .line 182
    .line 183
    .line 184
    const v26, 0x409ccccd    # 4.9f

    .line 185
    .line 186
    .line 187
    const v21, 0x40f7ae14    # 7.74f

    .line 188
    .line 189
    .line 190
    const v22, 0x411f0a3d    # 9.94f

    .line 191
    .line 192
    .line 193
    const v23, 0x40f8f5c3    # 7.78f

    .line 194
    .line 195
    .line 196
    const v24, 0x40e2e148    # 7.09f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v25, -0x3f766666    # -4.3f

    .line 203
    .line 204
    .line 205
    const v26, 0x40e33333    # 7.1f

    .line 206
    .line 207
    .line 208
    const v21, -0x3fdb851f    # -2.57f

    .line 209
    .line 210
    .line 211
    const v22, 0x3faa3d71    # 1.33f

    .line 212
    .line 213
    .line 214
    const v23, -0x3f766666    # -4.3f

    .line 215
    .line 216
    .line 217
    const v24, 0x408051ec    # 4.01f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/16 v25, 0x0

    .line 224
    .line 225
    const/16 v26, 0x0

    .line 226
    .line 227
    const/16 v21, 0x0

    .line 228
    .line 229
    const/16 v22, 0x0

    .line 230
    .line 231
    const/16 v23, 0x0

    .line 232
    .line 233
    const/16 v24, 0x0

    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v25, 0x3ca3d70a    # 0.02f

    .line 239
    .line 240
    .line 241
    const v21, 0x3c23d70a    # 0.01f

    .line 242
    .line 243
    .line 244
    const v23, 0x3c23d70a    # 0.01f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v25, 0x4101999a    # 8.1f

    .line 251
    .line 252
    .line 253
    const v26, 0x41626666    # 14.15f

    .line 254
    .line 255
    .line 256
    const v21, 0x40b51eb8    # 5.66f

    .line 257
    .line 258
    .line 259
    const/high16 v22, 0x41400000    # 12.0f

    .line 260
    .line 261
    const v23, 0x40e5c28f    # 7.18f

    .line 262
    .line 263
    .line 264
    const v24, 0x414d47ae    # 12.83f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const/16 v16, 0x3800

    .line 278
    .line 279
    const/16 v17, 0x0

    .line 280
    .line 281
    const v6, 0x3e99999a    # 0.3f

    .line 282
    .line 283
    .line 284
    const v8, 0x3e99999a    # 0.3f

    .line 285
    .line 286
    .line 287
    const/4 v7, 0x0

    .line 288
    const/high16 v9, 0x3f800000    # 1.0f

    .line 289
    .line 290
    const/high16 v12, 0x3f800000    # 1.0f

    .line 291
    .line 292
    const/4 v13, 0x0

    .line 293
    const/4 v14, 0x0

    .line 294
    const/4 v15, 0x0

    .line 295
    const-string v4, ""

    .line 296
    .line 297
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 298
    .line 299
    .line 300
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 305
    .line 306
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 307
    .line 308
    .line 309
    move-result-wide v6

    .line 310
    const/4 v2, 0x0

    .line 311
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 315
    .line 316
    .line 317
    move-result v10

    .line 318
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const v4, 0x419e3d71    # 19.78f

    .line 328
    .line 329
    .line 330
    const v6, 0x418c147b    # 17.51f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v25, -0x3ef51eb8    # -8.68f

    .line 337
    .line 338
    .line 339
    const v26, -0x3f523d71    # -5.43f

    .line 340
    .line 341
    .line 342
    const v21, -0x3fe1eb85    # -2.47f

    .line 343
    .line 344
    .line 345
    const/16 v22, 0x0

    .line 346
    .line 347
    const v23, -0x3f2dc28f    # -6.57f

    .line 348
    .line 349
    .line 350
    const v24, -0x4055c28f    # -1.33f

    .line 351
    .line 352
    .line 353
    move-object/from16 v20, v2

    .line 354
    .line 355
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v25, 0x413a147b    # 11.63f

    .line 359
    .line 360
    .line 361
    const v26, 0x4000a3d7    # 2.01f

    .line 362
    .line 363
    .line 364
    const v21, 0x410c51ec    # 8.77f

    .line 365
    .line 366
    .line 367
    const v22, 0x40f23d71    # 7.57f

    .line 368
    .line 369
    .line 370
    const v23, 0x4129999a    # 10.6f

    .line 371
    .line 372
    .line 373
    const v24, 0x40666666    # 3.6f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v25, 0x3ffd70a4    # 1.98f

    .line 380
    .line 381
    .line 382
    const/high16 v26, 0x41400000    # 12.0f

    .line 383
    .line 384
    const v21, 0x40c8a3d7    # 6.27f

    .line 385
    .line 386
    .line 387
    const v22, 0x400ccccd    # 2.2f

    .line 388
    .line 389
    .line 390
    const v23, 0x3ffd70a4    # 1.98f

    .line 391
    .line 392
    .line 393
    const v24, 0x40d2e148    # 6.59f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v25, 0x3ca3d70a    # 0.02f

    .line 400
    .line 401
    .line 402
    const v26, 0x3ed70a3d    # 0.42f

    .line 403
    .line 404
    .line 405
    const/16 v21, 0x0

    .line 406
    .line 407
    const v22, 0x3e0f5c29    # 0.14f

    .line 408
    .line 409
    .line 410
    const v23, 0x3ca3d70a    # 0.02f

    .line 411
    .line 412
    .line 413
    const v24, 0x3e8f5c29    # 0.28f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v25, 0x407eb852    # 3.98f

    .line 420
    .line 421
    .line 422
    const/high16 v26, 0x41400000    # 12.0f

    .line 423
    .line 424
    const v21, 0x40270a3d    # 2.61f

    .line 425
    .line 426
    .line 427
    const v22, 0x41428f5c    # 12.16f

    .line 428
    .line 429
    .line 430
    const v23, 0x4051eb85    # 3.28f

    .line 431
    .line 432
    .line 433
    const/high16 v24, 0x41400000    # 12.0f

    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/16 v25, 0x0

    .line 439
    .line 440
    const/16 v26, 0x0

    .line 441
    .line 442
    const/16 v21, 0x0

    .line 443
    .line 444
    const/16 v22, 0x0

    .line 445
    .line 446
    const/16 v23, 0x0

    .line 447
    .line 448
    const/16 v24, 0x0

    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v25, 0x4089999a    # 4.3f

    .line 454
    .line 455
    .line 456
    const v26, -0x3f1ccccd    # -7.1f

    .line 457
    .line 458
    .line 459
    const v22, -0x3fba3d71    # -3.09f

    .line 460
    .line 461
    .line 462
    const v23, 0x3fdd70a4    # 1.73f

    .line 463
    .line 464
    .line 465
    const v24, -0x3f475c29    # -5.77f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v25, 0x41151eb8    # 9.32f

    .line 472
    .line 473
    .line 474
    const/high16 v26, 0x41500000    # 13.0f

    .line 475
    .line 476
    const v21, 0x40f8f5c3    # 7.78f

    .line 477
    .line 478
    .line 479
    const v22, 0x40e2e148    # 7.09f

    .line 480
    .line 481
    .line 482
    const v23, 0x40f7ae14    # 7.74f

    .line 483
    .line 484
    .line 485
    const v24, 0x411f0a3d    # 9.94f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v25, 0x40d9999a    # 6.8f

    .line 492
    .line 493
    .line 494
    const v26, 0x40bb851f    # 5.86f

    .line 495
    .line 496
    .line 497
    const v21, 0x3fc8f5c3    # 1.57f

    .line 498
    .line 499
    .line 500
    const v22, 0x40428f5c    # 3.04f

    .line 501
    .line 502
    .line 503
    const v23, 0x4085c28f    # 4.18f

    .line 504
    .line 505
    .line 506
    const v24, 0x409e6666    # 4.95f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v25, -0x3f7bd70a    # -4.13f

    .line 513
    .line 514
    .line 515
    const v26, 0x3f933333    # 1.15f

    .line 516
    .line 517
    .line 518
    const v21, -0x40628f5c    # -1.23f

    .line 519
    .line 520
    .line 521
    const v22, 0x3f3d70a4    # 0.74f

    .line 522
    .line 523
    .line 524
    const v23, -0x3fd66666    # -2.65f

    .line 525
    .line 526
    .line 527
    const v24, 0x3f933333    # 1.15f

    .line 528
    .line 529
    .line 530
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v25, -0x40428f5c    # -1.48f

    .line 534
    .line 535
    .line 536
    const v26, -0x41f0a3d7    # -0.14f

    .line 537
    .line 538
    .line 539
    const/high16 v21, -0x41000000    # -0.5f

    .line 540
    .line 541
    const/16 v22, 0x0

    .line 542
    .line 543
    const/high16 v23, -0x40800000    # -1.0f

    .line 544
    .line 545
    const v24, -0x42b33333    # -0.05f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v25, -0x402e147b    # -1.64f

    .line 552
    .line 553
    .line 554
    const v26, 0x3fd1eb85    # 1.64f

    .line 555
    .line 556
    .line 557
    const v21, -0x41428f5c    # -0.37f

    .line 558
    .line 559
    .line 560
    const v22, 0x3f333333    # 0.7f

    .line 561
    .line 562
    .line 563
    const v23, -0x408f5c29    # -0.94f

    .line 564
    .line 565
    .line 566
    const v24, 0x3fa28f5c    # 1.27f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v25, 0x40470a3d    # 3.11f

    .line 573
    .line 574
    .line 575
    const/high16 v26, 0x3f000000    # 0.5f

    .line 576
    .line 577
    const v21, 0x3f7ae148    # 0.98f

    .line 578
    .line 579
    .line 580
    const v22, 0x3ea3d70a    # 0.32f

    .line 581
    .line 582
    .line 583
    const v23, 0x4001eb85    # 2.03f

    .line 584
    .line 585
    .line 586
    const/high16 v24, 0x3f000000    # 0.5f

    .line 587
    .line 588
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v25, 0x4105eb85    # 8.37f

    .line 592
    .line 593
    .line 594
    const v26, -0x3f6f5c29    # -4.52f

    .line 595
    .line 596
    .line 597
    const/high16 v21, 0x40600000    # 3.5f

    .line 598
    .line 599
    const/16 v22, 0x0

    .line 600
    .line 601
    const v23, 0x40d28f5c    # 6.58f

    .line 602
    .line 603
    .line 604
    const v24, -0x4019999a    # -1.8f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v25, 0x419e3d71    # 19.78f

    .line 611
    .line 612
    .line 613
    const v26, 0x418c147b    # 17.51f

    .line 614
    .line 615
    .line 616
    const v21, 0x41a170a4    # 20.18f

    .line 617
    .line 618
    .line 619
    const/high16 v22, 0x418c0000    # 17.5f

    .line 620
    .line 621
    const v23, 0x419fd70a    # 19.98f

    .line 622
    .line 623
    .line 624
    const v24, 0x418c147b    # 17.51f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    const/high16 v6, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/high16 v8, 0x3f800000    # 1.0f

    .line 640
    .line 641
    const/4 v7, 0x0

    .line 642
    const-string v4, ""

    .line 643
    .line 644
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 645
    .line 646
    .line 647
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 648
    .line 649
    .line 650
    move-result v3

    .line 651
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 652
    .line 653
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 654
    .line 655
    .line 656
    move-result-wide v6

    .line 657
    const/4 v0, 0x0

    .line 658
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 659
    .line 660
    .line 661
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 662
    .line 663
    .line 664
    move-result v10

    .line 665
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 666
    .line 667
    .line 668
    move-result v11

    .line 669
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 672
    .line 673
    .line 674
    const/high16 v0, 0x40e00000    # 7.0f

    .line 675
    .line 676
    const/high16 v2, 0x41800000    # 16.0f

    .line 677
    .line 678
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v0, -0x41c7ae14    # -0.18f

    .line 682
    .line 683
    .line 684
    const/4 v2, 0x0

    .line 685
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v17, 0x40800000    # 4.0f

    .line 689
    .line 690
    const/high16 v18, 0x41600000    # 14.0f

    .line 691
    .line 692
    const v13, 0x40cccccd    # 6.4f

    .line 693
    .line 694
    .line 695
    const v14, 0x416d70a4    # 14.84f

    .line 696
    .line 697
    .line 698
    const v15, 0x40a9999a    # 5.3f

    .line 699
    .line 700
    .line 701
    const/high16 v16, 0x41600000    # 14.0f

    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 707
    .line 708
    const/high16 v18, 0x40400000    # 3.0f

    .line 709
    .line 710
    const v13, -0x402b851f    # -1.66f

    .line 711
    .line 712
    .line 713
    const/4 v14, 0x0

    .line 714
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 715
    .line 716
    const v16, 0x3fab851f    # 1.34f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v0, 0x3fab851f    # 1.34f

    .line 723
    .line 724
    .line 725
    const/high16 v2, 0x40400000    # 3.0f

    .line 726
    .line 727
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v17, 0x40400000    # 3.0f

    .line 731
    .line 732
    const/16 v18, 0x0

    .line 733
    .line 734
    const v13, 0x3f1eb852    # 0.62f

    .line 735
    .line 736
    .line 737
    const v15, 0x401f5c29    # 2.49f

    .line 738
    .line 739
    .line 740
    const/16 v16, 0x0

    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v17, 0x40000000    # 2.0f

    .line 746
    .line 747
    const/high16 v18, -0x40000000    # -2.0f

    .line 748
    .line 749
    const v13, 0x3f8ccccd    # 1.1f

    .line 750
    .line 751
    .line 752
    const/high16 v15, 0x40000000    # 2.0f

    .line 753
    .line 754
    const v16, -0x4099999a    # -0.9f

    .line 755
    .line 756
    .line 757
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v17, 0x40e00000    # 7.0f

    .line 761
    .line 762
    const/high16 v18, 0x41800000    # 16.0f

    .line 763
    .line 764
    const/high16 v13, 0x41100000    # 9.0f

    .line 765
    .line 766
    const v14, 0x41873333    # 16.9f

    .line 767
    .line 768
    .line 769
    const v15, 0x4101999a    # 8.1f

    .line 770
    .line 771
    .line 772
    const/high16 v16, 0x41800000    # 16.0f

    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    const/16 v16, 0x3800

    .line 785
    .line 786
    const/16 v17, 0x0

    .line 787
    .line 788
    const/high16 v6, 0x3f800000    # 1.0f

    .line 789
    .line 790
    const/4 v7, 0x0

    .line 791
    const/high16 v12, 0x3f800000    # 1.0f

    .line 792
    .line 793
    const/4 v13, 0x0

    .line 794
    const/4 v14, 0x0

    .line 795
    const/4 v15, 0x0

    .line 796
    const-string v4, ""

    .line 797
    .line 798
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    sput-object v0, Landroidx/compose/material/icons/twotone/NightsStayKt;->_nightsStay:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 807
    .line 808
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    return-object v0
.end method

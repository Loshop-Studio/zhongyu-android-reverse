.class public final Landroidx/compose/material/icons/twotone/SpaKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _spa:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpa(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SpaKt;->_spa:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Spa"

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
    const v4, 0x4108cccd    # 8.55f

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
    const v25, -0x3f9e147b    # -3.53f

    .line 79
    .line 80
    .line 81
    const v26, -0x4031eb85    # -1.61f

    .line 82
    .line 83
    .line 84
    const v21, -0x40770a3d    # -1.07f

    .line 85
    .line 86
    .line 87
    const v22, -0x40ca3d71    # -0.71f

    .line 88
    .line 89
    .line 90
    const/high16 v23, -0x3ff00000    # -2.25f

    .line 91
    .line 92
    const v24, -0x405d70a4    # -1.27f

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
    const v25, 0x4061eb85    # 3.53f

    .line 101
    .line 102
    .line 103
    const v26, 0x3fce147b    # 1.61f

    .line 104
    .line 105
    .line 106
    const v21, 0x3fa3d70a    # 1.28f

    .line 107
    .line 108
    .line 109
    const v22, 0x3eae147b    # 0.34f

    .line 110
    .line 111
    .line 112
    const v23, 0x401d70a4    # 2.46f

    .line 113
    .line 114
    .line 115
    const v24, 0x3f666666    # 0.9f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, 0x4197d70a    # 18.98f

    .line 125
    .line 126
    .line 127
    const v6, 0x41263d71    # 10.39f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, -0x3f9b851f    # -3.57f

    .line 134
    .line 135
    .line 136
    const v26, 0x3fd1eb85    # 1.64f

    .line 137
    .line 138
    .line 139
    const v21, -0x405ae148    # -1.29f

    .line 140
    .line 141
    .line 142
    const v23, -0x3fe0a3d7    # -2.49f

    .line 143
    .line 144
    .line 145
    const v24, 0x3f68f5c3    # 0.91f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v25, 0x40647ae1    # 3.57f

    .line 152
    .line 153
    .line 154
    const v26, -0x402e147b    # -1.64f

    .line 155
    .line 156
    .line 157
    const v21, 0x3f8a3d71    # 1.08f

    .line 158
    .line 159
    .line 160
    const v22, -0x40c51eb8    # -0.73f

    .line 161
    .line 162
    .line 163
    const v23, 0x4011eb85    # 2.28f

    .line 164
    .line 165
    .line 166
    const v24, -0x4059999a    # -1.3f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const/16 v16, 0x3800

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const/high16 v6, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/high16 v8, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/4 v7, 0x0

    .line 188
    const/high16 v9, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/high16 v12, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/4 v13, 0x0

    .line 193
    const/4 v14, 0x0

    .line 194
    const/4 v15, 0x0

    .line 195
    const-string v4, ""

    .line 196
    .line 197
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 198
    .line 199
    .line 200
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 205
    .line 206
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 207
    .line 208
    .line 209
    move-result-wide v6

    .line 210
    const/4 v2, 0x0

    .line 211
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    const v4, 0x410f0a3d    # 8.94f

    .line 228
    .line 229
    .line 230
    const/high16 v6, 0x41440000    # 12.25f

    .line 231
    .line 232
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/16 v25, 0x0

    .line 236
    .line 237
    const/16 v26, 0x0

    .line 238
    .line 239
    const/16 v21, 0x0

    .line 240
    .line 241
    const v22, -0x43dc28f6    # -0.01f

    .line 242
    .line 243
    .line 244
    const/16 v23, 0x0

    .line 245
    .line 246
    const v24, -0x43dc28f6    # -0.01f

    .line 247
    .line 248
    .line 249
    move-object/from16 v20, v2

    .line 250
    .line 251
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v25, -0x41333333    # -0.4f

    .line 255
    .line 256
    .line 257
    const v26, -0x417ae148    # -0.26f

    .line 258
    .line 259
    .line 260
    const v21, -0x41fae148    # -0.13f

    .line 261
    .line 262
    .line 263
    const v22, -0x4247ae14    # -0.09f

    .line 264
    .line 265
    .line 266
    const v23, -0x4175c28f    # -0.27f

    .line 267
    .line 268
    .line 269
    const v24, -0x41d1eb85    # -0.17f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, 0x3ecccccd    # 0.4f

    .line 276
    .line 277
    .line 278
    const v26, 0x3e851eb8    # 0.26f

    .line 279
    .line 280
    .line 281
    const v21, 0x3e051eb8    # 0.13f

    .line 282
    .line 283
    .line 284
    const v22, 0x3dcccccd    # 0.1f

    .line 285
    .line 286
    .line 287
    const v23, 0x3e8a3d71    # 0.27f

    .line 288
    .line 289
    .line 290
    const v24, 0x3e2e147b    # 0.17f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v4, 0x4155999a    # 13.35f

    .line 300
    .line 301
    .line 302
    const v6, 0x410947ae    # 8.58f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v25, -0x4059999a    # -1.3f

    .line 309
    .line 310
    .line 311
    const v26, -0x3fa7ae14    # -3.38f

    .line 312
    .line 313
    .line 314
    const v21, -0x419eb852    # -0.22f

    .line 315
    .line 316
    .line 317
    const v22, -0x40651eb8    # -1.21f

    .line 318
    .line 319
    .line 320
    const v23, -0x40d70a3d    # -0.66f

    .line 321
    .line 322
    .line 323
    const v24, -0x3fe9999a    # -2.35f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v25, -0x4050a3d7    # -1.37f

    .line 330
    .line 331
    .line 332
    const v26, 0x4058f5c3    # 3.39f

    .line 333
    .line 334
    .line 335
    const v21, -0x40d70a3d    # -0.66f

    .line 336
    .line 337
    .line 338
    const v22, 0x3f851eb8    # 1.04f

    .line 339
    .line 340
    .line 341
    const v23, -0x4070a3d7    # -1.12f

    .line 342
    .line 343
    .line 344
    const v24, 0x400c28f6    # 2.19f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v25, 0x3faa3d71    # 1.33f

    .line 351
    .line 352
    .line 353
    const v26, 0x3f7851ec    # 0.97f

    .line 354
    .line 355
    .line 356
    const v21, 0x3eeb851f    # 0.46f

    .line 357
    .line 358
    .line 359
    const v22, 0x3e99999a    # 0.3f

    .line 360
    .line 361
    .line 362
    const v23, 0x3f666666    # 0.9f

    .line 363
    .line 364
    .line 365
    const v24, 0x3f1eb852    # 0.62f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v25, 0x3fab851f    # 1.34f

    .line 372
    .line 373
    .line 374
    const v26, -0x40851eb8    # -0.98f

    .line 375
    .line 376
    .line 377
    const v21, 0x3ed70a3d    # 0.42f

    .line 378
    .line 379
    .line 380
    const v22, -0x414ccccd    # -0.35f

    .line 381
    .line 382
    .line 383
    const v23, 0x3f5eb852    # 0.87f

    .line 384
    .line 385
    .line 386
    const v24, -0x40d1eb85    # -0.68f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v4, 0x418451ec    # 16.54f

    .line 396
    .line 397
    .line 398
    const v6, 0x415a8f5c    # 13.66f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v4, 0x3ca3d70a    # 0.02f

    .line 405
    .line 406
    .line 407
    const v6, 0x3c23d70a    # 0.01f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v25, -0x4175c28f    # -0.27f

    .line 414
    .line 415
    .line 416
    const v26, 0x3e2e147b    # 0.17f

    .line 417
    .line 418
    .line 419
    const v21, -0x4247ae14    # -0.09f

    .line 420
    .line 421
    .line 422
    const v22, 0x3d75c28f    # 0.06f

    .line 423
    .line 424
    .line 425
    const v23, -0x41c7ae14    # -0.18f

    .line 426
    .line 427
    .line 428
    const v24, 0x3df5c28f    # 0.12f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v4, 0x3d4ccccd    # 0.05f

    .line 435
    .line 436
    .line 437
    const v6, -0x4270a3d7    # -0.07f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v25, -0x3fde147b    # -2.53f

    .line 444
    .line 445
    .line 446
    const v26, 0x402a3d71    # 2.66f

    .line 447
    .line 448
    .line 449
    const v21, -0x40851eb8    # -0.98f

    .line 450
    .line 451
    .line 452
    const v22, 0x3f35c28f    # 0.71f

    .line 453
    .line 454
    .line 455
    const v23, -0x40147ae1    # -1.84f

    .line 456
    .line 457
    .line 458
    const v24, 0x3fce147b    # 1.61f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v4, 0x4198cccd    # 19.1f

    .line 465
    .line 466
    .line 467
    const/high16 v6, 0x41400000    # 12.0f

    .line 468
    .line 469
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, -0x402a3d71    # -1.67f

    .line 473
    .line 474
    .line 475
    const v6, -0x3fdccccd    # -2.55f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v25, -0x3fdf5c29    # -2.51f

    .line 482
    .line 483
    .line 484
    const v26, -0x3fd66666    # -2.65f

    .line 485
    .line 486
    .line 487
    const v21, -0x40d1eb85    # -0.68f

    .line 488
    .line 489
    .line 490
    const v22, -0x407c28f6    # -1.03f

    .line 491
    .line 492
    .line 493
    const v23, -0x403d70a4    # -1.52f

    .line 494
    .line 495
    .line 496
    const v24, -0x400a3d71    # -1.92f

    .line 497
    .line 498
    .line 499
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v4, -0x42dc28f6    # -0.04f

    .line 503
    .line 504
    .line 505
    const v6, -0x4270a3d7    # -0.07f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v25, -0x413851ec    # -0.39f

    .line 512
    .line 513
    .line 514
    const/high16 v26, -0x41800000    # -0.25f

    .line 515
    .line 516
    const v21, -0x41fae148    # -0.13f

    .line 517
    .line 518
    .line 519
    const v22, -0x425c28f6    # -0.08f

    .line 520
    .line 521
    .line 522
    const v23, -0x417ae148    # -0.26f

    .line 523
    .line 524
    .line 525
    const v24, -0x41dc28f6    # -0.16f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v4, -0x43dc28f6    # -0.01f

    .line 532
    .line 533
    .line 534
    const v6, 0x3c23d70a    # 0.01f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v25, -0x3fb851ec    # -3.12f

    .line 541
    .line 542
    .line 543
    const v26, -0x4055c28f    # -1.33f

    .line 544
    .line 545
    .line 546
    const v21, -0x408a3d71    # -0.96f

    .line 547
    .line 548
    .line 549
    const v22, -0x40deb852    # -0.63f

    .line 550
    .line 551
    .line 552
    const v23, -0x3fff5c29    # -2.01f

    .line 553
    .line 554
    .line 555
    const v24, -0x40770a3d    # -1.07f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v25, 0x40ce6666    # 6.45f

    .line 562
    .line 563
    .line 564
    const v26, 0x40eb3333    # 7.35f

    .line 565
    .line 566
    .line 567
    const/high16 v21, 0x3f400000    # 0.75f

    .line 568
    .line 569
    const v22, 0x40570a3d    # 3.36f

    .line 570
    .line 571
    .line 572
    const v23, 0x404a3d71    # 3.16f

    .line 573
    .line 574
    .line 575
    const v24, 0x40c570a4    # 6.17f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v25, 0x3fa3d70a    # 1.28f

    .line 582
    .line 583
    .line 584
    const v26, 0x3eb851ec    # 0.36f

    .line 585
    .line 586
    .line 587
    const v21, 0x3ed70a3d    # 0.42f

    .line 588
    .line 589
    .line 590
    const v22, 0x3e19999a    # 0.15f

    .line 591
    .line 592
    .line 593
    const v23, 0x3f570a3d    # 0.84f

    .line 594
    .line 595
    .line 596
    const v24, 0x3e8a3d71    # 0.27f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v25, 0x3faa3d71    # 1.33f

    .line 603
    .line 604
    .line 605
    const v26, -0x41428f5c    # -0.37f

    .line 606
    .line 607
    .line 608
    const v21, 0x3ee66666    # 0.45f

    .line 609
    .line 610
    .line 611
    const v22, -0x4247ae14    # -0.09f

    .line 612
    .line 613
    .line 614
    const v23, 0x3f63d70a    # 0.89f

    .line 615
    .line 616
    .line 617
    const v24, -0x41a8f5c3    # -0.21f

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v25, 0x40cdc28f    # 6.43f

    .line 624
    .line 625
    .line 626
    const v26, -0x3f151eb8    # -7.34f

    .line 627
    .line 628
    .line 629
    const v21, 0x405147ae    # 3.27f

    .line 630
    .line 631
    .line 632
    const v22, -0x406a3d71    # -1.17f

    .line 633
    .line 634
    .line 635
    const v23, 0x40b570a4    # 5.67f

    .line 636
    .line 637
    .line 638
    const v24, -0x3f8147ae    # -3.98f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v25, -0x3fb33333    # -3.2f

    .line 645
    .line 646
    .line 647
    const v26, 0x3fb1eb85    # 1.39f

    .line 648
    .line 649
    .line 650
    const v21, -0x406e147b    # -1.14f

    .line 651
    .line 652
    .line 653
    const v22, 0x3e851eb8    # 0.26f

    .line 654
    .line 655
    .line 656
    const v23, -0x3ff147ae    # -2.23f

    .line 657
    .line 658
    .line 659
    const v24, 0x3f3ae148    # 0.73f

    .line 660
    .line 661
    .line 662
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v4, 0x41447ae1    # 12.28f

    .line 669
    .line 670
    .line 671
    const v6, 0x410fd70a    # 8.99f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    const v6, 0x3e99999a    # 0.3f

    .line 682
    .line 683
    .line 684
    const v8, 0x3e99999a    # 0.3f

    .line 685
    .line 686
    .line 687
    const/4 v7, 0x0

    .line 688
    const-string v4, ""

    .line 689
    .line 690
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 691
    .line 692
    .line 693
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 694
    .line 695
    .line 696
    move-result v3

    .line 697
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 698
    .line 699
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 700
    .line 701
    .line 702
    move-result-wide v6

    .line 703
    const/4 v2, 0x0

    .line 704
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 708
    .line 709
    .line 710
    move-result v10

    .line 711
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 712
    .line 713
    .line 714
    move-result v11

    .line 715
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 718
    .line 719
    .line 720
    const v4, 0x41773333    # 15.45f

    .line 721
    .line 722
    .line 723
    const/high16 v6, 0x41400000    # 12.0f

    .line 724
    .line 725
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const v25, -0x3fbc28f6    # -3.06f

    .line 729
    .line 730
    .line 731
    const v26, -0x3fb33333    # -3.2f

    .line 732
    .line 733
    .line 734
    const v21, -0x40ae147b    # -0.82f

    .line 735
    .line 736
    .line 737
    const/high16 v22, -0x40600000    # -1.25f

    .line 738
    .line 739
    const v23, -0x4011eb85    # -1.86f

    .line 740
    .line 741
    .line 742
    const v24, -0x3fea3d71    # -2.34f

    .line 743
    .line 744
    .line 745
    move-object/from16 v20, v2

    .line 746
    .line 747
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const v25, -0x41333333    # -0.4f

    .line 751
    .line 752
    .line 753
    const v26, -0x417ae148    # -0.26f

    .line 754
    .line 755
    .line 756
    const v21, -0x41fae148    # -0.13f

    .line 757
    .line 758
    .line 759
    const v22, -0x4247ae14    # -0.09f

    .line 760
    .line 761
    .line 762
    const v23, -0x4175c28f    # -0.27f

    .line 763
    .line 764
    .line 765
    const v24, -0x41dc28f6    # -0.16f

    .line 766
    .line 767
    .line 768
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v25, 0x3ec7ae14    # 0.39f

    .line 772
    .line 773
    .line 774
    const/high16 v26, 0x3e800000    # 0.25f

    .line 775
    .line 776
    const v21, 0x3e051eb8    # 0.13f

    .line 777
    .line 778
    .line 779
    const v22, 0x3db851ec    # 0.09f

    .line 780
    .line 781
    .line 782
    const v23, 0x3e8a3d71    # 0.27f

    .line 783
    .line 784
    .line 785
    const v24, 0x3e2e147b    # 0.17f

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/high16 v25, 0x40000000    # 2.0f

    .line 792
    .line 793
    const/high16 v26, 0x41200000    # 10.0f

    .line 794
    .line 795
    const v21, 0x40df5c29    # 6.98f

    .line 796
    .line 797
    .line 798
    const v22, 0x412d47ae    # 10.83f

    .line 799
    .line 800
    .line 801
    const v23, 0x4092e148    # 4.59f

    .line 802
    .line 803
    .line 804
    const/high16 v24, 0x41200000    # 10.0f

    .line 805
    .line 806
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v25, 0x41007ae1    # 8.03f

    .line 810
    .line 811
    .line 812
    const v26, 0x4137d70a    # 11.49f

    .line 813
    .line 814
    .line 815
    const/16 v21, 0x0

    .line 816
    .line 817
    const v22, 0x40aa3d71    # 5.32f

    .line 818
    .line 819
    .line 820
    const v23, 0x40570a3d    # 3.36f

    .line 821
    .line 822
    .line 823
    const v24, 0x411d1eb8    # 9.82f

    .line 824
    .line 825
    .line 826
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    const v25, 0x3ffc28f6    # 1.97f

    .line 830
    .line 831
    .line 832
    const v26, 0x3f028f5c    # 0.51f

    .line 833
    .line 834
    .line 835
    const v21, 0x3f2147ae    # 0.63f

    .line 836
    .line 837
    .line 838
    const v22, 0x3e6b851f    # 0.23f

    .line 839
    .line 840
    .line 841
    const v23, 0x3fa51eb8    # 1.29f

    .line 842
    .line 843
    .line 844
    const v24, 0x3ecccccd    # 0.4f

    .line 845
    .line 846
    .line 847
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const v26, -0x40fd70a4    # -0.51f

    .line 851
    .line 852
    .line 853
    const v21, 0x3f2e147b    # 0.68f

    .line 854
    .line 855
    .line 856
    const v22, -0x420a3d71    # -0.12f

    .line 857
    .line 858
    .line 859
    const v23, 0x3faa3d71    # 1.33f

    .line 860
    .line 861
    .line 862
    const v24, -0x416b851f    # -0.29f

    .line 863
    .line 864
    .line 865
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 866
    .line 867
    .line 868
    const/high16 v25, 0x41b00000    # 22.0f

    .line 869
    .line 870
    const/high16 v26, 0x41200000    # 10.0f

    .line 871
    .line 872
    const v21, 0x41951eb8    # 18.64f

    .line 873
    .line 874
    .line 875
    const v22, 0x419e8f5c    # 19.82f

    .line 876
    .line 877
    .line 878
    const/high16 v23, 0x41b00000    # 22.0f

    .line 879
    .line 880
    const v24, 0x41751eb8    # 15.32f

    .line 881
    .line 882
    .line 883
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const/high16 v25, -0x3ee00000    # -10.0f

    .line 887
    .line 888
    const v26, 0x40ae6666    # 5.45f

    .line 889
    .line 890
    .line 891
    const v21, -0x3f7a3d71    # -4.18f

    .line 892
    .line 893
    .line 894
    const/16 v22, 0x0

    .line 895
    .line 896
    const v23, -0x3f04cccd    # -7.85f

    .line 897
    .line 898
    .line 899
    const v24, 0x400ae148    # 2.17f

    .line 900
    .line 901
    .line 902
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    const v4, 0x41551eb8    # 13.32f

    .line 909
    .line 910
    .line 911
    const v6, 0x419ccccd    # 19.6f

    .line 912
    .line 913
    .line 914
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v25, -0x4055c28f    # -1.33f

    .line 918
    .line 919
    .line 920
    const v26, 0x3ebd70a4    # 0.37f

    .line 921
    .line 922
    .line 923
    const v21, -0x411eb852    # -0.44f

    .line 924
    .line 925
    .line 926
    const v22, 0x3e19999a    # 0.15f

    .line 927
    .line 928
    .line 929
    const v23, -0x409eb852    # -0.88f

    .line 930
    .line 931
    .line 932
    const v24, 0x3e8a3d71    # 0.27f

    .line 933
    .line 934
    .line 935
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const v25, -0x405c28f6    # -1.28f

    .line 939
    .line 940
    .line 941
    const v26, -0x4147ae14    # -0.36f

    .line 942
    .line 943
    .line 944
    const v22, -0x4247ae14    # -0.09f

    .line 945
    .line 946
    .line 947
    const v23, -0x40a147ae    # -0.87f

    .line 948
    .line 949
    .line 950
    const v24, -0x41a8f5c3    # -0.21f

    .line 951
    .line 952
    .line 953
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v25, -0x3f31999a    # -6.45f

    .line 957
    .line 958
    .line 959
    const v26, -0x3f14cccd    # -7.35f

    .line 960
    .line 961
    .line 962
    const v21, -0x3fad70a4    # -3.29f

    .line 963
    .line 964
    .line 965
    const v22, -0x4068f5c3    # -1.18f

    .line 966
    .line 967
    .line 968
    const v23, -0x3f49999a    # -5.7f

    .line 969
    .line 970
    .line 971
    const v24, -0x3f80a3d7    # -3.99f

    .line 972
    .line 973
    .line 974
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 975
    .line 976
    .line 977
    const v25, 0x4047ae14    # 3.12f

    .line 978
    .line 979
    .line 980
    const v26, 0x3faa3d71    # 1.33f

    .line 981
    .line 982
    .line 983
    const v21, 0x3f8ccccd    # 1.1f

    .line 984
    .line 985
    .line 986
    const v22, 0x3e851eb8    # 0.26f

    .line 987
    .line 988
    .line 989
    const v23, 0x4009999a    # 2.15f

    .line 990
    .line 991
    .line 992
    const v24, 0x3f35c28f    # 0.71f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const v4, -0x435c28f6    # -0.02f

    .line 999
    .line 1000
    .line 1001
    const v6, 0x3c23d70a    # 0.01f

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1005
    .line 1006
    .line 1007
    const v25, 0x3ec7ae14    # 0.39f

    .line 1008
    .line 1009
    .line 1010
    const/high16 v26, 0x3e800000    # 0.25f

    .line 1011
    .line 1012
    const v21, 0x3e051eb8    # 0.13f

    .line 1013
    .line 1014
    .line 1015
    const v22, 0x3db851ec    # 0.09f

    .line 1016
    .line 1017
    .line 1018
    const v23, 0x3e851eb8    # 0.26f

    .line 1019
    .line 1020
    .line 1021
    const v24, 0x3e3851ec    # 0.18f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v4, 0x3d23d70a    # 0.04f

    .line 1028
    .line 1029
    .line 1030
    const v6, 0x3d8f5c29    # 0.07f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const v25, 0x4020a3d7    # 2.51f

    .line 1037
    .line 1038
    .line 1039
    const v26, 0x4029999a    # 2.65f

    .line 1040
    .line 1041
    .line 1042
    const v21, 0x3f7d70a4    # 0.99f

    .line 1043
    .line 1044
    .line 1045
    const v22, 0x3f3851ec    # 0.72f

    .line 1046
    .line 1047
    .line 1048
    const v23, 0x3feb851f    # 1.84f

    .line 1049
    .line 1050
    .line 1051
    const v24, 0x3fce147b    # 1.61f

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1055
    .line 1056
    .line 1057
    const v4, 0x4198cccd    # 19.1f

    .line 1058
    .line 1059
    .line 1060
    const/high16 v6, 0x41400000    # 12.0f

    .line 1061
    .line 1062
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    const v4, 0x3fd5c28f    # 1.67f

    .line 1066
    .line 1067
    .line 1068
    const v6, -0x3fdccccd    # -2.55f

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1072
    .line 1073
    .line 1074
    const v25, 0x4021eb85    # 2.53f

    .line 1075
    .line 1076
    .line 1077
    const v26, -0x3fd5c28f    # -2.66f

    .line 1078
    .line 1079
    .line 1080
    const v21, 0x3f30a3d7    # 0.69f

    .line 1081
    .line 1082
    .line 1083
    const v22, -0x4079999a    # -1.05f

    .line 1084
    .line 1085
    .line 1086
    const v23, 0x3fc66666    # 1.55f

    .line 1087
    .line 1088
    .line 1089
    const v24, -0x40066666    # -1.95f

    .line 1090
    .line 1091
    .line 1092
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1093
    .line 1094
    .line 1095
    const v4, -0x42b33333    # -0.05f

    .line 1096
    .line 1097
    .line 1098
    const v6, 0x3d8f5c29    # 0.07f

    .line 1099
    .line 1100
    .line 1101
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1102
    .line 1103
    .line 1104
    const v25, 0x3e8a3d71    # 0.27f

    .line 1105
    .line 1106
    .line 1107
    const v26, -0x41d1eb85    # -0.17f

    .line 1108
    .line 1109
    .line 1110
    const v21, 0x3db851ec    # 0.09f

    .line 1111
    .line 1112
    .line 1113
    const v22, -0x42b33333    # -0.05f

    .line 1114
    .line 1115
    .line 1116
    const v23, 0x3e3851ec    # 0.18f

    .line 1117
    .line 1118
    .line 1119
    const v24, -0x421eb852    # -0.11f

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    const v4, -0x435c28f6    # -0.02f

    .line 1126
    .line 1127
    .line 1128
    const v6, -0x43dc28f6    # -0.01f

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1132
    .line 1133
    .line 1134
    const v25, 0x404d70a4    # 3.21f

    .line 1135
    .line 1136
    .line 1137
    const v26, -0x404ccccd    # -1.4f

    .line 1138
    .line 1139
    .line 1140
    const v21, 0x3f7ae148    # 0.98f

    .line 1141
    .line 1142
    .line 1143
    const v22, -0x40d9999a    # -0.65f

    .line 1144
    .line 1145
    .line 1146
    const v23, 0x40047ae1    # 2.07f

    .line 1147
    .line 1148
    .line 1149
    const v24, -0x406f5c29    # -1.13f

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1153
    .line 1154
    .line 1155
    const v25, -0x3f328f5c    # -6.42f

    .line 1156
    .line 1157
    .line 1158
    const v26, 0x40eb3333    # 7.35f

    .line 1159
    .line 1160
    .line 1161
    const/high16 v21, -0x40c00000    # -0.75f

    .line 1162
    .line 1163
    const v22, 0x4057ae14    # 3.37f

    .line 1164
    .line 1165
    .line 1166
    const v23, -0x3fb66666    # -3.15f

    .line 1167
    .line 1168
    .line 1169
    const v24, 0x40c5c28f    # 6.18f

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1176
    .line 1177
    .line 1178
    const v4, 0x4177d70a    # 15.49f

    .line 1179
    .line 1180
    .line 1181
    const v6, 0x411a147b    # 9.63f

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1185
    .line 1186
    .line 1187
    const v25, -0x3fa47ae1    # -3.43f

    .line 1188
    .line 1189
    .line 1190
    const v26, -0x3f0bd70a    # -7.63f

    .line 1191
    .line 1192
    .line 1193
    const v21, -0x41c7ae14    # -0.18f

    .line 1194
    .line 1195
    .line 1196
    const v22, -0x3fcd70a4    # -2.79f

    .line 1197
    .line 1198
    .line 1199
    const v23, -0x405851ec    # -1.31f

    .line 1200
    .line 1201
    .line 1202
    const v24, -0x3f4fae14    # -5.51f

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1206
    .line 1207
    .line 1208
    const v25, -0x3f9ccccd    # -3.55f

    .line 1209
    .line 1210
    .line 1211
    const v26, 0x40f428f6    # 7.63f

    .line 1212
    .line 1213
    .line 1214
    const v21, -0x3ff70a3d    # -2.14f

    .line 1215
    .line 1216
    .line 1217
    const v22, 0x4008f5c3    # 2.14f

    .line 1218
    .line 1219
    .line 1220
    const v23, -0x3fab851f    # -3.32f

    .line 1221
    .line 1222
    .line 1223
    const v24, 0x409b851f    # 4.86f

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1227
    .line 1228
    .line 1229
    const v25, 0x405f5c29    # 3.49f

    .line 1230
    .line 1231
    .line 1232
    const v26, 0x402851ec    # 2.63f

    .line 1233
    .line 1234
    .line 1235
    const v21, 0x3fa3d70a    # 1.28f

    .line 1236
    .line 1237
    .line 1238
    const v22, 0x3f2e147b    # 0.68f

    .line 1239
    .line 1240
    .line 1241
    const v23, 0x401d70a4    # 2.46f

    .line 1242
    .line 1243
    .line 1244
    const v24, 0x3fc7ae14    # 1.56f

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1248
    .line 1249
    .line 1250
    const v26, -0x3fd7ae14    # -2.63f

    .line 1251
    .line 1252
    .line 1253
    const v21, 0x3f83d70a    # 1.03f

    .line 1254
    .line 1255
    .line 1256
    const v22, -0x407851ec    # -1.06f

    .line 1257
    .line 1258
    .line 1259
    const v23, 0x400d70a4    # 2.21f

    .line 1260
    .line 1261
    .line 1262
    const v24, -0x4007ae14    # -1.94f

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1266
    .line 1267
    .line 1268
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1269
    .line 1270
    .line 1271
    const v4, 0x4140cccd    # 12.05f

    .line 1272
    .line 1273
    .line 1274
    const v6, 0x40a6147b    # 5.19f

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1278
    .line 1279
    .line 1280
    const v25, 0x3fa66666    # 1.3f

    .line 1281
    .line 1282
    .line 1283
    const v26, 0x405851ec    # 3.38f

    .line 1284
    .line 1285
    .line 1286
    const v21, 0x3f2147ae    # 0.63f

    .line 1287
    .line 1288
    .line 1289
    const v22, 0x3f83d70a    # 1.03f

    .line 1290
    .line 1291
    .line 1292
    const v23, 0x3f88f5c3    # 1.07f

    .line 1293
    .line 1294
    .line 1295
    const v24, 0x400b851f    # 2.18f

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1299
    .line 1300
    .line 1301
    const v25, -0x40547ae1    # -1.34f

    .line 1302
    .line 1303
    .line 1304
    const v26, 0x3f7ae148    # 0.98f

    .line 1305
    .line 1306
    .line 1307
    const v21, -0x410f5c29    # -0.47f

    .line 1308
    .line 1309
    .line 1310
    const v22, 0x3e99999a    # 0.3f

    .line 1311
    .line 1312
    .line 1313
    const v23, -0x40970a3d    # -0.91f

    .line 1314
    .line 1315
    .line 1316
    const v24, 0x3f2147ae    # 0.63f

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1320
    .line 1321
    .line 1322
    const v25, -0x4055c28f    # -1.33f

    .line 1323
    .line 1324
    .line 1325
    const v26, -0x4087ae14    # -0.97f

    .line 1326
    .line 1327
    .line 1328
    const v21, -0x4128f5c3    # -0.42f

    .line 1329
    .line 1330
    .line 1331
    const v22, -0x4151eb85    # -0.34f

    .line 1332
    .line 1333
    .line 1334
    const v23, -0x40a147ae    # -0.87f

    .line 1335
    .line 1336
    .line 1337
    const v24, -0x40d47ae1    # -0.67f

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1341
    .line 1342
    .line 1343
    const v25, 0x3faf5c29    # 1.37f

    .line 1344
    .line 1345
    .line 1346
    const v26, -0x3fa70a3d    # -3.39f

    .line 1347
    .line 1348
    .line 1349
    const/high16 v21, 0x3e800000    # 0.25f

    .line 1350
    .line 1351
    const v22, -0x40666666    # -1.2f

    .line 1352
    .line 1353
    .line 1354
    const v23, 0x3f35c28f    # 0.71f

    .line 1355
    .line 1356
    .line 1357
    const v24, -0x3fe9999a    # -2.35f

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v2

    .line 1370
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1371
    .line 1372
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1373
    .line 1374
    const/4 v7, 0x0

    .line 1375
    const-string v4, ""

    .line 1376
    .line 1377
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1378
    .line 1379
    .line 1380
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1381
    .line 1382
    .line 1383
    move-result v3

    .line 1384
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1385
    .line 1386
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1387
    .line 1388
    .line 1389
    move-result-wide v6

    .line 1390
    const/4 v0, 0x0

    .line 1391
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1395
    .line 1396
    .line 1397
    move-result v10

    .line 1398
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1399
    .line 1400
    .line 1401
    move-result v11

    .line 1402
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1403
    .line 1404
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1405
    .line 1406
    .line 1407
    const v0, 0x41447ae1    # 12.28f

    .line 1408
    .line 1409
    .line 1410
    const v2, 0x410fd70a    # 8.99f

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1414
    .line 1415
    .line 1416
    const v17, -0x42b33333    # -0.05f

    .line 1417
    .line 1418
    .line 1419
    const v18, -0x42dc28f6    # -0.04f

    .line 1420
    .line 1421
    .line 1422
    const v13, -0x435c28f6    # -0.02f

    .line 1423
    .line 1424
    .line 1425
    const v14, -0x43dc28f6    # -0.01f

    .line 1426
    .line 1427
    .line 1428
    const v15, -0x42dc28f6    # -0.04f

    .line 1429
    .line 1430
    .line 1431
    const v16, -0x430a3d71    # -0.03f

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1435
    .line 1436
    .line 1437
    const v17, 0x3c23d70a    # 0.01f

    .line 1438
    .line 1439
    .line 1440
    const v18, 0x3c23d70a    # 0.01f

    .line 1441
    .line 1442
    .line 1443
    const/4 v13, 0x0

    .line 1444
    const/4 v14, 0x0

    .line 1445
    const v15, 0x3c23d70a    # 0.01f

    .line 1446
    .line 1447
    .line 1448
    const/16 v16, 0x0

    .line 1449
    .line 1450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1451
    .line 1452
    .line 1453
    const v17, 0x3d23d70a    # 0.04f

    .line 1454
    .line 1455
    .line 1456
    const v18, 0x3cf5c28f    # 0.03f

    .line 1457
    .line 1458
    .line 1459
    const v13, 0x3c23d70a    # 0.01f

    .line 1460
    .line 1461
    .line 1462
    const v14, 0x3c23d70a    # 0.01f

    .line 1463
    .line 1464
    .line 1465
    const v15, 0x3ca3d70a    # 0.02f

    .line 1466
    .line 1467
    .line 1468
    const v16, 0x3ca3d70a    # 0.02f

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1475
    .line 1476
    .line 1477
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    const/16 v16, 0x3800

    .line 1482
    .line 1483
    const/16 v17, 0x0

    .line 1484
    .line 1485
    const v6, 0x3e99999a    # 0.3f

    .line 1486
    .line 1487
    .line 1488
    const v8, 0x3e99999a    # 0.3f

    .line 1489
    .line 1490
    .line 1491
    const/4 v7, 0x0

    .line 1492
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1493
    .line 1494
    const/4 v13, 0x0

    .line 1495
    const/4 v14, 0x0

    .line 1496
    const/4 v15, 0x0

    .line 1497
    const-string v4, ""

    .line 1498
    .line 1499
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v0

    .line 1503
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    sput-object v0, Landroidx/compose/material/icons/twotone/SpaKt;->_spa:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1508
    .line 1509
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1510
    .line 1511
    .line 1512
    return-object v0
.end method

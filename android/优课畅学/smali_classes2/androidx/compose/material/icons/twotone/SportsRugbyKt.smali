.class public final Landroidx/compose/material/icons/twotone/SportsRugbyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsRugby:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsRugby(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SportsRugbyKt;->_sportsRugby:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SportsRugby"

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
    const v4, 0x40b6b852    # 5.71f

    .line 71
    .line 72
    .line 73
    const v6, 0x419251ec    # 18.29f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3f09999a    # -7.7f

    .line 80
    .line 81
    .line 82
    const v26, 0x409c28f6    # 4.88f

    .line 83
    .line 84
    .line 85
    const v21, -0x4008f5c3    # -1.93f

    .line 86
    .line 87
    .line 88
    const v22, 0x3f23d70a    # 0.64f

    .line 89
    .line 90
    .line 91
    const v23, -0x3f5f5c29    # -5.02f

    .line 92
    .line 93
    .line 94
    const v24, 0x400c28f6    # 2.19f

    .line 95
    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v25, -0x3f6428f6    # -4.87f

    .line 103
    .line 104
    .line 105
    const v26, 0x40f66666    # 7.7f

    .line 106
    .line 107
    .line 108
    const v21, -0x3fd28f5c    # -2.71f

    .line 109
    .line 110
    .line 111
    const v22, 0x402d70a4    # 2.71f

    .line 112
    .line 113
    .line 114
    const v23, -0x3f7851ec    # -4.24f

    .line 115
    .line 116
    .line 117
    const v24, 0x40b9eb85    # 5.81f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, 0x40f66666    # 7.7f

    .line 124
    .line 125
    .line 126
    const v26, -0x3f6428f6    # -4.87f

    .line 127
    .line 128
    .line 129
    const v21, 0x3ff70a3d    # 1.93f

    .line 130
    .line 131
    .line 132
    const v22, -0x40dc28f6    # -0.64f

    .line 133
    .line 134
    .line 135
    const v23, 0x40a0f5c3    # 5.03f

    .line 136
    .line 137
    .line 138
    const v24, -0x3ff33333    # -2.2f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x419251ec    # 18.29f

    .line 145
    .line 146
    .line 147
    const v26, 0x40b6b852    # 5.71f

    .line 148
    .line 149
    .line 150
    const v21, 0x41810a3d    # 16.13f

    .line 151
    .line 152
    .line 153
    const v22, 0x412b3333    # 10.7f

    .line 154
    .line 155
    .line 156
    const v23, 0x418d47ae    # 17.66f

    .line 157
    .line 158
    .line 159
    const v24, 0x40f33333    # 7.6f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const/16 v16, 0x3800

    .line 173
    .line 174
    const/16 v17, 0x0

    .line 175
    .line 176
    const v6, 0x3e99999a    # 0.3f

    .line 177
    .line 178
    .line 179
    const v8, 0x3e99999a    # 0.3f

    .line 180
    .line 181
    .line 182
    const/4 v7, 0x0

    .line 183
    const/high16 v9, 0x3f800000    # 1.0f

    .line 184
    .line 185
    const/high16 v12, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v14, 0x0

    .line 189
    const/4 v15, 0x0

    .line 190
    const-string v4, ""

    .line 191
    .line 192
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 193
    .line 194
    .line 195
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    const/4 v2, 0x0

    .line 206
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    const v4, 0x4112b852    # 9.17f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v25, 0x40d3851f    # 6.61f

    .line 229
    .line 230
    .line 231
    const v26, -0x3f6c7ae1    # -4.61f

    .line 232
    .line 233
    .line 234
    const v21, 0x4009999a    # 2.15f

    .line 235
    .line 236
    .line 237
    const v22, -0x3ff66666    # -2.15f

    .line 238
    .line 239
    .line 240
    const v23, 0x4091eb85    # 4.56f

    .line 241
    .line 242
    .line 243
    const v24, -0x3f951eb8    # -3.67f

    .line 244
    .line 245
    .line 246
    move-object/from16 v20, v2

    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v25, 0x40f851ec    # 7.76f

    .line 252
    .line 253
    .line 254
    const v26, 0x40f851ec    # 7.76f

    .line 255
    .line 256
    .line 257
    const v21, 0x4161999a    # 14.1f

    .line 258
    .line 259
    .line 260
    const v22, 0x40947ae1    # 4.64f

    .line 261
    .line 262
    .line 263
    const v23, 0x41266666    # 10.4f

    .line 264
    .line 265
    .line 266
    const v24, 0x40a3d70a    # 5.12f

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v25, -0x3fb33333    # -3.2f

    .line 273
    .line 274
    .line 275
    const v26, 0x4100a3d7    # 8.04f

    .line 276
    .line 277
    .line 278
    const v21, -0x3feb851f    # -2.32f

    .line 279
    .line 280
    .line 281
    const v22, 0x40147ae1    # 2.32f

    .line 282
    .line 283
    .line 284
    const v23, -0x3fb9999a    # -3.1f

    .line 285
    .line 286
    .line 287
    const v24, 0x40b28f5c    # 5.58f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v25, 0x4112b852    # 9.17f

    .line 294
    .line 295
    .line 296
    const v26, 0x4112b852    # 9.17f

    .line 297
    .line 298
    .line 299
    const/high16 v21, 0x40b00000    # 5.5f

    .line 300
    .line 301
    const/high16 v22, 0x415c0000    # 13.75f

    .line 302
    .line 303
    const v23, 0x40e051ec    # 7.01f

    .line 304
    .line 305
    .line 306
    const v24, 0x413547ae    # 11.33f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const v6, 0x3e99999a    # 0.3f

    .line 320
    .line 321
    .line 322
    const/4 v7, 0x0

    .line 323
    const-string v4, ""

    .line 324
    .line 325
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 326
    .line 327
    .line 328
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 333
    .line 334
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 335
    .line 336
    .line 337
    move-result-wide v6

    .line 338
    const/4 v2, 0x0

    .line 339
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 343
    .line 344
    .line 345
    move-result v10

    .line 346
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 347
    .line 348
    .line 349
    move-result v11

    .line 350
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 353
    .line 354
    .line 355
    const v4, 0x416d47ae    # 14.83f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v25, -0x3f2c7ae1    # -6.61f

    .line 362
    .line 363
    .line 364
    const v26, 0x4093851f    # 4.61f

    .line 365
    .line 366
    .line 367
    const v21, -0x3ff66666    # -2.15f

    .line 368
    .line 369
    .line 370
    const v22, 0x4009999a    # 2.15f

    .line 371
    .line 372
    .line 373
    const v23, -0x3f6e147b    # -4.56f

    .line 374
    .line 375
    .line 376
    const v24, 0x406ae148    # 3.67f

    .line 377
    .line 378
    .line 379
    move-object/from16 v20, v2

    .line 380
    .line 381
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const v25, 0x41007ae1    # 8.03f

    .line 385
    .line 386
    .line 387
    const v26, -0x3fb3d70a    # -3.19f

    .line 388
    .line 389
    .line 390
    const v21, 0x3fd70a3d    # 1.68f

    .line 391
    .line 392
    .line 393
    const v22, -0x425c28f6    # -0.08f

    .line 394
    .line 395
    .line 396
    const v23, 0x40ac7ae1    # 5.39f

    .line 397
    .line 398
    .line 399
    const v24, -0x40f33333    # -0.55f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v25, 0x404ccccd    # 3.2f

    .line 406
    .line 407
    .line 408
    const v26, -0x3eff5c29    # -8.04f

    .line 409
    .line 410
    .line 411
    const v21, 0x40147ae1    # 2.32f

    .line 412
    .line 413
    .line 414
    const v22, -0x3feb851f    # -2.32f

    .line 415
    .line 416
    .line 417
    const v23, 0x40466666    # 3.1f

    .line 418
    .line 419
    .line 420
    const v24, -0x3f4d70a4    # -5.58f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v25, 0x416d47ae    # 14.83f

    .line 427
    .line 428
    .line 429
    const v26, 0x416d47ae    # 14.83f

    .line 430
    .line 431
    .line 432
    const/high16 v21, 0x41940000    # 18.5f

    .line 433
    .line 434
    const/high16 v22, 0x41240000    # 10.25f

    .line 435
    .line 436
    const v23, 0x4187eb85    # 16.99f

    .line 437
    .line 438
    .line 439
    const v24, 0x414ab852    # 12.67f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    const v6, 0x3e99999a    # 0.3f

    .line 453
    .line 454
    .line 455
    const/4 v7, 0x0

    .line 456
    const-string v4, ""

    .line 457
    .line 458
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 459
    .line 460
    .line 461
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 462
    .line 463
    .line 464
    move-result v3

    .line 465
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 466
    .line 467
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 468
    .line 469
    .line 470
    move-result-wide v6

    .line 471
    const/4 v0, 0x0

    .line 472
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 476
    .line 477
    .line 478
    move-result v10

    .line 479
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 480
    .line 481
    .line 482
    move-result v11

    .line 483
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 486
    .line 487
    .line 488
    const v0, 0x41a3eb85    # 20.49f

    .line 489
    .line 490
    .line 491
    const v2, 0x4060a3d7    # 3.51f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v17, -0x3f7ae148    # -4.16f

    .line 498
    .line 499
    .line 500
    const v18, -0x4087ae14    # -0.97f

    .line 501
    .line 502
    .line 503
    const v13, -0x40f0a3d7    # -0.56f

    .line 504
    .line 505
    .line 506
    const v14, -0x40f0a3d7    # -0.56f

    .line 507
    .line 508
    .line 509
    const v15, -0x3ff66666    # -2.15f

    .line 510
    .line 511
    .line 512
    const v16, -0x4087ae14    # -0.97f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, -0x3ee051ec    # -9.98f

    .line 519
    .line 520
    .line 521
    const v18, 0x40728f5c    # 3.79f

    .line 522
    .line 523
    .line 524
    const v13, -0x3fbae148    # -3.08f

    .line 525
    .line 526
    .line 527
    const/4 v14, 0x0

    .line 528
    const v15, -0x3f1b3333    # -7.15f

    .line 529
    .line 530
    .line 531
    const v16, 0x3f75c28f    # 0.96f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, 0x4060a3d7    # 3.51f

    .line 538
    .line 539
    .line 540
    const v18, 0x41a3eb85    # 20.49f

    .line 541
    .line 542
    .line 543
    const v13, 0x3fd47ae1    # 1.66f

    .line 544
    .line 545
    .line 546
    const v14, 0x41307ae1    # 11.03f

    .line 547
    .line 548
    .line 549
    const v15, 0x40066666    # 2.1f

    .line 550
    .line 551
    .line 552
    const v16, 0x41988f5c    # 19.07f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v17, 0x40851eb8    # 4.16f

    .line 559
    .line 560
    .line 561
    const v18, 0x3f7851ec    # 0.97f

    .line 562
    .line 563
    .line 564
    const v13, 0x3f0f5c29    # 0.56f

    .line 565
    .line 566
    .line 567
    const v14, 0x3f0f5c29    # 0.56f

    .line 568
    .line 569
    .line 570
    const v15, 0x4009999a    # 2.15f

    .line 571
    .line 572
    .line 573
    const v16, 0x3f7851ec    # 0.97f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v17, 0x411fae14    # 9.98f

    .line 580
    .line 581
    .line 582
    const v18, -0x3f8d70a4    # -3.79f

    .line 583
    .line 584
    .line 585
    const v13, 0x40451eb8    # 3.08f

    .line 586
    .line 587
    .line 588
    const/4 v14, 0x0

    .line 589
    const v15, 0x40e4cccd    # 7.15f

    .line 590
    .line 591
    .line 592
    const v16, -0x408a3d71    # -0.96f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, 0x41a3eb85    # 20.49f

    .line 599
    .line 600
    .line 601
    const v18, 0x4060a3d7    # 3.51f

    .line 602
    .line 603
    .line 604
    const v13, 0x41b2b852    # 22.34f

    .line 605
    .line 606
    .line 607
    const v14, 0x414f851f    # 12.97f

    .line 608
    .line 609
    .line 610
    const v15, 0x41af3333    # 21.9f

    .line 611
    .line 612
    .line 613
    const v16, 0x409dc28f    # 4.93f

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 620
    .line 621
    .line 622
    const v0, 0x40b6b852    # 5.71f

    .line 623
    .line 624
    .line 625
    const v2, 0x419251ec    # 18.29f

    .line 626
    .line 627
    .line 628
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v17, 0x409bd70a    # 4.87f

    .line 632
    .line 633
    .line 634
    const v18, -0x3f09999a    # -7.7f

    .line 635
    .line 636
    .line 637
    const v13, 0x3f2147ae    # 0.63f

    .line 638
    .line 639
    .line 640
    const v14, -0x400e147b    # -1.89f

    .line 641
    .line 642
    .line 643
    const v15, 0x400a3d71    # 2.16f

    .line 644
    .line 645
    .line 646
    const v16, -0x3f6051ec    # -4.99f

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const v17, 0x40f66666    # 7.7f

    .line 653
    .line 654
    .line 655
    const v18, -0x3f63d70a    # -4.88f

    .line 656
    .line 657
    .line 658
    const v13, 0x402b851f    # 2.68f

    .line 659
    .line 660
    .line 661
    const v14, -0x3fd47ae1    # -2.68f

    .line 662
    .line 663
    .line 664
    const v15, 0x40b8f5c3    # 5.78f

    .line 665
    .line 666
    .line 667
    const v16, -0x3f78a3d7    # -4.23f

    .line 668
    .line 669
    .line 670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const v17, -0x3f63d70a    # -4.88f

    .line 674
    .line 675
    .line 676
    const v18, 0x40f66666    # 7.7f

    .line 677
    .line 678
    .line 679
    const v13, -0x40deb852    # -0.63f

    .line 680
    .line 681
    .line 682
    const v14, 0x3ff1eb85    # 1.89f

    .line 683
    .line 684
    .line 685
    const v15, -0x3ff5c28f    # -2.16f

    .line 686
    .line 687
    .line 688
    const v16, 0x409fae14    # 4.99f

    .line 689
    .line 690
    .line 691
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v17, 0x40b6b852    # 5.71f

    .line 695
    .line 696
    .line 697
    const v18, 0x419251ec    # 18.29f

    .line 698
    .line 699
    .line 700
    const v13, 0x412bd70a    # 10.74f

    .line 701
    .line 702
    .line 703
    const v14, 0x4180b852    # 16.09f

    .line 704
    .line 705
    .line 706
    const v15, 0x40f47ae1    # 7.64f

    .line 707
    .line 708
    .line 709
    const v16, 0x418d1eb8    # 17.64f

    .line 710
    .line 711
    .line 712
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const v0, 0x40f851ec    # 7.76f

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x41007ae1    # 8.03f

    .line 725
    .line 726
    .line 727
    const v18, -0x3fb3d70a    # -3.19f

    .line 728
    .line 729
    .line 730
    const v13, 0x4028f5c3    # 2.64f

    .line 731
    .line 732
    .line 733
    const v14, -0x3fd70a3d    # -2.64f

    .line 734
    .line 735
    .line 736
    const v15, 0x40cae148    # 6.34f

    .line 737
    .line 738
    .line 739
    const v16, -0x3fb851ec    # -3.12f

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v17, -0x3f2c7ae1    # -6.61f

    .line 746
    .line 747
    .line 748
    const v18, 0x4093851f    # 4.61f

    .line 749
    .line 750
    .line 751
    const v13, -0x3ffccccd    # -2.05f

    .line 752
    .line 753
    .line 754
    const v14, 0x3f70a3d7    # 0.94f

    .line 755
    .line 756
    .line 757
    const v15, -0x3f7147ae    # -4.46f

    .line 758
    .line 759
    .line 760
    const v16, 0x401d70a4    # 2.46f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v17, -0x3f6c7ae1    # -4.61f

    .line 767
    .line 768
    .line 769
    const v18, 0x40d428f6    # 6.63f

    .line 770
    .line 771
    .line 772
    const v13, -0x3ff5c28f    # -2.16f

    .line 773
    .line 774
    .line 775
    const v14, 0x400a3d71    # 2.16f

    .line 776
    .line 777
    .line 778
    const v15, -0x3f951eb8    # -3.67f

    .line 779
    .line 780
    .line 781
    const v16, 0x40928f5c    # 4.58f

    .line 782
    .line 783
    .line 784
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v17, 0x40f851ec    # 7.76f

    .line 788
    .line 789
    .line 790
    const v18, 0x40f851ec    # 7.76f

    .line 791
    .line 792
    .line 793
    const v13, 0x40951eb8    # 4.66f

    .line 794
    .line 795
    .line 796
    const v14, 0x415547ae    # 13.33f

    .line 797
    .line 798
    .line 799
    const v15, 0x40ae147b    # 5.44f

    .line 800
    .line 801
    .line 802
    const v16, 0x41211eb8    # 10.07f

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v0, 0x4181eb85    # 16.24f

    .line 812
    .line 813
    .line 814
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v17, -0x3eff851f    # -8.03f

    .line 818
    .line 819
    .line 820
    const v18, 0x404c28f6    # 3.19f

    .line 821
    .line 822
    .line 823
    const v13, -0x3fd70a3d    # -2.64f

    .line 824
    .line 825
    .line 826
    const v14, 0x4028f5c3    # 2.64f

    .line 827
    .line 828
    .line 829
    const v15, -0x3f351eb8    # -6.34f

    .line 830
    .line 831
    .line 832
    const v16, 0x4047ae14    # 3.12f

    .line 833
    .line 834
    .line 835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 836
    .line 837
    .line 838
    const v17, 0x40d3851f    # 6.61f

    .line 839
    .line 840
    .line 841
    const v18, -0x3f6c7ae1    # -4.61f

    .line 842
    .line 843
    .line 844
    const v13, 0x40033333    # 2.05f

    .line 845
    .line 846
    .line 847
    const v14, -0x408f5c29    # -0.94f

    .line 848
    .line 849
    .line 850
    const v15, 0x408eb852    # 4.46f

    .line 851
    .line 852
    .line 853
    const v16, -0x3fe28f5c    # -2.46f

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v17, 0x4093d70a    # 4.62f

    .line 860
    .line 861
    .line 862
    const v18, -0x3f2bd70a    # -6.63f

    .line 863
    .line 864
    .line 865
    const v13, 0x400a3d71    # 2.16f

    .line 866
    .line 867
    .line 868
    const v14, -0x3ff5c28f    # -2.16f

    .line 869
    .line 870
    .line 871
    const v15, 0x406ae148    # 3.67f

    .line 872
    .line 873
    .line 874
    const v16, -0x3f6d70a4    # -4.58f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const v17, 0x4181eb85    # 16.24f

    .line 881
    .line 882
    .line 883
    const v18, 0x4181eb85    # 16.24f

    .line 884
    .line 885
    .line 886
    const v13, 0x419ab852    # 19.34f

    .line 887
    .line 888
    .line 889
    const v14, 0x412ab852    # 10.67f

    .line 890
    .line 891
    .line 892
    const v15, 0x41947ae1    # 18.56f

    .line 893
    .line 894
    .line 895
    const v16, 0x415ee148    # 13.93f

    .line 896
    .line 897
    .line 898
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    const/16 v16, 0x3800

    .line 909
    .line 910
    const/16 v17, 0x0

    .line 911
    .line 912
    const/high16 v6, 0x3f800000    # 1.0f

    .line 913
    .line 914
    const/high16 v8, 0x3f800000    # 1.0f

    .line 915
    .line 916
    const/4 v7, 0x0

    .line 917
    const/high16 v12, 0x3f800000    # 1.0f

    .line 918
    .line 919
    const/4 v13, 0x0

    .line 920
    const/4 v14, 0x0

    .line 921
    const/4 v15, 0x0

    .line 922
    const-string v4, ""

    .line 923
    .line 924
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    sput-object v0, Landroidx/compose/material/icons/twotone/SportsRugbyKt;->_sportsRugby:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 933
    .line 934
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    return-object v0
.end method

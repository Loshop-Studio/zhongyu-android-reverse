.class public final Landroidx/compose/material/icons/rounded/WifiProtectedSetupKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiProtectedSetup:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiProtectedSetup(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WifiProtectedSetupKt;->_wifiProtectedSetup:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WifiProtectedSetup"

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
    const v4, 0x4185999a    # 16.7f

    .line 71
    .line 72
    .line 73
    const v6, 0x40a9999a    # 5.3f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x4047ae14    # -1.44f

    .line 80
    .line 81
    .line 82
    const v6, 0x3fb851ec    # 1.44f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, -0x414ccccd    # -0.35f

    .line 89
    .line 90
    .line 91
    const v26, -0x40a66666    # -0.85f

    .line 92
    .line 93
    .line 94
    const v21, 0x3ea3d70a    # 0.32f

    .line 95
    .line 96
    .line 97
    const v22, -0x415c28f6    # -0.32f

    .line 98
    .line 99
    .line 100
    const v23, 0x3db851ec    # 0.09f

    .line 101
    .line 102
    .line 103
    const v24, -0x40a66666    # -0.85f

    .line 104
    .line 105
    .line 106
    move-object/from16 v20, v2

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v4, 0x41380000    # 11.5f

    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, -0x41000000    # -0.5f

    .line 117
    .line 118
    const/high16 v26, 0x3f000000    # 0.5f

    .line 119
    .line 120
    const v21, -0x4170a3d7    # -0.28f

    .line 121
    .line 122
    .line 123
    const/16 v22, 0x0

    .line 124
    .line 125
    const/high16 v23, -0x41000000    # -0.5f

    .line 126
    .line 127
    const v24, 0x3e6147ae    # 0.22f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x411ccccd    # 9.8f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, 0x3f59999a    # 0.85f

    .line 140
    .line 141
    .line 142
    const v26, 0x3eb33333    # 0.35f

    .line 143
    .line 144
    .line 145
    const/16 v21, 0x0

    .line 146
    .line 147
    const v22, 0x3ee66666    # 0.45f

    .line 148
    .line 149
    .line 150
    const v23, 0x3f0a3d71    # 0.54f

    .line 151
    .line 152
    .line 153
    const v24, 0x3f2b851f    # 0.67f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, 0x3fb9999a    # 1.45f

    .line 160
    .line 161
    .line 162
    const v6, -0x40466666    # -1.45f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v25, 0x40500000    # 3.25f

    .line 169
    .line 170
    const v26, 0x40cd70a4    # 6.42f

    .line 171
    .line 172
    .line 173
    const v21, 0x3ffc28f6    # 1.97f

    .line 174
    .line 175
    .line 176
    const v22, 0x3fbae148    # 1.46f

    .line 177
    .line 178
    .line 179
    const/high16 v23, 0x40500000    # 3.25f

    .line 180
    .line 181
    const v24, 0x4071eb85    # 3.78f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v25, -0x418a3d71    # -0.24f

    .line 188
    .line 189
    .line 190
    const v26, 0x3ff5c28f    # 1.92f

    .line 191
    .line 192
    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    const v22, 0x3f28f5c3    # 0.66f

    .line 196
    .line 197
    .line 198
    const v23, -0x425c28f6    # -0.08f

    .line 199
    .line 200
    .line 201
    const v24, 0x3fa7ae14    # 1.31f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, 0x3f570a3d    # 0.84f

    .line 208
    .line 209
    .line 210
    const v26, 0x3efae148    # 0.49f

    .line 211
    .line 212
    .line 213
    const v21, -0x420a3d71    # -0.12f

    .line 214
    .line 215
    .line 216
    const/high16 v22, 0x3f000000    # 0.5f

    .line 217
    .line 218
    const v23, 0x3ef5c28f    # 0.48f

    .line 219
    .line 220
    .line 221
    const v24, 0x3f5c28f6    # 0.86f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x4019999a    # 2.4f

    .line 228
    .line 229
    .line 230
    const v26, -0x3f42e148    # -5.91f

    .line 231
    .line 232
    .line 233
    const v21, 0x3fbd70a4    # 1.48f

    .line 234
    .line 235
    .line 236
    const v22, -0x403c28f6    # -1.53f

    .line 237
    .line 238
    .line 239
    const v23, 0x4019999a    # 2.4f

    .line 240
    .line 241
    .line 242
    const v24, -0x3f98f5c3    # -3.61f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v25, 0x4185999a    # 16.7f

    .line 249
    .line 250
    .line 251
    const v26, 0x40a9999a    # 5.3f

    .line 252
    .line 253
    .line 254
    const v21, 0x419c6666    # 19.55f

    .line 255
    .line 256
    .line 257
    const v22, 0x4111c28f    # 9.11f

    .line 258
    .line 259
    .line 260
    const v23, 0x4193851f    # 18.44f

    .line 261
    .line 262
    .line 263
    const v24, 0x40db851f    # 6.86f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    const/16 v16, 0x3800

    .line 277
    .line 278
    const/16 v17, 0x0

    .line 279
    .line 280
    const/high16 v6, 0x3f800000    # 1.0f

    .line 281
    .line 282
    const/high16 v8, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/4 v7, 0x0

    .line 285
    const/high16 v9, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const/high16 v12, 0x3f800000    # 1.0f

    .line 288
    .line 289
    const/4 v13, 0x0

    .line 290
    const/4 v14, 0x0

    .line 291
    const/4 v15, 0x0

    .line 292
    const-string v4, ""

    .line 293
    .line 294
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 295
    .line 296
    .line 297
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 302
    .line 303
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 304
    .line 305
    .line 306
    move-result-wide v6

    .line 307
    const/4 v0, 0x0

    .line 308
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 312
    .line 313
    .line 314
    move-result v10

    .line 315
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 316
    .line 317
    .line 318
    move-result v11

    .line 319
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    const v0, 0x41426666    # 12.15f

    .line 325
    .line 326
    .line 327
    const v2, 0x415dc28f    # 13.86f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, 0x412b3333    # 10.7f

    .line 334
    .line 335
    .line 336
    const v2, 0x4174cccd    # 15.3f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v17, -0x3fb00000    # -3.25f

    .line 343
    .line 344
    const v18, -0x3f328f5c    # -6.42f

    .line 345
    .line 346
    .line 347
    const v13, -0x4003d70a    # -1.97f

    .line 348
    .line 349
    .line 350
    const v14, -0x40451eb8    # -1.46f

    .line 351
    .line 352
    .line 353
    const/high16 v15, -0x3fb00000    # -3.25f

    .line 354
    .line 355
    const v16, -0x3f8e147b    # -3.78f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x3e75c28f    # 0.24f

    .line 362
    .line 363
    .line 364
    const v18, -0x400a3d71    # -1.92f

    .line 365
    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, -0x40d70a3d    # -0.66f

    .line 369
    .line 370
    .line 371
    const v15, 0x3da3d70a    # 0.08f

    .line 372
    .line 373
    .line 374
    const v16, -0x405851ec    # -1.31f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, -0x40a8f5c3    # -0.84f

    .line 381
    .line 382
    .line 383
    const v18, -0x41051eb8    # -0.49f

    .line 384
    .line 385
    .line 386
    const v13, 0x3df5c28f    # 0.12f

    .line 387
    .line 388
    .line 389
    const/high16 v14, -0x41000000    # -0.5f

    .line 390
    .line 391
    const v15, -0x410a3d71    # -0.48f

    .line 392
    .line 393
    .line 394
    const v16, -0x40a3d70a    # -0.86f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v17, -0x3fe66666    # -2.4f

    .line 401
    .line 402
    .line 403
    const v18, 0x40bd1eb8    # 5.91f

    .line 404
    .line 405
    .line 406
    const v13, -0x40428f5c    # -1.48f

    .line 407
    .line 408
    .line 409
    const v14, 0x3fc3d70a    # 1.53f

    .line 410
    .line 411
    .line 412
    const v15, -0x3fe66666    # -2.4f

    .line 413
    .line 414
    .line 415
    const v16, 0x40670a3d    # 3.61f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x4035c28f    # 2.84f

    .line 422
    .line 423
    .line 424
    const v18, 0x40ca8f5c    # 6.33f

    .line 425
    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const v14, 0x402147ae    # 2.52f

    .line 429
    .line 430
    .line 431
    const v15, 0x3f8ccccd    # 1.1f

    .line 432
    .line 433
    .line 434
    const v16, 0x4098a3d7    # 4.77f

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v0, -0x4047ae14    # -1.44f

    .line 441
    .line 442
    .line 443
    const v2, 0x3fb851ec    # 1.44f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, 0x3eb33333    # 0.35f

    .line 450
    .line 451
    .line 452
    const v18, 0x3f59999a    # 0.85f

    .line 453
    .line 454
    .line 455
    const v13, -0x415c28f6    # -0.32f

    .line 456
    .line 457
    .line 458
    const v14, 0x3ea3d70a    # 0.32f

    .line 459
    .line 460
    .line 461
    const v15, -0x4247ae14    # -0.09f

    .line 462
    .line 463
    .line 464
    const v16, 0x3f59999a    # 0.85f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x40c947ae    # 6.29f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x3f000000    # 0.5f

    .line 477
    .line 478
    const/high16 v18, -0x41000000    # -0.5f

    .line 479
    .line 480
    const v13, 0x3e8f5c29    # 0.28f

    .line 481
    .line 482
    .line 483
    const/4 v14, 0x0

    .line 484
    const/high16 v15, 0x3f000000    # 0.5f

    .line 485
    .line 486
    const v16, -0x419eb852    # -0.22f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, -0x3f36b852    # -6.29f

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, 0x41426666    # 12.15f

    .line 499
    .line 500
    .line 501
    const v18, 0x415dc28f    # 13.86f

    .line 502
    .line 503
    .line 504
    const/high16 v13, 0x41500000    # 13.0f

    .line 505
    .line 506
    const v14, 0x415c51ec    # 13.77f

    .line 507
    .line 508
    .line 509
    const v15, 0x41475c29    # 12.46f

    .line 510
    .line 511
    .line 512
    const v16, 0x4158a3d7    # 13.54f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    const/16 v16, 0x3800

    .line 526
    .line 527
    const/16 v17, 0x0

    .line 528
    .line 529
    const/high16 v6, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/4 v7, 0x0

    .line 532
    const/high16 v12, 0x3f800000    # 1.0f

    .line 533
    .line 534
    const/4 v13, 0x0

    .line 535
    const/4 v14, 0x0

    .line 536
    const/4 v15, 0x0

    .line 537
    const-string v4, ""

    .line 538
    .line 539
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    sput-object v0, Landroidx/compose/material/icons/rounded/WifiProtectedSetupKt;->_wifiProtectedSetup:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 548
    .line 549
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/LocalSeeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localSee:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalSee(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LocalSeeKt;->_localSee:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LocalSee"

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
    const/high16 v4, 0x41180000    # 9.5f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40200000    # 2.5f

    .line 78
    .line 79
    const/high16 v26, 0x40200000    # 2.5f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x3fb0a3d7    # 1.38f

    .line 84
    .line 85
    .line 86
    const v23, 0x3f8f5c29    # 1.12f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40200000    # 2.5f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v25, 0x401d70a4    # 2.46f

    .line 97
    .line 98
    .line 99
    const v26, -0x3ffb851f    # -2.07f

    .line 100
    .line 101
    .line 102
    const v21, 0x3f9d70a4    # 1.23f

    .line 103
    .line 104
    .line 105
    const/16 v22, 0x0

    .line 106
    .line 107
    const/high16 v23, 0x40100000    # 2.25f

    .line 108
    .line 109
    const v24, -0x4099999a    # -0.9f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v25, -0x3fe147ae    # -2.48f

    .line 116
    .line 117
    .line 118
    const v26, -0x3fc47ae1    # -2.93f

    .line 119
    .line 120
    .line 121
    const/high16 v21, -0x40800000    # -1.0f

    .line 122
    .line 123
    const v22, -0x407eb852    # -1.01f

    .line 124
    .line 125
    .line 126
    const v23, -0x4015c28f    # -1.83f

    .line 127
    .line 128
    .line 129
    const v24, -0x40028f5c    # -1.98f

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v25, 0x41180000    # 9.5f

    .line 136
    .line 137
    const/high16 v26, 0x41600000    # 14.0f

    .line 138
    .line 139
    const v21, 0x4129c28f    # 10.61f

    .line 140
    .line 141
    .line 142
    const v22, 0x413851ec    # 11.52f

    .line 143
    .line 144
    .line 145
    const/high16 v23, 0x41180000    # 9.5f

    .line 146
    .line 147
    const v24, 0x414a147b    # 12.63f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const/16 v16, 0x3800

    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    const/high16 v6, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const/high16 v8, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/4 v7, 0x0

    .line 169
    const/high16 v9, 0x3f800000    # 1.0f

    .line 170
    .line 171
    const/high16 v12, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const/4 v14, 0x0

    .line 175
    const/4 v15, 0x0

    .line 176
    const-string v4, ""

    .line 177
    .line 178
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 179
    .line 180
    .line 181
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 186
    .line 187
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 188
    .line 189
    .line 190
    move-result-wide v6

    .line 191
    const/4 v2, 0x0

    .line 192
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    const v4, 0x41953333    # 18.65f

    .line 209
    .line 210
    .line 211
    const v6, 0x4188a3d7    # 17.08f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v25, -0x4059999a    # -1.3f

    .line 218
    .line 219
    .line 220
    const/16 v26, 0x0

    .line 221
    .line 222
    const v21, -0x41428f5c    # -0.37f

    .line 223
    .line 224
    .line 225
    const v22, 0x3ea3d70a    # 0.32f

    .line 226
    .line 227
    .line 228
    const v23, -0x40947ae1    # -0.92f

    .line 229
    .line 230
    .line 231
    const v24, 0x3ea3d70a    # 0.32f

    .line 232
    .line 233
    .line 234
    move-object/from16 v20, v2

    .line 235
    .line 236
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v26, -0x406e147b    # -1.14f

    .line 240
    .line 241
    .line 242
    const v21, -0x405eb852    # -1.26f

    .line 243
    .line 244
    .line 245
    const v22, -0x4075c28f    # -1.08f

    .line 246
    .line 247
    .line 248
    const v23, -0x40cccccd    # -0.7f

    .line 249
    .line 250
    .line 251
    const v24, -0x40e3d70a    # -0.61f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v25, -0x3f64cccd    # -4.85f

    .line 258
    .line 259
    .line 260
    const/high16 v26, 0x40200000    # 2.5f

    .line 261
    .line 262
    const v21, -0x40ab851f    # -0.83f

    .line 263
    .line 264
    .line 265
    const v22, 0x3fdeb852    # 1.74f

    .line 266
    .line 267
    .line 268
    const v23, -0x3fd147ae    # -2.73f

    .line 269
    .line 270
    .line 271
    const v24, 0x4037ae14    # 2.87f

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v25, -0x3f97ae14    # -3.63f

    .line 278
    .line 279
    .line 280
    const v26, -0x3f97ae14    # -3.63f

    .line 281
    .line 282
    .line 283
    const v21, -0x4015c28f    # -1.83f

    .line 284
    .line 285
    .line 286
    const v22, -0x415c28f6    # -0.32f

    .line 287
    .line 288
    .line 289
    const v23, -0x3fac28f6    # -3.31f

    .line 290
    .line 291
    .line 292
    const v24, -0x4019999a    # -1.8f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v25, 0x4053d70a    # 3.31f

    .line 299
    .line 300
    .line 301
    const v26, -0x3f5b851f    # -5.14f

    .line 302
    .line 303
    .line 304
    const v21, -0x4128f5c3    # -0.42f

    .line 305
    .line 306
    .line 307
    const v22, -0x3fe3d70a    # -2.44f

    .line 308
    .line 309
    .line 310
    const v23, 0x3f90a3d7    # 1.13f

    .line 311
    .line 312
    .line 313
    const v24, -0x3f6d70a4    # -4.58f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v25, 0x41200000    # 10.0f

    .line 320
    .line 321
    const v26, 0x40c4cccd    # 6.15f

    .line 322
    .line 323
    .line 324
    const v21, 0x4124cccd    # 10.3f

    .line 325
    .line 326
    .line 327
    const v22, 0x41073333    # 8.45f

    .line 328
    .line 329
    .line 330
    const/high16 v23, 0x41200000    # 10.0f

    .line 331
    .line 332
    const v24, 0x40e8f5c3    # 7.28f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v25, 0x41247ae1    # 10.28f

    .line 339
    .line 340
    .line 341
    const/high16 v26, 0x40800000    # 4.0f

    .line 342
    .line 343
    const/high16 v21, 0x41200000    # 10.0f

    .line 344
    .line 345
    const v22, 0x40accccd    # 5.4f

    .line 346
    .line 347
    .line 348
    const v23, 0x4121999a    # 10.1f

    .line 349
    .line 350
    .line 351
    const v24, 0x4095c28f    # 4.68f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v4, -0x41333333    # -0.4f

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v25, -0x40428f5c    # -1.48f

    .line 364
    .line 365
    .line 366
    const v26, 0x3f266666    # 0.65f

    .line 367
    .line 368
    .line 369
    const v21, -0x40f0a3d7    # -0.56f

    .line 370
    .line 371
    .line 372
    const/16 v22, 0x0

    .line 373
    .line 374
    const v23, -0x40733333    # -1.1f

    .line 375
    .line 376
    .line 377
    const v24, 0x3e75c28f    # 0.24f

    .line 378
    .line 379
    .line 380
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, 0x40e570a4    # 7.17f

    .line 384
    .line 385
    .line 386
    const/high16 v6, 0x40c00000    # 6.0f

    .line 387
    .line 388
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v4, 0x40800000    # 4.0f

    .line 392
    .line 393
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v25, 0x40000000    # 2.0f

    .line 397
    .line 398
    const/high16 v26, 0x41000000    # 8.0f

    .line 399
    .line 400
    const v21, 0x4039999a    # 2.9f

    .line 401
    .line 402
    .line 403
    const/high16 v22, 0x40c00000    # 6.0f

    .line 404
    .line 405
    const/high16 v23, 0x40000000    # 2.0f

    .line 406
    .line 407
    const v24, 0x40dccccd    # 6.9f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v4, 0x41400000    # 12.0f

    .line 414
    .line 415
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    .line 418
    const/high16 v26, 0x40000000    # 2.0f

    .line 419
    .line 420
    const/16 v21, 0x0

    .line 421
    .line 422
    const v22, 0x3f8ccccd    # 1.1f

    .line 423
    .line 424
    .line 425
    const v23, 0x3f666666    # 0.9f

    .line 426
    .line 427
    .line 428
    const/high16 v24, 0x40000000    # 2.0f

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v4, 0x41800000    # 16.0f

    .line 434
    .line 435
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v26, -0x40000000    # -2.0f

    .line 439
    .line 440
    const v21, 0x3f8ccccd    # 1.1f

    .line 441
    .line 442
    .line 443
    const/16 v22, 0x0

    .line 444
    .line 445
    const/high16 v23, 0x40000000    # 2.0f

    .line 446
    .line 447
    const v24, -0x4099999a    # -0.9f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v4, -0x3f3f0a3d    # -6.03f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v25, 0x41953333    # 18.65f

    .line 460
    .line 461
    .line 462
    const v26, 0x4188a3d7    # 17.08f

    .line 463
    .line 464
    .line 465
    const v21, 0x41a4b852    # 20.59f

    .line 466
    .line 467
    .line 468
    const v22, 0x41775c29    # 15.46f

    .line 469
    .line 470
    .line 471
    const v23, 0x419acccd    # 19.35f

    .line 472
    .line 473
    .line 474
    const v24, 0x4183d70a    # 16.48f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    const/high16 v6, 0x3f800000    # 1.0f

    .line 488
    .line 489
    const/4 v7, 0x0

    .line 490
    const-string v4, ""

    .line 491
    .line 492
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 493
    .line 494
    .line 495
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 500
    .line 501
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 502
    .line 503
    .line 504
    move-result-wide v6

    .line 505
    const/4 v0, 0x0

    .line 506
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 510
    .line 511
    .line 512
    move-result v10

    .line 513
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 514
    .line 515
    .line 516
    move-result v11

    .line 517
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 520
    .line 521
    .line 522
    const v0, 0x418ab852    # 17.34f

    .line 523
    .line 524
    .line 525
    const v2, 0x4166b852    # 14.42f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, 0x3faa3d71    # 1.33f

    .line 532
    .line 533
    .line 534
    const/16 v18, 0x0

    .line 535
    .line 536
    const v13, 0x3ebd70a4    # 0.37f

    .line 537
    .line 538
    .line 539
    const v14, 0x3ea8f5c3    # 0.33f

    .line 540
    .line 541
    .line 542
    const v15, 0x3f733333    # 0.95f

    .line 543
    .line 544
    .line 545
    const v16, 0x3ea8f5c3    # 0.33f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v17, 0x41c00000    # 24.0f

    .line 552
    .line 553
    const v18, 0x40c4cccd    # 6.15f

    .line 554
    .line 555
    .line 556
    const v13, 0x41b1c28f    # 22.22f

    .line 557
    .line 558
    .line 559
    const/high16 v14, 0x41340000    # 11.25f

    .line 560
    .line 561
    const/high16 v15, 0x41c00000    # 24.0f

    .line 562
    .line 563
    const/high16 v16, 0x41080000    # 8.5f

    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const/high16 v17, 0x41900000    # 18.0f

    .line 569
    .line 570
    const/16 v18, 0x0

    .line 571
    .line 572
    const/high16 v13, 0x41c00000    # 24.0f

    .line 573
    .line 574
    const v14, 0x401ae148    # 2.42f

    .line 575
    .line 576
    .line 577
    const v15, 0x41a93333    # 21.15f

    .line 578
    .line 579
    .line 580
    const/16 v16, 0x0

    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x401ae148    # 2.42f

    .line 586
    .line 587
    .line 588
    const v2, 0x40c4cccd    # 6.15f

    .line 589
    .line 590
    .line 591
    const/high16 v4, -0x3f400000    # -6.0f

    .line 592
    .line 593
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const v17, 0x418ab852    # 17.34f

    .line 597
    .line 598
    .line 599
    const v18, 0x4166b852    # 14.42f

    .line 600
    .line 601
    .line 602
    const/high16 v13, 0x41400000    # 12.0f

    .line 603
    .line 604
    const/high16 v14, 0x41080000    # 8.5f

    .line 605
    .line 606
    const v15, 0x415c7ae1    # 13.78f

    .line 607
    .line 608
    .line 609
    const/high16 v16, 0x41340000    # 11.25f

    .line 610
    .line 611
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/high16 v0, 0x40a80000    # 5.25f

    .line 618
    .line 619
    const v2, 0x418a28f6    # 17.27f

    .line 620
    .line 621
    .line 622
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v0, 0x40400000    # 3.0f

    .line 626
    .line 627
    const/high16 v2, 0x41900000    # 18.0f

    .line 628
    .line 629
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v0, 0x3f3ae148    # 0.73f

    .line 633
    .line 634
    .line 635
    const/high16 v2, 0x40100000    # 2.25f

    .line 636
    .line 637
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v0, 0x41a80000    # 21.0f

    .line 641
    .line 642
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v0, -0x40133333    # -1.85f

    .line 646
    .line 647
    .line 648
    const v2, 0x3fbc28f6    # 1.47f

    .line 649
    .line 650
    .line 651
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, 0x419ecccd    # 19.85f

    .line 655
    .line 656
    .line 657
    const/high16 v2, 0x41100000    # 9.0f

    .line 658
    .line 659
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v0, 0x40f2e148    # 7.59f

    .line 663
    .line 664
    .line 665
    const/high16 v2, 0x41900000    # 18.0f

    .line 666
    .line 667
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, 0x41813333    # 16.15f

    .line 671
    .line 672
    .line 673
    const/high16 v2, 0x41100000    # 9.0f

    .line 674
    .line 675
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x3f333333    # 0.7f

    .line 679
    .line 680
    .line 681
    const v2, -0x3fee147b    # -2.28f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const/high16 v0, 0x41700000    # 15.0f

    .line 688
    .line 689
    const/high16 v2, 0x40a80000    # 5.25f

    .line 690
    .line 691
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const v0, 0x418a28f6    # 17.27f

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const/16 v16, 0x3800

    .line 708
    .line 709
    const/16 v17, 0x0

    .line 710
    .line 711
    const/high16 v6, 0x3f800000    # 1.0f

    .line 712
    .line 713
    const/4 v7, 0x0

    .line 714
    const/high16 v12, 0x3f800000    # 1.0f

    .line 715
    .line 716
    const/4 v13, 0x0

    .line 717
    const/4 v14, 0x0

    .line 718
    const/4 v15, 0x0

    .line 719
    const-string v4, ""

    .line 720
    .line 721
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    sput-object v0, Landroidx/compose/material/icons/rounded/LocalSeeKt;->_localSee:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 730
    .line 731
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    return-object v0
.end method

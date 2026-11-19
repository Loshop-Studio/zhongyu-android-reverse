.class public final Landroidx/compose/material/icons/filled/SportsTennisKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsTennis:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsTennis(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SportsTennisKt;->_sportsTennis:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SportsTennis"

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
    const v4, 0x419c28f6    # 19.52f

    .line 71
    .line 72
    .line 73
    const v6, 0x401f5c29    # 2.49f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3ee73333    # -9.55f

    .line 80
    .line 81
    .line 82
    const v26, 0x3f87ae14    # 1.06f

    .line 83
    .line 84
    .line 85
    const v21, -0x3fea3d71    # -2.34f

    .line 86
    .line 87
    .line 88
    const v22, -0x3fea3d71    # -2.34f

    .line 89
    .line 90
    .line 91
    const v23, -0x3f2c28f6    # -6.62f

    .line 92
    .line 93
    .line 94
    const v24, -0x4010a3d7    # -1.87f

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
    const v25, -0x3fdd70a4    # -2.54f

    .line 103
    .line 104
    .line 105
    const v26, 0x40aeb852    # 5.46f

    .line 106
    .line 107
    .line 108
    const v21, -0x40333333    # -1.6f

    .line 109
    .line 110
    .line 111
    const v22, 0x3fcccccd    # 1.6f

    .line 112
    .line 113
    .line 114
    const v23, -0x3fdeb852    # -2.52f

    .line 115
    .line 116
    .line 117
    const v24, 0x4077ae14    # 3.87f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v25, -0x40533333    # -1.35f

    .line 124
    .line 125
    .line 126
    const/high16 v26, 0x40b00000    # 5.5f

    .line 127
    .line 128
    const v21, -0x435c28f6    # -0.02f

    .line 129
    .line 130
    .line 131
    const v22, 0x3fca3d71    # 1.58f

    .line 132
    .line 133
    .line 134
    const v23, 0x3e851eb8    # 0.26f

    .line 135
    .line 136
    .line 137
    const v24, 0x4078f5c3    # 3.89f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v4, 0x4087ae14    # 4.24f

    .line 144
    .line 145
    .line 146
    const v6, -0x3f7851ec    # -4.24f

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v4, 0x3fb5c28f    # 1.42f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, 0x4087ae14    # 4.24f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v25, 0x40b00000    # 5.5f

    .line 165
    .line 166
    const v26, -0x40533333    # -1.35f

    .line 167
    .line 168
    .line 169
    const v21, 0x3fce147b    # 1.61f

    .line 170
    .line 171
    .line 172
    const v22, -0x4031eb85    # -1.61f

    .line 173
    .line 174
    .line 175
    const v23, 0x407ae148    # 3.92f

    .line 176
    .line 177
    .line 178
    const v24, -0x4055c28f    # -1.33f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v4, 0x40aeb852    # 5.46f

    .line 185
    .line 186
    .line 187
    const v6, -0x3fdd70a4    # -2.54f

    .line 188
    .line 189
    .line 190
    const v7, 0x40770a3d    # 3.86f

    .line 191
    .line 192
    .line 193
    const v8, -0x408f5c29    # -0.94f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v25, 0x419c28f6    # 19.52f

    .line 200
    .line 201
    .line 202
    const v26, 0x401f5c29    # 2.49f

    .line 203
    .line 204
    .line 205
    const v21, 0x41ab0a3d    # 21.38f

    .line 206
    .line 207
    .line 208
    const v22, 0x4111c28f    # 9.11f

    .line 209
    .line 210
    .line 211
    const v23, 0x41aee148    # 21.86f

    .line 212
    .line 213
    .line 214
    const v24, 0x409a8f5c    # 4.83f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v4, 0x413ae148    # 11.68f

    .line 224
    .line 225
    .line 226
    const v6, 0x41251eb8    # 10.32f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v25, 0x3f87ae14    # 1.06f

    .line 233
    .line 234
    .line 235
    const v26, -0x3f28f5c3    # -6.72f

    .line 236
    .line 237
    .line 238
    const v21, -0x403c28f6    # -1.53f

    .line 239
    .line 240
    .line 241
    const v22, -0x403c28f6    # -1.53f

    .line 242
    .line 243
    .line 244
    const v23, -0x4079999a    # -1.05f

    .line 245
    .line 246
    .line 247
    const v24, -0x3f6c7ae1    # -4.61f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x40d70a3d    # 6.72f

    .line 254
    .line 255
    .line 256
    const v6, -0x407851ec    # -1.06f

    .line 257
    .line 258
    .line 259
    const v7, 0x40a5c28f    # 5.18f

    .line 260
    .line 261
    .line 262
    const v8, -0x3fda3d71    # -2.59f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v25, -0x407851ec    # -1.06f

    .line 269
    .line 270
    .line 271
    const v26, 0x40d70a3d    # 6.72f

    .line 272
    .line 273
    .line 274
    const v21, 0x3fc3d70a    # 1.53f

    .line 275
    .line 276
    .line 277
    const v22, 0x3fc3d70a    # 1.53f

    .line 278
    .line 279
    .line 280
    const v23, 0x3f866666    # 1.05f

    .line 281
    .line 282
    .line 283
    const v24, 0x4093851f    # 4.61f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v4, 0x413dc28f    # 11.86f

    .line 290
    .line 291
    .line 292
    const v6, 0x41535c29    # 13.21f

    .line 293
    .line 294
    .line 295
    const v7, 0x413ae148    # 11.68f

    .line 296
    .line 297
    .line 298
    const v8, 0x41251eb8    # 10.32f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v4, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    const/16 v16, 0x3800

    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const/high16 v6, 0x3f800000    # 1.0f

    .line 316
    .line 317
    const/high16 v8, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/4 v7, 0x0

    .line 320
    const/high16 v9, 0x3f800000    # 1.0f

    .line 321
    .line 322
    const/high16 v12, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/4 v13, 0x0

    .line 325
    const/4 v14, 0x0

    .line 326
    const/4 v15, 0x0

    .line 327
    const-string v4, ""

    .line 328
    .line 329
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 330
    .line 331
    .line 332
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 337
    .line 338
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 339
    .line 340
    .line 341
    move-result-wide v6

    .line 342
    const/4 v0, 0x0

    .line 343
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 347
    .line 348
    .line 349
    move-result v10

    .line 350
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 351
    .line 352
    .line 353
    move-result v11

    .line 354
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 357
    .line 358
    .line 359
    const/high16 v0, 0x41880000    # 17.0f

    .line 360
    .line 361
    const/high16 v2, 0x41900000    # 18.0f

    .line 362
    .line 363
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, 0x3fb47ae1    # 1.41f

    .line 367
    .line 368
    .line 369
    const v18, 0x3f170a3d    # 0.59f

    .line 370
    .line 371
    .line 372
    const v13, 0x3f07ae14    # 0.53f

    .line 373
    .line 374
    .line 375
    const v15, 0x3f851eb8    # 1.04f

    .line 376
    .line 377
    .line 378
    const v16, 0x3e570a3d    # 0.21f

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    const/16 v17, 0x0

    .line 385
    .line 386
    const v18, 0x40351eb8    # 2.83f

    .line 387
    .line 388
    .line 389
    const v13, 0x3f47ae14    # 0.78f

    .line 390
    .line 391
    .line 392
    const v14, 0x3f47ae14    # 0.78f

    .line 393
    .line 394
    .line 395
    const v15, 0x3f47ae14    # 0.78f

    .line 396
    .line 397
    .line 398
    const v16, 0x40033333    # 2.05f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const/high16 v17, 0x41900000    # 18.0f

    .line 405
    .line 406
    const/high16 v18, 0x41a80000    # 21.0f

    .line 407
    .line 408
    const v13, 0x419851ec    # 19.04f

    .line 409
    .line 410
    .line 411
    const v14, 0x41a651ec    # 20.79f

    .line 412
    .line 413
    .line 414
    const v15, 0x41943d71    # 18.53f

    .line 415
    .line 416
    .line 417
    const/high16 v16, 0x41a80000    # 21.0f

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, -0x404b851f    # -1.41f

    .line 423
    .line 424
    .line 425
    const v2, -0x40e8f5c3    # -0.59f

    .line 426
    .line 427
    .line 428
    const v4, -0x407ae148    # -1.04f

    .line 429
    .line 430
    .line 431
    const v6, -0x41a8f5c3    # -0.21f

    .line 432
    .line 433
    .line 434
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/16 v17, 0x0

    .line 438
    .line 439
    const v18, -0x3fcae148    # -2.83f

    .line 440
    .line 441
    .line 442
    const v13, -0x40b851ec    # -0.78f

    .line 443
    .line 444
    .line 445
    const v14, -0x40b851ec    # -0.78f

    .line 446
    .line 447
    .line 448
    const v15, -0x40b851ec    # -0.78f

    .line 449
    .line 450
    .line 451
    const v16, -0x3ffccccd    # -2.05f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/high16 v17, 0x41900000    # 18.0f

    .line 458
    .line 459
    const/high16 v18, 0x41880000    # 17.0f

    .line 460
    .line 461
    const v13, 0x4187ae14    # 16.96f

    .line 462
    .line 463
    .line 464
    const v14, 0x4189ae14    # 17.21f

    .line 465
    .line 466
    .line 467
    const v15, 0x418bc28f    # 17.47f

    .line 468
    .line 469
    .line 470
    const/high16 v16, 0x41880000    # 17.0f

    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v0, 0x41700000    # 15.0f

    .line 476
    .line 477
    const/high16 v2, 0x41900000    # 18.0f

    .line 478
    .line 479
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v17, -0x3fcae148    # -2.83f

    .line 483
    .line 484
    .line 485
    const v18, 0x3f95c28f    # 1.17f

    .line 486
    .line 487
    .line 488
    const v13, -0x407d70a4    # -1.02f

    .line 489
    .line 490
    .line 491
    const/4 v14, 0x0

    .line 492
    const v15, -0x3ffccccd    # -2.05f

    .line 493
    .line 494
    .line 495
    const v16, 0x3ec7ae14    # 0.39f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/16 v17, 0x0

    .line 502
    .line 503
    const v18, 0x40b51eb8    # 5.66f

    .line 504
    .line 505
    .line 506
    const v13, -0x403851ec    # -1.56f

    .line 507
    .line 508
    .line 509
    const v14, 0x3fc7ae14    # 1.56f

    .line 510
    .line 511
    .line 512
    const v15, -0x403851ec    # -1.56f

    .line 513
    .line 514
    .line 515
    const v16, 0x4082e148    # 4.09f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v17, 0x41900000    # 18.0f

    .line 522
    .line 523
    const/high16 v18, 0x41b80000    # 23.0f

    .line 524
    .line 525
    const v13, 0x417f3333    # 15.95f

    .line 526
    .line 527
    .line 528
    const v14, 0x41b4e148    # 22.61f

    .line 529
    .line 530
    .line 531
    const v15, 0x4187d70a    # 16.98f

    .line 532
    .line 533
    .line 534
    const/high16 v16, 0x41b80000    # 23.0f

    .line 535
    .line 536
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v0, 0x40351eb8    # 2.83f

    .line 540
    .line 541
    .line 542
    const v2, -0x406a3d71    # -1.17f

    .line 543
    .line 544
    .line 545
    const v4, 0x40033333    # 2.05f

    .line 546
    .line 547
    .line 548
    const v6, -0x413851ec    # -0.39f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const/16 v17, 0x0

    .line 555
    .line 556
    const v18, -0x3f4ae148    # -5.66f

    .line 557
    .line 558
    .line 559
    const v13, 0x3fc7ae14    # 1.56f

    .line 560
    .line 561
    .line 562
    const v14, -0x403851ec    # -1.56f

    .line 563
    .line 564
    .line 565
    const v15, 0x3fc7ae14    # 1.56f

    .line 566
    .line 567
    .line 568
    const v16, -0x3f7d1eb8    # -4.09f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v17, 0x41900000    # 18.0f

    .line 575
    .line 576
    const/high16 v18, 0x41700000    # 15.0f

    .line 577
    .line 578
    const v13, 0x41a06666    # 20.05f

    .line 579
    .line 580
    .line 581
    const v14, 0x41763d71    # 15.39f

    .line 582
    .line 583
    .line 584
    const v15, 0x419828f6    # 19.02f

    .line 585
    .line 586
    .line 587
    const/high16 v16, 0x41700000    # 15.0f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x41700000    # 15.0f

    .line 593
    .line 594
    const/high16 v2, 0x41900000    # 18.0f

    .line 595
    .line 596
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 603
    .line 604
    .line 605
    move-result-object v2

    .line 606
    const/16 v16, 0x3800

    .line 607
    .line 608
    const/16 v17, 0x0

    .line 609
    .line 610
    const/high16 v6, 0x3f800000    # 1.0f

    .line 611
    .line 612
    const/4 v7, 0x0

    .line 613
    const/high16 v12, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v13, 0x0

    .line 616
    const/4 v14, 0x0

    .line 617
    const/4 v15, 0x0

    .line 618
    const-string v4, ""

    .line 619
    .line 620
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    sput-object v0, Landroidx/compose/material/icons/filled/SportsTennisKt;->_sportsTennis:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 629
    .line 630
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    return-object v0
.end method

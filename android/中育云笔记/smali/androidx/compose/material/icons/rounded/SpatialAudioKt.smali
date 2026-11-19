.class public final Landroidx/compose/material/icons/rounded/SpatialAudioKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _spatialAudio:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSpatialAudio(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SpatialAudioKt;->_spatialAudio:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SpatialAudio"

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
    const v4, 0x41b0e148    # 22.11f

    .line 71
    .line 72
    .line 73
    const v6, 0x40fe6666    # 7.95f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3f3d1eb8    # -6.09f

    .line 80
    .line 81
    .line 82
    const v26, -0x3f3d1eb8    # -6.09f

    .line 83
    .line 84
    .line 85
    const v21, -0x400e147b    # -1.89f

    .line 86
    .line 87
    .line 88
    const v22, -0x41947ae1    # -0.23f

    .line 89
    .line 90
    .line 91
    const v23, -0x3f4dc28f    # -5.57f

    .line 92
    .line 93
    .line 94
    const v24, -0x4015c28f    # -1.83f

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
    const v25, 0x4170a3d7    # 15.04f

    .line 103
    .line 104
    .line 105
    const/high16 v26, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const v21, 0x417f5c29    # 15.96f

    .line 108
    .line 109
    .line 110
    const v22, 0x3fae147b    # 1.36f

    .line 111
    .line 112
    .line 113
    const v23, 0x4178a3d7    # 15.54f

    .line 114
    .line 115
    .line 116
    const/high16 v24, 0x3f800000    # 1.0f

    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v25, -0x40800000    # -1.0f

    .line 126
    .line 127
    const v26, 0x3f90a3d7    # 1.13f

    .line 128
    .line 129
    .line 130
    const v21, -0x40e66666    # -0.6f

    .line 131
    .line 132
    .line 133
    const/16 v22, 0x0

    .line 134
    .line 135
    const v23, -0x40770a3d    # -1.07f

    .line 136
    .line 137
    .line 138
    const v24, 0x3f07ae14    # 0.53f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v25, 0x40f9999a    # 7.8f

    .line 145
    .line 146
    .line 147
    const v26, 0x40f9999a    # 7.8f

    .line 148
    .line 149
    .line 150
    const v21, 0x3e9eb852    # 0.31f

    .line 151
    .line 152
    .line 153
    const v22, 0x401b851f    # 2.43f

    .line 154
    .line 155
    .line 156
    const v23, 0x401851ec    # 2.38f

    .line 157
    .line 158
    .line 159
    const v24, 0x40e3d70a    # 7.12f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v25, 0x3f90a3d7    # 1.13f

    .line 166
    .line 167
    .line 168
    const/high16 v26, -0x40800000    # -1.0f

    .line 169
    .line 170
    const v21, 0x3f19999a    # 0.6f

    .line 171
    .line 172
    .line 173
    const v22, 0x3da3d70a    # 0.08f

    .line 174
    .line 175
    .line 176
    const v23, 0x3f90a3d7    # 1.13f

    .line 177
    .line 178
    .line 179
    const v24, -0x41333333    # -0.4f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v25, 0x41b0e148    # 22.11f

    .line 189
    .line 190
    .line 191
    const v26, 0x40fe6666    # 7.95f

    .line 192
    .line 193
    .line 194
    const v21, 0x41b7c28f    # 22.97f

    .line 195
    .line 196
    .line 197
    const v22, 0x4106e148    # 8.43f

    .line 198
    .line 199
    .line 200
    const v23, 0x41b4cccd    # 22.6f

    .line 201
    .line 202
    .line 203
    const v24, 0x410028f6    # 8.01f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    const/16 v16, 0x3800

    .line 217
    .line 218
    const/16 v17, 0x0

    .line 219
    .line 220
    const/high16 v6, 0x3f800000    # 1.0f

    .line 221
    .line 222
    const/high16 v8, 0x3f800000    # 1.0f

    .line 223
    .line 224
    const/4 v7, 0x0

    .line 225
    const/high16 v9, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/high16 v12, 0x3f800000    # 1.0f

    .line 228
    .line 229
    const/4 v13, 0x0

    .line 230
    const/4 v14, 0x0

    .line 231
    const/4 v15, 0x0

    .line 232
    const-string v4, ""

    .line 233
    .line 234
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 242
    .line 243
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    const/4 v2, 0x0

    .line 248
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 262
    .line 263
    .line 264
    const v4, 0x41adae14    # 21.71f

    .line 265
    .line 266
    .line 267
    const v6, 0x40ba8f5c    # 5.83f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v25, 0x3fa147ae    # 1.26f

    .line 274
    .line 275
    .line 276
    const v26, -0x4087ae14    # -0.97f

    .line 277
    .line 278
    .line 279
    const v21, 0x3f23d70a    # 0.64f

    .line 280
    .line 281
    .line 282
    const v22, 0x3e2e147b    # 0.17f

    .line 283
    .line 284
    .line 285
    const v23, 0x3fa147ae    # 1.26f

    .line 286
    .line 287
    .line 288
    const v24, -0x416147ae    # -0.31f

    .line 289
    .line 290
    .line 291
    move-object/from16 v20, v2

    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v25, -0x40b5c28f    # -0.79f

    .line 297
    .line 298
    .line 299
    const/16 v21, 0x0

    .line 300
    .line 301
    const v22, -0x410f5c29    # -0.47f

    .line 302
    .line 303
    .line 304
    const v23, -0x4151eb85    # -0.34f

    .line 305
    .line 306
    .line 307
    const v24, -0x40a66666    # -0.85f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v25, -0x3ff8f5c3    # -2.11f

    .line 314
    .line 315
    .line 316
    const v26, -0x3ff7ae14    # -2.13f

    .line 317
    .line 318
    .line 319
    const v21, -0x41051eb8    # -0.49f

    .line 320
    .line 321
    .line 322
    const v22, -0x41f0a3d7    # -0.14f

    .line 323
    .line 324
    .line 325
    const v23, -0x4023d70a    # -1.72f

    .line 326
    .line 327
    .line 328
    const v24, -0x40d1eb85    # -0.68f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v25, 0x4198e148    # 19.11f

    .line 335
    .line 336
    .line 337
    const/high16 v26, 0x3f800000    # 1.0f

    .line 338
    .line 339
    const v21, 0x419f999a    # 19.95f

    .line 340
    .line 341
    .line 342
    const v22, 0x3fa8f5c3    # 1.32f

    .line 343
    .line 344
    .line 345
    const v23, 0x419c8f5c    # 19.57f

    .line 346
    .line 347
    .line 348
    const/high16 v24, 0x3f800000    # 1.0f

    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v4, 0x4198cccd    # 19.1f

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v25, -0x408a3d71    # -0.96f

    .line 360
    .line 361
    .line 362
    const v26, 0x3fa3d70a    # 1.28f

    .line 363
    .line 364
    .line 365
    const v21, -0x40d70a3d    # -0.66f

    .line 366
    .line 367
    .line 368
    const/16 v22, 0x0

    .line 369
    .line 370
    const v23, -0x406e147b    # -1.14f

    .line 371
    .line 372
    .line 373
    const v24, 0x3f23d70a    # 0.64f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v25, 0x41adae14    # 21.71f

    .line 380
    .line 381
    .line 382
    const v26, 0x40ba8f5c    # 5.83f

    .line 383
    .line 384
    .line 385
    const v21, 0x4195eb85    # 18.74f

    .line 386
    .line 387
    .line 388
    const/high16 v22, 0x40900000    # 4.5f

    .line 389
    .line 390
    const v23, 0x41a4a3d7    # 20.58f

    .line 391
    .line 392
    .line 393
    const v24, 0x40b0f5c3    # 5.53f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v2

    .line 406
    const/high16 v6, 0x3f800000    # 1.0f

    .line 407
    .line 408
    const/4 v7, 0x0

    .line 409
    const-string v4, ""

    .line 410
    .line 411
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 412
    .line 413
    .line 414
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 419
    .line 420
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 421
    .line 422
    .line 423
    move-result-wide v6

    .line 424
    const/4 v2, 0x0

    .line 425
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 429
    .line 430
    .line 431
    move-result v10

    .line 432
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 433
    .line 434
    .line 435
    move-result v11

    .line 436
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x41200000    # 10.0f

    .line 442
    .line 443
    const/high16 v6, 0x41100000    # 9.0f

    .line 444
    .line 445
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v4, -0x3f800000    # -4.0f

    .line 449
    .line 450
    const/4 v6, 0x0

    .line 451
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v26, 0x41000000    # 8.0f

    .line 455
    .line 456
    const/16 v27, 0x0

    .line 457
    .line 458
    const/high16 v21, 0x40800000    # 4.0f

    .line 459
    .line 460
    const/high16 v22, 0x40800000    # 4.0f

    .line 461
    .line 462
    const/16 v23, 0x0

    .line 463
    .line 464
    const/16 v24, 0x1

    .line 465
    .line 466
    const/16 v25, 0x1

    .line 467
    .line 468
    move-object/from16 v20, v2

    .line 469
    .line 470
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const/high16 v26, -0x3f000000    # -8.0f

    .line 474
    .line 475
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    const/high16 v6, 0x3f800000    # 1.0f

    .line 483
    .line 484
    const/4 v7, 0x0

    .line 485
    const-string v4, ""

    .line 486
    .line 487
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 488
    .line 489
    .line 490
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 491
    .line 492
    .line 493
    move-result v3

    .line 494
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 495
    .line 496
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 497
    .line 498
    .line 499
    move-result-wide v6

    .line 500
    const/4 v0, 0x0

    .line 501
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 509
    .line 510
    .line 511
    move-result v11

    .line 512
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 515
    .line 516
    .line 517
    const v0, 0x41831eb8    # 16.39f

    .line 518
    .line 519
    .line 520
    const v2, 0x4178f5c3    # 15.56f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, 0x41200000    # 10.0f

    .line 527
    .line 528
    const/high16 v18, 0x41600000    # 14.0f

    .line 529
    .line 530
    const v13, 0x416b5c29    # 14.71f

    .line 531
    .line 532
    .line 533
    const v14, 0x416b3333    # 14.7f

    .line 534
    .line 535
    .line 536
    const v15, 0x41487ae1    # 12.53f

    .line 537
    .line 538
    .line 539
    const/high16 v16, 0x41600000    # 14.0f

    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v17, -0x3f33851f    # -6.39f

    .line 545
    .line 546
    .line 547
    const v18, 0x3fc7ae14    # 1.56f

    .line 548
    .line 549
    .line 550
    const v13, -0x3fde147b    # -2.53f

    .line 551
    .line 552
    .line 553
    const/4 v14, 0x0

    .line 554
    const v15, -0x3f6947ae    # -4.71f

    .line 555
    .line 556
    .line 557
    const v16, 0x3f333333    # 0.7f

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, 0x40000000    # 2.0f

    .line 564
    .line 565
    const v18, 0x4191c28f    # 18.22f

    .line 566
    .line 567
    .line 568
    const v13, 0x40270a3d    # 2.61f

    .line 569
    .line 570
    .line 571
    const v14, 0x41808f5c    # 16.07f

    .line 572
    .line 573
    .line 574
    const/high16 v15, 0x40000000    # 2.0f

    .line 575
    .line 576
    const v16, 0x4188cccd    # 17.1f

    .line 577
    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v0, 0x41a80000    # 21.0f

    .line 583
    .line 584
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const/high16 v0, 0x41800000    # 16.0f

    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v0, -0x3fce147b    # -2.78f

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v17, 0x41831eb8    # 16.39f

    .line 599
    .line 600
    .line 601
    const v18, 0x4178f5c3    # 15.56f

    .line 602
    .line 603
    .line 604
    const/high16 v13, 0x41900000    # 18.0f

    .line 605
    .line 606
    const v14, 0x4188cccd    # 17.1f

    .line 607
    .line 608
    .line 609
    const v15, 0x418b1eb8    # 17.39f

    .line 610
    .line 611
    .line 612
    const v16, 0x41808f5c    # 16.07f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    const/16 v16, 0x3800

    .line 626
    .line 627
    const/16 v17, 0x0

    .line 628
    .line 629
    const/high16 v6, 0x3f800000    # 1.0f

    .line 630
    .line 631
    const/4 v7, 0x0

    .line 632
    const/high16 v12, 0x3f800000    # 1.0f

    .line 633
    .line 634
    const/4 v13, 0x0

    .line 635
    const/4 v14, 0x0

    .line 636
    const/4 v15, 0x0

    .line 637
    const-string v4, ""

    .line 638
    .line 639
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    sput-object v0, Landroidx/compose/material/icons/rounded/SpatialAudioKt;->_spatialAudio:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 648
    .line 649
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    return-object v0
.end method

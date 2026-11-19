.class public final Landroidx/compose/material/icons/sharp/TsunamiKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _tsunami:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTsunami(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/TsunamiKt;->_tsunami:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Tsunami"

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
    const v4, 0x41955c29    # 18.67f

    .line 71
    .line 72
    .line 73
    const v6, 0x418d0a3d    # 17.63f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, -0x3f2a8f5c    # -6.67f

    .line 80
    .line 81
    .line 82
    const/16 v26, 0x0

    .line 83
    .line 84
    const v21, -0x3f8ccccd    # -3.8f

    .line 85
    .line 86
    .line 87
    const v22, 0x40333333    # 2.8f

    .line 88
    .line 89
    .line 90
    const v23, -0x3f3c28f6    # -6.12f

    .line 91
    .line 92
    .line 93
    const v24, 0x3ecccccd    # 0.4f

    .line 94
    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v21, -0x40d70a3d    # -0.66f

    .line 102
    .line 103
    .line 104
    const v22, 0x3efae148    # 0.49f

    .line 105
    .line 106
    .line 107
    const v23, -0x3fc51eb8    # -2.92f

    .line 108
    .line 109
    .line 110
    const v24, 0x4030a3d7    # 2.76f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v25, 0x40000000    # 2.0f

    .line 117
    .line 118
    const/high16 v26, 0x41980000    # 19.0f

    .line 119
    .line 120
    const v21, 0x405b851f    # 3.43f

    .line 121
    .line 122
    .line 123
    const v22, 0x41983d71    # 19.03f

    .line 124
    .line 125
    .line 126
    const v23, 0x4029999a    # 2.65f

    .line 127
    .line 128
    .line 129
    const/high16 v24, 0x41980000    # 19.0f

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v4, 0x40000000    # 2.0f

    .line 135
    .line 136
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v25, 0x40551eb8    # 3.33f

    .line 140
    .line 141
    .line 142
    const v26, -0x4091eb85    # -0.93f

    .line 143
    .line 144
    .line 145
    const v21, 0x3f947ae1    # 1.16f

    .line 146
    .line 147
    .line 148
    const/16 v22, 0x0

    .line 149
    .line 150
    const v23, 0x40133333    # 2.3f

    .line 151
    .line 152
    .line 153
    const v24, -0x415c28f6    # -0.32f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v25, 0x40d570a4    # 6.67f

    .line 160
    .line 161
    .line 162
    const/16 v26, 0x0

    .line 163
    .line 164
    const v21, 0x4003d70a    # 2.06f

    .line 165
    .line 166
    .line 167
    const v22, 0x3f9c28f6    # 1.22f

    .line 168
    .line 169
    .line 170
    const v23, 0x4093851f    # 4.61f

    .line 171
    .line 172
    .line 173
    const v24, 0x3f9c28f6    # 1.22f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v25, 0x41b00000    # 22.0f

    .line 183
    .line 184
    const/high16 v26, 0x41a80000    # 21.0f

    .line 185
    .line 186
    const v21, 0x419d999a    # 19.7f

    .line 187
    .line 188
    .line 189
    const v22, 0x41a570a4    # 20.68f

    .line 190
    .line 191
    .line 192
    const v23, 0x41a6b852    # 20.84f

    .line 193
    .line 194
    .line 195
    const/high16 v24, 0x41a80000    # 21.0f

    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v4, -0x40000000    # -2.0f

    .line 201
    .line 202
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v25, 0x41955c29    # 18.67f

    .line 206
    .line 207
    .line 208
    const v26, 0x418d0a3d    # 17.63f

    .line 209
    .line 210
    .line 211
    const v21, 0x41aab852    # 21.34f

    .line 212
    .line 213
    .line 214
    const/high16 v22, 0x41980000    # 19.0f

    .line 215
    .line 216
    const/high16 v23, 0x41a40000    # 20.5f

    .line 217
    .line 218
    const v24, 0x4197d70a    # 18.98f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    const/16 v16, 0x3800

    .line 232
    .line 233
    const/16 v17, 0x0

    .line 234
    .line 235
    const/high16 v6, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/high16 v8, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/4 v7, 0x0

    .line 240
    const/high16 v9, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/high16 v12, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const/4 v13, 0x0

    .line 245
    const/4 v14, 0x0

    .line 246
    const/4 v15, 0x0

    .line 247
    const-string v4, ""

    .line 248
    .line 249
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 250
    .line 251
    .line 252
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 257
    .line 258
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 259
    .line 260
    .line 261
    move-result-wide v6

    .line 262
    const/4 v0, 0x0

    .line 263
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    const v0, 0x419aa3d7    # 19.33f

    .line 280
    .line 281
    .line 282
    const/high16 v2, 0x41400000    # 12.0f

    .line 283
    .line 284
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v0, 0x41b00000    # 22.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const/high16 v0, -0x40000000    # -2.0f

    .line 293
    .line 294
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v0, -0x3fd51eb8    # -2.67f

    .line 298
    .line 299
    .line 300
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v17, 0x41800000    # 16.0f

    .line 304
    .line 305
    const v18, 0x40d570a4    # 6.67f

    .line 306
    .line 307
    .line 308
    const/high16 v13, 0x418c0000    # 17.5f

    .line 309
    .line 310
    const/high16 v14, 0x41200000    # 10.0f

    .line 311
    .line 312
    const/high16 v15, 0x41800000    # 16.0f

    .line 313
    .line 314
    const/high16 v16, 0x41080000    # 8.5f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, 0x3f8b851f    # 1.09f

    .line 320
    .line 321
    .line 322
    const v18, -0x3faa3d71    # -3.34f

    .line 323
    .line 324
    .line 325
    const/4 v13, 0x0

    .line 326
    const v14, -0x407d70a4    # -1.02f

    .line 327
    .line 328
    .line 329
    const v15, 0x3ec28f5c    # 0.38f

    .line 330
    .line 331
    .line 332
    const v16, -0x402147ae    # -1.74f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, 0x41600000    # 14.0f

    .line 339
    .line 340
    const/high16 v18, 0x40400000    # 3.0f

    .line 341
    .line 342
    const v13, 0x417b851f    # 15.72f

    .line 343
    .line 344
    .line 345
    const v14, 0x4047ae14    # 3.12f

    .line 346
    .line 347
    .line 348
    const v15, 0x417170a4    # 15.09f

    .line 349
    .line 350
    .line 351
    const/high16 v16, 0x40400000    # 3.0f

    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x4000a3d7    # 2.01f

    .line 357
    .line 358
    .line 359
    const/high16 v18, 0x41680000    # 14.5f

    .line 360
    .line 361
    const v13, 0x40eb851f    # 7.36f

    .line 362
    .line 363
    .line 364
    const/high16 v14, 0x40400000    # 3.0f

    .line 365
    .line 366
    const v15, 0x4009999a    # 2.15f

    .line 367
    .line 368
    .line 369
    const v16, 0x41007ae1    # 8.03f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v17, -0x43dc28f6    # -0.01f

    .line 376
    .line 377
    .line 378
    const/high16 v18, 0x40000000    # 2.0f

    .line 379
    .line 380
    const/4 v13, 0x0

    .line 381
    const/4 v14, 0x0

    .line 382
    const v15, -0x43dc28f6    # -0.01f

    .line 383
    .line 384
    .line 385
    const/high16 v16, 0x40000000    # 2.0f

    .line 386
    .line 387
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, 0x40551eb8    # 3.33f

    .line 391
    .line 392
    .line 393
    const v18, -0x4091eb85    # -0.93f

    .line 394
    .line 395
    .line 396
    const v13, 0x3f947ae1    # 1.16f

    .line 397
    .line 398
    .line 399
    const v15, 0x40133333    # 2.3f

    .line 400
    .line 401
    .line 402
    const v16, -0x415c28f6    # -0.32f

    .line 403
    .line 404
    .line 405
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, 0x40d570a4    # 6.67f

    .line 409
    .line 410
    .line 411
    const/16 v18, 0x0

    .line 412
    .line 413
    const v13, 0x4003d70a    # 2.06f

    .line 414
    .line 415
    .line 416
    const v14, 0x3f9c28f6    # 1.22f

    .line 417
    .line 418
    .line 419
    const v15, 0x4093851f    # 4.61f

    .line 420
    .line 421
    .line 422
    const v16, 0x3f9c28f6    # 1.22f

    .line 423
    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v17, 0x40551eb8    # 3.33f

    .line 432
    .line 433
    .line 434
    const v18, 0x3f6e147b    # 0.93f

    .line 435
    .line 436
    .line 437
    const v13, 0x3f83d70a    # 1.03f

    .line 438
    .line 439
    .line 440
    const v14, 0x3f1c28f6    # 0.61f

    .line 441
    .line 442
    .line 443
    const v15, 0x400ae148    # 2.17f

    .line 444
    .line 445
    .line 446
    const v16, 0x3f6e147b    # 0.93f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v0, -0x40000000    # -2.0f

    .line 453
    .line 454
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v17, -0x3faae148    # -3.33f

    .line 458
    .line 459
    .line 460
    const v18, -0x4050a3d7    # -1.37f

    .line 461
    .line 462
    .line 463
    const v13, -0x40d70a3d    # -0.66f

    .line 464
    .line 465
    .line 466
    const/4 v14, 0x0

    .line 467
    const/high16 v15, -0x40400000    # -1.5f

    .line 468
    .line 469
    const v16, -0x435c28f6    # -0.02f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, -0x3f2a8f5c    # -6.67f

    .line 476
    .line 477
    .line 478
    const/16 v18, 0x0

    .line 479
    .line 480
    const v13, -0x3f8ccccd    # -3.8f

    .line 481
    .line 482
    .line 483
    const v14, 0x40333333    # 2.8f

    .line 484
    .line 485
    .line 486
    const v15, -0x3f3c28f6    # -6.12f

    .line 487
    .line 488
    .line 489
    const v16, 0x3ecccccd    # 0.4f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const v17, -0x40970a3d    # -0.91f

    .line 496
    .line 497
    .line 498
    const v18, 0x3f2147ae    # 0.63f

    .line 499
    .line 500
    .line 501
    const v13, -0x4099999a    # -0.9f

    .line 502
    .line 503
    .line 504
    const v14, 0x3f2b851f    # 0.67f

    .line 505
    .line 506
    .line 507
    const v15, -0x40f5c28f    # -0.54f

    .line 508
    .line 509
    .line 510
    const v16, 0x3ed1eb85    # 0.41f

    .line 511
    .line 512
    .line 513
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    .line 516
    const/high16 v17, 0x41200000    # 10.0f

    .line 517
    .line 518
    const/high16 v18, 0x41280000    # 10.5f

    .line 519
    .line 520
    const v13, 0x41263d71    # 10.39f

    .line 521
    .line 522
    .line 523
    const v14, 0x414d1eb8    # 12.82f

    .line 524
    .line 525
    .line 526
    const/high16 v15, 0x41200000    # 10.0f

    .line 527
    .line 528
    const v16, 0x413b3333    # 11.7f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v17, 0x4086b852    # 4.21f

    .line 535
    .line 536
    .line 537
    const v18, -0x3f5570a4    # -5.33f

    .line 538
    .line 539
    .line 540
    const/4 v13, 0x0

    .line 541
    const v14, -0x3fdae148    # -2.58f

    .line 542
    .line 543
    .line 544
    const v15, 0x3fe28f5c    # 1.77f

    .line 545
    .line 546
    .line 547
    const v16, -0x3f6851ec    # -4.74f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const/high16 v17, 0x41600000    # 14.0f

    .line 554
    .line 555
    const v18, 0x40d570a4    # 6.67f

    .line 556
    .line 557
    .line 558
    const v13, 0x416147ae    # 14.08f

    .line 559
    .line 560
    .line 561
    const v14, 0x40b5c28f    # 5.68f

    .line 562
    .line 563
    .line 564
    const/high16 v15, 0x41600000    # 14.0f

    .line 565
    .line 566
    const v16, 0x40c6147b    # 6.19f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v17, 0x419aa3d7    # 19.33f

    .line 573
    .line 574
    .line 575
    const/high16 v18, 0x41400000    # 12.0f

    .line 576
    .line 577
    const/high16 v13, 0x41600000    # 14.0f

    .line 578
    .line 579
    const v14, 0x4119c28f    # 9.61f

    .line 580
    .line 581
    .line 582
    const v15, 0x41831eb8    # 16.39f

    .line 583
    .line 584
    .line 585
    const/high16 v16, 0x41400000    # 12.0f

    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    const/16 v16, 0x3800

    .line 598
    .line 599
    const/16 v17, 0x0

    .line 600
    .line 601
    const/high16 v6, 0x3f800000    # 1.0f

    .line 602
    .line 603
    const/4 v7, 0x0

    .line 604
    const/high16 v12, 0x3f800000    # 1.0f

    .line 605
    .line 606
    const/4 v13, 0x0

    .line 607
    const/4 v14, 0x0

    .line 608
    const/4 v15, 0x0

    .line 609
    const-string v4, ""

    .line 610
    .line 611
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    sput-object v0, Landroidx/compose/material/icons/sharp/TsunamiKt;->_tsunami:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 620
    .line 621
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/BedtimeOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bedtimeOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBedtimeOff(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BedtimeOffKt;->_bedtimeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.BedtimeOff"

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
    const v4, 0x40fe6666    # 7.95f

    .line 71
    .line 72
    .line 73
    const v6, 0x40a428f6    # 5.13f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x41107ae1    # 9.03f

    .line 80
    .line 81
    .line 82
    const v6, 0x40c66666    # 6.2f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x3e75c28f    # 0.24f

    .line 89
    .line 90
    .line 91
    const v26, -0x40251eb8    # -1.71f

    .line 92
    .line 93
    .line 94
    const v21, 0x3d4ccccd    # 0.05f

    .line 95
    .line 96
    .line 97
    const v22, -0x40f33333    # -0.55f

    .line 98
    .line 99
    .line 100
    const v23, 0x3df5c28f    # 0.12f

    .line 101
    .line 102
    .line 103
    const v24, -0x4070a3d7    # -1.12f

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
    const v25, 0x40fe6666    # 7.95f

    .line 112
    .line 113
    .line 114
    const v26, 0x40a428f6    # 5.13f

    .line 115
    .line 116
    .line 117
    const v21, 0x410cf5c3    # 8.81f

    .line 118
    .line 119
    .line 120
    const v22, 0x40951eb8    # 4.66f

    .line 121
    .line 122
    .line 123
    const v23, 0x4105eb85    # 8.37f

    .line 124
    .line 125
    .line 126
    const v24, 0x409c28f6    # 4.88f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    const/16 v16, 0x3800

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    const v6, 0x3e99999a    # 0.3f

    .line 144
    .line 145
    .line 146
    const v8, 0x3e99999a    # 0.3f

    .line 147
    .line 148
    .line 149
    const/4 v7, 0x0

    .line 150
    const/high16 v9, 0x3f800000    # 1.0f

    .line 151
    .line 152
    const/high16 v12, 0x3f800000    # 1.0f

    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    const/4 v14, 0x0

    .line 156
    const/4 v15, 0x0

    .line 157
    const-string v4, ""

    .line 158
    .line 159
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 160
    .line 161
    .line 162
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 167
    .line 168
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 169
    .line 170
    .line 171
    move-result-wide v6

    .line 172
    const/4 v2, 0x0

    .line 173
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const v4, 0x40feb852    # 7.96f

    .line 190
    .line 191
    .line 192
    const v6, 0x40a428f6    # 5.13f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v25, 0x40800000    # 4.0f

    .line 199
    .line 200
    const/high16 v26, 0x41400000    # 12.0f

    .line 201
    .line 202
    const v21, 0x408d70a4    # 4.42f

    .line 203
    .line 204
    .line 205
    const v22, 0x41126666    # 9.15f

    .line 206
    .line 207
    .line 208
    const/high16 v23, 0x40800000    # 4.0f

    .line 209
    .line 210
    const v24, 0x412851ec    # 10.52f

    .line 211
    .line 212
    .line 213
    move-object/from16 v20, v2

    .line 214
    .line 215
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const/high16 v25, 0x41000000    # 8.0f

    .line 219
    .line 220
    const/high16 v26, 0x41000000    # 8.0f

    .line 221
    .line 222
    const/16 v21, 0x0

    .line 223
    .line 224
    const v22, 0x408d1eb8    # 4.41f

    .line 225
    .line 226
    .line 227
    const v23, 0x4065c28f    # 3.59f

    .line 228
    .line 229
    .line 230
    const/high16 v24, 0x41000000    # 8.0f

    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v25, 0x4081999a    # 4.05f

    .line 236
    .line 237
    .line 238
    const v26, -0x4070a3d7    # -1.12f

    .line 239
    .line 240
    .line 241
    const v21, 0x3fb9999a    # 1.45f

    .line 242
    .line 243
    .line 244
    const/16 v22, 0x0

    .line 245
    .line 246
    const v23, 0x4035c28f    # 2.84f

    .line 247
    .line 248
    .line 249
    const v24, -0x41333333    # -0.4f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    const v6, 0x3e99999a    # 0.3f

    .line 266
    .line 267
    .line 268
    const/4 v7, 0x0

    .line 269
    const-string v4, ""

    .line 270
    .line 271
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 272
    .line 273
    .line 274
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 279
    .line 280
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 281
    .line 282
    .line 283
    move-result-wide v6

    .line 284
    const/4 v2, 0x0

    .line 285
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 299
    .line 300
    .line 301
    const v4, 0x411451ec    # 9.27f

    .line 302
    .line 303
    .line 304
    const v6, 0x408fae14    # 4.49f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v25, 0x41107ae1    # 9.03f

    .line 311
    .line 312
    .line 313
    const v26, 0x40c66666    # 6.2f

    .line 314
    .line 315
    .line 316
    const v21, 0x41123d71    # 9.14f

    .line 317
    .line 318
    .line 319
    const v22, 0x40a28f5c    # 5.08f

    .line 320
    .line 321
    .line 322
    const v23, 0x41111eb8    # 9.07f

    .line 323
    .line 324
    .line 325
    const v24, 0x40b47ae1    # 5.64f

    .line 326
    .line 327
    .line 328
    move-object/from16 v20, v2

    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v4, 0x40033333    # 2.05f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v25, 0x3fa147ae    # 1.26f

    .line 340
    .line 341
    .line 342
    const v26, -0x3f38a3d7    # -6.23f

    .line 343
    .line 344
    .line 345
    const v21, -0x4175c28f    # -0.27f

    .line 346
    .line 347
    .line 348
    const v22, -0x3ffccccd    # -2.05f

    .line 349
    .line 350
    .line 351
    const v23, 0x3dcccccd    # 0.1f

    .line 352
    .line 353
    .line 354
    const v24, -0x3f78f5c3    # -4.22f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v25, -0x414ccccd    # -0.35f

    .line 361
    .line 362
    .line 363
    const v26, -0x43dc28f6    # -0.01f

    .line 364
    .line 365
    .line 366
    const v21, -0x420a3d71    # -0.12f

    .line 367
    .line 368
    .line 369
    const/16 v22, 0x0

    .line 370
    .line 371
    const v23, -0x41947ae1    # -0.23f

    .line 372
    .line 373
    .line 374
    const v24, -0x43dc28f6    # -0.01f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v25, -0x3f500000    # -5.5f

    .line 381
    .line 382
    const v26, 0x3fd33333    # 1.65f

    .line 383
    .line 384
    .line 385
    const v21, -0x3ffccccd    # -2.05f

    .line 386
    .line 387
    .line 388
    const v23, -0x3f847ae1    # -3.93f

    .line 389
    .line 390
    .line 391
    const v24, 0x3f1c28f6    # 0.61f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v4, 0x3fbae148    # 1.46f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v25, 0x411451ec    # 9.27f

    .line 404
    .line 405
    .line 406
    const v26, 0x408fae14    # 4.49f

    .line 407
    .line 408
    .line 409
    const v21, 0x4105eb85    # 8.37f

    .line 410
    .line 411
    .line 412
    const v22, 0x409c28f6    # 4.88f

    .line 413
    .line 414
    .line 415
    const v23, 0x410cf5c3    # 8.81f

    .line 416
    .line 417
    .line 418
    const v24, 0x40951eb8    # 4.66f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    const/high16 v6, 0x3f800000    # 1.0f

    .line 432
    .line 433
    const/high16 v8, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const/4 v7, 0x0

    .line 436
    const-string v4, ""

    .line 437
    .line 438
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 446
    .line 447
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 448
    .line 449
    .line 450
    move-result-wide v6

    .line 451
    const/4 v0, 0x0

    .line 452
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 456
    .line 457
    .line 458
    move-result v10

    .line 459
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 460
    .line 461
    .line 462
    move-result v11

    .line 463
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    const v0, 0x4033d70a    # 2.81f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v0, 0x3fb1eb85    # 1.39f

    .line 475
    .line 476
    .line 477
    const v2, 0x40870a3d    # 4.22f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, 0x401147ae    # 2.27f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v17, 0x40000000    # 2.0f

    .line 490
    .line 491
    const/high16 v18, 0x41400000    # 12.0f

    .line 492
    .line 493
    const v13, 0x40270a3d    # 2.61f

    .line 494
    .line 495
    .line 496
    const v14, 0x41011eb8    # 8.07f

    .line 497
    .line 498
    .line 499
    const/high16 v15, 0x40000000    # 2.0f

    .line 500
    .line 501
    const v16, 0x411f851f    # 9.97f

    .line 502
    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v17, 0x41200000    # 10.0f

    .line 508
    .line 509
    const/high16 v18, 0x41200000    # 10.0f

    .line 510
    .line 511
    const/4 v13, 0x0

    .line 512
    const v14, 0x40b0a3d7    # 5.52f

    .line 513
    .line 514
    .line 515
    const v15, 0x408f5c29    # 4.48f

    .line 516
    .line 517
    .line 518
    const/high16 v16, 0x41200000    # 10.0f

    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, 0x40b00000    # 5.5f

    .line 524
    .line 525
    const v18, -0x402a3d71    # -1.67f

    .line 526
    .line 527
    .line 528
    const v13, 0x40028f5c    # 2.04f

    .line 529
    .line 530
    .line 531
    const/4 v14, 0x0

    .line 532
    const v15, 0x407ae148    # 3.92f

    .line 533
    .line 534
    .line 535
    const v16, -0x40deb852    # -0.63f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x4011eb85    # 2.28f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, 0x3fb47ae1    # 1.41f

    .line 548
    .line 549
    .line 550
    const v2, -0x404b851f    # -1.41f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x4033d70a    # 2.81f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v0, 0x41400000    # 12.0f

    .line 566
    .line 567
    const/high16 v2, 0x41a00000    # 20.0f

    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v17, -0x3f000000    # -8.0f

    .line 573
    .line 574
    const/high16 v18, -0x3f000000    # -8.0f

    .line 575
    .line 576
    const v13, -0x3f72e148    # -4.41f

    .line 577
    .line 578
    .line 579
    const/high16 v15, -0x3f000000    # -8.0f

    .line 580
    .line 581
    const v16, -0x3f9a3d71    # -3.59f

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, 0x3f90a3d7    # 1.13f

    .line 588
    .line 589
    .line 590
    const v18, -0x3f7eb852    # -4.04f

    .line 591
    .line 592
    .line 593
    const/4 v13, 0x0

    .line 594
    const v14, -0x40428f5c    # -1.48f

    .line 595
    .line 596
    .line 597
    const v15, 0x3ed70a3d    # 0.42f

    .line 598
    .line 599
    .line 600
    const v16, -0x3fc9999a    # -2.85f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v0, 0x412eb852    # 10.92f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const/high16 v17, 0x41400000    # 12.0f

    .line 613
    .line 614
    const/high16 v18, 0x41a00000    # 20.0f

    .line 615
    .line 616
    const v13, 0x416d70a4    # 14.84f

    .line 617
    .line 618
    .line 619
    const v14, 0x419ccccd    # 19.6f

    .line 620
    .line 621
    .line 622
    const v15, 0x41573333    # 13.45f

    .line 623
    .line 624
    .line 625
    const/high16 v16, 0x41a00000    # 20.0f

    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    const/16 v16, 0x3800

    .line 638
    .line 639
    const/16 v17, 0x0

    .line 640
    .line 641
    const/high16 v6, 0x3f800000    # 1.0f

    .line 642
    .line 643
    const/4 v7, 0x0

    .line 644
    const/high16 v12, 0x3f800000    # 1.0f

    .line 645
    .line 646
    const/4 v13, 0x0

    .line 647
    const/4 v14, 0x0

    .line 648
    const/4 v15, 0x0

    .line 649
    const-string v4, ""

    .line 650
    .line 651
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    sput-object v0, Landroidx/compose/material/icons/twotone/BedtimeOffKt;->_bedtimeOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 660
    .line 661
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    return-object v0
.end method

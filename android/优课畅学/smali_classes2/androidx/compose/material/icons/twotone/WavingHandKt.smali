.class public final Landroidx/compose/material/icons/twotone/WavingHandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wavingHand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWavingHand(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WavingHandKt;->_wavingHand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WavingHand"

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
    const v4, 0x40cbd70a    # 6.37f

    .line 71
    .line 72
    .line 73
    const v6, 0x41070a3d    # 8.44f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3f35c28f    # 0.71f

    .line 80
    .line 81
    .line 82
    const/16 v26, 0x0

    .line 83
    .line 84
    const v21, 0x3e4ccccd    # 0.2f

    .line 85
    .line 86
    .line 87
    const v22, -0x41b33333    # -0.2f

    .line 88
    .line 89
    .line 90
    const v23, 0x3f028f5c    # 0.51f

    .line 91
    .line 92
    .line 93
    const v24, -0x41b33333    # -0.2f

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
    const/16 v25, 0x0

    .line 102
    .line 103
    const v26, 0x3f35c28f    # 0.71f

    .line 104
    .line 105
    .line 106
    const v22, 0x3e4ccccd    # 0.2f

    .line 107
    .line 108
    .line 109
    const v23, 0x3e4ccccd    # 0.2f

    .line 110
    .line 111
    .line 112
    const v24, 0x3f028f5c    # 0.51f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v4, 0x404b851f    # 3.18f

    .line 119
    .line 120
    .line 121
    const v6, -0x3fb47ae1    # -3.18f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v26, 0x4087ae14    # 4.24f

    .line 128
    .line 129
    .line 130
    const v21, 0x3f95c28f    # 1.17f

    .line 131
    .line 132
    .line 133
    const v22, 0x3f95c28f    # 1.17f

    .line 134
    .line 135
    .line 136
    const v23, 0x3f95c28f    # 1.17f

    .line 137
    .line 138
    .line 139
    const v24, 0x40447ae1    # 3.07f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, 0x3fb47ae1    # 1.41f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v25, 0x3f8f5c29    # 1.12f

    .line 152
    .line 153
    .line 154
    const v26, -0x3f547ae1    # -5.36f

    .line 155
    .line 156
    .line 157
    const v21, 0x3fb9999a    # 1.45f

    .line 158
    .line 159
    .line 160
    const v22, -0x40466666    # -1.45f

    .line 161
    .line 162
    .line 163
    const v23, 0x3fe8f5c3    # 1.82f

    .line 164
    .line 165
    .line 166
    const v24, -0x3f9b851f    # -3.57f

    .line 167
    .line 168
    .line 169
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v4, -0x3f366666    # -6.3f

    .line 173
    .line 174
    .line 175
    const v6, 0x40c9999a    # 6.3f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, 0x3f35c28f    # 0.71f

    .line 182
    .line 183
    .line 184
    const/16 v26, 0x0

    .line 185
    .line 186
    const v21, 0x3e4ccccd    # 0.2f

    .line 187
    .line 188
    .line 189
    const v22, -0x41b33333    # -0.2f

    .line 190
    .line 191
    .line 192
    const v23, 0x3f028f5c    # 0.51f

    .line 193
    .line 194
    .line 195
    const v24, -0x41b33333    # -0.2f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v4, 0x3f35c28f    # 0.71f

    .line 202
    .line 203
    .line 204
    const v6, 0x3f028f5c    # 0.51f

    .line 205
    .line 206
    .line 207
    const v7, 0x3e4ccccd    # 0.2f

    .line 208
    .line 209
    .line 210
    const/4 v8, 0x0

    .line 211
    invoke-virtual {v2, v7, v6, v8, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x40933333    # 4.6f

    .line 215
    .line 216
    .line 217
    const v6, -0x3f6ccccd    # -4.6f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v4, 0x3fb47ae1    # 1.41f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v4, -0x3f3fae14    # -6.01f

    .line 230
    .line 231
    .line 232
    const v6, 0x40c051ec    # 6.01f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/16 v25, 0x0

    .line 242
    .line 243
    const v26, 0x3f35c28f    # 0.71f

    .line 244
    .line 245
    .line 246
    const v22, 0x3e4ccccd    # 0.2f

    .line 247
    .line 248
    .line 249
    const v23, 0x3e4ccccd    # 0.2f

    .line 250
    .line 251
    .line 252
    const v24, 0x3f028f5c    # 0.51f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, 0x3fb47ae1    # 1.41f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, -0x3f61999a    # -4.95f

    .line 268
    .line 269
    .line 270
    const v6, 0x409e6666    # 4.95f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v25, 0x3f35c28f    # 0.71f

    .line 277
    .line 278
    .line 279
    const/16 v26, 0x0

    .line 280
    .line 281
    const v22, -0x41b33333    # -0.2f

    .line 282
    .line 283
    .line 284
    const v23, 0x3f028f5c    # 0.51f

    .line 285
    .line 286
    .line 287
    const v24, -0x41b33333    # -0.2f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/16 v25, 0x0

    .line 294
    .line 295
    const v26, 0x3f35c28f    # 0.71f

    .line 296
    .line 297
    .line 298
    const v22, 0x3e4ccccd    # 0.2f

    .line 299
    .line 300
    .line 301
    const v23, 0x3e4ccccd    # 0.2f

    .line 302
    .line 303
    .line 304
    const v24, 0x3f028f5c    # 0.51f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v4, 0x40b51eb8    # 5.66f

    .line 311
    .line 312
    .line 313
    const v6, -0x3f4ae148    # -5.66f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v4, 0x3fb47ae1    # 1.41f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v4, -0x3f9d70a4    # -3.54f

    .line 326
    .line 327
    .line 328
    const v6, 0x40628f5c    # 3.54f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v25, 0x3f35c28f    # 0.71f

    .line 335
    .line 336
    .line 337
    const/16 v26, 0x0

    .line 338
    .line 339
    const v22, -0x41b33333    # -0.2f

    .line 340
    .line 341
    .line 342
    const v23, 0x3f028f5c    # 0.51f

    .line 343
    .line 344
    .line 345
    const v24, -0x41b33333    # -0.2f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/16 v25, 0x0

    .line 352
    .line 353
    const v26, 0x3f35c28f    # 0.71f

    .line 354
    .line 355
    .line 356
    const v22, 0x3e4ccccd    # 0.2f

    .line 357
    .line 358
    .line 359
    const v23, 0x3e4ccccd    # 0.2f

    .line 360
    .line 361
    .line 362
    const v24, 0x3f028f5c    # 0.51f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v4, 0x4161999a    # 14.1f

    .line 369
    .line 370
    .line 371
    const v6, 0x4198cccd    # 19.1f

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v25, -0x3eecf5c3    # -9.19f

    .line 378
    .line 379
    .line 380
    const/16 v26, 0x0

    .line 381
    .line 382
    const v21, -0x3fdd70a4    # -2.54f

    .line 383
    .line 384
    .line 385
    const v22, 0x40228f5c    # 2.54f

    .line 386
    .line 387
    .line 388
    const v23, -0x3f2b3333    # -6.65f

    .line 389
    .line 390
    .line 391
    const v24, 0x40228f5c    # 2.54f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v4, -0x3f2b3333    # -6.65f

    .line 398
    .line 399
    .line 400
    const v6, -0x3eecf5c3    # -9.19f

    .line 401
    .line 402
    .line 403
    const/4 v7, 0x0

    .line 404
    const v8, -0x3fdd70a4    # -2.54f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v4, 0x40cbd70a    # 6.37f

    .line 411
    .line 412
    .line 413
    const v6, 0x41070a3d    # 8.44f

    .line 414
    .line 415
    .line 416
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    const/16 v16, 0x3800

    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    const v6, 0x3e99999a    # 0.3f

    .line 431
    .line 432
    .line 433
    const v8, 0x3e99999a    # 0.3f

    .line 434
    .line 435
    .line 436
    const/4 v7, 0x0

    .line 437
    const/high16 v9, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/high16 v12, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/4 v13, 0x0

    .line 442
    const/4 v14, 0x0

    .line 443
    const/4 v15, 0x0

    .line 444
    const-string v4, ""

    .line 445
    .line 446
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 447
    .line 448
    .line 449
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 454
    .line 455
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 456
    .line 457
    .line 458
    move-result-wide v6

    .line 459
    const/4 v0, 0x0

    .line 460
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 464
    .line 465
    .line 466
    move-result v10

    .line 467
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 468
    .line 469
    .line 470
    move-result v11

    .line 471
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 474
    .line 475
    .line 476
    const v0, 0x40e0f5c3    # 7.03f

    .line 477
    .line 478
    .line 479
    const v2, 0x409e6666    # 4.95f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x405f5c29    # 3.49f

    .line 486
    .line 487
    .line 488
    const v2, 0x4107d70a    # 8.49f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/16 v17, 0x0

    .line 495
    .line 496
    const v18, 0x414051ec    # 12.02f

    .line 497
    .line 498
    .line 499
    const v13, -0x3fab851f    # -3.32f

    .line 500
    .line 501
    .line 502
    const v14, 0x40547ae1    # 3.32f

    .line 503
    .line 504
    .line 505
    const v15, -0x3fab851f    # -3.32f

    .line 506
    .line 507
    .line 508
    const v16, 0x410b3333    # 8.7f

    .line 509
    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, 0x40547ae1    # 3.32f

    .line 515
    .line 516
    .line 517
    const v2, 0x414051ec    # 12.02f

    .line 518
    .line 519
    .line 520
    const/4 v4, 0x0

    .line 521
    const v6, 0x410b3333    # 8.7f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, -0x3f3fae14    # -6.01f

    .line 528
    .line 529
    .line 530
    const v2, 0x40c051ec    # 6.01f

    .line 531
    .line 532
    .line 533
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const v18, -0x3f9d70a4    # -3.54f

    .line 537
    .line 538
    .line 539
    const v13, 0x3f7851ec    # 0.97f

    .line 540
    .line 541
    .line 542
    const v14, -0x4087ae14    # -0.97f

    .line 543
    .line 544
    .line 545
    const v15, 0x3f7851ec    # 0.97f

    .line 546
    .line 547
    .line 548
    const v16, -0x3fdc28f6    # -2.56f

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 552
    .line 553
    .line 554
    const v17, -0x413851ec    # -0.39f

    .line 555
    .line 556
    .line 557
    const v18, -0x415c28f6    # -0.32f

    .line 558
    .line 559
    .line 560
    const v13, -0x420a3d71    # -0.12f

    .line 561
    .line 562
    .line 563
    const v14, -0x420a3d71    # -0.12f

    .line 564
    .line 565
    .line 566
    const/high16 v15, -0x41800000    # -0.25f

    .line 567
    .line 568
    const v16, -0x41947ae1    # -0.23f

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v0, 0x3ec7ae14    # 0.39f

    .line 575
    .line 576
    .line 577
    const v2, -0x413851ec    # -0.39f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/16 v17, 0x0

    .line 584
    .line 585
    const v18, -0x3f9d70a4    # -3.54f

    .line 586
    .line 587
    .line 588
    const v13, 0x3f7851ec    # 0.97f

    .line 589
    .line 590
    .line 591
    const v14, -0x4087ae14    # -0.97f

    .line 592
    .line 593
    .line 594
    const v15, 0x3f7851ec    # 0.97f

    .line 595
    .line 596
    .line 597
    const v16, -0x3fdc28f6    # -2.56f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, -0x40f5c28f    # -0.54f

    .line 604
    .line 605
    .line 606
    const v18, -0x412e147b    # -0.41f

    .line 607
    .line 608
    .line 609
    const v13, -0x41dc28f6    # -0.16f

    .line 610
    .line 611
    .line 612
    const v14, -0x41dc28f6    # -0.16f

    .line 613
    .line 614
    .line 615
    const v15, -0x414ccccd    # -0.35f

    .line 616
    .line 617
    .line 618
    const v16, -0x41666666    # -0.3f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const v17, -0x40fae148    # -0.52f

    .line 625
    .line 626
    .line 627
    const v18, -0x3fceb852    # -2.77f

    .line 628
    .line 629
    .line 630
    const v13, 0x3ecccccd    # 0.4f

    .line 631
    .line 632
    .line 633
    const v14, -0x40947ae1    # -0.92f

    .line 634
    .line 635
    .line 636
    const v15, 0x3e6b851f    # 0.23f

    .line 637
    .line 638
    .line 639
    const v16, -0x3ffeb852    # -2.02f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v17, -0x3fb33333    # -3.2f

    .line 646
    .line 647
    .line 648
    const v18, -0x4170a3d7    # -0.28f

    .line 649
    .line 650
    .line 651
    const v13, -0x40a147ae    # -0.87f

    .line 652
    .line 653
    .line 654
    const v14, -0x40a147ae    # -0.87f

    .line 655
    .line 656
    .line 657
    const v15, -0x3ff1eb85    # -2.22f

    .line 658
    .line 659
    .line 660
    const v16, -0x408a3d71    # -0.96f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v17, -0x4151eb85    # -0.34f

    .line 667
    .line 668
    .line 669
    const v18, -0x4128f5c3    # -0.42f

    .line 670
    .line 671
    .line 672
    const v13, -0x42333333    # -0.1f

    .line 673
    .line 674
    .line 675
    const v14, -0x41e66666    # -0.15f

    .line 676
    .line 677
    .line 678
    const v15, -0x41a8f5c3    # -0.21f

    .line 679
    .line 680
    .line 681
    const v16, -0x416b851f    # -0.29f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v17, -0x3f9d70a4    # -3.54f

    .line 688
    .line 689
    .line 690
    const/16 v18, 0x0

    .line 691
    .line 692
    const v13, -0x4087ae14    # -0.97f

    .line 693
    .line 694
    .line 695
    const v14, -0x4087ae14    # -0.97f

    .line 696
    .line 697
    .line 698
    const v15, -0x3fdc28f6    # -2.56f

    .line 699
    .line 700
    .line 701
    const v16, -0x4087ae14    # -0.97f

    .line 702
    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v0, -0x3fdf5c29    # -2.51f

    .line 708
    .line 709
    .line 710
    const v2, 0x4020a3d7    # 2.51f

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const v17, -0x415c28f6    # -0.32f

    .line 717
    .line 718
    .line 719
    const v18, -0x413851ec    # -0.39f

    .line 720
    .line 721
    .line 722
    const v13, -0x4247ae14    # -0.09f

    .line 723
    .line 724
    .line 725
    const v14, -0x41f0a3d7    # -0.14f

    .line 726
    .line 727
    .line 728
    const v15, -0x41b33333    # -0.2f

    .line 729
    .line 730
    .line 731
    const v16, -0x4175c28f    # -0.27f

    .line 732
    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v17, 0x40e0f5c3    # 7.03f

    .line 738
    .line 739
    .line 740
    const v18, 0x409e6666    # 4.95f

    .line 741
    .line 742
    .line 743
    const v13, 0x411947ae    # 9.58f

    .line 744
    .line 745
    .line 746
    const v14, 0x407eb852    # 3.98f

    .line 747
    .line 748
    .line 749
    const/high16 v15, 0x41000000    # 8.0f

    .line 750
    .line 751
    const v16, 0x407eb852    # 3.98f

    .line 752
    .line 753
    .line 754
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const v0, 0x40cbd70a    # 6.37f

    .line 761
    .line 762
    .line 763
    const v2, 0x41070a3d    # 8.44f

    .line 764
    .line 765
    .line 766
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const v17, 0x3f35c28f    # 0.71f

    .line 770
    .line 771
    .line 772
    const/16 v18, 0x0

    .line 773
    .line 774
    const v13, 0x3e4ccccd    # 0.2f

    .line 775
    .line 776
    .line 777
    const v14, -0x41b33333    # -0.2f

    .line 778
    .line 779
    .line 780
    const v15, 0x3f028f5c    # 0.51f

    .line 781
    .line 782
    .line 783
    const v16, -0x41b33333    # -0.2f

    .line 784
    .line 785
    .line 786
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const/16 v17, 0x0

    .line 790
    .line 791
    const v18, 0x3f35c28f    # 0.71f

    .line 792
    .line 793
    .line 794
    const v14, 0x3e4ccccd    # 0.2f

    .line 795
    .line 796
    .line 797
    const v15, 0x3e4ccccd    # 0.2f

    .line 798
    .line 799
    .line 800
    const v16, 0x3f028f5c    # 0.51f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, 0x404b851f    # 3.18f

    .line 807
    .line 808
    .line 809
    const v2, -0x3fb47ae1    # -3.18f

    .line 810
    .line 811
    .line 812
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v18, 0x4087ae14    # 4.24f

    .line 816
    .line 817
    .line 818
    const v13, 0x3f95c28f    # 1.17f

    .line 819
    .line 820
    .line 821
    const v14, 0x3f95c28f    # 1.17f

    .line 822
    .line 823
    .line 824
    const v15, 0x3f95c28f    # 1.17f

    .line 825
    .line 826
    .line 827
    const v16, 0x40447ae1    # 3.07f

    .line 828
    .line 829
    .line 830
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v0, 0x3fb47ae1    # 1.41f

    .line 834
    .line 835
    .line 836
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v17, 0x3f8f5c29    # 1.12f

    .line 840
    .line 841
    .line 842
    const v18, -0x3f547ae1    # -5.36f

    .line 843
    .line 844
    .line 845
    const v13, 0x3fb9999a    # 1.45f

    .line 846
    .line 847
    .line 848
    const v14, -0x40466666    # -1.45f

    .line 849
    .line 850
    .line 851
    const v15, 0x3fe8f5c3    # 1.82f

    .line 852
    .line 853
    .line 854
    const v16, -0x3f9b851f    # -3.57f

    .line 855
    .line 856
    .line 857
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v0, -0x3f366666    # -6.3f

    .line 861
    .line 862
    .line 863
    const v2, 0x40c9999a    # 6.3f

    .line 864
    .line 865
    .line 866
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v17, 0x3f35c28f    # 0.71f

    .line 870
    .line 871
    .line 872
    const/16 v18, 0x0

    .line 873
    .line 874
    const v13, 0x3e4ccccd    # 0.2f

    .line 875
    .line 876
    .line 877
    const v14, -0x41b33333    # -0.2f

    .line 878
    .line 879
    .line 880
    const v15, 0x3f028f5c    # 0.51f

    .line 881
    .line 882
    .line 883
    const v16, -0x41b33333    # -0.2f

    .line 884
    .line 885
    .line 886
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 887
    .line 888
    .line 889
    const v0, 0x3f35c28f    # 0.71f

    .line 890
    .line 891
    .line 892
    const v2, 0x3f028f5c    # 0.51f

    .line 893
    .line 894
    .line 895
    const v4, 0x3e4ccccd    # 0.2f

    .line 896
    .line 897
    .line 898
    const/4 v6, 0x0

    .line 899
    invoke-virtual {v12, v4, v2, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 900
    .line 901
    .line 902
    const v0, 0x40933333    # 4.6f

    .line 903
    .line 904
    .line 905
    const v2, -0x3f6ccccd    # -4.6f

    .line 906
    .line 907
    .line 908
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v0, 0x3fb47ae1    # 1.41f

    .line 912
    .line 913
    .line 914
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v0, -0x3f3fae14    # -6.01f

    .line 918
    .line 919
    .line 920
    const v2, 0x40c051ec    # 6.01f

    .line 921
    .line 922
    .line 923
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 924
    .line 925
    .line 926
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const/16 v17, 0x0

    .line 930
    .line 931
    const v18, 0x3f35c28f    # 0.71f

    .line 932
    .line 933
    .line 934
    const v14, 0x3e4ccccd    # 0.2f

    .line 935
    .line 936
    .line 937
    const v15, 0x3e4ccccd    # 0.2f

    .line 938
    .line 939
    .line 940
    const v16, 0x3f028f5c    # 0.51f

    .line 941
    .line 942
    .line 943
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 944
    .line 945
    .line 946
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 947
    .line 948
    .line 949
    const v0, 0x3fb47ae1    # 1.41f

    .line 950
    .line 951
    .line 952
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    const v0, -0x3f61999a    # -4.95f

    .line 956
    .line 957
    .line 958
    const v2, 0x409e6666    # 4.95f

    .line 959
    .line 960
    .line 961
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 962
    .line 963
    .line 964
    const v17, 0x3f35c28f    # 0.71f

    .line 965
    .line 966
    .line 967
    const/16 v18, 0x0

    .line 968
    .line 969
    const v14, -0x41b33333    # -0.2f

    .line 970
    .line 971
    .line 972
    const v15, 0x3f028f5c    # 0.51f

    .line 973
    .line 974
    .line 975
    const v16, -0x41b33333    # -0.2f

    .line 976
    .line 977
    .line 978
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const/16 v17, 0x0

    .line 982
    .line 983
    const v18, 0x3f35c28f    # 0.71f

    .line 984
    .line 985
    .line 986
    const v14, 0x3e4ccccd    # 0.2f

    .line 987
    .line 988
    .line 989
    const v15, 0x3e4ccccd    # 0.2f

    .line 990
    .line 991
    .line 992
    const v16, 0x3f028f5c    # 0.51f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const v0, 0x40b51eb8    # 5.66f

    .line 999
    .line 1000
    .line 1001
    const v2, -0x3f4ae148    # -5.66f

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1005
    .line 1006
    .line 1007
    const v0, 0x3fb47ae1    # 1.41f

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const v0, -0x3f9d70a4    # -3.54f

    .line 1014
    .line 1015
    .line 1016
    const v2, 0x40628f5c    # 3.54f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v17, 0x3f35c28f    # 0.71f

    .line 1023
    .line 1024
    .line 1025
    const/16 v18, 0x0

    .line 1026
    .line 1027
    const v14, -0x41b33333    # -0.2f

    .line 1028
    .line 1029
    .line 1030
    const v15, 0x3f028f5c    # 0.51f

    .line 1031
    .line 1032
    .line 1033
    const v16, -0x41b33333    # -0.2f

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    const/16 v17, 0x0

    .line 1040
    .line 1041
    const v18, 0x3f35c28f    # 0.71f

    .line 1042
    .line 1043
    .line 1044
    const v14, 0x3e4ccccd    # 0.2f

    .line 1045
    .line 1046
    .line 1047
    const v15, 0x3e4ccccd    # 0.2f

    .line 1048
    .line 1049
    .line 1050
    const v16, 0x3f028f5c    # 0.51f

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const v0, 0x4161999a    # 14.1f

    .line 1057
    .line 1058
    .line 1059
    const v2, 0x4198cccd    # 19.1f

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    const v17, -0x3eecf5c3    # -9.19f

    .line 1066
    .line 1067
    .line 1068
    const/16 v18, 0x0

    .line 1069
    .line 1070
    const v13, -0x3fdd70a4    # -2.54f

    .line 1071
    .line 1072
    .line 1073
    const v14, 0x40228f5c    # 2.54f

    .line 1074
    .line 1075
    .line 1076
    const v15, -0x3f2b3333    # -6.65f

    .line 1077
    .line 1078
    .line 1079
    const v16, 0x40228f5c    # 2.54f

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const v0, -0x3f2b3333    # -6.65f

    .line 1086
    .line 1087
    .line 1088
    const v2, -0x3eecf5c3    # -9.19f

    .line 1089
    .line 1090
    .line 1091
    const/4 v4, 0x0

    .line 1092
    const v6, -0x3fdd70a4    # -2.54f

    .line 1093
    .line 1094
    .line 1095
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1096
    .line 1097
    .line 1098
    const v0, 0x40cbd70a    # 6.37f

    .line 1099
    .line 1100
    .line 1101
    const v2, 0x41070a3d    # 8.44f

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1108
    .line 1109
    .line 1110
    const/high16 v0, 0x41b80000    # 23.0f

    .line 1111
    .line 1112
    const/high16 v2, 0x41880000    # 17.0f

    .line 1113
    .line 1114
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    const/high16 v17, -0x3f400000    # -6.0f

    .line 1118
    .line 1119
    const/high16 v18, 0x40c00000    # 6.0f

    .line 1120
    .line 1121
    const/4 v13, 0x0

    .line 1122
    const v14, 0x4053d70a    # 3.31f

    .line 1123
    .line 1124
    .line 1125
    const v15, -0x3fd3d70a    # -2.69f

    .line 1126
    .line 1127
    .line 1128
    const/high16 v16, 0x40c00000    # 6.0f

    .line 1129
    .line 1130
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1131
    .line 1132
    .line 1133
    const/high16 v0, -0x40400000    # -1.5f

    .line 1134
    .line 1135
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1136
    .line 1137
    .line 1138
    const/high16 v17, 0x40900000    # 4.5f

    .line 1139
    .line 1140
    const/high16 v18, -0x3f700000    # -4.5f

    .line 1141
    .line 1142
    const v13, 0x401eb852    # 2.48f

    .line 1143
    .line 1144
    .line 1145
    const/4 v14, 0x0

    .line 1146
    const/high16 v15, 0x40900000    # 4.5f

    .line 1147
    .line 1148
    const v16, -0x3ffeb852    # -2.02f

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1152
    .line 1153
    .line 1154
    const/high16 v0, 0x41b80000    # 23.0f

    .line 1155
    .line 1156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1160
    .line 1161
    .line 1162
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1163
    .line 1164
    const/high16 v2, 0x40e00000    # 7.0f

    .line 1165
    .line 1166
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1167
    .line 1168
    .line 1169
    const/high16 v17, 0x40c00000    # 6.0f

    .line 1170
    .line 1171
    const/high16 v18, -0x3f400000    # -6.0f

    .line 1172
    .line 1173
    const/4 v13, 0x0

    .line 1174
    const v14, -0x3fac28f6    # -3.31f

    .line 1175
    .line 1176
    .line 1177
    const v15, 0x402c28f6    # 2.69f

    .line 1178
    .line 1179
    .line 1180
    const/high16 v16, -0x3f400000    # -6.0f

    .line 1181
    .line 1182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1183
    .line 1184
    .line 1185
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 1186
    .line 1187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1188
    .line 1189
    .line 1190
    const/high16 v17, 0x40200000    # 2.5f

    .line 1191
    .line 1192
    const/high16 v18, 0x40e00000    # 7.0f

    .line 1193
    .line 1194
    const v13, 0x4090a3d7    # 4.52f

    .line 1195
    .line 1196
    .line 1197
    const/high16 v14, 0x40200000    # 2.5f

    .line 1198
    .line 1199
    const/high16 v15, 0x40200000    # 2.5f

    .line 1200
    .line 1201
    const v16, 0x4090a3d7    # 4.52f

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1205
    .line 1206
    .line 1207
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1208
    .line 1209
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v2

    .line 1219
    const/16 v16, 0x3800

    .line 1220
    .line 1221
    const/16 v17, 0x0

    .line 1222
    .line 1223
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1224
    .line 1225
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1226
    .line 1227
    const/4 v7, 0x0

    .line 1228
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1229
    .line 1230
    const/4 v13, 0x0

    .line 1231
    const/4 v14, 0x0

    .line 1232
    const/4 v15, 0x0

    .line 1233
    const-string v4, ""

    .line 1234
    .line 1235
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    sput-object v0, Landroidx/compose/material/icons/twotone/WavingHandKt;->_wavingHand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1244
    .line 1245
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1246
    .line 1247
    .line 1248
    return-object v0
.end method

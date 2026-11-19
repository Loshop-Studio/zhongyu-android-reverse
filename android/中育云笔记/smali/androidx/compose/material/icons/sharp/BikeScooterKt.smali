.class public final Landroidx/compose/material/icons/sharp/BikeScooterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bikeScooter:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBikeScooter(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/BikeScooterKt;->_bikeScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.BikeScooter"

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
    const/high16 v4, 0x41600000    # 14.0f

    .line 71
    .line 72
    const/high16 v6, 0x41200000    # 10.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x3f3d70a4    # 0.74f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, 0x4107851f    # 8.47f

    .line 84
    .line 85
    .line 86
    const/high16 v6, 0x40800000    # 4.0f

    .line 87
    .line 88
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 89
    .line 90
    .line 91
    const/high16 v4, 0x40400000    # 3.0f

    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v4, 0x4077ae14    # 3.87f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v4, 0x3fb5c28f    # 1.42f

    .line 108
    .line 109
    .line 110
    const/high16 v6, 0x40c80000    # 6.25f

    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v25, -0x43dc28f6    # -0.01f

    .line 116
    .line 117
    .line 118
    const/16 v26, 0x0

    .line 119
    .line 120
    const/16 v21, 0x0

    .line 121
    .line 122
    const/16 v22, 0x0

    .line 123
    .line 124
    const v23, -0x43dc28f6    # -0.01f

    .line 125
    .line 126
    .line 127
    const/16 v24, 0x0

    .line 128
    .line 129
    move-object/from16 v20, v2

    .line 130
    .line 131
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v25, 0x4082e148    # 4.09f

    .line 135
    .line 136
    .line 137
    const/high16 v26, 0x41880000    # 17.0f

    .line 138
    .line 139
    const v21, 0x40c3d70a    # 6.12f

    .line 140
    .line 141
    .line 142
    const v22, 0x414e6666    # 12.9f

    .line 143
    .line 144
    .line 145
    const v23, 0x408f0a3d    # 4.47f

    .line 146
    .line 147
    .line 148
    const v24, 0x416bae14    # 14.73f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/4 v4, 0x0

    .line 155
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x40000000    # 2.0f

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v4, 0x40c00000    # 6.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, -0x40800000    # -1.0f

    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v25, 0x41200000    # 10.0f

    .line 174
    .line 175
    const/high16 v26, 0x41600000    # 14.0f

    .line 176
    .line 177
    const/high16 v21, 0x40c00000    # 6.0f

    .line 178
    .line 179
    const v22, 0x417ca3d7    # 15.79f

    .line 180
    .line 181
    .line 182
    const v23, 0x40f947ae    # 7.79f

    .line 183
    .line 184
    .line 185
    const/high16 v24, 0x41600000    # 14.0f

    .line 186
    .line 187
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    const/16 v16, 0x3800

    .line 198
    .line 199
    const/16 v17, 0x0

    .line 200
    .line 201
    const/high16 v6, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/high16 v8, 0x3f800000    # 1.0f

    .line 204
    .line 205
    const/4 v7, 0x0

    .line 206
    const/high16 v9, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/high16 v12, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const/4 v14, 0x0

    .line 212
    const/4 v15, 0x0

    .line 213
    const-string v4, ""

    .line 214
    .line 215
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 216
    .line 217
    .line 218
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 223
    .line 224
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 225
    .line 226
    .line 227
    move-result-wide v6

    .line 228
    const/4 v2, 0x0

    .line 229
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 233
    .line 234
    .line 235
    move-result v10

    .line 236
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x41000000    # 8.0f

    .line 246
    .line 247
    const v6, 0x419170a4    # 18.18f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, -0x4015c28f    # -1.83f

    .line 254
    .line 255
    .line 256
    const/high16 v6, -0x3f600000    # -5.0f

    .line 257
    .line 258
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v4, 0x41300000    # 11.0f

    .line 262
    .line 263
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, 0x40000000    # 2.0f

    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v4, 0x407d70a4    # 3.96f

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v4, 0x3f8ccccd    # 1.1f

    .line 278
    .line 279
    .line 280
    const/high16 v6, 0x40400000    # 3.0f

    .line 281
    .line 282
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, 0x41266666    # 10.4f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, 0x3eeb851f    # 0.46f

    .line 292
    .line 293
    .line 294
    const/high16 v6, 0x40000000    # 2.0f

    .line 295
    .line 296
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v4, 0x41700000    # 15.0f

    .line 300
    .line 301
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v25, -0x4099999a    # -0.9f

    .line 305
    .line 306
    .line 307
    const/high16 v26, 0x40000000    # 2.0f

    .line 308
    .line 309
    const v21, -0x4123d70a    # -0.43f

    .line 310
    .line 311
    .line 312
    const v22, 0x3f147ae1    # 0.58f

    .line 313
    .line 314
    .line 315
    const/high16 v23, -0x40c00000    # -0.75f

    .line 316
    .line 317
    const/high16 v24, 0x3fa00000    # 1.25f

    .line 318
    .line 319
    move-object/from16 v20, v2

    .line 320
    .line 321
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v4, -0x3fcd70a4    # -2.79f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v4, 0x3eeb851f    # 0.46f

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v4, 0x40151eb8    # 2.33f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v25, 0x4094cccd    # 4.65f

    .line 343
    .line 344
    .line 345
    const v26, 0x407f5c29    # 3.99f

    .line 346
    .line 347
    .line 348
    const v21, 0x3ee147ae    # 0.44f

    .line 349
    .line 350
    .line 351
    const v22, 0x400eb852    # 2.23f

    .line 352
    .line 353
    .line 354
    const v23, 0x4013d70a    # 2.31f

    .line 355
    .line 356
    .line 357
    const v24, 0x407851ec    # 3.88f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v25, 0x40a80000    # 5.25f

    .line 364
    .line 365
    const/high16 v26, -0x3f600000    # -5.0f

    .line 366
    .line 367
    const v21, 0x40333333    # 2.8f

    .line 368
    .line 369
    .line 370
    const v22, 0x3e051eb8    # 0.13f

    .line 371
    .line 372
    .line 373
    const/high16 v23, 0x40a80000    # 5.25f

    .line 374
    .line 375
    const v24, -0x3ff3d70a    # -2.19f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v25, -0x3f600000    # -5.0f

    .line 382
    .line 383
    const/16 v21, 0x0

    .line 384
    .line 385
    const v22, -0x3fcccccd    # -2.8f

    .line 386
    .line 387
    .line 388
    const v23, -0x3ff33333    # -2.2f

    .line 389
    .line 390
    .line 391
    const/high16 v24, -0x3f600000    # -5.0f

    .line 392
    .line 393
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v4, 0x419170a4    # 18.18f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v4, 0x41800000    # 16.0f

    .line 406
    .line 407
    const/high16 v6, 0x41980000    # 19.0f

    .line 408
    .line 409
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 413
    .line 414
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 415
    .line 416
    const v21, -0x4028f5c3    # -1.68f

    .line 417
    .line 418
    .line 419
    const/16 v22, 0x0

    .line 420
    .line 421
    const/high16 v23, -0x3fc00000    # -3.0f

    .line 422
    .line 423
    const v24, -0x40570a3d    # -1.32f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v25, 0x3f866666    # 1.05f

    .line 430
    .line 431
    .line 432
    const v26, -0x3fee147b    # -2.28f

    .line 433
    .line 434
    .line 435
    const/16 v21, 0x0

    .line 436
    .line 437
    const v22, -0x4091eb85    # -0.93f

    .line 438
    .line 439
    .line 440
    const v23, 0x3ed1eb85    # 0.41f

    .line 441
    .line 442
    .line 443
    const v24, -0x40228f5c    # -1.73f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v4, 0x3f75c28f    # 0.96f

    .line 450
    .line 451
    .line 452
    const v6, 0x4028f5c3    # 2.64f

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 456
    .line 457
    .line 458
    const v4, 0x3ff0a3d7    # 1.88f

    .line 459
    .line 460
    .line 461
    const v6, -0x40d1eb85    # -0.68f

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v4, -0x4087ae14    # -0.97f

    .line 468
    .line 469
    .line 470
    const v6, -0x3fd51eb8    # -2.67f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v25, 0x3db851ec    # 0.09f

    .line 477
    .line 478
    .line 479
    const v26, -0x43dc28f6    # -0.01f

    .line 480
    .line 481
    .line 482
    const v21, 0x3cf5c28f    # 0.03f

    .line 483
    .line 484
    .line 485
    const/16 v22, 0x0

    .line 486
    .line 487
    const v23, 0x3d75c28f    # 0.06f

    .line 488
    .line 489
    .line 490
    const v24, -0x43dc28f6    # -0.01f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v25, 0x40400000    # 3.0f

    .line 497
    .line 498
    const/high16 v26, 0x40400000    # 3.0f

    .line 499
    .line 500
    const v21, 0x3fd70a3d    # 1.68f

    .line 501
    .line 502
    .line 503
    const/high16 v23, 0x40400000    # 3.0f

    .line 504
    .line 505
    const v24, 0x3fa8f5c3    # 1.32f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v4, 0x41a570a4    # 20.68f

    .line 512
    .line 513
    .line 514
    const/high16 v6, 0x41800000    # 16.0f

    .line 515
    .line 516
    const/high16 v7, 0x41980000    # 19.0f

    .line 517
    .line 518
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    const/high16 v6, 0x3f800000    # 1.0f

    .line 529
    .line 530
    const/4 v7, 0x0

    .line 531
    const-string v4, ""

    .line 532
    .line 533
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 534
    .line 535
    .line 536
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 541
    .line 542
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 543
    .line 544
    .line 545
    move-result-wide v6

    .line 546
    const/4 v0, 0x0

    .line 547
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 551
    .line 552
    .line 553
    move-result v10

    .line 554
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 555
    .line 556
    .line 557
    move-result v11

    .line 558
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 561
    .line 562
    .line 563
    const/high16 v0, 0x41700000    # 15.0f

    .line 564
    .line 565
    const/high16 v2, 0x41200000    # 10.0f

    .line 566
    .line 567
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 571
    .line 572
    const/high16 v18, 0x40400000    # 3.0f

    .line 573
    .line 574
    const v13, -0x402b851f    # -1.66f

    .line 575
    .line 576
    .line 577
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 578
    .line 579
    const v16, 0x3fab851f    # 1.34f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x3fab851f    # 1.34f

    .line 586
    .line 587
    .line 588
    const/high16 v2, 0x40400000    # 3.0f

    .line 589
    .line 590
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, -0x40547ae1    # -1.34f

    .line 594
    .line 595
    .line 596
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 597
    .line 598
    const/high16 v4, 0x40400000    # 3.0f

    .line 599
    .line 600
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v0, 0x413a8f5c    # 11.66f

    .line 604
    .line 605
    .line 606
    const/high16 v2, 0x41700000    # 15.0f

    .line 607
    .line 608
    const/high16 v4, 0x41200000    # 10.0f

    .line 609
    .line 610
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const/high16 v0, 0x41980000    # 19.0f

    .line 617
    .line 618
    const/high16 v2, 0x41200000    # 10.0f

    .line 619
    .line 620
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v17, -0x40800000    # -1.0f

    .line 624
    .line 625
    const/high16 v18, -0x40800000    # -1.0f

    .line 626
    .line 627
    const v13, -0x40f33333    # -0.55f

    .line 628
    .line 629
    .line 630
    const/high16 v15, -0x40800000    # -1.0f

    .line 631
    .line 632
    const v16, -0x4119999a    # -0.45f

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, 0x3ee66666    # 0.45f

    .line 639
    .line 640
    .line 641
    const/high16 v2, -0x40800000    # -1.0f

    .line 642
    .line 643
    const/high16 v4, 0x3f800000    # 1.0f

    .line 644
    .line 645
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/high16 v2, 0x3f800000    # 1.0f

    .line 649
    .line 650
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x4128cccd    # 10.55f

    .line 654
    .line 655
    .line 656
    const/high16 v2, 0x41980000    # 19.0f

    .line 657
    .line 658
    const/high16 v4, 0x41200000    # 10.0f

    .line 659
    .line 660
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    const/16 v16, 0x3800

    .line 671
    .line 672
    const/16 v17, 0x0

    .line 673
    .line 674
    const/high16 v6, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const/4 v7, 0x0

    .line 677
    const/high16 v12, 0x3f800000    # 1.0f

    .line 678
    .line 679
    const/4 v13, 0x0

    .line 680
    const/4 v15, 0x0

    .line 681
    const-string v4, ""

    .line 682
    .line 683
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    sput-object v0, Landroidx/compose/material/icons/sharp/BikeScooterKt;->_bikeScooter:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 692
    .line 693
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    return-object v0
.end method

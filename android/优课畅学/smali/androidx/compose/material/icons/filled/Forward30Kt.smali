.class public final Landroidx/compose/material/icons/filled/Forward30Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _forward30:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getForward30(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/Forward30Kt;->_forward30:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Forward30"

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
    const/high16 v4, 0x41500000    # 13.0f

    .line 71
    .line 72
    const/high16 v6, 0x41900000    # 18.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f400000    # -6.0f

    .line 78
    .line 79
    const/high16 v26, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x4053d70a    # 3.31f

    .line 84
    .line 85
    .line 86
    const v23, -0x3fd3d70a    # -2.69f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40c00000    # 6.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, -0x3fd3d70a    # -2.69f

    .line 97
    .line 98
    .line 99
    const/high16 v6, -0x3f400000    # -6.0f

    .line 100
    .line 101
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x402c28f6    # 2.69f

    .line 105
    .line 106
    .line 107
    const/high16 v6, 0x40c00000    # 6.0f

    .line 108
    .line 109
    const/high16 v7, -0x3f400000    # -6.0f

    .line 110
    .line 111
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v4, 0x40800000    # 4.0f

    .line 115
    .line 116
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v4, 0x40a00000    # 5.0f

    .line 120
    .line 121
    const/high16 v6, -0x3f600000    # -5.0f

    .line 122
    .line 123
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, -0x3f600000    # -5.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v4, 0x40800000    # 4.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v25, -0x3f000000    # -8.0f

    .line 137
    .line 138
    const/high16 v26, 0x41000000    # 8.0f

    .line 139
    .line 140
    const v21, -0x3f728f5c    # -4.42f

    .line 141
    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    const/high16 v23, -0x3f000000    # -8.0f

    .line 146
    .line 147
    const v24, 0x40651eb8    # 3.58f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v25, 0x41000000    # 8.0f

    .line 154
    .line 155
    const/16 v21, 0x0

    .line 156
    .line 157
    const v22, 0x408d70a4    # 4.42f

    .line 158
    .line 159
    .line 160
    const v23, 0x40651eb8    # 3.58f

    .line 161
    .line 162
    .line 163
    const/high16 v24, 0x41000000    # 8.0f

    .line 164
    .line 165
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, -0x3f9ae148    # -3.58f

    .line 169
    .line 170
    .line 171
    const/high16 v6, -0x3f000000    # -8.0f

    .line 172
    .line 173
    const/high16 v7, 0x41000000    # 8.0f

    .line 174
    .line 175
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v4, 0x41900000    # 18.0f

    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    const/16 v16, 0x3800

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/high16 v6, 0x3f800000    # 1.0f

    .line 195
    .line 196
    const/high16 v8, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/4 v7, 0x0

    .line 199
    const/high16 v9, 0x3f800000    # 1.0f

    .line 200
    .line 201
    const/high16 v12, 0x3f800000    # 1.0f

    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const-string v4, ""

    .line 207
    .line 208
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 209
    .line 210
    .line 211
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    const/4 v2, 0x0

    .line 222
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const v4, 0x4120f5c3    # 10.06f

    .line 239
    .line 240
    .line 241
    const v6, 0x4176147b    # 15.38f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v25, -0x40e147ae    # -0.62f

    .line 248
    .line 249
    .line 250
    const v26, -0x40f5c28f    # -0.54f

    .line 251
    .line 252
    .line 253
    const v21, -0x416b851f    # -0.29f

    .line 254
    .line 255
    .line 256
    const/16 v22, 0x0

    .line 257
    .line 258
    const v23, -0x40e147ae    # -0.62f

    .line 259
    .line 260
    .line 261
    const v24, -0x41d1eb85    # -0.17f

    .line 262
    .line 263
    .line 264
    move-object/from16 v20, v2

    .line 265
    .line 266
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v4, 0x410970a4    # 8.59f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, 0x3fb9999a    # 1.45f

    .line 276
    .line 277
    .line 278
    const v26, 0x3f9d70a4    # 1.23f

    .line 279
    .line 280
    .line 281
    const/16 v21, 0x0

    .line 282
    .line 283
    const v22, 0x3f7851ec    # 0.97f

    .line 284
    .line 285
    .line 286
    const v23, 0x3f666666    # 0.9f

    .line 287
    .line 288
    .line 289
    const v24, 0x3f9d70a4    # 1.23f

    .line 290
    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const v25, 0x3fc147ae    # 1.51f

    .line 296
    .line 297
    .line 298
    const/high16 v26, -0x40600000    # -1.25f

    .line 299
    .line 300
    const v21, 0x3f5eb852    # 0.87f

    .line 301
    .line 302
    .line 303
    const/16 v22, 0x0

    .line 304
    .line 305
    const v23, 0x3fc147ae    # 1.51f

    .line 306
    .line 307
    .line 308
    const v24, -0x41147ae1    # -0.46f

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v25, -0x40ca3d71    # -0.71f

    .line 315
    .line 316
    .line 317
    const/high16 v26, -0x40800000    # -1.0f

    .line 318
    .line 319
    const/16 v21, 0x0

    .line 320
    .line 321
    const v22, -0x40d70a3d    # -0.66f

    .line 322
    .line 323
    .line 324
    const v23, -0x4119999a    # -0.45f

    .line 325
    .line 326
    .line 327
    const v24, -0x4099999a    # -0.9f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v25, 0x3f266666    # 0.65f

    .line 334
    .line 335
    .line 336
    const v26, -0x40947ae1    # -0.92f

    .line 337
    .line 338
    .line 339
    const v21, 0x3de147ae    # 0.11f

    .line 340
    .line 341
    .line 342
    const v22, -0x42b33333    # -0.05f

    .line 343
    .line 344
    .line 345
    const v23, 0x3f266666    # 0.65f

    .line 346
    .line 347
    .line 348
    const v24, -0x415c28f6    # -0.32f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v25, -0x4047ae14    # -1.44f

    .line 355
    .line 356
    .line 357
    const v26, -0x4063d70a    # -1.22f

    .line 358
    .line 359
    .line 360
    const/16 v21, 0x0

    .line 361
    .line 362
    const v22, -0x41a8f5c3    # -0.21f

    .line 363
    .line 364
    .line 365
    const v23, -0x42b33333    # -0.05f

    .line 366
    .line 367
    .line 368
    const v24, -0x4063d70a    # -1.22f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v25, -0x404ccccd    # -1.4f

    .line 375
    .line 376
    .line 377
    const v26, 0x3f947ae1    # 1.16f

    .line 378
    .line 379
    .line 380
    const v21, -0x40e147ae    # -0.62f

    .line 381
    .line 382
    .line 383
    const/16 v22, 0x0

    .line 384
    .line 385
    const v23, -0x404ccccd    # -1.4f

    .line 386
    .line 387
    .line 388
    const v24, 0x3eb33333    # 0.35f

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v4, 0x3f59999a    # 0.85f

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v25, 0x3f11eb85    # 0.57f

    .line 401
    .line 402
    .line 403
    const v26, -0x410a3d71    # -0.48f

    .line 404
    .line 405
    .line 406
    const/16 v21, 0x0

    .line 407
    .line 408
    const v22, -0x4151eb85    # -0.34f

    .line 409
    .line 410
    .line 411
    const v23, 0x3e9eb852    # 0.31f

    .line 412
    .line 413
    .line 414
    const v24, -0x410a3d71    # -0.48f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v25, 0x3f147ae1    # 0.58f

    .line 421
    .line 422
    .line 423
    const v26, 0x3f0a3d71    # 0.54f

    .line 424
    .line 425
    .line 426
    const v21, 0x3f170a3d    # 0.59f

    .line 427
    .line 428
    .line 429
    const/16 v22, 0x0

    .line 430
    .line 431
    const v23, 0x3f147ae1    # 0.58f

    .line 432
    .line 433
    .line 434
    const/high16 v24, 0x3f000000    # 0.5f

    .line 435
    .line 436
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v25, -0x40deb852    # -0.63f

    .line 440
    .line 441
    .line 442
    const v26, 0x3f170a3d    # 0.59f

    .line 443
    .line 444
    .line 445
    const/16 v21, 0x0

    .line 446
    .line 447
    const v22, 0x3f051eb8    # 0.52f

    .line 448
    .line 449
    .line 450
    const v23, -0x412e147b    # -0.41f

    .line 451
    .line 452
    .line 453
    const v24, 0x3f170a3d    # 0.59f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v4, 0x4118f5c3    # 9.56f

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v4, 0x3f28f5c3    # 0.66f

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v4, 0x3ee66666    # 0.45f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v25, 0x3f333333    # 0.7f

    .line 478
    .line 479
    .line 480
    const v26, 0x3f23d70a    # 0.64f

    .line 481
    .line 482
    .line 483
    const v21, 0x3f266666    # 0.65f

    .line 484
    .line 485
    .line 486
    const/16 v22, 0x0

    .line 487
    .line 488
    const v23, 0x3f333333    # 0.7f

    .line 489
    .line 490
    .line 491
    const v24, 0x3ed70a3d    # 0.42f

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const v25, 0x4120f5c3    # 10.06f

    .line 498
    .line 499
    .line 500
    const v26, 0x4176147b    # 15.38f

    .line 501
    .line 502
    .line 503
    const v21, 0x412b5c29    # 10.71f

    .line 504
    .line 505
    .line 506
    const v22, 0x4171c28f    # 15.11f

    .line 507
    .line 508
    .line 509
    const/high16 v23, 0x41280000    # 10.5f

    .line 510
    .line 511
    const v24, 0x4176147b    # 15.38f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    const/high16 v6, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/4 v7, 0x0

    .line 527
    const-string v4, ""

    .line 528
    .line 529
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 530
    .line 531
    .line 532
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 537
    .line 538
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 539
    .line 540
    .line 541
    move-result-wide v6

    .line 542
    const/4 v0, 0x0

    .line 543
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 547
    .line 548
    .line 549
    move-result v10

    .line 550
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 551
    .line 552
    .line 553
    move-result v11

    .line 554
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 557
    .line 558
    .line 559
    const v0, 0x415d999a    # 13.85f

    .line 560
    .line 561
    .line 562
    const v2, 0x413ae148    # 11.68f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, -0x4047ae14    # -1.44f

    .line 569
    .line 570
    .line 571
    const v18, 0x3fe8f5c3    # 1.82f

    .line 572
    .line 573
    .line 574
    const v13, -0x41f0a3d7    # -0.14f

    .line 575
    .line 576
    .line 577
    const v15, -0x4047ae14    # -1.44f

    .line 578
    .line 579
    .line 580
    const v16, -0x425c28f6    # -0.08f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v0, 0x3f3d70a4    # 0.74f

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const v17, 0x3fb851ec    # 1.44f

    .line 593
    .line 594
    .line 595
    const/4 v13, 0x0

    .line 596
    const v14, 0x3ff33333    # 1.9f

    .line 597
    .line 598
    .line 599
    const v15, 0x3fa7ae14    # 1.31f

    .line 600
    .line 601
    .line 602
    const v16, 0x3fe8f5c3    # 1.82f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v18, -0x40170a3d    # -1.82f

    .line 609
    .line 610
    .line 611
    const v13, 0x3e0f5c29    # 0.14f

    .line 612
    .line 613
    .line 614
    const/4 v14, 0x0

    .line 615
    const v15, 0x3fb851ec    # 1.44f

    .line 616
    .line 617
    .line 618
    const v16, 0x3db851ec    # 0.09f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v0, 0x41580000    # 13.5f

    .line 625
    .line 626
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v17, 0x415d999a    # 13.85f

    .line 630
    .line 631
    .line 632
    const v18, 0x413ae148    # 11.68f

    .line 633
    .line 634
    .line 635
    const v13, 0x4174cccd    # 15.3f

    .line 636
    .line 637
    .line 638
    const v14, 0x413970a4    # 11.59f

    .line 639
    .line 640
    .line 641
    const v15, 0x415fd70a    # 13.99f

    .line 642
    .line 643
    .line 644
    const v16, 0x413ae148    # 11.68f

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const v0, 0x41673333    # 14.45f

    .line 654
    .line 655
    .line 656
    const v2, 0x4165999a    # 14.35f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v17, -0x40e8f5c3    # -0.59f

    .line 663
    .line 664
    .line 665
    const v18, 0x3f83d70a    # 1.03f

    .line 666
    .line 667
    .line 668
    const/4 v13, 0x0

    .line 669
    const v14, 0x3f451eb8    # 0.77f

    .line 670
    .line 671
    .line 672
    const v15, -0x41a8f5c3    # -0.21f

    .line 673
    .line 674
    .line 675
    const v16, 0x3f83d70a    # 1.03f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v17, -0x40e66666    # -0.6f

    .line 682
    .line 683
    .line 684
    const v18, -0x407c28f6    # -1.03f

    .line 685
    .line 686
    .line 687
    const v13, -0x413d70a4    # -0.38f

    .line 688
    .line 689
    .line 690
    const/4 v14, 0x0

    .line 691
    const v15, -0x40e66666    # -0.6f

    .line 692
    .line 693
    .line 694
    const v16, -0x417ae148    # -0.26f

    .line 695
    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const v0, -0x4087ae14    # -0.97f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v17, 0x3f170a3d    # 0.59f

    .line 707
    .line 708
    .line 709
    const v18, -0x407eb852    # -1.01f

    .line 710
    .line 711
    .line 712
    const/4 v13, 0x0

    .line 713
    const/high16 v14, -0x40c00000    # -0.75f

    .line 714
    .line 715
    const v15, 0x3e6147ae    # 0.22f

    .line 716
    .line 717
    .line 718
    const v16, -0x407eb852    # -1.01f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x3f19999a    # 0.6f

    .line 725
    .line 726
    .line 727
    const v18, 0x3f8147ae    # 1.01f

    .line 728
    .line 729
    .line 730
    const v13, 0x3ec28f5c    # 0.38f

    .line 731
    .line 732
    .line 733
    const/4 v14, 0x0

    .line 734
    const v15, 0x3f19999a    # 0.6f

    .line 735
    .line 736
    .line 737
    const v16, 0x3e851eb8    # 0.26f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v0, 0x4165999a    # 14.35f

    .line 744
    .line 745
    .line 746
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    const/16 v16, 0x3800

    .line 757
    .line 758
    const/16 v17, 0x0

    .line 759
    .line 760
    const/high16 v6, 0x3f800000    # 1.0f

    .line 761
    .line 762
    const/4 v7, 0x0

    .line 763
    const/high16 v12, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/4 v13, 0x0

    .line 766
    const/4 v15, 0x0

    .line 767
    const-string v4, ""

    .line 768
    .line 769
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    sput-object v0, Landroidx/compose/material/icons/filled/Forward30Kt;->_forward30:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 778
    .line 779
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 780
    .line 781
    .line 782
    return-object v0
.end method

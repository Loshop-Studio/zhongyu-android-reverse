.class public final Landroidx/compose/material/icons/outlined/SnowboardingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _snowboarding:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSnowboarding(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SnowboardingKt;->_snowboarding:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Snowboarding"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x40000000    # -2.0f

    .line 102
    .line 103
    const/high16 v18, 0x40000000    # 2.0f

    .line 104
    .line 105
    const v14, 0x3f8ccccd    # 1.1f

    .line 106
    .line 107
    .line 108
    const v15, -0x4099999a    # -0.9f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40833333    # 4.1f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x40400000    # 3.0f

    .line 120
    .line 121
    const/high16 v4, 0x41600000    # 14.0f

    .line 122
    .line 123
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x41ab3333    # 21.4f

    .line 130
    .line 131
    .line 132
    const v2, 0x41a0b852    # 20.09f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, -0x40dc28f6    # -0.64f

    .line 139
    .line 140
    .line 141
    const v18, 0x3e2e147b    # 0.17f

    .line 142
    .line 143
    .line 144
    const v13, -0x41947ae1    # -0.23f

    .line 145
    .line 146
    .line 147
    const v14, -0x42b33333    # -0.05f

    .line 148
    .line 149
    .line 150
    const v15, -0x41147ae1    # -0.46f

    .line 151
    .line 152
    .line 153
    const v16, 0x3ca3d70a    # 0.02f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, -0x3fd9999a    # -2.6f

    .line 160
    .line 161
    .line 162
    const v18, 0x3f2b851f    # 0.67f

    .line 163
    .line 164
    .line 165
    const v13, -0x40cf5c29    # -0.69f

    .line 166
    .line 167
    .line 168
    const v14, 0x3f19999a    # 0.6f

    .line 169
    .line 170
    .line 171
    const v15, -0x402e147b    # -1.64f

    .line 172
    .line 173
    .line 174
    const v16, 0x3f6147ae    # 0.88f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x41880000    # 17.0f

    .line 181
    .line 182
    const v2, 0x41a5851f    # 20.69f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v0, -0x40800000    # -1.0f

    .line 189
    .line 190
    const v2, -0x3f39eb85    # -6.19f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, -0x3fd51eb8    # -2.67f

    .line 197
    .line 198
    .line 199
    const v2, -0x3fab851f    # -3.32f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x3fe66666    # 1.8f

    .line 206
    .line 207
    .line 208
    const v2, -0x3fc70a3d    # -2.89f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v17, 0x41a00000    # 20.0f

    .line 215
    .line 216
    const/high16 v18, 0x41400000    # 12.0f

    .line 217
    .line 218
    const v13, 0x417a147b    # 15.63f

    .line 219
    .line 220
    .line 221
    const v14, 0x412c7ae1    # 10.78f

    .line 222
    .line 223
    .line 224
    const v15, 0x418d70a4    # 17.68f

    .line 225
    .line 226
    .line 227
    const/high16 v16, 0x41400000    # 12.0f

    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, -0x40000000    # -2.0f

    .line 233
    .line 234
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, -0x3f7bd70a    # -4.13f

    .line 238
    .line 239
    .line 240
    const v18, -0x3fd1eb85    # -2.72f

    .line 241
    .line 242
    .line 243
    const v13, -0x40133333    # -1.85f

    .line 244
    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    const v15, -0x3fa3d70a    # -3.44f

    .line 248
    .line 249
    .line 250
    const v16, -0x4070a3d7    # -1.12f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const v0, -0x40fae148    # -0.52f

    .line 257
    .line 258
    .line 259
    const v2, -0x40651eb8    # -1.21f

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v17, 0x415b3333    # 13.7f

    .line 266
    .line 267
    .line 268
    const/high16 v18, 0x40a00000    # 5.0f

    .line 269
    .line 270
    const v13, 0x41728f5c    # 15.16f

    .line 271
    .line 272
    .line 273
    const v14, 0x40b47ae1    # 5.64f

    .line 274
    .line 275
    .line 276
    const v15, 0x4169c28f    # 14.61f

    .line 277
    .line 278
    .line 279
    const/high16 v16, 0x40a00000    # 5.0f

    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v0, 0x41000000    # 8.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v0, 0x40b00000    # 5.5f

    .line 290
    .line 291
    const/high16 v2, 0x41100000    # 9.0f

    .line 292
    .line 293
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x3fd9999a    # 1.7f

    .line 297
    .line 298
    .line 299
    const v2, 0x3f87ae14    # 1.06f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x4111999a    # 9.1f

    .line 306
    .line 307
    .line 308
    const/high16 v2, 0x40e00000    # 7.0f

    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, 0x40166666    # 2.35f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, -0x3fdf5c29    # -2.51f

    .line 320
    .line 321
    .line 322
    const v2, 0x407f5c29    # 3.99f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v17, -0x41800000    # -0.25f

    .line 329
    .line 330
    const v18, 0x3fc28f5c    # 1.52f

    .line 331
    .line 332
    .line 333
    const v13, -0x4170a3d7    # -0.28f

    .line 334
    .line 335
    .line 336
    const v14, 0x3ee66666    # 0.45f

    .line 337
    .line 338
    .line 339
    const v15, -0x41428f5c    # -0.37f

    .line 340
    .line 341
    .line 342
    const/high16 v16, 0x3f800000    # 1.0f

    .line 343
    .line 344
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v0, 0x41180000    # 9.5f

    .line 348
    .line 349
    const/high16 v2, 0x41800000    # 16.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v0, 0x40c00000    # 6.0f

    .line 355
    .line 356
    const v2, 0x4192cccd    # 18.35f

    .line 357
    .line 358
    .line 359
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, -0x410f5c29    # -0.47f

    .line 363
    .line 364
    .line 365
    const v2, -0x42333333    # -0.1f

    .line 366
    .line 367
    .line 368
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const v17, -0x3ff9999a    # -2.1f

    .line 372
    .line 373
    .line 374
    const v18, -0x402a3d71    # -1.67f

    .line 375
    .line 376
    .line 377
    const v13, -0x408a3d71    # -0.96f

    .line 378
    .line 379
    .line 380
    const v14, -0x41b33333    # -0.2f

    .line 381
    .line 382
    .line 383
    const v15, -0x40251eb8    # -1.71f

    .line 384
    .line 385
    .line 386
    const v16, -0x40a66666    # -0.85f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x40fd70a4    # -0.51f

    .line 393
    .line 394
    .line 395
    const v18, -0x4128f5c3    # -0.42f

    .line 396
    .line 397
    .line 398
    const v13, -0x42333333    # -0.1f

    .line 399
    .line 400
    .line 401
    const v14, -0x41a8f5c3    # -0.21f

    .line 402
    .line 403
    .line 404
    const v15, -0x4170a3d7    # -0.28f

    .line 405
    .line 406
    .line 407
    const v16, -0x41428f5c    # -0.37f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x4099999a    # -0.9f

    .line 414
    .line 415
    .line 416
    const v18, 0x3f147ae1    # 0.58f

    .line 417
    .line 418
    .line 419
    const v13, -0x4123d70a    # -0.43f

    .line 420
    .line 421
    .line 422
    const v14, -0x4247ae14    # -0.09f

    .line 423
    .line 424
    .line 425
    const v15, -0x40ae147b    # -0.82f

    .line 426
    .line 427
    .line 428
    const v16, 0x3e4ccccd    # 0.2f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v17, 0x40047ae1    # 2.07f

    .line 435
    .line 436
    .line 437
    const v18, 0x4189999a    # 17.2f

    .line 438
    .line 439
    .line 440
    const v13, 0x3ffd70a4    # 1.98f

    .line 441
    .line 442
    .line 443
    const v14, 0x41870a3d    # 16.88f

    .line 444
    .line 445
    .line 446
    const/high16 v15, 0x40000000    # 2.0f

    .line 447
    .line 448
    const v16, 0x41886666    # 17.05f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v17, 0x4049999a    # 3.15f

    .line 455
    .line 456
    .line 457
    const v18, 0x4020a3d7    # 2.51f

    .line 458
    .line 459
    .line 460
    const v13, 0x3f147ae1    # 0.58f

    .line 461
    .line 462
    .line 463
    const v14, 0x3f9eb852    # 1.24f

    .line 464
    .line 465
    .line 466
    const v15, 0x3fdae148    # 1.71f

    .line 467
    .line 468
    .line 469
    const v16, 0x400ccccd    # 2.2f

    .line 470
    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x414a147b    # 12.63f

    .line 476
    .line 477
    .line 478
    const v2, 0x402c28f6    # 2.69f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const v17, 0x4079999a    # 3.9f

    .line 485
    .line 486
    .line 487
    const v18, -0x407eb852    # -1.01f

    .line 488
    .line 489
    .line 490
    const v13, 0x3fb851ec    # 1.44f

    .line 491
    .line 492
    .line 493
    const v14, 0x3e9eb852    # 0.31f

    .line 494
    .line 495
    .line 496
    const v15, 0x40370a3d    # 2.86f

    .line 497
    .line 498
    .line 499
    const v16, -0x421eb852    # -0.11f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, 0x3e75c28f    # 0.24f

    .line 506
    .line 507
    .line 508
    const v18, -0x412e147b    # -0.41f

    .line 509
    .line 510
    .line 511
    const v13, 0x3e051eb8    # 0.13f

    .line 512
    .line 513
    .line 514
    const v14, -0x421eb852    # -0.11f

    .line 515
    .line 516
    .line 517
    const v15, 0x3e570a3d    # 0.21f

    .line 518
    .line 519
    .line 520
    const v16, -0x417ae148    # -0.26f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, 0x41ab3333    # 21.4f

    .line 527
    .line 528
    .line 529
    const v18, 0x41a0b852    # 20.09f

    .line 530
    .line 531
    .line 532
    const v13, 0x41b07ae1    # 22.06f

    .line 533
    .line 534
    .line 535
    const v14, 0x41a4cccd    # 20.6f

    .line 536
    .line 537
    .line 538
    const v15, 0x41aea3d7    # 21.83f

    .line 539
    .line 540
    .line 541
    const v16, 0x41a170a4    # 20.18f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x419770a4    # 18.93f

    .line 551
    .line 552
    .line 553
    const v2, 0x410bae14    # 8.73f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v0, 0x404147ae    # 3.02f

    .line 560
    .line 561
    .line 562
    const v2, -0x3ffe147b    # -2.03f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v0, -0x411eb852    # -0.44f

    .line 569
    .line 570
    .line 571
    const v2, -0x3fab851f    # -3.32f

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const v0, 0x4035c28f    # 2.84f

    .line 578
    .line 579
    .line 580
    const v2, 0x400147ae    # 2.02f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v0, 0x3f400000    # 0.75f

    .line 587
    .line 588
    const v2, 0x40947ae1    # 4.64f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v0, 0x419770a4    # 18.93f

    .line 595
    .line 596
    .line 597
    const v2, 0x410bae14    # 8.73f

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    const/16 v16, 0x3800

    .line 611
    .line 612
    const/16 v17, 0x0

    .line 613
    .line 614
    const/high16 v6, 0x3f800000    # 1.0f

    .line 615
    .line 616
    const/high16 v8, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/4 v7, 0x0

    .line 619
    const/high16 v9, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/high16 v12, 0x3f800000    # 1.0f

    .line 622
    .line 623
    const/4 v13, 0x0

    .line 624
    const/4 v14, 0x0

    .line 625
    const/4 v15, 0x0

    .line 626
    const-string v4, ""

    .line 627
    .line 628
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    sput-object v0, Landroidx/compose/material/icons/outlined/SnowboardingKt;->_snowboarding:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 637
    .line 638
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    return-object v0
.end method

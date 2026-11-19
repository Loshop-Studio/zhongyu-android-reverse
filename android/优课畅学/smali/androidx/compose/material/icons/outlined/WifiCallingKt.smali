.class public final Landroidx/compose/material/icons/outlined/WifiCallingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiCalling:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiCalling(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/WifiCallingKt;->_wifiCalling:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.WifiCalling"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const v6, 0x417828f6    # 15.51f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v25, -0x3f9b851f    # -3.57f

    .line 79
    .line 80
    .line 81
    const v26, -0x40ee147b    # -0.57f

    .line 82
    .line 83
    .line 84
    const v21, -0x406147ae    # -1.24f

    .line 85
    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const v23, -0x3fe33333    # -2.45f

    .line 90
    .line 91
    .line 92
    const v24, -0x41b33333    # -0.2f

    .line 93
    .line 94
    .line 95
    move-object/from16 v20, v2

    .line 96
    .line 97
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v25, -0x416147ae    # -0.31f

    .line 101
    .line 102
    .line 103
    const v26, -0x42b33333    # -0.05f

    .line 104
    .line 105
    .line 106
    const v21, -0x42333333    # -0.1f

    .line 107
    .line 108
    .line 109
    const v22, -0x42dc28f6    # -0.04f

    .line 110
    .line 111
    .line 112
    const v23, -0x41a8f5c3    # -0.21f

    .line 113
    .line 114
    .line 115
    const v24, -0x42b33333    # -0.05f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v25, -0x40ca3d71    # -0.71f

    .line 122
    .line 123
    .line 124
    const v26, 0x3e947ae1    # 0.29f

    .line 125
    .line 126
    .line 127
    const v21, -0x417ae148    # -0.26f

    .line 128
    .line 129
    .line 130
    const/16 v22, 0x0

    .line 131
    .line 132
    const v23, -0x40fd70a4    # -0.51f

    .line 133
    .line 134
    .line 135
    const v24, 0x3dcccccd    # 0.1f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x400ccccd    # 2.2f

    .line 142
    .line 143
    .line 144
    const v6, -0x3ff33333    # -2.2f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v25, -0x3f2d1eb8    # -6.59f

    .line 151
    .line 152
    .line 153
    const v26, -0x3f2d1eb8    # -6.59f

    .line 154
    .line 155
    .line 156
    const v21, -0x3fcae148    # -2.83f

    .line 157
    .line 158
    .line 159
    const v22, -0x40466666    # -1.45f

    .line 160
    .line 161
    .line 162
    const v23, -0x3f5b3333    # -5.15f

    .line 163
    .line 164
    .line 165
    const v24, -0x3f8f5c29    # -3.76f

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v25, 0x41111eb8    # 9.07f

    .line 175
    .line 176
    .line 177
    const v26, 0x40f23d71    # 7.57f

    .line 178
    .line 179
    .line 180
    const v21, 0x4111999a    # 9.1f

    .line 181
    .line 182
    .line 183
    const v22, 0x4104f5c3    # 8.31f

    .line 184
    .line 185
    .line 186
    const v23, 0x4112e148    # 9.18f

    .line 187
    .line 188
    .line 189
    const v24, 0x40fd70a4    # 7.92f

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v25, 0x41080000    # 8.5f

    .line 196
    .line 197
    const/high16 v26, 0x40800000    # 4.0f

    .line 198
    .line 199
    const v21, 0x410b3333    # 8.7f

    .line 200
    .line 201
    .line 202
    const v22, 0x40ce6666    # 6.45f

    .line 203
    .line 204
    .line 205
    const/high16 v23, 0x41080000    # 8.5f

    .line 206
    .line 207
    const/high16 v24, 0x40a80000    # 5.25f

    .line 208
    .line 209
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v25, -0x40800000    # -1.0f

    .line 213
    .line 214
    const/high16 v26, -0x40800000    # -1.0f

    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    const v22, -0x40f33333    # -0.55f

    .line 219
    .line 220
    .line 221
    const v23, -0x4119999a    # -0.45f

    .line 222
    .line 223
    .line 224
    const/high16 v24, -0x40800000    # -1.0f

    .line 225
    .line 226
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v4, 0x40800000    # 4.0f

    .line 230
    .line 231
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const/high16 v25, 0x40400000    # 3.0f

    .line 235
    .line 236
    const/high16 v26, 0x40800000    # 4.0f

    .line 237
    .line 238
    const v21, 0x405ccccd    # 3.45f

    .line 239
    .line 240
    .line 241
    const/high16 v22, 0x40400000    # 3.0f

    .line 242
    .line 243
    const/high16 v23, 0x40400000    # 3.0f

    .line 244
    .line 245
    const v24, 0x405ccccd    # 3.45f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v25, 0x41880000    # 17.0f

    .line 252
    .line 253
    const/high16 v26, 0x41880000    # 17.0f

    .line 254
    .line 255
    const/16 v21, 0x0

    .line 256
    .line 257
    const v22, 0x41163d71    # 9.39f

    .line 258
    .line 259
    .line 260
    const v23, 0x40f3851f    # 7.61f

    .line 261
    .line 262
    .line 263
    const/high16 v24, 0x41880000    # 17.0f

    .line 264
    .line 265
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v25, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/high16 v26, -0x40800000    # -1.0f

    .line 271
    .line 272
    const v21, 0x3f0ccccd    # 0.55f

    .line 273
    .line 274
    .line 275
    const/16 v22, 0x0

    .line 276
    .line 277
    const/high16 v23, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const v24, -0x4119999a    # -0.45f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, -0x3fa0a3d7    # -3.49f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v25, 0x41a00000    # 20.0f

    .line 292
    .line 293
    const v26, 0x417828f6    # 15.51f

    .line 294
    .line 295
    .line 296
    const/high16 v21, 0x41a80000    # 21.0f

    .line 297
    .line 298
    const v22, 0x417f5c29    # 15.96f

    .line 299
    .line 300
    .line 301
    const v23, 0x41a46666    # 20.55f

    .line 302
    .line 303
    .line 304
    const v24, 0x417828f6    # 15.51f

    .line 305
    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v4, 0x40a0f5c3    # 5.03f

    .line 314
    .line 315
    .line 316
    const/high16 v6, 0x40a00000    # 5.0f

    .line 317
    .line 318
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 322
    .line 323
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, 0x40dfae14    # 6.99f

    .line 327
    .line 328
    .line 329
    const v26, 0x40f2e148    # 7.59f

    .line 330
    .line 331
    .line 332
    const v21, 0x40d33333    # 6.6f

    .line 333
    .line 334
    .line 335
    const v22, 0x40bc7ae1    # 5.89f

    .line 336
    .line 337
    .line 338
    const/high16 v23, 0x40d80000    # 6.75f

    .line 339
    .line 340
    const v24, 0x40d851ec    # 6.76f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v4, -0x40666666    # -1.2f

    .line 347
    .line 348
    .line 349
    const v6, 0x3f99999a    # 1.2f

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v25, 0x40a0f5c3    # 5.03f

    .line 356
    .line 357
    .line 358
    const/high16 v26, 0x40a00000    # 5.0f

    .line 359
    .line 360
    const v21, 0x40ac28f6    # 5.38f

    .line 361
    .line 362
    .line 363
    const v22, 0x40f2e148    # 7.59f

    .line 364
    .line 365
    .line 366
    const v23, 0x40a3d70a    # 5.12f

    .line 367
    .line 368
    .line 369
    const v24, 0x40ca3d71    # 6.32f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v4, 0x41980000    # 19.0f

    .line 379
    .line 380
    const v6, 0x4197c28f    # 18.97f

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v25, -0x3f8ccccd    # -3.8f

    .line 387
    .line 388
    .line 389
    const/high16 v26, -0x40c00000    # -0.75f

    .line 390
    .line 391
    const v21, -0x40570a3d    # -1.32f

    .line 392
    .line 393
    .line 394
    const v22, -0x4247ae14    # -0.09f

    .line 395
    .line 396
    .line 397
    const v23, -0x3fda3d71    # -2.59f

    .line 398
    .line 399
    .line 400
    const v24, -0x414ccccd    # -0.35f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x3f9851ec    # 1.19f

    .line 407
    .line 408
    .line 409
    const v6, -0x4067ae14    # -1.19f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v25, 0x40266666    # 2.6f

    .line 416
    .line 417
    .line 418
    const v26, 0x3ee66666    # 0.45f

    .line 419
    .line 420
    .line 421
    const v21, 0x3f59999a    # 0.85f

    .line 422
    .line 423
    .line 424
    const v22, 0x3e75c28f    # 0.24f

    .line 425
    .line 426
    .line 427
    const v23, 0x3fdc28f6    # 1.72f

    .line 428
    .line 429
    .line 430
    const v24, 0x3ec7ae14    # 0.39f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v4, 0x4197c28f    # 18.97f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    const/16 v16, 0x3800

    .line 450
    .line 451
    const/16 v17, 0x0

    .line 452
    .line 453
    const/high16 v6, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const/high16 v8, 0x3f800000    # 1.0f

    .line 456
    .line 457
    const/4 v7, 0x0

    .line 458
    const/high16 v9, 0x3f800000    # 1.0f

    .line 459
    .line 460
    const/high16 v12, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/4 v13, 0x0

    .line 463
    const/4 v14, 0x0

    .line 464
    const/4 v15, 0x0

    .line 465
    const-string v4, ""

    .line 466
    .line 467
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 468
    .line 469
    .line 470
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 475
    .line 476
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 477
    .line 478
    .line 479
    move-result-wide v6

    .line 480
    const/4 v0, 0x0

    .line 481
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 485
    .line 486
    .line 487
    move-result v10

    .line 488
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 489
    .line 490
    .line 491
    move-result v11

    .line 492
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 495
    .line 496
    .line 497
    const v0, 0x409e6666    # 4.95f

    .line 498
    .line 499
    .line 500
    const/high16 v2, 0x41b00000    # 22.0f

    .line 501
    .line 502
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v17, 0x41840000    # 16.5f

    .line 506
    .line 507
    const/high16 v18, 0x40400000    # 3.0f

    .line 508
    .line 509
    const v13, 0x41ae51ec    # 21.79f

    .line 510
    .line 511
    .line 512
    const v14, 0x4098f5c3    # 4.78f

    .line 513
    .line 514
    .line 515
    const v15, 0x419d5c29    # 19.67f

    .line 516
    .line 517
    .line 518
    const/high16 v16, 0x40400000    # 3.0f

    .line 519
    .line 520
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v17, -0x3f500000    # -5.5f

    .line 524
    .line 525
    const v18, 0x3ff9999a    # 1.95f

    .line 526
    .line 527
    .line 528
    const v13, -0x3fb47ae1    # -3.18f

    .line 529
    .line 530
    .line 531
    const/4 v14, 0x0

    .line 532
    const v15, -0x3f56b852    # -5.29f

    .line 533
    .line 534
    .line 535
    const v16, 0x3fe3d70a    # 1.78f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const/high16 v0, 0x41840000    # 16.5f

    .line 542
    .line 543
    const/high16 v2, 0x41400000    # 12.0f

    .line 544
    .line 545
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, 0x409e6666    # 4.95f

    .line 549
    .line 550
    .line 551
    const/high16 v2, 0x41b00000    # 22.0f

    .line 552
    .line 553
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 560
    .line 561
    .line 562
    move-result-object v2

    .line 563
    const/16 v16, 0x3800

    .line 564
    .line 565
    const/16 v17, 0x0

    .line 566
    .line 567
    const/high16 v6, 0x3f800000    # 1.0f

    .line 568
    .line 569
    const/4 v7, 0x0

    .line 570
    const/high16 v12, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v13, 0x0

    .line 573
    const/4 v15, 0x0

    .line 574
    const-string v4, ""

    .line 575
    .line 576
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    sput-object v0, Landroidx/compose/material/icons/outlined/WifiCallingKt;->_wifiCalling:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 585
    .line 586
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    return-object v0
.end method

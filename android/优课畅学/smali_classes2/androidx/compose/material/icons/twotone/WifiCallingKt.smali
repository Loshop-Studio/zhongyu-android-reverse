.class public final Landroidx/compose/material/icons/twotone/WifiCallingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiCalling:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiCalling(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/WifiCallingKt;->_wifiCalling:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.WifiCalling"

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
    const v4, 0x4191ae14    # 18.21f

    .line 71
    .line 72
    .line 73
    const v6, 0x41733333    # 15.2f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x40733333    # 3.8f

    .line 80
    .line 81
    .line 82
    const/high16 v26, 0x3f400000    # 0.75f

    .line 83
    .line 84
    const v21, 0x3f99999a    # 1.2f

    .line 85
    .line 86
    .line 87
    const v22, 0x3ed1eb85    # 0.41f

    .line 88
    .line 89
    .line 90
    const v23, 0x401eb852    # 2.48f

    .line 91
    .line 92
    .line 93
    const v24, 0x3f2b851f    # 0.67f

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
    const v4, -0x404147ae    # -1.49f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v25, -0x3fd9999a    # -2.6f

    .line 108
    .line 109
    .line 110
    const v26, -0x4119999a    # -0.45f

    .line 111
    .line 112
    .line 113
    const v21, -0x409eb852    # -0.88f

    .line 114
    .line 115
    .line 116
    const v22, -0x4270a3d7    # -0.07f

    .line 117
    .line 118
    .line 119
    const/high16 v23, -0x40200000    # -1.75f

    .line 120
    .line 121
    const v24, -0x419eb852    # -0.22f

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x4191ae14    # 18.21f

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const/16 v16, 0x3800

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    const v6, 0x3e99999a    # 0.3f

    .line 145
    .line 146
    .line 147
    const v8, 0x3e99999a    # 0.3f

    .line 148
    .line 149
    .line 150
    const/4 v7, 0x0

    .line 151
    const/high16 v9, 0x3f800000    # 1.0f

    .line 152
    .line 153
    const/high16 v12, 0x3f800000    # 1.0f

    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const/4 v14, 0x0

    .line 157
    const/4 v15, 0x0

    .line 158
    const-string v4, ""

    .line 159
    .line 160
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 161
    .line 162
    .line 163
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 168
    .line 169
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 170
    .line 171
    .line 172
    move-result-wide v6

    .line 173
    const/4 v2, 0x0

    .line 174
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 188
    .line 189
    .line 190
    const v4, 0x40d147ae    # 6.54f

    .line 191
    .line 192
    .line 193
    const/high16 v6, 0x40a00000    # 5.0f

    .line 194
    .line 195
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v4, -0x40400000    # -1.5f

    .line 199
    .line 200
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v25, 0x3f400000    # 0.75f

    .line 204
    .line 205
    const v26, 0x40733333    # 3.8f

    .line 206
    .line 207
    .line 208
    const v21, 0x3db851ec    # 0.09f

    .line 209
    .line 210
    .line 211
    const v22, 0x3fa8f5c3    # 1.32f

    .line 212
    .line 213
    .line 214
    const v23, 0x3eb33333    # 0.35f

    .line 215
    .line 216
    .line 217
    const v24, 0x4025c28f    # 2.59f

    .line 218
    .line 219
    .line 220
    move-object/from16 v20, v2

    .line 221
    .line 222
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const v4, -0x40666666    # -1.2f

    .line 226
    .line 227
    .line 228
    const v6, 0x3f99999a    # 1.2f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v25, 0x40d147ae    # 6.54f

    .line 235
    .line 236
    .line 237
    const/high16 v26, 0x40a00000    # 5.0f

    .line 238
    .line 239
    const/high16 v21, 0x40d80000    # 6.75f

    .line 240
    .line 241
    const v22, 0x40d851ec    # 6.76f

    .line 242
    .line 243
    .line 244
    const v23, 0x40d33333    # 6.6f

    .line 245
    .line 246
    .line 247
    const v24, 0x40bc7ae1    # 5.89f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    const v6, 0x3e99999a    # 0.3f

    .line 261
    .line 262
    .line 263
    const/4 v7, 0x0

    .line 264
    const-string v4, ""

    .line 265
    .line 266
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 267
    .line 268
    .line 269
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 274
    .line 275
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 276
    .line 277
    .line 278
    move-result-wide v6

    .line 279
    const/4 v2, 0x0

    .line 280
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x41a00000    # 20.0f

    .line 297
    .line 298
    const v6, 0x417828f6    # 15.51f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v25, -0x3f9b851f    # -3.57f

    .line 305
    .line 306
    .line 307
    const v26, -0x40ee147b    # -0.57f

    .line 308
    .line 309
    .line 310
    const v21, -0x406147ae    # -1.24f

    .line 311
    .line 312
    .line 313
    const/16 v22, 0x0

    .line 314
    .line 315
    const v23, -0x3fe33333    # -2.45f

    .line 316
    .line 317
    .line 318
    const v24, -0x41b33333    # -0.2f

    .line 319
    .line 320
    .line 321
    move-object/from16 v20, v2

    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v25, -0x416147ae    # -0.31f

    .line 327
    .line 328
    .line 329
    const v26, -0x42b33333    # -0.05f

    .line 330
    .line 331
    .line 332
    const v21, -0x42333333    # -0.1f

    .line 333
    .line 334
    .line 335
    const v22, -0x42dc28f6    # -0.04f

    .line 336
    .line 337
    .line 338
    const v23, -0x41a8f5c3    # -0.21f

    .line 339
    .line 340
    .line 341
    const v24, -0x42b33333    # -0.05f

    .line 342
    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v25, -0x40ca3d71    # -0.71f

    .line 348
    .line 349
    .line 350
    const v26, 0x3e947ae1    # 0.29f

    .line 351
    .line 352
    .line 353
    const v21, -0x417ae148    # -0.26f

    .line 354
    .line 355
    .line 356
    const/16 v22, 0x0

    .line 357
    .line 358
    const v23, -0x40fd70a4    # -0.51f

    .line 359
    .line 360
    .line 361
    const v24, 0x3dcccccd    # 0.1f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v4, 0x400ccccd    # 2.2f

    .line 368
    .line 369
    .line 370
    const v6, -0x3ff33333    # -2.2f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v25, -0x3f2d1eb8    # -6.59f

    .line 377
    .line 378
    .line 379
    const v26, -0x3f2d1eb8    # -6.59f

    .line 380
    .line 381
    .line 382
    const v21, -0x3fcae148    # -2.83f

    .line 383
    .line 384
    .line 385
    const v22, -0x40466666    # -1.45f

    .line 386
    .line 387
    .line 388
    const v23, -0x3f5b3333    # -5.15f

    .line 389
    .line 390
    .line 391
    const v24, -0x3f8f5c29    # -3.76f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v25, 0x41111eb8    # 9.07f

    .line 401
    .line 402
    .line 403
    const v26, 0x40f23d71    # 7.57f

    .line 404
    .line 405
    .line 406
    const v21, 0x4111999a    # 9.1f

    .line 407
    .line 408
    .line 409
    const v22, 0x4104f5c3    # 8.31f

    .line 410
    .line 411
    .line 412
    const v23, 0x4112e148    # 9.18f

    .line 413
    .line 414
    .line 415
    const v24, 0x40fd70a4    # 7.92f

    .line 416
    .line 417
    .line 418
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v25, 0x41080000    # 8.5f

    .line 422
    .line 423
    const/high16 v26, 0x40800000    # 4.0f

    .line 424
    .line 425
    const v21, 0x410b3333    # 8.7f

    .line 426
    .line 427
    .line 428
    const v22, 0x40ce6666    # 6.45f

    .line 429
    .line 430
    .line 431
    const/high16 v23, 0x41080000    # 8.5f

    .line 432
    .line 433
    const/high16 v24, 0x40a80000    # 5.25f

    .line 434
    .line 435
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v25, -0x40800000    # -1.0f

    .line 439
    .line 440
    const/high16 v26, -0x40800000    # -1.0f

    .line 441
    .line 442
    const/16 v21, 0x0

    .line 443
    .line 444
    const v22, -0x40f33333    # -0.55f

    .line 445
    .line 446
    .line 447
    const v23, -0x4119999a    # -0.45f

    .line 448
    .line 449
    .line 450
    const/high16 v24, -0x40800000    # -1.0f

    .line 451
    .line 452
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v4, 0x40800000    # 4.0f

    .line 456
    .line 457
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v25, 0x40400000    # 3.0f

    .line 461
    .line 462
    const/high16 v26, 0x40800000    # 4.0f

    .line 463
    .line 464
    const v21, 0x405ccccd    # 3.45f

    .line 465
    .line 466
    .line 467
    const/high16 v22, 0x40400000    # 3.0f

    .line 468
    .line 469
    const/high16 v23, 0x40400000    # 3.0f

    .line 470
    .line 471
    const v24, 0x405ccccd    # 3.45f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v25, 0x41880000    # 17.0f

    .line 478
    .line 479
    const/high16 v26, 0x41880000    # 17.0f

    .line 480
    .line 481
    const/16 v21, 0x0

    .line 482
    .line 483
    const v22, 0x41163d71    # 9.39f

    .line 484
    .line 485
    .line 486
    const v23, 0x40f3851f    # 7.61f

    .line 487
    .line 488
    .line 489
    const/high16 v24, 0x41880000    # 17.0f

    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v25, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/high16 v26, -0x40800000    # -1.0f

    .line 497
    .line 498
    const v21, 0x3f0ccccd    # 0.55f

    .line 499
    .line 500
    .line 501
    const/16 v22, 0x0

    .line 502
    .line 503
    const/high16 v23, 0x3f800000    # 1.0f

    .line 504
    .line 505
    const v24, -0x4119999a    # -0.45f

    .line 506
    .line 507
    .line 508
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v4, -0x3fa0a3d7    # -3.49f

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const/high16 v25, 0x41a00000    # 20.0f

    .line 518
    .line 519
    const v26, 0x417828f6    # 15.51f

    .line 520
    .line 521
    .line 522
    const/high16 v21, 0x41a80000    # 21.0f

    .line 523
    .line 524
    const v22, 0x417f5c29    # 15.96f

    .line 525
    .line 526
    .line 527
    const v23, 0x41a46666    # 20.55f

    .line 528
    .line 529
    .line 530
    const v24, 0x417828f6    # 15.51f

    .line 531
    .line 532
    .line 533
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 537
    .line 538
    .line 539
    const v4, 0x40a0f5c3    # 5.03f

    .line 540
    .line 541
    .line 542
    const/high16 v6, 0x40a00000    # 5.0f

    .line 543
    .line 544
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 548
    .line 549
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v25, 0x40dfae14    # 6.99f

    .line 553
    .line 554
    .line 555
    const v26, 0x40f2e148    # 7.59f

    .line 556
    .line 557
    .line 558
    const v21, 0x40d33333    # 6.6f

    .line 559
    .line 560
    .line 561
    const v22, 0x40bc7ae1    # 5.89f

    .line 562
    .line 563
    .line 564
    const/high16 v23, 0x40d80000    # 6.75f

    .line 565
    .line 566
    const v24, 0x40d851ec    # 6.76f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v4, -0x40666666    # -1.2f

    .line 573
    .line 574
    .line 575
    const v6, 0x3f99999a    # 1.2f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v25, 0x40a0f5c3    # 5.03f

    .line 582
    .line 583
    .line 584
    const/high16 v26, 0x40a00000    # 5.0f

    .line 585
    .line 586
    const v21, 0x40ac28f6    # 5.38f

    .line 587
    .line 588
    .line 589
    const v22, 0x40f2e148    # 7.59f

    .line 590
    .line 591
    .line 592
    const v23, 0x40a3d70a    # 5.12f

    .line 593
    .line 594
    .line 595
    const v24, 0x40ca3d71    # 6.32f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v4, 0x41980000    # 19.0f

    .line 605
    .line 606
    const v6, 0x4197c28f    # 18.97f

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v25, -0x3f8ccccd    # -3.8f

    .line 613
    .line 614
    .line 615
    const/high16 v26, -0x40c00000    # -0.75f

    .line 616
    .line 617
    const v21, -0x40570a3d    # -1.32f

    .line 618
    .line 619
    .line 620
    const v22, -0x4247ae14    # -0.09f

    .line 621
    .line 622
    .line 623
    const v23, -0x3fda3d71    # -2.59f

    .line 624
    .line 625
    .line 626
    const v24, -0x414ccccd    # -0.35f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const v4, 0x3f9851ec    # 1.19f

    .line 633
    .line 634
    .line 635
    const v6, -0x4067ae14    # -1.19f

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v25, 0x40266666    # 2.6f

    .line 642
    .line 643
    .line 644
    const v26, 0x3ee66666    # 0.45f

    .line 645
    .line 646
    .line 647
    const v21, 0x3f59999a    # 0.85f

    .line 648
    .line 649
    .line 650
    const v22, 0x3e75c28f    # 0.24f

    .line 651
    .line 652
    .line 653
    const v23, 0x3fdc28f6    # 1.72f

    .line 654
    .line 655
    .line 656
    const v24, 0x3ec7ae14    # 0.39f

    .line 657
    .line 658
    .line 659
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v4, 0x4197c28f    # 18.97f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    const/high16 v6, 0x3f800000    # 1.0f

    .line 676
    .line 677
    const/high16 v8, 0x3f800000    # 1.0f

    .line 678
    .line 679
    const/4 v7, 0x0

    .line 680
    const-string v4, ""

    .line 681
    .line 682
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 683
    .line 684
    .line 685
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 686
    .line 687
    .line 688
    move-result v3

    .line 689
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 690
    .line 691
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 692
    .line 693
    .line 694
    move-result-wide v6

    .line 695
    const/4 v0, 0x0

    .line 696
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 697
    .line 698
    .line 699
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 700
    .line 701
    .line 702
    move-result v10

    .line 703
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 704
    .line 705
    .line 706
    move-result v11

    .line 707
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 710
    .line 711
    .line 712
    const v0, 0x409e6666    # 4.95f

    .line 713
    .line 714
    .line 715
    const/high16 v2, 0x41b00000    # 22.0f

    .line 716
    .line 717
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const/high16 v17, 0x41840000    # 16.5f

    .line 721
    .line 722
    const/high16 v18, 0x40400000    # 3.0f

    .line 723
    .line 724
    const v13, 0x41ae51ec    # 21.79f

    .line 725
    .line 726
    .line 727
    const v14, 0x4098f5c3    # 4.78f

    .line 728
    .line 729
    .line 730
    const v15, 0x419d5c29    # 19.67f

    .line 731
    .line 732
    .line 733
    const/high16 v16, 0x40400000    # 3.0f

    .line 734
    .line 735
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v17, -0x3f500000    # -5.5f

    .line 739
    .line 740
    const v18, 0x3ff9999a    # 1.95f

    .line 741
    .line 742
    .line 743
    const v13, -0x3fb47ae1    # -3.18f

    .line 744
    .line 745
    .line 746
    const/4 v14, 0x0

    .line 747
    const v15, -0x3f56b852    # -5.29f

    .line 748
    .line 749
    .line 750
    const v16, 0x3fe3d70a    # 1.78f

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const/high16 v0, 0x41840000    # 16.5f

    .line 757
    .line 758
    const/high16 v2, 0x41400000    # 12.0f

    .line 759
    .line 760
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v0, 0x409e6666    # 4.95f

    .line 764
    .line 765
    .line 766
    const/high16 v2, 0x41b00000    # 22.0f

    .line 767
    .line 768
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    const/16 v16, 0x3800

    .line 779
    .line 780
    const/16 v17, 0x0

    .line 781
    .line 782
    const/high16 v6, 0x3f800000    # 1.0f

    .line 783
    .line 784
    const/4 v7, 0x0

    .line 785
    const/high16 v12, 0x3f800000    # 1.0f

    .line 786
    .line 787
    const/4 v13, 0x0

    .line 788
    const/4 v15, 0x0

    .line 789
    const-string v4, ""

    .line 790
    .line 791
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    sput-object v0, Landroidx/compose/material/icons/twotone/WifiCallingKt;->_wifiCalling:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 800
    .line 801
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 802
    .line 803
    .line 804
    return-object v0
.end method

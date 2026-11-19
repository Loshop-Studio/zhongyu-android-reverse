.class public final Landroidx/compose/material/icons/twotone/TouchAppKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _touchApp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTouchApp(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TouchAppKt;->_touchApp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.TouchApp"

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
    const v4, 0x4191851f    # 18.19f

    .line 71
    .line 72
    .line 73
    const v6, 0x41470a3d    # 12.44f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fb0a3d7    # -3.24f

    .line 80
    .line 81
    .line 82
    const v6, -0x4030a3d7    # -1.62f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, 0x4007ae14    # 2.12f

    .line 89
    .line 90
    .line 91
    const v26, -0x3f75c28f    # -4.32f

    .line 92
    .line 93
    .line 94
    const v21, 0x3fa51eb8    # 1.29f

    .line 95
    .line 96
    .line 97
    const/high16 v22, -0x40800000    # -1.0f

    .line 98
    .line 99
    const v23, 0x4007ae14    # 2.12f

    .line 100
    .line 101
    .line 102
    const v24, -0x3fdc28f6    # -2.56f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const/high16 v25, -0x3f500000    # -5.5f

    .line 111
    .line 112
    const/high16 v26, -0x3f500000    # -5.5f

    .line 113
    .line 114
    const/16 v21, 0x0

    .line 115
    .line 116
    const v22, -0x3fbe147b    # -3.03f

    .line 117
    .line 118
    .line 119
    const v23, -0x3fe1eb85    # -2.47f

    .line 120
    .line 121
    .line 122
    const/high16 v24, -0x3f500000    # -5.5f

    .line 123
    .line 124
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v4, 0x401e147b    # 2.47f

    .line 128
    .line 129
    .line 130
    const/high16 v6, 0x40b00000    # 5.5f

    .line 131
    .line 132
    const/high16 v7, -0x3f500000    # -5.5f

    .line 133
    .line 134
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v25, 0x40400000    # 3.0f

    .line 138
    .line 139
    const v26, 0x409c7ae1    # 4.89f

    .line 140
    .line 141
    .line 142
    const v22, 0x400851ec    # 2.13f

    .line 143
    .line 144
    .line 145
    const v23, 0x3f9c28f6    # 1.22f

    .line 146
    .line 147
    .line 148
    const v24, 0x407eb852    # 3.98f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x4050a3d7    # 3.26f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v25, -0x3fef5c29    # -2.26f

    .line 161
    .line 162
    .line 163
    const v26, -0x411eb852    # -0.44f

    .line 164
    .line 165
    .line 166
    const v21, -0x3ffae148    # -2.08f

    .line 167
    .line 168
    .line 169
    const v22, -0x411eb852    # -0.44f

    .line 170
    .line 171
    .line 172
    const v23, -0x3fff5c29    # -2.01f

    .line 173
    .line 174
    .line 175
    const v24, -0x411eb852    # -0.44f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v25, -0x404b851f    # -1.41f

    .line 182
    .line 183
    .line 184
    const v26, 0x3f170a3d    # 0.59f

    .line 185
    .line 186
    .line 187
    const v21, -0x40f851ec    # -0.53f

    .line 188
    .line 189
    .line 190
    const/16 v22, 0x0

    .line 191
    .line 192
    const v23, -0x407c28f6    # -1.03f

    .line 193
    .line 194
    .line 195
    const v24, 0x3e570a3d    # 0.21f

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v4, 0x40800000    # 4.0f

    .line 202
    .line 203
    const v6, 0x4181c28f    # 16.22f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v4, 0x40a2e148    # 5.09f

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v25, 0x412bd70a    # 10.74f

    .line 216
    .line 217
    .line 218
    const/high16 v26, 0x41b00000    # 22.0f

    .line 219
    .line 220
    const v21, 0x411851ec    # 9.52f

    .line 221
    .line 222
    .line 223
    const/high16 v22, 0x41ae0000    # 21.75f

    .line 224
    .line 225
    const v23, 0x4121eb85    # 10.12f

    .line 226
    .line 227
    .line 228
    const/high16 v24, 0x41b00000    # 22.0f

    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v4, 0x40c9999a    # 6.3f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v25, 0x3ffc28f6    # 1.97f

    .line 240
    .line 241
    .line 242
    const v26, -0x402a3d71    # -1.67f

    .line 243
    .line 244
    .line 245
    const v21, 0x3f7ae148    # 0.98f

    .line 246
    .line 247
    .line 248
    const/16 v22, 0x0

    .line 249
    .line 250
    const v23, 0x3fe7ae14    # 1.81f

    .line 251
    .line 252
    .line 253
    const v24, -0x40cccccd    # -0.7f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v4, -0x3f6947ae    # -4.71f

    .line 260
    .line 261
    .line 262
    const v6, 0x3f4ccccd    # 0.8f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const v25, 0x4191851f    # 18.19f

    .line 269
    .line 270
    .line 271
    const v26, 0x41470a3d    # 12.44f

    .line 272
    .line 273
    .line 274
    const v21, 0x41a03d71    # 20.03f

    .line 275
    .line 276
    .line 277
    const v22, 0x41651eb8    # 14.32f

    .line 278
    .line 279
    .line 280
    const v23, 0x419b0a3d    # 19.38f

    .line 281
    .line 282
    .line 283
    const v24, 0x4150a3d7    # 13.04f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v4, 0x41011eb8    # 8.07f

    .line 293
    .line 294
    .line 295
    const/high16 v6, 0x40d00000    # 6.5f

    .line 296
    .line 297
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v25, 0x40600000    # 3.5f

    .line 301
    .line 302
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 303
    .line 304
    const/16 v21, 0x0

    .line 305
    .line 306
    const v22, -0x4008f5c3    # -1.93f

    .line 307
    .line 308
    .line 309
    const v23, 0x3fc8f5c3    # 1.57f

    .line 310
    .line 311
    .line 312
    const/high16 v24, -0x3fa00000    # -3.5f

    .line 313
    .line 314
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v4, 0x3fc8f5c3    # 1.57f

    .line 318
    .line 319
    .line 320
    const/high16 v6, 0x40600000    # 3.5f

    .line 321
    .line 322
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v25, -0x40800000    # -1.0f

    .line 326
    .line 327
    const v26, 0x401c28f6    # 2.44f

    .line 328
    .line 329
    .line 330
    const v22, 0x3f733333    # 0.95f

    .line 331
    .line 332
    .line 333
    const v23, -0x413d70a4    # -0.38f

    .line 334
    .line 335
    .line 336
    const v24, 0x3fe7ae14    # 1.81f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v4, 0x40d00000    # 6.5f

    .line 343
    .line 344
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 348
    .line 349
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 350
    .line 351
    const v22, -0x404f5c29    # -1.38f

    .line 352
    .line 353
    .line 354
    const v23, -0x4070a3d7    # -1.12f

    .line 355
    .line 356
    .line 357
    const/high16 v24, -0x3fe00000    # -2.5f

    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v26, 0x40200000    # 2.5f

    .line 363
    .line 364
    const v21, -0x404f5c29    # -1.38f

    .line 365
    .line 366
    .line 367
    const/16 v22, 0x0

    .line 368
    .line 369
    const/high16 v23, -0x3fe00000    # -2.5f

    .line 370
    .line 371
    const v24, 0x3f8f5c29    # 1.12f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v4, 0x401c28f6    # 2.44f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v25, 0x41011eb8    # 8.07f

    .line 384
    .line 385
    .line 386
    const/high16 v26, 0x40d00000    # 6.5f

    .line 387
    .line 388
    const v21, 0x41073333    # 8.45f

    .line 389
    .line 390
    .line 391
    const v22, 0x4104f5c3    # 8.31f

    .line 392
    .line 393
    .line 394
    const v23, 0x41011eb8    # 8.07f

    .line 395
    .line 396
    .line 397
    const v24, 0x40ee6666    # 7.45f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v4, 0x418eb852    # 17.84f

    .line 407
    .line 408
    .line 409
    const v6, 0x4174a3d7    # 15.29f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v4, 0x418851ec    # 17.04f

    .line 416
    .line 417
    .line 418
    const/high16 v6, 0x41a00000    # 20.0f

    .line 419
    .line 420
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v4, -0x3f366666    # -6.3f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v25, -0x418a3d71    # -0.24f

    .line 430
    .line 431
    .line 432
    const v26, -0x42333333    # -0.1f

    .line 433
    .line 434
    .line 435
    const v21, -0x4247ae14    # -0.09f

    .line 436
    .line 437
    .line 438
    const/16 v22, 0x0

    .line 439
    .line 440
    const v23, -0x41d1eb85    # -0.17f

    .line 441
    .line 442
    .line 443
    const v24, -0x42dc28f6    # -0.04f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v4, -0x3f947ae1    # -3.68f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v4, 0x40880000    # 4.25f

    .line 456
    .line 457
    const v6, 0x3f63d70a    # 0.89f

    .line 458
    .line 459
    .line 460
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v4, 0x40d00000    # 6.5f

    .line 464
    .line 465
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/high16 v25, 0x3f000000    # 0.5f

    .line 469
    .line 470
    const/high16 v26, -0x41000000    # -0.5f

    .line 471
    .line 472
    const/16 v21, 0x0

    .line 473
    .line 474
    const v22, -0x4170a3d7    # -0.28f

    .line 475
    .line 476
    .line 477
    const v23, 0x3e6147ae    # 0.22f

    .line 478
    .line 479
    .line 480
    const/high16 v24, -0x41000000    # -0.5f

    .line 481
    .line 482
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const/high16 v26, 0x3f000000    # 0.5f

    .line 486
    .line 487
    const v21, 0x3e8f5c29    # 0.28f

    .line 488
    .line 489
    .line 490
    const/16 v22, 0x0

    .line 491
    .line 492
    const/high16 v23, 0x3f000000    # 0.5f

    .line 493
    .line 494
    const v24, 0x3e6147ae    # 0.22f

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v4, 0x40c00000    # 6.0f

    .line 501
    .line 502
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v4, 0x3fe147ae    # 1.76f

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 509
    .line 510
    .line 511
    const v4, 0x405d70a4    # 3.46f

    .line 512
    .line 513
    .line 514
    const v6, 0x3fdd70a4    # 1.73f

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v25, 0x418eb852    # 17.84f

    .line 521
    .line 522
    .line 523
    const v26, 0x4174a3d7    # 15.29f

    .line 524
    .line 525
    .line 526
    const v21, 0x418d851f    # 17.69f

    .line 527
    .line 528
    .line 529
    const v22, 0x4166e148    # 14.43f

    .line 530
    .line 531
    .line 532
    const v23, 0x418f47ae    # 17.91f

    .line 533
    .line 534
    .line 535
    const v24, 0x416dc28f    # 14.86f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    const/16 v16, 0x3800

    .line 549
    .line 550
    const/16 v17, 0x0

    .line 551
    .line 552
    const/high16 v6, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const/high16 v8, 0x3f800000    # 1.0f

    .line 555
    .line 556
    const/4 v7, 0x0

    .line 557
    const/high16 v9, 0x3f800000    # 1.0f

    .line 558
    .line 559
    const/high16 v12, 0x3f800000    # 1.0f

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const/4 v14, 0x0

    .line 563
    const/4 v15, 0x0

    .line 564
    const-string v4, ""

    .line 565
    .line 566
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 567
    .line 568
    .line 569
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 574
    .line 575
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 576
    .line 577
    .line 578
    move-result-wide v6

    .line 579
    const/4 v0, 0x0

    .line 580
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 584
    .line 585
    .line 586
    move-result v10

    .line 587
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 588
    .line 589
    .line 590
    move-result v11

    .line 591
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 594
    .line 595
    .line 596
    const v0, 0x418a6666    # 17.3f

    .line 597
    .line 598
    .line 599
    const v2, 0x4163ae14    # 14.23f

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, -0x3fa28f5c    # -3.46f

    .line 606
    .line 607
    .line 608
    const v2, -0x40228f5c    # -1.73f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v0, -0x401d70a4    # -1.77f

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, -0x3f400000    # -6.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v17, -0x41000000    # -0.5f

    .line 626
    .line 627
    const/high16 v18, -0x41000000    # -0.5f

    .line 628
    .line 629
    const v14, -0x4170a3d7    # -0.28f

    .line 630
    .line 631
    .line 632
    const v15, -0x419eb852    # -0.22f

    .line 633
    .line 634
    .line 635
    const/high16 v16, -0x41000000    # -0.5f

    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const/high16 v18, 0x3f000000    # 0.5f

    .line 641
    .line 642
    const v13, -0x4170a3d7    # -0.28f

    .line 643
    .line 644
    .line 645
    const/4 v14, 0x0

    .line 646
    const/high16 v15, -0x41000000    # -0.5f

    .line 647
    .line 648
    const v16, 0x3e6147ae    # 0.22f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v0, 0x4129c28f    # 10.61f

    .line 655
    .line 656
    .line 657
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v0, -0x3f780000    # -4.25f

    .line 661
    .line 662
    const v2, -0x409c28f6    # -0.89f

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v0, 0x406b851f    # 3.68f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v17, 0x3e75c28f    # 0.24f

    .line 675
    .line 676
    .line 677
    const v18, 0x3dcccccd    # 0.1f

    .line 678
    .line 679
    .line 680
    const v13, 0x3d75c28f    # 0.06f

    .line 681
    .line 682
    .line 683
    const v14, 0x3d75c28f    # 0.06f

    .line 684
    .line 685
    .line 686
    const v15, 0x3e19999a    # 0.15f

    .line 687
    .line 688
    .line 689
    const v16, 0x3dcccccd    # 0.1f

    .line 690
    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    const v0, 0x40c9999a    # 6.3f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, -0x3f6947ae    # -4.71f

    .line 702
    .line 703
    .line 704
    const v2, 0x3f4ccccd    # 0.8f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, 0x418a6666    # 17.3f

    .line 711
    .line 712
    .line 713
    const v18, 0x4163ae14    # 14.23f

    .line 714
    .line 715
    .line 716
    const v13, 0x418f47ae    # 17.91f

    .line 717
    .line 718
    .line 719
    const v14, 0x416dc28f    # 14.86f

    .line 720
    .line 721
    .line 722
    const v15, 0x418d851f    # 17.69f

    .line 723
    .line 724
    .line 725
    const v16, 0x4166e148    # 14.43f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    const/16 v16, 0x3800

    .line 739
    .line 740
    const/16 v17, 0x0

    .line 741
    .line 742
    const v6, 0x3e99999a    # 0.3f

    .line 743
    .line 744
    .line 745
    const v8, 0x3e99999a    # 0.3f

    .line 746
    .line 747
    .line 748
    const/4 v7, 0x0

    .line 749
    const/high16 v12, 0x3f800000    # 1.0f

    .line 750
    .line 751
    const/4 v13, 0x0

    .line 752
    const/4 v14, 0x0

    .line 753
    const/4 v15, 0x0

    .line 754
    const-string v4, ""

    .line 755
    .line 756
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    sput-object v0, Landroidx/compose/material/icons/twotone/TouchAppKt;->_touchApp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 765
    .line 766
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 767
    .line 768
    .line 769
    return-object v0
.end method

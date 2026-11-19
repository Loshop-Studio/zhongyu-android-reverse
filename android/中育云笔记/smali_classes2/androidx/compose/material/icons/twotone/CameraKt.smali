.class public final Landroidx/compose/material/icons/twotone/CameraKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _camera:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCamera(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CameraKt;->_camera:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Camera"

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
    const v4, 0x412e6666    # 10.9f

    .line 71
    .line 72
    .line 73
    const v6, 0x419f47ae    # 19.91f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v25, 0x3f8ccccd    # 1.1f

    .line 80
    .line 81
    .line 82
    const v26, 0x3db851ec    # 0.09f

    .line 83
    .line 84
    .line 85
    const v21, 0x3eb851ec    # 0.36f

    .line 86
    .line 87
    .line 88
    const v22, 0x3d4ccccd    # 0.05f

    .line 89
    .line 90
    .line 91
    const v23, 0x3f3851ec    # 0.72f

    .line 92
    .line 93
    .line 94
    const v24, 0x3db851ec    # 0.09f

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
    const v25, 0x40b3851f    # 5.61f

    .line 103
    .line 104
    .line 105
    const v26, -0x3feccccd    # -2.3f

    .line 106
    .line 107
    .line 108
    const v21, 0x400b851f    # 2.18f

    .line 109
    .line 110
    .line 111
    const/16 v22, 0x0

    .line 112
    .line 113
    const v23, 0x40851eb8    # 4.16f

    .line 114
    .line 115
    .line 116
    const v24, -0x409eb852    # -0.88f

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const/high16 v4, 0x41500000    # 13.0f

    .line 123
    .line 124
    const v6, 0x416e3d71    # 14.89f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v4, -0x3f80a3d7    # -3.99f

    .line 131
    .line 132
    .line 133
    const v6, 0x40dd1eb8    # 6.91f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, 0x411dc28f    # 9.86f

    .line 143
    .line 144
    .line 145
    const v6, 0x419d999a    # 19.7f

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, -0x3f69999a    # -4.7f

    .line 152
    .line 153
    .line 154
    const v6, 0x402d70a4    # 2.71f

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v4, 0x4092e148    # 4.59f

    .line 161
    .line 162
    .line 163
    const/high16 v6, 0x41700000    # 15.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v25, 0x40a8a3d7    # 5.27f

    .line 169
    .line 170
    .line 171
    const v26, 0x40966666    # 4.7f

    .line 172
    .line 173
    .line 174
    const v21, 0x3f6e147b    # 0.93f

    .line 175
    .line 176
    .line 177
    const v22, 0x4011eb85    # 2.28f

    .line 178
    .line 179
    .line 180
    const v23, 0x4037ae14    # 2.87f

    .line 181
    .line 182
    .line 183
    const v24, 0x4080f5c3    # 4.03f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v4, 0x4108a3d7    # 8.54f

    .line 193
    .line 194
    .line 195
    const/high16 v6, 0x41400000    # 12.0f

    .line 196
    .line 197
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x40b66666    # 5.7f

    .line 201
    .line 202
    .line 203
    const v6, 0x40e2e148    # 7.09f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v25, 0x40800000    # 4.0f

    .line 210
    .line 211
    const/high16 v26, 0x41400000    # 12.0f

    .line 212
    .line 213
    const v21, 0x40947ae1    # 4.64f

    .line 214
    .line 215
    .line 216
    const v22, 0x41073333    # 8.45f

    .line 217
    .line 218
    .line 219
    const/high16 v23, 0x40800000    # 4.0f

    .line 220
    .line 221
    const v24, 0x41226666    # 10.15f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v25, 0x3e851eb8    # 0.26f

    .line 228
    .line 229
    .line 230
    const/high16 v26, 0x40000000    # 2.0f

    .line 231
    .line 232
    const/16 v21, 0x0

    .line 233
    .line 234
    const v22, 0x3f30a3d7    # 0.69f

    .line 235
    .line 236
    .line 237
    const v23, 0x3dcccccd    # 0.1f

    .line 238
    .line 239
    .line 240
    const v24, 0x3fae147b    # 1.36f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, 0x40adc28f    # 5.43f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v4, -0x40000000    # -2.0f

    .line 253
    .line 254
    const v6, -0x406ccccd    # -1.15f

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v4, 0x41926666    # 18.3f

    .line 264
    .line 265
    .line 266
    const v6, 0x418747ae    # 16.91f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v25, 0x41a00000    # 20.0f

    .line 273
    .line 274
    const/high16 v26, 0x41400000    # 12.0f

    .line 275
    .line 276
    const v21, 0x419ae148    # 19.36f

    .line 277
    .line 278
    .line 279
    const v22, 0x4178cccd    # 15.55f

    .line 280
    .line 281
    .line 282
    const/high16 v23, 0x41a00000    # 20.0f

    .line 283
    .line 284
    const v24, 0x415d999a    # 13.85f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v25, -0x417ae148    # -0.26f

    .line 291
    .line 292
    .line 293
    const/high16 v26, -0x40000000    # -2.0f

    .line 294
    .line 295
    const/16 v21, 0x0

    .line 296
    .line 297
    const v22, -0x40cf5c29    # -0.69f

    .line 298
    .line 299
    .line 300
    const v23, -0x42333333    # -0.1f

    .line 301
    .line 302
    .line 303
    const v24, -0x4051eb85    # -1.36f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v4, -0x3f523d71    # -5.43f

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v4, 0x407f5c29    # 3.99f

    .line 316
    .line 317
    .line 318
    const v6, 0x40dd1eb8    # 6.91f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, 0x415bae14    # 13.73f

    .line 328
    .line 329
    .line 330
    const/high16 v6, 0x41100000    # 9.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v4, 0x40b5c28f    # 5.68f

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v25, -0x3f570a3d    # -5.28f

    .line 342
    .line 343
    .line 344
    const v26, -0x3f69999a    # -4.7f

    .line 345
    .line 346
    .line 347
    const v21, -0x4091eb85    # -0.93f

    .line 348
    .line 349
    .line 350
    const v22, -0x3fee147b    # -2.28f

    .line 351
    .line 352
    .line 353
    const v23, -0x3fc7ae14    # -2.88f

    .line 354
    .line 355
    .line 356
    const v24, -0x3f7eb852    # -4.04f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v4, 0x4136b852    # 11.42f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v4, 0x4013d70a    # 2.31f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v4, 0x412451ec    # 10.27f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v4, 0x40351eb8    # 2.83f

    .line 384
    .line 385
    .line 386
    const v6, -0x3f628f5c    # -4.92f

    .line 387
    .line 388
    .line 389
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v25, 0x41400000    # 12.0f

    .line 393
    .line 394
    const/high16 v26, 0x40800000    # 4.0f

    .line 395
    .line 396
    const v21, 0x414bd70a    # 12.74f

    .line 397
    .line 398
    .line 399
    const v22, 0x4080f5c3    # 4.03f

    .line 400
    .line 401
    .line 402
    const v23, 0x4145eb85    # 12.37f

    .line 403
    .line 404
    .line 405
    const/high16 v24, 0x40800000    # 4.0f

    .line 406
    .line 407
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v25, -0x3f4ccccd    # -5.6f

    .line 411
    .line 412
    .line 413
    const v26, 0x40133333    # 2.3f

    .line 414
    .line 415
    .line 416
    const v21, -0x3ff47ae1    # -2.18f

    .line 417
    .line 418
    .line 419
    const/16 v22, 0x0

    .line 420
    .line 421
    const v23, -0x3f7ae148    # -4.16f

    .line 422
    .line 423
    .line 424
    const v24, 0x3f6147ae    # 0.88f

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v4, 0x4111eb85    # 9.12f

    .line 431
    .line 432
    .line 433
    const/high16 v6, 0x41300000    # 11.0f

    .line 434
    .line 435
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x3f933333    # 1.15f

    .line 439
    .line 440
    .line 441
    const/high16 v6, -0x40000000    # -2.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    const/16 v16, 0x3800

    .line 454
    .line 455
    const/16 v17, 0x0

    .line 456
    .line 457
    const v6, 0x3e99999a    # 0.3f

    .line 458
    .line 459
    .line 460
    const v8, 0x3e99999a    # 0.3f

    .line 461
    .line 462
    .line 463
    const/4 v7, 0x0

    .line 464
    const/high16 v9, 0x3f800000    # 1.0f

    .line 465
    .line 466
    const/high16 v12, 0x3f800000    # 1.0f

    .line 467
    .line 468
    const/4 v13, 0x0

    .line 469
    const/4 v14, 0x0

    .line 470
    const/4 v15, 0x0

    .line 471
    const-string v4, ""

    .line 472
    .line 473
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 474
    .line 475
    .line 476
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 481
    .line 482
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 483
    .line 484
    .line 485
    move-result-wide v6

    .line 486
    const/4 v0, 0x0

    .line 487
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 491
    .line 492
    .line 493
    move-result v10

    .line 494
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 495
    .line 496
    .line 497
    move-result v11

    .line 498
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 501
    .line 502
    .line 503
    const/high16 v0, 0x41b00000    # 22.0f

    .line 504
    .line 505
    const/high16 v2, 0x41400000    # 12.0f

    .line 506
    .line 507
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x41200000    # 10.0f

    .line 511
    .line 512
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 513
    .line 514
    const v13, 0x40b0a3d7    # 5.52f

    .line 515
    .line 516
    .line 517
    const/high16 v15, 0x41200000    # 10.0f

    .line 518
    .line 519
    const v16, -0x3f70a3d7    # -4.48f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, -0x3f080000    # -7.75f

    .line 526
    .line 527
    const v18, -0x3ee428f6    # -9.74f

    .line 528
    .line 529
    .line 530
    const/4 v13, 0x0

    .line 531
    const/high16 v14, -0x3f680000    # -4.75f

    .line 532
    .line 533
    const v15, -0x3fac28f6    # -3.31f

    .line 534
    .line 535
    .line 536
    const v16, -0x3ef47ae1    # -8.72f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, -0x425c28f6    # -0.08f

    .line 543
    .line 544
    .line 545
    const v2, -0x42dc28f6    # -0.04f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, -0x43dc28f6    # -0.01f

    .line 552
    .line 553
    .line 554
    const v2, 0x3ca3d70a    # 0.02f

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const/high16 v17, 0x41400000    # 12.0f

    .line 561
    .line 562
    const/high16 v18, 0x40000000    # 2.0f

    .line 563
    .line 564
    const v13, 0x41575c29    # 13.46f

    .line 565
    .line 566
    .line 567
    const v14, 0x4005c28f    # 2.09f

    .line 568
    .line 569
    .line 570
    const v15, 0x414bd70a    # 12.74f

    .line 571
    .line 572
    .line 573
    const/high16 v16, 0x40000000    # 2.0f

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v17, 0x40000000    # 2.0f

    .line 579
    .line 580
    const/high16 v18, 0x41400000    # 12.0f

    .line 581
    .line 582
    const v13, 0x40cf5c29    # 6.48f

    .line 583
    .line 584
    .line 585
    const/high16 v14, 0x40000000    # 2.0f

    .line 586
    .line 587
    const/high16 v15, 0x40000000    # 2.0f

    .line 588
    .line 589
    const v16, 0x40cf5c29    # 6.48f

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, 0x408f5c29    # 4.48f

    .line 596
    .line 597
    .line 598
    const/high16 v2, 0x41200000    # 10.0f

    .line 599
    .line 600
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x41a00000    # 20.0f

    .line 607
    .line 608
    const/high16 v2, 0x41400000    # 12.0f

    .line 609
    .line 610
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v17, -0x40733333    # -1.1f

    .line 614
    .line 615
    .line 616
    const v18, -0x4247ae14    # -0.09f

    .line 617
    .line 618
    .line 619
    const v13, -0x413d70a4    # -0.38f

    .line 620
    .line 621
    .line 622
    const/4 v14, 0x0

    .line 623
    const v15, -0x40c28f5c    # -0.74f

    .line 624
    .line 625
    .line 626
    const v16, -0x42dc28f6    # -0.04f

    .line 627
    .line 628
    .line 629
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 630
    .line 631
    .line 632
    const/high16 v0, 0x41500000    # 13.0f

    .line 633
    .line 634
    const v2, 0x416e3d71    # 14.89f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v0, 0x402e147b    # 2.72f

    .line 641
    .line 642
    .line 643
    const v2, 0x40966666    # 4.7f

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v17, 0x41400000    # 12.0f

    .line 650
    .line 651
    const/high16 v18, 0x41a00000    # 20.0f

    .line 652
    .line 653
    const v13, 0x418147ae    # 16.16f

    .line 654
    .line 655
    .line 656
    const v14, 0x4198f5c3    # 19.12f

    .line 657
    .line 658
    .line 659
    const v15, 0x4162e148    # 14.18f

    .line 660
    .line 661
    .line 662
    const/high16 v16, 0x41a00000    # 20.0f

    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v0, 0x41a00000    # 20.0f

    .line 671
    .line 672
    const/high16 v2, 0x41400000    # 12.0f

    .line 673
    .line 674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const v17, -0x40266666    # -1.7f

    .line 678
    .line 679
    .line 680
    const v18, 0x409d1eb8    # 4.91f

    .line 681
    .line 682
    .line 683
    const/4 v13, 0x0

    .line 684
    const v14, 0x3feccccd    # 1.85f

    .line 685
    .line 686
    .line 687
    const v15, -0x40dc28f6    # -0.64f

    .line 688
    .line 689
    .line 690
    const v16, 0x40633333    # 3.55f

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const/high16 v0, -0x3f800000    # -4.0f

    .line 697
    .line 698
    const v2, -0x3f22e148    # -6.91f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const v0, 0x40adc28f    # 5.43f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, 0x3e8a3d71    # 0.27f

    .line 711
    .line 712
    .line 713
    const/high16 v18, 0x40000000    # 2.0f

    .line 714
    .line 715
    const v13, 0x3e2e147b    # 0.17f

    .line 716
    .line 717
    .line 718
    const v14, 0x3f23d70a    # 0.64f

    .line 719
    .line 720
    .line 721
    const v15, 0x3e8a3d71    # 0.27f

    .line 722
    .line 723
    .line 724
    const v16, 0x3fa7ae14    # 1.31f

    .line 725
    .line 726
    .line 727
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 731
    .line 732
    .line 733
    const v0, 0x419b47ae    # 19.41f

    .line 734
    .line 735
    .line 736
    const/high16 v2, 0x41100000    # 9.0f

    .line 737
    .line 738
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const v0, -0x3f0051ec    # -7.99f

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const v0, -0x3f69999a    # -4.7f

    .line 748
    .line 749
    .line 750
    const v2, 0x402d70a4    # 2.71f

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    const v17, 0x40a8f5c3    # 5.28f

    .line 757
    .line 758
    .line 759
    const v18, 0x40966666    # 4.7f

    .line 760
    .line 761
    .line 762
    const v13, 0x4019999a    # 2.4f

    .line 763
    .line 764
    .line 765
    const v14, 0x3f28f5c3    # 0.66f

    .line 766
    .line 767
    .line 768
    const v15, 0x408b3333    # 4.35f

    .line 769
    .line 770
    .line 771
    const v16, 0x401ae148    # 2.42f

    .line 772
    .line 773
    .line 774
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 778
    .line 779
    .line 780
    const/high16 v0, 0x40800000    # 4.0f

    .line 781
    .line 782
    const/high16 v2, 0x41400000    # 12.0f

    .line 783
    .line 784
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const v17, 0x3f8ccccd    # 1.1f

    .line 788
    .line 789
    .line 790
    const v18, 0x3da3d70a    # 0.08f

    .line 791
    .line 792
    .line 793
    const v13, 0x3ebd70a4    # 0.37f

    .line 794
    .line 795
    .line 796
    const/4 v14, 0x0

    .line 797
    const v15, 0x3f3d70a4    # 0.74f

    .line 798
    .line 799
    .line 800
    const v16, 0x3cf5c28f    # 0.03f

    .line 801
    .line 802
    .line 803
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const v0, 0x412451ec    # 10.27f

    .line 807
    .line 808
    .line 809
    const/high16 v2, 0x41100000    # 9.0f

    .line 810
    .line 811
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v0, 0x40000000    # 2.0f

    .line 815
    .line 816
    const v2, -0x406ccccd    # -1.15f

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const v0, 0x40cccccd    # 6.4f

    .line 823
    .line 824
    .line 825
    const v2, 0x40c9999a    # 6.3f

    .line 826
    .line 827
    .line 828
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v17, 0x41400000    # 12.0f

    .line 832
    .line 833
    const/high16 v18, 0x40800000    # 4.0f

    .line 834
    .line 835
    const v13, 0x40fae148    # 7.84f

    .line 836
    .line 837
    .line 838
    const v14, 0x409c28f6    # 4.88f

    .line 839
    .line 840
    .line 841
    const v15, 0x411d1eb8    # 9.82f

    .line 842
    .line 843
    .line 844
    const/high16 v16, 0x40800000    # 4.0f

    .line 845
    .line 846
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 850
    .line 851
    .line 852
    const/high16 v0, 0x40800000    # 4.0f

    .line 853
    .line 854
    const/high16 v2, 0x41400000    # 12.0f

    .line 855
    .line 856
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v17, 0x3fd9999a    # 1.7f

    .line 860
    .line 861
    .line 862
    const v18, -0x3f62e148    # -4.91f

    .line 863
    .line 864
    .line 865
    const/4 v13, 0x0

    .line 866
    const v14, -0x40133333    # -1.85f

    .line 867
    .line 868
    .line 869
    const v15, 0x3f23d70a    # 0.64f

    .line 870
    .line 871
    .line 872
    const v16, -0x3f9ccccd    # -3.55f

    .line 873
    .line 874
    .line 875
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    const v0, 0x4108a3d7    # 8.54f

    .line 879
    .line 880
    .line 881
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 882
    .line 883
    .line 884
    const/high16 v0, 0x40000000    # 2.0f

    .line 885
    .line 886
    const v2, 0x3f933333    # 1.15f

    .line 887
    .line 888
    .line 889
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 890
    .line 891
    .line 892
    const v0, 0x408851ec    # 4.26f

    .line 893
    .line 894
    .line 895
    const/high16 v2, 0x41600000    # 14.0f

    .line 896
    .line 897
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const/high16 v17, 0x40800000    # 4.0f

    .line 901
    .line 902
    const/high16 v18, 0x41400000    # 12.0f

    .line 903
    .line 904
    const v13, 0x40833333    # 4.1f

    .line 905
    .line 906
    .line 907
    const v14, 0x4155c28f    # 13.36f

    .line 908
    .line 909
    .line 910
    const/high16 v15, 0x40800000    # 4.0f

    .line 911
    .line 912
    const v16, 0x414b0a3d    # 12.69f

    .line 913
    .line 914
    .line 915
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 916
    .line 917
    .line 918
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    const/high16 v0, 0x41700000    # 15.0f

    .line 922
    .line 923
    const v2, 0x412451ec    # 10.27f

    .line 924
    .line 925
    .line 926
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 927
    .line 928
    .line 929
    const v0, 0x40133333    # 2.3f

    .line 930
    .line 931
    .line 932
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const v0, -0x3fd28f5c    # -2.71f

    .line 936
    .line 937
    .line 938
    const v2, 0x40966666    # 4.7f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v17, -0x3f570a3d    # -5.28f

    .line 945
    .line 946
    .line 947
    const v18, -0x3f69999a    # -4.7f

    .line 948
    .line 949
    .line 950
    const v13, -0x3fe66666    # -2.4f

    .line 951
    .line 952
    .line 953
    const v14, -0x40d47ae1    # -0.67f

    .line 954
    .line 955
    .line 956
    const v15, -0x3f74cccd    # -4.35f

    .line 957
    .line 958
    .line 959
    const v16, -0x3fe51eb8    # -2.42f

    .line 960
    .line 961
    .line 962
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v0, 0x40b6147b    # 5.69f

    .line 966
    .line 967
    .line 968
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    const/16 v16, 0x3800

    .line 979
    .line 980
    const/16 v17, 0x0

    .line 981
    .line 982
    const/high16 v6, 0x3f800000    # 1.0f

    .line 983
    .line 984
    const/high16 v8, 0x3f800000    # 1.0f

    .line 985
    .line 986
    const/4 v7, 0x0

    .line 987
    const/high16 v12, 0x3f800000    # 1.0f

    .line 988
    .line 989
    const/4 v13, 0x0

    .line 990
    const/4 v14, 0x0

    .line 991
    const/4 v15, 0x0

    .line 992
    const-string v4, ""

    .line 993
    .line 994
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    sput-object v0, Landroidx/compose/material/icons/twotone/CameraKt;->_camera:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1003
    .line 1004
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1005
    .line 1006
    .line 1007
    return-object v0
.end method

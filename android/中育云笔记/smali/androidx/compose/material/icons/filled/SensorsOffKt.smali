.class public final Landroidx/compose/material/icons/filled/SensorsOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sensorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSensorsOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/SensorsOffKt;->_sensorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.SensorsOff"

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
    const v0, 0x412f5c29    # 10.96f

    .line 71
    .line 72
    .line 73
    const v2, 0x41023d71    # 8.14f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x41000000    # 8.0f

    .line 80
    .line 81
    const/high16 v18, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v13, 0x4100cccd    # 8.05f

    .line 84
    .line 85
    .line 86
    const v14, 0x4134a3d7    # 11.29f

    .line 87
    .line 88
    .line 89
    const/high16 v15, 0x41000000    # 8.0f

    .line 90
    .line 91
    const v16, 0x413a3d71    # 11.64f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v17, 0x3f95c28f    # 1.17f

    .line 98
    .line 99
    .line 100
    const v18, 0x40351eb8    # 2.83f

    .line 101
    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    const v14, 0x3f8ccccd    # 1.1f

    .line 105
    .line 106
    .line 107
    const v15, 0x3ee66666    # 0.45f

    .line 108
    .line 109
    .line 110
    const v16, 0x40066666    # 2.1f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x3fb5c28f    # 1.42f

    .line 117
    .line 118
    .line 119
    const v2, -0x404a3d71    # -1.42f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v17, 0x40c00000    # 6.0f

    .line 126
    .line 127
    const/high16 v18, 0x41400000    # 12.0f

    .line 128
    .line 129
    const v13, 0x40d570a4    # 6.67f

    .line 130
    .line 131
    .line 132
    const v14, 0x41728f5c    # 15.16f

    .line 133
    .line 134
    .line 135
    const/high16 v15, 0x40c00000    # 6.0f

    .line 136
    .line 137
    const v16, 0x415a8f5c    # 13.66f

    .line 138
    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, 0x3f147ae1    # 0.58f

    .line 144
    .line 145
    .line 146
    const v18, -0x3fda3d71    # -2.59f

    .line 147
    .line 148
    .line 149
    const/4 v13, 0x0

    .line 150
    const v14, -0x4091eb85    # -0.93f

    .line 151
    .line 152
    .line 153
    const v15, 0x3e570a3d    # 0.21f

    .line 154
    .line 155
    .line 156
    const v16, -0x4019999a    # -1.8f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v0, 0x40a3851f    # 5.11f

    .line 163
    .line 164
    .line 165
    const v2, 0x40fe147b    # 7.94f

    .line 166
    .line 167
    .line 168
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v17, 0x40800000    # 4.0f

    .line 172
    .line 173
    const/high16 v18, 0x41400000    # 12.0f

    .line 174
    .line 175
    const v13, 0x408ccccd    # 4.4f

    .line 176
    .line 177
    .line 178
    const v14, 0x4112147b    # 9.13f

    .line 179
    .line 180
    .line 181
    const/high16 v15, 0x40800000    # 4.0f

    .line 182
    .line 183
    const v16, 0x412851ec    # 10.52f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, 0x40166666    # 2.35f

    .line 190
    .line 191
    .line 192
    const v18, 0x40b4cccd    # 5.65f

    .line 193
    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const v14, 0x400d70a4    # 2.21f

    .line 197
    .line 198
    .line 199
    const v15, 0x3f666666    # 0.9f

    .line 200
    .line 201
    .line 202
    const v16, 0x4086b852    # 4.21f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x3fb5c28f    # 1.42f

    .line 209
    .line 210
    .line 211
    const v2, -0x404a3d71    # -1.42f

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x40000000    # 2.0f

    .line 218
    .line 219
    const/high16 v18, 0x41400000    # 12.0f

    .line 220
    .line 221
    const v13, 0x4047ae14    # 3.12f

    .line 222
    .line 223
    .line 224
    const v14, 0x418a147b    # 17.26f

    .line 225
    .line 226
    .line 227
    const/high16 v15, 0x40000000    # 2.0f

    .line 228
    .line 229
    const v16, 0x416c28f6    # 14.76f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3fd47ae1    # 1.66f

    .line 236
    .line 237
    .line 238
    const v18, -0x3f4fae14    # -5.51f

    .line 239
    .line 240
    .line 241
    const/4 v13, 0x0

    .line 242
    const v14, -0x3ffd70a4    # -2.04f

    .line 243
    .line 244
    .line 245
    const v15, 0x3f1c28f6    # 0.61f

    .line 246
    .line 247
    .line 248
    const v16, -0x3f847ae1    # -3.93f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, 0x3fb1eb85    # 1.39f

    .line 255
    .line 256
    .line 257
    const v2, 0x40870a3d    # 4.22f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, -0x404b851f    # -1.41f

    .line 264
    .line 265
    .line 266
    const v2, 0x3fb47ae1    # 1.41f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x41930a3d    # 18.38f

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v0, -0x404b851f    # -1.41f

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x412f5c29    # 10.96f

    .line 285
    .line 286
    .line 287
    const v2, 0x41023d71    # 8.14f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v0, 0x416970a4    # 14.59f

    .line 297
    .line 298
    .line 299
    const v2, 0x418b5c29    # 17.42f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x41900000    # 18.0f

    .line 306
    .line 307
    const/high16 v18, 0x41400000    # 12.0f

    .line 308
    .line 309
    const v13, 0x418e51ec    # 17.79f

    .line 310
    .line 311
    .line 312
    const v14, 0x415ccccd    # 13.8f

    .line 313
    .line 314
    .line 315
    const/high16 v15, 0x41900000    # 18.0f

    .line 316
    .line 317
    const v16, 0x414ee148    # 12.93f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const v17, -0x401eb852    # -1.76f

    .line 324
    .line 325
    .line 326
    const v18, -0x3f7851ec    # -4.24f

    .line 327
    .line 328
    .line 329
    const/4 v13, 0x0

    .line 330
    const v14, -0x402b851f    # -1.66f

    .line 331
    .line 332
    .line 333
    const v15, -0x40d47ae1    # -0.67f

    .line 334
    .line 335
    .line 336
    const v16, -0x3fb5c28f    # -3.16f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x3fb5c28f    # 1.42f

    .line 343
    .line 344
    .line 345
    const v2, -0x404a3d71    # -1.42f

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v17, 0x41800000    # 16.0f

    .line 352
    .line 353
    const/high16 v18, 0x41400000    # 12.0f

    .line 354
    .line 355
    const v13, 0x4178cccd    # 15.55f

    .line 356
    .line 357
    .line 358
    const v14, 0x411e6666    # 9.9f

    .line 359
    .line 360
    .line 361
    const/high16 v15, 0x41800000    # 16.0f

    .line 362
    .line 363
    const v16, 0x412e6666    # 10.9f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v17, -0x41f0a3d7    # -0.14f

    .line 370
    .line 371
    .line 372
    const v18, 0x3f851eb8    # 1.04f

    .line 373
    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const v14, 0x3eb851ec    # 0.36f

    .line 377
    .line 378
    .line 379
    const v15, -0x42b33333    # -0.05f

    .line 380
    .line 381
    .line 382
    const v16, 0x3f35c28f    # 0.71f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const v0, 0x416970a4    # 14.59f

    .line 389
    .line 390
    .line 391
    const v2, 0x418b5c29    # 17.42f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41a00000    # 20.0f

    .line 401
    .line 402
    const/high16 v2, 0x41400000    # 12.0f

    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v17, -0x4071eb85    # -1.11f

    .line 408
    .line 409
    .line 410
    const v18, 0x4081eb85    # 4.06f

    .line 411
    .line 412
    .line 413
    const v14, 0x3fbd70a4    # 1.48f

    .line 414
    .line 415
    .line 416
    const v15, -0x41333333    # -0.4f

    .line 417
    .line 418
    .line 419
    const v16, 0x4037ae14    # 2.87f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v0, 0x3fb9999a    # 1.45f

    .line 426
    .line 427
    .line 428
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v17, 0x41b00000    # 22.0f

    .line 432
    .line 433
    const/high16 v18, 0x41400000    # 12.0f

    .line 434
    .line 435
    const v13, 0x41ab1eb8    # 21.39f

    .line 436
    .line 437
    .line 438
    const v14, 0x417ee148    # 15.93f

    .line 439
    .line 440
    .line 441
    const/high16 v15, 0x41b00000    # 22.0f

    .line 442
    .line 443
    const v16, 0x4160a3d7    # 14.04f

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, -0x3fc47ae1    # -2.93f

    .line 450
    .line 451
    .line 452
    const v18, -0x3f1dc28f    # -7.07f

    .line 453
    .line 454
    .line 455
    const/4 v13, 0x0

    .line 456
    const v14, -0x3fcf5c29    # -2.76f

    .line 457
    .line 458
    .line 459
    const v15, -0x4070a3d7    # -1.12f

    .line 460
    .line 461
    .line 462
    const v16, -0x3f57ae14    # -5.26f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v0, 0x3fb5c28f    # 1.42f

    .line 469
    .line 470
    .line 471
    const v2, -0x404a3d71    # -1.42f

    .line 472
    .line 473
    .line 474
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v17, 0x41a00000    # 20.0f

    .line 478
    .line 479
    const/high16 v18, 0x41400000    # 12.0f

    .line 480
    .line 481
    const v13, 0x4198cccd    # 19.1f

    .line 482
    .line 483
    .line 484
    const v14, 0x40f947ae    # 7.79f

    .line 485
    .line 486
    .line 487
    const/high16 v15, 0x41a00000    # 20.0f

    .line 488
    .line 489
    const v16, 0x411ca3d7    # 9.79f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    const/16 v16, 0x3800

    .line 503
    .line 504
    const/16 v17, 0x0

    .line 505
    .line 506
    const/high16 v6, 0x3f800000    # 1.0f

    .line 507
    .line 508
    const/high16 v8, 0x3f800000    # 1.0f

    .line 509
    .line 510
    const/4 v7, 0x0

    .line 511
    const/high16 v9, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const/high16 v12, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/4 v13, 0x0

    .line 516
    const/4 v14, 0x0

    .line 517
    const/4 v15, 0x0

    .line 518
    const-string v4, ""

    .line 519
    .line 520
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    sput-object v0, Landroidx/compose/material/icons/filled/SensorsOffKt;->_sensorsOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 529
    .line 530
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    return-object v0
.end method

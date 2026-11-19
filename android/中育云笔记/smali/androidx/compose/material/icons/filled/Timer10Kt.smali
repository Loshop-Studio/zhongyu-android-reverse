.class public final Landroidx/compose/material/icons/filled/Timer10Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _timer10:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimer10(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/Timer10Kt;->_timer10:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Timer10"

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
    const v0, 0x40f70a3d    # 7.72f

    .line 71
    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x41166666    # 9.4f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v0, -0x40800000    # -1.0f

    .line 84
    .line 85
    const/high16 v2, 0x40400000    # 3.0f

    .line 86
    .line 87
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v0, 0x41900000    # 18.0f

    .line 91
    .line 92
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x40000000    # 2.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v0, 0x40a00000    # 5.0f

    .line 101
    .line 102
    const/high16 v2, 0x40c00000    # 6.0f

    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v0, -0x41800000    # -0.25f

    .line 108
    .line 109
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x40f70a3d    # 7.72f

    .line 113
    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v0, 0x41be3d71    # 23.78f

    .line 123
    .line 124
    .line 125
    const v2, 0x4165eb85    # 14.37f

    .line 126
    .line 127
    .line 128
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v17, -0x40deb852    # -0.63f

    .line 132
    .line 133
    .line 134
    const v18, -0x40c28f5c    # -0.74f

    .line 135
    .line 136
    .line 137
    const v13, -0x41f0a3d7    # -0.14f

    .line 138
    .line 139
    .line 140
    const v14, -0x4170a3d7    # -0.28f

    .line 141
    .line 142
    .line 143
    const v15, -0x414ccccd    # -0.35f

    .line 144
    .line 145
    .line 146
    const v16, -0x40f851ec    # -0.53f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v17, -0x407eb852    # -1.01f

    .line 153
    .line 154
    .line 155
    const v18, -0x40f851ec    # -0.53f

    .line 156
    .line 157
    .line 158
    const v13, -0x4170a3d7    # -0.28f

    .line 159
    .line 160
    .line 161
    const v14, -0x41a8f5c3    # -0.21f

    .line 162
    .line 163
    .line 164
    const v15, -0x40e3d70a    # -0.61f

    .line 165
    .line 166
    .line 167
    const v16, -0x413851ec    # -0.39f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, -0x40533333    # -1.35f

    .line 174
    .line 175
    .line 176
    const v2, -0x413d70a4    # -0.38f

    .line 177
    .line 178
    .line 179
    const v4, -0x40a66666    # -0.85f

    .line 180
    .line 181
    .line 182
    const v6, -0x4175c28f    # -0.27f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v17, -0x40a147ae    # -0.87f

    .line 189
    .line 190
    .line 191
    const v18, -0x41947ae1    # -0.23f

    .line 192
    .line 193
    .line 194
    const v13, -0x414ccccd    # -0.35f

    .line 195
    .line 196
    .line 197
    const v14, -0x4270a3d7    # -0.07f

    .line 198
    .line 199
    .line 200
    const v15, -0x40dc28f6    # -0.64f

    .line 201
    .line 202
    .line 203
    const v16, -0x41e66666    # -0.15f

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, -0x40f33333    # -0.55f

    .line 210
    .line 211
    .line 212
    const/high16 v18, -0x41800000    # -0.25f

    .line 213
    .line 214
    const v13, -0x41947ae1    # -0.23f

    .line 215
    .line 216
    .line 217
    const v14, -0x425c28f6    # -0.08f

    .line 218
    .line 219
    .line 220
    const v15, -0x412e147b    # -0.41f

    .line 221
    .line 222
    .line 223
    const v16, -0x41dc28f6    # -0.16f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, -0x4170a3d7    # -0.28f

    .line 230
    .line 231
    .line 232
    const v18, -0x41666666    # -0.3f

    .line 233
    .line 234
    .line 235
    const v13, -0x41f0a3d7    # -0.14f

    .line 236
    .line 237
    .line 238
    const v14, -0x4247ae14    # -0.09f

    .line 239
    .line 240
    .line 241
    const v15, -0x41947ae1    # -0.23f

    .line 242
    .line 243
    .line 244
    const v16, -0x41bd70a4    # -0.19f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, -0x425c28f6    # -0.08f

    .line 251
    .line 252
    .line 253
    const v18, -0x413851ec    # -0.39f

    .line 254
    .line 255
    .line 256
    const v13, -0x42b33333    # -0.05f

    .line 257
    .line 258
    .line 259
    const v14, -0x421eb852    # -0.11f

    .line 260
    .line 261
    .line 262
    const v15, -0x425c28f6    # -0.08f

    .line 263
    .line 264
    .line 265
    const v16, -0x418a3d71    # -0.24f

    .line 266
    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, 0x3db851ec    # 0.09f

    .line 272
    .line 273
    .line 274
    const v18, -0x412e147b    # -0.41f

    .line 275
    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const v14, -0x41f0a3d7    # -0.14f

    .line 279
    .line 280
    .line 281
    const v15, 0x3cf5c28f    # 0.03f

    .line 282
    .line 283
    .line 284
    const v16, -0x4170a3d7    # -0.28f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, 0x3e8a3d71    # 0.27f

    .line 291
    .line 292
    .line 293
    const v18, -0x4151eb85    # -0.34f

    .line 294
    .line 295
    .line 296
    const v13, 0x3d75c28f    # 0.06f

    .line 297
    .line 298
    .line 299
    const v14, -0x41fae148    # -0.13f

    .line 300
    .line 301
    .line 302
    const v15, 0x3e19999a    # 0.15f

    .line 303
    .line 304
    .line 305
    const/high16 v16, -0x41800000    # -0.25f

    .line 306
    .line 307
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v17, 0x3ee66666    # 0.45f

    .line 311
    .line 312
    .line 313
    const v18, -0x418a3d71    # -0.24f

    .line 314
    .line 315
    .line 316
    const v13, 0x3df5c28f    # 0.12f

    .line 317
    .line 318
    .line 319
    const v14, -0x42333333    # -0.1f

    .line 320
    .line 321
    .line 322
    const v15, 0x3e8a3d71    # 0.27f

    .line 323
    .line 324
    .line 325
    const v16, -0x41c7ae14    # -0.18f

    .line 326
    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const v0, 0x3ecccccd    # 0.4f

    .line 332
    .line 333
    .line 334
    const v2, 0x3f23d70a    # 0.64f

    .line 335
    .line 336
    .line 337
    const v4, -0x4247ae14    # -0.09f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, 0x3f28f5c3    # 0.66f

    .line 344
    .line 345
    .line 346
    const v18, 0x3de147ae    # 0.11f

    .line 347
    .line 348
    .line 349
    const/high16 v13, 0x3e800000    # 0.25f

    .line 350
    .line 351
    const/4 v14, 0x0

    .line 352
    const v15, 0x3ef0a3d7    # 0.47f

    .line 353
    .line 354
    .line 355
    const v16, 0x3d23d70a    # 0.04f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, 0x3ef5c28f    # 0.48f

    .line 362
    .line 363
    .line 364
    const v18, 0x3e947ae1    # 0.29f

    .line 365
    .line 366
    .line 367
    const v13, 0x3e428f5c    # 0.19f

    .line 368
    .line 369
    .line 370
    const v14, 0x3d8f5c29    # 0.07f

    .line 371
    .line 372
    .line 373
    const v15, 0x3eb33333    # 0.35f

    .line 374
    .line 375
    .line 376
    const v16, 0x3e2e147b    # 0.17f

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, 0x3e947ae1    # 0.29f

    .line 383
    .line 384
    .line 385
    const v18, 0x3ed70a3d    # 0.42f

    .line 386
    .line 387
    .line 388
    const v13, 0x3e051eb8    # 0.13f

    .line 389
    .line 390
    .line 391
    const v14, 0x3df5c28f    # 0.12f

    .line 392
    .line 393
    .line 394
    const v15, 0x3e6147ae    # 0.22f

    .line 395
    .line 396
    .line 397
    const v16, 0x3e851eb8    # 0.26f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, 0x3dcccccd    # 0.1f

    .line 404
    .line 405
    .line 406
    const v18, 0x3efae148    # 0.49f

    .line 407
    .line 408
    .line 409
    const v13, 0x3d75c28f    # 0.06f

    .line 410
    .line 411
    .line 412
    const v14, 0x3e23d70a    # 0.16f

    .line 413
    .line 414
    .line 415
    const v15, 0x3dcccccd    # 0.1f

    .line 416
    .line 417
    .line 418
    const v16, 0x3ea3d70a    # 0.32f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v0, 0x3ff9999a    # 1.95f

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v17, -0x418a3d71    # -0.24f

    .line 431
    .line 432
    .line 433
    const v18, -0x40747ae1    # -1.09f

    .line 434
    .line 435
    .line 436
    const/4 v13, 0x0

    .line 437
    const v14, -0x413851ec    # -0.39f

    .line 438
    .line 439
    .line 440
    const v15, -0x425c28f6    # -0.08f

    .line 441
    .line 442
    .line 443
    const/high16 v16, -0x40c00000    # -0.75f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const v17, -0x40cf5c29    # -0.69f

    .line 449
    .line 450
    .line 451
    const v18, -0x409eb852    # -0.88f

    .line 452
    .line 453
    .line 454
    const v13, -0x41dc28f6    # -0.16f

    .line 455
    .line 456
    .line 457
    const v14, -0x4151eb85    # -0.34f

    .line 458
    .line 459
    .line 460
    const v15, -0x413851ec    # -0.39f

    .line 461
    .line 462
    .line 463
    const v16, -0x40deb852    # -0.63f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, -0x40747ae1    # -1.09f

    .line 470
    .line 471
    .line 472
    const v18, -0x40e8f5c3    # -0.59f

    .line 473
    .line 474
    .line 475
    const v13, -0x41666666    # -0.3f

    .line 476
    .line 477
    .line 478
    const/high16 v14, -0x41800000    # -0.25f

    .line 479
    .line 480
    const v15, -0x40d70a3d    # -0.66f

    .line 481
    .line 482
    .line 483
    const v16, -0x411eb852    # -0.44f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v17, 0x41a3ae14    # 20.46f

    .line 490
    .line 491
    .line 492
    const/high16 v18, 0x41100000    # 9.0f

    .line 493
    .line 494
    const v13, 0x41abeb85    # 21.49f

    .line 495
    .line 496
    .line 497
    const v14, 0x41111eb8    # 9.07f

    .line 498
    .line 499
    .line 500
    const/high16 v15, 0x41a80000    # 21.0f

    .line 501
    .line 502
    const/high16 v16, 0x41100000    # 9.0f

    .line 503
    .line 504
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, -0x404e147b    # -1.39f

    .line 508
    .line 509
    .line 510
    const v18, 0x3e570a3d    # 0.21f

    .line 511
    .line 512
    .line 513
    const v13, -0x40fd70a4    # -0.51f

    .line 514
    .line 515
    .line 516
    const/4 v14, 0x0

    .line 517
    const v15, -0x40851eb8    # -0.98f

    .line 518
    .line 519
    .line 520
    const v16, 0x3d8f5c29    # 0.07f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, -0x407851ec    # -1.06f

    .line 527
    .line 528
    .line 529
    const v18, 0x3f11eb85    # 0.57f

    .line 530
    .line 531
    .line 532
    const v13, -0x412e147b    # -0.41f

    .line 533
    .line 534
    .line 535
    const v14, 0x3e0f5c29    # 0.14f

    .line 536
    .line 537
    .line 538
    const v15, -0x40bae148    # -0.77f

    .line 539
    .line 540
    .line 541
    const v16, 0x3ea8f5c3    # 0.33f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, -0x40d47ae1    # -0.67f

    .line 548
    .line 549
    .line 550
    const v18, 0x3f570a3d    # 0.84f

    .line 551
    .line 552
    .line 553
    const v13, -0x416b851f    # -0.29f

    .line 554
    .line 555
    .line 556
    const v14, 0x3e75c28f    # 0.24f

    .line 557
    .line 558
    .line 559
    const v15, -0x40fd70a4    # -0.51f

    .line 560
    .line 561
    .line 562
    const v16, 0x3f051eb8    # 0.52f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, -0x41947ae1    # -0.23f

    .line 569
    .line 570
    .line 571
    const v18, 0x3f8147ae    # 1.01f

    .line 572
    .line 573
    .line 574
    const v13, -0x41dc28f6    # -0.16f

    .line 575
    .line 576
    .line 577
    const v14, 0x3ea3d70a    # 0.32f

    .line 578
    .line 579
    .line 580
    const v15, -0x41947ae1    # -0.23f

    .line 581
    .line 582
    .line 583
    const v16, 0x3f266666    # 0.65f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x3e6b851f    # 0.23f

    .line 590
    .line 591
    .line 592
    const v2, 0x3f75c28f    # 0.96f

    .line 593
    .line 594
    .line 595
    const v4, 0x3da3d70a    # 0.08f

    .line 596
    .line 597
    .line 598
    const v6, 0x3f30a3d7    # 0.69f

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v17, 0x3f23d70a    # 0.64f

    .line 605
    .line 606
    .line 607
    const v18, 0x3f3ae148    # 0.73f

    .line 608
    .line 609
    .line 610
    const v13, 0x3e19999a    # 0.15f

    .line 611
    .line 612
    .line 613
    const v14, 0x3e8f5c29    # 0.28f

    .line 614
    .line 615
    .line 616
    const v15, 0x3eb851ec    # 0.36f

    .line 617
    .line 618
    .line 619
    const v16, 0x3f051eb8    # 0.52f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v17, 0x3f7ae148    # 0.98f

    .line 626
    .line 627
    .line 628
    const v18, 0x3f07ae14    # 0.53f

    .line 629
    .line 630
    .line 631
    const v13, 0x3e8a3d71    # 0.27f

    .line 632
    .line 633
    .line 634
    const v14, 0x3e570a3d    # 0.21f

    .line 635
    .line 636
    .line 637
    const v15, 0x3f19999a    # 0.6f

    .line 638
    .line 639
    .line 640
    const v16, 0x3ec28f5c    # 0.38f

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v17, 0x3fa28f5c    # 1.27f

    .line 647
    .line 648
    .line 649
    const v18, 0x3eb851ec    # 0.36f

    .line 650
    .line 651
    .line 652
    const v13, 0x3ec28f5c    # 0.38f

    .line 653
    .line 654
    .line 655
    const v14, 0x3e0f5c29    # 0.14f

    .line 656
    .line 657
    .line 658
    const v15, 0x3f4f5c29    # 0.81f

    .line 659
    .line 660
    .line 661
    const v16, 0x3e851eb8    # 0.26f

    .line 662
    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v17, 0x3f733333    # 0.95f

    .line 668
    .line 669
    .line 670
    const v18, 0x3e851eb8    # 0.26f

    .line 671
    .line 672
    .line 673
    const v13, 0x3ec7ae14    # 0.39f

    .line 674
    .line 675
    .line 676
    const v14, 0x3da3d70a    # 0.08f

    .line 677
    .line 678
    .line 679
    const v15, 0x3f35c28f    # 0.71f

    .line 680
    .line 681
    .line 682
    const v16, 0x3e2e147b    # 0.17f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const v0, 0x3f11eb85    # 0.57f

    .line 689
    .line 690
    .line 691
    const v2, 0x3e947ae1    # 0.29f

    .line 692
    .line 693
    .line 694
    const v4, 0x3edc28f6    # 0.43f

    .line 695
    .line 696
    .line 697
    const v6, 0x3e428f5c    # 0.19f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v17, 0x3e8a3d71    # 0.27f

    .line 704
    .line 705
    .line 706
    const v18, 0x3eae147b    # 0.34f

    .line 707
    .line 708
    .line 709
    const v13, 0x3e051eb8    # 0.13f

    .line 710
    .line 711
    .line 712
    const v14, 0x3dcccccd    # 0.1f

    .line 713
    .line 714
    .line 715
    const v15, 0x3e6147ae    # 0.22f

    .line 716
    .line 717
    .line 718
    const v16, 0x3e6147ae    # 0.22f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v17, 0x3d8f5c29    # 0.07f

    .line 725
    .line 726
    .line 727
    const v18, 0x3ec7ae14    # 0.39f

    .line 728
    .line 729
    .line 730
    const v13, 0x3d4ccccd    # 0.05f

    .line 731
    .line 732
    .line 733
    const v14, 0x3df5c28f    # 0.12f

    .line 734
    .line 735
    .line 736
    const v15, 0x3d8f5c29    # 0.07f

    .line 737
    .line 738
    .line 739
    const/high16 v16, 0x3e800000    # 0.25f

    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const v17, -0x41333333    # -0.4f

    .line 745
    .line 746
    .line 747
    const v18, 0x3f451eb8    # 0.77f

    .line 748
    .line 749
    .line 750
    const/4 v13, 0x0

    .line 751
    const v14, 0x3ea3d70a    # 0.32f

    .line 752
    .line 753
    .line 754
    const v15, -0x41fae148    # -0.13f

    .line 755
    .line 756
    .line 757
    const v16, 0x3f11eb85    # 0.57f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v17, -0x406a3d71    # -1.17f

    .line 764
    .line 765
    .line 766
    const v18, 0x3e947ae1    # 0.29f

    .line 767
    .line 768
    .line 769
    const v13, -0x4175c28f    # -0.27f

    .line 770
    .line 771
    .line 772
    const v14, 0x3e4ccccd    # 0.2f

    .line 773
    .line 774
    .line 775
    const v15, -0x40d70a3d    # -0.66f

    .line 776
    .line 777
    .line 778
    const v16, 0x3e947ae1    # 0.29f

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const v17, -0x40dc28f6    # -0.64f

    .line 785
    .line 786
    .line 787
    const v18, -0x425c28f6    # -0.08f

    .line 788
    .line 789
    .line 790
    const v13, -0x419eb852    # -0.22f

    .line 791
    .line 792
    .line 793
    const/4 v14, 0x0

    .line 794
    const v15, -0x4123d70a    # -0.43f

    .line 795
    .line 796
    .line 797
    const v16, -0x435c28f6    # -0.02f

    .line 798
    .line 799
    .line 800
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 801
    .line 802
    .line 803
    const v17, -0x40f0a3d7    # -0.56f

    .line 804
    .line 805
    .line 806
    const v18, -0x418a3d71    # -0.24f

    .line 807
    .line 808
    .line 809
    const v13, -0x41a8f5c3    # -0.21f

    .line 810
    .line 811
    .line 812
    const v14, -0x42b33333    # -0.05f

    .line 813
    .line 814
    .line 815
    const v15, -0x41333333    # -0.4f

    .line 816
    .line 817
    .line 818
    const v16, -0x41fae148    # -0.13f

    .line 819
    .line 820
    .line 821
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 822
    .line 823
    .line 824
    const v17, -0x412e147b    # -0.41f

    .line 825
    .line 826
    .line 827
    const v18, -0x411eb852    # -0.44f

    .line 828
    .line 829
    .line 830
    const v13, -0x41d1eb85    # -0.17f

    .line 831
    .line 832
    .line 833
    const v14, -0x421eb852    # -0.11f

    .line 834
    .line 835
    .line 836
    const v15, -0x41666666    # -0.3f

    .line 837
    .line 838
    .line 839
    const v16, -0x417ae148    # -0.26f

    .line 840
    .line 841
    .line 842
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const v17, -0x41c7ae14    # -0.18f

    .line 846
    .line 847
    .line 848
    const v18, -0x40d47ae1    # -0.67f

    .line 849
    .line 850
    .line 851
    const v13, -0x421eb852    # -0.11f

    .line 852
    .line 853
    .line 854
    const v14, -0x41c7ae14    # -0.18f

    .line 855
    .line 856
    .line 857
    const v15, -0x41d1eb85    # -0.17f

    .line 858
    .line 859
    .line 860
    const v16, -0x412e147b    # -0.41f

    .line 861
    .line 862
    .line 863
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const v0, -0x400e147b    # -1.89f

    .line 867
    .line 868
    .line 869
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v17, 0x3e75c28f    # 0.24f

    .line 873
    .line 874
    .line 875
    const v18, 0x3f866666    # 1.05f

    .line 876
    .line 877
    .line 878
    const/4 v13, 0x0

    .line 879
    const v14, 0x3eb851ec    # 0.36f

    .line 880
    .line 881
    .line 882
    const v15, 0x3da3d70a    # 0.08f

    .line 883
    .line 884
    .line 885
    const v16, 0x3f35c28f    # 0.71f

    .line 886
    .line 887
    .line 888
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 889
    .line 890
    .line 891
    const v17, 0x3f333333    # 0.7f

    .line 892
    .line 893
    .line 894
    const v18, 0x3f6e147b    # 0.93f

    .line 895
    .line 896
    .line 897
    const v13, 0x3e23d70a    # 0.16f

    .line 898
    .line 899
    .line 900
    const v14, 0x3eae147b    # 0.34f

    .line 901
    .line 902
    .line 903
    const v15, 0x3ec7ae14    # 0.39f

    .line 904
    .line 905
    .line 906
    const v16, 0x3f266666    # 0.65f

    .line 907
    .line 908
    .line 909
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 910
    .line 911
    .line 912
    const v17, 0x3f933333    # 1.15f

    .line 913
    .line 914
    .line 915
    const v18, 0x3f28f5c3    # 0.66f

    .line 916
    .line 917
    .line 918
    const v13, 0x3e9eb852    # 0.31f

    .line 919
    .line 920
    .line 921
    const v14, 0x3e8a3d71    # 0.27f

    .line 922
    .line 923
    .line 924
    const v15, 0x3f30a3d7    # 0.69f

    .line 925
    .line 926
    .line 927
    const v16, 0x3efae148    # 0.49f

    .line 928
    .line 929
    .line 930
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const v17, 0x3fca3d71    # 1.58f

    .line 934
    .line 935
    .line 936
    const/high16 v18, 0x3e800000    # 0.25f

    .line 937
    .line 938
    const v13, 0x3eeb851f    # 0.46f

    .line 939
    .line 940
    .line 941
    const v14, 0x3e2e147b    # 0.17f

    .line 942
    .line 943
    .line 944
    const v15, 0x3f7ae148    # 0.98f

    .line 945
    .line 946
    .line 947
    const/high16 v16, 0x3e800000    # 0.25f

    .line 948
    .line 949
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    const v17, 0x3fb851ec    # 1.44f

    .line 953
    .line 954
    .line 955
    const v18, -0x41bd70a4    # -0.19f

    .line 956
    .line 957
    .line 958
    const v13, 0x3f07ae14    # 0.53f

    .line 959
    .line 960
    .line 961
    const/4 v14, 0x0

    .line 962
    const v15, 0x3f8147ae    # 1.01f

    .line 963
    .line 964
    .line 965
    const v16, -0x428a3d71    # -0.06f

    .line 966
    .line 967
    .line 968
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    .line 971
    const v17, 0x3f8e147b    # 1.11f

    .line 972
    .line 973
    .line 974
    const v18, -0x40f5c28f    # -0.54f

    .line 975
    .line 976
    .line 977
    const v13, 0x3edc28f6    # 0.43f

    .line 978
    .line 979
    .line 980
    const v14, -0x41fae148    # -0.13f

    .line 981
    .line 982
    .line 983
    const v15, 0x3f4ccccd    # 0.8f

    .line 984
    .line 985
    .line 986
    const v16, -0x416147ae    # -0.31f

    .line 987
    .line 988
    .line 989
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 990
    .line 991
    .line 992
    const v17, 0x3f35c28f    # 0.71f

    .line 993
    .line 994
    .line 995
    const v18, -0x40ab851f    # -0.83f

    .line 996
    .line 997
    .line 998
    const v13, 0x3e9eb852    # 0.31f

    .line 999
    .line 1000
    .line 1001
    const v14, -0x41947ae1    # -0.23f

    .line 1002
    .line 1003
    .line 1004
    const v15, 0x3f0a3d71    # 0.54f

    .line 1005
    .line 1006
    .line 1007
    const v16, -0x40fd70a4    # -0.51f

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1011
    .line 1012
    .line 1013
    const/high16 v17, 0x3e800000    # 0.25f

    .line 1014
    .line 1015
    const v18, -0x407851ec    # -1.06f

    .line 1016
    .line 1017
    .line 1018
    const v13, 0x3e2e147b    # 0.17f

    .line 1019
    .line 1020
    .line 1021
    const v14, -0x415c28f6    # -0.32f

    .line 1022
    .line 1023
    .line 1024
    const/high16 v15, 0x3e800000    # 0.25f

    .line 1025
    .line 1026
    const v16, -0x40d47ae1    # -0.67f

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1030
    .line 1031
    .line 1032
    const v17, -0x418a3d71    # -0.24f

    .line 1033
    .line 1034
    .line 1035
    const v18, -0x407d70a4    # -1.02f

    .line 1036
    .line 1037
    .line 1038
    const v13, -0x435c28f6    # -0.02f

    .line 1039
    .line 1040
    .line 1041
    const v14, -0x41333333    # -0.4f

    .line 1042
    .line 1043
    .line 1044
    const v15, -0x4247ae14    # -0.09f

    .line 1045
    .line 1046
    .line 1047
    const v16, -0x40c28f5c    # -0.74f

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const v0, 0x415d1eb8    # 13.82f

    .line 1057
    .line 1058
    .line 1059
    const v2, 0x40e1999a    # 7.05f

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1063
    .line 1064
    .line 1065
    const v17, -0x40628f5c    # -1.23f

    .line 1066
    .line 1067
    .line 1068
    const v18, -0x409eb852    # -0.88f

    .line 1069
    .line 1070
    .line 1071
    const v13, -0x4151eb85    # -0.34f

    .line 1072
    .line 1073
    .line 1074
    const/high16 v15, -0x40c00000    # -0.75f

    .line 1075
    .line 1076
    const v16, -0x40cccccd    # -0.7f

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1080
    .line 1081
    .line 1082
    const v17, -0x40347ae1    # -1.59f

    .line 1083
    .line 1084
    .line 1085
    const v18, -0x4175c28f    # -0.27f

    .line 1086
    .line 1087
    .line 1088
    const v13, -0x410f5c29    # -0.47f

    .line 1089
    .line 1090
    .line 1091
    const v14, -0x41c7ae14    # -0.18f

    .line 1092
    .line 1093
    .line 1094
    const v15, -0x407eb852    # -1.01f

    .line 1095
    .line 1096
    .line 1097
    const v16, -0x4175c28f    # -0.27f

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1101
    .line 1102
    .line 1103
    const v18, 0x3e8a3d71    # 0.27f

    .line 1104
    .line 1105
    .line 1106
    const v13, -0x40eb851f    # -0.58f

    .line 1107
    .line 1108
    .line 1109
    const/4 v14, 0x0

    .line 1110
    const v15, -0x4071eb85    # -1.11f

    .line 1111
    .line 1112
    .line 1113
    const v16, 0x3db851ec    # 0.09f

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1117
    .line 1118
    .line 1119
    const v17, -0x40628f5c    # -1.23f

    .line 1120
    .line 1121
    .line 1122
    const v18, 0x3f6147ae    # 0.88f

    .line 1123
    .line 1124
    .line 1125
    const v13, -0x410a3d71    # -0.48f

    .line 1126
    .line 1127
    .line 1128
    const v14, 0x3e3851ec    # 0.18f

    .line 1129
    .line 1130
    .line 1131
    const v15, -0x409c28f6    # -0.89f

    .line 1132
    .line 1133
    .line 1134
    const v16, 0x3ef0a3d7    # 0.47f

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1138
    .line 1139
    .line 1140
    const v17, -0x40b5c28f    # -0.79f

    .line 1141
    .line 1142
    .line 1143
    const v18, 0x3fcb851f    # 1.59f

    .line 1144
    .line 1145
    .line 1146
    const v13, -0x4151eb85    # -0.34f

    .line 1147
    .line 1148
    .line 1149
    const v14, 0x3ed1eb85    # 0.41f

    .line 1150
    .line 1151
    .line 1152
    const v15, -0x40e66666    # -0.6f

    .line 1153
    .line 1154
    .line 1155
    const v16, 0x3f6e147b    # 0.93f

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1159
    .line 1160
    .line 1161
    const v17, -0x4170a3d7    # -0.28f

    .line 1162
    .line 1163
    .line 1164
    const v18, 0x4018f5c3    # 2.39f

    .line 1165
    .line 1166
    .line 1167
    const v13, -0x41c7ae14    # -0.18f

    .line 1168
    .line 1169
    .line 1170
    const v14, 0x3f266666    # 0.65f

    .line 1171
    .line 1172
    .line 1173
    const v15, -0x4170a3d7    # -0.28f

    .line 1174
    .line 1175
    .line 1176
    const v16, 0x3fb9999a    # 1.45f

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1180
    .line 1181
    .line 1182
    const v0, 0x3ff5c28f    # 1.92f

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1186
    .line 1187
    .line 1188
    const v17, 0x3e8f5c29    # 0.28f

    .line 1189
    .line 1190
    .line 1191
    const/4 v13, 0x0

    .line 1192
    const v14, 0x3f70a3d7    # 0.94f

    .line 1193
    .line 1194
    .line 1195
    const v15, 0x3db851ec    # 0.09f

    .line 1196
    .line 1197
    .line 1198
    const v16, 0x3fdeb852    # 1.74f

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1202
    .line 1203
    .line 1204
    const v17, 0x3f4ccccd    # 0.8f

    .line 1205
    .line 1206
    .line 1207
    const v18, 0x3fcccccd    # 1.6f

    .line 1208
    .line 1209
    .line 1210
    const v13, 0x3e428f5c    # 0.19f

    .line 1211
    .line 1212
    .line 1213
    const v14, 0x3f28f5c3    # 0.66f

    .line 1214
    .line 1215
    .line 1216
    const v15, 0x3ee66666    # 0.45f

    .line 1217
    .line 1218
    .line 1219
    const v16, 0x3f9851ec    # 1.19f

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1223
    .line 1224
    .line 1225
    const v17, 0x3f9d70a4    # 1.23f

    .line 1226
    .line 1227
    .line 1228
    const v18, 0x3f63d70a    # 0.89f

    .line 1229
    .line 1230
    .line 1231
    const v13, 0x3eae147b    # 0.34f

    .line 1232
    .line 1233
    .line 1234
    const v14, 0x3ed1eb85    # 0.41f

    .line 1235
    .line 1236
    .line 1237
    const/high16 v15, 0x3f400000    # 0.75f

    .line 1238
    .line 1239
    const v16, 0x3f35c28f    # 0.71f

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1243
    .line 1244
    .line 1245
    const v17, 0x3fcb851f    # 1.59f

    .line 1246
    .line 1247
    .line 1248
    const v18, 0x3e8f5c29    # 0.28f

    .line 1249
    .line 1250
    .line 1251
    const v13, 0x3ef5c28f    # 0.48f

    .line 1252
    .line 1253
    .line 1254
    const v14, 0x3e3851ec    # 0.18f

    .line 1255
    .line 1256
    .line 1257
    const v15, 0x3f8147ae    # 1.01f

    .line 1258
    .line 1259
    .line 1260
    const v16, 0x3e8f5c29    # 0.28f

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1264
    .line 1265
    .line 1266
    const v18, -0x4170a3d7    # -0.28f

    .line 1267
    .line 1268
    .line 1269
    const v13, 0x3f170a3d    # 0.59f

    .line 1270
    .line 1271
    .line 1272
    const/4 v14, 0x0

    .line 1273
    const v15, 0x3f8f5c29    # 1.12f

    .line 1274
    .line 1275
    .line 1276
    const v16, -0x4247ae14    # -0.09f

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1280
    .line 1281
    .line 1282
    const v17, 0x3f9c28f6    # 1.22f

    .line 1283
    .line 1284
    .line 1285
    const v18, -0x409c28f6    # -0.89f

    .line 1286
    .line 1287
    .line 1288
    const v13, 0x3ef5c28f    # 0.48f

    .line 1289
    .line 1290
    .line 1291
    const v14, -0x41c7ae14    # -0.18f

    .line 1292
    .line 1293
    .line 1294
    const v15, 0x3f6147ae    # 0.88f

    .line 1295
    .line 1296
    .line 1297
    const v16, -0x410a3d71    # -0.48f

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1301
    .line 1302
    .line 1303
    const v17, 0x3f47ae14    # 0.78f

    .line 1304
    .line 1305
    .line 1306
    const v18, -0x40333333    # -1.6f

    .line 1307
    .line 1308
    .line 1309
    const v13, 0x3eae147b    # 0.34f

    .line 1310
    .line 1311
    .line 1312
    const v14, -0x412e147b    # -0.41f

    .line 1313
    .line 1314
    .line 1315
    const v15, 0x3f19999a    # 0.6f

    .line 1316
    .line 1317
    .line 1318
    const v16, -0x408f5c29    # -0.94f

    .line 1319
    .line 1320
    .line 1321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1322
    .line 1323
    .line 1324
    const v17, 0x3e8f5c29    # 0.28f

    .line 1325
    .line 1326
    .line 1327
    const v18, -0x3fe70a3d    # -2.39f

    .line 1328
    .line 1329
    .line 1330
    const v13, 0x3e3851ec    # 0.18f

    .line 1331
    .line 1332
    .line 1333
    const v14, -0x40d9999a    # -0.65f

    .line 1334
    .line 1335
    .line 1336
    const v15, 0x3e8f5c29    # 0.28f

    .line 1337
    .line 1338
    .line 1339
    const v16, -0x40466666    # -1.45f

    .line 1340
    .line 1341
    .line 1342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1343
    .line 1344
    .line 1345
    const v0, -0x400a3d71    # -1.92f

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1349
    .line 1350
    .line 1351
    const v17, -0x4170a3d7    # -0.28f

    .line 1352
    .line 1353
    .line 1354
    const/4 v13, 0x0

    .line 1355
    const v14, -0x408f5c29    # -0.94f

    .line 1356
    .line 1357
    .line 1358
    const v15, -0x4247ae14    # -0.09f

    .line 1359
    .line 1360
    .line 1361
    const v16, -0x402147ae    # -1.74f

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1365
    .line 1366
    .line 1367
    const v17, -0x40b851ec    # -0.78f

    .line 1368
    .line 1369
    .line 1370
    const v18, -0x40347ae1    # -1.59f

    .line 1371
    .line 1372
    .line 1373
    const v13, -0x41c7ae14    # -0.18f

    .line 1374
    .line 1375
    .line 1376
    const v14, -0x40d70a3d    # -0.66f

    .line 1377
    .line 1378
    .line 1379
    const v15, -0x411eb852    # -0.44f

    .line 1380
    .line 1381
    .line 1382
    const v16, -0x4067ae14    # -1.19f

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1389
    .line 1390
    .line 1391
    const v0, 0x414e6666    # 12.9f

    .line 1392
    .line 1393
    .line 1394
    const v2, 0x4153851f    # 13.22f

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1398
    .line 1399
    .line 1400
    const v17, -0x420a3d71    # -0.12f

    .line 1401
    .line 1402
    .line 1403
    const v18, 0x3fc3d70a    # 1.53f

    .line 1404
    .line 1405
    .line 1406
    const/4 v13, 0x0

    .line 1407
    const v14, 0x3f19999a    # 0.6f

    .line 1408
    .line 1409
    .line 1410
    const v15, -0x42dc28f6    # -0.04f

    .line 1411
    .line 1412
    .line 1413
    const v16, 0x3f8e147b    # 1.11f

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1417
    .line 1418
    .line 1419
    const v17, -0x4147ae14    # -0.36f

    .line 1420
    .line 1421
    .line 1422
    const v18, 0x3f828f5c    # 1.02f

    .line 1423
    .line 1424
    .line 1425
    const v13, -0x425c28f6    # -0.08f

    .line 1426
    .line 1427
    .line 1428
    const v14, 0x3ed70a3d    # 0.42f

    .line 1429
    .line 1430
    .line 1431
    const v15, -0x41b33333    # -0.2f

    .line 1432
    .line 1433
    .line 1434
    const v16, 0x3f428f5c    # 0.76f

    .line 1435
    .line 1436
    .line 1437
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1438
    .line 1439
    .line 1440
    const v17, -0x40e8f5c3    # -0.59f

    .line 1441
    .line 1442
    .line 1443
    const v18, 0x3f11eb85    # 0.57f

    .line 1444
    .line 1445
    .line 1446
    const v13, -0x41dc28f6    # -0.16f

    .line 1447
    .line 1448
    .line 1449
    const v14, 0x3e851eb8    # 0.26f

    .line 1450
    .line 1451
    .line 1452
    const v15, -0x4147ae14    # -0.36f

    .line 1453
    .line 1454
    .line 1455
    const v16, 0x3ee66666    # 0.45f

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1459
    .line 1460
    .line 1461
    const v17, -0x40ae147b    # -0.82f

    .line 1462
    .line 1463
    .line 1464
    const v18, 0x3e3851ec    # 0.18f

    .line 1465
    .line 1466
    .line 1467
    const v13, -0x41947ae1    # -0.23f

    .line 1468
    .line 1469
    .line 1470
    const v14, 0x3df5c28f    # 0.12f

    .line 1471
    .line 1472
    .line 1473
    const v15, -0x40fd70a4    # -0.51f

    .line 1474
    .line 1475
    .line 1476
    const v16, 0x3e3851ec    # 0.18f

    .line 1477
    .line 1478
    .line 1479
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1480
    .line 1481
    .line 1482
    const v18, -0x41c7ae14    # -0.18f

    .line 1483
    .line 1484
    .line 1485
    const v13, -0x41666666    # -0.3f

    .line 1486
    .line 1487
    .line 1488
    const/4 v14, 0x0

    .line 1489
    const v15, -0x40eb851f    # -0.58f

    .line 1490
    .line 1491
    .line 1492
    const v16, -0x428a3d71    # -0.06f

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1496
    .line 1497
    .line 1498
    const v0, -0x40e66666    # -0.6f

    .line 1499
    .line 1500
    .line 1501
    const v2, -0x40ee147b    # -0.57f

    .line 1502
    .line 1503
    .line 1504
    const v4, -0x411eb852    # -0.44f

    .line 1505
    .line 1506
    .line 1507
    const v6, -0x416147ae    # -0.31f

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1511
    .line 1512
    .line 1513
    const v17, -0x413d70a4    # -0.38f

    .line 1514
    .line 1515
    .line 1516
    const v18, -0x407d70a4    # -1.02f

    .line 1517
    .line 1518
    .line 1519
    const v13, -0x41dc28f6    # -0.16f

    .line 1520
    .line 1521
    .line 1522
    const v14, -0x417ae148    # -0.26f

    .line 1523
    .line 1524
    .line 1525
    const v15, -0x416b851f    # -0.29f

    .line 1526
    .line 1527
    .line 1528
    const v16, -0x40e66666    # -0.6f

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1532
    .line 1533
    .line 1534
    const v17, -0x41fae148    # -0.13f

    .line 1535
    .line 1536
    .line 1537
    const v18, -0x403c28f6    # -1.53f

    .line 1538
    .line 1539
    .line 1540
    const v13, -0x4247ae14    # -0.09f

    .line 1541
    .line 1542
    .line 1543
    const v14, -0x4128f5c3    # -0.42f

    .line 1544
    .line 1545
    .line 1546
    const v15, -0x41fae148    # -0.13f

    .line 1547
    .line 1548
    .line 1549
    const v16, -0x4091eb85    # -0.93f

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1553
    .line 1554
    .line 1555
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 1556
    .line 1557
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1558
    .line 1559
    .line 1560
    const v17, 0x3e051eb8    # 0.13f

    .line 1561
    .line 1562
    .line 1563
    const v18, -0x403d70a4    # -1.52f

    .line 1564
    .line 1565
    .line 1566
    const/4 v13, 0x0

    .line 1567
    const v14, -0x40e66666    # -0.6f

    .line 1568
    .line 1569
    .line 1570
    const v15, 0x3d23d70a    # 0.04f

    .line 1571
    .line 1572
    .line 1573
    const v16, -0x4071eb85    # -1.11f

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1577
    .line 1578
    .line 1579
    const v17, 0x3ec28f5c    # 0.38f

    .line 1580
    .line 1581
    .line 1582
    const/high16 v18, -0x40800000    # -1.0f

    .line 1583
    .line 1584
    const v13, 0x3db851ec    # 0.09f

    .line 1585
    .line 1586
    .line 1587
    const v14, -0x412e147b    # -0.41f

    .line 1588
    .line 1589
    .line 1590
    const v15, 0x3e570a3d    # 0.21f

    .line 1591
    .line 1592
    .line 1593
    const v16, -0x40c28f5c    # -0.74f

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1597
    .line 1598
    .line 1599
    const v17, 0x3f19999a    # 0.6f

    .line 1600
    .line 1601
    .line 1602
    const v18, -0x40f33333    # -0.55f

    .line 1603
    .line 1604
    .line 1605
    const v13, 0x3e23d70a    # 0.16f

    .line 1606
    .line 1607
    .line 1608
    const/high16 v14, -0x41800000    # -0.25f

    .line 1609
    .line 1610
    const v15, 0x3eb851ec    # 0.36f

    .line 1611
    .line 1612
    .line 1613
    const v16, -0x4123d70a    # -0.43f

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1617
    .line 1618
    .line 1619
    const v17, 0x3f4f5c29    # 0.81f

    .line 1620
    .line 1621
    .line 1622
    const v18, -0x41d1eb85    # -0.17f

    .line 1623
    .line 1624
    .line 1625
    const v13, 0x3e75c28f    # 0.24f

    .line 1626
    .line 1627
    .line 1628
    const v14, -0x421eb852    # -0.11f

    .line 1629
    .line 1630
    .line 1631
    const v15, 0x3f028f5c    # 0.51f

    .line 1632
    .line 1633
    .line 1634
    const v16, -0x41d1eb85    # -0.17f

    .line 1635
    .line 1636
    .line 1637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1638
    .line 1639
    .line 1640
    const v18, 0x3e2e147b    # 0.17f

    .line 1641
    .line 1642
    .line 1643
    const v13, 0x3e9eb852    # 0.31f

    .line 1644
    .line 1645
    .line 1646
    const/4 v14, 0x0

    .line 1647
    const v15, 0x3f147ae1    # 0.58f

    .line 1648
    .line 1649
    .line 1650
    const v16, 0x3d75c28f    # 0.06f

    .line 1651
    .line 1652
    .line 1653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1654
    .line 1655
    .line 1656
    const v17, 0x3f19999a    # 0.6f

    .line 1657
    .line 1658
    .line 1659
    const v18, 0x3f0ccccd    # 0.55f

    .line 1660
    .line 1661
    .line 1662
    const v13, 0x3e75c28f    # 0.24f

    .line 1663
    .line 1664
    .line 1665
    const v14, 0x3de147ae    # 0.11f

    .line 1666
    .line 1667
    .line 1668
    const v15, 0x3ee147ae    # 0.44f

    .line 1669
    .line 1670
    .line 1671
    const v16, 0x3e947ae1    # 0.29f

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1675
    .line 1676
    .line 1677
    const v17, 0x3ebd70a4    # 0.37f

    .line 1678
    .line 1679
    .line 1680
    const v18, 0x3f7d70a4    # 0.99f

    .line 1681
    .line 1682
    .line 1683
    const v13, 0x3e23d70a    # 0.16f

    .line 1684
    .line 1685
    .line 1686
    const/high16 v14, 0x3e800000    # 0.25f

    .line 1687
    .line 1688
    const v15, 0x3e947ae1    # 0.29f

    .line 1689
    .line 1690
    .line 1691
    const v16, 0x3f147ae1    # 0.58f

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1695
    .line 1696
    .line 1697
    const v17, 0x3e051eb8    # 0.13f

    .line 1698
    .line 1699
    .line 1700
    const v18, 0x3fc28f5c    # 1.52f

    .line 1701
    .line 1702
    .line 1703
    const v13, 0x3da3d70a    # 0.08f

    .line 1704
    .line 1705
    .line 1706
    const v14, 0x3ed1eb85    # 0.41f

    .line 1707
    .line 1708
    .line 1709
    const v15, 0x3e051eb8    # 0.13f

    .line 1710
    .line 1711
    .line 1712
    const v16, 0x3f6b851f    # 0.92f

    .line 1713
    .line 1714
    .line 1715
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1716
    .line 1717
    .line 1718
    const v0, 0x4020a3d7    # 2.51f

    .line 1719
    .line 1720
    .line 1721
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v2

    .line 1731
    const/16 v16, 0x3800

    .line 1732
    .line 1733
    const/16 v17, 0x0

    .line 1734
    .line 1735
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1736
    .line 1737
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1738
    .line 1739
    const/4 v7, 0x0

    .line 1740
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1741
    .line 1742
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1743
    .line 1744
    const/4 v13, 0x0

    .line 1745
    const/4 v14, 0x0

    .line 1746
    const/4 v15, 0x0

    .line 1747
    const-string v4, ""

    .line 1748
    .line 1749
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v0

    .line 1753
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v0

    .line 1757
    sput-object v0, Landroidx/compose/material/icons/filled/Timer10Kt;->_timer10:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1758
    .line 1759
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1760
    .line 1761
    .line 1762
    return-object v0
.end method

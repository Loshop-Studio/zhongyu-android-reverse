.class public final Landroidx/compose/material/icons/twotone/CopyrightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _copyright:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCopyright(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/CopyrightKt;->_copyright:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Copyright"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4065c28f    # 3.59f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f9a3d71    # -3.59f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f000000    # -8.0f

    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, 0x41523d71    # 13.14f

    .line 121
    .line 122
    .line 123
    const v6, 0x412147ae    # 10.08f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v25, 0x3e99999a    # 0.3f

    .line 130
    .line 131
    .line 132
    const v26, 0x3f6147ae    # 0.88f

    .line 133
    .line 134
    .line 135
    const v21, 0x3d4ccccd    # 0.05f

    .line 136
    .line 137
    .line 138
    const v22, 0x3ea8f5c3    # 0.33f

    .line 139
    .line 140
    .line 141
    const v23, 0x3e23d70a    # 0.16f

    .line 142
    .line 143
    .line 144
    const v24, 0x3f2147ae    # 0.63f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x3eeb851f    # 0.46f

    .line 151
    .line 152
    .line 153
    const v6, 0x3f1eb852    # 0.62f

    .line 154
    .line 155
    .line 156
    const v7, 0x3f170a3d    # 0.59f

    .line 157
    .line 158
    .line 159
    const v8, 0x3eae147b    # 0.34f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v25, 0x3f63d70a    # 0.89f

    .line 166
    .line 167
    .line 168
    const v26, 0x3e6b851f    # 0.23f

    .line 169
    .line 170
    .line 171
    const v21, 0x3e6b851f    # 0.23f

    .line 172
    .line 173
    .line 174
    const v22, 0x3e19999a    # 0.15f

    .line 175
    .line 176
    .line 177
    const v23, 0x3f07ae14    # 0.53f

    .line 178
    .line 179
    .line 180
    const v24, 0x3e6147ae    # 0.22f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v25, 0x3f19999a    # 0.6f

    .line 187
    .line 188
    .line 189
    const v26, -0x42333333    # -0.1f

    .line 190
    .line 191
    .line 192
    const v21, 0x3e570a3d    # 0.21f

    .line 193
    .line 194
    .line 195
    const v22, -0x43dc28f6    # -0.01f

    .line 196
    .line 197
    .line 198
    const v23, 0x3ed1eb85    # 0.41f

    .line 199
    .line 200
    .line 201
    const v24, -0x430a3d71    # -0.03f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v25, 0x3f051eb8    # 0.52f

    .line 208
    .line 209
    .line 210
    const v26, -0x41666666    # -0.3f

    .line 211
    .line 212
    .line 213
    const v21, 0x3e4ccccd    # 0.2f

    .line 214
    .line 215
    .line 216
    const v22, -0x4270a3d7    # -0.07f

    .line 217
    .line 218
    .line 219
    const v23, 0x3ebd70a4    # 0.37f

    .line 220
    .line 221
    .line 222
    const v24, -0x41d1eb85    # -0.17f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v25, 0x3eb851ec    # 0.36f

    .line 229
    .line 230
    .line 231
    const v26, -0x41147ae1    # -0.46f

    .line 232
    .line 233
    .line 234
    const v21, 0x3e19999a    # 0.15f

    .line 235
    .line 236
    .line 237
    const v22, -0x41fae148    # -0.13f

    .line 238
    .line 239
    .line 240
    const v23, 0x3e8a3d71    # 0.27f

    .line 241
    .line 242
    .line 243
    const v24, -0x4170a3d7    # -0.28f

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v25, 0x3e19999a    # 0.15f

    .line 250
    .line 251
    .line 252
    const v26, -0x40eb851f    # -0.58f

    .line 253
    .line 254
    .line 255
    const v21, 0x3db851ec    # 0.09f

    .line 256
    .line 257
    .line 258
    const v22, -0x41c7ae14    # -0.18f

    .line 259
    .line 260
    .line 261
    const v23, 0x3e0f5c29    # 0.14f

    .line 262
    .line 263
    .line 264
    const v24, -0x41428f5c    # -0.37f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v4, 0x3fe51eb8    # 1.79f

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v25, -0x41666666    # -0.3f

    .line 277
    .line 278
    .line 279
    const v26, 0x3f933333    # 1.15f

    .line 280
    .line 281
    .line 282
    const v21, -0x43dc28f6    # -0.01f

    .line 283
    .line 284
    .line 285
    const v22, 0x3ed1eb85    # 0.41f

    .line 286
    .line 287
    .line 288
    const v23, -0x420a3d71    # -0.12f

    .line 289
    .line 290
    .line 291
    const v24, 0x3f4a3d71    # 0.79f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v25, -0x40c28f5c    # -0.74f

    .line 298
    .line 299
    .line 300
    const v26, 0x3f70a3d7    # 0.94f

    .line 301
    .line 302
    .line 303
    const v21, -0x41c7ae14    # -0.18f

    .line 304
    .line 305
    .line 306
    const v22, 0x3eb851ec    # 0.36f

    .line 307
    .line 308
    .line 309
    const v23, -0x4123d70a    # -0.43f

    .line 310
    .line 311
    .line 312
    const v24, 0x3f2b851f    # 0.67f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v25, -0x4075c28f    # -1.08f

    .line 319
    .line 320
    .line 321
    const v26, 0x3f2147ae    # 0.63f

    .line 322
    .line 323
    .line 324
    const v21, -0x416147ae    # -0.31f

    .line 325
    .line 326
    .line 327
    const v22, 0x3e8a3d71    # 0.27f

    .line 328
    .line 329
    .line 330
    const v23, -0x40d47ae1    # -0.67f

    .line 331
    .line 332
    .line 333
    const v24, 0x3ef5c28f    # 0.48f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v25, -0x40570a3d    # -1.32f

    .line 340
    .line 341
    .line 342
    const v26, 0x3e6b851f    # 0.23f

    .line 343
    .line 344
    .line 345
    const v21, -0x412e147b    # -0.41f

    .line 346
    .line 347
    .line 348
    const v22, 0x3e19999a    # 0.15f

    .line 349
    .line 350
    .line 351
    const v23, -0x40a66666    # -0.85f

    .line 352
    .line 353
    .line 354
    const v24, 0x3e6b851f    # 0.23f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v25, -0x40266666    # -1.7f

    .line 361
    .line 362
    .line 363
    const v26, -0x4151eb85    # -0.34f

    .line 364
    .line 365
    .line 366
    const v21, -0x40d9999a    # -0.65f

    .line 367
    .line 368
    .line 369
    const/16 v22, 0x0

    .line 370
    .line 371
    const v23, -0x4063d70a    # -1.22f

    .line 372
    .line 373
    .line 374
    const v24, -0x420a3d71    # -0.12f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v25, -0x40666666    # -1.2f

    .line 381
    .line 382
    .line 383
    const v26, -0x40970a3d    # -0.91f

    .line 384
    .line 385
    .line 386
    const v21, -0x410a3d71    # -0.48f

    .line 387
    .line 388
    .line 389
    const v22, -0x419eb852    # -0.22f

    .line 390
    .line 391
    .line 392
    const v23, -0x409eb852    # -0.88f

    .line 393
    .line 394
    .line 395
    const v24, -0x40f851ec    # -0.53f

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v4, -0x40ab851f    # -0.83f

    .line 402
    .line 403
    .line 404
    const v6, -0x40533333    # -1.35f

    .line 405
    .line 406
    .line 407
    const v7, -0x40ca3d71    # -0.71f

    .line 408
    .line 409
    .line 410
    const v8, -0x40f0a3d7    # -0.56f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v25, -0x41947ae1    # -0.23f

    .line 417
    .line 418
    .line 419
    const v26, -0x402e147b    # -1.64f

    .line 420
    .line 421
    .line 422
    const v21, -0x41e66666    # -0.15f

    .line 423
    .line 424
    .line 425
    const v22, -0x40fae148    # -0.52f

    .line 426
    .line 427
    .line 428
    const v23, -0x41947ae1    # -0.23f

    .line 429
    .line 430
    .line 431
    const v24, -0x407851ec    # -1.06f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v4, -0x4175c28f    # -0.27f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v25, 0x3e75c28f    # 0.24f

    .line 444
    .line 445
    .line 446
    const/16 v21, 0x0

    .line 447
    .line 448
    const v22, -0x40eb851f    # -0.58f

    .line 449
    .line 450
    .line 451
    const v23, 0x3db851ec    # 0.09f

    .line 452
    .line 453
    .line 454
    const v24, -0x4070a3d7    # -1.12f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v25, 0x3f35c28f    # 0.71f

    .line 461
    .line 462
    .line 463
    const v26, -0x4051eb85    # -1.36f

    .line 464
    .line 465
    .line 466
    const v21, 0x3e19999a    # 0.15f

    .line 467
    .line 468
    .line 469
    const v22, -0x40fae148    # -0.52f

    .line 470
    .line 471
    .line 472
    const v23, 0x3ec7ae14    # 0.39f

    .line 473
    .line 474
    .line 475
    const v24, -0x4087ae14    # -0.97f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v4, -0x40cf5c29    # -0.69f

    .line 482
    .line 483
    .line 484
    const v6, -0x40947ae1    # -0.92f

    .line 485
    .line 486
    .line 487
    const v7, 0x3f99999a    # 1.2f

    .line 488
    .line 489
    .line 490
    const v8, 0x3f3851ec    # 0.72f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v25, 0x3fd9999a    # 1.7f

    .line 497
    .line 498
    .line 499
    const v26, -0x4151eb85    # -0.34f

    .line 500
    .line 501
    .line 502
    const v21, 0x3ef5c28f    # 0.48f

    .line 503
    .line 504
    .line 505
    const v22, -0x41947ae1    # -0.23f

    .line 506
    .line 507
    .line 508
    const v23, 0x3f866666    # 1.05f

    .line 509
    .line 510
    .line 511
    const v24, -0x4151eb85    # -0.34f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v25, 0x3fb1eb85    # 1.39f

    .line 518
    .line 519
    .line 520
    const v26, 0x3e6b851f    # 0.23f

    .line 521
    .line 522
    .line 523
    const v21, 0x3f028f5c    # 0.51f

    .line 524
    .line 525
    .line 526
    const/16 v22, 0x0

    .line 527
    .line 528
    const v23, 0x3f7851ec    # 0.97f

    .line 529
    .line 530
    .line 531
    const v24, 0x3d8f5c29    # 0.07f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v25, 0x3f8a3d71    # 1.08f

    .line 538
    .line 539
    .line 540
    const v26, 0x3f28f5c3    # 0.66f

    .line 541
    .line 542
    .line 543
    const v21, 0x3ed70a3d    # 0.42f

    .line 544
    .line 545
    .line 546
    const v22, 0x3e23d70a    # 0.16f

    .line 547
    .line 548
    .line 549
    const v23, 0x3f47ae14    # 0.78f

    .line 550
    .line 551
    .line 552
    const v24, 0x3ec28f5c    # 0.38f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v25, 0x3f333333    # 0.7f

    .line 559
    .line 560
    .line 561
    const v26, 0x3f8147ae    # 1.01f

    .line 562
    .line 563
    .line 564
    const v21, 0x3e99999a    # 0.3f

    .line 565
    .line 566
    .line 567
    const v22, 0x3e8f5c29    # 0.28f

    .line 568
    .line 569
    .line 570
    const v23, 0x3f07ae14    # 0.53f

    .line 571
    .line 572
    .line 573
    const v24, 0x3f1eb852    # 0.62f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v25, 0x3e8f5c29    # 0.28f

    .line 580
    .line 581
    .line 582
    const v26, 0x3fa51eb8    # 1.29f

    .line 583
    .line 584
    .line 585
    const v21, 0x3e2e147b    # 0.17f

    .line 586
    .line 587
    .line 588
    const v22, 0x3ec7ae14    # 0.39f

    .line 589
    .line 590
    .line 591
    const v23, 0x3e851eb8    # 0.26f

    .line 592
    .line 593
    .line 594
    const v24, 0x3f51eb85    # 0.82f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const v4, -0x401ae148    # -1.79f

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const v25, -0x41f0a3d7    # -0.14f

    .line 607
    .line 608
    .line 609
    const v26, -0x40dc28f6    # -0.64f

    .line 610
    .line 611
    .line 612
    const v21, -0x43dc28f6    # -0.01f

    .line 613
    .line 614
    .line 615
    const v22, -0x419eb852    # -0.22f

    .line 616
    .line 617
    .line 618
    const v23, -0x42b33333    # -0.05f

    .line 619
    .line 620
    .line 621
    const v24, -0x411eb852    # -0.44f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v25, -0x4151eb85    # -0.34f

    .line 628
    .line 629
    .line 630
    const v26, -0x40f851ec    # -0.53f

    .line 631
    .line 632
    .line 633
    const v21, -0x4247ae14    # -0.09f

    .line 634
    .line 635
    .line 636
    const v22, -0x41b33333    # -0.2f

    .line 637
    .line 638
    .line 639
    const v23, -0x41b33333    # -0.2f

    .line 640
    .line 641
    .line 642
    const v24, -0x413d70a4    # -0.38f

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v25, -0x40fae148    # -0.52f

    .line 649
    .line 650
    .line 651
    const v26, -0x4147ae14    # -0.36f

    .line 652
    .line 653
    .line 654
    const v21, -0x41f0a3d7    # -0.14f

    .line 655
    .line 656
    .line 657
    const v22, -0x41e66666    # -0.15f

    .line 658
    .line 659
    .line 660
    const v23, -0x415c28f6    # -0.32f

    .line 661
    .line 662
    .line 663
    const v24, -0x4175c28f    # -0.27f

    .line 664
    .line 665
    .line 666
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    const v25, -0x40deb852    # -0.63f

    .line 670
    .line 671
    .line 672
    const v26, -0x41fae148    # -0.13f

    .line 673
    .line 674
    .line 675
    const v21, -0x41bd70a4    # -0.19f

    .line 676
    .line 677
    .line 678
    const v22, -0x425c28f6    # -0.08f

    .line 679
    .line 680
    .line 681
    const v23, -0x41333333    # -0.4f

    .line 682
    .line 683
    .line 684
    const v24, -0x420a3d71    # -0.12f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v25, -0x40970a3d    # -0.91f

    .line 691
    .line 692
    .line 693
    const v26, 0x3e6b851f    # 0.23f

    .line 694
    .line 695
    .line 696
    const v21, -0x41428f5c    # -0.37f

    .line 697
    .line 698
    .line 699
    const v22, 0x3c23d70a    # 0.01f

    .line 700
    .line 701
    .line 702
    const v23, -0x40d47ae1    # -0.67f

    .line 703
    .line 704
    .line 705
    const v24, 0x3da3d70a    # 0.08f

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const v25, -0x40e8f5c3    # -0.59f

    .line 712
    .line 713
    .line 714
    const v26, 0x3f1eb852    # 0.62f

    .line 715
    .line 716
    .line 717
    const/high16 v21, -0x41800000    # -0.25f

    .line 718
    .line 719
    const v22, 0x3e23d70a    # 0.16f

    .line 720
    .line 721
    .line 722
    const v23, -0x4119999a    # -0.45f

    .line 723
    .line 724
    .line 725
    const v24, 0x3ebd70a4    # 0.37f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v4, 0x3f0a3d71    # 0.54f

    .line 732
    .line 733
    .line 734
    const v6, 0x3f5eb852    # 0.87f

    .line 735
    .line 736
    .line 737
    const v7, -0x41666666    # -0.3f

    .line 738
    .line 739
    .line 740
    const/high16 v8, -0x41800000    # -0.25f

    .line 741
    .line 742
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const v25, -0x425c28f6    # -0.08f

    .line 746
    .line 747
    .line 748
    const v26, 0x3f8147ae    # 1.01f

    .line 749
    .line 750
    .line 751
    const v21, -0x42b33333    # -0.05f

    .line 752
    .line 753
    .line 754
    const v22, 0x3ea8f5c3    # 0.33f

    .line 755
    .line 756
    .line 757
    const v23, -0x425c28f6    # -0.08f

    .line 758
    .line 759
    .line 760
    const v24, 0x3f28f5c3    # 0.66f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v4, 0x3e8a3d71    # 0.27f

    .line 767
    .line 768
    .line 769
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const v25, 0x3da3d70a    # 0.08f

    .line 773
    .line 774
    .line 775
    const/high16 v26, 0x3f800000    # 1.0f

    .line 776
    .line 777
    const/16 v21, 0x0

    .line 778
    .line 779
    const v23, 0x3cf5c28f    # 0.03f

    .line 780
    .line 781
    .line 782
    const v24, 0x3f2b851f    # 0.67f

    .line 783
    .line 784
    .line 785
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    const/16 v16, 0x3800

    .line 796
    .line 797
    const/16 v17, 0x0

    .line 798
    .line 799
    const v6, 0x3e99999a    # 0.3f

    .line 800
    .line 801
    .line 802
    const v8, 0x3e99999a    # 0.3f

    .line 803
    .line 804
    .line 805
    const/4 v7, 0x0

    .line 806
    const/high16 v9, 0x3f800000    # 1.0f

    .line 807
    .line 808
    const/high16 v12, 0x3f800000    # 1.0f

    .line 809
    .line 810
    const/4 v13, 0x0

    .line 811
    const/4 v14, 0x0

    .line 812
    const/4 v15, 0x0

    .line 813
    const-string v4, ""

    .line 814
    .line 815
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 816
    .line 817
    .line 818
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 819
    .line 820
    .line 821
    move-result v3

    .line 822
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 823
    .line 824
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 825
    .line 826
    .line 827
    move-result-wide v6

    .line 828
    const/4 v0, 0x0

    .line 829
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 833
    .line 834
    .line 835
    move-result v10

    .line 836
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 837
    .line 838
    .line 839
    move-result v11

    .line 840
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 841
    .line 842
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 843
    .line 844
    .line 845
    const v0, 0x412dc28f    # 10.86f

    .line 846
    .line 847
    .line 848
    const v2, 0x412147ae    # 10.08f

    .line 849
    .line 850
    .line 851
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 852
    .line 853
    .line 854
    const v17, 0x3e99999a    # 0.3f

    .line 855
    .line 856
    .line 857
    const v18, -0x40a147ae    # -0.87f

    .line 858
    .line 859
    .line 860
    const v13, 0x3d4ccccd    # 0.05f

    .line 861
    .line 862
    .line 863
    const v14, -0x41570a3d    # -0.33f

    .line 864
    .line 865
    .line 866
    const v15, 0x3e23d70a    # 0.16f

    .line 867
    .line 868
    .line 869
    const v16, -0x40e147ae    # -0.62f

    .line 870
    .line 871
    .line 872
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 873
    .line 874
    .line 875
    const v0, -0x41147ae1    # -0.46f

    .line 876
    .line 877
    .line 878
    const v2, -0x40e147ae    # -0.62f

    .line 879
    .line 880
    .line 881
    const v4, 0x3f170a3d    # 0.59f

    .line 882
    .line 883
    .line 884
    const v6, 0x3eae147b    # 0.34f

    .line 885
    .line 886
    .line 887
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v17, 0x3f68f5c3    # 0.91f

    .line 891
    .line 892
    .line 893
    const v18, -0x41947ae1    # -0.23f

    .line 894
    .line 895
    .line 896
    const v13, 0x3e75c28f    # 0.24f

    .line 897
    .line 898
    .line 899
    const v14, -0x41e66666    # -0.15f

    .line 900
    .line 901
    .line 902
    const v15, 0x3f0a3d71    # 0.54f

    .line 903
    .line 904
    .line 905
    const v16, -0x419eb852    # -0.22f

    .line 906
    .line 907
    .line 908
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v17, 0x3f2147ae    # 0.63f

    .line 912
    .line 913
    .line 914
    const v18, 0x3e051eb8    # 0.13f

    .line 915
    .line 916
    .line 917
    const v13, 0x3e6b851f    # 0.23f

    .line 918
    .line 919
    .line 920
    const v14, 0x3c23d70a    # 0.01f

    .line 921
    .line 922
    .line 923
    const v15, 0x3ee147ae    # 0.44f

    .line 924
    .line 925
    .line 926
    const v16, 0x3d4ccccd    # 0.05f

    .line 927
    .line 928
    .line 929
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const v17, 0x3f051eb8    # 0.52f

    .line 933
    .line 934
    .line 935
    const v18, 0x3eb851ec    # 0.36f

    .line 936
    .line 937
    .line 938
    const v13, 0x3e4ccccd    # 0.2f

    .line 939
    .line 940
    .line 941
    const v14, 0x3db851ec    # 0.09f

    .line 942
    .line 943
    .line 944
    const v15, 0x3ec28f5c    # 0.38f

    .line 945
    .line 946
    .line 947
    const v16, 0x3e570a3d    # 0.21f

    .line 948
    .line 949
    .line 950
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 951
    .line 952
    .line 953
    const v0, 0x3ea8f5c3    # 0.33f

    .line 954
    .line 955
    .line 956
    const v2, 0x3f07ae14    # 0.53f

    .line 957
    .line 958
    .line 959
    const v4, 0x3eae147b    # 0.34f

    .line 960
    .line 961
    .line 962
    const/high16 v6, 0x3e800000    # 0.25f

    .line 963
    .line 964
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const v17, 0x3e0f5c29    # 0.14f

    .line 968
    .line 969
    .line 970
    const v18, 0x3f23d70a    # 0.64f

    .line 971
    .line 972
    .line 973
    const v13, 0x3db851ec    # 0.09f

    .line 974
    .line 975
    .line 976
    const v14, 0x3e4ccccd    # 0.2f

    .line 977
    .line 978
    .line 979
    const v15, 0x3e051eb8    # 0.13f

    .line 980
    .line 981
    .line 982
    const v16, 0x3ed70a3d    # 0.42f

    .line 983
    .line 984
    .line 985
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 986
    .line 987
    .line 988
    const v0, 0x3fe51eb8    # 1.79f

    .line 989
    .line 990
    .line 991
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    const v17, -0x4170a3d7    # -0.28f

    .line 995
    .line 996
    .line 997
    const v18, -0x405ae148    # -1.29f

    .line 998
    .line 999
    .line 1000
    const v13, -0x435c28f6    # -0.02f

    .line 1001
    .line 1002
    .line 1003
    const v14, -0x410f5c29    # -0.47f

    .line 1004
    .line 1005
    .line 1006
    const v15, -0x421eb852    # -0.11f

    .line 1007
    .line 1008
    .line 1009
    const v16, -0x4099999a    # -0.9f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v17, -0x40cccccd    # -0.7f

    .line 1016
    .line 1017
    .line 1018
    const v18, -0x407eb852    # -1.01f

    .line 1019
    .line 1020
    .line 1021
    const v13, -0x41d1eb85    # -0.17f

    .line 1022
    .line 1023
    .line 1024
    const v14, -0x413851ec    # -0.39f

    .line 1025
    .line 1026
    .line 1027
    const v15, -0x41333333    # -0.4f

    .line 1028
    .line 1029
    .line 1030
    const v16, -0x40c51eb8    # -0.73f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    const v17, -0x4075c28f    # -1.08f

    .line 1037
    .line 1038
    .line 1039
    const v18, -0x40d70a3d    # -0.66f

    .line 1040
    .line 1041
    .line 1042
    const v13, -0x41666666    # -0.3f

    .line 1043
    .line 1044
    .line 1045
    const v14, -0x4170a3d7    # -0.28f

    .line 1046
    .line 1047
    .line 1048
    const v15, -0x40d70a3d    # -0.66f

    .line 1049
    .line 1050
    .line 1051
    const/high16 v16, -0x41000000    # -0.5f

    .line 1052
    .line 1053
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1054
    .line 1055
    .line 1056
    const v17, -0x404e147b    # -1.39f

    .line 1057
    .line 1058
    .line 1059
    const v18, -0x41947ae1    # -0.23f

    .line 1060
    .line 1061
    .line 1062
    const v13, -0x4128f5c3    # -0.42f

    .line 1063
    .line 1064
    .line 1065
    const v14, -0x41dc28f6    # -0.16f

    .line 1066
    .line 1067
    .line 1068
    const v15, -0x409eb852    # -0.88f

    .line 1069
    .line 1070
    .line 1071
    const v16, -0x41947ae1    # -0.23f

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1075
    .line 1076
    .line 1077
    const v17, -0x40266666    # -1.7f

    .line 1078
    .line 1079
    .line 1080
    const v18, 0x3eae147b    # 0.34f

    .line 1081
    .line 1082
    .line 1083
    const v13, -0x40d9999a    # -0.65f

    .line 1084
    .line 1085
    .line 1086
    const/4 v14, 0x0

    .line 1087
    const v15, -0x4063d70a    # -1.22f

    .line 1088
    .line 1089
    .line 1090
    const v16, 0x3de147ae    # 0.11f

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1094
    .line 1095
    .line 1096
    const v17, -0x40666666    # -1.2f

    .line 1097
    .line 1098
    .line 1099
    const v18, 0x3f6b851f    # 0.92f

    .line 1100
    .line 1101
    .line 1102
    const v13, -0x410a3d71    # -0.48f

    .line 1103
    .line 1104
    .line 1105
    const v14, 0x3e6b851f    # 0.23f

    .line 1106
    .line 1107
    .line 1108
    const v15, -0x409eb852    # -0.88f

    .line 1109
    .line 1110
    .line 1111
    const v16, 0x3f07ae14    # 0.53f

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1115
    .line 1116
    .line 1117
    const v0, 0x3f570a3d    # 0.84f

    .line 1118
    .line 1119
    .line 1120
    const v2, 0x3fae147b    # 1.36f

    .line 1121
    .line 1122
    .line 1123
    const v4, -0x40ca3d71    # -0.71f

    .line 1124
    .line 1125
    .line 1126
    const v6, -0x40f0a3d7    # -0.56f

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1130
    .line 1131
    .line 1132
    const v17, -0x418a3d71    # -0.24f

    .line 1133
    .line 1134
    .line 1135
    const v18, 0x3fd1eb85    # 1.64f

    .line 1136
    .line 1137
    .line 1138
    const v13, -0x41e66666    # -0.15f

    .line 1139
    .line 1140
    .line 1141
    const v14, 0x3f051eb8    # 0.52f

    .line 1142
    .line 1143
    .line 1144
    const v15, -0x418a3d71    # -0.24f

    .line 1145
    .line 1146
    .line 1147
    const v16, 0x3f87ae14    # 1.06f

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1151
    .line 1152
    .line 1153
    const v0, 0x3e8a3d71    # 0.27f

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1157
    .line 1158
    .line 1159
    const v17, 0x3e6b851f    # 0.23f

    .line 1160
    .line 1161
    .line 1162
    const/4 v13, 0x0

    .line 1163
    const v14, 0x3f147ae1    # 0.58f

    .line 1164
    .line 1165
    .line 1166
    const v15, 0x3da3d70a    # 0.08f

    .line 1167
    .line 1168
    .line 1169
    const v16, 0x3f8f5c29    # 1.12f

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1173
    .line 1174
    .line 1175
    const v17, 0x3f35c28f    # 0.71f

    .line 1176
    .line 1177
    .line 1178
    const v18, 0x3faccccd    # 1.35f

    .line 1179
    .line 1180
    .line 1181
    const v13, 0x3e19999a    # 0.15f

    .line 1182
    .line 1183
    .line 1184
    const v14, 0x3f051eb8    # 0.52f

    .line 1185
    .line 1186
    .line 1187
    const v15, 0x3ec7ae14    # 0.39f

    .line 1188
    .line 1189
    .line 1190
    const v16, 0x3f7851ec    # 0.97f

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1194
    .line 1195
    .line 1196
    const v0, 0x3f30a3d7    # 0.69f

    .line 1197
    .line 1198
    .line 1199
    const v2, 0x3f68f5c3    # 0.91f

    .line 1200
    .line 1201
    .line 1202
    const v4, 0x3f99999a    # 1.2f

    .line 1203
    .line 1204
    .line 1205
    const v6, 0x3f3851ec    # 0.72f

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1209
    .line 1210
    .line 1211
    const v17, 0x3fd9999a    # 1.7f

    .line 1212
    .line 1213
    .line 1214
    const v18, 0x3eae147b    # 0.34f

    .line 1215
    .line 1216
    .line 1217
    const v13, 0x3ef5c28f    # 0.48f

    .line 1218
    .line 1219
    .line 1220
    const v14, 0x3e6147ae    # 0.22f

    .line 1221
    .line 1222
    .line 1223
    const v15, 0x3f866666    # 1.05f

    .line 1224
    .line 1225
    .line 1226
    const v16, 0x3eae147b    # 0.34f

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1230
    .line 1231
    .line 1232
    const v17, 0x3fa8f5c3    # 1.32f

    .line 1233
    .line 1234
    .line 1235
    const v18, -0x41947ae1    # -0.23f

    .line 1236
    .line 1237
    .line 1238
    const v13, 0x3ef0a3d7    # 0.47f

    .line 1239
    .line 1240
    .line 1241
    const/4 v14, 0x0

    .line 1242
    const v15, 0x3f68f5c3    # 0.91f

    .line 1243
    .line 1244
    .line 1245
    const v16, -0x425c28f6    # -0.08f

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1249
    .line 1250
    .line 1251
    const v17, 0x3f8a3d71    # 1.08f

    .line 1252
    .line 1253
    .line 1254
    const v18, -0x40deb852    # -0.63f

    .line 1255
    .line 1256
    .line 1257
    const v13, 0x3ed1eb85    # 0.41f

    .line 1258
    .line 1259
    .line 1260
    const v14, -0x41e66666    # -0.15f

    .line 1261
    .line 1262
    .line 1263
    const v15, 0x3f451eb8    # 0.77f

    .line 1264
    .line 1265
    .line 1266
    const v16, -0x4147ae14    # -0.36f

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1270
    .line 1271
    .line 1272
    const v17, 0x3f3d70a4    # 0.74f

    .line 1273
    .line 1274
    .line 1275
    const v18, -0x408f5c29    # -0.94f

    .line 1276
    .line 1277
    .line 1278
    const v13, 0x3e9eb852    # 0.31f

    .line 1279
    .line 1280
    .line 1281
    const v14, -0x4175c28f    # -0.27f

    .line 1282
    .line 1283
    .line 1284
    const v15, 0x3f0f5c29    # 0.56f

    .line 1285
    .line 1286
    .line 1287
    const v16, -0x40eb851f    # -0.58f

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1291
    .line 1292
    .line 1293
    const v17, 0x3e99999a    # 0.3f

    .line 1294
    .line 1295
    .line 1296
    const v18, -0x406ccccd    # -1.15f

    .line 1297
    .line 1298
    .line 1299
    const v13, 0x3e3851ec    # 0.18f

    .line 1300
    .line 1301
    .line 1302
    const v14, -0x4147ae14    # -0.36f

    .line 1303
    .line 1304
    .line 1305
    const v15, 0x3e947ae1    # 0.29f

    .line 1306
    .line 1307
    .line 1308
    const v16, -0x40c28f5c    # -0.74f

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1312
    .line 1313
    .line 1314
    const v0, -0x401ae148    # -1.79f

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1318
    .line 1319
    .line 1320
    const v17, -0x41e66666    # -0.15f

    .line 1321
    .line 1322
    .line 1323
    const v18, 0x3f147ae1    # 0.58f

    .line 1324
    .line 1325
    .line 1326
    const v13, -0x43dc28f6    # -0.01f

    .line 1327
    .line 1328
    .line 1329
    const v14, 0x3e570a3d    # 0.21f

    .line 1330
    .line 1331
    .line 1332
    const v15, -0x428a3d71    # -0.06f

    .line 1333
    .line 1334
    .line 1335
    const v16, 0x3ecccccd    # 0.4f

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1339
    .line 1340
    .line 1341
    const v17, -0x4147ae14    # -0.36f

    .line 1342
    .line 1343
    .line 1344
    const v18, 0x3eeb851f    # 0.46f

    .line 1345
    .line 1346
    .line 1347
    const v13, -0x4247ae14    # -0.09f

    .line 1348
    .line 1349
    .line 1350
    const v14, 0x3e3851ec    # 0.18f

    .line 1351
    .line 1352
    .line 1353
    const v15, -0x41a8f5c3    # -0.21f

    .line 1354
    .line 1355
    .line 1356
    const v16, 0x3ea8f5c3    # 0.33f

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1360
    .line 1361
    .line 1362
    const v0, -0x40fae148    # -0.52f

    .line 1363
    .line 1364
    .line 1365
    const v2, 0x3e99999a    # 0.3f

    .line 1366
    .line 1367
    .line 1368
    const v4, -0x415c28f6    # -0.32f

    .line 1369
    .line 1370
    .line 1371
    const v6, 0x3e6b851f    # 0.23f

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1375
    .line 1376
    .line 1377
    const v17, -0x40e66666    # -0.6f

    .line 1378
    .line 1379
    .line 1380
    const v18, 0x3dcccccd    # 0.1f

    .line 1381
    .line 1382
    .line 1383
    const v13, -0x41bd70a4    # -0.19f

    .line 1384
    .line 1385
    .line 1386
    const v14, 0x3d8f5c29    # 0.07f

    .line 1387
    .line 1388
    .line 1389
    const v15, -0x413851ec    # -0.39f

    .line 1390
    .line 1391
    .line 1392
    const v16, 0x3db851ec    # 0.09f

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1396
    .line 1397
    .line 1398
    const v17, -0x409c28f6    # -0.89f

    .line 1399
    .line 1400
    .line 1401
    const v18, -0x41947ae1    # -0.23f

    .line 1402
    .line 1403
    .line 1404
    const v13, -0x4147ae14    # -0.36f

    .line 1405
    .line 1406
    .line 1407
    const v14, -0x43dc28f6    # -0.01f

    .line 1408
    .line 1409
    .line 1410
    const v15, -0x40d70a3d    # -0.66f

    .line 1411
    .line 1412
    .line 1413
    const v16, -0x425c28f6    # -0.08f

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1417
    .line 1418
    .line 1419
    const v17, -0x40e8f5c3    # -0.59f

    .line 1420
    .line 1421
    .line 1422
    const v18, -0x40e147ae    # -0.62f

    .line 1423
    .line 1424
    .line 1425
    const/high16 v13, -0x41800000    # -0.25f

    .line 1426
    .line 1427
    const v14, -0x41dc28f6    # -0.16f

    .line 1428
    .line 1429
    .line 1430
    const v15, -0x4119999a    # -0.45f

    .line 1431
    .line 1432
    .line 1433
    const v16, -0x41428f5c    # -0.37f

    .line 1434
    .line 1435
    .line 1436
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1437
    .line 1438
    .line 1439
    const v0, -0x40f33333    # -0.55f

    .line 1440
    .line 1441
    .line 1442
    const v2, -0x409eb852    # -0.88f

    .line 1443
    .line 1444
    .line 1445
    const v4, -0x41666666    # -0.3f

    .line 1446
    .line 1447
    .line 1448
    const/high16 v6, -0x41800000    # -0.25f

    .line 1449
    .line 1450
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1451
    .line 1452
    .line 1453
    const v17, -0x425c28f6    # -0.08f

    .line 1454
    .line 1455
    .line 1456
    const/high16 v18, -0x40800000    # -1.0f

    .line 1457
    .line 1458
    const v13, -0x42b33333    # -0.05f

    .line 1459
    .line 1460
    .line 1461
    const v14, -0x41570a3d    # -0.33f

    .line 1462
    .line 1463
    .line 1464
    const v15, -0x425c28f6    # -0.08f

    .line 1465
    .line 1466
    .line 1467
    const v16, -0x40d47ae1    # -0.67f

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1471
    .line 1472
    .line 1473
    const v0, -0x4175c28f    # -0.27f

    .line 1474
    .line 1475
    .line 1476
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1477
    .line 1478
    .line 1479
    const v17, 0x3da3d70a    # 0.08f

    .line 1480
    .line 1481
    .line 1482
    const v18, -0x407eb852    # -1.01f

    .line 1483
    .line 1484
    .line 1485
    const/4 v13, 0x0

    .line 1486
    const v14, -0x414ccccd    # -0.35f

    .line 1487
    .line 1488
    .line 1489
    const v15, 0x3cf5c28f    # 0.03f

    .line 1490
    .line 1491
    .line 1492
    const v16, -0x40d1eb85    # -0.68f

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1499
    .line 1500
    .line 1501
    const/high16 v0, 0x40000000    # 2.0f

    .line 1502
    .line 1503
    const/high16 v2, 0x41400000    # 12.0f

    .line 1504
    .line 1505
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1506
    .line 1507
    .line 1508
    const/high16 v17, 0x40000000    # 2.0f

    .line 1509
    .line 1510
    const/high16 v18, 0x41400000    # 12.0f

    .line 1511
    .line 1512
    const v13, 0x40cf5c29    # 6.48f

    .line 1513
    .line 1514
    .line 1515
    const/high16 v14, 0x40000000    # 2.0f

    .line 1516
    .line 1517
    const/high16 v15, 0x40000000    # 2.0f

    .line 1518
    .line 1519
    const v16, 0x40cf5c29    # 6.48f

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1523
    .line 1524
    .line 1525
    const v0, 0x408f5c29    # 4.48f

    .line 1526
    .line 1527
    .line 1528
    const/high16 v2, 0x41200000    # 10.0f

    .line 1529
    .line 1530
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1531
    .line 1532
    .line 1533
    const v0, -0x3f70a3d7    # -4.48f

    .line 1534
    .line 1535
    .line 1536
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 1537
    .line 1538
    const/high16 v4, 0x41200000    # 10.0f

    .line 1539
    .line 1540
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1541
    .line 1542
    .line 1543
    const v0, 0x418c28f6    # 17.52f

    .line 1544
    .line 1545
    .line 1546
    const/high16 v2, 0x40000000    # 2.0f

    .line 1547
    .line 1548
    const/high16 v4, 0x41400000    # 12.0f

    .line 1549
    .line 1550
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1551
    .line 1552
    .line 1553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1554
    .line 1555
    .line 1556
    const/high16 v0, 0x41a00000    # 20.0f

    .line 1557
    .line 1558
    const/high16 v2, 0x41400000    # 12.0f

    .line 1559
    .line 1560
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1561
    .line 1562
    .line 1563
    const/high16 v17, -0x3f000000    # -8.0f

    .line 1564
    .line 1565
    const/high16 v18, -0x3f000000    # -8.0f

    .line 1566
    .line 1567
    const v13, -0x3f72e148    # -4.41f

    .line 1568
    .line 1569
    .line 1570
    const/4 v14, 0x0

    .line 1571
    const/high16 v15, -0x3f000000    # -8.0f

    .line 1572
    .line 1573
    const v16, -0x3f9a3d71    # -3.59f

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1577
    .line 1578
    .line 1579
    const v0, 0x4065c28f    # 3.59f

    .line 1580
    .line 1581
    .line 1582
    const/high16 v2, -0x3f000000    # -8.0f

    .line 1583
    .line 1584
    const/high16 v4, 0x41000000    # 8.0f

    .line 1585
    .line 1586
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1587
    .line 1588
    .line 1589
    const/high16 v2, 0x41000000    # 8.0f

    .line 1590
    .line 1591
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1592
    .line 1593
    .line 1594
    const v0, -0x3f9a3d71    # -3.59f

    .line 1595
    .line 1596
    .line 1597
    const/high16 v2, -0x3f000000    # -8.0f

    .line 1598
    .line 1599
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v2

    .line 1609
    const/16 v16, 0x3800

    .line 1610
    .line 1611
    const/16 v17, 0x0

    .line 1612
    .line 1613
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1614
    .line 1615
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1616
    .line 1617
    const/4 v7, 0x0

    .line 1618
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1619
    .line 1620
    const/4 v13, 0x0

    .line 1621
    const/4 v15, 0x0

    .line 1622
    const-string v4, ""

    .line 1623
    .line 1624
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v0

    .line 1632
    sput-object v0, Landroidx/compose/material/icons/twotone/CopyrightKt;->_copyright:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1633
    .line 1634
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1635
    .line 1636
    .line 1637
    return-object v0
.end method

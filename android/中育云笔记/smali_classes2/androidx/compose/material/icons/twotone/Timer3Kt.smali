.class public final Landroidx/compose/material/icons/twotone/Timer3Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _timer3:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTimer3(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Timer3Kt;->_timer3:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Timer3"

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
    const v0, 0x4183ae14    # 16.46f

    .line 71
    .line 72
    .line 73
    const v2, 0x412ccccd    # 10.8f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3ee66666    # 0.45f

    .line 80
    .line 81
    .line 82
    const v18, -0x418a3d71    # -0.24f

    .line 83
    .line 84
    .line 85
    const v13, 0x3df5c28f    # 0.12f

    .line 86
    .line 87
    .line 88
    const v14, -0x42333333    # -0.1f

    .line 89
    .line 90
    .line 91
    const v15, 0x3e8a3d71    # 0.27f

    .line 92
    .line 93
    .line 94
    const v16, -0x41c7ae14    # -0.18f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x3ecccccd    # 0.4f

    .line 101
    .line 102
    .line 103
    const v2, 0x3f23d70a    # 0.64f

    .line 104
    .line 105
    .line 106
    const v4, -0x4247ae14    # -0.09f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, 0x3f28f5c3    # 0.66f

    .line 113
    .line 114
    .line 115
    const v18, 0x3de147ae    # 0.11f

    .line 116
    .line 117
    .line 118
    const/high16 v13, 0x3e800000    # 0.25f

    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    const v15, 0x3ef0a3d7    # 0.47f

    .line 122
    .line 123
    .line 124
    const v16, 0x3d23d70a    # 0.04f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, 0x3ef5c28f    # 0.48f

    .line 131
    .line 132
    .line 133
    const v18, 0x3e947ae1    # 0.29f

    .line 134
    .line 135
    .line 136
    const v13, 0x3e428f5c    # 0.19f

    .line 137
    .line 138
    .line 139
    const v14, 0x3d8f5c29    # 0.07f

    .line 140
    .line 141
    .line 142
    const v15, 0x3eb33333    # 0.35f

    .line 143
    .line 144
    .line 145
    const v16, 0x3e2e147b    # 0.17f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v0, 0x3e851eb8    # 0.26f

    .line 152
    .line 153
    .line 154
    const v2, 0x3ed70a3d    # 0.42f

    .line 155
    .line 156
    .line 157
    const v4, 0x3e947ae1    # 0.29f

    .line 158
    .line 159
    .line 160
    const v6, 0x3e6147ae    # 0.22f

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v6, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, 0x3dcccccd    # 0.1f

    .line 167
    .line 168
    .line 169
    const v18, 0x3efae148    # 0.49f

    .line 170
    .line 171
    .line 172
    const v13, 0x3d75c28f    # 0.06f

    .line 173
    .line 174
    .line 175
    const v14, 0x3e23d70a    # 0.16f

    .line 176
    .line 177
    .line 178
    const v15, 0x3dcccccd    # 0.1f

    .line 179
    .line 180
    .line 181
    const v16, 0x3ea3d70a    # 0.32f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v0, 0x3ff9999a    # 1.95f

    .line 188
    .line 189
    .line 190
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, -0x418a3d71    # -0.24f

    .line 194
    .line 195
    .line 196
    const v18, -0x40747ae1    # -1.09f

    .line 197
    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const v14, -0x413851ec    # -0.39f

    .line 201
    .line 202
    .line 203
    const v15, -0x425c28f6    # -0.08f

    .line 204
    .line 205
    .line 206
    const/high16 v16, -0x40c00000    # -0.75f

    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, -0x40cf5c29    # -0.69f

    .line 212
    .line 213
    .line 214
    const v18, -0x409eb852    # -0.88f

    .line 215
    .line 216
    .line 217
    const v13, -0x41dc28f6    # -0.16f

    .line 218
    .line 219
    .line 220
    const v14, -0x4151eb85    # -0.34f

    .line 221
    .line 222
    .line 223
    const v15, -0x413851ec    # -0.39f

    .line 224
    .line 225
    .line 226
    const v16, -0x40deb852    # -0.63f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, -0x40747ae1    # -1.09f

    .line 233
    .line 234
    .line 235
    const v18, -0x40e8f5c3    # -0.59f

    .line 236
    .line 237
    .line 238
    const v13, -0x41666666    # -0.3f

    .line 239
    .line 240
    .line 241
    const/high16 v14, -0x41800000    # -0.25f

    .line 242
    .line 243
    const v15, -0x40d70a3d    # -0.66f

    .line 244
    .line 245
    .line 246
    const v16, -0x411eb852    # -0.44f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, -0x40451eb8    # -1.46f

    .line 253
    .line 254
    .line 255
    const v18, -0x419eb852    # -0.22f

    .line 256
    .line 257
    .line 258
    const v13, -0x4123d70a    # -0.43f

    .line 259
    .line 260
    .line 261
    const v14, -0x41e66666    # -0.15f

    .line 262
    .line 263
    .line 264
    const v15, -0x40947ae1    # -0.92f

    .line 265
    .line 266
    .line 267
    const v16, -0x419eb852    # -0.22f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, -0x404e147b    # -1.39f

    .line 274
    .line 275
    .line 276
    const v18, 0x3e570a3d    # 0.21f

    .line 277
    .line 278
    .line 279
    const v13, -0x40fd70a4    # -0.51f

    .line 280
    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const v15, -0x40851eb8    # -0.98f

    .line 284
    .line 285
    .line 286
    const v16, 0x3d8f5c29    # 0.07f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, -0x407851ec    # -1.06f

    .line 293
    .line 294
    .line 295
    const v18, 0x3f11eb85    # 0.57f

    .line 296
    .line 297
    .line 298
    const v13, -0x412e147b    # -0.41f

    .line 299
    .line 300
    .line 301
    const v14, 0x3e0f5c29    # 0.14f

    .line 302
    .line 303
    .line 304
    const v15, -0x40bae148    # -0.77f

    .line 305
    .line 306
    .line 307
    const v16, 0x3ea8f5c3    # 0.33f

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, -0x40d47ae1    # -0.67f

    .line 314
    .line 315
    .line 316
    const v18, 0x3f570a3d    # 0.84f

    .line 317
    .line 318
    .line 319
    const v13, -0x416b851f    # -0.29f

    .line 320
    .line 321
    .line 322
    const v14, 0x3e75c28f    # 0.24f

    .line 323
    .line 324
    .line 325
    const v15, -0x40fd70a4    # -0.51f

    .line 326
    .line 327
    .line 328
    const v16, 0x3f051eb8    # 0.52f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x41947ae1    # -0.23f

    .line 335
    .line 336
    .line 337
    const v18, 0x3f8147ae    # 1.01f

    .line 338
    .line 339
    .line 340
    const v13, -0x41dc28f6    # -0.16f

    .line 341
    .line 342
    .line 343
    const v14, 0x3ea3d70a    # 0.32f

    .line 344
    .line 345
    .line 346
    const v15, -0x41947ae1    # -0.23f

    .line 347
    .line 348
    .line 349
    const v16, 0x3f266666    # 0.65f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v0, 0x3f2e147b    # 0.68f

    .line 356
    .line 357
    .line 358
    const v2, 0x3e6b851f    # 0.23f

    .line 359
    .line 360
    .line 361
    const v4, 0x3f75c28f    # 0.96f

    .line 362
    .line 363
    .line 364
    const v6, 0x3da3d70a    # 0.08f

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v17, 0x3f23d70a    # 0.64f

    .line 371
    .line 372
    .line 373
    const v18, 0x3f3ae148    # 0.73f

    .line 374
    .line 375
    .line 376
    const v13, 0x3e19999a    # 0.15f

    .line 377
    .line 378
    .line 379
    const v14, 0x3e8f5c29    # 0.28f

    .line 380
    .line 381
    .line 382
    const v15, 0x3ebd70a4    # 0.37f

    .line 383
    .line 384
    .line 385
    const v16, 0x3f051eb8    # 0.52f

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v17, 0x3f7ae148    # 0.98f

    .line 392
    .line 393
    .line 394
    const v18, 0x3f07ae14    # 0.53f

    .line 395
    .line 396
    .line 397
    const v13, 0x3e8a3d71    # 0.27f

    .line 398
    .line 399
    .line 400
    const v14, 0x3e570a3d    # 0.21f

    .line 401
    .line 402
    .line 403
    const v15, 0x3f19999a    # 0.6f

    .line 404
    .line 405
    .line 406
    const v16, 0x3ec28f5c    # 0.38f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v17, 0x3fa28f5c    # 1.27f

    .line 413
    .line 414
    .line 415
    const v18, 0x3eb851ec    # 0.36f

    .line 416
    .line 417
    .line 418
    const v13, 0x3ec28f5c    # 0.38f

    .line 419
    .line 420
    .line 421
    const v14, 0x3e0f5c29    # 0.14f

    .line 422
    .line 423
    .line 424
    const v15, 0x3f4f5c29    # 0.81f

    .line 425
    .line 426
    .line 427
    const v16, 0x3e851eb8    # 0.26f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, 0x3f733333    # 0.95f

    .line 434
    .line 435
    .line 436
    const v18, 0x3e851eb8    # 0.26f

    .line 437
    .line 438
    .line 439
    const v13, 0x3ec7ae14    # 0.39f

    .line 440
    .line 441
    .line 442
    const v14, 0x3da3d70a    # 0.08f

    .line 443
    .line 444
    .line 445
    const v15, 0x3f35c28f    # 0.71f

    .line 446
    .line 447
    .line 448
    const v16, 0x3e2e147b    # 0.17f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const v0, 0x3e428f5c    # 0.19f

    .line 455
    .line 456
    .line 457
    const v2, 0x3f11eb85    # 0.57f

    .line 458
    .line 459
    .line 460
    const v4, 0x3e947ae1    # 0.29f

    .line 461
    .line 462
    .line 463
    const v6, 0x3edc28f6    # 0.43f

    .line 464
    .line 465
    .line 466
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, 0x3e8a3d71    # 0.27f

    .line 470
    .line 471
    .line 472
    const v18, 0x3eae147b    # 0.34f

    .line 473
    .line 474
    .line 475
    const v13, 0x3e051eb8    # 0.13f

    .line 476
    .line 477
    .line 478
    const v14, 0x3dcccccd    # 0.1f

    .line 479
    .line 480
    .line 481
    const v15, 0x3e6147ae    # 0.22f

    .line 482
    .line 483
    .line 484
    const v16, 0x3e6147ae    # 0.22f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x3e800000    # 0.25f

    .line 491
    .line 492
    const v2, 0x3ec7ae14    # 0.39f

    .line 493
    .line 494
    .line 495
    const v4, 0x3d8f5c29    # 0.07f

    .line 496
    .line 497
    .line 498
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const v17, -0x41333333    # -0.4f

    .line 502
    .line 503
    .line 504
    const v18, 0x3f451eb8    # 0.77f

    .line 505
    .line 506
    .line 507
    const/4 v13, 0x0

    .line 508
    const v14, 0x3ea3d70a    # 0.32f

    .line 509
    .line 510
    .line 511
    const v15, -0x41fae148    # -0.13f

    .line 512
    .line 513
    .line 514
    const v16, 0x3f11eb85    # 0.57f

    .line 515
    .line 516
    .line 517
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const v17, -0x406a3d71    # -1.17f

    .line 521
    .line 522
    .line 523
    const v18, 0x3e947ae1    # 0.29f

    .line 524
    .line 525
    .line 526
    const v13, -0x4175c28f    # -0.27f

    .line 527
    .line 528
    .line 529
    const v14, 0x3e4ccccd    # 0.2f

    .line 530
    .line 531
    .line 532
    const v15, -0x40d70a3d    # -0.66f

    .line 533
    .line 534
    .line 535
    const v16, 0x3e947ae1    # 0.29f

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v17, -0x40dc28f6    # -0.64f

    .line 542
    .line 543
    .line 544
    const v18, -0x425c28f6    # -0.08f

    .line 545
    .line 546
    .line 547
    const v13, -0x419eb852    # -0.22f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const v15, -0x4123d70a    # -0.43f

    .line 552
    .line 553
    .line 554
    const v16, -0x435c28f6    # -0.02f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, -0x40f0a3d7    # -0.56f

    .line 561
    .line 562
    .line 563
    const v18, -0x418a3d71    # -0.24f

    .line 564
    .line 565
    .line 566
    const v13, -0x41a8f5c3    # -0.21f

    .line 567
    .line 568
    .line 569
    const v14, -0x42b33333    # -0.05f

    .line 570
    .line 571
    .line 572
    const v15, -0x41333333    # -0.4f

    .line 573
    .line 574
    .line 575
    const v16, -0x41fae148    # -0.13f

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v17, -0x412e147b    # -0.41f

    .line 582
    .line 583
    .line 584
    const v18, -0x411eb852    # -0.44f

    .line 585
    .line 586
    .line 587
    const v13, -0x41d1eb85    # -0.17f

    .line 588
    .line 589
    .line 590
    const v14, -0x421eb852    # -0.11f

    .line 591
    .line 592
    .line 593
    const v15, -0x41666666    # -0.3f

    .line 594
    .line 595
    .line 596
    const v16, -0x417ae148    # -0.26f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    const v0, -0x41c7ae14    # -0.18f

    .line 603
    .line 604
    .line 605
    const v2, -0x40d47ae1    # -0.67f

    .line 606
    .line 607
    .line 608
    const v4, -0x412e147b    # -0.41f

    .line 609
    .line 610
    .line 611
    const v6, -0x41d1eb85    # -0.17f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v0, -0x400e147b    # -1.89f

    .line 618
    .line 619
    .line 620
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const v17, 0x3e75c28f    # 0.24f

    .line 624
    .line 625
    .line 626
    const v18, 0x3f866666    # 1.05f

    .line 627
    .line 628
    .line 629
    const/4 v13, 0x0

    .line 630
    const v14, 0x3eb851ec    # 0.36f

    .line 631
    .line 632
    .line 633
    const v15, 0x3da3d70a    # 0.08f

    .line 634
    .line 635
    .line 636
    const v16, 0x3f35c28f    # 0.71f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v17, 0x3f333333    # 0.7f

    .line 643
    .line 644
    .line 645
    const v18, 0x3f6e147b    # 0.93f

    .line 646
    .line 647
    .line 648
    const v13, 0x3e23d70a    # 0.16f

    .line 649
    .line 650
    .line 651
    const v14, 0x3eae147b    # 0.34f

    .line 652
    .line 653
    .line 654
    const v15, 0x3ec7ae14    # 0.39f

    .line 655
    .line 656
    .line 657
    const v16, 0x3f266666    # 0.65f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const v17, 0x3f933333    # 1.15f

    .line 664
    .line 665
    .line 666
    const v18, 0x3f28f5c3    # 0.66f

    .line 667
    .line 668
    .line 669
    const v13, 0x3e9eb852    # 0.31f

    .line 670
    .line 671
    .line 672
    const v14, 0x3e8a3d71    # 0.27f

    .line 673
    .line 674
    .line 675
    const v15, 0x3f30a3d7    # 0.69f

    .line 676
    .line 677
    .line 678
    const v16, 0x3efae148    # 0.49f

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const v17, 0x3fca3d71    # 1.58f

    .line 685
    .line 686
    .line 687
    const/high16 v18, 0x3e800000    # 0.25f

    .line 688
    .line 689
    const v13, 0x3eeb851f    # 0.46f

    .line 690
    .line 691
    .line 692
    const v14, 0x3e2e147b    # 0.17f

    .line 693
    .line 694
    .line 695
    const v15, 0x3f7ae148    # 0.98f

    .line 696
    .line 697
    .line 698
    const/high16 v16, 0x3e800000    # 0.25f

    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v17, 0x3fb851ec    # 1.44f

    .line 704
    .line 705
    .line 706
    const v18, -0x41bd70a4    # -0.19f

    .line 707
    .line 708
    .line 709
    const v13, 0x3f07ae14    # 0.53f

    .line 710
    .line 711
    .line 712
    const/4 v14, 0x0

    .line 713
    const v15, 0x3f8147ae    # 1.01f

    .line 714
    .line 715
    .line 716
    const v16, -0x428a3d71    # -0.06f

    .line 717
    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v17, 0x3f8e147b    # 1.11f

    .line 723
    .line 724
    .line 725
    const v18, -0x40f5c28f    # -0.54f

    .line 726
    .line 727
    .line 728
    const v13, 0x3edc28f6    # 0.43f

    .line 729
    .line 730
    .line 731
    const v14, -0x41fae148    # -0.13f

    .line 732
    .line 733
    .line 734
    const v15, 0x3f4ccccd    # 0.8f

    .line 735
    .line 736
    .line 737
    const v16, -0x416147ae    # -0.31f

    .line 738
    .line 739
    .line 740
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v17, 0x3f35c28f    # 0.71f

    .line 744
    .line 745
    .line 746
    const v18, -0x40ab851f    # -0.83f

    .line 747
    .line 748
    .line 749
    const v13, 0x3e9eb852    # 0.31f

    .line 750
    .line 751
    .line 752
    const v14, -0x41947ae1    # -0.23f

    .line 753
    .line 754
    .line 755
    const v15, 0x3f0a3d71    # 0.54f

    .line 756
    .line 757
    .line 758
    const v16, -0x40fd70a4    # -0.51f

    .line 759
    .line 760
    .line 761
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v17, 0x3e800000    # 0.25f

    .line 765
    .line 766
    const v18, -0x407851ec    # -1.06f

    .line 767
    .line 768
    .line 769
    const v13, 0x3e2e147b    # 0.17f

    .line 770
    .line 771
    .line 772
    const v14, -0x415c28f6    # -0.32f

    .line 773
    .line 774
    .line 775
    const/high16 v15, 0x3e800000    # 0.25f

    .line 776
    .line 777
    const v16, -0x40d47ae1    # -0.67f

    .line 778
    .line 779
    .line 780
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    const v17, -0x418a3d71    # -0.24f

    .line 784
    .line 785
    .line 786
    const v18, -0x407d70a4    # -1.02f

    .line 787
    .line 788
    .line 789
    const v13, -0x435c28f6    # -0.02f

    .line 790
    .line 791
    .line 792
    const v14, -0x41333333    # -0.4f

    .line 793
    .line 794
    .line 795
    const v15, -0x4247ae14    # -0.09f

    .line 796
    .line 797
    .line 798
    const v16, -0x40c28f5c    # -0.74f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v17, -0x40deb852    # -0.63f

    .line 805
    .line 806
    .line 807
    const v18, -0x40c28f5c    # -0.74f

    .line 808
    .line 809
    .line 810
    const v13, -0x41f0a3d7    # -0.14f

    .line 811
    .line 812
    .line 813
    const v14, -0x4170a3d7    # -0.28f

    .line 814
    .line 815
    .line 816
    const v15, -0x414ccccd    # -0.35f

    .line 817
    .line 818
    .line 819
    const v16, -0x40f851ec    # -0.53f

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const v17, -0x407eb852    # -1.01f

    .line 826
    .line 827
    .line 828
    const v18, -0x40f851ec    # -0.53f

    .line 829
    .line 830
    .line 831
    const v13, -0x4170a3d7    # -0.28f

    .line 832
    .line 833
    .line 834
    const v14, -0x41a8f5c3    # -0.21f

    .line 835
    .line 836
    .line 837
    const v15, -0x40e3d70a    # -0.61f

    .line 838
    .line 839
    .line 840
    const v16, -0x413851ec    # -0.39f

    .line 841
    .line 842
    .line 843
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v0, -0x40533333    # -1.35f

    .line 847
    .line 848
    .line 849
    const v2, -0x413d70a4    # -0.38f

    .line 850
    .line 851
    .line 852
    const v4, -0x40a66666    # -0.85f

    .line 853
    .line 854
    .line 855
    const v6, -0x4175c28f    # -0.27f

    .line 856
    .line 857
    .line 858
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const v17, -0x40a147ae    # -0.87f

    .line 862
    .line 863
    .line 864
    const v18, -0x41947ae1    # -0.23f

    .line 865
    .line 866
    .line 867
    const v13, -0x414ccccd    # -0.35f

    .line 868
    .line 869
    .line 870
    const v14, -0x4270a3d7    # -0.07f

    .line 871
    .line 872
    .line 873
    const v15, -0x40dc28f6    # -0.64f

    .line 874
    .line 875
    .line 876
    const v16, -0x41e66666    # -0.15f

    .line 877
    .line 878
    .line 879
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const v0, -0x40f33333    # -0.55f

    .line 883
    .line 884
    .line 885
    const/high16 v2, -0x41800000    # -0.25f

    .line 886
    .line 887
    const v4, -0x412e147b    # -0.41f

    .line 888
    .line 889
    .line 890
    const v6, -0x41dc28f6    # -0.16f

    .line 891
    .line 892
    .line 893
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const v17, -0x4170a3d7    # -0.28f

    .line 897
    .line 898
    .line 899
    const v18, -0x41666666    # -0.3f

    .line 900
    .line 901
    .line 902
    const v13, -0x41f0a3d7    # -0.14f

    .line 903
    .line 904
    .line 905
    const v14, -0x4247ae14    # -0.09f

    .line 906
    .line 907
    .line 908
    const v15, -0x41947ae1    # -0.23f

    .line 909
    .line 910
    .line 911
    const v16, -0x41bd70a4    # -0.19f

    .line 912
    .line 913
    .line 914
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const v17, -0x425c28f6    # -0.08f

    .line 918
    .line 919
    .line 920
    const v18, -0x413851ec    # -0.39f

    .line 921
    .line 922
    .line 923
    const v13, -0x42b33333    # -0.05f

    .line 924
    .line 925
    .line 926
    const v14, -0x421eb852    # -0.11f

    .line 927
    .line 928
    .line 929
    const v15, -0x425c28f6    # -0.08f

    .line 930
    .line 931
    .line 932
    const v16, -0x418a3d71    # -0.24f

    .line 933
    .line 934
    .line 935
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const v0, -0x4170a3d7    # -0.28f

    .line 939
    .line 940
    .line 941
    const v2, 0x3db851ec    # 0.09f

    .line 942
    .line 943
    .line 944
    const v6, 0x3cf5c28f    # 0.03f

    .line 945
    .line 946
    .line 947
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const v17, 0x3e8a3d71    # 0.27f

    .line 951
    .line 952
    .line 953
    const v18, -0x4151eb85    # -0.34f

    .line 954
    .line 955
    .line 956
    const v13, 0x3d75c28f    # 0.06f

    .line 957
    .line 958
    .line 959
    const v14, -0x41fae148    # -0.13f

    .line 960
    .line 961
    .line 962
    const v15, 0x3e19999a    # 0.15f

    .line 963
    .line 964
    .line 965
    const/high16 v16, -0x41800000    # -0.25f

    .line 966
    .line 967
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 971
    .line 972
    .line 973
    const v0, 0x4101eb85    # 8.12f

    .line 974
    .line 975
    .line 976
    const v2, 0x4184147b    # 16.51f

    .line 977
    .line 978
    .line 979
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 980
    .line 981
    .line 982
    const v17, -0x40b33333    # -0.8f

    .line 983
    .line 984
    .line 985
    const v18, -0x41fae148    # -0.13f

    .line 986
    .line 987
    .line 988
    const v13, -0x416b851f    # -0.29f

    .line 989
    .line 990
    .line 991
    const/4 v14, 0x0

    .line 992
    const v15, -0x40f0a3d7    # -0.56f

    .line 993
    .line 994
    .line 995
    const v16, -0x42dc28f6    # -0.04f

    .line 996
    .line 997
    .line 998
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 999
    .line 1000
    .line 1001
    const v17, -0x40e3d70a    # -0.61f

    .line 1002
    .line 1003
    .line 1004
    const v18, -0x4147ae14    # -0.36f

    .line 1005
    .line 1006
    .line 1007
    const v13, -0x418a3d71    # -0.24f

    .line 1008
    .line 1009
    .line 1010
    const v14, -0x425c28f6    # -0.08f

    .line 1011
    .line 1012
    .line 1013
    const v15, -0x411eb852    # -0.44f

    .line 1014
    .line 1015
    .line 1016
    const v16, -0x41b33333    # -0.2f

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1020
    .line 1021
    .line 1022
    const v17, -0x413851ec    # -0.39f

    .line 1023
    .line 1024
    .line 1025
    const v18, -0x40f0a3d7    # -0.56f

    .line 1026
    .line 1027
    .line 1028
    const v13, -0x41d1eb85    # -0.17f

    .line 1029
    .line 1030
    .line 1031
    const v14, -0x41dc28f6    # -0.16f

    .line 1032
    .line 1033
    .line 1034
    const v15, -0x41666666    # -0.3f

    .line 1035
    .line 1036
    .line 1037
    const v16, -0x4151eb85    # -0.34f

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1041
    .line 1042
    .line 1043
    const v17, -0x41f0a3d7    # -0.14f

    .line 1044
    .line 1045
    .line 1046
    const v18, -0x40c7ae14    # -0.72f

    .line 1047
    .line 1048
    .line 1049
    const v13, -0x4247ae14    # -0.09f

    .line 1050
    .line 1051
    .line 1052
    const v14, -0x419eb852    # -0.22f

    .line 1053
    .line 1054
    .line 1055
    const v15, -0x41f0a3d7    # -0.14f

    .line 1056
    .line 1057
    .line 1058
    const v16, -0x41147ae1    # -0.46f

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1062
    .line 1063
    .line 1064
    const v0, 0x4086147b    # 4.19f

    .line 1065
    .line 1066
    .line 1067
    const v2, 0x416bd70a    # 14.74f

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1071
    .line 1072
    .line 1073
    const v17, 0x3ea3d70a    # 0.32f

    .line 1074
    .line 1075
    .line 1076
    const v18, 0x3fb9999a    # 1.45f

    .line 1077
    .line 1078
    .line 1079
    const/4 v13, 0x0

    .line 1080
    const v14, 0x3f0ccccd    # 0.55f

    .line 1081
    .line 1082
    .line 1083
    const v15, 0x3de147ae    # 0.11f

    .line 1084
    .line 1085
    .line 1086
    const v16, 0x3f83d70a    # 1.03f

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1090
    .line 1091
    .line 1092
    const v17, 0x3f5c28f6    # 0.86f

    .line 1093
    .line 1094
    .line 1095
    const v18, 0x3f866666    # 1.05f

    .line 1096
    .line 1097
    .line 1098
    const v13, 0x3e570a3d    # 0.21f

    .line 1099
    .line 1100
    .line 1101
    const v14, 0x3ed70a3d    # 0.42f

    .line 1102
    .line 1103
    .line 1104
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1105
    .line 1106
    const v16, 0x3f451eb8    # 0.77f

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1110
    .line 1111
    .line 1112
    const v0, 0x3f9eb852    # 1.24f

    .line 1113
    .line 1114
    .line 1115
    const v2, 0x3f2147ae    # 0.63f

    .line 1116
    .line 1117
    .line 1118
    const v4, 0x3f451eb8    # 0.77f

    .line 1119
    .line 1120
    .line 1121
    const v6, 0x3efae148    # 0.49f

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1125
    .line 1126
    .line 1127
    const v0, 0x3fbd70a4    # 1.48f

    .line 1128
    .line 1129
    .line 1130
    const v2, 0x3e570a3d    # 0.21f

    .line 1131
    .line 1132
    .line 1133
    const v4, 0x3f75c28f    # 0.96f

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v12, v4, v2, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1137
    .line 1138
    .line 1139
    const v17, 0x3fca3d71    # 1.58f

    .line 1140
    .line 1141
    .line 1142
    const v18, -0x41947ae1    # -0.23f

    .line 1143
    .line 1144
    .line 1145
    const v13, 0x3f11eb85    # 0.57f

    .line 1146
    .line 1147
    .line 1148
    const/4 v14, 0x0

    .line 1149
    const v15, 0x3f8b851f    # 1.09f

    .line 1150
    .line 1151
    .line 1152
    const v16, -0x425c28f6    # -0.08f

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1156
    .line 1157
    .line 1158
    const v17, 0x3fa147ae    # 1.26f

    .line 1159
    .line 1160
    .line 1161
    const v18, -0x40d1eb85    # -0.68f

    .line 1162
    .line 1163
    .line 1164
    const v13, 0x3efae148    # 0.49f

    .line 1165
    .line 1166
    .line 1167
    const v14, -0x41e66666    # -0.15f

    .line 1168
    .line 1169
    .line 1170
    const v15, 0x3f68f5c3    # 0.91f

    .line 1171
    .line 1172
    .line 1173
    const v16, -0x413d70a4    # -0.38f

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1177
    .line 1178
    .line 1179
    const v17, 0x3f570a3d    # 0.84f

    .line 1180
    .line 1181
    .line 1182
    const v18, -0x40733333    # -1.1f

    .line 1183
    .line 1184
    .line 1185
    const v13, 0x3eb851ec    # 0.36f

    .line 1186
    .line 1187
    .line 1188
    const v14, -0x41666666    # -0.3f

    .line 1189
    .line 1190
    .line 1191
    const v15, 0x3f23d70a    # 0.64f

    .line 1192
    .line 1193
    .line 1194
    const v16, -0x40d70a3d    # -0.66f

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1198
    .line 1199
    .line 1200
    const v17, 0x3e99999a    # 0.3f

    .line 1201
    .line 1202
    .line 1203
    const v18, -0x40428f5c    # -1.48f

    .line 1204
    .line 1205
    .line 1206
    const v13, 0x3e4ccccd    # 0.2f

    .line 1207
    .line 1208
    .line 1209
    const v14, -0x4123d70a    # -0.43f

    .line 1210
    .line 1211
    .line 1212
    const v15, 0x3e99999a    # 0.3f

    .line 1213
    .line 1214
    .line 1215
    const v16, -0x4091eb85    # -0.93f

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1219
    .line 1220
    .line 1221
    const v17, -0x421eb852    # -0.11f

    .line 1222
    .line 1223
    .line 1224
    const v18, -0x40a3d70a    # -0.86f

    .line 1225
    .line 1226
    .line 1227
    const/4 v13, 0x0

    .line 1228
    const v14, -0x416b851f    # -0.29f

    .line 1229
    .line 1230
    .line 1231
    const v15, -0x42dc28f6    # -0.04f

    .line 1232
    .line 1233
    .line 1234
    const v16, -0x40eb851f    # -0.58f

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1238
    .line 1239
    .line 1240
    const v17, -0x414ccccd    # -0.35f

    .line 1241
    .line 1242
    .line 1243
    const v18, -0x40bd70a4    # -0.76f

    .line 1244
    .line 1245
    .line 1246
    const v13, -0x425c28f6    # -0.08f

    .line 1247
    .line 1248
    .line 1249
    const/high16 v14, -0x41800000    # -0.25f

    .line 1250
    .line 1251
    const v15, -0x41bd70a4    # -0.19f

    .line 1252
    .line 1253
    .line 1254
    const v16, -0x40fd70a4    # -0.51f

    .line 1255
    .line 1256
    .line 1257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1258
    .line 1259
    .line 1260
    const v17, -0x40e147ae    # -0.62f

    .line 1261
    .line 1262
    .line 1263
    const v18, -0x40d9999a    # -0.65f

    .line 1264
    .line 1265
    .line 1266
    const v13, -0x41dc28f6    # -0.16f

    .line 1267
    .line 1268
    .line 1269
    const v14, -0x418a3d71    # -0.24f

    .line 1270
    .line 1271
    .line 1272
    const v15, -0x4147ae14    # -0.36f

    .line 1273
    .line 1274
    .line 1275
    const v16, -0x41147ae1    # -0.46f

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1279
    .line 1280
    .line 1281
    const v17, -0x4091eb85    # -0.93f

    .line 1282
    .line 1283
    .line 1284
    const v18, -0x410a3d71    # -0.48f

    .line 1285
    .line 1286
    .line 1287
    const/high16 v13, -0x41800000    # -0.25f

    .line 1288
    .line 1289
    const v14, -0x41bd70a4    # -0.19f

    .line 1290
    .line 1291
    .line 1292
    const v15, -0x40f0a3d7    # -0.56f

    .line 1293
    .line 1294
    .line 1295
    const v16, -0x414ccccd    # -0.35f

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1299
    .line 1300
    .line 1301
    const v17, 0x3f4ccccd    # 0.8f

    .line 1302
    .line 1303
    .line 1304
    const/high16 v18, -0x41000000    # -0.5f

    .line 1305
    .line 1306
    const v13, 0x3e99999a    # 0.3f

    .line 1307
    .line 1308
    .line 1309
    const v14, -0x41f0a3d7    # -0.14f

    .line 1310
    .line 1311
    .line 1312
    const v15, 0x3f11eb85    # 0.57f

    .line 1313
    .line 1314
    .line 1315
    const v16, -0x41666666    # -0.3f

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1319
    .line 1320
    .line 1321
    const v17, 0x3f11eb85    # 0.57f

    .line 1322
    .line 1323
    .line 1324
    const v18, -0x40dc28f6    # -0.64f

    .line 1325
    .line 1326
    .line 1327
    const v13, 0x3e6b851f    # 0.23f

    .line 1328
    .line 1329
    .line 1330
    const v14, -0x41b33333    # -0.2f

    .line 1331
    .line 1332
    .line 1333
    const v15, 0x3ed70a3d    # 0.42f

    .line 1334
    .line 1335
    .line 1336
    const v16, -0x412e147b    # -0.41f

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1340
    .line 1341
    .line 1342
    const v17, 0x3eae147b    # 0.34f

    .line 1343
    .line 1344
    .line 1345
    const v18, -0x40ca3d71    # -0.71f

    .line 1346
    .line 1347
    .line 1348
    const v13, 0x3e19999a    # 0.15f

    .line 1349
    .line 1350
    .line 1351
    const v14, -0x41947ae1    # -0.23f

    .line 1352
    .line 1353
    .line 1354
    const v15, 0x3e8a3d71    # 0.27f

    .line 1355
    .line 1356
    .line 1357
    const v16, -0x41147ae1    # -0.46f

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1361
    .line 1362
    .line 1363
    const v17, 0x3de147ae    # 0.11f

    .line 1364
    .line 1365
    .line 1366
    const v18, -0x40c51eb8    # -0.73f

    .line 1367
    .line 1368
    .line 1369
    const v13, 0x3da3d70a    # 0.08f

    .line 1370
    .line 1371
    .line 1372
    const v14, -0x418a3d71    # -0.24f

    .line 1373
    .line 1374
    .line 1375
    const v15, 0x3de147ae    # 0.11f

    .line 1376
    .line 1377
    .line 1378
    const v16, -0x41051eb8    # -0.49f

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1382
    .line 1383
    .line 1384
    const v17, -0x4170a3d7    # -0.28f

    .line 1385
    .line 1386
    .line 1387
    const v18, -0x40451eb8    # -1.46f

    .line 1388
    .line 1389
    .line 1390
    const/4 v13, 0x0

    .line 1391
    const v14, -0x40f33333    # -0.55f

    .line 1392
    .line 1393
    .line 1394
    const v15, -0x4247ae14    # -0.09f

    .line 1395
    .line 1396
    .line 1397
    const v16, -0x407ae148    # -1.04f

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1401
    .line 1402
    .line 1403
    const v17, -0x40b851ec    # -0.78f

    .line 1404
    .line 1405
    .line 1406
    const v18, -0x407851ec    # -1.06f

    .line 1407
    .line 1408
    .line 1409
    const v13, -0x41c7ae14    # -0.18f

    .line 1410
    .line 1411
    .line 1412
    const v14, -0x4128f5c3    # -0.42f

    .line 1413
    .line 1414
    .line 1415
    const v15, -0x411eb852    # -0.44f

    .line 1416
    .line 1417
    .line 1418
    const v16, -0x40bae148    # -0.77f

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1422
    .line 1423
    .line 1424
    const v17, -0x40666666    # -1.2f

    .line 1425
    .line 1426
    .line 1427
    const v18, -0x40dc28f6    # -0.64f

    .line 1428
    .line 1429
    .line 1430
    const v13, -0x41570a3d    # -0.33f

    .line 1431
    .line 1432
    .line 1433
    const v14, -0x4170a3d7    # -0.28f

    .line 1434
    .line 1435
    .line 1436
    const v15, -0x40c51eb8    # -0.73f

    .line 1437
    .line 1438
    .line 1439
    const/high16 v16, -0x41000000    # -0.5f

    .line 1440
    .line 1441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1442
    .line 1443
    .line 1444
    const v17, -0x403c28f6    # -1.53f

    .line 1445
    .line 1446
    .line 1447
    const v18, -0x41b33333    # -0.2f

    .line 1448
    .line 1449
    .line 1450
    const v13, -0x4119999a    # -0.45f

    .line 1451
    .line 1452
    .line 1453
    const v14, -0x41fae148    # -0.13f

    .line 1454
    .line 1455
    .line 1456
    const v15, -0x4087ae14    # -0.97f

    .line 1457
    .line 1458
    .line 1459
    const v16, -0x41b33333    # -0.2f

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1463
    .line 1464
    .line 1465
    const v17, -0x403d70a4    # -1.52f

    .line 1466
    .line 1467
    .line 1468
    const v18, 0x3e75c28f    # 0.24f

    .line 1469
    .line 1470
    .line 1471
    const v13, -0x40f33333    # -0.55f

    .line 1472
    .line 1473
    .line 1474
    const/4 v14, 0x0

    .line 1475
    const v15, -0x407851ec    # -1.06f

    .line 1476
    .line 1477
    .line 1478
    const v16, 0x3da3d70a    # 0.08f

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1482
    .line 1483
    .line 1484
    const v17, -0x40666666    # -1.2f

    .line 1485
    .line 1486
    .line 1487
    const v18, 0x3f30a3d7    # 0.69f

    .line 1488
    .line 1489
    .line 1490
    const v13, -0x410f5c29    # -0.47f

    .line 1491
    .line 1492
    .line 1493
    const v14, 0x3e2e147b    # 0.17f

    .line 1494
    .line 1495
    .line 1496
    const v15, -0x40a147ae    # -0.87f

    .line 1497
    .line 1498
    .line 1499
    const v16, 0x3ecccccd    # 0.4f

    .line 1500
    .line 1501
    .line 1502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1503
    .line 1504
    .line 1505
    const v17, -0x40b851ec    # -0.78f

    .line 1506
    .line 1507
    .line 1508
    const v18, 0x3f83d70a    # 1.03f

    .line 1509
    .line 1510
    .line 1511
    const v13, -0x41570a3d    # -0.33f

    .line 1512
    .line 1513
    .line 1514
    const v14, 0x3e947ae1    # 0.29f

    .line 1515
    .line 1516
    .line 1517
    const v15, -0x40e66666    # -0.6f

    .line 1518
    .line 1519
    .line 1520
    const v16, 0x3f2147ae    # 0.63f

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1524
    .line 1525
    .line 1526
    const v17, -0x416b851f    # -0.29f

    .line 1527
    .line 1528
    .line 1529
    const v18, 0x3fa51eb8    # 1.29f

    .line 1530
    .line 1531
    .line 1532
    const v13, -0x41b33333    # -0.2f

    .line 1533
    .line 1534
    .line 1535
    const v14, 0x3ec7ae14    # 0.39f

    .line 1536
    .line 1537
    .line 1538
    const v15, -0x416b851f    # -0.29f

    .line 1539
    .line 1540
    .line 1541
    const v16, 0x3f547ae1    # 0.83f

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1545
    .line 1546
    .line 1547
    const v0, 0x3ffd70a4    # 1.98f

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1551
    .line 1552
    .line 1553
    const v17, 0x3e0f5c29    # 0.14f

    .line 1554
    .line 1555
    .line 1556
    const v18, -0x40cf5c29    # -0.69f

    .line 1557
    .line 1558
    .line 1559
    const/4 v13, 0x0

    .line 1560
    const v14, -0x417ae148    # -0.26f

    .line 1561
    .line 1562
    .line 1563
    const v15, 0x3d4ccccd    # 0.05f

    .line 1564
    .line 1565
    .line 1566
    const v16, -0x41051eb8    # -0.49f

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1570
    .line 1571
    .line 1572
    const v17, 0x3ec28f5c    # 0.38f

    .line 1573
    .line 1574
    .line 1575
    const v18, -0x40fae148    # -0.52f

    .line 1576
    .line 1577
    .line 1578
    const v13, 0x3db851ec    # 0.09f

    .line 1579
    .line 1580
    .line 1581
    const v14, -0x41b33333    # -0.2f

    .line 1582
    .line 1583
    .line 1584
    const v15, 0x3e6147ae    # 0.22f

    .line 1585
    .line 1586
    .line 1587
    const v16, -0x413d70a4    # -0.38f

    .line 1588
    .line 1589
    .line 1590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1591
    .line 1592
    .line 1593
    const v17, 0x3f147ae1    # 0.58f

    .line 1594
    .line 1595
    .line 1596
    const v18, -0x41570a3d    # -0.33f

    .line 1597
    .line 1598
    .line 1599
    const v13, 0x3e2e147b    # 0.17f

    .line 1600
    .line 1601
    .line 1602
    const v14, -0x41f0a3d7    # -0.14f

    .line 1603
    .line 1604
    .line 1605
    const v15, 0x3eb851ec    # 0.36f

    .line 1606
    .line 1607
    .line 1608
    const/high16 v16, -0x41800000    # -0.25f

    .line 1609
    .line 1610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1611
    .line 1612
    .line 1613
    const v17, 0x3f3ae148    # 0.73f

    .line 1614
    .line 1615
    .line 1616
    const v18, -0x420a3d71    # -0.12f

    .line 1617
    .line 1618
    .line 1619
    const v13, 0x3e6147ae    # 0.22f

    .line 1620
    .line 1621
    .line 1622
    const v14, -0x425c28f6    # -0.08f

    .line 1623
    .line 1624
    .line 1625
    const v15, 0x3eeb851f    # 0.46f

    .line 1626
    .line 1627
    .line 1628
    const v16, -0x420a3d71    # -0.12f

    .line 1629
    .line 1630
    .line 1631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1632
    .line 1633
    .line 1634
    const v17, 0x3fae147b    # 1.36f

    .line 1635
    .line 1636
    .line 1637
    const v18, 0x3ef0a3d7    # 0.47f

    .line 1638
    .line 1639
    .line 1640
    const v13, 0x3f1c28f6    # 0.61f

    .line 1641
    .line 1642
    .line 1643
    const/4 v14, 0x0

    .line 1644
    const v15, 0x3f87ae14    # 1.06f

    .line 1645
    .line 1646
    .line 1647
    const v16, 0x3e23d70a    # 0.16f

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1651
    .line 1652
    .line 1653
    const v17, 0x3ee147ae    # 0.44f

    .line 1654
    .line 1655
    .line 1656
    const v18, 0x3fa8f5c3    # 1.32f

    .line 1657
    .line 1658
    .line 1659
    const v13, 0x3e99999a    # 0.3f

    .line 1660
    .line 1661
    .line 1662
    const v14, 0x3e9eb852    # 0.31f

    .line 1663
    .line 1664
    .line 1665
    const v15, 0x3ee147ae    # 0.44f

    .line 1666
    .line 1667
    .line 1668
    const/high16 v16, 0x3f400000    # 0.75f

    .line 1669
    .line 1670
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1671
    .line 1672
    .line 1673
    const v17, -0x420a3d71    # -0.12f

    .line 1674
    .line 1675
    .line 1676
    const v18, 0x3f3d70a4    # 0.74f

    .line 1677
    .line 1678
    .line 1679
    const/4 v13, 0x0

    .line 1680
    const v14, 0x3e8a3d71    # 0.27f

    .line 1681
    .line 1682
    .line 1683
    const v15, -0x42dc28f6    # -0.04f

    .line 1684
    .line 1685
    .line 1686
    const v16, 0x3f051eb8    # 0.52f

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1690
    .line 1691
    .line 1692
    const v17, -0x413d70a4    # -0.38f

    .line 1693
    .line 1694
    .line 1695
    const v18, 0x3f11eb85    # 0.57f

    .line 1696
    .line 1697
    .line 1698
    const v13, -0x425c28f6    # -0.08f

    .line 1699
    .line 1700
    .line 1701
    const v14, 0x3e6147ae    # 0.22f

    .line 1702
    .line 1703
    .line 1704
    const v15, -0x41a8f5c3    # -0.21f

    .line 1705
    .line 1706
    .line 1707
    const v16, 0x3ed1eb85    # 0.41f

    .line 1708
    .line 1709
    .line 1710
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1711
    .line 1712
    .line 1713
    const v17, -0x40deb852    # -0.63f

    .line 1714
    .line 1715
    .line 1716
    const v18, 0x3ebd70a4    # 0.37f

    .line 1717
    .line 1718
    .line 1719
    const v13, -0x41d1eb85    # -0.17f

    .line 1720
    .line 1721
    .line 1722
    const v14, 0x3e23d70a    # 0.16f

    .line 1723
    .line 1724
    .line 1725
    const v15, -0x413d70a4    # -0.38f

    .line 1726
    .line 1727
    .line 1728
    const v16, 0x3e8f5c29    # 0.28f

    .line 1729
    .line 1730
    .line 1731
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1732
    .line 1733
    .line 1734
    const v17, -0x409c28f6    # -0.89f

    .line 1735
    .line 1736
    .line 1737
    const v18, 0x3e051eb8    # 0.13f

    .line 1738
    .line 1739
    .line 1740
    const/high16 v13, -0x41800000    # -0.25f

    .line 1741
    .line 1742
    const v14, 0x3db851ec    # 0.09f

    .line 1743
    .line 1744
    .line 1745
    const v15, -0x40f33333    # -0.55f

    .line 1746
    .line 1747
    .line 1748
    const v16, 0x3e051eb8    # 0.13f

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1752
    .line 1753
    .line 1754
    const v0, 0x40d70a3d    # 6.72f

    .line 1755
    .line 1756
    .line 1757
    const v2, 0x413170a4    # 11.09f

    .line 1758
    .line 1759
    .line 1760
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1761
    .line 1762
    .line 1763
    const v0, 0x3fc8f5c3    # 1.57f

    .line 1764
    .line 1765
    .line 1766
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1767
    .line 1768
    .line 1769
    const v0, 0x40fccccd    # 7.9f

    .line 1770
    .line 1771
    .line 1772
    const v2, 0x414a8f5c    # 12.66f

    .line 1773
    .line 1774
    .line 1775
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1776
    .line 1777
    .line 1778
    const v17, 0x3f68f5c3    # 0.91f

    .line 1779
    .line 1780
    .line 1781
    const v18, 0x3de147ae    # 0.11f

    .line 1782
    .line 1783
    .line 1784
    const v13, 0x3eae147b    # 0.34f

    .line 1785
    .line 1786
    .line 1787
    const/4 v14, 0x0

    .line 1788
    const v15, 0x3f23d70a    # 0.64f

    .line 1789
    .line 1790
    .line 1791
    const v16, 0x3d23d70a    # 0.04f

    .line 1792
    .line 1793
    .line 1794
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1795
    .line 1796
    .line 1797
    const v17, 0x3f30a3d7    # 0.69f

    .line 1798
    .line 1799
    .line 1800
    const v18, 0x3eb33333    # 0.35f

    .line 1801
    .line 1802
    .line 1803
    const v13, 0x3e8a3d71    # 0.27f

    .line 1804
    .line 1805
    .line 1806
    const v14, 0x3da3d70a    # 0.08f

    .line 1807
    .line 1808
    .line 1809
    const/high16 v15, 0x3f000000    # 0.5f

    .line 1810
    .line 1811
    const v16, 0x3e428f5c    # 0.19f

    .line 1812
    .line 1813
    .line 1814
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1815
    .line 1816
    .line 1817
    const v17, 0x3ee147ae    # 0.44f

    .line 1818
    .line 1819
    .line 1820
    const v18, 0x3f1c28f6    # 0.61f

    .line 1821
    .line 1822
    .line 1823
    const v13, 0x3e428f5c    # 0.19f

    .line 1824
    .line 1825
    .line 1826
    const v14, 0x3e23d70a    # 0.16f

    .line 1827
    .line 1828
    .line 1829
    const v15, 0x3eae147b    # 0.34f

    .line 1830
    .line 1831
    .line 1832
    const v16, 0x3eb851ec    # 0.36f

    .line 1833
    .line 1834
    .line 1835
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1836
    .line 1837
    .line 1838
    const v17, 0x3e23d70a    # 0.16f

    .line 1839
    .line 1840
    .line 1841
    const v18, 0x3f5eb852    # 0.87f

    .line 1842
    .line 1843
    .line 1844
    const v13, 0x3dcccccd    # 0.1f

    .line 1845
    .line 1846
    .line 1847
    const v14, 0x3e75c28f    # 0.24f

    .line 1848
    .line 1849
    .line 1850
    const v15, 0x3e23d70a    # 0.16f

    .line 1851
    .line 1852
    .line 1853
    const v16, 0x3f0a3d71    # 0.54f

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1857
    .line 1858
    .line 1859
    const v17, -0x40f851ec    # -0.53f

    .line 1860
    .line 1861
    .line 1862
    const v18, 0x3fb5c28f    # 1.42f

    .line 1863
    .line 1864
    .line 1865
    const/4 v13, 0x0

    .line 1866
    const v14, 0x3f1eb852    # 0.62f

    .line 1867
    .line 1868
    .line 1869
    const v15, -0x41c7ae14    # -0.18f

    .line 1870
    .line 1871
    .line 1872
    const v16, 0x3f8b851f    # 1.09f

    .line 1873
    .line 1874
    .line 1875
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1876
    .line 1877
    .line 1878
    const v17, -0x40466666    # -1.45f

    .line 1879
    .line 1880
    .line 1881
    const v18, 0x3efae148    # 0.49f

    .line 1882
    .line 1883
    .line 1884
    const v13, -0x414ccccd    # -0.35f

    .line 1885
    .line 1886
    .line 1887
    const v14, 0x3ea8f5c3    # 0.33f

    .line 1888
    .line 1889
    .line 1890
    const v15, -0x40a8f5c3    # -0.84f

    .line 1891
    .line 1892
    .line 1893
    const v16, 0x3efae148    # 0.49f

    .line 1894
    .line 1895
    .line 1896
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1897
    .line 1898
    .line 1899
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1900
    .line 1901
    .line 1902
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v2

    .line 1906
    const/16 v16, 0x3800

    .line 1907
    .line 1908
    const/16 v17, 0x0

    .line 1909
    .line 1910
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1911
    .line 1912
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1913
    .line 1914
    const/4 v7, 0x0

    .line 1915
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1916
    .line 1917
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1918
    .line 1919
    const/4 v13, 0x0

    .line 1920
    const/4 v14, 0x0

    .line 1921
    const/4 v15, 0x0

    .line 1922
    const-string v4, ""

    .line 1923
    .line 1924
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v0

    .line 1928
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1929
    .line 1930
    .line 1931
    move-result-object v0

    .line 1932
    sput-object v0, Landroidx/compose/material/icons/twotone/Timer3Kt;->_timer3:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1933
    .line 1934
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1935
    .line 1936
    .line 1937
    return-object v0
.end method

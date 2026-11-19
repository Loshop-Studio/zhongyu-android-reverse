.class public final Landroidx/compose/material/icons/rounded/GestureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _gesture:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getGesture(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/GestureKt;->_gesture:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Gesture"

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
    const v0, 0x406e147b    # 3.72f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c147ae    # 6.04f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3fdae148    # 1.71f

    .line 80
    .line 81
    .line 82
    const v18, 0x3d75c28f    # 0.06f

    .line 83
    .line 84
    .line 85
    const v13, 0x3ef0a3d7    # 0.47f

    .line 86
    .line 87
    .line 88
    const v14, 0x3eeb851f    # 0.46f

    .line 89
    .line 90
    .line 91
    const v15, 0x3f9ae148    # 1.21f

    .line 92
    .line 93
    .line 94
    const v16, 0x3ef5c28f    # 0.48f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3f5eb852    # 0.87f

    .line 101
    .line 102
    .line 103
    const v18, -0x4123d70a    # -0.43f

    .line 104
    .line 105
    .line 106
    const v13, 0x3ebd70a4    # 0.37f

    .line 107
    .line 108
    .line 109
    const v14, -0x415c28f6    # -0.32f

    .line 110
    .line 111
    .line 112
    const v15, 0x3f30a3d7    # 0.69f

    .line 113
    .line 114
    .line 115
    const v16, -0x40fd70a4    # -0.51f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, -0x41666666    # -0.3f

    .line 122
    .line 123
    .line 124
    const v18, 0x3fc28f5c    # 1.52f

    .line 125
    .line 126
    .line 127
    const/high16 v13, 0x3f000000    # 0.5f

    .line 128
    .line 129
    const v14, 0x3e4ccccd    # 0.2f

    .line 130
    .line 131
    .line 132
    const/4 v15, 0x0

    .line 133
    const v16, 0x3f83d70a    # 1.03f

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v17, -0x3fc8f5c3    # -2.86f

    .line 140
    .line 141
    .line 142
    const v18, 0x40c9eb85    # 6.31f

    .line 143
    .line 144
    .line 145
    const/high16 v13, -0x41800000    # -0.25f

    .line 146
    .line 147
    const v14, 0x3ed70a3d    # 0.42f

    .line 148
    .line 149
    .line 150
    const v15, -0x3fc8f5c3    # -2.86f

    .line 151
    .line 152
    .line 153
    const v16, 0x4078f5c3    # 3.89f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v17, 0x3fab851f    # 1.34f

    .line 160
    .line 161
    .line 162
    const v18, 0x403eb852    # 2.98f

    .line 163
    .line 164
    .line 165
    const/4 v13, 0x0

    .line 166
    const v14, 0x3fa3d70a    # 1.28f

    .line 167
    .line 168
    .line 169
    const v15, 0x3ef5c28f    # 0.48f

    .line 170
    .line 171
    .line 172
    const v16, 0x4015c28f    # 2.34f

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v17, 0x4028f5c3    # 2.64f

    .line 179
    .line 180
    .line 181
    const v18, 0x3eeb851f    # 0.46f

    .line 182
    .line 183
    .line 184
    const/high16 v13, 0x3f400000    # 0.75f

    .line 185
    .line 186
    const v14, 0x3f0f5c29    # 0.56f

    .line 187
    .line 188
    .line 189
    const v15, 0x3fdeb852    # 1.74f

    .line 190
    .line 191
    .line 192
    const v16, 0x3f3ae148    # 0.73f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, 0x4043d70a    # 3.06f

    .line 199
    .line 200
    .line 201
    const v18, -0x3fceb852    # -2.77f

    .line 202
    .line 203
    .line 204
    const v13, 0x3f88f5c3    # 1.07f

    .line 205
    .line 206
    .line 207
    const v14, -0x416147ae    # -0.31f

    .line 208
    .line 209
    .line 210
    const v15, 0x3ff9999a    # 1.95f

    .line 211
    .line 212
    .line 213
    const v16, -0x404ccccd    # -1.4f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x40828f5c    # 4.08f

    .line 220
    .line 221
    .line 222
    const v18, -0x3fa3d70a    # -3.44f

    .line 223
    .line 224
    .line 225
    const v13, 0x3f9ae148    # 1.21f

    .line 226
    .line 227
    .line 228
    const v14, -0x404147ae    # -1.49f

    .line 229
    .line 230
    .line 231
    const v15, 0x40351eb8    # 2.83f

    .line 232
    .line 233
    .line 234
    const v16, -0x3fa3d70a    # -3.44f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x3fe147ae    # 1.76f

    .line 241
    .line 242
    .line 243
    const v18, 0x3fe51eb8    # 1.79f

    .line 244
    .line 245
    .line 246
    const v13, 0x3fd0a3d7    # 1.63f

    .line 247
    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    const v15, 0x3fd33333    # 1.65f

    .line 251
    .line 252
    .line 253
    const v16, 0x3f8147ae    # 1.01f

    .line 254
    .line 255
    .line 256
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, -0x3f53d70a    # -5.38f

    .line 260
    .line 261
    .line 262
    const v18, 0x40abd70a    # 5.37f

    .line 263
    .line 264
    .line 265
    const v13, -0x3f8e147b    # -3.78f

    .line 266
    .line 267
    .line 268
    const v14, 0x3f23d70a    # 0.64f

    .line 269
    .line 270
    .line 271
    const v15, -0x3f53d70a    # -5.38f

    .line 272
    .line 273
    .line 274
    const v16, 0x406ae148    # 3.67f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, 0x404d70a4    # 3.21f

    .line 281
    .line 282
    .line 283
    const v18, 0x4045c28f    # 3.09f

    .line 284
    .line 285
    .line 286
    const/4 v13, 0x0

    .line 287
    const v14, 0x3fd9999a    # 1.7f

    .line 288
    .line 289
    .line 290
    const v15, 0x3fb851ec    # 1.44f

    .line 291
    .line 292
    .line 293
    const v16, 0x4045c28f    # 3.09f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v17, 0x4096147b    # 4.69f

    .line 300
    .line 301
    .line 302
    const v18, -0x3f3ccccd    # -6.1f

    .line 303
    .line 304
    .line 305
    const v13, 0x3fd0a3d7    # 1.63f

    .line 306
    .line 307
    .line 308
    const/4 v14, 0x0

    .line 309
    const v15, 0x408947ae    # 4.29f

    .line 310
    .line 311
    .line 312
    const v16, -0x4055c28f    # -1.33f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x3f9ae148    # 1.21f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v17, 0x3fa00000    # 1.25f

    .line 325
    .line 326
    const/high16 v18, -0x40600000    # -1.25f

    .line 327
    .line 328
    const v13, 0x3f30a3d7    # 0.69f

    .line 329
    .line 330
    .line 331
    const/high16 v15, 0x3fa00000    # 1.25f

    .line 332
    .line 333
    const v16, -0x40f0a3d7    # -0.56f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v0, -0x40f0a3d7    # -0.56f

    .line 340
    .line 341
    .line 342
    const/high16 v2, -0x40600000    # -1.25f

    .line 343
    .line 344
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const v0, -0x4063d70a    # -1.22f

    .line 348
    .line 349
    .line 350
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v17, -0x3f7f0a3d    # -4.03f

    .line 354
    .line 355
    .line 356
    const v18, -0x3f79999a    # -4.2f

    .line 357
    .line 358
    .line 359
    const v13, -0x41e66666    # -0.15f

    .line 360
    .line 361
    .line 362
    const v14, -0x402ccccd    # -1.65f

    .line 363
    .line 364
    .line 365
    const v15, -0x40747ae1    # -1.09f

    .line 366
    .line 367
    .line 368
    const v16, -0x3f79999a    # -4.2f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, -0x3f61eb85    # -4.94f

    .line 375
    .line 376
    .line 377
    const v18, 0x4035c28f    # 2.84f

    .line 378
    .line 379
    .line 380
    const/high16 v13, -0x3ff00000    # -2.25f

    .line 381
    .line 382
    const/4 v14, 0x0

    .line 383
    const v15, -0x3f7a3d71    # -4.18f

    .line 384
    .line 385
    .line 386
    const v16, 0x3ff47ae1    # 1.91f

    .line 387
    .line 388
    .line 389
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const v17, -0x3fed70a4    # -2.29f

    .line 393
    .line 394
    .line 395
    const v18, 0x402e147b    # 2.72f

    .line 396
    .line 397
    .line 398
    const v13, -0x40eb851f    # -0.58f

    .line 399
    .line 400
    .line 401
    const v14, 0x3f3ae148    # 0.73f

    .line 402
    .line 403
    .line 404
    const v15, -0x3ffc28f6    # -2.06f

    .line 405
    .line 406
    .line 407
    const v16, 0x401eb852    # 2.48f

    .line 408
    .line 409
    .line 410
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const v17, -0x4071eb85    # -1.11f

    .line 414
    .line 415
    .line 416
    const v18, 0x3f570a3d    # 0.84f

    .line 417
    .line 418
    .line 419
    const/high16 v13, -0x41800000    # -0.25f

    .line 420
    .line 421
    const v14, 0x3e99999a    # 0.3f

    .line 422
    .line 423
    .line 424
    const v15, -0x40d1eb85    # -0.68f

    .line 425
    .line 426
    .line 427
    const v16, 0x3f570a3d    # 0.84f

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v17, -0x4147ae14    # -0.36f

    .line 434
    .line 435
    .line 436
    const v18, -0x400a3d71    # -1.92f

    .line 437
    .line 438
    .line 439
    const v13, -0x4119999a    # -0.45f

    .line 440
    .line 441
    .line 442
    const/4 v14, 0x0

    .line 443
    const v15, -0x40c7ae14    # -0.72f

    .line 444
    .line 445
    .line 446
    const v16, -0x40ab851f    # -0.83f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x3feccccd    # 1.85f

    .line 453
    .line 454
    .line 455
    const v18, -0x3f9eb852    # -3.52f

    .line 456
    .line 457
    .line 458
    const v13, 0x3eb33333    # 0.35f

    .line 459
    .line 460
    .line 461
    const v14, -0x40747ae1    # -1.09f

    .line 462
    .line 463
    .line 464
    const v15, 0x3fb33333    # 1.4f

    .line 465
    .line 466
    .line 467
    const v16, -0x3fc8f5c3    # -2.86f

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 471
    .line 472
    .line 473
    const v17, 0x3fa66666    # 1.3f

    .line 474
    .line 475
    .line 476
    const v18, -0x3fae147b    # -3.28f

    .line 477
    .line 478
    .line 479
    const v13, 0x3f47ae14    # 0.78f

    .line 480
    .line 481
    .line 482
    const v14, -0x406e147b    # -1.14f

    .line 483
    .line 484
    .line 485
    const v15, 0x3fa66666    # 1.3f

    .line 486
    .line 487
    .line 488
    const v16, -0x400a3d71    # -1.92f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const v17, 0x40ce147b    # 6.44f

    .line 495
    .line 496
    .line 497
    const/high16 v18, 0x40400000    # 3.0f

    .line 498
    .line 499
    const v13, 0x410f3333    # 8.95f

    .line 500
    .line 501
    .line 502
    const v14, 0x406c28f6    # 3.69f

    .line 503
    .line 504
    .line 505
    const v15, 0x40e9eb85    # 7.31f

    .line 506
    .line 507
    .line 508
    const/high16 v16, 0x40400000    # 3.0f

    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, -0x3fd33333    # -2.7f

    .line 514
    .line 515
    .line 516
    const v18, 0x3f9c28f6    # 1.22f

    .line 517
    .line 518
    .line 519
    const v13, -0x40747ae1    # -1.09f

    .line 520
    .line 521
    .line 522
    const/4 v14, 0x0

    .line 523
    const v15, -0x3ffd70a4    # -2.04f

    .line 524
    .line 525
    .line 526
    const v16, 0x3f2147ae    # 0.63f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v17, -0x435c28f6    # -0.02f

    .line 533
    .line 534
    .line 535
    const v18, 0x3fe8f5c3    # 1.82f

    .line 536
    .line 537
    .line 538
    const v13, -0x40f851ec    # -0.53f

    .line 539
    .line 540
    .line 541
    const v14, 0x3ef5c28f    # 0.48f

    .line 542
    .line 543
    .line 544
    const v15, -0x40f851ec    # -0.53f

    .line 545
    .line 546
    .line 547
    const v16, 0x3fa8f5c3    # 1.32f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, 0x415e147b    # 13.88f

    .line 557
    .line 558
    .line 559
    const v2, 0x41946666    # 18.55f

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const v17, -0x40c28f5c    # -0.74f

    .line 566
    .line 567
    .line 568
    const v18, -0x40c7ae14    # -0.72f

    .line 569
    .line 570
    .line 571
    const v13, -0x416147ae    # -0.31f

    .line 572
    .line 573
    .line 574
    const/4 v14, 0x0

    .line 575
    const v15, -0x40c28f5c    # -0.74f

    .line 576
    .line 577
    .line 578
    const v16, -0x417ae148    # -0.26f

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v17, 0x4037ae14    # 2.87f

    .line 585
    .line 586
    .line 587
    const v18, -0x3fcf5c29    # -2.76f

    .line 588
    .line 589
    .line 590
    const/4 v13, 0x0

    .line 591
    const v14, -0x40e66666    # -0.6f

    .line 592
    .line 593
    .line 594
    const v15, 0x3f3ae148    # 0.73f

    .line 595
    .line 596
    .line 597
    const v16, -0x3ff33333    # -2.2f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, -0x3ff7ae14    # -2.13f

    .line 604
    .line 605
    .line 606
    const v18, 0x405eb852    # 3.48f

    .line 607
    .line 608
    .line 609
    const v13, -0x41666666    # -0.3f

    .line 610
    .line 611
    .line 612
    const v14, 0x402c28f6    # 2.69f

    .line 613
    .line 614
    .line 615
    const v15, -0x4048f5c3    # -1.43f

    .line 616
    .line 617
    .line 618
    const v16, 0x405eb852    # 3.48f

    .line 619
    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    const/16 v16, 0x3800

    .line 632
    .line 633
    const/16 v17, 0x0

    .line 634
    .line 635
    const/high16 v6, 0x3f800000    # 1.0f

    .line 636
    .line 637
    const/high16 v8, 0x3f800000    # 1.0f

    .line 638
    .line 639
    const/4 v7, 0x0

    .line 640
    const/high16 v9, 0x3f800000    # 1.0f

    .line 641
    .line 642
    const/high16 v12, 0x3f800000    # 1.0f

    .line 643
    .line 644
    const/4 v13, 0x0

    .line 645
    const/4 v14, 0x0

    .line 646
    const/4 v15, 0x0

    .line 647
    const-string v4, ""

    .line 648
    .line 649
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    sput-object v0, Landroidx/compose/material/icons/rounded/GestureKt;->_gesture:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 658
    .line 659
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    return-object v0
.end method

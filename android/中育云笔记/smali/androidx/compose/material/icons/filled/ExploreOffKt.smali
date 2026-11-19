.class public final Landroidx/compose/material/icons/filled/ExploreOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getExploreOff(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ExploreOffKt;->_exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ExploreOff"

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
    const v0, 0x41630a3d    # 14.19f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v0, -0x404b851f    # -1.41f

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v0, -0x403851ec    # -1.56f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v0, 0x41300000    # 11.0f

    .line 89
    .line 90
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x411cf5c3    # 9.81f

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x409dc28f    # 4.93f

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v0, 0x401147ae    # 2.27f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v0, 0x3f800000    # 1.0f

    .line 112
    .line 113
    const v2, 0x40628f5c    # 3.54f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v0, 0x4031eb85    # 2.78f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, -0x416147ae    # -0.31f

    .line 126
    .line 127
    .line 128
    const v18, 0x3ef5c28f    # 0.48f

    .line 129
    .line 130
    .line 131
    const v13, -0x421eb852    # -0.11f

    .line 132
    .line 133
    .line 134
    const v14, 0x3e23d70a    # 0.16f

    .line 135
    .line 136
    .line 137
    const v15, -0x41a8f5c3    # -0.21f

    .line 138
    .line 139
    .line 140
    const v16, 0x3ea3d70a    # 0.32f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v17, -0x41fae148    # -0.13f

    .line 147
    .line 148
    .line 149
    const v18, 0x3e570a3d    # 0.21f

    .line 150
    .line 151
    .line 152
    const v13, -0x42dc28f6    # -0.04f

    .line 153
    .line 154
    .line 155
    const v14, 0x3d8f5c29    # 0.07f

    .line 156
    .line 157
    .line 158
    const v15, -0x4247ae14    # -0.09f

    .line 159
    .line 160
    .line 161
    const v16, 0x3e0f5c29    # 0.14f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v17, -0x41800000    # -0.25f

    .line 168
    .line 169
    const v18, 0x3ef0a3d7    # 0.47f

    .line 170
    .line 171
    .line 172
    const v13, -0x4247ae14    # -0.09f

    .line 173
    .line 174
    .line 175
    const v14, 0x3e19999a    # 0.15f

    .line 176
    .line 177
    .line 178
    const v15, -0x41d1eb85    # -0.17f

    .line 179
    .line 180
    .line 181
    const v16, 0x3e9eb852    # 0.31f

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, -0x41dc28f6    # -0.16f

    .line 188
    .line 189
    .line 190
    const v18, 0x3ea3d70a    # 0.32f

    .line 191
    .line 192
    .line 193
    const v13, -0x42b33333    # -0.05f

    .line 194
    .line 195
    .line 196
    const v14, 0x3dcccccd    # 0.1f

    .line 197
    .line 198
    .line 199
    const v15, -0x42333333    # -0.1f

    .line 200
    .line 201
    .line 202
    const v16, 0x3e570a3d    # 0.21f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, -0x41bd70a4    # -0.19f

    .line 209
    .line 210
    .line 211
    const v18, 0x3edc28f6    # 0.43f

    .line 212
    .line 213
    .line 214
    const v13, -0x428a3d71    # -0.06f

    .line 215
    .line 216
    .line 217
    const v14, 0x3e0f5c29    # 0.14f

    .line 218
    .line 219
    .line 220
    const v15, -0x41fae148    # -0.13f

    .line 221
    .line 222
    .line 223
    const v16, 0x3e8f5c29    # 0.28f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, -0x4175c28f    # -0.27f

    .line 230
    .line 231
    .line 232
    const v18, 0x3f3ae148    # 0.73f

    .line 233
    .line 234
    .line 235
    const v13, -0x42333333    # -0.1f

    .line 236
    .line 237
    .line 238
    const v14, 0x3e75c28f    # 0.24f

    .line 239
    .line 240
    .line 241
    const v15, -0x41bd70a4    # -0.19f

    .line 242
    .line 243
    .line 244
    const v16, 0x3ef5c28f    # 0.48f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x4247ae14    # -0.09f

    .line 251
    .line 252
    .line 253
    const v2, 0x3e99999a    # 0.3f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, -0x41f0a3d7    # -0.14f

    .line 260
    .line 261
    .line 262
    const v18, 0x3f170a3d    # 0.59f

    .line 263
    .line 264
    .line 265
    const v13, -0x42b33333    # -0.05f

    .line 266
    .line 267
    .line 268
    const v14, 0x3e4ccccd    # 0.2f

    .line 269
    .line 270
    .line 271
    const v15, -0x42333333    # -0.1f

    .line 272
    .line 273
    .line 274
    const v16, 0x3ec7ae14    # 0.39f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v17, -0x4270a3d7    # -0.07f

    .line 281
    .line 282
    .line 283
    const v18, 0x3ea8f5c3    # 0.33f

    .line 284
    .line 285
    .line 286
    const v13, -0x435c28f6    # -0.02f

    .line 287
    .line 288
    .line 289
    const v14, 0x3de147ae    # 0.11f

    .line 290
    .line 291
    .line 292
    const v15, -0x42dc28f6    # -0.04f

    .line 293
    .line 294
    .line 295
    const v16, 0x3e6147ae    # 0.22f

    .line 296
    .line 297
    .line 298
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, -0x4247ae14    # -0.09f

    .line 302
    .line 303
    .line 304
    const v18, 0x3f1c28f6    # 0.61f

    .line 305
    .line 306
    .line 307
    const v13, -0x42dc28f6    # -0.04f

    .line 308
    .line 309
    .line 310
    const v14, 0x3e4ccccd    # 0.2f

    .line 311
    .line 312
    .line 313
    const v15, -0x4270a3d7    # -0.07f

    .line 314
    .line 315
    .line 316
    const v16, 0x3ecccccd    # 0.4f

    .line 317
    .line 318
    .line 319
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const v17, -0x430a3d71    # -0.03f

    .line 323
    .line 324
    .line 325
    const v18, 0x3e99999a    # 0.3f

    .line 326
    .line 327
    .line 328
    const v13, -0x43dc28f6    # -0.01f

    .line 329
    .line 330
    .line 331
    const v14, 0x3dcccccd    # 0.1f

    .line 332
    .line 333
    .line 334
    const v15, -0x430a3d71    # -0.03f

    .line 335
    .line 336
    .line 337
    const v16, 0x3e4ccccd    # 0.2f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v17, -0x42b33333    # -0.05f

    .line 344
    .line 345
    .line 346
    const v18, 0x3f68f5c3    # 0.91f

    .line 347
    .line 348
    .line 349
    const v13, -0x430a3d71    # -0.03f

    .line 350
    .line 351
    .line 352
    const v14, 0x3e947ae1    # 0.29f

    .line 353
    .line 354
    .line 355
    const v15, -0x42b33333    # -0.05f

    .line 356
    .line 357
    .line 358
    const v16, 0x3f19999a    # 0.6f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, 0x41200000    # 10.0f

    .line 365
    .line 366
    const/high16 v18, 0x41200000    # 10.0f

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const v14, 0x40b0a3d7    # 5.52f

    .line 370
    .line 371
    .line 372
    const v15, 0x408f5c29    # 4.48f

    .line 373
    .line 374
    .line 375
    const/high16 v16, 0x41200000    # 10.0f

    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v17, 0x3f6b851f    # 0.92f

    .line 381
    .line 382
    .line 383
    const v18, -0x42b33333    # -0.05f

    .line 384
    .line 385
    .line 386
    const v13, 0x3e9eb852    # 0.31f

    .line 387
    .line 388
    .line 389
    const/4 v14, 0x0

    .line 390
    const v15, 0x3f1eb852    # 0.62f

    .line 391
    .line 392
    .line 393
    const v16, -0x435c28f6    # -0.02f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, -0x430a3d71    # -0.03f

    .line 400
    .line 401
    .line 402
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, 0x3f1c28f6    # 0.61f

    .line 406
    .line 407
    .line 408
    const v18, -0x4247ae14    # -0.09f

    .line 409
    .line 410
    .line 411
    const v13, 0x3e4ccccd    # 0.2f

    .line 412
    .line 413
    .line 414
    const v14, -0x435c28f6    # -0.02f

    .line 415
    .line 416
    .line 417
    const v15, 0x3ed1eb85    # 0.41f

    .line 418
    .line 419
    .line 420
    const v16, -0x428a3d71    # -0.06f

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v17, 0x3ea8f5c3    # 0.33f

    .line 427
    .line 428
    .line 429
    const v18, -0x4270a3d7    # -0.07f

    .line 430
    .line 431
    .line 432
    const v13, 0x3de147ae    # 0.11f

    .line 433
    .line 434
    .line 435
    const v15, 0x3e6147ae    # 0.22f

    .line 436
    .line 437
    .line 438
    const v16, -0x42dc28f6    # -0.04f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, 0x3f147ae1    # 0.58f

    .line 445
    .line 446
    .line 447
    const v18, -0x41e66666    # -0.15f

    .line 448
    .line 449
    .line 450
    const v13, 0x3e4ccccd    # 0.2f

    .line 451
    .line 452
    .line 453
    const v14, -0x42dc28f6    # -0.04f

    .line 454
    .line 455
    .line 456
    const v15, 0x3ec7ae14    # 0.39f

    .line 457
    .line 458
    .line 459
    const v16, -0x4247ae14    # -0.09f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v17, 0x3e99999a    # 0.3f

    .line 466
    .line 467
    .line 468
    const v18, -0x4247ae14    # -0.09f

    .line 469
    .line 470
    .line 471
    const v13, 0x3dcccccd    # 0.1f

    .line 472
    .line 473
    .line 474
    const v14, -0x430a3d71    # -0.03f

    .line 475
    .line 476
    .line 477
    const v15, 0x3e4ccccd    # 0.2f

    .line 478
    .line 479
    .line 480
    const v16, -0x42b33333    # -0.05f

    .line 481
    .line 482
    .line 483
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v17, 0x3f3ae148    # 0.73f

    .line 487
    .line 488
    .line 489
    const v18, -0x4175c28f    # -0.27f

    .line 490
    .line 491
    .line 492
    const/high16 v13, 0x3e800000    # 0.25f

    .line 493
    .line 494
    const v14, -0x425c28f6    # -0.08f

    .line 495
    .line 496
    .line 497
    const v15, 0x3efae148    # 0.49f

    .line 498
    .line 499
    .line 500
    const v16, -0x41d1eb85    # -0.17f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x3edc28f6    # 0.43f

    .line 507
    .line 508
    .line 509
    const v18, -0x41bd70a4    # -0.19f

    .line 510
    .line 511
    .line 512
    const v13, 0x3e19999a    # 0.15f

    .line 513
    .line 514
    .line 515
    const v14, -0x428a3d71    # -0.06f

    .line 516
    .line 517
    .line 518
    const v15, 0x3e947ae1    # 0.29f

    .line 519
    .line 520
    .line 521
    const v16, -0x41fae148    # -0.13f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v17, 0x3ea8f5c3    # 0.33f

    .line 528
    .line 529
    .line 530
    const v18, -0x41dc28f6    # -0.16f

    .line 531
    .line 532
    .line 533
    const v13, 0x3de147ae    # 0.11f

    .line 534
    .line 535
    .line 536
    const v14, -0x42b33333    # -0.05f

    .line 537
    .line 538
    .line 539
    const v15, 0x3e6147ae    # 0.22f

    .line 540
    .line 541
    .line 542
    const v16, -0x42333333    # -0.1f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v17, 0x3eeb851f    # 0.46f

    .line 549
    .line 550
    .line 551
    const/high16 v18, -0x41800000    # -0.25f

    .line 552
    .line 553
    const v13, 0x3e23d70a    # 0.16f

    .line 554
    .line 555
    .line 556
    const v14, -0x425c28f6    # -0.08f

    .line 557
    .line 558
    .line 559
    const v15, 0x3e9eb852    # 0.31f

    .line 560
    .line 561
    .line 562
    const v16, -0x41dc28f6    # -0.16f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, 0x3e570a3d    # 0.21f

    .line 569
    .line 570
    .line 571
    const v18, -0x41fae148    # -0.13f

    .line 572
    .line 573
    .line 574
    const v13, 0x3d8f5c29    # 0.07f

    .line 575
    .line 576
    .line 577
    const v14, -0x42dc28f6    # -0.04f

    .line 578
    .line 579
    .line 580
    const v15, 0x3e0f5c29    # 0.14f

    .line 581
    .line 582
    .line 583
    const v16, -0x4247ae14    # -0.09f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v17, 0x3ef5c28f    # 0.48f

    .line 590
    .line 591
    .line 592
    const v18, -0x416147ae    # -0.31f

    .line 593
    .line 594
    .line 595
    const v13, 0x3e23d70a    # 0.16f

    .line 596
    .line 597
    .line 598
    const v14, -0x42333333    # -0.1f

    .line 599
    .line 600
    .line 601
    const v15, 0x3ea3d70a    # 0.32f

    .line 602
    .line 603
    .line 604
    const v16, -0x41b33333    # -0.2f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v0, 0x41a3ae14    # 20.46f

    .line 611
    .line 612
    .line 613
    const/high16 v2, 0x41b80000    # 23.0f

    .line 614
    .line 615
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v0, 0x3fa28f5c    # 1.27f

    .line 619
    .line 620
    .line 621
    const v2, -0x405d70a4    # -1.27f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, -0x3fd5c28f    # -2.66f

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const v0, -0x3f63d70a    # -4.88f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v0, 0x41900000    # 18.0f

    .line 643
    .line 644
    const/high16 v2, 0x40c00000    # 6.0f

    .line 645
    .line 646
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, -0x3f3147ae    # -6.46f

    .line 650
    .line 651
    .line 652
    const/high16 v2, 0x40400000    # 3.0f

    .line 653
    .line 654
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, 0x41700000    # 15.0f

    .line 658
    .line 659
    const v2, 0x41475c29    # 12.46f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const/high16 v0, 0x41900000    # 18.0f

    .line 666
    .line 667
    const/high16 v2, 0x40c00000    # 6.0f

    .line 668
    .line 669
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v0, 0x41b00000    # 22.0f

    .line 676
    .line 677
    const/high16 v2, 0x41400000    # 12.0f

    .line 678
    .line 679
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v17, -0x42b33333    # -0.05f

    .line 683
    .line 684
    .line 685
    const v18, 0x3f6b851f    # 0.92f

    .line 686
    .line 687
    .line 688
    const/4 v13, 0x0

    .line 689
    const v14, 0x3e9eb852    # 0.31f

    .line 690
    .line 691
    .line 692
    const v15, -0x435c28f6    # -0.02f

    .line 693
    .line 694
    .line 695
    const v16, 0x3f1eb852    # 0.62f

    .line 696
    .line 697
    .line 698
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v0, -0x430a3d71    # -0.03f

    .line 702
    .line 703
    .line 704
    const v2, 0x3e99999a    # 0.3f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v17, -0x4247ae14    # -0.09f

    .line 711
    .line 712
    .line 713
    const v18, 0x3f1c28f6    # 0.61f

    .line 714
    .line 715
    .line 716
    const v13, -0x435c28f6    # -0.02f

    .line 717
    .line 718
    .line 719
    const v14, 0x3e4ccccd    # 0.2f

    .line 720
    .line 721
    .line 722
    const v15, -0x428a3d71    # -0.06f

    .line 723
    .line 724
    .line 725
    const v16, 0x3ed1eb85    # 0.41f

    .line 726
    .line 727
    .line 728
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const v17, -0x4270a3d7    # -0.07f

    .line 732
    .line 733
    .line 734
    const v18, 0x3ea8f5c3    # 0.33f

    .line 735
    .line 736
    .line 737
    const v14, 0x3de147ae    # 0.11f

    .line 738
    .line 739
    .line 740
    const v15, -0x42dc28f6    # -0.04f

    .line 741
    .line 742
    .line 743
    const v16, 0x3e6147ae    # 0.22f

    .line 744
    .line 745
    .line 746
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const v17, -0x41e66666    # -0.15f

    .line 750
    .line 751
    .line 752
    const v18, 0x3f147ae1    # 0.58f

    .line 753
    .line 754
    .line 755
    const v13, -0x42dc28f6    # -0.04f

    .line 756
    .line 757
    .line 758
    const v14, 0x3e4ccccd    # 0.2f

    .line 759
    .line 760
    .line 761
    const v15, -0x4247ae14    # -0.09f

    .line 762
    .line 763
    .line 764
    const v16, 0x3ec7ae14    # 0.39f

    .line 765
    .line 766
    .line 767
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const v17, -0x4247ae14    # -0.09f

    .line 771
    .line 772
    .line 773
    const v18, 0x3e9eb852    # 0.31f

    .line 774
    .line 775
    .line 776
    const v13, -0x430a3d71    # -0.03f

    .line 777
    .line 778
    .line 779
    const v14, 0x3dcccccd    # 0.1f

    .line 780
    .line 781
    .line 782
    const v15, -0x42b33333    # -0.05f

    .line 783
    .line 784
    .line 785
    const v16, 0x3e570a3d    # 0.21f

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const v17, -0x4175c28f    # -0.27f

    .line 792
    .line 793
    .line 794
    const v18, 0x3f3ae148    # 0.73f

    .line 795
    .line 796
    .line 797
    const v13, -0x425c28f6    # -0.08f

    .line 798
    .line 799
    .line 800
    const/high16 v14, 0x3e800000    # 0.25f

    .line 801
    .line 802
    const v15, -0x41d1eb85    # -0.17f

    .line 803
    .line 804
    .line 805
    const v16, 0x3efae148    # 0.49f

    .line 806
    .line 807
    .line 808
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const v17, -0x41bd70a4    # -0.19f

    .line 812
    .line 813
    .line 814
    const v18, 0x3edc28f6    # 0.43f

    .line 815
    .line 816
    .line 817
    const v13, -0x428a3d71    # -0.06f

    .line 818
    .line 819
    .line 820
    const v14, 0x3e19999a    # 0.15f

    .line 821
    .line 822
    .line 823
    const v15, -0x41fae148    # -0.13f

    .line 824
    .line 825
    .line 826
    const v16, 0x3e947ae1    # 0.29f

    .line 827
    .line 828
    .line 829
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v17, -0x41dc28f6    # -0.16f

    .line 833
    .line 834
    .line 835
    const v18, 0x3ea8f5c3    # 0.33f

    .line 836
    .line 837
    .line 838
    const v13, -0x42b33333    # -0.05f

    .line 839
    .line 840
    .line 841
    const v14, 0x3de147ae    # 0.11f

    .line 842
    .line 843
    .line 844
    const v15, -0x42333333    # -0.1f

    .line 845
    .line 846
    .line 847
    const v16, 0x3e6147ae    # 0.22f

    .line 848
    .line 849
    .line 850
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/high16 v17, -0x41800000    # -0.25f

    .line 854
    .line 855
    const v18, 0x3eeb851f    # 0.46f

    .line 856
    .line 857
    .line 858
    const v13, -0x425c28f6    # -0.08f

    .line 859
    .line 860
    .line 861
    const v14, 0x3e23d70a    # 0.16f

    .line 862
    .line 863
    .line 864
    const v15, -0x41dc28f6    # -0.16f

    .line 865
    .line 866
    .line 867
    const v16, 0x3e9eb852    # 0.31f

    .line 868
    .line 869
    .line 870
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 871
    .line 872
    .line 873
    const v17, -0x41fae148    # -0.13f

    .line 874
    .line 875
    .line 876
    const v18, 0x3e570a3d    # 0.21f

    .line 877
    .line 878
    .line 879
    const v13, -0x42dc28f6    # -0.04f

    .line 880
    .line 881
    .line 882
    const v14, 0x3d8f5c29    # 0.07f

    .line 883
    .line 884
    .line 885
    const v15, -0x4247ae14    # -0.09f

    .line 886
    .line 887
    .line 888
    const v16, 0x3e0f5c29    # 0.14f

    .line 889
    .line 890
    .line 891
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 892
    .line 893
    .line 894
    const v17, -0x416147ae    # -0.31f

    .line 895
    .line 896
    .line 897
    const v18, 0x3ef5c28f    # 0.48f

    .line 898
    .line 899
    .line 900
    const v13, -0x42333333    # -0.1f

    .line 901
    .line 902
    .line 903
    const v14, 0x3e23d70a    # 0.16f

    .line 904
    .line 905
    .line 906
    const v15, -0x41b33333    # -0.2f

    .line 907
    .line 908
    .line 909
    const v16, 0x3ea3d70a    # 0.32f

    .line 910
    .line 911
    .line 912
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const/high16 v0, 0x41700000    # 15.0f

    .line 916
    .line 917
    const v2, 0x41475c29    # 12.46f

    .line 918
    .line 919
    .line 920
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const/high16 v0, 0x41900000    # 18.0f

    .line 924
    .line 925
    const/high16 v2, 0x40c00000    # 6.0f

    .line 926
    .line 927
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 928
    .line 929
    .line 930
    const v0, -0x3f3147ae    # -6.46f

    .line 931
    .line 932
    .line 933
    const/high16 v2, 0x40400000    # 3.0f

    .line 934
    .line 935
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 936
    .line 937
    .line 938
    const v0, -0x3f58f5c3    # -5.22f

    .line 939
    .line 940
    .line 941
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    const v17, 0x3ef5c28f    # 0.48f

    .line 945
    .line 946
    .line 947
    const v18, -0x416147ae    # -0.31f

    .line 948
    .line 949
    .line 950
    const v13, 0x3e23d70a    # 0.16f

    .line 951
    .line 952
    .line 953
    const v14, -0x421eb852    # -0.11f

    .line 954
    .line 955
    .line 956
    const v15, 0x3ea3d70a    # 0.32f

    .line 957
    .line 958
    .line 959
    const v16, -0x41a8f5c3    # -0.21f

    .line 960
    .line 961
    .line 962
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 963
    .line 964
    .line 965
    const v17, 0x3e570a3d    # 0.21f

    .line 966
    .line 967
    .line 968
    const v18, -0x41fae148    # -0.13f

    .line 969
    .line 970
    .line 971
    const v13, 0x3d8f5c29    # 0.07f

    .line 972
    .line 973
    .line 974
    const v14, -0x42dc28f6    # -0.04f

    .line 975
    .line 976
    .line 977
    const v15, 0x3e0f5c29    # 0.14f

    .line 978
    .line 979
    .line 980
    const v16, -0x4247ae14    # -0.09f

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    const v17, 0x3eeb851f    # 0.46f

    .line 987
    .line 988
    .line 989
    const/high16 v18, -0x41800000    # -0.25f

    .line 990
    .line 991
    const v13, 0x3e19999a    # 0.15f

    .line 992
    .line 993
    .line 994
    const v14, -0x4247ae14    # -0.09f

    .line 995
    .line 996
    .line 997
    const v15, 0x3e9eb852    # 0.31f

    .line 998
    .line 999
    .line 1000
    const v16, -0x41d1eb85    # -0.17f

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1004
    .line 1005
    .line 1006
    const v17, 0x3ea8f5c3    # 0.33f

    .line 1007
    .line 1008
    .line 1009
    const v18, -0x41dc28f6    # -0.16f

    .line 1010
    .line 1011
    .line 1012
    const v13, 0x3de147ae    # 0.11f

    .line 1013
    .line 1014
    .line 1015
    const v14, -0x42b33333    # -0.05f

    .line 1016
    .line 1017
    .line 1018
    const v15, 0x3e6147ae    # 0.22f

    .line 1019
    .line 1020
    .line 1021
    const v16, -0x42333333    # -0.1f

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1025
    .line 1026
    .line 1027
    const v17, 0x3edc28f6    # 0.43f

    .line 1028
    .line 1029
    .line 1030
    const v18, -0x41bd70a4    # -0.19f

    .line 1031
    .line 1032
    .line 1033
    const v13, 0x3e0f5c29    # 0.14f

    .line 1034
    .line 1035
    .line 1036
    const v14, -0x428a3d71    # -0.06f

    .line 1037
    .line 1038
    .line 1039
    const v15, 0x3e8f5c29    # 0.28f

    .line 1040
    .line 1041
    .line 1042
    const v16, -0x41fae148    # -0.13f

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const v17, 0x3f3ae148    # 0.73f

    .line 1049
    .line 1050
    .line 1051
    const v18, -0x4175c28f    # -0.27f

    .line 1052
    .line 1053
    .line 1054
    const v13, 0x3e75c28f    # 0.24f

    .line 1055
    .line 1056
    .line 1057
    const v14, -0x42333333    # -0.1f

    .line 1058
    .line 1059
    .line 1060
    const v15, 0x3ef5c28f    # 0.48f

    .line 1061
    .line 1062
    .line 1063
    const v16, -0x41bd70a4    # -0.19f

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1067
    .line 1068
    .line 1069
    const v0, 0x3e9eb852    # 0.31f

    .line 1070
    .line 1071
    .line 1072
    const v2, -0x4247ae14    # -0.09f

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1076
    .line 1077
    .line 1078
    const v17, 0x3f147ae1    # 0.58f

    .line 1079
    .line 1080
    .line 1081
    const v18, -0x41e66666    # -0.15f

    .line 1082
    .line 1083
    .line 1084
    const v13, 0x3e428f5c    # 0.19f

    .line 1085
    .line 1086
    .line 1087
    const v14, -0x42b33333    # -0.05f

    .line 1088
    .line 1089
    .line 1090
    const v15, 0x3ec28f5c    # 0.38f

    .line 1091
    .line 1092
    .line 1093
    const v16, -0x421eb852    # -0.11f

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const v17, 0x3ea8f5c3    # 0.33f

    .line 1100
    .line 1101
    .line 1102
    const v18, -0x4270a3d7    # -0.07f

    .line 1103
    .line 1104
    .line 1105
    const v13, 0x3de147ae    # 0.11f

    .line 1106
    .line 1107
    .line 1108
    const v14, -0x435c28f6    # -0.02f

    .line 1109
    .line 1110
    .line 1111
    const v15, 0x3e6147ae    # 0.22f

    .line 1112
    .line 1113
    .line 1114
    const v16, -0x42dc28f6    # -0.04f

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const v17, 0x3f1c28f6    # 0.61f

    .line 1121
    .line 1122
    .line 1123
    const v18, -0x4247ae14    # -0.09f

    .line 1124
    .line 1125
    .line 1126
    const v13, 0x3e4ccccd    # 0.2f

    .line 1127
    .line 1128
    .line 1129
    const v14, -0x42dc28f6    # -0.04f

    .line 1130
    .line 1131
    .line 1132
    const v15, 0x3ecccccd    # 0.4f

    .line 1133
    .line 1134
    .line 1135
    const v16, -0x4270a3d7    # -0.07f

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1139
    .line 1140
    .line 1141
    const v17, 0x3e99999a    # 0.3f

    .line 1142
    .line 1143
    .line 1144
    const v18, -0x430a3d71    # -0.03f

    .line 1145
    .line 1146
    .line 1147
    const v13, 0x3dcccccd    # 0.1f

    .line 1148
    .line 1149
    .line 1150
    const v14, -0x43dc28f6    # -0.01f

    .line 1151
    .line 1152
    .line 1153
    const v15, 0x3e4ccccd    # 0.2f

    .line 1154
    .line 1155
    .line 1156
    const v16, -0x430a3d71    # -0.03f

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1160
    .line 1161
    .line 1162
    const v17, 0x3f68f5c3    # 0.91f

    .line 1163
    .line 1164
    .line 1165
    const v18, -0x42dc28f6    # -0.04f

    .line 1166
    .line 1167
    .line 1168
    const v13, 0x3e947ae1    # 0.29f

    .line 1169
    .line 1170
    .line 1171
    const v14, -0x435c28f6    # -0.02f

    .line 1172
    .line 1173
    .line 1174
    const v15, 0x3f19999a    # 0.6f

    .line 1175
    .line 1176
    .line 1177
    const v16, -0x42dc28f6    # -0.04f

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1181
    .line 1182
    .line 1183
    const/high16 v17, 0x41200000    # 10.0f

    .line 1184
    .line 1185
    const/high16 v18, 0x41200000    # 10.0f

    .line 1186
    .line 1187
    const v13, 0x40b0a3d7    # 5.52f

    .line 1188
    .line 1189
    .line 1190
    const/4 v14, 0x0

    .line 1191
    const/high16 v15, 0x41200000    # 10.0f

    .line 1192
    .line 1193
    const v16, 0x408f5c29    # 4.48f

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v2

    .line 1206
    const/16 v16, 0x3800

    .line 1207
    .line 1208
    const/16 v17, 0x0

    .line 1209
    .line 1210
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1211
    .line 1212
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1213
    .line 1214
    const/4 v7, 0x0

    .line 1215
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1216
    .line 1217
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1218
    .line 1219
    const/4 v13, 0x0

    .line 1220
    const/4 v15, 0x0

    .line 1221
    const-string v4, ""

    .line 1222
    .line 1223
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v0

    .line 1227
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0

    .line 1231
    sput-object v0, Landroidx/compose/material/icons/filled/ExploreOffKt;->_exploreOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1232
    .line 1233
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1234
    .line 1235
    .line 1236
    return-object v0
.end method

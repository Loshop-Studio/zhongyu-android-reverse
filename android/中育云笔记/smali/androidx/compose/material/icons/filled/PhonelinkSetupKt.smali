.class public final Landroidx/compose/material/icons/filled/PhonelinkSetupKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _phonelinkSetup:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPhonelinkSetup(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/PhonelinkSetupKt;->_phonelinkSetup:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.PhonelinkSetup"

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
    const v0, 0x412d1eb8    # 10.82f

    .line 71
    .line 72
    .line 73
    const v2, 0x4147d70a    # 12.49f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3d23d70a    # 0.04f

    .line 80
    .line 81
    .line 82
    const v18, -0x41051eb8    # -0.49f

    .line 83
    .line 84
    .line 85
    const v13, 0x3ca3d70a    # 0.02f

    .line 86
    .line 87
    .line 88
    const v14, -0x41dc28f6    # -0.16f

    .line 89
    .line 90
    .line 91
    const v15, 0x3d23d70a    # 0.04f

    .line 92
    .line 93
    .line 94
    const v16, -0x415c28f6    # -0.32f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x42dc28f6    # -0.04f

    .line 101
    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    const v14, -0x41d1eb85    # -0.17f

    .line 105
    .line 106
    .line 107
    const v15, -0x435c28f6    # -0.02f

    .line 108
    .line 109
    .line 110
    const v16, -0x41570a3d    # -0.33f

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, -0x40ae147b    # -0.82f

    .line 117
    .line 118
    .line 119
    const v2, 0x3f8a3d71    # 1.08f

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v17, 0x3d75c28f    # 0.06f

    .line 126
    .line 127
    .line 128
    const v18, -0x415c28f6    # -0.32f

    .line 129
    .line 130
    .line 131
    const v13, 0x3dcccccd    # 0.1f

    .line 132
    .line 133
    .line 134
    const v14, -0x4270a3d7    # -0.07f

    .line 135
    .line 136
    .line 137
    const v15, 0x3df5c28f    # 0.12f

    .line 138
    .line 139
    .line 140
    const v16, -0x41a8f5c3    # -0.21f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v0, -0x40228f5c    # -1.73f

    .line 147
    .line 148
    .line 149
    const v2, -0x407c28f6    # -1.03f

    .line 150
    .line 151
    .line 152
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const v17, -0x416147ae    # -0.31f

    .line 156
    .line 157
    .line 158
    const v18, -0x421eb852    # -0.11f

    .line 159
    .line 160
    .line 161
    const v13, -0x428a3d71    # -0.06f

    .line 162
    .line 163
    .line 164
    const v14, -0x421eb852    # -0.11f

    .line 165
    .line 166
    .line 167
    const v15, -0x41b33333    # -0.2f

    .line 168
    .line 169
    .line 170
    const v16, -0x41e66666    # -0.15f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v0, 0x3f000000    # 0.5f

    .line 177
    .line 178
    const v2, -0x405c28f6    # -1.28f

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, -0x40a147ae    # -0.87f

    .line 185
    .line 186
    .line 187
    const v18, -0x41051eb8    # -0.49f

    .line 188
    .line 189
    .line 190
    const v13, -0x4175c28f    # -0.27f

    .line 191
    .line 192
    .line 193
    const v14, -0x41b33333    # -0.2f

    .line 194
    .line 195
    .line 196
    const v15, -0x40f0a3d7    # -0.56f

    .line 197
    .line 198
    .line 199
    const v16, -0x4147ae14    # -0.36f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, -0x4055c28f    # -1.33f

    .line 206
    .line 207
    .line 208
    const v2, -0x41b33333    # -0.2f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v17, -0x418a3d71    # -0.24f

    .line 215
    .line 216
    .line 217
    const v18, -0x41a8f5c3    # -0.21f

    .line 218
    .line 219
    .line 220
    const/4 v13, 0x0

    .line 221
    const v14, -0x420a3d71    # -0.12f

    .line 222
    .line 223
    .line 224
    const v15, -0x421eb852    # -0.11f

    .line 225
    .line 226
    .line 227
    const v16, -0x41a8f5c3    # -0.21f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v0, 0x40bf5c29    # 5.98f

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v17, -0x417ae148    # -0.26f

    .line 240
    .line 241
    .line 242
    const v18, 0x3e570a3d    # 0.21f

    .line 243
    .line 244
    .line 245
    const v13, -0x41fae148    # -0.13f

    .line 246
    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    const v15, -0x418a3d71    # -0.24f

    .line 250
    .line 251
    .line 252
    const v16, 0x3db851ec    # 0.09f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v0, 0x3fa8f5c3    # 1.32f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const v17, -0x40a147ae    # -0.87f

    .line 265
    .line 266
    .line 267
    const v18, 0x3efae148    # 0.49f

    .line 268
    .line 269
    .line 270
    const v13, -0x416147ae    # -0.31f

    .line 271
    .line 272
    .line 273
    const v14, 0x3df5c28f    # 0.12f

    .line 274
    .line 275
    .line 276
    const v15, -0x40e66666    # -0.6f

    .line 277
    .line 278
    .line 279
    const v16, 0x3e99999a    # 0.3f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const/high16 v0, -0x41000000    # -0.5f

    .line 286
    .line 287
    const v2, -0x405c28f6    # -1.28f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x416147ae    # -0.31f

    .line 294
    .line 295
    .line 296
    const v18, 0x3de147ae    # 0.11f

    .line 297
    .line 298
    .line 299
    const v13, -0x420a3d71    # -0.12f

    .line 300
    .line 301
    .line 302
    const v14, -0x42b33333    # -0.05f

    .line 303
    .line 304
    .line 305
    const/high16 v15, -0x41800000    # -0.25f

    .line 306
    .line 307
    const/16 v16, 0x0

    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x3fdd70a4    # 1.73f

    .line 313
    .line 314
    .line 315
    const v2, -0x407c28f6    # -1.03f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x3d8f5c29    # 0.07f

    .line 322
    .line 323
    .line 324
    const v18, 0x3ea8f5c3    # 0.33f

    .line 325
    .line 326
    .line 327
    const v13, -0x428a3d71    # -0.06f

    .line 328
    .line 329
    .line 330
    const v14, 0x3df5c28f    # 0.12f

    .line 331
    .line 332
    .line 333
    const v15, -0x430a3d71    # -0.03f

    .line 334
    .line 335
    .line 336
    const/high16 v16, 0x3e800000    # 0.25f

    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v0, 0x3f51eb85    # 0.82f

    .line 342
    .line 343
    .line 344
    const v2, 0x3f8a3d71    # 1.08f

    .line 345
    .line 346
    .line 347
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, -0x430a3d71    # -0.03f

    .line 351
    .line 352
    .line 353
    const v18, 0x3efae148    # 0.49f

    .line 354
    .line 355
    .line 356
    const v13, -0x435c28f6    # -0.02f

    .line 357
    .line 358
    .line 359
    const v14, 0x3e23d70a    # 0.16f

    .line 360
    .line 361
    .line 362
    const v16, 0x3ea8f5c3    # 0.33f

    .line 363
    .line 364
    .line 365
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v17, 0x3d23d70a    # 0.04f

    .line 369
    .line 370
    .line 371
    const/4 v13, 0x0

    .line 372
    const v14, 0x3e2e147b    # 0.17f

    .line 373
    .line 374
    .line 375
    const v15, 0x3ca3d70a    # 0.02f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, -0x40747ae1    # -1.09f

    .line 382
    .line 383
    .line 384
    const v2, 0x3f547ae1    # 0.83f

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, -0x428a3d71    # -0.06f

    .line 391
    .line 392
    .line 393
    const v18, 0x3ea3d70a    # 0.32f

    .line 394
    .line 395
    .line 396
    const v13, -0x42333333    # -0.1f

    .line 397
    .line 398
    .line 399
    const v14, 0x3d8f5c29    # 0.07f

    .line 400
    .line 401
    .line 402
    const v15, -0x420a3d71    # -0.12f

    .line 403
    .line 404
    .line 405
    const v16, 0x3e570a3d    # 0.21f

    .line 406
    .line 407
    .line 408
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const v0, 0x3f83d70a    # 1.03f

    .line 412
    .line 413
    .line 414
    const v2, 0x3fdd70a4    # 1.73f

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v17, 0x3e9eb852    # 0.31f

    .line 421
    .line 422
    .line 423
    const v18, 0x3de147ae    # 0.11f

    .line 424
    .line 425
    .line 426
    const v13, 0x3d75c28f    # 0.06f

    .line 427
    .line 428
    .line 429
    const v14, 0x3de147ae    # 0.11f

    .line 430
    .line 431
    .line 432
    const v15, 0x3e4ccccd    # 0.2f

    .line 433
    .line 434
    .line 435
    const v16, 0x3e19999a    # 0.15f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v0, 0x3fa3d70a    # 1.28f

    .line 442
    .line 443
    .line 444
    const/high16 v2, -0x41000000    # -0.5f

    .line 445
    .line 446
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const v17, 0x3f5eb852    # 0.87f

    .line 450
    .line 451
    .line 452
    const v18, 0x3efae148    # 0.49f

    .line 453
    .line 454
    .line 455
    const v13, 0x3e8a3d71    # 0.27f

    .line 456
    .line 457
    .line 458
    const v14, 0x3e4ccccd    # 0.2f

    .line 459
    .line 460
    .line 461
    const v15, 0x3f0f5c29    # 0.56f

    .line 462
    .line 463
    .line 464
    const v16, 0x3eb851ec    # 0.36f

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x3e4ccccd    # 0.2f

    .line 471
    .line 472
    .line 473
    const v2, 0x3fa8f5c3    # 1.32f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, 0x3e800000    # 0.25f

    .line 480
    .line 481
    const v18, 0x3e570a3d    # 0.21f

    .line 482
    .line 483
    .line 484
    const v13, 0x3c23d70a    # 0.01f

    .line 485
    .line 486
    .line 487
    const v14, 0x3df5c28f    # 0.12f

    .line 488
    .line 489
    .line 490
    const v15, 0x3df5c28f    # 0.12f

    .line 491
    .line 492
    .line 493
    const v16, 0x3e570a3d    # 0.21f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v0, 0x4003d70a    # 2.06f

    .line 500
    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v18, -0x41a8f5c3    # -0.21f

    .line 506
    .line 507
    .line 508
    const v13, 0x3e051eb8    # 0.13f

    .line 509
    .line 510
    .line 511
    const/4 v14, 0x0

    .line 512
    const v15, 0x3e75c28f    # 0.24f

    .line 513
    .line 514
    .line 515
    const v16, -0x4247ae14    # -0.09f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, -0x40570a3d    # -1.32f

    .line 522
    .line 523
    .line 524
    const v2, 0x3e4ccccd    # 0.2f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, 0x3f5eb852    # 0.87f

    .line 531
    .line 532
    .line 533
    const v18, -0x41051eb8    # -0.49f

    .line 534
    .line 535
    .line 536
    const v13, 0x3e9eb852    # 0.31f

    .line 537
    .line 538
    .line 539
    const v14, -0x420a3d71    # -0.12f

    .line 540
    .line 541
    .line 542
    const v15, 0x3f19999a    # 0.6f

    .line 543
    .line 544
    .line 545
    const v16, -0x41666666    # -0.3f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x3fa3d70a    # 1.28f

    .line 552
    .line 553
    .line 554
    const/high16 v2, 0x3f000000    # 0.5f

    .line 555
    .line 556
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const v17, 0x3e9eb852    # 0.31f

    .line 560
    .line 561
    .line 562
    const v18, -0x421eb852    # -0.11f

    .line 563
    .line 564
    .line 565
    const v13, 0x3df5c28f    # 0.12f

    .line 566
    .line 567
    .line 568
    const v14, 0x3d4ccccd    # 0.05f

    .line 569
    .line 570
    .line 571
    const/high16 v15, 0x3e800000    # 0.25f

    .line 572
    .line 573
    const/16 v16, 0x0

    .line 574
    .line 575
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const v0, 0x3f83d70a    # 1.03f

    .line 579
    .line 580
    .line 581
    const v2, -0x40228f5c    # -1.73f

    .line 582
    .line 583
    .line 584
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    const v17, -0x428a3d71    # -0.06f

    .line 588
    .line 589
    .line 590
    const v18, -0x415c28f6    # -0.32f

    .line 591
    .line 592
    .line 593
    const v13, 0x3d75c28f    # 0.06f

    .line 594
    .line 595
    .line 596
    const v14, -0x421eb852    # -0.11f

    .line 597
    .line 598
    .line 599
    const v15, 0x3d23d70a    # 0.04f

    .line 600
    .line 601
    .line 602
    const v16, -0x418a3d71    # -0.24f

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const v0, -0x40733333    # -1.1f

    .line 609
    .line 610
    .line 611
    const v2, -0x40ab851f    # -0.83f

    .line 612
    .line 613
    .line 614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, 0x40e00000    # 7.0f

    .line 621
    .line 622
    const/high16 v2, 0x415c0000    # 13.75f

    .line 623
    .line 624
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v17, -0x4019999a    # -1.8f

    .line 628
    .line 629
    .line 630
    const/high16 v18, -0x40200000    # -1.75f

    .line 631
    .line 632
    const v13, -0x40828f5c    # -0.99f

    .line 633
    .line 634
    .line 635
    const/4 v14, 0x0

    .line 636
    const v15, -0x4019999a    # -1.8f

    .line 637
    .line 638
    .line 639
    const v16, -0x40b851ec    # -0.78f

    .line 640
    .line 641
    .line 642
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v0, 0x3f4f5c29    # 0.81f

    .line 646
    .line 647
    .line 648
    const/high16 v2, -0x40200000    # -1.75f

    .line 649
    .line 650
    const v4, 0x3fe66666    # 1.8f

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, 0x3f47ae14    # 0.78f

    .line 657
    .line 658
    .line 659
    const/high16 v2, 0x3fe00000    # 1.75f

    .line 660
    .line 661
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x40e00000    # 7.0f

    .line 665
    .line 666
    const/high16 v2, 0x41000000    # 8.0f

    .line 667
    .line 668
    const/high16 v4, 0x415c0000    # 13.75f

    .line 669
    .line 670
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const/high16 v0, 0x41900000    # 18.0f

    .line 677
    .line 678
    const v2, 0x3f8147ae    # 1.01f

    .line 679
    .line 680
    .line 681
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v0, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/high16 v2, 0x41000000    # 8.0f

    .line 687
    .line 688
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 689
    .line 690
    .line 691
    const/high16 v17, -0x40000000    # -2.0f

    .line 692
    .line 693
    const/high16 v18, 0x40000000    # 2.0f

    .line 694
    .line 695
    const v13, -0x40733333    # -1.1f

    .line 696
    .line 697
    .line 698
    const/high16 v15, -0x40000000    # -2.0f

    .line 699
    .line 700
    const v16, 0x3f666666    # 0.9f

    .line 701
    .line 702
    .line 703
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const/high16 v0, 0x40400000    # 3.0f

    .line 707
    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v0, 0x40000000    # 2.0f

    .line 712
    .line 713
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    const/high16 v0, 0x40a00000    # 5.0f

    .line 717
    .line 718
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 719
    .line 720
    .line 721
    const/high16 v0, 0x41200000    # 10.0f

    .line 722
    .line 723
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v0, 0x41600000    # 14.0f

    .line 727
    .line 728
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 729
    .line 730
    .line 731
    const/high16 v0, 0x41000000    # 8.0f

    .line 732
    .line 733
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v0, -0x40800000    # -1.0f

    .line 737
    .line 738
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v0, 0x40c00000    # 6.0f

    .line 742
    .line 743
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v0, 0x40400000    # 3.0f

    .line 747
    .line 748
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v17, 0x40000000    # 2.0f

    .line 752
    .line 753
    const/4 v13, 0x0

    .line 754
    const v14, 0x3f8ccccd    # 1.1f

    .line 755
    .line 756
    .line 757
    const v15, 0x3f666666    # 0.9f

    .line 758
    .line 759
    .line 760
    const/high16 v16, 0x40000000    # 2.0f

    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v0, 0x41200000    # 10.0f

    .line 766
    .line 767
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 768
    .line 769
    .line 770
    const/high16 v18, -0x40000000    # -2.0f

    .line 771
    .line 772
    const v13, 0x3f8ccccd    # 1.1f

    .line 773
    .line 774
    .line 775
    const/4 v14, 0x0

    .line 776
    const/high16 v15, 0x40000000    # 2.0f

    .line 777
    .line 778
    const v16, -0x4099999a    # -0.9f

    .line 779
    .line 780
    .line 781
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const/high16 v0, 0x40400000    # 3.0f

    .line 785
    .line 786
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 787
    .line 788
    .line 789
    const/high16 v17, -0x40000000    # -2.0f

    .line 790
    .line 791
    const v18, -0x400147ae    # -1.99f

    .line 792
    .line 793
    .line 794
    const/4 v13, 0x0

    .line 795
    const v14, -0x40733333    # -1.1f

    .line 796
    .line 797
    .line 798
    const v15, -0x4099999a    # -0.9f

    .line 799
    .line 800
    .line 801
    const v16, -0x400147ae    # -1.99f

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 808
    .line 809
    .line 810
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    const/16 v16, 0x3800

    .line 815
    .line 816
    const/16 v17, 0x0

    .line 817
    .line 818
    const/high16 v6, 0x3f800000    # 1.0f

    .line 819
    .line 820
    const/high16 v8, 0x3f800000    # 1.0f

    .line 821
    .line 822
    const/4 v7, 0x0

    .line 823
    const/high16 v9, 0x3f800000    # 1.0f

    .line 824
    .line 825
    const/high16 v12, 0x3f800000    # 1.0f

    .line 826
    .line 827
    const/4 v14, 0x0

    .line 828
    const/4 v15, 0x0

    .line 829
    const-string v4, ""

    .line 830
    .line 831
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    sput-object v0, Landroidx/compose/material/icons/filled/PhonelinkSetupKt;->_phonelinkSetup:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 840
    .line 841
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    return-object v0
.end method

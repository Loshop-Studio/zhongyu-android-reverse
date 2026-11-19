.class public final Landroidx/compose/material/icons/rounded/WifiTetheringErrorRoundedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wifiTetheringErrorRounded:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWifiTetheringErrorRounded(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/WifiTetheringErrorRoundedKt;->_wifiTetheringErrorRounded:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.WifiTetheringErrorRounded"

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
    const v0, 0x412a8f5c    # 10.66f

    .line 71
    .line 72
    .line 73
    const v2, 0x40e47ae1    # 7.14f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f6f5c29    # -4.52f

    .line 80
    .line 81
    .line 82
    const v18, 0x409147ae    # 4.54f

    .line 83
    .line 84
    .line 85
    const v13, -0x3ff0a3d7    # -2.24f

    .line 86
    .line 87
    .line 88
    const v14, 0x3ef5c28f    # 0.48f

    .line 89
    .line 90
    .line 91
    const v15, -0x3f7eb852    # -4.04f

    .line 92
    .line 93
    .line 94
    const v16, 0x40133333    # 2.3f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3f63d70a    # 0.89f

    .line 101
    .line 102
    .line 103
    const v18, 0x40951eb8    # 4.66f

    .line 104
    .line 105
    .line 106
    const v13, -0x41428f5c    # -0.37f

    .line 107
    .line 108
    .line 109
    const/high16 v14, 0x3fe00000    # 1.75f

    .line 110
    .line 111
    const v15, 0x3ca3d70a    # 0.02f

    .line 112
    .line 113
    .line 114
    const v16, 0x405851ec    # 3.38f

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v17, 0x3fc147ae    # 1.51f

    .line 121
    .line 122
    .line 123
    const v18, 0x3de147ae    # 0.11f

    .line 124
    .line 125
    .line 126
    const v13, 0x3eae147b    # 0.34f

    .line 127
    .line 128
    .line 129
    const v14, 0x3f028f5c    # 0.51f

    .line 130
    .line 131
    .line 132
    const v15, 0x3f8a3d71    # 1.08f

    .line 133
    .line 134
    .line 135
    const v16, 0x3f0ccccd    # 0.55f

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/4 v0, 0x0

    .line 142
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, 0x3dcccccd    # 0.1f

    .line 146
    .line 147
    .line 148
    const v18, -0x405c28f6    # -1.28f

    .line 149
    .line 150
    .line 151
    const v13, 0x3eb33333    # 0.35f

    .line 152
    .line 153
    .line 154
    const v14, -0x414ccccd    # -0.35f

    .line 155
    .line 156
    .line 157
    const v15, 0x3ebd70a4    # 0.37f

    .line 158
    .line 159
    .line 160
    const v16, -0x409eb852    # -0.88f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, -0x40e3d70a    # -0.61f

    .line 167
    .line 168
    .line 169
    const v18, -0x3fd147ae    # -2.73f

    .line 170
    .line 171
    .line 172
    const/high16 v13, -0x41000000    # -0.5f

    .line 173
    .line 174
    const v14, -0x40bd70a4    # -0.76f

    .line 175
    .line 176
    .line 177
    const/high16 v15, -0x40c00000    # -0.75f

    .line 178
    .line 179
    const v16, -0x40251eb8    # -1.71f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v17, 0x405a3d71    # 3.41f

    .line 186
    .line 187
    .line 188
    const v18, -0x3fa66666    # -3.4f

    .line 189
    .line 190
    .line 191
    const v13, 0x3e6b851f    # 0.23f

    .line 192
    .line 193
    .line 194
    const v14, -0x402147ae    # -1.74f

    .line 195
    .line 196
    .line 197
    const v15, 0x3fd5c28f    # 1.67f

    .line 198
    .line 199
    .line 200
    const v16, -0x3fb51eb8    # -3.17f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v17, 0x41800000    # 16.0f

    .line 207
    .line 208
    const/high16 v18, 0x41500000    # 13.0f

    .line 209
    .line 210
    const v13, 0x415e6666    # 13.9f

    .line 211
    .line 212
    .line 213
    const v14, 0x410b5c29    # 8.71f

    .line 214
    .line 215
    .line 216
    const/high16 v15, 0x41800000    # 16.0f

    .line 217
    .line 218
    const v16, 0x4129c28f    # 10.61f

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v17, -0x40dc28f6    # -0.64f

    .line 225
    .line 226
    .line 227
    const v18, 0x400a3d71    # 2.16f

    .line 228
    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const v14, 0x3f4ccccd    # 0.8f

    .line 232
    .line 233
    .line 234
    const v15, -0x418a3d71    # -0.24f

    .line 235
    .line 236
    .line 237
    const v16, 0x3fc51eb8    # 1.54f

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v17, 0x3dcccccd    # 0.1f

    .line 244
    .line 245
    .line 246
    const v18, 0x3fa51eb8    # 1.29f

    .line 247
    .line 248
    .line 249
    const v13, -0x4175c28f    # -0.27f

    .line 250
    .line 251
    .line 252
    const v14, 0x3ed1eb85    # 0.41f

    .line 253
    .line 254
    .line 255
    const/high16 v15, -0x41800000    # -0.25f

    .line 256
    .line 257
    const v16, 0x3f733333    # 0.95f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v17, 0x3fc147ae    # 1.51f

    .line 267
    .line 268
    .line 269
    const v18, -0x421eb852    # -0.11f

    .line 270
    .line 271
    .line 272
    const v13, 0x3edc28f6    # 0.43f

    .line 273
    .line 274
    .line 275
    const v14, 0x3edc28f6    # 0.43f

    .line 276
    .line 277
    .line 278
    const v15, 0x3f95c28f    # 1.17f

    .line 279
    .line 280
    .line 281
    const v16, 0x3ecccccd    # 0.4f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    const/high16 v17, 0x41900000    # 18.0f

    .line 288
    .line 289
    const/high16 v18, 0x41500000    # 13.0f

    .line 290
    .line 291
    const v13, 0x418cf5c3    # 17.62f

    .line 292
    .line 293
    .line 294
    const v14, 0x41766666    # 15.4f

    .line 295
    .line 296
    .line 297
    const/high16 v15, 0x41900000    # 18.0f

    .line 298
    .line 299
    const/high16 v16, 0x41640000    # 14.25f

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, 0x412a8f5c    # 10.66f

    .line 305
    .line 306
    .line 307
    const v18, 0x40e47ae1    # 7.14f

    .line 308
    .line 309
    .line 310
    const/high16 v13, 0x41900000    # 18.0f

    .line 311
    .line 312
    const/high16 v14, 0x41140000    # 9.25f

    .line 313
    .line 314
    const v15, 0x4168cccd    # 14.55f

    .line 315
    .line 316
    .line 317
    const v16, 0x40c9999a    # 6.3f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v0, 0x41240000    # 10.25f

    .line 327
    .line 328
    const v2, 0x4049999a    # 3.15f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v17, -0x3eff851f    # -8.03f

    .line 335
    .line 336
    .line 337
    const v18, 0x40f70a3d    # 7.72f

    .line 338
    .line 339
    .line 340
    const v13, -0x3f7e6666    # -4.05f

    .line 341
    .line 342
    .line 343
    const v14, 0x3f30a3d7    # 0.69f

    .line 344
    .line 345
    .line 346
    const v15, -0x3f19eb85    # -7.19f

    .line 347
    .line 348
    .line 349
    const v16, 0x406c28f6    # 3.69f

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, 0x3ffc28f6    # 1.97f

    .line 356
    .line 357
    .line 358
    const v18, 0x4106147b    # 8.38f

    .line 359
    .line 360
    .line 361
    const v13, -0x40d70a3d    # -0.66f

    .line 362
    .line 363
    .line 364
    const v14, 0x404ae148    # 3.17f

    .line 365
    .line 366
    .line 367
    const v15, 0x3e4ccccd    # 0.2f

    .line 368
    .line 369
    .line 370
    const v16, 0x40c51eb8    # 6.16f

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const v17, 0x3fbeb852    # 1.49f

    .line 377
    .line 378
    .line 379
    const v18, 0x3d8f5c29    # 0.07f

    .line 380
    .line 381
    .line 382
    const v13, 0x3ebd70a4    # 0.37f

    .line 383
    .line 384
    .line 385
    const v14, 0x3eeb851f    # 0.46f

    .line 386
    .line 387
    .line 388
    const v15, 0x3f88f5c3    # 1.07f

    .line 389
    .line 390
    .line 391
    const v16, 0x3efae148    # 0.49f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/4 v0, 0x0

    .line 398
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, 0x3d8f5c29    # 0.07f

    .line 402
    .line 403
    .line 404
    const v18, -0x40570a3d    # -1.32f

    .line 405
    .line 406
    .line 407
    const v13, 0x3eb851ec    # 0.36f

    .line 408
    .line 409
    .line 410
    const v14, -0x4147ae14    # -0.36f

    .line 411
    .line 412
    .line 413
    const v15, 0x3ec7ae14    # 0.39f

    .line 414
    .line 415
    .line 416
    const v16, -0x4091eb85    # -0.93f

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v17, -0x402b851f    # -1.66f

    .line 423
    .line 424
    .line 425
    const v18, -0x3f370a3d    # -6.28f

    .line 426
    .line 427
    .line 428
    const v13, -0x40547ae1    # -1.34f

    .line 429
    .line 430
    .line 431
    const v14, -0x402a3d71    # -1.67f

    .line 432
    .line 433
    .line 434
    const v15, -0x3ffe147b    # -2.03f

    .line 435
    .line 436
    .line 437
    const v16, -0x3f866666    # -3.9f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, 0x40dd70a4    # 6.92f

    .line 444
    .line 445
    .line 446
    const v18, -0x3f2b3333    # -6.65f

    .line 447
    .line 448
    .line 449
    const v13, 0x3f0ccccd    # 0.55f

    .line 450
    .line 451
    .line 452
    const v14, -0x3fa1eb85    # -3.47f

    .line 453
    .line 454
    .line 455
    const v15, 0x405ae148    # 3.42f

    .line 456
    .line 457
    .line 458
    const v16, -0x3f3851ec    # -6.24f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const v17, 0x40ddc28f    # 6.93f

    .line 465
    .line 466
    .line 467
    const v18, 0x4025c28f    # 2.59f

    .line 468
    .line 469
    .line 470
    const v13, 0x4030a3d7    # 2.76f

    .line 471
    .line 472
    .line 473
    const v14, -0x41570a3d    # -0.33f

    .line 474
    .line 475
    .line 476
    const v15, 0x40a8a3d7    # 5.27f

    .line 477
    .line 478
    .line 479
    const v16, 0x3f3d70a4    # 0.74f

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, 0x4195999a    # 18.7f

    .line 486
    .line 487
    .line 488
    const/high16 v18, 0x41000000    # 8.0f

    .line 489
    .line 490
    const v13, 0x41911eb8    # 18.14f

    .line 491
    .line 492
    .line 493
    const v14, 0x40fbd70a    # 7.87f

    .line 494
    .line 495
    .line 496
    const v15, 0x419347ae    # 18.41f

    .line 497
    .line 498
    .line 499
    const/high16 v16, 0x41000000    # 8.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, 0x3f451eb8    # 0.77f

    .line 508
    .line 509
    .line 510
    const v18, -0x402ccccd    # -1.65f

    .line 511
    .line 512
    .line 513
    const v13, 0x3f59999a    # 0.85f

    .line 514
    .line 515
    .line 516
    const/4 v14, 0x0

    .line 517
    const v15, 0x3fab851f    # 1.34f

    .line 518
    .line 519
    .line 520
    const v16, -0x407eb852    # -1.01f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v17, 0x41240000    # 10.25f

    .line 527
    .line 528
    const v18, 0x4049999a    # 3.15f

    .line 529
    .line 530
    .line 531
    const v13, 0x418a3d71    # 17.28f

    .line 532
    .line 533
    .line 534
    const v14, 0x4079999a    # 3.9f

    .line 535
    .line 536
    .line 537
    const v15, 0x415e8f5c    # 13.91f

    .line 538
    .line 539
    .line 540
    const v16, 0x4021eb85    # 2.53f

    .line 541
    .line 542
    .line 543
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const/high16 v0, 0x41400000    # 12.0f

    .line 550
    .line 551
    const/high16 v2, 0x41300000    # 11.0f

    .line 552
    .line 553
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v17, -0x40000000    # -2.0f

    .line 557
    .line 558
    const/high16 v18, 0x40000000    # 2.0f

    .line 559
    .line 560
    const v13, -0x40733333    # -1.1f

    .line 561
    .line 562
    .line 563
    const/4 v14, 0x0

    .line 564
    const/high16 v15, -0x40000000    # -2.0f

    .line 565
    .line 566
    const v16, 0x3f666666    # 0.9f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v17, 0x3f170a3d    # 0.59f

    .line 573
    .line 574
    .line 575
    const v18, 0x3fb47ae1    # 1.41f

    .line 576
    .line 577
    .line 578
    const/4 v13, 0x0

    .line 579
    const v14, 0x3f0ccccd    # 0.55f

    .line 580
    .line 581
    .line 582
    const v15, 0x3e6b851f    # 0.23f

    .line 583
    .line 584
    .line 585
    const v16, 0x3f866666    # 1.05f

    .line 586
    .line 587
    .line 588
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/high16 v17, 0x41400000    # 12.0f

    .line 592
    .line 593
    const/high16 v18, 0x41700000    # 15.0f

    .line 594
    .line 595
    const v13, 0x412f3333    # 10.95f

    .line 596
    .line 597
    .line 598
    const v14, 0x416c51ec    # 14.77f

    .line 599
    .line 600
    .line 601
    const v15, 0x41373333    # 11.45f

    .line 602
    .line 603
    .line 604
    const/high16 v16, 0x41700000    # 15.0f

    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, 0x3fb47ae1    # 1.41f

    .line 610
    .line 611
    .line 612
    const v2, -0x40e8f5c3    # -0.59f

    .line 613
    .line 614
    .line 615
    const v4, 0x3f866666    # 1.05f

    .line 616
    .line 617
    .line 618
    const v6, -0x41947ae1    # -0.23f

    .line 619
    .line 620
    .line 621
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, 0x41600000    # 14.0f

    .line 625
    .line 626
    const/high16 v18, 0x41500000    # 13.0f

    .line 627
    .line 628
    const v13, 0x415c51ec    # 13.77f

    .line 629
    .line 630
    .line 631
    const v14, 0x4160cccd    # 14.05f

    .line 632
    .line 633
    .line 634
    const/high16 v15, 0x41600000    # 14.0f

    .line 635
    .line 636
    const v16, 0x4158cccd    # 13.55f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v17, 0x41400000    # 12.0f

    .line 643
    .line 644
    const/high16 v18, 0x41300000    # 11.0f

    .line 645
    .line 646
    const/high16 v13, 0x41600000    # 14.0f

    .line 647
    .line 648
    const v14, 0x413e6666    # 11.9f

    .line 649
    .line 650
    .line 651
    const v15, 0x4151999a    # 13.1f

    .line 652
    .line 653
    .line 654
    const/high16 v16, 0x41300000    # 11.0f

    .line 655
    .line 656
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, 0x41200000    # 10.0f

    .line 663
    .line 664
    const/high16 v2, 0x41a80000    # 21.0f

    .line 665
    .line 666
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v17, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/high16 v18, 0x3f800000    # 1.0f

    .line 675
    .line 676
    const v13, 0x3f0ccccd    # 0.55f

    .line 677
    .line 678
    .line 679
    const/4 v14, 0x0

    .line 680
    const/high16 v15, 0x3f800000    # 1.0f

    .line 681
    .line 682
    const v16, 0x3ee66666    # 0.45f

    .line 683
    .line 684
    .line 685
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v0, 0x40800000    # 4.0f

    .line 689
    .line 690
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v17, -0x40800000    # -1.0f

    .line 694
    .line 695
    const/4 v13, 0x0

    .line 696
    const v14, 0x3f0ccccd    # 0.55f

    .line 697
    .line 698
    .line 699
    const v15, -0x4119999a    # -0.45f

    .line 700
    .line 701
    .line 702
    const/high16 v16, 0x3f800000    # 1.0f

    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/4 v0, 0x0

    .line 708
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 709
    .line 710
    .line 711
    const/high16 v18, -0x40800000    # -1.0f

    .line 712
    .line 713
    const v13, -0x40f33333    # -0.55f

    .line 714
    .line 715
    .line 716
    const/4 v14, 0x0

    .line 717
    const/high16 v15, -0x40800000    # -1.0f

    .line 718
    .line 719
    const v16, -0x4119999a    # -0.45f

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    const/high16 v0, -0x3f800000    # -4.0f

    .line 726
    .line 727
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v17, 0x41a80000    # 21.0f

    .line 731
    .line 732
    const/high16 v18, 0x41200000    # 10.0f

    .line 733
    .line 734
    const/high16 v13, 0x41a00000    # 20.0f

    .line 735
    .line 736
    const v14, 0x41273333    # 10.45f

    .line 737
    .line 738
    .line 739
    const v15, 0x41a3999a    # 20.45f

    .line 740
    .line 741
    .line 742
    const/high16 v16, 0x41200000    # 10.0f

    .line 743
    .line 744
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v0, 0x41900000    # 18.0f

    .line 751
    .line 752
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const/high16 v17, 0x3f800000    # 1.0f

    .line 759
    .line 760
    const/high16 v18, 0x3f800000    # 1.0f

    .line 761
    .line 762
    const v13, 0x3f0ccccd    # 0.55f

    .line 763
    .line 764
    .line 765
    const/4 v14, 0x0

    .line 766
    const/high16 v15, 0x3f800000    # 1.0f

    .line 767
    .line 768
    const v16, 0x3ee66666    # 0.45f

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    const/4 v0, 0x0

    .line 775
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const/high16 v17, -0x40800000    # -1.0f

    .line 779
    .line 780
    const/4 v13, 0x0

    .line 781
    const v14, 0x3f0ccccd    # 0.55f

    .line 782
    .line 783
    .line 784
    const v15, -0x4119999a    # -0.45f

    .line 785
    .line 786
    .line 787
    const/high16 v16, 0x3f800000    # 1.0f

    .line 788
    .line 789
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const/high16 v18, -0x40800000    # -1.0f

    .line 796
    .line 797
    const v13, -0x40f33333    # -0.55f

    .line 798
    .line 799
    .line 800
    const/4 v14, 0x0

    .line 801
    const/high16 v15, -0x40800000    # -1.0f

    .line 802
    .line 803
    const v16, -0x4119999a    # -0.45f

    .line 804
    .line 805
    .line 806
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    const/high16 v17, 0x41a80000    # 21.0f

    .line 813
    .line 814
    const/high16 v18, 0x41900000    # 18.0f

    .line 815
    .line 816
    const/high16 v13, 0x41a00000    # 20.0f

    .line 817
    .line 818
    const v14, 0x4193999a    # 18.45f

    .line 819
    .line 820
    .line 821
    const v15, 0x41a3999a    # 20.45f

    .line 822
    .line 823
    .line 824
    const/high16 v16, 0x41900000    # 18.0f

    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 833
    .line 834
    .line 835
    move-result-object v2

    .line 836
    const/16 v16, 0x3800

    .line 837
    .line 838
    const/16 v17, 0x0

    .line 839
    .line 840
    const/high16 v6, 0x3f800000    # 1.0f

    .line 841
    .line 842
    const/high16 v8, 0x3f800000    # 1.0f

    .line 843
    .line 844
    const/4 v7, 0x0

    .line 845
    const/high16 v9, 0x3f800000    # 1.0f

    .line 846
    .line 847
    const/high16 v12, 0x3f800000    # 1.0f

    .line 848
    .line 849
    const/4 v13, 0x0

    .line 850
    const/4 v14, 0x0

    .line 851
    const/4 v15, 0x0

    .line 852
    const-string v4, ""

    .line 853
    .line 854
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    sput-object v0, Landroidx/compose/material/icons/rounded/WifiTetheringErrorRoundedKt;->_wifiTetheringErrorRounded:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 863
    .line 864
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    return-object v0
.end method

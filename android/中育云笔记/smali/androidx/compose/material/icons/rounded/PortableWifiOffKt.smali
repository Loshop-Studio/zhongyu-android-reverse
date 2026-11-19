.class public final Landroidx/compose/material/icons/rounded/PortableWifiOffKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _portableWifiOff:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPortableWifiOff(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PortableWifiOffKt;->_portableWifiOff:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.PortableWifiOff"

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
    const v0, 0x402d70a4    # 2.71f

    .line 71
    .line 72
    .line 73
    const v2, 0x40447ae1    # 3.07f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, 0x3fb47ae1    # 1.41f

    .line 82
    .line 83
    .line 84
    const v13, -0x413851ec    # -0.39f

    .line 85
    .line 86
    .line 87
    const v14, 0x3ec7ae14    # 0.39f

    .line 88
    .line 89
    .line 90
    const v15, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v16, 0x3f828f5c    # 1.02f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v0, 0x40833333    # 4.1f

    .line 100
    .line 101
    .line 102
    const v2, 0x40bbd70a    # 5.87f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v17, 0x40000000    # 2.0f

    .line 109
    .line 110
    const/high16 v18, 0x41400000    # 12.0f

    .line 111
    .line 112
    const v13, 0x40328f5c    # 2.79f

    .line 113
    .line 114
    .line 115
    const v14, 0x40f23d71    # 7.57f

    .line 116
    .line 117
    .line 118
    const/high16 v15, 0x40000000    # 2.0f

    .line 119
    .line 120
    const v16, 0x411b0a3d    # 9.69f

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x4081eb85    # 4.06f

    .line 127
    .line 128
    .line 129
    const v18, 0x4100a3d7    # 8.04f

    .line 130
    .line 131
    .line 132
    const/4 v13, 0x0

    .line 133
    const v14, 0x40533333    # 3.3f

    .line 134
    .line 135
    .line 136
    const v15, 0x3fcccccd    # 1.6f

    .line 137
    .line 138
    .line 139
    const v16, 0x40c70a3d    # 6.22f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, 0x3fbae148    # 1.46f

    .line 146
    .line 147
    .line 148
    const v18, -0x416147ae    # -0.31f

    .line 149
    .line 150
    .line 151
    const v13, 0x3ef5c28f    # 0.48f

    .line 152
    .line 153
    .line 154
    const v14, 0x3eb33333    # 0.35f

    .line 155
    .line 156
    .line 157
    const v15, 0x3f947ae1    # 1.16f

    .line 158
    .line 159
    .line 160
    const v16, 0x3e570a3d    # 0.21f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, -0x417ae148    # -0.26f

    .line 167
    .line 168
    .line 169
    const v18, -0x405ae148    # -1.29f

    .line 170
    .line 171
    .line 172
    const/high16 v13, 0x3e800000    # 0.25f

    .line 173
    .line 174
    const v14, -0x4123d70a    # -0.43f

    .line 175
    .line 176
    .line 177
    const v15, 0x3e0f5c29    # 0.14f

    .line 178
    .line 179
    .line 180
    const v16, -0x40828f5c    # -0.99f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v17, 0x40800000    # 4.0f

    .line 187
    .line 188
    const/high16 v18, 0x41400000    # 12.0f

    .line 189
    .line 190
    const v13, 0x40a947ae    # 5.29f

    .line 191
    .line 192
    .line 193
    const v14, 0x4187d70a    # 16.98f

    .line 194
    .line 195
    .line 196
    const/high16 v15, 0x40800000    # 4.0f

    .line 197
    .line 198
    const v16, 0x416a6666    # 14.65f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v17, 0x3fc3d70a    # 1.53f

    .line 205
    .line 206
    .line 207
    const v18, -0x3f69eb85    # -4.69f

    .line 208
    .line 209
    .line 210
    const/4 v13, 0x0

    .line 211
    const v14, -0x401eb852    # -1.76f

    .line 212
    .line 213
    .line 214
    const v15, 0x3f11eb85    # 0.57f

    .line 215
    .line 216
    .line 217
    const v16, -0x3fa7ae14    # -3.38f

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x3fb70a3d    # 1.43f

    .line 224
    .line 225
    .line 226
    const v2, 0x3fb851ec    # 1.44f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v17, 0x40c00000    # 6.0f

    .line 233
    .line 234
    const/high16 v18, 0x41400000    # 12.0f

    .line 235
    .line 236
    const v13, 0x40cb851f    # 6.36f

    .line 237
    .line 238
    .line 239
    const v14, 0x411ae148    # 9.68f

    .line 240
    .line 241
    .line 242
    const/high16 v15, 0x40c00000    # 6.0f

    .line 243
    .line 244
    const v16, 0x412ccccd    # 10.8f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v17, 0x4003d70a    # 2.06f

    .line 251
    .line 252
    .line 253
    const v18, 0x409051ec    # 4.51f

    .line 254
    .line 255
    .line 256
    const/4 v13, 0x0

    .line 257
    const v14, 0x3fe66666    # 1.8f

    .line 258
    .line 259
    .line 260
    const v15, 0x3f4ccccd    # 0.8f

    .line 261
    .line 262
    .line 263
    const v16, 0x405a3d71    # 3.41f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 270
    .line 271
    const v18, -0x4170a3d7    # -0.28f

    .line 272
    .line 273
    .line 274
    const v13, 0x3eeb851f    # 0.46f

    .line 275
    .line 276
    .line 277
    const v14, 0x3ecccccd    # 0.4f

    .line 278
    .line 279
    .line 280
    const v15, 0x3f9851ec    # 1.19f

    .line 281
    .line 282
    .line 283
    const/high16 v16, 0x3e800000    # 0.25f

    .line 284
    .line 285
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, 0x3c23d70a    # 0.01f

    .line 289
    .line 290
    .line 291
    const v2, -0x43dc28f6    # -0.01f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, -0x41947ae1    # -0.23f

    .line 298
    .line 299
    .line 300
    const v18, -0x405eb852    # -1.26f

    .line 301
    .line 302
    .line 303
    const v13, 0x3e75c28f    # 0.24f

    .line 304
    .line 305
    .line 306
    const v14, -0x4128f5c3    # -0.42f

    .line 307
    .line 308
    .line 309
    const v15, 0x3e051eb8    # 0.13f

    .line 310
    .line 311
    .line 312
    const v16, -0x408f5c29    # -0.94f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v17, 0x41000000    # 8.0f

    .line 319
    .line 320
    const/high16 v18, 0x41400000    # 12.0f

    .line 321
    .line 322
    const v13, 0x410851ec    # 8.52f

    .line 323
    .line 324
    .line 325
    const v14, 0x4163ae14    # 14.23f

    .line 326
    .line 327
    .line 328
    const/high16 v15, 0x41000000    # 8.0f

    .line 329
    .line 330
    const v16, 0x4152e148    # 13.18f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const v17, 0x3ee147ae    # 0.44f

    .line 337
    .line 338
    .line 339
    const v18, -0x401ae148    # -1.79f

    .line 340
    .line 341
    .line 342
    const/4 v13, 0x0

    .line 343
    const v14, -0x40d9999a    # -0.65f

    .line 344
    .line 345
    .line 346
    const v15, 0x3e2e147b    # 0.17f

    .line 347
    .line 348
    .line 349
    const/high16 v16, -0x40600000    # -1.25f

    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v0, 0x3fca3d71    # 1.58f

    .line 355
    .line 356
    .line 357
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v0, 0x41200000    # 10.0f

    .line 361
    .line 362
    const/high16 v2, 0x41400000    # 12.0f

    .line 363
    .line 364
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const/high16 v17, 0x40000000    # 2.0f

    .line 368
    .line 369
    const/high16 v18, 0x40000000    # 2.0f

    .line 370
    .line 371
    const v14, 0x3f8ccccd    # 1.1f

    .line 372
    .line 373
    .line 374
    const v15, 0x3f666666    # 0.9f

    .line 375
    .line 376
    .line 377
    const/high16 v16, 0x40000000    # 2.0f

    .line 378
    .line 379
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v0, 0x3e570a3d    # 0.21f

    .line 383
    .line 384
    .line 385
    const v2, -0x435c28f6    # -0.02f

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x40d9eb85    # 6.81f

    .line 392
    .line 393
    .line 394
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, 0x3fb47ae1    # 1.41f

    .line 398
    .line 399
    .line 400
    const/16 v18, 0x0

    .line 401
    .line 402
    const v13, 0x3ec7ae14    # 0.39f

    .line 403
    .line 404
    .line 405
    const v14, 0x3ec7ae14    # 0.39f

    .line 406
    .line 407
    .line 408
    const v15, 0x3f828f5c    # 1.02f

    .line 409
    .line 410
    .line 411
    const v16, 0x3ec7ae14    # 0.39f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/16 v17, 0x0

    .line 418
    .line 419
    const v18, -0x404b851f    # -1.41f

    .line 420
    .line 421
    .line 422
    const v14, -0x413851ec    # -0.39f

    .line 423
    .line 424
    .line 425
    const v15, 0x3ec7ae14    # 0.39f

    .line 426
    .line 427
    .line 428
    const v16, -0x407d70a4    # -1.02f

    .line 429
    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x408428f6    # 4.13f

    .line 435
    .line 436
    .line 437
    const v2, 0x40447ae1    # 3.07f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v17, -0x404a3d71    # -1.42f

    .line 444
    .line 445
    .line 446
    const/16 v18, 0x0

    .line 447
    .line 448
    const v13, -0x413851ec    # -0.39f

    .line 449
    .line 450
    .line 451
    const v15, -0x407c28f6    # -1.03f

    .line 452
    .line 453
    .line 454
    const v16, -0x413851ec    # -0.39f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v0, 0x418dae14    # 17.71f

    .line 464
    .line 465
    .line 466
    const v2, 0x415d1eb8    # 13.82f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x3e947ae1    # 0.29f

    .line 473
    .line 474
    .line 475
    const v18, -0x40170a3d    # -1.82f

    .line 476
    .line 477
    .line 478
    const v13, 0x3e3851ec    # 0.18f

    .line 479
    .line 480
    .line 481
    const v14, -0x40ee147b    # -0.57f

    .line 482
    .line 483
    .line 484
    const v15, 0x3e947ae1    # 0.29f

    .line 485
    .line 486
    .line 487
    const v16, -0x4067ae14    # -1.19f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v17, -0x3f400000    # -6.0f

    .line 494
    .line 495
    const/high16 v18, -0x3f400000    # -6.0f

    .line 496
    .line 497
    const/4 v13, 0x0

    .line 498
    const v14, -0x3fac28f6    # -3.31f

    .line 499
    .line 500
    .line 501
    const v15, -0x3fd3d70a    # -2.69f

    .line 502
    .line 503
    .line 504
    const/high16 v16, -0x3f400000    # -6.0f

    .line 505
    .line 506
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v17, -0x40170a3d    # -1.82f

    .line 510
    .line 511
    .line 512
    const v18, 0x3e947ae1    # 0.29f

    .line 513
    .line 514
    .line 515
    const v13, -0x40deb852    # -0.63f

    .line 516
    .line 517
    .line 518
    const/4 v14, 0x0

    .line 519
    const/high16 v15, -0x40600000    # -1.25f

    .line 520
    .line 521
    const v16, 0x3de147ae    # 0.11f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x3fdc28f6    # 1.72f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const v17, 0x3dcccccd    # 0.1f

    .line 534
    .line 535
    .line 536
    const v18, -0x43dc28f6    # -0.01f

    .line 537
    .line 538
    .line 539
    const v13, 0x3cf5c28f    # 0.03f

    .line 540
    .line 541
    .line 542
    const v15, 0x3d75c28f    # 0.06f

    .line 543
    .line 544
    .line 545
    const v16, -0x43dc28f6    # -0.01f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v17, 0x40800000    # 4.0f

    .line 552
    .line 553
    const/high16 v18, 0x40800000    # 4.0f

    .line 554
    .line 555
    const v13, 0x400d70a4    # 2.21f

    .line 556
    .line 557
    .line 558
    const/high16 v15, 0x40800000    # 4.0f

    .line 559
    .line 560
    const v16, 0x3fe51eb8    # 1.79f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v17, -0x43dc28f6    # -0.01f

    .line 567
    .line 568
    .line 569
    const v18, 0x3de147ae    # 0.11f

    .line 570
    .line 571
    .line 572
    const/4 v13, 0x0

    .line 573
    const v14, 0x3d23d70a    # 0.04f

    .line 574
    .line 575
    .line 576
    const v15, -0x43dc28f6    # -0.01f

    .line 577
    .line 578
    .line 579
    const v16, 0x3d8f5c29    # 0.07f

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const v0, 0x3fdae148    # 1.71f

    .line 586
    .line 587
    .line 588
    const v2, 0x3fdc28f6    # 1.72f

    .line 589
    .line 590
    .line 591
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v0, 0x40800000    # 4.0f

    .line 598
    .line 599
    const/high16 v2, 0x41400000    # 12.0f

    .line 600
    .line 601
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v17, 0x41000000    # 8.0f

    .line 605
    .line 606
    const/high16 v18, 0x41000000    # 8.0f

    .line 607
    .line 608
    const v13, 0x408d70a4    # 4.42f

    .line 609
    .line 610
    .line 611
    const/4 v14, 0x0

    .line 612
    const/high16 v15, 0x41000000    # 8.0f

    .line 613
    .line 614
    const v16, 0x40651eb8    # 3.58f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const v17, -0x40bae148    # -0.77f

    .line 621
    .line 622
    .line 623
    const v18, 0x40566666    # 3.35f

    .line 624
    .line 625
    .line 626
    const/4 v13, 0x0

    .line 627
    const v14, 0x3f99999a    # 1.2f

    .line 628
    .line 629
    .line 630
    const v15, -0x416b851f    # -0.29f

    .line 631
    .line 632
    .line 633
    const v16, 0x40147ae1    # 2.32f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const v0, 0x3fbeb852    # 1.49f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const/high16 v17, 0x41b00000    # 22.0f

    .line 646
    .line 647
    const/high16 v18, 0x41400000    # 12.0f

    .line 648
    .line 649
    const v13, 0x41ac3d71    # 21.53f

    .line 650
    .line 651
    .line 652
    const v14, 0x41766666    # 15.4f

    .line 653
    .line 654
    .line 655
    const/high16 v15, 0x41b00000    # 22.0f

    .line 656
    .line 657
    const v16, 0x415c28f6    # 13.76f

    .line 658
    .line 659
    .line 660
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 661
    .line 662
    .line 663
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 664
    .line 665
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 666
    .line 667
    const/4 v13, 0x0

    .line 668
    const v14, -0x3f4f5c29    # -5.52f

    .line 669
    .line 670
    .line 671
    const v15, -0x3f70a3d7    # -4.48f

    .line 672
    .line 673
    .line 674
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 675
    .line 676
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const v17, -0x3f651eb8    # -4.84f

    .line 680
    .line 681
    .line 682
    const v18, 0x3fa3d70a    # 1.28f

    .line 683
    .line 684
    .line 685
    const v13, -0x401eb852    # -1.76f

    .line 686
    .line 687
    .line 688
    const/4 v14, 0x0

    .line 689
    const v15, -0x3fa66666    # -3.4f

    .line 690
    .line 691
    .line 692
    const v16, 0x3ef5c28f    # 0.48f

    .line 693
    .line 694
    .line 695
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const v0, 0x3fbd70a4    # 1.48f

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    const/high16 v17, 0x41400000    # 12.0f

    .line 705
    .line 706
    const/high16 v18, 0x40800000    # 4.0f

    .line 707
    .line 708
    const v13, 0x411a8f5c    # 9.66f

    .line 709
    .line 710
    .line 711
    const v14, 0x4088f5c3    # 4.28f

    .line 712
    .line 713
    .line 714
    const v15, 0x412ccccd    # 10.8f

    .line 715
    .line 716
    .line 717
    const/high16 v16, 0x40800000    # 4.0f

    .line 718
    .line 719
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    const/16 v16, 0x3800

    .line 730
    .line 731
    const/16 v17, 0x0

    .line 732
    .line 733
    const/high16 v6, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/high16 v8, 0x3f800000    # 1.0f

    .line 736
    .line 737
    const/4 v7, 0x0

    .line 738
    const/high16 v9, 0x3f800000    # 1.0f

    .line 739
    .line 740
    const/high16 v12, 0x3f800000    # 1.0f

    .line 741
    .line 742
    const/4 v13, 0x0

    .line 743
    const/4 v14, 0x0

    .line 744
    const/4 v15, 0x0

    .line 745
    const-string v4, ""

    .line 746
    .line 747
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    sput-object v0, Landroidx/compose/material/icons/rounded/PortableWifiOffKt;->_portableWifiOff:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 756
    .line 757
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    return-object v0
.end method

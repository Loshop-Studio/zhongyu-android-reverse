.class public final Landroidx/compose/material/icons/automirrored/rounded/RotateLeftKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rotateLeft:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRotateLeft(Landroidx/compose/material/icons/Icons$AutoMirrored$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/automirrored/rounded/RotateLeftKt;->_rotateLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const/4 v10, 0x1

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
    const-string v2, "AutoMirrored.Rounded.RotateLeft"

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
    const v0, 0x40d1eb85    # 6.56f

    .line 71
    .line 72
    .line 73
    const v2, 0x40ff5c29    # 7.98f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x40a00000    # 5.0f

    .line 80
    .line 81
    const v18, 0x4102b852    # 8.17f

    .line 82
    .line 83
    .line 84
    const v13, 0x40c33333    # 6.1f

    .line 85
    .line 86
    .line 87
    const v14, 0x40f0a3d7    # 7.52f

    .line 88
    .line 89
    .line 90
    const v15, 0x40a9eb85    # 5.31f

    .line 91
    .line 92
    .line 93
    const v16, 0x40f33333    # 7.6f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v17, -0x40d47ae1    # -0.67f

    .line 100
    .line 101
    .line 102
    const v18, 0x3fca3d71    # 1.58f

    .line 103
    .line 104
    .line 105
    const v13, -0x4170a3d7    # -0.28f

    .line 106
    .line 107
    .line 108
    const v14, 0x3f028f5c    # 0.51f

    .line 109
    .line 110
    .line 111
    const/high16 v15, -0x41000000    # -0.5f

    .line 112
    .line 113
    const v16, 0x3f83d70a    # 1.03f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, 0x3f75c28f    # 0.96f

    .line 120
    .line 121
    .line 122
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 123
    .line 124
    const v13, -0x41bd70a4    # -0.19f

    .line 125
    .line 126
    .line 127
    const v14, 0x3f2147ae    # 0.63f

    .line 128
    .line 129
    .line 130
    const v15, 0x3e9eb852    # 0.31f

    .line 131
    .line 132
    .line 133
    const/high16 v16, 0x3fa00000    # 1.25f

    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v0, 0x3c23d70a    # 0.01f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, 0x3f70a3d7    # 0.94f

    .line 145
    .line 146
    .line 147
    const v18, -0x40cccccd    # -0.7f

    .line 148
    .line 149
    .line 150
    const v13, 0x3edc28f6    # 0.43f

    .line 151
    .line 152
    .line 153
    const/4 v14, 0x0

    .line 154
    const v15, 0x3f51eb85    # 0.82f

    .line 155
    .line 156
    .line 157
    const v16, -0x4170a3d7    # -0.28f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, 0x3ef5c28f    # 0.48f

    .line 164
    .line 165
    .line 166
    const v18, -0x406a3d71    # -1.17f

    .line 167
    .line 168
    .line 169
    const v13, 0x3df5c28f    # 0.12f

    .line 170
    .line 171
    .line 172
    const v14, -0x41333333    # -0.4f

    .line 173
    .line 174
    .line 175
    const v15, 0x3e8f5c29    # 0.28f

    .line 176
    .line 177
    .line 178
    const v16, -0x40b5c28f    # -0.79f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, -0x41dc28f6    # -0.16f

    .line 185
    .line 186
    .line 187
    const v18, -0x406ccccd    # -1.15f

    .line 188
    .line 189
    .line 190
    const v13, 0x3e6147ae    # 0.22f

    .line 191
    .line 192
    .line 193
    const v14, -0x41428f5c    # -0.37f

    .line 194
    .line 195
    .line 196
    const v15, 0x3e19999a    # 0.15f

    .line 197
    .line 198
    .line 199
    const v16, -0x40a8f5c3    # -0.84f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v0, 0x40a9eb85    # 5.31f

    .line 209
    .line 210
    .line 211
    const/high16 v2, 0x41500000    # 13.0f

    .line 212
    .line 213
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, -0x435c28f6    # -0.02f

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v17, -0x408a3d71    # -0.96f

    .line 223
    .line 224
    .line 225
    const/high16 v18, 0x3fa00000    # 1.25f

    .line 226
    .line 227
    const v13, -0x40d9999a    # -0.65f

    .line 228
    .line 229
    .line 230
    const/4 v14, 0x0

    .line 231
    const v15, -0x406ccccd    # -1.15f

    .line 232
    .line 233
    .line 234
    const v16, 0x3f1eb852    # 0.62f

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x3f28f5c3    # 0.66f

    .line 241
    .line 242
    .line 243
    const v18, 0x3fca3d71    # 1.58f

    .line 244
    .line 245
    .line 246
    const v13, 0x3e23d70a    # 0.16f

    .line 247
    .line 248
    .line 249
    const v14, 0x3f0a3d71    # 0.54f

    .line 250
    .line 251
    .line 252
    const v15, 0x3ec28f5c    # 0.38f

    .line 253
    .line 254
    .line 255
    const v16, 0x3f88f5c3    # 1.07f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, 0x3fc8f5c3    # 1.57f

    .line 262
    .line 263
    .line 264
    const v18, 0x3e4ccccd    # 0.2f

    .line 265
    .line 266
    .line 267
    const v13, 0x3e9eb852    # 0.31f

    .line 268
    .line 269
    .line 270
    const v14, 0x3f11eb85    # 0.57f

    .line 271
    .line 272
    .line 273
    const v15, 0x3f8e147b    # 1.11f

    .line 274
    .line 275
    .line 276
    const v16, 0x3f28f5c3    # 0.66f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, 0x3e2e147b    # 0.17f

    .line 283
    .line 284
    .line 285
    const v18, -0x406ccccd    # -1.15f

    .line 286
    .line 287
    .line 288
    const v13, 0x3e99999a    # 0.3f

    .line 289
    .line 290
    .line 291
    const v14, -0x416147ae    # -0.31f

    .line 292
    .line 293
    .line 294
    const v15, 0x3ec28f5c    # 0.38f

    .line 295
    .line 296
    .line 297
    const v16, -0x40bae148    # -0.77f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const v17, -0x410a3d71    # -0.48f

    .line 304
    .line 305
    .line 306
    const v18, -0x406b851f    # -1.16f

    .line 307
    .line 308
    .line 309
    const v13, -0x41b33333    # -0.2f

    .line 310
    .line 311
    .line 312
    const v14, -0x41428f5c    # -0.37f

    .line 313
    .line 314
    .line 315
    const v15, -0x4147ae14    # -0.36f

    .line 316
    .line 317
    .line 318
    const v16, -0x40bd70a4    # -0.76f

    .line 319
    .line 320
    .line 321
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v17, -0x408f5c29    # -0.94f

    .line 325
    .line 326
    .line 327
    const v18, -0x40c7ae14    # -0.72f

    .line 328
    .line 329
    .line 330
    const v13, -0x420a3d71    # -0.12f

    .line 331
    .line 332
    .line 333
    const v14, -0x411eb852    # -0.44f

    .line 334
    .line 335
    .line 336
    const v15, -0x40fd70a4    # -0.51f

    .line 337
    .line 338
    .line 339
    const v16, -0x40c7ae14    # -0.72f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, 0x41028f5c    # 8.16f

    .line 349
    .line 350
    .line 351
    const v2, 0x419828f6    # 19.02f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x3fcb851f    # 1.59f

    .line 358
    .line 359
    .line 360
    const v18, 0x3f28f5c3    # 0.66f

    .line 361
    .line 362
    .line 363
    const v13, 0x3f028f5c    # 0.51f

    .line 364
    .line 365
    .line 366
    const v14, 0x3e8f5c29    # 0.28f

    .line 367
    .line 368
    .line 369
    const v15, 0x3f851eb8    # 1.04f

    .line 370
    .line 371
    .line 372
    const/high16 v16, 0x3f000000    # 0.5f

    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, 0x3f9eb852    # 1.24f

    .line 378
    .line 379
    .line 380
    const v18, -0x408a3d71    # -0.96f

    .line 381
    .line 382
    .line 383
    const v13, 0x3f1eb852    # 0.62f

    .line 384
    .line 385
    .line 386
    const v14, 0x3e3851ec    # 0.18f

    .line 387
    .line 388
    .line 389
    const v15, 0x3f9eb852    # 1.24f

    .line 390
    .line 391
    .line 392
    const v16, -0x415c28f6    # -0.32f

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    const v0, -0x430a3d71    # -0.03f

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v17, -0x40cccccd    # -0.7f

    .line 405
    .line 406
    .line 407
    const v18, -0x408f5c29    # -0.94f

    .line 408
    .line 409
    .line 410
    const/4 v13, 0x0

    .line 411
    const v14, -0x4123d70a    # -0.43f

    .line 412
    .line 413
    .line 414
    const v15, -0x4170a3d7    # -0.28f

    .line 415
    .line 416
    .line 417
    const v16, -0x40ae147b    # -0.82f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x406ccccd    # -1.15f

    .line 424
    .line 425
    .line 426
    const v18, -0x410a3d71    # -0.48f

    .line 427
    .line 428
    .line 429
    const v13, -0x41333333    # -0.4f

    .line 430
    .line 431
    .line 432
    const v14, -0x420a3d71    # -0.12f

    .line 433
    .line 434
    .line 435
    const v15, -0x40b851ec    # -0.78f

    .line 436
    .line 437
    .line 438
    const v16, -0x4170a3d7    # -0.28f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v17, -0x406b851f    # -1.16f

    .line 445
    .line 446
    .line 447
    const v18, 0x3e2e147b    # 0.17f

    .line 448
    .line 449
    .line 450
    const v13, -0x413d70a4    # -0.38f

    .line 451
    .line 452
    .line 453
    const v14, -0x41a8f5c3    # -0.21f

    .line 454
    .line 455
    .line 456
    const v15, -0x40a3d70a    # -0.86f

    .line 457
    .line 458
    .line 459
    const v16, -0x41f0a3d7    # -0.14f

    .line 460
    .line 461
    .line 462
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v0, 0x3cf5c28f    # 0.03f

    .line 466
    .line 467
    .line 468
    const v2, -0x430a3d71    # -0.03f

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v17, 0x3e570a3d    # 0.21f

    .line 475
    .line 476
    .line 477
    const v18, 0x3fc66666    # 1.55f

    .line 478
    .line 479
    .line 480
    const v13, -0x4119999a    # -0.45f

    .line 481
    .line 482
    .line 483
    const v14, 0x3ee66666    # 0.45f

    .line 484
    .line 485
    .line 486
    const v15, -0x4147ae14    # -0.36f

    .line 487
    .line 488
    .line 489
    const v16, 0x3f9eb852    # 1.24f

    .line 490
    .line 491
    .line 492
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v0, 0x40823d71    # 4.07f

    .line 499
    .line 500
    .line 501
    const/high16 v2, 0x41500000    # 13.0f

    .line 502
    .line 503
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, -0x40d70a3d    # -0.66f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v17, -0x40251eb8    # -1.71f

    .line 513
    .line 514
    .line 515
    const v18, -0x40ca3d71    # -0.71f

    .line 516
    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const v14, -0x409c28f6    # -0.89f

    .line 520
    .line 521
    .line 522
    const v15, -0x4075c28f    # -1.08f

    .line 523
    .line 524
    .line 525
    const v16, -0x40547ae1    # -1.34f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x4112b852    # 9.17f

    .line 532
    .line 533
    .line 534
    const v2, 0x409a8f5c    # 4.83f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/16 v17, 0x0

    .line 541
    .line 542
    const v18, 0x3fb70a3d    # 1.43f

    .line 543
    .line 544
    .line 545
    const v13, -0x41333333    # -0.4f

    .line 546
    .line 547
    .line 548
    const v14, 0x3ecccccd    # 0.4f

    .line 549
    .line 550
    .line 551
    const v15, -0x41333333    # -0.4f

    .line 552
    .line 553
    .line 554
    const v16, 0x3f851eb8    # 1.04f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x400851ec    # 2.13f

    .line 561
    .line 562
    .line 563
    const v2, 0x40051eb8    # 2.08f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, 0x3fd9999a    # 1.7f

    .line 570
    .line 571
    .line 572
    const v18, -0x40c7ae14    # -0.72f

    .line 573
    .line 574
    .line 575
    const v13, 0x3f2147ae    # 0.63f

    .line 576
    .line 577
    .line 578
    const v14, 0x3f1eb852    # 0.62f

    .line 579
    .line 580
    .line 581
    const v15, 0x3fd9999a    # 1.7f

    .line 582
    .line 583
    .line 584
    const v16, 0x3e2e147b    # 0.17f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x40c2e148    # 6.09f

    .line 591
    .line 592
    .line 593
    const/high16 v2, 0x41500000    # 13.0f

    .line 594
    .line 595
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, 0x40a00000    # 5.0f

    .line 599
    .line 600
    const v18, 0x40bd1eb8    # 5.91f

    .line 601
    .line 602
    .line 603
    const v13, 0x4035c28f    # 2.84f

    .line 604
    .line 605
    .line 606
    const v14, 0x3ef5c28f    # 0.48f

    .line 607
    .line 608
    .line 609
    const/high16 v15, 0x40a00000    # 5.0f

    .line 610
    .line 611
    const v16, 0x403c28f6    # 2.94f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, -0x3f75c28f    # -4.32f

    .line 618
    .line 619
    .line 620
    const/high16 v18, 0x40b80000    # 5.75f

    .line 621
    .line 622
    const/4 v13, 0x0

    .line 623
    const v14, 0x402eb852    # 2.73f

    .line 624
    .line 625
    .line 626
    const v15, -0x40170a3d    # -1.82f

    .line 627
    .line 628
    .line 629
    const v16, 0x40a0a3d7    # 5.02f

    .line 630
    .line 631
    .line 632
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v17, -0x40d1eb85    # -0.68f

    .line 636
    .line 637
    .line 638
    const v18, 0x3f70a3d7    # 0.94f

    .line 639
    .line 640
    .line 641
    const v13, -0x412e147b    # -0.41f

    .line 642
    .line 643
    .line 644
    const v14, 0x3df5c28f    # 0.12f

    .line 645
    .line 646
    .line 647
    const v15, -0x40d1eb85    # -0.68f

    .line 648
    .line 649
    .line 650
    const v16, 0x3f028f5c    # 0.51f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, 0x3ca3d70a    # 0.02f

    .line 657
    .line 658
    .line 659
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const v17, 0x3f9d70a4    # 1.23f

    .line 663
    .line 664
    .line 665
    const v18, 0x3f75c28f    # 0.96f

    .line 666
    .line 667
    .line 668
    const/4 v13, 0x0

    .line 669
    const v14, 0x3f266666    # 0.65f

    .line 670
    .line 671
    .line 672
    const v15, 0x3f1c28f6    # 0.61f

    .line 673
    .line 674
    .line 675
    const v16, 0x3f91eb85    # 1.14f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v17, 0x41a00000    # 20.0f

    .line 682
    .line 683
    const/high16 v18, 0x41400000    # 12.0f

    .line 684
    .line 685
    const v13, 0x418c8f5c    # 17.57f

    .line 686
    .line 687
    .line 688
    const v14, 0x4195ae14    # 18.71f

    .line 689
    .line 690
    .line 691
    const/high16 v15, 0x41a00000    # 20.0f

    .line 692
    .line 693
    const v16, 0x417a3d71    # 15.64f

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    const/high16 v17, -0x3f200000    # -7.0f

    .line 700
    .line 701
    const v18, -0x3f023d71    # -7.93f

    .line 702
    .line 703
    .line 704
    const/4 v13, 0x0

    .line 705
    const v14, -0x3f7d70a4    # -4.08f

    .line 706
    .line 707
    .line 708
    const v15, -0x3fbccccd    # -3.05f

    .line 709
    .line 710
    .line 711
    const v16, -0x3f11eb85    # -7.44f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    const/16 v16, 0x3800

    .line 725
    .line 726
    const/16 v17, 0x0

    .line 727
    .line 728
    const/high16 v6, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/high16 v8, 0x3f800000    # 1.0f

    .line 731
    .line 732
    const/4 v7, 0x0

    .line 733
    const/high16 v9, 0x3f800000    # 1.0f

    .line 734
    .line 735
    const/high16 v12, 0x3f800000    # 1.0f

    .line 736
    .line 737
    const/4 v14, 0x0

    .line 738
    const/4 v15, 0x0

    .line 739
    const-string v4, ""

    .line 740
    .line 741
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    sput-object v0, Landroidx/compose/material/icons/automirrored/rounded/RotateLeftKt;->_rotateLeft:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 750
    .line 751
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    return-object v0
.end method

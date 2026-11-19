.class public final Landroidx/compose/material/icons/outlined/AppSettingsAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAppSettingsAlt(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AppSettingsAltKt;->_appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.AppSettingsAlt"

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
    const v0, 0x41ae7ae1    # 21.81f

    .line 71
    .line 72
    .line 73
    const v2, 0x414bd70a    # 12.74f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v0, -0x40ae147b    # -0.82f

    .line 80
    .line 81
    .line 82
    const v2, -0x40deb852    # -0.63f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const v18, -0x419eb852    # -0.22f

    .line 91
    .line 92
    .line 93
    const/4 v13, 0x0

    .line 94
    const v14, -0x4247ae14    # -0.09f

    .line 95
    .line 96
    .line 97
    const/4 v15, 0x0

    .line 98
    const v16, -0x41fae148    # -0.13f

    .line 99
    .line 100
    .line 101
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v0, 0x3f4ccccd    # 0.8f

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v17, 0x3dcccccd    # 0.1f

    .line 111
    .line 112
    .line 113
    const v18, -0x40fd70a4    # -0.51f

    .line 114
    .line 115
    .line 116
    const v13, 0x3e23d70a    # 0.16f

    .line 117
    .line 118
    .line 119
    const v14, -0x420a3d71    # -0.12f

    .line 120
    .line 121
    .line 122
    const v15, 0x3e4ccccd    # 0.2f

    .line 123
    .line 124
    .line 125
    const v16, -0x4151eb85    # -0.34f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, -0x40428f5c    # -1.48f

    .line 132
    .line 133
    .line 134
    const v2, -0x40a66666    # -0.85f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, -0x414ccccd    # -0.35f

    .line 141
    .line 142
    .line 143
    const v18, -0x41b33333    # -0.2f

    .line 144
    .line 145
    .line 146
    const v13, -0x4270a3d7    # -0.07f

    .line 147
    .line 148
    .line 149
    const v14, -0x41fae148    # -0.13f

    .line 150
    .line 151
    .line 152
    const v15, -0x41a8f5c3    # -0.21f

    .line 153
    .line 154
    .line 155
    const v16, -0x41b33333    # -0.2f

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v17, -0x41e66666    # -0.15f

    .line 162
    .line 163
    .line 164
    const v18, 0x3cf5c28f    # 0.03f

    .line 165
    .line 166
    .line 167
    const v13, -0x42b33333    # -0.05f

    .line 168
    .line 169
    .line 170
    const/4 v14, 0x0

    .line 171
    const v15, -0x42333333    # -0.1f

    .line 172
    .line 173
    .line 174
    const v16, 0x3c23d70a    # 0.01f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const v0, 0x3ec28f5c    # 0.38f

    .line 181
    .line 182
    .line 183
    const v2, -0x408ccccd    # -0.95f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, -0x41bd70a4    # -0.19f

    .line 190
    .line 191
    .line 192
    const v18, -0x421eb852    # -0.11f

    .line 193
    .line 194
    .line 195
    const v13, -0x425c28f6    # -0.08f

    .line 196
    .line 197
    .line 198
    const v14, -0x42b33333    # -0.05f

    .line 199
    .line 200
    .line 201
    const v15, -0x421eb852    # -0.11f

    .line 202
    .line 203
    .line 204
    const v16, -0x4270a3d7    # -0.07f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v0, -0x41e66666    # -0.15f

    .line 211
    .line 212
    .line 213
    const v2, -0x407eb852    # -1.01f

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v17, 0x4196cccd    # 18.85f

    .line 220
    .line 221
    .line 222
    const/high16 v18, 0x41000000    # 8.0f

    .line 223
    .line 224
    const v13, 0x4199c28f    # 19.22f

    .line 225
    .line 226
    .line 227
    const v14, 0x41026666    # 8.15f

    .line 228
    .line 229
    .line 230
    const v15, 0x41986666    # 19.05f

    .line 231
    .line 232
    .line 233
    const/high16 v16, 0x41000000    # 8.0f

    .line 234
    .line 235
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v0, -0x40251eb8    # -1.71f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v17, -0x41333333    # -0.4f

    .line 245
    .line 246
    .line 247
    const v18, 0x3eae147b    # 0.34f

    .line 248
    .line 249
    .line 250
    const v13, -0x41b33333    # -0.2f

    .line 251
    .line 252
    .line 253
    const/4 v14, 0x0

    .line 254
    const v15, -0x41428f5c    # -0.37f

    .line 255
    .line 256
    .line 257
    const v16, 0x3e19999a    # 0.15f

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v0, 0x4184cccd    # 16.6f

    .line 264
    .line 265
    .line 266
    const v2, 0x4115999a    # 9.35f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, -0x42333333    # -0.1f

    .line 273
    .line 274
    .line 275
    const v18, 0x3d4ccccd    # 0.05f

    .line 276
    .line 277
    .line 278
    const v13, -0x430a3d71    # -0.03f

    .line 279
    .line 280
    .line 281
    const v14, 0x3ca3d70a    # 0.02f

    .line 282
    .line 283
    .line 284
    const v15, -0x4270a3d7    # -0.07f

    .line 285
    .line 286
    .line 287
    const v16, 0x3cf5c28f    # 0.03f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v17, -0x4247ae14    # -0.09f

    .line 294
    .line 295
    .line 296
    const v18, 0x3d75c28f    # 0.06f

    .line 297
    .line 298
    .line 299
    const v15, -0x428a3d71    # -0.06f

    .line 300
    .line 301
    .line 302
    const v16, 0x3d23d70a    # 0.04f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, -0x413d70a4    # -0.38f

    .line 309
    .line 310
    .line 311
    const v2, -0x408ccccd    # -0.95f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, -0x41e66666    # -0.15f

    .line 318
    .line 319
    .line 320
    const v18, -0x430a3d71    # -0.03f

    .line 321
    .line 322
    .line 323
    const v13, -0x42b33333    # -0.05f

    .line 324
    .line 325
    .line 326
    const v14, -0x435c28f6    # -0.02f

    .line 327
    .line 328
    .line 329
    const v15, -0x42333333    # -0.1f

    .line 330
    .line 331
    .line 332
    const v16, -0x430a3d71    # -0.03f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v17, -0x414ccccd    # -0.35f

    .line 339
    .line 340
    .line 341
    const v18, 0x3e4ccccd    # 0.2f

    .line 342
    .line 343
    .line 344
    const v13, -0x41f0a3d7    # -0.14f

    .line 345
    .line 346
    .line 347
    const/4 v14, 0x0

    .line 348
    const v15, -0x4175c28f    # -0.27f

    .line 349
    .line 350
    .line 351
    const v16, 0x3d8f5c29    # 0.07f

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, 0x3fbd70a4    # 1.48f

    .line 358
    .line 359
    .line 360
    const v2, -0x40a66666    # -0.85f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v17, 0x3dcccccd    # 0.1f

    .line 367
    .line 368
    .line 369
    const v18, 0x3f028f5c    # 0.51f

    .line 370
    .line 371
    .line 372
    const v13, -0x42333333    # -0.1f

    .line 373
    .line 374
    .line 375
    const v14, 0x3e2e147b    # 0.17f

    .line 376
    .line 377
    .line 378
    const v15, -0x428a3d71    # -0.06f

    .line 379
    .line 380
    .line 381
    const v16, 0x3ec7ae14    # 0.39f

    .line 382
    .line 383
    .line 384
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x3f2147ae    # 0.63f

    .line 388
    .line 389
    .line 390
    const v2, 0x3f4ccccd    # 0.8f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/16 v17, 0x0

    .line 397
    .line 398
    const v18, 0x3e6b851f    # 0.23f

    .line 399
    .line 400
    .line 401
    const/4 v13, 0x0

    .line 402
    const v14, 0x3db851ec    # 0.09f

    .line 403
    .line 404
    .line 405
    const/4 v15, 0x0

    .line 406
    const v16, 0x3e051eb8    # 0.13f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, -0x40b33333    # -0.8f

    .line 413
    .line 414
    .line 415
    const v2, 0x3f2147ae    # 0.63f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, -0x42333333    # -0.1f

    .line 422
    .line 423
    .line 424
    const v18, 0x3f028f5c    # 0.51f

    .line 425
    .line 426
    .line 427
    const v13, -0x41dc28f6    # -0.16f

    .line 428
    .line 429
    .line 430
    const v14, 0x3df5c28f    # 0.12f

    .line 431
    .line 432
    .line 433
    const v15, -0x41b33333    # -0.2f

    .line 434
    .line 435
    .line 436
    const v16, 0x3eae147b    # 0.34f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3f59999a    # 0.85f

    .line 443
    .line 444
    .line 445
    const v2, 0x3fbd70a4    # 1.48f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x3eb33333    # 0.35f

    .line 452
    .line 453
    .line 454
    const v18, 0x3e4ccccd    # 0.2f

    .line 455
    .line 456
    .line 457
    const v13, 0x3d8f5c29    # 0.07f

    .line 458
    .line 459
    .line 460
    const v14, 0x3e051eb8    # 0.13f

    .line 461
    .line 462
    .line 463
    const v15, 0x3e570a3d    # 0.21f

    .line 464
    .line 465
    .line 466
    const v16, 0x3e4ccccd    # 0.2f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x3e19999a    # 0.15f

    .line 473
    .line 474
    .line 475
    const v18, -0x430a3d71    # -0.03f

    .line 476
    .line 477
    .line 478
    const v13, 0x3d4ccccd    # 0.05f

    .line 479
    .line 480
    .line 481
    const/4 v14, 0x0

    .line 482
    const v15, 0x3dcccccd    # 0.1f

    .line 483
    .line 484
    .line 485
    const v16, -0x43dc28f6    # -0.01f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, -0x41428f5c    # -0.37f

    .line 492
    .line 493
    .line 494
    const v2, 0x3f733333    # 0.95f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, 0x3e4ccccd    # 0.2f

    .line 501
    .line 502
    .line 503
    const v18, 0x3de147ae    # 0.11f

    .line 504
    .line 505
    .line 506
    const v13, 0x3da3d70a    # 0.08f

    .line 507
    .line 508
    .line 509
    const v14, 0x3d4ccccd    # 0.05f

    .line 510
    .line 511
    .line 512
    const v15, 0x3df5c28f    # 0.12f

    .line 513
    .line 514
    .line 515
    const v16, 0x3d8f5c29    # 0.07f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x3f8147ae    # 1.01f

    .line 522
    .line 523
    .line 524
    const v2, 0x3e19999a    # 0.15f

    .line 525
    .line 526
    .line 527
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v17, 0x3ecccccd    # 0.4f

    .line 531
    .line 532
    .line 533
    const v18, 0x3eae147b    # 0.34f

    .line 534
    .line 535
    .line 536
    const v13, 0x3cf5c28f    # 0.03f

    .line 537
    .line 538
    .line 539
    const v14, 0x3e4ccccd    # 0.2f

    .line 540
    .line 541
    .line 542
    const v15, 0x3e4ccccd    # 0.2f

    .line 543
    .line 544
    .line 545
    const v16, 0x3eae147b    # 0.34f

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v0, 0x3fdae148    # 1.71f

    .line 552
    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const v18, -0x4151eb85    # -0.34f

    .line 558
    .line 559
    .line 560
    const v13, 0x3e4ccccd    # 0.2f

    .line 561
    .line 562
    .line 563
    const/4 v14, 0x0

    .line 564
    const v15, 0x3ebd70a4    # 0.37f

    .line 565
    .line 566
    .line 567
    const v16, -0x41e66666    # -0.15f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x3e19999a    # 0.15f

    .line 574
    .line 575
    .line 576
    const v2, -0x407eb852    # -1.01f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v17, 0x3dcccccd    # 0.1f

    .line 583
    .line 584
    .line 585
    const v18, -0x42b33333    # -0.05f

    .line 586
    .line 587
    .line 588
    const v13, 0x3cf5c28f    # 0.03f

    .line 589
    .line 590
    .line 591
    const v14, -0x435c28f6    # -0.02f

    .line 592
    .line 593
    .line 594
    const v15, 0x3d8f5c29    # 0.07f

    .line 595
    .line 596
    .line 597
    const v16, -0x430a3d71    # -0.03f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const v17, 0x3db851ec    # 0.09f

    .line 604
    .line 605
    .line 606
    const v18, -0x428a3d71    # -0.06f

    .line 607
    .line 608
    .line 609
    const v15, 0x3d75c28f    # 0.06f

    .line 610
    .line 611
    .line 612
    const v16, -0x42dc28f6    # -0.04f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v0, 0x3f733333    # 0.95f

    .line 619
    .line 620
    .line 621
    const v2, 0x3ec28f5c    # 0.38f

    .line 622
    .line 623
    .line 624
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v17, 0x3e19999a    # 0.15f

    .line 628
    .line 629
    .line 630
    const v18, 0x3cf5c28f    # 0.03f

    .line 631
    .line 632
    .line 633
    const v13, 0x3d4ccccd    # 0.05f

    .line 634
    .line 635
    .line 636
    const v14, 0x3ca3d70a    # 0.02f

    .line 637
    .line 638
    .line 639
    const v15, 0x3dcccccd    # 0.1f

    .line 640
    .line 641
    .line 642
    const v16, 0x3cf5c28f    # 0.03f

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v17, 0x3eb33333    # 0.35f

    .line 649
    .line 650
    .line 651
    const v18, -0x41b33333    # -0.2f

    .line 652
    .line 653
    .line 654
    const v13, 0x3e0f5c29    # 0.14f

    .line 655
    .line 656
    .line 657
    const/4 v14, 0x0

    .line 658
    const v15, 0x3e8a3d71    # 0.27f

    .line 659
    .line 660
    .line 661
    const v16, -0x4270a3d7    # -0.07f

    .line 662
    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, 0x3f59999a    # 0.85f

    .line 668
    .line 669
    .line 670
    const v2, -0x40428f5c    # -1.48f

    .line 671
    .line 672
    .line 673
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    const v17, 0x41ae7ae1    # 21.81f

    .line 677
    .line 678
    .line 679
    const v18, 0x414bd70a    # 12.74f

    .line 680
    .line 681
    .line 682
    const v13, 0x41b0147b    # 22.01f

    .line 683
    .line 684
    .line 685
    const v14, 0x415147ae    # 13.08f

    .line 686
    .line 687
    .line 688
    const v15, 0x41afc28f    # 21.97f

    .line 689
    .line 690
    .line 691
    const v16, 0x414dc28f    # 12.86f

    .line 692
    .line 693
    .line 694
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v0, 0x41580000    # 13.5f

    .line 701
    .line 702
    const/high16 v2, 0x41900000    # 18.0f

    .line 703
    .line 704
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const/high16 v17, -0x40400000    # -1.5f

    .line 708
    .line 709
    const/high16 v18, -0x40400000    # -1.5f

    .line 710
    .line 711
    const v13, -0x40ab851f    # -0.83f

    .line 712
    .line 713
    .line 714
    const/4 v14, 0x0

    .line 715
    const/high16 v15, -0x40400000    # -1.5f

    .line 716
    .line 717
    const v16, -0x40d47ae1    # -0.67f

    .line 718
    .line 719
    .line 720
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 724
    .line 725
    const/4 v13, 0x0

    .line 726
    const v14, -0x40ab851f    # -0.83f

    .line 727
    .line 728
    .line 729
    const v15, 0x3f2b851f    # 0.67f

    .line 730
    .line 731
    .line 732
    const/high16 v16, -0x40400000    # -1.5f

    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v0, 0x3f2b851f    # 0.67f

    .line 738
    .line 739
    .line 740
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 741
    .line 742
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v17, 0x41900000    # 18.0f

    .line 746
    .line 747
    const/high16 v18, 0x41580000    # 13.5f

    .line 748
    .line 749
    const/high16 v13, 0x419c0000    # 19.5f

    .line 750
    .line 751
    const v14, 0x414d47ae    # 12.83f

    .line 752
    .line 753
    .line 754
    const v15, 0x4196a3d7    # 18.83f

    .line 755
    .line 756
    .line 757
    const/high16 v16, 0x41580000    # 13.5f

    .line 758
    .line 759
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    const/high16 v0, 0x41880000    # 17.0f

    .line 766
    .line 767
    const/high16 v2, 0x41900000    # 18.0f

    .line 768
    .line 769
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 770
    .line 771
    .line 772
    const/high16 v0, 0x40e00000    # 7.0f

    .line 773
    .line 774
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    const/high16 v0, 0x40c00000    # 6.0f

    .line 778
    .line 779
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const/high16 v0, 0x41200000    # 10.0f

    .line 783
    .line 784
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/high16 v0, 0x3f800000    # 1.0f

    .line 788
    .line 789
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const/high16 v0, 0x40000000    # 2.0f

    .line 793
    .line 794
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const/high16 v0, 0x40400000    # 3.0f

    .line 798
    .line 799
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const/high16 v17, -0x40000000    # -2.0f

    .line 803
    .line 804
    const/high16 v18, -0x40000000    # -2.0f

    .line 805
    .line 806
    const/4 v13, 0x0

    .line 807
    const v14, -0x40733333    # -1.1f

    .line 808
    .line 809
    .line 810
    const v15, -0x4099999a    # -0.9f

    .line 811
    .line 812
    .line 813
    const/high16 v16, -0x40000000    # -2.0f

    .line 814
    .line 815
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const/high16 v0, 0x40e00000    # 7.0f

    .line 819
    .line 820
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    const/high16 v17, 0x40a00000    # 5.0f

    .line 824
    .line 825
    const/high16 v18, 0x40400000    # 3.0f

    .line 826
    .line 827
    const v13, 0x40bccccd    # 5.9f

    .line 828
    .line 829
    .line 830
    const/high16 v14, 0x3f800000    # 1.0f

    .line 831
    .line 832
    const/high16 v15, 0x40a00000    # 5.0f

    .line 833
    .line 834
    const v16, 0x3ff33333    # 1.9f

    .line 835
    .line 836
    .line 837
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const/high16 v0, 0x41900000    # 18.0f

    .line 841
    .line 842
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/high16 v17, 0x40000000    # 2.0f

    .line 846
    .line 847
    const/high16 v18, 0x40000000    # 2.0f

    .line 848
    .line 849
    const/4 v13, 0x0

    .line 850
    const v14, 0x3f8ccccd    # 1.1f

    .line 851
    .line 852
    .line 853
    const v15, 0x3f666666    # 0.9f

    .line 854
    .line 855
    .line 856
    const/high16 v16, 0x40000000    # 2.0f

    .line 857
    .line 858
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 859
    .line 860
    .line 861
    const/high16 v0, 0x41200000    # 10.0f

    .line 862
    .line 863
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v18, -0x40000000    # -2.0f

    .line 867
    .line 868
    const v13, 0x3f8ccccd    # 1.1f

    .line 869
    .line 870
    .line 871
    const/4 v14, 0x0

    .line 872
    const/high16 v15, 0x40000000    # 2.0f

    .line 873
    .line 874
    const v16, -0x4099999a    # -0.9f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/high16 v0, -0x3f800000    # -4.0f

    .line 881
    .line 882
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 883
    .line 884
    .line 885
    const/high16 v0, -0x40000000    # -2.0f

    .line 886
    .line 887
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const/high16 v0, 0x41900000    # 18.0f

    .line 891
    .line 892
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const/high16 v0, 0x40400000    # 3.0f

    .line 899
    .line 900
    const/high16 v2, 0x40e00000    # 7.0f

    .line 901
    .line 902
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const/high16 v0, 0x41200000    # 10.0f

    .line 906
    .line 907
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    const/high16 v0, 0x3f800000    # 1.0f

    .line 911
    .line 912
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const/high16 v0, 0x40e00000    # 7.0f

    .line 916
    .line 917
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 918
    .line 919
    .line 920
    const/high16 v0, 0x40400000    # 3.0f

    .line 921
    .line 922
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 926
    .line 927
    .line 928
    const/high16 v0, 0x41a80000    # 21.0f

    .line 929
    .line 930
    const/high16 v2, 0x41880000    # 17.0f

    .line 931
    .line 932
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const/high16 v0, 0x40e00000    # 7.0f

    .line 936
    .line 937
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 938
    .line 939
    .line 940
    const/high16 v0, -0x40800000    # -1.0f

    .line 941
    .line 942
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 943
    .line 944
    .line 945
    const/high16 v0, 0x41200000    # 10.0f

    .line 946
    .line 947
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const/high16 v0, 0x41a80000    # 21.0f

    .line 951
    .line 952
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 956
    .line 957
    .line 958
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 959
    .line 960
    .line 961
    move-result-object v2

    .line 962
    const/16 v16, 0x3800

    .line 963
    .line 964
    const/16 v17, 0x0

    .line 965
    .line 966
    const/high16 v6, 0x3f800000    # 1.0f

    .line 967
    .line 968
    const/high16 v8, 0x3f800000    # 1.0f

    .line 969
    .line 970
    const/4 v7, 0x0

    .line 971
    const/high16 v9, 0x3f800000    # 1.0f

    .line 972
    .line 973
    const/high16 v12, 0x3f800000    # 1.0f

    .line 974
    .line 975
    const/4 v13, 0x0

    .line 976
    const/4 v15, 0x0

    .line 977
    const-string v4, ""

    .line 978
    .line 979
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    sput-object v0, Landroidx/compose/material/icons/outlined/AppSettingsAltKt;->_appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 988
    .line 989
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 990
    .line 991
    .line 992
    return-object v0
.end method

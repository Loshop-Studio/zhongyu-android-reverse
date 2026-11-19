.class public final Landroidx/compose/material/icons/filled/AppSettingsAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAppSettingsAlt(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/AppSettingsAltKt;->_appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.AppSettingsAlt"

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
    const v0, -0x419eb852    # -0.22f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x3f4ccccd    # 0.8f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, 0x3dcccccd    # 0.1f

    .line 101
    .line 102
    .line 103
    const v18, -0x40fd70a4    # -0.51f

    .line 104
    .line 105
    .line 106
    const v13, 0x3e23d70a    # 0.16f

    .line 107
    .line 108
    .line 109
    const v14, -0x420a3d71    # -0.12f

    .line 110
    .line 111
    .line 112
    const v15, 0x3e4ccccd    # 0.2f

    .line 113
    .line 114
    .line 115
    const v16, -0x4151eb85    # -0.34f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, -0x40428f5c    # -1.48f

    .line 122
    .line 123
    .line 124
    const v2, -0x40a66666    # -0.85f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, -0x414ccccd    # -0.35f

    .line 131
    .line 132
    .line 133
    const v18, -0x41b33333    # -0.2f

    .line 134
    .line 135
    .line 136
    const v13, -0x4270a3d7    # -0.07f

    .line 137
    .line 138
    .line 139
    const v14, -0x41fae148    # -0.13f

    .line 140
    .line 141
    .line 142
    const v15, -0x41a8f5c3    # -0.21f

    .line 143
    .line 144
    .line 145
    const v16, -0x41b33333    # -0.2f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v17, -0x41e66666    # -0.15f

    .line 152
    .line 153
    .line 154
    const v18, 0x3cf5c28f    # 0.03f

    .line 155
    .line 156
    .line 157
    const v13, -0x42b33333    # -0.05f

    .line 158
    .line 159
    .line 160
    const/4 v14, 0x0

    .line 161
    const v15, -0x42333333    # -0.1f

    .line 162
    .line 163
    .line 164
    const v16, 0x3c23d70a    # 0.01f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v0, 0x3ec28f5c    # 0.38f

    .line 171
    .line 172
    .line 173
    const v2, -0x408ccccd    # -0.95f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, -0x41bd70a4    # -0.19f

    .line 180
    .line 181
    .line 182
    const v18, -0x421eb852    # -0.11f

    .line 183
    .line 184
    .line 185
    const v13, -0x425c28f6    # -0.08f

    .line 186
    .line 187
    .line 188
    const v14, -0x42b33333    # -0.05f

    .line 189
    .line 190
    .line 191
    const v15, -0x421eb852    # -0.11f

    .line 192
    .line 193
    .line 194
    const v16, -0x4270a3d7    # -0.07f

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v0, -0x41e66666    # -0.15f

    .line 201
    .line 202
    .line 203
    const v2, -0x407eb852    # -1.01f

    .line 204
    .line 205
    .line 206
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const v17, -0x41333333    # -0.4f

    .line 210
    .line 211
    .line 212
    const v18, -0x4147ae14    # -0.36f

    .line 213
    .line 214
    .line 215
    const v13, -0x430a3d71    # -0.03f

    .line 216
    .line 217
    .line 218
    const v14, -0x41a8f5c3    # -0.21f

    .line 219
    .line 220
    .line 221
    const v15, -0x41b33333    # -0.2f

    .line 222
    .line 223
    .line 224
    const v16, -0x4147ae14    # -0.36f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v0, -0x40251eb8    # -1.71f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v18, 0x3eae147b    # 0.34f

    .line 237
    .line 238
    .line 239
    const v13, -0x41b33333    # -0.2f

    .line 240
    .line 241
    .line 242
    const/4 v14, 0x0

    .line 243
    const v15, -0x41428f5c    # -0.37f

    .line 244
    .line 245
    .line 246
    const v16, 0x3e19999a    # 0.15f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, -0x41f0a3d7    # -0.14f

    .line 253
    .line 254
    .line 255
    const v2, 0x3f8147ae    # 1.01f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, -0x42333333    # -0.1f

    .line 262
    .line 263
    .line 264
    const v18, 0x3d4ccccd    # 0.05f

    .line 265
    .line 266
    .line 267
    const v13, -0x430a3d71    # -0.03f

    .line 268
    .line 269
    .line 270
    const v14, 0x3ca3d70a    # 0.02f

    .line 271
    .line 272
    .line 273
    const v15, -0x4270a3d7    # -0.07f

    .line 274
    .line 275
    .line 276
    const v16, 0x3cf5c28f    # 0.03f

    .line 277
    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v0, -0x4247ae14    # -0.09f

    .line 283
    .line 284
    .line 285
    const v2, 0x3d75c28f    # 0.06f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, -0x413d70a4    # -0.38f

    .line 292
    .line 293
    .line 294
    const v2, -0x408ccccd    # -0.95f

    .line 295
    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v17, -0x41e66666    # -0.15f

    .line 301
    .line 302
    .line 303
    const v18, -0x430a3d71    # -0.03f

    .line 304
    .line 305
    .line 306
    const v13, -0x42b33333    # -0.05f

    .line 307
    .line 308
    .line 309
    const v14, -0x435c28f6    # -0.02f

    .line 310
    .line 311
    .line 312
    const v15, -0x42333333    # -0.1f

    .line 313
    .line 314
    .line 315
    const v16, -0x430a3d71    # -0.03f

    .line 316
    .line 317
    .line 318
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, -0x414ccccd    # -0.35f

    .line 322
    .line 323
    .line 324
    const v18, 0x3e4ccccd    # 0.2f

    .line 325
    .line 326
    .line 327
    const v13, -0x41f0a3d7    # -0.14f

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const v15, -0x4175c28f    # -0.27f

    .line 332
    .line 333
    .line 334
    const v16, 0x3d8f5c29    # 0.07f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v0, 0x3fbd70a4    # 1.48f

    .line 341
    .line 342
    .line 343
    const v2, -0x40a66666    # -0.85f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v17, 0x3dcccccd    # 0.1f

    .line 350
    .line 351
    .line 352
    const v18, 0x3f028f5c    # 0.51f

    .line 353
    .line 354
    .line 355
    const v13, -0x42333333    # -0.1f

    .line 356
    .line 357
    .line 358
    const v14, 0x3e2e147b    # 0.17f

    .line 359
    .line 360
    .line 361
    const v15, -0x428a3d71    # -0.06f

    .line 362
    .line 363
    .line 364
    const v16, 0x3ec7ae14    # 0.39f

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const v0, 0x3f2147ae    # 0.63f

    .line 371
    .line 372
    .line 373
    const v2, 0x3f4ccccd    # 0.8f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, 0x3e6b851f    # 0.23f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v0, -0x40b33333    # -0.8f

    .line 386
    .line 387
    .line 388
    const v2, 0x3f2147ae    # 0.63f

    .line 389
    .line 390
    .line 391
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 392
    .line 393
    .line 394
    const v17, -0x42333333    # -0.1f

    .line 395
    .line 396
    .line 397
    const v13, -0x41dc28f6    # -0.16f

    .line 398
    .line 399
    .line 400
    const v14, 0x3df5c28f    # 0.12f

    .line 401
    .line 402
    .line 403
    const v15, -0x41b33333    # -0.2f

    .line 404
    .line 405
    .line 406
    const v16, 0x3eae147b    # 0.34f

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const v0, 0x3f59999a    # 0.85f

    .line 413
    .line 414
    .line 415
    const v2, 0x3fbd70a4    # 1.48f

    .line 416
    .line 417
    .line 418
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const v17, 0x3eb33333    # 0.35f

    .line 422
    .line 423
    .line 424
    const v18, 0x3e4ccccd    # 0.2f

    .line 425
    .line 426
    .line 427
    const v13, 0x3d8f5c29    # 0.07f

    .line 428
    .line 429
    .line 430
    const v14, 0x3e051eb8    # 0.13f

    .line 431
    .line 432
    .line 433
    const v15, 0x3e570a3d    # 0.21f

    .line 434
    .line 435
    .line 436
    const v16, 0x3e4ccccd    # 0.2f

    .line 437
    .line 438
    .line 439
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v17, 0x3e19999a    # 0.15f

    .line 443
    .line 444
    .line 445
    const v18, -0x430a3d71    # -0.03f

    .line 446
    .line 447
    .line 448
    const v13, 0x3d4ccccd    # 0.05f

    .line 449
    .line 450
    .line 451
    const/4 v14, 0x0

    .line 452
    const v15, 0x3dcccccd    # 0.1f

    .line 453
    .line 454
    .line 455
    const v16, -0x43dc28f6    # -0.01f

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, -0x41428f5c    # -0.37f

    .line 462
    .line 463
    .line 464
    const v2, 0x3f733333    # 0.95f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v17, 0x3e4ccccd    # 0.2f

    .line 471
    .line 472
    .line 473
    const v18, 0x3de147ae    # 0.11f

    .line 474
    .line 475
    .line 476
    const v13, 0x3da3d70a    # 0.08f

    .line 477
    .line 478
    .line 479
    const v14, 0x3d4ccccd    # 0.05f

    .line 480
    .line 481
    .line 482
    const v15, 0x3df5c28f    # 0.12f

    .line 483
    .line 484
    .line 485
    const v16, 0x3d8f5c29    # 0.07f

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, 0x3e19999a    # 0.15f

    .line 492
    .line 493
    .line 494
    const v2, 0x3f8147ae    # 1.01f

    .line 495
    .line 496
    .line 497
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v17, 0x3ecccccd    # 0.4f

    .line 501
    .line 502
    .line 503
    const v18, 0x3eae147b    # 0.34f

    .line 504
    .line 505
    .line 506
    const v13, 0x3cf5c28f    # 0.03f

    .line 507
    .line 508
    .line 509
    const v14, 0x3e4ccccd    # 0.2f

    .line 510
    .line 511
    .line 512
    const v15, 0x3e4ccccd    # 0.2f

    .line 513
    .line 514
    .line 515
    const v16, 0x3eae147b    # 0.34f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x3fdae148    # 1.71f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v18, -0x4151eb85    # -0.34f

    .line 528
    .line 529
    .line 530
    const v13, 0x3e4ccccd    # 0.2f

    .line 531
    .line 532
    .line 533
    const/4 v14, 0x0

    .line 534
    const v15, 0x3ebd70a4    # 0.37f

    .line 535
    .line 536
    .line 537
    const v16, -0x41e66666    # -0.15f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const v0, 0x3e19999a    # 0.15f

    .line 544
    .line 545
    .line 546
    const v2, -0x407eb852    # -1.01f

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v17, 0x3dcccccd    # 0.1f

    .line 553
    .line 554
    .line 555
    const v18, -0x42b33333    # -0.05f

    .line 556
    .line 557
    .line 558
    const v13, 0x3cf5c28f    # 0.03f

    .line 559
    .line 560
    .line 561
    const v14, -0x435c28f6    # -0.02f

    .line 562
    .line 563
    .line 564
    const v15, 0x3d8f5c29    # 0.07f

    .line 565
    .line 566
    .line 567
    const v16, -0x430a3d71    # -0.03f

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, 0x3db851ec    # 0.09f

    .line 574
    .line 575
    .line 576
    const v2, -0x428a3d71    # -0.06f

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const v0, 0x3f733333    # 0.95f

    .line 583
    .line 584
    .line 585
    const v2, 0x3ec28f5c    # 0.38f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v17, 0x3e19999a    # 0.15f

    .line 592
    .line 593
    .line 594
    const v18, 0x3cf5c28f    # 0.03f

    .line 595
    .line 596
    .line 597
    const v13, 0x3d4ccccd    # 0.05f

    .line 598
    .line 599
    .line 600
    const v14, 0x3ca3d70a    # 0.02f

    .line 601
    .line 602
    .line 603
    const v15, 0x3dcccccd    # 0.1f

    .line 604
    .line 605
    .line 606
    const v16, 0x3cf5c28f    # 0.03f

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 610
    .line 611
    .line 612
    const v17, 0x3eb33333    # 0.35f

    .line 613
    .line 614
    .line 615
    const v18, -0x41b33333    # -0.2f

    .line 616
    .line 617
    .line 618
    const v13, 0x3e0f5c29    # 0.14f

    .line 619
    .line 620
    .line 621
    const/4 v14, 0x0

    .line 622
    const v15, 0x3e8a3d71    # 0.27f

    .line 623
    .line 624
    .line 625
    const v16, -0x4270a3d7    # -0.07f

    .line 626
    .line 627
    .line 628
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 629
    .line 630
    .line 631
    const v0, 0x3f59999a    # 0.85f

    .line 632
    .line 633
    .line 634
    const v2, -0x40428f5c    # -1.48f

    .line 635
    .line 636
    .line 637
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v17, -0x42333333    # -0.1f

    .line 641
    .line 642
    .line 643
    const v18, -0x40fd70a4    # -0.51f

    .line 644
    .line 645
    .line 646
    const v13, 0x3dcccccd    # 0.1f

    .line 647
    .line 648
    .line 649
    const v14, -0x41d1eb85    # -0.17f

    .line 650
    .line 651
    .line 652
    const v15, 0x3d75c28f    # 0.06f

    .line 653
    .line 654
    .line 655
    const v16, -0x413851ec    # -0.39f

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const/high16 v0, 0x41900000    # 18.0f

    .line 665
    .line 666
    const/high16 v2, 0x41580000    # 13.5f

    .line 667
    .line 668
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    const/high16 v17, -0x40400000    # -1.5f

    .line 672
    .line 673
    const/high16 v18, -0x40400000    # -1.5f

    .line 674
    .line 675
    const v13, -0x40ab851f    # -0.83f

    .line 676
    .line 677
    .line 678
    const/4 v14, 0x0

    .line 679
    const/high16 v15, -0x40400000    # -1.5f

    .line 680
    .line 681
    const v16, -0x40d47ae1    # -0.67f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    const v0, 0x3f2b851f    # 0.67f

    .line 688
    .line 689
    .line 690
    const/high16 v2, -0x40400000    # -1.5f

    .line 691
    .line 692
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 693
    .line 694
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 698
    .line 699
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const v0, -0x40d47ae1    # -0.67f

    .line 703
    .line 704
    .line 705
    const/high16 v2, -0x40400000    # -1.5f

    .line 706
    .line 707
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v0, 0x41880000    # 17.0f

    .line 714
    .line 715
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 716
    .line 717
    .line 718
    const/high16 v0, 0x40000000    # 2.0f

    .line 719
    .line 720
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    const/high16 v0, 0x40800000    # 4.0f

    .line 724
    .line 725
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 726
    .line 727
    .line 728
    const/high16 v17, -0x40000000    # -2.0f

    .line 729
    .line 730
    const/high16 v18, 0x40000000    # 2.0f

    .line 731
    .line 732
    const/4 v13, 0x0

    .line 733
    const v14, 0x3f8ccccd    # 1.1f

    .line 734
    .line 735
    .line 736
    const v15, -0x4099999a    # -0.9f

    .line 737
    .line 738
    .line 739
    const/high16 v16, 0x40000000    # 2.0f

    .line 740
    .line 741
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const/high16 v0, 0x40e00000    # 7.0f

    .line 745
    .line 746
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const/high16 v18, -0x40000000    # -2.0f

    .line 750
    .line 751
    const v13, -0x40733333    # -1.1f

    .line 752
    .line 753
    .line 754
    const/4 v14, 0x0

    .line 755
    const/high16 v15, -0x40000000    # -2.0f

    .line 756
    .line 757
    const v16, -0x4099999a    # -0.9f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const/high16 v0, 0x40400000    # 3.0f

    .line 764
    .line 765
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v17, 0x40000000    # 2.0f

    .line 769
    .line 770
    const/4 v13, 0x0

    .line 771
    const v14, -0x40733333    # -1.1f

    .line 772
    .line 773
    .line 774
    const v15, 0x3f666666    # 0.9f

    .line 775
    .line 776
    .line 777
    const/high16 v16, -0x40000000    # -2.0f

    .line 778
    .line 779
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v18, 0x40000000    # 2.0f

    .line 788
    .line 789
    const v13, 0x3f8ccccd    # 1.1f

    .line 790
    .line 791
    .line 792
    const/4 v14, 0x0

    .line 793
    const/high16 v15, 0x40000000    # 2.0f

    .line 794
    .line 795
    const v16, 0x3f666666    # 0.9f

    .line 796
    .line 797
    .line 798
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const/high16 v0, 0x40800000    # 4.0f

    .line 802
    .line 803
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 804
    .line 805
    .line 806
    const/high16 v0, -0x40000000    # -2.0f

    .line 807
    .line 808
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/high16 v0, 0x40c00000    # 6.0f

    .line 812
    .line 813
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 814
    .line 815
    .line 816
    const/high16 v0, 0x40e00000    # 7.0f

    .line 817
    .line 818
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 819
    .line 820
    .line 821
    const/high16 v0, 0x41400000    # 12.0f

    .line 822
    .line 823
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const/high16 v0, 0x41200000    # 10.0f

    .line 827
    .line 828
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const/high16 v0, -0x40800000    # -1.0f

    .line 832
    .line 833
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    const/16 v16, 0x3800

    .line 844
    .line 845
    const/16 v17, 0x0

    .line 846
    .line 847
    const/high16 v6, 0x3f800000    # 1.0f

    .line 848
    .line 849
    const/high16 v8, 0x3f800000    # 1.0f

    .line 850
    .line 851
    const/4 v7, 0x0

    .line 852
    const/high16 v9, 0x3f800000    # 1.0f

    .line 853
    .line 854
    const/high16 v12, 0x3f800000    # 1.0f

    .line 855
    .line 856
    const/4 v13, 0x0

    .line 857
    const/4 v15, 0x0

    .line 858
    const-string v4, ""

    .line 859
    .line 860
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    sput-object v0, Landroidx/compose/material/icons/filled/AppSettingsAltKt;->_appSettingsAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 869
    .line 870
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    return-object v0
.end method

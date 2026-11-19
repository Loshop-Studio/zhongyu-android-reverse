.class public final Landroidx/compose/material/icons/rounded/YoutubeSearchedForKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _youtubeSearchedFor:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getYoutubeSearchedFor(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/YoutubeSearchedForKt;->_youtubeSearchedFor:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.YoutubeSearchedFor"

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
    const/high16 v0, 0x41600000    # 14.0f

    .line 71
    .line 72
    const v2, 0x4188147b    # 17.01f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v0, -0x40b33333    # -0.8f

    .line 79
    .line 80
    .line 81
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 82
    .line 83
    .line 84
    const v0, -0x4175c28f    # -0.27f

    .line 85
    .line 86
    .line 87
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const v17, 0x3fc147ae    # 1.51f

    .line 91
    .line 92
    .line 93
    const v18, -0x3f5d1eb8    # -5.09f

    .line 94
    .line 95
    .line 96
    const v13, 0x3f933333    # 1.15f

    .line 97
    .line 98
    .line 99
    const v14, -0x40547ae1    # -1.34f

    .line 100
    .line 101
    .line 102
    const v15, 0x3fe147ae    # 1.76f

    .line 103
    .line 104
    .line 105
    const v16, -0x3fb70a3d    # -3.14f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const/high16 v17, 0x41480000    # 12.5f

    .line 112
    .line 113
    const v18, 0x404b851f    # 3.18f

    .line 114
    .line 115
    .line 116
    const v13, 0x4188e148    # 17.11f

    .line 117
    .line 118
    .line 119
    const/high16 v14, 0x40c00000    # 6.0f

    .line 120
    .line 121
    const v15, 0x4171999a    # 15.1f

    .line 122
    .line 123
    .line 124
    const v16, 0x4071eb85    # 3.78f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, 0x409051ec    # 4.51f

    .line 131
    .line 132
    .line 133
    const/high16 v18, 0x41180000    # 9.5f

    .line 134
    .line 135
    const v13, 0x410428f6    # 8.26f

    .line 136
    .line 137
    .line 138
    const v14, 0x400ccccd    # 2.2f

    .line 139
    .line 140
    .line 141
    const v15, 0x409051ec    # 4.51f

    .line 142
    .line 143
    .line 144
    const v16, 0x40b0f5c3    # 5.53f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v0, -0x3ff9999a    # -2.1f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v17, -0x416147ae    # -0.31f

    .line 157
    .line 158
    .line 159
    const v18, 0x3f63d70a    # 0.89f

    .line 160
    .line 161
    .line 162
    const v13, -0x410f5c29    # -0.47f

    .line 163
    .line 164
    .line 165
    const/4 v14, 0x0

    .line 166
    const v15, -0x40d1eb85    # -0.68f

    .line 167
    .line 168
    .line 169
    const v16, 0x3f170a3d    # 0.59f

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v0, 0x4059999a    # 3.4f

    .line 176
    .line 177
    .line 178
    const/high16 v2, 0x40300000    # 2.75f

    .line 179
    .line 180
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v17, 0x3f35c28f    # 0.71f

    .line 184
    .line 185
    .line 186
    const v18, 0x3c23d70a    # 0.01f

    .line 187
    .line 188
    .line 189
    const v13, 0x3e428f5c    # 0.19f

    .line 190
    .line 191
    .line 192
    const v14, 0x3e4ccccd    # 0.2f

    .line 193
    .line 194
    .line 195
    const v15, 0x3f028f5c    # 0.51f

    .line 196
    .line 197
    .line 198
    const v16, 0x3e570a3d    # 0.21f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v0, 0x4039999a    # 2.9f

    .line 205
    .line 206
    .line 207
    const v2, -0x3fcd70a4    # -2.79f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, -0x414ccccd    # -0.35f

    .line 214
    .line 215
    .line 216
    const v18, -0x40a3d70a    # -0.86f

    .line 217
    .line 218
    .line 219
    const v13, 0x3ea3d70a    # 0.32f

    .line 220
    .line 221
    .line 222
    const v14, -0x416147ae    # -0.31f

    .line 223
    .line 224
    .line 225
    const v15, 0x3dcccccd    # 0.1f

    .line 226
    .line 227
    .line 228
    const v16, -0x40a3d70a    # -0.86f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x40d051ec    # 6.51f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, 0x408eb852    # 4.46f

    .line 241
    .line 242
    .line 243
    const/high16 v18, -0x3f700000    # -4.5f

    .line 244
    .line 245
    const/4 v13, 0x0

    .line 246
    const v14, -0x3fe0a3d7    # -2.49f

    .line 247
    .line 248
    .line 249
    const/high16 v15, 0x40000000    # 2.0f

    .line 250
    .line 251
    const v16, -0x3f70a3d7    # -4.48f

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v17, 0x409147ae    # 4.54f

    .line 258
    .line 259
    .line 260
    const v18, 0x408fae14    # 4.49f

    .line 261
    .line 262
    .line 263
    const v13, 0x401c28f6    # 2.44f

    .line 264
    .line 265
    .line 266
    const v14, -0x435c28f6    # -0.02f

    .line 267
    .line 268
    .line 269
    const v15, 0x409147ae    # 4.54f

    .line 270
    .line 271
    .line 272
    const v16, 0x40033333    # 2.05f

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const/high16 v17, -0x3f700000    # -4.5f

    .line 279
    .line 280
    const v18, 0x409051ec    # 4.51f

    .line 281
    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    const v14, 0x401eb852    # 2.48f

    .line 285
    .line 286
    .line 287
    const v15, -0x3ffeb852    # -2.02f

    .line 288
    .line 289
    .line 290
    const v16, 0x409051ec    # 4.51f

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v17, -0x4059999a    # -1.3f

    .line 297
    .line 298
    .line 299
    const v18, -0x41bd70a4    # -0.19f

    .line 300
    .line 301
    .line 302
    const v13, -0x4119999a    # -0.45f

    .line 303
    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    const v15, -0x409c28f6    # -0.89f

    .line 307
    .line 308
    .line 309
    const v16, -0x4270a3d7    # -0.07f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x408a3d71    # -0.96f

    .line 316
    .line 317
    .line 318
    const v18, 0x3e851eb8    # 0.26f

    .line 319
    .line 320
    .line 321
    const v13, -0x4151eb85    # -0.34f

    .line 322
    .line 323
    .line 324
    const v14, -0x42333333    # -0.1f

    .line 325
    .line 326
    .line 327
    const v15, -0x40ca3d71    # -0.71f

    .line 328
    .line 329
    .line 330
    const/16 v16, 0x0

    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v17, 0x3ec7ae14    # 0.39f

    .line 336
    .line 337
    .line 338
    const v18, 0x3fd47ae1    # 1.66f

    .line 339
    .line 340
    .line 341
    const v13, -0x40f851ec    # -0.53f

    .line 342
    .line 343
    .line 344
    const v14, 0x3f07ae14    # 0.53f

    .line 345
    .line 346
    .line 347
    const v15, -0x415c28f6    # -0.32f

    .line 348
    .line 349
    .line 350
    const v16, 0x3fb9999a    # 1.45f

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    const v17, 0x3fef5c29    # 1.87f

    .line 357
    .line 358
    .line 359
    const v18, 0x3e8a3d71    # 0.27f

    .line 360
    .line 361
    .line 362
    const v13, 0x3f170a3d    # 0.59f

    .line 363
    .line 364
    .line 365
    const v14, 0x3e2e147b    # 0.17f

    .line 366
    .line 367
    .line 368
    const v15, 0x3f9c28f6    # 1.22f

    .line 369
    .line 370
    .line 371
    const v16, 0x3e8a3d71    # 0.27f

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const v17, 0x40870a3d    # 4.22f

    .line 378
    .line 379
    .line 380
    const v18, -0x40370a3d    # -1.57f

    .line 381
    .line 382
    .line 383
    const v13, 0x3fce147b    # 1.61f

    .line 384
    .line 385
    .line 386
    const/4 v14, 0x0

    .line 387
    const v15, 0x40451eb8    # 3.08f

    .line 388
    .line 389
    .line 390
    const v16, -0x40e8f5c3    # -0.59f

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v0, 0x3e8a3d71    # 0.27f

    .line 397
    .line 398
    .line 399
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const v0, 0x3f4a3d71    # 0.79f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, 0x4088a3d7    # 4.27f

    .line 409
    .line 410
    .line 411
    const/high16 v2, 0x40880000    # 4.25f

    .line 412
    .line 413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x3fbd70a4    # 1.48f

    .line 417
    .line 418
    .line 419
    const/16 v18, 0x0

    .line 420
    .line 421
    const v13, 0x3ed1eb85    # 0.41f

    .line 422
    .line 423
    .line 424
    const v14, 0x3ed1eb85    # 0.41f

    .line 425
    .line 426
    .line 427
    const v15, 0x3f88f5c3    # 1.07f

    .line 428
    .line 429
    .line 430
    const v16, 0x3ed1eb85    # 0.41f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/16 v17, 0x0

    .line 437
    .line 438
    const v18, -0x404147ae    # -1.49f

    .line 439
    .line 440
    .line 441
    const v14, -0x412e147b    # -0.41f

    .line 442
    .line 443
    .line 444
    const v15, 0x3ed1eb85    # 0.41f

    .line 445
    .line 446
    .line 447
    const v16, -0x4075c28f    # -1.08f

    .line 448
    .line 449
    .line 450
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41600000    # 14.0f

    .line 454
    .line 455
    const v2, 0x4188147b    # 17.01f

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    const/16 v16, 0x3800

    .line 469
    .line 470
    const/16 v17, 0x0

    .line 471
    .line 472
    const/high16 v6, 0x3f800000    # 1.0f

    .line 473
    .line 474
    const/high16 v8, 0x3f800000    # 1.0f

    .line 475
    .line 476
    const/4 v7, 0x0

    .line 477
    const/high16 v9, 0x3f800000    # 1.0f

    .line 478
    .line 479
    const/high16 v12, 0x3f800000    # 1.0f

    .line 480
    .line 481
    const/4 v13, 0x0

    .line 482
    const/4 v14, 0x0

    .line 483
    const/4 v15, 0x0

    .line 484
    const-string v4, ""

    .line 485
    .line 486
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    sput-object v0, Landroidx/compose/material/icons/rounded/YoutubeSearchedForKt;->_youtubeSearchedFor:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 495
    .line 496
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    return-object v0
.end method

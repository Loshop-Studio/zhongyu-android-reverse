.class public final Landroidx/compose/material/icons/rounded/PodcastsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _podcasts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPodcasts(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PodcastsKt;->_podcasts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Podcasts"

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
    const/high16 v0, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v2, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const v18, 0x3fdc28f6    # 1.72f

    .line 80
    .line 81
    .line 82
    const/4 v13, 0x0

    .line 83
    const v14, 0x3f3d70a4    # 0.74f

    .line 84
    .line 85
    .line 86
    const v15, -0x41333333    # -0.4f

    .line 87
    .line 88
    .line 89
    const v16, 0x3fb0a3d7    # 1.38f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v0, 0x41a80000    # 21.0f

    .line 96
    .line 97
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v18, 0x3f800000    # 1.0f

    .line 101
    .line 102
    const v14, 0x3f0ccccd    # 0.55f

    .line 103
    .line 104
    .line 105
    const v15, -0x4119999a    # -0.45f

    .line 106
    .line 107
    .line 108
    const/high16 v16, 0x3f800000    # 1.0f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v18, -0x40800000    # -1.0f

    .line 118
    .line 119
    const v13, -0x40f33333    # -0.55f

    .line 120
    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/high16 v15, -0x40800000    # -1.0f

    .line 124
    .line 125
    const v16, -0x4119999a    # -0.45f

    .line 126
    .line 127
    .line 128
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v0, -0x3f170a3d    # -7.28f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v18, -0x4023d70a    # -1.72f

    .line 138
    .line 139
    .line 140
    const v13, -0x40e66666    # -0.6f

    .line 141
    .line 142
    .line 143
    const v14, -0x414ccccd    # -0.35f

    .line 144
    .line 145
    .line 146
    const v16, -0x40851eb8    # -0.98f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v17, 0x40000000    # 2.0f

    .line 153
    .line 154
    const/high16 v18, -0x40000000    # -2.0f

    .line 155
    .line 156
    const/4 v13, 0x0

    .line 157
    const v14, -0x40733333    # -1.1f

    .line 158
    .line 159
    .line 160
    const v15, 0x3f666666    # 0.9f

    .line 161
    .line 162
    .line 163
    const/high16 v16, -0x40000000    # -2.0f

    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x412e6666    # 10.9f

    .line 169
    .line 170
    .line 171
    const/high16 v2, 0x41400000    # 12.0f

    .line 172
    .line 173
    const/high16 v4, 0x41600000    # 14.0f

    .line 174
    .line 175
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v0, 0x412c0000    # 10.75f

    .line 182
    .line 183
    const v2, 0x40c428f6    # 6.13f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v17, -0x3f6c7ae1    # -4.61f

    .line 190
    .line 191
    .line 192
    const v18, 0x4091999a    # 4.55f

    .line 193
    .line 194
    .line 195
    const v13, -0x3feeb852    # -2.27f

    .line 196
    .line 197
    .line 198
    const v14, 0x3eeb851f    # 0.46f

    .line 199
    .line 200
    .line 201
    const v15, -0x3f7c28f6    # -4.12f

    .line 202
    .line 203
    .line 204
    const v16, 0x4011eb85    # 2.28f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, 0x3f8a3d71    # 1.08f

    .line 211
    .line 212
    .line 213
    const v18, 0x409e147b    # 4.94f

    .line 214
    .line 215
    .line 216
    const v13, -0x41333333    # -0.4f

    .line 217
    .line 218
    .line 219
    const v14, 0x3fee147b    # 1.86f

    .line 220
    .line 221
    .line 222
    const v15, 0x3d8f5c29    # 0.07f

    .line 223
    .line 224
    .line 225
    const v16, 0x4067ae14    # 3.62f

    .line 226
    .line 227
    .line 228
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, 0x3fb70a3d    # 1.43f

    .line 232
    .line 233
    .line 234
    const v18, 0x3d8f5c29    # 0.07f

    .line 235
    .line 236
    .line 237
    const v13, 0x3eb33333    # 0.35f

    .line 238
    .line 239
    .line 240
    const v14, 0x3ee66666    # 0.45f

    .line 241
    .line 242
    .line 243
    const v15, 0x3f83d70a    # 1.03f

    .line 244
    .line 245
    .line 246
    const v16, 0x3ef0a3d7    # 0.47f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, 0x3d8f5c29    # 0.07f

    .line 253
    .line 254
    .line 255
    const v2, -0x4270a3d7    # -0.07f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v17, 0x3d75c28f    # 0.06f

    .line 262
    .line 263
    .line 264
    const/high16 v18, -0x40600000    # -1.25f

    .line 265
    .line 266
    const v13, 0x3eae147b    # 0.34f

    .line 267
    .line 268
    .line 269
    const v14, -0x4151eb85    # -0.34f

    .line 270
    .line 271
    .line 272
    const v15, 0x3eae147b    # 0.34f

    .line 273
    .line 274
    .line 275
    const v16, -0x40a147ae    # -0.87f

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v17, -0x40d70a3d    # -0.66f

    .line 282
    .line 283
    .line 284
    const v18, -0x3fa851ec    # -3.37f

    .line 285
    .line 286
    .line 287
    const v13, -0x40d1eb85    # -0.68f

    .line 288
    .line 289
    .line 290
    const v14, -0x4099999a    # -0.9f

    .line 291
    .line 292
    .line 293
    const v15, -0x40851eb8    # -0.98f

    .line 294
    .line 295
    .line 296
    const v16, -0x3ff9999a    # -2.1f

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v17, 0x403ccccd    # 2.95f

    .line 303
    .line 304
    .line 305
    const v18, -0x3fc7ae14    # -2.88f

    .line 306
    .line 307
    .line 308
    const v13, 0x3eb33333    # 0.35f

    .line 309
    .line 310
    .line 311
    const v14, -0x404a3d71    # -1.42f

    .line 312
    .line 313
    .line 314
    const v15, 0x3fc28f5c    # 1.52f

    .line 315
    .line 316
    .line 317
    const v16, -0x3fdb851f    # -2.57f

    .line 318
    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x41800000    # 16.0f

    .line 324
    .line 325
    const/high16 v18, 0x41400000    # 12.0f

    .line 326
    .line 327
    const v13, 0x415b0a3d    # 13.69f

    .line 328
    .line 329
    .line 330
    const v14, 0x40f0a3d7    # 7.52f

    .line 331
    .line 332
    .line 333
    const/high16 v15, 0x41800000    # 16.0f

    .line 334
    .line 335
    const v16, 0x4117d70a    # 9.49f

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    const v17, -0x40bd70a4    # -0.76f

    .line 342
    .line 343
    .line 344
    const v18, 0x40147ae1    # 2.32f

    .line 345
    .line 346
    .line 347
    const/4 v13, 0x0

    .line 348
    const v14, 0x3f5eb852    # 0.87f

    .line 349
    .line 350
    .line 351
    const v15, -0x4170a3d7    # -0.28f

    .line 352
    .line 353
    .line 354
    const v16, 0x3fd5c28f    # 1.67f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, 0x3d8f5c29    # 0.07f

    .line 361
    .line 362
    .line 363
    const v18, 0x3faa3d71    # 1.33f

    .line 364
    .line 365
    .line 366
    const v13, -0x41666666    # -0.3f

    .line 367
    .line 368
    .line 369
    const v14, 0x3ed1eb85    # 0.41f

    .line 370
    .line 371
    .line 372
    const v15, -0x416b851f    # -0.29f

    .line 373
    .line 374
    .line 375
    const v16, 0x3f7851ec    # 0.97f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/4 v0, 0x0

    .line 382
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x3fc51eb8    # 1.54f

    .line 386
    .line 387
    .line 388
    const v18, -0x41f0a3d7    # -0.14f

    .line 389
    .line 390
    .line 391
    const v13, 0x3ee147ae    # 0.44f

    .line 392
    .line 393
    .line 394
    const v14, 0x3ee147ae    # 0.44f

    .line 395
    .line 396
    .line 397
    const v15, 0x3f95c28f    # 1.17f

    .line 398
    .line 399
    .line 400
    const v16, 0x3ebd70a4    # 0.37f

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const/high16 v17, 0x41900000    # 18.0f

    .line 407
    .line 408
    const/high16 v18, 0x41400000    # 12.0f

    .line 409
    .line 410
    const v13, 0x418c8f5c    # 17.57f

    .line 411
    .line 412
    .line 413
    const v14, 0x41687ae1    # 14.53f

    .line 414
    .line 415
    .line 416
    const/high16 v15, 0x41900000    # 18.0f

    .line 417
    .line 418
    const v16, 0x4154f5c3    # 13.31f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v17, 0x412c0000    # 10.75f

    .line 425
    .line 426
    const v18, 0x40c428f6    # 6.13f

    .line 427
    .line 428
    .line 429
    const/high16 v13, 0x41900000    # 18.0f

    .line 430
    .line 431
    const v14, 0x41047ae1    # 8.28f

    .line 432
    .line 433
    .line 434
    const v15, 0x4169c28f    # 14.61f

    .line 435
    .line 436
    .line 437
    const v16, 0x40ab3333    # 5.35f

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const v0, 0x412d47ae    # 10.83f

    .line 447
    .line 448
    .line 449
    const v2, 0x40047ae1    # 2.07f

    .line 450
    .line 451
    .line 452
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v17, 0x40047ae1    # 2.07f

    .line 456
    .line 457
    .line 458
    const v18, 0x412c7ae1    # 10.78f

    .line 459
    .line 460
    .line 461
    const v13, 0x40c9999a    # 6.3f

    .line 462
    .line 463
    .line 464
    const v14, 0x40251eb8    # 2.58f

    .line 465
    .line 466
    .line 467
    const v15, 0x40270a3d    # 2.61f

    .line 468
    .line 469
    .line 470
    const/high16 v16, 0x40c80000    # 6.25f

    .line 471
    .line 472
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v17, 0x40147ae1    # 2.32f

    .line 476
    .line 477
    .line 478
    const v18, 0x40f66666    # 7.7f

    .line 479
    .line 480
    .line 481
    const v13, -0x414ccccd    # -0.35f

    .line 482
    .line 483
    .line 484
    const v14, 0x403ccccd    # 2.95f

    .line 485
    .line 486
    .line 487
    const v15, 0x3f170a3d    # 0.59f

    .line 488
    .line 489
    .line 490
    const v16, 0x40b570a4    # 5.67f

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v17, 0x3fb70a3d    # 1.43f

    .line 497
    .line 498
    .line 499
    const v18, 0x3d75c28f    # 0.06f

    .line 500
    .line 501
    .line 502
    const v13, 0x3ebd70a4    # 0.37f

    .line 503
    .line 504
    .line 505
    const v14, 0x3edc28f6    # 0.43f

    .line 506
    .line 507
    .line 508
    const v15, 0x3f83d70a    # 1.03f

    .line 509
    .line 510
    .line 511
    const v16, 0x3eeb851f    # 0.46f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, 0x3d4ccccd    # 0.05f

    .line 518
    .line 519
    .line 520
    const v2, -0x42b33333    # -0.05f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, 0x3d4ccccd    # 0.05f

    .line 527
    .line 528
    .line 529
    const v18, -0x4059999a    # -1.3f

    .line 530
    .line 531
    .line 532
    const v13, 0x3eb33333    # 0.35f

    .line 533
    .line 534
    .line 535
    const v14, -0x414ccccd    # -0.35f

    .line 536
    .line 537
    .line 538
    const v15, 0x3ec28f5c    # 0.38f

    .line 539
    .line 540
    .line 541
    const v16, -0x40947ae1    # -0.92f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v17, -0x40266666    # -1.7f

    .line 548
    .line 549
    .line 550
    const v18, -0x3f1e147b    # -7.06f

    .line 551
    .line 552
    .line 553
    const v13, -0x403851ec    # -1.56f

    .line 554
    .line 555
    .line 556
    const v14, -0x4015c28f    # -1.83f

    .line 557
    .line 558
    .line 559
    const v15, -0x3feae148    # -2.33f

    .line 560
    .line 561
    .line 562
    const v16, -0x3f7428f6    # -4.37f

    .line 563
    .line 564
    .line 565
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, 0x40c70a3d    # 6.22f

    .line 569
    .line 570
    .line 571
    const v18, -0x3f40f5c3    # -5.97f

    .line 572
    .line 573
    .line 574
    const v13, 0x3f333333    # 0.7f

    .line 575
    .line 576
    .line 577
    const v14, -0x3fbf5c29    # -3.01f

    .line 578
    .line 579
    .line 580
    const v15, 0x404b851f    # 3.18f

    .line 581
    .line 582
    .line 583
    const v16, -0x3f53851f    # -5.39f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v17, 0x41a00000    # 20.0f

    .line 590
    .line 591
    const/high16 v18, 0x41400000    # 12.0f

    .line 592
    .line 593
    const v13, 0x41787ae1    # 15.53f

    .line 594
    .line 595
    .line 596
    const v14, 0x404b851f    # 3.18f

    .line 597
    .line 598
    .line 599
    const/high16 v15, 0x41a00000    # 20.0f

    .line 600
    .line 601
    const v16, 0x40e28f5c    # 7.08f

    .line 602
    .line 603
    .line 604
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, -0x400ccccd    # -1.9f

    .line 608
    .line 609
    .line 610
    const v18, 0x40a51eb8    # 5.16f

    .line 611
    .line 612
    .line 613
    const/4 v13, 0x0

    .line 614
    const v14, 0x3ffae148    # 1.96f

    .line 615
    .line 616
    .line 617
    const v15, -0x40c7ae14    # -0.72f

    .line 618
    .line 619
    .line 620
    const v16, 0x4070a3d7    # 3.76f

    .line 621
    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const v17, 0x3d4ccccd    # 0.05f

    .line 627
    .line 628
    .line 629
    const v18, 0x3faccccd    # 1.35f

    .line 630
    .line 631
    .line 632
    const v13, -0x4151eb85    # -0.34f

    .line 633
    .line 634
    .line 635
    const v14, 0x3ecccccd    # 0.4f

    .line 636
    .line 637
    .line 638
    const v15, -0x416147ae    # -0.31f

    .line 639
    .line 640
    .line 641
    const v16, 0x3f7ae148    # 0.98f

    .line 642
    .line 643
    .line 644
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 645
    .line 646
    .line 647
    const/4 v0, 0x0

    .line 648
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v17, 0x3fbeb852    # 1.49f

    .line 652
    .line 653
    .line 654
    const v18, -0x4270a3d7    # -0.07f

    .line 655
    .line 656
    .line 657
    const v13, 0x3ed70a3d    # 0.42f

    .line 658
    .line 659
    .line 660
    const v14, 0x3ed70a3d    # 0.42f

    .line 661
    .line 662
    .line 663
    const v15, 0x3f8e147b    # 1.11f

    .line 664
    .line 665
    .line 666
    const v16, 0x3ec7ae14    # 0.39f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v17, 0x41b00000    # 22.0f

    .line 673
    .line 674
    const/high16 v18, 0x41400000    # 12.0f

    .line 675
    .line 676
    const v13, 0x41a8e148    # 21.11f

    .line 677
    .line 678
    .line 679
    const v14, 0x4185999a    # 16.7f

    .line 680
    .line 681
    .line 682
    const/high16 v15, 0x41b00000    # 22.0f

    .line 683
    .line 684
    const v16, 0x41675c29    # 14.46f

    .line 685
    .line 686
    .line 687
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const v17, 0x412d47ae    # 10.83f

    .line 691
    .line 692
    .line 693
    const v18, 0x40047ae1    # 2.07f

    .line 694
    .line 695
    .line 696
    const/high16 v13, 0x41b00000    # 22.0f

    .line 697
    .line 698
    const v14, 0x40c2e148    # 6.09f

    .line 699
    .line 700
    .line 701
    const v15, 0x4186f5c3    # 16.87f

    .line 702
    .line 703
    .line 704
    const v16, 0x3fb0a3d7    # 1.38f

    .line 705
    .line 706
    .line 707
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    const/16 v16, 0x3800

    .line 718
    .line 719
    const/16 v17, 0x0

    .line 720
    .line 721
    const/high16 v6, 0x3f800000    # 1.0f

    .line 722
    .line 723
    const/high16 v8, 0x3f800000    # 1.0f

    .line 724
    .line 725
    const/4 v7, 0x0

    .line 726
    const/high16 v9, 0x3f800000    # 1.0f

    .line 727
    .line 728
    const/high16 v12, 0x3f800000    # 1.0f

    .line 729
    .line 730
    const/4 v13, 0x0

    .line 731
    const/4 v14, 0x0

    .line 732
    const/4 v15, 0x0

    .line 733
    const-string v4, ""

    .line 734
    .line 735
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    sput-object v0, Landroidx/compose/material/icons/rounded/PodcastsKt;->_podcasts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 744
    .line 745
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    return-object v0
.end method

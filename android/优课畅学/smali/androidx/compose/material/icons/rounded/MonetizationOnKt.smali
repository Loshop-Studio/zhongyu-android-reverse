.class public final Landroidx/compose/material/icons/rounded/MonetizationOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _monetizationOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMonetizationOn(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/MonetizationOnKt;->_monetizationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.MonetizationOn"

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
    const/high16 v2, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, 0x41400000    # 12.0f

    .line 80
    .line 81
    const v13, 0x40cf5c29    # 6.48f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40000000    # 2.0f

    .line 85
    .line 86
    const/high16 v15, 0x40000000    # 2.0f

    .line 87
    .line 88
    const v16, 0x40cf5c29    # 6.48f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v0, 0x408f5c29    # 4.48f

    .line 95
    .line 96
    .line 97
    const/high16 v2, 0x41200000    # 10.0f

    .line 98
    .line 99
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v0, -0x3f70a3d7    # -4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 106
    .line 107
    const/high16 v4, 0x41200000    # 10.0f

    .line 108
    .line 109
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x418c28f6    # 17.52f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x41400000    # 12.0f

    .line 116
    .line 117
    const/high16 v4, 0x40000000    # 2.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v0, 0x41568f5c    # 13.41f

    .line 126
    .line 127
    .line 128
    const v2, 0x4190b852    # 18.09f

    .line 129
    .line 130
    .line 131
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x3f147ae1    # 0.58f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, -0x4055c28f    # -1.33f

    .line 141
    .line 142
    .line 143
    const v18, 0x3faa3d71    # 1.33f

    .line 144
    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const v14, 0x3f3ae148    # 0.73f

    .line 148
    .line 149
    .line 150
    const v15, -0x40e66666    # -0.6f

    .line 151
    .line 152
    .line 153
    const v16, 0x3faa3d71    # 1.33f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, -0x43dc28f6    # -0.01f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v18, -0x4055c28f    # -1.33f

    .line 166
    .line 167
    .line 168
    const v13, -0x40c51eb8    # -0.73f

    .line 169
    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    const v15, -0x4055c28f    # -1.33f

    .line 173
    .line 174
    .line 175
    const v16, -0x40e66666    # -0.6f

    .line 176
    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, -0x40e66666    # -0.6f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, -0x3fbf5c29    # -3.01f

    .line 188
    .line 189
    .line 190
    const v18, -0x3ff0a3d7    # -2.24f

    .line 191
    .line 192
    .line 193
    const v13, -0x4055c28f    # -1.33f

    .line 194
    .line 195
    .line 196
    const v14, -0x4170a3d7    # -0.28f

    .line 197
    .line 198
    .line 199
    const v15, -0x3fdf5c29    # -2.51f

    .line 200
    .line 201
    .line 202
    const v16, -0x407eb852    # -1.01f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, 0x3f4ccccd    # 0.8f

    .line 209
    .line 210
    .line 211
    const v18, -0x406b851f    # -1.16f

    .line 212
    .line 213
    .line 214
    const v13, -0x41947ae1    # -0.23f

    .line 215
    .line 216
    .line 217
    const v14, -0x40f33333    # -0.55f

    .line 218
    .line 219
    .line 220
    const v15, 0x3e4ccccd    # 0.2f

    .line 221
    .line 222
    .line 223
    const v16, -0x406b851f    # -1.16f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x3e75c28f    # 0.24f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, 0x3f4f5c29    # 0.81f

    .line 236
    .line 237
    .line 238
    const v18, 0x3f19999a    # 0.6f

    .line 239
    .line 240
    .line 241
    const v13, 0x3ebd70a4    # 0.37f

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const v15, 0x3f2b851f    # 0.67f

    .line 246
    .line 247
    .line 248
    const/high16 v16, 0x3e800000    # 0.25f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x4020a3d7    # 2.51f

    .line 254
    .line 255
    .line 256
    const v18, 0x3fa28f5c    # 1.27f

    .line 257
    .line 258
    .line 259
    const v13, 0x3e947ae1    # 0.29f

    .line 260
    .line 261
    .line 262
    const/high16 v14, 0x3f400000    # 0.75f

    .line 263
    .line 264
    const v15, 0x3f866666    # 1.05f

    .line 265
    .line 266
    .line 267
    const v16, 0x3fa28f5c    # 1.27f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x4019999a    # 2.4f

    .line 274
    .line 275
    .line 276
    const v18, -0x40347ae1    # -1.59f

    .line 277
    .line 278
    .line 279
    const v13, 0x3ffae148    # 1.96f

    .line 280
    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const v15, 0x4019999a    # 2.4f

    .line 284
    .line 285
    .line 286
    const v16, -0x40851eb8    # -0.98f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v17, -0x3fd51eb8    # -2.67f

    .line 293
    .line 294
    .line 295
    const v18, -0x3ff70a3d    # -2.14f

    .line 296
    .line 297
    .line 298
    const/4 v13, 0x0

    .line 299
    const v14, -0x40ab851f    # -0.83f

    .line 300
    .line 301
    .line 302
    const v15, -0x411eb852    # -0.44f

    .line 303
    .line 304
    .line 305
    const v16, -0x4031eb85    # -1.61f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v17, -0x3f7a3d71    # -4.18f

    .line 312
    .line 313
    .line 314
    const v18, -0x3f951eb8    # -3.67f

    .line 315
    .line 316
    .line 317
    const v13, -0x3fe147ae    # -2.48f

    .line 318
    .line 319
    .line 320
    const v14, -0x40e66666    # -0.6f

    .line 321
    .line 322
    .line 323
    const v15, -0x3f7a3d71    # -4.18f

    .line 324
    .line 325
    .line 326
    const v16, -0x4030a3d7    # -1.62f

    .line 327
    .line 328
    .line 329
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    const v17, 0x40470a3d    # 3.11f

    .line 333
    .line 334
    .line 335
    const v18, -0x3fb28f5c    # -3.21f

    .line 336
    .line 337
    .line 338
    const/4 v13, 0x0

    .line 339
    const v14, -0x4023d70a    # -1.72f

    .line 340
    .line 341
    .line 342
    const v15, 0x3fb1eb85    # 1.39f

    .line 343
    .line 344
    .line 345
    const v16, -0x3fca3d71    # -2.84f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const v0, -0x40e66666    # -0.6f

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v17, 0x3faa3d71    # 1.33f

    .line 358
    .line 359
    .line 360
    const v18, -0x4055c28f    # -1.33f

    .line 361
    .line 362
    .line 363
    const v14, -0x40c51eb8    # -0.73f

    .line 364
    .line 365
    .line 366
    const v15, 0x3f19999a    # 0.6f

    .line 367
    .line 368
    .line 369
    const v16, -0x4055c28f    # -1.33f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x3c23d70a    # 0.01f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v18, 0x3faa3d71    # 1.33f

    .line 382
    .line 383
    .line 384
    const v13, 0x3f3ae148    # 0.73f

    .line 385
    .line 386
    .line 387
    const/4 v14, 0x0

    .line 388
    const v15, 0x3faa3d71    # 1.33f

    .line 389
    .line 390
    .line 391
    const v16, 0x3f19999a    # 0.6f

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x3f1eb852    # 0.62f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, 0x402851ec    # 2.63f

    .line 404
    .line 405
    .line 406
    const v18, 0x4010a3d7    # 2.26f

    .line 407
    .line 408
    .line 409
    const v13, 0x3fb0a3d7    # 1.38f

    .line 410
    .line 411
    .line 412
    const v14, 0x3eae147b    # 0.34f

    .line 413
    .line 414
    .line 415
    const/high16 v15, 0x40100000    # 2.25f

    .line 416
    .line 417
    const v16, 0x3f99999a    # 1.2f

    .line 418
    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, -0x40b0a3d7    # -0.81f

    .line 424
    .line 425
    .line 426
    const v18, 0x3f90a3d7    # 1.13f

    .line 427
    .line 428
    .line 429
    const v13, 0x3e4ccccd    # 0.2f

    .line 430
    .line 431
    .line 432
    const v14, 0x3f0ccccd    # 0.55f

    .line 433
    .line 434
    .line 435
    const v15, -0x419eb852    # -0.22f

    .line 436
    .line 437
    .line 438
    const v16, 0x3f90a3d7    # 1.13f

    .line 439
    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, -0x417ae148    # -0.26f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v17, -0x40bae148    # -0.77f

    .line 451
    .line 452
    .line 453
    const v18, -0x40e147ae    # -0.62f

    .line 454
    .line 455
    .line 456
    const v13, -0x41428f5c    # -0.37f

    .line 457
    .line 458
    .line 459
    const/4 v14, 0x0

    .line 460
    const v15, -0x40d47ae1    # -0.67f

    .line 461
    .line 462
    .line 463
    const v16, -0x417ae148    # -0.26f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v17, -0x3ff851ec    # -2.12f

    .line 470
    .line 471
    .line 472
    const/high16 v18, -0x40600000    # -1.25f

    .line 473
    .line 474
    const v13, -0x41947ae1    # -0.23f

    .line 475
    .line 476
    .line 477
    const v14, -0x40bd70a4    # -0.76f

    .line 478
    .line 479
    .line 480
    const v15, -0x40a3d70a    # -0.86f

    .line 481
    .line 482
    .line 483
    const/high16 v16, -0x40600000    # -1.25f

    .line 484
    .line 485
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v17, -0x3fe66666    # -2.4f

    .line 489
    .line 490
    .line 491
    const v18, 0x3fd1eb85    # 1.64f

    .line 492
    .line 493
    .line 494
    const/high16 v13, -0x40400000    # -1.5f

    .line 495
    .line 496
    const/4 v14, 0x0

    .line 497
    const v15, -0x3fe66666    # -2.4f

    .line 498
    .line 499
    .line 500
    const v16, 0x3f2e147b    # 0.68f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v17, 0x402ae148    # 2.67f

    .line 507
    .line 508
    .line 509
    const v18, 0x3ff47ae1    # 1.91f

    .line 510
    .line 511
    .line 512
    const/4 v13, 0x0

    .line 513
    const v14, 0x3f570a3d    # 0.84f

    .line 514
    .line 515
    .line 516
    const v15, 0x3f266666    # 0.65f

    .line 517
    .line 518
    .line 519
    const v16, 0x3fb1eb85    # 1.39f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v0, 0x3fb1eb85    # 1.39f

    .line 526
    .line 527
    .line 528
    const v2, 0x407a3d71    # 3.91f

    .line 529
    .line 530
    .line 531
    const v4, 0x4085c28f    # 4.18f

    .line 532
    .line 533
    .line 534
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const v17, -0x3fb7ae14    # -3.13f

    .line 538
    .line 539
    .line 540
    const v18, 0x404a3d71    # 3.16f

    .line 541
    .line 542
    .line 543
    const v13, -0x435c28f6    # -0.02f

    .line 544
    .line 545
    .line 546
    const v14, 0x3fea3d71    # 1.83f

    .line 547
    .line 548
    .line 549
    const v15, -0x404e147b    # -1.39f

    .line 550
    .line 551
    .line 552
    const v16, 0x40351eb8    # 2.83f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    const/16 v16, 0x3800

    .line 566
    .line 567
    const/16 v17, 0x0

    .line 568
    .line 569
    const/high16 v6, 0x3f800000    # 1.0f

    .line 570
    .line 571
    const/high16 v8, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v7, 0x0

    .line 574
    const/high16 v9, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/high16 v12, 0x3f800000    # 1.0f

    .line 577
    .line 578
    const/4 v13, 0x0

    .line 579
    const/4 v14, 0x0

    .line 580
    const/4 v15, 0x0

    .line 581
    const-string v4, ""

    .line 582
    .line 583
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    sput-object v0, Landroidx/compose/material/icons/rounded/MonetizationOnKt;->_monetizationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 592
    .line 593
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    return-object v0
.end method

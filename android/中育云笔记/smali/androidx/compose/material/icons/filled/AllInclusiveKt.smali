.class public final Landroidx/compose/material/icons/filled/AllInclusiveKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _allInclusive:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAllInclusive(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/AllInclusiveKt;->_allInclusive:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.AllInclusive"

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
    const v0, 0x4194cccd    # 18.6f

    .line 71
    .line 72
    .line 73
    const v2, 0x40d3d70a    # 6.62f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x3f8eb852    # -3.77f

    .line 80
    .line 81
    .line 82
    const v18, 0x3fc3d70a    # 1.53f

    .line 83
    .line 84
    .line 85
    const v13, -0x4047ae14    # -1.44f

    .line 86
    .line 87
    .line 88
    const/4 v14, 0x0

    .line 89
    const v15, -0x3fcccccd    # -2.8f

    .line 90
    .line 91
    .line 92
    const v16, 0x3f0f5c29    # 0.56f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v0, 0x412a8f5c    # 10.66f

    .line 99
    .line 100
    .line 101
    const/high16 v2, 0x41400000    # 12.0f

    .line 102
    .line 103
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, 0x4127ae14    # 10.48f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x3c23d70a    # 0.01f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const v0, 0x40f9999a    # 7.8f

    .line 119
    .line 120
    .line 121
    const v2, 0x41663d71    # 14.39f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v17, -0x3fe66666    # -2.4f

    .line 128
    .line 129
    .line 130
    const v18, 0x3f7d70a4    # 0.99f

    .line 131
    .line 132
    .line 133
    const v13, -0x40dc28f6    # -0.64f

    .line 134
    .line 135
    .line 136
    const v14, 0x3f23d70a    # 0.64f

    .line 137
    .line 138
    .line 139
    const v15, -0x404147ae    # -1.49f

    .line 140
    .line 141
    .line 142
    const v16, 0x3f7d70a4    # 0.99f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, -0x3fa70a3d    # -3.39f

    .line 149
    .line 150
    .line 151
    const v18, -0x3fa7ae14    # -3.38f

    .line 152
    .line 153
    .line 154
    const v13, -0x4010a3d7    # -1.87f

    .line 155
    .line 156
    .line 157
    const/4 v14, 0x0

    .line 158
    const v15, -0x3fa70a3d    # -3.39f

    .line 159
    .line 160
    .line 161
    const v16, -0x403eb852    # -1.51f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x4061eb85    # 3.53f

    .line 168
    .line 169
    .line 170
    const v2, 0x40accccd    # 5.4f

    .line 171
    .line 172
    .line 173
    const v4, 0x4109eb85    # 8.62f

    .line 174
    .line 175
    .line 176
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v17, 0x401c28f6    # 2.44f

    .line 180
    .line 181
    .line 182
    const v18, 0x3f83d70a    # 1.03f

    .line 183
    .line 184
    .line 185
    const v13, 0x3f68f5c3    # 0.91f

    .line 186
    .line 187
    .line 188
    const v15, 0x3fe147ae    # 1.76f

    .line 189
    .line 190
    .line 191
    const v16, 0x3eb33333    # 0.35f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x3f90a3d7    # 1.13f

    .line 198
    .line 199
    .line 200
    const/high16 v2, 0x3f800000    # 1.0f

    .line 201
    .line 202
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x3fc147ae    # 1.51f

    .line 206
    .line 207
    .line 208
    const v2, -0x40547ae1    # -1.34f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v0, 0x4113851f    # 9.22f

    .line 215
    .line 216
    .line 217
    const v2, 0x41033333    # 8.2f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v17, 0x40accccd    # 5.4f

    .line 224
    .line 225
    .line 226
    const v18, 0x40d3d70a    # 6.62f

    .line 227
    .line 228
    .line 229
    const v13, 0x41033333    # 8.2f

    .line 230
    .line 231
    .line 232
    const v14, 0x40e5c28f    # 7.18f

    .line 233
    .line 234
    .line 235
    const v15, 0x40dae148    # 6.84f

    .line 236
    .line 237
    .line 238
    const v16, 0x40d3d70a    # 6.62f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const/high16 v18, 0x41400000    # 12.0f

    .line 247
    .line 248
    const v13, 0x401ae148    # 2.42f

    .line 249
    .line 250
    .line 251
    const v14, 0x40d3d70a    # 6.62f

    .line 252
    .line 253
    .line 254
    const/4 v15, 0x0

    .line 255
    const v16, 0x4110a3d7    # 9.04f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x401ae148    # 2.42f

    .line 262
    .line 263
    .line 264
    const v2, 0x40ac28f6    # 5.38f

    .line 265
    .line 266
    .line 267
    const v4, 0x40accccd    # 5.4f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x407147ae    # 3.77f

    .line 274
    .line 275
    .line 276
    const v18, -0x403c28f6    # -1.53f

    .line 277
    .line 278
    .line 279
    const v13, 0x3fb851ec    # 1.44f

    .line 280
    .line 281
    .line 282
    const/4 v14, 0x0

    .line 283
    const v15, 0x40333333    # 2.8f

    .line 284
    .line 285
    .line 286
    const v16, -0x40f0a3d7    # -0.56f

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, 0x40351eb8    # 2.83f

    .line 293
    .line 294
    .line 295
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 296
    .line 297
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x3c23d70a    # 0.01f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v0, 0x415851ec    # 13.52f

    .line 307
    .line 308
    .line 309
    const/high16 v2, 0x41400000    # 12.0f

    .line 310
    .line 311
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const v0, -0x43dc28f6    # -0.01f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v0, 0x402c28f6    # 2.69f

    .line 321
    .line 322
    .line 323
    const v2, -0x3fe70a3d    # -2.39f

    .line 324
    .line 325
    .line 326
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x4019999a    # 2.4f

    .line 330
    .line 331
    .line 332
    const v18, -0x40828f5c    # -0.99f

    .line 333
    .line 334
    .line 335
    const v13, 0x3f23d70a    # 0.64f

    .line 336
    .line 337
    .line 338
    const v14, -0x40dc28f6    # -0.64f

    .line 339
    .line 340
    .line 341
    const v15, 0x3fbeb852    # 1.49f

    .line 342
    .line 343
    .line 344
    const v16, -0x40828f5c    # -0.99f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v17, 0x4058f5c3    # 3.39f

    .line 351
    .line 352
    .line 353
    const v18, 0x405851ec    # 3.38f

    .line 354
    .line 355
    .line 356
    const v13, 0x3fef5c29    # 1.87f

    .line 357
    .line 358
    .line 359
    const/4 v14, 0x0

    .line 360
    const v15, 0x4058f5c3    # 3.39f

    .line 361
    .line 362
    .line 363
    const v16, 0x3fc147ae    # 1.51f

    .line 364
    .line 365
    .line 366
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, -0x403d70a4    # -1.52f

    .line 370
    .line 371
    .line 372
    const v2, -0x3fa70a3d    # -3.39f

    .line 373
    .line 374
    .line 375
    const v4, 0x405851ec    # 3.38f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, -0x3fe3d70a    # -2.44f

    .line 382
    .line 383
    .line 384
    const v18, -0x407c28f6    # -1.03f

    .line 385
    .line 386
    .line 387
    const v13, -0x4099999a    # -0.9f

    .line 388
    .line 389
    .line 390
    const v15, -0x401eb852    # -1.76f

    .line 391
    .line 392
    .line 393
    const v16, -0x414ccccd    # -0.35f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, -0x406e147b    # -1.14f

    .line 400
    .line 401
    .line 402
    const v2, -0x407eb852    # -1.01f

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v0, -0x403eb852    # -1.51f

    .line 409
    .line 410
    .line 411
    const v2, 0x3fab851f    # 1.34f

    .line 412
    .line 413
    .line 414
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, 0x3fa28f5c    # 1.27f

    .line 418
    .line 419
    .line 420
    const v2, 0x3f8f5c29    # 1.12f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v17, 0x40747ae1    # 3.82f

    .line 427
    .line 428
    .line 429
    const v18, 0x3fc8f5c3    # 1.57f

    .line 430
    .line 431
    .line 432
    const v13, 0x3f828f5c    # 1.02f

    .line 433
    .line 434
    .line 435
    const v14, 0x3f8147ae    # 1.01f

    .line 436
    .line 437
    .line 438
    const v15, 0x4017ae14    # 2.37f

    .line 439
    .line 440
    .line 441
    const v16, 0x3fc8f5c3    # 1.57f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, 0x40accccd    # 5.4f

    .line 448
    .line 449
    .line 450
    const v18, -0x3f53d70a    # -5.38f

    .line 451
    .line 452
    .line 453
    const v13, 0x403eb852    # 2.98f

    .line 454
    .line 455
    .line 456
    const/4 v14, 0x0

    .line 457
    const v15, 0x40accccd    # 5.4f

    .line 458
    .line 459
    .line 460
    const v16, -0x3fe5c28f    # -2.41f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v0, -0x3fe51eb8    # -2.42f

    .line 467
    .line 468
    .line 469
    const v2, -0x3f533333    # -5.4f

    .line 470
    .line 471
    .line 472
    const v4, -0x3f5428f6    # -5.37f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    const/16 v16, 0x3800

    .line 486
    .line 487
    const/16 v17, 0x0

    .line 488
    .line 489
    const/high16 v6, 0x3f800000    # 1.0f

    .line 490
    .line 491
    const/high16 v8, 0x3f800000    # 1.0f

    .line 492
    .line 493
    const/4 v7, 0x0

    .line 494
    const/high16 v9, 0x3f800000    # 1.0f

    .line 495
    .line 496
    const/high16 v12, 0x3f800000    # 1.0f

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const/4 v15, 0x0

    .line 500
    const-string v4, ""

    .line 501
    .line 502
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    sput-object v0, Landroidx/compose/material/icons/filled/AllInclusiveKt;->_allInclusive:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 511
    .line 512
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    return-object v0
.end method

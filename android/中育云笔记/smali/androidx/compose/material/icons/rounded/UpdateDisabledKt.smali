.class public final Landroidx/compose/material/icons/rounded/UpdateDisabledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _updateDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUpdateDisabled(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/UpdateDisabledKt;->_updateDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.UpdateDisabled"

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
    const v0, 0x41a3eb85    # 20.49f

    .line 71
    .line 72
    .line 73
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 74
    .line 75
    .line 76
    const v0, 0x4060a3d7    # 3.51f

    .line 77
    .line 78
    .line 79
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v17, -0x404b851f    # -1.41f

    .line 83
    .line 84
    .line 85
    const/16 v18, 0x0

    .line 86
    .line 87
    const v13, -0x413851ec    # -0.39f

    .line 88
    .line 89
    .line 90
    const v14, -0x413851ec    # -0.39f

    .line 91
    .line 92
    .line 93
    const v15, -0x407d70a4    # -1.02f

    .line 94
    .line 95
    .line 96
    const v16, -0x413851ec    # -0.39f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    const v18, 0x3fb47ae1    # 1.41f

    .line 109
    .line 110
    .line 111
    const v14, 0x3ec7ae14    # 0.39f

    .line 112
    .line 113
    .line 114
    const v15, -0x413851ec    # -0.39f

    .line 115
    .line 116
    .line 117
    const v16, 0x3f828f5c    # 1.02f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x4013d70a    # 2.31f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x40400000    # 3.0f

    .line 130
    .line 131
    const v18, 0x413bd70a    # 11.74f

    .line 132
    .line 133
    .line 134
    const v13, 0x40647ae1    # 3.57f

    .line 135
    .line 136
    .line 137
    const v14, 0x4108f5c3    # 8.56f

    .line 138
    .line 139
    .line 140
    const v15, 0x40433333    # 3.05f

    .line 141
    .line 142
    .line 143
    const v16, 0x412170a4    # 10.09f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, 0x41400000    # 12.0f

    .line 150
    .line 151
    const/high16 v18, 0x41a80000    # 21.0f

    .line 152
    .line 153
    const v13, 0x40370a3d    # 2.86f

    .line 154
    .line 155
    .line 156
    const v14, 0x4186a3d7    # 16.83f

    .line 157
    .line 158
    .line 159
    const v15, 0x40de147b    # 6.94f

    .line 160
    .line 161
    .line 162
    const/high16 v16, 0x41a80000    # 21.0f

    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v17, 0x4098f5c3    # 4.78f

    .line 168
    .line 169
    .line 170
    const v18, -0x404e147b    # -1.39f

    .line 171
    .line 172
    .line 173
    const v13, 0x3fe147ae    # 1.76f

    .line 174
    .line 175
    .line 176
    const/4 v14, 0x0

    .line 177
    const v15, 0x4058f5c3    # 3.39f

    .line 178
    .line 179
    .line 180
    const v16, -0x40fae148    # -0.52f

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const v0, 0x40128f5c    # 2.29f

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v17, 0x3fb47ae1    # 1.41f

    .line 193
    .line 194
    .line 195
    const/16 v18, 0x0

    .line 196
    .line 197
    const v13, 0x3ec7ae14    # 0.39f

    .line 198
    .line 199
    .line 200
    const v14, 0x3ec7ae14    # 0.39f

    .line 201
    .line 202
    .line 203
    const v15, 0x3f828f5c    # 1.02f

    .line 204
    .line 205
    .line 206
    const v16, 0x3ec7ae14    # 0.39f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/4 v0, 0x0

    .line 213
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, 0x41a3eb85    # 20.49f

    .line 217
    .line 218
    .line 219
    const v18, 0x41a3eb85    # 20.49f

    .line 220
    .line 221
    .line 222
    const v13, 0x41a70a3d    # 20.88f

    .line 223
    .line 224
    .line 225
    const v14, 0x41ac147b    # 21.51f

    .line 226
    .line 227
    .line 228
    const v15, 0x41a70a3d    # 20.88f

    .line 229
    .line 230
    .line 231
    const v16, 0x41a70a3d    # 20.88f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v0, 0x412b851f    # 10.72f

    .line 241
    .line 242
    .line 243
    const v2, 0x41971eb8    # 18.89f

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, -0x3f4d70a4    # -5.58f

    .line 250
    .line 251
    .line 252
    const v18, -0x3f50f5c3    # -5.47f

    .line 253
    .line 254
    .line 255
    const v13, -0x3fce147b    # -2.78f

    .line 256
    .line 257
    .line 258
    const v14, -0x41051eb8    # -0.49f

    .line 259
    .line 260
    .line 261
    const v15, -0x3f5eb852    # -5.04f

    .line 262
    .line 263
    .line 264
    const v16, -0x3fd28f5c    # -2.71f

    .line 265
    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v17, 0x3f3851ec    # 0.72f

    .line 271
    .line 272
    .line 273
    const v18, -0x3f68a3d7    # -4.73f

    .line 274
    .line 275
    .line 276
    const v13, -0x4151eb85    # -0.34f

    .line 277
    .line 278
    .line 279
    const v14, -0x4023d70a    # -1.72f

    .line 280
    .line 281
    .line 282
    const v15, -0x430a3d71    # -0.03f

    .line 283
    .line 284
    .line 285
    const v16, -0x3fa8f5c3    # -3.36f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v0, 0x41175c29    # 9.46f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x412b851f    # 10.72f

    .line 298
    .line 299
    .line 300
    const v18, 0x41971eb8    # 18.89f

    .line 301
    .line 302
    .line 303
    const v13, 0x415fae14    # 13.98f

    .line 304
    .line 305
    .line 306
    const v14, 0x4196f5c3    # 18.87f

    .line 307
    .line 308
    .line 309
    const v15, 0x41466666    # 12.4f

    .line 310
    .line 311
    .line 312
    const v16, 0x419970a4    # 19.18f

    .line 313
    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v0, 0x41000000    # 8.0f

    .line 322
    .line 323
    const/high16 v2, 0x41500000    # 13.0f

    .line 324
    .line 325
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v0, 0x400ae148    # 2.17f

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v0, -0x40000000    # -2.0f

    .line 335
    .line 336
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v0, 0x41000000    # 8.0f

    .line 340
    .line 341
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v17, 0x3f800000    # 1.0f

    .line 345
    .line 346
    const/high16 v18, -0x40800000    # -1.0f

    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    const v14, -0x40f33333    # -0.55f

    .line 350
    .line 351
    .line 352
    const v15, 0x3ee66666    # 0.45f

    .line 353
    .line 354
    .line 355
    const/high16 v16, -0x40800000    # -1.0f

    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v0, 0x40ee6666    # 7.45f

    .line 361
    .line 362
    .line 363
    const/high16 v2, 0x41000000    # 8.0f

    .line 364
    .line 365
    const/high16 v4, 0x41500000    # 13.0f

    .line 366
    .line 367
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x41a5c28f    # 20.72f

    .line 374
    .line 375
    .line 376
    const v2, 0x4163ae14    # 14.23f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, -0x40733333    # -1.1f

    .line 383
    .line 384
    .line 385
    const v18, 0x40233333    # 2.55f

    .line 386
    .line 387
    .line 388
    const v13, -0x41947ae1    # -0.23f

    .line 389
    .line 390
    .line 391
    const v14, 0x3f6b851f    # 0.92f

    .line 392
    .line 393
    .line 394
    const v15, -0x40e3d70a    # -0.61f

    .line 395
    .line 396
    .line 397
    const v16, 0x3fe28f5c    # 1.77f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v0, -0x4043d70a    # -1.47f

    .line 404
    .line 405
    .line 406
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v17, 0x3f2147ae    # 0.63f

    .line 410
    .line 411
    .line 412
    const v18, -0x40347ae1    # -1.59f

    .line 413
    .line 414
    .line 415
    const v13, 0x3e8a3d71    # 0.27f

    .line 416
    .line 417
    .line 418
    const/high16 v14, -0x41000000    # -0.5f

    .line 419
    .line 420
    const v15, 0x3efae148    # 0.49f

    .line 421
    .line 422
    .line 423
    const v16, -0x407c28f6    # -1.03f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, 0x419dd70a    # 19.73f

    .line 430
    .line 431
    .line 432
    const/high16 v18, 0x41500000    # 13.0f

    .line 433
    .line 434
    const v13, 0x41971eb8    # 18.89f

    .line 435
    .line 436
    .line 437
    const v14, 0x4154cccd    # 13.3f

    .line 438
    .line 439
    .line 440
    const v15, 0x419a51ec    # 19.29f

    .line 441
    .line 442
    .line 443
    const/high16 v16, 0x41500000    # 13.0f

    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/4 v0, 0x0

    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const v17, 0x41a5c28f    # 20.72f

    .line 453
    .line 454
    .line 455
    const v18, 0x4163ae14    # 14.23f

    .line 456
    .line 457
    .line 458
    const v13, 0x41a30a3d    # 20.38f

    .line 459
    .line 460
    .line 461
    const/high16 v14, 0x41500000    # 13.0f

    .line 462
    .line 463
    const v15, 0x41a70a3d    # 20.88f

    .line 464
    .line 465
    .line 466
    const v16, 0x4159c28f    # 13.61f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const v0, 0x408d1eb8    # 4.41f

    .line 476
    .line 477
    .line 478
    const v2, 0x40e7ae14    # 7.24f

    .line 479
    .line 480
    .line 481
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v17, 0x40a00000    # 5.0f

    .line 485
    .line 486
    const v18, -0x404b851f    # -1.41f

    .line 487
    .line 488
    .line 489
    const v13, 0x3fbae148    # 1.46f

    .line 490
    .line 491
    .line 492
    const v14, -0x4091eb85    # -0.93f

    .line 493
    .line 494
    .line 495
    const v15, 0x404b851f    # 3.18f

    .line 496
    .line 497
    .line 498
    const v16, -0x40466666    # -1.45f

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const v17, 0x40d33333    # 6.6f

    .line 505
    .line 506
    .line 507
    const v18, 0x404a3d71    # 3.16f

    .line 508
    .line 509
    .line 510
    const v13, 0x4029999a    # 2.65f

    .line 511
    .line 512
    .line 513
    const v14, 0x3d8f5c29    # 0.07f

    .line 514
    .line 515
    .line 516
    const/high16 v15, 0x40a00000    # 5.0f

    .line 517
    .line 518
    const v16, 0x3fa3d70a    # 1.28f

    .line 519
    .line 520
    .line 521
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v0, 0x3fa7ae14    # 1.31f

    .line 525
    .line 526
    .line 527
    const v2, -0x405851ec    # -1.31f

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v17, 0x41a80000    # 21.0f

    .line 534
    .line 535
    const v18, 0x40a6b852    # 5.21f

    .line 536
    .line 537
    .line 538
    const v13, 0x41a3ae14    # 20.46f

    .line 539
    .line 540
    .line 541
    const v14, 0x409147ae    # 4.54f

    .line 542
    .line 543
    .line 544
    const/high16 v15, 0x41a80000    # 21.0f

    .line 545
    .line 546
    const v16, 0x409851ec    # 4.76f

    .line 547
    .line 548
    .line 549
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v0, 0x41180000    # 9.5f

    .line 553
    .line 554
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    const/high16 v17, -0x41000000    # -0.5f

    .line 558
    .line 559
    const/high16 v18, 0x3f000000    # 0.5f

    .line 560
    .line 561
    const/4 v13, 0x0

    .line 562
    const v14, 0x3e8f5c29    # 0.28f

    .line 563
    .line 564
    .line 565
    const v15, -0x419eb852    # -0.22f

    .line 566
    .line 567
    .line 568
    const/high16 v16, 0x3f000000    # 0.5f

    .line 569
    .line 570
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    const v0, -0x3f76b852    # -4.29f

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const v17, -0x414ccccd    # -0.35f

    .line 580
    .line 581
    .line 582
    const v18, -0x40a66666    # -0.85f

    .line 583
    .line 584
    .line 585
    const v13, -0x4119999a    # -0.45f

    .line 586
    .line 587
    .line 588
    const/4 v14, 0x0

    .line 589
    const v15, -0x40d47ae1    # -0.67f

    .line 590
    .line 591
    .line 592
    const v16, -0x40f5c28f    # -0.54f

    .line 593
    .line 594
    .line 595
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const v0, 0x3fc66666    # 1.55f

    .line 599
    .line 600
    .line 601
    const v2, -0x4039999a    # -1.55f

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const/high16 v17, 0x41400000    # 12.0f

    .line 608
    .line 609
    const/high16 v18, 0x40a00000    # 5.0f

    .line 610
    .line 611
    const v13, 0x4180f5c3    # 16.12f

    .line 612
    .line 613
    .line 614
    const v14, 0x40c0a3d7    # 6.02f

    .line 615
    .line 616
    .line 617
    const v15, 0x4162e148    # 14.18f

    .line 618
    .line 619
    .line 620
    const/high16 v16, 0x40a00000    # 5.0f

    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const v17, -0x3fab851f    # -3.32f

    .line 626
    .line 627
    .line 628
    const v18, 0x3f59999a    # 0.85f

    .line 629
    .line 630
    .line 631
    const v13, -0x40666666    # -1.2f

    .line 632
    .line 633
    .line 634
    const/4 v14, 0x0

    .line 635
    const v15, -0x3feae148    # -2.33f

    .line 636
    .line 637
    .line 638
    const v16, 0x3e9eb852    # 0.31f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, 0x408d1eb8    # 4.41f

    .line 645
    .line 646
    .line 647
    const v2, 0x40e7ae14    # 7.24f

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    const/16 v16, 0x3800

    .line 661
    .line 662
    const/16 v17, 0x0

    .line 663
    .line 664
    const/high16 v6, 0x3f800000    # 1.0f

    .line 665
    .line 666
    const/high16 v8, 0x3f800000    # 1.0f

    .line 667
    .line 668
    const/4 v7, 0x0

    .line 669
    const/high16 v9, 0x3f800000    # 1.0f

    .line 670
    .line 671
    const/high16 v12, 0x3f800000    # 1.0f

    .line 672
    .line 673
    const/4 v13, 0x0

    .line 674
    const/4 v15, 0x0

    .line 675
    const-string v4, ""

    .line 676
    .line 677
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    sput-object v0, Landroidx/compose/material/icons/rounded/UpdateDisabledKt;->_updateDisabled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 686
    .line 687
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/LocalCarWashKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalCarWash(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/LocalCarWashKt;->_localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.LocalCarWash"

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
    const/high16 v0, 0x41880000    # 17.0f

    .line 71
    .line 72
    const/high16 v2, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    const/high16 v18, -0x40400000    # -1.5f

    .line 80
    .line 81
    const v13, 0x3f547ae1    # 0.83f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 86
    .line 87
    const v16, -0x40d47ae1    # -0.67f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, -0x4071eb85    # -1.11f

    .line 94
    .line 95
    .line 96
    const v18, -0x3ff1eb85    # -2.22f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, -0x40d70a3d    # -0.66f

    .line 101
    .line 102
    .line 103
    const v15, -0x40d70a3d    # -0.66f

    .line 104
    .line 105
    .line 106
    const v16, -0x402e147b    # -1.64f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v17, -0x40b5c28f    # -0.79f

    .line 113
    .line 114
    .line 115
    const/16 v18, 0x0

    .line 116
    .line 117
    const v13, -0x41b33333    # -0.2f

    .line 118
    .line 119
    .line 120
    const v14, -0x417ae148    # -0.26f

    .line 121
    .line 122
    .line 123
    const v15, -0x40e8f5c3    # -0.59f

    .line 124
    .line 125
    .line 126
    const v16, -0x417ae148    # -0.26f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v17, -0x40733333    # -1.1f

    .line 133
    .line 134
    .line 135
    const v18, 0x400e147b    # 2.22f

    .line 136
    .line 137
    .line 138
    const v13, -0x411eb852    # -0.44f

    .line 139
    .line 140
    .line 141
    const v14, 0x3f147ae1    # 0.58f

    .line 142
    .line 143
    .line 144
    const v15, -0x40733333    # -1.1f

    .line 145
    .line 146
    .line 147
    const v16, 0x3fc7ae14    # 1.56f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 154
    .line 155
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const v14, 0x3f547ae1    # 0.83f

    .line 159
    .line 160
    .line 161
    const v15, 0x3f2b851f    # 0.67f

    .line 162
    .line 163
    .line 164
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 165
    .line 166
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v0, 0x41400000    # 12.0f

    .line 173
    .line 174
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v18, -0x40400000    # -1.5f

    .line 178
    .line 179
    const v13, 0x3f547ae1    # 0.83f

    .line 180
    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 184
    .line 185
    const v16, -0x40d47ae1    # -0.67f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v17, -0x4071eb85    # -1.11f

    .line 192
    .line 193
    .line 194
    const v18, -0x3ff1eb85    # -2.22f

    .line 195
    .line 196
    .line 197
    const/4 v13, 0x0

    .line 198
    const v14, -0x40d70a3d    # -0.66f

    .line 199
    .line 200
    .line 201
    const v15, -0x40d70a3d    # -0.66f

    .line 202
    .line 203
    .line 204
    const v16, -0x402e147b    # -1.64f

    .line 205
    .line 206
    .line 207
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v17, -0x40b5c28f    # -0.79f

    .line 211
    .line 212
    .line 213
    const/16 v18, 0x0

    .line 214
    .line 215
    const v13, -0x41b33333    # -0.2f

    .line 216
    .line 217
    .line 218
    const v14, -0x417ae148    # -0.26f

    .line 219
    .line 220
    .line 221
    const v15, -0x40e8f5c3    # -0.59f

    .line 222
    .line 223
    .line 224
    const v16, -0x417ae148    # -0.26f

    .line 225
    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, -0x40733333    # -1.1f

    .line 231
    .line 232
    .line 233
    const v18, 0x400e147b    # 2.22f

    .line 234
    .line 235
    .line 236
    const v13, -0x411eb852    # -0.44f

    .line 237
    .line 238
    .line 239
    const v14, 0x3f147ae1    # 0.58f

    .line 240
    .line 241
    .line 242
    const v15, -0x40733333    # -1.1f

    .line 243
    .line 244
    .line 245
    const v16, 0x3fc7ae14    # 1.56f

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 252
    .line 253
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const v14, 0x3f547ae1    # 0.83f

    .line 257
    .line 258
    .line 259
    const v15, 0x3f2b851f    # 0.67f

    .line 260
    .line 261
    .line 262
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 263
    .line 264
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x40e00000    # 7.0f

    .line 271
    .line 272
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v18, -0x40400000    # -1.5f

    .line 276
    .line 277
    const v13, 0x3f547ae1    # 0.83f

    .line 278
    .line 279
    .line 280
    const/4 v14, 0x0

    .line 281
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 282
    .line 283
    const v16, -0x40d47ae1    # -0.67f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, -0x4071eb85    # -1.11f

    .line 290
    .line 291
    .line 292
    const v18, -0x3ff1eb85    # -2.22f

    .line 293
    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    const v14, -0x40d70a3d    # -0.66f

    .line 297
    .line 298
    .line 299
    const v15, -0x40d70a3d    # -0.66f

    .line 300
    .line 301
    .line 302
    const v16, -0x402e147b    # -1.64f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x40b5c28f    # -0.79f

    .line 309
    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    const v13, -0x41b33333    # -0.2f

    .line 314
    .line 315
    .line 316
    const v14, -0x417ae148    # -0.26f

    .line 317
    .line 318
    .line 319
    const v15, -0x40e8f5c3    # -0.59f

    .line 320
    .line 321
    .line 322
    const v16, -0x417ae148    # -0.26f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, -0x40733333    # -1.1f

    .line 329
    .line 330
    .line 331
    const v18, 0x400e147b    # 2.22f

    .line 332
    .line 333
    .line 334
    const v13, -0x411eb852    # -0.44f

    .line 335
    .line 336
    .line 337
    const v14, 0x3f147ae1    # 0.58f

    .line 338
    .line 339
    .line 340
    const v15, -0x40733333    # -1.1f

    .line 341
    .line 342
    .line 343
    const v16, 0x3fc7ae14    # 1.56f

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v17, 0x40e00000    # 7.0f

    .line 350
    .line 351
    const/high16 v18, 0x40a00000    # 5.0f

    .line 352
    .line 353
    const/high16 v13, 0x40b00000    # 5.5f

    .line 354
    .line 355
    const v14, 0x408a8f5c    # 4.33f

    .line 356
    .line 357
    .line 358
    const v15, 0x40c570a4    # 6.17f

    .line 359
    .line 360
    .line 361
    const/high16 v16, 0x40a00000    # 5.0f

    .line 362
    .line 363
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, 0x41975c29    # 18.92f

    .line 370
    .line 371
    .line 372
    const v2, 0x410028f6    # 8.01f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v17, 0x418c0000    # 17.5f

    .line 379
    .line 380
    const/high16 v18, 0x40e00000    # 7.0f

    .line 381
    .line 382
    const v13, 0x4195c28f    # 18.72f

    .line 383
    .line 384
    .line 385
    const v14, 0x40ed70a4    # 7.42f

    .line 386
    .line 387
    .line 388
    const v15, 0x419147ae    # 18.16f

    .line 389
    .line 390
    .line 391
    const/high16 v16, 0x40e00000    # 7.0f

    .line 392
    .line 393
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const/high16 v0, -0x3ed00000    # -11.0f

    .line 397
    .line 398
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v17, -0x404a3d71    # -1.42f

    .line 402
    .line 403
    .line 404
    const v18, 0x3f8147ae    # 1.01f

    .line 405
    .line 406
    .line 407
    const v13, -0x40d70a3d    # -0.66f

    .line 408
    .line 409
    .line 410
    const/4 v14, 0x0

    .line 411
    const v15, -0x40651eb8    # -1.21f

    .line 412
    .line 413
    .line 414
    const v16, 0x3ed70a3d    # 0.42f

    .line 415
    .line 416
    .line 417
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v0, 0x40b570a4    # 5.67f

    .line 421
    .line 422
    .line 423
    const v2, -0x4003d70a    # -1.97f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, -0x421eb852    # -0.11f

    .line 430
    .line 431
    .line 432
    const v18, 0x3f28f5c3    # 0.66f

    .line 433
    .line 434
    .line 435
    const v13, -0x4270a3d7    # -0.07f

    .line 436
    .line 437
    .line 438
    const v14, 0x3e570a3d    # 0.21f

    .line 439
    .line 440
    .line 441
    const v15, -0x421eb852    # -0.11f

    .line 442
    .line 443
    .line 444
    const v16, 0x3edc28f6    # 0.43f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x40e51eb8    # 7.16f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 457
    .line 458
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 459
    .line 460
    const/4 v13, 0x0

    .line 461
    const v14, 0x3f547ae1    # 0.83f

    .line 462
    .line 463
    .line 464
    const v15, 0x3f2b851f    # 0.67f

    .line 465
    .line 466
    .line 467
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x41b2a3d7    # 22.33f

    .line 473
    .line 474
    .line 475
    const/high16 v2, 0x41ac0000    # 21.5f

    .line 476
    .line 477
    const/high16 v4, 0x40c00000    # 6.0f

    .line 478
    .line 479
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v0, 0x41a80000    # 21.0f

    .line 483
    .line 484
    const/high16 v2, 0x40c00000    # 6.0f

    .line 485
    .line 486
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x41400000    # 12.0f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v0, 0x3f000000    # 0.5f

    .line 495
    .line 496
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v14, 0x3f51eb85    # 0.82f

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v18, -0x40400000    # -1.5f

    .line 506
    .line 507
    const v13, 0x3f51eb85    # 0.82f

    .line 508
    .line 509
    .line 510
    const/4 v14, 0x0

    .line 511
    const/high16 v15, 0x3fc00000    # 1.5f

    .line 512
    .line 513
    const v16, -0x40d47ae1    # -0.67f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, -0x3f1ae148    # -7.16f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, -0x421eb852    # -0.11f

    .line 526
    .line 527
    .line 528
    const v18, -0x40d70a3d    # -0.66f

    .line 529
    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    const v14, -0x419eb852    # -0.22f

    .line 533
    .line 534
    .line 535
    const v15, -0x42dc28f6    # -0.04f

    .line 536
    .line 537
    .line 538
    const v16, -0x4119999a    # -0.45f

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    const v0, -0x3f4a8f5c    # -5.67f

    .line 545
    .line 546
    .line 547
    const v2, -0x4003d70a    # -1.97f

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x40d00000    # 6.5f

    .line 557
    .line 558
    const/high16 v2, 0x41900000    # 18.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, -0x40400000    # -1.5f

    .line 564
    .line 565
    const/high16 v18, -0x40400000    # -1.5f

    .line 566
    .line 567
    const v13, -0x40ab851f    # -0.83f

    .line 568
    .line 569
    .line 570
    const/4 v14, 0x0

    .line 571
    const/high16 v15, -0x40400000    # -1.5f

    .line 572
    .line 573
    const v16, -0x40d47ae1    # -0.67f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x41700000    # 15.0f

    .line 580
    .line 581
    const v2, 0x40b570a4    # 5.67f

    .line 582
    .line 583
    .line 584
    const/high16 v4, 0x40d00000    # 6.5f

    .line 585
    .line 586
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const v0, 0x3f2b851f    # 0.67f

    .line 590
    .line 591
    .line 592
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 593
    .line 594
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v0, 0x40ea8f5c    # 7.33f

    .line 598
    .line 599
    .line 600
    const/high16 v2, 0x40d00000    # 6.5f

    .line 601
    .line 602
    const/high16 v4, 0x41900000    # 18.0f

    .line 603
    .line 604
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v0, 0x418c0000    # 17.5f

    .line 611
    .line 612
    const/high16 v2, 0x41900000    # 18.0f

    .line 613
    .line 614
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, -0x40400000    # -1.5f

    .line 621
    .line 622
    const v2, 0x3f2b851f    # 0.67f

    .line 623
    .line 624
    .line 625
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 626
    .line 627
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x3f2b851f    # 0.67f

    .line 631
    .line 632
    .line 633
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 634
    .line 635
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v0, -0x40d47ae1    # -0.67f

    .line 639
    .line 640
    .line 641
    const/high16 v2, -0x40400000    # -1.5f

    .line 642
    .line 643
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v0, 0x41500000    # 13.0f

    .line 650
    .line 651
    const/high16 v2, 0x40a00000    # 5.0f

    .line 652
    .line 653
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, 0x3fa28f5c    # 1.27f

    .line 657
    .line 658
    .line 659
    const v2, -0x3f8b851f    # -3.82f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v17, 0x3f733333    # 0.95f

    .line 666
    .line 667
    .line 668
    const v18, -0x40d1eb85    # -0.68f

    .line 669
    .line 670
    .line 671
    const v13, 0x3e0f5c29    # 0.14f

    .line 672
    .line 673
    .line 674
    const v14, -0x41333333    # -0.4f

    .line 675
    .line 676
    .line 677
    const v15, 0x3f051eb8    # 0.52f

    .line 678
    .line 679
    .line 680
    const v16, -0x40d1eb85    # -0.68f

    .line 681
    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const v0, 0x4118f5c3    # 9.56f

    .line 687
    .line 688
    .line 689
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v18, 0x3f2e147b    # 0.68f

    .line 693
    .line 694
    .line 695
    const v13, 0x3edc28f6    # 0.43f

    .line 696
    .line 697
    .line 698
    const/4 v14, 0x0

    .line 699
    const v15, 0x3f4f5c29    # 0.81f

    .line 700
    .line 701
    .line 702
    const v16, 0x3e8f5c29    # 0.28f

    .line 703
    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v0, 0x41980000    # 19.0f

    .line 709
    .line 710
    const/high16 v2, 0x41500000    # 13.0f

    .line 711
    .line 712
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v0, 0x41500000    # 13.0f

    .line 716
    .line 717
    const/high16 v2, 0x40a00000    # 5.0f

    .line 718
    .line 719
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/4 v15, 0x0

    .line 744
    const-string v4, ""

    .line 745
    .line 746
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    sput-object v0, Landroidx/compose/material/icons/rounded/LocalCarWashKt;->_localCarWash:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 755
    .line 756
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    return-object v0
.end method

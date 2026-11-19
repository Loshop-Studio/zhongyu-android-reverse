.class public final Landroidx/compose/material/icons/rounded/AdsClickKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _adsClick:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAdsClick(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AdsClickKt;->_adsClick:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AdsClick"

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
    const v0, 0x418feb85    # 17.99f

    .line 71
    .line 72
    .line 73
    const v2, 0x413b5c29    # 11.71f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v17, 0x40c00000    # 6.0f

    .line 80
    .line 81
    const/high16 v18, 0x41400000    # 12.0f

    .line 82
    .line 83
    const v13, 0x41087ae1    # 8.53f

    .line 84
    .line 85
    .line 86
    const v14, 0x418eb852    # 17.84f

    .line 87
    .line 88
    .line 89
    const/high16 v15, 0x40c00000    # 6.0f

    .line 90
    .line 91
    const v16, 0x4173851f    # 15.22f

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v18, -0x3f400000    # -6.0f

    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, -0x3fac28f6    # -3.31f

    .line 101
    .line 102
    .line 103
    const v15, 0x402c28f6    # 2.69f

    .line 104
    .line 105
    .line 106
    const/high16 v16, -0x3f400000    # -6.0f

    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v17, 0x40bfae14    # 5.99f

    .line 112
    .line 113
    .line 114
    const v18, 0x40b6b852    # 5.71f

    .line 115
    .line 116
    .line 117
    const v13, 0x404e147b    # 3.22f

    .line 118
    .line 119
    .line 120
    const/4 v14, 0x0

    .line 121
    const v15, 0x40bae148    # 5.84f

    .line 122
    .line 123
    .line 124
    const v16, 0x4021eb85    # 2.53f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v0, -0x3ff9999a    # -2.1f

    .line 131
    .line 132
    .line 133
    const v2, -0x40deb852    # -0.63f

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v17, 0x41400000    # 12.0f

    .line 140
    .line 141
    const/high16 v18, 0x41000000    # 8.0f

    .line 142
    .line 143
    const v13, 0x4177ae14    # 15.48f

    .line 144
    .line 145
    .line 146
    const v14, 0x4114f5c3    # 9.31f

    .line 147
    .line 148
    .line 149
    const v15, 0x415e3d71    # 13.89f

    .line 150
    .line 151
    .line 152
    const/high16 v16, 0x41000000    # 8.0f

    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, -0x3f800000    # -4.0f

    .line 158
    .line 159
    const/high16 v18, 0x40800000    # 4.0f

    .line 160
    .line 161
    const v13, -0x3ff28f5c    # -2.21f

    .line 162
    .line 163
    .line 164
    const/4 v14, 0x0

    .line 165
    const/high16 v15, -0x3f800000    # -4.0f

    .line 166
    .line 167
    const v16, 0x3fe51eb8    # 1.79f

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v17, 0x40451eb8    # 3.08f

    .line 174
    .line 175
    .line 176
    const v18, 0x4078f5c3    # 3.89f

    .line 177
    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    const v14, 0x3ff1eb85    # 1.89f

    .line 181
    .line 182
    .line 183
    const v15, 0x3fa7ae14    # 1.31f

    .line 184
    .line 185
    .line 186
    const v16, 0x405eb852    # 3.48f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x418feb85    # 17.99f

    .line 193
    .line 194
    .line 195
    const v2, 0x413b5c29    # 11.71f

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, 0x41400000    # 12.0f

    .line 205
    .line 206
    const/high16 v2, 0x41b00000    # 22.0f

    .line 207
    .line 208
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const v17, -0x42dc28f6    # -0.04f

    .line 212
    .line 213
    .line 214
    const v18, 0x3f666666    # 0.9f

    .line 215
    .line 216
    .line 217
    const v14, 0x3e99999a    # 0.3f

    .line 218
    .line 219
    .line 220
    const v15, -0x43dc28f6    # -0.01f

    .line 221
    .line 222
    .line 223
    const v16, 0x3f19999a    # 0.6f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, -0x4003d70a    # -1.97f

    .line 230
    .line 231
    .line 232
    const v2, -0x40e8f5c3    # -0.59f

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v17, 0x41a00000    # 20.0f

    .line 239
    .line 240
    const/high16 v18, 0x41400000    # 12.0f

    .line 241
    .line 242
    const/high16 v13, 0x41a00000    # 20.0f

    .line 243
    .line 244
    const v14, 0x41435c29    # 12.21f

    .line 245
    .line 246
    .line 247
    const/high16 v15, 0x41a00000    # 20.0f

    .line 248
    .line 249
    const v16, 0x4141999a    # 12.1f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, -0x3f000000    # -8.0f

    .line 256
    .line 257
    const/high16 v18, -0x3f000000    # -8.0f

    .line 258
    .line 259
    const/4 v13, 0x0

    .line 260
    const v14, -0x3f728f5c    # -4.42f

    .line 261
    .line 262
    .line 263
    const v15, -0x3f9ae148    # -3.58f

    .line 264
    .line 265
    .line 266
    const/high16 v16, -0x3f000000    # -8.0f

    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v0, 0x40651eb8    # 3.58f

    .line 272
    .line 273
    .line 274
    const/high16 v2, -0x3f000000    # -8.0f

    .line 275
    .line 276
    const/high16 v4, 0x41000000    # 8.0f

    .line 277
    .line 278
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v2, 0x41000000    # 8.0f

    .line 282
    .line 283
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, 0x3e9eb852    # 0.31f

    .line 287
    .line 288
    .line 289
    const v18, -0x43dc28f6    # -0.01f

    .line 290
    .line 291
    .line 292
    const v13, 0x3dcccccd    # 0.1f

    .line 293
    .line 294
    .line 295
    const/4 v14, 0x0

    .line 296
    const v15, 0x3e570a3d    # 0.21f

    .line 297
    .line 298
    .line 299
    const/16 v16, 0x0

    .line 300
    .line 301
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v0, 0x3f170a3d    # 0.59f

    .line 305
    .line 306
    .line 307
    const v2, 0x3ffc28f6    # 1.97f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v17, 0x41400000    # 12.0f

    .line 314
    .line 315
    const/high16 v18, 0x41b00000    # 22.0f

    .line 316
    .line 317
    const v13, 0x4149999a    # 12.6f

    .line 318
    .line 319
    .line 320
    const v14, 0x41afeb85    # 21.99f

    .line 321
    .line 322
    .line 323
    const v15, 0x4144cccd    # 12.3f

    .line 324
    .line 325
    .line 326
    const/high16 v16, 0x41b00000    # 22.0f

    .line 327
    .line 328
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v17, 0x40000000    # 2.0f

    .line 332
    .line 333
    const/high16 v18, 0x41400000    # 12.0f

    .line 334
    .line 335
    const v13, 0x40cf5c29    # 6.48f

    .line 336
    .line 337
    .line 338
    const/high16 v14, 0x41b00000    # 22.0f

    .line 339
    .line 340
    const/high16 v15, 0x40000000    # 2.0f

    .line 341
    .line 342
    const v16, 0x418c28f6    # 17.52f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const/high16 v17, 0x41400000    # 12.0f

    .line 349
    .line 350
    const/high16 v18, 0x40000000    # 2.0f

    .line 351
    .line 352
    const/high16 v13, 0x40000000    # 2.0f

    .line 353
    .line 354
    const v14, 0x40cf5c29    # 6.48f

    .line 355
    .line 356
    .line 357
    const v15, 0x40cf5c29    # 6.48f

    .line 358
    .line 359
    .line 360
    const/high16 v16, 0x40000000    # 2.0f

    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const v0, 0x40cf5c29    # 6.48f

    .line 366
    .line 367
    .line 368
    const/high16 v2, 0x41400000    # 12.0f

    .line 369
    .line 370
    const/high16 v4, 0x41b00000    # 22.0f

    .line 371
    .line 372
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, 0x4182147b    # 16.26f

    .line 379
    .line 380
    .line 381
    const v2, 0x4191d70a    # 18.23f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v0, 0x401147ae    # 2.27f

    .line 388
    .line 389
    .line 390
    const v2, -0x40bd70a4    # -0.76f

    .line 391
    .line 392
    .line 393
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    .line 396
    const v17, -0x43dc28f6    # -0.01f

    .line 397
    .line 398
    .line 399
    const v18, -0x408ccccd    # -0.95f

    .line 400
    .line 401
    .line 402
    const v13, 0x3eeb851f    # 0.46f

    .line 403
    .line 404
    .line 405
    const v14, -0x41e66666    # -0.15f

    .line 406
    .line 407
    .line 408
    const v15, 0x3ee66666    # 0.45f

    .line 409
    .line 410
    .line 411
    const v16, -0x40b0a3d7    # -0.81f

    .line 412
    .line 413
    .line 414
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const v0, -0x3f0ccccd    # -7.6f

    .line 418
    .line 419
    .line 420
    const v2, -0x3fee147b    # -2.28f

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 424
    .line 425
    .line 426
    const v17, -0x40e147ae    # -0.62f

    .line 427
    .line 428
    .line 429
    const v18, 0x3f1eb852    # 0.62f

    .line 430
    .line 431
    .line 432
    const v13, -0x413d70a4    # -0.38f

    .line 433
    .line 434
    .line 435
    const v14, -0x421eb852    # -0.11f

    .line 436
    .line 437
    .line 438
    const v15, -0x40c28f5c    # -0.74f

    .line 439
    .line 440
    .line 441
    const v16, 0x3e75c28f    # 0.24f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x4011eb85    # 2.28f

    .line 448
    .line 449
    .line 450
    const v2, 0x40f33333    # 7.6f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, 0x3f733333    # 0.95f

    .line 457
    .line 458
    .line 459
    const v18, 0x3c23d70a    # 0.01f

    .line 460
    .line 461
    .line 462
    const v13, 0x3e0f5c29    # 0.14f

    .line 463
    .line 464
    .line 465
    const v14, 0x3ef0a3d7    # 0.47f

    .line 466
    .line 467
    .line 468
    const v15, 0x3f4ccccd    # 0.8f

    .line 469
    .line 470
    .line 471
    const v16, 0x3ef5c28f    # 0.48f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const v0, 0x3f428f5c    # 0.76f

    .line 478
    .line 479
    .line 480
    const v2, -0x3feeb852    # -2.27f

    .line 481
    .line 482
    .line 483
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 484
    .line 485
    .line 486
    const v0, 0x407a3d71    # 3.91f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x3f35c28f    # 0.71f

    .line 493
    .line 494
    .line 495
    const/16 v18, 0x0

    .line 496
    .line 497
    const v13, 0x3e4ccccd    # 0.2f

    .line 498
    .line 499
    .line 500
    const v14, 0x3e4ccccd    # 0.2f

    .line 501
    .line 502
    .line 503
    const v15, 0x3f028f5c    # 0.51f

    .line 504
    .line 505
    .line 506
    const v16, 0x3e4ccccd    # 0.2f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x3fa28f5c    # 1.27f

    .line 513
    .line 514
    .line 515
    const v2, -0x405d70a4    # -1.27f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/16 v17, 0x0

    .line 522
    .line 523
    const v18, -0x40ca3d71    # -0.71f

    .line 524
    .line 525
    .line 526
    const v14, -0x41b33333    # -0.2f

    .line 527
    .line 528
    .line 529
    const v15, 0x3e4ccccd    # 0.2f

    .line 530
    .line 531
    .line 532
    const v16, -0x40fd70a4    # -0.51f

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x4182147b    # 16.26f

    .line 539
    .line 540
    .line 541
    const v2, 0x4191d70a    # 18.23f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    const/16 v16, 0x3800

    .line 555
    .line 556
    const/16 v17, 0x0

    .line 557
    .line 558
    const/high16 v6, 0x3f800000    # 1.0f

    .line 559
    .line 560
    const/high16 v8, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/4 v7, 0x0

    .line 563
    const/high16 v9, 0x3f800000    # 1.0f

    .line 564
    .line 565
    const/high16 v12, 0x3f800000    # 1.0f

    .line 566
    .line 567
    const/4 v13, 0x0

    .line 568
    const/4 v14, 0x0

    .line 569
    const/4 v15, 0x0

    .line 570
    const-string v4, ""

    .line 571
    .line 572
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    sput-object v0, Landroidx/compose/material/icons/rounded/AdsClickKt;->_adsClick:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 581
    .line 582
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/outlined/SportsBasketballKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _sportsBasketball:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSportsBasketball(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SportsBasketballKt;->_sportsBasketball:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.SportsBasketball"

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
    const/high16 v17, 0x41200000    # 10.0f

    .line 95
    .line 96
    const/high16 v18, 0x41200000    # 10.0f

    .line 97
    .line 98
    const/4 v13, 0x0

    .line 99
    const v14, 0x40b0a3d7    # 5.52f

    .line 100
    .line 101
    .line 102
    const v15, 0x408f5c29    # 4.48f

    .line 103
    .line 104
    .line 105
    const/high16 v16, 0x41200000    # 10.0f

    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v0, -0x3f70a3d7    # -4.48f

    .line 111
    .line 112
    .line 113
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 114
    .line 115
    const/high16 v4, 0x41200000    # 10.0f

    .line 116
    .line 117
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, 0x41400000    # 12.0f

    .line 121
    .line 122
    const/high16 v18, 0x40000000    # 2.0f

    .line 123
    .line 124
    const/high16 v13, 0x41b00000    # 22.0f

    .line 125
    .line 126
    const v14, 0x40cf5c29    # 6.48f

    .line 127
    .line 128
    .line 129
    const v15, 0x418c28f6    # 17.52f

    .line 130
    .line 131
    .line 132
    const/high16 v16, 0x40000000    # 2.0f

    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x40a75c29    # 5.23f

    .line 141
    .line 142
    .line 143
    const/high16 v2, 0x40f80000    # 7.75f

    .line 144
    .line 145
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v17, 0x40dd1eb8    # 6.91f

    .line 149
    .line 150
    .line 151
    const/high16 v18, 0x41300000    # 11.0f

    .line 152
    .line 153
    const v13, 0x40c33333    # 6.1f

    .line 154
    .line 155
    .line 156
    const v14, 0x4109eb85    # 8.62f

    .line 157
    .line 158
    .line 159
    const v15, 0x40d66666    # 6.7f

    .line 160
    .line 161
    .line 162
    const v16, 0x411bd70a    # 9.74f

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v0, 0x40823d71    # 4.07f

    .line 169
    .line 170
    .line 171
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, 0x40a75c29    # 5.23f

    .line 175
    .line 176
    .line 177
    const/high16 v18, 0x40f80000    # 7.75f

    .line 178
    .line 179
    const v13, 0x40870a3d    # 4.22f

    .line 180
    .line 181
    .line 182
    const v14, 0x411d1eb8    # 9.82f

    .line 183
    .line 184
    .line 185
    const v15, 0x409428f6    # 4.63f

    .line 186
    .line 187
    .line 188
    const v16, 0x410b851f    # 8.72f

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v2, 0x41500000    # 13.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v0, 0x4035c28f    # 2.84f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, -0x4028f5c3    # -1.68f

    .line 209
    .line 210
    .line 211
    const/high16 v18, 0x40500000    # 3.25f

    .line 212
    .line 213
    const v13, -0x41a8f5c3    # -0.21f

    .line 214
    .line 215
    .line 216
    const v14, 0x3fa147ae    # 1.26f

    .line 217
    .line 218
    .line 219
    const v15, -0x40b0a3d7    # -0.81f

    .line 220
    .line 221
    .line 222
    const v16, 0x401851ec    # 2.38f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v17, 0x40823d71    # 4.07f

    .line 229
    .line 230
    .line 231
    const/high16 v18, 0x41500000    # 13.0f

    .line 232
    .line 233
    const v13, 0x409428f6    # 4.63f

    .line 234
    .line 235
    .line 236
    const v14, 0x41747ae1    # 15.28f

    .line 237
    .line 238
    .line 239
    const v15, 0x40870a3d    # 4.22f

    .line 240
    .line 241
    .line 242
    const v16, 0x4162e148    # 14.18f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const v0, 0x419f70a4    # 19.93f

    .line 252
    .line 253
    .line 254
    const/high16 v2, 0x41300000    # 11.0f

    .line 255
    .line 256
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, -0x3f7051ec    # -4.49f

    .line 260
    .line 261
    .line 262
    const v18, -0x3ff70a3d    # -2.14f

    .line 263
    .line 264
    .line 265
    const v13, -0x40228f5c    # -1.73f

    .line 266
    .line 267
    .line 268
    const v14, -0x419eb852    # -0.22f

    .line 269
    .line 270
    .line 271
    const v15, -0x3fad70a4    # -3.29f

    .line 272
    .line 273
    .line 274
    const/high16 v16, -0x40800000    # -1.0f

    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v17, 0x401ae148    # 2.42f

    .line 280
    .line 281
    .line 282
    const v18, -0x3f66b852    # -4.79f

    .line 283
    .line 284
    .line 285
    const v13, 0x3fa66666    # 1.3f

    .line 286
    .line 287
    .line 288
    const v14, -0x406147ae    # -1.24f

    .line 289
    .line 290
    .line 291
    const v15, 0x400c28f6    # 2.19f

    .line 292
    .line 293
    .line 294
    const v16, -0x3fc5c28f    # -2.91f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v0, 0x41300000    # 11.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x419f70a4    # 19.93f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, 0x41300000    # 11.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x410ee148    # 8.93f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x40d00000    # 6.5f

    .line 326
    .line 327
    const v18, 0x40c66666    # 6.2f

    .line 328
    .line 329
    .line 330
    const v13, 0x410b0a3d    # 8.69f

    .line 331
    .line 332
    .line 333
    const v14, 0x4111eb85    # 9.12f

    .line 334
    .line 335
    .line 336
    const v15, 0x40f9eb85    # 7.81f

    .line 337
    .line 338
    .line 339
    const v16, 0x40ee147b    # 7.44f

    .line 340
    .line 341
    .line 342
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, 0x41300000    # 11.0f

    .line 346
    .line 347
    const v18, 0x40823d71    # 4.07f

    .line 348
    .line 349
    .line 350
    const v13, 0x40f6b852    # 7.71f

    .line 351
    .line 352
    .line 353
    const v14, 0x40a1eb85    # 5.06f

    .line 354
    .line 355
    .line 356
    const v15, 0x411451ec    # 9.27f

    .line 357
    .line 358
    .line 359
    const v16, 0x408947ae    # 4.29f

    .line 360
    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x41300000    # 11.0f

    .line 366
    .line 367
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const v0, 0x419f70a4    # 19.93f

    .line 374
    .line 375
    .line 376
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, -0x3fca3d71    # -2.84f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const v17, 0x3fd70a3d    # 1.68f

    .line 386
    .line 387
    .line 388
    const/high16 v18, -0x3fb00000    # -3.25f

    .line 389
    .line 390
    const v13, 0x3e570a3d    # 0.21f

    .line 391
    .line 392
    .line 393
    const v14, -0x405eb852    # -1.26f

    .line 394
    .line 395
    .line 396
    const v15, 0x3f4f5c29    # 0.81f

    .line 397
    .line 398
    .line 399
    const v16, -0x3fe7ae14    # -2.38f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const v17, 0x419f70a4    # 19.93f

    .line 406
    .line 407
    .line 408
    const/high16 v18, 0x41300000    # 11.0f

    .line 409
    .line 410
    const v13, 0x419af5c3    # 19.37f

    .line 411
    .line 412
    .line 413
    const v14, 0x410b851f    # 8.72f

    .line 414
    .line 415
    .line 416
    const v15, 0x419e3d71    # 19.78f

    .line 417
    .line 418
    .line 419
    const v16, 0x411d1eb8    # 9.82f

    .line 420
    .line 421
    .line 422
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const v0, 0x40823d71    # 4.07f

    .line 429
    .line 430
    .line 431
    const/high16 v2, 0x41500000    # 13.0f

    .line 432
    .line 433
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const/high16 v17, 0x40900000    # 4.5f

    .line 437
    .line 438
    const v18, 0x400851ec    # 2.13f

    .line 439
    .line 440
    .line 441
    const v13, 0x3fdd70a4    # 1.73f

    .line 442
    .line 443
    .line 444
    const v14, 0x3e6147ae    # 0.22f

    .line 445
    .line 446
    .line 447
    const v15, 0x40528f5c    # 3.29f

    .line 448
    .line 449
    .line 450
    const v16, 0x3f7d70a4    # 0.99f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, -0x3fe47ae1    # -2.43f

    .line 457
    .line 458
    .line 459
    const v18, 0x4099999a    # 4.8f

    .line 460
    .line 461
    .line 462
    const v13, -0x405851ec    # -1.31f

    .line 463
    .line 464
    .line 465
    const v14, 0x3f9eb852    # 1.24f

    .line 466
    .line 467
    .line 468
    const v15, -0x3ff3d70a    # -2.19f

    .line 469
    .line 470
    .line 471
    const v16, 0x403ae148    # 2.92f

    .line 472
    .line 473
    .line 474
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 475
    .line 476
    .line 477
    const/high16 v0, 0x41500000    # 13.0f

    .line 478
    .line 479
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const v0, 0x40823d71    # 4.07f

    .line 483
    .line 484
    .line 485
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v0, 0x419f70a4    # 19.93f

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v0, 0x41500000    # 13.0f

    .line 498
    .line 499
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const v0, 0x40047ae1    # 2.07f

    .line 503
    .line 504
    .line 505
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v17, 0x401ae148    # 2.42f

    .line 509
    .line 510
    .line 511
    const v18, 0x409947ae    # 4.79f

    .line 512
    .line 513
    .line 514
    const v13, 0x3e75c28f    # 0.24f

    .line 515
    .line 516
    .line 517
    const v14, 0x3ff0a3d7    # 1.88f

    .line 518
    .line 519
    .line 520
    const v15, 0x3f8f5c29    # 1.12f

    .line 521
    .line 522
    .line 523
    const v16, 0x40633333    # 3.55f

    .line 524
    .line 525
    .line 526
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const/high16 v17, 0x41500000    # 13.0f

    .line 530
    .line 531
    const v18, 0x419f70a4    # 19.93f

    .line 532
    .line 533
    .line 534
    const v13, 0x418251ec    # 16.29f

    .line 535
    .line 536
    .line 537
    const v14, 0x419770a4    # 18.93f

    .line 538
    .line 539
    .line 540
    const v15, 0x416bae14    # 14.73f

    .line 541
    .line 542
    .line 543
    const v16, 0x419dae14    # 19.71f

    .line 544
    .line 545
    .line 546
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const v0, 0x419628f6    # 18.77f

    .line 553
    .line 554
    .line 555
    const/high16 v2, 0x41820000    # 16.25f

    .line 556
    .line 557
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v17, -0x4028f5c3    # -1.68f

    .line 561
    .line 562
    .line 563
    const/high16 v18, -0x3fb00000    # -3.25f

    .line 564
    .line 565
    const v13, -0x40a147ae    # -0.87f

    .line 566
    .line 567
    .line 568
    const v14, -0x40a3d70a    # -0.86f

    .line 569
    .line 570
    .line 571
    const v15, -0x40451eb8    # -1.46f

    .line 572
    .line 573
    .line 574
    const v16, -0x400147ae    # -1.99f

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const v0, 0x4035c28f    # 2.84f

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const v17, 0x419628f6    # 18.77f

    .line 587
    .line 588
    .line 589
    const/high16 v18, 0x41820000    # 16.25f

    .line 590
    .line 591
    const v13, 0x419e3d71    # 19.78f

    .line 592
    .line 593
    .line 594
    const v14, 0x4162e148    # 14.18f

    .line 595
    .line 596
    .line 597
    const v15, 0x419af5c3    # 19.37f

    .line 598
    .line 599
    .line 600
    const v16, 0x41747ae1    # 15.28f

    .line 601
    .line 602
    .line 603
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    const/16 v16, 0x3800

    .line 614
    .line 615
    const/16 v17, 0x0

    .line 616
    .line 617
    const/high16 v6, 0x3f800000    # 1.0f

    .line 618
    .line 619
    const/high16 v8, 0x3f800000    # 1.0f

    .line 620
    .line 621
    const/4 v7, 0x0

    .line 622
    const/high16 v9, 0x3f800000    # 1.0f

    .line 623
    .line 624
    const/high16 v12, 0x3f800000    # 1.0f

    .line 625
    .line 626
    const/4 v13, 0x0

    .line 627
    const/4 v14, 0x0

    .line 628
    const/4 v15, 0x0

    .line 629
    const-string v4, ""

    .line 630
    .line 631
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    sput-object v0, Landroidx/compose/material/icons/outlined/SportsBasketballKt;->_sportsBasketball:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 640
    .line 641
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    return-object v0
.end method

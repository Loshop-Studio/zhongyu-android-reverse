.class public final Landroidx/compose/material/icons/rounded/ScaleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _scale:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScale(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ScaleKt;->_scale:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Scale"

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
    const/high16 v0, 0x41800000    # 16.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x3f800000    # 1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f0ccccd    # 0.55f

    .line 83
    .line 84
    .line 85
    const v15, 0x3ee66666    # 0.45f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x405b851f    # 3.43f

    .line 94
    .line 95
    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 101
    .line 102
    const v18, -0x4030a3d7    # -1.62f

    .line 103
    .line 104
    .line 105
    const v13, 0x3f5eb852    # 0.87f

    .line 106
    .line 107
    .line 108
    const/4 v14, 0x0

    .line 109
    const v15, 0x3fca3d71    # 1.58f

    .line 110
    .line 111
    .line 112
    const/high16 v16, -0x40c00000    # -0.75f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x41600000    # 14.0f

    .line 118
    .line 119
    const/high16 v18, 0x41300000    # 11.0f

    .line 120
    .line 121
    const v13, 0x41aab852    # 21.34f

    .line 122
    .line 123
    .line 124
    const v14, 0x4162e148    # 14.18f

    .line 125
    .line 126
    .line 127
    const v15, 0x418b3333    # 17.4f

    .line 128
    .line 129
    .line 130
    const v16, 0x413ae148    # 11.68f

    .line 131
    .line 132
    .line 133
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v0, 0x41000000    # 8.0f

    .line 137
    .line 138
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v17, 0x40e8a3d7    # 7.27f

    .line 142
    .line 143
    .line 144
    const v18, -0x3f9147ae    # -3.73f

    .line 145
    .line 146
    .line 147
    const v13, 0x4053d70a    # 3.31f

    .line 148
    .line 149
    .line 150
    const v14, -0x4128f5c3    # -0.42f

    .line 151
    .line 152
    .line 153
    const v15, 0x40c0f5c3    # 6.03f

    .line 154
    .line 155
    .line 156
    const v16, -0x4011eb85    # -1.86f

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v17, 0x419fd70a    # 19.98f

    .line 163
    .line 164
    .line 165
    const/high16 v18, 0x40000000    # 2.0f

    .line 166
    .line 167
    const v13, 0x41af5c29    # 21.92f

    .line 168
    .line 169
    .line 170
    const v14, 0x40533333    # 3.3f

    .line 171
    .line 172
    .line 173
    const v15, 0x41a93333    # 21.15f

    .line 174
    .line 175
    .line 176
    const/high16 v16, 0x40000000    # 2.0f

    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v0, 0x4080a3d7    # 4.02f

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const v17, 0x402eb852    # 2.73f

    .line 188
    .line 189
    .line 190
    const v18, 0x4088a3d7    # 4.27f

    .line 191
    .line 192
    .line 193
    const v13, 0x40366666    # 2.85f

    .line 194
    .line 195
    .line 196
    const/high16 v14, 0x40000000    # 2.0f

    .line 197
    .line 198
    const v15, 0x40051eb8    # 2.08f

    .line 199
    .line 200
    .line 201
    const v16, 0x40533333    # 3.3f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const/high16 v17, 0x41200000    # 10.0f

    .line 208
    .line 209
    const/high16 v18, 0x41000000    # 8.0f

    .line 210
    .line 211
    const v13, 0x407e147b    # 3.97f

    .line 212
    .line 213
    .line 214
    const v14, 0x40c47ae1    # 6.14f

    .line 215
    .line 216
    .line 217
    const v15, 0x40d6147b    # 6.69f

    .line 218
    .line 219
    .line 220
    const v16, 0x40f28f5c    # 7.58f

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v0, 0x40400000    # 3.0f

    .line 227
    .line 228
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v17, -0x3f023d71    # -7.93f

    .line 232
    .line 233
    .line 234
    const v18, 0x4116147b    # 9.38f

    .line 235
    .line 236
    .line 237
    const v13, -0x3fa66666    # -3.4f

    .line 238
    .line 239
    .line 240
    const v14, 0x3f2e147b    # 0.68f

    .line 241
    .line 242
    .line 243
    const v15, -0x3f151eb8    # -7.34f

    .line 244
    .line 245
    .line 246
    const v16, 0x404b851f    # 3.18f

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v17, 0x40647ae1    # 3.57f

    .line 253
    .line 254
    .line 255
    const/high16 v18, 0x41b00000    # 22.0f

    .line 256
    .line 257
    const v13, 0x3ffeb852    # 1.99f

    .line 258
    .line 259
    .line 260
    const/high16 v14, 0x41aa0000    # 21.25f

    .line 261
    .line 262
    const v15, 0x402ccccd    # 2.7f

    .line 263
    .line 264
    .line 265
    const/high16 v16, 0x41b00000    # 22.0f

    .line 266
    .line 267
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v0, 0x40e00000    # 7.0f

    .line 271
    .line 272
    const/high16 v2, 0x41b00000    # 22.0f

    .line 273
    .line 274
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/high16 v18, -0x40800000    # -1.0f

    .line 280
    .line 281
    const v13, 0x3f0ccccd    # 0.55f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const/high16 v15, 0x3f800000    # 1.0f

    .line 286
    .line 287
    const v16, -0x4119999a    # -0.45f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v17, -0x40800000    # -1.0f

    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    const v14, -0x40f33333    # -0.55f

    .line 297
    .line 298
    .line 299
    const v15, -0x4119999a    # -0.45f

    .line 300
    .line 301
    .line 302
    const/high16 v16, -0x40800000    # -1.0f

    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v0, 0x408428f6    # 4.13f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v17, 0x40fbd70a    # 7.87f

    .line 314
    .line 315
    .line 316
    const v18, -0x3f19999a    # -7.2f

    .line 317
    .line 318
    .line 319
    const v13, 0x3f6e147b    # 0.93f

    .line 320
    .line 321
    .line 322
    const v14, -0x3f2570a4    # -6.83f

    .line 323
    .line 324
    .line 325
    const v15, 0x40d4cccd    # 6.65f

    .line 326
    .line 327
    .line 328
    const v16, -0x3f19999a    # -7.2f

    .line 329
    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const v0, 0x40fbd70a    # 7.87f

    .line 335
    .line 336
    .line 337
    const v2, 0x40e66666    # 7.2f

    .line 338
    .line 339
    .line 340
    const v4, 0x40de147b    # 6.94f

    .line 341
    .line 342
    .line 343
    const v6, 0x3ebd70a4    # 0.37f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const/high16 v0, 0x41880000    # 17.0f

    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const/high16 v17, 0x41800000    # 16.0f

    .line 355
    .line 356
    const/high16 v18, 0x41a80000    # 21.0f

    .line 357
    .line 358
    const v13, 0x4183999a    # 16.45f

    .line 359
    .line 360
    .line 361
    const/high16 v14, 0x41a00000    # 20.0f

    .line 362
    .line 363
    const/high16 v15, 0x41800000    # 16.0f

    .line 364
    .line 365
    const v16, 0x41a3999a    # 20.45f

    .line 366
    .line 367
    .line 368
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v0, 0x41380000    # 11.5f

    .line 375
    .line 376
    const v2, 0x41af851f    # 21.94f

    .line 377
    .line 378
    .line 379
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v17, -0x4047ae14    # -1.44f

    .line 383
    .line 384
    .line 385
    const v18, -0x4047ae14    # -1.44f

    .line 386
    .line 387
    .line 388
    const v13, -0x40cccccd    # -0.7f

    .line 389
    .line 390
    .line 391
    const v14, -0x41d1eb85    # -0.17f

    .line 392
    .line 393
    .line 394
    const v15, -0x405d70a4    # -1.27f

    .line 395
    .line 396
    .line 397
    const v16, -0x40c28f5c    # -0.74f

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const v17, 0x3f07ae14    # 0.53f

    .line 404
    .line 405
    .line 406
    const v18, -0x400b851f    # -1.91f

    .line 407
    .line 408
    .line 409
    const v13, -0x41c7ae14    # -0.18f

    .line 410
    .line 411
    .line 412
    const v14, -0x40c28f5c    # -0.74f

    .line 413
    .line 414
    .line 415
    const v15, 0x3d75c28f    # 0.06f

    .line 416
    .line 417
    .line 418
    const v16, -0x4047ae14    # -1.44f

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const v17, 0x408a8f5c    # 4.33f

    .line 425
    .line 426
    .line 427
    const v18, -0x3ff66666    # -2.15f

    .line 428
    .line 429
    .line 430
    const v13, 0x3f0ccccd    # 0.55f

    .line 431
    .line 432
    .line 433
    const v14, -0x40f33333    # -0.55f

    .line 434
    .line 435
    .line 436
    const v15, 0x403a3d71    # 2.91f

    .line 437
    .line 438
    .line 439
    const v16, -0x40370a3d    # -1.57f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v17, 0x3f266666    # 0.65f

    .line 446
    .line 447
    .line 448
    const v18, 0x3f266666    # 0.65f

    .line 449
    .line 450
    .line 451
    const v13, 0x3ed1eb85    # 0.41f

    .line 452
    .line 453
    .line 454
    const v14, -0x41d1eb85    # -0.17f

    .line 455
    .line 456
    .line 457
    const v15, 0x3f51eb85    # 0.82f

    .line 458
    .line 459
    .line 460
    const v16, 0x3e75c28f    # 0.24f

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v17, -0x3ff66666    # -2.15f

    .line 467
    .line 468
    .line 469
    const v18, 0x408a8f5c    # 4.33f

    .line 470
    .line 471
    .line 472
    const v13, -0x40eb851f    # -0.58f

    .line 473
    .line 474
    .line 475
    const v14, 0x3fb5c28f    # 1.42f

    .line 476
    .line 477
    .line 478
    const v15, -0x40333333    # -1.6f

    .line 479
    .line 480
    .line 481
    const v16, 0x4071eb85    # 3.78f

    .line 482
    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const/high16 v17, 0x41380000    # 11.5f

    .line 488
    .line 489
    const v18, 0x41af851f    # 21.94f

    .line 490
    .line 491
    .line 492
    const v13, 0x414f3333    # 12.95f

    .line 493
    .line 494
    .line 495
    const v14, 0x41af0a3d    # 21.88f

    .line 496
    .line 497
    .line 498
    const/high16 v15, 0x41440000    # 12.25f

    .line 499
    .line 500
    const v16, 0x41b0f5c3    # 22.12f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    const/16 v16, 0x3800

    .line 514
    .line 515
    const/16 v17, 0x0

    .line 516
    .line 517
    const/high16 v6, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/high16 v8, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/4 v7, 0x0

    .line 522
    const/high16 v9, 0x3f800000    # 1.0f

    .line 523
    .line 524
    const/high16 v12, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    const/4 v14, 0x0

    .line 528
    const/4 v15, 0x0

    .line 529
    const-string v4, ""

    .line 530
    .line 531
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    sput-object v0, Landroidx/compose/material/icons/rounded/ScaleKt;->_scale:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 540
    .line 541
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    return-object v0
.end method

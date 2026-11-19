.class public final Landroidx/compose/material/icons/outlined/HubKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hub:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHub(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/HubKt;->_hub:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Hub"

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
    const/high16 v0, 0x40d00000    # 6.5f

    .line 71
    .line 72
    const/high16 v2, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 78
    .line 79
    const/high16 v18, 0x40400000    # 3.0f

    .line 80
    .line 81
    const v13, -0x402b851f    # -1.66f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 86
    .line 87
    const v16, 0x3fab851f    # 1.34f

    .line 88
    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v17, 0x3c23d70a    # 0.01f

    .line 94
    .line 95
    .line 96
    const v18, 0x3e570a3d    # 0.21f

    .line 97
    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, 0x3d8f5c29    # 0.07f

    .line 101
    .line 102
    .line 103
    const/4 v15, 0x0

    .line 104
    const v16, 0x3e0f5c29    # 0.14f

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v0, -0x3ffe147b    # -2.03f

    .line 111
    .line 112
    .line 113
    const v2, 0x3f2e147b    # 0.68f

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v17, -0x3fb1eb85    # -3.22f

    .line 120
    .line 121
    .line 122
    const v18, -0x3feb851f    # -2.32f

    .line 123
    .line 124
    .line 125
    const v13, -0x40dc28f6    # -0.64f

    .line 126
    .line 127
    .line 128
    const v14, -0x40651eb8    # -1.21f

    .line 129
    .line 130
    .line 131
    const v15, -0x40170a3d    # -1.82f

    .line 132
    .line 133
    .line 134
    const v16, -0x3ffa3d71    # -2.09f

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v0, 0x40bd1eb8    # 5.91f

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x41700000    # 15.0f

    .line 147
    .line 148
    const/high16 v18, 0x40400000    # 3.0f

    .line 149
    .line 150
    const v13, 0x4160a3d7    # 14.04f

    .line 151
    .line 152
    .line 153
    const v14, 0x40b23d71    # 5.57f

    .line 154
    .line 155
    .line 156
    const/high16 v15, 0x41700000    # 15.0f

    .line 157
    .line 158
    const v16, 0x408ccccd    # 4.4f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 165
    .line 166
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 167
    .line 168
    const/4 v13, 0x0

    .line 169
    const v14, -0x402b851f    # -1.66f

    .line 170
    .line 171
    .line 172
    const v15, -0x40547ae1    # -1.34f

    .line 173
    .line 174
    .line 175
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 176
    .line 177
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    const/high16 v0, 0x41100000    # 9.0f

    .line 181
    .line 182
    const v2, 0x3fab851f    # 1.34f

    .line 183
    .line 184
    .line 185
    const/high16 v4, 0x40400000    # 3.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v17, 0x40100000    # 2.25f

    .line 191
    .line 192
    const v18, 0x403a3d71    # 2.91f

    .line 193
    .line 194
    .line 195
    const v14, 0x3fb33333    # 1.4f

    .line 196
    .line 197
    .line 198
    const v15, 0x3f75c28f    # 0.96f

    .line 199
    .line 200
    .line 201
    const v16, 0x40247ae1    # 2.57f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v0, 0x400a3d71    # 2.16f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, -0x3fb1eb85    # -3.22f

    .line 214
    .line 215
    .line 216
    const v18, 0x40147ae1    # 2.32f

    .line 217
    .line 218
    .line 219
    const v13, -0x404ccccd    # -1.4f

    .line 220
    .line 221
    .line 222
    const v14, 0x3e6b851f    # 0.23f

    .line 223
    .line 224
    .line 225
    const v15, -0x3fdae148    # -2.58f

    .line 226
    .line 227
    .line 228
    const v16, 0x3f8e147b    # 1.11f

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v0, 0x40bfae14    # 5.99f

    .line 235
    .line 236
    .line 237
    const v2, 0x411b5c29    # 9.71f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v17, 0x40c00000    # 6.0f

    .line 244
    .line 245
    const/high16 v18, 0x41180000    # 9.5f

    .line 246
    .line 247
    const/high16 v13, 0x40c00000    # 6.0f

    .line 248
    .line 249
    const v14, 0x411a3d71    # 9.64f

    .line 250
    .line 251
    .line 252
    const/high16 v15, 0x40c00000    # 6.0f

    .line 253
    .line 254
    const v16, 0x41191eb8    # 9.57f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 261
    .line 262
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 263
    .line 264
    const/4 v13, 0x0

    .line 265
    const v14, -0x402b851f    # -1.66f

    .line 266
    .line 267
    .line 268
    const v15, -0x40547ae1    # -1.34f

    .line 269
    .line 270
    .line 271
    const/high16 v16, -0x3fc00000    # -3.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x3fab851f    # 1.34f

    .line 277
    .line 278
    .line 279
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 280
    .line 281
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v2, 0x40400000    # 3.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v17, 0x402147ae    # 2.52f

    .line 290
    .line 291
    .line 292
    const v18, -0x4050a3d7    # -1.37f

    .line 293
    .line 294
    .line 295
    const v13, 0x3f87ae14    # 1.06f

    .line 296
    .line 297
    .line 298
    const/4 v14, 0x0

    .line 299
    const v15, 0x3ffd70a4    # 1.98f

    .line 300
    .line 301
    .line 302
    const v16, -0x40f33333    # -0.55f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v0, 0x4001eb85    # 2.03f

    .line 309
    .line 310
    .line 311
    const v2, 0x3f2e147b    # 0.68f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, 0x3f8b851f    # 1.09f

    .line 318
    .line 319
    .line 320
    const v18, 0x406c28f6    # 3.69f

    .line 321
    .line 322
    .line 323
    const v13, -0x41b33333    # -0.2f

    .line 324
    .line 325
    .line 326
    const v14, 0x3fa51eb8    # 1.29f

    .line 327
    .line 328
    .line 329
    const v15, 0x3e2e147b    # 0.17f

    .line 330
    .line 331
    .line 332
    const v16, 0x402a3d71    # 2.66f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v0, 0x3fe28f5c    # 1.77f

    .line 339
    .line 340
    .line 341
    const v2, -0x404b851f    # -1.41f

    .line 342
    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v17, 0x40c00000    # 6.0f

    .line 348
    .line 349
    const/high16 v18, 0x41880000    # 17.0f

    .line 350
    .line 351
    const v13, 0x40db3333    # 6.85f

    .line 352
    .line 353
    .line 354
    const v14, 0x4188b852    # 17.09f

    .line 355
    .line 356
    .line 357
    const v15, 0x40ce147b    # 6.44f

    .line 358
    .line 359
    .line 360
    const/high16 v16, 0x41880000    # 17.0f

    .line 361
    .line 362
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 366
    .line 367
    const/high16 v18, 0x40400000    # 3.0f

    .line 368
    .line 369
    const v13, -0x402b851f    # -1.66f

    .line 370
    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 374
    .line 375
    const v16, 0x3fab851f    # 1.34f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v0, 0x3fab851f    # 1.34f

    .line 382
    .line 383
    .line 384
    const/high16 v2, 0x40400000    # 3.0f

    .line 385
    .line 386
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, -0x40547ae1    # -1.34f

    .line 390
    .line 391
    .line 392
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 393
    .line 394
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v17, -0x40e66666    # -0.6f

    .line 398
    .line 399
    .line 400
    const v18, -0x4019999a    # -1.8f

    .line 401
    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, -0x40d1eb85    # -0.68f

    .line 405
    .line 406
    .line 407
    const v15, -0x419eb852    # -0.22f

    .line 408
    .line 409
    .line 410
    const v16, -0x4059999a    # -1.3f

    .line 411
    .line 412
    .line 413
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, -0x401d70a4    # -1.77f

    .line 417
    .line 418
    .line 419
    const v2, 0x3fb47ae1    # 1.41f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v17, 0x408bd70a    # 4.37f

    .line 426
    .line 427
    .line 428
    const/16 v18, 0x0

    .line 429
    .line 430
    const v13, 0x3fae147b    # 1.36f

    .line 431
    .line 432
    .line 433
    const v14, 0x3f428f5c    # 0.76f

    .line 434
    .line 435
    .line 436
    const v15, 0x404147ae    # 3.02f

    .line 437
    .line 438
    .line 439
    const/high16 v16, 0x3f400000    # 0.75f

    .line 440
    .line 441
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x3fb47ae1    # 1.41f

    .line 445
    .line 446
    .line 447
    const v2, 0x3fe28f5c    # 1.77f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v17, 0x41700000    # 15.0f

    .line 454
    .line 455
    const/high16 v18, 0x41a00000    # 20.0f

    .line 456
    .line 457
    const v13, 0x4173851f    # 15.22f

    .line 458
    .line 459
    .line 460
    const v14, 0x4195999a    # 18.7f

    .line 461
    .line 462
    .line 463
    const/high16 v15, 0x41700000    # 15.0f

    .line 464
    .line 465
    const v16, 0x419a8f5c    # 19.32f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v17, 0x40400000    # 3.0f

    .line 472
    .line 473
    const/high16 v18, 0x40400000    # 3.0f

    .line 474
    .line 475
    const/4 v13, 0x0

    .line 476
    const v14, 0x3fd47ae1    # 1.66f

    .line 477
    .line 478
    .line 479
    const v15, 0x3fab851f    # 1.34f

    .line 480
    .line 481
    .line 482
    const/high16 v16, 0x40400000    # 3.0f

    .line 483
    .line 484
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x40547ae1    # -1.34f

    .line 488
    .line 489
    .line 490
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 491
    .line 492
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v17, -0x40628f5c    # -1.23f

    .line 499
    .line 500
    .line 501
    const v18, 0x3e851eb8    # 0.26f

    .line 502
    .line 503
    .line 504
    const v13, -0x411eb852    # -0.44f

    .line 505
    .line 506
    .line 507
    const/4 v14, 0x0

    .line 508
    const v15, -0x40a66666    # -0.85f

    .line 509
    .line 510
    .line 511
    const v16, 0x3db851ec    # 0.09f

    .line 512
    .line 513
    .line 514
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 515
    .line 516
    .line 517
    const v0, -0x401d70a4    # -1.77f

    .line 518
    .line 519
    .line 520
    const v2, -0x404b851f    # -1.41f

    .line 521
    .line 522
    .line 523
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v17, 0x3f8b851f    # 1.09f

    .line 527
    .line 528
    .line 529
    const v18, -0x3f93d70a    # -3.69f

    .line 530
    .line 531
    .line 532
    const v13, 0x3f6e147b    # 0.93f

    .line 533
    .line 534
    .line 535
    const v14, -0x407ae148    # -1.04f

    .line 536
    .line 537
    .line 538
    const v15, 0x3fa51eb8    # 1.29f

    .line 539
    .line 540
    .line 541
    const v16, -0x3fe66666    # -2.4f

    .line 542
    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v0, -0x40d1eb85    # -0.68f

    .line 548
    .line 549
    .line 550
    const v2, 0x4001eb85    # 2.03f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v17, 0x402147ae    # 2.52f

    .line 557
    .line 558
    .line 559
    const v18, 0x3faf5c29    # 1.37f

    .line 560
    .line 561
    .line 562
    const v13, 0x3f07ae14    # 0.53f

    .line 563
    .line 564
    .line 565
    const v14, 0x3f51eb85    # 0.82f

    .line 566
    .line 567
    .line 568
    const v15, 0x3fbae148    # 1.46f

    .line 569
    .line 570
    .line 571
    const v16, 0x3faf5c29    # 1.37f

    .line 572
    .line 573
    .line 574
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 575
    .line 576
    .line 577
    const/high16 v17, 0x40400000    # 3.0f

    .line 578
    .line 579
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 580
    .line 581
    const v13, 0x3fd47ae1    # 1.66f

    .line 582
    .line 583
    .line 584
    const/4 v14, 0x0

    .line 585
    const/high16 v15, 0x40400000    # 3.0f

    .line 586
    .line 587
    const v16, -0x40547ae1    # -1.34f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const v0, 0x41b547ae    # 22.66f

    .line 594
    .line 595
    .line 596
    const/high16 v2, 0x40d00000    # 6.5f

    .line 597
    .line 598
    const/high16 v4, 0x41a80000    # 21.0f

    .line 599
    .line 600
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 604
    .line 605
    .line 606
    const/high16 v0, 0x41280000    # 10.5f

    .line 607
    .line 608
    const/high16 v2, 0x40400000    # 3.0f

    .line 609
    .line 610
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v17, -0x40800000    # -1.0f

    .line 614
    .line 615
    const/high16 v18, -0x40800000    # -1.0f

    .line 616
    .line 617
    const v13, -0x40f33333    # -0.55f

    .line 618
    .line 619
    .line 620
    const/high16 v15, -0x40800000    # -1.0f

    .line 621
    .line 622
    const v16, -0x4119999a    # -0.45f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v17, 0x3f800000    # 1.0f

    .line 629
    .line 630
    const/4 v13, 0x0

    .line 631
    const v14, -0x40f33333    # -0.55f

    .line 632
    .line 633
    .line 634
    const v15, 0x3ee66666    # 0.45f

    .line 635
    .line 636
    .line 637
    const/high16 v16, -0x40800000    # -1.0f

    .line 638
    .line 639
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v0, 0x3ee66666    # 0.45f

    .line 643
    .line 644
    .line 645
    const/high16 v2, 0x3f800000    # 1.0f

    .line 646
    .line 647
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    const/high16 v17, 0x40400000    # 3.0f

    .line 651
    .line 652
    const/high16 v18, 0x41280000    # 10.5f

    .line 653
    .line 654
    const/high16 v13, 0x40800000    # 4.0f

    .line 655
    .line 656
    const v14, 0x4120cccd    # 10.05f

    .line 657
    .line 658
    .line 659
    const v15, 0x40633333    # 3.55f

    .line 660
    .line 661
    .line 662
    const/high16 v16, 0x41280000    # 10.5f

    .line 663
    .line 664
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const/high16 v0, 0x40c00000    # 6.0f

    .line 671
    .line 672
    const/high16 v2, 0x41a80000    # 21.0f

    .line 673
    .line 674
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v17, -0x40800000    # -1.0f

    .line 678
    .line 679
    const/high16 v18, -0x40800000    # -1.0f

    .line 680
    .line 681
    const v13, -0x40f33333    # -0.55f

    .line 682
    .line 683
    .line 684
    const/4 v14, 0x0

    .line 685
    const/high16 v15, -0x40800000    # -1.0f

    .line 686
    .line 687
    const v16, -0x4119999a    # -0.45f

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const/high16 v17, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/4 v13, 0x0

    .line 696
    const v14, -0x40f33333    # -0.55f

    .line 697
    .line 698
    .line 699
    const v15, 0x3ee66666    # 0.45f

    .line 700
    .line 701
    .line 702
    const/high16 v16, -0x40800000    # -1.0f

    .line 703
    .line 704
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    const v0, 0x3ee66666    # 0.45f

    .line 708
    .line 709
    .line 710
    const/high16 v2, 0x3f800000    # 1.0f

    .line 711
    .line 712
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v17, 0x40c00000    # 6.0f

    .line 716
    .line 717
    const/high16 v18, 0x41a80000    # 21.0f

    .line 718
    .line 719
    const/high16 v13, 0x40e00000    # 7.0f

    .line 720
    .line 721
    const v14, 0x41a46666    # 20.55f

    .line 722
    .line 723
    .line 724
    const v15, 0x40d1999a    # 6.55f

    .line 725
    .line 726
    .line 727
    const/high16 v16, 0x41a80000    # 21.0f

    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 733
    .line 734
    .line 735
    const/high16 v0, 0x41300000    # 11.0f

    .line 736
    .line 737
    const/high16 v2, 0x40400000    # 3.0f

    .line 738
    .line 739
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v17, 0x3f800000    # 1.0f

    .line 743
    .line 744
    const/high16 v18, -0x40800000    # -1.0f

    .line 745
    .line 746
    const/4 v13, 0x0

    .line 747
    const v14, -0x40f33333    # -0.55f

    .line 748
    .line 749
    .line 750
    const v15, 0x3ee66666    # 0.45f

    .line 751
    .line 752
    .line 753
    const/high16 v16, -0x40800000    # -1.0f

    .line 754
    .line 755
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v0, 0x3ee66666    # 0.45f

    .line 759
    .line 760
    .line 761
    const/high16 v2, 0x3f800000    # 1.0f

    .line 762
    .line 763
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const/high16 v17, -0x40800000    # -1.0f

    .line 767
    .line 768
    const/high16 v18, 0x3f800000    # 1.0f

    .line 769
    .line 770
    const v14, 0x3f0ccccd    # 0.55f

    .line 771
    .line 772
    .line 773
    const v15, -0x4119999a    # -0.45f

    .line 774
    .line 775
    .line 776
    const/high16 v16, 0x3f800000    # 1.0f

    .line 777
    .line 778
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v0, 0x40633333    # 3.55f

    .line 782
    .line 783
    .line 784
    const/high16 v2, 0x41300000    # 11.0f

    .line 785
    .line 786
    const/high16 v4, 0x40400000    # 3.0f

    .line 787
    .line 788
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const/high16 v0, 0x41400000    # 12.0f

    .line 795
    .line 796
    const/high16 v2, 0x41700000    # 15.0f

    .line 797
    .line 798
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 799
    .line 800
    .line 801
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 802
    .line 803
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 804
    .line 805
    const v13, -0x404f5c29    # -1.38f

    .line 806
    .line 807
    .line 808
    const/4 v14, 0x0

    .line 809
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 810
    .line 811
    const v16, -0x4070a3d7    # -1.12f

    .line 812
    .line 813
    .line 814
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const/high16 v17, 0x40200000    # 2.5f

    .line 818
    .line 819
    const/4 v13, 0x0

    .line 820
    const v14, -0x404f5c29    # -1.38f

    .line 821
    .line 822
    .line 823
    const v15, 0x3f8f5c29    # 1.12f

    .line 824
    .line 825
    .line 826
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 827
    .line 828
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 829
    .line 830
    .line 831
    const v0, 0x3f8f5c29    # 1.12f

    .line 832
    .line 833
    .line 834
    const/high16 v2, 0x40200000    # 2.5f

    .line 835
    .line 836
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const/high16 v17, 0x41400000    # 12.0f

    .line 840
    .line 841
    const/high16 v18, 0x41700000    # 15.0f

    .line 842
    .line 843
    const/high16 v13, 0x41680000    # 14.5f

    .line 844
    .line 845
    const v14, 0x415e147b    # 13.88f

    .line 846
    .line 847
    .line 848
    const v15, 0x4156147b    # 13.38f

    .line 849
    .line 850
    .line 851
    const/high16 v16, 0x41700000    # 15.0f

    .line 852
    .line 853
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const/high16 v0, 0x41900000    # 18.0f

    .line 860
    .line 861
    const/high16 v2, 0x41980000    # 19.0f

    .line 862
    .line 863
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v17, 0x3f800000    # 1.0f

    .line 867
    .line 868
    const/high16 v18, 0x3f800000    # 1.0f

    .line 869
    .line 870
    const v13, 0x3f0ccccd    # 0.55f

    .line 871
    .line 872
    .line 873
    const/4 v14, 0x0

    .line 874
    const/high16 v15, 0x3f800000    # 1.0f

    .line 875
    .line 876
    const v16, 0x3ee66666    # 0.45f

    .line 877
    .line 878
    .line 879
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 880
    .line 881
    .line 882
    const/high16 v17, -0x40800000    # -1.0f

    .line 883
    .line 884
    const/4 v13, 0x0

    .line 885
    const v14, 0x3f0ccccd    # 0.55f

    .line 886
    .line 887
    .line 888
    const v15, -0x4119999a    # -0.45f

    .line 889
    .line 890
    .line 891
    const/high16 v16, 0x3f800000    # 1.0f

    .line 892
    .line 893
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 894
    .line 895
    .line 896
    const v0, -0x4119999a    # -0.45f

    .line 897
    .line 898
    .line 899
    const/high16 v2, -0x40800000    # -1.0f

    .line 900
    .line 901
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const/high16 v17, 0x41900000    # 18.0f

    .line 905
    .line 906
    const/high16 v18, 0x41980000    # 19.0f

    .line 907
    .line 908
    const/high16 v13, 0x41880000    # 17.0f

    .line 909
    .line 910
    const v14, 0x419b999a    # 19.45f

    .line 911
    .line 912
    .line 913
    const v15, 0x418b999a    # 17.45f

    .line 914
    .line 915
    .line 916
    const/high16 v16, 0x41980000    # 19.0f

    .line 917
    .line 918
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const/high16 v0, 0x41280000    # 10.5f

    .line 925
    .line 926
    const/high16 v2, 0x41a80000    # 21.0f

    .line 927
    .line 928
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const/high16 v17, -0x40800000    # -1.0f

    .line 932
    .line 933
    const/high16 v18, -0x40800000    # -1.0f

    .line 934
    .line 935
    const v13, -0x40f33333    # -0.55f

    .line 936
    .line 937
    .line 938
    const/4 v14, 0x0

    .line 939
    const/high16 v15, -0x40800000    # -1.0f

    .line 940
    .line 941
    const v16, -0x4119999a    # -0.45f

    .line 942
    .line 943
    .line 944
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 945
    .line 946
    .line 947
    const/high16 v17, 0x3f800000    # 1.0f

    .line 948
    .line 949
    const/4 v13, 0x0

    .line 950
    const v14, -0x40f33333    # -0.55f

    .line 951
    .line 952
    .line 953
    const v15, 0x3ee66666    # 0.45f

    .line 954
    .line 955
    .line 956
    const/high16 v16, -0x40800000    # -1.0f

    .line 957
    .line 958
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const v0, 0x3ee66666    # 0.45f

    .line 962
    .line 963
    .line 964
    const/high16 v2, 0x3f800000    # 1.0f

    .line 965
    .line 966
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 967
    .line 968
    .line 969
    const/high16 v17, 0x41a80000    # 21.0f

    .line 970
    .line 971
    const/high16 v18, 0x41280000    # 10.5f

    .line 972
    .line 973
    const/high16 v13, 0x41b00000    # 22.0f

    .line 974
    .line 975
    const v14, 0x4120cccd    # 10.05f

    .line 976
    .line 977
    .line 978
    const v15, 0x41ac6666    # 21.55f

    .line 979
    .line 980
    .line 981
    const/high16 v16, 0x41280000    # 10.5f

    .line 982
    .line 983
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 984
    .line 985
    .line 986
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 990
    .line 991
    .line 992
    move-result-object v2

    .line 993
    const/16 v16, 0x3800

    .line 994
    .line 995
    const/16 v17, 0x0

    .line 996
    .line 997
    const/high16 v6, 0x3f800000    # 1.0f

    .line 998
    .line 999
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1000
    .line 1001
    const/4 v7, 0x0

    .line 1002
    const/high16 v9, 0x3f800000    # 1.0f

    .line 1003
    .line 1004
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1005
    .line 1006
    const/4 v13, 0x0

    .line 1007
    const/4 v14, 0x0

    .line 1008
    const/4 v15, 0x0

    .line 1009
    const-string v4, ""

    .line 1010
    .line 1011
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    sput-object v0, Landroidx/compose/material/icons/outlined/HubKt;->_hub:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1020
    .line 1021
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1022
    .line 1023
    .line 1024
    return-object v0
.end method

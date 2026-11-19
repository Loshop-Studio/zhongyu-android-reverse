.class public final Landroidx/compose/material/icons/outlined/RocketLaunchKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRocketLaunch(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/RocketLaunchKt;->_rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.RocketLaunch"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x41700000    # 15.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, -0x3ff851ec    # -2.12f

    .line 78
    .line 79
    .line 80
    const v18, 0x3f6147ae    # 0.88f

    .line 81
    .line 82
    .line 83
    const v13, -0x40ab851f    # -0.83f

    .line 84
    .line 85
    .line 86
    const/4 v14, 0x0

    .line 87
    const v15, -0x4035c28f    # -1.58f

    .line 88
    .line 89
    .line 90
    const v16, 0x3eae147b    # 0.34f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v17, 0x40000000    # 2.0f

    .line 97
    .line 98
    const/high16 v18, 0x41b00000    # 22.0f

    .line 99
    .line 100
    const v13, 0x402ccccd    # 2.7f

    .line 101
    .line 102
    .line 103
    const v14, 0x41887ae1    # 17.06f

    .line 104
    .line 105
    .line 106
    const/high16 v15, 0x40000000    # 2.0f

    .line 107
    .line 108
    const/high16 v16, 0x41b00000    # 22.0f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, -0x40cccccd    # -0.7f

    .line 114
    .line 115
    .line 116
    const v2, 0x40c3d70a    # 6.12f

    .line 117
    .line 118
    .line 119
    const v4, -0x400f5c29    # -1.88f

    .line 120
    .line 121
    .line 122
    const v6, 0x409e147b    # 4.94f

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v17, 0x41100000    # 9.0f

    .line 129
    .line 130
    const/high16 v18, 0x41900000    # 18.0f

    .line 131
    .line 132
    const v13, 0x410a8f5c    # 8.66f

    .line 133
    .line 134
    .line 135
    const v14, 0x419ca3d7    # 19.58f

    .line 136
    .line 137
    .line 138
    const/high16 v15, 0x41100000    # 9.0f

    .line 139
    .line 140
    const v16, 0x4196a3d7    # 18.83f

    .line 141
    .line 142
    .line 143
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x40c00000    # 6.0f

    .line 147
    .line 148
    const/high16 v18, 0x41700000    # 15.0f

    .line 149
    .line 150
    const/high16 v13, 0x41100000    # 9.0f

    .line 151
    .line 152
    const v14, 0x4182b852    # 16.34f

    .line 153
    .line 154
    .line 155
    const v15, 0x40f51eb8    # 7.66f

    .line 156
    .line 157
    .line 158
    const/high16 v16, 0x41700000    # 15.0f

    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, 0x40d6b852    # 6.71f

    .line 167
    .line 168
    .line 169
    const v2, 0x4195ae14    # 18.71f

    .line 170
    .line 171
    .line 172
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v17, -0x3ff51eb8    # -2.17f

    .line 176
    .line 177
    .line 178
    const v18, 0x3f428f5c    # 0.76f

    .line 179
    .line 180
    .line 181
    const v13, -0x4170a3d7    # -0.28f

    .line 182
    .line 183
    .line 184
    const v14, 0x3e8f5c29    # 0.28f

    .line 185
    .line 186
    .line 187
    const v15, -0x3ff51eb8    # -2.17f

    .line 188
    .line 189
    .line 190
    const v16, 0x3f428f5c    # 0.76f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const v0, 0x3f428f5c    # 0.76f

    .line 197
    .line 198
    .line 199
    const v2, -0x3ff51eb8    # -2.17f

    .line 200
    .line 201
    .line 202
    const v6, 0x3ef0a3d7    # 0.47f

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v6, v4, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v17, 0x40c00000    # 6.0f

    .line 209
    .line 210
    const/high16 v18, 0x41880000    # 17.0f

    .line 211
    .line 212
    const v13, 0x40af0a3d    # 5.47f

    .line 213
    .line 214
    .line 215
    const v14, 0x4188e148    # 17.11f

    .line 216
    .line 217
    .line 218
    const v15, 0x40b70a3d    # 5.72f

    .line 219
    .line 220
    .line 221
    const/high16 v16, 0x41880000    # 17.0f

    .line 222
    .line 223
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const/high16 v17, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const/high16 v18, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const v13, 0x3f0ccccd    # 0.55f

    .line 231
    .line 232
    .line 233
    const/4 v14, 0x0

    .line 234
    const/high16 v15, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const v16, 0x3ee66666    # 0.45f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const v17, 0x40d6b852    # 6.71f

    .line 243
    .line 244
    .line 245
    const v18, 0x4195ae14    # 18.71f

    .line 246
    .line 247
    .line 248
    const/high16 v13, 0x40e00000    # 7.0f

    .line 249
    .line 250
    const v14, 0x41923d71    # 18.28f

    .line 251
    .line 252
    .line 253
    const v15, 0x40dc7ae1    # 6.89f

    .line 254
    .line 255
    .line 256
    const v16, 0x41943d71    # 18.53f

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const v0, 0x415a6666    # 13.65f

    .line 266
    .line 267
    .line 268
    const v2, 0x418b5c29    # 17.42f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v17, 0x4087ae14    # 4.24f

    .line 278
    .line 279
    .line 280
    const v18, -0x3ecb0a3d    # -11.31f

    .line 281
    .line 282
    .line 283
    const v13, 0x40cb851f    # 6.36f

    .line 284
    .line 285
    .line 286
    const v14, -0x3f347ae1    # -6.36f

    .line 287
    .line 288
    .line 289
    const v15, 0x4087ae14    # 4.24f

    .line 290
    .line 291
    .line 292
    const v16, -0x3ecb0a3d    # -11.31f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v0, -0x3ecb0a3d    # -11.31f

    .line 299
    .line 300
    .line 301
    const v2, 0x4087ae14    # 4.24f

    .line 302
    .line 303
    .line 304
    const v4, -0x3f61999a    # -4.95f

    .line 305
    .line 306
    .line 307
    const v6, -0x3ff851ec    # -2.12f

    .line 308
    .line 309
    .line 310
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const v0, -0x3fe0a3d7    # -2.49f

    .line 314
    .line 315
    .line 316
    const/high16 v2, -0x41000000    # -0.5f

    .line 317
    .line 318
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const v17, 0x40c1999a    # 6.05f

    .line 322
    .line 323
    .line 324
    const v18, 0x40d428f6    # 6.63f

    .line 325
    .line 326
    .line 327
    const v13, 0x40e6b852    # 7.21f

    .line 328
    .line 329
    .line 330
    const v14, 0x40be6666    # 5.95f

    .line 331
    .line 332
    .line 333
    const v15, 0x40d0f5c3    # 6.53f

    .line 334
    .line 335
    .line 336
    const v16, 0x40c51eb8    # 6.16f

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v0, 0x412b0a3d    # 10.69f

    .line 343
    .line 344
    .line 345
    const/high16 v2, 0x40000000    # 2.0f

    .line 346
    .line 347
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const v0, 0x4008f5c3    # 2.14f

    .line 351
    .line 352
    .line 353
    const/high16 v2, 0x40a00000    # 5.0f

    .line 354
    .line 355
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const v0, 0x4132b852    # 11.17f

    .line 359
    .line 360
    .line 361
    const/high16 v2, 0x41880000    # 17.0f

    .line 362
    .line 363
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const v0, 0x4008f5c3    # 2.14f

    .line 367
    .line 368
    .line 369
    const/high16 v2, 0x40a00000    # 5.0f

    .line 370
    .line 371
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v0, 0x4081999a    # 4.05f

    .line 375
    .line 376
    .line 377
    const v2, -0x3f7e6666    # -4.05f

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    const v17, 0x3f0ccccd    # 0.55f

    .line 384
    .line 385
    .line 386
    const v18, -0x401851ec    # -1.81f

    .line 387
    .line 388
    .line 389
    const v13, 0x3ef0a3d7    # 0.47f

    .line 390
    .line 391
    .line 392
    const v14, -0x410f5c29    # -0.47f

    .line 393
    .line 394
    .line 395
    const v15, 0x3f2e147b    # 0.68f

    .line 396
    .line 397
    .line 398
    const v16, -0x406ccccd    # -1.15f

    .line 399
    .line 400
    .line 401
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x415a6666    # 13.65f

    .line 405
    .line 406
    .line 407
    const v2, 0x418b5c29    # 17.42f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v0, 0x40ed1eb8    # 7.41f

    .line 417
    .line 418
    .line 419
    const v2, 0x412d47ae    # 10.83f

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const/high16 v0, 0x40b00000    # 5.5f

    .line 426
    .line 427
    const v2, 0x412028f6    # 10.01f

    .line 428
    .line 429
    .line 430
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v0, 0x3ffc28f6    # 1.97f

    .line 434
    .line 435
    .line 436
    const v2, -0x4003d70a    # -1.97f

    .line 437
    .line 438
    .line 439
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const v0, 0x3e947ae1    # 0.29f

    .line 443
    .line 444
    .line 445
    const v2, 0x3fb851ec    # 1.44f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v17, 0x40ed1eb8    # 7.41f

    .line 452
    .line 453
    .line 454
    const v18, 0x412d47ae    # 10.83f

    .line 455
    .line 456
    .line 457
    const v13, 0x410570a4    # 8.34f

    .line 458
    .line 459
    .line 460
    const v14, 0x41128f5c    # 9.16f

    .line 461
    .line 462
    .line 463
    const v15, 0x40fa8f5c    # 7.83f

    .line 464
    .line 465
    .line 466
    const v16, 0x41207ae1    # 10.03f

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
    const/high16 v0, 0x41940000    # 18.5f

    .line 476
    .line 477
    const v2, 0x415fd70a    # 13.99f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v0, -0x40ae147b    # -0.82f

    .line 484
    .line 485
    .line 486
    const v2, -0x400b851f    # -1.91f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x401f5c29    # 2.49f

    .line 493
    .line 494
    .line 495
    const/high16 v18, -0x40400000    # -1.5f

    .line 496
    .line 497
    const v13, 0x3f4ccccd    # 0.8f

    .line 498
    .line 499
    .line 500
    const v14, -0x4128f5c3    # -0.42f

    .line 501
    .line 502
    .line 503
    const v15, 0x3fd5c28f    # 1.67f

    .line 504
    .line 505
    .line 506
    const v16, -0x4091eb85    # -0.93f

    .line 507
    .line 508
    .line 509
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x3e947ae1    # 0.29f

    .line 513
    .line 514
    .line 515
    const v2, 0x3fb851ec    # 1.44f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, 0x41940000    # 18.5f

    .line 522
    .line 523
    const v2, 0x415fd70a    # 13.99f

    .line 524
    .line 525
    .line 526
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v0, 0x4143d70a    # 12.24f

    .line 533
    .line 534
    .line 535
    const/high16 v2, 0x41800000    # 16.0f

    .line 536
    .line 537
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, -0x3f7eb852    # -4.04f

    .line 541
    .line 542
    .line 543
    const v18, 0x402eb852    # 2.73f

    .line 544
    .line 545
    .line 546
    const v13, -0x40570a3d    # -1.32f

    .line 547
    .line 548
    .line 549
    const v14, 0x3fa8f5c3    # 1.32f

    .line 550
    .line 551
    .line 552
    const v15, -0x3fa7ae14    # -3.38f

    .line 553
    .line 554
    .line 555
    const v16, 0x4019999a    # 2.4f

    .line 556
    .line 557
    .line 558
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const v0, -0x3fc47ae1    # -2.93f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v17, 0x402eb852    # 2.73f

    .line 568
    .line 569
    .line 570
    const v18, -0x3f7eb852    # -4.04f

    .line 571
    .line 572
    .line 573
    const v13, 0x3ea3d70a    # 0.32f

    .line 574
    .line 575
    .line 576
    const v14, -0x40d9999a    # -0.65f

    .line 577
    .line 578
    .line 579
    const v15, 0x3fb33333    # 1.4f

    .line 580
    .line 581
    .line 582
    const v16, -0x3fd28f5c    # -2.71f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v17, 0x4103ae14    # 8.23f

    .line 589
    .line 590
    .line 591
    const v18, -0x3f80a3d7    # -3.99f

    .line 592
    .line 593
    .line 594
    const v13, 0x4095c28f    # 4.68f

    .line 595
    .line 596
    .line 597
    const v14, -0x3f6a3d71    # -4.68f

    .line 598
    .line 599
    .line 600
    const v15, 0x4103ae14    # 8.23f

    .line 601
    .line 602
    .line 603
    const v16, -0x3f80a3d7    # -3.99f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v0, 0x41a570a4    # 20.68f

    .line 610
    .line 611
    .line 612
    const v2, 0x40f1eb85    # 7.56f

    .line 613
    .line 614
    .line 615
    const v4, 0x4143d70a    # 12.24f

    .line 616
    .line 617
    .line 618
    const/high16 v6, 0x41800000    # 16.0f

    .line 619
    .line 620
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v0, 0x41300000    # 11.0f

    .line 627
    .line 628
    const/high16 v2, 0x41700000    # 15.0f

    .line 629
    .line 630
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    const/high16 v17, 0x40000000    # 2.0f

    .line 634
    .line 635
    const/high16 v18, -0x40000000    # -2.0f

    .line 636
    .line 637
    const v13, 0x3f8ccccd    # 1.1f

    .line 638
    .line 639
    .line 640
    const/4 v14, 0x0

    .line 641
    const/high16 v15, 0x40000000    # 2.0f

    .line 642
    .line 643
    const v16, -0x4099999a    # -0.9f

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const v0, -0x4099999a    # -0.9f

    .line 650
    .line 651
    .line 652
    const/high16 v2, -0x40000000    # -2.0f

    .line 653
    .line 654
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const v0, 0x3f666666    # 0.9f

    .line 658
    .line 659
    .line 660
    const/high16 v2, 0x40000000    # 2.0f

    .line 661
    .line 662
    const/high16 v4, -0x40000000    # -2.0f

    .line 663
    .line 664
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v0, 0x415e6666    # 13.9f

    .line 668
    .line 669
    .line 670
    const/high16 v2, 0x41300000    # 11.0f

    .line 671
    .line 672
    const/high16 v4, 0x41700000    # 15.0f

    .line 673
    .line 674
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/16 v16, 0x3800

    .line 685
    .line 686
    const/16 v17, 0x0

    .line 687
    .line 688
    const/high16 v6, 0x3f800000    # 1.0f

    .line 689
    .line 690
    const/high16 v8, 0x3f800000    # 1.0f

    .line 691
    .line 692
    const/4 v7, 0x0

    .line 693
    const/high16 v9, 0x3f800000    # 1.0f

    .line 694
    .line 695
    const/high16 v12, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const/4 v13, 0x0

    .line 698
    const/4 v15, 0x0

    .line 699
    const-string v4, ""

    .line 700
    .line 701
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    sput-object v0, Landroidx/compose/material/icons/outlined/RocketLaunchKt;->_rocketLaunch:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 710
    .line 711
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    return-object v0
.end method

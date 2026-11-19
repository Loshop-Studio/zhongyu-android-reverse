.class public final Landroidx/compose/material/icons/rounded/KitesurfingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _kitesurfing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKitesurfing(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/KitesurfingKt;->_kitesurfing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Kitesurfing"

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
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    const/high16 v2, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40000000    # 2.0f

    .line 78
    .line 79
    const/high16 v18, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, -0x40733333    # -1.1f

    .line 83
    .line 84
    .line 85
    const v15, 0x3f666666    # 0.9f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x40000000    # -2.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v0, 0x3f666666    # 0.9f

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x40000000    # 2.0f

    .line 97
    .line 98
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v17, -0x40000000    # -2.0f

    .line 102
    .line 103
    const/high16 v18, 0x40000000    # 2.0f

    .line 104
    .line 105
    const v14, 0x3f8ccccd    # 1.1f

    .line 106
    .line 107
    .line 108
    const v15, -0x4099999a    # -0.9f

    .line 109
    .line 110
    .line 111
    const/high16 v16, 0x40000000    # 2.0f

    .line 112
    .line 113
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const v0, 0x40833333    # 4.1f

    .line 117
    .line 118
    .line 119
    const/high16 v2, 0x40400000    # 3.0f

    .line 120
    .line 121
    const/high16 v4, 0x40c00000    # 6.0f

    .line 122
    .line 123
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v0, 0x41803d71    # 16.03f

    .line 130
    .line 131
    .line 132
    const v2, 0x407e147b    # 3.97f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v17, 0x3f87ae14    # 1.06f

    .line 139
    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const v13, 0x3e947ae1    # 0.29f

    .line 144
    .line 145
    .line 146
    const v14, 0x3e947ae1    # 0.29f

    .line 147
    .line 148
    .line 149
    const v15, 0x3f451eb8    # 0.77f

    .line 150
    .line 151
    .line 152
    const v16, 0x3e947ae1    # 0.29f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v0, 0x41a07ae1    # 20.06f

    .line 159
    .line 160
    .line 161
    const/high16 v2, 0x3f800000    # 1.0f

    .line 162
    .line 163
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v0, -0x3ff851ec    # -2.12f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const v0, -0x400b851f    # -1.91f

    .line 173
    .line 174
    .line 175
    const v2, 0x3ff47ae1    # 1.91f

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const v17, 0x41803d71    # 16.03f

    .line 182
    .line 183
    .line 184
    const v18, 0x407e147b    # 3.97f

    .line 185
    .line 186
    .line 187
    const v13, 0x417bd70a    # 15.74f

    .line 188
    .line 189
    .line 190
    const v14, 0x404ccccd    # 3.2f

    .line 191
    .line 192
    .line 193
    const v15, 0x417bd70a    # 15.74f

    .line 194
    .line 195
    .line 196
    const v16, 0x406b851f    # 3.68f

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const v0, 0x41993333    # 19.15f

    .line 206
    .line 207
    .line 208
    const/high16 v2, 0x41400000    # 12.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v17, -0x3f5e147b    # -5.06f

    .line 214
    .line 215
    .line 216
    const v18, 0x3fb0a3d7    # 1.38f

    .line 217
    .line 218
    .line 219
    const v13, -0x405ae148    # -1.29f

    .line 220
    .line 221
    .line 222
    const/4 v14, 0x0

    .line 223
    const v15, -0x3fb8f5c3    # -3.11f

    .line 224
    .line 225
    .line 226
    const v16, 0x3f07ae14    # 0.53f

    .line 227
    .line 228
    .line 229
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const/high16 v0, 0x41500000    # 13.0f

    .line 233
    .line 234
    const v2, 0x41428f5c    # 12.16f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v17, -0x404147ae    # -1.49f

    .line 241
    .line 242
    .line 243
    const v18, -0x40d70a3d    # -0.66f

    .line 244
    .line 245
    .line 246
    const v13, -0x413d70a4    # -0.38f

    .line 247
    .line 248
    .line 249
    const v14, -0x4128f5c3    # -0.42f

    .line 250
    .line 251
    .line 252
    const v15, -0x40947ae1    # -0.92f

    .line 253
    .line 254
    .line 255
    const v16, -0x40d70a3d    # -0.66f

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x4119999a    # 9.6f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const/high16 v0, -0x3fa00000    # -3.5f

    .line 268
    .line 269
    const/4 v2, 0x0

    .line 270
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v0, 0x41300000    # 11.0f

    .line 274
    .line 275
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    const v17, 0x4082e148    # 4.09f

    .line 279
    .line 280
    .line 281
    const v18, -0x40570a3d    # -1.32f

    .line 282
    .line 283
    .line 284
    const v13, 0x3fc28f5c    # 1.52f

    .line 285
    .line 286
    .line 287
    const/4 v14, 0x0

    .line 288
    const v15, 0x403c28f6    # 2.94f

    .line 289
    .line 290
    .line 291
    const v16, -0x41051eb8    # -0.49f

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x3db851ec    # 0.09f

    .line 298
    .line 299
    .line 300
    const/high16 v18, -0x40400000    # -1.5f

    .line 301
    .line 302
    const v13, 0x3efae148    # 0.49f

    .line 303
    .line 304
    .line 305
    const v14, -0x414ccccd    # -0.35f

    .line 306
    .line 307
    .line 308
    const v15, 0x3f051eb8    # 0.52f

    .line 309
    .line 310
    .line 311
    const v16, -0x40770a3d    # -1.07f

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const v17, -0x4059999a    # -1.3f

    .line 318
    .line 319
    .line 320
    const v18, -0x4247ae14    # -0.09f

    .line 321
    .line 322
    .line 323
    const v13, -0x414ccccd    # -0.35f

    .line 324
    .line 325
    .line 326
    const v15, -0x4099999a    # -0.9f

    .line 327
    .line 328
    .line 329
    const v16, -0x413d70a4    # -0.38f

    .line 330
    .line 331
    .line 332
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v17, 0x41300000    # 11.0f

    .line 336
    .line 337
    const/high16 v18, 0x40c00000    # 6.0f

    .line 338
    .line 339
    const v13, 0x4150f5c3    # 13.06f

    .line 340
    .line 341
    .line 342
    const v14, 0x40b51eb8    # 5.66f

    .line 343
    .line 344
    .line 345
    const v15, 0x41411eb8    # 12.07f

    .line 346
    .line 347
    .line 348
    const/high16 v16, 0x40c00000    # 6.0f

    .line 349
    .line 350
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x41000000    # 8.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, 0x40c00000    # 6.0f

    .line 359
    .line 360
    const/high16 v18, 0x41000000    # 8.0f

    .line 361
    .line 362
    const v13, 0x40dccccd    # 6.9f

    .line 363
    .line 364
    .line 365
    const/high16 v14, 0x40c00000    # 6.0f

    .line 366
    .line 367
    const/high16 v15, 0x40c00000    # 6.0f

    .line 368
    .line 369
    const v16, 0x40dccccd    # 6.9f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x408147ae    # 4.04f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v17, 0x3ee66666    # 0.45f

    .line 382
    .line 383
    .line 384
    const v18, 0x3fea3d71    # 1.83f

    .line 385
    .line 386
    .line 387
    const/4 v13, 0x0

    .line 388
    const v14, 0x3f23d70a    # 0.64f

    .line 389
    .line 390
    .line 391
    const v15, 0x3e19999a    # 0.15f

    .line 392
    .line 393
    .line 394
    const v16, 0x3fa28f5c    # 1.27f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const v0, 0x4186b852    # 16.84f

    .line 401
    .line 402
    .line 403
    const/high16 v2, 0x41000000    # 8.0f

    .line 404
    .line 405
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const v17, -0x404147ae    # -1.49f

    .line 409
    .line 410
    .line 411
    const v18, 0x3f95c28f    # 1.17f

    .line 412
    .line 413
    .line 414
    const v13, -0x40f851ec    # -0.53f

    .line 415
    .line 416
    .line 417
    const v14, 0x3ec28f5c    # 0.38f

    .line 418
    .line 419
    .line 420
    const v15, -0x407c28f6    # -1.03f

    .line 421
    .line 422
    .line 423
    const v16, 0x3f47ae14    # 0.78f

    .line 424
    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const/high16 v17, 0x41100000    # 9.0f

    .line 430
    .line 431
    const/high16 v18, 0x41980000    # 19.0f

    .line 432
    .line 433
    const v13, 0x40e6147b    # 7.19f

    .line 434
    .line 435
    .line 436
    const v14, 0x4194b852    # 18.59f

    .line 437
    .line 438
    .line 439
    const v15, 0x4100f5c3    # 8.06f

    .line 440
    .line 441
    .line 442
    const/high16 v16, 0x41980000    # 19.0f

    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v17, 0x40400000    # 3.0f

    .line 448
    .line 449
    const/high16 v18, -0x40400000    # -1.5f

    .line 450
    .line 451
    const v13, 0x3f99999a    # 1.2f

    .line 452
    .line 453
    .line 454
    const/4 v14, 0x0

    .line 455
    const v15, 0x401147ae    # 2.27f

    .line 456
    .line 457
    .line 458
    const v16, -0x40d70a3d    # -0.66f

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 465
    .line 466
    const v13, 0x3f3ae148    # 0.73f

    .line 467
    .line 468
    .line 469
    const v14, 0x3f570a3d    # 0.84f

    .line 470
    .line 471
    .line 472
    const v15, 0x3fe66666    # 1.8f

    .line 473
    .line 474
    .line 475
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, 0x3f75c28f    # 0.96f

    .line 481
    .line 482
    .line 483
    const v18, -0x41f0a3d7    # -0.14f

    .line 484
    .line 485
    .line 486
    const v13, 0x3ea8f5c3    # 0.33f

    .line 487
    .line 488
    .line 489
    const/4 v14, 0x0

    .line 490
    const v15, 0x3f266666    # 0.65f

    .line 491
    .line 492
    .line 493
    const v16, -0x42b33333    # -0.05f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, 0x41a80000    # 21.0f

    .line 500
    .line 501
    const v18, 0x41547ae1    # 13.28f

    .line 502
    .line 503
    .line 504
    const v13, 0x41967ae1    # 18.81f

    .line 505
    .line 506
    .line 507
    const v14, 0x41873333    # 16.9f

    .line 508
    .line 509
    .line 510
    const/high16 v15, 0x41a80000    # 21.0f

    .line 511
    .line 512
    const v16, 0x416b851f    # 14.72f

    .line 513
    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v17, 0x41993333    # 19.15f

    .line 519
    .line 520
    .line 521
    const/high16 v18, 0x41400000    # 12.0f

    .line 522
    .line 523
    const/high16 v13, 0x41a80000    # 21.0f

    .line 524
    .line 525
    const/high16 v14, 0x41440000    # 12.25f

    .line 526
    .line 527
    const v15, 0x419feb85    # 19.99f

    .line 528
    .line 529
    .line 530
    const/high16 v16, 0x41400000    # 12.0f

    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const v0, 0x411d47ae    # 9.83f

    .line 539
    .line 540
    .line 541
    const v2, 0x4179c28f    # 15.61f

    .line 542
    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, 0x41100000    # 9.0f

    .line 548
    .line 549
    const v2, 0x4159999a    # 13.6f

    .line 550
    .line 551
    .line 552
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v0, 0x40200000    # 2.5f

    .line 556
    .line 557
    const v2, -0x42333333    # -0.1f

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x3f333333    # 0.7f

    .line 564
    .line 565
    .line 566
    const v2, 0x3f451eb8    # 0.77f

    .line 567
    .line 568
    .line 569
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v17, 0x411d47ae    # 9.83f

    .line 573
    .line 574
    .line 575
    const v18, 0x4179c28f    # 15.61f

    .line 576
    .line 577
    .line 578
    const v13, 0x413a3d71    # 11.64f

    .line 579
    .line 580
    .line 581
    const v14, 0x4168cccd    # 14.55f

    .line 582
    .line 583
    .line 584
    const v15, 0x4126b852    # 10.42f

    .line 585
    .line 586
    .line 587
    const v16, 0x4173ae14    # 15.23f

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 594
    .line 595
    .line 596
    const/high16 v0, 0x41b00000    # 22.0f

    .line 597
    .line 598
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/high16 v17, -0x40800000    # -1.0f

    .line 602
    .line 603
    const/high16 v18, -0x40800000    # -1.0f

    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    const v14, -0x40f33333    # -0.55f

    .line 607
    .line 608
    .line 609
    const v15, -0x4119999a    # -0.45f

    .line 610
    .line 611
    .line 612
    const/high16 v16, -0x40800000    # -1.0f

    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const/4 v0, 0x0

    .line 618
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const v17, -0x3fde147b    # -2.53f

    .line 622
    .line 623
    .line 624
    const v18, -0x40cccccd    # -0.7f

    .line 625
    .line 626
    .line 627
    const v13, -0x40a147ae    # -0.87f

    .line 628
    .line 629
    .line 630
    const/4 v14, 0x0

    .line 631
    const v15, -0x40228f5c    # -1.73f

    .line 632
    .line 633
    .line 634
    const v16, -0x418a3d71    # -0.24f

    .line 635
    .line 636
    .line 637
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v17, -0x408f5c29    # -0.94f

    .line 641
    .line 642
    .line 643
    const/16 v18, 0x0

    .line 644
    .line 645
    const v13, -0x416b851f    # -0.29f

    .line 646
    .line 647
    .line 648
    const v14, -0x41dc28f6    # -0.16f

    .line 649
    .line 650
    .line 651
    const v15, -0x40d9999a    # -0.65f

    .line 652
    .line 653
    .line 654
    const v16, -0x41d1eb85    # -0.17f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const v17, -0x3f5e147b    # -5.06f

    .line 661
    .line 662
    .line 663
    const v13, -0x40347ae1    # -1.59f

    .line 664
    .line 665
    .line 666
    const v14, 0x3f666666    # 0.9f

    .line 667
    .line 668
    .line 669
    const v15, -0x3fa1eb85    # -3.47f

    .line 670
    .line 671
    .line 672
    const v16, 0x3f666666    # 0.9f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v17, -0x408f5c29    # -0.94f

    .line 679
    .line 680
    .line 681
    const v13, -0x416b851f    # -0.29f

    .line 682
    .line 683
    .line 684
    const v14, -0x41dc28f6    # -0.16f

    .line 685
    .line 686
    .line 687
    const v15, -0x40d9999a    # -0.65f

    .line 688
    .line 689
    .line 690
    const v16, -0x41dc28f6    # -0.16f

    .line 691
    .line 692
    .line 693
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 694
    .line 695
    .line 696
    const v17, -0x3f5e147b    # -5.06f

    .line 697
    .line 698
    .line 699
    const v13, -0x40347ae1    # -1.59f

    .line 700
    .line 701
    .line 702
    const v14, 0x3f666666    # 0.9f

    .line 703
    .line 704
    .line 705
    const v15, -0x3fa1eb85    # -3.47f

    .line 706
    .line 707
    .line 708
    const v16, 0x3f666666    # 0.9f

    .line 709
    .line 710
    .line 711
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 712
    .line 713
    .line 714
    const v17, -0x408f5c29    # -0.94f

    .line 715
    .line 716
    .line 717
    const v13, -0x416b851f    # -0.29f

    .line 718
    .line 719
    .line 720
    const v14, -0x41dc28f6    # -0.16f

    .line 721
    .line 722
    .line 723
    const v15, -0x40d9999a    # -0.65f

    .line 724
    .line 725
    .line 726
    const v16, -0x41dc28f6    # -0.16f

    .line 727
    .line 728
    .line 729
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v17, 0x40400000    # 3.0f

    .line 733
    .line 734
    const/high16 v18, 0x41a80000    # 21.0f

    .line 735
    .line 736
    const v13, 0x40975c29    # 4.73f

    .line 737
    .line 738
    .line 739
    const v14, 0x41a6147b    # 20.76f

    .line 740
    .line 741
    .line 742
    const v15, 0x4077ae14    # 3.87f

    .line 743
    .line 744
    .line 745
    const/high16 v16, 0x41a80000    # 21.0f

    .line 746
    .line 747
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const/high16 v17, -0x40800000    # -1.0f

    .line 754
    .line 755
    const/high16 v18, 0x3f800000    # 1.0f

    .line 756
    .line 757
    const v13, -0x40f33333    # -0.55f

    .line 758
    .line 759
    .line 760
    const/4 v14, 0x0

    .line 761
    const/high16 v15, -0x40800000    # -1.0f

    .line 762
    .line 763
    const v16, 0x3ee66666    # 0.45f

    .line 764
    .line 765
    .line 766
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v17, 0x3f800000    # 1.0f

    .line 770
    .line 771
    const/4 v13, 0x0

    .line 772
    const v14, 0x3f0ccccd    # 0.55f

    .line 773
    .line 774
    .line 775
    const v15, 0x3ee66666    # 0.45f

    .line 776
    .line 777
    .line 778
    const/high16 v16, 0x3f800000    # 1.0f

    .line 779
    .line 780
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 784
    .line 785
    .line 786
    const v17, 0x40551eb8    # 3.33f

    .line 787
    .line 788
    .line 789
    const v18, -0x408f5c29    # -0.94f

    .line 790
    .line 791
    .line 792
    const v13, 0x3f933333    # 1.15f

    .line 793
    .line 794
    .line 795
    const/4 v14, 0x0

    .line 796
    const v15, 0x40133333    # 2.3f

    .line 797
    .line 798
    .line 799
    const v16, -0x416147ae    # -0.31f

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    .line 805
    const v17, 0x40b28f5c    # 5.58f

    .line 806
    .line 807
    .line 808
    const v18, 0x3e0f5c29    # 0.14f

    .line 809
    .line 810
    .line 811
    const v13, 0x3fd47ae1    # 1.66f

    .line 812
    .line 813
    .line 814
    const v14, 0x3f8e147b    # 1.11f

    .line 815
    .line 816
    .line 817
    const v15, 0x4071eb85    # 3.78f

    .line 818
    .line 819
    .line 820
    const v16, 0x3f8147ae    # 1.01f

    .line 821
    .line 822
    .line 823
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    const v17, 0x40c2e148    # 6.09f

    .line 827
    .line 828
    .line 829
    const v18, 0x3d4ccccd    # 0.05f

    .line 830
    .line 831
    .line 832
    const v13, 0x3ff47ae1    # 1.91f

    .line 833
    .line 834
    .line 835
    const v14, 0x3f866666    # 1.05f

    .line 836
    .line 837
    .line 838
    const v15, 0x408570a4    # 4.17f

    .line 839
    .line 840
    .line 841
    const v16, 0x3f88f5c3    # 1.07f

    .line 842
    .line 843
    .line 844
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const/high16 v17, 0x40400000    # 3.0f

    .line 851
    .line 852
    const/high16 v18, 0x3f400000    # 0.75f

    .line 853
    .line 854
    const v13, 0x3f733333    # 0.95f

    .line 855
    .line 856
    .line 857
    const/high16 v14, 0x3f000000    # 0.5f

    .line 858
    .line 859
    const v15, 0x3ffc28f6    # 1.97f

    .line 860
    .line 861
    .line 862
    const/high16 v16, 0x3f400000    # 0.75f

    .line 863
    .line 864
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 868
    .line 869
    .line 870
    const/high16 v17, 0x41b00000    # 22.0f

    .line 871
    .line 872
    const/high16 v18, 0x41b00000    # 22.0f

    .line 873
    .line 874
    const v13, 0x41ac6666    # 21.55f

    .line 875
    .line 876
    .line 877
    const/high16 v14, 0x41b80000    # 23.0f

    .line 878
    .line 879
    const/high16 v15, 0x41b00000    # 22.0f

    .line 880
    .line 881
    const v16, 0x41b46666    # 22.55f

    .line 882
    .line 883
    .line 884
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    const/16 v16, 0x3800

    .line 895
    .line 896
    const/16 v17, 0x0

    .line 897
    .line 898
    const/high16 v6, 0x3f800000    # 1.0f

    .line 899
    .line 900
    const/high16 v8, 0x3f800000    # 1.0f

    .line 901
    .line 902
    const/4 v7, 0x0

    .line 903
    const/high16 v9, 0x3f800000    # 1.0f

    .line 904
    .line 905
    const/high16 v12, 0x3f800000    # 1.0f

    .line 906
    .line 907
    const/4 v13, 0x0

    .line 908
    const/4 v14, 0x0

    .line 909
    const/4 v15, 0x0

    .line 910
    const-string v4, ""

    .line 911
    .line 912
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    sput-object v0, Landroidx/compose/material/icons/rounded/KitesurfingKt;->_kitesurfing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 921
    .line 922
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    return-object v0
.end method

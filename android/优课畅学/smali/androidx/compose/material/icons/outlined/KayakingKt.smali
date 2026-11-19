.class public final Landroidx/compose/material/icons/outlined/KayakingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _kayaking:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getKayaking(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/KayakingKt;->_kayaking:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Kayaking"

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
    const/high16 v0, 0x41b80000    # 23.0f

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
    const/high16 v18, -0x40c00000    # -0.75f

    .line 80
    .line 81
    const v13, -0x407c28f6    # -1.03f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const v15, -0x3ffc28f6    # -2.06f

    .line 86
    .line 87
    .line 88
    const/high16 v16, -0x41800000    # -0.25f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v17, -0x3f400000    # -6.0f

    .line 98
    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    const v13, -0x400e147b    # -1.89f

    .line 102
    .line 103
    .line 104
    const/high16 v14, 0x3f800000    # 1.0f

    .line 105
    .line 106
    const v15, -0x3f7c7ae1    # -4.11f

    .line 107
    .line 108
    .line 109
    const/high16 v16, 0x3f800000    # 1.0f

    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v17, 0x40400000    # 3.0f

    .line 118
    .line 119
    const/high16 v18, 0x41b80000    # 23.0f

    .line 120
    .line 121
    const v13, 0x40a1999a    # 5.05f

    .line 122
    .line 123
    .line 124
    const/high16 v14, 0x41b60000    # 22.75f

    .line 125
    .line 126
    const v15, 0x4080f5c3    # 4.03f

    .line 127
    .line 128
    .line 129
    const/high16 v16, 0x41b80000    # 23.0f

    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x40000000    # 2.0f

    .line 135
    .line 136
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const/high16 v0, -0x40000000    # -2.0f

    .line 140
    .line 141
    const/4 v2, 0x0

    .line 142
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x3f800000    # 1.0f

    .line 146
    .line 147
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v18, -0x40800000    # -1.0f

    .line 151
    .line 152
    const v13, 0x3f851eb8    # 1.04f

    .line 153
    .line 154
    .line 155
    const/4 v14, 0x0

    .line 156
    const v15, 0x40051eb8    # 2.08f

    .line 157
    .line 158
    .line 159
    const v16, -0x414ccccd    # -0.35f

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, 0x40c00000    # 6.0f

    .line 166
    .line 167
    const/16 v18, 0x0

    .line 168
    .line 169
    const v13, 0x3fea3d71    # 1.83f

    .line 170
    .line 171
    .line 172
    const v14, 0x3fa66666    # 1.3f

    .line 173
    .line 174
    .line 175
    const v15, 0x408570a4    # 4.17f

    .line 176
    .line 177
    .line 178
    const v16, 0x3fa66666    # 1.3f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    const/high16 v17, 0x40400000    # 3.0f

    .line 188
    .line 189
    const/high16 v18, 0x3f800000    # 1.0f

    .line 190
    .line 191
    const v13, 0x3f68f5c3    # 0.91f

    .line 192
    .line 193
    .line 194
    const v14, 0x3f266666    # 0.65f

    .line 195
    .line 196
    .line 197
    const v15, 0x3ffae148    # 1.96f

    .line 198
    .line 199
    .line 200
    const/high16 v16, 0x3f800000    # 1.0f

    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const/high16 v0, 0x40000000    # 2.0f

    .line 209
    .line 210
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v0, 0x41a80000    # 21.0f

    .line 214
    .line 215
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41400000    # 12.0f

    .line 222
    .line 223
    const/high16 v2, 0x40b00000    # 5.5f

    .line 224
    .line 225
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, -0x40000000    # -2.0f

    .line 229
    .line 230
    const/high16 v18, 0x40000000    # 2.0f

    .line 231
    .line 232
    const v13, -0x40733333    # -1.1f

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    const/high16 v15, -0x40000000    # -2.0f

    .line 237
    .line 238
    const v16, 0x3f666666    # 0.9f

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x3f666666    # 0.9f

    .line 245
    .line 246
    .line 247
    const/high16 v2, 0x40000000    # 2.0f

    .line 248
    .line 249
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v0, -0x4099999a    # -0.9f

    .line 253
    .line 254
    .line 255
    const/high16 v2, -0x40000000    # -2.0f

    .line 256
    .line 257
    const/high16 v4, 0x40000000    # 2.0f

    .line 258
    .line 259
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v0, 0x4151999a    # 13.1f

    .line 263
    .line 264
    .line 265
    const/high16 v2, 0x41400000    # 12.0f

    .line 266
    .line 267
    const/high16 v4, 0x40b00000    # 5.5f

    .line 268
    .line 269
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v0, 0x418c0000    # 17.5f

    .line 276
    .line 277
    const/high16 v2, 0x41c00000    # 24.0f

    .line 278
    .line 279
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const v17, -0x3f847ae1    # -3.93f

    .line 283
    .line 284
    .line 285
    const v18, 0x3faf5c29    # 1.37f

    .line 286
    .line 287
    .line 288
    const/4 v13, 0x0

    .line 289
    const v15, -0x403d70a4    # -1.52f

    .line 290
    .line 291
    .line 292
    const v16, 0x3f35c28f    # 0.71f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v17, -0x3ffb851f    # -2.07f

    .line 299
    .line 300
    .line 301
    const v18, -0x4050a3d7    # -1.37f

    .line 302
    .line 303
    .line 304
    const v13, -0x40ae147b    # -0.82f

    .line 305
    .line 306
    .line 307
    const v14, -0x41947ae1    # -0.23f

    .line 308
    .line 309
    .line 310
    const v15, -0x403c28f6    # -1.53f

    .line 311
    .line 312
    .line 313
    const/high16 v16, -0x40c00000    # -0.75f

    .line 314
    .line 315
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 319
    .line 320
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 321
    .line 322
    const v13, -0x40c51eb8    # -0.73f

    .line 323
    .line 324
    .line 325
    const v14, 0x3f570a3d    # 0.84f

    .line 326
    .line 327
    .line 328
    const v15, -0x4019999a    # -1.8f

    .line 329
    .line 330
    .line 331
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 337
    .line 338
    const v2, -0x40d70a3d    # -0.66f

    .line 339
    .line 340
    .line 341
    const v4, -0x3feeb852    # -2.27f

    .line 342
    .line 343
    .line 344
    const/high16 v6, -0x40400000    # -1.5f

    .line 345
    .line 346
    invoke-virtual {v12, v4, v2, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v12, v4, v2, v0, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    const v17, -0x3ffb851f    # -2.07f

    .line 356
    .line 357
    .line 358
    const v18, 0x3faf5c29    # 1.37f

    .line 359
    .line 360
    .line 361
    const v13, -0x40f5c28f    # -0.54f

    .line 362
    .line 363
    .line 364
    const v14, 0x3f1c28f6    # 0.61f

    .line 365
    .line 366
    .line 367
    const/high16 v15, -0x40600000    # -1.25f

    .line 368
    .line 369
    const v16, 0x3f90a3d7    # 1.13f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/16 v17, 0x0

    .line 376
    .line 377
    const/high16 v18, 0x418c0000    # 17.5f

    .line 378
    .line 379
    const v13, 0x3fc28f5c    # 1.52f

    .line 380
    .line 381
    .line 382
    const v14, 0x4191ae14    # 18.21f

    .line 383
    .line 384
    .line 385
    const/4 v15, 0x0

    .line 386
    const/high16 v16, 0x418c0000    # 17.5f

    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const v0, 0x40e428f6    # 7.13f

    .line 392
    .line 393
    .line 394
    const v2, -0x3ffae148    # -2.08f

    .line 395
    .line 396
    .line 397
    const v4, 0x403b851f    # 2.93f

    .line 398
    .line 399
    .line 400
    const v6, -0x4051eb85    # -1.36f

    .line 401
    .line 402
    .line 403
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    const v0, 0x3faccccd    # 1.35f

    .line 407
    .line 408
    .line 409
    const v2, -0x3f7a8f5c    # -4.17f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v17, 0x401147ae    # 2.27f

    .line 416
    .line 417
    .line 418
    const v18, -0x406b851f    # -1.16f

    .line 419
    .line 420
    .line 421
    const v13, 0x3e9eb852    # 0.31f

    .line 422
    .line 423
    .line 424
    const v14, -0x408ccccd    # -0.95f

    .line 425
    .line 426
    .line 427
    const v15, 0x3fa8f5c3    # 1.32f

    .line 428
    .line 429
    .line 430
    const v16, -0x4043d70a    # -1.47f

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, 0x3e8a3d71    # 0.27f

    .line 437
    .line 438
    .line 439
    const v18, 0x3de147ae    # 0.11f

    .line 440
    .line 441
    .line 442
    const v13, 0x3db851ec    # 0.09f

    .line 443
    .line 444
    .line 445
    const v14, 0x3cf5c28f    # 0.03f

    .line 446
    .line 447
    .line 448
    const v15, 0x3e428f5c    # 0.19f

    .line 449
    .line 450
    .line 451
    const v16, 0x3d8f5c29    # 0.07f

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const/4 v0, 0x0

    .line 458
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    const v0, 0x401e147b    # 2.47f

    .line 462
    .line 463
    .line 464
    const v2, 0x3fa66666    # 1.3f

    .line 465
    .line 466
    .line 467
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    .line 470
    const v0, 0x4035c28f    # 2.84f

    .line 471
    .line 472
    .line 473
    const/high16 v2, -0x40400000    # -1.5f

    .line 474
    .line 475
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const v0, 0x3fd33333    # 1.65f

    .line 479
    .line 480
    .line 481
    const v2, -0x3f928f5c    # -3.71f

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v0, -0x40fd70a4    # -0.51f

    .line 488
    .line 489
    .line 490
    const v2, -0x40570a3d    # -1.32f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const v0, 0x41966666    # 18.8f

    .line 497
    .line 498
    .line 499
    const/high16 v2, 0x40000000    # 2.0f

    .line 500
    .line 501
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    const/high16 v0, 0x41b00000    # 22.0f

    .line 505
    .line 506
    const v2, 0x405b851f    # 3.43f

    .line 507
    .line 508
    .line 509
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 510
    .line 511
    .line 512
    const v0, 0x41a55c29    # 20.67f

    .line 513
    .line 514
    .line 515
    const v2, 0x40cccccd    # 6.4f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, -0x405851ec    # -1.31f

    .line 522
    .line 523
    .line 524
    const/high16 v2, 0x3f000000    # 0.5f

    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v0, -0x3f91eb85    # -3.72f

    .line 530
    .line 531
    .line 532
    const v2, 0x410570a4    # 8.34f

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v17, 0x41c00000    # 24.0f

    .line 539
    .line 540
    const/high16 v18, 0x418c0000    # 17.5f

    .line 541
    .line 542
    const v13, 0x41a3eb85    # 20.49f

    .line 543
    .line 544
    .line 545
    const v14, 0x417deb85    # 15.87f

    .line 546
    .line 547
    .line 548
    const/high16 v15, 0x41c00000    # 24.0f

    .line 549
    .line 550
    const/high16 v16, 0x418c0000    # 17.5f

    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v0, 0x414f5c29    # 12.96f

    .line 559
    .line 560
    .line 561
    const v2, 0x417051ec    # 15.02f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v0, -0x403d70a4    # -1.52f

    .line 568
    .line 569
    .line 570
    const v2, 0x3f4ccccd    # 0.8f

    .line 571
    .line 572
    .line 573
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v0, -0x40200000    # -1.75f

    .line 577
    .line 578
    const v2, -0x40947ae1    # -0.92f

    .line 579
    .line 580
    .line 581
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 582
    .line 583
    .line 584
    const v0, -0x40ca3d71    # -0.71f

    .line 585
    .line 586
    .line 587
    const v2, 0x400ae148    # 2.17f

    .line 588
    .line 589
    .line 590
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v17, 0x41400000    # 12.0f

    .line 594
    .line 595
    const/high16 v18, 0x41700000    # 15.0f

    .line 596
    .line 597
    const v13, 0x4135c28f    # 11.36f

    .line 598
    .line 599
    .line 600
    const v14, 0x417028f6    # 15.01f

    .line 601
    .line 602
    .line 603
    const v15, 0x413ae148    # 11.68f

    .line 604
    .line 605
    .line 606
    const/high16 v16, 0x41700000    # 15.0f

    .line 607
    .line 608
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const v17, 0x40047ae1    # 2.07f

    .line 612
    .line 613
    .line 614
    const v18, 0x3da3d70a    # 0.08f

    .line 615
    .line 616
    .line 617
    const v13, 0x3f35c28f    # 0.71f

    .line 618
    .line 619
    .line 620
    const/4 v14, 0x0

    .line 621
    const v15, 0x3fb33333    # 1.4f

    .line 622
    .line 623
    .line 624
    const v16, 0x3cf5c28f    # 0.03f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v0, 0x414f5c29    # 12.96f

    .line 631
    .line 632
    .line 633
    const v2, 0x417051ec    # 15.02f

    .line 634
    .line 635
    .line 636
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    const/16 v16, 0x3800

    .line 647
    .line 648
    const/16 v17, 0x0

    .line 649
    .line 650
    const/high16 v6, 0x3f800000    # 1.0f

    .line 651
    .line 652
    const/high16 v8, 0x3f800000    # 1.0f

    .line 653
    .line 654
    const/4 v7, 0x0

    .line 655
    const/high16 v9, 0x3f800000    # 1.0f

    .line 656
    .line 657
    const/high16 v12, 0x3f800000    # 1.0f

    .line 658
    .line 659
    const/4 v13, 0x0

    .line 660
    const/4 v15, 0x0

    .line 661
    const-string v4, ""

    .line 662
    .line 663
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    sput-object v0, Landroidx/compose/material/icons/outlined/KayakingKt;->_kayaking:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 672
    .line 673
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    return-object v0
.end method

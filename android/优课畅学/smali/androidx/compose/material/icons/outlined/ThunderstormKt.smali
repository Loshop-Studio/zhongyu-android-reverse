.class public final Landroidx/compose/material/icons/outlined/ThunderstormKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _thunderstorm:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getThunderstorm(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ThunderstormKt;->_thunderstorm:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Thunderstorm"

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
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v4, 0x418f5c29    # 17.92f

    .line 71
    .line 72
    .line 73
    const v6, 0x40e0a3d7    # 7.02f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x40000000    # 2.0f

    .line 82
    .line 83
    const v21, 0x418b999a    # 17.45f

    .line 84
    .line 85
    .line 86
    const v22, 0x4085c28f    # 4.18f

    .line 87
    .line 88
    .line 89
    const v23, 0x416f851f    # 14.97f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x40000000    # 2.0f

    .line 93
    .line 94
    move-object/from16 v20, v2

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, 0x40d8f5c3    # 6.78f

    .line 100
    .line 101
    .line 102
    const v26, 0x40a1eb85    # 5.06f

    .line 103
    .line 104
    .line 105
    const v21, 0x411d1eb8    # 9.82f

    .line 106
    .line 107
    .line 108
    const/high16 v22, 0x40000000    # 2.0f

    .line 109
    .line 110
    const v23, 0x40fa8f5c    # 7.83f

    .line 111
    .line 112
    .line 113
    const v24, 0x404b851f    # 3.18f

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v25, 0x40000000    # 2.0f

    .line 120
    .line 121
    const/high16 v26, 0x41280000    # 10.5f

    .line 122
    .line 123
    const v21, 0x4082e148    # 4.09f

    .line 124
    .line 125
    .line 126
    const v22, 0x40ad1eb8    # 5.41f

    .line 127
    .line 128
    .line 129
    const/high16 v23, 0x40000000    # 2.0f

    .line 130
    .line 131
    const v24, 0x40f7ae14    # 7.74f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v25, 0x40f00000    # 7.5f

    .line 138
    .line 139
    const/high16 v26, 0x41800000    # 16.0f

    .line 140
    .line 141
    const/high16 v21, 0x40000000    # 2.0f

    .line 142
    .line 143
    const v22, 0x41587ae1    # 13.53f

    .line 144
    .line 145
    .line 146
    const v23, 0x408f0a3d    # 4.47f

    .line 147
    .line 148
    .line 149
    const/high16 v24, 0x41800000    # 16.0f

    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x41200000    # 10.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v25, 0x40900000    # 4.5f

    .line 160
    .line 161
    const/high16 v26, -0x3f700000    # -4.5f

    .line 162
    .line 163
    const v21, 0x401eb852    # 2.48f

    .line 164
    .line 165
    .line 166
    const/16 v22, 0x0

    .line 167
    .line 168
    const/high16 v23, 0x40900000    # 4.5f

    .line 169
    .line 170
    const v24, -0x3ffeb852    # -2.02f

    .line 171
    .line 172
    .line 173
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v25, 0x418f5c29    # 17.92f

    .line 177
    .line 178
    .line 179
    const v26, 0x40e0a3d7    # 7.02f

    .line 180
    .line 181
    .line 182
    const/high16 v21, 0x41b00000    # 22.0f

    .line 183
    .line 184
    const v22, 0x41128f5c    # 9.16f

    .line 185
    .line 186
    .line 187
    const v23, 0x41a1ae14    # 20.21f

    .line 188
    .line 189
    .line 190
    const v24, 0x40e75c29    # 7.23f

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v4, 0x418c0000    # 17.5f

    .line 200
    .line 201
    const/high16 v6, 0x41600000    # 14.0f

    .line 202
    .line 203
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const/high16 v4, -0x3ee00000    # -10.0f

    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v25, 0x40800000    # 4.0f

    .line 212
    .line 213
    const/high16 v26, 0x41280000    # 10.5f

    .line 214
    .line 215
    const v21, 0x40b23d71    # 5.57f

    .line 216
    .line 217
    .line 218
    const/high16 v22, 0x41600000    # 14.0f

    .line 219
    .line 220
    const/high16 v23, 0x40800000    # 4.0f

    .line 221
    .line 222
    const v24, 0x4146e148    # 12.43f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v25, 0x40428f5c    # 3.04f

    .line 229
    .line 230
    .line 231
    const v26, -0x3fa28f5c    # -3.46f

    .line 232
    .line 233
    .line 234
    const/16 v21, 0x0

    .line 235
    .line 236
    const v22, -0x402147ae    # -1.74f

    .line 237
    .line 238
    .line 239
    const v23, 0x3fa7ae14    # 1.31f

    .line 240
    .line 241
    .line 242
    const v24, -0x3fb147ae    # -3.23f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v4, 0x3f7d70a4    # 0.99f

    .line 249
    .line 250
    .line 251
    const v6, -0x41fae148    # -0.13f

    .line 252
    .line 253
    .line 254
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const v4, 0x3efae148    # 0.49f

    .line 258
    .line 259
    .line 260
    const v6, -0x40a147ae    # -0.87f

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v25, 0x41400000    # 12.0f

    .line 267
    .line 268
    const/high16 v26, 0x40800000    # 4.0f

    .line 269
    .line 270
    const v21, 0x4113ae14    # 9.23f

    .line 271
    .line 272
    .line 273
    const v22, 0x4098f5c3    # 4.78f

    .line 274
    .line 275
    .line 276
    const v23, 0x4128f5c3    # 10.56f

    .line 277
    .line 278
    .line 279
    const/high16 v24, 0x40800000    # 4.0f

    .line 280
    .line 281
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v25, 0x407ccccd    # 3.95f

    .line 285
    .line 286
    .line 287
    const v26, 0x40566666    # 3.35f

    .line 288
    .line 289
    .line 290
    const v21, 0x3ff851ec    # 1.94f

    .line 291
    .line 292
    .line 293
    const/16 v22, 0x0

    .line 294
    .line 295
    const v23, 0x406851ec    # 3.63f

    .line 296
    .line 297
    .line 298
    const v24, 0x3fb851ec    # 1.44f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v4, 0x3e800000    # 0.25f

    .line 305
    .line 306
    const v6, 0x3fc28f5c    # 1.52f

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, 0x3fc51eb8    # 1.54f

    .line 313
    .line 314
    .line 315
    const v6, 0x3e0f5c29    # 0.14f

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v25, 0x41a00000    # 20.0f

    .line 322
    .line 323
    const/high16 v26, 0x41380000    # 11.5f

    .line 324
    .line 325
    const v21, 0x4198147b    # 19.01f

    .line 326
    .line 327
    .line 328
    const v22, 0x4112147b    # 9.13f

    .line 329
    .line 330
    .line 331
    const/high16 v23, 0x41a00000    # 20.0f

    .line 332
    .line 333
    const v24, 0x4123851f    # 10.22f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const/high16 v25, 0x418c0000    # 17.5f

    .line 340
    .line 341
    const/high16 v26, 0x41600000    # 14.0f

    .line 342
    .line 343
    const/high16 v21, 0x41a00000    # 20.0f

    .line 344
    .line 345
    const v22, 0x414e147b    # 12.88f

    .line 346
    .line 347
    .line 348
    const v23, 0x41970a3d    # 18.88f

    .line 349
    .line 350
    .line 351
    const/high16 v24, 0x41600000    # 14.0f

    .line 352
    .line 353
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    const/16 v16, 0x3800

    .line 364
    .line 365
    const/16 v17, 0x0

    .line 366
    .line 367
    const/high16 v6, 0x3f800000    # 1.0f

    .line 368
    .line 369
    const/high16 v8, 0x3f800000    # 1.0f

    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    const/high16 v9, 0x3f800000    # 1.0f

    .line 373
    .line 374
    const/high16 v12, 0x3f800000    # 1.0f

    .line 375
    .line 376
    const/4 v13, 0x0

    .line 377
    const/4 v14, 0x0

    .line 378
    const/4 v15, 0x0

    .line 379
    const-string v4, ""

    .line 380
    .line 381
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 382
    .line 383
    .line 384
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 389
    .line 390
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 391
    .line 392
    .line 393
    move-result-wide v6

    .line 394
    const/4 v2, 0x0

    .line 395
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 399
    .line 400
    .line 401
    move-result v10

    .line 402
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 403
    .line 404
    .line 405
    move-result v11

    .line 406
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 409
    .line 410
    .line 411
    const v4, 0x416ccccd    # 14.8f

    .line 412
    .line 413
    .line 414
    const/high16 v6, 0x41880000    # 17.0f

    .line 415
    .line 416
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v4, 0x40547ae1    # 3.32f

    .line 420
    .line 421
    .line 422
    const v6, -0x3fc66666    # -2.9f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v4, 0x3f800000    # 1.0f

    .line 429
    .line 430
    const/high16 v6, 0x40000000    # 2.0f

    .line 431
    .line 432
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v4, 0x402b851f    # 2.68f

    .line 436
    .line 437
    .line 438
    const v6, -0x3fe9999a    # -2.35f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const/4 v4, 0x0

    .line 445
    const v6, 0x4029999a    # 2.65f

    .line 446
    .line 447
    .line 448
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v4, -0x3fab851f    # -3.32f

    .line 452
    .line 453
    .line 454
    const v6, 0x4039999a    # 2.9f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v4, -0x40800000    # -1.0f

    .line 461
    .line 462
    const/high16 v6, -0x40000000    # -2.0f

    .line 463
    .line 464
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const v4, -0x3fd47ae1    # -2.68f

    .line 468
    .line 469
    .line 470
    const v6, 0x40166666    # 2.35f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    const/high16 v6, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/4 v7, 0x0

    .line 486
    const-string v4, ""

    .line 487
    .line 488
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 489
    .line 490
    .line 491
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 496
    .line 497
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 498
    .line 499
    .line 500
    move-result-wide v6

    .line 501
    const/4 v0, 0x0

    .line 502
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 506
    .line 507
    .line 508
    move-result v10

    .line 509
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 510
    .line 511
    .line 512
    move-result v11

    .line 513
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 514
    .line 515
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 516
    .line 517
    .line 518
    const v2, 0x410ccccd    # 8.8f

    .line 519
    .line 520
    .line 521
    const/high16 v4, 0x41880000    # 17.0f

    .line 522
    .line 523
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const v2, 0x40547ae1    # 3.32f

    .line 527
    .line 528
    .line 529
    const v4, -0x3fc66666    # -2.9f

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    const/high16 v2, 0x3f800000    # 1.0f

    .line 536
    .line 537
    const/high16 v4, 0x40000000    # 2.0f

    .line 538
    .line 539
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v2, 0x402b851f    # 2.68f

    .line 543
    .line 544
    .line 545
    const v4, -0x3fe9999a    # -2.35f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/4 v2, 0x0

    .line 552
    const v4, 0x4029999a    # 2.65f

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const v2, -0x3fab851f    # -3.32f

    .line 559
    .line 560
    .line 561
    const v4, 0x4039999a    # 2.9f

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v2, -0x40800000    # -1.0f

    .line 568
    .line 569
    const/high16 v4, -0x40000000    # -2.0f

    .line 570
    .line 571
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const v2, -0x3fd47ae1    # -2.68f

    .line 575
    .line 576
    .line 577
    const v4, 0x40166666    # 2.35f

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    const/high16 v6, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/4 v7, 0x0

    .line 593
    const-string v4, ""

    .line 594
    .line 595
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    sput-object v0, Landroidx/compose/material/icons/outlined/ThunderstormKt;->_thunderstorm:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 604
    .line 605
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    return-object v0
.end method

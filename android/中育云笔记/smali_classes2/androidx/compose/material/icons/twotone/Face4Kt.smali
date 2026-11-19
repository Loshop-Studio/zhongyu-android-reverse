.class public final Landroidx/compose/material/icons/twotone/Face4Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _face4:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFace4(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Face4Kt;->_face4:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Face4"

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
    const v4, 0x4117851f    # 9.47f

    .line 71
    .line 72
    .line 73
    const v6, 0x408d70a4    # 4.42f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const v25, 0x410147ae    # 8.08f

    .line 83
    .line 84
    .line 85
    const v26, 0x40a0f5c3    # 5.03f

    .line 86
    .line 87
    .line 88
    const v21, 0x40c428f6    # 6.13f

    .line 89
    .line 90
    .line 91
    const/high16 v22, 0x41080000    # 8.5f

    .line 92
    .line 93
    const v23, 0x40ee6666    # 7.45f

    .line 94
    .line 95
    .line 96
    const v24, 0x40dd70a4    # 6.92f

    .line 97
    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v25, 0x408d70a4    # 4.42f

    .line 105
    .line 106
    .line 107
    const v26, 0x4117851f    # 9.47f

    .line 108
    .line 109
    .line 110
    const v21, 0x40cbd70a    # 6.37f

    .line 111
    .line 112
    .line 113
    const/high16 v22, 0x40c00000    # 6.0f

    .line 114
    .line 115
    const v23, 0x40a1999a    # 5.05f

    .line 116
    .line 117
    .line 118
    const v24, 0x40f28f5c    # 7.58f

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const/16 v16, 0x3800

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const v6, 0x3e99999a    # 0.3f

    .line 136
    .line 137
    .line 138
    const v8, 0x3e99999a    # 0.3f

    .line 139
    .line 140
    .line 141
    const/4 v7, 0x0

    .line 142
    const/high16 v9, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/high16 v12, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x0

    .line 149
    const-string v4, ""

    .line 150
    .line 151
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 152
    .line 153
    .line 154
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 159
    .line 160
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 161
    .line 162
    .line 163
    move-result-wide v6

    .line 164
    const/4 v2, 0x0

    .line 165
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x418c0000    # 17.5f

    .line 182
    .line 183
    const/high16 v6, 0x41000000    # 8.0f

    .line 184
    .line 185
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v25, 0x3fab851f    # 1.34f

    .line 189
    .line 190
    .line 191
    const v26, -0x420a3d71    # -0.12f

    .line 192
    .line 193
    .line 194
    const v21, 0x3eeb851f    # 0.46f

    .line 195
    .line 196
    .line 197
    const/16 v22, 0x0

    .line 198
    .line 199
    const v23, 0x3f68f5c3    # 0.91f

    .line 200
    .line 201
    .line 202
    const v24, -0x42b33333    # -0.05f

    .line 203
    .line 204
    .line 205
    move-object/from16 v20, v2

    .line 206
    .line 207
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v25, 0x41400000    # 12.0f

    .line 211
    .line 212
    const/high16 v26, 0x40800000    # 4.0f

    .line 213
    .line 214
    const v21, 0x418b851f    # 17.44f

    .line 215
    .line 216
    .line 217
    const v22, 0x40b1eb85    # 5.56f

    .line 218
    .line 219
    .line 220
    const v23, 0x416e6666    # 14.9f

    .line 221
    .line 222
    .line 223
    const/high16 v24, 0x40800000    # 4.0f

    .line 224
    .line 225
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v25, -0x40547ae1    # -1.34f

    .line 229
    .line 230
    .line 231
    const v26, 0x3df5c28f    # 0.12f

    .line 232
    .line 233
    .line 234
    const v21, -0x41147ae1    # -0.46f

    .line 235
    .line 236
    .line 237
    const/16 v22, 0x0

    .line 238
    .line 239
    const v23, -0x40970a3d    # -0.91f

    .line 240
    .line 241
    .line 242
    const v24, 0x3d4ccccd    # 0.05f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/4 v4, 0x0

    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const/high16 v25, 0x418c0000    # 17.5f

    .line 253
    .line 254
    const/high16 v26, 0x41000000    # 8.0f

    .line 255
    .line 256
    const v21, 0x4140f5c3    # 12.06f

    .line 257
    .line 258
    .line 259
    const v22, 0x40ce147b    # 6.44f

    .line 260
    .line 261
    .line 262
    const v23, 0x4169999a    # 14.6f

    .line 263
    .line 264
    .line 265
    const/high16 v24, 0x41000000    # 8.0f

    .line 266
    .line 267
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    const v6, 0x3e99999a    # 0.3f

    .line 278
    .line 279
    .line 280
    const/4 v7, 0x0

    .line 281
    const-string v4, ""

    .line 282
    .line 283
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 284
    .line 285
    .line 286
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 291
    .line 292
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 293
    .line 294
    .line 295
    move-result-wide v6

    .line 296
    const/4 v2, 0x0

    .line 297
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    const v4, 0x40eb3333    # 7.35f

    .line 314
    .line 315
    .line 316
    const v6, 0x4049999a    # 3.15f

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v25, 0x40a00000    # 5.0f

    .line 323
    .line 324
    const/high16 v26, 0x40000000    # 2.0f

    .line 325
    .line 326
    const v21, 0x40d9999a    # 6.8f

    .line 327
    .line 328
    .line 329
    const v22, 0x401d70a4    # 2.46f

    .line 330
    .line 331
    .line 332
    const v23, 0x40be6666    # 5.95f

    .line 333
    .line 334
    .line 335
    const/high16 v24, 0x40000000    # 2.0f

    .line 336
    .line 337
    move-object/from16 v20, v2

    .line 338
    .line 339
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v25, 0x40000000    # 2.0f

    .line 343
    .line 344
    const/high16 v26, 0x40a00000    # 5.0f

    .line 345
    .line 346
    const v21, 0x40566666    # 3.35f

    .line 347
    .line 348
    .line 349
    const/high16 v22, 0x40000000    # 2.0f

    .line 350
    .line 351
    const/high16 v23, 0x40000000    # 2.0f

    .line 352
    .line 353
    const v24, 0x40566666    # 3.35f

    .line 354
    .line 355
    .line 356
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const v25, 0x3f933333    # 1.15f

    .line 360
    .line 361
    .line 362
    const v26, 0x40166666    # 2.35f

    .line 363
    .line 364
    .line 365
    const/16 v21, 0x0

    .line 366
    .line 367
    const v22, 0x3f733333    # 0.95f

    .line 368
    .line 369
    .line 370
    const v23, 0x3eeb851f    # 0.46f

    .line 371
    .line 372
    .line 373
    const v24, 0x3fe66666    # 1.8f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v25, 0x40eb3333    # 7.35f

    .line 380
    .line 381
    .line 382
    const v26, 0x4049999a    # 3.15f

    .line 383
    .line 384
    .line 385
    const v21, 0x4082e148    # 4.09f

    .line 386
    .line 387
    .line 388
    const v22, 0x40b1eb85    # 5.56f

    .line 389
    .line 390
    .line 391
    const v23, 0x40b1eb85    # 5.56f

    .line 392
    .line 393
    .line 394
    const v24, 0x4082e148    # 4.09f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    const v6, 0x3e99999a    # 0.3f

    .line 408
    .line 409
    .line 410
    const/4 v7, 0x0

    .line 411
    const-string v4, ""

    .line 412
    .line 413
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 414
    .line 415
    .line 416
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 421
    .line 422
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 423
    .line 424
    .line 425
    move-result-wide v6

    .line 426
    const/4 v2, 0x0

    .line 427
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 435
    .line 436
    .line 437
    move-result v11

    .line 438
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 441
    .line 442
    .line 443
    const/high16 v4, 0x40000000    # 2.0f

    .line 444
    .line 445
    const/high16 v6, 0x41400000    # 12.0f

    .line 446
    .line 447
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const/high16 v25, -0x3fd00000    # -2.75f

    .line 451
    .line 452
    const v26, 0x3ec7ae14    # 0.39f

    .line 453
    .line 454
    .line 455
    const v21, -0x408a3d71    # -0.96f

    .line 456
    .line 457
    .line 458
    const/16 v22, 0x0

    .line 459
    .line 460
    const v23, -0x400f5c29    # -1.88f

    .line 461
    .line 462
    .line 463
    const v24, 0x3e0f5c29    # 0.14f

    .line 464
    .line 465
    .line 466
    move-object/from16 v20, v2

    .line 467
    .line 468
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v25, 0x40a00000    # 5.0f

    .line 472
    .line 473
    const/16 v26, 0x0

    .line 474
    .line 475
    const v21, 0x4105eb85    # 8.37f

    .line 476
    .line 477
    .line 478
    const v22, 0x3f75c28f    # 0.96f

    .line 479
    .line 480
    .line 481
    const v23, 0x40d9999a    # 6.8f

    .line 482
    .line 483
    .line 484
    const/16 v24, 0x0

    .line 485
    .line 486
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/16 v25, 0x0

    .line 490
    .line 491
    const/high16 v26, 0x40a00000    # 5.0f

    .line 492
    .line 493
    const v21, 0x400f5c29    # 2.24f

    .line 494
    .line 495
    .line 496
    const/16 v22, 0x0

    .line 497
    .line 498
    const/16 v23, 0x0

    .line 499
    .line 500
    const v24, 0x400f5c29    # 2.24f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v25, 0x4018f5c3    # 2.39f

    .line 507
    .line 508
    .line 509
    const/high16 v26, 0x40880000    # 4.25f

    .line 510
    .line 511
    const/16 v21, 0x0

    .line 512
    .line 513
    const v22, 0x3fe66666    # 1.8f

    .line 514
    .line 515
    .line 516
    const v23, 0x3f75c28f    # 0.96f

    .line 517
    .line 518
    .line 519
    const v24, 0x4057ae14    # 3.37f

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v25, 0x40000000    # 2.0f

    .line 526
    .line 527
    const/high16 v26, 0x41400000    # 12.0f

    .line 528
    .line 529
    const v21, 0x4008f5c3    # 2.14f

    .line 530
    .line 531
    .line 532
    const v22, 0x4121eb85    # 10.12f

    .line 533
    .line 534
    .line 535
    const/high16 v23, 0x40000000    # 2.0f

    .line 536
    .line 537
    const v24, 0x4130a3d7    # 11.04f

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v25, 0x41200000    # 10.0f

    .line 544
    .line 545
    const/high16 v26, 0x41200000    # 10.0f

    .line 546
    .line 547
    const/16 v21, 0x0

    .line 548
    .line 549
    const v22, 0x40b0a3d7    # 5.52f

    .line 550
    .line 551
    .line 552
    const v23, 0x408f5c29    # 4.48f

    .line 553
    .line 554
    .line 555
    const/high16 v24, 0x41200000    # 10.0f

    .line 556
    .line 557
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v4, -0x3f70a3d7    # -4.48f

    .line 561
    .line 562
    .line 563
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 564
    .line 565
    const/high16 v7, 0x41200000    # 10.0f

    .line 566
    .line 567
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const v4, 0x418c28f6    # 17.52f

    .line 571
    .line 572
    .line 573
    const/high16 v6, 0x40000000    # 2.0f

    .line 574
    .line 575
    const/high16 v7, 0x41400000    # 12.0f

    .line 576
    .line 577
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v4, 0x40800000    # 4.0f

    .line 584
    .line 585
    const/high16 v6, 0x41400000    # 12.0f

    .line 586
    .line 587
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v25, 0x40dae148    # 6.84f

    .line 591
    .line 592
    .line 593
    const v26, 0x407851ec    # 3.88f

    .line 594
    .line 595
    .line 596
    const v21, 0x4039999a    # 2.9f

    .line 597
    .line 598
    .line 599
    const/16 v22, 0x0

    .line 600
    .line 601
    const v23, 0x40ae147b    # 5.44f

    .line 602
    .line 603
    .line 604
    const v24, 0x3fc7ae14    # 1.56f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/high16 v25, 0x418c0000    # 17.5f

    .line 611
    .line 612
    const/high16 v26, 0x41000000    # 8.0f

    .line 613
    .line 614
    const v21, 0x419347ae    # 18.41f

    .line 615
    .line 616
    .line 617
    const v22, 0x40fe6666    # 7.95f

    .line 618
    .line 619
    .line 620
    const v23, 0x418fae14    # 17.96f

    .line 621
    .line 622
    .line 623
    const/high16 v24, 0x41000000    # 8.0f

    .line 624
    .line 625
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v25, -0x3f251eb8    # -6.84f

    .line 629
    .line 630
    .line 631
    const v26, -0x3f87ae14    # -3.88f

    .line 632
    .line 633
    .line 634
    const v21, -0x3fc66666    # -2.9f

    .line 635
    .line 636
    .line 637
    const/16 v22, 0x0

    .line 638
    .line 639
    const v23, -0x3f51eb85    # -5.44f

    .line 640
    .line 641
    .line 642
    const v24, -0x403851ec    # -1.56f

    .line 643
    .line 644
    .line 645
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const/4 v4, 0x0

    .line 649
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v25, 0x41400000    # 12.0f

    .line 653
    .line 654
    const/high16 v26, 0x40800000    # 4.0f

    .line 655
    .line 656
    const v21, 0x413170a4    # 11.09f

    .line 657
    .line 658
    .line 659
    const v22, 0x4081999a    # 4.05f

    .line 660
    .line 661
    .line 662
    const v23, 0x4138a3d7    # 11.54f

    .line 663
    .line 664
    .line 665
    const/high16 v24, 0x40800000    # 4.0f

    .line 666
    .line 667
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v4, 0x40a00000    # 5.0f

    .line 674
    .line 675
    const/high16 v6, 0x40000000    # 2.0f

    .line 676
    .line 677
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    const/high16 v25, 0x40400000    # 3.0f

    .line 681
    .line 682
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 683
    .line 684
    const/16 v21, 0x0

    .line 685
    .line 686
    const v22, -0x402ccccd    # -1.65f

    .line 687
    .line 688
    .line 689
    const v23, 0x3faccccd    # 1.35f

    .line 690
    .line 691
    .line 692
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 693
    .line 694
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v25, 0x40166666    # 2.35f

    .line 698
    .line 699
    .line 700
    const v26, 0x3f933333    # 1.15f

    .line 701
    .line 702
    .line 703
    const v21, 0x3f733333    # 0.95f

    .line 704
    .line 705
    .line 706
    const/16 v22, 0x0

    .line 707
    .line 708
    const v23, 0x3fe66666    # 1.8f

    .line 709
    .line 710
    .line 711
    const v24, 0x3eeb851f    # 0.46f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const v25, 0x4049999a    # 3.15f

    .line 718
    .line 719
    .line 720
    const v26, 0x40eb3333    # 7.35f

    .line 721
    .line 722
    .line 723
    const v21, 0x40b1eb85    # 5.56f

    .line 724
    .line 725
    .line 726
    const v22, 0x4082e148    # 4.09f

    .line 727
    .line 728
    .line 729
    const v23, 0x4082e148    # 4.09f

    .line 730
    .line 731
    .line 732
    const v24, 0x40b1eb85    # 5.56f

    .line 733
    .line 734
    .line 735
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 736
    .line 737
    .line 738
    const/high16 v25, 0x40000000    # 2.0f

    .line 739
    .line 740
    const/high16 v26, 0x40a00000    # 5.0f

    .line 741
    .line 742
    const v21, 0x401d70a4    # 2.46f

    .line 743
    .line 744
    .line 745
    const v22, 0x40d9999a    # 6.8f

    .line 746
    .line 747
    .line 748
    const/high16 v23, 0x40000000    # 2.0f

    .line 749
    .line 750
    const v24, 0x40be6666    # 5.95f

    .line 751
    .line 752
    .line 753
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v4, 0x410147ae    # 8.08f

    .line 760
    .line 761
    .line 762
    const v6, 0x40a0f5c3    # 5.03f

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const v25, 0x408d70a4    # 4.42f

    .line 769
    .line 770
    .line 771
    const v26, 0x4117851f    # 9.47f

    .line 772
    .line 773
    .line 774
    const v21, 0x40ee6666    # 7.45f

    .line 775
    .line 776
    .line 777
    const v22, 0x40dd70a4    # 6.92f

    .line 778
    .line 779
    .line 780
    const v23, 0x40c428f6    # 6.13f

    .line 781
    .line 782
    .line 783
    const/high16 v24, 0x41080000    # 8.5f

    .line 784
    .line 785
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 786
    .line 787
    .line 788
    const/4 v4, 0x0

    .line 789
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 790
    .line 791
    .line 792
    const v25, 0x410147ae    # 8.08f

    .line 793
    .line 794
    .line 795
    const v26, 0x40a0f5c3    # 5.03f

    .line 796
    .line 797
    .line 798
    const v21, 0x40a1999a    # 5.05f

    .line 799
    .line 800
    .line 801
    const v22, 0x40f28f5c    # 7.58f

    .line 802
    .line 803
    .line 804
    const v23, 0x40cbd70a    # 6.37f

    .line 805
    .line 806
    .line 807
    const/high16 v24, 0x40c00000    # 6.0f

    .line 808
    .line 809
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v4, 0x41a00000    # 20.0f

    .line 816
    .line 817
    const/high16 v6, 0x41400000    # 12.0f

    .line 818
    .line 819
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 820
    .line 821
    .line 822
    const/high16 v25, -0x3f000000    # -8.0f

    .line 823
    .line 824
    const/high16 v26, -0x3f000000    # -8.0f

    .line 825
    .line 826
    const v21, -0x3f72e148    # -4.41f

    .line 827
    .line 828
    .line 829
    const/16 v22, 0x0

    .line 830
    .line 831
    const/high16 v23, -0x3f000000    # -8.0f

    .line 832
    .line 833
    const v24, -0x3f9a3d71    # -3.59f

    .line 834
    .line 835
    .line 836
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const v25, 0x3c23d70a    # 0.01f

    .line 840
    .line 841
    .line 842
    const v26, -0x41e66666    # -0.15f

    .line 843
    .line 844
    .line 845
    const/16 v21, 0x0

    .line 846
    .line 847
    const v22, -0x42b33333    # -0.05f

    .line 848
    .line 849
    .line 850
    const v23, 0x3c23d70a    # 0.01f

    .line 851
    .line 852
    .line 853
    const v24, -0x42333333    # -0.1f

    .line 854
    .line 855
    .line 856
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const v25, 0x40b7ae14    # 5.74f

    .line 860
    .line 861
    .line 862
    const v26, -0x3f4e6666    # -5.55f

    .line 863
    .line 864
    .line 865
    const v21, 0x40266666    # 2.6f

    .line 866
    .line 867
    .line 868
    const v22, -0x40851eb8    # -0.98f

    .line 869
    .line 870
    .line 871
    const v23, 0x4095c28f    # 4.68f

    .line 872
    .line 873
    .line 874
    const v24, -0x3fc0a3d7    # -2.99f

    .line 875
    .line 876
    .line 877
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/high16 v25, 0x418c0000    # 17.5f

    .line 881
    .line 882
    const/high16 v26, 0x41200000    # 10.0f

    .line 883
    .line 884
    const v21, 0x413947ae    # 11.58f

    .line 885
    .line 886
    .line 887
    const v22, 0x4108f5c3    # 8.56f

    .line 888
    .line 889
    .line 890
    const v23, 0x4165eb85    # 14.37f

    .line 891
    .line 892
    .line 893
    const/high16 v24, 0x41200000    # 10.0f

    .line 894
    .line 895
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 896
    .line 897
    .line 898
    const v25, 0x400ae148    # 2.17f

    .line 899
    .line 900
    .line 901
    const v26, -0x418a3d71    # -0.24f

    .line 902
    .line 903
    .line 904
    const/high16 v21, 0x3f400000    # 0.75f

    .line 905
    .line 906
    const/16 v22, 0x0

    .line 907
    .line 908
    const v23, 0x3fbc28f6    # 1.47f

    .line 909
    .line 910
    .line 911
    const v24, -0x4247ae14    # -0.09f

    .line 912
    .line 913
    .line 914
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 915
    .line 916
    .line 917
    const/high16 v25, 0x41a00000    # 20.0f

    .line 918
    .line 919
    const/high16 v26, 0x41400000    # 12.0f

    .line 920
    .line 921
    const v21, 0x419f0a3d    # 19.88f

    .line 922
    .line 923
    .line 924
    const v22, 0x4127851f    # 10.47f

    .line 925
    .line 926
    .line 927
    const/high16 v23, 0x41a00000    # 20.0f

    .line 928
    .line 929
    const v24, 0x4133851f    # 11.22f

    .line 930
    .line 931
    .line 932
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 933
    .line 934
    .line 935
    const/high16 v25, 0x41400000    # 12.0f

    .line 936
    .line 937
    const/high16 v26, 0x41a00000    # 20.0f

    .line 938
    .line 939
    const/high16 v21, 0x41a00000    # 20.0f

    .line 940
    .line 941
    const v22, 0x418347ae    # 16.41f

    .line 942
    .line 943
    .line 944
    const v23, 0x418347ae    # 16.41f

    .line 945
    .line 946
    .line 947
    const/high16 v24, 0x41a00000    # 20.0f

    .line 948
    .line 949
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    const/high16 v6, 0x3f800000    # 1.0f

    .line 960
    .line 961
    const/high16 v8, 0x3f800000    # 1.0f

    .line 962
    .line 963
    const/4 v7, 0x0

    .line 964
    const-string v4, ""

    .line 965
    .line 966
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 967
    .line 968
    .line 969
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 970
    .line 971
    .line 972
    move-result v3

    .line 973
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 974
    .line 975
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 976
    .line 977
    .line 978
    move-result-wide v6

    .line 979
    const/4 v2, 0x0

    .line 980
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 981
    .line 982
    .line 983
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 984
    .line 985
    .line 986
    move-result v10

    .line 987
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 988
    .line 989
    .line 990
    move-result v11

    .line 991
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 994
    .line 995
    .line 996
    const/high16 v4, 0x41100000    # 9.0f

    .line 997
    .line 998
    const/high16 v6, 0x41500000    # 13.0f

    .line 999
    .line 1000
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1001
    .line 1002
    .line 1003
    const/high16 v4, -0x40600000    # -1.25f

    .line 1004
    .line 1005
    const/4 v6, 0x0

    .line 1006
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1007
    .line 1008
    .line 1009
    const/high16 v26, 0x40200000    # 2.5f

    .line 1010
    .line 1011
    const/16 v27, 0x0

    .line 1012
    .line 1013
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 1014
    .line 1015
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 1016
    .line 1017
    const/16 v23, 0x0

    .line 1018
    .line 1019
    const/16 v24, 0x1

    .line 1020
    .line 1021
    const/16 v25, 0x1

    .line 1022
    .line 1023
    move-object/from16 v20, v2

    .line 1024
    .line 1025
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1026
    .line 1027
    .line 1028
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 1029
    .line 1030
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v2

    .line 1037
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1038
    .line 1039
    const/4 v7, 0x0

    .line 1040
    const-string v4, ""

    .line 1041
    .line 1042
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1043
    .line 1044
    .line 1045
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1046
    .line 1047
    .line 1048
    move-result v3

    .line 1049
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1050
    .line 1051
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v6

    .line 1055
    const/4 v0, 0x0

    .line 1056
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1060
    .line 1061
    .line 1062
    move-result v10

    .line 1063
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1064
    .line 1065
    .line 1066
    move-result v11

    .line 1067
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1068
    .line 1069
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1070
    .line 1071
    .line 1072
    const/high16 v0, 0x41700000    # 15.0f

    .line 1073
    .line 1074
    const/high16 v2, 0x41500000    # 13.0f

    .line 1075
    .line 1076
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1077
    .line 1078
    .line 1079
    const/high16 v0, -0x40600000    # -1.25f

    .line 1080
    .line 1081
    const/4 v2, 0x0

    .line 1082
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    const/high16 v18, 0x40200000    # 2.5f

    .line 1086
    .line 1087
    const/16 v19, 0x0

    .line 1088
    .line 1089
    const/high16 v13, 0x3fa00000    # 1.25f

    .line 1090
    .line 1091
    const/high16 v14, 0x3fa00000    # 1.25f

    .line 1092
    .line 1093
    const/16 v16, 0x1

    .line 1094
    .line 1095
    const/16 v17, 0x1

    .line 1096
    .line 1097
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1098
    .line 1099
    .line 1100
    const/high16 v18, -0x3fe00000    # -2.5f

    .line 1101
    .line 1102
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v2

    .line 1109
    const/16 v16, 0x3800

    .line 1110
    .line 1111
    const/16 v17, 0x0

    .line 1112
    .line 1113
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1114
    .line 1115
    const/4 v7, 0x0

    .line 1116
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1117
    .line 1118
    const/4 v13, 0x0

    .line 1119
    const/4 v14, 0x0

    .line 1120
    const-string v4, ""

    .line 1121
    .line 1122
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    sput-object v0, Landroidx/compose/material/icons/twotone/Face4Kt;->_face4:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1131
    .line 1132
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1133
    .line 1134
    .line 1135
    return-object v0
.end method

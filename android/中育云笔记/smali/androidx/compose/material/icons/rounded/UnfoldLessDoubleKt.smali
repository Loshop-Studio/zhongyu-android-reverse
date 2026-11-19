.class public final Landroidx/compose/material/icons/rounded/UnfoldLessDoubleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _unfoldLessDouble:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getUnfoldLessDouble(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/UnfoldLessDoubleKt;->_unfoldLessDouble:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.UnfoldLessDouble"

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
    const v4, 0x40b66666    # 5.7f

    .line 71
    .line 72
    .line 73
    const v6, 0x41675c29    # 14.46f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x3fe1eb85    # -2.47f

    .line 80
    .line 81
    .line 82
    const v6, 0x401d70a4    # 2.46f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v4, 0x41187ae1    # 9.53f

    .line 89
    .line 90
    .line 91
    const v6, 0x40b66666    # 5.7f

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v25, -0x404b851f    # -1.41f

    .line 98
    .line 99
    .line 100
    const/16 v26, 0x0

    .line 101
    .line 102
    const v21, -0x413851ec    # -0.39f

    .line 103
    .line 104
    .line 105
    const v22, -0x413851ec    # -0.39f

    .line 106
    .line 107
    .line 108
    const v23, -0x407d70a4    # -1.02f

    .line 109
    .line 110
    .line 111
    const v24, -0x413851ec    # -0.39f

    .line 112
    .line 113
    .line 114
    move-object/from16 v20, v2

    .line 115
    .line 116
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const v4, 0x3fb47ae1    # 1.41f

    .line 120
    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    const v7, 0x3f828f5c    # 1.02f

    .line 124
    .line 125
    .line 126
    const v8, -0x413851ec    # -0.39f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const v4, 0x404b851f    # 3.18f

    .line 133
    .line 134
    .line 135
    const v6, 0x404ae148    # 3.17f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v25, 0x3fb47ae1    # 1.41f

    .line 142
    .line 143
    .line 144
    const v21, 0x3ec7ae14    # 0.39f

    .line 145
    .line 146
    .line 147
    const v22, 0x3ec7ae14    # 0.39f

    .line 148
    .line 149
    .line 150
    const v23, 0x3f828f5c    # 1.02f

    .line 151
    .line 152
    .line 153
    const v24, 0x3ec7ae14    # 0.39f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v4, -0x3fb47ae1    # -3.18f

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/16 v25, 0x0

    .line 166
    .line 167
    const v26, -0x404b851f    # -1.41f

    .line 168
    .line 169
    .line 170
    const v22, -0x413851ec    # -0.39f

    .line 171
    .line 172
    .line 173
    const v23, 0x3ec7ae14    # 0.39f

    .line 174
    .line 175
    .line 176
    const v24, -0x407d70a4    # -1.02f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x40a9eb85    # 5.31f

    .line 183
    .line 184
    .line 185
    const v6, 0x416d999a    # 14.85f

    .line 186
    .line 187
    .line 188
    const v7, 0x40b66666    # 5.7f

    .line 189
    .line 190
    .line 191
    const v8, 0x41675c29    # 14.46f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v6, v4, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    const/16 v16, 0x3800

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    const/high16 v6, 0x3f800000    # 1.0f

    .line 209
    .line 210
    const/high16 v8, 0x3f800000    # 1.0f

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const/high16 v9, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/high16 v12, 0x3f800000    # 1.0f

    .line 216
    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    const/4 v15, 0x0

    .line 220
    const-string v4, ""

    .line 221
    .line 222
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 223
    .line 224
    .line 225
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 230
    .line 231
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 232
    .line 233
    .line 234
    move-result-wide v6

    .line 235
    const/4 v2, 0x0

    .line 236
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 250
    .line 251
    .line 252
    const v4, 0x3f333333    # 0.7f

    .line 253
    .line 254
    .line 255
    const v6, 0x41675c29    # 14.46f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, -0x3fe1eb85    # -2.47f

    .line 262
    .line 263
    .line 264
    const v6, 0x401d70a4    # 2.46f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v4, 0x41187ae1    # 9.53f

    .line 271
    .line 272
    .line 273
    const v6, 0x3f333333    # 0.7f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v25, -0x404b851f    # -1.41f

    .line 280
    .line 281
    .line 282
    const/16 v26, 0x0

    .line 283
    .line 284
    const v21, -0x413851ec    # -0.39f

    .line 285
    .line 286
    .line 287
    const v23, -0x407d70a4    # -1.02f

    .line 288
    .line 289
    .line 290
    const v24, -0x413851ec    # -0.39f

    .line 291
    .line 292
    .line 293
    move-object/from16 v20, v2

    .line 294
    .line 295
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const v4, 0x3fb47ae1    # 1.41f

    .line 299
    .line 300
    .line 301
    const/4 v6, 0x0

    .line 302
    const v7, 0x3f828f5c    # 1.02f

    .line 303
    .line 304
    .line 305
    const v8, -0x413851ec    # -0.39f

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2, v8, v7, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const v4, 0x404b851f    # 3.18f

    .line 312
    .line 313
    .line 314
    const v6, 0x404ae148    # 3.17f

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v25, 0x3fb47ae1    # 1.41f

    .line 321
    .line 322
    .line 323
    const v21, 0x3ec7ae14    # 0.39f

    .line 324
    .line 325
    .line 326
    const v22, 0x3ec7ae14    # 0.39f

    .line 327
    .line 328
    .line 329
    const v23, 0x3f828f5c    # 1.02f

    .line 330
    .line 331
    .line 332
    const v24, 0x3ec7ae14    # 0.39f

    .line 333
    .line 334
    .line 335
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const v4, -0x3fb47ae1    # -3.18f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/16 v25, 0x0

    .line 345
    .line 346
    const v26, -0x404b851f    # -1.41f

    .line 347
    .line 348
    .line 349
    const v22, -0x413851ec    # -0.39f

    .line 350
    .line 351
    .line 352
    const v23, 0x3ec7ae14    # 0.39f

    .line 353
    .line 354
    .line 355
    const v24, -0x407d70a4    # -1.02f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v4, 0x3e9eb852    # 0.31f

    .line 362
    .line 363
    .line 364
    const v6, 0x416d999a    # 14.85f

    .line 365
    .line 366
    .line 367
    const v7, 0x3f333333    # 0.7f

    .line 368
    .line 369
    .line 370
    const v8, 0x41675c29    # 14.46f

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2, v6, v4, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    const/high16 v6, 0x3f800000    # 1.0f

    .line 384
    .line 385
    const/high16 v8, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/4 v7, 0x0

    .line 388
    const-string v4, ""

    .line 389
    .line 390
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 391
    .line 392
    .line 393
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 398
    .line 399
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 400
    .line 401
    .line 402
    move-result-wide v6

    .line 403
    const/4 v2, 0x0

    .line 404
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 408
    .line 409
    .line 410
    move-result v10

    .line 411
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 412
    .line 413
    .line 414
    move-result v11

    .line 415
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 416
    .line 417
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 418
    .line 419
    .line 420
    const v4, 0x41ba6666    # 23.3f

    .line 421
    .line 422
    .line 423
    const v6, 0x4118a3d7    # 9.54f

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v4, -0x3fe28f5c    # -2.46f

    .line 430
    .line 431
    .line 432
    const v6, 0x401e147b    # 2.47f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v4, 0x401d70a4    # 2.46f

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v25, 0x3fb47ae1    # 1.41f

    .line 445
    .line 446
    .line 447
    const/16 v26, 0x0

    .line 448
    .line 449
    const v22, 0x3ec7ae14    # 0.39f

    .line 450
    .line 451
    .line 452
    const v23, 0x3f828f5c    # 1.02f

    .line 453
    .line 454
    .line 455
    const v24, 0x3ec7ae14    # 0.39f

    .line 456
    .line 457
    .line 458
    move-object/from16 v20, v2

    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/16 v25, 0x0

    .line 464
    .line 465
    const v26, -0x404b851f    # -1.41f

    .line 466
    .line 467
    .line 468
    const v22, -0x413851ec    # -0.39f

    .line 469
    .line 470
    .line 471
    const v23, 0x3ec7ae14    # 0.39f

    .line 472
    .line 473
    .line 474
    const v24, -0x407d70a4    # -1.02f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v4, -0x3fb51eb8    # -3.17f

    .line 481
    .line 482
    .line 483
    const v6, -0x3fb47ae1    # -3.18f

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v25, -0x404b851f    # -1.41f

    .line 490
    .line 491
    .line 492
    const/16 v26, 0x0

    .line 493
    .line 494
    const v21, -0x413851ec    # -0.39f

    .line 495
    .line 496
    .line 497
    const v23, -0x407d70a4    # -1.02f

    .line 498
    .line 499
    .line 500
    const v24, -0x413851ec    # -0.39f

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v4, 0x404b851f    # 3.18f

    .line 507
    .line 508
    .line 509
    const v6, -0x3fb51eb8    # -3.17f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/16 v25, 0x0

    .line 516
    .line 517
    const v26, 0x3fb47ae1    # 1.41f

    .line 518
    .line 519
    .line 520
    const v22, 0x3ec7ae14    # 0.39f

    .line 521
    .line 522
    .line 523
    const v23, -0x413851ec    # -0.39f

    .line 524
    .line 525
    .line 526
    const v24, 0x3f828f5c    # 1.02f

    .line 527
    .line 528
    .line 529
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 530
    .line 531
    .line 532
    const v25, 0x4118a3d7    # 9.54f

    .line 533
    .line 534
    .line 535
    const v26, 0x41ba6666    # 23.3f

    .line 536
    .line 537
    .line 538
    const v21, 0x410851ec    # 8.52f

    .line 539
    .line 540
    .line 541
    const v22, 0x41bd851f    # 23.69f

    .line 542
    .line 543
    .line 544
    const v23, 0x41126666    # 9.15f

    .line 545
    .line 546
    .line 547
    const v24, 0x41bd851f    # 23.69f

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    const/high16 v6, 0x3f800000    # 1.0f

    .line 561
    .line 562
    const/4 v7, 0x0

    .line 563
    const-string v4, ""

    .line 564
    .line 565
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 566
    .line 567
    .line 568
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 569
    .line 570
    .line 571
    move-result v3

    .line 572
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 573
    .line 574
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 575
    .line 576
    .line 577
    move-result-wide v6

    .line 578
    const/4 v0, 0x0

    .line 579
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 583
    .line 584
    .line 585
    move-result v10

    .line 586
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 587
    .line 588
    .line 589
    move-result v11

    .line 590
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 593
    .line 594
    .line 595
    const v0, 0x419251ec    # 18.29f

    .line 596
    .line 597
    .line 598
    const v2, 0x4118a3d7    # 9.54f

    .line 599
    .line 600
    .line 601
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const v0, -0x3fe33333    # -2.45f

    .line 605
    .line 606
    .line 607
    const v2, 0x401e147b    # 2.47f

    .line 608
    .line 609
    .line 610
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, 0x401d70a4    # 2.46f

    .line 614
    .line 615
    .line 616
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 617
    .line 618
    .line 619
    const v17, 0x3fb47ae1    # 1.41f

    .line 620
    .line 621
    .line 622
    const/16 v18, 0x0

    .line 623
    .line 624
    const v13, 0x3ec7ae14    # 0.39f

    .line 625
    .line 626
    .line 627
    const v14, 0x3ec7ae14    # 0.39f

    .line 628
    .line 629
    .line 630
    const v15, 0x3f828f5c    # 1.02f

    .line 631
    .line 632
    .line 633
    const v16, 0x3ec7ae14    # 0.39f

    .line 634
    .line 635
    .line 636
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 637
    .line 638
    .line 639
    const/16 v17, 0x0

    .line 640
    .line 641
    const v18, -0x404b851f    # -1.41f

    .line 642
    .line 643
    .line 644
    const v14, -0x413851ec    # -0.39f

    .line 645
    .line 646
    .line 647
    const v15, 0x3ec7ae14    # 0.39f

    .line 648
    .line 649
    .line 650
    const v16, -0x407d70a4    # -1.02f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const v0, -0x3fb51eb8    # -3.17f

    .line 657
    .line 658
    .line 659
    const v2, -0x3fb47ae1    # -3.18f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v17, -0x404b851f    # -1.41f

    .line 666
    .line 667
    .line 668
    const/16 v18, 0x0

    .line 669
    .line 670
    const v13, -0x413851ec    # -0.39f

    .line 671
    .line 672
    .line 673
    const v15, -0x407d70a4    # -1.02f

    .line 674
    .line 675
    .line 676
    const v16, -0x413851ec    # -0.39f

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    const v2, 0x404ae148    # 3.17f

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/16 v17, 0x0

    .line 689
    .line 690
    const v18, 0x3fb47ae1    # 1.41f

    .line 691
    .line 692
    .line 693
    const v14, 0x3ec7ae14    # 0.39f

    .line 694
    .line 695
    .line 696
    const v15, -0x413851ec    # -0.39f

    .line 697
    .line 698
    .line 699
    const v16, 0x3f828f5c    # 1.02f

    .line 700
    .line 701
    .line 702
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const v0, 0x41126666    # 9.15f

    .line 706
    .line 707
    .line 708
    const v2, 0x419570a4    # 18.68f

    .line 709
    .line 710
    .line 711
    const v4, 0x419251ec    # 18.29f

    .line 712
    .line 713
    .line 714
    const v6, 0x4118a3d7    # 9.54f

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    const/16 v16, 0x3800

    .line 728
    .line 729
    const/16 v17, 0x0

    .line 730
    .line 731
    const/high16 v6, 0x3f800000    # 1.0f

    .line 732
    .line 733
    const/4 v7, 0x0

    .line 734
    const/high16 v12, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/4 v13, 0x0

    .line 737
    const/4 v14, 0x0

    .line 738
    const/4 v15, 0x0

    .line 739
    const-string v4, ""

    .line 740
    .line 741
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    sput-object v0, Landroidx/compose/material/icons/rounded/UnfoldLessDoubleKt;->_unfoldLessDouble:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 750
    .line 751
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    return-object v0
.end method

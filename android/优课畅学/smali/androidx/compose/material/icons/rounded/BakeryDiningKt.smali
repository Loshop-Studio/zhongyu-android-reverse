.class public final Landroidx/compose/material/icons/rounded/BakeryDiningKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBakeryDining(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BakeryDiningKt;->_bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.BakeryDining"

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
    const v4, 0x419628f6    # 18.77f

    .line 71
    .line 72
    .line 73
    const v6, 0x4108cccd    # 8.55f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x418ccccd    # 17.6f

    .line 80
    .line 81
    .line 82
    const v6, 0x410147ae    # 8.08f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const v25, -0x4050a3d7    # -1.37f

    .line 89
    .line 90
    .line 91
    const v26, 0x3f570a3d    # 0.84f

    .line 92
    .line 93
    .line 94
    const v21, -0x40e147ae    # -0.62f

    .line 95
    .line 96
    .line 97
    const/high16 v22, -0x41800000    # -0.25f

    .line 98
    .line 99
    const v23, -0x405851ec    # -1.31f

    .line 100
    .line 101
    .line 102
    const v24, 0x3e2e147b    # 0.17f

    .line 103
    .line 104
    .line 105
    move-object/from16 v20, v2

    .line 106
    .line 107
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, -0x40c28f5c    # -0.74f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v4, 0x41880000    # 17.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v4, -0x3f300000    # -6.5f

    .line 122
    .line 123
    const v6, 0x40266666    # 2.6f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v25, 0x419628f6    # 18.77f

    .line 130
    .line 131
    .line 132
    const v26, 0x4108cccd    # 8.55f

    .line 133
    .line 134
    .line 135
    const v21, 0x419f47ae    # 19.91f

    .line 136
    .line 137
    .line 138
    const v22, 0x411bae14    # 9.73f

    .line 139
    .line 140
    .line 141
    const v23, 0x419c51ec    # 19.54f

    .line 142
    .line 143
    .line 144
    const v24, 0x410d999a    # 8.85f

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const/16 v16, 0x3800

    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    const/high16 v6, 0x3f800000    # 1.0f

    .line 162
    .line 163
    const/high16 v8, 0x3f800000    # 1.0f

    .line 164
    .line 165
    const/4 v7, 0x0

    .line 166
    const/high16 v9, 0x3f800000    # 1.0f

    .line 167
    .line 168
    const/high16 v12, 0x3f800000    # 1.0f

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    const/4 v14, 0x0

    .line 172
    const/4 v15, 0x0

    .line 173
    const-string v4, ""

    .line 174
    .line 175
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 176
    .line 177
    .line 178
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 183
    .line 184
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 185
    .line 186
    .line 187
    move-result-wide v6

    .line 188
    const/4 v2, 0x0

    .line 189
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    const v4, 0x40cccccd    # 6.4f

    .line 206
    .line 207
    .line 208
    const v6, 0x410147ae    # 8.08f

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x40a75c29    # 5.23f

    .line 215
    .line 216
    .line 217
    const v6, 0x4108cccd    # 8.55f

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v25, 0x408ccccd    # 4.4f

    .line 224
    .line 225
    .line 226
    const/high16 v26, 0x41280000    # 10.5f

    .line 227
    .line 228
    const v21, 0x408eb852    # 4.46f

    .line 229
    .line 230
    .line 231
    const v22, 0x410d999a    # 8.85f

    .line 232
    .line 233
    .line 234
    const v23, 0x4082e148    # 4.09f

    .line 235
    .line 236
    .line 237
    const v24, 0x411bae14    # 9.73f

    .line 238
    .line 239
    .line 240
    move-object/from16 v20, v2

    .line 241
    .line 242
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    const/high16 v4, 0x40d00000    # 6.5f

    .line 246
    .line 247
    const v6, 0x40266666    # 2.6f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 254
    .line 255
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v4, 0x40f851ec    # 7.76f

    .line 259
    .line 260
    .line 261
    const v6, 0x410eb852    # 8.92f

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v25, 0x40cccccd    # 6.4f

    .line 268
    .line 269
    .line 270
    const v26, 0x410147ae    # 8.08f

    .line 271
    .line 272
    .line 273
    const v21, 0x40f66666    # 7.7f

    .line 274
    .line 275
    .line 276
    const/high16 v22, 0x41040000    # 8.25f

    .line 277
    .line 278
    const v23, 0x40e0a3d7    # 7.02f

    .line 279
    .line 280
    .line 281
    const v24, 0x40fa8f5c    # 7.83f

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const/high16 v6, 0x3f800000    # 1.0f

    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    const-string v4, ""

    .line 298
    .line 299
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 300
    .line 301
    .line 302
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 307
    .line 308
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 309
    .line 310
    .line 311
    move-result-wide v6

    .line 312
    const/4 v2, 0x0

    .line 313
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 317
    .line 318
    .line 319
    move-result v10

    .line 320
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const v4, 0x4155c28f    # 13.36f

    .line 330
    .line 331
    .line 332
    const/high16 v6, 0x40c00000    # 6.0f

    .line 333
    .line 334
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v4, -0x3fd28f5c    # -2.71f

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const v25, 0x41126666    # 9.15f

    .line 344
    .line 345
    .line 346
    const v26, 0x40f47ae1    # 7.64f

    .line 347
    .line 348
    .line 349
    const v21, 0x411c28f6    # 9.76f

    .line 350
    .line 351
    .line 352
    const/high16 v22, 0x40c00000    # 6.0f

    .line 353
    .line 354
    const v23, 0x41111eb8    # 9.07f

    .line 355
    .line 356
    .line 357
    const v24, 0x40d851ec    # 6.76f

    .line 358
    .line 359
    .line 360
    move-object/from16 v20, v2

    .line 361
    .line 362
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x41200000    # 10.0f

    .line 366
    .line 367
    const v6, 0x4187eb85    # 16.99f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 371
    .line 372
    .line 373
    const/high16 v4, 0x40800000    # 4.0f

    .line 374
    .line 375
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v4, 0x3f59999a    # 0.85f

    .line 379
    .line 380
    .line 381
    const v6, -0x3eea3d71    # -9.36f

    .line 382
    .line 383
    .line 384
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const v25, 0x4155c28f    # 13.36f

    .line 388
    .line 389
    .line 390
    const/high16 v26, 0x40c00000    # 6.0f

    .line 391
    .line 392
    const v21, 0x416ee148    # 14.93f

    .line 393
    .line 394
    .line 395
    const v22, 0x40d851ec    # 6.76f

    .line 396
    .line 397
    .line 398
    const v23, 0x4163d70a    # 14.24f

    .line 399
    .line 400
    .line 401
    const/high16 v24, 0x40c00000    # 6.0f

    .line 402
    .line 403
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    const/high16 v6, 0x3f800000    # 1.0f

    .line 414
    .line 415
    const/4 v7, 0x0

    .line 416
    const-string v4, ""

    .line 417
    .line 418
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 419
    .line 420
    .line 421
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 426
    .line 427
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 428
    .line 429
    .line 430
    move-result-wide v6

    .line 431
    const/4 v2, 0x0

    .line 432
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 436
    .line 437
    .line 438
    move-result v10

    .line 439
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 440
    .line 441
    .line 442
    move-result v11

    .line 443
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 446
    .line 447
    .line 448
    const v4, 0x404b851f    # 3.18f

    .line 449
    .line 450
    .line 451
    const v6, 0x415b851f    # 13.72f

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 455
    .line 456
    .line 457
    const v4, 0x3ff70a3d    # 1.93f

    .line 458
    .line 459
    .line 460
    const/high16 v6, -0x40800000    # -1.0f

    .line 461
    .line 462
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 463
    .line 464
    .line 465
    const v25, -0x420a3d71    # -0.12f

    .line 466
    .line 467
    .line 468
    const v26, 0x3f9851ec    # 1.19f

    .line 469
    .line 470
    .line 471
    const v21, -0x41bd70a4    # -0.19f

    .line 472
    .line 473
    .line 474
    const v22, 0x3eb851ec    # 0.36f

    .line 475
    .line 476
    .line 477
    const v23, -0x41947ae1    # -0.23f

    .line 478
    .line 479
    .line 480
    const v24, 0x3f47ae14    # 0.78f

    .line 481
    .line 482
    .line 483
    move-object/from16 v20, v2

    .line 484
    .line 485
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 486
    .line 487
    .line 488
    const v25, 0x401851ec    # 2.38f

    .line 489
    .line 490
    .line 491
    const v26, 0x3f70a3d7    # 0.94f

    .line 492
    .line 493
    .line 494
    const v21, 0x3e947ae1    # 0.29f

    .line 495
    .line 496
    .line 497
    const v22, 0x3f8147ae    # 1.01f

    .line 498
    .line 499
    .line 500
    const v23, 0x3fb70a3d    # 1.43f

    .line 501
    .line 502
    .line 503
    const v24, 0x3fb47ae1    # 1.41f

    .line 504
    .line 505
    .line 506
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const v4, -0x40fae148    # -0.52f

    .line 510
    .line 511
    .line 512
    const v6, 0x3f866666    # 1.05f

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v4, -0x3fa0a3d7    # -3.49f

    .line 519
    .line 520
    .line 521
    const v6, -0x404ccccd    # -1.4f

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v25, 0x404b851f    # 3.18f

    .line 528
    .line 529
    .line 530
    const v26, 0x415b851f    # 13.72f

    .line 531
    .line 532
    .line 533
    const v21, 0x407b851f    # 3.93f

    .line 534
    .line 535
    .line 536
    const v22, 0x4155eb85    # 13.37f

    .line 537
    .line 538
    .line 539
    const v23, 0x405851ec    # 3.38f

    .line 540
    .line 541
    .line 542
    const v24, 0x415570a4    # 13.34f

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    const/high16 v6, 0x3f800000    # 1.0f

    .line 556
    .line 557
    const/4 v7, 0x0

    .line 558
    const-string v4, ""

    .line 559
    .line 560
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 561
    .line 562
    .line 563
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 568
    .line 569
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 570
    .line 571
    .line 572
    move-result-wide v6

    .line 573
    const/4 v0, 0x0

    .line 574
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 578
    .line 579
    .line 580
    move-result v10

    .line 581
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 582
    .line 583
    .line 584
    move-result v11

    .line 585
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 588
    .line 589
    .line 590
    const v0, 0x41ae8f5c    # 21.82f

    .line 591
    .line 592
    .line 593
    const v2, 0x417a6666    # 15.65f

    .line 594
    .line 595
    .line 596
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 597
    .line 598
    .line 599
    const v0, -0x4008f5c3    # -1.93f

    .line 600
    .line 601
    .line 602
    const/high16 v2, -0x40800000    # -1.0f

    .line 603
    .line 604
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    .line 607
    const v17, -0x40970a3d    # -0.91f

    .line 608
    .line 609
    .line 610
    const v18, 0x3d23d70a    # 0.04f

    .line 611
    .line 612
    .line 613
    const v13, -0x41b33333    # -0.2f

    .line 614
    .line 615
    .line 616
    const v14, -0x413d70a4    # -0.38f

    .line 617
    .line 618
    .line 619
    const/high16 v15, -0x40c00000    # -0.75f

    .line 620
    .line 621
    const v16, -0x414ccccd    # -0.35f

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, 0x405f5c29    # 3.49f

    .line 628
    .line 629
    .line 630
    const v2, -0x404ccccd    # -1.4f

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const v0, 0x3f051eb8    # 0.52f

    .line 637
    .line 638
    .line 639
    const v2, 0x3f866666    # 1.05f

    .line 640
    .line 641
    .line 642
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 643
    .line 644
    .line 645
    const v17, 0x401851ec    # 2.38f

    .line 646
    .line 647
    .line 648
    const v18, -0x408f5c29    # -0.94f

    .line 649
    .line 650
    .line 651
    const v13, 0x3f70a3d7    # 0.94f

    .line 652
    .line 653
    .line 654
    const v14, 0x3ef0a3d7    # 0.47f

    .line 655
    .line 656
    .line 657
    const v15, 0x4005c28f    # 2.09f

    .line 658
    .line 659
    .line 660
    const v16, 0x3d8f5c29    # 0.07f

    .line 661
    .line 662
    .line 663
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    .line 666
    const v17, 0x41ae8f5c    # 21.82f

    .line 667
    .line 668
    .line 669
    const v18, 0x417a6666    # 15.65f

    .line 670
    .line 671
    .line 672
    const v13, 0x41b06666    # 22.05f

    .line 673
    .line 674
    .line 675
    const v14, 0x418370a4    # 16.43f

    .line 676
    .line 677
    .line 678
    const v15, 0x41b0147b    # 22.01f

    .line 679
    .line 680
    .line 681
    const v16, 0x4180147b    # 16.01f

    .line 682
    .line 683
    .line 684
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    const/16 v16, 0x3800

    .line 695
    .line 696
    const/16 v17, 0x0

    .line 697
    .line 698
    const/high16 v6, 0x3f800000    # 1.0f

    .line 699
    .line 700
    const/4 v7, 0x0

    .line 701
    const/high16 v12, 0x3f800000    # 1.0f

    .line 702
    .line 703
    const/4 v13, 0x0

    .line 704
    const/4 v14, 0x0

    .line 705
    const/4 v15, 0x0

    .line 706
    const-string v4, ""

    .line 707
    .line 708
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    sput-object v0, Landroidx/compose/material/icons/rounded/BakeryDiningKt;->_bakeryDining:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 717
    .line 718
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 719
    .line 720
    .line 721
    return-object v0
.end method

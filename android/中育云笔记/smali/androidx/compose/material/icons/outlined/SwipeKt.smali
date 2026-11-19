.class public final Landroidx/compose/material/icons/outlined/SwipeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipe:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipe(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/SwipeKt;->_swipe:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Swipe"

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
    const/high16 v4, 0x41a40000    # 20.5f

    .line 71
    .line 72
    const/high16 v6, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x400147ae    # 2.02f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v25, 0x41400000    # 12.0f

    .line 84
    .line 85
    const/high16 v26, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const v21, 0x419170a4    # 18.18f

    .line 88
    .line 89
    .line 90
    const v22, 0x400851ec    # 2.13f

    .line 91
    .line 92
    .line 93
    const v23, 0x4173851f    # 15.22f

    .line 94
    .line 95
    .line 96
    const/high16 v24, 0x3f800000    # 1.0f

    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const v4, 0x400851ec    # 2.13f

    .line 104
    .line 105
    .line 106
    const v6, 0x4080a3d7    # 4.02f

    .line 107
    .line 108
    .line 109
    const/high16 v7, 0x40600000    # 3.5f

    .line 110
    .line 111
    const v8, 0x40ba3d71    # 5.82f

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const/high16 v4, 0x40000000    # 2.0f

    .line 118
    .line 119
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x40600000    # 3.5f

    .line 126
    .line 127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x40e00000    # 7.0f

    .line 131
    .line 132
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v4, 0x40e00000    # 7.0f

    .line 141
    .line 142
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v4, 0x40b00000    # 5.5f

    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x4082e148    # 4.09f

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v25, 0x40fd1eb8    # 7.91f

    .line 157
    .line 158
    .line 159
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 160
    .line 161
    const v21, 0x40070a3d    # 2.11f

    .line 162
    .line 163
    .line 164
    const v22, -0x4011eb85    # -1.86f

    .line 165
    .line 166
    .line 167
    const v23, 0x409c28f6    # 4.88f

    .line 168
    .line 169
    .line 170
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 171
    .line 172
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    const v4, 0x40fd1eb8    # 7.91f

    .line 176
    .line 177
    .line 178
    const/high16 v6, 0x40400000    # 3.0f

    .line 179
    .line 180
    const v7, 0x40b947ae    # 5.79f

    .line 181
    .line 182
    .line 183
    const v8, 0x3f91eb85    # 1.14f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41880000    # 17.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x40e00000    # 7.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v4, 0x40600000    # 3.5f

    .line 200
    .line 201
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x41b00000    # 22.0f

    .line 205
    .line 206
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v4, 0x40b00000    # 5.5f

    .line 210
    .line 211
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v4, 0x40000000    # 2.0f

    .line 215
    .line 216
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const/high16 v4, 0x41a40000    # 20.5f

    .line 220
    .line 221
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    const/16 v16, 0x3800

    .line 232
    .line 233
    const/16 v17, 0x0

    .line 234
    .line 235
    const/high16 v6, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/high16 v8, 0x3f800000    # 1.0f

    .line 238
    .line 239
    const/4 v7, 0x0

    .line 240
    const/high16 v9, 0x3f800000    # 1.0f

    .line 241
    .line 242
    const/high16 v12, 0x3f800000    # 1.0f

    .line 243
    .line 244
    const/4 v13, 0x0

    .line 245
    const/4 v14, 0x0

    .line 246
    const/4 v15, 0x0

    .line 247
    const-string v4, ""

    .line 248
    .line 249
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 250
    .line 251
    .line 252
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 257
    .line 258
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 259
    .line 260
    .line 261
    move-result-wide v6

    .line 262
    const/4 v0, 0x0

    .line 263
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 277
    .line 278
    .line 279
    const v0, 0x41971eb8    # 18.89f

    .line 280
    .line 281
    .line 282
    const v2, 0x415c51ec    # 13.77f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v0, -0x3f8ccccd    # -3.8f

    .line 289
    .line 290
    .line 291
    const v2, -0x402a3d71    # -1.67f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v17, 0x416a6666    # 14.65f

    .line 298
    .line 299
    .line 300
    const/high16 v18, 0x41400000    # 12.0f

    .line 301
    .line 302
    const v13, 0x416f5c29    # 14.96f

    .line 303
    .line 304
    .line 305
    const v14, 0x4140a3d7    # 12.04f

    .line 306
    .line 307
    .line 308
    const v15, 0x416cf5c3    # 14.81f

    .line 309
    .line 310
    .line 311
    const/high16 v16, 0x41400000    # 12.0f

    .line 312
    .line 313
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v0, 0x41600000    # 14.0f

    .line 317
    .line 318
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/4 v0, 0x0

    .line 322
    const v2, -0x3f7428f6    # -4.37f

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, -0x3feeb852    # -2.27f

    .line 329
    .line 330
    .line 331
    const v18, -0x3fd851ec    # -2.62f

    .line 332
    .line 333
    .line 334
    const/4 v13, 0x0

    .line 335
    const v14, -0x40570a3d    # -1.32f

    .line 336
    .line 337
    .line 338
    const v15, -0x408a3d71    # -0.96f

    .line 339
    .line 340
    .line 341
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 342
    .line 343
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v17, 0x41100000    # 9.0f

    .line 347
    .line 348
    const/high16 v18, 0x40f00000    # 7.5f

    .line 349
    .line 350
    const/high16 v13, 0x41240000    # 10.25f

    .line 351
    .line 352
    const v14, 0x409c28f6    # 4.88f

    .line 353
    .line 354
    .line 355
    const/high16 v15, 0x41100000    # 9.0f

    .line 356
    .line 357
    const v16, 0x40c1999a    # 6.05f

    .line 358
    .line 359
    .line 360
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const v0, 0x41026666    # 8.15f

    .line 364
    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const v0, -0x4010a3d7    # -1.87f

    .line 370
    .line 371
    .line 372
    const v2, -0x41333333    # -0.4f

    .line 373
    .line 374
    .line 375
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v17, -0x40228f5c    # -1.73f

    .line 379
    .line 380
    .line 381
    const v18, 0x3f0f5c29    # 0.56f

    .line 382
    .line 383
    .line 384
    const v13, -0x41bd70a4    # -0.19f

    .line 385
    .line 386
    .line 387
    const v14, -0x430a3d71    # -0.03f

    .line 388
    .line 389
    .line 390
    const v15, -0x407d70a4    # -1.02f

    .line 391
    .line 392
    .line 393
    const v16, -0x41e66666    # -0.15f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x40800000    # 4.0f

    .line 400
    .line 401
    const v2, 0x4189c28f    # 17.22f

    .line 402
    .line 403
    .line 404
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v0, 0x40a3d70a    # 5.12f

    .line 408
    .line 409
    .line 410
    const v2, 0x40a6147b    # 5.19f

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 414
    .line 415
    .line 416
    const v17, 0x41287ae1    # 10.53f

    .line 417
    .line 418
    .line 419
    const/high16 v18, 0x41b80000    # 23.0f

    .line 420
    .line 421
    const v13, 0x4117d70a    # 9.49f

    .line 422
    .line 423
    .line 424
    const v14, 0x41b651ec    # 22.79f

    .line 425
    .line 426
    .line 427
    const/high16 v15, 0x41200000    # 10.0f

    .line 428
    .line 429
    const/high16 v16, 0x41b80000    # 23.0f

    .line 430
    .line 431
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 432
    .line 433
    .line 434
    const v0, 0x40d1999a    # 6.55f

    .line 435
    .line 436
    .line 437
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    const v17, 0x3ffc28f6    # 1.97f

    .line 441
    .line 442
    .line 443
    const v18, -0x402a3d71    # -1.67f

    .line 444
    .line 445
    .line 446
    const v13, 0x3f7ae148    # 0.98f

    .line 447
    .line 448
    .line 449
    const/4 v14, 0x0

    .line 450
    const v15, 0x3fe7ae14    # 1.81f

    .line 451
    .line 452
    .line 453
    const v16, -0x40cccccd    # -0.7f

    .line 454
    .line 455
    .line 456
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v0, 0x3f6b851f    # 0.92f

    .line 460
    .line 461
    .line 462
    const v2, -0x3f51eb85    # -5.44f

    .line 463
    .line 464
    .line 465
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const v17, 0x41971eb8    # 18.89f

    .line 469
    .line 470
    .line 471
    const v18, 0x415c51ec    # 13.77f

    .line 472
    .line 473
    .line 474
    const v13, 0x41a0f5c3    # 20.12f

    .line 475
    .line 476
    .line 477
    const v14, 0x41707ae1    # 15.03f

    .line 478
    .line 479
    .line 480
    const v15, 0x419d70a4    # 19.68f

    .line 481
    .line 482
    .line 483
    const v16, 0x4162b852    # 14.17f

    .line 484
    .line 485
    .line 486
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v0, 0x4178f5c3    # 15.56f

    .line 493
    .line 494
    .line 495
    const/high16 v2, 0x41900000    # 18.0f

    .line 496
    .line 497
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const v0, 0x4188a3d7    # 17.08f

    .line 501
    .line 502
    .line 503
    const/high16 v2, 0x41a80000    # 21.0f

    .line 504
    .line 505
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 506
    .line 507
    .line 508
    const v0, -0x3f2e6666    # -6.55f

    .line 509
    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const v0, -0x3f933333    # -3.7f

    .line 515
    .line 516
    .line 517
    const v2, -0x3f8e147b    # -3.78f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const/high16 v0, 0x41300000    # 11.0f

    .line 524
    .line 525
    const v2, 0x4190e148    # 18.11f

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, 0x40f00000    # 7.5f

    .line 532
    .line 533
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 534
    .line 535
    .line 536
    const/high16 v17, 0x41380000    # 11.5f

    .line 537
    .line 538
    const/high16 v18, 0x40e00000    # 7.0f

    .line 539
    .line 540
    const/high16 v13, 0x41300000    # 11.0f

    .line 541
    .line 542
    const v14, 0x40e70a3d    # 7.22f

    .line 543
    .line 544
    .line 545
    const v15, 0x4133851f    # 11.22f

    .line 546
    .line 547
    .line 548
    const/high16 v16, 0x40e00000    # 7.0f

    .line 549
    .line 550
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    const v0, 0x40e70a3d    # 7.22f

    .line 554
    .line 555
    .line 556
    const/high16 v2, 0x41400000    # 12.0f

    .line 557
    .line 558
    const/high16 v4, 0x40f00000    # 7.5f

    .line 559
    .line 560
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v0, 0x40c5c28f    # 6.18f

    .line 564
    .line 565
    .line 566
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v0, 0x3fe147ae    # 1.76f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, 0x4178f5c3    # 15.56f

    .line 576
    .line 577
    .line 578
    const/high16 v2, 0x41900000    # 18.0f

    .line 579
    .line 580
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    const/16 v16, 0x3800

    .line 591
    .line 592
    const/16 v17, 0x0

    .line 593
    .line 594
    const/high16 v6, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/4 v7, 0x0

    .line 597
    const/high16 v12, 0x3f800000    # 1.0f

    .line 598
    .line 599
    const/4 v13, 0x0

    .line 600
    const/4 v14, 0x0

    .line 601
    const/4 v15, 0x0

    .line 602
    const-string v4, ""

    .line 603
    .line 604
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    sput-object v0, Landroidx/compose/material/icons/outlined/SwipeKt;->_swipe:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 613
    .line 614
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    return-object v0
.end method

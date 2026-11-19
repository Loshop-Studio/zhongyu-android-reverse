.class public final Landroidx/compose/material/icons/rounded/SwipeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipe:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipe(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SwipeKt;->_swipe:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Swipe"

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
    const v4, 0x41a93333    # 21.15f

    .line 71
    .line 72
    .line 73
    const v6, 0x40366666    # 2.85f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, -0x407d70a4    # -1.02f

    .line 80
    .line 81
    .line 82
    const v6, 0x3f828f5c    # 1.02f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v25, 0x41400000    # 12.0f

    .line 89
    .line 90
    const/high16 v26, 0x3f800000    # 1.0f

    .line 91
    .line 92
    const v21, 0x4195851f    # 18.69f

    .line 93
    .line 94
    .line 95
    const v22, 0x400ae148    # 2.17f

    .line 96
    .line 97
    .line 98
    const v23, 0x4179999a    # 15.6f

    .line 99
    .line 100
    .line 101
    const/high16 v24, 0x3f800000    # 1.0f

    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v4, 0x40a9eb85    # 5.31f

    .line 109
    .line 110
    .line 111
    const v6, 0x400ae148    # 2.17f

    .line 112
    .line 113
    .line 114
    const v7, 0x4077ae14    # 3.87f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v4, v6, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v4, 0x40366666    # 2.85f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v25, 0x40000000    # 2.0f

    .line 127
    .line 128
    const v26, 0x404d70a4    # 3.21f

    .line 129
    .line 130
    .line 131
    const v21, 0x40228f5c    # 2.54f

    .line 132
    .line 133
    .line 134
    const v22, 0x40228f5c    # 2.54f

    .line 135
    .line 136
    .line 137
    const/high16 v23, 0x40000000    # 2.0f

    .line 138
    .line 139
    const v24, 0x4030a3d7    # 2.76f

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const/high16 v4, 0x40d00000    # 6.5f

    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, 0x40200000    # 2.5f

    .line 151
    .line 152
    const/high16 v26, 0x40e00000    # 7.0f

    .line 153
    .line 154
    const/high16 v21, 0x40000000    # 2.0f

    .line 155
    .line 156
    const v22, 0x40d8f5c3    # 6.78f

    .line 157
    .line 158
    .line 159
    const v23, 0x400e147b    # 2.22f

    .line 160
    .line 161
    .line 162
    const/high16 v24, 0x40e00000    # 7.0f

    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x40528f5c    # 3.29f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v25, 0x3eb33333    # 0.35f

    .line 174
    .line 175
    .line 176
    const v26, -0x40a66666    # -0.85f

    .line 177
    .line 178
    .line 179
    const v21, 0x3ee66666    # 0.45f

    .line 180
    .line 181
    .line 182
    const/16 v22, 0x0

    .line 183
    .line 184
    const v23, 0x3f2b851f    # 0.67f

    .line 185
    .line 186
    .line 187
    const v24, -0x40f5c28f    # -0.54f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v4, 0x409dc28f    # 4.93f

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v25, 0x40e23d71    # 7.07f

    .line 200
    .line 201
    .line 202
    const v26, -0x3fe47ae1    # -2.43f

    .line 203
    .line 204
    .line 205
    const/high16 v21, 0x3f800000    # 1.0f

    .line 206
    .line 207
    const v22, -0x405ae148    # -1.29f

    .line 208
    .line 209
    .line 210
    const v23, 0x406ccccd    # 3.7f

    .line 211
    .line 212
    .line 213
    const v24, -0x3fe47ae1    # -2.43f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, 0x40e23d71    # 7.07f

    .line 220
    .line 221
    .line 222
    const v6, 0x401b851f    # 2.43f

    .line 223
    .line 224
    .line 225
    const v7, 0x40c23d71    # 6.07f

    .line 226
    .line 227
    .line 228
    const v8, 0x3f91eb85    # 1.14f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    const v4, -0x4063d70a    # -1.22f

    .line 235
    .line 236
    .line 237
    const v6, 0x3f9c28f6    # 1.22f

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v25, 0x4191ae14    # 18.21f

    .line 244
    .line 245
    .line 246
    const/high16 v26, 0x40e00000    # 7.0f

    .line 247
    .line 248
    const v21, 0x418c51ec    # 17.54f

    .line 249
    .line 250
    .line 251
    const v22, 0x40ceb852    # 6.46f

    .line 252
    .line 253
    .line 254
    const v23, 0x418e147b    # 17.76f

    .line 255
    .line 256
    .line 257
    const/high16 v24, 0x40e00000    # 7.0f

    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, 0x40528f5c    # 3.29f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v25, 0x41b00000    # 22.0f

    .line 269
    .line 270
    const/high16 v26, 0x40d00000    # 6.5f

    .line 271
    .line 272
    const v21, 0x41ae3d71    # 21.78f

    .line 273
    .line 274
    .line 275
    const/high16 v22, 0x40e00000    # 7.0f

    .line 276
    .line 277
    const/high16 v23, 0x41b00000    # 22.0f

    .line 278
    .line 279
    const v24, 0x40d8f5c3    # 6.78f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, 0x404d70a4    # 3.21f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v25, 0x41a93333    # 21.15f

    .line 292
    .line 293
    .line 294
    const v26, 0x40366666    # 2.85f

    .line 295
    .line 296
    .line 297
    const/high16 v21, 0x41b00000    # 22.0f

    .line 298
    .line 299
    const v22, 0x4030a3d7    # 2.76f

    .line 300
    .line 301
    .line 302
    const v23, 0x41abae14    # 21.46f

    .line 303
    .line 304
    .line 305
    const v24, 0x40228f5c    # 2.54f

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    const/16 v16, 0x3800

    .line 319
    .line 320
    const/16 v17, 0x0

    .line 321
    .line 322
    const/high16 v6, 0x3f800000    # 1.0f

    .line 323
    .line 324
    const/high16 v8, 0x3f800000    # 1.0f

    .line 325
    .line 326
    const/4 v7, 0x0

    .line 327
    const/high16 v9, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const/high16 v12, 0x3f800000    # 1.0f

    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const/4 v14, 0x0

    .line 333
    const/4 v15, 0x0

    .line 334
    const-string v4, ""

    .line 335
    .line 336
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 337
    .line 338
    .line 339
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 344
    .line 345
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 346
    .line 347
    .line 348
    move-result-wide v6

    .line 349
    const/4 v0, 0x0

    .line 350
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 358
    .line 359
    .line 360
    move-result v11

    .line 361
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 364
    .line 365
    .line 366
    const v0, 0x414b5c29    # 12.71f

    .line 367
    .line 368
    .line 369
    const/high16 v2, 0x41680000    # 14.5f

    .line 370
    .line 371
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v17, -0x409c28f6    # -0.89f

    .line 375
    .line 376
    .line 377
    const v18, -0x41a8f5c3    # -0.21f

    .line 378
    .line 379
    .line 380
    const v13, -0x4170a3d7    # -0.28f

    .line 381
    .line 382
    .line 383
    const v14, -0x41f0a3d7    # -0.14f

    .line 384
    .line 385
    .line 386
    const v15, -0x40eb851f    # -0.58f

    .line 387
    .line 388
    .line 389
    const v16, -0x41a8f5c3    # -0.21f

    .line 390
    .line 391
    .line 392
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41500000    # 13.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, -0x3f400000    # -6.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/high16 v17, 0x41380000    # 11.5f

    .line 406
    .line 407
    const/high16 v18, 0x40a00000    # 5.0f

    .line 408
    .line 409
    const/high16 v13, 0x41500000    # 13.0f

    .line 410
    .line 411
    const v14, 0x40b570a4    # 5.67f

    .line 412
    .line 413
    .line 414
    const v15, 0x414547ae    # 12.33f

    .line 415
    .line 416
    .line 417
    const/high16 v16, 0x40a00000    # 5.0f

    .line 418
    .line 419
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x40b570a4    # 5.67f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x41200000    # 10.0f

    .line 426
    .line 427
    const/high16 v4, 0x40d00000    # 6.5f

    .line 428
    .line 429
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    .line 432
    const v0, 0x412bd70a    # 10.74f

    .line 433
    .line 434
    .line 435
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const v0, -0x3fa3d70a    # -3.44f

    .line 439
    .line 440
    .line 441
    const v2, -0x40c7ae14    # -0.72f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v17, -0x407c28f6    # -1.03f

    .line 448
    .line 449
    .line 450
    const v18, 0x3e9eb852    # 0.31f

    .line 451
    .line 452
    .line 453
    const v13, -0x41428f5c    # -0.37f

    .line 454
    .line 455
    .line 456
    const v14, -0x425c28f6    # -0.08f

    .line 457
    .line 458
    .line 459
    const v15, -0x40bd70a4    # -0.76f

    .line 460
    .line 461
    .line 462
    const v16, 0x3d23d70a    # 0.04f

    .line 463
    .line 464
    .line 465
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 466
    .line 467
    .line 468
    const/4 v0, 0x0

    .line 469
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x3c23d70a    # 0.01f

    .line 473
    .line 474
    .line 475
    const v18, 0x3fca3d71    # 1.58f

    .line 476
    .line 477
    .line 478
    const v13, -0x4123d70a    # -0.43f

    .line 479
    .line 480
    .line 481
    const v14, 0x3ee147ae    # 0.44f

    .line 482
    .line 483
    .line 484
    const v15, -0x4123d70a    # -0.43f

    .line 485
    .line 486
    .line 487
    const v16, 0x3f91eb85    # 1.14f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const v0, 0x408051ec    # 4.01f

    .line 494
    .line 495
    .line 496
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v17, 0x412f5c29    # 10.96f

    .line 500
    .line 501
    .line 502
    const/high16 v18, 0x41b80000    # 23.0f

    .line 503
    .line 504
    const v13, 0x411eb852    # 9.92f

    .line 505
    .line 506
    .line 507
    const v14, 0x41b651ec    # 22.79f

    .line 508
    .line 509
    .line 510
    const v15, 0x4126e148    # 10.43f

    .line 511
    .line 512
    .line 513
    const/high16 v16, 0x41b80000    # 23.0f

    .line 514
    .line 515
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    const v0, 0x40cd1eb8    # 6.41f

    .line 519
    .line 520
    .line 521
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 522
    .line 523
    .line 524
    const v17, 0x3ffd70a4    # 1.98f

    .line 525
    .line 526
    .line 527
    const v18, -0x4023d70a    # -1.72f

    .line 528
    .line 529
    .line 530
    const/high16 v13, 0x3f800000    # 1.0f

    .line 531
    .line 532
    const/4 v14, 0x0

    .line 533
    const v15, 0x3feb851f    # 1.84f

    .line 534
    .line 535
    .line 536
    const v16, -0x40c51eb8    # -0.73f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const v0, 0x3f2147ae    # 0.63f

    .line 543
    .line 544
    .line 545
    const v2, -0x3f7147ae    # -4.46f

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const v17, -0x40747ae1    # -1.09f

    .line 552
    .line 553
    .line 554
    const v18, -0x3ffb851f    # -2.07f

    .line 555
    .line 556
    .line 557
    const v13, 0x3df5c28f    # 0.12f

    .line 558
    .line 559
    .line 560
    const v14, -0x40a66666    # -0.85f

    .line 561
    .line 562
    .line 563
    const v15, -0x415c28f6    # -0.32f

    .line 564
    .line 565
    .line 566
    const v16, -0x4027ae14    # -1.69f

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const v0, 0x414b5c29    # 12.71f

    .line 573
    .line 574
    .line 575
    const/high16 v2, 0x41680000    # 14.5f

    .line 576
    .line 577
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    const/16 v16, 0x3800

    .line 588
    .line 589
    const/16 v17, 0x0

    .line 590
    .line 591
    const/high16 v6, 0x3f800000    # 1.0f

    .line 592
    .line 593
    const/4 v7, 0x0

    .line 594
    const/high16 v12, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/4 v13, 0x0

    .line 597
    const/4 v14, 0x0

    .line 598
    const/4 v15, 0x0

    .line 599
    const-string v4, ""

    .line 600
    .line 601
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    sput-object v0, Landroidx/compose/material/icons/rounded/SwipeKt;->_swipe:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 610
    .line 611
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    return-object v0
.end method

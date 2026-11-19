.class public final Landroidx/compose/material/icons/twotone/FireplaceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _fireplace:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFireplace(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/FireplaceKt;->_fireplace:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Fireplace"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a00000    # 20.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40000000    # 2.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, -0x40000000    # -2.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v4, 0x400eb852    # 2.23f

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const v25, -0x40628f5c    # -1.23f

    .line 94
    .line 95
    .line 96
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 97
    .line 98
    const/high16 v21, -0x40c00000    # -0.75f

    .line 99
    .line 100
    const v22, -0x4091eb85    # -0.93f

    .line 101
    .line 102
    .line 103
    const v23, -0x40666666    # -1.2f

    .line 104
    .line 105
    .line 106
    const v24, -0x3ffd70a4    # -2.04f

    .line 107
    .line 108
    .line 109
    move-object/from16 v20, v2

    .line 110
    .line 111
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v25, 0x40c00000    # 6.0f

    .line 115
    .line 116
    const/high16 v26, -0x3f000000    # -8.0f

    .line 117
    .line 118
    const v21, -0x435c28f6    # -0.02f

    .line 119
    .line 120
    .line 121
    const v22, -0x40f851ec    # -0.53f

    .line 122
    .line 123
    .line 124
    const v23, -0x40c51eb8    # -0.73f

    .line 125
    .line 126
    .line 127
    const v24, -0x3f723d71    # -4.43f

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v25, 0x4009999a    # 2.15f

    .line 134
    .line 135
    .line 136
    const v26, 0x409428f6    # 4.63f

    .line 137
    .line 138
    .line 139
    const/16 v21, 0x0

    .line 140
    .line 141
    const/16 v22, 0x0

    .line 142
    .line 143
    const v23, -0x40b33333    # -0.8f

    .line 144
    .line 145
    .line 146
    const v24, 0x40270a3d    # 2.61f

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v25, 0x41880000    # 17.0f

    .line 153
    .line 154
    const/high16 v26, 0x41700000    # 15.0f

    .line 155
    .line 156
    const v21, 0x417e8f5c    # 15.91f

    .line 157
    .line 158
    .line 159
    const v22, 0x41426666    # 12.15f

    .line 160
    .line 161
    .line 162
    const/high16 v23, 0x41880000    # 17.0f

    .line 163
    .line 164
    const v24, 0x4151c28f    # 13.11f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v25, -0x407d70a4    # -1.02f

    .line 171
    .line 172
    .line 173
    const/high16 v26, 0x40400000    # 3.0f

    .line 174
    .line 175
    const/16 v21, 0x0

    .line 176
    .line 177
    const v22, 0x3f90a3d7    # 1.13f

    .line 178
    .line 179
    .line 180
    const v23, -0x413851ec    # -0.39f

    .line 181
    .line 182
    .line 183
    const v24, 0x400a3d71    # 2.16f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const/high16 v4, 0x41900000    # 18.0f

    .line 190
    .line 191
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const/high16 v4, 0x40000000    # 2.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v4, 0x40800000    # 4.0f

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v4, 0x41a00000    # 20.0f

    .line 211
    .line 212
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const/16 v16, 0x3800

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const v6, 0x3e99999a    # 0.3f

    .line 227
    .line 228
    .line 229
    const v8, 0x3e99999a    # 0.3f

    .line 230
    .line 231
    .line 232
    const/4 v7, 0x0

    .line 233
    const/high16 v9, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const/high16 v12, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    const/4 v14, 0x0

    .line 239
    const/4 v15, 0x0

    .line 240
    const-string v4, ""

    .line 241
    .line 242
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 243
    .line 244
    .line 245
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 250
    .line 251
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 252
    .line 253
    .line 254
    move-result-wide v6

    .line 255
    const/4 v2, 0x0

    .line 256
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 264
    .line 265
    .line 266
    move-result v11

    .line 267
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    const v4, 0x414028f6    # 12.01f

    .line 273
    .line 274
    .line 275
    const v6, 0x41475c29    # 12.46f

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const v25, -0x425c28f6    # -0.08f

    .line 282
    .line 283
    .line 284
    const v26, 0x3fa3d70a    # 1.28f

    .line 285
    .line 286
    .line 287
    const v21, -0x41e66666    # -0.15f

    .line 288
    .line 289
    .line 290
    const v22, 0x3ed70a3d    # 0.42f

    .line 291
    .line 292
    .line 293
    const v23, -0x41e66666    # -0.15f

    .line 294
    .line 295
    .line 296
    const v24, 0x3f51eb85    # 0.82f

    .line 297
    .line 298
    .line 299
    move-object/from16 v20, v2

    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v25, 0x3e4ccccd    # 0.2f

    .line 305
    .line 306
    .line 307
    const v26, 0x3fcccccd    # 1.6f

    .line 308
    .line 309
    .line 310
    const v21, 0x3dcccccd    # 0.1f

    .line 311
    .line 312
    .line 313
    const v22, 0x3f0ccccd    # 0.55f

    .line 314
    .line 315
    .line 316
    const v23, 0x3ea8f5c3    # 0.33f

    .line 317
    .line 318
    .line 319
    const v24, 0x3f851eb8    # 1.04f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const v25, -0x403c28f6    # -1.53f

    .line 326
    .line 327
    .line 328
    const v26, 0x3fd0a3d7    # 1.63f

    .line 329
    .line 330
    .line 331
    const v21, -0x41fae148    # -0.13f

    .line 332
    .line 333
    .line 334
    const v22, 0x3f170a3d    # 0.59f

    .line 335
    .line 336
    .line 337
    const v23, -0x40bae148    # -0.77f

    .line 338
    .line 339
    .line 340
    const v24, 0x3fb0a3d7    # 1.38f

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const v25, 0x4058f5c3    # 3.39f

    .line 347
    .line 348
    .line 349
    const v26, -0x40570a3d    # -1.32f

    .line 350
    .line 351
    .line 352
    const v21, 0x3fa3d70a    # 1.28f

    .line 353
    .line 354
    .line 355
    const v22, 0x3f866666    # 1.05f

    .line 356
    .line 357
    .line 358
    const v23, 0x404ccccd    # 3.2f

    .line 359
    .line 360
    .line 361
    const v24, 0x3ebd70a4    # 0.37f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v25, 0x414028f6    # 12.01f

    .line 368
    .line 369
    .line 370
    const v26, 0x41475c29    # 12.46f

    .line 371
    .line 372
    .line 373
    const v21, 0x41628f5c    # 14.16f

    .line 374
    .line 375
    .line 376
    const v22, 0x4161c28f    # 14.11f

    .line 377
    .line 378
    .line 379
    const v23, 0x4148cccd    # 12.55f

    .line 380
    .line 381
    .line 382
    const v24, 0x415ab852    # 13.67f

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    const/high16 v6, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/high16 v8, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/4 v7, 0x0

    .line 400
    const-string v4, ""

    .line 401
    .line 402
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 403
    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 410
    .line 411
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 412
    .line 413
    .line 414
    move-result-wide v6

    .line 415
    const/4 v0, 0x0

    .line 416
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 420
    .line 421
    .line 422
    move-result v10

    .line 423
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 424
    .line 425
    .line 426
    move-result v11

    .line 427
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 430
    .line 431
    .line 432
    const/high16 v0, 0x40000000    # 2.0f

    .line 433
    .line 434
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41a00000    # 20.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v0, 0x40000000    # 2.0f

    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v0, 0x41400000    # 12.0f

    .line 457
    .line 458
    const/high16 v2, 0x41900000    # 18.0f

    .line 459
    .line 460
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 464
    .line 465
    const v18, -0x3fbc28f6    # -3.06f

    .line 466
    .line 467
    .line 468
    const v13, -0x4035c28f    # -1.58f

    .line 469
    .line 470
    .line 471
    const v15, -0x3fc1eb85    # -2.97f

    .line 472
    .line 473
    .line 474
    const v16, -0x400f5c29    # -1.88f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, -0x43dc28f6    # -0.01f

    .line 481
    .line 482
    .line 483
    const v18, -0x419eb852    # -0.22f

    .line 484
    .line 485
    .line 486
    const/4 v13, 0x0

    .line 487
    const v14, -0x42b33333    # -0.05f

    .line 488
    .line 489
    .line 490
    const v15, -0x43dc28f6    # -0.01f

    .line 491
    .line 492
    .line 493
    const v16, -0x41fae148    # -0.13f

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const v17, 0x401e147b    # 2.47f

    .line 500
    .line 501
    .line 502
    const v18, -0x3f7428f6    # -4.37f

    .line 503
    .line 504
    .line 505
    const v13, -0x41fae148    # -0.13f

    .line 506
    .line 507
    .line 508
    const v14, -0x40228f5c    # -1.73f

    .line 509
    .line 510
    .line 511
    const/high16 v15, 0x3f800000    # 1.0f

    .line 512
    .line 513
    const v16, -0x3fb33333    # -3.2f

    .line 514
    .line 515
    .line 516
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v17, 0x40247ae1    # 2.57f

    .line 520
    .line 521
    .line 522
    const v18, 0x403ae148    # 2.92f

    .line 523
    .line 524
    .line 525
    const v13, 0x3ef0a3d7    # 0.47f

    .line 526
    .line 527
    .line 528
    const v14, 0x3f8147ae    # 1.01f

    .line 529
    .line 530
    .line 531
    const v15, 0x3fa28f5c    # 1.27f

    .line 532
    .line 533
    .line 534
    const v16, 0x4001eb85    # 2.03f

    .line 535
    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v17, 0x41700000    # 15.0f

    .line 541
    .line 542
    const/high16 v18, 0x41700000    # 15.0f

    .line 543
    .line 544
    const v13, 0x4169c28f    # 14.61f

    .line 545
    .line 546
    .line 547
    const v14, 0x415b0a3d    # 13.69f

    .line 548
    .line 549
    .line 550
    const/high16 v15, 0x41700000    # 15.0f

    .line 551
    .line 552
    const v16, 0x4162147b    # 14.13f

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v17, 0x41400000    # 12.0f

    .line 559
    .line 560
    const/high16 v18, 0x41900000    # 18.0f

    .line 561
    .line 562
    const/high16 v13, 0x41700000    # 15.0f

    .line 563
    .line 564
    const v14, 0x41853333    # 16.65f

    .line 565
    .line 566
    .line 567
    const v15, 0x415a6666    # 13.65f

    .line 568
    .line 569
    .line 570
    const/high16 v16, 0x41900000    # 18.0f

    .line 571
    .line 572
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v0, 0x41a00000    # 20.0f

    .line 579
    .line 580
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    const/high16 v0, -0x40000000    # -2.0f

    .line 584
    .line 585
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v0, -0x3ffeb852    # -2.02f

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const v17, 0x3f828f5c    # 1.02f

    .line 598
    .line 599
    .line 600
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 601
    .line 602
    const v13, 0x3f2147ae    # 0.63f

    .line 603
    .line 604
    .line 605
    const v14, -0x40a8f5c3    # -0.84f

    .line 606
    .line 607
    .line 608
    const v15, 0x3f828f5c    # 1.02f

    .line 609
    .line 610
    .line 611
    const v16, -0x4010a3d7    # -1.87f

    .line 612
    .line 613
    .line 614
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 615
    .line 616
    .line 617
    const v17, -0x40133333    # -1.85f

    .line 618
    .line 619
    .line 620
    const v18, -0x3fa851ec    # -3.37f

    .line 621
    .line 622
    .line 623
    const/4 v13, 0x0

    .line 624
    const v14, -0x400e147b    # -1.89f

    .line 625
    .line 626
    .line 627
    const v15, -0x40747ae1    # -1.09f

    .line 628
    .line 629
    .line 630
    const v16, -0x3fc9999a    # -2.85f

    .line 631
    .line 632
    .line 633
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v17, 0x41500000    # 13.0f

    .line 637
    .line 638
    const/high16 v18, 0x40e00000    # 7.0f

    .line 639
    .line 640
    const v13, 0x41433333    # 12.2f

    .line 641
    .line 642
    .line 643
    const v14, 0x4119c28f    # 9.61f

    .line 644
    .line 645
    .line 646
    const/high16 v15, 0x41500000    # 13.0f

    .line 647
    .line 648
    const/high16 v16, 0x40e00000    # 7.0f

    .line 649
    .line 650
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    const/high16 v17, -0x3f400000    # -6.0f

    .line 654
    .line 655
    const/high16 v18, 0x41000000    # 8.0f

    .line 656
    .line 657
    const v13, -0x3f28a3d7    # -6.73f

    .line 658
    .line 659
    .line 660
    const v14, 0x40647ae1    # 3.57f

    .line 661
    .line 662
    .line 663
    const v15, -0x3f3f5c29    # -6.02f

    .line 664
    .line 665
    .line 666
    const v16, 0x40ef0a3d    # 7.47f

    .line 667
    .line 668
    .line 669
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const v17, 0x3f9d70a4    # 1.23f

    .line 673
    .line 674
    .line 675
    const/high16 v18, 0x40400000    # 3.0f

    .line 676
    .line 677
    const v13, 0x3cf5c28f    # 0.03f

    .line 678
    .line 679
    .line 680
    const v14, 0x3f75c28f    # 0.96f

    .line 681
    .line 682
    .line 683
    const v15, 0x3efae148    # 0.49f

    .line 684
    .line 685
    .line 686
    const v16, 0x40047ae1    # 2.07f

    .line 687
    .line 688
    .line 689
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v0, 0x40c00000    # 6.0f

    .line 693
    .line 694
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const/high16 v0, 0x40000000    # 2.0f

    .line 698
    .line 699
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v0, 0x40800000    # 4.0f

    .line 703
    .line 704
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const/high16 v0, 0x41800000    # 16.0f

    .line 711
    .line 712
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 713
    .line 714
    .line 715
    const/high16 v0, 0x41a00000    # 20.0f

    .line 716
    .line 717
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    sput-object v0, Landroidx/compose/material/icons/twotone/FireplaceKt;->_fireplace:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 750
    .line 751
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    return-object v0
.end method

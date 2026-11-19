.class public final Landroidx/compose/material/icons/twotone/ScreenSearchDesktopKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _screenSearchDesktop:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getScreenSearchDesktop(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ScreenSearchDesktopKt;->_screenSearchDesktop:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ScreenSearchDesktop"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40800000    # 4.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41300000    # 11.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41800000    # 16.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x40a00000    # 5.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x41707ae1    # 15.03f

    .line 101
    .line 102
    .line 103
    const v6, 0x4177851f    # 15.47f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, -0x3ffa3d71    # -2.09f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const v25, -0x3f747ae1    # -4.36f

    .line 116
    .line 117
    .line 118
    const v26, -0x410f5c29    # -0.47f

    .line 119
    .line 120
    .line 121
    const v21, -0x40533333    # -1.35f

    .line 122
    .line 123
    .line 124
    const v22, 0x3f5eb852    # 0.87f

    .line 125
    .line 126
    .line 127
    const v23, -0x3fb51eb8    # -3.17f

    .line 128
    .line 129
    .line 130
    const v24, 0x3f35c28f    # 0.71f

    .line 131
    .line 132
    .line 133
    move-object/from16 v20, v2

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/16 v25, 0x0

    .line 139
    .line 140
    const v26, -0x3f61999a    # -4.95f

    .line 141
    .line 142
    .line 143
    const v21, -0x4050a3d7    # -1.37f

    .line 144
    .line 145
    .line 146
    const v22, -0x4050a3d7    # -1.37f

    .line 147
    .line 148
    .line 149
    const v23, -0x4050a3d7    # -1.37f

    .line 150
    .line 151
    .line 152
    const v24, -0x3f9ae148    # -3.58f

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, 0x409e6666    # 4.95f

    .line 159
    .line 160
    .line 161
    const v6, -0x4050a3d7    # -1.37f

    .line 162
    .line 163
    .line 164
    const v7, 0x40651eb8    # 3.58f

    .line 165
    .line 166
    .line 167
    const/4 v8, 0x0

    .line 168
    invoke-virtual {v2, v7, v6, v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const v25, 0x3ef0a3d7    # 0.47f

    .line 172
    .line 173
    .line 174
    const v26, 0x408b851f    # 4.36f

    .line 175
    .line 176
    .line 177
    const v21, 0x3f970a3d    # 1.18f

    .line 178
    .line 179
    .line 180
    const v22, 0x3f970a3d    # 1.18f

    .line 181
    .line 182
    .line 183
    const v23, 0x3fab851f    # 1.34f

    .line 184
    .line 185
    .line 186
    const/high16 v24, 0x40400000    # 3.0f

    .line 187
    .line 188
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v4, 0x4005c28f    # 2.09f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v4, 0x41707ae1    # 15.03f

    .line 198
    .line 199
    .line 200
    const v6, 0x4177851f    # 15.47f

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    const/16 v16, 0x3800

    .line 214
    .line 215
    const/16 v17, 0x0

    .line 216
    .line 217
    const v6, 0x3e99999a    # 0.3f

    .line 218
    .line 219
    .line 220
    const v8, 0x3e99999a    # 0.3f

    .line 221
    .line 222
    .line 223
    const/4 v7, 0x0

    .line 224
    const/high16 v9, 0x3f800000    # 1.0f

    .line 225
    .line 226
    const/high16 v12, 0x3f800000    # 1.0f

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v14, 0x0

    .line 230
    const/4 v15, 0x0

    .line 231
    const-string v4, ""

    .line 232
    .line 233
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 234
    .line 235
    .line 236
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 243
    .line 244
    .line 245
    move-result-wide v6

    .line 246
    const/4 v2, 0x0

    .line 247
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x41900000    # 18.0f

    .line 264
    .line 265
    const/high16 v6, 0x40800000    # 4.0f

    .line 266
    .line 267
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, 0x41800000    # 16.0f

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v25, 0x3ffeb852    # 1.99f

    .line 276
    .line 277
    .line 278
    const/high16 v26, -0x40000000    # -2.0f

    .line 279
    .line 280
    const v21, 0x3f8ccccd    # 1.1f

    .line 281
    .line 282
    .line 283
    const/16 v22, 0x0

    .line 284
    .line 285
    const v23, 0x3ffeb852    # 1.99f

    .line 286
    .line 287
    .line 288
    const v24, -0x4099999a    # -0.9f

    .line 289
    .line 290
    .line 291
    move-object/from16 v20, v2

    .line 292
    .line 293
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const/high16 v4, 0x41b00000    # 22.0f

    .line 297
    .line 298
    const/high16 v6, 0x40a00000    # 5.0f

    .line 299
    .line 300
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v25, -0x40000000    # -2.0f

    .line 304
    .line 305
    const/16 v21, 0x0

    .line 306
    .line 307
    const v22, -0x40733333    # -1.1f

    .line 308
    .line 309
    .line 310
    const v23, -0x4099999a    # -0.9f

    .line 311
    .line 312
    .line 313
    const/high16 v24, -0x40000000    # -2.0f

    .line 314
    .line 315
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v4, 0x40800000    # 4.0f

    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v25, 0x40000000    # 2.0f

    .line 324
    .line 325
    const/high16 v26, 0x40a00000    # 5.0f

    .line 326
    .line 327
    const v21, 0x4039999a    # 2.9f

    .line 328
    .line 329
    .line 330
    const/high16 v22, 0x40400000    # 3.0f

    .line 331
    .line 332
    const/high16 v23, 0x40000000    # 2.0f

    .line 333
    .line 334
    const v24, 0x4079999a    # 3.9f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x41300000    # 11.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v25, 0x40800000    # 4.0f

    .line 346
    .line 347
    const/high16 v26, 0x41900000    # 18.0f

    .line 348
    .line 349
    const/high16 v21, 0x40000000    # 2.0f

    .line 350
    .line 351
    const v22, 0x4188cccd    # 17.1f

    .line 352
    .line 353
    .line 354
    const v23, 0x4039999a    # 2.9f

    .line 355
    .line 356
    .line 357
    const/high16 v24, 0x41900000    # 18.0f

    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v4, 0x40800000    # 4.0f

    .line 366
    .line 367
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v4, 0x41800000    # 16.0f

    .line 371
    .line 372
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x41300000    # 11.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x40800000    # 4.0f

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v4, 0x40a00000    # 5.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    const/high16 v6, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/high16 v8, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const/4 v7, 0x0

    .line 402
    const-string v4, ""

    .line 403
    .line 404
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 405
    .line 406
    .line 407
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 412
    .line 413
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 414
    .line 415
    .line 416
    move-result-wide v6

    .line 417
    const/4 v2, 0x0

    .line 418
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 422
    .line 423
    .line 424
    move-result v10

    .line 425
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 426
    .line 427
    .line 428
    move-result v11

    .line 429
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 432
    .line 433
    .line 434
    const/high16 v4, 0x3f800000    # 1.0f

    .line 435
    .line 436
    const/high16 v6, 0x41980000    # 19.0f

    .line 437
    .line 438
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v4, 0x41b00000    # 22.0f

    .line 442
    .line 443
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 444
    .line 445
    .line 446
    const/high16 v4, 0x40000000    # 2.0f

    .line 447
    .line 448
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const/high16 v4, -0x3e500000    # -22.0f

    .line 452
    .line 453
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    const/high16 v6, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v7, 0x0

    .line 466
    const-string v4, ""

    .line 467
    .line 468
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 469
    .line 470
    .line 471
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 476
    .line 477
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 478
    .line 479
    .line 480
    move-result-wide v6

    .line 481
    const/4 v0, 0x0

    .line 482
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 486
    .line 487
    .line 488
    move-result v10

    .line 489
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 490
    .line 491
    .line 492
    move-result v11

    .line 493
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 496
    .line 497
    .line 498
    const v0, 0x415f851f    # 13.97f

    .line 499
    .line 500
    .line 501
    const v2, 0x40f0f5c3    # 7.53f

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const v17, -0x3f61999a    # -4.95f

    .line 508
    .line 509
    .line 510
    const/16 v18, 0x0

    .line 511
    .line 512
    const v13, -0x4050a3d7    # -1.37f

    .line 513
    .line 514
    .line 515
    const v14, -0x4050a3d7    # -1.37f

    .line 516
    .line 517
    .line 518
    const v15, -0x3f9ae148    # -3.58f

    .line 519
    .line 520
    .line 521
    const v16, -0x4050a3d7    # -1.37f

    .line 522
    .line 523
    .line 524
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v0, 0x409e6666    # 4.95f

    .line 528
    .line 529
    .line 530
    const v2, -0x4050a3d7    # -1.37f

    .line 531
    .line 532
    .line 533
    const v4, 0x40651eb8    # 3.58f

    .line 534
    .line 535
    .line 536
    const/4 v6, 0x0

    .line 537
    invoke-virtual {v12, v2, v4, v6, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const v17, 0x408b851f    # 4.36f

    .line 541
    .line 542
    .line 543
    const v18, 0x3ef0a3d7    # 0.47f

    .line 544
    .line 545
    .line 546
    const v13, 0x3f970a3d    # 1.18f

    .line 547
    .line 548
    .line 549
    const v14, 0x3f970a3d    # 1.18f

    .line 550
    .line 551
    .line 552
    const/high16 v15, 0x40400000    # 3.0f

    .line 553
    .line 554
    const v16, 0x3fab851f    # 1.34f

    .line 555
    .line 556
    .line 557
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    const v0, 0x4005c28f    # 2.09f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const v0, 0x3f87ae14    # 1.06f

    .line 567
    .line 568
    .line 569
    const v2, -0x407851ec    # -1.06f

    .line 570
    .line 571
    .line 572
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const v0, -0x3ffa3d71    # -2.09f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 579
    .line 580
    .line 581
    const v17, 0x415f851f    # 13.97f

    .line 582
    .line 583
    .line 584
    const v18, 0x40f0f5c3    # 7.53f

    .line 585
    .line 586
    .line 587
    const v13, 0x4174f5c3    # 15.31f

    .line 588
    .line 589
    .line 590
    const v14, 0x41287ae1    # 10.53f

    .line 591
    .line 592
    .line 593
    const v15, 0x41728f5c    # 15.16f

    .line 594
    .line 595
    .line 596
    const v16, 0x410b5c29    # 8.71f

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v0, 0x414e8f5c    # 12.91f

    .line 606
    .line 607
    .line 608
    const v2, 0x41368f5c    # 11.41f

    .line 609
    .line 610
    .line 611
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const v17, -0x3fcae148    # -2.83f

    .line 615
    .line 616
    .line 617
    const/16 v18, 0x0

    .line 618
    .line 619
    const v13, -0x40b851ec    # -0.78f

    .line 620
    .line 621
    .line 622
    const v14, 0x3f47ae14    # 0.78f

    .line 623
    .line 624
    .line 625
    const v15, -0x3ffccccd    # -2.05f

    .line 626
    .line 627
    .line 628
    const v16, 0x3f47ae14    # 0.78f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const/16 v17, 0x0

    .line 635
    .line 636
    const v18, -0x3fcae148    # -2.83f

    .line 637
    .line 638
    .line 639
    const v14, -0x40b851ec    # -0.78f

    .line 640
    .line 641
    .line 642
    const v15, -0x40b851ec    # -0.78f

    .line 643
    .line 644
    .line 645
    const v16, -0x3ffccccd    # -2.05f

    .line 646
    .line 647
    .line 648
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    const v0, -0x40b851ec    # -0.78f

    .line 652
    .line 653
    .line 654
    const v2, 0x40351eb8    # 2.83f

    .line 655
    .line 656
    .line 657
    const/4 v4, 0x0

    .line 658
    const v6, 0x40033333    # 2.05f

    .line 659
    .line 660
    .line 661
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 662
    .line 663
    .line 664
    const v17, 0x414e8f5c    # 12.91f

    .line 665
    .line 666
    .line 667
    const v18, 0x41368f5c    # 11.41f

    .line 668
    .line 669
    .line 670
    const v13, 0x415b0a3d    # 13.69f

    .line 671
    .line 672
    .line 673
    const v14, 0x4115eb85    # 9.37f

    .line 674
    .line 675
    .line 676
    const v15, 0x415b0a3d    # 13.69f

    .line 677
    .line 678
    .line 679
    const v16, 0x412a147b    # 10.63f

    .line 680
    .line 681
    .line 682
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    const/16 v16, 0x3800

    .line 693
    .line 694
    const/16 v17, 0x0

    .line 695
    .line 696
    const/high16 v6, 0x3f800000    # 1.0f

    .line 697
    .line 698
    const/4 v7, 0x0

    .line 699
    const/high16 v12, 0x3f800000    # 1.0f

    .line 700
    .line 701
    const/4 v13, 0x0

    .line 702
    const/4 v14, 0x0

    .line 703
    const/4 v15, 0x0

    .line 704
    const-string v4, ""

    .line 705
    .line 706
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    sput-object v0, Landroidx/compose/material/icons/twotone/ScreenSearchDesktopKt;->_screenSearchDesktop:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 715
    .line 716
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    return-object v0
.end method

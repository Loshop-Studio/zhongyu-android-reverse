.class public final Landroidx/compose/material/icons/outlined/FlipCameraAndroidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _flipCameraAndroid:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getFlipCameraAndroid(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/FlipCameraAndroidKt;->_flipCameraAndroid:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.FlipCameraAndroid"

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
    const/high16 v4, 0x41100000    # 9.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v26, 0x40400000    # 3.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, 0x3fd47ae1    # 1.66f

    .line 84
    .line 85
    .line 86
    const v23, 0x3fab851f    # 1.34f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x40400000    # 3.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, -0x40547ae1    # -1.34f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x40400000    # 3.0f

    .line 100
    .line 101
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 102
    .line 103
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 107
    .line 108
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, 0x412570a4    # 10.34f

    .line 112
    .line 113
    .line 114
    const/high16 v6, 0x41100000    # 9.0f

    .line 115
    .line 116
    const/high16 v7, 0x41400000    # 12.0f

    .line 117
    .line 118
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x41500000    # 13.0f

    .line 125
    .line 126
    const/high16 v6, 0x41400000    # 12.0f

    .line 127
    .line 128
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v25, -0x40800000    # -1.0f

    .line 132
    .line 133
    const/high16 v26, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const v22, 0x3f0ccccd    # 0.55f

    .line 136
    .line 137
    .line 138
    const v23, -0x4119999a    # -0.45f

    .line 139
    .line 140
    .line 141
    const/high16 v24, 0x3f800000    # 1.0f

    .line 142
    .line 143
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const v4, -0x4119999a    # -0.45f

    .line 147
    .line 148
    .line 149
    const/high16 v6, -0x40800000    # -1.0f

    .line 150
    .line 151
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v4, 0x3ee66666    # 0.45f

    .line 155
    .line 156
    .line 157
    const/high16 v6, 0x3f800000    # 1.0f

    .line 158
    .line 159
    const/high16 v7, -0x40800000    # -1.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, 0x41373333    # 11.45f

    .line 165
    .line 166
    .line 167
    const/high16 v6, 0x41500000    # 13.0f

    .line 168
    .line 169
    const/high16 v7, 0x41400000    # 12.0f

    .line 170
    .line 171
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const/16 v16, 0x3800

    .line 182
    .line 183
    const/16 v17, 0x0

    .line 184
    .line 185
    const/high16 v6, 0x3f800000    # 1.0f

    .line 186
    .line 187
    const/high16 v8, 0x3f800000    # 1.0f

    .line 188
    .line 189
    const/4 v7, 0x0

    .line 190
    const/high16 v9, 0x3f800000    # 1.0f

    .line 191
    .line 192
    const/high16 v12, 0x3f800000    # 1.0f

    .line 193
    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    const/4 v15, 0x0

    .line 197
    const-string v4, ""

    .line 198
    .line 199
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 207
    .line 208
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 209
    .line 210
    .line 211
    move-result-wide v6

    .line 212
    const/4 v2, 0x0

    .line 213
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    const/high16 v4, 0x41200000    # 10.0f

    .line 230
    .line 231
    const/high16 v6, 0x41000000    # 8.0f

    .line 232
    .line 233
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v4, 0x41000000    # 8.0f

    .line 237
    .line 238
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v4, 0x40a2e148    # 5.09f

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v25, 0x41400000    # 12.0f

    .line 248
    .line 249
    const/high16 v26, 0x40800000    # 4.0f

    .line 250
    .line 251
    const v21, 0x40cf0a3d    # 6.47f

    .line 252
    .line 253
    .line 254
    const v22, 0x40b3851f    # 5.61f

    .line 255
    .line 256
    .line 257
    const v23, 0x4110cccd    # 9.05f

    .line 258
    .line 259
    .line 260
    const/high16 v24, 0x40800000    # 4.0f

    .line 261
    .line 262
    move-object/from16 v20, v2

    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v25, 0x40f7ae14    # 7.74f

    .line 268
    .line 269
    .line 270
    const/high16 v26, 0x40c00000    # 6.0f

    .line 271
    .line 272
    const v21, 0x406e147b    # 3.72f

    .line 273
    .line 274
    .line 275
    const/16 v22, 0x0

    .line 276
    .line 277
    const v23, 0x40db3333    # 6.85f

    .line 278
    .line 279
    .line 280
    const v24, 0x4023d70a    # 2.56f

    .line 281
    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v4, 0x4003d70a    # 2.06f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v25, -0x3ee33333    # -9.8f

    .line 293
    .line 294
    .line 295
    const/high16 v26, -0x3f000000    # -8.0f

    .line 296
    .line 297
    const v21, -0x4091eb85    # -0.93f

    .line 298
    .line 299
    .line 300
    const v22, -0x3f6e147b    # -4.56f

    .line 301
    .line 302
    .line 303
    const v23, -0x3f6147ae    # -4.96f

    .line 304
    .line 305
    .line 306
    const/high16 v24, -0x3f000000    # -8.0f

    .line 307
    .line 308
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 309
    .line 310
    .line 311
    const/high16 v25, 0x40800000    # 4.0f

    .line 312
    .line 313
    const v26, 0x40c051ec    # 6.01f

    .line 314
    .line 315
    .line 316
    const v21, 0x410bae14    # 8.73f

    .line 317
    .line 318
    .line 319
    const/high16 v22, 0x40000000    # 2.0f

    .line 320
    .line 321
    const v23, 0x40ba3d71    # 5.82f

    .line 322
    .line 323
    .line 324
    const v24, 0x40651eb8    # 3.58f

    .line 325
    .line 326
    .line 327
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const/high16 v4, 0x40800000    # 4.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const/high16 v4, 0x40000000    # 2.0f

    .line 336
    .line 337
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v4, 0x40c00000    # 6.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v4, 0x41000000    # 8.0f

    .line 346
    .line 347
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    const/high16 v6, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/4 v7, 0x0

    .line 360
    const-string v4, ""

    .line 361
    .line 362
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 363
    .line 364
    .line 365
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 370
    .line 371
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 372
    .line 373
    .line 374
    move-result-wide v6

    .line 375
    const/4 v0, 0x0

    .line 376
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const/high16 v0, 0x41600000    # 14.0f

    .line 393
    .line 394
    const/high16 v2, 0x41800000    # 16.0f

    .line 395
    .line 396
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v0, 0x40000000    # 2.0f

    .line 400
    .line 401
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 402
    .line 403
    .line 404
    const v0, 0x403a3d71    # 2.91f

    .line 405
    .line 406
    .line 407
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const v17, -0x3f22e148    # -6.91f

    .line 411
    .line 412
    .line 413
    const/high16 v18, 0x40800000    # 4.0f

    .line 414
    .line 415
    const v13, -0x404f5c29    # -1.38f

    .line 416
    .line 417
    .line 418
    const v14, 0x4018f5c3    # 2.39f

    .line 419
    .line 420
    .line 421
    const v15, -0x3f828f5c    # -3.96f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x40800000    # 4.0f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v17, -0x3f0851ec    # -7.74f

    .line 430
    .line 431
    .line 432
    const/high16 v18, -0x3f400000    # -6.0f

    .line 433
    .line 434
    const v13, -0x3f91eb85    # -3.72f

    .line 435
    .line 436
    .line 437
    const/4 v14, 0x0

    .line 438
    const v15, -0x3f24cccd    # -6.85f

    .line 439
    .line 440
    .line 441
    const v16, -0x3fdc28f6    # -2.56f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v0, 0x400ccccd    # 2.2f

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x411ccccd    # 9.8f

    .line 454
    .line 455
    .line 456
    const/high16 v18, 0x41000000    # 8.0f

    .line 457
    .line 458
    const v13, 0x3f6e147b    # 0.93f

    .line 459
    .line 460
    .line 461
    const v14, 0x4091eb85    # 4.56f

    .line 462
    .line 463
    .line 464
    const v15, 0x409eb852    # 4.96f

    .line 465
    .line 466
    .line 467
    const/high16 v16, 0x41000000    # 8.0f

    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v17, 0x41000000    # 8.0f

    .line 473
    .line 474
    const v18, -0x3f7fae14    # -4.01f

    .line 475
    .line 476
    .line 477
    const v13, 0x405147ae    # 3.27f

    .line 478
    .line 479
    .line 480
    const/4 v14, 0x0

    .line 481
    const v15, 0x40c5c28f    # 6.18f

    .line 482
    .line 483
    .line 484
    const v16, -0x4035c28f    # -1.58f

    .line 485
    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v0, 0x41a00000    # 20.0f

    .line 491
    .line 492
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    const/high16 v0, 0x40000000    # 2.0f

    .line 496
    .line 497
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 498
    .line 499
    .line 500
    const/high16 v0, -0x3f400000    # -6.0f

    .line 501
    .line 502
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const/high16 v0, 0x41800000    # 16.0f

    .line 506
    .line 507
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    const/16 v16, 0x3800

    .line 518
    .line 519
    const/16 v17, 0x0

    .line 520
    .line 521
    const/high16 v6, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/4 v7, 0x0

    .line 524
    const/high16 v12, 0x3f800000    # 1.0f

    .line 525
    .line 526
    const/4 v13, 0x0

    .line 527
    const/4 v15, 0x0

    .line 528
    const-string v4, ""

    .line 529
    .line 530
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    sput-object v0, Landroidx/compose/material/icons/outlined/FlipCameraAndroidKt;->_flipCameraAndroid:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 539
    .line 540
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    return-object v0
.end method

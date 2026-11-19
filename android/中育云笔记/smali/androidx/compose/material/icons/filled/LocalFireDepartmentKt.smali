.class public final Landroidx/compose/material/icons/filled/LocalFireDepartmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocalFireDepartment(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/LocalFireDepartmentKt;->_localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.LocalFireDepartment"

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
    const v4, 0x414e6666    # 12.9f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41400000    # 12.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, -0x3ff7ae14    # -2.13f

    .line 79
    .line 80
    .line 81
    const v6, 0x4005c28f    # 2.09f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v25, 0x41100000    # 9.0f

    .line 88
    .line 89
    const v26, 0x41887ae1    # 17.06f

    .line 90
    .line 91
    .line 92
    const v21, 0x4114f5c3    # 9.31f

    .line 93
    .line 94
    .line 95
    const v22, 0x4178cccd    # 15.55f

    .line 96
    .line 97
    .line 98
    const/high16 v23, 0x41100000    # 9.0f

    .line 99
    .line 100
    const v24, 0x41823d71    # 16.28f

    .line 101
    .line 102
    .line 103
    move-object/from16 v20, v2

    .line 104
    .line 105
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v25, 0x41400000    # 12.0f

    .line 109
    .line 110
    const/high16 v26, 0x41a00000    # 20.0f

    .line 111
    .line 112
    const/high16 v21, 0x41100000    # 9.0f

    .line 113
    .line 114
    const v22, 0x419570a4    # 18.68f

    .line 115
    .line 116
    .line 117
    const v23, 0x4125999a    # 10.35f

    .line 118
    .line 119
    .line 120
    const/high16 v24, 0x41a00000    # 20.0f

    .line 121
    .line 122
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const v4, -0x40570a3d    # -1.32f

    .line 126
    .line 127
    .line 128
    const v6, -0x3fc3d70a    # -2.94f

    .line 129
    .line 130
    .line 131
    const/high16 v7, 0x40400000    # 3.0f

    .line 132
    .line 133
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v25, -0x40a147ae    # -0.87f

    .line 137
    .line 138
    .line 139
    const v26, -0x3ffb851f    # -2.07f

    .line 140
    .line 141
    .line 142
    const/16 v21, 0x0

    .line 143
    .line 144
    const v22, -0x40b851ec    # -0.78f

    .line 145
    .line 146
    .line 147
    const v23, -0x416147ae    # -0.31f

    .line 148
    .line 149
    .line 150
    const v24, -0x403d70a4    # -1.52f

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    const v4, 0x414e6666    # 12.9f

    .line 157
    .line 158
    .line 159
    const/high16 v6, 0x41400000    # 12.0f

    .line 160
    .line 161
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const/16 v16, 0x3800

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    const/high16 v6, 0x3f800000    # 1.0f

    .line 176
    .line 177
    const/high16 v8, 0x3f800000    # 1.0f

    .line 178
    .line 179
    const/4 v7, 0x0

    .line 180
    const/high16 v9, 0x3f800000    # 1.0f

    .line 181
    .line 182
    const/high16 v12, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const/4 v14, 0x0

    .line 186
    const/4 v15, 0x0

    .line 187
    const-string v4, ""

    .line 188
    .line 189
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 190
    .line 191
    .line 192
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 197
    .line 198
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 199
    .line 200
    .line 201
    move-result-wide v6

    .line 202
    const/4 v0, 0x0

    .line 203
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const/high16 v0, 0x41800000    # 16.0f

    .line 220
    .line 221
    const/high16 v2, 0x40c00000    # 6.0f

    .line 222
    .line 223
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, -0x411eb852    # -0.44f

    .line 227
    .line 228
    .line 229
    const v2, 0x3f0ccccd    # 0.55f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v17, 0x41400000    # 12.0f

    .line 236
    .line 237
    const v18, 0x40a9999a    # 5.3f

    .line 238
    .line 239
    .line 240
    const v13, 0x4166147b    # 14.38f

    .line 241
    .line 242
    .line 243
    const v14, 0x410051ec    # 8.02f

    .line 244
    .line 245
    .line 246
    const/high16 v15, 0x41400000    # 12.0f

    .line 247
    .line 248
    const v16, 0x40e6147b    # 7.19f

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, 0x40000000    # 2.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, -0x3f000000    # -8.0f

    .line 260
    .line 261
    const/high16 v18, 0x41300000    # 11.0f

    .line 262
    .line 263
    const/4 v13, 0x0

    .line 264
    const/4 v14, 0x0

    .line 265
    const/high16 v15, -0x3f000000    # -8.0f

    .line 266
    .line 267
    const/high16 v16, 0x40800000    # 4.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x4078f5c3    # 3.89f

    .line 273
    .line 274
    .line 275
    const v18, 0x40db851f    # 6.86f

    .line 276
    .line 277
    .line 278
    const v14, 0x403ae148    # 2.92f

    .line 279
    .line 280
    .line 281
    const v15, 0x3fc7ae14    # 1.56f

    .line 282
    .line 283
    .line 284
    const v16, 0x40af0a3d    # 5.47f

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v17, 0x40e00000    # 7.0f

    .line 291
    .line 292
    const v18, 0x41887ae1    # 17.06f

    .line 293
    .line 294
    .line 295
    const v13, 0x40ea8f5c    # 7.33f

    .line 296
    .line 297
    .line 298
    const v14, 0x41988f5c    # 19.07f

    .line 299
    .line 300
    .line 301
    const/high16 v15, 0x40e00000    # 7.0f

    .line 302
    .line 303
    const v16, 0x4190cccd    # 18.1f

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v17, 0x3fbc28f6    # 1.47f

    .line 310
    .line 311
    .line 312
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 313
    .line 314
    const/4 v13, 0x0

    .line 315
    const v14, -0x40570a3d    # -1.32f

    .line 316
    .line 317
    .line 318
    const v15, 0x3f051eb8    # 0.52f

    .line 319
    .line 320
    .line 321
    const v16, -0x3fdc28f6    # -2.56f

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v0, 0x4121999a    # 10.1f

    .line 328
    .line 329
    .line 330
    const/high16 v2, 0x41400000    # 12.0f

    .line 331
    .line 332
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    const v0, 0x4061eb85    # 3.53f

    .line 336
    .line 337
    .line 338
    const v2, 0x405e147b    # 3.47f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    const/high16 v18, 0x40600000    # 3.5f

    .line 345
    .line 346
    const v13, 0x3f733333    # 0.95f

    .line 347
    .line 348
    .line 349
    const v14, 0x3f6e147b    # 0.93f

    .line 350
    .line 351
    .line 352
    const v15, 0x3fbc28f6    # 1.47f

    .line 353
    .line 354
    .line 355
    const v16, 0x400ae148    # 2.17f

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const v17, -0x40a66666    # -0.85f

    .line 362
    .line 363
    .line 364
    const/high16 v18, 0x40300000    # 2.75f

    .line 365
    .line 366
    const/4 v13, 0x0

    .line 367
    const v14, 0x3f828f5c    # 1.02f

    .line 368
    .line 369
    .line 370
    const v15, -0x416147ae    # -0.31f

    .line 371
    .line 372
    .line 373
    const v16, 0x3ffae148    # 1.96f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v17, 0x406d70a4    # 3.71f

    .line 380
    .line 381
    .line 382
    const v18, -0x3f566666    # -5.3f

    .line 383
    .line 384
    .line 385
    const v13, 0x3ff1eb85    # 1.89f

    .line 386
    .line 387
    .line 388
    const v14, -0x406ccccd    # -1.15f

    .line 389
    .line 390
    .line 391
    const v15, 0x40528f5c    # 3.29f

    .line 392
    .line 393
    .line 394
    const v16, -0x3fbc28f6    # -3.06f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v17, 0x41800000    # 16.0f

    .line 401
    .line 402
    const/high16 v18, 0x40c00000    # 6.0f

    .line 403
    .line 404
    const v13, 0x41a428f6    # 20.52f

    .line 405
    .line 406
    .line 407
    const v14, 0x412f851f    # 10.97f

    .line 408
    .line 409
    .line 410
    const v15, 0x419651ec    # 18.79f

    .line 411
    .line 412
    .line 413
    const v16, 0x40f3d70a    # 7.62f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    const/16 v16, 0x3800

    .line 427
    .line 428
    const/16 v17, 0x0

    .line 429
    .line 430
    const/high16 v6, 0x3f800000    # 1.0f

    .line 431
    .line 432
    const/4 v7, 0x0

    .line 433
    const/high16 v12, 0x3f800000    # 1.0f

    .line 434
    .line 435
    const/4 v13, 0x0

    .line 436
    const/4 v14, 0x0

    .line 437
    const/4 v15, 0x0

    .line 438
    const-string v4, ""

    .line 439
    .line 440
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    sput-object v0, Landroidx/compose/material/icons/filled/LocalFireDepartmentKt;->_localFireDepartment:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 449
    .line 450
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    return-object v0
.end method

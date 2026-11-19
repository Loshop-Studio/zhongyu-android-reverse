.class public final Landroidx/compose/material/icons/rounded/ChildCareKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _childCare:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getChildCare(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/ChildCareKt;->_childCare:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.ChildCare"

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
    const/high16 v4, 0x41680000    # 14.5f

    .line 71
    .line 72
    const/high16 v6, 0x41280000    # 10.5f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/high16 v6, -0x40600000    # -1.25f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40200000    # 2.5f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x3fa00000    # 1.25f

    .line 88
    .line 89
    const/high16 v22, 0x3fa00000    # 1.25f

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const/16 v24, 0x1

    .line 94
    .line 95
    const/16 v25, 0x1

    .line 96
    .line 97
    move-object/from16 v20, v2

    .line 98
    .line 99
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 103
    .line 104
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/16 v16, 0x3800

    .line 112
    .line 113
    const/16 v17, 0x0

    .line 114
    .line 115
    const/high16 v6, 0x3f800000    # 1.0f

    .line 116
    .line 117
    const/high16 v8, 0x3f800000    # 1.0f

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/high16 v9, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/high16 v12, 0x3f800000    # 1.0f

    .line 123
    .line 124
    const/4 v13, 0x0

    .line 125
    const/4 v14, 0x0

    .line 126
    const/4 v15, 0x0

    .line 127
    const-string v4, ""

    .line 128
    .line 129
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 130
    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    const/4 v2, 0x0

    .line 143
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 151
    .line 152
    .line 153
    move-result v11

    .line 154
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41180000    # 9.5f

    .line 160
    .line 161
    const/high16 v6, 0x41280000    # 10.5f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    const/high16 v6, -0x40600000    # -1.25f

    .line 168
    .line 169
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v26, 0x40200000    # 2.5f

    .line 173
    .line 174
    move-object/from16 v20, v2

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v26, -0x3fe00000    # -2.5f

    .line 180
    .line 181
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const/high16 v6, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const-string v4, ""

    .line 192
    .line 193
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 194
    .line 195
    .line 196
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 201
    .line 202
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 203
    .line 204
    .line 205
    move-result-wide v6

    .line 206
    const/4 v0, 0x0

    .line 207
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const v0, 0x4180cccd    # 16.1f

    .line 224
    .line 225
    .line 226
    const/high16 v2, 0x41600000    # 14.0f

    .line 227
    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v0, 0x40fccccd    # 7.9f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, -0x41947ae1    # -0.23f

    .line 238
    .line 239
    .line 240
    const v18, 0x3ebd70a4    # 0.37f

    .line 241
    .line 242
    .line 243
    const v13, -0x41bd70a4    # -0.19f

    .line 244
    .line 245
    .line 246
    const v15, -0x415c28f6    # -0.32f

    .line 247
    .line 248
    .line 249
    const v16, 0x3e4ccccd    # 0.2f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x41400000    # 12.0f

    .line 256
    .line 257
    const/high16 v18, 0x41880000    # 17.0f

    .line 258
    .line 259
    const/high16 v13, 0x41080000    # 8.5f

    .line 260
    .line 261
    const v14, 0x417f0a3d    # 15.94f

    .line 262
    .line 263
    .line 264
    const v15, 0x4122147b    # 10.13f

    .line 265
    .line 266
    .line 267
    const/high16 v16, 0x41880000    # 17.0f

    .line 268
    .line 269
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v0, 0x408a8f5c    # 4.33f

    .line 273
    .line 274
    .line 275
    const v2, -0x3fd7ae14    # -2.63f

    .line 276
    .line 277
    .line 278
    const/high16 v4, 0x40600000    # 3.5f

    .line 279
    .line 280
    const v6, -0x407851ec    # -1.06f

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v17, -0x41947ae1    # -0.23f

    .line 287
    .line 288
    .line 289
    const v18, -0x41428f5c    # -0.37f

    .line 290
    .line 291
    .line 292
    const v13, 0x3da3d70a    # 0.08f

    .line 293
    .line 294
    .line 295
    const v14, -0x41d1eb85    # -0.17f

    .line 296
    .line 297
    .line 298
    const v15, -0x42b33333    # -0.05f

    .line 299
    .line 300
    .line 301
    const v16, -0x41428f5c    # -0.37f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x41b7851f    # 22.94f

    .line 311
    .line 312
    .line 313
    const v2, 0x413570a4    # 11.34f

    .line 314
    .line 315
    .line 316
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, -0x3fcc28f6    # -2.81f

    .line 320
    .line 321
    .line 322
    const v18, -0x3fb51eb8    # -3.17f

    .line 323
    .line 324
    .line 325
    const/high16 v13, -0x41800000    # -0.25f

    .line 326
    .line 327
    const v14, -0x403eb852    # -1.51f

    .line 328
    .line 329
    .line 330
    const v15, -0x4051eb85    # -1.36f

    .line 331
    .line 332
    .line 333
    const v16, -0x3fd0a3d7    # -2.74f

    .line 334
    .line 335
    .line 336
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v17, -0x3ff3d70a    # -2.19f

    .line 340
    .line 341
    .line 342
    const v18, -0x3fc5c28f    # -2.91f

    .line 343
    .line 344
    .line 345
    const v13, -0x40f851ec    # -0.53f

    .line 346
    .line 347
    .line 348
    const v14, -0x4070a3d7    # -1.12f

    .line 349
    .line 350
    .line 351
    const v15, -0x405c28f6    # -1.28f

    .line 352
    .line 353
    .line 354
    const v16, -0x3ff9999a    # -2.1f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v17, 0x41400000    # 12.0f

    .line 361
    .line 362
    const/high16 v18, 0x40400000    # 3.0f

    .line 363
    .line 364
    const v13, 0x4182e148    # 16.36f

    .line 365
    .line 366
    .line 367
    const v14, 0x40766666    # 3.85f

    .line 368
    .line 369
    .line 370
    const v15, 0x41647ae1    # 14.28f

    .line 371
    .line 372
    .line 373
    const/high16 v16, 0x40400000    # 3.0f

    .line 374
    .line 375
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const v0, -0x3f41eb85    # -5.94f

    .line 379
    .line 380
    .line 381
    const v2, 0x4010a3d7    # 2.26f

    .line 382
    .line 383
    .line 384
    const v4, -0x3f747ae1    # -4.36f

    .line 385
    .line 386
    .line 387
    const v6, 0x3f59999a    # 0.85f

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const v17, -0x3ff3d70a    # -2.19f

    .line 394
    .line 395
    .line 396
    const v18, 0x403a3d71    # 2.91f

    .line 397
    .line 398
    .line 399
    const v13, -0x40947ae1    # -0.92f

    .line 400
    .line 401
    .line 402
    const v14, 0x3f4f5c29    # 0.81f

    .line 403
    .line 404
    .line 405
    const v15, -0x402a3d71    # -1.67f

    .line 406
    .line 407
    .line 408
    const v16, 0x3fe66666    # 1.8f

    .line 409
    .line 410
    .line 411
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 412
    .line 413
    .line 414
    const v17, -0x3fcc28f6    # -2.81f

    .line 415
    .line 416
    .line 417
    const v18, 0x404ae148    # 3.17f

    .line 418
    .line 419
    .line 420
    const v13, -0x40466666    # -1.45f

    .line 421
    .line 422
    .line 423
    const v14, 0x3edc28f6    # 0.43f

    .line 424
    .line 425
    .line 426
    const v15, -0x3fdc28f6    # -2.56f

    .line 427
    .line 428
    .line 429
    const v16, 0x3fd33333    # 1.65f

    .line 430
    .line 431
    .line 432
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    const v17, -0x428a3d71    # -0.06f

    .line 436
    .line 437
    .line 438
    const v18, 0x3f28f5c3    # 0.66f

    .line 439
    .line 440
    .line 441
    const v13, -0x42dc28f6    # -0.04f

    .line 442
    .line 443
    .line 444
    const v14, 0x3e570a3d    # 0.21f

    .line 445
    .line 446
    .line 447
    const v15, -0x428a3d71    # -0.06f

    .line 448
    .line 449
    .line 450
    const v16, 0x3edc28f6    # 0.43f

    .line 451
    .line 452
    .line 453
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const v17, 0x3d75c28f    # 0.06f

    .line 457
    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const v14, 0x3e6b851f    # 0.23f

    .line 461
    .line 462
    .line 463
    const v15, 0x3ca3d70a    # 0.02f

    .line 464
    .line 465
    .line 466
    const v16, 0x3ee66666    # 0.45f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v17, 0x4033d70a    # 2.81f

    .line 473
    .line 474
    .line 475
    const v18, 0x404ae148    # 3.17f

    .line 476
    .line 477
    .line 478
    const/high16 v13, 0x3e800000    # 0.25f

    .line 479
    .line 480
    const v14, 0x3fc147ae    # 1.51f

    .line 481
    .line 482
    .line 483
    const v15, 0x3fae147b    # 1.36f

    .line 484
    .line 485
    .line 486
    const v16, 0x402f5c29    # 2.74f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x400ae148    # 2.17f

    .line 493
    .line 494
    .line 495
    const v18, 0x4038f5c3    # 2.89f

    .line 496
    .line 497
    .line 498
    const v13, 0x3f051eb8    # 0.52f

    .line 499
    .line 500
    .line 501
    const v14, 0x3f8e147b    # 1.11f

    .line 502
    .line 503
    .line 504
    const v15, 0x3fa28f5c    # 1.27f

    .line 505
    .line 506
    .line 507
    const v16, 0x4005c28f    # 2.09f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v17, 0x41400000    # 12.0f

    .line 514
    .line 515
    const/high16 v18, 0x41a80000    # 21.0f

    .line 516
    .line 517
    const v13, 0x40f3d70a    # 7.62f

    .line 518
    .line 519
    .line 520
    const v14, 0x41a11eb8    # 20.14f

    .line 521
    .line 522
    .line 523
    const v15, 0x411b5c29    # 9.71f

    .line 524
    .line 525
    .line 526
    const/high16 v16, 0x41a80000    # 21.0f

    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x40bf0a3d    # 5.97f

    .line 532
    .line 533
    .line 534
    const v2, -0x3fee147b    # -2.28f

    .line 535
    .line 536
    .line 537
    const v4, 0x408c28f6    # 4.38f

    .line 538
    .line 539
    .line 540
    const v6, -0x40a3d70a    # -0.86f

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    .line 546
    const v17, 0x400ae148    # 2.17f

    .line 547
    .line 548
    .line 549
    const v18, -0x3fc70a3d    # -2.89f

    .line 550
    .line 551
    .line 552
    const v13, 0x3f666666    # 0.9f

    .line 553
    .line 554
    .line 555
    const v14, -0x40b33333    # -0.8f

    .line 556
    .line 557
    .line 558
    const v15, 0x3fd33333    # 1.65f

    .line 559
    .line 560
    .line 561
    const v16, -0x401ae148    # -1.79f

    .line 562
    .line 563
    .line 564
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const v17, 0x40333333    # 2.8f

    .line 568
    .line 569
    .line 570
    const v18, -0x3fb51eb8    # -3.17f

    .line 571
    .line 572
    .line 573
    const v13, 0x3fb851ec    # 1.44f

    .line 574
    .line 575
    .line 576
    const v14, -0x4123d70a    # -0.43f

    .line 577
    .line 578
    .line 579
    const v15, 0x40233333    # 2.55f

    .line 580
    .line 581
    .line 582
    const v16, -0x402ccccd    # -1.65f

    .line 583
    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const v17, 0x3d75c28f    # 0.06f

    .line 589
    .line 590
    .line 591
    const v18, -0x40d70a3d    # -0.66f

    .line 592
    .line 593
    .line 594
    const v13, 0x3d23d70a    # 0.04f

    .line 595
    .line 596
    .line 597
    const v14, -0x41a8f5c3    # -0.21f

    .line 598
    .line 599
    .line 600
    const v15, 0x3d75c28f    # 0.06f

    .line 601
    .line 602
    .line 603
    const v16, -0x4123d70a    # -0.43f

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    const v17, -0x428a3d71    # -0.06f

    .line 610
    .line 611
    .line 612
    const/4 v13, 0x0

    .line 613
    const v14, -0x41947ae1    # -0.23f

    .line 614
    .line 615
    .line 616
    const v15, -0x435c28f6    # -0.02f

    .line 617
    .line 618
    .line 619
    const v16, -0x4119999a    # -0.45f

    .line 620
    .line 621
    .line 622
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const/high16 v0, 0x41980000    # 19.0f

    .line 629
    .line 630
    const/high16 v2, 0x41600000    # 14.0f

    .line 631
    .line 632
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 633
    .line 634
    .line 635
    const v17, -0x416b851f    # -0.29f

    .line 636
    .line 637
    .line 638
    const v18, -0x430a3d71    # -0.03f

    .line 639
    .line 640
    .line 641
    const v13, -0x42333333    # -0.1f

    .line 642
    .line 643
    .line 644
    const/4 v14, 0x0

    .line 645
    const v15, -0x41bd70a4    # -0.19f

    .line 646
    .line 647
    .line 648
    const v16, -0x435c28f6    # -0.02f

    .line 649
    .line 650
    .line 651
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const v17, -0x40a3d70a    # -0.86f

    .line 655
    .line 656
    .line 657
    const v18, 0x3fee147b    # 1.86f

    .line 658
    .line 659
    .line 660
    const v13, -0x41b33333    # -0.2f

    .line 661
    .line 662
    .line 663
    const v14, 0x3f2b851f    # 0.67f

    .line 664
    .line 665
    .line 666
    const v15, -0x41051eb8    # -0.49f

    .line 667
    .line 668
    .line 669
    const v16, 0x3fa51eb8    # 1.29f

    .line 670
    .line 671
    .line 672
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 673
    .line 674
    .line 675
    const/high16 v17, 0x41400000    # 12.0f

    .line 676
    .line 677
    const/high16 v18, 0x41980000    # 19.0f

    .line 678
    .line 679
    const v13, 0x4184cccd    # 16.6f

    .line 680
    .line 681
    .line 682
    const v14, 0x418deb85    # 17.74f

    .line 683
    .line 684
    .line 685
    const v15, 0x41673333    # 14.45f

    .line 686
    .line 687
    .line 688
    const/high16 v16, 0x41980000    # 19.0f

    .line 689
    .line 690
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, -0x3f44cccd    # -5.85f

    .line 694
    .line 695
    .line 696
    const v2, -0x3fb51eb8    # -3.17f

    .line 697
    .line 698
    .line 699
    const v4, -0x3f6ccccd    # -4.6f

    .line 700
    .line 701
    .line 702
    const v6, -0x405eb852    # -1.26f

    .line 703
    .line 704
    .line 705
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const v17, -0x40a3d70a    # -0.86f

    .line 709
    .line 710
    .line 711
    const v18, -0x4011eb85    # -1.86f

    .line 712
    .line 713
    .line 714
    const v13, -0x41428f5c    # -0.37f

    .line 715
    .line 716
    .line 717
    const v14, -0x40ee147b    # -0.57f

    .line 718
    .line 719
    .line 720
    const v15, -0x40d70a3d    # -0.66f

    .line 721
    .line 722
    .line 723
    const v16, -0x4067ae14    # -1.19f

    .line 724
    .line 725
    .line 726
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 727
    .line 728
    .line 729
    const v17, -0x416b851f    # -0.29f

    .line 730
    .line 731
    .line 732
    const v18, 0x3cf5c28f    # 0.03f

    .line 733
    .line 734
    .line 735
    const v13, -0x42333333    # -0.1f

    .line 736
    .line 737
    .line 738
    const v14, 0x3c23d70a    # 0.01f

    .line 739
    .line 740
    .line 741
    const v15, -0x41bd70a4    # -0.19f

    .line 742
    .line 743
    .line 744
    const v16, 0x3cf5c28f    # 0.03f

    .line 745
    .line 746
    .line 747
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 748
    .line 749
    .line 750
    const/high16 v17, -0x40000000    # -2.0f

    .line 751
    .line 752
    const/high16 v18, -0x40000000    # -2.0f

    .line 753
    .line 754
    const v13, -0x40733333    # -1.1f

    .line 755
    .line 756
    .line 757
    const/4 v14, 0x0

    .line 758
    const/high16 v15, -0x40000000    # -2.0f

    .line 759
    .line 760
    const v16, -0x4099999a    # -0.9f

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 764
    .line 765
    .line 766
    const v0, 0x3f666666    # 0.9f

    .line 767
    .line 768
    .line 769
    const/high16 v2, 0x40000000    # 2.0f

    .line 770
    .line 771
    const/high16 v4, -0x40000000    # -2.0f

    .line 772
    .line 773
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 774
    .line 775
    .line 776
    const v17, 0x3e947ae1    # 0.29f

    .line 777
    .line 778
    .line 779
    const v18, 0x3cf5c28f    # 0.03f

    .line 780
    .line 781
    .line 782
    const v13, 0x3dcccccd    # 0.1f

    .line 783
    .line 784
    .line 785
    const v15, 0x3e428f5c    # 0.19f

    .line 786
    .line 787
    .line 788
    const v16, 0x3ca3d70a    # 0.02f

    .line 789
    .line 790
    .line 791
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 792
    .line 793
    .line 794
    const v17, 0x3f5c28f6    # 0.86f

    .line 795
    .line 796
    .line 797
    const v18, -0x4011eb85    # -1.86f

    .line 798
    .line 799
    .line 800
    const v13, 0x3e4ccccd    # 0.2f

    .line 801
    .line 802
    .line 803
    const v14, -0x40d47ae1    # -0.67f

    .line 804
    .line 805
    .line 806
    const v15, 0x3efae148    # 0.49f

    .line 807
    .line 808
    .line 809
    const v16, -0x405ae148    # -1.29f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const/high16 v17, 0x41400000    # 12.0f

    .line 816
    .line 817
    const/high16 v18, 0x40a00000    # 5.0f

    .line 818
    .line 819
    const v13, 0x40eccccd    # 7.4f

    .line 820
    .line 821
    .line 822
    const v14, 0x40c851ec    # 6.26f

    .line 823
    .line 824
    .line 825
    const v15, 0x4118cccd    # 9.55f

    .line 826
    .line 827
    .line 828
    const/high16 v16, 0x40a00000    # 5.0f

    .line 829
    .line 830
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const v0, 0x40bb3333    # 5.85f

    .line 834
    .line 835
    .line 836
    const v2, 0x404ae148    # 3.17f

    .line 837
    .line 838
    .line 839
    const v4, 0x40933333    # 4.6f

    .line 840
    .line 841
    .line 842
    const v6, 0x3fa147ae    # 1.26f

    .line 843
    .line 844
    .line 845
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 846
    .line 847
    .line 848
    const v17, 0x3f5c28f6    # 0.86f

    .line 849
    .line 850
    .line 851
    const v18, 0x3fee147b    # 1.86f

    .line 852
    .line 853
    .line 854
    const v13, 0x3ebd70a4    # 0.37f

    .line 855
    .line 856
    .line 857
    const v14, 0x3f11eb85    # 0.57f

    .line 858
    .line 859
    .line 860
    const v15, 0x3f28f5c3    # 0.66f

    .line 861
    .line 862
    .line 863
    const v16, 0x3f9851ec    # 1.19f

    .line 864
    .line 865
    .line 866
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 867
    .line 868
    .line 869
    const v17, 0x3e947ae1    # 0.29f

    .line 870
    .line 871
    .line 872
    const v18, -0x430a3d71    # -0.03f

    .line 873
    .line 874
    .line 875
    const v13, 0x3dcccccd    # 0.1f

    .line 876
    .line 877
    .line 878
    const v14, -0x43dc28f6    # -0.01f

    .line 879
    .line 880
    .line 881
    const v15, 0x3e428f5c    # 0.19f

    .line 882
    .line 883
    .line 884
    const v16, -0x430a3d71    # -0.03f

    .line 885
    .line 886
    .line 887
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const/high16 v17, 0x40000000    # 2.0f

    .line 891
    .line 892
    const/high16 v18, 0x40000000    # 2.0f

    .line 893
    .line 894
    const v13, 0x3f8ccccd    # 1.1f

    .line 895
    .line 896
    .line 897
    const/4 v14, 0x0

    .line 898
    const/high16 v15, 0x40000000    # 2.0f

    .line 899
    .line 900
    const v16, 0x3f666666    # 0.9f

    .line 901
    .line 902
    .line 903
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v0, -0x4099999a    # -0.9f

    .line 907
    .line 908
    .line 909
    const/high16 v2, 0x40000000    # 2.0f

    .line 910
    .line 911
    const/high16 v4, -0x40000000    # -2.0f

    .line 912
    .line 913
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 917
    .line 918
    .line 919
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 920
    .line 921
    .line 922
    move-result-object v2

    .line 923
    const/16 v16, 0x3800

    .line 924
    .line 925
    const/16 v17, 0x0

    .line 926
    .line 927
    const/high16 v6, 0x3f800000    # 1.0f

    .line 928
    .line 929
    const/4 v7, 0x0

    .line 930
    const/high16 v12, 0x3f800000    # 1.0f

    .line 931
    .line 932
    const/4 v13, 0x0

    .line 933
    const/4 v15, 0x0

    .line 934
    const-string v4, ""

    .line 935
    .line 936
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    sput-object v0, Landroidx/compose/material/icons/rounded/ChildCareKt;->_childCare:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 945
    .line 946
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 947
    .line 948
    .line 949
    return-object v0
.end method

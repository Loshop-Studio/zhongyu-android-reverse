.class public final Landroidx/compose/material/icons/twotone/HearingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _hearing:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHearing(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HearingKt;->_hearing:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Hearing"

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
    const v4, 0x40f47ae1    # 7.64f

    .line 71
    .line 72
    .line 73
    const v6, 0x4028f5c3    # 2.64f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v4, 0x40c70a3d    # 6.22f

    .line 80
    .line 81
    .line 82
    const v6, 0x3f9c28f6    # 1.22f

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 86
    .line 87
    .line 88
    const/high16 v25, 0x40400000    # 3.0f

    .line 89
    .line 90
    const/high16 v26, 0x41100000    # 9.0f

    .line 91
    .line 92
    const v21, 0x40875c29    # 4.23f

    .line 93
    .line 94
    .line 95
    const v22, 0x404d70a4    # 3.21f

    .line 96
    .line 97
    .line 98
    const/high16 v23, 0x40400000    # 3.0f

    .line 99
    .line 100
    const v24, 0x40beb852    # 5.96f

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
    const v4, 0x404e147b    # 3.22f

    .line 109
    .line 110
    .line 111
    const v6, 0x40f8f5c3    # 7.78f

    .line 112
    .line 113
    .line 114
    const v7, 0x3f9d70a4    # 1.23f

    .line 115
    .line 116
    .line 117
    const v8, 0x40b947ae    # 5.79f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v4, 0x3fb47ae1    # 1.41f

    .line 124
    .line 125
    .line 126
    const v6, -0x404b851f    # -1.41f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v25, 0x40a00000    # 5.0f

    .line 133
    .line 134
    const v21, 0x40c051ec    # 6.01f

    .line 135
    .line 136
    .line 137
    const v22, 0x415bd70a    # 13.74f

    .line 138
    .line 139
    .line 140
    const/high16 v23, 0x40a00000    # 5.0f

    .line 141
    .line 142
    const v24, 0x4137d70a    # 11.49f

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const v4, -0x3f6851ec    # -4.74f

    .line 149
    .line 150
    .line 151
    const v6, -0x3f347ae1    # -6.36f

    .line 152
    .line 153
    .line 154
    const v7, 0x4028f5c3    # 2.64f

    .line 155
    .line 156
    .line 157
    const v8, 0x3f8147ae    # 1.01f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const/16 v16, 0x3800

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const/high16 v6, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/high16 v8, 0x3f800000    # 1.0f

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const/high16 v9, 0x3f800000    # 1.0f

    .line 180
    .line 181
    const/high16 v12, 0x3f800000    # 1.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const/4 v14, 0x0

    .line 185
    const/4 v15, 0x0

    .line 186
    const-string v4, ""

    .line 187
    .line 188
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 196
    .line 197
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 198
    .line 199
    .line 200
    move-result-wide v6

    .line 201
    const/4 v2, 0x0

    .line 202
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const/high16 v4, 0x41600000    # 14.0f

    .line 219
    .line 220
    const/high16 v6, 0x41100000    # 9.0f

    .line 221
    .line 222
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v4, -0x3fe00000    # -2.5f

    .line 226
    .line 227
    const/4 v6, 0x0

    .line 228
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v26, 0x40a00000    # 5.0f

    .line 232
    .line 233
    const/16 v27, 0x0

    .line 234
    .line 235
    const/high16 v21, 0x40200000    # 2.5f

    .line 236
    .line 237
    const/high16 v22, 0x40200000    # 2.5f

    .line 238
    .line 239
    const/16 v23, 0x0

    .line 240
    .line 241
    const/16 v24, 0x1

    .line 242
    .line 243
    const/16 v25, 0x1

    .line 244
    .line 245
    move-object/from16 v20, v2

    .line 246
    .line 247
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v26, -0x3f600000    # -5.0f

    .line 251
    .line 252
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    const/high16 v6, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/4 v7, 0x0

    .line 262
    const-string v4, ""

    .line 263
    .line 264
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 265
    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 272
    .line 273
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 274
    .line 275
    .line 276
    move-result-wide v6

    .line 277
    const/4 v0, 0x0

    .line 278
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 282
    .line 283
    .line 284
    move-result v10

    .line 285
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 286
    .line 287
    .line 288
    move-result v11

    .line 289
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    const/high16 v0, 0x41880000    # 17.0f

    .line 295
    .line 296
    const/high16 v2, 0x41a00000    # 20.0f

    .line 297
    .line 298
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v17, -0x40bd70a4    # -0.76f

    .line 302
    .line 303
    .line 304
    const v18, -0x41e66666    # -0.15f

    .line 305
    .line 306
    .line 307
    const v13, -0x416b851f    # -0.29f

    .line 308
    .line 309
    .line 310
    const v15, -0x40f0a3d7    # -0.56f

    .line 311
    .line 312
    .line 313
    const v16, -0x428a3d71    # -0.06f

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v17, -0x40251eb8    # -1.71f

    .line 320
    .line 321
    .line 322
    const v18, -0x3fe7ae14    # -2.38f

    .line 323
    .line 324
    .line 325
    const v13, -0x40ca3d71    # -0.71f

    .line 326
    .line 327
    .line 328
    const v14, -0x41428f5c    # -0.37f

    .line 329
    .line 330
    .line 331
    const v15, -0x40651eb8    # -1.21f

    .line 332
    .line 333
    .line 334
    const v16, -0x409eb852    # -0.88f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v17, -0x3fe70a3d    # -2.39f

    .line 341
    .line 342
    .line 343
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 344
    .line 345
    const v13, -0x40fd70a4    # -0.51f

    .line 346
    .line 347
    .line 348
    const v14, -0x403851ec    # -1.56f

    .line 349
    .line 350
    .line 351
    const v15, -0x4043d70a    # -1.47f

    .line 352
    .line 353
    .line 354
    const v16, -0x3fed70a4    # -2.29f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const v17, -0x3feb851f    # -2.32f

    .line 361
    .line 362
    .line 363
    const v18, -0x3fde147b    # -2.53f

    .line 364
    .line 365
    .line 366
    const v13, -0x40b5c28f    # -0.79f

    .line 367
    .line 368
    .line 369
    const v14, -0x40e3d70a    # -0.61f

    .line 370
    .line 371
    .line 372
    const v15, -0x4031eb85    # -1.61f

    .line 373
    .line 374
    .line 375
    const v16, -0x406147ae    # -1.24f

    .line 376
    .line 377
    .line 378
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const/high16 v17, 0x41100000    # 9.0f

    .line 382
    .line 383
    const/high16 v18, 0x41100000    # 9.0f

    .line 384
    .line 385
    const v13, 0x4114a3d7    # 9.29f

    .line 386
    .line 387
    .line 388
    const v14, 0x412fae14    # 10.98f

    .line 389
    .line 390
    .line 391
    const/high16 v15, 0x41100000    # 9.0f

    .line 392
    .line 393
    const v16, 0x411ee148    # 9.93f

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const/high16 v17, 0x40a00000    # 5.0f

    .line 400
    .line 401
    const/high16 v18, -0x3f600000    # -5.0f

    .line 402
    .line 403
    const/4 v13, 0x0

    .line 404
    const v14, -0x3fcccccd    # -2.8f

    .line 405
    .line 406
    .line 407
    const v15, 0x400ccccd    # 2.2f

    .line 408
    .line 409
    .line 410
    const/high16 v16, -0x3f600000    # -5.0f

    .line 411
    .line 412
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v0, 0x400ccccd    # 2.2f

    .line 416
    .line 417
    .line 418
    const/high16 v2, 0x40a00000    # 5.0f

    .line 419
    .line 420
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const/high16 v0, 0x40000000    # 2.0f

    .line 424
    .line 425
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, -0x3f200000    # -7.0f

    .line 429
    .line 430
    const/high16 v18, -0x3f200000    # -7.0f

    .line 431
    .line 432
    const v14, -0x3f847ae1    # -3.93f

    .line 433
    .line 434
    .line 435
    const v15, -0x3fbb851f    # -3.07f

    .line 436
    .line 437
    .line 438
    const/high16 v16, -0x3f200000    # -7.0f

    .line 439
    .line 440
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const v0, 0x40a23d71    # 5.07f

    .line 444
    .line 445
    .line 446
    const/high16 v2, 0x40e00000    # 7.0f

    .line 447
    .line 448
    const/high16 v4, 0x41100000    # 9.0f

    .line 449
    .line 450
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x3f88f5c3    # 1.07f

    .line 454
    .line 455
    .line 456
    const v18, 0x4079999a    # 3.9f

    .line 457
    .line 458
    .line 459
    const v14, 0x3fa147ae    # 1.26f

    .line 460
    .line 461
    .line 462
    const v15, 0x3ec28f5c    # 0.38f

    .line 463
    .line 464
    .line 465
    const v16, 0x4029999a    # 2.65f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v17, 0x40366666    # 2.85f

    .line 472
    .line 473
    .line 474
    const v18, 0x4049999a    # 3.15f

    .line 475
    .line 476
    .line 477
    const v13, 0x3f68f5c3    # 0.91f

    .line 478
    .line 479
    .line 480
    const v14, 0x3fd33333    # 1.65f

    .line 481
    .line 482
    .line 483
    const v15, 0x3ffd70a4    # 1.98f

    .line 484
    .line 485
    .line 486
    const v16, 0x401eb852    # 2.48f

    .line 487
    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const v17, 0x3fdae148    # 1.71f

    .line 493
    .line 494
    .line 495
    const v18, 0x40033333    # 2.05f

    .line 496
    .line 497
    .line 498
    const v13, 0x3f4f5c29    # 0.81f

    .line 499
    .line 500
    .line 501
    const v14, 0x3f1eb852    # 0.62f

    .line 502
    .line 503
    .line 504
    const v15, 0x3fb1eb85    # 1.39f

    .line 505
    .line 506
    .line 507
    const v16, 0x3f88f5c3    # 1.07f

    .line 508
    .line 509
    .line 510
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v17, 0x402eb852    # 2.73f

    .line 514
    .line 515
    .line 516
    const v18, 0x40633333    # 3.55f

    .line 517
    .line 518
    .line 519
    const v13, 0x3f19999a    # 0.6f

    .line 520
    .line 521
    .line 522
    const v14, 0x3fe8f5c3    # 1.82f

    .line 523
    .line 524
    .line 525
    const v15, 0x3faf5c29    # 1.37f

    .line 526
    .line 527
    .line 528
    const v16, 0x4035c28f    # 2.84f

    .line 529
    .line 530
    .line 531
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    .line 534
    const v17, 0x3fd1eb85    # 1.64f

    .line 535
    .line 536
    .line 537
    const v18, 0x3eb33333    # 0.35f

    .line 538
    .line 539
    .line 540
    const v13, 0x3f028f5c    # 0.51f

    .line 541
    .line 542
    .line 543
    const v14, 0x3e6b851f    # 0.23f

    .line 544
    .line 545
    .line 546
    const v15, 0x3f88f5c3    # 1.07f

    .line 547
    .line 548
    .line 549
    const v16, 0x3eb33333    # 0.35f

    .line 550
    .line 551
    .line 552
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/high16 v17, 0x40800000    # 4.0f

    .line 556
    .line 557
    const/high16 v18, -0x3f800000    # -4.0f

    .line 558
    .line 559
    const v13, 0x400d70a4    # 2.21f

    .line 560
    .line 561
    .line 562
    const/4 v14, 0x0

    .line 563
    const/high16 v15, 0x40800000    # 4.0f

    .line 564
    .line 565
    const v16, -0x401ae148    # -1.79f

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, -0x40000000    # -2.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    const/high16 v17, -0x40000000    # -2.0f

    .line 577
    .line 578
    const/high16 v18, 0x40000000    # 2.0f

    .line 579
    .line 580
    const/4 v13, 0x0

    .line 581
    const v14, 0x3f8ccccd    # 1.1f

    .line 582
    .line 583
    .line 584
    const v15, -0x4099999a    # -0.9f

    .line 585
    .line 586
    .line 587
    const/high16 v16, 0x40000000    # 2.0f

    .line 588
    .line 589
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    const/16 v16, 0x3800

    .line 600
    .line 601
    const/16 v17, 0x0

    .line 602
    .line 603
    const/high16 v6, 0x3f800000    # 1.0f

    .line 604
    .line 605
    const/4 v7, 0x0

    .line 606
    const/high16 v12, 0x3f800000    # 1.0f

    .line 607
    .line 608
    const/4 v14, 0x0

    .line 609
    const/4 v15, 0x0

    .line 610
    const-string v4, ""

    .line 611
    .line 612
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    sput-object v0, Landroidx/compose/material/icons/twotone/HearingKt;->_hearing:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 621
    .line 622
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 623
    .line 624
    .line 625
    return-object v0
.end method

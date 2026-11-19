.class public final Landroidx/compose/material/icons/twotone/DepartureBoardKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _departureBoard:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDepartureBoard(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DepartureBoardKt;->_departureBoard:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.DepartureBoard"

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
    const v4, 0x4114a3d7    # 9.29f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x40c00000    # 6.0f

    .line 74
    .line 75
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41100000    # 9.0f

    .line 79
    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, -0x3f4ae148    # -5.66f

    .line 84
    .line 85
    .line 86
    const v26, 0x3f7d70a4    # 0.99f

    .line 87
    .line 88
    .line 89
    const v21, -0x3f93d70a    # -3.69f

    .line 90
    .line 91
    .line 92
    const/16 v22, 0x0

    .line 93
    .line 94
    const v23, -0x3f5c7ae1    # -5.11f

    .line 95
    .line 96
    .line 97
    const v24, 0x3eeb851f    # 0.46f

    .line 98
    .line 99
    .line 100
    move-object/from16 v20, v2

    .line 101
    .line 102
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const v4, 0x40b7ae14    # 5.74f

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v25, 0x3e570a3d    # 0.21f

    .line 112
    .line 113
    .line 114
    const v26, -0x40828f5c    # -0.99f

    .line 115
    .line 116
    .line 117
    const v21, 0x3d4ccccd    # 0.05f

    .line 118
    .line 119
    .line 120
    const v22, -0x41570a3d    # -0.33f

    .line 121
    .line 122
    .line 123
    const v23, 0x3df5c28f    # 0.12f

    .line 124
    .line 125
    .line 126
    const v24, -0x40d47ae1    # -0.67f

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x41600000    # 14.0f

    .line 136
    .line 137
    const/high16 v6, 0x40400000    # 3.0f

    .line 138
    .line 139
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v4, 0x40800000    # 4.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v25, 0x3eae147b    # 0.34f

    .line 148
    .line 149
    .line 150
    const v26, 0x3f3ae148    # 0.73f

    .line 151
    .line 152
    .line 153
    const/16 v21, 0x0

    .line 154
    .line 155
    const v22, 0x3ebd70a4    # 0.37f

    .line 156
    .line 157
    .line 158
    const v23, 0x3e570a3d    # 0.21f

    .line 159
    .line 160
    .line 161
    const v24, 0x3f1eb852    # 0.62f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v4, 0x3e8a3d71    # 0.27f

    .line 168
    .line 169
    .line 170
    const v6, 0x3e947ae1    # 0.29f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const v4, 0x412bd70a    # 10.74f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, -0x4175c28f    # -0.27f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v26, -0x40c51eb8    # -0.73f

    .line 189
    .line 190
    .line 191
    const v21, 0x3e051eb8    # 0.13f

    .line 192
    .line 193
    .line 194
    const v22, -0x421eb852    # -0.11f

    .line 195
    .line 196
    .line 197
    const v23, 0x3eae147b    # 0.34f

    .line 198
    .line 199
    .line 200
    const v24, -0x4147ae14    # -0.36f

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 204
    .line 205
    .line 206
    const v4, -0x3fbae148    # -3.08f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v25, -0x3fda3d71    # -2.59f

    .line 213
    .line 214
    .line 215
    const v26, -0x40947ae1    # -0.92f

    .line 216
    .line 217
    .line 218
    const v21, -0x408f5c29    # -0.94f

    .line 219
    .line 220
    .line 221
    const v22, -0x41fae148    # -0.13f

    .line 222
    .line 223
    .line 224
    const v23, -0x401851ec    # -1.81f

    .line 225
    .line 226
    .line 227
    const v24, -0x4119999a    # -0.45f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x41600000    # 14.0f

    .line 234
    .line 235
    const/high16 v6, 0x40400000    # 3.0f

    .line 236
    .line 237
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, 0x40b00000    # 5.5f

    .line 244
    .line 245
    const/high16 v6, 0x41900000    # 18.0f

    .line 246
    .line 247
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v25, -0x40400000    # -1.5f

    .line 251
    .line 252
    const/high16 v26, -0x40400000    # -1.5f

    .line 253
    .line 254
    const v21, -0x40ab851f    # -0.83f

    .line 255
    .line 256
    .line 257
    const/16 v22, 0x0

    .line 258
    .line 259
    const/high16 v23, -0x40400000    # -1.5f

    .line 260
    .line 261
    const v24, -0x40d47ae1    # -0.67f

    .line 262
    .line 263
    .line 264
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, 0x409570a4    # 4.67f

    .line 268
    .line 269
    .line 270
    const/high16 v6, 0x40b00000    # 5.5f

    .line 271
    .line 272
    const/high16 v7, 0x41700000    # 15.0f

    .line 273
    .line 274
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const v4, 0x3f2b851f    # 0.67f

    .line 278
    .line 279
    .line 280
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 281
    .line 282
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v4, 0x40ca8f5c    # 6.33f

    .line 286
    .line 287
    .line 288
    const/high16 v6, 0x40b00000    # 5.5f

    .line 289
    .line 290
    const/high16 v7, 0x41900000    # 18.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v4, 0x41600000    # 14.0f

    .line 299
    .line 300
    const/high16 v6, 0x41840000    # 16.5f

    .line 301
    .line 302
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 306
    .line 307
    const/16 v21, 0x0

    .line 308
    .line 309
    const v22, 0x3f547ae1    # 0.83f

    .line 310
    .line 311
    .line 312
    const v23, -0x40d47ae1    # -0.67f

    .line 313
    .line 314
    .line 315
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 316
    .line 317
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const v4, -0x40d47ae1    # -0.67f

    .line 321
    .line 322
    .line 323
    const/high16 v6, -0x40400000    # -1.5f

    .line 324
    .line 325
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v4, 0x3f2b851f    # 0.67f

    .line 329
    .line 330
    .line 331
    const/high16 v7, 0x3fc00000    # 1.5f

    .line 332
    .line 333
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 337
    .line 338
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    const/16 v16, 0x3800

    .line 349
    .line 350
    const/16 v17, 0x0

    .line 351
    .line 352
    const v6, 0x3e99999a    # 0.3f

    .line 353
    .line 354
    .line 355
    const v8, 0x3e99999a    # 0.3f

    .line 356
    .line 357
    .line 358
    const/4 v7, 0x0

    .line 359
    const/high16 v9, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/high16 v12, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/4 v13, 0x0

    .line 364
    const/4 v14, 0x0

    .line 365
    const/4 v15, 0x0

    .line 366
    const-string v4, ""

    .line 367
    .line 368
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 369
    .line 370
    .line 371
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 376
    .line 377
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    const/4 v2, 0x0

    .line 382
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 390
    .line 391
    .line 392
    move-result v11

    .line 393
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 394
    .line 395
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 396
    .line 397
    .line 398
    const/high16 v4, 0x41840000    # 16.5f

    .line 399
    .line 400
    const/high16 v6, 0x40b00000    # 5.5f

    .line 401
    .line 402
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    const/4 v4, 0x0

    .line 406
    const/high16 v6, -0x40400000    # -1.5f

    .line 407
    .line 408
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 409
    .line 410
    .line 411
    const/high16 v26, 0x40400000    # 3.0f

    .line 412
    .line 413
    const/16 v27, 0x0

    .line 414
    .line 415
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 416
    .line 417
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 418
    .line 419
    const/16 v23, 0x0

    .line 420
    .line 421
    const/16 v24, 0x1

    .line 422
    .line 423
    const/16 v25, 0x1

    .line 424
    .line 425
    move-object/from16 v20, v2

    .line 426
    .line 427
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 431
    .line 432
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    const/high16 v6, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const/high16 v8, 0x3f800000    # 1.0f

    .line 442
    .line 443
    const/4 v7, 0x0

    .line 444
    const-string v4, ""

    .line 445
    .line 446
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 447
    .line 448
    .line 449
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 450
    .line 451
    .line 452
    move-result v3

    .line 453
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 454
    .line 455
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 456
    .line 457
    .line 458
    move-result-wide v6

    .line 459
    const/4 v2, 0x0

    .line 460
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 464
    .line 465
    .line 466
    move-result v10

    .line 467
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 468
    .line 469
    .line 470
    move-result v11

    .line 471
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 474
    .line 475
    .line 476
    const/high16 v4, 0x41480000    # 12.5f

    .line 477
    .line 478
    const/high16 v6, 0x41840000    # 16.5f

    .line 479
    .line 480
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/4 v4, 0x0

    .line 484
    const/high16 v6, -0x40400000    # -1.5f

    .line 485
    .line 486
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v26, 0x40400000    # 3.0f

    .line 490
    .line 491
    move-object/from16 v20, v2

    .line 492
    .line 493
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 497
    .line 498
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    const/high16 v6, 0x3f800000    # 1.0f

    .line 506
    .line 507
    const/4 v7, 0x0

    .line 508
    const-string v4, ""

    .line 509
    .line 510
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 511
    .line 512
    .line 513
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 518
    .line 519
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 520
    .line 521
    .line 522
    move-result-wide v6

    .line 523
    const/4 v0, 0x0

    .line 524
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 528
    .line 529
    .line 530
    move-result v10

    .line 531
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 532
    .line 533
    .line 534
    move-result v11

    .line 535
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x41800000    # 16.0f

    .line 541
    .line 542
    const/high16 v2, 0x3f800000    # 1.0f

    .line 543
    .line 544
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v17, -0x3f480000    # -5.75f

    .line 548
    .line 549
    const v18, 0x404147ae    # 3.02f

    .line 550
    .line 551
    .line 552
    const v13, -0x3fe70a3d    # -2.39f

    .line 553
    .line 554
    .line 555
    const v15, -0x3f7051ec    # -4.49f

    .line 556
    .line 557
    .line 558
    const v16, 0x3f99999a    # 1.2f

    .line 559
    .line 560
    .line 561
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    const/high16 v17, 0x41100000    # 9.0f

    .line 565
    .line 566
    const/high16 v18, 0x40800000    # 4.0f

    .line 567
    .line 568
    const v13, 0x411d70a4    # 9.84f

    .line 569
    .line 570
    .line 571
    const v14, 0x408051ec    # 4.01f

    .line 572
    .line 573
    .line 574
    const v15, 0x4116e148    # 9.43f

    .line 575
    .line 576
    .line 577
    const/high16 v16, 0x40800000    # 4.0f

    .line 578
    .line 579
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v17, -0x3f000000    # -8.0f

    .line 583
    .line 584
    const v13, -0x3f728f5c    # -4.42f

    .line 585
    .line 586
    .line 587
    const/4 v14, 0x0

    .line 588
    const/high16 v15, -0x3f000000    # -8.0f

    .line 589
    .line 590
    const/high16 v16, 0x3f000000    # 0.5f

    .line 591
    .line 592
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const/high16 v0, 0x41200000    # 10.0f

    .line 596
    .line 597
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v17, 0x3f800000    # 1.0f

    .line 601
    .line 602
    const v18, 0x400e147b    # 2.22f

    .line 603
    .line 604
    .line 605
    const/4 v13, 0x0

    .line 606
    const v14, 0x3f6147ae    # 0.88f

    .line 607
    .line 608
    .line 609
    const v15, 0x3ec7ae14    # 0.39f

    .line 610
    .line 611
    .line 612
    const v16, 0x3fd5c28f    # 1.67f

    .line 613
    .line 614
    .line 615
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const/high16 v0, 0x40000000    # 2.0f

    .line 619
    .line 620
    const/high16 v2, 0x41b00000    # 22.0f

    .line 621
    .line 622
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 623
    .line 624
    .line 625
    const/high16 v18, 0x3f800000    # 1.0f

    .line 626
    .line 627
    const v14, 0x3f0ccccd    # 0.55f

    .line 628
    .line 629
    .line 630
    const v15, 0x3ee66666    # 0.45f

    .line 631
    .line 632
    .line 633
    const/high16 v16, 0x3f800000    # 1.0f

    .line 634
    .line 635
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const/high16 v0, 0x3f800000    # 1.0f

    .line 639
    .line 640
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v18, -0x40800000    # -1.0f

    .line 644
    .line 645
    const v13, 0x3f0ccccd    # 0.55f

    .line 646
    .line 647
    .line 648
    const/4 v14, 0x0

    .line 649
    const/high16 v15, 0x3f800000    # 1.0f

    .line 650
    .line 651
    const v16, -0x4119999a    # -0.45f

    .line 652
    .line 653
    .line 654
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v0, -0x40800000    # -1.0f

    .line 658
    .line 659
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, 0x41000000    # 8.0f

    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v0, 0x3f800000    # 1.0f

    .line 668
    .line 669
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v18, 0x3f800000    # 1.0f

    .line 673
    .line 674
    const/4 v13, 0x0

    .line 675
    const v14, 0x3f0ccccd    # 0.55f

    .line 676
    .line 677
    .line 678
    const v15, 0x3ee66666    # 0.45f

    .line 679
    .line 680
    .line 681
    const/high16 v16, 0x3f800000    # 1.0f

    .line 682
    .line 683
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 687
    .line 688
    .line 689
    const/high16 v18, -0x40800000    # -1.0f

    .line 690
    .line 691
    const v13, 0x3f0ccccd    # 0.55f

    .line 692
    .line 693
    .line 694
    const/4 v14, 0x0

    .line 695
    const/high16 v15, 0x3f800000    # 1.0f

    .line 696
    .line 697
    const v16, -0x4119999a    # -0.45f

    .line 698
    .line 699
    .line 700
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v0, -0x401c28f6    # -1.78f

    .line 704
    .line 705
    .line 706
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 707
    .line 708
    .line 709
    const v18, -0x3ff1eb85    # -2.22f

    .line 710
    .line 711
    .line 712
    const v13, 0x3f1c28f6    # 0.61f

    .line 713
    .line 714
    .line 715
    const v14, -0x40f33333    # -0.55f

    .line 716
    .line 717
    .line 718
    const v16, -0x40547ae1    # -1.34f

    .line 719
    .line 720
    .line 721
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 722
    .line 723
    .line 724
    const v0, -0x3fbae148    # -3.08f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v17, 0x40c00000    # 6.0f

    .line 731
    .line 732
    const v18, -0x3f228f5c    # -6.92f

    .line 733
    .line 734
    .line 735
    const v13, 0x4058f5c3    # 3.39f

    .line 736
    .line 737
    .line 738
    const v14, -0x41051eb8    # -0.49f

    .line 739
    .line 740
    .line 741
    const/high16 v15, 0x40c00000    # 6.0f

    .line 742
    .line 743
    const v16, -0x3fa70a3d    # -3.39f

    .line 744
    .line 745
    .line 746
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 747
    .line 748
    .line 749
    const/high16 v17, -0x3f200000    # -7.0f

    .line 750
    .line 751
    const/high16 v18, -0x3f200000    # -7.0f

    .line 752
    .line 753
    const/4 v13, 0x0

    .line 754
    const v14, -0x3f8851ec    # -3.87f

    .line 755
    .line 756
    .line 757
    const v15, -0x3fb7ae14    # -3.13f

    .line 758
    .line 759
    .line 760
    const/high16 v16, -0x3f200000    # -7.0f

    .line 761
    .line 762
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    const/high16 v0, 0x41100000    # 9.0f

    .line 769
    .line 770
    const/high16 v2, 0x40c00000    # 6.0f

    .line 771
    .line 772
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 773
    .line 774
    .line 775
    const v0, 0x3e947ae1    # 0.29f

    .line 776
    .line 777
    .line 778
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 779
    .line 780
    .line 781
    const v17, -0x41a8f5c3    # -0.21f

    .line 782
    .line 783
    .line 784
    const v18, 0x3f7d70a4    # 0.99f

    .line 785
    .line 786
    .line 787
    const v13, -0x4247ae14    # -0.09f

    .line 788
    .line 789
    .line 790
    const v14, 0x3ea3d70a    # 0.32f

    .line 791
    .line 792
    .line 793
    const v15, -0x41dc28f6    # -0.16f

    .line 794
    .line 795
    .line 796
    const v16, 0x3f28f5c3    # 0.66f

    .line 797
    .line 798
    .line 799
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 800
    .line 801
    .line 802
    const v0, 0x4055c28f    # 3.34f

    .line 803
    .line 804
    .line 805
    const v2, 0x40dfae14    # 6.99f

    .line 806
    .line 807
    .line 808
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 809
    .line 810
    .line 811
    const/high16 v17, 0x41100000    # 9.0f

    .line 812
    .line 813
    const/high16 v18, 0x40c00000    # 6.0f

    .line 814
    .line 815
    const v13, 0x4078f5c3    # 3.89f

    .line 816
    .line 817
    .line 818
    const v14, 0x40ceb852    # 6.46f

    .line 819
    .line 820
    .line 821
    const v15, 0x40a9eb85    # 5.31f

    .line 822
    .line 823
    .line 824
    const/high16 v16, 0x40c00000    # 6.0f

    .line 825
    .line 826
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    .line 829
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 830
    .line 831
    .line 832
    const v0, 0x410fd70a    # 8.99f

    .line 833
    .line 834
    .line 835
    const/high16 v2, 0x40400000    # 3.0f

    .line 836
    .line 837
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 838
    .line 839
    .line 840
    const v0, 0x40c28f5c    # 6.08f

    .line 841
    .line 842
    .line 843
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 844
    .line 845
    .line 846
    const v17, 0x3f970a3d    # 1.18f

    .line 847
    .line 848
    .line 849
    const v18, 0x4040a3d7    # 3.01f

    .line 850
    .line 851
    .line 852
    const v13, 0x3e23d70a    # 0.16f

    .line 853
    .line 854
    .line 855
    const v14, 0x3f8e147b    # 1.11f

    .line 856
    .line 857
    .line 858
    const v15, 0x3f11eb85    # 0.57f

    .line 859
    .line 860
    .line 861
    const v16, 0x400851ec    # 2.13f

    .line 862
    .line 863
    .line 864
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 865
    .line 866
    .line 867
    const/high16 v0, 0x41400000    # 12.0f

    .line 868
    .line 869
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 870
    .line 871
    .line 872
    const v0, 0x410fd70a    # 8.99f

    .line 873
    .line 874
    .line 875
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 879
    .line 880
    .line 881
    const/high16 v0, 0x41700000    # 15.0f

    .line 882
    .line 883
    const/high16 v2, 0x41900000    # 18.0f

    .line 884
    .line 885
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v17, -0x4151eb85    # -0.34f

    .line 889
    .line 890
    .line 891
    const v18, 0x3f3ae148    # 0.73f

    .line 892
    .line 893
    .line 894
    const/4 v13, 0x0

    .line 895
    const v14, 0x3ebd70a4    # 0.37f

    .line 896
    .line 897
    .line 898
    const v15, -0x41a8f5c3    # -0.21f

    .line 899
    .line 900
    .line 901
    const v16, 0x3f1eb852    # 0.62f

    .line 902
    .line 903
    .line 904
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 905
    .line 906
    .line 907
    const v0, -0x416b851f    # -0.29f

    .line 908
    .line 909
    .line 910
    const v2, 0x3e8a3d71    # 0.27f

    .line 911
    .line 912
    .line 913
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 914
    .line 915
    .line 916
    const v0, 0x406851ec    # 3.63f

    .line 917
    .line 918
    .line 919
    const/high16 v2, 0x41980000    # 19.0f

    .line 920
    .line 921
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 922
    .line 923
    .line 924
    const v0, -0x416b851f    # -0.29f

    .line 925
    .line 926
    .line 927
    const v2, -0x4175c28f    # -0.27f

    .line 928
    .line 929
    .line 930
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 931
    .line 932
    .line 933
    const/high16 v17, 0x40400000    # 3.0f

    .line 934
    .line 935
    const/high16 v18, 0x41900000    # 18.0f

    .line 936
    .line 937
    const v13, 0x404d70a4    # 3.21f

    .line 938
    .line 939
    .line 940
    const v14, 0x4194f5c3    # 18.62f

    .line 941
    .line 942
    .line 943
    const/high16 v15, 0x40400000    # 3.0f

    .line 944
    .line 945
    const v16, 0x4192f5c3    # 18.37f

    .line 946
    .line 947
    .line 948
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 949
    .line 950
    .line 951
    const/high16 v0, -0x3f800000    # -4.0f

    .line 952
    .line 953
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 954
    .line 955
    .line 956
    const v0, 0x41168f5c    # 9.41f

    .line 957
    .line 958
    .line 959
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 960
    .line 961
    .line 962
    const v17, 0x4025c28f    # 2.59f

    .line 963
    .line 964
    .line 965
    const v18, 0x3f6b851f    # 0.92f

    .line 966
    .line 967
    .line 968
    const v13, 0x3f47ae14    # 0.78f

    .line 969
    .line 970
    .line 971
    const v14, 0x3ef0a3d7    # 0.47f

    .line 972
    .line 973
    .line 974
    const v15, 0x3fd33333    # 1.65f

    .line 975
    .line 976
    .line 977
    const v16, 0x3f4a3d71    # 0.79f

    .line 978
    .line 979
    .line 980
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 981
    .line 982
    .line 983
    const/high16 v0, 0x41700000    # 15.0f

    .line 984
    .line 985
    const/high16 v2, 0x41900000    # 18.0f

    .line 986
    .line 987
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 991
    .line 992
    .line 993
    const/high16 v0, 0x41800000    # 16.0f

    .line 994
    .line 995
    const/high16 v2, 0x41500000    # 13.0f

    .line 996
    .line 997
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 998
    .line 999
    .line 1000
    const/high16 v17, -0x3f600000    # -5.0f

    .line 1001
    .line 1002
    const/high16 v18, -0x3f600000    # -5.0f

    .line 1003
    .line 1004
    const v13, -0x3fcf5c29    # -2.76f

    .line 1005
    .line 1006
    .line 1007
    const/4 v14, 0x0

    .line 1008
    const/high16 v15, -0x3f600000    # -5.0f

    .line 1009
    .line 1010
    const v16, -0x3ff0a3d7    # -2.24f

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1014
    .line 1015
    .line 1016
    const v0, 0x400f5c29    # 2.24f

    .line 1017
    .line 1018
    .line 1019
    const/high16 v2, -0x3f600000    # -5.0f

    .line 1020
    .line 1021
    const/high16 v4, 0x40a00000    # 5.0f

    .line 1022
    .line 1023
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    .line 1026
    const/high16 v2, 0x40a00000    # 5.0f

    .line 1027
    .line 1028
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1029
    .line 1030
    .line 1031
    const v0, -0x3ff0a3d7    # -2.24f

    .line 1032
    .line 1033
    .line 1034
    const/high16 v2, -0x3f600000    # -5.0f

    .line 1035
    .line 1036
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const/high16 v0, 0x40800000    # 4.0f

    .line 1043
    .line 1044
    const/high16 v2, 0x41840000    # 16.5f

    .line 1045
    .line 1046
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1047
    .line 1048
    .line 1049
    const/high16 v2, 0x41700000    # 15.0f

    .line 1050
    .line 1051
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1052
    .line 1053
    .line 1054
    const/high16 v0, 0x40a00000    # 5.0f

    .line 1055
    .line 1056
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1057
    .line 1058
    .line 1059
    const v0, 0x4067ae14    # 3.62f

    .line 1060
    .line 1061
    .line 1062
    const v2, 0x400a3d71    # 2.16f

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    const/high16 v0, 0x3f400000    # 0.75f

    .line 1069
    .line 1070
    const v2, -0x40628f5c    # -1.23f

    .line 1071
    .line 1072
    .line 1073
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1074
    .line 1075
    .line 1076
    const v0, -0x3fc851ec    # -2.87f

    .line 1077
    .line 1078
    .line 1079
    const v2, -0x4028f5c3    # -1.68f

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v2

    .line 1092
    const/16 v16, 0x3800

    .line 1093
    .line 1094
    const/16 v17, 0x0

    .line 1095
    .line 1096
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1097
    .line 1098
    const/4 v7, 0x0

    .line 1099
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1100
    .line 1101
    const/4 v13, 0x0

    .line 1102
    const/4 v15, 0x0

    .line 1103
    const-string v4, ""

    .line 1104
    .line 1105
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v0

    .line 1109
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    sput-object v0, Landroidx/compose/material/icons/twotone/DepartureBoardKt;->_departureBoard:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1114
    .line 1115
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 1116
    .line 1117
    .line 1118
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/twotone/TrainKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _train:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getTrain(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/TrainKt;->_train:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Train"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v25, -0x3f4dc28f    # -5.57f

    .line 78
    .line 79
    .line 80
    const/high16 v26, 0x3f800000    # 1.0f

    .line 81
    .line 82
    const v21, -0x3f9f5c29    # -3.51f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const v23, -0x3f6147ae    # -4.96f

    .line 88
    .line 89
    .line 90
    const v24, 0x3ef5c28f    # 0.48f

    .line 91
    .line 92
    .line 93
    move-object/from16 v20, v2

    .line 94
    .line 95
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v4, 0x4132147b    # 11.13f

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v25, -0x3f4e147b    # -5.56f

    .line 105
    .line 106
    .line 107
    const/high16 v26, -0x40800000    # -1.0f

    .line 108
    .line 109
    const v21, -0x40e66666    # -0.6f

    .line 110
    .line 111
    .line 112
    const v22, -0x40fae148    # -0.52f

    .line 113
    .line 114
    .line 115
    const v23, -0x3ffccccd    # -2.05f

    .line 116
    .line 117
    .line 118
    const/high16 v24, -0x40800000    # -1.0f

    .line 119
    .line 120
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41780000    # 15.5f

    .line 127
    .line 128
    const/high16 v6, 0x40c00000    # 6.0f

    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 134
    .line 135
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 136
    .line 137
    const/16 v21, 0x0

    .line 138
    .line 139
    const v22, 0x3f547ae1    # 0.83f

    .line 140
    .line 141
    .line 142
    const v23, 0x3f2b851f    # 0.67f

    .line 143
    .line 144
    .line 145
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 146
    .line 147
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x41100000    # 9.0f

    .line 151
    .line 152
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    const/high16 v26, -0x40400000    # -1.5f

    .line 156
    .line 157
    const v21, 0x3f547ae1    # 0.83f

    .line 158
    .line 159
    .line 160
    const/16 v22, 0x0

    .line 161
    .line 162
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 163
    .line 164
    const v24, -0x40d47ae1    # -0.67f

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v4, 0x41900000    # 18.0f

    .line 171
    .line 172
    const/high16 v6, 0x41400000    # 12.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v4, 0x41400000    # 12.0f

    .line 178
    .line 179
    const/high16 v6, 0x40c00000    # 6.0f

    .line 180
    .line 181
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v4, 0x40600000    # 3.5f

    .line 185
    .line 186
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x41780000    # 15.5f

    .line 193
    .line 194
    const/high16 v6, 0x41500000    # 13.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 200
    .line 201
    const v24, 0x3f2b851f    # 0.67f

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v4, -0x40d47ae1    # -0.67f

    .line 208
    .line 209
    .line 210
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 211
    .line 212
    const/high16 v7, -0x40400000    # -1.5f

    .line 213
    .line 214
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v6, -0x40400000    # -1.5f

    .line 218
    .line 219
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const v4, 0x3f2b851f    # 0.67f

    .line 223
    .line 224
    .line 225
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 226
    .line 227
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x41080000    # 8.5f

    .line 234
    .line 235
    const/high16 v6, 0x41500000    # 13.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v4, 0x411547ae    # 9.33f

    .line 244
    .line 245
    .line 246
    const/high16 v6, 0x41800000    # 16.0f

    .line 247
    .line 248
    const/high16 v7, 0x41080000    # 8.5f

    .line 249
    .line 250
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x417547ae    # 15.33f

    .line 254
    .line 255
    .line 256
    const/high16 v6, 0x41680000    # 14.5f

    .line 257
    .line 258
    const/high16 v7, 0x40e00000    # 7.0f

    .line 259
    .line 260
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const v4, 0x40f570a4    # 7.67f

    .line 264
    .line 265
    .line 266
    const/high16 v6, 0x41080000    # 8.5f

    .line 267
    .line 268
    const/high16 v7, 0x41500000    # 13.0f

    .line 269
    .line 270
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    const/16 v16, 0x3800

    .line 281
    .line 282
    const/16 v17, 0x0

    .line 283
    .line 284
    const v6, 0x3e99999a    # 0.3f

    .line 285
    .line 286
    .line 287
    const v8, 0x3e99999a    # 0.3f

    .line 288
    .line 289
    .line 290
    const/4 v7, 0x0

    .line 291
    const/high16 v9, 0x3f800000    # 1.0f

    .line 292
    .line 293
    const/high16 v12, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/4 v13, 0x0

    .line 296
    const/4 v14, 0x0

    .line 297
    const/4 v15, 0x0

    .line 298
    const-string v4, ""

    .line 299
    .line 300
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 301
    .line 302
    .line 303
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 308
    .line 309
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 310
    .line 311
    .line 312
    move-result-wide v6

    .line 313
    const/4 v2, 0x0

    .line 314
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 318
    .line 319
    .line 320
    move-result v10

    .line 321
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    const/high16 v4, 0x41680000    # 14.5f

    .line 331
    .line 332
    const/high16 v6, 0x41080000    # 8.5f

    .line 333
    .line 334
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const/4 v4, 0x0

    .line 338
    const/high16 v6, -0x40400000    # -1.5f

    .line 339
    .line 340
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v26, 0x40400000    # 3.0f

    .line 344
    .line 345
    const/16 v27, 0x0

    .line 346
    .line 347
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 348
    .line 349
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 350
    .line 351
    const/16 v23, 0x0

    .line 352
    .line 353
    const/16 v24, 0x1

    .line 354
    .line 355
    const/16 v25, 0x1

    .line 356
    .line 357
    move-object/from16 v20, v2

    .line 358
    .line 359
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 363
    .line 364
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    const/high16 v6, 0x3f800000    # 1.0f

    .line 372
    .line 373
    const/high16 v8, 0x3f800000    # 1.0f

    .line 374
    .line 375
    const/4 v7, 0x0

    .line 376
    const-string v4, ""

    .line 377
    .line 378
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 379
    .line 380
    .line 381
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 386
    .line 387
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 388
    .line 389
    .line 390
    move-result-wide v6

    .line 391
    const/4 v2, 0x0

    .line 392
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 396
    .line 397
    .line 398
    move-result v10

    .line 399
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 400
    .line 401
    .line 402
    move-result v11

    .line 403
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 404
    .line 405
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 406
    .line 407
    .line 408
    const/high16 v4, 0x41680000    # 14.5f

    .line 409
    .line 410
    const/high16 v6, 0x41780000    # 15.5f

    .line 411
    .line 412
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/4 v4, 0x0

    .line 416
    const/high16 v6, -0x40400000    # -1.5f

    .line 417
    .line 418
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v26, 0x40400000    # 3.0f

    .line 422
    .line 423
    move-object/from16 v20, v2

    .line 424
    .line 425
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    const/high16 v6, 0x3f800000    # 1.0f

    .line 438
    .line 439
    const/4 v7, 0x0

    .line 440
    const-string v4, ""

    .line 441
    .line 442
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 443
    .line 444
    .line 445
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 450
    .line 451
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 452
    .line 453
    .line 454
    move-result-wide v6

    .line 455
    const/4 v0, 0x0

    .line 456
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 460
    .line 461
    .line 462
    move-result v10

    .line 463
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 464
    .line 465
    .line 466
    move-result v11

    .line 467
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 468
    .line 469
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x40000000    # 2.0f

    .line 473
    .line 474
    const/high16 v2, 0x41400000    # 12.0f

    .line 475
    .line 476
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v17, -0x3f000000    # -8.0f

    .line 480
    .line 481
    const/high16 v18, 0x40800000    # 4.0f

    .line 482
    .line 483
    const/high16 v13, -0x3f800000    # -4.0f

    .line 484
    .line 485
    const/high16 v15, -0x3f000000    # -8.0f

    .line 486
    .line 487
    const/high16 v16, 0x3f000000    # 0.5f

    .line 488
    .line 489
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    const/high16 v0, 0x41180000    # 9.5f

    .line 493
    .line 494
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 495
    .line 496
    .line 497
    const/high16 v17, 0x40f00000    # 7.5f

    .line 498
    .line 499
    const/high16 v18, 0x41980000    # 19.0f

    .line 500
    .line 501
    const/high16 v13, 0x40800000    # 4.0f

    .line 502
    .line 503
    const v14, 0x418b70a4    # 17.43f

    .line 504
    .line 505
    .line 506
    const v15, 0x40b23d71    # 5.57f

    .line 507
    .line 508
    .line 509
    const/high16 v16, 0x41980000    # 19.0f

    .line 510
    .line 511
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x41a40000    # 20.5f

    .line 515
    .line 516
    const/high16 v2, 0x40c00000    # 6.0f

    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, 0x3f000000    # 0.5f

    .line 522
    .line 523
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x40000000    # 2.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v0, -0x40000000    # -2.0f

    .line 532
    .line 533
    const/high16 v2, 0x40000000    # 2.0f

    .line 534
    .line 535
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v0, 0x40800000    # 4.0f

    .line 539
    .line 540
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v0, 0x40000000    # 2.0f

    .line 544
    .line 545
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 549
    .line 550
    .line 551
    const/high16 v0, -0x41000000    # -0.5f

    .line 552
    .line 553
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x41840000    # 16.5f

    .line 557
    .line 558
    const/high16 v2, 0x41980000    # 19.0f

    .line 559
    .line 560
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const/high16 v17, 0x40600000    # 3.5f

    .line 564
    .line 565
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 566
    .line 567
    const v13, 0x3ff70a3d    # 1.93f

    .line 568
    .line 569
    .line 570
    const/4 v14, 0x0

    .line 571
    const/high16 v15, 0x40600000    # 3.5f

    .line 572
    .line 573
    const v16, -0x40370a3d    # -1.57f

    .line 574
    .line 575
    .line 576
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v0, 0x41a00000    # 20.0f

    .line 580
    .line 581
    const/high16 v2, 0x40c00000    # 6.0f

    .line 582
    .line 583
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v17, -0x3f000000    # -8.0f

    .line 587
    .line 588
    const/high16 v18, -0x3f800000    # -4.0f

    .line 589
    .line 590
    const/4 v13, 0x0

    .line 591
    const/high16 v14, -0x3fa00000    # -3.5f

    .line 592
    .line 593
    const/high16 v15, -0x3f800000    # -4.0f

    .line 594
    .line 595
    const/high16 v16, -0x3f800000    # -4.0f

    .line 596
    .line 597
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x40800000    # 4.0f

    .line 604
    .line 605
    const/high16 v2, 0x41400000    # 12.0f

    .line 606
    .line 607
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const v17, 0x40b23d71    # 5.57f

    .line 611
    .line 612
    .line 613
    const/high16 v18, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const v13, 0x4060a3d7    # 3.51f

    .line 616
    .line 617
    .line 618
    const/4 v14, 0x0

    .line 619
    const v15, 0x409eb852    # 4.96f

    .line 620
    .line 621
    .line 622
    const v16, 0x3ef5c28f    # 0.48f

    .line 623
    .line 624
    .line 625
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 626
    .line 627
    .line 628
    const v0, 0x40cdc28f    # 6.43f

    .line 629
    .line 630
    .line 631
    const/high16 v2, 0x40a00000    # 5.0f

    .line 632
    .line 633
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v18, -0x40800000    # -1.0f

    .line 637
    .line 638
    const v13, 0x3f1c28f6    # 0.61f

    .line 639
    .line 640
    .line 641
    const v14, -0x40fae148    # -0.52f

    .line 642
    .line 643
    .line 644
    const v15, 0x4003d70a    # 2.06f

    .line 645
    .line 646
    .line 647
    const/high16 v16, -0x40800000    # -1.0f

    .line 648
    .line 649
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v0, 0x40e00000    # 7.0f

    .line 656
    .line 657
    const/high16 v2, 0x40c00000    # 6.0f

    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, 0x40a00000    # 5.0f

    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v0, 0x40400000    # 3.0f

    .line 668
    .line 669
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 670
    .line 671
    .line 672
    const/high16 v0, 0x41200000    # 10.0f

    .line 673
    .line 674
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    const/high16 v0, 0x40e00000    # 7.0f

    .line 678
    .line 679
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 683
    .line 684
    .line 685
    const/high16 v0, 0x41900000    # 18.0f

    .line 686
    .line 687
    const/high16 v2, 0x41780000    # 15.5f

    .line 688
    .line 689
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const/high16 v17, -0x40400000    # -1.5f

    .line 693
    .line 694
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 695
    .line 696
    const/4 v13, 0x0

    .line 697
    const v14, 0x3f547ae1    # 0.83f

    .line 698
    .line 699
    .line 700
    const v15, -0x40d47ae1    # -0.67f

    .line 701
    .line 702
    .line 703
    const/high16 v16, 0x3fc00000    # 1.5f

    .line 704
    .line 705
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 706
    .line 707
    .line 708
    const/high16 v0, -0x3ef00000    # -9.0f

    .line 709
    .line 710
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 711
    .line 712
    .line 713
    const/high16 v18, -0x40400000    # -1.5f

    .line 714
    .line 715
    const v13, -0x40ab851f    # -0.83f

    .line 716
    .line 717
    .line 718
    const/4 v14, 0x0

    .line 719
    const/high16 v15, -0x40400000    # -1.5f

    .line 720
    .line 721
    const v16, -0x40d47ae1    # -0.67f

    .line 722
    .line 723
    .line 724
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v0, 0x41400000    # 12.0f

    .line 728
    .line 729
    const/high16 v2, 0x40c00000    # 6.0f

    .line 730
    .line 731
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const/high16 v0, 0x40600000    # 3.5f

    .line 738
    .line 739
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 743
    .line 744
    .line 745
    const/high16 v0, 0x41200000    # 10.0f

    .line 746
    .line 747
    const/high16 v2, 0x41900000    # 18.0f

    .line 748
    .line 749
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v0, -0x3f600000    # -5.0f

    .line 753
    .line 754
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 755
    .line 756
    .line 757
    const/high16 v0, 0x40e00000    # 7.0f

    .line 758
    .line 759
    const/high16 v2, 0x41500000    # 13.0f

    .line 760
    .line 761
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 762
    .line 763
    .line 764
    const/high16 v0, 0x40a00000    # 5.0f

    .line 765
    .line 766
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v0, 0x40400000    # 3.0f

    .line 770
    .line 771
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 772
    .line 773
    .line 774
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    const/16 v16, 0x3800

    .line 782
    .line 783
    const/16 v17, 0x0

    .line 784
    .line 785
    const/high16 v6, 0x3f800000    # 1.0f

    .line 786
    .line 787
    const/4 v7, 0x0

    .line 788
    const/high16 v12, 0x3f800000    # 1.0f

    .line 789
    .line 790
    const/4 v13, 0x0

    .line 791
    const/4 v15, 0x0

    .line 792
    const-string v4, ""

    .line 793
    .line 794
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    sput-object v0, Landroidx/compose/material/icons/twotone/TrainKt;->_train:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 803
    .line 804
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    return-object v0
.end method

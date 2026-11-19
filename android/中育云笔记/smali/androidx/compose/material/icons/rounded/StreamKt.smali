.class public final Landroidx/compose/material/icons/rounded/StreamKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _stream:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getStream(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/StreamKt;->_stream:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Stream"

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
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v26, 0x40800000    # 4.0f

    .line 84
    .line 85
    const/16 v27, 0x0

    .line 86
    .line 87
    const/high16 v21, 0x40000000    # 2.0f

    .line 88
    .line 89
    const/high16 v22, 0x40000000    # 2.0f

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
    const/high16 v26, -0x3f800000    # -4.0f

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 160
    .line 161
    const/high16 v6, 0x41400000    # 12.0f

    .line 162
    .line 163
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v4, -0x40000000    # -2.0f

    .line 167
    .line 168
    const/4 v6, 0x0

    .line 169
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v26, 0x40800000    # 4.0f

    .line 173
    .line 174
    move-object/from16 v20, v2

    .line 175
    .line 176
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v26, -0x3f800000    # -4.0f

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
    const/4 v2, 0x0

    .line 207
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const/high16 v4, 0x41a00000    # 20.0f

    .line 224
    .line 225
    const/high16 v6, 0x41400000    # 12.0f

    .line 226
    .line 227
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, -0x40000000    # -2.0f

    .line 231
    .line 232
    const/4 v6, 0x0

    .line 233
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v26, 0x40800000    # 4.0f

    .line 237
    .line 238
    move-object/from16 v20, v2

    .line 239
    .line 240
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v26, -0x3f800000    # -4.0f

    .line 244
    .line 245
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    const/high16 v6, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/4 v7, 0x0

    .line 255
    const-string v4, ""

    .line 256
    .line 257
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 258
    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 265
    .line 266
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 267
    .line 268
    .line 269
    move-result-wide v6

    .line 270
    const/4 v2, 0x0

    .line 271
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    const v4, 0x40fc7ae1    # 7.89f

    .line 288
    .line 289
    .line 290
    const v6, 0x416a6666    # 14.65f

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 294
    .line 295
    .line 296
    const v4, -0x3fc3d70a    # -2.94f

    .line 297
    .line 298
    .line 299
    const v6, 0x403b851f    # 2.93f

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/16 v25, 0x0

    .line 306
    .line 307
    const v26, 0x3fb47ae1    # 1.41f

    .line 308
    .line 309
    .line 310
    const v21, -0x413851ec    # -0.39f

    .line 311
    .line 312
    .line 313
    const v22, 0x3ec7ae14    # 0.39f

    .line 314
    .line 315
    .line 316
    const v23, -0x413851ec    # -0.39f

    .line 317
    .line 318
    .line 319
    const v24, 0x3f828f5c    # 1.02f

    .line 320
    .line 321
    .line 322
    move-object/from16 v20, v2

    .line 323
    .line 324
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, 0x3f828f5c    # 1.02f

    .line 328
    .line 329
    .line 330
    const v6, 0x3fb47ae1    # 1.41f

    .line 331
    .line 332
    .line 333
    const v7, 0x3ec7ae14    # 0.39f

    .line 334
    .line 335
    .line 336
    const/4 v8, 0x0

    .line 337
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const v4, -0x3fc47ae1    # -2.93f

    .line 341
    .line 342
    .line 343
    const v6, 0x403c28f6    # 2.94f

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 347
    .line 348
    .line 349
    const v26, -0x404b851f    # -1.41f

    .line 350
    .line 351
    .line 352
    const v21, 0x3ec7ae14    # 0.39f

    .line 353
    .line 354
    .line 355
    const v22, -0x413d70a4    # -0.38f

    .line 356
    .line 357
    .line 358
    const v23, 0x3ec7ae14    # 0.39f

    .line 359
    .line 360
    .line 361
    const v24, -0x407d70a4    # -1.02f

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 365
    .line 366
    .line 367
    const v25, 0x40fc7ae1    # 7.89f

    .line 368
    .line 369
    .line 370
    const v26, 0x416a6666    # 14.65f

    .line 371
    .line 372
    .line 373
    const v21, 0x410e8f5c    # 8.91f

    .line 374
    .line 375
    .line 376
    const v22, 0x416428f6    # 14.26f

    .line 377
    .line 378
    .line 379
    const v23, 0x41047ae1    # 8.28f

    .line 380
    .line 381
    .line 382
    const v24, 0x416428f6    # 14.26f

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
    const/4 v2, 0x0

    .line 416
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 430
    .line 431
    .line 432
    const v4, 0x409e147b    # 4.94f

    .line 433
    .line 434
    .line 435
    const v6, 0x40cd1eb8    # 6.41f

    .line 436
    .line 437
    .line 438
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/high16 v25, 0x40a00000    # 5.0f

    .line 442
    .line 443
    const v26, 0x409e147b    # 4.94f

    .line 444
    .line 445
    .line 446
    const v21, 0x40c0a3d7    # 6.02f

    .line 447
    .line 448
    .line 449
    const v22, 0x4091999a    # 4.55f

    .line 450
    .line 451
    .line 452
    const v23, 0x40ac7ae1    # 5.39f

    .line 453
    .line 454
    .line 455
    const v24, 0x4091999a    # 4.55f

    .line 456
    .line 457
    .line 458
    move-object/from16 v20, v2

    .line 459
    .line 460
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 461
    .line 462
    .line 463
    const v26, 0x40cb3333    # 6.35f

    .line 464
    .line 465
    .line 466
    const v21, 0x4093851f    # 4.61f

    .line 467
    .line 468
    .line 469
    const v22, 0x40aa8f5c    # 5.33f

    .line 470
    .line 471
    .line 472
    const v23, 0x4093851f    # 4.61f

    .line 473
    .line 474
    .line 475
    const v24, 0x40beb852    # 5.96f

    .line 476
    .line 477
    .line 478
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const v4, 0x403c28f6    # 2.94f

    .line 482
    .line 483
    .line 484
    const v6, 0x403b851f    # 2.93f

    .line 485
    .line 486
    .line 487
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v25, 0x3fb5c28f    # 1.42f

    .line 491
    .line 492
    .line 493
    const/16 v26, 0x0

    .line 494
    .line 495
    const v21, 0x3ec7ae14    # 0.39f

    .line 496
    .line 497
    .line 498
    const v22, 0x3ec7ae14    # 0.39f

    .line 499
    .line 500
    .line 501
    const v23, 0x3f828f5c    # 1.02f

    .line 502
    .line 503
    .line 504
    const v24, 0x3ec7ae14    # 0.39f

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const v25, 0x411570a4    # 9.34f

    .line 511
    .line 512
    .line 513
    const v26, 0x40fc28f6    # 7.88f

    .line 514
    .line 515
    .line 516
    const v21, 0x411bae14    # 9.73f

    .line 517
    .line 518
    .line 519
    const v22, 0x410e6666    # 8.9f

    .line 520
    .line 521
    .line 522
    const v23, 0x411bae14    # 9.73f

    .line 523
    .line 524
    .line 525
    const v24, 0x410451ec    # 8.27f

    .line 526
    .line 527
    .line 528
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v4, 0x409e147b    # 4.94f

    .line 532
    .line 533
    .line 534
    const v6, 0x40cd1eb8    # 6.41f

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    const/high16 v6, 0x3f800000    # 1.0f

    .line 548
    .line 549
    const/4 v7, 0x0

    .line 550
    const-string v4, ""

    .line 551
    .line 552
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 553
    .line 554
    .line 555
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 556
    .line 557
    .line 558
    move-result v3

    .line 559
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 560
    .line 561
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 562
    .line 563
    .line 564
    move-result-wide v6

    .line 565
    const/4 v2, 0x0

    .line 566
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 570
    .line 571
    .line 572
    move-result v10

    .line 573
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 574
    .line 575
    .line 576
    move-result v11

    .line 577
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 580
    .line 581
    .line 582
    const v4, 0x4180f5c3    # 16.12f

    .line 583
    .line 584
    .line 585
    const v6, 0x416a6666    # 14.65f

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const v25, -0x404a3d71    # -1.42f

    .line 592
    .line 593
    .line 594
    const/16 v26, 0x0

    .line 595
    .line 596
    const v21, -0x413851ec    # -0.39f

    .line 597
    .line 598
    .line 599
    const v22, -0x413851ec    # -0.39f

    .line 600
    .line 601
    .line 602
    const v23, -0x407d70a4    # -1.02f

    .line 603
    .line 604
    .line 605
    const v24, -0x413851ec    # -0.39f

    .line 606
    .line 607
    .line 608
    move-object/from16 v20, v2

    .line 609
    .line 610
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/16 v25, 0x0

    .line 614
    .line 615
    const v26, 0x3fb47ae1    # 1.41f

    .line 616
    .line 617
    .line 618
    const v22, 0x3ec7ae14    # 0.39f

    .line 619
    .line 620
    .line 621
    const v23, -0x413851ec    # -0.39f

    .line 622
    .line 623
    .line 624
    const v24, 0x3f828f5c    # 1.02f

    .line 625
    .line 626
    .line 627
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 628
    .line 629
    .line 630
    const v4, 0x418d1eb8    # 17.64f

    .line 631
    .line 632
    .line 633
    const/high16 v6, 0x41980000    # 19.0f

    .line 634
    .line 635
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 636
    .line 637
    .line 638
    const v25, 0x3fb47ae1    # 1.41f

    .line 639
    .line 640
    .line 641
    const/16 v26, 0x0

    .line 642
    .line 643
    const v21, 0x3ec7ae14    # 0.39f

    .line 644
    .line 645
    .line 646
    const v23, 0x3f828f5c    # 1.02f

    .line 647
    .line 648
    .line 649
    const v24, 0x3ec7ae14    # 0.39f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v4, -0x407d70a4    # -1.02f

    .line 656
    .line 657
    .line 658
    const v6, -0x404b851f    # -1.41f

    .line 659
    .line 660
    .line 661
    const v7, 0x3ec7ae14    # 0.39f

    .line 662
    .line 663
    .line 664
    const/4 v8, 0x0

    .line 665
    invoke-virtual {v2, v7, v4, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    const v4, 0x4180f5c3    # 16.12f

    .line 669
    .line 670
    .line 671
    const v6, 0x416a6666    # 14.65f

    .line 672
    .line 673
    .line 674
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const/high16 v6, 0x3f800000    # 1.0f

    .line 685
    .line 686
    const/high16 v8, 0x3f800000    # 1.0f

    .line 687
    .line 688
    const/4 v7, 0x0

    .line 689
    const-string v4, ""

    .line 690
    .line 691
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 692
    .line 693
    .line 694
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 695
    .line 696
    .line 697
    move-result v3

    .line 698
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 699
    .line 700
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 701
    .line 702
    .line 703
    move-result-wide v6

    .line 704
    const/4 v2, 0x0

    .line 705
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 709
    .line 710
    .line 711
    move-result v10

    .line 712
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 713
    .line 714
    .line 715
    move-result v11

    .line 716
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 719
    .line 720
    .line 721
    const v4, 0x41807ae1    # 16.06f

    .line 722
    .line 723
    .line 724
    const v6, 0x411547ae    # 9.33f

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const v4, 0x403f5c29    # 2.99f

    .line 731
    .line 732
    .line 733
    const v6, -0x3fc147ae    # -2.98f

    .line 734
    .line 735
    .line 736
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    const/16 v25, 0x0

    .line 740
    .line 741
    const v26, -0x404a3d71    # -1.42f

    .line 742
    .line 743
    .line 744
    const v22, -0x41333333    # -0.4f

    .line 745
    .line 746
    .line 747
    const v23, 0x3ec7ae14    # 0.39f

    .line 748
    .line 749
    .line 750
    const v24, -0x407c28f6    # -1.03f

    .line 751
    .line 752
    .line 753
    move-object/from16 v20, v2

    .line 754
    .line 755
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 756
    .line 757
    .line 758
    const v25, -0x404b851f    # -1.41f

    .line 759
    .line 760
    .line 761
    const/16 v26, 0x0

    .line 762
    .line 763
    const v21, -0x413851ec    # -0.39f

    .line 764
    .line 765
    .line 766
    const v22, -0x413851ec    # -0.39f

    .line 767
    .line 768
    .line 769
    const v23, -0x407d70a4    # -1.02f

    .line 770
    .line 771
    .line 772
    const v24, -0x413851ec    # -0.39f

    .line 773
    .line 774
    .line 775
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 776
    .line 777
    .line 778
    const v4, -0x3fc0a3d7    # -2.99f

    .line 779
    .line 780
    .line 781
    const v6, 0x403eb852    # 2.98f

    .line 782
    .line 783
    .line 784
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    const/16 v25, 0x0

    .line 788
    .line 789
    const v26, 0x3fb5c28f    # 1.42f

    .line 790
    .line 791
    .line 792
    const v22, 0x3ec7ae14    # 0.39f

    .line 793
    .line 794
    .line 795
    const v23, -0x413851ec    # -0.39f

    .line 796
    .line 797
    .line 798
    const v24, 0x3f828f5c    # 1.02f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    const v25, 0x41807ae1    # 16.06f

    .line 805
    .line 806
    .line 807
    const v26, 0x411547ae    # 9.33f

    .line 808
    .line 809
    .line 810
    const v21, 0x4170a3d7    # 15.04f

    .line 811
    .line 812
    .line 813
    const v22, 0x411b851f    # 9.72f

    .line 814
    .line 815
    .line 816
    const v23, 0x417ab852    # 15.67f

    .line 817
    .line 818
    .line 819
    const v24, 0x411b851f    # 9.72f

    .line 820
    .line 821
    .line 822
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 826
    .line 827
    .line 828
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    const/high16 v6, 0x3f800000    # 1.0f

    .line 833
    .line 834
    const/4 v7, 0x0

    .line 835
    const-string v4, ""

    .line 836
    .line 837
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 838
    .line 839
    .line 840
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 841
    .line 842
    .line 843
    move-result v3

    .line 844
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 845
    .line 846
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 847
    .line 848
    .line 849
    move-result-wide v6

    .line 850
    const/4 v0, 0x0

    .line 851
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 852
    .line 853
    .line 854
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 855
    .line 856
    .line 857
    move-result v10

    .line 858
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 859
    .line 860
    .line 861
    move-result v11

    .line 862
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 863
    .line 864
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 865
    .line 866
    .line 867
    const/high16 v0, 0x40800000    # 4.0f

    .line 868
    .line 869
    const/high16 v2, 0x41400000    # 12.0f

    .line 870
    .line 871
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const/high16 v0, -0x40000000    # -2.0f

    .line 875
    .line 876
    const/4 v2, 0x0

    .line 877
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 878
    .line 879
    .line 880
    const/high16 v18, 0x40800000    # 4.0f

    .line 881
    .line 882
    const/16 v19, 0x0

    .line 883
    .line 884
    const/high16 v13, 0x40000000    # 2.0f

    .line 885
    .line 886
    const/high16 v14, 0x40000000    # 2.0f

    .line 887
    .line 888
    const/16 v16, 0x1

    .line 889
    .line 890
    const/16 v17, 0x1

    .line 891
    .line 892
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/high16 v18, -0x3f800000    # -4.0f

    .line 896
    .line 897
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 901
    .line 902
    .line 903
    move-result-object v2

    .line 904
    const/16 v16, 0x3800

    .line 905
    .line 906
    const/16 v17, 0x0

    .line 907
    .line 908
    const/high16 v6, 0x3f800000    # 1.0f

    .line 909
    .line 910
    const/4 v7, 0x0

    .line 911
    const/high16 v12, 0x3f800000    # 1.0f

    .line 912
    .line 913
    const/4 v13, 0x0

    .line 914
    const/4 v14, 0x0

    .line 915
    const-string v4, ""

    .line 916
    .line 917
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 918
    .line 919
    .line 920
    move-result-object v0

    .line 921
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    sput-object v0, Landroidx/compose/material/icons/rounded/StreamKt;->_stream:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 926
    .line 927
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    return-object v0
.end method

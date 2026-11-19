.class public final Landroidx/compose/material/icons/twotone/PauseCircleFilledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _pauseCircleFilled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPauseCircleFilled(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PauseCircleFilledKt;->_pauseCircleFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PauseCircleFilled"

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
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f72e148    # -4.41f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x4065c28f    # 3.59f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v25, 0x41000000    # 8.0f

    .line 97
    .line 98
    const/16 v21, 0x0

    .line 99
    .line 100
    const v22, 0x408d1eb8    # 4.41f

    .line 101
    .line 102
    .line 103
    const v23, 0x4065c28f    # 3.59f

    .line 104
    .line 105
    .line 106
    const/high16 v24, 0x41000000    # 8.0f

    .line 107
    .line 108
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v4, -0x3f9a3d71    # -3.59f

    .line 112
    .line 113
    .line 114
    const/high16 v6, -0x3f000000    # -8.0f

    .line 115
    .line 116
    const/high16 v7, 0x41000000    # 8.0f

    .line 117
    .line 118
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v25, 0x41400000    # 12.0f

    .line 122
    .line 123
    const/high16 v26, 0x40800000    # 4.0f

    .line 124
    .line 125
    const/high16 v21, 0x41a00000    # 20.0f

    .line 126
    .line 127
    const v22, 0x40f2e148    # 7.59f

    .line 128
    .line 129
    .line 130
    const v23, 0x418347ae    # 16.41f

    .line 131
    .line 132
    .line 133
    const/high16 v24, 0x40800000    # 4.0f

    .line 134
    .line 135
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v4, 0x41300000    # 11.0f

    .line 142
    .line 143
    const/high16 v6, 0x41800000    # 16.0f

    .line 144
    .line 145
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 146
    .line 147
    .line 148
    const/high16 v4, 0x41100000    # 9.0f

    .line 149
    .line 150
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v4, 0x41000000    # 8.0f

    .line 154
    .line 155
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x40000000    # 2.0f

    .line 159
    .line 160
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v4, 0x41800000    # 16.0f

    .line 164
    .line 165
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 169
    .line 170
    .line 171
    const/high16 v4, 0x41700000    # 15.0f

    .line 172
    .line 173
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v4, -0x40000000    # -2.0f

    .line 177
    .line 178
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x41000000    # 8.0f

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    const/high16 v4, 0x40000000    # 2.0f

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/high16 v4, 0x41800000    # 16.0f

    .line 192
    .line 193
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const/16 v16, 0x3800

    .line 204
    .line 205
    const/16 v17, 0x0

    .line 206
    .line 207
    const v6, 0x3e99999a    # 0.3f

    .line 208
    .line 209
    .line 210
    const v8, 0x3e99999a    # 0.3f

    .line 211
    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    const/high16 v9, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/high16 v12, 0x3f800000    # 1.0f

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const-string v4, ""

    .line 222
    .line 223
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 224
    .line 225
    .line 226
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 231
    .line 232
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 233
    .line 234
    .line 235
    move-result-wide v6

    .line 236
    const/4 v2, 0x0

    .line 237
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 251
    .line 252
    .line 253
    const/high16 v4, 0x41500000    # 13.0f

    .line 254
    .line 255
    const/high16 v6, 0x41000000    # 8.0f

    .line 256
    .line 257
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v4, 0x40000000    # 2.0f

    .line 261
    .line 262
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v4, 0x41000000    # 8.0f

    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const/high16 v4, -0x40000000    # -2.0f

    .line 271
    .line 272
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const/high16 v6, 0x3f800000    # 1.0f

    .line 283
    .line 284
    const/high16 v8, 0x3f800000    # 1.0f

    .line 285
    .line 286
    const/4 v7, 0x0

    .line 287
    const-string v4, ""

    .line 288
    .line 289
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 290
    .line 291
    .line 292
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 297
    .line 298
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 299
    .line 300
    .line 301
    move-result-wide v6

    .line 302
    const/4 v2, 0x0

    .line 303
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 307
    .line 308
    .line 309
    move-result v10

    .line 310
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 311
    .line 312
    .line 313
    move-result v11

    .line 314
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 317
    .line 318
    .line 319
    const/high16 v4, 0x41100000    # 9.0f

    .line 320
    .line 321
    const/high16 v6, 0x41000000    # 8.0f

    .line 322
    .line 323
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v4, 0x40000000    # 2.0f

    .line 327
    .line 328
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x41000000    # 8.0f

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v4, -0x40000000    # -2.0f

    .line 337
    .line 338
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v6, 0x3f800000    # 1.0f

    .line 349
    .line 350
    const/4 v7, 0x0

    .line 351
    const-string v4, ""

    .line 352
    .line 353
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 354
    .line 355
    .line 356
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 361
    .line 362
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 363
    .line 364
    .line 365
    move-result-wide v6

    .line 366
    const/4 v0, 0x0

    .line 367
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 375
    .line 376
    .line 377
    move-result v11

    .line 378
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 381
    .line 382
    .line 383
    const/high16 v0, 0x41400000    # 12.0f

    .line 384
    .line 385
    const/high16 v2, 0x40000000    # 2.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v17, 0x40000000    # 2.0f

    .line 391
    .line 392
    const/high16 v18, 0x41400000    # 12.0f

    .line 393
    .line 394
    const v13, 0x40cf5c29    # 6.48f

    .line 395
    .line 396
    .line 397
    const/high16 v14, 0x40000000    # 2.0f

    .line 398
    .line 399
    const/high16 v15, 0x40000000    # 2.0f

    .line 400
    .line 401
    const v16, 0x40cf5c29    # 6.48f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v17, 0x41200000    # 10.0f

    .line 408
    .line 409
    const/high16 v18, 0x41200000    # 10.0f

    .line 410
    .line 411
    const/4 v13, 0x0

    .line 412
    const v14, 0x40b0a3d7    # 5.52f

    .line 413
    .line 414
    .line 415
    const v15, 0x408f5c29    # 4.48f

    .line 416
    .line 417
    .line 418
    const/high16 v16, 0x41200000    # 10.0f

    .line 419
    .line 420
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v0, -0x3f70a3d7    # -4.48f

    .line 424
    .line 425
    .line 426
    const/high16 v2, -0x3ee00000    # -10.0f

    .line 427
    .line 428
    const/high16 v4, 0x41200000    # 10.0f

    .line 429
    .line 430
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v17, 0x41400000    # 12.0f

    .line 434
    .line 435
    const/high16 v18, 0x40000000    # 2.0f

    .line 436
    .line 437
    const/high16 v13, 0x41b00000    # 22.0f

    .line 438
    .line 439
    const v14, 0x40cf5c29    # 6.48f

    .line 440
    .line 441
    .line 442
    const v15, 0x418c28f6    # 17.52f

    .line 443
    .line 444
    .line 445
    const/high16 v16, 0x40000000    # 2.0f

    .line 446
    .line 447
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const/high16 v0, 0x41a00000    # 20.0f

    .line 454
    .line 455
    const/high16 v2, 0x41400000    # 12.0f

    .line 456
    .line 457
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v17, -0x3f000000    # -8.0f

    .line 461
    .line 462
    const/high16 v18, -0x3f000000    # -8.0f

    .line 463
    .line 464
    const v13, -0x3f72e148    # -4.41f

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const/high16 v15, -0x3f000000    # -8.0f

    .line 469
    .line 470
    const v16, -0x3f9a3d71    # -3.59f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v17, 0x41000000    # 8.0f

    .line 477
    .line 478
    const/4 v13, 0x0

    .line 479
    const v14, -0x3f72e148    # -4.41f

    .line 480
    .line 481
    .line 482
    const v15, 0x4065c28f    # 3.59f

    .line 483
    .line 484
    .line 485
    const/high16 v16, -0x3f000000    # -8.0f

    .line 486
    .line 487
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const v0, 0x4065c28f    # 3.59f

    .line 491
    .line 492
    .line 493
    const/high16 v2, 0x41000000    # 8.0f

    .line 494
    .line 495
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v17, 0x41400000    # 12.0f

    .line 499
    .line 500
    const/high16 v18, 0x41a00000    # 20.0f

    .line 501
    .line 502
    const/high16 v13, 0x41a00000    # 20.0f

    .line 503
    .line 504
    const v14, 0x418347ae    # 16.41f

    .line 505
    .line 506
    .line 507
    const v15, 0x418347ae    # 16.41f

    .line 508
    .line 509
    .line 510
    const/high16 v16, 0x41a00000    # 20.0f

    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    const/16 v16, 0x3800

    .line 523
    .line 524
    const/16 v17, 0x0

    .line 525
    .line 526
    const/high16 v6, 0x3f800000    # 1.0f

    .line 527
    .line 528
    const/4 v7, 0x0

    .line 529
    const/high16 v12, 0x3f800000    # 1.0f

    .line 530
    .line 531
    const/4 v13, 0x0

    .line 532
    const/4 v14, 0x0

    .line 533
    const/4 v15, 0x0

    .line 534
    const-string v4, ""

    .line 535
    .line 536
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    sput-object v0, Landroidx/compose/material/icons/twotone/PauseCircleFilledKt;->_pauseCircleFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 545
    .line 546
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    return-object v0
.end method

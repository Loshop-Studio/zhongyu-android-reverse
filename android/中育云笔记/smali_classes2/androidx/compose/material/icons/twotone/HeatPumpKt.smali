.class public final Landroidx/compose/material/icons/twotone/HeatPumpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _heatPump:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getHeatPump(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/HeatPumpKt;->_heatPump:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.HeatPump"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40a00000    # 5.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41980000    # 19.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x41400000    # 12.0f

    .line 99
    .line 100
    const/high16 v6, 0x40c00000    # 6.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, 0x40c00000    # 6.0f

    .line 106
    .line 107
    const/high16 v26, 0x40c00000    # 6.0f

    .line 108
    .line 109
    const v21, 0x4053d70a    # 3.31f

    .line 110
    .line 111
    .line 112
    const/16 v22, 0x0

    .line 113
    .line 114
    const/high16 v23, 0x40c00000    # 6.0f

    .line 115
    .line 116
    const v24, 0x402c28f6    # 2.69f

    .line 117
    .line 118
    .line 119
    move-object/from16 v20, v2

    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, -0x3fd3d70a    # -2.69f

    .line 125
    .line 126
    .line 127
    const/high16 v7, -0x3f400000    # -6.0f

    .line 128
    .line 129
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v6, -0x3f400000    # -6.0f

    .line 133
    .line 134
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, 0x410b0a3d    # 8.69f

    .line 138
    .line 139
    .line 140
    const/high16 v6, 0x41400000    # 12.0f

    .line 141
    .line 142
    const/high16 v7, 0x40c00000    # 6.0f

    .line 143
    .line 144
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const/16 v16, 0x3800

    .line 155
    .line 156
    const/16 v17, 0x0

    .line 157
    .line 158
    const v6, 0x3e99999a    # 0.3f

    .line 159
    .line 160
    .line 161
    const v8, 0x3e99999a    # 0.3f

    .line 162
    .line 163
    .line 164
    const/4 v7, 0x0

    .line 165
    const/high16 v9, 0x3f800000    # 1.0f

    .line 166
    .line 167
    const/high16 v12, 0x3f800000    # 1.0f

    .line 168
    .line 169
    const/4 v13, 0x0

    .line 170
    const/4 v14, 0x0

    .line 171
    const/4 v15, 0x0

    .line 172
    const-string v4, ""

    .line 173
    .line 174
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 175
    .line 176
    .line 177
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 182
    .line 183
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 184
    .line 185
    .line 186
    move-result-wide v6

    .line 187
    const/4 v2, 0x0

    .line 188
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    const/high16 v4, 0x40400000    # 3.0f

    .line 205
    .line 206
    const/high16 v6, 0x41980000    # 19.0f

    .line 207
    .line 208
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x40a00000    # 5.0f

    .line 212
    .line 213
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v25, 0x40400000    # 3.0f

    .line 217
    .line 218
    const/high16 v26, 0x40a00000    # 5.0f

    .line 219
    .line 220
    const v21, 0x4079999a    # 3.9f

    .line 221
    .line 222
    .line 223
    const/high16 v22, 0x40400000    # 3.0f

    .line 224
    .line 225
    const/high16 v23, 0x40400000    # 3.0f

    .line 226
    .line 227
    const v24, 0x4079999a    # 3.9f

    .line 228
    .line 229
    .line 230
    move-object/from16 v20, v2

    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x41600000    # 14.0f

    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v25, 0x40000000    # 2.0f

    .line 241
    .line 242
    const/high16 v26, 0x40000000    # 2.0f

    .line 243
    .line 244
    const/16 v21, 0x0

    .line 245
    .line 246
    const v22, 0x3f8ccccd    # 1.1f

    .line 247
    .line 248
    .line 249
    const v23, 0x3f666666    # 0.9f

    .line 250
    .line 251
    .line 252
    const/high16 v24, 0x40000000    # 2.0f

    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v26, -0x40000000    # -2.0f

    .line 261
    .line 262
    const v21, 0x3f8ccccd    # 1.1f

    .line 263
    .line 264
    .line 265
    const/16 v22, 0x0

    .line 266
    .line 267
    const/high16 v23, 0x40000000    # 2.0f

    .line 268
    .line 269
    const v24, -0x4099999a    # -0.9f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v4, 0x40a00000    # 5.0f

    .line 276
    .line 277
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const/high16 v25, 0x41980000    # 19.0f

    .line 281
    .line 282
    const/high16 v26, 0x40400000    # 3.0f

    .line 283
    .line 284
    const/high16 v21, 0x41a80000    # 21.0f

    .line 285
    .line 286
    const v22, 0x4079999a    # 3.9f

    .line 287
    .line 288
    .line 289
    const v23, 0x41a0cccd    # 20.1f

    .line 290
    .line 291
    .line 292
    const/high16 v24, 0x40400000    # 3.0f

    .line 293
    .line 294
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const/high16 v4, 0x41980000    # 19.0f

    .line 301
    .line 302
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v4, 0x40a00000    # 5.0f

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v4, 0x41600000    # 14.0f

    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const/high16 v4, 0x41980000    # 19.0f

    .line 319
    .line 320
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    const/high16 v6, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/high16 v8, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const/4 v7, 0x0

    .line 335
    const-string v4, ""

    .line 336
    .line 337
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 338
    .line 339
    .line 340
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 345
    .line 346
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 347
    .line 348
    .line 349
    move-result-wide v6

    .line 350
    const/4 v0, 0x0

    .line 351
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 355
    .line 356
    .line 357
    move-result v10

    .line 358
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 359
    .line 360
    .line 361
    move-result v11

    .line 362
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 365
    .line 366
    .line 367
    const/high16 v0, 0x41900000    # 18.0f

    .line 368
    .line 369
    const/high16 v2, 0x41400000    # 12.0f

    .line 370
    .line 371
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const/high16 v17, 0x40c00000    # 6.0f

    .line 375
    .line 376
    const/high16 v18, -0x3f400000    # -6.0f

    .line 377
    .line 378
    const v13, 0x4053d70a    # 3.31f

    .line 379
    .line 380
    .line 381
    const/high16 v15, 0x40c00000    # 6.0f

    .line 382
    .line 383
    const v16, -0x3fd3d70a    # -2.69f

    .line 384
    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, -0x3fd3d70a    # -2.69f

    .line 390
    .line 391
    .line 392
    const/high16 v2, -0x3f400000    # -6.0f

    .line 393
    .line 394
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const v0, 0x402c28f6    # 2.69f

    .line 398
    .line 399
    .line 400
    const/high16 v2, 0x40c00000    # 6.0f

    .line 401
    .line 402
    const/high16 v4, -0x3f400000    # -6.0f

    .line 403
    .line 404
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41900000    # 18.0f

    .line 408
    .line 409
    const v2, 0x410b0a3d    # 8.69f

    .line 410
    .line 411
    .line 412
    const/high16 v4, 0x41400000    # 12.0f

    .line 413
    .line 414
    invoke-virtual {v12, v2, v0, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v0, 0x41340000    # 11.25f

    .line 421
    .line 422
    const v2, 0x417eb852    # 15.92f

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v17, -0x40400000    # -1.5f

    .line 429
    .line 430
    const v18, -0x40e147ae    # -0.62f

    .line 431
    .line 432
    .line 433
    const v13, -0x40f33333    # -0.55f

    .line 434
    .line 435
    .line 436
    const v14, -0x42333333    # -0.1f

    .line 437
    .line 438
    .line 439
    const v15, -0x4079999a    # -1.05f

    .line 440
    .line 441
    .line 442
    const v16, -0x415c28f6    # -0.32f

    .line 443
    .line 444
    .line 445
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 446
    .line 447
    .line 448
    const/high16 v0, -0x40400000    # -1.5f

    .line 449
    .line 450
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 451
    .line 452
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const v0, 0x417eb852    # 15.92f

    .line 456
    .line 457
    .line 458
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 462
    .line 463
    .line 464
    const/high16 v0, 0x414c0000    # 12.75f

    .line 465
    .line 466
    const v2, 0x417eb852    # 15.92f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, -0x3ff8f5c3    # -2.11f

    .line 473
    .line 474
    .line 475
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 476
    .line 477
    .line 478
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 479
    .line 480
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v17, 0x414c0000    # 12.75f

    .line 484
    .line 485
    const v18, 0x417eb852    # 15.92f

    .line 486
    .line 487
    .line 488
    const v13, 0x415ccccd    # 13.8f

    .line 489
    .line 490
    .line 491
    const v14, 0x4179c28f    # 15.61f

    .line 492
    .line 493
    .line 494
    const v15, 0x4154cccd    # 13.3f

    .line 495
    .line 496
    .line 497
    const v16, 0x417d1eb8    # 15.82f

    .line 498
    .line 499
    .line 500
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x4174f5c3    # 15.31f

    .line 507
    .line 508
    .line 509
    const/high16 v2, 0x41640000    # 14.25f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, -0x40400000    # -1.5f

    .line 515
    .line 516
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v0, 0x40070a3d    # 2.11f

    .line 520
    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const v17, 0x4174f5c3    # 15.31f

    .line 526
    .line 527
    .line 528
    const/high16 v18, 0x41640000    # 14.25f

    .line 529
    .line 530
    const v13, 0x417d1eb8    # 15.82f

    .line 531
    .line 532
    .line 533
    const v14, 0x4154cccd    # 13.3f

    .line 534
    .line 535
    .line 536
    const v15, 0x4179c28f    # 15.61f

    .line 537
    .line 538
    .line 539
    const v16, 0x415ccccd    # 13.8f

    .line 540
    .line 541
    .line 542
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/high16 v0, 0x41340000    # 11.25f

    .line 549
    .line 550
    const v2, 0x417eb852    # 15.92f

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const v0, -0x3ff8f5c3    # -2.11f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v0, -0x40400000    # -1.5f

    .line 563
    .line 564
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 565
    .line 566
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v17, 0x417eb852    # 15.92f

    .line 570
    .line 571
    .line 572
    const/high16 v18, 0x41340000    # 11.25f

    .line 573
    .line 574
    const v13, 0x4179c28f    # 15.61f

    .line 575
    .line 576
    .line 577
    const v14, 0x41233333    # 10.2f

    .line 578
    .line 579
    .line 580
    const v15, 0x417d1eb8    # 15.82f

    .line 581
    .line 582
    .line 583
    const v16, 0x412b3333    # 10.7f

    .line 584
    .line 585
    .line 586
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 590
    .line 591
    .line 592
    const/high16 v0, 0x414c0000    # 12.75f

    .line 593
    .line 594
    const v2, 0x410147ae    # 8.08f

    .line 595
    .line 596
    .line 597
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v17, 0x3fc00000    # 1.5f

    .line 601
    .line 602
    const v18, 0x3f1eb852    # 0.62f

    .line 603
    .line 604
    .line 605
    const v13, 0x3f0ccccd    # 0.55f

    .line 606
    .line 607
    .line 608
    const v14, 0x3dcccccd    # 0.1f

    .line 609
    .line 610
    .line 611
    const v15, 0x3f866666    # 1.05f

    .line 612
    .line 613
    .line 614
    const v16, 0x3ea3d70a    # 0.32f

    .line 615
    .line 616
    .line 617
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v0, -0x40400000    # -1.5f

    .line 621
    .line 622
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 623
    .line 624
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    const v0, 0x410147ae    # 8.08f

    .line 628
    .line 629
    .line 630
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 631
    .line 632
    .line 633
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/high16 v0, 0x41300000    # 11.0f

    .line 637
    .line 638
    const/high16 v2, 0x41400000    # 12.0f

    .line 639
    .line 640
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 641
    .line 642
    .line 643
    const/high16 v17, 0x3f800000    # 1.0f

    .line 644
    .line 645
    const/high16 v18, 0x3f800000    # 1.0f

    .line 646
    .line 647
    const/4 v14, 0x0

    .line 648
    const/high16 v15, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const v16, 0x3ee66666    # 0.45f

    .line 651
    .line 652
    .line 653
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 654
    .line 655
    .line 656
    const/high16 v17, -0x40800000    # -1.0f

    .line 657
    .line 658
    const/4 v13, 0x0

    .line 659
    const v14, 0x3f0ccccd    # 0.55f

    .line 660
    .line 661
    .line 662
    const v15, -0x4119999a    # -0.45f

    .line 663
    .line 664
    .line 665
    const/high16 v16, 0x3f800000    # 1.0f

    .line 666
    .line 667
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 668
    .line 669
    .line 670
    const v0, -0x4119999a    # -0.45f

    .line 671
    .line 672
    .line 673
    const/high16 v2, -0x40800000    # -1.0f

    .line 674
    .line 675
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const/high16 v17, 0x41400000    # 12.0f

    .line 679
    .line 680
    const/high16 v18, 0x41300000    # 11.0f

    .line 681
    .line 682
    const/high16 v13, 0x41300000    # 11.0f

    .line 683
    .line 684
    const v14, 0x41373333    # 11.45f

    .line 685
    .line 686
    .line 687
    const v15, 0x41373333    # 11.45f

    .line 688
    .line 689
    .line 690
    const/high16 v16, 0x41300000    # 11.0f

    .line 691
    .line 692
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 696
    .line 697
    .line 698
    const/high16 v0, 0x41340000    # 11.25f

    .line 699
    .line 700
    const v2, 0x410147ae    # 8.08f

    .line 701
    .line 702
    .line 703
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 704
    .line 705
    .line 706
    const v0, 0x40070a3d    # 2.11f

    .line 707
    .line 708
    .line 709
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 710
    .line 711
    .line 712
    const/high16 v0, -0x40400000    # -1.5f

    .line 713
    .line 714
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/high16 v17, 0x41340000    # 11.25f

    .line 718
    .line 719
    const v18, 0x410147ae    # 8.08f

    .line 720
    .line 721
    .line 722
    const v13, 0x41233333    # 10.2f

    .line 723
    .line 724
    .line 725
    const v14, 0x41063d71    # 8.39f

    .line 726
    .line 727
    .line 728
    const v15, 0x412b3333    # 10.7f

    .line 729
    .line 730
    .line 731
    const v16, 0x4102e148    # 8.18f

    .line 732
    .line 733
    .line 734
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 738
    .line 739
    .line 740
    const/high16 v0, 0x411c0000    # 9.75f

    .line 741
    .line 742
    const v2, 0x410b0a3d    # 8.69f

    .line 743
    .line 744
    .line 745
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 746
    .line 747
    .line 748
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 749
    .line 750
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 751
    .line 752
    .line 753
    const v0, 0x410147ae    # 8.08f

    .line 754
    .line 755
    .line 756
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    const v17, 0x410b0a3d    # 8.69f

    .line 760
    .line 761
    .line 762
    const/high16 v18, 0x411c0000    # 9.75f

    .line 763
    .line 764
    const v13, 0x4102e148    # 8.18f

    .line 765
    .line 766
    .line 767
    const v14, 0x412b3333    # 10.7f

    .line 768
    .line 769
    .line 770
    const v15, 0x41063d71    # 8.39f

    .line 771
    .line 772
    .line 773
    const v16, 0x41233333    # 10.2f

    .line 774
    .line 775
    .line 776
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 780
    .line 781
    .line 782
    const v0, 0x41230a3d    # 10.19f

    .line 783
    .line 784
    .line 785
    const/high16 v2, 0x414c0000    # 12.75f

    .line 786
    .line 787
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    const/high16 v0, -0x40400000    # -1.5f

    .line 791
    .line 792
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 793
    .line 794
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 795
    .line 796
    .line 797
    const v17, -0x40e147ae    # -0.62f

    .line 798
    .line 799
    .line 800
    const/high16 v18, -0x40400000    # -1.5f

    .line 801
    .line 802
    const v13, -0x41666666    # -0.3f

    .line 803
    .line 804
    .line 805
    const v14, -0x411eb852    # -0.44f

    .line 806
    .line 807
    .line 808
    const v15, -0x40fd70a4    # -0.51f

    .line 809
    .line 810
    .line 811
    const v16, -0x408ccccd    # -0.95f

    .line 812
    .line 813
    .line 814
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 815
    .line 816
    .line 817
    const v0, 0x41230a3d    # 10.19f

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 824
    .line 825
    .line 826
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 827
    .line 828
    .line 829
    move-result-object v2

    .line 830
    const/16 v16, 0x3800

    .line 831
    .line 832
    const/16 v17, 0x0

    .line 833
    .line 834
    const/high16 v6, 0x3f800000    # 1.0f

    .line 835
    .line 836
    const/4 v7, 0x0

    .line 837
    const/high16 v12, 0x3f800000    # 1.0f

    .line 838
    .line 839
    const/4 v13, 0x0

    .line 840
    const/4 v14, 0x0

    .line 841
    const/4 v15, 0x0

    .line 842
    const-string v4, ""

    .line 843
    .line 844
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    sput-object v0, Landroidx/compose/material/icons/twotone/HeatPumpKt;->_heatPump:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 853
    .line 854
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 855
    .line 856
    .line 857
    return-object v0
.end method

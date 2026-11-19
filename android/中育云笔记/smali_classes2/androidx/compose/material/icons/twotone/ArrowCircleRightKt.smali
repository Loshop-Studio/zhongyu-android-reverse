.class public final Landroidx/compose/material/icons/twotone/ArrowCircleRightKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _arrowCircleRight:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getArrowCircleRight(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ArrowCircleRightKt;->_arrowCircleRight:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ArrowCircleRight"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x41000000    # 8.0f

    .line 78
    .line 79
    const/high16 v26, -0x3f000000    # -8.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x3f72e148    # -4.41f

    .line 84
    .line 85
    .line 86
    const v23, 0x4065c28f    # 3.59f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x3f000000    # -8.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x4065c28f    # 3.59f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, -0x3f000000    # -8.0f

    .line 105
    .line 106
    const v6, -0x3f9a3d71    # -3.59f

    .line 107
    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v6, v7, v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x418347ae    # 16.41f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x41400000    # 12.0f

    .line 118
    .line 119
    const/high16 v7, 0x40800000    # 4.0f

    .line 120
    .line 121
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v4, 0x41300000    # 11.0f

    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/4 v4, 0x0

    .line 130
    const/high16 v6, -0x3f800000    # -4.0f

    .line 131
    .line 132
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v4, 0x40000000    # 2.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/4 v4, 0x0

    .line 141
    const/high16 v6, 0x40800000    # 4.0f

    .line 142
    .line 143
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v4, 0x40400000    # 3.0f

    .line 147
    .line 148
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const/high16 v4, -0x3f800000    # -4.0f

    .line 152
    .line 153
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41300000    # 11.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const v6, 0x3e99999a    # 0.3f

    .line 176
    .line 177
    .line 178
    const v8, 0x3e99999a    # 0.3f

    .line 179
    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    const/high16 v9, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/high16 v12, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const/4 v14, 0x0

    .line 188
    const/4 v15, 0x0

    .line 189
    const-string v4, ""

    .line 190
    .line 191
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 192
    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 199
    .line 200
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 201
    .line 202
    .line 203
    move-result-wide v6

    .line 204
    const/4 v0, 0x0

    .line 205
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const/high16 v0, 0x41400000    # 12.0f

    .line 222
    .line 223
    const/high16 v2, 0x40800000    # 4.0f

    .line 224
    .line 225
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, 0x41000000    # 8.0f

    .line 229
    .line 230
    const/high16 v18, -0x3f000000    # -8.0f

    .line 231
    .line 232
    const v14, -0x3f72e148    # -4.41f

    .line 233
    .line 234
    .line 235
    const v15, 0x4065c28f    # 3.59f

    .line 236
    .line 237
    .line 238
    const/high16 v16, -0x3f000000    # -8.0f

    .line 239
    .line 240
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const v0, 0x4065c28f    # 3.59f

    .line 244
    .line 245
    .line 246
    const/high16 v2, 0x41000000    # 8.0f

    .line 247
    .line 248
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, -0x3f000000    # -8.0f

    .line 252
    .line 253
    const v2, -0x3f9a3d71    # -3.59f

    .line 254
    .line 255
    .line 256
    const/high16 v4, 0x41000000    # 8.0f

    .line 257
    .line 258
    invoke-virtual {v12, v2, v4, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x418347ae    # 16.41f

    .line 262
    .line 263
    .line 264
    const/high16 v2, 0x41400000    # 12.0f

    .line 265
    .line 266
    const/high16 v4, 0x40800000    # 4.0f

    .line 267
    .line 268
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v0, 0x40000000    # 2.0f

    .line 272
    .line 273
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v17, 0x41200000    # 10.0f

    .line 277
    .line 278
    const/high16 v18, 0x41200000    # 10.0f

    .line 279
    .line 280
    const v14, 0x40b0a3d7    # 5.52f

    .line 281
    .line 282
    .line 283
    const v15, 0x408f5c29    # 4.48f

    .line 284
    .line 285
    .line 286
    const/high16 v16, 0x41200000    # 10.0f

    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const/high16 v18, -0x3ee00000    # -10.0f

    .line 292
    .line 293
    const v13, 0x40b0a3d7    # 5.52f

    .line 294
    .line 295
    .line 296
    const/4 v14, 0x0

    .line 297
    const/high16 v15, 0x41200000    # 10.0f

    .line 298
    .line 299
    const v16, -0x3f70a3d7    # -4.48f

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 306
    .line 307
    const/4 v13, 0x0

    .line 308
    const v14, -0x3f4f5c29    # -5.52f

    .line 309
    .line 310
    .line 311
    const v15, -0x3f70a3d7    # -4.48f

    .line 312
    .line 313
    .line 314
    const/high16 v16, -0x3ee00000    # -10.0f

    .line 315
    .line 316
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v17, 0x40000000    # 2.0f

    .line 320
    .line 321
    const/high16 v18, 0x41400000    # 12.0f

    .line 322
    .line 323
    const v13, 0x40cf5c29    # 6.48f

    .line 324
    .line 325
    .line 326
    const/high16 v14, 0x40000000    # 2.0f

    .line 327
    .line 328
    const/high16 v15, 0x40000000    # 2.0f

    .line 329
    .line 330
    const v16, 0x40cf5c29    # 6.48f

    .line 331
    .line 332
    .line 333
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v0, 0x41300000    # 11.0f

    .line 343
    .line 344
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/4 v0, 0x0

    .line 348
    const/high16 v2, -0x3f800000    # -4.0f

    .line 349
    .line 350
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v0, 0x40000000    # 2.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/4 v0, 0x0

    .line 359
    const/high16 v2, 0x40800000    # 4.0f

    .line 360
    .line 361
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v0, 0x40400000    # 3.0f

    .line 365
    .line 366
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v0, -0x3f800000    # -4.0f

    .line 370
    .line 371
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    const/high16 v0, 0x41300000    # 11.0f

    .line 378
    .line 379
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    const/16 v16, 0x3800

    .line 390
    .line 391
    const/16 v17, 0x0

    .line 392
    .line 393
    const/high16 v6, 0x3f800000    # 1.0f

    .line 394
    .line 395
    const/high16 v8, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/4 v7, 0x0

    .line 398
    const/high16 v12, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/4 v13, 0x0

    .line 401
    const/4 v14, 0x0

    .line 402
    const/4 v15, 0x0

    .line 403
    const-string v4, ""

    .line 404
    .line 405
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    sput-object v0, Landroidx/compose/material/icons/twotone/ArrowCircleRightKt;->_arrowCircleRight:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 414
    .line 415
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    return-object v0
.end method

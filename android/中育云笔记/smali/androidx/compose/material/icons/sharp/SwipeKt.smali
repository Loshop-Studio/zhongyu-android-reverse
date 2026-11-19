.class public final Landroidx/compose/material/icons/sharp/SwipeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _swipe:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSwipe(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/SwipeKt;->_swipe:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Swipe"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v6, 0x41a10a3d    # 20.13f

    .line 71
    .line 72
    .line 73
    const v7, 0x4077ae14    # 3.87f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v25, 0x41400000    # 12.0f

    .line 80
    .line 81
    const/high16 v26, 0x3f800000    # 1.0f

    .line 82
    .line 83
    const v21, 0x4195851f    # 18.69f

    .line 84
    .line 85
    .line 86
    const v22, 0x400ae148    # 2.17f

    .line 87
    .line 88
    .line 89
    const v23, 0x4179999a    # 15.6f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x3f800000    # 1.0f

    .line 93
    .line 94
    move-object/from16 v20, v4

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v8, 0x40a9eb85    # 5.31f

    .line 100
    .line 101
    .line 102
    const v9, 0x400ae148    # 2.17f

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v8, v9, v7, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v8, 0x40000000    # 2.0f

    .line 109
    .line 110
    invoke-virtual {v4, v8, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v9, 0x40a00000    # 5.0f

    .line 114
    .line 115
    invoke-virtual {v4, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v12, 0x409dc28f    # 4.93f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4, v12, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const v25, 0x40e23d71    # 7.07f

    .line 128
    .line 129
    .line 130
    const v26, -0x3fe47ae1    # -2.43f

    .line 131
    .line 132
    .line 133
    const/high16 v21, 0x3f800000    # 1.0f

    .line 134
    .line 135
    const v22, -0x405ae148    # -1.29f

    .line 136
    .line 137
    .line 138
    const v23, 0x406ccccd    # 3.7f

    .line 139
    .line 140
    .line 141
    const v24, -0x3fe47ae1    # -2.43f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v12, 0x40e23d71    # 7.07f

    .line 148
    .line 149
    .line 150
    const v13, 0x401b851f    # 2.43f

    .line 151
    .line 152
    .line 153
    const v14, 0x40c23d71    # 6.07f

    .line 154
    .line 155
    .line 156
    const v15, 0x3f91eb85    # 1.14f

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v14, v15, v12, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v12, 0x41880000    # 17.0f

    .line 163
    .line 164
    const/high16 v13, 0x40e00000    # 7.0f

    .line 165
    .line 166
    invoke-virtual {v4, v12, v13}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    const/16 v16, 0x3800

    .line 186
    .line 187
    const/16 v17, 0x0

    .line 188
    .line 189
    move-object v6, v2

    .line 190
    move-object v2, v4

    .line 191
    const-string v4, ""

    .line 192
    .line 193
    move-object v7, v6

    .line 194
    const/high16 v6, 0x3f800000    # 1.0f

    .line 195
    .line 196
    move-object v8, v7

    .line 197
    const/4 v7, 0x0

    .line 198
    move-object v9, v8

    .line 199
    const/high16 v8, 0x3f800000    # 1.0f

    .line 200
    .line 201
    move-object v12, v9

    .line 202
    const/high16 v9, 0x3f800000    # 1.0f

    .line 203
    .line 204
    move-object v13, v12

    .line 205
    const/high16 v12, 0x3f800000    # 1.0f

    .line 206
    .line 207
    move-object v14, v13

    .line 208
    const/4 v13, 0x0

    .line 209
    move-object v15, v14

    .line 210
    const/4 v14, 0x0

    .line 211
    move-object/from16 v20, v15

    .line 212
    .line 213
    const/4 v15, 0x0

    .line 214
    move-object/from16 p0, v0

    .line 215
    .line 216
    move-object/from16 v0, v20

    .line 217
    .line 218
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 219
    .line 220
    .line 221
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 226
    .line 227
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 228
    .line 229
    .line 230
    move-result-wide v6

    .line 231
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 239
    .line 240
    .line 241
    move-result v11

    .line 242
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 245
    .line 246
    .line 247
    const/high16 v0, 0x41480000    # 12.5f

    .line 248
    .line 249
    const/high16 v2, 0x41500000    # 13.0f

    .line 250
    .line 251
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v0, -0x3f400000    # -6.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v17, 0x41380000    # 11.5f

    .line 260
    .line 261
    const/high16 v18, 0x40a00000    # 5.0f

    .line 262
    .line 263
    const/high16 v13, 0x41500000    # 13.0f

    .line 264
    .line 265
    const v14, 0x40b570a4    # 5.67f

    .line 266
    .line 267
    .line 268
    const v15, 0x414547ae    # 12.33f

    .line 269
    .line 270
    .line 271
    const/high16 v16, 0x40a00000    # 5.0f

    .line 272
    .line 273
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v0, 0x40b570a4    # 5.67f

    .line 277
    .line 278
    .line 279
    const/high16 v4, 0x40d00000    # 6.5f

    .line 280
    .line 281
    const/high16 v6, 0x41200000    # 10.0f

    .line 282
    .line 283
    invoke-virtual {v12, v6, v0, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const v0, 0x412bd70a    # 10.74f

    .line 287
    .line 288
    .line 289
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, -0x3f7eb852    # -4.04f

    .line 293
    .line 294
    .line 295
    const v4, -0x40a66666    # -0.85f

    .line 296
    .line 297
    .line 298
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    const v0, -0x40651eb8    # -1.21f

    .line 302
    .line 303
    .line 304
    const v4, 0x3f9d70a4    # 1.23f

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const v0, 0x4122147b    # 10.13f

    .line 311
    .line 312
    .line 313
    const/high16 v4, 0x41b80000    # 23.0f

    .line 314
    .line 315
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v0, 0x410f851f    # 8.97f

    .line 319
    .line 320
    .line 321
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v0, 0x3f8b851f    # 1.09f

    .line 325
    .line 326
    .line 327
    const v4, -0x3f0b851f    # -7.64f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v0, -0x3f3c7ae1    # -6.11f

    .line 334
    .line 335
    .line 336
    const v4, -0x3fc8f5c3    # -2.86f

    .line 337
    .line 338
    .line 339
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const/16 v16, 0x3800

    .line 353
    .line 354
    const/16 v17, 0x0

    .line 355
    .line 356
    const-string v4, ""

    .line 357
    .line 358
    const/high16 v6, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/4 v7, 0x0

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
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    sput-object v0, Landroidx/compose/material/icons/sharp/SwipeKt;->_swipe:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 375
    .line 376
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    return-object v0
.end method

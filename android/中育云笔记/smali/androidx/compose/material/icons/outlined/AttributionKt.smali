.class public final Landroidx/compose/material/icons/outlined/AttributionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _attribution:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttribution(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/AttributionKt;->_attribution:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Attribution"

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
    const/high16 v4, 0x41080000    # 8.5f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3fd00000    # -2.75f

    .line 78
    .line 79
    const v26, 0x3fb0a3d7    # 1.38f

    .line 80
    .line 81
    .line 82
    const v21, -0x40970a3d    # -0.91f

    .line 83
    .line 84
    .line 85
    const/16 v22, 0x0

    .line 86
    .line 87
    const/high16 v23, -0x3fd00000    # -2.75f

    .line 88
    .line 89
    const v24, 0x3eeb851f    # 0.46f

    .line 90
    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v4, 0x4093d70a    # 4.62f

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 104
    .line 105
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v4, 0x412c0000    # 10.75f

    .line 109
    .line 110
    const/high16 v6, 0x41980000    # 19.0f

    .line 111
    .line 112
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v4, 0x40200000    # 2.5f

    .line 116
    .line 117
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, -0x3f700000    # -4.5f

    .line 121
    .line 122
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 126
    .line 127
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const/high16 v4, 0x416c0000    # 14.75f

    .line 131
    .line 132
    const v6, 0x411e147b    # 9.88f

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const v26, -0x404f5c29    # -1.38f

    .line 139
    .line 140
    .line 141
    const/16 v21, 0x0

    .line 142
    .line 143
    const v22, -0x40970a3d    # -0.91f

    .line 144
    .line 145
    .line 146
    const v23, -0x40147ae1    # -1.84f

    .line 147
    .line 148
    .line 149
    const v24, -0x404f5c29    # -1.38f

    .line 150
    .line 151
    .line 152
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x40000000    # 2.0f

    .line 159
    .line 160
    const/high16 v6, 0x41400000    # 12.0f

    .line 161
    .line 162
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, 0x40000000    # 2.0f

    .line 166
    .line 167
    const/high16 v26, 0x41400000    # 12.0f

    .line 168
    .line 169
    const v21, 0x40cf0a3d    # 6.47f

    .line 170
    .line 171
    .line 172
    const/high16 v22, 0x40000000    # 2.0f

    .line 173
    .line 174
    const/high16 v23, 0x40000000    # 2.0f

    .line 175
    .line 176
    const v24, 0x40cf0a3d    # 6.47f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const v4, 0x408f0a3d    # 4.47f

    .line 183
    .line 184
    .line 185
    const/high16 v6, 0x41200000    # 10.0f

    .line 186
    .line 187
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const v4, -0x3f70a3d7    # -4.48f

    .line 191
    .line 192
    .line 193
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 194
    .line 195
    const/high16 v7, 0x41200000    # 10.0f

    .line 196
    .line 197
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x418c28f6    # 17.52f

    .line 201
    .line 202
    .line 203
    const/high16 v6, 0x40000000    # 2.0f

    .line 204
    .line 205
    const/high16 v7, 0x41400000    # 12.0f

    .line 206
    .line 207
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const/high16 v4, 0x41a00000    # 20.0f

    .line 214
    .line 215
    const/high16 v6, 0x41400000    # 12.0f

    .line 216
    .line 217
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v25, -0x3f000000    # -8.0f

    .line 221
    .line 222
    const/high16 v26, -0x3f000000    # -8.0f

    .line 223
    .line 224
    const v21, -0x3f728f5c    # -4.42f

    .line 225
    .line 226
    .line 227
    const/16 v22, 0x0

    .line 228
    .line 229
    const/high16 v23, -0x3f000000    # -8.0f

    .line 230
    .line 231
    const v24, -0x3f9ae148    # -3.58f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v4, 0x40651eb8    # 3.58f

    .line 238
    .line 239
    .line 240
    const/high16 v6, -0x3f000000    # -8.0f

    .line 241
    .line 242
    const/high16 v7, 0x41000000    # 8.0f

    .line 243
    .line 244
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v6, 0x41000000    # 8.0f

    .line 248
    .line 249
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, -0x3f9ae148    # -3.58f

    .line 253
    .line 254
    .line 255
    const/high16 v6, -0x3f000000    # -8.0f

    .line 256
    .line 257
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    const/16 v16, 0x3800

    .line 268
    .line 269
    const/16 v17, 0x0

    .line 270
    .line 271
    const/high16 v6, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/high16 v8, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const/4 v7, 0x0

    .line 276
    const/high16 v9, 0x3f800000    # 1.0f

    .line 277
    .line 278
    const/high16 v12, 0x3f800000    # 1.0f

    .line 279
    .line 280
    const/4 v13, 0x0

    .line 281
    const/4 v14, 0x0

    .line 282
    const/4 v15, 0x0

    .line 283
    const-string v4, ""

    .line 284
    .line 285
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 286
    .line 287
    .line 288
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 293
    .line 294
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 295
    .line 296
    .line 297
    move-result-wide v6

    .line 298
    const/4 v0, 0x0

    .line 299
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 303
    .line 304
    .line 305
    move-result v10

    .line 306
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 307
    .line 308
    .line 309
    move-result v11

    .line 310
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x40d00000    # 6.5f

    .line 316
    .line 317
    const/high16 v2, 0x41400000    # 12.0f

    .line 318
    .line 319
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v0, -0x40400000    # -1.5f

    .line 323
    .line 324
    const/4 v2, 0x0

    .line 325
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const/high16 v18, 0x40400000    # 3.0f

    .line 329
    .line 330
    const/16 v19, 0x0

    .line 331
    .line 332
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 333
    .line 334
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 335
    .line 336
    const/16 v16, 0x1

    .line 337
    .line 338
    const/16 v17, 0x1

    .line 339
    .line 340
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 344
    .line 345
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

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
    const/high16 v6, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/4 v7, 0x0

    .line 359
    const/high16 v12, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v13, 0x0

    .line 362
    const/4 v14, 0x0

    .line 363
    const-string v4, ""

    .line 364
    .line 365
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    sput-object v0, Landroidx/compose/material/icons/outlined/AttributionKt;->_attribution:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 374
    .line 375
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    return-object v0
.end method

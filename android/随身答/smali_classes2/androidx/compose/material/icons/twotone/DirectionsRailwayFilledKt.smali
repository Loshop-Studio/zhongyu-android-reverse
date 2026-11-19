.class public final Landroidx/compose/material/icons/twotone/DirectionsRailwayFilledKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_directionsRailwayFilled",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "DirectionsRailwayFilled",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getDirectionsRailwayFilled",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDirectionsRailwayFilled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DirectionsRailwayFilled.kt\nandroidx/compose/material/icons/twotone/DirectionsRailwayFilledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,98:1\n212#2,12:99\n233#2,18:112\n253#2:149\n233#2,18:150\n253#2:187\n233#2,18:188\n253#2:225\n233#2,18:226\n253#2:263\n174#3:111\n705#4,2:130\n717#4,2:132\n719#4,11:138\n705#4,2:168\n717#4,2:170\n719#4,11:176\n705#4,2:206\n717#4,2:208\n719#4,11:214\n705#4,2:244\n717#4,2:246\n719#4,11:252\n72#5,4:134\n72#5,4:172\n72#5,4:210\n72#5,4:248\n*S KotlinDebug\n*F\n+ 1 DirectionsRailwayFilled.kt\nandroidx/compose/material/icons/twotone/DirectionsRailwayFilledKt\n*L\n29#1:99,12\n30#1:112,18\n30#1:149\n46#1:150,18\n46#1:187\n53#1:188,18\n53#1:225\n87#1:226,18\n87#1:263\n29#1:111\n30#1:130,2\n30#1:132,2\n30#1:138,11\n46#1:168,2\n46#1:170,2\n46#1:176,11\n53#1:206,2\n53#1:208,2\n53#1:214,11\n87#1:244,2\n87#1:246,2\n87#1:252,11\n30#1:134,4\n46#1:172,4\n53#1:210,4\n87#1:248,4\n*E\n"
    }
.end annotation


# static fields
.field private static _directionsRailwayFilled:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getDirectionsRailwayFilled(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/DirectionsRailwayFilledKt;->_directionsRailwayFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

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
    const-string v2, "TwoTone.DirectionsRailwayFilled"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const/high16 v4, 0x41780000    # 15.5f

    .line 71
    .line 72
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40f00000    # 7.5f

    .line 78
    .line 79
    const/high16 v26, 0x41880000    # 17.0f

    .line 80
    .line 81
    const/high16 v21, 0x40c00000    # 6.0f

    .line 82
    .line 83
    const v22, 0x4182a3d7    # 16.33f

    .line 84
    .line 85
    .line 86
    const v23, 0x40d570a4    # 6.67f

    .line 87
    .line 88
    .line 89
    const/high16 v24, 0x41880000    # 17.0f

    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v4, 0x41100000    # 9.0f

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 102
    .line 103
    const/high16 v26, -0x40400000    # -1.5f

    .line 104
    .line 105
    const v21, 0x3f547ae1    # 0.83f

    .line 106
    .line 107
    .line 108
    const/16 v22, 0x0

    .line 109
    .line 110
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 111
    .line 112
    const v24, -0x40d47ae1    # -0.67f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x41400000    # 12.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, 0x40c00000    # 6.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x41780000    # 15.5f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v4, 0x41500000    # 13.0f

    .line 137
    .line 138
    const/high16 v6, 0x41400000    # 12.0f

    .line 139
    .line 140
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 144
    .line 145
    const v24, 0x3f2b851f    # 0.67f

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 149
    .line 150
    .line 151
    const v4, 0x414d47ae    # 12.83f

    .line 152
    .line 153
    .line 154
    const/high16 v6, 0x41800000    # 16.0f

    .line 155
    .line 156
    const/high16 v7, 0x41400000    # 12.0f

    .line 157
    .line 158
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v4, -0x40d47ae1    # -0.67f

    .line 162
    .line 163
    .line 164
    const/high16 v6, -0x40400000    # -1.5f

    .line 165
    .line 166
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x4132b852    # 11.17f

    .line 170
    .line 171
    .line 172
    const/high16 v6, 0x41500000    # 13.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    const/16 v16, 0x3800

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    const v6, 0x3e99999a    # 0.3f

    .line 189
    .line 190
    .line 191
    const v8, 0x3e99999a    # 0.3f

    .line 192
    .line 193
    .line 194
    const/4 v7, 0x0

    .line 195
    const/high16 v9, 0x3f800000    # 1.0f

    .line 196
    .line 197
    const/high16 v12, 0x3f800000    # 1.0f

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v15, 0x0

    .line 202
    const-string v4, ""

    .line 203
    .line 204
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 205
    .line 206
    .line 207
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 212
    .line 213
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 214
    .line 215
    .line 216
    move-result-wide v6

    .line 217
    const/4 v2, 0x0

    .line 218
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    const/high16 v4, 0x40800000    # 4.0f

    .line 235
    .line 236
    const/high16 v6, 0x41400000    # 12.0f

    .line 237
    .line 238
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v25, 0x40cdc28f    # 6.43f

    .line 242
    .line 243
    .line 244
    const/high16 v26, 0x40a00000    # 5.0f

    .line 245
    .line 246
    const v21, 0x4107ae14    # 8.48f

    .line 247
    .line 248
    .line 249
    const/high16 v22, 0x40800000    # 4.0f

    .line 250
    .line 251
    const v23, 0x40e0f5c3    # 7.03f

    .line 252
    .line 253
    .line 254
    const v24, 0x408f5c29    # 4.48f

    .line 255
    .line 256
    .line 257
    move-object/from16 v20, v2

    .line 258
    .line 259
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const v4, 0x4133d70a    # 11.24f

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v25, 0x41400000    # 12.0f

    .line 269
    .line 270
    const/high16 v26, 0x40800000    # 4.0f

    .line 271
    .line 272
    const v21, 0x41890a3d    # 17.13f

    .line 273
    .line 274
    .line 275
    const v22, 0x408eb852    # 4.46f

    .line 276
    .line 277
    .line 278
    const v23, 0x417b5c29    # 15.71f

    .line 279
    .line 280
    .line 281
    const/high16 v24, 0x40800000    # 4.0f

    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    const v6, 0x3e99999a    # 0.3f

    .line 294
    .line 295
    .line 296
    const/4 v7, 0x0

    .line 297
    const-string v4, ""

    .line 298
    .line 299
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 300
    .line 301
    .line 302
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 307
    .line 308
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 309
    .line 310
    .line 311
    move-result-wide v6

    .line 312
    const/4 v2, 0x0

    .line 313
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 317
    .line 318
    .line 319
    move-result v10

    .line 320
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 327
    .line 328
    .line 329
    const/high16 v4, 0x40000000    # 2.0f

    .line 330
    .line 331
    const/high16 v6, 0x41400000    # 12.0f

    .line 332
    .line 333
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v25, 0x40800000    # 4.0f

    .line 337
    .line 338
    const/high16 v26, 0x40c00000    # 6.0f

    .line 339
    .line 340
    const/high16 v21, 0x41000000    # 8.0f

    .line 341
    .line 342
    const/high16 v22, 0x40000000    # 2.0f

    .line 343
    .line 344
    const/high16 v23, 0x40800000    # 4.0f

    .line 345
    .line 346
    const/high16 v24, 0x40200000    # 2.5f

    .line 347
    .line 348
    move-object/from16 v20, v2

    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v4, 0x41180000    # 9.5f

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v25, 0x40f00000    # 7.5f

    .line 359
    .line 360
    const/high16 v26, 0x41980000    # 19.0f

    .line 361
    .line 362
    const/high16 v21, 0x40800000    # 4.0f

    .line 363
    .line 364
    const v22, 0x418b70a4    # 17.43f

    .line 365
    .line 366
    .line 367
    const v23, 0x40b23d71    # 5.57f

    .line 368
    .line 369
    .line 370
    const/high16 v24, 0x41980000    # 19.0f

    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x41a00000    # 20.0f

    .line 376
    .line 377
    const/high16 v6, 0x40c00000    # 6.0f

    .line 378
    .line 379
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const/high16 v4, 0x3f800000    # 1.0f

    .line 383
    .line 384
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v4, 0x41400000    # 12.0f

    .line 388
    .line 389
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    .line 392
    const/high16 v4, -0x40800000    # -1.0f

    .line 393
    .line 394
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v6, -0x40400000    # -1.5f

    .line 398
    .line 399
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 400
    .line 401
    .line 402
    const/high16 v25, 0x40600000    # 3.5f

    .line 403
    .line 404
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 405
    .line 406
    const v21, 0x3ff70a3d    # 1.93f

    .line 407
    .line 408
    .line 409
    const/16 v22, 0x0

    .line 410
    .line 411
    const/high16 v23, 0x40600000    # 3.5f

    .line 412
    .line 413
    const v24, -0x40370a3d    # -1.57f

    .line 414
    .line 415
    .line 416
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const/high16 v4, 0x40c00000    # 6.0f

    .line 420
    .line 421
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 422
    .line 423
    .line 424
    const/high16 v25, 0x41400000    # 12.0f

    .line 425
    .line 426
    const/high16 v26, 0x40000000    # 2.0f

    .line 427
    .line 428
    const/high16 v21, 0x41a00000    # 20.0f

    .line 429
    .line 430
    const/high16 v22, 0x40200000    # 2.5f

    .line 431
    .line 432
    const v23, 0x41835c29    # 16.42f

    .line 433
    .line 434
    .line 435
    const/high16 v24, 0x40000000    # 2.0f

    .line 436
    .line 437
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 441
    .line 442
    .line 443
    const/high16 v4, 0x40800000    # 4.0f

    .line 444
    .line 445
    const/high16 v6, 0x41400000    # 12.0f

    .line 446
    .line 447
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v25, 0x40b570a4    # 5.67f

    .line 451
    .line 452
    .line 453
    const/high16 v26, 0x3f800000    # 1.0f

    .line 454
    .line 455
    const v21, 0x406d70a4    # 3.71f

    .line 456
    .line 457
    .line 458
    const/16 v22, 0x0

    .line 459
    .line 460
    const v23, 0x40a428f6    # 5.13f

    .line 461
    .line 462
    .line 463
    const v24, 0x3eeb851f    # 0.46f

    .line 464
    .line 465
    .line 466
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v4, 0x40cdc28f    # 6.43f

    .line 470
    .line 471
    .line 472
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 473
    .line 474
    .line 475
    const/high16 v25, 0x41400000    # 12.0f

    .line 476
    .line 477
    const/high16 v26, 0x40800000    # 4.0f

    .line 478
    .line 479
    const v21, 0x40e0f5c3    # 7.03f

    .line 480
    .line 481
    .line 482
    const v22, 0x408f5c29    # 4.48f

    .line 483
    .line 484
    .line 485
    const v23, 0x4107ae14    # 8.48f

    .line 486
    .line 487
    .line 488
    const/high16 v24, 0x40800000    # 4.0f

    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    const/high16 v4, 0x41900000    # 18.0f

    .line 497
    .line 498
    const/high16 v6, 0x41780000    # 15.5f

    .line 499
    .line 500
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    const/high16 v25, -0x40400000    # -1.5f

    .line 504
    .line 505
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 506
    .line 507
    const/16 v21, 0x0

    .line 508
    .line 509
    const v22, 0x3f547ae1    # 0.83f

    .line 510
    .line 511
    .line 512
    const v23, -0x40d47ae1    # -0.67f

    .line 513
    .line 514
    .line 515
    const/high16 v24, 0x3fc00000    # 1.5f

    .line 516
    .line 517
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v4, -0x3ef00000    # -9.0f

    .line 521
    .line 522
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v25, 0x40c00000    # 6.0f

    .line 526
    .line 527
    const/high16 v26, 0x41780000    # 15.5f

    .line 528
    .line 529
    const v21, 0x40d570a4    # 6.67f

    .line 530
    .line 531
    .line 532
    const/high16 v22, 0x41880000    # 17.0f

    .line 533
    .line 534
    const/high16 v23, 0x40c00000    # 6.0f

    .line 535
    .line 536
    const v24, 0x4182a3d7    # 16.33f

    .line 537
    .line 538
    .line 539
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 540
    .line 541
    .line 542
    const/high16 v4, 0x41400000    # 12.0f

    .line 543
    .line 544
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const/high16 v4, 0x41780000    # 15.5f

    .line 551
    .line 552
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 556
    .line 557
    .line 558
    const/high16 v4, 0x41200000    # 10.0f

    .line 559
    .line 560
    const/high16 v6, 0x41900000    # 18.0f

    .line 561
    .line 562
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    const/high16 v4, 0x40c00000    # 6.0f

    .line 566
    .line 567
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 568
    .line 569
    .line 570
    const/high16 v4, 0x40e00000    # 7.0f

    .line 571
    .line 572
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 573
    .line 574
    .line 575
    const/high16 v4, 0x41400000    # 12.0f

    .line 576
    .line 577
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 578
    .line 579
    .line 580
    const/high16 v4, 0x41200000    # 10.0f

    .line 581
    .line 582
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    const/high16 v6, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const/high16 v8, 0x3f800000    # 1.0f

    .line 595
    .line 596
    const/4 v7, 0x0

    .line 597
    const-string v4, ""

    .line 598
    .line 599
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 600
    .line 601
    .line 602
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 607
    .line 608
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 609
    .line 610
    .line 611
    move-result-wide v6

    .line 612
    const/4 v0, 0x0

    .line 613
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 617
    .line 618
    .line 619
    move-result v10

    .line 620
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 621
    .line 622
    .line 623
    move-result v11

    .line 624
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 627
    .line 628
    .line 629
    const/high16 v0, 0x41680000    # 14.5f

    .line 630
    .line 631
    const/high16 v2, 0x41400000    # 12.0f

    .line 632
    .line 633
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 634
    .line 635
    .line 636
    const/4 v0, 0x0

    .line 637
    const/high16 v2, -0x40400000    # -1.5f

    .line 638
    .line 639
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const/high16 v18, 0x40400000    # 3.0f

    .line 643
    .line 644
    const/16 v19, 0x0

    .line 645
    .line 646
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 647
    .line 648
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 649
    .line 650
    const/16 v16, 0x1

    .line 651
    .line 652
    const/16 v17, 0x1

    .line 653
    .line 654
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 655
    .line 656
    .line 657
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 658
    .line 659
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    const/16 v16, 0x3800

    .line 667
    .line 668
    const/16 v17, 0x0

    .line 669
    .line 670
    const/high16 v6, 0x3f800000    # 1.0f

    .line 671
    .line 672
    const/4 v7, 0x0

    .line 673
    const/high16 v12, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const/4 v13, 0x0

    .line 676
    const/4 v14, 0x0

    .line 677
    const-string v4, ""

    .line 678
    .line 679
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    sput-object v0, Landroidx/compose/material/icons/twotone/DirectionsRailwayFilledKt;->_directionsRailwayFilled:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 688
    .line 689
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    return-object v0
.end method

.class public final Landroidx/compose/material/icons/rounded/SensorOccupiedKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sensorOccupied",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SensorOccupied",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getSensorOccupied",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nSensorOccupied.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensorOccupied.kt\nandroidx/compose/material/icons/rounded/SensorOccupiedKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,104:1\n212#2,12:105\n233#2,18:118\n253#2:155\n233#2,18:156\n253#2:193\n233#2,18:194\n253#2:231\n233#2,18:232\n253#2:269\n233#2,18:270\n253#2:307\n233#2,18:308\n253#2:345\n174#3:117\n705#4,2:136\n717#4,2:138\n719#4,11:144\n705#4,2:174\n717#4,2:176\n719#4,11:182\n705#4,2:212\n717#4,2:214\n719#4,11:220\n705#4,2:250\n717#4,2:252\n719#4,11:258\n705#4,2:288\n717#4,2:290\n719#4,11:296\n705#4,2:326\n717#4,2:328\n719#4,11:334\n72#5,4:140\n72#5,4:178\n72#5,4:216\n72#5,4:254\n72#5,4:292\n72#5,4:330\n*S KotlinDebug\n*F\n+ 1 SensorOccupied.kt\nandroidx/compose/material/icons/rounded/SensorOccupiedKt\n*L\n29#1:105,12\n30#1:118,18\n30#1:155\n38#1:156,18\n38#1:193\n51#1:194,18\n51#1:231\n63#1:232,18\n63#1:269\n75#1:270,18\n75#1:307\n87#1:308,18\n87#1:345\n29#1:117\n30#1:136,2\n30#1:138,2\n30#1:144,11\n38#1:174,2\n38#1:176,2\n38#1:182,11\n51#1:212,2\n51#1:214,2\n51#1:220,11\n63#1:250,2\n63#1:252,2\n63#1:258,11\n75#1:288,2\n75#1:290,2\n75#1:296,11\n87#1:326,2\n87#1:328,2\n87#1:334,11\n30#1:140,4\n38#1:178,4\n51#1:216,4\n63#1:254,4\n75#1:292,4\n87#1:330,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sensorOccupied:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSensorOccupied(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/SensorOccupiedKt;->_sensorOccupied:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.SensorOccupied"

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
    const/high16 v4, 0x41300000    # 11.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40400000    # 3.0f

    .line 78
    .line 79
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 80
    .line 81
    const v21, 0x3fd47ae1    # 1.66f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40400000    # 3.0f

    .line 87
    .line 88
    const v24, -0x40547ae1    # -1.34f

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
    const v4, -0x40547ae1    # -1.34f

    .line 97
    .line 98
    .line 99
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x40cae148    # 6.34f

    .line 105
    .line 106
    .line 107
    const/high16 v6, 0x41000000    # 8.0f

    .line 108
    .line 109
    const/high16 v7, 0x41100000    # 9.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x412570a4    # 10.34f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x41300000    # 11.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const/16 v16, 0x3800

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/high16 v6, 0x3f800000    # 1.0f

    .line 136
    .line 137
    const/high16 v8, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    const/high16 v9, 0x3f800000    # 1.0f

    .line 141
    .line 142
    const/high16 v12, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/4 v13, 0x0

    .line 145
    const/4 v14, 0x0

    .line 146
    const/4 v15, 0x0

    .line 147
    const-string v4, ""

    .line 148
    .line 149
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 150
    .line 151
    .line 152
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 157
    .line 158
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 159
    .line 160
    .line 161
    move-result-wide v6

    .line 162
    const/4 v2, 0x0

    .line 163
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 171
    .line 172
    .line 173
    move-result v11

    .line 174
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const/high16 v4, 0x41400000    # 12.0f

    .line 180
    .line 181
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v25, -0x3f5f0a3d    # -5.03f

    .line 185
    .line 186
    .line 187
    const v26, 0x3faf5c29    # 1.37f

    .line 188
    .line 189
    .line 190
    const v21, -0x40147ae1    # -1.84f

    .line 191
    .line 192
    .line 193
    const v23, -0x3f9c28f6    # -3.56f

    .line 194
    .line 195
    .line 196
    const/high16 v24, 0x3f000000    # 0.5f

    .line 197
    .line 198
    move-object/from16 v20, v2

    .line 199
    .line 200
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const/high16 v25, 0x40c00000    # 6.0f

    .line 204
    .line 205
    const v26, 0x417170a4    # 15.09f

    .line 206
    .line 207
    .line 208
    const v21, 0x40cb851f    # 6.36f

    .line 209
    .line 210
    .line 211
    const v22, 0x415bae14    # 13.73f

    .line 212
    .line 213
    .line 214
    const/high16 v23, 0x40c00000    # 6.0f

    .line 215
    .line 216
    const v24, 0x41663d71    # 14.39f

    .line 217
    .line 218
    .line 219
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 220
    .line 221
    .line 222
    const/high16 v4, 0x40c00000    # 6.0f

    .line 223
    .line 224
    const/high16 v6, 0x41800000    # 16.0f

    .line 225
    .line 226
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v25, 0x3f800000    # 1.0f

    .line 230
    .line 231
    const/high16 v26, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/16 v21, 0x0

    .line 234
    .line 235
    const v22, 0x3f0ccccd    # 0.55f

    .line 236
    .line 237
    .line 238
    const v23, 0x3ee66666    # 0.45f

    .line 239
    .line 240
    .line 241
    const/high16 v24, 0x3f800000    # 1.0f

    .line 242
    .line 243
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v4, 0x41200000    # 10.0f

    .line 247
    .line 248
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v26, -0x40800000    # -1.0f

    .line 252
    .line 253
    const v21, 0x3f0ccccd    # 0.55f

    .line 254
    .line 255
    .line 256
    const/16 v22, 0x0

    .line 257
    .line 258
    const/high16 v23, 0x3f800000    # 1.0f

    .line 259
    .line 260
    const v24, -0x4119999a    # -0.45f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v4, -0x40970a3d    # -0.91f

    .line 267
    .line 268
    .line 269
    const/4 v6, 0x0

    .line 270
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v25, -0x4087ae14    # -0.97f

    .line 274
    .line 275
    .line 276
    const v26, -0x4023d70a    # -1.72f

    .line 277
    .line 278
    .line 279
    const/16 v21, 0x0

    .line 280
    .line 281
    const v22, -0x40cccccd    # -0.7f

    .line 282
    .line 283
    .line 284
    const v23, -0x4147ae14    # -0.36f

    .line 285
    .line 286
    .line 287
    const v24, -0x4051eb85    # -1.36f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v25, 0x41400000    # 12.0f

    .line 294
    .line 295
    const/high16 v26, 0x41400000    # 12.0f

    .line 296
    .line 297
    const v21, 0x4178f5c3    # 15.56f

    .line 298
    .line 299
    .line 300
    const/high16 v22, 0x41480000    # 12.5f

    .line 301
    .line 302
    const v23, 0x415d70a4    # 13.84f

    .line 303
    .line 304
    .line 305
    const/high16 v24, 0x41400000    # 12.0f

    .line 306
    .line 307
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    const/high16 v6, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/4 v7, 0x0

    .line 320
    const-string v4, ""

    .line 321
    .line 322
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 323
    .line 324
    .line 325
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 330
    .line 331
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 332
    .line 333
    .line 334
    move-result-wide v6

    .line 335
    const/4 v2, 0x0

    .line 336
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 344
    .line 345
    .line 346
    move-result v11

    .line 347
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 350
    .line 351
    .line 352
    const v4, 0x40f947ae    # 7.79f

    .line 353
    .line 354
    .line 355
    const v6, 0x41b0e148    # 22.11f

    .line 356
    .line 357
    .line 358
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v25, 0x3f000000    # 0.5f

    .line 365
    .line 366
    const v26, -0x404b851f    # -1.41f

    .line 367
    .line 368
    .line 369
    const v21, 0x3f0ccccd    # 0.55f

    .line 370
    .line 371
    .line 372
    const v22, -0x41947ae1    # -0.23f

    .line 373
    .line 374
    .line 375
    const v23, 0x3f47ae14    # 0.78f

    .line 376
    .line 377
    .line 378
    const v24, -0x409eb852    # -0.88f

    .line 379
    .line 380
    .line 381
    move-object/from16 v20, v2

    .line 382
    .line 383
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v25, -0x3f6051ec    # -4.99f

    .line 387
    .line 388
    .line 389
    const v26, -0x3f6051ec    # -4.99f

    .line 390
    .line 391
    .line 392
    const v21, -0x406f5c29    # -1.13f

    .line 393
    .line 394
    .line 395
    const v22, -0x3ff851ec    # -2.12f

    .line 396
    .line 397
    .line 398
    const v23, -0x3fc851ec    # -2.87f

    .line 399
    .line 400
    .line 401
    const v24, -0x3f88f5c3    # -3.86f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v25, -0x404ccccd    # -1.4f

    .line 408
    .line 409
    .line 410
    const/high16 v26, 0x3f000000    # 0.5f

    .line 411
    .line 412
    const v21, -0x40fae148    # -0.52f

    .line 413
    .line 414
    .line 415
    const v22, -0x4170a3d7    # -0.28f

    .line 416
    .line 417
    .line 418
    const v23, -0x406a3d71    # -1.17f

    .line 419
    .line 420
    .line 421
    const v24, -0x42dc28f6    # -0.04f

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 425
    .line 426
    .line 427
    const/4 v4, 0x0

    .line 428
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const v25, 0x3edc28f6    # 0.43f

    .line 432
    .line 433
    .line 434
    const/high16 v26, 0x3fa00000    # 1.25f

    .line 435
    .line 436
    const v21, -0x41bd70a4    # -0.19f

    .line 437
    .line 438
    .line 439
    const v22, 0x3ef0a3d7    # 0.47f

    .line 440
    .line 441
    .line 442
    const v23, -0x43dc28f6    # -0.01f

    .line 443
    .line 444
    .line 445
    const v24, 0x3f828f5c    # 1.02f

    .line 446
    .line 447
    .line 448
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 449
    .line 450
    .line 451
    const v25, 0x4086b852    # 4.21f

    .line 452
    .line 453
    .line 454
    const v26, 0x4086b852    # 4.21f

    .line 455
    .line 456
    .line 457
    const v21, 0x3fe51eb8    # 1.79f

    .line 458
    .line 459
    .line 460
    const v22, 0x3f70a3d7    # 0.94f

    .line 461
    .line 462
    .line 463
    const v23, 0x4050a3d7    # 3.26f

    .line 464
    .line 465
    .line 466
    const v24, 0x401ae148    # 2.42f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v25, 0x41b0e148    # 22.11f

    .line 473
    .line 474
    .line 475
    const v26, 0x40f947ae    # 7.79f

    .line 476
    .line 477
    .line 478
    const v21, 0x41a8b852    # 21.09f

    .line 479
    .line 480
    .line 481
    const v22, 0x40f9999a    # 7.8f

    .line 482
    .line 483
    .line 484
    const v23, 0x41ad1eb8    # 21.64f

    .line 485
    .line 486
    .line 487
    const v24, 0x40ff5c29    # 7.98f

    .line 488
    .line 489
    .line 490
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    const/high16 v6, 0x3f800000    # 1.0f

    .line 501
    .line 502
    const/4 v7, 0x0

    .line 503
    const-string v4, ""

    .line 504
    .line 505
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 506
    .line 507
    .line 508
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 513
    .line 514
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 515
    .line 516
    .line 517
    move-result-wide v6

    .line 518
    const/4 v2, 0x0

    .line 519
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 523
    .line 524
    .line 525
    move-result v10

    .line 526
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 527
    .line 528
    .line 529
    move-result v11

    .line 530
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 533
    .line 534
    .line 535
    const v4, 0x3ff1eb85    # 1.89f

    .line 536
    .line 537
    .line 538
    const v6, 0x40f947ae    # 7.79f

    .line 539
    .line 540
    .line 541
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v25, -0x404ccccd    # -1.4f

    .line 548
    .line 549
    .line 550
    const/high16 v26, -0x41000000    # -0.5f

    .line 551
    .line 552
    const v21, -0x41947ae1    # -0.23f

    .line 553
    .line 554
    .line 555
    const v22, -0x40f33333    # -0.55f

    .line 556
    .line 557
    .line 558
    const v23, -0x409eb852    # -0.88f

    .line 559
    .line 560
    .line 561
    const v24, -0x40b851ec    # -0.78f

    .line 562
    .line 563
    .line 564
    move-object/from16 v20, v2

    .line 565
    .line 566
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 567
    .line 568
    .line 569
    const v25, 0x3fb33333    # 1.4f

    .line 570
    .line 571
    .line 572
    const v26, 0x40cc28f6    # 6.38f

    .line 573
    .line 574
    .line 575
    const v21, 0x4088a3d7    # 4.27f

    .line 576
    .line 577
    .line 578
    const v22, 0x402147ae    # 2.52f

    .line 579
    .line 580
    .line 581
    const v23, 0x402147ae    # 2.52f

    .line 582
    .line 583
    .line 584
    const v24, 0x408851ec    # 4.26f

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v25, 0x3f000000    # 0.5f

    .line 591
    .line 592
    const v26, 0x3fb47ae1    # 1.41f

    .line 593
    .line 594
    .line 595
    const v21, -0x4170a3d7    # -0.28f

    .line 596
    .line 597
    .line 598
    const v22, 0x3f051eb8    # 0.52f

    .line 599
    .line 600
    .line 601
    const v23, -0x42b33333    # -0.05f

    .line 602
    .line 603
    .line 604
    const v24, 0x3f970a3d    # 1.18f

    .line 605
    .line 606
    .line 607
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 608
    .line 609
    .line 610
    const/4 v4, 0x0

    .line 611
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 612
    .line 613
    .line 614
    const/high16 v25, 0x3fa00000    # 1.25f

    .line 615
    .line 616
    const v26, -0x4123d70a    # -0.43f

    .line 617
    .line 618
    .line 619
    const v21, 0x3ef0a3d7    # 0.47f

    .line 620
    .line 621
    .line 622
    const v22, 0x3e4ccccd    # 0.2f

    .line 623
    .line 624
    .line 625
    const v23, 0x3f828f5c    # 1.02f

    .line 626
    .line 627
    .line 628
    const v24, 0x3c23d70a    # 0.01f

    .line 629
    .line 630
    .line 631
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 632
    .line 633
    .line 634
    const v25, 0x4086b852    # 4.21f

    .line 635
    .line 636
    .line 637
    const v26, -0x3f7947ae    # -4.21f

    .line 638
    .line 639
    .line 640
    const v21, 0x3f70a3d7    # 0.94f

    .line 641
    .line 642
    .line 643
    const v22, -0x401ae148    # -1.79f

    .line 644
    .line 645
    .line 646
    const v23, 0x401ae148    # 2.42f

    .line 647
    .line 648
    .line 649
    const v24, -0x3faf5c29    # -3.26f

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const v25, 0x40f947ae    # 7.79f

    .line 656
    .line 657
    .line 658
    const v26, 0x3ff1eb85    # 1.89f

    .line 659
    .line 660
    .line 661
    const v21, 0x40f9999a    # 7.8f

    .line 662
    .line 663
    .line 664
    const v22, 0x403a3d71    # 2.91f

    .line 665
    .line 666
    .line 667
    const v23, 0x40ff5c29    # 7.98f

    .line 668
    .line 669
    .line 670
    const v24, 0x40170a3d    # 2.36f

    .line 671
    .line 672
    .line 673
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 674
    .line 675
    .line 676
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    const/high16 v6, 0x3f800000    # 1.0f

    .line 684
    .line 685
    const/4 v7, 0x0

    .line 686
    const-string v4, ""

    .line 687
    .line 688
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 689
    .line 690
    .line 691
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 692
    .line 693
    .line 694
    move-result v3

    .line 695
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 696
    .line 697
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 698
    .line 699
    .line 700
    move-result-wide v6

    .line 701
    const/4 v2, 0x0

    .line 702
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 706
    .line 707
    .line 708
    move-result v10

    .line 709
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 710
    .line 711
    .line 712
    move-result v11

    .line 713
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 716
    .line 717
    .line 718
    const v4, 0x4181ae14    # 16.21f

    .line 719
    .line 720
    .line 721
    const v6, 0x3ff1eb85    # 1.89f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 728
    .line 729
    .line 730
    const/high16 v25, -0x41000000    # -0.5f

    .line 731
    .line 732
    const v26, 0x3fb33333    # 1.4f

    .line 733
    .line 734
    .line 735
    const v21, -0x40f33333    # -0.55f

    .line 736
    .line 737
    .line 738
    const v22, 0x3e6b851f    # 0.23f

    .line 739
    .line 740
    .line 741
    const v23, -0x40b851ec    # -0.78f

    .line 742
    .line 743
    .line 744
    const v24, 0x3f6147ae    # 0.88f

    .line 745
    .line 746
    .line 747
    move-object/from16 v20, v2

    .line 748
    .line 749
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const/high16 v25, 0x40a00000    # 5.0f

    .line 753
    .line 754
    const/high16 v26, 0x40a00000    # 5.0f

    .line 755
    .line 756
    const v21, 0x3f90a3d7    # 1.13f

    .line 757
    .line 758
    .line 759
    const v22, 0x4007ae14    # 2.12f

    .line 760
    .line 761
    .line 762
    const v23, 0x4037ae14    # 2.87f

    .line 763
    .line 764
    .line 765
    const v24, 0x4077ae14    # 3.87f

    .line 766
    .line 767
    .line 768
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 769
    .line 770
    .line 771
    const v25, 0x3fb33333    # 1.4f

    .line 772
    .line 773
    .line 774
    const/high16 v26, -0x41000000    # -0.5f

    .line 775
    .line 776
    const v21, 0x3f051eb8    # 0.52f

    .line 777
    .line 778
    .line 779
    const v22, 0x3e8f5c29    # 0.28f

    .line 780
    .line 781
    .line 782
    const v23, 0x3f95c28f    # 1.17f

    .line 783
    .line 784
    .line 785
    const v24, 0x3d23d70a    # 0.04f

    .line 786
    .line 787
    .line 788
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 789
    .line 790
    .line 791
    const/4 v4, 0x0

    .line 792
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 793
    .line 794
    .line 795
    const v25, -0x4123d70a    # -0.43f

    .line 796
    .line 797
    .line 798
    const/high16 v26, -0x40600000    # -1.25f

    .line 799
    .line 800
    const v21, 0x3e428f5c    # 0.19f

    .line 801
    .line 802
    .line 803
    const v22, -0x410f5c29    # -0.47f

    .line 804
    .line 805
    .line 806
    const v23, 0x3c23d70a    # 0.01f

    .line 807
    .line 808
    .line 809
    const v24, -0x407d70a4    # -1.02f

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 813
    .line 814
    .line 815
    const v25, -0x3f7947ae    # -4.21f

    .line 816
    .line 817
    .line 818
    const v26, -0x3f7947ae    # -4.21f

    .line 819
    .line 820
    .line 821
    const v21, -0x401ae148    # -1.79f

    .line 822
    .line 823
    .line 824
    const v22, -0x408f5c29    # -0.94f

    .line 825
    .line 826
    .line 827
    const v23, -0x3faf5c29    # -3.26f

    .line 828
    .line 829
    .line 830
    const v24, -0x3fe51eb8    # -2.42f

    .line 831
    .line 832
    .line 833
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v25, 0x3ff1eb85    # 1.89f

    .line 837
    .line 838
    .line 839
    const v26, 0x4181ae14    # 16.21f

    .line 840
    .line 841
    .line 842
    const v21, 0x403a3d71    # 2.91f

    .line 843
    .line 844
    .line 845
    const v22, 0x4181999a    # 16.2f

    .line 846
    .line 847
    .line 848
    const v23, 0x40170a3d    # 2.36f

    .line 849
    .line 850
    .line 851
    const v24, 0x418028f6    # 16.02f

    .line 852
    .line 853
    .line 854
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 855
    .line 856
    .line 857
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    const/high16 v6, 0x3f800000    # 1.0f

    .line 865
    .line 866
    const/4 v7, 0x0

    .line 867
    const-string v4, ""

    .line 868
    .line 869
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 870
    .line 871
    .line 872
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 873
    .line 874
    .line 875
    move-result v3

    .line 876
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 877
    .line 878
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 879
    .line 880
    .line 881
    move-result-wide v6

    .line 882
    const/4 v0, 0x0

    .line 883
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 884
    .line 885
    .line 886
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 887
    .line 888
    .line 889
    move-result v10

    .line 890
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 891
    .line 892
    .line 893
    move-result v11

    .line 894
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 895
    .line 896
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 897
    .line 898
    .line 899
    const v0, 0x4181ae14    # 16.21f

    .line 900
    .line 901
    .line 902
    const v2, 0x41b0e148    # 22.11f

    .line 903
    .line 904
    .line 905
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const v17, 0x3fb33333    # 1.4f

    .line 912
    .line 913
    .line 914
    const/high16 v18, 0x3f000000    # 0.5f

    .line 915
    .line 916
    const v13, 0x3e6b851f    # 0.23f

    .line 917
    .line 918
    .line 919
    const v14, 0x3f0ccccd    # 0.55f

    .line 920
    .line 921
    .line 922
    const v15, 0x3f6147ae    # 0.88f

    .line 923
    .line 924
    .line 925
    const v16, 0x3f47ae14    # 0.78f

    .line 926
    .line 927
    .line 928
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    const/high16 v17, 0x40a00000    # 5.0f

    .line 932
    .line 933
    const/high16 v18, -0x3f600000    # -5.0f

    .line 934
    .line 935
    const v13, 0x4007ae14    # 2.12f

    .line 936
    .line 937
    .line 938
    const v14, -0x406f5c29    # -1.13f

    .line 939
    .line 940
    .line 941
    const v15, 0x4077ae14    # 3.87f

    .line 942
    .line 943
    .line 944
    const v16, -0x3fc851ec    # -2.87f

    .line 945
    .line 946
    .line 947
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 948
    .line 949
    .line 950
    const/high16 v17, -0x41000000    # -0.5f

    .line 951
    .line 952
    const v18, -0x404ccccd    # -1.4f

    .line 953
    .line 954
    .line 955
    const v13, 0x3e8f5c29    # 0.28f

    .line 956
    .line 957
    .line 958
    const v14, -0x40fae148    # -0.52f

    .line 959
    .line 960
    .line 961
    const v15, 0x3d23d70a    # 0.04f

    .line 962
    .line 963
    .line 964
    const v16, -0x406a3d71    # -1.17f

    .line 965
    .line 966
    .line 967
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 968
    .line 969
    .line 970
    const/4 v0, 0x0

    .line 971
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 972
    .line 973
    .line 974
    const/high16 v17, -0x40600000    # -1.25f

    .line 975
    .line 976
    const v18, 0x3edc28f6    # 0.43f

    .line 977
    .line 978
    .line 979
    const v13, -0x410f5c29    # -0.47f

    .line 980
    .line 981
    .line 982
    const v14, -0x41bd70a4    # -0.19f

    .line 983
    .line 984
    .line 985
    const v15, -0x407d70a4    # -1.02f

    .line 986
    .line 987
    .line 988
    const v16, -0x43dc28f6    # -0.01f

    .line 989
    .line 990
    .line 991
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 992
    .line 993
    .line 994
    const v17, -0x3f7947ae    # -4.21f

    .line 995
    .line 996
    .line 997
    const v18, 0x4086b852    # 4.21f

    .line 998
    .line 999
    .line 1000
    const v13, -0x408f5c29    # -0.94f

    .line 1001
    .line 1002
    .line 1003
    const v14, 0x3fe51eb8    # 1.79f

    .line 1004
    .line 1005
    .line 1006
    const v15, -0x3fe51eb8    # -2.42f

    .line 1007
    .line 1008
    .line 1009
    const v16, 0x4050a3d7    # 3.26f

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1013
    .line 1014
    .line 1015
    const v17, 0x4181ae14    # 16.21f

    .line 1016
    .line 1017
    .line 1018
    const v18, 0x41b0e148    # 22.11f

    .line 1019
    .line 1020
    .line 1021
    const v13, 0x4181999a    # 16.2f

    .line 1022
    .line 1023
    .line 1024
    const v14, 0x41a8b852    # 21.09f

    .line 1025
    .line 1026
    .line 1027
    const v15, 0x418028f6    # 16.02f

    .line 1028
    .line 1029
    .line 1030
    const v16, 0x41ad1eb8    # 21.64f

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v2

    .line 1043
    const/16 v16, 0x3800

    .line 1044
    .line 1045
    const/16 v17, 0x0

    .line 1046
    .line 1047
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1048
    .line 1049
    const/4 v7, 0x0

    .line 1050
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1051
    .line 1052
    const/4 v13, 0x0

    .line 1053
    const/4 v14, 0x0

    .line 1054
    const/4 v15, 0x0

    .line 1055
    const-string v4, ""

    .line 1056
    .line 1057
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    sput-object v0, Landroidx/compose/material/icons/rounded/SensorOccupiedKt;->_sensorOccupied:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1066
    .line 1067
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1068
    .line 1069
    .line 1070
    return-object v0
.end method

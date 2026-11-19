.class public final Landroidx/compose/material/icons/outlined/ShapeLineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_shapeLine",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ShapeLine",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getShapeLine",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nShapeLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeLine.kt\nandroidx/compose/material/icons/outlined/ShapeLineKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,83:1\n212#2,12:84\n233#2,18:97\n253#2:134\n233#2,18:135\n253#2:172\n233#2,18:173\n253#2:210\n174#3:96\n705#4,2:115\n717#4,2:117\n719#4,11:123\n705#4,2:153\n717#4,2:155\n719#4,11:161\n705#4,2:191\n717#4,2:193\n719#4,11:199\n72#5,4:119\n72#5,4:157\n72#5,4:195\n*S KotlinDebug\n*F\n+ 1 ShapeLine.kt\nandroidx/compose/material/icons/outlined/ShapeLineKt\n*L\n29#1:84,12\n30#1:97,18\n30#1:134\n44#1:135,18\n44#1:172\n62#1:173,18\n62#1:210\n29#1:96\n30#1:115,2\n30#1:117,2\n30#1:123,11\n44#1:153,2\n44#1:155,2\n44#1:161,11\n62#1:191,2\n62#1:193,2\n62#1:199,11\n30#1:119,4\n44#1:157,4\n62#1:195,4\n*E\n"
    }
.end annotation


# static fields
.field private static _shapeLine:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getShapeLine(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ShapeLineKt;->_shapeLine:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ShapeLine"

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
    const/high16 v6, 0x40c00000    # 6.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, 0x40a00000    # 5.0f

    .line 78
    .line 79
    const/high16 v26, -0x3f600000    # -5.0f

    .line 80
    .line 81
    const v21, 0x4030a3d7    # 2.76f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, 0x40a00000    # 5.0f

    .line 87
    .line 88
    const v24, -0x3ff0a3d7    # -2.24f

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
    const v4, 0x410c28f6    # 8.76f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x3f800000    # 1.0f

    .line 100
    .line 101
    const/high16 v7, 0x40c00000    # 6.0f

    .line 102
    .line 103
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v4, 0x404f5c29    # 3.24f

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v6, 0x41300000    # 11.0f

    .line 113
    .line 114
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x40c00000    # 6.0f

    .line 121
    .line 122
    const/high16 v6, 0x40400000    # 3.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v25, 0x40400000    # 3.0f

    .line 128
    .line 129
    const/high16 v26, 0x40400000    # 3.0f

    .line 130
    .line 131
    const v21, 0x3fd33333    # 1.65f

    .line 132
    .line 133
    .line 134
    const/high16 v23, 0x40400000    # 3.0f

    .line 135
    .line 136
    const v24, 0x3faccccd    # 1.35f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v25, -0x3fc00000    # -3.0f

    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    const v22, 0x3fd33333    # 1.65f

    .line 147
    .line 148
    .line 149
    const v23, -0x40533333    # -1.35f

    .line 150
    .line 151
    .line 152
    const/high16 v24, 0x40400000    # 3.0f

    .line 153
    .line 154
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, 0x40f4cccd    # 7.65f

    .line 158
    .line 159
    .line 160
    const/high16 v6, 0x40c00000    # 6.0f

    .line 161
    .line 162
    const/high16 v7, 0x40400000    # 3.0f

    .line 163
    .line 164
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v25, 0x40c00000    # 6.0f

    .line 168
    .line 169
    const/high16 v21, 0x40400000    # 3.0f

    .line 170
    .line 171
    const v22, 0x408b3333    # 4.35f

    .line 172
    .line 173
    .line 174
    const v23, 0x408b3333    # 4.35f

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const/16 v16, 0x3800

    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    .line 191
    const/high16 v6, 0x3f800000    # 1.0f

    .line 192
    .line 193
    const/high16 v8, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/4 v7, 0x0

    .line 196
    const/high16 v9, 0x3f800000    # 1.0f

    .line 197
    .line 198
    const/high16 v12, 0x3f800000    # 1.0f

    .line 199
    .line 200
    const/4 v13, 0x0

    .line 201
    const/4 v14, 0x0

    .line 202
    const/4 v15, 0x0

    .line 203
    const-string v4, ""

    .line 204
    .line 205
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 206
    .line 207
    .line 208
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 213
    .line 214
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 215
    .line 216
    .line 217
    move-result-wide v6

    .line 218
    const/4 v2, 0x0

    .line 219
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const/high16 v4, 0x41600000    # 14.0f

    .line 236
    .line 237
    const/high16 v6, 0x41a80000    # 21.0f

    .line 238
    .line 239
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v4, -0x3f600000    # -5.0f

    .line 243
    .line 244
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const/high16 v25, -0x40000000    # -2.0f

    .line 248
    .line 249
    const/high16 v26, 0x40000000    # 2.0f

    .line 250
    .line 251
    const v21, -0x40733333    # -1.1f

    .line 252
    .line 253
    .line 254
    const/16 v22, 0x0

    .line 255
    .line 256
    const/high16 v23, -0x40000000    # -2.0f

    .line 257
    .line 258
    const v24, 0x3f666666    # 0.9f

    .line 259
    .line 260
    .line 261
    move-object/from16 v20, v2

    .line 262
    .line 263
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, 0x40a00000    # 5.0f

    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const/high16 v25, 0x40000000    # 2.0f

    .line 272
    .line 273
    const/16 v21, 0x0

    .line 274
    .line 275
    const v22, 0x3f8ccccd    # 1.1f

    .line 276
    .line 277
    .line 278
    const v23, 0x3f666666    # 0.9f

    .line 279
    .line 280
    .line 281
    const/high16 v24, 0x40000000    # 2.0f

    .line 282
    .line 283
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v26, -0x40000000    # -2.0f

    .line 290
    .line 291
    const v21, 0x3f8ccccd    # 1.1f

    .line 292
    .line 293
    .line 294
    const/16 v22, 0x0

    .line 295
    .line 296
    const/high16 v23, 0x40000000    # 2.0f

    .line 297
    .line 298
    const v24, -0x4099999a    # -0.9f

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v4, -0x3f600000    # -5.0f

    .line 305
    .line 306
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v25, 0x41a80000    # 21.0f

    .line 310
    .line 311
    const/high16 v26, 0x41600000    # 14.0f

    .line 312
    .line 313
    const/high16 v21, 0x41b80000    # 23.0f

    .line 314
    .line 315
    const v22, 0x416e6666    # 14.9f

    .line 316
    .line 317
    .line 318
    const v23, 0x41b0cccd    # 22.1f

    .line 319
    .line 320
    .line 321
    const/high16 v24, 0x41600000    # 14.0f

    .line 322
    .line 323
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v4, 0x41a80000    # 21.0f

    .line 330
    .line 331
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v4, -0x3f600000    # -5.0f

    .line 335
    .line 336
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const/high16 v4, 0x40a00000    # 5.0f

    .line 343
    .line 344
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v4, 0x41a80000    # 21.0f

    .line 348
    .line 349
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    const/high16 v6, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/4 v7, 0x0

    .line 362
    const-string v4, ""

    .line 363
    .line 364
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 365
    .line 366
    .line 367
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 372
    .line 373
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 374
    .line 375
    .line 376
    move-result-wide v6

    .line 377
    const/4 v0, 0x0

    .line 378
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 386
    .line 387
    .line 388
    move-result v11

    .line 389
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 390
    .line 391
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    const v0, 0x40f66666    # 7.7f

    .line 395
    .line 396
    .line 397
    const v2, 0x418dae14    # 17.71f

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 401
    .line 402
    .line 403
    const/high16 v17, 0x41980000    # 19.0f

    .line 404
    .line 405
    const/high16 v18, 0x41000000    # 8.0f

    .line 406
    .line 407
    const v13, 0x4190e148    # 18.11f

    .line 408
    .line 409
    .line 410
    const v14, 0x40fc7ae1    # 7.89f

    .line 411
    .line 412
    .line 413
    const v15, 0x419451ec    # 18.54f

    .line 414
    .line 415
    .line 416
    const/high16 v16, 0x41000000    # 8.0f

    .line 417
    .line 418
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 419
    .line 420
    .line 421
    const/high16 v17, 0x40400000    # 3.0f

    .line 422
    .line 423
    const/high16 v18, -0x3fc00000    # -3.0f

    .line 424
    .line 425
    const v13, 0x3fd33333    # 1.65f

    .line 426
    .line 427
    .line 428
    const/4 v14, 0x0

    .line 429
    const/high16 v15, 0x40400000    # 3.0f

    .line 430
    .line 431
    const v16, -0x40533333    # -1.35f

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const v0, -0x40533333    # -1.35f

    .line 438
    .line 439
    .line 440
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 441
    .line 442
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v0, 0x3faccccd    # 1.35f

    .line 446
    .line 447
    .line 448
    const/high16 v4, 0x40400000    # 3.0f

    .line 449
    .line 450
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 451
    .line 452
    .line 453
    const v17, 0x3e99999a    # 0.3f

    .line 454
    .line 455
    .line 456
    const v18, 0x3fa51eb8    # 1.29f

    .line 457
    .line 458
    .line 459
    const/4 v13, 0x0

    .line 460
    const v14, 0x3eeb851f    # 0.46f

    .line 461
    .line 462
    .line 463
    const v15, 0x3de147ae    # 0.11f

    .line 464
    .line 465
    .line 466
    const v16, 0x3f63d70a    # 0.89f

    .line 467
    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v0, 0x40c947ae    # 6.29f

    .line 473
    .line 474
    .line 475
    const v2, 0x41826666    # 16.3f

    .line 476
    .line 477
    .line 478
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 479
    .line 480
    .line 481
    const/high16 v17, 0x40a00000    # 5.0f

    .line 482
    .line 483
    const/high16 v18, 0x41800000    # 16.0f

    .line 484
    .line 485
    const v13, 0x40bc7ae1    # 5.89f

    .line 486
    .line 487
    .line 488
    const v14, 0x4180e148    # 16.11f

    .line 489
    .line 490
    .line 491
    const v15, 0x40aeb852    # 5.46f

    .line 492
    .line 493
    .line 494
    const/high16 v16, 0x41800000    # 16.0f

    .line 495
    .line 496
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    const/high16 v17, -0x3fc00000    # -3.0f

    .line 500
    .line 501
    const/high16 v18, 0x40400000    # 3.0f

    .line 502
    .line 503
    const v13, -0x402ccccd    # -1.65f

    .line 504
    .line 505
    .line 506
    const/4 v14, 0x0

    .line 507
    const/high16 v15, -0x3fc00000    # -3.0f

    .line 508
    .line 509
    const v16, 0x3faccccd    # 1.35f

    .line 510
    .line 511
    .line 512
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const v0, 0x3faccccd    # 1.35f

    .line 516
    .line 517
    .line 518
    const/high16 v2, 0x40400000    # 3.0f

    .line 519
    .line 520
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 521
    .line 522
    .line 523
    const v0, -0x40533333    # -1.35f

    .line 524
    .line 525
    .line 526
    const/high16 v2, -0x3fc00000    # -3.0f

    .line 527
    .line 528
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v17, -0x41666666    # -0.3f

    .line 532
    .line 533
    .line 534
    const v18, -0x405ae148    # -1.29f

    .line 535
    .line 536
    .line 537
    const/4 v13, 0x0

    .line 538
    const v14, -0x41147ae1    # -0.46f

    .line 539
    .line 540
    .line 541
    const v15, -0x421eb852    # -0.11f

    .line 542
    .line 543
    .line 544
    const v16, -0x409c28f6    # -0.89f

    .line 545
    .line 546
    .line 547
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 548
    .line 549
    .line 550
    const v0, 0x40f66666    # 7.7f

    .line 551
    .line 552
    .line 553
    const v2, 0x418dae14    # 17.71f

    .line 554
    .line 555
    .line 556
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    const/16 v16, 0x3800

    .line 567
    .line 568
    const/16 v17, 0x0

    .line 569
    .line 570
    const/high16 v6, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v7, 0x0

    .line 573
    const/high16 v12, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/4 v14, 0x0

    .line 576
    const/4 v15, 0x0

    .line 577
    const-string v4, ""

    .line 578
    .line 579
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    sput-object v0, Landroidx/compose/material/icons/outlined/ShapeLineKt;->_shapeLine:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 588
    .line 589
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    return-object v0
.end method

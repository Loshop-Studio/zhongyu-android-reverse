.class public final Landroidx/compose/material/icons/outlined/LocationOnKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_locationOn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "LocationOn",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getLocationOn",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-core_release"
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
        "SMAP\nLocationOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/outlined/LocationOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,55:1\n122#2:56\n116#2,3:57\n119#2,3:61\n132#2,18:64\n152#2:101\n132#2,18:102\n152#2:139\n175#3:60\n694#4,2:82\n706#4,2:84\n708#4,11:90\n694#4,2:120\n706#4,2:122\n708#4,11:128\n53#5,4:86\n53#5,4:124\n*S KotlinDebug\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/outlined/LocationOnKt\n*L\n29#1:56\n29#1:57,3\n29#1:61,3\n30#1:64,18\n30#1:101\n44#1:102,18\n44#1:139\n29#1:60\n30#1:82,2\n30#1:84,2\n30#1:90,11\n44#1:120,2\n44#1:122,2\n44#1:128,11\n30#1:86,4\n44#1:124,4\n*E\n"
    }
.end annotation


# static fields
.field private static _locationOn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getLocationOn(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 47

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material/icons/outlined/LocationOnKt;->_locationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string v2, "Outlined.LocationOn"

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 19
    .line 20
    move-object/from16 v30, v1

    .line 21
    .line 22
    move-object v13, v1

    .line 23
    const/high16 v0, 0x41c00000    # 24.0f

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/high16 v5, 0x41c00000    # 24.0f

    .line 34
    .line 35
    const/high16 v6, 0x41c00000    # 24.0f

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/16 v11, 0xe0

    .line 42
    .line 43
    const/4 v12, 0x0

    .line 44
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    .line 46
    .line 47
    const/high16 v18, 0x3f800000    # 1.0f

    .line 48
    .line 49
    const/high16 v20, 0x3f800000    # 1.0f

    .line 50
    .line 51
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 52
    .line 53
    .line 54
    move-result v15

    .line 55
    new-instance v0, Landroidx/compose/ui/graphics/SolidColor;

    .line 56
    .line 57
    move-object/from16 v17, v0

    .line 58
    .line 59
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-direct {v0, v2, v3, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 67
    .line 68
    .line 69
    const/16 v19, 0x0

    .line 70
    .line 71
    const/high16 v21, 0x3f800000    # 1.0f

    .line 72
    .line 73
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 76
    .line 77
    .line 78
    move-result v22

    .line 79
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 80
    .line 81
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 82
    .line 83
    .line 84
    move-result v23

    .line 85
    const/high16 v24, 0x3f800000    # 1.0f

    .line 86
    .line 87
    const-string v16, ""

    .line 88
    .line 89
    new-instance v3, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    invoke-direct {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const/high16 v5, 0x40000000    # 2.0f

    .line 95
    .line 96
    const/high16 v12, 0x41400000    # 12.0f

    .line 97
    .line 98
    invoke-virtual {v3, v12, v5}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v6, 0x4102147b    # 8.13f

    .line 102
    .line 103
    .line 104
    const/high16 v7, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v8, 0x40a00000    # 5.0f

    .line 107
    .line 108
    const v9, 0x40a428f6    # 5.13f

    .line 109
    .line 110
    .line 111
    const/high16 v10, 0x40a00000    # 5.0f

    .line 112
    .line 113
    const/high16 v11, 0x41100000    # 9.0f

    .line 114
    .line 115
    move-object v5, v3

    .line 116
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/4 v6, 0x0

    .line 120
    const/high16 v7, 0x40a80000    # 5.25f

    .line 121
    .line 122
    const/high16 v8, 0x40e00000    # 7.0f

    .line 123
    .line 124
    const/high16 v9, 0x41500000    # 13.0f

    .line 125
    .line 126
    const/high16 v10, 0x40e00000    # 7.0f

    .line 127
    .line 128
    const/high16 v11, 0x41500000    # 13.0f

    .line 129
    .line 130
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v5, -0x3f080000    # -7.75f

    .line 134
    .line 135
    const/high16 v6, -0x3eb00000    # -13.0f

    .line 136
    .line 137
    const/high16 v14, 0x40e00000    # 7.0f

    .line 138
    .line 139
    invoke-virtual {v3, v14, v5, v14, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    const v7, -0x3f8851ec    # -3.87f

    .line 144
    .line 145
    .line 146
    const v8, -0x3fb7ae14    # -3.13f

    .line 147
    .line 148
    .line 149
    const/high16 v9, -0x3f200000    # -7.0f

    .line 150
    .line 151
    const/high16 v10, -0x3f200000    # -7.0f

    .line 152
    .line 153
    const/high16 v11, -0x3f200000    # -7.0f

    .line 154
    .line 155
    move-object v5, v3

    .line 156
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const/high16 v11, 0x41100000    # 9.0f

    .line 163
    .line 164
    invoke-virtual {v3, v14, v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v7, -0x3fcf5c29    # -2.76f

    .line 168
    .line 169
    .line 170
    const v8, 0x400f5c29    # 2.24f

    .line 171
    .line 172
    .line 173
    const/high16 v9, -0x3f600000    # -5.0f

    .line 174
    .line 175
    const/high16 v10, 0x40a00000    # 5.0f

    .line 176
    .line 177
    const/high16 v14, -0x3f600000    # -5.0f

    .line 178
    .line 179
    move v11, v14

    .line 180
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v5, 0x400f5c29    # 2.24f

    .line 184
    .line 185
    .line 186
    const/high16 v6, 0x40a00000    # 5.0f

    .line 187
    .line 188
    invoke-virtual {v3, v6, v5, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const/4 v6, 0x0

    .line 192
    const v7, 0x403851ec    # 2.88f

    .line 193
    .line 194
    .line 195
    const v8, -0x3fc7ae14    # -2.88f

    .line 196
    .line 197
    .line 198
    const v9, 0x40e6147b    # 7.19f

    .line 199
    .line 200
    .line 201
    const/high16 v10, -0x3f600000    # -5.0f

    .line 202
    .line 203
    const v11, 0x411e147b    # 9.88f

    .line 204
    .line 205
    .line 206
    move-object v5, v3

    .line 207
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const v6, 0x411eb852    # 9.92f

    .line 211
    .line 212
    .line 213
    const v7, 0x4181ae14    # 16.21f

    .line 214
    .line 215
    .line 216
    const/high16 v8, 0x40e00000    # 7.0f

    .line 217
    .line 218
    const v9, 0x413d999a    # 11.85f

    .line 219
    .line 220
    .line 221
    const/high16 v10, 0x40e00000    # 7.0f

    .line 222
    .line 223
    const/high16 v11, 0x41100000    # 9.0f

    .line 224
    .line 225
    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v14

    .line 235
    const/16 v25, 0x0

    .line 236
    .line 237
    const/16 v26, 0x0

    .line 238
    .line 239
    const/16 v27, 0x0

    .line 240
    .line 241
    const/16 v28, 0x3800

    .line 242
    .line 243
    const/16 v29, 0x0

    .line 244
    .line 245
    invoke-static/range {v13 .. v29}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 246
    .line 247
    .line 248
    const/high16 v35, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/high16 v37, 0x3f800000    # 1.0f

    .line 251
    .line 252
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 253
    .line 254
    .line 255
    move-result v32

    .line 256
    new-instance v3, Landroidx/compose/ui/graphics/SolidColor;

    .line 257
    .line 258
    move-object/from16 v34, v3

    .line 259
    .line 260
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 261
    .line 262
    .line 263
    move-result-wide v5

    .line 264
    invoke-direct {v3, v5, v6, v4}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 265
    .line 266
    .line 267
    const/16 v36, 0x0

    .line 268
    .line 269
    const/high16 v38, 0x3f800000    # 1.0f

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 272
    .line 273
    .line 274
    move-result v39

    .line 275
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 276
    .line 277
    .line 278
    move-result v40

    .line 279
    const/high16 v41, 0x3f800000    # 1.0f

    .line 280
    .line 281
    const-string v33, ""

    .line 282
    .line 283
    new-instance v8, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    invoke-direct {v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    const/high16 v0, 0x41100000    # 9.0f

    .line 289
    .line 290
    invoke-virtual {v8, v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 294
    .line 295
    const/4 v1, 0x0

    .line 296
    invoke-virtual {v8, v0, v1}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const/high16 v1, 0x40200000    # 2.5f

    .line 300
    .line 301
    const/high16 v2, 0x40200000    # 2.5f

    .line 302
    .line 303
    const/4 v3, 0x0

    .line 304
    const/4 v4, 0x1

    .line 305
    const/4 v5, 0x1

    .line 306
    const/high16 v6, 0x40a00000    # 5.0f

    .line 307
    .line 308
    const/4 v7, 0x0

    .line 309
    move-object v0, v8

    .line 310
    invoke-virtual/range {v0 .. v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 311
    .line 312
    .line 313
    const/high16 v6, -0x3f600000    # -5.0f

    .line 314
    .line 315
    invoke-virtual/range {v0 .. v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v31

    .line 322
    const/16 v42, 0x0

    .line 323
    .line 324
    const/16 v43, 0x0

    .line 325
    .line 326
    const/16 v44, 0x0

    .line 327
    .line 328
    const/16 v45, 0x3800

    .line 329
    .line 330
    const/16 v46, 0x0

    .line 331
    .line 332
    invoke-static/range {v30 .. v46}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    sput-object v0, Landroidx/compose/material/icons/outlined/LocationOnKt;->_locationOn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 341
    .line 342
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    return-object v0
.end method

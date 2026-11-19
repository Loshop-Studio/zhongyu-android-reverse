.class public final Landroidx/compose/material/icons/filled/Woman2Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_woman2",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Woman2",
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getWoman2",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nWoman2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Woman2.kt\nandroidx/compose/material/icons/filled/Woman2Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,54:1\n212#2,12:55\n233#2,18:68\n253#2:105\n233#2,18:106\n253#2:143\n174#3:67\n705#4,2:86\n717#4,2:88\n719#4,11:94\n705#4,2:124\n717#4,2:126\n719#4,11:132\n72#5,4:90\n72#5,4:128\n*S KotlinDebug\n*F\n+ 1 Woman2.kt\nandroidx/compose/material/icons/filled/Woman2Kt\n*L\n29#1:55,12\n30#1:68,18\n30#1:105\n43#1:106,18\n43#1:143\n29#1:67\n30#1:86,2\n30#1:88,2\n30#1:94,11\n43#1:124,2\n43#1:126,2\n43#1:132,11\n30#1:90,4\n43#1:128,4\n*E\n"
    }
.end annotation


# static fields
.field private static _woman2:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWoman2(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/Woman2Kt;->_woman2:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Woman2"

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
    new-instance v4, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v6, 0x415f0a3d    # 13.94f

    .line 71
    .line 72
    .line 73
    const v7, 0x4104f5c3    # 8.31f

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
    const/high16 v26, 0x40e00000    # 7.0f

    .line 82
    .line 83
    const v21, 0x4159eb85    # 13.62f

    .line 84
    .line 85
    .line 86
    const v22, 0x40f0a3d7    # 7.52f

    .line 87
    .line 88
    .line 89
    const v23, 0x414d999a    # 12.85f

    .line 90
    .line 91
    .line 92
    const/high16 v24, 0x40e00000    # 7.0f

    .line 93
    .line 94
    move-object/from16 v20, v4

    .line 95
    .line 96
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v8, -0x4007ae14    # -1.94f

    .line 100
    .line 101
    .line 102
    const v9, 0x3fa7ae14    # 1.31f

    .line 103
    .line 104
    .line 105
    const v12, -0x4030a3d7    # -1.62f

    .line 106
    .line 107
    .line 108
    const v13, 0x3f051eb8    # 0.52f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v12, v13, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v8, 0x40e00000    # 7.0f

    .line 115
    .line 116
    const/high16 v9, 0x41800000    # 16.0f

    .line 117
    .line 118
    invoke-virtual {v4, v8, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v8, 0x40600000    # 3.5f

    .line 122
    .line 123
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v8, 0x40c00000    # 6.0f

    .line 127
    .line 128
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v8, 0x40400000    # 3.0f

    .line 132
    .line 133
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v8, -0x3f400000    # -6.0f

    .line 137
    .line 138
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const/high16 v8, 0x41880000    # 17.0f

    .line 142
    .line 143
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    const/16 v16, 0x3800

    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    .line 160
    move-object v6, v2

    .line 161
    move-object v2, v4

    .line 162
    const-string v4, ""

    .line 163
    .line 164
    move-object v7, v6

    .line 165
    const/high16 v6, 0x3f800000    # 1.0f

    .line 166
    .line 167
    move-object v8, v7

    .line 168
    const/4 v7, 0x0

    .line 169
    move-object v9, v8

    .line 170
    const/high16 v8, 0x3f800000    # 1.0f

    .line 171
    .line 172
    move-object v12, v9

    .line 173
    const/high16 v9, 0x3f800000    # 1.0f

    .line 174
    .line 175
    move-object v13, v12

    .line 176
    const/high16 v12, 0x3f800000    # 1.0f

    .line 177
    .line 178
    move-object v14, v13

    .line 179
    const/4 v13, 0x0

    .line 180
    move-object v15, v14

    .line 181
    const/4 v14, 0x0

    .line 182
    move-object/from16 v20, v15

    .line 183
    .line 184
    const/4 v15, 0x0

    .line 185
    move-object/from16 p0, v0

    .line 186
    .line 187
    move-object/from16 v0, v20

    .line 188
    .line 189
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 190
    .line 191
    .line 192
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 197
    .line 198
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 199
    .line 200
    .line 201
    move-result-wide v6

    .line 202
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const/high16 v0, 0x41400000    # 12.0f

    .line 219
    .line 220
    const/high16 v2, 0x40800000    # 4.0f

    .line 221
    .line 222
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    const/high16 v0, -0x40000000    # -2.0f

    .line 226
    .line 227
    const/4 v2, 0x0

    .line 228
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const/high16 v18, 0x40800000    # 4.0f

    .line 232
    .line 233
    const/16 v19, 0x0

    .line 234
    .line 235
    const/high16 v13, 0x40000000    # 2.0f

    .line 236
    .line 237
    const/high16 v14, 0x40000000    # 2.0f

    .line 238
    .line 239
    const/16 v16, 0x1

    .line 240
    .line 241
    const/16 v17, 0x1

    .line 242
    .line 243
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const/high16 v18, -0x3f800000    # -4.0f

    .line 247
    .line 248
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    const/16 v16, 0x3800

    .line 256
    .line 257
    const/16 v17, 0x0

    .line 258
    .line 259
    const-string v4, ""

    .line 260
    .line 261
    const/high16 v6, 0x3f800000    # 1.0f

    .line 262
    .line 263
    const/4 v7, 0x0

    .line 264
    const/high16 v12, 0x3f800000    # 1.0f

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const/4 v14, 0x0

    .line 268
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    sput-object v0, Landroidx/compose/material/icons/filled/Woman2Kt;->_woman2:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 277
    .line 278
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    return-object v0
.end method

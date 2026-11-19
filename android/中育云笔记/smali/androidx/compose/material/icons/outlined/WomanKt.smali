.class public final Landroidx/compose/material/icons/outlined/WomanKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _woman:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWoman(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/WomanKt;->_woman:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Woman"

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
    const/high16 v8, 0x40400000    # 3.0f

    .line 122
    .line 123
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v9, 0x40c00000    # 6.0f

    .line 127
    .line 128
    invoke-virtual {v4, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const/high16 v9, 0x40800000    # 4.0f

    .line 132
    .line 133
    invoke-virtual {v4, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const/high16 v12, -0x3f400000    # -6.0f

    .line 137
    .line 138
    invoke-virtual {v4, v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    const/16 v16, 0x3800

    .line 155
    .line 156
    const/16 v17, 0x0

    .line 157
    .line 158
    move-object v6, v2

    .line 159
    move-object v2, v4

    .line 160
    const-string v4, ""

    .line 161
    .line 162
    move-object v7, v6

    .line 163
    const/high16 v6, 0x3f800000    # 1.0f

    .line 164
    .line 165
    move-object v8, v7

    .line 166
    const/4 v7, 0x0

    .line 167
    move-object v12, v8

    .line 168
    const/high16 v8, 0x3f800000    # 1.0f

    .line 169
    .line 170
    move v13, v9

    .line 171
    const/high16 v9, 0x3f800000    # 1.0f

    .line 172
    .line 173
    move-object v14, v12

    .line 174
    const/high16 v12, 0x3f800000    # 1.0f

    .line 175
    .line 176
    move v15, v13

    .line 177
    const/4 v13, 0x0

    .line 178
    move-object/from16 v20, v14

    .line 179
    .line 180
    const/4 v14, 0x0

    .line 181
    move/from16 v21, v15

    .line 182
    .line 183
    const/4 v15, 0x0

    .line 184
    move-object/from16 p0, v0

    .line 185
    .line 186
    move-object/from16 v0, v20

    .line 187
    .line 188
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 196
    .line 197
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 198
    .line 199
    .line 200
    move-result-wide v6

    .line 201
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 205
    .line 206
    .line 207
    move-result v10

    .line 208
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const/high16 v0, 0x41400000    # 12.0f

    .line 218
    .line 219
    const/high16 v15, 0x40800000    # 4.0f

    .line 220
    .line 221
    invoke-virtual {v12, v0, v15}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const/high16 v0, -0x40000000    # -2.0f

    .line 225
    .line 226
    const/4 v2, 0x0

    .line 227
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v18, 0x40800000    # 4.0f

    .line 231
    .line 232
    const/16 v19, 0x0

    .line 233
    .line 234
    const/high16 v13, 0x40000000    # 2.0f

    .line 235
    .line 236
    const/high16 v14, 0x40000000    # 2.0f

    .line 237
    .line 238
    const/4 v15, 0x0

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
    sput-object v0, Landroidx/compose/material/icons/outlined/WomanKt;->_woman:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 277
    .line 278
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    return-object v0
.end method

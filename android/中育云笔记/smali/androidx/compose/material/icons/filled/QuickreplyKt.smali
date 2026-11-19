.class public final Landroidx/compose/material/icons/filled/QuickreplyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _quickreply:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getQuickreply(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/QuickreplyKt;->_quickreply:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.Quickreply"

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
    const/high16 v6, 0x41b00000    # 22.0f

    .line 71
    .line 72
    const/high16 v7, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x40000000    # -2.0f

    .line 78
    .line 79
    const/high16 v26, -0x40000000    # -2.0f

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const v22, -0x40733333    # -1.1f

    .line 84
    .line 85
    .line 86
    const v23, -0x4099999a    # -0.9f

    .line 87
    .line 88
    .line 89
    const/high16 v24, -0x40000000    # -2.0f

    .line 90
    .line 91
    move-object/from16 v20, v4

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const v25, 0x4000a3d7    # 2.01f

    .line 100
    .line 101
    .line 102
    const/high16 v26, 0x40800000    # 4.0f

    .line 103
    .line 104
    const v21, 0x4039999a    # 2.9f

    .line 105
    .line 106
    .line 107
    const/high16 v22, 0x40000000    # 2.0f

    .line 108
    .line 109
    const v23, 0x4000a3d7    # 2.01f

    .line 110
    .line 111
    .line 112
    const v24, 0x4039999a    # 2.9f

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v8, 0x40000000    # 2.0f

    .line 119
    .line 120
    invoke-virtual {v4, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v6, -0x3f800000    # -4.0f

    .line 124
    .line 125
    invoke-virtual {v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v9, 0x41100000    # 9.0f

    .line 129
    .line 130
    invoke-virtual {v4, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v9, -0x3f000000    # -8.0f

    .line 134
    .line 135
    invoke-virtual {v4, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v9, 0x40e00000    # 7.0f

    .line 139
    .line 140
    invoke-virtual {v4, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    const/16 v16, 0x3800

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    move-object v7, v2

    .line 158
    move-object v2, v4

    .line 159
    const-string v4, ""

    .line 160
    .line 161
    move v9, v6

    .line 162
    const/high16 v6, 0x3f800000    # 1.0f

    .line 163
    .line 164
    move-object v12, v7

    .line 165
    const/4 v7, 0x0

    .line 166
    move v13, v8

    .line 167
    const/high16 v8, 0x3f800000    # 1.0f

    .line 168
    .line 169
    move v14, v9

    .line 170
    const/high16 v9, 0x3f800000    # 1.0f

    .line 171
    .line 172
    move-object v15, v12

    .line 173
    const/high16 v12, 0x3f800000    # 1.0f

    .line 174
    .line 175
    move/from16 v20, v13

    .line 176
    .line 177
    const/4 v13, 0x0

    .line 178
    move/from16 v21, v14

    .line 179
    .line 180
    const/4 v14, 0x0

    .line 181
    move-object/from16 v22, v15

    .line 182
    .line 183
    const/4 v15, 0x0

    .line 184
    move-object/from16 p0, v0

    .line 185
    .line 186
    move-object/from16 v0, v22

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
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const/high16 v2, 0x41b40000    # 22.5f

    .line 218
    .line 219
    const/high16 v4, 0x41800000    # 16.0f

    .line 220
    .line 221
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v2, -0x3ff33333    # -2.2f

    .line 225
    .line 226
    .line 227
    const/4 v4, 0x0

    .line 228
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 229
    .line 230
    .line 231
    const v2, 0x3fd9999a    # 1.7f

    .line 232
    .line 233
    .line 234
    const/high16 v9, -0x3f800000    # -4.0f

    .line 235
    .line 236
    invoke-virtual {v0, v2, v9}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const/high16 v2, -0x3f600000    # -5.0f

    .line 240
    .line 241
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v2, 0x40c00000    # 6.0f

    .line 245
    .line 246
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const/high16 v13, 0x40000000    # 2.0f

    .line 250
    .line 251
    invoke-virtual {v0, v13, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v2, 0x40a00000    # 5.0f

    .line 255
    .line 256
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    const-string v4, ""

    .line 267
    .line 268
    const/high16 v6, 0x3f800000    # 1.0f

    .line 269
    .line 270
    const/4 v7, 0x0

    .line 271
    const/high16 v9, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    sput-object v0, Landroidx/compose/material/icons/filled/QuickreplyKt;->_quickreply:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 283
    .line 284
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    return-object v0
.end method

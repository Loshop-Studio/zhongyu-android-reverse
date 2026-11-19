.class public final Landroidx/compose/material/icons/outlined/OpacityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _opacity:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getOpacity(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/OpacityKt;->_opacity:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Opacity"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x418d47ae    # 17.66f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41000000    # 8.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x41400000    # 12.0f

    .line 79
    .line 80
    const v6, 0x40166666    # 2.35f

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 84
    .line 85
    .line 86
    const v7, 0x40cae148    # 6.34f

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v7, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v17, 0x40800000    # 4.0f

    .line 93
    .line 94
    const v18, 0x415a3d71    # 13.64f

    .line 95
    .line 96
    .line 97
    const v13, 0x4098f5c3    # 4.78f

    .line 98
    .line 99
    .line 100
    const v14, 0x4118f5c3    # 9.56f

    .line 101
    .line 102
    .line 103
    const/high16 v15, 0x40800000    # 4.0f

    .line 104
    .line 105
    const v16, 0x413a3d71    # 11.64f

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 109
    .line 110
    .line 111
    const v7, 0x4015c28f    # 2.34f

    .line 112
    .line 113
    .line 114
    const v8, 0x40b570a4    # 5.67f

    .line 115
    .line 116
    .line 117
    const v9, 0x3f47ae14    # 0.78f

    .line 118
    .line 119
    .line 120
    const v13, 0x4083851f    # 4.11f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v9, v13, v7, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v7, 0x40670a3d    # 3.61f

    .line 127
    .line 128
    .line 129
    const v8, 0x40b51eb8    # 5.66f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12, v7, v6, v8, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const v6, -0x40b5c28f    # -0.79f

    .line 136
    .line 137
    .line 138
    const v7, -0x3fe9999a    # -2.35f

    .line 139
    .line 140
    .line 141
    const v9, 0x40833333    # 4.1f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v9, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v6, 0x417a3d71    # 15.64f

    .line 148
    .line 149
    .line 150
    const v7, 0x415a3d71    # 13.64f

    .line 151
    .line 152
    .line 153
    const/high16 v8, 0x41a00000    # 20.0f

    .line 154
    .line 155
    invoke-virtual {v12, v8, v6, v8, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v6, 0x4199c28f    # 19.22f

    .line 159
    .line 160
    .line 161
    const v7, 0x4118f5c3    # 9.56f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v6, v7, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const/high16 v0, 0x41600000    # 14.0f

    .line 171
    .line 172
    const/high16 v2, 0x40c00000    # 6.0f

    .line 173
    .line 174
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v17, 0x3fe147ae    # 1.76f

    .line 178
    .line 179
    .line 180
    const v18, -0x3f733333    # -4.4f

    .line 181
    .line 182
    .line 183
    const v13, 0x3c23d70a    # 0.01f

    .line 184
    .line 185
    .line 186
    const/high16 v14, -0x40000000    # -2.0f

    .line 187
    .line 188
    const v15, 0x3f1eb852    # 0.62f

    .line 189
    .line 190
    .line 191
    const v16, -0x3faeb852    # -3.27f

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v0, 0x40a8a3d7    # 5.27f

    .line 198
    .line 199
    .line 200
    invoke-virtual {v12, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 201
    .line 202
    .line 203
    const v0, 0x4087ae14    # 4.24f

    .line 204
    .line 205
    .line 206
    const v4, 0x408c28f6    # 4.38f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, 0x41900000    # 18.0f

    .line 213
    .line 214
    const/high16 v18, 0x41600000    # 14.0f

    .line 215
    .line 216
    const v13, 0x418b0a3d    # 17.38f

    .line 217
    .line 218
    .line 219
    const v14, 0x412c51ec    # 10.77f

    .line 220
    .line 221
    .line 222
    const v15, 0x418feb85    # 17.99f

    .line 223
    .line 224
    .line 225
    const/high16 v16, 0x41400000    # 12.0f

    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    const/16 v16, 0x3800

    .line 241
    .line 242
    const/16 v17, 0x0

    .line 243
    .line 244
    const-string v4, ""

    .line 245
    .line 246
    const/high16 v6, 0x3f800000    # 1.0f

    .line 247
    .line 248
    const/4 v7, 0x0

    .line 249
    const/high16 v8, 0x3f800000    # 1.0f

    .line 250
    .line 251
    const/high16 v9, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/high16 v12, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/4 v13, 0x0

    .line 256
    const/4 v14, 0x0

    .line 257
    const/4 v15, 0x0

    .line 258
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    sput-object v0, Landroidx/compose/material/icons/outlined/OpacityKt;->_opacity:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 267
    .line 268
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    return-object v0
.end method

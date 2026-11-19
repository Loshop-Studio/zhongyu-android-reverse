.class public final Landroidx/compose/material/icons/twotone/PanoramaVerticalSelectKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _panoramaVerticalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaVerticalSelect(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PanoramaVerticalSelectKt;->_panoramaVerticalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PanoramaVerticalSelect"

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
    const/high16 v0, 0x41940000    # 18.5f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x3fb70a3d    # 1.43f

    .line 78
    .line 79
    .line 80
    const v18, -0x3ef4f5c3    # -8.69f

    .line 81
    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const v14, -0x3f870a3d    # -3.89f

    .line 85
    .line 86
    .line 87
    const v15, 0x3f570a3d    # 0.84f

    .line 88
    .line 89
    .line 90
    const v16, -0x3f21999a    # -6.95f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v17, 0x4197d70a    # 18.98f

    .line 97
    .line 98
    .line 99
    const/high16 v18, 0x40000000    # 2.0f

    .line 100
    .line 101
    const v13, 0x41a13333    # 20.15f

    .line 102
    .line 103
    .line 104
    const v14, 0x402ae148    # 2.67f

    .line 105
    .line 106
    .line 107
    const v15, 0x419d5c29    # 19.67f

    .line 108
    .line 109
    .line 110
    const/high16 v16, 0x40000000    # 2.0f

    .line 111
    .line 112
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v0, 0x40a00000    # 5.0f

    .line 116
    .line 117
    const/high16 v2, 0x40000000    # 2.0f

    .line 118
    .line 119
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 120
    .line 121
    .line 122
    const v17, 0x4081999a    # 4.05f

    .line 123
    .line 124
    .line 125
    const v18, 0x4053d70a    # 3.31f

    .line 126
    .line 127
    .line 128
    const v13, 0x408a3d71    # 4.32f

    .line 129
    .line 130
    .line 131
    const/high16 v14, 0x40000000    # 2.0f

    .line 132
    .line 133
    const v15, 0x4075c28f    # 3.84f

    .line 134
    .line 135
    .line 136
    const v16, 0x402a3d71    # 2.66f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x40b00000    # 5.5f

    .line 143
    .line 144
    const/high16 v18, 0x41400000    # 12.0f

    .line 145
    .line 146
    const v13, 0x4097ae14    # 4.74f

    .line 147
    .line 148
    .line 149
    const v14, 0x40ab851f    # 5.36f

    .line 150
    .line 151
    .line 152
    const/high16 v15, 0x40b00000    # 5.5f

    .line 153
    .line 154
    const v16, 0x4101999a    # 8.1f

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 158
    .line 159
    .line 160
    const v17, -0x40466666    # -1.45f

    .line 161
    .line 162
    .line 163
    const v18, 0x410b0a3d    # 8.69f

    .line 164
    .line 165
    .line 166
    const/4 v13, 0x0

    .line 167
    const v14, 0x4077ae14    # 3.87f

    .line 168
    .line 169
    .line 170
    const v15, -0x40bd70a4    # -0.76f

    .line 171
    .line 172
    .line 173
    const v16, 0x40d51eb8    # 6.66f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40a00000    # 5.0f

    .line 180
    .line 181
    const/high16 v18, 0x41b00000    # 22.0f

    .line 182
    .line 183
    const v13, 0x4075c28f    # 3.84f

    .line 184
    .line 185
    .line 186
    const v14, 0x41aab852    # 21.34f

    .line 187
    .line 188
    .line 189
    const v15, 0x408a3d71    # 4.32f

    .line 190
    .line 191
    .line 192
    const/high16 v16, 0x41b00000    # 22.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v0, 0x41600000    # 14.0f

    .line 198
    .line 199
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const v17, 0x3f733333    # 0.95f

    .line 203
    .line 204
    .line 205
    const v18, -0x405851ec    # -1.31f

    .line 206
    .line 207
    .line 208
    const v13, 0x3f2e147b    # 0.68f

    .line 209
    .line 210
    .line 211
    const/4 v14, 0x0

    .line 212
    const v15, 0x3f95c28f    # 1.17f

    .line 213
    .line 214
    .line 215
    const v16, -0x40d70a3d    # -0.66f

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, 0x41940000    # 18.5f

    .line 222
    .line 223
    const/high16 v18, 0x41400000    # 12.0f

    .line 224
    .line 225
    const v13, 0x419a28f6    # 19.27f

    .line 226
    .line 227
    .line 228
    const v14, 0x419547ae    # 18.66f

    .line 229
    .line 230
    .line 231
    const/high16 v15, 0x41940000    # 18.5f

    .line 232
    .line 233
    const v16, 0x417dc28f    # 15.86f

    .line 234
    .line 235
    .line 236
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    const/16 v16, 0x3800

    .line 247
    .line 248
    const/16 v17, 0x0

    .line 249
    .line 250
    const-string v4, ""

    .line 251
    .line 252
    const/high16 v6, 0x3f800000    # 1.0f

    .line 253
    .line 254
    const/4 v7, 0x0

    .line 255
    const/high16 v8, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/high16 v9, 0x3f800000    # 1.0f

    .line 258
    .line 259
    const/high16 v12, 0x3f800000    # 1.0f

    .line 260
    .line 261
    const/4 v13, 0x0

    .line 262
    const/4 v14, 0x0

    .line 263
    const/4 v15, 0x0

    .line 264
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    sput-object v0, Landroidx/compose/material/icons/twotone/PanoramaVerticalSelectKt;->_panoramaVerticalSelect:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 273
    .line 274
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    return-object v0
.end method

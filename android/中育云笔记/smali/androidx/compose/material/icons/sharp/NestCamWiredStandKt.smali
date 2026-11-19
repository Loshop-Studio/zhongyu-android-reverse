.class public final Landroidx/compose/material/icons/sharp/NestCamWiredStandKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _nestCamWiredStand:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNestCamWiredStand(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/NestCamWiredStandKt;->_nestCamWiredStand:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.NestCamWiredStand"

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
    const/high16 v0, 0x41900000    # 18.0f

    .line 71
    .line 72
    const v2, 0x3f59999a    # 0.85f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const v4, 0x413fae14    # 11.98f

    .line 79
    .line 80
    .line 81
    const v6, 0x3fb33333    # 1.4f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x40c147ae    # 6.04f

    .line 88
    .line 89
    .line 90
    const v18, 0x40e0f5c3    # 7.03f

    .line 91
    .line 92
    .line 93
    const v13, 0x410f3333    # 8.95f

    .line 94
    .line 95
    .line 96
    const v14, 0x3fd9999a    # 1.7f

    .line 97
    .line 98
    .line 99
    const v15, 0x40cbd70a    # 6.37f

    .line 100
    .line 101
    .line 102
    const/high16 v16, 0x40800000    # 4.0f

    .line 103
    .line 104
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const v17, 0x40b5c28f    # 5.68f

    .line 108
    .line 109
    .line 110
    const v18, 0x40e147ae    # 7.04f

    .line 111
    .line 112
    .line 113
    const v13, -0x413851ec    # -0.39f

    .line 114
    .line 115
    .line 116
    const v14, 0x40647ae1    # 3.57f

    .line 117
    .line 118
    .line 119
    const v15, 0x400ccccd    # 2.2f

    .line 120
    .line 121
    .line 122
    const v16, 0x40d6147b    # 6.69f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v4, 0x3ff33333    # 1.9f

    .line 129
    .line 130
    .line 131
    const v6, 0x3e428f5c    # 0.19f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v4, -0x40f0a3d7    # -0.56f

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const v17, -0x3fc9999a    # -2.85f

    .line 144
    .line 145
    .line 146
    const/high16 v18, 0x3e800000    # 0.25f

    .line 147
    .line 148
    const v13, -0x409eb852    # -0.88f

    .line 149
    .line 150
    .line 151
    const v14, -0x41bd70a4    # -0.19f

    .line 152
    .line 153
    .line 154
    const v15, -0x4015c28f    # -1.83f

    .line 155
    .line 156
    .line 157
    const v16, -0x41c7ae14    # -0.18f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const/high16 v17, 0x40e00000    # 7.0f

    .line 164
    .line 165
    const v18, 0x41a347ae    # 20.41f

    .line 166
    .line 167
    .line 168
    const v13, 0x41035c29    # 8.21f

    .line 169
    .line 170
    .line 171
    const v14, 0x4181ae14    # 16.21f

    .line 172
    .line 173
    .line 174
    const/high16 v15, 0x40e00000    # 7.0f

    .line 175
    .line 176
    const/high16 v16, 0x41920000    # 18.25f

    .line 177
    .line 178
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v4, 0x40e00000    # 7.0f

    .line 182
    .line 183
    const/high16 v6, 0x41b80000    # 23.0f

    .line 184
    .line 185
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x41200000    # 10.0f

    .line 189
    .line 190
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const/high16 v4, -0x3fc00000    # -3.0f

    .line 194
    .line 195
    invoke-virtual {v12, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x3ffa3d71    # -2.09f

    .line 199
    .line 200
    .line 201
    const v18, -0x3f7e147b    # -4.06f

    .line 202
    .line 203
    .line 204
    const/4 v13, 0x0

    .line 205
    const v14, -0x402a3d71    # -1.67f

    .line 206
    .line 207
    .line 208
    const v15, -0x40ab851f    # -0.83f

    .line 209
    .line 210
    .line 211
    const v16, -0x3fb66666    # -3.15f

    .line 212
    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const v4, 0x3f7851ec    # 0.97f

    .line 218
    .line 219
    .line 220
    const v6, -0x40466666    # -1.45f

    .line 221
    .line 222
    .line 223
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v4, 0x416b851f    # 14.72f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    const/16 v16, 0x3800

    .line 243
    .line 244
    const/16 v17, 0x0

    .line 245
    .line 246
    const-string v4, ""

    .line 247
    .line 248
    const/high16 v6, 0x3f800000    # 1.0f

    .line 249
    .line 250
    const/4 v7, 0x0

    .line 251
    const/high16 v8, 0x3f800000    # 1.0f

    .line 252
    .line 253
    const/high16 v9, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/high16 v12, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const/4 v15, 0x0

    .line 259
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    sput-object v0, Landroidx/compose/material/icons/sharp/NestCamWiredStandKt;->_nestCamWiredStand:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 268
    .line 269
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    return-object v0
.end method

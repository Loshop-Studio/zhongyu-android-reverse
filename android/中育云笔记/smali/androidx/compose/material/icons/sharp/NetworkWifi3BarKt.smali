.class public final Landroidx/compose/material/icons/sharp/NetworkWifi3BarKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _networkWifi3Bar:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getNetworkWifi3Bar(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/NetworkWifi3BarKt;->_networkWifi3Bar:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.NetworkWifi3Bar"

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
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

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
    sget-object v2, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v2, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

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
    const/high16 v2, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v4, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/16 v17, 0x0

    .line 78
    .line 79
    const v18, 0x410fae14    # 8.98f

    .line 80
    .line 81
    .line 82
    const v13, 0x40e9eb85    # 7.31f

    .line 83
    .line 84
    .line 85
    const/high16 v14, 0x40800000    # 4.0f

    .line 86
    .line 87
    const v15, 0x40447ae1    # 3.07f

    .line 88
    .line 89
    .line 90
    const v16, 0x40bccccd    # 5.9f

    .line 91
    .line 92
    .line 93
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const/high16 v2, 0x41a80000    # 21.0f

    .line 97
    .line 98
    invoke-virtual {v12, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 99
    .line 100
    .line 101
    const v2, 0x410fae14    # 8.98f

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 105
    .line 106
    .line 107
    const/high16 v17, 0x41400000    # 12.0f

    .line 108
    .line 109
    const/high16 v18, 0x40800000    # 4.0f

    .line 110
    .line 111
    const v13, 0x41a770a4    # 20.93f

    .line 112
    .line 113
    .line 114
    const v14, 0x40bccccd    # 5.9f

    .line 115
    .line 116
    .line 117
    const v15, 0x4185851f    # 16.69f

    .line 118
    .line 119
    .line 120
    const/high16 v16, 0x40800000    # 4.0f

    .line 121
    .line 122
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x403ae148    # 2.92f

    .line 129
    .line 130
    .line 131
    const v2, 0x41111eb8    # 9.07f

    .line 132
    .line 133
    .line 134
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v18, 0x40c00000    # 6.0f

    .line 138
    .line 139
    const v13, 0x40b051ec    # 5.51f

    .line 140
    .line 141
    .line 142
    const v14, 0x40e28f5c    # 7.08f

    .line 143
    .line 144
    .line 145
    const v15, 0x410ab852    # 8.67f

    .line 146
    .line 147
    .line 148
    const/high16 v16, 0x40c00000    # 6.0f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v4, 0x411147ae    # 9.08f

    .line 154
    .line 155
    .line 156
    const v6, 0x40447ae1    # 3.07f

    .line 157
    .line 158
    .line 159
    const v7, 0x40cfae14    # 6.49f

    .line 160
    .line 161
    .line 162
    const v8, 0x3f8a3d71    # 1.08f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v4, -0x3fc9999a    # -2.85f

    .line 169
    .line 170
    .line 171
    const v6, 0x40370a3d    # 2.86f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v18, 0x41200000    # 10.0f

    .line 178
    .line 179
    const v13, 0x4183ae14    # 16.46f

    .line 180
    .line 181
    .line 182
    const v14, 0x412b5c29    # 10.71f

    .line 183
    .line 184
    .line 185
    const v15, 0x4164f5c3    # 14.31f

    .line 186
    .line 187
    .line 188
    const/high16 v16, 0x41200000    # 10.0f

    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    const v17, -0x3f38a3d7    # -6.23f

    .line 194
    .line 195
    .line 196
    const v18, 0x3ff70a3d    # 1.93f

    .line 197
    .line 198
    .line 199
    const v13, -0x3fec28f6    # -2.31f

    .line 200
    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const v15, -0x3f7147ae    # -4.46f

    .line 204
    .line 205
    .line 206
    const v16, 0x3f35c28f    # 0.71f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const/16 v16, 0x3800

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const-string v4, ""

    .line 227
    .line 228
    const/high16 v6, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const/4 v7, 0x0

    .line 231
    const/high16 v8, 0x3f800000    # 1.0f

    .line 232
    .line 233
    const/high16 v9, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const/high16 v12, 0x3f800000    # 1.0f

    .line 236
    .line 237
    const/4 v13, 0x0

    .line 238
    const/4 v15, 0x0

    .line 239
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    sput-object v0, Landroidx/compose/material/icons/sharp/NetworkWifi3BarKt;->_networkWifi3Bar:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 248
    .line 249
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    return-object v0
.end method

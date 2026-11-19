.class public final Landroidx/compose/material/icons/sharp/WbCloudyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _wbCloudy:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getWbCloudy(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/WbCloudyKt;->_wbCloudy:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.WbCloudy"

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
    const v0, 0x419af5c3    # 19.37f

    .line 71
    .line 72
    .line 73
    const v2, 0x4120a3d7    # 10.04f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x414028f6    # 12.01f

    .line 80
    .line 81
    .line 82
    const/high16 v18, 0x40800000    # 4.0f

    .line 83
    .line 84
    const v13, 0x419570a4    # 18.68f

    .line 85
    .line 86
    .line 87
    const v14, 0x40d2e148    # 6.59f

    .line 88
    .line 89
    .line 90
    const v15, 0x417a6666    # 15.65f

    .line 91
    .line 92
    .line 93
    const/high16 v16, 0x40800000    # 4.0f

    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v17, -0x3f2b3333    # -6.65f

    .line 99
    .line 100
    .line 101
    const v18, 0x408147ae    # 4.04f

    .line 102
    .line 103
    .line 104
    const v13, -0x3fc70a3d    # -2.89f

    .line 105
    .line 106
    .line 107
    const/4 v14, 0x0

    .line 108
    const v15, -0x3f533333    # -5.4f

    .line 109
    .line 110
    .line 111
    const v16, 0x3fd1eb85    # 1.64f

    .line 112
    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v17, 0x3c23d70a    # 0.01f

    .line 118
    .line 119
    .line 120
    const/high16 v18, 0x41600000    # 14.0f

    .line 121
    .line 122
    const v13, 0x40166666    # 2.35f

    .line 123
    .line 124
    .line 125
    const v14, 0x4105c28f    # 8.36f

    .line 126
    .line 127
    .line 128
    const v15, 0x3c23d70a    # 0.01f

    .line 129
    .line 130
    .line 131
    const v16, 0x412e8f5c    # 10.91f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, 0x40c00000    # 6.0f

    .line 138
    .line 139
    const/high16 v18, 0x40c00000    # 6.0f

    .line 140
    .line 141
    const/4 v13, 0x0

    .line 142
    const v14, 0x4053d70a    # 3.31f

    .line 143
    .line 144
    .line 145
    const v15, 0x402c28f6    # 2.69f

    .line 146
    .line 147
    .line 148
    const/high16 v16, 0x40c00000    # 6.0f

    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const/high16 v0, 0x41500000    # 13.0f

    .line 154
    .line 155
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v17, 0x40a00000    # 5.0f

    .line 159
    .line 160
    const/high16 v18, -0x3f600000    # -5.0f

    .line 161
    .line 162
    const v13, 0x4030a3d7    # 2.76f

    .line 163
    .line 164
    .line 165
    const/4 v14, 0x0

    .line 166
    const/high16 v15, 0x40a00000    # 5.0f

    .line 167
    .line 168
    const v16, -0x3ff0a3d7    # -2.24f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const v17, -0x3f6b851f    # -4.64f

    .line 175
    .line 176
    .line 177
    const v18, -0x3f6147ae    # -4.96f

    .line 178
    .line 179
    .line 180
    const/4 v13, 0x0

    .line 181
    const v14, -0x3fd70a3d    # -2.64f

    .line 182
    .line 183
    .line 184
    const v15, -0x3ffccccd    # -2.05f

    .line 185
    .line 186
    .line 187
    const v16, -0x3f670a3d    # -4.78f

    .line 188
    .line 189
    .line 190
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    const/16 v16, 0x3800

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const-string v4, ""

    .line 205
    .line 206
    const/high16 v6, 0x3f800000    # 1.0f

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    const/high16 v8, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/high16 v9, 0x3f800000    # 1.0f

    .line 212
    .line 213
    const/high16 v12, 0x3f800000    # 1.0f

    .line 214
    .line 215
    const/4 v14, 0x0

    .line 216
    const/4 v15, 0x0

    .line 217
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sput-object v0, Landroidx/compose/material/icons/sharp/WbCloudyKt;->_wbCloudy:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 226
    .line 227
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-object v0
.end method

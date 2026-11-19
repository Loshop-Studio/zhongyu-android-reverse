.class public final Landroidx/compose/material/icons/rounded/BedtimeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _bedtime:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBedtime(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/BedtimeKt;->_bedtime:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Bedtime"

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
    const v0, 0x413a6666    # 11.65f

    .line 71
    .line 72
    .line 73
    const v2, 0x405d70a4    # 3.46f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, -0x4070a3d7    # -1.12f

    .line 80
    .line 81
    .line 82
    const v18, -0x40547ae1    # -1.34f

    .line 83
    .line 84
    .line 85
    const v13, 0x3e8a3d71    # 0.27f

    .line 86
    .line 87
    .line 88
    const v14, -0x40ca3d71    # -0.71f

    .line 89
    .line 90
    .line 91
    const v15, -0x4147ae14    # -0.36f

    .line 92
    .line 93
    .line 94
    const v16, -0x40466666    # -1.45f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v17, -0x3efa8f5c    # -8.34f

    .line 101
    .line 102
    .line 103
    const v18, 0x413e147b    # 11.88f

    .line 104
    .line 105
    .line 106
    const v13, -0x3f4f5c29    # -5.52f

    .line 107
    .line 108
    .line 109
    const v14, 0x3f4ccccd    # 0.8f

    .line 110
    .line 111
    .line 112
    const v15, -0x3ee87ae1    # -9.47f

    .line 113
    .line 114
    .line 115
    const v16, 0x40c23d71    # 6.07f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v17, 0x41023d71    # 8.14f

    .line 122
    .line 123
    .line 124
    const v18, 0x40fbd70a    # 7.87f

    .line 125
    .line 126
    .line 127
    const v13, 0x3f47ae14    # 0.78f

    .line 128
    .line 129
    .line 130
    const v14, 0x4080a3d7    # 4.02f

    .line 131
    .line 132
    .line 133
    const v15, 0x4082e148    # 4.09f

    .line 134
    .line 135
    .line 136
    const v16, 0x40e6b852    # 7.21f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v17, 0x41151eb8    # 9.32f

    .line 143
    .line 144
    .line 145
    const v18, -0x3fa3d70a    # -3.44f

    .line 146
    .line 147
    .line 148
    const v13, 0x406f5c29    # 3.74f

    .line 149
    .line 150
    .line 151
    const v14, 0x3f1c28f6    # 0.61f

    .line 152
    .line 153
    .line 154
    const v15, 0x40e51eb8    # 7.16f

    .line 155
    .line 156
    .line 157
    const v16, -0x40a147ae    # -0.87f

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v17, -0x40f33333    # -0.55f

    .line 164
    .line 165
    .line 166
    const v18, -0x4030a3d7    # -1.62f

    .line 167
    .line 168
    .line 169
    const v13, 0x3ef5c28f    # 0.48f

    .line 170
    .line 171
    .line 172
    const v14, -0x40ee147b    # -0.57f

    .line 173
    .line 174
    .line 175
    const v15, 0x3e428f5c    # 0.19f

    .line 176
    .line 177
    .line 178
    const v16, -0x40428f5c    # -1.48f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const v17, 0x413a6666    # 11.65f

    .line 185
    .line 186
    .line 187
    const v18, 0x405d70a4    # 3.46f

    .line 188
    .line 189
    .line 190
    const v13, 0x415147ae    # 13.08f

    .line 191
    .line 192
    .line 193
    const v14, 0x417a8f5c    # 15.66f

    .line 194
    .line 195
    .line 196
    const v15, 0x4116b852    # 9.42f

    .line 197
    .line 198
    .line 199
    const v16, 0x411451ec    # 9.27f

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    const/16 v16, 0x3800

    .line 213
    .line 214
    const/16 v17, 0x0

    .line 215
    .line 216
    const-string v4, ""

    .line 217
    .line 218
    const/high16 v6, 0x3f800000    # 1.0f

    .line 219
    .line 220
    const/4 v7, 0x0

    .line 221
    const/high16 v8, 0x3f800000    # 1.0f

    .line 222
    .line 223
    const/high16 v9, 0x3f800000    # 1.0f

    .line 224
    .line 225
    const/high16 v12, 0x3f800000    # 1.0f

    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const/4 v14, 0x0

    .line 229
    const/4 v15, 0x0

    .line 230
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    sput-object v0, Landroidx/compose/material/icons/rounded/BedtimeKt;->_bedtime:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 239
    .line 240
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return-object v0
.end method
